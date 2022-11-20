# commons-pool 
 
# Bad smells
I found 193 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=DeprecatedIsStillUsed] | 50 | false |
| RuleId[ruleID=StringBufferReplaceableByString] | 18 | false |
| RuleId[ruleID=BoundedWildcard] | 18 | false |
| RuleId[ruleID=PublicFieldAccessedInSynchronizedContext] | 18 | false |
| RuleId[ruleID=ReturnNull] | 17 | false |
| RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized] | 10 | false |
| RuleId[ruleID=SynchronizeOnThis] | 7 | false |
| RuleId[ruleID=UnnecessaryBoxing] | 6 | false |
| RuleId[ruleID=NestedAssignment] | 5 | false |
| RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter] | 5 | false |
| RuleId[ruleID=AssignmentToForLoopParameter] | 4 | false |
| RuleId[ruleID=RedundantSuppression] | 4 | false |
| RuleId[ruleID=UnnecessaryUnboxing] | 4 | false |
| RuleId[ruleID=UnusedAssignment] | 4 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 3 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 3 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 3 | false |
| RuleId[ruleID=CommentedOutCode] | 2 | false |
| RuleId[ruleID=InnerClassMayBeStatic] | 2 | true |
| RuleId[ruleID=SystemOutErr] | 2 | false |
| RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod] | 1 | false |
| RuleId[ruleID=AbstractMethodCallInConstructor] | 1 | false |
| RuleId[ruleID=CatchMayIgnoreException] | 1 | false |
| RuleId[ruleID=NonShortCircuitBoolean] | 1 | false |
| RuleId[ruleID=NestedSynchronizedStatement] | 1 | false |
| RuleId[ruleID=UtilityClassWithPublicConstructor] | 1 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 1 | true |
| RuleId[ruleID=HtmlWrongAttributeValue] | 1 | false |
## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PoolImplUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/pool2/impl/PoolImplUtils.java`
#### Snippet
```java
 * @since 2.0
 */
class PoolImplUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
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

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PoolUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
 * @since 2.0
 */
public final class PoolUtils {

    /**
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'getLastUsed' is still used
in `src/main/java/org/apache/commons/pool2/TrackedUse.java`
#### Snippet
```java
     */
    @Deprecated
    long getLastUsed();

    /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'getIdleTimeMillis' is still used
in `src/main/java/org/apache/commons/pool2/PooledObject.java`
#### Snippet
```java
     */
    @Deprecated
    long getIdleTimeMillis();

    /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'getLastBorrowTime' is still used
in `src/main/java/org/apache/commons/pool2/PooledObject.java`
#### Snippet
```java
     */
    @Deprecated
    long getLastBorrowTime();

    /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'getLastReturnTime' is still used
in `src/main/java/org/apache/commons/pool2/PooledObject.java`
#### Snippet
```java
     */
    @Deprecated
    long getLastReturnTime();

    /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'getLastUsedTime' is still used
in `src/main/java/org/apache/commons/pool2/PooledObject.java`
#### Snippet
```java
     */
    @Deprecated
    long getLastUsedTime();

    /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'getActiveTimeMillis' is still used
in `src/main/java/org/apache/commons/pool2/PooledObject.java`
#### Snippet
```java
     */
    @Deprecated
    long getActiveTimeMillis();

    /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'getCreateTime' is still used
in `src/main/java/org/apache/commons/pool2/PooledObject.java`
#### Snippet
```java
     */
    @Deprecated
    long getCreateTime();

    /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEFAULT_MAX_WAIT_MILLIS' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public static final long DEFAULT_MAX_WAIT_MILLIS = -1L;

    /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEFAULT_EVICTOR_SHUTDOWN_TIMEOUT_MILLIS' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public static final long DEFAULT_EVICTOR_SHUTDOWN_TIMEOUT_MILLIS = 10L * 1000L;

    /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEFAULT_MIN_EVICTABLE_IDLE_TIME_MILLIS' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public static final long DEFAULT_MIN_EVICTABLE_IDLE_TIME_MILLIS = 1000L * 60L * 30L;

    /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEFAULT_SOFT_MIN_EVICTABLE_IDLE_TIME_MILLIS' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public static final long DEFAULT_SOFT_MIN_EVICTABLE_IDLE_TIME_MILLIS = -1;

    /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEFAULT_SOFT_MIN_EVICTABLE_IDLE_TIME' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public static final Duration DEFAULT_SOFT_MIN_EVICTABLE_IDLE_TIME =
            Duration.ofMillis(DEFAULT_SOFT_MIN_EVICTABLE_IDLE_TIME_MILLIS);

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEFAULT_MIN_EVICTABLE_IDLE_TIME' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public static final Duration DEFAULT_MIN_EVICTABLE_IDLE_TIME =
            Duration.ofMillis(DEFAULT_MIN_EVICTABLE_IDLE_TIME_MILLIS);

