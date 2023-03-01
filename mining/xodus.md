# xodus 
 
# Bad smells
I found 1057 bad smells with 41 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 119 | false |
| RedundantFieldInitialization | 100 | false |
| NestedAssignment | 87 | false |
| AssignmentToMethodParameter | 79 | false |
| BoundedWildcard | 67 | false |
| DataFlowIssue | 62 | false |
| NullableProblems | 47 | false |
| UnnecessaryUnboxing | 29 | false |
| UnusedSymbol | 29 | false |
| EmptyMethod | 26 | false |
| EqualsAndHashcode | 24 | false |
| PublicFieldAccessedInSynchronizedContext | 22 | false |
| MemberVisibilityCanBePrivate | 21 | false |
| SystemOutErr | 18 | false |
| SynchronizeOnThis | 17 | false |
| RedundantSuppression | 17 | false |
| SizeReplaceableByIsEmpty | 16 | true |
| ClassNameSameAsAncestorName | 12 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 12 | false |
| UnnecessaryFullyQualifiedName | 10 | false |
| MarkedForRemoval | 9 | false |
| UnnecessaryQualifierForThis | 9 | false |
| RedundantMethodOverride | 8 | false |
| IntegerMultiplicationImplicitCastToLong | 8 | false |
| ConstantValue | 8 | false |
| UtilityClassWithoutPrivateConstructor | 8 | true |
| NonShortCircuitBoolean | 7 | false |
| UnnecessaryToStringCall | 7 | true |
| UnnecessaryBoxing | 7 | false |
| AssignmentToStaticFieldFromInstanceMethod | 6 | false |
| ControlFlowWithEmptyBody | 6 | false |
| MethodOverloadsParentMethod | 6 | false |
| NonProtectedConstructorInAbstractClass | 6 | true |
| MissortedModifiers | 6 | false |
| RedundantOperationOnEmptyContainer | 6 | false |
| ReplaceRangeToWithUntil | 6 | false |
| StaticInitializerReferencesSubClass | 5 | false |
| NestedLambdaShadowedImplicitParameter | 5 | false |
| UNUSED_IMPORT | 5 | false |
| RedundantVisibilityModifier | 5 | false |
| CommentedOutCode | 4 | false |
| HasPlatformType | 4 | false |
| AssignmentToForLoopParameter | 4 | false |
| RedundantSamConstructor | 3 | false |
| RemoveExplicitTypeArguments | 3 | false |
| RedundantSemicolon | 3 | false |
| CharsetObjectCanBeUsed | 3 | false |
| GroovyUnusedAssignment | 3 | false |
| DeprecatedIsStillUsed | 3 | false |
| MayBeConstant | 3 | false |
| KotlinRedundantDiagnosticSuppress | 2 | false |
| KeySetIterationMayUseEntrySet | 2 | false |
| ObjectNotify | 2 | false |
| ProtectedInFinal | 2 | false |
| RemoveEmptyClassBody | 2 | false |
| CanBeParameter | 2 | false |
| CallToStringConcatCanBeReplacedByOperator | 2 | false |
| AssignmentUsedAsCondition | 2 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 2 | false |
| PropertyName | 2 | false |
| BusyWait | 2 | false |
| UseCompareMethod | 2 | false |
| WaitNotInLoop | 2 | false |
| ObjectLiteralToLambda | 2 | false |
| StaticCallOnSubclass | 2 | false |
| SimplifiableCallChain | 2 | false |
| ManualMinMaxCalculation | 2 | false |
| UnnecessarySuperQualifier | 2 | false |
| CodeBlock2Expr | 2 | true |
| InstanceofCatchParameter | 2 | false |
| RedundantCollectionOperation | 2 | false |
| CopyConstructorMissesField | 2 | false |
| EqualsOrHashCode | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| WrapperTypeMayBePrimitive | 1 | false |
| NotNullFieldNotInitialized | 1 | false |
| ReplaceNegatedIsEmptyWithIsNotEmpty | 1 | false |
| LiftReturnOrAssignment | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| UnusedAssignment | 1 | false |
| JoinDeclarationAndAssignment | 1 | false |
| ReplaceManualRangeWithIndicesCalls | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| DeprecatedCallableAddReplaceWith | 1 | false |
| FunctionName | 1 | false |
| ConvertSecondaryConstructorToPrimary | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| NegativeIntConstantInLongContext | 1 | false |
| WhileLoopSpinsOnField | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| SlowListContainsAll | 1 | false |
| PrivatePropertyName | 1 | false |
| UnnecessaryVariable | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| RedundantStringFormatCall | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
| IOResource | 1 | false |
| ComparatorCombinators | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| VerboseNullabilityAndEmptiness | 1 | false |
| SetReplaceableByEnumSet | 1 | false |
| RemoveEmptyPrimaryConstructor | 1 | false |
| RedundantNullableReturnType | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Integer\[result.size()\]'
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIterableBase.java`
#### Snippet
```java
            }
        }
        return result.toArray(new Integer[result.size()]);
    }

