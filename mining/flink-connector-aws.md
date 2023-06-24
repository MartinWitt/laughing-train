# flink-connector-aws 
 
# Bad smells
I found 140 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 20 | false |
| UNCHECKED_WARNING | 19 | false |
| Deprecation | 18 | false |
| FieldCanBeLocal | 10 | false |
| IgnoreResultOfCall | 8 | false |
| FieldMayBeFinal | 8 | false |
| UnnecessaryToStringCall | 7 | true |
| DataFlowIssue | 6 | false |
| RegExpSimplifiable | 5 | false |
| DeprecatedIsStillUsed | 4 | false |
| NullableProblems | 4 | false |
| JavadocLinkAsPlainText | 4 | false |
| PlaceholderCountMatchesArgumentCount | 2 | false |
| CommentedOutCode | 2 | false |
| NonFinalFieldInEnum | 2 | false |
| DuplicatedCode | 2 | false |
| TrivialIf | 2 | false |
| AutoCloseableResource | 2 | false |
| BusyWait | 2 | false |
| PointlessArithmeticExpression | 1 | false |
| JavadocReference | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| EmptyStatementBody | 1 | false |
| TypeParameterHidesVisibleType | 1 | false |
| MismatchedJavadocCode | 1 | false |
| ReactiveStreamsSubscriberImplementation | 1 | false |
| SimplifiableConditionalExpression | 1 | false |
| TrivialStringConcatenation | 1 | false |
| DanglingJavadoc | 1 | false |
| StringConcatenationInLoops | 1 | false |
| UnusedAssignment | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `flink-formats-aws/flink-json-glue-schema-registry/src/main/java/org/apache/flink/formats/json/glue/schema/registry/GlueSchemaRegistryJsonDeserializationSchema.java`
#### Snippet
```java
            glueSchemaRegistryJsonSchemaCoder = glueSchemaRegistryJsonSchemaCoderProvider.get();
        }
        return (T) glueSchemaRegistryJsonSchemaCoder.deserialize(bytes);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'software.amazon.awssdk.enhanced.dynamodb.EnhancedType' to 'software.amazon.awssdk.enhanced.dynamodb.EnhancedType'
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/converter/ArrayAttributeConverterProvider.java`
#### Snippet
```java
        return new ArrayAttributeConverter<>(
                defaultAttributeConverterProvider.converterFor(EnhancedType.of(clazz)),
                (EnhancedType<R[]>) enhancedType);
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.connector.dynamodb.table.converter.ArrayAttributeConverter' to 'software.amazon.awssdk.enhanced.dynamodb.AttributeConverter'
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/converter/ArrayAttributeConverterProvider.java`
#### Snippet
```java
    public <T> AttributeConverter<T> converterFor(EnhancedType<T> enhancedType) {
        if (enhancedType.equals(EnhancedType.of(String[].class))) {
            return (AttributeConverter<T>) getArrayAttributeConverter(String.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(Boolean[].class))) {
            return (AttributeConverter<T>) getArrayAttributeConverter(Boolean.class, enhancedType);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.connector.dynamodb.table.converter.ArrayAttributeConverter' to 'software.amazon.awssdk.enhanced.dynamodb.AttributeConverter'
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/converter/ArrayAttributeConverterProvider.java`
#### Snippet
```java
            return (AttributeConverter<T>) getArrayAttributeConverter(String.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(Boolean[].class))) {
            return (AttributeConverter<T>) getArrayAttributeConverter(Boolean.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(BigDecimal[].class))) {
            return (AttributeConverter<T>)
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.connector.dynamodb.table.converter.ArrayAttributeConverter' to 'software.amazon.awssdk.enhanced.dynamodb.AttributeConverter'
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/converter/ArrayAttributeConverterProvider.java`
#### Snippet
```java
            return (AttributeConverter<T>) getArrayAttributeConverter(Boolean.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(BigDecimal[].class))) {
            return (AttributeConverter<T>)
                    getArrayAttributeConverter(BigDecimal.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(Byte[].class))) {
            return (AttributeConverter<T>) getArrayAttributeConverter(Byte.class, enhancedType);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.connector.dynamodb.table.converter.ArrayAttributeConverter' to 'software.amazon.awssdk.enhanced.dynamodb.AttributeConverter'
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/converter/ArrayAttributeConverterProvider.java`
#### Snippet
```java
                    getArrayAttributeConverter(BigDecimal.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(Byte[].class))) {
            return (AttributeConverter<T>) getArrayAttributeConverter(Byte.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(Double[].class))) {
            return (AttributeConverter<T>) getArrayAttributeConverter(Double.class, enhancedType);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.connector.dynamodb.table.converter.ArrayAttributeConverter' to 'software.amazon.awssdk.enhanced.dynamodb.AttributeConverter'
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/converter/ArrayAttributeConverterProvider.java`
#### Snippet
```java
            return (AttributeConverter<T>) getArrayAttributeConverter(Byte.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(Double[].class))) {
            return (AttributeConverter<T>) getArrayAttributeConverter(Double.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(Short[].class))) {
            return (AttributeConverter<T>) getArrayAttributeConverter(Short.class, enhancedType);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.connector.dynamodb.table.converter.ArrayAttributeConverter' to 'software.amazon.awssdk.enhanced.dynamodb.AttributeConverter'
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/converter/ArrayAttributeConverterProvider.java`
#### Snippet
```java
            return (AttributeConverter<T>) getArrayAttributeConverter(Double.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(Short[].class))) {
            return (AttributeConverter<T>) getArrayAttributeConverter(Short.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(Integer[].class))) {
            return (AttributeConverter<T>) getArrayAttributeConverter(Integer.class, enhancedType);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.connector.dynamodb.table.converter.ArrayAttributeConverter' to 'software.amazon.awssdk.enhanced.dynamodb.AttributeConverter'
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/converter/ArrayAttributeConverterProvider.java`
#### Snippet
```java
            return (AttributeConverter<T>) getArrayAttributeConverter(Short.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(Integer[].class))) {
            return (AttributeConverter<T>) getArrayAttributeConverter(Integer.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(Long[].class))) {
            return (AttributeConverter<T>) getArrayAttributeConverter(Long.class, enhancedType);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.connector.dynamodb.table.converter.ArrayAttributeConverter' to 'software.amazon.awssdk.enhanced.dynamodb.AttributeConverter'
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/converter/ArrayAttributeConverterProvider.java`
#### Snippet
```java
            return (AttributeConverter<T>) getArrayAttributeConverter(Integer.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(Long[].class))) {
            return (AttributeConverter<T>) getArrayAttributeConverter(Long.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(Float[].class))) {
            return (AttributeConverter<T>) getArrayAttributeConverter(Float.class, enhancedType);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.connector.dynamodb.table.converter.ArrayAttributeConverter' to 'software.amazon.awssdk.enhanced.dynamodb.AttributeConverter'
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/converter/ArrayAttributeConverterProvider.java`
#### Snippet
```java
            return (AttributeConverter<T>) getArrayAttributeConverter(Long.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(Float[].class))) {
            return (AttributeConverter<T>) getArrayAttributeConverter(Float.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(LocalDate[].class))) {
            return (AttributeConverter<T>)
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.connector.dynamodb.table.converter.ArrayAttributeConverter' to 'software.amazon.awssdk.enhanced.dynamodb.AttributeConverter'
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/converter/ArrayAttributeConverterProvider.java`
#### Snippet
```java
            return (AttributeConverter<T>) getArrayAttributeConverter(Float.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(LocalDate[].class))) {
            return (AttributeConverter<T>)
                    getArrayAttributeConverter(LocalDate.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(LocalTime[].class))) {
            return (AttributeConverter<T>)
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.connector.dynamodb.table.converter.ArrayAttributeConverter' to 'software.amazon.awssdk.enhanced.dynamodb.AttributeConverter'
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/converter/ArrayAttributeConverterProvider.java`
#### Snippet
```java
                    getArrayAttributeConverter(LocalDate.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(LocalTime[].class))) {
            return (AttributeConverter<T>)
                    getArrayAttributeConverter(LocalTime.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(LocalDateTime[].class))) {
            return (AttributeConverter<T>)
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.connector.dynamodb.table.converter.ArrayAttributeConverter' to 'software.amazon.awssdk.enhanced.dynamodb.AttributeConverter'
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/converter/ArrayAttributeConverterProvider.java`
#### Snippet
```java
                    getArrayAttributeConverter(LocalTime.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(LocalDateTime[].class))) {
            return (AttributeConverter<T>)
                    getArrayAttributeConverter(LocalDateTime.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(Instant[].class))) {
            return (AttributeConverter<T>) getArrayAttributeConverter(Instant.class, enhancedType);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.connector.dynamodb.table.converter.ArrayAttributeConverter' to 'software.amazon.awssdk.enhanced.dynamodb.AttributeConverter'
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/converter/ArrayAttributeConverterProvider.java`
#### Snippet
```java
                    getArrayAttributeConverter(LocalDateTime.class, enhancedType);
        } else if (enhancedType.equals(EnhancedType.of(Instant[].class))) {
            return (AttributeConverter<T>) getArrayAttributeConverter(Instant.class, enhancedType);
        }
        return null;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.apache.flink.connector.kinesis.sink.PartitionKeyGenerator'
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/KinesisDynamicTableSinkFactory.java`
#### Snippet
```java
                .setConsumedDataType(factoryContext.getPhysicalDataType())
                .setPartitioner(
                        (PartitionKeyGenerator<RowData>) properties.get(SINK_PARTITIONER.key()));
        addAsyncOptionsToBuilder(properties, builder);
        Optional.ofNullable((Boolean) properties.get(SINK_FAIL_ON_ERROR.key()))
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.streaming.connectors.kinesis.serialization.KinesisDeserializationSchema' to 'org.apache.flink.streaming.connectors.kinesis.serialization.KinesisDeserializationSchema'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkDynamoDBStreamsConsumer.java`
#### Snippet
```java
    public FlinkDynamoDBStreamsConsumer(
            List<String> streams, KinesisDeserializationSchema deserializer, Properties config) {
        super(streams, deserializer, config);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'software.amazon.awssdk.enhanced.dynamodb.EnhancedType\>' to 'software.amazon.awssdk.enhanced.dynamodb.EnhancedType'
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/RowDataToAttributeValueConverter.java`
#### Snippet
```java
    private <T> EnhancedType<T> getEnhancedType(DataType dataType) {
        if (dataType instanceof KeyValueDataType) {
            return (EnhancedType<T>)
                    EnhancedType.mapOf(
                            getEnhancedType(((KeyValueDataType) dataType).getKeyDataType()),
                            getEnhancedType(((KeyValueDataType) dataType).getValueDataType()));
        } else {
            return (EnhancedType<T>) EnhancedType.of(dataType.getConversionClass());
```

