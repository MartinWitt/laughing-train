# dialogue 
 
# Bad smells
I found 242 bad smells with 10 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 56 | false |
| BoundedWildcard | 54 | false |
| OptionalUsedAsFieldOrParameterType | 29 | false |
| RedundantFieldInitialization | 13 | false |
| SimplifyOptionalCallChains | 11 | false |
| OptionalGetWithoutIsPresent | 8 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 6 | false |
| ZeroLengthArrayInitialization | 6 | false |
| IOResource | 4 | false |
| UnnecessaryFullyQualifiedName | 4 | false |
| SuspiciousToArrayCall | 4 | false |
| CodeBlock2Expr | 4 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| OptionalIsPresent | 3 | false |
| SimplifyStreamApiCallChains | 3 | false |
| DeprecatedIsStillUsed | 3 | false |
| NullableProblems | 3 | false |
| DataFlowIssue | 2 | false |
| RedundantMethodOverride | 2 | false |
| ExceptionNameDoesntEndWithException | 2 | false |
| ReturnNull | 2 | false |
| SynchronizeOnThis | 2 | false |
| SuspiciousNameCombination | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| UnnecessarySemicolon | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| OptionalContainsCollection | 1 | false |
| CommentedOutCode | 1 | false |
| StaticPseudoFunctionalStyleMethod | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| AbstractClassNeverImplemented | 1 | false |
| RedundantSuppression | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| NestedAssignment | 1 | false |
| GroovyUnusedAssignment | 1 | false |
## RuleId[id=IOResource]
### IOResource
'TestResponse' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `dialogue-jmh/src/main/java/com/palantir/dialogue/core/EndToEndBenchmark.java`
#### Snippet
```java
        @Override
        public ListenableFuture<Response> execute(Endpoint _endpoint, Request _request) {
            return Futures.immediateFuture(new TestResponse().code(200));
        }
    }
```

### IOResource
'TestResponse' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationServer.java`
#### Snippet
```java

        default HandlerBuilder1 response(int status) {
            return response(_server -> new TestResponse().code(status));
        }

```

### IOResource
'TestResponse' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationServer.java`
#### Snippet
```java
            return response(server -> {
                if (server.activeRequests.getCount() > capacity) {
                    return new TestResponse().code(errorStatus);
                } else {
                    return new TestResponse().code(200);
```

### IOResource
'TestResponse' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationServer.java`
#### Snippet
```java
                    return new TestResponse().code(errorStatus);
                } else {
                    return new TestResponse().code(200);
                }
            });
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/DefaultClients.java`
#### Snippet
```java
    public <T> ListenableFuture<T> call(EndpointChannel channel, Request request, Deserializer<T> deserializer) {
        Optional<String> accepts = deserializer.accepts();
        Request outgoingRequest = accepts.isPresent() ? accepting(request, accepts.get()) : request;
        ListenableFuture<Response> response =
                closeRequestBodyOnCompletion(channel.execute(outgoingRequest), outgoingRequest);
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/DefaultClients.java`
#### Snippet
```java
            ListenableFuture<Response> responseFuture, Request request) {
        Optional<RequestBody> requestBody = request.body();
        if (requestBody.isPresent()) {
            DialogueFutures.addDirectListener(responseFuture, requestBody.get()::close);
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/DefaultClients.java`
#### Snippet
```java
            } else if (result instanceof Optional) {
                Optional<?> resultOptional = (Optional<?>) result;
                if (resultOptional.isPresent()) {
                    onSuccess(resultOptional.get());
                }
```

## RuleId[id=SuspiciousNameCombination]
### SuspiciousNameCombination
'Right' should probably not be passed as parameter 'yAxisLabelAlignment'
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationMetricsReporter.java`
#### Snippet
```java
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);
        chart.getStyler().setMarkerSize(3);
        chart.getStyler().setYAxisLabelAlignment(Styler.TextAlignment.Right);
        chart.getStyler().setPlotMargin(0);
        chart.getStyler().setPlotContentSize(.95);
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `UrlEncoder` has only 'static' members, and lacks a 'private' constructor
in `dialogue-core/src/main/java/com/palantir/dialogue/core/BaseUrl.java`
#### Snippet
```java
    /** Encodes URL components per https://tools.ietf.org/html/rfc3986 . */
    @VisibleForTesting
    static class UrlEncoder {
        private static final CharMatcher DIGIT = CharMatcher.inRange('0', '9');
        private static final CharMatcher ALPHA = CharMatcher.inRange('a', 'z').or(CharMatcher.inRange('A', 'Z'));
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `stickyTarget` might be null
in `dialogue-core/src/main/java/com/palantir/dialogue/core/StickyEndpointChannels2.java`
#### Snippet
```java
        public ListenableFuture<Response> execute(Request request, EndpointChannel endpointChannel) {
            if (stickyTarget != null) {
                return executeWithStickyTarget(stickyTarget, request, endpointChannel);
            }

```

### DataFlowIssue
Argument `stickyTarget` might be null
in `dialogue-core/src/main/java/com/palantir/dialogue/core/StickyEndpointChannels2.java`
#### Snippet
```java
            synchronized (this) {
                if (stickyTarget != null) {
                    return executeWithStickyTarget(stickyTarget, request, endpointChannel);
                }

```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/CautiousIncreaseAggressiveDecreaseConcurrencyLimiter.java`
#### Snippet
```java
                return Math.max(MIN_LIMIT, Math.floor(originalLimit * BACKOFF_RATIO));
            }
        };
    }

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'collection.toArray()'
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationMetricsReporter.java`
#### Snippet
```java
                    .toArray();
            double[] eventYs = new double[eventXs.length];
            String[] strings = simulation.events().getEvents().values().stream().toArray(String[]::new);
            XYSeries what = chart.addSeries(" ", eventXs, eventYs);
            what.setToolTips(strings);
```

### SimplifyStreamApiCallChains
Can be replaced with 'count()'
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/EndpointDefinitions.java`
#### Snippet
```java
        if (!args.stream()
                        .filter(Predicates.not(Optional::isPresent))
                        .collect(Collectors.toList())
                        .isEmpty()
                || maybeHttpPath.isEmpty()
```

### SimplifyStreamApiCallChains
Can be replaced with 'count()'
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java
                    maybeEndpoints.stream()
                            .filter(Predicates.not(Optional::isPresent))
                            .collect(Collectors.toList())
                            .isEmpty(),
                    "Failed validation");
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Inefficient conversion from ByteArrayOutputStream
in `dialogue-core/src/main/java/com/palantir/dialogue/core/BaseUrl.java`
#### Snippet
```java
                }
            }
            return wasChanged ? new String(bos.toByteArray(), StandardCharsets.UTF_8) : source;
        }

```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `Provider`
in `dialogue-clients/src/main/java/com/palantir/dialogue/clients/AugmentClientConfig.java`
#### Snippet
```java
    Optional<ClientConfiguration.RetryOnTimeout> retryOnTimeout();

    Optional<Provider> securityProvider();

    /**
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (6 lines)
in `dialogue-core/src/main/java/com/palantir/dialogue/core/RetryingChannel.java`
#### Snippet
```java
            DetachedSpan backoffSpan = span.childDetachedSpan("retry-backoff");
            // Code beyond this line implements the following without risking leaking responses:
            // ListenableScheduledFuture<ListenableFuture<Response>> scheduled = scheduler.schedule(
            //     () -> {
            //         backoffSpan.complete(RetryingCallbackTranslator.INSTANCE, this);
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'RefreshingChannelFactory' is still used
in `simulation/src/main/java/com/palantir/dialogue/core/RefreshingChannelFactory.java`
#### Snippet
```java
 */
@Deprecated
public final class RefreshingChannelFactory {
    private final Supplier<? extends ServicesConfigBlock> conf;
    private final ChannelFactory channelFactory;
```

### DeprecatedIsStillUsed
Deprecated member 'ChannelFactory' is still used
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ChannelFactory.java`
#### Snippet
```java
 */
@Deprecated
public interface ChannelFactory {

    Channel create(String uri);
```

### DeprecatedIsStillUsed
Deprecated member 'getNonReloading' is still used
in `dialogue-clients/src/main/java/com/palantir/dialogue/clients/DialogueClients.java`
#### Snippet
```java
         */
        @Deprecated
        <T> T getNonReloading(Class<T> clientInterface, ClientConfiguration clientConfiguration);
    }

