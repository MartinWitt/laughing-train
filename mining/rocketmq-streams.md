# rocketmq-streams 
 
# Bad smells
I found 304 bad smells with 46 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 58 | false |
| UnnecessarySuperQualifier | 40 | false |
| UNUSED_IMPORT | 36 | false |
| UseOfPropertiesAsHashtable | 35 | false |
| SizeReplaceableByIsEmpty | 26 | true |
| ReturnNull | 20 | false |
| UtilityClassWithoutPrivateConstructor | 18 | true |
| SystemOutErr | 13 | false |
| ZeroLengthArrayInitialization | 10 | false |
| RedundantFieldInitialization | 6 | false |
| KeySetIterationMayUseEntrySet | 5 | false |
| AssignmentToLambdaParameter | 5 | false |
| AssignmentToMethodParameter | 4 | false |
| RefusedBequest | 3 | false |
| CatchMayIgnoreException | 3 | false |
| RedundantSuppression | 3 | false |
| DynamicRegexReplaceableByCompiledPattern | 3 | false |
| ReplaceAssignmentWithOperatorAssignment | 3 | false |
| WhileCanBeForeach | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| NonProtectedConstructorInAbstractClass | 2 | true |
| TypeParameterHidesVisibleType | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| MissortedModifiers | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| EmptyMethod | 1 | false |
| EqualsAndHashcode | 1 | false |
| RedundantStringFormatCall | 1 | false |
## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `SessionWindowCount` has only 'static' members, and lacks a 'private' constructor
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/SessionWindowCount.java`
#### Snippet
```java
 * 5、观察输出结果
 */