### UNCHECKED_WARNING
Unchecked cast: 'software.amazon.awssdk.enhanced.dynamodb.EnhancedType\>' to 'software.amazon.awssdk.enhanced.dynamodb.EnhancedType'
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/RowDataToAttributeValueConverter.java`
#### Snippet
```java
                            getEnhancedType(((KeyValueDataType) dataType).getValueDataType()));
        } else {
            return (EnhancedType<T>) EnhancedType.of(dataType.getConversionClass());
        }
    }
```

## RuleId[id=PointlessArithmeticExpression]
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

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `DEFAULT_SHARD_ASSIGNER`
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/UniformShardAssigner.java`
#### Snippet
```java
 * A {@link KinesisShardAssigner} that maps Kinesis shard hash-key ranges to Flink subtasks. It
 * creates a more uniform distribution of shards across subtasks than {@link
 * org.apache.flink.streaming.connectors.kinesis.internals.KinesisDataFetcher#DEFAULT_SHARD_ASSIGNER}
 * when the Kinesis records in the stream have hash keys that are uniformly distributed over all
 * possible hash keys, which is the case if records have randomly-generated partition keys. (This is
```

## RuleId[id=ManualArrayToCollectionCopy]
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

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `flink-formats-aws/flink-json-glue-schema-registry/src/main/java/org/apache/flink/formats/json/glue/schema/registry/GlueSchemaRegistryJsonSerializationSchema.java`
#### Snippet
```java

        if (glueSchemaRegistryJsonSchemaCoder == null) {
            glueSchemaRegistryJsonSchemaCoder = glueSchemaRegistryJsonSchemaCoderProvider.get();
        }
        return glueSchemaRegistryJsonSchemaCoder.registerSchemaAndSerialize(object);
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `flink-formats-aws/flink-json-glue-schema-registry/src/main/java/org/apache/flink/formats/json/glue/schema/registry/GlueSchemaRegistryJsonDeserializationSchema.java`
#### Snippet
```java

        if (glueSchemaRegistryJsonSchemaCoder == null) {
            glueSchemaRegistryJsonSchemaCoder = glueSchemaRegistryJsonSchemaCoderProvider.get();
        }
        return (T) glueSchemaRegistryJsonSchemaCoder.deserialize(bytes);
