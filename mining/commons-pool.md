# commons-pool 
 
# Bad smells
I found 101 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DeprecatedIsStillUsed | 50 | false |
| StringBufferReplaceableByString | 18 | false |
| JavadocDeclaration | 5 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 5 | false |
| DuplicatedCode | 5 | false |
| UnusedAssignment | 4 | false |
| JavadocReference | 2 | false |
| CommentedOutCode | 2 | false |
| ScheduledThreadPoolExecutorWithZeroCoreThreads | 2 | false |
| Deprecation | 2 | false |
| UNCHECKED_WARNING | 1 | false |
| EmptyStatementBody | 1 | false |
| CloneableImplementsClone | 1 | false |
| CatchMayIgnoreException | 1 | false |
| NonAtomicOperationOnVolatileField | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.stream.Stream' to 'java.util.stream.Stream\>\>'
in `src/main/java/org/apache/commons/pool2/impl/SecurityManagerCallStack.java`
#### Snippet
```java
         */
        private List<WeakReference<Class<?>>> getCallStack() {
            final Stream<WeakReference<Class<?>>> map = Stream.of(getClassContext()).map(WeakReference::new);
            return map.collect(Collectors.toList());
        }
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `getClassContext()` is inaccessible from here
in `src/main/java/org/apache/commons/pool2/impl/SecurityManagerCallStack.java`
#### Snippet
```java
 *
 * @see RuntimePermission
 * @see SecurityManager#getClassContext()
 * @since 2.4.3
 */
