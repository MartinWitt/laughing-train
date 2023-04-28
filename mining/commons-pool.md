# commons-pool 
 
# Bad smells
I found 192 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DeprecatedIsStillUsed | 50 | false |
| StringBufferReplaceableByString | 18 | false |
| BoundedWildcard | 18 | false |
| PublicFieldAccessedInSynchronizedContext | 18 | false |
| ReturnNull | 17 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 10 | false |
| SynchronizeOnThis | 7 | false |
| UnnecessaryBoxing | 6 | false |
| NestedAssignment | 5 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 5 | false |
| AssignmentToForLoopParameter | 4 | false |
| RedundantSuppression | 4 | false |
| UnnecessaryUnboxing | 4 | false |
| UnusedAssignment | 4 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| UnnecessaryFullyQualifiedName | 3 | false |
| AssignmentToMethodParameter | 3 | false |
| CommentedOutCode | 2 | false |
| SystemOutErr | 2 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| AbstractMethodCallInConstructor | 1 | false |
| CatchMayIgnoreException | 1 | false |
| NonShortCircuitBoolean | 1 | false |
| NestedSynchronizedStatement | 1 | false |
| UtilityClassWithPublicConstructor | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| HtmlWrongAttributeValue | 1 | false |
| WaitNotInLoop | 1 | false |
## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `PoolImplUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/pool2/impl/PoolImplUtils.java`
#### Snippet
```java
 * @since 2.0
 */
class PoolImplUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `TimerHolder` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
     * {@link Timer} creates a {@link Thread}, an IODH is used.
     */
    static class TimerHolder {
        static final Timer MIN_IDLE_TIMER = new Timer(true);
    }
```

### UtilityClassWithoutPrivateConstructor
Class `PoolUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
 * @since 2.0
 */
public final class PoolUtils {

    /**
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `executor` from instance context
in `src/main/java/org/apache/commons/pool2/impl/EvictionTimer.java`
#### Snippet
```java
                    executor.shutdown();
                    executor.setCorePoolSize(0);
                    executor = null;
                }
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

