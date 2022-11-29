# kafka-connect-cosmosdb 
 
# Bad smells
I found 56 bad smells with 10 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnusedAssignment | 9 | false |
| UNUSED_IMPORT | 7 | false |
| BoundedWildcard | 7 | false |
| RedundantFieldInitialization | 4 | false |
| ReturnNull | 4 | false |
| SizeReplaceableByIsEmpty | 4 | true |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| ConditionCoveredByFurtherCondition | 2 | false |
| AssignmentToLambdaParameter | 2 | false |
| BusyWait | 2 | false |
| MethodOverridesStaticMethod | 2 | false |
| EmptyTryBlock | 1 | false |
| DataFlowIssue | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| CodeBlock2Expr | 1 | true |
| NonProtectedConstructorInAbstractClass | 1 | true |
| Convert2MethodRef | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnnecessaryReturn | 1 | true |
| ConstantValue | 1 | false |
## RuleId[ruleID=EmptyTryBlock]
### EmptyTryBlock
Empty `try` block
in `src/main/java/com/azure/cosmos/kafka/connect/CosmosDBConfig.java`
#### Snippet
```java
    public static class CosmosClientBuilder {
        public static void createClient(String endpoint, String key) {
            try (CosmosClient unused = new com.azure.cosmos.CosmosClientBuilder()
                .endpoint(endpoint)
                .key(key)
```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'exception != null' covered by subsequent condition 'exception instanceof CosmosException'
in `src/main/java/com/azure/cosmos/kafka/connect/sink/BulkWriter.java`
#### Snippet
```java
                itemResponse != null
                        ? itemResponse.getStatusCode()
                        : (exception != null && exception instanceof CosmosException ? ((CosmosException)exception).getStatusCode() : HttpConstants.StatusCodes.REQUEST_TIMEOUT);
        int effectiveSubStatusCode =
                itemResponse != null
```

### ConditionCoveredByFurtherCondition
Condition 'exception != null' covered by subsequent condition 'exception instanceof CosmosException'
in `src/main/java/com/azure/cosmos/kafka/connect/sink/BulkWriter.java`
#### Snippet
```java
                itemResponse != null
                        ? itemResponse.getSubStatusCode()
                        : (exception != null && exception instanceof CosmosException ? ((CosmosException)exception).getSubStatusCode() : 0);

        String errorMessage =
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `StructToJsonMap` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/azure/cosmos/kafka/connect/sink/StructToJsonMap.java`
#### Snippet
```java
import org.apache.kafka.connect.data.Timestamp;

public class StructToJsonMap {

    public static Map<String, Object> toJsonMap(Struct struct) {
```

### UtilityClassWithoutPrivateConstructor
Class `ExceptionsHelper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/azure/cosmos/kafka/connect/sink/ExceptionsHelper.java`
#### Snippet
```java
import com.azure.cosmos.implementation.HttpConstants;

public class ExceptionsHelper {
    public static boolean isTransientFailure(int statusCode, int substatusCode) {
        return statusCode == HttpConstants.StatusCodes.GONE
```

