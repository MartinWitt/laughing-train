# tritium 
 
# Bad smells
I found 103 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BlockingMethodInNonBlockingContext | 38 | false |
| NullableProblems | 31 | false |
| AutoCloseableResource | 8 | false |
| DeprecatedIsStillUsed | 7 | false |
| JavadocLinkAsPlainText | 5 | false |
| ConstantValue | 4 | false |
| UnstableApiUsage | 4 | false |
| MismatchedJavadocCode | 2 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| DuplicatedCode | 1 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 1 | false |
| Deprecation | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'maybeCpuSharesAccessor'
in `tritium-metrics-jvm/src/main/java/com/palantir/tritium/metrics/jvm/JvmMetrics.java`
#### Snippet
```java

    @VisibleForTesting
    static void registerCpuShares(TaggedMetricRegistry registry, Optional<CpuSharesAccessor> maybeCpuSharesAccessor) {
        maybeCpuSharesAccessor.ifPresentOrElse(
                cpuSharesAccessor -> ContainerMetrics.of(registry).cpuShares((Gauge<Long>)
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `tritium-slf4j/src/main/java/com/palantir/tritium/event/log/LoggingInvocationEventHandler.java`
#### Snippet
```java
        switch (level) {
            case TRACE:
                return logger::trace;
            case DEBUG:
                return logger::debug;
            case INFO:
                return logger::info;
            case WARN:
                return logger::warn;
            case ERROR:
                return logger::error;
        }
        throw invalidLoggingLevel(level);
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `registry`
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/MetricRegistries.java`
#### Snippet
```java
    private static <T extends Metric> T registerOrReplace(
            MetricRegistry registry, @Safe String name, T metric, boolean replace) {
        synchronized (registry) {
            Map<String, Metric> metrics = registry.getMetrics();
            Metric existingMetric = metrics.get(name);
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'false' but its return type is not boolean
in `tritium-core/src/main/java/com/palantir/tritium/event/AbstractInvocationEventHandler.java`
#### Snippet
```java
     *
     * @param clazz instrumentation handler class
     * @return false if "instrument.fully.qualified.class.Name" is set to "false", otherwise true
     */
    protected static com.palantir.tritium.api.functions.BooleanSupplier getSystemPropertySupplier(
```

### MismatchedJavadocCode
Method is specified to return set but the return type is array
in `tritium-proxy/src/main/java/com/palantir/tritium/proxy/Proxies.java`
#### Snippet
```java
     * @param iface primary interface class
     * @param delegateClass delegate class
     * @return the set of interfaces for the specified classes
     * @throws IllegalArgumentException if the specified interface class is not an interface
     */
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'InputStream' used without 'try'-with-resources statement
in `tritium-lib/src/main/java/com/palantir/tritium/io/ForwardingInputStream.java`
#### Snippet
```java
    public int readNBytes(byte[] bytes, int off, int len) throws IOException {
        before(len);
        int bytesRead = input().readNBytes(bytes, off, len);
        after(bytesRead);
        return bytesRead;
```

### AutoCloseableResource
'InputStream' used without 'try'-with-resources statement
in `tritium-lib/src/main/java/com/palantir/tritium/io/ForwardingInputStream.java`
#### Snippet
```java
        Objects.checkFromIndexSize(off, len, bytes.length);
        before(len);
        int bytesRead = input().read(bytes, off, len);
        after(bytesRead);
        return bytesRead;
```

### AutoCloseableResource
'InputStream' used without 'try'-with-resources statement
in `tritium-lib/src/main/java/com/palantir/tritium/io/ForwardingInputStream.java`
#### Snippet
```java
    public int read(byte[] bytes) throws IOException {
        before(bytes.length);
        int bytesRead = input().read(bytes);
        after(bytesRead);
        return bytesRead;
```

### AutoCloseableResource
'InputStream' used without 'try'-with-resources statement
in `tritium-lib/src/main/java/com/palantir/tritium/io/ForwardingInputStream.java`
#### Snippet
```java
    public int read() throws IOException {
        before(1);
        int bytesRead = input().read();
        after(bytesRead);
        return bytesRead;
```

### AutoCloseableResource
'OutputStream' used without 'try'-with-resources statement
in `tritium-lib/src/main/java/com/palantir/tritium/io/ForwardingOutputStream.java`
#### Snippet
```java
    public void write(byte[] bytes) throws IOException {
        before(bytes.length);
        output().write(bytes);
        after(bytes.length);
    }
```

### AutoCloseableResource
'OutputStream' used without 'try'-with-resources statement
in `tritium-lib/src/main/java/com/palantir/tritium/io/ForwardingOutputStream.java`
#### Snippet
```java
        Objects.checkFromIndexSize(off, len, bytes.length);
        before(len);
        output().write(bytes, off, len);
        after(len);
    }
```

### AutoCloseableResource
'OutputStream' used without 'try'-with-resources statement
in `tritium-lib/src/main/java/com/palantir/tritium/io/ForwardingOutputStream.java`
#### Snippet
```java
    public void write(int value) throws IOException {
        before(1);
        output().write(value);
        after(1);
    }
```

### AutoCloseableResource
'Unloaded' used without 'try'-with-resources statement
in `tritium-lib/src/main/java/com/palantir/tritium/proxy/ByteBuddyInstrumentation.java`
#### Snippet
```java
                    .defineField(METHODS_FIELD, Method[].class, Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC)
                    .initializer(new StaticFieldLoadedTypeInitializer(METHODS_FIELD, allMethods.toArray(new Method[0])))
                    .make()
                    .load(classLoader)
                    .getLoaded();
```

## RuleId[id=Deprecation]
### Deprecation
'registerCache(com.codahale.metrics.MetricRegistry, com.google.common.cache.Cache, java.lang.@com.palantir.logsafe.Safe String)' is deprecated
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InternalCacheMetrics.java`
#### Snippet
```java
 * Not intended for direct external usage, intended solely for sharing between tritium-metrics and tritium-caffeine.
 *
 * <p>See * {@link MetricRegistries#registerCache(MetricRegistry, Cache, String)}, *
 * {@link MetricRegistries#registerCache(TaggedMetricRegistry, Cache, String)} for intended use.
 */
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public void execute(Runnable task) {
        delegate.execute(new TaggedMetricsRunnable(task));
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public <T> Future<T> submit(Callable<T> task) {
        return delegate.submit(new TaggedMetricsCallable<>(task));
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public <T> Future<T> submit(Callable<T> task) {
        return delegate.submit(new TaggedMetricsCallable<>(task));
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable task, long initialDelay, long delay, TimeUnit unit) {
        return delegate.scheduleWithFixedDelay(new TaggedMetricsRunnable(task), initialDelay, delay, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable task, long initialDelay, long delay, TimeUnit unit) {
        return delegate.scheduleWithFixedDelay(new TaggedMetricsRunnable(task), initialDelay, delay, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable task, long initialDelay, long delay, TimeUnit unit) {
        return delegate.scheduleWithFixedDelay(new TaggedMetricsRunnable(task), initialDelay, delay, unit);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public ScheduledFuture<?> schedule(Runnable task, long delay, TimeUnit unit) {
        return delegate.schedule(new TaggedMetricsRunnable(task), delay, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public ScheduledFuture<?> schedule(Runnable task, long delay, TimeUnit unit) {
        return delegate.schedule(new TaggedMetricsRunnable(task), delay, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public ScheduledFuture<?> schedule(Runnable task, long delay, TimeUnit unit) {
        return delegate.schedule(new TaggedMetricsRunnable(task), delay, unit);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public Future<?> submit(Runnable task) {
        return delegate.submit(new TaggedMetricsRunnable(task));
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public Future<?> submit(Runnable task) {
        return delegate.submit(new TaggedMetricsRunnable(task));
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit) {
        return delegate.schedule(new TaggedMetricsCallable<>(callable), delay, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit) {
        return delegate.schedule(new TaggedMetricsCallable<>(callable), delay, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit) {
        return delegate.schedule(new TaggedMetricsCallable<>(callable), delay, unit);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable task, long initialDelay, long period, TimeUnit unit) {
        return delegate.scheduleAtFixedRate(
                new TaggedMetricsScheduledRunnable(task, period, unit), initialDelay, period, unit);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable task, long initialDelay, long period, TimeUnit unit) {
        return delegate.scheduleAtFixedRate(
                new TaggedMetricsScheduledRunnable(task, period, unit), initialDelay, period, unit);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable task, long initialDelay, long period, TimeUnit unit) {
        return delegate.scheduleAtFixedRate(
                new TaggedMetricsScheduledRunnable(task, period, unit), initialDelay, period, unit);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public <T> Future<T> submit(Runnable task, T result) {
        return delegate.submit(new TaggedMetricsRunnable(task), result);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public <T> Future<T> submit(Runnable task, T result) {
        return delegate.submit(new TaggedMetricsRunnable(task), result);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return delegate.awaitTermination(timeout, unit);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public List<Runnable> shutdownNow() {
        return delegate.shutdownNow();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsThreadFactory.java`
#### Snippet
```java

    @Override
    public Thread newThread(Runnable runnable) {
        Thread result = delegate.newThread(
                new InstrumentedTask(Preconditions.checkNotNull(runnable, "Runnable is required"), running));
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsExecutorService.java`
#### Snippet
```java

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return delegate.awaitTermination(timeout, unit);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsExecutorService.java`
#### Snippet
```java

    @Override
    public List<Runnable> shutdownNow() {
        return delegate.shutdownNow();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsExecutorService.java`
#### Snippet
```java

    @Override
    public <T> Future<T> submit(Runnable task, T result) {
        Future<T> future = delegate.submit(new TaggedMetricsRunnable(task), result);
        submitted.mark();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsExecutorService.java`
#### Snippet
```java

    @Override
    public <T> Future<T> submit(Runnable task, T result) {
        Future<T> future = delegate.submit(new TaggedMetricsRunnable(task), result);
        submitted.mark();
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsExecutorService.java`
#### Snippet
```java

    @Override
    public Future<?> submit(Runnable task) {
        Future<?> future = delegate.submit(new TaggedMetricsRunnable(task));
        submitted.mark();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsExecutorService.java`
#### Snippet
```java

    @Override
    public Future<?> submit(Runnable task) {
        Future<?> future = delegate.submit(new TaggedMetricsRunnable(task));
        submitted.mark();
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsExecutorService.java`
#### Snippet
```java

    @Override
    public <T> Future<T> submit(Callable<T> task) {
        Future<T> future = delegate.submit(new TaggedMetricsCallable<>(task));
        submitted.mark();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsExecutorService.java`
#### Snippet
```java

    @Override
    public <T> Future<T> submit(Callable<T> task) {
        Future<T> future = delegate.submit(new TaggedMetricsCallable<>(task));
        submitted.mark();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsExecutorService.java`
#### Snippet
```java

    @Override
    public void execute(Runnable task) {
        delegate.execute(new TaggedMetricsRunnable(task));
        // RejectedExecutionException should prevent 'submitted' from being incremented.
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'registerCache' is still used
in `tritium-caffeine/src/main/java/com/palantir/tritium/metrics/caffeine/CaffeineCacheStats.java`
#### Snippet
```java
     */
    @Deprecated
    public static void registerCache(MetricRegistry registry, Cache<?, ?> cache, String name) {
        checkNotNull(registry, "registry");
        checkNotNull(cache, "cache");
```

### DeprecatedIsStillUsed
Deprecated member 'getSingleton' is still used
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/SharedTaggedMetricRegistries.java`
#### Snippet
```java
     */
    @Deprecated
    public static TaggedMetricRegistry getSingleton() {
        return DefaultTaggedMetricRegistry.getDefault();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'wrap' is still used
in `tritium-lib/src/main/java/com/palantir/tritium/proxy/Instrumentation.java`
#### Snippet
```java
            })
    @Deprecated
    static <T, U extends T> T wrap(
            Class<T> interfaceClass, U delegate, List<InvocationEventHandler<InvocationContext>> handlers) {
        return wrap(interfaceClass, delegate, handlers, InstrumentationFilters.INSTRUMENT_ALL);
```

### DeprecatedIsStillUsed
Deprecated member 'withLogging' is still used
in `tritium-lib/src/main/java/com/palantir/tritium/proxy/Instrumentation.java`
#### Snippet
```java
        @Deprecated
        @SuppressWarnings({"FunctionalInterfaceClash", "InlineMeSuggester"}) // back compat
        public Builder<T, U> withLogging(
                Logger logger,
                LoggingLevel loggingLevel,
```

### DeprecatedIsStillUsed
Deprecated member 'getDefault' is still used
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/DefaultTaggedMetricRegistry.java`
#### Snippet
```java
    @SuppressWarnings("unused") // public API
    @Deprecated
    public static TaggedMetricRegistry getDefault() {
        return DEFAULT;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'LockFreeExponentiallyDecayingReservoir' is still used
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/LockFreeExponentiallyDecayingReservoir.java`
#### Snippet
```java
 */
@Deprecated
public final class LockFreeExponentiallyDecayingReservoir implements Reservoir {

    private static final double SECONDS_PER_NANO = .000_000_001D;
```

### DeprecatedIsStillUsed
Deprecated member 'registerCache' is still used
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/MetricRegistries.java`
#### Snippet
```java
    @Deprecated
    @SuppressWarnings("BanGuavaCaches") // this implementation is explicitly for Guava caches
    public static void registerCache(MetricRegistry registry, Cache<?, ?> cache, @Safe String name) {
        registerCache(registry, cache, name, Clock.defaultClock());
    }
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `wrapMethod != null` is always `true`
in `tritium-tracing/src/main/java/com/palantir/tritium/tracing/RemotingCompatibleTracingInvocationEventHandler.java`
#### Snippet
```java
        if (tracersClass != null) {
            Method wrapMethod = tracersClass.getMethod("wrap", Runnable.class);
            if (wrapMethod != null) {
                Object wrappedTrace = wrapMethod.invoke(null, (Runnable) () -> {});
                String expectedTracingPackage =
```

### ConstantValue
Condition `startSpanMethod != null` is always `true`
in `tritium-tracing/src/main/java/com/palantir/tritium/tracing/RemotingCompatibleTracingInvocationEventHandler.java`
#### Snippet
```java
                Method startSpanMethod = tracerClass.getMethod("startSpan", String.class);
                Method completeSpanMethod = tracerClass.getMethod("fastCompleteSpan");
                if (startSpanMethod != null && completeSpanMethod != null) {
                    return new ReflectiveTracer(startSpanMethod, completeSpanMethod);
                }
```

### ConstantValue
Condition `startSpanMethod != null && completeSpanMethod != null` is always `true`
in `tritium-tracing/src/main/java/com/palantir/tritium/tracing/RemotingCompatibleTracingInvocationEventHandler.java`
#### Snippet
```java
                Method startSpanMethod = tracerClass.getMethod("startSpan", String.class);
                Method completeSpanMethod = tracerClass.getMethod("fastCompleteSpan");
                if (startSpanMethod != null && completeSpanMethod != null) {
                    return new ReflectiveTracer(startSpanMethod, completeSpanMethod);
                }
```

### ConstantValue
Condition `completeSpanMethod != null` is always `true` when reached
in `tritium-tracing/src/main/java/com/palantir/tritium/tracing/RemotingCompatibleTracingInvocationEventHandler.java`
#### Snippet
```java
                Method startSpanMethod = tracerClass.getMethod("startSpan", String.class);
                Method completeSpanMethod = tracerClass.getMethod("fastCompleteSpan");
                if (startSpanMethod != null && completeSpanMethod != null) {
                    return new ReflectiveTracer(startSpanMethod, completeSpanMethod);
                }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `tritium-metrics-jvm/src/main/java/com/palantir/tritium/metrics/jvm/SafepointMetrics.java`
#### Snippet
```java
/**
 * Report duration spent waiting at safepoints. This could indicate badness in terms of STW GCing, or biased locking
 * going badly. See https://stackoverflow.com/questions/29666057/analyzing-gc-logs/29673564#29673564 for details. This
 * essentially provides the information of '+PrintGCApplicationStoppedTime' programmatically.
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `tritium-lib/src/main/java/com/palantir/tritium/Tritium.java`
#### Snippet
```java
     * NB: Previous versions of this method included performance logging. With changes in Java9+ the method
     * of constructing performance logs became a slow operation. So this is no longer included.
     * See: https://github.com/apache/logging-log4j2/pull/475 for details
     *
     * @param serviceInterface The service class to instrument
```

### JavadocLinkAsPlainText
Link specified as plain text
in `tritium-lib/src/main/java/com/palantir/tritium/Tritium.java`
#### Snippet
```java
     * NB: Previous versions of this method included performance logging. With changes in Java9+ the method
     * of constructing performance logs became a slow operation. So this is no longer included.
     * See: https://github.com/apache/logging-log4j2/pull/475 for details
     *
     * @param serviceInterface service interface
```

### JavadocLinkAsPlainText
Link specified as plain text
in `tritium-lib/src/main/java/com/palantir/tritium/proxy/ByteBuddyInstrumentationAdvice.java`
#### Snippet
```java
    /**
     * Work around slow <code>@Advice.Origin Method</code> parameters by providing an array of known methods to each
     * method, with the index of the current method bound individually. https://github.com/raphw/byte-buddy/issues/714
     */
    @Retention(RetentionPolicy.RUNTIME)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/LockFreeExponentiallyDecayingReservoir.java`
#### Snippet
```java
 *
 * See {@link com.codahale.metrics.ExponentiallyDecayingReservoir} Copyright 2010-2012 Coda Hale and Yammer, Inc.
 * Licensed under the Apache License, Version 2.0. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * @deprecated prefer upstream {@link com.codahale.metrics.LockFreeExponentiallyDecayingReservoir}.
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/ImmutableMetricName.java`
#### Snippet
```java
                tagMap = tagMap.isEmpty()
                        ? TagMap.of((Map<String, String>) entries)
                        : TagMap.of(ImmutableMap.<String, String>builderWithExpectedSize(tagMap.size() + entries.size())
                                .putAll(tagMap)
                                .putAll(entries)
```

### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InternalCacheMetrics.java`
#### Snippet
```java

    public static <K> ImmutableMap<K, Gauge<?>> createMetrics(Stats stats, Function<String, K> metricNamer) {
        ImmutableMap.Builder<K, Gauge<?>> builder = ImmutableMap.builderWithExpectedSize(12);
        stats.forEach((name, gauge) -> builder.put(metricNamer.apply(name), gauge));
        return builder.buildOrThrow();
```

### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `tritium-lib/src/main/java/com/palantir/tritium/proxy/ByteBuddyInstrumentation.java`
#### Snippet
```java
                SafeArg.of("additionalInterfaces", additionalInterfaces),
                SafeArg.of("interfaceClass", interfaceClass));
        ImmutableList<Class<?>> interfaces = ImmutableList.<Class<?>>builderWithExpectedSize(
                        additionalInterfaces.size() + 1)
                .add(interfaceClass)
```

### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `tritium-lib/src/main/java/com/palantir/tritium/proxy/ByteBuddyInstrumentation.java`
#### Snippet
```java
        Class<?>[] discoveredInterfaces = Proxies.interfaces(interfaceClass, delegateClass);
        ImmutableList.Builder<Class<?>> additionalInterfaces =
                ImmutableList.builderWithExpectedSize(discoveredInterfaces.length - 1);
        checkState(interfaceClass.equals(discoveredInterfaces[0]), "Expected the provided interface first");
        for (int i = 1; i < discoveredInterfaces.length; i++) {
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java
    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return delegate.awaitTermination(timeout, unit);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslServerSocketFactory.java`
#### Snippet
```java
        @Override
        public boolean getReuseAddress() throws SocketException {
            return delegate.getReuseAddress();
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslServerSocketFactory.java`
#### Snippet
```java
        @Override
        public Socket accept() throws IOException {
            return wrap(delegate.accept());
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslServerSocketFactory.java`
#### Snippet
```java
        @SuppressWarnings("UnsynchronizedOverridesSynchronized") // Delegates to a safe implementation
        public void setReceiveBufferSize(int size) throws SocketException {
            delegate.setReceiveBufferSize(size);
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslServerSocketFactory.java`
#### Snippet
```java
    @Override
    public ServerSocket createServerSocket(int port) throws IOException {
        return wrap(delegate.createServerSocket(port));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslServerSocketFactory.java`
#### Snippet
```java
        @Override
        public void close() throws IOException {
            delegate.close();
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslServerSocketFactory.java`
#### Snippet
```java
    @Override
    public ServerSocket createServerSocket(int port, int backlog, InetAddress inetAddress) throws IOException {
        return wrap(delegate.createServerSocket(port, backlog, inetAddress));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslServerSocketFactory.java`
#### Snippet
```java
        @SuppressWarnings("UnsynchronizedOverridesSynchronized") // Delegates to a safe implementation
        public int getReceiveBufferSize() throws SocketException {
            return delegate.getReceiveBufferSize();
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslServerSocketFactory.java`
#### Snippet
```java
        @Override
        public void setReuseAddress(boolean on) throws SocketException {
            delegate.setReuseAddress(on);
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslServerSocketFactory.java`
#### Snippet
```java
        @SuppressWarnings("UnsynchronizedOverridesSynchronized") // Delegates to a safe implementation
        public void setSoTimeout(int timeout) throws SocketException {
            delegate.setSoTimeout(timeout);
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslServerSocketFactory.java`
#### Snippet
```java
        @Override
        public void bind(SocketAddress endpoint, int backlog) throws IOException {
            delegate.bind(endpoint, backlog);
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslServerSocketFactory.java`
#### Snippet
```java
        @Override
        public void bind(SocketAddress endpoint) throws IOException {
            delegate.bind(endpoint);
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslServerSocketFactory.java`
#### Snippet
```java
    @Override
    public ServerSocket createServerSocket() throws IOException {
        return wrap(delegate.createServerSocket());
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslServerSocketFactory.java`
#### Snippet
```java
        @SuppressWarnings("UnsynchronizedOverridesSynchronized") // Delegates to a safe implementation
        public int getSoTimeout() throws IOException {
            return delegate.getSoTimeout();
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslServerSocketFactory.java`
#### Snippet
```java
    @Override
    public ServerSocket createServerSocket(int port, int backlog) throws IOException {
        return wrap(delegate.createServerSocket(port, backlog));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-lib/src/main/java/com/palantir/tritium/io/ForwardingInputStream.java`
#### Snippet
```java
    public int readNBytes(byte[] bytes, int off, int len) throws IOException {
        before(len);
        int bytesRead = input().readNBytes(bytes, off, len);
        after(bytesRead);
        return bytesRead;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-lib/src/main/java/com/palantir/tritium/io/ForwardingInputStream.java`
#### Snippet
```java
        Objects.checkFromIndexSize(off, len, bytes.length);
        before(len);
        int bytesRead = input().read(bytes, off, len);
        after(bytesRead);
        return bytesRead;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-lib/src/main/java/com/palantir/tritium/io/ForwardingInputStream.java`
#### Snippet
```java
    public int read(byte[] bytes) throws IOException {
        before(bytes.length);
        int bytesRead = input().read(bytes);
        after(bytesRead);
        return bytesRead;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-lib/src/main/java/com/palantir/tritium/io/ForwardingInputStream.java`
#### Snippet
```java
    public int read() throws IOException {
        before(1);
        int bytesRead = input().read();
        after(bytesRead);
        return bytesRead;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslEngine.java`
#### Snippet
```java
    @Override
    public SSLEngineResult wrap(ByteBuffer[] sources, int offset, int length, ByteBuffer dest) throws SSLException {
        return check(engine.wrap(sources, offset, length, dest));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslEngine.java`
#### Snippet
```java
    @Override
    public SSLEngineResult unwrap(ByteBuffer src, ByteBuffer[] dsts, int offset, int length) throws SSLException {
        return check(engine.unwrap(src, dsts, offset, length));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslEngine.java`
#### Snippet
```java
    @Override
    public SSLEngineResult wrap(ByteBuffer[] sources, ByteBuffer byteBuffer) throws SSLException {
        return check(engine.wrap(sources, byteBuffer));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslEngine.java`
#### Snippet
```java
    @Override
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBuffers) throws SSLException {
        return check(engine.unwrap(byteBuffer, byteBuffers));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslEngine.java`
#### Snippet
```java
    @Override
    public void closeInbound() throws SSLException {
        engine.closeInbound();
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslEngine.java`
#### Snippet
```java
    @Override
    public void beginHandshake() throws SSLException {
        engine.beginHandshake();
        handshaking.set(true);
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslEngine.java`
#### Snippet
```java
    @Override
    public SSLEngineResult unwrap(ByteBuffer src, ByteBuffer dst) throws SSLException {
        return check(engine.unwrap(src, dst));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslEngine.java`
#### Snippet
```java
    @Override
    public SSLEngineResult wrap(ByteBuffer src, ByteBuffer dst) throws SSLException {
        return check(engine.wrap(src, dst));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslSocketFactory.java`
#### Snippet
```java
    @Override
    public Socket createSocket(String host, int port) throws IOException {
        return wrap(delegate.createSocket(host, port));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslSocketFactory.java`
#### Snippet
```java
    @Override
    public Socket createSocket(String host, int port, InetAddress inetAddress, int clientPort) throws IOException {
        return wrap(delegate.createSocket(host, port, inetAddress, clientPort));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslSocketFactory.java`
#### Snippet
```java
    @Override
    public Socket createSocket(Socket socket, String host, int port, boolean autoClose) throws IOException {
        return wrap(delegate.createSocket(socket, host, port, autoClose));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslSocketFactory.java`
#### Snippet
```java
    public Socket createSocket(InetAddress inetAddress, int port, InetAddress clientAddress, int clientPort)
            throws IOException {
        return wrap(delegate.createSocket(inetAddress, port, clientAddress, clientPort));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslSocketFactory.java`
#### Snippet
```java
    @Override
    public Socket createSocket(Socket socket, InputStream consumed, boolean autoClose) throws IOException {
        return wrap(delegate.createSocket(socket, consumed, autoClose));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslSocketFactory.java`
#### Snippet
```java
    @Override
    public Socket createSocket(InetAddress inetAddress, int port) throws IOException {
        return wrap(delegate.createSocket(inetAddress, port));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslSocketFactory.java`
#### Snippet
```java
    @Override
    public Socket createSocket() throws IOException {
        return wrap(delegate.createSocket());
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsExecutorService.java`
#### Snippet
```java
    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return delegate.awaitTermination(timeout, unit);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-lib/src/main/java/com/palantir/tritium/io/ForwardingOutputStream.java`
#### Snippet
```java
    public void write(byte[] bytes) throws IOException {
        before(bytes.length);
        output().write(bytes);
        after(bytes.length);
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-lib/src/main/java/com/palantir/tritium/io/ForwardingOutputStream.java`
#### Snippet
```java
        Objects.checkFromIndexSize(off, len, bytes.length);
        before(len);
        output().write(bytes, off, len);
        after(len);
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tritium-lib/src/main/java/com/palantir/tritium/io/ForwardingOutputStream.java`
#### Snippet
```java
    public void write(int value) throws IOException {
        before(1);
        output().write(value);
        after(1);
    }
```