```

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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`for` statement has empty body
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/KinesisExampleTest.java`
#### Snippet
```java
        };

        for (String expectedResult : expectedResults) {
            //            Validate.isTrue(
            //                    results.contains(expectedResult), "Expecting to receive " +
```

## RuleId[id=TypeParameterHidesVisibleType]
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

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `flink-connector-aws-base/src/main/java/org/apache/flink/connector/aws/util/AWSGeneralUtil.java`
#### Snippet
```java
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            LOG.error(
                    "Failed to find the specified custom AWS credentials provider {} {}",
                    e.getMessage(),
                    e);
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `flink-connector-aws-base/src/main/java/org/apache/flink/connector/aws/util/AWSGeneralUtil.java`
#### Snippet
```java
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            LOG.error(
                    "Failed to instantiate the specified custom AWS credentials provider {} {}",
                    e.getMessage(),
                    e);
```

## RuleId[id=CommentedOutCode]
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

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `sentinel` in enum 'SentinelSequenceNumber'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/model/SentinelSequenceNumber.java`
#### Snippet
```java
    SENTINEL_SHARD_ENDING_SEQUENCE_NUM(new SequenceNumber("SHARD_ENDING_SEQUENCE_NUM"));

    private SequenceNumber sentinel;

    SentinelSequenceNumber(SequenceNumber sentinel) {
```

### NonFinalFieldInEnum
Non-final field `sentinelSequenceNumber` in enum 'InitialPosition'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/config/ConsumerConfigConstants.java`
#### Snippet
```java
        AT_TIMESTAMP(SentinelSequenceNumber.SENTINEL_AT_TIMESTAMP_SEQUENCE_NUM);

        private SentinelSequenceNumber sentinelSequenceNumber;

        InitialPosition(SentinelSequenceNumber sentinelSequenceNumber) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java`
#### Snippet
```java
        StreamShardMetadata streamShardMetadata = new StreamShardMetadata();

        streamShardMetadata.setStreamName(streamShardHandle.getStreamName());
        streamShardMetadata.setShardId(streamShardHandle.getShard().getShardId());
        streamShardMetadata.setParentShardId(streamShardHandle.getShard().getParentShardId());
        streamShardMetadata.setAdjacentParentShardId(
                streamShardHandle.getShard().getAdjacentParentShardId());

        if (streamShardHandle.getShard().getHashKeyRange() != null) {
            streamShardMetadata.setStartingHashKey(
                    streamShardHandle.getShard().getHashKeyRange().getStartingHashKey());
            streamShardMetadata.setEndingHashKey(
                    streamShardHandle.getShard().getHashKeyRange().getEndingHashKey());
        }

        if (streamShardHandle.getShard().getSequenceNumberRange() != null) {
            streamShardMetadata.setStartingSequenceNumber(
                    streamShardHandle
                            .getShard()
                            .getSequenceNumberRange()
                            .getStartingSequenceNumber());
            streamShardMetadata.setEndingSequenceNumber(
                    streamShardHandle
                            .getShard()
                            .getSequenceNumberRange()
                            .getEndingSequenceNumber());
        }

        return streamShardMetadata;