### UtilityClassWithoutPrivateConstructor
Class `CosmosClientBuilder` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/azure/cosmos/kafka/connect/CosmosDBConfig.java`
#### Snippet
```java

    /* separate class for mocking static method in tests */
    public static class CosmosClientBuilder {
        public static void createClient(String endpoint, String key) {
            try (CosmosClient unused = new com.azure.cosmos.CosmosClientBuilder()
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Argument `nodeSchema` might be null
in `src/main/java/com/azure/cosmos/kafka/connect/source/JsonToStruct.java`
#### Snippet
```java
    public SchemaAndValue recordToSchemaAndValue(final JsonNode node) {
        Schema nodeSchema = inferSchema(node);
        Struct struct = new Struct(nodeSchema);

        if (nodeSchema != null) {
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.net.InetAddress;`
in `src/main/java/com/azure/cosmos/kafka/connect/CosmosDBConfig.java`
#### Snippet
```java
import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.kafka.connect.sink.CosmosDBSinkConfig;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
```

### UNUSED_IMPORT
Unused import `import java.net.URI;`
in `src/main/java/com/azure/cosmos/kafka/connect/CosmosDBConfig.java`
#### Snippet
```java
import com.azure.cosmos.kafka.connect.sink.CosmosDBSinkConfig;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
```

### UNUSED_IMPORT
Unused import `import java.net.URISyntaxException;`
in `src/main/java/com/azure/cosmos/kafka/connect/CosmosDBConfig.java`
#### Snippet
```java
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.regex.Pattern;
```

### UNUSED_IMPORT
Unused import `import java.net.UnknownHostException;`
in `src/main/java/com/azure/cosmos/kafka/connect/CosmosDBConfig.java`
#### Snippet
```java
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.regex.Pattern;
import org.apache.kafka.common.config.AbstractConfig;
```

### UNUSED_IMPORT
Unused import `import org.apache.kafka.common.config.ConfigException;`
in `src/main/java/com/azure/cosmos/kafka/connect/CosmosDBConfig.java`
#### Snippet
```java

import java.util.Map;
import org.apache.kafka.common.config.ConfigException;
import org.apache.kafka.common.config.ConfigValue;

```

### UNUSED_IMPORT
Unused import `import org.apache.kafka.connect.data.Schema;`
in `src/main/java/com/azure/cosmos/kafka/connect/sink/id/strategy/ProvidedInStrategy.java`
#### Snippet
```java

import com.jayway.jsonpath.JsonPath;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.data.Values;
```

### UNUSED_IMPORT
Unused import `import org.apache.kafka.connect.data.Struct;`
in `src/main/java/com/azure/cosmos/kafka/connect/sink/id/strategy/ProvidedInStrategy.java`
#### Snippet
```java
import com.jayway.jsonpath.JsonPath;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.data.Values;
import org.apache.kafka.connect.errors.ConnectException;
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `src/main/java/com/azure/cosmos/kafka/connect/sink/id/strategy/TemplateStrategy.java`
#### Snippet
```java

        String pattern = String.format(PATTERN_TEMPLATE,
            METHODS_BY_VARIABLE.keySet().stream().collect(Collectors.joining("|")));
        PATTERN = Pattern.compile(pattern);
    }
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/azure/cosmos/kafka/connect/sink/StructToJsonMap.java`
#### Snippet
```java
                        // If Array contains list of Structs
                        List<Object> jsonArray = new ArrayList<>();
                        fieldArray.forEach(item -> {
                            jsonArray.add(toJsonMap((Struct) item));
                        });
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `SinkWriterBase()` of an abstract class should not be declared 'public'
in `src/main/java/com/azure/cosmos/kafka/connect/sink/SinkWriterBase.java`
#### Snippet
```java
    private final int maxRetryCount;

    public SinkWriterBase(int maxRetryCount) {
        this.maxRetryCount = maxRetryCount;
    }
```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/azure/cosmos/kafka/connect/source/JsonToStruct.java`
#### Snippet
```java
                List<JsonNode> jsonValues = new ArrayList<>();
                SchemaBuilder arrayBuilder;
                jsonNode.forEach(jn -> jsonValues.add(jn));

                Schema firstItemSchema = jsonValues.isEmpty() ? Schema.OPTIONAL_STRING_SCHEMA
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/azure/cosmos/kafka/connect/source/CosmosDBSourceConnector.java`
#### Snippet
```java
    
    private static final Logger logger = LoggerFactory.getLogger(CosmosDBSourceConnector.class);
    private CosmosDBSourceConfig config = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/azure/cosmos/kafka/connect/sink/CosmosDBSinkTask.java`
#### Snippet
```java
public class CosmosDBSinkTask extends SinkTask {
    private static final Logger logger = LoggerFactory.getLogger(CosmosDBSinkTask.class);
    private CosmosClient client = null;
    private CosmosDBSinkConfig config;
    private final ConcurrentHashMap<String, SinkWriterBase> containerWriterMap = new ConcurrentHashMap<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/azure/cosmos/kafka/connect/source/CosmosDBSourceTask.java`
#### Snippet
```java

    private final AtomicBoolean running = new AtomicBoolean(false);
    private CosmosAsyncClient client = null;
    private CosmosDBSourceConfig config;
    private LinkedTransferQueue<JsonNode> queue = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/azure/cosmos/kafka/connect/source/CosmosDBSourceTask.java`
#### Snippet
```java
    private CosmosAsyncClient client = null;
    private CosmosDBSourceConfig config;
    private LinkedTransferQueue<JsonNode> queue = null;
    private ChangeFeedProcessor changeFeedProcessor;
    private JsonToStruct jsonToStruct = new JsonToStruct();
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/com/azure/cosmos/kafka/connect/source/JsonToStruct.java`
#### Snippet
```java
                break;
            case MAP:
                schemaAndValue = new SchemaAndValue(schema, node);
                break;
            case STRUCT:
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/azure/cosmos/kafka/connect/sink/StructToJsonMap.java`
#### Snippet
```java
    public static Map<String, Object> toJsonMap(Struct struct) {
        if (struct == null) {
            return null;
        }
        Map<String, Object> jsonMap = new HashMap<String, Object>(0);
```

### ReturnNull
Return of `null`
in `src/main/java/com/azure/cosmos/kafka/connect/source/JsonToStruct.java`
#### Snippet
```java
            case POJO:
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/com/azure/cosmos/kafka/connect/source/CosmosDBSourceTask.java`
#### Snippet
```java
        JsonNode leaseRecord = getLeaseContainerRecord();
        if (client == null || leaseRecord == null) {
            return null;
        }
        return leaseRecord.get(CONTINUATION_TOKEN).textValue();
```

### ReturnNull
Return of `null`
in `src/main/java/com/azure/cosmos/kafka/connect/source/CosmosDBSourceTask.java`
#### Snippet
```java
        }

        return null;
    }

```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-29-19-03-51.995.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `writer`
in `src/main/java/com/azure/cosmos/kafka/connect/sink/CosmosDBSinkTask.java`
#### Snippet
```java
                if (writer == null) {
                    if (this.config.isBulkModeEnabled()) {
                        writer = new BulkWriter(container, this.config.getMaxRetryCount());
                    } else {
                        writer = new PointWriter(container, this.config.getMaxRetryCount());
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `writer`
in `src/main/java/com/azure/cosmos/kafka/connect/sink/CosmosDBSinkTask.java`
#### Snippet
```java
                        writer = new BulkWriter(container, this.config.getMaxRetryCount());
                    } else {
                        writer = new PointWriter(container, this.config.getMaxRetryCount());
                    }
                }
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`response.getFailedRecordResponses().size() == 0` can be replaced with 'response.getFailedRecordResponses().isEmpty()'
in `src/main/java/com/azure/cosmos/kafka/connect/sink/SinkWriterBase.java`
#### Snippet
```java

    private boolean shouldRetry(int currentRetryCount, SinkWriteResponse response) {
        if (response == null || response.getFailedRecordResponses().size() == 0) {
            // there is no failed operation
            return false;
```

### SizeReplaceableByIsEmpty
`containerList.size() == 0` can be replaced with 'containerList.isEmpty()'
in `src/main/java/com/azure/cosmos/kafka/connect/source/CosmosDBSourceConnector.java`
#### Snippet
```java
        List<Map<String, String>> taskConfigs = new ArrayList<>(maxTasks);

        if (containerList.size() == 0) {
            logger.debug("Container list is not specified");
            return taskConfigs;
```

### SizeReplaceableByIsEmpty
`response.getFailedRecordResponses().size() == 0` can be replaced with 'response.getFailedRecordResponses().isEmpty()'
in `src/main/java/com/azure/cosmos/kafka/connect/sink/CosmosDBSinkTask.java`
#### Snippet
```java
                SinkWriteResponse response = cosmosdbWriter.write(toBeWrittenRecordList);

                if (response.getFailedRecordResponses().size() == 0) {
                    logger.debug("Sink write completed, {} records succeeded.", response.getSucceededRecords().size());

```

### SizeReplaceableByIsEmpty
`records.size() == 0` can be replaced with 'records.isEmpty()'
in `src/main/java/com/azure/cosmos/kafka/connect/source/CosmosDBSourceTask.java`
#### Snippet
```java
                // Add the item to buffer if either conditions met:
                // it is the first record, or adding this record does not exceed the buffer size
                if (records.size() == 0 || bufferSize >= 0) {
                    records.add(sourceRecord);
                    count++;
```

## RuleId[ruleID=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/com/azure/cosmos/kafka/connect/sink/CosmosDBSinkTask.java`
#### Snippet
```java
                    "Could not upload record to CosmosDb, but tolerance is set to all. Error message: {}",
                    errorMessage);
            return;
        } else {
            throw new CosmosDBWriteException(errorMessage.toString());
```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/azure/cosmos/kafka/connect/source/CosmosDBSourceTask.java`
#### Snippet
```java
            // Wait till the items are drained by poll before stopping.
            try {
                sleep(500);
            } catch (InterruptedException e) {
                logger.error("Interrupted! Failed to stop the task", e);            
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/azure/cosmos/kafka/connect/source/CosmosDBSourceTask.java`
#### Snippet
```java
        while (!running.get()) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                logger.warn("Interrupted!", e);                
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends SinkRecord`
in `src/main/java/com/azure/cosmos/kafka/connect/sink/PointWriter.java`
#### Snippet
```java

    @Override
    protected SinkWriteResponse writeCore(List<SinkRecord> sinkRecords) {
        checkNotNull(sinkRecords, "Argument 'sinkRecords' should not be null");
        SinkWriteResponse sinkWriteResponse = new SinkWriteResponse();
```

### BoundedWildcard
Can generalize to `? extends SinkRecord`
in `src/main/java/com/azure/cosmos/kafka/connect/sink/BulkWriter.java`
#### Snippet
```java
     * @return the list of sink write failed operations.
     */
    protected SinkWriteResponse writeCore(List<SinkRecord> sinkRecords) {

        SinkWriteResponse sinkWriteResponse = new SinkWriteResponse();
```

### BoundedWildcard
Can generalize to `? extends SinkOperationFailedResponse`
in `src/main/java/com/azure/cosmos/kafka/connect/sink/CosmosDBSinkTask.java`
#### Snippet
```java
     * @param failedResponses the kafka record that failed to write
     */
    private void sendToDlqIfConfigured(List<SinkOperationFailedResponse> failedResponses) {
        if (context != null && context.errantRecordReporter() != null) {
            for (SinkOperationFailedResponse sinkRecordResponse : failedResponses) {
```

### BoundedWildcard
Can generalize to `? super SourceRecord`
in `src/main/java/com/azure/cosmos/kafka/connect/source/CosmosDBSourceTask.java`
#### Snippet
```java

    @SuppressWarnings("squid:S135") // while loop needs multiple breaks
    private void fillRecords(List<SourceRecord> records, String topic) throws InterruptedException {
        Long bufferSize = config.getTaskBufferSize();
        Long batchSize = config.getTaskBatchSize();
```

### BoundedWildcard
Can generalize to `? extends JsonNode`
in `src/main/java/com/azure/cosmos/kafka/connect/source/CosmosDBSourceTask.java`
#### Snippet
```java
    }

    protected void handleCosmosDbChanges(List<JsonNode> docs)  {
        for (JsonNode document : docs) {
            // Blocks for each transfer till it is processed by the poll method.
```

### BoundedWildcard
Can generalize to `? extends ConfigValue`
in `src/main/java/com/azure/cosmos/kafka/connect/CosmosDBConfig.java`
#### Snippet
```java

    public static void validateTopicMap(Map<String, String> connectorConfigs,
        Map<String, ConfigValue> configValues) {

        String topicMap = connectorConfigs.get(CosmosDBSinkConfig.COSMOS_CONTAINER_TOPIC_MAP_CONF);
```

### BoundedWildcard
Can generalize to `? extends ConfigValue`
in `src/main/java/com/azure/cosmos/kafka/connect/CosmosDBConfig.java`
#### Snippet
```java
    }

    public static void validateConnection(Map<String, String> connectorConfigs, Map<String, ConfigValue> configValues) {
        String endpoint = connectorConfigs.get(CosmosDBSinkConfig.COSMOS_CONN_ENDPOINT_CONF);
        String key = connectorConfigs.get(CosmosDBSinkConfig.COSMOS_CONN_KEY_CONF);
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
The value changed at `groupOrder++` is never used
in `src/main/java/com/azure/cosmos/kafka/connect/sink/id/strategy/ProvidedInConfig.java`
#### Snippet
```java
            JSON_PATH_CONFIG_DOC,
            groupName,
            groupOrder++,
            ConfigDef.Width.MEDIUM,
            JSON_PATH_CONFIG_DISPLAY
```

### UnusedAssignment
The value changed at `groupOrder++` is never used
in `src/main/java/com/azure/cosmos/kafka/connect/sink/id/strategy/KafkaMetadataStrategyConfig.java`
#### Snippet
```java
                DELIMITER_CONFIG_DOC,
                groupName,
                groupOrder++,
                ConfigDef.Width.MEDIUM,
                DELIMITER_CONFIG_DISPLAY
```

### UnusedAssignment
The value changed at `groupOrder++` is never used
in `src/main/java/com/azure/cosmos/kafka/connect/sink/CosmosDBSinkConfig.java`
#### Snippet
```java
                ID_STRATEGY_DOC,
                groupName,
                groupOrder++,
                Width.MEDIUM,
                TEMPLATE_CONFIG_DISPLAY
```

### UnusedAssignment
The value changed at `messageGroupOrder++` is never used
in `src/main/java/com/azure/cosmos/kafka/connect/source/CosmosDBSourceConfig.java`
#### Snippet
```java
                COSMOS_MESSAGE_KEY_FIELD_DOC,
                messageGroupName,
                messageGroupOrder++,
                Width.SHORT,
                COSMOS_MESSAGE_KEY_FIELD_DISPLAY,
```

### UnusedAssignment
The value changed at `taskGroupOrder++` is never used
in `src/main/java/com/azure/cosmos/kafka/connect/source/CosmosDBSourceConfig.java`
#### Snippet
```java
                COSMOS_SOURCE_TASK_POLL_INTERVAL_DOC,
                taskGroupName,
                taskGroupOrder++,
                Width.SHORT,
                COSMOS_SOURCE_TASK_POLL_INTERVAL_DISPLAY
```

### UnusedAssignment
The value changed at `groupOrder++` is never used
in `src/main/java/com/azure/cosmos/kafka/connect/sink/id/strategy/TemplateStrategyConfig.java`
#### Snippet
```java
                TEMPLATE_CONFIG_DOC,
                groupName,
                groupOrder++,
                ConfigDef.Width.MEDIUM,
                TEMPLATE_CONFIG_DISPLAY
```

### UnusedAssignment
Variable `topicContainerMap` initializer `TopicContainerMap.empty()` is redundant
in `src/main/java/com/azure/cosmos/kafka/connect/CosmosDBConfig.java`
#### Snippet
```java
    private final boolean connectionSharingEnabled;
    private final int maxRetryCount;
    private TopicContainerMap topicContainerMap = TopicContainerMap.empty();

    public CosmosDBConfig(ConfigDef config, Map<String, String> parsedConfig) {
```

### UnusedAssignment
The value changed at `databaseGroupOrder++` is never used
in `src/main/java/com/azure/cosmos/kafka/connect/CosmosDBConfig.java`
#### Snippet
```java
                        COSMOS_CONTAINER_TOPIC_MAP_DOC,
                        databaseGroupName,
                        databaseGroupOrder++,
                        Width.MEDIUM,
                        COSMOS_CONTAINER_TOPIC_MAP_DISPLAY
```

### UnusedAssignment
The value changed at `connectionGroupOrder++` is never used
in `src/main/java/com/azure/cosmos/kafka/connect/CosmosDBConfig.java`
#### Snippet
```java
                        COSMOS_CONN_KEY_DOC,
                        connectionGroupName,
                        connectionGroupOrder++,
                        Width.LONG,
                        COSMOS_CONN_KEY_DISPLAY
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `nodeSchema != null` is always `true`
in `src/main/java/com/azure/cosmos/kafka/connect/source/JsonToStruct.java`
#### Snippet
```java
        Struct struct = new Struct(nodeSchema);

        if (nodeSchema != null) {
            nodeSchema.fields().forEach(field -> {
                JsonNode fieldValue = node.get(field.name());
```

## RuleId[ruleID=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `getConfig()` tries to override a static method of a superclass
in `src/main/java/com/azure/cosmos/kafka/connect/sink/CosmosDBSinkConfig.java`
#### Snippet
```java
    }

    public static ConfigDef getConfig() {
        ConfigDef result = CosmosDBConfig.getConfig();

```

### MethodOverridesStaticMethod
Method `getConfig()` tries to override a static method of a superclass
in `src/main/java/com/azure/cosmos/kafka/connect/source/CosmosDBSourceConfig.java`
#### Snippet
```java
    }

    public static ConfigDef getConfig() {
        ConfigDef result = CosmosDBConfig.getConfig();
        
```

