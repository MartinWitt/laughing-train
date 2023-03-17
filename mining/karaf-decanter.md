# karaf-decanter 
 
# Bad smells
I found 283 bad smells with 25 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| MissortedModifiers | 58 | false |
| UseOfPropertiesAsHashtable | 34 | false |
| RedundantFieldInitialization | 24 | false |
| RedundantSuppression | 16 | false |
| ReturnNull | 16 | false |
| DynamicRegexReplaceableByCompiledPattern | 14 | false |
| UNUSED_IMPORT | 14 | false |
| DataFlowIssue | 8 | false |
| UnnecessaryModifier | 7 | true |
| BoundedWildcard | 7 | false |
| NestedAssignment | 7 | false |
| KeySetIterationMayUseEntrySet | 6 | false |
| UnnecessaryToStringCall | 5 | true |
| UnnecessaryLocalVariable | 5 | true |
| UtilityClassWithoutPrivateConstructor | 4 | true |
| SizeReplaceableByIsEmpty | 4 | true |
| CharsetObjectCanBeUsed | 4 | false |
| WhileLoopSpinsOnField | 4 | false |
| ConstantValue | 4 | false |
| RedundantClassCall | 3 | false |
| IgnoreResultOfCall | 3 | false |
| ThrowablePrintStackTrace | 3 | false |
| ReplaceAssignmentWithOperatorAssignment | 3 | false |
| Convert2Lambda | 3 | false |
| CastConflictsWithInstanceof | 3 | false |
| IOResource | 2 | false |
| WhileCanBeForeach | 2 | false |
| SystemOutErr | 2 | false |
| DefaultAnnotationParam | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| AssignmentToMethodParameter | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| RedundantLengthCheck | 1 | false |
| UnnecessarySemicolon | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| ObsoleteCollection | 1 | false |
| RedundantCollectionOperation | 1 | false |
| UnnecessaryBoxing | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| EmptyMethod | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| DoubleBraceInitialization | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=IOResource]
### IOResource
'OutputStreamWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `marshaller/raw/src/main/java/org/apache/karaf/decanter/marshaller/raw/RawMarshaller.java`
#### Snippet
```java
    public void marshal(Object obj, OutputStream out) {
        String result = marshal(obj);
        OutputStreamWriter writer = new OutputStreamWriter(out);
        try {
            writer.write(result);
```

### IOResource
'OutputStreamWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `marshaller/csv/src/main/java/org/apache/karaf/decanter/marshaller/csv/CsvMarshaller.java`
#### Snippet
```java
    public void marshal(Object obj, OutputStream out) {
        String result = marshal(obj);
        OutputStreamWriter writer = new OutputStreamWriter(out);
        try {
            writer.write(result);
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `appender/cassandra/src/main/java/org/apache/karaf/decanter/appender/cassandra/CassandraAppender.java`
#### Snippet
```java
        this.config = config;
        String host = getValue(config, CASSANDRA_HOST_PROPERTY, CASSANDRA_HOST_DEFAULT);
        Integer port = Integer.parseInt(getValue(config, CASSANDRA_PORT_PROPERTY, CASSANDRA_PORT_DEFAULT));
        this.keyspace = getValue(config, KEYSPACE_PROPERTY, KEYSPACE_DEFAULT);
        this.tableName = getValue(config, TABLE_PROPERTY, TABLE_DEFAULT);
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/karaf/decanter/api/Scheduler.java`
#### Snippet
```java
     * @throws Exception
     */
    public boolean isStarted() throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/karaf/decanter/api/Scheduler.java`
#### Snippet
```java
     * @throws Exception in case of state retrieval failure.
     */
    public String state() throws Exception;

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/karaf/decanter/api/Scheduler.java`
#### Snippet
```java
     * @throws Exception in case of startup failure.
     */
    public void start() throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/karaf/decanter/api/Scheduler.java`
#### Snippet
```java
     * @throws Exception in case of stopping failure.
     */
    public void stop() throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/apache/karaf/decanter/api/marshaller/Marshaller.java`
#### Snippet
```java

public interface Marshaller {
    public static final String SERVICE_KEY_DATAFORMAT = "dataFormat";

    void marshal(Object obj, OutputStream out);
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `api/src/main/java/org/apache/karaf/decanter/api/marshaller/Marshaller.java`
#### Snippet
```java

public interface Marshaller {
    public static final String SERVICE_KEY_DATAFORMAT = "dataFormat";

    void marshal(Object obj, OutputStream out);
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `api/src/main/java/org/apache/karaf/decanter/api/marshaller/Marshaller.java`
#### Snippet
```java

public interface Marshaller {
    public static final String SERVICE_KEY_DATAFORMAT = "dataFormat";

