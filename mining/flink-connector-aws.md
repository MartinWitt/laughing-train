# flink-connector-aws 
 
# Bad smells
I found 10 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=BoundedWildcard] | 3 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 2 | false |
| RuleId[ruleID=IgnoreResultOfCall] | 2 | false |
| RuleId[ruleID=ReturnNull] | 1 | false |
| RuleId[ruleID=DataFlowIssue] | 1 | false |
| RuleId[ruleID=UseOfPropertiesAsHashtable] | 1 | false |
## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/converter/ArrayAttributeConverterProvider.java`
#### Snippet
```java
            return (AttributeConverter<T>) getArrayAttributeConverter(Instant.class, enhancedType);
        }
        return null;
    }

```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DynamoDbSerializationUtil` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/util/DynamoDbSerializationUtil.java`
#### Snippet
```java
 */
@Internal
public class DynamoDbSerializationUtil {

    public static void serializeWriteRequest(
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DynamoDbConfigConstants` has only 'static' members, and lacks a 'private' constructor
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/sink/DynamoDbConfigConstants.java`
#### Snippet
```java
/** Defaults for {@link DynamoDbSinkWriter}. */
@PublicEvolving
public class DynamoDbConfigConstants {

    public static final String BASE_DYNAMODB_USER_AGENT_PREFIX_FORMAT =
```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/RowDataToAttributeValueConverter.java`
#### Snippet
```java
                    createFieldGetter(field.getDataType().getLogicalType(), i);

            builder = addAttribute(builder, field, fieldGetter);
        }
        return builder.build();
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/table/converter/ArrayAttributeConverter.java`
#### Snippet
```java

    public ArrayAttributeConverter(
            AttributeConverter<T> tAttributeConverter, EnhancedType<T[]> enhancedType) {
        this.tAttributeConverter = tAttributeConverter;
        this.enhancedType = enhancedType;
```

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super List`
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/sink/DynamoDbSinkWriter.java`
#### Snippet
```java

    private void handlePartiallyUnprocessedRequest(
            BatchWriteItemResponse response, Consumer<List<DynamoDbWriteRequest>> requestResult) {
        List<DynamoDbWriteRequest> unprocessed = new ArrayList<>();

```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/sink/DynamoDbSinkWriter.java`
#### Snippet
```java

        // Specify HTTP1_1 protocol since DynamoDB endpoint doesn't support HTTP2
        overridenProperties.put(AWSConfigConstants.HTTP_PROTOCOL_VERSION, "HTTP1_1");
        return overridenProperties;
    }
```

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