```

## RuleId[ruleID=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `environment/src/main/java/jetbrains/exodus/log/BufferedDataWriter.java`
#### Snippet
```java
            var lastFile = blockSet.getMaximum();
            if (lastFile != null) {
                var lastFileAddress = lastFile;
                var block = blockSet.getBlock(lastFileAddress);

```

## RuleId[ruleID=MarkedForRemoval]
### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `utils/src/main/java/jetbrains/exodus/core/execution/ThreadJobProcessorPool.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `utils/src/main/java/jetbrains/exodus/core/execution/ThreadJobProcessorPool.java`
#### Snippet
```java
                            @Override
                            protected void execute() {
                                resultContainer.thread = AccessController.doPrivileged((PrivilegedAction<Thread>) () -> new Thread(body, name));
                                release();
                            }
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `utils/src/main/java/jetbrains/exodus/core/execution/ThreadJobProcessorPool.java`
#### Snippet
```java
                            @Override
                            protected void execute() {
                                resultContainer.thread = AccessController.doPrivileged((PrivilegedAction<Thread>) () -> new Thread(body, name));
                                release();
                            }
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `utils/src/main/kotlin/jetbrains/exodus/util/UnsafeHolder.kt`
#### Snippet
```java

    fun <T> doPrivileged(f: () -> T): T {
        return AccessController.doPrivileged(PrivilegedExceptionAction<T> {
            f()
        })
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `utils/src/main/kotlin/jetbrains/exodus/util/UnsafeHolder.kt`
#### Snippet
```java

    fun <T> doPrivileged(f: () -> T): T {
        return AccessController.doPrivileged(PrivilegedExceptionAction<T> {
            f()
        })
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `utils/src/main/kotlin/jetbrains/exodus/util/UnsafeHolder.kt`
#### Snippet
```java
package jetbrains.exodus.util

import java.security.AccessController
import java.security.PrivilegedExceptionAction

```

### MarkedForRemoval
'Integer(int)' is deprecated and marked for removal
in `openAPI/src/main/java/jetbrains/exodus/AbstractConfig.java`
#### Snippet
```java
            try {
                //noinspection CachedNumberConstructorCall,deprecation,BoxingBoxedValue
                return new Integer(Integer.decode(v));
            } catch (NumberFormatException ignored) {
            }
```

### MarkedForRemoval
'Boolean(boolean)' is deprecated and marked for removal
in `openAPI/src/main/java/jetbrains/exodus/AbstractConfig.java`
#### Snippet
```java
        final String value = strategy.getProperty(propName);
        //noinspection deprecation,UnnecessaryBoxing,BooleanConstructorCall
        return value == null ? defaultValue : new Boolean("true".equalsIgnoreCase(value));
    }

```

### MarkedForRemoval
'Long(long)' is deprecated and marked for removal
in `openAPI/src/main/java/jetbrains/exodus/AbstractConfig.java`
#### Snippet
```java
            try {
                //noinspection CachedNumberConstructorCall,deprecation,BoxingBoxedValue
                return new Long(Long.decode(v));
            } catch (NumberFormatException ignored) {
            }
```

## RuleId[ruleID=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass QuadraticClusteringStrategy from superclass ClusteringStrategy initializer might lead to class loading deadlock
in `vfs/src/main/java/jetbrains/exodus/vfs/ClusteringStrategy.java`
#### Snippet
```java

    public static final ClusteringStrategy LINEAR = new LinearClusteringStrategy();
    public static final ClusteringStrategy QUADRATIC = new QuadraticClusteringStrategy();
    public static final ClusteringStrategy EXPONENTIAL = new ExponentialClusteringStrategy();

```

### StaticInitializerReferencesSubClass
Referencing subclass ExponentialClusteringStrategy from superclass ClusteringStrategy initializer might lead to class loading deadlock
in `vfs/src/main/java/jetbrains/exodus/vfs/ClusteringStrategy.java`
#### Snippet
```java
    public static final ClusteringStrategy LINEAR = new LinearClusteringStrategy();
    public static final ClusteringStrategy QUADRATIC = new QuadraticClusteringStrategy();
    public static final ClusteringStrategy EXPONENTIAL = new ExponentialClusteringStrategy();

    public abstract int getFirstClusterSize();
```

### StaticInitializerReferencesSubClass
Referencing subclass LinearClusteringStrategy from superclass ClusteringStrategy initializer might lead to class loading deadlock
in `vfs/src/main/java/jetbrains/exodus/vfs/ClusteringStrategy.java`
#### Snippet
```java
public abstract class ClusteringStrategy {

    public static final ClusteringStrategy LINEAR = new LinearClusteringStrategy();
    public static final ClusteringStrategy QUADRATIC = new QuadraticClusteringStrategy();
    public static final ClusteringStrategy EXPONENTIAL = new ExponentialClusteringStrategy();
```

### StaticInitializerReferencesSubClass
Referencing subclass Empty from superclass TreeMetaInfo initializer might lead to class loading deadlock
in `environment/src/main/java/jetbrains/exodus/tree/TreeMetaInfo.java`
#### Snippet
```java
public abstract class TreeMetaInfo {

    public static final TreeMetaInfo EMPTY = new Empty(0);

    protected static final int DUPLICATES_BIT = 1;
```

### StaticInitializerReferencesSubClass
Referencing subclass NonDisposableEntityIterator from superclass EntityIteratorBase initializer might lead to class loading deadlock
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIteratorBase.java`
#### Snippet
```java

    static {
        EMPTY = new NonDisposableEntityIterator(EntityIterableBase.EMPTY) {

            @Override
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `IV` from instance context
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/crypto/JMHStreamCipherBenchmarks.java`
#### Snippet
```java
    @Fork(2)
    public Object initChaChaCipher() {
        chaChaCipher.init(KEY_256_BITS, IV++);
        return chaChaCipher;
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `IV` from instance context
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/crypto/JMHStreamCipherBenchmarks.java`
#### Snippet
```java
    @Fork(2)
    public Object initSalsa20Cipher() {
        salsa20Cipher.init(KEY_256_BITS, IV++);
        return salsa20Cipher;
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `IV` from instance context
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/crypto/JMHStreamCipherBenchmarks.java`
#### Snippet
```java
    @Fork(2)
    public Object initJbChaChaCipher() {
        jbChaChaCipher.init(KEY_256_BITS, IV++);
        return jbChaChaCipher;
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `IV` from instance context
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/crypto/JMHStreamCipherBenchmarks.java`
#### Snippet
```java
    @Setup
    public void prepare() {
        salsa20Cipher.init(KEY_256_BITS, IV++);
        chaChaCipher.init(KEY_256_BITS, IV++);
        jbChaChaCipher.init(KEY_256_BITS, IV++);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `IV` from instance context
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/crypto/JMHStreamCipherBenchmarks.java`
#### Snippet
```java
    public void prepare() {
        salsa20Cipher.init(KEY_256_BITS, IV++);
        chaChaCipher.init(KEY_256_BITS, IV++);
        jbChaChaCipher.init(KEY_256_BITS, IV++);
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `IV` from instance context
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/crypto/JMHStreamCipherBenchmarks.java`
#### Snippet
```java
        salsa20Cipher.init(KEY_256_BITS, IV++);
        chaChaCipher.init(KEY_256_BITS, IV++);
        jbChaChaCipher.init(KEY_256_BITS, IV++);
    }

```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (3 lines)
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
        addIncomingAssociation(incomingAssociations, emd.getType(), associationName);
        //seems like we'll add them after in any case
//        for (final String subtype : emd.getSubTypes()) {
//            addIncomingAssociation(subtype, associationName);
//        }
```

### CommentedOutCode
Commented out code (5 lines)
in `utils/src/main/java/jetbrains/exodus/core/crypto/MessageDigestUtil.java`
#### Snippet
```java

    private static byte[] hmacShaXUnsafe(String method, byte[] key, byte[] message) {
        /* if (message == null) return null;
      SecretKey sk = new SecretKeySpec(key, method);
      final Mac m = Mac.getInstance(sk.getAlgorithm());
```

### CommentedOutCode
Commented out code (3 lines)
in `utils/src/main/java/jetbrains/exodus/core/crypto/MessageDigestUtil.java`
#### Snippet
```java
import java.security.NoSuchAlgorithmException;

// import javax.crypto.SecretKey;
// import javax.crypto.Mac;
// import javax.crypto.spec.SecretKeySpec;
```

### CommentedOutCode
Commented out code (11 lines)
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverserDup.java`
#### Snippet
```java

    protected void popUntilDupLeft() {
        /*if (false) {
            final int bottom = 0;
            final TreePos current = stack[bottom];
```

## RuleId[ruleID=KotlinRedundantDiagnosticSuppress]
### KotlinRedundantDiagnosticSuppress
Redundant suppression
in `query/src/main/kotlin/jetbrains/exodus/query/PriorityMap.kt`
#### Snippet
```java
    override fun iterator(): MutableIterator<E> = Itr()

    @Suppress("UNCHECKED_CAST")
    private fun up(key: Int, x: E, v: Comparable<Any>) {
        var k = key
```

### KotlinRedundantDiagnosticSuppress
Redundant suppression
in `query/src/main/kotlin/jetbrains/exodus/query/PriorityMap.kt`
#### Snippet
```java
    }

    @Suppress("UNCHECKED_CAST")
    private fun down(key: Int, x: E, v: Comparable<Any>) {
        var k = key
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `cache.keySet()` may be replaced with 'entrySet()' iteration
in `environment/src/main/java/jetbrains/exodus/io/SharedMappedFilesCache.java`
#### Snippet
```java
            final List<File> obsoleteFiles = new ArrayList<>();
            synchronized (cache) {
                for (File file : cache.keySet()) {
                    if (file.getParentFile().equals(dir)) {
                        obsoleteFiles.add(file);
```

### KeySetIterationMayUseEntrySet
Iteration over `query.keySet()` may be replaced with 'entrySet()' iteration
in `entity-store/src/main/java/jetbrains/exodus/entitystore/Explainer.java`
#### Snippet
```java
        List<Pair<Integer, String>> byHandle = new ArrayList<>();
        Collection<String> toRemove = new HashSet<>();
        for (String parameter : query.keySet()) {
            if (parameter.startsWith(_CURSOR_ADVANCES_BY_TYPE)) {
                toRemove.add(parameter);
```

## RuleId[ruleID=NotNullFieldNotInitialized]
### NotNullFieldNotInitialized
Not-null fields must be initialized
in `environment/src/main/java/jetbrains/exodus/tree/patricia/PatriciaTraverser.java`
#### Snippet
```java
    NodeChildrenIterator[] stack;
    int top;
    @NotNull
    NodeBase currentNode;
    @Nullable
```

## RuleId[ruleID=ReplaceNegatedIsEmptyWithIsNotEmpty]
### ReplaceNegatedIsEmptyWithIsNotEmpty
Replace negated 'isEmpty' with 'isNotEmpty'
in `environment/src/main/kotlin/jetbrains/exodus/gc/UtilizationProfile.kt`
#### Snippet
```java
        } else {
            val storedUtilization = ec.gcUtilizationFromFile
            if (!storedUtilization.isEmpty()) {
                loadUtilizationFromFile(storedUtilization)
            } else {
```

## RuleId[ruleID=ObjectNotify]
### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/ReleaseLatch.java`
#### Snippet
```java
    public synchronized void release() {
        owner = null;
        notify();
    }

```

### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/DebugLatch.java`
#### Snippet
```java
        clearOwnerInfo();
        owner = null;
        notify();
    }

```

## RuleId[ruleID=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `NodeBase` on 'this' is unnecessary in this context
in `query/src/main/java/jetbrains/exodus/query/NodeBase.java`
#### Snippet
```java
        return () -> {
            final List<NodeBase> stack = new LinkedList<>();
            stack.add(NodeBase.this); // push root
            return new Iterator<NodeBase>() {
                @Override
```

### UnnecessaryQualifierForThis
Qualifier `ThreadJobProcessor` on 'this' is unnecessary in this context
in `utils/src/main/java/jetbrains/exodus/core/execution/ThreadJobProcessor.java`
#### Snippet
```java
        classLoader = getClass().getClassLoader();
        this.name = name;
        body = ThreadJobProcessor.this::run;
        this.creator = creator;
        createProcessorThread();
```

### UnnecessaryQualifierForThis
Qualifier `ReadWriteTransaction` on 'this' is unnecessary in this context
in `environment/src/main/java/jetbrains/exodus/env/ReadWriteTransaction.java`
#### Snippet
```java
            final MetaTreeImpl currentMetaTree = env.getMetaTreeInternal();
            setMetaTree(cloneMeta ? currentMetaTree.getClone() : currentMetaTree);
            env.registerTransaction(ReadWriteTransaction.this);
            if (beginHook != null) {
                beginHook.run();
```

### UnnecessaryQualifierForThis
Qualifier `TransactionBase` on 'this' is unnecessary in this context
in `environment/src/main/java/jetbrains/exodus/env/TransactionBase.java`
#### Snippet
```java
            final EnvironmentImpl env = getEnvironment();
            setMetaTree(env.getMetaTreeInternal());
            env.registerTransaction(TransactionBase.this);
            if (beginHook != null) {
                beginHook.run();
```

### UnnecessaryQualifierForThis
Qualifier `ExcludeNullIterableDecorator` on 'this' is unnecessary in this context
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/ExcludeNullIterableDecorator.java`
#### Snippet
```java
    @Override
    public EntityIterator getIteratorImpl(@NotNull final PersistentStoreTransaction txn) {
        return new EntityIteratorBase(ExcludeNullIterableDecorator.this) {
            private final EntityIterator iterator = getDecorated().iterator();
            private EntityId next = null;
```

### UnnecessaryQualifierForThis
Qualifier `PersistentEntityStoreImpl` on 'this' is unnecessary in this context
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
            linksTables = new OpenTablesCache((t, entityTypeId) -> new LinksTable(t,
                    namingRulez.getLinksTableName(entityTypeId), StoreConfig.WITH_DUPLICATES_WITH_PREFIXING));
            blobsTables = new OpenTablesCache((t, entityTypeId) -> new BlobsTable(PersistentEntityStoreImpl.this, t,
                    useVersion1Format() ?
                            namingRulez.getBlobsObsoleteTableName(entityTypeId) : namingRulez.getBlobsTableName(entityTypeId),
```

### UnnecessaryQualifierForThis
Qualifier `AddNullDecoratorIterable` on 'this' is unnecessary in this context
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/binop/AddNullDecoratorIterable.java`
#### Snippet
```java
    @Override
    public EntityIterator getIteratorImpl(@NotNull final PersistentStoreTransaction txn) {
        return new EntityIteratorBase(AddNullDecoratorIterable.this) {
            private EntityIterator iterator = null;
            private Boolean hasNull = null;
```

### UnnecessaryQualifierForThis
Qualifier `PersistentStoreTransaction` on 'this' is unnecessary in this context
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
        final EntityIterableCache entityIterableCache = store.getEntityIterableCache();
        for (final Updatable it : mutatedInTxn) {
            it.endUpdate(PersistentStoreTransaction.this);
        }
        if (!entityIterableCache.compareAndSetCacheAdapter(localCache, cache.endWrite())) {
```

### UnnecessaryQualifierForThis
Qualifier `PersistentStoreTransaction` on 'this' is unnecessary in this context
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
        txn.setCommitHook(() -> {
            log.flushed();
            final EntityIterableCacheAdapterMutable cache = PersistentStoreTransaction.this.mutableCache;
            if (cache != null) { // mutableCache can be null if only blobs are modified
                applyAtomicCaches(cache);
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`contains.length() == 0` can be replaced with 'contains.isEmpty()'
in `query/src/main/java/jetbrains/exodus/query/PropertyContains.java`
#### Snippet
```java
    @Override
    public void optimize(Sorts sorts, OptimizationPlan rules) {
        if (contains == null || contains.length() == 0) {
            final NodeBase parent = getParent();
            parent.replaceChild(this, NodeFactory.all());
```

### SizeReplaceableByIsEmpty
`starts.length() == 0` can be replaced with 'starts.isEmpty()'
in `query/src/main/java/jetbrains/exodus/query/PropertyStartsWith.java`
#### Snippet
```java
    @Override
    public void optimize(Sorts sorts, OptimizationPlan rules) {
        if (starts == null || starts.length() == 0) {
            final NodeBase parent = getParent();
            parent.replaceChild(this, NodeFactory.all());
```

### SizeReplaceableByIsEmpty
`priorities.size() == 0` can be replaced with 'priorities.isEmpty()'
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/StablePriorityQueue.java`
#### Snippet
```java
    @Override
    public Pair<P, E> peekPair() {
        if (priorities.size() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`priorities.size() == 0` can be replaced with 'priorities.isEmpty()'
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/StablePriorityQueue.java`
#### Snippet
```java
    @Override
    public Pair<P, E> floorPair() {
        if (priorities.size() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`priorities.size() == 0` can be replaced with 'priorities.isEmpty()'
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/StablePriorityQueue.java`
#### Snippet
```java
    @Override
    public E pop() {
        if (priorities.size() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`decorated.size() == 0` can be replaced with 'decorated.isEmpty()'
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/decorators/QueueDecorator.java`
#### Snippet
```java
    @Override
    public E element() {
        if (decorated.size() == 0) {
            throw new NoSuchElementException();
        }
```

### SizeReplaceableByIsEmpty
`decorated.size() == 0` can be replaced with 'decorated.isEmpty()'
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/decorators/QueueDecorator.java`
#### Snippet
```java
    @Override
    public E remove() {
        if (decorated.size() == 0) {
            throw new NoSuchElementException();
        }
```

### SizeReplaceableByIsEmpty
`decorated.size() == 0` can be replaced with 'decorated.isEmpty()'
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/decorators/QueueDecorator.java`
#### Snippet
```java
    @Override
    public E poll() {
        return (decorated.size() == 0) ? null : decorated.remove(0);
    }

```

### SizeReplaceableByIsEmpty
`decorated.size() == 0` can be replaced with 'decorated.isEmpty()'
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/decorators/QueueDecorator.java`
#### Snippet
```java
    @Override
    public E peek() {
        return (decorated.size() == 0) ? null : decorated.get(0);
    }

```

### SizeReplaceableByIsEmpty
`result.length() == 0` can be replaced with 'result.isEmpty()'
in `utils/src/main/java/jetbrains/exodus/util/UTFUtil.java`
#### Snippet
```java
                try {
                    temp = dataInput.readUTF();
                    if (result != null && result.length() == 0 &&
                            builder != null && builder.length() == 0 && temp.length() == 0) {
                        break;
```

### SizeReplaceableByIsEmpty
`builder.length() == 0` can be replaced with 'builder.isEmpty()'
in `utils/src/main/java/jetbrains/exodus/util/UTFUtil.java`
#### Snippet
```java
                    temp = dataInput.readUTF();
                    if (result != null && result.length() == 0 &&
                            builder != null && builder.length() == 0 && temp.length() == 0) {
                        break;
                    }
```

### SizeReplaceableByIsEmpty
`temp.length() == 0` can be replaced with 'temp.isEmpty()'
in `utils/src/main/java/jetbrains/exodus/util/UTFUtil.java`
#### Snippet
```java
                    temp = dataInput.readUTF();
                    if (result != null && result.length() == 0 &&
                            builder != null && builder.length() == 0 && temp.length() == 0) {
                        break;
                    }
```

### SizeReplaceableByIsEmpty
`errorMessage.length() > 0` can be replaced with '!errorMessage.isEmpty()'
in `openAPI/src/main/java/jetbrains/exodus/AbstractConfig.java`
#### Snippet
```java
            }
        }
        if (errorMessage.length() > 0) {
            throw new InvalidSettingException(errorMessage.toString());
        }
```

### SizeReplaceableByIsEmpty
`builder.length() > 0` can be replaced with '!builder.isEmpty()'
in `openAPI/src/main/java/jetbrains/exodus/AbstractConfig.java`
#### Snippet
```java

    private static void appendLineFeed(@NotNull final StringBuilder builder) {
        if (builder.length() > 0) {
            builder.append('\n');
        }
```

### SizeReplaceableByIsEmpty
`value.length() > 0` can be replaced with '!value.isEmpty()'
in `openAPI/src/main/java/jetbrains/exodus/util/LightOutputStream.java`
#### Snippet
```java
        if (value == null) {
            write(UTFUtil.NULL_STRING_UTF_VALUE);
        } else if (value.length() > 0) {
            final int utfLength = UTFUtil.getUtfByteLength(value);
            ensureCapacity(len + utfLength + 1); // + 1 for zero terminator
```

### SizeReplaceableByIsEmpty
`cache.size() == 0` can be replaced with 'cache.isEmpty()'
in `environment/src/main/java/jetbrains/exodus/io/SharedMappedFilesCache.java`
#### Snippet
```java
            }
            synchronized (cache) {
                if (cache.size() == 0) {
                    break;
                }
```

## RuleId[ruleID=ControlFlowWithEmptyBody]
### ControlFlowWithEmptyBody
'while' has empty body
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/persistent/PersistentEx.kt`
#### Snippet
```java

inline fun <V> PersistentLongMap<V>.writeFinally(block: PersistentLongMap.MutableMap<V>.() -> Unit) {
    while (!write(block)) {
    }
}
```

### ControlFlowWithEmptyBody
'while' has empty body
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/persistent/PersistentEx.kt`
#### Snippet
```java

inline fun <K, V> PersistentHashMap<K, V>.writeFinally(block: PersistentHashMap<K, V>.MutablePersistentHashMap.() -> Unit) {
    while (!write(block)) {
    }
}
```

### ControlFlowWithEmptyBody
'while' has empty body
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/persistent/PersistentEx.kt`
#### Snippet
```java

inline fun <K : Comparable<K>, V> Persistent23TreeMap<K, V>.writeFinally(block: Persistent23TreeMap.MutableMap<K, V>.() -> Unit) {
    while (!write(block)) {
    }
}
```

### ControlFlowWithEmptyBody
'while' has empty body
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/persistent/PersistentEx.kt`
#### Snippet
```java

inline fun PersistentLongSet.writeFinally(block: PersistentLongSet.MutableSet.() -> Unit) {
    while (!write(block)) {
    }
}
```

### ControlFlowWithEmptyBody
'while' has empty body
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/persistent/PersistentEx.kt`
#### Snippet
```java

inline fun <K, V> PersistentLinkedHashMap<K, V>.writeFinally(block: PersistentLinkedHashMap.PersistentLinkedHashMapMutable<K, V>.() -> Unit) {
    while (!write(block)) {
    }
}
```

### ControlFlowWithEmptyBody
'while' has empty body
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/persistent/PersistentEx.kt`
#### Snippet
```java

inline fun <K> PersistentHashSet<K>.writeFinally(block: PersistentHashSet.MutablePersistentHashSet<K>.() -> Unit) {
    while (!write(block)) {
    }
}
```

## RuleId[ruleID=NullableProblems]
### NullableProblems
Primitive type members cannot be annotated
in `vfs/src/main/java/jetbrains/exodus/vfs/VfsOutputStream.java`
#### Snippet
```java

    @Override
    public void write(@NotNull byte @NotNull [] b, int off, int len) throws IOException {
        int position = this.position;
        if (position + len > outputCluster.length) {
```

### NullableProblems
Primitive type members cannot be annotated
in `utils/src/main/java/jetbrains/exodus/util/HexUtil.java`
#### Snippet
```java
    }

    public static String byteArrayToString(@NotNull final byte[] array) {
        return byteArrayToString(array, 0, array.length);
    }
```

### NullableProblems
Primitive type members cannot be annotated
in `utils/src/main/java/jetbrains/exodus/util/HexUtil.java`
#### Snippet
```java
    }

    public static String byteArrayToString(@NotNull final byte[] array, int off, int len) {
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; ++i) {
```

### NullableProblems
Primitive type members cannot be annotated
in `openAPI/src/main/java/jetbrains/exodus/env/Environment.java`
#### Snippet
```java
     * @see EnvironmentConfig#getCipherKey()
     */
    @Nullable
    byte[] getCipherKey();

```

### NullableProblems
Primitive type members cannot be annotated
in `openAPI/src/main/java/jetbrains/exodus/util/LightOutputStream.java`
#### Snippet
```java

    @Override
    public void write(@NotNull byte @NotNull [] fromBuf, int offset, int length) {
        ensureCapacity(len + length);
        System.arraycopy(fromBuf, offset, buf, len, length);
```

### NullableProblems
Primitive type members cannot be annotated
in `openAPI/src/main/java/jetbrains/exodus/util/LightOutputStream.java`
#### Snippet
```java

    @Override
    public void write(@NotNull byte @NotNull [] fromBuf) {
        ensureCapacity(len + fromBuf.length);
        System.arraycopy(fromBuf, 0, buf, len, fromBuf.length);
```

### NullableProblems
Primitive type members cannot be annotated
in `openAPI/src/main/java/jetbrains/exodus/crypto/StreamCipher.java`
#### Snippet
```java
     * @param iv  64-bit initialization vector
     */
    void init(@NotNull final byte[] key, final long iv);

    /**
```

### NullableProblems
Primitive type members cannot be annotated
in `openAPI/src/main/java/jetbrains/exodus/bindings/LongBinding.java`
#### Snippet
```java
    }

    public static long entryToUnsignedLong(@NotNull final byte[] bytes, final int offset, final int length) {
        long result = 0;
        for (int i = 0; i < length; ++i) {
```

### NullableProblems
Primitive type members cannot be annotated
in `openAPI/src/main/java/jetbrains/exodus/bindings/IntegerBinding.java`
#### Snippet
```java


    public static int readCompressed(@NotNull final byte[] bytes) {
        final int firstByte = bytes[0] & 0xff;
        int result = firstByte & 0x1f;
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/EntityIterableHandle.java`
#### Snippet
```java
    int[] getPropertyIds();

    @NotNull
    int[] getTypeIdsAffectingCreation();

```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/EntityIterableHandle.java`
#### Snippet
```java
    int getEntityTypeId();

    @NotNull
    int[] getLinkIds();

```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/EntityIterableHandle.java`
#### Snippet
```java
    int[] getLinkIds();

    @NotNull
    int[] getPropertyIds();

```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/util/ImmutableSingleTypeEntityIdCollection.java`
#### Snippet
```java
    private final long[] idArray;

    public ImmutableSingleTypeEntityIdCollection(int singleTypeId, @NotNull long[] idArray) {
        this.singleTypeId = singleTypeId;
        this.idArray = idArray;
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/util/ImmutableSingleTypeEntityIdCollection.java`
#### Snippet
```java
    }

    @NotNull
    public long[] getIdArray() {
        return idArray;
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/util/ImmutableSingleTypeEntityIdCollection.java`
#### Snippet
```java

    private final int singleTypeId;
    @NotNull
    private final long[] idArray;

```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/tables/PropertyKey.java`
#### Snippet
```java

    private static void writePropertyKey(@NotNull final LightOutputStream output,
                                         @NotNull final int[] bytes,
                                         final long localId,
                                         final int propertyId) {
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/tables/PropertyKey.java`
#### Snippet
```java

    public static ArrayByteIterable propertyKeyToEntry(final LightOutputStream output,
                                                       @NotNull final int[] bytes,
                                                       final long localId,
                                                       final int propertyId) {
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIterableHandleDecorator.java`
#### Snippet
```java
    }

    @NotNull
    @Override
    public int[] getLinkIds() {
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIterableHandleDecorator.java`
#### Snippet
```java

    @Override
    @NotNull
    public int[] getTypeIdsAffectingCreation() {
        return decorated.getTypeIdsAffectingCreation();
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIterableHandleDecorator.java`
#### Snippet
```java

    @Override
    @NotNull
    public int[] getPropertyIds() {
        return decorated.getPropertyIds();
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/PropertyRangeIterable.java`
#### Snippet
```java
        return new ConstantEntityIterableHandle(getStore(), getType()) {

            @NotNull
            @Override
            public int[] getPropertyIds() {
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntitiesWithLinkIterable.java`
#### Snippet
```java
        }

        @NotNull
        @Override
        public int[] getLinkIds() {
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityFromLinksIterable.java`
#### Snippet
```java
        return new ConstantEntityIterableHandle(getStore(), EntityFromLinksIterable.getType()) {

            @NotNull
            @Override
            public int[] getLinkIds() {
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/SortIterable.java`
#### Snippet
```java
            private final int[] propertyIds = mergeFieldIds(new int[]{propertyId}, decorated.getPropertyIds());

            @NotNull
            @Override
            public int[] getPropertyIds() {
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/SortIterable.java`
#### Snippet
```java
    protected EntityIterableHandle getHandleImpl() {
        return new EntityIterableHandleDecorator(getStore(), SortIterable.getType(), source.getHandle()) {
            @NotNull
            private final int[] propertyIds = mergeFieldIds(new int[]{propertyId}, decorated.getPropertyIds());

```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntitiesWithPropertyIterable.java`
#### Snippet
```java
        }

        @NotNull
        @Override
        public int[] getPropertyIds() {
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityFromLinkSetIterable.java`
#### Snippet
```java
        return new ConstantEntityIterableHandle(getStore(), EntityFromLinkSetIterable.getType()) {

            @NotNull
            @Override
            public int[] getLinkIds() {
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/SingleEntityIterable.java`
#### Snippet
```java
        return new EntityIterableHandleBase(getStore(), SingleEntityIterable.getType()) {

            @NotNull
            @Override
            public int[] getLinkIds() {
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/IdFilter.java`
#### Snippet
```java
final class BinarySearchIdFilter extends BloomIdFilter {

    BinarySearchIdFilter(@NotNull final int[] ids) {
        super(ids);
    }
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/IdFilter.java`
#### Snippet
```java
final class LinearSearchIdFilter extends BloomIdFilter {

    LinearSearchIdFilter(@NotNull final int[] ids) {
        super(ids);
    }
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/IdFilter.java`
#### Snippet
```java
    private final int bloomFilter;

    BloomIdFilter(@NotNull final int[] ids) {
        this.ids = ids;
        int bloomFilter = 0;
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/SortIndirectIterable.java`
#### Snippet
```java
            private final EntityIterableHandleBase sortedLinksHandle = (EntityIterableHandleBase) sortedLinks.getHandle();

            @NotNull
            private final int[] linkIds = mergeFieldIds(new int[]{linkId}, mergeFieldIds(decorated.getLinkIds(), sortedLinksHandle.getLinkIds()));

```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/SortIndirectIterable.java`
#### Snippet
```java
            private final int[] linkIds = mergeFieldIds(new int[]{linkId}, mergeFieldIds(decorated.getLinkIds(), sortedLinksHandle.getLinkIds()));

            @NotNull
            @Override
            public int[] getLinkIds() {
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/PropertiesIterable.java`
#### Snippet
```java
        }

        @NotNull
        @Override
        public int[] getPropertyIds() {
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIterableHandleBase.java`
#### Snippet
```java
        }

        @NotNull
        private final long[] hashLongs;
        private int bytesProcessed;
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIterableHandleBase.java`
#### Snippet
```java
    }

    @NotNull
    protected static int[] mergeFieldIds(@NotNull final int[] left, @NotNull final int[] right) {
        final int l = left.length;
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIterableHandleBase.java`
#### Snippet
```java

    @NotNull
    protected static int[] mergeFieldIds(@NotNull final int[] left, @NotNull final int[] right) {
        final int l = left.length;
        if (l == 0) return right;
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIterableHandleBase.java`
#### Snippet
```java

    @NotNull
    protected static int[] mergeFieldIds(@NotNull final int[] left, @NotNull final int[] right) {
        final int l = left.length;
        if (l == 0) return right;
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIterableHandleBase.java`
#### Snippet
```java

    @Override
    @NotNull
    public int[] getTypeIdsAffectingCreation() {
        return IdFilter.EMPTY_ID_ARRAY;
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIterableHandleBase.java`
#### Snippet
```java

    @Override
    @NotNull
    public int[] getPropertyIds() {
        return IdFilter.EMPTY_ID_ARRAY;
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIterableHandleBase.java`
#### Snippet
```java
    }

    @NotNull
    @Override
    public int[] getLinkIds() {
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/binop/BinaryOperatorEntityIterable.java`
#### Snippet
```java
            private final int[] linkIds = mergeFieldIds(iterable1.getHandle().getLinkIds(), iterable2.getHandle().getLinkIds());

            @NotNull
            private final int[] propertyIds = mergeFieldIds(iterable1.getHandle().getPropertyIds(), iterable2.getHandle().getPropertyIds());

```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/binop/BinaryOperatorEntityIterable.java`
#### Snippet
```java
            }

            @NotNull
            @Override
            public int[] getTypeIdsAffectingCreation() {
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/binop/BinaryOperatorEntityIterable.java`
#### Snippet
```java

            @Override
            @NotNull
            public int[] getPropertyIds() {
                return propertyIds;
```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/binop/BinaryOperatorEntityIterable.java`
#### Snippet
```java
            private final int[] propertyIds = mergeFieldIds(iterable1.getHandle().getPropertyIds(), iterable2.getHandle().getPropertyIds());

            @NotNull
            private final int[] typeIdsAffectingCreation = mergeFieldIds(iterable1.getHandle().getTypeIdsAffectingCreation(), iterable2.getHandle().getTypeIdsAffectingCreation());

```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/binop/BinaryOperatorEntityIterable.java`
#### Snippet
```java
            private int entityTypeId = -1;

            @NotNull
            private final int[] linkIds = mergeFieldIds(iterable1.getHandle().getLinkIds(), iterable2.getHandle().getLinkIds());

```

### NullableProblems
Primitive type members cannot be annotated
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/binop/BinaryOperatorEntityIterable.java`
#### Snippet
```java
            private final int[] typeIdsAffectingCreation = mergeFieldIds(iterable1.getHandle().getTypeIdsAffectingCreation(), iterable2.getHandle().getTypeIdsAffectingCreation());

            @NotNull
            @Override
            public int[] getLinkIds() {
```

## RuleId[ruleID=ProtectedInFinal]
### ProtectedInFinal
'protected' visibility is effectively 'private' in a final class
in `query/src/main/kotlin/jetbrains/exodus/query/LinksEqualDecorator.kt`
#### Snippet
```java
    override fun getClone(): NodeBase = LinksEqualDecorator(linkName, decorated.clone, linkEntityType)

    protected fun instantiateDecorated(
        entityType: String,
        queryEngine: QueryEngine,
```

### ProtectedInFinal
'protected' visibility is effectively 'private' in a final class
in `environment/src/main/kotlin/jetbrains/exodus/io/WatchingFileDataReaderWriterProvider.kt`
#### Snippet
```java
    companion object {
        @JvmStatic
        protected fun checkDirectory(location: String): File {
            val directory = File(location)
            if (directory.isFile) {
```

## RuleId[ruleID=LiftReturnOrAssignment]
### LiftReturnOrAssignment
'Assignment' can be lifted out of 'if'
in `environment/src/main/kotlin/jetbrains/exodus/env/BitmapIterator.kt`
#### Snippet
```java
            bitIndex = if (navigatedKey != searchKey) if (direction > 0) 0 else 63
            else {
                if (direction > 0) {
                    // clear lower bits
                    value = (value shr searchIndex) shl searchIndex
```

## RuleId[ruleID=NestedLambdaShadowedImplicitParameter]
### NestedLambdaShadowedImplicitParameter
Implicit parameter 'it' of enclosing lambda is shadowed
in `crypto/src/main/kotlin/jetbrains/exodus/crypto/convert/ScytaleEngine.kt`
#### Snippet
```java
                        is FileHeader -> {
                            currentFile?.let {
                                listener.onFileEnd(it)
                            }
                            currentFile = it
```

### NestedLambdaShadowedImplicitParameter
Implicit parameter 'it' of enclosing lambda is shadowed
in `crypto/src/main/kotlin/jetbrains/exodus/crypto/convert/ScytaleEngine.kt`
#### Snippet
```java
                        is EndChunk -> {
                            currentFile?.let {
                                listener.onFileEnd(it)
                            }
                        }
```

### NestedLambdaShadowedImplicitParameter
Implicit parameter 'it' of enclosing lambda is shadowed
in `benchmarks/src/jmh/kotlin/jetbrains/exodus/benchmark/query/InMemorySortBenchmarkBase.kt`
#### Snippet
```java
            val sorted = sortFun(it.getAll("Issue"))
            // sum of ids of least 100 entities
            sorted.take(100).map { it.id.localId }.sum()
        }
    }
```

### NestedLambdaShadowedImplicitParameter
Implicit parameter 'it' of enclosing lambda is shadowed
in `benchmarks/src/jmh/kotlin/jetbrains/exodus/benchmark/query/InMemorySortBenchmarkBase.kt`
#### Snippet
```java
    open fun testNoSort(): Long {
        return store.computeInTransaction {
            val sum = it.getAll("Issue").sumBy { it.getProperty("int") as Int }
            if (abs(sum) < 100) {
                throw IndexOutOfBoundsException()
```

### NestedLambdaShadowedImplicitParameter
Implicit parameter 'it' of enclosing lambda is shadowed
in `benchmarks/src/jmh/kotlin/jetbrains/exodus/benchmark/query/InMemorySortBenchmarkBase.kt`
#### Snippet
```java
                throw IndexOutOfBoundsException()
            }
            it.getAll("Issue").take(100).map { it.id.localId }.sum()
        }
    }
```

## RuleId[ruleID=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `openAPI/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreConfig.java`
#### Snippet
```java

    public int getBlobMaxReadWaitingInterval() {
        return ((Integer) getSetting(BLOB_MAX_READ_WAITING_INTERVAL)).intValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `environment/src/main/java/jetbrains/exodus/io/AsyncFileDataWriter.java`
#### Snippet
```java
        }

        var position = ((Long) Files.getAttribute(blockPath, "size")).longValue();

        if (position != length) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `environment/src/main/java/jetbrains/exodus/env/ReadWriteTransaction.java`
#### Snippet
```java
        for (final Map.Entry<Long, Pair<String, ITree>> entry : removedEntries) {
            final Pair<String, ITree> value = entry.getValue();
            MetaTreeImpl.removeStore(metaTreeMutable, value.getFirst(), entry.getKey().longValue());
            expiredLoggables = expiredLoggables.mergeWith(TreeMetaInfo.getTreeLoggables(value.getSecond()).trimToSize());
        }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/VFSBlobVault.java`
#### Snippet
```java
                stream.reset();
                stream.mark(IOUtil.DEFAULT_BUFFER_SIZE);
                setContent(object.getKey().longValue(), stream, txn);
                return true;
            });
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/VFSBlobVault.java`
#### Snippet
```java
        if (blobFiles != null) {
            blobFiles.forEachEntry((ObjectProcedureThrows<Map.Entry<Long, Path>, Exception>) object -> {
                setContent(object.getKey().longValue(), object.getValue().toFile(), txn);
                return true;
            });
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/VFSBlobVault.java`
#### Snippet
```java
            var actualLength = fs.getFileLength(txn, blobHandle);

            if (actualLength != expectedLength.longValue()) {
                return null;
            }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/FileSystemBlobVaultOld.java`
#### Snippet
```java
        try {
            var location = getBlobLocation(blobHandle);
            if (expectedLength != null && location.length() != expectedLength.longValue()) {
                return null;
            }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
                                var blobLocation = blobVault.getBlobLocation(blobHandle);
                                if (blobLocation.exists() && blobLocation.length() ==
                                        getBlobFileLength(blobHandle, envTransaction).longValue()) {
                                    break;
                                }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
                                    }

                                    var expectedBlobLength = getBlobFileLength(blobHandle, envTransaction).longValue();
                                    if (blobLocation.length() != expectedBlobLength) {
                                        throw new ExodusException("Blob file " + blobLocation.getAbsolutePath() +
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
    public EntityIterableBase findWithProp(@NotNull final String entityType, @NotNull final String propertyName) {
        return getPropertyIterable(entityType, propertyName, (entityTypeId, propertyId) ->
                new EntitiesWithPropertyIterable(this, entityTypeId.intValue(), propertyId.intValue()));
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
    public EntityIterableBase findWithProp(@NotNull final String entityType, @NotNull final String propertyName) {
        return getPropertyIterable(entityType, propertyName, (entityTypeId, propertyId) ->
                new EntitiesWithPropertyIterable(this, entityTypeId.intValue(), propertyId.intValue()));
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
    public EntityIterableBase findWithPropSortedByValue(@NotNull final String entityType, @NotNull final String propertyName) {
        return getPropertyIterable(entityType, propertyName, (entityTypeId, propertyId) ->
                new PropertiesIterable(this, entityTypeId.intValue(), propertyId.intValue()));
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
    public EntityIterableBase findWithPropSortedByValue(@NotNull final String entityType, @NotNull final String propertyName) {
        return getPropertyIterable(entityType, propertyName, (entityTypeId, propertyId) ->
                new PropertiesIterable(this, entityTypeId.intValue(), propertyId.intValue()));
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
                for (final Triple<Path, Boolean, Long> streamTriple : blobStreams.values()) {
                    try {
                        if (!checkInvalidateBlobsFlag || streamTriple.second.booleanValue()) {
                            final Path path = streamTriple.first;
                            Files.deleteIfExists(path);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
    public EntityIterable findWithBlob(@NotNull final String entityType, @NotNull final String blobName) {
        return getPropertyIterable(entityType, blobName, (entityTypeId, blobId) ->
                new EntitiesWithBlobIterable(this, entityTypeId.intValue(), blobId.intValue()));
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
    public EntityIterable findWithBlob(@NotNull final String entityType, @NotNull final String blobName) {
        return getPropertyIterable(entityType, blobName, (entityTypeId, blobId) ->
                new EntitiesWithBlobIterable(this, entityTypeId.intValue(), blobId.intValue()));
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
        }
        return getPropertyIterable(entityType, propertyName, (entityTypeId, propertyId) ->
                new PropertyContainsValueEntityIterable(this, entityTypeId.intValue(), propertyId.intValue(), value, ignoreCase));
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
        }
        return getPropertyIterable(entityType, propertyName, (entityTypeId, propertyId) ->
                new PropertyContainsValueEntityIterable(this, entityTypeId.intValue(), propertyId.intValue(), value, ignoreCase));
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
        if (value instanceof Boolean) {
            final EntityIterableBase withProp = findWithProp(entityType, propertyName);
            if (((Boolean) value).booleanValue()) {
                return withProp;
            }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
        }
        return getPropertyIterable(entityType, propertyName, (entityTypeId, propertyId) ->
                new PropertyValueIterable(this, entityTypeId.intValue(), propertyId.intValue(), value));
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
        }
        return getPropertyIterable(entityType, propertyName, (entityTypeId, propertyId) ->
                new PropertyValueIterable(this, entityTypeId.intValue(), propertyId.intValue(), value));
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
                               @NotNull final Comparable minValue, @NotNull final Comparable maxValue) {
        if (minValue instanceof Boolean) {
            final boolean min = ((Boolean) minValue).booleanValue();
            final boolean max = ((Boolean) maxValue).booleanValue();
            if (min == max) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
        if (minValue instanceof Boolean) {
            final boolean min = ((Boolean) minValue).booleanValue();
            final boolean max = ((Boolean) maxValue).booleanValue();
            if (min == max) {
                if (min) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
        }
        return getPropertyIterable(entityType, propertyName, (entityTypeId, propertyId) ->
                new PropertyRangeIterable(this, entityTypeId.intValue(), propertyId.intValue(), minValue, maxValue));
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
        }
        return getPropertyIterable(entityType, propertyName, (entityTypeId, propertyId) ->
                new PropertyRangeIterable(this, entityTypeId.intValue(), propertyId.intValue(), minValue, maxValue));
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java

    // TODO: remove ASAP
    private static final int traceGetAllForEntityType = Integer.getInteger("jetbrains.exodus.entitystore.traceGetAllForEntityType", -1).intValue();

    @Override
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/XodusDirectory.java`
#### Snippet
```java
        }

        var indexFile = DirUtil.getFileNameByAddress(addr.longValue());
        pendingDeletes.put(name, luceneIndex.resolve(indexFile));
        privateDeleteFile(name);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/XodusDirectory.java`
#### Snippet
```java
        }

        return address.longValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/XodusDirectory.java`
#### Snippet
```java
        });

        if (exist.booleanValue()) {
            throw new FileAlreadyExistsException("File " + name + " already exists");
        }
```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `getEntityType()` is identical to its super method
in `query/src/main/java/jetbrains/exodus/query/TreeKeepingEntityIterable.java`
#### Snippet
```java

    @Override
    public String getEntityType() {
        return entityType;
    }
```

### RedundantMethodOverride
Method `isSortedById()` is identical to its super method
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntitiesWithLinkIterable.java`
#### Snippet
```java

    @Override
    public boolean isSortedById() {
        return true;
    }
```

### RedundantMethodOverride
Method `isSortedById()` is identical to its super method
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntitiesWithLinkSortedIterable.java`
#### Snippet
```java

    @Override
    public boolean isSortedById() {
        return true;
    }
```

### RedundantMethodOverride
Method `getLinkIds()` is identical to its super method
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/SingleEntityIterable.java`
#### Snippet
```java
            @NotNull
            @Override
            public int[] getLinkIds() {
                return IdFilter.EMPTY_ID_ARRAY;
            }
```

### RedundantMethodOverride
Method `isSortedById()` is identical to its super method
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/EmptyCachedInstanceIterable.java`
#### Snippet
```java

    @Override
    public boolean isSortedById() {
        return true;
    }
```

### RedundantMethodOverride
Method `isSortedById()` is identical to its super method
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/SingleTypeSortedSetEntityIdCachedInstanceIterable.java`
#### Snippet
```java

    @Override
    public boolean isSortedById() {
        return true;
    }
```

### RedundantMethodOverride
Method `isSortedById()` is identical to its super method
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/SingleTypeSortedEntityIdArrayCachedInstanceIterable.java`
#### Snippet
```java

    @Override
    public boolean isSortedById() {
        return true;
    }
```

### RedundantMethodOverride
Method `isSortedById()` is identical to its super method
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/MultiTypeSortedEntityIdArrayCachedInstanceIterable.java`
#### Snippet
```java

    @Override
    public boolean isSortedById() {
        return true;
    }
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Entry` is the same as one of its superclass' names
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntHashMap.java`
#### Snippet
```java


    private static class Entry<V> implements Map.Entry<Integer, V> {

        private final int key;
```

### ClassNameSameAsAncestorName
Class name `Entry` is the same as one of its superclass' names
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntLinkedHashMap.java`
#### Snippet
```java


    private static class Entry<V> implements Map.Entry<Integer, V> {

        private final int key;
```

### ClassNameSameAsAncestorName
Class name `Entry` is the same as one of its superclass' names
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LongLinkedHashMap.java`
#### Snippet
```java


    private static class Entry<V> implements Map.Entry<Long, V> {

        private final long key;
```

### ClassNameSameAsAncestorName
Class name `ImmutableMap` is the same as one of its superclass' names
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentLong23TreeMap.java`
#### Snippet
```java
    }

    protected static class ImmutableMap<V> extends Persistent23Tree.ImmutableTree<PersistentLongMap.Entry<V>> implements PersistentLongMap.ImmutableMap<V> {

        ImmutableMap(RootNode<PersistentLongMap.Entry<V>> root) {
```

### ClassNameSameAsAncestorName
Class name `MutableMap` is the same as one of its superclass' names
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentLong23TreeMap.java`
#### Snippet
```java
    }

    protected static class MutableMap<V> extends Persistent23Tree.MutableTree<PersistentLongMap.Entry<V>> implements PersistentLongMap.MutableMap<V>, RootHolder {

        MutableMap(Persistent23Tree<PersistentLongMap.Entry<V>> set) {
```

### ClassNameSameAsAncestorName
Class name `Entry` is the same as one of its superclass' names
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LinkedHashMap.java`
#### Snippet
```java


    private static class Entry<K, V> implements Map.Entry<K, V> {

        private final K key;
```

### ClassNameSameAsAncestorName
Class name `Entry` is the same as one of its superclass' names
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashMap.java`
#### Snippet
```java


    private static class Entry<K, V> implements Map.Entry<K, V>, Serializable {

        private final K key;
```

### ClassNameSameAsAncestorName
Class name `ImmutableSet` is the same as one of its superclass' names
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentLong23TreeSet.java`
#### Snippet
```java
    }

    protected static class ImmutableSet extends PersistentLong23TreeMap.ImmutableMap<Boolean> implements PersistentLongSet.ImmutableSet {

        ImmutableSet(RootNode<PersistentLongMap.Entry<Boolean>> root) {
```

### ClassNameSameAsAncestorName
Class name `MutableSet` is the same as one of its superclass' names
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentLong23TreeSet.java`
#### Snippet
```java
    }

    protected static class MutableSet implements PersistentLongSet.MutableSet {

        private final PersistentLong23TreeMap.MutableMap<Boolean> map;
```

### ClassNameSameAsAncestorName
Class name `ImmutableMap` is the same as one of its superclass' names
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
    }

    protected static class ImmutableMap<V> implements PersistentLongMap.ImmutableMap<V> {
        @NotNull
        protected final AbstractPersistent23Tree<Entry> map;
```

### ClassNameSameAsAncestorName
Class name `MutableMap` is the same as one of its superclass' names
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
    }

    protected static class MutableMap<V> implements PersistentLongMap.MutableMap<V>, RootHolder {

        @NotNull
```

### ClassNameSameAsAncestorName
Class name `Iterator` is the same as one of its superclass' names
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
        }

        private class Iterator implements java.util.Iterator<Pair<Long, Long>> {

            final Cursor cursor;
```

## RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
i \* 2: integer multiplication implicitly cast to long
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/dataStructures/persistent/JMHPersistentLongSetFillBenchmark.java`
#### Snippet
```java
    public void prepare() {
        for (int i = 0; i < MAP_SIZE; ++i) {
            keys[i] = (long) (i * 2);
        }
    }
```

### IntegerMultiplicationImplicitCastToLong
i \* 2: integer multiplication implicitly cast to long
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/dataStructures/persistent/JMHPersistentLongSetIterationBenchmark.java`
#### Snippet
```java
        for (int i = 0; i < MAP_SIZE; ++i) {
            // the keys are even
            mutableTreeSet.add((long) (i * 2));
            mutableBitSet.add((long) (i * 2));
            juTree.put((long) (i * 2), value);
```

### IntegerMultiplicationImplicitCastToLong
i \* 2: integer multiplication implicitly cast to long
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/dataStructures/persistent/JMHPersistentLongSetIterationBenchmark.java`
#### Snippet
```java
            // the keys are even
            mutableTreeSet.add((long) (i * 2));
            mutableBitSet.add((long) (i * 2));
            juTree.put((long) (i * 2), value);
        }
```

### IntegerMultiplicationImplicitCastToLong
i \* 2: integer multiplication implicitly cast to long
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/dataStructures/persistent/JMHPersistentLongSetIterationBenchmark.java`
#### Snippet
```java
            mutableTreeSet.add((long) (i * 2));
            mutableBitSet.add((long) (i * 2));
            juTree.put((long) (i * 2), value);
        }
        mutableTreeSet.endWrite();
```

### IntegerMultiplicationImplicitCastToLong
size \<\< 1: integer shift implicitly cast to long
in `environment/src/main/java/jetbrains/exodus/tree/btree/InternalPage.java`
#### Snippet
```java
    public String toString() {
        return "Internal [" + size + "] @ " + (getDataAddress() -
                CompressedUnsignedLongByteIterable.getIterable(size << 1).getLength() - 2);
    }

```

### IntegerMultiplicationImplicitCastToLong
size \<\< 1: integer shift implicitly cast to long
in `environment/src/main/java/jetbrains/exodus/tree/btree/BottomPage.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "Bottom [" + size + "] @ " + (getDataAddress() - CompressedUnsignedLongByteIterable.getIterable(size << 1).getLength() - 1);
    }

```

### IntegerMultiplicationImplicitCastToLong
size \<\< 1: integer shift implicitly cast to long
in `environment/src/main/java/jetbrains/exodus/tree/btree/BottomPageMutable.java`
#### Snippet
```java
    protected ByteIterable[] getByteIterables(@NotNull final ReclaimFlag flag) {
        return new ByteIterable[]{
            CompressedUnsignedLongByteIterable.getIterable((size << 1) + flag.value), // store flag bit
            CompressedUnsignedLongArrayByteIterable.getIterable(keysAddresses, size)
        };
```

### IntegerMultiplicationImplicitCastToLong
size \<\< 1: integer shift implicitly cast to long
in `environment/src/main/java/jetbrains/exodus/tree/btree/InternalPageMutable.java`
#### Snippet
```java
    protected ByteIterable[] getByteIterables(@NotNull final ReclaimFlag flag) {
        return new ByteIterable[]{
                CompressedUnsignedLongByteIterable.getIterable((size << 1) + flag.value),
                CompressedUnsignedLongArrayByteIterable.getIterable(keysAddresses, size),
                CompressedUnsignedLongArrayByteIterable.getIterable(childrenAddresses, size),
```

## RuleId[ruleID=RemoveEmptyClassBody]
### RemoveEmptyClassBody
Redundant empty class body
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/ConcurrentLongObjectCache.kt`
#### Snippet
```java
    private fun indexFor(key: Long) = HashUtil.indexFor(key, generationSize, mask) * numberOfGenerations

    private class CacheEntry<V>(val key: Long, var value: V?) {}
}

```

### RemoveEmptyClassBody
Redundant empty class body
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/ConcurrentIntObjectCache.kt`
#### Snippet
```java
    private fun indexFor(key: Int) = HashUtil.indexFor(key, generationSize, mask) * numberOfGenerations

    private class CacheEntry<V>(val key: Int, var value: V?) {}
}

```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.concurrent.ConcurrentHashMap;`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
import java.security.SecureRandom;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@SuppressWarnings({"UnusedDeclaration", "ThisEscapedInObjectConstruction", "VolatileLongOrDoubleField",
```

### UNUSED_IMPORT
Unused import `import jetbrains.exodus.log.ByteIterableWithAddress;`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/PatriciaTreeEmpty.java`
#### Snippet
```java

import jetbrains.exodus.ByteIterable;
import jetbrains.exodus.log.ByteIterableWithAddress;
import jetbrains.exodus.log.Log;
import jetbrains.exodus.log.Loggable;
```

### UNUSED_IMPORT
Unused import `import jetbrains.exodus.log.NullLoggable;`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/PatriciaTreeEmpty.java`
#### Snippet
```java
import jetbrains.exodus.log.Log;
import jetbrains.exodus.log.Loggable;
import jetbrains.exodus.log.NullLoggable;
import jetbrains.exodus.tree.ITreeCursor;
import jetbrains.exodus.tree.ITreeMutable;
```

### UNUSED_IMPORT
Unused import `import java.io.BufferedInputStream;`
in `openAPI/src/main/java/jetbrains/exodus/entitystore/DiskBasedBlobVault.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
```

### UNUSED_IMPORT
Unused import `import java.io.InputStream;`
in `openAPI/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreConfig.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.Map;
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`result = result + (((long) Integer.parseInt(f.getName(), 16)) << shift)` could be simplified to 'result += (((long) Integer.parseInt(f.getName(), 16)) \<\< shift)'
in `entity-store/src/main/java/jetbrains/exodus/entitystore/FileSystemBlobVault.java`
#### Snippet
```java
                    }
                    shift += Byte.SIZE;
                    result = result + (((long) Integer.parseInt(f.getName(), 16)) << shift);
                }
            } catch (NumberFormatException nfe) {
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `vfs/src/main/java/jetbrains/exodus/vfs/VfsOutputStream.java`
#### Snippet
```java
                }
            }
            if ((this.position = position) > outputClusterSize) {
                outputClusterSize = position;
                isOutputClusterDirty = true;
```

### NestedAssignment
Result of assignment expression used
in `query/src/main/java/jetbrains/exodus/query/UniqueKeyIndicesEngine.java`
#### Snippet
```java
                    final IndexField field = fields.get(j);
                    if (field.isProperty()) {
                        if ((props[j] = persistentStore.getProperty(txn, (PersistentEntity) entity, field.getName())) == null) {
                            throw new EntityStoreException("Can't create unique key index with null property value: " + entityType + '.' + field.getName());
                        }
```

### NestedAssignment
Result of assignment expression used
in `query/src/main/java/jetbrains/exodus/query/UniqueKeyIndicesEngine.java`
#### Snippet
```java
                        }
                    } else {
                        if ((props[j] = entity.getLink(field.getName())) == null) {
                            throw new EntityStoreException("Can't create unique key index with null link: " + entityType + '.' + field.getName());
                        }
```

### NestedAssignment
Result of assignment expression used
in `query/src/main/java/jetbrains/exodus/query/TreeKeepingEntityIterable.java`
#### Snippet
```java
            final boolean sourceCanBeCached = sourceTree.canBeCached();
            OptimizedTreesCache.OptimizedTreeAndSorts optimized;
            if (sourceCanBeCached && (optimized = OptimizedTreesCache.get().findOptimized(sourceTree)) != null) {
                optimizedTree = optimized.getOptimizedTree();
                sorts = optimized.getSorts();
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/execution/Job.java`
#### Snippet
```java

    public boolean queue(JobProcessor processor, Priority priority) {
        return (wasQueued = processor.queue(this, priority));
    }

```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/execution/ThreadJobProcessorPool.java`
#### Snippet
```java
                if (result == null) {
                    SPAWNER.start();
                    PROCESSORS.put(processorName, result = new ThreadJobProcessor(processorName, (body, name) -> {
                        //   This method is invoked first time from constructor (two lines above)
                        // constructor execution waits for latch since processor being created
                        // invokes createProcessorThread() method.
                        //   Calling thread waits for latch to be released by SPAWNER thread in LatchJob below.
                        // Also, this method can be invoked on processor re-creation and blocks calling thread
                        // just like it was invoked from constructor.
                        final ThreadContainer resultContainer = new ThreadContainer();
                        SPAWNER.waitForLatchJob(new LatchJob() {
                            @Override
                            protected void execute() {
                                resultContainer.thread = AccessController.doPrivileged((PrivilegedAction<Thread>) () -> new Thread(body, name));
                                release();
                            }
                        }, 100);
                        Thread thread = resultContainer.thread;
                        resultContainer.thread = null; // paranoiac cleaning of thread reference
                        if (thread == null) {
                            throw new IllegalStateException("Can't create JobProcessor thread!");
                        } else {
                            return thread;
                        }
                    }));
                }

```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/CacheHitRateable.java`
#### Snippet
```java

    protected CacheHitRateable() {
        attempts = hits = 0;
        cacheAdjuster = getCacheAdjuster();
        if (cacheAdjuster != null) {
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntHashSet.java`
#### Snippet
```java

        protected Entry nextEntry() {
            final Entry result = last = e;
            initNextEntry();
            return result;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/StablePriorityQueue.java`
#### Snippet
```java
        final P oldPriority = oldPair == null ? null : oldPair.getSecond();
        final E oldValue = oldPair == null ? null : oldPair.getFirst();
        if (oldPriority != null && (values = theQueue.get(oldPriority)) != null) {
            values.remove(value);
            if (values.isEmpty()) {
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LongLinkedHashSet.java`
#### Snippet
```java
        @Override
        public long nextLong() {
            final Entry result = last = e;
            e = result.previous;
            return result.key;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LongLinkedHashSet.java`
#### Snippet
```java
        }
        allocateTable(HashUtil.getCeilingPrime((int) (capacity / loadFactor)));
        top = back = null;
        this.capacity = capacity;
        size = 0;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntHashMap.java`
#### Snippet
```java
        @Override
        protected Entry<V> nextEntry() {
            final Entry<V> result = last = e;
            initNextEntry();
            return result;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LinkedHashSet.java`
#### Snippet
```java
        for (Entry<E> e = table[index]; e != null; e = e.hashNext) {
            final E entryKey;
            if ((entryKey = e.key) == key || entryKey.equals(key)) {
                return true;
            }
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LinkedHashSet.java`
#### Snippet
```java
        }
        allocateTable(HashUtil.getCeilingPrime((int) (capacity / loadFactor)));
        top = back = null;
        this.capacity = capacity;
        size = 0;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LinkedHashSet.java`
#### Snippet
```java
        @Override
        public E next() {
            final Entry<E> result = last = e;
            e = result.previous;
            return result.key;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LinkedHashSet.java`
#### Snippet
```java

        E entryKey;
        if ((entryKey = e.key) == key || entryKey.equals(key)) {
            table[index] = e.hashNext;
        } else {
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LinkedHashSet.java`
#### Snippet
```java
                e = e.hashNext;
                if (e == null) return false;
                if ((entryKey = e.key) == key || entryKey.equals(key)) {
                    last.hashNext = e.hashNext;
                    break;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LinkedHashSet.java`
#### Snippet
```java
        for (Entry<E> e = table[index]; e != null; e = e.hashNext) {
            final E entryKey;
            if ((entryKey = e.key) == key || entryKey.equals(key)) {
                return false;
            }
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntLinkedHashMap.java`
#### Snippet
```java
        @Override
        protected Entry<V> nextEntry() {
            final Entry<V> result = last = e;
            e = result.next;
            return result;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntLinkedHashMap.java`
#### Snippet
```java
        }
        allocateTable(HashUtil.getCeilingPrime((int) (capacity / loadFactor)));
        top = back = null;
        this.capacity = capacity;
        _size = 0;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashSet.java`
#### Snippet
```java

        E entryKey;
        if ((entryKey = e.key) == key || entryKey.equals(key)) {
            table[index] = e.hashNext;
        } else {
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashSet.java`
#### Snippet
```java
                e = e.hashNext;
                if (e == null) return false;
                if ((entryKey = e.key) == key || entryKey.equals(key)) {
                    last.hashNext = e.hashNext;
                    break;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashSet.java`
#### Snippet
```java

        protected Entry<E> nextEntry() {
            final Entry<E> result = last = e;
            initNextEntry();
            return result;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashSet.java`
#### Snippet
```java
        for (Entry<E> e = table[index]; e != null; e = e.hashNext) {
            final E entryKey;
            if ((entryKey = e.key) == key || entryKey.equals(key)) {
                return false;
            }
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashSet.java`
#### Snippet
```java
        for (Entry<E> e = table[index]; e != null; e = e.hashNext) {
            final E entryKey;
            if ((entryKey = e.key) == key || entryKey.equals(key)) {
                return true;
            }
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LongHashSet.java`
#### Snippet
```java

        protected Entry nextEntry() {
            final Entry result = last = e;
            initNextEntry();
            return result;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LongLinkedHashMap.java`
#### Snippet
```java
        }
        allocateTable(HashUtil.getCeilingPrime((int) (capacity / loadFactor)));
        top = back = null;
        this.capacity = capacity;
        _size = 0;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LongLinkedHashMap.java`
#### Snippet
```java
        @Override
        protected Entry<V> nextEntry() {
            final Entry<V> result = last = e;
            e = result.next;
            return result;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LinkedHashMap.java`
#### Snippet
```java
        for (Entry<K, V> e = table[index]; e != null; e = e.hashNext) {
            final K entryKey;
            if ((entryKey = e.key) == key || entryKey.equals(key)) {
                moveToTop(e);
                return e.setValue(value);
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LinkedHashMap.java`
#### Snippet
```java
        }
        allocateTable(HashUtil.getCeilingPrime((int) (capacity / loadFactor)));
        top = back = null;
        this.capacity = capacity;
        _size = 0;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LinkedHashMap.java`
#### Snippet
```java

        K entryKey;
        if ((entryKey = e.key) == key || entryKey.equals(key)) {
            table[index] = e.hashNext;
        } else {
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LinkedHashMap.java`
#### Snippet
```java
                e = e.hashNext;
                if (e == null) return null;
                if ((entryKey = e.key) == key || entryKey.equals(key)) {
                    last.hashNext = e.hashNext;
                    break;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LinkedHashMap.java`
#### Snippet
```java
        for (Entry<K, V> e = table[index]; e != null; e = e.hashNext) {
            final K entryKey;
            if ((entryKey = e.key) == key || entryKey.equals(key)) {
                moveToTop(e);
                return e;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LinkedHashMap.java`
#### Snippet
```java
        @Override
        protected Entry<K, V> nextEntry() {
            final Entry<K, V> result = last = e;
            e = result.next;
            return result;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashMap.java`
#### Snippet
```java
        @Override
        protected Entry<K, V> nextEntry() {
            final Entry<K, V> result = last = e;
            initNextEntry();
            return result;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashMap.java`
#### Snippet
```java

        K entryKey;
        if ((entryKey = e.key) == key || entryKey.equals(key)) {
            table[index] = e.hashNext;
        } else {
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashMap.java`
#### Snippet
```java
                e = e.hashNext;
                if (e == null) return null;
                if ((entryKey = e.key) == key || entryKey.equals(key)) {
                    last.hashNext = e.hashNext;
                    break;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashMap.java`
#### Snippet
```java
        for (Entry<K, V> e = table[index]; e != null; e = e.hashNext) {
            final K entryKey;
            if ((entryKey = e.key) == key || entryKey.equals(key)) {
                return e.setValue(value);
            }
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashMap.java`
#### Snippet
```java
        for (Entry<K, V> e = table[index]; e != null; e = e.hashNext) {
            final K entryKey;
            if ((entryKey = e.key) == key || entryKey.equals(key)) {
                return e;
            }
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentHashSet.java`
#### Snippet
```java
        @Override
        public boolean flag() {
            return flagged = true;
        }

```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/util/SpinAllocator.java`
#### Snippet
```java
                T result = objects[i];
                if (result == null) {
                    objects[i] = result = creator.createInstance();
                }
                return result;
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentLinkedHashMap.java`
#### Snippet
```java
                int removed = 0;
                PersistentLongMap.Entry<K> min;
                while ((min = queueMutable.getMinimum()) != null) {
                    if (removed >= 50) {
                        break; // prevent looping on implementation errors
```

### NestedAssignment
Result of assignment expression used
in `openAPI/src/main/java/jetbrains/exodus/bindings/CompressedUnsignedLongArrayByteIterable.java`
#### Snippet
```java
                            data = longs[++i];
                        }
                        return (byte) ((data >> (bits -= 8)) & 0xff);
                    }

```

### NestedAssignment
Result of assignment expression used
in `openAPI/src/main/java/jetbrains/exodus/bindings/LongBinding.java`
#### Snippet
```java
        int bits = bytesPerLong << 3;
        while (bits > 0) {
            output.write((int) (l >> (bits -= 8) & 0xff));
        }
    }
```

### NestedAssignment
Result of assignment expression used
in `samples/src/main/java/jetbrains/exodus/entitystore/PersistentStoreExample.java`
#### Snippet
```java
        String line;
        try (BufferedReader contentReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(content)))) {
            while ((line = contentReader.readLine()) != null) {
                System.out.println("\t" + line);
            }
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/io/SharedOpenFilesCache.java`
#### Snippet
```java
                result = theCache;
                if (result == null) {
                    result = theCache = new SharedOpenFilesCache(cacheSize);
                }
            }
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/io/SharedMappedFilesCache.java`
#### Snippet
```java
        SharedMappedByteBuffer obsolete;
        while (true) {
            while ((obsolete = obsoleteQueue.poll()) != null) {
                obsolete.close();
            }
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/log/LogTip.java`
#### Snippet
```java
        this.pageAddress = pageAddress;
        this.count = -1;
        this.highAddress = this.approvedHighAddress = highAddress;
        this.blockSet = new BlockSet.Immutable(fileLengthBound); // no files
    }
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/log/CompressedUnsignedLongByteIterable.java`
#### Snippet
```java
        while (true) {
            final byte b = (byte) (l & 0x7f);
            if ((l >>= 7) == 0) {
                output.write(b | 0x80);
                break;
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/log/CompressedUnsignedLongByteIterable.java`
#### Snippet
```java
                byte b = (byte) (l & 0x7f);
                l >>= 7;
                if (!(goon = l > 0)) {
                    b |= 0x80;
                }
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/TreeCursorMutable.java`
#### Snippet
```java
            }
            moveToPair(moveToKey, moveToValue);
            moveToKey = moveToValue = null;
        }
    }
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/btree/InternalPage.java`
#### Snippet
```java
        super.loadAddressLengths(length, it);
        it.skip(((long) size) * keyAddressLen);
        checkAddressLength(childAddressLen = it.next());
    }

```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/log/BufferedDataWriter.java`
#### Snippet
```java
        currentPage.xxHash64.close();

        return this.currentPage = new MutablePage(pageData,
                currentPage.pageAddress + pageSize, pageData.length);
    }

```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/log/BufferedDataWriter.java`
#### Snippet
```java
        currentPage.xxHash64.close();

        currentPage = this.currentPage = new MutablePage(new byte[pageSize],
                currentPage.pageAddress + pageSize, 0);
        currentPage.xxHash64 = XX_HASH_FACTORY.newStreamingHash64(XX_HASH_SEED);

```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/log/BufferedDataWriter.java`
#### Snippet
```java
                            return;
                        }
                    } else if ((oldValue = writeCache.putIfAbsent(pageAddress, newValue)) == null) {
                        return;
                    } else {
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/log/BufferedDataWriter.java`
#### Snippet
```java
            this.bytes = page;
            this.pageAddress = pageAddress;
            committedCount = writtenCount = count;
            this.firstLoggable = -1;
        }
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/env/EnvironmentImpl.java`
#### Snippet
```java
                try {
                    resultingHighAddress = updatedHighAddress;
                    txn.setMetaTree(metaTree = MetaTreeImpl.create(this, updatedHighAddress, proto));
                    txn.executeCommitHook();
                } finally {
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/btree/BasePageImmutable.java`
#### Snippet
```java
    @NotNull ILeafNode getMaxKey() {
        if (maxKey != null) return maxKey;
        return maxKey = super.getMaxKey();
    }

```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/btree/BasePageImmutable.java`
#### Snippet
```java

    protected void loadAddressLengths(final int length, final ByteIterator it) {
        checkAddressLength(keyAddressLen = (byte) length);
    }

```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/btree/BasePageImmutable.java`
#### Snippet
```java
            @SuppressWarnings("ObjectAllocationInLoop")
            final BinarySearchIterator it = new BinarySearchIterator(adjustedPageSize);
            it.offset = offset = ((int) midAddress) & (cachePageSize - 1); // cache page size is always a power of 2
            final long pageAddress = midAddress - offset;
            if (pageAddress == leftAddress) {
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/btree/BasePageImmutable.java`
#### Snippet
```java
                it.page = rightPage;
            } else {
                it.page = leftPage = log.getCachedPage(pageAddress);
                leftAddress = pageAddress;
            }
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/btree/BasePageImmutable.java`
#### Snippet
```java
                    it.nextPage = rightPage;
                } else {
                    it.nextPage = rightPage = log.getCachedPage(nextPageAddress);
                    rightAddress = nextPageAddress;
                }
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/btree/BasePageImmutable.java`
#### Snippet
```java

            final int offset;
            it.offset = offset = ((int) midAddress) & (cachePageSize - 1); // cache page size is always a power of 2
            final long pageAddress = midAddress - offset;
            if (pageAddress == leftAddress) {
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/btree/BasePageImmutable.java`
#### Snippet
```java
                it.page = rightPage;
            } else {
                it.page = leftPage = log.getCachedPage(pageAddress);
                leftAddress = pageAddress;
            }
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/btree/BasePageImmutable.java`
#### Snippet
```java
                    it.nextPage = rightPage;
                } else {
                    it.nextPage = rightPage = log.getCachedPage(nextPageAddress);
                    rightAddress = nextPageAddress;
                }
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/btree/BasePageImmutable.java`
#### Snippet
```java
    @NotNull ILeafNode getMinKey() {
        if (minKey != null) return minKey;
        return minKey = super.getMinKey();
    }

```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/btree/BottomPageMutable.java`
#### Snippet
```java
                    dupTree.mainTree = tree;

                    if (res = dupTree.delete(value)) {
                        tree.addExpiredLoggable(ln.getAddress());
                        lnm = LeafNodeDupMutable.convert(ln, tree, dupTree);
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverser.java`
#### Snippet
```java
    public INode moveDownToLast() {
        final BasePage child = getChildForMoveDown();
        return node = pushChild(new TreePos(currentNode, currentPos), child, child.size - 1);
    }

```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverser.java`
#### Snippet
```java
        ++currentPos;
        if (currentNode.isBottom()) {
            return node = handleLeafR(currentNode.getKey(currentPos));
        } else {
            return node = ILeafNode.EMPTY;
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverser.java`
#### Snippet
```java
            return node = handleLeafR(currentNode.getKey(currentPos));
        } else {
            return node = ILeafNode.EMPTY;
        }
    }
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverser.java`
#### Snippet
```java
    @NotNull
    public INode moveDown() {
        return node = pushChild(new TreePos(currentNode, currentPos), getChildForMoveDown(), 0);
    }

```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverser.java`
#### Snippet
```java
        --currentPos;
        if (currentNode.isBottom()) {
            return node = handleLeafL(currentNode.getKey(currentPos));
        } else {
            return node = ILeafNode.EMPTY;
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverser.java`
#### Snippet
```java
            return node = handleLeafL(currentNode.getKey(currentPos));
        } else {
            return node = ILeafNode.EMPTY;
        }
    }
```

### NestedAssignment
Result of assignment expression used
in `environment/src/main/java/jetbrains/exodus/tree/patricia/ChildReferenceTransient.java`
#### Snippet
```java

    MutableNode mutate(@NotNull final PatriciaTreeMutable tree) {
        return (MutableNode) (child = child.getMutableCopy(tree));
    }
}
```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
                }
                treePos.pos--;
                return hasNext = true;
            }

```

### NestedAssignment
Result of assignment expression used
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
                }
                treePos.pos++;
                return hasNext = true;
            }

```

### NestedAssignment
Result of assignment expression used
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/SkipEntityIterable.java`
#### Snippet
```java
                EntityIteratorBase sourceIt = this.sourceIt;
                if (sourceIt == null) {
                    this.sourceIt = sourceIt = (EntityIteratorBase) source.iterator();
                    sourceIt.skip(itemsToSkip);
                }
```

### NestedAssignment
Result of assignment expression used
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/PropertiesIterable.java`
#### Snippet
```java
            this.ascending = ascending;
            //noinspection AssignmentUsedAsCondition
            if (hasNext = getNext(secondaryIndex)) {
                final long entityLocalId = LongBinding.compressedEntryToLong(secondaryIndex.getValue());
                final ByteIterable value = primaryIndex.getSearchKey(
```

### NestedAssignment
Result of assignment expression used
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/PropertiesIterable.java`
#### Snippet
```java
                final ByteIterable value = primaryIndex.getSearchKey(
                    PropertyKey.propertyKeyToEntry(new PropertyKey(entityLocalId, propertyId)));
                if ((hasNext = value != null)) {
                    final PropertyValue propertyValue = getStore().getPropertyTypes().entryToPropertyValue(value);
                    if (propertyValue.getType().getTypeId() != ComparableValueType.COMPARABLE_SET_VALUE_TYPE) {
```

### NestedAssignment
Result of assignment expression used
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIdArrayCachedInstanceIterableFactory.java`
#### Snippet
```java
                                if (lastTypeId > nextTypeId || lastTypeId == nextTypeId && lastLocalId > nextLocalId) {
                                    final int length;
                                    if (nextTypeId == NULL_TYPE_ID && (length = localIds.size()) <= 1) {
                                        if (length == 1) { // direct conversion
                                            onlyOneTypeId = false;
```

### NestedAssignment
Result of assignment expression used
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/iterator/ReverseEntityIdArrayIteratorMultiTypeIdUnpacked.java`
#### Snippet
```java
    public EntityId getLast() {
        final int typeId;
        if (localIds.length == 0 || (typeId = typeIds[0]) == NULL_TYPE_ID) {
            return null;
        }
```

### NestedAssignment
Result of assignment expression used
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/iterator/ReverseEntityIdArrayIteratorMultiTypeIdPacked.java`
#### Snippet
```java
    public EntityId getLast() {
        final int typeId;
        if (localIds.length == 0 || (typeId = typeIds[0]) == NULL_TYPE_ID) {
            return null;
        }
```

### NestedAssignment
Result of assignment expression used
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/iterator/EntityIdArrayIteratorMultiTypeIdUnpacked.java`
#### Snippet
```java
        final int typeId;
        final int count = localIds.length;
        if (count == 0 || (typeId = typeIds[typeIds.length - 1]) == NULL_TYPE_ID) {
            return null;
        }
```

### NestedAssignment
Result of assignment expression used
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/iterator/EntityIdArrayIteratorMultiTypeIdPacked.java`
#### Snippet
```java
        final int typeId;
        final int count = localIds.length;
        if (count == 0 || (typeId = typeIds[typeIds.length - 2]) == NULL_TYPE_ID) {
            return null;
        }
```

### NestedAssignment
Result of assignment expression used
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
        blobStringsCache = createObjectCache(config.getTransactionBlobStringsCacheSize());
        localCache = source.localCache;
        localCacheAttempts = localCacheHits = 0;
        switch (txnType) {
            case Regular:
```

### NestedAssignment
Result of assignment expression used
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
        linksCache = createObjectCache(config.getTransactionLinksCacheSize());
        blobStringsCache = createObjectCache(config.getTransactionBlobStringsCacheSize());
        localCacheAttempts = localCacheHits = 0;
        txn = ((EnvironmentImpl) store.getEnvironment()).beginTransactionAt(highAddress);
    }
```

### NestedAssignment
Result of assignment expression used
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
        linksCache = createObjectCache(config.getTransactionLinksCacheSize());
        blobStringsCache = createObjectCache(config.getTransactionBlobStringsCacheSize());
        localCacheAttempts = localCacheHits = 0;
        final Runnable beginHook = getRevertCachesBeginHook();
        final Environment env = store.getEnvironment();
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `type` is accessed in both synchronized and unsynchronized contexts
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java

    private final AtomicReference<ModelMetaData> modelMetaData;
    private String type = null;
    private String superType = null;
    private final Set<String> interfaces = new LinkedHashSetDecorator<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `externalAssociationEnds` is accessed in both synchronized and unsynchronized contexts
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
    private final Set<String> subTypes = new LinkedHashSetDecorator<>();
    private List<String> thisAndSuperTypes = Collections.emptyList();
    private Set<AssociationEndMetaData> externalAssociationEnds = null;
    private final Map<String, PropertyMetaData> properties = new HashMapDecorator<>();
    private Set<Index> ownIndexes = Collections.emptySet();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lastAdjustedTotal` is accessed in both synchronized and unsynchronized contexts
in `openAPI/src/main/java/jetbrains/exodus/management/StatisticsItem.java`
#### Snippet
```java
    private double mean; // total per second
    private long lastAdjustTime;
    private long lastAdjustedTotal;

    public StatisticsItem(@NotNull final Statistics statistics) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `total` is accessed in both synchronized and unsynchronized contexts
in `openAPI/src/main/java/jetbrains/exodus/management/StatisticsItem.java`
#### Snippet
```java
    @NotNull
    private final WeakReference<Statistics> statisticsRef;
    private long total;
    private double mean; // total per second
    private long lastAdjustTime;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `cacheSize` is accessed in both synchronized and unsynchronized contexts
in `environment/src/main/java/jetbrains/exodus/io/SharedOpenFilesCache.java`
#### Snippet
```java

    private static final Object syncObject = new Object();
    private static int cacheSize = 0;
    private static volatile SharedOpenFilesCache theCache = null;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `throwableOnClose` is accessed in both synchronized and unsynchronized contexts
in `environment/src/main/java/jetbrains/exodus/env/EnvironmentImpl.java`
#### Snippet
```java
     */
    volatile Throwable throwableOnCommit;
    private Throwable throwableOnClose;

    @Nullable
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `metaTree` is accessed in both synchronized and unsynchronized contexts
in `environment/src/main/java/jetbrains/exodus/env/EnvironmentImpl.java`
#### Snippet
```java
    private final EnvironmentConfig ec;
    private BTreeBalancePolicy balancePolicy;
    private MetaTreeImpl metaTree;
    private final AtomicInteger structureId;
    @NotNull
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `storeGetCache` is accessed in both synchronized and unsynchronized contexts
in `environment/src/main/java/jetbrains/exodus/env/EnvironmentImpl.java`
#### Snippet
```java
    private final LinkedList<RunnableWithTxnRoot> txnSafeTasks;
    @Nullable
    private StoreGetCache storeGetCache;
    private final EnvironmentSettingsListener envSettingsListener;
    private final GarbageCollector gc;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `cache` is accessed in both synchronized and unsynchronized contexts
in `entity-store/src/main/java/jetbrains/exodus/entitystore/OpenTablesCache.java`
#### Snippet
```java
    private final TableCreator creator;
    private final Object lock;
    private IntHashMap<Table> cache;

    OpenTablesCache(@NotNull final TableCreator creator) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `blobVault` is accessed in both synchronized and unsynchronized contexts
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
    @NotNull
    private final StoreNamingRules namingRulez;
    private BlobVault blobVault;

    @NotNull
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `closeEnvironment` is accessed in both synchronized and unsynchronized contexts
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
    @NotNull
    private final Environment environment;
    private boolean closeEnvironment;
    @NotNull
    private final DataReaderWriterProvider readerWriterProvider;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `sequences` is accessed in both synchronized and unsynchronized contexts
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
    private Store blobFileLengths;
    private Store internalSettings;
    private Store sequences;

    @NotNull
```

## RuleId[ruleID=CanBeParameter]
### CanBeParameter
Constructor parameter is never used as a property
in `entity-store/src/main/kotlin/jetbrains/exodus/entitystore/tables/FieldIndex.kt`
#### Snippet
```java

private class StoreFieldIndexIterator(
    val txn: Transaction,
    val store: Store,
    val fieldId: Int
```

### CanBeParameter
Constructor parameter is never used as a property
in `entity-store/src/main/kotlin/jetbrains/exodus/entitystore/tables/FieldIndex.kt`
#### Snippet
```java
    val txn: Transaction,
    val store: Store,
    val fieldId: Int
) : Iterator<Pair<Int, Long>> {

```

## RuleId[ruleID=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/Root.java`
#### Snippet
```java
import jetbrains.exodus.query.metadata.ModelMetaData;

public class Root extends UnaryNode {
    public Root(final NodeBase child) {
        super(child);
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/And.java`
#### Snippet
```java
import java.util.Iterator;

public class And extends CommutativeOperator {

    private static final boolean traceFindLinks = Boolean.getBoolean("jetbrains.exodus.query.traceFindLinks");
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/PropertyNotNull.java`
#### Snippet
```java
import static jetbrains.exodus.query.Utils.safe_equals;

public class PropertyNotNull extends NodeBase {
    private final String name;

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/LinkNotNull.java`
#### Snippet
```java
import static jetbrains.exodus.query.Utils.safe_equals;

public class LinkNotNull extends NodeBase {
    private final String name;

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/PropertyContains.java`
#### Snippet
```java
import static jetbrains.exodus.query.Utils.safe_equals;

public class PropertyContains extends NodeBase {

    private final String name;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/Concat.java`
#### Snippet
```java
import static jetbrains.exodus.query.Utils.safe_equals;

public class Concat extends BinaryOperator {
    private Sorts leftSorts;
    private Sorts rightSorts;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/Sort.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public abstract class Sort extends UnaryNode {
    static final int MAX_NESTED_SORTS = 4;

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/MergePropertyRanges.java`
#### Snippet
```java


class MergePropertyRanges extends ConversionWildcard<And> {
    /**
     * Create a wildcard node of type {@code t}.
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/GetAll.java`
#### Snippet
```java
import jetbrains.exodus.query.metadata.ModelMetaData;

public class GetAll extends NodeBase {

    @Override
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/Minus.java`
#### Snippet
```java
import jetbrains.exodus.query.metadata.ModelMetaData;

public class Minus extends BinaryOperator {
    public Minus(final NodeBase left, final NodeBase right) {
        super(left, right);
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/PropertyRange.java`
#### Snippet
```java
import static jetbrains.exodus.query.Utils.safe_equals;

public class PropertyRange extends NodeBase {

    private final String name;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/LinkEqualToLinkNotNull.java`
#### Snippet
```java
 * {@code to} field of the matched {@code LinkEqual} must be null
 */
class LinkEqualToLinkNotNull extends ConversionWildcard<LinkEqual> {
    /**
     * Create a wildcard node of type {@code t}.
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/PropertyEqual.java`
#### Snippet
```java
import static jetbrains.exodus.query.Utils.safe_equals;

public class PropertyEqual extends NodeBase {

    private final String name;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/NodeBase.java`
#### Snippet
```java

@SuppressWarnings("HardcodedLineSeparator")
public abstract class NodeBase {
    protected static final List<NodeBase> NO_CHILDREN = Collections.emptyList();
    static final String TREE_LEVEL_INDENT = "  ";
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/UnaryNot.java`
#### Snippet
```java
import jetbrains.exodus.query.metadata.ModelMetaData;

public class UnaryNot extends UnaryNode {
    public UnaryNot(final NodeBase child) {
        super(child);
```

### EqualsAndHashcode
Class has `hashCode()` defined but does not define `equals()`
in `query/src/main/java/jetbrains/exodus/query/ConversionWildcard.java`
#### Snippet
```java
 * Matched node is substituted by {@code convert(matched)}.
 */
abstract class ConversionWildcard<E extends NodeBase> extends NodeBase {
    final int type;

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/PropertyEqualToPropertyNoNull.java`
#### Snippet
```java
 * {@code to} field of the matched {@code LinkEqual} must be null
 */
class PropertyEqualToPropertyNoNull extends ConversionWildcard<PropertyEqual> {
    /**
     * Create a wildcard node of type {@code t}.
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/GetLinks.java`
#### Snippet
```java
import static jetbrains.exodus.query.Utils.safe_equals;

public class GetLinks extends NodeBase {
    private final EntityId id;
    private final String linkName;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/PropertyStartsWith.java`
#### Snippet
```java
import static jetbrains.exodus.query.Utils.safe_equals;

public class PropertyStartsWith extends NodeBase {

    private final String name;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/Sorts.java`
#### Snippet
```java
import java.util.List;

public class Sorts {
    private List<Sort> sorts;

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/java/jetbrains/exodus/query/LinkEqual.java`
#### Snippet
```java
import static jetbrains.exodus.query.Utils.safe_equals;

public class LinkEqual extends NodeBase {

    private final String name;
```

### EqualsAndHashcode
Class has `hashCode()` defined but does not define `equals()`
in `utils/src/main/java/jetbrains/exodus/core/execution/DecoratorJob.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public abstract class DecoratorJob extends Job {

    @NotNull
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `utils/src/main/java/jetbrains/exodus/core/execution/Job.java`
#### Snippet
```java
import java.util.Date;

public abstract class Job {

    private JobProcessor processor;
```

### EqualsAndHashcode
Class has `hashCode()` defined but does not define `equals()`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
@SuppressWarnings({"UnusedDeclaration", "ThisEscapedInObjectConstruction", "VolatileLongOrDoubleField",
        "ObjectAllocationInLoop", "ReuseOfLocalVariable", "rawtypes"})
public class PersistentEntityStoreImpl implements PersistentEntityStore, FlushLog.Member {

    private static final Logger logger = LoggerFactory.getLogger(PersistentEntityStoreImpl.class);
```

## RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `environment/src/main/java/jetbrains/exodus/env/ContextualEnvironmentImpl.java`
#### Snippet
```java
            throw new ExodusException("Bitmap can't be opened on the store with duplicates");
        }
        final ContextualStoreImpl store = openStore(name.concat("#bitmap"), config);
        return new ContextualBitmapImpl(store);
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `environment/src/main/java/jetbrains/exodus/env/EnvironmentImpl.java`
#### Snippet
```java
            throw new ExodusException("Bitmap can't be opened at top of the store with duplicates");
        }
        final StoreImpl store = openStore(name.concat("#bitmap"), config, transaction);
        return new BitmapImpl(store);
    }
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
    private void updateIndexes() {
        if (indexes == null || fieldToIndexes == null) {
            synchronized (this) {
                Set<Index> currentIndexes = indexes;
                if (currentIndexes == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
    AssociationEndMetaData removeAssociationEndMetaData(String name) {
        try {
            synchronized (this) {
                AssociationEndMetaData a = findAssociationEndMetaData(name);
                if (a == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java

    void reset() {
        synchronized (this) {
            allSubTypes = null;
            incomingAssociations = null;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
        Ends result = ends;
        if (result == null) {
            synchronized (this) {
                result = ends;
                if (result == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
        List<String> result = allSubTypes;
        if (result == null) {
            synchronized (this) {
                result = allSubTypes;
                if (result == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java

    void addAssociationEndMetaData(AssociationEndMetaData end) {
        synchronized (this) {
            if (externalAssociationEnds == null) {
                externalAssociationEnds = new HashSet<>();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
    private void updateIncommingAssociations(ModelMetaData mmd) {
        if (incomingAssociations == null) {
            synchronized (this) {
                if (incomingAssociations == null) {
                    final HashMapDecorator<String, Set<String>> result = new HashMapDecorator<>();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/ReleaseLatch.java`
#### Snippet
```java
    public synchronized void acquire() throws InterruptedException {
        while (owner != null) {
            wait();
        }
        owner = Thread.currentThread();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/ReleaseLatch.java`
#### Snippet
```java
    public synchronized void release() {
        owner = null;
        notify();
    }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/ReleaseLatch.java`
#### Snippet
```java
    public synchronized boolean acquire(long timeout) throws InterruptedException {
        if (owner != null) {
            wait(timeout);
            if (owner != null) {
                return false;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/Semaphore.java`
#### Snippet
```java

        this.permits = resultingPermits;
        notifyAll();
    }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/Semaphore.java`
#### Snippet
```java
        while (this.permits < permits) {
            try {
                wait(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/DebugLatch.java`
#### Snippet
```java
        clearOwnerInfo();
        owner = null;
        notify();
    }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/DebugLatch.java`
#### Snippet
```java
        if (owner != null) {
            logOwner();
            wait(timeout);
            if (owner != null) {
                return false;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/DebugLatch.java`
#### Snippet
```java
        while (owner != null) {
            logOwner();
            wait();
        }
        owner = Thread.currentThread();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `utils/src/main/java/jetbrains/exodus/util/DeferredIO.java`
#### Snippet
```java
    public static JobProcessorAdapter getJobProcessor() {
        if (deferredIOProcessor == null) {
            synchronized (DeferredIO.class) {
                if (deferredIOProcessor == null) {
                    deferredIOProcessor = ThreadJobProcessorPool.getOrCreateJobProcessor("Exodus shared deferred I/O job processor");
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
        try {
            getAsyncProcessor().finish();
            synchronized (this) {
                blobVault.close();
                // by default, do not close underlying environment since it can be used also by another EntityStore or in a different way
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
The value `null` assigned to `this.parent` is never used
in `query/src/main/java/jetbrains/exodus/query/NodeBase.java`
#### Snippet
```java
    public void setParent(NodeBase parent) {
        if (this.parent != null) {
            this.parent = null;
        }
        this.parent = parent;
```

## RuleId[ruleID=RedundantSamConstructor]
### RedundantSamConstructor
Redundant SAM-constructor
in `query/src/main/kotlin/jetbrains/exodus/query/SortEngine.kt`
#### Snippet
```java
                    queryEngine.assertOperational()
                    queryEngine.persistentStore.andCheckCurrentTransaction.mergeSorted(iterables,
                            ComparableGetter { entity -> valueGetter.select(attach(entity)) }, comparator) as EntityIterableBase
                }
            }
```

### RedundantSamConstructor
Redundant SAM-constructor
in `utils/src/main/kotlin/jetbrains/exodus/util/IOUtil.kt`
#### Snippet
```java
        var sum = 0L
        if (recursive) {
            for (childDir in listFiles(dir, FileFilter { obj -> obj.isDirectory })) {
                sum += getDirectorySize(childDir, extension,  /*always true*/recursive)
            }
```

### RedundantSamConstructor
Redundant SAM-constructor
in `utils/src/main/kotlin/jetbrains/exodus/util/IOUtil.kt`
#### Snippet
```java
            }
        }
        for (file in listFiles(dir, FilenameFilter { _, name -> name.endsWith(extension) })) {
            sum += getAdjustedFileLength(file)
        }
```

## RuleId[ruleID=AssignmentUsedAsCondition]
### AssignmentUsedAsCondition
Assignment `res = dupTree.delete(value)` used as condition
in `environment/src/main/java/jetbrains/exodus/tree/btree/BottomPageMutable.java`
#### Snippet
```java
                    dupTree.mainTree = tree;

                    if (res = dupTree.delete(value)) {
                        tree.addExpiredLoggable(ln.getAddress());
                        lnm = LeafNodeDupMutable.convert(ln, tree, dupTree);
```

### AssignmentUsedAsCondition
Assignment `hasNext = value != null` used as condition
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/PropertiesIterable.java`
#### Snippet
```java
                final ByteIterable value = primaryIndex.getSearchKey(
                    PropertyKey.propertyKeyToEntry(new PropertyKey(entityLocalId, propertyId)));
                if ((hasNext = value != null)) {
                    final PropertyValue propertyValue = getStore().getPropertyTypes().entryToPropertyValue(value);
                    if (propertyValue.getType().getTypeId() != ComparableValueType.COMPARABLE_SET_VALUE_TYPE) {
```

## RuleId[ruleID=JoinDeclarationAndAssignment]
### JoinDeclarationAndAssignment
Can be joined with assignment
in `query/src/main/kotlin/jetbrains/exodus/query/SortEngine.kt`
#### Snippet
```java
            if (linkId < 0) return null
            val isPersistentEntity = entity is PersistentEntity
            val target: Entity?
            target = if (readOnlyTxn || isPersistentEntity) {
                val sourceId = entity.id
```

## RuleId[ruleID=RemoveExplicitTypeArguments]
### RemoveExplicitTypeArguments
Remove explicit type arguments
in `query/src/main/kotlin/jetbrains/exodus/query/InMemoryMergeSortIterableWithValueGetter.kt`
#### Snippet
```java

            init {
                src = arrayOfNulls<Entity>(1)
                for (entity in source) {
                    if (size >= src.size) {
```

### RemoveExplicitTypeArguments
Remove explicit type arguments
in `query/src/main/kotlin/jetbrains/exodus/query/InMemoryMergeSortIterable.kt`
#### Snippet
```java

            init {
                src = arrayOfNulls<Entity>(1)
                for (entity in this@InMemoryMergeSortIterable.src) {
                    if (size >= src.size) {
```

### RemoveExplicitTypeArguments
Remove explicit type arguments
in `utils/src/main/kotlin/jetbrains/exodus/util/UnsafeHolder.kt`
#### Snippet
```java

    fun <T> doPrivileged(f: () -> T): T {
        return AccessController.doPrivileged(PrivilegedExceptionAction<T> {
            f()
        })
```

## RuleId[ruleID=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `get()` overloads a compatible method of a superclass, when overriding might have been intended
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntHashMap.java`
#### Snippet
```java
    }

    public V get(final int key) {
        Entry<V> e = getEntry(key);
        return e == null ? null : e.value;
```

### MethodOverloadsParentMethod
Method `containsKey()` overloads a compatible method of a superclass, when overriding might have been intended
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntHashMap.java`
#### Snippet
```java
    }

    public boolean containsKey(final int key) {
        return getEntry(key) != null;
    }
```

### MethodOverloadsParentMethod
Method `get()` overloads a compatible method of a superclass, when overriding might have been intended
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntLinkedHashMap.java`
#### Snippet
```java
    }

    public V get(final int key) {
        Entry<V> e = getEntry(key);
        return e == null ? null : e.value;
```

### MethodOverloadsParentMethod
Method `containsKey()` overloads a compatible method of a superclass, when overriding might have been intended
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntLinkedHashMap.java`
#### Snippet
```java
    }

    public boolean containsKey(final int key) {
        return getEntry(key) != null;
    }
```

### MethodOverloadsParentMethod
Method `containsKey()` overloads a compatible method of a superclass, when overriding might have been intended
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LongLinkedHashMap.java`
#### Snippet
```java
    }

    public boolean containsKey(final long key) {
        return getEntry(key) != null;
    }
```

### MethodOverloadsParentMethod
Method `get()` overloads a compatible method of a superclass, when overriding might have been intended
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LongLinkedHashMap.java`
#### Snippet
```java
    }

    public V get(final long key) {
        Entry<V> e = getEntry(key);
        return e == null ? null : e.value;
```

## RuleId[ruleID=HasPlatformType]
### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `environment/src/main/kotlin/jetbrains/exodus/io/LockingManager.kt`
#### Snippet
```java
    }

    fun lockFilePath() = getLockFile().absolutePath


```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `environment/src/main/kotlin/jetbrains/exodus/io/FileDataWriter.kt`
#### Snippet
```java
    }

    fun lockFilePath() = lockingManager.lockFilePath()


```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `entity-store/src/main/kotlin/jetbrains/exodus/entitystore/util/EmptyEntityIdSet.kt`
#### Snippet
```java
    override fun count() = 0

    override fun getTypeSetSnapshot(typeId: Int) = LongSet.EMPTY

    override fun isEmpty() = true
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `lucene-directory/src/main/kotlin/jetbrains/exodus/lucene/ExodusDirectory.kt`
#### Snippet
```java
        FastSkippingBufferedChecksumIndexInput(openInput(name, context))

    override fun obtainLock(name: String) = NoLockFactory.INSTANCE.obtainLock(this, name)

    override fun getPendingDeletions(): MutableSet<String> = Collections.emptySet()
```

## RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `toByteArray()` overrides synchronized method
in `utils/src/main/java/jetbrains/exodus/util/LightByteArrayOutputStream.java`
#### Snippet
```java

    @Override
    public byte @NotNull [] toByteArray() {
        return buf;
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `size()` overrides synchronized method
in `utils/src/main/java/jetbrains/exodus/util/LightByteArrayOutputStream.java`
#### Snippet
```java

    @Override
    public int size() {
        return count;
    }
```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `owner` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/ReleaseLatch.java`
#### Snippet
```java
    @Override
    public synchronized void acquire() throws InterruptedException {
        while (owner != null) {
            wait();
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `owner` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/ReleaseLatch.java`
#### Snippet
```java
            wait();
        }
        owner = Thread.currentThread();
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `owner` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/ReleaseLatch.java`
#### Snippet
```java
    @Override
    public synchronized void release() {
        owner = null;
        notify();
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `owner` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/ReleaseLatch.java`
#### Snippet
```java
    @Override
    public synchronized boolean acquire(long timeout) throws InterruptedException {
        if (owner != null) {
            wait(timeout);
            if (owner != null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `owner` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/ReleaseLatch.java`
#### Snippet
```java
        if (owner != null) {
            wait(timeout);
            if (owner != null) {
                return false;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `owner` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/ReleaseLatch.java`
#### Snippet
```java
            }
        }
        owner = Thread.currentThread();
        return true;
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `owner` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/ReleaseLatch.java`
#### Snippet
```java
    @Override
    public synchronized boolean tryAcquire() {
        if (owner != null) {
            return false;
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `owner` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/ReleaseLatch.java`
#### Snippet
```java
            return false;
        }
        owner = Thread.currentThread();
        return true;
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `owner` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/ReleaseLatch.java`
#### Snippet
```java
    @Override
    public synchronized String getOwnerName() {
        return owner == null ? "no owner" : owner.getName();
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `owner` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/ReleaseLatch.java`
#### Snippet
```java
    @Override
    public synchronized String getOwnerName() {
        return owner == null ? "no owner" : owner.getName();
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `thread` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/Semaphore.java`
#### Snippet
```java
        }
        this.permits -= permits;
        thread = Thread.currentThread();
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `owner` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/DebugLatch.java`
#### Snippet
```java
    @Override
    public synchronized boolean tryAcquire() {
        if (owner != null) {
            logOwner();
            return false;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `owner` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/DebugLatch.java`
#### Snippet
```java
            return false;
        }
        owner = Thread.currentThread();
        gatherOwnerInfo();
        return true;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `owner` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/DebugLatch.java`
#### Snippet
```java
    public synchronized void release() {
        clearOwnerInfo();
        owner = null;
        notify();
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `owner` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/DebugLatch.java`
#### Snippet
```java
    @Override
    public synchronized boolean acquire(long timeout) throws InterruptedException {
        if (owner != null) {
            logOwner();
            wait(timeout);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `owner` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/DebugLatch.java`
#### Snippet
```java
            logOwner();
            wait(timeout);
            if (owner != null) {
                return false;
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `owner` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/DebugLatch.java`
#### Snippet
```java
            }
        }
        owner = Thread.currentThread();
        gatherOwnerInfo();
        return true;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `owner` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/DebugLatch.java`
#### Snippet
```java
    @Override
    public synchronized void acquire() throws InterruptedException {
        while (owner != null) {
            logOwner();
            wait();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `owner` accessed in synchronized context
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/DebugLatch.java`
#### Snippet
```java
            wait();
        }
        owner = Thread.currentThread();
        gatherOwnerInfo();
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `throwableOnCommit` accessed in synchronized context
in `environment/src/main/java/jetbrains/exodus/env/EnvironmentImpl.java`
#### Snippet
```java

                log.switchToReadOnlyMode();
                throwableOnCommit = t;

                throw ExodusException.toExodusException(t, errorMessage);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `throwableOnCommit` accessed in synchronized context
in `environment/src/main/java/jetbrains/exodus/env/EnvironmentImpl.java`
#### Snippet
```java
                        log.clear();
                        invalidateStoreGetCache();
                        throwableOnCommit = null;
                        final ExpiredLoggableCollection expired = ExpiredLoggableCollection.newInstance(log);
                        final Pair<MetaTreeImpl, Integer> meta = MetaTreeImpl.create(this, expired);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `throwableOnCommit` accessed in synchronized context
in `environment/src/main/java/jetbrains/exodus/env/EnvironmentImpl.java`
#### Snippet
```java
            }
            throwableOnClose = new EnvironmentClosedException();
            throwableOnCommit = throwableOnClose;
        }
        loggerDebug("Store get cache hit rate: " + ObjectCacheBase.formatHitRate(storeGetCacheHitRate));
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `crypto/src/main/kotlin/jetbrains/exodus/crypto/streamciphers/ChaChaStreamCipherProvider.kt`
#### Snippet
```java
 */
@Suppress("unused")
class ChaChaStreamCipherProvider : KeyAwareStreamCipherProvider() {

    override fun getId() = CHACHA_CIPHER_ID
```

### RedundantSuppression
Redundant suppression
in `crypto/src/main/kotlin/jetbrains/exodus/crypto/streamciphers/Salsa20StreamCipherProvider.kt`
#### Snippet
```java

@Suppress("unused")
class Salsa20StreamCipherProvider : KeyAwareStreamCipherProvider() {

    override fun getId() = SALSA20_CIPHER_ID
```

### RedundantSuppression
Redundant suppression
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java

    @SuppressWarnings("ConstantConditions")
    void deleteAllLinks(@NotNull final PersistentStoreTransaction txn, @NotNull final PersistentEntity from, final int linkId, @NotNull final EntityIterableBase existing) {
        final EntityIterator itr = existing.iterator();
        boolean deleted = false;
```

### RedundantSuppression
Redundant suppression
in `entity-store/src/main/java/jetbrains/exodus/entitystore/StoreNamingRules.java`
#### Snippet
```java
            builder.append(param);
        }
        //noinspection ConstantConditions
        return StringInterner.intern(builder.toString());
    }
```

### RedundantSuppression
Redundant suppression
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntitiesWithLinkSortedIterable.java`
#### Snippet
```java

    @SuppressWarnings({"MethodOverridesPrivateMethodOfSuperclass"})
    private Cursor openCursor(@NotNull final PersistentStoreTransaction txn) {
        return getStore().getLinksSecondIndexCursor(txn, oppositeEntityTypeId);
    }
```

### RedundantSuppression
Redundant suppression
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/PropertiesIterable.java`
#### Snippet
```java
                final long localId = handleChecker.getLocalId();
                if (oldValue instanceof ComparableSet || newValue instanceof ComparableSet) {
                    //noinspection ConstantConditions
                    final ComparableSet oldSet = (ComparableSet) oldValue;
                    final ComparableSet newSet = (ComparableSet) newValue;
```

### RedundantSuppression
Redundant suppression
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/SortIndirectIterable.java`
#### Snippet
```java
                        }
                        nullIterated = true;
                        //noinspection ConstantConditions
                        foundLinksIterator = //txn.getAll(entityType).intersectSavingOrder(source).
                                new FilterEntityTypeIterable(txn, sourceTypeId, source).
```

### RedundantSuppression
Redundant suppression
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/SortIndirectIterable.java`
#### Snippet
```java
                        if (link == null) {
                            nullIterated = true;
                            //noinspection ConstantConditions
                            foundLinksIterator = //txn.getAll(entityType).intersectSavingOrder(source).
                                    new FilterEntityTypeIterable(txn, sourceTypeId, source).
```

### RedundantSuppression
Redundant suppression
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/SortIterable.java`
#### Snippet
```java
                while (propertyValueIterator.hasNext()) {
                    // property-value index can't return null since there cannot be an entity with null id
                    //noinspection ConstantConditions
                    final long nextId = propertyValueIterator.nextId().getLocalId();
                    if (rightOrder.containsKey(nextId)) {
```

### RedundantSuppression
Redundant suppression
in `environment/src/main/java/jetbrains/exodus/env/StoreImpl.java`
#### Snippet
```java
    StoreImpl(@NotNull final EnvironmentImpl env, @NotNull final String name, @NotNull final TreeMetaInfo metaInfo) {
        this.environment = env;
        //noinspection ConstantConditions
        this.name = StringInterner.intern(name);
        this.metaInfo = metaInfo;
```

### RedundantSuppression
Redundant suppression
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeMutable.java`
#### Snippet
```java
    @SuppressWarnings({"ConstantConditions"})
    @Override
    public void cursorClosed(@NotNull final ITreeCursorMutable cursor) {
        extraBelongings.openCursors.remove(cursor);
    }
```

### RedundantSuppression
Redundant suppression
in `openAPI/src/main/java/jetbrains/exodus/AbstractConfig.java`
#### Snippet
```java
                                      final boolean defaultValue) {
        final String value = strategy.getProperty(propName);
        //noinspection deprecation,UnnecessaryBoxing,BooleanConstructorCall
        return value == null ? defaultValue : new Boolean("true".equalsIgnoreCase(value));
    }
```

### RedundantSuppression
Redundant suppression
in `openAPI/src/main/java/jetbrains/exodus/AbstractConfig.java`
#### Snippet
```java
        if (v != null) {
            try {
                //noinspection CachedNumberConstructorCall,deprecation,BoxingBoxedValue
                return new Integer(Integer.decode(v));
            } catch (NumberFormatException ignored) {
```

### RedundantSuppression
Redundant suppression
in `openAPI/src/main/java/jetbrains/exodus/AbstractConfig.java`
#### Snippet
```java
        if (v != null) {
            try {
                //noinspection CachedNumberConstructorCall,deprecation,BoxingBoxedValue
                return new Long(Long.decode(v));
            } catch (NumberFormatException ignored) {
```

### RedundantSuppression
Redundant suppression
in `openAPI/src/main/java/jetbrains/exodus/CompoundByteIteratorBase.java`
#### Snippet
```java
    public byte next() {
        hasNext();
        //noinspection ConstantConditions
        return current.next();
    }
```

### RedundantSuppression
Redundant suppression
in `openAPI/src/main/java/jetbrains/exodus/bindings/ComparableSetBinding.java`
#### Snippet
```java
        output.writeByte(type.getTypeId());
        final ComparableBinding itemBinding = type.getBinding();
        //noinspection Convert2Lambda
        set.forEach(new ComparableSet.Consumer() {
            @Override
```

### RedundantSuppression
Redundant suppression
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/Stack.java`
#### Snippet
```java

@SuppressWarnings({"CloneableClassInSecureContext", "CloneableClassWithoutClone", "ClassExtendsConcreteCollection"})
public class Stack<T> extends ArrayList<T> {

    private T last;
```

## RuleId[ruleID=RedundantVisibilityModifier]
### RedundantVisibilityModifier
Redundant visibility modifier
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/hash/LongHashMap.kt`
#### Snippet
```java
    }

    private inner class HashIterator internal constructor() : HashMapIterator() {

        private val table = this@LongHashMap.table
```

### RedundantVisibilityModifier
Redundant visibility modifier
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/hash/LongLongHashMap.kt`
#### Snippet
```java
    }

    private inner class HashIterator internal constructor() : HashMapIterator() {

        private val table = this@LongLongHashMap.table
```

### RedundantVisibilityModifier
Redundant visibility modifier
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongSet.kt`
#### Snippet
```java
    }

    private class ImmutableSet internal constructor(private val map: AbstractPersistent23Tree<Entry>,
                                                    private val size: Int,
                                                    private val bitsPerEntry: Int,
```

### RedundantVisibilityModifier
Redundant visibility modifier
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongSet.kt`
#### Snippet
```java
    }

    private open class ItemIterator internal constructor(private val iterator: Iterator<Entry>,
                                                         private val bitsPerEntry: Int,
                                                         private val isReversed: Boolean = false) : LongIterator {
```

### RedundantVisibilityModifier
Redundant visibility modifier
in `entity-store/src/main/kotlin/jetbrains/exodus/entitystore/iterate/EntitiesWithCertainLinkIterable.kt`
#### Snippet
```java
    }

    private inner class CachedLinksIterable internal constructor(txn: PersistentStoreTransaction,
                                                                 private val localIds: LongArray,
                                                                 private val targets: Array<EntityId>,
```

## RuleId[ruleID=RedundantSemicolon]
### RedundantSemicolon
Redundant semicolon
in `crypto/src/main/kotlin/jetbrains/exodus/crypto/convert/Util.kt`
#### Snippet
```java
        encryptFiles(strategy)
    } catch (t: Throwable) {
        strategy.onError(t);
        throw ExodusException.toExodusException(t, "Encrypted backup failed")
    } finally {
```

### RedundantSemicolon
Redundant semicolon
in `entity-store/src/main/kotlin/jetbrains/exodus/entitystore/PersistentEntityStoreRefactorings.kt`
#### Snippet
```java
            with(txn.environment) {
                if (storeExists(name, txn)) {
                    removeStore(name, txn);
                }
            }
```

### RedundantSemicolon
Redundant semicolon
in `entity-store/src/main/kotlin/jetbrains/exodus/entitystore/EntityIterableCache.kt`
#### Snippet
```java
            if (System.currentTimeMillis() - time <= max(config.entityIterableCacheCountsLifeTime, count)) {
                stats.incTotalCountHits()
                return count;
            }
            // count is expired
```

## RuleId[ruleID=ReplaceManualRangeWithIndicesCalls]
### ReplaceManualRangeWithIndicesCalls
Range could be replaced with '.indices' call
in `environment/src/main/kotlin/jetbrains/exodus/log/BlockSet.kt`
#### Snippet
```java
            current.iterator()
        }
        for (i in 0 until result.size) {
            result[i] = it.next().key.keyToAddress
        }
```

## RuleId[ruleID=PropertyName]
### PropertyName
Property name `_path` should start with a lowercase letter
in `crypto/src/main/kotlin/jetbrains/exodus/crypto/convert/ArchiveBackupableFactory.kt`
#### Snippet
```java
    private class ArchiveEntryFileDescriptor(val archive: ArchiveInputStream,
                                             val entry: ArchiveEntry,
                                             val _path: String,
                                             val _name: String,
                                             val size: Long = entry.size) : VirtualFileDescriptor {
```

### PropertyName
Property name `_name` should start with a lowercase letter
in `crypto/src/main/kotlin/jetbrains/exodus/crypto/convert/ArchiveBackupableFactory.kt`
#### Snippet
```java
                                             val entry: ArchiveEntry,
                                             val _path: String,
                                             val _name: String,
                                             val size: Long = entry.size) : VirtualFileDescriptor {
        private val canBeEncrypted = "version" != _name && "xd.lck" != _name
```

## RuleId[ruleID=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `samples/src/main/java/jetbrains/exodus/entitystore/PersistentStoreExample.java`
#### Snippet
```java
            try {
                post = createNewBlogPost(txn, "Xodus blog post",
                    new ByteArrayInputStream(SAMPLE_BLOG_POST.getBytes("UTF-8")));
            } catch (IOException e) {
                throw new RuntimeException(e);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIterableHandleBase.java`
#### Snippet
```java
        public void apply(@NotNull final String s) {
            try {
                for (final byte b : s.getBytes(UTF_8)) {
                    apply(b);
                }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIterableHandleBase.java`
#### Snippet
```java
            try {
                for (int i = 0; i < INTS.length; ++i) {
                    INTS[i] = Integer.toString(i).getBytes(UTF_8);
                }
            } catch (UnsupportedEncodingException e) {
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/jetbrains/exodus/env/EnvironmentReadWriteExample.java`
#### Snippet
```java
            final ByteIterable entry = store.get(txn, key);
            assert entry == value;
            System.out.println(entryToString(entry));
        });

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/jetbrains/exodus/entitystore/PersistentStoreExample.java`
#### Snippet
```java
            final EntityIterable blogs = txn.getAll(BLOG_ENTITY_TYPE_NAME);
            for (Entity blog : blogs) {
                System.out.println("Blog name: " + blog.getProperty("name"));
                final Iterable<Entity> blogItems = blog.getLinks("items");

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/jetbrains/exodus/entitystore/PersistentStoreExample.java`
#### Snippet
```java

    private static void printBlogItem(Entity item) throws IOException {
        System.out.println("\tPost title: " + item.getProperty("title"));
        final InputStream content = item.getBlob("content");
        System.out.println("\tPost content: ");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/jetbrains/exodus/entitystore/PersistentStoreExample.java`
#### Snippet
```java
        System.out.println("\tPost title: " + item.getProperty("title"));
        final InputStream content = item.getBlob("content");
        System.out.println("\tPost content: ");
        String line;
        try (BufferedReader contentReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(content)))) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/jetbrains/exodus/entitystore/PersistentStoreExample.java`
#### Snippet
```java
        try (BufferedReader contentReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(content)))) {
            while ((line = contentReader.readLine()) != null) {
                System.out.println("\t" + line);
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/jetbrains/exodus/env/Users.java`
#### Snippet
```java
            }

            System.out.println("Usage:");
            System.out.println("  Users <no params> - list all users;");
            System.out.println("  Users <username | email> - list users with specified username or email;");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/jetbrains/exodus/env/Users.java`
#### Snippet
```java

            System.out.println("Usage:");
            System.out.println("  Users <no params> - list all users;");
            System.out.println("  Users <username | email> - list users with specified username or email;");
            System.out.println("  Users <username> <e-mail> - register new user.");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/jetbrains/exodus/env/Users.java`
#### Snippet
```java
            System.out.println("Usage:");
            System.out.println("  Users <no params> - list all users;");
            System.out.println("  Users <username | email> - list users with specified username or email;");
            System.out.println("  Users <username> <e-mail> - register new user.");

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/jetbrains/exodus/env/Users.java`
#### Snippet
```java
            System.out.println("  Users <no params> - list all users;");
            System.out.println("  Users <username | email> - list users with specified username or email;");
            System.out.println("  Users <username> <e-mail> - register new user.");

        } finally {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/jetbrains/exodus/env/Users.java`
#### Snippet
```java
                long count = 0;
                while (cursor.getNext()) {
                    System.out.println(entryToString(cursor.getKey()) + ' ' + entryToString(cursor.getValue()));
                    ++count;
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/jetbrains/exodus/env/Users.java`
#### Snippet
```java
                    ++count;
                }
                System.out.println("Total users: " + count);
            }
        });
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/jetbrains/exodus/env/Users.java`
#### Snippet
```java
                }
            }
            System.out.println((exists ? "User is already registered: " : "New user registered: ") + username + " " + email);
        });
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/jetbrains/exodus/env/Users.java`
#### Snippet
```java
                            break;
                        }
                        System.out.println(entryToString(cursor.getValue()) + ' ' + key);
                    }
                    System.out.println("Total found: " + i);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/jetbrains/exodus/env/Users.java`
#### Snippet
```java
                        System.out.println(entryToString(cursor.getValue()) + ' ' + key);
                    }
                    System.out.println("Total found: " + i);
                } else if (cursor.getSearchKeyRange(emailEntry) != null) {
                    System.out.println(key + " not found, nearest candidates: ");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/jetbrains/exodus/env/Users.java`
#### Snippet
```java
                    System.out.println("Total found: " + i);
                } else if (cursor.getSearchKeyRange(emailEntry) != null) {
                    System.out.println(key + " not found, nearest candidates: ");
                    boolean hasNext = true;
                    for (; hasNext; hasNext = cursor.getNext()) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/jetbrains/exodus/env/Users.java`
#### Snippet
```java
                            break;
                        }
                        System.out.println(entryToString(cursor.getValue()) + ' ' + currentKey);
                    }
                } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/jetbrains/exodus/env/Users.java`
#### Snippet
```java
                    }
                } else {
                    System.out.println("Nothing found");
                }
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeBase.java`
#### Snippet
```java
    protected final RandomAccessLoggable getLoggable(long address) {
        if (address == 155869) {
            System.out.println();
        }
        return log.readNotNull(getDataIterator(address), address);
```

## RuleId[ruleID=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator never returns positive value
in `openAPI/src/main/java/jetbrains/exodus/ByteIterable.java`
#### Snippet
```java

        @Override
        public int compareTo(@NotNull ByteIterable right) {
            return right.iterator().hasNext() ? -1 : 0;
        }
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ObjectCacheDecorator()` of an abstract class should not be declared 'public'
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/ObjectCacheDecorator.java`
#### Snippet
```java
    private ObjectCacheBase<K, V> decorated;

    public ObjectCacheDecorator() {
        this(DEFAULT_SIZE);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ObjectCacheDecorator()` of an abstract class should not be declared 'public'
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/ObjectCacheDecorator.java`
#### Snippet
```java
    }

    public ObjectCacheDecorator(final int size, @NotNull final BooleanSupplier shouldCache) {
        super(size);
        this.shouldCache = shouldCache;
```

### NonProtectedConstructorInAbstractClass
Constructor `ObjectCacheDecorator()` of an abstract class should not be declared 'public'
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/ObjectCacheDecorator.java`
#### Snippet
```java
    }

    public ObjectCacheDecorator(final int size) {
        this(size, () -> true);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SoftLongObjectCacheBase()` of an abstract class should not be declared 'public'
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/SoftLongObjectCacheBase.java`
#### Snippet
```java
    private final int chunkSize;

    public SoftLongObjectCacheBase() {
        this(DEFAULT_SIZE);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SoftLongObjectCacheBase()` of an abstract class should not be declared 'public'
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/SoftLongObjectCacheBase.java`
#### Snippet
```java
    }

    public SoftLongObjectCacheBase(int cacheSize) {
        super(cacheSize);
        if (cacheSize < MIN_SIZE) {
```

### NonProtectedConstructorInAbstractClass
Constructor `TransactionBase()` of an abstract class should not be declared 'public'
in `environment/src/main/java/jetbrains/exodus/env/TransactionBase.java`
#### Snippet
```java
    private Runnable beforeTransactionFlushAction;

    public TransactionBase(@NotNull final EnvironmentImpl env, final boolean isExclusive) {
        this.env = env;
        this.creatingThread = Thread.currentThread();
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `position`
in `vfs/src/main/java/jetbrains/exodus/vfs/VfsOutputStream.java`
#### Snippet
```java
                    break;
                }
                position -= outputClusterSize;
                clusterIterator.moveToNext();
                loadCurrentCluster(clusteringStrategy.getNextClusterSize(outputCluster.length));
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `vfs/src/main/java/jetbrains/exodus/vfs/VfsOutputStream.java`
#### Snippet
```java
                position += len;
            } else {
                for (; len > 0; --len, ++off, ++position) {
                    final byte sourceByte = outputCluster[position];
                    final byte destByte = b[off];
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `vfs/src/main/java/jetbrains/exodus/vfs/VfsOutputStream.java`
#### Snippet
```java
                position += len;
            } else {
                for (; len > 0; --len, ++off, ++position) {
                    final byte sourceByte = outputCluster[position];
                    final byte destByte = b[off];
```

### AssignmentToMethodParameter
Assignment to method parameter `position`
in `vfs/src/main/java/jetbrains/exodus/vfs/VfsInputStream.java`
#### Snippet
```java
        final Cluster current = clusterIterator.getCurrent();
        if (current != null) {
            position -= current.getStartingPosition();
            final long skipped = current.skip(position);
            if (skipped != position) {
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vfs/src/main/java/jetbrains/exodus/vfs/VirtualFileSystem.java`
#### Snippet
```java

    private File doCreateFile(@NotNull final Transaction txn, final long fileDescriptor, @NotNull String path) {
        path = String.format(path, fileDescriptor);
        final ArrayByteIterable key = StringBinding.stringToEntry(path);
        final ByteIterable value = pathnames.get(txn, key);
```

### AssignmentToMethodParameter
Assignment to method parameter `root`
in `query/src/main/java/jetbrains/exodus/query/NodeBase.java`
#### Snippet
```java
    public static NodeBase getUnderRoot(NodeBase root) {
        while (root instanceof Root) {
            root = ((UnaryNode) root).getChild();
        }
        return root;
```

### AssignmentToMethodParameter
Assignment to method parameter `subtree`
in `query/src/main/java/jetbrains/exodus/query/NodeBase.java`
#### Snippet
```java
            boolean presentationUsed = !used && child.toString(childResult, TREE_LEVEL_INDENT + prefix, subtree, presentation);
            if (presentationUsed) {
                subtree = null;
                result.append(childResult);
            } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `iterable`
in `query/src/main/java/jetbrains/exodus/query/Sorts.java`
#### Snippet
```java
            }
            for (final Sort sort : sorts) {
                iterable = sort.applySort(entityType, iterable, sortEngine);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `cacheSize`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/SoftObjectCacheBase.java`
#### Snippet
```java
        super(cacheSize);
        if (cacheSize < MIN_SIZE) {
            cacheSize = MIN_SIZE;
        }
        //noinspection unchecked
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/LongArrayList.java`
#### Snippet
```java
    public long[] toArray(long[] a) {
        if (a.length < size) {
            a = new long[size];
        }
        System.arraycopy(data, 0, a, 0, size);
```

### AssignmentToMethodParameter
Assignment to method parameter `cacheSize`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/SoftLongObjectCacheBase.java`
#### Snippet
```java
        super(cacheSize);
        if (cacheSize < MIN_SIZE) {
            cacheSize = MIN_SIZE;
        }
        //noinspection unchecked
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/IntArrayList.java`
#### Snippet
```java
    public int[] toArray(int[] a) {
        if (a.length < size) {
            a = new int[size];
        }
        System.arraycopy(data, 0, a, 0, size);
```

### AssignmentToMethodParameter
Assignment to method parameter `capacity`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntHashSet.java`
#### Snippet
```java
    private void init(int capacity) {
        if (capacity < HashUtil.MIN_CAPACITY) {
            capacity = HashUtil.MIN_CAPACITY;
        }
        allocateTable(HashUtil.getCeilingPrime((int) (capacity / loadFactor)));
```

### AssignmentToMethodParameter
Assignment to method parameter `capacity`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LongLinkedHashSet.java`
#### Snippet
```java
    private void init(int capacity) {
        if (capacity < HashUtil.MIN_CAPACITY) {
            capacity = HashUtil.MIN_CAPACITY;
        }
        allocateTable(HashUtil.getCeilingPrime((int) (capacity / loadFactor)));
```

### AssignmentToMethodParameter
Assignment to method parameter `secondGenSizeRatio`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/LongObjectCache.java`
#### Snippet
```java
        lock = new ReentrantLock();
        if (secondGenSizeRatio < 0.05f) {
            secondGenSizeRatio = 0.05f;
        } else if (secondGenSizeRatio > 0.95f) {
            secondGenSizeRatio = 0.95f;
```

### AssignmentToMethodParameter
Assignment to method parameter `secondGenSizeRatio`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/LongObjectCache.java`
#### Snippet
```java
            secondGenSizeRatio = 0.05f;
        } else if (secondGenSizeRatio > 0.95f) {
            secondGenSizeRatio = 0.95f;
        }
        this.secondGenSizeRatio = secondGenSizeRatio;
```

### AssignmentToMethodParameter
Assignment to method parameter `capacity`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntHashMap.java`
#### Snippet
```java
    protected void init(int capacity) {
        if (capacity < HashUtil.MIN_CAPACITY) {
            capacity = HashUtil.MIN_CAPACITY;
        }
        allocateTable(HashUtil.getCeilingPrime((int) (capacity / loadFactor)));
```

### AssignmentToMethodParameter
Assignment to method parameter `capacity`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LinkedHashSet.java`
#### Snippet
```java
    private void init(int capacity) {
        if (capacity < HashUtil.MIN_CAPACITY) {
            capacity = HashUtil.MIN_CAPACITY;
        }
        allocateTable(HashUtil.getCeilingPrime((int) (capacity / loadFactor)));
```

### AssignmentToMethodParameter
Assignment to method parameter `hash`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashUtil.java`
#### Snippet
```java

    public static int indexFor(int hash, final int length, final int mask) {
        hash = (hash + (hash >>> 16)) & mask;
        /** The following statement is the same as
         *
```

### AssignmentToMethodParameter
Assignment to method parameter `hash`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashUtil.java`
#### Snippet
```java
         * but without branching.
         */
        hash -= length & (((hash - length) ^ 0x80000000) >> 31);
        return hash;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `capacity`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntLinkedHashMap.java`
#### Snippet
```java
    protected void init(int capacity) {
        if (capacity < HashUtil.MIN_CAPACITY) {
            capacity = HashUtil.MIN_CAPACITY;
        }
        allocateTable(HashUtil.getCeilingPrime((int) (capacity / loadFactor)));
```

### AssignmentToMethodParameter
Assignment to method parameter `secondGenSizeRatio`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/ObjectCache.java`
#### Snippet
```java
        lock = new ReentrantLock();
        if (secondGenSizeRatio < 0.05f) {
            secondGenSizeRatio = 0.05f;
        } else if (secondGenSizeRatio > 0.95f) {
            secondGenSizeRatio = 0.95f;
```

### AssignmentToMethodParameter
Assignment to method parameter `secondGenSizeRatio`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/ObjectCache.java`
#### Snippet
```java
            secondGenSizeRatio = 0.05f;
        } else if (secondGenSizeRatio > 0.95f) {
            secondGenSizeRatio = 0.95f;
        }
        this.secondGenSizeRatio = secondGenSizeRatio;
```

### AssignmentToMethodParameter
Assignment to method parameter `capacity`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashSet.java`
#### Snippet
```java
    private void init(int capacity) {
        if (capacity < HashUtil.MIN_CAPACITY) {
            capacity = HashUtil.MIN_CAPACITY;
        }
        allocateTable(HashUtil.getCeilingPrime((int) (capacity / loadFactor)));
```

### AssignmentToMethodParameter
Assignment to method parameter `capacity`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LongHashSet.java`
#### Snippet
```java
    private void init(int capacity) {
        if (capacity < HashUtil.MIN_CAPACITY) {
            capacity = HashUtil.MIN_CAPACITY;
        }
        allocateTable(HashUtil.getCeilingPrime((int) (capacity / loadFactor)));
```

### AssignmentToMethodParameter
Assignment to method parameter `capacity`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LongLinkedHashMap.java`
#### Snippet
```java
    protected void init(int capacity) {
        if (capacity < HashUtil.MIN_CAPACITY) {
            capacity = HashUtil.MIN_CAPACITY;
        }
        allocateTable(HashUtil.getCeilingPrime((int) (capacity / loadFactor)));
```

### AssignmentToMethodParameter
Assignment to method parameter `capacity`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LinkedHashMap.java`
#### Snippet
```java
    protected void init(int capacity) {
        if (capacity < HashUtil.MIN_CAPACITY) {
            capacity = HashUtil.MIN_CAPACITY;
        }
        allocateTable(HashUtil.getCeilingPrime((int) (capacity / loadFactor)));
```

### AssignmentToMethodParameter
Assignment to method parameter `capacity`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashMap.java`
#### Snippet
```java
        this.loadFactor = loadFactor;
        if (capacity < HashUtil.MIN_CAPACITY) {
            capacity = HashUtil.MIN_CAPACITY;
        }
        table = new Entry[tableSize];
```

### AssignmentToMethodParameter
Assignment to method parameter `capacity`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashMap.java`
#### Snippet
```java
    protected void init(int capacity) {
        if (capacity < HashUtil.MIN_CAPACITY) {
            capacity = HashUtil.MIN_CAPACITY;
        }
        allocateTable(HashUtil.getCeilingPrime((int) (capacity / loadFactor)));
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `utils/src/main/java/jetbrains/exodus/util/UTFUtil.java`
#### Snippet
```java
            final int c = value.charAt(i);
            if ((c >= 0x0001) && (c <= 0x007F)) {
                bytes[offset++] = (byte) c;
            } else if (c > 0x07FF) {
                bytes[offset++] = (byte) (0xE0 | ((c >> 12) & 0x0F));
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `utils/src/main/java/jetbrains/exodus/util/UTFUtil.java`
#### Snippet
```java
                bytes[offset++] = (byte) c;
            } else if (c > 0x07FF) {
                bytes[offset++] = (byte) (0xE0 | ((c >> 12) & 0x0F));
                bytes[offset++] = (byte) (0x80 | ((c >> 6) & 0x3F));
                bytes[offset++] = (byte) (0x80 | (c & 0x3F));
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `utils/src/main/java/jetbrains/exodus/util/UTFUtil.java`
#### Snippet
```java
            } else if (c > 0x07FF) {
                bytes[offset++] = (byte) (0xE0 | ((c >> 12) & 0x0F));
                bytes[offset++] = (byte) (0x80 | ((c >> 6) & 0x3F));
                bytes[offset++] = (byte) (0x80 | (c & 0x3F));
            } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `utils/src/main/java/jetbrains/exodus/util/UTFUtil.java`
#### Snippet
```java
                bytes[offset++] = (byte) (0xE0 | ((c >> 12) & 0x0F));
                bytes[offset++] = (byte) (0x80 | ((c >> 6) & 0x3F));
                bytes[offset++] = (byte) (0x80 | (c & 0x3F));
            } else {
                bytes[offset++] = (byte) (0xC0 | ((c >> 6) & 0x1F));
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `utils/src/main/java/jetbrains/exodus/util/UTFUtil.java`
#### Snippet
```java
                bytes[offset++] = (byte) (0x80 | (c & 0x3F));
            } else {
                bytes[offset++] = (byte) (0xC0 | ((c >> 6) & 0x1F));
                bytes[offset++] = (byte) (0x80 | (c & 0x3F));
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `utils/src/main/java/jetbrains/exodus/util/UTFUtil.java`
#### Snippet
```java
            } else {
                bytes[offset++] = (byte) (0xC0 | ((c >> 6) & 0x1F));
                bytes[offset++] = (byte) (0x80 | (c & 0x3F));
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `secondGenSizeRatio`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentObjectCache.java`
#### Snippet
```java
        this.size = size < ObjectCacheBase.MIN_SIZE ? ObjectCacheBase.MIN_SIZE : size;
        if (secondGenSizeRatio < 0.05f) {
            secondGenSizeRatio = 0.05f;
        } else if (secondGenSizeRatio > 0.95f) {
            secondGenSizeRatio = 0.95f;
```

### AssignmentToMethodParameter
Assignment to method parameter `secondGenSizeRatio`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentObjectCache.java`
#### Snippet
```java
            secondGenSizeRatio = 0.05f;
        } else if (secondGenSizeRatio > 0.95f) {
            secondGenSizeRatio = 0.95f;
        }
        secondGenSizeBound = (int) (size * secondGenSizeRatio);
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `openAPI/src/main/java/jetbrains/exodus/bindings/CompressedUnsignedLongArrayByteIterable.java`
#### Snippet
```java
        do {
            ++result;
            l >>= 8;
        } while (l > 0);
        return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `openAPI/src/main/java/jetbrains/exodus/bindings/LongBinding.java`
#### Snippet
```java
        for (int i = 0; i < 8; ++i) {
            bytes[i] = (int) (l & 0xff);
            l >>= 8;
        }
        int byteLen = 8;
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `openAPI/src/main/java/jetbrains/exodus/bindings/IntegerBinding.java`
#### Snippet
```java
        for (int j = 0; j < 4; ++j) {
            bytes[j] = i & 0xff;
            i >>= 8;
        }
        int byteLen = 4;
```

### AssignmentToMethodParameter
Assignment to method parameter `blobHandle`
in `openAPI/src/main/java/jetbrains/exodus/entitystore/BlobVault.java`
#### Snippet
```java
            }
            files.add(file);
            blobHandle >>= 8;
        }
        files.add(file);
```

### AssignmentToMethodParameter
Assignment to method parameter `address`
in `environment/src/main/java/jetbrains/exodus/log/LogUtil.java`
#### Snippet
```java
            throw new ExodusException("Starting address of a log file is badly aligned: " + address);
        }
        address /= LOG_BLOCK_ALIGNMENT;
        char[] name = new char[LOG_FILE_NAME_WITH_EXT_LENGTH];
        for (int i = 1; i <= LOG_FILE_NAME_LENGTH; i++) {
```

### AssignmentToMethodParameter
Assignment to method parameter `address`
in `environment/src/main/java/jetbrains/exodus/log/LogUtil.java`
#### Snippet
```java
        for (int i = 1; i <= LOG_FILE_NAME_LENGTH; i++) {
            name[LOG_FILE_NAME_LENGTH - i] = LOG_FILE_NAME_ALPHABET[(int) (address & 0x1f)];
            address >>= 5;
        }
        System.arraycopy(LOG_FILE_EXTENSION_CHARS, 0, name, LOG_FILE_NAME_LENGTH, LOG_FILE_EXTENSION_LENGTH);
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `environment/src/main/java/jetbrains/exodus/log/CompressedUnsignedLongByteIterable.java`
#### Snippet
```java
            return 2;
        }
        l >>= 21;
        int result = 3;
        while (l > 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `environment/src/main/java/jetbrains/exodus/log/CompressedUnsignedLongByteIterable.java`
#### Snippet
```java
        while (l > 0) {
            ++result;
            l >>= 7;
        }
        return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `environment/src/main/java/jetbrains/exodus/log/CompressedUnsignedLongByteIterable.java`
#### Snippet
```java
        while (true) {
            final byte b = (byte) (l & 0x7f);
            if ((l >>= 7) == 0) {
                output.write(b | 0x80);
                break;
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `environment/src/main/java/jetbrains/exodus/log/BufferedDataWriter.java`
#### Snippet
```java
            }

            len -= bytesToWrite;
            off += bytesToWrite;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `loggable`
in `environment/src/main/java/jetbrains/exodus/tree/btree/LeafNodeDup.java`
#### Snippet
```java
            }
            if (loggables.hasNext()) {
                loggable = loggables.next();
            } else {
                break;
```

### AssignmentToMethodParameter
Assignment to method parameter `low`
in `environment/src/main/java/jetbrains/exodus/tree/btree/BasePageMutable.java`
#### Snippet
```java
            int cmp = midKey.compareKeyTo(key);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `high`
in `environment/src/main/java/jetbrains/exodus/tree/btree/BasePageMutable.java`
#### Snippet
```java
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                // key found
```

### AssignmentToMethodParameter
Assignment to method parameter `low`
in `environment/src/main/java/jetbrains/exodus/tree/btree/BasePageImmutable.java`
#### Snippet
```java

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `environment/src/main/java/jetbrains/exodus/tree/btree/BasePageImmutable.java`
#### Snippet
```java

    protected final long getLong(int offset, int length) {
        offset += dataOffset;

        long result = 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `low`
in `environment/src/main/java/jetbrains/exodus/tree/btree/BasePageImmutable.java`
#### Snippet
```java
            final int cmp = tree.compareLeafToKey(leafAddress, key);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `low`
in `environment/src/main/java/jetbrains/exodus/tree/btree/BasePageImmutable.java`
#### Snippet
```java
            final int cmp = tree.compareLeafToKey(leafAddress, key);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `tmp`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/PatriciaTraverser.java`
#### Snippet
```java
            NodeChildrenIterator[] newStack = new NodeChildrenIterator[newCapacity];
            System.arraycopy(tmp, 0, newStack, 0, length);
            tmp = newStack;
        }
        tmp[depth] = itr;
```

### AssignmentToMethodParameter
Assignment to method parameter `root`
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeMutable.java`
#### Snippet
```java
    static BasePageMutable delete(BasePageMutable root, ByteIterable key, @Nullable ByteIterable value, boolean[] res) {
        if (root.delete(key, value)) {
            root = root.mergeWithChildren();
            res[0] = true;
            return root;
```

### AssignmentToMethodParameter
Assignment to method parameter `loggable`
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeMutable.java`
#### Snippet
```java
                break;
            }
            loggable = loggables.next();
            if (loggable.getAddress() >= nextFileAddress) {
                break;
```

### AssignmentToMethodParameter
Assignment to method parameter `blobHandle`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/FileSystemBlobVault.java`
#### Snippet
```java
        do {
            bytes[handleLen++] = (byte) (blobHandle & 0xff);
            blobHandle >>= 8;
        } while (blobHandle > 0);
        File dir = getVaultLocation();
```

### AssignmentToMethodParameter
Assignment to method parameter `binding`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/tables/PropertyTypes.java`
#### Snippet
```java
        final ComparableValueType type = getPropertyType((byte) (bytes[offset] ^ 0x80));
        if (binding == null) {
            binding = type.getBinding();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `typeId`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/tables/PropertyTypes.java`
#### Snippet
```java
                                           @NotNull final Class<? extends Comparable> clazz,
                                           @NotNull final ComparableBinding binding) {
        typeId += ComparableValueType.PREDEFINED_COMPARABLE_VALUE_TYPES.length;
        final ComparableValueType propType = new ComparableValueType(typeId, binding, clazz);
        if (typesById.put(typeId, propType) != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `blobHandle`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/FileSystemBlobVaultOld.java`
#### Snippet
```java
            }
            dir = new File(dir, file);
            blobHandle >>= 8;
        }
        if (!readonly) {
```

### AssignmentToMethodParameter
Assignment to method parameter `number`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIteratorBase.java`
#### Snippet
```java
        }
        checkDisposed();
        while (number-- > 0 && hasNextImpl()) {
            nextIdImpl();
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
        // check if the target is already deleted
        if (config.isDebugTestLinkedEntities()) {
            target = getEntityAssertPhantomLink(txn, target.getId());
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `blobHandle`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
        if (!useVersion1Format()) {
            if (blobHandle == EMPTY_BLOB_HANDLE)
                blobHandle = 0L;
            else if (blobHandle == IN_PLACE_BLOB_HANDLE)
                blobHandle = 1L;
```

### AssignmentToMethodParameter
Assignment to method parameter `blobHandle`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
                blobHandle = 0L;
            else if (blobHandle == IN_PLACE_BLOB_HANDLE)
                blobHandle = 1L;
            else if (blobHandle == IN_PLACE_BLOB_REFERENCE_HANDLE)
                blobHandle = 2L;
```

### AssignmentToMethodParameter
Assignment to method parameter `blobHandle`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
                blobHandle = 1L;
            else if (blobHandle == IN_PLACE_BLOB_REFERENCE_HANDLE)
                blobHandle = 2L;
            else
                blobHandle += BLOB_HANDLE_ADDEND;
```

### AssignmentToMethodParameter
Assignment to method parameter `blobHandle`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
                blobHandle = 2L;
            else
                blobHandle += BLOB_HANDLE_ADDEND;
        }
        return LongBinding.longToCompressedEntry(blobHandle);
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
        // check if the target is already deleted
        if (target != null && config.isDebugTestLinkedEntities()) {
            target = getEntityAssertPhantomLink(txn, target.getId());
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `line`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIterableBase.java`
#### Snippet
```java
        int childIndent = indent + INDENT.length();
        ArrayList<Integer> result = new ArrayList<>();
        while (++line < presentation.length) {
            int lineIndent = getIndent(presentation[line]);
            if (lineIndent == childIndent) {
```

### AssignmentToMethodParameter
Assignment to method parameter `number`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/iterator/ReverseOrderedEntityIdCollectionIterator.java`
#### Snippet
```java
    @Override
    public boolean skip(int number) {
        while (number-- > 0 && sourceIterator.hasNext()) {
            nextIdImpl();
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `number`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/iterator/OrderedEntityIdCollectionIterator.java`
#### Snippet
```java
    @Override
    public boolean skip(int number) {
        while (number-- > 0 && sourceIterator.hasNext()) {
            nextIdImpl();
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `address`
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/DirUtil.java`
#### Snippet
```java
        for (int i = 1; i <= LUCENE_FILE_NAME_LENGTH; i++) {
            name[LUCENE_FILE_NAME_LENGTH - i] = LUCENE_FILE_NAME_ALPHABET[(int) (address & 0x1f)];
            address >>= 5;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/XodusDirectory.java`
#### Snippet
```java

        if (diff > spaceLeftInPage) {
            start += spaceLeftInPage;
            var pages = (end - start + pageSize - 1) / pageSize;

```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/XodusDirectory.java`
#### Snippet
```java
            var spaceLeftInPage = pageSize - (position & (pageSize - 1));
            if (len >= spaceLeftInPage) {
                len -= spaceLeftInPage;

                var dataPageSize = pageSize - Long.BYTES;
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/XodusDirectory.java`
#### Snippet
```java
                                final int chunk = Math.min(length, CHUNK_SIZE);
                                out.write(b, offset, chunk);
                                length -= chunk;
                                offset += chunk;
                            }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/XodusDirectory.java`
#### Snippet
```java
                                out.write(b, offset, chunk);
                                length -= chunk;
                                offset += chunk;
                            }
                        }
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/XodusDirectory.java`
#### Snippet
```java
            }

            b = cipher.crypt((byte) b);

            out.write(b);
```

### AssignmentToMethodParameter
Assignment to method parameter `pos`
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/XodusDirectory.java`
#### Snippet
```java
        @Override
        public void seek(long pos) throws IOException {
            pos = addWithIvSpace(basePosition, pos);

            if (pos > end) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/XodusDirectory.java`
#### Snippet
```java

        public void write(byte @NotNull [] b, int off, int len) throws IOException {
            b = Arrays.copyOfRange(b, off, off + len);

            if (position - ivPosition == pageSize) {
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `query/src/main/java/jetbrains/exodus/query/AddNullStaticTypedEntityIterable.java`
#### Snippet
```java
                    } else {
                        hasNull = false;
                        return null;
                    }
                }
```

### ReturnNull
Return of `null`
in `query/src/main/java/jetbrains/exodus/query/NodeBase.java`
#### Snippet
```java
        private NodeBase getNode(Wildcard wildcard) {
            return nodes == null ?
                null :
                nodes.get(wildcard);
        }
```

### ReturnNull
Return of `null`
in `query/src/main/java/jetbrains/exodus/query/NodeBase.java`
#### Snippet
```java
        private NodeBase getLeave(ConversionWildcard wildcard) {
            return leaves == null ?
                null :
                leaves.get(wildcard);
        }
```

### ReturnNull
Return of `null`
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/execution/DelegatingJobProcessor.java`
#### Snippet
```java
    @Override
    protected Job pushAt(Job job, long millis) {
        if (isFinished()) return null;
        if (job.getProcessor() == null) {
            job.setProcessor(this);
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/crypto/MessageDigestUtil.java`
#### Snippet
```java

    private static byte[] encodeUnsafe(byte[] message, String method) throws NoSuchAlgorithmException {
        if (message == null) return null;
        final MessageDigest md = MessageDigest.getInstance(method);
        md.update(message);
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/execution/JobProcessorQueueAdapter.java`
#### Snippet
```java
    protected Job pushAt(final Job job, final long millis) {
        if (isFinished()) {
            return null;
        }
        if (job.getProcessor() == null) {
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/FakeObjectCache.java`
#### Snippet
```java
    @Override
    public V cacheObject(@NotNull K key, @NotNull V x) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/FakeObjectCache.java`
#### Snippet
```java
    @Override
    public V getObject(@NotNull K key) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/FakeObjectCache.java`
#### Snippet
```java
    @Override
    public V remove(@NotNull K key) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/FakeObjectCache.java`
#### Snippet
```java
    @Override
    public V tryKey(@NotNull K key) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/SoftObjectCacheBase.java`
#### Snippet
```java
        final ObjectCacheBase<K, V> chunk = getChunk(key, false);
        if (chunk == null) {
            return null;
        }
        try (CriticalSection ignored = chunk.newCriticalSection()) {
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/SoftObjectCacheBase.java`
#### Snippet
```java
        final ObjectCacheBase<K, V> chunk = getChunk(key, false);
        if (chunk == null) {
            return null;
        }
        try (CriticalSection ignored = chunk.newCriticalSection()) {
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/ConcurrentObjectCache.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/ConcurrentObjectCache.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/ConcurrentObjectCache.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/ConcurrentObjectCache.java`
#### Snippet
```java
                cache[cacheIndex] = new CacheEntry<>(key, x);
                // in concurrent environment we can't definitely know if a value is pushed out from the cache
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/ConcurrentObjectCache.java`
#### Snippet
```java
        }
        cache[cacheIndex - 1] = new CacheEntry<>(key, x);
        return null;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntHashMap.java`
#### Snippet
```java
        Entry<V> e = table[index];

        if (e == null) return null;

        if (e.key == key) {
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntHashMap.java`
#### Snippet
```java
                final Entry<V> last = e;
                e = e.hashNext;
                if (e == null) return null;
                if (e.key == key) {
                    last.hashNext = e.hashNext;
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntHashMap.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntHashMap.java`
#### Snippet
```java
    public V get(final int key) {
        Entry<V> e = getEntry(key);
        return e == null ? null : e.value;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntHashMap.java`
#### Snippet
```java
            rehash(HashUtil.nextCapacity(capacity));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntLinkedHashMap.java`
#### Snippet
```java
    public V get(final int key) {
        Entry<V> e = getEntry(key);
        return e == null ? null : e.value;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntLinkedHashMap.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntLinkedHashMap.java`
#### Snippet
```java
            rehash(HashUtil.nextCapacity(capacity));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntLinkedHashMap.java`
#### Snippet
```java
        Entry<V> e = table[index];

        if (e == null) return null;

        if (e.key == key) {
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntLinkedHashMap.java`
#### Snippet
```java
                final Entry<V> last = e;
                e = e.hashNext;
                if (e == null) return null;
                if (e.key == key) {
                    last.hashNext = e.hashNext;
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/AbstractHashMap.java`
#### Snippet
```java
    public V get(final Object key) {
        Map.Entry<K, V> e = getEntry(key);
        return e == null ? null : e.getValue();
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/decorators/HashMapDecorator.java`
#### Snippet
```java
    @Override
    public V remove(Object key) {
        if (decorated == Collections.emptyMap()) return null;
        final V result = decorated.remove(key);
        if (result != null && decorated.isEmpty()) {
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/decorators/QueueDecorator.java`
#### Snippet
```java
    @Override
    public E poll() {
        return (decorated.size() == 0) ? null : decorated.remove(0);
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/decorators/QueueDecorator.java`
#### Snippet
```java
    @Override
    public E peek() {
        return (decorated.size() == 0) ? null : decorated.get(0);
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LongLinkedHashMap.java`
#### Snippet
```java
    public V get(final long key) {
        Entry<V> e = getEntry(key);
        return e == null ? null : e.value;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LongLinkedHashMap.java`
#### Snippet
```java
        Entry<V> e = table[index];

        if (e == null) return null;

        if (e.key == key) {
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LongLinkedHashMap.java`
#### Snippet
```java
                final Entry<V> last = e;
                e = e.hashNext;
                if (e == null) return null;
                if (e.key == key) {
                    last.hashNext = e.hashNext;
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LongLinkedHashMap.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LongLinkedHashMap.java`
#### Snippet
```java
            rehash(HashUtil.nextCapacity(capacity));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentHashMap.java`
#### Snippet
```java
        public V get(@NotNull final K key) {
            final Entry<K, V> entry = getRoot().getKey(new Entry<>(key), key.hashCode(), 0);
            return entry == null ? null : entry.getValue();
        }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentHashMap.java`
#### Snippet
```java
        public V get(@NotNull final K key) {
            final Entry<K, V> entry = getRoot().getKey(new Entry<>(key), key.hashCode(), 0);
            return entry == null ? null : entry.getValue();
        }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentLong23TreeMap.java`
#### Snippet
```java
            Node<PersistentLongMap.Entry<V>> root = getRoot();
            if (root == null) {
                return null;
            }
            PersistentLongMap.Entry<V> entry = root.getByWeight(key);
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentLong23TreeMap.java`
#### Snippet
```java
            }
            PersistentLongMap.Entry<V> entry = root.getByWeight(key);
            return entry == null ? null : entry.getValue();
        }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentLong23TreeMap.java`
#### Snippet
```java
            RootNode<PersistentLongMap.Entry<V>> root = getRoot();
            if (root == null) {
                return null;
            }
            Pair<Node<PersistentLongMap.Entry<V>>, PersistentLongMap.Entry<V>> removeResult = root.remove(new LongMapEntry<>(key), true);
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentLong23TreeMap.java`
#### Snippet
```java
            Pair<Node<PersistentLongMap.Entry<V>>, PersistentLongMap.Entry<V>> removeResult = root.remove(new LongMapEntry<>(key), true);
            if (removeResult == null) {
                return null;
            }
            Node<PersistentLongMap.Entry<V>> res = removeResult.getFirst();
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentLong23TreeMap.java`
#### Snippet
```java
            Node<PersistentLongMap.Entry<V>> root = getRoot();
            if (root == null) {
                return null;
            }
            PersistentLongMap.Entry<V> entry = root.getByWeight(key);
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentLong23TreeMap.java`
#### Snippet
```java
            }
            PersistentLongMap.Entry<V> entry = root.getByWeight(key);
            return entry == null ? null : entry.getValue();
        }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LinkedHashMap.java`
#### Snippet
```java
        Entry<K, V> e = table[index];

        if (e == null) return null;

        K entryKey;
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LinkedHashMap.java`
#### Snippet
```java
                final Entry<K, V> last = e;
                e = e.hashNext;
                if (e == null) return null;
                if ((entryKey = e.key) == key || entryKey.equals(key)) {
                    last.hashNext = e.hashNext;
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LinkedHashMap.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashMap.java`
#### Snippet
```java
                return hadNullValue;
            }
            return null;
        }
        final Entry<K, V>[] table = this.table;
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashMap.java`
#### Snippet
```java
        Entry<K, V> e = table[index];

        if (e == null) return null;

        K entryKey;
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashMap.java`
#### Snippet
```java
                final Entry<K, V> last = e;
                e = e.hashNext;
                if (e == null) return null;
                if ((entryKey = e.key) == key || entryKey.equals(key)) {
                    last.hashNext = e.hashNext;
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashMap.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/Persistent23TreeMap.java`
#### Snippet
```java
            Node<Entry<K, V>> root = getRoot();
            if (root == null) {
                return null;
            }
            Entry<K, V> entry = root.get(new Entry<>(key));
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/Persistent23TreeMap.java`
#### Snippet
```java
            }
            Entry<K, V> entry = root.get(new Entry<>(key));
            return entry == null ? null : entry.getValue();
        }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/Persistent23TreeMap.java`
#### Snippet
```java
            RootNode<Entry<K, V>> root = getRoot();
            if (root == null) {
                return null;
            }
            Pair<Node<Entry<K, V>>, Entry<K, V>> removeResult = root.remove(new Entry<>(key), true);
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/Persistent23TreeMap.java`
#### Snippet
```java
            Pair<Node<Entry<K, V>>, Entry<K, V>> removeResult = root.remove(new Entry<>(key), true);
            if (removeResult == null) {
                return null;
            }
            Node<Entry<K, V>> res = removeResult.getFirst();
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/Persistent23TreeMap.java`
#### Snippet
```java
            Node<Entry<K, V>> root = getRoot();
            if (root == null) {
                return null;
            }
            Entry<K, V> entry = root.get(new Entry<>(key));
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/Persistent23TreeMap.java`
#### Snippet
```java
            }
            Entry<K, V> entry = root.get(new Entry<>(key));
            return entry == null ? null : entry.getValue();
        }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
            final Entry entry = getEntryByIndex(getEntryIndex(key));
            if (entry == null) {
                return null;
            }
            return (V) entry.data[(int) (key & MASK)];
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
            final Entry entry = map.getMinimum();
            if (entry == null) {
                return null;
            }
            int index = entry.bits.nextSetBit(0);
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
            Entry entry = getEntryByIndex(index);
            if (entry == null) {
                return null;
            }
            int bitIndex = (int) (key & MASK);
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
                size--;
            } else {
                return null;
            }
            final Object result = entry.data[bitIndex];
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
            final Entry entry = mutableMap.getMinimum();
            if (entry == null) {
                return null;
            }
            int index = entry.bits.nextSetBit(0);
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
            final Entry entry = getEntryByIndex(getEntryIndex(key));
            if (entry == null) {
                return null;
            }
            return (V) entry.data[(int) (key & MASK)];
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/Persistent23Tree.java`
#### Snippet
```java
        private RootNode<K> makeRootNode(@NotNull Iterator<K> iterator, int size, int toDepth) {
            if (size <= 0) {
                return null;
            }
            int left = size;
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/Persistent23Tree.java`
#### Snippet
```java
        private Node<K> makeNode(@NotNull Iterator<K> iterator, int size, int toDepth) {
            if (size <= 0) {
                return null;
            }
            int left = size;
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentObjectCache.java`
#### Snippet
```java
        final Root<K, V> current = getCurrent();
        if (current == null) {
            return null;
        }
        V result = current.getFirstGen().beginWrite().getValue(key);
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentLinkedHashMap.java`
#### Snippet
```java
                return internalValue.getValue();
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `openAPI/src/main/java/jetbrains/exodus/ConfigurationStrategy.java`
#### Snippet
```java
public interface ConfigurationStrategy {

    ConfigurationStrategy IGNORE = key -> null;

    ConfigurationStrategy SYSTEM_PROPERTY = System::getProperty;
```

### ReturnNull
Return of `null`
in `openAPI/src/main/java/jetbrains/exodus/CompoundByteIterable.java`
#### Snippet
```java
            public ByteIterator nextIterator() {
                off++;
                return off < count ? iterables[off].iterator() : null;
            }
        };
```

### ReturnNull
Return of `null`
in `openAPI/src/main/java/jetbrains/exodus/bindings/ComparableValueType.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `openAPI/src/main/java/jetbrains/exodus/bindings/ComparableValueType.java`
#### Snippet
```java

    public static ComparableBinding getPredefinedBinding(final int typeId) {
        return typeId >= 0 && typeId < PREDEFINED_BINDINGS.length ? PREDEFINED_BINDINGS[typeId] : null;
    }

```

### ReturnNull
Return of `null`
in `openAPI/src/main/java/jetbrains/exodus/bindings/BindingUtils.java`
#### Snippet
```java
            next = stream.read();
            if (next == 0) {
                return null;
            }
            throw new IllegalArgumentException();
```

### ReturnNull
Return of `null`
in `environment/src/main/java/jetbrains/exodus/log/LoggableIterator.java`
#### Snippet
```java
    public RandomAccessLoggable next() {
        if (!hasNext()) {
            return null;
        }
        final RandomAccessLoggable result = log.read(it);
```

### ReturnNull
Return of `null`
in `environment/src/main/java/jetbrains/exodus/tree/ITreeCursor.java`
#### Snippet
```java
        @Override
        public ITree getTree() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `environment/src/main/java/jetbrains/exodus/log/BufferedDataWriter.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `environment/src/main/java/jetbrains/exodus/tree/btree/BottomPage.java`
#### Snippet
```java
            return page.getKey(index);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/ChildReferenceSet.java`
#### Snippet
```java
    ChildReference getRight() {
        final int size = size();
        return size > 0 ? refs[size - 1] : null;
    }

```

### ReturnNull
Return of `null`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/ChildReferenceSet.java`
#### Snippet
```java
            do {
                if (++i >= size) {
                    return null;
                }
                ref = refs[i];
```

### ReturnNull
Return of `null`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/ChildReferenceSet.java`
#### Snippet
```java
            do {
                if (--i < 0) {
                    return null;
                }
                ref = refs[i];
```

### ReturnNull
Return of `null`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/ChildReferenceSet.java`
#### Snippet
```java
    ChildReference get(final byte b) {
        final int index = searchFor(b);
        return index < 0 ? null : refs[index];
    }

```

### ReturnNull
Return of `null`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/NodeBase.java`
#### Snippet
```java
        @Override
        public ChildReference getNode() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/NodeBase.java`
#### Snippet
```java
        @Override
        public ChildReference prev() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/NodeBase.java`
#### Snippet
```java
        @Override
        public ChildReference next() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/SinglePageImmutableNode.java`
#### Snippet
```java

        if (childrenCount == 0) {
            return null;
        }
        if (childrenCount == 256) {
```

### ReturnNull
Return of `null`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/SinglePageImmutableNode.java`
#### Snippet
```java
            var bitmask = 1L << bit;
            if ((bitset & bitmask) == 0L) {
                return null;
            }
            var index = Long.bitCount(bitset & (bitmask - 1L));
```

### ReturnNull
Return of `null`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/SinglePageImmutableNode.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
                Pair<Node<K>, K> removeResult = firstChild.remove(key, strict);
                if (removeResult == null) {
                    return null;
                }
                Node<K> resultNode = removeResult.getFirst();
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
                Pair<Node<K>, K> removeResult = secondChild.remove(key, compFirst != 0);
                if (removeResult == null) {
                    return null;
                }
                Node<K> resultNode = removeResult.getFirst();
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
            Pair<Node<K>, K> removeResult = thirdChild.remove(key, compSecond != 0);
            if (removeResult == null) {
                return null;
            }
            Node<K> resultNode = removeResult.getFirst();
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
        @Override
        public Node<K> getFirstChild() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
        public K getByWeight(long weight) {
            final long firstKeyWeight = ((LongComparable) firstKey).getWeight();
            return firstKeyWeight == weight ? firstKey : null;
        }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
        @Override
        public Node<K> getFirstChild() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
        @Override
        public Node<K> getSecondChild() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
            int compFirst = strict ? key.compareTo(firstKey) : -1;
            if (compFirst < 0 && strict) {
                return null;
            }
            if (compFirst <= 0) {
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
            compSecond = key.compareTo(secondKey);
            if (compSecond != 0) {
                return null;
            } else {
                return new Pair<>(new BinaryNode<>(firstKey), secondKey);
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
        @Override
        public Node<K> getThirdChild() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
        @Override
        public Node<K> getSecondChild() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
                return secondKey;
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
                Pair<Node<K>, K> removeResult = firstChild.remove(key, strict);
                if (removeResult == null) {
                    return null;
                }
                Node<K> resultNode = removeResult.getFirst();
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
            Pair<Node<K>, K> removeResult = secondChild.remove(key, comp != 0);
            if (removeResult == null) {
                return null;
            }
            Node<K> resultNode = removeResult.getFirst();
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
        @Override
        public K get(@NotNull K key) {
            return key.compareTo(firstKey) == 0 ? firstKey : null;
        }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
        Stack<TreePos<K>> stack = new Stack<>();
        if (!node.getLess(key, stack)) {
            return null;
        }
        TreePos<K> treePos = stack.peek();
```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
                return secondKey;
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
            int comp = strict ? key.compareTo(firstKey) : -1;
            if (strict && comp != 0) {
                return null;
            } else {
                return new Pair<>(new RemovedNode<>(null), firstKey);
```

### ReturnNull
Return of `null`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntity.java`
#### Snippet
```java
        String oldValue = getBlobString(blobName);
        if (blobString.equals(oldValue)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/Explainer.java`
#### Snippet
```java
            return new Throwable();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/util/SingleTypeEntityIdSet.java`
#### Snippet
```java
                    }
                    hasNull = false;
                    return null;
                }
                return new PersistentEntityId(singleTypeId, it.next());
```

### ReturnNull
Return of `null`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/util/MultiTypeEntityIdSet.java`
#### Snippet
```java
                    }
                    hasNull = false;
                    return null;
                }
                return new PersistentEntityId(typeId, it.next());
```

### ReturnNull
Return of `null`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
            @Override
            public Pair<Long, Long> next() {
                if (!hasNext()) return null;
                final Pair<Long, Long> result = next;
                next = null;
```

### ReturnNull
Return of `null`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
                valueEntry = cursor.getSearchKey(keyEntry);
                if (valueEntry == null) {
                    return null;
                }
                if (cursor.getNextDup()) { // getNextDup screws up valueEntry only if dup is found
```

### ReturnNull
Return of `null`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
    public Long getBlobFileLength(long blobHandle, Transaction txn) {
        final ByteIterable resultEntry = blobFileLengths.get(txn, LongBinding.longToCompressedEntry(blobHandle));
        return resultEntry == null ? null : LongBinding.compressedEntryToLong(resultEntry);
    }

```

### ReturnNull
Return of `null`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/PropertiesIterable.java`
#### Snippet
```java
            final Cursor valueIdx = openCursor(txn);
            if (valueIdx == null) {
                return null;
            }
            return new PropertiesIterator(valueIdx, primaryIndex, ascending);
```

### ReturnNull
Return of `null`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
            UnsafeKt.executeInMetaWriteLock((EnvironmentImpl) store.getEnvironment(), () -> {
                applyAtomicCaches(cache);
                return null;
            });
        }
```

### ReturnNull
Return of `null`
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/XodusDirectory.java`
#### Snippet
```java

            if (byteAddr == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/XodusDirectory.java`
#### Snippet
```java
                nameToAddressStore.delete(txn, key);
            } else {
                return null;
            }

```

### ReturnNull
Return of `null`
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/XodusDirectory.java`
#### Snippet
```java

            if (addr == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/XodusDirectory.java`
#### Snippet
```java
            var result = LongBinding.entryToLong(addr);
            if (result < 0) {
                return null;
            }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `lastFileAddress` is redundant
in `environment/src/main/java/jetbrains/exodus/log/BufferedDataWriter.java`
#### Snippet
```java
            var lastFile = blockSet.getMaximum();
            if (lastFile != null) {
                var lastFileAddress = lastFile;
                var block = blockSet.getBlock(lastFileAddress);

```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
                    while (true) {
                        try {
                            Thread.sleep(sleepInterval);
                        } catch (InterruptedException e) {
                            throw new ExodusException("Store : " + getName() +
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
            while (true) {
                try {
                    Thread.sleep(sleepInterval);
                } catch (InterruptedException e) {
                    throw new ExodusException("Store : " + getName() +
```

## RuleId[ruleID=UseCompareMethod]
### UseCompareMethod
Expression can be replaced with 'Long.compare'
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/LongMapEntry.java`
#### Snippet
```java
    public int compareTo(PersistentLongMap.Entry<V> o) {
        final long otherKey = o.getKey();
        return key > otherKey ? 1 : key == otherKey ? 0 : -1;
    }

```

### UseCompareMethod
Expression can be replaced with 'Long.compare'
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
        public int compareTo(@NotNull Entry o) {
            final long otherMin = o.index;
            return index > otherMin ? 1 : index == otherMin ? 0 : -1;
        }
    }
```

## RuleId[ruleID=WaitNotInLoop]
### WaitNotInLoop
Call to `wait()` is not in loop
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/ReleaseLatch.java`
#### Snippet
```java
    public synchronized boolean acquire(long timeout) throws InterruptedException {
        if (owner != null) {
            wait(timeout);
            if (owner != null) {
                return false;
```

### WaitNotInLoop
Call to `wait()` is not in loop
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/DebugLatch.java`
#### Snippet
```java
        if (owner != null) {
            logOwner();
            wait(timeout);
            if (owner != null) {
                return false;
```

## RuleId[ruleID=DeprecatedCallableAddReplaceWith]
### DeprecatedCallableAddReplaceWith
'@Deprecated' annotation without a 'replaceWith' argument
in `environment/src/main/kotlin/jetbrains/exodus/io/WatchingFileDataWriter.kt`
#### Snippet
```java
    override fun removeBlock(blockAddress: Long, rbt: RemoveBlockType) = throw UnsupportedOperationException()

    @Deprecated("Data files are not designed to be truncated")
    override fun truncateBlock(blockAddress: Long, length: Long) = throw UnsupportedOperationException()
    override fun lock(timeout: Long) = throw UnsupportedOperationException()
```

## RuleId[ruleID=ObjectLiteralToLambda]
### ObjectLiteralToLambda
Convert to lambda
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/IntObjectCacheBase.kt`
#### Snippet
```java

    private val size = max(MIN_SIZE, size)
    private val criticalSection: Closeable = object : Closeable {
        override fun close() {
            unlock()
```

### ObjectLiteralToLambda
Convert to lambda
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/LongObjectCacheBase.kt`
#### Snippet
```java

    private val size = max(MIN_SIZE, size)
    private val criticalSection: Closeable = object : Closeable {
        override fun close() {
            unlock()
```

## RuleId[ruleID=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `suppressConfigChangeListenersForThread()` declared in class 'jetbrains.exodus.AbstractConfig' but referenced via subclass 'jetbrains.exodus.env.EnvironmentConfig'
in `environment/src/main/java/jetbrains/exodus/env/EnvironmentImpl.java`
#### Snippet
```java
                            gc.getUtilizationProfile().forceSave(txn);
                            txn.setCommitHook(() -> {
                                EnvironmentConfig.suppressConfigChangeListenersForThread();
                                ec.setEnvIsReadonly(true);
                                EnvironmentConfig.resumeConfigChangeListenersForThread();
```

### StaticCallOnSubclass
Static method `resumeConfigChangeListenersForThread()` declared in class 'jetbrains.exodus.AbstractConfig' but referenced via subclass 'jetbrains.exodus.env.EnvironmentConfig'
in `environment/src/main/java/jetbrains/exodus/env/EnvironmentImpl.java`
#### Snippet
```java
                                EnvironmentConfig.suppressConfigChangeListenersForThread();
                                ec.setEnvIsReadonly(true);
                                EnvironmentConfig.resumeConfigChangeListenersForThread();
                            });
                            ((ReadWriteTransaction) txn).forceFlush();
```

## RuleId[ruleID=SimplifiableCallChain]
### SimplifiableCallChain
Call chain on collection type may be simplified
in `benchmarks/src/jmh/kotlin/jetbrains/exodus/benchmark/query/InMemorySortBenchmarkBase.kt`
#### Snippet
```java
            val sorted = sortFun(it.getAll("Issue"))
            // sum of ids of least 100 entities
            sorted.take(100).map { it.id.localId }.sum()
        }
    }
```

### SimplifiableCallChain
Call chain on collection type may be simplified
in `benchmarks/src/jmh/kotlin/jetbrains/exodus/benchmark/query/InMemorySortBenchmarkBase.kt`
#### Snippet
```java
                throw IndexOutOfBoundsException()
            }
            it.getAll("Issue").take(100).map { it.id.localId }.sum()
        }
    }
```

## RuleId[ruleID=FunctionName]
### FunctionName
Function name `safe_equals` should not contain underscores
in `query/src/main/kotlin/jetbrains/exodus/query/Utils.kt`
#### Snippet
```java

    @JvmStatic
    fun safe_equals(left: Any?, right: Any?) = if (left != null) left == right else right == null

    @JvmStatic
```

## RuleId[ruleID=ConvertSecondaryConstructorToPrimary]
### ConvertSecondaryConstructorToPrimary
Secondary constructor should be converted to a primary one
in `lucene-directory/src/main/kotlin/jetbrains/exodus/lucene/DebugExodusDirectory.kt`
#### Snippet
```java
    private val debugDirectory: RAMDirectory

    @JvmOverloads constructor(env: ContextualEnvironment,
                              contentsStoreConfig: StoreConfig = StoreConfig.WITH_DUPLICATES,
                              directoryConfig: ExodusDirectoryConfig = ExodusDirectoryConfig()) {
```

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `used |= presentationUsed`
in `query/src/main/java/jetbrains/exodus/query/NodeBase.java`
#### Snippet
```java
                result.append(child.toString(TREE_LEVEL_INDENT + prefix));
            }
            used |= presentationUsed;
        }
        return used;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isDirty |= result`
in `openAPI/src/main/java/jetbrains/exodus/bindings/ComparableSet.java`
#### Snippet
```java
    public boolean removeItem(@NotNull final T item) {
        final boolean result = set.remove(item);
        isDirty |= result;
        return result;
    }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isDirty |= result`
in `openAPI/src/main/java/jetbrains/exodus/bindings/ComparableSet.java`
#### Snippet
```java
    public boolean addItem(@NotNull final T item) {
        final boolean result = set.add(item);
        isDirty |= result;
        return result;
    }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isExclusive() | env.shouldTransactionBeExclusive(this)`
in `environment/src/main/java/jetbrains/exodus/env/ReadWriteTransaction.java`
#### Snippet
```java
        };
        replayCount = 0;
        setExclusive(isExclusive() | env.shouldTransactionBeExclusive(this));
        env.holdNewestSnapshotBy(this);
    }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `success |= allLinksIndex.put(txn, linkId, localId)`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/tables/LinksTable.java`
#### Snippet
```java
        boolean success = super.put(txn, PropertyKey.propertyKeyToEntry(linkKey), value);
        if (noOldValue) {
            success |= allLinksIndex.put(txn, linkId, localId);
        }
        return success;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `success |= deleteAllIndex(txn, linkId, localId)`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/tables/LinksTable.java`
#### Snippet
```java
        boolean success = super.delete(txn, PropertyKey.propertyKeyToEntry(linkKey), value);
        if (noNewValue) {
            success |= deleteAllIndex(txn, linkId, localId);
        }
        return success;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `deleted |= deleteLinkInternal(txn, from, linkId, (PersistentEntityId) itr.nextId())`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
        boolean deleted = false;
        while (itr.hasNext()) {
            deleted |= deleteLinkInternal(txn, from, linkId, (PersistentEntityId) itr.nextId());
        }
        if (deleted) {
```

## RuleId[ruleID=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `vfs/src/main/java/jetbrains/exodus/vfs/VfsOutputStream.java`
#### Snippet
```java
        } else {
            outputClusterSize = currentCluster.getSize();
            outputCluster = new byte[clusterSize > outputClusterSize ? clusterSize : outputClusterSize];
            for (int i = 0; i < outputClusterSize; ++i) {
                outputCluster[i] = currentCluster.next();
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentObjectCache.java`
#### Snippet
```java

    public PersistentObjectCache(final int size, float secondGenSizeRatio) {
        this.size = size < ObjectCacheBase.MIN_SIZE ? ObjectCacheBase.MIN_SIZE : size;
        if (secondGenSizeRatio < 0.05f) {
            secondGenSizeRatio = 0.05f;
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `DecoratorJob` has no concrete subclass
in `utils/src/main/java/jetbrains/exodus/core/execution/DecoratorJob.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public abstract class DecoratorJob extends Job {

    @NotNull
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Entity`
in `query/src/main/java/jetbrains/exodus/query/SortByLinkProperty.java`
#### Snippet
```java

    @Override
    public Iterable<Entity> applySort(String entityType, Iterable<Entity> iterable, @NotNull final SortEngine sortEngine) {
        return sortEngine.sort(enumType, propName, entityType, linkName, iterable, getAscending());
    }
```

### BoundedWildcard
Can generalize to `? extends Entity`
in `query/src/main/java/jetbrains/exodus/query/InMemoryMergeSortIterableWithArrayList.java`
#### Snippet
```java

public class InMemoryMergeSortIterableWithArrayList extends SortEngine.InMemorySortIterable {
    public InMemoryMergeSortIterableWithArrayList(@NotNull final Iterable<Entity> source, @NotNull final Comparator<Entity> comparator) {
        super(source, comparator);
    }
```

### BoundedWildcard
Can generalize to `? extends Entity`
in `query/src/main/java/jetbrains/exodus/query/ComparableGetterSort.java`
#### Snippet
```java

    @Override
    public Iterable<Entity> applySort(String entityType, Iterable<Entity> iterable, @NotNull SortEngine sortEngine) {
        return sortEngine.sortInMemory(iterable, valueGetter, getAscending());
    }
```

### BoundedWildcard
Can generalize to `? extends Entity`
in `query/src/main/java/jetbrains/exodus/query/InMemoryTimSortIterable.java`
#### Snippet
```java
    private static final int MIN_RUN_LENGTH = 32;

    public InMemoryTimSortIterable(@NotNull final Iterable<Entity> source, @NotNull final Comparator<Entity> comparator) {
        super(source, comparator);
    }
```

### BoundedWildcard
Can generalize to `? extends Entity`
in `query/src/main/java/jetbrains/exodus/query/InMemoryMergeSortOnInitIterable.java`
#### Snippet
```java

public class InMemoryMergeSortOnInitIterable extends SortEngine.InMemorySortIterable {
    public InMemoryMergeSortOnInitIterable(@NotNull final Iterable<Entity> source, @NotNull final Comparator<Entity> comparator) {
        super(source, comparator);
    }
```

### BoundedWildcard
Can generalize to `? extends Entity`
in `query/src/main/java/jetbrains/exodus/query/SortByProperty.java`
#### Snippet
```java

    @Override
    public Iterable<Entity> applySort(String entityType, Iterable<Entity> iterable, @NotNull final SortEngine sortEngine) {
        return sortEngine.sort(entityType, propertyName, iterable, getAscending());
    }
```

### BoundedWildcard
Can generalize to `? extends Entity`
in `query/src/main/java/jetbrains/exodus/query/InMemoryQuickSortIterable.java`
#### Snippet
```java

public class InMemoryQuickSortIterable extends SortEngine.InMemorySortIterable {
    public InMemoryQuickSortIterable(@NotNull final Iterable<Entity> source, @NotNull final Comparator<Entity> comparator) {
        super(source, comparator);
    }
```

### BoundedWildcard
Can generalize to `? extends Entity`
in `query/src/main/java/jetbrains/exodus/query/GenericSort.java`
#### Snippet
```java

    @Override
    public Iterable<Entity> applySort(String entityType, Iterable<Entity> iterable, @NotNull final SortEngine sortEngine) {
        return sortEngine.sort(iterable, cmp, getAscending());
    }
```

### BoundedWildcard
Can generalize to `? extends Entity`
in `query/src/main/java/jetbrains/exodus/query/InMemoryQuickSortTwoSidesIterable.java`
#### Snippet
```java

public class InMemoryQuickSortTwoSidesIterable extends SortEngine.InMemorySortIterable {
    public InMemoryQuickSortTwoSidesIterable(@NotNull final Iterable<Entity> source, @NotNull final Comparator<Entity> comparator) {
        super(source, comparator);
    }
```

### BoundedWildcard
Can generalize to `? extends Index`
in `query/src/main/java/jetbrains/exodus/query/UniqueKeyIndicesEngine.java`
#### Snippet
```java
    }

    public void updateUniqueKeyIndices(@NotNull final Iterable<Index> indices) {
        final Environment environment = persistentStore.getEnvironment();
        environment.suspendGC();
```

### BoundedWildcard
Can generalize to `? extends Entity`
in `query/src/main/java/jetbrains/exodus/query/InMemoryQuickSortOnInitIterable.java`
#### Snippet
```java

public class InMemoryQuickSortOnInitIterable extends SortEngine.InMemorySortIterable {
    public InMemoryQuickSortOnInitIterable(@NotNull final Iterable<Entity> source, @NotNull final Comparator<Entity> comparator) {
        super(source, comparator);
    }
```

### BoundedWildcard
Can generalize to `? extends EntityMetaData`
in `query/src/main/java/jetbrains/exodus/query/metadata/ModelMetaDataImpl.java`
#### Snippet
```java
    }

    private void addSubTypeToMetaData(Map<String, EntityMetaData> typeToEntityMetaDatas, EntityMetaData emd, String superType) {
        final EntityMetaData superEmd = typeToEntityMetaDatas.get(superType);
        if (superEmd == null) {
```

### BoundedWildcard
Can generalize to `? extends AssociationMetaData`
in `query/src/main/java/jetbrains/exodus/query/metadata/ModelMetaDataImpl.java`
#### Snippet
```java
    }

    public void setAssociationMetaDatas(Set<AssociationMetaData> associationMetaDatas) {
        for (AssociationMetaData amd : associationMetaDatas) {
            this.associationMetaDatas.put(((AssociationMetaDataImpl) amd).getFullName(), amd);
```

### BoundedWildcard
Can generalize to `? extends EntityMetaData`
in `query/src/main/java/jetbrains/exodus/query/metadata/ModelMetaDataImpl.java`
#### Snippet
```java
    }

    public void setEntityMetaDatas(@NotNull Set<EntityMetaData> entityMetaDatas) {
        synchronized (this.entityMetaDatas) {
            this.entityMetaDatas.clear();
```

### BoundedWildcard
Can generalize to `? super String`
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
    }

    private void addIncomingAssociation(@NotNull final Map<String, Set<String>> incomingAssociations,
                                        @NotNull final String type, @NotNull final String associationName) {
        Set<String> links = incomingAssociations.get(type);
```

### BoundedWildcard
Can generalize to `? extends PropertyMetaData`
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
    }

    public void setPropertiesMetaData(Iterable<PropertyMetaData> properties) {
        if (properties == null) return;
        for (PropertyMetaData p : properties) {
```

### BoundedWildcard
Can generalize to `? extends AssociationEndMetaData`
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
    }

    public void setAssociationEndsMetaData(@NotNull Collection<AssociationEndMetaData> ends) {
        externalAssociationEnds = new HashSet<>();
        externalAssociationEnds.addAll(ends);
```

### BoundedWildcard
Can generalize to `? extends AssociationEndMetaData`
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
     * For backward compatibility
     */
    public void setAssociationEnds(@NotNull Collection<AssociationEndMetaData> ends) {
        externalAssociationEnds = new HashSet<>();
        externalAssociationEnds.addAll(ends);
```

### BoundedWildcard
Can generalize to `? super String`
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
    }

    private void collectSubTypes(EntityMetaDataImpl emd, List<String> result) {
        final Set<String> subTypes = emd.subTypes;
        result.addAll(subTypes);
```

### BoundedWildcard
Can generalize to `? super ThreadJobProcessor`
in `utils/src/main/java/jetbrains/exodus/core/execution/MultiThreadDelegatingJobProcessor.java`
#### Snippet
```java

    @SuppressWarnings("unused")
    public void forEachSubProcessor(Consumer<ThreadJobProcessor> action) {
        for (int i = 0; i < jobProcessors.length(); i++) {
            action.accept(jobProcessors.get(i));
```

### BoundedWildcard
Can generalize to `? extends E`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/NanoSet.java`
#### Snippet
```java
        private E element;

        private NanoIterator(final NanoSet<E> set) {
            element = set.element;
        }
```

### BoundedWildcard
Can generalize to `? super P`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/PriorityQueue.java`
#### Snippet
```java
    // Returns size of the destination (and obviously of the source) queue
    public static <P extends Comparable<? super P>, E> int moveQueue(@NotNull final PriorityQueue<P, E> source,
                                                                     @NotNull final PriorityQueue<P, E> dest) {
        try (Guard ignored = source.lock()) {
            try (Guard ignore = dest.lock()) {
```

### BoundedWildcard
Can generalize to `? super E`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/PriorityQueue.java`
#### Snippet
```java
    // Returns size of the destination (and obviously of the source) queue
    public static <P extends Comparable<? super P>, E> int moveQueue(@NotNull final PriorityQueue<P, E> source,
                                                                     @NotNull final PriorityQueue<P, E> dest) {
        try (Guard ignored = source.lock()) {
            try (Guard ignore = dest.lock()) {
```

### BoundedWildcard
Can generalize to `? extends V`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/LongObjectCache.java`
#### Snippet
```java
        secondGenerationQueue = new LongLinkedHashMap<V>() {
            @Override
            protected boolean removeEldestEntry(final Map.Entry<Long, V> eldest) {
                final boolean result = size() > secondGenSizeBound;
                if (result) {
```

### BoundedWildcard
Can generalize to `? super Map.Entry`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/LongObjectCache.java`
#### Snippet
```java
    }

    public boolean forEachEntry(final ObjectProcedure<Map.Entry<Long, V>> procedure) {
        for (final Map.Entry<Long, V> entry : firstGenerationQueue.entrySet()) {
            if (!procedure.execute(entry)) return false;
```

### BoundedWildcard
Can generalize to `? extends V`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/LongObjectCache.java`
#### Snippet
```java
        firstGenerationQueue = new LongLinkedHashMap<V>() {
            @Override
            protected boolean removeEldestEntry(final Map.Entry<Long, V> eldest) {
                final boolean result = size() + secondGenerationQueue.size() > LongObjectCache.this.size();
                if (result) {
```

### BoundedWildcard
Can generalize to `? super K`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/AbstractHashMap.java`
#### Snippet
```java
    }

    public boolean forEachKey(final ObjectProcedure<K> procedure) {
        for (final Entry<K, V> entry : entrySet()) {
            if (!procedure.execute(entry.getKey())) return false;
```

### BoundedWildcard
Can generalize to `? super V`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/AbstractHashMap.java`
#### Snippet
```java
    }

    public boolean forEachValue(final ObjectProcedure<V> procedure) {
        for (final Entry<K, V> entry : entrySet()) {
            if (!procedure.execute(entry.getValue())) return false;
```

### BoundedWildcard
Can generalize to `? super Entry`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/AbstractHashMap.java`
#### Snippet
```java
    }

    public boolean forEachEntry(final ObjectProcedure<Entry<K, V>> procedure) {
        for (final Entry<K, V> entry : entrySet()) {
            if (!procedure.execute(entry)) return false;
```

### BoundedWildcard
Can generalize to `? super Entry`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/AbstractHashMap.java`
#### Snippet
```java
    }

    public <E extends Throwable> boolean forEachEntry(final ObjectProcedureThrows<Entry<K, V>, E> procedure) throws E {
        for (final Entry<K, V> entry : entrySet()) {
            if (!procedure.execute(entry)) return false;
```

### BoundedWildcard
Can generalize to `? extends K`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/ObjectCache.java`
#### Snippet
```java
        secondGenerationQueue = new LinkedHashMap<K, V>() {
            @Override
            protected boolean removeEldestEntry(final Map.Entry<K, V> eldest) {
                final boolean result = size() > secondGenSizeBound;
                if (result) {
```

### BoundedWildcard
Can generalize to `? extends V`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/ObjectCache.java`
#### Snippet
```java
        secondGenerationQueue = new LinkedHashMap<K, V>() {
            @Override
            protected boolean removeEldestEntry(final Map.Entry<K, V> eldest) {
                final boolean result = size() > secondGenSizeBound;
                if (result) {
```

### BoundedWildcard
Can generalize to `? extends K`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/ObjectCache.java`
#### Snippet
```java
        firstGenerationQueue = new LinkedHashMap<K, V>() {
            @Override
            protected boolean removeEldestEntry(final Map.Entry<K, V> eldest) {
                final boolean result = size() + secondGenerationQueue.size() > ObjectCache.this.size;
                if (result) {
```

### BoundedWildcard
Can generalize to `? extends V`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/ObjectCache.java`
#### Snippet
```java
        firstGenerationQueue = new LinkedHashMap<K, V>() {
            @Override
            protected boolean removeEldestEntry(final Map.Entry<K, V> eldest) {
                final boolean result = size() + secondGenerationQueue.size() > ObjectCache.this.size;
                if (result) {
```

### BoundedWildcard
Can generalize to `? extends K`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashMap.java`
#### Snippet
```java

    @Nullable
    private HashMap.Entry<K, V> copyEntry(@Nullable final Entry<K, V> sourceEntry) {
        return sourceEntry == null ? null :
            new Entry<>(sourceEntry.key, sourceEntry.value, copyEntry(sourceEntry.hashNext));
```

### BoundedWildcard
Can generalize to `? extends V`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashMap.java`
#### Snippet
```java

    @Nullable
    private HashMap.Entry<K, V> copyEntry(@Nullable final Entry<K, V> sourceEntry) {
        return sourceEntry == null ? null :
            new Entry<>(sourceEntry.key, sourceEntry.value, copyEntry(sourceEntry.hashNext));
```

### BoundedWildcard
Can generalize to `? super K`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistentHashSet.java`
#### Snippet
```java

        @Override
        public void forEachKey(ObjectProcedure<K> procedure) {
            for (K k : keys) {
                procedure.execute(k);
```

### BoundedWildcard
Can generalize to `? super K`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistentHashSet.java`
#### Snippet
```java

        @Override
        public void forEachKey(ObjectProcedure<K> procedure) {
            for (Object target : table) {
                if (target instanceof Node) {
```

### BoundedWildcard
Can generalize to `? extends PersistentLongMap.Entry`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentLong23TreeSet.java`
#### Snippet
```java
        private final Iterator<PersistentLongMap.Entry<Boolean>> it;

        IteratorImpl(Iterator<PersistentLongMap.Entry<Boolean>> it) {
            this.it = it;
        }
```

### BoundedWildcard
Can generalize to `? extends K`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/Persistent23Tree.java`
#### Snippet
```java
         * @return root of the constructed tree
         */
        private Node<K> makeNode(@NotNull Iterator<K> iterator, int size, int toDepth) {
            if (size <= 0) {
                return null;
```

### BoundedWildcard
Can generalize to `? extends T`
in `utils/src/main/java/jetbrains/exodus/util/SpinAllocator.java`
#### Snippet
```java

    @SuppressWarnings({"unchecked"})
    public SpinAllocator(final ICreator<T> creator, final IDisposer<T> disposer, int maxAllocations) {
        this.creator = creator;
        this.disposer = disposer;
```

### BoundedWildcard
Can generalize to `? super T`
in `utils/src/main/java/jetbrains/exodus/util/SpinAllocator.java`
#### Snippet
```java

    @SuppressWarnings({"unchecked"})
    public SpinAllocator(final ICreator<T> creator, final IDisposer<T> disposer, int maxAllocations) {
        this.creator = creator;
        this.disposer = disposer;
```

### BoundedWildcard
Can generalize to `? super K`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentObjectCache.java`
#### Snippet
```java

        static <K, V> Root<K, V> getClone(@Nullable final Root<K, V> sourceRoot,
                                          @Nullable final EvictListener<K, V> listener,
                                          final int firstGenSizeBound, final int secondGenSizeBound) {
            if (listener == null) {
```

### BoundedWildcard
Can generalize to `? super V`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentObjectCache.java`
#### Snippet
```java

        static <K, V> Root<K, V> getClone(@Nullable final Root<K, V> sourceRoot,
                                          @Nullable final EvictListener<K, V> listener,
                                          final int firstGenSizeBound, final int secondGenSizeBound) {
            if (listener == null) {
```

### BoundedWildcard
Can generalize to `? super K`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentLinkedHashMap.java`
#### Snippet
```java
        }

        public void forEachKey(final ObjectProcedure<K> procedure) {
            mapMutable.forEachKey(object -> procedure.execute(object.getKey()));
        }
```

### BoundedWildcard
Can generalize to `? super K`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentLinkedHashMap.java`
#### Snippet
```java
        }

        public void forEachEntry(final PairProcedure<K, V> procedure) {
            mapMutable.forEachKey(object -> procedure.execute(object.getKey(), object.getValue().getValue()));
        }
```

### BoundedWildcard
Can generalize to `? super V`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentLinkedHashMap.java`
#### Snippet
```java
        }

        public void forEachEntry(final PairProcedure<K, V> procedure) {
            mapMutable.forEachKey(object -> procedure.execute(object.getKey(), object.getValue().getValue()));
        }
```

### BoundedWildcard
Can generalize to `? super T`
in `openAPI/src/main/java/jetbrains/exodus/bindings/ComparableSet.java`
#### Snippet
```java
    }

    public void forEach(@NotNull final Consumer<T> action) {
        int index = 0;
        for (final T item : set) {
```

### BoundedWildcard
Can generalize to `? super LongIntPair`
in `environment/src/main/java/jetbrains/exodus/io/AsyncFileDataWriter.java`
#### Snippet
```java

        private WriteCompletionHandler(@NotNull ByteBuffer buffer,
                                       @NotNull CompletableFuture<LongIntPair> future,
                                       @NotNull LockingManager lockingManager,
                                       @NotNull AsynchronousFileChannel channel, final long position,
```

### BoundedWildcard
Can generalize to `? super String`
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/chronicle/JMHChronicleMapTokyoCabinetBenchmarkBase.java`
#### Snippet
```java
    }

    void writeSuccessiveKeys(@NotNull final Map<String, String> store) {
        for (final String key : successiveKeys) {
            store.put(key, key);
```

### BoundedWildcard
Can generalize to `? super String`
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/chronicle/JMHChronicleMapTokyoCabinetBenchmarkBase.java`
#### Snippet
```java
    }

    void writeSuccessiveKeys(@NotNull final Map<String, String> store) {
        for (final String key : successiveKeys) {
            store.put(key, key);
```

### BoundedWildcard
Can generalize to `? extends Snapshot`
in `environment/src/main/java/jetbrains/exodus/env/TransactionSet.java`
#### Snippet
```java
        volatile Snapshot max;

        MinMaxAwareSnapshotSet(@NotNull final PersistentHashSet<Snapshot> set,
                               @Nullable final Snapshot min, @Nullable final Snapshot max) {
            this.set = set;
```

### BoundedWildcard
Can generalize to `? super Condition`
in `environment/src/main/java/jetbrains/exodus/env/ReentrantTransactionDispatcher.java`
#### Snippet
```java

    private void waitForPermits(@NotNull final Thread thread,
                                @NotNull final NavigableMap<Long, Condition> queue,
                                final int permits,
                                final int currentThreadPermits) {
```

### BoundedWildcard
Can generalize to `? extends Condition`
in `environment/src/main/java/jetbrains/exodus/env/ReentrantTransactionDispatcher.java`
#### Snippet
```java
    }

    private static boolean notifyNextWaiter(@NotNull final NavigableMap<Long, Condition> queue) {
        if (!queue.isEmpty()) {
            queue.firstEntry().getValue().signal();
```

### BoundedWildcard
Can generalize to `? super PageHolder`
in `environment/src/main/java/jetbrains/exodus/log/BufferedDataWriter.java`
#### Snippet
```java
    private static void computeWriteCache(NonBlockingHashMapLong<PageHolder> writeCache,
                                          final long pageAddress,
                                          final LongObjectBifFunction<PageHolder, PageHolder> remappingFunction) {
        retry:
        for (; ; ) {
```

### BoundedWildcard
Can generalize to `? super RandomAccessLoggable`
in `environment/src/main/java/jetbrains/exodus/tree/btree/LeafNodeDup.java`
#### Snippet
```java

    @Nullable
    static RandomAccessLoggable collect(@NotNull final List<RandomAccessLoggable> output,
                                        @NotNull RandomAccessLoggable loggable,
                                        @NotNull final Iterator<RandomAccessLoggable> loggables) {
```

### BoundedWildcard
Can generalize to `? extends RandomAccessLoggable`
in `environment/src/main/java/jetbrains/exodus/tree/btree/LeafNodeDup.java`
#### Snippet
```java
    static RandomAccessLoggable collect(@NotNull final List<RandomAccessLoggable> output,
                                        @NotNull RandomAccessLoggable loggable,
                                        @NotNull final Iterator<RandomAccessLoggable> loggables) {
        while (true) {
            switch (loggable.getType()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/mapdb/JMHMapDbTokyoCabinetBenchmarkBase.java`
#### Snippet
```java
    }

    void writeSuccessiveKeys(@NotNull final Map<String, String> store) {
        for (final String key : successiveKeys) {
            store.put(key, key);
```

### BoundedWildcard
Can generalize to `? super String`
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/mapdb/JMHMapDbTokyoCabinetBenchmarkBase.java`
#### Snippet
```java
    }

    void writeSuccessiveKeys(@NotNull final Map<String, String> store) {
        for (final String key : successiveKeys) {
            store.put(key, key);
```

### BoundedWildcard
Can generalize to `? super TreePos`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
    }

    static <K extends Comparable<K>> boolean getLess(Node<K> node, Stack<TreePos<K>> stack) {
        stack.push(new TreePos<>(node));
        return false;
```

### BoundedWildcard
Can generalize to `? extends Entity`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIterableBase.java`
#### Snippet
```java
    }

    public EntityIterable findLinks(@NotNull final Iterable<Entity> entities,
                                    @NotNull final String linkName) {
        if (entities instanceof EntityIterable) {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
    private EntityIterableBase getPropertyIterable(@NotNull final String entityType,
                                                   @NotNull final String propertyName,
                                                   @NotNull final BiFunction<Integer, Integer, EntityIterableBase> instantiator) {
        final int entityTypeId = store.getEntityTypeId(this, entityType, false);
        if (entityTypeId < 0) {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
    private EntityIterableBase getPropertyIterable(@NotNull final String entityType,
                                                   @NotNull final String propertyName,
                                                   @NotNull final BiFunction<Integer, Integer, EntityIterableBase> instantiator) {
        final int entityTypeId = store.getEntityTypeId(this, entityType, false);
        if (entityTypeId < 0) {
```

### BoundedWildcard
Can generalize to `? extends EntityIterableBase`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
    private EntityIterableBase getPropertyIterable(@NotNull final String entityType,
                                                   @NotNull final String propertyName,
                                                   @NotNull final BiFunction<Integer, Integer, EntityIterableBase> instantiator) {
        final int entityTypeId = store.getEntityTypeId(this, entityType, false);
        if (entityTypeId < 0) {
```

### BoundedWildcard
Can generalize to `? extends EntityIterable`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java

    @NotNull
    public EntityIterable mergeSorted(@NotNull final List<EntityIterable> sorted,
                                      @NotNull ComparableGetter valueGetter,
                                      @NotNull final Comparator<Comparable<Object>> comparator) {
```

### BoundedWildcard
Can generalize to `? super Updatable`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java

        HandleCheckerAdapter(@NotNull PersistentStoreTransaction txn,
                             @NotNull List<Updatable> mutatedInTxn,
                             @NotNull EntityIterableCacheAdapterMutable mutableCache) {
            this.txn = txn;
```

### BoundedWildcard
Can generalize to `? extends EntityIterable`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
    @Deprecated
    @NotNull
    public EntityIterable mergeSorted(@NotNull final List<EntityIterable> sorted,
                                      @NotNull final Comparator<Entity> comparator) {
        List<EntityIterable> filtered = null;
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `utils/src/main/java/jetbrains/exodus/core/execution/MultiThreadDelegatingJobProcessor.java`
#### Snippet
```java

public abstract class MultiThreadDelegatingJobProcessor extends JobProcessorAdapter {
    private final static String UNSUPPORTED_TIMED_JOBS_MESSAGE =
            "Timed jobs are not supported by MultiThreadDelegatingJobProcessor";

```

### MissortedModifiers
Missorted modifiers `final static`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
    }

    private final static class ItemIterator<V> implements Iterator<PersistentLongMap.Entry<V>> {
        @NotNull
        private final Iterator<Entry> iterator;
```

### MissortedModifiers
Missorted modifiers `final static`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
    }

    private final static class ReverseItemIterator<V> implements Iterator<PersistentLongMap.Entry<V>> {
        @NotNull
        private final Iterator<Entry> iterator;
```

### MissortedModifiers
Missorted modifiers `final static`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
    }

    private final static class ItemTailIterator<V> implements Iterator<PersistentLongMap.Entry<V>> {
        @NotNull
        private final Iterator<Entry> iterator;
```

### MissortedModifiers
Missorted modifiers `final static`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
    }

    private final static class ReverseItemTailIterator<V> implements Iterator<PersistentLongMap.Entry<V>> {
        @NotNull
        private final Iterator<Entry> iterator;
```

### MissortedModifiers
Missorted modifiers `final static`
in `openAPI/src/main/java/jetbrains/exodus/AbstractConfig.java`
#### Snippet
```java
    private static final String UNSUPPORTED_TYPE_ERROR_MSG = "Unsupported value type";
    @NonNls
    private final static ThreadLocal<Boolean> listenersSuppressed = ThreadLocal.withInitial(() -> false);
    @NotNull
    private final Map<String, Object> settings;
```

## RuleId[ruleID=NegativeIntConstantInLongContext]
### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `openAPI/src/main/java/jetbrains/exodus/bindings/BindingUtils.java`
#### Snippet
```java

    public static int readInt(@NotNull final ByteArrayInputStream stream) {
        return (int) (readUnsignedInt(stream) ^ 0x80000000);
    }

```

## RuleId[ruleID=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `openAPI/src/main/java/jetbrains/exodus/CompoundByteIteratorBase.java`
#### Snippet
```java
    public long skip(final long length) {
        long skipped = 0;
        while (current != null) {
            skipped += current.skip(length - skipped);
            if (skipped >= length || !hasNext()) {
```

## RuleId[ruleID=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `environment/src/main/java/jetbrains/exodus/tree/TreeCursorMutable.java`
#### Snippet
```java
            // move to remembered next
            final ByteIterable key = nextAfterRemovedKey;
            if (key != null) {
                if (traverser.moveTo(key, tree.isAllowingDuplicates() ? nextAfterRemovedValue : null)) {
                    inited = true;
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `entity-store/src/main/java/jetbrains/exodus/entitystore/tables/LinksTable.java`
#### Snippet
```java
                       final int linkId) {
        final PropertyKey linkKey = new PropertyKey(localId, linkId);
        boolean success = super.put(txn, PropertyKey.propertyKeyToEntry(linkKey), value);
        if (noOldValue) {
            success |= allLinksIndex.put(txn, linkId, localId);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `entity-store/src/main/java/jetbrains/exodus/entitystore/tables/LinksTable.java`
#### Snippet
```java
                          final int linkId) {
        PropertyKey linkKey = new PropertyKey(localId, linkId);
        boolean success = super.delete(txn, PropertyKey.propertyKeyToEntry(linkKey), value);
        if (noNewValue) {
            success |= deleteAllIndex(txn, linkId, localId);
```

## RuleId[ruleID=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/decorators/QueueDecorator.java`
#### Snippet
```java
    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        return decorated.containsAll(c);
    }

```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/env/tokyo/JMHEnvTokyoCabinetWriteBenchmark.java`
#### Snippet
```java
    public void randomWrite() {
        for (final ByteIterable key : randomKeys) {
            env.executeInTransaction(txn -> {
                store.add(txn, key, key);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/env/tokyo/JMHEnvTokyoCabinetWriteBenchmark.java`
#### Snippet
```java
    public void successiveWrite() {
        for (final ByteIterable key : successiveKeys) {
            env.executeInTransaction(txn -> {
                store.add(txn, key, key);
            });
```

## RuleId[ruleID=MemberVisibilityCanBePrivate]
### MemberVisibilityCanBePrivate
Function 'sortInMemory' could be private
in `query/src/main/kotlin/jetbrains/exodus/query/SortEngine.kt`
#### Snippet
```java
    }

    protected fun sortInMemory(source: Iterable<Entity>, comparator: Comparator<Entity>): Iterable<Entity> {
        return if (source is InMemorySortIterable) {
            InMemoryMergeSortIterable(source, MergedComparator(source.comparator, comparator))
```

### MemberVisibilityCanBePrivate
Property 'capacity' could be private
in `query/src/main/kotlin/jetbrains/exodus/query/InMemoryBoundedHeapSortIterable.kt`
#### Snippet
```java
import java.util.*

class InMemoryBoundedHeapSortIterable(val capacity: Int, source: Iterable<Entity>, comparator: Comparator<Entity>) : InMemoryQueueSortIterable(source, comparator) {

    override fun createQueue(unsorted: Collection<Entity>): Queue<Entity> {
```

### MemberVisibilityCanBePrivate
Property 'promptString' could be private
in `sshd/src/main/kotlin/jetbrains/exodus/javascript/Interop.kt`
#### Snippet
```java
    val store: PersistentEntityStoreImpl? get() = entityStore

    val promptString: String
        get() {
            val env = environment
```

### MemberVisibilityCanBePrivate
Property 'config' could be private
in `sshd/src/main/kotlin/jetbrains/exodus/javascript/RhinoCommand.kt`
#### Snippet
```java
import java.io.*

abstract class RhinoCommand(protected val config: Map<String, *>) : Job(), Command {

    companion object {
```

### MemberVisibilityCanBePrivate
Function 'isCached' could be private
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/IntObjectCacheBase.kt`
#### Snippet
```java
    open fun removeLocked(key: Int) = newCriticalSection().use { remove(key) }

    fun isCached(key: Int) = getObjectLocked(key) != null

    fun size() = size
```

### MemberVisibilityCanBePrivate
Property 'JAVA_MINOR_VERSION' could be private
in `utils/src/main/kotlin/jetbrains/exodus/system/JVMConstants.kt`
#### Snippet
```java
    val JAVA_SPEC_VERSION = System.getProperty("java.specification.version")
    val JAVA_MAJOR_VERSION: Int
    val JAVA_MINOR_VERSION: Int
    val IS_JAVA8_OR_HIGHER: Boolean
    val IS_JAVA9_OR_HIGHER: Boolean
```

### MemberVisibilityCanBePrivate
Property 'JAVA_SPEC_VERSION' could be private
in `utils/src/main/kotlin/jetbrains/exodus/system/JVMConstants.kt`
#### Snippet
```java
object JVMConstants {

    val JAVA_SPEC_VERSION = System.getProperty("java.specification.version")
    val JAVA_MAJOR_VERSION: Int
    val JAVA_MINOR_VERSION: Int
```

### MemberVisibilityCanBePrivate
Property 'JAVA_MAJOR_VERSION' could be private
in `utils/src/main/kotlin/jetbrains/exodus/system/JVMConstants.kt`
#### Snippet
```java

    val JAVA_SPEC_VERSION = System.getProperty("java.specification.version")
    val JAVA_MAJOR_VERSION: Int
    val JAVA_MINOR_VERSION: Int
    val IS_JAVA8_OR_HIGHER: Boolean
```

### MemberVisibilityCanBePrivate
Function 'isCached' could be private
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/LongObjectCacheBase.kt`
#### Snippet
```java
    open fun removeLocked(key: Long) = newCriticalSection().use { remove(key) }

    fun isCached(key: Long) = getObjectLocked(key) != null

    fun size() = size
```

### MemberVisibilityCanBePrivate
Function 'newBackupable' could be private
in `crypto/src/main/kotlin/jetbrains/exodus/crypto/convert/ArchiveBackupableFactory.kt`
#### Snippet
```java
    private val separators = charArrayOf('\\', '/')

    fun newBackupable(stream: InputStream, gzip: Boolean) = Backupable {
        newArchiveBackupStrategy(ArchiveStreamFactory().createArchiveInputStream(BufferedInputStream(if (gzip) {
            GZIPInputStream(stream)
```

### MemberVisibilityCanBePrivate
Property 'temporaryFolder' could be private
in `benchmarks/src/jmh/kotlin/jetbrains/exodus/benchmark/query/InMemorySortBenchmarkBase.kt`
#### Snippet
```java
open class InMemorySortBenchmarkBase {
    lateinit var store: PersistentEntityStoreImpl
    lateinit var temporaryFolder: TemporaryFolder

    private val comparator = compareBy<Entity> { it.getProperty("int") }
```

### MemberVisibilityCanBePrivate
Property 'fileDataReader' could be private
in `environment/src/main/kotlin/jetbrains/exodus/io/WatchingFileDataReader.kt`
#### Snippet
```java
class WatchingFileDataReader(
    private val envGetter: () -> EnvironmentImpl?,
    internal val fileDataReader: FileDataReader
) : DataReader {

```

### MemberVisibilityCanBePrivate
Function 'newFileDataReader' could be private
in `environment/src/main/kotlin/jetbrains/exodus/io/WatchingFileDataReaderWriterProvider.kt`
#### Snippet
```java
    override fun isReadonly() = true

    fun newFileDataReader(location: String) =
        WatchingFileDataReader({ env }, nonWatchingFileDataReader(location).apply {
            usedWithWatcher = true
```

### MemberVisibilityCanBePrivate
Function 'newFileDataWriter' could be private
in `environment/src/main/kotlin/jetbrains/exodus/io/WatchingFileDataReaderWriterProvider.kt`
#### Snippet
```java
        })

    fun newFileDataWriter() =
        WatchingFileDataWriter()

```

### MemberVisibilityCanBePrivate
Function 'ensureCapacity' could be private
in `environment/src/main/kotlin/jetbrains/exodus/io/inMemory/Memory.kt`
#### Snippet
```java
        override fun refresh() = this

        fun ensureCapacity(minCapacity: Int) {
            val oldCapacity = data.size
            if (minCapacity > oldCapacity) {
```

### MemberVisibilityCanBePrivate
Property 'memoryUsagePercentage' could be private
in `environment/src/main/kotlin/jetbrains/exodus/log/LogCache.kt`
#### Snippet
```java

    internal val memoryUsage: Long
    protected val memoryUsagePercentage: Int
    internal val pageSize: Int

```

### MemberVisibilityCanBePrivate
Property 'gcMovedBytes' could be private
in `environment/src/main/kotlin/jetbrains/exodus/debug/TxnProfiler.kt`
#### Snippet
```java
    var gcTransactions: Long = 0L
        private set
    var gcMovedBytes: Long = 0L
        private set
    private val readonlyTxns = StackTraceMap()
```

### MemberVisibilityCanBePrivate
Property 'gcTransactions' could be private
in `environment/src/main/kotlin/jetbrains/exodus/debug/TxnProfiler.kt`
#### Snippet
```java
class TxnProfiler : KLogging() {

    var gcTransactions: Long = 0L
        private set
    var gcMovedBytes: Long = 0L
```

### MemberVisibilityCanBePrivate
Function 'getStickyObjectUnsafe' could be private
in `entity-store/src/main/kotlin/jetbrains/exodus/entitystore/EntityIterableCacheAdapter.kt`
#### Snippet
```java
    fun adjustHitRate() = cache.adjustHitRate()

    fun getStickyObjectUnsafe(handle: EntityIterableHandle): Updatable? = stickyObjects[handle]

    fun getStickyObject(handle: EntityIterableHandle): Updatable {
```

### MemberVisibilityCanBePrivate
Function 'getCachedCount' could be private
in `entity-store/src/main/kotlin/jetbrains/exodus/entitystore/EntityIterableCache.kt`
#### Snippet
```java
    }

    fun getCachedCount(handle: EntityIterableHandle): Long? {
        val identity = handle.identity
        iterableCountsCache.tryKey(identity)?.let { (count, time) ->
```

### MemberVisibilityCanBePrivate
Function 'openExistingFile' could be private
in `lucene-directory/src/main/kotlin/jetbrains/exodus/lucene/ExodusDirectory.kt`
#### Snippet
```java
    internal fun nextTicks() = ticks.getAndIncrement()

    internal fun openExistingFile(txn: Transaction, name: String) =
        vfs.openFile(txn, name, false) ?: throw FileNotFoundException(name)

```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
Method only calls its super
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/query/InMemorySortBenchmark.java`
#### Snippet
```java
    @Measurement(iterations = MEASUREMENT_ITERATIONS)
    @Fork(FORKS)
    public long testMergeSort() {
        return super.testMergeSort();
    }
```

### EmptyMethod
Method only calls its super
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/query/InMemorySortBenchmark.java`
#### Snippet
```java
    @Measurement(iterations = MEASUREMENT_ITERATIONS)
    @Fork(FORKS)
    public long testMergeSortWithArrayList() {
        return super.testMergeSortWithArrayList();
    }
```

### EmptyMethod
Method only calls its super
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/query/InMemorySortBenchmark.java`
#### Snippet
```java
    @Measurement(iterations = MEASUREMENT_ITERATIONS)
    @Fork(FORKS)
    public long testMergeSortWithValueGetter() {
        return super.testMergeSortWithValueGetter();
    }
```

### EmptyMethod
Method only calls its super
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/query/InMemorySortBenchmark.java`
#### Snippet
```java
    @Measurement(iterations = MEASUREMENT_ITERATIONS)
    @Fork(FORKS)
    public long testTimSort() {
        return super.testTimSort();
    }
```

### EmptyMethod
Method only calls its super
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/query/InMemorySortBenchmark.java`
#### Snippet
```java
    @Measurement(iterations = MEASUREMENT_ITERATIONS)
    @Fork(FORKS)
    public long testQuickSort() {
        return super.testQuickSort();
    }
```

### EmptyMethod
Method only calls its super
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/query/InMemorySortBenchmark.java`
#### Snippet
```java
    @Measurement(iterations = MEASUREMENT_ITERATIONS)
    @Fork(FORKS)
    public long testHeapSort() {
        return super.testHeapSort();
    }
```

### EmptyMethod
Method only calls its super
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/query/InMemorySortBenchmark.java`
#### Snippet
```java
    @Measurement(iterations = MEASUREMENT_ITERATIONS)
    @Fork(FORKS)
    public long testHeapSortWithValueGetter() {
        return super.testHeapSortWithValueGetter();
    }
```

### EmptyMethod
Method only calls its super
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/query/InMemorySortBenchmark.java`
#### Snippet
```java
    @Measurement(iterations = MEASUREMENT_ITERATIONS)
    @Fork(FORKS)
    public long testNoSort() {
        return super.testNoSort();
    }
```

### EmptyMethod
Method only calls its super
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/query/InMemorySortBenchmark.java`
#### Snippet
```java
    @Measurement(iterations = MEASUREMENT_ITERATIONS)
    @Fork(FORKS)
    public long testKeapSort() {
        return super.testKeapSort();
    }
```

### EmptyMethod
Method only calls its super
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/query/InMemorySortBenchmark.java`
#### Snippet
```java
    @Measurement(iterations = MEASUREMENT_ITERATIONS)
    @Fork(FORKS)
    public long testBoundedSort() {
        return super.testBoundedSort();
    }
```

### EmptyMethod
All implementations of this method are empty
in `entity-store/src/main/java/jetbrains/exodus/entitystore/EntityIterableHandle.java`
#### Snippet
```java
    boolean isConsistent();

    void resetBirthTime();

    boolean isExpired();
```

### EmptyMethod
The method is empty
in `environment/src/main/java/jetbrains/exodus/tree/btree/AddressIterator.java`
#### Snippet
```java
    }

    public void skipSubTree() {
        // TODO: implement (for Reflect utility only)
    }
```

### EmptyMethod
The method is empty
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverserDup.java`
#### Snippet
```java
    }

    protected void popUntilDupLeft() {
        /*if (false) {
            final int bottom = 0;
```

### EmptyMethod
The method is empty
in `environment/src/main/java/jetbrains/exodus/tree/patricia/AddressIterator.java`
#### Snippet
```java
    }

    public void skipSubTree() {
        //TODO: implement (for Reflect utility only)
    }
```

### EmptyMethod
All implementations of this method are empty
in `environment/src/main/kotlin/jetbrains/exodus/log/BlockListener.kt`
#### Snippet
```java
    fun blockCreated(block: Block)

    fun beforeBlockDeleted(block: Block)
    fun afterBlockDeleted(address: Long)

```

### EmptyMethod
All implementations of this method are empty
in `environment/src/main/kotlin/jetbrains/exodus/log/BlockListener.kt`
#### Snippet
```java

    fun beforeBlockDeleted(block: Block)
    fun afterBlockDeleted(address: Long)

    fun blockModified(block: Block)
```

### EmptyMethod
All implementations of this method are empty
in `environment/src/main/kotlin/jetbrains/exodus/log/BlockListener.kt`
#### Snippet
```java
    fun afterBlockDeleted(address: Long)

    fun blockModified(block: Block)
}

```

### EmptyMethod
The method is empty
in `environment/src/main/kotlin/jetbrains/exodus/tree/ExpiredLoggableCollection.kt`
#### Snippet
```java
    companion object {
        @JvmStatic
        val EMPTY = EmptyLoggableCollection()

        @JvmStatic
```

### EmptyMethod
All implementations of this method are empty
in `openAPI/src/main/java/jetbrains/exodus/env/Store.java`
#### Snippet
```java
     */
    @Deprecated
    void close();

    /**
```

### EmptyMethod
The method is empty
in `query/src/main/kotlin/jetbrains/exodus/query/QueryEngine.kt`
#### Snippet
```java
    open fun isPersistentIterable(it: Iterable<Entity>): Boolean = it.isPersistent

    open fun assertOperational() {}

    open fun isWrapped(it: Iterable<Entity>?): Boolean = true
```

### EmptyMethod
All implementations of this method are empty
in `utils/src/main/java/jetbrains/exodus/core/execution/JobProcessor.java`
#### Snippet
```java
    boolean isSuspended();

    void beforeProcessingJob(@NotNull final Job job);

    void afterProcessingJob(@NotNull final Job job);
```

### EmptyMethod
All implementations of this method are empty
in `utils/src/main/java/jetbrains/exodus/core/execution/JobProcessor.java`
#### Snippet
```java
    void beforeProcessingJob(@NotNull final Job job);

    void afterProcessingJob(@NotNull final Job job);

    @Nullable
```

### EmptyMethod
The method is empty
in `utils/src/main/java/jetbrains/exodus/core/execution/JobProcessorAdapter.java`
#### Snippet
```java
    protected abstract Job pushAt(Job job, long millis);

    protected void processorStarted() {
    }

```

### EmptyMethod
The method is empty
in `utils/src/main/java/jetbrains/exodus/core/execution/JobProcessorAdapter.java`
#### Snippet
```java
    }

    protected void processorFinished() {
    }

```

### EmptyMethod
All implementations of this method are empty
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/IntObjectCacheBase.kt`
#### Snippet
```java
    abstract fun clear()

    abstract fun lock()

    abstract fun unlock()
```

### EmptyMethod
All implementations of this method are empty
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/IntObjectCacheBase.kt`
#### Snippet
```java
    abstract fun lock()

    abstract fun unlock()

    abstract fun tryKey(key: Int): V?
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/AddNullStaticTypedEntityIterable.java`
#### Snippet
```java
        return () -> new Iterator<Entity>() {
            private Iterator<Entity> iterator = null;
            private Boolean hasNull = null;

            @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/AddNullStaticTypedEntityIterable.java`
#### Snippet
```java
        }
        return () -> new Iterator<Entity>() {
            private Iterator<Entity> iterator = null;
            private Boolean hasNull = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/ExcludeNullStaticTypedEntityIterable.java`
#### Snippet
```java
        return () -> new Iterator<Entity>() {
            private Iterator<Entity> iterator = null;
            private Entity next = null;

            @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/ExcludeNullStaticTypedEntityIterable.java`
#### Snippet
```java
        }
        return () -> new Iterator<Entity>() {
            private Iterator<Entity> iterator = null;
            private Entity next = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/AssociationEndMetaDataImpl.java`
#### Snippet
```java
    private EntityMetaData emd = null;
    private String emdType = null;
    private AssociationEndCardinality cardinality = null;
    private String associationMetaDataName = null;
    private AssociationMetaData associationMetaData = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/AssociationEndMetaDataImpl.java`
#### Snippet
```java
    private AssociationEndType type = null;
    private String oppositeEndName = null;
    private boolean cascadeDelete = false;
    private boolean clearOnDelete = false;
    private boolean targetCascadeDelete = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/AssociationEndMetaDataImpl.java`
#### Snippet
```java
    private AssociationEndCardinality cardinality = null;
    private String associationMetaDataName = null;
    private AssociationMetaData associationMetaData = null;
    private AssociationEndType type = null;
    private String oppositeEndName = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/AssociationEndMetaDataImpl.java`
#### Snippet
```java

    private String name = null;
    private EntityMetaData emd = null;
    private String emdType = null;
    private AssociationEndCardinality cardinality = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/AssociationEndMetaDataImpl.java`
#### Snippet
```java
    private boolean clearOnDelete = false;
    private boolean targetCascadeDelete = false;
    private boolean targetClearOnDelete = false;

    public AssociationEndMetaDataImpl() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/AssociationEndMetaDataImpl.java`
#### Snippet
```java
    private AssociationMetaData associationMetaData = null;
    private AssociationEndType type = null;
    private String oppositeEndName = null;
    private boolean cascadeDelete = false;
    private boolean clearOnDelete = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/AssociationEndMetaDataImpl.java`
#### Snippet
```java
    private String oppositeEndName = null;
    private boolean cascadeDelete = false;
    private boolean clearOnDelete = false;
    private boolean targetCascadeDelete = false;
    private boolean targetClearOnDelete = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/AssociationEndMetaDataImpl.java`
#### Snippet
```java
    private String emdType = null;
    private AssociationEndCardinality cardinality = null;
    private String associationMetaDataName = null;
    private AssociationMetaData associationMetaData = null;
    private AssociationEndType type = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/AssociationEndMetaDataImpl.java`
#### Snippet
```java
    private String name = null;
    private EntityMetaData emd = null;
    private String emdType = null;
    private AssociationEndCardinality cardinality = null;
    private String associationMetaDataName = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/AssociationEndMetaDataImpl.java`
#### Snippet
```java
    private String associationMetaDataName = null;
    private AssociationMetaData associationMetaData = null;
    private AssociationEndType type = null;
    private String oppositeEndName = null;
    private boolean cascadeDelete = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/AssociationEndMetaDataImpl.java`
#### Snippet
```java
public class AssociationEndMetaDataImpl implements AssociationEndMetaData {

    private String name = null;
    private EntityMetaData emd = null;
    private String emdType = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/AssociationEndMetaDataImpl.java`
#### Snippet
```java
    private boolean cascadeDelete = false;
    private boolean clearOnDelete = false;
    private boolean targetCascadeDelete = false;
    private boolean targetClearOnDelete = false;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/ModelMetaDataImpl.java`
#### Snippet
```java
    private final Set<EntityMetaData> entityMetaDatas = new HashSet<>();
    private final Map<String, AssociationMetaData> associationMetaDatas = new ConcurrentHashMap<>();
    private volatile Map<String, EntityMetaData> typeToEntityMetaDatas = null;

    public void init() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java

    private volatile Map<String, Set<Index>> fieldToIndexes = null;
    private volatile Set<Index> indexes = null;
    private volatile List<String> allSubTypes = null;
    private volatile Map<String, Set<String>> incomingAssociations = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java

    private final AtomicReference<ModelMetaData> modelMetaData;
    private String type = null;
    private String superType = null;
    private final Set<String> interfaces = new LinkedHashSetDecorator<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
    private volatile Set<Index> indexes = null;
    private volatile List<String> allSubTypes = null;
    private volatile Map<String, Set<String>> incomingAssociations = null;
    private volatile Ends ends = null;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
    private Runnable initializer = null;
    private boolean removeOrphan = true;
    private boolean isAbstract = false;
    private final Set<String> subTypes = new LinkedHashSetDecorator<>();
    private List<String> thisAndSuperTypes = Collections.emptyList();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
    private String superType = null;
    private final Set<String> interfaces = new LinkedHashSetDecorator<>();
    private Runnable initializer = null;
    private boolean removeOrphan = true;
    private boolean isAbstract = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
    private volatile Map<String, Set<Index>> fieldToIndexes = null;
    private volatile Set<Index> indexes = null;
    private volatile List<String> allSubTypes = null;
    private volatile Map<String, Set<String>> incomingAssociations = null;
    private volatile Ends ends = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
    private Set<String> requiredIfProperties = Collections.emptySet();

    private volatile Map<String, Set<Index>> fieldToIndexes = null;
    private volatile Set<Index> indexes = null;
    private volatile List<String> allSubTypes = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
    private final AtomicReference<ModelMetaData> modelMetaData;
    private String type = null;
    private String superType = null;
    private final Set<String> interfaces = new LinkedHashSetDecorator<>();
    private Runnable initializer = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
    private final Set<String> subTypes = new LinkedHashSetDecorator<>();
    private List<String> thisAndSuperTypes = Collections.emptyList();
    private Set<AssociationEndMetaData> externalAssociationEnds = null;
    private final Map<String, PropertyMetaData> properties = new HashMapDecorator<>();
    private Set<Index> ownIndexes = Collections.emptySet();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
    private volatile List<String> allSubTypes = null;
    private volatile Map<String, Set<String>> incomingAssociations = null;
    private volatile Ends ends = null;

    public EntityMetaDataImpl() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/ReleaseLatch.java`
#### Snippet
```java
class ReleaseLatch extends Latch {

    protected Thread owner = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/DebugLatch.java`
#### Snippet
```java
    private static final DateFormat df = new SimpleDateFormat("dd MMM yyyy kk:mm:ss,SSS");

    private Date acquireTime = null;
    private StackTraceElement[] acquireTrace = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `utils/src/main/java/jetbrains/exodus/core/execution/locks/DebugLatch.java`
#### Snippet
```java

    private Date acquireTime = null;
    private StackTraceElement[] acquireTrace = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntHashSet.java`
#### Snippet
```java

        private final Entry[] table = IntHashSet.this.table;
        private int index = 0;
        private Entry e = null;
        private Entry last;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntHashSet.java`
#### Snippet
```java
        private final Entry[] table = IntHashSet.this.table;
        private int index = 0;
        private Entry e = null;
        private Entry last;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntHashMap.java`
#### Snippet
```java
        private final Entry<V>[] table = IntHashMap.this.table;
        private int index = 0;
        private Entry<V> e = null;
        private Entry<V> last;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/IntHashMap.java`
#### Snippet
```java

        private final Entry<V>[] table = IntHashMap.this.table;
        private int index = 0;
        private Entry<V> e = null;
        private Entry<V> last;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashSet.java`
#### Snippet
```java
        private final Entry<E>[] table = HashSet.this.table;
        private int index = 0;
        private Entry<E> e = null;
        private Entry<E> last;
        private boolean holdsNull = HashSet.this.holdsNull;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashSet.java`
#### Snippet
```java

        private final Entry<E>[] table = HashSet.this.table;
        private int index = 0;
        private Entry<E> e = null;
        private Entry<E> last;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LongHashSet.java`
#### Snippet
```java
        private final Entry[] table = LongHashSet.this.table;
        private int index = 0;
        private Entry e = null;
        private Entry last;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/LongHashSet.java`
#### Snippet
```java

        private final Entry[] table = LongHashSet.this.table;
        private int index = 0;
        private Entry e = null;
        private Entry last;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashMap.java`
#### Snippet
```java
        private final Entry<K, V>[] table = HashMap.this.table;
        private int index = -1;
        private Entry<K, V> e = null;
        private Entry<K, V> last;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `utils/src/main/java/jetbrains/exodus/util/DeferredIO.java`
#### Snippet
```java
public class DeferredIO {

    private static volatile JobProcessorAdapter deferredIOProcessor = null;

    private DeferredIO() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
        private final int finishingIndex;

        private Entry currentEntry = null;
        private long currentEntryBase = 0;
        private int next = -1;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
        @NotNull
        private final Iterator<Entry> iterator;
        private Entry currentEntry = null;
        private long currentEntryBase = 0;
        private int next = -1;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
        private final long startingEntryIndex;
        private int startingIndex;
        private Entry currentEntry = null;
        private long currentEntryBase = 0;
        private int next = -1;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
        private final Iterator<Entry> iterator;
        private Entry currentEntry = null;
        private long currentEntryBase = 0;
        private int next = -1;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
        private final Iterator<Entry> iterator;
        private Entry currentEntry = null;
        private long currentEntryBase = 0;
        private int next = -1;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
        private int startingIndex;
        private Entry currentEntry = null;
        private long currentEntryBase = 0;
        private int next = -1;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java

        private Entry currentEntry = null;
        private long currentEntryBase = 0;
        private int next = -1;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentBitTreeLongMap.java`
#### Snippet
```java
        @NotNull
        private final Iterator<Entry> iterator;
        private Entry currentEntry = null;
        private long currentEntryBase = 0;
        private int next = -1;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentObjectCache.java`
#### Snippet
```java
            private Iterator<Pair<K, V>> firstGenIt = current.getFirstGen().beginWrite().iterator();
            private Iterator<Pair<K, V>> secondGenIt = null;
            private K next = null;

            @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentObjectCache.java`
#### Snippet
```java

            private Iterator<Pair<K, V>> firstGenIt = current.getFirstGen().beginWrite().iterator();
            private Iterator<Pair<K, V>> secondGenIt = null;
            private K next = null;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `openAPI/src/main/java/jetbrains/exodus/ByteBufferByteIterable.java`
#### Snippet
```java
        return new ByteIterator() {

            private int index = 0;

            @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `openAPI/src/main/java/jetbrains/exodus/ByteIterableBase.java`
#### Snippet
```java
        return new ByteIterator() {

            private int i = 0;

            @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `openAPI/src/main/java/jetbrains/exodus/ByteIterableBase.java`
#### Snippet
```java
    }

    protected byte[] bytes = null;
    protected int length = -1;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `openAPI/src/main/java/jetbrains/exodus/CompoundByteIterable.java`
#### Snippet
```java
    protected ByteIterator getIterator() {
        return new CompoundByteIteratorBase(iterables[0].iterator()) {
            int off = 0;

            @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `openAPI/src/main/java/jetbrains/exodus/backup/BackupBean.java`
#### Snippet
```java

                            @Nullable
                            private VirtualFileDescriptor next = null;
                            private int i = 0;
                            @NotNull
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `openAPI/src/main/java/jetbrains/exodus/backup/BackupBean.java`
#### Snippet
```java
                            @Nullable
                            private VirtualFileDescriptor next = null;
                            private int i = 0;
                            @NotNull
                            private Iterator<VirtualFileDescriptor> it = EMPTY.getContents().iterator();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/dataStructures/JMHObjectCacheBenchmark.java`
#### Snippet
```java

    final ObjectCacheBase<Integer, String> cache = createCache();
    int existingKey = 0;
    int missingKey = CACHE_SIZE;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/dataStructures/JMHHashMapBenchmark.java`
#### Snippet
```java

    final Map<Integer, String> map = createHashMap();
    int existingKey = 0;
    int missingKey = MAP_SIZE;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/dataStructures/persistent/JMHPersistentLongSetBenchmark.java`
#### Snippet
```java
    private final Object value = new Object();

    private long existingKey = 0;
    private long missingKey = MAP_SIZE;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `environment/src/main/java/jetbrains/exodus/io/SharedOpenFilesCache.java`
#### Snippet
```java
    private static final Object syncObject = new Object();
    private static int cacheSize = 0;
    private static volatile SharedOpenFilesCache theCache = null;

    private final ObjectCache<File, SharedRandomAccessFile> cache;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `environment/src/main/java/jetbrains/exodus/io/SharedOpenFilesCache.java`
#### Snippet
```java

    private static final Object syncObject = new Object();
    private static int cacheSize = 0;
    private static volatile SharedOpenFilesCache theCache = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `environment/src/main/java/jetbrains/exodus/io/SharedMappedFilesCache.java`
#### Snippet
```java
    private static final Object syncObject = new Object();
    @Nullable
    private static volatile SharedMappedFilesCache theCache = null;

    private final long freePhysicalMemoryThreshold;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `environment/src/main/java/jetbrains/exodus/env/EnvironmentBackupStrategyImpl.java`
#### Snippet
```java
        return new Iterable<>() {
            private final File[] files = IOUtil.listFiles(new File(environment.getLocation()));
            private int i = 0;
            private VirtualFileDescriptor next;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `environment/src/main/java/jetbrains/exodus/log/MultiPageByteIterableWithAddress.java`
#### Snippet
```java
    private final Log log;
    private final int length;
    private byte[] bytes = null;


```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `environment/src/main/java/jetbrains/exodus/tree/TreeCursorMutable.java`
#### Snippet
```java
    protected ByteIterable nextAfterRemovedValue = null;
    @Nullable
    private ByteIterable moveToKey = null;
    @Nullable
    private ByteIterable moveToValue = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `environment/src/main/java/jetbrains/exodus/tree/TreeCursorMutable.java`
#### Snippet
```java

    protected ITreeMutable tree;
    protected boolean wasDelete = false;
    @Nullable
    protected ByteIterable nextAfterRemovedKey = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `environment/src/main/java/jetbrains/exodus/tree/TreeCursorMutable.java`
#### Snippet
```java
    private ByteIterable moveToKey = null;
    @Nullable
    private ByteIterable moveToValue = null;

    public TreeCursorMutable(ITreeMutable tree, TreeTraverser traverser) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `environment/src/main/java/jetbrains/exodus/tree/TreeCursorMutable.java`
#### Snippet
```java
    protected ByteIterable nextAfterRemovedKey = null;
    @Nullable
    protected ByteIterable nextAfterRemovedValue = null;
    @Nullable
    private ByteIterable moveToKey = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `environment/src/main/java/jetbrains/exodus/tree/TreeCursorMutable.java`
#### Snippet
```java
    protected boolean wasDelete = false;
    @Nullable
    protected ByteIterable nextAfterRemovedKey = null;
    @Nullable
    protected ByteIterable nextAfterRemovedValue = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeBase.java`
#### Snippet
```java
    @NotNull
    protected final Log log;
    protected DataIterator dataIterator = null;
    @NotNull
    protected final BTreeBalancePolicy balancePolicy;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `environment/src/main/java/jetbrains/exodus/tree/btree/BasePageImmutable.java`
#### Snippet
```java
    byte keyAddressLen;
    private ILeafNode minKey = null;
    private ILeafNode maxKey = null;
    protected final Log log;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `environment/src/main/java/jetbrains/exodus/tree/btree/BasePageImmutable.java`
#### Snippet
```java
    protected final ByteIterableWithAddress data;
    byte keyAddressLen;
    private ILeafNode minKey = null;
    private ILeafNode maxKey = null;
    protected final Log log;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverser.java`
#### Snippet
```java
            int index = 0;
            int currentIteratorPos = 0;
            BasePage currentIteratorNode = null;

            @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverser.java`
#### Snippet
```java
    @NotNull
    protected TreePos[] stack = new TreePos[8];
    protected int top = 0;
    protected BasePage currentNode;
    protected ILeafNode node = ILeafNode.EMPTY;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverser.java`
#### Snippet
```java
    PageIterator iterator() { // for testing purposes
        return new PageIterator() {
            int index = 0;
            int currentIteratorPos = 0;
            BasePage currentIteratorNode = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverser.java`
#### Snippet
```java
        return new PageIterator() {
            int index = 0;
            int currentIteratorPos = 0;
            BasePage currentIteratorNode = null;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `environment/src/main/java/jetbrains/exodus/tree/patricia/EscapingByteIterable.java`
#### Snippet
```java

            private final ByteIterator originIt = origin.iterator();
            private boolean hasEscaped = false;
            private byte escaped = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `environment/src/main/java/jetbrains/exodus/tree/patricia/EscapingByteIterable.java`
#### Snippet
```java
            private final ByteIterator originIt = origin.iterator();
            private boolean hasEscaped = false;
            private byte escaped = 0;

            @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
        return new Iterator<K>() {

            private int i = 0;
            private boolean hasNext;
            private boolean hasNextValid;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
        private Node<K> secondNode;
        private K key;
        boolean sizeChanged = false;

        SplitResult<K> fill(@Nullable Node<K> first, @Nullable K key, @Nullable Node<K> second) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
        return new Iterator<K>() {

            private int i = 0;
            private boolean hasNext;
            private boolean hasNextValid;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentSequence.java`
#### Snippet
```java
    private final AtomicLong val;
    private final AtomicLong lastSavedValue;
    private boolean forcedUpdate = false;

    public PersistentSequence(@NotNull final PersistentStoreTransaction txn,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreBackupStrategy.java`
#### Snippet
```java

            private Iterator<VirtualFileDescriptor> filesIterator = environmentBackupStrategy.getContents().iterator();
            private boolean environmentListed = false;

            @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/Explainer.java`
#### Snippet
```java
    private static final Map<String, Double> WORST_VALUES = new HashMap<>();

    private static Thread forceExplainThread = null;

    private final boolean explainOn;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/util/ImmutableSingleTypeEntityIdCollection.java`
#### Snippet
```java
    public @NotNull Iterator<EntityId> iterator() {
        return new Iterator<EntityId>() {
            private int i = 0;

            @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/FileSystemBlobVaultOld.java`
#### Snippet
```java
                    return new Iterator<VirtualFileDescriptor>() {
                        int i = 0;
                        int n = 0;
                        File[] files;
                        FileDescriptor next;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/FileSystemBlobVaultOld.java`
#### Snippet
```java
                    queue.add(new FileDescriptor(location.toFile(), blobsDirectory + File.separator));
                    return new Iterator<VirtualFileDescriptor>() {
                        int i = 0;
                        int n = 0;
                        File[] files;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIteratorBase.java`
#### Snippet
```java
    }

    private static int nextIdCounter = 0;

    @NotNull
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/SkipEntityIterable.java`
#### Snippet
```java
        return new NonDisposableEntityIterator(this) {

            private EntityIteratorBase sourceIt = null;

            @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/ExcludeNullIterableDecorator.java`
#### Snippet
```java
        return new EntityIteratorBase(ExcludeNullIterableDecorator.this) {
            private final EntityIterator iterator = getDecorated().iterator();
            private EntityId next = null;

            @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
                        entityTableName, linksTableName, secondLinksTableName, propertiesTableName, blobsObsoleteTableName, blobsTableName),
                () -> new Iterator<String>() { // enumerate all property value indexes
                    private int propertyId = 0;

                    @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/TakeEntityIterable.java`
#### Snippet
```java
            @NotNull
            private final EntityIteratorBase sourceIt = (EntityIteratorBase) source.iterator();
            private int processed = 0;

            @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/binop/AddNullDecoratorIterable.java`
#### Snippet
```java
    public EntityIterator getIteratorImpl(@NotNull final PersistentStoreTransaction txn) {
        return new EntityIteratorBase(AddNullDecoratorIterable.this) {
            private EntityIterator iterator = null;
            private Boolean hasNull = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/binop/AddNullDecoratorIterable.java`
#### Snippet
```java
        return new EntityIteratorBase(AddNullDecoratorIterable.this) {
            private EntityIterator iterator = null;
            private Boolean hasNull = null;

            @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/iterator/OrderedEntityIdCollectionIterator.java`
#### Snippet
```java

public class OrderedEntityIdCollectionIterator extends NonDisposableEntityIterator {
    private int index = 0;
    @NotNull
    private final OrderedEntityIdCollection source;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/iterator/ReverseOrderedEntityIdCollectionIterator.java`
#### Snippet
```java

public class ReverseOrderedEntityIdCollectionIterator extends NonDisposableEntityIterator {
    private int index = 0;
    @NotNull
    private final OrderedEntityIdCollection source;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/iterator/EntityIdArrayIteratorMultiTypeIdUnpacked.java`
#### Snippet
```java
    private final long[] localIds;

    private int index = 0;

    public EntityIdArrayIteratorMultiTypeIdUnpacked(@NotNull EntityIterableBase iterable, int[] typeIds, long[] localIds) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/iterator/EntityIdArrayIteratorMultiTypeIdPacked.java`
#### Snippet
```java
    private final long[] localIds;

    private int index = 0;
    private int typeId = -1;
    private int typeIndex = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/iterator/EntityIdArrayIteratorMultiTypeIdPacked.java`
#### Snippet
```java
    private int typeId = -1;
    private int typeIndex = 0;
    private int currentBound = 0;

    public EntityIdArrayIteratorMultiTypeIdPacked(@NotNull EntityIterableBase iterable, int[] typeIds, long[] localIds) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/iterator/EntityIdArrayIteratorMultiTypeIdPacked.java`
#### Snippet
```java
    private int index = 0;
    private int typeId = -1;
    private int typeIndex = 0;
    private int currentBound = 0;

```

## RuleId[ruleID=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `benchmarks/build.gradle`
#### Snippet
```java
    def os
    if (SystemUtils.IS_OS_LINUX) {
        os = "linux64"
    } else if (SystemUtils.IS_OS_MAC_OSX) {
        os = "osx64"
```

### GroovyUnusedAssignment
Assignment is not used
in `benchmarks/build.gradle`
#### Snippet
```java
        os = "linux64"
    } else if (SystemUtils.IS_OS_MAC_OSX) {
        os = "osx64"
    } else if (SystemUtils.IS_OS_WINDOWS) {
        os = "win64"
```

### GroovyUnusedAssignment
Assignment is not used
in `benchmarks/build.gradle`
#### Snippet
```java
        os = "osx64"
    } else if (SystemUtils.IS_OS_WINDOWS) {
        os = "win64"
    }
    if (os) {
```

## RuleId[ruleID=PrivatePropertyName]
### PrivatePropertyName
Private property name `NO_IV` should not contain underscores in the middle or the end
in `crypto/src/main/kotlin/jetbrains/exodus/crypto/convert/Util.kt`
#### Snippet
```java
}

private val NO_IV = 0L to false

private fun appendFile(out: ScytaleEngine, fd: VirtualFileDescriptor, fileSize: Long) {
```

## RuleId[ruleID=UnnecessaryVariable]
### UnnecessaryVariable
Variable is same as 'other' and can be inlined
in `query/src/main/kotlin/jetbrains/exodus/query/LinksEqualDecorator.kt`
#### Snippet
```java
            return false
        }
        val decorator = other
        return if (!safe_equals(linkName, decorator.linkName) || !safe_equals(
                linkEntityType,
```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `utils/src/main/java/jetbrains/exodus/management/MBeanBase.java`
#### Snippet
```java
        } catch (InstanceNotFoundException ignore) {
        } catch (Exception e) {
            throw e instanceof RuntimeException ? (RuntimeException) e : new RuntimeException(e);
        }
    }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `utils/src/main/java/jetbrains/exodus/management/MBeanBase.java`
#### Snippet
```java
            ManagementFactory.getPlatformMBeanServer().registerMBean(this, name);
        } catch (Exception e) {
            throw e instanceof RuntimeException ? (RuntimeException) e : new RuntimeException(e);
        }
    }
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/XodusDirectory.java`
#### Snippet
```java
            }

            return names.toArray(new String[0]);
        });
    }
```

## RuleId[ruleID=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/TreeAwareNodeDecorator.java`
#### Snippet
```java

    private static void dump(PatriciaTreeBase tree, NodeBase node, PrintStream out, int level, @Nullable ToString renderer) {
        out.println(String.format("node %s%s] %s",
                node.isMutable() ? "(m) [" : '[',
                node.getChildrenCount(),
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Value `pushedOutValue` is always 'null'
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/ObjectCache.java`
#### Snippet
```java
            secondGenerationQueue.remove(key);
        }
        return pushedOutValue;
    }

```

### ConstantValue
Value `value` is always 'null'
in `environment/src/main/java/jetbrains/exodus/tree/btree/InternalPage.java`
#### Snippet
```java
            if (index < page.getSize() - 1) {
                ++index;
                ln = page.getChild(index).find(stack, depth + 1, key, value, equalOrNext);
            }
        }
```

### ConstantValue
Value `equalOrNext` is always 'true'
in `environment/src/main/java/jetbrains/exodus/tree/btree/InternalPage.java`
#### Snippet
```java
            if (index < page.getSize() - 1) {
                ++index;
                ln = page.getChild(index).find(stack, depth + 1, key, value, equalOrNext);
            }
        }
```

### ConstantValue
Condition `firstChild == null` is always `false`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
                throw new RuntimeException("Not a search tree.");
            }
            if (firstChild == null || secondChild == null) {
                throw new RuntimeException("The node has not enough children.");
            }
```

### ConstantValue
Condition `firstChild == null || secondChild == null` is always `false`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
                throw new RuntimeException("Not a search tree.");
            }
            if (firstChild == null || secondChild == null) {
                throw new RuntimeException("The node has not enough children.");
            }
```

### ConstantValue
Condition `secondChild == null` is always `false` when reached
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
                throw new RuntimeException("Not a search tree.");
            }
            if (firstChild == null || secondChild == null) {
                throw new RuntimeException("The node has not enough children.");
            }
```

### ConstantValue
Condition `result == null` is always `false`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
        }

        if (result == null && !readerWriterProvider.isReadonly()) {
            loggerWarn("Blob not found: " + blobVault.getBlobLocation(blobHandle), new FileNotFoundException());
        }
```

### ConstantValue
Condition `result == null && !readerWriterProvider.isReadonly()` is always `false`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
        }

        if (result == null && !readerWriterProvider.isReadonly()) {
            loggerWarn("Blob not found: " + blobVault.getBlobLocation(blobHandle), new FileNotFoundException());
        }
```

## RuleId[ruleID=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `raise()` tries to override a static method of a superclass
in `environment/src/main/java/jetbrains/exodus/log/BlockNotFoundException.java`
#### Snippet
```java
    }

    public static void raise(@NotNull final String message, @NotNull final Log log, final long address) {
        checkLogIsClosing(log);
        throw new BlockNotFoundException(message, address, log.getFileLengthBound());
```

## RuleId[ruleID=IOResource]
### IOResource
'ZipArchiveOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `compress/src/main/java/jetbrains/exodus/util/CompressBackupUtil.java`
#### Snippet
```java
            final ArchiveOutputStream archive;
            if (zip) {
                final ZipArchiveOutputStream zipArchive = new ZipArchiveOutputStream(output);
                zipArchive.setLevel(Deflater.BEST_COMPRESSION);
                archive = zipArchive;
```

## RuleId[ruleID=RedundantOperationOnEmptyContainer]
### RedundantOperationOnEmptyContainer
Collection `Collections.EMPTY_LIST` is always empty
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/StablePriorityQueue.java`
#### Snippet
```java
            priorityIt = theQueue.descendingMap().entrySet().iterator();
            //noinspection unchecked
            currentIt = Collections.EMPTY_LIST.iterator();
            checkCurrentIterator();
        }
```

### RedundantOperationOnEmptyContainer
Collection `Collections.EMPTY_LIST` is always empty
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistentHashSet.java`
#### Snippet
```java
        final RootTableNode<K> root = getRoot();
        //noinspection unchecked
        return root.getMask() == 0 ? Collections.EMPTY_LIST.iterator() : new Itr<>(root);
    }

```

### RedundantOperationOnEmptyContainer
Collection `new ArrayList`(1) is always empty
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentObjectCache.java`
#### Snippet
```java
        final Root<K, V> current = getCurrent();
        if (current == null) {
            return new ArrayList<V>(1).iterator();
        }
        final ArrayList<V> result = new ArrayList<>();
```

### RedundantOperationOnEmptyContainer
Collection `new ArrayList`(1) is always empty
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentObjectCache.java`
#### Snippet
```java
        final Root<K, V> current = getCurrent();
        if (current == null) {
            return new ArrayList<K>(1).iterator();
        }
        return new Iterator<K>() {
```

### RedundantOperationOnEmptyContainer
Collection `Collections.EMPTY_LIST` is always empty
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
    public Iterator<K> reverseIterator() {
        if (isEmpty()) {
            return Collections.EMPTY_LIST.iterator();
        }
        final RootNode<K> root = getRoot();
```

### RedundantOperationOnEmptyContainer
Collection `Collections.EMPTY_LIST` is always empty
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
        final RootNode<K> root = getRoot();
        if (root == null) {
            return Collections.EMPTY_LIST.iterator();
        }
        final TreePos<K>[] stack = new TreePos[MathUtil.integerLogarithm(root.getSize()) + 1];
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `MathUtil` has only 'static' members, and lacks a 'private' constructor
in `utils/src/main/java/jetbrains/exodus/util/MathUtil.java`
#### Snippet
```java
package jetbrains.exodus.util;

public class MathUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `EnvironmentReadWriteExample` has only 'static' members, and lacks a 'private' constructor
in `samples/src/main/java/jetbrains/exodus/env/EnvironmentReadWriteExample.java`
#### Snippet
```java
 * This example shows low level key/value store access.
 */
public class EnvironmentReadWriteExample {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `PersistentStoreExample` has only 'static' members, and lacks a 'private' constructor
in `samples/src/main/java/jetbrains/exodus/entitystore/PersistentStoreExample.java`
#### Snippet
```java
import java.io.*;

public class PersistentStoreExample {

    public static final String BLOG_ENTITY_TYPE_NAME = "Blog";
```

### UtilityClassWithoutPrivateConstructor
Class `Users` has only 'static' members, and lacks a 'private' constructor
in `samples/src/main/java/jetbrains/exodus/env/Users.java`
#### Snippet
```java
import static jetbrains.exodus.env.StoreConfig.WITH_DUPLICATES;

public class Users {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `NullLoggable` has only 'static' members, and lacks a 'private' constructor
in `environment/src/main/java/jetbrains/exodus/log/NullLoggable.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public final class NullLoggable {
    public static final byte TYPE = 0;
    private static final SinglePageLoggable PROTOTYPE = new SinglePageLoggable(Loggable.NULL_ADDRESS,
```

### UtilityClassWithoutPrivateConstructor
Class `MatchResult` has only 'static' members, and lacks a 'private' constructor
in `environment/src/main/java/jetbrains/exodus/tree/patricia/NodeBase.java`
#### Snippet
```java
    }

    static class MatchResult {

        static long getMatchResult(final int matchingLength) {
```

### UtilityClassWithoutPrivateConstructor
Class `EntityIdArrayCachedInstanceIterableFactory` has only 'static' members, and lacks a 'private' constructor
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIdArrayCachedInstanceIterableFactory.java`
#### Snippet
```java
import static jetbrains.exodus.entitystore.iterate.EntityIterableBase.NULL_TYPE_ID;

public class EntityIdArrayCachedInstanceIterableFactory {
    public static final int MAX_COMPRESSED_SET_LOAD_FACTOR = 64;

```

### UtilityClassWithoutPrivateConstructor
Class `DirUtil` has only 'static' members, and lacks a 'private' constructor
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/DirUtil.java`
#### Snippet
```java
import java.util.stream.Stream;

public final class DirUtil {
    public static final int LUCENE_FILE_NAME_LENGTH = 13;
    public static final int LUCENE_FILE_EXTENSION_LENGTH = 4;
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `skip` may produce `NullPointerException`
in `vfs/src/main/java/jetbrains/exodus/vfs/VfsInputStream.java`
#### Snippet
```java
        long skipped = 0;
        while (clusterIterator.hasCluster()) {
            skipped += clusterIterator.getCurrent().skip(n - skipped);
            if (skipped == n) {
                break;
```

### DataFlowIssue
Method invocation `getAllSubTypes` may produce `NullPointerException`
in `query/src/main/java/jetbrains/exodus/query/MetaDataAwareUniqueKeyIndicesEngine.java`
#### Snippet
```java
        final String entityType = index.getOwnerEntityType();
        res.add(entityType);
        res.addAll(modelMetaData.getEntityMetaData(entityType).getAllSubTypes());
        return res;
    }
```

### DataFlowIssue
Argument `value` might be null
in `query/src/main/java/jetbrains/exodus/query/PropertyEqual.java`
#### Snippet
```java
    public Iterable<Entity> instantiate(String entityType, QueryEngine queryEngine, ModelMetaData metaData, InstantiateContext context) {
        queryEngine.assertOperational();
        return queryEngine.getPersistentStore().getAndCheckCurrentTransaction().find(entityType, name, value);
    }

```

### DataFlowIssue
Argument `oldEntityIdEntry` might be null
in `query/src/main/java/jetbrains/exodus/query/UniqueKeyIndicesEngine.java`
#### Snippet
```java
                if (!indexTable.getDatabase().add(txn.getEnvironmentTransaction(), propsEntry, LongBinding.longToCompressedEntry(entity.getId().getLocalId()))) {
                    ByteIterable oldEntityIdEntry = indexTable.getDatabase().get(txn.getEnvironmentTransaction(), propsEntry);
                    long oldEntityId = LongBinding.compressedEntryToLong(oldEntityIdEntry);
                    throw new EntityStoreException("Failed to insert unique key (already exists), index: " + index + ", values = " + Arrays.toString(props) + ", new entity = " + entity + ", old entity id = " + oldEntityId + ", index owner entity type = " + index.getOwnerEntityType());
                }
```

### DataFlowIssue
Argument `queryEngine.getModelMetaData()` might be null
in `query/src/main/java/jetbrains/exodus/query/TreeKeepingEntityIterable.java`
#### Snippet
```java
            final String entityIterableType = ((StaticTypedEntityIterable) entityIterable).getEntityType();
            if (!(entityType.equals(entityIterableType)) && Utils.isTypeOf(entityIterableType, entityType,
                    queryEngine.getModelMetaData())) {
                entityType = entityIterableType;
            }
```

### DataFlowIssue
Argument `source` might be null
in `query/src/main/java/jetbrains/exodus/query/metadata/ModelMetaDataImpl.java`
#### Snippet
```java
        EntityMetaDataImpl source = (EntityMetaDataImpl) getEntityMetaData(entityName);
        AssociationEndMetaData aemd =
            removeAssociationEndMetaDataFromEntityTypeSubtree(typeToEntityMetaDatas, source, associationName);
        AssociationMetaData amd = aemd.getAssociationMetaData();

```

### DataFlowIssue
Argument `modelMetaData.get().getEntityMetaData(subType)` might be null
in `query/src/main/java/jetbrains/exodus/query/metadata/EntityMetaDataImpl.java`
#### Snippet
```java
        result.addAll(subTypes);
        for (final String subType : subTypes) {
            collectSubTypes((EntityMetaDataImpl) modelMetaData.get().getEntityMetaData(subType), result);
        }
    }
```

### DataFlowIssue
Expression `decorated` might evaluate to null but is returned by the method declared as @NotNull
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/ObjectCacheDecorator.java`
#### Snippet
```java

        }
        return shouldCache.getAsBoolean() ? decorated : FAKE_CACHE;
    }
}
```

### DataFlowIssue
Method invocation `hashCode` may produce `NullPointerException`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentStack.java`
#### Snippet
```java
    @Override
    public int hashCode() {
        return isEmpty() ? 271828182 : element.hashCode() + next.hashCode();
    }

```

### DataFlowIssue
Method invocation `hashCode` may produce `NullPointerException`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentStack.java`
#### Snippet
```java
    @Override
    public int hashCode() {
        return isEmpty() ? 271828182 : element.hashCode() + next.hashCode();
    }

```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentStack.java`
#### Snippet
```java
            return false;
        }
        return element.equals(stack.element) && next.equals(stack.next);
    }

```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentStack.java`
#### Snippet
```java
            return false;
        }
        return element.equals(stack.element) && next.equals(stack.next);
    }

```

### DataFlowIssue
Argument `content` might be null
in `samples/src/main/java/jetbrains/exodus/entitystore/PersistentStoreExample.java`
#### Snippet
```java
        System.out.println("\tPost content: ");
        String line;
        try (BufferedReader contentReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(content)))) {
            while ((line = contentReader.readLine()) != null) {
                System.out.println("\t" + line);
```

### DataFlowIssue
Method invocation `charAt` may produce `NullPointerException`
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/util/JMHStringInternerMacroBenchmark.java`
#### Snippet
```java
        int result = 0;
        for (int index : indices) {
            result += xdInterner.doIntern(strings[index]).charAt(10);
            String again = strings[STRINGS_COUNT - index - 1].intern();
            result += again.charAt(again.length() - 1);
```

### DataFlowIssue
Method invocation `charAt` may produce `NullPointerException`
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/util/JMHStringInternerMacroBenchmark.java`
#### Snippet
```java
        int result = 0;
        for (int index : indices) {
            result += xdInterner.doIntern(strings[index]).charAt(10);
            String again = strings[STRINGS_COUNT - index - 1].intern();
            result += again.charAt(again.length() - 1);
```

### DataFlowIssue
Method invocation `newCipher` may produce `NullPointerException`
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/crypto/JMHStreamCipherBenchmarks.java`
#### Snippet
```java
    private final StreamCipherProvider jbChaChaProvider = KryptKt.newCipherProvider(JB_CHACHA_CIPHER_ID);
    private final StreamCipher salsa20Cipher = salsa20Provider.newCipher();
    private final StreamCipher chaChaCipher = chaChaProvider.newCipher();
    private final StreamCipher jbChaChaCipher = jbChaChaProvider.newCipher();

```

### DataFlowIssue
Method invocation `newCipher` may produce `NullPointerException`
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/crypto/JMHStreamCipherBenchmarks.java`
#### Snippet
```java
    private final StreamCipherProvider chaChaProvider = KryptKt.newCipherProvider(CHACHA_CIPHER_ID);
    private final StreamCipherProvider jbChaChaProvider = KryptKt.newCipherProvider(JB_CHACHA_CIPHER_ID);
    private final StreamCipher salsa20Cipher = salsa20Provider.newCipher();
    private final StreamCipher chaChaCipher = chaChaProvider.newCipher();
    private final StreamCipher jbChaChaCipher = jbChaChaProvider.newCipher();
```

### DataFlowIssue
Method invocation `newCipher` may produce `NullPointerException`
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/crypto/JMHStreamCipherBenchmarks.java`
#### Snippet
```java
    private final StreamCipher salsa20Cipher = salsa20Provider.newCipher();
    private final StreamCipher chaChaCipher = chaChaProvider.newCipher();
    private final StreamCipher jbChaChaCipher = jbChaChaProvider.newCipher();

    @Setup
```

### DataFlowIssue
Method invocation `value` may produce `NullPointerException`
in `benchmarks/src/jmh/java/jetbrains/exodus/benchmark/chronicle/JMHChronicleMapTokyoCabinetReadBenchmark.java`
#### Snippet
```java
            for (final String key : randomKeys) {
                try (ExternalMapQueryContext<String, String, ?> c = map.queryContext(key)) {
                    bh.consume(c.entry().value().get());
                }
            }
```

### DataFlowIssue
Argument `ln.getValue()` might be null
in `environment/src/main/java/jetbrains/exodus/tree/btree/LeafNodeDupMutable.java`
#### Snippet
```java
            // leaf node with one value -- add it
            mainTree.decrementSize(1); // hack
            result.put(ln.getValue());
            return result;
        }
```

### DataFlowIssue
Argument `leaf.getValue()` might be null
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverserDup.java`
#### Snippet
```java
    protected ILeafNode handleLeafR(BaseLeafNode leaf) {
        if (leaf.isDupLeaf()) {
            return new LeafNodeKV(leaf.getValue(), leaf.getKey());
        } else if (leaf.isDup()) {
            inDupTree = true;
```

### DataFlowIssue
`null` is stored to an array of @NotNull elements
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverserDup.java`
#### Snippet
```java
            --bottom;
            final TreePos current = stack[bottom];
            stack[bottom] = null; // gc
            if (current.node.isBottom()) {
                currentNode = current.node;
```

### DataFlowIssue
Argument `leaf.getValue()` might be null
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverserDup.java`
#### Snippet
```java
    protected ILeafNode handleLeafL(BaseLeafNode leaf) {
        if (leaf.isDupLeaf()) {
            return new LeafNodeKV(leaf.getValue(), leaf.getKey());
        } else if (leaf.isDup()) {
            inDupTree = true;
```

### DataFlowIssue
Argument `leaf.getValue()` might be null
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverserDup.java`
#### Snippet
```java
    protected ILeafNode handleLeaf(BaseLeafNode leaf) {
        if (leaf.isDupLeaf()) {
            return new LeafNodeKV(leaf.getValue(), leaf.getKey());
        } else {
            return super.handleLeaf(leaf);
```

### DataFlowIssue
Method invocation `compareTo` may produce `NullPointerException`
in `environment/src/main/java/jetbrains/exodus/tree/btree/BaseLeafNode.java`
#### Snippet
```java
    @Override
    public int compareValueTo(@NotNull final ByteIterable iterable) {
        return getValue().compareTo(iterable);
    }

```

### DataFlowIssue
Argument `ln.getValue()` might be null
in `environment/src/main/java/jetbrains/exodus/tree/btree/BottomPage.java`
#### Snippet
```java


        if (value == null || (equalOrNext ? value.compareTo(ln.getValue()) <= 0 : value.compareTo(ln.getValue()) == 0)) {
            stack.currentNode = page;
            stack.currentPos = index;
```

### DataFlowIssue
Argument `ln.getValue()` might be null
in `environment/src/main/java/jetbrains/exodus/tree/btree/BottomPage.java`
#### Snippet
```java


        if (value == null || (equalOrNext ? value.compareTo(ln.getValue()) <= 0 : value.compareTo(ln.getValue()) == 0)) {
            stack.currentNode = page;
            stack.currentPos = index;
```

### DataFlowIssue
`null` is stored to an array of @NotNull elements
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverser.java`
#### Snippet
```java
        currentPos = topPos.pos;
        node = ILeafNode.EMPTY;
        stack[top] = null; // help gc
    }

```

### DataFlowIssue
Argument `result.getValue()` might be null
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverser.java`
#### Snippet
```java
            return false;
        }
        node = result.isDupLeaf() ? new LeafNodeKV(result.getValue(), result.getKey()) : result;
        return true;
    }
```

### DataFlowIssue
Method invocation `getMutableCopy` may produce `NullPointerException`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/PatriciaReclaimActualTraverser.java`
#### Snippet
```java
        if (currentNode.isMutable()) {
            final int pos = topItr.getIndex();
            final MutableNode parentNodeMutable = parentNode.getMutableCopy(mainTree);
            parentNodeMutable.setChild(pos, (MutableNode) currentNode);
            currentNode = parentNodeMutable;
```

### DataFlowIssue
Expression `parentNode` might evaluate to null but is assigned to a variable that is annotated with @NotNull
in `environment/src/main/java/jetbrains/exodus/tree/patricia/PatriciaReclaimActualTraverser.java`
#### Snippet
```java
            // currentIterator = topItr;
        } else {
            currentNode = parentNode;
            currentIterator = topItr;
            currentChild = topItr.getNode();
```

### DataFlowIssue
`null` is stored to an array of @NotNull elements
in `environment/src/main/java/jetbrains/exodus/tree/patricia/PatriciaReclaimActualTraverser.java`
#### Snippet
```java
            currentChild = topItr.getNode();
        }
        stack[top] = null; // help gc
    }
}
```

### DataFlowIssue
Result of 'max' is the same as the second argument making the call meaningless
in `environment/src/main/java/jetbrains/exodus/tree/patricia/ChildReferenceSet.java`
#### Snippet
```java
                }
            } else {
                this.refs = new ChildReference[Math.max(length, capacity)];
                System.arraycopy(refs, 0, this.refs, 0, insertPos);
                System.arraycopy(refs, insertPos, this.refs, insertPos + 1, length - insertPos);
```

### DataFlowIssue
Method invocation `hasNext` may produce `NullPointerException`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/PatriciaTraverser.java`
#### Snippet
```java
    @NotNull
    public INode moveRight() {
        if (currentIterator.hasNext()) {
            if (currentIterator.isMutable()) {
                currentChild = currentIterator.next();
```

### DataFlowIssue
Argument `topItr.getParentNode()` might be null
in `environment/src/main/java/jetbrains/exodus/tree/patricia/PatriciaTraverser.java`
#### Snippet
```java
        --top;
        final NodeChildrenIterator topItr = stack[top];
        setCurrentNode(topItr.getParentNode());
        currentIterator = topItr;
        currentChild = topItr.getNode();
```

### DataFlowIssue
`null` is stored to an array of @NotNull elements
in `environment/src/main/java/jetbrains/exodus/tree/patricia/PatriciaTraverser.java`
#### Snippet
```java
        currentIterator = topItr;
        currentChild = topItr.getNode();
        stack[top] = null; // help gc
    }

```

### DataFlowIssue
Argument `stack[i].getKey()` might be null
in `environment/src/main/java/jetbrains/exodus/tree/patricia/PatriciaTraverser.java`
#### Snippet
```java
        final LightOutputStream output = new LightOutputStream(7);
        for (int i = 0; i < top; ++i) {
            ByteIterableBase.fillBytes(stack[i].getKey(), output);
            output.write(stack[i].getNode().firstByte); // seems that firstByte isn't mutated
        }
```

### DataFlowIssue
Dereference of `stack[i].getNode()` may produce `NullPointerException`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/PatriciaTraverser.java`
#### Snippet
```java
        for (int i = 0; i < top; ++i) {
            ByteIterableBase.fillBytes(stack[i].getKey(), output);
            output.write(stack[i].getNode().firstByte); // seems that firstByte isn't mutated
        }
        ByteIterableBase.fillBytes(currentNode.keySequence, output);
```

### DataFlowIssue
Method invocation `matchesKeySequence` may produce `NullPointerException`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/PatriciaTraverser.java`
#### Snippet
```java
        // go down and search
        while (true) {
            if (NodeBase.MatchResult.getMatchingLength(node.matchesKeySequence(it)) < 0) {
                return false;
            }
```

### DataFlowIssue
Argument `node.getValue()` might be null
in `environment/src/main/java/jetbrains/exodus/tree/patricia/PatriciaTraverser.java`
#### Snippet
```java
        }
        // key match
        if (node.hasValue() && (value == null || value.compareTo(node.getValue()) == 0)) {
            setCurrentNode(node);
            getItr();
```

### DataFlowIssue
Method invocation `hasPrev` may produce `NullPointerException`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/PatriciaTraverser.java`
#### Snippet
```java
    @NotNull
    public INode moveLeft() {
        if (currentIterator.hasPrev()) {
            if (currentIterator.isMutable() || currentChild == null) {
                currentChild = currentIterator.prev();
```

### DataFlowIssue
Method invocation `matchesKeySequence` may produce `NullPointerException`
in `environment/src/main/java/jetbrains/exodus/tree/patricia/PatriciaTraverser.java`
#### Snippet
```java
        while (true) {
            final boolean hasNext = it.hasNext();
            final long matchResult = node.matchesKeySequence(it);
            if (NodeBase.MatchResult.getMatchingLength(matchResult) < 0) {
                if (value == null) {
```

### DataFlowIssue
Argument `node.getValue()` might be null
in `environment/src/main/java/jetbrains/exodus/tree/patricia/PatriciaTraverser.java`
#### Snippet
```java
                    break;
                }
                if (value == null || value.compareTo(node.getValue()) <= 0) {
                    setCurrentNode(node);
                    getItr();
```

### DataFlowIssue
Argument `firstChild` might be null
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
            return new RootBinaryNode<>(key, size);
        } else {
            return new RootInternalBinaryNode<>(firstChild, key, secondChild, size);
        }
    }
```

### DataFlowIssue
Argument `secondChild` might be null
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
            return new RootBinaryNode<>(key, size);
        } else {
            return new RootInternalBinaryNode<>(firstChild, key, secondChild, size);
        }
    }
```

### DataFlowIssue
Argument `firstChild` might be null
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
            return new RootTernaryNode<>(firstKey, secondKey, size);
        } else {
            return new RootInternalTernaryNode<>(firstChild, firstKey, secondChild, secondKey, thirdChild, size);
        }
    }
```

### DataFlowIssue
Argument `secondChild` might be null
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
            return new RootTernaryNode<>(firstKey, secondKey, size);
        } else {
            return new RootInternalTernaryNode<>(firstChild, firstKey, secondChild, secondKey, thirdChild, size);
        }
    }
```

### DataFlowIssue
Argument `thirdChild` might be null
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
            return new RootTernaryNode<>(firstKey, secondKey, size);
        } else {
            return new RootInternalTernaryNode<>(firstChild, firstKey, secondChild, secondKey, thirdChild, size);
        }
    }
```

### DataFlowIssue
Argument `firstChild` might be null
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
            return new TernaryNode<>(firstKey, secondKey);
        } else {
            return new InternalTernaryNode<>(firstChild, firstKey, secondChild, secondKey, thirdChild);
        }
    }
```

### DataFlowIssue
Argument `secondChild` might be null
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
            return new TernaryNode<>(firstKey, secondKey);
        } else {
            return new InternalTernaryNode<>(firstChild, firstKey, secondChild, secondKey, thirdChild);
        }
    }
```

### DataFlowIssue
Argument `thirdChild` might be null
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
            return new TernaryNode<>(firstKey, secondKey);
        } else {
            return new InternalTernaryNode<>(firstChild, firstKey, secondChild, secondKey, thirdChild);
        }
    }
```

### DataFlowIssue
Argument `firstChild` might be null
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
            return new BinaryNode<>(key);
        } else {
            return new InternalBinaryNode<>(firstChild, key, secondChild);
        }
    }
```

### DataFlowIssue
Argument `secondChild` might be null
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/AbstractPersistent23Tree.java`
#### Snippet
```java
            return new BinaryNode<>(key);
        } else {
            return new InternalBinaryNode<>(firstChild, key, secondChild);
        }
    }
```

### DataFlowIssue
@Nullable method 'next' always returns a non-null value
in `entity-store/src/main/java/jetbrains/exodus/entitystore/util/ImmutableSingleTypeEntityIdCollection.java`
#### Snippet
```java
            }

            @Nullable
            @Override
            public EntityId next() {
```

### DataFlowIssue
@Nullable method 'next' always returns a non-null value
in `entity-store/src/main/java/jetbrains/exodus/entitystore/util/ImmutableSingleTypeEntityIdCollection.java`
#### Snippet
```java
            }

            @Nullable
            @Override
            public EntityId next() {
```

### DataFlowIssue
Argument `itemClass` might be null
in `entity-store/src/main/java/jetbrains/exodus/entitystore/tables/PropertiesTable.java`
#### Snippet
```java
            final ComparableSet data = (ComparableSet) propValue.getData();
            final Class itemClass = data.getItemClass();
            final ComparableBinding itemBinding = propertyTypes.getPropertyType(itemClass).getBinding();
            final ByteIterable[] result = new ByteIterable[data.size()];
            //noinspection unchecked
```

### DataFlowIssue
@Nullable method 'toSet' always returns a non-null value
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/DistinctIterable.java`
#### Snippet
```java
        }

        @Nullable
        @Override
        protected EntityIdSet toSet() {
```

### DataFlowIssue
Dereference of `pair` may produce `NullPointerException`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/MergeSortedIterable.java`
#### Snippet
```java
        public EntityId nextIdImpl() {
            final EntityWithSource pair = queue.poll();
            final EntityId result = pair.id;
            final EntityIterator i = pair.source;
            if (i.hasNext()) {
```

### DataFlowIssue
@Nullable method 'nextIdImpl' always returns a non-null value
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/UpdatableEntityIdSortedSetCachedInstanceIterable.java`
#### Snippet
```java
            }

            @Nullable
            @Override
            protected EntityId nextIdImpl() {
```

### DataFlowIssue
Argument `typeName` might be null
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/SortIndirectIterable.java`
#### Snippet
```java
                }
            }
            return new SortIndirectIterable(txn, store, typeName,
                (EntityIterableBase) parameters[3], linkName, (EntityIterableBase) parameters[2],
                null, null);
```

### DataFlowIssue
Argument `linkName` might be null
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/SortIndirectIterable.java`
#### Snippet
```java
            }
            return new SortIndirectIterable(txn, store, typeName,
                (EntityIterableBase) parameters[3], linkName, (EntityIterableBase) parameters[2],
                null, null);
        });
```

### DataFlowIssue
Dereference of `pair` may produce `NullPointerException`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/MergeSortedIterableWithValueGetter.java`
#### Snippet
```java
        public EntityId nextIdImpl() {
            final EntityWithSource pair = queue.poll();
            final EntityId result = pair.id;
            final EntityIterator i = pair.source;
            if (i.hasNext()) {
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'getEntitiesTable' is still used
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
    @NotNull
    @Deprecated
    public Store getEntitiesTable(@NotNull final PersistentStoreTransaction txn, final int entityTypeId) {
        return ((SingleColumnTable) entitiesTables.get(txn, entityTypeId)).getDatabase();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getLastVersion' is still used
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java

    @Deprecated
    public int getLastVersion(@NotNull final EntityId id) {
        return getLastVersion(getAndCheckCurrentTransaction(), id);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getEntitiesIndexCursor' is still used
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentEntityStoreImpl.java`
#### Snippet
```java
    @NotNull
    @Deprecated
    public Cursor getEntitiesIndexCursor(@NotNull final PersistentStoreTransaction txn, final int entityTypeId) {
        return getEntitiesTable(txn, entityTypeId).openCursor(txn.getEnvironmentTransaction());
    }
```

## RuleId[ruleID=ReplaceRangeToWithUntil]
### ReplaceRangeToWithUntil
'rangeTo' or the '..' call should be replaced with 'until'
in `query/src/main/kotlin/jetbrains/exodus/query/InMemoryMergeSortIterableWithValueGetter.kt`
#### Snippet
```java
                next = IntArray(1 shl height)
                size2 = 1 shl height - 1
                for (i in 0..size - 1) {
                    next[i + size2] = i
                }
```

### ReplaceRangeToWithUntil
'rangeTo' or the '..' call should be replaced with 'until'
in `query/src/main/kotlin/jetbrains/exodus/query/InMemoryMergeSortIterableWithValueGetter.kt`
#### Snippet
```java
                    next[i + size2] = i
                }
                for (i in size2 + size..next.size - 1) {
                    next[i] = size
                }
```

### ReplaceRangeToWithUntil
'rangeTo' or the '..' call should be replaced with 'until'
in `query/src/main/kotlin/jetbrains/exodus/query/InMemoryMergeSortIterableWithValueGetter.kt`
#### Snippet
```java
                    next[i] = size
                }
                for (i in 1..size2 - 1) {
                    next[i] = -1
                }
```

### ReplaceRangeToWithUntil
'rangeTo' or the '..' call should be replaced with 'until'
in `query/src/main/kotlin/jetbrains/exodus/query/InMemoryMergeSortIterable.kt`
#### Snippet
```java
                next = IntArray(1 shl height)
                size2 = 1 shl height - 1
                for (i in 0..size - 1) {
                    next[i + size2] = i
                }
```

### ReplaceRangeToWithUntil
'rangeTo' or the '..' call should be replaced with 'until'
in `query/src/main/kotlin/jetbrains/exodus/query/InMemoryMergeSortIterable.kt`
#### Snippet
```java
                    next[i + size2] = i
                }
                for (i in size2 + size..next.size - 1) {
                    next[i] = size
                }
```

### ReplaceRangeToWithUntil
'rangeTo' or the '..' call should be replaced with 'until'
in `query/src/main/kotlin/jetbrains/exodus/query/InMemoryMergeSortIterable.kt`
#### Snippet
```java
                    next[i] = size
                }
                for (i in 1..size2 - 1) {
                    next[i] = -1
                }
```

## RuleId[ruleID=ComparatorCombinators]
### ComparatorCombinators
Can be replaced with 'Comparator.comparing'
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/MergeSortedIterable.java`
#### Snippet
```java
                sorted.add((EntityIterable) parameters[i + 1]);
            }
            return new MergeSortedIterable(txn, sorted, (o1, o2) -> o1.getId().compareTo(o2.getId()));
        });
    }
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'trace' in a Serializable class
in `environment/src/main/java/jetbrains/exodus/env/TransactionFinishedException.java`
#### Snippet
```java

    @Nullable
    private final StackTrace trace;

    TransactionFinishedException() {
```

## RuleId[ruleID=RedundantCollectionOperation]
### RedundantCollectionOperation
`iterator` can be replaced with 'Collections.emptyIterator()'
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentObjectCache.java`
#### Snippet
```java
        final Root<K, V> current = getCurrent();
        if (current == null) {
            return new ArrayList<V>(1).iterator();
        }
        final ArrayList<V> result = new ArrayList<>();
```

### RedundantCollectionOperation
`iterator` can be replaced with 'Collections.emptyIterator()'
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/persistent/PersistentObjectCache.java`
#### Snippet
```java
        final Root<K, V> current = getCurrent();
        if (current == null) {
            return new ArrayList<K>(1).iterator();
        }
        return new Iterator<K>() {
```

## RuleId[ruleID=VerboseNullabilityAndEmptiness]
### VerboseNullabilityAndEmptiness
Replace subsequent checks with 'isNullOrEmpty()' call
in `environment/src/main/kotlin/jetbrains/exodus/io/WatchingFileDataReader.kt`
#### Snippet
```java
                    watchKey = watchService.poll(100, TimeUnit.MILLISECONDS)
                    val events = watchKey?.pollEvents()
                    if (events == null || events.isEmpty()) {
                        if (System.currentTimeMillis() - lastUpdated > FORCE_CHECK_INTERVAL) {
                            lastUpdated = doUpdate(true, currentThread)
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `environment/src/main/java/jetbrains/exodus/tree/btree/LeafNodeDupMutable.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "LND* {key:" + getKey().toString() + '}';
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `environment/src/main/java/jetbrains/exodus/tree/btree/BaseLeafNode.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "LN {key:" + getKey().toString() + "} @ " + getAddress();
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `environment/src/main/java/jetbrains/exodus/tree/btree/LeafNodeDup.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "LND {key:" + getKey().toString() + '}';
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `environment/src/main/java/jetbrains/exodus/tree/btree/LeafNodeKV.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "KV {key:" + getKey().toString() + "} @ " + getAddress();
    }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/PropertyRangeIterable.java`
#### Snippet
```java
                builder.append(propertyId);
                builder.append('-');
                builder.append(min.toString());
                builder.append('-');
                builder.append(max.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/PropertyRangeIterable.java`
#### Snippet
```java
                builder.append(min.toString());
                builder.append('-');
                builder.append(max.toString());
            }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/EntityIterableBase.java`
#### Snippet
```java
            explainer.explain(getOrigin(), Explainer.CURSOR_ADVANCES);
            explainer.explain(getOrigin(), Explainer._CURSOR_ADVANCES_BY_TYPE + ' ' + type.name());
            explainer.explain(getOrigin(), Explainer._CURSOR_ADVANCES_BY_HANDLE + ' ' + getHandle().toString());
        }
    }
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `query/src/main/java/jetbrains/exodus/query/InMemoryTimSortIterable.java`
#### Snippet
```java
                    }
                    // insert several next elements into run to achieve run length minRunLength
                    for (; i < n && i - from[runCount] < minRunLength; i++) {
                        Entity t = src.get(i);
                        int j = i - 1;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/MultiTypeSortedEntityIdArrayCachedInstanceIterable.java`
#### Snippet
```java
        for (int i = 0; i < length; ++i) {
            if (typeIds[i] == typeId) {
                ++i;
                final int result = Arrays.binarySearch(localIds, prevBound, typeIds[i], localId);

```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/MultiTypeSortedEntityIdArrayCachedInstanceIterable.java`
#### Snippet
```java
                break;
            } else {
                ++i;
                prevBound = typeIds[i];
            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `entity-store/src/main/java/jetbrains/exodus/entitystore/iterate/cached/MultiTypeSortedEntityIdArrayCachedInstanceIterable.java`
#### Snippet
```java
        for (int i = 0; i < count; ++i) {
            final int typeId = typeIds[i];
            ++i;
            final int upperBound = typeIds[i];
            if (typeId == NULL_TYPE_ID) {
```

## RuleId[ruleID=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `entity-store/src/main/java/jetbrains/exodus/entitystore/FileSystemBlobVaultOld.java`
#### Snippet
```java

    private static void setPosixPermissions(File location) {
        final HashSet<PosixFilePermission> permissions = new HashSet<>();
        permissions.add(PosixFilePermission.OWNER_WRITE);
        permissions.add(PosixFilePermission.OWNER_READ);
```

## RuleId[ruleID=RemoveEmptyPrimaryConstructor]
### RemoveEmptyPrimaryConstructor
Remove empty primary constructor
in `environment/src/main/kotlin/jetbrains/exodus/log/AbstractBlockListener.kt`
#### Snippet
```java
import jetbrains.exodus.io.Block

abstract class AbstractBlockListener() : BlockListener {

    override fun blockCreated(block: Block) {
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `environment/src/main/java/jetbrains/exodus/log/LogUtil.java`
#### Snippet
```java
        final char[] alphabet = LOG_FILE_NAME_ALPHABET;
        for (int i = 0; i < alphabet.length; ++i) {
            ALPHA_INDEXES.put(alphabet[i], Integer.valueOf(i));
        }
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
        }

        blobStreams.put(blobHandle, new Triple<>(tmpFilePath, Boolean.valueOf(invalidateOnRollback), tmpHandle));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
        }

        return instantiator.apply(Integer.valueOf(entityTypeId), Integer.valueOf(propertyId));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `entity-store/src/main/java/jetbrains/exodus/entitystore/PersistentStoreTransaction.java`
#### Snippet
```java
        }

        return instantiator.apply(Integer.valueOf(entityTypeId), Integer.valueOf(propertyId));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/DirUtil.java`
#### Snippet
```java
        final char[] alphabet = LUCENE_FILE_NAME_ALPHABET;
        for (int i = 0; i < alphabet.length; ++i) {
            ALPHA_INDEXES.put(alphabet[i], Integer.valueOf(i));
        }
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/XodusDirectory.java`
#### Snippet
```java
            }

            return Long.valueOf(address);
        });

```

### UnnecessaryBoxing
Unnecessary boxing
in `lucene-directory-v2/src/main/java/jetbrains/exodus/lucene2/XodusDirectory.java`
#### Snippet
```java
            }

            return Long.valueOf(result);
        });

```

## RuleId[ruleID=RedundantNullableReturnType]
### RedundantNullableReturnType
'nextIdImpl' always returns non-null type
in `entity-store/src/main/kotlin/jetbrains/exodus/entitystore/iterate/EntitiesWithCertainLinkIterable.kt`
#### Snippet
```java
                override fun hasNextImpl() = i < localIds.size

                override fun nextIdImpl(): EntityId? {
                    targetId = targets[i]
                    return PersistentEntityId(entityTypeId, localIds[i++])
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `vfs/src/main/java/jetbrains/exodus/vfs/VirtualFileSystem.java`
#### Snippet
```java
     * @param txn  {@linkplain Transaction} instance
     * @param file {@linkplain File} instance
     * @return {@linkplain java.io.InputStream} to read contents of the specified file from the beginning
     * @see #readFile(Transaction, long)
     * @see #readFile(Transaction, File, long)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `vfs/src/main/java/jetbrains/exodus/vfs/VirtualFileSystem.java`
#### Snippet
```java
     * @param file         {@linkplain File} instance
     * @param fromPosition file position to read from
     * @return {@linkplain java.io.InputStream} to read contents of the specified file from the specified position
     * @see #readFile(Transaction, File)
     * @see #readFile(Transaction, long)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `vfs/src/main/java/jetbrains/exodus/vfs/VirtualFileSystem.java`
#### Snippet
```java
     * @param txn            {@linkplain Transaction} instance
     * @param fileDescriptor file descriptor
     * @return {@linkplain java.io.InputStream} to read contents of the specified file from the beginning
     * @see #readFile(Transaction, File)
     * @see #readFile(Transaction, File, long)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `vfs/src/main/java/jetbrains/exodus/vfs/VirtualFileSystem.java`
#### Snippet
```java
 * use {@linkplain #openFile(Transaction, String, boolean)}.
 * <p>
 * To read {@linkplain File} contents, open {@linkplain java.io.InputStream} using {@linkplain #readFile(Transaction, File)},
 * {@linkplain #readFile(Transaction, File, long)} and {@linkplain #readFile(Transaction, long)} methods. To write
 * {@linkplain File} contents, open {@linkplain OutputStream} using {@linkplain #appendFile(Transaction, File)},
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.exodus` is unnecessary and can be removed
in `openAPI/src/main/java/jetbrains/exodus/ByteIterable.java`
#### Snippet
```java
 * of ByteIterable is performed by means of getting {@link ByteIterator}.
 *
 * @see jetbrains.exodus.ArrayByteIterable
 * @see jetbrains.exodus.ByteBufferByteIterable
 * @see jetbrains.exodus.FileByteIterable
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.exodus` is unnecessary and can be removed
in `openAPI/src/main/java/jetbrains/exodus/ByteIterable.java`
#### Snippet
```java
 *
 * @see jetbrains.exodus.ArrayByteIterable
 * @see jetbrains.exodus.ByteBufferByteIterable
 * @see jetbrains.exodus.FileByteIterable
 * @see jetbrains.exodus.FixedLengthByteIterable
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.exodus` is unnecessary and can be removed
in `openAPI/src/main/java/jetbrains/exodus/ByteIterable.java`
#### Snippet
```java
 * @see jetbrains.exodus.ArrayByteIterable
 * @see jetbrains.exodus.ByteBufferByteIterable
 * @see jetbrains.exodus.FileByteIterable
 * @see jetbrains.exodus.FixedLengthByteIterable
 * @see jetbrains.exodus.CompoundByteIterable
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.exodus` is unnecessary and can be removed
in `openAPI/src/main/java/jetbrains/exodus/ByteIterable.java`
#### Snippet
```java
 * @see jetbrains.exodus.ByteBufferByteIterable
 * @see jetbrains.exodus.FileByteIterable
 * @see jetbrains.exodus.FixedLengthByteIterable
 * @see jetbrains.exodus.CompoundByteIterable
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.exodus` is unnecessary and can be removed
in `openAPI/src/main/java/jetbrains/exodus/ByteIterable.java`
#### Snippet
```java
 * @see jetbrains.exodus.FileByteIterable
 * @see jetbrains.exodus.FixedLengthByteIterable
 * @see jetbrains.exodus.CompoundByteIterable
 */
public interface ByteIterable extends Comparable<ByteIterable> {
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.exodus.entitystore` is unnecessary and can be removed
in `openAPI/src/main/java/jetbrains/exodus/entitystore/StoreTransaction.java`
#### Snippet
```java
     * @param id unique {@linkplain EntityId}
     * @return entity instance
     * @throws jetbrains.exodus.entitystore.EntityRemovedInDatabaseException if no entity exists with specified unique id
     * @see EntityId
     */
```

## RuleId[ruleID=MayBeConstant]
### MayBeConstant
Might be 'const'
in `query/src/main/kotlin/jetbrains/exodus/query/PriorityMap.kt`
#### Snippet
```java
private val noData = arrayOf<Comparable<Any>?>()

private val maxArraySize = Integer.MAX_VALUE - 8

private fun hugeCapacity(minCapacity: Int): Int {
```

### MayBeConstant
Might be 'const'
in `utils/src/main/kotlin/jetbrains/exodus/core/execution/SharedTimer.kt`
#### Snippet
```java
object SharedTimer : KLogging() {

    private val PERIOD = 1000 // in milliseconds
    private val registeredTasks: MutableSet<ExpirablePeriodicTask>
    private val processor: JobProcessor
```

### MayBeConstant
Might be 'const'
in `crypto/src/main/kotlin/jetbrains/exodus/crypto/convert/ScytaleEngine.kt`
#### Snippet
```java
) : Closeable {
    companion object : KLogging() {
        val timeout = 200L
    }

```

## RuleId[ruleID=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy field 'nullEntry'
in `utils/src/main/java/jetbrains/exodus/core/dataStructures/hash/HashMap.java`
#### Snippet
```java
    }

    public HashMap(HashMap<K, V> copy) {
        this(copy.capacity, copy.size(), copy.loadFactor, copy.table.length, copy.mask);
        final Entry<K, V>[] source = copy.table;
```

### CopyConstructorMissesField
Copy constructor does not copy fields 'top' and 'node'
in `environment/src/main/java/jetbrains/exodus/tree/btree/BTreeTraverser.java`
#### Snippet
```java

    // for tests only
    private BTreeTraverser(@NotNull BTreeTraverser source) {
        stack = source.stack; // tricky
        currentNode = source.currentNode;
```

## RuleId[ruleID=EqualsOrHashCode]
### EqualsOrHashCode
Class has `equals()` defined but does not define `hashCode()`
in `query/src/main/kotlin/jetbrains/exodus/query/IterableDecorator.kt`
#### Snippet
```java
import jetbrains.exodus.query.metadata.ModelMetaData

class IterableDecorator(iterable: Iterable<Entity>) : NodeBase() {

    private val it = StaticTypedEntityIterable.instantiate(iterable)
```

### EqualsOrHashCode
Class has `hashCode()` defined but does not define `equals()`
in `entity-store/src/main/kotlin/jetbrains/exodus/entitystore/EntityIterableCache.kt`
#### Snippet
```java
    }

    private inner class EntityIterableAsyncInstantiation(
        private val handle: EntityIterableHandle,
        private val it: EntityIterableBase,
```

## RuleId[ruleID=UnusedSymbol]
### UnusedSymbol
Function "gc" is never used
in `sshd/src/main/kotlin/jetbrains/exodus/javascript/Interop.kt`
#### Snippet
```java
        }

    fun gc(on: Any?): Interop {
        val env = environment ?: return println("Environment is not open.")
        if (on.isUndefinedOrNull) {
```

### UnusedSymbol
Function "openEntityStore" is never used
in `sshd/src/main/kotlin/jetbrains/exodus/javascript/Interop.kt`
#### Snippet
```java
    val env: EnvironmentImpl? get() = environment

    fun openEntityStore(location: String, storeName: String) {
        entityStore?.run { entityStore = null; close() }
        if (location.isUndefinedOrNull) {
```

### UnusedSymbol
Function "getEntity" is never used
in `sshd/src/main/kotlin/jetbrains/exodus/javascript/Interop.kt`
#### Snippet
```java
    fun println(o: Any?): Interop = print(o).run { newLine() }

    fun getEntity(id: String): Entity {
        val store = store.notNull
        return store.getEntity(PersistentEntityId.toEntityId(id))
```

### UnusedSymbol
Function "load" is never used
in `sshd/src/main/kotlin/jetbrains/exodus/javascript/Interop.kt`
#### Snippet
```java
    internal var scope: Scriptable? = null

    fun load(fileName: String) {
        rhinoCommand.evalFileSystemScript(cx.notNull, scope.notNull, fileName)
    }
```

### UnusedSymbol
Function "openEnvironment" is never used
in `sshd/src/main/kotlin/jetbrains/exodus/javascript/Interop.kt`
#### Snippet
```java
    }

    fun openEnvironment(location: String) {
        environment?.run { environment = null; close() }
        if (location.isUndefinedOrNull) {
```

### UnusedSymbol
Class "IterableDecorator" is never used
in `query/src/main/kotlin/jetbrains/exodus/query/IterableDecorator.kt`
#### Snippet
```java
import jetbrains.exodus.query.metadata.ModelMetaData

class IterableDecorator(iterable: Iterable<Entity>) : NodeBase() {

    private val it = StaticTypedEntityIterable.instantiate(iterable)
```

### UnusedSymbol
Property "uniqueKeyIndicesEngine" is never used
in `query/src/main/kotlin/jetbrains/exodus/query/QueryEngine.kt`
#### Snippet
```java
        }

    val uniqueKeyIndicesEngine = MetaDataAwareUniqueKeyIndicesEngine(persistentStore, modelMetaData)

    open fun queryGetAll(entityType: String): TreeKeepingEntityIterable = query(null, entityType, NodeFactory.all())
```

### UnusedSymbol
Function "exclude" is never used
in `query/src/main/kotlin/jetbrains/exodus/query/QueryEngine.kt`
#### Snippet
```java
    }

    open fun exclude(left: Iterable<Entity>, right: Iterable<Entity>): Iterable<Entity> {
        if (left.isEmpty || left === right) {
            return EMPTY
```

### UnusedSymbol
Function "concat" is never used
in `query/src/main/kotlin/jetbrains/exodus/query/QueryEngine.kt`
#### Snippet
```java
    }

    open fun concat(left: Iterable<Entity>, right: Iterable<Entity>): Iterable<Entity> {
        if (left.isEmpty) {
            return right
```

### UnusedSymbol
Class "NonAdjustableConcurrentLongObjectCache" is never used
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/NonAdjustableCaches.kt`
#### Snippet
```java
}

class NonAdjustableConcurrentLongObjectCache<V> @JvmOverloads constructor(size: Int = DEFAULT_SIZE,
                                                                          numberOfGenerations: Int = DEFAULT_NUMBER_OF_GENERATIONS)
    : ConcurrentLongObjectCache<V>(size, numberOfGenerations) {
```

### UnusedSymbol
Class "NonAdjustableConcurrentIntObjectCache" is never used
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/NonAdjustableCaches.kt`
#### Snippet
```java
}

class NonAdjustableConcurrentIntObjectCache<V> @JvmOverloads constructor(size: Int = DEFAULT_SIZE,
                                                                         numberOfGenerations: Int = DEFAULT_NUMBER_OF_GENERATIONS)
    : ConcurrentIntObjectCache<V>(size, numberOfGenerations) {
```

### UnusedSymbol
Function "writeFinally" is never used
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/persistent/PersistentEx.kt`
#### Snippet
```java
}

inline fun <V> PersistentLongMap<V>.writeFinally(block: PersistentLongMap.MutableMap<V>.() -> Unit) {
    while (!write(block)) {
    }
```

### UnusedSymbol
Function "writeFinally" is never used
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/persistent/PersistentEx.kt`
#### Snippet
```java
}

inline fun <K, V> PersistentHashMap<K, V>.writeFinally(block: PersistentHashMap<K, V>.MutablePersistentHashMap.() -> Unit) {
    while (!write(block)) {
    }
```

### UnusedSymbol
Function "writeFinally" is never used
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/persistent/PersistentEx.kt`
#### Snippet
```java
}

inline fun <K : Comparable<K>, V> Persistent23TreeMap<K, V>.writeFinally(block: Persistent23TreeMap.MutableMap<K, V>.() -> Unit) {
    while (!write(block)) {
    }
```

### UnusedSymbol
Function "writeFinally" is never used
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/persistent/PersistentEx.kt`
#### Snippet
```java
}

inline fun PersistentLongSet.writeFinally(block: PersistentLongSet.MutableSet.() -> Unit) {
    while (!write(block)) {
    }
```

### UnusedSymbol
Function "writeFinally" is never used
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/persistent/PersistentEx.kt`
#### Snippet
```java
}

inline fun <K, V> PersistentLinkedHashMap<K, V>.writeFinally(block: PersistentLinkedHashMap.PersistentLinkedHashMapMutable<K, V>.() -> Unit) {
    while (!write(block)) {
    }
```

### UnusedSymbol
Function "writeFinally" is never used
in `utils/src/main/kotlin/jetbrains/exodus/core/dataStructures/persistent/PersistentEx.kt`
#### Snippet
```java
}

inline fun <K> PersistentHashSet<K>.writeFinally(block: PersistentHashSet.MutablePersistentHashSet<K>.() -> Unit) {
    while (!write(block)) {
    }
```

### UnusedSymbol
Function "doIfPropertyIsEqualTo" is never used
in `utils/src/main/kotlin/jetbrains/exodus/util/SystemProperty.kt`
#### Snippet
```java
 * Executes an action if specified system property with defaultValue is equal to specified value.
 */
fun doIfPropertyIsEqualTo(prop: String, value: String?, defaultValue: String? = null, action: () -> Unit) {
    if (System.getProperty(prop, defaultValue) == value) {
        action()
```

### UnusedSymbol
Class "DefaultDelegate" is never used
in `utils/src/main/kotlin/jetbrains/exodus/kotlin/Kodus.kt`
#### Snippet
```java
}

class DefaultDelegate<T>(private val getDefault: () -> T) {

    private var value: T? = null
```

### UnusedSymbol
Function "getSystemCpuLoad" is never used
in `utils/src/main/kotlin/jetbrains/exodus/system/OperatingSystem.kt`
#### Snippet
```java

    @JvmStatic
    fun getSystemCpuLoad(): Double {
        cachedSystemCpuLoad.let { cpuLoad ->
            return if (cpuLoad < 0) {
```

### UnusedSymbol
Function "readFully" is never used
in `utils/src/main/kotlin/jetbrains/exodus/util/IOUtil.kt`
#### Snippet
```java
    @JvmOverloads
    @JvmStatic
    fun readFully(input: InputStream, bytes: ByteArray, len: Int = bytes.size): Int {
        var off = 0
        while (off < len) {
```

### UnusedSymbol
Function "cancel" is never used
in `crypto/src/main/kotlin/jetbrains/exodus/crypto/convert/ScytaleEngine.kt`
#### Snippet
```java
    }

    fun cancel() {
        cancelled = true
    }
```

### UnusedSymbol
Property "metaTreeAddress" is never used
in `openAPI/src/main/kotlin/jetbrains/exodus/env/replication/EnvironmentReplicationDelta.kt`
#### Snippet
```java
interface EnvironmentReplicationDelta : LogReplicationDelta {
    val id: Long
    val metaTreeAddress: Long
    val rootAddress: Long
    val encrypted: Boolean
```

### UnusedSymbol
Property "encrypted" is never used
in `openAPI/src/main/kotlin/jetbrains/exodus/env/replication/EnvironmentReplicationDelta.kt`
#### Snippet
```java
    val metaTreeAddress: Long
    val rootAddress: Long
    val encrypted: Boolean
}

```

### UnusedSymbol
Function "newPersistentEntityStoreConfig" is never used
in `openAPI/src/main/kotlin/jetbrains/exodus/entitystore/EntityStoreEx.kt`
#### Snippet
```java
 */

fun newPersistentEntityStoreConfig(configurator: PersistentEntityStoreConfig.() -> Unit): PersistentEntityStoreConfig {
    return PersistentEntityStoreConfig().apply {
        configurator()
```

### UnusedSymbol
Function "clean" is never used
in `environment/src/main/kotlin/jetbrains/exodus/env/management/EnvironmentConfigWithOperations.kt`
#### Snippet
```java
    }

    fun clean() {
        env.clear()
    }
```

### UnusedSymbol
Property "min" is never used
in `entity-store/src/main/kotlin/jetbrains/exodus/entitystore/iterate/UpdatablePropertiesCachedInstanceIterable.kt`
#### Snippet
```java
    private inner class ReversePropertiesCachedInstanceIterator : PropertiesCachedInstanceIteratorBase(currentTree.reverseIterator())

    private inner class ReversePropertyRangeCachedInstanceIterator(private val min: Comparable<Any>,max: Comparable<Any>)
        : PropertiesCachedInstanceIteratorBase(currentTree.reverseIterator())

```

### UnusedSymbol
Class "ReversePropertyRangeCachedInstanceIterator" is never used
in `entity-store/src/main/kotlin/jetbrains/exodus/entitystore/iterate/UpdatablePropertiesCachedInstanceIterable.kt`
#### Snippet
```java
    private inner class ReversePropertiesCachedInstanceIterator : PropertiesCachedInstanceIteratorBase(currentTree.reverseIterator())

    private inner class ReversePropertyRangeCachedInstanceIterator(private val min: Comparable<Any>,max: Comparable<Any>)
        : PropertiesCachedInstanceIteratorBase(currentTree.reverseIterator())

```

### UnusedSymbol
Constructor is never used
in `lucene-directory/src/main/kotlin/jetbrains/exodus/lucene/ExodusDirectory.kt`
#### Snippet
```java
    private val ticks = AtomicLong(System.currentTimeMillis())

    @JvmOverloads constructor(env: ContextualEnvironment,
                              contentsStoreConfig: StoreConfig = StoreConfig.WITHOUT_DUPLICATES) :
            this(env, createDefaultVfsConfig(), contentsStoreConfig, ExodusDirectoryConfig())
```