```

### DuplicatedCode
Duplicated code
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/proxy/DynamoDBStreamsProxy.java`
#### Snippet
```java
        GetShardListResult result = new GetShardListResult();

        for (Map.Entry<String, String> streamNameWithLastSeenShardId :
                streamNamesWithLastSeenShardIds.entrySet()) {
            String stream = streamNameWithLastSeenShardId.getKey();
            String lastSeenShardId = streamNameWithLastSeenShardId.getValue();
            result.addRetrievedShardsToStream(stream, getShardsOfStream(stream, lastSeenShardId));
        }
        return result;
```

## RuleId[id=RegExpSimplifiable]
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

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'false' but there's no such enum constant in RecordPublisherRunResult
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/fanout/FanOutShardSubscriber.java`
#### Snippet
```java
     * Obtains a subscription to the shard from the specified {@code startingPosition}. {@link
     * SubscribeToShardEvent} received from KDS are delivered to the given {@code eventConsumer}.
     * Returns false if there are records left to consume from the shard.
     *
     * @param startingPosition the position in the stream in which to start receiving records
```

## RuleId[id=ReactiveStreamsSubscriberImplementation]
### ReactiveStreamsSubscriberImplementation
Class implements Subscriber
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/fanout/FanOutShardSubscriber.java`
#### Snippet
```java
     * KinesisAsyncClient}.
     */
    private class FanOutShardSubscription implements Subscriber<SubscribeToShardEventStream> {

        private Subscription subscription;
```

