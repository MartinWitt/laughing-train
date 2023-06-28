# rocketmq-mqtt 
 
# Bad smells
I found 433 bad smells with 19 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 134 | false |
| JavadocDeclaration | 108 | false |
| SpringXmlModelInspection | 40 | false |
| FieldCanBeLocal | 26 | false |
| UNCHECKED_WARNING | 23 | false |
| DuplicatedCode | 10 | false |
| DataFlowIssue | 7 | false |
| UnnecessaryLocalVariable | 7 | true |
| InnerClassMayBeStatic | 6 | true |
| NullableProblems | 5 | false |
| IgnoreResultOfCall | 5 | false |
| SynchronizeOnNonFinalField | 5 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 5 | false |
| ConstantValue | 5 | false |
| UnnecessaryCallToStringValueOf | 4 | false |
| IOStreamConstructor | 4 | false |
| NonStrictComparisonCanBeEquality | 4 | true |
| UnusedAssignment | 4 | false |
| ArraysAsListWithZeroOrOneArgument | 3 | false |
| TypeParameterHidesVisibleType | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| CStyleArrayDeclaration | 2 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| CharsetObjectCanBeUsed | 2 | false |
| AutoCloseableResource | 2 | false |
| SpringXmlAutowireExplicitlyInspection | 2 | false |
| ManualArrayToCollectionCopy | 1 | false |
| AssignmentUsedAsCondition | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| CatchMayIgnoreException | 1 | false |
| UnnecessaryReturn | 1 | true |
| UnnecessaryToStringCall | 1 | true |
| TrivialStringConcatenation | 1 | false |
| SpringBeanNameConventionInspection | 1 | false |
| ThrowFromFinallyBlock | 1 | false |
| ListRemoveInLoop | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.concurrent.CompletableFuture'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/ChannelInfo.java`
#### Snippet
```java
        Object future = getInfo(channel).get(CHANNEL_FUTRUE_KEY + futureKey);
        if (future != null) {
            return (CompletableFuture<Void>)future;
        }
        return null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/ChannelInfo.java`
#### Snippet
```java
            return false;
        }
        updateExtData(channel, JSON.parseObject(extDataStr, Map.class));
        return true;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.ArrayBlockingQueue' to 'java.util.concurrent.BlockingQueue'
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/MqttHTTPServer.java`
#### Snippet
```java
        executorService = new ThreadPoolExecutor(
            2, 2, 60, TimeUnit.SECONDS,
            new ArrayBlockingQueue(100), NamedDaemonThreadFactory.defaultThreadFactory(daemon));
        server.setExecutor(executorService);
        start(daemon);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.mqtt.common.model.Trie' to 'org.apache.rocketmq.mqtt.common.model.Trie'
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/processor/RetainedMsgStateProcessor.java`
#### Snippet
```java
                    byte[] value = getRdb(sm.getRocksDBEngine(), wrapTrieFirstTopic.getBytes(StandardCharsets.UTF_8));
                    if (value != null) {
                        newTrie = JSON.parseObject(new String(value, StandardCharsets.UTF_8), Trie.class);
                    }
                    retainedMsgTopicTrie.put(wrapTrieFirstTopic, newTrie);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
        TrieNode numberMatch = currentNode.children.get(Constants.NUMBER_SIGN);
        if (numberMatch != null) {
            result.putAll(findValueSet(numberMatch, topicArray, level + 1, maxLevel, true));
        }
        // match the mqtt-topic path
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode' to 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
        TrieNode numberMatch = currentNode.children.get(Constants.NUMBER_SIGN);
        if (numberMatch != null) {
            result.putAll(findValueSet(numberMatch, topicArray, level + 1, maxLevel, true));
        }
        // match the mqtt-topic path
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
            TrieNode trieNode = currentNode.children.get(topicArray[level]);
            if (trieNode != null) {
                result.putAll(findValueSet(trieNode, topicArray, level + 1, maxLevel, false));
            }
            // match the '+'
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode' to 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
            TrieNode trieNode = currentNode.children.get(topicArray[level]);
            if (trieNode != null) {
                result.putAll(findValueSet(trieNode, topicArray, level + 1, maxLevel, false));
            }
            // match the '+'
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
            TrieNode plusMatch = currentNode.children.get(Constants.PLUS_SIGN);
            if (plusMatch != null) {
                result.putAll(findValueSet(plusMatch, topicArray, level + 1, maxLevel, false));
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode' to 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
            TrieNode plusMatch = currentNode.children.get(Constants.PLUS_SIGN);
            if (plusMatch != null) {
                result.putAll(findValueSet(plusMatch, topicArray, level + 1, maxLevel, false));
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode' to 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
                TrieNode<K, V> trieNode = currentNode.children.get(keyArray[level]);
                if (trieNode == null) {
                    trieNode = new TrieNode(currentNode);
                    TrieNode oldNode = currentNode.children.putIfAbsent(keyArray[level], trieNode);
                    if (oldNode != null) {
```

