# rocketmq-streams 
 
# Bad smells
I found 139 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 50 | false |
| UNUSED_IMPORT | 36 | false |
| DuplicatedCode | 23 | false |
| UNCHECKED_WARNING | 8 | false |
| FieldCanBeLocal | 6 | false |
| RefusedBequest | 3 | false |
| CatchMayIgnoreException | 3 | false |
| StringBufferReplaceableByString | 2 | false |
| Deprecation | 2 | false |
| AutoCloseableResource | 1 | false |
| EmptyStatementBody | 1 | false |
| TypeParameterHidesVisibleType | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| RedundantStringFormatCall | 1 | false |
| SuspiciousMethodCalls | 1 | false |
## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'RocksDBStore' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocksDBStore.java`
#### Snippet
```java

    public static void main(String[] args) throws Throwable {
        RocksDBStore rocksDBStore = new RocksDBStore("test");

        String key = "time@1668249210000@1668249195000";
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.streams.core.topology.virtual.ProcessorNode' to 'org.apache.rocketmq.streams.core.topology.virtual.ProcessorNode'
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/JoinedStream.java`
#### Snippet
```java
            String name = OperatorNameMaker.makeName(OperatorNameMaker.JOIN_WINDOW_PREFIX, jobId);
            Supplier<Processor<? super OUT>> supplier = new JoinWindowAggregateSupplier<>(name, windowInfo, joinAction);
            ProcessorNode<OUT> commChild = new ProcessorNode(name, temp, supplier);


```

### UNCHECKED_WARNING
Unchecked call to 'ProcessorNode(String, List, Supplier\>)' as a member of raw type 'org.apache.rocketmq.streams.core.topology.virtual.ProcessorNode'
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/JoinedStream.java`
#### Snippet
```java
            String name = OperatorNameMaker.makeName(OperatorNameMaker.JOIN_WINDOW_PREFIX, jobId);
            Supplier<Processor<? super OUT>> supplier = new JoinWindowAggregateSupplier<>(name, windowInfo, joinAction);
            ProcessorNode<OUT> commChild = new ProcessorNode(name, temp, supplier);


```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.streams.core.topology.virtual.ProcessorNode' to 'org.apache.rocketmq.streams.core.topology.virtual.ProcessorNode'
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/JoinedStream.java`
#### Snippet
```java
            String name = OperatorNameMaker.makeName(OperatorNameMaker.JOIN_PREFIX, jobId);
            Supplier<Processor<? super OUT>> supplier = new JoinAggregateSupplier<>(name, joinType, joinAction);
            ProcessorNode<OUT> commChild = new ProcessorNode(name, temp, supplier);


```

### UNCHECKED_WARNING
Unchecked call to 'ProcessorNode(String, List, Supplier\>)' as a member of raw type 'org.apache.rocketmq.streams.core.topology.virtual.ProcessorNode'
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/JoinedStream.java`
#### Snippet
```java
            String name = OperatorNameMaker.makeName(OperatorNameMaker.JOIN_PREFIX, jobId);
            Supplier<Processor<? super OUT>> supplier = new JoinAggregateSupplier<>(name, joinType, joinAction);
            ProcessorNode<OUT> commChild = new ProcessorNode(name, temp, supplier);


```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Collection'
in `core/src/main/java/org/apache/rocketmq/streams/core/running/MessageQueueListenerWrapper.java`
#### Snippet
```java
        Set<MessageQueue> removeQueue = Sets.difference(ownedQueues, unchangedQueue);

        ownedQueues.addAll(new HashSet<>(addQueue));
        ownedQueues.removeAll(new HashSet<>(removeQueue));

```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `core/src/main/java/org/apache/rocketmq/streams/core/running/MessageQueueListenerWrapper.java`
#### Snippet
```java
        Set<MessageQueue> removeQueue = Sets.difference(ownedQueues, unchangedQueue);

        ownedQueues.addAll(new HashSet<>(addQueue));
        ownedQueues.removeAll(new HashSet<>(removeQueue));

```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `core/src/main/java/org/apache/rocketmq/streams/core/running/MessageQueueListenerWrapper.java`
#### Snippet
```java

        ownedQueues.addAll(new HashSet<>(addQueue));
        ownedQueues.removeAll(new HashSet<>(removeQueue));

        // First step, remove the removeQueue from listener to avoid inflight data in between setting up the state.
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.rocketmq.streams.core.function.accumulator.AvgAccumulator' to 'org.apache.rocketmq.streams.core.function.accumulator.AvgAccumulator'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/accumulator/AvgAccumulator.java`
#### Snippet
```java
    public void merge(Accumulator<V, Double> other) {
        if (other instanceof AvgAccumulator) {
            AvgAccumulator<V> otherAvgAccumulator = (AvgAccumulator) other;
            Integer numOther = otherAvgAccumulator.getNum();
            Double avgOther = otherAvgAccumulator.getAvg();
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
Unused import `import com.google.common.collect.Sets;`
in `core/src/main/java/org/apache/rocketmq/streams/core/state/RocketMQStore.java`
#### Snippet
```java
 */