    void marshal(Object obj, OutputStream out);
```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `collector/snmp/src/main/java/org/apache/karaf/decanter/collector/snmp/SnmpPoller.java`
#### Snippet
```java
                    }
                    VariableBinding[] variableBindings = treeEvent.getVariableBindings();
                    if (variableBindings == null || variableBindings.length == 0) {
                        continue;
                    }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `EventFilter` has only 'static' members, and lacks a 'private' constructor
in `appender/utils/src/main/java/org/apache/karaf/decanter/appender/utils/EventFilter.java`
#### Snippet
```java
import java.util.Dictionary;

public class EventFilter {

    public static final String PROPERTY_NAME_EXCLUDE_CONFIG = "event.property.name.exclude";
```

### UtilityClassWithoutPrivateConstructor
Class `PeriodParser` has only 'static' members, and lacks a 'private' constructor
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/model/PeriodParser.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class PeriodParser {

    public static long parse(String period) throws IllegalArgumentException {
```

### UtilityClassWithoutPrivateConstructor
Class `Loader` has only 'static' members, and lacks a 'private' constructor
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/model/Loader.java`
#### Snippet
```java
import java.util.List;

public class Loader {

    private final static Logger LOGGER = LoggerFactory.getLogger(Loader.class);
```

### UtilityClassWithoutPrivateConstructor
Class `PropertiesPreparator` has only 'static' members, and lacks a 'private' constructor
in `collector/utils/src/main/java/org/apache/karaf/decanter/collector/utils/PropertiesPreparator.java`
#### Snippet
```java
import java.util.UUID;

public class PropertiesPreparator {

    private final static String FIELDS_ADD = "fields.add.";
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Casting `event` to `CamelEvent.CamelContextStartupFailureEvent` may produce `ClassCastException`
in `collector/camel/src/main/java/org/apache/karaf/decanter/collector/camel/CamelEventMapper.java`
#### Snippet
```java
        }
        if (event instanceof CamelEvent.CamelContextStopFailureEvent) {
            CamelEvent.CamelContextStartupFailureEvent context = (CamelEvent.CamelContextStartupFailureEvent) event;
            data.put("cause", context.getCause().toString());
        }
```

### DataFlowIssue
Casting `value` to `Integer` will produce `ClassCastException` for any non-null value
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/store/LuceneStoreImpl.java`
#### Snippet
```java
            } else if (value instanceof Float) {
                document.add(new FloatPoint(key, ((Float) value)));
                document.add(new StoredField(key, ((Integer) value)));
                points.put(key, new PointsConfig(NumberFormat.getInstance(), Float.class));
            } else if (value instanceof Double) {
```

### DataFlowIssue
Casting `value` to `Integer` will produce `ClassCastException` for any non-null value
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/store/LuceneStoreImpl.java`
#### Snippet
```java
            } else if (value instanceof Float) {
                document.add(new FloatPoint(property, ((Float) value)));
                document.add(new StoredField(property, ((Integer) value)));
                points.put(property, new PointsConfig(NumberFormat.getInstance(), Float.class));
            } else if (value instanceof Double) {
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/JmxCollector.java`
#### Snippet
```java

        try {
            connector.close();
        } catch (Exception e) {
            LOGGER.trace("Can't close JMX connector", e);
```

### DataFlowIssue
Method invocation `equalsIgnoreCase` may produce `NullPointerException`
in `appender/cassandra/src/main/java/org/apache/karaf/decanter/appender/cassandra/CassandraAppender.java`
#### Snippet
```java
        for(Row row : all) {
            String table = row.getString("table_name");
            if (table.equalsIgnoreCase(tableName)) {
                found = true;
                break;
```

### DataFlowIssue
Casting `value` to `long[]` may produce `ClassCastException`
in `marshaller/json/src/main/java/org/apache/karaf/decanter/marshaller/json/JsonMarshaller.java`
#### Snippet
```java
        } else if (value instanceof long[] || value instanceof Long[]) {
            JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
            long[] array = (long[])value;
            for (long l : array) {
                arrayBuilder.add(l);
```

### DataFlowIssue
Casting `value` to `int[]` may produce `ClassCastException`
in `marshaller/json/src/main/java/org/apache/karaf/decanter/marshaller/json/JsonMarshaller.java`
#### Snippet
```java
        } else if (value instanceof int[] || value instanceof Integer[]) {
            JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
            int[] array = (int[])value;
            for (int i : array) {
                arrayBuilder.add(i);
```

### DataFlowIssue
Method invocation `getResponseCode` may produce `NullPointerException`
in `collector/rest/src/main/java/org/apache/karaf/decanter/collector/rest/RestCollector.java`
#### Snippet
```java
                    } else {
                        try {
                            data.put("http.response.code", connection.getResponseCode());
                        } catch (Exception ie) {
                            // no-op
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `collector/socket/src/main/java/org/apache/karaf/decanter/collector/socket/SocketCollector.java`
#### Snippet
```java
    private enum Protocol {
        TCP,
        UDP;
    }

```

## RuleId[id=RedundantClassCall]
### RedundantClassCall
Redundant call to `cast()`
in `collector/system/src/main/java/org/apache/karaf/decanter/collector/system/SystemCollector.java`
#### Snippet
```java
    public void activate(ComponentContext context) {
        this.properties = context.getProperties();
        this.topic = context.getProperties().get(EventConstants.EVENT_TOPIC) != null ? String.class.cast(context.getProperties().get(EventConstants.EVENT_TOPIC)) : "decanter/collect/system/";
        if (!this.topic.endsWith("/")) {
            this.topic = this.topic + "/";
```

### RedundantClassCall
Redundant call to `cast()`
in `collector/system/src/main/java/org/apache/karaf/decanter/collector/system/SystemCollector.java`
#### Snippet
```java
        }
        try {
            this.threadNumber = context.getProperties().get("thread.number") != null ? Integer.parseInt(String.class.cast(context.getProperties().get("thread.number"))) : 1;
        } catch (Exception e) {
            throw new IllegalArgumentException("invalid parameter 'thread.number' is not a number");
```

### RedundantClassCall
Redundant call to `cast()`
in `collector/system/src/main/java/org/apache/karaf/decanter/collector/system/SystemCollector.java`
#### Snippet
```java
                results.stream().forEach(objectFuture -> {
                    try {
                        Event event = Event.class.cast(objectFuture.get());
                        if (Optional.ofNullable(event).isPresent()) {
                            dispatcher.postEvent(event);
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `collector/system/src/main/java/org/apache/karaf/decanter/collector/system/SystemCollector.java`
#### Snippet
```java
                LOGGER.debug("Start invoking system commands...");
                List<Future<Object>> results = executorService.invokeAll(callables);
                results.stream().forEach(objectFuture -> {
                    try {
                        Event event = Event.class.cast(objectFuture.get());
```

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `marshaller/json/src/main/java/org/apache/karaf/decanter/marshaller/json/JsonUnmarshaller.java`
#### Snippet
```java
        List<Object> list = new ArrayList<>();
        Iterator<JsonValue> jsonValues = value.iterator();
        while (jsonValues.hasNext()) {
            JsonValue jsonValue = jsonValues.next();
            list.add(unmarshalAttribute(jsonValue));
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `marshaller/json/src/main/java/org/apache/karaf/decanter/marshaller/json/JsonUnmarshaller.java`
#### Snippet
```java
        Map<String, Object> map = new HashMap<>();
        Iterator<Map.Entry<String, JsonValue>> entrySet = value.entrySet().iterator();
        while (entrySet.hasNext()) {
            Map.Entry<String, JsonValue> entry = entrySet.next();
            map.put(entry.getKey(), unmarshalAttribute(entry.getValue()));
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/JmxCollector.java`
#### Snippet
```java
        String password = getProperty(this.properties, "password", null);
        String remoteProtocolPkgs = getProperty(this.properties, "jmx.remote.protocol.provider.pkgs", null);
        Dictionary<String, String> serviceProperties = new Hashtable<> ();
        serviceProperties.put("decanter.collector.name", type);

```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `metrics.keySet()` may be replaced with 'values()' iteration
in `collector/dropwizard/src/main/java/org/apache/karaf/decanter/collector/dropwizard/DecanterReporterCollector.java`
#### Snippet
```java
    public void run() {
        Map<String, Metric> metrics = metricRegistry.getMetrics();
        for (String metricName : metrics.keySet()) {
            Metric metric = metrics.get(metricName);
            Map<String, Object> data = new HashMap<>();
```

### KeySetIterationMayUseEntrySet
Iteration over `pointsStore.keySet()` may be replaced with 'entrySet()' iteration
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/store/LuceneStoreImpl.java`
#### Snippet
```java
            FileReader reader = new FileReader(Paths.get(System.getProperty("karaf.data"), POINTS_DIRECTORY).toFile());
            pointsStore.load(reader);
            for (Object key : pointsStore.keySet()) {
                String value = pointsStore.get(key).toString();
                if (value.equals("double")) {
```

### KeySetIterationMayUseEntrySet
Iteration over `points.keySet()` may be replaced with 'entrySet()' iteration
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/store/LuceneStoreImpl.java`
#### Snippet
```java
    static void savePoints(Map<String, PointsConfig> points) throws Exception {
        Properties pointsStore = new Properties();
        for (String key : points.keySet()) {
            PointsConfig pointsConfig = points.get(key);
            if (pointsConfig.getType().getName().equals("java.lang.Double")) {
```

### KeySetIterationMayUseEntrySet
Iteration over `operations.keySet()` may be replaced with 'entrySet()' iteration
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/JmxCollector.java`
#### Snippet
```java
            }

            for (String operation : operations.keySet()) {
                String raw = operations.get(operation);
                String[] split = raw.split("\\|");
```

### KeySetIterationMayUseEntrySet
Iteration over `accumulation.keySet()` may be replaced with 'values()' iteration
in `processor/groupby/src/main/java/org/apache/karaf/decanter/processor/groupby/GroupByProcessor.java`
#### Snippet
```java
        public void run() {
            if (accumulation.size() > 0) {
                for (Integer hash : accumulation.keySet()) {
                    Map merge = new HashMap();
                    merge.put("processor", "groupBy");
```

### KeySetIterationMayUseEntrySet
Iteration over `jsonO.keySet()` may be replaced with 'entrySet()' iteration
in `marshaller/json/src/main/java/org/apache/karaf/decanter/marshaller/json/JsonUnmarshaller.java`
#### Snippet
```java
        JsonObject jsonO = reader.readObject();
        HashMap<String, Object> map = new HashMap<>();
        for (String key : jsonO.keySet()) {
            map.put(key, unmarshalAttribute(jsonO.get(key)));
        }
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'containsKey()' check
in `collector/utils/src/main/java/org/apache/karaf/decanter/collector/utils/PropertiesPreparator.java`
#### Snippet
```java
                    }
                } else if (key.startsWith(FIELDS_REMOVE)) {
                    if (data.containsKey(key.substring(FIELDS_REMOVE.length()))) {
                        data.remove(key.substring(FIELDS_REMOVE.length()));
                    }
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`rules.size() == 0` can be replaced with 'rules.isEmpty()'
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/model/Loader.java`
#### Snippet
```java

    static public Long oldestPeriod(List<Rule> rules) {
        if (rules == null || rules.size() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`objectNames.size() > 0` can be replaced with '!objectNames.isEmpty()'
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/JmxCollector.java`
#### Snippet
```java
            LOGGER.debug("Populating names ({})", this.objectNames);
            Set<ObjectName> names = new HashSet<> ();
            if (objectNames.size() > 0) {
                for (String objectName : this.objectNames) {
                    LOGGER.debug("Query {}", objectName);
```

### SizeReplaceableByIsEmpty
`accumulation.size() > 0` can be replaced with '!accumulation.isEmpty()'
in `processor/groupby/src/main/java/org/apache/karaf/decanter/processor/groupby/GroupByProcessor.java`
#### Snippet
```java
        @Override
        public void run() {
            if (accumulation.size() > 0) {
                for (Integer hash : accumulation.keySet()) {
                    Map merge = new HashMap();
```

### SizeReplaceableByIsEmpty
`mergedData.size() > 0` can be replaced with '!mergedData.isEmpty()'
in `processor/aggregate/src/main/java/org/apache/karaf/decanter/processor/aggregate/AggregateProcessor.java`
#### Snippet
```java
        public void run() {
            // create event and send
            if (mergedData.size() > 0) {
                mergedData.put("processor", "aggregate");
                String[] topics = targetTopics.split(",");
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marshaller/raw/src/main/java/org/apache/karaf/decanter/marshaller/raw/RawMarshaller.java`
#### Snippet
```java
            Object propertyValue = event.getProperty(propertyName);
            if (propertyName != null && propertyValue != null) {
                builder.append(propertyName).append("=").append(propertyValue.toString()).append("\n");
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/BeanHarvester.java`
#### Snippet
```java
                LOGGER.error("SecurityException: ", se);
            } catch (Exception e) {
                LOGGER.debug("Could not read attribute {} {}", name.toString(), attribute.getName());
            }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marshaller/csv/src/main/java/org/apache/karaf/decanter/marshaller/csv/CsvMarshaller.java`
#### Snippet
```java
            Object propertyValue = event.getProperty(propertyName);
            if (propertyValue != null) {
                builder.append(propertyName).append("=").append(propertyValue.toString()).append(separator);
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `collector/druid/src/main/java/org/apache/karaf/decanter/collector/druid/DruidCollector.java`
#### Snippet
```java
            }
        }
        String jsonResult = "{ \"result\": " + result.toString() + "}";
        return unmarshaller.unmarshal(new ByteArrayInputStream(jsonResult.getBytes()));
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `appender/s3/src/main/java/org/apache/karaf/decanter/appender/s3/S3Appender.java`
#### Snippet
```java
                .withCredentials(new AWSStaticCredentialsProvider(awsCreds))
                .build();
        String key = "decanter-" + System.currentTimeMillis() + "-" + UUID.randomUUID().toString();
        s3.putObject(bucket, key, marshaller.marshal(event));
    }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `collector/log/src/main/java/org/apache/karaf/decanter/collector/log/LogCollector.java`
#### Snippet
```java
    }

    private void putLocation(Map<String, Object> data, PaxLocationInfo loc) {
        if (loc != null) {
            data.put("loc.class", loc.getClassName());
```

### BoundedWildcard
Can generalize to `? super String`
in `collector/dropwizard/src/main/java/org/apache/karaf/decanter/collector/dropwizard/DecanterReporterCollector.java`
#### Snippet
```java
    }

    private void populateSnapshot(Snapshot snapshot, Map<String, Object> data) {
        data.put("75th Percentile", snapshot.get75thPercentile());
        data.put("95th Percentile", snapshot.get95thPercentile());
```

### BoundedWildcard
Can generalize to `? extends Rule`
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/model/Loader.java`
#### Snippet
```java
    }

    static public Long oldestPeriod(List<Rule> rules) {
        if (rules == null || rules.size() == 0) {
            return null;
```

### BoundedWildcard
Can generalize to `? super String`
in `collector/log4j-socket/src/main/java/org/apache/karaf/decanter/collector/log/socket/SocketCollector.java`
#### Snippet
```java
    }

    private void putLocation(Map<String, Object> data, LocationInfo loc) {
        data.put("loc.class", loc.getClassName());
        data.put("loc.file", loc.getFileName());
```

### BoundedWildcard
Can generalize to `? extends PointsConfig`
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/store/LuceneStoreImpl.java`
#### Snippet
```java

    /* visible for testing */
    static void savePoints(Map<String, PointsConfig> points) throws Exception {
        Properties pointsStore = new Properties();
        for (String key : points.keySet()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `collector/camel/src/main/java/org/apache/karaf/decanter/collector/camel/DefaultExchangeExtender.java`
#### Snippet
```java
    }

    private static void setHistory(Map<String, Object> data, Exchange exchange) {
        List<MessageHistory> messageHistory = exchange.getProperty(Exchange.MESSAGE_HISTORY, List.class);
        if (messageHistory != null && !messageHistory.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `collector/utils/src/main/java/org/apache/karaf/decanter/collector/utils/PropertiesPreparator.java`
#### Snippet
```java
     * @param properties Custom properties included in the data.
     */
    public static void prepare(Map<String, Object> data, Dictionary<String, Object> properties) throws Exception {
        // add the karaf instance name if it doesn't exist in the data
        String karafName = (String) data.get("karafName");
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `marshaller/raw/src/main/java/org/apache/karaf/decanter/marshaller/raw/RawUnmarshaller.java`
#### Snippet
```java
public class RawUnmarshaller implements Unmarshaller {

    private final static Logger LOGGER = LoggerFactory.getLogger(RawUnmarshaller.class);

    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/log/src/main/java/org/apache/karaf/decanter/collector/log/LogCollector.java`
#### Snippet
```java

    private static final String MDC_IN_LOG_COLLECTOR = "inLogCollector";
    private final static Logger LOGGER = LoggerFactory.getLogger(LogCollector.class);
    private final static Pattern PATTERN = Pattern.compile("[^A-Za-z0-9]");

```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/log/src/main/java/org/apache/karaf/decanter/collector/log/LogCollector.java`
#### Snippet
```java
    private static final String MDC_IN_LOG_COLLECTOR = "inLogCollector";
    private final static Logger LOGGER = LoggerFactory.getLogger(LogCollector.class);
    private final static Pattern PATTERN = Pattern.compile("[^A-Za-z0-9]");

    private Dictionary<String, Object> properties;
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/configadmin/src/main/java/org/apache/karaf/decanter/collector/configadmin/ConfigAdminCollector.java`
#### Snippet
```java
public class ConfigAdminCollector implements ConfigurationListener {

    private final static Logger LOGGER = LoggerFactory.getLogger(ConfigAdminCollector.class);

    @Reference
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/mqtt/src/main/java/org/apache/karaf/decanter/appender/mqtt/MqttAppender.java`
#### Snippet
```java
    public Marshaller marshaller;

    private final static Logger LOGGER = LoggerFactory.getLogger(MqttAppender.class);

    private MqttClient client;
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/prometheus/src/main/java/org/apache/karaf/decanter/collector/prometheus/PrometheusCollector.java`
#### Snippet
```java
public class PrometheusCollector implements Runnable {

    private final static Logger LOGGER = LoggerFactory.getLogger(PrometheusCollector.class);

    @Reference
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/system/src/main/java/org/apache/karaf/decanter/collector/system/SystemCollector.java`
#### Snippet
```java
    public EventAdmin dispatcher;

    private final static Logger LOGGER = LoggerFactory.getLogger(SystemCollector.class);

    private Dictionary<String, Object> properties;
```

### MissortedModifiers
Missorted modifiers `final static`
in `parser/split/src/main/java/org/apache/karaf/decanter/parser/split/SplitParser.java`
#### Snippet
```java
public class SplitParser implements Parser {

    private final static Logger LOGGER = LoggerFactory.getLogger(SplitParser.class);

    private String separator;
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/loki/src/main/java/org/apache/karaf/decanter/appender/loki/LokiAppender.java`
#### Snippet
```java
public class LokiAppender implements EventHandler {

    private final static Logger LOGGER = LoggerFactory.getLogger(LokiAppender.class);

    @Reference(cardinality = ReferenceCardinality.OPTIONAL)
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/jdbc/src/main/java/org/apache/karaf/decanter/collector/jdbc/JdbcCollector.java`
#### Snippet
```java
    public DataSource dataSource;

    private final static Logger LOGGER = LoggerFactory.getLogger(JdbcCollector.class);

    private String query;
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/hdfs/src/main/java/org/apache/karaf/decanter/appender/hdfs/HdfsAppender.java`
#### Snippet
```java
public class HdfsAppender implements EventHandler {

    private final static Logger LOGGER = LoggerFactory.getLogger(HdfsAppender.class);

    private Dictionary<String, Object> config;
```

### MissortedModifiers
Missorted modifiers `static public`
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/model/Loader.java`
#### Snippet
```java
    }

    static public Long oldestPeriod(List<Rule> rules) {
        if (rules == null || rules.size() == 0) {
            return null;
```

### MissortedModifiers
Missorted modifiers `static public`
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/model/Loader.java`
#### Snippet
```java
    private final static Logger LOGGER = LoggerFactory.getLogger(Loader.class);

    static public List<Rule> load(Dictionary<String, Object> configuration) {
        List<Rule> rules = new ArrayList<>();
        if (configuration == null) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/model/Loader.java`
#### Snippet
```java
public class Loader {

    private final static Logger LOGGER = LoggerFactory.getLogger(Loader.class);

    static public List<Rule> load(Dictionary<String, Object> configuration) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/timescaledb/src/main/java/org/apache/karaf/decanter/appender/timescaledb/TimescaleDbAppender.java`
#### Snippet
```java
    private final static Logger LOGGER = LoggerFactory.getLogger(TimescaleDbAppender.class);

    private final static String createExtensionTemplate =
            "CREATE EXTENSION IF NOT EXISTS timescaledb CASCADE";
    private final static String createTableQueryTemplate =
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/timescaledb/src/main/java/org/apache/karaf/decanter/appender/timescaledb/TimescaleDbAppender.java`
#### Snippet
```java
    private final static String createTableQueryTemplate =
            "CREATE TABLE TABLENAME(timestamp BIGINT, content text)";
    private final static String convertHyperTableQueryTemplate =
            "SELECT * FROM create_hypertable('TABLENAME', 'timestamp', chunk_time_interval=>_timescaledb_internal.interval_to_usec('1 day'), migrate_data => true);";

```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/timescaledb/src/main/java/org/apache/karaf/decanter/appender/timescaledb/TimescaleDbAppender.java`
#### Snippet
```java
    public DataSource dataSource;

    private final static Logger LOGGER = LoggerFactory.getLogger(TimescaleDbAppender.class);

    private final static String createExtensionTemplate =
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/timescaledb/src/main/java/org/apache/karaf/decanter/appender/timescaledb/TimescaleDbAppender.java`
#### Snippet
```java
    private final static String createExtensionTemplate =
            "CREATE EXTENSION IF NOT EXISTS timescaledb CASCADE";
    private final static String createTableQueryTemplate =
            "CREATE TABLE TABLENAME(timestamp BIGINT, content text)";
    private final static String convertHyperTableQueryTemplate =
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/timescaledb/src/main/java/org/apache/karaf/decanter/appender/timescaledb/TimescaleDbAppender.java`
#### Snippet
```java
            "SELECT * FROM create_hypertable('TABLENAME', 'timestamp', chunk_time_interval=>_timescaledb_internal.interval_to_usec('1 day'), migrate_data => true);";

    private final static String insertQueryTemplate =
            "INSERT INTO TABLENAME(timestamp, content) VALUES(?,?)";

```

### MissortedModifiers
Missorted modifiers `final static`
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/event/Handler.java`
#### Snippet
```java
    public Store store;

    private final static Logger LOGGER = LoggerFactory.getLogger(Handler.class);

    private List<Rule> rules;
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/rest/src/main/java/org/apache/karaf/decanter/appender/rest/RestAppender.java`
#### Snippet
```java
    public Marshaller marshaller;

    private final static Logger LOGGER = LoggerFactory.getLogger(RestAppender.class);

    private URI uri;
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/jdbc/src/main/java/org/apache/karaf/decanter/appender/jdbc/JdbcAppender.java`
#### Snippet
```java
    private final static Logger LOGGER = LoggerFactory.getLogger(JdbcAppender.class);

    private final static String createTableQueryGenericTemplate =
            "CREATE TABLE TABLENAME(timestamp BIGINT, content VARCHAR(8192))";
    private final static String createTableQueryMySQLTemplate =
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/jdbc/src/main/java/org/apache/karaf/decanter/appender/jdbc/JdbcAppender.java`
#### Snippet
```java
    private final static String createTableQueryGenericTemplate =
            "CREATE TABLE TABLENAME(timestamp BIGINT, content VARCHAR(8192))";
    private final static String createTableQueryMySQLTemplate =
            "CREATE TABLE TABLENAME(timestamp BIGINT, content CLOB)";
    private final static String createTableQueryDerbyTemplate =
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/jdbc/src/main/java/org/apache/karaf/decanter/appender/jdbc/JdbcAppender.java`
#### Snippet
```java
            "CREATE TABLE TABLENAME(timestamp BIGINT, content CLOB)";

    private final static String insertQueryTemplate =
            "INSERT INTO TABLENAME(timestamp, content) VALUES(?,?)";

```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/jdbc/src/main/java/org/apache/karaf/decanter/appender/jdbc/JdbcAppender.java`
#### Snippet
```java
    public DataSource dataSource;

    private final static Logger LOGGER = LoggerFactory.getLogger(JdbcAppender.class);

    private final static String createTableQueryGenericTemplate =
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/jdbc/src/main/java/org/apache/karaf/decanter/appender/jdbc/JdbcAppender.java`
#### Snippet
```java
    private final static String createTableQueryMySQLTemplate =
            "CREATE TABLE TABLENAME(timestamp BIGINT, content CLOB)";
    private final static String createTableQueryDerbyTemplate =
            "CREATE TABLE TABLENAME(timestamp BIGINT, content CLOB)";

```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/mqtt/src/main/java/org/apache/karaf/decanter/collector/mqtt/MqttCollector.java`
#### Snippet
```java
    public Unmarshaller unmarshaller;

    private final static Logger LOGGER = LoggerFactory.getLogger(MqttCollector.class);

    private Dictionary<String, Object> properties;
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/soap/src/main/java/org/apache/karaf/decanter/collector/soap/SoapCollector.java`
#### Snippet
```java
    public EventAdmin dispatcher;

    private final static Logger LOGGER = LoggerFactory.getLogger(SoapCollector.class);

    private URL url;
```

### MissortedModifiers
Missorted modifiers `final static`
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/store/LuceneStoreImpl.java`
#### Snippet
```java
public class LuceneStoreImpl implements Store {

    private final static Logger LOGGER = LoggerFactory.getLogger(LuceneStoreImpl.class);

    private Directory directory;
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/camel/src/main/java/org/apache/karaf/decanter/appender/camel/CamelAppender.java`
#### Snippet
```java
    private Dictionary<String, Object> config;

    private final static Logger LOGGER = LoggerFactory.getLogger(CamelAppender.class);

    @Activate
```

### MissortedModifiers
Missorted modifiers `final static`
in `alerting/alerter/log/src/main/java/org/apache/karaf/decanter/alerting/log/Logger.java`
#### Snippet
```java
public class Logger implements EventHandler {

    private final static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Logger.class);

    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/elasticsearch/src/main/java/org/apache/karaf/decanter/appender/elasticsearch/ElasticsearchAppender.java`
#### Snippet
```java
    private final SimpleDateFormat indexDateFormat = new SimpleDateFormat("yyyy.MM.dd");

    private final static Logger LOGGER = LoggerFactory.getLogger(ElasticsearchAppender.class);

    @SuppressWarnings("unchecked")
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/BeanHarvester.java`
#### Snippet
```java
class BeanHarvester {

    private final static Logger LOGGER = LoggerFactory.getLogger(BeanHarvester.class);

    private MBeanServerConnection connection;
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/jms/src/main/java/org/apache/karaf/decanter/appender/jms/JmsAppender.java`
#### Snippet
```java
    public Marshaller marshaller;

    private final static Logger LOGGER = LoggerFactory.getLogger(JmsAppender.class);

    private Dictionary<String, Object> config;
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/JmxCollector.java`
#### Snippet
```java
    public EventAdmin dispatcher;

    private final static Logger LOGGER = LoggerFactory.getLogger(JmxCollector.class);

    private String type;
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/utils/src/main/java/org/apache/karaf/decanter/collector/utils/PropertiesPreparator.java`
#### Snippet
```java
    private final static String FIELDS_ADD = "fields.add.";
    private final static String FIELDS_RENAME = "fields.rename.";
    private final static String FIELDS_REMOVE = "fields.remove.";

    private static SimpleDateFormat tsFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX");
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/utils/src/main/java/org/apache/karaf/decanter/collector/utils/PropertiesPreparator.java`
#### Snippet
```java

    private final static String FIELDS_ADD = "fields.add.";
    private final static String FIELDS_RENAME = "fields.rename.";
    private final static String FIELDS_REMOVE = "fields.remove.";

```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/utils/src/main/java/org/apache/karaf/decanter/collector/utils/PropertiesPreparator.java`
#### Snippet
```java
public class PropertiesPreparator {

    private final static String FIELDS_ADD = "fields.add.";
    private final static String FIELDS_RENAME = "fields.rename.";
    private final static String FIELDS_REMOVE = "fields.remove.";
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/elasticsearch/src/main/java/org/apache/karaf/decanter/collector/elasticsearch/ElasticsearchCollector.java`
#### Snippet
```java
public class ElasticsearchCollector implements Runnable {

    private final static Logger LOGGER = LoggerFactory.getLogger(ElasticsearchCollector.class);

    @Reference
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/kafka/src/main/java/org/apache/karaf/decanter/appender/kafka/KafkaAppender.java`
#### Snippet
```java
    public Marshaller marshaller;

    private final static Logger LOGGER = LoggerFactory.getLogger(KafkaAppender.class);

    private Dictionary<String, Object> config;
```

### MissortedModifiers
Missorted modifiers `final static`
in `marshaller/csv/src/main/java/org/apache/karaf/decanter/marshaller/csv/CsvMarshaller.java`
#### Snippet
```java
public class CsvMarshaller implements Marshaller {

    private final static Logger LOGGER = LoggerFactory.getLogger(CsvMarshaller.class);

    private String separator = ",";
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/druid/src/main/java/org/apache/karaf/decanter/collector/druid/DruidCollector.java`
#### Snippet
```java
    private Dictionary<String, Object> config;

    private final static Logger LOGGER = LoggerFactory.getLogger(DruidCollector.class);

    @Activate
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/mongodb/src/main/java/org/apache/karaf/decanter/appender/mongodb/MongoDbAppender.java`
#### Snippet
```java
    public Marshaller marshaller;

    private final static Logger LOGGER = LoggerFactory.getLogger(MongoDbAppender.class);

    private MongoClient mongoClient;
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/socket/src/main/java/org/apache/karaf/decanter/appender/socket/SocketAppender.java`
#### Snippet
```java
    public Marshaller marshaller;

    private final static Logger LOGGER = LoggerFactory.getLogger(SocketAppender.class);

    private Dictionary<String, Object> config;
```

### MissortedModifiers
Missorted modifiers `final static`
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java
public class EmailAlerter implements EventHandler {

    private final static Logger LOGGER = LoggerFactory.getLogger(EmailAlerter.class);

    private String from = null;
```

### MissortedModifiers
Missorted modifiers `final static`
in `parser/regex/src/main/java/org/apache/karaf/decanter/parser/regex/RegexParser.java`
#### Snippet
```java
public class RegexParser implements Parser {

    private final static Logger LOGGER = LoggerFactory.getLogger(RegexParser.class);

    private Pattern pattern;
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/cassandra/src/main/java/org/apache/karaf/decanter/appender/cassandra/CassandraAppender.java`
#### Snippet
```java
    public Marshaller marshaller;

    private final static String createTableTemplate = "CREATE TABLE IF NOT EXISTS %s (timeStamp timestamp PRIMARY KEY, content Text);";

    private CqlSession session;
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/cassandra/src/main/java/org/apache/karaf/decanter/appender/cassandra/CassandraAppender.java`
#### Snippet
```java
    public static final String CASSANDRA_PORT_DEFAULT = "9042";

    private final static Logger LOGGER = LoggerFactory.getLogger(CassandraAppender.class);

    private Dictionary<String, Object> config;
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/redis/src/main/java/org/apache/karaf/decanter/collector/redis/RedisCollector.java`
#### Snippet
```java
public class RedisCollector implements Runnable {

    private final static Logger LOGGER = LoggerFactory.getLogger(RedisCollector.class);

    @Reference
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/file/src/main/java/org/apache/karaf/decanter/collector/file/DecanterTailerListener.java`
#### Snippet
```java
    public Parser parser;

    private final static Logger LOGGER = LoggerFactory.getLogger(DecanterTailerListener.class);

    private String type;
```

### MissortedModifiers
Missorted modifiers `final static`
in `appender/s3/src/main/java/org/apache/karaf/decanter/appender/s3/S3Appender.java`
#### Snippet
```java
public class S3Appender implements EventHandler {

    private final static Logger LOGGER = LoggerFactory.getLogger(S3Appender.class);

    private Regions regions;
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/jms/src/main/java/org/apache/karaf/decanter/collector/jms/JmsCollector.java`
#### Snippet
```java
    public EventAdmin dispatcher;

    private final static Logger LOGGER = LoggerFactory.getLogger(JmsCollector.class);

    private Dictionary<String, Object> properties;
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/rest-servlet/src/main/java/org/apache/karaf/decanter/collector/rest/servlet/RestServletCollector.java`
#### Snippet
```java
    public Unmarshaller unmarshaller;

    private final static Logger LOGGER = LoggerFactory.getLogger(RestServletCollector.class);

    private String topic;
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/snmp/src/main/java/org/apache/karaf/decanter/collector/snmp/SnmpTrap.java`
#### Snippet
```java
public class SnmpTrap implements CommandResponder {

    private final static Logger LOGGER = LoggerFactory.getLogger(SnmpTrap.class);

    @Reference
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/rest/src/main/java/org/apache/karaf/decanter/collector/rest/RestCollector.java`
#### Snippet
```java
    public Unmarshaller unmarshaller;

    private final static Logger LOGGER = LoggerFactory.getLogger(RestCollector.class);

    private URL url;
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/snmp/src/main/java/org/apache/karaf/decanter/collector/snmp/SnmpPoller.java`
#### Snippet
```java
public class SnmpPoller implements ResponseListener, Runnable {

    private final static Logger LOGGER = LoggerFactory.getLogger(SnmpPoller.class);

    @Reference
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
    public Unmarshaller unmarshaller;

    private final static Logger LOGGER = LoggerFactory.getLogger(OpenstackCollector.class);

    private Dictionary<String, Object> config;
```

### MissortedModifiers
Missorted modifiers `final static`
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
public class OshiCollector implements Runnable {

    private final static Logger LOGGER = LoggerFactory.getLogger(OshiCollector.class);

    @Reference
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `alerting/alerter/camel/src/main/java/org/apache/karaf/decanter/alerting/camel/CamelAlerter.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Activate
    public void activate(ComponentContext context) throws ConfigurationException {
        Dictionary<String, Object> config = context.getProperties();
        this.alertDestinationUri = (String) config.get("alert.destination.uri");
```

### RedundantSuppression
Redundant suppression
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public void activate(ComponentContext context) throws ConfigurationException {
        activate(context.getProperties());
    }
```

### RedundantSuppression
Redundant suppression
in `appender/cassandra/src/main/java/org/apache/karaf/decanter/appender/cassandra/CassandraAppender.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Activate
    public void activate(ComponentContext context) {
        Dictionary<String, Object> config = context.getProperties();
        activate(config);
```

### RedundantSuppression
Redundant suppression
in `appender/elasticsearch/src/main/java/org/apache/karaf/decanter/appender/elasticsearch/ElasticsearchAppender.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Activate
    public void activate(ComponentContext context) {
        open(context.getProperties());
    }
```

### RedundantSuppression
Redundant suppression
in `appender/jdbc/src/main/java/org/apache/karaf/decanter/appender/jdbc/JdbcAppender.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Activate
    public void activate(ComponentContext context) {
        open(context.getProperties());
    }
```

### RedundantSuppression
Redundant suppression
in `appender/jms/src/main/java/org/apache/karaf/decanter/appender/jms/JmsAppender.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Activate
    public void activate(ComponentContext context) {
        activate(context.getProperties());
    }
```

### RedundantSuppression
Redundant suppression
in `appender/kafka/src/main/java/org/apache/karaf/decanter/appender/kafka/KafkaAppender.java`
#### Snippet
```java
    @Activate
    @SuppressWarnings("unchecked")
    public void activate(ComponentContext context) {
        activate(context.getProperties());
    }
```

### RedundantSuppression
Redundant suppression
in `appender/rest/src/main/java/org/apache/karaf/decanter/appender/rest/RestAppender.java`
#### Snippet
```java
    @Activate
    @SuppressWarnings("unchecked")
    public void activate(ComponentContext context) throws URISyntaxException {
        Dictionary<String, Object> config = context.getProperties();
        activate(config);
```

### RedundantSuppression
Redundant suppression
in `appender/timescaledb/src/main/java/org/apache/karaf/decanter/appender/timescaledb/TimescaleDbAppender.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Activate
    public void activate(ComponentContext context) {
        open(context.getProperties());
    }
```

### RedundantSuppression
Redundant suppression
in `collector/file/src/main/java/org/apache/karaf/decanter/collector/file/DecanterTailerListener.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Activate
    public void activate(ComponentContext context) throws ConfigurationException {
        properties = context.getProperties();
        if (properties.get("type") == null) {
```

### RedundantSuppression
Redundant suppression
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/JmxCollector.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public void activate(ComponentContext context) {
        this.properties = context.getProperties();
        String type = getProperty(this.properties, "type", "jmx-local");
```

### RedundantSuppression
Redundant suppression
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Activate
    public void activate(ComponentContext componentContext) {
        properties = componentContext.getProperties();

```

### RedundantSuppression
Redundant suppression
in `collector/log/src/main/java/org/apache/karaf/decanter/collector/log/LogCollector.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Activate
    public void activate(ComponentContext context) {
        this.properties = context.getProperties();
        if (this.properties.get("ignored.categories") != null) {
```

### RedundantSuppression
Redundant suppression
in `collector/log4j-socket/src/main/java/org/apache/karaf/decanter/collector/log/socket/SocketCollector.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Activate
    public void activate(ComponentContext context) throws IOException {
        this.properties = context.getProperties();
        int port = Integer.parseInt(getProperty(this.properties, PORT_NAME, "4560"));
```

### RedundantSuppression
Redundant suppression
in `collector/rest-servlet/src/main/java/org/apache/karaf/decanter/collector/rest/servlet/RestServletCollector.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Activate
    public void activate(ComponentContext context) throws MalformedURLException {
        Dictionary<String, Object> props = context.getProperties();
        this.topic = getProperty(props, EventConstants.EVENT_TOPIC, "decanter/collect/rest-servlet");
```

### RedundantSuppression
Redundant suppression
in `collector/system/src/main/java/org/apache/karaf/decanter/collector/system/SystemCollector.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    @Activate
    public void activate(ComponentContext context) {
        this.properties = context.getProperties();
        this.topic = context.getProperties().get(EventConstants.EVENT_TOPIC) != null ? String.class.cast(context.getProperties().get(EventConstants.EVENT_TOPIC)) : "decanter/collect/system/";
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `marshaller/json/src/main/java/org/apache/karaf/decanter/marshaller/json/JsonMarshaller.java`
#### Snippet
```java
    public void activate(Dictionary<String, Object> config) {
        replaceDotsByUnderscores = (config.get("replaceDotsByUnderscores") != null) ? 
            Boolean.valueOf((String) config.get("replaceDotsByUnderscores")) : true;
    }

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `appender/rest/src/main/java/org/apache/karaf/decanter/appender/rest/RestAppender.java`
#### Snippet
```java
                }
                InputStream is = connection.getInputStream();
                is.read();
                is.close();
            } catch (Exception e) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `appender/file/src/main/java/org/apache/karaf/decanter/appender/file/FileAppender.java`
#### Snippet
```java

        File file = new File(filename);
        file.getParentFile().mkdirs();
        file.createNewFile();
        this.writer = new BufferedWriter(new FileWriter(file, append));
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `appender/file/src/main/java/org/apache/karaf/decanter/appender/file/FileAppender.java`
#### Snippet
```java
        File file = new File(filename);
        file.getParentFile().mkdirs();
        file.createNewFile();
        this.writer = new BufferedWriter(new FileWriter(file, append));
    }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/command/ListAlerts.java`
#### Snippet
```java
        List<Alert> alerts = store.list();
        for (Alert alert : alerts) {
            System.out.println("=========================================");
            for (String key : alert.get().keySet()) {
                System.out.println("| " + key + " = " + alert.get(key));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/command/ListAlerts.java`
#### Snippet
```java
            System.out.println("=========================================");
            for (String key : alert.get().keySet()) {
                System.out.println("| " + key + " = " + alert.get(key));
            }
        }
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java
            String value = record.value();
            if (messageType.equalsIgnoreCase("text")) {
                ByteArrayInputStream is = new ByteArrayInputStream(value.getBytes("utf-8"));
                data.putAll(unmarshaller.unmarshal(is));
            } else {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/store/LuceneStoreImpl.java`
#### Snippet
```java
                if (value != null) {
                    String stringValue = value.toString();
                    if (stringValue.getBytes("UTF-8").length > 32766) {
                        stringValue = new String(stringValue.getBytes("UTF-8"), 0, 32766, "UTF-8");
                    }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/store/LuceneStoreImpl.java`
#### Snippet
```java
                    String stringValue = value.toString();
                    if (stringValue.getBytes("UTF-8").length > 32766) {
                        stringValue = new String(stringValue.getBytes("UTF-8"), 0, 32766, "UTF-8");
                    }
                    document.add(new StringField(property, stringValue, Field.Store.YES));
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/store/LuceneStoreImpl.java`
#### Snippet
```java
                    String stringValue = value.toString();
                    if (stringValue.getBytes("UTF-8").length > 32766) {
                        stringValue = new String(stringValue.getBytes("UTF-8"), 0, 32766, "UTF-8");
                    }
                    document.add(new StringField(property, stringValue, Field.Store.YES));
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/command/RemoveAlert.java`
#### Snippet
```java
    private Store store;

    @Argument(index = 0, name = "uuid", description = "The alert UUID", required = true, multiValued = false)
    @Completion(AlertUUIDCompleter.class)
    private String uuid;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/command/RemoveAlert.java`
#### Snippet
```java
    private Store store;

    @Argument(index = 0, name = "uuid", description = "The alert UUID", required = true, multiValued = false)
    @Completion(AlertUUIDCompleter.class)
    private String uuid;
```

## RuleId[id=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java
    @Override
    public void run() {
        while (consuming) {
            try {
                consume();
```

### WhileLoopSpinsOnField
`while` loop spins on field
in `collector/socket/src/main/java/org/apache/karaf/decanter/collector/socket/SocketCollector.java`
#### Snippet
```java
    @Override
    public void run() {
        while (open) {
            try {
                switch (protocol) {
```

### WhileLoopSpinsOnField
`while` loop spins on field
in `collector/log4j-socket/src/main/java/org/apache/karaf/decanter/collector/log/socket/SocketCollector.java`
#### Snippet
```java
    @Override
    public void run() {
        while (open) {
            try {
                Socket socket = serverSocket.accept();
```

### WhileLoopSpinsOnField
`while` loop spins on field
in `collector/log4j-socket/src/main/java/org/apache/karaf/decanter/collector/log/socket/SocketCollector.java`
#### Snippet
```java
            try (ObjectInputStream ois = new LoggingEventObjectInputStream(new BufferedInputStream(clientSocket
                .getInputStream()))) {
                while (open) {
                    try {
                        Object event = ois.readObject();
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'attributeObject instanceof CompositeDataSupport' covered by subsequent condition 'attributeObject instanceof CompositeData'
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/BeanHarvester.java`
#### Snippet
```java
                } else if (attributeObject instanceof ObjectName) {
                    data.put(attribute.getName(), ((ObjectName) attributeObject).toString());
                } else if (attributeObject instanceof CompositeDataSupport || attributeObject instanceof CompositeData) {
                    CompositeData cds = (CompositeData) attributeObject;
                    CompositeType compositeType = cds.getCompositeType();
```

### ConditionCoveredByFurtherCondition
Condition 'attributeObject instanceof TabularDataSupport' covered by subsequent condition 'attributeObject instanceof TabularData'
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/BeanHarvester.java`
#### Snippet
```java
                        || attributeObject instanceof Double) {
                    data.put(attribute.getName(), attributeObject);
                } else if (attributeObject instanceof TabularDataSupport || attributeObject instanceof TabularData) {
                    TabularData tds = (TabularData) attributeObject;
                    TabularType tabularType = tds.getTabularType();
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `collector/prometheus/src/main/java/org/apache/karaf/decanter/collector/prometheus/PrometheusCollector.java`
#### Snippet
```java
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.matches("# TYPE .* gauge")) {
                        line = reader.readLine();
                        if (line == null) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `collector/system/src/main/java/org/apache/karaf/decanter/collector/system/SystemCollector.java`
#### Snippet
```java
                            }
                            streamHandler.stop();
                            event = new Event(topic + key.replace(".", "_"), data);
                        } catch (Exception e) {
                            LOGGER.warn("Command {} execution failed", key, e);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/model/Loader.java`
#### Snippet
```java
                rule.setName(key.substring("rule.".length()));
                String ruleDefinition = (String) configuration.get(key);
                ruleDefinition = ruleDefinition.replaceAll("'", "\"");
                if (ruleDefinition != null && !ruleDefinition.isEmpty()) {
                    JsonReader jsonReader = Json.createReader(new StringReader(ruleDefinition));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `appender/timescaledb/src/main/java/org/apache/karaf/decanter/appender/timescaledb/TimescaleDbAppender.java`
#### Snippet
```java
        String tableName = getValue(config, TABLE_NAME_PROPERTY, TABLE_NAME_DEFAULT);
        String createTemplate = createTableQueryTemplate;
        String createTableQuery = createTemplate.replaceAll("TABLENAME", tableName);

        String convertTemplate = convertHyperTableQueryTemplate;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `appender/timescaledb/src/main/java/org/apache/karaf/decanter/appender/timescaledb/TimescaleDbAppender.java`
#### Snippet
```java

        String convertTemplate = convertHyperTableQueryTemplate;
        String convertTableQuery = convertTemplate.replaceAll("TABLENAME", tableName);

        try (Statement createStatement = connection.createStatement()) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `appender/timescaledb/src/main/java/org/apache/karaf/decanter/appender/timescaledb/TimescaleDbAppender.java`
#### Snippet
```java
                String tableName = getValue(config, TABLE_NAME_PROPERTY, TABLE_NAME_DEFAULT);
                String jsonSt = marshaller.marshal(event);
                String insertQuery = insertQueryTemplate.replaceAll("TABLENAME", tableName);
                Long timestamp = (Long) event.getProperty(EventConstants.TIMESTAMP);
                if (timestamp == null) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `appender/jdbc/src/main/java/org/apache/karaf/decanter/appender/jdbc/JdbcAppender.java`
#### Snippet
```java
            try (Connection connection = dataSource.getConnection()) {
                String jsonSt = marshaller.marshal(event);
                String insertQuery = insertQueryTemplate.replaceAll("TABLENAME", getValue(config, TABLE_NAME_PROPERTY, TABLE_NAME_DEFAULT));
                Long timestamp = (Long) event.getProperty(EventConstants.TIMESTAMP);
                if (timestamp == null) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `appender/jdbc/src/main/java/org/apache/karaf/decanter/appender/jdbc/JdbcAppender.java`
#### Snippet
```java
            createTemplate = createTableQueryGenericTemplate;
        }
        String createTableQuery = createTemplate.replaceAll("TABLENAME", getValue(config, TABLE_NAME_PROPERTY, TABLE_NAME_DEFAULT));
        try (Statement createStatement = connection.createStatement()) {
            createStatement.executeUpdate(createTableQuery);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `collector/log4j-socket/src/main/java/org/apache/karaf/decanter/collector/log/socket/SocketCollector.java`
#### Snippet
```java
            outSt = outSt.substring(0, outSt.length() - 1);
        }
        return topic + outSt.replace(".", "/");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `appender/prometheus/src/main/java/org/apache/karaf/decanter/appender/prometheus/PrometheusServlet.java`
#### Snippet
```java
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (entry.getValue() instanceof Long || entry.getValue() instanceof Integer) {
                            String convertedProperty = (property + "." + entry.getKey()).replace(".", "_");
                            Gauge gauge = gauges.get(convertedProperty);
                            if (gauge == null) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `appender/prometheus/src/main/java/org/apache/karaf/decanter/appender/prometheus/PrometheusServlet.java`
#### Snippet
```java
                }
                if (event.getProperty(property) instanceof Long || event.getProperty(property) instanceof Integer) {
                    String convertedProperty = property.replace(".", "_");
                    Gauge gauge = gauges.get(convertedProperty);
                    if (gauge == null) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/JmxCollector.java`
#### Snippet
```java

    private String getTopic(ObjectName name) {
        return name.getDomain().replace(".", "/").replace(" ", "_");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/JmxCollector.java`
#### Snippet
```java

    private String getTopic(ObjectName name) {
        return name.getDomain().replace(".", "/").replace(" ", "_");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        if (computeUsageFlatten) {
            String extract = response.substring(response.indexOf("[") +1, response.indexOf("]"));
            String[] split = extract.split("}, \\{");
            for (int i = 0; i < split.length; i++) {
                Map<String, Object> data = new HashMap<>();
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.apache.karaf.decanter.alerting.service.model.Rule;`
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/Store.java`
#### Snippet
```java
package org.apache.karaf.decanter.alerting.service;

import org.apache.karaf.decanter.alerting.service.model.Rule;
import org.osgi.service.event.Event;

```

### UNUSED_IMPORT
Unused import `import org.osgi.framework.FrameworkUtil;`
in `appender/camel/src/main/java/org/apache/karaf/decanter/appender/camel/CamelAppender.java`
#### Snippet
```java
import org.apache.karaf.decanter.appender.utils.EventFilter;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.component.ComponentContext;
```

### UNUSED_IMPORT
Unused import `import org.osgi.service.cm.ConfigurationException;`
in `appender/hdfs/src/main/java/org/apache/karaf/decanter/appender/hdfs/HdfsAppender.java`
#### Snippet
```java
import org.apache.karaf.decanter.api.marshaller.Marshaller;
import org.apache.karaf.decanter.appender.utils.EventFilter;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.model.ProcessorDefinition;`
in `collector/camel/src/main/java/org/apache/karaf/decanter/collector/camel/DecanterInterceptStrategy.java`
#### Snippet
```java
import org.apache.camel.NamedNode;
import org.apache.camel.Processor;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.camel.spi.InterceptStrategy;
import org.osgi.service.event.Event;
```

### UNUSED_IMPORT
Unused import `import co.elastic.clients.elasticsearch.ElasticsearchClient;`
in `collector/elasticsearch/src/main/java/org/apache/karaf/decanter/collector/elasticsearch/ElasticsearchCollector.java`
#### Snippet
```java

import co.elastic.clients.elasticsearch.ElasticsearchAsyncClient;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryBase;
```

### UNUSED_IMPORT
Unused import `import co.elastic.clients.elasticsearch._types.query_dsl.Query;`
in `collector/elasticsearch/src/main/java/org/apache/karaf/decanter/collector/elasticsearch/ElasticsearchCollector.java`
#### Snippet
```java
import co.elastic.clients.elasticsearch.ElasticsearchAsyncClient;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryBase;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryBuilders;
```

### UNUSED_IMPORT
Unused import `import co.elastic.clients.elasticsearch._types.query_dsl.SimpleQueryStringQuery;`
in `collector/elasticsearch/src/main/java/org/apache/karaf/decanter/collector/elasticsearch/ElasticsearchCollector.java`
#### Snippet
```java
import co.elastic.clients.elasticsearch._types.query_dsl.QueryBase;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryBuilders;
import co.elastic.clients.elasticsearch._types.query_dsl.SimpleQueryStringQuery;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
```

### UNUSED_IMPORT
Unused import `import co.elastic.clients.elasticsearch.core.SearchResponse;`
in `collector/elasticsearch/src/main/java/org/apache/karaf/decanter/collector/elasticsearch/ElasticsearchCollector.java`
#### Snippet
```java
import co.elastic.clients.elasticsearch._types.query_dsl.SimpleQueryStringQuery;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.elasticsearch.core.search.HitsMetadata;
```

### UNUSED_IMPORT
Unused import `import co.elastic.clients.elasticsearch.core.search.HitsMetadata;`
in `collector/elasticsearch/src/main/java/org/apache/karaf/decanter/collector/elasticsearch/ElasticsearchCollector.java`
#### Snippet
```java
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.elasticsearch.core.search.HitsMetadata;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
```

### UNUSED_IMPORT
Unused import `import org.elasticsearch.client.RequestOptions;`
in `collector/elasticsearch/src/main/java/org/apache/karaf/decanter/collector/elasticsearch/ElasticsearchCollector.java`
#### Snippet
```java
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.apache.karaf.decanter.collector.utils.PropertiesPreparator;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.TimeUnit;`
in `collector/elasticsearch/src/main/java/org/apache/karaf/decanter/collector/elasticsearch/ElasticsearchCollector.java`
#### Snippet
```java
import java.net.URL;
import java.util.*;
import java.util.concurrent.TimeUnit;

@Component(
```

### UNUSED_IMPORT
Unused import `import org.osgi.service.event.EventConstants;`
in `collector/eventadmin/src/main/java/org/apache/karaf/decanter/collector/eventadmin/EventCollector.java`
#### Snippet
```java
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;

```

### UNUSED_IMPORT
Unused import `import java.util.regex.Matcher;`
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

```

### UNUSED_IMPORT
Unused import `import java.util.regex.Pattern;`
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component(
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `marshaller/raw/src/main/java/org/apache/karaf/decanter/marshaller/raw/RawUnmarshaller.java`
#### Snippet
```java
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append("\n");
            }
```

### NestedAssignment
Result of assignment expression used
in `collector/prometheus/src/main/java/org/apache/karaf/decanter/collector/prometheus/PrometheusCollector.java`
#### Snippet
```java
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.matches("# TYPE .* gauge")) {
                        line = reader.readLine();
```

### NestedAssignment
Result of assignment expression used
in `collector/socket/src/main/java/org/apache/karaf/decanter/collector/socket/SocketCollector.java`
#### Snippet
```java
                     BufferedReader reader = new BufferedReader(new InputStreamReader(boundedInputStream))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        Map<String, Object> data = new HashMap<>();
                        data.put("type", "socket");
```

### NestedAssignment
Result of assignment expression used
in `collector/soap/src/main/java/org/apache/karaf/decanter/collector/soap/SoapCollector.java`
#### Snippet
```java
                    StringBuilder buffer = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        buffer.append(line).append("\n");
                    }
```

### NestedAssignment
Result of assignment expression used
in `collector/druid/src/main/java/org/apache/karaf/decanter/collector/druid/DruidCollector.java`
#### Snippet
```java
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
```

### NestedAssignment
Result of assignment expression used
in `collector/rest-servlet/src/main/java/org/apache/karaf/decanter/collector/rest/servlet/RestServletCollector.java`
#### Snippet
```java
                 BufferedReader reader = new BufferedReader(new InputStreamReader(boundedInputStream))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    builder.append(line);
                }
```

### NestedAssignment
Result of assignment expression used
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line).append("\n");
            }
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `appender/mqtt/src/main/java/org/apache/karaf/decanter/appender/mqtt/MqttAppender.java`
#### Snippet
```java
                    client.connect();
                } catch (MqttException e1) {
                    e1.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `collector/prometheus/src/main/java/org/apache/karaf/decanter/collector/prometheus/PrometheusCollector.java`
#### Snippet
```java
        } catch (Exception e) {
            LOGGER.warn("Can't get Prometheus metrics", e);
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `collector/socket/src/main/java/org/apache/karaf/decanter/collector/socket/SocketCollector.java`
#### Snippet
```java
                clientSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`this.topic = this.topic + "/"` could be simplified to 'this.topic += "/"'
in `collector/system/src/main/java/org/apache/karaf/decanter/collector/system/SystemCollector.java`
#### Snippet
```java
        this.topic = context.getProperties().get(EventConstants.EVENT_TOPIC) != null ? String.class.cast(context.getProperties().get(EventConstants.EVENT_TOPIC)) : "decanter/collect/system/";
        if (!this.topic.endsWith("/")) {
            this.topic = this.topic + "/";
        }
        try {
```

### ReplaceAssignmentWithOperatorAssignment
`hash = hash + event.getProperty(group).hashCode()` could be simplified to 'hash += event.getProperty(group).hashCode()'
in `processor/groupby/src/main/java/org/apache/karaf/decanter/processor/groupby/GroupByProcessor.java`
#### Snippet
```java
                return;
            } else {
                hash = hash + event.getProperty(group).hashCode();
            }
        }
```

### ReplaceAssignmentWithOperatorAssignment
`use = use + "}"` could be simplified to 'use += "}"'
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
                }
                if (!use.endsWith("}")) {
                    use = use + "}";
                }
                data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(use.getBytes())));
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `pos` is accessed in both synchronized and unsynchronized contexts
in `collector/socket/src/main/java/org/apache/karaf/decanter/collector/socket/BoundedInputStream.java`
#### Snippet
```java
    private final long max;

    private long pos;

    private long mark = -1;
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Processor() can be replaced with lambda
in `collector/camel/src/main/java/org/apache/karaf/decanter/collector/camel/DecanterInterceptStrategy.java`
#### Snippet
```java
    @Override
    public Processor wrapProcessorInInterceptors(CamelContext context, NamedNode definition, Processor target, Processor nextTarget) throws Exception {
        Processor answer = new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
```

### Convert2Lambda
Anonymous new Gauge() can be replaced with lambda
in `appender/dropwizard/src/main/java/org/apache/karaf/decanter/appender/dropwizard/DropwizardMetricsAppender.java`
#### Snippet
```java
            final Object value = event.getProperty(propertyName);
            if (value instanceof Number) {
                registry.register(propertyName, new Gauge<Number>() {
                    @Override
                    public Number getValue() {
```

### Convert2Lambda
Anonymous new Processor() can be replaced with lambda
in `processor/camel/src/main/java/org/apache/karaf/decanter/processor/camel/CamelProcessor.java`
#### Snippet
```java
                from(callbackUri)
                        .id("decanter-processor-callback")
                        .process(new Processor() {
                            @Override
                            public void process(Exchange exchange) throws Exception {
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java

        String bootstrapServers = getValue(properties, "bootstrap.servers", "localhost:9092");
        config.put("bootstrap.servers", bootstrapServers);

        String groupId = getValue(properties, "group.id", "decanter");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java

        String groupId = getValue(properties, "group.id", "decanter");
        config.put("group.id", groupId);

        String enableAutoCommit = getValue(properties, "enable.auto.commit", "true");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java

        String enableAutoCommit = getValue(properties, "enable.auto.commit", "true");
        config.put("enable.auto.commit", enableAutoCommit);

        String autoCommitIntervalMs = getValue(properties, "auto.commit.interval.ms", "1000");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java

        String autoCommitIntervalMs = getValue(properties, "auto.commit.interval.ms", "1000");
        config.put("auto.commit.interval.ms", autoCommitIntervalMs);

        String sessionTimeoutMs = getValue(properties, "session.timeout.ms", "10000");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java

        String sessionTimeoutMs = getValue(properties, "session.timeout.ms", "10000");
        config.put("session.timeout.ms", sessionTimeoutMs);

        String keyDeserializer = getValue(properties, "key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java

        String keyDeserializer = getValue(properties, "key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        config.put("key.deserializer", keyDeserializer);

        String valueDeserializer = getValue(properties, "value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java

        String valueDeserializer = getValue(properties, "value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        config.put("value.deserializer", valueDeserializer);

        String securityProtocol = getValue(properties, "security.protocol", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java
        String securityProtocol = getValue(properties, "security.protocol", null);
        if (securityProtocol != null)
            config.put("security.protocol", securityProtocol);

        String sslTruststoreLocation = getValue(properties, "ssl.truststore.location", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java
        String sslTruststoreLocation = getValue(properties, "ssl.truststore.location", null);
        if (sslTruststoreLocation != null)
            config.put("ssl.truststore.location", sslTruststoreLocation);

        String sslTruststorePassword = getValue(properties, "ssl.truststore.password", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java
        String sslTruststorePassword = getValue(properties, "ssl.truststore.password", null);
        if (sslTruststorePassword != null)
            config.put("ssl.truststore.password", sslTruststorePassword);

        String sslKeystoreLocation = getValue(properties, "ssl.keystore.location", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java
        String sslKeystoreLocation = getValue(properties, "ssl.keystore.location", null);
        if (sslKeystoreLocation != null)
            config.put("ssl.keystore.location", sslKeystoreLocation);

        String sslKeystorePassword = getValue(properties, "ssl.keystore.password", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java
        String sslKeystorePassword = getValue(properties, "ssl.keystore.password", null);
        if (sslKeystorePassword != null)
            config.put("ssl.keystore.password", sslKeystorePassword);

        String sslKeyPassword = getValue(properties, "ssl.key.password", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java
        String sslKeyPassword = getValue(properties, "ssl.key.password", null);
        if (sslKeyPassword != null)
            config.put("ssl.key.password", sslKeyPassword);

        String sslProvider = getValue(properties, "ssl.provider", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java
        String sslProvider = getValue(properties, "ssl.provider", null);
        if (sslProvider != null)
            config.put("ssl.provider", sslProvider);

        String sslCipherSuites = getValue(properties, "ssl.cipher.suites", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java
        String sslCipherSuites = getValue(properties, "ssl.cipher.suites", null);
        if (sslCipherSuites != null)
            config.put("ssl.cipher.suites", sslCipherSuites);

        String sslEnabledProtocols = getValue(properties, "ssl.enabled.protocols", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java
        String sslEnabledProtocols = getValue(properties, "ssl.enabled.protocols", null);
        if (sslEnabledProtocols != null)
            config.put("ssl.enabled.protocols", sslEnabledProtocols);

        String sslTruststoreType = getValue(properties, "ssl.truststore.type", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java
        String sslTruststoreType = getValue(properties, "ssl.truststore.type", null);
        if (sslTruststoreType != null)
            config.put("ssl.truststore.type", sslTruststoreType);

        String sslKeystoreType = getValue(properties, "ssl.keystore.type", null);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java
        String sslKeystoreType = getValue(properties, "ssl.keystore.type", null);
        if (sslKeystoreType != null)
            config.put("ssl.keystore.type", sslKeystoreType);

        ClassLoader originClassLoader = Thread.currentThread().getContextClassLoader();
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/store/LuceneStoreImpl.java`
#### Snippet
```java
            pointsStore.load(reader);
            for (Object key : pointsStore.keySet()) {
                String value = pointsStore.get(key).toString();
                if (value.equals("double")) {
                    points.put(key.toString(), new PointsConfig(NumberFormat.getInstance(), Double.class));
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/store/LuceneStoreImpl.java`
#### Snippet
```java
            PointsConfig pointsConfig = points.get(key);
            if (pointsConfig.getType().getName().equals("java.lang.Double")) {
                pointsStore.put(key, "double");
            }
            if (pointsConfig.getType().getName().equals("java.lang.Float")) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/store/LuceneStoreImpl.java`
#### Snippet
```java
            }
            if (pointsConfig.getType().getName().equals("java.lang.Float")) {
                pointsStore.put(key, "float");
            }
            if (pointsConfig.getType().getName().equals("java.lang.Integer")) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/store/LuceneStoreImpl.java`
#### Snippet
```java
            }
            if (pointsConfig.getType().getName().equals("java.lang.Integer")) {
                pointsStore.put(key, "integer");
            }
            if (pointsConfig.getType().getName().equals("java.lang.Long")) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/store/LuceneStoreImpl.java`
#### Snippet
```java
            }
            if (pointsConfig.getType().getName().equals("java.lang.Long")) {
                pointsStore.put(key, "long");
            }
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `appender/kafka/src/main/java/org/apache/karaf/decanter/appender/kafka/ConfigMapper.java`
#### Snippet
```java
        String usedValue = (value != null) ? value : defaultValue;
        if (usedValue != null) {
            config.put(key, usedValue);
        }
    }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java
            message.setContent(formatter.formatBody(bodyTemplate, event), contentType);
            // send email
            if (properties.get("mail.smtp.user") != null) {
                Transport.send(message, (String) properties.get("mail.smtp.user"), (String) properties.get("mail.smtp.password"));
            } else {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java
            // send email
            if (properties.get("mail.smtp.user") != null) {
                Transport.send(message, (String) properties.get("mail.smtp.user"), (String) properties.get("mail.smtp.password"));
            } else {
                Transport.send(message);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java
            // send email
            if (properties.get("mail.smtp.user") != null) {
                Transport.send(message, (String) properties.get("mail.smtp.user"), (String) properties.get("mail.smtp.password"));
            } else {
                Transport.send(message);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java

        properties = new Properties();
        properties.put("mail.smtp.host", config.get("host"));
        properties.put("mail.smtp.port", config.get("port"));
        properties.put("mail.smtp.auth", config.get("auth"));
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java
        properties = new Properties();
        properties.put("mail.smtp.host", config.get("host"));
        properties.put("mail.smtp.port", config.get("port"));
        properties.put("mail.smtp.auth", config.get("auth"));
        properties.put("mail.smtp.starttls.enable", config.get("starttls"));
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java
        properties.put("mail.smtp.host", config.get("host"));
        properties.put("mail.smtp.port", config.get("port"));
        properties.put("mail.smtp.auth", config.get("auth"));
        properties.put("mail.smtp.starttls.enable", config.get("starttls"));
        properties.put("mail.smtp.ssl.enable", config.get("ssl"));
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java
        properties.put("mail.smtp.port", config.get("port"));
        properties.put("mail.smtp.auth", config.get("auth"));
        properties.put("mail.smtp.starttls.enable", config.get("starttls"));
        properties.put("mail.smtp.ssl.enable", config.get("ssl"));
        String username = (String) config.get("username");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java
        properties.put("mail.smtp.auth", config.get("auth"));
        properties.put("mail.smtp.starttls.enable", config.get("starttls"));
        properties.put("mail.smtp.ssl.enable", config.get("ssl"));
        String username = (String) config.get("username");
        String password = (String) config.get("password");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java
        String password = (String) config.get("password");
        if (username != null) {
            properties.put("mail.smtp.user", username);
        }
        if (password != null) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java
        }
        if (password != null) {
            properties.put("mail.smtp.password", password);
        }

```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `appender/rest/src/main/java/org/apache/karaf/decanter/appender/rest/RestAppender.java`
#### Snippet
```java
    
    @Deactivate
    public void close() {
    }

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java
    private String topic;
    private String eventAdminTopic;
    private boolean consuming = false;
    private String messageType;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parser/split/src/main/java/org/apache/karaf/decanter/parser/split/SplitParser.java`
#### Snippet
```java

    private String separator;
    private String keys = null;
    private Boolean useDefaultKey;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `appender/loki/src/main/java/org/apache/karaf/decanter/appender/loki/LokiAppender.java`
#### Snippet
```java
    private String tenant = null;
    private String username = null;
    private String password = null;
    private Dictionary<String, Object> config;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `appender/loki/src/main/java/org/apache/karaf/decanter/appender/loki/LokiAppender.java`
#### Snippet
```java
    private String url;
    private String tenant = null;
    private String username = null;
    private String password = null;
    private Dictionary<String, Object> config;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `appender/loki/src/main/java/org/apache/karaf/decanter/appender/loki/LokiAppender.java`
#### Snippet
```java

    private String url;
    private String tenant = null;
    private String username = null;
    private String password = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `collector/mqtt/src/main/java/org/apache/karaf/decanter/collector/mqtt/MqttCollector.java`
#### Snippet
```java
    private MqttClient client;
    private String dispatcherTopic;
    private boolean consuming = false;

    @Activate
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `collector/jetty/src/main/java/org/apache/karaf/decanter/collector/jetty/DecanterCollectorJettyHandler.java`
#### Snippet
```java
    private Server server;

    private boolean started = false;
    private Dictionary<String, Object> properties;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `appender/prometheus/src/main/java/org/apache/karaf/decanter/appender/prometheus/PrometheusServlet.java`
#### Snippet
```java

    private String alias;
    private boolean filtered = false;

    private Map<String, Gauge> gauges = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java
    private String bcc = null;
    private String subjectTemplate = null;
    private String bodyTemplate = null;
    private String bodyType = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java
    private String subjectTemplate = null;
    private String bodyTemplate = null;
    private String bodyType = null;

    private Properties properties;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java
    private String cc = null;
    private String bcc = null;
    private String subjectTemplate = null;
    private String bodyTemplate = null;
    private String bodyType = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java
    private String to = null;
    private String cc = null;
    private String bcc = null;
    private String subjectTemplate = null;
    private String bodyTemplate = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java
    private String from = null;
    private String to = null;
    private String cc = null;
    private String bcc = null;
    private String subjectTemplate = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java

    private String from = null;
    private String to = null;
    private String cc = null;
    private String bcc = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailAlerter.java`
#### Snippet
```java
    private final static Logger LOGGER = LoggerFactory.getLogger(EmailAlerter.class);

    private String from = null;
    private String to = null;
    private String cc = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `processor/aggregate/src/main/java/org/apache/karaf/decanter/processor/aggregate/AggregateProcessor.java`
#### Snippet
```java
    private boolean overwrite = false;

    private int index = 0;
    private ConcurrentHashMap<String, Object> mergedData = new ConcurrentHashMap<>();
    private ScheduledExecutorService scheduledExecutorService;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `processor/aggregate/src/main/java/org/apache/karaf/decanter/processor/aggregate/AggregateProcessor.java`
#### Snippet
```java

    private String targetTopics;
    private boolean overwrite = false;

    private int index = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `parser/regex/src/main/java/org/apache/karaf/decanter/parser/regex/RegexParser.java`
#### Snippet
```java

    private Pattern pattern;
    private String keys = null;

    @Activate
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `collector/rest/src/main/java/org/apache/karaf/decanter/collector/rest/RestCollector.java`
#### Snippet
```java
    private String password;
    private boolean exceptionAsHttpResponse;
    private Integer exceptionHttpResponseCode = null;
    private Dictionary<String, Object> config;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
    private String blockStorage = null;
    private boolean imageEnabled = true;
    private String image = null;
    private boolean metricEnabled = true;
    private String metric = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
    private String image = null;
    private boolean metricEnabled = true;
    private String metric = null;

    @Activate
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java

    private boolean computeEnabled = true;
    private String compute = null;
    private boolean computeUsageFlatten = true;
    private boolean blockStorageEnabled = true;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
    private boolean computeUsageFlatten = true;
    private boolean blockStorageEnabled = true;
    private String blockStorage = null;
    private boolean imageEnabled = true;
    private String image = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
    private Dictionary<String, Object> properties;

    long[] lastSystemCpuLoadTicks = null;

    @Activate
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `key`
in `marshaller/json/src/main/java/org/apache/karaf/decanter/marshaller/json/JsonMarshaller.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    private void marshalAttribute(JsonObjectBuilder jsonObjectBuilder, String key, Object value) {
        key = replaceDotsByUnderscores ? key.replace('.', '_') : key;
        if (value instanceof Map) {
            jsonObjectBuilder.add(key, build((Map<String, Object>)value));
```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `marshaller/json/src/main/java/org/apache/karaf/decanter/marshaller/json/JsonMarshaller.java`
#### Snippet
```java

    private void addProperty(JsonObjectBuilder json, String key, Object value) {
        key = replaceDotsByUnderscores ? key.replace('.','_') : key;
        if (value instanceof BigDecimal) {
            json.add(key, (BigDecimal)value);
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-17-04-07-50.896.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `appender/loki/src/main/java/org/apache/karaf/decanter/appender/loki/LokiAppender.java`
#### Snippet
```java

    private Object toString(Object value) {
        return value == null ? null : value.toString();
    }

```

### ReturnNull
Return of `null`
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/command/ListAlerts.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/command/RemoveAlert.java`
#### Snippet
```java
    public Object execute() throws Exception {
        store.delete("alertUUID:" + uuid);
        return null;
    }

```

### ReturnNull
Return of `null`
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/model/Loader.java`
#### Snippet
```java
    static public Long oldestPeriod(List<Rule> rules) {
        if (rules == null || rules.size() == 0) {
            return null;
        }
        long oldest = Long.MAX_VALUE;
```

### ReturnNull
Return of `null`
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/command/CleanupAlerts.java`
#### Snippet
```java
    public Object execute() throws Exception {
        store.cleanup();
        return null;
    }

```

### ReturnNull
Return of `null`
in `collector/camel/src/main/java/org/apache/karaf/decanter/collector/camel/DefaultExchangeExtender.java`
#### Snippet
```java
    private static String getBodyTypeName(Message message) {
        if (message == null) {
            return null;
        } else {
            String answer = ObjectHelper.classCanonicalName(message.getBody());
```

### ReturnNull
Return of `null`
in `collector/camel/src/main/java/org/apache/karaf/decanter/collector/camel/DefaultExchangeExtender.java`
#### Snippet
```java
            cause = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Throwable.class);
        }
        return (cause != null) ? cause.toString() : null;
    }

```

### ReturnNull
Return of `null`
in `collector/camel/src/main/java/org/apache/karaf/decanter/collector/camel/DefaultExchangeExtender.java`
#### Snippet
```java
    private static String extractBodyAsString(Message message) {
        if (message == null) {
            return null;
        } else {
            Object body = message.getBody();
```

### ReturnNull
Return of `null`
in `collector/camel/src/main/java/org/apache/karaf/decanter/collector/camel/DefaultExchangeExtender.java`
#### Snippet
```java
                }

                return answer != null ? answer.toString() : null;
            }
        }
```

### ReturnNull
Return of `null`
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/JmxCollector.java`
#### Snippet
```java

    private ObjectName getObjectName(String objectName) throws MalformedObjectNameException {
        return objectName == null ? null : new ObjectName(objectName);
    }

```

### ReturnNull
Return of `null`
in `collector/elasticsearch/src/main/java/org/apache/karaf/decanter/collector/elasticsearch/ElasticsearchCollector.java`
#### Snippet
```java
                            data.putAll(hit.fields());
                        }
                        return null;
                    });
        } catch (Exception e) {
```

### ReturnNull
Return of `null`
in `marshaller/json/src/main/java/org/apache/karaf/decanter/marshaller/json/JsonUnmarshaller.java`
#### Snippet
```java
            return build((JsonArray)value);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `appender/log/src/main/java/org/apache/karaf/decanter/appender/log/LogAppender.java`
#### Snippet
```java

    private Object toString(Object value) {
        return value == null ? null : value.toString();
    }

```

### ReturnNull
Return of `null`
in `collector/snmp/src/main/java/org/apache/karaf/decanter/collector/snmp/SnmpPoller.java`
#### Snippet
```java
    private OID convertPrivacyProtocol(String privacyProtocol) {
        if (privacyProtocol == null) {
            return null;
        }
        if (privacyProtocol.equals("DES")) {
```

### ReturnNull
Return of `null`
in `collector/snmp/src/main/java/org/apache/karaf/decanter/collector/snmp/SnmpPoller.java`
#### Snippet
```java
    private OID convertAuthenticationProtocol(String authenticationProtocol) {
        if (authenticationProtocol == null) {
            return null;
        }
        if (authenticationProtocol.equals("MD5")) {
```

### ReturnNull
Return of `null`
in `collector/snmp/src/main/java/org/apache/karaf/decanter/collector/snmp/SnmpPoller.java`
#### Snippet
```java
    private OctetString convertToOctetString(String value) {
        if (value == null) {
            return null;
        }
        return new OctetString(value);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `createTemplate` is redundant
in `appender/timescaledb/src/main/java/org/apache/karaf/decanter/appender/timescaledb/TimescaleDbAppender.java`
#### Snippet
```java
    private void createStructure(Connection connection) {
        String tableName = getValue(config, TABLE_NAME_PROPERTY, TABLE_NAME_DEFAULT);
        String createTemplate = createTableQueryTemplate;
        String createTableQuery = createTemplate.replaceAll("TABLENAME", tableName);

```

### UnnecessaryLocalVariable
Local variable `convertTemplate` is redundant
in `appender/timescaledb/src/main/java/org/apache/karaf/decanter/appender/timescaledb/TimescaleDbAppender.java`
#### Snippet
```java
        String createTableQuery = createTemplate.replaceAll("TABLENAME", tableName);

        String convertTemplate = convertHyperTableQueryTemplate;
        String convertTableQuery = convertTemplate.replaceAll("TABLENAME", tableName);

```

### UnnecessaryLocalVariable
Local variable `event` is redundant
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/event/Handler.java`
#### Snippet
```java
        data.put("alertPattern", rule.getCondition());
        data.put("alertBackToNormal", recover);
        Event event = new Event("decanter/alert/" + rule.getLevel(), data);
        return event;
    }
```

### UnnecessaryLocalVariable
Local variable `answer` is redundant
in `collector/camel/src/main/java/org/apache/karaf/decanter/collector/camel/DecanterInterceptStrategy.java`
#### Snippet
```java
    @Override
    public Processor wrapProcessorInInterceptors(CamelContext context, NamedNode definition, Processor target, Processor nextTarget) throws Exception {
        Processor answer = new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
```

### UnnecessaryLocalVariable
Local variable `date` is redundant
in `appender/elasticsearch/src/main/java/org/apache/karaf/decanter/appender/elasticsearch/ElasticsearchAppender.java`
#### Snippet
```java
    private Date getDate(Event event) {
        Long ts = (Long)event.getProperty("timestamp");
        Date date = ts != null ? new Date(ts) : new Date();
        return date;
    }
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `collector/camel/src/main/java/org/apache/karaf/decanter/collector/camel/DefaultExchangeExtender.java`
#### Snippet
```java
            ArrayList<Object> historyList = new ArrayList<Object>();
            for (MessageHistory history : messageHistory) {
                historyList.add(new HashMap<String, Object>() {{
                    put("nodeId", history.getNode().getId());
                    put("route", history.getRouteId());
```

## RuleId[id=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'CamelEvent.CamelContextStartupFailureEvent' type conflicts with preceding 'instanceof CamelEvent.CamelContextStopFailureEvent' check
in `collector/camel/src/main/java/org/apache/karaf/decanter/collector/camel/CamelEventMapper.java`
#### Snippet
```java
        }
        if (event instanceof CamelEvent.CamelContextStopFailureEvent) {
            CamelEvent.CamelContextStartupFailureEvent context = (CamelEvent.CamelContextStartupFailureEvent) event;
            data.put("cause", context.getCause().toString());
        }
```

### CastConflictsWithInstanceof
Cast to 'Integer' type conflicts with preceding 'instanceof Float' check
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/store/LuceneStoreImpl.java`
#### Snippet
```java
            } else if (value instanceof Float) {
                document.add(new FloatPoint(key, ((Float) value)));
                document.add(new StoredField(key, ((Integer) value)));
                points.put(key, new PointsConfig(NumberFormat.getInstance(), Float.class));
            } else if (value instanceof Double) {
```

### CastConflictsWithInstanceof
Cast to 'Integer' type conflicts with preceding 'instanceof Float' check
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/store/LuceneStoreImpl.java`
#### Snippet
```java
            } else if (value instanceof Float) {
                document.add(new FloatPoint(property, ((Float) value)));
                document.add(new StoredField(property, ((Integer) value)));
                points.put(property, new PointsConfig(NumberFormat.getInstance(), Float.class));
            } else if (value instanceof Double) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `createTemplate` initializer `null` is redundant
in `appender/jdbc/src/main/java/org/apache/karaf/decanter/appender/jdbc/JdbcAppender.java`
#### Snippet
```java

    private void createTable(Connection connection) {
        String createTemplate = null;
        if (getValue(config, DIALECT_PROPERTY, DIALECT_DEFAULT).equalsIgnoreCase("mysql")) {
            createTemplate = createTableQueryMySQLTemplate;
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `this.protocol == null` is always `false`
in `collector/socket/src/main/java/org/apache/karaf/decanter/collector/socket/SocketCollector.java`
#### Snippet
```java
        this.protocol = Protocol.valueOf(getProperty(this.properties, "protocol", "tcp").toUpperCase());
        // force TCP protocol if value not in Enum
        if (this.protocol == null) {
            this.protocol = Protocol.TCP;
        }
```

### ConstantValue
Condition `ruleDefinition != null` is always `true`
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/model/Loader.java`
#### Snippet
```java
                String ruleDefinition = (String) configuration.get(key);
                ruleDefinition = ruleDefinition.replaceAll("'", "\"");
                if (ruleDefinition != null && !ruleDefinition.isEmpty()) {
                    JsonReader jsonReader = Json.createReader(new StringReader(ruleDefinition));
                    JsonObject jsonObject = jsonReader.readObject();
```

### ConstantValue
Condition `filtered` is always `true` when reached
in `appender/prometheus/src/main/java/org/apache/karaf/decanter/appender/prometheus/PrometheusServlet.java`
#### Snippet
```java
    public void handleEvent(Event event) {
        for (String property : event.getPropertyNames()) {
            if (!filtered || (filtered && config.get("prometheus.key." + property) != null)) {
                if (event.getProperty(property) instanceof Map) {
                    Map<String, Object> map = (Map) event.getProperty(property);
```

### ConstantValue
Condition `attributeObject instanceof String[]` is always `false`
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/BeanHarvester.java`
#### Snippet
```java
                } else if (attributeObject instanceof long[]) {
                    data.put(attribute.getName(), (long[]) attributeObject);
                } else if (attributeObject instanceof String[]) {
                    data.put(attribute.getName(), (String[]) attributeObject);
                } else if (attributeObject instanceof int[]) {
```

