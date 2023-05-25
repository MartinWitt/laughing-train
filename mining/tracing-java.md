# tracing-java 
 
# Bad smells
I found 136 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 36 | false |
| OptionalUsedAsFieldOrParameterType | 29 | false |
| BlockingMethodInNonBlockingContext | 18 | false |
| UnstableApiUsage | 17 | false |
| DeprecatedIsStillUsed | 7 | false |
| FieldMayBeFinal | 5 | false |
| DuplicatedCode | 5 | false |
| UNCHECKED_WARNING | 4 | false |
| JavadocDeclaration | 3 | false |
| CommentedOutCode | 3 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| OptionalIsPresent | 1 | false |
| AutoCloseableResource | 1 | false |
| UastIncorrectHttpHeaderInspection | 1 | false |
| PointlessBitwiseExpression | 1 | false |
| RedundantStringFormatCall | 1 | false |
| ConstantValue | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
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
        private final Optional<String> parentSpanId;

        UnsampledDetachedSpan(TraceState traceState, Optional<String> parentSpanId) {
            this.traceState = traceState;
            this.parentSpanId = parentSpanId;
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'CloseableTracer' used without 'try'-with-resources statement
in `tracing/src/main/java/com/palantir/tracing/NopDetached.java`
#### Snippet
```java
    public <T> CloseableSpan childSpan(
            String operationName, TagTranslator<? super T> translator, T data, SpanType type) {
        return CloseableTracer.startSpan(operationName, translator, data, type)::close;
    }

```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `tracing/src/main/java/com/palantir/tracing/TraceLocal.java`
#### Snippet
```java
            }

            return (T) traceLocals.get(this);
        } else {
            Map<TraceLocal<?>, Object> traceLocals = traceState.getOrCreateTraceLocals();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `tracing/src/main/java/com/palantir/tracing/TraceLocal.java`
#### Snippet
```java
        } else {
            Map<TraceLocal<?>, Object> traceLocals = traceState.getOrCreateTraceLocals();
            return (T) traceLocals.computeIfAbsent(this, initialValue);
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `tracing/src/main/java/com/palantir/tracing/TraceLocal.java`
#### Snippet
```java
        }

        return (T) traceLocals.remove(this);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `tracing/src/main/java/com/palantir/tracing/TraceLocal.java`
#### Snippet
```java
        }

        return (T) traceState.getOrCreateTraceLocals().put(this, value);
    }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `tracing/src/main/java/com/palantir/tracing/Tracers.java`
#### Snippet
```java
    /**
     * Wraps the provided executor service to make submitted tasks traceable with a fresh {@link Trace trace} for each
     * execution, see {@link #wrapWithNewTrace(String, ExecutorService)}. This method should not be used to wrap a
     * ScheduledExecutorService that has already been {@link #wrap(ExecutorService) wrapped}. If this is done, a new
     * trace will be generated for each execution, effectively bypassing the intent of the previous wrapping. The given
```

### JavadocDeclaration
Javadoc pointing to itself
in `tracing/src/main/java/com/palantir/tracing/Tracers.java`
#### Snippet
```java
    /**
     * Wraps the provided scheduled executor service to make submitted tasks traceable, see
     * {@link #wrap(ScheduledExecutorService)}. This method should not be used to wrap a ScheduledExecutorService that
     * has already been {@link #wrapWithNewTrace(ScheduledExecutorService) wrapped with new trace}. If this is done, a
     * new trace will be generated for each execution, effectively bypassing the intent of this method.
```

### JavadocDeclaration
Javadoc pointing to itself
in `tracing/src/main/java/com/palantir/tracing/Tracers.java`
#### Snippet
```java
    /**
     * Wraps the provided scheduled executor service to make submitted tasks traceable with a fresh {@link Trace trace}
     * for each execution, see {@link #wrapWithNewTrace(String, ScheduledExecutorService)}. This method should not be
     * used to wrap a ScheduledExecutorService that has already been {@link #wrap(ScheduledExecutorService) wrapped}. If
     * this is done, a new trace will be generated for each execution, effectively bypassing the intent of the previous
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `filterUrlMapping` may be 'final'
in `tracing-undertow-jakarta-testing/src/main/java/com/palantir/undertest/UndertowServerExtension.java`
#### Snippet
```java

    // LinkedHashMap preserves order
    private Map<String, String> filterUrlMapping = new LinkedHashMap<>();

    private List<Object> jerseyObjects = new ArrayList<>();