## RuleId[id=DeprecatedIsStillUsed]
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
    public static <T, E extends Exception> void prefill(final ObjectPool<T, E> pool, final int count)
            throws E, IllegalArgumentException {
        if (pool == null) {
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `firstNode()` during object construction
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
            lock.lock();
            try {
                next = firstNode();
                nextItem = next == null ? null : next.item;
            } finally {
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

## RuleId[id=StringBufferReplaceableByString]
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
            sb.append("SynchronizedKeyedPooledObjectFactory");
            sb.append("{keyedFactory=").append(keyedFactory);
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
            sb.append("KeyedObjectPoolMinIdleTimerTask");
            sb.append("{minIdle=").append(minIdle);
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `written |= usedBy.printStackTrace(writer)`
in `src/main/java/org/apache/commons/pool2/impl/DefaultPooledObject.java`
#### Snippet
```java
    public void printStackTrace(final PrintWriter writer) {
        boolean written = borrowedBy.printStackTrace(writer);
        written |= usedBy.printStackTrace(writer);
        if (written) {
            writer.flush();
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java
                        // Object was borrowed in another thread
                        // Don't count this as an eviction test so reduce i;
                        i--;
                        evictionIterator = null;
                        continue;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java
                        // Object was borrowed in another thread
                        // Don't count this as an eviction test so reduce i;
                        i--;
                        continue;
                    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
                        // Object was borrowed in another thread
                        // Don't count this as an eviction test so reduce i;
                        i--;
                        evictionIterator = null;
                        continue;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
                        // Object was borrowed in another thread
                        // Don't count this as an eviction test so reduce i;
                        i--;
                        continue;
                    }
```

## RuleId[id=NestedSynchronizedStatement]
### NestedSynchronizedStatement
Nested `synchronized` statement
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
                }
            } else if (isPositiverDelay) { // Stop or restart of existing evictor: Restart
                synchronized (EvictionTimer.class) { // Ensure no cancel can happen between cancel / schedule calls
                    EvictionTimer.cancel(evictor, evictorShutdownTimeoutDuration, true);
                    evictor = null;
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends K`
in `src/main/java/org/apache/commons/pool2/KeyedObjectPool.java`
#### Snippet
```java
     * @see #addObjects(Object, int)
     */
    default void addObjects(final Collection<K> keys, final int count) throws E, IllegalArgumentException {
        if (keys == null) {
            throw new IllegalArgumentException(PoolUtils.MSG_NULL_KEYS);
```

### BoundedWildcard
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/pool2/proxy/ProxiedObjectPool.java`
#### Snippet
```java
     * @param proxySource The source of the proxy objects
     */
    public ProxiedObjectPool(final ObjectPool<T, E> pool, final ProxySource<T> proxySource) {
        this.pool = pool;
        this.proxySource = proxySource;
```

### BoundedWildcard
Can generalize to `? extends PooledSoftReference`
in `src/main/java/org/apache/commons/pool2/impl/SoftReferenceObjectPool.java`
#### Snippet
```java
     * @param iterator iterator over idle/allReferences
     */
    private void removeClearedReferences(final Iterator<PooledSoftReference<T>> iterator) {
        PooledSoftReference<T> ref;
        while (iterator.hasNext()) {
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/org/apache/commons/pool2/proxy/JdkProxySource.java`
#### Snippet
```java
    @SuppressWarnings("unchecked") // Cast to T on return.
    @Override
    public T createProxy(final T pooledObject, final UsageTracking<T> usageTracking) {
        return (T) Proxy.newProxyInstance(classLoader, interfaces,
                new JdkProxyHandler<>(pooledObject, usageTracking));
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/org/apache/commons/pool2/proxy/BaseProxyHandler.java`
#### Snippet
```java
     *                      wrapped object
     */
    BaseProxyHandler(final T pooledObject, final UsageTracking<T> usageTracking) {
        this.pooledObject = pooledObject;
        this.usageTracking = usageTracking;
```

### BoundedWildcard
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/pool2/proxy/ProxiedKeyedObjectPool.java`
#### Snippet
```java
     * @param proxySource The source of the proxy objects
     */
    public ProxiedKeyedObjectPool(final KeyedObjectPool<K, V, E> pool,
            final ProxySource<V> proxySource) {
        this.pool = pool;
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/org/apache/commons/pool2/impl/EvictionTimer.java`
#### Snippet
```java
         * @param ref the reference to track.
         */
        private WeakRunner(final WeakReference<R> ref) {
           this.ref = ref;
        }
```

### BoundedWildcard
Can generalize to `? super PooledObject`
in `src/main/java/org/apache/commons/pool2/impl/DefaultPooledObject.java`
#### Snippet
```java
    @Override
    public synchronized boolean endEvictionTest(
            final Deque<PooledObject<T>> idleQueue) {
        if (state == PooledObjectState.EVICTION) {
            state = PooledObjectState.IDLE;
```

### BoundedWildcard
Can generalize to `? extends PooledObject`
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     * @return a list of pooled objects to remove based on their state.
     */
    ArrayList<PooledObject<T>> createRemoveList(final AbandonedConfig abandonedConfig, final Map<IdentityWrapper<T>, PooledObject<T>> allObjects) {
        final Instant timeout = Instant.now().minus(abandonedConfig.getRemoveAbandonedTimeoutDuration());
        final ArrayList<PooledObject<T>> remove = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super K`
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
     */
    public static <K, V, E extends Exception> Map<K, TimerTask> checkMinIdle(
            final KeyedObjectPool<K, V, E> keyedPool, final Collection<K> keys,
            final int minIdle, final long periodMillis)
            throws IllegalArgumentException {
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
     */
    public static <K, V, E extends Exception> Map<K, TimerTask> checkMinIdle(
            final KeyedObjectPool<K, V, E> keyedPool, final Collection<K> keys,
            final int minIdle, final long periodMillis)
            throws IllegalArgumentException {
```

### BoundedWildcard
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
         * @see #factor
         */
        public ErodingObjectPool(final ObjectPool<T, E> pool, final float factor) {
            this.pool = pool;
            this.factor = new ErodingFactor(factor);
```

### BoundedWildcard
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
         *             if the pool is null
         */
        SynchronizedObjectPool(final ObjectPool<T, E> pool)
                throws IllegalArgumentException {
            if (pool == null) {
```

### BoundedWildcard
Can generalize to `? super K`
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
         *             if the factory is null
         */
        SynchronizedKeyedPooledObjectFactory(final KeyedPooledObjectFactory<K, V, E> keyedFactory) throws IllegalArgumentException {
            if (keyedFactory == null) {
                throw new IllegalArgumentException(
```

### BoundedWildcard
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
         *             if the factory is null
         */
        SynchronizedKeyedPooledObjectFactory(final KeyedPooledObjectFactory<K, V, E> keyedFactory) throws IllegalArgumentException {
            if (keyedFactory == null) {
                throw new IllegalArgumentException(
```

### BoundedWildcard
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
         *             if keyedPool is null
         */
        SynchronizedKeyedObjectPool(final KeyedObjectPool<K, V, E> keyedPool)
                throws IllegalArgumentException {
            if (keyedPool == null) {
```

### BoundedWildcard
Can generalize to `? super K`
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
         *             if the key is null
         */
        KeyedObjectPoolMinIdleTimerTask(final KeyedObjectPool<K, V, E> keyedPool,
                final K key, final int minIdle) throws IllegalArgumentException {
            if (keyedPool == null) {
```

### BoundedWildcard
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
         *             if the factory is null
         */
        SynchronizedPooledObjectFactory(final PooledObjectFactory<T, E> factory)
                throws IllegalArgumentException {
            if (factory == null) {
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `closed` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java
            stopEvictor();

            closed = true;
            // This clear removes any idle objects
            clear();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java

                for (int i = 0, m = getNumTests(); i < m; i++) {
                    if (evictionIterator == null || !evictionIterator.hasNext()) {
                        evictionIterator = new EvictionIterator(idleObjects);
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java

                for (int i = 0, m = getNumTests(); i < m; i++) {
                    if (evictionIterator == null || !evictionIterator.hasNext()) {
                        evictionIterator = new EvictionIterator(idleObjects);
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java
                for (int i = 0, m = getNumTests(); i < m; i++) {
                    if (evictionIterator == null || !evictionIterator.hasNext()) {
                        evictionIterator = new EvictionIterator(idleObjects);
                    }
                    if (!evictionIterator.hasNext()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java
                        evictionIterator = new EvictionIterator(idleObjects);
                    }
                    if (!evictionIterator.hasNext()) {
                        // Pool exhausted, nothing to do here
                        return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java

                    try {
                        underTest = evictionIterator.next();
                    } catch (final NoSuchElementException nsee) {
                        // Object was borrowed in another thread
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java
                        // Don't count this as an eviction test so reduce i;
                        i--;
                        evictionIterator = null;
                        continue;
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
                    EvictionTimer.cancel(evictor, evictorShutdownTimeoutDuration, true);
                    evictor = null;
                    evictionIterator = null;
                    evictor = new Evictor();
                    EvictionTimer.schedule(evictor, delay, delay);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `closed` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
            stopEvictor();

            closed = true;
            // This clear removes any idle objects
            clear();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java

                for (int i = 0, m = getNumTests(); i < m; i++) {
                    if (evictionIterator == null || !evictionIterator.hasNext()) {
                        if (evictionKeyIterator == null ||
                                !evictionKeyIterator.hasNext()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java

                for (int i = 0, m = getNumTests(); i < m; i++) {
                    if (evictionIterator == null || !evictionIterator.hasNext()) {
                        if (evictionKeyIterator == null ||
                                !evictionKeyIterator.hasNext()) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java

                            final Deque<PooledObject<T>> idleObjects = objectDeque.getIdleObjects();
                            evictionIterator = new EvictionIterator(idleObjects);
                            if (evictionIterator.hasNext()) {
                                break;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
                            final Deque<PooledObject<T>> idleObjects = objectDeque.getIdleObjects();
                            evictionIterator = new EvictionIterator(idleObjects);
                            if (evictionIterator.hasNext()) {
                                break;
                            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
                                break;
                            }
                            evictionIterator = null;
                        }
                    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
                        }
                    }
                    if (evictionIterator == null) {
                        // Pools exhausted
                        return;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
                    final Deque<PooledObject<T>> idleObjects;
                    try {
                        underTest = evictionIterator.next();
                        idleObjects = evictionIterator.getIdleObjects();
                    } catch (final NoSuchElementException nsee) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
                    try {
                        underTest = evictionIterator.next();
                        idleObjects = evictionIterator.getIdleObjects();
                    } catch (final NoSuchElementException nsee) {
                        // Object was borrowed in another thread
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
                        // Don't count this as an eviction test so reduce i;
                        i--;
                        evictionIterator = null;
                        continue;
                    }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
        @SuppressWarnings("resource") // getKeyedPool(): ivar access
        @Override
        public String toString() {
            return "ErodingPerKeyKeyedObjectPool{" + "factor=" + factor +
                    ", keyedPool=" + getKeyedPool() + '}';
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/pool2/impl/AbandonedConfig.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    private AbandonedConfig(final AbandonedConfig abandonedConfig) {
        this.setLogAbandoned(abandonedConfig.getLogAbandoned());
        this.setLogWriter(abandonedConfig.getLogWriter());
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // The PrintWriter is managed elsewhere
    private void removeAbandoned(final AbandonedConfig abandonedConfig) {
        poolMap.forEach((key, value) -> {
            // Generate a list of abandoned objects to remove
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // PrintWriter is managed elsewhere
    private void removeAbandoned(final AbandonedConfig abandonedConfig) {
        // Generate a list of abandoned objects to remove
        final ArrayList<PooledObject<T>> remove = createRemoveList(abandonedConfig, allObjects);
```

## RuleId[id=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `PoolUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
 * @since 2.0
 */
public final class PoolUtils {

    /**
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/pool2/impl/DefaultPooledObjectInfo.java`
#### Snippet
```java

    private String getTimeMillisFormatted(final long millis) {
        return new SimpleDateFormat(PATTERN).format(Long.valueOf(millis));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/pool2/impl/ThrowableCallStack.java`
#### Snippet
```java
        } else {
            synchronized (dateFormat) {
                message = dateFormat.format(Long.valueOf(snapshotRef.timestampMillis));
            }
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/pool2/impl/PoolImplUtils.java`
#### Snippet
```java
        for (int i = 0; i < tvs.length; i++) {
            if (tvs[i].equals(argType)) {
                return Integer.valueOf(i);
            }
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/pool2/impl/SecurityManagerCallStack.java`
#### Snippet
```java
        } else {
            synchronized (dateFormat) {
                message = dateFormat.format(Long.valueOf(snapshotRef.timestampMillis));
            }
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
    }

    private static final Integer ZERO = Integer.valueOf(0);

    // JMX specific attributes
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
        return poolMap.entrySet().stream().collect(Collectors.toMap(
                e -> e.getKey().toString(),
                e -> Integer.valueOf(e.getValue().getAllObjects().size() - e.getValue().getIdleObjects().size()),
                (t, u) -> u));
    }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/pool2/impl/AbandonedConfig.java`
#### Snippet
```java
     * Use of default system encoding is deliberate.
     */
    private PrintWriter logWriter = new PrintWriter(new OutputStreamWriter(System.out, Charset.defaultCharset()));

    /**
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
                    // Log problem but give evictor thread a chance to continue
                    // in case error is recoverable
                    oome.printStackTrace(System.err);
                }
                // Re-create idle instances.
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/pool2/impl/PoolImplUtils.java`
#### Snippet
```java
            // Map that unknown type to the generic types defined in this class
            final ParameterizedType superClassType = (ParameterizedType) clazz.getGenericSuperclass();
            return getTypeParameter(clazz, superClassType.getActualTypeArguments()[((Integer) result).intValue()]);
        }
        // Error will be logged further up the call stack
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/pool2/impl/PoolImplUtils.java`
#### Snippet
```java
            final ParameterizedType pi = getParameterizedType(type, factoryClass);
            if (pi != null) {
                final Type[] bounds = ((TypeVariable) pi.getActualTypeArguments()[((Integer) genericType).intValue()])
                        .getBounds();
                if (bounds != null && bounds.length > 0) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java
        }

        if (!create.booleanValue()) {
            return null;
        }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
        }

        if (!create.booleanValue()) {
            numTotal.decrementAndGet();
            return null;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.lang.ref` is unnecessary and can be removed
in `src/main/java/org/apache/commons/pool2/impl/SoftReferenceObjectPool.java`
#### Snippet
```java

/**
 * A {@link java.lang.ref.SoftReference SoftReference} based {@link ObjectPool}.
 * <p>
 * This class is intended to be thread-safe.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
     * @throws  IOException if I/O errors occur while writing to the underlying {@code OutputStream}
     */
    private void writeObject(final java.io.ObjectOutputStream s) throws IOException {
        lock.lock();
        try {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
        try {
            if (a.length < count) {
                a = (T[])java.lang.reflect.Array.newInstance
                    (a.getClass().getComponentType(), count);
            }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
        try {
            E x;
            while ( (x = unlinkLast()) == null) {
                notEmpty.await();
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
        try {
            E x;
            while ( (x = unlinkLast()) == null) {
                if (nanos <= 0) {
                    return null;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
                f = n;
            }
            first = last = null;
            count = 0;
            notFull.signalAll();
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
        try {
            E x;
            while ((x = unlinkFirst()) == null) {
                if (nanos <= 0) {
                    return null;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
        try {
            E x;
            while ( (x = unlinkFirst()) == null) {
                notEmpty.await();
            }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `BaseGenericObjectPool()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     * @param jmxNamePrefix Prefix to be used for JMX name for the new pool
     */
    public BaseGenericObjectPool(final BaseObjectPoolConfig<T> config,
            final String jmxNameBase, final String jmxNamePrefix) {
        if (config.getJmxEnabled()) {
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `createCount` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/SoftReferenceObjectPool.java`
#### Snippet
```java

    /** Total number of instances that have been created */
    private long createCount; // @GuardedBy("this")

    /** Idle references - waiting to be borrowed */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `destroyCount` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/SoftReferenceObjectPool.java`
#### Snippet
```java

    /** Total number of instances that have been destroyed */
    private long destroyCount; // @GuardedBy("this")


```

### FieldAccessedSynchronizedAndUnsynchronized
Field `numActive` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/SoftReferenceObjectPool.java`
#### Snippet
```java

    /** Count of instances that have been checkout out to pool clients */
    private int numActive; // @GuardedBy("this")

    /** Total number of instances that have been destroyed */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `executor` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/EvictionTimer.java`
#### Snippet
```java

    /** Executor instance */
    private static ScheduledThreadPoolExecutor executor; //@GuardedBy("EvictionTimer.class")

    /** Keys are weak references to tasks, values are runners managed by executor. */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `makeObjectCount` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java
    private final AtomicLong createCount = new AtomicLong();

    private long makeObjectCount;

    private final Object makeObjectCountLock = new Object();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `evictor` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java

    final Object evictionLock = new Object();
    private Evictor evictor; // @GuardedBy("evictionLock")
    EvictionIterator evictionIterator; // @GuardedBy("evictionLock")

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `index` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
        private final AtomicLong[] values;
        private final int size;
        private int index;

        /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `evictionIterator` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
    final Object evictionLock = new Object();
    private Evictor evictor; // @GuardedBy("evictionLock")
    EvictionIterator evictionIterator; // @GuardedBy("evictionLock")

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `evictionKeyIterator` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
    private final AtomicInteger numTotal = new AtomicInteger(0);

    private Iterator<K> evictionKeyIterator; // @GuardedBy("evictionLock")


```

### FieldAccessedSynchronizedAndUnsynchronized
Field `evictionKey` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java


    private K evictionKey; // @GuardedBy("evictionLock")

    /**
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
                    return firstNode();
                }
                n = s;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
        try {
            if (a.length < count) {
                a = (T[])java.lang.reflect.Array.newInstance
                    (a.getClass().getComponentType(), count);
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `jmxNamePrefix`
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
                } else {
                    // Must be an invalid name. Use the defaults instead.
                    jmxNamePrefix =
                            BaseObjectPoolConfig.DEFAULT_JMX_NAME_PREFIX;
                    base = jmxNameBase;
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

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-28-01-18-24.898.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/PoolImplUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/PoolImplUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/PoolImplUtils.java`
#### Snippet
```java
        if (type == null || clazz == null) {
            // Error will be logged further up the call stack
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/PoolImplUtils.java`
#### Snippet
```java
        }
        // Error will be logged further up the call stack
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
            while ( (x = unlinkLast()) == null) {
                if (nanos <= 0) {
                    return null;
                }
                nanos = notEmpty.awaitNanos(nanos);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
        lock.lock();
        try {
            return last == null ? null : last.item;
        } finally {
            lock.unlock();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
            while ((x = unlinkFirst()) == null) {
                if (nanos <= 0) {
                    return null;
                }
                nanos = notEmpty.awaitNanos(nanos);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
                final Node<E> s = nextNode(n);
                if (s == null) {
                    return null;
                }
                if (s.item != null) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
        lock.lock();
        try {
            return first == null ? null : first.item;
        } finally {
            lock.unlock();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
        final Node<E> f = first;
        if (f == null) {
            return null;
        }
        final Node<E> n = f.next;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
        final Node<E> l = last;
        if (l == null) {
            return null;
        }
        final Node<E> p = l.prev;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java

        if (!create.booleanValue()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java
            if (getTestOnCreate() && !factory.validateObject(p)) {
                createCount.decrementAndGet();
                return null;
            }
        } catch (final Throwable e) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/AbandonedConfig.java`
#### Snippet
```java
     */
    public static AbandonedConfig copy(final AbandonedConfig abandonedConfig) {
        return abandonedConfig == null ? null : new AbandonedConfig(abandonedConfig);
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
                numTotal.decrementAndGet();
                if (getNumIdle() == 0) {
                    return null;
                }
                clearOldest();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
        if (!create.booleanValue()) {
            numTotal.decrementAndGet();
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
                numTotal.decrementAndGet();
                objectDeque.getCreateCount().decrementAndGet();
                return null;
            }
        } catch (final Exception e) {
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/pool2/impl/PooledSoftReference.java`
#### Snippet
```java
        result.append(getObject().toString());
        result.append(", State: ");
        synchronized (this) {
            result.append(getState().toString());
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/pool2/impl/SoftReferenceObjectPool.java`
#### Snippet
```java
        }
        numActive--;
        notifyAll(); // numActive has changed
    }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/pool2/impl/SoftReferenceObjectPool.java`
#### Snippet
```java
            idleReferences.add(ref);
        }
        notifyAll(); // numActive has changed

        if (shouldDestroy && factory != null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/pool2/impl/SoftReferenceObjectPool.java`
#### Snippet
```java
        if (success) {
            idleReferences.add(ref);
            notifyAll(); // numActive has changed
        }

```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `src/main/java/org/apache/commons/pool2/impl/EvictionTimer.java`
#### Snippet
```java
        @Override
        public void run() {
            synchronized (EvictionTimer.class) {
                for (final Entry<WeakReference<BaseGenericObjectPool<?, ?>.Evictor>, WeakRunner<BaseGenericObjectPool<?, ?>.Evictor>> entry : TASK_MAP
                        .entrySet()) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/pool2/impl/DefaultPooledObject.java`
#### Snippet
```java
        result.append(object.toString());
        result.append(", State: ");
        synchronized (this) {
            result.append(state.toString());
        }
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
                }
            } else if (isPositiverDelay) { // Stop or restart of existing evictor: Restart
                synchronized (EvictionTimer.class) { // Ensure no cancel can happen between cancel / schedule calls
                    EvictionTimer.cancel(evictor, evictorShutdownTimeoutDuration, true);
                    evictor = null;
```

## RuleId[id=WaitNotInLoop]
### WaitNotInLoop
Call to `wait()` is not in loop
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java

    private static void wait(final Object obj, final Duration duration) throws InterruptedException {
        obj.wait(duration.toMillis(), duration.getNano() % 1_000_000);
    }

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
Variable `p` initializer `null` is redundant
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
        }

        PooledObject<T> p = null;
        try {
            p = factory.makeObject(key);
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