## RuleId[id=Deprecation]
### Deprecation
'org.apache.flink.streaming.api.TimeCharacteristic' is deprecated
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/ShardConsumer.java`
#### Snippet
```java
     *
     * <p>Note that the server-side Kinesis timestamp is attached to the record when collected. When
     * the user programs uses {@link TimeCharacteristic#EventTime}, this timestamp will be used by
     * default.
     *
```

### Deprecation
'setStreamName(java.lang.String)' is deprecated
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/KinesisDynamicSink.java`
#### Snippet
```java
                        .setPartitionKeyGenerator(partitioner)
                        .setKinesisClientProperties(kinesisClientProperties)
                        .setStreamName(stream);

        Optional.ofNullable(failOnError).ifPresent(builder::setFailOnError);
```

### Deprecation
'org.apache.flink.streaming.api.functions.AssignerWithPeriodicWatermarks' is deprecated
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisConsumer.java`
#### Snippet
```java
     */
    public void setPeriodicWatermarkAssigner(
            AssignerWithPeriodicWatermarks<T> periodicWatermarkAssigner) {
        this.periodicWatermarkAssigner = periodicWatermarkAssigner;
        ClosureCleaner.clean(
```

### Deprecation
'org.apache.flink.streaming.api.functions.AssignerWithPeriodicWatermarks' is deprecated
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisConsumer.java`
#### Snippet
```java
    }

    public AssignerWithPeriodicWatermarks<T> getPeriodicWatermarkAssigner() {
        return periodicWatermarkAssigner;
    }
```

### Deprecation
'org.apache.flink.streaming.api.functions.AssignerWithPeriodicWatermarks' is deprecated
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisConsumer.java`
#### Snippet
```java
 *
 * <p>In order for the consumer to emit watermarks, a timestamp assigner needs to be set via {@link
 * #setPeriodicWatermarkAssigner(AssignerWithPeriodicWatermarks)} and the auto watermark emit
 * interval configured via {@link
 * org.apache.flink.api.common.ExecutionConfig#setAutoWatermarkInterval(long)}.
```

### Deprecation
'org.apache.flink.streaming.api.functions.AssignerWithPeriodicWatermarks' is deprecated
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisConsumer.java`
#### Snippet
```java
            new DefaultShardAssignerFactory().getShardAssigner();

    private AssignerWithPeriodicWatermarks<T> periodicWatermarkAssigner;
    private WatermarkTracker watermarkTracker;

```

### Deprecation
'org.apache.flink.streaming.api.functions.AssignerWithPeriodicWatermarks' is deprecated
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/CustomWatermarkExtractor.java`
#### Snippet
```java

/**
 * A custom {@link AssignerWithPeriodicWatermarks}, that simply assumes that the input stream
 * records are strictly ascending.
 *
```

### Deprecation
'org.apache.flink.streaming.api.functions.timestamps.AscendingTimestampExtractor' is deprecated
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/CustomWatermarkExtractor.java`
#### Snippet
```java
 *
 * <p>Flink also ships some built-in convenience assigners, such as the {@link
 * BoundedOutOfOrdernessTimestampExtractor} and {@link AscendingTimestampExtractor}
 */
public class CustomWatermarkExtractor implements AssignerWithPeriodicWatermarks<Event> {
```

### Deprecation
'org.apache.flink.streaming.api.functions.AssignerWithPeriodicWatermarks' is deprecated
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/CustomWatermarkExtractor.java`
#### Snippet
```java
 * BoundedOutOfOrdernessTimestampExtractor} and {@link AscendingTimestampExtractor}
 */
public class CustomWatermarkExtractor implements AssignerWithPeriodicWatermarks<Event> {

    private static final long serialVersionUID = -742759155861320823L;
```

### Deprecation
'org.apache.flink.streaming.connectors.kinesis.FlinkKinesisProducer' is deprecated
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/KinesisExample.java`
#### Snippet
```java
        }

        FlinkKinesisProducer<Event> producer =
                new FlinkKinesisProducer<>(new EventSchema(), producerProperties);
        producer.setDefaultStream(outputStream);
```

### Deprecation
'org.apache.flink.streaming.connectors.kinesis.FlinkKinesisProducer' is deprecated
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/KinesisExample.java`
#### Snippet
```java

        FlinkKinesisProducer<Event> producer =
                new FlinkKinesisProducer<>(new EventSchema(), producerProperties);
        producer.setDefaultStream(outputStream);
        producer.setDefaultPartition("fakePartition");
```

### Deprecation
'keyBy(java.lang.String...)' is deprecated
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/KinesisExample.java`
#### Snippet
```java

        DataStream<Event> input =
                env.addSource(consumer).keyBy("word").map(new RollingAdditionMapper());

        input.addSink(producer);
```

### Deprecation
'org.apache.flink.streaming.connectors.kinesis.FlinkKinesisProducer' is deprecated
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/KinesisConfigUtil.java`
#### Snippet
```java

    /**
     * Validate configuration properties for {@link FlinkKinesisProducer}, and return a constructed
     * KinesisProducerConfiguration.
     */
```

### Deprecation
'AsyncSinkWriter(org.apache.flink.connector.base.sink.writer.ElementConverter, org.apache.flink.api.connector.sink2.Sink.InitContext, int, int, int, long, long, ...)' is deprecated
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/sink/DynamoDbSinkWriter.java`
#### Snippet
```java
            SdkClientProvider<DynamoDbAsyncClient> clientProvider,
            Collection<BufferedRequestState<DynamoDbWriteRequest>> states) {
        super(
                elementConverter,
                context,
```

### Deprecation
'org.apache.flink.streaming.api.functions.AssignerWithPeriodicWatermarks' is deprecated
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java`
#### Snippet
```java
            final KinesisDeserializationSchema<T> deserializationSchema,
            final KinesisShardAssigner shardAssigner,
            final AssignerWithPeriodicWatermarks<T> periodicWatermarkAssigner,
            final WatermarkTracker watermarkTracker,
            final AtomicReference<Throwable> error,
```

### Deprecation
'org.apache.flink.streaming.api.functions.AssignerWithPeriodicWatermarks' is deprecated
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java`
#### Snippet
```java
            final KinesisDeserializationSchema<T> deserializationSchema,
            final KinesisShardAssigner shardAssigner,
            final AssignerWithPeriodicWatermarks<T> periodicWatermarkAssigner,
            final WatermarkTracker watermarkTracker) {
        this(
```

### Deprecation
'org.apache.flink.streaming.api.functions.AssignerWithPeriodicWatermarks' is deprecated
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java`
#### Snippet
```java
    private volatile boolean running = true;

    private final AssignerWithPeriodicWatermarks<T> periodicWatermarkAssigner;
    private final WatermarkTracker watermarkTracker;
    private final RecordEmitter recordEmitter;
```

### Deprecation
'org.apache.flink.streaming.api.functions.AssignerWithPeriodicWatermarks' is deprecated
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java`
#### Snippet
```java
    /** Per shard tracking of watermark and last activity. */
    private static class ShardWatermarkState<T> {
        private AssignerWithPeriodicWatermarks<T> periodicWatermarkAssigner;
        private RecordEmitter.RecordQueue<RecordWrapper<T>> emitQueue;
        private volatile long lastRecordTimestamp;
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`shardId == null ? false : shardId.matches("^shardId-\\d{20}-{0,1}\\w{0,36}")` can be simplified to 'shardId!=null \&\& shardId.matches("\^shardId-\\\\d{20}-{0,1}\\\\w{0,36}")'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/model/DynamoDBStreamsShardHandle.java`
#### Snippet
```java
     */
    public static boolean isValidShardId(String shardId) {
        return shardId == null ? false : shardId.matches("^shardId-\\d{20}-{0,1}\\w{0,36}");
    }
}
```

## RuleId[id=UnnecessaryToStringCall]
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
                }
                throw new IllegalArgumentException(
                        "Invalid AWS region set in config. Valid values are: " + sb.toString());
            }
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
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java`
#### Snippet
```java
                    "Subtask {} has failed to find any shards for the following subscribed streams: {}",
                    indexOfThisConsumerSubtask,
                    streamsWithNoShardsFound.toString());
        }

```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/KinesisDynamicSink.java`
#### Snippet
```java
        } else {
            String msg =
                    ""
                            + "Cannot apply static partition optimization to a partition class "
                            + "that does not inherit from "
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/serialization/KinesisDeserializationSchema.java`
#### Snippet
```java
            throws IOException;

    /**
     * Method to decide whether the element signals the end of the stream. If true is returned the
     * element won't be emitted.
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/source/enumerator/KinesisStreamsSourceEnumeratorState.java`
#### Snippet
```java
public class KinesisStreamsSourceEnumeratorState {
    private final Set<KinesisShardSplit> unassignedSplits;
    @Nullable private final String lastSeenShardId;

    public KinesisStreamsSourceEnumeratorState(
```

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

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisProducer.java`
#### Snippet
```java

                    @Override
                    public void onFailure(Throwable t) {
                        backpressureLatch.trigger();
                        if (failOnError) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java`
#### Snippet
```java

                    @Override
                    public Thread newThread(Runnable runnable) {
                        Thread thread = new Thread(runnable);
                        thread.setName(
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/BeanDeserializerModifierForIgnorables.java`
#### Snippet
```java
 *
 * <p>Original source:
 * https://stackoverflow.com/questions/12305438/jackson-dynamic-filtering-of-properties-during-deserialization
 */
public class BeanDeserializerModifierForIgnorables extends BeanDeserializerModifier {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-connector-aws-e2e-tests/flink-connector-kinesis-e2e-tests/src/main/java/org/apache/flink/streaming/kinesis/test/KinesisExample.java`
#### Snippet
```java
 *
 * <p>Example usage: --input-stream test-input --output-stream test-output --aws.endpoint
 * https://localhost:4567 --flink.stream.initpos TRIM_HORIZON
 */
public class KinesisExample {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/RowDataFieldsKinesisPartitionKeyGenerator.java`
#### Snippet
```java
     *
     * @link
     *     https://docs.aws.amazon.com/kinesis/latest/APIReference/API_PutRecord.html#API_PutRecord_RequestSyntax
     */
    public static final int MAX_PARTITION_KEY_LENGTH = 256;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/model/DynamoDBStreamsShardHandle.java`
#### Snippet
```java
    /**
     * Dynamodb streams shard ID is a char string ranging from 28 characters to 65 characters. (See
     * https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_Shard.html)
     *
     * <p>The shardId observed usually takes the format of: "shardId-00000001536805703746-69688cb1",
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/DynamoDbConfiguration.java`
#### Snippet
```java
public class DynamoDbConfiguration {

    private final Map<String, String> rawTableOptions;
    private final ReadableConfig tableOptions;
    private final AsyncSinkConfigurationValidator asyncSinkConfigurationValidator;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/table/util/KinesisFirehoseConnectorOptionUtils.java`
#### Snippet
```java
    private final AsyncSinkConfigurationValidator asyncSinkConfigurationValidator;
    private final AsyncClientOptionsUtils asyncClientOptionsUtils;
    private final Map<String, String> resolvedOptions;
    private final ReadableConfig tableOptions;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/RecordEmitter.java`
#### Snippet
```java
    private volatile long maxEmitTimestamp = Long.MAX_VALUE;
    private long maxLookaheadMillis = 60 * 1000; // one minute
    private long idleSleepMillis = 100;
    private final Object condition = new Object();

```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-aws-kinesis-firehose/src/main/java/org/apache/flink/connector/firehose/sink/KinesisFirehoseSinkWriter.java`
#### Snippet
```java

    /* The sink writer metric group */
    private final SinkWriterMetricGroup metrics;

    /* The asynchronous http client */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/proxy/KinesisProxyAsyncV2.java`
#### Snippet
```java
    private final SdkAsyncHttpClient asyncHttpClient;

    private final FanOutRecordPublisherConfiguration fanOutRecordPublisherConfiguration;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/table/KinesisConnectorOptionsUtil.java`
#### Snippet
```java
    private final KinesisConsumerOptionsUtil kinesisConsumerOptionsUtil;
    private final Map<String, String> resolvedOptions;
    private final ReadableConfig tableOptions;

    public KinesisConnectorOptionsUtil(Map<String, String> options, ReadableConfig tableOptions) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/table/KinesisConnectorOptionsUtil.java`
#### Snippet
```java

    private final KinesisConsumerOptionsUtil kinesisConsumerOptionsUtil;
    private final Map<String, String> resolvedOptions;
    private final ReadableConfig tableOptions;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/sink/KinesisStreamsSinkWriter.java`
#### Snippet
```java

    /* The sink writer metric group */
    private final SinkWriterMetricGroup metrics;

    /* The asynchronous http client for the asynchronous Kinesis client */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/sink/DynamoDbSinkWriter.java`
#### Snippet
```java

    /* The sink writer metric group */
    private final SinkWriterMetricGroup metrics;

    private final SdkClientProvider<DynamoDbAsyncClient> clientProvider;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-connector-aws-kinesis-streams/src/main/java/org/apache/flink/connector/kinesis/table/util/KinesisStreamsConnectorOptionsUtils.java`
#### Snippet
```java
    private final AsyncClientOptionsUtils asyncClientOptionsUtils;
    private final AsyncSinkConfigurationValidator asyncSinkconfigurationValidator;
    private final Map<String, String> resolvedOptions;
    private final ReadableConfig tableOptions;
    private final PartitionKeyGenerator<RowData> partitioner;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/DynamoDBStreamsDataFetcher.java`
#### Snippet
```java
    protected boolean shouldAdvanceLastDiscoveredShardId(
            String shardId, String lastSeenShardIdOfStream) {
        if (DynamoDBStreamsShardHandle.compareShardIds(shardId, lastSeenShardIdOfStream) <= 0) {
            // shardID update is valid only if the given shard id is greater
            // than the previous last seen shard id of the stream.
```

### TrivialIf
`if` statement can be simplified
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/proxy/KinesisProxy.java`
#### Snippet
```java
        if (ex instanceof AmazonServiceException) {
            return KinesisProxy.isRecoverableException((AmazonServiceException) ex);
        } else if (isRecoverableConnectionException(ex)) {
            return true;
        }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `flink-formats-aws/flink-avro-glue-schema-registry/src/main/java/org/apache/flink/formats/avro/glue/schema/registry/GlueSchemaRegistryInputStreamDeserializer.java`
#### Snippet
```java
    public Schema getSchemaAndDeserializedStream(InputStream in) throws IOException {
        byte[] inputBytes = new byte[in.available()];
        in.read(inputBytes);
        in.reset();

```

### IgnoreResultOfCall
Result of `BlockingQueue.offer()` is ignored
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/fanout/FanOutShardSubscriber.java`
#### Snippet
```java
            // If there is space in the queue, insert the error to wake up blocked thread
            if (queue.isEmpty()) {
                queue.offer(subscriptionErrorEvent);
            }
        }
```

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
        int partitionKeyLength = in.readInt();
        byte[] requestPartitionKeyData = new byte[(int) partitionKeyLength];
        in.read(requestPartitionKeyData);
        return new String(requestPartitionKeyData, StandardCharsets.UTF_8);
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
Result of `ExecutorService.awaitTermination()` is ignored
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisProducer.java`
#### Snippet
```java
            ExecutorService executorService = (ExecutorService) executorField.get(fileAgeManager);
            executorService.shutdown();
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (ClassNotFoundException
                | NoSuchFieldException
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'AttributeMap' used without 'try'-with-resources statement
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/proxy/KinesisProxyV2Factory.java`
#### Snippet
```java
        Preconditions.checkNotNull(configProps);

        final AttributeMap convertedProperties = AwsV2Util.convertProperties(configProps);
        final AttributeMap.Builder clientConfiguration = AttributeMap.builder();
        populateDefaultValues(clientConfiguration);
```

### AutoCloseableResource
'AttributeMap' used without 'try'-with-resources statement
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/proxy/KinesisProxyV2Factory.java`
#### Snippet
```java
        Preconditions.checkNotNull(configProps);

        final AttributeMap convertedProperties = AwsV2Util.convertProperties(configProps);
        final AttributeMap.Builder clientConfiguration = AttributeMap.builder();
        populateDefaultValues(clientConfiguration);
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/serialization/KinesisDeserializationSchema.java`
#### Snippet
```java
     * @return the deserialized message as an Java object ({@code null} if the message cannot be
     *     deserialized).
     * @throws IOException
     */
    T deserialize(
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/RecordPublisher.java`
#### Snippet
```java
     * @param recordBatchConsumer the record batch consumer in which to output records
     * @return a status enum to represent whether a shard has been fully consumed
     * @throws InterruptedException
     */
    RecordPublisherRunResult run(RecordBatchConsumer recordBatchConsumer)
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/polling/PollingRecordPublisher.java`
#### Snippet
```java
     * @param processingEndTimeNanos The end time of the run loop "work"
     * @return The System.nanoTime() after the sleep (if any)
     * @throws InterruptedException
     */
    private long adjustRunLoopFrequency(long processingStartTimeNanos, long processingEndTimeNanos)
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/fanout/StreamConsumerRegistrar.java`
#### Snippet
```java
     *
     * @param stream the stream in which to deregister the consumer
     * @throws ExecutionException
     * @throws InterruptedException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/fanout/StreamConsumerRegistrar.java`
#### Snippet
```java
     * @param stream the stream in which to deregister the consumer
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public void deregisterStreamConsumer(final String stream) throws Exception {
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/fanout/StreamConsumerRegistrar.java`
#### Snippet
```java
     * @param streamConsumerName the name of the new stream consumer
     * @return the stream consumer ARN
     * @throws ExecutionException
     * @throws InterruptedException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/fanout/StreamConsumerRegistrar.java`
#### Snippet
```java
     * @return the stream consumer ARN
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public String registerStreamConsumer(final String stream, final String streamConsumerName)
```

### JavadocDeclaration
`@param watermarkTracker` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisConsumer.java`
#### Snippet
```java
     * consumers by event time.
     *
     * @param watermarkTracker
     */
    public void setWatermarkTracker(WatermarkTracker watermarkTracker) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/proxy/FullJitterBackoff.java`
#### Snippet
```java
     *
     * @param millisToSleep the number of milliseconds to sleep for
     * @throws InterruptedException
     */
    public void sleep(long millisToSleep) throws InterruptedException {
```

### JavadocDeclaration
`@param config` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AWSUtil.java`
#### Snippet
```java
     * Set all prefixed properties on {@link ClientConfiguration}.
     *
     * @param config
     * @param configProps
     */
```

### JavadocDeclaration
`@param configProps` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/AWSUtil.java`
#### Snippet
```java
     *
     * @param config
     * @param configProps
     */
    public static void setAwsClientConfigProperties(
```

### JavadocDeclaration
`@param maxLookaheadMillis` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/RecordEmitter.java`
#### Snippet
```java
     * <p>Needs to account for the latency of obtaining the global watermark.
     *
     * @param maxLookaheadMillis
     */
    public void setMaxLookaheadMillis(long maxLookaheadMillis) {
```

### JavadocDeclaration
`@param watermark` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/RecordEmitter.java`
#### Snippet
```java
     * #maxLookaheadMillis}, elements in that queue will wait until the watermark advances.
     *
     * @param watermark
     */
    public void setCurrentWatermark(long watermark) {
```

### JavadocDeclaration
`@param producerIndex` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/RecordEmitter.java`
#### Snippet
```java
     * <p>The producer may hold on to the queue for subsequent records.
     *
     * @param producerIndex
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/RecordEmitter.java`
#### Snippet
```java
     *
     * @param producerIndex
     * @return
     */
    public RecordQueue<T> getQueue(int producerIndex) {
```

### JavadocDeclaration
`@param updateTimeoutMillis` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/WatermarkTracker.java`
#### Snippet
```java
     * considered idle and excluded from target watermark calculation.
     *
     * @param updateTimeoutMillis
     */
    public void setUpdateTimeoutMillis(long updateTimeoutMillis) {
```

### JavadocDeclaration
`@param localWatermark` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/WatermarkTracker.java`
#### Snippet
```java
     * responsible for any timer management etc.
     *
     * @param localWatermark
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/WatermarkTracker.java`
#### Snippet
```java
     *
     * @param localWatermark
     * @return
     */
    public abstract long updateWatermark(final long localWatermark);
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-formats-aws/flink-avro-glue-schema-registry/src/main/java/org/apache/flink/formats/avro/glue/schema/registry/GlueSchemaRegistryOutputStreamSerializer.java`
#### Snippet
```java
     * @param out output stream
     * @param data original bytes of serialized object
     * @throws IOException
     */
    public void registerSchemaAndSerializeStream(Schema schema, OutputStream out, byte[] data)
```

### JavadocDeclaration
`@throws` tag description is missing
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/publisher/fanout/FanOutRecordPublisher.java`
#### Snippet
```java
     * @param eventConsumer the consumer to pass events to
     * @return {@code COMPLETE} if the shard is complete and this shard consumer should exit
     * @throws InterruptedException
     */
    private RecordPublisherRunResult runWithBackoff(
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `sentinel` may be 'final'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/model/SentinelSequenceNumber.java`
#### Snippet
```java
    SENTINEL_SHARD_ENDING_SEQUENCE_NUM(new SequenceNumber("SHARD_ENDING_SEQUENCE_NUM"));

    private SequenceNumber sentinel;

    SentinelSequenceNumber(SequenceNumber sentinel) {
```

### FieldMayBeFinal
Field `ignorables` may be 'final'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/BeanDeserializerModifierForIgnorables.java`
#### Snippet
```java

    private Class<?> type;
    private List<String> ignorables;

    public BeanDeserializerModifierForIgnorables(Class clazz, String... properties) {
```

### FieldMayBeFinal
Field `type` may be 'final'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/BeanDeserializerModifierForIgnorables.java`
#### Snippet
```java
public class BeanDeserializerModifierForIgnorables extends BeanDeserializerModifier {

    private Class<?> type;
    private List<String> ignorables;

```

### FieldMayBeFinal
Field `streamShardHandle` may be 'final'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/model/KinesisStreamShardState.java`
#### Snippet
```java

    /** A handle object that wraps the actual {@link Shard} instance and stream name. */
    private StreamShardHandle streamShardHandle;

    /** The checkpointed state for each Kinesis stream shard. */
```

### FieldMayBeFinal
Field `streamShardMetadata` may be 'final'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/model/KinesisStreamShardState.java`
#### Snippet
```java

    /** The checkpointed state for each Kinesis stream shard. */
    private StreamShardMetadata streamShardMetadata;

    private SequenceNumber lastProcessedSequenceNum;
```

### FieldMayBeFinal
Field `idleSleepMillis` may be 'final'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/RecordEmitter.java`
#### Snippet
```java
    private volatile long maxEmitTimestamp = Long.MAX_VALUE;
    private long maxLookaheadMillis = 60 * 1000; // one minute
    private long idleSleepMillis = 100;
    private final Object condition = new Object();

```

### FieldMayBeFinal
Field `sentinelSequenceNumber` may be 'final'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/config/ConsumerConfigConstants.java`
#### Snippet
```java
        AT_TIMESTAMP(SentinelSequenceNumber.SENTINEL_AT_TIMESTAMP_SEQUENCE_NUM);

        private SentinelSequenceNumber sentinelSequenceNumber;

        InitialPosition(SentinelSequenceNumber sentinelSequenceNumber) {
```

### FieldMayBeFinal
Field `shardWatermarks` may be 'final'
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/internals/KinesisDataFetcher.java`
#### Snippet
```java
     * different shard index keys, since those are transient and not part of checkpointed state.
     */
    private ConcurrentHashMap<Integer, ShardWatermarkState> shardWatermarks =
            new ConcurrentHashMap<>();

```

## RuleId[id=BusyWait]
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

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/FlinkKinesisProducer.java`
#### Snippet
```java
                for (Attempt attempt : attempts) {
                    if (attempt.getErrorMessage() != null) {
                        errorMessages += attempt.getErrorMessage() + "\n";
                    }
                }
```

## RuleId[id=UnusedAssignment]
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

## RuleId[id=UseBulkOperation]
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