```

### FieldMayBeFinal
Field `jerseyObjects` may be 'final'
in `tracing-undertow-jakarta-testing/src/main/java/com/palantir/undertest/UndertowServerExtension.java`
#### Snippet
```java
    private Map<String, String> filterUrlMapping = new LinkedHashMap<>();

    private List<Object> jerseyObjects = new ArrayList<>();

    public static UndertowServerExtension create() {
```

### FieldMayBeFinal
Field `filters` may be 'final'
in `tracing-undertow-jakarta-testing/src/main/java/com/palantir/undertest/UndertowServerExtension.java`
#### Snippet
```java

    private List<ServletInfo> servlets = new ArrayList<>();
    private List<FilterInfo> filters = new ArrayList<>();

    // LinkedHashMap preserves order
```

### FieldMayBeFinal
Field `servlets` may be 'final'
in `tracing-undertow-jakarta-testing/src/main/java/com/palantir/undertest/UndertowServerExtension.java`
#### Snippet
```java
    private CloseableHttpClient httpClient;

    private List<ServletInfo> servlets = new ArrayList<>();
    private List<FilterInfo> filters = new ArrayList<>();

```

### FieldMayBeFinal
Field `config` may be 'final'
in `tracing-test-utils/src/main/java/com/palantir/tracing/HtmlFormatter.java`
#### Snippet
```java

final class HtmlFormatter {
    private RenderConfig config;

    private HtmlFormatter(RenderConfig config) {
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

## RuleId[id=UastIncorrectHttpHeaderInspection]
### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tracing-okhttp3/src/main/java/com/palantir/tracing/okhttp3/OkhttpTraceInterceptor.java`
#### Snippet
```java

    /** The HTTP header used to communicate API endpoint names internally. Not considered public API. */
    public static final String PATH_TEMPLATE_HEADER = "hr-path-template";

    @Override
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `tracing-jersey-jakarta/src/main/java/com/palantir/tracing/jersey/TraceEnrichingFilter.java`
#### Snippet
```java
String path = getPathTemplate();

        String operation = "Jersey: " + requestContext.getMethod() + " " + path;
        // The following strings are all nullable
        String traceId = requestContext.getHeaderString(TraceHttpHeaders.TRACE_ID);
        String spanId = requestContext.getHeaderString(TraceHttpHeaders.SPAN_ID);
        Optional<String> forUserAgent = getForUserAgent(requestContext);

        // Set up thread-local span that inherits state from HTTP headers
        if (Strings.isNullOrEmpty(traceId)) {
            // HTTP request did not indicate a trace; initialize trace state and create a span.
            Tracer.initTraceWithSpan(
                    getObservabilityFromHeader(requestContext),
                    Tracers.randomId(),
                    forUserAgent,
                    operation,
                    SpanType.SERVER_INCOMING);
        } else if (spanId == null) {
            Tracer.initTraceWithSpan(
                    getObservabilityFromHeader(requestContext),
                    traceId,
                    forUserAgent,
                    operation,
                    SpanType.SERVER_INCOMING);
        } else {
            // caller's span is this span's parent.
            Tracer.initTraceWithSpan(
                    getObservabilityFromHeader(requestContext),
                    traceId,
                    forUserAgent,
                    operation,
                    spanId,
                    SpanType.SERVER_INCOMING);
        }

        // Give asynchronous downstream handlers access to the trace id
        requestContext.setProperty(TRACE_ID_PROPERTY_NAME, Tracer.getTraceId());
        requestContext.setProperty(SAMPLED_PROPERTY_NAME, Tracer.isTraceObservable());
        Tracer.maybeGetTraceMetadata()
                .flatMap(TraceMetadata::getRequestId)
                .ifPresent(requestId -> requestContext.setProperty(REQUEST_ID_PROPERTY_NAME, requestId));
```

### DuplicatedCode
Duplicated code
in `tracing-jersey-jakarta/src/main/java/com/palantir/tracing/jersey/TraceEnrichingFilter.java`
#### Snippet
```java
        MultivaluedMap<String, Object> headers = responseContext.getHeaders();
        if (Tracer.hasTraceId()) {
            String traceId = Tracer.getTraceId();
            Tracer.fastCompleteSpan(FunctionalTagTranslator.INSTANCE, sink -> {
                sink.accept(TraceTags.HTTP_STATUS_CODE, Integer.toString(responseContext.getStatus()));
                sink.accept(TraceTags.HTTP_URL_PATH_TEMPLATE, getPathTemplate());
                sink.accept(TraceTags.HTTP_METHOD, requestContext.getMethod());
                Object requestId = requestContext.getProperty(REQUEST_ID_PROPERTY_NAME);
                if (requestId instanceof String) {
                    sink.accept(TraceTags.HTTP_REQUEST_ID, (String) requestId);
                }
            });
            headers.putSingle(TraceHttpHeaders.TRACE_ID, traceId);
        } else {
            // When the filter is called twice (e.g. an exception is thrown in a streaming call),
            // the current trace will be empty. To allow clients to still get the trace ID corresponding to
            // the failure, we retrieve it from the requestContext.
            Optional.ofNullable(requestContext.getProperty(TRACE_ID_PROPERTY_NAME))
                    .ifPresent(s -> headers.putSingle(TraceHttpHeaders.TRACE_ID, s));
        }
```

### DuplicatedCode
Duplicated code
in `tracing-jersey-jakarta/src/main/java/com/palantir/tracing/jersey/TraceEnrichingFilter.java`
#### Snippet
```java
        String forUserAgent = context.getHeaderString(TraceHttpHeaders.FOR_USER_AGENT);
        if (forUserAgent != null) {
            return Optional.of(forUserAgent);
        }
        String fetchUserAgent = context.getHeaderString(FETCH_USER_AGENT_HEADER);
        if (fetchUserAgent != null) {
            return Optional.of(fetchUserAgent);
        }
        return Optional.ofNullable(context.getHeaderString(HttpHeaders.USER_AGENT));
```

### DuplicatedCode
Duplicated code
in `tracing-servlet-jakarta/src/main/java/com/palantir/tracing/servlet/LeakedTraceFilter.java`
#### Snippet
```java
        if (Tracer.hasTraceId()) {
            Trace leakedTrace = Tracer.getAndClearTrace();
            if (log.isDebugEnabled()) {
                log.debug("Clearing leaked trace trace {}", SafeArg.of("trace", toLoggableValue(leakedTrace)));
            }
        }
        try {
            chain.doFilter(request, response);
        } finally {
            if (Tracer.hasTraceId()) {
                Trace leakedTrace = Tracer.getAndClearTrace();
                if (log.isDebugEnabled()) {
                    log.debug(
                            "This operation has leaked Tracer state. Tracer.startSpan was executed without "
                                    + "Tracer.completeSpan, resulting in both loss of span data and spans using "
                                    + "completion information from incorrect operations. Trace: {}, Path: {}",
                            SafeArg.of("trace", toLoggableValue(leakedTrace)),
                            UnsafeArg.of("path", getPath(request)));
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `tracing-test-utils/src/main/java/com/palantir/tracing/SpanAnalyzer.java`
#### Snippet
```java
        for (int exIndex = 0; exIndex < ex.size(); exIndex++) {
            boolean atLeastOneCompatible = false;
            for (int acIndex = 0; acIndex < ac.size(); acIndex++) {
                atLeastOneCompatible |= compatibility[exIndex][acIndex];
            }

            if (!atLeastOneCompatible) {
                return false;
            }
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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tracing-test-utils/src/main/java/com/palantir/tracing/RenderTracingRule.java`
#### Snippet
```java

    @Override
    public Statement apply(Statement base, Description description) {
        return new Statement() {
            @Override
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing-test-utils/src/main/java/com/palantir/tracing/RenderTracingRule.java`
#### Snippet
```java

    @Override
    public Statement apply(Statement base, Description description) {
        return new Statement() {
            @Override
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing-test-utils/src/main/java/com/palantir/tracing/RenderTracingRule.java`
#### Snippet
```java

    @Override
    public Statement apply(Statement base, Description description) {
        return new Statement() {
            @Override
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
Not annotated method overrides method annotated with @NotNull
in `tracing/src/main/java/com/palantir/tracing/WrappingScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public final ScheduledFuture<?> scheduleAtFixedRate(
            Runnable command, long initialDelay, long period, TimeUnit unit) {
        return delegate.scheduleAtFixedRate(wrapRecurring(command), initialDelay, period, unit);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingScheduledExecutorService.java`
#### Snippet
```java
    @Override
    public final ScheduledFuture<?> scheduleAtFixedRate(
            Runnable command, long initialDelay, long period, TimeUnit unit) {
        return delegate.scheduleAtFixedRate(wrapRecurring(command), initialDelay, period, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingScheduledExecutorService.java`
#### Snippet
```java
    @Override
    public final ScheduledFuture<?> scheduleAtFixedRate(
            Runnable command, long initialDelay, long period, TimeUnit unit) {
        return delegate.scheduleAtFixedRate(wrapRecurring(command), initialDelay, period, unit);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tracing/src/main/java/com/palantir/tracing/WrappingScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public final ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
        return delegate.schedule(wrapTask(command), delay, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public final ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
        return delegate.schedule(wrapTask(command), delay, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public final ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
        return delegate.schedule(wrapTask(command), delay, unit);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tracing/src/main/java/com/palantir/tracing/WrappingScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public final ScheduledFuture<?> scheduleWithFixedDelay(
            Runnable command, long initialDelay, long delay, TimeUnit unit) {
        return delegate.scheduleWithFixedDelay(wrapRecurring(command), initialDelay, delay, unit);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingScheduledExecutorService.java`
#### Snippet
```java
    @Override
    public final ScheduledFuture<?> scheduleWithFixedDelay(
            Runnable command, long initialDelay, long delay, TimeUnit unit) {
        return delegate.scheduleWithFixedDelay(wrapRecurring(command), initialDelay, delay, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingScheduledExecutorService.java`
#### Snippet
```java
    @Override
    public final ScheduledFuture<?> scheduleWithFixedDelay(
            Runnable command, long initialDelay, long delay, TimeUnit unit) {
        return delegate.scheduleWithFixedDelay(wrapRecurring(command), initialDelay, delay, unit);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tracing/src/main/java/com/palantir/tracing/WrappingScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public final <V> ScheduledFuture<V> schedule(Callable<V> task, long delay, TimeUnit unit) {
        return delegate.schedule(wrapTask(task), delay, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public final <V> ScheduledFuture<V> schedule(Callable<V> task, long delay, TimeUnit unit) {
        return delegate.schedule(wrapTask(task), delay, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingScheduledExecutorService.java`
#### Snippet
```java

    @Override
    public final <V> ScheduledFuture<V> schedule(Callable<V> task, long delay, TimeUnit unit) {
        return delegate.schedule(wrapTask(task), delay, unit);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java

    @Override
    public final List<Runnable> shutdownNow() {
        return delegate.shutdownNow();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java

    @Override
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
            throws InterruptedException {
        return delegate.invokeAll(wrapTasks(tasks), timeout, unit);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java

    @Override
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
            throws InterruptedException {
        return delegate.invokeAll(wrapTasks(tasks), timeout, unit);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java

    @Override
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
            throws InterruptedException {
        return delegate.invokeAll(wrapTasks(tasks), timeout, unit);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java

    @Override
    public final <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException {
        return delegate.invokeAny(wrapTasks(tasks), timeout, unit);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java

    @Override
    public final <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException {
        return delegate.invokeAny(wrapTasks(tasks), timeout, unit);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java

    @Override
    public final <T> T invokeAny(Collection<? extends Callable<T>> tasks)
            throws InterruptedException, ExecutionException {
        return delegate.invokeAny(wrapTasks(tasks));
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java

    @Override
    public final <T> T invokeAny(Collection<? extends Callable<T>> tasks)
            throws InterruptedException, ExecutionException {
        return delegate.invokeAny(wrapTasks(tasks));
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java

    @Override
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return delegate.invokeAll(wrapTasks(tasks));
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java

    @Override
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return delegate.invokeAll(wrapTasks(tasks));
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java
    // These methods wrap before delegating.
    @Override
    public final void execute(Runnable command) {
        delegate.execute(wrapTask(command));
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java

    @Override
    public final <T> Future<T> submit(Callable<T> task) {
        return delegate.submit(wrapTask(checkNotNull(task)));
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java

    @Override
    public final <T> Future<T> submit(Callable<T> task) {
        return delegate.submit(wrapTask(checkNotNull(task)));
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java

    @Override
    public final boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return delegate.awaitTermination(timeout, unit);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java

    @Override
    public final Future<?> submit(Runnable task) {
        return delegate.submit(wrapTask(task));
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java

    @Override
    public final Future<?> submit(Runnable task) {
        return delegate.submit(wrapTask(task));
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java

    @Override
    public final <T> Future<T> submit(Runnable task, T result) {
        return delegate.submit(wrapTask(task), result);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java

    @Override
    public final <T> Future<T> submit(Runnable task, T result) {
        return delegate.submit(wrapTask(task), result);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `tracing-test-utils/src/main/java/com/palantir/tracing/TimeBounds.java`
#### Snippet
```java
        return new TimeBounds() {
            @Override
            public int compareTo(TimeBounds other) {
                return COMPARATOR.compare(this, other);
            }
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
    }

    private static List<Span> sortedChildren(ImmutableGraph<Span> graph, Span node) {
        return children(graph, node)
                .sorted(Comparator.comparingLong(Span::getStartTimeMicroSeconds))
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

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tracing-jaxrs/src/main/java/com/palantir/tracing/jaxrs/JaxRsTracers.java`
#### Snippet
```java
        public void write(OutputStream output) throws IOException, WebApplicationException {
            try (CloseableSpan ignored = detached.childSpan("streaming-output")) {
                delegate.write(output);
            }
        }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tracing-servlet/src/main/java/com/palantir/tracing/servlet/LeakedTraceFilter.java`
#### Snippet
```java
        }
        try {
            chain.doFilter(request, response);
        } finally {
            if (Tracer.hasTraceId()) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tracing-undertow-jakarta-testing/src/main/java/com/palantir/undertest/UndertowServerExtension.java`
#### Snippet
```java
        }
        if (httpClient != null) {
            httpClient.close();
        }
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tracing-servlet-jakarta/src/main/java/com/palantir/tracing/servlet/LeakedTraceFilter.java`
#### Snippet
```java
        }
        try {
            chain.doFilter(request, response);
        } finally {
            if (Tracer.hasTraceId()) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tracing-jaxrs-jakarta/src/main/java/com/palantir/tracing/jaxrs/JaxRsTracers.java`
#### Snippet
```java
        public void write(OutputStream output) throws IOException, WebApplicationException {
            try (CloseableSpan ignored = detached.childSpan("streaming-output")) {
                delegate.write(output);
            }
        }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
            throws InterruptedException {
        return delegate.invokeAll(wrapTasks(tasks), timeout, unit);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java
    public final <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException {
        return delegate.invokeAny(wrapTasks(tasks), timeout, unit);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java
    public final <T> T invokeAny(Collection<? extends Callable<T>> tasks)
            throws InterruptedException, ExecutionException {
        return delegate.invokeAny(wrapTasks(tasks));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java
    @Override
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return delegate.invokeAll(wrapTasks(tasks));
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tracing/src/main/java/com/palantir/tracing/WrappingExecutorService.java`
#### Snippet
```java
    @Override
    public final boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return delegate.awaitTermination(timeout, unit);
    }
}
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tracing-test-utils/src/main/java/com/palantir/tracing/Utils.java`
#### Snippet
```java
        Path dir = base.resolve("tracing").resolve(clazz.getSimpleName());
        try {
            Files.createDirectories(dir);
            return dir.resolve(methodName + ".html");
        } catch (IOException e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tracing-test-utils/src/main/java/com/palantir/tracing/TestTracingExtension.java`
#### Snippet
```java
        Path outputPath = getOutputPath(name);
        Path snapshotFile = Paths.get("src/test/resources/tracing").resolve(name + ".log");
        Files.createDirectories(outputPath);
        Path actualPath = outputPath.resolve("actual.html");
        Path expectedPath = outputPath.resolve("expected.html");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tracing-test-utils/src/main/java/com/palantir/tracing/api/Serialization.java`
#### Snippet
```java

    public static List<Span> deserialize(Path file) throws IOException {
        try (Stream<String> lines = Files.lines(file)) {
            return lines.map(line -> {
                        try {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tracing-test-utils/src/main/java/com/palantir/tracing/api/Serialization.java`
#### Snippet
```java

    public static void serialize(Path file, Collection<Span> allSpans) throws IOException {
        Files.createDirectories(file.getParent());
        try (OutputStream outputStream = Files.newOutputStream(file)) {
            allSpans.forEach(span -> {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tracing-test-utils/src/main/java/com/palantir/tracing/api/Serialization.java`
#### Snippet
```java
    public static void serialize(Path file, Collection<Span> allSpans) throws IOException {
        Files.createDirectories(file.getParent());
        try (OutputStream outputStream = Files.newOutputStream(file)) {
            allSpans.forEach(span -> {
                try {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tracing-test-utils/src/main/java/com/palantir/tracing/api/Serialization.java`
#### Snippet
```java
                try {
                    byte[] bytes = mapper.writeValueAsBytes(SerializableSpan.fromSpan(span));
                    outputStream.write(bytes);
                    outputStream.write('\n');
                } catch (IOException e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tracing-test-utils/src/main/java/com/palantir/tracing/api/Serialization.java`
#### Snippet
```java
                    byte[] bytes = mapper.writeValueAsBytes(SerializableSpan.fromSpan(span));
                    outputStream.write(bytes);
                    outputStream.write('\n');
                } catch (IOException e) {
                    throw new RuntimeException(e);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `tracing-test-utils/src/main/java/com/palantir/tracing/HtmlFormatter.java`
#### Snippet
```java
        formatter.rawSpanJson(sb);

        Files.write(config.path(), sb.toString().getBytes(StandardCharsets.UTF_8));
    }

```

