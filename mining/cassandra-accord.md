# cassandra-accord 
 
# Bad smells
I found 563 bad smells with 51 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 135 | false |
| UNUSED_IMPORT | 64 | false |
| AssignmentToMethodParameter | 48 | false |
| ReturnNull | 36 | false |
| DataFlowIssue | 31 | false |
| MissortedModifiers | 29 | false |
| UtilityClassWithoutPrivateConstructor | 27 | true |
| ArrayEquality | 25 | false |
| RedundantImplements | 16 | false |
| PublicFieldAccessedInSynchronizedContext | 14 | false |
| NestedAssignment | 13 | false |
| RedundantFieldInitialization | 13 | false |
| NonProtectedConstructorInAbstractClass | 10 | true |
| ZeroLengthArrayInitialization | 10 | false |
| CodeBlock2Expr | 9 | true |
| RedundantMethodOverride | 8 | false |
| UnnecessaryFullyQualifiedName | 6 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 6 | false |
| NullableProblems | 5 | false |
| ClassNameSameAsAncestorName | 5 | false |
| EnumSwitchStatementWhichMissesCases | 4 | false |
| EqualsAndHashcode | 4 | false |
| NonSerializableFieldInSerializableClass | 3 | false |
| NonShortCircuitBoolean | 3 | false |
| EmptyMethod | 3 | false |
| AssignmentToLambdaParameter | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| StaticCallOnSubclass | 2 | false |
| MethodOverloadsParentMethod | 2 | false |
| AbstractMethodCallInConstructor | 2 | false |
| AssignmentToForLoopParameter | 2 | false |
| SystemOutErr | 2 | false |
| UnnecessarySuperQualifier | 2 | false |
| EqualsWhichDoesntCheckParameterClass | 2 | false |
| ConstantValue | 2 | false |
| ManualArrayToCollectionCopy | 1 | false |
| EmptyStatementBody | 1 | false |
| CommentedOutCode | 1 | false |
| ManualArrayCopy | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| UnnecessaryReturn | 1 | true |
| RedundantSuppression | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| ComparatorMethodParameterNotUsed | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| UnusedAssignment | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (status()) { // if we haven't already registered, do so, to correctly mai...` statement on enum type 'accord.local.Status' misses cases: 'PreAccepted', 'Accepted', 'PreCommitted', ...
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
        setKind(kind);
        set(safeStore, coordinateRanges, Ranges.EMPTY, shard, route, null, Ignore, partialDeps, Set);
        switch (status())
        {
            // if we haven't already registered, do so, to correctly maintain max per-key timestamp
            case NotWitnessed:
            case AcceptedInvalidate:
                safeStore.forEach(keys, acceptRanges, forKey -> forKey.register(this));
        }
        setStatus(Accepted);

```

### EnumSwitchStatementWhichMissesCases
`switch (ensurePartialTxn) { case Add: if (partialTxn == null) ...` statement on enum type 'accord.local.Command.EnsureAction' misses cases: 'Ignore', and 'Check'
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java

        // TODO (soon): stop round-robin hashing; partition only on ranges
        switch (ensurePartialTxn)
        {
            case Add:
                if (partialTxn == null)
                    break;

                if (partialTxn() != null)
                {
                    partialTxn = partialTxn.slice(allRanges, shard.isHome());
                    Routables.foldlMissing((Seekables)partialTxn.keys(), partialTxn().keys(), (keyOrRange, p, v, i) -> {
                        // TODO: duplicate application of ranges
                        safeStore.forEach(keyOrRange, allRanges, forKey -> forKey.register(this));
                        return v;
                    }, 0, 0, 1);
                    this.setPartialTxn(partialTxn().with(partialTxn));
                    break;
                }

            case Set:
            case TrySet:
                setKind(partialTxn.kind());
                setPartialTxn(partialTxn = partialTxn.slice(allRanges, shard.isHome()));
                // TODO: duplicate application of ranges
                safeStore.forEach(partialTxn.keys(), allRanges, forKey -> {
                    // TODO: no need to register on PreAccept if already Accepted
                    forKey.register(this);
                });
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
`switch (status()) { case Committed: // TODO: maintain distinct R...` statement on enum type 'accord.local.Status' misses cases: 'NotWitnessed', 'PreAccepted', ...
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
        }

        switch (status())
        {
            case Committed:
                // TODO: maintain distinct ReadyToRead and ReadyToWrite states
                setStatus(ReadyToExecute);
                logger.trace("{}: set to ReadyToExecute", txnId());
                safeStore.progressLog().readyToExecute(this, shard);
                notifyListeners(safeStore);
                break;

            case PreApplied:
                if (executeRanges(safeStore, executeAt()).intersects(writes().keys, safeStore.commandStore()::hashIntersects))
                {
                    logger.trace("{}: applying", txnId());
                    apply(safeStore);
                }
                else
                {
                    logger.trace("{}: applying no-op", txnId());
                    setStatus(Applied);
                    notifyListeners(safeStore);
                }
        }
        return true;
    }
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
Class `SerializationSupport` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/primitives/RoutingKeys.java`
#### Snippet
```java
public class RoutingKeys extends AbstractRoutableKeys<AbstractRoutableKeys<?>> implements Unseekables<RoutingKey, AbstractRoutableKeys<?>>
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
Class `Functions` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/utils/Functions.java`
#### Snippet
```java
import java.util.function.Function;

public class Functions
{

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
Class `Invariants` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/utils/Invariants.java`
#### Snippet
```java
import java.util.function.Predicate;

public class Invariants
{
    public static <T1, T2 extends T1> T2 checkType(T1 cast)
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
Class `InMemoryCommandStore` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class InMemoryCommandStore
{
    public static abstract class State implements SafeCommandStore
```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/utils/Utils.java`
#### Snippet
```java

// TODO: remove when jdk8 support is dropped
public class Utils
{
    // reimplements Collection#toArray
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
in `accord-core/src/main/java/accord/messages/WaitOnCommit.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(WaitOnCommit.class);

    public static class SerializerSupport
    {
        public static WaitOnCommit create(TxnId txnId, Unseekables<?, ?> scope)
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
        public static Accept create(TxnId txnId, PartialRoute<?> scope, long waitForEpoch, long minEpoch, boolean doNotComputeProgressKey, Ballot ballot, Timestamp executeAt, Seekables<?, ?> keys, PartialDeps partialDeps, Txn.Kind kind)
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
Class `FetchData` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/coordinate/FetchData.java`
#### Snippet
```java
 * TODO accept lower bound epoch to avoid fetching data we should already have
 */
public class FetchData
{
    public static Object fetch(Known fetch, Node node, TxnId txnId, Unseekables<?, ?> someUnseekables, long untilLocalEpoch, BiConsumer<Known, Throwable> callback)
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
Class `SortedArrays` has only 'static' members, and lacks a 'private' constructor
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
import static accord.utils.ArrayBuffers.uncached;

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

## RuleId[ruleID=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `max()` declared in class 'accord.primitives.Timestamp' but referenced via subclass 'accord.primitives.Ballot'
in `accord-core/src/main/java/accord/messages/BeginRecovery.java`
#### Snippet
```java

        return new RecoverOk(
                txnId, ok1.status, Ballot.max(ok1.accepted, ok2.accepted), timestamp, deps,
                earlierCommittedWitness, earlierAcceptedNoWitness,
                ok1.rejectsFastPath | ok2.rejectsFastPath,
```

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
Method invocation `covers` may produce `NullPointerException`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
                    throw new IllegalArgumentException("Incomplete route (" + route + ") provided; does not cover " + additionalRanges);
            }
            else if (existingRanges != additionalRanges && !route().covers(additionalRanges))
            {
                if (!route.covers(additionalRanges))
```

### DataFlowIssue
Method invocation `covers` may produce `NullPointerException`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
            else
            {
                if (!route().covers(existingRanges))
                    throw new IllegalStateException();
            }
```

### DataFlowIssue
Method invocation `kind` may produce `NullPointerException`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
            case Set:
            case TrySet:
                setKind(partialTxn.kind());
                setPartialTxn(partialTxn = partialTxn.slice(allRanges, shard.isHome()));
                // TODO: duplicate application of ranges
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
Dereference of `full.executeAt` may produce `NullPointerException`
in `accord-core/src/main/java/accord/coordinate/CheckOn.java`
#### Snippet
```java
                case Applied:
                case PreApplied:
                    if (untilLocalEpoch >= full.executeAt.epoch)
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
Dereference of `merged.executeAt` may produce `NullPointerException`
in `accord-core/src/main/java/accord/coordinate/RecoverWithRoute.java`
#### Snippet
```java
                {
                    Deps deps = merged.committedDeps.reconstitute(route());
                    node.withEpoch(merged.executeAt.epoch, () -> {
                        Persist.persistAndCommit(node, txnId, route(), txn, merged.executeAt, deps, merged.writes, merged.result);
                    });
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

## RuleId[ruleID=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `covers()` overloads a compatible method of a superclass, when overriding might have been intended
in `accord-core/src/main/java/accord/primitives/PartialTxn.java`
#### Snippet
```java
        // TODO: override toString

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
        Deps merged = with((Deps) that);
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (7 lines)
in `accord-core/src/main/java/accord/local/CommandStores.java`
#### Snippet
```java
        Ranges added = newLocalTopology.ranges().difference(prev.local.ranges());
        Ranges subtracted = prev.local.ranges().difference(newLocalTopology.ranges());
//            for (ShardedRanges range : stores.ranges)
//            {
//                // FIXME: remove this (and the corresponding check in TopologyRandomizer) once lower bounds are implemented.
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

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'known' in a Serializable class
in `accord-core/src/main/java/accord/local/SaveStatus.java`
#### Snippet
```java
    public final Status status;
    public final Phase phase;
    public final Known known; // TODO: duplicate contents here to reduce indirection for majority of cases

    SaveStatus(Status status)
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
Non-serializable field 'minKnown' in a Serializable class
in `accord-core/src/main/java/accord/local/Status.java`
#### Snippet
```java

    public final Phase phase;
    public final Known minKnown;

    Status(Phase phase, Known minKnown)
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
            throw new IllegalStateException("KeyRange must have one side inclusive, and the other exclusive. KeyRange of different types should not be mixed.");
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
            throw new IllegalStateException("KeyRange must have one side inclusive, and the other exclusive. KeyRange of different types should not be mixed.");
        this.start = start;
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
    private static <A> void throwUnexpectedMissingKeyException(A[] leftKeys, int leftKeyIndex, int leftKeyLength, A[] rightKeys, int rightKeyIndex, int rightKeyLength, boolean isMissingLeft)
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
Non-short-circuit boolean expression `ok1.rejectsFastPath | ok2.rejectsFastPath`
in `accord-core/src/main/java/accord/messages/BeginRecovery.java`
#### Snippet
```java
                txnId, ok1.status, Ballot.max(ok1.accepted, ok2.accepted), timestamp, deps,
                earlierCommittedWitness, earlierAcceptedNoWitness,
                ok1.rejectsFastPath | ok2.rejectsFastPath,
                ok1.writes, ok1.result);
    }
```

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

## RuleId[ruleID=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
                    throw new IllegalStateException(String.format("Duplicate TxnId (%s) found for key %s", txnId, key));
                }
                i++;
            }
            ++k;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `t`
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
                if (first) first = false;
                else builder.append(", ");
                builder.append(txnIds[keyToTxnId[t++]]);
            }
            builder.append("]");
```

## RuleId[ruleID=BoundedWildcard]
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
Can generalize to `? super RoutingKey`
in `accord-core/src/main/java/accord/coordinate/FindHomeKey.java`
#### Snippet
```java
{
    final BiConsumer<RoutingKey, Throwable> callback;
    FindHomeKey(Node node, TxnId txnId, Unseekables<?, ?> unseekables, BiConsumer<RoutingKey, Throwable> callback)
    {
        super(node, txnId, unseekables, txnId.epoch, IncludeInfo.No);
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
        super(node, txnId, unseekables, txnId.epoch, IncludeInfo.No);
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
Can generalize to `? super Result`
in `accord-core/src/main/java/accord/coordinate/Execute.java`
#### Snippet
```java
    private Data data;

    private Execute(Node node, TxnId txnId, Txn txn, FullRoute<?> route, Seekables<?, ?> readScope, Timestamp executeAt, Deps deps, BiConsumer<Result, Throwable> callback)
    {
        super(node, node.topology().forEpoch(readScope.toUnseekables(), executeAt.epoch), txnId);
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `accord-core/src/main/java/accord/coordinate/Execute.java`
#### Snippet
```java
    private Data data;

    private Execute(Node node, TxnId txnId, Txn txn, FullRoute<?> route, Seekables<?, ?> readScope, Timestamp executeAt, Deps deps, BiConsumer<Result, Throwable> callback)
    {
        super(node, node.topology().forEpoch(readScope.toUnseekables(), executeAt.epoch), txnId);
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
Can generalize to `? super Ranges`
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java
    }

    private static <I, O> O computeScopeInternal(Node.Id node, Topologies topologies, I keys, int startIndex, BiFunction<I, Ranges, O> slice, BiFunction<O, O, O> merge)
    {
        Ranges last = null;
```

### BoundedWildcard
Can generalize to `? extends O`
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java
    }

    private static <I, O> O computeScopeInternal(Node.Id node, Topologies topologies, I keys, int startIndex, BiFunction<I, Ranges, O> slice, BiFunction<O, O, O> merge)
    {
        Ranges last = null;
```

### BoundedWildcard
Can generalize to `? super O`
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java
    }

    private static <I, O> O computeScopeInternal(Node.Id node, Topologies topologies, I keys, int startIndex, BiFunction<I, Ranges, O> slice, BiFunction<O, O, O> merge)
    {
        Ranges last = null;
```

### BoundedWildcard
Can generalize to `? super O`
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java
    }

    private static <I, O> O computeScopeInternal(Node.Id node, Topologies topologies, I keys, int startIndex, BiFunction<I, Ranges, O> slice, BiFunction<O, O, O> merge)
    {
        Ranges last = null;
```

### BoundedWildcard
Can generalize to `? extends O`
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java
    }

    private static <I, O> O computeScopeInternal(Node.Id node, Topologies topologies, I keys, int startIndex, BiFunction<I, Ranges, O> slice, BiFunction<O, O, O> merge)
    {
        Ranges last = null;
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `accord-core/src/main/java/accord/coordinate/CheckOn.java`
#### Snippet
```java
    }

    CheckOn(Node node, Known sufficient, TxnId txnId, Route<?> route, Unseekables<?, ?> routeWithHomeKey, long srcEpoch, long untilLocalEpoch, BiConsumer<? super CheckStatusOkFull, Throwable> callback)
    {
        // TODO (soon): restore behaviour of only collecting info if e.g. Committed or Executed
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
Can generalize to `? super CommandsForKey`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
        }

        public void forEach(Routable keyOrRange, Ranges slice, Consumer<CommandsForKey> forEach)
        {
            switch (keyOrRange.kind())
```

### BoundedWildcard
Can generalize to `? super Command`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
        }

        public void forCommittedInEpoch(Ranges ranges, long epoch, Consumer<Command> consumer)
        {
            Timestamp minTimestamp = new Timestamp(epoch, Long.MIN_VALUE, Integer.MIN_VALUE, Node.Id.NONE);
```

### BoundedWildcard
Can generalize to `? super CommandsForKey`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
        }

        public void forEach(Routables<?, ?> keysOrRanges, Ranges slice, Consumer<CommandsForKey> forEach)
        {
            switch (keysOrRanges.kindOfContents()) {
```

### BoundedWildcard
Can generalize to `? super CommandsForKey`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
        }

        public <T> T mapReduce(Routables<?, ?> keysOrRanges, Ranges slice, Function<CommandsForKey, T> map, BinaryOperator<T> reduce, T initialValue)
        {
            switch (keysOrRanges.kindOfContents()) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
            }

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
Can generalize to `? super Command`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
        }

        public void forEpochCommands(Ranges ranges, long epoch, Consumer<Command> consumer)
        {
            Timestamp minTimestamp = new Timestamp(epoch, Long.MIN_VALUE, Integer.MIN_VALUE, Node.Id.NONE);
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
Can generalize to `? super Result`
in `accord-core/src/main/java/accord/coordinate/FindRoute.java`
#### Snippet
```java

    final BiConsumer<Result, Throwable> callback;
    FindRoute(Node node, TxnId txnId, RoutingKey homeKey, BiConsumer<Result, Throwable> callback)
    {
        super(node, txnId, RoutingKeys.of(homeKey), txnId.epoch, IncludeInfo.Route);
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `accord-core/src/main/java/accord/coordinate/FindRoute.java`
#### Snippet
```java

    final BiConsumer<Result, Throwable> callback;
    FindRoute(Node node, TxnId txnId, RoutingKey homeKey, BiConsumer<Result, Throwable> callback)
    {
        super(node, txnId, RoutingKeys.of(homeKey), txnId.epoch, IncludeInfo.Route);
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
Can generalize to `? super TxnId`
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
     * @param forEach function to call on each unique {@link TxnId}
     */
    public void forEachOn(Ranges ranges, Predicate<? super Key> include, Consumer<TxnId> forEach)
    {
        // Find all keys within the ranges, but record existence within an int64 bitset.  Since the bitset is limited
```

### BoundedWildcard
Can generalize to `? super Key`
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
    }

    public void forEachOn(Ranges ranges, Predicate<Key> include, BiConsumer<Key, TxnId> forEach)
    {
        Routables.foldl(keys, ranges, (key, value, index) -> {
```

### BoundedWildcard
Can generalize to `? super Key`
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
    }

    public void forEachOn(Ranges ranges, Predicate<Key> include, BiConsumer<Key, TxnId> forEach)
    {
        Routables.foldl(keys, ranges, (key, value, index) -> {
```

### BoundedWildcard
Can generalize to `? super TxnId`
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
    }

    public void forEachOn(Ranges ranges, Predicate<Key> include, BiConsumer<Key, TxnId> forEach)
    {
        Routables.foldl(keys, ranges, (key, value, index) -> {
```

### BoundedWildcard
Can generalize to `? extends T`
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
    }

    public static <T> Deps merge(List<T> merge, Function<T, Deps> getter)
    {
        LinearMerger linearMerger = new LinearMerger();
```

### BoundedWildcard
Can generalize to `? super T`
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
    }

    public static <T> Deps merge(List<T> merge, Function<T, Deps> getter)
    {
        LinearMerger linearMerger = new LinearMerger();
```

### BoundedWildcard
Can generalize to `? extends Deps`
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
    }

    public static <T> Deps merge(List<T> merge, Function<T, Deps> getter)
    {
        LinearMerger linearMerger = new LinearMerger();
```

### BoundedWildcard
Can generalize to `? super K`
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
    T linearUnion(K[] leftKeys, int leftKeysLength, V[] leftValues, int leftValuesLength, int[] left, int leftLength,
                  K[] rightKeys, int rightKeysLength, V[] rightValues, int rightValuesLength, int[] right, int rightLength,
                  ObjectBuffers<K> keyBuffers, ObjectBuffers<V> valueBuffers, IntBuffers intBuffers, DepsConstructor<K, V, T> constructor)
    {
        K[] outKeys = null;
```

### BoundedWildcard
Can generalize to `? super V`
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
    T linearUnion(K[] leftKeys, int leftKeysLength, V[] leftValues, int leftValuesLength, int[] left, int leftLength,
                  K[] rightKeys, int rightKeysLength, V[] rightValues, int rightValuesLength, int[] right, int rightLength,
                  ObjectBuffers<K> keyBuffers, ObjectBuffers<V> valueBuffers, IntBuffers intBuffers, DepsConstructor<K, V, T> constructor)
    {
        K[] outKeys = null;
```

### BoundedWildcard
Can generalize to `? super TxnId`
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
    }

    public void forEach(Key key, Consumer<TxnId> forEach)
    {
        int keyIndex = keys.indexOf(key);
```

### BoundedWildcard
Can generalize to `? super TxnId`
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java

    // TODO: optimise for case where none removed
    public Deps without(Predicate<TxnId> remove)
    {
        if (isEmpty())
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
Can generalize to `? super Known`
in `accord-core/src/main/java/accord/coordinate/FetchData.java`
#### Snippet
```java
    }

    private static Object fetchInternal(Ranges ranges, Known target, Node node, TxnId txnId, PartialRoute<?> route, @Nullable Timestamp executeAt, long untilLocalEpoch, BiConsumer<Known, Throwable> callback)
    {
        long srcEpoch = executeAt == null || target.epoch() == Coordination ? txnId.epoch : executeAt.epoch;
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `accord-core/src/main/java/accord/coordinate/FetchData.java`
#### Snippet
```java
    }

    private static Object fetchInternal(Ranges ranges, Known target, Node node, TxnId txnId, PartialRoute<?> route, @Nullable Timestamp executeAt, long untilLocalEpoch, BiConsumer<Known, Throwable> callback)
    {
        long srcEpoch = executeAt == null || target.epoch() == Coordination ? txnId.epoch : executeAt.epoch;
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
Can generalize to `? extends RS`
in `accord-core/src/main/java/accord/primitives/AbstractRanges.java`
#### Snippet
```java
     * DOES NOT MODIFY THE RANGES.
     */
    static <RS extends AbstractRanges<?>, P> RS intersect(RS input, Unseekables<?, ?> keysOrRanges, P param, BiFunction<P, Range[], RS> constructor)
    {
        switch (keysOrRanges.kindOfContents())
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
Can generalize to `? super Command`
in `accord-core/src/main/java/accord/impl/InMemoryCommandsForKey.java`
#### Snippet
```java
        final Function<Command, T> map;

        InMemoryCommandTimeseries(Function<Command, T> map)
        {
            this.map = map;
```

### BoundedWildcard
Can generalize to `? extends T`
in `accord-core/src/main/java/accord/impl/InMemoryCommandsForKey.java`
#### Snippet
```java
        final Function<Command, T> map;

        InMemoryCommandTimeseries(Function<Command, T> map)
        {
            this.map = map;
```

### BoundedWildcard
Can generalize to `? super Command`
in `accord-core/src/main/java/accord/impl/InMemoryCommandsForKey.java`
#### Snippet
```java
    }

    public void forWitnessed(Timestamp minTs, Timestamp maxTs, Consumer<Command> consumer)
    {
        uncommitted().between(minTs, maxTs)
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

    public int matchesOn(Id on, IndexedPredicate<Shard> consumer)
    {
        // TODO: this can be done by divide-and-conquer splitting of the lists and recursion, which should be more efficient
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

    public <T> void mapReduceConsumeLocal(PreLoadContext context, RoutingKey key, long minEpoch, long maxEpoch, MapReduceConsume<SafeCommandStore, T> mapReduceConsume)
    {
        commandStores.mapReduceConsume(context, key, minEpoch, maxEpoch, mapReduceConsume);
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
Can generalize to `? super T1`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
     * in either list may be matched to multiple in the other list.
     */
    private static <T1, T2> long findNextIntersection(T1[] as, int ai, int asLength, T2[] bs, int bi, int bsLength, AsymmetricComparator<T1, T2> cmp1, AsymmetricComparator<T2, T1> cmp2, Search op)
    {
        if (ai == asLength)
```

### BoundedWildcard
Can generalize to `? super T2`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
     * in either list may be matched to multiple in the other list.
     */
    private static <T1, T2> long findNextIntersection(T1[] as, int ai, int asLength, T2[] bs, int bi, int bsLength, AsymmetricComparator<T1, T2> cmp1, AsymmetricComparator<T2, T1> cmp2, Search op)
    {
        if (ai == asLength)
```

### BoundedWildcard
Can generalize to `? super T2`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
     * in either list may be matched to multiple in the other list.
     */
    private static <T1, T2> long findNextIntersection(T1[] as, int ai, int asLength, T2[] bs, int bi, int bsLength, AsymmetricComparator<T1, T2> cmp1, AsymmetricComparator<T2, T1> cmp2, Search op)
    {
        if (ai == asLength)
```

### BoundedWildcard
Can generalize to `? super T1`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
     * in either list may be matched to multiple in the other list.
     */
    private static <T1, T2> long findNextIntersection(T1[] as, int ai, int asLength, T2[] bs, int bi, int bsLength, AsymmetricComparator<T1, T2> cmp1, AsymmetricComparator<T2, T1> cmp2, Search op)
    {
        if (ai == asLength)
```

### BoundedWildcard
Can generalize to `? super T`
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java
     * TODO: introduce exponential search optimised version
     */
    public static <T> T[] linearIntersection(T[] left, int leftLength, T[] right, int rightLength, Comparator<T> comparator, ObjectBuffers<T> buffers)
    {
        int leftIdx = 0;
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

## RuleId[ruleID=NullableProblems]
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
Overridden methods are not annotated
in `accord-core/src/main/java/accord/primitives/Txn.java`
#### Snippet
```java
    }

    @Nonnull Kind kind();
    @Nonnull Seekables<?, ?> keys();
    @Nonnull Read read();
```

## RuleId[ruleID=MissortedModifiers]
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
Missorted modifiers `static abstract`
in `accord-core/src/main/java/accord/local/SyncCommandStores.java`
#### Snippet
```java
    }

    public static abstract class SyncCommandStore extends CommandStore
    {
        public SyncCommandStore(int id, int generation, int shardIndex, int numShards)
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
Missorted modifiers `public abstract @Nullable`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
     * (would probably need to remove hashIntersects)
     */
    public abstract @Nullable Route<?> route();
    protected abstract void setRoute(Route<?> route);

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
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java
public abstract class TxnRequest<R> implements Request, PreLoadContext, MapReduceConsume<SafeCommandStore, R>
{
    public static abstract class WithUnsynced<R> extends TxnRequest<R>
    {
        public final long minEpoch; // TODO: can this just always be TxnId.epoch?
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
public class CoordinateFailed extends Throwable
{
    private @Nullable TxnId txnId;
    private @Nullable RoutingKey homeKey;
    public CoordinateFailed(TxnId txnId, @Nullable RoutingKey homeKey)
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java

    // TODO: cache this object to reduce setup/teardown and allocation
    public static abstract class AbstractOrderedBuilder<T extends Deps> implements AutoCloseable
    {
        final ObjectBuffers<TxnId> cachedTxnIds = cachedTxnIds();
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
in `accord-core/src/main/java/accord/messages/Accept.java`
#### Snippet
```java
        public final AcceptOutcome outcome;
        public final Ballot supersededBy;
        public final @Nullable PartialDeps deps;

        private AcceptReply(AcceptOutcome outcome)
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
        public final boolean isCoordinating;
        public final Durability durability; // i.e. on all shards
        public final @Nullable Route<?> route;
        public final @Nullable RoutingKey homeKey;

```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
    }

    private @Nullable RoutingKey trySelectHomeKey(TxnId txnId, Seekables<?, ?> keysOrRanges)
    {
        int i = (int)keysOrRanges.findNextIntersection(0, topology().localForEpoch(txnId.epoch).ranges(), 0);
```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
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
            // TODO (soon): test
            node.reply(replyTo, replyContext, ReadNack.Error);
            data = null;
            node.agent().onUncaughtException(failure); // TODO: probably a better way to handle this, as might not be uncaught
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `replyTo` accessed in synchronized context
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
        {
            // TODO (soon): test
            node.reply(replyTo, replyContext, ReadNack.Error);
            data = null;
            node.agent().onUncaughtException(failure); // TODO: probably a better way to handle this, as might not be uncaught
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `replyContext` accessed in synchronized context
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
        {
            // TODO (soon): test
            node.reply(replyTo, replyContext, ReadNack.Error);
            data = null;
            node.agent().onUncaughtException(failure); // TODO: probably a better way to handle this, as might not be uncaught
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `node` accessed in synchronized context
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
            node.reply(replyTo, replyContext, ReadNack.Error);
            data = null;
            node.agent().onUncaughtException(failure); // TODO: probably a better way to handle this, as might not be uncaught
            node.commandStores().mapReduceConsume(this, waitingOn.stream(), forEach(in -> in.command(txnId).removeListener(this), node.agent()));
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `node` accessed in synchronized context
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
            data = null;
            node.agent().onUncaughtException(failure); // TODO: probably a better way to handle this, as might not be uncaught
            node.commandStores().mapReduceConsume(this, waitingOn.stream(), forEach(in -> in.command(txnId).removeListener(this), node.agent()));
        }
        else
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `node` accessed in synchronized context
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
            data = null;
            node.agent().onUncaughtException(failure); // TODO: probably a better way to handle this, as might not be uncaught
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

### PublicFieldAccessedInSynchronizedContext
Non-private field `current` accessed in synchronized context
in `accord-core/src/main/java/accord/local/CommandStores.java`
#### Snippet
```java
    public synchronized void shutdown()
    {
        for (ShardedRanges group : current.ranges)
            for (CommandStore commandStore : group.shards)
                commandStore.shutdown();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `progressKey` accessed in synchronized context
in `accord-core/src/main/java/accord/messages/Accept.java`
#### Snippet
```java
    {
        Command command = safeStore.command(txnId);
        switch (command.accept(safeStore, ballot, kind, scope, keys, progressKey, executeAt, partialDeps))
        {
            default: throw new IllegalStateException();
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

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `InMemory` is the same as one of its superclass' names
in `accord-core/src/main/java/accord/primitives/PartialTxn.java`
#### Snippet
```java
    }

    class InMemory extends Txn.InMemory implements PartialTxn
    {
        public final Ranges covering;
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
Class name `Key` is the same as one of its superclass' names
in `accord-maelstrom/src/main/java/accord/maelstrom/MaelstromKey.java`
#### Snippet
```java
public class MaelstromKey implements RoutableKey
{
    public static class Key extends MaelstromKey implements accord.api.Key
    {
        public Key(Datum.Kind kind, Object value)
```

### ClassNameSameAsAncestorName
Class name `Reply` is the same as one of its superclass' names
in `accord-core/src/main/java/accord/coordinate/ReadCoordinator.java`
#### Snippet
```java
import static com.google.common.collect.Sets.newHashSetWithExpectedSize;

abstract class ReadCoordinator<Reply extends accord.messages.Reply> extends ReadTracker implements Callback<Reply>
{
    private static final boolean DEBUG = false;
```

### ClassNameSameAsAncestorName
Class name `Entry` is the same as one of its superclass' names
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
    }

    public static class Entry implements Map.Entry<Key, TxnId>
    {
        final Key key;
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
        // TODO (soon): should be empty list, as can be written without existing state
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
Method `toString()` only delegates to its super method
in `accord-core/src/main/java/accord/utils/DeterministicIdentitySet.java`
#### Snippet
```java

    @Override
    public String toString()
    {
        return super.toString();
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
Method `slice()` is identical to its super method
in `accord-core/src/main/java/accord/primitives/FullRangeRoute.java`
#### Snippet
```java

    @Override
    public PartialRangeRoute slice(Ranges ranges)
    {
        return slice(ranges, this, homeKey, PartialRangeRoute::new);
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

## RuleId[ruleID=UnnecessarySuperQualifier]
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

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
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

### UnnecessaryFullyQualifiedName
Qualifier `accord.api` is unnecessary and can be removed
in `accord-maelstrom/src/main/java/accord/maelstrom/MaelstromKey.java`
#### Snippet
```java
    }

    public static class Routing extends MaelstromKey implements accord.api.RoutingKey
    {
        public Routing(Datum.Kind kind, Object value)
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

## RuleId[ruleID=UNUSED_IMPORT]
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
Unused import `import accord.primitives.Timestamp;`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
import accord.local.SafeCommandStore;
import accord.local.SyncCommandStores;
import accord.primitives.Timestamp;
import accord.primitives.TxnId;
import accord.primitives.*;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.TxnId;`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
import accord.local.SyncCommandStores;
import accord.primitives.Timestamp;
import accord.primitives.TxnId;
import accord.primitives.*;
import org.apache.cassandra.utils.concurrent.AsyncPromise;
```

### UNUSED_IMPORT
Unused import `import accord.local.CommandStore;`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStores.java`
#### Snippet
```java
import accord.api.DataStore;
import accord.api.ProgressLog;
import accord.local.CommandStore;
import accord.local.Node;
import accord.primitives.Routables;
```

### UNUSED_IMPORT
Unused import `import accord.local.Node;`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStores.java`
#### Snippet
```java
import accord.api.ProgressLog;
import accord.local.CommandStore;
import accord.local.Node;
import accord.primitives.Routables;
import accord.utils.MapReduce;
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
import accord.primitives.Txn.Kind;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Writes;`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
import accord.primitives.*;
import accord.primitives.Txn.Kind;
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
import accord.local.CommandStores.ShardedRanges;
import accord.api.ProgressLog;
import accord.primitives.*;
import accord.api.DataStore;
```

### UNUSED_IMPORT
Unused import `import accord.api.DataStore;`
in `accord-core/src/main/java/accord/local/CommandStore.java`
#### Snippet
```java
import accord.api.ProgressLog;
import accord.primitives.*;
import accord.api.DataStore;
import org.apache.cassandra.utils.concurrent.Future;

```

### UNUSED_IMPORT
Unused import `import accord.api.RoutingKey;`
in `accord-core/src/main/java/accord/local/CommandStores.java`
#### Snippet
```java
import accord.local.CommandStore.RangesForEpoch;
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
Unused import `import accord.primitives.Ranges;`
in `accord-core/src/main/java/accord/local/Status.java`
#### Snippet
```java
import accord.messages.BeginRecovery;
import accord.primitives.Ballot;
import accord.primitives.Ranges;
import accord.primitives.Seekables;
import accord.primitives.TxnId;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Seekables;`
in `accord-core/src/main/java/accord/local/Status.java`
#### Snippet
```java
import accord.primitives.Ballot;
import accord.primitives.Ranges;
import accord.primitives.Seekables;
import accord.primitives.TxnId;
import com.google.common.base.Preconditions;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.TxnId;`
in `accord-core/src/main/java/accord/local/Status.java`
#### Snippet
```java
import accord.primitives.Ranges;
import accord.primitives.Seekables;
import accord.primitives.TxnId;
import com.google.common.base.Preconditions;

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
import accord.primitives.Txn;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.FullRoute;`
in `accord-core/src/main/java/accord/messages/Accept.java`
#### Snippet
```java
import accord.local.Command.AcceptOutcome;
import accord.primitives.PartialDeps;
import accord.primitives.FullRoute;
import accord.primitives.Txn;
import accord.primitives.Ballot;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Txn;`
in `accord-core/src/main/java/accord/messages/Accept.java`
#### Snippet
```java
import accord.primitives.PartialDeps;
import accord.primitives.FullRoute;
import accord.primitives.Txn;
import accord.primitives.Ballot;
import accord.local.Command;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Ballot;`
in `accord-core/src/main/java/accord/messages/Accept.java`
#### Snippet
```java
import accord.primitives.FullRoute;
import accord.primitives.Txn;
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
import accord.local.CommandsForKey.TxnIdWithExecuteAt;
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
Unused import `import accord.primitives.Keys;`
in `accord-core/src/main/java/accord/messages/InformOfTxnId.java`
#### Snippet
```java
import accord.api.RoutingKey;
import accord.local.*;
import accord.primitives.Keys;
import accord.primitives.Seekables;
import accord.primitives.TxnId;
```

### UNUSED_IMPORT
Unused import `import accord.primitives.Seekables;`
in `accord-core/src/main/java/accord/messages/InformOfTxnId.java`
#### Snippet
```java
import accord.local.*;
import accord.primitives.Keys;
import accord.primitives.Seekables;
import accord.primitives.TxnId;

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
Unused import `import accord.primitives.Deps;`
in `accord-core/src/main/java/accord/messages/PreAccept.java`
#### Snippet
```java
import accord.primitives.*;

import accord.primitives.Deps;
import accord.primitives.TxnId;

```

### UNUSED_IMPORT
Unused import `import accord.primitives.TxnId;`
in `accord-core/src/main/java/accord/messages/PreAccept.java`
#### Snippet
```java

import accord.primitives.Deps;
import accord.primitives.TxnId;

import static accord.local.CommandsForKey.CommandTimeseries.TestDep.ANY_DEPS;
```

### UNUSED_IMPORT
Unused import `import static accord.utils.MapReduceConsume.forEach;`
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
import static accord.messages.ReadData.ReadNack.Redundant;
import static accord.messages.TxnRequest.*;
import static accord.utils.MapReduceConsume.forEach;

// TODO (soon): dedup - can currently have infinite pending reads that will be executed independently
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
Unused import `import accord.local.CommandStore;`
in `accord-core/src/main/java/accord/primitives/Txn.java`
#### Snippet
```java

import accord.local.Command;
import accord.local.CommandStore;

import accord.api.*;
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
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
            case TrySet:
                setKind(partialTxn.kind());
                setPartialTxn(partialTxn = partialTxn.slice(allRanges, shard.isHome()));
                // TODO: duplicate application of ranges
                safeStore.forEach(partialTxn.keys(), allRanges, forKey -> {
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
in `accord-maelstrom/src/main/java/accord/maelstrom/Datum.java`
#### Snippet
```java
                        double cur = -Double.MAX_VALUE;
                        for (int i = 1 ; i < count ; ++i)
                            result[i] = new MaelstromKey.Routing(cur += delta);
                    }
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
                else if (removed > 0)
                {
                    ranges[i - removed] = prev = next.subRange(prev.end(), next.end());
                }
            }
```

### NestedAssignment
Result of assignment expression used
in `accord-core/src/main/java/accord/primitives/AbstractRanges.java`
#### Snippet
```java
            else if (removed > 0)
            {
                ranges[i - removed] = prev = next;
            }
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
in `accord-core/src/main/java/accord/utils/SortedArrays.java`
#### Snippet
```java

                    case CEIL:
                        to = found = i;
                        break;

```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `SyncCommandStore()` of an abstract class should not be declared 'public'
in `accord-core/src/main/java/accord/local/SyncCommandStores.java`
#### Snippet
```java
    public static abstract class SyncCommandStore extends CommandStore
    {
        public SyncCommandStore(int id, int generation, int shardIndex, int numShards)
        {
            super(id, generation, shardIndex, numShards);
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
Constructor `State()` of an abstract class should not be declared 'public'
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
        private final NavigableMap<RoutableKey, InMemoryCommandsForKey> commandsForKey = new TreeMap<>();

        public State(NodeTimeService time, Agent agent, DataStore store, ProgressLog progressLog, RangesForEpoch rangesForEpoch, CommandStore commandStore)
        {
            this.time = time;
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
Constructor `CommandStores()` of an abstract class should not be declared 'public'
in `accord-core/src/main/java/accord/local/CommandStores.java`
#### Snippet
```java
    }

    public CommandStores(int num, NodeTimeService time, Agent agent, DataStore store,
                         ProgressLog.Factory progressLogFactory, CommandStore.Factory shardFactory)
    {
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractOrderedBuilder()` of an abstract class should not be declared 'public'
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
        int totalCount;

        public AbstractOrderedBuilder(boolean hasOrderedTxnId)
        {
            this.keys = cachedKeys.get(16);
```

### NonProtectedConstructorInAbstractClass
Constructor `CommandStore()` of an abstract class should not be declared 'public'
in `accord-core/src/main/java/accord/local/CommandStore.java`
#### Snippet
```java
    private final int numShards;

    public CommandStore(int id,
                        int generation,
                        int shardIndex,
```

## RuleId[ruleID=CodeBlock2Expr]
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
                    if (run.shouldRun())
                    {
                        commandStore.execute(contextFor(run.txnId()), safeStore -> {
                            run.run(safeStore.command(run.txnId()));
                        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/messages/Apply.java`
#### Snippet
```java
        if (reply == ApplyReply.Applied)
        {
            node.ifLocal(empty(), scope.homeKey(), txnId.epoch, instance -> {
                node.withEpoch(executeAt.epoch, () -> instance.progressLog().durableLocal(txnId));
            }).addCallback(node.agent());
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
                    Range range = (Range) keyOrRange;
                    // TODO: zero allocation
                    Ranges.of(range).slice(slice).forEach(r -> {
                        commandsForKey.subMap(r.start(), r.startInclusive(), r.end(), r.endInclusive())
                                .values().forEach(forEach);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
                    Ranges ranges = (Ranges) keysOrRanges;
                    // TODO: zero allocation
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
                    node.withEpoch(merged.executeAt.epoch, () -> {
                        Persist.persistAndCommit(node, txnId, route(), txn, merged.executeAt, deps, merged.writes, merged.result);
                    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/coordinate/Invalidate.java`
#### Snippet
```java
        Commit.Invalidate.commitInvalidate(node, txnId, route != null ? Unseekables.merge(route, (Unseekables)invalidateWith) : invalidateWith, txnId);
        // TODO: pick a reasonable upper bound, so we don't invalidate into an epoch/commandStore that no longer cares about this command
        node.forEachLocalSince(contextFor(txnId), invalidateWith, txnId, safeStore -> {
            safeStore.command(txnId).commitInvalidate(safeStore);
        }).addCallback((s, f) -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/coordinate/Recover.java`
#### Snippet
```java
                case PreApplied:
                    // TODO: in some cases we can use the deps we already have (e.g. if we have a quorum of Committed responses)
                    node.withEpoch(executeAt.epoch, () -> {
                        CollectDeps.withDeps(node, txnId, route, txn, acceptOrCommit.executeAt, (deps, fail) -> {
                            if (fail != null)
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `accord-core/src/main/java/accord/coordinate/Recover.java`
#### Snippet
```java
                case Committed:
                    // TODO: in some cases we can use the deps we already have (e.g. if we have a quorum of Committed responses)
                    node.withEpoch(executeAt.epoch, () -> {
                        CollectDeps.withDeps(node, txnId, route, txn, executeAt, (deps, fail) -> {
                            if (fail != null) accept(null, fail);
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `isObsolete` is accessed in both synchronized and unsynchronized contexts
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
    private final long waitForEpoch;
    private Data data;
    private transient boolean isObsolete; // TODO: respond with the Executed result we have stored?
    private transient BitSet waitingOn;
    private transient int waitingOnCount;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `waitingOn` is accessed in both synchronized and unsynchronized contexts
in `accord-core/src/main/java/accord/messages/ReadData.java`
#### Snippet
```java
    private Data data;
    private transient boolean isObsolete; // TODO: respond with the Executed result we have stored?
    private transient BitSet waitingOn;
    private transient int waitingOnCount;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `tracker` is accessed in both synchronized and unsynchronized contexts
in `accord-core/src/main/java/accord/coordinate/Coordinate.java`
#### Snippet
```java
    final FullRoute<?> route;

    private FastPathTracker tracker;
    private boolean preAcceptIsDone;
    private final List<PreAcceptOk> successes;
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
in `accord-core/src/main/java/accord/utils/DeterministicIdentitySet.java`
#### Snippet
```java

    @Override
    public String toString()
    {
        return super.toString();
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
Field initialization to `false` is redundant
in `accord-core/src/main/java/accord/topology/TopologyManager.java`
#### Snippet
```java
        private final Topology local;
        private final QuorumTracker syncTracker;
        private boolean syncComplete = false;
        private boolean prevSynced;

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
Field initialization to `0` is redundant
in `accord-maelstrom/src/main/java/accord/maelstrom/Cluster.java`
#### Snippet
```java
        final Random random;

        int nextMessageId = 0;
        Map<Long, Callback> callbacks = new LinkedHashMap<>();

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
Field initialization to `null` is redundant
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
        int[] buf = null;
        int bufKeysLength, bufTxnIdsLength = 0, bufLength = 0;
        Deps from = null;

        LinearMerger()
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
        TxnId[] bufTxnIds;
        int[] buf = null;
        int bufKeysLength, bufTxnIdsLength = 0, bufLength = 0;
        Deps from = null;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
        return new Iterator<Map.Entry<Key, TxnId>>()
        {
            int i = keys.size(), k = 0;

            @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
        TxnId[] bufTxnIds;
        int[] buf = null;
        int bufKeysLength, bufTxnIdsLength = 0, bufLength = 0;
        Deps from = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
        Key[] bufKeys;
        TxnId[] bufTxnIds;
        int[] buf = null;
        int bufKeysLength, bufTxnIdsLength = 0, bufLength = 0;
        Deps from = null;
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

## RuleId[ruleID=AssignmentToMethodParameter]
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
                        // TODO: duplicate application of ranges
```

### AssignmentToMethodParameter
Assignment to method parameter `partialTxn`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
            case TrySet:
                setKind(partialTxn.kind());
                setPartialTxn(partialTxn = partialTxn.slice(allRanges, shard.isHome()));
                // TODO: duplicate application of ranges
                safeStore.forEach(partialTxn.keys(), allRanges, forKey -> {
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
Assignment to method parameter `known`
in `accord-core/src/main/java/accord/local/SaveStatus.java`
#### Snippet
```java
                // however, we still clear the deps, as any deps we might have previously seen proposed are now expired
                // TODO: consider clearing Command.partialDeps in this case also
                known = known.with(DepsUnknown);
            case Accepted:
                if (!known.executeAt.isDecisionKnown())
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
Assignment to method parameter `someKeys`
in `accord-core/src/main/java/accord/impl/SimpleProgressLog.java`
#### Snippet
```java
                    // TODO (RangeTxns): This should be a Routable, or we should guarantee it is safe to operate on any key in the range
                    RoutingKey someKey = Route.isRoute(someKeys) ? (Route.castToRoute(someKeys)).homeKey() : someKeys.get(0).someIntersectingRoutingKey();
                    someKeys = someKeys.with(someKey);
                    debugInvestigating = Invalidate.invalidate(node, txnId, someKeys, (success, fail) -> {
                        if (progress() != Investigating)
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
            if (a[ai] == b[bi])
            {
                initialValue = consumer.apply(param, initialValue, offset + ai);
                if (terminalValue == initialValue)
                    return terminalValue;
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

## RuleId[ruleID=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `accord-core/src/main/java/accord/primitives/Keys.java`
#### Snippet
```java
// TODO: this should probably be a BTree
// TODO: check that foldl call-sites are inlined and optimised by HotSpot
public class Keys extends AbstractKeys<Key, Keys> implements Seekables<Key, Keys>
{
    public static class SerializationSupport
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `accord-core/src/main/java/accord/primitives/RangeRoute.java`
#### Snippet
```java
import javax.annotation.Nonnull;

public abstract class RangeRoute extends AbstractRanges<Route<Range>> implements Route<Range>
{
    public final RoutingKey homeKey;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
 */
// TODO: switch to RoutingKey? Would mean adopting execution dependencies less precisely
public class Deps implements Iterable<Map.Entry<Key, TxnId>>
{
    private static final boolean DEBUG_CHECKS = true;
```

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

## RuleId[ruleID=RedundantImplements]
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
Redundant interface declaration `Iterable`
in `accord-core/src/main/java/accord/primitives/AbstractRoutableKeys.java`
#### Snippet
```java
import accord.api.RoutingKey;

public abstract class AbstractRoutableKeys<KS extends Unseekables<RoutingKey, ?>> extends AbstractKeys<RoutingKey, KS> implements Iterable<RoutingKey>, Unseekables<RoutingKey, KS>
{
    AbstractRoutableKeys(RoutingKey[] keys)
```

### RedundantImplements
Redundant interface declaration `Unseekables`>
in `accord-core/src/main/java/accord/primitives/RoutingKeys.java`
#### Snippet
```java
import static accord.utils.ArrayBuffers.cachedRoutingKeys;

public class RoutingKeys extends AbstractRoutableKeys<AbstractRoutableKeys<?>> implements Unseekables<RoutingKey, AbstractRoutableKeys<?>>
{
    public static class SerializationSupport
```

### RedundantImplements
Redundant interface declaration `Iterable`
in `accord-core/src/main/java/accord/primitives/Unseekables.java`
#### Snippet
```java
 * Either a Route or a simple collection of Unseekable
 */
public interface Unseekables<K extends Unseekable, U extends Unseekables<K, ?>> extends Iterable<K>, Routables<K, U>
{
    enum UnseekablesKind
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
Redundant interface declaration `SafeCommandStore`
in `accord-core/src/main/java/accord/impl/InMemoryCommandStore.java`
#### Snippet
```java
        }

        class AsyncState extends State implements SafeCommandStore
        {
            public AsyncState(NodeTimeService time, Agent agent, DataStore store, ProgressLog progressLog, RangesForEpoch rangesForEpoch, CommandStore commandStore)
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
in `accord-core/src/main/java/accord/primitives/AbstractKeys.java`
#### Snippet
```java
@SuppressWarnings("rawtypes")
// TODO: check that foldl call-sites are inlined and optimised by HotSpot
public abstract class AbstractKeys<K extends RoutableKey, KS extends Routables<K, ?>> implements Iterable<K>, Routables<K, KS>
{
    final K[] keys;
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
in `accord-core/src/main/java/accord/primitives/Route.java`
#### Snippet
```java
    {
        if (unseekables == null)
            return null;

        switch (unseekables.kindOfContents())
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/primitives/Route.java`
#### Snippet
```java
    {
        if (unseekables == null)
            return null;

        switch (unseekables.kindOfContents())
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

        switch (unseekables.kindOfContents())
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
    private static Ranges covers(@Nullable PartialDeps deps)
    {
        return deps == null ? null : deps.covering;
    }

```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java
            return new PartialKeyRoute(Ranges.EMPTY, homeKey(), new RoutingKey[0]);

        return null;
    }

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
                in.nextNull();
                return null;
            }
            return readTimestamp(in, Timestamp::new);
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
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
                Invariants.checkState(outLength == bufLength);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
        Routables.foldl(keys, ranges, (key, value, index) -> {
            if (!include.test(key))
                return null;

            for (int t = startOffset(index), end = endOffset(index); t < end ; ++t)
```

### ReturnNull
Return of `null`
in `accord-core/src/main/java/accord/primitives/Deps.java`
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
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
        int i = (int)route.findNextIntersection(0, topology.ranges(), 0);
        if (i < 0)
            return null;
        return route.get(i).someIntersectingRoutingKey();
    }
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

## RuleId[ruleID=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `value`
in `accord-core/src/main/java/accord/primitives/Deps.java`
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
                current = current.withMinEpoch(minEpoch);
                proposed = proposed.withMinEpoch(minEpoch);
                return proposed.compareTo(current) <= 0 ? current.logicalNext(id) : proposed;
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `proposed`
in `accord-core/src/main/java/accord/local/Node.java`
#### Snippet
```java
                long minEpoch = topology.epoch();
                current = current.withMinEpoch(minEpoch);
                proposed = proposed.withMinEpoch(minEpoch);
                return proposed.compareTo(current) <= 0 ? current.logicalNext(id) : proposed;
            });
```

## RuleId[ruleID=ArrayEquality]
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
in `accord-core/src/main/java/accord/primitives/RoutingKeys.java`
#### Snippet
```java
    private RoutingKeys wrap(RoutingKey[] wrap)
    {
        return wrap == keys ? this : new RoutingKeys(wrap);
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
in `accord-core/src/main/java/accord/primitives/PartialKeyRoute.java`
#### Snippet
```java
        RoutingKey[] keys = SortedArrays.linearUnion(this.keys, that.keys, RoutingKey[]::new);
        Ranges covering = this.covering.union(that.covering);
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
Array objects are compared using `!=`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/Deps.java`
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
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
            else
            {
                Invariants.checkState(keys == bufKeys && keysLength == bufKeysLength);
                Invariants.checkState(txnIds == bufTxnIds && txnIdsLength == bufTxnIdsLength);
                Invariants.checkState(outLength == bufLength);
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
            {
                Invariants.checkState(keys == bufKeys && keysLength == bufKeysLength);
                Invariants.checkState(txnIds == bufTxnIds && txnIdsLength == bufTxnIdsLength);
                Invariants.checkState(outLength == bufLength);
            }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
            outLength = outKeysLength;

            if (remapLeft == null && outKeys == leftKeys)
            {
                // "this" knows all the TxnId and Keys already, but do both agree on what Keys map to TxnIds?
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
                    return constructor.construct(leftKeys, leftKeysLength, leftValues, leftValuesLength, left, leftLength);
            }
            else if (remapRight == null && outKeys == rightKeys)
            {
                // "that" knows all the TxnId and keys already, but "this" does not
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
                    keyBuffers, this, this, this
            );
            if (buf == deps.keyToTxnId)
            {
                Invariants.checkState(deps.keys.keys == bufKeys && deps.keys.keys.length == bufKeysLength);
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
            if (buf == deps.keyToTxnId)
            {
                Invariants.checkState(deps.keys.keys == bufKeys && deps.keys.keys.length == bufKeysLength);
                Invariants.checkState(deps.txnIds == bufTxnIds && deps.txnIds.length == bufTxnIdsLength);
                Invariants.checkState(deps.keyToTxnId.length == bufLength);
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
            {
                Invariants.checkState(deps.keys.keys == bufKeys && deps.keys.keys.length == bufKeysLength);
                Invariants.checkState(deps.txnIds == bufTxnIds && deps.txnIds.length == bufTxnIdsLength);
                Invariants.checkState(deps.keyToTxnId.length == bufLength);
                from = deps;
```

### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
                return;

            if (bufKeys != freeKeysIfNot)
            {
                keyBuffers.realDiscard(bufKeys, bufKeysLength);
```

### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
                bufKeys = null;
            }
            if (bufTxnIds != freeTxnIdsIfNot)
            {
                realDiscard(bufTxnIds, bufTxnIdsLength);
```

### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `accord-core/src/main/java/accord/primitives/Deps.java`
#### Snippet
```java
                bufTxnIds = null;
            }
            if (buf != freeBufIfNot)
            {
                realDiscard(buf, bufLength);
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

        // TODO (now): caching
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

## RuleId[ruleID=UnnecessaryLocalVariable]
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

## RuleId[ruleID=ZeroLengthArrayInitialization]
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
    public static Keys ofUnique(Collection<? extends Key> keys)
    {
        return ofUnique(keys.toArray(new Key[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `accord-core/src/main/java/accord/local/Command.java`
#### Snippet
```java

        if (homeKey() != null)
            return new PartialKeyRoute(Ranges.EMPTY, homeKey(), new RoutingKey[0]);

        return null;
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
in `accord-maelstrom/src/main/java/accord/maelstrom/MaelstromReply.java`
#### Snippet
```java

        Keys keys = new Keys(reads.navigableKeySet());
        Value[] values = reads.values().toArray(new Value[0]);

        return new MaelstromResult(client, requestId, keys, values, update);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `accord-core/src/main/java/accord/local/CommandStores.java`
#### Snippet
```java
    {
        this.supplier = supplier;
        this.current = new Snapshot(new ShardedRanges[0], Topology.EMPTY, Topology.EMPTY);
    }

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

## RuleId[ruleID=ConstantValue]
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

### ConstantValue
Condition `scope == null` is always `false`
in `accord-core/src/main/java/accord/messages/TxnRequest.java`
#### Snippet
```java
    {
        O scope = computeScopeInternal(node, topologies, keys, startIndex, slice, merge);
        if (scope == null)
            throw new IllegalArgumentException("No intersection");
        return scope;
```

