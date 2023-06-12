# tchannel-java 
 
# Bad smells
I found 141 bad smells with 24 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DataFlowIssue | 31 | false |
| ProtectedMemberInFinalClass | 21 | true |
| RedundantStringFormatCall | 13 | false |
| NullableProblems | 10 | false |
| UnusedAssignment | 10 | false |
| DuplicatedCode | 9 | false |
| FieldCanBeLocal | 8 | false |
| UnstableApiUsage | 8 | false |
| Deprecation | 6 | false |
| ConstantValue | 5 | false |
| JavadocReference | 4 | false |
| JavadocDeclaration | 2 | false |
| DuplicateBranchesInSwitch | 2 | false |
| SwitchStatementWithTooFewBranches | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| NegativeIntConstantInLongContext | 2 | false |
| AutoCloseableResource | 1 | false |
| CommentedOutCode | 1 | false |
| IOStreamConstructor | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| TrivialIf | 1 | false |
## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/RequestRouter.java`
#### Snippet
```java
        // clean up the queue
        while (!responseQueue.isEmpty()) {
            responseQueue.poll().release();
        }
    }
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `arg1` is inaccessible from here
in `tchannel-core/src/main/java/com/uber/tchannel/messages/ThriftRequest.java`
#### Snippet
```java

        /**
         * Validates payload, populates {@link #arg1}, {@link #arg2}, {@link #arg3} and builds {@link ThriftRequest}.
         *
         * Args above will be auto-released if validation fails.
```

### JavadocReference
Symbol `arg1` is inaccessible from here
in `tchannel-core/src/main/java/com/uber/tchannel/messages/ThriftRequest.java`
#### Snippet
```java

        /**
         * Validates payload and populates {@link #arg1}, {@link #arg2}, {@link #arg3}.
         *
         * Args <b>>need</b> to be cleared if validation fails.
```

### JavadocReference
Symbol `arg1` is inaccessible from here
in `tchannel-core/src/main/java/com/uber/tchannel/messages/ThriftResponse.java`
#### Snippet
```java

        /**
         * Validates payload, populates {@link #arg1}, {@link #arg2}, {@link #arg3} and builds {@link ThriftResponse}.
         *
         * Args above will be auto-released if validation fails.
```

### JavadocReference
Symbol `arg1` is inaccessible from here
in `tchannel-core/src/main/java/com/uber/tchannel/messages/ThriftResponse.java`
#### Snippet
```java

        /**
         * Validates payload and populates {@link #arg1}, {@link #arg2}, {@link #arg3}.
         *
         * Args <b>>need</b> to be cleared if validation fails.
```

## RuleId[id=DataFlowIssue]
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
in `tchannel-core/src/main/java/com/uber/tchannel/frames/CallResponseFrame.java`
#### Snippet
```java

        // (csum:4){0,1}
        checksum = CodecUtils.decodeChecksum(checksumType, tFrame.payload);

        // arg1~2 arg2~2 arg3~2
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
Argument `message.getArg3()` might be null
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Serializer.java`
#### Snippet
```java

    public <T> T decodeBody(RawMessage message, Class<T> bodyType) {
        return this.getSerializer(message).decodeBody(message.getArg3(), bodyType);
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
Argument `checksumType` might be null
in `tchannel-core/src/main/java/com/uber/tchannel/frames/CallResponseContinueFrame.java`
#### Snippet
```java

        // (csum:4){0,1}
        checksum = CodecUtils.decodeChecksum(checksumType, tFrame.payload);

        // {continuation}
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
Argument `checksumType` might be null
in `tchannel-core/src/main/java/com/uber/tchannel/frames/CallRequestFrame.java`
#### Snippet
```java

        // (csum:4){0,1}
        checksum = CodecUtils.decodeChecksum(checksumType, tFrame.payload);

        // arg1~2 arg2~2 arg3~2
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Exception is not declared to be thrown by method validate
in `tchannel-core/src/main/java/com/uber/tchannel/messages/ThriftRequest.java`
#### Snippet
```java
         * Use {@link #release()} to clear args above.
         *
         * @throws Exception
         *     if validation fails.
         */