```

### JavadocReference
Symbol `getWaitingThreads(Condition)` is inaccessible from here
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
    /**
     * Interrupts the threads currently waiting to take an object from the pool. See disclaimer on accuracy in
     * {@link java.util.concurrent.locks.ReentrantLock#getWaitingThreads(Condition)}.
     */
    public void interuptTakeWaiters() {
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `src/main/java/org/apache/commons/pool2/impl/SoftReferenceObjectPool.java`
#### Snippet
```java
        removeClearedReferences(idleReferences.iterator());
        removeClearedReferences(allReferences.iterator());
        while (refQueue.poll() != null) { // NOPMD
        }
    }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     * {@link #getMinEvictableIdleTimeMillis} (that is, if
     * {@link #getMinEvictableIdleTimeMillis} is positive, then
     * {@link #getSoftMinEvictableIdleTimeMillis} is ignored).
     *
     * @return minimum amount of time an object may sit idle in the pool before
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     * {@link #getMinEvictableIdleTime} (that is, if
     * {@link #getMinEvictableIdleTime} is positive, then
     * {@link #getSoftMinEvictableIdleTime} is ignored).
     *
     * @return minimum amount of time an object may sit idle in the pool before
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     * number of idle instances in the pool. When negative, the number of tests
     * performed will be <code>ceil({@link #getNumIdle}/
     * abs({@link #getNumTestsPerEvictionRun}))</code> which means that when the
     * value is {@code -n} roughly one nth of the idle objects will be
     * tested per run.
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
     * Register the use of a key by an object.
     * <p>
     * {@link #register(Object)} and {@link #deregister(Object)} must always be used as a pair.
     * </p>
     *
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
     * De-register the use of a key by an object.
     * <p>
     * {@link #register(Object)} and {@link #deregister(Object)} must always be used as a pair.
     * </p>
     *
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'getLastUsed' is still used
in `src/main/java/org/apache/commons/pool2/TrackedUse.java`
#### Snippet
```java
     */
    @Deprecated
    long getLastUsed();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getIdleEvictTime' is still used
in `src/main/java/org/apache/commons/pool2/impl/EvictionConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public long getIdleEvictTime() {
        return idleEvictDuration.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getIdleSoftEvictTimeDuration' is still used
in `src/main/java/org/apache/commons/pool2/impl/EvictionConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public Duration getIdleSoftEvictTimeDuration() {
        return idleSoftEvictDuration;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getIdleSoftEvictTime' is still used
in `src/main/java/org/apache/commons/pool2/impl/EvictionConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public long getIdleSoftEvictTime() {
        return idleSoftEvictDuration.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getIdleEvictTimeDuration' is still used
in `src/main/java/org/apache/commons/pool2/impl/EvictionConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public Duration getIdleEvictTimeDuration() {
        return idleEvictDuration;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setRemoveAbandonedTimeout' is still used
in `src/main/java/org/apache/commons/pool2/impl/AbandonedConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public void setRemoveAbandonedTimeout(final int removeAbandonedTimeoutSeconds) {
        setRemoveAbandonedTimeout(Duration.ofSeconds(removeAbandonedTimeoutSeconds));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getCreateTime' is still used
in `src/main/java/org/apache/commons/pool2/PooledObject.java`
#### Snippet
```java
     */
    @Deprecated
    long getCreateTime();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/pool2/PooledObject.java`
#### Snippet
```java
     */
    @Deprecated
    long getIdleTimeMillis();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getLastBorrowTime' is still used
in `src/main/java/org/apache/commons/pool2/PooledObject.java`
#### Snippet
```java
     */
    @Deprecated
    long getLastBorrowTime();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getLastUsedTime' is still used
in `src/main/java/org/apache/commons/pool2/PooledObject.java`
#### Snippet
```java
     */
    @Deprecated
    long getLastUsedTime();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getIdleTime' is still used
in `src/main/java/org/apache/commons/pool2/PooledObject.java`
#### Snippet
```java
     */
    @Deprecated
    default Duration getIdleTime() {
        return Duration.ofMillis(getIdleTimeMillis());
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getRemoveAbandonedTimeout' is still used
in `src/main/java/org/apache/commons/pool2/impl/AbandonedConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public int getRemoveAbandonedTimeout() {
        return (int) this.removeAbandonedTimeoutDuration.getSeconds();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getLastReturnTime' is still used
in `src/main/java/org/apache/commons/pool2/PooledObject.java`
#### Snippet
```java
     */
    @Deprecated
    long getLastReturnTime();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getActiveTimeMillis' is still used
in `src/main/java/org/apache/commons/pool2/PooledObject.java`
#### Snippet
```java
     */
    @Deprecated
    long getActiveTimeMillis();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getActiveTime' is still used
in `src/main/java/org/apache/commons/pool2/PooledObject.java`
#### Snippet
```java
     */
    @Deprecated
    default Duration getActiveTime() {
        return getActiveDuration();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'prefill' is still used
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static <T, E extends Exception> void prefill(final ObjectPool<T, E> pool, final int count)
            throws E, IllegalArgumentException {
        if (pool == null) {
```

### DeprecatedIsStillUsed
Deprecated member 'prefill' is still used
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static <K, V, E extends Exception> void prefill(final KeyedObjectPool<K, V, E> keyedPool,
            final K key, final int count) throws E,
            IllegalArgumentException {
```

### DeprecatedIsStillUsed
Deprecated member 'prefill' is still used
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static <K, V, E extends Exception> void prefill(final KeyedObjectPool<K, V, E> keyedPool,
            final Collection<K> keys, final int count) throws E,
            IllegalArgumentException {
```

### DeprecatedIsStillUsed
Deprecated member 'DEFAULT_SOFT_MIN_EVICTABLE_IDLE_TIME' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public static final Duration DEFAULT_SOFT_MIN_EVICTABLE_IDLE_TIME =
            Duration.ofMillis(DEFAULT_SOFT_MIN_EVICTABLE_IDLE_TIME_MILLIS);

```

### DeprecatedIsStillUsed
Deprecated member 'getMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public long getMinEvictableIdleTimeMillis() {
        return minEvictableIdleDuration.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'DEFAULT_MAX_WAIT_MILLIS' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public static final long DEFAULT_MAX_WAIT_MILLIS = -1L;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getTimeBetweenEvictionRuns' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public Duration getTimeBetweenEvictionRuns() {
        return durationBetweenEvictionRuns;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'DEFAULT_TIME_BETWEEN_EVICTION_RUNS_MILLIS' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public static final long DEFAULT_TIME_BETWEEN_EVICTION_RUNS_MILLIS = -1L;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'DEFAULT_MIN_EVICTABLE_IDLE_TIME_MILLIS' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public static final long DEFAULT_MIN_EVICTABLE_IDLE_TIME_MILLIS = 1000L * 60L * 30L;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'DEFAULT_MIN_EVICTABLE_IDLE_TIME' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public static final Duration DEFAULT_MIN_EVICTABLE_IDLE_TIME =
            Duration.ofMillis(DEFAULT_MIN_EVICTABLE_IDLE_TIME_MILLIS);

```

### DeprecatedIsStillUsed
Deprecated member 'getMaxWaitMillis' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public long getMaxWaitMillis() {
        return maxWaitDuration.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getMinEvictableIdleTime' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public Duration getMinEvictableIdleTime() {
        return minEvictableIdleDuration;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     */
    @Deprecated
    public final void setMinEvictableIdleTimeMillis(final long minEvictableIdleTimeMillis) {
        setMinEvictableIdleTime(Duration.ofMillis(minEvictableIdleTimeMillis));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setTimeBetweenEvictionRunsMillis' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public void setTimeBetweenEvictionRunsMillis(final long timeBetweenEvictionRunsMillis) {
        setTimeBetweenEvictionRuns(Duration.ofMillis(timeBetweenEvictionRunsMillis));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getTimeBetweenEvictionRunsMillis' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     */
    @Deprecated
    public final long getTimeBetweenEvictionRunsMillis() {
        return durationBetweenEvictionRuns.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getEvictorShutdownTimeout' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public Duration getEvictorShutdownTimeout() {
        return evictorShutdownTimeoutDuration;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setSoftMinEvictableIdleTime' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     */
    @Deprecated
    public final void setSoftMinEvictableIdleTime(final Duration softMinEvictableIdleTime) {
        this.softMinEvictableIdleDuration = PoolImplUtils.nonNull(softMinEvictableIdleTime, BaseObjectPoolConfig.DEFAULT_SOFT_MIN_EVICTABLE_IDLE_DURATION);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'DEFAULT_SOFT_MIN_EVICTABLE_IDLE_TIME_MILLIS' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public static final long DEFAULT_SOFT_MIN_EVICTABLE_IDLE_TIME_MILLIS = -1;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getEvictorShutdownTimeout' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     */
    @Deprecated
    public final Duration getEvictorShutdownTimeout() {
        return evictorShutdownTimeoutDuration;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getEvictorShutdownTimeoutMillis' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public long getEvictorShutdownTimeoutMillis() {
        return evictorShutdownTimeoutDuration.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getEvictorShutdownTimeoutMillis' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     */
    @Deprecated
    public final long getEvictorShutdownTimeoutMillis() {
        return evictorShutdownTimeoutDuration.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public void setMinEvictableIdleTimeMillis(final long minEvictableIdleTimeMillis) {
        this.minEvictableIdleDuration = Duration.ofMillis(minEvictableIdleTimeMillis);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getTimeBetweenEvictionRuns' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     */
    @Deprecated
    public final Duration getTimeBetweenEvictionRuns() {
        return durationBetweenEvictionRuns;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getTimeBetweenEvictionRunsMillis' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public long getTimeBetweenEvictionRunsMillis() {
        return durationBetweenEvictionRuns.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     */
    @Deprecated
    public final long getMinEvictableIdleTimeMillis() {
        return minEvictableIdleDuration.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'DEFAULT_EVICTOR_SHUTDOWN_TIMEOUT_MILLIS' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public static final long DEFAULT_EVICTOR_SHUTDOWN_TIMEOUT_MILLIS = 10L * 1000L;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'setSoftMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     */
    @Deprecated
    public final void setSoftMinEvictableIdleTimeMillis(final long softMinEvictableIdleTimeMillis) {
        setSoftMinEvictableIdleTime(Duration.ofMillis(softMinEvictableIdleTimeMillis));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setMaxWaitMillis' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     */
    @Deprecated
    public final void setMaxWaitMillis(final long maxWaitMillis) {
        setMaxWait(Duration.ofMillis(maxWaitMillis));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getMaxWaitMillis' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     */
    @Deprecated
    public final long getMaxWaitMillis() {
        return maxWaitDuration.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getSoftMinEvictableIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     */
    @Deprecated
    public final long getSoftMinEvictableIdleTimeMillis() {
        return softMinEvictableIdleDuration.toMillis();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setMinEvictableIdleTime' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     */
    @Deprecated
    public final void setMinEvictableIdleTime(final Duration minEvictableIdleTime) {
        this.minEvictableIdleDuration = PoolImplUtils.nonNull(minEvictableIdleTime, BaseObjectPoolConfig.DEFAULT_MIN_EVICTABLE_IDLE_DURATION);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getSoftMinEvictableIdleTime' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     */
    @Deprecated
    public final Duration getSoftMinEvictableIdleTime() {
        return softMinEvictableIdleDuration;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getMinEvictableIdleTime' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     */
    @Deprecated
    public final Duration getMinEvictableIdleTime() {
        return minEvictableIdleDuration;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getRemoveAbandonedTimeout' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     */
    @Deprecated
    public int getRemoveAbandonedTimeout() {
        return (int) getRemoveAbandonedTimeoutDuration().getSeconds();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setTimeBetweenEvictionRunsMillis' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     */
    @Deprecated
    public final void setTimeBetweenEvictionRunsMillis(final long timeBetweenEvictionRunsMillis) {
        setTimeBetweenEvictionRuns(Duration.ofMillis(timeBetweenEvictionRunsMillis));
    }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (32 lines)
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
     */

//     /**
//      * Adds all of the elements in the specified collection to this
//      * queue.  Attempts to addAll of a queue to itself result in
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
        do {
            currentMaxDuration = maxBorrowWaitDuration.get();
//            if (currentMaxDuration >= waitDuration) {
//                break;
//            }
```

## RuleId[id=CloneableImplementsClone]
### CloneableImplementsClone
`BaseObjectPoolConfig` is 'Cloneable' but does not define 'clone()' method
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
 * @since 2.0
 */
public abstract class BaseObjectPoolConfig<T> extends BaseObject implements Cloneable {

    /**
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `p`
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java
                    "Invalidated object not currently part of this pool");
        }
        synchronized (p) {
            if (p.getState() != PooledObjectState.INVALID) {
                destroy(p, destroyMode);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `pooledObject`
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     */
    protected void markReturningState(final PooledObject<T> pooledObject) {
        synchronized (pooledObject) {
            if (pooledObject.getState() != PooledObjectState.ALLOCATED) {
                throw new IllegalStateException("Object has already been returned to this pool or is invalid");
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `pooledObject`
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
        final ArrayList<PooledObject<T>> remove = new ArrayList<>();
        allObjects.values().forEach(pooledObject -> {
            synchronized (pooledObject) {
                if (pooledObject.getState() == PooledObjectState.ALLOCATED &&
                        pooledObject.getLastUsedInstant().compareTo(timeout) <= 0) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `toDestroy`
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
        try {
            boolean isIdle;
            synchronized (toDestroy) {
                // Check idle state directly
                isIdle = toDestroy.getState().equals(PooledObjectState.IDLE);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `p`
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
            throw new IllegalStateException(appendStats("Object not currently part of this pool"));
        }
        synchronized (p) {
            if (p.getState() != PooledObjectState.INVALID) {
                destroy(key, p, true, destroyMode);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
        builder.append(evictionPolicyClassName);
        builder.append(", testOnCreate=");
        builder.append(testOnCreate);
        builder.append(", testOnBorrow=");
        builder.append(testOnBorrow);
        builder.append(", testOnReturn=");
        builder.append(testOnReturn);
        builder.append(", testWhileIdle=");
        builder.append(testWhileIdle);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
        builder.append(", testOnCreate=");
        builder.append(testOnCreate);
        builder.append(", testOnBorrow=");
        builder.append(testOnBorrow);
        builder.append(", testOnReturn=");
        builder.append(testOnReturn);
        builder.append(", testWhileIdle=");
        builder.append(testWhileIdle);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
        assertOpen();

        final AbandonedConfig ac = this.abandonedConfig;
        if (ac != null && ac.getRemoveAbandonedOnBorrow() && getNumIdle() < 2 &&
                getNumActive() > getMaxTotal() - 3) {
            removeAbandoned(ac);
        }

        PooledObject<T> p = null;

        // Get local copy of current config so it is consistent for entire
        // method execution
        final boolean blockWhenExhausted = getBlockWhenExhausted();

        boolean create;
        final Instant waitTime = Instant.now();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java
            try {
                destroy(p, DestroyMode.NORMAL);
            } catch (final Exception e) {
                swallowException(e);
            }
            try {
                ensureIdle(1, false);
            } catch (final Exception e) {
                swallowException(e);
            }
            updateStatsReturn(activeTime);
            return;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/pool2/impl/SecurityManagerCallStack.java`
#### Snippet
```java
        final Snapshot snapshotRef = this.snapshot;
        if (snapshotRef == null) {
            return false;
        }
        final String message;
        if (dateFormat == null) {
            message = messageFormat;
        } else {
            synchronized (dateFormat) {
                message = dateFormat.format(Long.valueOf(snapshotRef.timestampMillis));
            }
        }
        writer.println(message);
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `src/main/java/org/apache/commons/pool2/impl/SoftReferenceObjectPool.java`
#### Snippet
```java
                    try {
                        destroy(ref);
                    } catch (final Throwable t2) {
                        PoolUtils.checkRethrow(t2);
                        // Swallowed
```

## RuleId[id=ScheduledThreadPoolExecutorWithZeroCoreThreads]
### ScheduledThreadPoolExecutorWithZeroCoreThreads
'ScheduledThreadPoolExecutor' should not have zero core threads
in `src/main/java/org/apache/commons/pool2/impl/EvictionTimer.java`
#### Snippet
```java
                if (TASK_MAP.isEmpty() && executor != null) {
                    executor.shutdown();
                    executor.setCorePoolSize(0);
                    executor = null;
                }
```

### ScheduledThreadPoolExecutorWithZeroCoreThreads
'ScheduledThreadPoolExecutor' should not have zero core threads
in `src/main/java/org/apache/commons/pool2/impl/EvictionTimer.java`
#### Snippet
```java
                // Significant API changes would be required to propagate this
            }
            executor.setCorePoolSize(0);
            executor = null;
        }
```

## RuleId[id=Deprecation]
### Deprecation
Overrides deprecated method in 'org.apache.commons.pool2.PooledObject'
in `src/main/java/org/apache/commons/pool2/impl/DefaultPooledObject.java`
#### Snippet
```java

    @Override
    public Duration getIdleTime() {
        return getIdleDuration();
    }
```

### Deprecation
'setTimeBetweenEvictionRunsMillis(long)' is deprecated
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
     * @return minimum size of the each keyed pool
     *
     * @see #setTimeBetweenEvictionRunsMillis
     */
    @Override
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/pool2/proxy/ProxiedObjectPool.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("ProxiedObjectPool [pool=");
        builder.append(pool);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/pool2/proxy/JdkProxySource.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("JdkProxySource [classLoader=");
        builder.append(classLoader);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/pool2/proxy/CglibProxySource.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("CglibProxySource [superclass=");
        builder.append(superclass);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/pool2/impl/EvictionTimer.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("EvictionTimer []");
        return builder.toString();
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/pool2/impl/DefaultPooledObjectInfo.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("DefaultPooledObjectInfo [pooledObject=");
        builder.append(pooledObject);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/pool2/proxy/BaseProxyHandler.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getClass().getName());
        builder.append(" [pooledObject=");
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/pool2/impl/EvictionConfig.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("EvictionConfig [idleEvictDuration=");
        builder.append(idleEvictDuration);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/pool2/proxy/ProxiedKeyedObjectPool.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("ProxiedKeyedObjectPool [pool=");
        builder.append(pool);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/pool2/impl/AbandonedConfig.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("AbandonedConfig [removeAbandonedOnBorrow=");
        builder.append(removeAbandonedOnBorrow);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ObjectPoolMinIdleTimerTask");
            sb.append("{minIdle=").append(minIdle);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("SynchronizedObjectPool");
            sb.append("{pool=").append(pool);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("SynchronizedPoolableObjectFactory");
            sb.append("{factory=").append(factory);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("SynchronizedKeyedObjectPool");
            sb.append("{keyedPool=").append(keyedPool);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("KeyedObjectPoolMinIdleTimerTask");
            sb.append("{minIdle=").append(minIdle);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("SynchronizedKeyedPooledObjectFactory");
            sb.append("{keyedFactory=").append(keyedFactory);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder builder = new StringBuilder();
            builder.append("StatsStore [");
            // Only append what's been filled in.
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder builder = new StringBuilder();
            builder.append("IdentityWrapper [instance=");
            builder.append(instance);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder builder = new StringBuilder();
            builder.append("ObjectDeque [idleObjects=");
            builder.append(idleObjects);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `underTest` initializer `null` is redundant
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java
        if (!idleObjects.isEmpty()) {

            PooledObject<T> underTest = null;
            final EvictionPolicy<T> evictionPolicy = getEvictionPolicy();

```

### UnusedAssignment
Variable `objectDeque` initializer `null` is redundant
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
    private ObjectDeque<T> register(final K k) {
        Lock lock = keyLock.readLock();
        ObjectDeque<T> objectDeque = null;
        try {
            lock.lock();
```

### UnusedAssignment
Variable `underTest` initializer `null` is redundant
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
        if (getNumIdle() > 0) {

            PooledObject<T> underTest = null;
            final EvictionPolicy<T> evictionPolicy = getEvictionPolicy();

```

### UnusedAssignment
Variable `p` initializer `null` is redundant
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
        }

        PooledObject<T> p = null;
        try {
            p = factory.makeObject(key);
```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `idleHighWaterMark`
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
        public void update(final long nowMillis, final int numIdle) {
            final int idle = Math.max(0, numIdle);
            idleHighWaterMark = Math.max(idle, idleHighWaterMark);
            final float maxInterval = 15f;
            final float minutes = maxInterval +
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ThreadPoolExecutor.awaitTermination()` is ignored
in `src/main/java/org/apache/commons/pool2/impl/EvictionTimer.java`
#### Snippet
```java
            executor.shutdown();
            try {
                executor.awaitTermination(timeout.toMillis(), TimeUnit.MILLISECONDS);
            } catch (final InterruptedException e) {
                // Swallow
```

