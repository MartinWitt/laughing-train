# dialogue 
 
# Bad smells
I found 326 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 92 | false |
| BlockingMethodInNonBlockingContext | 72 | false |
| UnstableApiUsage | 57 | false |
| OptionalUsedAsFieldOrParameterType | 30 | false |
| SimplifyOptionalCallChains | 10 | false |
| JavadocLinkAsPlainText | 9 | false |
| AutoCloseableResource | 8 | false |
| Deprecation | 7 | false |
| OptionalGetWithoutIsPresent | 7 | false |
| OptionalIsPresent | 4 | false |
| SuspiciousToArrayCall | 4 | false |
| FieldMayBeFinal | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| DeprecatedIsStillUsed | 3 | false |
| UNCHECKED_WARNING | 2 | false |
| DataFlowIssue | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| SuspiciousNameCombination | 1 | false |
| UnnecessarySemicolon | 1 | false |
| EmptyStatementBody | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| CommentedOutCode | 1 | false |
| DuplicatedCode | 1 | false |
| DanglingJavadoc | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| RedundantMethodOverride | 1 | false |
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

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `dialogue-clients/src/main/java/com/palantir/dialogue/clients/AugmentClientConfig.java`
#### Snippet
```java

            SSLContext sslContext;
            if (securityProvider.isPresent()) {
                sslContext = SslSocketFactories.createSslContext(trustManagers, keyManagers, securityProvider.get());
            } else {
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'
in `dialogue-target/src/main/java/com/palantir/dialogue/Attachments.java`
#### Snippet
```java
        Preconditions.checkNotNull(value, "value");
        key.checkIsInstance(value);
        return (V) attachments.put(key, value);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'
in `dialogue-target/src/main/java/com/palantir/dialogue/Attachments.java`
#### Snippet
```java
    <V> V getOrDefault(AttachmentKey<V> key, @Nullable V defaultValue) {
        Preconditions.checkNotNull(key, "key");
        return (V) attachments.getOrDefault(key, defaultValue);
    }

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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/DialogueRequestAnnotationsProcessor.java`
#### Snippet
```java
                        Goethe.formatAndEmit(javaFile, filer);
                    } catch (GoetheException e) {
                        if (e.getCause() instanceof FilerException) {
                            // Happens when same file is written twice.
                            // This indicates additional data was discovered in a subsequent processing round.
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
Deprecated member 'getNonReloading' is still used
in `dialogue-clients/src/main/java/com/palantir/dialogue/clients/DialogueClients.java`
#### Snippet
```java
         */
        @Deprecated
        <T> T getNonReloading(Class<T> clientInterface, ClientConfiguration clientConfiguration);
    }

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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractProxyConfigTest.java`
#### Snippet
```java
        return new ProxySelector() {
            @Override
            public List<Proxy> select(URI _uri) {
                InetSocketAddress addr = InetSocketAddress.createUnresolved(host, port);
                return ImmutableList.of(new Proxy(Proxy.Type.HTTP, addr));
            }

            @Override
            public void connectFailed(URI _uri, SocketAddress _sa, IOException _ioe) {}
        };
```

## RuleId[id=Deprecation]
### Deprecation
'setValidateAfterInactivity(org.apache.hc.core5.util.TimeValue)' is deprecated
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/InactivityValidationAwareConnectionKeepAliveStrategy.java`
#### Snippet
```java
            // Simple volatile write, no need to protect this in the getAndSet check. The getAndSet may race this call
            // so it's best to completely decouple the two.
            connectionManager.setValidateAfterInactivity(newInterval);
        }
    }
```

### Deprecation
'getValidateAfterInactivity()' is deprecated
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/InactivityValidationAwareConnectionKeepAliveStrategy.java`
#### Snippet
```java
        // Store the initial inactivity interval to restore if responses re received without
        // keep-alive headers.
        this.defaultValidateAfterInactivity = connectionManager.getValidateAfterInactivity();
        this.currentValidationInterval = new AtomicReference<>(defaultValidateAfterInactivity);
    }
```

### Deprecation
'setValidateAfterInactivity(org.apache.hc.core5.util.TimeValue)' is deprecated
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/InactivityValidationAwareConnectionKeepAliveStrategy.java`
#### Snippet
```java
 * An {@link ConnectionKeepAliveStrategy} implementation based on the
 * {@link org.apache.hc.client5.http.impl.DefaultConnectionKeepAliveStrategy} which
 * updates {@link PoolingHttpClientConnectionManager#setValidateAfterInactivity(TimeValue)}
 * based on server {@code Keep-Alive} response headers to avoid unnecessary checks when
 * the server advertises a persistent connection timeout.
```

### Deprecation
'setValidateAfterInactivity(org.apache.hc.core5.util.TimeValue)' is deprecated
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientChannels.java`
#### Snippet
```java
                    .setSocksProxyAddress(socksProxyAddress)
                    .build());
            connectionManager.setValidateAfterInactivity(CONNECTION_INACTIVITY_CHECK);
            connectionManager.setMaxTotal(Integer.MAX_VALUE);
            connectionManager.setDefaultMaxPerRoute(Integer.MAX_VALUE);
```

### Deprecation
'setConnectTimeout(org.apache.hc.core5.util.Timeout)' is deprecated
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientChannels.java`
#### Snippet
```java
            HttpClientBuilder builder = HttpClients.custom()
                    .setDefaultRequestConfig(RequestConfig.custom()
                            .setConnectTimeout(connectTimeout)
                            // Don't allow clients to block forever waiting on a connection to become available
                            .setConnectionRequestTimeout(connectTimeout)
```