public class SessionWindowCount {
    public static void main(String[] args) {
        StreamBuilder builder = new StreamBuilder("sessionWindowCount");
```

### UtilityClassWithoutPrivateConstructor
Class `WordCount` has only 'static' members, and lacks a 'private' constructor
in `example/src/main/java/org/apache/rocketmq/streams/examples/WordCount.java`
#### Snippet
```java
import java.util.Properties;

public class WordCount {
    public static void main(String[] args) {
        StreamBuilder builder = new StreamBuilder("wordCount");
```

### UtilityClassWithoutPrivateConstructor
Class `WindowWordCount` has only 'static' members, and lacks a 'private' constructor
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowWordCount.java`
#### Snippet
```java
 * 5、观察输出结果
 */
public class WindowWordCount {
    public static void main(String[] args) {
        StreamBuilder builder = new StreamBuilder("windowWordCount");
```

### UtilityClassWithoutPrivateConstructor
Class `Demo` has only 'static' members, and lacks a 'private' constructor
in `example/src/main/java/org/apache/rocketmq/streams/examples/pojo/Demo.java`
#### Snippet
```java
 * 5、观察输出结果
 */
public class Demo {
    public static void main(String[] args) {
        StreamBuilder builder = new StreamBuilder("demo");
```

### UtilityClassWithoutPrivateConstructor
Class `JoinWithoutWindow` has only 'static' members, and lacks a 'private' constructor
in `example/src/main/java/org/apache/rocketmq/streams/examples/joinWindow/JoinWithoutWindow.java`
#### Snippet
```java
import java.util.Properties;

public class JoinWithoutWindow {
    public static void main(String[] args) {
        StreamBuilder builder = new StreamBuilder("JoinWithoutWindow");
```

### UtilityClassWithoutPrivateConstructor
Class `RocketMQUtil` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/rocketmq/streams/core/util/RocketMQUtil.java`
#### Snippet
```java
import java.util.Set;

public class RocketMQUtil {
    private static final Logger logger = LoggerFactory.getLogger(RocketMQUtil.class.getName());

```

### UtilityClassWithoutPrivateConstructor
Class `OperatorNameMaker` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/rocketmq/streams/core/util/OperatorNameMaker.java`
#### Snippet
```java
import java.util.concurrent.atomic.AtomicInteger;

public class OperatorNameMaker {
    public static final String SOURCE_PREFIX = "ROCKETMQ-SOURCE";
    public static final String SHUFFLE_SOURCE_PREFIX = "ROCKETMQ-SHUFFLE-SOURCE";
```

### UtilityClassWithoutPrivateConstructor
Class `WindowSum` has only 'static' members, and lacks a 'private' constructor
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowSum.java`
#### Snippet
```java
 * 5、观察输出结果
 */
public class WindowSum {
    public static void main(String[] args) {
        StreamBuilder builder = new StreamBuilder("windowSumGrade");
```

### UtilityClassWithoutPrivateConstructor
Class `SlideWindowCount` has only 'static' members, and lacks a 'private' constructor
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/SlideWindowCount.java`
#### Snippet
```java
 * 5、观察输出结果
 */
public class SlideWindowCount {
    public static void main(String[] args) {
        StreamBuilder builder = new StreamBuilder("slideWindowCount");
```

### UtilityClassWithoutPrivateConstructor
Class `WindowCount` has only 'static' members, and lacks a 'private' constructor
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowCount.java`
#### Snippet
```java
 * 5、观察输出结果
 */
public class WindowCount {
    public static void main(String[] args) {
        StreamBuilder builder = new StreamBuilder("windowCountUser");
```

### UtilityClassWithoutPrivateConstructor
Class `WindowAvg` has only 'static' members, and lacks a 'private' constructor
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowAvg.java`
#### Snippet
```java
 * 5、观察输出结果
 */
public class WindowAvg {
    public static void main(String[] args) {
        StreamBuilder builder = new StreamBuilder("WindowAvg");
```

### UtilityClassWithoutPrivateConstructor
Class `StreamConfig` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/rocketmq/streams/core/metadata/StreamConfig.java`
#### Snippet
```java
 */

public class StreamConfig {
    public static final String TIME_TYPE = "timeType";
    public static final String ALLOW_LATENESS_MILLISECOND = "allowLatenessMillisecond";
```

### UtilityClassWithoutPrivateConstructor
Class `WordCountSink` has only 'static' members, and lacks a 'private' constructor
in `example/src/main/java/org/apache/rocketmq/streams/examples/sink/WordCountSink.java`
#### Snippet
```java
 * 5、观察输出结果
 */
public class WordCountSink {
    public static void main(String[] args) {
        StreamBuilder builder = new StreamBuilder("wordCount");
```

### UtilityClassWithoutPrivateConstructor
Class `WindowMin` has only 'static' members, and lacks a 'private' constructor
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowMin.java`
#### Snippet
```java
 * 5、观察输出结果
 */
public class WindowMin {
    public static void main(String[] args) {
        StreamBuilder builder = new StreamBuilder("windowMinGrade");
```

### UtilityClassWithoutPrivateConstructor
Class `Constant` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/rocketmq/streams/core/common/Constant.java`
#### Snippet
```java
import java.nio.charset.StandardCharsets;

public class Constant {

    public static final String SHUFFLE_KEY_CLASS_NAME = "shuffle.key.class.name";
```

### UtilityClassWithoutPrivateConstructor
Class `WindowBuilder` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowBuilder.java`
#### Snippet
```java


public class WindowBuilder {

    public static WindowInfo tumblingWindow(Time size) {
```

### UtilityClassWithoutPrivateConstructor
Class `JoinWindow` has only 'static' members, and lacks a 'private' constructor
in `example/src/main/java/org/apache/rocketmq/streams/examples/joinWindow/JoinWindow.java`
#### Snippet
```java
 * 5、观察输出结果
 */
public class JoinWindow {
    public static void main(String[] args) {
        StreamBuilder builder = new StreamBuilder("joinWindow");
```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/rocketmq/streams/core/util/Utils.java`
#### Snippet
```java
import java.util.Date;

public class Utils {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    public static final String pattern = "%s@%s@%s";
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/JoinWindowFire.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private <K> Data<K, Object> convert(Data<?, ?> data) {
        return (Data<K, Object>) new Data<>(data.getKey(), data.getValue(), data.getTimestamp(), data.getHeader());
    }
```

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AccumulatorSessionWindowFire.java`
#### Snippet
```java

            Iterator<Pair<WindowKey, WindowState<K, Accumulator<R, OV>>>> iterator = pairs.iterator();
            while (iterator.hasNext()) {
                Pair<WindowKey, WindowState<K, Accumulator<R, OV>>> pair = iterator.next();
                WindowKey windowKey = pair.getKey();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AggregateSessionWindowFire.java`
#### Snippet
```java

            Iterator<Pair<WindowKey, WindowState<K, OV>>> iterator = pairs.iterator();
            while (iterator.hasNext()) {
                Pair<WindowKey, WindowState<K, OV>> pair = iterator.next();
                WindowKey windowKey = pair.getKey();
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/accumulator/CountAccumulator.java`
#### Snippet
```java

    @Override
    public Accumulator<V, Integer> clone() {
        CountAccumulator<V> accumulator = new CountAccumulator<>();
        accumulator.count = this.count;
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/accumulator/MinAccumulator.java`
#### Snippet
```java

    @Override
    public Accumulator<V, Double> clone() {
        return new MinAccumulator<>();
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/accumulator/AvgAccumulator.java`
#### Snippet
```java

    @Override
    public Accumulator<V, Double> clone() {
        return new AvgAccumulator<>();
    }
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `source2Group.keySet()` may be replaced with 'values()' iteration
in `core/src/main/java/org/apache/rocketmq/streams/core/topology/TopologyBuilder.java`
#### Snippet
```java
            source2Group.get(parentName).add(name);
        } else {
            for (String sourceName : source2Group.keySet()) {
                List<String> subsequentProcessor = source2Group.get(sourceName);
                if (subsequentProcessor.contains(parentName)) {
```

### KeySetIterationMayUseEntrySet
Iteration over `recover.keySet()` may be replaced with 'entrySet()' iteration
in `core/src/main/java/org/apache/rocketmq/streams/core/state/AbstractStore.java`
#### Snippet
```java

        public String whichStateTopicQueueBelongTo(byte[] key) {
            for (String uniqueQueue : recover.keySet()) {
                for (byte[] tempKeyByte : recover.get(uniqueQueue)) {
                    if (Arrays.equals(tempKeyByte, key)) {
```

### KeySetIterationMayUseEntrySet
Iteration over `calculating.keySet()` may be replaced with 'entrySet()' iteration
in `core/src/main/java/org/apache/rocketmq/streams/core/state/AbstractStore.java`
#### Snippet
```java
            }

            for (String uniqueQueue : calculating.keySet()) {
                for (byte[] tempKeyByte : calculating.get(uniqueQueue)) {
                    if (Arrays.equals(tempKeyByte, key)) {
```

### KeySetIterationMayUseEntrySet
Iteration over `groupByQueueId.keySet()` may be replaced with 'values()' iteration
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
        Map<String/*brokerName@topic@queueId of state topic*/, List<MessageExt>> groupByQueueId = msgs.stream().parallel().collect(Collectors.groupingBy(this::buildKey));

        for (String uniqueQueue : groupByQueueId.keySet()) {
            List<MessageExt> messageExts = groupByQueueId.get(uniqueQueue);
            Map<String/*K的hashcode，真正的key在body里面*/, List<MessageExt>> groupByKeyHashcode = messageExts.stream().parallel().collect(Collectors.groupingBy(MessageExt::getKeys));
```

### KeySetIterationMayUseEntrySet
Iteration over `groupByKeyHashcode.keySet()` may be replaced with 'values()' iteration
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
            Map<String/*K的hashcode，真正的key在body里面*/, List<MessageExt>> groupByKeyHashcode = messageExts.stream().parallel().collect(Collectors.groupingBy(MessageExt::getKeys));

            for (String keyHashcode : groupByKeyHashcode.keySet()) {
                //相同brokerName@topic@queueId + keyHashcode 在一次拉取中的所有数据
                List<MessageExt> exts = groupByKeyHashcode.get(keyHashcode);
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `PlanetaryEngine` on 'this' is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/running/WorkerThread.java`
#### Snippet
```java
            this.wrapper.setRecoverHandler((addQueue, removeQueue) -> {
                try {
                    PlanetaryEngine.this.stateStore.recover(addQueue, removeQueue);
                    return null;
                } catch (Throwable e) {
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
                try {
                    logger.debug("recover state, key: " + new String(key, StandardCharsets.UTF_8) + ", stateTopicQueue: " + stateTopicQueue);
                } catch (Throwable t) {
                }

```

### CatchMayIgnoreException
Empty `catch` block
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
        try {
            future.get(100, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException e) {
        }
    }
```

### CatchMayIgnoreException
Empty `catch` block
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
        try {
            future.get(100, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException e) {
        }
    }
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`clusters.size() == 0` can be replaced with 'clusters.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/util/RocketMQUtil.java`
#### Snippet
```java
        }

        if (clusters == null || clusters.size() == 0) {
            clusters = getCluster(mqAdmin);
        }
```

### SizeReplaceableByIsEmpty
`clusters.size() == 0` can be replaced with 'clusters.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/util/RocketMQUtil.java`
#### Snippet
```java
        }

        if (clusters == null || clusters.size() == 0) {
            clusters = getCluster(mqAdmin);
        }
```

### SizeReplaceableByIsEmpty
`keySet.size() == 0` can be replaced with 'keySet.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/state/AbstractStore.java`
#### Snippet
```java
                    if (keySet != null) {
                        keySet.removeIf(rocksDBKey -> Arrays.equals(rocksDBKey, key));
                        if (keySet.size() == 0) {
                            iterator.remove();
                        }
```

### SizeReplaceableByIsEmpty
`keySet.size() == 0` can be replaced with 'keySet.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/state/AbstractStore.java`
#### Snippet
```java
                    if (keySet != null) {
                        keySet.removeIf(rocksDBKey -> Arrays.equals(rocksDBKey, key));
                        if (keySet.size() == 0) {
                            iterator.remove();
                        }
```

### SizeReplaceableByIsEmpty
`messageQueues.size() == 0` can be replaced with 'messageQueues.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/state/AbstractStore.java`
#### Snippet
```java

    protected Set<MessageQueue> convertSourceTopicQueue2StateTopicQueue(Set<MessageQueue> messageQueues) {
        if (messageQueues == null || messageQueues.size() == 0) {
            return new HashSet<>();
        }
```

### SizeReplaceableByIsEmpty
`windowStateBytes.size() == 0` can be replaced with 'windowStateBytes.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowStore.java`
#### Snippet
```java
    private List<Pair<WindowKey, WindowState<K, V>>> deserializerState(List<Pair<byte[], byte[]>> windowStateBytes) throws Throwable {
        List<Pair<WindowKey, WindowState<K, V>>> result = new ArrayList<>();
        if (windowStateBytes == null || windowStateBytes.size() == 0) {
            return result;
        }
```

### SizeReplaceableByIsEmpty
`set.size() != 0` can be replaced with '!set.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/running/WorkerThread.java`
#### Snippet
```java

        void doCommit(HashSet<MessageQueue> set) throws Throwable {
            if ((System.currentTimeMillis() - lastCommit > commitInterval) && set.size() != 0) {

                this.stateStore.persist(set);
```

### SizeReplaceableByIsEmpty
`msgs.size() == 0` can be replaced with 'msgs.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
    // 能保证一个q里面后面pull到的数据queueOffset一定比前一批次拉取的queueOffset大吗？
    private void replayState(List<MessageExt> msgs) throws Throwable {
        if (msgs == null || msgs.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`result.size() != 0` can be replaced with '!result.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
        //recover
        List<MessageExt> result = consumer.poll(50);
        while (result != null && result.size() != 0) {
            holder.addAll(result);
            if (holder.size() <= 1000) {
```

### SizeReplaceableByIsEmpty
`holder.size() != 0` can be replaced with '!holder.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
            result = consumer.poll(50);
        }
        if (holder.size() != 0) {
            replayState(holder);
        }
```

### SizeReplaceableByIsEmpty
`addQueues.size() == 0` can be replaced with 'addQueues.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java

    public void loadState(Set<MessageQueue> addQueues) throws Throwable {
        if (addQueues == null || addQueues.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`messageQueues.size() == 0` can be replaced with 'messageQueues.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
    @Override
    public void persist(Set<MessageQueue> messageQueues) throws Throwable {
        if (messageQueues == null || messageQueues.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`keySet.size() == 0` can be replaced with 'keySet.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
            Set<byte[]> keySet = super.getInCalculating(stateTopicQueueKey);

            if (keySet == null || keySet.size() == 0) {
                return;
            }
```

### SizeReplaceableByIsEmpty
`removeQueues.size() == 0` can be replaced with 'removeQueues.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java

    public void removeState(Set<MessageQueue> removeQueues) throws Throwable {
        if (removeQueues == null || removeQueues.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`removeQueues.size() == 0` can be replaced with 'removeQueues.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
        Future<?> future = this.executor.submit(() -> {
            try {
                if (removeQueues.size() == 0) {
                    return;
                }
```

### SizeReplaceableByIsEmpty
`target.size() == 0` can be replaced with 'target.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java

    private List<MessageExt> sortByQueueOffset(List<MessageExt> target) {
        if (target == null || target.size() == 0) {
            return new ArrayList<>();
        }
```

### SizeReplaceableByIsEmpty
`pairs.size() == 0` can be replaced with 'pairs.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
            List<Pair<WindowKey, WindowState<K, OV>>> pairs = this.windowStore.searchMatchKeyPrefix(name);

            if (pairs.size() == 0) {
                return new Pair<>(dataTime, dataTime + windowInfo.getSessionTimeout().toMilliseconds());
            }
```

### SizeReplaceableByIsEmpty
`pairs.size() == 0` can be replaced with 'pairs.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
            }

            if (pairs.size() == 0 || createNewSessionWindow) {
                return new Pair<>(lastStateSessionEnd, dataTime + windowInfo.getSessionTimeout().toMilliseconds());
            }
```

### SizeReplaceableByIsEmpty
`pairs.size() == 0` can be replaced with 'pairs.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
            List<Pair<WindowKey, WindowState<K, Accumulator<R, OV>>>> pairs = this.windowStore.searchMatchKeyPrefix(name);

            if (pairs.size() == 0) {
                return new Pair<>(dataTime, dataTime + windowInfo.getSessionTimeout().toMilliseconds());
            }
```

### SizeReplaceableByIsEmpty
`pairs.size() == 0` can be replaced with 'pairs.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
            }

            if (pairs.size() == 0 || createNewSessionWindow) {
                return new Pair<>(lastStateSessionEnd, dataTime + windowInfo.getSessionTimeout().toMilliseconds());
            }
```

### SizeReplaceableByIsEmpty
`leftPairs.size() != 0` can be replaced with '!leftPairs.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/JoinWindowFire.java`
#### Snippet
```java
            String leftWindow = Utils.buildKey(operatorName, StreamType.LEFT_STREAM.name());
            List<Pair<WindowKey, WindowState<K, V1>>> leftPairs = this.leftWindowStore.searchLessThanWatermark(leftWindow, watermark);
            if (leftPairs.size() != 0) {
                for (Pair<WindowKey, WindowState<K, V1>> leftPair : leftPairs) {
                    logger.debug("search with key prefix:{} and watermark:{}, find window: {}", leftWindow, Utils.format(watermark), leftPair.getKey());
```

### SizeReplaceableByIsEmpty
`rightPairs.size() != 0` can be replaced with '!rightPairs.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/JoinWindowFire.java`
#### Snippet
```java
            String rightWindow = Utils.buildKey(operatorName, StreamType.RIGHT_STREAM.name());
            List<Pair<WindowKey, WindowState<K, V2>>> rightPairs = this.rightWindowStore.searchLessThanWatermark(rightWindow, watermark);
            if (rightPairs.size() != 0) {
                for (Pair<WindowKey, WindowState<K, V2>> rightPair : rightPairs) {
                    logger.debug("search with key prefix:{} and watermark:{}, find window: {}", rightWindow, Utils.format(watermark), rightPair.getKey());
```

### SizeReplaceableByIsEmpty
`leftPairs.size() == 0` can be replaced with 'leftPairs.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/JoinWindowFire.java`
#### Snippet
```java
            }

            if (leftPairs.size() == 0 && rightPairs.size() == 0) {
                logger.debug("left window and right window are all empty, watermark:{}." +
                        "left window operatorName:{}, right window operatorName:{}", Utils.format(watermark), leftWindow, rightWindow);
```

### SizeReplaceableByIsEmpty
`rightPairs.size() == 0` can be replaced with 'rightPairs.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/JoinWindowFire.java`
#### Snippet
```java
            }

            if (leftPairs.size() == 0 && rightPairs.size() == 0) {
                logger.debug("left window and right window are all empty, watermark:{}." +
                        "left window operatorName:{}, right window operatorName:{}", Utils.format(watermark), leftWindow, rightWindow);
```

### SizeReplaceableByIsEmpty
`leftPairs.size() != 0` can be replaced with '!leftPairs.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/JoinWindowFire.java`
#### Snippet
```java
            }

            if (leftPairs.size() != 0) {
                logger.debug("delete left window.");
                for (Pair<WindowKey, WindowState<K, V1>> leftPair : leftPairs) {
```

### SizeReplaceableByIsEmpty
`rightPairs.size() != 0` can be replaced with '!rightPairs.isEmpty()'
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/JoinWindowFire.java`
#### Snippet
```java
            }

            if (rightPairs.size() != 0) {
                logger.debug("delete right window.");
                for (Pair<WindowKey, WindowState<K, V2>> rightPair : rightPairs) {
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowKey.java`
#### Snippet
```java

    public String getKeyAndWindow() {
        StringBuilder builder = new StringBuilder();
        builder.append(windowStart)
                .append(WindowKey.SPLIT)
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowKey.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(operatorName)
                .append(WindowKey.SPLIT)
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Processor`
in `core/src/main/java/org/apache/rocketmq/streams/core/topology/real/SourceFactory.java`
#### Snippet
```java
    private final Supplier<Processor<T>> supplier;

    public SourceFactory(String name, String topic, Supplier<Processor<T>> supplier) {
        this.name = name;
        this.topic = topic;
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/MultiValueChangeSupplier.java`
#### Snippet
```java
        private final ValueMapperAction<T, ? extends Iterable<? extends VR>> valueMapperAction;

        public MultiValueMapperProcessor(ValueMapperAction<T, ? extends Iterable<? extends VR>> valueMapperAction) {
            this.valueMapperAction = valueMapperAction;
        }
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/ForeachSupplier.java`
#### Snippet
```java
        private ForeachAction<T> foreachAction;

        public ForeachProcessor(ForeachAction<T> foreachAction) {
            this.foreachAction = foreachAction;
        }
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/ValueChangeSupplier.java`
#### Snippet
```java


        public ValueMapperProcessor(ValueMapperAction<T, O> valueMapperAction) {
            this.valueMapperAction = valueMapperAction;
        }
```

### BoundedWildcard
Can generalize to `? extends O`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/ValueChangeSupplier.java`
#### Snippet
```java


        public ValueMapperProcessor(ValueMapperAction<T, O> valueMapperAction) {
            this.valueMapperAction = valueMapperAction;
        }
```

### BoundedWildcard
Can generalize to `? super Long`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AbstractWindowFire.java`
#### Snippet
```java
    public AbstractWindowFire(StreamContext<V> context,
                              MessageQueue stateTopicMessageQueue,
                              BiFunction<Long, MessageQueue, Long> commitWatermark) {
        this.context = context;
        this.stateTopicMessageQueue = stateTopicMessageQueue;
```

### BoundedWildcard
Can generalize to `? super MessageQueue`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AbstractWindowFire.java`
#### Snippet
```java
    public AbstractWindowFire(StreamContext<V> context,
                              MessageQueue stateTopicMessageQueue,
                              BiFunction<Long, MessageQueue, Long> commitWatermark) {
        this.context = context;
        this.stateTopicMessageQueue = stateTopicMessageQueue;
```

### BoundedWildcard
Can generalize to `? super V1`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinAggregateSupplier.java`
#### Snippet
```java


        public JoinStreamAggregateProcessor(String name, JoinType joinType, ValueJoinAction<V1, V2, OUT> joinAction) {
            this.name = name;
            this.joinType = joinType;
```

### BoundedWildcard
Can generalize to `? super V2`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinAggregateSupplier.java`
#### Snippet
```java


        public JoinStreamAggregateProcessor(String name, JoinType joinType, ValueJoinAction<V1, V2, OUT> joinAction) {
            this.name = name;
            this.joinType = joinType;
```

### BoundedWildcard
Can generalize to `? extends OUT`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinAggregateSupplier.java`
#### Snippet
```java


        public JoinStreamAggregateProcessor(String name, JoinType joinType, ValueJoinAction<V1, V2, OUT> joinAction) {
            this.name = name;
            this.joinType = joinType;
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/FilterSupplier.java`
#### Snippet
```java
        private final FilterAction<T> filterAction;

        public FilterProcessor(FilterAction<T> filterAction) {
            this.filterAction = filterAction;
        }
```

### BoundedWildcard
Can generalize to `? extends Processor`
in `core/src/main/java/org/apache/rocketmq/streams/core/topology/TopologyBuilder.java`
#### Snippet
```java


    public <T> void addRealSink(String name, String parentName, String topicName, Supplier<Processor<T>> supplier) {
        SinkFactory<T> sinkFactory = new SinkFactory<>(name, supplier);
        realNodeFactory.put(name, sinkFactory);
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/WindowStreamImpl.java`
#### Snippet
```java

    @Override
    public <OUT> WindowStream<K, OUT> aggregate(Accumulator<V, OUT> accumulator) {
        String name = OperatorNameMaker.makeName(AGGREGATE_PREFIX, pipeline.getJobId());

```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/WindowStreamImpl.java`
#### Snippet
```java
    }

    @Override public WindowStream<K, V> max(SelectAction<? extends Number, V> selectAction) {
        String name = OperatorNameMaker.makeName(MAX_PREFIX, pipeline.getJobId());

```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/WindowStreamImpl.java`
#### Snippet
```java
    }

    @Override public WindowStream<K, V> min(SelectAction<? extends Number, V> selectAction) {
        String name = OperatorNameMaker.makeName(MIN_PREFIX, pipeline.getJobId());

```

### BoundedWildcard
Can generalize to `? extends MessageQueue`
in `core/src/main/java/org/apache/rocketmq/streams/core/state/AbstractStore.java`
#### Snippet
```java
    }

    protected Set<MessageQueue> convertSourceTopicQueue2StateTopicQueue(Set<MessageQueue> messageQueues) {
        if (messageQueues == null || messageQueues.size() == 0) {
            return new HashSet<>();
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/GroupedStreamImpl.java`
#### Snippet
```java

    @Override
    public GroupedStream<K, V> max(SelectAction<? extends Number, V> selectAction) {
        String name = OperatorNameMaker.makeName(MAX_PREFIX, pipeline.getJobId());
        Supplier<Processor<V>> supplier = new AggregateSupplier<>(name, parent.getName(), () -> null, (AggregateAction<K, V, V>) (key, value, accumulator) -> {
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/GroupedStreamImpl.java`
#### Snippet
```java

    @Override
    public <OUT> GroupedStream<K, OUT> aggregate(Accumulator<V, OUT> accumulator) {
        String name = OperatorNameMaker.makeName(ACCUMULATE_PREFIX, pipeline.getJobId());
        Supplier<Processor<V>> supplier = new AccumulatorSupplier<>(name, parent.getName(), value -> value, accumulator);
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/GroupedStreamImpl.java`
#### Snippet
```java

    @Override
    public GroupedStream<K, V> min(SelectAction<? extends Number, V> selectAction) {
        String name = OperatorNameMaker.makeName(MIN_PREFIX, pipeline.getJobId());

```

### BoundedWildcard
Can generalize to `? extends V`
in `core/src/main/java/org/apache/rocketmq/streams/core/running/StreamContextImpl.java`
#### Snippet
```java

    @Override
    public <K> void forward(Data<K, V> data) throws Throwable {
        this.key = data.getKey();

```

### BoundedWildcard
Can generalize to `? extends Processor`
in `core/src/main/java/org/apache/rocketmq/streams/core/running/StreamContextImpl.java`
#### Snippet
```java

    @Override
    public void init(List<Processor<V>> childrenProcessors) {
        this.childList.clear();
        if (childrenProcessors != null) {
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowStore.java`
#### Snippet
```java
    }

    private List<Pair<WindowKey, WindowState<K, V>>> deserializerState(List<Pair<byte[], byte[]>> windowStateBytes) throws Throwable {
        List<Pair<WindowKey, WindowState<K, V>>> result = new ArrayList<>();
        if (windowStateBytes == null || windowStateBytes.size() == 0) {
```

### BoundedWildcard
Can generalize to `? extends WindowState`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowStore.java`
#### Snippet
```java

    public WindowStore(StateStore stateStore,
                       ValueMapperAction<byte[], WindowState<K, V>> bytes2State,
                       ValueMapperAction<WindowState<K, V>, byte[]> state2Bytes) {
        this.stateStore = stateStore;
```

### BoundedWildcard
Can generalize to `? super WindowState`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowStore.java`
#### Snippet
```java
    public WindowStore(StateStore stateStore,
                       ValueMapperAction<byte[], WindowState<K, V>> bytes2State,
                       ValueMapperAction<WindowState<K, V>, byte[]> state2Bytes) {
        this.stateStore = stateStore;
        this.bytes2State = bytes2State;
```

### BoundedWildcard
Can generalize to `? extends MessageQueue`
in `core/src/main/java/org/apache/rocketmq/streams/core/running/MessageQueueListenerWrapper.java`
#### Snippet
```java
    }

    private void removeTask(Set<MessageQueue> removeQueues) {
        for (MessageQueue removeQueue : removeQueues) {
            String key = Utils.buildKey(removeQueue.getBrokerName(), removeQueue.getTopic(), removeQueue.getQueueId());
```

### BoundedWildcard
Can generalize to `? extends MessageQueue`
in `core/src/main/java/org/apache/rocketmq/streams/core/running/MessageQueueListenerWrapper.java`
#### Snippet
```java


    private void buildTask(Set<MessageQueue> addQueues) {
        for (MessageQueue messageQueue : addQueues) {
            String key = Utils.buildKey(messageQueue.getBrokerName(), messageQueue.getTopic(), messageQueue.getQueueId());
```

### BoundedWildcard
Can generalize to `? super Set`
in `core/src/main/java/org/apache/rocketmq/streams/core/running/MessageQueueListenerWrapper.java`
#### Snippet
```java
    }

    public void setRecoverHandler(BiFunction<Set<MessageQueue>, Set<MessageQueue>, Throwable> handler) {
        this.recoverHandler = handler;
    }
```

### BoundedWildcard
Can generalize to `? super Set`
in `core/src/main/java/org/apache/rocketmq/streams/core/running/MessageQueueListenerWrapper.java`
#### Snippet
```java
    }

    public void setRecoverHandler(BiFunction<Set<MessageQueue>, Set<MessageQueue>, Throwable> handler) {
        this.recoverHandler = handler;
    }
```

### BoundedWildcard
Can generalize to `? extends Throwable`
in `core/src/main/java/org/apache/rocketmq/streams/core/running/MessageQueueListenerWrapper.java`
#### Snippet
```java
    }

    public void setRecoverHandler(BiFunction<Set<MessageQueue>, Set<MessageQueue>, Throwable> handler) {
        this.recoverHandler = handler;
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/TimestampSelectorSupplier.java`
#### Snippet
```java
        private final ValueMapperAction<T, Long> valueMapperAction;

        public TimestampSelector(ValueMapperAction<T, Long> valueMapperAction) {
            this.valueMapperAction = valueMapperAction;
        }
```

### BoundedWildcard
Can generalize to `? extends KEY`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/KeySelectSupplier.java`
#### Snippet
```java


        public MapperProcessor(SelectAction<KEY, T> selectAction) {
            this.selectAction = selectAction;
        }
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/KeySelectSupplier.java`
#### Snippet
```java


        public MapperProcessor(SelectAction<KEY, T> selectAction) {
            this.selectAction = selectAction;
        }
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/SumAggregate.java`
#### Snippet
```java
    private final SelectAction<? extends Number, V> selectAction;

    public SumAggregate(SelectAction<? extends Number, V> selectAction) {
        this.selectAction = selectAction;
    }
```

### BoundedWildcard
Can generalize to `? extends OV`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AggregateSupplier.java`
#### Snippet
```java
        private MessageQueue stateTopicMessageQueue;

        public AggregateProcessor(String currentName, String parentName, Supplier<OV> initAction,
                                  AggregateAction<K, V, OV> aggregateAction) {
            this.currentName = currentName;
```

### BoundedWildcard
Can generalize to `? super K`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AggregateSupplier.java`
#### Snippet
```java

        public AggregateProcessor(String currentName, String parentName, Supplier<OV> initAction,
                                  AggregateAction<K, V, OV> aggregateAction) {
            this.currentName = currentName;
            this.parentName = parentName;
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AggregateSupplier.java`
#### Snippet
```java

        public AggregateProcessor(String currentName, String parentName, Supplier<OV> initAction,
                                  AggregateAction<K, V, OV> aggregateAction) {
            this.currentName = currentName;
            this.parentName = parentName;
```

### BoundedWildcard
Can generalize to `? extends R`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AccumulatorSupplier.java`
#### Snippet
```java
        private Accumulator<R, OV> accumulator;

        public AccumulatorProcessor(String currentName, String parentName, SelectAction<R, V> selectAction, Accumulator<R, OV> accumulator) {
            this.currentName = currentName;
            this.parentName = parentName;
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AccumulatorSupplier.java`
#### Snippet
```java
        private Accumulator<R, OV> accumulator;

        public AccumulatorProcessor(String currentName, String parentName, SelectAction<R, V> selectAction, Accumulator<R, OV> accumulator) {
            this.currentName = currentName;
            this.parentName = parentName;
```

### BoundedWildcard
Can generalize to `? super K`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/SinkSupplier.java`
#### Snippet
```java
        private K key;

        public SinkProcessor(String topicName, KeyValueSerializer<K, T> serializer) {
            this.topicName = topicName;
            this.serializer = serializer;
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/SinkSupplier.java`
#### Snippet
```java
        private K key;

        public SinkProcessor(String topicName, KeyValueSerializer<K, T> serializer) {
            this.topicName = topicName;
            this.serializer = serializer;
```

### BoundedWildcard
Can generalize to `? extends MessageExt`
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
    //拉的数据越多，重放效率越高,
    // 能保证一个q里面后面pull到的数据queueOffset一定比前一批次拉取的queueOffset大吗？
    private void replayState(List<MessageExt> msgs) throws Throwable {
        if (msgs == null || msgs.size() == 0) {
            return;
```

### BoundedWildcard
Can generalize to `? extends WindowKey`
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocksDBStore.java`
#### Snippet
```java
    public List<Pair<byte[], byte[]>> searchStateLessThanWatermark(String name,
                                                                   long lessThanThisTime,
                                                                   ValueMapperAction<byte[], WindowKey> deserializer) throws Throwable {
        readOptions = new ReadOptions();
        readOptions.setPrefixSameAsStart(true).setTotalOrderSeek(true);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocksDBStore.java`
#### Snippet
```java

    public List<Pair<String, byte[]>> searchByKeyPrefix(String keyPrefix,
                                                        ValueMapperAction<String, byte[]> string2Bytes,
                                                        ValueMapperAction<byte[], String> byte2String) throws Throwable {
        readOptions = new ReadOptions();
```

### BoundedWildcard
Can generalize to `? extends OV`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
        private final AtomicReference<Throwable> errorReference = new AtomicReference<>(null);

        public WindowAggregateProcessor(String name, WindowInfo windowInfo, Supplier<OV> initAction, AggregateAction<K, V, OV> aggregateAction) {
            this.name = String.join(Constant.SPLIT, name, WindowAggregateProcessor.class.getSimpleName());
            this.windowInfo = windowInfo;
```

### BoundedWildcard
Can generalize to `? super K`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
        private final AtomicReference<Throwable> errorReference = new AtomicReference<>(null);

        public WindowAggregateProcessor(String name, WindowInfo windowInfo, Supplier<OV> initAction, AggregateAction<K, V, OV> aggregateAction) {
            this.name = String.join(Constant.SPLIT, name, WindowAggregateProcessor.class.getSimpleName());
            this.windowInfo = windowInfo;
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
        private final AtomicReference<Throwable> errorReference = new AtomicReference<>(null);

        public WindowAggregateProcessor(String name, WindowInfo windowInfo, Supplier<OV> initAction, AggregateAction<K, V, OV> aggregateAction) {
            this.name = String.join(Constant.SPLIT, name, WindowAggregateProcessor.class.getSimpleName());
            this.windowInfo = windowInfo;
```

### BoundedWildcard
Can generalize to `? extends OV`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java


        public SessionWindowAggregateProcessor(String name, WindowInfo windowInfo, Supplier<OV> initAction, AggregateAction<K, V, OV> aggregateAction) {
            this.name = String.join(Constant.SPLIT, name, SessionWindowAggregateProcessor.class.getSimpleName());
            this.windowInfo = windowInfo;
```

### BoundedWildcard
Can generalize to `? super K`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java


        public SessionWindowAggregateProcessor(String name, WindowInfo windowInfo, Supplier<OV> initAction, AggregateAction<K, V, OV> aggregateAction) {
            this.name = String.join(Constant.SPLIT, name, SessionWindowAggregateProcessor.class.getSimpleName());
            this.windowInfo = windowInfo;
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java


        public SessionWindowAggregateProcessor(String name, WindowInfo windowInfo, Supplier<OV> initAction, AggregateAction<K, V, OV> aggregateAction) {
            this.name = String.join(Constant.SPLIT, name, SessionWindowAggregateProcessor.class.getSimpleName());
            this.windowInfo = windowInfo;
```

### BoundedWildcard
Can generalize to `? extends R`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
        private WindowStore<K, Accumulator<R, OV>> windowStore;

        public SessionWindowAccumulatorProcessor(String name, WindowInfo windowInfo, SelectAction<R, V> selectAction, Accumulator<R, OV> accumulator) {
            this.name = String.join(Constant.SPLIT, name, SessionWindowAccumulatorProcessor.class.getSimpleName());
            this.windowInfo = windowInfo;
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
        private WindowStore<K, Accumulator<R, OV>> windowStore;

        public SessionWindowAccumulatorProcessor(String name, WindowInfo windowInfo, SelectAction<R, V> selectAction, Accumulator<R, OV> accumulator) {
            this.name = String.join(Constant.SPLIT, name, SessionWindowAccumulatorProcessor.class.getSimpleName());
            this.windowInfo = windowInfo;
```

### BoundedWildcard
Can generalize to `? extends R`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
        private final AtomicReference<Throwable> errorReference = new AtomicReference<>(null);

        public WindowAccumulatorProcessor(String name, WindowInfo windowInfo, SelectAction<R, V> selectAction, Accumulator<R, OV> accumulator) {
            this.name = String.join(Constant.SPLIT, name, WindowAccumulatorProcessor.class.getSimpleName());
            this.windowInfo = windowInfo;
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
        private final AtomicReference<Throwable> errorReference = new AtomicReference<>(null);

        public WindowAccumulatorProcessor(String name, WindowInfo windowInfo, SelectAction<R, V> selectAction, Accumulator<R, OV> accumulator) {
            this.name = String.join(Constant.SPLIT, name, WindowAccumulatorProcessor.class.getSimpleName());
            this.windowInfo = windowInfo;
```

### BoundedWildcard
Can generalize to `? super V1`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/JoinWindowFire.java`
#### Snippet
```java
                          MessageQueue stateTopicMessageQueue,
                          StreamContext<Object> context,
                          ValueJoinAction<V1, V2, OUT> joinAction,
                          WindowStore<K, V1> leftWindowStore,
                          WindowStore<K, V2> rightWindowStore,
```

### BoundedWildcard
Can generalize to `? super V2`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/JoinWindowFire.java`
#### Snippet
```java
                          MessageQueue stateTopicMessageQueue,
                          StreamContext<Object> context,
                          ValueJoinAction<V1, V2, OUT> joinAction,
                          WindowStore<K, V1> leftWindowStore,
                          WindowStore<K, V2> rightWindowStore,
```

### BoundedWildcard
Can generalize to `? extends OUT`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/JoinWindowFire.java`
#### Snippet
```java
                          MessageQueue stateTopicMessageQueue,
                          StreamContext<Object> context,
                          ValueJoinAction<V1, V2, OUT> joinAction,
                          WindowStore<K, V1> leftWindowStore,
                          WindowStore<K, V2> rightWindowStore,
```

### BoundedWildcard
Can generalize to `? super Long`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/JoinWindowFire.java`
#### Snippet
```java
                          WindowStore<K, V1> leftWindowStore,
                          WindowStore<K, V2> rightWindowStore,
                          BiFunction<Long, MessageQueue, Long> commitWatermark) {
        this.joinType = joinType;
        this.stateTopicMessageQueue = stateTopicMessageQueue;
```

### BoundedWildcard
Can generalize to `? super MessageQueue`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/JoinWindowFire.java`
#### Snippet
```java
                          WindowStore<K, V1> leftWindowStore,
                          WindowStore<K, V2> rightWindowStore,
                          BiFunction<Long, MessageQueue, Long> commitWatermark) {
        this.joinType = joinType;
        this.stateTopicMessageQueue = stateTopicMessageQueue;
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `core/src/main/java/org/apache/rocketmq/streams/core/common/Constant.java`
#### Snippet
```java
    public static final String SHUFFLE_VALUE_CLASS_NAME = "shuffle.value.class.name";

    public final static String STATE_TOPIC_SUFFIX = "-stateTopic";

    public static final String SHUFFLE_TOPIC_SUFFIX = "-shuffleTopic";
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
        //使用前缀查询找到session state, 触发已经session out的 watermark
        @SuppressWarnings("unchecked")
        private Pair<Long/*sessionBegin*/, Long/*sessionEnd*/> fireIfSessionOut(K key, V data, long dataTime, long watermark) throws Throwable {
            List<Pair<WindowKey, WindowState<K, Accumulator<R, OV>>>> pairs = this.windowStore.searchMatchKeyPrefix(name);

```

### RedundantSuppression
Redundant suppression
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
        //使用前缀查询找到session state, 触发已经session out的 watermark
        @SuppressWarnings("unchecked")
        private Pair<Long/*sessionBegin*/, Long/*sessionEnd*/> fireIfSessionOut(K key, V data, long dataTime, long watermark) throws Throwable {
            List<Pair<WindowKey, WindowState<K, OV>>> pairs = this.windowStore.searchMatchKeyPrefix(name);

```

### RedundantSuppression
Redundant suppression
in `core/src/main/java/org/apache/rocketmq/streams/core/running/WorkerThread.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    class PlanetaryEngine<K, V> {
        private final DefaultLitePullConsumer unionConsumer;
        private final DefaultMQProducer producer;
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/PrintSupplier.java`
#### Snippet
```java
                String format = String.format(template, result.getKey(), data.toString());

                System.out.println(format);
            } else {
                String template = "[%s - %s](key=%s, value=%s)";
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/PrintSupplier.java`
#### Snippet
```java

                String format = String.format(template, start, end, this.context.getKey(), data);
                System.out.println(format);
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `example/src/main/java/org/apache/rocketmq/streams/examples/joinWindow/JoinWithoutWindow.java`
#### Snippet
```java
            public Union apply(User value1, Num value2) {
                if (value1 != null && value2 != null) {
                    System.out.println("name in user: " + value1.getName());
                    System.out.println("name in num: " + value2.getName());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `example/src/main/java/org/apache/rocketmq/streams/examples/joinWindow/JoinWithoutWindow.java`
#### Snippet
```java
                if (value1 != null && value2 != null) {
                    System.out.println("name in user: " + value1.getName());
                    System.out.println("name in num: " + value2.getName());

                    return new Union(value1.getName(), value1.getAge(), value2.getNum());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `example/src/main/java/org/apache/rocketmq/streams/examples/joinWindow/JoinWithoutWindow.java`
#### Snippet
```java

                if (value2 != null) {
                    System.out.println("name in num: " + value2.getName());
                    return new Union(value2.getName(), 0, value2.getNum());
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `example/src/main/java/org/apache/rocketmq/streams/examples/joinWindow/JoinWithoutWindow.java`
#### Snippet
```java

                if (value1 != null) {
                    System.out.println("name in num: " + value1.getName());
                    return new Union(value1.getName(), value1.getAge(), 0);
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowAvg.java`
#### Snippet
```java
            Integer num = Integer.parseInt(value);
            return new Pair<>(null, num);
        }).foreach(value -> System.out.println(String.format("time:%s, input:%d", LocalTime.now(), value)))
        .filter(value -> value > 0)
        .keyBy(value -> "key")
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocksDBStore.java`
#### Snippet
```java
        byte[] bytes = rocksDBStore.get(keyBytes);
        Object result = Utils.byte2Object(bytes, Object.class);
        System.out.println(result);

        byte[] bytes2 = rocksDBStore.get(keyBytes2);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocksDBStore.java`
#### Snippet
```java
        byte[] bytes2 = rocksDBStore.get(keyBytes2);
        Object result2 = Utils.byte2Object(bytes2, Object.class);
        System.out.println(result2);

        String keyPrefix = "time@1668249210000";
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `example/src/main/java/org/apache/rocketmq/streams/examples/joinWindow/JoinWindow.java`
#### Snippet
```java
            public Union apply(User value1, Num value2) {
                if (value1 != null && value2 != null) {
                    System.out.println("name in user: " + value1.getName());
                    System.out.println("name in num: " + value2.getName());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `example/src/main/java/org/apache/rocketmq/streams/examples/joinWindow/JoinWindow.java`
#### Snippet
```java
                if (value1 != null && value2 != null) {
                    System.out.println("name in user: " + value1.getName());
                    System.out.println("name in num: " + value2.getName());

                    return new Union(value1.getName(), value1.getAge(), value2.getNum());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `example/src/main/java/org/apache/rocketmq/streams/examples/joinWindow/JoinWindow.java`
#### Snippet
```java

                if (value2 != null) {
                    System.out.println("name in num: " + value2.getName());
                    return new Union(value2.getName(), 0, value2.getNum());
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `example/src/main/java/org/apache/rocketmq/streams/examples/joinWindow/JoinWindow.java`
#### Snippet
```java

                if (value1 != null) {
                    System.out.println("name in num: " + value1.getName());
                    return new Union(value1.getName(), value1.getAge(), 0);
                }
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinAggregateSupplier.java`
#### Snippet
```java

            Data<K, OUT> result = new Data<>(this.context.getKey(), out, this.context.getDataTime(), this.context.getHeader());
            Data<K, Object> convert = super.convert(result);
            this.context.forward(convert);
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinAggregateSupplier.java`
#### Snippet
```java
                case LEFT_STREAM:
                case RIGHT_STREAM: {
                    String storeKey = Utils.buildKey(name, super.toHexString(key));
                    byte[] keyBytes = Utils.object2Byte(storeKey);
                    byte[] valueBytes = super.object2Byte(data);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinAggregateSupplier.java`
#### Snippet
```java
                    String storeKey = Utils.buildKey(name, super.toHexString(key));
                    byte[] keyBytes = Utils.object2Byte(storeKey);
                    byte[] valueBytes = super.object2Byte(data);

                    this.stateStore.put(stateTopicMessageQueue, keyBytes, valueBytes);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinAggregateSupplier.java`
#### Snippet
```java
        public void preProcess(StreamContext<Object> context) throws RecoverStateStoreThrowable {
            super.preProcess(context);
            this.stateStore = super.waitStateReplay();
            String stateTopicName = context.getSourceTopic() + Constant.STATE_TOPIC_SUFFIX;
            this.stateTopicMessageQueue = new MessageQueue(stateTopicName, context.getSourceBrokerName(), context.getSourceQueueId());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinAggregateSupplier.java`
#### Snippet
```java
                case LEFT_STREAM: {
                    String name = Utils.buildKey(this.name, StreamType.RIGHT_STREAM.name());
                    String storeKey = Utils.buildKey(name, super.toHexString(key));
                    byte[] keyBytes = Utils.object2Byte(storeKey);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinAggregateSupplier.java`
#### Snippet
```java

                    V1 v1Data = (V1) data;
                    V2 v2Data = super.byte2Object(bytes);

                    doFire(v1Data, v2Data);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinAggregateSupplier.java`
#### Snippet
```java

                    String name = Utils.buildKey(this.name, StreamType.LEFT_STREAM.name());
                    String storeKey = Utils.buildKey(name, super.toHexString(key));
                    byte[] keyBytes = Utils.object2Byte(storeKey);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinAggregateSupplier.java`
#### Snippet
```java

                    V2 v2Data = (V2) data;
                    V1 v1Data = super.byte2Object(bytes);

                    doFire(v1Data, v2Data);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AccumulatorSupplier.java`
#### Snippet
```java
            Accumulator<R, OV> value;

            byte[] keyBytes = super.object2Byte(key);

            byte[] valueBytes = stateStore.get(keyBytes);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AggregateSupplier.java`
#### Snippet
```java
            OV value;

            byte[] keyBytes = super.object2Byte(key);

            byte[] valueBytes = stateStore.get(keyBytes);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AggregateSupplier.java`
#### Snippet
```java
                value = initAction.get();
            } else {
                value = super.byte2Object(valueBytes);
            }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AggregateSupplier.java`
#### Snippet
```java

            OV result = aggregateAction.calculate(key, data, value);
            byte[] newValueBytes = super.object2Byte(result);

            stateStore.put(this.stateTopicMessageQueue, keyBytes, newValueBytes);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AggregateSupplier.java`
#### Snippet
```java

            Data<K, OV> temp = new Data<>(key, result, this.context.getDataTime(), this.context.getHeader());
            Data<K, V> convert = super.convert(temp);

            this.context.forward(convert);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AggregateSupplier.java`
#### Snippet
```java
        public void preProcess(StreamContext<V> context) throws RecoverStateStoreThrowable {
            super.preProcess(context);
            this.stateStore = super.waitStateReplay();

            String stateTopicName = context.getSourceTopic() + Constant.STATE_TOPIC_SUFFIX;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AccumulatorSupplier.java`
#### Snippet
```java
                value = accumulator.clone();
            } else {
                value = super.byte2Object(valueBytes);
            }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AccumulatorSupplier.java`
#### Snippet
```java

            OV result = value.result(null);
            byte[] newValueBytes = super.object2Byte(value);

            stateStore.put(this.stateTopicMessageQueue, keyBytes, newValueBytes);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AccumulatorSupplier.java`
#### Snippet
```java

            Data<K, OV> temp = new Data<>(key, result, this.context.getDataTime(), this.context.getHeader());
            Data<K, V> convert = super.convert(temp);

            this.context.forward(convert);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AccumulatorSupplier.java`
#### Snippet
```java
        public void preProcess(StreamContext<V> context) throws RecoverStateStoreThrowable {
            super.preProcess(context);
            this.stateStore = super.waitStateReplay();

            String stateTopicName = context.getSourceTopic() + Constant.STATE_TOPIC_SUFFIX;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java

                String stateTopicQueueKey = buildKey(stateTopicQueue);
                super.putInRecover(stateTopicQueueKey, key);
                this.rocksDBStore.put(key, value);
            }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
    public void put(MessageQueue stateTopicMessageQueue, byte[] key, byte[] value) throws Throwable {
        String stateTopicQueueKey = buildKey(stateTopicMessageQueue);
        super.putInCalculating(stateTopicQueueKey, key);
        this.rocksDBStore.put(key, value);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
        for (MessageQueue stateTopicQueue : stateTopicQueues) {
            String stateTopicQueueKey = buildKey(stateTopicQueue);
            Set<byte[]> keySet = super.getInCalculating(stateTopicQueueKey);

            if (keySet == null || keySet.size() == 0) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
                this.producer.send(message, stateTopicQueue);
            }
            super.removeCalculating(stateTopicQueueKey);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
                Map<String/*brokerName@topic@queueId*/, List<MessageQueue>> groupByUniqueQueue = stateTopicQueue.stream().parallel().collect(Collectors.groupingBy(this::buildKey));
                for (String stateUniqueQueue : groupByUniqueQueue.keySet()) {
                    Set<byte[]> stateTopicQueueKey = super.getAll(stateUniqueQueue);
                    for (byte[] key : stateTopicQueueKey) {
                        this.rocksDBStore.deleteByKey(key);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
                        this.rocksDBStore.deleteByKey(key);
                    }
                    super.removeAll(stateUniqueQueue);
                }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
        }
        //删除远程
        String stateTopicQueue = super.whichStateTopicQueueBelongTo(key);
        String[] split = Utils.split(stateTopicQueue);
        String topic = split[1];
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java

        //删除内存中的key
        super.removeAllKey(key);

        logger.debug("delete key from RocketMQ and Rocksdb, key=" + new String(key, StandardCharsets.UTF_8) + ",MessageQueue: " + queue);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
        public void preProcess(StreamContext<V> context) throws RecoverStateStoreThrowable {
            super.preProcess(context);
            this.windowStore = new WindowStore<>(super.waitStateReplay(),
                    WindowState::byte2WindowState,
                    WindowState::windowState2Byte);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
                }

                WindowKey windowKey = new WindowKey(name, super.toHexString(key), newSessionWindowTime.getValue(), newSessionWindowTime.getKey());
                logger.info("new session window, with key={}, valueTime={}, sessionBegin=[{}], sessionEnd=[{}]", key, Utils.format(time),
                        Utils.format(newSessionWindowTime.getKey()), Utils.format(newSessionWindowTime.getValue()));
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
        public void preProcess(StreamContext<V> context) throws RecoverStateStoreThrowable {
            super.preProcess(context);
            this.windowStore = new WindowStore<>(super.waitStateReplay(),
                    WindowState::byte2WindowState,
                    WindowState::windowState2Byte);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java

            //f(time) -> List<Window>
            List<Window> windows = super.calculateWindow(windowInfo, time);
            for (Window window : windows) {
                logger.debug("timestamp=" + time + ". time -> window: " + Utils.format(time) + "->" + window);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
                //f(Window + key, store) -> oldValue
                //todo key 怎么转化成对应的string，只和key的值有关系
                WindowKey windowKey = new WindowKey(name, super.toHexString(key), window.getEndTime(), window.getStartTime());
                WindowState<K, OV> oldState = this.windowStore.get(windowKey);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinWindowAggregateSupplier.java`
#### Snippet
```java
        private void store(Object key, Object data, long time, StreamType streamType) throws Throwable {
            String name = Utils.buildKey(this.name, streamType.name());
            List<Window> windows = super.calculateWindow(windowInfo, time);
            for (Window window : windows) {
                logger.debug("timestamp=" + time + ". time -> window: " + Utils.format(time) + "->" + window);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinWindowAggregateSupplier.java`
#### Snippet
```java
                logger.debug("timestamp=" + time + ". time -> window: " + Utils.format(time) + "->" + window);

                WindowKey windowKey = new WindowKey(name, super.toHexString(key), window.getEndTime(), window.getStartTime());

                switch (streamType) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinWindowAggregateSupplier.java`
#### Snippet
```java
        public void preProcess(StreamContext<Object> context) throws RecoverStateStoreThrowable {
            super.preProcess(context);
            leftWindowStore = new WindowStore<>(super.waitStateReplay(), WindowState::byte2WindowState, WindowState::windowState2Byte);
            rightWindowStore = new WindowStore<>(super.waitStateReplay(), WindowState::byte2WindowState, WindowState::windowState2Byte);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinWindowAggregateSupplier.java`
#### Snippet
```java
            super.preProcess(context);
            leftWindowStore = new WindowStore<>(super.waitStateReplay(), WindowState::byte2WindowState, WindowState::windowState2Byte);
            rightWindowStore = new WindowStore<>(super.waitStateReplay(), WindowState::byte2WindowState, WindowState::windowState2Byte);

            this.idleWindowScaner = context.getDefaultWindowScaner();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
        public void preProcess(StreamContext<V> context) throws RecoverStateStoreThrowable {
            super.preProcess(context);
            this.windowStore = new WindowStore<>(super.waitStateReplay(),
                    WindowState::byte2WindowState,
                    WindowState::windowState2Byte);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
        public void preProcess(StreamContext<V> context) throws RecoverStateStoreThrowable {
            super.preProcess(context);
            this.windowStore = new WindowStore<>(super.waitStateReplay(),
                    WindowState::byte2WindowState,
                    WindowState::windowState2Byte);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
                }

                WindowKey windowKey = new WindowKey(name, super.toHexString(key), newSessionWindowTime.getValue(), newSessionWindowTime.getKey());
                logger.info("new session window, with key={}, valueTime={}, sessionBegin=[{}], sessionEnd=[{}]", key, Utils.format(time),
                        Utils.format(newSessionWindowTime.getKey()), Utils.format(newSessionWindowTime.getValue()));
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java

            //f(time) -> List<Window>
            List<Window> windows = super.calculateWindow(windowInfo, time);
            for (Window window : windows) {
                logger.debug("timestamp=" + time + ". time -> window: " + Utils.format(time) + "->" + window);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
                //f(Window + key, store) -> oldValue
                //todo key 怎么转化成对应的string，只和key的值有关系
                WindowKey windowKey = new WindowKey(name, super.toHexString(key), window.getEndTime(), window.getStartTime());
                WindowState<K, Accumulator<R, OV>> oldState = this.windowStore.get(windowKey);

```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `example/src/main/java/org/apache/rocketmq/streams/examples/WordCount.java`
#### Snippet
```java
                })
                .flatMap((ValueMapperAction<String, List<String>>) value -> {
                    String[] splits = value.toLowerCase().split("\\W+");
                    return Arrays.asList(splits);
                })
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowWordCount.java`
#### Snippet
```java
                })
                .flatMap((ValueMapperAction<String, List<String>>) value -> {
                    String[] splits = value.toLowerCase().split("\\W+");
                    return Arrays.asList(splits);
                })
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `example/src/main/java/org/apache/rocketmq/streams/examples/sink/WordCountSink.java`
#### Snippet
```java
                })
                .flatMap((ValueMapperAction<String, List<String>>) value -> {
                    String[] splits = value.toLowerCase().split("\\W+");
                    return Arrays.asList(splits);
                })
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.nio.charset.StandardCharsets;`
in `core/src/main/java/org/apache/rocketmq/streams/core/common/Constant.java`
#### Snippet
```java
package org.apache.rocketmq.streams.core.common;

import java.nio.charset.StandardCharsets;

public class Constant {
```

### UNUSED_IMPORT
Unused import `import org.apache.rocketmq.streams.core.exception.RStreamsException;`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinWindowAggregateSupplier.java`
#### Snippet
```java
import org.apache.rocketmq.common.message.MessageQueue;
import org.apache.rocketmq.streams.core.common.Constant;
import org.apache.rocketmq.streams.core.exception.RStreamsException;
import org.apache.rocketmq.streams.core.exception.RecoverStateStoreThrowable;
import org.apache.rocketmq.streams.core.function.ValueJoinAction;
```

### UNUSED_IMPORT
Unused import `import org.apache.rocketmq.streams.core.metadata.Data;`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinWindowAggregateSupplier.java`
#### Snippet
```java
import org.apache.rocketmq.streams.core.exception.RecoverStateStoreThrowable;
import org.apache.rocketmq.streams.core.function.ValueJoinAction;
import org.apache.rocketmq.streams.core.metadata.Data;
import org.apache.rocketmq.streams.core.running.AbstractWindowProcessor;
import org.apache.rocketmq.streams.core.running.Processor;
```

### UNUSED_IMPORT
Unused import `import org.apache.rocketmq.streams.core.util.Pair;`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinWindowAggregateSupplier.java`
#### Snippet
```java
import org.apache.rocketmq.streams.core.window.WindowState;
import org.apache.rocketmq.streams.core.window.WindowStore;
import org.apache.rocketmq.streams.core.util.Pair;
import org.apache.rocketmq.streams.core.util.Utils;
import org.apache.rocketmq.streams.core.window.fire.JoinWindowFire;
```

### UNUSED_IMPORT
Unused import `import java.util.Comparator;`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinWindowAggregateSupplier.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.List;
import java.util.Properties;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.atomic.AtomicReference;`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinWindowAggregateSupplier.java`
#### Snippet
```java
import java.util.List;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

```

### UNUSED_IMPORT
Unused import `import org.checkerframework.checker.units.qual.K;`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
import org.apache.rocketmq.streams.core.window.fire.AggregateSessionWindowFire;
import org.apache.rocketmq.streams.core.window.fire.AggregateWindowFire;
import org.checkerframework.checker.units.qual.K;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
```

### UNUSED_IMPORT
Unused import `import java.util.Comparator;`
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/StreamBuilder.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

```

### UNUSED_IMPORT
Unused import `import org.apache.rocketmq.streams.core.function.supplier.AggregateSupplier;`
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/WindowStreamImpl.java`
#### Snippet
```java
import org.apache.rocketmq.streams.core.function.accumulator.AvgAccumulator;
import org.apache.rocketmq.streams.core.function.accumulator.CountAccumulator;
import org.apache.rocketmq.streams.core.function.supplier.AggregateSupplier;
import org.apache.rocketmq.streams.core.function.supplier.FilterSupplier;
import org.apache.rocketmq.streams.core.function.supplier.SinkSupplier;
```

### UNUSED_IMPORT
Unused import `import io.netty.buffer.ByteBufAllocator;`
in `core/src/main/java/org/apache/rocketmq/streams/core/running/AbstractProcessor.java`
#### Snippet
```java
import com.fasterxml.jackson.core.JsonProcessingException;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import org.apache.rocketmq.common.message.MessageQueue;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `core/src/main/java/org/apache/rocketmq/streams/core/running/AbstractProcessor.java`
#### Snippet
```java
import org.apache.rocketmq.streams.core.util.Utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.util.Collections;`
in `core/src/main/java/org/apache/rocketmq/streams/core/running/MessageQueueListenerWrapper.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `core/src/main/java/org/apache/rocketmq/streams/core/running/MessageQueueListenerWrapper.java`
#### Snippet
```java
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
```

### UNUSED_IMPORT
Unused import `import io.netty.buffer.ByteBufAllocator;`
in `core/src/main/java/org/apache/rocketmq/streams/core/serialization/ShuffleProtocol.java`
#### Snippet
```java

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import org.apache.rocketmq.streams.core.util.Pair;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `core/src/main/java/org/apache/rocketmq/streams/core/topology/real/ProcessorFactory.java`
#### Snippet
```java
import org.apache.rocketmq.streams.core.running.Processor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `core/src/main/java/org/apache/rocketmq/streams/core/topology/real/ProcessorFactory.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `core/src/main/java/org/apache/rocketmq/streams/core/topology/real/RealProcessorFactory.java`
#### Snippet
```java
import org.apache.rocketmq.streams.core.running.Processor;

import java.util.List;

public interface RealProcessorFactory<T> {
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `core/src/main/java/org/apache/rocketmq/streams/core/topology/real/SourceFactory.java`
#### Snippet
```java
import org.apache.rocketmq.streams.core.running.Processor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.Collections;`
in `core/src/main/java/org/apache/rocketmq/streams/core/topology/real/SourceFactory.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `core/src/main/java/org/apache/rocketmq/streams/core/topology/real/SourceFactory.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

```

### UNUSED_IMPORT
Unused import `import org.apache.rocketmq.streams.core.running.StreamContext;`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowStore.java`
#### Snippet
```java
import org.apache.rocketmq.common.message.MessageQueue;
import org.apache.rocketmq.streams.core.function.ValueMapperAction;
import org.apache.rocketmq.streams.core.running.StreamContext;
import org.apache.rocketmq.streams.core.state.StateStore;
import org.apache.rocketmq.streams.core.util.Pair;
```

### UNUSED_IMPORT
Unused import `import java.util.function.BiConsumer;`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowStore.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
```

### UNUSED_IMPORT
Unused import `import java.util.function.BiFunction;`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowStore.java`
#### Snippet
```java
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
```

### UNUSED_IMPORT
Unused import `import java.util.function.Consumer;`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowStore.java`
#### Snippet
```java
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

```

### UNUSED_IMPORT
Unused import `import java.util.function.LongConsumer;`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowStore.java`
#### Snippet
```java
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

public class WindowStore<K, V> {
```

### UNUSED_IMPORT
Unused import `import org.apache.rocketmq.streams.core.common.Constant;`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AbstractWindowFire.java`
#### Snippet
```java

import org.apache.rocketmq.common.message.MessageQueue;
import org.apache.rocketmq.streams.core.common.Constant;
import org.apache.rocketmq.streams.core.running.StreamContext;
import org.apache.rocketmq.streams.core.state.StateStore;
```

### UNUSED_IMPORT
Unused import `import org.apache.rocketmq.streams.core.state.StateStore;`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AbstractWindowFire.java`
#### Snippet
```java
import org.apache.rocketmq.streams.core.common.Constant;
import org.apache.rocketmq.streams.core.running.StreamContext;
import org.apache.rocketmq.streams.core.state.StateStore;
import org.apache.rocketmq.streams.core.util.Utils;

```

### UNUSED_IMPORT
Unused import `import org.apache.rocketmq.streams.core.util.Utils;`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AbstractWindowFire.java`
#### Snippet
```java
import org.apache.rocketmq.streams.core.running.StreamContext;
import org.apache.rocketmq.streams.core.state.StateStore;
import org.apache.rocketmq.streams.core.util.Utils;

import java.util.HashSet;
```

### UNUSED_IMPORT
Unused import `import java.util.HashSet;`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AbstractWindowFire.java`
#### Snippet
```java
import org.apache.rocketmq.streams.core.util.Utils;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;
```

### UNUSED_IMPORT
Unused import `import java.util.Set;`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AbstractWindowFire.java`
#### Snippet
```java

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;

```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.Executors;`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/IdleWindowScaner.java`
#### Snippet
```java
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.CountDownLatch;`
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowAvg.java`
#### Snippet
```java
import java.time.LocalTime;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.rocketmq.streams.core.window.TimeType;`
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowMin.java`
#### Snippet
```java
import org.apache.rocketmq.streams.core.rstream.StreamBuilder;
import org.apache.rocketmq.streams.core.window.Time;
import org.apache.rocketmq.streams.core.window.TimeType;
import org.apache.rocketmq.streams.core.window.WindowBuilder;
import org.apache.rocketmq.streams.core.topology.TopologyBuilder;
```

### UNUSED_IMPORT
Unused import `import org.apache.rocketmq.streams.examples.pojo.User;`
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowMin.java`
#### Snippet
```java
import org.apache.rocketmq.streams.core.util.Pair;
import org.apache.rocketmq.streams.examples.pojo.Grade;
import org.apache.rocketmq.streams.examples.pojo.User;

import java.util.Properties;
```

### UNUSED_IMPORT
Unused import `import org.apache.rocketmq.streams.core.window.TimeType;`
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowSum.java`
#### Snippet
```java
import org.apache.rocketmq.streams.core.rstream.StreamBuilder;
import org.apache.rocketmq.streams.core.window.Time;
import org.apache.rocketmq.streams.core.window.TimeType;
import org.apache.rocketmq.streams.core.window.WindowBuilder;
import org.apache.rocketmq.streams.core.topology.TopologyBuilder;
```

### UNUSED_IMPORT
Unused import `import org.apache.rocketmq.streams.examples.pojo.User;`
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowSum.java`
#### Snippet
```java
import org.apache.rocketmq.streams.core.util.Pair;
import org.apache.rocketmq.streams.examples.pojo.Grade;
import org.apache.rocketmq.streams.examples.pojo.User;

import java.util.Properties;
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`avg = avg + numOther / (num + numOther) * (avgOther - avg)` could be simplified to 'avg += numOther / (num + numOther) \* (avgOther - avg)'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/accumulator/AvgAccumulator.java`
#### Snippet
```java
            Double avgOther = otherAvgAccumulator.getAvg();

            avg = avg + numOther / (num + numOther) * (avgOther - avg);
            num = num + numOther;
        } else {
```

### ReplaceAssignmentWithOperatorAssignment
`num = num + numOther` could be simplified to 'num += numOther'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/accumulator/AvgAccumulator.java`
#### Snippet
```java

            avg = avg + numOther / (num + numOther) * (avgOther - avg);
            num = num + numOther;
        } else {
            throw new IllegalArgumentException("Merge avg, input is not a AvgAccumulator.");
```

### ReplaceAssignmentWithOperatorAssignment
`avg = avg + (valueToDouble - avg) / (num + 1)` could be simplified to 'avg += (valueToDouble - avg) / (num + 1)'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/accumulator/AvgAccumulator.java`
#### Snippet
```java
                num = 1;
            } else {
                avg = avg + (valueToDouble - avg) / (num + 1);
                num++;
            }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractWindowFire()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AbstractWindowFire.java`
#### Snippet
```java
    private final BiFunction<Long, MessageQueue, Long> commitWatermark;

    public AbstractWindowFire(StreamContext<V> context,
                              MessageQueue stateTopicMessageQueue,
                              BiFunction<Long, MessageQueue, Long> commitWatermark) {
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractGraphNode()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/rocketmq/streams/core/topology/virtual/AbstractGraphNode.java`
#### Snippet
```java


    public AbstractGraphNode(String name) {
        Objects.requireNonNull(name, "name can not be null.");
        this.name = name;
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `topic2SinkNodeFactory` are updated, but never queried
in `core/src/main/java/org/apache/rocketmq/streams/core/topology/TopologyBuilder.java`
#### Snippet
```java
    private final LinkedHashMap<String/*name*/, RealProcessorFactory<?>> realNodeFactory = new LinkedHashMap<>();

    private final LinkedHashMap<String/*sink topic*/, RealProcessorFactory<?>> topic2SinkNodeFactory = new LinkedHashMap<>();

    private final HashMap<String/*source name*/, List<String/*subsequent processor without source*/>> source2Group = new HashMap<>();
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/PrintSupplier.java`
#### Snippet
```java
        public void process(T data) {
            Properties header = context.getHeader();
            Object startTime = header.get(Constant.WINDOW_START_TIME);
            Object endTime = header.get(Constant.WINDOW_END_TIME);
            if (startTime == null || endTime == null) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/PrintSupplier.java`
#### Snippet
```java
            Properties header = context.getHeader();
            Object startTime = header.get(Constant.WINDOW_START_TIME);
            Object endTime = header.get(Constant.WINDOW_END_TIME);
            if (startTime == null || endTime == null) {
                String template = "(key=%s, value=%s)";
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putIfAbsent()` on properties object
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/SessionWindowCount.java`
#### Snippet
```java

        Properties properties = new Properties();
        properties.putIfAbsent(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");

        RocketMQStream rocketMQStream = new RocketMQStream(topologyBuilder, properties);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `example/src/main/java/org/apache/rocketmq/streams/examples/WordCount.java`
#### Snippet
```java

        Properties properties = new Properties();
        properties.put(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");

        RocketMQStream rocketMQStream = new RocketMQStream(topologyBuilder, properties);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putIfAbsent()` on properties object
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowWordCount.java`
#### Snippet
```java

        Properties properties = new Properties();
        properties.putIfAbsent(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");
        properties.put(StreamConfig.TIME_TYPE, TimeType.PROCESS_TIME);

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowWordCount.java`
#### Snippet
```java
        Properties properties = new Properties();
        properties.putIfAbsent(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");
        properties.put(StreamConfig.TIME_TYPE, TimeType.PROCESS_TIME);

        RocketMQStream rocketMQStream = new RocketMQStream(topologyBuilder, properties);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinAggregateSupplier.java`
#### Snippet
```java
            Object key = this.context.getKey();
            Properties header = this.context.getHeader();
            StreamType streamType = (StreamType) header.get(Constant.STREAM_TAG);

            store(key, data, streamType);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `example/src/main/java/org/apache/rocketmq/streams/examples/pojo/Demo.java`
#### Snippet
```java

        Properties properties = new Properties();
        properties.put(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");

        RocketMQStream rocketMQStream = new RocketMQStream(topologyBuilder, properties);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `example/src/main/java/org/apache/rocketmq/streams/examples/joinWindow/JoinWithoutWindow.java`
#### Snippet
```java

        Properties properties = new Properties();
        properties.put(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");

        RocketMQStream rocketMQStream = new RocketMQStream(topologyBuilder, properties);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putIfAbsent()` on properties object
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowSum.java`
#### Snippet
```java

        Properties properties = new Properties();
        properties.putIfAbsent(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");
        properties.put(StreamConfig.ALLOW_LATENESS_MILLISECOND, 2000);

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowSum.java`
#### Snippet
```java
        Properties properties = new Properties();
        properties.putIfAbsent(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");
        properties.put(StreamConfig.ALLOW_LATENESS_MILLISECOND, 2000);

        RocketMQStream rocketMQStream = new RocketMQStream(topologyBuilder, properties);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AddTagSupplier.java`
#### Snippet
```java
    public AddTagSupplier(Supplier<Object> value) {

        properties.put(Constant.STREAM_TAG, value.get());
    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putIfAbsent()` on properties object
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/SlideWindowCount.java`
#### Snippet
```java

        Properties properties = new Properties();
        properties.putIfAbsent(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");

        RocketMQStream rocketMQStream = new RocketMQStream(topologyBuilder, properties);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putIfAbsent()` on properties object
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowCount.java`
#### Snippet
```java

        Properties properties = new Properties();
        properties.putIfAbsent(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");
        properties.put(StreamConfig.TIME_TYPE, TimeType.EVENT_TIME);
        properties.put(StreamConfig.ALLOW_LATENESS_MILLISECOND, 2000);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowCount.java`
#### Snippet
```java
        Properties properties = new Properties();
        properties.putIfAbsent(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");
        properties.put(StreamConfig.TIME_TYPE, TimeType.EVENT_TIME);
        properties.put(StreamConfig.ALLOW_LATENESS_MILLISECOND, 2000);

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowCount.java`
#### Snippet
```java
        properties.putIfAbsent(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");
        properties.put(StreamConfig.TIME_TYPE, TimeType.EVENT_TIME);
        properties.put(StreamConfig.ALLOW_LATENESS_MILLISECOND, 2000);

        RocketMQStream rocketMQStream = new RocketMQStream(topologyBuilder, properties);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putIfAbsent()` on properties object
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowAvg.java`
#### Snippet
```java

        Properties properties = new Properties();
        properties.putIfAbsent(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");

        RocketMQStream rocketMQStream = new RocketMQStream(topologyBuilder, properties);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `example/src/main/java/org/apache/rocketmq/streams/examples/sink/WordCountSink.java`
#### Snippet
```java

        Properties properties = new Properties();
        properties.put(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");

        RocketMQStream rocketMQStream = new RocketMQStream(topologyBuilder, properties);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `core/src/main/java/org/apache/rocketmq/streams/core/running/WorkerThread.java`
#### Snippet
```java

        long prepareTime(MessageExt messageExt, SourceSupplier.SourceProcessor<K, V> processor) {
            TimeType type = (TimeType) properties.get(StreamConfig.TIME_TYPE);

            long timestamp;
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AccumulatorWindowFire.java`
#### Snippet
```java

                Properties header = context.getHeader();
                header.put(Constant.WINDOW_START_TIME, windowKey.getWindowStart());
                header.put(Constant.WINDOW_END_TIME, windowEnd);

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AccumulatorWindowFire.java`
#### Snippet
```java
                Properties header = context.getHeader();
                header.put(Constant.WINDOW_START_TIME, windowKey.getWindowStart());
                header.put(Constant.WINDOW_END_TIME, windowEnd);

                Accumulator<R, OV> rovAccumulator = value.getValue();
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AccumulatorSessionWindowFire.java`
#### Snippet
```java

                Properties header = context.getHeader();
                header.put(Constant.WINDOW_START_TIME, windowBegin);
                header.put(Constant.WINDOW_END_TIME, windowEnd);

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AccumulatorSessionWindowFire.java`
#### Snippet
```java
                Properties header = context.getHeader();
                header.put(Constant.WINDOW_START_TIME, windowBegin);
                header.put(Constant.WINDOW_END_TIME, windowEnd);

                Accumulator<R, OV> value = state.getValue();
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putIfAbsent()` on properties object
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowMin.java`
#### Snippet
```java

        Properties properties = new Properties();
        properties.putIfAbsent(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");
        properties.put(StreamConfig.ALLOW_LATENESS_MILLISECOND, 2000);

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowMin.java`
#### Snippet
```java
        Properties properties = new Properties();
        properties.putIfAbsent(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");
        properties.put(StreamConfig.ALLOW_LATENESS_MILLISECOND, 2000);

        RocketMQStream rocketMQStream = new RocketMQStream(topologyBuilder, properties);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AggregateWindowFire.java`
#### Snippet
```java

                Properties header = this.context.getHeader();
                header.put(Constant.WINDOW_START_TIME, windowKey.getWindowStart());
                header.put(Constant.WINDOW_END_TIME, windowEnd);
                Data<K, OV> result = new Data<>(value.getKey(), value.getValue(), value.getRecordLastTimestamp(), header);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AggregateWindowFire.java`
#### Snippet
```java
                Properties header = this.context.getHeader();
                header.put(Constant.WINDOW_START_TIME, windowKey.getWindowStart());
                header.put(Constant.WINDOW_END_TIME, windowEnd);
                Data<K, OV> result = new Data<>(value.getKey(), value.getValue(), value.getRecordLastTimestamp(), header);
                Data<K, V> convert = this.convert(result);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AggregateSessionWindowFire.java`
#### Snippet
```java

                Properties header = this.context.getHeader();
                header.put(Constant.WINDOW_START_TIME, windowBegin);
                header.put(Constant.WINDOW_END_TIME, windowEnd);

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AggregateSessionWindowFire.java`
#### Snippet
```java
                Properties header = this.context.getHeader();
                header.put(Constant.WINDOW_START_TIME, windowBegin);
                header.put(Constant.WINDOW_END_TIME, windowEnd);

                Data<K, OV> result = new Data<>(state.getKey(), state.getValue(), state.getRecordLastTimestamp(), header);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `example/src/main/java/org/apache/rocketmq/streams/examples/joinWindow/JoinWindow.java`
#### Snippet
```java

        Properties properties = new Properties();
        properties.put(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");

        RocketMQStream rocketMQStream = new RocketMQStream(topologyBuilder, properties);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinWindowAggregateSupplier.java`
#### Snippet
```java
                return;
            }
            WindowInfo.JoinStream stream = (WindowInfo.JoinStream) header.get(Constant.STREAM_TAG);
            StreamType streamType = stream.getStreamType();
            if (streamType == null) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/JoinWindowFire.java`
#### Snippet
```java

                                Properties header = this.context.getHeader();
                                header.put(Constant.WINDOW_START_TIME, leftWindowKey.getWindowStart());
                                header.put(Constant.WINDOW_END_TIME, leftWindowKey.getWindowEnd());

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/JoinWindowFire.java`
#### Snippet
```java
                                Properties header = this.context.getHeader();
                                header.put(Constant.WINDOW_START_TIME, leftWindowKey.getWindowStart());
                                header.put(Constant.WINDOW_END_TIME, leftWindowKey.getWindowEnd());

                                assert leftPair.getValue().getKey() == rightPair.getValue().getKey();
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/JoinWindowFire.java`
#### Snippet
```java
                                OUT out = this.joinAction.apply(o1, o2);
                                Properties header = this.context.getHeader();
                                header.put(Constant.WINDOW_START_TIME, leftWindowKey.getWindowStart());
                                header.put(Constant.WINDOW_END_TIME, leftWindowKey.getWindowEnd());

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/JoinWindowFire.java`
#### Snippet
```java
                                Properties header = this.context.getHeader();
                                header.put(Constant.WINDOW_START_TIME, leftWindowKey.getWindowStart());
                                header.put(Constant.WINDOW_END_TIME, leftWindowKey.getWindowEnd());


```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `core/src/main/java/org/apache/rocketmq/streams/core/state/StateStore.java`
#### Snippet
```java

public interface StateStore extends AutoCloseable {
    void init() throws Throwable;


```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/rocketmq/streams/core/topology/virtual/ProcessorNode.java`
#### Snippet
```java
    protected final Supplier<Processor<T>> supplier;
    protected final List<String> parentNames;
    protected boolean shuffle = false;


```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowInfo.java`
#### Snippet
```java
    private WindowType windowType;

    private JoinStream joinStream = null;

    private Time windowSize;//窗口大小
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/org/apache/rocketmq/streams/core/running/AbstractProcessor.java`
#### Snippet
```java
    private final List<Processor<T>> children = new ArrayList<>();
    protected StreamContext<T> context;
    protected long allowDelay = 0;

    @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/org/apache/rocketmq/streams/core/running/WorkerThread.java`
#### Snippet
```java
        private volatile boolean stop = false;

        private long lastCommit = 0;
        private int commitInterval = 10 * 1000;
        private final HashSet<MessageQueue> mq2Commit = new HashSet<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/rocketmq/streams/core/running/WorkerThread.java`
#### Snippet
```java
        private final MessageQueueListenerWrapper wrapper;
        private final IdleWindowScaner idleWindowScaner;
        private volatile boolean stop = false;

        private long lastCommit = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/IdleWindowScaner.java`
#### Snippet
```java

    private final Integer maxIdleTime;
    private long sessionTimeOut = 0;
    private final ScheduledExecutorService executor;

```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `clusters`
in `core/src/main/java/org/apache/rocketmq/streams/core/util/RocketMQUtil.java`
#### Snippet
```java

        if (clusters == null || clusters.size() == 0) {
            clusters = getCluster(mqAdmin);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `clusters`
in `core/src/main/java/org/apache/rocketmq/streams/core/util/RocketMQUtil.java`
#### Snippet
```java

        if (clusters == null || clusters.size() == 0) {
            clusters = getCluster(mqAdmin);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `accumulator`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/SumAggregate.java`
#### Snippet
```java
        Number number = selectAction.select(value);
        if (accumulator == null) {
            accumulator = number;
            return accumulator;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `watermark`
in `core/src/main/java/org/apache/rocketmq/streams/core/running/AbstractWindowProcessor.java`
#### Snippet
```java
                stateStore.put(stateTopicMessageQueue, keyBytes, newWatermarkBytes);
            } else {
                watermark = oldWatermark;
            }
        } catch (Throwable t) {
```

## RuleId[id=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `core/src/main/java/org/apache/rocketmq/streams/core/topology/virtual/ProcessorNode.java`
#### Snippet
```java
import java.util.function.Supplier;

public class ProcessorNode<T> extends AbstractGraphNode {
    protected final Supplier<Processor<T>> supplier;
    protected final List<String> parentNames;
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/WindowStreamImpl.java`
#### Snippet
```java
        String name = OperatorNameMaker.makeName(AGGREGATE_PREFIX, pipeline.getJobId());

        Supplier<Processor<V>> supplier = new WindowAggregateSupplier<>(name, windowInfo, () -> null, aggregateAction);

        //是否需要分组计算
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/WindowStreamImpl.java`
#### Snippet
```java
        String name = OperatorNameMaker.makeName(MAX_PREFIX, pipeline.getJobId());

        Supplier<Processor<V>> supplier = new WindowAggregateSupplier<>(name, windowInfo, () -> null, (AggregateAction<K, V, V>) (key, value, accumulator) -> {
            Number number = selectAction.select(value);
            if (accumulator == null) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/WindowStreamImpl.java`
#### Snippet
```java
    @Override public WindowStream<K, ? extends Number> sum(SelectAction<? extends Number, V> selectAction) {
        String name = OperatorNameMaker.makeName(SUM_PREFIX, pipeline.getJobId());
        Supplier<Processor<V>> supplier = new WindowAggregateSupplier<>(name, windowInfo, () -> null, new SumAggregate<>(selectAction));

        GraphNode graphNode;
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/WindowStreamImpl.java`
#### Snippet
```java
        String name = OperatorNameMaker.makeName(MIN_PREFIX, pipeline.getJobId());

        Supplier<Processor<V>> supplier = new WindowAggregateSupplier<>(name, windowInfo, () -> null, (AggregateAction<K, V, V>) (key, value, accumulator) -> {
            Number number = selectAction.select(value);
            if (accumulator == null) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/state/AbstractStore.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/state/AbstractStore.java`
#### Snippet
```java
    protected static String stateTopic2SourceTopic(String stateTopic) {
        if (StringUtils.isEmpty(stateTopic)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/GroupedStreamImpl.java`
#### Snippet
```java
    public GroupedStream<K, V> max(SelectAction<? extends Number, V> selectAction) {
        String name = OperatorNameMaker.makeName(MAX_PREFIX, pipeline.getJobId());
        Supplier<Processor<V>> supplier = new AggregateSupplier<>(name, parent.getName(), () -> null, (AggregateAction<K, V, V>) (key, value, accumulator) -> {
            Number number = selectAction.select(value);
            if (accumulator == null) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/GroupedStreamImpl.java`
#### Snippet
```java
        String name = OperatorNameMaker.makeName(MIN_PREFIX, pipeline.getJobId());

        Supplier<Processor<V>> supplier = new AggregateSupplier<>(name, parent.getName(), () -> null, (AggregateAction<K, V, V>) (key, value, accumulator) -> {
            Number number = selectAction.select(value);
            if (accumulator == null) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/GroupedStreamImpl.java`
#### Snippet
```java
    public GroupedStream<K, ? extends Number> sum(SelectAction<? extends Number, V> selectAction) {
        String name = OperatorNameMaker.makeName(SUM_PREFIX, pipeline.getJobId());
        Supplier<Processor<V>> supplier = new AggregateSupplier<>(name, parent.getName(), () -> null, new SumAggregate<>(selectAction));

        GraphNode graphNode;
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/running/AbstractProcessor.java`
#### Snippet
```java
    protected String toHexString(Object source) throws JsonProcessingException {
        if (source == null) {
            return null;
        }
        if (source instanceof String) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/running/AbstractProcessor.java`
#### Snippet
```java
    public <V> V byte2Object(byte[] bytes) throws Throwable {
        if (bytes == null || bytes.length == 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowStore.java`
#### Snippet
```java
    private WindowState<K, V> deserializerState(byte[] source) throws Throwable {
        if (source == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/running/WorkerThread.java`
#### Snippet
```java
                try {
                    PlanetaryEngine.this.stateStore.recover(addQueue, removeQueue);
                    return null;
                } catch (Throwable e) {
                    logger.error("recover error.", e);
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocksDBStore.java`
#### Snippet
```java
    public byte[] get(byte[] key) throws RocksDBException {
        if (key == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
            if (dataTime < maxFireSessionEnd) {
                logger.warn("late data, discard. key=[{}], data=[{}], dataTime < maxFireSessionEnd: [{}] < [{}]", key, data, dataTime, maxFireSessionEnd);
                return null;
            }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
                return new Pair<>(lastStateSessionEnd, dataTime + windowInfo.getSessionTimeout().toMilliseconds());
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/util/Utils.java`
#### Snippet
```java
    public static <B> B byte2Object(byte[] source, Class<B> clazz) throws IOException {
        if (source == null || source.length == 0 || clazz == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/util/Utils.java`
#### Snippet
```java
    public static String buildKey(String key, String... args) {
        if (StringUtils.isEmpty(key)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
            if (dataTime < maxFireSessionEnd) {
                logger.warn("late data, discard. key=[{}], data=[{}], dataTime < maxFireSessionEnd: [{}] < [{}]", key, data, dataTime, maxFireSessionEnd);
                return null;
            }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
                return new Pair<>(lastStateSessionEnd, dataTime + windowInfo.getSessionTimeout().toMilliseconds());
            }
            return null;
        }

```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `timeType`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/IdleWindowScaner.java`
#### Snippet
```java
        this.lastUpdateTime2WindowKey.compute(windowKey, (key, timeType) -> {
            if (timeType == null) {
                timeType = new TimeType(Type.AccumulatorSessionWindow, System.currentTimeMillis());
            } else {
                timeType.setUpdateTime(System.currentTimeMillis());
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `timeType`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/IdleWindowScaner.java`
#### Snippet
```java
        this.lastUpdateTime2WindowKey.compute(windowKey, (key, timeType) -> {
            if (timeType == null) {
                timeType = new TimeType(Type.JoinWindow, System.currentTimeMillis());
            } else {
                timeType.setUpdateTime(System.currentTimeMillis());
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `timeType`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/IdleWindowScaner.java`
#### Snippet
```java
        this.lastUpdateTime2WindowKey.compute(windowKey, (key, timeType) -> {
            if (timeType == null) {
                timeType = new TimeType(Type.AccumulatorWindow, System.currentTimeMillis());
            } else {
                timeType.setUpdateTime(System.currentTimeMillis());
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `timeType`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/IdleWindowScaner.java`
#### Snippet
```java
        this.lastUpdateTime2WindowKey.compute(windowKey, (key, timeType) -> {
            if (timeType == null) {
                timeType = new TimeType(Type.AggregateSessionWindow, System.currentTimeMillis());
            } else {
                timeType.setUpdateTime(System.currentTimeMillis());
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `timeType`
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/IdleWindowScaner.java`
#### Snippet
```java
        this.lastUpdateTime2WindowKey.compute(windowKey, (key, timeType) -> {
            if (timeType == null) {
                timeType = new TimeType(Type.AggregateWindow, System.currentTimeMillis());
            } else {
                timeType.setUpdateTime(System.currentTimeMillis());
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowAvg.java`
#### Snippet
```java
            Integer num = Integer.parseInt(value);
            return new Pair<>(null, num);
        }).foreach(value -> System.out.println(String.format("time:%s, input:%d", LocalTime.now(), value)))
        .filter(value -> value > 0)
        .keyBy(value -> "key")
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/org/apache/rocketmq/streams/core/util/RocketMQUtil.java`
#### Snippet
```java
                }
            } else {
                String[] masterArray = masterSet.toArray(new String[]{});

                topicConfig = new TopicConfig(topicName, queueNumInEachBroker + remainder,
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowKey.java`
#### Snippet
```java
    public static byte[] windowKey2Byte(WindowKey windowKey) {
        if (windowKey == null) {
            return new byte[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/org/apache/rocketmq/streams/core/running/AbstractProcessor.java`
#### Snippet
```java
    protected byte[] object2Byte(Object obj) throws JsonProcessingException {
        if (obj == null) {
            return new byte[]{};
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
    public byte[] get(byte[] key) throws Throwable {
        if (key == null || key.length == 0) {
            return new byte[0];
        }
        return this.rocksDBStore.get(key);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/org/apache/rocketmq/streams/core/serialization/serImpl/KVJsonSerializer.java`
#### Snippet
```java

        if (key == null) {
            keyBytes = new byte[0];
        } else if (key instanceof byte[]) {
            keyBytes = (byte[]) key;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/org/apache/rocketmq/streams/core/serialization/serImpl/KVJsonSerializer.java`
#### Snippet
```java
        byte[] valueBytes;
        if (value == null) {
            valueBytes = new byte[0];
        } else if (value instanceof byte[]) {
            valueBytes = (byte[]) value;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/org/apache/rocketmq/streams/core/serialization/serImpl/KVJsonSerializer.java`
#### Snippet
```java

        if (keyBytes.length == 0 && valueBytes.length == 0) {
            return new byte[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowState.java`
#### Snippet
```java
    public static byte[] windowState2Byte(WindowState<?, ?> state) throws Throwable {
        if (state == null) {
            return new byte[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/org/apache/rocketmq/streams/core/util/Utils.java`
#### Snippet
```java
    public static byte[] object2Byte(Object target) throws JsonProcessingException {
        if (target == null) {
            return new byte[]{};
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/org/apache/rocketmq/streams/core/util/Utils.java`
#### Snippet
```java
    public static String[] split(String source, String split) {
        if (StringUtils.isEmpty(source) || StringUtils.isEmpty(split)) {
            return new String[]{};
        }

```

