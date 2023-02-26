# streams 
 
# Bad smells
I found 41 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 26 | false |
| DeprecatedIsStillUsed | 6 | false |
| UnstableApiUsage | 4 | false |
| RedundantFieldInitialization | 1 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| ReturnNull | 1 | false |
| SimplifyOptionalCallChains | 1 | false |
| RedundantSuppression | 1 | false |
## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `streams/src/main/java/com/palantir/common/streams/BufferingSpliterator.java`
#### Snippet
```java
    private final CompletionStrategy completionStrategy;

    private int inProgress = 0;

    BufferingSpliterator(
```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optionalValue'
in `streams/src/main/java/com/palantir/common/streams/MoreStreams.java`
#### Snippet
```java
     */
    @Deprecated
    public static <T> Stream<T> stream(Optional<T> optionalValue) {
        return optionalValue.map(Stream::of).orElseGet(Stream::empty);
    }
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `streams/src/main/java/com/palantir/common/streams/BufferingSpliterator.java`
#### Snippet
```java
    @Override
    public Spliterator<F> trySplit() {
        return null;
    }

```

## RuleId[ruleID=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Optional chain can be simplified
in `streams/src/main/java/com/palantir/common/streams/MoreStreams.java`
#### Snippet
```java
    @Deprecated
    public static <T> Stream<T> stream(Optional<T> optionalValue) {
        return optionalValue.map(Stream::of).orElseGet(Stream::empty);
    }

```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends U`
in `streams/src/main/java/com/palantir/common/streams/BufferingSpliterator.java`
#### Snippet
```java

    BufferingSpliterator(
            CompletionStrategy completionStrategy, Spliterator<U> input, Function<U, F> toFuture, int maxParallelism) {
        this.completionStrategy = completionStrategy;
        checkArgument(maxParallelism > 0, "maxParallelism must be at least 1 (got %s)", new Object[] {maxParallelism});
```

### BoundedWildcard
Can generalize to `? super U`
in `streams/src/main/java/com/palantir/common/streams/BufferingSpliterator.java`
#### Snippet
```java

    BufferingSpliterator(
            CompletionStrategy completionStrategy, Spliterator<U> input, Function<U, F> toFuture, int maxParallelism) {
        this.completionStrategy = completionStrategy;
        checkArgument(maxParallelism > 0, "maxParallelism must be at least 1 (got %s)", new Object[] {maxParallelism});
```

### BoundedWildcard
Can generalize to `? extends F`
in `streams/src/main/java/com/palantir/common/streams/BufferingSpliterator.java`
#### Snippet
```java

    BufferingSpliterator(
            CompletionStrategy completionStrategy, Spliterator<U> input, Function<U, F> toFuture, int maxParallelism) {
        this.completionStrategy = completionStrategy;
        checkArgument(maxParallelism > 0, "maxParallelism must be at least 1 (got %s)", new Object[] {maxParallelism});
```

### BoundedWildcard
Can generalize to `? super K`
in `streams/src/main/java/com/palantir/common/streams/KeyedStream.java`
#### Snippet
```java
     * performing the provided action on each element of this stream.
     */
    default KeyedStream<K, V> peek(BiConsumer<K, V> consumer) {
        return new KeyedStreamImpl<>(entries().peek(entry -> consumer.accept(entry.getKey(), entry.getValue())));
    }
```

### BoundedWildcard
Can generalize to `? super V`
in `streams/src/main/java/com/palantir/common/streams/KeyedStream.java`
#### Snippet
```java
     * performing the provided action on each element of this stream.
     */
    default KeyedStream<K, V> peek(BiConsumer<K, V> consumer) {
        return new KeyedStreamImpl<>(entries().peek(entry -> consumer.accept(entry.getKey(), entry.getValue())));
    }
```

### BoundedWildcard
Can generalize to `? extends Map.Entry`
in `streams/src/main/java/com/palantir/common/streams/KeyedStream.java`
#### Snippet
```java
     * Returns a keyed stream of Entries.
     */
    static <K, V> KeyedStream<K, V> ofEntries(Stream<Map.Entry<K, V>> entries) {
        return new KeyedStreamImpl<K, V>(entries.map(entry -> entry));
    }
```

