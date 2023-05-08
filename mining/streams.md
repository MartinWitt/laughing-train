# streams 
 
# Bad smells
I found 15 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DeprecatedIsStillUsed | 6 | false |
| UnstableApiUsage | 4 | false |
| RedundantTypeArguments | 2 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| Deprecation | 1 | false |
| SimplifyOptionalCallChains | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
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

## RuleId[id=Deprecation]
### Deprecation
'stream(java.lang.Iterable)' is deprecated
in `streams/src/main/java/com/palantir/common/streams/KeyedStream.java`
#### Snippet
```java
     */
    static <V> KeyedStream<V, V> of(Iterable<? extends V> items) {
        return KeyedStream.of(MoreStreams.stream(items));
    }

```

## RuleId[id=SimplifyOptionalCallChains]
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

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Type arguments are redundant for the non-generic method reference
in `streams/src/main/java/com/palantir/common/streams/MoreCollectors.java`
#### Snippet
```java
        return Collector.of(
                ImmutableSet::<T>builder,
                ImmutableSet.Builder::<T>add,
                (left, right) -> left.addAll(right.build()),
                ImmutableSet.Builder::build,
```

### RedundantTypeArguments
Type arguments are redundant for the non-generic method reference
in `streams/src/main/java/com/palantir/common/streams/MoreCollectors.java`
#### Snippet
```java
        return Collector.of(
                ImmutableList::<T>builder,
                ImmutableList.Builder::<T>add,
                (left, right) -> left.addAll(right.build()),
                ImmutableList.Builder::build);
```

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=UnstableApiUsage]
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