```

### JavadocDeclaration
Exception is not declared to be thrown by method validate
in `tchannel-core/src/main/java/com/uber/tchannel/messages/ThriftResponse.java`
#### Snippet
```java
         * Use {@link #release()} to clear args above.
         *
         * @throws Exception
         *     if validation fails.
         */
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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/InitRequestInitiator.java`
#### Snippet
```java
        );

        switch (frame.getType()) {

            case InitResponse:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `tchannel-core/src/main/java/com/uber/tchannel/handlers/InitRequestHandler.java`
#### Snippet
```java
        );

        switch (frame.getType()) {

            case InitRequest:
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `tchannel-benchmark/src/main/java/com/uber/tchannel/benchmarks/LargePayloadBenchmark.java`
#### Snippet
```java
        this.host = InetAddress.getByName(null);
        this.channel = new TChannel.Builder("ping-server")
            .setServerHost(host)
            .setBossGroup(bossGroup)
            .setChildGroup(childGroup)
            .build();
        channel.makeSubChannel("ping-server").register("ping", new PingDefaultRequestHandler());
        channel.listen();
        this.port = this.channel.getListeningPort();
```

### DuplicatedCode
Duplicated code
in `tchannel-benchmark/src/main/java/com/uber/tchannel/benchmarks/LargePayloadBenchmark.java`
#### Snippet
```java
                if (!pongResponse.isError()) {
                    counters.actualQPS.incrementAndGet();
                } else {
                    switch (pongResponse.getError().getErrorType()) {
                        case Busy:
                            counters.busyQPS.incrementAndGet();
                            break;
                        case Timeout:
                            counters.timeoutQPS.incrementAndGet();
                            break;
                        case NetworkError:
                            counters.networkQPS.incrementAndGet();
                            break;
                        default:
                            counters.errorQPS.incrementAndGet();
                    }
                }
```

### DuplicatedCode
Duplicated code
in `tchannel-core/src/main/java/com/uber/tchannel/codecs/MessageCodec.java`
#### Snippet
```java
        ArgScheme scheme = ArgScheme.toScheme(
            first.getHeaders().get(TransportHeaders.ARG_SCHEME_KEY));
        if (!ArgScheme.isSupported(scheme)) {
            return null;
        }

        List<ByteBuf> args = new ArrayList<>();
        for (CallFrame frame : frames) {
            CodecUtils.readArgs(args, frame.getPayload());
            frame.release();
        }

        if (args.size() != 3) {
            for (ByteBuf arg : args) {
                arg.release();
            }

            throw new UnsupportedOperationException("The arg count is not should be 3 instead of " + args.size());
        }
```

### DuplicatedCode
Duplicated code
in `tchannel-core/src/main/java/com/uber/tchannel/frames/CallRequestContinueFrame.java`
#### Snippet
```java
        ByteBuf buffer = allocator.buffer(2, 6);
        boolean release = true;
        try {
            // flags:1
            buffer.writeByte(getFlags());

            // csumtype:1
            buffer.writeByte(getChecksumType().byteValue());

            // checksum -> (csum:4){0,1}
            CodecUtils.encodeChecksum(getChecksum(), getChecksumType(), buffer);
            release = false;
        } finally {
            if (release) {
                buffer.release();
            }
        }

        return buffer;
```

### DuplicatedCode
Duplicated code
in `tchannel-core/src/main/java/com/uber/tchannel/frames/CallRequestFrame.java`
#### Snippet
```java
        headers = CodecUtils.decodeSmallHeaders(tFrame.payload);

        // csumtype:1
        checksumType = ChecksumType.fromByte(tFrame.payload.readByte());

        // (csum:4){0,1}
        checksum = CodecUtils.decodeChecksum(checksumType, tFrame.payload);

        // arg1~2 arg2~2 arg3~2
        int payloadSize = tFrame.size - tFrame.payload.readerIndex();
        payload = tFrame.payload.readSlice(payloadSize);
```

### DuplicatedCode
Duplicated code
in `tchannel-core/src/main/java/com/uber/tchannel/frames/InitRequestFrame.java`
#### Snippet
```java
        ByteBuf buffer = allocator.buffer(256);

        boolean release = true;
        try {
            // version:2
            buffer.writeShort(getVersion());

            // headers -> nh:2 (key~2 value~2){nh}
            CodecUtils.encodeHeaders(getHeaders(), buffer);
            release = false;
        } finally {
            if (release) {
                buffer.release();
            }
        }
        return buffer;
```

### DuplicatedCode
Duplicated code
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java
        if (arg2 != null) {
            try {
                arg2.release();
                arg2 = null;
            } catch (RuntimeException ex) {
                if (releaseError != null) {
                    releaseError.addSuppressed(ex);
                } else {
                    releaseError = ex;
                }
            }
        }

        if (arg3 != null) {
            try {
                arg3.release();
                arg3 = null;
            } catch (RuntimeException ex) {
                if (releaseError != null) {
                    releaseError.addSuppressed(ex);
                } else {
                    releaseError = ex;
                }
            }
        }

        if (releaseError != null) {
            throw releaseError;
        }
```

### DuplicatedCode
Duplicated code
in `tchannel-example/src/main/java/com/uber/tchannel/basic/AsyncRequest.java`
#### Snippet
```java
        TChannel tchannel = new TChannel.Builder("server")
            .setServerHost(InetAddress.getByName(null))
            .setServerPort(8888)
            .build();

        // create sub channel to register the service and endpoint handler
        tchannel.makeSubChannel("server")
            .register("pong", new RawRequestHandler() {
                private int count = 0;

                @Override
                public RawResponse handleImpl(RawRequest request) {
                    System.out.println(String.format("Request received: header: %s, body: %s",
                        request.getHeader(),
                        request.getBody()));

                    count++;
                    switch (count) {
                        case 1:
                            return new RawResponse.Builder(request)
                                .setTransportHeaders(request.getTransportHeaders())
                                .setHeader("Polo")
                                .setBody("Pong!")
                                .build();
                        case 2:
                            return new RawResponse.Builder(request)
                                .setTransportHeaders(request.getTransportHeaders())
                                .setResponseCode(ResponseCode.Error)
                                .setHeader("Polo")
                                .setBody("I feel bad ...")
                                .build();
                        default:
                            throw new UnsupportedOperationException("I feel very bad!");
                    }
                }
            });

        tchannel.listen();

        return tchannel;
```

### DuplicatedCode
Duplicated code
in `tchannel-example/src/main/java/com/uber/tchannel/ping/PingClient.java`
#### Snippet
```java
        options.addOption("?", "help", false, "Usage");
        HelpFormatter formatter = new HelpFormatter();

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        if (cmd.hasOption("?")) {
            formatter.printHelp("PingClient", options, true);
            return;
        }
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `tchannel-hyperbahn/src/main/java/com/uber/tchannel/hyperbahn/api/HyperbahnClient.java`
#### Snippet
```java

            List<String> hostPorts;
            try (Reader reader = new InputStreamReader(new FileInputStream(hostsFilePath), StandardCharsets.UTF_8)) {
                hostPorts = new Gson().fromJson(reader, LIST_OF_STRINGS);
            }
```

## RuleId[id=ProtectedMemberInFinalClass]
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
in `tchannel-core/src/main/java/com/uber/tchannel/messages/RawRequest.java`
#### Snippet
```java
    }

    protected RawRequest(long id, long ttl, Trace trace,
                      String service, Map<String, String> transportHeaders,
                      ByteBuf arg1, ByteBuf arg2, ByteBuf arg3) {
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
in `tchannel-core/src/main/java/com/uber/tchannel/api/SubChannel.java`
#### Snippet
```java
    }

    protected <V extends Response> TFuture<V> sendRequest(
        Request request,
        InetAddress host,
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

## RuleId[id=Deprecation]
### Deprecation
'active()' is deprecated
in `tchannel-core/src/main/java/com/uber/tchannel/tracing/OpenTracingContext.java`
#### Snippet
```java
    public @NotNull Span popSpan() throws EmptyStackException {
        //auto close scope acts as if we pop the span
        try (Scope scope = scopeManager.active()) {
            if (scope == null) {
                throw new EmptyStackException();
```

### Deprecation
'span()' is deprecated
in `tchannel-core/src/main/java/com/uber/tchannel/tracing/OpenTracingContext.java`
#### Snippet
```java
                throw new EmptyStackException();
            }
            return scope.span();
        }
    }
```

### Deprecation
'active()' is deprecated
in `tchannel-core/src/main/java/com/uber/tchannel/tracing/OpenTracingContext.java`
#### Snippet
```java
    public void clear() {
        Scope lastScope = null;
        Scope scope = scopeManager.active();
        //NoopScopeManager will always return the same INSTANCE as active scope
        //to avoid infinite loop we need to check if we are closing the same instance again and again
```

### Deprecation
'active()' is deprecated
in `tchannel-core/src/main/java/com/uber/tchannel/tracing/OpenTracingContext.java`
#### Snippet
```java
            scope.close();
            lastScope = scope;
            scope = scopeManager.active();
        }
    }
