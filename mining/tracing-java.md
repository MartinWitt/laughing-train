# tracing-java 
 
# Bad smells
I found 95 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalUsedAsFieldOrParameterType | 29 | false |
| UnstableApiUsage | 17 | false |
| BoundedWildcard | 16 | false |
| DeprecatedIsStillUsed | 7 | false |
| CommentedOutCode | 3 | false |
| AbstractClassNeverImplemented | 3 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| NonShortCircuitBoolean | 2 | false |
| NullableProblems | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| OptionalIsPresent | 1 | false |
| RedundantMethodOverride | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| ReplaceNullCheck | 1 | false |
| CodeBlock2Expr | 1 | true |
| EmptyMethod | 1 | false |
| PointlessBitwiseExpression | 1 | false |
| RedundantStringFormatCall | 1 | false |
| ConstantValue | 1 | false |
| RedundantSuppression | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
| UnnecessaryBoxing | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'requestId'
in `tracing/src/main/java/com/palantir/tracing/TraceState.java`
#### Snippet
```java
            AtomicReferenceFieldUpdater.newUpdater(TraceState.class, TraceLocalMap.class, "traceLocals");

    static TraceState of(String traceId, Optional<String> requestId, Optional<String> forUserAgent) {
        checkArgument(!Strings.isNullOrEmpty(traceId), "traceId must be non-empty");
        checkNotNull(requestId, "requestId should be not-null");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'forUserAgent'
in `tracing/src/main/java/com/palantir/tracing/TraceState.java`
#### Snippet
```java
            AtomicReferenceFieldUpdater.newUpdater(TraceState.class, TraceLocalMap.class, "traceLocals");

    static TraceState of(String traceId, Optional<String> requestId, Optional<String> forUserAgent) {
        checkArgument(!Strings.isNullOrEmpty(traceId), "traceId must be non-empty");
        checkNotNull(requestId, "requestId should be not-null");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'requestId'
in `tracing/src/main/java/com/palantir/tracing/Trace.java`
#### Snippet
```java

    @Deprecated
    static Trace of(boolean isObservable, String traceId, Optional<String> requestId) {
        return of(isObservable, TraceState.of(traceId, requestId, Optional.empty()));
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'forUserAgent'
in `tracing-undertow/src/main/java/com/palantir/tracing/undertow/UndertowTracing.java`
#### Snippet
```java
            boolean newTrace,
            String traceId,
            Optional<String> forUserAgent,
            HeaderMap requestHeaders) {
        return DetachedSpan.start(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parentSpanId'
in `tracing-api/src/main/java/com/palantir/tracing/api/OpenSpan.java`
#### Snippet
```java
            String spanId,
            SpanType type,
            Optional<String> parentSpanId,
            Optional<String> _originatingSpanId) {
        return ImmutableOpenSpan.of(operation, getNowInMicroSeconds(), System.nanoTime(), parentSpanId, spanId, type);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter '_originatingSpanId'
in `tracing-api/src/main/java/com/palantir/tracing/api/OpenSpan.java`
#### Snippet
```java
            SpanType type,
            Optional<String> parentSpanId,
            Optional<String> _originatingSpanId) {
        return ImmutableOpenSpan.of(operation, getNowInMicroSeconds(), System.nanoTime(), parentSpanId, spanId, type);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parentSpanId'
in `tracing-api/src/main/java/com/palantir/tracing/api/OpenSpan.java`
#### Snippet
```java

    /** Use this factory method to avoid {@link Builder} allocations in hot paths. */
    public static OpenSpan of(String operation, String spanId, SpanType type, Optional<String> parentSpanId) {
        return ImmutableOpenSpan.of(operation, getNowInMicroSeconds(), System.nanoTime(), parentSpanId, spanId, type);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'originalTrace'
in `tracing/src/main/java/com/palantir/tracing/DeferredTracer.java`
#### Snippet
```java
        private final Optional<Trace> originalTrace;

        TaggedCloseableTrace(Optional<Trace> originalTrace, Map<String, String> metadata) {
            this.metadata = metadata;
            this.originalTrace = originalTrace;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'originalTrace'
in `tracing/src/main/java/com/palantir/tracing/DeferredTracer.java`
#### Snippet
```java
    private static final class TaggedCloseableTrace implements CloseableTrace {
        private final Map<String, String> metadata;
        private final Optional<Trace> originalTrace;

        TaggedCloseableTrace(Optional<Trace> originalTrace, Map<String, String> metadata) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'operation'
in `tracing/src/main/java/com/palantir/tracing/DeferredTracer.java`
#### Snippet
```java
     */
    @Deprecated
    public DeferredTracer(@Safe Optional<String> operation) {
        this(operation.orElse(DEFAULT_OPERATION));
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'forUserAgent'
in `tracing/src/main/java/com/palantir/tracing/DetachedSpan.java`
#### Snippet
```java
            Observability observability,
            String traceId,
            Optional<String> forUserAgent,
            Optional<String> parentSpanId,
            @Safe String operation,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parentSpanId'
in `tracing/src/main/java/com/palantir/tracing/DetachedSpan.java`
#### Snippet
```java
            String traceId,
            Optional<String> forUserAgent,
            Optional<String> parentSpanId,
            @Safe String operation,
            SpanType type) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parentSpanId'
in `tracing/src/main/java/com/palantir/tracing/DetachedSpan.java`
#### Snippet
```java
            Observability observability,
            String traceId,
            Optional<String> parentSpanId,
            @Safe String operation,
            SpanType type) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'trace'
in `tracing/src/main/java/com/palantir/tracing/Tracers.java`
#### Snippet
```java
     * {@link #wrapWithNewTrace} calls.
     */
    private static void restoreTrace(Optional<Trace> trace) {
        if (trace.isPresent()) {
            Tracer.setTrace(trace.get());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'requestId'
in `tracing/src/main/java/com/palantir/tracing/Tracer.java`
#### Snippet
```java
            Observability observability,
            String traceId,
            Optional<String> requestId,
            Optional<String> forUserAgent,
            Optional<String> parentSpanId,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'forUserAgent'
in `tracing/src/main/java/com/palantir/tracing/Tracer.java`
#### Snippet
```java
            String traceId,
            Optional<String> requestId,
            Optional<String> forUserAgent,
            Optional<String> parentSpanId,
            @Safe String operation,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parentSpanId'
in `tracing/src/main/java/com/palantir/tracing/Tracer.java`
#### Snippet
```java
            Optional<String> requestId,
            Optional<String> forUserAgent,
            Optional<String> parentSpanId,
            @Safe String operation,
            SpanType type) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'requestId'
in `tracing/src/main/java/com/palantir/tracing/Tracer.java`
#### Snippet
```java
     * Creates a new trace, but does not set it as the current trace.
     */
    private static Trace createTrace(Observability observability, String traceId, Optional<String> requestId) {
        return createTrace(observability, traceId, requestId, Optional.empty());
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'forUserAgent'
in `tracing/src/main/java/com/palantir/tracing/Tracer.java`
#### Snippet
```java
            Observability observability,
            String traceId,
            Optional<String> forUserAgent,
            @Safe String operation,
            String parentSpanId,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parentSpanId'
in `tracing/src/main/java/com/palantir/tracing/Tracer.java`
#### Snippet
```java
        private final Optional<String> parentSpanId;

        UnsampledDetachedSpan(TraceState traceState, Optional<String> parentSpanId) {
            this.traceState = traceState;
            this.parentSpanId = parentSpanId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'requestId'
in `tracing/src/main/java/com/palantir/tracing/Tracer.java`
#### Snippet
```java
     */
    private static Trace createTrace(
            Observability observability, String traceId, Optional<String> requestId, Optional<String> forUserAgent) {
        checkArgument(!Strings.isNullOrEmpty(traceId), "traceId must be non-empty");
        boolean observable = shouldObserve(observability);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'forUserAgent'
in `tracing/src/main/java/com/palantir/tracing/Tracer.java`
#### Snippet
```java
     */
    private static Trace createTrace(
            Observability observability, String traceId, Optional<String> requestId, Optional<String> forUserAgent) {
        checkArgument(!Strings.isNullOrEmpty(traceId), "traceId must be non-empty");
        boolean observable = shouldObserve(observability);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'isObservable'
in `tracing/src/main/java/com/palantir/tracing/Tracer.java`
#### Snippet
```java
     */
    @Deprecated
    public static void initTrace(Optional<Boolean> isObservable, String traceId) {
        Observability observability = isObservable
                .map(observable -> observable ? Observability.SAMPLE : Observability.DO_NOT_SAMPLE)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'forUserAgent'
in `tracing/src/main/java/com/palantir/tracing/Tracer.java`
#### Snippet
```java
            Observability observability,
            String traceId,
            Optional<String> forUserAgent,
            @Safe String operation,
            SpanType type) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'openSpan'
in `tracing/src/main/java/com/palantir/tracing/Tracer.java`
#### Snippet
```java

    private static <T> void completeSpanAndNotifyObservers(
            Optional<OpenSpan> openSpan, TagTranslator<? super T> tag, T state, String traceId) {
        //noinspection OptionalIsPresent - Avoid lambda allocation in hot paths
        if (openSpan.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'parentSpanId'
in `tracing/src/main/java/com/palantir/tracing/Tracer.java`
#### Snippet
```java

        private final TraceState traceState;
        private final Optional<String> parentSpanId;

        UnsampledDetachedSpan(TraceState traceState, Optional<String> parentSpanId) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parentSpanId'
in `tracing/src/main/java/com/palantir/tracing/Tracer.java`
#### Snippet
```java
        @SuppressWarnings("ImmutablesBuilderMissingInitialization")
        // OpenSpan#builder sets these
        SampledDetachedSpan(String operation, SpanType type, TraceState traceState, Optional<String> parentSpanId) {
            this.traceState = traceState;
            this.openSpan = OpenSpan.of(operation, Tracers.randomId(), type, parentSpanId);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'forUserAgent'
in `tracing/src/main/java/com/palantir/tracing/Tracer.java`
#### Snippet
```java
            Observability observability,
            String traceId,
            Optional<String> forUserAgent,
            Optional<String> parentSpanId,
            @Safe String operation,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parentSpanId'
in `tracing/src/main/java/com/palantir/tracing/Tracer.java`
#### Snippet
```java
            String traceId,
            Optional<String> forUserAgent,
            Optional<String> parentSpanId,
            @Safe String operation,
            SpanType type) {
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `tracing/src/main/java/com/palantir/tracing/Tracers.java`
#### Snippet
```java
                TraceHttpHeaders.IS_SAMPLED, Tracer.isTraceObservable() ? "1" : "0", state);
        Optional<String> forUserAgent = Tracer.getForUserAgent();
        if (forUserAgent.isPresent()) {
            tracingHeadersEnrichingFunction.addHeader(TraceHttpHeaders.FOR_USER_AGENT, forUserAgent.get(), state);
        }
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `equals()` only delegates to its super method
in `tracing/src/main/java/com/palantir/tracing/TraceLocal.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj) {
        // identity semantics
        return super.equals(obj);
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tracing-test-utils/src/main/java/com/palantir/tracing/TestTracingExtension.java`
#### Snippet
```java
        return segments.stream()
                .filter(s -> !s.equals("JUnit Jupiter"))
                .map(s -> s.replaceAll("\\(.*\\)$", ""))
                .collect(Collectors.joining("/"));
    }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.tracing` is unnecessary and can be removed
in `tracing/src/main/java/com/palantir/tracing/TraceMetadata.java`
#### Snippet
```java
    /**
     * Returns the unique request identifier for this thread's trace.
     * Corresponds to {@link com.palantir.tracing.Tracers#REQUEST_ID_KEY}.
     */
    Optional<String> getRequestId();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.tracing.api` is unnecessary and can be removed
in `tracing-test-utils/src/main/java/com/palantir/tracing/api/SerializableSpan.java`
#### Snippet
```java
import org.immutables.value.Value;

/** Copy of {@link com.palantir.tracing.api.Span}, just with jackson annotations. */
@Value.Immutable
@JsonDeserialize(as = ImmutableSerializableSpan.class)
```

## RuleId[id=ReplaceNullCheck]
### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `tracing-test-utils/src/main/java/com/palantir/tracing/TestTracingExtension.java`
#### Snippet
```java
    private static Path getOutputPath(String name) {
        String circleArtifactsDir = System.getenv("CIRCLE_ARTIFACTS");
        if (circleArtifactsDir == null) {
            return Paths.get("build/reports/tracing").resolve(name);
        }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `tracing-api/src/main/java/com/palantir/tracing/api/TraceTags.java`
#### Snippet
```java
    // ip addresses may not always be safe, so these tags are currently
    // excluded out of caution.
    // /** The IP address of the client that initiated the TCP connection. */
    // public static final String NETWORK_CLIENT_IP = "network.client.ip";
    // /** The IP address the client connected to. */
```

### CommentedOutCode
Commented out code (2 lines)
in `tracing-api/src/main/java/com/palantir/tracing/api/TraceTags.java`
#### Snippet
```java

    // 'http.url' is currently excluded to prevent leaking sensitive data
    // /** The URL of the HTTP request. */
    // public static final String HTTP_URL = "http.url";
    /** The HTTP response status code. */
```

### CommentedOutCode
Commented out code (2 lines)
in `tracing-api/src/main/java/com/palantir/tracing/api/TraceTags.java`
#### Snippet
```java

    // 'http.url_details.host' may contain unsafe data and is currently excluded out of caution.
    // /** The HTTP host part of the URL. */
    // public static final String HTTP_URL_HOST = "http.url_details.host";
    /** The HTTP port part of the URL. */
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'RandomSampler' is still used
in `tracing/src/main/java/com/palantir/tracing/RandomSampler.java`
#### Snippet
```java
     */
    @Deprecated
    public RandomSampler(float rate) {
        checkArgument(rate >= 0 && rate <= 1, "Rate should be between 0 and 1", SafeArg.of("rate", rate));
        this.rate = rate;
```

### DeprecatedIsStillUsed
Deprecated member 'OkhttpTraceInterceptor' is still used
in `tracing-okhttp3/src/main/java/com/palantir/tracing/okhttp3/OkhttpTraceInterceptor.java`
#### Snippet
```java
 */
@Deprecated
public enum OkhttpTraceInterceptor implements Interceptor {
    INSTANCE;

```

### DeprecatedIsStillUsed
Deprecated member 'wrapWithNewTrace' is still used
in `tracing/src/main/java/com/palantir/tracing/Tracers.java`
#### Snippet
```java
     */
    @Deprecated
    public static Runnable wrapWithNewTrace(Runnable delegate) {
        return wrapWithNewTrace(DEFAULT_ROOT_SPAN_OPERATION, delegate);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'wrapWithAlternateTraceId' is still used
in `tracing/src/main/java/com/palantir/tracing/Tracers.java`
#### Snippet
```java
     */
    @Deprecated
    public static Runnable wrapWithAlternateTraceId(String traceId, Runnable delegate) {
        return wrapWithAlternateTraceId(traceId, DEFAULT_ROOT_SPAN_OPERATION, delegate);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'wrapWithNewTrace' is still used
in `tracing/src/main/java/com/palantir/tracing/Tracers.java`
#### Snippet
```java
     */
    @Deprecated
    public static <V> Callable<V> wrapWithNewTrace(Callable<V> delegate) {
        return wrapWithNewTrace(DEFAULT_ROOT_SPAN_OPERATION, delegate);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'initTraceWithSpan' is still used
in `tracing/src/main/java/com/palantir/tracing/Tracer.java`
#### Snippet
```java
     */
    @Deprecated
    public static void initTraceWithSpan(
            Observability observability, String traceId, @Safe String operation, String parentSpanId, SpanType type) {
        setTrace(createTrace(
```

### DeprecatedIsStillUsed
Deprecated member 'completeSpan' is still used
in `tracing/src/main/java/com/palantir/tracing/Tracer.java`
#### Snippet
```java
    @CheckReturnValue
    @Deprecated
    public static Optional<Span> completeSpan(@Safe Map<String, String> metadata) {
        Trace trace = currentTrace.get();
        if (trace == null) {
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `tracing-undertow-jakarta-testing/src/main/java/com/palantir/undertest/UndertowServerExtension.java`
#### Snippet
```java
        servletBuilder.addFilters(filters);

        filterUrlMapping.forEach((key, value) -> {
            servletBuilder.addFilterUrlMapping(key, value, DispatcherType.REQUEST);
        });
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `tracing/src/main/java/com/palantir/tracing/TraceLocal.java`
#### Snippet
```java

    @Override
    public int hashCode() {
        // identity semantics
        return super.hashCode();
```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`number >> 0` can be replaced with 'number'
in `tracing/src/main/java/com/palantir/tracing/Tracers.java`
#### Snippet
```java
        data[13] = HEX_DIGITS[(int) ((number >> 8) & 0xF)];
        data[14] = HEX_DIGITS[(int) ((number >> 4) & 0xF)];
        data[15] = HEX_DIGITS[(int) ((number >> 0) & 0xF)];
        return new String(data);
    }
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `atLeastOneCompatible |= compatibility[exIndex][acIndex]`
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
            boolean atLeastOneCompatible = false;
            for (int acIndex = 0; acIndex < ac.size(); acIndex++) {
                atLeastOneCompatible |= compatibility[exIndex][acIndex];
            }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `atLeastOneCompatible |= compatibility[exIndex][acIndex]`
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
            boolean atLeastOneCompatible = false;
            for (int exIndex = 0; exIndex < ex.size(); exIndex++) {
                atLeastOneCompatible |= compatibility[exIndex][acIndex];
            }

```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `tracing-test-utils/src/main/java/com/palantir/tracing/TestTracingExtension.java`
#### Snippet
```java
                        t.actualChildren().stream().map(Span::getOperation).collect(ImmutableList.toImmutableList())),
                (ComparisonFailure.incompatibleStructure _t) ->
                        String.format("Expected children to structured similarly"));
    }

```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `OpenSpan` has no concrete subclass
in `tracing-api/src/main/java/com/palantir/tracing/api/OpenSpan.java`
#### Snippet
```java
@Value.Immutable
@ImmutablesStyle
public abstract class OpenSpan {
    private static final Clock CLOCK = Clock.systemUTC();

```

### AbstractClassNeverImplemented
Abstract class `SerializableSpan` has no concrete subclass
in `tracing-test-utils/src/main/java/com/palantir/tracing/api/SerializableSpan.java`
#### Snippet
```java
@Value.Immutable
@JsonDeserialize(as = ImmutableSerializableSpan.class)
abstract class SerializableSpan {

    public abstract String getTraceId();
```

### AbstractClassNeverImplemented
Abstract class `Span` has no concrete subclass
in `tracing-api/src/main/java/com/palantir/tracing/api/Span.java`
#### Snippet
```java
@Value.Immutable
@ImmutablesStyle
public abstract class Span {

    public abstract String getTraceId();
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super ClassicHttpResponse`
in `tracing-undertow-jakarta-testing/src/main/java/com/palantir/undertest/UndertowServerExtension.java`
#### Snippet
```java
    }

    public void runRequest(ClassicHttpRequest request, Consumer<ClassicHttpResponse> handler) {
        try {
            httpClient.execute(
```

### BoundedWildcard
Can generalize to `? extends Trace`
in `tracing/src/main/java/com/palantir/tracing/DeferredTracer.java`
#### Snippet
```java
        private final Optional<Trace> originalTrace;

        TaggedCloseableTrace(Optional<Trace> originalTrace, Map<String, String> metadata) {
            this.metadata = metadata;
            this.originalTrace = originalTrace;
```

### BoundedWildcard
Can generalize to `? extends Span`
in `tracing-test-utils/src/main/java/com/palantir/tracing/api/Serialization.java`
#### Snippet
```java
    }

    public static void serialize(Path file, Collection<Span> allSpans) throws IOException {
        Files.createDirectories(file.getParent());
        try (OutputStream outputStream = Files.newOutputStream(file)) {
```

### BoundedWildcard
Can generalize to `? super Request`
in `tracing-okhttp3/src/main/java/com/palantir/tracing/OkhttpTraceInterceptor2.java`
#### Snippet
```java
    private final Function<Request, CloseableSpan> createNetworkCallSpan;

    private OkhttpTraceInterceptor2(Function<Request, CloseableSpan> createNetworkCallSpan) {
        this.createNetworkCallSpan = createNetworkCallSpan;
    }
```

### BoundedWildcard
Can generalize to `? extends CloseableSpan`
in `tracing-okhttp3/src/main/java/com/palantir/tracing/OkhttpTraceInterceptor2.java`
#### Snippet
```java
    private final Function<Request, CloseableSpan> createNetworkCallSpan;

    private OkhttpTraceInterceptor2(Function<Request, CloseableSpan> createNetworkCallSpan) {
        this.createNetworkCallSpan = createNetworkCallSpan;
    }
```

### BoundedWildcard
Can generalize to `? extends Span`
in `tracing-test-utils/src/main/java/com/palantir/tracing/TimeBounds.java`
#### Snippet
```java
    }

    static TimeBounds fromSpans(Collection<Span> spans) {
        long earliestStartMicros =
                spans.stream().mapToLong(Span::getStartTimeMicroSeconds).min().getAsLong();
```

### BoundedWildcard
Can generalize to `? extends Span`
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java

    /* Assumes list of spans to be ordered by startTimeMicros */
    private static boolean containsOverlappingSpans(List<Span> spans) {
        for (int i = 0; i < spans.size() - 1; i++) {
            Span currentSpan = spans.get(i);
```

### BoundedWildcard
Can generalize to `? extends Span`
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
    }

    public static Map<String, Result> analyzeByTraceId(Collection<Span> spans) {
        Map<String, List<Span>> spansByTraceId = spans.stream().collect(Collectors.groupingBy(Span::getTraceId));

```

### BoundedWildcard
Can generalize to `? extends Span`
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
     * <p>It's OK for some spans to be compatible with more than one span (as subtrees could be identical).
     */
    private static boolean compatibleOverlappingSpans(Result expected, Result actual, List<Span> ex, List<Span> ac) {
        boolean[][] compatibility = new boolean[ex.size()][ac.size()];

```

### BoundedWildcard
Can generalize to `? extends Span`
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
     * <p>It's OK for some spans to be compatible with more than one span (as subtrees could be identical).
     */
    private static boolean compatibleOverlappingSpans(Result expected, Result actual, List<Span> ex, List<Span> ac) {
        boolean[][] compatibility = new boolean[ex.size()][ac.size()];

```

### BoundedWildcard
Can generalize to `? extends V`
in `tracing/src/main/java/com/palantir/tracing/Tracers.java`
#### Snippet
```java
        private final Detached detached;

        AnonymousTracingAwareCallable(Callable<V> delegate) {
            this.delegate = delegate;
            this.detached = DetachedSpan.detach();
```

### BoundedWildcard
Can generalize to `? extends V`
in `tracing/src/main/java/com/palantir/tracing/Tracers.java`
#### Snippet
```java
     */
    public static <V> Callable<V> wrapWithNewTrace(
            String operation, Observability observability, Callable<V> delegate) {
        return () -> {
            // clear the existing trace and keep it around for restoration when we're done
```

### BoundedWildcard
Can generalize to `? extends V`
in `tracing/src/main/java/com/palantir/tracing/Tracers.java`
#### Snippet
```java
     */
    public static <V> Callable<V> wrapWithAlternateTraceId(
            String traceId, String operation, Observability observability, Callable<V> delegate) {
        return () -> {
            // clear the existing trace and keep it around for restoration when we're done
```

### BoundedWildcard
Can generalize to `? extends Trace`
in `tracing/src/main/java/com/palantir/tracing/Tracers.java`
#### Snippet
```java
     * {@link #wrapWithNewTrace} calls.
     */
    private static void restoreTrace(Optional<Trace> trace) {
        if (trace.isPresent()) {
            Tracer.setTrace(trace.get());
```

### BoundedWildcard
Can generalize to `? extends V`
in `tracing/src/main/java/com/palantir/tracing/Tracers.java`
#### Snippet
```java
        private final Map<String, String> metadata;

        TracingAwareCallable(String operation, Map<String, String> metadata, Callable<V> delegate) {
            this.delegate = delegate;
            this.detached = DetachedSpan.detach();
```

### BoundedWildcard
Can generalize to `? extends OpenSpan`
in `tracing/src/main/java/com/palantir/tracing/Tracer.java`
#### Snippet
```java

    private static <T> void completeSpanAndNotifyObservers(
            Optional<OpenSpan> openSpan, TagTranslator<? super T> tag, T state, String traceId) {
        //noinspection OptionalIsPresent - Avoid lambda allocation in hot paths
        if (openSpan.isPresent()) {
```

## RuleId[id=NullableProblems]
### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `tracing/src/main/java/com/palantir/tracing/DeferredTracer.java`
#### Snippet
```java
    }

    public DeferredTracer(@Safe String operation, @Safe Map<String, String> metadata) {
        Optional<Trace> maybeTrace = Tracer.copyTrace();
        if (maybeTrace.isPresent()) {
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `tracing/src/main/java/com/palantir/tracing/DeferredTracer.java`
#### Snippet
```java
    }

    public DeferredTracer(@Safe String operation, @Safe Map<String, String> metadata) {
        Optional<Trace> maybeTrace = Tracer.copyTrace();
        if (maybeTrace.isPresent()) {
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `tracing-test-utils/src/main/java/com/palantir/tracing/TimeBounds.java`
#### Snippet
```java
    static TimeBounds fromSpans(Collection<Span> spans) {
        long earliestStartMicros =
                spans.stream().mapToLong(Span::getStartTimeMicroSeconds).min().getAsLong();
        long latestEndNanos = spans.stream()
                .mapToLong(span -> {
```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `tracing-test-utils/src/main/java/com/palantir/tracing/TimeBounds.java`
#### Snippet
```java
                })
                .max()
                .getAsLong();
        return new TimeBounds() {
            @Override
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `value == null` is always `false`
in `tracing/src/main/java/com/palantir/tracing/TraceLocal.java`
#### Snippet
```java
    @Nullable
    public T set(@Nonnull T value) {
        if (value == null) {
            throw new SafeIllegalArgumentException("value must not be null");
        }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `tracing/src/main/java/com/palantir/tracing/Trace.java`
#### Snippet
```java
        Optional<OpenSpan> prevState = top();
        final OpenSpan span;
        //noinspection OptionalIsPresent - Avoid lambda allocation in hot paths
        if (prevState.isPresent()) {
            span = OpenSpan.of(
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.graph.ImmutableGraph' is marked unstable with @Beta
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
    private SpanAnalyzer() {}

    private static Stream<Span> depthFirstTraversalOrderedByStartTime(ImmutableGraph<Span> graph, Span parentSpan) {
        Stream<Span> children =
                children(graph, parentSpan).flatMap(child -> depthFirstTraversalOrderedByStartTime(graph, child));
```

### UnstableApiUsage
'com.google.common.graph.ImmutableGraph' is marked unstable with @Beta
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
    @Value.Immutable
    interface Result {
        ImmutableGraph<Span> graph();

        Span root();
```

### UnstableApiUsage
'com.google.common.graph.ImmutableGraph' is marked unstable with @Beta
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
        // people do crazy things with traces - they might have a trace already initialized which doesn't
        // get closed (and therefore emitted) by the time we need to render, so just hook it up to the fake
        ImmutableGraph.Builder<Span> graph = GraphBuilder.directed().immutable();
        spans.forEach(graph::addNode);
        spans.stream()
```

### UnstableApiUsage
'com.google.common.graph.ImmutableGraph.Builder' is declared in unstable class 'com.google.common.graph.ImmutableGraph' marked with @Beta
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
        // people do crazy things with traces - they might have a trace already initialized which doesn't
        // get closed (and therefore emitted) by the time we need to render, so just hook it up to the fake
        ImmutableGraph.Builder<Span> graph = GraphBuilder.directed().immutable();
        spans.forEach(graph::addNode);
        spans.stream()
```

### UnstableApiUsage
'com.google.common.graph.GraphBuilder' is marked unstable with @Beta
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
        // people do crazy things with traces - they might have a trace already initialized which doesn't
        // get closed (and therefore emitted) by the time we need to render, so just hook it up to the fake
        ImmutableGraph.Builder<Span> graph = GraphBuilder.directed().immutable();
        spans.forEach(graph::addNode);
        spans.stream()
```

### UnstableApiUsage
'directed()' is declared in unstable class 'com.google.common.graph.GraphBuilder' marked with @Beta
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
        // people do crazy things with traces - they might have a trace already initialized which doesn't
        // get closed (and therefore emitted) by the time we need to render, so just hook it up to the fake
        ImmutableGraph.Builder<Span> graph = GraphBuilder.directed().immutable();
        spans.forEach(graph::addNode);
        spans.stream()
```

### UnstableApiUsage
'immutable()' is declared in unstable class 'com.google.common.graph.GraphBuilder' marked with @Beta
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
        // people do crazy things with traces - they might have a trace already initialized which doesn't
        // get closed (and therefore emitted) by the time we need to render, so just hook it up to the fake
        ImmutableGraph.Builder<Span> graph = GraphBuilder.directed().immutable();
        spans.forEach(graph::addNode);
        spans.stream()
```

### UnstableApiUsage
'addNode(N)' is declared in unstable class 'com.google.common.graph.ImmutableGraph' marked with @Beta
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
        // get closed (and therefore emitted) by the time we need to render, so just hook it up to the fake
        ImmutableGraph.Builder<Span> graph = GraphBuilder.directed().immutable();
        spans.forEach(graph::addNode);
        spans.stream()
                .filter(span -> !span.getSpanId().equals(rootSpan.getSpanId()))
```

### UnstableApiUsage
'putEdge(N, N)' is declared in unstable class 'com.google.common.graph.ImmutableGraph' marked with @Beta
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
        spans.stream()
                .filter(span -> !span.getSpanId().equals(rootSpan.getSpanId()))
                .forEach(span -> graph.putEdge(
                        span, span.getParentSpanId().map(spansBySpanId::get).orElse(fakeRootSpan)));
        ImmutableGraph<Span> spanGraph = graph.build();
```

### UnstableApiUsage
'com.google.common.graph.ImmutableGraph' is marked unstable with @Beta
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
                .forEach(span -> graph.putEdge(
                        span, span.getParentSpanId().map(spansBySpanId::get).orElse(fakeRootSpan)));
        ImmutableGraph<Span> spanGraph = graph.build();

        return ImmutableResult.builder()
```

### UnstableApiUsage
'build()' is declared in unstable class 'com.google.common.graph.ImmutableGraph' marked with @Beta
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
                .forEach(span -> graph.putEdge(
                        span, span.getParentSpanId().map(spansBySpanId::get).orElse(fakeRootSpan)));
        ImmutableGraph<Span> spanGraph = graph.build();

        return ImmutableResult.builder()
```

### UnstableApiUsage
'com.google.common.graph.ImmutableGraph' is marked unstable with @Beta
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
    }

    public static Stream<Span> children(ImmutableGraph<Span> graph, Span parentSpan) {
        return graph.incidentEdges(parentSpan).stream()
                // we only care about incoming edges to the 'parentSpan', not outgoing ones
```

### UnstableApiUsage
'incidentEdges(N)' is unstable because its signature references unstable class 'com.google.common.graph.EndpointPair' marked with @Beta
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java

    public static Stream<Span> children(ImmutableGraph<Span> graph, Span parentSpan) {
        return graph.incidentEdges(parentSpan).stream()
                // we only care about incoming edges to the 'parentSpan', not outgoing ones
                .filter(pair -> pair.nodeV().equals(parentSpan))
```

### UnstableApiUsage
'nodeV()' is declared in unstable class 'com.google.common.graph.EndpointPair' marked with @Beta
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
        return graph.incidentEdges(parentSpan).stream()
                // we only care about incoming edges to the 'parentSpan', not outgoing ones
                .filter(pair -> pair.nodeV().equals(parentSpan))
                .map(EndpointPair::nodeU)
                .sorted(SpanComparator.INSTANCE);
```

### UnstableApiUsage
'com.google.common.graph.EndpointPair' is marked unstable with @Beta
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
                // we only care about incoming edges to the 'parentSpan', not outgoing ones
                .filter(pair -> pair.nodeV().equals(parentSpan))
                .map(EndpointPair::nodeU)
                .sorted(SpanComparator.INSTANCE);
    }
```

### UnstableApiUsage
'nodeU()' is declared in unstable class 'com.google.common.graph.EndpointPair' marked with @Beta
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
                // we only care about incoming edges to the 'parentSpan', not outgoing ones
                .filter(pair -> pair.nodeV().equals(parentSpan))
                .map(EndpointPair::nodeU)
                .sorted(SpanComparator.INSTANCE);
    }
```

### UnstableApiUsage
'com.google.common.graph.ImmutableGraph' is marked unstable with @Beta
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
    }

    private static List<Span> sortedChildren(ImmutableGraph<Span> graph, Span node) {
        return children(graph, node)
                .sorted(Comparator.comparingLong(Span::getStartTimeMicroSeconds))
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `tracing-test-utils/src/main/java/com/palantir/tracing/HtmlFormatter.java`
#### Snippet
```java

    private void renderAllSpansForOneTraceId(String traceId, SpanAnalyzer.Result analysis, StringBuilder sb) {
        sb.append("<div style=\"border-top: 1px solid #E1E8ED\" title=\"" + traceId + "\">\n");
        analysis.orderedSpans().stream()
                .filter(s -> !SpanAnalyzer.isSyntheticRoot(s))
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `tracing-test-utils/src/main/java/com/palantir/tracing/TestTracingExtension.java`
#### Snippet
```java

        // match recorded traces against expected file (or create)
        if (!Files.exists(snapshotFile) || Boolean.valueOf(System.getProperty("recreate", "false"))) {
            Serialization.serialize(snapshotFile, actualSpans);
            HtmlFormatter.render(HtmlFormatter.RenderConfig.builder()
```