### UNCHECKED_WARNING
Unchecked call to 'TrieNode(TrieNode)' as a member of raw type 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
                TrieNode<K, V> trieNode = currentNode.children.get(keyArray[level]);
                if (trieNode == null) {
                    trieNode = new TrieNode(currentNode);
                    TrieNode oldNode = currentNode.children.putIfAbsent(keyArray[level], trieNode);
                    if (oldNode != null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode' to 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
                    TrieNode oldNode = currentNode.children.putIfAbsent(keyArray[level], trieNode);
                    if (oldNode != null) {
                        trieNode = oldNode;
                    }
                }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode' to 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
public class Trie<K, V> {

    private TrieNode<K, V> rootNode = new TrieNode(null);

    private Set<String> nodePath = new HashSet<>();
```

### UNCHECKED_WARNING
Unchecked call to 'TrieNode(TrieNode)' as a member of raw type 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
public class Trie<K, V> {

    private TrieNode<K, V> rootNode = new TrieNode(null);

    private Set<String> nodePath = new HashSet<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Collection'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
            int start = builder.length();
            builder.append(Constants.NUMBER_SIGN).append(Constants.MQTT_TOPIC_DELIMITER);
            result.addAll(findValuePath(numberMatch, topicArray, level + 1, maxLevel, builder, true));
            builder.delete(start, builder.length());
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode' to 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
            int start = builder.length();
            builder.append(Constants.NUMBER_SIGN).append(Constants.MQTT_TOPIC_DELIMITER);
            result.addAll(findValuePath(numberMatch, topicArray, level + 1, maxLevel, builder, true));
            builder.delete(start, builder.length());
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Collection'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
                int start = builder.length();
                builder.append(topicArray[level]).append(Constants.MQTT_TOPIC_DELIMITER);
                result.addAll(findValuePath(trieNode, topicArray, level + 1, maxLevel, builder, false));
                builder.delete(start, builder.length());
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode' to 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
                int start = builder.length();
                builder.append(topicArray[level]).append(Constants.MQTT_TOPIC_DELIMITER);
                result.addAll(findValuePath(trieNode, topicArray, level + 1, maxLevel, builder, false));
                builder.delete(start, builder.length());
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Collection'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
                int start = builder.length();
                builder.append(Constants.PLUS_SIGN).append(Constants.MQTT_TOPIC_DELIMITER);
                result.addAll(findValuePath(plusMatch, topicArray, level + 1, maxLevel, builder, false));
                builder.delete(start, builder.length());
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode' to 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
                int start = builder.length();
                builder.append(Constants.PLUS_SIGN).append(Constants.MQTT_TOPIC_DELIMITER);
                result.addAll(findValuePath(plusMatch, topicArray, level + 1, maxLevel, builder, false));
                builder.delete(start, builder.length());
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode' to 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
                }
                level++;
                currentNode = trieNode;
            }
            V oldValue = currentNode.valueSet.remove(valueKey);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode' to 'org.apache.rocketmq.mqtt.common.model.Trie.TrieNode'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
                }
                level++;
                currentNode = trieNode;
            }
            V oldValue = currentNode.valueSet.remove(valueKey);
```

## RuleId[id=ManualArrayToCollectionCopy]
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

## RuleId[id=AssignmentUsedAsCondition]
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

## RuleId[id=DataFlowIssue]
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
Argument `pubTopic` might be null
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/upstream/processor/PublishProcessor.java`
#### Snippet
```java
        String originTopic = variableHeader.topicName();
        String pubTopic = TopicUtils.normalizeTopic(originTopic);
        MqttTopic mqttTopic = TopicUtils.decode(pubTopic);
        firstTopicManager.checkFirstTopicIfCreated(mqttTopic.getFirstTopic());      // Check the firstTopic is existed
        Set<String> queueNames = wildcardManager.matchQueueSetByMsgTopic(pubTopic, context.getNamespace()); //According to topic to find queue
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
Condition `message instanceof WriteRequest` is redundant and can be replaced with a null check
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/MqttStateMachine.java`
#### Snippet
```java
                    LOGGER.debug("get message:{} and apply to state machine", message);

                    if (message instanceof WriteRequest) {
                        WriteRequest writeRequest = (WriteRequest) message;
                        StateProcessor processor = server.getProcessor(writeRequest.getCategory());
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

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java


    class TrieNode<K, V> {
        public TrieNode<K, V> parentNode;

```

### TypeParameterHidesVisibleType
Type parameter `V` hides type parameter 'V'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java


    class TrieNode<K, V> {
        public TrieNode<K, V> parentNode;

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/ws/WebSocketServerHandler.java`
#### Snippet
```java
        }
        String upgrade = req.headers().get("Upgrade");
        if (upgrade == null || !"websocket".equals(upgrade.toLowerCase())) {
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

## RuleId[id=CStyleArrayDeclaration]
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

### CStyleArrayDeclaration
C-style array declaration of local variable `topicFilter`
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttWillRetainConsumer.java`
#### Snippet
```java
                System.out.println(recvClientId + " connect success to " + serverURI);
                try {
                    final String topicFilter[] = {firstTopic + "/retainTopicR",firstTopic + "/retainTopic/+", firstTopic + "/willTopic1",};
                    final int[] qos = {1, 1, 1};
                    mqttClient.subscribe(topicFilter, qos);
```

## RuleId[id=UnnecessaryCallToStringValueOf]
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

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve package apache
in `distribution/conf/meta_spring.xml`
#### Snippet
```java
       default-autowire="byName">

    <context:component-scan base-package="org.apache.rocketmq.mqtt.meta"/>


```

### SpringXmlModelInspection
Cannot resolve package rocketmq
in `distribution/conf/meta_spring.xml`
#### Snippet
```java
       default-autowire="byName">

    <context:component-scan base-package="org.apache.rocketmq.mqtt.meta"/>


```

### SpringXmlModelInspection
Cannot resolve package mqtt
in `distribution/conf/meta_spring.xml`
#### Snippet
```java
       default-autowire="byName">

    <context:component-scan base-package="org.apache.rocketmq.mqtt.meta"/>


```

### SpringXmlModelInspection
Cannot resolve package meta
in `distribution/conf/meta_spring.xml`
#### Snippet
```java
       default-autowire="byName">

    <context:component-scan base-package="org.apache.rocketmq.mqtt.meta"/>


```

### SpringXmlModelInspection
Cannot resolve package apache
in `distribution/conf/spring.xml`
#### Snippet
```java
       default-autowire="byName">

    <context:component-scan base-package="org.apache.rocketmq.mqtt.ds"/>
    <context:component-scan base-package="org.apache.rocketmq.mqtt.cs"/>

```

### SpringXmlModelInspection
Cannot resolve package rocketmq
in `distribution/conf/spring.xml`
#### Snippet
```java
       default-autowire="byName">

    <context:component-scan base-package="org.apache.rocketmq.mqtt.ds"/>
    <context:component-scan base-package="org.apache.rocketmq.mqtt.cs"/>

```

### SpringXmlModelInspection
Cannot resolve package mqtt
in `distribution/conf/spring.xml`
#### Snippet
```java
       default-autowire="byName">

    <context:component-scan base-package="org.apache.rocketmq.mqtt.ds"/>
    <context:component-scan base-package="org.apache.rocketmq.mqtt.cs"/>

```

### SpringXmlModelInspection
Cannot resolve package ds
in `distribution/conf/spring.xml`
#### Snippet
```java
       default-autowire="byName">

    <context:component-scan base-package="org.apache.rocketmq.mqtt.ds"/>
    <context:component-scan base-package="org.apache.rocketmq.mqtt.cs"/>

```

### SpringXmlModelInspection
Cannot resolve package apache
in `distribution/conf/spring.xml`
#### Snippet
```java

    <context:component-scan base-package="org.apache.rocketmq.mqtt.ds"/>
    <context:component-scan base-package="org.apache.rocketmq.mqtt.cs"/>


```

### SpringXmlModelInspection
Cannot resolve package rocketmq
in `distribution/conf/spring.xml`
#### Snippet
```java

    <context:component-scan base-package="org.apache.rocketmq.mqtt.ds"/>
    <context:component-scan base-package="org.apache.rocketmq.mqtt.cs"/>


```

### SpringXmlModelInspection
Cannot resolve package mqtt
in `distribution/conf/spring.xml`
#### Snippet
```java

    <context:component-scan base-package="org.apache.rocketmq.mqtt.ds"/>
    <context:component-scan base-package="org.apache.rocketmq.mqtt.cs"/>


```

### SpringXmlModelInspection
Cannot resolve package cs
in `distribution/conf/spring.xml`
#### Snippet
```java

    <context:component-scan base-package="org.apache.rocketmq.mqtt.ds"/>
    <context:component-scan base-package="org.apache.rocketmq.mqtt.cs"/>


```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `distribution/conf/spring.xml`
#### Snippet
```java


    <bean id="authManager" class="org.apache.rocketmq.mqtt.ds.auth.AuthManagerSample" init-method="init"/>

    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'rocketmq'
in `distribution/conf/spring.xml`
#### Snippet
```java


    <bean id="authManager" class="org.apache.rocketmq.mqtt.ds.auth.AuthManagerSample" init-method="init"/>

    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'mqtt'
in `distribution/conf/spring.xml`
#### Snippet
```java


    <bean id="authManager" class="org.apache.rocketmq.mqtt.ds.auth.AuthManagerSample" init-method="init"/>

    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ds'
in `distribution/conf/spring.xml`
#### Snippet
```java


    <bean id="authManager" class="org.apache.rocketmq.mqtt.ds.auth.AuthManagerSample" init-method="init"/>

    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'auth'
in `distribution/conf/spring.xml`
#### Snippet
```java


    <bean id="authManager" class="org.apache.rocketmq.mqtt.ds.auth.AuthManagerSample" init-method="init"/>

    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>
```

### SpringXmlModelInspection
Cannot resolve class 'AuthManagerSample'
in `distribution/conf/spring.xml`
#### Snippet
```java


    <bean id="authManager" class="org.apache.rocketmq.mqtt.ds.auth.AuthManagerSample" init-method="init"/>

    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>
```

### SpringXmlModelInspection
Cannot resolve method 'init'
in `distribution/conf/spring.xml`
#### Snippet
```java


    <bean id="authManager" class="org.apache.rocketmq.mqtt.ds.auth.AuthManagerSample" init-method="init"/>

    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `distribution/conf/spring.xml`
#### Snippet
```java
    <bean id="authManager" class="org.apache.rocketmq.mqtt.ds.auth.AuthManagerSample" init-method="init"/>

    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'rocketmq'
in `distribution/conf/spring.xml`
#### Snippet
```java
    <bean id="authManager" class="org.apache.rocketmq.mqtt.ds.auth.AuthManagerSample" init-method="init"/>

    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'mqtt'
in `distribution/conf/spring.xml`
#### Snippet
```java
    <bean id="authManager" class="org.apache.rocketmq.mqtt.ds.auth.AuthManagerSample" init-method="init"/>

    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ds'
in `distribution/conf/spring.xml`
#### Snippet
```java
    <bean id="authManager" class="org.apache.rocketmq.mqtt.ds.auth.AuthManagerSample" init-method="init"/>

    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'meta'
in `distribution/conf/spring.xml`
#### Snippet
```java
    <bean id="authManager" class="org.apache.rocketmq.mqtt.ds.auth.AuthManagerSample" init-method="init"/>

    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
```

### SpringXmlModelInspection
Cannot resolve class 'MetaPersistManagerSample'
in `distribution/conf/spring.xml`
#### Snippet
```java
    <bean id="authManager" class="org.apache.rocketmq.mqtt.ds.auth.AuthManagerSample" init-method="init"/>

    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
```

### SpringXmlModelInspection
Cannot resolve method 'init'
in `distribution/conf/spring.xml`
#### Snippet
```java
    <bean id="authManager" class="org.apache.rocketmq.mqtt.ds.auth.AuthManagerSample" init-method="init"/>

    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `distribution/conf/spring.xml`
#### Snippet
```java
    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
    <bean id="willMsgPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.WillMsgPersistManagerImpl" init-method="init"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'rocketmq'
in `distribution/conf/spring.xml`
#### Snippet
```java
    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
    <bean id="willMsgPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.WillMsgPersistManagerImpl" init-method="init"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'mqtt'
in `distribution/conf/spring.xml`
#### Snippet
```java
    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
    <bean id="willMsgPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.WillMsgPersistManagerImpl" init-method="init"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'ds'
in `distribution/conf/spring.xml`
#### Snippet
```java
    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
    <bean id="willMsgPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.WillMsgPersistManagerImpl" init-method="init"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'meta'
in `distribution/conf/spring.xml`
#### Snippet
```java
    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
    <bean id="willMsgPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.WillMsgPersistManagerImpl" init-method="init"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class 'RetainedPersistManagerImpl'
in `distribution/conf/spring.xml`
#### Snippet
```java
    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
    <bean id="willMsgPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.WillMsgPersistManagerImpl" init-method="init"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve method 'init'
in `distribution/conf/spring.xml`
#### Snippet
```java
    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
    <bean id="willMsgPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.WillMsgPersistManagerImpl" init-method="init"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'apache'
in `distribution/conf/spring.xml`
#### Snippet
```java

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
    <bean id="willMsgPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.WillMsgPersistManagerImpl" init-method="init"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'rocketmq'
in `distribution/conf/spring.xml`
#### Snippet
```java

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
    <bean id="willMsgPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.WillMsgPersistManagerImpl" init-method="init"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'mqtt'
in `distribution/conf/spring.xml`
#### Snippet
```java

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
    <bean id="willMsgPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.WillMsgPersistManagerImpl" init-method="init"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'ds'
in `distribution/conf/spring.xml`
#### Snippet
```java

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
    <bean id="willMsgPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.WillMsgPersistManagerImpl" init-method="init"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'meta'
in `distribution/conf/spring.xml`
#### Snippet
```java

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
    <bean id="willMsgPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.WillMsgPersistManagerImpl" init-method="init"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class 'WillMsgPersistManagerImpl'
in `distribution/conf/spring.xml`
#### Snippet
```java

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
    <bean id="willMsgPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.WillMsgPersistManagerImpl" init-method="init"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve method 'init'
in `distribution/conf/spring.xml`
#### Snippet
```java

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
    <bean id="willMsgPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.WillMsgPersistManagerImpl" init-method="init"/>
</beans>

```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/InFlyCache.java`
#### Snippet
```java

    private ConcurrentMap<String, Set<Integer>> whichCache(CacheType cacheType) {
        switch (cacheType) {
            case PUB:
                return pubCache;
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
            String[] keyArray = key.split(Constants.MQTT_TOPIC_DELIMITER);
            TrieNode<K, V> currentNode = rootNode;
            int level = 0;
            while (level < keyArray.length) {
                TrieNode trieNode = currentNode.children.get(keyArray[level]);
                if (trieNode == null) {
                    break;
                }
                level++;
                currentNode = trieNode;
            }
            V oldValue = currentNode.valueSet.remove(valueKey);
```

### DuplicatedCode
Duplicated code
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/config/ConnectConfListener.java`
#### Snippet
```java
        confFile = connectConf.getConfFile();
        gmt.set(confFile.lastModified());
        scheduler = new ScheduledThreadPoolExecutor(1, new ThreadFactoryImpl("ConnectConfListener"));
        scheduler.scheduleWithFixedDelay(() -> {
            try {
                if (gmt.get() == confFile.lastModified()) {
                    return;
                }
                gmt.set(confFile.lastModified());
                InputStream in = new FileInputStream(confFile.getAbsoluteFile());
                Properties properties = new Properties();
                properties.load(in);
                in.close();
                MixAll.properties2Object(properties, connectConf);
                logger.warn("UpdateConf:{}", confFile.getAbsolutePath());
            } catch (Exception e) {
                logger.error("", e);
            }
        }, refreshSecs, refreshSecs, TimeUnit.SECONDS);
```

### DuplicatedCode
Duplicated code
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/config/ServiceConfListener.java`
#### Snippet
```java
        scheduler.scheduleWithFixedDelay(() -> {
            try {
                if (gmt.get() == confFile.lastModified()) {
                    return;
                }
                gmt.set(confFile.lastModified());
                InputStream in = new FileInputStream(confFile.getAbsoluteFile());
                Properties properties = new Properties();
                properties.load(in);
                in.close();
                MixAll.properties2Object(properties, serviceConf);
                logger.warn("UpdateConf:{}", confFile.getAbsolutePath());
            } catch (Exception e) {
                logger.error("", e);
            }
        }, refreshCheckInterval, refreshCheckInterval, TimeUnit.SECONDS);
```

### DuplicatedCode
Duplicated code
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
        if (!offsetMap.containsKey(queueName)) {
            offsetMap.putIfAbsent(queueName, new ConcurrentHashMap<>(16));
        }
        for (Queue memQueue : offsetMap.get(queueName).keySet()) {
            if (!queues.contains(memQueue)) {
                offsetMap.get(queueName).remove(memQueue);
            }
        }
```

### DuplicatedCode
Duplicated code
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/PushAction.java`
#### Snippet
```java
        if (qos == 0) {
            write(session, message, mqttId, 0, subscription);
            rollNextByAck(session, mqttId);
        } else {
            retryDriver.mountPublish(mqttId, message, subscription.getQos(), ChannelInfo.getId(session.getChannel()), subscription);
            write(session, message, mqttId, qos, subscription);
        }
```

### DuplicatedCode
Duplicated code
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java
        String firstTopic = subscription.toFirstTopic();
        if (subscription.isRetry()) {
            firstTopic = lmqQueueStore.getClientRetryTopic();
        }
        if (subscription.isP2p()) {
            if (StringUtils.isNotBlank(lmqQueueStore.getClientP2pTopic())) {
                firstTopic = lmqQueueStore.getClientP2pTopic();
            } else {
                firstTopic = lmqQueueStore.getClientRetryTopic();
            }
        }
```

### DuplicatedCode
Duplicated code
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/MetaRpcClient.java`
#### Snippet
```java
        GrpcRaftRpcFactory raftRpcFactory = (GrpcRaftRpcFactory) RpcFactoryHelper.rpcFactory();
        raftRpcFactory.registerProtobufSerializer(WriteRequest.class.getName(), WriteRequest.getDefaultInstance());
        raftRpcFactory.registerProtobufSerializer(ReadRequest.class.getName(), ReadRequest.getDefaultInstance());
        raftRpcFactory.registerProtobufSerializer(Response.class.getName(), Response.getDefaultInstance());

        MarshallerRegistry registry = raftRpcFactory.getMarshallerRegistry();
        registry.registerResponseInstance(WriteRequest.class.getName(), Response.getDefaultInstance());
        registry.registerResponseInstance(ReadRequest.class.getName(), Response.getDefaultInstance());
```

### DuplicatedCode
Duplicated code
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttConsumer.java`
#### Snippet
```java
        MqttConnectOptions connOpts = new MqttConnectOptions();
        connOpts.setCleanSession(true);
        connOpts.setKeepAliveInterval(60);
        connOpts.setAutomaticReconnect(true);
        connOpts.setMaxInflight(10000);
        connOpts.setUserName(System.getenv("username"));
        connOpts.setPassword(HmacSHA1Util.macSignature(clientId, System.getenv("password")).toCharArray());
        return connOpts;
```

### DuplicatedCode
Duplicated code
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttWillRetainProducer.java`
#### Snippet
```java
        MqttClient mqttClient = new MqttClient(brokerUrl, sendClientId, memoryPersistence);
        mqttClient.setTimeToWait(5000L);
        mqttClient.setCallback(new MqttCallbackExtended() {
            @Override
            public void connectComplete(boolean reconnect, String serverURI) {
                System.out.println(sendClientId + " connect success to " + serverURI);
            }

            @Override
            public void connectionLost(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void messageArrived(String topic, MqttMessage mqttMessage) {
            }

            @Override
            public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
            }
        });
        try {
            mqttClient.connect(mqttConnectOptions);
        } catch (Exception e) {
            e.printStackTrace();
        }
```

### DuplicatedCode
Duplicated code
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/MqttProducer.java`
#### Snippet
```java
        mqttClient.setCallback(new MqttCallbackExtended() {
            @Override
            public void connectComplete(boolean reconnect, String serverURI) {
                System.out.println(sendClientId + " connect success to " + serverURI);
            }

            @Override
            public void connectionLost(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void messageArrived(String topic, MqttMessage mqttMessage) {
            }

            @Override
            public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
            }
        });
        try {
            mqttClient.connect(mqttConnectOptions);
        } catch (Exception e) {
            e.printStackTrace();
        }
```

## RuleId[id=CatchMayIgnoreException]
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

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/config/ConnectConfListener.java`
#### Snippet
```java
                }
                gmt.set(confFile.lastModified());
                InputStream in = new FileInputStream(confFile.getAbsoluteFile());
                Properties properties = new Properties();
                properties.load(in);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/config/MetaConfListener.java`
#### Snippet
```java
                }
                gmt.set(confFile.lastModified());
                InputStream in = new FileInputStream(confFile.getAbsoluteFile());
                Properties properties = new Properties();
                properties.load(in);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/BackedFileOutputStream.java`
#### Snippet
```java
    private synchronized InputStream openInputStream() throws IOException {
        if (file != null) {
            return new FileInputStream(file);
        } else {
            return new ByteArrayInputStream(memory.getBuffer(), 0, memory.getCount());
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/config/ServiceConfListener.java`
#### Snippet
```java
                }
                gmt.set(confFile.lastModified());
                InputStream in = new FileInputStream(confFile.getAbsoluteFile());
                Properties properties = new Properties();
                properties.load(in);
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
    public Set<Subscription> subscriptionSnapshot() {
        Set<Subscription> tmp = new HashSet<>();
        tmp.addAll(subscriptions.values());
        return tmp;
    }
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/StatUtil.java`
#### Snippet
```java
        }
        List<SecondInvoke> list = new ArrayList<>();
        list.addAll(secondInvokeMap.values());
        Collections.sort(list);
        return list;
```

## RuleId[id=StringBufferReplaceableByString]
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

## RuleId[id=UnnecessaryReturn]
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

## RuleId[id=UnnecessaryToStringCall]
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

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/store/LmqOffsetStoreManager.java`
#### Snippet
```java
    public void init() throws MQClientException {
        defaultMQPullConsumer = MqFactory.buildDefaultMQPullConsumer(MixAll.CID_RMQ_SYS_PREFIX + "LMQ_OFFSET" +
                "", serviceConf.getProperties());
        defaultMQPullConsumer.setConsumerPullTimeoutMillis(2000);
        defaultMQPullConsumer.start();
```

## RuleId[id=InnerClassMayBeStatic]
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
Inner class `RetryMessage` may be 'static'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
    }

    public class RetryMessage {
        private Session session;
        private Message message;
```

### InnerClassMayBeStatic
Inner class `TrieNode` may be 'static'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java


    class TrieNode<K, V> {
        public TrieNode<K, V> parentNode;

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
Inner class `QueueEvent` may be 'static'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java
    }

    class QueueEvent {
        long id;
        Session session;
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/MqttHTTPServer.java`
#### Snippet
```java

        @Override
        public Thread newThread(Runnable r) {
            Thread t = delegate.newThread(r);
            t.setName(String.format("prometheus-http-%d-%d", poolNumber, threadNumber.getAndIncrement()));
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/BackedFileOutputStream.java`
#### Snippet
```java
            this.source = new ByteSource() {
                @Override
                public InputStream openStream() throws IOException {
                    return openInputStream();
                }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/BackedFileOutputStream.java`
#### Snippet
```java
            this.source = new ByteSource() {
                @Override
                public InputStream openStream() throws IOException {
                    return openInputStream();
                }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/BackedFileOutputStream.java`
#### Snippet
```java

    @Override
    public synchronized void write(byte[] b, int off, int len)
        throws IOException {
        update(len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/BackedFileOutputStream.java`
#### Snippet
```java

    @Override
    public synchronized void write(byte[] b) throws IOException {
        write(b, 0, b.length);
    }
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/config/ConnectConfListener.java`
#### Snippet
```java

    private File confFile;
    private ScheduledThreadPoolExecutor scheduler;
    private AtomicLong gmt = new AtomicLong();
    private long refreshSecs = 3;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/config/ConnectConfListener.java`
#### Snippet
```java
    private ScheduledThreadPoolExecutor scheduler;
    private AtomicLong gmt = new AtomicLong();
    private long refreshSecs = 3;

    @PostConstruct
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/notify/NotifyRetryManager.java`
#### Snippet
```java
public class NotifyRetryManager {
    private static Logger logger = LoggerFactory.getLogger(NotifyRetryManager.class);
    private DefaultMQPushConsumer defaultMQPushConsumer;

    @Resource
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/HmacSHA1Util.java`
#### Snippet
```java
public class HmacSHA1Util {
    private static Charset charset = Charset.forName("UTF-8");
    private static String algorithm = "HmacSHA1";

    public static String macSignature(String text, String secretKey) throws InvalidKeyException, NoSuchAlgorithmException {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/config/ConnectConf.java`
#### Snippet
```java
    private int nettyWorkerThreadNum = Runtime.getRuntime().availableProcessors() * 2;
    private int mqttPort = 1883;
    private int mqttTlsPort = 8883;
    private int mqttWsPort = 8888;
    private boolean enableTlsSever = false;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/config/ConnectConf.java`
#### Snippet
```java
    private int mqttTlsPort = 8883;
    private int mqttWsPort = 8888;
    private boolean enableTlsSever = false;
    private boolean needClientAuth = false;
    private int maxPacketSizeInByte = 64 * 1024;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/config/ConnectConf.java`
#### Snippet
```java
    private int mqttWsPort = 8888;
    private boolean enableTlsSever = false;
    private boolean needClientAuth = false;
    private int maxPacketSizeInByte = 64 * 1024;
    private int highWater = 256 * 1024;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/DefaultChannelManager.java`
#### Snippet
```java
    private Map<String, Channel> channelMap = new ConcurrentHashMap<>(1024);
    private HashedWheelTimer hashedWheelTimer;
    private static int minBlankChannelSeconds = 10;
    private ScheduledThreadPoolExecutor scheduler;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/WildcardManager.java`
#### Snippet
```java
    private static Logger logger = LoggerFactory.getLogger(WildcardManager.class);
    private Map<String, Trie<String, Integer>> wildCardTrie = new ConcurrentHashMap<>();
    private ScheduledThreadPoolExecutor scheduler;

    @Resource
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/notify/NotifyManager.java`
#### Snippet
```java
    private DefaultMQPushConsumer defaultMQPushConsumer;
    private String dispatcherConsumerGroup = MixAll.CID_RMQ_SYS_PREFIX + "mqtt_event";
    private ScheduledThreadPoolExecutor scheduler;
    private Set<String> topics = new HashSet<>();
    private Map<String, AtomicInteger> nodeFail = new ConcurrentHashMap<>();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/MetaRpcClient.java`
#### Snippet
```java
    private static Logger logger = LoggerFactory.getLogger(MetaRpcClient.class);
    private RouteTable rt;
    private Configuration conf;
    private CliClientServiceImpl cliClientService;
    private static ScheduledExecutorService raftClientExecutor = Executors.newSingleThreadScheduledExecutor();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/MetaPersistManagerSample.java`
#### Snippet
```java
    private volatile Set<String> connectNodeSet = new HashSet<>();
    private DefaultMQAdminExt defaultMQAdminExt;
    private ScheduledThreadPoolExecutor scheduler;
    private static final String RMQ_NAMESPACE = "LMQ";
    private static final String KEY_LMQ_ALL_FIRST_TOPICS = "ALL_FIRST_TOPICS";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/config/MetaConfListener.java`
#### Snippet
```java
    private ScheduledThreadPoolExecutor scheduler;
    private AtomicLong gmt = new AtomicLong();
    private long refreshSecs = 3;

    @PostConstruct
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/config/MetaConfListener.java`
#### Snippet
```java

    private File confFile;
    private ScheduledThreadPoolExecutor scheduler;
    private AtomicLong gmt = new AtomicLong();
    private long refreshSecs = 3;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/rocksdb/RocksDBEngine.java`
#### Snippet
```java
    private String rdbPath;
    private DBOptions dbOptions;
    private ColumnFamilyHandle defaultHandle;
    private final List<ColumnFamilyOptions> cfOptionsList = Lists.newArrayList();
    private final List<ColumnFamilyDescriptor> cfDescriptors = Lists.newArrayList();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java

    private ChannelManager channelManager;
    private ScheduledThreadPoolExecutor pullService;
    private ScheduledThreadPoolExecutor scheduler;
    private ScheduledThreadPoolExecutor persistOffsetScheduler;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java
    private ScheduledThreadPoolExecutor pullService;
    private ScheduledThreadPoolExecutor scheduler;
    private ScheduledThreadPoolExecutor persistOffsetScheduler;
    private SubscriptionPersistManager subscriptionPersistManager;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java
    private PublishProcessor publishProcessor;

    private ChannelManager channelManager;
    private ScheduledThreadPoolExecutor pullService;
    private ScheduledThreadPoolExecutor scheduler;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/FirstTopicManager.java`
#### Snippet
```java
    private Map<String, Map<String, String>> brokerAddressMap = new ConcurrentHashMap<>();
    private Map<String, Set<String>> readableBrokers = new ConcurrentHashMap<>();
    private ScheduledThreadPoolExecutor scheduler;

    @Resource
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/starter/RpcServer.java`
#### Snippet
```java

    private NettyRemotingServer remotingServer;
    private BlockingQueue<Runnable> csBridgeRpcQueue;

    @PostConstruct
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/starter/RpcServer.java`
#### Snippet
```java
    private RpcPacketDispatcher rpcPacketDispatcher;

    private NettyRemotingServer remotingServer;
    private BlockingQueue<Runnable> csBridgeRpcQueue;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/config/ServiceConfListener.java`
#### Snippet
```java

    private File confFile;
    private ScheduledThreadPoolExecutor scheduler;
    private AtomicLong gmt = new AtomicLong();
    private long refreshCheckInterval = 3;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/config/ServiceConfListener.java`
#### Snippet
```java
    private ScheduledThreadPoolExecutor scheduler;
    private AtomicLong gmt = new AtomicLong();
    private long refreshCheckInterval = 3;

    @PostConstruct
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/MqttRaftServer.java`
#### Snippet
```java

    private PeerId localPeerId;
    private RpcServer rpcServer;
    private CliClientServiceImpl cliClientService;
    private CliService cliService;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/MqttRaftServer.java`
#### Snippet
```java
    private RpcServer rpcServer;
    private CliClientServiceImpl cliClientService;
    private CliService cliService;
    private Map<String, StateProcessor> stateProcessors = new ConcurrentHashMap<>();
    private Map<String, MqttStateMachine> bizStateMachineMap = new ConcurrentHashMap<>();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
    private static final int MAX_CACHE = 50000;
    private int scheduleDelaySecs = 3;
    private long messageRetryInterval = 3000;
    private Map<String, Map<Integer, RetryMessage>> sessionNoWaitRetryMsgMap = new ConcurrentHashMap<>(16);
    private ScheduledThreadPoolExecutor scheduler = new ScheduledThreadPoolExecutor(2,
```

## RuleId[id=SpringBeanNameConventionInspection]
### SpringBeanNameConventionInspection
'RetainedPersistManager' should start with lowercase letter
in `distribution/conf/spring.xml`
#### Snippet
```java
    <bean id="metaPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.MetaPersistManagerSample" init-method="init"/>

    <bean id="RetainedPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.RetainedPersistManagerImpl" init-method="init"/>
    <bean id="willMsgPersistManager" class="org.apache.rocketmq.mqtt.ds.meta.WillMsgPersistManagerImpl" init-method="init"/>
</beans>
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `FileChannel.write()` is ignored
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/util/DiskUtils.java`
#### Snippet
```java
        try (FileChannel fileChannel = new FileOutputStream(file, append).getChannel()) {
            ByteBuffer buffer = ByteBuffer.wrap(content);
            fileChannel.write(buffer);
            return true;
        } catch (IOException ioe) {
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/util/DiskUtils.java`
#### Snippet
```java
            boolean create = true;
            if (!file.exists()) {
                file.createNewFile();
            }
            if (file.exists()) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/util/DiskUtils.java`
#### Snippet
```java
            if (file.exists()) {
                if (rewrite) {
                    file.delete();
                } else {
                    create = false;
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/util/DiskUtils.java`
#### Snippet
```java
            }
            if (create) {
                file.createNewFile();
            }
        } catch (IOException e) {
```

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

## RuleId[id=SynchronizeOnNonFinalField]
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
            }

            synchronized (topicCache) {
                topicCache.putIfAbsent(topicFilter, new HashSet<>());
                topicCache.get(topicFilter).add(channelId);
```

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

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/meta/IpUtil.java`
#### Snippet
```java
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        Set<ObjectName> objectNames = mBeanServer.queryNames(new ObjectName("*:type=Connector,*"), null);
        if (objectNames == null || objectNames.size() <= 0) {
            throw new IllegalStateException("Cannot get the names of MBeans controlled by the MBean server.");
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

## RuleId[id=CharsetObjectCanBeUsed]
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

## RuleId[id=ThrowFromFinallyBlock]
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'FileOutputStream' used without 'try'-with-resources statement
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/util/DiskUtils.java`
#### Snippet
```java

    public static boolean writeFile(File file, byte[] content, boolean append) {
        try (FileChannel fileChannel = new FileOutputStream(file, append).getChannel()) {
            ByteBuffer buffer = ByteBuffer.wrap(content);
            fileChannel.write(buffer);
```

### AutoCloseableResource
'FileInputStream' used without 'try'-with-resources statement
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/util/DiskUtils.java`
#### Snippet
```java

    public static String readFile(File file) {
        try (FileChannel fileChannel = new FileInputStream(file).getChannel()) {
            StringBuilder text = new StringBuilder();
            ByteBuffer buffer = ByteBuffer.allocate(4096);
```

## RuleId[id=ListRemoveInLoop]
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param context` tag description is missing
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/upstream/UpstreamProcessor.java`
#### Snippet
```java
    /**
     * process mqtt upstream packet
     * @param context
     * @param message
     * @return
```

### JavadocDeclaration
`@param message` tag description is missing
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/upstream/UpstreamProcessor.java`
#### Snippet
```java
     * process mqtt upstream packet
     * @param context
     * @param message
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/upstream/UpstreamProcessor.java`
#### Snippet
```java
     * @param context
     * @param message
     * @return
     */
    CompletableFuture<HookResult> process(MqttMessageUpContext context, MqttMessage message) throws RemotingException, com.alipay.sofa.jraft.error.RemotingException, ExecutionException, InterruptedException;
```

### JavadocDeclaration
`@param channelId` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/ChannelManager.java`
#### Snippet
```java
    /**
     *  closeConnect
     * @param channelId
     * @param reason
     */
```

### JavadocDeclaration
`@param reason` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/ChannelManager.java`
#### Snippet
```java
     *  closeConnect
     * @param channelId
     * @param reason
     */
    void closeConnect(String channelId, String reason);
```

### JavadocDeclaration
`@param channel` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/ChannelManager.java`
#### Snippet
```java
     * closeConnect
     *
     * @param channel
     * @param from
     * @param reason
```

### JavadocDeclaration
`@param from` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/ChannelManager.java`
#### Snippet
```java
     *
     * @param channel
     * @param from
     * @param reason
     */
```

### JavadocDeclaration
`@param reason` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/ChannelManager.java`
#### Snippet
```java
     * @param channel
     * @param from
     * @param reason
     */
    void closeConnect(Channel channel, ChannelCloseFrom from, String reason);
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/ChannelManager.java`
#### Snippet
```java
     * totalConn
     *
     * @return
     */
    int totalConn();
```

### JavadocDeclaration
`@param channel` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/ChannelManager.java`
#### Snippet
```java
     * addChannel
     *
     * @param channel
     */
    void addChannel(Channel channel);
```

### JavadocDeclaration
`@param channelId` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/ChannelManager.java`
#### Snippet
```java
    /**
     *  get channel by Id
     * @param channelId
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/ChannelManager.java`
#### Snippet
```java
     *  get channel by Id
     * @param channelId
     * @return
     */
    Channel getChannelById(String channelId);
```

### JavadocDeclaration
`@param context` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/hook/UpstreamHookManager.java`
#### Snippet
```java
     * do hook in upstream
     *
     * @param context
     * @param msg
     * @return
```

### JavadocDeclaration
`@param msg` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/hook/UpstreamHookManager.java`
#### Snippet
```java
     *
     * @param context
     * @param msg
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/hook/UpstreamHookManager.java`
#### Snippet
```java
     * @param context
     * @param msg
     * @return
     */
    CompletableFuture<HookResult> doUpstreamHook(MqttMessageUpContext context, MqttMessage msg);
```

### JavadocDeclaration
`@param index` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/hook/UpstreamHookManager.java`
#### Snippet
```java
     * add a hook
     *
     * @param index
     * @param upstreamHook
     */
```

### JavadocDeclaration
`@param upstreamHook` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/hook/UpstreamHookManager.java`
#### Snippet
```java
     *
     * @param index
     * @param upstreamHook
     */
    void addHook(int index, UpstreamHook upstreamHook);
```

### JavadocDeclaration
`@param context` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/hook/UpstreamHook.java`
#### Snippet
```java
    /**
     *  do hook in upstream
     * @param context
     * @param msg
     * @return
```

### JavadocDeclaration
`@param msg` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/hook/UpstreamHook.java`
#### Snippet
```java
     *  do hook in upstream
     * @param context
     * @param msg
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/hook/UpstreamHook.java`
#### Snippet
```java
     * @param context
     * @param msg
     * @return
     */
    CompletableFuture<HookResult> doHook(MqttMessageUpContext context, MqttMessage msg);
```

### JavadocDeclaration
`@param channel` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/ChannelInfo.java`
#### Snippet
```java
     * clear channelInfo except the channelId namespace
     *
     * @param channel
     */
    public static void clear(Channel channel) {
```

### JavadocDeclaration
`@param topic` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/TopicUtils.java`
#### Snippet
```java
     * t1/t2/t3/
     *
     * @param topic
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/TopicUtils.java`
#### Snippet
```java
     *
     * @param topic
     * @return
     */
    public static String normalizeTopic(String topic) {
```

### JavadocDeclaration
`@param secondTopic` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/TopicUtils.java`
#### Snippet
```java
     * /t2/t3/t4/
     *
     * @param secondTopic
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/TopicUtils.java`
#### Snippet
```java
     *
     * @param secondTopic
     * @return
     */
    public static String normalizeSecondTopic(String secondTopic) {
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/hook/Hook.java`
#### Snippet
```java
     * get next hook
     *
     * @return
     */
    Hook getNextHook();
```

### JavadocDeclaration
`@param hook` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/hook/Hook.java`
#### Snippet
```java
     * set next hook
     *
     * @param hook
     */
    void setNextHook(Hook hook);
```

### JavadocDeclaration
`@param topic` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/SubscriptionPersistManager.java`
#### Snippet
```java
     * loadSubscribers
     *
     * @param topic
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/SubscriptionPersistManager.java`
#### Snippet
```java
     *
     * @param topic
     * @return
     */
    CompletableFuture<Set<String>> loadSubscribers(String topic);
```

### JavadocDeclaration
`@param clientId` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/SubscriptionPersistManager.java`
#### Snippet
```java
     * saveSubscriptions
     *
     * @param clientId
     * @param subscriptions
     */
```

### JavadocDeclaration
`@param subscriptions` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/SubscriptionPersistManager.java`
#### Snippet
```java
     *
     * @param clientId
     * @param subscriptions
     */
    void saveSubscriptions(String clientId, Set<Subscription> subscriptions);
```

### JavadocDeclaration
`@param topic` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/SubscriptionPersistManager.java`
#### Snippet
```java
     * removeSubscriptions
     *
     * @param topic
     * @param clientIds
     */
```

### JavadocDeclaration
`@param clientIds` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/SubscriptionPersistManager.java`
#### Snippet
```java
     *
     * @param topic
     * @param clientIds
     */
    void removeSubscribers(String topic, Set<String> clientIds);
```

### JavadocDeclaration
`@param topic` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/SubscriptionPersistManager.java`
#### Snippet
```java
     * saveSubscribers
     *
     * @param topic
     * @param clientIds
     */
```

### JavadocDeclaration
`@param clientIds` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/SubscriptionPersistManager.java`
#### Snippet
```java
     *
     * @param topic
     * @param clientIds
     */
    void saveSubscribers(String topic, Set<String> clientIds);
```

### JavadocDeclaration
`@param clientId` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/SubscriptionPersistManager.java`
#### Snippet
```java
     * loadSubscriptions
     *
     * @param clientId
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/SubscriptionPersistManager.java`
#### Snippet
```java
     *
     * @param clientId
     * @return
     */
    CompletableFuture<Set<Subscription>> loadSubscriptions(String clientId);
```

### JavadocDeclaration
`@param clientId` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/SubscriptionPersistManager.java`
#### Snippet
```java
     * removeSubscriptions
     *
     * @param clientId
     * @param subscriptions
     */
```

### JavadocDeclaration
`@param subscriptions` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/SubscriptionPersistManager.java`
#### Snippet
```java
     *
     * @param clientId
     * @param subscriptions
     */
    void removeSubscriptions(String clientId, Set<Subscription> subscriptions);
```

### JavadocDeclaration
`@param message` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/AuthManager.java`
#### Snippet
```java
     * MQTT packet authentication
     *
     * @param message
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/AuthManager.java`
#### Snippet
```java
     *
     * @param message
     * @return
     */
    HookResult doAuth(MqttMessage message);
```

### JavadocDeclaration
`@param server` tag description is missing
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/rpc/AbstractRpcProcessor.java`
#### Snippet
```java
    /**
     * To process linear consistent reads, read from the current node first and redirect the request to the master node if the read fails
     * @param server
     * @param group
     * @param rpcCtx
```

### JavadocDeclaration
`@param group` tag description is missing
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/rpc/AbstractRpcProcessor.java`
#### Snippet
```java
     * To process linear consistent reads, read from the current node first and redirect the request to the master node if the read fails
     * @param server
     * @param group
     * @param rpcCtx
     * @param request
```

### JavadocDeclaration
`@param rpcCtx` tag description is missing
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/rpc/AbstractRpcProcessor.java`
#### Snippet
```java
     * @param server
     * @param group
     * @param rpcCtx
     * @param request
     */
```

### JavadocDeclaration
`@param request` tag description is missing
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/rpc/AbstractRpcProcessor.java`
#### Snippet
```java
     * @param group
     * @param rpcCtx
     * @param request
     */
    public void handleReadIndex(final MqttRaftServer server, final String group, final RpcContext rpcCtx, ReadRequest request) {
```

### JavadocDeclaration
`@param server` tag description is missing
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/rpc/AbstractRpcProcessor.java`
#### Snippet
```java
     * The default RPC request handling method, where the current node is the master node of the requested RAFT group, processes the request
     *
     * @param server
     * @param group
     * @param rpcCtx
```

### JavadocDeclaration
`@param group` tag description is missing
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/rpc/AbstractRpcProcessor.java`
#### Snippet
```java
     *
     * @param server
     * @param group
     * @param rpcCtx
     * @param message
```

### JavadocDeclaration
`@param rpcCtx` tag description is missing
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/rpc/AbstractRpcProcessor.java`
#### Snippet
```java
     * @param server
     * @param group
     * @param rpcCtx
     * @param message
     */
```

### JavadocDeclaration
`@param message` tag description is missing
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/rpc/AbstractRpcProcessor.java`
#### Snippet
```java
     * @param group
     * @param rpcCtx
     * @param message
     */
    protected void handleRequest(final MqttRaftServer server, final String group, final RpcContext rpcCtx, Message message) {
```

### JavadocDeclaration
`@param ctx` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/mqtt/MqttPacketHandler.java`
#### Snippet
```java
     * doHandler after upstream processor
     *
     * @param ctx
     * @param mqttMessage
     */
```

### JavadocDeclaration
`@param mqttMessage` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/mqtt/MqttPacketHandler.java`
#### Snippet
```java
     *
     * @param ctx
     * @param mqttMessage
     */
    void doHandler(ChannelHandlerContext ctx, T mqttMessage, HookResult upstreamHookResult);
```

### JavadocDeclaration
`@param ctx` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/mqtt/MqttPacketHandler.java`
#### Snippet
```java
     * preHandler before upstream processor, for preprocessing
     *
     * @param ctx
     * @param mqttMessage
     * @return
```

### JavadocDeclaration
`@param mqttMessage` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/mqtt/MqttPacketHandler.java`
#### Snippet
```java
     *
     * @param ctx
     * @param mqttMessage
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/mqtt/MqttPacketHandler.java`
#### Snippet
```java
     * @param ctx
     * @param mqttMessage
     * @return
     */
    boolean preHandler(ChannelHandlerContext ctx, T mqttMessage);
```

### JavadocDeclaration
`@param clientId` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqOffsetStore.java`
#### Snippet
```java
    /**
     *  save lmq offset
     * @param clientId
     * @param offsetMap
     */
```

### JavadocDeclaration
`@param offsetMap` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqOffsetStore.java`
#### Snippet
```java
     *  save lmq offset
     * @param clientId
     * @param offsetMap
     */
    void save(String clientId, Map<Subscription, Map<Queue, QueueOffset>> offsetMap);
```

### JavadocDeclaration
`@param clientId` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqOffsetStore.java`
#### Snippet
```java
    /**
     *  get lmq offset
     * @param clientId
     * @param subscription
     * @return
```

### JavadocDeclaration
`@param subscription` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqOffsetStore.java`
#### Snippet
```java
     *  get lmq offset
     * @param clientId
     * @param subscription
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqOffsetStore.java`
#### Snippet
```java
     * @param clientId
     * @param subscription
     * @return
     */
    CompletableFuture<Map<Queue, QueueOffset>> getOffset(String clientId, Subscription subscription);
```

### JavadocDeclaration
`@param path` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/TrieMethod.java`
#### Snippet
```java
     * doMethod
     *
     * @param path
     * @param nodeKey
     */
```

### JavadocDeclaration
`@param nodeKey` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/TrieMethod.java`
#### Snippet
```java
     *
     * @param path
     * @param nodeKey
     */
    void doMethod(String path, K nodeKey);
```

### JavadocDeclaration
`@param firstTopic` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/MetaPersistManager.java`
#### Snippet
```java
    /**
     * get wildcards of the first topic
     * @param firstTopic
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/MetaPersistManager.java`
#### Snippet
```java
     * get wildcards of the first topic
     * @param firstTopic
     * @return
     */
    Set<String> getWildcards(String firstTopic);
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/MetaPersistManager.java`
#### Snippet
```java
    /**
     * get all connect nodes
     * @return
     */
    Set<String> getConnectNodeSet();
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/MetaPersistManager.java`
#### Snippet
```java
    /**
     *  get all first topics
     * @return
     */
    Set<String> getAllFirstTopics();
```

### JavadocDeclaration
`@throws` tag description is missing
in `mqtt-exporter/src/main/java/org/apache/rocketmq/mqtt/exporter/http/MqttHTTPServer.java`
#### Snippet
```java
         * Build the HTTPServer
         *
         * @throws IOException
         */
        public MqttHTTPServer build() throws IOException {
```

### JavadocDeclaration
`@param clientId` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoop.java`
#### Snippet
```java
     * load one mqtt session
     *
     * @param clientId
     * @param channel
     */
```

### JavadocDeclaration
`@param channel` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoop.java`
#### Snippet
```java
     *
     * @param clientId
     * @param channel
     */
    void loadSession(String clientId, Channel channel);
```

### JavadocDeclaration
`@param channelManager` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoop.java`
#### Snippet
```java
     * set ChannelManager
     *
     * @param channelManager
     */
    void setChannelManager(ChannelManager channelManager);
```

### JavadocDeclaration
`@param session` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoop.java`
#### Snippet
```java
     * notify to pull message from queue
     *
     * @param session
     * @param subscription
     * @param queue
```

### JavadocDeclaration
`@param subscription` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoop.java`
#### Snippet
```java
     *
     * @param session
     * @param subscription
     * @param queue
     */
```

### JavadocDeclaration
`@param queue` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoop.java`
#### Snippet
```java
     * @param session
     * @param subscription
     * @param queue
     */
    void notifyPullMessage(Session session, Subscription subscription, Queue queue);
```

### JavadocDeclaration
`@param clientId` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoop.java`
#### Snippet
```java
     * get session list by clientId
     *
     * @param clientId
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoop.java`
#### Snippet
```java
     *
     * @param clientId
     * @return
     */
    List<Session> getSessionList(String clientId);
```

### JavadocDeclaration
`@param channelId` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoop.java`
#### Snippet
```java
     * remove subscription
     *
     * @param channelId
     * @param subscriptions
     */
```

### JavadocDeclaration
`@param subscriptions` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoop.java`
#### Snippet
```java
     *
     * @param channelId
     * @param subscriptions
     */
    void removeSubscription(String channelId, Set<Subscription> subscriptions);
```

### JavadocDeclaration
`@param channelId` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoop.java`
#### Snippet
```java
     * add subscription
     *
     * @param channelId
     * @param subscriptions
     */
```

### JavadocDeclaration
`@param subscriptions` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoop.java`
#### Snippet
```java
     *
     * @param channelId
     * @param subscriptions
     */
    void addSubscription(String channelId, Set<Subscription> subscriptions);
```

### JavadocDeclaration
`@param channelId` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoop.java`
#### Snippet
```java
     * get the session by channelId
     *
     * @param channelId
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoop.java`
#### Snippet
```java
     *
     * @param channelId
     * @return
     */
    Session getSession(String channelId);
```

### JavadocDeclaration
`@param clientId` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoop.java`
#### Snippet
```java
     * unload one mqtt session
     *
     * @param clientId
     * @param channelId
     * @return
```

### JavadocDeclaration
`@param channelId` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoop.java`
#### Snippet
```java
     *
     * @param clientId
     * @param channelId
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoop.java`
#### Snippet
```java
     * @param clientId
     * @param channelId
     * @return
     */
    Session unloadSession(String clientId, String channelId);
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqQueueStore.java`
#### Snippet
```java
     * p2p topic of one mqtt client
     *
     * @return
     */
    String getClientP2pTopic();
```

### JavadocDeclaration
`@param firstTopic` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqQueueStore.java`
#### Snippet
```java
     * pull last messages
     *
     * @param firstTopic
     * @param queue
     * @param count
```

### JavadocDeclaration
`@param queue` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqQueueStore.java`
#### Snippet
```java
     *
     * @param firstTopic
     * @param queue
     * @param count
     * @return
```

### JavadocDeclaration
`@param count` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqQueueStore.java`
#### Snippet
```java
     * @param firstTopic
     * @param queue
     * @param count
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqQueueStore.java`
#### Snippet
```java
     * @param queue
     * @param count
     * @return
     */
    CompletableFuture<PullResult> pullLastMessages(String firstTopic, Queue queue, long count);
```

### JavadocDeclaration
`@param queue` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqQueueStore.java`
#### Snippet
```java
     * query maxId of Queue
     *
     * @param queue
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqQueueStore.java`
#### Snippet
```java
     *
     * @param queue
     * @return
     */
    CompletableFuture<Long> queryQueueMaxOffset(Queue queue);
```

### JavadocDeclaration
`@param queues` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqQueueStore.java`
#### Snippet
```java
     * put message and atomic dispatch to multiple queues
     *
     * @param queues
     * @param message
     * @return
```

### JavadocDeclaration
`@param message` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqQueueStore.java`
#### Snippet
```java
     *
     * @param queues
     * @param message
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqQueueStore.java`
#### Snippet
```java
     * @param queues
     * @param message
     * @return
     */
    CompletableFuture<StoreResult> putMessage(Set<String> queues, Message message);
```

### JavadocDeclaration
`@param firstTopic` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqQueueStore.java`
#### Snippet
```java
     * pull messages
     *
     * @param firstTopic
     * @param queue
     * @param queueOffset
```

### JavadocDeclaration
`@param queue` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqQueueStore.java`
#### Snippet
```java
     *
     * @param firstTopic
     * @param queue
     * @param queueOffset
     * @param count
```

### JavadocDeclaration
`@param queueOffset` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqQueueStore.java`
#### Snippet
```java
     * @param firstTopic
     * @param queue
     * @param queueOffset
     * @param count
     * @return
```

### JavadocDeclaration
`@param count` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqQueueStore.java`
#### Snippet
```java
     * @param queue
     * @param queueOffset
     * @param count
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqQueueStore.java`
#### Snippet
```java
     * @param queueOffset
     * @param count
     * @return
     */
    CompletableFuture<PullResult> pullMessage(String firstTopic, Queue queue, QueueOffset queueOffset, long count);
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqQueueStore.java`
#### Snippet
```java
     * retry topic of one mqtt client
     *
     * @return
     */
    String getClientRetryTopic();
```

### JavadocDeclaration
`@param firstTopic` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqQueueStore.java`
#### Snippet
```java
     * get readable brokers of the topic
     *
     * @param firstTopic
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/facade/LmqQueueStore.java`
#### Snippet
```java
     *
     * @param firstTopic
     * @return
     */
    Set<String> getReadableBrokers(String firstTopic);
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/processor/StateProcessor.java`
#### Snippet
```java
     * Raft Grouping category. The grouping category and sequence number identify the unique RAFT group
     *
     * @return
     */
    public abstract String groupCategory();
```

### JavadocDeclaration
`@param log` tag description is missing
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/processor/StateProcessor.java`
#### Snippet
```java
     * Process the write request to apply the state machine
     *
     * @param log
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/processor/StateProcessor.java`
#### Snippet
```java
     *
     * @param log
     * @return
     */
    public abstract Response onWriteRequest(WriteRequest log) throws Exception;
```

### JavadocDeclaration
`@param request` tag description is missing
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/processor/StateProcessor.java`
#### Snippet
```java
     * Process the read request to apply the state machine
     *
     * @param request
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/processor/StateProcessor.java`
#### Snippet
```java
     *
     * @param request
     * @return
     */
    public abstract Response onReadRequest(ReadRequest request) throws Exception;
```

### JavadocDeclaration
`@param key` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java

    /**
     * @param key
     * @param valueKey
     * @return null if can not find the key and valueKey or return the value
```

### JavadocDeclaration
`@param valueKey` tag description is missing
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
    /**
     * @param key
     * @param valueKey
     * @return null if can not find the key and valueKey or return the value
     */
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/ConnectHandler.java`
#### Snippet
```java
@Component
public class ConnectHandler extends ChannelInboundHandlerAdapter {
    private static Logger logger = LoggerFactory.getLogger(ConnectHandler.class);

    private final List<String> simpleExceptions = Collections.singletonList("Connection reset by peer");
```

### FieldMayBeFinal
Field `confFile` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/config/ServiceConf.java`
#### Snippet
```java
public class ServiceConf {
    private static final String CONF_FILE_NAME = "service.conf";
    private File confFile;
    private Properties properties;
    private int authThreadNum = 32;
```

### FieldMayBeFinal
Field `gmt` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/config/ConnectConfListener.java`
#### Snippet
```java
    private File confFile;
    private ScheduledThreadPoolExecutor scheduler;
    private AtomicLong gmt = new AtomicLong();
    private long refreshSecs = 3;

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/config/ConnectConfListener.java`
#### Snippet
```java
@Component
public class ConnectConfListener {
    private static Logger logger = LoggerFactory.getLogger(ConnectConfListener.class);

    @Resource
```

### FieldMayBeFinal
Field `refreshSecs` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/config/ConnectConfListener.java`
#### Snippet
```java
    private ScheduledThreadPoolExecutor scheduler;
    private AtomicLong gmt = new AtomicLong();
    private long refreshSecs = 3;

    @PostConstruct
```

### FieldMayBeFinal
Field `recvClientId` may be 'final'
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/RocketMQProducer.java`
#### Snippet
```java
    private static DefaultMQProducer producer;
    private static String firstTopic = System.getenv("firstTopic");
    private static String recvClientId = "recv01";

    public static void main(String[] args) throws Exception {
```

### FieldMayBeFinal
Field `firstTopic` may be 'final'
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/RocketMQProducer.java`
#### Snippet
```java
public class RocketMQProducer {
    private static DefaultMQProducer producer;
    private static String firstTopic = System.getenv("firstTopic");
    private static String recvClientId = "recv01";

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/notify/NotifyRetryManager.java`
#### Snippet
```java
@Component
public class NotifyRetryManager {
    private static Logger logger = LoggerFactory.getLogger(NotifyRetryManager.class);
    private DefaultMQPushConsumer defaultMQPushConsumer;

```

### FieldMayBeFinal
Field `algorithm` may be 'final'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/HmacSHA1Util.java`
#### Snippet
```java
public class HmacSHA1Util {
    private static Charset charset = Charset.forName("UTF-8");
    private static String algorithm = "HmacSHA1";

    public static String macSignature(String text, String secretKey) throws InvalidKeyException, NoSuchAlgorithmException {
```

### FieldMayBeFinal
Field `charset` may be 'final'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/HmacSHA1Util.java`
#### Snippet
```java

public class HmacSHA1Util {
    private static Charset charset = Charset.forName("UTF-8");
    private static String algorithm = "HmacSHA1";

```

### FieldMayBeFinal
Field `mqttTlsPort` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/config/ConnectConf.java`
#### Snippet
```java
    private int nettyWorkerThreadNum = Runtime.getRuntime().availableProcessors() * 2;
    private int mqttPort = 1883;
    private int mqttTlsPort = 8883;
    private int mqttWsPort = 8888;
    private boolean enableTlsSever = false;
```

### FieldMayBeFinal
Field `enableTlsSever` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/config/ConnectConf.java`
#### Snippet
```java
    private int mqttTlsPort = 8883;
    private int mqttWsPort = 8888;
    private boolean enableTlsSever = false;
    private boolean needClientAuth = false;
    private int maxPacketSizeInByte = 64 * 1024;
```

### FieldMayBeFinal
Field `needClientAuth` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/config/ConnectConf.java`
#### Snippet
```java
    private int mqttWsPort = 8888;
    private boolean enableTlsSever = false;
    private boolean needClientAuth = false;
    private int maxPacketSizeInByte = 64 * 1024;
    private int highWater = 256 * 1024;
```

### FieldMayBeFinal
Field `confFile` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/config/ConnectConf.java`
#### Snippet
```java
public class ConnectConf {
    private static final String CONF_FILE_NAME = "connect.conf";
    private File confFile;
    private int nettySelectorThreadNum = 1;
    private int nettyWorkerThreadNum = Runtime.getRuntime().availableProcessors() * 2;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/WillMsgClient.java`
#### Snippet
```java
public class WillMsgClient {

    private static Logger logger = LoggerFactory.getLogger(WillMsgClient.class);

    @Resource
```

### FieldMayBeFinal
Field `minBlankChannelSeconds` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/DefaultChannelManager.java`
#### Snippet
```java
    private Map<String, Channel> channelMap = new ConcurrentHashMap<>(1024);
    private HashedWheelTimer hashedWheelTimer;
    private static int minBlankChannelSeconds = 10;
    private ScheduledThreadPoolExecutor scheduler;

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/DefaultChannelManager.java`
#### Snippet
```java
@Component
public class DefaultChannelManager implements ChannelManager {
    private static Logger logger = LoggerFactory.getLogger(DefaultChannelManager.class);
    private Map<String, Channel> channelMap = new ConcurrentHashMap<>(1024);
    private HashedWheelTimer hashedWheelTimer;
```

### FieldMayBeFinal
Field `channelMap` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/channel/DefaultChannelManager.java`
#### Snippet
```java
public class DefaultChannelManager implements ChannelManager {
    private static Logger logger = LoggerFactory.getLogger(DefaultChannelManager.class);
    private Map<String, Channel> channelMap = new ConcurrentHashMap<>(1024);
    private HashedWheelTimer hashedWheelTimer;
    private static int minBlankChannelSeconds = 10;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/store/LmqOffsetStoreManager.java`
#### Snippet
```java
@Component
public class LmqOffsetStoreManager implements LmqOffsetStore {
    private static Logger logger = LoggerFactory.getLogger(LmqOffsetStoreManager.class);
    private DefaultMQPullConsumer defaultMQPullConsumer;

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/upstream/processor/PublishProcessor.java`
#### Snippet
```java
@Component
public class PublishProcessor implements UpstreamProcessor {
    private static Logger logger = LoggerFactory.getLogger(PublishProcessor.class);
    @Resource
    private LmqQueueStore lmqQueueStore;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/WildcardManager.java`
#### Snippet
```java
@Component
public class WildcardManager {
    private static Logger logger = LoggerFactory.getLogger(WildcardManager.class);
    private Map<String, Trie<String, Integer>> wildCardTrie = new ConcurrentHashMap<>();
    private ScheduledThreadPoolExecutor scheduler;
```

### FieldMayBeFinal
Field `wildCardTrie` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/WildcardManager.java`
#### Snippet
```java
public class WildcardManager {
    private static Logger logger = LoggerFactory.getLogger(WildcardManager.class);
    private Map<String, Trie<String, Integer>> wildCardTrie = new ConcurrentHashMap<>();
    private ScheduledThreadPoolExecutor scheduler;

```

### FieldMayBeFinal
Field `defaultMQPullConsumer` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/mq/MqPullConsumer.java`
#### Snippet
```java

public class MqPullConsumer {
    private DefaultMQPullConsumer defaultMQPullConsumer;

    public MqPullConsumer(Properties properties) {
```

### FieldMayBeFinal
Field `topic2Brokers` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/store/LmqQueueStoreManager.java`
#### Snippet
```java
    private DefaultMQProducer defaultMQProducer;
    private String consumerGroup = MixAll.CID_RMQ_SYS_PREFIX + "LMQ_PULL";
    private Map<String, Set<String>> topic2Brokers = new ConcurrentHashMap<>();

    @Resource
```

### FieldMayBeFinal
Field `consumerGroup` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/store/LmqQueueStoreManager.java`
#### Snippet
```java
    private DefaultMQPullConsumer defaultMQPullConsumer;
    private DefaultMQProducer defaultMQProducer;
    private String consumerGroup = MixAll.CID_RMQ_SYS_PREFIX + "LMQ_PULL";
    private Map<String, Set<String>> topic2Brokers = new ConcurrentHashMap<>();

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/store/LmqQueueStoreManager.java`
#### Snippet
```java
@Component
public class LmqQueueStoreManager implements LmqQueueStore {
    private static Logger logger = LoggerFactory.getLogger(LmqQueueStoreManager.class);
    private PullAPIWrapper pullAPIWrapper;
    private DefaultMQPullConsumer defaultMQPullConsumer;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/notify/MessageNotifyAction.java`
#### Snippet
```java
@Component
public class MessageNotifyAction {
    private static Logger logger = LoggerFactory.getLogger(MessageNotifyAction.class);

    @Resource
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/WillMsgPersistManagerImpl.java`
#### Snippet
```java

public class WillMsgPersistManagerImpl implements WillMsgPersistManager {
    private static Logger logger = LoggerFactory.getLogger(WillMsgPersistManagerImpl.class);

    @Resource
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/RetainedMsgClient.java`
#### Snippet
```java
@Service
public class RetainedMsgClient {
    private static Logger logger = LoggerFactory.getLogger(RetainedMsgClient.class);

    @Resource
```

### FieldMayBeFinal
Field `pubCache` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/InFlyCache.java`
#### Snippet
```java
    private MqttMsgId mqttMsgId;

    private ConcurrentMap<String, Set<Integer>> pubCache = new ConcurrentHashMap<>(128);
    private PendingDownCache pendingDownCache = new PendingDownCache();

```

### FieldMayBeFinal
Field `pendingDownCache` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/InFlyCache.java`
#### Snippet
```java

    private ConcurrentMap<String, Set<Integer>> pubCache = new ConcurrentHashMap<>(128);
    private PendingDownCache pendingDownCache = new PendingDownCache();

    public void cleanResource(String clientId, String channelId) {
```

### FieldMayBeFinal
Field `t` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/InFlyCache.java`
#### Snippet
```java
        private Queue queue;
        private long seqId;
        private long t = System.currentTimeMillis();

        public Subscription getSubscription() {
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/InFlyCache.java`
#### Snippet
```java

    public class PendingDownCache {
        private ConcurrentMap<String, Map<Integer, PendingDown>> cache = new ConcurrentHashMap<>(128);

        public PendingDown put(String channelId, int mqttMsgId, Subscription subscription, Queue queue,
```

### FieldMayBeFinal
Field `nodeFail` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/notify/NotifyManager.java`
#### Snippet
```java
    private ScheduledThreadPoolExecutor scheduler;
    private Set<String> topics = new HashSet<>();
    private Map<String, AtomicInteger> nodeFail = new ConcurrentHashMap<>();
    private static final int NODE_FAIL_MAX_NUM = 3;
    private NettyRemotingClient remotingClient;
```

### FieldMayBeFinal
Field `topics` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/notify/NotifyManager.java`
#### Snippet
```java
    private String dispatcherConsumerGroup = MixAll.CID_RMQ_SYS_PREFIX + "mqtt_event";
    private ScheduledThreadPoolExecutor scheduler;
    private Set<String> topics = new HashSet<>();
    private Map<String, AtomicInteger> nodeFail = new ConcurrentHashMap<>();
    private static final int NODE_FAIL_MAX_NUM = 3;
```

### FieldMayBeFinal
Field `dispatcherConsumerGroup` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/notify/NotifyManager.java`
#### Snippet
```java
    private static Logger logger = LoggerFactory.getLogger(NotifyManager.class);
    private DefaultMQPushConsumer defaultMQPushConsumer;
    private String dispatcherConsumerGroup = MixAll.CID_RMQ_SYS_PREFIX + "mqtt_event";
    private ScheduledThreadPoolExecutor scheduler;
    private Set<String> topics = new HashSet<>();
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/notify/NotifyManager.java`
#### Snippet
```java
@Component
public class NotifyManager {
    private static Logger logger = LoggerFactory.getLogger(NotifyManager.class);
    private DefaultMQPushConsumer defaultMQPushConsumer;
    private String dispatcherConsumerGroup = MixAll.CID_RMQ_SYS_PREFIX + "mqtt_event";
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/mqtt/handler/MqttPubAckHandler.java`
#### Snippet
```java
@Component
public class MqttPubAckHandler implements MqttPacketHandler<MqttPubAckMessage> {
    private static Logger logger = LoggerFactory.getLogger(MqttPubAckHandler.class);

    @Resource
```

### FieldMayBeFinal
Field `topicCache` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/match/MatchAction.java`
#### Snippet
```java

    private Trie<String, Integer> trie = new Trie<>();
    private ConcurrentMap<String, Set<String>> topicCache = new ConcurrentHashMap<>(16);


```

### FieldMayBeFinal
Field `trie` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/match/MatchAction.java`
#### Snippet
```java
    private SessionLoop sessionLoop;

    private Trie<String, Integer> trie = new Trie<>();
    private ConcurrentMap<String, Set<String>> topicCache = new ConcurrentHashMap<>(16);

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/match/MatchAction.java`
#### Snippet
```java
@Component
public class MatchAction {
    private static Logger logger = LoggerFactory.getLogger(MatchAction.class);

    @Resource
```

### FieldMayBeFinal
Field `raftClientExecutor` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/MetaRpcClient.java`
#### Snippet
```java
    private Configuration conf;
    private CliClientServiceImpl cliClientService;
    private static ScheduledExecutorService raftClientExecutor = Executors.newSingleThreadScheduledExecutor();
    public String[] raftGroups;

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/MetaRpcClient.java`
#### Snippet
```java
@Component
public class MetaRpcClient {
    private static Logger logger = LoggerFactory.getLogger(MetaRpcClient.class);
    private RouteTable rt;
    private Configuration conf;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/PushAction.java`
#### Snippet
```java
@Component
public class PushAction {
    private static Logger logger = LoggerFactory.getLogger(PushAction.class);

    @Resource
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/MetaPersistManagerSample.java`
#### Snippet
```java
 */
public class MetaPersistManagerSample implements MetaPersistManager {
    private static Logger logger = LoggerFactory.getLogger(MetaPersistManagerSample.class);
    private volatile Map<String, Set<String>> wildcardCache = new ConcurrentHashMap<>();
    private volatile Set<String> firstTopics = new HashSet<>();
```

### FieldMayBeFinal
Field `userProperties` may be 'final'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Message.java`
#### Snippet
```java
    private long storeTimestamp;
    private int ack = -1;
    private Map<String, String> userProperties = new HashMap<>();

    public static String propertyFirstTopic = "firstTopic";
```

### FieldMayBeFinal
Field `upstreamHookList` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/hook/UpstreamHookManagerImpl.java`
#### Snippet
```java
public class UpstreamHookManagerImpl implements UpstreamHookManager {

    private UpstreamHook[] upstreamHookList = new UpstreamHook[UpstreamHookEnum.values().length];
    private AtomicBoolean isAssembled = new AtomicBoolean(false);

```

### FieldMayBeFinal
Field `isAssembled` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/hook/UpstreamHookManagerImpl.java`
#### Snippet
```java

    private UpstreamHook[] upstreamHookList = new UpstreamHook[UpstreamHookEnum.values().length];
    private AtomicBoolean isAssembled = new AtomicBoolean(false);

    @Override
```

### FieldMayBeFinal
Field `confFile` may be 'final'
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/config/MetaConf.java`
#### Snippet
```java
public class MetaConf {
    private static final String CONF_FILE_NAME = "meta.conf";
    private File confFile;
    private String clusterName = "defaultCluster";
    private String allNodeAddress;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/WillLoop.java`
#### Snippet
```java
@Component
public class WillLoop {
    private static Logger logger = LoggerFactory.getLogger(WillLoop.class);
    private ScheduledThreadPoolExecutor aliveService = new ScheduledThreadPoolExecutor(2, new ThreadFactoryImpl("check_alive_thread_"));
    private long checkAliveIntervalMillis = 5 * 1000;
```

### FieldMayBeFinal
Field `aliveService` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/WillLoop.java`
#### Snippet
```java
public class WillLoop {
    private static Logger logger = LoggerFactory.getLogger(WillLoop.class);
    private ScheduledThreadPoolExecutor aliveService = new ScheduledThreadPoolExecutor(2, new ThreadFactoryImpl("check_alive_thread_"));
    private long checkAliveIntervalMillis = 5 * 1000;
    private ThreadPoolExecutor executor;
```

### FieldMayBeFinal
Field `checkAliveIntervalMillis` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/WillLoop.java`
#### Snippet
```java
    private static Logger logger = LoggerFactory.getLogger(WillLoop.class);
    private ScheduledThreadPoolExecutor aliveService = new ScheduledThreadPoolExecutor(2, new ThreadFactoryImpl("check_alive_thread_"));
    private long checkAliveIntervalMillis = 5 * 1000;
    private ThreadPoolExecutor executor;

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/rpc/RpcPacketDispatcher.java`
#### Snippet
```java
@Component
public class RpcPacketDispatcher implements NettyRequestProcessor {
    private static Logger logger = LoggerFactory.getLogger(RpcPacketDispatcher.class);

    @Resource
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/mqtt/handler/MqttPingHandler.java`
#### Snippet
```java
@Component
public class MqttPingHandler implements MqttPacketHandler<MqttMessage> {
    private static Logger logger = LoggerFactory.getLogger(MqttPingHandler.class);

    @Override
```

### FieldMayBeFinal
Field `gmt` may be 'final'
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/config/MetaConfListener.java`
#### Snippet
```java
    private File confFile;
    private ScheduledThreadPoolExecutor scheduler;
    private AtomicLong gmt = new AtomicLong();
    private long refreshSecs = 3;

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/config/MetaConfListener.java`
#### Snippet
```java
@Component
public class MetaConfListener {
    private static Logger logger = LoggerFactory.getLogger(MetaConfListener.class);

    @Resource
```

### FieldMayBeFinal
Field `refreshSecs` may be 'final'
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/config/MetaConfListener.java`
#### Snippet
```java
    private ScheduledThreadPoolExecutor scheduler;
    private AtomicLong gmt = new AtomicLong();
    private long refreshSecs = 3;

    @PostConstruct
```

### FieldMayBeFinal
Field `sysLogger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/ws/WebSocketServerHandler.java`
#### Snippet
```java
@Component
public class WebSocketServerHandler extends SimpleChannelInboundHandler<Object> {
    private static Logger sysLogger = LoggerFactory.getLogger(WebSocketServerHandler.class);

    private WebSocketServerHandshaker handshaker;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/mqtt/handler/MqttUnSubscribeHandler.java`
#### Snippet
```java
@Component
public class MqttUnSubscribeHandler implements MqttPacketHandler<MqttUnsubscribeMessage> {
    private static Logger logger = LoggerFactory.getLogger(MqttUnSubscribeHandler.class);

    @Resource
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/mqtt/MqttPacketDispatcher.java`
#### Snippet
```java
@Component
public class MqttPacketDispatcher extends SimpleChannelInboundHandler<MqttMessage> {
    private static Logger logger = LoggerFactory.getLogger(MqttPacketDispatcher.class);

    @Resource
```

### FieldMayBeFinal
Field `scheduler` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/mqtt/handler/MqttConnectHandler.java`
#### Snippet
```java
    private SessionLoop sessionLoop;

    private ScheduledThreadPoolExecutor scheduler = new ScheduledThreadPoolExecutor(1, new ThreadFactoryImpl("check_connect_future"));

    @Override
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/mqtt/handler/MqttConnectHandler.java`
#### Snippet
```java
@Component
public class MqttConnectHandler implements MqttPacketHandler<MqttConnectMessage> {
    private static Logger logger = LoggerFactory.getLogger(MqttConnectHandler.class);

    @Resource
```

### FieldMayBeFinal
Field `defaultMQPushConsumer` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/mq/MqConsumer.java`
#### Snippet
```java
public class MqConsumer  {
    public static final String THREAD_NUM_KEY = "threadNum";
    private DefaultMQPushConsumer defaultMQPushConsumer;

    public MqConsumer(Properties properties) {
```

### FieldMayBeFinal
Field `server` may be 'final'
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/processor/WillMsgStateProcessor.java`
#### Snippet
```java
public class WillMsgStateProcessor extends StateProcessor {
    private static Logger logger = LoggerFactory.getLogger(WillMsgStateProcessor.class);
    private MqttRaftServer server;

    public WillMsgStateProcessor(MqttRaftServer server) {
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/processor/WillMsgStateProcessor.java`
#### Snippet
```java

public class WillMsgStateProcessor extends StateProcessor {
    private static Logger logger = LoggerFactory.getLogger(WillMsgStateProcessor.class);
    private MqttRaftServer server;

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/rocksdb/RocksDBSnapshot.java`
#### Snippet
```java

public class RocksDBSnapshot {
    private static Logger logger = LoggerFactory.getLogger(RocksDBSnapshot.class);
    private static final String SNAPSHOT_DIR = "sd";
    private static final String SNAPSHOT_ARCHIVE = "sd.zip";
```

### FieldMayBeFinal
Field `rdbPath` may be 'final'
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/rocksdb/RocksDBEngine.java`
#### Snippet
```java
public class RocksDBEngine {
    private RocksDB rdb;
    private String rdbPath;
    private DBOptions dbOptions;
    private ColumnFamilyHandle defaultHandle;
```

### FieldMayBeFinal
Field `rocksDBSnapshot` may be 'final'
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/rocksdb/RocksDBEngine.java`
#### Snippet
```java
    private final List<ColumnFamilyDescriptor> cfDescriptors = Lists.newArrayList();
    private WriteOptions writeOptions;
    private RocksDBSnapshot rocksDBSnapshot;
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

```

### FieldMayBeFinal
Field `queue` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java
        private Session session;
        private Subscription subscription;
        private Queue queue;
        private long id = rid.getAndIncrement();

```

### FieldMayBeFinal
Field `rid` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java
    private Map<String, Boolean> pullStatus = new ConcurrentHashMap<>(1024);

    private AtomicLong rid = new AtomicLong();
    private long pullIntervalMillis = 10;

```

### FieldMayBeFinal
Field `clientMap` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java
     */
    private Map<String, Session> sessionMap = new ConcurrentHashMap<>(1024);
    private Map<String, Map<String, Session>> clientMap = new ConcurrentHashMap<>(1024);
    private Map<String, PullEvent> pullEventMap = new ConcurrentHashMap<>(1024);
    private Map<String, Boolean> pullStatus = new ConcurrentHashMap<>(1024);
```

### FieldMayBeFinal
Field `session` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java

    class PullEvent {
        private Session session;
        private Subscription subscription;
        private Queue queue;
```

### FieldMayBeFinal
Field `pullStatus` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java
    private Map<String, Map<String, Session>> clientMap = new ConcurrentHashMap<>(1024);
    private Map<String, PullEvent> pullEventMap = new ConcurrentHashMap<>(1024);
    private Map<String, Boolean> pullStatus = new ConcurrentHashMap<>(1024);

    private AtomicLong rid = new AtomicLong();
```

### FieldMayBeFinal
Field `pullEventMap` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java
    private Map<String, Session> sessionMap = new ConcurrentHashMap<>(1024);
    private Map<String, Map<String, Session>> clientMap = new ConcurrentHashMap<>(1024);
    private Map<String, PullEvent> pullEventMap = new ConcurrentHashMap<>(1024);
    private Map<String, Boolean> pullStatus = new ConcurrentHashMap<>(1024);

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java
@Component
public class SessionLoopImpl implements SessionLoop {
    private static Logger logger = LoggerFactory.getLogger(SessionLoopImpl.class);

    @Resource
```

### FieldMayBeFinal
Field `sessionMap` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java
     * channelId->session
     */
    private Map<String, Session> sessionMap = new ConcurrentHashMap<>(1024);
    private Map<String, Map<String, Session>> clientMap = new ConcurrentHashMap<>(1024);
    private Map<String, PullEvent> pullEventMap = new ConcurrentHashMap<>(1024);
```

### FieldMayBeFinal
Field `id` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java
        private Subscription subscription;
        private Queue queue;
        private long id = rid.getAndIncrement();

        public PullEvent(Session session, Subscription subscription, Queue queue) {
```

### FieldMayBeFinal
Field `subscription` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java
    class PullEvent {
        private Session session;
        private Subscription subscription;
        private Queue queue;
        private long id = rid.getAndIncrement();
```

### FieldMayBeFinal
Field `pullIntervalMillis` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/SessionLoopImpl.java`
#### Snippet
```java

    private AtomicLong rid = new AtomicLong();
    private long pullIntervalMillis = 10;

    @PostConstruct
```

### FieldMayBeFinal
Field `defaultMQProducer` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/mq/MqProducer.java`
#### Snippet
```java
public class MqProducer   {

    private DefaultMQProducer defaultMQProducer;

    public MqProducer(Properties properties) {
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/RetainedPersistManagerImpl.java`
#### Snippet
```java
public class RetainedPersistManagerImpl implements RetainedPersistManager {

    private static Logger logger = LoggerFactory.getLogger(RetainedPersistManagerImpl.class);

    @Resource
```

### FieldMayBeFinal
Field `inUseMsgIds` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/MqttMsgId.java`
#### Snippet
```java
    class MsgIdEntry {
        private int nextMsgId = MIN_MSG_ID - 1;
        private Map<Integer, Integer> inUseMsgIds = new ConcurrentHashMap<>();
    }

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/FirstTopicManager.java`
#### Snippet
```java
@Component
public class FirstTopicManager {
    private static Logger logger = LoggerFactory.getLogger(FirstTopicManager.class);
    private Cache<String, TopicRouteData> topicExistCache;
    private Cache<String, Object> topicNotExistCache;
```

### FieldMayBeFinal
Field `readableBrokers` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/FirstTopicManager.java`
#### Snippet
```java
    private DefaultMQAdminExt defaultMQAdminExt;
    private Map<String, Map<String, String>> brokerAddressMap = new ConcurrentHashMap<>();
    private Map<String, Set<String>> readableBrokers = new ConcurrentHashMap<>();
    private ScheduledThreadPoolExecutor scheduler;

```

### FieldMayBeFinal
Field `brokerAddressMap` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/FirstTopicManager.java`
#### Snippet
```java
    private Cache<String, Object> topicNotExistCache;
    private DefaultMQAdminExt defaultMQAdminExt;
    private Map<String, Map<String, String>> brokerAddressMap = new ConcurrentHashMap<>();
    private Map<String, Set<String>> readableBrokers = new ConcurrentHashMap<>();
    private ScheduledThreadPoolExecutor scheduler;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/mqtt/handler/MqttSubscribeHandler.java`
#### Snippet
```java
@Component
public class MqttSubscribeHandler implements MqttPacketHandler<MqttSubscribeMessage> {
    private static Logger logger = LoggerFactory.getLogger(MqttSubscribeHandler.class);

    @Resource
```

### FieldMayBeFinal
Field `scheduler` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/mqtt/handler/MqttSubscribeHandler.java`
#### Snippet
```java
    private PushAction pushAction;

    private ScheduledThreadPoolExecutor scheduler = new ScheduledThreadPoolExecutor(1, new ThreadFactoryImpl("check_subscribe_future"));

    @Override
```

### FieldMayBeFinal
Field `defaultMQAdminExt` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/mq/MqAdmin.java`
#### Snippet
```java

public class MqAdmin {
    private DefaultMQAdminExt defaultMQAdminExt;

    public MqAdmin(Properties properties) {
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/starter/RpcServer.java`
#### Snippet
```java
@Service
public class RpcServer {
    private static Logger logger = LoggerFactory.getLogger(RpcServer.class);

    @Resource
```

### FieldMayBeFinal
Field `refreshCheckInterval` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/config/ServiceConfListener.java`
#### Snippet
```java
    private ScheduledThreadPoolExecutor scheduler;
    private AtomicLong gmt = new AtomicLong();
    private long refreshCheckInterval = 3;

    @PostConstruct
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/config/ServiceConfListener.java`
#### Snippet
```java
@Component
public class ServiceConfListener {
    private static Logger logger = LoggerFactory.getLogger(ServiceConfListener.class);

    @Resource
```

### FieldMayBeFinal
Field `gmt` may be 'final'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/config/ServiceConfListener.java`
#### Snippet
```java
    private File confFile;
    private ScheduledThreadPoolExecutor scheduler;
    private AtomicLong gmt = new AtomicLong();
    private long refreshCheckInterval = 3;

```

### FieldMayBeFinal
Field `server` may be 'final'
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/processor/RetainedMsgStateProcessor.java`
#### Snippet
```java
    private static Logger logger = LoggerFactory.getLogger(RetainedMsgStateProcessor.class);
    private final ConcurrentHashMap<String, Trie<String, String>> retainedMsgTopicTrie = new ConcurrentHashMap<>();  //key:firstTopic value:retained topic Trie
    private MqttRaftServer server;
    private int maxRetainedTopicNum;

```

### FieldMayBeFinal
Field `maxRetainedTopicNum` may be 'final'
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/processor/RetainedMsgStateProcessor.java`
#### Snippet
```java
    private final ConcurrentHashMap<String, Trie<String, String>> retainedMsgTopicTrie = new ConcurrentHashMap<>();  //key:firstTopic value:retained topic Trie
    private MqttRaftServer server;
    private int maxRetainedTopicNum;

    public RetainedMsgStateProcessor(MqttRaftServer server, int maxRetainedTopicNum) {
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/processor/RetainedMsgStateProcessor.java`
#### Snippet
```java

public class RetainedMsgStateProcessor extends StateProcessor {
    private static Logger logger = LoggerFactory.getLogger(RetainedMsgStateProcessor.class);
    private final ConcurrentHashMap<String, Trie<String, String>> retainedMsgTopicTrie = new ConcurrentHashMap<>();  //key:firstTopic value:retained topic Trie
    private MqttRaftServer server;
```

### FieldMayBeFinal
Field `wsServerBootstrap` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/starter/MqttServer.java`
#### Snippet
```java

    private ServerBootstrap serverBootstrap = new ServerBootstrap();
    private ServerBootstrap wsServerBootstrap = new ServerBootstrap();
    private ServerBootstrap tlsServerBootstrap = new ServerBootstrap();

```

### FieldMayBeFinal
Field `serverBootstrap` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/starter/MqttServer.java`
#### Snippet
```java
    private static Logger logger = LoggerFactory.getLogger(MqttServer.class);

    private ServerBootstrap serverBootstrap = new ServerBootstrap();
    private ServerBootstrap wsServerBootstrap = new ServerBootstrap();
    private ServerBootstrap tlsServerBootstrap = new ServerBootstrap();
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/starter/MqttServer.java`
#### Snippet
```java
@Service
public class MqttServer {
    private static Logger logger = LoggerFactory.getLogger(MqttServer.class);

    private ServerBootstrap serverBootstrap = new ServerBootstrap();
```

### FieldMayBeFinal
Field `tlsServerBootstrap` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/starter/MqttServer.java`
#### Snippet
```java
    private ServerBootstrap serverBootstrap = new ServerBootstrap();
    private ServerBootstrap wsServerBootstrap = new ServerBootstrap();
    private ServerBootstrap tlsServerBootstrap = new ServerBootstrap();

    @Resource
```

### FieldMayBeFinal
Field `offsetMap` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
    private WillMessage willMessage;
    private AtomicBoolean needPersistOffset = new AtomicBoolean(false);
    private ConcurrentMap<String, Map<Queue, QueueOffset>> offsetMap = new ConcurrentHashMap<>(16);
    private Map<String, Subscription> subscriptions = new ConcurrentHashMap<>();
    private ConcurrentMap<Subscription, Map<Queue, LinkedHashSet<Message>>> sendingMessages = new ConcurrentHashMap<>(16);
```

### FieldMayBeFinal
Field `subscriptions` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
    private AtomicBoolean needPersistOffset = new AtomicBoolean(false);
    private ConcurrentMap<String, Map<Queue, QueueOffset>> offsetMap = new ConcurrentHashMap<>(16);
    private Map<String, Subscription> subscriptions = new ConcurrentHashMap<>();
    private ConcurrentMap<Subscription, Map<Queue, LinkedHashSet<Message>>> sendingMessages = new ConcurrentHashMap<>(16);
    private ConcurrentMap<Subscription, Integer> loadStatusMap = new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `needPersistOffset` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java

    private WillMessage willMessage;
    private AtomicBoolean needPersistOffset = new AtomicBoolean(false);
    private ConcurrentMap<String, Map<Queue, QueueOffset>> offsetMap = new ConcurrentHashMap<>(16);
    private Map<String, Subscription> subscriptions = new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java

public class Session {
    private static Logger logger = LoggerFactory.getLogger(Session.class);
    private final long startTime = System.currentTimeMillis();
    private Channel channel;
```

### FieldMayBeFinal
Field `loadStatusMap` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
    private Map<String, Subscription> subscriptions = new ConcurrentHashMap<>();
    private ConcurrentMap<Subscription, Map<Queue, LinkedHashSet<Message>>> sendingMessages = new ConcurrentHashMap<>(16);
    private ConcurrentMap<Subscription, Integer> loadStatusMap = new ConcurrentHashMap<>();

    public Session() {
```

### FieldMayBeFinal
Field `sendingMessages` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/Session.java`
#### Snippet
```java
    private ConcurrentMap<String, Map<Queue, QueueOffset>> offsetMap = new ConcurrentHashMap<>(16);
    private Map<String, Subscription> subscriptions = new ConcurrentHashMap<>();
    private ConcurrentMap<Subscription, Map<Queue, LinkedHashSet<Message>>> sendingMessages = new ConcurrentHashMap<>(16);
    private ConcurrentMap<Subscription, Integer> loadStatusMap = new ConcurrentHashMap<>();

```

### FieldMayBeFinal
Field `bizStateMachineMap` may be 'final'
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/MqttRaftServer.java`
#### Snippet
```java
    private CliService cliService;
    private Map<String, StateProcessor> stateProcessors = new ConcurrentHashMap<>();
    private Map<String, MqttStateMachine> bizStateMachineMap = new ConcurrentHashMap<>();
    public String[] raftGroups;
    private RouteTable rt;
```

### FieldMayBeFinal
Field `scheduler` may be 'final'
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/MqttRaftServer.java`
#### Snippet
```java
    private static ExecutorService raftExecutor;
    private static ExecutorService requestExecutor;
    private static ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

    private PeerId localPeerId;
```

### FieldMayBeFinal
Field `stateProcessors` may be 'final'
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/MqttRaftServer.java`
#### Snippet
```java
    private CliClientServiceImpl cliClientService;
    private CliService cliService;
    private Map<String, StateProcessor> stateProcessors = new ConcurrentHashMap<>();
    private Map<String, MqttStateMachine> bizStateMachineMap = new ConcurrentHashMap<>();
    public String[] raftGroups;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/mqtt/handler/MqttPublishHandler.java`
#### Snippet
```java
@Component
public class MqttPublishHandler implements MqttPacketHandler<MqttPublishMessage> {
    private static Logger logger = LoggerFactory.getLogger(MqttPublishHandler.class);

    @Resource
```

### FieldMayBeFinal
Field `message` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
    public class RetryMessage {
        private Session session;
        private Message message;
        private Subscription subscription;
        private int qos;
```

### FieldMayBeFinal
Field `scheduler` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
    private long messageRetryInterval = 3000;
    private Map<String, Map<Integer, RetryMessage>> sessionNoWaitRetryMsgMap = new ConcurrentHashMap<>(16);
    private ScheduledThreadPoolExecutor scheduler = new ScheduledThreadPoolExecutor(2,
            new ThreadFactoryImpl("retry_msg_thread_"));

```

### FieldMayBeFinal
Field `scheduleDelaySecs` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
    private Cache<String, RetryMessage> retryCache;
    private static final int MAX_CACHE = 50000;
    private int scheduleDelaySecs = 3;
    private long messageRetryInterval = 3000;
    private Map<String, Map<Integer, RetryMessage>> sessionNoWaitRetryMsgMap = new ConcurrentHashMap<>(16);
```

### FieldMayBeFinal
Field `qos` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
        private Message message;
        private Subscription subscription;
        private int qos;
        private int mqttMsgId;
        private MqttMessageType mqttMessageType;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
@Component
public class RetryDriver {
    private static Logger logger = LoggerFactory.getLogger(RetryDriver.class);

    @Resource
```

### FieldMayBeFinal
Field `messageRetryInterval` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
    private static final int MAX_CACHE = 50000;
    private int scheduleDelaySecs = 3;
    private long messageRetryInterval = 3000;
    private Map<String, Map<Integer, RetryMessage>> sessionNoWaitRetryMsgMap = new ConcurrentHashMap<>(16);
    private ScheduledThreadPoolExecutor scheduler = new ScheduledThreadPoolExecutor(2,
```

### FieldMayBeFinal
Field `mqttMsgId` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
        private Subscription subscription;
        private int qos;
        private int mqttMsgId;
        private MqttMessageType mqttMessageType;
        private int localRetryTime = 0;
```

### FieldMayBeFinal
Field `subscription` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
        private Session session;
        private Message message;
        private Subscription subscription;
        private int qos;
        private int mqttMsgId;
```

### FieldMayBeFinal
Field `mqttMessageType` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
        private int qos;
        private int mqttMsgId;
        private MqttMessageType mqttMessageType;
        private int localRetryTime = 0;
        private static final int MAX_LOCAL_RETRY = 1;
```

### FieldMayBeFinal
Field `session` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java

    public class RetryMessage {
        private Session session;
        private Message message;
        private Subscription subscription;
```

### FieldMayBeFinal
Field `sessionNoWaitRetryMsgMap` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
    private int scheduleDelaySecs = 3;
    private long messageRetryInterval = 3000;
    private Map<String, Map<Integer, RetryMessage>> sessionNoWaitRetryMsgMap = new ConcurrentHashMap<>(16);
    private ScheduledThreadPoolExecutor scheduler = new ScheduledThreadPoolExecutor(2,
            new ThreadFactoryImpl("retry_msg_thread_"));
```

### FieldMayBeFinal
Field `rootNode` may be 'final'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
public class Trie<K, V> {

    private TrieNode<K, V> rootNode = new TrieNode(null);

    private Set<String> nodePath = new HashSet<>();
```

### FieldMayBeFinal
Field `nodePath` may be 'final'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/model/Trie.java`
#### Snippet
```java
    private TrieNode<K, V> rootNode = new TrieNode(null);

    private Set<String> nodePath = new HashSet<>();


```

### FieldMayBeFinal
Field `daemon` may be 'final'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/StatUtil.java`
#### Snippet
```java
    private static final int STAT_WINDOW_SECONDS = Integer.parseInt(System.getProperty("stat.win.seconds", "60"));
    private static final String SPLITTER = "|";
    private static ScheduledExecutorService daemon = Executors.newSingleThreadScheduledExecutor();

    static class Invoke {
```

### FieldMayBeFinal
Field `secondInvokeCache` may be 'final'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/StatUtil.java`
#### Snippet
```java
    private static final int MAX_KEY_NUM = Integer.parseInt(System.getProperty("stat.util.key.max.num", "10000"));
    private static volatile ConcurrentMap<String, Invoke> invokeCache = new ConcurrentHashMap<>(64);
    private static volatile ConcurrentMap<String, Map<Long, SecondInvoke>> secondInvokeCache = new ConcurrentHashMap<>(
        64);

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/StatUtil.java`
#### Snippet
```java
public class StatUtil {
    private static Logger sysLogger = LoggerFactory.getLogger(StatUtil.class);
    private static Logger logger = LoggerFactory.getLogger("StatLogger");
    private static final int MAX_KEY_NUM = Integer.parseInt(System.getProperty("stat.util.key.max.num", "10000"));
    private static volatile ConcurrentMap<String, Invoke> invokeCache = new ConcurrentHashMap<>(64);
```

### FieldMayBeFinal
Field `sysLogger` may be 'final'
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/StatUtil.java`
#### Snippet
```java

public class StatUtil {
    private static Logger sysLogger = LoggerFactory.getLogger(StatUtil.class);
    private static Logger logger = LoggerFactory.getLogger("StatLogger");
    private static final int MAX_KEY_NUM = Integer.parseInt(System.getProperty("stat.util.key.max.num", "10000"));
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java
    private Map<Queue, Boolean> loadStatus = new ConcurrentHashMap<>();

    private Cache<Queue, CacheEntry> cache = Caffeine.newBuilder()
            .expireAfterAccess(10, TimeUnit.MINUTES)
            .maximumSize(1_000)
```

### FieldMayBeFinal
Field `loadEvent` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java

    private AtomicLong rid = new AtomicLong();
    private Map<Queue, QueueEvent> loadEvent = new ConcurrentHashMap<>();
    private Map<Queue, Boolean> loadStatus = new ConcurrentHashMap<>();

```

### FieldMayBeFinal
Field `loading` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java

    class CacheEntry {
        private AtomicBoolean loading = new AtomicBoolean(false);
        private List<Message> messageList = new ArrayList<>();
        private volatile long startLoadingT = System.currentTimeMillis();
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java
@Component
public class QueueCache {
    private static Logger logger = LoggerFactory.getLogger(QueueCache.class);

    @Resource
```

### FieldMayBeFinal
Field `rid` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java
            new ThreadFactoryImpl("loadCache_"));

    private AtomicLong rid = new AtomicLong();
    private Map<Queue, QueueEvent> loadEvent = new ConcurrentHashMap<>();
    private Map<Queue, Boolean> loadStatus = new ConcurrentHashMap<>();
```

### FieldMayBeFinal
Field `loadCacheService` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java
    private LmqQueueStore lmqQueueStore;

    private ScheduledThreadPoolExecutor loadCacheService = new ScheduledThreadPoolExecutor(1,
            new ThreadFactoryImpl("loadCache_"));

```

### FieldMayBeFinal
Field `loadStatus` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java
    private AtomicLong rid = new AtomicLong();
    private Map<Queue, QueueEvent> loadEvent = new ConcurrentHashMap<>();
    private Map<Queue, Boolean> loadStatus = new ConcurrentHashMap<>();

    private Cache<Queue, CacheEntry> cache = Caffeine.newBuilder()
```

### FieldMayBeFinal
Field `messageList` may be 'final'
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/loop/QueueCache.java`
#### Snippet
```java
    class CacheEntry {
        private AtomicBoolean loading = new AtomicBoolean(false);
        private List<Message> messageList = new ArrayList<>();
        private volatile long startLoadingT = System.currentTimeMillis();

```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `cfOptionsList` are updated, but never queried
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/rocksdb/RocksDBEngine.java`
#### Snippet
```java
    private DBOptions dbOptions;
    private ColumnFamilyHandle defaultHandle;
    private final List<ColumnFamilyOptions> cfOptionsList = Lists.newArrayList();
    private final List<ColumnFamilyDescriptor> cfDescriptors = Lists.newArrayList();
    private WriteOptions writeOptions;
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
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
            idCache.remove(mqttMsgId);
            if (idCache.isEmpty()) {
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

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `distribution/conf/meta_spring.xml`
#### Snippet
```java
        http://www.springframework.org/schema/task
        classpath:/org/springframework/scheduling/config/spring-task-4.1.xsd"
       default-autowire="byName">

    <context:component-scan base-package="org.apache.rocketmq.mqtt.meta"/>
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `distribution/conf/spring.xml`
#### Snippet
```java
        http://www.springframework.org/schema/task
        classpath:/org/springframework/scheduling/config/spring-task-4.1.xsd"
       default-autowire="byName">

    <context:component-scan base-package="org.apache.rocketmq.mqtt.ds"/>
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `mqttPublishMessage` is redundant
in `mqtt-common/src/main/java/org/apache/rocketmq/mqtt/common/util/MessageUtil.java`
#### Snippet
```java
            retained, 0);
        MqttPublishVariableHeader mqttPublishVariableHeader = new MqttPublishVariableHeader(topicName, mqttId);
        MqttPublishMessage mqttPublishMessage = new MqttPublishMessage(mqttFixedHeader, mqttPublishVariableHeader,
            payload);
        return mqttPublishMessage;
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

### UnnecessaryLocalVariable
Local variable `closure` is redundant
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/rpc/AbstractRpcProcessor.java`
#### Snippet
```java

    public FailoverClosure getFailoverClosure(final RpcContext rpcCtx) {
        FailoverClosure closure = new FailoverClosure() {

            Response data;
```

### UnnecessaryLocalVariable
Local variable `value` is redundant
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/processor/StateProcessor.java`
#### Snippet
```java
        readLock.lock();
        try {
            byte[] value = rocksDBEngine.getRdb().get(key);
            return value;
        } catch (final Exception e) {
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/RocketMQProducer.java`
#### Snippet
```java
    private static Set<String> mapWildCardLmq(String firstTopic, String secondTopic) {
        // todo by yourself
        return new HashSet<>(Arrays.asList(TopicUtils.wrapLmq(firstTopic, "/r/+")));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `mqtt-example/src/main/java/org/apache/rocketmq/mqtt/example/RocketMQProducer.java`
#### Snippet
```java
                ("MQ_" + System.currentTimeMillis() + "_" + i).getBytes(StandardCharsets.UTF_8));
        String secondTopic = "/r1";
        setLmq(msg, new HashSet<>(Arrays.asList(TopicUtils.wrapLmq(firstTopic, secondTopic))));
        SendResult sendResult = producer.send(msg);
        System.out.println(now() + "sendMessage: " + new String(msg.getBody()));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/session/infly/RetryDriver.java`
#### Snippet
```java
        }
        String retryQueue = Subscription.newRetrySubscription(clientId).toQueueName();
        CompletableFuture<StoreResult> result = lmqQueueStore.putMessage(new HashSet<>(Arrays.asList(retryQueue)), message);
        result.whenComplete((storeResult, throwable) -> {
            if (throwable != null) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `message` initializer `null` is redundant
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/meta/RetainedMsgClient.java`
#### Snippet
```java
                        return;
                    }
                    Message message = null;
                    try {
                        message = Message.copyFromStoreMessage(StoreMessage.parseFrom(rsp.getData().toByteArray()));
```

### UnusedAssignment
Variable `willMessage` initializer `null` is redundant
in `mqtt-cs/src/main/java/org/apache/rocketmq/mqtt/cs/protocol/mqtt/handler/MqttConnectHandler.java`
#### Snippet
```java

            // save will message
            WillMessage willMessage = null;
            if (variableHeader.isWillFlag()) {
                if (payload.willTopic() == null || payload.willMessageInBytes() == null) {
```

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

### UnusedAssignment
The value changed at `index++` is never used
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/MqttStateMachine.java`
#### Snippet
```java
                    }
                } catch (Throwable e) {
                    index++;
                    status.setError(RaftError.UNKNOWN, e.toString());
                    Optional.ofNullable(closure).ifPresent(closure1 -> closure1.setThrowable(e));
```

## RuleId[id=UseBulkOperation]
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

## RuleId[id=ConstantValue]
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
Value `messageListener` is always 'null'
in `mqtt-ds/src/main/java/org/apache/rocketmq/mqtt/ds/mq/MqConsumer.java`
#### Snippet
```java
            defaultMQPushConsumer.registerMessageListener((MessageListenerOrderly)messageListener);
        } else {
            defaultMQPushConsumer.registerMessageListener((MessageListenerConcurrently)messageListener);
        }
    }
```

### ConstantValue
Condition `message instanceof ReadRequest` is always `false`
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/MqttStateMachine.java`
#### Snippet
```java
                    }

                    if (message instanceof ReadRequest) {
                        ReadRequest request = (ReadRequest) message;
                        StateProcessor processor = server.getProcessor(request.getCategory());
```

### ConstantValue
Value `message` is always 'null'
in `mqtt-meta/src/main/java/org/apache/rocketmq/mqtt/meta/raft/MqttStateMachine.java`
#### Snippet
```java
                    }

                    if (message instanceof ReadRequest) {
                        ReadRequest request = (ReadRequest) message;
                        StateProcessor processor = server.getProcessor(request.getCategory());
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