```

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEFAULT_TIME_BETWEEN_EVICTION_RUNS_MILLIS' is still used
in `src/main/java/org/apache/commons/pool2/impl/BaseObjectPoolConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public static final long DEFAULT_TIME_BETWEEN_EVICTION_RUNS_MILLIS = -1L;

    /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
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

## RuleId[ruleID=CommentedOutCode]
### RuleId[ruleID=CommentedOutCode]
Commented out code (32 lines)
in `src/main/java/org/apache/commons/pool2/impl/LinkedBlockingDeque.java`
#### Snippet
```java
     */

//     /**
//      * Adds all of the elements in the specified collection to this
//      * queue.  Attempts to addAll of a queue to itself result in
```

### RuleId[ruleID=CommentedOutCode]
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

## RuleId[ruleID=AbstractMethodCallInConstructor]
### RuleId[ruleID=AbstractMethodCallInConstructor]
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

## RuleId[ruleID=CatchMayIgnoreException]
### RuleId[ruleID=CatchMayIgnoreException]
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

## RuleId[ruleID=StringBufferReplaceableByString]
### RuleId[ruleID=StringBufferReplaceableByString]
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

### RuleId[ruleID=StringBufferReplaceableByString]
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

### RuleId[ruleID=StringBufferReplaceableByString]
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

### RuleId[ruleID=StringBufferReplaceableByString]
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

### RuleId[ruleID=StringBufferReplaceableByString]
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

### RuleId[ruleID=StringBufferReplaceableByString]
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

### RuleId[ruleID=StringBufferReplaceableByString]
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

### RuleId[ruleID=StringBufferReplaceableByString]
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

### RuleId[ruleID=StringBufferReplaceableByString]
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

### RuleId[ruleID=StringBufferReplaceableByString]
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

### RuleId[ruleID=StringBufferReplaceableByString]
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

### RuleId[ruleID=StringBufferReplaceableByString]
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

### RuleId[ruleID=StringBufferReplaceableByString]
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

### RuleId[ruleID=StringBufferReplaceableByString]
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

### RuleId[ruleID=StringBufferReplaceableByString]
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

### RuleId[ruleID=StringBufferReplaceableByString]
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

### RuleId[ruleID=StringBufferReplaceableByString]
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

### RuleId[ruleID=StringBufferReplaceableByString]
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

## RuleId[ruleID=NonShortCircuitBoolean]
### RuleId[ruleID=NonShortCircuitBoolean]
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

## RuleId[ruleID=AssignmentToForLoopParameter]
### RuleId[ruleID=AssignmentToForLoopParameter]
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

### RuleId[ruleID=AssignmentToForLoopParameter]
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

### RuleId[ruleID=AssignmentToForLoopParameter]
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

### RuleId[ruleID=AssignmentToForLoopParameter]
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

