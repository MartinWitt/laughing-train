# cassandra-accord 
 
# Bad smells
I found 640 bad smells with 57 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 164 | false |
| UNUSED_IMPORT | 75 | false |
| AssignmentToMethodParameter | 57 | false |
| ReturnNull | 36 | false |
| MissortedModifiers | 30 | false |
| DataFlowIssue | 30 | false |
| ArrayEquality | 28 | false |
| UtilityClassWithoutPrivateConstructor | 28 | true |
| NestedAssignment | 18 | false |
| RedundantImplements | 16 | false |
| PublicFieldAccessedInSynchronizedContext | 15 | false |
| CodeBlock2Expr | 13 | true |
| RedundantFieldInitialization | 13 | false |
| ZeroLengthArrayInitialization | 11 | false |
| NonProtectedConstructorInAbstractClass | 10 | true |
| RedundantMethodOverride | 7 | false |
| UnnecessaryFullyQualifiedName | 7 | false |
| ClassNameSameAsAncestorName | 6 | false |
| EqualsAndHashcode | 6 | false |
| MethodOverridesStaticMethod | 6 | false |
| NonSerializableFieldInSerializableClass | 6 | false |
| NullableProblems | 5 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 5 | false |
| UnnecessaryLocalVariable | 4 | true |
| EnumSwitchStatementWhichMissesCases | 3 | false |
| NonShortCircuitBoolean | 3 | false |
| MismatchedCollectionQueryUpdate | 3 | false |
| AssignmentToForLoopParameter | 3 | false |
| AssignmentToLambdaParameter | 3 | false |
| UnnecessarySuperQualifier | 2 | false |
| EmptyMethod | 2 | false |
| ConstantValue | 2 | false |
| MethodOverloadsParentMethod | 2 | false |
| AbstractMethodCallInConstructor | 2 | false |
| SystemOutErr | 2 | false |
| EqualsWhichDoesntCheckParameterClass | 2 | false |
| StaticCallOnSubclass | 1 | false |
| EmptyStatementBody | 1 | false |
| ManualArrayCopy | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| UnnecessaryReturn | 1 | true |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| UnusedAssignment | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| RedundantSuppression | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| ThrowablePrintStackTrace | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (ensurePartialTxn) { case Add: if (partialTxn == null) ...` statement on enum type 'accord.local.Command.EnsureAction' misses cases: 'Ignore', and 'Check'
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
        else setRoute(route.slice(allRanges));

        switch (ensurePartialTxn)
        {
            case Add:
                if (partialTxn == null)
                    break;

                if (partialTxn() != null)
                {
                    partialTxn = partialTxn.slice(allRanges, shard.isHome());
                    Routables.foldlMissing((Seekables)partialTxn.keys(), partialTxn().keys(), (keyOrRange, p, v, i) -> {
                        // TODO (expected, efficiency): we may register the same ranges more than once
                        safeStore.register(keyOrRange, allRanges, this);
                        return v;
                    }, 0, 0, 1);
                    this.setPartialTxn(partialTxn().with(partialTxn));
                    break;
                }

            case Set:
            case TrySet:
                setPartialTxn(partialTxn = partialTxn.slice(allRanges, shard.isHome()));
                // TODO (expected, efficiency): we may register the same ranges more than once
                // TODO (desirable, efficiency): no need to register on PreAccept if already Accepted
                safeStore.register(partialTxn.keys(), allRanges, this);
                break;
        }

        switch (ensurePartialDeps)
```

### EnumSwitchStatementWhichMissesCases
`switch (ensurePartialDeps) { case Add: if (partialDeps == null) ...` statement on enum type 'accord.local.Command.EnsureAction' misses cases: 'Ignore', and 'Check'
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
        }

        switch (ensurePartialDeps)
        {
            case Add:
                if (partialDeps == null)
                    break;

                if (partialDeps() != null)
                {
                    setPartialDeps(partialDeps().with(partialDeps.slice(allRanges)));
                    break;
                }

            case Set:
            case TrySet:
                setPartialDeps(partialDeps.slice(allRanges));
                break;
        }
    }

```

### EnumSwitchStatementWhichMissesCases
`switch (status()) { case Committed: // TODO (desirable, efficien...` statement on enum type 'accord.local.Status' misses cases: 'NotWitnessed', 'PreAccepted', ...
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
        }

        switch (status())
        {
            case Committed:
                // TODO (desirable, efficiency): maintain distinct ReadyToRead and ReadyToWrite states
                setStatus(ReadyToExecute);
                logger.trace("{}: set to ReadyToExecute", txnId());
                safeStore.progressLog().readyToExecute(this, shard);
                notifyListeners(safeStore);
                break;

            case PreApplied:
                Ranges executeRanges = executeRanges(safeStore, executeAt());
                boolean intersects = writes().keys.intersects(executeRanges);

                if (intersects)
                {
                    logger.trace("{}: applying", txnId());
                    apply(safeStore);
                }
                else
                {
                    // TODO (desirable, performance): This could be performed immediately upon Committed
                    //      but: if we later support transitive dependency elision this could be dangerous
                    logger.trace("{}: applying no-op", txnId());
                    setStatus(Applied);
                    notifyListeners(safeStore);
                }
        }
        return true;
    }
```

## RuleId[ruleID=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `nonNullOrMax()` declared in class 'accord.primitives.Timestamp' but referenced via subclass 'accord.primitives.Ballot'
in `accord-core/src/main/java/accord/messages/BeginInvalidation.java`
#### Snippet
```java
        // a single key to accept a promise globally for the invalidation to be able to succeed
        boolean isOk = o1.isPromised() && o2.isPromised();
        Ballot supersededBy = isOk ? null : Ballot.nonNullOrMax(o1.supersededBy, o2.supersededBy);
        boolean acceptedFastPath = o1.acceptedFastPath && o2.acceptedFastPath;
        Route<?> route =  Route.merge((Route)o1.route, o2.route);
```

## RuleId[ruleID=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `accord-maelstrom/src/main/java/accord/maelstrom/Cluster.java`
#### Snippet
```java
                sinks.add(next);

            while (sinks.processPending());
        }
        finally
