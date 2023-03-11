# tchannel-java 
 
# Bad smells
I found 240 bad smells with 24 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantFieldInitialization | 42 | false |
| DataFlowIssue | 31 | false |
| SystemOutErr | 26 | false |
| ProtectedMemberInFinalClass | 21 | true |
| BoundedWildcard | 15 | false |
| ReturnNull | 13 | false |
| ExceptionNameDoesntEndWithException | 13 | false |
| RedundantStringFormatCall | 13 | false |
| UnusedAssignment | 10 | false |
| ClassNameSameAsAncestorName | 8 | false |
| UnstableApiUsage | 8 | false |
| NullableProblems | 6 | false |
| PublicFieldAccessedInSynchronizedContext | 6 | false |
| ConstantValue | 5 | false |
| NonSerializableFieldInSerializableClass | 3 | false |
| ObsoleteCollection | 2 | false |
| DuplicateBranchesInSwitch | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| NegativeIntConstantInLongContext | 2 | false |
| RedundantSuppression | 2 | false |
| FieldMayBeStatic | 1 | false |
| CommentedOutCode | 1 | false |
| SetReplaceableByEnumSet | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| MissortedModifiers | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| WaitNotInLoop | 1 | false |
## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `connections` may be 'static'
in `tchannel-benchmark/src/main/java/com/uber/tchannel/benchmarks/PingPongMultiServerBenchmark.java`
#### Snippet
```java
    private SubChannel subClient;

    private final int connections = 3;

    private final NioEventLoopGroup bossGroup = new NioEventLoopGroup(1);
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getMessage` may produce `NullPointerException`
in `tchannel-example/src/main/java/com/uber/tchannel/thrift/KeyValueClient.java`
#### Snippet
```java
        try (ThriftResponse<KeyValue.setValue_result> response = future.get()) {
            if (response.isError()) {
                System.out.println("setValue failed due to: " + response.getError().getMessage());
            } else {
                System.out.println("setValue succeeded");
```

### DataFlowIssue
Method invocation `getMessage` may produce `NullPointerException`
in `tchannel-example/src/main/java/com/uber/tchannel/thrift/KeyValueClient.java`
#### Snippet
```java
        try (ThriftResponse<KeyValue.getValue_result> getResult = future.get()) {
            if (getResult.isError()) {
                System.out.println("getValue failed due to: " + getResult.getError().getMessage());
                return null;
            } else {
```

### DataFlowIssue
Method invocation `getMessage` may produce `NullPointerException`
in `tchannel-example/src/main/java/com/uber/tchannel/hyperbahn/HyperbahnExample.java`
#### Snippet
```java
                    System.out.println("Got response. All set: " + response.getBody(AdvertiseResponse.class));
                } else {
                    System.out.println("Error happened: " + response.getError().getMessage());
                }
            }
```

### DataFlowIssue
Argument `request.getTransportHeaders()` might be null
in `tchannel-example/src/main/java/com/uber/tchannel/basic/AsyncRequest.java`
#### Snippet
```java
                        case 1:
                            return new RawResponse.Builder(request)
                                .setTransportHeaders(request.getTransportHeaders())
                                .setHeader("Polo")
                                .setBody("Pong!")
```

### DataFlowIssue
Argument `request.getTransportHeaders()` might be null
in `tchannel-example/src/main/java/com/uber/tchannel/basic/AsyncRequest.java`
#### Snippet
```java
                        case 2:
                            return new RawResponse.Builder(request)
                                .setTransportHeaders(request.getTransportHeaders())
                                .setResponseCode(ResponseCode.Error)
                                .setHeader("Polo")
```

### DataFlowIssue
Argument `message.getArg3()` might be null
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Serializer.java`
#### Snippet
```java

    public <T> T decodeBody(RawMessage message, Class<T> bodyType) {
        return this.getSerializer(message).decodeBody(message.getArg3(), bodyType);
    }

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Serializer.java`
#### Snippet
```java
    private SerializerInterface getSerializer(RawMessage message) {
        Map<String, String> transportHeaders = message.getTransportHeaders();
        ArgScheme argScheme = ArgScheme.toScheme(transportHeaders.get(TransportHeaders.ARG_SCHEME_KEY));
        return this.serializers.get(argScheme);
    }
```

### DataFlowIssue
Argument `message.getArg2()` might be null
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Serializer.java`
#### Snippet
```java

    public Map<String, String> decodeHeaders(RawMessage message) {
        return this.getSerializer(message).decodeHeaders(message.getArg2());
    }

```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `tchannel-core/src/main/java/com/uber/tchannel/messages/RawResponse.java`
#### Snippet
```java
    public String toString() {
        if (isError()) {
            return getError().toString();
        }

```

### DataFlowIssue
Argument `request.getTransportHeaders()` might be null
in `tchannel-crossdock/src/main/java/com/uber/tchannel/crossdock/behavior/trace/JSONHandler.java`
#### Snippet
```java
        Response response = behavior.handleRequest(request.getBody(Request.class));
        return new JsonResponse.Builder<Response>(request)
                .setTransportHeaders(request.getTransportHeaders())
                .setBody(response)
                .build();
```

### DataFlowIssue
Method invocation `retain` may produce `NullPointerException`
in `tchannel-example/src/main/java/com/uber/tchannel/ping/PingRequestHandler.java`
#### Snippet
```java
    @Override
    public JsonResponse<Pong> handleImpl(JsonRequest<Ping> request) {
        request.getArg2().retain();
        return new JsonResponse.Builder<Pong>(request)
            .setTransportHeaders(request.getTransportHeaders())
```

### DataFlowIssue
Argument `request.getTransportHeaders()` might be null
in `tchannel-example/src/main/java/com/uber/tchannel/ping/PingRequestHandler.java`
#### Snippet
```java
        request.getArg2().retain();
        return new JsonResponse.Builder<Pong>(request)
            .setTransportHeaders(request.getTransportHeaders())
            .setArg2(request.getArg2())
            .setBody(new Pong("pong!"))
```

### DataFlowIssue
Argument `request.getTransportHeaders()` might be null
in `tchannel-example/src/main/java/com/uber/tchannel/basic/SyncRequest.java`
#### Snippet
```java
                        case 1:
                            return new RawResponse.Builder(request)
                                .setTransportHeaders(request.getTransportHeaders())
                                .setHeader("Polo")
                                .setBody("Pong!")
```

### DataFlowIssue
Argument `request.getTransportHeaders()` might be null
in `tchannel-example/src/main/java/com/uber/tchannel/basic/SyncRequest.java`
#### Snippet
```java
                        case 2:
                            return new RawResponse.Builder(request)
                                .setTransportHeaders(request.getTransportHeaders())
                                .setResponseCode(ResponseCode.Error)
                                .setHeader("Polo")
```

### DataFlowIssue
Method invocation `getMessage` may produce `NullPointerException`
in `tchannel-core/src/main/java/com/uber/tchannel/tracing/Tracing.java`
#### Snippet
```java
                if (response.isError()) {
                    Tags.ERROR.set(span, true);
                    span.log(response.getError().getMessage());
                }
                span.finish();
```

### DataFlowIssue
Argument `thriftRequest.getTransportHeaders()` might be null
in `tchannel-crossdock/src/main/java/com/uber/tchannel/crossdock/behavior/trace/ThriftHandler.java`
#### Snippet
```java

        return new ThriftResponse.Builder<Call_result>(thriftRequest)
                .setTransportHeaders(thriftRequest.getTransportHeaders())
                .setBody(new Call_result(objectToData(response)))
                .build();
```

