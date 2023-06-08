# kafka-connect-cosmosdb 
 
# Bad smells
I found 42 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnusedAssignment | 9 | false |
| UNUSED_IMPORT | 7 | false |
| UNCHECKED_WARNING | 6 | false |
| FieldMayBeFinal | 3 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| RedundantCast | 2 | false |
| BusyWait | 2 | false |
| EmptyTryBlock | 1 | false |
| DataFlowIssue | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| ReactiveStreamsUnusedPublisher | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| DuplicatedCode | 1 | false |
| UnnecessaryReturn | 1 | true |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| ConstantValue | 1 | false |
| FieldCanBeLocal | 1 | false |
| TrivialIf | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `src/main/java/com/azure/cosmos/kafka/connect/sink/StructToJsonMap.java`
#### Snippet
```java
        map.forEach((key, value) -> {
            if (value instanceof Map) {
                cacheMap.put(key, handleMap((Map<String, Object>) value));
            } else if (value instanceof Struct) {
                cacheMap.put(key, toJsonMap((Struct) value));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `src/main/java/com/azure/cosmos/kafka/connect/sink/StructToJsonMap.java`
#### Snippet
```java
                cacheMap.put(key, toJsonMap((Struct) value));
            } else if (value instanceof List) {
                List<Object> list = (List<Object>) value;
                List<Object> jsonArray = new ArrayList<>();
                list.forEach(item -> {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `src/main/java/com/azure/cosmos/kafka/connect/sink/StructToJsonMap.java`
#### Snippet
```java
                        jsonArray.add(toJsonMap((Struct) item));
                    } else if (item instanceof Map) {
                        jsonArray.add(handleMap((Map<String, Object>) item));
                    } else {
                        jsonArray.add(item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `src/main/java/com/azure/cosmos/kafka/connect/sink/BulkWriter.java`
#### Snippet
```java
        //TODO: examine the code here for sub-partition
        String partitionKeyPath = StringUtils.join(this.partitionKeyDefinition.getPaths(), "");
        Map<String, Object> recordMap = (Map<String, Object>) recordValue;
        Object partitionKeyValue = recordMap.get(partitionKeyPath.substring(1));
        PartitionKeyInternal partitionKeyInternal = PartitionKeyInternal.fromObjectArray(Collections.singletonList(partitionKeyValue), false);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `src/main/java/com/azure/cosmos/kafka/connect/sink/CosmosDBSinkTask.java`
#### Snippet
```java
            return;
        }
        Map<String, Object> recordMap = (Map<String, Object>) recordValue;
        IdStrategy idStrategy = config.idStrategy();
        recordMap.put(AbstractIdStrategyConfig.ID, idStrategy.generateId(sinkRecord));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `src/main/java/com/azure/cosmos/kafka/connect/sink/CosmosDBSinkTask.java`
#### Snippet
```java
                    //  TODO: Do we need to update the value schema to map or keep it struct?
                } else if (record.value() instanceof Map) {
                    recordValue = StructToJsonMap.handleMap((Map<String, Object>) record.value());
                } else {
                    recordValue = record.value();
```

## RuleId[id=EmptyTryBlock]
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

## RuleId[id=ConditionCoveredByFurtherCondition]
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

## RuleId[id=DataFlowIssue]
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

## RuleId[id=UNUSED_IMPORT]
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

## RuleId[id=SimplifyStreamApiCallChains]
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `struct.get(...)` to `java.util.Date` is redundant
in `src/main/java/com/azure/cosmos/kafka/connect/sink/StructToJsonMap.java`
#### Snippet
```java
                case INT32:
                    if (Date.LOGICAL_NAME.equals(schemaName) || Time.LOGICAL_NAME.equals(schemaName)) {
                        jsonMap.put(fieldName, (java.util.Date) struct.get(fieldName));
                    } else {
                        jsonMap.put(fieldName, struct.getInt32(fieldName));
```

### RedundantCast
Casting `struct.get(...)` to `java.util.Date` is redundant
in `src/main/java/com/azure/cosmos/kafka/connect/sink/StructToJsonMap.java`
#### Snippet
```java
                case INT64:
                    if (Timestamp.LOGICAL_NAME.equals(schemaName)) {
                        jsonMap.put(fieldName, (java.util.Date) struct.get(fieldName));
                    } else {
                        jsonMap.put(fieldName, struct.getInt64(fieldName));
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `delimiter` may be 'final'
in `src/main/java/com/azure/cosmos/kafka/connect/sink/id/strategy/KafkaMetadataStrategyConfig.java`
#### Snippet
```java
    public static final String DELIMITER_CONFIG_DISPLAY = "Kafka Metadata";

    private String delimiter;

    public KafkaMetadataStrategyConfig(Map<String, ?> props) {
```

### FieldMayBeFinal
Field `idStrategy` may be 'final'
in `src/main/java/com/azure/cosmos/kafka/connect/sink/CosmosDBSinkConfig.java`
#### Snippet
```java
    public static final String TEMPLATE_CONFIG_DISPLAY = "ID Strategy";

    private IdStrategy idStrategy;

    public CosmosDBSinkConfig(ConfigDef config, Map<String, String> parsedConfig) {
```

### FieldMayBeFinal
Field `jsonToStruct` may be 'final'
in `src/main/java/com/azure/cosmos/kafka/connect/source/CosmosDBSourceTask.java`
#### Snippet
```java
    private LinkedTransferQueue<JsonNode> queue = null;
    private ChangeFeedProcessor changeFeedProcessor;
    private JsonToStruct jsonToStruct = new JsonToStruct();
    private Map<String, String> partitionMap;
    private CosmosAsyncContainer leaseContainer;
```

## RuleId[id=ReactiveStreamsUnusedPublisher]
### ReactiveStreamsUnusedPublisher
Value is never used as Publisher
in `src/main/java/com/azure/cosmos/kafka/connect/source/CosmosDBSourceTask.java`
#### Snippet
```java
        // Release all the resources.
        if (changeFeedProcessor != null) {
            changeFeedProcessor.stop();
            changeFeedProcessor = null;
        }
```

## RuleId[id=DuplicateBranchesInSwitch]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/com/azure/cosmos/kafka/connect/sink/CosmosDBSinkConnector.java`
#### Snippet
```java
        Config config = super.validate(connectorConfigs);
        if (config.configValues().stream().anyMatch(cv -> !cv.errorMessages().isEmpty())) {
            return config;
        }

        Map<String, ConfigValue> configValues = config.configValues().stream().collect(
            Collectors.toMap(ConfigValue::name, Function.identity()));

        validateConnection(connectorConfigs, configValues);
        validateTopicMap(connectorConfigs, configValues);

        return config;
```

## RuleId[id=UnnecessaryReturn]
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

## RuleId[id=BusyWait]
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/com/azure/cosmos/kafka/connect/source/CosmosDBSourceConfig.java`
#### Snippet
```java
                Width.SHORT,
                COSMOS_MESSAGE_KEY_FIELD_DISPLAY,
                Arrays.asList(COSMOS_MESSAGE_KEY_ENABLED_CONF)
            );
    }
```

## RuleId[id=UnusedAssignment]
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

## RuleId[id=ConstantValue]
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

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/azure/cosmos/kafka/connect/sink/id/strategy/KafkaMetadataStrategy.java`
#### Snippet
```java

public class KafkaMetadataStrategy extends TemplateStrategy {
    private KafkaMetadataStrategyConfig config;

    @Override
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/com/azure/cosmos/kafka/connect/sink/SinkWriterBase.java`
#### Snippet
```java
        // for optimization purpose, the non-transient exception will be put in the front
        // so it will be enough to only examine the first record in the list
        if (!ExceptionsHelper.isTransientFailure(response.getFailedRecordResponses().get(0).getException())) {
            return false;
        }
```