## RuleId[ruleID=InnerClassMayBeStatic]
### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `StatsStore` may be 'static'
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
     * statistics on the cached values.
     */
    private class StatsStore {

        private static final int NULL = -1;
```

### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `ObjectDeque` may be 'static'
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
     * @param <S> type of objects in the pool
     */
    private class ObjectDeque<S> {

        private final LinkedBlockingDeque<PooledObject<S>> idleObjects;
```

## RuleId[ruleID=NestedSynchronizedStatement]
### RuleId[ruleID=NestedSynchronizedStatement]
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

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

### RuleId[ruleID=BoundedWildcard]
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

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java

                for (int i = 0, m = getNumTests(); i < m; i++) {
                    if (evictionIterator == null || !evictionIterator.hasNext()) {
                        evictionIterator = new EvictionIterator(idleObjects);
                    }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java

                for (int i = 0, m = getNumTests(); i < m; i++) {
                    if (evictionIterator == null || !evictionIterator.hasNext()) {
                        evictionIterator = new EvictionIterator(idleObjects);
                    }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
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

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
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

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java

                    try {
                        underTest = evictionIterator.next();
                    } catch (final NoSuchElementException nsee) {
                        // Object was borrowed in another thread
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
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

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `closed` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java
            stopEvictor();

            closed = true;
            // This clear removes any idle objects
            clear();
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
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

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `closed` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
            stopEvictor();

            closed = true;
            // This clear removes any idle objects
            clear();
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java

                for (int i = 0, m = getNumTests(); i < m; i++) {
                    if (evictionIterator == null || !evictionIterator.hasNext()) {
                        if (evictionKeyIterator == null ||
                                !evictionKeyIterator.hasNext()) {
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java

                for (int i = 0, m = getNumTests(); i < m; i++) {
                    if (evictionIterator == null || !evictionIterator.hasNext()) {
                        if (evictionKeyIterator == null ||
                                !evictionKeyIterator.hasNext()) {
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `evictionIterator` accessed in synchronized context
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java

                            final Deque<PooledObject<T>> idleObjects = objectDeque.getIdleObjects();
                            evictionIterator = new EvictionIterator(idleObjects);
                            if (evictionIterator.hasNext()) {
                                break;
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
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

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
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

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
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

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
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

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
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

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
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

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
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

### RuleId[ruleID=RedundantSuppression]
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

### RuleId[ruleID=RedundantSuppression]
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

### RuleId[ruleID=RedundantSuppression]
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

## RuleId[ruleID=UtilityClassWithPublicConstructor]
### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `PoolUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/pool2/PoolUtils.java`
#### Snippet
```java
 * @since 2.0
 */
public final class PoolUtils {

    /**
```

## RuleId[ruleID=UnnecessaryBoxing]
### RuleId[ruleID=UnnecessaryBoxing]
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

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/pool2/impl/DefaultPooledObjectInfo.java`
#### Snippet
```java

    private String getTimeMillisFormatted(final long millis) {
        return new SimpleDateFormat(PATTERN).format(Long.valueOf(millis));
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
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

### RuleId[ruleID=UnnecessaryBoxing]
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

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
    }

    private static final Integer ZERO = Integer.valueOf(0);

    // JMX specific attributes
```

### RuleId[ruleID=UnnecessaryBoxing]
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

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/pool2/impl/AbandonedConfig.java`
#### Snippet
```java
     * Use of default system encoding is deliberate.
     */
    private PrintWriter logWriter = new PrintWriter(new OutputStreamWriter(System.out, Charset.defaultCharset()));

    /**
```

### RuleId[ruleID=SystemOutErr]
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

## RuleId[ruleID=UnnecessaryUnboxing]
### RuleId[ruleID=UnnecessaryUnboxing]
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

### RuleId[ruleID=UnnecessaryUnboxing]
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

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java
        }

        if (!create.booleanValue()) {
            return null;
        }
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
        }

        if (!create.booleanValue()) {
            numTotal.decrementAndGet();
            return null;
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.ref` is unnecessary and can be removed
in `src/main/java/org/apache/commons/pool2/impl/SoftReferenceObjectPool.java`
#### Snippet
```java

/**
 * A {@link java.lang.ref.SoftReference SoftReference} based {@link ObjectPool}.
 * <p>
 * This class is intended to be thread-safe.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
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

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
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

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
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

### RuleId[ruleID=NestedAssignment]
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

### RuleId[ruleID=NestedAssignment]
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

### RuleId[ruleID=NestedAssignment]
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

### RuleId[ruleID=NestedAssignment]
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

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
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

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `executor` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/EvictionTimer.java`
#### Snippet
```java

    /** Executor instance */
    private static ScheduledThreadPoolExecutor executor; //@GuardedBy("EvictionTimer.class")

    /** Keys are weak references to tasks, values are runners managed by executor. */
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `destroyCount` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/SoftReferenceObjectPool.java`
#### Snippet
```java

    /** Total number of instances that have been destroyed */
    private long destroyCount; // @GuardedBy("this")


```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `numActive` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/SoftReferenceObjectPool.java`
#### Snippet
```java

    /** Count of instances that have been checkout out to pool clients */
    private int numActive; // @GuardedBy("this")

    /** Total number of instances that have been destroyed */
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `createCount` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/SoftReferenceObjectPool.java`
#### Snippet
```java

    /** Total number of instances that have been created */
    private long createCount; // @GuardedBy("this")

    /** Idle references - waiting to be borrowed */
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `makeObjectCount` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java
    private final AtomicLong createCount = new AtomicLong();

    private long makeObjectCount;

    private final Object makeObjectCountLock = new Object();
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `evictionIterator` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
    final Object evictionLock = new Object();
    private Evictor evictor; // @GuardedBy("evictionLock")
    EvictionIterator evictionIterator; // @GuardedBy("evictionLock")

    /**
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `index` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java
        private final AtomicLong[] values;
        private final int size;
        private int index;

        /**
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `evictor` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/BaseGenericObjectPool.java`
#### Snippet
```java

    final Object evictionLock = new Object();
    private Evictor evictor; // @GuardedBy("evictionLock")
    EvictionIterator evictionIterator; // @GuardedBy("evictionLock")

```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `evictionKey` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java


    private K evictionKey; // @GuardedBy("evictionLock")

    /**
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `evictionKeyIterator` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
    private final AtomicInteger numTotal = new AtomicInteger(0);

    private Iterator<K> evictionKeyIterator; // @GuardedBy("evictionLock")


```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
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

### RuleId[ruleID=AssignmentToMethodParameter]
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

## RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
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

### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
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

### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
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

### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
Synchronization on method parameter `toDestroy`
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
        try {
            boolean isIdle;
            synchronized(toDestroy) {
                // Check idle state directly
                isIdle = toDestroy.getState().equals(PooledObjectState.IDLE);
```

### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
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

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/PoolImplUtils.java`
#### Snippet
```java
        if (type == null || clazz == null) {
            // Error will be logged further up the call stack
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/PoolImplUtils.java`
#### Snippet
```java
        }
        // Error will be logged further up the call stack
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/PoolImplUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/PoolImplUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java

        if (!create.booleanValue()) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/AbandonedConfig.java`
#### Snippet
```java
     */
    public static AbandonedConfig copy(final AbandonedConfig abandonedConfig) {
        return abandonedConfig == null ? null : new AbandonedConfig(abandonedConfig);
    }

```

### RuleId[ruleID=ReturnNull]
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

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
        if (!create.booleanValue()) {
            numTotal.decrementAndGet();
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
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

## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-20-03-32-03.513.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=SynchronizeOnThis]
### RuleId[ruleID=SynchronizeOnThis]
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

### RuleId[ruleID=SynchronizeOnThis]
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

### RuleId[ruleID=SynchronizeOnThis]
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

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/pool2/impl/SoftReferenceObjectPool.java`
#### Snippet
```java
        if (success) {
            idleReferences.add(ref);
            notifyAll(); // numActive has changed
        }

```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/pool2/impl/SoftReferenceObjectPool.java`
#### Snippet
```java
            idleReferences.add(ref);
        }
        notifyAll(); // numActive has changed

        if (shouldDestroy && factory != null) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/pool2/impl/SoftReferenceObjectPool.java`
#### Snippet
```java
        }
        numActive--;
        notifyAll(); // numActive has changed
    }

```

### RuleId[ruleID=SynchronizeOnThis]
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

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
Variable `underTest` initializer `null` is redundant
in `src/main/java/org/apache/commons/pool2/impl/GenericObjectPool.java`
#### Snippet
```java
        if (!idleObjects.isEmpty()) {

            PooledObject<T> underTest = null;
            final EvictionPolicy<T> evictionPolicy = getEvictionPolicy();

```

### RuleId[ruleID=UnusedAssignment]
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

### RuleId[ruleID=UnusedAssignment]
Variable `underTest` initializer `null` is redundant
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
        if (getNumIdle() > 0) {

            PooledObject<T> underTest = null;
            final EvictionPolicy<T> evictionPolicy = getEvictionPolicy();

```

### RuleId[ruleID=UnusedAssignment]
Variable `p` initializer `null` is redundant
in `src/main/java/org/apache/commons/pool2/impl/GenericKeyedObjectPool.java`
#### Snippet
```java
        }

        PooledObject<T> p = null;
        try {
            p = factory.makeObject(key);
```