### BoundedWildcard
Can generalize to `? extends V`
in `streams/src/main/java/com/palantir/common/streams/KeyedStream.java`
#### Snippet
```java
     * Returns a keyed stream with matching keys and values taken from {@code stream}.
     */
    static <V> KeyedStream<V, V> of(Stream<V> stream) {
        return KeyedStream.ofEntries(stream.map(value -> Maps.immutableEntry(value, value)));
    }
```

### BoundedWildcard
Can generalize to `? extends U`
in `streams/src/main/java/com/palantir/common/streams/MoreStreams.java`
#### Snippet
```java
     */
    public static <U, V> Stream<V> inCompletionOrder(
            Stream<U> arguments, Function<U, V> mapper, Executor executor, int maxParallelism) {
        return StreamSupport.stream(
                        new BufferingSpliterator<>(
```

### BoundedWildcard
Can generalize to `? super U`
in `streams/src/main/java/com/palantir/common/streams/MoreStreams.java`
#### Snippet
```java
     */
    public static <U, V> Stream<V> inCompletionOrder(
            Stream<U> arguments, Function<U, V> mapper, Executor executor, int maxParallelism) {
        return StreamSupport.stream(
                        new BufferingSpliterator<>(
```

### BoundedWildcard
Can generalize to `? extends V`
in `streams/src/main/java/com/palantir/common/streams/MoreStreams.java`
#### Snippet
```java
     */
    public static <U, V> Stream<V> inCompletionOrder(
            Stream<U> arguments, Function<U, V> mapper, Executor executor, int maxParallelism) {
        return StreamSupport.stream(
                        new BufferingSpliterator<>(
```

### BoundedWildcard
Can generalize to `? extends T`
in `streams/src/main/java/com/palantir/common/streams/MoreStreams.java`
#### Snippet
```java
     */
    @Deprecated
    public static <T> Stream<T> stream(Iterator<T> iterator) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, 0), NOT_PARALLEL);
    }
```

### BoundedWildcard
Can generalize to `? extends U`
in `streams/src/main/java/com/palantir/common/streams/MoreStreams.java`
#### Snippet
```java
     */
    public static <U, V> Stream<V> blockingStreamWithParallelism(
            Stream<U> arguments, Function<U, V> mapper, Executor executor, int maxParallelism) {
        return StreamSupport.stream(
                        new BufferingSpliterator<>(
```

### BoundedWildcard
Can generalize to `? super U`
in `streams/src/main/java/com/palantir/common/streams/MoreStreams.java`
#### Snippet
```java
     */
    public static <U, V> Stream<V> blockingStreamWithParallelism(
            Stream<U> arguments, Function<U, V> mapper, Executor executor, int maxParallelism) {
        return StreamSupport.stream(
                        new BufferingSpliterator<>(
```

### BoundedWildcard
Can generalize to `? extends V`
in `streams/src/main/java/com/palantir/common/streams/MoreStreams.java`
#### Snippet
```java
     */
    public static <U, V> Stream<V> blockingStreamWithParallelism(
            Stream<U> arguments, Function<U, V> mapper, Executor executor, int maxParallelism) {
        return StreamSupport.stream(
                        new BufferingSpliterator<>(
```

### BoundedWildcard
Can generalize to `? extends F`
in `streams/src/main/java/com/palantir/common/streams/MoreStreams.java`
#### Snippet
```java
    @Deprecated
    public static <T, F extends ListenableFuture<T>> Stream<F> blockingStreamWithParallelism(
            Stream<F> futures, int maxParallelism) {
        return StreamSupport.stream(
                        new BufferingSpliterator<>(
```

### BoundedWildcard
Can generalize to `? super T`
in `streams/src/main/java/com/palantir/common/streams/MoreCollectors.java`
#### Snippet
```java
    @Deprecated
    public static <T, K, V> Collector<T, ?, Map<K, V>> toImmutableMap(
            Function<T, K> keyFunction, Function<T, V> valueFunction) {
        return Collector.of(
                ImmutableMap::<K, V>builder,
```

