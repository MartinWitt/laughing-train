# httpcomponents-core 
 
# Bad smells
I found 233 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicatedCode | 50 | false |
| StringBufferReplaceableByString | 39 | false |
| NullableProblems | 36 | false |
| DataFlowIssue | 17 | false |
| AutoCloseableResource | 16 | false |
| JavadocDeclaration | 15 | false |
| FieldCanBeLocal | 10 | false |
| CatchMayIgnoreException | 9 | false |
| JavadocLinkAsPlainText | 8 | false |
| EmptyStatementBody | 3 | false |
| DeprecatedIsStillUsed | 3 | false |
| NonFinalFieldInEnum | 3 | false |
| RegExpSimplifiable | 3 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 3 | false |
| JavadocReference | 2 | false |
| SuspiciousSystemArraycopy | 2 | false |
| SwitchStatementWithTooFewBranches | 2 | false |
| ManualMinMaxCalculation | 2 | false |
| IgnoreResultOfCall | 2 | false |
| RedundantMethodOverride | 2 | false |
| EmptyTryBlock | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| IOStreamConstructor | 1 | false |
| DanglingJavadoc | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| FieldMayBeFinal | 1 | false |
## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `Publisher`
in `httpcore5-reactive/src/main/java/org/apache/hc/core5/reactive/ReactiveResponseConsumer.java`
#### Snippet
```java
/**
 * An {@link AsyncResponseConsumer} that publishes the response body through
 * a {@link Publisher}, as defined by the Reactive Streams specification. The
 * response is represented as a {@link Message} consisting of a {@link
 * HttpResponse} representing the headers and a {@link Publisher} representing
```

### JavadocReference
Cannot resolve symbol `Publisher`
in `httpcore5-reactive/src/main/java/org/apache/hc/core5/reactive/ReactiveResponseConsumer.java`
#### Snippet
```java
 * a {@link Publisher}, as defined by the Reactive Streams specification. The
 * response is represented as a {@link Message} consisting of a {@link
 * HttpResponse} representing the headers and a {@link Publisher} representing
 * the response body as an asynchronous stream of {@link ByteBuffer} instances.
 *
```

## RuleId[id=EmptyTryBlock]
### EmptyTryBlock
Empty `try` block
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/io/DefaultBHttpClientConnection.java`
#### Snippet
```java
        final long len = this.outgoingContentStrategy.determineLength(request);
        if (len == ContentLengthStrategy.CHUNKED) {
            try (final OutputStream outStream = createContentOutputStream(len, this.outbuffer, socketHolder.getOutputStream(), entity.getTrailers())) {
                // just close
            }
```

## RuleId[id=SuspiciousSystemArraycopy]
### SuspiciousSystemArraycopy
Source parameter type 'org.apache.hc.core5.http.Header\[\]' is not assignable to destination parameter `newArray` of type 'org.apache.hc.core5.http2.hpack.HPackHeader\[\]'
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/hpack/FifoBuffer.java`
#### Snippet
```java
        final int len = oldArray.length;
        final HPackHeader[] newArray = new HPackHeader[newcapacity];
        System.arraycopy(oldArray, head, newArray, 0, len - head);
        System.arraycopy(oldArray, 0, newArray, len - head, head);
        array = newArray;
```

### SuspiciousSystemArraycopy
Source parameter type 'org.apache.hc.core5.http.Header\[\]' is not assignable to destination parameter `newArray` of type 'org.apache.hc.core5.http2.hpack.HPackHeader\[\]'
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/hpack/FifoBuffer.java`
#### Snippet
```java
        final HPackHeader[] newArray = new HPackHeader[newcapacity];
        System.arraycopy(oldArray, head, newArray, 0, len - head);
        System.arraycopy(oldArray, 0, newArray, len - head, head);
        array = newArray;
        head = len;
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `contains` may produce `NullPointerException`
in `httpcore5/src/main/java/org/apache/hc/core5/net/Host.java`
#### Snippet
```java
        final int port;
        if (!TextUtils.isBlank(portText)) {
            if (!ipv6Brackets && portText.contains(":")) {
                throw URISupport.createException(s, cursor, "Expected IPv6 address to be enclosed in brackets");
            }
```

### DataFlowIssue
Argument `portText` might be null
in `httpcore5/src/main/java/org/apache/hc/core5/net/Host.java`
#### Snippet
```java
            }
            try {
                port = Integer.parseInt(portText);
            } catch (final NumberFormatException ex) {
                throw URISupport.createException(s, cursor, "Port is invalid");
```

### DataFlowIssue
Dereference of `REASON_PHRASES[category]` may produce `NullPointerException`
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/EnglishReasonPhraseCatalog.java`
#### Snippet
```java

        String reason = null;
        if (REASON_PHRASES[category].length > subcode) {
            reason = REASON_PHRASES[category][subcode];
        }
```

### DataFlowIssue
Array access `REASON_PHRASES[category][subcode]` may produce `NullPointerException`
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/EnglishReasonPhraseCatalog.java`
#### Snippet
```java
        String reason = null;
        if (REASON_PHRASES[category].length > subcode) {
            reason = REASON_PHRASES[category][subcode];
        }

```

### DataFlowIssue
Array access `REASON_PHRASES[category][subcode]` may produce `NullPointerException`
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/EnglishReasonPhraseCatalog.java`
#### Snippet
```java
        final int category = status / 100;
        final int subcode  = status - 100*category;
        REASON_PHRASES[category][subcode] = reason;
    }

```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/nio/ServerHttp1IOEventHandlerFactory.java`
#### Snippet
```java
                tlsStrategy.upgrade(
                        ioSession,
                        null,
                        attachment,
                        handshakeTimeout,
```

### DataFlowIssue
Method invocation `addHeader` may produce `NullPointerException`
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/nio/AbstractMessageParser.java`
#### Snippet
```java
        if (this.state ==State. COMPLETED) {
            for (final CharArrayBuffer buffer : this.headerBufs) {
                this.message.addHeader(this.lineParser.parseHeader(buffer));
            }
            return this.message;
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/bootstrap/HttpRequester.java`
#### Snippet
```java
                final HttpClientConnection localConn = connectionHolder.getConnection();
                if (!requestExecutor.keepAlive(request, response, localConn, context)) {
                    localConn.close();
                }
                connectionHolder.releaseConnection();
```

### DataFlowIssue
Method invocation `isTerminal` may produce `NullPointerException`
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/hpack/HuffmanDecoder.java`
#### Snippet
```java
            HuffmanNode current = root;
            while (length > 8) {
                if (current.isTerminal()) {
                    throw new IllegalStateException("Invalid Huffman code: prefix not unique");
                }
```

### DataFlowIssue
Method invocation `setChild` may produce `NullPointerException`
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/hpack/HuffmanDecoder.java`
#### Snippet
```java
            final int end = 1 << shift;
            for (int i = start; i < start + end; i++) {
                current.setChild(i, terminal);
            }
        }
```

### DataFlowIssue
Method invocation `getBits` may produce `NullPointerException`
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/hpack/HuffmanDecoder.java`
#### Snippet
```java
                final int c = (current >>> (bits - 8)) & 0xFF;
                node = node.getChild(c);
                bits -= node.getBits();
                if (node.isTerminal()) {
                    if (node.getSymbol() == Huffman.EOS) {
```

