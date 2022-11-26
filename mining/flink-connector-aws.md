# flink-connector-aws 
 
# Bad smells
I found 12 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 4 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| IgnoreResultOfCall | 2 | false |
| ReturnNull | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| DataFlowIssue | 1 | false |
| UseOfPropertiesAsHashtable | 1 | false |
## RuleId[ruleID=ReturnNull]
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

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-26-01-03-47.880.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
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

## RuleId[ruleID=BoundedWildcard]
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
Can generalize to `? super List`
in `flink-connector-dynamodb/src/main/java/org/apache/flink/connector/dynamodb/sink/DynamoDbSinkWriter.java`
#### Snippet
```java

    private void handlePartiallyUnprocessedRequest(
            BatchWriteItemResponse response, Consumer<List<DynamoDbWriteRequest>> requestResult) {
        List<DynamoDbWriteRequest> unprocessed = new ArrayList<>();

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

## RuleId[ruleID=UseOfPropertiesAsHashtable]
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