### BoundedWildcard
Can generalize to `? extends K`
in `streams/src/main/java/com/palantir/common/streams/MoreCollectors.java`
#### Snippet
```java
    @Deprecated
    public static <T, K, V> Collector<T, ?, Map<K, V>> toImmutableMap(
            Function<T, K> keyFunction, Function<T, V> valueFunction) {
        return Collector.of(
                ImmutableMap::<K, V>builder,
```

### BoundedWildcard
Can generalize to `? super T`
in `streams/src/main/java/com/palantir/common/streams/MoreCollectors.java`
#### Snippet
```java
    @Deprecated
    public static <T, K, V> Collector<T, ?, Map<K, V>> toImmutableMap(
            Function<T, K> keyFunction, Function<T, V> valueFunction) {
        return Collector.of(
                ImmutableMap::<K, V>builder,
```

### BoundedWildcard
Can generalize to `? extends V`
in `streams/src/main/java/com/palantir/common/streams/MoreCollectors.java`
#### Snippet
```java
    @Deprecated
    public static <T, K, V> Collector<T, ?, Map<K, V>> toImmutableMap(
            Function<T, K> keyFunction, Function<T, V> valueFunction) {
        return Collector.of(
                ImmutableMap::<K, V>builder,
```

### BoundedWildcard
Can generalize to `? super V`
in `streams/src/main/java/com/palantir/common/streams/KeyedStreamImpl.java`
#### Snippet
```java
    }

    private static <K, V> void combine(Map<K, V> map, Map<K, V> entries) {
        Set<K> duplicates = Sets.intersection(map.keySet(), entries.keySet());
        if (!duplicates.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends K`
in `streams/src/main/java/com/palantir/common/streams/KeyedStreamImpl.java`
#### Snippet
```java
    }

    private static <K, V> void combine(Map<K, V> map, Map<K, V> entries) {
        Set<K> duplicates = Sets.intersection(map.keySet(), entries.keySet());
        if (!duplicates.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends V`
in `streams/src/main/java/com/palantir/common/streams/KeyedStreamImpl.java`
#### Snippet
```java
    }

    private static <K, V> void combine(Map<K, V> map, Map<K, V> entries) {
        Set<K> duplicates = Sets.intersection(map.keySet(), entries.keySet());
        if (!duplicates.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? super K`
in `streams/src/main/java/com/palantir/common/streams/KeyedStreamImpl.java`
#### Snippet
```java
    }

    private static <K, V> void combine(Multimap<K, V> multimap, Multimap<K, V> entries) {
        multimap.putAll(entries);
    }
```

### BoundedWildcard
Can generalize to `? super V`
in `streams/src/main/java/com/palantir/common/streams/KeyedStreamImpl.java`
#### Snippet
```java
    }

    private static <K, V> void combine(Multimap<K, V> multimap, Multimap<K, V> entries) {
        multimap.putAll(entries);
    }
```

### BoundedWildcard
Can generalize to `? extends K`
in `streams/src/main/java/com/palantir/common/streams/KeyedStreamImpl.java`
#### Snippet
```java
    }

    private static <K, V> void combine(Multimap<K, V> multimap, Multimap<K, V> entries) {
        multimap.putAll(entries);
    }
```