### DataFlowIssue
Method invocation `isTerminal` may produce `NullPointerException`
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/hpack/HuffmanDecoder.java`
#### Snippet
```java
            final int c = (current << (8 - bits)) & 0xFF;
            node = node.getChild(c);
            if (node.isTerminal() && node.getBits() <= bits) {
                bits -= node.getBits();
                out.append(node.getSymbol());
```

### DataFlowIssue
Dereference of `type` may produce `NullPointerException`
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/frame/FramePrinter.java`
#### Snippet
```java
        final int flags = frame.getFlags();
        if (flags > 0) {
            switch (type) {
                case SETTINGS:
                case PING:
```

### DataFlowIssue
Dereference of `type` may produce `NullPointerException`
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/frame/FramePrinter.java`
#### Snippet
```java
        if (buf != null) {

            switch (type) {
                case SETTINGS:
                    if ((buf.remaining() % 6) == 0) {
```

### DataFlowIssue
Argument `frame.getPayload()` might be null
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/frame/FramePrinter.java`
#### Snippet
```java
                    break;
                default:
                    printData(frame.getPayload(), appendable);
            }
        }
```

### DataFlowIssue
Method invocation `getInt` may produce `NullPointerException`
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/nio/AbstractH2StreamMultiplexer.java`
#### Snippet
```java
        if (frame.isFlagSet(FrameFlag.PRIORITY)) {
            // Priority not supported
            payload.getInt();
            payload.get();
        }
```

### DataFlowIssue
Dereference of `frameType` may produce `NullPointerException`
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/nio/AbstractH2StreamMultiplexer.java`
#### Snippet
```java
            throw new H2ConnectionException(H2Error.PROTOCOL_ERROR, "CONTINUATION frame expected");
        }
        switch (frameType) {
            case DATA: {
                final H2Stream stream = getValidStream(streamId);
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `httpcore5/src/main/java/org/apache/hc/core5/http/nio/support/classic/ContentInputStream.java`
#### Snippet
```java
        // read and discard the remainder of the message
        final byte[] tmp = new byte[1024];
        while (this.buffer.read(tmp, 0, tmp.length) >= 0) {
        }
        super.close();
```

### EmptyStatementBody
`while` statement has empty body
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/io/ContentLengthInputStream.java`
#### Snippet
```java
                if (pos < contentLength) {
                    final byte[] buffer = new byte[BUFFER_SIZE];
                    while (read(buffer) >= 0) {
                        // keep reading
                    }
```

### EmptyStatementBody
`while` statement has empty body
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/io/ChunkedInputStream.java`
#### Snippet
```java
                    // read and discard the remainder of the message
                    final byte[] buff = new byte[BUFFER_SIZE];
                    while (read(buff) >= 0) {
                    }
                }
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `split`
in `httpcore5/src/main/java/org/apache/hc/core5/util/TimeValue.java`
#### Snippet
```java
     */
    public static TimeValue parse(final String value) throws ParseException {
        final String split[] = value.trim().split("\\s+");
        if (split.length < 2) {
            throw new IllegalArgumentException(
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'CONTENT_TYPE_MAP' is still used
in `httpcore5/src/main/java/org/apache/hc/core5/http/ContentType.java`
#### Snippet
```java
     */
    @Deprecated
    private static final Map<String, ContentType> CONTENT_TYPE_MAP;
    static {

```

### DeprecatedIsStillUsed
Deprecated member 'SecurePortStrategy' is still used
in `httpcore5/src/main/java/org/apache/hc/core5/http/nio/ssl/SecurePortStrategy.java`
#### Snippet
```java
 */
@Deprecated
public interface SecurePortStrategy {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'BasicServerTlsStrategy' is still used
in `httpcore5/src/main/java/org/apache/hc/core5/http/nio/ssl/BasicServerTlsStrategy.java`
#### Snippet
```java
     */
    @Deprecated
    public BasicServerTlsStrategy(
            final SSLContext sslContext,
            final SecurePortStrategy securePortStrategy,
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/nio/ServerHttp1StreamHandler.java`
#### Snippet
```java

    void produceOutput() throws HttpException, IOException {
        switch (responseState) {
            case BODY:
                exchangeHandler.produce(internalDataChannel);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/nio/ServerHttp1StreamHandler.java`
#### Snippet
```java

    boolean isOutputReady() {
        switch (responseState) {
            case BODY:
                return exchangeHandler.available() > 0;
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `code` in enum 'H2Error'
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/H2Error.java`
#### Snippet
```java
    HTTP_1_1_REQUIRED (0x0d);

    int code;

    H2Error(final int code) {
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'FrameType'
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/frame/FrameType.java`
#### Snippet
```java
    CONTINUATION  (0x09);

    int value;

    FrameType(final int value) {
```

### NonFinalFieldInEnum
Non-final field `code` in enum 'H2Param'
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/config/H2Param.java`
#### Snippet
```java
    MAX_HEADER_LIST_SIZE   (0x6);

    int code;

    H2Param(final int code) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/frame/FramePrinter.java`
#### Snippet
```java
                        appendable.append("Code ");
                        final int code = buf.getInt();
                        final H2Error error = H2Error.getByCode(code);
                        if (error != null) {
                            appendable.append(error.name());
                        } else {
                            appendable.append("0x").append(Integer.toHexString(code));
                        }
                        appendable.append("\r\n");
```

### DuplicatedCode
Duplicated code
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/frame/FramePrinter.java`
#### Snippet
```java
                final int chunk = Math.min(buf.remaining(), line.length);
                buf.get(line, 0, chunk);

                for (int i = 0; i < chunk; i++) {
                    final char ch = (char) line[i];
                    if (ch > Chars.SP && ch <= Chars.DEL) {
                        appendable.append(ch);
                    } else if (Character.isWhitespace(ch)) {
                        appendable.append(' ');
                    } else {
                        appendable.append('.');
                    }
                }
                for (int i = chunk; i < 17; i++) {
                    appendable.append(' ');
                }

                for (int i = 0; i < chunk; i++) {
                    appendable.append(' ');
                    final int b = line[i] & 0xff;
                    final String s = Integer.toHexString(b);
                    if (s.length() == 1) {
                        appendable.append("0");
                    }
                    appendable.append(s);
                }
```

### DuplicatedCode
Duplicated code
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/hpack/HuffmanEncoder.java`
#### Snippet
```java
            final int code = codes[b];
            final int nbits = lengths[b];

            current <<= nbits;
            current |= code;
            n += nbits;

            while (n >= 8) {
                n -= 8;
                out.append((int)(current >> n));
            }
```

### DuplicatedCode
Duplicated code
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/DefaultH2RequestConverter.java`
#### Snippet
```java
            final Header header = headers.get(i);
            final String name = header.getName();
            final String value = header.getValue();

            for (int n = 0; n < name.length(); n++) {
                final char ch = name.charAt(n);
                if (Character.isAlphabetic(ch) && !Character.isLowerCase(ch)) {
                    throw new ProtocolException("Header name '%s' is invalid (header name contains uppercase characters)", name);
                }
            }
```

### DuplicatedCode
Duplicated code
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/DefaultH2RequestConverter.java`
#### Snippet
```java
                if (name.equalsIgnoreCase(HttpHeaders.CONNECTION) || name.equalsIgnoreCase(HttpHeaders.KEEP_ALIVE)
                    || name.equalsIgnoreCase(HttpHeaders.PROXY_CONNECTION) || name.equalsIgnoreCase(HttpHeaders.TRANSFER_ENCODING)
                    || name.equalsIgnoreCase(HttpHeaders.HOST) || name.equalsIgnoreCase(HttpHeaders.UPGRADE)) {
                    throw new ProtocolException("Header '%s: %s' is illegal for HTTP/2 messages", header.getName(), header.getValue());
                }
                if (name.equalsIgnoreCase(HttpHeaders.TE) && !value.equalsIgnoreCase("trailers")) {
                    throw new ProtocolException("Header '%s: %s' is illegal for HTTP/2 messages", header.getName(), header.getValue());
                }
```

### DuplicatedCode
Duplicated code
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/nio/AbstractH2StreamMultiplexer.java`
#### Snippet
```java
            final int chunk = Math.min(remoteConfig.getMaxFrameSize(), remaining);
            final ByteBuffer payload = ByteBuffer.wrap(buf.array(), off, chunk);

            remaining -= chunk;
            off += chunk;

            final boolean endHeaders = remaining == 0;
            final RawFrame frame;
```

### DuplicatedCode
Duplicated code
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/nio/AbstractH2StreamMultiplexer.java`
#### Snippet
```java
        for (final Iterator<Map.Entry<Integer, H2Stream>> it = streamMap.entrySet().iterator(); it.hasNext(); ) {
            final Map.Entry<Integer, H2Stream> entry = it.next();
            final H2Stream stream = entry.getValue();
            stream.cancel();
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/nio/AbstractH2StreamMultiplexer.java`
#### Snippet
```java
        for (;;) {
            final Command command = ioSession.poll();
            if (command != null) {
                if (command instanceof ExecutableCommand) {
                    ((ExecutableCommand) command).failed(new ConnectionClosedException());
                } else {
                    command.cancel();
                }
            } else {
                break;
            }
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/nio/AbstractH2StreamMultiplexer.java`
#### Snippet
```java
            if (stream.isRemoteInitiated() && streamId > processedRemoteStreamId) {
                processedRemoteStreamId = streamId;
            }
            if (streamListener != null) {
                streamListener.onHeaderInput(this, streamId, headers);
            }
            if (stream.isRemoteClosed()) {
                throw new H2StreamResetException(H2Error.STREAM_CLOSED, "Stream already closed");
            }
            if (stream.isLocalReset()) {
                return;
            }
```

### DuplicatedCode
Duplicated code
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/nio/ClientH2IOEventHandler.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        InetAddressUtils.formatAddress(buf, getLocalAddress());
        buf.append("->");
        InetAddressUtils.formatAddress(buf, getRemoteAddress());
        buf.append(" [");
        streamMultiplexer.appendState(buf);
        buf.append("]");
        return buf.toString();
```

### DuplicatedCode
Duplicated code
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/nio/ClientHttpProtocolNegotiationStarter.java`
#### Snippet
```java
        ioSession.registerProtocol(ApplicationProtocol.HTTP_1_1.id, new ClientHttp1UpgradeHandler(http1StreamHandlerFactory));
        ioSession.registerProtocol(ApplicationProtocol.HTTP_2.id, new ClientH2UpgradeHandler(http2StreamHandlerFactory));

        switch (endpointPolicy) {
            case FORCE_HTTP_2:
                return new ClientH2PrefaceHandler(ioSession, http2StreamHandlerFactory, false);
            case FORCE_HTTP_1:
                return new ClientHttp1IOEventHandler(http1StreamHandlerFactory.create(ioSession));
            default:
                return new HttpProtocolNegotiator(ioSession, null);
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/nio/ServerH2IOEventHandler.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        InetAddressUtils.formatAddress(buf, getRemoteAddress());
        buf.append("->");
        InetAddressUtils.formatAddress(buf, getLocalAddress());
        buf.append(" [");
        streamMultiplexer.appendState(buf);
        buf.append("]");
        return buf.toString();
```

### DuplicatedCode
Duplicated code
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/nio/ServerH2StreamHandler.java`
#### Snippet
```java
        if (responseCommitted.get()) {
            throw new H2ConnectionException(H2Error.INTERNAL_ERROR, "Response already committed");
        }
        final int status = response.getCode();
        if (status < HttpStatus.SC_INFORMATIONAL || status >= HttpStatus.SC_SUCCESS) {
            throw new HttpException("Invalid intermediate response: " + status);
        }
        final List<Header> responseHeaders = DefaultH2ResponseConverter.INSTANCE.convert(response);
        outputChannel.submit(responseHeaders, false);
```

### DuplicatedCode
Duplicated code
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/nio/bootstrap/H2MultiplexingRequesterBootstrap.java`
#### Snippet
```java
        final RequestHandlerRegistry<Supplier<AsyncPushConsumer>> registry = new RequestHandlerRegistry<>(uriPatternType);
        for (final HandlerEntry<Supplier<AsyncPushConsumer>> entry: pushConsumerList) {
            registry.register(entry.hostname, entry.uriPattern, entry.handler);
        }
        final ClientH2StreamMultiplexerFactory http2StreamHandlerFactory = new ClientH2StreamMultiplexerFactory(
                httpProcessor != null ? httpProcessor : H2Processors.client(),
                new DefaultAsyncPushConsumerFactory(registry),
                h2Config != null ? h2Config : H2Config.DEFAULT,
                charCodingConfig != null ? charCodingConfig : CharCodingConfig.DEFAULT,
                streamListener);
```

### DuplicatedCode
Duplicated code
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/nio/bootstrap/H2RequesterBootstrap.java`
#### Snippet
```java
        final ManagedConnPool<HttpHost, IOSession> connPool;
        switch (poolConcurrencyPolicy != null ? poolConcurrencyPolicy : PoolConcurrencyPolicy.STRICT) {
            case LAX:
                connPool = new LaxConnPool<>(
                        defaultMaxPerRoute > 0 ? defaultMaxPerRoute : 20,
                        timeToLive,
                        poolReusePolicy,
                        new DefaultDisposalCallback<>(),
                        connPoolListener);
                break;
            case STRICT:
            default:
                connPool = new StrictConnPool<>(
                        defaultMaxPerRoute > 0 ? defaultMaxPerRoute : 20,
                        maxTotal > 0 ? maxTotal : 50,
                        timeToLive,
                        poolReusePolicy,
                        new DefaultDisposalCallback<>(),
                        connPoolListener);
                break;
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/bootstrap/RequesterBootstrap.java`
#### Snippet
```java
        switch (poolConcurrencyPolicy != null ? poolConcurrencyPolicy : PoolConcurrencyPolicy.STRICT) {
            case LAX:
                connPool = new LaxConnPool<>(
                        defaultMaxPerRoute > 0 ? defaultMaxPerRoute : 20,
                        timeToLive,
                        poolReusePolicy,
                        new DefaultDisposalCallback<>(),
                        connPoolListener);
                break;
            case STRICT:
            default:
                connPool = new StrictConnPool<>(
                        defaultMaxPerRoute > 0 ? defaultMaxPerRoute : 20,
                        maxTotal > 0 ? maxTotal : 50,
                        timeToLive,
                        poolReusePolicy,
                        new DefaultDisposalCallback<>(),
                        connPoolListener);
                break;
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/nio/bootstrap/H2ServerBootstrap.java`
#### Snippet
```java
for (final HandlerEntry<Supplier<AsyncServerExchangeHandler>> entry: handlerList) {
            registry.register(entry.hostname, entry.uriPattern, entry.handler);
        }

        final HandlerFactory<AsyncServerExchangeHandler> handlerFactory;
        if (!filters.isEmpty()) {
            final NamedElementChain<AsyncFilterHandler> filterChainDefinition = new NamedElementChain<>();
            filterChainDefinition.addLast(
                    new TerminalAsyncServerFilter(new DefaultAsyncResponseExchangeHandlerFactory(registry)),
                    StandardFilter.MAIN_HANDLER.name());
            filterChainDefinition.addFirst(
                    new AsyncServerExpectationFilter(),
                    StandardFilter.EXPECT_CONTINUE.name());

            for (final FilterEntry<AsyncFilterHandler> entry: filters) {
                switch (entry.position) {
                    case AFTER:
                        filterChainDefinition.addAfter(entry.existing, entry.filterHandler, entry.name);
                        break;
                    case BEFORE:
                        filterChainDefinition.addBefore(entry.existing, entry.filterHandler, entry.name);
                        break;
                    case REPLACE:
                        filterChainDefinition.replace(entry.existing, entry.filterHandler);
                        break;
                    case FIRST:
                        filterChainDefinition.addFirst(entry.filterHandler, entry.name);
                        break;
                    case LAST:
                        // Don't add last, after TerminalAsyncServerFilter, as that does not delegate to the chain
                        // Instead, add the filter just before it, making it effectively the last filter
                        filterChainDefinition.addBefore(StandardFilter.MAIN_HANDLER.name(), entry.filterHandler, entry.name);
                        break;
                }
            }

            NamedElementChain<AsyncFilterHandler>.Node current = filterChainDefinition.getLast();
            AsyncServerFilterChainElement execChain = null;
            while (current != null) {
                execChain = new AsyncServerFilterChainElement(current.getValue(), execChain);
                current = current.getPrevious();
            }

            handlerFactory = new AsyncServerFilterChainExchangeHandlerFactory(execChain, exceptionCallback);
        } else {
            handlerFactory = new DefaultAsyncResponseExchangeHandlerFactory(registry, handler -> new BasicAsyncServerExpectationDecorator(handler, exceptionCallback));
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/bootstrap/ServerBootstrap.java`
#### Snippet
```java
                switch (entry.position) {
                    case AFTER:
                        filterChainDefinition.addAfter(entry.existing, entry.filterHandler, entry.name);
                        break;
                    case BEFORE:
                        filterChainDefinition.addBefore(entry.existing, entry.filterHandler, entry.name);
                        break;
                    case REPLACE:
                        filterChainDefinition.replace(entry.existing, entry.filterHandler);
                        break;
                    case FIRST:
                        filterChainDefinition.addFirst(entry.filterHandler, entry.name);
                        break;
                    case LAST:
                        // Don't add last, after TerminalServerFilter, as that does not delegate to the chain
                        // Instead, add the filter just before it, making it effectively the last filter
                        filterChainDefinition.addBefore(StandardFilter.MAIN_HANDLER.name(), entry.filterHandler, entry.name);
                        break;
                }
```

### DuplicatedCode
Duplicated code
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/nio/bootstrap/HandlerEntry.java`
#### Snippet
```java
        final StringBuilder builder = new StringBuilder();
        builder.append("HandlerEntry [hostname=");
        builder.append(hostname);
        builder.append(", uriPattern=");
        builder.append(uriPattern);
        builder.append(", handler=");
        builder.append(handler);
        builder.append("]");
        return builder.toString();
```

### DuplicatedCode
Duplicated code
in `httpcore5-testing/src/main/java/org/apache/hc/core5/benchmark/BenchmarkWorker.java`
#### Snippet
```java
                        endpoint.execute(
                                createRequestProducer(),
                                createResponseConsumer(),
                                context,
                                new FutureCallback<Void>() {

                                    @Override
                                    public void completed(final Void result) {
                                        execute();
                                    }

                                    @Override
                                    public void failed(final Exception cause) {
                                        execute();
                                    }

                                    @Override
                                    public void cancelled() {
                                        completionLatch.countDown();
                                    }

                                });
```

### DuplicatedCode
Duplicated code
in `httpcore5-testing/src/main/java/org/apache/hc/core5/benchmark/CommandLineUtils.java`
#### Snippet
```java
        options.addOption(nopt);
        options.addOption(copt);
        options.addOption(topt);
        options.addOption(sopt);
        options.addOption(popt);
        options.addOption(Topt);
        options.addOption(vopt);
        options.addOption(iopt);
```

### DuplicatedCode
Duplicated code
in `httpcore5-testing/src/main/java/org/apache/hc/core5/benchmark/HttpBenchmark.java`
#### Snippet
```java
                            try {
                                framePrinter.printFrameInfo(frame, System.out);
                                System.out.println();
                                if (!frame.isType(FrameType.DATA)) {
                                    framePrinter.printPayload(frame, System.out);
                                    System.out.println();
                                }
                            } catch (final IOException ignore) {
                            }
```

### DuplicatedCode
Duplicated code
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/classic/LoggingBHttpClientConnection.java`
#### Snippet
```java
        if (response != null && this.headerLog.isDebugEnabled()) {
            this.headerLog.debug("{} << {}", this.id, new StatusLine(response));
            final Header[] headers = response.getHeaders();
            for (final Header header : headers) {
                this.headerLog.debug("{} << {}", this.id, header);
            }
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/classic/LoggingBHttpClientConnection.java`
#### Snippet
```java
        if (request != null && this.headerLog.isDebugEnabled()) {
            this.headerLog.debug("{} >> {}", id, new RequestLine(request));
            final Header[] headers = request.getHeaders();
            for (final Header header : headers) {
                this.headerLog.debug("{} >> {}", this.id, header);
            }
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/classic/LoggingConnPoolListener.java`
#### Snippet
```java
            final PoolStats totals = connPoolStats.getTotalStats();
            buf.append(" total kept alive: ").append(totals.getAvailable()).append("; ");
            buf.append("total allocated: ").append(totals.getLeased() + totals.getAvailable());
            buf.append(" of ").append(totals.getMax());
            connLog.debug(buf.toString());
```

### DuplicatedCode
Duplicated code
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/framework/ClassicTestClientAdapter.java`
#### Snippet
```java
        final String requestBody = (String) request.get(BODY);
        if (requestBody != null) {
            final String requestContentType = (String) request.get(CONTENT_TYPE);
            final StringEntity entity = requestContentType != null ?
                                          new StringEntity(requestBody, ContentType.parse(requestContentType)) :
                                          new StringEntity(requestBody);
            httpRequest.setEntity(entity);
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/nio/AsyncRequester.java`
#### Snippet
```java
        int port = host.getPort();
        if (port < 0) {
            final String scheme = host.getSchemeName();
            if (URIScheme.HTTP.same(scheme)) {
                port = 80;
            } else if (URIScheme.HTTPS.same(scheme)) {
                port = 443;
            }
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/nio/H2TestClient.java`
#### Snippet
```java
        final BasicFuture<ClientSessionEndpoint> future = new BasicFuture<>(callback);
        requestSession(host, timeout, new FutureContribution<IOSession>(future) {

            @Override
            public void completed(final IOSession session) {
                future.completed(new ClientSessionEndpoint(session));
            }

        });
        return future;
```

### DuplicatedCode
Duplicated code
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/nio/LoggingIOSession.java`
#### Snippet
```java
        if ((ops & SelectionKey.OP_READ) > 0) {
            buffer.append('r');
        }
        if ((ops & SelectionKey.OP_WRITE) > 0) {
            buffer.append('w');
        }
        if ((ops & SelectionKey.OP_ACCEPT) > 0) {
            buffer.append('a');
        }
        if ((ops & SelectionKey.OP_CONNECT) > 0) {
            buffer.append('c');
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/reactive/Reactive3TestUtils.java`
#### Snippet
```java
        return Flowable.generate(new Consumer<Emitter<ByteBuffer>>() {
            final Random random = new Random(length); // Use the length as the random seed for easy reproducibility
            long bytesEmitted;
            final MessageDigest md = newMessageDigest();

            @Override
            public void accept(final Emitter<ByteBuffer> emitter) {
                final long remainingLength = length - bytesEmitted;
                if (remainingLength == 0) {
                    emitter.onComplete();
                    if (hash != null) {
                        hash.set(TextUtils.toHexString(md.digest()));
                    }
                } else {
                    final int bufferLength = (int) Math.min(remainingLength, 1 + random.nextInt(maximumBlockSize));
                    final byte[] bs = new byte[bufferLength];
                    for (int i = 0; i < bufferLength; i++) {
                        final byte b = RANGE[(int) (random.nextDouble() * RANGE.length)];
                        bs[i] = b;
                    }
                    if (hash != null) {
                        md.update(bs);
                    }
                    emitter.onNext(ByteBuffer.wrap(bs));
                    bytesEmitted += bufferLength;
                }
            }
        });
```

### DuplicatedCode
Duplicated code
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/reactive/Reactive3TestUtils.java`
#### Snippet
```java
        final StreamDescription seed = new StreamDescription(0, newMessageDigest());
        return Flowable.fromPublisher(publisher)
                .reduce(seed, (desc, byteBuffer) -> {
                    final long length = desc.length + byteBuffer.remaining();
                    desc.md.update(byteBuffer);
                    return new StreamDescription(length, desc.md);
                });
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/nio/ClientHttp1StreamHandler.java`
#### Snippet
```java
            final ProtocolVersion transportVersion = request.getVersion();
            if (transportVersion != null && transportVersion.greaterEquals(HttpVersion.HTTP_2)) {
                throw new UnsupportedHttpVersionException(transportVersion);
            }
            context.setProtocolVersion(transportVersion != null ? transportVersion : HttpVersion.HTTP_1_1);
            context.setAttribute(HttpCoreContext.HTTP_REQUEST, request);
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/nio/ClientHttp1StreamDuplexer.java`
#### Snippet
```java
        if (incoming != null) {
            incoming.failed(exception);
            incoming.releaseResources();
            incoming = null;
        }
        if (outgoing != null) {
            outgoing.failed(exception);
            outgoing.releaseResources();
            outgoing = null;
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/nio/ClientHttp1StreamDuplexer.java`
#### Snippet
```java
        if (incoming != null) {
            if (!incoming.isCompleted()) {
                incoming.failed(new ConnectionClosedException());
            }
            incoming.releaseResources();
            incoming = null;
        }
        if (outgoing != null) {
            if (!outgoing.isCompleted()) {
                outgoing.failed(new ConnectionClosedException());
            }
            outgoing.releaseResources();
            outgoing = null;
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/nio/ClientHttp1StreamDuplexer.java`
#### Snippet
```java
        super.appendState(buf);
        buf.append(", incoming=[");
        if (incoming != null) {
            incoming.appendState(buf);
        }
        buf.append("], outgoing=[");
        if (outgoing != null) {
            outgoing.appendState(buf);
        }
        buf.append("], pipeline=");
        buf.append(pipeline.size());
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/nio/LengthDelimitedDecoder.java`
#### Snippet
```java
        if (bytesRead == -1) {
            setCompleted();
            if (this.len < this.contentLength) {
                throw new ConnectionClosedException(
                                "Premature end of Content-Length delimited message body (expected: %d; received: %d)",
                                this.contentLength, this.len);
            }
        }
        this.len += bytesRead;
        if (this.len >= this.contentLength) {
            this.completed = true;
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/nio/ServerHttp1StreamDuplexer.java`
#### Snippet
```java
        final ServerHttp1StreamHandler streamHandler;
        final HttpCoreContext context = HttpCoreContext.create();
        context.setAttribute(HttpCoreContext.SSL_SESSION, getSSLSession());
        context.setAttribute(HttpCoreContext.CONNECTION_ENDPOINT, getEndpointDetails());
        if (outgoing == null) {
            streamHandler = new ServerHttp1StreamHandler(
                    outputChannel,
                    httpProcessor,
                    connectionReuseStrategy,
                    exchangeHandlerFactory,
                    context);
            outgoing = streamHandler;
        } else {
            streamHandler = new ServerHttp1StreamHandler(
                    new DelayedOutputChannel(outputChannel),
                    httpProcessor,
                    connectionReuseStrategy,
                    exchangeHandlerFactory,
                    context);
            pipeline.add(streamHandler);
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/http/io/support/AbstractHttpServerAuthFilter.java`
#### Snippet
```java
        final Header h = request.getFirstHeader(HttpHeaders.AUTHORIZATION);
        final T challengeResponse = h != null ? parseChallengeResponse(h.getValue(), context) : null;

        final URIAuthority authority = request.getAuthority();
        final String requestUri = request.getRequestUri();

        final boolean authenticated = authenticate(challengeResponse, authority, requestUri, context);
        final Header expect = request.getFirstHeader(HttpHeaders.EXPECT);
        final boolean expectContinue = expect != null && HeaderElements.CONTINUE.equalsIgnoreCase(expect.getValue());
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/http/io/support/ClassicRequestBuilder.java`
#### Snippet
```java
        builder.append(getMethod());
        builder.append(", scheme=");
        builder.append(getScheme());
        builder.append(", authority=");
        builder.append(getAuthority());
        builder.append(", path=");
        builder.append(getPath());
        builder.append(", parameters=");
        builder.append(getParameters());
        builder.append(", headerGroup=");
        builder.append(Arrays.toString(getHeaders()));
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/http/io/support/ClassicResponseBuilder.java`
#### Snippet
```java
        builder.append(getStatus());
        builder.append(", headerGroup=");
        builder.append(Arrays.toString(getHeaders()));
        builder.append(", entity=");
        builder.append(entity != null ? entity.getClass() : null);
        builder.append("]");
        return builder.toString();
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/http/message/BasicHttpRequest.java`
#### Snippet
```java
        this.scheme = requestUri.getScheme();
        if (requestUri.getHost() != null) {
            this.authority = new URIAuthority(
                    requestUri.getRawUserInfo(), requestUri.getHost(), requestUri.getPort());
        } else if (requestUri.getRawAuthority() != null) {
            try {
                this.authority = URIAuthority.create(requestUri.getRawAuthority());
            } catch (final URISyntaxException ignore) {
                this.authority = null;
            }
        } else {
            this.authority = null;
        }
        final StringBuilder buf = new StringBuilder();
        final String rawPath = requestUri.getRawPath();
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/http/message/BasicHttpRequest.java`
#### Snippet
```java
        if (this.authority != null) {
            buf.append(this.scheme != null ? this.scheme : URIScheme.HTTP.id).append("://");
            buf.append(this.authority.getHostName());
            if (this.authority.getPort() >= 0) {
                buf.append(":").append(this.authority.getPort());
            }
        }
        if (this.path == null) {
            buf.append("/");
        } else {
            if (buf.length() > 0 && !this.path.startsWith("/")) {
                buf.append("/");
            }
            buf.append(this.path);
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/http/protocol/RequestContent.java`
#### Snippet
```java
        if (this.overwrite) {
            request.removeHeaders(HttpHeaders.TRANSFER_ENCODING);
            request.removeHeaders(HttpHeaders.CONTENT_LENGTH);
        } else {
            if (request.containsHeader(HttpHeaders.TRANSFER_ENCODING)) {
                throw new ProtocolException("Transfer-encoding header already present");
            }
            if (request.containsHeader(HttpHeaders.CONTENT_LENGTH)) {
                throw new ProtocolException("Content-Length header already present");
            }
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/pool/LaxConnPool.java`
#### Snippet
```java
            final BasicFuture<PoolEntry<T, C>> future = new BasicFuture<PoolEntry<T, C>>(callback) {

                @Override
                public synchronized PoolEntry<T, C> get(
                        final long timeout, final TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
                    try {
                        return super.get(timeout, unit);
                    } catch (final TimeoutException ex) {
                        cancel();
                        throw ex;
                    }
                }

            };
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/pool/StrictConnPool.java`
#### Snippet
```java
            final LeaseRequest<T, C> request = it.next();
            final BasicFuture<PoolEntry<T, C>> future = request.getFuture();
            if (future.isCancelled()) {
                it.remove();
                continue;
            }
            final boolean completed = processPendingRequest(request);
            if (request.isDone() || completed) {
                it.remove();
            }
            if (request.isDone()) {
                this.completedRequests.add(request);
            }
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/util/ByteArrayBuffer.java`
#### Snippet
```java
        if (b == null) {
            return;
        }
        if ((off < 0) || (off > b.length) || (len < 0) ||
                ((off + len) < 0) || ((off + len) > b.length)) {
            throw new IndexOutOfBoundsException("off: "+off+" len: "+len+" b.length: "+b.length);
        }
        if (len == 0) {
            return;
        }
        final int newlen = this.len + len;
        if (newlen > this.array.length) {
            expand(newlen);
        }
        System.arraycopy(b, off, this.array, this.len, len);
        this.len = newlen;
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/util/ByteArrayBuffer.java`
#### Snippet
```java
        if (b == null) {
            return;
        }
        if ((off < 0) || (off > b.length) || (len < 0) ||
                ((off + len) < 0) || ((off + len) > b.length)) {
            throw new IndexOutOfBoundsException("off: "+off+" len: "+len+" b.length: "+b.length);
        }
        if (len == 0) {
            return;
        }
        final int oldlen = this.len;
        final int newlen = oldlen + len;
        if (newlen > this.array.length) {
            expand(newlen);
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/util/ByteArrayBuffer.java`
#### Snippet
```java
        int beginIndex = from;
        if (beginIndex < 0) {
            beginIndex = 0;
        }
        int endIndex = to;
        if (endIndex > this.len) {
            endIndex = this.len;
        }
        if (beginIndex > endIndex) {
            return -1;
        }
        for (int i = beginIndex; i < endIndex; i++) {
            if (this.array[i] == b) {
                return i;
            }
        }
        return -1;
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/util/CharArrayBuffer.java`
#### Snippet
```java
        if (beginIndex < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: " + beginIndex);
        }
        if (endIndex > this.len) {
            throw new IndexOutOfBoundsException("endIndex: " + endIndex + " > length: " + this.len);
        }
        if (beginIndex > endIndex) {
            throw new IndexOutOfBoundsException("beginIndex: " + beginIndex + " > endIndex: " + endIndex);
        }
```

### DuplicatedCode
Duplicated code
in `httpcore5/src/main/java/org/apache/hc/core5/util/TimeValue.java`
#### Snippet
```java
        final long seconds = duration.getSeconds();
        final long nanoOfSecond = duration.getNano();
        if (seconds == 0) {
            // no conversion
            return of(nanoOfSecond, TimeUnit.NANOSECONDS);
        } else if (nanoOfSecond == 0) {
            // no conversion
            return of(seconds, TimeUnit.SECONDS);
        }
        // conversion attempts
        try {
            return of(duration.toNanos(), TimeUnit.NANOSECONDS);
        } catch (final ArithmeticException e) {
            try {
                return of(duration.toMillis(), TimeUnit.MILLISECONDS);
            } catch (final ArithmeticException e1) {
                // backstop
                return of(seconds, TimeUnit.SECONDS);
            }
        }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/SocksProxy.java`
#### Snippet
```java
            try {
                this.socket.close();
            } catch (final IOException e) {
            }
            if (this.remote != null) {
```

### CatchMayIgnoreException
Empty `catch` block
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/SocksProxy.java`
#### Snippet
```java
                try {
                    this.remote.close();
                } catch (final IOException e) {
                }
            }
```

### CatchMayIgnoreException
Empty `catch` block
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/SocksProxy.java`
#### Snippet
```java
                                output.flush();
                            }
                        } catch (final IOException e) {
                        } finally {
                            shutdown();
```

### CatchMayIgnoreException
Empty `catch` block
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/SocksProxy.java`
#### Snippet
```java
                        startSocksProxyHandler(socket);
                    }
                } catch (final IOException e) {
                } finally {
                    if (server != null) {
```

### CatchMayIgnoreException
Empty `catch` block
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/SocksProxy.java`
#### Snippet
```java
                        try {
                            server.close();
                        } catch (final IOException e) {
                        }
                        server = null;
```

### CatchMayIgnoreException
Empty `catch` block
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/SocksProxy.java`
#### Snippet
```java
                        try {
                            t1.join();
                        } catch (final InterruptedException e) {
                        }
                        try {
```

### CatchMayIgnoreException
Empty `catch` block
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/SocksProxy.java`
#### Snippet
```java
                        try {
                            t2.join();
                        } catch (final InterruptedException e) {
                        }
                    } catch (final IOException e) {
```

### CatchMayIgnoreException
Empty `catch` block
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/SocksProxy.java`
#### Snippet
```java
                        } catch (final InterruptedException e) {
                        }
                    } catch (final IOException e) {
                    } finally {
                        parent.cleanupSocksProxyHandler(SocksProxyHandler.this);
```

### CatchMayIgnoreException
Empty `catch` block
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/SocksProxy.java`
#### Snippet
```java
                try {
                    this.server.close();
                } catch (final IOException e) {
                } finally {
                    this.server = null;
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`{1}` is redundant
in `httpcore5/src/main/java/org/apache/hc/core5/net/InetAddressUtils.java`
#### Snippet
```java

    private static final String IPV4_BASIC_PATTERN_STRING =
            "(([1-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){1}" + // initial first field, 1-255
            "(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){2}" + // following 2 fields, 0-255 followed by .
             "([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])"; // final field, 0-255
```

### RegExpSimplifiable
`{1}` is redundant
in `httpcore5/src/main/java/org/apache/hc/core5/net/InetAddressUtils.java`
#### Snippet
```java

    private static final Pattern IPV4_PATTERN =
        Pattern.compile("^" + IPV4_BASIC_PATTERN_STRING + "$");

    private static final Pattern IPV4_MAPPED_IPV6_PATTERN = // TODO does not allow for redundant leading zeros
```

### RegExpSimplifiable
`{1}` is redundant
in `httpcore5/src/main/java/org/apache/hc/core5/net/InetAddressUtils.java`
#### Snippet
```java

    private static final Pattern IPV4_MAPPED_IPV6_PATTERN = // TODO does not allow for redundant leading zeros
            Pattern.compile("^::[fF]{4}:" + IPV4_BASIC_PATTERN_STRING + "$");

    private static final Pattern IPV6_STD_PATTERN =
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `httpcore5/src/main/java/org/apache/hc/core5/http/io/entity/FileEntity.java`
#### Snippet
```java
    @Override
    public final InputStream getContent() throws IOException {
        return new FileInputStream(this.file);
    }

```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/HttpHost.java`
#### Snippet
```java
     */
    public String toURI() {
        final StringBuilder buffer = new StringBuilder();
        buffer.append(this.schemeName);
        buffer.append("://");
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/ProtocolVersion.java`
#### Snippet
```java
     */
    public String format() {
        final StringBuilder buffer = new StringBuilder();
        buffer.append(this.protocol);
        buffer.append('/');
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/io/SocketConfig.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("[soTimeout=").append(this.soTimeout)
                .append(", soReuseAddress=").append(this.soReuseAddress)
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/io/entity/AbstractHttpEntity.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[Entity-Class: ");
        sb.append(getClass().getSimpleName());
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/io/support/ClassicResponseBuilder.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("ClassicResponseBuilder [status=");
        builder.append(getStatus());
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/io/support/ClassicRequestBuilder.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("ClassicRequestBuilder [method=");
        builder.append(getMethod());
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/nio/support/AsyncPushBuilder.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("AsyncPushProducer [status=");
        builder.append(getStatus());
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/nio/support/AsyncResponseBuilder.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("AsyncResponseBuilder [status=");
        builder.append(getStatus());
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/nio/support/AsyncRequestBuilder.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("AsyncRequestBuilder [method=");
        builder.append(getMethod());
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/nio/IdentityDecoder.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[identity; completed: ");
        sb.append(this.completed);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/nio/LengthDelimitedDecoder.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[content length: ");
        sb.append(this.contentLength);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/nio/LengthDelimitedEncoder.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[content length: ");
        sb.append(this.contentLength);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/nio/IdentityEncoder.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[identity; completed: ");
        sb.append(isCompleted());
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/nio/ChunkEncoder.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[chunk-coded; completed: ");
        sb.append(isCompleted());
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/nio/ExpandableBuffer.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[mode=");
        sb.append(this.mode);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/bootstrap/HandlerEntry.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("HandlerEntry [hostname=");
        builder.append(hostname);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/nio/ChunkDecoder.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[chunk-coded; completed: ");
        sb.append(this.completed);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/config/Http1Config.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("[bufferSize=").append(bufferSize)
                .append(", chunkSizeHint=").append(chunkSizeHint)
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/config/CharCodingConfig.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("[charset=").append(this.charset)
                .append(", malformedInputAction=").append(this.malformedInputAction)
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/message/BasicHttpResponse.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.code).append(' ').append(this.reasonPhrase).append(' ').append(this.version);
        return sb.toString();
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/message/RequestLine.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder buf = new StringBuilder();
        buf.append(this.method).append(" ").append(this.uri).append(" ").append(this.protoversion);
        return buf.toString();
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/message/BasicNameValuePair.java`
#### Snippet
```java
        }
        final int len = this.name.length() + 1 + this.value.length();
        final StringBuilder buffer = new StringBuilder(len);
        buffer.append(this.name);
        buffer.append("=");
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/support/BasicResponseBuilder.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BasicResponseBuilder [status=");
        builder.append(getStatus());
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/http/support/BasicRequestBuilder.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BasicRequestBuilder [method=");
        builder.append(getMethod());
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/pool/PoolStats.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder buffer = new StringBuilder();
        buffer.append("[leased: ");
        buffer.append(this.leased);
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/pool/PoolEntry.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder buffer = new StringBuilder();
        buffer.append("[route:");
        buffer.append(this.route);
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/util/Tokenizer.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder buffer = new StringBuilder();
            buffer.append('[');
            buffer.append(this.lowerBound);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/IOReactorConfig.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("[selectInterval=").append(this.selectInterval)
                .append(", ioThreadCount=").append(this.ioThreadCount)
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/pool/LaxConnPool.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder buffer = new StringBuilder();
            buffer.append("[route: ");
            buffer.append(route);
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/pool/LaxConnPool.java`
#### Snippet
```java
    public String toString() {
        final PoolStats totalStats = getTotalStats();
        final StringBuilder buffer = new StringBuilder();
        buffer.append("[leased: ");
        buffer.append(totalStats.getLeased());
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/pool/StrictConnPool.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder buffer = new StringBuilder();
            buffer.append("[");
            buffer.append(this.route);
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/pool/StrictConnPool.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder buffer = new StringBuilder();
            buffer.append("[route: ");
            buffer.append(this.route);
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/pool/StrictConnPool.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder buffer = new StringBuilder();
        buffer.append("[leased: ");
        buffer.append(this.leased.size());
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/AbstractIOSessionPool.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder buffer = new StringBuilder();
        buffer.append("I/O sessions: ");
        buffer.append(sessionPool.size());
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/nio/bootstrap/HandlerEntry.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("HandlerEntry [hostname=");
        builder.append(hostname);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/frame/Frame.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        sb.append("type=").append(type);
        sb.append(", flags=").append(flags);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/config/H2Setting.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder().append(param).append(": ").append(value);
        return sb.toString();
    }
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/config/H2Config.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("[headerTableSize=").append(this.headerTableSize)
                .append(", pushEnabled=").append(this.pushEnabled)
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpcore5-testing/src/main/java/org/apache/hc/core5/benchmark/Results.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("[serverName=").append(serverName)
                .append(", hostName=").append(hostName)
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `httpcore5/src/main/java/org/apache/hc/core5/http/nio/entity/AbstractBinAsyncEntityProducer.java`
#### Snippet
```java

    public AbstractBinAsyncEntityProducer(final int fragmentSizeHint, final ContentType contentType) {
        this.fragmentSizeHint = fragmentSizeHint >= 0 ? fragmentSizeHint : 0;
        this.byteBuffer = ByteBuffer.allocate(this.fragmentSizeHint);
        this.contentType = contentType;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `httpcore5/src/main/java/org/apache/hc/core5/http/nio/entity/AbstractCharAsyncEntityProducer.java`
#### Snippet
```java
            final ContentType contentType) {
        Args.positive(bufferSize, "Buffer size");
        this.fragmentSizeHint = fragmentSizeHint >= 0 ? fragmentSizeHint : 0;
        this.bytebuf = ByteBuffer.allocate(bufferSize);
        this.contentType = contentType;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/EnglishReasonPhraseCatalog.java`
#### Snippet
```java
    // ----------------------------------------------------- Static Initializer

    /** Set up status code to "reason phrase" map. */
    static {
        // HTTP 1.1 Server status codes -- see RFC 7231
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/io/EofSensorInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] b) throws IOException {
        return read(b, 0, b.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/io/EofSensorInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] b, final int off, final int len) throws IOException {
        int readLen = -1;

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/io/entity/EmptyInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] buf, final int off, final int len) {
        return -1;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/io/entity/EmptyInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] buf) {
        return -1;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/io/entity/ByteBufferEntity.java`
#### Snippet
```java

            @Override
            public int read(final byte[] bytes, final int off, final int len) throws IOException {
                if (!buffer.hasRemaining()) {
                    return -1;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/nio/support/classic/ContentInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] b, final int off, final int len) throws IOException {
        return this.buffer.read(b, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/nio/support/classic/ContentInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] b) throws IOException {
        if (b == null) {
            return 0;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/nio/support/classic/ContentOutputStream.java`
#### Snippet
```java

    @Override
    public void write(final byte[] b) throws IOException {
        if (b == null) {
            return;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/nio/support/classic/ContentOutputStream.java`
#### Snippet
```java

    @Override
    public void write(final byte[] b, final int off, final int len) throws IOException {
        this.buffer.write(b, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/io/IdentityInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] b, final int off, final int len) throws IOException {
        if (this.closed) {
            throw new StreamClosedException();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/io/ContentLengthOutputStream.java`
#### Snippet
```java

    @Override
    public void write(final byte[] b, final int off, final int len) throws IOException {
        if (this.closed) {
            throw new StreamClosedException();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/io/ContentLengthOutputStream.java`
#### Snippet
```java

    @Override
    public void write(final byte[] b) throws IOException {
        write(b, 0, b.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/io/ChunkedOutputStream.java`
#### Snippet
```java
     */
    @Override
    public void write(final byte[] src, final int off, final int len) throws IOException {
        if (this.closed) {
            throw new StreamClosedException();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/io/ChunkedOutputStream.java`
#### Snippet
```java
     */
    @Override
    public void write(final byte[] b) throws IOException {
        write(b, 0, b.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/io/ContentLengthInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] b, final int off, final int len) throws java.io.IOException {
        if (closed) {
            throw new StreamClosedException();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/io/ContentLengthInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] b) throws IOException {
        return read(b, 0, b.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/io/IdentityOutputStream.java`
#### Snippet
```java

    @Override
    public void write(final byte[] b) throws IOException {
        write(b, 0, b.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/io/IdentityOutputStream.java`
#### Snippet
```java

    @Override
    public void write(final byte[] b, final int off, final int len) throws IOException {
        if (this.closed) {
            throw new StreamClosedException();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/io/EmptyInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] buf, final int off, final int len) {
        return -1;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/io/EmptyInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] buf) {
        return -1;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/io/ChunkedInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read (final byte[] b) throws IOException {
        return read(b, 0, b.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/io/ChunkedInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read (final byte[] b, final int off, final int len) throws IOException {

        if (closed) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/io/DefaultBHttpClientConnection.java`
#### Snippet
```java

                    @Override
                    public void write(final byte[] b, final int off, final int len) throws IOException {
                        checkForEarlyResponse(totalBytes, len);
                        totalBytes += len;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/io/DefaultBHttpClientConnection.java`
#### Snippet
```java

                    @Override
                    public void write(final byte[] b) throws IOException {
                        checkForEarlyResponse(totalBytes, b.length);
                        totalBytes += b.length;
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `httpcore5/src/main/java/org/apache/hc/core5/util/CharArrayBuffer.java`
#### Snippet
```java

    @Override
    public String toString() {
        return new String(this.array, 0, this.len);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `httpcore5/src/main/java/org/apache/hc/core5/util/CharArrayBuffer.java`
#### Snippet
```java
     */
    @Override
    public CharSequence subSequence(final int beginIndex, final int endIndex) {
        if (beginIndex < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: " + beginIndex);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/IOSessionRequest.java`
#### Snippet
```java

    @Override
    public IOSession get(final long timeout, final TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return future.get(timeout, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/concurrent/DefaultThreadFactory.java`
#### Snippet
```java

    @Override
    public Thread newThread(final Runnable target) {
        final Thread thread = new Thread(this.group, target, this.namePrefix + "-"  + this.count.incrementAndGet());
        thread.setDaemon(daemon);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/concurrent/CompletedFuture.java`
#### Snippet
```java

    @Override
    public T get(final long timeout, final TimeUnit unit) {
        return this.result;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5/src/main/java/org/apache/hc/core5/concurrent/BasicFuture.java`
#### Snippet
```java

    @Override
    public synchronized T get(final long timeout, final TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException {
        Args.notNull(unit, "Time unit");
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/io/FrameOutputStream.java`
#### Snippet
```java

    @Override
    public void write(final byte[] src, final int off, final int len) throws IOException {
        if (len >= this.cache.length - this.cachePosition) {
            flushCache(false);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/io/FrameOutputStream.java`
#### Snippet
```java

    @Override
    public void write(final byte[] b) throws IOException {
        write(b, 0, b.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/classic/LoggingInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] b, final int off, final int len) throws IOException {
        final int bytesRead = in.read(b, off, len);
        if (bytesRead != -1) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/classic/LoggingInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] b) throws IOException {
        final int bytesRead = in.read(b);
        if (bytesRead != -1) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/classic/LoggingOutputStream.java`
#### Snippet
```java

    @Override
    public void write(final byte[] b, final int off, final int len) throws IOException {
        wire.output(b, off, len);
        out.write(b, off, len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/classic/LoggingOutputStream.java`
#### Snippet
```java

    @Override
    public void write(final byte[] b) throws IOException {
        wire.output(b);
        out.write(b);
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `httpcore5/src/main/java/org/apache/hc/core5/net/Ports.java`
#### Snippet
```java

    /**
     * The maximum port value per https://tools.ietf.org/html/rfc6335.
     */
    public final static int MAX_VALUE = 65535;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `httpcore5/src/main/java/org/apache/hc/core5/net/Ports.java`
#### Snippet
```java

    /**
     * The minimum port value per https://tools.ietf.org/html/rfc6335.
     */
    public final static int MIN_VALUE = 0;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/SocksProxyProtocolHandler.java`
#### Snippet
```java

/**
 * Implements the client side of SOCKS protocol version 5 as per https://tools.ietf.org/html/rfc1928. Supports SOCKS username/password
 * authentication as per https://tools.ietf.org/html/rfc1929.
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/SocksProxyProtocolHandler.java`
#### Snippet
```java
/**
 * Implements the client side of SOCKS protocol version 5 as per https://tools.ietf.org/html/rfc1928. Supports SOCKS username/password
 * authentication as per https://tools.ietf.org/html/rfc1929.
 */
final class SocksProxyProtocolHandler implements IOEventHandler {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/hpack/HuffmanDecoder.java`
#### Snippet
```java
/**
 * This Huffman codec implementation has been derived from Twitter HPack project
 * (https://github.com/twitter/hpack)
 */
final class HuffmanDecoder {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/hpack/HuffmanEncoder.java`
#### Snippet
```java
/**
 * This Huffman codec implementation has been derived from Twitter HPack project
 * (https://github.com/twitter/hpack)
 */
final class HuffmanEncoder {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/hpack/HuffmanNode.java`
#### Snippet
```java
/**
 * This Huffman codec implementation has been derived from Twitter HPack project
 * (https://github.com/twitter/hpack)
 */
final class HuffmanNode {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/hpack/Huffman.java`
#### Snippet
```java
/**
 * This Huffman codec implementation has been derived from Twitter HPack project
 * (https://github.com/twitter/hpack)
 */
@Internal
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/SocksProxyProtocolHandlerFactory.java`
#### Snippet
```java
    private final InetSocketAddress targetAddress;
    private final String username;
    private final String password;
    private final IOEventHandlerFactory eventHandlerFactory;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/SocksProxyProtocolHandlerFactory.java`
#### Snippet
```java
    private final String username;
    private final String password;
    private final IOEventHandlerFactory eventHandlerFactory;

    public SocksProxyProtocolHandlerFactory(final SocketAddress targetAddress, final String username, final String password, final IOEventHandlerFactory eventHandlerFactory) throws IOException {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/SocksProxyProtocolHandlerFactory.java`
#### Snippet
```java
public class SocksProxyProtocolHandlerFactory implements IOEventHandlerFactory {

    private final InetSocketAddress targetAddress;
    private final String username;
    private final String password;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/SocksProxyProtocolHandlerFactory.java`
#### Snippet
```java

    private final InetSocketAddress targetAddress;
    private final String username;
    private final String password;
    private final IOEventHandlerFactory eventHandlerFactory;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/DefaultConnectingIOReactor.java`
#### Snippet
```java

    private final int workerCount;
    private final SingleCoreIOReactor[] workers;
    private final MultiCoreIOReactor ioReactor;
    private final IOWorkers.Selector workerSelector;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/DefaultConnectingIOReactor.java`
#### Snippet
```java
public class DefaultConnectingIOReactor extends AbstractIOReactorBase {

    private final int workerCount;
    private final SingleCoreIOReactor[] workers;
    private final MultiCoreIOReactor ioReactor;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/DefaultListeningIOReactor.java`
#### Snippet
```java

    private final int workerCount;
    private final SingleCoreIOReactor[] workers;
    private final SingleCoreListeningIOReactor listener;
    private final MultiCoreIOReactor ioReactor;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/DefaultListeningIOReactor.java`
#### Snippet
```java
    private final static ThreadFactory LISTENER_THREAD_FACTORY = new DefaultThreadFactory("I/O listener", true);

    private final int workerCount;
    private final SingleCoreIOReactor[] workers;
    private final SingleCoreListeningIOReactor listener;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/nio/AbstractH2StreamMultiplexer.java`
#### Snippet
```java
    private final H2Config localConfig;
    private final BasicH2TransportMetrics inputMetrics;
    private final BasicH2TransportMetrics outputMetrics;
    private final BasicHttpConnectionMetrics connMetrics;
    private final FrameInputBuffer inputBuffer;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `httpcore5-h2/src/main/java/org/apache/hc/core5/http2/impl/nio/AbstractH2StreamMultiplexer.java`
#### Snippet
```java
    private final HttpProcessor httpProcessor;
    private final H2Config localConfig;
    private final BasicH2TransportMetrics inputMetrics;
    private final BasicH2TransportMetrics outputMetrics;
    private final BasicHttpConnectionMetrics connMetrics;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ThreadPoolExecutor.awaitTermination()` is ignored
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/bootstrap/HttpServer.java`
#### Snippet
```java
    public void awaitTermination(final TimeValue waitTime) throws InterruptedException {
        Args.notNull(waitTime, "Wait time");
        this.workerExecutorService.awaitTermination(waitTime.getDuration(), waitTime.getTimeUnit());
    }

```

### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `httpcore5-testing/src/main/java/org/apache/hc/core5/benchmark/HttpBenchmark.java`
#### Snippet
```java
        }

        completionLatch.await(deadline, TimeUnit.MILLISECONDS);

        if (config.getVerbosity() >= 3) {
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/classic/Wire.java`
#### Snippet
```java
                this.log.debug("{} {}", this.id, buffer);
                buffer.setLength(0);
            } else if ((ch < Chars.SP) || (ch >= Chars.DEL)) {
                buffer.append("[0x");
                buffer.append(Integer.toHexString(ch));
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `flush()` is identical to its super method
in `httpcore5/src/main/java/org/apache/hc/core5/http/nio/support/classic/ContentOutputStream.java`
#### Snippet
```java

    @Override
    public void flush() throws IOException {
    }

```

### RedundantMethodOverride
Method `markSupported()` is identical to its super method
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/classic/LoggingInputStream.java`
#### Snippet
```java

    @Override
    public boolean markSupported() {
        return false;
    }
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'ContentOutputStream' used without 'try'-with-resources statement
in `httpcore5/src/main/java/org/apache/hc/core5/http/nio/support/classic/AbstractClassicServerExchangeHandler.java`
#### Snippet
```java
        outputBuffer = new SharedOutputBuffer(initialBufferSize);

        final OutputStream outputStream = new ContentOutputStream(outputBuffer) {

            private void triggerResponse() throws IOException {
```

### AutoCloseableResource
'ContentInputStream' used without 'try'-with-resources statement
in `httpcore5/src/main/java/org/apache/hc/core5/http/nio/support/classic/AbstractClassicServerExchangeHandler.java`
#### Snippet
```java
        if (entityDetails != null) {
            inputBuffer = new SharedInputBuffer(initialBufferSize);
            inputStream = new ContentInputStream(inputBuffer);
        } else {
            inputStream = null;
```

### AutoCloseableResource
'SelectableChannel' used without 'try'-with-resources statement
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/SingleCoreListeningIOReactor.java`
#### Snippet
```java
            if (key.isAcceptable()) {

                final ServerSocketChannel serverChannel = (ServerSocketChannel) key.channel();
                for (;;) {
                    final SocketChannel socketChannel = serverChannel.accept();
```

### AutoCloseableResource
'ListenerEndpointRequest' used without 'try'-with-resources statement
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/SingleCoreListeningIOReactor.java`
#### Snippet
```java
    void doTerminate() {
        ListenerEndpointRequest request;
        while ((request = this.requestQueue.poll()) != null) {
            request.cancel();
        }
```

### AutoCloseableResource
'SingleCoreIOReactor' used without 'try'-with-resources statement
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/AbstractIOReactorBase.java`
#### Snippet
```java
        }
        try {
            return getWorkerSelector().next().connect(remoteEndpoint, remoteAddress, localAddress, timeout, attachment, callback);
        } catch (final IOReactorShutdownException ex) {
            initiateShutdown();
```

### AutoCloseableResource
'Selector' used without 'try'-with-resources statement
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/IOSessionImpl.java`
#### Snippet
```java
            lock.unlock();
        }
        this.key.selector().wakeup();
    }

```

### AutoCloseableResource
'Selector' used without 'try'-with-resources statement
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/IOSessionImpl.java`
#### Snippet
```java
            lock.unlock();
        }
        this.key.selector().wakeup();
    }

```

### AutoCloseableResource
'Selector' used without 'try'-with-resources statement
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/IOSessionImpl.java`
#### Snippet
```java
            lock.unlock();
        }
        this.key.selector().wakeup();
    }

```

### AutoCloseableResource
'Selector' used without 'try'-with-resources statement
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/IOSessionImpl.java`
#### Snippet
```java
            this.key.attach(null);
            Closer.closeQuietly(this.key.channel());
            if (this.key.selector().isOpen()) {
                this.key.selector().wakeup();
            }
```

### AutoCloseableResource
'Selector' used without 'try'-with-resources statement
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/IOSessionImpl.java`
#### Snippet
```java
            Closer.closeQuietly(this.key.channel());
            if (this.key.selector().isOpen()) {
                this.key.selector().wakeup();
            }
        }
```

### AutoCloseableResource
'SingleCoreIOReactor' used without 'try'-with-resources statement
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/DefaultListeningIOReactor.java`
#### Snippet
```java
    private void enqueueChannel(final ChannelEntry entry) {
        try {
            workerSelector.next().enqueueChannel(entry);
        } catch (final IOReactorShutdownException ex) {
            initiateShutdown();
```

### AutoCloseableResource
'InternalDataChannel' used without 'try'-with-resources statement
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/SingleCoreIOReactor.java`
#### Snippet
```java
    private void processClosedSessions() {
        for (;;) {
            final InternalDataChannel dataChannel = this.closedSessions.poll();
            if (dataChannel == null) {
                break;
```

### AutoCloseableResource
'DefaultConnectingIOReactor' used without 'try'-with-resources statement
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/nio/AsyncRequester.java`
#### Snippet
```java
            final Object attachment,
            final FutureCallback<IOSession> callback) {
        return reactor().connect(remoteEndpoint, remoteAddress, localAddress, timeout, attachment, callback);
    }

```

### AutoCloseableResource
'DefaultConnectingIOReactor' used without 'try'-with-resources statement
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/nio/AsyncRequester.java`
#### Snippet
```java
    public Future<IOSession> requestSession(final HttpHost host, final Timeout timeout, final FutureCallback<IOSession> callback) {
        Args.notNull(host, "Host");
        return reactor().connect(host, toSocketAddress(host), null, timeout, null, callback);
    }

```

### AutoCloseableResource
'DefaultListeningIOReactor' used without 'try'-with-resources statement
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/nio/AsyncServer.java`
#### Snippet
```java

    public Set<ListenerEndpoint> getEndpoints() {
        return reactor().getEndpoints();
    }

```

### AutoCloseableResource
'DefaultListeningIOReactor' used without 'try'-with-resources statement
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/nio/AsyncServer.java`
#### Snippet
```java

    public Future<ListenerEndpoint> listen(final InetSocketAddress address) {
        return reactor().listen(address, null);
    }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `httpcore5/src/main/java/org/apache/hc/core5/io/Closer.java`
#### Snippet
```java
     *
     * @param closeable what to close.
     * @throws IOException
     */
    public static void close(final Closeable closeable) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpcore5/src/main/java/org/apache/hc/core5/http/io/HttpClientConnection.java`
#### Snippet
```java
     *
     * @param request the request to be terminated prematurely.
     * @throws HttpException
     * @throws IOException
     *
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpcore5/src/main/java/org/apache/hc/core5/http/io/HttpClientConnection.java`
#### Snippet
```java
     * @param request the request to be terminated prematurely.
     * @throws HttpException
     * @throws IOException
     *
     * @see #isConsistent()
```

### JavadocDeclaration
`@param schemeSpecificPart` tag description is missing
in `httpcore5/src/main/java/org/apache/hc/core5/net/URIBuilder.java`
#### Snippet
```java
     * Sets the URI scheme specific part.
     *
     * @param schemeSpecificPart
     * @return this.
     * @since 5.1
```

### JavadocDeclaration
`@param schemeSpecificPart` tag description is missing
in `httpcore5/src/main/java/org/apache/hc/core5/net/URIBuilder.java`
#### Snippet
```java
     * Sets the URI scheme specific part and append a variable arguments list of NameValuePair instance(s) to this part.
     *
     * @param schemeSpecificPart
     * @param nvps Optional, can be null. Variable arguments list of NameValuePair query parameters to be reused by the specific scheme part
     * @return this.
```

### JavadocDeclaration
`@param schemeSpecificPart` tag description is missing
in `httpcore5/src/main/java/org/apache/hc/core5/net/URIBuilder.java`
#### Snippet
```java
     * Sets the URI scheme specific part and append a list of NameValuePair to this part.
     *
     * @param schemeSpecificPart
     * @param nvps Optional, can be null. List of query parameters to be reused by the specific scheme part
     * @return this.
```

### JavadocDeclaration
`@param hostname` tag description is missing
in `httpcore5/src/main/java/org/apache/hc/core5/http/impl/bootstrap/ServerBootstrap.java`
#### Snippet
```java
     * matching the given host and the pattern.
     *
     * @param hostname
     * @param uriPattern the pattern to register the handler for.
     * @param requestHandler the handler.
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/framework/TestingFramework.java`
#### Snippet
```java
     * Call to add a test with defaults.
     *
     * @throws TestingFrameworkException
     */
    public void addTest() throws TestingFrameworkException {
```

### JavadocDeclaration
`@param adapter` tag description is missing
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/framework/TestingFramework.java`
#### Snippet
```java
     * Sets the {@link ClientTestingAdapter}.
     *
     * @param adapter
     */
    public void setAdapter(final ClientTestingAdapter adapter) {
```

### JavadocDeclaration
`@param requestHandler` tag description is missing
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/framework/TestingFramework.java`
#### Snippet
```java
     * It is used to inject a mocked request handler.
     *
     * @param requestHandler
     */
    public void setRequestHandler(final TestingFrameworkRequestHandler requestHandler) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/framework/TestingFramework.java`
#### Snippet
```java
     * @param orig a serializable object.
     * @return a deep copy of the orig object.
     * @throws TestingFrameworkException
     */
    public static Object deepcopy(final Object orig) throws TestingFrameworkException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/framework/TestingFramework.java`
#### Snippet
```java
     *
     * @param test Map with a REQUEST and a RESPONSE key.
     * @throws TestingFrameworkException
     */
    @SuppressWarnings("unchecked")
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/framework/TestingFrameworkRequestHandler.java`
#### Snippet
```java
     *
     * @param desiredResponse the desired response.
     * @throws TestingFrameworkException
     */
    @SuppressWarnings("unchecked")
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/framework/TestingFrameworkRequestHandler.java`
#### Snippet
```java
     * which will rethrow the exception that was thrown before.
     *
     * @throws TestingFrameworkException
     */
    public void assertNothingThrown() throws TestingFrameworkException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpcore5-testing/src/main/java/org/apache/hc/core5/testing/framework/TestingFrameworkRequestHandler.java`
#### Snippet
```java
     *
     * @param requestExpectations the expected values of the request.
     * @throws TestingFrameworkException
     */
    @SuppressWarnings("unchecked")
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `zoneId` may be 'final'
in `httpcore5/src/main/java/org/apache/hc/core5/http/protocol/HttpDateGenerator.java`
#### Snippet
```java
    private long dateAsMillis;
    private String dateAsText;
    private ZoneId zoneId;

    HttpDateGenerator() {
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `poolEntry`
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/AbstractIOSessionPool.java`
#### Snippet
```java
        if (closed.compareAndSet(false, true)) {
            for (final PoolEntry poolEntry : sessionPool.values()) {
                synchronized (poolEntry) {
                    if (poolEntry.session != null) {
                        closeSession(poolEntry.session, closeMode);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `poolEntry`
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/AbstractIOSessionPool.java`
#### Snippet
```java
        for (final PoolEntry poolEntry: sessionPool.values()) {
            if (poolEntry.session != null) {
                synchronized (poolEntry) {
                    if (poolEntry.session != null && poolEntry.session.getLastReadTime() <= deadline) {
                        closeSession(poolEntry.session, CloseMode.GRACEFUL);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `poolEntry`
in `httpcore5/src/main/java/org/apache/hc/core5/reactor/AbstractIOSessionPool.java`
#### Snippet
```java
        for (final PoolEntry poolEntry: sessionPool.values()) {
            if (poolEntry.session != null) {
                synchronized (poolEntry) {
                    if (poolEntry.session != null) {
                        callback.execute(poolEntry.session);
```

