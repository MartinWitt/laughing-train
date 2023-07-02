# karaf-decanter 
 
# Bad smells
I found 178 bad smells with 16 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| CollectionAddAllCanBeReplacedWithConstructor | 34 | false |
| SimplifiableConditionalExpression | 25 | false |
| FieldMayBeFinal | 20 | false |
| UNUSED_IMPORT | 15 | false |
| ConstantValue | 8 | false |
| UnnecessaryModifier | 7 | true |
| DataFlowIssue | 7 | false |
| FieldCanBeLocal | 7 | false |
| UNCHECKED_WARNING | 6 | false |
| DuplicatedCode | 6 | false |
| RedundantCast | 6 | false |
| IgnoreResultOfCall | 5 | false |
| UnnecessaryLocalVariable | 5 | true |
| Deprecation | 4 | false |
| UnnecessaryToStringCall | 4 | true |
| CharsetObjectCanBeUsed | 4 | false |
| ConditionCoveredByFurtherCondition | 3 | false |
| NullableProblems | 2 | false |
| ArraysAsListWithZeroOrOneArgument | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| RedundantLengthCheck | 1 | false |
| UnnecessarySemicolon | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| RedundantCollectionOperation | 1 | false |
| TrivialIf | 1 | false |
| JavadocDeclaration | 1 | false |
| UnusedAssignment | 1 | false |
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `appender/prometheus/src/main/java/org/apache/karaf/decanter/appender/prometheus/PrometheusServlet.java`
#### Snippet
```java
            if (!filtered || (filtered && config.get("prometheus.key." + property) != null)) {
                if (event.getProperty(property) instanceof Map) {
                    Map<String, Object> map = (Map) event.getProperty(property);
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (entry.getValue() instanceof Long || entry.getValue() instanceof Integer) {
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `processor/groupby/src/main/java/org/apache/karaf/decanter/processor/groupby/GroupByProcessor.java`
#### Snippet
```java
                for (Integer hash : accumulation.keySet()) {
                    Map merge = new HashMap();
                    merge.put("processor", "groupBy");
                    if (flat) {
                        for (Event event : accumulation.get(hash)) {
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `processor/groupby/src/main/java/org/apache/karaf/decanter/processor/groupby/GroupByProcessor.java`
#### Snippet
```java
                        for (Event event : accumulation.get(hash)) {
                            for (String propertyName : event.getPropertyNames()) {
                                merge.put(propertyName, event.getProperty(propertyName));
                            }
                        }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `processor/groupby/src/main/java/org/apache/karaf/decanter/processor/groupby/GroupByProcessor.java`
#### Snippet
```java
                    } else {
                        List<Map<String, Object>> events = new ArrayList<>();
                        merge.put("events", events);
                        for (Event event : accumulation.get(hash)) {
                            Map<String,Object> properties = new HashMap<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Enumeration' to 'java.util.Enumeration'. Reason: 'props' has raw type, so result of keys is erased
in `collector/configadmin/src/main/java/org/apache/karaf/decanter/collector/configadmin/ConfigAdminCollector.java`
#### Snippet
```java
            Dictionary props = configuration.getProperties();
            if (props != null) {
                Enumeration<String> keys = props.keys();
                while (keys.hasMoreElements()) {
                    String key = keys.nextElement();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'. Reason: 'hit' has raw type, so result of fields is erased
in `collector/elasticsearch/src/main/java/org/apache/karaf/decanter/collector/elasticsearch/ElasticsearchCollector.java`
#### Snippet
```java
                        data.put("failedShards", response.shards().failed().intValue());
                        for (Hit hit : response.hits().hits()) {
                            data.putAll(hit.fields());
                        }
                        return null;
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

## RuleId[id=DataFlowIssue]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `appender/elasticsearch/src/main/java/org/apache/karaf/decanter/appender/elasticsearch/ElasticsearchAppender.java`
#### Snippet
```java
        HttpHost[] hosts = new HttpHost[addresses.size()];
        int i = 0;
        for (String address : addresses) {
            try {
                URL url = new URL(address);
                hosts[i] = new HttpHost(url.getHost(), url.getPort(), url.getProtocol());
                i++;
            } catch (Exception e) {
                LOGGER.warn("Bad elasticsearch address {}", address, e);
            }
        }
        RestClientBuilder restClientBuilder = RestClient.builder(hosts);
```

### DuplicatedCode
Duplicated code
in `appender/elasticsearch/src/main/java/org/apache/karaf/decanter/appender/elasticsearch/ElasticsearchAppender.java`
#### Snippet
```java
        if (username != null) {
            final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
            credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(username, password));
            restClientBuilder.setHttpClientConfigCallback(
                    new RestClientBuilder.HttpClientConfigCallback() {
                        @Override
                        public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpAsyncClientBuilder) {
                            return httpAsyncClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
                        }
                    }
            );
        }

        client = restClientBuilder.build();
```

### DuplicatedCode
Duplicated code
in `appender/redis/src/main/java/org/apache/karaf/decanter/appender/redis/RedisAppender.java`
#### Snippet
```java
        Config redissonConfig = new Config();
        if (mode.equalsIgnoreCase("Single")) {
            redissonConfig.useSingleServer().setAddress(address);
        } else if (mode.equalsIgnoreCase("Master_Slave")) {
            redissonConfig.useMasterSlaveServers().setMasterAddress(masterAddress).addSlaveAddress(address);
        } else if (mode.equalsIgnoreCase("Sentinel")) {
            redissonConfig.useSentinelServers().addSentinelAddress(masterName).addSentinelAddress(address);
        } else if (mode.equalsIgnoreCase("Cluster")) {
            redissonConfig.useClusterServers().setScanInterval(scanInterval).addNodeAddress(address);
        }
        redissonClient = Redisson.create(redissonConfig);
```

### DuplicatedCode
Duplicated code
in `collector/log/src/main/java/org/apache/karaf/decanter/collector/log/LogCollector.java`
#### Snippet
```java
        Map<String, Object> data = new HashMap<>();
        data.put("type", "log");

        data.put("timestamp", event.getTimeStamp());
        data.put("loggerClass", event.getFQNOfLoggerClass());
        data.put("loggerName", event.getLoggerName());
        data.put("threadName", event.getThreadName());
        data.put("message", event.getMessage());
```

### DuplicatedCode
Duplicated code
in `collector/snmp/src/main/java/org/apache/karaf/decanter/collector/snmp/SnmpPoller.java`
#### Snippet
```java
        this.configuration = configuration;

        String addressConfig = (configuration.get("address") != null) ? (String) configuration.get("address") : "127.0.0.1/161";
        this.address = GenericAddress.parse(addressConfig);

        String protocol = (configuration.get("protocol") != null) ? (String) configuration.get("protocol") : "tcp";
```

### DuplicatedCode
Duplicated code
in `collector/snmp/src/main/java/org/apache/karaf/decanter/collector/snmp/SnmpPoller.java`
#### Snippet
```java
        if (pdu.getType() == PDU.V1TRAP) {
            PDUv1 v1pdu = (PDUv1) pdu;
            data.put("enterprise", v1pdu.getEnterprise().toString());
            data.put("agentAddress", v1pdu.getAgentAddress().toString());
            data.put("genericTrap", v1pdu.getGenericTrap());
            data.put("specificTrap", v1pdu.getSpecificTrap());
            data.put("timestamp", v1pdu.getTimestamp());
        }
        // all variables
        for (VariableBinding variableBinding : pdu.getVariableBindings()) {
            data.put(variableBinding.getOid().toString(), variableBinding.getVariable().toString());
        }
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/event/Handler.java`
#### Snippet
```java
    private Event prepareEvent(Alert alert, Rule rule, boolean recover) {
        HashMap<String, Object> data = new HashMap<>();
        data.putAll(alert.get());
        data.put("alertLevel", rule.getLevel());
        data.put("alertPattern", rule.getCondition());
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(blockStorage + "/" + project + "/limits", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(compute + "/os-server-groups", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(blockStorage + "/" + project + "/resource_filters", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(compute + "/os-hypervisors/detail", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(blockStorage + "/" + project + "/attachments/detail", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(blockStorage + "/" + project + "/group_snapshots/detail", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(image + "/v2/tasks", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(blockStorage + "/" + project + "/qos-specs", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(blockStorage + "/" + project + "/os-services", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(blockStorage + "/" + project + "/volumes/detail", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(metric + "/v1/metric", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
                    use = use + "}";
                }
                data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(use.getBytes())));
                PropertiesPreparator.prepare(data, config);
                dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        } else {
            Map<String, Object> data = new HashMap<>();
            data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
            PropertiesPreparator.prepare(data, config);
            dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(compute + "/flavors/detail", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(blockStorage + "/" + project + "/types", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(image + "/v2/info/stores", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(compute + "/os-aggregates", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(blockStorage + "/" + project + "/group_types", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(compute + "/os-availability-zone/detail", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(compute + "/os-instance_usage_audit_log", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(blockStorage + "/" + project + "/manageable_volumes/detail", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(image + "/v2/images", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(blockStorage + "/" + project + "/groups", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(compute + "/os-migrations", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(blockStorage + "/" + project + "/snapshots/detail", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(blockStorage + "/" + project + "/backups/detail", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(compute + "/os-services", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(compute + "/servers/detail", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(blockStorage + "/" + project + "/os-hosts", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(compute + "/limits", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(compute + "/os-keypairs", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `collector/openstack/src/main/java/org/apache/karaf/decanter/collector/openstack/OpenstackCollector.java`
#### Snippet
```java
        String response = request(blockStorage + "/" + project + "/volume-transfers/detail", token);
        Map<String, Object> data = new HashMap<>();
        data.putAll(unmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes())));
        PropertiesPreparator.prepare(data, config);
        dispatcher.postEvent(new Event(topic, data));
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `appender/influxdb/src/main/java/org/apache/karaf/decanter/appender/influxdb/InfluxDbAppender.java`
#### Snippet
```java
            Map<String, Object> eventFields = new HashMap<>();
            Map<String, String> eventTags = new HashMap<>();
            eventTags.putAll(globalTags);

            for (String propertyName : event.getPropertyNames()) {
```

## RuleId[id=Deprecation]
### Deprecation
'COALESCER_MAX_RUNS' is deprecated
in `appender/cassandra/src/main/java/org/apache/karaf/decanter/appender/cassandra/CassandraAppender.java`
#### Snippet
```java
                        .withString(DefaultDriverOption.HEARTBEAT_TIMEOUT, "500 milliseconds")
                        .withString(DefaultDriverOption.COALESCER_INTERVAL, "10 microseconds")
                        .withInt(DefaultDriverOption.COALESCER_MAX_RUNS, 5)
                        .withString(DefaultDriverOption.RECONNECTION_POLICY_CLASS, "ExponentialReconnectionPolicy")
                        .withString(DefaultDriverOption.RECONNECTION_BASE_DELAY, "1 second")
```

### Deprecation
'ODatabaseDocumentTx(java.lang.String)' is deprecated
in `appender/orientdb/src/main/java/org/apache/karaf/decanter/appender/orientdb/OrientDBAppender.java`
#### Snippet
```java
        String username = getValue(config, USERNAME_PROPERTY, USERNAME_DEFAULT);
        String password = getValue(config, PASSWORD_PROPERTY, PASSWORD_DEFAULT);
        database = new ODatabaseDocumentTx(url).open(username, password);
    }

```

### Deprecation
'com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx' is deprecated
in `appender/orientdb/src/main/java/org/apache/karaf/decanter/appender/orientdb/OrientDBAppender.java`
#### Snippet
```java
        String username = getValue(config, USERNAME_PROPERTY, USERNAME_DEFAULT);
        String password = getValue(config, PASSWORD_PROPERTY, PASSWORD_DEFAULT);
        database = new ODatabaseDocumentTx(url).open(username, password);
    }

```

### Deprecation
'com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx' is deprecated
in `appender/orientdb/src/main/java/org/apache/karaf/decanter/appender/orientdb/OrientDBAppender.java`
#### Snippet
```java
    public Marshaller marshaller;

    private ODatabaseDocumentTx database;

    private Dictionary<String, Object> config;
```

## RuleId[id=UnnecessaryToStringCall]
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
in `appender/s3/src/main/java/org/apache/karaf/decanter/appender/s3/S3Appender.java`
#### Snippet
```java
                .withCredentials(new AWSStaticCredentialsProvider(awsCreds))
                .build();
        String key = "decanter-" + System.currentTimeMillis() + "-" + UUID.randomUUID().toString();
        s3.putObject(bucket, key, marshaller.marshal(event));
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

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`(config.get(APPEND_PROPERTY) != null) ? Boolean.parseBoolean((String) config.get(APPEND_PROPERTY)) : true` can be simplified to 'config.get(APPEND_PROPERTY)==null \|\| Boolean.parseBoolean((String) config.get(APPEND_PROPERTY))'
in `appender/file/src/main/java/org/apache/karaf/decanter/appender/file/FileAppender.java`
#### Snippet
```java

        String filename = (config.get(FILENAME_PROPERTY) != null) ? (String) config.get(FILENAME_PROPERTY) : System.getProperty("karaf.data") + File.separator + "decanter" + File.separator + "appender.csv";
        boolean append = (config.get(APPEND_PROPERTY) != null) ? Boolean.parseBoolean((String) config.get(APPEND_PROPERTY)) : true;

        File file = new File(filename);
```

### SimplifiableConditionalExpression
`(configuration.get("flat") != null) ? Boolean.parseBoolean(configuration.get("flat").toString()) : true` can be simplified to 'configuration.get("flat")==null \|\| Boolean.parseBoolean(configuration.get("flat").toString())'
in `processor/groupby/src/main/java/org/apache/karaf/decanter/processor/groupby/GroupByProcessor.java`
#### Snippet
```java
        long period = (configuration.get("period") != null) ? Long.parseLong(configuration.get("period").toString()) : 60L;
        groupBy = (configuration.get("groupBy") != null) ? configuration.get("groupBy").toString() : null;
        flat = (configuration.get("flat") != null) ? Boolean.parseBoolean(configuration.get("flat").toString()) : true;
        scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(new GroupByTask(), 0, period, TimeUnit.SECONDS);
```

### SimplifiableConditionalExpression
`(configuration.get("overwrite") != null) ? Boolean.parseBoolean(configuration.get("overwrite").toString()) : false` can be simplified to 'configuration.get("overwrite") != null \&\& Boolean.parseBoolean(configuration.get("overwrite").toString())'
in `processor/aggregate/src/main/java/org/apache/karaf/decanter/processor/aggregate/AggregateProcessor.java`
#### Snippet
```java
        targetTopics = (configuration.get("target.topics") != null) ? configuration.get("target.topics").toString() : "decanter/process/aggregate";
        long period = (configuration.get("period") != null) ? Long.parseLong(configuration.get("period").toString()) : 60L;
        overwrite = (configuration.get("overwrite") != null) ? Boolean.parseBoolean(configuration.get("overwrite").toString()) : false;
        scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(new AggregateTask(), 0, period, TimeUnit.SECONDS);
```

### SimplifiableConditionalExpression
`(config.get("useDefaultKey") != null) ? Boolean.parseBoolean((String) config.get("useDefaultKey")) : false` can be simplified to 'config.get("useDefaultKey") != null \&\& Boolean.parseBoolean((String) config.get("useDefaultKey"))'
in `parser/split/src/main/java/org/apache/karaf/decanter/parser/split/SplitParser.java`
#### Snippet
```java
        this.separator = (config.get("separator") != null) ? (String) config.get("separator") : ",";
        this.keys = (config.get("keys") != null) ? (String) config.get("keys") : null;
        this.useDefaultKey = (config.get("useDefaultKey") != null) ? Boolean.parseBoolean((String) config.get("useDefaultKey")) : false;
    }

```

### SimplifiableConditionalExpression
`(configuration.get("treelist") != null) ? Boolean.parseBoolean((String) configuration.get("treelist")) : false` can be simplified to 'configuration.get("treelist") != null \&\& Boolean.parseBoolean((String) configuration.get("treelist"))'
in `collector/snmp/src/main/java/org/apache/karaf/decanter/collector/snmp/SnmpPoller.java`
#### Snippet
```java
        int retries = (configuration.get("retries") != null) ? Integer.parseInt((String) configuration.get("retries")) : 2;
        long timeout = (configuration.get("timeout") != null) ? Long.parseLong((String) configuration.get("timeout")) : 1500;
        treeList = (configuration.get("treelist") != null) ? Boolean.parseBoolean((String) configuration.get("treelist")) : false;
        oids = (configuration.get("oids") != null) ? (String) configuration.get("oids") : "";

```

### SimplifiableConditionalExpression
`properties.get("computerSystem") != null ? Boolean.parseBoolean(properties.get("computerSystem").toString()) : true` can be simplified to 'properties.get("computerSystem")==null \|\| Boolean.parseBoolean(properties.get("computerSystem").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
            HardwareAbstractionLayer hardwareAbstractionLayer = systemInfo.getHardware();
            // * computer system
            boolean computerSystem = properties.get("computerSystem") != null ? Boolean.parseBoolean(properties.get("computerSystem").toString()) : true;
            if (computerSystem) {
                data.put("computerSystem.manufacturer", hardwareAbstractionLayer.getComputerSystem().getManufacturer());
```

### SimplifiableConditionalExpression
`properties.get("computerSystem.baseboard") != null ? Boolean.parseBoolean(properties.get("computerSystem.baseboard").toString()) : true` can be simplified to 'properties.get("computerSystem.baseboard")==null \|\| Boolean.parseBoolean(properties.get("computerSystem.baseboard").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
                data.put("computerSystem.serialNumber", hardwareAbstractionLayer.getComputerSystem().getSerialNumber());
                // ** baseboard
                boolean computerSystemBaseboard = properties.get("computerSystem.baseboard") != null  ? Boolean.parseBoolean(properties.get("computerSystem.baseboard").toString()) : true;
                if (computerSystemBaseboard) {
                    data.put("computerSystem.baseboard.manufacturer", hardwareAbstractionLayer.getComputerSystem().getBaseboard().getManufacturer());
```

### SimplifiableConditionalExpression
`properties.get("computerSystem.firmware") != null ? Boolean.parseBoolean(properties.get("computerSystem.firmware").toString()) : true` can be simplified to 'properties.get("computerSystem.firmware")==null \|\| Boolean.parseBoolean(properties.get("computerSystem.firmware").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
                }
                // ** firmware
                boolean computerSystemFirmware = properties.get("computerSystem.firmware") != null ? Boolean.parseBoolean(properties.get("computerSystem.firmware").toString()) : true;
                if (computerSystemFirmware) {
                    data.put("computerSystem.firmware.description", hardwareAbstractionLayer.getComputerSystem().getFirmware().getDescription());
```

### SimplifiableConditionalExpression
`properties.get("memory") != null ? Boolean.parseBoolean(properties.get("memory").toString()) : true` can be simplified to 'properties.get("memory")==null \|\| Boolean.parseBoolean(properties.get("memory").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
            }
            // * memory
            boolean memory = properties.get("memory") != null ? Boolean.parseBoolean(properties.get("memory").toString()) : true;
            if (memory) {
                data.put("memory.available", hardwareAbstractionLayer.getMemory().getAvailable());
```

### SimplifiableConditionalExpression
`properties.get("processors") != null ? Boolean.parseBoolean(properties.get("processors").toString()) : true` can be simplified to 'properties.get("processors")==null \|\| Boolean.parseBoolean(properties.get("processors").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
            }
            // * processor
            boolean processors = properties.get("processors") != null ? Boolean.parseBoolean(properties.get("processors").toString()) : true;
            if (processors) {
                data.put("processor.contextSwitched", hardwareAbstractionLayer.getProcessor().getContextSwitches());
```

### SimplifiableConditionalExpression
`properties.get("processors.logical") != null ? Boolean.parseBoolean(properties.get("processors.logical").toString()) : true` can be simplified to 'properties.get("processors.logical")==null \|\| Boolean.parseBoolean(properties.get("processors.logical").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
                data.put("processor.systemCpuLoadBetweenTicks", lastSystemCpuLoadTicks != null ? hardwareAbstractionLayer.getProcessor().getSystemCpuLoadBetweenTicks(lastSystemCpuLoadTicks) : null);
                lastSystemCpuLoadTicks = hardwareAbstractionLayer.getProcessor().getSystemCpuLoadTicks();
                boolean processorsLogical = properties.get("processors.logical") != null ? Boolean.parseBoolean(properties.get("processors.logical").toString()) : true;
                if (processorsLogical) {
                    int i = 0;
```

### SimplifiableConditionalExpression
`properties.get("displays") != null ? Boolean.parseBoolean(properties.get("displays").toString()) : true` can be simplified to 'properties.get("displays")==null \|\| Boolean.parseBoolean(properties.get("displays").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
            }
            // * displays
            boolean displays = properties.get("displays") != null ? Boolean.parseBoolean(properties.get("displays").toString()) : true;
            if (displays) {
                int i = 0;
```

### SimplifiableConditionalExpression
`properties.get("disks") != null ? Boolean.parseBoolean(properties.get("disks").toString()) : true` can be simplified to 'properties.get("disks")==null \|\| Boolean.parseBoolean(properties.get("disks").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
                }
            }
            boolean disks = properties.get("disks") != null ? Boolean.parseBoolean(properties.get("disks").toString()) : true;
            if (disks) {
                // * disk stores
```

### SimplifiableConditionalExpression
`properties.get("disks.partitions") != null ? Boolean.parseBoolean(properties.get("disks.partitions").toString()) : true` can be simplified to 'properties.get("disks.partitions")==null \|\| Boolean.parseBoolean(properties.get("disks.partitions").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
                    data.put("diskStore." + i + ".writes", diskStore.getWrites());
                    // partitions
                    boolean disksPartitions = properties.get("disks.partitions") != null ? Boolean.parseBoolean(properties.get("disks.partitions").toString()) : true;
                    if (disksPartitions) {
                        int j = 0;
```

### SimplifiableConditionalExpression
`properties.get("graphicsCards") != null ? Boolean.parseBoolean(properties.get("graphicsCards").toString()) : true` can be simplified to 'properties.get("graphicsCards")==null \|\| Boolean.parseBoolean(properties.get("graphicsCards").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
            }
            // * graphics cards
            boolean graphicsCards = properties.get("graphicsCards") != null ? Boolean.parseBoolean(properties.get("graphicsCards").toString()) : true;
            if (graphicsCards) {
                int i = 0;
```

### SimplifiableConditionalExpression
`properties.get("networkIFs") != null ? Boolean.parseBoolean(properties.get("networkIFs").toString()) : true` can be simplified to 'properties.get("networkIFs")==null \|\| Boolean.parseBoolean(properties.get("networkIFs").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
                }
            }
            boolean networkIFs = properties.get("networkIFs") != null ? Boolean.parseBoolean(properties.get("networkIFs").toString()) : true;
            if (networkIFs) {
                // * network interfaces
```

### SimplifiableConditionalExpression
`properties.get("powerSources") != null ? Boolean.parseBoolean(properties.get("powerSources").toString()) : true` can be simplified to 'properties.get("powerSources")==null \|\| Boolean.parseBoolean(properties.get("powerSources").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
            }
            // * power sources
            boolean powerSources = properties.get("powerSources") != null ? Boolean.parseBoolean(properties.get("powerSources").toString()) : true;
            if (powerSources) {
                int i = 0;
```

### SimplifiableConditionalExpression
`properties.get("soundCards") != null ? Boolean.parseBoolean(properties.get("soundCards").toString()) : true` can be simplified to 'properties.get("soundCards")==null \|\| Boolean.parseBoolean(properties.get("soundCards").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
            }
            // * sound cards
            boolean soundCards = properties.get("soundCards") != null ? Boolean.parseBoolean(properties.get("soundCards").toString()) : true;
            if (soundCards) {
                int i = 0;
```

### SimplifiableConditionalExpression
`properties.get("sensors") != null ? Boolean.parseBoolean(properties.get("sensors").toString()) : true` can be simplified to 'properties.get("sensors")==null \|\| Boolean.parseBoolean(properties.get("sensors").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
            }
            // * sensors
            boolean sensors = properties.get("sensors") != null ? Boolean.parseBoolean(properties.get("sensors").toString()) : true;
            if (sensors) {
                data.put("sensors.cpuTemperature", hardwareAbstractionLayer.getSensors().getCpuTemperature());
```

### SimplifiableConditionalExpression
`properties.get("usbDevices") != null ? Boolean.parseBoolean(properties.get("usbDevices").toString()) : true` can be simplified to 'properties.get("usbDevices")==null \|\| Boolean.parseBoolean(properties.get("usbDevices").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
            }
            // * USB
            boolean usbDevices = properties.get("usbDevices") != null ? Boolean.parseBoolean(properties.get("usbDevices").toString()) : true;
            if (usbDevices) {
                int i = 0;
```

### SimplifiableConditionalExpression
`properties.get("operatingSystem") != null ? Boolean.parseBoolean(properties.get("operatingSystem").toString()) : true` can be simplified to 'properties.get("operatingSystem")==null \|\| Boolean.parseBoolean(properties.get("operatingSystem").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java

            // OS
            boolean operatingSystem = properties.get("operatingSystem") != null ? Boolean.parseBoolean(properties.get("operatingSystem").toString()) : true;
            if (operatingSystem) {
                OperatingSystem os = systemInfo.getOperatingSystem();
```

### SimplifiableConditionalExpression
`properties.get("operatingSystem.fileSystems") != null ? Boolean.parseBoolean(properties.get("operatingSystem.fileSystems").toString()) : true` can be simplified to 'properties.get("operatingSystem.fileSystems")==null \|\| Boolean.parseBoolean(properties.get("operatingSystem.fileSystems").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
                data.put("operatingSystem.versionInfo.version", os.getVersionInfo().getVersion());
                // filesystem
                boolean fileSystems = properties.get("operatingSystem.fileSystems") != null ? Boolean.parseBoolean(properties.get("operatingSystem.fileSystems").toString()) : true;
                if (fileSystems) {
                    data.put("operatingSystem.fileSystem.maxFileDescriptors", os.getFileSystem().getMaxFileDescriptors());
```

### SimplifiableConditionalExpression
`properties.get("operatingSystem.networkParams") != null ? Boolean.parseBoolean(properties.get("operatingSystem.networkParams").toString()) : true` can be simplified to 'properties.get("operatingSystem.networkParams")==null \|\| Boolean.parseBoolean(properties.get("operatingSystem.networkParams").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
                }
                // network params
                boolean networkParams = properties.get("operatingSystem.networkParams") != null ? Boolean.parseBoolean(properties.get("operatingSystem.networkParams").toString()) : true;
                if (networkParams) {
                    data.put("operatingSystem.networkParams.dnsServers", Arrays.toString(os.getNetworkParams().getDnsServers()));
```

### SimplifiableConditionalExpression
`properties.get("operatingSystem.processes") != null ? Boolean.parseBoolean(properties.get("operatingSystem.processes").toString()) : true` can be simplified to 'properties.get("operatingSystem.processes")==null \|\| Boolean.parseBoolean(properties.get("operatingSystem.processes").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
                }
                // processes
                boolean processes = properties.get("operatingSystem.processes") != null ? Boolean.parseBoolean(properties.get("operatingSystem.processes").toString()) : true;
                if (processes) {
                    for (OSProcess process : os.getProcesses()) {
```

### SimplifiableConditionalExpression
`properties.get("operatingSystem.services") != null ? Boolean.parseBoolean(properties.get("operatingSystem.services").toString()) : true` can be simplified to 'properties.get("operatingSystem.services")==null \|\| Boolean.parseBoolean(properties.get("operatingSystem.services").toString())'
in `collector/oshi/src/main/java/org/apache/karaf/decanter/collector/oshi/OshiCollector.java`
#### Snippet
```java
                }
                // services
                boolean services = properties.get("operatingSystem.services") != null ? Boolean.parseBoolean(properties.get("operatingSystem.services").toString()) : true;
                if (services) {
                    for (OSService service : os.getServices()) {
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `collector/socket/src/main/java/org/apache/karaf/decanter/collector/socket/BoundedInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] b) throws IOException {
        return this.read(b, 0, b.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `collector/socket/src/main/java/org/apache/karaf/decanter/collector/socket/BoundedInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] b, final int off, final int len) throws IOException {
        if (max >= 0 && pos >= max) {
            LOGGER.warn("Reach socket read input stream limit");
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `appender/mongodb/src/main/java/org/apache/karaf/decanter/appender/mongodb/MongoDbAppender.java`
#### Snippet
```java

    private MongoClient mongoClient;
    private MongoDatabase mongoDatabase;
    private MongoCollection mongoCollection;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/store/LuceneStoreImpl.java`
#### Snippet
```java
    private final static Logger LOGGER = LoggerFactory.getLogger(LuceneStoreImpl.class);

    private Directory directory;
    private IndexWriter indexWriter;
    private Map<String, PointsConfig> points;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `appender/kafka/src/main/java/org/apache/karaf/decanter/appender/kafka/KafkaAppender.java`
#### Snippet
```java

    private Dictionary<String, Object> config;
    private Properties properties;
    private String topic;
    private KafkaProducer<String, String> producer;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java
    private Dictionary<String, Object> properties;
    private KafkaConsumer<String, String> consumer;
    private String topic;
    private String eventAdminTopic;
    private boolean consuming = false;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `collector/snmp/src/main/java/org/apache/karaf/decanter/collector/snmp/SnmpTrap.java`
#### Snippet
```java
    private Dictionary<String, Object> configuration;

    private Address address;
    private Snmp snmp;
    private TransportMapping<? extends Address> transport;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `collector/snmp/src/main/java/org/apache/karaf/decanter/collector/snmp/SnmpTrap.java`
#### Snippet
```java

    private Address address;
    private Snmp snmp;
    private TransportMapping<? extends Address> transport;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `collector/snmp/src/main/java/org/apache/karaf/decanter/collector/snmp/SnmpPoller.java`
#### Snippet
```java
    private String oids;

    private Address address;
    private TransportMapping<? extends Address> transport;
    private Snmp snmp;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `collector/camel/src/main/java/org/apache/karaf/decanter/collector/camel/DecanterEventNotifier.java`
#### Snippet
```java
            return true;
        }
        if (event instanceof CamelEvent.ServiceStopFailureEvent && isIgnoreServiceEvents()) {
            return true;
        }
```

## RuleId[id=IgnoreResultOfCall]
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

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `collector/log4j-socket/src/main/java/org/apache/karaf/decanter/collector/log/socket/SocketCollector.java`
#### Snippet
```java
            this.executor.shutdown();
            try {
                this.executor.awaitTermination(2, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                // Ignore
```

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
Result of `ExecutorService.awaitTermination()` is ignored
in `collector/socket/src/main/java/org/apache/karaf/decanter/collector/socket/SocketCollector.java`
#### Snippet
```java
            this.executor.shutdown();
            try {
                this.executor.awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                // nothing to do
```

## RuleId[id=CharsetObjectCanBeUsed]
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

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition '!(message instanceof MapMessage)' covered by subsequent condition '!(message instanceof TextMessage)'
in `collector/jms/src/main/java/org/apache/karaf/decanter/collector/jms/JmsCollector.java`
#### Snippet
```java
        @Override
        public void onMessage(Message message) {
            if (!(message instanceof MapMessage) && !(message instanceof TextMessage)) {
                LOGGER.warn("JMS is not a MapMessage or a TextMessage.");
                return;
```

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
Unused import `import org.osgi.service.component.annotations.*;`
in `appender/elasticsearch/src/main/java/org/apache/karaf/decanter/appender/elasticsearch/ElasticsearchAppender.java`
#### Snippet
```java
import org.elasticsearch.client.RestClientBuilder;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.*;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
```

### UNUSED_IMPORT
Unused import `import org.osgi.service.component.annotations.*;`
in `appender/mongodb/src/main/java/org/apache/karaf/decanter/appender/mongodb/MongoDbAppender.java`
#### Snippet
```java
import org.bson.Document;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.*;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
```

### UNUSED_IMPORT
Unused import `import org.osgi.service.component.annotations.*;`
in `appender/socket/src/main/java/org/apache/karaf/decanter/appender/socket/SocketAppender.java`
#### Snippet
```java
import org.apache.karaf.decanter.appender.utils.EventFilter;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.*;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
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
Unused import `import org.osgi.service.component.annotations.*;`
in `collector/jms/src/main/java/org/apache/karaf/decanter/collector/jms/JmsCollector.java`
#### Snippet
```java
import org.apache.karaf.decanter.collector.utils.PropertiesPreparator;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.*;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;
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

### UNUSED_IMPORT
Unused import `import org.osgi.service.component.annotations.*;`
in `collector/snmp/src/main/java/org/apache/karaf/decanter/collector/snmp/SnmpPoller.java`
#### Snippet
```java
import org.apache.karaf.decanter.collector.utils.PropertiesPreparator;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.*;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;
```

### UNUSED_IMPORT
Unused import `import org.osgi.service.component.annotations.*;`
in `collector/snmp/src/main/java/org/apache/karaf/decanter/collector/snmp/SnmpTrap.java`
#### Snippet
```java
import org.apache.karaf.decanter.collector.utils.PropertiesPreparator;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.*;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `attributeObject` to `String` is redundant
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/BeanHarvester.java`
#### Snippet
```java
                Object attributeObject = connection.getAttribute(name, attribute.getName());
                if (attributeObject instanceof String) {
                    data.put(attribute.getName(), (String) attributeObject);
                } else if (attributeObject instanceof ObjectName) {
                    data.put(attribute.getName(), ((ObjectName) attributeObject).toString());
```

### RedundantCast
Casting `attributeObject` to `ObjectName` is redundant
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/BeanHarvester.java`
#### Snippet
```java
                    data.put(attribute.getName(), (String) attributeObject);
                } else if (attributeObject instanceof ObjectName) {
                    data.put(attribute.getName(), ((ObjectName) attributeObject).toString());
                } else if (attributeObject instanceof CompositeDataSupport || attributeObject instanceof CompositeData) {
                    CompositeData cds = (CompositeData) attributeObject;
```

### RedundantCast
Casting `attributeObject` to `Object[]` is redundant
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/BeanHarvester.java`
#### Snippet
```java
                    data.put(attribute.getName(), list);
                } else if (attributeObject instanceof Object[]) {
                    data.put(attribute.getName(), (Object[]) attributeObject);
                } else if (attributeObject instanceof long[]) {
                    data.put(attribute.getName(), (long[]) attributeObject);
```

### RedundantCast
Casting `attributeObject` to `long[]` is redundant
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/BeanHarvester.java`
#### Snippet
```java
                    data.put(attribute.getName(), (Object[]) attributeObject);
                } else if (attributeObject instanceof long[]) {
                    data.put(attribute.getName(), (long[]) attributeObject);
                } else if (attributeObject instanceof String[]) {
                    data.put(attribute.getName(), (String[]) attributeObject);
```

### RedundantCast
Casting `attributeObject` to `String[]` is redundant
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/BeanHarvester.java`
#### Snippet
```java
                    data.put(attribute.getName(), (long[]) attributeObject);
                } else if (attributeObject instanceof String[]) {
                    data.put(attribute.getName(), (String[]) attributeObject);
                } else if (attributeObject instanceof int[]) {
                    data.put(attribute.getName(), (int[]) attributeObject);
```

### RedundantCast
Casting `attributeObject` to `int[]` is redundant
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/BeanHarvester.java`
#### Snippet
```java
                    data.put(attribute.getName(), (String[]) attributeObject);
                } else if (attributeObject instanceof int[]) {
                    data.put(attribute.getName(), (int[]) attributeObject);
                } else {
                    data.put(attribute.getName(), attributeObject.toString());
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `api/src/main/java/org/apache/karaf/decanter/api/Scheduler.java`
#### Snippet
```java
     *
     * @return true if the schedule is started, false else.
     * @throws Exception
     */
    public boolean isStarted() throws Exception;
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `consuming` may be 'final'
in `collector/mqtt/src/main/java/org/apache/karaf/decanter/collector/mqtt/MqttCollector.java`
#### Snippet
```java
    private MqttClient client;
    private String dispatcherTopic;
    private boolean consuming = false;

    @Activate
```

### FieldMayBeFinal
Field `dispatcher` may be 'final'
in `collector/jms/src/main/java/org/apache/karaf/decanter/collector/jms/JmsCollector.java`
#### Snippet
```java
    public class DecanterMessageListener implements MessageListener {

        private EventAdmin dispatcher;
        private Unmarshaller unmarshaller;

```

### FieldMayBeFinal
Field `unmarshaller` may be 'final'
in `collector/jms/src/main/java/org/apache/karaf/decanter/collector/jms/JmsCollector.java`
#### Snippet
```java

        private EventAdmin dispatcher;
        private Unmarshaller unmarshaller;

        public DecanterMessageListener(EventAdmin dispatcher, Unmarshaller unmarshaller) {
```

### FieldMayBeFinal
Field `velocityEngine` may be 'final'
in `alerting/alerter/email/src/main/java/org/apache/karaf/decanter/alerting/email/EmailFormatter.java`
#### Snippet
```java
public class EmailFormatter {

    private VelocityEngine velocityEngine;

    public EmailFormatter() {
```

### FieldMayBeFinal
Field `gauges` may be 'final'
in `appender/prometheus/src/main/java/org/apache/karaf/decanter/appender/prometheus/PrometheusServlet.java`
#### Snippet
```java
    private boolean filtered = false;

    private Map<String, Gauge> gauges = new HashMap<>();

    @Activate
```

### FieldMayBeFinal
Field `data` may be 'final'
in `alerting/service/src/main/java/org/apache/karaf/decanter/alerting/service/Alert.java`
#### Snippet
```java
public class Alert {

    private HashMap<String, Object> data = new HashMap<>();

    public Alert() {}
```

### FieldMayBeFinal
Field `clientSocket` may be 'final'
in `collector/log4j-socket/src/main/java/org/apache/karaf/decanter/collector/log/socket/SocketCollector.java`
#### Snippet
```java

    private class SocketRunnable implements Runnable {
        private Socket clientSocket;

        public SocketRunnable(Socket clientSocket) {
```

### FieldMayBeFinal
Field `accumulation` may be 'final'
in `processor/groupby/src/main/java/org/apache/karaf/decanter/processor/groupby/GroupByProcessor.java`
#### Snippet
```java
    private boolean flat;

    private ConcurrentHashMap<Integer, List<Event>> accumulation = new ConcurrentHashMap<>();

    private ScheduledExecutorService scheduledExecutorService;
```

### FieldMayBeFinal
Field `confSource` may be 'final'
in `appender/kafka/src/main/java/org/apache/karaf/decanter/appender/kafka/ConfigMapper.java`
#### Snippet
```java
public class ConfigMapper {
    private Properties config;
    private Dictionary<String, Object> confSource;
    
    public static Properties map(Dictionary<String, Object> conf) {
```

### FieldMayBeFinal
Field `config` may be 'final'
in `appender/kafka/src/main/java/org/apache/karaf/decanter/appender/kafka/ConfigMapper.java`
#### Snippet
```java

public class ConfigMapper {
    private Properties config;
    private Dictionary<String, Object> confSource;
    
```

### FieldMayBeFinal
Field `connection` may be 'final'
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/BeanHarvester.java`
#### Snippet
```java
    private final static Logger LOGGER = LoggerFactory.getLogger(BeanHarvester.class);

    private MBeanServerConnection connection;
    private String type;
    
```

### FieldMayBeFinal
Field `type` may be 'final'
in `collector/jmx/src/main/java/org/apache/karaf/decanter/collector/jmx/BeanHarvester.java`
#### Snippet
```java

    private MBeanServerConnection connection;
    private String type;
    
    BeanHarvester(MBeanServerConnection connection, String type) throws UnknownHostException {
```

### FieldMayBeFinal
Field `mergedData` may be 'final'
in `processor/aggregate/src/main/java/org/apache/karaf/decanter/processor/aggregate/AggregateProcessor.java`
#### Snippet
```java

    private int index = 0;
    private ConcurrentHashMap<String, Object> mergedData = new ConcurrentHashMap<>();
    private ScheduledExecutorService scheduledExecutorService;

```

### FieldMayBeFinal
Field `tsFormat` may be 'final'
in `marshaller/json/src/main/java/org/apache/karaf/decanter/marshaller/json/JsonMarshaller.java`
#### Snippet
```java
public class JsonMarshaller implements Marshaller {

    private SimpleDateFormat tsFormat;
    
    boolean replaceDotsByUnderscores = true;
```

### FieldMayBeFinal
Field `dextender` may be 'final'
in `collector/camel/src/main/java/org/apache/karaf/decanter/collector/camel/DecanterInterceptStrategy.java`
#### Snippet
```java
    private EventAdmin dispatcher;
    private String topic = "decanter/collect/camel/tracer";
    private DefaultExchangeExtender dextender = new DefaultExchangeExtender();
    private DecanterCamelEventExtender extender;

```

### FieldMayBeFinal
Field `dextender` may be 'final'
in `collector/camel/src/main/java/org/apache/karaf/decanter/collector/camel/DecanterEventNotifier.java`
#### Snippet
```java
    private String camelContextMatcher = ".*";
    private String routeMatcher = ".*";
    private DefaultExchangeExtender dextender = new DefaultExchangeExtender();
    private DecanterCamelEventExtender extender;

```

### FieldMayBeFinal
Field `tsFormat` may be 'final'
in `collector/utils/src/main/java/org/apache/karaf/decanter/collector/utils/PropertiesPreparator.java`
#### Snippet
```java
    private final static String FIELDS_REMOVE = "fields.remove.";

    private static SimpleDateFormat tsFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX");

    /**
```

### FieldMayBeFinal
Field `globalTags` may be 'final'
in `appender/influxdb/src/main/java/org/apache/karaf/decanter/appender/influxdb/InfluxDbAppender.java`
#### Snippet
```java
    private Dictionary<String, Object> config;

    private Map<String, String> globalTags = new HashMap<>();

    private InfluxDB influxDB;
```

### FieldMayBeFinal
Field `packet` may be 'final'
in `collector/socket/src/main/java/org/apache/karaf/decanter/collector/socket/SocketCollector.java`
#### Snippet
```java
    private class DatagramRunnable implements Runnable {

        private DatagramPacket packet;

        public DatagramRunnable(DatagramPacket packet) {
```

### FieldMayBeFinal
Field `clientSocket` may be 'final'
in `collector/socket/src/main/java/org/apache/karaf/decanter/collector/socket/SocketCollector.java`
#### Snippet
```java
    private class SocketRunnable implements Runnable {

        private Socket clientSocket;
        private final long maxRequestSize;

```

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `appender/cassandra/src/main/java/org/apache/karaf/decanter/appender/cassandra/CassandraAppender.java`
#### Snippet
```java
        DriverConfigLoader loader =
                DriverConfigLoader.programmaticBuilder()
                        .withStringList(DefaultDriverOption.CONTACT_POINTS, Arrays.asList(host + ":" + port))
                        .withString(DefaultDriverOption.PROTOCOL_VERSION, "V3")
                        .withString(DefaultDriverOption.PROTOCOL_MAX_FRAME_LENGTH, "256 MB")
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `collector/kafka/src/main/java/org/apache/karaf/decanter/collector/kafka/KafkaCollector.java`
#### Snippet
```java
            Thread.currentThread().setContextClassLoader(null);
            consumer = new KafkaConsumer<String, String>(config);
            consumer.subscribe(Arrays.asList(topic));
        } finally {
            Thread.currentThread().setContextClassLoader(originClassLoader);
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
Condition `!(message instanceof TextMessage)` is always `true` when reached
in `collector/jms/src/main/java/org/apache/karaf/decanter/collector/jms/JmsCollector.java`
#### Snippet
```java
        @Override
        public void onMessage(Message message) {
            if (!(message instanceof MapMessage) && !(message instanceof TextMessage)) {
                LOGGER.warn("JMS is not a MapMessage or a TextMessage.");
                return;
```

### ConstantValue
Value `message` is always 'null'
in `collector/jms/src/main/java/org/apache/karaf/decanter/collector/jms/JmsCollector.java`
#### Snippet
```java
        @Override
        public void onMessage(Message message) {
            if (!(message instanceof MapMessage) && !(message instanceof TextMessage)) {
                LOGGER.warn("JMS is not a MapMessage or a TextMessage.");
                return;
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

### ConstantValue
Condition `source instanceof CamelContext` is always `false`
in `collector/camel/src/main/java/org/apache/karaf/decanter/collector/camel/DecanterEventNotifier.java`
#### Snippet
```java
                return contextMatches;
            }
        } else if (source instanceof CamelContext) {
            CamelContext context = (CamelContext)eventObject.getSource();
            return context.getName().matches(camelContextMatcher);
```

### ConstantValue
Condition `source instanceof Route` is always `false`
in `collector/camel/src/main/java/org/apache/karaf/decanter/collector/camel/DecanterEventNotifier.java`
#### Snippet
```java
            CamelContext context = (CamelContext)eventObject.getSource();
            return context.getName().matches(camelContextMatcher);
        } else if (source instanceof Route) {
            Route route = (Route)source;
            boolean contextMatches = route.getCamelContext().getName().matches(camelContextMatcher);
```

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