### BoundedWildcard
Can generalize to `? extends V`
in `streams/src/main/java/com/palantir/common/streams/KeyedStreamImpl.java`
#### Snippet
```java
    }

    private static <K, V> void combine(Multimap<K, V> multimap, Multimap<K, V> entries) {
        multimap.putAll(entries);
    }
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'inCompletionOrder' is still used
in `streams/src/main/java/com/palantir/common/streams/MoreStreams.java`
#### Snippet
```java
     */
    @Deprecated
    public static <T, F extends ListenableFuture<T>> Stream<F> inCompletionOrder(
            Stream<F> futures, int maxParallelism) {
        return StreamSupport.stream(
```

### DeprecatedIsStillUsed
Deprecated member 'stream' is still used
in `streams/src/main/java/com/palantir/common/streams/MoreStreams.java`
#### Snippet
```java
     */
    @Deprecated
    public static <T> Stream<T> stream(Iterable<? extends T> iterable) {
        @SuppressWarnings("unchecked")
        Stream<T> stream = (Stream<T>) StreamSupport.stream(iterable.spliterator(), NOT_PARALLEL);
```

### DeprecatedIsStillUsed
Deprecated member 'blockingStreamWithParallelism' is still used
in `streams/src/main/java/com/palantir/common/streams/MoreStreams.java`
#### Snippet
```java
     */
    @Deprecated
    public static <T, F extends ListenableFuture<T>> Stream<F> blockingStreamWithParallelism(
            Stream<F> futures, int maxParallelism) {
        return StreamSupport.stream(
```

### DeprecatedIsStillUsed
Deprecated member 'toImmutableSet' is still used
in `streams/src/main/java/com/palantir/common/streams/MoreCollectors.java`
#### Snippet
```java
     */
    @Deprecated
    public static <T> Collector<T, ?, Set<T>> toImmutableSet() {
        return Collector.of(
                ImmutableSet::<T>builder,
```

### DeprecatedIsStillUsed
Deprecated member 'toImmutableMap' is still used
in `streams/src/main/java/com/palantir/common/streams/MoreCollectors.java`
#### Snippet
```java
     */
    @Deprecated
    public static <T, K, V> Collector<T, ?, Map<K, V>> toImmutableMap(
            Function<T, K> keyFunction, Function<T, V> valueFunction) {
        return Collector.of(
```

### DeprecatedIsStillUsed
Deprecated member 'toImmutableList' is still used
in `streams/src/main/java/com/palantir/common/streams/MoreCollectors.java`
#### Snippet
```java
     */
    @Deprecated
    public static <T> Collector<T, ?, List<T>> toImmutableList() {
        return Collector.of(
                ImmutableList::<T>builder,
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `streams/src/main/java/com/palantir/common/streams/MoreFutures.java`
#### Snippet
```java

    @SuppressWarnings({"EmptyCatch", "EmptyCatchBlock"})
    static <T extends Future<U>, U> T blockUntilCompletion(T future) {
        try {
            future.get();
```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
'transform(com.google.common.util.concurrent.ListenableFuture*, com.google.common.base.Function, java.util.concurrent.Executor)' is marked unstable with @Beta*
in `streams/src/main/java/com/palantir/common/streams/MoreStreams.java`
#### Snippet
```java
                                InCompletionOrder.INSTANCE,
                                arguments.spliterator(),
                                x -> Futures.transform(Futures.immediateFuture(x), mapper::apply, executor),
                                maxParallelism),
                        NOT_PARALLEL)
```

### UnstableApiUsage
'stream(java.util.Iterator)' is marked unstable with @Beta
in `streams/src/main/java/com/palantir/common/streams/MoreStreams.java`
#### Snippet
```java
     * @return A stream for the iterator
     *
     * @deprecated Use {@link com.google.common.collect.Streams#stream(Iterator)}, available in Guava 21+
     */
    @Deprecated
```

### UnstableApiUsage
'transform(com.google.common.util.concurrent.ListenableFuture*, com.google.common.base.Function, java.util.concurrent.Executor)' is marked unstable with @Beta*
in `streams/src/main/java/com/palantir/common/streams/MoreStreams.java`
#### Snippet
```java
                                InSourceOrder.INSTANCE,
                                arguments.spliterator(),
                                x -> Futures.transform(Futures.immediateFuture(x), mapper::apply, executor),
                                maxParallelism),
                        NOT_PARALLEL)
```

### UnstableApiUsage
'stream(java.util.Optional)' is marked unstable with @Beta
in `streams/src/main/java/com/palantir/common/streams/MoreStreams.java`
#### Snippet
```java
     * if {@code optionalValue} is empty.
     *
     * @deprecated Use {@link com.google.common.collect.Streams#stream(Optional)}, available in Guava 21+
     */
    @Deprecated
```