```

## RuleId[ruleID=ManualArrayCopy]
### ManualArrayCopy
Manual array copy
in `accord-maelstrom/src/main/java/accord/maelstrom/Value.java`
#### Snippet
```java
    {
        Datum[] contents = Arrays.copyOf(this.contents, this.contents.length + data.contents.length);
        for (int i = contents.length - data.contents.length ; i < contents.length ; ++i)
            contents[i] = data.contents[data.contents.length + i - contents.length];
        return new Value(contents);
```

## RuleId[ruleID=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `Commit` on 'this' is unnecessary in this context
in `accord-core/src/main/java/accord/messages/Commit.java`
#### Snippet
```java
                Invariants.checkState(!command.hasBeenWitnessed());
                if (defer == null)
                    defer = new Defer(DefinitionOnly, Committed.minKnown, Commit.this);
                defer.add(command, safeStore.commandStore());
                return ReadNack.NotCommitted;
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
    static <A> void throwUnexpectedMissingKeyException(A[] leftKeys, int leftKeyIndex, int leftKeyLength, A[] rightKeys, int rightKeyIndex, int rightKeyLength, boolean isMissingLeft)
    {
        StringBuilder sb = new StringBuilder();
        String missing = isMissingLeft ? "left" : "right";
        String extra = isMissingLeft ? "right" : "left";
```

## RuleId[ruleID=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `accord-maelstrom/src/main/java/accord/maelstrom/SimpleConfigService.java`
#### Snippet
```java
    public void fetchTopologyForEpoch(long epoch)
    {
        return;
    }

```

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `this == FullKeyRoute | this == FullRangeRoute`
in `accord-core/src/main/java/accord/primitives/Unseekables.java`
#### Snippet
```java
        public boolean isFullRoute()
        {
            return this == FullKeyRoute | this == FullRangeRoute;
        }
    }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `this != RoutingKeys & this != RoutingRanges`
in `accord-core/src/main/java/accord/primitives/Unseekables.java`
#### Snippet
```java
        public boolean isRoute()
        {
            return this != RoutingKeys & this != RoutingRanges;
        }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `ok1.rejectsFastPath | ok2.rejectsFastPath`
in `accord-core/src/main/java/accord/messages/BeginRecovery.java`
#### Snippet
```java
                txnId, ok1.status, ok1.accepted, timestamp, deps,
                earlierCommittedWitness, earlierAcceptedNoWitness,
                ok1.rejectsFastPath | ok2.rejectsFastPath,
                ok1.writes, ok1.result);
    }
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super O`
in `accord-core/src/main/java/accord/local/SyncCommandStores.java`
#### Snippet
```java

        @Override
        public void consume(MapReduceConsume<?, O> reduceAndConsume, O result)
        {
            reduceAndConsume.accept(result, null);
```

### BoundedWildcard
Can generalize to `? extends O`
in `accord-core/src/main/java/accord/local/SyncCommandStores.java`
#### Snippet
```java

        @Override
        public O apply(MapReduce<? super SafeCommandStore, O> map, SyncCommandStore commandStore, PreLoadContext context)
        {
            return commandStore.executeSync(context, map);
```

### BoundedWildcard
Can generalize to `? super RoutingKey`
in `accord-core/src/main/java/accord/coordinate/FindHomeKey.java`
#### Snippet
```java
{
    final BiConsumer<RoutingKey, Throwable> callback;
    FindHomeKey(Node node, TxnId txnId, Unseekables<?, ?> unseekables, BiConsumer<RoutingKey, Throwable> callback)
    {
        super(node, txnId, unseekables, txnId.epoch(), IncludeInfo.No);
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `accord-core/src/main/java/accord/coordinate/FindHomeKey.java`
#### Snippet
```java
{
    final BiConsumer<RoutingKey, Throwable> callback;
    FindHomeKey(Node node, TxnId txnId, Unseekables<?, ?> unseekables, BiConsumer<RoutingKey, Throwable> callback)
    {
        super(node, txnId, unseekables, txnId.epoch(), IncludeInfo.No);
```

### BoundedWildcard
Can generalize to `? super I`
in `accord-core/src/main/java/accord/utils/MapReduceConsume.java`
#### Snippet
```java
    void accept(O result, Throwable failure);

    static <I> MapReduceConsume<I, Void> forEach(Consumer<I> forEach, BiConsumer<Object, Throwable> consume)
    {
        return new MapReduceConsume<I, Void>() {
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `accord-core/src/main/java/accord/utils/MapReduceConsume.java`
#### Snippet
```java
    void accept(O result, Throwable failure);

    static <I> MapReduceConsume<I, Void> forEach(Consumer<I> forEach, BiConsumer<Object, Throwable> consume)
    {
        return new MapReduceConsume<I, Void>() {
```

### BoundedWildcard
Can generalize to `? extends RecoverOk`
in `accord-core/src/main/java/accord/messages/BeginRecovery.java`
#### Snippet
```java
        }

        public static RecoverOk maxAcceptedOrLater(List<RecoverOk> recoverOks)
        {
            return Status.max(recoverOks, r -> r.status, r -> r.accepted, r -> r.status.phase.compareTo(Phase.Accept) >= 0);
```

### BoundedWildcard
Can generalize to `? extends Future`
in `accord-core/src/main/java/accord/api/Read.java`
#### Snippet
```java
        }

        private synchronized void listen(List<Future<Data>> futures)
        {
            for (int i=0, mi=futures.size(); i<mi; i++)
```

### BoundedWildcard
Can generalize to `? super Topology`
in `accord-core/src/main/java/accord/topology/Topologies.java`
#### Snippet
```java
    int maxShardsPerEpoch();

    default void forEach(IndexedConsumer<Topology> consumer)
    {
        for (int i=0, mi=size(); i<mi; i++)
```

### BoundedWildcard
Can generalize to `? super Deps`
in `accord-core/src/main/java/accord/coordinate/CollectDeps.java`
#### Snippet
```java
    private boolean isDone;

    CollectDeps(Node node, Topologies topologies, TxnId txnId, FullRoute<?> route, Txn txn, Timestamp executeAt, BiConsumer<Deps, Throwable> callback)
    {
        this.node = node;
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `accord-core/src/main/java/accord/coordinate/CollectDeps.java`
#### Snippet
```java
    private boolean isDone;

    CollectDeps(Node node, Topologies topologies, TxnId txnId, FullRoute<?> route, Txn txn, Timestamp executeAt, BiConsumer<Deps, Throwable> callback)
    {
        this.node = node;
```

### BoundedWildcard
Can generalize to `? super Kind`
in `accord-maelstrom/src/main/java/accord/maelstrom/Datum.java`
#### Snippet
```java
    }

    protected static <V> V read(JsonReader in, BiFunction<Kind, Object, V> constructor) throws IOException
    {
        Datum.Kind type;
```

### BoundedWildcard
Can generalize to `? super O`
in `accord-core/src/main/java/accord/local/AsyncCommandStores.java`
#### Snippet
```java

        @Override
        public void consume(MapReduceConsume<?, O> reduceAndConsume, Future<O> future)
        {
            future.addCallback(reduceAndConsume);
```

### BoundedWildcard
Can generalize to `? super Ranges`
in `accord-core/src/main/java/accord/local/ShardDistributor.java`
#### Snippet
```java
        final Function<Ranges, ? extends Splitter<T>> splitter;

        public EvenSplit(int numberOfShards, Function<Ranges, ? extends Splitter<T>> splitter)
        {
            this.numberOfShards = numberOfShards;
```

### BoundedWildcard
Can generalize to `? extends T`
in `accord-core/src/main/java/accord/local/Status.java`
#### Snippet
```java
    }

    public static <T> T max(List<T> list, Function<T, Status> getStatus, Function<T, Ballot> getAccepted, Predicate<T> filter)
    {
        T max = null;
```

### BoundedWildcard
Can generalize to `? super T`
in `accord-core/src/main/java/accord/local/Status.java`
#### Snippet
```java
    }

    public static <T> T max(List<T> list, Function<T, Status> getStatus, Function<T, Ballot> getAccepted, Predicate<T> filter)
    {
        T max = null;
```

### BoundedWildcard
Can generalize to `? super T`
in `accord-core/src/main/java/accord/local/Status.java`
#### Snippet
```java
    }

    public static <T> T max(List<T> list, Function<T, Status> getStatus, Function<T, Ballot> getAccepted, Predicate<T> filter)
    {
        T max = null;
```

### BoundedWildcard
Can generalize to `? extends Ballot`
in `accord-core/src/main/java/accord/local/Status.java`
#### Snippet
```java
    }

    public static <T> T max(List<T> list, Function<T, Status> getStatus, Function<T, Ballot> getAccepted, Predicate<T> filter)
    {
        T max = null;
```

### BoundedWildcard
Can generalize to `? super T`
in `accord-core/src/main/java/accord/local/Status.java`
#### Snippet
```java
    }

    public static <T> T max(List<T> list, Function<T, Status> getStatus, Function<T, Ballot> getAccepted, Predicate<T> filter)
    {
        T max = null;
```

### BoundedWildcard
Can generalize to `? extends T`
in `accord-core/src/main/java/accord/utils/Utils.java`
#### Snippet
```java

    // reimplements Collection#toArray
    public static <T> T[] toArray(List<T> src, IntFunction<T[]> factory)
    {
        T[] dst = factory.apply(src.size());
```

### BoundedWildcard
Can generalize to `? extends T`
in `accord-core/src/main/java/accord/utils/Utils.java`
#### Snippet
```java
{
    // reimplements Collection#toArray
    public static <T> T[] toArray(Collection<T> src, IntFunction<T[]> factory)
    {
        T[] dst = factory.apply(src.size());
```

### BoundedWildcard
Can generalize to `? super ST`
in `accord-core/src/main/java/accord/coordinate/tracking/AbstractTracker.java`
#### Snippet
```java
    }

    public boolean any(Predicate<ST> test)
    {
        for (ST tracker : trackers)
```

### BoundedWildcard
Can generalize to `? super ST`
in `accord-core/src/main/java/accord/coordinate/tracking/AbstractTracker.java`
#### Snippet
```java
    }

    public boolean all(Predicate<ST> test)
    {
        for (ST tracker : trackers)
```

### BoundedWildcard
Can generalize to `? super Result`
in `accord-core/src/main/java/accord/coordinate/FindRoute.java`
#### Snippet
```java

    final BiConsumer<Result, Throwable> callback;
    FindRoute(Node node, TxnId txnId, RoutingKey homeKey, BiConsumer<Result, Throwable> callback)
    {
        super(node, txnId, RoutingKeys.of(homeKey), txnId.epoch(), IncludeInfo.Route);
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `accord-core/src/main/java/accord/coordinate/FindRoute.java`
#### Snippet
```java

    final BiConsumer<Result, Throwable> callback;
    FindRoute(Node node, TxnId txnId, RoutingKey homeKey, BiConsumer<Result, Throwable> callback)
    {
        super(node, txnId, RoutingKeys.of(homeKey), txnId.epoch(), IncludeInfo.Route);
```

### BoundedWildcard
Can generalize to `? super TxnId`
in `accord-core/src/main/java/accord/primitives/KeyDeps.java`
#### Snippet
```java
    }

    public void forEach(Key key, Consumer<TxnId> forEach)
    {
        int keyIndex = keys.indexOf(key);
```

### BoundedWildcard
Can generalize to `? extends T1`
in `accord-core/src/main/java/accord/primitives/KeyDeps.java`
#### Snippet
```java
    }

    public static <T1, T2> KeyDeps merge(List<T1> merge, Function<T1, T2> getter1, Function<T2, KeyDeps> getter2)
    {
        try (LinearMerger<Key, TxnId, KeyDeps> linearMerger = new LinearMerger<>(ADAPTER))
```

### BoundedWildcard
Can generalize to `? super T1`
in `accord-core/src/main/java/accord/primitives/KeyDeps.java`
#### Snippet
```java
    }

    public static <T1, T2> KeyDeps merge(List<T1> merge, Function<T1, T2> getter1, Function<T2, KeyDeps> getter2)
    {
        try (LinearMerger<Key, TxnId, KeyDeps> linearMerger = new LinearMerger<>(ADAPTER))
```

### BoundedWildcard
Can generalize to `? extends T2`
in `accord-core/src/main/java/accord/primitives/KeyDeps.java`
#### Snippet
```java
    }

    public static <T1, T2> KeyDeps merge(List<T1> merge, Function<T1, T2> getter1, Function<T2, KeyDeps> getter2)
    {
        try (LinearMerger<Key, TxnId, KeyDeps> linearMerger = new LinearMerger<>(ADAPTER))
```

### BoundedWildcard
Can generalize to `? super T2`
in `accord-core/src/main/java/accord/primitives/KeyDeps.java`
#### Snippet
```java
    }

    public static <T1, T2> KeyDeps merge(List<T1> merge, Function<T1, T2> getter1, Function<T2, KeyDeps> getter2)
    {
        try (LinearMerger<Key, TxnId, KeyDeps> linearMerger = new LinearMerger<>(ADAPTER))
```

### BoundedWildcard
Can generalize to `? extends KeyDeps`
in `accord-core/src/main/java/accord/primitives/KeyDeps.java`
#### Snippet
```java
    }

    public static <T1, T2> KeyDeps merge(List<T1> merge, Function<T1, T2> getter1, Function<T2, KeyDeps> getter2)
    {
        try (LinearMerger<Key, TxnId, KeyDeps> linearMerger = new LinearMerger<>(ADAPTER))
```

### BoundedWildcard
Can generalize to `? super TxnId`
in `accord-core/src/main/java/accord/primitives/KeyDeps.java`
#### Snippet
```java
     * @param forEach function to call on each unique {@link TxnId}
     */
    public void forEachUniqueTxnId(Ranges ranges, Consumer<TxnId> forEach)
    {
        // Find all keys within the ranges, but record existence within an int64 bitset.  Since the bitset is limited
```

### BoundedWildcard
Can generalize to `? super Key`
in `accord-core/src/main/java/accord/primitives/KeyDeps.java`
#### Snippet
```java
    }

    public void forEach(Ranges ranges, BiConsumer<Key, TxnId> forEach)
    {
        Routables.foldl(keys, ranges, (key, value, index) -> {
```

### BoundedWildcard
Can generalize to `? super TxnId`
in `accord-core/src/main/java/accord/primitives/KeyDeps.java`
#### Snippet
```java
    }

    public void forEach(Ranges ranges, BiConsumer<Key, TxnId> forEach)
    {
        Routables.foldl(keys, ranges, (key, value, index) -> {
```

### BoundedWildcard
Can generalize to `? super T`
in `accord-core/src/main/java/accord/utils/Invariants.java`
#### Snippet
```java

    @Inline
    public static <T> T checkArgument(T param, Predicate<T> condition, String msg)
    {
        if (!condition.test(param))
```

### BoundedWildcard
Can generalize to `? super T`
in `accord-core/src/main/java/accord/utils/Invariants.java`
#### Snippet
```java

    @Inline
    public static <T> T checkArgument(T param, Predicate<T> condition)
    {
        if (!condition.test(param))
```

### BoundedWildcard
Can generalize to `? super Id`
in `accord-core/src/main/java/accord/topology/Topology.java`
#### Snippet
```java
    }

    public <P1> void visitNodeForKeysOnceOrMore(Unseekables<?, ?> select, IndexedPredicate<P1> predicate, P1 param, Consumer<Id> nodes)
    {
        for (int shardIndex : subsetFor(select, predicate, param))
```

### BoundedWildcard
Can generalize to `? extends Id`
in `accord-core/src/main/java/accord/topology/Topology.java`
#### Snippet
```java
    }

    private Topology forSubset(int[] newSubset, Collection<Id> nodes)
    {
        Ranges rangeSubset = ranges.select(newSubset);
```

### BoundedWildcard
Can generalize to `? super Shard`
in `accord-core/src/main/java/accord/topology/Topology.java`
#### Snippet
```java
    }

    public void forEach(IndexedConsumer<Shard> consumer)
    {
        for (int i = 0; i < supersetIndexes.length ; ++i)
```

### BoundedWildcard
Can generalize to `? super Shard`
in `accord-core/src/main/java/accord/topology/Topology.java`
#### Snippet
```java
    }

    public void forEachOn(Id on, IndexedConsumer<Shard> consumer)
    {
        NodeInfo info = nodeLookup.get(on);
```

### BoundedWildcard
Can generalize to `? super Shard`
in `accord-core/src/main/java/accord/topology/Topology.java`
#### Snippet
```java
    }

    public <T> T foldl(Unseekables<?, ?> select, IndexedBiFunction<Shard, T, T> function, T accumulator)
    {
        Unseekables<?, ?> as = select;
```

### BoundedWildcard
Can generalize to `? super T`
in `accord-core/src/main/java/accord/topology/Topology.java`
#### Snippet
```java
    }

    public <T> T foldl(Unseekables<?, ?> select, IndexedBiFunction<Shard, T, T> function, T accumulator)
    {
        Unseekables<?, ?> as = select;
```

### BoundedWildcard
Can generalize to `? extends T`
in `accord-core/src/main/java/accord/topology/Topology.java`
#### Snippet
```java
    }

    public <T> T foldl(Unseekables<?, ?> select, IndexedBiFunction<Shard, T, T> function, T accumulator)
    {
        Unseekables<?, ?> as = select;
```

### BoundedWildcard
Can generalize to `? super Shard`
in `accord-core/src/main/java/accord/topology/Topology.java`
#### Snippet
```java
    }

    public void forEach(Consumer<Shard> forEach)
    {
        for (int i : supersetIndexes)
```

### BoundedWildcard
Can generalize to `? extends InvalidateReply`
in `accord-core/src/main/java/accord/messages/BeginInvalidation.java`
#### Snippet
```java
        }

        public static Route<?> mergeRoutes(List<InvalidateReply> invalidateOks)
        {
            return mapReduceNonNull(ok -> (Route)ok.route, Route::union, invalidateOks);
```

### BoundedWildcard
Can generalize to `? extends InvalidateReply`
in `accord-core/src/main/java/accord/messages/BeginInvalidation.java`
#### Snippet
```java
        }

        public static RoutingKey findHomeKey(List<InvalidateReply> invalidateOks)
        {
            for (InvalidateReply ok : invalidateOks)
```

### BoundedWildcard
Can generalize to `? extends InvalidateReply`
in `accord-core/src/main/java/accord/messages/BeginInvalidation.java`
#### Snippet
```java
        }

        public static FullRoute<?> findRoute(List<InvalidateReply> invalidateOks)
        {
            for (InvalidateReply ok : invalidateOks)
```

### BoundedWildcard
Can generalize to `? extends InvalidateReply`
in `accord-core/src/main/java/accord/messages/BeginInvalidation.java`
#### Snippet
```java
        }

        public static InvalidateReply max(List<InvalidateReply> invalidateReplies)
        {
            return Status.max(invalidateReplies, r -> r.status, r -> r.accepted, invalidateReply -> true);
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `accord-core/src/main/java/accord/coordinate/CheckOn.java`
#### Snippet
```java
    }

    CheckOn(Node node, Known sufficient, TxnId txnId, Route<?> route, Unseekables<?, ?> routeWithHomeKey, long srcEpoch, long untilLocalEpoch, BiConsumer<? super CheckStatusOkFull, Throwable> callback)
    {
        // TODO (desired, efficiency): restore behaviour of only collecting info if e.g. Committed or Executed
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `accord-core/src/main/java/accord/coordinate/Propose.java`
#### Snippet
```java
        private boolean isDone;

        Invalidate(Node node, Shard shard, Ballot ballot, TxnId txnId, RoutingKey invalidateWithKey, BiConsumer<Void, Throwable> callback)
        {
            this.node = node;
```

### BoundedWildcard
Can generalize to `? super K`
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
        boolean hasOrderedValues = true;

        public AbstractBuilder(Adapter<K, V> adapter)
        {
            this.adapter = adapter;
```

### BoundedWildcard
Can generalize to `? super V`
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
        boolean hasOrderedValues = true;

        public AbstractBuilder(Adapter<K, V> adapter)
        {
            this.adapter = adapter;
```

### BoundedWildcard
Can generalize to `? super K`
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
                  K[] rightKeys, int rightKeysLength, V[] rightValues, int rightValuesLength, int[] right, int rightLength,
                  SymmetricComparator<? super K> keyComparator, SymmetricComparator<? super V> valueComparator,
                  ObjectBuffers<K> keyBuffers, ObjectBuffers<V> valueBuffers, IntBuffers intBuffers, Constructor<K, V, T> constructor)
    {
        K[] outKeys = null;
```

### BoundedWildcard
Can generalize to `? super V`
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
                  K[] rightKeys, int rightKeysLength, V[] rightValues, int rightValuesLength, int[] right, int rightLength,
                  SymmetricComparator<? super K> keyComparator, SymmetricComparator<? super V> valueComparator,
                  ObjectBuffers<K> keyBuffers, ObjectBuffers<V> valueBuffers, IntBuffers intBuffers, Constructor<K, V, T> constructor)
    {
        K[] outKeys = null;
```

### BoundedWildcard
Can generalize to `? super V`
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
    }

    public static <K, K2, V, T> T remove(T from, K[] keys, V[] oldValues, int[] oldKeysToValues, Predicate<V> remove, T none, IntFunction<V[]> newValueArray,
                                     K2 passthroughKeys, SimpleConstructor<K2, V[], T> constructor)
    {
```

### BoundedWildcard
Can generalize to `? extends T`
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java

    public static <K, K2, V, T> T remove(T from, K[] keys, V[] oldValues, int[] oldKeysToValues, Predicate<V> remove, T none, IntFunction<V[]> newValueArray,
                                     K2 passthroughKeys, SimpleConstructor<K2, V[], T> constructor)
    {
        if (isEmpty(keys, oldKeysToValues))
```

### BoundedWildcard
Can generalize to `? extends T`
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
        }

        public T get(SimpleConstructor<K[], V[], T> constructor, T none)
        {
            if (buf == null)
```

### BoundedWildcard
Can generalize to `? super K`
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
        T from = null;

        public LinearMerger(Adapter<K, V> adapter)
        {
            super(adapter.cachedValues(), cachedInts());
```

### BoundedWildcard
Can generalize to `? super V`
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
        T from = null;

        public LinearMerger(Adapter<K, V> adapter)
        {
            super(adapter.cachedValues(), cachedInts());
```

### BoundedWildcard
Can generalize to `? super I`
in `accord-core/src/main/java/accord/utils/Functions.java`
#### Snippet
```java
    }

    public static <I, O> O mapReduceNonNull(Function<I, O> map, BiFunction<O, O, O> reduce, List<I> input)
    {
        O result = null;
```

### BoundedWildcard
Can generalize to `? extends O`
in `accord-core/src/main/java/accord/utils/Functions.java`
#### Snippet
```java
    }

    public static <I, O> O mapReduceNonNull(Function<I, O> map, BiFunction<O, O, O> reduce, List<I> input)
    {
        O result = null;
```

### BoundedWildcard
Can generalize to `? super O`
in `accord-core/src/main/java/accord/utils/Functions.java`
#### Snippet
```java
    }

    public static <I, O> O mapReduceNonNull(Function<I, O> map, BiFunction<O, O, O> reduce, List<I> input)
    {
        O result = null;
```

### BoundedWildcard
Can generalize to `? super O`
in `accord-core/src/main/java/accord/utils/Functions.java`
#### Snippet
```java
    }

    public static <I, O> O mapReduceNonNull(Function<I, O> map, BiFunction<O, O, O> reduce, List<I> input)
    {
        O result = null;
```

### BoundedWildcard
Can generalize to `? extends O`
in `accord-core/src/main/java/accord/utils/Functions.java`
#### Snippet
```java
    }

    public static <I, O> O mapReduceNonNull(Function<I, O> map, BiFunction<O, O, O> reduce, List<I> input)
    {
        O result = null;
```

### BoundedWildcard
Can generalize to `? extends I`
in `accord-core/src/main/java/accord/utils/Functions.java`
#### Snippet
```java
    }

    public static <I, O> O mapReduceNonNull(Function<I, O> map, BiFunction<O, O, O> reduce, List<I> input)
    {
        O result = null;
```

### BoundedWildcard
Can generalize to `? super T1`
in `accord-core/src/main/java/accord/utils/Functions.java`
#### Snippet
```java
    }

    public static <T1, T2> T1 reduceNonNull(BiFunction<T1, T2, T1> merge, @Nonnull T1 a, T2 ... bs)
    {
        for (T2 b : bs)
```

### BoundedWildcard
Can generalize to `? super T2`
in `accord-core/src/main/java/accord/utils/Functions.java`
#### Snippet
```java
    }

    public static <T1, T2> T1 reduceNonNull(BiFunction<T1, T2, T1> merge, @Nonnull T1 a, T2 ... bs)
    {
        for (T2 b : bs)
```

### BoundedWildcard
Can generalize to `? extends T1`
in `accord-core/src/main/java/accord/utils/Functions.java`
#### Snippet
```java
    }

    public static <T1, T2> T1 reduceNonNull(BiFunction<T1, T2, T1> merge, @Nonnull T1 a, T2 ... bs)
    {
        for (T2 b : bs)
```

### BoundedWildcard
Can generalize to `? super T`
in `accord-core/src/main/java/accord/utils/Functions.java`
#### Snippet
```java
{

    public static <T> T reduceNonNull(BiFunction<T, T, T> merge, T a, T b)
    {
        return a == null ? b : b == null ? a : merge.apply(a, b);
```

### BoundedWildcard
Can generalize to `? super T`
in `accord-core/src/main/java/accord/utils/Functions.java`
#### Snippet
```java
{

    public static <T> T reduceNonNull(BiFunction<T, T, T> merge, T a, T b)
    {
        return a == null ? b : b == null ? a : merge.apply(a, b);
```

### BoundedWildcard
Can generalize to `? extends T`
in `accord-core/src/main/java/accord/utils/Functions.java`
#### Snippet
```java
{

    public static <T> T reduceNonNull(BiFunction<T, T, T> merge, T a, T b)
    {
        return a == null ? b : b == null ? a : merge.apply(a, b);
```

### BoundedWildcard
Can generalize to `? super Command`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
        }

        public void forCommittedInEpoch(Ranges ranges, long epoch, Consumer<Command> consumer)
        {
            Timestamp minTimestamp = Timestamp.minForEpoch(epoch);
```

### BoundedWildcard
Can generalize to `? super CommandsForKey`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
        }

        private <O> O mapReduceForKey(Routables<?, ?> keysOrRanges, Ranges slice, BiFunction<CommandsForKey, O, O> map, O accumulate, O terminalValue)
        {
            switch (keysOrRanges.domain()) {
```

### BoundedWildcard
Can generalize to `? super O`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
        }

        private <O> O mapReduceForKey(Routables<?, ?> keysOrRanges, Ranges slice, BiFunction<CommandsForKey, O, O> map, O accumulate, O terminalValue)
        {
            switch (keysOrRanges.domain()) {
```

### BoundedWildcard
Can generalize to `? extends O`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
        }

        private <O> O mapReduceForKey(Routables<?, ?> keysOrRanges, Ranges slice, BiFunction<CommandsForKey, O, O> map, O accumulate, O terminalValue)
        {
            switch (keysOrRanges.domain()) {
```

### BoundedWildcard
Can generalize to `? super CommandsForKey`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
        }

        private void forEach(Routable keyOrRange, Ranges slice, Consumer<CommandsForKey> forEach)
        {
            switch (keyOrRange.domain())
```

### BoundedWildcard
Can generalize to `? super CommandsForKey`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
        }

        private void forEach(Seekables<?, ?> keysOrRanges, Ranges slice, Consumer<CommandsForKey> forEach)
        {
            switch (keysOrRanges.domain()) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java

            @Override
            public synchronized <T> Future<T> submit(PreLoadContext context, Function<? super SafeCommandStore, T> function)
            {
                AsyncPromise<T> promise = new AsyncPromise<>();
```

### BoundedWildcard
Can generalize to `? extends T`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
            private final Function<? super SafeCommandStore, T> function;

            public FunctionWrapper(Function<? super SafeCommandStore, T> function)
            {
                this.function = function;
```

### BoundedWildcard
Can generalize to `? super Packet`
in `accord-maelstrom/src/main/java/accord/maelstrom/Cluster.java`
#### Snippet
```java
    Set<Id> partitionSet;

    public Cluster(QueueSupplier queueSupplier, Function<Id, Node> lookup, Consumer<Packet> responseSink, OutputStream stderr)
    {
        this.pending = queueSupplier.get();
```

### BoundedWildcard
Can generalize to `? extends Random`
in `accord-maelstrom/src/main/java/accord/maelstrom/Cluster.java`
#### Snippet
```java
    }

    public static void run(Id[] nodes, QueueSupplier queueSupplier, Consumer<Packet> responseSink, Supplier<Random> randomSupplier, Supplier<LongSupplier> nowSupplier, TopologyFactory topologyFactory, Supplier<Packet> in, OutputStream stderr)
    {
        Topology topology = topologyFactory.toTopology(nodes);
```

### BoundedWildcard
Can generalize to `? extends LongSupplier`
in `accord-maelstrom/src/main/java/accord/maelstrom/Cluster.java`
#### Snippet
```java
    }

    public static void run(Id[] nodes, QueueSupplier queueSupplier, Consumer<Packet> responseSink, Supplier<Random> randomSupplier, Supplier<LongSupplier> nowSupplier, TopologyFactory topologyFactory, Supplier<Packet> in, OutputStream stderr)
    {
        Topology topology = topologyFactory.toTopology(nodes);
```

### BoundedWildcard
Can generalize to `? extends Packet`
in `accord-maelstrom/src/main/java/accord/maelstrom/Cluster.java`
#### Snippet
```java
    }

    public static void run(Id[] nodes, QueueSupplier queueSupplier, Consumer<Packet> responseSink, Supplier<Random> randomSupplier, Supplier<LongSupplier> nowSupplier, TopologyFactory topologyFactory, Supplier<Packet> in, OutputStream stderr)
    {
        Topology topology = topologyFactory.toTopology(nodes);
```

### BoundedWildcard
Can generalize to `? extends T`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStores.java`
#### Snippet
```java
        }

        public <T> T mapReduce(PreLoadContext context, Routables<?, ?> keys, long minEpoch, long maxEpoch, Function<? super SafeCommandStore, T> map, BiFunction<T, T, T> reduce)
        {
            return mapReduce(context, keys, minEpoch, maxEpoch, new MapReduce<SafeCommandStore, T>() {
```

### BoundedWildcard
Can generalize to `? super T`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStores.java`
#### Snippet
```java
        }

        public <T> T mapReduce(PreLoadContext context, Routables<?, ?> keys, long minEpoch, long maxEpoch, Function<? super SafeCommandStore, T> map, BiFunction<T, T, T> reduce)
        {
            return mapReduce(context, keys, minEpoch, maxEpoch, new MapReduce<SafeCommandStore, T>() {
```

### BoundedWildcard
Can generalize to `? super T`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStores.java`
#### Snippet
```java
        }

        public <T> T mapReduce(PreLoadContext context, Routables<?, ?> keys, long minEpoch, long maxEpoch, Function<? super SafeCommandStore, T> map, BiFunction<T, T, T> reduce)
        {
            return mapReduce(context, keys, minEpoch, maxEpoch, new MapReduce<SafeCommandStore, T>() {
```

### BoundedWildcard
Can generalize to `? extends T`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStores.java`
#### Snippet
```java
        }

        public <T> T mapReduce(PreLoadContext context, Routables<?, ?> keys, long minEpoch, long maxEpoch, Function<? super SafeCommandStore, T> map, BiFunction<T, T, T> reduce)
        {
            return mapReduce(context, keys, minEpoch, maxEpoch, new MapReduce<SafeCommandStore, T>() {
```

### BoundedWildcard
Can generalize to `? super T`
in `accord-core/src/main/java/accord/impl/InMemoryCommandsForKey.java`
#### Snippet
```java
                               TestDep testDep, @Nullable TxnId depId,
                               @Nullable Status minStatus, @Nullable Status maxStatus,
                               CommandFunction<T, T> map, T initialValue, T terminalValue)
        {

```

### BoundedWildcard
Can generalize to `? extends T`
in `accord-core/src/main/java/accord/impl/InMemoryCommandsForKey.java`
#### Snippet
```java
                               TestDep testDep, @Nullable TxnId depId,
                               @Nullable Status minStatus, @Nullable Status maxStatus,
                               CommandFunction<T, T> map, T initialValue, T terminalValue)
        {

```

### BoundedWildcard
Can generalize to `? super Command`
in `accord-core/src/main/java/accord/impl/InMemoryCommandsForKey.java`
#### Snippet
```java
    }

    public void forWitnessed(Timestamp minTs, Timestamp maxTs, Consumer<Command> consumer)
    {
        byId.between(minTs, maxTs).filter(cmd -> cmd.hasBeen(PreAccepted)).forEach(consumer);
```

### BoundedWildcard
Can generalize to `? super Command`
in `accord-core/src/main/java/accord/messages/Defer.java`
#### Snippet
```java
    }

    Defer(Function<Command, Ready> waitUntil, TxnRequest<?> request)
    {
        this.waitUntil = waitUntil;
```

### BoundedWildcard
Can generalize to `? super Id`
in `accord-core/src/main/java/accord/coordinate/tracking/ReadTracker.java`
#### Snippet
```java
    }

    public <T1> RequestStatus trySendMore(BiConsumer<T1, Id> contact, T1 with)
    {
        ShardSelection toRead;
```

### BoundedWildcard
Can generalize to `? super SafeCommandStore`
in `accord-core/src/main/java/accord/local/CommandStores.java`
#### Snippet
```java
    }

    public Future<Void> forEach(Consumer<SafeCommandStore> forEach)
    {
        List<Future<Void>> list = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends Deps`
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
    }

    public static <T> Deps merge(List<T> list, Function<T, Deps> getter)
    {
        return new Deps(KeyDeps.merge(list, getter, deps -> deps.keyDeps),
```

### BoundedWildcard
Can generalize to `? extends B`
in `accord-core/src/main/java/accord/utils/ArrayBuffers.java`
#### Snippet
```java
        final int maxSize;

        AbstractBufferCache(IntFunction<B> allocator, Clear<B> clear, int maxCount, int maxSize)
        {
            this.allocator = allocator;
```

### BoundedWildcard
Can generalize to `? super B`
in `accord-core/src/main/java/accord/utils/ArrayBuffers.java`
#### Snippet
```java
        final int maxSize;

        AbstractBufferCache(IntFunction<B> allocator, Clear<B> clear, int maxCount, int maxSize)
        {
            this.allocator = allocator;
```

### BoundedWildcard
Can generalize to `? extends RS`
in `accord-core/src/main/java/accord/primitives/AbstractRanges.java`
#### Snippet
```java
     * DOES NOT MODIFY THE RANGES.
     */
    static <RS extends AbstractRanges<?>, P> RS intersect(RS input, Unseekables<?, ?> keysOrRanges, P param, BiFunction<P, Range[], RS> constructor)
    {
        switch (keysOrRanges.domain())
```

### BoundedWildcard
Can generalize to `? extends RS`
in `accord-core/src/main/java/accord/primitives/AbstractRanges.java`
#### Snippet
```java
    }

    static <RS extends AbstractRanges<?>> RS mergeTouching(RS input, Function<Range[], RS> constructor)
    {
        Range[] ranges = input.ranges;
```

### BoundedWildcard
Can generalize to `? super Result`
in `accord-core/src/main/java/accord/coordinate/Execute.java`
#### Snippet
```java
    private Data data;

    private Execute(Node node, TxnId txnId, Txn txn, FullRoute<?> route, Seekables<?, ?> readScope, Timestamp executeAt, Deps deps, BiConsumer<Result, Throwable> callback)
    {
        super(node, node.topology().forEpoch(readScope.toUnseekables(), executeAt.epoch()), txnId);
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `accord-core/src/main/java/accord/coordinate/Execute.java`
#### Snippet
```java
    private Data data;

    private Execute(Node node, TxnId txnId, Txn txn, FullRoute<?> route, Seekables<?, ?> readScope, Timestamp executeAt, Deps deps, BiConsumer<Result, Throwable> callback)
    {
        super(node, node.topology().forEpoch(readScope.toUnseekables(), executeAt.epoch()), txnId);
```

### BoundedWildcard
Can generalize to `? super Known`
in `accord-core/src/main/java/accord/coordinate/FetchData.java`
#### Snippet
```java
    }

    private static Object fetchInternal(Ranges ranges, Known target, Node node, TxnId txnId, PartialRoute<?> route, @Nullable Timestamp executeAt, long untilLocalEpoch, BiConsumer<Known, Throwable> callback)
    {
        long srcEpoch = executeAt == null || target.epoch() == Coordination ? txnId.epoch() : executeAt.epoch();
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `accord-core/src/main/java/accord/coordinate/FetchData.java`
#### Snippet
```java
    }

    private static Object fetchInternal(Ranges ranges, Known target, Node node, TxnId txnId, PartialRoute<?> route, @Nullable Timestamp executeAt, long untilLocalEpoch, BiConsumer<Known, Throwable> callback)
    {
        long srcEpoch = executeAt == null || target.epoch() == Coordination ? txnId.epoch() : executeAt.epoch();
```

### BoundedWildcard
Can generalize to `? extends Id`
in `accord-core/src/main/java/accord/coordinate/ReadCoordinator.java`
#### Snippet
```java
    }

    protected void start(Set<Id> to)
    {
        to.forEach(this::contact);
```

### BoundedWildcard
Can generalize to `? super Inputs`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
        @Inline
        static <Input extends Routable, Inputs extends Routables<Input, ?>, Matches extends Routables<?, ?>>
        long foldlMissing(SetIntersections<Inputs, Matches> setIntersections, ValueIntersections<Inputs, Matches> valueIntersections,
                   Inputs is, Matches ms, IndexedFoldToLong<? super Input> fold, long param, long initialValue, long terminalValue)
        {
```

### BoundedWildcard
Can generalize to `? super Matches`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
        @Inline
        static <Input extends Routable, Inputs extends Routables<Input, ?>, Matches extends Routables<?, ?>>
        long foldlMissing(SetIntersections<Inputs, Matches> setIntersections, ValueIntersections<Inputs, Matches> valueIntersections,
                   Inputs is, Matches ms, IndexedFoldToLong<? super Input> fold, long param, long initialValue, long terminalValue)
        {
```

### BoundedWildcard
Can generalize to `? super Inputs`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
        @Inline
        static <Input extends Routable, Inputs extends Routables<Input, ?>, Matches extends Routables<?, ?>>
        long foldlMissing(SetIntersections<Inputs, Matches> setIntersections, ValueIntersections<Inputs, Matches> valueIntersections,
                   Inputs is, Matches ms, IndexedFoldToLong<? super Input> fold, long param, long initialValue, long terminalValue)
        {
```

### BoundedWildcard
Can generalize to `? super Matches`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
        @Inline
        static <Input extends Routable, Inputs extends Routables<Input, ?>, Matches extends Routables<?, ?>>
        long foldlMissing(SetIntersections<Inputs, Matches> setIntersections, ValueIntersections<Inputs, Matches> valueIntersections,
                   Inputs is, Matches ms, IndexedFoldToLong<? super Input> fold, long param, long initialValue, long terminalValue)
        {
```

### BoundedWildcard
Can generalize to `? super Inputs`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java

        static <Input extends Routable, Inputs extends Routables<Input, ?>, Matches extends Routables<?, ?>>
        long rangeFoldl(SetIntersections<Inputs, Matches> setIntersections, ValueIntersections<Inputs, Matches> valueIntersections,
                        Inputs is, Matches ms, IndexedRangeFoldToLong fold, long param, long initialValue, long terminalValue)
        {
```

### BoundedWildcard
Can generalize to `? super Matches`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java

        static <Input extends Routable, Inputs extends Routables<Input, ?>, Matches extends Routables<?, ?>>
        long rangeFoldl(SetIntersections<Inputs, Matches> setIntersections, ValueIntersections<Inputs, Matches> valueIntersections,
                        Inputs is, Matches ms, IndexedRangeFoldToLong fold, long param, long initialValue, long terminalValue)
        {
```

### BoundedWildcard
Can generalize to `? super Inputs`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java

        static <Input extends Routable, Inputs extends Routables<Input, ?>, Matches extends Routables<?, ?>>
        long rangeFoldl(SetIntersections<Inputs, Matches> setIntersections, ValueIntersections<Inputs, Matches> valueIntersections,
                        Inputs is, Matches ms, IndexedRangeFoldToLong fold, long param, long initialValue, long terminalValue)
        {
```

### BoundedWildcard
Can generalize to `? super Matches`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java

        static <Input extends Routable, Inputs extends Routables<Input, ?>, Matches extends Routables<?, ?>>
        long rangeFoldl(SetIntersections<Inputs, Matches> setIntersections, ValueIntersections<Inputs, Matches> valueIntersections,
                        Inputs is, Matches ms, IndexedRangeFoldToLong fold, long param, long initialValue, long terminalValue)
        {
```

### BoundedWildcard
Can generalize to `? super Inputs`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
        @Inline
        static <Input extends Routable, Inputs extends Routables<Input, ?>, Matches extends Routables<?, ?>, T>
        T foldl(SetIntersections<Inputs, Matches> setIntersections, ValueIntersections<Inputs, Matches> valueIntersections,
                Inputs is, Matches ms, IndexedFold<? super Input, T> fold, T initialValue)
        {
```

### BoundedWildcard
Can generalize to `? super Matches`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
        @Inline
        static <Input extends Routable, Inputs extends Routables<Input, ?>, Matches extends Routables<?, ?>, T>
        T foldl(SetIntersections<Inputs, Matches> setIntersections, ValueIntersections<Inputs, Matches> valueIntersections,
                Inputs is, Matches ms, IndexedFold<? super Input, T> fold, T initialValue)
        {
```

### BoundedWildcard
Can generalize to `? super Inputs`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
        @Inline
        static <Input extends Routable, Inputs extends Routables<Input, ?>, Matches extends Routables<?, ?>, T>
        T foldl(SetIntersections<Inputs, Matches> setIntersections, ValueIntersections<Inputs, Matches> valueIntersections,
                Inputs is, Matches ms, IndexedFold<? super Input, T> fold, T initialValue)
        {
```

### BoundedWildcard
Can generalize to `? super Matches`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
        @Inline
        static <Input extends Routable, Inputs extends Routables<Input, ?>, Matches extends Routables<?, ?>, T>
        T foldl(SetIntersections<Inputs, Matches> setIntersections, ValueIntersections<Inputs, Matches> valueIntersections,
                Inputs is, Matches ms, IndexedFold<? super Input, T> fold, T initialValue)
        {
```

### BoundedWildcard
Can generalize to `? super Inputs`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
        @Inline
        static <Input extends Routable, Inputs extends Routables<Input, ?>, Matches extends Routables<?, ?>>
        long foldl(SetIntersections<Inputs, Matches> setIntersections, ValueIntersections<Inputs, Matches> valueIntersections,
                   Inputs is, Matches ms, IndexedFoldToLong<? super Input> fold, long param, long initialValue, long terminalValue)
        {
```

### BoundedWildcard
Can generalize to `? super Matches`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
        @Inline
        static <Input extends Routable, Inputs extends Routables<Input, ?>, Matches extends Routables<?, ?>>
        long foldl(SetIntersections<Inputs, Matches> setIntersections, ValueIntersections<Inputs, Matches> valueIntersections,
                   Inputs is, Matches ms, IndexedFoldToLong<? super Input> fold, long param, long initialValue, long terminalValue)
        {
```

### BoundedWildcard
Can generalize to `? super Inputs`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
        @Inline
        static <Input extends Routable, Inputs extends Routables<Input, ?>, Matches extends Routables<?, ?>>
        long foldl(SetIntersections<Inputs, Matches> setIntersections, ValueIntersections<Inputs, Matches> valueIntersections,
                   Inputs is, Matches ms, IndexedFoldToLong<? super Input> fold, long param, long initialValue, long terminalValue)
        {
```

### BoundedWildcard
Can generalize to `? super Matches`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
        @Inline
        static <Input extends Routable, Inputs extends Routables<Input, ?>, Matches extends Routables<?, ?>>
        long foldl(SetIntersections<Inputs, Matches> setIntersections, ValueIntersections<Inputs, Matches> valueIntersections,
                   Inputs is, Matches ms, IndexedFoldToLong<? super Input> fold, long param, long initialValue, long terminalValue)
        {
```

### BoundedWildcard
Can generalize to `? super P1`
in `accord-core/src/main/java/accord/utils/SearchableRangeList.java`
#### Snippet
```java
    @Inline
    private <P1, P2, P3> int forEach(int start, int end, int floor, RoutableKey startBound,
                                     IndexedTriConsumer<P1, P2, P3> forEachScanOrCheckpoint, IndexedRangeTriConsumer<P1, P2, P3> forEachRange,
                                     P1 p1, P2 p2, P3 p3, int minIndex)
    {
```

### BoundedWildcard
Can generalize to `? super P2`
in `accord-core/src/main/java/accord/utils/SearchableRangeList.java`
#### Snippet
```java
    @Inline
    private <P1, P2, P3> int forEach(int start, int end, int floor, RoutableKey startBound,
                                     IndexedTriConsumer<P1, P2, P3> forEachScanOrCheckpoint, IndexedRangeTriConsumer<P1, P2, P3> forEachRange,
                                     P1 p1, P2 p2, P3 p3, int minIndex)
    {
```

### BoundedWildcard
Can generalize to `? super P3`
in `accord-core/src/main/java/accord/utils/SearchableRangeList.java`
#### Snippet
```java
    @Inline
    private <P1, P2, P3> int forEach(int start, int end, int floor, RoutableKey startBound,
                                     IndexedTriConsumer<P1, P2, P3> forEachScanOrCheckpoint, IndexedRangeTriConsumer<P1, P2, P3> forEachRange,
                                     P1 p1, P2 p2, P3 p3, int minIndex)
    {
```

### BoundedWildcard
Can generalize to `? super P1`
in `accord-core/src/main/java/accord/utils/SearchableRangeList.java`
#### Snippet
```java
    @Inline
    private <P1, P2, P3> int forEach(int start, int end, int floor, RoutableKey startBound,
                                     IndexedTriConsumer<P1, P2, P3> forEachScanOrCheckpoint, IndexedRangeTriConsumer<P1, P2, P3> forEachRange,
                                     P1 p1, P2 p2, P3 p3, int minIndex)
    {
```

### BoundedWildcard
Can generalize to `? super P2`
in `accord-core/src/main/java/accord/utils/SearchableRangeList.java`
#### Snippet
```java
    @Inline
    private <P1, P2, P3> int forEach(int start, int end, int floor, RoutableKey startBound,
                                     IndexedTriConsumer<P1, P2, P3> forEachScanOrCheckpoint, IndexedRangeTriConsumer<P1, P2, P3> forEachRange,
                                     P1 p1, P2 p2, P3 p3, int minIndex)
    {
```

### BoundedWildcard
Can generalize to `? super P3`
in `accord-core/src/main/java/accord/utils/SearchableRangeList.java`
#### Snippet
```java
    @Inline
    private <P1, P2, P3> int forEach(int start, int end, int floor, RoutableKey startBound,
                                     IndexedTriConsumer<P1, P2, P3> forEachScanOrCheckpoint, IndexedRangeTriConsumer<P1, P2, P3> forEachRange,
                                     P1 p1, P2 p2, P3 p3, int minIndex)
    {
```

### BoundedWildcard
Can generalize to `? super T`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
    }

    public static  <T> boolean isSortedUnique(T[] array, Comparator<T> comparator)
    {
        return isSorted(array, comparator, 0);
```

### BoundedWildcard
Can generalize to `? super A`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
     * that match elements of {@code select} as per the provided comparators.
     */
    public static <A, R> A[] sliceWithMultipleMatches(A[] slice, R[] select, IntFunction<A[]> factory, AsymmetricComparator<A, R> cmp1, AsymmetricComparator<R, A> cmp2)
    {
        A[] result;
```

### BoundedWildcard
Can generalize to `? super R`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
     * that match elements of {@code select} as per the provided comparators.
     */
    public static <A, R> A[] sliceWithMultipleMatches(A[] slice, R[] select, IntFunction<A[]> factory, AsymmetricComparator<A, R> cmp1, AsymmetricComparator<R, A> cmp2)
    {
        A[] result;
```

### BoundedWildcard
Can generalize to `? super R`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
     * that match elements of {@code select} as per the provided comparators.
     */
    public static <A, R> A[] sliceWithMultipleMatches(A[] slice, R[] select, IntFunction<A[]> factory, AsymmetricComparator<A, R> cmp1, AsymmetricComparator<R, A> cmp2)
    {
        A[] result;
```

### BoundedWildcard
Can generalize to `? super A`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
     * that match elements of {@code select} as per the provided comparators.
     */
    public static <A, R> A[] sliceWithMultipleMatches(A[] slice, R[] select, IntFunction<A[]> factory, AsymmetricComparator<A, R> cmp1, AsymmetricComparator<R, A> cmp2)
    {
        A[] result;
```

### BoundedWildcard
Can generalize to `? super T2`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
     */
    @Inline
    public static <T1, T2> int exponentialSearch(T2[] in, int from, int to, T1 find, AsymmetricComparator<T1, T2> comparator, Search op)
    {
        int step = 0;
```

### BoundedWildcard
Can generalize to `? super T`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
    }

    private static <T> boolean isSorted(T[] array, Comparator<T> comparator, int compareTo)
    {
        for (int i = 1 ; i < array.length ; ++i)
```

### BoundedWildcard
Can generalize to `? super T1`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
     * index in each array containing an equal item.
     */
    public static <T1, T2> long findNextIntersectionWithMultipleMatches(T1[] as, int ai, T2[] bs, int bi, AsymmetricComparator<T1, T2> cmp1, AsymmetricComparator<T2, T1> cmp2)
    {
        return findNextIntersection(as, ai, as.length, bs, bi, bs.length, cmp1, cmp2, Search.CEIL);
```

### BoundedWildcard
Can generalize to `? super T2`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
     * index in each array containing an equal item.
     */
    public static <T1, T2> long findNextIntersectionWithMultipleMatches(T1[] as, int ai, T2[] bs, int bi, AsymmetricComparator<T1, T2> cmp1, AsymmetricComparator<T2, T1> cmp2)
    {
        return findNextIntersection(as, ai, as.length, bs, bi, bs.length, cmp1, cmp2, Search.CEIL);
```

### BoundedWildcard
Can generalize to `? super T2`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
     * index in each array containing an equal item.
     */
    public static <T1, T2> long findNextIntersectionWithMultipleMatches(T1[] as, int ai, T2[] bs, int bi, AsymmetricComparator<T1, T2> cmp1, AsymmetricComparator<T2, T1> cmp2)
    {
        return findNextIntersection(as, ai, as.length, bs, bi, bs.length, cmp1, cmp2, Search.CEIL);
```

### BoundedWildcard
Can generalize to `? super T1`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
     * index in each array containing an equal item.
     */
    public static <T1, T2> long findNextIntersectionWithMultipleMatches(T1[] as, int ai, T2[] bs, int bi, AsymmetricComparator<T1, T2> cmp1, AsymmetricComparator<T2, T1> cmp2)
    {
        return findNextIntersection(as, ai, as.length, bs, bi, bs.length, cmp1, cmp2, Search.CEIL);
```

### BoundedWildcard
Can generalize to `? super T2`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
     */
    @Inline
    public static <T1, T2> int binarySearch(T2[] in, int from, int to, T1 find, AsymmetricComparator<T1, T2> comparator, Search op)
    {
        int found = -1;
```

### BoundedWildcard
Can generalize to `? super T`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
    }

    public static <T> boolean isSorted(T[] array, Comparator<T> comparator)
    {
        return isSorted(array, comparator, 1);
```

### BoundedWildcard
Can generalize to `? super T`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
     */
    @Inline
    public static <T> long findNextIntersection(T[] as, int ai, T[] bs, int bi, AsymmetricComparator<T, T> comparator)
    {
        return findNextIntersection(as, ai, as.length, bs, bi, bs.length, comparator, comparator, FAST);
```

### BoundedWildcard
Can generalize to `? super T`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
     */
    @Inline
    public static <T> long findNextIntersection(T[] as, int ai, T[] bs, int bi, AsymmetricComparator<T, T> comparator)
    {
        return findNextIntersection(as, ai, as.length, bs, bi, bs.length, comparator, comparator, FAST);
```

### BoundedWildcard
Can generalize to `? super Ranges`
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java

    // TODO (low priority, clarity): move to Topologies
    public static <I, O> O computeScope(Node.Id node, Topologies topologies, I keys, int startIndex, BiFunction<I, Ranges, O> slice, BiFunction<O, O, O> merge)
    {
        Ranges last = null;
```

### BoundedWildcard
Can generalize to `? extends O`
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java

    // TODO (low priority, clarity): move to Topologies
    public static <I, O> O computeScope(Node.Id node, Topologies topologies, I keys, int startIndex, BiFunction<I, Ranges, O> slice, BiFunction<O, O, O> merge)
    {
        Ranges last = null;
```

### BoundedWildcard
Can generalize to `? super O`
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java

    // TODO (low priority, clarity): move to Topologies
    public static <I, O> O computeScope(Node.Id node, Topologies topologies, I keys, int startIndex, BiFunction<I, Ranges, O> slice, BiFunction<O, O, O> merge)
    {
        Ranges last = null;
```

### BoundedWildcard
Can generalize to `? super O`
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java

    // TODO (low priority, clarity): move to Topologies
    public static <I, O> O computeScope(Node.Id node, Topologies topologies, I keys, int startIndex, BiFunction<I, Ranges, O> slice, BiFunction<O, O, O> merge)
    {
        Ranges last = null;
```

### BoundedWildcard
Can generalize to `? extends O`
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java

    // TODO (low priority, clarity): move to Topologies
    public static <I, O> O computeScope(Node.Id node, Topologies topologies, I keys, int startIndex, BiFunction<I, Ranges, O> slice, BiFunction<O, O, O> merge)
    {
        Ranges last = null;
```

### BoundedWildcard
Can generalize to `? super SafeCommandStore`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
    }

    public <T> void mapReduceConsumeLocal(TxnRequest<?> request, long minEpoch, long maxEpoch, MapReduceConsume<SafeCommandStore, T> mapReduceConsume)
    {
        commandStores.mapReduceConsume(request, request.scope(), minEpoch, maxEpoch, mapReduceConsume);
```

### BoundedWildcard
Can generalize to `? extends Id`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
    }

    public <T> void send(Collection<Id> to, Function<Id, Request> requestFactory)
    {
        to.forEach(dst -> send(dst, requestFactory.apply(dst)));
```

### BoundedWildcard
Can generalize to `? super Id`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
    }

    public <T> void send(Collection<Id> to, Function<Id, Request> requestFactory)
    {
        to.forEach(dst -> send(dst, requestFactory.apply(dst)));
```

### BoundedWildcard
Can generalize to `? extends Request`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
    }

    public <T> void send(Collection<Id> to, Function<Id, Request> requestFactory)
    {
        to.forEach(dst -> send(dst, requestFactory.apply(dst)));
```

### BoundedWildcard
Can generalize to `? super Id`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
    }

    private <T> void send(Shard shard, Request send, Set<Id> alreadyContacted)
    {
        shard.nodes.forEach(node -> {
```

### BoundedWildcard
Can generalize to `? super SafeCommandStore`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
    }

    public <T> void mapReduceConsumeLocal(PreLoadContext context, RoutingKey key, long minEpoch, long maxEpoch, MapReduceConsume<SafeCommandStore, T> mapReduceConsume)
    {
        commandStores.mapReduceConsume(context, key, minEpoch, maxEpoch, mapReduceConsume);
```

### BoundedWildcard
Can generalize to `? extends Future`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java

    @Inline
    public <T> Future<T> withEpoch(long epoch, Supplier<Future<T>> supplier)
    {
        if (topology.hasEpoch(epoch))
```

### BoundedWildcard
Can generalize to `? extends Id`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
    }

    public <T> void send(Collection<Id> to, Request send, Callback<T> callback)
    {
        to.forEach(dst -> send(dst, send, callback));
```

### BoundedWildcard
Can generalize to `? super SafeCommandStore`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
    }

    public <T> void mapReduceConsumeLocal(PreLoadContext context, Routables<?, ?> keys, long minEpoch, long maxEpoch, MapReduceConsume<SafeCommandStore, T> mapReduceConsume)
    {
        commandStores.mapReduceConsume(context, keys, minEpoch, maxEpoch, mapReduceConsume);
```

### BoundedWildcard
Can generalize to `? extends Id`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
    }

    public <T> void send(Collection<Id> to, Function<Id, Request> requestFactory, Callback<T> callback)
    {
        to.forEach(dst -> send(dst, requestFactory.apply(dst), callback));
```

### BoundedWildcard
Can generalize to `? super Id`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
    }

    public <T> void send(Collection<Id> to, Function<Id, Request> requestFactory, Callback<T> callback)
    {
        to.forEach(dst -> send(dst, requestFactory.apply(dst), callback));
```

### BoundedWildcard
Can generalize to `? extends Request`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
    }

    public <T> void send(Collection<Id> to, Function<Id, Request> requestFactory, Callback<T> callback)
    {
        to.forEach(dst -> send(dst, requestFactory.apply(dst), callback));
```

### BoundedWildcard
Can generalize to `? extends Id`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
    }

    public <T> void send(Collection<Id> to, Request send)
    {
        to.forEach(dst -> send(dst, send));
```

### BoundedWildcard
Can generalize to `? extends T1`
in `accord-core/src/main/java/accord/primitives/RangeDeps.java`
#### Snippet
```java
    private SearchableRangeList searchable;

    public static <T1, T2> RangeDeps merge(List<T1> merge, Function<T1, T2> getter1, Function<T2, RangeDeps> getter2)
    {
        try (LinearMerger<Range, TxnId, RangeDeps> linearMerger = new LinearMerger<>(ADAPTER))
```

### BoundedWildcard
Can generalize to `? super T1`
in `accord-core/src/main/java/accord/primitives/RangeDeps.java`
#### Snippet
```java
    private SearchableRangeList searchable;

    public static <T1, T2> RangeDeps merge(List<T1> merge, Function<T1, T2> getter1, Function<T2, RangeDeps> getter2)
    {
        try (LinearMerger<Range, TxnId, RangeDeps> linearMerger = new LinearMerger<>(ADAPTER))
```

### BoundedWildcard
Can generalize to `? extends T2`
in `accord-core/src/main/java/accord/primitives/RangeDeps.java`
#### Snippet
```java
    private SearchableRangeList searchable;

    public static <T1, T2> RangeDeps merge(List<T1> merge, Function<T1, T2> getter1, Function<T2, RangeDeps> getter2)
    {
        try (LinearMerger<Range, TxnId, RangeDeps> linearMerger = new LinearMerger<>(ADAPTER))
```

### BoundedWildcard
Can generalize to `? super T2`
in `accord-core/src/main/java/accord/primitives/RangeDeps.java`
#### Snippet
```java
    private SearchableRangeList searchable;

    public static <T1, T2> RangeDeps merge(List<T1> merge, Function<T1, T2> getter1, Function<T2, RangeDeps> getter2)
    {
        try (LinearMerger<Range, TxnId, RangeDeps> linearMerger = new LinearMerger<>(ADAPTER))
```

### BoundedWildcard
Can generalize to `? extends RangeDeps`
in `accord-core/src/main/java/accord/primitives/RangeDeps.java`
#### Snippet
```java
    private SearchableRangeList searchable;

    public static <T1, T2> RangeDeps merge(List<T1> merge, Function<T1, T2> getter1, Function<T2, RangeDeps> getter2)
    {
        try (LinearMerger<Range, TxnId, RangeDeps> linearMerger = new LinearMerger<>(ADAPTER))
```

### BoundedWildcard
Can generalize to `? super TxnId`
in `accord-core/src/main/java/accord/primitives/RangeDeps.java`
#### Snippet
```java
    // TODO (low priority, efficiency): ideally we would accept something like a BitHashSet or IntegerTrie
    //   as O(N) space needed for BitSet here (but with a very low constant multiplier)
    private void visitTxnIdx(int txnIdx, Consumer<TxnId> forEach, @Nullable BitSet visited)
    {
        if (visited == null || !visited.get(txnIdx))
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `static abstract`
in `accord-core/src/main/java/accord/local/SyncCommandStores.java`
#### Snippet
```java
    }

    public static abstract class SyncCommandStore extends CommandStore
    {
        public SyncCommandStore(int id)
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `accord-core/src/main/java/accord/messages/BeginRecovery.java`
#### Snippet
```java
    }

    public static abstract class RecoverReply implements Reply
    {
        @Override
```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `accord-core/src/main/java/accord/messages/BeginRecovery.java`
#### Snippet
```java
    public final PartialTxn partialTxn;
    public final Ballot ballot;
    public final @Nullable FullRoute<?> route;

    public BeginRecovery(Id to, Topologies topologies, TxnId txnId, Txn txn, FullRoute<?> route, Ballot ballot)
```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `accord-core/src/main/java/accord/messages/Accept.java`
#### Snippet
```java
        public final AcceptOutcome outcome;
        public final Ballot supersededBy;
        public final @Nullable PartialDeps deps;

        private AcceptReply(AcceptOutcome outcome)
```

### MissortedModifiers
Missorted modifiers `public @Nullable`
in `accord-core/src/main/java/accord/impl/InMemoryCommand.java`
#### Snippet
```java

    @Override
    public @Nullable PartialDeps partialDeps()
    {
        return partialDeps;
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `accord-core/src/main/java/accord/impl/InMemoryCommand.java`
#### Snippet
```java
    private Ballot promised = Ballot.ZERO, accepted = Ballot.ZERO;
    private Timestamp executeAt;
    private @Nullable PartialDeps partialDeps = null;
    private Writes writes;
    private Result result;
```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
    public static class ReadOk implements ReadReply
    {
        public final @Nullable Data data;

        public ReadOk(@Nullable Data data)
```

### MissortedModifiers
Missorted modifiers `public abstract @Nullable`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
     * If hasBeen(Committed) this must contain the keys for both txnId.epoch and executeAt.epoch
     */
    public abstract @Nullable Route<?> route();
    protected abstract void setRoute(Route<?> route);

```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `accord-core/src/main/java/accord/messages/BeginInvalidation.java`
#### Snippet
```java
        public final boolean acceptedFastPath;
        public final @Nullable Route<?> route;
        public final @Nullable RoutingKey homeKey;

        public InvalidateReply(Ballot supersededBy, Ballot accepted, Status status, boolean acceptedFastPath, @Nullable Route<?> route, @Nullable RoutingKey homeKey)
```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `accord-core/src/main/java/accord/messages/BeginInvalidation.java`
#### Snippet
```java
        public final Status status;
        public final boolean acceptedFastPath;
        public final @Nullable Route<?> route;
        public final @Nullable RoutingKey homeKey;

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java

    // TODO (expected, efficiency): cache this object per thread
    public static abstract class AbstractBuilder<K, V, T> implements AutoCloseable
    {
        final Adapter<K, V> adapter;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
public class InMemoryCommandStore
{
    public static abstract class State implements SafeCommandStore
    {
        private final NodeTimeService time;
```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `accord-core/src/main/java/accord/messages/Commit.java`
#### Snippet
```java

    public final Timestamp executeAt;
    public final @Nullable PartialTxn partialTxn;
    public final PartialDeps partialDeps;
    public final @Nullable FullRoute<?> route;
```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `accord-core/src/main/java/accord/messages/Commit.java`
#### Snippet
```java
    public final @Nullable PartialTxn partialTxn;
    public final PartialDeps partialDeps;
    public final @Nullable FullRoute<?> route;
    public final ReadData read;

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `accord-core/src/main/java/accord/messages/CheckStatus.java`
#### Snippet
```java
    }

    public static abstract class CheckStatusReply implements Reply
    {
        abstract public boolean isOk();
```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `accord-core/src/main/java/accord/messages/CheckStatus.java`
#### Snippet
```java
        public final Ballot promised;
        public final Ballot accepted;
        public final @Nullable Timestamp executeAt; // not set if invalidating or invalidated
        public final boolean isCoordinating;
        public final Durability durability; // i.e. on all shards
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `accord-core/src/main/java/accord/messages/CheckStatus.java`
#### Snippet
```java
    public static abstract class CheckStatusReply implements Reply
    {
        abstract public boolean isOk();
    }

```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `accord-core/src/main/java/accord/messages/CheckStatus.java`
#### Snippet
```java
        public final Durability durability; // i.e. on all shards
        public final @Nullable Route<?> route;
        public final @Nullable RoutingKey homeKey;

        public CheckStatusOk(Node node, Command command)
```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `accord-core/src/main/java/accord/messages/CheckStatus.java`
#### Snippet
```java
        public final boolean isCoordinating;
        public final Durability durability; // i.e. on all shards
        public final @Nullable Route<?> route;
        public final @Nullable RoutingKey homeKey;

```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `accord-core/src/main/java/accord/coordinate/CoordinateFailed.java`
#### Snippet
```java
public class CoordinateFailed extends Throwable
{
    private @Nullable TxnId txnId;
    private @Nullable RoutingKey homeKey;
    public CoordinateFailed(TxnId txnId, @Nullable RoutingKey homeKey)
```

### MissortedModifiers
Missorted modifiers `public @Nullable`
in `accord-core/src/main/java/accord/coordinate/CoordinateFailed.java`
#### Snippet
```java
    }

    public @Nullable TxnId txnId()
    {
        return txnId;
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `accord-core/src/main/java/accord/coordinate/CoordinateFailed.java`
#### Snippet
```java
{
    private @Nullable TxnId txnId;
    private @Nullable RoutingKey homeKey;
    public CoordinateFailed(TxnId txnId, @Nullable RoutingKey homeKey)
    {
```

### MissortedModifiers
Missorted modifiers `public @Nullable`
in `accord-core/src/main/java/accord/coordinate/CoordinateFailed.java`
#### Snippet
```java
    }

    public @Nullable RoutingKey homeKey()
    {
        return homeKey;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java

    // TODO (expected, efficiency): cache this object per thread
    public static abstract class AbstractBuilder<T extends Deps> implements AutoCloseable
    {
        final KeyDeps.Builder keyBuilder;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `accord-core/src/main/java/accord/utils/ArrayBuffers.java`
#### Snippet
```java
     * Works on both primitive and Object arrays.
     */
    private static abstract class AbstractBufferCache<B>
    {
        interface Clear<B>
```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `accord-core/src/main/java/accord/messages/PreAccept.java`
#### Snippet
```java

    public final PartialTxn partialTxn;
    public final @Nullable FullRoute<?> route; // ordinarily only set on home shard
    public final long maxEpoch;

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `accord-core/src/main/java/accord/messages/PreAccept.java`
#### Snippet
```java
    }

    public static abstract class PreAcceptReply implements Reply
    {
        @Override
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `accord-core/src/main/java/accord/coordinate/RecoverWithRoute.java`
#### Snippet
```java
public class RecoverWithRoute extends CheckShards
{
    final @Nullable Ballot promisedBallot; // if non-null, has already been promised by some shard
    final FullRoute<?> route;
    final BiConsumer<Outcome, Throwable> callback;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java
public abstract class TxnRequest<R> implements Request, PreLoadContext, MapReduceConsume<SafeCommandStore, R>
{
    public static abstract class WithUnsynced<R> extends TxnRequest<R>
    {
        public final long minUnsyncedEpoch; // TODO (low priority, clarity): can this just always be TxnId.epoch?
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
    }

    private @Nullable RoutingKey trySelectHomeKey(TxnId txnId, Seekables<?, ?> keysOrRanges)
    {
        Ranges owned = topology().localForEpoch(txnId.epoch()).ranges();
```

## RuleId[ruleID=NullableProblems]
### NullableProblems
Overridden methods are not annotated
in `accord-core/src/main/java/accord/primitives/Txn.java`
#### Snippet
```java
    @Nullable Update update();

    @Nonnull PartialTxn slice(Ranges ranges, boolean includeQuery);

    default boolean isWrite()
```

### NullableProblems
Overridden methods are not annotated
in `accord-core/src/main/java/accord/primitives/Txn.java`
#### Snippet
```java
    }

    @Nonnull Kind kind();
    @Nonnull Seekables<?, ?> keys();
    @Nonnull Read read();
```

### NullableProblems
Overridden methods are not annotated
in `accord-core/src/main/java/accord/primitives/Txn.java`
#### Snippet
```java

    @Nonnull Kind kind();
    @Nonnull Seekables<?, ?> keys();
    @Nonnull Read read();
    @Nullable Query query(); // may be null only in PartialTxn
```

### NullableProblems
Overridden methods are not annotated
in `accord-core/src/main/java/accord/primitives/Txn.java`
#### Snippet
```java
    @Nonnull Kind kind();
    @Nonnull Seekables<?, ?> keys();
    @Nonnull Read read();
    @Nullable Query query(); // may be null only in PartialTxn
    @Nullable Update update();
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `accord-core/src/main/java/accord/coordinate/CoordinateFailed.java`
#### Snippet
```java
    private @Nullable TxnId txnId;
    private @Nullable RoutingKey homeKey;
    public CoordinateFailed(TxnId txnId, @Nullable RoutingKey homeKey)
    {
        this.txnId = txnId;
```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `txnIds()` is identical to its super method
in `accord-core/src/main/java/accord/messages/InformOfTxnId.java`
#### Snippet
```java

    @Override
    public Iterable<TxnId> txnIds()
    {
        // TODO (expected, efficiency): should be empty list, as can be written without existing state
```

### RedundantMethodOverride
Method `txnIds()` is identical to its super method
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java

    @Override
    public Iterable<TxnId> txnIds()
    {
        return Collections.singleton(txnId);
```

### RedundantMethodOverride
Method `keys()` is identical to its super method
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java

    @Override
    public Seekables<?, ?> keys()
    {
        return Keys.EMPTY;
```

### RedundantMethodOverride
Method `txnIds()` is identical to its super method
in `accord-core/src/main/java/accord/messages/BeginInvalidation.java`
#### Snippet
```java

    @Override
    public Iterable<TxnId> txnIds()
    {
        return Collections.singleton(txnId);
```

### RedundantMethodOverride
Method `keys()` is identical to its super method
in `accord-core/src/main/java/accord/messages/BeginInvalidation.java`
#### Snippet
```java

    @Override
    public Seekables<?, ?> keys()
    {
        return Keys.EMPTY;
```

### RedundantMethodOverride
Method `txnIds()` is identical to its super method
in `accord-core/src/main/java/accord/messages/CheckStatus.java`
#### Snippet
```java

    @Override
    public Iterable<TxnId> txnIds()
    {
        return Collections.singleton(txnId);
```

### RedundantMethodOverride
Method `keys()` is identical to its super method
in `accord-core/src/main/java/accord/messages/CheckStatus.java`
#### Snippet
```java

    @Override
    public Seekables<?, ?> keys()
    {
        return Keys.EMPTY;
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `InMemory` is the same as one of its superclass' names
in `accord-core/src/main/java/accord/primitives/PartialTxn.java`
#### Snippet
```java

    // TODO (low priority, clarity): override toString
    class InMemory extends Txn.InMemory implements PartialTxn
    {
        public final Ranges covering;
```

### ClassNameSameAsAncestorName
Class name `Splitter` is the same as one of its superclass' names
in `accord-maelstrom/src/main/java/accord/maelstrom/MaelstromKey.java`
#### Snippet
```java
public class MaelstromKey implements RoutableKey
{
    public static class Splitter implements ShardDistributor.EvenSplit.Splitter<Long>
    {
        private static long hash(RoutingKey routingKey)
```

### ClassNameSameAsAncestorName
Class name `Key` is the same as one of its superclass' names
in `accord-maelstrom/src/main/java/accord/maelstrom/MaelstromKey.java`
#### Snippet
```java
    }

    public static class Key extends MaelstromKey implements accord.api.Key
    {
        public Key(Datum.Kind kind, Object value)
```

### ClassNameSameAsAncestorName
Class name `Range` is the same as one of its superclass' names
in `accord-maelstrom/src/main/java/accord/maelstrom/MaelstromKey.java`
#### Snippet
```java
    }

    public static class Range extends accord.primitives.Range.EndInclusive
    {
        public Range(RoutingKey start, RoutingKey end)
```

### ClassNameSameAsAncestorName
Class name `Entry` is the same as one of its superclass' names
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
    }

    public static class Entry<K, V> implements Map.Entry<K, V>
    {
        final K key;
```

### ClassNameSameAsAncestorName
Class name `Reply` is the same as one of its superclass' names
in `accord-core/src/main/java/accord/coordinate/ReadCoordinator.java`
#### Snippet
```java
import static com.google.common.collect.Sets.newHashSetWithExpectedSize;

abstract class ReadCoordinator<Reply extends accord.messages.Reply> extends ReadTracker implements Callback<Reply>
{
    protected enum Action
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `accord-core/src/main/java/accord/impl/InMemoryCommandStores.java`
#### Snippet
```java
        public <T> T mapReduce(PreLoadContext context, Routables<?, ?> keys, long minEpoch, long maxEpoch, MapReduce<? super SafeCommandStore, T> map)
        {
            return super.mapReduce(context, keys, minEpoch, maxEpoch, map, SyncMapReduceAdapter.instance());
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `accord-core/src/main/java/accord/coordinate/tracking/FastPathTracker.java`
#### Snippet
```java
    {
        super(topologies, FastPathShardTracker[]::new, FastPathShardTracker::new);
        this.waitingOnFastPathSuccess = super.waitingOnShards;
    }

```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import accord.utils.ArrayBuffers;`
in `accord-core/src/main/java/accord/api/RoutingKey.java`
#### Snippet
```java
import accord.primitives.RoutableKey;
import accord.primitives.Unseekable;
import accord.utils.ArrayBuffers;

import java.util.Arrays;
```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `accord-core/src/main/java/accord/api/RoutingKey.java`
#### Snippet
```java
import accord.utils.ArrayBuffers;

import java.util.Arrays;

import static accord.utils.ArrayBuffers.cachedRoutingKeys;
```

### UNUSED_IMPORT
Unused import `import static accord.utils.ArrayBuffers.cachedRoutingKeys;`
in `accord-core/src/main/java/accord/api/RoutingKey.java`
#### Snippet
```java
import java.util.Arrays;

import static accord.utils.ArrayBuffers.cachedRoutingKeys;

public interface RoutingKey extends Unseekable, RoutableKey
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Keys;`
in `accord-core/src/main/java/accord/api/Update.java`
#### Snippet
```java

import accord.primitives.Ranges;
import accord.primitives.Keys;
import accord.primitives.Seekables;

```

### UNUSED_IMPORT
Unused import `import accord.primitives.Deps;`
in `accord-core/src/main/java/accord/coordinate/Persist.java`
#### Snippet
```java
import accord.messages.Commit.Kind;
import accord.messages.InformHomeDurable;
import accord.primitives.Deps;
import accord.primitives.Txn;
import accord.primitives.*;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Txn;`
in `accord-core/src/main/java/accord/coordinate/Persist.java`
#### Snippet
```java
import accord.messages.InformHomeDurable;
import accord.primitives.Deps;
import accord.primitives.Txn;
import accord.primitives.*;
import accord.topology.Shard;
```

### UNUSED_IMPORT
Unused import `import accord.utils.Invariants;`
in `accord-core/src/main/java/accord/coordinate/Propose.java`
#### Snippet
```java
import accord.messages.Accept;
import accord.messages.Accept.AcceptReply;
import accord.utils.Invariants;

import static accord.coordinate.tracking.AbstractTracker.ShardOutcomes.Fail;
```

### UNUSED_IMPORT
Unused import `import accord.utils.Invariants;`
in `accord-core/src/main/java/accord/coordinate/ReadCoordinator.java`
#### Snippet
```java
import accord.primitives.TxnId;
import accord.topology.Topologies;
import accord.utils.Invariants;

import java.util.*;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Txn.Kind;`
in `accord-core/src/main/java/accord/impl/InMemoryCommand.java`
#### Snippet
```java
import accord.local.Status.Known;
import accord.primitives.*;
import accord.primitives.Txn.Kind;
import accord.utils.Invariants;

```

### UNUSED_IMPORT
Unused import `import accord.primitives.Timestamp;`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
import accord.local.CommandStores.RangesForEpoch;
import accord.impl.CommandsForKey.CommandTimeseries;
import accord.primitives.Timestamp;
import accord.primitives.TxnId;
import accord.primitives.*;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.TxnId;`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
import accord.impl.CommandsForKey.CommandTimeseries;
import accord.primitives.Timestamp;
import accord.primitives.TxnId;
import accord.primitives.*;
import accord.utils.Invariants;
```

### UNUSED_IMPORT
Unused import `import accord.local.CommandStore;`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStores.java`
#### Snippet
```java
import accord.api.DataStore;
import accord.api.ProgressLog;
import accord.local.CommandStore;
import accord.primitives.Routables;
import accord.utils.MapReduce;
```

### UNUSED_IMPORT
Unused import `import static accord.local.Status.KnownDeps.DepsUnknown;`
in `accord-core/src/main/java/accord/impl/InMemoryCommandsForKey.java`
#### Snippet
```java
import static accord.local.SafeCommandStore.TestDep.*;
import static accord.local.SafeCommandStore.TestKind.Ws;
import static accord.local.Status.KnownDeps.DepsUnknown;
import static accord.local.Status.PreAccepted;
import static accord.local.Status.PreCommitted;
```

### UNUSED_IMPORT
Unused import `import accord.local.Status.Durability;`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java

import accord.api.*;
import accord.local.Status.Durability;
import accord.local.Status.Known;
import accord.primitives.*;
```

### UNUSED_IMPORT
Unused import `import accord.local.Status.Known;`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
import accord.api.*;
import accord.local.Status.Durability;
import accord.local.Status.Known;
import accord.primitives.*;
import accord.primitives.Writes;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Writes;`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
import accord.local.Status.Known;
import accord.primitives.*;
import accord.primitives.Writes;
import accord.utils.Invariants;
import org.apache.cassandra.utils.concurrent.Future;
```

### UNUSED_IMPORT
Unused import `import static accord.local.Status.Known.Done;`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
import static accord.local.Status.*;
import static accord.local.Status.Known.*;
import static accord.local.Status.Known.Done;
import static accord.local.Status.Known.ExecuteAtOnly;
import static accord.primitives.Route.isFullRoute;
```

### UNUSED_IMPORT
Unused import `import static accord.local.Status.Known.ExecuteAtOnly;`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
import static accord.local.Status.Known.*;
import static accord.local.Status.Known.Done;
import static accord.local.Status.Known.ExecuteAtOnly;
import static accord.primitives.Route.isFullRoute;
import static accord.utils.Utils.listOf;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Ranges;`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java

import accord.api.ProgressLog.ProgressShard;
import accord.primitives.Ranges;
import accord.primitives.Ballot;
import accord.primitives.PartialDeps;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Ballot;`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
import accord.api.ProgressLog.ProgressShard;
import accord.primitives.Ranges;
import accord.primitives.Ballot;
import accord.primitives.PartialDeps;
import accord.primitives.PartialTxn;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.PartialDeps;`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
import accord.primitives.Ranges;
import accord.primitives.Ballot;
import accord.primitives.PartialDeps;
import accord.primitives.PartialTxn;
import accord.primitives.Route;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.PartialTxn;`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
import accord.primitives.Ballot;
import accord.primitives.PartialDeps;
import accord.primitives.PartialTxn;
import accord.primitives.Route;
import accord.primitives.Timestamp;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Route;`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
import accord.primitives.PartialDeps;
import accord.primitives.PartialTxn;
import accord.primitives.Route;
import accord.primitives.Timestamp;
import accord.primitives.TxnId;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Timestamp;`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
import accord.primitives.PartialTxn;
import accord.primitives.Route;
import accord.primitives.Timestamp;
import accord.primitives.TxnId;
import accord.api.Result;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.TxnId;`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
import accord.primitives.Route;
import accord.primitives.Timestamp;
import accord.primitives.TxnId;
import accord.api.Result;
import accord.api.RoutingKey;
```

### UNUSED_IMPORT
Unused import `import accord.api.Result;`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
import accord.primitives.Timestamp;
import accord.primitives.TxnId;
import accord.api.Result;
import accord.api.RoutingKey;

```

### UNUSED_IMPORT
Unused import `import accord.api.RoutingKey;`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
import accord.primitives.TxnId;
import accord.api.Result;
import accord.api.RoutingKey;

import static accord.api.ProgressLog.ProgressShard.Home;
```

### UNUSED_IMPORT
Unused import `import accord.api.ProgressLog;`
in `accord-core/src/main/java/accord/local/CommandStore.java`
#### Snippet
```java

import accord.api.*;
import accord.api.ProgressLog;
import accord.api.DataStore;
import accord.local.CommandStores.RangesForEpochHolder;
```

### UNUSED_IMPORT
Unused import `import accord.api.DataStore;`
in `accord-core/src/main/java/accord/local/CommandStore.java`
#### Snippet
```java
import accord.api.*;
import accord.api.ProgressLog;
import accord.api.DataStore;
import accord.local.CommandStores.RangesForEpochHolder;
import org.apache.cassandra.utils.concurrent.Future;
```

### UNUSED_IMPORT
Unused import `import accord.api.RoutingKey;`
in `accord-core/src/main/java/accord/local/CommandStores.java`
#### Snippet
```java
import accord.api.*;
import accord.primitives.*;
import accord.api.RoutingKey;
import accord.topology.Topology;
import accord.utils.MapReduce;
```

### UNUSED_IMPORT
Unused import `import accord.api.Agent;`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
import javax.annotation.Nullable;

import accord.api.Agent;
import accord.api.Key;
import accord.api.MessageSink;
```

### UNUSED_IMPORT
Unused import `import accord.api.Key;`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java

import accord.api.Agent;
import accord.api.Key;
import accord.api.MessageSink;
import accord.api.Result;
```

### UNUSED_IMPORT
Unused import `import accord.api.MessageSink;`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
import accord.api.Agent;
import accord.api.Key;
import accord.api.MessageSink;
import accord.api.Result;
import accord.api.ProgressLog;
```

### UNUSED_IMPORT
Unused import `import accord.api.Result;`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
import accord.api.Key;
import accord.api.MessageSink;
import accord.api.Result;
import accord.api.ProgressLog;
import accord.api.Scheduler;
```

### UNUSED_IMPORT
Unused import `import accord.api.ProgressLog;`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
import accord.api.MessageSink;
import accord.api.Result;
import accord.api.ProgressLog;
import accord.api.Scheduler;
import accord.api.DataStore;
```

### UNUSED_IMPORT
Unused import `import accord.api.Scheduler;`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
import accord.api.Result;
import accord.api.ProgressLog;
import accord.api.Scheduler;
import accord.api.DataStore;
import accord.messages.Callback;
```

### UNUSED_IMPORT
Unused import `import accord.api.DataStore;`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
import accord.api.ProgressLog;
import accord.api.Scheduler;
import accord.api.DataStore;
import accord.messages.Callback;
import accord.messages.ReplyContext;
```

### UNUSED_IMPORT
Unused import `import accord.messages.Callback;`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
import accord.api.Scheduler;
import accord.api.DataStore;
import accord.messages.Callback;
import accord.messages.ReplyContext;
import accord.messages.Request;
```

### UNUSED_IMPORT
Unused import `import accord.messages.ReplyContext;`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
import accord.api.DataStore;
import accord.messages.Callback;
import accord.messages.ReplyContext;
import accord.messages.Request;
import accord.messages.Reply;
```

### UNUSED_IMPORT
Unused import `import accord.messages.Request;`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
import accord.messages.Callback;
import accord.messages.ReplyContext;
import accord.messages.Request;
import accord.messages.Reply;
import accord.coordinate.RecoverWithRoute;
```

### UNUSED_IMPORT
Unused import `import accord.messages.Reply;`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
import accord.messages.ReplyContext;
import accord.messages.Request;
import accord.messages.Reply;
import accord.coordinate.RecoverWithRoute;
import accord.topology.Shard;
```

### UNUSED_IMPORT
Unused import `import accord.coordinate.RecoverWithRoute;`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
import accord.messages.Request;
import accord.messages.Reply;
import accord.coordinate.RecoverWithRoute;
import accord.topology.Shard;
import accord.topology.Topology;
```

### UNUSED_IMPORT
Unused import `import static accord.local.Status.KnownExecuteAt.ExecuteAtKnown;`
in `accord-core/src/main/java/accord/local/Status.java`
#### Snippet
```java
import static accord.local.Status.KnownDeps.*;
import static accord.local.Status.KnownExecuteAt.*;
import static accord.local.Status.KnownExecuteAt.ExecuteAtKnown;
import static accord.local.Status.KnownExecuteAt.ExecuteAtProposed;
import static accord.local.Status.Outcome.*;
```

### UNUSED_IMPORT
Unused import `import static accord.local.Status.KnownExecuteAt.ExecuteAtProposed;`
in `accord-core/src/main/java/accord/local/Status.java`
#### Snippet
```java
import static accord.local.Status.KnownExecuteAt.*;
import static accord.local.Status.KnownExecuteAt.ExecuteAtKnown;
import static accord.local.Status.KnownExecuteAt.ExecuteAtProposed;
import static accord.local.Status.Outcome.*;
import static accord.local.Status.Phase.*;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.PartialDeps;`
in `accord-core/src/main/java/accord/messages/Accept.java`
#### Snippet
```java
import accord.api.RoutingKey;
import accord.local.Command.AcceptOutcome;
import accord.primitives.PartialDeps;
import accord.primitives.FullRoute;
import accord.primitives.Ballot;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.FullRoute;`
in `accord-core/src/main/java/accord/messages/Accept.java`
#### Snippet
```java
import accord.local.Command.AcceptOutcome;
import accord.primitives.PartialDeps;
import accord.primitives.FullRoute;
import accord.primitives.Ballot;
import accord.local.Command;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Ballot;`
in `accord-core/src/main/java/accord/messages/Accept.java`
#### Snippet
```java
import accord.primitives.PartialDeps;
import accord.primitives.FullRoute;
import accord.primitives.Ballot;
import accord.local.Command;

```

### UNUSED_IMPORT
Unused import `import accord.primitives.Deps;`
in `accord-core/src/main/java/accord/messages/Accept.java`
#### Snippet
```java

import java.util.Collections;
import accord.primitives.Deps;
import accord.primitives.TxnId;

```

### UNUSED_IMPORT
Unused import `import accord.primitives.TxnId;`
in `accord-core/src/main/java/accord/messages/Accept.java`
#### Snippet
```java
import java.util.Collections;
import accord.primitives.Deps;
import accord.primitives.TxnId;

import javax.annotation.Nonnull;
```

### UNUSED_IMPORT
Unused import `import accord.local.Status.Phase;`
in `accord-core/src/main/java/accord/messages/BeginRecovery.java`
#### Snippet
```java
import accord.api.Result;
import accord.local.SafeCommandStore;
import accord.local.Status.Phase;
import accord.primitives.*;
import accord.topology.Topologies;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Ballot;`
in `accord-core/src/main/java/accord/messages/CheckStatus.java`
#### Snippet
```java
import accord.local.*;
import accord.local.Node.Id;
import accord.primitives.Ballot;
import accord.primitives.Timestamp;
import accord.primitives.TxnId;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Timestamp;`
in `accord-core/src/main/java/accord/messages/CheckStatus.java`
#### Snippet
```java
import accord.local.Node.Id;
import accord.primitives.Ballot;
import accord.primitives.Timestamp;
import accord.primitives.TxnId;

```

### UNUSED_IMPORT
Unused import `import accord.primitives.TxnId;`
in `accord-core/src/main/java/accord/messages/CheckStatus.java`
#### Snippet
```java
import accord.primitives.Ballot;
import accord.primitives.Timestamp;
import accord.primitives.TxnId;

import java.util.Collections;
```

### UNUSED_IMPORT
Unused import `import accord.local.PreLoadContext;`
in `accord-core/src/main/java/accord/messages/Commit.java`
#### Snippet
```java

import accord.local.*;
import accord.local.PreLoadContext;
import accord.messages.ReadData.ReadNack;
import accord.messages.ReadData.ReadReply;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Timestamp;`
in `accord-core/src/main/java/accord/messages/PreAccept.java`
#### Snippet
```java
import accord.messages.TxnRequest.WithUnsynced;
import accord.topology.Topologies;
import accord.primitives.Timestamp;
import javax.annotation.Nullable;

```

### UNUSED_IMPORT
Unused import `import accord.primitives.TxnId;`
in `accord-core/src/main/java/accord/messages/PreAccept.java`
#### Snippet
```java
import accord.primitives.*;

import accord.primitives.TxnId;

import static accord.local.SafeCommandStore.TestDep.ANY_DEPS;
```

### UNUSED_IMPORT
Unused import `import static accord.utils.MapReduceConsume.forEach;`
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
import static accord.messages.ReadData.ReadNack.Redundant;
import static accord.messages.TxnRequest.*;
import static accord.utils.MapReduceConsume.forEach;

// TODO (required, efficiency): dedup - can currently have infinite pending reads that will be executed independently
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Ranges;`
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java
import accord.local.Node.Id;
import accord.local.PreLoadContext;
import accord.primitives.Ranges;
import accord.primitives.PartialRoute;
import accord.primitives.Route;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.PartialRoute;`
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java
import accord.local.PreLoadContext;
import accord.primitives.Ranges;
import accord.primitives.PartialRoute;
import accord.primitives.Route;
import accord.primitives.FullRoute;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Route;`
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java
import accord.primitives.Ranges;
import accord.primitives.PartialRoute;
import accord.primitives.Route;
import accord.primitives.FullRoute;
import accord.topology.Topologies;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.FullRoute;`
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java
import accord.primitives.PartialRoute;
import accord.primitives.Route;
import accord.primitives.FullRoute;
import accord.topology.Topologies;
import accord.topology.Topology;
```

### UNUSED_IMPORT
Unused import `import static accord.primitives.Routables.Slice.Overlapping;`
in `accord-core/src/main/java/accord/primitives/KeyDeps.java`
#### Snippet
```java
import java.util.function.Predicate;

import static accord.primitives.Routables.Slice.Overlapping;
import static accord.utils.ArrayBuffers.*;
import static accord.utils.RelationMultiMap.*;
```

### UNUSED_IMPORT
Unused import `import static accord.primitives.Routables.Slice.Overlapping;`
in `accord-core/src/main/java/accord/primitives/PartialRangeRoute.java`
#### Snippet
```java

import static accord.primitives.AbstractRanges.UnionMode.MERGE_OVERLAPPING;
import static accord.primitives.Routables.Slice.Overlapping;

/**
```

### UNUSED_IMPORT
Unused import `import accord.utils.Invariants;`
in `accord-core/src/main/java/accord/primitives/PartialTxn.java`
#### Snippet
```java
import accord.api.Read;
import accord.api.Update;
import accord.utils.Invariants;

public interface PartialTxn extends Txn
```

### UNUSED_IMPORT
Unused import `import accord.utils.RelationMultiMap.AbstractBuilder;`
in `accord-core/src/main/java/accord/primitives/RangeDeps.java`
#### Snippet
```java
import accord.api.Key;
import accord.utils.*;
import accord.utils.RelationMultiMap.AbstractBuilder;
import accord.utils.RelationMultiMap.Adapter;
import net.nicoulaj.compilecommand.annotations.DontInline;
```

### UNUSED_IMPORT
Unused import `import accord.utils.RelationMultiMap.Adapter;`
in `accord-core/src/main/java/accord/primitives/RangeDeps.java`
#### Snippet
```java
import accord.utils.*;
import accord.utils.RelationMultiMap.AbstractBuilder;
import accord.utils.RelationMultiMap.Adapter;
import net.nicoulaj.compilecommand.annotations.DontInline;
import net.nicoulaj.compilecommand.annotations.Inline;
```

### UNUSED_IMPORT
Unused import `import static accord.utils.RelationMultiMap.remove;`
in `accord-core/src/main/java/accord/primitives/RangeDeps.java`
#### Snippet
```java
import static accord.utils.ArrayBuffers.*;
import static accord.utils.RelationMultiMap.*;
import static accord.utils.RelationMultiMap.remove;
import static accord.utils.SearchableRangeListBuilder.Links.LINKS;
import static accord.utils.SearchableRangeListBuilder.Strategy.ACCURATE;
```

### UNUSED_IMPORT
Unused import `import static accord.utils.SearchableRangeListBuilder.Links.LINKS;`
in `accord-core/src/main/java/accord/primitives/RangeDeps.java`
#### Snippet
```java
import static accord.utils.RelationMultiMap.*;
import static accord.utils.RelationMultiMap.remove;
import static accord.utils.SearchableRangeListBuilder.Links.LINKS;
import static accord.utils.SearchableRangeListBuilder.Strategy.ACCURATE;
import static accord.utils.SortedArrays.Search.CEIL;
```

### UNUSED_IMPORT
Unused import `import static accord.utils.SearchableRangeListBuilder.Strategy.ACCURATE;`
in `accord-core/src/main/java/accord/primitives/RangeDeps.java`
#### Snippet
```java
import static accord.utils.RelationMultiMap.remove;
import static accord.utils.SearchableRangeListBuilder.Links.LINKS;
import static accord.utils.SearchableRangeListBuilder.Strategy.ACCURATE;
import static accord.utils.SortedArrays.Search.CEIL;

```

### UNUSED_IMPORT
Unused import `import java.util.function.BiFunction;`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
import net.nicoulaj.compilecommand.annotations.Inline;

import java.util.function.BiFunction;
import java.util.function.Function;

```

### UNUSED_IMPORT
Unused import `import java.util.function.Function;`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java

import java.util.function.BiFunction;
import java.util.function.Function;

import static accord.primitives.Routables.Slice.Overlapping;
```

### UNUSED_IMPORT
Unused import `import static accord.primitives.Routables.Slice.Overlapping;`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
import java.util.function.Function;

import static accord.primitives.Routables.Slice.Overlapping;
import static accord.utils.SortedArrays.Search.FLOOR;

```

### UNUSED_IMPORT
Unused import `import static accord.primitives.Routables.Slice.Overlapping;`
in `accord-core/src/main/java/accord/primitives/Txn.java`
#### Snippet
```java
import javax.annotation.Nullable;

import static accord.primitives.Routables.Slice.Overlapping;

public interface Txn
```

### UNUSED_IMPORT
Unused import `import accord.local.CommandStores;`
in `accord-maelstrom/src/main/java/accord/maelstrom/Cluster.java`
#### Snippet
```java
import accord.coordinate.Timeout;
import accord.impl.SizeOfIntersectionSorter;
import accord.local.CommandStores;
import accord.impl.SimpleProgressLog;
import accord.impl.InMemoryCommandStores;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Keys;`
in `accord-maelstrom/src/main/java/accord/maelstrom/MaelstromQuery.java`
#### Snippet
```java
import accord.api.Query;
import accord.api.Result;
import accord.primitives.Keys;
import accord.primitives.TxnId;

```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`next.linkLength = next.linkLength & Integer.MAX_VALUE` could be simplified to 'next.linkLength \&= Integer.MAX_VALUE'
in `accord-core/src/main/java/accord/utils/SearchableRangeListBuilder.java`
#### Snippet
```java
                    {
                        // otherwise, flag the link as safely consumed without knowing the length
                        next.linkLength = next.linkLength & Integer.MAX_VALUE;
                    }
                }
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `accord-core/src/main/java/accord/utils/IntrusiveLinkedList.java`
#### Snippet
```java
    public IntrusiveLinkedList()
    {
        prev = next = this;
    }

```

### NestedAssignment
Result of assignment expression used
in `accord-core/src/main/java/accord/messages/BeginRecovery.java`
#### Snippet
```java
        {
            rejectsFastPath = false;
            earlierCommittedWitness = earlierAcceptedNoWitness = Deps.NONE;
        }
        else
```

### NestedAssignment
Result of assignment expression used
in `accord-core/src/main/java/accord/utils/DeterministicIdentitySet.java`
#### Snippet
```java
    public DeterministicIdentitySet(int size)
    {
        head.prev = head.next = head;
        lookup = new IdentityHashMap<>(size);
    }
```

### NestedAssignment
Result of assignment expression used
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
            case Set:
            case TrySet:
                setPartialTxn(partialTxn = partialTxn.slice(allRanges, shard.isHome()));
                // TODO (expected, efficiency): we may register the same ranges more than once
                // TODO (desirable, efficiency): no need to register on PreAccept if already Accepted
```

### NestedAssignment
Result of assignment expression used
in `accord-core/src/main/java/accord/coordinate/Invalidate.java`
#### Snippet
```java
                // We reach here if we failed to obtain promises from every shard.
                // If we had any actual failures reported we propagate these
                isDone = isPrepareDone = true;
                callback.accept(null, failure != null ? failure : new Preempted(txnId, null));
                break;
```

### NestedAssignment
Result of assignment expression used
in `accord-maelstrom/src/main/java/accord/maelstrom/Cluster.java`
#### Snippet
```java

            Packet next;
            while ((next = in.get()) != null)
                sinks.add(next);

```

### NestedAssignment
Result of assignment expression used
in `accord-core/src/main/java/accord/primitives/AbstractRanges.java`
#### Snippet
```java
                break;
            }
            else if ((c = b.end().compareTo(a.end())) <= 0)
            {
                bi++;
```

### NestedAssignment
Result of assignment expression used
in `accord-core/src/main/java/accord/primitives/AbstractRanges.java`
#### Snippet
```java
                {
                    ++removed;
                    ranges[i - removed] = prev = next;
                    continue;
                }
```

### NestedAssignment
Result of assignment expression used
in `accord-core/src/main/java/accord/primitives/AbstractRanges.java`
#### Snippet
```java
                    Range min;
                    if (ai == as.length) min = bs[bi];
                    else if (bi == bs.length) min = a = as[ai];
                    else min = as[ai].start().compareTo(bs[bi].start()) < 0 ? a = as[ai] : bs[bi];
                    if (min.start().compareTo(end) > 0)
```

### NestedAssignment
Result of assignment expression used
in `accord-core/src/main/java/accord/primitives/AbstractRanges.java`
#### Snippet
```java
                    if (ai == as.length) min = bs[bi];
                    else if (bi == bs.length) min = a = as[ai];
                    else min = as[ai].start().compareTo(bs[bi].start()) < 0 ? a = as[ai] : bs[bi];
                    if (min.start().compareTo(end) > 0)
                        break;
```

### NestedAssignment
Result of assignment expression used
in `accord-core/src/main/java/accord/utils/SearchableRangeListBuilder.java`
#### Snippet
```java
        void init(int goalScanDistance)
        {
            goal = peakMax = goalScanDistance;
        }

```

### NestedAssignment
Result of assignment expression used
in `accord-core/src/main/java/accord/utils/SearchableRangeListBuilder.java`
#### Snippet
```java
                pendingReuseTail.next = reuse;
                reuse = pendingReuse;
                pendingReuseTail = pendingReuse = null;
            }
            directCountAtPrevCheckpoint = minSpan = directCount;
```

### NestedAssignment
Result of assignment expression used
in `accord-core/src/main/java/accord/utils/SearchableRangeListBuilder.java`
#### Snippet
```java
                pendingReuseTail = pendingReuse = null;
            }
            directCountAtPrevCheckpoint = minSpan = directCount;
        }
    }
```

### NestedAssignment
Result of assignment expression used
in `accord-core/src/main/java/accord/utils/SearchableRangeList.java`
#### Snippet
```java
            // as this contains all ranges that might overlap us (whereas those that end
            // after us but before the next range's start would be missed by the next range index)
            start = floor = -2 - floor;
            if (start < 0)
                start = floor = 0;
```

### NestedAssignment
Result of assignment expression used
in `accord-core/src/main/java/accord/utils/SearchableRangeList.java`
#### Snippet
```java
            start = floor = -2 - floor;
            if (start < 0)
                start = floor = 0;
            else if (ranges[start].end().compareTo(range.start()) <= 0)
                ++start;
```

### NestedAssignment
Result of assignment expression used
in `accord-core/src/main/java/accord/utils/SearchableRangeList.java`
#### Snippet
```java
            // as this contains all ranges that might overlap us (whereas those that end
            // after us but before the next range's start would be missed by the next range index)
            start = floor = -2 - floor;
            if (start < 0)
                start = floor = 0;
```

### NestedAssignment
Result of assignment expression used
in `accord-core/src/main/java/accord/utils/SearchableRangeList.java`
#### Snippet
```java
            start = floor = -2 - floor;
            if (start < 0)
                start = floor = 0;
            else if (ranges[start].end().compareTo(key) <= 0)
                ++start;
```

### NestedAssignment
Result of assignment expression used
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java

                    case CEIL:
                        to = found = i;
                        break;

```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/messages/Apply.java`
#### Snippet
```java
        if (reply == ApplyReply.Applied)
        {
            node.ifLocal(empty(), scope.homeKey(), txnId.epoch(), instance -> {
                node.withEpoch(executeAt.epoch(), () -> instance.progressLog().durableLocal(txnId));
            }).addCallback(node.agent());
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/impl/SimpleProgressLog.java`
#### Snippet
```java
                    // make sure a quorum of the home shard is aware of the transaction, so we can rely on it to ensure progress
                    Future<Void> inform = inform(node, txnId, command.homeKey());
                    inform.addCallback((success, fail) -> {
                        commandStore.execute(PreLoadContext.empty(), ignore -> {
                            if (progress() == Done)
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/impl/SimpleProgressLog.java`
#### Snippet
```java
                    RoutingKey someKey = Route.isRoute(someKeys) ? (Route.castToRoute(someKeys)).homeKey() : someKeys.get(0).someIntersectingRoutingKey(null);
                    someKeys = someKeys.with(someKey);
                    debugInvestigating = Invalidate.invalidate(node, txnId, someKeys, (success, fail) -> {
                        commandStore.execute(PreLoadContext.empty(), ignore -> {
                            if (progress() != Investigating)
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/impl/SimpleProgressLog.java`
#### Snippet
```java
                    Unseekables<?, ?> someKeys = unseekables(command);

                    BiConsumer<Known, Throwable> callback = (success, fail) -> {
                        commandStore.execute(PreLoadContext.empty(), ignore -> {
                            if (progress() != Investigating)
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/impl/SimpleProgressLog.java`
#### Snippet
```java
                    };

                    node.withEpoch(toEpoch, () -> {
                        debugInvestigating = FetchData.fetch(blockedUntil, node, txnId, someKeys, executeAt, toEpoch, callback);
                    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/impl/SimpleProgressLog.java`
#### Snippet
```java
                                // if the home shard is at an earlier phase, it must run recovery
                                long epoch = command.executeAt().epoch();
                                node.withEpoch(epoch, () -> debugInvestigating = FetchData.fetch(PreApplied.minKnown, node, txnId, command.route(), epoch, (success, fail) -> {
                                    commandStore.execute(PreLoadContext.empty(), ignore -> {
                                        // should have found enough information to apply the result, but in case we did not reset progress
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/impl/SimpleProgressLog.java`
#### Snippet
```java

                                    Future<? extends Outcome> recover = node.maybeRecover(txnId, homeKey, command.route(), token);
                                    recover.addCallback((success, fail) -> {
                                        commandStore.execute(PreLoadContext.empty(), ignore -> {
                                            if (status.isAtMostReadyToExecute() && progress() == Investigating)
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/coordinate/Invalidate.java`
#### Snippet
```java
        Commit.Invalidate.commitInvalidate(node, txnId, route != null ? Unseekables.merge(route, (Unseekables)invalidateWith) : invalidateWith, txnId);
        // TODO (required, consider): pick a reasonable upper bound, so we don't invalidate into an epoch/commandStore that no longer cares about this command
        node.forEachLocalSince(contextFor(txnId), invalidateWith, txnId, safeStore -> {
            safeStore.command(txnId).commitInvalidate(safeStore);
        }).addCallback((s, f) -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
                case Range:
                    Range range = (Range) keyOrRange;
                    Ranges.of(range).slice(slice).forEach(r -> {
                        commandsForKey.subMap(r.start(), r.startInclusive(), r.end(), r.endInclusive())
                                .values().forEach(forEach);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
                case Range:
                    Ranges ranges = (Ranges) keysOrRanges;
                    ranges.slice(slice).forEach(range -> {
                        commandsForKey.subMap(range.start(), range.startInclusive(), range.end(), range.endInclusive())
                                .values().forEach(forEach);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/coordinate/RecoverWithRoute.java`
#### Snippet
```java
                {
                    Deps deps = merged.committedDeps.reconstitute(route());
                    node.withEpoch(merged.executeAt.epoch(), () -> {
                        Persist.persistAndCommit(node, txnId, route(), txn, merged.executeAt, deps, merged.writes, merged.result);
                    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/coordinate/Recover.java`
#### Snippet
```java
                case PreApplied:
                    // TODO (desired, efficiency): in some cases we can use the deps we already have (e.g. if we have a quorum of Committed responses)
                    node.withEpoch(executeAt.epoch(), () -> {
                        CollectDeps.withDeps(node, txnId, route, txn, acceptOrCommit.executeAt, (deps, fail) -> {
                            if (fail != null)
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/coordinate/Recover.java`
#### Snippet
```java
                case Committed:
                    // TODO (desired, efficiency): in some cases we can use the deps we already have (e.g. if we have a quorum of Committed responses)
                    node.withEpoch(executeAt.epoch(), () -> {
                        CollectDeps.withDeps(node, txnId, route, txn, executeAt, (deps, fail) -> {
                            if (fail != null) accept(null, fail);
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `new HashMap<>()` are updated, but never queried
in `accord-core/src/main/java/accord/coordinate/Propose.java`
#### Snippet
```java

    private final List<AcceptReply> acceptOks;
    private final Map<Id, AcceptReply> debug = debug() ? new HashMap<>() : null;
    private final Timestamp executeAt;
    private final QuorumTracker acceptTracker;
```

### MismatchedCollectionQueryUpdate
Contents of collection `new HashMap<>()` are updated, but never queried
in `accord-core/src/main/java/accord/coordinate/Invalidate.java`
#### Snippet
```java
    private final InvalidationTracker tracker;
    private Throwable failure;
    private final Map<Id, InvalidateReply> debug = Invariants.debug() ? new HashMap<>() : null;

    private Invalidate(Node node, Ballot ballot, TxnId txnId, Unseekables<?, ?> invalidateWith, boolean transitivelyInvokedByPriorInvalidation, BiConsumer<Outcome, Throwable> callback)
```

### MismatchedCollectionQueryUpdate
Contents of collection `new HashMap<>()` are updated, but never queried
in `accord-core/src/main/java/accord/coordinate/Recover.java`
#### Snippet
```java
    private final RecoveryTracker tracker;
    private boolean isBallotPromised;
    private final Map<Id, RecoverReply> debug = debug() ? new HashMap<>() : null;

    private Recover(Node node, Ballot ballot, TxnId txnId, Txn txn, FullRoute<?> route, BiConsumer<Outcome, Throwable> callback, Topologies topologies)
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `waitingOn` is accessed in both synchronized and unsynchronized contexts
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
    private Data data;
    private transient boolean isObsolete; // TODO (low priority, semantics): respond with the Executed result we have stored?
    private transient BitSet waitingOn;
    private transient int waitingOnCount;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `isObsolete` is accessed in both synchronized and unsynchronized contexts
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
    private final long waitForEpoch;
    private Data data;
    private transient boolean isObsolete; // TODO (low priority, semantics): respond with the Executed result we have stored?
    private transient BitSet waitingOn;
    private transient int waitingOnCount;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `isPrepareDone` is accessed in both synchronized and unsynchronized contexts
in `accord-core/src/main/java/accord/coordinate/Invalidate.java`
#### Snippet
```java

    private boolean isDone;
    private boolean isPrepareDone;
    private final boolean transitivelyInvokedByPriorInvalidation;
    private final List<InvalidateReply> replies = new ArrayList<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `isDone` is accessed in both synchronized and unsynchronized contexts
in `accord-core/src/main/java/accord/coordinate/Invalidate.java`
#### Snippet
```java
    private final BiConsumer<Outcome, Throwable> callback;

    private boolean isDone;
    private boolean isPrepareDone;
    private final boolean transitivelyInvokedByPriorInvalidation;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `isDone` is accessed in both synchronized and unsynchronized contexts
in `accord-core/src/main/java/accord/coordinate/Recover.java`
#### Snippet
```java
    private final FullRoute<?> route;
    private final BiConsumer<Outcome, Throwable> callback;
    private boolean isDone;

    private final List<RecoverOk> recoverOks = new ArrayList<>();
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `accord-core/src/main/java/accord/api/Agent.java`
#### Snippet
```java
    void onUncaughtException(Throwable t);

    void onHandledException(Throwable t);

    boolean isExpired(TxnId initiated, long now);
```

### EmptyMethod
Method only calls its super
in `accord-maelstrom/src/main/java/accord/maelstrom/SimpleConfigService.java`
#### Snippet
```java

    @Override
    public void fetchTopologyForEpoch(long epoch)
    {
        return;
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `accord-core/src/main/java/accord/api/Read.java`
#### Snippet
```java
        public final Keys keyScope;
        private Data result = null;
        private int pending = 0;

        public ReadFuture(Keys keyScope, List<Future<Data>> futures)
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `accord-core/src/main/java/accord/api/Read.java`
#### Snippet
```java
    {
        public final Keys keyScope;
        private Data result = null;
        private int pending = 0;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `accord-core/src/main/java/accord/impl/InMemoryCommand.java`
#### Snippet
```java
    private Ballot promised = Ballot.ZERO, accepted = Ballot.ZERO;
    private Timestamp executeAt;
    private @Nullable PartialDeps partialDeps = null;
    private Writes writes;
    private Result result;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
        return new Iterator<Map.Entry<K, V>>()
        {
            int i = keys.length, k = 0;

            @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
        V[] bufValues;
        int[] buf = null;
        int bufKeysLength, bufValuesLength = 0, bufLength = 0;
        T from = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
        K[] bufKeys;
        V[] bufValues;
        int[] buf = null;
        int bufKeysLength, bufValuesLength = 0, bufLength = 0;
        T from = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
        int[] buf = null;
        int bufKeysLength, bufValuesLength = 0, bufLength = 0;
        T from = null;

        public LinearMerger(Adapter<K, V> adapter)
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
        V[] bufValues;
        int[] buf = null;
        int bufKeysLength, bufValuesLength = 0, bufLength = 0;
        T from = null;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `accord-maelstrom/src/main/java/accord/maelstrom/Cluster.java`
#### Snippet
```java
        final Random random;

        int nextMessageId = 0;
        Map<Long, Callback> callbacks = new LinkedHashMap<>();

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `accord-core/src/main/java/accord/primitives/AbstractKeys.java`
#### Snippet
```java
        return new Iterator<K>()
        {
            int i = 0;
            @Override
            public boolean hasNext()
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `accord-core/src/main/java/accord/coordinate/tracking/ReadTracker.java`
#### Snippet
```java
    public static class ReadShardTracker extends ShardTracker
    {
        protected boolean hasData = false;
        protected int quorum; // if !hasData, a slowPathQuorum will trigger success
        protected int inflight;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `accord-core/src/main/java/accord/coordinate/tracking/RecoveryTracker.java`
#### Snippet
```java
    public static class RecoveryShardTracker extends QuorumShardTracker
    {
        protected int fastPathRejects = 0;

        private RecoveryShardTracker(Shard shard)
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
        private final Topology local;
        private final QuorumTracker syncTracker;
        private boolean syncComplete = false;
        private boolean prevSynced;

```

## RuleId[ruleID=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `accord-core/src/main/java/accord/primitives/PartialRangeRoute.java`
#### Snippet
```java
 * A slice of a Route that covers
 */
public class PartialRangeRoute extends RangeRoute implements PartialRoute<Range>
{
    public static class SerializationSupport
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `accord-core/src/main/java/accord/primitives/Keys.java`
#### Snippet
```java

// TODO (low priority, efficiency): this should probably be a BTree
public class Keys extends AbstractKeys<Key, Keys> implements Seekables<Key, Keys>
{
    public static class SerializationSupport
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `accord-core/src/main/java/accord/primitives/RangeRoute.java`
#### Snippet
```java
import static accord.primitives.Routables.Slice.Overlapping;

public abstract class RangeRoute extends AbstractRanges<Route<Range>> implements Route<Range>
{
    public final RoutingKey homeKey;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `accord-core/src/main/java/accord/primitives/KeyDeps.java`
#### Snippet
```java
 */
// TODO (desired, consider): switch to RoutingKey? Would mean adopting execution dependencies less precisely, but saving ser/deser of large keys
public class KeyDeps implements Iterable<Map.Entry<Key, TxnId>>
{
    public static final KeyDeps NONE = new KeyDeps(Keys.EMPTY, NO_TXNIDS, NO_INTS);
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `accord-core/src/main/java/accord/primitives/PartialDeps.java`
#### Snippet
```java
import accord.utils.Invariants;

public class PartialDeps extends Deps
{
    public static final PartialDeps NONE = new PartialDeps(Ranges.EMPTY, KeyDeps.NONE, RangeDeps.NONE);
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `accord-core/src/main/java/accord/primitives/RangeDeps.java`
#### Snippet
```java
 * functionality.
 */
public class RangeDeps implements Iterable<Map.Entry<Range, TxnId>>
{
    public static class SerializerSupport
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Iterable`
in `accord-core/src/main/java/accord/primitives/Unseekables.java`
#### Snippet
```java
 * Either a Route or a simple collection of keys or ranges
 */
public interface Unseekables<K extends Unseekable, U extends Unseekables<K, ?>> extends Iterable<K>, Routables<K, U>
{
    enum UnseekablesKind
```

### RedundantImplements
Redundant interface declaration `Unseekables`>
in `accord-core/src/main/java/accord/primitives/FullRoute.java`
#### Snippet
```java
package accord.primitives;

public interface FullRoute<T extends Unseekable> extends Route<T>, Unseekables<T, Route<T>>
{
    @Override default FullRoute<T> union(Route<T> route) { return this; }
```

### RedundantImplements
Redundant interface declaration `Request`
in `accord-core/src/main/java/accord/messages/InformOfTxnId.java`
#### Snippet
```java
import static accord.messages.SimpleReply.Ok;

public class InformOfTxnId extends AbstractEpochRequest<Reply> implements Request, PreLoadContext
{
    public final RoutingKey homeKey;
```

### RedundantImplements
Redundant interface declaration `PreLoadContext`
in `accord-core/src/main/java/accord/messages/InformOfTxnId.java`
#### Snippet
```java
import static accord.messages.SimpleReply.Ok;

public class InformOfTxnId extends AbstractEpochRequest<Reply> implements Request, PreLoadContext
{
    public final RoutingKey homeKey;
```

### RedundantImplements
Redundant interface declaration `Iterable`
in `accord-core/src/main/java/accord/primitives/Ranges.java`
#### Snippet
```java
import static accord.utils.Utils.toArray;

public class Ranges extends AbstractRanges<Ranges> implements Iterable<Range>, Seekables<Range, Ranges>, Unseekables<Range, Ranges>
{
    public static final Ranges EMPTY = ofSortedAndDeoverlappedUnchecked();
```

### RedundantImplements
Redundant interface declaration `Request`
in `accord-core/src/main/java/accord/messages/BeginInvalidation.java`
#### Snippet
```java
import static accord.utils.Functions.mapReduceNonNull;

public class BeginInvalidation extends AbstractEpochRequest<BeginInvalidation.InvalidateReply> implements Request, PreLoadContext
{
    public final Ballot ballot;
```

### RedundantImplements
Redundant interface declaration `PreLoadContext`
in `accord-core/src/main/java/accord/messages/BeginInvalidation.java`
#### Snippet
```java
import static accord.utils.Functions.mapReduceNonNull;

public class BeginInvalidation extends AbstractEpochRequest<BeginInvalidation.InvalidateReply> implements Request, PreLoadContext
{
    public final Ballot ballot;
```

### RedundantImplements
Redundant interface declaration `Unseekables`>
in `accord-core/src/main/java/accord/primitives/RoutingKeys.java`
#### Snippet
```java
import static accord.utils.ArrayBuffers.cachedRoutingKeys;

public class RoutingKeys extends AbstractUnseekableKeys<AbstractUnseekableKeys<?>> implements Unseekables<RoutingKey, AbstractUnseekableKeys<?>>
{
    public static class SerializationSupport
```

### RedundantImplements
Redundant interface declaration `SafeCommandStore`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
        }

        class AsyncState extends State implements SafeCommandStore
        {
            public AsyncState(NodeTimeService time, Agent agent, DataStore store, ProgressLog progressLog, RangesForEpochHolder rangesForEpoch, CommandStore commandStore)
```

### RedundantImplements
Redundant interface declaration `Iterable`
in `accord-core/src/main/java/accord/primitives/AbstractKeys.java`
#### Snippet
```java
@SuppressWarnings("rawtypes")
// TODO (desired, efficiency): check that foldl call-sites are inlined and optimised by HotSpot
public abstract class AbstractKeys<K extends RoutableKey, KS extends Routables<K, ?>> implements Iterable<K>, Routables<K, KS>
{
    final K[] keys;
```

### RedundantImplements
Redundant interface declaration `PreLoadContext`
in `accord-core/src/main/java/accord/messages/InformDurable.java`
#### Snippet
```java
import static accord.messages.SimpleReply.Ok;

public class InformDurable extends TxnRequest<Reply> implements PreLoadContext
{
    public static class SerializationSupport
```

### RedundantImplements
Redundant interface declaration `Request`
in `accord-core/src/main/java/accord/messages/CheckStatus.java`
#### Snippet
```java

public class CheckStatus extends AbstractEpochRequest<CheckStatus.CheckStatusOk>
        implements Request, PreLoadContext, MapReduceConsume<SafeCommandStore, CheckStatus.CheckStatusOk>
{
    public static class SerializationSupport
```

### RedundantImplements
Redundant interface declaration `PreLoadContext`
in `accord-core/src/main/java/accord/messages/CheckStatus.java`
#### Snippet
```java

public class CheckStatus extends AbstractEpochRequest<CheckStatus.CheckStatusOk>
        implements Request, PreLoadContext, MapReduceConsume<SafeCommandStore, CheckStatus.CheckStatusOk>
{
    public static class SerializationSupport
```

### RedundantImplements
Redundant interface declaration `MapReduceConsume`
in `accord-core/src/main/java/accord/messages/CheckStatus.java`
#### Snippet
```java

public class CheckStatus extends AbstractEpochRequest<CheckStatus.CheckStatusOk>
        implements Request, PreLoadContext, MapReduceConsume<SafeCommandStore, CheckStatus.CheckStatusOk>
{
    public static class SerializationSupport
```

### RedundantImplements
Redundant interface declaration `Iterable`
in `accord-core/src/main/java/accord/primitives/AbstractRanges.java`
#### Snippet
```java
import static accord.utils.SortedArrays.swapHighLow32b;

public abstract class AbstractRanges<RS extends Routables<Range, ?>> implements Iterable<Range>, Routables<Range, RS>
{
    static final Range[] NO_RANGES = new Range[0];
```

### RedundantImplements
Redundant interface declaration `Iterable`
in `accord-core/src/main/java/accord/primitives/AbstractUnseekableKeys.java`
#### Snippet
```java

// TODO: do we need this class?
public abstract class AbstractUnseekableKeys<KS extends Unseekables<RoutingKey, ?>> extends AbstractKeys<RoutingKey, KS> implements Iterable<RoutingKey>, Unseekables<RoutingKey, KS>
{
    AbstractUnseekableKeys(RoutingKey[] keys)
```

## RuleId[ruleID=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `StaleTopology` does not end with 'Exception'
in `accord-core/src/main/java/accord/coordinate/StaleTopology.java`
#### Snippet
```java
package accord.coordinate;

public class StaleTopology extends Exception
{
}
```

## RuleId[ruleID=ArrayEquality]
### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/Ranges.java`
#### Snippet
```java
    {
        return union(mode, this, that, this, that, (left, right, ranges) -> {
            if (ranges == left.ranges) return left;
            if (ranges == right.ranges) return right;
            return new Ranges(ranges);
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/Ranges.java`
#### Snippet
```java
        return union(mode, this, that, this, that, (left, right, ranges) -> {
            if (ranges == left.ranges) return left;
            if (ranges == right.ranges) return right;
            return new Ranges(ranges);
        });
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/Ranges.java`
#### Snippet
```java
    {
        return union(mode, this, that, this, that, (left, right, ranges) -> {
            if (ranges == left.ranges) return left;
            return new Ranges(ranges);
        });
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/Keys.java`
#### Snippet
```java
    private Keys wrap(Key[] wrap)
    {
        return wrap == keys ? this : new Keys(wrap);
    }
}
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/Keys.java`
#### Snippet
```java
    private Keys wrap(Key[] wrap, AbstractKeys<Key, ?> that)
    {
        return wrap == keys ? this : wrap == that.keys && that instanceof Keys ? (Keys)that : new Keys(wrap);
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/Keys.java`
#### Snippet
```java
    private Keys wrap(Key[] wrap, AbstractKeys<Key, ?> that)
    {
        return wrap == keys ? this : wrap == that.keys && that instanceof Keys ? (Keys)that : new Keys(wrap);
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/RoutingKeys.java`
#### Snippet
```java
    private RoutingKeys wrap(RoutingKey[] wrap, AbstractKeys<RoutingKey, ?> that)
    {
        return wrap == keys ? this : wrap == that.keys && that instanceof RoutingKeys ? (RoutingKeys)that : new RoutingKeys(wrap);
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/RoutingKeys.java`
#### Snippet
```java
    private RoutingKeys wrap(RoutingKey[] wrap, AbstractKeys<RoutingKey, ?> that)
    {
        return wrap == keys ? this : wrap == that.keys && that instanceof RoutingKeys ? (RoutingKeys)that : new RoutingKeys(wrap);
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/RoutingKeys.java`
#### Snippet
```java
    private RoutingKeys wrap(RoutingKey[] wrap)
    {
        return wrap == keys ? this : new RoutingKeys(wrap);
    }
}
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/PartialKeyRoute.java`
#### Snippet
```java
        RoutingKey[] keys = SortedArrays.linearUnion(this.keys, that.keys, RoutingKey[]::new);
        Ranges covering = this.covering.with(that.covering);
        if (covering == this.covering && keys == this.keys)
            return this;
        if (covering == that.covering && keys == that.keys)
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/PartialKeyRoute.java`
#### Snippet
```java
        if (covering == this.covering && keys == this.keys)
            return this;
        if (covering == that.covering && keys == that.keys)
            return that;
        return new PartialKeyRoute(covering, homeKey, keys);
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
                    keyBuffers, this, this, this
            );
            if (buf == keysToValues)
            {
                Invariants.checkState(keys == bufKeys && keys.length == bufKeysLength);
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
            if (buf == keysToValues)
            {
                Invariants.checkState(keys == bufKeys && keys.length == bufKeysLength);
                Invariants.checkState(values == bufValues && values.length == bufValuesLength);
                Invariants.checkState(keysToValues.length == bufLength);
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
            {
                Invariants.checkState(keys == bufKeys && keys.length == bufKeysLength);
                Invariants.checkState(values == bufValues && values.length == bufValuesLength);
                Invariants.checkState(keysToValues.length == bufLength);
                from = merge;
```

### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
                return;

            if (bufKeys != freeKeysIfNot)
            {
                keyBuffers.realDiscard(bufKeys, bufKeysLength);
```

### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
                bufKeys = null;
            }
            if (bufValues != freeValuesIfNot)
            {
                realDiscard(bufValues, bufValuesLength);
```

### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
                bufValues = null;
            }
            if (buf != freeBufIfNot)
            {
                realDiscard(buf, bufLength);
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
            outLength = outKeysLength;

            if (remapLeft == null && outKeys == leftKeys)
            {
                // "this" knows all the TxnId and Keys already, but do both agree on what Keys map to TxnIds?
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
                    return constructor.construct(leftKeys, leftKeysLength, leftValues, leftValuesLength, left, leftLength);
            }
            else if (remapRight == null && outKeys == rightKeys)
            {
                // "that" knows all the TxnId and keys already, but "this" does not
```

### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
                discard(keys, txnIds, out);
            }
            else if (buf != out)
            {
                // the output is not equal to a prior input
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
            else
            {
                Invariants.checkState(keys == bufKeys && keysLength == bufKeysLength);
                Invariants.checkState(txnIds == bufValues && txnIdsLength == bufValuesLength);
                Invariants.checkState(outLength == bufLength);
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
            {
                Invariants.checkState(keys == bufKeys && keysLength == bufKeysLength);
                Invariants.checkState(txnIds == bufValues && txnIdsLength == bufValuesLength);
                Invariants.checkState(outLength == bufLength);
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/KeyRoute.java`
#### Snippet
```java
    private AbstractUnseekableKeys<?> wrap(RoutingKey[] wrap, AbstractKeys<RoutingKey, ?> that)
    {
        return wrap == keys ? this : wrap == that.keys && that instanceof AbstractUnseekableKeys<?>
                ? (AbstractUnseekableKeys<?>) that
                : new RoutingKeys(wrap);
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/KeyRoute.java`
#### Snippet
```java
    private AbstractUnseekableKeys<?> wrap(RoutingKey[] wrap, AbstractKeys<RoutingKey, ?> that)
    {
        return wrap == keys ? this : wrap == that.keys && that instanceof AbstractUnseekableKeys<?>
                ? (AbstractUnseekableKeys<?>) that
                : new RoutingKeys(wrap);
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/AbstractRanges.java`
#### Snippet
```java
                AbstractRanges<?> that = (AbstractRanges<?>) keysOrRanges;
                Range[] result = SortedArrays.linearIntersection(input.ranges, input.ranges.length, that.ranges, that.ranges.length, Range::compareIntersecting, cachedRanges());
                return result == input.ranges ? input : constructor.apply(param, result);
            }
            case Key:
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/AbstractRanges.java`
#### Snippet
```java
                AbstractKeys<?, ?> that = (AbstractKeys<?, ?>) keysOrRanges;
                Range[] result = SortedArrays.linearIntersection(input.ranges, input.ranges.length, that.keys, that.keys.length, cachedRanges());
                return result == input.ranges ? input : constructor.apply(param, result);
            }
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/AbstractRanges.java`
#### Snippet
```java

        if (bi == bs.length)
            return constructor.construct(param1, param2, (as == left.ranges ? left : right).ranges);

        // TODO (expected, efficiency): ArrayBuffers caching
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
                                            IntBufferAllocator allocator)
    {
        if (src == trg || trgLength == srcLength)
            return null;

```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `accord-core/src/main/java/accord/local/ShardDistributor.java`
#### Snippet
```java
                    {
                        buffer.add(splitter.subRange(ranges.get(ri), rOffset, splitter.add(rOffset, required)));
                        result.add(Ranges.ofSortedAndDeoverlapped(buffer.toArray(new Range[0])));
                        buffer.clear();
                        rOffset = splitter.add(rOffset, required);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `accord-core/src/main/java/accord/primitives/Keys.java`
#### Snippet
```java
    public static Keys of(Collection<? extends Key> keys)
    {
        return of(keys.toArray(new Key[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `accord-core/src/main/java/accord/primitives/Keys.java`
#### Snippet
```java
    public Keys(SortedSet<? extends Key> keys)
    {
        super(keys.toArray(new Key[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `accord-core/src/main/java/accord/primitives/Keys.java`
#### Snippet
```java
    public static Keys of(Set<? extends Key> keys)
    {
        return ofUnique(keys.toArray(new Key[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `accord-core/src/main/java/accord/primitives/Keys.java`
#### Snippet
```java
    public static Keys ofSorted(Collection<? extends Key> keys)
    {
        return ofSorted(keys.toArray(new Key[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `accord-core/src/main/java/accord/primitives/Keys.java`
#### Snippet
```java
    public static Keys ofUnique(Collection<? extends Key> keys)
    {
        return ofUnique(keys.toArray(new Key[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `accord-core/src/main/java/accord/local/CommandStores.java`
#### Snippet
```java
        }

        return new Snapshot(result.toArray(new ShardHolder[0]), newLocalTopology, newTopology);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `accord-core/src/main/java/accord/local/CommandStores.java`
#### Snippet
```java
        this.supplier = supplier;
        this.shardDistributor = shardDistributor;
        this.current = new Snapshot(new ShardHolder[0], Topology.EMPTY, Topology.EMPTY);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `accord-maelstrom/src/main/java/accord/maelstrom/Value.java`
#### Snippet
```java
    private Value()
    {
        this.contents = new Datum[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
        this.sorter = sorter;
        this.node = node;
        this.epochs = new Epochs(new EpochState[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `accord-maelstrom/src/main/java/accord/maelstrom/MaelstromReply.java`
#### Snippet
```java

        Keys keys = new Keys(reads.navigableKeySet());
        Value[] values = reads.values().toArray(new Value[0]);

        return new MaelstromResult(client, requestId, keys, values, update);
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `pending` initializer `0` is redundant
in `accord-core/src/main/java/accord/api/Read.java`
#### Snippet
```java
        public final Keys keyScope;
        private Data result = null;
        private int pending = 0;

        public ReadFuture(Keys keyScope, List<Future<Data>> futures)
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Value `newKeyToValue` is always 'null'
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
        catch (Throwable t)
        {
            cache.forceDiscard(newKeyToValue);
            throw t;
        }
```

### ConstantValue
Value `acc` is always 'false'
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
            Boolean result = global().foldl(intersect, (shard, acc, i) -> {
                if (acc == Boolean.FALSE)
                    return acc;
                return syncTracker.get(i).hasReachedQuorum();
            }, Boolean.TRUE);
```

## RuleId[ruleID=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `fromValues()` tries to override a static method of a superclass
in `accord-core/src/main/java/accord/primitives/TxnId.java`
#### Snippet
```java
    }

    public static TxnId fromValues(long epoch, long hlc, int flags, Id node)
    {
        return new TxnId(epoch, hlc, flags, node);
```

### MethodOverridesStaticMethod
Method `fromValues()` tries to override a static method of a superclass
in `accord-core/src/main/java/accord/primitives/TxnId.java`
#### Snippet
```java
    }

    public static TxnId fromValues(long epoch, long hlc, Id node)
    {
        return new TxnId(epoch, hlc, 0, node);
```

### MethodOverridesStaticMethod
Method `fromBits()` tries to override a static method of a superclass
in `accord-core/src/main/java/accord/primitives/TxnId.java`
#### Snippet
```java
public class TxnId extends Timestamp
{
    public static TxnId fromBits(long msb, long lsb, Id node)
    {
        return new TxnId(msb, lsb, node);
```

### MethodOverridesStaticMethod
Method `fromValues()` tries to override a static method of a superclass
in `accord-core/src/main/java/accord/primitives/Ballot.java`
#### Snippet
```java
    }

    public static Ballot fromValues(long epoch, long hlc, int flags, Id node)
    {
        return new Ballot(epoch, hlc, flags, node);
```

### MethodOverridesStaticMethod
Method `fromValues()` tries to override a static method of a superclass
in `accord-core/src/main/java/accord/primitives/Ballot.java`
#### Snippet
```java
    }

    public static Ballot fromValues(long epoch, long hlc, Id node)
    {
        return fromValues(epoch, hlc, 0, node);
```

### MethodOverridesStaticMethod
Method `fromBits()` tries to override a static method of a superclass
in `accord-core/src/main/java/accord/primitives/Ballot.java`
#### Snippet
```java
public class Ballot extends Timestamp
{
    public static Ballot fromBits(long msb, long lsb, Id node)
    {
        return new Ballot(msb, lsb, node);
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `SerializationSupport` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/messages/BeginRecovery.java`
#### Snippet
```java
public class BeginRecovery extends TxnRequest<BeginRecovery.RecoverReply>
{
    public static class SerializationSupport
    {
        public static BeginRecovery create(TxnId txnId, PartialRoute<?> scope, long waitForEpoch, PartialTxn partialTxn, Ballot ballot, @Nullable FullRoute<?> route)
```

### UtilityClassWithoutPrivateConstructor
Class `SerializerSupport` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/messages/Accept.java`
#### Snippet
```java
public class Accept extends TxnRequest.WithUnsynced<Accept.AcceptReply>
{
    public static class SerializerSupport
    {
        public static Accept create(TxnId txnId, PartialRoute<?> scope, long waitForEpoch, long minEpoch, boolean doNotComputeProgressKey, Ballot ballot, Timestamp executeAt, Seekables<?, ?> keys, PartialDeps partialDeps)
```

### UtilityClassWithoutPrivateConstructor
Class `SerializationSupport` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/primitives/PartialRangeRoute.java`
#### Snippet
```java
public class PartialRangeRoute extends RangeRoute implements PartialRoute<Range>
{
    public static class SerializationSupport
    {
        public static PartialRangeRoute create(Ranges covering, RoutingKey homeKey, Range[] ranges)
```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/utils/Utils.java`
#### Snippet
```java

// TODO (low priority): remove when jdk8 support is dropped
public class Utils
{
    // reimplements Collection#toArray
```

### UtilityClassWithoutPrivateConstructor
Class `SerializationSupport` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/primitives/Keys.java`
#### Snippet
```java
public class Keys extends AbstractKeys<Key, Keys> implements Seekables<Key, Keys>
{
    public static class SerializationSupport
    {
        public static Keys create(Key[] keys)
```

### UtilityClassWithoutPrivateConstructor
Class `SerializationSupport` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/primitives/FullRangeRoute.java`
#### Snippet
```java
public class FullRangeRoute extends RangeRoute implements FullRoute<Range>
{
    public static class SerializationSupport
    {
        public static FullRangeRoute create(RoutingKey homeKey, Range[] ranges)
```

### UtilityClassWithoutPrivateConstructor
Class `SerializationSupport` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/messages/Apply.java`
#### Snippet
```java
public class Apply extends TxnRequest<ApplyReply>
{
    public static class SerializationSupport
    {
        public static Apply create(TxnId txnId, PartialRoute<?> scope, long waitForEpoch, long untilEpoch, Timestamp executeAt, PartialDeps deps, Writes writes, Result result)
```

### UtilityClassWithoutPrivateConstructor
Class `SerializerSupport` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(ReadData.class);

    public static class SerializerSupport
    {
        public static ReadData create(TxnId txnId, Seekables<?, ?> scope, long executeAtEpoch, long waitForEpoch)
```

### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `accord-maelstrom/src/main/java/accord/maelstrom/Main.java`
#### Snippet
```java
import accord.messages.Request;

public class Main
{
    static class CallbackInfo
```

### UtilityClassWithoutPrivateConstructor
Class `Invariants` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/utils/Invariants.java`
#### Snippet
```java
import java.util.function.Predicate;

public class Invariants
{
    private static final boolean PARANOID = true;
```

### UtilityClassWithoutPrivateConstructor
Class `SerializationSupport` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/primitives/FullKeyRoute.java`
#### Snippet
```java
public class FullKeyRoute extends KeyRoute implements FullRoute<RoutingKey>
{
    public static class SerializationSupport
    {
        public static FullKeyRoute create(RoutingKey homeKey, RoutingKey[] keys)
```

### UtilityClassWithoutPrivateConstructor
Class `SerializationSupport` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/primitives/RoutingKeys.java`
#### Snippet
```java
public class RoutingKeys extends AbstractUnseekableKeys<AbstractUnseekableKeys<?>> implements Unseekables<RoutingKey, AbstractUnseekableKeys<?>>
{
    public static class SerializationSupport
    {
        public static RoutingKeys create(RoutingKey[] keys)
```

### UtilityClassWithoutPrivateConstructor
Class `SerializationSupport` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/primitives/PartialKeyRoute.java`
#### Snippet
```java
public class PartialKeyRoute extends KeyRoute implements PartialRoute<RoutingKey>
{
    public static class SerializationSupport
    {
        public static PartialKeyRoute create(Ranges covering, RoutingKey homeKey, RoutingKey[] keys)
```

### UtilityClassWithoutPrivateConstructor
Class `RelationMultiMap` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
 * }
 */
public class RelationMultiMap
{
    private static final boolean DEBUG_CHECKS = true;
```

### UtilityClassWithoutPrivateConstructor
Class `Functions` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/utils/Functions.java`
#### Snippet
```java
import java.util.function.Function;

public class Functions
{

```

### UtilityClassWithoutPrivateConstructor
Class `InMemoryCommandStore` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
import static accord.primitives.Routables.Slice.Minimal;

public class InMemoryCommandStore
{
    public static abstract class State implements SafeCommandStore
```

### UtilityClassWithoutPrivateConstructor
Class `SerializerSupport` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/messages/Commit.java`
#### Snippet
```java
public class Commit extends TxnRequest<ReadNack>
{
    public static class SerializerSupport
    {
        public static Commit create(TxnId txnId, PartialRoute<?> scope, long waitForEpoch, Timestamp executeAt, @Nullable PartialTxn partialTxn, PartialDeps partialDeps, @Nullable FullRoute<?> fullRoute, @Nullable ReadData read)
```

### UtilityClassWithoutPrivateConstructor
Class `SerializerSupport` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/messages/Commit.java`
#### Snippet
```java
    public static class Invalidate implements Request, PreLoadContext
    {
        public static class SerializerSupport
        {
            public static Invalidate create(TxnId txnId, Unseekables<?, ?> scope, long waitForEpoch, long invalidateUntilEpoch)
```

### UtilityClassWithoutPrivateConstructor
Class `SerializationSupport` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/messages/InformDurable.java`
#### Snippet
```java
public class InformDurable extends TxnRequest<Reply> implements PreLoadContext
{
    public static class SerializationSupport
    {
        public static InformDurable create(TxnId txnId, PartialRoute<?> scope, long waitForEpoch, Timestamp executeAt, Durability durability)
```

### UtilityClassWithoutPrivateConstructor
Class `SerializerSupport` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/messages/WaitOnCommit.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(WaitOnCommit.class);

    public static class SerializerSupport
    {
        public static WaitOnCommit create(TxnId txnId, Unseekables<?, ?> scope)
```

### UtilityClassWithoutPrivateConstructor
Class `SerializationSupport` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/messages/GetDeps.java`
#### Snippet
```java
public class GetDeps extends TxnRequest.WithUnsynced<PartialDeps>
{
    public static final class SerializationSupport
    {
        public static GetDeps create(TxnId txnId, PartialRoute<?> scope, long waitForEpoch, long minEpoch, boolean doNotComputeProgressKey, Seekables<?, ?> keys, Timestamp executeAt, Txn.Kind kind)
```

### UtilityClassWithoutPrivateConstructor
Class `SerializationSupport` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/messages/CheckStatus.java`
#### Snippet
```java
        implements Request, PreLoadContext, MapReduceConsume<SafeCommandStore, CheckStatus.CheckStatusOk>
{
    public static class SerializationSupport
    {
        public static CheckStatusOk createOk(SaveStatus status, Ballot promised, Ballot accepted, @Nullable Timestamp executeAt,
```

### UtilityClassWithoutPrivateConstructor
Class `ArrayBuffers` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/utils/ArrayBuffers.java`
#### Snippet
```java
 * the size of the input we have returned via {@link ObjectBuffers#completeWithExisting(Object[], int)}}
 */
public class ArrayBuffers
{
    private static final boolean FULLY_UNCACHED = true;
```

### UtilityClassWithoutPrivateConstructor
Class `SerializerSupport` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/messages/PreAccept.java`
#### Snippet
```java
public class PreAccept extends WithUnsynced<PreAccept.PreAcceptReply>
{
    public static class SerializerSupport
    {
        public static PreAccept create(TxnId txnId, PartialRoute<?> scope, long waitForEpoch, long minEpoch, boolean doNotComputeProgressKey, long maxEpoch, PartialTxn partialTxn, @Nullable FullRoute<?> fullRoute)
```

### UtilityClassWithoutPrivateConstructor
Class `Json` has only 'static' members, and lacks a 'private' constructor
in `accord-maelstrom/src/main/java/accord/maelstrom/Json.java`
#### Snippet
```java
import accord.messages.ReadData.ReadOk;

public class Json
{
    public static final Gson GSON;
```

### UtilityClassWithoutPrivateConstructor
Class `FetchData` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/coordinate/FetchData.java`
#### Snippet
```java
 * TODO (desired, efficiency): accept lower bound epoch to avoid fetching data we should already have
 */
public class FetchData
{
    public static Object fetch(Known fetch, Node node, TxnId txnId, Unseekables<?, ?> someUnseekables, long untilLocalEpoch, BiConsumer<Known, Throwable> callback)
```

### UtilityClassWithoutPrivateConstructor
Class `Helper` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
    }

    class Helper
    {
        interface SetIntersections<L extends Routables<?, ?>, R extends Routables<?, ?>>
```

### UtilityClassWithoutPrivateConstructor
Class `SortedArrays` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
//           - compile dedicated binarySearch and exponentialSearch functions for FLOOR, CEIL, HIGHER, LOWER
//        - Exploit exponentialSearch in union/intersection/etc
public class SortedArrays
{
    /**
```

## RuleId[ruleID=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `accord-core/src/main/java/accord/utils/Utils.java`
#### Snippet
```java
    {
        List<T> dst = new ArrayList<>(src.length);
        for (int i=0; i<src.length; i++)
            dst.add(src[i]);
        return dst;
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `merge` may produce `NullPointerException`
in `accord-core/src/main/java/accord/primitives/PartialTxn.java`
#### Snippet
```java
            Read read = this.read().merge(add.read());
            Query query = this.query() == null ? add.query() : this.query();
            Update update = this.update() == null ? null : this.update().merge(add.update());
            if (keys == this.keys())
            {
```

### DataFlowIssue
Method invocation `slice` may produce `NullPointerException`
in `accord-core/src/main/java/accord/primitives/Txn.java`
#### Snippet
```java
                    ranges, kind(), keys().slice(ranges),
                    read().slice(ranges), includeQuery ? query() : null,
                    update() == null ? null : update().slice(ranges)
            );
        }
```

### DataFlowIssue
Method invocation `compute` may produce `NullPointerException`
in `accord-core/src/main/java/accord/primitives/Txn.java`
#### Snippet
```java
    default Result result(TxnId txnId, @Nullable Data data)
    {
        return query().compute(txnId, data, read(), update());
    }

```

### DataFlowIssue
Method invocation `with` may produce `NullPointerException`
in `accord-core/src/main/java/accord/messages/Accept.java`
#### Snippet
```java
            return ok1.outcome().compareTo(ok2.outcome()) >= 0 ? ok1 : ok2;

        PartialDeps deps = ok1.deps.with(ok2.deps);
        if (deps == ok1.deps) return ok1;
        if (deps == ok2.deps) return ok2;
```

### DataFlowIssue
Argument `ok2.deps` might be null
in `accord-core/src/main/java/accord/messages/Accept.java`
#### Snippet
```java
            return ok1.outcome().compareTo(ok2.outcome()) >= 0 ? ok1 : ok2;

        PartialDeps deps = ok1.deps.with(ok2.deps);
        if (deps == ok1.deps) return ok1;
        if (deps == ok2.deps) return ok2;
```

### DataFlowIssue
Method invocation `containsKey` may produce `NullPointerException`
in `accord-maelstrom/src/main/java/accord/maelstrom/MaelstromRequest.java`
#### Snippet
```java
                out.endArray();
            }
            if (update.containsKey(key))
            {
                out.beginArray();
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `accord-core/src/main/java/accord/impl/InMemoryCommand.java`
#### Snippet
```java
                && accepted.equals(command.accepted)
                && Objects.equals(executeAt, command.executeAt)
                && partialDeps.equals(command.partialDeps)
                && Objects.equals(writes, command.writes)
                && Objects.equals(result, command.result)
```

### DataFlowIssue
Argument `command.partialDeps` might be null
in `accord-core/src/main/java/accord/impl/InMemoryCommand.java`
#### Snippet
```java
                && accepted.equals(command.accepted)
                && Objects.equals(executeAt, command.executeAt)
                && partialDeps.equals(command.partialDeps)
                && Objects.equals(writes, command.writes)
                && Objects.equals(result, command.result)
```

### DataFlowIssue
Method invocation `slice` may produce `NullPointerException`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
            case Set:
            case TrySet:
                setPartialTxn(partialTxn = partialTxn.slice(allRanges, shard.isHome()));
                // TODO (expected, efficiency): we may register the same ranges more than once
                // TODO (desirable, efficiency): no need to register on PreAccept if already Accepted
```

### DataFlowIssue
Method invocation `slice` may produce `NullPointerException`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
            case Set:
            case TrySet:
                setPartialDeps(partialDeps.slice(allRanges));
                break;
        }
```

### DataFlowIssue
Method invocation `epoch` may produce `NullPointerException`
in `accord-core/src/main/java/accord/coordinate/CheckOn.java`
#### Snippet
```java
                case Applied:
                case PreApplied:
                    if (untilLocalEpoch >= full.executeAt.epoch())
                    {
                        confirm(command.commit(safeStore, maxRoute, progressKey, partialTxn, full.executeAt, partialDeps));
```

### DataFlowIssue
Dereference of `type` may produce `NullPointerException`
in `accord-maelstrom/src/main/java/accord/maelstrom/Body.java`
#### Snippet
```java
                    break;
                case "body":
                    body = Json.GSON.fromJson(in, type.type);
                    break;
                case "txn":
```

### DataFlowIssue
Dereference of `type` may produce `NullPointerException`
in `accord-maelstrom/src/main/java/accord/maelstrom/Body.java`
#### Snippet
```java
        }

        switch (type)
        {
            case init: return new MaelstromInit(msg_id, node_id, toArray(node_ids, Id[]::new));
```

### DataFlowIssue
Argument `node_ids` might be null
in `accord-maelstrom/src/main/java/accord/maelstrom/Body.java`
#### Snippet
```java
        switch (type)
        {
            case init: return new MaelstromInit(msg_id, node_id, toArray(node_ids, Id[]::new));
            case init_ok: return new Body(Type.init_ok, msg_id, in_reply_to);
            case txn: return new MaelstromRequest(msg_id, txn);
```

### DataFlowIssue
Dereference of `snapshot.get(minEpoch)` may produce `NullPointerException`
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java

        if (minEpoch == maxEpoch)
            return new Single(sorter, snapshot.get(minEpoch).global.forSelection(keys));

        Set<Id> nodes = new LinkedHashSet<>();
```

### DataFlowIssue
Method invocation `global` may produce `NullPointerException`
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
        int count = (int)(1 + maxEpoch - minEpoch);
        for (int i = count - 1 ; i >= 0 ; --i)
            snapshot.get(minEpoch + i).global().visitNodeForKeysOnceOrMore(keys, nodes::add);

        Topologies.Multi topologies = new Topologies.Multi(sorter, count);
```

### DataFlowIssue
Dereference of `snapshot.get(minEpoch + i)` may produce `NullPointerException`
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
        Topologies.Multi topologies = new Topologies.Multi(sorter, count);
        for (int i = count - 1 ; i >= 0 ; --i)
            topologies.add(snapshot.get(minEpoch + i).global.forSelection(keys, nodes));

        return topologies;
```

### DataFlowIssue
Method invocation `recordSyncComplete` may produce `NullPointerException`
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
            {
                EpochState state = get(epoch);
                state.recordSyncComplete(node);
                for (epoch++ ; state.syncComplete() && epoch <= currentEpoch; epoch++)
                {
```

### DataFlowIssue
Method invocation `markPrevSynced` may produce `NullPointerException`
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
                {
                    state = get(epoch);
                    state.markPrevSynced();
                }
            }
```

### DataFlowIssue
Method invocation `local` may produce `NullPointerException`
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
    public Ranges localRangesForEpoch(long epoch)
    {
        return epochs.get(epoch).local().rangesForNode(node);
    }

```

### DataFlowIssue
Method invocation `local` may produce `NullPointerException`
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
    public Topology localForEpoch(long epoch)
    {
        return epochs.get(epoch).local();
    }

```

### DataFlowIssue
Dereference of `state` may produce `NullPointerException`
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
    {
        EpochState state = epochs.get(epoch);
        return new Single(sorter, state.global.forSelection(select));
    }

```

### DataFlowIssue
Dereference of `maxEpochState` may produce `NullPointerException`
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
        EpochState maxEpochState = snapshot.get(maxEpoch);
        if (minEpoch == maxEpoch && !snapshot.requiresHistoricalTopologiesFor(select, maxEpoch))
            return new Single(sorter, maxEpochState.global.forSelection(select));

        int start = (int)(snapshot.currentEpoch - maxEpoch);
```

### DataFlowIssue
Method invocation `global` may produce `NullPointerException`
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
    public Topology globalForEpoch(long epoch)
    {
        return epochs.get(epoch).global();
    }

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `accord-maelstrom/src/main/java/accord/maelstrom/Json.java`
#### Snippet
```java
                {
                    if (writes.get(i) != null)
                        write.put(keys.get(i), writes.get(i));
                }
            }
```

### DataFlowIssue
Dereference of `((MaelstromQuery)txn.query())` may produce `NullPointerException`
in `accord-maelstrom/src/main/java/accord/maelstrom/Json.java`
#### Snippet
```java
            out.endArray();
            out.name("client");
            out.value(((MaelstromQuery)txn.query()).client.id);
            out.name("requestId");
            out.value(((MaelstromQuery)txn.query()).requestId);
```

### DataFlowIssue
Dereference of `((MaelstromQuery)txn.query())` may produce `NullPointerException`
in `accord-maelstrom/src/main/java/accord/maelstrom/Json.java`
#### Snippet
```java
            out.value(((MaelstromQuery)txn.query()).client.id);
            out.name("requestId");
            out.value(((MaelstromQuery)txn.query()).requestId);
            out.endObject();
        }
```

### DataFlowIssue
Method invocation `entrySet` may produce `NullPointerException`
in `accord-maelstrom/src/main/java/accord/maelstrom/Json.java`
#### Snippet
```java
        {
            out.beginArray();
            for (Map.Entry<Key, Value> e : ((MaelstromData)value.data).entrySet())
            {
                out.beginArray();
```

### DataFlowIssue
Dereference of `removed` may produce `NullPointerException`
in `accord-core/src/main/java/accord/utils/SearchableRangeListBuilder.java`
#### Snippet
```java
                // if removed.next == null, this is not referenced by a link
                // if removed.next == removed, it is referenced by a link but does not modify the link on removal
                if (removed.next != null && removed.next != removed)
                {
                    // this is a member of a link's chain, which may serve one of two purposes:
```

### DataFlowIssue
Method invocation `epoch` may produce `NullPointerException`
in `accord-core/src/main/java/accord/coordinate/RecoverWithRoute.java`
#### Snippet
```java
                {
                    Deps deps = merged.committedDeps.reconstitute(route());
                    node.withEpoch(merged.executeAt.epoch(), () -> {
                        Persist.persistAndCommit(node, txnId, route(), txn, merged.executeAt, deps, merged.writes, merged.result);
                    });
```

## RuleId[ruleID=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `covers()` overloads a compatible method of a superclass, when overriding might have been intended
in `accord-core/src/main/java/accord/primitives/PartialTxn.java`
#### Snippet
```java
        }

        public boolean covers(Ranges ranges)
        {
            return covering.containsAll(ranges);
```

### MethodOverloadsParentMethod
Method `with()` overloads a compatible method of a superclass, when overriding might have been intended
in `accord-core/src/main/java/accord/primitives/PartialDeps.java`
#### Snippet
```java
    }

    public PartialDeps with(PartialDeps that)
    {
        Invariants.checkArgument((this.rangeDeps == null) == (that.rangeDeps == null));
```

## RuleId[ruleID=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `startInclusive()` during object construction
in `accord-core/src/main/java/accord/primitives/Range.java`
#### Snippet
```java
        if (start.compareTo(end) >= 0)
            throw new IllegalArgumentException(start + " >= " + end);
        if (startInclusive() == endInclusive())
            throw new IllegalStateException("Range must have one side inclusive, and the other exclusive. Range of different types should not be mixed.");
        this.start = start;
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `endInclusive()` during object construction
in `accord-core/src/main/java/accord/primitives/Range.java`
#### Snippet
```java
        if (start.compareTo(end) >= 0)
            throw new IllegalArgumentException(start + " >= " + end);
        if (startInclusive() == endInclusive())
            throw new IllegalStateException("Range must have one side inclusive, and the other exclusive. Range of different types should not be mixed.");
        this.start = start;
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'known' in a Serializable class
in `accord-core/src/main/java/accord/local/SaveStatus.java`
#### Snippet
```java
    public final Status status;
    public final Phase phase;
    public final Known known; // TODO (easy, API/efficiency): duplicate contents here to reduce indirection for majority of cases

    SaveStatus(Status status)
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'minKnown' in a Serializable class
in `accord-core/src/main/java/accord/local/Status.java`
#### Snippet
```java

    public final Phase phase;
    public final Known minKnown;

    Status(Phase phase, Known minKnown)
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'txnId' in a Serializable class
in `accord-core/src/main/java/accord/coordinate/CoordinateFailed.java`
#### Snippet
```java
public class CoordinateFailed extends Throwable
{
    private @Nullable TxnId txnId;
    private @Nullable RoutingKey homeKey;
    public CoordinateFailed(TxnId txnId, @Nullable RoutingKey homeKey)
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'pendingReuseTail' in a Serializable class
in `accord-core/src/main/java/accord/utils/SearchableRangeListBuilder.java`
#### Snippet
```java

        // a stack of recently used EndAndIndex objects - used only for the duration of a single build
        Tenured reuse, pendingReuse, pendingReuseTail;

        int count()
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'reuse' in a Serializable class
in `accord-core/src/main/java/accord/utils/SearchableRangeListBuilder.java`
#### Snippet
```java

        // a stack of recently used EndAndIndex objects - used only for the duration of a single build
        Tenured reuse, pendingReuse, pendingReuseTail;

        int count()
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'pendingReuse' in a Serializable class
in `accord-core/src/main/java/accord/utils/SearchableRangeListBuilder.java`
#### Snippet
```java

        // a stack of recently used EndAndIndex objects - used only for the duration of a single build
        Tenured reuse, pendingReuse, pendingReuseTail;

        int count()
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
                    throw new IllegalStateException(String.format("Duplicate value (%s) found for key %s", value, key));
                }
                i++;
            }
            ++k;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `t`
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
                if (first) first = false;
                else builder.append(", ");
                builder.append(values[keysToValues[t++]]);
            }
            builder.append("]");
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `accord-core/src/main/java/accord/utils/SearchableRangeList.java`
#### Snippet
```java
                {
                    int length = ri & 0x1fffffff;
                    subStart = checkpointLists[++i];
                    subEnd = subStart + length;
                }
```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `progressKey` accessed in synchronized context
in `accord-core/src/main/java/accord/messages/Accept.java`
#### Snippet
```java
        // only accept if we actually participate in the ranges - otherwise we're just looking
        Command command = safeStore.command(txnId);
        switch (command.accept(safeStore, ballot, scope, keys, progressKey, executeAt, partialDeps))
        {
            default: throw new IllegalStateException();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `node` accessed in synchronized context
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
        if (reply != null)
        {
            node.reply(replyTo, replyContext, reply);
        }
        else if (failure != null)
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `replyTo` accessed in synchronized context
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
        if (reply != null)
        {
            node.reply(replyTo, replyContext, reply);
        }
        else if (failure != null)
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `replyContext` accessed in synchronized context
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
        if (reply != null)
        {
            node.reply(replyTo, replyContext, reply);
        }
        else if (failure != null)
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `node` accessed in synchronized context
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
        {
            // TODO (expected, testing): test
            node.reply(replyTo, replyContext, ReadNack.Error);
            data = null;
            // TODO (expected, exceptions): probably a better way to handle this, as might not be uncaught
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `replyTo` accessed in synchronized context
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
        {
            // TODO (expected, testing): test
            node.reply(replyTo, replyContext, ReadNack.Error);
            data = null;
            // TODO (expected, exceptions): probably a better way to handle this, as might not be uncaught
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `replyContext` accessed in synchronized context
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
        {
            // TODO (expected, testing): test
            node.reply(replyTo, replyContext, ReadNack.Error);
            data = null;
            // TODO (expected, exceptions): probably a better way to handle this, as might not be uncaught
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `node` accessed in synchronized context
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
            data = null;
            // TODO (expected, exceptions): probably a better way to handle this, as might not be uncaught
            node.agent().onUncaughtException(failure);
            node.commandStores().mapReduceConsume(this, waitingOn.stream(), forEach(in -> in.command(txnId).removeListener(this), node.agent()));
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `node` accessed in synchronized context
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
            // TODO (expected, exceptions): probably a better way to handle this, as might not be uncaught
            node.agent().onUncaughtException(failure);
            node.commandStores().mapReduceConsume(this, waitingOn.stream(), forEach(in -> in.command(txnId).removeListener(this), node.agent()));
        }
        else
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `node` accessed in synchronized context
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
            // TODO (expected, exceptions): probably a better way to handle this, as might not be uncaught
            node.agent().onUncaughtException(failure);
            node.commandStores().mapReduceConsume(this, waitingOn.stream(), forEach(in -> in.command(txnId).removeListener(this), node.agent()));
        }
        else
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `progressKey` accessed in synchronized context
in `accord-core/src/main/java/accord/messages/Commit.java`
#### Snippet
```java
    {
        Command command = safeStore.command(txnId);
        switch (command.commit(safeStore, route != null ? route : scope, progressKey, partialTxn, executeAt, partialDeps))
        {
            default:
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `current` accessed in synchronized context
in `accord-core/src/main/java/accord/local/CommandStores.java`
#### Snippet
```java
    public synchronized void shutdown()
    {
        for (ShardHolder shard : current.shards)
            shard.store.shutdown();
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `nextId` accessed in synchronized context
in `accord-core/src/main/java/accord/local/CommandStores.java`
#### Snippet
```java
                RangesForEpochHolder rangesHolder = new RangesForEpochHolder();
                rangesHolder.current = new RangesForEpoch(epoch, add);
                result.add(new ShardHolder(supplier.create(nextId++, rangesHolder), rangesHolder));
            }
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `current` accessed in synchronized context
in `accord-core/src/main/java/accord/local/CommandStores.java`
#### Snippet
```java
    public synchronized void updateTopology(Topology newTopology)
    {
        current = updateTopology(current, newTopology);
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `current` accessed in synchronized context
in `accord-core/src/main/java/accord/local/CommandStores.java`
#### Snippet
```java
    public synchronized void updateTopology(Topology newTopology)
    {
        current = updateTopology(current, newTopology);
    }

```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `accord-core/src/main/java/accord/messages/Commit.java`
#### Snippet
```java

    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private transient Defer defer;

    public enum Kind { Minimal, Maximal }
```

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
        {
            EpochState currentEpoch = current.epochs[0];
            if (current.epochs.length <= 1 || current.epochs[1].syncComplete())
                currentEpoch.markPrevSynced();
            pendingSync.remove(0).forEach(currentEpoch::recordSyncComplete);
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `accord-maelstrom/src/main/java/accord/maelstrom/Main.java`
#### Snippet
```java
    public static void main(String[] args) throws IOException
    {
        listen(new TopologyFactory(64, 3), System.in, System.out, System.err);
    }
}
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `accord-maelstrom/src/main/java/accord/maelstrom/Main.java`
#### Snippet
```java
    public static void main(String[] args) throws IOException
    {
        listen(new TopologyFactory(64, 3), System.in, System.out, System.err);
    }
}
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `accord.api` is unnecessary and can be removed
in `accord-maelstrom/src/main/java/accord/maelstrom/MaelstromKey.java`
#### Snippet
```java
    }

    public static class Routing extends MaelstromKey implements accord.api.RoutingKey
    {
        public Routing(Datum.Kind kind, Object hash)
```

### UnnecessaryFullyQualifiedName
Qualifier `accord.utils` is unnecessary and can be removed
in `accord-core/src/main/java/accord/utils/ArrayBuffers.java`
#### Snippet
```java
 *
 * These buffers are designed to be used to combine simple one-shot methods that consume and produce one or more arrays
 * with methods that may (or may not) call them repeatedly. Specifically, {@link accord.utils.RelationMultiMap#linearUnion},
 * {@link SortedArrays#linearUnion} and {@link SortedArrays#linearIntersection}
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `accord.api` is unnecessary and can be removed
in `accord-core/src/main/java/accord/api/ConfigurationService.java`
#### Snippet
```java
 *
 *  - ConfigurationService notifies the node of the new configuration service by calling
 *      {@link accord.api.ConfigurationService.Listener#onTopologyUpdate(accord.topology.Topology)}
 *
 *  - Once the node has setup the new topology, it will call {@link accord.api.ConfigurationService#acknowledgeEpoch(long)}
```

### UnnecessaryFullyQualifiedName
Qualifier `accord.topology` is unnecessary and can be removed
in `accord-core/src/main/java/accord/api/ConfigurationService.java`
#### Snippet
```java
 *
 *  - ConfigurationService notifies the node of the new configuration service by calling
 *      {@link accord.api.ConfigurationService.Listener#onTopologyUpdate(accord.topology.Topology)}
 *
 *  - Once the node has setup the new topology, it will call {@link accord.api.ConfigurationService#acknowledgeEpoch(long)}
```

### UnnecessaryFullyQualifiedName
Qualifier `accord.api` is unnecessary and can be removed
in `accord-core/src/main/java/accord/api/ConfigurationService.java`
#### Snippet
```java
 *      {@link accord.api.ConfigurationService.Listener#onTopologyUpdate(accord.topology.Topology)}
 *
 *  - Once the node has setup the new topology, it will call {@link accord.api.ConfigurationService#acknowledgeEpoch(long)}
 *      which indicates the node will no longer create txnIds for the previous epoch, and it's commits can now be synced
 *      with other replicas.
```

### UnnecessaryFullyQualifiedName
Qualifier `accord.api` is unnecessary and can be removed
in `accord-core/src/main/java/accord/api/ConfigurationService.java`
#### Snippet
```java
 *
 *  - ConfigurationService will notify the node when other nodes complete syncing an epoch by calling
 *      {@link accord.api.ConfigurationService.Listener#onEpochSyncComplete(accord.local.Node.Id, long)}
 *
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `accord.local` is unnecessary and can be removed
in `accord-core/src/main/java/accord/api/ConfigurationService.java`
#### Snippet
```java
 *
 *  - ConfigurationService will notify the node when other nodes complete syncing an epoch by calling
 *      {@link accord.api.ConfigurationService.Listener#onEpochSyncComplete(accord.local.Node.Id, long)}
 *
 */
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `accord-core/src/main/java/accord/impl/SimpleProgressLog.java`
#### Snippet
```java
            catch (Throwable t)
            {
                t.printStackTrace();
            }
            finally
```

## RuleId[ruleID=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
'compareTo()' parameter `ignore` is not used
in `accord-core/src/main/java/accord/primitives/RoutableKey.java`
#### Snippet
```java

        @Override
        public int compareTo(@Nonnull RoutableKey ignore)
        {
            return compareTo;
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `CommandStore()` of an abstract class should not be declared 'public'
in `accord-core/src/main/java/accord/local/CommandStore.java`
#### Snippet
```java
    private final int id; // unique id

    public CommandStore(int id)
    {
        this.id = id;
```

### NonProtectedConstructorInAbstractClass
Constructor `SyncCommandStore()` of an abstract class should not be declared 'public'
in `accord-core/src/main/java/accord/local/SyncCommandStores.java`
#### Snippet
```java
    public static abstract class SyncCommandStore extends CommandStore
    {
        public SyncCommandStore(int id)
        {
            super(id);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractBuilder()` of an abstract class should not be declared 'public'
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
        boolean hasOrderedValues = true;

        public AbstractBuilder(Adapter<K, V> adapter)
        {
            this.adapter = adapter;
```

### NonProtectedConstructorInAbstractClass
Constructor `State()` of an abstract class should not be declared 'public'
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
        }

        public State(NodeTimeService time, Agent agent, DataStore store, ProgressLog progressLog, RangesForEpochHolder rangesForEpoch, CommandStore commandStore)
        {
            this.time = time;
```

### NonProtectedConstructorInAbstractClass
Constructor `CommandStores()` of an abstract class should not be declared 'public'
in `accord-core/src/main/java/accord/local/CommandStores.java`
#### Snippet
```java
    }

    public CommandStores(NodeTimeService time, Agent agent, DataStore store, ShardDistributor shardDistributor,
                         ProgressLog.Factory progressLogFactory, CommandStore.Factory shardFactory)
    {
```

### NonProtectedConstructorInAbstractClass
Constructor `ShardTracker()` of an abstract class should not be declared 'public'
in `accord-core/src/main/java/accord/coordinate/tracking/ShardTracker.java`
#### Snippet
```java
    public final Shard shard;

    public ShardTracker(Shard shard)
    {
        this.shard = shard;
```

### NonProtectedConstructorInAbstractClass
Constructor `TxnRequest()` of an abstract class should not be declared 'public'
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java
    protected transient ReplyContext replyContext;

    public TxnRequest(Node.Id to, Topologies topologies, Route<?> route, TxnId txnId)
    {
        this(to, topologies, route, txnId, latestRelevantEpochIndex(to, topologies, route));
```

### NonProtectedConstructorInAbstractClass
Constructor `TxnRequest()` of an abstract class should not be declared 'public'
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java
    }

    public TxnRequest(Node.Id to, Topologies topologies, Route<?> route, TxnId txnId, int startIndex)
    {
        this(txnId, computeScope(to, topologies, route, startIndex), computeWaitForEpoch(to, topologies, startIndex));
```

### NonProtectedConstructorInAbstractClass
Constructor `TxnRequest()` of an abstract class should not be declared 'public'
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java
    }

    public TxnRequest(TxnId txnId, PartialRoute<?> scope, long waitForEpoch)
    {
        Invariants.checkState(!scope.isEmpty());
```

### NonProtectedConstructorInAbstractClass
Constructor `WithUnsynced()` of an abstract class should not be declared 'public'
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java
        public final boolean doNotComputeProgressKey;

        public WithUnsynced(Id to, Topologies topologies, TxnId txnId, FullRoute<?> route)
        {
            this(to, topologies, txnId, route, latestRelevantEpochIndex(to, topologies, route));
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `known`
in `accord-core/src/main/java/accord/local/SaveStatus.java`
#### Snippet
```java
                // however, we still clear the deps, as any deps we might have previously seen proposed are now expired
                // TODO (expected, consider): consider clearing Command.partialDeps in this case also
                known = known.with(DepsUnknown);
            case Accepted:
                if (!known.executeAt.hasDecidedExecuteAt())
```

### AssignmentToMethodParameter
Assignment to method parameter `reply`
in `accord-core/src/main/java/accord/messages/InformOfTxnId.java`
#### Snippet
```java
    {
        if (reply == null)
            reply = Nack;

        super.accept(reply, failure);
```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `accord-maelstrom/src/main/java/accord/maelstrom/Datum.java`
#### Snippet
```java
        {
            if (v == 0) return ' ';
            v -= 1;
            if (v < 10) return (char) ('0' + v);
            v -= 10;
```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `accord-maelstrom/src/main/java/accord/maelstrom/Datum.java`
#### Snippet
```java
            v -= 1;
            if (v < 10) return (char) ('0' + v);
            v -= 10;
            if (v < 26) return (char) ('A' + v);
            v -= 26;
```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `accord-maelstrom/src/main/java/accord/maelstrom/Datum.java`
#### Snippet
```java
            v -= 10;
            if (v < 26) return (char) ('A' + v);
            v -= 26;
            return (char) ('a' + v);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `accord-maelstrom/src/main/java/accord/maelstrom/Datum.java`
#### Snippet
```java
        {
            if (v == 0) return "";
            --v;
            char[] buf = new char[4];
            for (int i = 3 ; i >= 0 ; --i)
```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `accord-maelstrom/src/main/java/accord/maelstrom/Datum.java`
#### Snippet
```java
            {
                buf[i] = toChar(v % CHARS);
                v /= CHARS;
            }
            return new String(buf);
```

### AssignmentToMethodParameter
Assignment to method parameter `keys`
in `accord-core/src/main/java/accord/primitives/Keys.java`
#### Snippet
```java
        }
        if (removed > 0)
            keys = Arrays.copyOf(keys, keys.length - removed);
        return new Keys(keys);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `partialTxn`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
                if (partialTxn() != null)
                {
                    partialTxn = partialTxn.slice(allRanges, shard.isHome());
                    Routables.foldlMissing((Seekables)partialTxn.keys(), partialTxn().keys(), (keyOrRange, p, v, i) -> {
                        // TODO (expected, efficiency): we may register the same ranges more than once
```

### AssignmentToMethodParameter
Assignment to method parameter `partialTxn`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
            case Set:
            case TrySet:
                setPartialTxn(partialTxn = partialTxn.slice(allRanges, shard.isHome()));
                // TODO (expected, efficiency): we may register the same ranges more than once
                // TODO (desirable, efficiency): no need to register on PreAccept if already Accepted
```

### AssignmentToMethodParameter
Assignment to method parameter `accumulator`
in `accord-core/src/main/java/accord/topology/Topology.java`
#### Snippet
```java
            bi = (int)(abi >>> 32);

            accumulator = function.apply(shards[bi], accumulator, bi);
            ++bi;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `initialValue`
in `accord-core/src/main/java/accord/topology/Topology.java`
#### Snippet
```java
            {
                O next = function.apply(p1, p2, p3, offset + ai);
                initialValue = reduce.apply(initialValue, next);
                ++ai; ++bi;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `initialValue`
in `accord-core/src/main/java/accord/topology/Topology.java`
#### Snippet
```java
            if (a[ai] == b[bi])
            {
                initialValue = consumer.apply(param, initialValue, offset + ai);
                if (terminalValue == initialValue)
                    return terminalValue;
```

### AssignmentToMethodParameter
Assignment to method parameter `someKeys`
in `accord-core/src/main/java/accord/impl/SimpleProgressLog.java`
#### Snippet
```java
                    setProgress(Investigating);
                    RoutingKey someKey = Route.isRoute(someKeys) ? (Route.castToRoute(someKeys)).homeKey() : someKeys.get(0).someIntersectingRoutingKey(null);
                    someKeys = someKeys.with(someKey);
                    debugInvestigating = Invalidate.invalidate(node, txnId, someKeys, (success, fail) -> {
                        commandStore.execute(PreLoadContext.empty(), ignore -> {
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `accord-core/src/main/java/accord/utils/Functions.java`
#### Snippet
```java
        {
            if (b != null)
                a = merge.apply(a, b);
        }
        return a;
```

### AssignmentToMethodParameter
Assignment to method parameter `accumulate`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
                        if (!slice.contains(key)) continue;
                        CommandsForKey forKey = commandsForKey(key);
                        accumulate = map.apply(forKey, accumulate);
                        if (accumulate.equals(terminalValue))
                            return accumulate;
```

### AssignmentToMethodParameter
Assignment to method parameter `accumulate`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
                        for (CommandsForKey forKey : commandsForKey.subMap(range.start(), range.startInclusive(), range.end(), range.endInclusive()).values())
                        {
                            accumulate = map.apply(forKey, accumulate);
                            if (accumulate.equals(terminalValue))
                                return accumulate;
```

### AssignmentToMethodParameter
Assignment to method parameter `accumulate`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
        public <T> T mapReduce(Seekables<?, ?> keysOrRanges, Ranges slice, TestKind testKind, TestTimestamp testTimestamp, Timestamp timestamp, TestDep testDep, @Nullable TxnId depId, @Nullable Status minStatus, @Nullable Status maxStatus, CommandFunction<T, T> map, T accumulate, T terminalValue)
        {
            accumulate = mapReduceForKey(keysOrRanges, slice, (forKey, prev) -> {
                CommandTimeseries timeseries;
                switch (testTimestamp)
```

### AssignmentToMethodParameter
Assignment to method parameter `accumulate`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
            {
                for (Command command : e.getValue())
                    accumulate = map.apply(e.getKey(), command.txnId(), command.executeAt(), accumulate);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `initialValue`
in `accord-core/src/main/java/accord/primitives/AbstractKeys.java`
#### Snippet
```java
        for (int i = 0; i < keys.length; i++)
        {
            initialValue = fold.apply(keys[i], param, initialValue, i);
            if (terminalValue == initialValue)
                return initialValue;
```

### AssignmentToMethodParameter
Assignment to method parameter `trgPos`
in `accord-core/src/main/java/accord/primitives/AbstractKeys.java`
#### Snippet
```java
        int trgStart = trgPos;
        if (trgPos == 0)
            trg[trgPos++] = src[srcPos++].toUnseekable();

        while (srcPos < srcEnd)
```

### AssignmentToMethodParameter
Assignment to method parameter `srcPos`
in `accord-core/src/main/java/accord/primitives/AbstractKeys.java`
#### Snippet
```java
        int trgStart = trgPos;
        if (trgPos == 0)
            trg[trgPos++] = src[srcPos++].toUnseekable();

        while (srcPos < srcEnd)
```

### AssignmentToMethodParameter
Assignment to method parameter `srcPos`
in `accord-core/src/main/java/accord/primitives/AbstractKeys.java`
#### Snippet
```java
        while (srcPos < srcEnd)
        {
            RoutingKey next = src[srcPos++].toUnseekable();
            if (!next.equals(trg[trgPos - 1]))
                trg[trgPos++] = next;
```

### AssignmentToMethodParameter
Assignment to method parameter `trgPos`
in `accord-core/src/main/java/accord/primitives/AbstractKeys.java`
#### Snippet
```java
            RoutingKey next = src[srcPos++].toUnseekable();
            if (!next.equals(trg[trgPos - 1]))
                trg[trgPos++] = next;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `initialValue`
in `accord-core/src/main/java/accord/impl/InMemoryCommandsForKey.java`
#### Snippet
```java
                if (maxStatus != null && maxStatus.compareTo(cmd.status()) < 0)
                    continue;
                initialValue = map.apply(key, cmd.txnId(), cmd.executeAt(), initialValue);
                if (initialValue.equals(terminalValue))
                    break;
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `accord-core/src/main/java/accord/primitives/AbstractRanges.java`
#### Snippet
```java
        }

        count -= removed;
        if (count != ranges.length)
            ranges = Arrays.copyOf(ranges, count);
```

### AssignmentToMethodParameter
Assignment to method parameter `ranges`
in `accord-core/src/main/java/accord/primitives/AbstractRanges.java`
#### Snippet
```java
        count -= removed;
        if (count != ranges.length)
            ranges = Arrays.copyOf(ranges, count);

        return constructor.apply(ranges);
```

### AssignmentToMethodParameter
Assignment to method parameter `epoch`
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
                EpochState state = get(epoch);
                state.recordSyncComplete(node);
                for (epoch++ ; state.syncComplete() && epoch <= currentEpoch; epoch++)
                {
                    state = get(epoch);
```

### AssignmentToMethodParameter
Assignment to method parameter `epoch`
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
                EpochState state = get(epoch);
                state.recordSyncComplete(node);
                for (epoch++ ; state.syncComplete() && epoch <= currentEpoch; epoch++)
                {
                    state = get(epoch);
```

### AssignmentToMethodParameter
Assignment to method parameter `maxEpoch`
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
        Epochs snapshot = epochs;

        if (maxEpoch == Long.MAX_VALUE) maxEpoch = snapshot.currentEpoch;
        else Invariants.checkState(snapshot.currentEpoch >= maxEpoch);

```

### AssignmentToMethodParameter
Assignment to method parameter `scanDistance`
in `accord-core/src/main/java/accord/utils/SearchableRangeListBuilder.java`
#### Snippet
```java
            //  algorithmically, however, so long as we are under maxScanDistance we are fine
            if (removeCount >= (extendedScanDistance - scanDistance)/2)
                scanDistance = extendedScanDistance;
        }
        return scanDistance;
```

### AssignmentToMethodParameter
Assignment to method parameter `untenureLimit`
in `accord-core/src/main/java/accord/utils/SearchableRangeListBuilder.java`
#### Snippet
```java
            Tenured next = higher(tenure);
            if (next != null)
                untenureLimit = Math.min(untenureLimit, next.lastIndex + 1);
            int untenureIndex = SortedArrays.binarySearch(ranges, untenureMinIndex, untenureLimit, tenure.end, (e, s) -> e.compareTo(s.start()), CEIL);
            if (untenureIndex < 0) untenureIndex = -1 - untenureIndex;
```

### AssignmentToMethodParameter
Assignment to method parameter `initialValue`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
                while (i < nexti)
                {
                    initialValue = fold.apply(is.get(i), param, initialValue, i);
                    if (initialValue == terminalValue)
                        break done;
```

### AssignmentToMethodParameter
Assignment to method parameter `initialValue`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java

                int nexti = valueIntersections.findLimit(is, i, ms, m);
                initialValue = fold.apply(param, initialValue, i, nexti);
                if (initialValue == terminalValue)
                    break;
```

### AssignmentToMethodParameter
Assignment to method parameter `initialValue`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
                while (i < nexti)
                {
                    initialValue = fold.apply(is.get(i), initialValue, i);
                    ++i;
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `initialValue`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
                while (i < nexti)
                {
                    initialValue = fold.apply(is.get(i).slice(mv), initialValue, i);
                    ++i;
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `initialValue`
in `accord-core/src/main/java/accord/primitives/Routables.java`
#### Snippet
```java
                while (i < nexti)
                {
                    initialValue = fold.apply(is.get(i), param, initialValue, i);
                    if (initialValue == terminalValue)
                        break done;
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `accord-core/src/main/java/accord/utils/SearchableRangeList.java`
#### Snippet
```java
                                     P1 p1, P2 p2, P3 p3, int minIndex)
    {
        if (start < minIndex) start = minIndex;

        // find the checkpoint array, so we know how far to step back
```

### AssignmentToMethodParameter
Assignment to method parameter `bi`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
        while (true)
        {
            bi = SortedArrays.exponentialSearch(bs, bi, bsLength, as[ai], cmp1, op);
            if (bi >= 0)
                break;
```

### AssignmentToMethodParameter
Assignment to method parameter `bi`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
                break;

            bi = -1 - bi;
            if (bi == bsLength)
                return -1;
```

### AssignmentToMethodParameter
Assignment to method parameter `ai`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
                return -1;

            ai = SortedArrays.exponentialSearch(as, ai, asLength, bs[bi], cmp2, op);
            if (ai >= 0)
                break;
```

### AssignmentToMethodParameter
Assignment to method parameter `ai`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
                break;

            ai = -1 - ai;
            if (ai == asLength)
                return -1;
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
            if (c < 0)
            {
                to = i;
                break;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
            if (c > 0)
            {
                from = i + 1;
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
            if (c < 0)
            {
                to = i;
                break;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
            if (c > 0)
            {
                from = i + 1;
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
                        if (step == 0)
                            return from;
                        to = i + 1; // could in theory avoid one extra comparison in this case, but would uglify things
                        break loop;

```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java

                    case FLOOR:
                        from = i;
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
            if (c < 0)
            {
                to = i;
            }
            else if (c > 0)
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
            else if (c > 0)
            {
                from = i + 1;
            }
            else
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java

                    case CEIL:
                        to = found = i;
                        break;

```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
                    case FLOOR:
                        found = i;
                        from = i + 1;
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `ai`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
                break;

            ai = (int)(abi);
            bi = (int)(abi >>> 32);

```

### AssignmentToMethodParameter
Assignment to method parameter `bi`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java

            ai = (int)(abi);
            bi = (int)(abi >>> 32);

            initialValue = fold.apply(as[ai], param, initialValue, ai, bi);
```

### AssignmentToMethodParameter
Assignment to method parameter `initialValue`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
            bi = (int)(abi >>> 32);

            initialValue = fold.apply(as[ai], param, initialValue, ai, bi);
            if (initialValue == terminalValue)
                break;
```

### AssignmentToMethodParameter
Assignment to method parameter `ai`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
                break;

            ++ai;
            ++bi;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `bi`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java

            ++ai;
            ++bi;
        }

```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/utils/IntrusiveLinkedList.java`
#### Snippet
```java
    {
        if (isEmpty())
            return null;

        IntrusiveLinkedListNode next = this.next;
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/local/SyncCommandStores.java`
#### Snippet
```java
        public O reduce(MapReduce<?, O> reduce, O result)
        {
            return result == SENTINEL ? null : result;
        }
    }
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/primitives/Route.java`
#### Snippet
```java
    {
        if (unseekables == null)
            return null;

        switch (unseekables.domain())
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/primitives/Route.java`
#### Snippet
```java
    {
        if (unseekables == null)
            return null;

        switch (unseekables.domain())
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/primitives/Route.java`
#### Snippet
```java
    {
        if (unseekables == null)
            return null;

        switch (unseekables.kind())
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/primitives/Route.java`
#### Snippet
```java
            case RoutingKeys:
            case RoutingRanges:
                return null;
            case PartialKeyRoute:
                return (PartialKeyRoute) unseekables;
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/primitives/Route.java`
#### Snippet
```java
    {
        if (unseekables == null)
            return null;

        switch (unseekables.domain())
```

### ReturnNull
Return of `null`
in `accord-maelstrom/src/main/java/accord/maelstrom/MaelstromRequest.java`
#### Snippet
```java
    {
        if (in.peek() == JsonToken.NULL)
            return null;

        NavigableSet<Key> buildReadKeys = new TreeSet<>();
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/impl/InMemoryCommand.java`
#### Snippet
```java
    {
        if (!isWaitingOnApply())
            return null;

        Map.Entry<Timestamp, TxnId> first = waitingOnApply.firstEntry();
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/impl/InMemoryCommand.java`
#### Snippet
```java
            return first.getValue();

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/impl/InMemoryCommand.java`
#### Snippet
```java
    public TxnId firstWaitingOnCommit()
    {
        return isWaitingOnCommit() ? waitingOnCommit.first() : null;
    }

```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/primitives/KeyDeps.java`
#### Snippet
```java
                forEach.accept(key, txnId);
            }
            return null;
        }, null);
    }
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java

                if (status == Committed)
                    return null;

                safeStore.progressLog().waiting(txnId, Committed.minKnown, readScope.toUnseekables());
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
                if (!isObsolete)
                    read(safeStore, command);
                return null;

            case PreApplied:
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
    private static Ranges covers(@Nullable PartialTxn txn)
    {
        return txn == null ? null : txn.covering();
    }

```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
        Route<?> route = someRoute();
        if (route == null)
            return null;

        return route.toMaximalUnseekables();
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
            return PartialRoute.empty(txnId().domain(), homeKey());

        return null;
    }

```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
        private Command get(SafeCommandStore safeStore, int i)
        {
            return i >= 0 ? safeStore.command(txnIds[i]) : null;
        }

```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
    private static Ranges covers(@Nullable PartialDeps deps)
    {
        return deps == null ? null : deps.covering;
    }

```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/messages/BeginInvalidation.java`
#### Snippet
```java
                    return ok.homeKey;
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/messages/BeginInvalidation.java`
#### Snippet
```java
                    return castToFullRoute(ok.route);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/coordinate/Coordinate.java`
#### Snippet
```java
        if (tracker.hasFastPathAccepted())
        {
            Deps deps = Deps.merge(successes, ok -> ok.witnessedAt.equals(txnId) ? ok.deps : null);
            Execute.execute(node, txnId, txn, route, txnId, deps, this);
        }
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/utils/RelationMultiMap.java`
#### Snippet
```java
                Invariants.checkState(outLength == bufLength);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/messages/Commit.java`
#### Snippet
```java
            case Success:
            case Redundant:
                return null;

            case Insufficient:
```

### ReturnNull
Return of `null`
in `accord-maelstrom/src/main/java/accord/maelstrom/MaelstromResult.java`
#### Snippet
```java
        {
            if (in.peek() == JsonToken.NULL)
                return null;

            Node.Id client = null;
```

### ReturnNull
Return of `null`
in `accord-maelstrom/src/main/java/accord/maelstrom/Value.java`
#### Snippet
```java
        {
            in.nextNull();
            return null;
        }

```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
        {
            if (epoch > currentEpoch || epoch <= currentEpoch - epochs.length)
                return null;

            return epochs[(int) (currentEpoch - epoch)];
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
        EpochState epochState = epochs.get(epoch);
        if (epochState == null)
            return null;
        return epochState.global().forKey(key);
    }
```

### ReturnNull
Return of `null`
in `accord-maelstrom/src/main/java/accord/maelstrom/Json.java`
#### Snippet
```java
        {
            if (in.peek() == JsonToken.NULL)
                return null;

            in.beginObject();
```

### ReturnNull
Return of `null`
in `accord-maelstrom/src/main/java/accord/maelstrom/Json.java`
#### Snippet
```java
        {
            if (in.peek() == JsonToken.NULL)
                return null;

            NavigableSet<Key> buildReadKeys = new TreeSet<>();
```

### ReturnNull
Return of `null`
in `accord-maelstrom/src/main/java/accord/maelstrom/Json.java`
#### Snippet
```java
            {
                in.nextNull();
                return null;
            }
            return readTimestamp(in, Timestamp::fromBits);
```

### ReturnNull
Return of `null`
in `accord-maelstrom/src/main/java/accord/maelstrom/Json.java`
#### Snippet
```java
        {
            in.nextNull();
            return null;
        }
        in.beginArray();
```

### ReturnNull
Return of `null`
in `accord-maelstrom/src/main/java/accord/maelstrom/MaelstromReply.java`
#### Snippet
```java
    {
        if (in.peek() == JsonToken.NULL)
            return null;

        NavigableMap<Key, Value> reads = new TreeMap<>();
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/primitives/Range.java`
#### Snippet
```java
    {
        if (this.compareIntersecting(that) != 0)
            return null;

        RoutingKey start = this.start.compareTo(that.start) > 0 ? this.start : that.start;
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java
        {
            if (doNotComputeProgressKey)
                return null;
            return super.progressKey(node);
        }
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
        int i = (int)route.findNextIntersection(0, topology.ranges(), 0);
        if (i < 0)
            return null;
        return route.get(i).someIntersectingRoutingKey(topology.ranges());
    }
```

## RuleId[ruleID=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `value`
in `accord-core/src/main/java/accord/primitives/KeyDeps.java`
#### Snippet
```java
                    if (next >= 64)
                        break;
                    value |= 1L << next;
                }

```

### AssignmentToLambdaParameter
Assignment to lambda parameter `current`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
            now.accumulateAndGet(atLeast, (current, proposed) -> {
                long minEpoch = topology.epoch();
                current = current.withEpochAtLeast(minEpoch);
                proposed = proposed.withEpochAtLeast(minEpoch);
                return proposed.compareTo(current) <= 0 ? current.logicalNext(id) : proposed;
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `proposed`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
                long minEpoch = topology.epoch();
                current = current.withEpochAtLeast(minEpoch);
                proposed = proposed.withEpochAtLeast(minEpoch);
                return proposed.compareTo(current) <= 0 ? current.logicalNext(id) : proposed;
            });
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `le` is redundant
in `accord-core/src/main/java/accord/primitives/KeyDeps.java`
#### Snippet
```java

            System.arraycopy(scratch, 0, scratch, maxLength - count, count);
            int li = maxLength - count, le = maxLength;
            count = 0;
            while (li < le && ri < re)
```

### UnnecessaryLocalVariable
Local variable `as` is redundant
in `accord-core/src/main/java/accord/topology/Topology.java`
#### Snippet
```java
    public <T> T foldl(Unseekables<?, ?> select, IndexedBiFunction<Shard, T, T> function, T accumulator)
    {
        Unseekables<?, ?> as = select;
        Ranges bs = ranges;
        int ai = 0, bi = 0;
```

### UnnecessaryLocalVariable
Local variable `bs` is redundant
in `accord-core/src/main/java/accord/topology/Topology.java`
#### Snippet
```java
    {
        Unseekables<?, ?> as = select;
        Ranges bs = ranges;
        int ai = 0, bi = 0;

```

### UnnecessaryLocalVariable
Local variable `as` is redundant
in `accord-core/src/main/java/accord/topology/Topology.java`
#### Snippet
```java
        try
        {
            Routables<?, ?> as = select;
            Ranges bs = subsetOfRanges;
            int ai = 0, bi = 0;
```

## RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `accord-core/src/main/java/accord/topology/Topologies.java`
#### Snippet
```java

        @Override
        public boolean equals(Object obj)
        {
            return Topologies.equals(this, obj);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `accord-core/src/main/java/accord/topology/Topologies.java`
#### Snippet
```java

        @Override
        public boolean equals(Object obj)
        {
            return Topologies.equals(this, obj);
```

## RuleId[ruleID=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `accord-core/src/main/java/accord/utils/Utils.java`
#### Snippet
```java
        List<T> dst = new ArrayList<>(src.length);
        for (int i=0; i<src.length; i++)
            dst.add(src[i]);
        return dst;
    }
```