### DataFlowIssue
Argument `checksumType` might be null
in `tchannel-core/src/main/java/com/uber/tchannel/frames/CallRequestFrame.java`
#### Snippet
```java

        // (csum:4){0,1}
        checksum = CodecUtils.decodeChecksum(checksumType, tFrame.payload);

        // arg1~2 arg2~2 arg3~2
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `tchannel-core/src/main/java/com/uber/tchannel/messages/EncodedResponse.java`
#### Snippet
```java
    public String toString() {
        if (isError()) {
            return getError().toString();
        }
        return String.format(
```

### DataFlowIssue
Argument `checksumType` might be null
in `tchannel-core/src/main/java/com/uber/tchannel/frames/CallRequestContinueFrame.java`
#### Snippet
```java

        // (csum:4){0,1}
        checksum = CodecUtils.decodeChecksum(checksumType, tFrame.payload);

        // {continuation}
```

### DataFlowIssue
Argument `request.getTransportHeaders()` might be null
in `tchannel-crossdock/src/main/java/com/uber/tchannel/crossdock/Server.java`
#### Snippet
```java
        public JsonResponse<String> handleImpl(JsonRequest<String> request) {
            return new JsonResponse.Builder<String>(request)
                    .setTransportHeaders(request.getTransportHeaders())
                    .setBody(request.getBody(String.class))
                    .build();
```

### DataFlowIssue
Method invocation `getErrorType` may produce `NullPointerException`
in `tchannel-benchmark/src/main/java/com/uber/tchannel/benchmarks/PingPongServerBenchmark.java`
#### Snippet
```java
                } else {
                    // System.out.println(pongResponse.getError().getMessage());
                    switch (pongResponse.getError().getErrorType()) {
                        case Busy:
                            counters.busyQPS.incrementAndGet();
```

### DataFlowIssue
Method invocation `pushSpan` may produce `NullPointerException`
in `tchannel-core/src/main/java/com/uber/tchannel/api/TFuture.java`
#### Snippet
```java
    private void pushSpan(Span span) {
        if (span != null) {
            tracingContext.pushSpan(span);
        }
    }
```

### DataFlowIssue
Method invocation `popSpan` may produce `NullPointerException`
in `tchannel-core/src/main/java/com/uber/tchannel/api/TFuture.java`
#### Snippet
```java
        if (span != null) {
            try { // this _might_ fail in case the listener managed to corrupt the tracing context
                Span poppedSpan = tracingContext.popSpan();
                if (!span.equals(poppedSpan)) {
                    logger.error(
```

### DataFlowIssue
Unboxing of `requestQueue.poll()` may produce `NullPointerException`
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/ResponseRouter.java`
#### Snippet
```java
            boolean flush = false;
            while (!requestQueue.isEmpty() && channel.isWritable()) {
                long id = requestQueue.poll();
                OutRequest<?> outRequest = requestMap.get(id);
                if (outRequest != null) {
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Response.java`
#### Snippet
```java

    public ArgScheme getArgScheme() {
        return ArgScheme.toScheme(transportHeaders.get(TransportHeaders.ARG_SCHEME_KEY));
    }

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Response.java`
#### Snippet
```java
            this.id = req.getId();
            this.transportHeaders.put(
                TransportHeaders.ARG_SCHEME_KEY, req.getTransportHeaders().get(TransportHeaders.ARG_SCHEME_KEY)
            );
        }
```

### DataFlowIssue
Argument `checksumType` might be null
in `tchannel-core/src/main/java/com/uber/tchannel/frames/CallResponseContinueFrame.java`
#### Snippet
```java

        // (csum:4){0,1}
        checksum = CodecUtils.decodeChecksum(checksumType, tFrame.payload);

        // {continuation}
```

### DataFlowIssue
Method invocation `getErrorType` may produce `NullPointerException`
in `tchannel-hyperbahn/src/main/java/com/uber/tchannel/hyperbahn/api/HyperbahnClient.java`
#### Snippet
```java
                        logger.error(
                            "Failed to advertise to Hyperbahn: {} - {}",
                            error.getErrorType(),
                            error.getMessage()
                        );
```

### DataFlowIssue
Argument `this.remoteAddress` might be null
in `tchannel-core/src/main/java/com/uber/tchannel/channels/Connection.java`
#### Snippet
```java
    public @NotNull SocketAddress getRemoteAddressAsSocketAddress() {
        synchronized (lock) {
            return hostPortToSocketAddress(this.remoteAddress);
        }
    }
```

### DataFlowIssue
Method invocation `getErrorType` may produce `NullPointerException`
in `tchannel-benchmark/src/main/java/com/uber/tchannel/benchmarks/LargePayloadBenchmark.java`
#### Snippet
```java
                    counters.actualQPS.incrementAndGet();
                } else {
                    switch (pongResponse.getError().getErrorType()) {
                        case Busy:
                            counters.busyQPS.incrementAndGet();
```

### DataFlowIssue
Argument `checksumType` might be null
in `tchannel-core/src/main/java/com/uber/tchannel/frames/CallResponseFrame.java`
#### Snippet
```java

        // (csum:4){0,1}
        checksum = CodecUtils.decodeChecksum(checksumType, tFrame.payload);

        // arg1~2 arg2~2 arg3~2
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `tchannel-benchmark/src/main/java/com/uber/tchannel/benchmarks/PingPongServerBenchmark.java`
#### Snippet
```java
                    counters.actualQPS.incrementAndGet();
                    // uncomment the following code to enforce evaluation
                    // pongResponse.getBody(Pong.class);
                    // pongResponse.getHeaders();
                } else {
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `tchannel-core/src/main/java/com/uber/tchannel/tracing/TracingContext.java`
#### Snippet
```java
                    @Override
                    protected Stack<Span> initialValue() {
                        return new Stack<>();
                    }
                };
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `tchannel-core/src/main/java/com/uber/tchannel/tracing/TracingContext.java`
#### Snippet
```java
                };

        private Stack<Span> stack() {
            return stack.get();
        }
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/OutRequest.java`
#### Snippet
```java
            case Cancelled:
            case Unhealthy:
                return false;

            case Busy:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Response.java`
#### Snippet
```java
        switch (argScheme) {
            case RAW:
                res = new RawResponse(errorResponse);
                break;
            case JSON:
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'trace' in a Serializable class
in `tchannel-core/src/main/java/com/uber/tchannel/errors/BadRequestError.java`
#### Snippet
```java
public class BadRequestError extends ProtocolError {
    private static final ErrorType errorType = ErrorType.BadRequest;
    private final Trace trace;
    private final long id;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'trace' in a Serializable class
in `tchannel-core/src/main/java/com/uber/tchannel/errors/FatalProtocolError.java`
#### Snippet
```java
    private static final long ID = 0xFFFFFFFF;
    private static final ErrorType errorType = ErrorType.FatalProtocolError;
    private final Trace trace;

    public FatalProtocolError(String message, Trace trace) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'trace' in a Serializable class
in `tchannel-core/src/main/java/com/uber/tchannel/errors/BusyError.java`
#### Snippet
```java
public class BusyError extends ProtocolError {
    private static final ErrorType errorType = ErrorType.Busy;
    private final Trace trace;
    private final long id;

```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-example/src/main/java/com/uber/tchannel/basic/AsyncRequest.java`
#### Snippet
```java
    }

    protected static TChannel createClient() throws Exception {

        // create TChannel
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-example/src/main/java/com/uber/tchannel/basic/AsyncRequest.java`
#### Snippet
```java
    }

    protected static TChannel createServer() throws Exception {

        // create TChannel
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-core/src/main/java/com/uber/tchannel/messages/JsonResponse.java`
#### Snippet
```java
    }

    protected JsonResponse(long id, ResponseCode responseCode,
                              Map<String, String> transportHeaders,
                              ByteBuf arg2, ByteBuf arg3) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-core/src/main/java/com/uber/tchannel/messages/JsonResponse.java`
#### Snippet
```java
    }

    protected JsonResponse(ErrorResponse error) {
        super(error);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-example/src/main/java/com/uber/tchannel/basic/SyncRequest.java`
#### Snippet
```java
    }

    protected static TChannel createServer() throws Exception {

        // create TChannel
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-example/src/main/java/com/uber/tchannel/basic/SyncRequest.java`
#### Snippet
```java
    }

    protected static TChannel createClient() throws Exception {

        // create TChannel
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/OutRequest.java`
#### Snippet
```java
    }

    protected boolean shouldRetryOnError() {
        if (lastError == null) {
            return false;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/OutRequest.java`
#### Snippet
```java

    @SuppressWarnings({"rawtypes", "unchecked"})
    protected void setResponseFuture(ArgScheme argScheme, Response response) {
        switch (argScheme) {
            case RAW:
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-core/src/main/java/com/uber/tchannel/messages/ThriftResponse.java`
#### Snippet
```java
    }

    protected ThriftResponse(long id, ResponseCode responseCode,
                              Map<String, String> transportHeaders,
                              ByteBuf arg2, ByteBuf arg3) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-core/src/main/java/com/uber/tchannel/messages/ThriftResponse.java`
#### Snippet
```java
    }

    protected ThriftResponse(ErrorResponse error) {
        super(error);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-core/src/main/java/com/uber/tchannel/frames/CallRequestContinueFrame.java`
#### Snippet
```java
    }

    protected CallRequestContinueFrame(long id) {
        this(id, (byte)0, null, 0, null);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-core/src/main/java/com/uber/tchannel/api/SubChannel.java`
#### Snippet
```java
    }

    protected <V extends Response> TFuture<V> sendRequest(
        Request request,
        InetAddress host,
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-core/src/main/java/com/uber/tchannel/frames/CallResponseContinueFrame.java`
#### Snippet
```java
    }

    protected CallResponseContinueFrame(long id) {
        this(id, (byte)0, null, 0, null);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-core/src/main/java/com/uber/tchannel/frames/ErrorFrame.java`
#### Snippet
```java
    }

    protected ErrorFrame(long id) {
        this.id = id;
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-core/src/main/java/com/uber/tchannel/frames/InitResponseFrame.java`
#### Snippet
```java
    }

    protected InitResponseFrame(long id) {
        this.id = id;
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-hyperbahn/src/main/java/com/uber/tchannel/hyperbahn/api/HyperbahnClient.java`
#### Snippet
```java
     * exceptions.
     */
    protected static boolean close(@Nullable AutoCloseable closeable) {
        if (closeable == null) {
            return false;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-core/src/main/java/com/uber/tchannel/frames/CancelFrame.java`
#### Snippet
```java
    }

    protected CancelFrame(long id) {
        this.id = id;
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-core/src/main/java/com/uber/tchannel/frames/InitRequestFrame.java`
#### Snippet
```java
    }

    protected InitRequestFrame(long id) {
        this.id = id;
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-core/src/main/java/com/uber/tchannel/frames/CallResponseFrame.java`
#### Snippet
```java
    }

    protected CallResponseFrame(long id) {
        this(id,(byte)0, null, null, null, null, 0, null);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-core/src/main/java/com/uber/tchannel/messages/RawRequest.java`
#### Snippet
```java
    private String body = null;

    protected RawRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `tchannel-core/src/main/java/com/uber/tchannel/messages/RawRequest.java`
#### Snippet
```java
    }

    protected RawRequest(long id, long ttl, Trace trace,
                      String service, Map<String, String> transportHeaders,
                      ByteBuf arg1, ByteBuf arg2, ByteBuf arg3) {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `tchannel-example/src/main/java/com/uber/tchannel/basic/AsyncRequest.java`
#### Snippet
```java
                } else {
                    System.out.println(String.format("Got error response: %s",
                        response.toString()));
                }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `tchannel-example/src/main/java/com/uber/tchannel/basic/SyncRequest.java`
#### Snippet
```java
                } else {
                    System.out.println(String.format("Got error response: %s",
                        response.toString()));
                }
            }
```

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `tchannel-core/src/main/java/com/uber/tchannel/headers/RetryFlag.java`
#### Snippet
```java

    public static @NotNull Set<RetryFlag> parseFlags(@NotNull String flags) {
        Set<RetryFlag> retryFlags = new HashSet<>();
        for (char c : flags.toCharArray()) {
            retryFlags.add(toRetryFlag(c));
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `DefaultTypedRequestHandler` has no concrete subclass
in `tchannel-core/src/main/java/com/uber/tchannel/api/handlers/DefaultTypedRequestHandler.java`
#### Snippet
```java
import com.uber.tchannel.messages.Response;

public abstract class DefaultTypedRequestHandler implements RequestHandler {

    @Override
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends SerializerInterface`
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Serializer.java`
#### Snippet
```java
    Map<ArgScheme, SerializerInterface> serializers;

    public Serializer(Map<ArgScheme, SerializerInterface> serializers) {
        this.serializers = serializers;
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `tchannel-core/src/main/java/com/uber/tchannel/messages/EncodedResponse.java`
#### Snippet
```java
    }

    public T getBody(Class<T> bodyType) {
        if (body == null && arg3 != null) {
            body = serializer.decodeBody(this, bodyType);
```

### BoundedWildcard
Can generalize to `? super V`
in `tchannel-core/src/main/java/com/uber/tchannel/api/TFuture.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public void addCallback(final TFutureCallback<V> callback) {
        Futures.addCallback(this, new FutureCallback<V>() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends InetSocketAddress`
in `tchannel-core/src/main/java/com/uber/tchannel/api/SubChannel.java`
#### Snippet
```java
    }

    public @NotNull SubChannel setPeers(@NotNull List<InetSocketAddress> peers) {
        for (InetSocketAddress peer : peers) {
            this.peers.add(new SubPeer(peer, this));
```

### BoundedWildcard
Can generalize to `? extends ByteBuf`
in `tchannel-core/src/main/java/com/uber/tchannel/codecs/CodecUtils.java`
#### Snippet
```java
        @NotNull ByteBufAllocator allocator,
        @NotNull ByteBuf header,
        @NotNull List<ByteBuf> args
    ) {
        ByteBuf payload = allocator.buffer(header.readableBytes(), TFrame.MAX_FRAME_PAYLOAD_LENGTH);
```

### BoundedWildcard
Can generalize to `? extends ByteBuf`
in `tchannel-core/src/main/java/com/uber/tchannel/codecs/CodecUtils.java`
#### Snippet
```java
        @NotNull ByteBufAllocator allocator,
        @NotNull ByteBuf header,
        @NotNull List<ByteBuf> args
    ) {
        int writableBytes = TFrame.MAX_FRAME_PAYLOAD_LENGTH - header.readableBytes();
```

### BoundedWildcard
Can generalize to `? super ByteBuf`
in `tchannel-core/src/main/java/com/uber/tchannel/codecs/CodecUtils.java`
#### Snippet
```java
        @NotNull ByteBuf arg,
        int writableBytes,
        @NotNull List<ByteBuf> bufs,
        @NotNull List<ByteBuf> allocatedBufs
    ) {
```

### BoundedWildcard
Can generalize to `? super ByteBuf`
in `tchannel-core/src/main/java/com/uber/tchannel/codecs/CodecUtils.java`
#### Snippet
```java
        int writableBytes,
        @NotNull List<ByteBuf> bufs,
        @NotNull List<ByteBuf> allocatedBufs
    ) {
        if (writableBytes <= TFrame.FRAME_SIZE_LENGTH) {
```

### BoundedWildcard
Can generalize to `? super Service`
in `tchannel-hyperbahn/src/main/java/com/uber/tchannel/hyperbahn/messages/AdvertiseRequest.java`
#### Snippet
```java
    private final List<Service> services;

    public AdvertiseRequest(List<Service> services) {
        this.services = services;
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `tchannel-core/src/main/java/com/uber/tchannel/tracing/PrefixedHeadersCarrier.java`
#### Snippet
```java

    private static Function<String, String> cachingTransformer(
            Function<String, String> transformer
    ) {
        final LoadingCache<String, String> cache = CacheBuilder.newBuilder()
```

### BoundedWildcard
Can generalize to `? super String`
in `tchannel-core/src/main/java/com/uber/tchannel/tracing/PrefixedHeadersCarrier.java`
#### Snippet
```java
            Map<String, String> headers,
            String prefix,
            Function<String, String> encoder,
            Function<String, String> decoder
    ) {
```

### BoundedWildcard
Can generalize to `? super String`
in `tchannel-core/src/main/java/com/uber/tchannel/tracing/PrefixedHeadersCarrier.java`
#### Snippet
```java
            String prefix,
            Function<String, String> encoder,
            Function<String, String> decoder
    ) {
        this.headers = headers;
```

### BoundedWildcard
Can generalize to `? extends T`
in `tchannel-core/src/main/java/com/uber/tchannel/messages/EncodedRequest.java`
#### Snippet
```java
    }

    public T getBody(Class<T> bodyType) {
        if (body == null) {
            if (arg3 != null) {
```

### BoundedWildcard
Can generalize to `? extends CallFrame`
in `tchannel-core/src/main/java/com/uber/tchannel/codecs/MessageCodec.java`
#### Snippet
```java
    }

    public static Request decodeCallRequest(List<CallFrame> frames) {

        if (frames.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends CallFrame`
in `tchannel-core/src/main/java/com/uber/tchannel/codecs/MessageCodec.java`
#### Snippet
```java
    }

    public static Response decodeCallResponse(List<CallFrame> frames) {

        if (frames.isEmpty()) {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final protected`
in `tchannel-core/src/main/java/com/uber/tchannel/channels/Connection.java`
#### Snippet
```java
    private @Nullable String remoteAddress = null;
    private @Nullable TChannelError lastError = null;
    final protected @NotNull Object lock;

    public Connection(Peer peer, @NotNull Channel channel, Direction direction) {
```

## RuleId[id=NullableProblems]
### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Response.java`
#### Snippet
```java

    protected Response(
        long id, ResponseCode responseCode, Map<String, String> transportHeaders, ByteBuf arg2, ByteBuf arg3
    ) {
        this.id = id;
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Response.java`
#### Snippet
```java

    protected Response(
        long id, ResponseCode responseCode, Map<String, String> transportHeaders, ByteBuf arg2, ByteBuf arg3
    ) {
        this.id = id;
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Response.java`
#### Snippet
```java

    protected Response(
        long id, ResponseCode responseCode, Map<String, String> transportHeaders, ByteBuf arg2, ByteBuf arg3
    ) {
        this.id = id;
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Response.java`
#### Snippet
```java

    protected Response(
        long id, ResponseCode responseCode, Map<String, String> transportHeaders, ByteBuf arg2, ByteBuf arg3
    ) {
        this.id = id;
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java

        @VisibleForTesting
        ByteBuf getArg1() {
            return arg1;
        }
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java
        }

        public Builder(String service, ByteBuf arg1) {
            this.service = service;
            this.arg1 = arg1;
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `this.state` accessed in synchronized context
in `tchannel-core/src/main/java/com/uber/tchannel/channels/Connection.java`
#### Snippet
```java
    public void setState(ConnectionState state) {
        synchronized (lock) {
            this.state = state;
            if (state == ConnectionState.IDENTIFIED || (state == ConnectionState.UNCONNECTED && this.lastError != null)) {
                lock.notifyAll();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `direction` accessed in synchronized context
in `tchannel-core/src/main/java/com/uber/tchannel/channels/Connection.java`
#### Snippet
```java
    public boolean satisfy(@Nullable Direction preferredDirection) {
        synchronized (lock) {
            return preferredDirection == null || preferredDirection == Direction.NONE || preferredDirection == direction;
        }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.state` accessed in synchronized context
in `tchannel-core/src/main/java/com/uber/tchannel/channels/Connection.java`
#### Snippet
```java

            channel.close();
            this.state = ConnectionState.DESTROYED;
        }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.state` accessed in synchronized context
in `tchannel-core/src/main/java/com/uber/tchannel/channels/Connection.java`
#### Snippet
```java
            // TODO reap connections/peers on init timeout
            try {
                if (this.state != ConnectionState.IDENTIFIED) {
                    this.lastError = null;
                    lock.wait(timeout);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.state` accessed in synchronized context
in `tchannel-core/src/main/java/com/uber/tchannel/channels/Connection.java`
#### Snippet
```java
            }

            boolean result = this.state == ConnectionState.IDENTIFIED;
            if (!result) {
                // reset the connection if it failed to identify
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.state` accessed in synchronized context
in `tchannel-core/src/main/java/com/uber/tchannel/channels/Connection.java`
#### Snippet
```java
    public boolean satisfy(@Nullable ConnectionState preferredState) {
        synchronized (lock) {
            ConnectionState connState = this.state;
            if (connState == ConnectionState.DESTROYED) {
                return false;
```

## RuleId[id=NegativeIntConstantInLongContext]
### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `tchannel-core/src/main/java/com/uber/tchannel/errors/FatalProtocolError.java`
#### Snippet
```java

public class FatalProtocolError extends ProtocolError {
    private static final long ID = 0xFFFFFFFF;
    private static final ErrorType errorType = ErrorType.FatalProtocolError;
    private final Trace trace;
```

### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `tchannel-core/src/main/java/com/uber/tchannel/errors/FatalProtocolError.java`
#### Snippet
```java
    @Override
    public long getId() {
        return ID;
    }

```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `tchannel-core/src/main/java/com/uber/tchannel/tracing/OpenTracingContext.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("resource")
    public boolean hasSpan() {
        return scopeManager.activeSpan() != null;
    }
```

### RedundantSuppression
Redundant suppression
in `tchannel-core/src/main/java/com/uber/tchannel/tracing/OpenTracingContext.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("resource")
    public void clear() {
        Scope lastScope = null;
        Scope scope = scopeManager.active();
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/thrift/KeyValueClient.java`
#### Snippet
```java

    public static void main(String[] args) throws Exception {
        System.out.println("Connecting to KeyValue Server…");
        TChannel tchannel = new TChannel.Builder("keyvalue-client")
                .build();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/thrift/KeyValueClient.java`
#### Snippet
```java
        String value = getValue(subChannel, "foo");

        System.out.println(String.format("{'%s' => '%s'}", "foo", value));

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/thrift/KeyValueClient.java`
#### Snippet
```java
        try {
            String otherValue = getValue(subChannel, "baz");
            System.out.println(String.format("{'%s' => '%s'}", "foo", otherValue));
        } catch (NotFoundError e) {
            System.out.println(String.format("Key '%s' not found.", e.getKey()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/thrift/KeyValueClient.java`
#### Snippet
```java
            System.out.println(String.format("{'%s' => '%s'}", "foo", otherValue));
        } catch (NotFoundError e) {
            System.out.println(String.format("Key '%s' not found.", e.getKey()));
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/thrift/KeyValueClient.java`
#### Snippet
```java
        tchannel.shutdown(false);

        System.out.println("Disconnected from KeyValue Server.");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/thrift/KeyValueClient.java`
#### Snippet
```java
        try (ThriftResponse<KeyValue.setValue_result> response = future.get()) {
            if (response.isError()) {
                System.out.println("setValue failed due to: " + response.getError().getMessage());
            } else {
                System.out.println("setValue succeeded");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/thrift/KeyValueClient.java`
#### Snippet
```java
                System.out.println("setValue failed due to: " + response.getError().getMessage());
            } else {
                System.out.println("setValue succeeded");
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/thrift/KeyValueClient.java`
#### Snippet
```java
        try (ThriftResponse<KeyValue.getValue_result> getResult = future.get()) {
            if (getResult.isError()) {
                System.out.println("getValue failed due to: " + getResult.getError().getMessage());
                return null;
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/thrift/KeyValueClient.java`
#### Snippet
```java
                return null;
            } else {
                System.out.println("getValue succeeded");
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/hyperbahn/HyperbahnExample.java`
#### Snippet
```java
            public void onResponse(JsonResponse<AdvertiseResponse> response) {
                if (!response.isError()) {
                    System.out.println("Got response. All set: " + response.getBody(AdvertiseResponse.class));
                } else {
                    System.out.println("Error happened: " + response.getError().getMessage());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/hyperbahn/HyperbahnExample.java`
#### Snippet
```java
                    System.out.println("Got response. All set: " + response.getBody(AdvertiseResponse.class));
                } else {
                    System.out.println("Error happened: " + response.getError().getMessage());
                }
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/basic/AsyncRequest.java`
#### Snippet
```java
                // when using callback, resource associated with response is released by the the TChannel library
                if (!response.isError()) {
                    System.out.println(String.format("Response received: response code: %s, header: %s, body: %s",
                        response.getResponseCode(),
                        response.getHeader(),
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/basic/AsyncRequest.java`
#### Snippet
```java
                        response.getBody()));
                } else {
                    System.out.println(String.format("Got error response: %s",
                        response.toString()));
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/basic/AsyncRequest.java`
#### Snippet
```java

        done.await();
        System.out.println(String.format("%nTime cost: %dms", System.currentTimeMillis() - start));

        // close channels asynchronously
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/basic/AsyncRequest.java`
#### Snippet
```java
                @Override
                public RawResponse handleImpl(RawRequest request) {
                    System.out.println(String.format("Request received: header: %s, body: %s",
                        request.getHeader(),
                        request.getBody()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/basic/SyncRequest.java`
#### Snippet
```java
            try (RawResponse response = future.get()) {
                if (!response.isError()) {
                    System.out.println(String.format("Response received: response code: %s, header: %s, body: %s",
                        response.getResponseCode(),
                        response.getHeader(),
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/basic/SyncRequest.java`
#### Snippet
```java
                        response.getBody()));
                } else {
                    System.out.println(String.format("Got error response: %s",
                        response.toString()));
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/basic/SyncRequest.java`
#### Snippet
```java
            }

            System.out.println();
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/basic/SyncRequest.java`
#### Snippet
```java
        }

        System.out.println(String.format("%nTime cost: %dms", System.currentTimeMillis() - start));

        // close channels asynchronously
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/basic/SyncRequest.java`
#### Snippet
```java
                @Override
                public RawResponse handleImpl(RawRequest request) {
                    System.out.println(String.format("Request received: header: %s, body: %s",
                        request.getHeader(),
                        request.getBody()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/ping/PingClient.java`
#### Snippet
```java
        done.await();
        for (Map.Entry<String, AtomicInteger> stringIntegerEntry : msgs.entrySet()) {
            System.out.println(String.format("%s%n\tcount:%s",
                stringIntegerEntry.getKey(), stringIntegerEntry.getValue()
            ));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/ping/PingClient.java`
#### Snippet
```java
        int requests = Integer.parseInt(cmd.getOptionValue("n", "10000"));

        System.out.println(String.format("Connecting from client to server on port: %d", port));
        new PingClient(host, port, requests).run();
        System.out.println("Stopping Client...");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/ping/PingClient.java`
#### Snippet
```java
        System.out.println(String.format("Connecting from client to server on port: %d", port));
        new PingClient(host, port, requests).run();
        System.out.println("Stopping Client...");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/json/JsonClient.java`
#### Snippet
```java

        try (JsonResponse<ResponsePojo> res = p.get()) {
            System.out.println(res);
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/ping/PingServer.java`
#### Snippet
```java
        int port = Integer.parseInt(cmd.getOptionValue("p", "8888"));

        System.out.println(String.format("Starting server on port: %d", port));
        new PingServer(port).run();
        System.out.println("Stopping server...");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tchannel-example/src/main/java/com/uber/tchannel/ping/PingServer.java`
#### Snippet
```java
        System.out.println(String.format("Starting server on port: %d", port));
        new PingServer(port).run();
        System.out.println("Stopping server...");
    }

```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `tchannel-core/src/main/java/com/uber/tchannel/messages/RawResponse.java`
#### Snippet
```java
    }

    public static class Builder extends Response.Builder {

        protected String header = null;
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `tchannel-core/src/main/java/com/uber/tchannel/messages/JsonResponse.java`
#### Snippet
```java
     * @param <T> response body type
     */
    public static class Builder<T> extends EncodedResponse.Builder<T> {

        public Builder(@NotNull JsonRequest<?> req) {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `tchannel-core/src/main/java/com/uber/tchannel/messages/ThriftRequest.java`
#### Snippet
```java
     * @param <T> request body type
     */
    public static class Builder<T> extends EncodedRequest.Builder<T> {

        public Builder(String service, String endpoint) {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `tchannel-core/src/main/java/com/uber/tchannel/messages/ThriftResponse.java`
#### Snippet
```java
     * @param <T> response body type
     */
    public static class Builder<T> extends EncodedResponse.Builder<T> {

        public Builder(@NotNull ThriftRequest<?> req) {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `tchannel-core/src/main/java/com/uber/tchannel/messages/EncodedResponse.java`
#### Snippet
```java
     * @param <T> response body type
     */
    public static class Builder<T> extends Response.Builder {

        private Map<String, String> headers = new HashMap<>();
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `tchannel-core/src/main/java/com/uber/tchannel/messages/EncodedRequest.java`
#### Snippet
```java
     * @param <T> request body type
     */
    public static class Builder<T> extends Request.Builder {

        protected Map<String, String> headers = new HashMap<>();
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `tchannel-core/src/main/java/com/uber/tchannel/messages/JsonRequest.java`
#### Snippet
```java
     * @param <T> request body type
     */
    public static class Builder<T> extends EncodedRequest.Builder<T> {

        public Builder(String service, String endpoint) {
```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `tchannel-core/src/main/java/com/uber/tchannel/messages/RawRequest.java`
#### Snippet
```java
    }

    public static class Builder extends Request.Builder {
        protected String header = null;
        protected String body = null;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary, and can be replaced with an import
in `tchannel-example/src/main/java/com/uber/tchannel/json/JsonClient.java`
#### Snippet
```java
    private JsonClient() {}

    public static void main(String[] args) throws InterruptedException, java.util.concurrent.ExecutionException {
        final TChannel tchannel = new TChannel.Builder("json-server").build();

```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `state` is accessed in both synchronized and unsynchronized contexts
in `tchannel-core/src/main/java/com/uber/tchannel/channels/Connection.java`
#### Snippet
```java

    public Direction direction = Direction.NONE;
    public ConnectionState state = ConnectionState.UNCONNECTED;

    private Peer peer;
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tchannel-example/src/main/java/com/uber/tchannel/basic/AsyncRequest.java`
#### Snippet
```java
        tchannel.makeSubChannel("server")
            .register("pong", new RawRequestHandler() {
                private int count = 0;

                @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/RawResponse.java`
#### Snippet
```java
public class RawResponse extends Response {

    private @Nullable String header = null;
    private @Nullable String body = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/RawResponse.java`
#### Snippet
```java

        protected String header = null;
        protected String body = null;

        public Builder(@NotNull Request req) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/RawResponse.java`
#### Snippet
```java
    public static class Builder extends Response.Builder {

        protected String header = null;
        protected String body = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/RawResponse.java`
#### Snippet
```java

    private @Nullable String header = null;
    private @Nullable String body = null;

    private RawResponse(Builder builder) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/frames/CallFrame.java`
#### Snippet
```java
    public static final short MAX_ARG1_LENGTH = 16384;

    protected byte flags = 0;
    protected ByteBuf payload = null;
    protected ChecksumType checksumType = ChecksumType.NoChecksum;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/frames/CallFrame.java`
#### Snippet
```java
    protected ByteBuf payload = null;
    protected ChecksumType checksumType = ChecksumType.NoChecksum;
    protected int checksum = 0;

    public final byte getFlags() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/frames/CallFrame.java`
#### Snippet
```java

    protected byte flags = 0;
    protected ByteBuf payload = null;
    protected ChecksumType checksumType = ChecksumType.NoChecksum;
    protected int checksum = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/LoadControlHandler.java`
#### Snippet
```java
    private final int high;

    private int outstanding = 0;

    private LoadControlHandler(int low, int high) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tchannel-example/src/main/java/com/uber/tchannel/basic/SyncRequest.java`
#### Snippet
```java
        tchannel.makeSubChannel("server")
            .register("pong", new RawRequestHandler() {
                private int count = 0;

                @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/OutRequest.java`
#### Snippet
```java
    private int retryLimit = 0;
    private @Nullable Timeout timeout = null;
    private @Nullable ChannelFuture channelFuture = null;
    private @Nullable ErrorResponse lastError = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/OutRequest.java`
#### Snippet
```java
    private @Nullable Timeout timeout = null;
    private @Nullable ChannelFuture channelFuture = null;
    private @Nullable ErrorResponse lastError = null;

    public OutRequest(
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/OutRequest.java`
#### Snippet
```java

    private int retryLimit = 0;
    private @Nullable Timeout timeout = null;
    private @Nullable ChannelFuture channelFuture = null;
    private @Nullable ErrorResponse lastError = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/OutRequest.java`
#### Snippet
```java
    private final @NotNull AtomicInteger retryCount = new AtomicInteger(0);

    private int retryLimit = 0;
    private @Nullable Timeout timeout = null;
    private @Nullable ChannelFuture channelFuture = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/EncodedResponse.java`
#### Snippet
```java

    protected Map<String, String> headers;
    protected T body = null;

    protected EncodedResponse(@NotNull Builder<T> builder) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/api/TFuture.java`
#### Snippet
```java
    private final ArgScheme argScheme;
    private final @Nullable TracingContext tracingContext;
    private V response = null;

    private TFuture(ArgScheme argScheme, @Nullable TracingContext tracingContext) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Response.java`
#### Snippet
```java
        protected @NotNull Map<String, String> transportHeaders = new HashMap<>();
        protected ByteBuf arg2 = null;
        protected ByteBuf arg3 = null;
        protected ResponseCode responseCode = ResponseCode.OK;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Response.java`
#### Snippet
```java

        protected @NotNull Map<String, String> transportHeaders = new HashMap<>();
        protected ByteBuf arg2 = null;
        protected ByteBuf arg3 = null;
        protected ResponseCode responseCode = ResponseCode.OK;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/api/TChannel.java`
#### Snippet
```java

        private int bossGroupThreads = 1;
        private int childGroupThreads = 0; // 0 (zero) defaults to NettyRuntime.availableProcessors()

        private final @NotNull HashedWheelTimer timer;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/api/TChannel.java`
#### Snippet
```java
        private Tracer tracer;
        private TracingContext tracingContext;
        private ExecutorService executorService = null;

        private LoadControlHandler.Factory loadControlHandlerFactory;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/api/TChannel.java`
#### Snippet
```java
        private final @NotNull String service;
        private InetAddress host;
        private int port = 0;

        private long initTimeout = -1;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/api/TChannel.java`
#### Snippet
```java

        private final @NotNull HashedWheelTimer timer;
        private static ExecutorService defaultExecutorService = null;
        private EventLoopGroup bossGroup;
        private EventLoopGroup childGroup;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java
    protected String service = null;
    protected ByteBuf arg1 = null;
    protected ByteBuf arg2 = null;
    protected ByteBuf arg3 = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java

    protected long id = -1;
    protected String service = null;
    protected ByteBuf arg1 = null;
    protected ByteBuf arg2 = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java

        private long id = -1;
        private @Nullable String endpoint = null;
        private @Nullable ByteBuf arg1 = null;
        private final String service;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java
        private long id = -1;
        private @Nullable String endpoint = null;
        private @Nullable ByteBuf arg1 = null;
        private final String service;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java
    protected ByteBuf arg1 = null;
    protected ByteBuf arg2 = null;
    protected ByteBuf arg3 = null;

    protected String endpoint = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java
        protected Map<String, String> transportHeaders = new HashMap<>();
        protected ByteBuf arg2 = null;
        protected ByteBuf arg3 = null;

        private long id = -1;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java
    protected final FrameType type = FrameType.CallRequest;

    protected Trace trace = null;

    protected long id = -1;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java
    protected long id = -1;
    protected String service = null;
    protected ByteBuf arg1 = null;
    protected ByteBuf arg2 = null;
    protected ByteBuf arg3 = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java

        protected Map<String, String> transportHeaders = new HashMap<>();
        protected ByteBuf arg2 = null;
        protected ByteBuf arg3 = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java
    protected ByteBuf arg3 = null;

    protected String endpoint = null;
    protected long ttl = 100;
    protected Map<String, String> transportHeaders = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/channels/SubPeer.java`
#### Snippet
```java

    private double score = 0;
    private @Nullable Connection connection = null;
    private Connection.Direction direction = Connection.Direction.NONE;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/channels/SubPeer.java`
#### Snippet
```java
    private final @NotNull PeerManager peerManager;

    private double score = 0;
    private @Nullable Connection connection = null;
    private Connection.Direction direction = Connection.Direction.NONE;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/EncodedRequest.java`
#### Snippet
```java

    protected Map<String, String> headers;
    protected T body = null;

    protected EncodedRequest(Builder<T> builder) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/EncodedRequest.java`
#### Snippet
```java

        protected Map<String, String> headers = new HashMap<>();
        protected T body = null;
        protected ArgScheme argScheme;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/channels/Connection.java`
#### Snippet
```java
    private final @NotNull Channel channel;
    private @Nullable String remoteAddress = null;
    private @Nullable TChannelError lastError = null;
    final protected @NotNull Object lock;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/channels/Connection.java`
#### Snippet
```java
    private Peer peer;
    private final @NotNull Channel channel;
    private @Nullable String remoteAddress = null;
    private @Nullable TChannelError lastError = null;
    final protected @NotNull Object lock;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/RawRequest.java`
#### Snippet
```java
public final class RawRequest extends Request {
    private String header = null;
    private String body = null;

    protected RawRequest(Builder builder) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/RawRequest.java`
#### Snippet
```java
    public static class Builder extends Request.Builder {
        protected String header = null;
        protected String body = null;

        public Builder(String service, String endpoint) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/RawRequest.java`
#### Snippet
```java

    public static class Builder extends Request.Builder {
        protected String header = null;
        protected String body = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/RawRequest.java`
#### Snippet
```java

public final class RawRequest extends Request {
    private String header = null;
    private String body = null;

```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-11-16-21-35.562.html`
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
in `tchannel-core/src/main/java/com/uber/tchannel/frames/FrameType.java`
#### Snippet
```java
                return Error;
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `tchannel-example/src/main/java/com/uber/tchannel/thrift/KeyValueClient.java`
#### Snippet
```java
            if (getResult.isError()) {
                System.out.println("getValue failed due to: " + getResult.getError().getMessage());
                return null;
            } else {
                System.out.println("getValue succeeded");
```

### ReturnNull
Return of `null`
in `tchannel-crossdock/src/main/java/com/uber/tchannel/crossdock/behavior/trace/TraceBehavior.java`
#### Snippet
```java
    private Response callDownstream(Downstream downstream) {
        if (downstream == null) {
            return null;
        }
        logger.info("Calling downstream {}", downstream);
```

### ReturnNull
Return of `null`
in `tchannel-core/src/main/java/com/uber/tchannel/checksum/ChecksumType.java`
#### Snippet
```java
                return CRC32C;
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `tchannel-core/src/main/java/com/uber/tchannel/api/ResponseCode.java`
#### Snippet
```java
                return Error;
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `tchannel-core/src/main/java/com/uber/tchannel/errors/ErrorType.java`
#### Snippet
```java
                return FatalProtocolError;
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/MessageDefragmenter.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `tchannel-core/src/main/java/com/uber/tchannel/messages/EncodedRequest.java`
#### Snippet
```java
                body = serializer.decodeBody(this, bodyType);
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `tchannel-core/src/main/java/com/uber/tchannel/codecs/MessageCodec.java`
#### Snippet
```java

        if (frames.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `tchannel-core/src/main/java/com/uber/tchannel/codecs/MessageCodec.java`
#### Snippet
```java
            first.getHeaders().get(TransportHeaders.ARG_SCHEME_KEY));
        if (!ArgScheme.isSupported(scheme)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `tchannel-core/src/main/java/com/uber/tchannel/codecs/MessageCodec.java`
#### Snippet
```java

        if (frames.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `tchannel-core/src/main/java/com/uber/tchannel/codecs/MessageCodec.java`
#### Snippet
```java
            first.getHeaders().get(TransportHeaders.ARG_SCHEME_KEY));
        if (!ArgScheme.isSupported(scheme)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `tchannel-core/src/main/java/com/uber/tchannel/codecs/MessageCodec.java`
#### Snippet
```java
    public static TChannelMessage decodeCallFrames(List<CallFrame> frames) {
        if (frames.isEmpty()) {
            return null;
        }

```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `TChannelConnectionReset` does not end with 'Exception'
in `tchannel-core/src/main/java/com/uber/tchannel/api/errors/TChannelConnectionReset.java`
#### Snippet
```java
package com.uber.tchannel.api.errors;

public class TChannelConnectionReset extends TChannelError {
    public TChannelConnectionReset() {
        super("Connection reset error", TChannelError.ERROR_CONNECTION_RESET);
```

### ExceptionNameDoesntEndWithException
Exception class name `TChannelProtocol` does not end with 'Exception'
in `tchannel-core/src/main/java/com/uber/tchannel/api/errors/TChannelProtocol.java`
#### Snippet
```java
package com.uber.tchannel.api.errors;

public class TChannelProtocol extends TChannelError {
    public TChannelProtocol(String message) {
        super(message, TChannelError.ERROR_PROTOCOL);
```

### ExceptionNameDoesntEndWithException
Exception class name `TChannelConnectionTimeout` does not end with 'Exception'
in `tchannel-core/src/main/java/com/uber/tchannel/api/errors/TChannelConnectionTimeout.java`
#### Snippet
```java
package com.uber.tchannel.api.errors;

public class TChannelConnectionTimeout extends TChannelError {
    public TChannelConnectionTimeout() {
        super("Connection timeout on identification", TChannelError.ERROR_INIT_TIMEOUT);
```

### ExceptionNameDoesntEndWithException
Exception class name `TChannelNoPeerAvailable` does not end with 'Exception'
in `tchannel-core/src/main/java/com/uber/tchannel/api/errors/TChannelNoPeerAvailable.java`
#### Snippet
```java
package com.uber.tchannel.api.errors;

public class TChannelNoPeerAvailable extends TChannelError {
    public TChannelNoPeerAvailable() {
        super("no peer available for request", TChannelError.ERROR_NO_PEER_AVAILABLE);
```

### ExceptionNameDoesntEndWithException
Exception class name `TChannelConnectionFailure` does not end with 'Exception'
in `tchannel-core/src/main/java/com/uber/tchannel/api/errors/TChannelConnectionFailure.java`
#### Snippet
```java
package com.uber.tchannel.api.errors;

public class TChannelConnectionFailure extends TChannelError {
    public TChannelConnectionFailure(Throwable ex) {
        super("Failed to connect to the host", TChannelError.ERROR_CONNECTION_FAILURE, ex);
```

### ExceptionNameDoesntEndWithException
Exception class name `ProtocolError` does not end with 'Exception'
in `tchannel-core/src/main/java/com/uber/tchannel/errors/ProtocolError.java`
#### Snippet
```java
import com.uber.tchannel.tracing.Trace;

public abstract class ProtocolError extends Exception {

    /**
```

### ExceptionNameDoesntEndWithException
Exception class name `BadRequestError` does not end with 'Exception'
in `tchannel-core/src/main/java/com/uber/tchannel/errors/BadRequestError.java`
#### Snippet
```java
import com.uber.tchannel.tracing.Trace;

public class BadRequestError extends ProtocolError {
    private static final ErrorType errorType = ErrorType.BadRequest;
    private final Trace trace;
```

### ExceptionNameDoesntEndWithException
Exception class name `TChannelError` does not end with 'Exception'
in `tchannel-core/src/main/java/com/uber/tchannel/api/errors/TChannelError.java`
#### Snippet
```java
package com.uber.tchannel.api.errors;

public class TChannelError extends Exception {
    public static final String ERROR_INTERRUPTED = "tchannel.interrupted";
    public static final String ERROR_WRAPPED = "tchannel.wrapped";
```

### ExceptionNameDoesntEndWithException
Exception class name `FatalProtocolError` does not end with 'Exception'
in `tchannel-core/src/main/java/com/uber/tchannel/errors/FatalProtocolError.java`
#### Snippet
```java
import com.uber.tchannel.tracing.Trace;

public class FatalProtocolError extends ProtocolError {
    private static final long ID = 0xFFFFFFFF;
    private static final ErrorType errorType = ErrorType.FatalProtocolError;
```

### ExceptionNameDoesntEndWithException
Exception class name `TChannelWrappedError` does not end with 'Exception'
in `tchannel-core/src/main/java/com/uber/tchannel/api/errors/TChannelWrappedError.java`
#### Snippet
```java
package com.uber.tchannel.api.errors;

public class TChannelWrappedError extends TChannelError {
    public TChannelWrappedError(Throwable ex) {
        super("Wrapped Error", TChannelError.ERROR_WRAPPED, ex);
```

### ExceptionNameDoesntEndWithException
Exception class name `TChannelInterrupted` does not end with 'Exception'
in `tchannel-core/src/main/java/com/uber/tchannel/api/errors/TChannelInterrupted.java`
#### Snippet
```java
package com.uber.tchannel.api.errors;

public class TChannelInterrupted extends TChannelError {
    public TChannelInterrupted(Throwable ex) {
        super("Interrupted ErrorFrame", TChannelError.ERROR_INTERRUPTED, ex);
```

### ExceptionNameDoesntEndWithException
Exception class name `TChannelCodec` does not end with 'Exception'
in `tchannel-core/src/main/java/com/uber/tchannel/api/errors/TChannelCodec.java`
#### Snippet
```java
package com.uber.tchannel.api.errors;

public class TChannelCodec extends TChannelError {
    public TChannelCodec(String message) {
        super(message, TChannelError.ERROR_CODEC);
```

### ExceptionNameDoesntEndWithException
Exception class name `BusyError` does not end with 'Exception'
in `tchannel-core/src/main/java/com/uber/tchannel/errors/BusyError.java`
#### Snippet
```java
import com.uber.tchannel.tracing.Trace;

public class BusyError extends ProtocolError {
    private static final ErrorType errorType = ErrorType.Busy;
    private final Trace trace;
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `obj` is redundant
in `tchannel-crossdock/src/main/java/com/uber/tchannel/crossdock/behavior/trace/ThriftHandler.java`
#### Snippet
```java
        try {
            byteBuf.writeBytes(json.getBytes(StandardCharsets.UTF_8));
            T obj = new JSONSerializer().decodeBody(byteBuf, objClass);
            return obj;
        } finally {
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `tchannel-example/src/main/java/com/uber/tchannel/thrift/KeyValueClient.java`
#### Snippet
```java
        String value = getValue(subChannel, "foo");

        System.out.println(String.format("{'%s' => '%s'}", "foo", value));

        try {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `tchannel-example/src/main/java/com/uber/tchannel/thrift/KeyValueClient.java`
#### Snippet
```java
        try {
            String otherValue = getValue(subChannel, "baz");
            System.out.println(String.format("{'%s' => '%s'}", "foo", otherValue));
        } catch (NotFoundError e) {
            System.out.println(String.format("Key '%s' not found.", e.getKey()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `tchannel-example/src/main/java/com/uber/tchannel/basic/AsyncRequest.java`
#### Snippet
```java
                // when using callback, resource associated with response is released by the the TChannel library
                if (!response.isError()) {
                    System.out.println(String.format("Response received: response code: %s, header: %s, body: %s",
                        response.getResponseCode(),
                        response.getHeader(),
```

### RedundantStringFormatCall
Redundant call to `format()`
in `tchannel-example/src/main/java/com/uber/tchannel/basic/AsyncRequest.java`
#### Snippet
```java
                        response.getBody()));
                } else {
                    System.out.println(String.format("Got error response: %s",
                        response.toString()));
                }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `tchannel-example/src/main/java/com/uber/tchannel/basic/AsyncRequest.java`
#### Snippet
```java

        done.await();
        System.out.println(String.format("%nTime cost: %dms", System.currentTimeMillis() - start));

        // close channels asynchronously
```

### RedundantStringFormatCall
Redundant call to `format()`
in `tchannel-example/src/main/java/com/uber/tchannel/basic/AsyncRequest.java`
#### Snippet
```java
                @Override
                public RawResponse handleImpl(RawRequest request) {
                    System.out.println(String.format("Request received: header: %s, body: %s",
                        request.getHeader(),
                        request.getBody()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `tchannel-example/src/main/java/com/uber/tchannel/basic/SyncRequest.java`
#### Snippet
```java
            try (RawResponse response = future.get()) {
                if (!response.isError()) {
                    System.out.println(String.format("Response received: response code: %s, header: %s, body: %s",
                        response.getResponseCode(),
                        response.getHeader(),
```

### RedundantStringFormatCall
Redundant call to `format()`
in `tchannel-example/src/main/java/com/uber/tchannel/basic/SyncRequest.java`
#### Snippet
```java
                        response.getBody()));
                } else {
                    System.out.println(String.format("Got error response: %s",
                        response.toString()));
                }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `tchannel-example/src/main/java/com/uber/tchannel/basic/SyncRequest.java`
#### Snippet
```java
        }

        System.out.println(String.format("%nTime cost: %dms", System.currentTimeMillis() - start));

        // close channels asynchronously
```

### RedundantStringFormatCall
Redundant call to `format()`
in `tchannel-example/src/main/java/com/uber/tchannel/basic/SyncRequest.java`
#### Snippet
```java
                @Override
                public RawResponse handleImpl(RawRequest request) {
                    System.out.println(String.format("Request received: header: %s, body: %s",
                        request.getHeader(),
                        request.getBody()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `tchannel-example/src/main/java/com/uber/tchannel/ping/PingClient.java`
#### Snippet
```java
        done.await();
        for (Map.Entry<String, AtomicInteger> stringIntegerEntry : msgs.entrySet()) {
            System.out.println(String.format("%s%n\tcount:%s",
                stringIntegerEntry.getKey(), stringIntegerEntry.getValue()
            ));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `tchannel-example/src/main/java/com/uber/tchannel/ping/PingClient.java`
#### Snippet
```java
        int requests = Integer.parseInt(cmd.getOptionValue("n", "10000"));

        System.out.println(String.format("Connecting from client to server on port: %d", port));
        new PingClient(host, port, requests).run();
        System.out.println("Stopping Client...");
```

### RedundantStringFormatCall
Redundant call to `format()`
in `tchannel-example/src/main/java/com/uber/tchannel/ping/PingServer.java`
#### Snippet
```java
        int port = Integer.parseInt(cmd.getOptionValue("p", "8888"));

        System.out.println(String.format("Starting server on port: %d", port));
        new PingServer(port).run();
        System.out.println("Stopping server...");
```

## RuleId[id=WaitNotInLoop]
### WaitNotInLoop
Call to `wait()` is not in loop
in `tchannel-core/src/main/java/com/uber/tchannel/channels/Connection.java`
#### Snippet
```java
                if (this.state != ConnectionState.IDENTIFIED) {
                    this.lastError = null;
                    lock.wait(timeout);
                }
            } catch (InterruptedException ex) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `retryLimit` initializer `0` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/OutRequest.java`
#### Snippet
```java
    private final @NotNull AtomicInteger retryCount = new AtomicInteger(0);

    private int retryLimit = 0;
    private @Nullable Timeout timeout = null;
    private @Nullable ChannelFuture channelFuture = null;
```

### UnusedAssignment
Variable `id` initializer `-1` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Response.java`
#### Snippet
```java
        protected ResponseCode responseCode = ResponseCode.OK;

        private long id = -1;

        public Builder(@NotNull Request req) {
```

### UnusedAssignment
Variable `arg2` initializer `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java
    protected String service = null;
    protected ByteBuf arg1 = null;
    protected ByteBuf arg2 = null;
    protected ByteBuf arg3 = null;

```

### UnusedAssignment
Variable `service` initializer `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java

    protected long id = -1;
    protected String service = null;
    protected ByteBuf arg1 = null;
    protected ByteBuf arg2 = null;
```

### UnusedAssignment
Variable `arg3` initializer `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java
    protected ByteBuf arg1 = null;
    protected ByteBuf arg2 = null;
    protected ByteBuf arg3 = null;

    protected String endpoint = null;
```

### UnusedAssignment
Variable `ttl` initializer `100` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java

    protected String endpoint = null;
    protected long ttl = 100;
    protected Map<String, String> transportHeaders = new HashMap<>();

```

### UnusedAssignment
Variable `transportHeaders` initializer `new HashMap<>()` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java
    protected String endpoint = null;
    protected long ttl = 100;
    protected Map<String, String> transportHeaders = new HashMap<>();

    protected final int retryLimit;
```

### UnusedAssignment
Variable `arg1` initializer `null` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java
    protected long id = -1;
    protected String service = null;
    protected ByteBuf arg1 = null;
    protected ByteBuf arg2 = null;
    protected ByteBuf arg3 = null;
```

### UnusedAssignment
Variable `direction` initializer `Connection.Direction.NONE` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/channels/SubPeer.java`
#### Snippet
```java
    private double score = 0;
    private @Nullable Connection connection = null;
    private Connection.Direction direction = Connection.Direction.NONE;

    public SubPeer(SocketAddress remoteAddress, @NotNull SubChannel subChannel) {
```

### UnusedAssignment
Variable `direction` initializer `Direction.NONE` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/channels/Connection.java`
#### Snippet
```java
    private static final String EPHEMERAL = "0.0.0.0:0";

    public Direction direction = Direction.NONE;
    public ConnectionState state = ConnectionState.UNCONNECTED;

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `response != null` is always `true`
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/ResponseRouter.java`
#### Snippet
```java
        }

        if (response != null) {
            // Reset timeout counter if we receive a non-timeout response.
            if (!(response.isError() &&
```

### ConstantValue
Condition `service == null` is always `false`
in `tchannel-core/src/main/java/com/uber/tchannel/api/TChannel.java`
#### Snippet
```java

        public Builder(@NotNull String service) {
            if (service == null) {
                throw new NullPointerException("`service` cannot be null");
            }
```

### ConstantValue
Value `flag` is always 'false'
in `tchannel-core/src/main/java/com/uber/tchannel/channels/SubPeer.java`
#### Snippet
```java
        if (peer == null) {
            score = SCORE_UNCONNECTED;
            return flag;
        }

```

### ConstantValue
Condition `service == null` is always `false`
in `tchannel-hyperbahn/src/main/java/com/uber/tchannel/hyperbahn/api/HyperbahnClient.java`
#### Snippet
```java

        public Builder(@NotNull String service, @NotNull TChannel channel) {
            if (service == null) {
                throw new NullPointerException("`service` cannot be null");
            }
```

### ConstantValue
Condition `channel == null` is always `false`
in `tchannel-hyperbahn/src/main/java/com/uber/tchannel/hyperbahn/api/HyperbahnClient.java`
#### Snippet
```java
            }

            if (channel == null) {
                throw new NullPointerException("`channel` cannot be null");
            }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.util.concurrent.Futures' is marked unstable with @Beta
in `tchannel-core/src/main/java/com/uber/tchannel/api/TFuture.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public void addCallback(final TFutureCallback<V> callback) {
        Futures.addCallback(this, new FutureCallback<V>() {
            @Override
            public void onSuccess(V response) {
```

### UnstableApiUsage
'addCallback(com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.FutureCallback, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.Futures' marked with @Beta
in `tchannel-core/src/main/java/com/uber/tchannel/api/TFuture.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public void addCallback(final TFutureCallback<V> callback) {
        Futures.addCallback(this, new FutureCallback<V>() {
            @Override
            public void onSuccess(V response) {
```

### UnstableApiUsage
'com.google.common.util.concurrent.Futures' is marked unstable with @Beta
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/RequestRouter.java`
#### Snippet
```java

        // Add callback handlers that close out the tracing span and then proxy the response.
        Futures.addCallback(responseFuture, new FutureCallback<Response>() {
            @Override
            public void onSuccess(Response response) {
```

### UnstableApiUsage
'addCallback(com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.FutureCallback, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.Futures' marked with @Beta
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/RequestRouter.java`
#### Snippet
```java

        // Add callback handlers that close out the tracing span and then proxy the response.
        Futures.addCallback(responseFuture, new FutureCallback<Response>() {
            @Override
            public void onSuccess(Response response) {
```

### UnstableApiUsage
'com.google.common.util.concurrent.Futures' is marked unstable with @Beta
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/RequestRouter.java`
#### Snippet
```java
        } catch (Throwable re) {
            request.releaseQuietly();
            responseFuture = Futures.immediateFailedFuture(re);
        }

```

### UnstableApiUsage
'immediateFailedFuture(java.lang.Throwable)' is declared in unstable class 'com.google.common.util.concurrent.Futures' marked with @Beta
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/RequestRouter.java`
#### Snippet
```java
        } catch (Throwable re) {
            request.releaseQuietly();
            responseFuture = Futures.immediateFailedFuture(re);
        }

```

### UnstableApiUsage
'com.google.common.util.concurrent.Futures' is marked unstable with @Beta
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/RequestRouter.java`
#### Snippet
```java
        }

        Futures.addCallback(responseFuture, new FutureCallback<Response>() {

            @Override
```

### UnstableApiUsage
'addCallback(com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.FutureCallback, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.Futures' marked with @Beta
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/RequestRouter.java`
#### Snippet
```java
        }

        Futures.addCallback(responseFuture, new FutureCallback<Response>() {

            @Override
```