```

### Deprecation
'startManual()' is deprecated
in `tchannel-core/src/main/java/com/uber/tchannel/tracing/Tracing.java`
#### Snippet
```java
            .withTag("as", request.getArgScheme().name());

        final Span span = builder.startManual();

        if (tracingContext instanceof RequestSpanInterceptor) {
```

### Deprecation
'startManual()' is deprecated
in `tchannel-core/src/main/java/com/uber/tchannel/tracing/Tracing.java`
#### Snippet
```java
        // TODO add tags for peer host:port

        Span span = builder.startManual();

        // invoke additional processing of the request and the span by request span interceptor(s), if any
```

## RuleId[id=RedundantStringFormatCall]
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
in `tchannel-example/src/main/java/com/uber/tchannel/ping/PingServer.java`
#### Snippet
```java
        int port = Integer.parseInt(cmd.getOptionValue("p", "8888"));

        System.out.println(String.format("Starting server on port: %d", port));
        new PingServer(port).run();
        System.out.println("Stopping server...");
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

## RuleId[id=UnnecessaryToStringCall]
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `tchannel-example/src/main/java/com/uber/tchannel/hyperbahn/HyperbahnExample.java`
#### Snippet
```java
        tchannel.listen();

        List<InetSocketAddress> routers = Arrays.asList(
            new InetSocketAddress("127.0.0.1", 21300)
        );
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `tchannel-core/src/main/java/com/uber/tchannel/api/TFuture.java`
#### Snippet
```java

    @Override
    public V get(long timeout, TimeUnit unit) {
        throw new UnsupportedOperationException("Get timeout is unsupported. Use request timeout instead.");
    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `tchannel-core/src/main/java/com/uber/tchannel/api/TFuture.java`
#### Snippet
```java

    @Override
    public void addListener(final Runnable listener, Executor exec) {
        listenerCount.incrementAndGet();
        // this is the current span of whomever is adding the listener - preserve it for the invocation of the latter
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `tchannel-core/src/main/java/com/uber/tchannel/api/TFuture.java`
#### Snippet
```java

    @Override
    public void addListener(final Runnable listener, Executor exec) {
        listenerCount.incrementAndGet();
        // this is the current span of whomever is adding the listener - preserve it for the invocation of the latter
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `tchannel-core/src/main/java/com/uber/tchannel/api/TFuture.java`
#### Snippet
```java

    @Override
    public boolean setException(Throwable throwable) {
        return super.setException(throwable);
    }
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

## RuleId[id=UnusedAssignment]
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
Variable `direction` initializer `Direction.NONE` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/channels/Connection.java`
#### Snippet
```java
    private static final String EPHEMERAL = "0.0.0.0:0";

    public Direction direction = Direction.NONE;
    public ConnectionState state = ConnectionState.UNCONNECTED;

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
Variable `ttl` initializer `100` is redundant
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java

    protected String endpoint = null;
    protected long ttl = 100;
    protected Map<String, String> transportHeaders = new HashMap<>();

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

## RuleId[id=NegativeIntConstantInLongContext]
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

## RuleId[id=ConstantValue]
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

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `tchannel-benchmark/src/main/java/com/uber/tchannel/benchmarks/PingPongMultiServerBenchmark.java`
#### Snippet
```java

    public static class Pong {
        private final String response;

        public Pong(String response) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tchannel-benchmark/src/main/java/com/uber/tchannel/benchmarks/PingPongMultiServerBenchmark.java`
#### Snippet
```java

    public static class Ping {
        private final String request;

        public Ping(String request) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tchannel-benchmark/src/main/java/com/uber/tchannel/benchmarks/PingPongServerBenchmark.java`
#### Snippet
```java

    public static class Ping {
        private final String request;

        public Ping(String request) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tchannel-benchmark/src/main/java/com/uber/tchannel/benchmarks/PingPongServerBenchmark.java`
#### Snippet
```java

    public static class Pong {
        private final String response;

        public Pong(String response) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tchannel-example/src/main/java/com/uber/tchannel/ping/Pong.java`
#### Snippet
```java

public class Pong {
    private final String response;

    public Pong(String response) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tchannel-example/src/main/java/com/uber/tchannel/ping/Ping.java`
#### Snippet
```java

public class Ping {
    private final String request;

    public Ping(String request) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tchannel-hyperbahn/src/main/java/com/uber/tchannel/hyperbahn/api/HyperbahnClient.java`
#### Snippet
```java
    private final SubChannel hyperbahnChannel;
    private final List<InetSocketAddress> routers;
    private final long advertiseTimeout;
    private final long advertiseInterval;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `tchannel-core/src/main/java/com/uber/tchannel/messages/Request.java`
#### Snippet
```java
        protected ByteBuf arg3 = null;

        private long id = -1;
        private @Nullable String endpoint = null;
        private @Nullable ByteBuf arg1 = null;
```

## RuleId[id=UnstableApiUsage]
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

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `tchannel-core/src/main/java/com/uber/tchannel/channels/Connection.java`
#### Snippet
```java
            } else if (connState == preferredState || connState == ConnectionState.IDENTIFIED) {
                return true;
            } else if (connState == ConnectionState.CONNECTED && preferredState == ConnectionState.UNCONNECTED) {
                return true;
            } else {
```