### Deprecation
'execute(org.apache.hc.core5.http.ClassicHttpRequest, org.apache.hc.core5.http.protocol.HttpContext)' is deprecated
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java
        try {
            HttpClientContext context = HttpClientContext.create();
            CloseableHttpResponse httpClientResponse = client.apacheClient().execute(builder.build(), context);
            // Defensively ensure that resources are closed if failures occur within this block,
            // for example HttpClientResponse allocation may throw an OutOfMemoryError.
```

### Deprecation
'getCause()' is deprecated
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractSampleServiceClientTest.java`
#### Snippet
```java
        assertThatThrownBy(() -> blockingClient.objectToObject(HEADER, PATH, QUERY, BODY))
                .isInstanceOf(RuntimeException.class)
                .getCause()
                .isInstanceOf(ConnectException.class)
                .hasMessageMatching(".*((Connection refused)|(Failed to connect)).*");
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `dialogue-core/src/main/java/com/palantir/dialogue/core/PinUntilErrorNodeSelectionStrategyChannel.java`
#### Snippet
```java
                .collect(ImmutableList.toImmutableList());

        /**
         * The *initial* list is shuffled to ensure that clients across the fleet don't all traverse the in the
         * same order.  If they did, then restarting one upstream node n would shift all its traffic (from all
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'ImmutableList.indexOf()'
in `dialogue-core/src/main/java/com/palantir/dialogue/core/PinUntilErrorNodeSelectionStrategyChannel.java`
#### Snippet
```java
        int initialPin = initialChannel
                // indexOf relies on reference equality since we expect LimitedChannels to be reused across updates
                .map(limitedChannel -> Math.max(0, initialShuffle.indexOf(limitedChannel)))
                .orElse(0);

```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-blocking-channels/src/main/java/com/palantir/dialogue/blocking/BlockingChannelAdapter.java`
#### Snippet
```java

                        @Override
                        public void onFailure(Throwable throwable) {
                            if (throwable instanceof CancellationException) {
                                future.cancel(true);
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-core/src/main/java/com/palantir/dialogue/core/TimingEndpointChannel.java`
#### Snippet
```java

            @Override
            public void onFailure(Throwable throwable) {
                if (throwable instanceof IOException) {
                    updateTimer(failureTimer);
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-core/src/main/java/com/palantir/dialogue/core/TracedChannel.java`
#### Snippet
```java

                @Override
                public void onFailure(Throwable throwable) {
                    span.complete(throwableTranslator, throwable);
                }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-core/src/main/java/com/palantir/dialogue/core/PinUntilErrorNodeSelectionStrategyChannel.java`
#### Snippet
```java

            @Override
            public void onFailure(Throwable throwable) {
                OptionalInt next = incrementHostIfNecessary(pin);
                instrumentation.receivedThrowable(pin, channel, throwable, next);
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

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java

        @Override
        public int read(byte[] buffer, int off, int len) throws IOException {
            checkOpen();
            return super.read(buffer, off, len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java

        @Override
        public int read(byte[] buffer) throws IOException {
            checkOpen();
            return super.read(buffer);
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-core/src/main/java/com/palantir/dialogue/core/HostMetricsChannel.java`
#### Snippet
```java

        @Override
        public void onFailure(Throwable throwable) {
            if (throwable instanceof IOException) {
                hostEventCallback.recordIoException();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ContentDecodingChannel.java`
#### Snippet
```java

        @Override
        public int read(byte[] buffer, int off, int len) throws IOException {
            return getDelegate().read(buffer, off, len);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ContentDecodingChannel.java`
#### Snippet
```java

        @Override
        public int read(byte[] buffer) throws IOException {
            return getDelegate().read(buffer);
        }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-core/src/main/java/com/palantir/dialogue/core/TraceEnrichingChannel.java`
#### Snippet
```java

                @Override
                public void onFailure(Throwable throwable) {
                    span.complete(throwableTranslator, throwable);
                }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-core/src/main/java/com/palantir/dialogue/core/CautiousIncreaseAggressiveDecreaseConcurrencyLimiter.java`
#### Snippet
```java

        @Override
        public void onFailure(Throwable throwable) {
            behavior.onFailure(throwable, this);
        }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-core/src/main/java/com/palantir/dialogue/core/StickyEndpointChannels2.java`
#### Snippet
```java

                        @Override
                        public void onFailure(Throwable throwable) {
                            failed();
                            result.setException(throwable);
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-core/src/main/java/com/palantir/dialogue/core/StickyEndpointChannels2.java`
#### Snippet
```java

                                @Override
                                public void onFailure(Throwable throwable) {
                                    result.setException(throwable);
                                }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-core/src/main/java/com/palantir/dialogue/core/RetryingChannel.java`
#### Snippet
```java

                            @Override
                            public void onFailure(Throwable throwable) {
                                if (delegateResult.isCancelled()) {
                                    responseFuture.cancel(false);
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-core/src/main/java/com/palantir/dialogue/core/RetryOtherValidatingChannel.java`
#### Snippet
```java

            @Override
            public void onFailure(Throwable _throwable) {}
        };
        this.failureReporter = failureReporter;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/SafeDirectExecutor.java`
#### Snippet
```java

    @Override
    public void execute(Runnable command) {
        try {
            command.run();
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueFutures.java`
#### Snippet
```java

            @Override
            public void onFailure(Throwable _throwable) {}
        };
    }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-core/src/main/java/com/palantir/dialogue/core/NodeSelectionStrategyChannel.java`
#### Snippet
```java

        @Override
        public void onFailure(Throwable _unused) {}

        @SuppressWarnings("NullAway")
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectAsyncTransformationFuture.java`
#### Snippet
```java

    @Override
    public void addListener(Runnable listener, Executor executor) {
        output.addListener(listener, executor);
    }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectAsyncTransformationFuture.java`
#### Snippet
```java

    @Override
    public void addListener(Runnable listener, Executor executor) {
        output.addListener(listener, executor);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectAsyncTransformationFuture.java`
#### Snippet
```java

    @Override
    public O get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return output.get(timeout, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectTransformationFuture.java`
#### Snippet
```java

    @Override
    public void onFailure(Throwable throwable) {
        ListenableFuture<I> inputSnapshot = input;
        if (inputSnapshot != null && inputSnapshot.isCancelled()) {
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectTransformationFuture.java`
#### Snippet
```java

    @Override
    public void addListener(Runnable listener, Executor executor) {
        output.addListener(listener, executor);
    }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectTransformationFuture.java`
#### Snippet
```java

    @Override
    public void addListener(Runnable listener, Executor executor) {
        output.addListener(listener, executor);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectTransformationFuture.java`
#### Snippet
```java

    @Override
    public O get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return output.get(timeout, unit);
    }
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
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectTransformationFuture.java`
#### Snippet
```java
    private final SettableFuture<O> output;

    DialogueDirectTransformationFuture(ListenableFuture<I> input, Function<? super I, ? extends O> function) {
        this.input = input;
        this.function = function;
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-core/src/main/java/com/palantir/dialogue/core/BalancedScoreTracker.java`
#### Snippet
```java

        @Override
        public void onFailure(Throwable throwable) {
            inflight.decrementAndGet();
            recentFailuresReservoir.update(FAILURE_WEIGHT);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectAsyncCatchingFuture.java`
#### Snippet
```java

    @Override
    public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return output.get(timeout, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectAsyncCatchingFuture.java`
#### Snippet
```java

    @Override
    public void addListener(Runnable listener, Executor executor) {
        output.addListener(listener, executor);
    }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectAsyncCatchingFuture.java`
#### Snippet
```java

    @Override
    public void addListener(Runnable listener, Executor executor) {
        output.addListener(listener, executor);
    }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-core/src/main/java/com/palantir/dialogue/core/QueuedChannel.java`
#### Snippet
```java

        @Override
        public void onFailure(Throwable throwable) {
            if (!response.setException(throwable)) {
                if (throwable instanceof CancellationException) {
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/DefaultClients.java`
#### Snippet
```java

        @Override
        public void onFailure(Throwable throwable) {
            log.info("Canceled call failed", throwable);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dialogue-test-common/src/main/java/com/palantir/dialogue/CloseRecordingInputStream.java`
#### Snippet
```java

    @Override
    public int read(byte[] bytes) throws IOException {
        assertNotClosed();
        return delegate.read(bytes);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dialogue-test-common/src/main/java/com/palantir/dialogue/CloseRecordingInputStream.java`
#### Snippet
```java

    @Override
    public int read(byte[] bytes, int off, int len) throws IOException {
        assertNotClosed();
        return delegate.read(bytes, off, len);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
            throws InterruptedException {
        return delegate.invokeAll(tasks, timeout, unit);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
            throws InterruptedException {
        return delegate.invokeAll(tasks, timeout, unit);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
            throws InterruptedException {
        return delegate.invokeAll(tasks, timeout, unit);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public ListenableScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
        return schedule(
                () -> {
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public ListenableScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
        return schedule(
                () -> {
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public ListenableScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
        return schedule(
                () -> {
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> ListenableFuture<T> submit(Runnable task, T result) {
        return delegate.submit(task, result);
    }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> ListenableFuture<T> submit(Runnable task, T result) {
        return delegate.submit(task, result);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <V> ListenableScheduledFuture<V> schedule(Callable<V> command, long delay, TimeUnit unit) {
        deterministicExecutor.tick(0, TimeUnit.NANOSECONDS);
        long scheduleTime = ticker.read();
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <V> ListenableScheduledFuture<V> schedule(Callable<V> command, long delay, TimeUnit unit) {
        deterministicExecutor.tick(0, TimeUnit.NANOSECONDS);
        long scheduleTime = ticker.read();
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return delegate.invokeAll(tasks);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return delegate.invokeAll(tasks);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> ListenableFuture<T> submit(Callable<T> task) {
        return delegate.submit(task);
    }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> ListenableFuture<T> submit(Callable<T> task) {
        return delegate.submit(task);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
        return delegate.invokeAny(tasks);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
        return delegate.invokeAny(tasks);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return delegate.awaitTermination(timeout, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public void execute(Runnable command) {
        delegate.execute(command);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException {
        return delegate.invokeAny(tasks, timeout, unit);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException {
        return delegate.invokeAny(tasks, timeout, unit);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public ListenableFuture<?> submit(Runnable task) {
        return delegate.submit(task);
    }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public ListenableFuture<?> submit(Runnable task) {
        return delegate.submit(task);
    }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java
    @Override
    public ListenableScheduledFuture<?> scheduleAtFixedRate(
            Runnable _command, long _initialDelay, long _period, TimeUnit _unit) {
        throw new UnsupportedOperationException("not implemented");
    }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java
    @Override
    public ListenableScheduledFuture<?> scheduleAtFixedRate(
            Runnable _command, long _initialDelay, long _period, TimeUnit _unit) {
        throw new UnsupportedOperationException("not implemented");
    }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java
    @Override
    public ListenableScheduledFuture<?> scheduleWithFixedDelay(
            Runnable _command, long _initialDelay, long _delay, TimeUnit _unit) {
        throw new UnsupportedOperationException("not implemented");
    }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java
    @Override
    public ListenableScheduledFuture<?> scheduleWithFixedDelay(
            Runnable _command, long _initialDelay, long _delay, TimeUnit _unit) {
        throw new UnsupportedOperationException("not implemented");
    }
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `simulation/src/main/java/com/palantir/dialogue/core/TaggedMetrics.java`
#### Snippet
```java

    @Override
    protected Supplier<Timer> timerSupplier() {
        return () -> new Timer(createReservoir(), clock);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `simulation/src/main/java/com/palantir/dialogue/core/TaggedMetrics.java`
#### Snippet
```java

    @Override
    protected Supplier<Meter> meterSupplier() {
        return () -> new Meter(clock);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public Future<?> submit(Runnable command) {
        return submit(command, null);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public Future<?> submit(Runnable command) {
        return submit(command, null);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit) {
        ScheduledTask<V> task = new ScheduledTask<V>(callable);
        deltaQueue.add(toTicks(delay, unit), task);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit) {
        ScheduledTask<V> task = new ScheduledTask<V>(callable);
        deltaQueue.add(toTicks(delay, unit), task);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit) {
        ScheduledTask<V> task = new ScheduledTask<V>(callable);
        deltaQueue.add(toTicks(delay, unit), task);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> Future<T> submit(Callable<T> callable) {
        return schedule(callable, 0, TimeUnit.SECONDS);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> Future<T> submit(Callable<T> callable) {
        return schedule(callable, 0, TimeUnit.SECONDS);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

        @Override
        public int compareTo(Delayed _object) {
            throw new UnsupportedOperationException("not supported");
        }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
        ScheduledTask<Object> task = new ScheduledTask<>(toTicks(delay, unit), command);
        deltaQueue.add(toTicks(initialDelay, unit), task);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
        ScheduledTask<Object> task = new ScheduledTask<>(toTicks(delay, unit), command);
        deltaQueue.add(toTicks(initialDelay, unit), task);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
        ScheduledTask<Object> task = new ScheduledTask<>(toTicks(delay, unit), command);
        deltaQueue.add(toTicks(initialDelay, unit), task);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
        return scheduleWithFixedDelay(command, initialDelay, period, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
        return scheduleWithFixedDelay(command, initialDelay, period, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
        return scheduleWithFixedDelay(command, initialDelay, period, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

        @Override
        public T get(long _timeout, TimeUnit _unit) throws InterruptedException, ExecutionException, TimeoutException {
            return get();
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> _tasks) {
        throw blockingOperationsNotSupported();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("FutureReturnValueIgnored")
    public void execute(Runnable command) {
        schedule(command, 0, TimeUnit.SECONDS);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> _tasks, long _timeout, TimeUnit _unit) {
        throw blockingOperationsNotSupported();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> _tasks, long _timeout, TimeUnit _unit) {
        throw blockingOperationsNotSupported();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
        ScheduledTask<Void> task = new ScheduledTask<>(command);
        deltaQueue.add(toTicks(delay, unit), task);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
        ScheduledTask<Void> task = new ScheduledTask<>(command);
        deltaQueue.add(toTicks(delay, unit), task);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
        ScheduledTask<Void> task = new ScheduledTask<>(command);
        deltaQueue.add(toTicks(delay, unit), task);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> _tasks, long _timeout, TimeUnit _unit)
            throws InterruptedException {
        throw blockingOperationsNotSupported();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> _tasks, long _timeout, TimeUnit _unit)
            throws InterruptedException {
        throw blockingOperationsNotSupported();
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> Future<T> submit(Runnable command, T result) {
        return submit(new CallableRunnableAdapter<T>(command, result));
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> Future<T> submit(Runnable command, T result) {
        return submit(new CallableRunnableAdapter<T>(command, result));
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public boolean awaitTermination(long _timeout, TimeUnit _unit) {
        throw blockingOperationsNotSupported();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> _tasks) {
        throw blockingOperationsNotSupported();
    }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `dialogue-core/src/main/java/com/palantir/dialogue/core/BaseUrl.java`
#### Snippet
```java
    }

    /** Encodes URL components per https://tools.ietf.org/html/rfc3986 . */
    @VisibleForTesting
    static class UrlEncoder {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ContentDecodingChannel.java`
#### Snippet
```java
 * sets a specific <code>Accept-Encoding</code> header to avoid potentially using an unexpected
 * type based on client defaults (for example apache httpclient requests gzip and deflate by default).
 * https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.3
 * https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ContentDecodingChannel.java`
#### Snippet
```java
 * type based on client defaults (for example apache httpclient requests gzip and deflate by default).
 * https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.3
 * https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11
 */
final class ContentDecodingChannel implements EndpointChannel {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `dialogue-core/src/main/java/com/palantir/dialogue/core/RetryingChannel.java`
#### Snippet
```java

    /**
     * See https://tools.ietf.org/html/rfc7231#section-4.2.
     */
    private static boolean safeToRetry(HttpMethod httpMethod) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `dialogue-target/src/main/java/com/palantir/dialogue/Response.java`
#### Snippet
```java

    /** The HTTP headers for this response. Headers names are compared in a case-insensitive fashion as per
     * https://tools.ietf.org/html/rfc7540#section-8.1.2. */
    ListMultimap<String, String> headers();

```

### JavadocLinkAsPlainText
Link specified as plain text
in `dialogue-target/src/main/java/com/palantir/dialogue/Request.java`
#### Snippet
```java
     * The HTTP headers for this request, encoded as a map of {@code header-name: header-value}.
     * Headers names are compared in a case-insensitive fashion as per
     * https://tools.ietf.org/html/rfc7540#section-8.1.2.
     */
    public ListMultimap<String, String> headerParams() {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java

/**
 * Modified from https://github.com/jmock-developers/jmock-library/blob/498d09a015205f1370bf3855d59db033cf541c3c/jmock/src/main/java/org/jmock/lib/concurrent/DeterministicScheduler.java
 * Modification is proposed upstream:
 * https://github.com/jmock-developers/jmock-library/issues/172
```

### JavadocLinkAsPlainText
Link specified as plain text
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java
 * Modified from https://github.com/jmock-developers/jmock-library/blob/498d09a015205f1370bf3855d59db033cf541c3c/jmock/src/main/java/org/jmock/lib/concurrent/DeterministicScheduler.java
 * Modification is proposed upstream:
 * https://github.com/jmock-developers/jmock-library/issues/172
 * https://github.com/jmock-developers/jmock-library/pull/173
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `simulation/src/main/java/com/palantir/dialogue/core/NanosecondPrecisionDeterministicScheduler.java`
#### Snippet
```java
 * Modification is proposed upstream:
 * https://github.com/jmock-developers/jmock-library/issues/172
 * https://github.com/jmock-developers/jmock-library/pull/173
 *
 * Copyright (c) 2000-2017, jMock.org
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-annotations/src/main/java/com/palantir/dialogue/annotations/PathContentBody.java`
#### Snippet
```java
    @Override
    public void writeTo(OutputStream output) throws IOException {
        Files.copy(filePath, output);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-annotations/src/main/java/com/palantir/dialogue/annotations/InputStreamContentBody.java`
#### Snippet
```java
    public void close() {
        try {
            inputStream.close();
        } catch (IOException e) {
            log.warn("Failed to close InputStreamContentBody {}", UnsafeArg.of("body", inputStream), e);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-annotations/src/main/java/com/palantir/dialogue/annotations/FormUrlEncodedRequestBody.java`
#### Snippet
```java
                first = false;
            } else {
                output.write('&');
            }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-annotations/src/main/java/com/palantir/dialogue/annotations/FormUrlEncodedRequestBody.java`
#### Snippet
```java

            checkArgument(entry.getKey() != null, "key must not be null");
            String key = URLEncoder.encode(entry.getKey(), UTF_8);
            output.write(key.getBytes(StandardCharsets.UTF_8));
            output.write('=');
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-annotations/src/main/java/com/palantir/dialogue/annotations/FormUrlEncodedRequestBody.java`
#### Snippet
```java
            checkArgument(entry.getKey() != null, "key must not be null");
            String key = URLEncoder.encode(entry.getKey(), UTF_8);
            output.write(key.getBytes(StandardCharsets.UTF_8));
            output.write('=');

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-annotations/src/main/java/com/palantir/dialogue/annotations/FormUrlEncodedRequestBody.java`
#### Snippet
```java
            String key = URLEncoder.encode(entry.getKey(), UTF_8);
            output.write(key.getBytes(StandardCharsets.UTF_8));
            output.write('=');

            checkArgument(entry.getValue() != null, "value must not be null", UnsafeArg.of("key", entry.getKey()));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-annotations/src/main/java/com/palantir/dialogue/annotations/FormUrlEncodedRequestBody.java`
#### Snippet
```java

            checkArgument(entry.getValue() != null, "value must not be null", UnsafeArg.of("key", entry.getKey()));
            String value = URLEncoder.encode(entry.getValue(), UTF_8);
            output.write(value.getBytes(StandardCharsets.UTF_8));
        }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-annotations/src/main/java/com/palantir/dialogue/annotations/FormUrlEncodedRequestBody.java`
#### Snippet
```java
            checkArgument(entry.getValue() != null, "value must not be null", UnsafeArg.of("key", entry.getKey()));
            String value = URLEncoder.encode(entry.getValue(), UTF_8);
            output.write(value.getBytes(StandardCharsets.UTF_8));
        }
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-blocking-channels/src/main/java/com/palantir/dialogue/blocking/DefaultCallingThreadExecutor.java`
#### Snippet
```java
        public Runnable getWork() throws InterruptedException {
            if (!isPoisoned()) {
                return queue.take();
            } else {
                return queue.poll();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ResponseLeakDetector.java`
#### Snippet
```java
                leakDetectingResponse.disarm();
            } finally {
                super.close();
            }
        }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-clients/src/main/java/com/palantir/dialogue/clients/ChannelCache.java`
#### Snippet
```java
        try {
            if (prev != null) {
                prev.client().close(); // maybe this is unnecessary?
            }
        } catch (IOException e) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientChannels.java`
#### Snippet
```java
        @Override
        public void close() throws IOException {
            delegate.close();
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java
        public long skip(long num) throws IOException {
            checkOpen();
            return super.skip(num);
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java
            // Fast check: The stream has been fully exhausted in the expected case,
            // no need to create buffers for drainage unless we know there's data to drain.
            if (stream.read() == -1) {
                return false;
            }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java
            while (remaining > 0) {
                int toWrite = Math.min(remaining, BLOCK_SIZE);
                out.write(buffer, currentOffset, toWrite);
                currentOffset += toWrite;
                remaining -= toWrite;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java
        public int read(byte[] buffer, int off, int len) throws IOException {
            checkOpen();
            return super.read(buffer, off, len);
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java
        @Override
        public void write(int value) throws IOException {
            out.write(value);
        }
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java
        public int read() throws IOException {
            checkOpen();
            return super.read();
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java
        public int read(byte[] buffer) throws IOException {
            checkOpen();
            return super.read(buffer);
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ContentDecodingChannel.java`
#### Snippet
```java
        @Override
        public int available() throws IOException {
            return getDelegate().available();
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ContentDecodingChannel.java`
#### Snippet
```java
        @Override
        public void reset() throws IOException {
            getDelegate().reset();
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ContentDecodingChannel.java`
#### Snippet
```java
        public void close() {
            try {
                body.close();
            } catch (IOException e) {
                log.warn("Failed to close encoded body", e);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ContentDecodingChannel.java`
#### Snippet
```java
        @Override
        public int read() throws IOException {
            return getDelegate().read();
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ContentDecodingChannel.java`
#### Snippet
```java
            // No need to create the expensive delegate instance to immediately close it.
            if (delegate == null) {
                original.close();
            } else {
                delegate.close();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ContentDecodingChannel.java`
#### Snippet
```java
                original.close();
            } else {
                delegate.close();
            }
        }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ContentDecodingChannel.java`
#### Snippet
```java
        @Override
        public int read(byte[] buffer, int off, int len) throws IOException {
            return getDelegate().read(buffer, off, len);
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ContentDecodingChannel.java`
#### Snippet
```java
        @Override
        public int read(byte[] buffer) throws IOException {
            return getDelegate().read(buffer);
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ContentDecodingChannel.java`
#### Snippet
```java
        @Override
        public long skip(long requested) throws IOException {
            return getDelegate().skip(requested);
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectAsyncTransformationFuture.java`
#### Snippet
```java
    @Override
    public O get() throws InterruptedException, ExecutionException {
        return output.get();
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectAsyncTransformationFuture.java`
#### Snippet
```java
    @Override
    public O get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return output.get(timeout, unit);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-core/src/main/java/com/palantir/dialogue/core/ContentEncodingChannel.java`
#### Snippet
```java

        BestSpeedGzipOutputStream(OutputStream out) throws IOException {
            super(out, BUFFER_SIZE);
            def.setLevel(Deflater.BEST_SPEED);
        }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectAsyncCatchingFuture.java`
#### Snippet
```java
    @Override
    public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return output.get(timeout, unit);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-futures/src/main/java/com/palantir/dialogue/futures/DialogueDirectAsyncCatchingFuture.java`
#### Snippet
```java
    @Override
    public T get() throws InterruptedException, ExecutionException {
        return output.get();
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-jmh/src/main/java/com/palantir/dialogue/core/EndToEndBenchmark.java`
#### Snippet
```java
        MoreExecutors.shutdownAndAwaitTermination(RetryingChannel.sharedScheduler.get(), 1, TimeUnit.SECONDS);
        MoreExecutors.shutdownAndAwaitTermination(blockingExecutor, 1, TimeUnit.SECONDS);
        closeableApache.close();
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-target/src/main/java/com/palantir/dialogue/BinaryRequestBody.java`
#### Snippet
```java
            @Override
            public void close() throws IOException {
                inputStream.close();
            }
        };
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/DefaultClients.java`
#### Snippet
```java
            if (result instanceof Closeable) {
                try {
                    ((Closeable) result).close();
                } catch (IOException | RuntimeException e) {
                    log.info(
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/DefaultClients.java`
#### Snippet
```java
    public <T> T block(ListenableFuture<T> future) {
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/CloseRecordingInputStream.java`
#### Snippet
```java
    public int read(byte[] bytes) throws IOException {
        assertNotClosed();
        return delegate.read(bytes);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/CloseRecordingInputStream.java`
#### Snippet
```java
    public void close() throws IOException {
        closeCalled = true;
        delegate.close();
    }
}
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/CloseRecordingInputStream.java`
#### Snippet
```java
    public void reset() throws IOException {
        assertNotClosed();
        delegate.reset();
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/CloseRecordingInputStream.java`
#### Snippet
```java
    public long skip(long num) throws IOException {
        assertNotClosed();
        return delegate.skip(num);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/CloseRecordingInputStream.java`
#### Snippet
```java
    public int read() throws IOException {
        assertNotClosed();
        return delegate.read();
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/CloseRecordingInputStream.java`
#### Snippet
```java
    public int available() throws IOException {
        assertNotClosed();
        return delegate.available();
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/CloseRecordingInputStream.java`
#### Snippet
```java
    public int read(byte[] bytes, int off, int len) throws IOException {
        assertNotClosed();
        return delegate.read(bytes, off, len);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-serde/src/main/java/com/palantir/conjure/java/dialogue/serde/ConjureBodySerDe.java`
#### Snippet
```java
                public T deserialize(InputStream input) {
                    try {
                        input.close();
                    } catch (RuntimeException | IOException e) {
                        log.warn("Failed to close InputStream", e);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractProxyConfigTest.java`
#### Snippet
```java

        try (Response response =
                proxiedChannel.execute(TestEndpoint.POST, request).get()) {
            assertThat(response.code()).isEqualTo(200);
            assertThat(response.body()).hasContent("proxyServer");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractProxyConfigTest.java`
#### Snippet
```java

        try (Response response =
                directChannel.execute(TestEndpoint.POST, request).get()) {
            assertThat(response.code()).isEqualTo(200);
            assertThat(response.body()).hasContent("server");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractProxyConfigTest.java`
#### Snippet
```java
        }
        try (Response response =
                proxiedChannel.execute(TestEndpoint.POST, request).get()) {
            assertThat(response.code()).isEqualTo(200);
            assertThat(response.body()).hasContent("proxyServer");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractProxyConfigTest.java`
#### Snippet
```java
                @Override
                public void writeTo(OutputStream output) throws IOException {
                    output.write("Hello, World".getBytes(StandardCharsets.UTF_8));
                }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractProxyConfigTlsTest.java`
#### Snippet
```java

        try (Response response =
                proxiedChannel.execute(TestEndpoint.POST, request).get()) {
            assertThat(response.code()).isEqualTo(200);
            assertThat(response.body()).hasContent("proxyServer");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractProxyConfigTlsTest.java`
#### Snippet
```java

        try (Response response =
                directChannel.execute(TestEndpoint.POST, request).get()) {
            assertThat(response.code()).isEqualTo(200);
            assertThat(response.body()).hasContent("server");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractProxyConfigTlsTest.java`
#### Snippet
```java
        }
        try (Response response =
                proxiedChannel.execute(TestEndpoint.POST, request).get()) {
            assertThat(response.code()).isEqualTo(200);
            assertThat(response.body()).hasContent("server");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractProxyConfigTlsTest.java`
#### Snippet
```java
                @Override
                public void writeTo(OutputStream output) throws IOException {
                    output.write(REQUEST_BODY.getBytes(StandardCharsets.UTF_8));
                }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java
    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
        return delegate.invokeAny(tasks);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java
    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return delegate.awaitTermination(timeout, unit);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `simulation/src/main/java/com/palantir/dialogue/core/ExternalDeterministicScheduler.java`
#### Snippet
```java
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException {
        return delegate.invokeAny(tasks, timeout, unit);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractChannelTest.java`
#### Snippet
```java
        assertThat(recorded.getMethod()).isEqualTo("DELETE");
        assertThat(recorded.getBodySize()).isZero();
        assertThat(result.get().code()).isEqualTo(200);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractChannelTest.java`
#### Snippet
```java
        endpoint.method = HttpMethod.GET;
        request = Request.builder().from(request).body(body).build();
        assertThatThrownBy(() -> channel.execute(endpoint, request).get())
                .hasMessageContaining("GET endpoints must not have a request body");
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractChannelTest.java`
#### Snippet
```java
    public void head_failsWhenBodyReturned() throws ExecutionException, InterruptedException {
        endpoint.method = HttpMethod.HEAD;
        Response response = channel.execute(endpoint, request).get();
        assertThat(response.body()).hasContent("");
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractChannelTest.java`
#### Snippet
```java
        assertThat(recorded.getMethod()).isEqualTo("GET");
        assertThat(recorded.getPath()).isEqualTo("/foo/");
        assertThat(result.get().code()).isEqualTo(200);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractChannelTest.java`
#### Snippet
```java
        RecordedRequest recorded = server.takeRequest();
        assertThat(recorded.getHeader("X-B3-TraceId")).isNotEmpty();
        assertThat(result.get().code()).isEqualTo(200);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractChannelTest.java`
#### Snippet
```java
        assertThat(recorded.getMethod()).isEqualTo("GET");
        assertThat(recorded.getPath()).isEqualTo("/a//b");
        assertThat(result.get().code()).isEqualTo(200);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractChannelTest.java`
#### Snippet
```java
        endpoint.method = HttpMethod.OPTIONS;
        request = Request.builder().from(request).body(body).build();
        assertThatThrownBy(() -> channel.execute(endpoint, request).get())
                .hasMessageContaining("OPTIONS endpoints must not have a request body");
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractChannelTest.java`
#### Snippet
```java
        endpoint.method = HttpMethod.HEAD;
        request = Request.builder().from(request).body(body).build();
        assertThatThrownBy(() -> channel.execute(endpoint, request).get())
                .hasMessageContaining("HEAD endpoints must not have a request body");
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractChannelTest.java`
#### Snippet
```java
    public void supportsGzipEncodedResponse() throws Exception {
        // drain enqueued response
        channel.execute(endpoint, request).get();
        server.takeRequest();

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractChannelTest.java`
#### Snippet
```java

        server.enqueue(new MockResponse().addHeader("cOntent-encoding", "gzip").setBody(zip("foo")));
        Response response = channel.execute(endpoint, request).get();
        assertThat(response.body()).hasContent("foo");
        assertThat(server.takeRequest().getHeaders().get("accept-encoding")).isEqualTo("gzip");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractChannelTest.java`
#### Snippet
```java
    public void callObservesSuccessfulResponses() throws ExecutionException, InterruptedException {
        ListenableFuture<Response> call = channel.execute(endpoint, request);
        assertThat(call.get().body()).hasContent("body");
        assertThat(call.get().code()).isEqualTo(200);
        assertThat(call.get().headers().get(HttpHeaders.CONTENT_LENGTH)).containsExactly("4");
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractChannelTest.java`
#### Snippet
```java
        ListenableFuture<Response> call = channel.execute(endpoint, request);
        assertThat(call.get().body()).hasContent("body");
        assertThat(call.get().code()).isEqualTo(200);
        assertThat(call.get().headers().get(HttpHeaders.CONTENT_LENGTH)).containsExactly("4");
    }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractChannelTest.java`
#### Snippet
```java
        assertThat(call.get().body()).hasContent("body");
        assertThat(call.get().code()).isEqualTo(200);
        assertThat(call.get().headers().get(HttpHeaders.CONTENT_LENGTH)).containsExactly("4");
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractChannelTest.java`
#### Snippet
```java
        assertThat(recorded.getMethod()).isEqualTo("DELETE");
        assertThat(recorded.getBodySize()).isEqualTo(CONTENT.length);
        assertThat(result.get().code()).isEqualTo(200);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractChannelTest.java`
#### Snippet
```java
        @Override
        public void writeTo(OutputStream output) throws IOException {
            output.write(CONTENT);
        }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `dialogue-test-common/src/main/java/com/palantir/dialogue/AbstractChannelTest.java`
#### Snippet
```java
        call.cancel(true);

        Thread.sleep(1000);
        server.enqueue(new MockResponse());

```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
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
        R body(TypeName serializerFactory, String serializerFieldName);

        R header(String headerName, Optional<ParameterEncoderType> paramEncoderType);

        R path(Optional<ParameterEncoderType> paramEncoderType);
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
        R header(String headerName, Optional<ParameterEncoderType> paramEncoderType);

        R path(Optional<ParameterEncoderType> paramEncoderType);

        R query(String paramName, Optional<ParameterEncoderType> paramEncoderType);
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
`Optional` used as type for parameter 'headerParamEncoder'
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/generate/ServiceImplementationGenerator.java`
#### Snippet
```java

    private CodeBlock generateHeaderParam(
            ArgumentDefinition param, String headerName, Optional<ParameterEncoderType> headerParamEncoder) {
        return generatePlainSerializer(
                "putHeaderParams",
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
`Optional` used as type for parameter 'securityProvider'
in `dialogue-clients/src/main/java/com/palantir/dialogue/clients/AugmentClientConfig.java`
#### Snippet
```java
    }

    private static TrustContextFactory buildTrustContextFactory(Optional<Provider> securityProvider) {
        return sslConfiguration -> {
            TrustManager[] trustManagers = SslSocketFactories.createTrustManagers(sslConfiguration);
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
`Optional` used as type for field 'body'
in `dialogue-target/src/main/java/com/palantir/dialogue/Request.java`
#### Snippet
```java
        private ListMultimap<String, String> pathParams = ImmutableListMultimap.of();

        private Optional<RequestBody> body = Optional.empty();

        @Nullable
```

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

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `write()` is identical to its super method
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientBlockingChannel.java`
#### Snippet
```java

        @Override
        public void write(int value) throws IOException {
            out.write(value);
        }
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'CloseableClient' used without 'try'-with-resources statement
in `dialogue-clients/src/main/java/com/palantir/dialogue/clients/ReloadingClientFactory.java`
#### Snippet
```java
                .clientName(channelName);
        params.blockingExecutor().ifPresent(clientBuilder::executor);
        ApacheHttpClientChannels.CloseableClient apacheClient = clientBuilder.build();
        return DialogueChannel.builder()
                .channelName(channelName)
```

### AutoCloseableResource
'Context' used without 'try'-with-resources statement
in `dialogue-core/src/main/java/com/palantir/dialogue/core/QueuedChannel.java`
#### Snippet
```java
            decrementQueueSize();
            queueHead.span().complete();
            queueHead.timer().stop();
            return true;
        }
```

### AutoCloseableResource
'Context' used without 'try'-with-resources statement
in `dialogue-core/src/main/java/com/palantir/dialogue/core/QueuedChannel.java`
#### Snippet
```java
                ListenableFuture<Response> response = maybeResponse.get();
                queueHead.span().complete();
                queueHead.timer().stop();
                DialogueFutures.addDirectCallback(response, new ForwardAndSchedule(queuedResponse));
                DialogueFutures.addDirectListener(queuedResponse, () -> {
```

### AutoCloseableResource
'Context' used without 'try'-with-resources statement
in `dialogue-core/src/main/java/com/palantir/dialogue/core/QueuedChannel.java`
#### Snippet
```java
                            SafeArg.of("endpoint", endpoint.endpointName()));
                    decrementQueueSize();
                    queueHead.timer().stop();
                    if (!queuedResponse.setException(new SafeRuntimeException(
                            "Failed to req-queue request",
```

### AutoCloseableResource
'TestResponse' used without 'try'-with-resources statement
in `dialogue-jmh/src/main/java/com/palantir/dialogue/core/EndToEndBenchmark.java`
#### Snippet
```java
        @Override
        public ListenableFuture<Response> execute(Endpoint _endpoint, Request _request) {
            return Futures.immediateFuture(new TestResponse().code(200));
        }
    }
```

### AutoCloseableResource
'TestResponse' used without 'try'-with-resources statement
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationServer.java`
#### Snippet
```java

        default HandlerBuilder1 response(int status) {
            return response(_server -> new TestResponse().code(status));
        }

```

### AutoCloseableResource
'TestResponse' used without 'try'-with-resources statement
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationServer.java`
#### Snippet
```java
            return response(server -> {
                if (server.activeRequests.getCount() > capacity) {
                    return new TestResponse().code(errorStatus);
                } else {
                    return new TestResponse().code(200);
```

### AutoCloseableResource
'TestResponse' used without 'try'-with-resources statement
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationServer.java`
#### Snippet
```java
                    return new TestResponse().code(errorStatus);
                } else {
                    return new TestResponse().code(200);
                }
            });
```

## RuleId[id=SimplifyOptionalCallChains]
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
in `dialogue-apache-hc5-client/src/main/java/com/palantir/dialogue/hc5/ApacheHttpClientChannels.java`
#### Snippet
```java
            Preconditions.checkArgument(
                    !conf.fallbackToCommonNameVerification(), "fallback-to-common-name-verification is not supported");
            Preconditions.checkArgument(!conf.meshProxy().isPresent(), "Mesh proxy is not supported");

            Timeout socketTimeout = getSocketTimeout(conf, name);
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
            Optional<DialogueNodeSelectionStrategy> maybeStrategy =
                    strategySelector.updateAndGet(DialogueNodeSelectionStrategy.fromHeader(strategy));
            if (!maybeStrategy.isPresent()) {
                return;
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
in `simulation/src/main/java/com/palantir/dialogue/core/SimulationServer.java`
#### Snippet
```java
            long beforeNanos = simulation.clock().read();
            Optional<ListenableFuture<Response>> maybeResp = handler.maybeExecute(this, endpoint, request);
            if (!maybeResp.isPresent()) {
                continue;
            }
```

## RuleId[id=SuspiciousToArrayCall]
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `parts` may be 'final'
in `dialogue-annotations/src/main/java/com/palantir/dialogue/annotations/MultipartRequestBody.java`
#### Snippet
```java

        private final MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        private List<Part> parts = new ArrayList<>();

        private Builder() {}
```

### FieldMayBeFinal
Field `empty` may be 'final'
in `dialogue-jmh/src/main/java/com/palantir/dialogue/core/RequestBuilderBenchmark.java`
#### Snippet
```java
public class RequestBuilderBenchmark {

    private Request empty = Request.builder().build();
    private Request nonEmpty = Request.builder()
            .putHeaderParams("Authorization", "whatever")
```

### FieldMayBeFinal
Field `nonEmpty` may be 'final'
in `dialogue-jmh/src/main/java/com/palantir/dialogue/core/RequestBuilderBenchmark.java`
#### Snippet
```java

    private Request empty = Request.builder().build();
    private Request nonEmpty = Request.builder()
            .putHeaderParams("Authorization", "whatever")
            .putHeaderParams("header1", "header")
```

### FieldMayBeFinal
Field `requestSupplier` may be 'final'
in `simulation/src/main/java/com/palantir/dialogue/core/Benchmark.java`
#### Snippet
```java
    private IntSupplier endpointChannelChooser;
    private Stream<ScheduledRequest> requestStream;
    private Function<Long, Request> requestSupplier = Benchmark::constructRequest;
    private ShouldStopPredicate benchmarkFinished;
    private Duration abortAfter;
```

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=OptionalGetWithoutIsPresent]
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

## RuleId[id=UnstableApiUsage]
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
'splitToStream(java.lang.CharSequence)' is marked unstable with @Beta
in `dialogue-annotations-processor/src/main/java/com/palantir/dialogue/annotations/processor/data/HttpPathParser.java`
#### Snippet
```java
            String path = requestAnnotation.getFieldMaybe("path", String.class).orElseThrow();

            List<HttpPathSegment> pathSegments = SPLITTER.splitToStream(path)
                    .map(HttpPathParser::toHttpPathSegment)
                    .collect(Collectors.toList());
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
'transform(com.google.common.util.concurrent.ListenableFuture*, com.google.common.base.Function, java.util.concurrent.Executor)' is marked unstable with @Beta*
in `simulation/src/main/java/com/palantir/dialogue/core/Benchmark.java`
#### Snippet
```java
        log.warn("Fired off all requests ({} ms, {}req/sec)", ms, (1000 * requestsStarted[0]) / ms);

        return Futures.transform(
                benchmarkFinished.getFuture(),
                _v -> {
```