import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;
import org.apache.rocketmq.client.consumer.DefaultLitePullConsumer;
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinAggregateSupplier.java`
#### Snippet
```java
                            break;
                        }
                    } else if (joinType == JoinType.LEFT_JOIN) {
                        //no-op
                    } else {
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `bytes2State` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowStore.java`
#### Snippet
```java

    private StateStore stateStore;
    private ValueMapperAction<byte[], WindowState<K, V>> bytes2State;
    private ValueMapperAction<WindowState<K, V>, byte[]> state2Bytes;

```

### FieldMayBeFinal
Field `windowInfo` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/JoinedStream.java`
#### Snippet
```java
        private SelectAction<K, V1> leftSelectAction;
        private SelectAction<K, V2> rightSelectAction;
        private WindowInfo windowInfo;

        public JoinWindow(SelectAction<K, V1> leftSelectAction, SelectAction<K, V2> rightSelectAction, WindowInfo windowInfo) {
```

### FieldMayBeFinal
Field `leftSelectAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/JoinedStream.java`
#### Snippet
```java

    public class JoinWindow<K> {
        private SelectAction<K, V1> leftSelectAction;
        private SelectAction<K, V2> rightSelectAction;
        private WindowInfo windowInfo;
```

### FieldMayBeFinal
Field `rightSelectAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/JoinedStream.java`
#### Snippet
```java
    public class JoinWindow<K> {
        private SelectAction<K, V1> leftSelectAction;
        private SelectAction<K, V2> rightSelectAction;
        private WindowInfo windowInfo;

```

### FieldMayBeFinal
Field `rightStream` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/JoinedStream.java`
#### Snippet
```java
public class JoinedStream<V1, V2> {
    private RStream<V1> leftStream;
    private RStream<V2> rightStream;
    private JoinType joinType;

```

### FieldMayBeFinal
Field `joinType` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/JoinedStream.java`
#### Snippet
```java
    private RStream<V1> leftStream;
    private RStream<V2> rightStream;
    private JoinType joinType;

    public JoinedStream(RStream<V1> leftStream, RStream<V2> rightStream, JoinType joinType) {
```

### FieldMayBeFinal
Field `leftStream` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/JoinedStream.java`
#### Snippet
```java

public class JoinedStream<V1, V2> {
    private RStream<V1> leftStream;
    private RStream<V2> rightStream;
    private JoinType joinType;
```

### FieldMayBeFinal
Field `state2Bytes` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowStore.java`
#### Snippet
```java
    private StateStore stateStore;
    private ValueMapperAction<byte[], WindowState<K, V>> bytes2State;
    private ValueMapperAction<WindowState<K, V>, byte[]> state2Bytes;


```

### FieldMayBeFinal
Field `leftSelectAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/JoinedStream.java`
#### Snippet
```java

    public class Where<K> {
        private SelectAction<K, V1> leftSelectAction;
        private SelectAction<K, V2> rightSelectAction;

```

### FieldMayBeFinal
Field `stateStore` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/window/WindowStore.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(WindowStore.class.getName());

    private StateStore stateStore;
    private ValueMapperAction<byte[], WindowState<K, V>> bytes2State;
    private ValueMapperAction<WindowState<K, V>, byte[]> state2Bytes;
```

### FieldMayBeFinal
Field `topicName` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/SourceSupplier.java`
#### Snippet
```java

public class SourceSupplier<K, V> implements Supplier<Processor<V>> {
    private String topicName;
    private KeyValueDeserializer<K, V> deserializer;

```

### FieldMayBeFinal
Field `deserializer` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/SourceSupplier.java`
#### Snippet
```java
public class SourceSupplier<K, V> implements Supplier<Processor<V>> {
    private String topicName;
    private KeyValueDeserializer<K, V> deserializer;

    public SourceSupplier(String topicName, KeyValueDeserializer<K, V> deserializer) {
```

### FieldMayBeFinal
Field `deserializer` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/SourceSupplier.java`
#### Snippet
```java

    private class SourceProcessorImpl extends AbstractProcessor<V> implements SourceProcessor<K, V> {
        private KeyValueDeserializer<K, V> deserializer;

        public SourceProcessorImpl(KeyValueDeserializer<K, V> deserializer) {
```

### FieldMayBeFinal
Field `aggregateAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AggregateSupplier.java`
#### Snippet
```java
    private final String parentName;
    private Supplier<OV> initAction;
    private AggregateAction<K, V, OV> aggregateAction;

    public AggregateSupplier(String currentName, String parentName, Supplier<OV> initAction,
```

### FieldMayBeFinal
Field `initAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AggregateSupplier.java`
#### Snippet
```java
    private final String currentName;
    private final String parentName;
    private Supplier<OV> initAction;
    private AggregateAction<K, V, OV> aggregateAction;

```

### FieldMayBeFinal
Field `accumulator` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AccumulatorSupplier.java`
#### Snippet
```java
    private final String parentName;
    private SelectAction<R, V> selectAction;
    private Accumulator<R, OV> accumulator;

    public AccumulatorSupplier(String currentName, String parentName, SelectAction<R, V> selectAction, Accumulator<R, OV> accumulator) {
```

### FieldMayBeFinal
Field `accumulator` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AccumulatorSupplier.java`
#### Snippet
```java
        private MessageQueue stateTopicMessageQueue;
        private SelectAction<R, V> selectAction;
        private Accumulator<R, OV> accumulator;

        public AccumulatorProcessor(String currentName, String parentName, SelectAction<R, V> selectAction, Accumulator<R, OV> accumulator) {
```

### FieldMayBeFinal
Field `selectAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AccumulatorSupplier.java`
#### Snippet
```java
    private final String currentName;
    private final String parentName;
    private SelectAction<R, V> selectAction;
    private Accumulator<R, OV> accumulator;

```

### FieldMayBeFinal
Field `selectAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AccumulatorSupplier.java`
#### Snippet
```java
        private StateStore stateStore;
        private MessageQueue stateTopicMessageQueue;
        private SelectAction<R, V> selectAction;
        private Accumulator<R, OV> accumulator;

```

### FieldMayBeFinal
Field `joinType` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinAggregateSupplier.java`
#### Snippet
```java
    private class JoinStreamAggregateProcessor extends AbstractProcessor<Object> {
        private String name;
        private JoinType joinType;
        private final ValueJoinAction<V1, V2, OUT> joinAction;
        private MessageQueue stateTopicMessageQueue;
```

### FieldMayBeFinal
Field `joinType` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinAggregateSupplier.java`
#### Snippet
```java

    private String name;
    private JoinType joinType;
    private final ValueJoinAction<V1, V2, OUT> joinAction;

```

### FieldMayBeFinal
Field `name` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinAggregateSupplier.java`
#### Snippet
```java

    private class JoinStreamAggregateProcessor extends AbstractProcessor<Object> {
        private String name;
        private JoinType joinType;
        private final ValueJoinAction<V1, V2, OUT> joinAction;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinAggregateSupplier.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(JoinAggregateSupplier.class.getName());

    private String name;
    private JoinType joinType;
    private final ValueJoinAction<V1, V2, OUT> joinAction;
```

### FieldMayBeFinal
Field `filterAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/FilterSupplier.java`
#### Snippet
```java

public class FilterSupplier<T> implements Supplier<Processor<T>> {
    private FilterAction<T> filterAction;

    public FilterSupplier(FilterAction<T> filterAction) {
```

### FieldMayBeFinal
Field `aggregateAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
        private String name;
        private Supplier<OV> initAction;
        private AggregateAction<K, V, OV> aggregateAction;
        private MessageQueue stateTopicMessageQueue;
        private WindowStore<K, OV> windowStore;
```

### FieldMayBeFinal
Field `initAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
    private String name;
    private WindowInfo windowInfo;
    private Supplier<OV> initAction;
    private AggregateAction<K, V, OV> aggregateAction;

```

### FieldMayBeFinal
Field `windowInfo` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(WindowAggregateSupplier.class.getName());
    private String name;
    private WindowInfo windowInfo;
    private Supplier<OV> initAction;
    private AggregateAction<K, V, OV> aggregateAction;
```

### FieldMayBeFinal
Field `aggregateAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
    private WindowInfo windowInfo;
    private Supplier<OV> initAction;
    private AggregateAction<K, V, OV> aggregateAction;

    public WindowAggregateSupplier(String name, WindowInfo windowInfo, Supplier<OV> initAction, AggregateAction<K, V, OV> aggregateAction) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
public class WindowAggregateSupplier<K, V, OV> implements Supplier<Processor<V>> {
    private static final Logger logger = LoggerFactory.getLogger(WindowAggregateSupplier.class.getName());
    private String name;
    private WindowInfo windowInfo;
    private Supplier<OV> initAction;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
    private class WindowAggregateProcessor extends AbstractWindowProcessor<V> {
        private final WindowInfo windowInfo;
        private String name;
        private Supplier<OV> initAction;
        private AggregateAction<K, V, OV> aggregateAction;
```

### FieldMayBeFinal
Field `initAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
        private final String name;
        private final WindowInfo windowInfo;
        private Supplier<OV> initAction;
        private AggregateAction<K, V, OV> aggregateAction;
        private MessageQueue stateTopicMessageQueue;
```

### FieldMayBeFinal
Field `initAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
        private final WindowInfo windowInfo;
        private String name;
        private Supplier<OV> initAction;
        private AggregateAction<K, V, OV> aggregateAction;
        private MessageQueue stateTopicMessageQueue;
```

### FieldMayBeFinal
Field `aggregateAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAggregateSupplier.java`
#### Snippet
```java
        private final WindowInfo windowInfo;
        private Supplier<OV> initAction;
        private AggregateAction<K, V, OV> aggregateAction;
        private MessageQueue stateTopicMessageQueue;
        private WindowStore<K, OV> windowStore;
```

### FieldMayBeFinal
Field `windowInfo` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(WindowAccumulatorSupplier.class.getName());
    private final String name;
    private WindowInfo windowInfo;
    private SelectAction<R, V> selectAction;
    private Accumulator<R, OV> accumulator;
```

### FieldMayBeFinal
Field `accumulator` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
    private WindowInfo windowInfo;
    private SelectAction<R, V> selectAction;
    private Accumulator<R, OV> accumulator;

    public WindowAccumulatorSupplier(String name, WindowInfo windowInfo,
```

### FieldMayBeFinal
Field `selectAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
    private final String name;
    private WindowInfo windowInfo;
    private SelectAction<R, V> selectAction;
    private Accumulator<R, OV> accumulator;

```

### FieldMayBeFinal
Field `accumulator` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
        private MessageQueue stateTopicMessageQueue;
        private SelectAction<R, V> selectAction;
        private Accumulator<R, OV> accumulator;
        private WindowStore<K, Accumulator<R, OV>> windowStore;

```

### FieldMayBeFinal
Field `selectAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
        private String name;
        private MessageQueue stateTopicMessageQueue;
        private SelectAction<R, V> selectAction;
        private Accumulator<R, OV> accumulator;
        private WindowStore<K, Accumulator<R, OV>> windowStore;
```

### FieldMayBeFinal
Field `selectAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
        private final WindowInfo windowInfo;
        private MessageQueue stateTopicMessageQueue;
        private SelectAction<R, V> selectAction;
        private Accumulator<R, OV> accumulator;
        private WindowStore<K, Accumulator<R, OV>> windowStore;
```

### FieldMayBeFinal
Field `accumulator` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
        private MessageQueue stateTopicMessageQueue;
        private SelectAction<R, V> selectAction;
        private Accumulator<R, OV> accumulator;
        private WindowStore<K, Accumulator<R, OV>> windowStore;

```

### FieldMayBeFinal
Field `name` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
    public class WindowAccumulatorProcessor extends AbstractWindowProcessor<V> {
        private final WindowInfo windowInfo;
        private String name;
        private MessageQueue stateTopicMessageQueue;
        private SelectAction<R, V> selectAction;
```

### FieldMayBeFinal
Field `foreachAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/ForeachSupplier.java`
#### Snippet
```java

    class ForeachProcessor extends AbstractProcessor<T> {
        private ForeachAction<T> foreachAction;

        public ForeachProcessor(ForeachAction<T> foreachAction) {
```

### FieldMayBeFinal
Field `foreachAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/ForeachSupplier.java`
#### Snippet
```java

public class ForeachSupplier<T> implements Supplier<Processor<T>> {
    private ForeachAction<T> foreachAction;

    public ForeachSupplier(ForeachAction<T> foreachAction) {
```

### FieldMayBeFinal
Field `topicName` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/topology/virtual/SourceGraphNode.java`
#### Snippet
```java
public class SourceGraphNode<T> extends AbstractGraphNode {
    private Supplier<Processor<T>> supplier;
    private String topicName;


```

### FieldMayBeFinal
Field `supplier` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/topology/virtual/SourceGraphNode.java`
#### Snippet
```java

public class SourceGraphNode<T> extends AbstractGraphNode {
    private Supplier<Processor<T>> supplier;
    private String topicName;

```

### FieldMayBeFinal
Field `windowInfo` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinWindowAggregateSupplier.java`
#### Snippet
```java

    private String name;
    private WindowInfo windowInfo;
    private final ValueJoinAction<V1, V2, OUT> joinAction;
    private JoinType joinType;
```

### FieldMayBeFinal
Field `joinType` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinWindowAggregateSupplier.java`
#### Snippet
```java
    private WindowInfo windowInfo;
    private final ValueJoinAction<V1, V2, OUT> joinAction;
    private JoinType joinType;

    public JoinWindowAggregateSupplier(String name, WindowInfo windowInfo, ValueJoinAction<V1, V2, OUT> joinAction) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinWindowAggregateSupplier.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    private class JoinStreamWindowAggregateProcessor extends AbstractWindowProcessor<Object> {
        private String name;
        private final WindowInfo windowInfo;
        private final JoinType joinType;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinWindowAggregateSupplier.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(JoinWindowAggregateSupplier.class.getName());

    private String name;
    private WindowInfo windowInfo;
    private final ValueJoinAction<V1, V2, OUT> joinAction;
```

### FieldMayBeFinal
Field `joinAction` may be 'final'
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/JoinWindowAggregateSupplier.java`
#### Snippet
```java
        private final WindowInfo windowInfo;
        private final JoinType joinType;
        private ValueJoinAction<V1, V2, OUT> joinAction;
        private MessageQueue stateTopicMessageQueue;
        private WindowStore<K, V1> leftWindowStore;
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

## RuleId[id=RefusedBequest]
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
in `core/src/main/java/org/apache/rocketmq/streams/core/function/accumulator/CountAccumulator.java`
#### Snippet
```java

    @Override
    public Accumulator<V, Integer> clone() {
        CountAccumulator<V> accumulator = new CountAccumulator<>();
        accumulator.count = this.count;
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AccumulatorSupplier.java`
#### Snippet
```java
            byte[] newValueBytes = super.object2Byte(value);

            stateStore.put(this.stateTopicMessageQueue, keyBytes, newValueBytes);

            Data<K, OV> temp = new Data<>(key, result, this.context.getDataTime(), this.context.getHeader());
            Data<K, V> convert = super.convert(temp);

            this.context.forward(convert);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
            super.preProcess(context);
            this.windowStore = new WindowStore<>(super.waitStateReplay(),
                    WindowState::byte2WindowState,
                    WindowState::windowState2Byte);

            this.idleWindowScaner = context.getDefaultWindowScaner();

            String stateTopicName = context.getSourceTopic() + Constant.STATE_TOPIC_SUFFIX;
            this.stateTopicMessageQueue = new MessageQueue(stateTopicName, context.getSourceBrokerName(), context.getSourceQueueId());
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
            Throwable throwable = errorReference.get();
            if (throwable != null) {
                errorReference.set(null);
                throw throwable;
            }

            K key = this.context.getKey();
            long time = this.context.getDataTime();

            long watermark = this.watermark(time - allowDelay, stateTopicMessageQueue);
            if (time < watermark) {
                //delay data.
                logger.warn("discard delay data:[{}]. time of data:{}, watermark:{}", data, time, watermark);
                return;
            }

            //f(time) -> List<Window>
            List<Window> windows = super.calculateWindow(windowInfo, time);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
            super.preProcess(context);
            this.windowStore = new WindowStore<>(super.waitStateReplay(),
                    WindowState::byte2WindowState,
                    WindowState::windowState2Byte);

            this.idleWindowScaner = context.getDefaultWindowScaner();
            this.idleWindowScaner.initSessionTimeOut(windowInfo.getSessionTimeout().toMilliseconds());

            String stateTopicName = context.getSourceTopic() + Constant.STATE_TOPIC_SUFFIX;
            this.stateTopicMessageQueue = new MessageQueue(stateTopicName, context.getSourceBrokerName(), context.getSourceQueueId());
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
            K key = this.context.getKey();
            long time = this.context.getDataTime();

            long watermark = this.watermark(time - allowDelay, stateTopicMessageQueue);
            if (time < watermark) {
                logger.warn("discard delay data:[{}]. time of data:{}, watermark:{}", data, time, watermark);
                return;
            }
            //本地存储里面搜索下
            Pair<Long, Long> newSessionWindowTime = fireIfSessionOut(key, data, time, watermark);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
                if (time < state.getRecordEarliestTimestamp()) {
                    //更新最早时间戳，用于状态触发时候，作为session 窗口的begin时间戳
                    state.setRecordEarliestTimestamp(time);
                }

                WindowKey windowKey = new WindowKey(name, super.toHexString(key), newSessionWindowTime.getValue(), newSessionWindowTime.getKey());
                logger.info("new session window, with key={}, valueTime={}, sessionBegin=[{}], sessionEnd=[{}]", key, Utils.format(time),
                        Utils.format(newSessionWindowTime.getKey()), Utils.format(newSessionWindowTime.getValue()));
                this.windowStore.put(stateTopicMessageQueue, windowKey, state);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/WindowAccumulatorSupplier.java`
#### Snippet
```java
                    state.setValue(value);
                    state.setRecordLastTimestamp(dataTime);
                    if (dataTime < state.getRecordEarliestTimestamp()) {
                        //更新最早时间戳，用于状态触发时候，作为session 窗口的begin时间戳
                        state.setRecordEarliestTimestamp(dataTime);
                    }

                    //如果是最后一个窗口，更新窗口结束时间
                    if (i == pairs.size() - 1) {
                        long mayBeSessionEnd = dataTime + windowInfo.getSessionTimeout().toMilliseconds();
                        if (windowKey.getWindowEnd() < mayBeSessionEnd) {
                            logger.debug("update exist session window, before:[{} - {}], after:[{} - {}]", Utils.format(windowKey.getWindowStart()), Utils.format(windowKey.getWindowEnd()),
                                    Utils.format(windowKey.getWindowStart()), Utils.format(mayBeSessionEnd));
                            //删除老状态
                            needToDelete = windowKey;
                            //需要保存的新状态
                            windowKey = new WindowKey(windowKey.getOperatorName(), windowKey.getKey2String(), mayBeSessionEnd, windowKey.getWindowStart());
                        }
                    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/GroupedStreamImpl.java`
#### Snippet
```java
        String name = OperatorNameMaker.makeName(COUNT_PREFIX, pipeline.getJobId());

        Supplier<Processor<V>> supplier = new AggregateSupplier<>(name, parent.getName(), () -> 0, (K key, V value, Integer agg) -> agg + 1);

        GraphNode graphNode;
        if (this.parent.shuffleNode()) {
            graphNode = new ShuffleProcessorNode<>(name, parent.getName(), supplier);
        } else {
            graphNode = new ProcessorNode<>(name, parent.getName(), supplier);
        }

        return this.pipeline.addGroupedStreamVirtualNode(graphNode, parent);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/GroupedStreamImpl.java`
#### Snippet
```java
        GraphNode graphNode;
        if (this.parent.shuffleNode()) {
            graphNode = new ShuffleProcessorNode<>(name, parent.getName(), supplier);
        } else {
            graphNode = new ProcessorNode<>(name, parent.getName(), supplier);
        }

        return this.pipeline.addGroupedStreamVirtualNode(graphNode, parent);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/GroupedStreamImpl.java`
#### Snippet
```java
        String name = OperatorNameMaker.makeName(MIN_PREFIX, pipeline.getJobId());

        Supplier<Processor<V>> supplier = new AggregateSupplier<>(name, parent.getName(), () -> null, (AggregateAction<K, V, V>) (key, value, accumulator) -> {
            Number number = selectAction.select(value);
            if (accumulator == null) {
                return value;
            } else {
                Number storedMin = selectAction.select(accumulator);
                double newValue = number.doubleValue();
                double oldValue = storedMin.doubleValue();

                if (newValue < oldValue) {
                    return value;
                } else {
                    return accumulator;
                }
            }
        });

        GraphNode graphNode;
        if (this.parent.shuffleNode()) {
            graphNode = new ShuffleProcessorNode<>(name, parent.getName(), supplier);
        } else {
            graphNode = new ProcessorNode<>(name, parent.getName(), supplier);
        }

        return this.pipeline.addGroupedStreamVirtualNode(graphNode, parent);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/GroupedStreamImpl.java`
#### Snippet
```java
        String name = OperatorNameMaker.makeName(SINK_PREFIX, pipeline.getJobId());

        SinkSupplier<K, V> sinkSupplier = new SinkSupplier<>(topicName, serializer);
        GraphNode sinkGraphNode = new SinkGraphNode<>(name, parent.getName(), topicName, sinkSupplier);

        pipeline.addVirtualSink(sinkGraphNode, parent);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/WindowStreamImpl.java`
#### Snippet
```java
        ProcessorNode<V> node;
        if (this.parent.shuffleNode()) {
            node = new ShuffleProcessorNode<>(name, parent.getName(), supplier);
        } else {
            node = new ProcessorNode<>(name, parent.getName(), supplier);
        }

        return this.pipeline.addWindowStreamVirtualNode(node, parent, windowInfo);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/WindowStreamImpl.java`
#### Snippet
```java
        String name = OperatorNameMaker.makeName(MIN_PREFIX, pipeline.getJobId());

        Supplier<Processor<V>> supplier = new WindowAggregateSupplier<>(name, windowInfo, () -> null, (AggregateAction<K, V, V>) (key, value, accumulator) -> {
            Number number = selectAction.select(value);
            if (accumulator == null) {
                return value;
            } else {
                Number storedMin = selectAction.select(accumulator);
                double newValue = number.doubleValue();
                double oldValue = storedMin.doubleValue();

                if (newValue < oldValue) {
                    return value;
                } else {
                    return accumulator;
                }
            }
        });

        GraphNode graphNode;
        if (this.parent.shuffleNode()) {
            graphNode = new ShuffleProcessorNode<>(name, parent.getName(), supplier);
        } else {
            graphNode = new ProcessorNode<>(name, parent.getName(), supplier);
        }

        return this.pipeline.addWindowStreamVirtualNode(graphNode, parent, windowInfo);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/rocketmq/streams/core/rstream/WindowStreamImpl.java`
#### Snippet
```java
        GraphNode graphNode;
        if (this.parent.shuffleNode()) {
            graphNode = new ShuffleProcessorNode<>(name, parent.getName(), supplier);
        } else {
            graphNode = new ProcessorNode<>(name, parent.getName(), supplier);
        }

        return this.pipeline.addWindowStreamVirtualNode(graphNode, parent, windowInfo);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/rocketmq/streams/core/running/AbstractProcessor.java`
#### Snippet
```java
        buf.writeInt(className.length);
        buf.writeBytes(className);
        buf.writeInt(objBytes.length);
        buf.writeBytes(objBytes);


        byte[] bytes = new byte[buf.readableBytes()];
        buf.readBytes(bytes);

        buf.clear();
        return bytes;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/rocketmq/streams/core/state/AbstractStore.java`
#### Snippet
```java
                Set<Map.Entry<String, Set<byte[]>>> entries = calculating.entrySet();
                Iterator<Map.Entry<String, Set<byte[]>>> iterator = entries.iterator();
                while (iterator.hasNext()) {
                    Map.Entry<String, Set<byte[]>> next = iterator.next();

                    Set<byte[]> keySet = next.getValue();

                    if (keySet != null) {
                        keySet.removeIf(rocksDBKey -> Arrays.equals(rocksDBKey, key));
                        if (keySet.size() == 0) {
                            iterator.remove();
                        }
                    }
                }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AccumulatorSessionWindowFire.java`
#### Snippet
```java
                long windowEnd = windowKey.getWindowEnd();
                long windowBegin;
                if (state.getRecordEarliestTimestamp() == Long.MAX_VALUE) {
                    windowBegin = windowKey.getWindowStart();
                } else {
                    windowBegin = state.getRecordEarliestTimestamp();
                }

                logger.info("fire session,windowKey={}, search keyPrefix={}, window: [{} - {}]",
                        windowKey, state.getKey().toString(), Utils.format(windowBegin), Utils.format(windowEnd));
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/rocketmq/streams/core/window/fire/AccumulatorSessionWindowFire.java`
#### Snippet
```java
                Accumulator<R, OV> value = state.getValue();
                OV data = value.result(header);

                Data<K, OV> result = new Data<>(state.getKey(), data, state.getRecordLastTimestamp(), header);
                Data<K, V> convert = this.convert(result);
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/streams/examples/WordCount.java`
#### Snippet
```java
        TopologyBuilder topologyBuilder = builder.build();

        Properties properties = new Properties();
        properties.put(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");

        RocketMQStream rocketMQStream = new RocketMQStream(topologyBuilder, properties);


        Runtime.getRuntime().addShutdownHook(new Thread("wordcount-shutdown-hook") {
            @Override
            public void run() {
                rocketMQStream.stop();
            }
        });

        rocketMQStream.start();
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/streams/examples/joinWindow/JoinWindow.java`
#### Snippet
```java
        RStream<User> user = builder.source("user", total -> {
            User user1 = JSON.parseObject(total, User.class);
            return new Pair<>(null, user1);
        });

        RStream<Num> num = builder.source("num", source -> {
            Num user12 = JSON.parseObject(source, Num.class);
            return new Pair<>(null, user12);
        });

        ValueJoinAction<User, Num, Union> action = new ValueJoinAction<User, Num, Union>() {
            @Override
            public Union apply(User value1, Num value2) {
                if (value1 != null && value2 != null) {
                    System.out.println("name in user: " + value1.getName());
                    System.out.println("name in num: " + value2.getName());

                    return new Union(value1.getName(), value1.getAge(), value2.getNum());
                }

                if (value2 != null) {
                    System.out.println("name in num: " + value2.getName());
                    return new Union(value2.getName(), 0, value2.getNum());
                }


                if (value1 != null) {
                    System.out.println("name in num: " + value1.getName());
                    return new Union(value1.getName(), value1.getAge(), 0);
                }

                throw new IllegalStateException();
            }
        };
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/streams/examples/sink/WordCountSink.java`
#### Snippet
```java
        builder.source("sourceTopic", total -> {
                    String value = new String(total, StandardCharsets.UTF_8);
                    return new Pair<>(null, value);
                })
                .flatMap((ValueMapperAction<String, List<String>>) value -> {
                    String[] splits = value.toLowerCase().split("\\W+");
                    return Arrays.asList(splits);
                })
                .keyBy(value -> value)
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/SessionWindowCount.java`
#### Snippet
```java
        TopologyBuilder topologyBuilder = builder.build();

        Properties properties = new Properties();
        properties.putIfAbsent(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");

        RocketMQStream rocketMQStream = new RocketMQStream(topologyBuilder, properties);
        Runtime.getRuntime().addShutdownHook(new Thread("wordcount-shutdown-hook") {
            @Override
            public void run() {
                rocketMQStream.stop();
            }
        });

        rocketMQStream.start();
```

### DuplicatedCode
Duplicated code
in `example/src/main/java/org/apache/rocketmq/streams/examples/window/WindowMin.java`
#### Snippet
```java
        TopologyBuilder topologyBuilder = builder.build();

        Properties properties = new Properties();
        properties.putIfAbsent(MixAll.NAMESRV_ADDR_PROPERTY, "127.0.0.1:9876");
        properties.put(StreamConfig.ALLOW_LATENESS_MILLISECOND, 2000);

        RocketMQStream rocketMQStream = new RocketMQStream(topologyBuilder, properties);

        Runtime.getRuntime().addShutdownHook(new Thread("wordcount-shutdown-hook") {
            @Override
            public void run() {
                rocketMQStream.stop();
            }
        });

        rocketMQStream.start();
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

## RuleId[id=StringBufferReplaceableByString]
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

## RuleId[id=Deprecation]
### Deprecation
'org.apache.commons.cli.PosixParser' is deprecated
in `core/src/main/java/org/apache/rocketmq/streams/core/util/RocketMQUtil.java`
#### Snippet
```java
        }

        final CommandLine commandLine = ServerUtil.parseCmdLine("mqadmin " + cmd.commandName(), args, cmd.buildCommandlineOptions(options), new PosixParser());

        String namesrvAddr = commandLine.getOptionValue('n');
```

### Deprecation
'org.apache.commons.cli.PosixParser' is deprecated
in `core/src/main/java/org/apache/rocketmq/streams/core/util/RocketMQUtil.java`
#### Snippet
```java
        };

        final CommandLine commandLine = ServerUtil.parseCmdLine("mqadmin " + command.commandName(), args, command.buildCommandlineOptions(options), new PosixParser());
        String namesrvAddr = commandLine.getOptionValue('n');
        System.setProperty(MixAll.NAMESRV_ADDR_PROPERTY, namesrvAddr);
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

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Set' may not contain objects of type 'Object'
in `core/src/main/java/org/apache/rocketmq/streams/core/running/MessageQueueListenerWrapper.java`
#### Snippet
```java

        ownedQueues.addAll(new HashSet<>(addQueue));
        ownedQueues.removeAll(new HashSet<>(removeQueue));

        // First step, remove the removeQueue from listener to avoid inflight data in between setting up the state.
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/SourceSupplier.java`
#### Snippet
```java

public class SourceSupplier<K, V> implements Supplier<Processor<V>> {
    private String topicName;
    private KeyValueDeserializer<K, V> deserializer;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AggregateSupplier.java`
#### Snippet
```java
    private class AggregateProcessor extends AbstractProcessor<V> {
        private final String currentName;
        private final String parentName;
        private final Supplier<OV> initAction;
        private final AggregateAction<K, V, OV> aggregateAction;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AggregateSupplier.java`
#### Snippet
```java

    private class AggregateProcessor extends AbstractProcessor<V> {
        private final String currentName;
        private final String parentName;
        private final Supplier<OV> initAction;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AccumulatorSupplier.java`
#### Snippet
```java
    private class AccumulatorProcessor extends AbstractProcessor<V> {
        private final String currentName;
        private final String parentName;
        private StateStore stateStore;
        private MessageQueue stateTopicMessageQueue;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/org/apache/rocketmq/streams/core/function/supplier/AccumulatorSupplier.java`
#### Snippet
```java

    private class AccumulatorProcessor extends AbstractProcessor<V> {
        private final String currentName;
        private final String parentName;
        private StateStore stateStore;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/org/apache/rocketmq/streams/core/topology/real/SourceFactory.java`
#### Snippet
```java
public class SourceFactory<T> implements RealProcessorFactory<T> {
    private final String name;
    private final String topic;
    private final Supplier<Processor<T>> supplier;

```

