# rocketmq-mqtt 
 
# Bad smells
I found 213 bad smells with 39 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 28 | false |
| UtilityClassWithoutPrivateConstructor | 19 | true |
| BoundedWildcard | 15 | false |
| SystemOutErr | 13 | false |
| RedundantFieldInitialization | 12 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 11 | false |
| UnnecessaryLocalVariable | 9 | true |
| SynchronizeOnThis | 8 | false |
| StaticCallOnSubclass | 7 | false |
| ThrowablePrintStackTrace | 7 | false |
| DataFlowIssue | 6 | false |
| InnerClassMayBeStatic | 6 | true |
| SynchronizeOnNonFinalField | 5 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 5 | false |
| Convert2MethodRef | 4 | false |
| UnnecessaryCallToStringValueOf | 4 | false |
| NonStrictComparisonCanBeEquality | 3 | true |
| DynamicRegexReplaceableByCompiledPattern | 3 | false |
| UseOfPropertiesAsHashtable | 3 | false |
| AssignmentToMethodParameter | 3 | false |
| ConstantValue | 3 | false |
| TypeParameterHidesVisibleType | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| WhileCanBeForeach | 2 | false |
| KeySetIterationMayUseEntrySet | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| AnonymousHasLambdaAlternative | 2 | false |
| UnnecessaryBoxing | 2 | false |
| CharsetObjectCanBeUsed | 2 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| NestedAssignment | 2 | false |
| Convert2Lambda | 2 | false |
| RedundantImplements | 2 | false |
| Finalize | 1 | false |
| AssignmentUsedAsCondition | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| CatchMayIgnoreException | 1 | false |
| UnnecessaryReturn | 1 | true |
| UnnecessaryToStringCall | 1 | true |
| MissortedModifiers | 1 | false |
| IgnoreResultOfCall | 1 | false |
| ThrowFromFinallyBlock | 1 | false |
| ListRemoveInLoop | 1 | false |
| Anonymous2MethodRef | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnusedAssignment | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[ruleID=Finalize]
### Finalize
'finalize()' should not be overridden
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/BackedFileOutputStream.java`
#### Snippet
```java

                @Override
                protected void finalize() {
                    try {
                        reset();
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `MetricsBuilderFactory` has only 'static' members, and lacks a 'private' constructor
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/collector/MetricsBuilderFactory.java`
#### Snippet
```java
import io.prometheus.client.SimpleCollector.Builder;

public class MetricsBuilderFactory {

    private static Builder newGaugeBuilder(MqttMetricsInfo mqttMetricsInfo) {
```

### UtilityClassWithoutPrivateConstructor
Class `RpcHeader` has only 'static' members, and lacks a 'private' constructor
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/RpcHeader.java`
#### Snippet
```java
package org.apache.rocketmq.mqtt.common.model;

public class RpcHeader {
    public static final String MQTT_CHANNEL_ID = "channelId";

```

### UtilityClassWithoutPrivateConstructor
Class `TopicUtils` has only 'static' members, and lacks a 'private' constructor
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/TopicUtils.java`
#### Snippet
```java


public class TopicUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `SpringUtils` has only 'static' members, and lacks a 'private' constructor
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/SpringUtils.java`
#### Snippet
```java
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtils {
    private static ClassPathXmlApplicationContext applicationContext;

```

### UtilityClassWithoutPrivateConstructor
Class `MessageUtil` has only 'static' members, and lacks a 'private' constructor
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/MessageUtil.java`
#### Snippet
```java


public class MessageUtil {
    public static final ByteBufAllocator ALLOCATOR = new UnpooledByteBufAllocator(false);

```

### UtilityClassWithoutPrivateConstructor
Class `StatUtil` has only 'static' members, and lacks a 'private' constructor
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/StatUtil.java`
#### Snippet
```java
import static java.math.BigDecimal.ROUND_HALF_UP;

public class StatUtil {
    private static Logger sysLogger = LoggerFactory.getLogger(StatUtil.class);
    private static Logger logger = LoggerFactory.getLogger("StatLogger");
```

### UtilityClassWithoutPrivateConstructor
Class `RpcCode` has only 'static' members, and lacks a 'private' constructor
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/RpcCode.java`
#### Snippet
```java
package org.apache.rocketmq.mqtt.common.model;

public class RpcCode {
    public static final int SUCCESS = 1;
    public static final int FAIL = -1;
```

### UtilityClassWithoutPrivateConstructor
Class `Startup` has only 'static' members, and lacks a 'private' constructor
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/starter/Startup.java`
#### Snippet
```java


public class Startup {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Constants.java`
#### Snippet
```java
package org.apache.rocketmq.mqtt.common.model;

public class Constants {
    public static final String NAMESPACE_SPLITER = "%";
    public static final String MQTT_TOPIC_DELIMITER = "/";
```

### UtilityClassWithoutPrivateConstructor
Class `MqttConsumer` has only 'static' members, and lacks a 'private' constructor
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttConsumer.java`
#### Snippet
```java
import java.util.Date;

public class MqttConsumer {
    public static void main(String[] args) throws MqttException, NoSuchAlgorithmException, InvalidKeyException {
        String brokerUrl = System.getenv("brokerUrl");
```

### UtilityClassWithoutPrivateConstructor
Class `NamespaceUtil` has only 'static' members, and lacks a 'private' constructor
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/NamespaceUtil.java`
#### Snippet
```java
import org.apache.commons.lang3.StringUtils;

public class NamespaceUtil {
    public static final String NAMESPACE_SPLITER = "%";
    private static final int RESOURCE_LENGTH = 2;
```

### UtilityClassWithoutPrivateConstructor
Class `RocketMQProducer` has only 'static' members, and lacks a 'private' constructor
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/RocketMQProducer.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class RocketMQProducer {
    private static DefaultMQProducer producer;
    private static String firstTopic = System.getenv("firstTopic");
```

### UtilityClassWithoutPrivateConstructor
Class `MqFactory` has only 'static' members, and lacks a 'private' constructor
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/mq/MqFactory.java`
#### Snippet
```java


public class MqFactory {
    public static synchronized DefaultMQProducer buildDefaultMQProducer(String group, Properties properties) {
        MqProducer mqProducer = new MqProducer(properties);
```

### UtilityClassWithoutPrivateConstructor
Class `MqttProducer` has only 'static' members, and lacks a 'private' constructor
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttProducer.java`
#### Snippet
```java
import java.util.Date;

public class MqttProducer {
    public static void main(String[] args) throws InterruptedException, MqttException, NoSuchAlgorithmException, InvalidKeyException {
        MemoryPersistence memoryPersistence = new MemoryPersistence();
```

### UtilityClassWithoutPrivateConstructor
Class `Remark` has only 'static' members, and lacks a 'private' constructor
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Remark.java`
#### Snippet
```java


public class Remark {

    public static final String SUCCESS = "success";
```

### UtilityClassWithoutPrivateConstructor
Class `HmacSHA1Util` has only 'static' members, and lacks a 'private' constructor
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/HmacSHA1Util.java`
#### Snippet
```java
import java.security.NoSuchAlgorithmException;

public class HmacSHA1Util {
    private static Charset charset = Charset.forName("UTF-8");
    private static String algorithm = "HmacSHA1";
```

### UtilityClassWithoutPrivateConstructor
Class `RocketMQConsumer` has only 'static' members, and lacks a 'private' constructor
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/RocketMQConsumer.java`
#### Snippet
```java
import java.util.List;

public class RocketMQConsumer {

    public static void main(String[] args) throws MQClientException {
```

### UtilityClassWithoutPrivateConstructor
Class `MqttMetricsCollector` has only 'static' members, and lacks a 'private' constructor
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/collector/MqttMetricsCollector.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class MqttMetricsCollector {
    public static final CollectorRegistry COLLECTOR_REGISTRY = CollectorRegistry.defaultRegistry;
    private static final Logger LOG = LoggerFactory.getLogger(MqttMetricsCollector.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ChannelInfo` has only 'static' members, and lacks a 'private' constructor
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/ChannelInfo.java`
#### Snippet
```java
import java.util.concurrent.ConcurrentMap;

public class ChannelInfo {
    private static final String CHANNEL_ID_KEY = "0";
    private static final String CHANNEL_CLIENT_ID_KEY = "1";
```

## RuleId[ruleID=AssignmentUsedAsCondition]
### AssignmentUsedAsCondition
Assignment `result = doNotify(node, messageEvents)` used as condition
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/notify/NotifyManager.java`
#### Snippet
```java
                    continue;
                }
                if (result = doNotify(node, messageEvents)) {
                    nodeFailCount.set(0);
                    continue;
```

## RuleId[ruleID=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/MetaPersistManagerSample.java`
#### Snippet
```java
            String[] ss = StringUtils.split(value, VALUE_SPLITTER);
            Set<String> set = new HashSet<>();
            for (String s : ss) {
                set.add(s);
            }
```

## RuleId[ruleID=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `parseObject()` declared in class 'com.alibaba.fastjson.JSON' but referenced via subclass 'com.alibaba.fastjson.JSONObject'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/MessageUtil.java`
#### Snippet
```java
            if (ext != null) {
                message.getUserProperties().putAll(
                    com.alibaba.fastjson.JSONObject.parseObject(ext, new TypeReference<Map<String, String>>() { }));
            }
            messageList.add(message);
```

### StaticCallOnSubclass
Static method `toJSONString()` declared in class 'com.alibaba.fastjson.JSON' but referenced via subclass 'com.alibaba.fastjson.JSONObject'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/MessageUtil.java`
#### Snippet
```java
            mqMessage.putUserProperty(Message.propertyStoreTime, String.valueOf(message.getStoreTimestamp()));
            mqMessage.putUserProperty(Message.propertyUserProperties,
                JSONObject.toJSONString(message.getUserProperties()));
            mqMessages.add(mqMessage);
        }
```

### StaticCallOnSubclass
Static method `toJSONString()` declared in class 'com.alibaba.fastjson.JSON' but referenced via subclass 'com.alibaba.fastjson.JSONObject'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java
                    pullMessage(session, subscription, queue);
                } else {
                    logger.error("response:{},{}", session.getClientId(), JSONObject.toJSONString(pullResult));
                }
            } finally {
```

### StaticCallOnSubclass
Static method `parseArray()` declared in class 'com.alibaba.fastjson.JSON' but referenced via subclass 'com.alibaba.fastjson.JSONObject'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/notify/NotifyRetryManager.java`
#### Snippet
```java
            throws  InterruptedException, RemotingException, MQClientException, MQBrokerException {
        String payload = new String(messageExt.getBody(), StandardCharsets.UTF_8);
        Set<MessageEvent> events = new HashSet<>(JSONObject.parseArray(payload, MessageEvent.class));
        String node = messageExt.getUserProperty(Constants.PROPERTY_MQTT_MSG_EVENT_RETRY_NODE);
        String retryTime = messageExt.getUserProperty(Constants.PROPERTY_MQTT_MSG_EVENT_RETRY_TIME);
```

### StaticCallOnSubclass
Static method `parseArray()` declared in class 'com.alibaba.fastjson.JSON' but referenced via subclass 'com.alibaba.fastjson.JSONObject'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/rpc/RpcPacketDispatcher.java`
#### Snippet
```java
    private void doNotify(RemotingCommand request) {
        String payload = new String(request.getBody(), StandardCharsets.UTF_8);
        List<MessageEvent> events = JSONObject.parseArray(payload, MessageEvent.class);
        messageNotifyAction.notify(events);
    }
```

### StaticCallOnSubclass
Static method `toJSONString()` declared in class 'com.alibaba.fastjson.JSON' but referenced via subclass 'com.alibaba.fastjson.JSONObject'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/store/LmqQueueStoreManager.java`
#### Snippet
```java
        Map<String, String> userProps = message.getUserProperties();
        if (userProps != null && !userProps.isEmpty()) {
            mqMessage.putUserProperty(Constants.PROPERTY_MQTT_EXT_DATA, JSONObject.toJSONString(userProps));
        }
        return mqMessage;
```

### StaticCallOnSubclass
Static method `parseObject()` declared in class 'com.alibaba.fastjson.JSON' but referenced via subclass 'com.alibaba.fastjson.JSONObject'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/store/LmqQueueStoreManager.java`
#### Snippet
```java
        if (StringUtils.isNotBlank(mqMessage.getUserProperty(Constants.PROPERTY_MQTT_EXT_DATA))) {
            message.getUserProperties().putAll(
                    JSONObject.parseObject(mqMessage.getUserProperty(Constants.PROPERTY_MQTT_EXT_DATA),
                            new TypeReference<Map<String, String>>() {
                            }));
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Argument `pubTopic` might be null
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/upstream/processor/PublishProcessor.java`
#### Snippet
```java
        String originTopic = variableHeader.topicName();
        String pubTopic = TopicUtils.normalizeTopic(originTopic);
        MqttTopic mqttTopic = TopicUtils.decode(pubTopic);
        firstTopicManager.checkFirstTopicIfCreated(mqttTopic.getFirstTopic());
        Set<String> queueNames = wildcardManager.matchQueueSetByMsgTopic(pubTopic, context.getNamespace());
```

### DataFlowIssue
Argument `topicFilter` might be null
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/upstream/processor/UnSubscribeProcessor.java`
#### Snippet
```java
            for (String topic : payload.topics()) {
                String topicFilter = TopicUtils.normalizeTopic(topic);
                MqttTopic mqttTopic = TopicUtils.decode(topicFilter);
                firstTopicManager.checkFirstTopicIfCreated(mqttTopic.getFirstTopic());
                Subscription subscription = new Subscription();
```

### DataFlowIssue
Argument `topicFilter` might be null
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/upstream/processor/SubscribeProcessor.java`
#### Snippet
```java
        for (MqttTopicSubscription mqttTopicSubscription : mqttTopicSubscriptions) {
            String topicFilter = TopicUtils.normalizeTopic(mqttTopicSubscription.topicName());
            MqttTopic mqttTopic = TopicUtils.decode(topicFilter);
            firstTopicManager.checkFirstTopicIfCreated(mqttTopic.getFirstTopic());
            Subscription subscription = new Subscription();
```

### DataFlowIssue
Method invocation `contains` may produce `NullPointerException`
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/WildcardManager.java`
#### Snippet
```java
        Trie<String, Integer> finalTrie = trie;
        trie.traverseAll((path, nodeKey) -> {
            if (!wildcards.contains(path)) {
                finalTrie.deleteNode(path, nodeKey);
            }
```

### DataFlowIssue
Method invocation `getChannelId` may produce `NullPointerException`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
                    if (MqttMessageType.PUBLISH.equals(retryMessage.mqttMessageType)) {
                        if (session == null || session.isDestroyed()) {
                            cleanRetryMessage(mqttMsgId, session.getChannelId());
                            continue;
                        }
```

### DataFlowIssue
Method invocation `getClientId` may produce `NullPointerException`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
                        if (session == null || session.isDestroyed() || retryMessage.mountRelTimeout()) {
                            retryCache.invalidate(entry.getKey());
                            logger.error("failed to retry pub rel more times,{},{}", session.getClientId(), mqttMsgId);
                            pushAction.rollNextByAck(session, mqttMsgId);
                            continue;
```

## RuleId[ruleID=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
    }

    class TrieNode<K, V> {
        public TrieNode<K, V> parentNode;
        public Map<String, TrieNode<K, V>> children = new ConcurrentHashMap<>();
```

### TypeParameterHidesVisibleType
Type parameter `V` hides type parameter 'V'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
    }

    class TrieNode<K, V> {
        public TrieNode<K, V> parentNode;
        public Map<String, TrieNode<K, V>> children = new ConcurrentHashMap<>();
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/ws/WebSocketServerHandler.java`
#### Snippet
```java
        }
        String upgrade = req.headers().get("Upgrade");
        if (upgrade == null || (!"websocket".equals(upgrade.toLowerCase()))) {
            return;
        }
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
        boolean isPathEnd = (level == maxLevel || isNumberSign) && !currentNode.valueSet.isEmpty() && builder.length() > 0;
        if (isPathEnd) {
            result.add(TopicUtils.normalizeTopic(builder.toString().substring(0, builder.length() - 1)));
        }
        // match the '#'
```

## RuleId[ruleID=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
        }
        Iterator<Entry<K, V>> iterator = currentNode.valueSet.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            try {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
        queueOffset = queueOffsetMap.get(queue);
        Iterator<Message> iterator = messages.iterator();
        while (iterator.hasNext()) {
            Message message = iterator.next();
            if (message.getOffset() < queueOffset.getOffset() && queueOffset.getOffset() != Long.MAX_VALUE) {
```

## RuleId[ruleID=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `topicFilter`
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttConsumer.java`
#### Snippet
```java
                System.out.println(recvClientId + " connect success to " + serverURI);
                try {
                    final String topicFilter[] = {firstTopic + "/r1", firstTopic + "/r/+", firstTopic + "/r2"};
                    final int[] qos = {1, 1, 2};
                    mqttClient.subscribe(topicFilter, qos);
```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java
        persistOffsetScheduler = new ScheduledThreadPoolExecutor(1, new ThreadFactoryImpl("persistOffset_scheduler_"));
        persistOffsetScheduler.scheduleWithFixedDelay(() -> persistAllOffset(true), 5000, 5000, TimeUnit.MILLISECONDS);
        pullService.scheduleWithFixedDelay(() -> pullLoop(), pullIntervalMillis, pullIntervalMillis, TimeUnit.MILLISECONDS);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/WildcardManager.java`
#### Snippet
```java
                return;
            }
            topics.forEach(firstTopic -> refreshWildcards(firstTopic));
        } catch (Exception e) {
            logger.error("", e);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/WildcardManager.java`
#### Snippet
```java
    public void init() {
        scheduler = new ScheduledThreadPoolExecutor(1, new ThreadFactoryImpl("loadWildcard_thread_"));
        scheduler.scheduleWithFixedDelay(() -> refreshLoadWildcard(), 0, 5, TimeUnit.SECONDS);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
        }).build();

        scheduler.scheduleWithFixedDelay(() -> doRetryCache(), scheduleDelaySecs, connectConf.getRetryIntervalSeconds(), TimeUnit.SECONDS);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
```

## RuleId[ruleID=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/mq/MqProducer.java`
#### Snippet
```java

    public String buildInstanceName() {
        return Integer.toString(UtilAll.getPid())
                + "#" + System.nanoTime();
    }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/mq/MqPullConsumer.java`
#### Snippet
```java

    public String buildInstanceName() {
        return Integer.toString(UtilAll.getPid())
                + "#" + System.nanoTime();
    }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/mq/MqConsumer.java`
#### Snippet
```java

    public String buildInstanceName() {
        return Integer.toString(UtilAll.getPid())
                + "#" + System.nanoTime();
    }
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
    private String buildKey(int mqttMsgId, String channelId) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(mqttMsgId));
        sb.append("_");
        sb.append(channelId);
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `offsetMapParam.keySet()` may be replaced with 'entrySet()' iteration
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
    public void addOffset(Map<String, Map<Queue, QueueOffset>> offsetMapParam) {
        if (offsetMapParam != null && !offsetMapParam.isEmpty()) {
            for (String queueName : offsetMapParam.keySet()) {
                if (!subscriptions.containsKey(queueName)) {
                    continue;
```

### KeySetIterationMayUseEntrySet
Iteration over `offsetMap.keySet()` may be replaced with 'entrySet()' iteration
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
    public Map<Subscription, Map<Queue, QueueOffset>> offsetMapSnapshot() {
        Map<Subscription, Map<Queue, QueueOffset>> tmp = new HashMap<>(8);
        for (String queueName : offsetMap.keySet()) {
            Subscription subscription = subscriptions.get(queueName);
            if (subscription == null) {
```

## RuleId[ruleID=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
            try {
                method.doMethod(builder.toString(), entry.getKey());
            } catch (Throwable e) {
            }
        }
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java

    private String eventQueueKey(Session session, Queue queue) {
        StringBuilder sb = new StringBuilder();
        sb.append(ChannelInfo.getId(session.getChannel()));
        sb.append("-");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java

    private String buildKey(int mqttMsgId, String channelId) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(mqttMsgId));
        sb.append("_");
```

## RuleId[ruleID=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java
                    if (pullResult.getMessageList().size() >= count && !isFirst) {
                        addLoadEvent(queue, event.session);
                        return;
                    }
                }
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/ws/WebSocketServerHandler.java`
#### Snippet
```java
        String request = ((TextWebSocketFrame) frame).text();
        ctx.channel().write(
                new TextWebSocketFrame(request + " , welcome netty websocket: " + new java.util.Date().toString()));
    }

```

## RuleId[ruleID=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `MsgIdEntry` may be 'static'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/MqttMsgId.java`
#### Snippet
```java
    }

    class MsgIdEntry {
        private int nextMsgId = MIN_MSG_ID - 1;
        private Map<Integer, Integer> inUseMsgIds = new ConcurrentHashMap<>();
```

### InnerClassMayBeStatic
Inner class `QueueEvent` may be 'static'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java
    }

    class QueueEvent {
        long id;
        Session session;
```

### InnerClassMayBeStatic
Inner class `CacheEntry` may be 'static'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java
    }

    class CacheEntry {
        private AtomicBoolean loading = new AtomicBoolean(false);
        private List<Message> messageList = new ArrayList<>();
```

### InnerClassMayBeStatic
Inner class `TrieNode` may be 'static'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
    }

    class TrieNode<K, V> {
        public TrieNode<K, V> parentNode;
        public Map<String, TrieNode<K, V>> children = new ConcurrentHashMap<>();
```

### InnerClassMayBeStatic
Inner class `PendingDown` may be 'static'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/InFlyCache.java`
#### Snippet
```java
    }

    public class PendingDown {
        private Subscription subscription;
        private Queue queue;
```

### InnerClassMayBeStatic
Inner class `RetryMessage` may be 'static'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
    }

    public class RetryMessage {
        private Session session;
        private Message message;
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends PullResult`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java
    }

    private void callbackResult(CompletableFuture<PullResult> pullResult, CompletableFuture<PullResult> callBackResult) {
        pullResult.whenComplete((pullResult1, throwable) -> {
            if (throwable != null) {
```

### BoundedWildcard
Can generalize to `? super PullResult`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java
    }

    private void callbackResult(CompletableFuture<PullResult> pullResult, CompletableFuture<PullResult> callBackResult) {
        pullResult.whenComplete((pullResult1, throwable) -> {
            if (throwable != null) {
```

### BoundedWildcard
Can generalize to `? extends Queue`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java
    }

    public void refreshCache(Pair<Queue, Session> pair) {
        Queue queue = pair.getLeft();
        if (queue == null) {
```

### BoundedWildcard
Can generalize to `? extends Session`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java
    }

    public void refreshCache(Pair<Queue, Session> pair) {
        Queue queue = pair.getLeft();
        if (queue == null) {
```

### BoundedWildcard
Can generalize to `? extends Message`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/MessageUtil.java`
#### Snippet
```java


    public static byte[] encode(List<Message> messageList) {
        if (messageList == null || messageList.isEmpty()) {
            return null;
```

### BoundedWildcard
Can generalize to `? extends MessageEvent`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/notify/MessageNotifyAction.java`
#### Snippet
```java
    private QueueFresh queueFresh;

    public void notify(List<MessageEvent> events) {
        if (events == null || events.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super K`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
    }

    private void traverse(TrieNode<K, V> currentNode, TrieMethod<K, V> method, StringBuilder builder) {
        for (Map.Entry<String, TrieNode<K, V>> entry : currentNode.children.entrySet()) {
            int start = builder.length();
```

### BoundedWildcard
Can generalize to `? extends Subscription`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/match/MatchAction.java`
#### Snippet
```java
    }

    public void addSubscription(Session session, Set<Subscription> subscriptions) {
        String channelId = session.getChannelId();
        if (channelId == null || subscriptions == null || subscriptions.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends Subscription`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/match/MatchAction.java`
#### Snippet
```java
    }

    public void removeSubscription(Session session, Set<Subscription> subscriptions) {
        String channelId = session.getChannelId();
        if (channelId == null || subscriptions == null || subscriptions.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends Subscription`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
    }

    public void addSubscription(Set<Subscription> subscriptionsParam) {
        if (CollectionUtils.isEmpty(subscriptionsParam)) {
            return;
```

### BoundedWildcard
Can generalize to `? extends Map`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
    }

    public void addOffset(Map<String, Map<Queue, QueueOffset>> offsetMapParam) {
        if (offsetMapParam != null && !offsetMapParam.isEmpty()) {
            for (String queueName : offsetMapParam.keySet()) {
```

### BoundedWildcard
Can generalize to `? extends Queue`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
    }

    public void freshQueue(Subscription subscription, Set<Queue> queues) {
        if (subscription == null) {
            throw new RuntimeException("subscription is null");
```

### BoundedWildcard
Can generalize to `? extends Queue`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
    }

    public void addOffset(String queueName, Map<Queue, QueueOffset> map) {
        if (queueName == null) {
            throw new RuntimeException("queueName is null");
```

### BoundedWildcard
Can generalize to `? extends QueueOffset`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
    }

    public void addOffset(String queueName, Map<Queue, QueueOffset> map) {
        if (queueName == null) {
            throw new RuntimeException("queueName is null");
```

### BoundedWildcard
Can generalize to `? extends Predicate`
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/MqttHTTPServer.java`
#### Snippet
```java
        }

        public HTTPMetricHandler(CollectorRegistry registry, Supplier<Predicate<String>> sampleNameFilterSupplier) {
            this.registry = registry;
            this.sampleNameFilterSupplier = sampleNameFilterSupplier;
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/MqttHTTPServer.java`
#### Snippet
```java
     */
    public static class HTTPMetricHandler implements HttpHandler {
        private final static String HEALTHY_RESPONSE = "Exporter is Healthy.";
        private final CollectorRegistry registry;
        private final LocalByteArray response = new LocalByteArray();
```

## RuleId[ruleID=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/mq/MqPullConsumer.java`
#### Snippet
```java
            throw new RuntimeException(e);
        }
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
```

### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/mq/MqConsumer.java`
#### Snippet
```java
            throw new RuntimeException(e);
        }
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/mq/MqConsumer.java`
#### Snippet
```java
        defaultMQPushConsumer.setPullBatchSize(Integer.parseInt(properties.getProperty("pullBatch", "64")));
        if (properties.get(THREAD_NUM_KEY) != null) {
            defaultMQPushConsumer.setConsumeThreadMin(Integer.valueOf((String)properties.get("threadNum")));
            defaultMQPushConsumer.setConsumeThreadMax(Integer.valueOf((String)properties.get("threadNum")));
        }
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/mq/MqConsumer.java`
#### Snippet
```java
        if (properties.get(THREAD_NUM_KEY) != null) {
            defaultMQPushConsumer.setConsumeThreadMin(Integer.valueOf((String)properties.get("threadNum")));
            defaultMQPushConsumer.setConsumeThreadMax(Integer.valueOf((String)properties.get("threadNum")));
        }
        defaultMQPushConsumer.setInstanceName(this.buildInstanceName());
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/BackedFileOutputStream.java`
#### Snippet
```java
                out = transfer;
            } catch (IOException e) {
                temp.delete();
                throw e;
            }
```

## RuleId[ruleID=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `upstreamHookList`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/hook/UpstreamHookManagerImpl.java`
#### Snippet
```java
    private void assembleNextHook() {
        if (isAssembled.compareAndSet(false, true)) {
            synchronized (upstreamHookList) {
                for (int i = 0; i < upstreamHookList.length - 1; i++) {
                    UpstreamHook upstreamHook = upstreamHookList[i];
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `upstreamHookList`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/hook/UpstreamHookManagerImpl.java`
#### Snippet
```java
            throw new IllegalArgumentException("Hook Was Assembled");
        }
        synchronized (upstreamHookList) {
            upstreamHookList[index] = upstreamHook;
        }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `topicCache`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/match/MatchAction.java`
#### Snippet
```java
            }

            synchronized (topicCache) {
                topicCache.putIfAbsent(topicFilter, new HashSet<>());
                topicCache.get(topicFilter).add(channelId);
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `topicCache`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/match/MatchAction.java`
#### Snippet
```java
            }

            synchronized (topicCache) {
                Set<String> channelIdSet = topicCache.get(topicFilter);
                if (channelIdSet != null) {
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `topicCache`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/match/MatchAction.java`
#### Snippet
```java
        } else {
            Set<String> channelIdSet = new HashSet<>();
            synchronized (topicCache) {
                Set<String> precises = topicCache.get(topic);
                if (precises != null && !precises.isEmpty()) {
```

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/StatUtil.java`
#### Snippet
```java

    public static String buildKey(String... keys) {
        if (keys == null || keys.length <= 0) {
            return null;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/hook/UpstreamHookManagerImpl.java`
#### Snippet
```java
        assembleNextHook();
        CompletableFuture<HookResult> hookResult = new CompletableFuture<>();
        if (upstreamHookList.length <= 0) {
            hookResult.complete(new HookResult(HookResult.SUCCESS, -1, null, null));
            return hookResult;
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
        }
        synchronized (this) {
            return messages.size() <= 0;
        }
    }
```

## RuleId[ruleID=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/HmacSHA1Util.java`
#### Snippet
```java

public class HmacSHA1Util {
    private static Charset charset = Charset.forName("UTF-8");
    private static String algorithm = "HmacSHA1";

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/MqttHTTPServer.java`
#### Snippet
```java
            BackedFileOutputStream response = this.response.get();
            response.reset();
            OutputStreamWriter osw = new OutputStreamWriter(response, Charset.forName("UTF-8"));
            if ("/-/healthy".equals(contextPath)) {
                osw.write(HEALTHY_RESPONSE);
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/BackedFileOutputStream.java`
#### Snippet
```java
                        reset();
                    } catch (Throwable t) {
                        t.printStackTrace(System.err);
                    }
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/starter/Startup.java`
#### Snippet
```java
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        SpringUtils.SetClassPathXmlApplicationContext(applicationContext);
        System.out.println("start rocketmq mqtt  ...");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttConsumer.java`
#### Snippet
```java
                    String payload = new String(mqttMessage.getPayload());
                    String[] ss = payload.split("_");
                    System.out.println(now() + "receive:" + topic + "," + payload
                            + " ---- rt:" + (System.currentTimeMillis() - Long.parseLong(ss[1])));
                } catch (Exception e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttConsumer.java`
#### Snippet
```java
            @Override
            public void connectComplete(boolean reconnect, String serverURI) {
                System.out.println(recvClientId + " connect success to " + serverURI);
                try {
                    final String topicFilter[] = {firstTopic + "/r1", firstTopic + "/r/+", firstTopic + "/r2"};
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttConsumer.java`
#### Snippet
```java
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("connect fail");
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/RocketMQProducer.java`
#### Snippet
```java
        setLmq(msg, new HashSet<>(Arrays.asList(TopicUtils.wrapLmq(firstTopic, secondTopic))));
        SendResult sendResult = producer.send(msg);
        System.out.println(now() + "sendMessage: " + new String(msg.getBody()));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/RocketMQProducer.java`
#### Snippet
```java
        setLmq(msg, lmqSet);
        SendResult sendResult = producer.send(msg);
        System.out.println(now() + "sendWcMessage: " + new String(msg.getBody()));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttProducer.java`
#### Snippet
```java
            @Override
            public void connectComplete(boolean reconnect, String serverURI) {
                System.out.println(sendClientId + " connect success to " + serverURI);
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttProducer.java`
#### Snippet
```java
            String mqttSendTopic = firstTopic + "/r1";
            mqttClient.publish(mqttSendTopic, message);
            System.out.println(now() + "send: " + mqttSendTopic + ", " + msg);
            Thread.sleep(interval);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttProducer.java`
#### Snippet
```java
            messageWild.setQos(1);
            mqttClient.publish(mqttSendTopic, messageWild);
            System.out.println(now() + "send: " + mqttSendTopic + ", " + msg);
            Thread.sleep(interval);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttProducer.java`
#### Snippet
```java
            message.setQos(2);
            mqttClient.publish(mqttSendTopic, message);
            System.out.println(now() + "send: " + mqttSendTopic + ", " + msg);
            Thread.sleep(interval);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/RocketMQConsumer.java`
#### Snippet
```java
        consumer.start();

        System.out.printf("Consumer Started.%n");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/RocketMQConsumer.java`
#### Snippet
```java
                                                            ConsumeConcurrentlyContext context) {
                MessageExt messageExt = msgs.get(0);
                System.out.println(now() + "Receive: " + new String(messageExt.getBody()));
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
```

## RuleId[ruleID=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/BackedFileOutputStream.java`
#### Snippet
```java
                file = null;
                if (!deleteMe.delete()) {
                    throw new IOException("Could not delete: " + deleteMe);
                }
            }
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/notify/NotifyManager.java`
#### Snippet
```java
                    continue;
                }
                String originQueue = lmq.replace(MixAll.LMQ_PREFIX, "");
                messageEvent.setPubTopic(StringUtils.replace(originQueue, "%","/"));
            }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/ChannelInfo.java`
#### Snippet
```java
            return (String)info.get(CHANNEL_ID_KEY);
        }
        String channelIdStr = UUID.randomUUID().toString().replaceAll("-", "").toLowerCase();
        info.put(CHANNEL_ID_KEY, channelIdStr);
        return channelIdStr;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/store/LmqQueueStoreManager.java`
#### Snippet
```java
                    continue;
                }
                String originQueue = lmq.replace(MixAll.LMQ_PREFIX, "");
                message.setOriginTopic(StringUtils.replace(originQueue, "%","/"));
            }
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.alibaba.fastjson` is unnecessary and can be removed
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/MessageUtil.java`
#### Snippet
```java
            if (ext != null) {
                message.getUserProperties().putAll(
                    com.alibaba.fastjson.JSONObject.parseObject(ext, new TypeReference<Map<String, String>>() { }));
            }
            messageList.add(message);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/ws/WebSocketServerHandler.java`
#### Snippet
```java
        String request = ((TextWebSocketFrame) frame).text();
        ctx.channel().write(
                new TextWebSocketFrame(request + " , welcome netty websocket: " + new java.util.Date().toString()));
    }

```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttConsumer.java`
#### Snippet
```java
                            + " ---- rt:" + (System.currentTimeMillis() - Long.parseLong(ss[1])));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttConsumer.java`
#### Snippet
```java
                    mqttClient.subscribe(topicFilter, qos);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttConsumer.java`
#### Snippet
```java
            @Override
            public void connectionLost(Throwable throwable) {
                throwable.printStackTrace();
            }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttConsumer.java`
#### Snippet
```java
            mqttClient.connect(mqttConnectOptions);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("connect fail");
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/RocketMQProducer.java`
#### Snippet
```java
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttProducer.java`
#### Snippet
```java
            @Override
            public void connectionLost(Throwable throwable) {
                throwable.printStackTrace();
            }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttProducer.java`
#### Snippet
```java
            mqttClient.connect(mqttConnectOptions);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long interval = 1000;
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/BackedFileOutputStream.java`
#### Snippet
```java
        byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];
        int read;
        while ((read = fileInputStream.read(buffer, 0, DEFAULT_BUFFER_SIZE)) >= 0) {
            out.write(buffer, 0, read);
            transferred += read;
```

### NestedAssignment
Result of assignment expression used
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/notify/NotifyManager.java`
#### Snippet
```java
                    continue;
                }
                if (result = doNotify(node, messageEvents)) {
                    nodeFailCount.set(0);
                    continue;
```

## RuleId[ruleID=ListRemoveInLoop]
### ListRemoveInLoop
Can be replaced with 'List.subList().clear()'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java
                        }
                        int overNum = finalCacheEntry.messageList.size() - connectConf.getQueueCacheSize();
                        for (int i = 0; i < overNum; i++) {
                            finalCacheEntry.messageList.remove(0);
                        }
```

## RuleId[ruleID=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Runnable() can be replaced with method reference
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/MqttHTTPServer.java`
#### Snippet
```java
            server.start();
        } else {
            FutureTask<Void> startTask = new FutureTask<Void>(new Runnable() {
                @Override
                public void run() {
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `file` is accessed in both synchronized and unsynchronized contexts
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/BackedFileOutputStream.java`
#### Snippet
```java
    private OutputStream out;
    private MemoryOutput memory;
    private File file;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `memory` is accessed in both synchronized and unsynchronized contexts
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/BackedFileOutputStream.java`
#### Snippet
```java

    private OutputStream out;
    private MemoryOutput memory;
    private File file;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `connectConf` is accessed in both synchronized and unsynchronized contexts
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java

    @Resource
    private ConnectConf connectConf;

    @Resource
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `upstreamHookList` is accessed in both synchronized and unsynchronized contexts
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/hook/UpstreamHookManagerImpl.java`
#### Snippet
```java
public class UpstreamHookManagerImpl implements UpstreamHookManager {

    private UpstreamHook[] upstreamHookList = new UpstreamHook[UpstreamHookEnum.values().length];
    private AtomicBoolean isAssembled = new AtomicBoolean(false);

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `rootNode` is accessed in both synchronized and unsynchronized contexts
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
public class Trie<K, V> {

    private TrieNode<K, V> rootNode = new TrieNode(null);

    public synchronized V addNode(String key, V nodeValue, K nodeKey) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `sessionMap` is accessed in both synchronized and unsynchronized contexts
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java
     * channelId->session
     */
    private Map<String, Session> sessionMap = new ConcurrentHashMap<>(1024);
    private Map<String, Map<String, Session>> clientMap = new ConcurrentHashMap<>(1024);
    private Map<String, PullEvent> pullEventMap = new ConcurrentHashMap<>(1024);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `clientMap` is accessed in both synchronized and unsynchronized contexts
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java
     */
    private Map<String, Session> sessionMap = new ConcurrentHashMap<>(1024);
    private Map<String, Map<String, Session>> clientMap = new ConcurrentHashMap<>(1024);
    private Map<String, PullEvent> pullEventMap = new ConcurrentHashMap<>(1024);
    private Map<String, Boolean> pullStatus = new ConcurrentHashMap<>(1024);
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `httpServer` is accessed in both synchronized and unsynchronized contexts
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/collector/MqttMetricsCollector.java`
#### Snippet
```java
    private static String hostName;
    private static String hostIp;
    private static MqttHTTPServer httpServer;

    public static synchronized void initialize(String nameSpace, String hostName, String hostIp, int exporterPort) throws IOException {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `sendingMessages` is accessed in both synchronized and unsynchronized contexts
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
    private ConcurrentMap<String, Map<Queue, QueueOffset>> offsetMap = new ConcurrentHashMap<>(16);
    private Map<String, Subscription> subscriptions = new ConcurrentHashMap<>();
    private ConcurrentMap<Subscription, Map<Queue, LinkedHashSet<Message>>> sendingMessages = new ConcurrentHashMap<>(16);
    private ConcurrentMap<Subscription, Integer> loadStatusMap = new ConcurrentHashMap<>();

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `logger` is accessed in both synchronized and unsynchronized contexts
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java

public class Session {
    private static Logger logger = LoggerFactory.getLogger(Session.class);
    private final long startTime = System.currentTimeMillis();
    private Channel channel;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `offsetMap` is accessed in both synchronized and unsynchronized contexts
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
    private String channelId;
    private AtomicBoolean needPersistOffset = new AtomicBoolean(false);
    private ConcurrentMap<String, Map<Queue, QueueOffset>> offsetMap = new ConcurrentHashMap<>(16);
    private Map<String, Subscription> subscriptions = new ConcurrentHashMap<>();
    private ConcurrentMap<Subscription, Map<Queue, LinkedHashSet<Message>>> sendingMessages = new ConcurrentHashMap<>(16);
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/StatUtil.java`
#### Snippet
```java

    static {
        daemon.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/MqttHTTPServer.java`
#### Snippet
```java
            server.start();
        } else {
            FutureTask<Void> startTask = new FutureTask<Void>(new Runnable() {
                @Override
                public void run() {
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/mq/MqConsumer.java`
#### Snippet
```java
        defaultMQPushConsumer.setConsumeMessageBatchMaxSize(1);
        defaultMQPushConsumer.setPullBatchSize(Integer.parseInt(properties.getProperty("pullBatch", "64")));
        if (properties.get(THREAD_NUM_KEY) != null) {
            defaultMQPushConsumer.setConsumeThreadMin(Integer.valueOf((String)properties.get("threadNum")));
            defaultMQPushConsumer.setConsumeThreadMax(Integer.valueOf((String)properties.get("threadNum")));
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/mq/MqConsumer.java`
#### Snippet
```java
        defaultMQPushConsumer.setPullBatchSize(Integer.parseInt(properties.getProperty("pullBatch", "64")));
        if (properties.get(THREAD_NUM_KEY) != null) {
            defaultMQPushConsumer.setConsumeThreadMin(Integer.valueOf((String)properties.get("threadNum")));
            defaultMQPushConsumer.setConsumeThreadMax(Integer.valueOf((String)properties.get("threadNum")));
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/mq/MqConsumer.java`
#### Snippet
```java
        if (properties.get(THREAD_NUM_KEY) != null) {
            defaultMQPushConsumer.setConsumeThreadMin(Integer.valueOf((String)properties.get("threadNum")));
            defaultMQPushConsumer.setConsumeThreadMax(Integer.valueOf((String)properties.get("threadNum")));
        }
        defaultMQPushConsumer.setInstanceName(this.buildInstanceName());
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/config/ConnectConf.java`
#### Snippet
```java
    private int mqttTlsPort = 8883;
    private int mqttWsPort = 8888;
    private boolean enableTlsSever = false;
    private boolean needClientAuth = false;
    private int maxPacketSizeInByte = 64 * 1024;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/config/ConnectConf.java`
#### Snippet
```java
    private int retryIntervalSeconds = 3;
    private int exporterPort = 9090;
    private boolean enablePrometheus = false;
    private boolean exportJvmInfo = true;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/config/ConnectConf.java`
#### Snippet
```java
    private int mqttWsPort = 8888;
    private boolean enableTlsSever = false;
    private boolean needClientAuth = false;
    private int maxPacketSizeInByte = 64 * 1024;
    private int highWater = 256 * 1024;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/collector/MqttMetricsCollector.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(MqttMetricsCollector.class);
    private static final Map<Type, Map<MqttMetricsInfo, Collector>> ALL_TYPE_COLLECTORS = new ConcurrentHashMap<>();
    private static volatile boolean initialized = false;
    private static String namespace;
    private static String hostName;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
        private int mqttMsgId;
        private MqttMessageType mqttMessageType;
        private int localRetryTime = 0;
        private static final int MAX_LOCAL_RETRY = 1;
        private long timestamp = System.currentTimeMillis();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
    private final long startTime = System.currentTimeMillis();
    private Channel channel;
    private volatile boolean destroyed = false;
    private volatile int loadStatus = -1;
    private volatile int pullSize;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/MqttHTTPServer.java`
#### Snippet
```java
        private int port = 0;
        private String hostname = null;
        private InetAddress inetAddress = null;
        private InetSocketAddress inetSocketAddress = null;
        private HttpServer httpServer = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/MqttHTTPServer.java`
#### Snippet
```java

        private int port = 0;
        private String hostname = null;
        private InetAddress inetAddress = null;
        private InetSocketAddress inetSocketAddress = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/MqttHTTPServer.java`
#### Snippet
```java
        private String hostname = null;
        private InetAddress inetAddress = null;
        private InetSocketAddress inetSocketAddress = null;
        private HttpServer httpServer = null;
        private CollectorRegistry registry = CollectorRegistry.defaultRegistry;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/MqttHTTPServer.java`
#### Snippet
```java
    public static class Builder {

        private int port = 0;
        private String hostname = null;
        private InetAddress inetAddress = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/MqttHTTPServer.java`
#### Snippet
```java
        private HttpServer httpServer = null;
        private CollectorRegistry registry = CollectorRegistry.defaultRegistry;
        private boolean daemon = false;
        private Predicate<String> sampleNameFilter;
        private Supplier<Predicate<String>> sampleNameFilterSupplier;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/MqttHTTPServer.java`
#### Snippet
```java
        private InetAddress inetAddress = null;
        private InetSocketAddress inetSocketAddress = null;
        private HttpServer httpServer = null;
        private CollectorRegistry registry = CollectorRegistry.defaultRegistry;
        private boolean daemon = false;
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `secondTopic`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/TopicUtils.java`
#### Snippet
```java
        }
        if (!secondTopic.startsWith(Constants.MQTT_TOPIC_DELIMITER)) {
            secondTopic = Constants.MQTT_TOPIC_DELIMITER + secondTopic;
        }
        if (!secondTopic.endsWith(Constants.MQTT_TOPIC_DELIMITER)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `topics`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/TopicUtils.java`
#### Snippet
```java
    public static MqttTopic decode(String topics) {
        if (topics.startsWith(Constants.MQTT_TOPIC_DELIMITER)) {
            topics = topics.substring(1);
        }
        String topic;
```

### AssignmentToMethodParameter
Assignment to method parameter `clientId`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java
                if (clientId == null) {
                    if (session != null) {
                        clientId = session.getClientId();
                    }
                }
```

## RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `msgIdEntry`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/MqttMsgId.java`
#### Snippet
```java
    public int nextId(String clientId) {
        MsgIdEntry msgIdEntry = hashMsgID(clientId);
        synchronized (msgIdEntry) {
            int startingMessageId = msgIdEntry.nextMsgId;
            do {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `cacheEntry`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java
        }
        List<Message> resultMsgs = new ArrayList<>();
        synchronized (cacheEntry) {
            for (Message message : cacheMsgList) {
                if (message.getOffset() >= queueOffset.getOffset()) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `idCache`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/InFlyCache.java`
#### Snippet
```java
            return;
        }
        synchronized (idCache) {
            idCache.remove(mqttMsgId);
            if (idCache.isEmpty()) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `idCache`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/InFlyCache.java`
#### Snippet
```java
            return false;
        }
        synchronized (idCache) {
            return idCache.contains(mqttMsgId);
        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `idCache`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/InFlyCache.java`
#### Snippet
```java
            return;
        }
        synchronized (idCache) {
            idCache.add(mqttMsgId);
        }
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `UpstreamProcessor`
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/upstream/processor/DisconnectProcessor.java`
#### Snippet
```java

@Component
public class DisconnectProcessor extends BaseProcessor implements UpstreamProcessor {

    @Override
```

### RedundantImplements
Redundant interface declaration `UpstreamProcessor`
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/upstream/processor/ConnectProcessor.java`
#### Snippet
```java

@Component
public class ConnectProcessor extends BaseProcessor implements UpstreamProcessor {

    @Override
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/collector/MetricsBuilderFactory.java`
#### Snippet
```java

        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Message.java`
#### Snippet
```java
    public Integer qos() {
        if (getUserProperties() == null) {
            return null;
        }
        if (!getUserProperties().containsKey(extPropertyQoS)) {
```

### ReturnNull
Return of `null`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Message.java`
#### Snippet
```java
        }
        if (!getUserProperties().containsKey(extPropertyQoS)) {
            return null;
        }
        return Integer.parseInt(getUserProperties().get(extPropertyQoS));
```

### ReturnNull
Return of `null`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Message.java`
#### Snippet
```java
    public String getUserProperty(String key) {
        if (StringUtils.isBlank(key)) {
            return null;
        }
        return userProperties.get(key);
```

### ReturnNull
Return of `null`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/TopicUtils.java`
#### Snippet
```java
    public static String normalizeSecondTopic(String secondTopic) {
        if (StringUtils.isBlank(secondTopic)) {
            return null;
        }
        if (!secondTopic.startsWith(Constants.MQTT_TOPIC_DELIMITER)) {
```

### ReturnNull
Return of `null`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/TopicUtils.java`
#### Snippet
```java
    public static String normalizeTopic(String topic) {
        if (StringUtils.isBlank(topic)) {
            return null;
        }
        if (!topic.contains(Constants.MQTT_TOPIC_DELIMITER)) {
```

### ReturnNull
Return of `null`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/TopicUtils.java`
#### Snippet
```java
    public static String getP2Peer(MqttTopic mqttTopic, String namespace) {
        if (mqttTopic.getSecondTopic() == null || mqttTopic.getFirstTopic() == null) {
            return null;
        }
        if (!isP2P(mqttTopic.getSecondTopic())) {
```

### ReturnNull
Return of `null`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/TopicUtils.java`
#### Snippet
```java
        }
        if (!isP2P(mqttTopic.getSecondTopic())) {
            return null;
        }
        if (mqttTopic.getFirstTopic().contains(Constants.NAMESPACE_SPLITER) && StringUtils.isNotBlank(namespace)) {
```

### ReturnNull
Return of `null`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/SpringUtils.java`
#### Snippet
```java
    public static <T> T getBean(Class<T> type) {
        if (applicationContext == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/SpringUtils.java`
#### Snippet
```java
            return applicationContext.getBean(type);
        } catch (BeansException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/MessageUtil.java`
#### Snippet
```java
        List<org.apache.rocketmq.common.message.Message> mqMessages = MessageDecoder.decodeMessages(byteBuffer);
        if (mqMessages == null) {
            return null;
        }
        List<Message> messageList = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/MessageUtil.java`
#### Snippet
```java
    public static byte[] encode(List<Message> messageList) {
        if (messageList == null || messageList.isEmpty()) {
            return null;
        }
        List<org.apache.rocketmq.common.message.Message> mqMessages = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/StatUtil.java`
#### Snippet
```java
        Map<Long, SecondInvoke> secondInvokeMap = secondInvokeCache.get(key);
        if (secondInvokeMap == null) {
            return null;
        }
        long second = nowSecond();
```

### ReturnNull
Return of `null`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/StatUtil.java`
#### Snippet
```java
    public static String buildKey(String... keys) {
        if (keys == null || keys.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
```

### ReturnNull
Return of `null`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/NamespaceUtil.java`
#### Snippet
```java

    private static String splitNamespaceStr(String namespaceStr) {
        return namespaceStr != null && namespaceStr.contains(NAMESPACE_SPLITER) ? namespaceStr.split(NAMESPACE_SPLITER)[0] : null;
    }
}
```

### ReturnNull
Return of `null`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/InFlyCache.java`
#### Snippet
```java
                return map.remove(mqttMsgId);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/InFlyCache.java`
#### Snippet
```java
                return map.get(mqttMsgId);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/InFlyCache.java`
#### Snippet
```java
        public Map<Integer, PendingDown> all(String channelId) {
            if (StringUtils.isBlank(channelId)) {
                return null;
            }
            return cache.get(channelId);
```

### ReturnNull
Return of `null`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/ChannelInfo.java`
#### Snippet
```java
            return (CompletableFuture<Void>)future;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
            LinkedHashSet<Message> messages = tmp.get(queue);
            if (messages == null) {
                return null;
            }
            synchronized (this) {
```

### ReturnNull
Return of `null`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
            }
            synchronized (this) {
                return messages.isEmpty() ? null : messages.iterator().next();
            }
        }
```

### ReturnNull
Return of `null`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
            return queueQueueOffsetMap.get(queue);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
            LinkedHashSet<Message> messages = tmp.get(queue);
            if (messages == null) {
                return null;
            }
            synchronized (this) {
```

### ReturnNull
Return of `null`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
        Map<Queue, LinkedHashSet<Message>> queueSendingMsgs = sendingMessages.get(subscription);
        if (queueSendingMsgs == null || queueSendingMsgs.isEmpty()) {
            return null;
        }
        LinkedHashSet<Message> messages = queueSendingMsgs.get(pendingQueue);
```

### ReturnNull
Return of `null`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
        LinkedHashSet<Message> messages = queueSendingMsgs.get(pendingQueue);
        if (messages == null) {
            return null;
        }
        Message message;
```

### ReturnNull
Return of `null`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
        synchronized (this) {
            if (messages.isEmpty()) {
                return null;
            }
            message = messages.iterator().next();
```

### ReturnNull
Return of `null`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
            message = messages.iterator().next();
            if (message.getOffset() != pendingDownSeqId) {
                return null;
            }
            messages.remove(message);
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-27-12-02-10.006.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `mqttSubAckMessage` is redundant
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/mqtt/handler/MqttSubscribeHandler.java`
#### Snippet
```java
        MqttFixedHeader fixedHeader = new MqttFixedHeader(SUBACK, false, AT_MOST_ONCE, false, 0);
        MqttMessageIdVariableHeader variableHeader = from(mqttSubscribeMessage.variableHeader().messageId());
        MqttSubAckMessage mqttSubAckMessage = new MqttSubAckMessage(fixedHeader, variableHeader,
            new MqttSubAckPayload(qoss));
        return mqttSubAckMessage;
```

### UnnecessaryLocalVariable
Local variable `mqttConnAckMessage` is redundant
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/mqtt/handler/MqttConnectHandler.java`
#### Snippet
```java
        MqttFixedHeader mqttFixedHeader =
                new MqttFixedHeader(MqttMessageType.CONNACK, false, MqttQoS.AT_MOST_ONCE, false, 0);
        MqttConnAckMessage mqttConnAckMessage =
                new MqttConnAckMessage(mqttFixedHeader, mqttConnAckVariableHeader);
        return mqttConnAckMessage;
```

### UnnecessaryLocalVariable
Local variable `mqttPublishMessage` is redundant
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/MessageUtil.java`
#### Snippet
```java
            false, 0);
        MqttPublishVariableHeader mqttPublishVariableHeader = new MqttPublishVariableHeader(topicName, mqttId);
        MqttPublishMessage mqttPublishMessage = new MqttPublishMessage(mqttFixedHeader, mqttPublishVariableHeader,
            payload);
        return mqttPublishMessage;
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
        try {
            String[] keyArray = key.split(Constants.MQTT_TOPIC_DELIMITER);
            Map<K, V> result = findValueSet(rootNode, keyArray, 0, keyArray.length, false);
            return result;
        } catch (Throwable e) {
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
            String[] keyArray = key.split(Constants.MQTT_TOPIC_DELIMITER);
            StringBuilder builder = new StringBuilder(key.length());
            Set<String> result = findValuePath(rootNode, keyArray, 0, keyArray.length, builder, false);
            return result;
        } catch (Throwable e) {
```

### UnnecessaryLocalVariable
Local variable `old` is redundant
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
                currentNode = trieNode;
            }
            V old = currentNode.valueSet.put(nodeKey, nodeValue);
            return old;
        } catch (Throwable e) {
```

### UnnecessaryLocalVariable
Local variable `mqttUnsubAckMessage` is redundant
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/mqtt/handler/MqttUnSubscribeHandler.java`
#### Snippet
```java
        MqttMessageIdVariableHeader variableHeader = MqttMessageIdVariableHeader
                .from(mqttUnsubscribeMessage.variableHeader().messageId());
        MqttUnsubAckMessage mqttUnsubAckMessage = new MqttUnsubAckMessage(fixedHeader, variableHeader);
        return mqttUnsubAckMessage;
    }
```

### UnnecessaryLocalVariable
Local variable `retryMessage` is redundant
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java

    public RetryMessage unMountPublish(int mqttMsgId, String channelId) {
        RetryMessage retryMessage = cleanRetryMessage(mqttMsgId, channelId);
        return retryMessage;
    }
```

### UnnecessaryLocalVariable
Local variable `pullResult` is redundant
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/store/LmqQueueStoreManager.java`
#### Snippet
```java

            String brokerAddr = findBrokerResult.getBrokerAddr();
            org.apache.rocketmq.client.consumer.PullResult pullResult =
                    mQClientFactory.getMQClientAPIImpl().pullMessage(
                            brokerAddr,
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java
                        Arrays.asList(Subscription.newP2pSubscription(clientId), Subscription.newRetrySubscription(clientId))),
                ChannelInfo.getFuture(channel, ChannelInfo.FUTURE_CONNECT));
        synchronized (this) {
            sessionMap.put(channelId, session);
            if (!clientMap.containsKey(clientId)) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java
        Session session = null;
        try {
            synchronized (this) {
                session = sessionMap.remove(channelId);
                if (clientId == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
                return null;
            }
            synchronized (this) {
                return messages.isEmpty() ? null : messages.iterator().next();
            }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
                continue;
            }
            synchronized (this) {
                if (sendingMessages.get(subscription).get(queue).add(message.copy())) {
                    add = true;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
            return;
        }
        synchronized (this) {
            if (messages.isEmpty()) {
                return;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
                return null;
            }
            synchronized (this) {
                if (!messages.isEmpty()) {
                    for (Message message : messages) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
        Message message;
        Message nextMessage = null;
        synchronized (this) {
            if (messages.isEmpty()) {
                return null;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
            return true;
        }
        synchronized (this) {
            return messages.size() <= 0;
        }
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `httpServer` initializer `null` is redundant
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/MqttHTTPServer.java`
#### Snippet
```java
            }

            HttpServer httpServer = null;
            if (httpsConfigurator != null) {
                httpServer = HttpsServer.create(inetSocketAddress, 3);
```

## RuleId[ruleID=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/MetaPersistManagerSample.java`
#### Snippet
```java
            Set<String> set = new HashSet<>();
            for (String s : ss) {
                set.add(s);
            }
            connectNodeSet = set;
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `mqMessages == null` is always `false`
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/MessageUtil.java`
#### Snippet
```java
    public static List<Message> decode(ByteBuffer byteBuffer) throws Exception {
        List<org.apache.rocketmq.common.message.Message> mqMessages = MessageDecoder.decodeMessages(byteBuffer);
        if (mqMessages == null) {
            return null;
        }
```

### ConstantValue
Value `clientId` is always 'null'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/DefaultChannelManager.java`
#### Snippet
```java
        if (clientId == null) {
            channelMap.remove(channelId);
            sessionLoop.unloadSession(clientId, channelId);
        } else {
            //session maybe null
```

### ConstantValue
Condition `map == null` is always `false`
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            Map<String, RetryMessage> map = retryCache.asMap();
            if (map == null) {
                return;
            }
```

