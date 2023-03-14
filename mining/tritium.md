# tritium 
 
# Bad smells
I found 86 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 25 | false |
| BoundedWildcard | 22 | false |
| DeprecatedIsStillUsed | 6 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 4 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 4 | false |
| ConstantValue | 4 | false |
| UnstableApiUsage | 4 | false |
| ClassNameSameAsAncestorName | 3 | false |
| RedundantSuppression | 3 | false |
| UnnecessarySuperQualifier | 2 | false |
| MismatchedJavadocCode | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| StaticPseudoFunctionalStyleMethod | 1 | false |
| RedundantFieldInitialization | 1 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 1 | false |
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

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `LongPredicate` is the same as one of its superclass' names
in `tritium-api/src/main/java/com/palantir/tritium/api/functions/LongPredicate.java`
#### Snippet
```java

@FunctionalInterface
public interface LongPredicate extends java.util.function.LongPredicate {

    /**
```

### ClassNameSameAsAncestorName
Class name `BooleanSupplier` is the same as one of its superclass' names
in `tritium-api/src/main/java/com/palantir/tritium/api/functions/BooleanSupplier.java`
#### Snippet
```java

@FunctionalInterface
public interface BooleanSupplier extends java.util.function.BooleanSupplier {

    /**
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/MetricName.java`
#### Snippet
```java
    }

    final class Builder extends ImmutableMetricName.Builder {}
}

```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `tritium-lib/src/main/java/com/palantir/tritium/io/ForwardingInputStream.java`
#### Snippet
```java

    protected final InputStream input() {
        return super.in;
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `tritium-lib/src/main/java/com/palantir/tritium/io/ForwardingOutputStream.java`
#### Snippet
```java

    protected final OutputStream output() {
        return super.out;
    }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.tritium.tracing` is unnecessary and can be removed
in `tritium-tracing/src/main/java/com/palantir/tritium/tracing/JavaTracingTracer.java`
#### Snippet
```java
package com.palantir.tritium.tracing;