```

## RuleId[id=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dialogue-core/src/main/java/com/palantir/dialogue/core/DialogueNodeSelectionStrategy.java`
#### Snippet
```java
    static List<DialogueNodeSelectionStrategy> fromHeader(String header) {
        return ImmutableList.copyOf(
                Lists.transform(SPLITTER.splitToList(header), DialogueNodeSelectionStrategy::safeValueOf));
    }

```

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ContentDecodingChannel.java`
#### Snippet
```java

        @Override
        public void reset() throws IOException {
            getDelegate().reset();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `mark()` overrides synchronized method
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ContentDecodingChannel.java`
#### Snippet
```java

        @Override
        public void mark(int readlimit) {
            getDelegateSafely().mark(readlimit);
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `fillInStackTrace()` overrides synchronized method
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/ErrorDecoder.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("UnsynchronizedOverridesSynchronized") // nop
        public Throwable fillInStackTrace() {
            // no-op: stack trace generation is expensive, this type exists
            // to simply associate diagnostic information with a failure.
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `dialogue-test-common/src/main/java/com/palantir/dialogue/CloseRecordingInputStream.java`
#### Snippet
```java

    @Override
    public void reset() throws IOException {
        assertNotClosed();
        delegate.reset();
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `mark()` overrides synchronized method
in `dialogue-test-common/src/main/java/com/palantir/dialogue/CloseRecordingInputStream.java`
#### Snippet
```java

    @Override
    public void mark(int readlimit) {
        assertNotClosed();
        delegate.mark(readlimit);
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `fillInStackTrace()` overrides synchronized method
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("UnsynchronizedOverridesSynchronized") // nop
        public Throwable fillInStackTrace() {
            // no-op: stack trace generation is expensive, this type exists
            // to simply associate diagnostic information with a failure.
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`encodings.size() > 0` can be replaced with '!encodings.isEmpty()'
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/ConjureBodySerDe.java`
#### Snippet
```java
        List<WeightedEncoding> encodings = decorateEncodings(rawEncodings);
        this.encodingsSortedByWeight = sortByWeight(encodings);
        Preconditions.checkArgument(encodings.size() > 0, "At least one Encoding is required");
        this.defaultEncoding = encodings.get(0).encoding();
        this.binaryInputStreamDeserializer = new EncodingDeserializerRegistry<>(
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AbstractSampleServiceClientTest` has no concrete subclass
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractSampleServiceClientTest.java`
#### Snippet
```java

@EnableRuleMigrationSupport
public abstract class AbstractSampleServiceClientTest {

    abstract SampleServiceBlocking createBlockingClient(URL baseUrl, Duration timeout);
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java
        private Exception failure = null;

        ScheduledTask(Callable<T> command) {
            this.repeatDelay = -1;
            this.command = command;
```

### BoundedWildcard
Can generalize to `? extends LimitedChannel`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/SupplierChannel.java`
#### Snippet
```java
    private final Supplier<LimitedChannel> channelSupplier;

    SupplierChannel(Supplier<LimitedChannel> channelSupplier) {
        this.channelSupplier = channelSupplier;
    }
```

### BoundedWildcard
Can generalize to `? super SimulationServer`
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationServer.java`
#### Snippet
```java

        @Override
        public HandlerBuilder1 response(Function<SimulationServer, Response> func) {
            this.responseFunction = func;
            return this;
```

### BoundedWildcard
Can generalize to `? extends Response`
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationServer.java`
#### Snippet
```java

        @Override
        public HandlerBuilder1 response(Function<SimulationServer, Response> func) {
            this.responseFunction = func;
            return this;
```

### BoundedWildcard
Can generalize to `? super HandlerBuilder0`
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationServer.java`
#### Snippet
```java
        }

        Builder handler(Endpoint endpoint, Function<HandlerBuilder0, ServerHandler> configureFunc) {
            return handler(h -> {
                HandlerBuilder0 builder = h.endpoint(endpoint);
```

### BoundedWildcard
Can generalize to `? extends ServerHandler`
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationServer.java`
#### Snippet
```java
        }

        Builder handler(Endpoint endpoint, Function<HandlerBuilder0, ServerHandler> configureFunc) {
            return handler(h -> {
                HandlerBuilder0 builder = h.endpoint(endpoint);
```

### BoundedWildcard
Can generalize to `? super HandlerBuilder0`
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationServer.java`
#### Snippet
```java
        }

        Builder handler(Function<HandlerBuilder0, ServerHandler> configureFunc) {
            handlers = ImmutableList.<ServerHandler>builder()
                    .addAll(handlers)
```

### BoundedWildcard
Can generalize to `? extends ServerHandler`
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationServer.java`
#### Snippet
```java
        }

        Builder handler(Function<HandlerBuilder0, ServerHandler> configureFunc) {
            handlers = ImmutableList.<ServerHandler>builder()
                    .addAll(handlers)
```

### BoundedWildcard
Can generalize to `? extends EndpointChannel`
in `simulation/src/main/java/com/palantir/dialogue/core/RefreshingChannelFactory.java`
#### Snippet
```java
            private final Supplier<EndpointChannel> endpointChannel;

            SupplierEndpointChannel(Supplier<EndpointChannel> endpointChannel) {
                this.endpointChannel = endpointChannel;
            }
```

### BoundedWildcard
Can generalize to `? extends Channel`
in `simulation/src/main/java/com/palantir/dialogue/core/RefreshingChannelFactory.java`
#### Snippet
```java
        private final Supplier<Channel> channelSupplier;

        private RefreshingChannel(Supplier<Channel> channelSupplier) {
            this.channelSupplier = channelSupplier;
        }
```

### BoundedWildcard
Can generalize to `? extends T`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/MemoizingComposingSupplier.java`
#### Snippet
```java
    private volatile V result = null;

    MemoizingComposingSupplier(Supplier<T> delegate, Function<T, V> function) {
        this.delegate = delegate;
        this.function = function;
```

### BoundedWildcard
Can generalize to `? super T`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/MemoizingComposingSupplier.java`
#### Snippet
```java
    private volatile V result = null;

    MemoizingComposingSupplier(Supplier<T> delegate, Function<T, V> function) {
        this.delegate = delegate;
        this.function = function;
```

### BoundedWildcard
Can generalize to `? extends V`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/MemoizingComposingSupplier.java`
#### Snippet
```java
    private volatile V result = null;

    MemoizingComposingSupplier(Supplier<T> delegate, Function<T, V> function) {
        this.delegate = delegate;
        this.function = function;
```

### BoundedWildcard
Can generalize to `? extends XYChart`
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationMetricsReporter.java`
#### Snippet
```java
    }

    private void addSeries(Pattern metricNameRegex, Supplier<XYChart> chartSupplier) {
        Map<MetricName, List<Double>> map = measurements.asMap();
        List<MetricName> columns = map.keySet().stream()
```

### BoundedWildcard
Can generalize to `? super MetricName`
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationMetricsReporter.java`
#### Snippet
```java
    }

    public void onlyRecordMetricsFor(Predicate<MetricName> predicate) {
        this.prefilter = predicate;
    }
```

### BoundedWildcard
Can generalize to `? extends XYChart`
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationMetricsReporter.java`
#### Snippet
```java
    }

    public static void png(String file, List<XYChart> charts) throws IOException {
        int rows = charts.size();
        int cols = 1;
```

### BoundedWildcard
Can generalize to `? extends PinChannel`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/PinUntilErrorNodeSelectionStrategyChannel.java`
#### Snippet
```java
        private final List<PinChannel> channels;

        ConstantNodeList(List<PinChannel> channels) {
            this.channels = channels;
        }
```

### BoundedWildcard
Can generalize to `? extends T`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/PinUntilErrorNodeSelectionStrategyChannel.java`
#### Snippet
```java

    /** Returns a new shuffled list, without mutating the input list (which may be immutable). */
    private static <T> ImmutableList<T> shuffleImmutableList(List<T> sourceList, Random random) {
        List<T> mutableList = new ArrayList<>(sourceList);
        Collections.shuffle(mutableList, random);
```

### BoundedWildcard
Can generalize to `? super String`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/RetryOtherValidatingChannel.java`
#### Snippet
```java

    @VisibleForTesting
    RetryOtherValidatingChannel(Channel delegate, Set<String> hosts, Consumer<String> failureReporter) {
        this.delegate = delegate;
        this.hosts = hosts;
```

### BoundedWildcard
Can generalize to `? extends EndpointChannelFactory`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/StickyEndpointChannels2.java`
#### Snippet
```java
    private final Supplier<EndpointChannelFactory> delegate;

    StickyEndpointChannels2(Supplier<EndpointChannelFactory> endpointChannelFactory) {
        this.delegate = endpointChannelFactory;
    }
```

### BoundedWildcard
Can generalize to `? extends Channel`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/StickyEndpointChannels2.java`
#### Snippet
```java

        StickyEndpointChannels2EndpointFactorySupplier(
                Supplier<Channel> queueOverrideSupplier, EndpointChannelFactory delegate) {
            this.queueOverrideSupplier = queueOverrideSupplier;
            this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? super Request`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/StickyEndpointChannels2.java`
#### Snippet
```java

        private static ListenableFuture<Response> executeWithStickyTarget(
                Consumer<Request> stickyTarget, Request request, EndpointChannel endpointChannel) {
            stickyTarget.accept(request);
            return endpointChannel.execute(request);
```

### BoundedWildcard
Can generalize to `? extends T`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/BalancedScoreTracker.java`
#### Snippet
```java

    /** Returns a new shuffled list, without mutating the input list (which may be immutable). */
    private static <T> List<T> shuffleImmutableList(ImmutableList<T> sourceList, Random random) {
        List<T> mutableList = new ArrayList<>(sourceList);
        Collections.shuffle(mutableList, random);
```

### BoundedWildcard
Can generalize to `? super Endpoint`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ChannelToEndpointChannel.java`
#### Snippet
```java
    private final Map<Object, Channel> cache;

    ChannelToEndpointChannel(Function<Endpoint, Channel> adapter) {
        this.adapter = adapter;
        this.cache = new ConcurrentHashMap<>();
```

### BoundedWildcard
Can generalize to `? extends Channel`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ChannelToEndpointChannel.java`
#### Snippet
```java
    private final Map<Object, Channel> cache;

    ChannelToEndpointChannel(Function<Endpoint, Channel> adapter) {
        this.adapter = adapter;
        this.cache = new ConcurrentHashMap<>();
```

### BoundedWildcard
Can generalize to `? super Response`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/QueuedChannel.java`
#### Snippet
```java
        private final SettableFuture<Response> response;

        ForwardAndSchedule(SettableFuture<Response> response) {
            this.response = response;
        }
```

### BoundedWildcard
Can generalize to `? super Endpoint`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/RetryingChannel.java`
#### Snippet
```java

        private ListenableFuture<Response> incrementFailuresAndMaybeRetry(
                Response response, BiFunction<Endpoint, Response, Throwable> failureSupplier, Meter meter) {
            if (++failures <= maxRetries) {
                response.close();
```

### BoundedWildcard
Can generalize to `? super Response`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/RetryingChannel.java`
#### Snippet
```java

        private ListenableFuture<Response> incrementFailuresAndMaybeRetry(
                Response response, BiFunction<Endpoint, Response, Throwable> failureSupplier, Meter meter) {
            if (++failures <= maxRetries) {
                response.close();
```

### BoundedWildcard
Can generalize to `? extends Throwable`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/RetryingChannel.java`
#### Snippet
```java

        private ListenableFuture<Response> incrementFailuresAndMaybeRetry(
                Response response, BiFunction<Endpoint, Response, Throwable> failureSupplier, Meter meter) {
            if (++failures <= maxRetries) {
                response.close();
```

### BoundedWildcard
Can generalize to `? super T`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/DialogueInternalWeakReducingGauge.java`
#### Snippet
```java
        private final Function<DoubleStream, Number> operator;

        DoubleGaugeProcessor(ToDoubleFunction<T> function, Function<DoubleStream, Number> operator) {
            this.function = function;
            this.operator = operator;
```

### BoundedWildcard
Can generalize to `? super DoubleStream`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/DialogueInternalWeakReducingGauge.java`
#### Snippet
```java
        private final Function<DoubleStream, Number> operator;

        DoubleGaugeProcessor(ToDoubleFunction<T> function, Function<DoubleStream, Number> operator) {
            this.function = function;
            this.operator = operator;
```

### BoundedWildcard
Can generalize to `? extends Number`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/DialogueInternalWeakReducingGauge.java`
#### Snippet
```java
        private final Function<DoubleStream, Number> operator;

        DoubleGaugeProcessor(ToDoubleFunction<T> function, Function<DoubleStream, Number> operator) {
            this.function = function;
            this.operator = operator;
```

### BoundedWildcard
Can generalize to `? super T`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/DialogueInternalWeakReducingGauge.java`
#### Snippet
```java
        private final Function<LongStream, Number> operator;

        LongGaugeProcessor(ToLongFunction<T> function, Function<LongStream, Number> operator) {
            this.function = function;
            this.operator = operator;
```

### BoundedWildcard
Can generalize to `? super LongStream`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/DialogueInternalWeakReducingGauge.java`
#### Snippet
```java
        private final Function<LongStream, Number> operator;

        LongGaugeProcessor(ToLongFunction<T> function, Function<LongStream, Number> operator) {
            this.function = function;
            this.operator = operator;
```

### BoundedWildcard
Can generalize to `? extends Number`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/DialogueInternalWeakReducingGauge.java`
#### Snippet
```java
        private final Function<LongStream, Number> operator;

        LongGaugeProcessor(ToLongFunction<T> function, Function<LongStream, Number> operator) {
            this.function = function;
            this.operator = operator;
```

### BoundedWildcard
Can generalize to `? super Set`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/DialogueInternalWeakReducingGauge.java`
#### Snippet
```java

    @VisibleForTesting
    DialogueInternalWeakReducingGauge(Function<Set<T>, Number> function) {
        this.function = function;
    }
```

### BoundedWildcard
Can generalize to `? extends Number`
in `dialogue-core/src/main/java/com/palantir/dialogue/core/DialogueInternalWeakReducingGauge.java`
#### Snippet
```java

    @VisibleForTesting
    DialogueInternalWeakReducingGauge(Function<Set<T>, Number> function) {
        this.function = function;
    }
```

### BoundedWildcard
Can generalize to `? extends V`
in `dialogue-target/src/main/java/com/palantir/dialogue/MultimapAsMap.java`
#### Snippet
```java
final class MultimapAsMap {

    static <K, V> Map<K, V> of(Multimap<K, V> multimap) {
        return Maps.transformValues(multimap.asMap(), values -> {
            int size = values.size();
```

### BoundedWildcard
Can generalize to `? super V`
in `dialogue-target/src/main/java/com/palantir/dialogue/Attachments.java`
#### Snippet
```java

    @Nullable
    <V> V put(AttachmentKey<V> key, V value) {
        Preconditions.checkNotNull(key, "key");
        Preconditions.checkNotNull(value, "value");
```

### BoundedWildcard
Can generalize to `? extends T`
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/DefaultClients.java`
#### Snippet
```java

    @Override
    public <T> ListenableFuture<T> call(EndpointChannel channel, Request request, Deserializer<T> deserializer) {
        Optional<String> accepts = deserializer.accepts();
        Request outgoingRequest = accepts.isPresent() ? accepting(request, accepts.get()) : request;
```

### BoundedWildcard
Can generalize to `? extends T`
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/TracedEncoding.java`
#### Snippet
```java
        private final ImmutableMap<String, String> tags;

        TracedDeserializer(Deserializer<T> delegate, String operation, ImmutableMap<String, String> tags) {
            this.delegate = delegate;
            this.operation = operation;
```

### BoundedWildcard
Can generalize to `? super T`
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/TracedEncoding.java`
#### Snippet
```java
        private final ImmutableMap<String, String> tags;

        TracedSerializer(Serializer<T> delegate, String operation, ImmutableMap<String, String> tags) {
            this.delegate = delegate;
            this.operation = operation;
```

### BoundedWildcard
Can generalize to `? super Arg`
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/ErrorDecoder.java`
#### Snippet
```java
    }

    private static void recordHeader(String header, Response response, ImmutableList.Builder<Arg<?>> args) {
        response.getFirstHeader(header).ifPresent(server -> args.add(SafeArg.of(header, server)));
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `dialogue-target/src/main/java/com/palantir/dialogue/PathTemplate.java`
#### Snippet
```java

    /** Populates this template with the given named parameters. */
    public void fill(ListMultimap<String, String> parameters, UrlBuilder url) {
        for (Segment segment : segments) {
            if (segment.fixed != null) {
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueFutures.java`
#### Snippet
```java

    public static <T> ListenableFuture<T> catchingAllAsync(
            ListenableFuture<T> input, AsyncFunction<Throwable, T> function) {
        return new DialogueDirectAsyncCatchingFuture<T>(input, function);
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueFutures.java`
#### Snippet
```java

    @CanIgnoreReturnValue
    public static <T> ListenableFuture<T> addDirectCallback(ListenableFuture<T> future, FutureCallback<T> callback) {
        Futures.addCallback(future, callback, safeDirectExecutor());
        return future;
```

### BoundedWildcard
Can generalize to `? super T`
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueFutures.java`
#### Snippet
```java
    }

    public static <T> FutureCallback<T> onSuccess(Consumer<T> onSuccess) {
        return new FutureCallback<T>() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends EndpointChannel`
in `dialogue-clients/src/main/java/com/palantir/dialogue/clients/ReloadingClientFactory.java`
#### Snippet
```java
        private final Supplier<EndpointChannel> supplier;

        SupplierEndpointChannel(Supplier<EndpointChannel> supplier) {
            this.supplier = supplier;
        }
```

### BoundedWildcard
Can generalize to `? extends ManagedHttpClientConnection`
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/InstrumentedManagedHttpConnectionFactory.java`
#### Snippet
```java

    InstrumentedManagedHttpConnectionFactory(
            HttpConnectionFactory<ManagedHttpClientConnection> delegate,
            TaggedMetricRegistry metrics,
            String clientName) {
```

### BoundedWildcard
Can generalize to `? super Response`
in `dialogue-blocking-channels/src/main/java/com/palantir/dialogue/blocking/BlockingChannelAdapter.java`
#### Snippet
```java

            BlockingChannelAdapterTask(
                    BlockingChannel delegate, Endpoint endpoint, Request request, SettableFuture<Response> result) {
                this.result = result;
                this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? extends TypeMirror`
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/ReturnTypesResolver.java`
#### Snippet
```java
            Element element,
            TypeMirror returnType,
            Optional<TypeMirror> maybeListenableFutureInnerType) {
        boolean isReturnResponseType = isResponseType(returnType);
        if (isReturnResponseType
```

### BoundedWildcard
Can generalize to `? super DefaultErrorContext`
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java
    }

    private <T> T processingStep(Function<DefaultErrorContext, T> stepFunction) {
        try (DefaultErrorContext ctx = new DefaultErrorContext(messager)) {
            return stepFunction.apply(ctx);
```

### BoundedWildcard
Can generalize to `? super DefaultErrorContext`
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java
    }

    private void validationStep(Consumer<DefaultErrorContext> validationFunction) {
        processingStep(ctx -> {
            validationFunction.accept(ctx);
```

### BoundedWildcard
Can generalize to `? extends ParameterEncoderType`
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/generate/ServiceImplementationGenerator.java`
#### Snippet
```java
            CodeBlock argName,
            ArgumentType type,
            Optional<ParameterEncoderType> maybeParameterEncoderType) {
        return type.match(new ArgumentType.Cases<>() {
            @Override
```

## RuleId[id=NullableProblems]
### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectTransformationFuture.java`
#### Snippet
```java
    private final SettableFuture<O> output;

    DialogueDirectTransformationFuture(ListenableFuture<I> input, Function<? super I, ? extends O> function) {
        this.input = input;
        this.function = function;
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectTransformationFuture.java`
#### Snippet
```java
    private final SettableFuture<O> output;

    DialogueDirectTransformationFuture(ListenableFuture<I> input, Function<? super I, ? extends O> function) {
        this.input = input;
        this.function = function;
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java

        HttpClientResponse(
                ApacheHttpClientChannels.CloseableClient client,
                CloseableHttpResponse response,
                HttpClientContext context) {
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/ConjureBodySerDe.java`
#### Snippet
```java
        @SuppressWarnings("ForLoopReplaceableByForEach")
        // performance sensitive code avoids iterator allocation
        Encoding.Deserializer<T> getResponseDeserializer(String contentType) {
            for (int i = 0; i < encodings.size(); i++) {
                EncodingDeserializerContainer<T> container = encodings.get(i);
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'time'
in `simulation/src/main/java/com/palantir/dialogue/core/Simulation.java`
#### Snippet
```java
    }

    public void runClockTo(Optional<Duration> time) {
        long currentTime = ticker.read();
        long newNanos = time.orElseGet(() -> Duration.ofDays(1)).toNanos();
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'next'
in `dialogue-core/src/main/java/com/palantir/dialogue/core/PinUntilErrorNodeSelectionStrategyChannel.java`
#### Snippet
```java
        }

        private void receivedErrorStatus(int pin, PinChannel channel, Response response, OptionalInt next) {
            if (next.isPresent()) {
                nextNodeBecauseResponseCode.mark();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'initialChannel'
in `dialogue-core/src/main/java/com/palantir/dialogue/core/PinUntilErrorNodeSelectionStrategyChannel.java`
#### Snippet
```java

    static PinUntilErrorNodeSelectionStrategyChannel of(
            Optional<LimitedChannel> initialChannel,
            DialogueNodeSelectionStrategy strategy,
            List<LimitedChannel> channels,
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'next'
in `dialogue-core/src/main/java/com/palantir/dialogue/core/PinUntilErrorNodeSelectionStrategyChannel.java`
#### Snippet
```java
        }

        private void receivedThrowable(int pin, PinChannel channel, Throwable throwable, OptionalInt next) {
            if (next.isPresent()) {
                nextNodeBecauseThrowable.mark();
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'maybeUriIndex'
in `dialogue-core/src/main/java/com/palantir/dialogue/core/DialogueChannel.java`
#### Snippet
```java
         * Otherwise, metrics from all single-uri channels would be attributed to hostIndex 0, making them misleading.
         */
        public Builder overrideHostIndex(OptionalInt maybeUriIndex) {
            builder.overrideSingleHostIndex(maybeUriIndex);
            return this;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'callsiteStacktrace'
in `dialogue-core/src/main/java/com/palantir/dialogue/core/RetryingChannel.java`
#### Snippet
```java
        private final Endpoint endpoint;
        private final Request request;
        private final Optional<SafeRuntimeException> callsiteStacktrace;
        private final DetachedSpan span = DetachedSpan.start("Dialogue-RetryingChannel");
        private int failures = 0;
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'responseStatus'
in `dialogue-core/src/main/java/com/palantir/dialogue/core/RetryingChannel.java`
#### Snippet
```java
        }

        private void infoLogRetry(long backoffNanoseconds, OptionalInt responseStatus, @Nullable Throwable throwable) {
            if (log.isInfoEnabled()) {
                log.info(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'callsiteStacktrace'
in `dialogue-core/src/main/java/com/palantir/dialogue/core/RetryingChannel.java`
#### Snippet
```java

        private RetryingCallback(
                Endpoint endpoint, Request request, Optional<SafeRuntimeException> callsiteStacktrace) {
            this.endpoint = endpoint;
            this.request = request;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'acceptValue'
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/ConjureBodySerDe.java`
#### Snippet
```java
        private final ImmutableList<EncodingDeserializerContainer<T>> encodings;
        private final ErrorDecoder errorDecoder;
        private final Optional<String> acceptValue;
        private final Supplier<Optional<T>> emptyInstance;
        private final TypeMarker<T> token;
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'overrideHostIndex'
in `dialogue-clients/src/main/java/com/palantir/dialogue/clients/ChannelCache.java`
#### Snippet
```java
            ServiceConfiguration serviceConf,
            @Safe String channelName,
            OptionalInt overrideHostIndex) {
        if (log.isWarnEnabled() && channelCache.estimatedSize() >= MAX_CACHED_CHANNELS * 0.75) {
            log.warn("channelCache nearing capacity - possible bug? {}", SafeArg.of("cache", this));
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'accepts'
in `dialogue-annotations/src/main/java/com/palantir/dialogue/annotations/StdDeserializer.java`
#### Snippet
```java
public abstract class StdDeserializer<T> implements DeserializerFactory<T>, Deserializer<T> {

    private final Optional<String> accepts;

    protected StdDeserializer(String accepts) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'body'
in `dialogue-target/src/main/java/com/palantir/dialogue/Request.java`
#### Snippet
```java
    private final ListMultimap<String, String> queryParams;
    private final ListMultimap<String, String> pathParams;
    private final Optional<RequestBody> body;
    private final RequestAttachments attachments;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'body'
in `dialogue-target/src/main/java/com/palantir/dialogue/Request.java`
#### Snippet
```java
        private ListMultimap<String, String> pathParams = ImmutableListMultimap.of();

        private Optional<RequestBody> body = Optional.empty();

        @Nullable
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value'
in `dialogue-target/src/main/java/com/palantir/dialogue/Request.java`
#### Snippet
```java

        @SuppressWarnings("unchecked")
        public Request.Builder body(Optional<? extends RequestBody> value) {
            body = (Optional<RequestBody>) value;
            return this;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'query3'
in `dialogue-annotations-example/src/main/java/com/palantir/myservice/example/MyService.java`
#### Snippet
```java
            @Request.QueryParam("q2") List<String> query2,
            // Optionals of primitive types are supported for @QueryParam and @Header
            @Request.QueryParam("q3") Optional<String> query3,
            // Alias types are supported for @QueryParam and @Header
            @Request.QueryParam("q4") MyAliasType query4,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'header3'
in `dialogue-annotations-example/src/main/java/com/palantir/myservice/example/MyService.java`
#### Snippet
```java
            @Request.Header("h1") String header1,
            @Request.Header("h2") List<String> header2,
            @Request.Header("h3") Optional<String> header3,
            @Request.Header("h4") MyAliasType header4,
            // Can supply a map to fill in arbitrary query values
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paramEncoderType'
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/ParameterType.java`
#### Snippet
```java
        R header(String headerName, Optional<ParameterEncoderType> paramEncoderType);

        R path(Optional<ParameterEncoderType> paramEncoderType);

        R query(String paramName, Optional<ParameterEncoderType> paramEncoderType);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paramEncoderType'
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/ParameterType.java`
#### Snippet
```java
        R path(Optional<ParameterEncoderType> paramEncoderType);

        R query(String paramName, Optional<ParameterEncoderType> paramEncoderType);

        R queryMap(ParameterEncoderType parameterEncoderType);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paramEncoderType'
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/ParameterType.java`
#### Snippet
```java
        R body(TypeName serializerFactory, String serializerFieldName);

        R header(String headerName, Optional<ParameterEncoderType> paramEncoderType);

        R path(Optional<ParameterEncoderType> paramEncoderType);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'maybeListenableFutureInnerType'
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/ReturnTypesResolver.java`
#### Snippet
```java
            Element element,
            TypeMirror returnType,
            Optional<TypeMirror> maybeListenableFutureInnerType) {
        boolean isReturnResponseType = isResponseType(returnType);
        if (isReturnResponseType
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'uriIndexForInstrumentation'
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java
            URL baseUrl,
            ResponseLeakDetector responseLeakDetector,
            OptionalInt uriIndexForInstrumentation) {
        this.client = client;
        this.baseUrl = BaseUrl.of(baseUrl);
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'contentLength'
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java
        private final RequestBody requestBody;
        private final Header contentType;
        private final OptionalLong contentLength;

        RequestBodyEntity(RequestBody requestBody, OptionalLong contentLength) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'contentLength'
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java
        private final OptionalLong contentLength;

        RequestBodyEntity(RequestBody requestBody, OptionalLong contentLength) {
            this.requestBody = requestBody;
            this.contentType = new BasicHeader(HttpHeaders.CONTENT_TYPE, requestBody.contentType());
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for field 'uriIndexForInstrumentation'
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java
    private final BaseUrl baseUrl;
    private final ResponseLeakDetector responseLeakDetector;
    private final OptionalInt uriIndexForInstrumentation;

    ApacheHttpClientBlockingChannel(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'typeName'
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/ParamTypesResolver.java`
#### Snippet
```java
            EndpointName endpointName,
            VariableElement variableElement,
            Optional<TypeName> typeName,
            EncoderTypeAndMethod encoderTypeAndMethod) {
        return typeName.map(encoderJavaType -> ImmutableParameterEncoderType.builder()
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paramEncoder'
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/generate/ServiceImplementationGenerator.java`
#### Snippet
```java

    private CodeBlock generateQueryParam(
            ArgumentDefinition param, String paramName, Optional<ParameterEncoderType> paramEncoder) {
        return generatePlainSerializer(
                "putQueryParams",
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'paramEncoder'
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/generate/ServiceImplementationGenerator.java`
#### Snippet
```java
    }

    private CodeBlock generatePathParam(ArgumentDefinition param, Optional<ParameterEncoderType> paramEncoder) {
        return generatePlainSerializer(
                "putPathParams",
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'maybeParameterEncoderType'
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/generate/ServiceImplementationGenerator.java`
#### Snippet
```java
            CodeBlock argName,
            ArgumentType type,
            Optional<ParameterEncoderType> maybeParameterEncoderType) {
        return type.match(new ArgumentType.Cases<>() {
            @Override
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'headerParamEncoder'
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/generate/ServiceImplementationGenerator.java`
#### Snippet
```java

    private CodeBlock generateHeaderParam(
            ArgumentDefinition param, String headerName, Optional<ParameterEncoderType> headerParamEncoder) {
        return generatePlainSerializer(
                "putHeaderParams",
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `ReloadingClientFactory` is the same as one of its superclass' names
in `dialogue-clients/src/main/java/com/palantir/dialogue/clients/ReloadingClientFactory.java`
#### Snippet
```java
import org.immutables.value.Value;

final class ReloadingClientFactory implements DialogueClients.ReloadingFactory {
    private final ImmutableReloadingParams params;
    private final ChannelCache cache;
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `contentLength()` is identical to its super method
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ContentEncodingChannel.java`
#### Snippet
```java

        @Override
        public OptionalLong contentLength() {
            // When content is compressed, the content-length is mutated.
            return OptionalLong.empty();
```

### RedundantMethodOverride
Method `repeatable()` is identical to its super method
in `dialogue-target/src/main/java/com/palantir/dialogue/BinaryRequestBody.java`
#### Snippet
```java

            @Override
            public boolean repeatable() {
                // The stream is exhausted as it is read, thus this is not repeatable.
                return false;
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationServer.java`
#### Snippet
```java
            long beforeNanos = simulation.clock().read();
            Optional<ListenableFuture<Response>> maybeResp = handler.maybeExecute(this, endpoint, request);
            if (!maybeResp.isPresent()) {
                continue;
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `dialogue-core/src/main/java/com/palantir/dialogue/core/DeprecationWarningChannel.java`
#### Snippet
```java

            Optional<String> maybeHeader = response.getFirstHeader("deprecation");
            if (!maybeHeader.isPresent()) {
                return;
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `dialogue-core/src/main/java/com/palantir/dialogue/core/HostMetricsChannel.java`
#### Snippet
```java
    static Channel create(Config cf, Channel channel, String uri) {
        Optional<HostEventsSink> hostEventsSink = cf.clientConf().hostEventsSink();
        if (!hostEventsSink.isPresent()) {
            return channel;
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `dialogue-core/src/main/java/com/palantir/dialogue/core/PinUntilErrorNodeSelectionStrategyChannel.java`
#### Snippet
```java
        Optional<ListenableFuture<Response>> maybeResponse =
                StickyAttachments.maybeAddStickyToken(channel, endpoint, request, limitEnforcement);
        if (!maybeResponse.isPresent()) {
            return Optional.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `dialogue-core/src/main/java/com/palantir/dialogue/core/RetryingChannel.java`
#### Snippet
```java
    private static boolean isRetryable(Request request) {
        Optional<RequestBody> maybeBody = request.body();
        return !maybeBody.isPresent() || maybeBody.get().repeatable();
    }

```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `dialogue-core/src/main/java/com/palantir/dialogue/core/NodeSelectionStrategyChannel.java`
#### Snippet
```java
        Optional<ListenableFuture<Response>> maybe =
                StickyChannelHandler.maybeExecute(delegate, endpoint, request, limitEnforcement);
        if (!maybe.isPresent()) {
            return Optional.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `dialogue-core/src/main/java/com/palantir/dialogue/core/NodeSelectionStrategyChannel.java`
#### Snippet
```java
            Optional<DialogueNodeSelectionStrategy> maybeStrategy =
                    strategySelector.updateAndGet(DialogueNodeSelectionStrategy.fromHeader(strategy));
            if (!maybeStrategy.isPresent()) {
                return;
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `dialogue-clients/src/main/java/com/palantir/dialogue/clients/AugmentClientConfig.java`
#### Snippet
```java
        builder.sslSocketFactory(context.getSocketFactory());

        if (!serviceConfig.maxNumRetries().isPresent()) {
            augment.maxNumRetries().ifPresent(builder::maxNumRetries);
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/ConjureBodySerDe.java`
#### Snippet
```java

                Optional<String> contentType = response.getFirstHeader(HttpHeaders.CONTENT_TYPE);
                if (!contentType.isPresent()) {
                    throw new SafeIllegalArgumentException(
                            "Response is missing Content-Type header",
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java
        @Override
        public boolean isChunked() {
            return !contentLength.isPresent();
        }

```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientChannels.java`
#### Snippet
```java
            Preconditions.checkArgument(
                    !conf.fallbackToCommonNameVerification(), "fallback-to-common-name-verification is not supported");
            Preconditions.checkArgument(!conf.meshProxy().isPresent(), "Mesh proxy is not supported");

            Timeout socketTimeout = getSocketTimeout(conf, name);
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `dialogue-core/src/main/java/com/palantir/dialogue/core/BaseUrl.java`
#### Snippet
```java

        @SuppressWarnings("UnnecessaryLambda") // Avoid unnecessary allocation
        private static final com.google.common.base.Supplier<List<String>> MAP_VALUE_FACTORY = () -> new ArrayList<>(1);

        private final String protocol;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `dialogue-target/src/main/java/com/palantir/dialogue/Request.java`
#### Snippet
```java

        @SuppressWarnings("UnnecessaryLambda") // Avoid unnecessary allocation
        private static final com.google.common.base.Supplier<List<String>> MAP_VALUE_FACTORY = () -> new ArrayList<>(1);

        private static final int MUTABLE_HEADERS_MASK = 1;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http` is unnecessary, and can be replaced with an import
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/SafeConnectTimeoutException.java`
#### Snippet
```java
    }

    SafeConnectTimeoutException(org.apache.hc.client5.http.ConnectTimeoutException cause, Arg<?>... args) {
        super(SafeExceptions.renderMessage(MESSAGE, args), cause);
        this.arguments = Collections.unmodifiableList(Arrays.asList(args));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http` is unnecessary, and can be replaced with an import
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/SafeConnectTimeoutException.java`
#### Snippet
```java
    private final List<Arg<?>> arguments;

    SafeConnectTimeoutException(org.apache.hc.client5.http.ConnectTimeoutException cause) {
        super(MESSAGE, cause);
        this.arguments = Collections.emptyList();
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `dialogue-blocking-channels/src/main/java/com/palantir/dialogue/blocking/DefaultCallingThreadExecutor.java`
#### Snippet
```java
        try {
            Runnable toRun;
            while ((toRun = queue.getWork()) != null) {
                try {
                    toRun.run();
```

## RuleId[id=SuspiciousToArrayCall]
### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.String\[\]' found
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationMetricsReporter.java`
#### Snippet
```java
            double[] xAxis = reduceGranularity(
                    granularity, map.get(X_AXIS).stream().mapToDouble(d -> d).toArray());
            String[] nullToolTips = Collections.nCopies(xAxis.length, null).toArray(new String[] {});

            double[] series = reduceGranularity(
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'com.palantir.dialogue.core.Benchmark.NamedClientChannel\[\]' found
in `simulation/src/main/java/com/palantir/dialogue/core/Benchmark.java`
#### Snippet
```java
                        .channel(clientFunction.apply(clientNum))
                        .build())
                .toArray(NamedClientChannel[]::new);
        return endpoints(DEFAULT_ENDPOINT);
    }
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'com.codahale.metrics.Meter\[\]' found
in `dialogue-core/src/main/java/com/palantir/dialogue/core/PinUntilErrorNodeSelectionStrategyChannel.java`
#### Snippet
```java
                                .hostIndex(Integer.toString(index))
                                .build())
                        .toArray(Meter[]::new);
            } else {
                this.successesPerHost = null;
```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.String\[\]' found
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractSampleServiceClientTest.java`
#### Snippet
```java
            .addAll(GCM_CIPHER_SUITES)
            .build()
            .toArray(new String[0]);

    @BeforeEach
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationServer.java`
#### Snippet
```java

            if (log.isDebugEnabled()) {
                DialogueFutures.addDirectCallback(resp, DialogueFutures.onSuccess(result -> {
                    log.debug(
                            "time={} server={} status={} id={}",
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/generate/EndpointsEnumGenerator.java`
#### Snippet
```java
                .addSuperinterface(ClassName.get(Endpoint.class));

        serviceDefinition.endpoints().forEach(endpoint -> {
            enumBuilder.addEnumConstant(
                    endpoint.endpointName().get(),
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/generate/ServiceImplementationGenerator.java`
#### Snippet
```java
            public CodeBlock alias(TypeName _typeName, String parameterSerializerMethodName) {
                return maybeParameterEncoderType.map(this::parameterEncoderType).orElseGet(() -> {
                    return CodeBlock.of(
                            "$L.$L($S, $L.$L($L.get()));",
                            REQUEST,
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/generate/ServiceImplementationGenerator.java`
#### Snippet
```java
            public CodeBlock primitive(TypeName _typeName, String parameterSerializerMethodName) {
                return maybeParameterEncoderType.map(this::parameterEncoderType).orElseGet(() -> {
                    return CodeBlock.of(
                            "$L.$L($S, $L.$L($L));",
                            REQUEST,
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `filer` is accessed in both synchronized and unsynchronized contexts
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java

    private Messager messager;
    private Filer filer;
    private Elements elements;
    private Types types;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `elements` is accessed in both synchronized and unsynchronized contexts
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java
    private Messager messager;
    private Filer filer;
    private Elements elements;
    private Types types;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `types` is accessed in both synchronized and unsynchronized contexts
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java
    private Filer filer;
    private Elements elements;
    private Types types;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `messager` is accessed in both synchronized and unsynchronized contexts
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java
public final class DialogueRequestAnnotationsProcessor extends AbstractProcessor {

    private Messager messager;
    private Filer filer;
    private Elements elements;
```

## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `dialogue-jmh/build.gradle`
#### Snippet
```java
}

def benchmarkFile = "${buildDir}/benchmark_results.out"

task jmh(type: JavaExec) {
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `simulation/src/main/java/com/palantir/dialogue/core/TestCaffeineTicker.java`
#### Snippet
```java

final class TestCaffeineTicker implements Ticker {
    private long nanos = 0;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java
        private final Callable<T> command;
        private boolean isCancelled = false;
        private boolean isDone = false;
        private T futureResult;
        private Exception failure = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java
        private boolean isDone = false;
        private T futureResult;
        private Exception failure = null;

        ScheduledTask(Callable<T> command) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java
        private final long repeatDelay;
        private final Callable<T> command;
        private boolean isCancelled = false;
        private boolean isDone = false;
        private T futureResult;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dialogue-core/src/main/java/com/palantir/dialogue/core/MemoizingComposingSupplier.java`
#### Snippet
```java

    @Nullable
    private volatile V result = null;

    MemoizingComposingSupplier(Supplier<T> delegate, Function<T, V> function) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dialogue-core/src/main/java/com/palantir/dialogue/core/MemoizingComposingSupplier.java`
#### Snippet
```java

    @Nullable
    private volatile T input = null;

    @Nullable
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dialogue-core/src/main/java/com/palantir/dialogue/core/RetryingChannel.java`
#### Snippet
```java
        private final Optional<SafeRuntimeException> callsiteStacktrace;
        private final DetachedSpan span = DetachedSpan.start("Dialogue-RetryingChannel");
        private int failures = 0;

        private RetryingCallback(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dialogue-test-common/src/main/java/com/palantir/dialogue/CloseRecordingInputStream.java`
#### Snippet
```java

    private final InputStream delegate;
    private volatile boolean closeCalled = false;

    public CloseRecordingInputStream(InputStream delegate) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dialogue-target/src/main/java/com/palantir/dialogue/Request.java`
#### Snippet
```java
        private RequestAttachments attachments;

        private int mutableCollectionsBitSet = 0;

        private Builder() {}
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dialogue-test-common/src/main/java/com/palantir/dialogue/TestResponse.java`
#### Snippet
```java

    private boolean closeCalled = false;
    private int code = 0;
    private ListMultimap<String, String> headers = ImmutableListMultimap.of();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dialogue-test-common/src/main/java/com/palantir/dialogue/TestResponse.java`
#### Snippet
```java
    private final ResponseAttachments attachments = ResponseAttachments.create();

    private boolean closeCalled = false;
    private int code = 0;
    private ListMultimap<String, String> headers = ImmutableListMultimap.of();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dialogue-blocking-channels/src/main/java/com/palantir/dialogue/blocking/DefaultCallingThreadExecutor.java`
#### Snippet
```java

    private static final class Queue {
        private boolean poisoned = false;
        private final BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java

        private final Messager messager;
        private volatile boolean errors = false;

        private DefaultErrorContext(Messager messager) {
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `ResponseDiagnostic` does not end with 'Exception'
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/ErrorDecoder.java`
#### Snippet
```java
    }

    private static final class ResponseDiagnostic extends RuntimeException implements SafeLoggable {

        private static final String SAFE_MESSAGE = "Response Diagnostic Information";
```

### ExceptionNameDoesntEndWithException
Exception class name `Diagnostic` does not end with 'Exception'
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java
    }

    private static final class Diagnostic extends RuntimeException implements SafeLoggable {

        private static final String SAFE_MESSAGE = "Client Failure Diagnostic Information";
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java
                () -> {
                    command.run();
                    return null;
                },
                delay,
```

### ReturnNull
Return of `null`
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java
        processingStep(ctx -> {
            validationFunction.accept(ctx);
            return null;
        });
    }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `channel` is redundant
in `simulation/src/main/java/com/palantir/dialogue/core/RefreshingChannelFactory.java`
#### Snippet
```java
            ServiceConfiguration serviceConfiguration = factory.get(service);
            ClientConfiguration clientConfiguration = ClientConfigurations.of(serviceConfiguration);
            Channel channel = channelFactory.create(clientConfiguration);
            return channel;
        });
```

### UnnecessaryLocalVariable
Local variable `localInFlight` is redundant
in `dialogue-core/src/main/java/com/palantir/dialogue/core/CautiousIncreaseAggressiveDecreaseConcurrencyLimiter.java`
#### Snippet
```java
        // reliably optimize out references to final fields due to the potential for reflective
        // modification.
        AtomicInteger localInFlight = inFlight;

        // We don't want to hand out a permit if there are 4 inflight and a limit of 4.1, as this will immediately
```

### UnnecessaryLocalVariable
Local variable `response` is redundant
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ResponseLeakDetector.java`
#### Snippet
```java
    Response wrap(Response input, Endpoint endpoint) {
        LeakDetector detector = new LeakDetector(input, endpoint, clientName, metrics);
        LeakDetectingResponse response = new LeakDetectingResponse(input, detector);
        return response;
    }
```

### UnnecessaryLocalVariable
Local variable `build` is redundant
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/generate/EndpointsEnumGenerator.java`
#### Snippet
```java
        }

        CodeBlock build = pathTemplateBuilder.add(".build()").build();
        return build;
    }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationMetricsReporter.java`
#### Snippet
```java
            double[] xAxis = reduceGranularity(
                    granularity, map.get(X_AXIS).stream().mapToDouble(d -> d).toArray());
            String[] nullToolTips = Collections.nCopies(xAxis.length, null).toArray(new String[] {});

            double[] series = reduceGranularity(
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/ErrorDecoder.java`
#### Snippet
```java

        ResponseDiagnostic(ImmutableList<Arg<?>> args) {
            super(SafeExceptions.renderMessage(SAFE_MESSAGE, args.toArray(new Arg<?>[0])));
            this.args = args;
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dialogue-test-common/src/main/java/com/palantir/dialogue/TestResponse.java`
#### Snippet
```java

    public TestResponse() {
        this(new byte[] {});
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dialogue-test-common/src/main/java/com/palantir/dialogue/TestResponse.java`
#### Snippet
```java

    public static TestResponse withBody(@Nullable String body) {
        return new TestResponse(body == null ? new byte[] {} : body.getBytes(StandardCharsets.UTF_8));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java
                }
            }
            return new ByteArrayInputStream(new byte[0]);
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientChannels.java`
#### Snippet
```java

        Preconditions.checkState(!enabled.isEmpty(), "Zero supported cipher suites");
        return enabled.toArray(new String[0]);
    }

```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `dialogue-core/src/main/java/com/palantir/dialogue/core/MemoizingComposingSupplier.java`
#### Snippet
```java
    public V get() {
        if (!delegate.get().equals(input)) {
            synchronized (this) {
                T newInput = delegate.get();
                if (!newInput.equals(input)) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `dialogue-core/src/main/java/com/palantir/dialogue/core/StickyEndpointChannels2.java`
#### Snippet
```java
            }

            synchronized (this) {
                if (stickyTarget != null) {
                    return executeWithStickyTarget(stickyTarget, request, endpointChannel);
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `dialogue-core/src/main/java/com/palantir/dialogue/core/DialogueChannel.java`
#### Snippet
```java
                channel = RetryingChannel.create(cf, channel, endpoint);
                channel = UserAgentEndpointChannel.create(
                        channel, endpoint, cf.clientConf().userAgent().get());
                channel = DeprecationWarningChannel.create(cf, channel, endpoint);
                channel = new ContentDecodingChannel(channel);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/EndpointDefinitions.java`
#### Snippet
```java
        HttpMethod method = HttpMethod.valueOf(requestAnnotationReflector
                .getFieldMaybe("method", VariableElement.class)
                .get()
                .getSimpleName()
                .toString());
```

### OptionalGetWithoutIsPresent
`Optional::get` without 'isPresent()' check
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/EndpointDefinitions.java`
#### Snippet
```java
                .httpPath(maybeHttpPath.get())
                .returns(maybeReturnType.get())
                .addAllArguments(args.stream().map(Optional::get).collect(Collectors.toList()))
                .build());
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/InstanceVariables.java`
#### Snippet
```java
                            String segment = segments[i];
                            CaseFormat caseFormat =
                                    CaseFormats.estimate(segment).get();
                            if (i == 0) {
                                return caseFormat.to(CaseFormat.LOWER_CAMEL, segment);
```

### OptionalGetWithoutIsPresent
`Optional::get` without 'isPresent()' check
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java
                            .isEmpty(),
                    "Failed validation");
            return maybeEndpoints.stream().map(Optional::get).collect(Collectors.toList());
        });

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/ArgumentTypesResolver.java`
#### Snippet
```java
                            .valueGetMethodName("getAsInt")
                            .innerType(getPrimitiveType(context.getTypeMirror(Integer.class))
                                    .get())
                            .build()));
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/ArgumentTypesResolver.java`
#### Snippet
```java
                            .valueGetMethodName("getAsLong")
                            .innerType(getPrimitiveType(context.getTypeMirror(Long.class))
                                    .get())
                            .build()));
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/ArgumentTypesResolver.java`
#### Snippet
```java
                            .valueGetMethodName("getAsDouble")
                            .innerType(getPrimitiveType(context.getTypeMirror(Double.class))
                                    .get())
                            .build()));
        }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `dialogue-core/src/main/java/com/palantir/dialogue/core/TimingEndpointChannel.java`
#### Snippet
```java

    private static final SafeLogger log = SafeLoggerFactory.get(TimingEndpointChannel.class);
    private static final RateLimiter unknownThrowableLoggingRateLimiter = RateLimiter.create(1);

    private final EndpointChannel delegate;
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `dialogue-core/src/main/java/com/palantir/dialogue/core/TimingEndpointChannel.java`
#### Snippet
```java

    private static final SafeLogger log = SafeLoggerFactory.get(TimingEndpointChannel.class);
    private static final RateLimiter unknownThrowableLoggingRateLimiter = RateLimiter.create(1);

    private final EndpointChannel delegate;
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `dialogue-core/src/main/java/com/palantir/dialogue/core/TimingEndpointChannel.java`
#### Snippet
```java

    private static final SafeLogger log = SafeLoggerFactory.get(TimingEndpointChannel.class);
    private static final RateLimiter unknownThrowableLoggingRateLimiter = RateLimiter.create(1);

    private final EndpointChannel delegate;
```

### UnstableApiUsage
'tryAcquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `dialogue-core/src/main/java/com/palantir/dialogue/core/TimingEndpointChannel.java`
#### Snippet
```java
                    updateTimer(failureTimer);
                } else {
                    if (unknownThrowableLoggingRateLimiter.tryAcquire()) {
                        log.info(
                                "Unknown failure",
```

### UnstableApiUsage
'shutdownAndAwaitTermination(java.util.concurrent.ExecutorService, long, java.util.concurrent.TimeUnit)' is marked unstable with @Beta
in `dialogue-jmh/src/main/java/com/palantir/dialogue/core/EndToEndBenchmark.java`
#### Snippet
```java
    public void after() throws IOException {
        undertow.stop();
        MoreExecutors.shutdownAndAwaitTermination(RetryingChannel.sharedScheduler.get(), 1, TimeUnit.SECONDS);
        MoreExecutors.shutdownAndAwaitTermination(blockingExecutor, 1, TimeUnit.SECONDS);
        closeableApache.close();
```

### UnstableApiUsage
'shutdownAndAwaitTermination(java.util.concurrent.ExecutorService, long, java.util.concurrent.TimeUnit)' is marked unstable with @Beta
in `dialogue-jmh/src/main/java/com/palantir/dialogue/core/EndToEndBenchmark.java`
#### Snippet
```java
        undertow.stop();
        MoreExecutors.shutdownAndAwaitTermination(RetryingChannel.sharedScheduler.get(), 1, TimeUnit.SECONDS);
        MoreExecutors.shutdownAndAwaitTermination(blockingExecutor, 1, TimeUnit.SECONDS);
        closeableApache.close();
    }
```

### UnstableApiUsage
'saturatedMultiply(int, int)' is marked unstable with @Beta
in `dialogue-core/src/main/java/com/palantir/dialogue/core/BalancedNodeSelectionStrategyChannel.java`
#### Snippet
```java
            }
            if (snapshot.getInflight() > INFLIGHT_COMPARISON_THRESHOLD) {
                int newThreshold = IntMath.saturatedMultiply(snapshot.getScore(), UNHEALTHY_SCORE_MULTIPLIER);
                if (log.isDebugEnabled()) {
                    log.debug(
```

### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `dialogue-core/src/main/java/com/palantir/dialogue/core/TracedChannel.java`
#### Snippet
```java
        ImmutableMap<String, String> endpointTags = DialogueTracing.tracingTags(endpoint);
        ImmutableMap<String, String> configTags = DialogueTracing.tracingTags(cf);
        return ImmutableMap.<String, String>builderWithExpectedSize(endpointTags.size() + configTags.size())
                .putAll(endpointTags)
                .putAll(configTags)
```

### UnstableApiUsage
'transform(com.google.common.util.concurrent.ListenableFuture*, com.google.common.base.Function, java.util.concurrent.Executor)' is marked unstable with @Beta*
in `simulation/src/main/java/com/palantir/dialogue/core/Benchmark.java`
#### Snippet
```java
        log.warn("Fired off all requests ({} ms, {}req/sec)", ms, (1000 * requestsStarted[0]) / ms);

        return Futures.transform(
                benchmarkFinished.getFuture(),
                _v -> {
```

### UnstableApiUsage
'stream(java.util.Iterator)' is marked unstable with @Beta
in `simulation/src/main/java/com/palantir/dialogue/core/Benchmark.java`
#### Snippet
```java

    public Benchmark mergeRequestStreams(Stream<ScheduledRequest>... newRequestStreams) {
        this.requestStream = Streams.stream(Iterators.mergeSorted(
                Arrays.stream(newRequestStreams).map(BaseStream::iterator).collect(Collectors.toList()),
                Comparator.comparing(ScheduledRequest::sendTimeNanos)));
```

### UnstableApiUsage
'mergeSorted(java.lang.Iterable\>, java.util.Comparator)' is marked unstable with @Beta
in `simulation/src/main/java/com/palantir/dialogue/core/Benchmark.java`
#### Snippet
```java

    public Benchmark mergeRequestStreams(Stream<ScheduledRequest>... newRequestStreams) {
        this.requestStream = Streams.stream(Iterators.mergeSorted(
                Arrays.stream(newRequestStreams).map(BaseStream::iterator).collect(Collectors.toList()),
                Comparator.comparing(ScheduledRequest::sendTimeNanos)));
```

### UnstableApiUsage
'appendTo(java.lang.StringBuilder, java.lang.Iterable\>)' is marked unstable with @Beta
in `dialogue-core/src/main/java/com/palantir/dialogue/core/BaseUrl.java`
#### Snippet
```java
                result.append('?');
            }
            QUERY_JOINER.appendTo(result, queryParams.entries());
        }

```

### UnstableApiUsage
'tryAcquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `dialogue-core/src/main/java/com/palantir/dialogue/core/RetryOtherValidatingChannel.java`
#### Snippet
```java
        UnsafeArg<Set<String>> unsafeUris = UnsafeArg.of("uris", hosts);
        return retryOtherUri -> {
            if (VALIDATION_FAILED_LOGGING_LIMITER.tryAcquire()) {
                log.info("Invalid Location header value {} {}", UnsafeArg.of("location", retryOtherUri), unsafeUris);
            }
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `dialogue-core/src/main/java/com/palantir/dialogue/core/RetryOtherValidatingChannel.java`
#### Snippet
```java

    private static final SafeLogger log = SafeLoggerFactory.get(RetryOtherValidatingChannel.class);
    private static final RateLimiter VALIDATION_FAILED_LOGGING_LIMITER = RateLimiter.create(1);

    private final Channel delegate;
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `dialogue-core/src/main/java/com/palantir/dialogue/core/RetryOtherValidatingChannel.java`
#### Snippet
```java

    private static final SafeLogger log = SafeLoggerFactory.get(RetryOtherValidatingChannel.class);
    private static final RateLimiter VALIDATION_FAILED_LOGGING_LIMITER = RateLimiter.create(1);

    private final Channel delegate;
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `dialogue-core/src/main/java/com/palantir/dialogue/core/RetryOtherValidatingChannel.java`
#### Snippet
```java

    private static final SafeLogger log = SafeLoggerFactory.get(RetryOtherValidatingChannel.class);
    private static final RateLimiter VALIDATION_FAILED_LOGGING_LIMITER = RateLimiter.create(1);

    private final Channel delegate;
```

### UnstableApiUsage
'tryParse(java.lang.String)' is marked unstable with @Beta
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/ErrorDecoder.java`
#### Snippet
```java
            case 429:
                return response.getFirstHeader(HttpHeaders.RETRY_AFTER)
                        .map(Longs::tryParse)
                        .map(Duration::ofSeconds)
                        .map(QosException::throttle)
```

### UnstableApiUsage
'transformAsync(com.google.common.util.concurrent.ListenableFuture*, com.google.common.util.concurrent.AsyncFunction, java.util.concurrent.Executor)' is marked unstable with @Beta*
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectAsyncTransformationFuture.java`
#### Snippet
```java
/**
 * This {@link ListenableFuture} implementation differs from
 * {@link Futures#transformAsync(ListenableFuture, AsyncFunction, Executor)}
 * in two ways:
 * Firstly, it only allows transformations on the same thread. Second, calling cancel on this future
```

### UnstableApiUsage
'transformAsync(com.google.common.util.concurrent.ListenableFuture*, com.google.common.util.concurrent.AsyncFunction, java.util.concurrent.Executor)' is marked unstable with @Beta*
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectAsyncTransformationFuture.java`
#### Snippet
```java
    DialogueDirectAsyncTransformationFuture(ListenableFuture<I> input, AsyncFunction<? super I, ? extends O> function) {
        this.currentFuture = input;
        this.output = Futures.transformAsync(
                input,
                result -> {
```

### UnstableApiUsage
'transform(com.google.common.util.concurrent.ListenableFuture*, com.google.common.base.Function, java.util.concurrent.Executor)' is marked unstable with @Beta*
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectTransformationFuture.java`
#### Snippet
```java
/**
 * This {@link ListenableFuture} implementation differs from
 * {@link Futures#transform(ListenableFuture, com.google.common.base.Function, Executor)}
 * in two ways:
 * Firstly, it only allows transformations on the same thread. Second, calling cancel on this future
```

### UnstableApiUsage
'catchingAsync(com.google.common.util.concurrent.ListenableFuture, java.lang.Class, com.google.common.util.concurrent.AsyncFunction, java.util.concurrent.Executor)' is marked unstable with @Beta
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectAsyncCatchingFuture.java`
#### Snippet
```java
    DialogueDirectAsyncCatchingFuture(ListenableFuture<T> input, AsyncFunction<? super Throwable, T> function) {
        this.currentFuture = input;
        this.output = Futures.catchingAsync(
                input,
                Throwable.class,
```

### UnstableApiUsage
'catchingAsync(com.google.common.util.concurrent.ListenableFuture, java.lang.Class, com.google.common.util.concurrent.AsyncFunction, java.util.concurrent.Executor)' is marked unstable with @Beta
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectAsyncCatchingFuture.java`
#### Snippet
```java
/**
 * This {@link ListenableFuture} implementation differs from
 * {@link Futures#catchingAsync(ListenableFuture, Class, AsyncFunction, Executor)}
 * in three ways:
 * Firstly, it only allows transformations on the same thread. Second, calling cancel on this future
```

### UnstableApiUsage
'copyOf(java.lang.Iterable\>)' is marked unstable with @Beta
in `dialogue-annotations/src/main/java/com/palantir/dialogue/annotations/MapToMultimapParamEncoder.java`
#### Snippet
```java
    @Override
    public Multimap<String, String> toParamValues(Map<String, String> value) {
        return ImmutableMultimap.copyOf(value.entrySet());
    }
}
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `dialogue-annotations/src/main/java/com/palantir/dialogue/annotations/MultipartRequestBody.java`
#### Snippet
```java
    @Override
    public void close() {
        try (Closer closer = Closer.create()) {
            parts.forEach(part -> closer.register(part.contentBody));
        } catch (IOException | RuntimeException e) {
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `dialogue-annotations/src/main/java/com/palantir/dialogue/annotations/MultipartRequestBody.java`
#### Snippet
```java
    @Override
    public void close() {
        try (Closer closer = Closer.create()) {
            parts.forEach(part -> closer.register(part.contentBody));
        } catch (IOException | RuntimeException e) {
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `dialogue-annotations/src/main/java/com/palantir/dialogue/annotations/MultipartRequestBody.java`
#### Snippet
```java
    @Override
    public void close() {
        try (Closer closer = Closer.create()) {
            parts.forEach(part -> closer.register(part.contentBody));
        } catch (IOException | RuntimeException e) {
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `dialogue-annotations/src/main/java/com/palantir/dialogue/annotations/MultipartRequestBody.java`
#### Snippet
```java
    public void close() {
        try (Closer closer = Closer.create()) {
            parts.forEach(part -> closer.register(part.contentBody));
        } catch (IOException | RuntimeException e) {
            log.warn("Failed to close MultipartRequestBody", e);
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/InactivityValidationAwareConnectionKeepAliveStrategy.java`
#### Snippet
```java
    private final String clientName;
    private final TimeValue defaultValidateAfterInactivity;
    private final RateLimiter loggingRateLimiter = RateLimiter.create(2);
    /**
     * This field is used for observability. It's possible, though unlikely, that the value can get out of sync
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/InactivityValidationAwareConnectionKeepAliveStrategy.java`
#### Snippet
```java
    private final String clientName;
    private final TimeValue defaultValidateAfterInactivity;
    private final RateLimiter loggingRateLimiter = RateLimiter.create(2);
    /**
     * This field is used for observability. It's possible, though unlikely, that the value can get out of sync
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/InactivityValidationAwareConnectionKeepAliveStrategy.java`
#### Snippet
```java
    private final String clientName;
    private final TimeValue defaultValidateAfterInactivity;
    private final RateLimiter loggingRateLimiter = RateLimiter.create(2);
    /**
     * This field is used for observability. It's possible, though unlikely, that the value can get out of sync
```

### UnstableApiUsage
'tryAcquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/InactivityValidationAwareConnectionKeepAliveStrategy.java`
#### Snippet
```java
                // Rate limit in case of a server roll which changes the keep-alive value. Each line is printed
                // if the rate limiter isn't saturated, or if debug logging is enabled.
                if (loggingRateLimiter.tryAcquire() || log.isDebugEnabled()) {
                    log.info(
                            "Updating the validation interval for {} from {} to {}",
```

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/EndpointDefinitions.java`
#### Snippet
```java

    public Optional<EndpointDefinition> tryParseEndpointDefinition(ExecutableElement element) {
        AnnotationReflector requestAnnotationReflector = MoreElements.getAnnotationMirror(element, Request.class)
                .toJavaUtil()
                .map(ImmutableAnnotationReflector::of)
```

### UnstableApiUsage
'getAnnotationMirror(javax.lang.model.element.Element, java.lang.Class)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/EndpointDefinitions.java`
#### Snippet
```java

    public Optional<EndpointDefinition> tryParseEndpointDefinition(ExecutableElement element) {
        AnnotationReflector requestAnnotationReflector = MoreElements.getAnnotationMirror(element, Request.class)
                .toJavaUtil()
                .map(ImmutableAnnotationReflector::of)
```

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/AnnotationReflector.java`
#### Snippet
```java
    @Value.Derived
    default TypeElement annotationTypeElement() {
        return MoreElements.asType(annotationMirror().getAnnotationType().asElement());
    }

```

### UnstableApiUsage
'asType(javax.lang.model.element.Element)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/AnnotationReflector.java`
#### Snippet
```java
    @Value.Derived
    default TypeElement annotationTypeElement() {
        return MoreElements.asType(annotationMirror().getAnnotationType().asElement());
    }

```

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/ReturnTypesResolver.java`
#### Snippet
```java

        boolean hasMustBeClosed =
                MoreElements.getAnnotationMirror(element, MustBeClosed.class).isPresent();

        Optional<TypeMirror> maybeListenableFutureInnerType = getListenableFutureInnerType(returnType);
```

### UnstableApiUsage
'getAnnotationMirror(javax.lang.model.element.Element, java.lang.Class)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/ReturnTypesResolver.java`
#### Snippet
```java

        boolean hasMustBeClosed =
                MoreElements.getAnnotationMirror(element, MustBeClosed.class).isPresent();

        Optional<TypeMirror> maybeListenableFutureInnerType = getListenableFutureInnerType(returnType);
```

### UnstableApiUsage
'exhaust(java.io.InputStream)' is marked unstable with @Beta
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java
            }
            return REMAINING_CONTENT_CONNECTION_DISCARD_THRESHOLD
                    == ByteStreams.exhaust(ByteStreams.limit(stream, REMAINING_CONTENT_CONNECTION_DISCARD_THRESHOLD));
        } catch (Throwable ignored) {
            return false;
```

### UnstableApiUsage
'limit(java.io.InputStream, long)' is marked unstable with @Beta
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java
            }
            return REMAINING_CONTENT_CONNECTION_DISCARD_THRESHOLD
                    == ByteStreams.exhaust(ByteStreams.limit(stream, REMAINING_CONTENT_CONNECTION_DISCARD_THRESHOLD));
        } catch (Throwable ignored) {
            return false;
```

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java
            EndpointDefinitions endpointDefinitions = new EndpointDefinitions(ctx, elements, types);
            List<Optional<EndpointDefinition>> maybeEndpoints = annotatedMethods.stream()
                    .map(MoreElements::asExecutable)
                    .map(endpointDefinitions::tryParseEndpointDefinition)
                    .collect(Collectors.toList());
```

### UnstableApiUsage
'asExecutable(javax.lang.model.element.Element)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java
            EndpointDefinitions endpointDefinitions = new EndpointDefinitions(ctx, elements, types);
            List<Optional<EndpointDefinition>> maybeEndpoints = annotatedMethods.stream()
                    .map(MoreElements::asExecutable)
                    .map(endpointDefinitions::tryParseEndpointDefinition)
                    .collect(Collectors.toList());
```

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java

        ClassName serviceInterface = ClassName.get(
                MoreElements.getPackage(annotatedInterface).getQualifiedName().toString(),
                annotatedInterface.getSimpleName().toString());

```

### UnstableApiUsage
'getPackage(javax.lang.model.element.Element)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java

        ClassName serviceInterface = ClassName.get(
                MoreElements.getPackage(annotatedInterface).getQualifiedName().toString(),
                annotatedInterface.getSimpleName().toString());

```

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java
                .build();

        MoreElements.getAnnotationMirror(annotatedInterface, DialogueService.class)
                .toJavaUtil()
                .map(mirror -> AnnotationMirrors.getAnnotationValue(mirror, "value"))
```

### UnstableApiUsage
'getAnnotationMirror(javax.lang.model.element.Element, java.lang.Class)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java
                .build();

        MoreElements.getAnnotationMirror(annotatedInterface, DialogueService.class)
                .toJavaUtil()
                .map(mirror -> AnnotationMirrors.getAnnotationValue(mirror, "value"))
```

### UnstableApiUsage
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/ParamTypesResolver.java`
#### Snippet
```java
        for (AnnotationMirror annotationMirror : variableElement.getAnnotationMirrors()) {
            TypeElement annotationTypeElement =
                    MoreElements.asType(annotationMirror.getAnnotationType().asElement());
            if (PARAM_ANNOTATIONS.contains(
                    annotationTypeElement.getQualifiedName().toString())) {
```

### UnstableApiUsage
'asType(javax.lang.model.element.Element)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/ParamTypesResolver.java`
#### Snippet
```java
        for (AnnotationMirror annotationMirror : variableElement.getAnnotationMirrors()) {
            TypeElement annotationTypeElement =
                    MoreElements.asType(annotationMirror.getAnnotationType().asElement());
            if (PARAM_ANNOTATIONS.contains(
                    annotationTypeElement.getQualifiedName().toString())) {
```

### UnstableApiUsage
'close()' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientChannels.java`
#### Snippet
```java
            // be additional closeable resources.
            try {
                closer.close();
            } catch (IOException e) {
                log.warn("Failed to close client", e);
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientChannels.java`
#### Snippet
```java
        private final ExecutorService executor;

        private final Closer closer = Closer.create();

        private CloseableClientImpl(
```

### UnstableApiUsage
'com.google.common.io.Closer' is marked unstable with @Beta
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientChannels.java`
#### Snippet
```java
        private final ExecutorService executor;

        private final Closer closer = Closer.create();

        private CloseableClientImpl(
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientChannels.java`
#### Snippet
```java
        private final ExecutorService executor;

        private final Closer closer = Closer.create();

        private CloseableClientImpl(
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientChannels.java`
#### Snippet
```java
            this.executor = executor;
            this.clientConfiguration = clientConfiguration;
            closer.register(() -> connectionEvictorFuture.cancel(true));
            closer.register(apacheClient);
            closer.register(pool);
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientChannels.java`
#### Snippet
```java
            this.clientConfiguration = clientConfiguration;
            closer.register(() -> connectionEvictorFuture.cancel(true));
            closer.register(apacheClient);
            closer.register(pool);
            closer.register(DialogueClientMetrics.of(clientConfiguration.taggedMetricRegistry())
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientChannels.java`
#### Snippet
```java
            closer.register(() -> connectionEvictorFuture.cancel(true));
            closer.register(apacheClient);
            closer.register(pool);
            closer.register(DialogueClientMetrics.of(clientConfiguration.taggedMetricRegistry())
                    .close(clientName)::mark);
```

### UnstableApiUsage
'register(C)' is declared in unstable class 'com.google.common.io.Closer' marked with @Beta
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientChannels.java`
#### Snippet
```java
            closer.register(apacheClient);
            closer.register(pool);
            closer.register(DialogueClientMetrics.of(clientConfiguration.taggedMetricRegistry())
                    .close(clientName)::mark);
        }
```

### UnstableApiUsage
'putAll(java.lang.Iterable\>)' is marked unstable with @Beta
in `dialogue-target/src/main/java/com/palantir/dialogue/Endpoint.java`
#### Snippet
```java
                        ? ImmutableListMultimap.of()
                        : ImmutableListMultimap.<String, String>builder()
                                .putAll(params.entrySet())
                                .build(),
                url);
```