enum JavaTracingTracer implements com.palantir.tritium.tracing.Tracer {
    INSTANCE;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.tritium.api.functions` is unnecessary, and can be replaced with an import
in `tritium-core/src/main/java/com/palantir/tritium/event/AbstractInvocationEventHandler.java`
#### Snippet
```java
    @Deprecated
    @SuppressWarnings("FunctionalInterfaceClash") // back compat
    protected AbstractInvocationEventHandler(com.palantir.tritium.api.functions.BooleanSupplier isEnabledSupplier) {
        this((java.util.function.BooleanSupplier) isEnabledSupplier);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary, and can be replaced with an import
in `tritium-core/src/main/java/com/palantir/tritium/event/AbstractInvocationEventHandler.java`
#### Snippet
```java
    @SuppressWarnings("FunctionalInterfaceClash") // back compat
    protected AbstractInvocationEventHandler(com.palantir.tritium.api.functions.BooleanSupplier isEnabledSupplier) {
        this((java.util.function.BooleanSupplier) isEnabledSupplier);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary, and can be replaced with an import
in `tritium-core/src/main/java/com/palantir/tritium/event/AbstractInvocationEventHandler.java`
#### Snippet
```java
    /** Always enabled instrumentation handler. */
    protected AbstractInvocationEventHandler() {
        this((java.util.function.BooleanSupplier) () -> true);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.tritium.api.functions` is unnecessary, and can be replaced with an import
in `tritium-core/src/main/java/com/palantir/tritium/event/AbstractInvocationEventHandler.java`
#### Snippet
```java
     * @return false if "instrument.fully.qualified.class.Name" is set to "false", otherwise true
     */
    protected static com.palantir.tritium.api.functions.BooleanSupplier getSystemPropertySupplier(
            Class<? extends InvocationEventHandler<InvocationContext>> clazz) {
        checkNotNull(clazz, "clazz");
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary, and can be replaced with an import
in `tritium-core/src/main/java/com/palantir/tritium/event/AbstractInvocationEventHandler.java`
#### Snippet
```java
     */
    @SuppressWarnings("FunctionalInterfaceClash")
    protected AbstractInvocationEventHandler(java.util.function.BooleanSupplier isEnabledSupplier) {
        this.isEnabledSupplier = checkNotNull(isEnabledSupplier, "isEnabledSupplier");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary, and can be replaced with an import
in `tritium-core/src/main/java/com/palantir/tritium/event/AbstractInvocationEventHandler.java`
#### Snippet
```java
    private static final Object[] NO_ARGS = {};

    private final java.util.function.BooleanSupplier isEnabledSupplier;

    /** Always enabled instrumentation handler. */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.tritium.api.functions` is unnecessary, and can be replaced with an import
in `tritium-slf4j/src/main/java/com/palantir/tritium/event/log/LoggingInvocationEventHandler.java`
#### Snippet
```java
    private static final ImmutableList<String> MESSAGE_PATTERNS = generateMessagePatterns(20);

    public static final com.palantir.tritium.api.functions.LongPredicate LOG_ALL_DURATIONS = _input -> true;

    public static final com.palantir.tritium.api.functions.LongPredicate LOG_DURATIONS_GREATER_THAN_1_MICROSECOND =
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary, and can be replaced with an import
in `tritium-slf4j/src/main/java/com/palantir/tritium/event/log/LoggingInvocationEventHandler.java`
#### Snippet
```java
    private final BiConsumer<String, Object[]> logger;
    private final LoggingLevel level;
    private final java.util.function.LongPredicate durationPredicate;

    public LoggingInvocationEventHandler(Logger logger, LoggingLevel level) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary, and can be replaced with an import
in `tritium-slf4j/src/main/java/com/palantir/tritium/event/log/LoggingInvocationEventHandler.java`
#### Snippet
```java
    @SuppressWarnings("FunctionalInterfaceClash") // back compat
    public LoggingInvocationEventHandler(
            Logger logger, LoggingLevel level, java.util.function.LongPredicate durationPredicate) {
        super((java.util.function.BooleanSupplier)
                createEnabledSupplier(checkNotNull(logger, "logger"), checkNotNull(level, "level")));
```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.tritium.api.functions` is unnecessary, and can be replaced with an import
in `tritium-slf4j/src/main/java/com/palantir/tritium/event/log/LoggingInvocationEventHandler.java`
#### Snippet
```java
    @SuppressWarnings({"FunctionalInterfaceClash", "InlineMeSuggester"}) // back compat
    public LoggingInvocationEventHandler(
            Logger logger, LoggingLevel level, com.palantir.tritium.api.functions.LongPredicate durationPredicate) {
        this(logger, level, (java.util.function.LongPredicate) durationPredicate);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary, and can be replaced with an import
in `tritium-slf4j/src/main/java/com/palantir/tritium/event/log/LoggingInvocationEventHandler.java`
#### Snippet
```java
    public LoggingInvocationEventHandler(
            Logger logger, LoggingLevel level, com.palantir.tritium.api.functions.LongPredicate durationPredicate) {
        this(logger, level, (java.util.function.LongPredicate) durationPredicate);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.tritium.api.functions` is unnecessary, and can be replaced with an import
in `tritium-slf4j/src/main/java/com/palantir/tritium/event/log/LoggingInvocationEventHandler.java`
#### Snippet
```java
    public static final com.palantir.tritium.api.functions.LongPredicate LOG_ALL_DURATIONS = _input -> true;

    public static final com.palantir.tritium.api.functions.LongPredicate LOG_DURATIONS_GREATER_THAN_1_MICROSECOND =
            nanos -> TimeUnit.MICROSECONDS.convert(Duration.ofNanos(nanos)) > 1;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary, and can be replaced with an import
in `tritium-slf4j/src/main/java/com/palantir/tritium/event/log/LoggingInvocationEventHandler.java`
#### Snippet
```java

    public LoggingInvocationEventHandler(Logger logger, LoggingLevel level) {
        this(logger, level, (java.util.function.LongPredicate) LOG_ALL_DURATIONS);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.tritium.api.functions` is unnecessary, and can be replaced with an import
in `tritium-slf4j/src/main/java/com/palantir/tritium/event/log/LoggingInvocationEventHandler.java`
#### Snippet
```java
            nanos -> TimeUnit.MILLISECONDS.convert(Duration.ofNanos(nanos)) > 0;

    public static final com.palantir.tritium.api.functions.LongPredicate NEVER_LOG = _input -> false;

    private final BiConsumer<String, Object[]> logger;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.tritium.api.functions` is unnecessary, and can be replaced with an import
in `tritium-slf4j/src/main/java/com/palantir/tritium/event/log/LoggingInvocationEventHandler.java`
#### Snippet
```java
            nanos -> TimeUnit.MICROSECONDS.convert(Duration.ofNanos(nanos)) > 1;

    public static final com.palantir.tritium.api.functions.LongPredicate LOG_DURATIONS_GREATER_THAN_0_MILLIS =
            nanos -> TimeUnit.MILLISECONDS.convert(Duration.ofNanos(nanos)) > 0;

```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.tritium.api.functions` is unnecessary, and can be replaced with an import
in `tritium-core/src/main/java/com/palantir/tritium/event/InstrumentationFilters.java`
#### Snippet
```java
    @Deprecated
    @SuppressWarnings({"FunctionalInterfaceClash", "InlineMeSuggester"}) // back compat
    public static InstrumentationFilter from(com.palantir.tritium.api.functions.BooleanSupplier isEnabledSupplier) {
        return from((java.util.function.BooleanSupplier) isEnabledSupplier);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary, and can be replaced with an import
in `tritium-core/src/main/java/com/palantir/tritium/event/InstrumentationFilters.java`
#### Snippet
```java
    @SuppressWarnings({"FunctionalInterfaceClash", "InlineMeSuggester"}) // back compat
    public static InstrumentationFilter from(com.palantir.tritium.api.functions.BooleanSupplier isEnabledSupplier) {
        return from((java.util.function.BooleanSupplier) isEnabledSupplier);
    }
}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary, and can be replaced with an import
in `tritium-core/src/main/java/com/palantir/tritium/event/InstrumentationFilters.java`
#### Snippet
```java

    @SuppressWarnings("FunctionalInterfaceClash")
    public static InstrumentationFilter from(java.util.function.BooleanSupplier isEnabledSupplier) {
        return (_instance, _method, _args) -> isEnabledSupplier.getAsBoolean();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `tritium-time/src/main/java/com/palantir/tritium/time/UtcTimestamp.java`
#### Snippet
```java
    /**
     * Returns an {@link OffsetDateTime} from the system clock in the {@link ZoneOffset#UTC UTC} time zone.
     * Effectively the same as {@link OffsetDateTime#now(java.time.ZoneId)} with argument {@link ZoneOffset#UTC
     * ZoneOffset.UTC}, but optimized to avoid zone rules lookup given UTC zone offset is zero.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary, and can be replaced with an import
in `tritium-metrics/src/main/java/com/palantir/tritium/event/metrics/MetricsInvocationEventHandler.java`
#### Snippet
```java
    // explicitly qualifying BooleanSupplier types for deconfliction
    @SuppressWarnings({"NoFunctionalReturnType", "UnnecessarilyFullyQualified"})
    static java.util.function.BooleanSupplier getEnabledSupplier(String serviceName) {
        return InstrumentationProperties.getSystemPropertySupplier(serviceName);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.codahale.metrics` is unnecessary and can be removed
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/MetricRegistries.java`
#### Snippet
```java
    /**
     * Returns an instrumented {@link ScheduledExecutorService} that monitors the number of tasks submitted, running,
     * completed and also keeps a {@link com.codahale.metrics.Timer} for the task duration. Similar to
     * {@link com.codahale.metrics.InstrumentedScheduledExecutorService}, but produces tagged metrics to the specified
     * {@link TaggedMetricRegistry}.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.codahale.metrics` is unnecessary and can be removed
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/MetricRegistries.java`
#### Snippet
```java
    /**
     * Returns an instrumented {@link ExecutorService} that monitors the number of tasks submitted, running, completed
     * and also keeps a {@link com.codahale.metrics.Timer} for the task duration. Similar to
     * {@link com.codahale.metrics.InstrumentedExecutorService}, but produces tagged metrics to the specified
     * {@link TaggedMetricRegistry}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `tritium-lib/src/main/java/com/palantir/tritium/proxy/Instrumentation.java`
#### Snippet
```java
         * Bridge for backward compatibility.
         *
         * @deprecated use {@link #withLogging(Logger, LoggingLevel, java.util.function.LongPredicate)}
         */
        @Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.tracing` is unnecessary, and can be replaced with an import
in `tritium-tracing/src/main/java/com/palantir/tritium/tracing/RemotingCompatibleTracingInvocationEventHandler.java`
#### Snippet
```java
                Object wrappedTrace = wrapMethod.invoke(null, (Runnable) () -> {});
                String expectedTracingPackage =
                        com.palantir.tracing.Tracers.class.getPackage().getName();
                String actualTracingPackage =
                        wrappedTrace.getClass().getPackage().getName();
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractTaggedMetricRegistry()` of an abstract class should not be declared 'public'
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/AbstractTaggedMetricRegistry.java`
#### Snippet
```java

    @SuppressWarnings("PublicConstructorForAbstractClass") // public API (e.g. used by Dialogue TaggedMetrics)
    public AbstractTaggedMetricRegistry(Supplier<Reservoir> reservoirSupplier) {
        this.reservoirSupplier = checkNotNull(reservoirSupplier, "reservoirSupplier");
    }
```

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `filer` is accessed in both synchronized and unsynchronized contexts
in `tritium-processor/src/main/java/com/palantir/tritium/processor/TritiumAnnotationProcessor.java`
#### Snippet
```java
    private final Set<Name> invalidElements = new HashSet<>();
    private Messager messager;
    private Filer filer;
    private Elements elements;
    private Types types;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `messager` is accessed in both synchronized and unsynchronized contexts
in `tritium-processor/src/main/java/com/palantir/tritium/processor/TritiumAnnotationProcessor.java`
#### Snippet
```java

    private final Set<Name> invalidElements = new HashSet<>();
    private Messager messager;
    private Filer filer;
    private Elements elements;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `elements` is accessed in both synchronized and unsynchronized contexts
in `tritium-processor/src/main/java/com/palantir/tritium/processor/TritiumAnnotationProcessor.java`
#### Snippet
```java
    private Messager messager;
    private Filer filer;
    private Elements elements;
    private Types types;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `types` is accessed in both synchronized and unsynchronized contexts
in `tritium-processor/src/main/java/com/palantir/tritium/processor/TritiumAnnotationProcessor.java`
#### Snippet
```java
    private Filer filer;
    private Elements elements;
    private Types types;

    @Override
```

## RuleId[id=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `tritium-processor/src/main/java/com/palantir/tritium/processor/TritiumAnnotationProcessor.java`
#### Snippet
```java
                .addAnnotation(Override.class)
                .addModifiers(Modifier.PUBLIC)
                .addTypeVariables(Lists.transform(method.element().getTypeParameters(), TypeVariableName::get))
                .returns(returnType)
                .beginControlFlow("if (this.$N.isEnabled())", HANDLER_NAME)
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tritium-test/src/main/java/com/palantir/tritium/metrics/TestClock.java`
#### Snippet
```java

public final class TestClock extends Clock {
    private long tick = 0;

    @Override
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

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `getSoTimeout()` overrides synchronized method
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslServerSocketFactory.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("UnsynchronizedOverridesSynchronized") // Delegates to a safe implementation
        public int getSoTimeout() throws IOException {
            return delegate.getSoTimeout();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `setReceiveBufferSize()` overrides synchronized method
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslServerSocketFactory.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("UnsynchronizedOverridesSynchronized") // Delegates to a safe implementation
        public void setReceiveBufferSize(int size) throws SocketException {
            delegate.setReceiveBufferSize(size);
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `setSoTimeout()` overrides synchronized method
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslServerSocketFactory.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("UnsynchronizedOverridesSynchronized") // Delegates to a safe implementation
        public void setSoTimeout(int timeout) throws SocketException {
            delegate.setSoTimeout(timeout);
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `getReceiveBufferSize()` overrides synchronized method
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InstrumentedSslServerSocketFactory.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("UnsynchronizedOverridesSynchronized") // Delegates to a safe implementation
        public int getReceiveBufferSize() throws SocketException {
            return delegate.getReceiveBufferSize();
        }
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

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `tritium-core/src/main/java/com/palantir/tritium/event/CompositeInvocationEventHandler.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    private CompositeInvocationEventHandler(List<InvocationEventHandler<InvocationContext>> handlers) {
        this.handlers = checkNotNull(handlers, "handlers").toArray(new InvocationEventHandler[0]);
        for (InvocationEventHandler<InvocationContext> handler : handlers) {
            checkNotNull(handler, "Null handlers are not allowed");
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tritium-lib/src/main/java/com/palantir/tritium/proxy/ByteBuddyInstrumentation.java`
#### Snippet
```java
                            Opcodes.ACC_PRIVATE | Opcodes.ACC_FINAL)
                    .defineField(METHODS_FIELD, Method[].class, Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC)
                    .initializer(new StaticFieldLoadedTypeInitializer(METHODS_FIELD, allMethods.toArray(new Method[0])))
                    .make()
                    .load(classLoader)
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super MemoryUsage`
in `tritium-metrics-jvm/src/main/java/com/palantir/tritium/metrics/jvm/JvmMetrics.java`
#### Snippet
```java
     */
    @Nullable
    private static Long totalHeapPlusNonHeap(MemoryMXBean memoryBean, Function<MemoryUsage, Long> longFunction) {
        Long heap = negativeToNull(longFunction.apply(memoryBean.getHeapMemoryUsage()));
        Long nonHeap = negativeToNull(longFunction.apply(memoryBean.getNonHeapMemoryUsage()));
```

### BoundedWildcard
Can generalize to `? super MetricName`
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/TaggedMetricSet.java`
#### Snippet
```java
    Map<MetricName, Metric> getMetrics();

    default void forEachMetric(BiConsumer<MetricName, Metric> consumer) {
        getMetrics().forEach(consumer);
    }
```

### BoundedWildcard
Can generalize to `? super Metric`
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/TaggedMetricSet.java`
#### Snippet
```java
    Map<MetricName, Metric> getMetrics();

    default void forEachMetric(BiConsumer<MetricName, Metric> consumer) {
        getMetrics().forEach(consumer);
    }
```

### BoundedWildcard
Can generalize to `? extends InvocationEventHandler`
in `tritium-annotations/src/main/java/com/palantir/tritium/annotations/internal/InstrumentationBuilder.java`
#### Snippet
```java

    public InstrumentationBuilder<T, U> withHandlers(
            Iterable<InvocationEventHandler<InvocationContext>> additionalHandlers) {
        checkNotNull(additionalHandlers, "additionalHandlers");
        for (InvocationEventHandler<InvocationContext> handler : additionalHandlers) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsExecutorService.java`
#### Snippet
```java
        private final long created = queuedDuration == null ? 0L : System.nanoTime();

        TaggedMetricsCallable(Callable<T> task) {
            this.task = task;
        }
```

### BoundedWildcard
Can generalize to `? super MetricName`
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/DropwizardTaggedMetricSet.java`
#### Snippet
```java

    @Override
    public void forEachMetric(BiConsumer<MetricName, Metric> consumer) {
        metricSet.getMetrics().forEach((name, metric) -> consumer.accept(RealMetricName.create(name), metric));
    }
```

### BoundedWildcard
Can generalize to `? super Metric`
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/DropwizardTaggedMetricSet.java`
#### Snippet
```java

    @Override
    public void forEachMetric(BiConsumer<MetricName, Metric> consumer) {
        metricSet.getMetrics().forEach((name, metric) -> consumer.accept(RealMetricName.create(name), metric));
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InternalCacheMetrics.java`
#### Snippet
```java
    private InternalCacheMetrics() {}

    public static <K> ImmutableMap<K, Gauge<?>> createMetrics(Stats stats, Function<String, K> metricNamer) {
        ImmutableMap.Builder<K, Gauge<?>> builder = ImmutableMap.builderWithExpectedSize(12);
        stats.forEach((name, gauge) -> builder.put(metricNamer.apply(name), gauge));
```

### BoundedWildcard
Can generalize to `? extends K`
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InternalCacheMetrics.java`
#### Snippet
```java
    private InternalCacheMetrics() {}

    public static <K> ImmutableMap<K, Gauge<?>> createMetrics(Stats stats, Function<String, K> metricNamer) {
        ImmutableMap.Builder<K, Gauge<?>> builder = ImmutableMap.builderWithExpectedSize(12);
        stats.forEach((name, gauge) -> builder.put(metricNamer.apply(name), gauge));
```

### BoundedWildcard
Can generalize to `? super String`
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InternalCacheMetrics.java`
#### Snippet
```java
    public interface Stats {

        default void forEach(BiConsumer<String, Gauge<?>> consumer) {
            consumer.accept("cache.estimated.size", estimatedSize());
            consumer.accept("cache.request.count", requestCount());
```

### BoundedWildcard
Can generalize to `? super Gauge`
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/InternalCacheMetrics.java`
#### Snippet
```java
    public interface Stats {

        default void forEach(BiConsumer<String, Gauge<?>> consumer) {
            consumer.accept("cache.estimated.size", estimatedSize());
            consumer.accept("cache.request.count", requestCount());
```

### BoundedWildcard
Can generalize to `? extends T`
in `tritium-metrics/src/main/java/com/palantir/tritium/metrics/TaggedMetricsScheduledExecutorService.java`
#### Snippet
```java
        private final Callable<T> task;

        TaggedMetricsCallable(Callable<T> task) {
            this.task = task;
        }
```

### BoundedWildcard
Can generalize to `? super Double`
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/LockFreeExponentiallyDecayingReservoir.java`
#### Snippet
```java
        private int count;

        RescalingConsumer(double scalingFactor, ConcurrentSkipListMap<Double, WeightedSample> values) {
            this.scalingFactor = scalingFactor;
            this.values = values;
```

### BoundedWildcard
Can generalize to `? super WeightedSample`
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/LockFreeExponentiallyDecayingReservoir.java`
#### Snippet
```java
        private int count;

        RescalingConsumer(double scalingFactor, ConcurrentSkipListMap<Double, WeightedSample> values) {
            this.scalingFactor = scalingFactor;
            this.values = values;
```

### BoundedWildcard
Can generalize to `? extends InvocationEventHandler`
in `tritium-lib/src/main/java/com/palantir/tritium/proxy/Instrumentation.java`
#### Snippet
```java
        }

        public Builder<T, U> withHandlers(Iterable<InvocationEventHandler<InvocationContext>> additionalHandlers) {
            checkNotNull(additionalHandlers, "additionalHandlers");
            this.handlers.addAll(additionalHandlers);
```

### BoundedWildcard
Can generalize to `? super MetricName`
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/AbstractTaggedMetricRegistry.java`
#### Snippet
```java

    @Override
    public final void forEachMetric(BiConsumer<MetricName, Metric> consumer) {
        registry.forEach(consumer);
        taggedRegistries.forEach((tag, metrics) -> metrics.forEachMetric((metricName, metric) ->
```

### BoundedWildcard
Can generalize to `? super Metric`
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/AbstractTaggedMetricRegistry.java`
#### Snippet
```java

    @Override
    public final void forEachMetric(BiConsumer<MetricName, Metric> consumer) {
        registry.forEach(consumer);
        taggedRegistries.forEach((tag, metrics) -> metrics.forEachMetric((metricName, metric) ->
```

### BoundedWildcard
Can generalize to `? extends T`
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/AbstractTaggedMetricRegistry.java`
#### Snippet
```java

    protected final <T extends Metric> T getOrAdd(
            MetricName metricName, Class<T> metricClass, Supplier<T> metricSupplier) {
        Metric metric = registry.computeIfAbsent(metricName, _name -> metricSupplier.get());
        return checkNotNull(checkMetricType(metricName, metricClass, metric), "metric");
```

### BoundedWildcard
Can generalize to `? extends T`
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/AbstractTaggedMetricRegistry.java`
#### Snippet
```java

    protected final <T extends Metric> T getOrAdd(
            MetricName metricName, Class<T> metricClass, Supplier<T> metricSupplier) {
        Metric metric = registry.computeIfAbsent(metricName, _name -> metricSupplier.get());
        return checkNotNull(checkMetricType(metricName, metricClass, metric), "metric");
```

### BoundedWildcard
Can generalize to `? super String`
in `tritium-processor/src/main/java/com/palantir/tritium/processor/TritiumAnnotationProcessor.java`
#### Snippet
```java
    @SuppressWarnings("VoidMissingNullable") // noisy
    private SimpleElementVisitor8<Void, Void> createVisitor(
            TypeElement typeElement, Map<String, List<MethodElements>> methodsByName, DeclaredType mirror) {
        return new SimpleElementVisitor8<>() {
            @Nullable
```

### BoundedWildcard
Can generalize to `? extends DeclaredType`
in `tritium-processor/src/main/java/com/palantir/tritium/processor/TritiumAnnotationProcessor.java`
#### Snippet
```java
    @SuppressWarnings("checkstyle:CyclomaticComplexity")
    private JavaFile generate(
            TypeElement typeElement, List<DeclaredType> allInterfaces, List<DeclaredType> minimalInterfaces) {
        TypeName annotatedType = TypeName.get(typeElement.asType());
        TypeName delegateType =
```

### BoundedWildcard
Can generalize to `? extends DeclaredType`
in `tritium-processor/src/main/java/com/palantir/tritium/processor/TritiumAnnotationProcessor.java`
#### Snippet
```java
    @SuppressWarnings("checkstyle:CyclomaticComplexity")
    private JavaFile generate(
            TypeElement typeElement, List<DeclaredType> allInterfaces, List<DeclaredType> minimalInterfaces) {
        TypeName annotatedType = TypeName.get(typeElement.asType());
        TypeName delegateType =
```

## RuleId[id=ConstantValue]
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

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/TagMap.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("SuspiciousMethodCalls")
        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
```

### RedundantSuppression
Redundant suppression
in `tritium-registry/src/main/java/com/palantir/tritium/metrics/registry/TaggedMetricRegistry.java`
#### Snippet
```java
    // This differs from MetricRegistry and takes the Gauge directly rather than a Supplier<Gauge>
    @SuppressWarnings({"deprecation", "UnsafeGaugeRegistration"}) // explicitly using as desired
    default void registerWithReplacement(MetricName metricName, Gauge<?> gauge) {
        Gauge<?> existing = gauge(metricName, gauge);
        if (existing == gauge) {
```

### RedundantSuppression
Redundant suppression
in `tritium-tracing/src/main/java/com/palantir/tritium/tracing/TracingInvocationEventHandler.java`
#### Snippet
```java
            return RemotingCompatibleTracingInvocationEventHandler.create(component);
        }
        //noinspection deprecation
        return new TracingInvocationEventHandler(component);
    }
```

## RuleId[id=UnstableApiUsage]
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

