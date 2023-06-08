# vert.x 
 
# Bad smells
I found 885 bad smells with 37 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNUSED_IMPORT | 198 | false |
| UNCHECKED_WARNING | 191 | false |
| Deprecation | 48 | false |
| ConstantValue | 47 | false |
| DataFlowIssue | 46 | false |
| EmptyStatementBody | 41 | false |
| JavadocDeclaration | 40 | false |
| JavadocLinkAsPlainText | 39 | false |
| FieldMayBeFinal | 35 | false |
| JavadocReference | 29 | false |
| DuplicatedCode | 24 | false |
| ProtectedMemberInFinalClass | 19 | true |
| RedundantCast | 10 | false |
| CopyConstructorMissesField | 10 | false |
| FieldCanBeLocal | 7 | false |
| SimplifyStreamApiCallChains | 7 | false |
| UnnecessaryToStringCall | 7 | true |
| IgnoreResultOfCall | 6 | false |
| TrivialIf | 6 | false |
| DefaultAnnotationParam | 5 | false |
| SwitchStatementWithTooFewBranches | 5 | false |
| InnerClassMayBeStatic | 5 | true |
| UnusedAssignment | 4 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 4 | false |
| EqualsBetweenInconvertibleTypes | 3 | false |
| DuplicateThrows | 3 | false |
| UnnecessarySemicolon | 3 | false |
| StringOperationCanBeSimplified | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| CommentedOutCode | 2 | false |
| LongLiteralsEndingWithLowercaseL | 2 | false |
| TrivialStringConcatenation | 2 | false |
| RedundantMethodOverride | 2 | false |
| DeprecatedIsStillUsed | 2 | false |
| CharsetObjectCanBeUsed | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| UnnecessaryModifier | 1 | true |
| UnnecessaryStringEscape | 1 | true |
| CloneableImplementsClone | 1 | false |
| RegExpRedundantEscape | 1 | false |
| RegExpSimplifiable | 1 | false |
| SillyAssignment | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| SimplifyOptionalCallChains | 1 | false |
| SlowListContainsAll | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| ConfusingMainMethod | 1 | false |
| InfiniteRecursion | 1 | false |
| AssignmentUsedAsCondition | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| CatchMayIgnoreException | 1 | false |
| RedundantEscapeInRegexReplacement | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| AutoCloseableResource | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| UnnecessaryContinue | 1 | false |
| BusyWait | 1 | false |
| ThrowableNotThrown | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[protocols.size()\]'
in `src/main/java/io/vertx/core/net/impl/SslContextProvider.java`
#### Snippet
```java
    Set<String> protocols = new LinkedHashSet<>(enabledProtocols);
    protocols.retainAll(Arrays.asList(engine.getSupportedProtocols()));
    engine.setEnabledProtocols(protocols.toArray(new String[protocols.size()]));
    if (client && !endpointIdentificationAlgorithm.isEmpty()) {
      SSLParameters sslParameters = engine.getSSLParameters();
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/io/vertx/core/dns/DnsResponseCode.java`
#### Snippet
```java
    }

    private DnsResponseCode(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`else` statement has empty body
in `src/main/java/io/vertx/core/http/impl/Http2ServerConnection.java`
#### Snippet
```java
      }
      stream.onHeaders(headers, streamPriority);
    } else {
      // Http server request trailer - not implemented yet (in api)
    }
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/io/vertx/core/http/impl/Http1xUpgradeToH2CHandler.java`
#### Snippet
```java
            ChannelPipeline pipeline = ctx.pipeline();
            for (Map.Entry<String, ChannelHandler> handler : pipeline) {
              if (handler.getValue() instanceof Http2ConnectionHandler) {
                // Continue
              } else {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/io/vertx/core/http/impl/HttpServerConnectionHandler.java`
#### Snippet
```java
  public void handle(HttpServerConnection conn) {
    Handler<HttpServerRequest> requestHandler = this.requestHandler;
    if (HttpServerImpl.DISABLE_WEBSOCKETS) {
      // As a performance optimisation you can set a system property to disable WebSockets altogether which avoids
      // some casting and a header check
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/io/vertx/core/http/impl/Http1xServerRequestHandler.java`
#### Snippet
```java
            wsHandler.handle(ws);
            ws.tryHandshake(101);
          } else {
            // ????
          }
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/io/vertx/core/impl/HAManager.java`
#### Snippet
```java
      String sclusterInfo = clusterMap.get(leftNodeID);

      if (sclusterInfo == null) {
        // Clean close - do nothing
      } else {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  public static Object deepCopy(Object val, Function<Object, ?> copier) {
    if (val == null) {
      // OK
    } else if (val instanceof Number) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
    if (val == null) {
      // OK
    } else if (val instanceof Number) {
      // OK
    } else if (val instanceof Boolean) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
    } else if (val instanceof Number) {
      // OK
    } else if (val instanceof Boolean) {
      // OK
    } else if (val instanceof String) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
    } else if (val instanceof Boolean) {
      // OK
    } else if (val instanceof String) {
      // OK
    } else if (val instanceof Character) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
    } else if (val instanceof String) {
      // OK
    } else if (val instanceof Character) {
      // OK
    } else if (val instanceof CharSequence) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
    } else if (val instanceof List) {
      val = (new JsonArray((List) val)).copy(copier);
    } else if (val instanceof byte[]) {
      // OK
    } else if (val instanceof Instant) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
    } else if (val instanceof byte[]) {
      // OK
    } else if (val instanceof Instant) {
      // OK
    } else if (val instanceof Enum) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
    } else if (val instanceof Instant) {
      // OK
    } else if (val instanceof Enum) {
      // OK
    } else {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/io/vertx/core/json/jackson/JacksonCodec.java`
#### Snippet
```java
      } else if (clazz == Short.class) {
        o = number.shortValue();
      } else if (clazz == Object.class || clazz.isAssignableFrom(Number.class)) {
        // Nothing
      } else {
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java
        if (holder != null) {
          holder.handler.receive(msg.copyBeforeReceive());
        } else {
          // RACY issue !!!!!
        }
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/examples/SharedDataExamples.java`
#### Snippet
```java
      .put("foo", "bar")
      .onComplete(resPut -> {
        if (resPut.succeeded()) {
          // Successfully put the value
        } else {
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/examples/SharedDataExamples.java`
#### Snippet
```java
          // Local-only async map
          AsyncMap<String, String> map = res.result();
        } else {
          // Something went wrong!
        }
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/examples/SharedDataExamples.java`
#### Snippet
```java
          vertx.setTimer(5000, tid -> lock.release());

        } else {
          // Something went wrong
        }
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/examples/SharedDataExamples.java`
#### Snippet
```java
          // Successfully got the value
          Object val = resGet.result();
        } else {
          // Something went wrong!
        }
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/examples/SharedDataExamples.java`
#### Snippet
```java
        if (res.succeeded()) {
          AsyncMap<String, String> map = res.result();
        } else {
          // Something went wrong!
        }
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/examples/SharedDataExamples.java`
#### Snippet
```java
          Lock lock = res.result();

        } else {
          // Failed to get lock
        }
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/examples/SharedDataExamples.java`
#### Snippet
```java
          // Local-only counter
          Counter counter = res.result();
        } else {
          // Something went wrong!
        }
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/examples/SharedDataExamples.java`
#### Snippet
```java
          vertx.setTimer(5000, tid -> lock.release());

        } else {
          // Something went wrong
        }
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/examples/SharedDataExamples.java`
#### Snippet
```java
        if (res.succeeded()) {
          Counter counter = res.result();
        } else {
          // Something went wrong!
        }
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/examples/ParseToolsExamples.java`
#### Snippet
```java
          // Handle a value
          String field = event.fieldName();
          if (field != null) {
            // In an object
          } else {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/examples/ParseToolsExamples.java`
#### Snippet
```java
          } else {
            // In an array or top level
            if (event.isString()) {

            } else {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java

    Future.all(httpServerFuture, netServerFuture).onComplete(ar -> {
      if (ar.succeeded()) {
        // All servers started
      } else {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
      .listen(SocketAddress.domainSocketAddress("/var/tmp/myservice.sock"))
      .onComplete(ar -> {
        if (ar.succeeded()) {
          // Bound to socket
        } else {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
  public void exampleFutureAny1(Future<String> future1, Future<String> future2) {
    Future.any(future1, future2).onComplete(ar -> {
      if (ar.succeeded()) {
        // At least one is succeeded
      } else {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
  public void exampleFutureJoin1(Future<?> future1, Future<?> future2, Future<?> future3) {
    Future.join(future1, future2, future3).onComplete(ar -> {
      if (ar.succeeded()) {
        // All succeeded
      } else {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
      .connect(addr)
      .onComplete(ar -> {
        if (ar.succeeded()) {
          // Connected
        } else {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
    fs.copy("foo.txt", "bar.txt")
      .onComplete(res -> {
        if (res.succeeded()) {
          // Copied ok!
        } else {
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
        if (res.succeeded()) {
          AsyncFile file = res.result();
        } else {
          // Something went wrong!
        }
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java
      if (pushedRequest.path().equals("/main.js")) {
        pushedRequest.reset();
      } else {
        // Handle it
      }
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/docoverride/json/Examples.java`
#### Snippet
```java
  public void example5(String arbitraryJson) {
    Object object = Json.decodeValue(arbitraryJson);
    if (object instanceof JsonObject) {
      // That's a valid json object
    } else if (object instanceof JsonArray) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/docoverride/json/Examples.java`
#### Snippet
```java
    if (object instanceof JsonObject) {
      // That's a valid json object
    } else if (object instanceof JsonArray) {
      // That's a valid json array
    } else if (object instanceof String) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/docoverride/json/Examples.java`
#### Snippet
```java
    } else if (object instanceof JsonArray) {
      // That's a valid json array
    } else if (object instanceof String) {
      // That's valid string
    } else {
```

### EmptyStatementBody
`switch` statement has empty body
in `src/main/generated/io/vertx/core/tracing/TracingOptionsConverter.java`
#### Snippet
```java
   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, TracingOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
      }
    }
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/examples/HTTPExamples.java`
#### Snippet
```java
      .request(HttpMethod.GET, 8080, "myserver.mycompany.com", "/some-uri")
      .onComplete(ar1 -> {
        if (ar1.succeeded()) {
          // Connected to the server
        }
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/examples/HTTPExamples.java`
#### Snippet
```java
              HttpClientResponse response = ar.result();

              if (response.statusCode() != 200) {
                // Connect failed for some reason
              } else {
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/examples/HTTPExamples.java`
#### Snippet
```java
      if (webSocket.path().equals("/myapi")) {
        webSocket.reject();
      } else {
        // Do something
      }
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/io/vertx/core/impl/launcher/commands/ExecUtils.java`
#### Snippet
```java
public class ExecUtils {

  private static final String SINGLE_QUOTE = "\'";
  private static final String DOUBLE_QUOTE = "\"";

```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/io/vertx/core/http/impl/HttpClientRequestImpl.java`
#### Snippet
```java

  private void checkResponseHandler() {
/*
    if (stream == null && !connecting && responsePromise.future().getHandler() == null) {
      throw new IllegalStateException("You must set a response handler before connecting to the server");
```

### CommentedOutCode
Commented out code (12 lines)
in `src/main/java/examples/HTTPExamples.java`
#### Snippet
```java

  // Seems to fail javac in CI
//  public void exampleClientComposition02(Vertx vertx, HttpClient client) throws Exception {
//
//    vertx.deployVerticle(() -> new AbstractVerticle() {
```

## RuleId[id=CloneableImplementsClone]
### CloneableImplementsClone
`PemTrustOptions` is 'Cloneable' but does not define 'clone()' method
in `src/main/java/io/vertx/core/net/PemTrustOptions.java`
#### Snippet
```java
 */
@DataObject(generateConverter = true, publicConverter = false)
public class PemTrustOptions implements TrustOptions, Cloneable {

  private KeyStoreHelper helper;
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
    if (VALID_POINTER_PATTERN.matcher(pointer).matches()) {
      return Arrays
          .stream(pointer.split("\\/", -1))
          .skip(1) //Ignore first element
          .map(this::unescape)
```

## RuleId[id=LongLiteralsEndingWithLowercaseL]
### LongLiteralsEndingWithLowercaseL
'long' literal `245l` ends with lowercase 'l'
in `src/main/java/examples/HTTPExamples.java`
#### Snippet
```java
    // Write a buffer
    Buffer buffer = Buffer.buffer();
    buffer.appendInt(123).appendLong(245l);
    request.write(buffer);

```

### LongLiteralsEndingWithLowercaseL
'long' literal `432l` ends with lowercase 'l'
in `src/main/java/examples/HTTPExamples.java`
#### Snippet
```java

    // Write buffer and end the request (send it) in a single call
    Buffer buffer = Buffer.buffer().appendDouble(12.34d).appendLong(432l);
    request.end(buffer);

```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`\\p{Digit}` can be simplified to '\\d'
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java

  // Pattern to check we are not dealing with an absoluate URI
  private static final Pattern ABS_URI_START_PATTERN = Pattern.compile("^\\p{Alpha}[\\p{Alpha}\\p{Digit}+.\\-]*:");

  private static final Function<HttpClientResponse, Future<RequestOptions>> DEFAULT_HANDLER = resp -> {
```

## RuleId[id=Deprecation]
### Deprecation
'isAccessible()' is deprecated
in `src/main/java/io/vertx/core/cli/converters/FromBasedConverter.java`
#### Snippet
```java
      final Method method = clazz.getMethod(FROM, String.class);
      if (Modifier.isStatic(method.getModifiers())) {
        if (!method.isAccessible()) {
          method.setAccessible(true);
        }
```

### Deprecation
'isAccessible()' is deprecated
in `src/main/java/io/vertx/core/cli/converters/ConstructorBasedConverter.java`
#### Snippet
```java
    try {
      final Constructor<T> constructor = clazz.getConstructor(String.class);
      if (!constructor.isAccessible()) {
        constructor.setAccessible(true);
      }
```

### Deprecation
'isAccessible()' is deprecated
in `src/main/java/io/vertx/core/cli/converters/FromStringBasedConverter.java`
#### Snippet
```java
      final Method method = clazz.getMethod(FROM_STRING, String.class);
      if (Modifier.isStatic(method.getModifiers())) {
        if (!method.isAccessible()) {
          method.setAccessible(true);
        }
```

### Deprecation
'isAccessible()' is deprecated
in `src/main/java/io/vertx/core/cli/converters/ValueOfBasedConverter.java`
#### Snippet
```java
      final Method method = clazz.getMethod(VALUE_OF, String.class);
      if (Modifier.isStatic(method.getModifiers())) {
        if (!method.isAccessible()) {
          method.setAccessible(true);
        }
```

### Deprecation
'getPeerCertificateChain()' is deprecated
in `src/main/java/io/vertx/core/net/NetSocket.java`
#### Snippet
```java
   *         not SSL.
   * @throws javax.net.ssl.SSLPeerUnverifiedException SSL peer's identity has not been verified.
   * @see javax.net.ssl.SSLSession#getPeerCertificateChain()
   * @see #sslSession()
   */
```

### Deprecation
'Provider(java.lang.String, double, java.lang.String)' is deprecated
in `src/main/java/io/vertx/core/net/KeyManagerFactoryWrapper.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(KeyManagerFactoryWrapper.class);
  private static final String KEY_MANAGER_FACTORY_ALGORITHM = "no-algorithm";
  private static final Provider PROVIDER = new Provider("", 1.0, "") {
  };

```

### Deprecation
'Provider(java.lang.String, double, java.lang.String)' is deprecated
in `src/main/java/io/vertx/core/net/TrustManagerFactoryWrapper.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(TrustManagerFactoryWrapper.class);
  private static final String KEY_MANAGER_FACTORY_ALGORITHM = "no-algorithm";
  private static final Provider PROVIDER = new Provider("", 1.0, "") {
  };

```

### Deprecation
'Provider(java.lang.String, double, java.lang.String)' is deprecated
in `src/main/java/io/vertx/core/net/impl/VertxTrustManagerFactory.java`
#### Snippet
```java
class VertxTrustManagerFactory extends TrustManagerFactory {

  private static final Provider PROVIDER = new Provider("", 0.0, "") {
  };

```

### Deprecation
'javax.security.cert.X509Certificate' is deprecated
in `src/main/java/io/vertx/core/net/impl/ConnectionBase.java`
#### Snippet
```java
  }

  public X509Certificate[] peerCertificateChain() throws SSLPeerUnverifiedException {
    SSLSession session = sslSession();
    if (session != null) {
```

### Deprecation
'getPeerCertificateChain()' is deprecated
in `src/main/java/io/vertx/core/net/impl/ConnectionBase.java`
#### Snippet
```java
    SSLSession session = sslSession();
    if (session != null) {
      return session.getPeerCertificateChain();
    } else {
      return null;
```

### Deprecation
'getPeerCertificateChain()' is deprecated
in `src/main/java/io/vertx/core/http/HttpConnection.java`
#### Snippet
```java
   *         not SSL.
   * @throws javax.net.ssl.SSLPeerUnverifiedException SSL peer's identity has not been verified.
   * @see javax.net.ssl.SSLSession#getPeerCertificateChain()
   * @see #sslSession()
   */
```

### Deprecation
'getPeerCertificateChain()' is deprecated
in `src/main/java/io/vertx/core/http/HttpServerRequest.java`
#### Snippet
```java
   *         not SSL.
   * @throws javax.net.ssl.SSLPeerUnverifiedException SSL peer's identity has not been verified.
   * @see javax.net.ssl.SSLSession#getPeerCertificateChain()
   * @see #sslSession()
   */
```

### Deprecation
'javax.security.cert.X509Certificate' is deprecated
in `src/main/java/io/vertx/core/http/HttpServerRequest.java`
#### Snippet
```java
   */
  @GenIgnore
  X509Certificate[] peerCertificateChain() throws SSLPeerUnverifiedException;

  /**
```

### Deprecation
'getPeerCertificateChain()' is deprecated
in `src/main/java/io/vertx/core/http/WebSocketBase.java`
#### Snippet
```java
   *         not SSL.
   * @throws javax.net.ssl.SSLPeerUnverifiedException SSL peer's identity has not been verified.
   * @see javax.net.ssl.SSLSession#getPeerCertificateChain()
   * @see #sslSession()
   */
```

### Deprecation
'javax.security.cert.X509Certificate' is deprecated
in `src/main/java/io/vertx/core/http/impl/HttpServerRequestWrapper.java`
#### Snippet
```java
  @Override
  @GenIgnore
  public X509Certificate[] peerCertificateChain() throws SSLPeerUnverifiedException {
    return delegate.peerCertificateChain();
  }
```

### Deprecation
Overrides deprecated method in 'io.vertx.core.http.HttpServerRequest'
in `src/main/java/io/vertx/core/http/impl/HttpServerRequestWrapper.java`
#### Snippet
```java
  @Override
  @Deprecated
  public Map<String, Cookie> cookieMap() {
    return delegate.cookieMap();
  }
```

### Deprecation
'javax.security.cert.X509Certificate' is deprecated
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java

  @Override
  public X509Certificate[] peerCertificateChain() throws SSLPeerUnverifiedException {
    return conn.peerCertificateChain();
  }
```

### Deprecation
'javax.security.cert.X509Certificate' is deprecated
in `src/main/java/io/vertx/core/http/impl/Http1xServerRequest.java`
#### Snippet
```java

  @Override
  public X509Certificate[] peerCertificateChain() throws SSLPeerUnverifiedException {
    return conn.peerCertificateChain();
  }
```

### Deprecation
'javax.security.cert.X509Certificate' is deprecated
in `src/main/java/io/vertx/core/http/impl/HttpNetSocket.java`
#### Snippet
```java

  @Override
  public X509Certificate[] peerCertificateChain() throws SSLPeerUnverifiedException {
    return conn.peerCertificateChain();
  }
```

### Deprecation
'javax.security.cert.X509Certificate' is deprecated
in `src/main/java/io/vertx/core/http/impl/Http2ServerRequest.java`
#### Snippet
```java

  @Override
  public X509Certificate[] peerCertificateChain() throws SSLPeerUnverifiedException {
    return stream.conn.peerCertificateChain();
  }
```

### Deprecation
'newInstance()' is deprecated
in `src/main/java/io/vertx/core/impl/JavaVerticleFactory.java`
#### Snippet
```java
      return;
    }
    promise.complete(clazz::newInstance);
  }

```

### Deprecation
'javax.security.cert.X509Certificate' is deprecated
in `src/main/java/io/vertx/core/http/impl/Http2UpgradeClientConnection.java`
#### Snippet
```java

  @Override
  public X509Certificate[] peerCertificateChain() throws SSLPeerUnverifiedException {
    return current.peerCertificateChain();
  }
```

### Deprecation
'peerCertificateChain()' is deprecated
in `src/main/java/io/vertx/core/http/impl/Http2UpgradeClientConnection.java`
#### Snippet
```java
  @Override
  public X509Certificate[] peerCertificateChain() throws SSLPeerUnverifiedException {
    return current.peerCertificateChain();
  }

```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/impl/ClusterSerializableUtils.java`
#### Snippet
```java
public class ClusterSerializableUtils {

  public static ClusterSerializable copy(ClusterSerializable obj) {
    Buffer buffer = Buffer.buffer();
    obj.writeToBuffer(buffer);
```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/impl/ClusterSerializableUtils.java`
#### Snippet
```java
public class ClusterSerializableUtils {

  public static ClusterSerializable copy(ClusterSerializable obj) {
    Buffer buffer = Buffer.buffer();
    obj.writeToBuffer(buffer);
```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/impl/ClusterSerializableUtils.java`
#### Snippet
```java
    obj.writeToBuffer(buffer);
    try {
      ClusterSerializable copy = obj.getClass().getConstructor().newInstance();
      copy.readFromBuffer(0, buffer);
      return copy;
```

### Deprecation
'newInstance()' is deprecated
in `src/main/java/io/vertx/core/impl/VertxBuilder.java`
#### Snippet
```java
        try {
          Class<?> clazz = Class.forName(clusterManagerClassName);
          clusterManager = (ClusterManager) clazz.newInstance();
        } catch (Exception e) {
          throw new IllegalStateException("Failed to instantiate " + clusterManagerClassName, e);
```

### Deprecation
'newInstance()' is deprecated
in `src/main/java/io/vertx/core/impl/VertxImpl.java`
#### Snippet
```java
  @Override
  public Future<String> deployVerticle(Class<? extends Verticle> verticleClass, DeploymentOptions options) {
    return deployVerticle((Callable<Verticle>) verticleClass::newInstance, options);
  }

```

### Deprecation
'getCurrentTokenId()' is deprecated
in `src/main/java/io/vertx/core/json/jackson/JacksonCodec.java`
#### Snippet
```java
    while (true) {
      parser.nextToken();
      int tokenId = parser.getCurrentTokenId();
      if (tokenId == JsonTokenId.ID_FIELD_NAME) {
        throw new UnsupportedOperationException();
```

### Deprecation
'getCurrentTokenId()' is deprecated
in `src/main/java/io/vertx/core/json/jackson/JacksonCodec.java`
#### Snippet
```java

  private static Object parseAny(JsonParser parser) throws IOException, DecodeException {
    switch (parser.getCurrentTokenId()) {
      case JsonTokenId.ID_START_OBJECT:
        return parseObject(parser);
```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/eventbus/impl/CodecManager.java`
#### Snippet
```java
        if ((codecName = codecSelector.apply(body)) != null) {
          codec = getCodec(codecName);
        } else if (body instanceof ClusterSerializable && (local || acceptClusterSerializable(body.getClass().getName()))) {
          codec = clusterSerializableCodec;
        } else if (body instanceof Serializable && (local || acceptSerializable(body.getClass().getName()))) {
```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/eventbus/impl/codecs/ClusterSerializableCodec.java`
#### Snippet
```java

  @Override
  public void encodeToWire(Buffer buffer, ClusterSerializable obj) {
    byte[] classNameBytes = obj.getClass().getName().getBytes(CharsetUtil.UTF_8);
    buffer.appendInt(classNameBytes.length).appendBytes(classNameBytes);
```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/eventbus/impl/codecs/ClusterSerializableCodec.java`
#### Snippet
```java

  @Override
  public ClusterSerializable transform(ClusterSerializable obj) {
    return copy(obj);
  }
```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/eventbus/impl/codecs/ClusterSerializableCodec.java`
#### Snippet
```java

  @Override
  public ClusterSerializable transform(ClusterSerializable obj) {
    return copy(obj);
  }
```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/eventbus/impl/codecs/ClusterSerializableCodec.java`
#### Snippet
```java
import static io.vertx.core.impl.ClusterSerializableUtils.copy;

public class ClusterSerializableCodec implements MessageCodec<ClusterSerializable, ClusterSerializable> {

  private final CodecManager codecManager;
```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/eventbus/impl/codecs/ClusterSerializableCodec.java`
#### Snippet
```java
import static io.vertx.core.impl.ClusterSerializableUtils.copy;

public class ClusterSerializableCodec implements MessageCodec<ClusterSerializable, ClusterSerializable> {

  private final CodecManager codecManager;
```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/eventbus/impl/codecs/ClusterSerializableCodec.java`
#### Snippet
```java

  @Override
  public ClusterSerializable decodeFromWire(int pos, Buffer buffer) {
    int len = buffer.getInt(pos);
    pos += 4;
```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/eventbus/impl/codecs/ClusterSerializableCodec.java`
#### Snippet
```java
    }
    pos += len;
    ClusterSerializable clusterSerializable;
    try {
      Class<?> clazz = getClassLoader().loadClass(className);
```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/eventbus/impl/codecs/ClusterSerializableCodec.java`
#### Snippet
```java
    try {
      Class<?> clazz = getClassLoader().loadClass(className);
      clusterSerializable = (ClusterSerializable) clazz.newInstance();
    } catch (Exception e) {
      throw new RuntimeException(e);
```

### Deprecation
'newInstance()' is deprecated
in `src/main/java/io/vertx/core/eventbus/impl/codecs/ClusterSerializableCodec.java`
#### Snippet
```java
    try {
      Class<?> clazz = getClassLoader().loadClass(className);
      clusterSerializable = (ClusterSerializable) clazz.newInstance();
    } catch (Exception e) {
      throw new RuntimeException(e);
```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/shareddata/ClusterSerializable.java`
#### Snippet
```java
 * @implSpec Implementations must have a public no-argument constructor.
 */
public interface ClusterSerializable extends io.vertx.core.shareddata.impl.ClusterSerializable {

  /**
```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/shareddata/impl/Checker.java`
#### Snippet
```java
    } else if (obj instanceof Shareable) {
      result = ((Shareable) obj).copy();
    } else if (obj instanceof ClusterSerializable) {
      result = copyClusterSerializable((ClusterSerializable) obj);
    } else if (obj instanceof Serializable) {
```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/shareddata/impl/Checker.java`
#### Snippet
```java
      result = ((Shareable) obj).copy();
    } else if (obj instanceof ClusterSerializable) {
      result = copyClusterSerializable((ClusterSerializable) obj);
    } else if (obj instanceof Serializable) {
      result = copySerializable(obj);
```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/shareddata/impl/Checker.java`
#### Snippet
```java
  }

  private static ClusterSerializable copyClusterSerializable(ClusterSerializable obj) {
    logDeveloperInfo(obj);
    return ClusterSerializableUtils.copy(obj);
```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/shareddata/impl/Checker.java`
#### Snippet
```java
  }

  private static ClusterSerializable copyClusterSerializable(ClusterSerializable obj) {
    logDeveloperInfo(obj);
    return ClusterSerializableUtils.copy(obj);
```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/shareddata/impl/Checker.java`
#### Snippet
```java
    Objects.requireNonNull(obj, "null not allowed for shareddata data structure");
    // All immutables and byte arrays are Serializable by the platform
    if (!(obj instanceof Serializable || obj instanceof Shareable || obj instanceof ClusterSerializable)) {
      throw new IllegalArgumentException("Invalid type for shareddata data structure: " + obj.getClass().getName());
    }
```

### Deprecation
'IOContext(com.fasterxml.jackson.core.util.BufferRecycler, java.lang.Object, boolean)' is deprecated
in `src/main/java/io/vertx/core/parsetools/impl/JsonParserImpl.java`
#### Snippet
```java
            if (depth++ == 0) {
              JsonFactory factory = new JsonFactory();
              buffer = new TokenParser(new IOContext(factory._getBufferRecycler(), this, true), com.fasterxml.jackson.core.JsonParser.Feature.collectDefaults());
            }
            buffer.tokens.add(event.token());
```

### Deprecation
'io.vertx.core.shareddata.impl.ClusterSerializable' is deprecated
in `src/main/java/io/vertx/core/shareddata/impl/SharedDataImpl.java`
#### Snippet
```java
    }
    // All immutables and byte arrays are Serializable by the platform
    if (!(obj instanceof Serializable || obj instanceof ClusterSerializable)) {
      throw new IllegalArgumentException("Invalid type: " + obj.getClass().getName() + " to put in async map");
    }
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/io/vertx/core/http/impl/HttpUtils.java`
#### Snippet
```java
    public String value(HttpServerResponse resp, int index) {
      if (index == 0) {
        return "" + resp.getStatusCode();
      }
      throw new IndexOutOfBoundsException("Invalid tag index " + index);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/io/vertx/core/http/impl/HttpUtils.java`
#### Snippet
```java
    public String value(HttpResponseHead resp, int index) {
      if (index == 0) {
        return "" + resp.statusCode;
      }
      throw new IndexOutOfBoundsException("Invalid tag index " + index);
```

## RuleId[id=SillyAssignment]
### SillyAssignment
Variable 'maxDelayToWaitTimeUnit' is assigned to itself
in `src/main/java/io/vertx/core/net/TrafficShapingOptions.java`
#### Snippet
```java
   */
  public TrafficShapingOptions setCheckIntervalForStatsTimeUnit(TimeUnit checkIntervalForStatsTimeUnit) {
    this.maxDelayToWaitTimeUnit = maxDelayToWaitTimeUnit;
    return this;
  }
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`==` between objects of inconvertible types 'Class' and 'Class'
in `src/main/java/io/vertx/core/http/impl/VertxHttpResponseEncoder.java`
#### Snippet
```java
    final Class<?> msgClazz = msg.getClass();
    if (msgClazz == AssembledFullHttpResponse.class ||
      msgClazz == DefaultFullHttpResponse.class ||
      msgClazz == AssembledHttpResponse.class ||
      msgClazz == DefaultHttpContent.class ||
```

### EqualsBetweenInconvertibleTypes
`==` between objects of inconvertible types 'Class' and 'Class'
in `src/main/java/io/vertx/core/http/impl/VertxHttpResponseEncoder.java`
#### Snippet
```java
      msgClazz == DefaultFullHttpResponse.class ||
      msgClazz == AssembledHttpResponse.class ||
      msgClazz == DefaultHttpContent.class ||
      msgClazz == AssembledLastHttpContent.class ||
      msgClazz == DefaultFileRegion.class) {
```

### EqualsBetweenInconvertibleTypes
`==` between objects of inconvertible types 'Class' and 'Class'
in `src/main/java/io/vertx/core/http/impl/VertxHttpResponseEncoder.java`
#### Snippet
```java
      msgClazz == DefaultHttpContent.class ||
      msgClazz == AssembledLastHttpContent.class ||
      msgClazz == DefaultFileRegion.class) {
      return true;
    }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/net/SSLOptions.java`
#### Snippet
```java
   * The default ENABLED_SECURE_TRANSPORT_PROTOCOLS value = { "TLSv1", "TLSv1.1", "TLSv1.2", "TLSv1.3" }
   * <p/>
   * SSLv3 is NOT enabled due to POODLE vulnerability http://en.wikipedia.org/wiki/POODLE
   * <p/>
   * "SSLv2Hello" is NOT enabled since it's disabled by default since JDK7
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
 * This code is copies and modifies over from net.oauth.java.jmeter:ApacheJMeter_oauth
 * <p/>
 * Source is from https://web.archive.org/web/20110827064643/http://oauth.googlecode.com:80/svn/code/branches/jmeter/jmeter/src/main/java/org/apache/jmeter/protocol/oauth/sampler/PrivateKeyReader.java
 * which is licensed under the APL (see also https://web.archive.org/web/20120202095848/http://code.google.com:80/p/jmeter-oauth/)
 * <p/>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
 * <p/>
 * Source is from https://web.archive.org/web/20110827064643/http://oauth.googlecode.com:80/svn/code/branches/jmeter/jmeter/src/main/java/org/apache/jmeter/protocol/oauth/sampler/PrivateKeyReader.java
 * which is licensed under the APL (see also https://web.archive.org/web/20120202095848/http://code.google.com:80/p/jmeter-oauth/)
 * <p/>
 * All credits go to the original author Zhihong Zhang (zhihong@gmail)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/http/HttpServerOptions.java`
#### Snippet
```java
   * especially nowadays when many clients are handled mobile devices with a low CPU profile.
   *
   * see also: http://www.gzip.org/algorithm.txt
   *
   * @param compressionLevel integer 1-9, 1 means use fastest algorithm, 9 slower algorithm but better compression ratio
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/http/impl/cgbystrom/FlashPolicyHandler.java`
#### Snippet
```java
 * from the pipeline.
 *
 * Read more at http://www.adobe.com/devnet/articles/crossdomain_policy_file_spec.html
 *
 * Example usage:
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/impl/cpu/CpuCoreSensor.java`
#### Snippet
```java
 * parses the /proc/self/status file.
 * <p>
 * This class derives from https://github.com/wildfly/wildfly-common/blob/master/src/main/java/org/wildfly/common/cpu/ProcessorInfo.java
 * licensed under the Apache Software License 2.0.
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/LoggerFactory.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/LoggerFactory.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/LoggerFactory.java`
#### Snippet
```java

/**
 * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/LoggerFactory.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java
   * @throws UnsupportedOperationException if the logging backend does not support parameterized messages
   *
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java
   * @throws UnsupportedOperationException if the logging backend does not support parameterized messages
   *
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java
   * @throws UnsupportedOperationException if the logging backend does not support parameterized messages
   *
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java
 * As a consequence, if you rely on parameterized logging methods, you won't be able to switch backends without changing your code.
 *
 * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
 *
 * @author <a href="mailto:tim.fox@jboss.com">Tim Fox</a>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java
   * @throws UnsupportedOperationException if the logging backend does not support parameterized messages
   *
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java
   * @throws UnsupportedOperationException if the logging backend does not support parameterized messages
   *
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java
   * @throws UnsupportedOperationException if the logging backend does not support parameterized messages
   *
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java
   * @throws UnsupportedOperationException if the logging backend does not support parameterized messages
   *
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java
   * @throws UnsupportedOperationException if the logging backend does not support parameterized messages
   *
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java
   * @throws UnsupportedOperationException if the logging backend does not support parameterized messages
   *
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java

  /**
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java
   * @throws UnsupportedOperationException if the logging backend does not support parameterized messages
   *
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java
   * @return the delegate instance sending operations to the underlying logging framework
   *
   * @deprecated see https://github.com/eclipse-vertx/vert.x/issues/2774
   */
  @Deprecated
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
  private final NetClientInternal netClient;
  private final HttpClientMetrics metrics;
  private final boolean keepAlive;
  private final boolean pipelining;
  private final CloseSequence closeSequence;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
  private final HttpClientMetrics metrics;
  private final boolean keepAlive;
  private final boolean pipelining;
  private final CloseSequence closeSequence;
  private EndpointResolver<?, EndpointKey, Lease<HttpClientConnection>, ?> endpointResolver;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/io/vertx/core/http/impl/HttpNetSocket.java`
#### Snippet
```java

  private final ConnectionBase conn;
  private final ContextInternal context;
  private final ReadStream<Buffer> readStream;
  private final WriteStream<Buffer> writeStream;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/io/vertx/core/eventbus/impl/MessageConsumerImpl.java`
#### Snippet
```java
  private final Vertx vertx;
  private final ContextInternal context;
  private final EventBusImpl eventBus;
  private final String address;
  private final boolean localOnly;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/examples/cli/AnnotatedCli.java`
#### Snippet
```java
  private boolean flag;
  private String name;
  private String arg;

  @Option(shortName = "f", flag = true)
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/examples/cli/AnnotatedCli.java`
#### Snippet
```java

  private boolean flag;
  private String name;
  private String arg;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/examples/cli/AnnotatedCli.java`
#### Snippet
```java
public class AnnotatedCli {

  private boolean flag;
  private String name;
  private String arg;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/io/vertx/core/file/impl/FileCache.java`
#### Snippet
```java
    File file = new File(getCacheDir(), fileName);
    fileNameCheck(file);
    file.mkdirs();
  }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/io/vertx/core/file/impl/FileCache.java`
#### Snippet
```java
    File cacheFile = new File(getCacheDir(), fileName);
    fileNameCheck(cacheFile);
    cacheFile.getParentFile().mkdirs();
    if (!overwrite) {
      try {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/io/vertx/core/file/impl/FileCache.java`
#### Snippet
```java
    boolean isDirectory = resource.isDirectory();
    if (!isDirectory) {
      cacheFile.getParentFile().mkdirs();
      if (!overwrite) {
        try {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/io/vertx/core/file/impl/FileCache.java`
#### Snippet
```java
      }
    } else {
      cacheFile.mkdirs();
    }
    return cacheFile;
```

### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `src/main/java/io/vertx/core/impl/HAManager.java`
#### Snippet
```java
    });
    try {
      latch.await(30, TimeUnit.SECONDS);
    } catch (InterruptedException ignore) {
    }
```

### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `src/main/java/io/vertx/core/impl/HAManager.java`
#### Snippet
```java
        while (true) {
          try {
            latch.await(remainingNanos, NANOSECONDS);
            break;
          } catch (InterruptedException e) {
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/io/vertx/core/impl/launcher/commands/StartCommand.java`
#### Snippet
```java
   * @param id the id
   */
  @Option(longName = "vertx-id", shortName = "id", required = false, acceptValue = true)
  @Description("The id of the application, a random UUID by default")
  public void setApplicationId(String id) {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/io/vertx/core/impl/launcher/commands/StartCommand.java`
#### Snippet
```java
   * @param id the id
   */
  @Option(longName = "vertx-id", shortName = "id", required = false, acceptValue = true)
  @Description("The id of the application, a random UUID by default")
  public void setApplicationId(String id) {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/io/vertx/core/impl/launcher/commands/StartCommand.java`
#### Snippet
```java
   * @param options the jvm options
   */
  @Option(longName = "java-opts", required = false, acceptValue = true)
  @Description("Java Virtual Machine options to pass to the spawned process such as \"-Xmx1G -Xms256m " +
      "-XX:MaxPermSize=256m\". If not set the `JAVA_OPTS` environment variable is used.")
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/io/vertx/core/impl/launcher/commands/StartCommand.java`
#### Snippet
```java
   * @param options the jvm options
   */
  @Option(longName = "java-opts", required = false, acceptValue = true)
  @Description("Java Virtual Machine options to pass to the spawned process such as \"-Xmx1G -Xms256m " +
      "-XX:MaxPermSize=256m\". If not set the `JAVA_OPTS` environment variable is used.")
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
   * @param verticle the verticle
   */
  @Argument(index = 0, argName = "main-verticle", required = true)
  @Description("The main verticle to deploy, it can be a fully qualified class name or a file.")
  public void setMainVerticle(String verticle) {
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `handleWritabilityChanged()` is identical to its super method
in `src/main/java/io/vertx/core/http/impl/Http2ClientConnection.java`
#### Snippet
```java

    @Override
    void handleWritabilityChanged(boolean writable) {
    }

```

### RedundantMethodOverride
Method `replyAddress()` is identical to its super method
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ClusteredMessage.java`
#### Snippet
```java

  @Override
  public String replyAddress() {
    return replyAddress;
  }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
buff.length() \* i: integer multiplication implicitly cast to long
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
          for (int i = 0; i < 5; i++) {
            file
              .write(buff, buff.length() * i)
              .onComplete(ar -> {
                if (ar.succeeded()) {
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/io/vertx/core/impl/launcher/commands/StartCommand.java`
#### Snippet
```java
          .filter(arg -> executionContext.launcher().getCommandNames().contains(arg))
          .findFirst();
      if (! maybeCommand.isPresent()) {
        // No command, add `run`
        ExecUtils.addArgument(cmd, "run");
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/io/vertx/core/net/impl/VertxEventLoopGroup.java`
#### Snippet
```java
    @Override
    public boolean containsAll(Collection<?> c) {
      return workers.containsAll(c);
    }

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/DeploymentOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/DeploymentOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/DeploymentOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/cli/ArgumentConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/cli/ArgumentConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/cli/ArgumentConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/cli/OptionConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/cli/OptionConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/datagram/DatagramSocketOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/datagram/DatagramSocketOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/datagram/DatagramSocketOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/dns/DnsClientOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/dns/DnsClientOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/dns/DnsClientOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/eventbus/EventBusOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/eventbus/EventBusOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/file/CopyOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/file/CopyOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/file/CopyOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/file/FileSystemOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/file/FileSystemOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/file/FileSystemOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/file/OpenOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/file/OpenOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/file/OpenOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/http/GoAwayConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/http/GoAwayConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/http/GoAwayConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/http/Http2SettingsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/http/Http2SettingsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/http/Http2SettingsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/http/RequestOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/http/RequestOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/http/RequestOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/http/WebSocketConnectOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/http/WebSocketConnectOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/metrics/MetricsOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/metrics/MetricsOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/metrics/MetricsOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/net/JksOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/JksOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/JksOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/net/KeyStoreOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/KeyStoreOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/KeyStoreOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/NetClientOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/NetClientOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/net/NetServerOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/NetServerOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/NetServerOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/net/NetworkOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/NetworkOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/NetworkOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/net/OpenSSLEngineOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/OpenSSLEngineOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/OpenSSLEngineOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/PemTrustOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/PemTrustOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/net/PfxOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/PfxOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/PfxOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/net/ProxyOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/ProxyOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/ProxyOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/SSLOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/SSLOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/net/TrafficShapingOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/TrafficShapingOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/TrafficShapingOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/tracing/TracingOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/tracing/TracingOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### UNUSED_IMPORT
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/tracing/TracingOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.pointer.JsonPointer;`
in `src/main/java/docoverride/json/Examples.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.json.pointer.JsonPointer;
import io.vertx.docgen.Source;

```

### UNUSED_IMPORT
Unused import `import java.net.URI;`
in `src/main/java/docoverride/json/Examples.java`
#### Snippet
```java
import io.vertx.docgen.Source;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.net.URI;`
in `src/main/java/examples/JsonPointerExamples.java`
#### Snippet
```java
import io.vertx.core.json.pointer.JsonPointer;

import java.net.URI;

public class JsonPointerExamples {
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Handler;`
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
package examples;

import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.http.HttpServer;`
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
import io.vertx.core.file.FileSystem;
import io.vertx.core.file.OpenOptions;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.net.NetServer;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.http.HttpServerOptions;`
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
import io.vertx.core.file.OpenOptions;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.net.NetServer;
import io.vertx.core.net.NetServerOptions;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.net.NetSocket;`
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
import io.vertx.core.net.NetServer;
import io.vertx.core.net.NetServerOptions;
import io.vertx.core.net.NetSocket;
import io.vertx.core.streams.Pipe;
import io.vertx.core.streams.Pump;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.streams.Pump;`
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
import io.vertx.core.net.NetSocket;
import io.vertx.core.streams.Pipe;
import io.vertx.core.streams.Pump;
import io.vertx.core.streams.ReadStream;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.streams.ReadStream;`
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
import io.vertx.core.streams.Pipe;
import io.vertx.core.streams.Pump;
import io.vertx.core.streams.ReadStream;

/**
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.impl.future.CompositeFutureImpl;`
in `src/main/java/io/vertx/core/CompositeFuture.java`
#### Snippet
```java

import io.vertx.codegen.annotations.GenIgnore;
import io.vertx.core.impl.future.CompositeFutureImpl;

import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/java/io/vertx/core/DeploymentOptions.java`
#### Snippet
```java

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `src/main/java/io/vertx/core/DeploymentOptions.java`
#### Snippet
```java
import io.vertx.core.json.JsonObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `src/main/java/io/vertx/core/DeploymentOptions.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `src/main/java/io/vertx/core/cli/TypedOption.java`
#### Snippet
```java
import io.vertx.core.cli.converters.Converter;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.net.impl.SocketAddressImpl;`
in `src/main/java/io/vertx/core/datagram/impl/DatagramPacketImpl.java`
#### Snippet
```java
import io.vertx.core.datagram.DatagramPacket;
import io.vertx.core.net.SocketAddress;
import io.vertx.core.net.impl.SocketAddressImpl;

import java.net.InetSocketAddress;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.dns.DnsResponseCode;`
in `src/main/java/io/vertx/core/dns/impl/DnsClientImpl.java`
#### Snippet
```java
import io.vertx.core.*;
import io.vertx.core.dns.*;
import io.vertx.core.dns.DnsResponseCode;
import io.vertx.core.dns.impl.decoder.RecordDecoder;
import io.vertx.core.impl.ContextInternal;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/eventbus/EventBus.java`
#### Snippet
```java
import io.vertx.codegen.annotations.Nullable;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/eventbus/Message.java`
#### Snippet
```java
import io.vertx.codegen.annotations.Nullable;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Handler;`
in `src/main/java/io/vertx/core/eventbus/Message.java`
#### Snippet
```java
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/eventbus/MessageProducer.java`
#### Snippet
```java
import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Handler;`
in `src/main/java/io/vertx/core/eventbus/MessageProducer.java`
#### Snippet
```java
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.http.RequestOptions;
import io.vertx.core.streams.WriteStream;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.http.RequestOptions;`
in `src/main/java/io/vertx/core/eventbus/MessageProducer.java`
#### Snippet
```java
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.http.RequestOptions;
import io.vertx.core.streams.WriteStream;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.streams.WriteStream;`
in `src/main/java/io/vertx/core/eventbus/MessageProducer.java`
#### Snippet
```java
import io.vertx.core.Handler;
import io.vertx.core.http.RequestOptions;
import io.vertx.core.streams.WriteStream;

/**
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `src/main/java/io/vertx/core/eventbus/impl/DeliveryContextBase.java`
#### Snippet
```java
import io.vertx.core.impl.ContextInternal;

import java.util.List;

abstract class DeliveryContextBase<T> implements DeliveryContext<T> {
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/file/FileSystem.java`
#### Snippet
```java
import io.vertx.codegen.annotations.Nullable;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Handler;`
in `src/main/java/io/vertx/core/file/FileSystem.java`
#### Snippet
```java
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/file/impl/AsyncFileLockImpl.java`
#### Snippet
```java
package io.vertx.core.file.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Handler;`
in `src/main/java/io/vertx/core/file/impl/AsyncFileLockImpl.java`
#### Snippet
```java
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.file.AsyncFileLock;
import io.vertx.core.file.FileSystemException;
```

### UNUSED_IMPORT
Unused import `import java.nio.file.Path;`
in `src/main/java/io/vertx/core/file/impl/FileCache.java`
#### Snippet
```java
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.PosixFilePermission;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/file/impl/FileSystemImpl.java`
#### Snippet
```java

import io.vertx.codegen.annotations.Nullable;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/file/impl/WindowsFileSystem.java`
#### Snippet
```java
package io.vertx.core.file.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.file.AsyncFile;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Handler;`
in `src/main/java/io/vertx/core/file/impl/WindowsFileSystem.java`
#### Snippet
```java

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.file.AsyncFile;
import io.vertx.core.file.OpenOptions;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/http/HttpClientRequest.java`
#### Snippet
```java

import io.vertx.codegen.annotations.*;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.http.impl.HttpUtils;`
in `src/main/java/io/vertx/core/http/HttpClosedException.java`
#### Snippet
```java

import io.vertx.core.VertxException;
import io.vertx.core.http.impl.HttpUtils;
import io.vertx.core.net.impl.ConnectionBase;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.net.impl.ConnectionBase;`
in `src/main/java/io/vertx/core/http/HttpClosedException.java`
#### Snippet
```java
import io.vertx.core.VertxException;
import io.vertx.core.http.impl.HttpUtils;
import io.vertx.core.net.impl.ConnectionBase;

/**
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/http/HttpConnection.java`
#### Snippet
```java

import io.vertx.codegen.annotations.*;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/http/HttpServerFileUpload.java`
#### Snippet
```java
import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/http/HttpServerResponse.java`
#### Snippet
```java

import io.vertx.codegen.annotations.*;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.http.Cookie;`
in `src/main/java/io/vertx/core/http/impl/Http1xServerRequest.java`
#### Snippet
```java
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.*;
import io.vertx.core.http.Cookie;
import io.vertx.core.http.HttpVersion;
import io.vertx.core.http.impl.headers.HeadersAdaptor;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.http.HttpVersion;`
in `src/main/java/io/vertx/core/http/impl/Http1xServerRequest.java`
#### Snippet
```java
import io.vertx.core.http.*;
import io.vertx.core.http.Cookie;
import io.vertx.core.http.HttpVersion;
import io.vertx.core.http.impl.headers.HeadersAdaptor;
import io.vertx.core.impl.ContextInternal;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/http/impl/Http1xServerResponse.java`
#### Snippet
```java
import io.netty.handler.codec.http.LastHttpContent;
import io.vertx.codegen.annotations.Nullable;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import java.io.FileNotFoundException;`
in `src/main/java/io/vertx/core/http/impl/Http1xServerResponse.java`
#### Snippet
```java

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Set;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.tracing.TracingPolicy;`
in `src/main/java/io/vertx/core/http/impl/Http2ServerRequest.java`
#### Snippet
```java
import io.vertx.core.net.NetSocket;
import io.vertx.core.net.SocketAddress;
import io.vertx.core.tracing.TracingPolicy;

import javax.net.ssl.SSLPeerUnverifiedException;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.http.HttpVersion;`
in `src/main/java/io/vertx/core/http/impl/Http2UpgradeClientConnection.java`
#### Snippet
```java
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.*;
import io.vertx.core.http.HttpVersion;
import io.vertx.core.impl.EventLoopContext;
import io.vertx.core.impl.ContextInternal;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/http/impl/HttpClientConnection.java`
#### Snippet
```java
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/http/impl/HttpClientRequestBase.java`
#### Snippet
```java

import io.netty.handler.codec.http2.Http2Error;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/http/impl/HttpClientRequestPushPromise.java`
#### Snippet
```java

import io.vertx.codegen.annotations.Nullable;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import java.nio.channels.ClosedChannelException;`
in `src/main/java/io/vertx/core/http/impl/HttpNetSocket.java`
#### Snippet
```java
import javax.net.ssl.SSLSession;
import javax.security.cert.X509Certificate;
import java.nio.channels.ClosedChannelException;
import java.security.cert.Certificate;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/http/impl/HttpServerFileUploadImpl.java`
#### Snippet
```java
package io.vertx.core.http.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.http.HttpServerOptions;`
in `src/main/java/io/vertx/core/http/impl/VertxHttp2ConnectionHandlerBuilder.java`
#### Snippet
```java
import io.netty.handler.codec.http2.Http2Settings;
import io.netty.handler.logging.LogLevel;
import io.vertx.core.http.HttpServerOptions;

import java.util.function.Function;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.MultiMap;`
in `src/main/java/io/vertx/core/http/impl/WebSocketImpl.java`
#### Snippet
```java
package io.vertx.core.http.impl;

import io.vertx.core.MultiMap;
import io.vertx.core.http.WebSocket;
import io.vertx.core.impl.ContextInternal;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.vertx.codegen.annotations.Nullable;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Promise;`
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.Promise;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.EventBus;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/impl/Deployment.java`
#### Snippet
```java
package io.vertx.core.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Context;
import io.vertx.core.DeploymentOptions;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.CompositeFuture;`
in `src/main/java/io/vertx/core/impl/DeploymentManager.java`
#### Snippet
```java

import io.vertx.core.AsyncResult;
import io.vertx.core.CompositeFuture;
import io.vertx.core.Context;
import io.vertx.core.DeploymentOptions;
```

### UNUSED_IMPORT
Unused import `import java.util.function.Consumer;`
in `src/main/java/io/vertx/core/impl/HAManager.java`
#### Snippet
```java
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

import static java.util.concurrent.TimeUnit.MINUTES;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Closeable;`
in `src/main/java/io/vertx/core/impl/WorkerExecutorInternal.java`
#### Snippet
```java
package io.vertx.core.impl;

import io.vertx.core.Closeable;
import io.vertx.core.Vertx;
import io.vertx.core.WorkerExecutor;
```

### UNUSED_IMPORT
Unused import `import java.nio.charset.Charset;`
in `src/main/java/io/vertx/core/impl/cpu/CpuCoreSensor.java`
#### Snippet
```java

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessController;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Collectors;`
in `src/main/java/io/vertx/core/impl/future/CompositeFutureImpl.java`
#### Snippet
```java

import java.util.function.Function;
import java.util.stream.Collectors;

/**
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Handler;`
in `src/main/java/io/vertx/core/impl/future/FutureBase.java`
#### Snippet
```java
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.impl.ContextInternal;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Context;`
in `src/main/java/io/vertx/core/impl/future/PromiseInternal.java`
#### Snippet
```java

import io.netty.util.concurrent.FutureListener;
import io.vertx.core.Context;
import io.vertx.core.Promise;
import io.vertx.core.impl.ContextInternal;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Collectors;`
in `src/main/java/io/vertx/core/impl/launcher/commands/StartCommand.java`
#### Snippet
```java
import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

/**
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Handler;`
in `src/main/java/io/vertx/core/impl/resolver/DefaultResolverProvider.java`
#### Snippet
```java
import io.netty.resolver.DefaultAddressResolverGroup;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.dns.AddressResolverOptions;
import io.vertx.core.spi.resolver.ResolverProvider;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.ServiceHelper;`
in `src/main/java/io/vertx/core/json/Json.java`
#### Snippet
```java
package io.vertx.core.json;

import io.vertx.core.ServiceHelper;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.jackson.JacksonFactory;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.jackson.JacksonFactory;`
in `src/main/java/io/vertx/core/json/Json.java`
#### Snippet
```java
import io.vertx.core.ServiceHelper;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.jackson.JacksonFactory;
import io.vertx.core.spi.JsonFactory;
import io.vertx.core.spi.json.JsonCodec;
```

### UNUSED_IMPORT
Unused import `import com.fasterxml.jackson.databind.module.SimpleModule;`
in `src/main/java/io/vertx/core/json/jackson/DatabindCodec.java`
#### Snippet
```java
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import io.netty.buffer.ByteBufInputStream;
import io.vertx.core.buffer.Buffer;
```

### UNUSED_IMPORT
Unused import `import java.time.Instant;`
in `src/main/java/io/vertx/core/json/jackson/DatabindCodec.java`
#### Snippet
```java
import java.io.IOException;
import java.io.InputStream;
import java.time.Instant;
import java.util.List;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.function.Consumer;`
in `src/main/java/io/vertx/core/json/pointer/JsonPointer.java`
#### Snippet
```java
import java.net.URI;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

```

### UNUSED_IMPORT
Unused import `import java.util.stream.Stream;`
in `src/main/java/io/vertx/core/json/pointer/JsonPointer.java`
#### Snippet
```java
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Stream;`
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.net.impl.KeyStoreHelper;`
in `src/main/java/io/vertx/core/net/KeyCertOptions.java`
#### Snippet
```java

import io.vertx.core.Vertx;
import io.vertx.core.net.impl.KeyStoreHelper;

import javax.net.ssl.KeyManagerFactory;
```

### UNUSED_IMPORT
Unused import `import javax.net.ssl.KeyManager;`
in `src/main/java/io/vertx/core/net/KeyManagerFactoryOptions.java`
#### Snippet
```java
import io.vertx.core.Vertx;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.X509KeyManager;
```

### UNUSED_IMPORT
Unused import `import javax.net.ssl.X509KeyManager;`
in `src/main/java/io/vertx/core/net/KeyStoreOptionsBase.java`
#### Snippet
```java
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import java.security.KeyStore;
import java.util.Objects;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.TimeUnit;`
in `src/main/java/io/vertx/core/net/NetClient.java`
#### Snippet
```java
import io.vertx.core.metrics.Measured;

import java.util.concurrent.TimeUnit;

/**
```

### UNUSED_IMPORT
Unused import `import static io.vertx.core.net.TrafficShapingOptions.DEFAULT_INBOUND_GLOBAL_BANDWIDTH_LIMIT;`
in `src/main/java/io/vertx/core/net/NetServerOptions.java`
#### Snippet
```java
import java.util.concurrent.TimeUnit;

import static io.vertx.core.net.TrafficShapingOptions.DEFAULT_INBOUND_GLOBAL_BANDWIDTH_LIMIT;
import static io.vertx.core.net.TrafficShapingOptions.DEFAULT_OUTBOUND_GLOBAL_BANDWIDTH_LIMIT;

```

### UNUSED_IMPORT
Unused import `import static io.vertx.core.net.TrafficShapingOptions.DEFAULT_OUTBOUND_GLOBAL_BANDWIDTH_LIMIT;`
in `src/main/java/io/vertx/core/net/NetServerOptions.java`
#### Snippet
```java

import static io.vertx.core.net.TrafficShapingOptions.DEFAULT_INBOUND_GLOBAL_BANDWIDTH_LIMIT;
import static io.vertx.core.net.TrafficShapingOptions.DEFAULT_OUTBOUND_GLOBAL_BANDWIDTH_LIMIT;

/**
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.atomic.AtomicReference;`
in `src/main/java/io/vertx/core/net/impl/NetClientImpl.java`
#### Snippet
```java
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.net.TrafficShapingOptions;`
in `src/main/java/io/vertx/core/net/impl/NetServerImpl.java`
#### Snippet
```java
import io.vertx.core.net.NetSocket;
import io.vertx.core.net.SocketAddress;
import io.vertx.core.net.TrafficShapingOptions;
import io.vertx.core.spi.metrics.MetricsProvider;
import io.vertx.core.spi.metrics.TCPMetrics;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/net/impl/NetSocketImpl.java`
#### Snippet
```java
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCounted;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Promise;`
in `src/main/java/io/vertx/core/net/impl/NetSocketImpl.java`
#### Snippet
```java
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Promise;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.Message;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/net/impl/SslHandshakeCompletionHandler.java`
#### Snippet
```java
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.Promise;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Future;`
in `src/main/java/io/vertx/core/net/impl/SslHandshakeCompletionHandler.java`
#### Snippet
```java
import io.netty.util.concurrent.Promise;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Handler;`
in `src/main/java/io/vertx/core/net/impl/SslHandshakeCompletionHandler.java`
#### Snippet
```java
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;

/**
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Promise;`
in `src/main/java/io/vertx/core/net/impl/pool/Endpoint.java`
#### Snippet
```java

import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.impl.ContextInternal;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/net/impl/pool/PoolConnector.java`
#### Snippet
```java
package io.vertx.core.net.impl.pool;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Handler;`
in `src/main/java/io/vertx/core/net/impl/pool/PoolConnector.java`
#### Snippet
```java
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.impl.EventLoopContext;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/net/impl/pool/PoolWaiter.java`
#### Snippet
```java
package io.vertx.core.net.impl.pool;

import io.vertx.core.AsyncResult;
import io.vertx.core.Context;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Context;`
in `src/main/java/io/vertx/core/net/impl/pool/PoolWaiter.java`
#### Snippet
```java

import io.vertx.core.AsyncResult;
import io.vertx.core.Context;
import io.vertx.core.Handler;
import io.vertx.core.Promise;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Handler;`
in `src/main/java/io/vertx/core/net/impl/pool/PoolWaiter.java`
#### Snippet
```java
import io.vertx.core.AsyncResult;
import io.vertx.core.Context;
import io.vertx.core.Handler;
import io.vertx.core.Promise;
import io.vertx.core.impl.ContextInternal;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.impl.EventLoopContext;`
in `src/main/java/io/vertx/core/net/impl/pool/PoolWaiter.java`
#### Snippet
```java
import io.vertx.core.Promise;
import io.vertx.core.impl.ContextInternal;
import io.vertx.core.impl.EventLoopContext;

/**
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.impl.future.PromiseInternal;`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
import io.vertx.core.impl.EventLoopContext;
import io.vertx.core.impl.future.Listener;
import io.vertx.core.impl.future.PromiseInternal;

import java.util.AbstractList;
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.atomic.AtomicReference;`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Function;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/shareddata/Counter.java`
#### Snippet
```java

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Handler;`
in `src/main/java/io/vertx/core/shareddata/Counter.java`
#### Snippet
```java
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;

import java.util.Objects;
```

### UNUSED_IMPORT
Unused import `import java.util.Objects;`
in `src/main/java/io/vertx/core/shareddata/Counter.java`
#### Snippet
```java
import io.vertx.core.Handler;

import java.util.Objects;

/**
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Context;`
in `src/main/java/io/vertx/core/shareddata/impl/LocalAsyncLocks.java`
#### Snippet
```java
package io.vertx.core.shareddata.impl;

import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.Promise;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/shareddata/impl/SharedDataImpl.java`
#### Snippet
```java
package io.vertx.core.shareddata.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Handler;`
in `src/main/java/io/vertx/core/shareddata/impl/SharedDataImpl.java`
#### Snippet
```java
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Promise;
import io.vertx.core.impl.Arguments;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.Json;`
in `src/main/java/io/vertx/core/spi/JsonFactory.java`
#### Snippet
```java
package io.vertx.core.spi;

import io.vertx.core.json.Json;
import io.vertx.core.json.jackson.JacksonFactory;
import io.vertx.core.spi.json.JsonCodec;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.metrics.impl.DummyVertxMetrics;`
in `src/main/java/io/vertx/core/spi/VertxMetricsFactory.java`
#### Snippet
```java
import io.vertx.core.json.JsonObject;
import io.vertx.core.metrics.MetricsOptions;
import io.vertx.core.metrics.impl.DummyVertxMetrics;
import io.vertx.core.spi.metrics.VertxMetrics;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.json.Json;`
in `src/main/java/io/vertx/core/spi/VertxServiceProvider.java`
#### Snippet
```java

import io.vertx.core.impl.VertxBuilder;
import io.vertx.core.json.Json;
import io.vertx.core.spi.json.JsonCodec;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.spi.json.JsonCodec;`
in `src/main/java/io/vertx/core/spi/VertxServiceProvider.java`
#### Snippet
```java
import io.vertx.core.impl.VertxBuilder;
import io.vertx.core.json.Json;
import io.vertx.core.spi.json.JsonCodec;

/**
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Handler;`
in `src/main/java/io/vertx/core/spi/resolver/ResolverProvider.java`
#### Snippet
```java
import io.netty.resolver.AddressResolverGroup;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.VertxException;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/streams/Pipe.java`
#### Snippet
```java
import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Handler;`
in `src/main/java/io/vertx/core/streams/Pipe.java`
#### Snippet
```java
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Promise;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Promise;`
in `src/main/java/io/vertx/core/streams/Pipe.java`
#### Snippet
```java
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Promise;

/**
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/streams/ReadStream.java`
#### Snippet
```java
import io.vertx.codegen.annotations.Nullable;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Promise;`
in `src/main/java/io/vertx/core/streams/ReadStream.java`
#### Snippet
```java
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Promise;
import io.vertx.core.streams.impl.PipeImpl;

```

### UNUSED_IMPORT
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/streams/WriteStream.java`
#### Snippet
```java
import io.vertx.codegen.annotations.Nullable;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Promise;`
in `src/main/java/io/vertx/core/streams/WriteStream.java`
#### Snippet
```java
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Promise;

/**
```

### UNUSED_IMPORT
Unused import `import io.vertx.core.Vertx;`
in `src/main/java/io/vertx/core/streams/impl/InboundBuffer.java`
#### Snippet
```java
import io.vertx.core.Context;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.impl.ContextInternal;

```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `servers` are updated, but never queried
in `src/main/java/io/vertx/core/net/impl/TCPServerBase.java`
#### Snippet
```java
  private ServerChannelLoadBalancer channelBalancer;
  private Future<Channel> bindFuture;
  private Set<TCPServerBase> servers;
  private TCPMetrics<?> metrics;
  private volatile int actualPort;
```

## RuleId[id=ConfusingMainMethod]
### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `src/main/java/io/vertx/core/spi/launcher/ExecutionContext.java`
#### Snippet
```java
   * @return the {@code Main-Class} object.
   */
  public Object main() {
    return get("Main");
  }
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/io/vertx/core/json/jackson/BufferDeserializer.java`
#### Snippet
```java

  @Override
  public Buffer deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
    String text = p.getText();
    try {
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/io/vertx/core/json/jackson/ByteArrayDeserializer.java`
#### Snippet
```java

  @Override
  public byte[] deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
    String text = p.getText();
    try {
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/io/vertx/core/json/jackson/InstantDeserializer.java`
#### Snippet
```java
class InstantDeserializer extends JsonDeserializer<Instant> {
  @Override
  public Instant deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
    String text = p.getText();
    try {
```

## RuleId[id=InfiniteRecursion]
### InfiniteRecursion
Method `initialSettings()` recurses infinitely, and can only end by throwing an exception
in `src/main/java/io/vertx/core/http/impl/VertxHttp2ConnectionHandlerBuilder.java`
#### Snippet
```java
  }

  VertxHttp2ConnectionHandlerBuilder<C> initialSettings(io.vertx.core.http.Http2Settings settings) {
    HttpUtils.fromVertxInitialSettings(isServer(), settings, initialSettings());
    return this;
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
The value changed at `offset++` is never used
in `src/main/java/io/vertx/core/dns/impl/decoder/RecordDecoder.java`
#### Snippet
```java
            boolean pointer = (len & 0xc0) == 0xc0;
            if (pointer) {
                offset = (len & 0x3f) << 8 | buf.getUnsignedByte(offset++);
            } else {
                name.append(buf.toString(offset, len, CharsetUtil.UTF_8)).append(".");
```

### UnusedAssignment
Variable `clientAuth` initializer `DEFAULT_CLIENT_AUTH` is redundant
in `src/main/java/io/vertx/core/eventbus/EventBusOptions.java`
#### Snippet
```java
  private String host;
  private int acceptBacklog;
  private ClientAuth clientAuth = DEFAULT_CLIENT_AUTH;

  // Attributes used to configure the client of the event bus when the event bus is clustered.
```

### UnusedAssignment
The value `new NetServerOptions().
setSsl(true).
setKeyStoreOptions(keyStoreOptions).
setJdkSslEngineOptions(new JdkSSLEngineOptions())` assigned to `options` is never used
in `src/main/java/examples/NetExamples.java`
#### Snippet
```java

    // Use JDK SSL engine explicitly
    options = new NetServerOptions().
      setSsl(true).
      setKeyStoreOptions(keyStoreOptions).
```

### UnusedAssignment
The value `new NetServerOptions().
setSsl(true).
setKeyStoreOptions(keyStoreOptions).
setOpenSslEngineOptions(new OpenSSLEngineOptions())` assigned to `options` is never used
in `src/main/java/examples/NetExamples.java`
#### Snippet
```java

    // Use OpenSSL engine
    options = new NetServerOptions().
      setSsl(true).
      setKeyStoreOptions(keyStoreOptions).
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `t instanceof VertxThread` is always `false`
in `src/main/java/io/vertx/core/Context.java`
#### Snippet
```java
  static boolean isOnEventLoopThread() {
    Thread t = Thread.currentThread();
    return t instanceof VertxThread && !((VertxThread) t).isWorker();
  }

```

### ConstantValue
Condition `t instanceof VertxThread && !((VertxThread) t).isWorker()` is always `false`
in `src/main/java/io/vertx/core/Context.java`
#### Snippet
```java
  static boolean isOnEventLoopThread() {
    Thread t = Thread.currentThread();
    return t instanceof VertxThread && !((VertxThread) t).isWorker();
  }

```

### ConstantValue
Condition `t instanceof VertxThread` is always `false`
in `src/main/java/io/vertx/core/Context.java`
#### Snippet
```java
  static boolean isOnWorkerThread() {
    Thread t = Thread.currentThread();
    return t instanceof VertxThread && ((VertxThread) t).isWorker();
  }

```

### ConstantValue
Condition `t instanceof VertxThread && ((VertxThread) t).isWorker()` is always `false`
in `src/main/java/io/vertx/core/Context.java`
#### Snippet
```java
  static boolean isOnWorkerThread() {
    Thread t = Thread.currentThread();
    return t instanceof VertxThread && ((VertxThread) t).isWorker();
  }

```

### ConstantValue
Condition `Thread.currentThread() instanceof VertxThread` is always `false`
in `src/main/java/io/vertx/core/Context.java`
#### Snippet
```java
   */
  static boolean isOnVertxThread() {
    return Thread.currentThread() instanceof VertxThread;
  }

```

### ConstantValue
Value `record` is always 'null'
in `src/main/java/io/vertx/core/dns/impl/decoder/RecordDecoder.java`
#### Snippet
```java
            return val;
        } else {
            ByteBuf content = ((DnsRawRecord) record).content();
            return RecordDecoder.getName(content, content.readerIndex());
        }
```

### ConstantValue
Condition `evt instanceof SslHandshakeCompletionEvent` is always `false`
in `src/main/java/io/vertx/core/net/impl/SslHandshakeCompletionHandler.java`
#### Snippet
```java
        promise.tryFailure(completion.cause());
      }
    } else if (evt instanceof SslHandshakeCompletionEvent) {
      SslHandshakeCompletionEvent completion = (SslHandshakeCompletionEvent) evt;
      if (completion.isSuccess()) {
```

### ConstantValue
Condition `buf.alloc() instanceof PooledByteBufAllocator || buf instanceof CompositeByteBuf` is always `true` when reached
in `src/main/java/io/vertx/core/net/impl/VertxHandler.java`
#### Snippet
```java
   */
  public static ByteBuf safeBuffer(ByteBuf buf) {
    if (buf != Unpooled.EMPTY_BUFFER && (buf.alloc() instanceof PooledByteBufAllocator || buf instanceof CompositeByteBuf)) {
      try {
        if (buf.isReadable()) {
```

### ConstantValue
Condition `msg instanceof ReferenceCounted && (!(msg instanceof ByteBuf))` is always `false`
in `src/main/java/io/vertx/core/net/impl/NetSocketImpl.java`
#### Snippet
```java
    private void handleInvalid(Object msg) {
      // ByteBuf are eagerly released when the message is processed
      if (msg instanceof ReferenceCounted && (!(msg instanceof ByteBuf))) {
        ReferenceCounted refCounter = (ReferenceCounted) msg;
        refCounter.release();
```

### ConstantValue
Condition `!(msg instanceof ByteBuf)` is always `false` when reached
in `src/main/java/io/vertx/core/net/impl/NetSocketImpl.java`
#### Snippet
```java
    private void handleInvalid(Object msg) {
      // ByteBuf are eagerly released when the message is processed
      if (msg instanceof ReferenceCounted && (!(msg instanceof ByteBuf))) {
        ReferenceCounted refCounter = (ReferenceCounted) msg;
        refCounter.release();
```

### ConstantValue
Condition `cause instanceof TooLongHttpHeaderException` is always `false`
in `src/main/java/io/vertx/core/http/HttpServerRequest.java`
#### Snippet
```java
    if (cause instanceof TooLongHttpLineException) {
      status = HttpResponseStatus.REQUEST_URI_TOO_LONG;
    } else if (cause instanceof TooLongHttpHeaderException) {
      status = HttpResponseStatus.REQUEST_HEADER_FIELDS_TOO_LARGE;
    }
```

### ConstantValue
Value `cause` is always 'null'
in `src/main/java/io/vertx/core/http/HttpServerRequest.java`
#### Snippet
```java
    if (cause instanceof TooLongHttpLineException) {
      status = HttpResponseStatus.REQUEST_URI_TOO_LONG;
    } else if (cause instanceof TooLongHttpHeaderException) {
      status = HttpResponseStatus.REQUEST_HEADER_FIELDS_TOO_LARGE;
    }
```

### ConstantValue
Condition `msg instanceof LastHttpContent` is always `true`
in `src/main/java/io/vertx/core/http/impl/WebSocketHandshakeInboundHandler.java`
#### Snippet
```java
        if (response != null) {
          response.content().writeBytes(content.content());
          if (msg instanceof LastHttpContent) {
            response.trailingHeaders().add(((LastHttpContent) msg).trailingHeaders());
            ChannelPipeline pipeline = chctx.pipeline();
```

### ConstantValue
Condition `response != null` is always `true`
in `src/main/java/io/vertx/core/http/impl/Http2ServerConnection.java`
#### Snippet
```java
    @Override
    public  void handleException(Throwable cause) {
      if (response != null) {
        response.handleException(cause);
      }
```

### ConstantValue
Condition `msg instanceof HttpContent` is always `false`
in `src/main/java/io/vertx/core/http/impl/Http1xUpgradeToH2CHandler.java`
#### Snippet
```java
    } else {
      if (handler != null) {
        if (msg instanceof HttpContent) {
          HttpContent content = (HttpContent) msg;
          ByteBuf buf = VertxHandler.safeBuffer(content.content());
```

### ConstantValue
Condition `metrics != null` is always `true`
in `src/main/java/io/vertx/core/http/impl/ClientHttpEndpointBase.java`
#### Snippet
```java
    if (metrics != null) {
      Object metric;
      if (metrics != null) {
        metric = metrics.enqueueRequest();
      } else {
```

### ConstantValue
Value `key.ssl` is always 'false'
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
      if (proxyOptions != null && !key.ssl && proxyOptions.getType() == ProxyType.HTTP) {
        SocketAddress server = SocketAddress.inetSocketAddress(proxyOptions.getPort(), proxyOptions.getHost());
        key = new EndpointKey(key.ssl, proxyOptions, server, key.peerAddr);
        proxyOptions = null;
      }
```

### ConstantValue
Condition `useSSL == Boolean.TRUE` is always `false`
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
            int defaultPort = 80;
            String addPort = (port != -1 && port != defaultPort) ? (":" + port) : "";
            u = (useSSL == Boolean.TRUE ? "https://" : "http://") + host + addPort + requestURI;
          }
        }
```

### ConstantValue
Value `useSSL` is always 'false'
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
            int defaultPort = 80;
            String addPort = (port != -1 && port != defaultPort) ? (":" + port) : "";
            u = (useSSL == Boolean.TRUE ? "https://" : "http://") + host + addPort + requestURI;
          }
        }
```

### ConstantValue
Condition `msg instanceof HttpContent` is always `false` when reached
in `src/main/java/io/vertx/core/http/impl/Http1xServerConnection.java`
#### Snippet
```java
  private void handleOther(Object msg) {
    // concrete type check first
    if (msg instanceof DefaultHttpContent || msg instanceof HttpContent) {
      onContent(msg);
    } else if (msg instanceof WebSocketFrame) {
```

### ConstantValue
Condition `msg instanceof WebSocketFrame` is always `false`
in `src/main/java/io/vertx/core/http/impl/Http1xServerConnection.java`
#### Snippet
```java
    if (msg instanceof DefaultHttpContent || msg instanceof HttpContent) {
      onContent(msg);
    } else if (msg instanceof WebSocketFrame) {
      handleWsFrame((WebSocketFrame) msg);
    }
```

### ConstantValue
Value `value` is always 'null'
in `src/main/java/io/vertx/core/http/impl/HttpUtils.java`
#### Snippet
```java
      validateHeaderName((AsciiString) value);
    } else {
      validateHeaderName0(value);
    }
  }
```

### ConstantValue
Value `headers` is always 'null'
in `src/main/java/io/vertx/core/http/impl/VertxHttpResponseEncoder.java`
#### Snippet
```java
      vertxHeaders.encode(buf);
    } else {
      super.encodeHeaders(headers, buf);
    }
  }
```

### ConstantValue
Condition `evt instanceof ShutdownEvent` is always `false`
in `src/main/java/io/vertx/core/http/impl/VertxHttp2ConnectionHandler.java`
#### Snippet
```java
      if (evt instanceof IdleStateEvent) {
        connection.handleIdle((IdleStateEvent) evt);
      } else if (evt instanceof ShutdownEvent) {
        ShutdownEvent shutdownEvt = (ShutdownEvent) evt;
        connection.shutdown(shutdownEvt.timeUnit().toMillis(shutdownEvt.timeout()));
```

### ConstantValue
Condition `msg instanceof Http2HeadersFrame` is always `true`
in `src/main/java/io/vertx/core/http/impl/VertxHttp2ConnectionHandler.java`
#### Snippet
```java
    if (msg instanceof Http2StreamFrame) {
      // Handle HTTP/2 clear text upgrade request
      if (msg instanceof Http2HeadersFrame) {
        Http2HeadersFrame frame = (Http2HeadersFrame) msg;
        connection.onHeadersRead(ctx, 1, frame.headers(), frame.padding(), frame.isEndStream());
```

### ConstantValue
Value `handler` is always 'null'
in `src/main/java/io/vertx/core/http/impl/HttpChannelConnector.java`
#### Snippet
```java
      ChannelHandler handler = stringChannelHandlerEntry.getValue();
      if (!(handler instanceof SslHandler)) {
        removedHandlers.add(handler);
      }
    }
```

### ConstantValue
Condition `obj instanceof ByteBuf` is always `false`
in `src/main/java/io/vertx/core/http/impl/Http1xConnectionBase.java`
#### Snippet
```java
    if (obj instanceof Buffer) {
      return ((Buffer) obj).length();
    } else if (obj instanceof ByteBuf) {
      return ((ByteBuf) obj).readableBytes();
      // see Netty's HttpObjectEncoder::acceptOutboundMessage:
```

### ConstantValue
Condition `obj instanceof FullHttpMessage` is always `false`
in `src/main/java/io/vertx/core/http/impl/Http1xConnectionBase.java`
#### Snippet
```java
      // see Netty's HttpObjectEncoder::acceptOutboundMessage:
      // the order of checks is the same!
    } else if (obj instanceof FullHttpMessage) {
      return ((FullHttpMessage) obj).content().readableBytes();
    } else if (obj instanceof LastHttpContent) {
```

### ConstantValue
Condition `obj instanceof LastHttpContent` is always `false`
in `src/main/java/io/vertx/core/http/impl/Http1xConnectionBase.java`
#### Snippet
```java
    } else if (obj instanceof FullHttpMessage) {
      return ((FullHttpMessage) obj).content().readableBytes();
    } else if (obj instanceof LastHttpContent) {
      return ((LastHttpContent) obj).content().readableBytes();
    } else if (obj instanceof  HttpContent) {
```

### ConstantValue
Condition `obj instanceof HttpContent` is always `false`
in `src/main/java/io/vertx/core/http/impl/Http1xConnectionBase.java`
#### Snippet
```java
    } else if (obj instanceof LastHttpContent) {
      return ((LastHttpContent) obj).content().readableBytes();
    } else if (obj instanceof  HttpContent) {
      return ((HttpContent) obj).content().readableBytes();
    } else if (obj instanceof WebSocketFrame) {
```

### ConstantValue
Condition `obj instanceof WebSocketFrame` is always `false`
in `src/main/java/io/vertx/core/http/impl/Http1xConnectionBase.java`
#### Snippet
```java
    } else if (obj instanceof  HttpContent) {
      return ((HttpContent) obj).content().readableBytes();
    } else if (obj instanceof WebSocketFrame) {
      return ((WebSocketFrame) obj).content().readableBytes();
    } else if (obj instanceof FileRegion) {
```

### ConstantValue
Condition `obj instanceof FileRegion` is always `false`
in `src/main/java/io/vertx/core/http/impl/Http1xConnectionBase.java`
#### Snippet
```java
    } else if (obj instanceof WebSocketFrame) {
      return ((WebSocketFrame) obj).content().readableBytes();
    } else if (obj instanceof FileRegion) {
      return ((FileRegion) obj).count();
    } else if (obj instanceof ChunkedFile) {
```

### ConstantValue
Condition `obj instanceof ChunkedFile` is always `false`
in `src/main/java/io/vertx/core/http/impl/Http1xConnectionBase.java`
#### Snippet
```java
    } else if (obj instanceof FileRegion) {
      return ((FileRegion) obj).count();
    } else if (obj instanceof ChunkedFile) {
      ChunkedFile file = (ChunkedFile) obj;
      return file.endOffset() - file.startOffset();
```

### ConstantValue
Condition `msg instanceof ByteBuf` is always `false`
in `src/main/java/io/vertx/core/http/impl/Http2UpgradeClientConnection.java`
#### Snippet
```java
            if (msg instanceof ByteBufHolder) {
              bufferedSize += ((ByteBufHolder)msg).content().readableBytes();
            } else if (msg instanceof ByteBuf) {
              bufferedSize += ((ByteBuf)msg).readableBytes();
            }
```

### ConstantValue
Condition `msg instanceof ByteBuf` is always `false`
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java
    } else if (msg instanceof HttpObject) {
      handleHttpMessage((HttpObject) msg);
    } else if (msg instanceof ByteBuf && isConnect) {
      handleChunk((ByteBuf) msg);
    } else if (msg instanceof WebSocketFrame) {
```

### ConstantValue
Condition `msg instanceof ByteBuf && isConnect` is always `false`
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java
    } else if (msg instanceof HttpObject) {
      handleHttpMessage((HttpObject) msg);
    } else if (msg instanceof ByteBuf && isConnect) {
      handleChunk((ByteBuf) msg);
    } else if (msg instanceof WebSocketFrame) {
```

### ConstantValue
Condition `msg instanceof WebSocketFrame` is always `false`
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java
    } else if (msg instanceof ByteBuf && isConnect) {
      handleChunk((ByteBuf) msg);
    } else if (msg instanceof WebSocketFrame) {
      WebSocketFrame frame = (WebSocketFrame) msg;
      if (webSocket == null) {
```

### ConstantValue
Value `obj` is always 'null'
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java
        response.status().reasonPhrase(),
        new HeadersAdaptor(response.headers())));
    } else if (obj instanceof HttpContent) {
      HttpContent chunk = (HttpContent) obj;
      if (chunk.content().isReadable()) {
```

### ConstantValue
Condition `thread instanceof VertxThread` is always `false`
in `src/main/java/io/vertx/core/impl/ContextInternal.java`
#### Snippet
```java
  static ContextInternal current() {
    Thread thread = Thread.currentThread();
    if (thread instanceof VertxThread) {
      return ((VertxThread) thread).context();
    } else {
```

### ConstantValue
Value `value` is always 'null'
in `src/main/java/io/vertx/core/http/impl/headers/HeadersMultiMap.java`
#### Snippet
```java
      ByteBufUtil.copy((AsciiString) value, 0, buf, offset, value.length());
    } else {
      buf.setCharSequence(offset, value, CharsetUtil.US_ASCII);
    }
  }
```

### ConstantValue
Condition `thread instanceof VertxThread` is always `false`
in `src/main/java/io/vertx/core/impl/VertxImpl.java`
#### Snippet
```java
  void endDispatch(ContextInternal prev) {
    Thread thread = Thread.currentThread();
    if (thread instanceof VertxThread) {
      VertxThread vertxThread = (VertxThread) thread;
      vertxThread.context = prev;
```

### ConstantValue
Condition `Thread.currentThread() instanceof VertxThread` is always `false`
in `src/main/java/io/vertx/core/impl/VertxImpl.java`
#### Snippet
```java
   */
  void executeIsolated(Handler<Void> task) {
    if (Thread.currentThread() instanceof VertxThread) {
      ContextInternal prev = beginDispatch(null);
      try {
```

### ConstantValue
Condition `thread instanceof VertxThread` is always `false`
in `src/main/java/io/vertx/core/impl/VertxImpl.java`
#### Snippet
```java
    Thread thread = Thread.currentThread();
    ContextInternal prev;
    if (thread instanceof VertxThread) {
      VertxThread vertxThread = (VertxThread) thread;
      prev = vertxThread.context;
```

### ConstantValue
Value `address` is always 'null'
in `src/main/java/io/vertx/core/impl/transports/KQueueTransport.java`
#### Snippet
```java
      return new SocketAddressImpl(((DomainSocketAddress) address).path());
    }
    return Transport.super.convert(address);
  }

```

### ConstantValue
Value `address` is always 'null'
in `src/main/java/io/vertx/core/impl/transports/EpollTransport.java`
#### Snippet
```java
      return new SocketAddressImpl(((DomainSocketAddress) address).path());
    }
    return Transport.super.convert(address);
  }

```

### ConstantValue
Condition `pending.isEmpty()` is always `false`
in `src/main/java/io/vertx/core/eventbus/impl/MessageConsumerImpl.java`
#### Snippet
```java
        return this;
      }
      if (pending.isEmpty()) {
        return this;
      }
```

### ConstantValue
Condition `rejectAndClose` is always `true`
in `src/main/java/examples/HTTPExamples.java`
#### Snippet
```java
        //
        boolean rejectAndClose = true;
        if (rejectAndClose) {

          // Reject with a failure code and close the connection
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.impl.future.SucceededFuture' to 'io.vertx.core.Future'
in `src/main/java/io/vertx/core/Future.java`
#### Snippet
```java
   */
  static <T> Future<T> succeededFuture() {
    return (Future<T>) SucceededFuture.EMPTY;
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.AsyncResult' to 'io.vertx.core.Future'
in `src/main/java/io/vertx/core/Future.java`
#### Snippet
```java
  @Override
  default <V> Future<V> mapEmpty() {
    return (Future<V>) AsyncResult.super.mapEmpty();
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Boolean' to 'T'
in `src/main/java/io/vertx/core/cli/impl/DefaultCommandLine.java`
#### Snippet
```java
        try {
          if (isSeenInCommandLine(option)) {
            return (T) Boolean.TRUE;
          } else {
            return (T) Boolean.FALSE;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Boolean' to 'T'
in `src/main/java/io/vertx/core/cli/impl/DefaultCommandLine.java`
#### Snippet
```java
            return (T) Boolean.TRUE;
          } else {
            return (T) Boolean.FALSE;
          }
        } catch (InvalidValueException e) {
```

### UNCHECKED_WARNING
Unchecked method 'sort(List)' invocation
in `src/main/java/io/vertx/core/dns/impl/DnsClientImpl.java`
#### Snippet
```java
        }
        if (records.size() > 0 && (records.get(0) instanceof MxRecordImpl || records.get(0) instanceof SrvRecordImpl)) {
          Collections.sort((List) records);
        }
        promise.setSuccess(records);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map\[\]' to 'java.util.Map\[\]'
in `src/main/java/io/vertx/core/net/impl/SslChannelProvider.java`
#### Snippet
```java
  private final SslContextProvider sslContextProvider;
  private final SslContext[] sslContexts = new SslContext[2];
  private final Map<String, SslContext>[] sslContextMaps = new Map[]{
    new ConcurrentHashMap<>(), new ConcurrentHashMap<>()
  };
```

### UNCHECKED_WARNING
Unchecked call to 'disconnected(S, SocketAddress)' as a member of raw type 'io.vertx.core.spi.metrics.TCPMetrics'
in `src/main/java/io/vertx/core/net/impl/ConnectionBase.java`
#### Snippet
```java
      flushBytesWritten();
      if (metrics instanceof TCPMetrics) {
        ((TCPMetrics) metrics).disconnected(metric(), remoteAddress());
      }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'bytesRead(S, SocketAddress, long)' as a member of raw type 'io.vertx.core.spi.metrics.NetworkMetrics'
in `src/main/java/io/vertx/core/net/impl/ConnectionBase.java`
#### Snippet
```java
      if (val > 0L) {
        remainingBytesRead = 0L;
        metrics.bytesRead(metric(), remoteAddress(), val);
      }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'exceptionOccurred(S, SocketAddress, Throwable)' as a member of raw type 'io.vertx.core.spi.metrics.NetworkMetrics'
in `src/main/java/io/vertx/core/net/impl/ConnectionBase.java`
#### Snippet
```java
    NetworkMetrics metrics = metrics();
    if (metrics != null) {
      metrics.exceptionOccurred(metric, remoteAddress(), t);
    }
    context.emit(t, err -> {
```

### UNCHECKED_WARNING
Unchecked call to 'bytesWritten(S, SocketAddress, long)' as a member of raw type 'io.vertx.core.spi.metrics.NetworkMetrics'
in `src/main/java/io/vertx/core/net/impl/ConnectionBase.java`
#### Snippet
```java
      if (val > 0L) {
        remainingBytesWritten = 0L;
        metrics.bytesWritten(metric(), remoteAddress(), val);
      }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'bytesWritten(S, SocketAddress, long)' as a member of raw type 'io.vertx.core.spi.metrics.NetworkMetrics'
in `src/main/java/io/vertx/core/net/impl/ConnectionBase.java`
#### Snippet
```java
      if (val > 0) {
        bytes &= METRICS_REPORTED_BYTES_LOW_MASK;
        metrics.bytesWritten(metric, remoteAddress(), val);
      }
      remainingBytesWritten = bytes;
```

### UNCHECKED_WARNING
Unchecked call to 'bytesRead(S, SocketAddress, long)' as a member of raw type 'io.vertx.core.spi.metrics.NetworkMetrics'
in `src/main/java/io/vertx/core/net/impl/ConnectionBase.java`
#### Snippet
```java
      if (val > 0) {
        bytes &= METRICS_REPORTED_BYTES_LOW_MASK;
        metrics.bytesRead(metric(), remoteAddress(), val);
      }
      remainingBytesRead = bytes;
```

### UNCHECKED_WARNING
Unchecked call to 'bytesRead(S, SocketAddress, long)' as a member of raw type 'io.vertx.core.spi.metrics.NetworkMetrics'
in `src/main/java/io/vertx/core/net/impl/ConnectionBase.java`
#### Snippet
```java
    if (val > 0) {
      bytes &= METRICS_REPORTED_BYTES_LOW_MASK;
      metrics.bytesRead(metric(), remoteAddress(), val);
    }
    remainingBytesRead = bytes;
```

### UNCHECKED_WARNING
Unchecked call to 'bytesWritten(S, SocketAddress, long)' as a member of raw type 'io.vertx.core.spi.metrics.NetworkMetrics'
in `src/main/java/io/vertx/core/net/impl/ConnectionBase.java`
#### Snippet
```java
      if (val > 0) {
        bytes &= METRICS_REPORTED_BYTES_LOW_MASK;
        metrics.bytesWritten(metric, remoteAddress(), val);
      }
      remainingBytesWritten = bytes;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.function.Consumer' to 'java.util.function.Consumer\>'
in `src/main/java/io/vertx/core/net/impl/pool/ConnectionManager.java`
#### Snippet
```java
   */
  public void checkExpired() {
    forEach((Consumer) EXPIRED_CHECKER);
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.net.impl.pool.Endpoint\[\]' to 'io.vertx.core.net.impl.pool.Endpoint\[\]'
in `src/main/java/io/vertx/core/net/impl/pool/ConnectionManager.java`
#### Snippet
```java
    while (true) {
      Endpoint<C> endpoint = endpointMap.computeIfAbsent(key, k -> {
        Endpoint<C>[] ref = new Endpoint[1];
        Endpoint<C> ep = provider.create(key, () -> endpointMap.remove(key, ref[0]));
        ref[0] = ep;
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.impl.future.PromiseInternal' to 'io.vertx.core.impl.future.PromiseInternal'
in `src/main/java/io/vertx/core/net/impl/NetClientImpl.java`
#### Snippet
```java
    ChannelGroupFuture fut = channelGroup.close();
    if (metrics != null) {
      PromiseInternal<Void> p = (PromiseInternal) Promise.promise();
      fut.addListener(p);
      p.future().<Void>compose(v -> {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `src/main/java/io/vertx/core/net/impl/TCPServerBase.java`
#### Snippet
```java
    listening = false;
    listenContext.removeCloseHook(this);
    Map<ServerID, TCPServerBase> servers = vertx.sharedTCPServers((Class<TCPServerBase>) getClass());
    synchronized (servers) {
      ServerChannelLoadBalancer balancer = actualServer.channelBalancer;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `src/main/java/io/vertx/core/net/impl/TCPServerBase.java`
#### Snippet
```java

    SocketAddress bindAddress;
    Map<ServerID, TCPServerBase> sharedNetServers = vertx.sharedTCPServers((Class<TCPServerBase>) getClass());
    synchronized (sharedNetServers) {
      actualPort = localAddress.port();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Collection\>' to 'java.util.Collection'
in `src/main/java/io/vertx/core/net/impl/KeyStoreHelper.java`
#### Snippet
```java
        switch (delimiter) {
          case "CERTIFICATE":
            return (Collection<X509Certificate>) certFactory.generateCertificates(new ByteArrayInputStream(content));
          default:
            return Collections.emptyList();
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.net.impl.pool.SimpleConnectionPool.LeaseImpl\[\]' to 'io.vertx.core.net.impl.pool.SimpleConnectionPool.LeaseImpl\[\]'
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
          int m = (int)Math.min(slot.concurrency - slot.usage, pool.waiters.size());
          if (m > 0) {
            extra = new LeaseImpl[m];
            for (int i = 0;i < m;i++) {
              extra[i] = new LeaseImpl<>(slot, pool.waiters.poll().handler);
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.net.impl.pool.SimpleConnectionPool.Acquire' to 'io.vertx.core.net.impl.pool.Executor.Action\>'
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
  public Future<Lease<C>> acquire(ContextInternal context, int kind) {
    LazyFuture<Lease<C>> fut = new LazyFuture<>();
    execute(new Acquire<>(context, PoolWaiter.NULL_LISTENER, capacityFactors[kind], fut));
    return fut;
  }
```

### UNCHECKED_WARNING
Unchecked call to 'Acquire(ContextInternal, Listener, int, Promise\>)' as a member of raw type 'io.vertx.core.net.impl.pool.SimpleConnectionPool.Acquire'
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
  public Future<Lease<C>> acquire(ContextInternal context, int kind) {
    LazyFuture<Lease<C>> fut = new LazyFuture<>();
    execute(new Acquire<>(context, PoolWaiter.NULL_LISTENER, capacityFactors[kind], fut));
    return fut;
  }
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.Future' to 'io.vertx.core.AsyncResult\>\>'
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
          @Override
          public void run() {
            handler.handle(POOL_CLOSED);
          }
        };
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.net.impl.pool.SimpleConnectionPool.LeaseImpl\[\]' to 'io.vertx.core.net.impl.pool.SimpleConnectionPool.LeaseImpl\[\]'
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
        if (m > 0) {
          c += m;
          leases = new LeaseImpl[m];
          for (int i = 0;i < m;i++) {
            leases[i] = new LeaseImpl<>(slot, pool.waiters.poll().handler);
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.Future' to 'io.vertx.core.Future\>'
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
            Future<Lease<C>> waiterFailure;
            if (pool.closed) {
              waiterFailure = POOL_CLOSED;
            } else {
              waiterFailure = Future.failedFuture(cause);
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.Future' to 'io.vertx.core.AsyncResult'
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
          @Override
          public void run() {
            handler.handle(POOL_CLOSED);
          }
        };
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.Future' to 'io.vertx.core.AsyncResult\>'
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
          @Override
          public void run() {
            handler.handle(POOL_CLOSED);
          }
        };
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.net.impl.pool.SimpleConnectionPool.Slot\[\]' to 'io.vertx.core.net.impl.pool.SimpleConnectionPool.Slot\[\]'
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
    this.capacityFactors = capacities;
    this.connector = connector;
    this.slots = new Slot[numSlots];
    this.size = 0;
    this.maxWaiters = maxWaiters;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.function.BiFunction' to 'java.util.function.BiFunction,java.util.List\>,io.vertx.core.net.impl.pool.PoolConnection\>'
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
    this.maxCapacity = maxCapacity;
    this.sync = new CombinerExecutor<>(this);
    this.selector = (BiFunction) SAME_EVENT_LOOP_SELECTOR;
    this.fallbackSelector = (BiFunction) FIRST_AVAILABLE_SELECTOR;
    this.contextProvider = EVENT_LOOP_CONTEXT_PROVIDER;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.function.BiFunction' to 'java.util.function.BiFunction,java.util.List\>,io.vertx.core.net.impl.pool.PoolConnection\>'
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
    this.sync = new CombinerExecutor<>(this);
    this.selector = (BiFunction) SAME_EVENT_LOOP_SELECTOR;
    this.fallbackSelector = (BiFunction) FIRST_AVAILABLE_SELECTOR;
    this.contextProvider = EVENT_LOOP_CONTEXT_PROVIDER;
    this.waiters = new Waiters<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.Future' to 'io.vertx.core.AsyncResult\>'
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
        @Override
        public void run() {
          waiters.forEach(w -> w.context.emit(POOL_CLOSED, w.handler));
          handler.handle(Future.succeededFuture(list));
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/io/vertx/core/http/HttpServerOptions.java`
#### Snippet
```java
    this.compressionSupported = other.isCompressionSupported();
    this.compressionLevel = other.getCompressionLevel();
    this.compressors = other.compressors != null ? new ArrayList<>(other.compressors) : null;
    this.maxWebSocketFrameSize = other.maxWebSocketFrameSize;
    this.maxWebSocketMessageSize = other.maxWebSocketMessageSize;
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/io/vertx/core/http/HttpServerOptions.java`
#### Snippet
```java
    this.compressionSupported = other.isCompressionSupported();
    this.compressionLevel = other.getCompressionLevel();
    this.compressors = other.compressors != null ? new ArrayList<>(other.compressors) : null;
    this.maxWebSocketFrameSize = other.maxWebSocketFrameSize;
    this.maxWebSocketMessageSize = other.maxWebSocketMessageSize;
```

### UNCHECKED_WARNING
Unchecked call to 'dequeueRequest(T)' as a member of raw type 'io.vertx.core.spi.metrics.ClientMetrics'
in `src/main/java/io/vertx/core/http/impl/ClientHttpEndpointBase.java`
#### Snippet
```java
      }
      fut = fut.andThen(ar -> {
        metrics.dequeueRequest(metric);
      });
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.http.impl.Http2ServerStreamHandler' to 'io.vertx.core.streams.ReadStream'
in `src/main/java/io/vertx/core/http/impl/Http2ServerResponse.java`
#### Snippet
```java
        } else {
          ctx.flush();
          HttpNetSocket ns = HttpNetSocket.netSocket(conn, stream.context, (ReadStream<Buffer>) stream.request, this);
          netSocket = Future.succeededFuture(ns);
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `src/main/java/io/vertx/core/http/impl/Http2ServerResponse.java`
#### Snippet
```java
    synchronized (conn) {
      checkHeadWritten();
      return (Set) cookies().removeOrInvalidateAll(name, invalidate);
    }
  }
```

### UNCHECKED_WARNING
Unchecked call to 'requestReset(R)' as a member of raw type 'io.vertx.core.spi.metrics.HttpServerMetrics'
in `src/main/java/io/vertx/core/http/impl/Http1xServerConnection.java`
#### Snippet
```java
      flushBytesWritten();
      if (requestFailed) {
        metrics.requestReset(request.metric());
        requestFailed = false;
      } else {
```

### UNCHECKED_WARNING
Unchecked call to 'responseEnd(R, HttpResponse, long)' as a member of raw type 'io.vertx.core.spi.metrics.HttpServerMetrics'
in `src/main/java/io/vertx/core/http/impl/Http1xServerConnection.java`
#### Snippet
```java
        requestFailed = false;
      } else {
        metrics.responseEnd(request.metric(), request.response(), request.response().bytesWritten());
      }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'sendResponse(Context, R, I, Throwable, TagExtractor)' as a member of raw type 'io.vertx.core.spi.tracing.VertxTracer'
in `src/main/java/io/vertx/core/http/impl/Http1xServerConnection.java`
#### Snippet
```java
    Object trace = request.trace();
    if (tracer != null && trace != null) {
      tracer.sendResponse(request.context, request.response(), trace, null, HttpUtils.SERVER_RESPONSE_TAG_EXTRACTOR);
    }
  }
```

### UNCHECKED_WARNING
Unchecked call to 'connected(S, R, ServerWebSocket)' as a member of raw type 'io.vertx.core.spi.metrics.HttpServerMetrics'
in `src/main/java/io/vertx/core/http/impl/Http1xServerConnection.java`
#### Snippet
```java
          options.isRegisterWebSocketWriteHandlers());
        if (METRICS_ENABLED && metrics != null) {
          webSocket.setMetric(metrics.connected(metric(), request.metric(), webSocket));
        }
        promise.complete(webSocket);
```

### UNCHECKED_WARNING
Unchecked call to 'responseEnd(R, HttpResponse, long)' as a member of raw type 'io.vertx.core.spi.metrics.HttpServerMetrics'
in `src/main/java/io/vertx/core/http/impl/Http1xServerConnection.java`
#### Snippet
```java
            if (metrics != null) {
              Http1xServerRequest request = Http1xServerConnection.this.responseInProgress;
              metrics.responseEnd(request.metric(), request.response(), request.response().bytesWritten());
            }
            super.handleClosed();
```

### UNCHECKED_WARNING
Unchecked call to 'requestEnd(M, long)' as a member of raw type 'io.vertx.core.spi.metrics.ClientMetrics'
in `src/main/java/io/vertx/core/http/impl/Http2ClientConnection.java`
#### Snippet
```java
      requestEnded = true;
      if (conn.metrics != null) {
        conn.metrics.requestEnd(metric, bytesWritten());
      }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'requestBegin(String, Req)' as a member of raw type 'io.vertx.core.spi.metrics.ClientMetrics'
in `src/main/java/io/vertx/core/http/impl/Http2ClientConnection.java`
#### Snippet
```java
        HttpClientPush push = new HttpClientPush(headers, pushStream);
        if (metrics != null) {
          Object metric = metrics.requestBegin(headers.path().toString(), push);
          pushStream.metric = metric;
          metrics.requestEnd(metric, 0L);
```

### UNCHECKED_WARNING
Unchecked call to 'requestEnd(M, long)' as a member of raw type 'io.vertx.core.spi.metrics.ClientMetrics'
in `src/main/java/io/vertx/core/http/impl/Http2ClientConnection.java`
#### Snippet
```java
          Object metric = metrics.requestBegin(headers.path().toString(), push);
          pushStream.metric = metric;
          metrics.requestEnd(metric, 0L);
        }
        stream.context.dispatch(push, pushHandler);
```

### UNCHECKED_WARNING
Unchecked call to 'endpointConnected(ClientMetrics)' as a member of raw type 'io.vertx.core.spi.metrics.HttpClientMetrics'
in `src/main/java/io/vertx/core/http/impl/Http2ClientConnection.java`
#### Snippet
```java
      if (metrics != null) {
        if (!upgrade)  {
          met.endpointConnected(metrics);
        }
      }
```

### UNCHECKED_WARNING
Unchecked call to 'endpointDisconnected(ClientMetrics)' as a member of raw type 'io.vertx.core.spi.metrics.HttpClientMetrics'
in `src/main/java/io/vertx/core/http/impl/Http2ClientConnection.java`
#### Snippet
```java
    handler.removeHandler(conn -> {
      if (metrics != null) {
        met.endpointDisconnected(metrics);
      }
      conn.tryEvict();
```

### UNCHECKED_WARNING
Unchecked call to 'requestBegin(String, Req)' as a member of raw type 'io.vertx.core.spi.metrics.ClientMetrics'
in `src/main/java/io/vertx/core/http/impl/Http2ClientConnection.java`
#### Snippet
```java
      init(stream);
      if (conn.metrics != null) {
        metric = conn.metrics.requestBegin(headers.path().toString(), head);
      }
      VertxTracer tracer = context.tracer();
```

### UNCHECKED_WARNING
Unchecked call to 'sendRequest(Context, SpanKind, TracingPolicy, R, String, BiConsumer, TagExtractor)' as a member of raw type 'io.vertx.core.spi.tracing.VertxTracer'
in `src/main/java/io/vertx/core/http/impl/Http2ClientConnection.java`
#### Snippet
```java
          operation = headers.method().toString();
        }
        trace = tracer.sendRequest(context, SpanKind.RPC, conn.client.options().getTracingPolicy(), head, operation, headers_, HttpUtils.CLIENT_HTTP_REQUEST_TAG_EXTRACTOR);
      }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'requestReset(M)' as a member of raw type 'io.vertx.core.spi.metrics.ClientMetrics'
in `src/main/java/io/vertx/core/http/impl/Http2ClientConnection.java`
#### Snippet
```java
    void onReset(long code) {
      if (conn.metrics != null) {
        conn.metrics.requestReset(metric);
      }
      super.onReset(code);
```

### UNCHECKED_WARNING
Unchecked call to 'responseBegin(M, Resp)' as a member of raw type 'io.vertx.core.spi.metrics.ClientMetrics'
in `src/main/java/io/vertx/core/http/impl/Http2ClientConnection.java`
#### Snippet
```java

        if (conn.metrics != null) {
          conn.metrics.responseBegin(metric, response);
        }

```

### UNCHECKED_WARNING
Unchecked call to 'requestReset(M)' as a member of raw type 'io.vertx.core.spi.metrics.ClientMetrics'
in `src/main/java/io/vertx/core/http/impl/Http2ClientConnection.java`
#### Snippet
```java
      if (conn.metrics != null) {
        if (!requestEnded || !responseEnded) {
          conn.metrics.requestReset(metric);
        }
      }
```

### UNCHECKED_WARNING
Unchecked call to 'receiveResponse(Context, R, O, Throwable, TagExtractor)' as a member of raw type 'io.vertx.core.spi.tracing.VertxTracer'
in `src/main/java/io/vertx/core/http/impl/Http2ClientConnection.java`
#### Snippet
```java
          err = HttpUtils.STREAM_CLOSED_EXCEPTION;
        }
        tracer.receiveResponse(context, response, trace, err, HttpUtils.CLIENT_RESPONSE_TAG_EXTRACTOR);
      }
      if (!responseEnded) {
```

### UNCHECKED_WARNING
Unchecked call to 'responseEnd(M, long)' as a member of raw type 'io.vertx.core.spi.metrics.ClientMetrics'
in `src/main/java/io/vertx/core/http/impl/Http2ClientConnection.java`
#### Snippet
```java
  private void metricsEnd(Stream stream) {
    if (metrics != null) {
      metrics.responseEnd(stream.metric, stream.bytesRead());
    }
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.http.impl.WebSocketImplBase' to 'S'
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
      checkClosed();
      conn.doSetWriteQueueMaxSize(maxSize);
      return (S) this;
    }
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.http.impl.WebSocketImplBase' to 'S'
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
      }
      this.handler = handler;
      return (S) this;
    }
  }
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.Handler' to 'io.vertx.core.Handler'
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
    synchronized (conn) {
      checkClosed();
      this.frameHandler = (Handler)handler;
      return (S) this;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.http.impl.WebSocketImplBase' to 'S'
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
      checkClosed();
      this.frameHandler = (Handler)handler;
      return (S) this;
    }
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.http.impl.WebSocketImplBase' to 'S'
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
  public S resume() {
    pending.resume();
    return (S) this;
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.http.impl.WebSocketImplBase' to 'S'
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
  public S pause() {
    pending.pause();
    return (S) this;
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.http.impl.WebSocketImplBase' to 'S'
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
      }
      this.endHandler = handler;
      return (S) this;
    }
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.http.impl.WebSocketImplBase' to 'S'
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
      }
      ((FrameAggregator) frameHandler).binaryMessageHandler = handler;
      return (S) this;
    }
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.http.impl.WebSocketImplBase' to 'S'
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
      checkClosed();
      this.closeHandler = handler;
      return (S) this;
    }
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.http.impl.WebSocketImplBase' to 'S'
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
      checkClosed();
      this.drainHandler = handler;
      return (S) this;
    }
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.http.impl.WebSocketImplBase' to 'S'
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
  public S fetch(long amount) {
    pending.fetch(amount);
    return (S) this;
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.http.impl.WebSocketImplBase' to 'S'
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
      checkClosed();
      this.pongHandler = handler;
      return (S) this;
    }
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.http.impl.WebSocketImplBase' to 'S'
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
      }
      this.exceptionHandler = handler;
      return (S) this;
    }
  }
```

### UNCHECKED_WARNING
Unchecked call to 'requestRouted(R, String)' as a member of raw type 'io.vertx.core.spi.metrics.HttpServerMetrics'
in `src/main/java/io/vertx/core/http/impl/Http1xServerRequest.java`
#### Snippet
```java
  public HttpServerRequest routed(String route) {
    if (METRICS_ENABLED && !response.ended() && conn.metrics != null) {
      conn.metrics.requestRouted(metric, route);
    }
    return this;
```

### UNCHECKED_WARNING
Unchecked call to 'requestEnd(R, HttpRequest, long)' as a member of raw type 'io.vertx.core.spi.metrics.HttpServerMetrics'
in `src/main/java/io/vertx/core/http/impl/Http1xServerRequest.java`
#### Snippet
```java
    HttpServerMetrics metrics = conn.metrics;
    if (metrics != null) {
      metrics.requestEnd(metric, this, bytesRead);
      conn.flushBytesRead();
    }
```

### UNCHECKED_WARNING
Unchecked call to 'requestReset(R)' as a member of raw type 'io.vertx.core.spi.metrics.HttpServerMetrics'
in `src/main/java/io/vertx/core/http/impl/Http1xServerRequest.java`
#### Snippet
```java
  private void reportRequestReset(Throwable err) {
    if (conn.metrics != null) {
      conn.metrics.requestReset(metric);
    }
    VertxTracer tracer = context.tracer();
```

### UNCHECKED_WARNING
Unchecked call to 'sendResponse(Context, R, I, Throwable, TagExtractor)' as a member of raw type 'io.vertx.core.spi.tracing.VertxTracer'
in `src/main/java/io/vertx/core/http/impl/Http1xServerRequest.java`
#### Snippet
```java
    VertxTracer tracer = context.tracer();
    if (tracer != null) {
      tracer.sendResponse(context, null, trace, err, TagExtractor.empty());
    }
  }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `src/main/java/io/vertx/core/http/impl/Http1xServerRequest.java`
#### Snippet
```java
  @Override
  public Set<Cookie> cookies(String name) {
    return (Set) response.cookies().getAll(name);
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `src/main/java/io/vertx/core/http/impl/Http1xServerRequest.java`
#### Snippet
```java
  @Override
  public Set<Cookie> cookies() {
    return (Set) response.cookies();
  }

```

### UNCHECKED_WARNING
Unchecked call to 'requestBegin(S, HttpRequest)' as a member of raw type 'io.vertx.core.spi.metrics.HttpServerMetrics'
in `src/main/java/io/vertx/core/http/impl/Http1xServerRequest.java`
#### Snippet
```java
    HttpServerMetrics metrics = conn.metrics;
    if (metrics != null) {
      metric = metrics.requestBegin(conn.metric(), this);
    }
    VertxTracer tracer = context.tracer();
```

### UNCHECKED_WARNING
Unchecked call to 'receiveRequest(Context, SpanKind, TracingPolicy, R, String, Iterable\>, TagExtractor)' as a member of raw type 'io.vertx.core.spi.tracing.VertxTracer'
in `src/main/java/io/vertx/core/http/impl/Http1xServerRequest.java`
#### Snippet
```java
    VertxTracer tracer = context.tracer();
    if (tracer != null) {
      trace = tracer.receiveRequest(context, SpanKind.RPC, conn.tracingPolicy(), this, request.method().name(), request.headers(), HttpUtils.SERVER_REQUEST_TAG_EXTRACTOR);
    }
  }
```

### UNCHECKED_WARNING
Unchecked call to 'endpointConnected(ClientMetrics)' as a member of raw type 'io.vertx.core.spi.metrics.HttpClientMetrics'
in `src/main/java/io/vertx/core/http/impl/HttpChannelConnector.java`
#### Snippet
```java
      if (met != null) {
        conn.metric(socketMetric);
        met.endpointConnected(metrics);
      }
      return conn;
```

### UNCHECKED_WARNING
Unchecked call to 'disconnected(W)' as a member of raw type 'io.vertx.core.spi.metrics.HttpClientMetrics'
in `src/main/java/io/vertx/core/http/impl/WebSocketImpl.java`
#### Snippet
```java
    HttpClientMetrics metrics = conn.metrics();
    if (METRICS_ENABLED && metrics != null) {
      metrics.disconnected(getMetric());
      setMetric(null);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `src/main/java/io/vertx/core/http/impl/Http2ServerRequest.java`
#### Snippet
```java
  @Override
  public Set<Cookie> cookies(String name) {
    return (Set) response.cookies().getAll(name);
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `src/main/java/io/vertx/core/http/impl/Http2ServerRequest.java`
#### Snippet
```java
  @Override
  public Set<Cookie> cookies() {
    return (Set) response.cookies();
  }

```

### UNCHECKED_WARNING
Unchecked call to 'responseBegin(R, HttpResponse)' as a member of raw type 'io.vertx.core.spi.metrics.HttpServerMetrics'
in `src/main/java/io/vertx/core/http/impl/Http1xServerResponse.java`
#### Snippet
```java
  private void reportResponseBegin() {
    if (conn.metrics != null) {
      conn.metrics.responseBegin(requestMetric, this);
    }
  }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `src/main/java/io/vertx/core/http/impl/Http1xServerResponse.java`
#### Snippet
```java
    synchronized (conn) {
      checkHeadWritten();
      return (Set) cookies().removeOrInvalidateAll(name, invalidate);
    }
  }
```

### UNCHECKED_WARNING
Unchecked call to 'responseBegin(R, HttpResponse)' as a member of raw type 'io.vertx.core.spi.metrics.HttpServerMetrics'
in `src/main/java/io/vertx/core/http/impl/Http1xServerResponse.java`
#### Snippet
```java
  void completeHandshake() {
    if (conn.metrics != null) {
      conn.metrics.responseBegin(requestMetric, this);
    }
    setStatusCode(101);
```

### UNCHECKED_WARNING
Unchecked call to 'disconnected(W)' as a member of raw type 'io.vertx.core.spi.metrics.HttpServerMetrics'
in `src/main/java/io/vertx/core/http/impl/ServerWebSocketImpl.java`
#### Snippet
```java
    HttpServerMetrics metrics = conn.metrics;
    if (METRICS_ENABLED && metrics != null) {
      metrics.disconnected(getMetric());
      setMetric(null);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'receiveRequest(Context, SpanKind, TracingPolicy, R, String, Iterable\>, TagExtractor)' as a member of raw type 'io.vertx.core.spi.tracing.VertxTracer'
in `src/main/java/io/vertx/core/http/impl/Http2ServerStream.java`
#### Snippet
```java
    VertxTracer tracer = context.tracer();
    if (tracer != null) {
      trace = tracer.receiveRequest(context, SpanKind.RPC, tracingPolicy, request, method().name(), new Http2HeadersAdaptor(headers), HttpUtils.SERVER_REQUEST_TAG_EXTRACTOR);
    }
    request.dispatch(conn.requestHandler);
```

### UNCHECKED_WARNING
Unchecked call to 'requestRouted(R, String)' as a member of raw type 'io.vertx.core.spi.metrics.HttpServerMetrics'
in `src/main/java/io/vertx/core/http/impl/Http2ServerStream.java`
#### Snippet
```java
      HttpServerMetrics metrics = conn.metrics();
      if (metrics != null && !responseEnded) {
        metrics.requestRouted(metric, route);
      }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'responseBegin(R, HttpResponse)' as a member of raw type 'io.vertx.core.spi.metrics.HttpServerMetrics'
in `src/main/java/io/vertx/core/http/impl/Http2ServerStream.java`
#### Snippet
```java
      HttpServerMetrics metrics = conn.metrics();
      if (metrics != null) {
        metrics.responseBegin(metric, request.response());
      }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'responseEnd(R, HttpResponse, long)' as a member of raw type 'io.vertx.core.spi.metrics.HttpServerMetrics'
in `src/main/java/io/vertx/core/http/impl/Http2ServerStream.java`
#### Snippet
```java
      HttpServerMetrics metrics = conn.metrics();
      if (metrics != null) {
        metrics.responseEnd(metric, request.response(), bytesWritten());
      }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'requestEnd(R, HttpRequest, long)' as a member of raw type 'io.vertx.core.spi.metrics.HttpServerMetrics'
in `src/main/java/io/vertx/core/http/impl/Http2ServerStream.java`
#### Snippet
```java
      HttpServerMetrics metrics = conn.metrics();
      if (metrics != null) {
        metrics.requestEnd(metric, (HttpRequest) request, bytesRead());
      }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'responsePushed(S, HttpMethod, String, HttpResponse)' as a member of raw type 'io.vertx.core.spi.metrics.HttpServerMetrics'
in `src/main/java/io/vertx/core/http/impl/Http2ServerStream.java`
#### Snippet
```java
      if (metrics != null) {
        if (request.response().isPush()) {
          metric = metrics.responsePushed(conn.metric(), method(), uri, request.response());
        } else {
          metric = metrics.requestBegin(conn.metric(), (HttpRequest) request);
```

### UNCHECKED_WARNING
Unchecked call to 'requestBegin(S, HttpRequest)' as a member of raw type 'io.vertx.core.spi.metrics.HttpServerMetrics'
in `src/main/java/io/vertx/core/http/impl/Http2ServerStream.java`
#### Snippet
```java
          metric = metrics.responsePushed(conn.metric(), method(), uri, request.response());
        } else {
          metric = metrics.requestBegin(conn.metric(), (HttpRequest) request);
        }
      }
```

### UNCHECKED_WARNING
Unchecked call to 'requestReset(R)' as a member of raw type 'io.vertx.core.spi.metrics.HttpServerMetrics'
in `src/main/java/io/vertx/core/http/impl/Http2ServerStream.java`
#### Snippet
```java
      // Null in case of push response : handle this case
      if (metrics != null && (!requestEnded || !responseEnded)) {
        metrics.requestReset(metric);
      }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'sendResponse(Context, R, I, Throwable, TagExtractor)' as a member of raw type 'io.vertx.core.spi.tracing.VertxTracer'
in `src/main/java/io/vertx/core/http/impl/Http2ServerStream.java`
#### Snippet
```java
        }
      }
      tracer.sendResponse(context, failure == null ? request.response() : null, trace, failure, HttpUtils.SERVER_RESPONSE_TAG_EXTRACTOR);
    }
    super.onClose();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `src/main/java/io/vertx/core/impl/JavaVerticleFactory.java`
#### Snippet
```java
        CompilingClassLoader compilingLoader = new CompilingClassLoader(classLoader, verticleName);
        String className = compilingLoader.resolveMainClassName();
        clazz = (Class<Verticle>) compilingLoader.loadClass(className);
      } else {
        clazz = (Class<Verticle>) classLoader.loadClass(verticleName);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `src/main/java/io/vertx/core/impl/JavaVerticleFactory.java`
#### Snippet
```java
        clazz = (Class<Verticle>) compilingLoader.loadClass(className);
      } else {
        clazz = (Class<Verticle>) classLoader.loadClass(verticleName);
      }
    } catch (ClassNotFoundException e) {
```

### UNCHECKED_WARNING
Unchecked call to 'endpointDisconnected(ClientMetrics)' as a member of raw type 'io.vertx.core.spi.metrics.HttpClientMetrics'
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java
    if (metrics != null) {
      HttpClientMetrics met = client.metrics();
      met.endpointDisconnected(metrics);
    }
    if (!evicted) {
```

### UNCHECKED_WARNING
Unchecked call to 'requestReset(M)' as a member of raw type 'io.vertx.core.spi.metrics.ClientMetrics'
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java
    for (Stream stream : sentStreams) {
      if (metrics != null) {
        metrics.requestReset(stream.metric);
      }
      Object trace = stream.trace;
```

### UNCHECKED_WARNING
Unchecked call to 'receiveResponse(Context, R, O, Throwable, TagExtractor)' as a member of raw type 'io.vertx.core.spi.tracing.VertxTracer'
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java
      Object trace = stream.trace;
      if (tracer != null && trace != null) {
        tracer.receiveResponse(stream.context, null, trace, HttpUtils.CONNECTION_CLOSED_EXCEPTION, TagExtractor.empty());
      }
      stream.context.execute(null, v -> stream.handleClosed());
```

### UNCHECKED_WARNING
Unchecked call to 'requestBegin(String, Req)' as a member of raw type 'io.vertx.core.spi.metrics.ClientMetrics'
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java
      this.isConnect = connect;
      if (this.metrics != null) {
        stream.metric = this.metrics.requestBegin(request.uri, request);
      }
      VertxTracer tracer = context.tracer();
```

### UNCHECKED_WARNING
Unchecked call to 'sendRequest(Context, SpanKind, TracingPolicy, R, String, BiConsumer, TagExtractor)' as a member of raw type 'io.vertx.core.spi.tracing.VertxTracer'
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java
          operation = request.method.name();
        }
        stream.trace = tracer.sendRequest(stream.context, SpanKind.RPC, options.getTracingPolicy(), request, operation, headers, HttpUtils.CLIENT_HTTP_REQUEST_TAG_EXTRACTOR);
      }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'receiveResponse(Context, R, O, Throwable, TagExtractor)' as a member of raw type 'io.vertx.core.spi.tracing.VertxTracer'
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java
    VertxTracer tracer = context.tracer();
    if (tracer != null) {
      tracer.receiveResponse(stream.context, stream.response, stream.trace, null, HttpUtils.CLIENT_RESPONSE_TAG_EXTRACTOR);
    }
    if (metrics != null) {
```

### UNCHECKED_WARNING
Unchecked call to 'responseEnd(M, long)' as a member of raw type 'io.vertx.core.spi.metrics.ClientMetrics'
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java
    }
    if (metrics != null) {
      metrics.responseEnd(stream.metric, stream.bytesRead);
    }
    flushBytesRead();
```

### UNCHECKED_WARNING
Unchecked call to 'requestEnd(M, long)' as a member of raw type 'io.vertx.core.spi.metrics.ClientMetrics'
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java
      checkLifecycle = s.responseEnded;
      if (metrics != null) {
        metrics.requestEnd(s.metric, s.bytesWritten);
      }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'responseBegin(M, Resp)' as a member of raw type 'io.vertx.core.spi.metrics.ClientMetrics'
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java

        if (metrics != null) {
          metrics.responseBegin(stream.metric, response);
        }

```

### UNCHECKED_WARNING
Unchecked call to 'begin(T)' as a member of raw type 'io.vertx.core.spi.metrics.PoolMetrics'
in `src/main/java/io/vertx/core/impl/ContextBase.java`
#### Snippet
```java
        Object execMetric = null;
        if (metrics != null) {
          execMetric = metrics.begin(queueMetric);
        }
        context.dispatch(promise, f -> {
```

### UNCHECKED_WARNING
Unchecked call to 'end(T, boolean)' as a member of raw type 'io.vertx.core.spi.metrics.PoolMetrics'
in `src/main/java/io/vertx/core/impl/ContextBase.java`
#### Snippet
```java
        });
        if (metrics != null) {
          metrics.end(execMetric, fut.succeeded());
        }
      };
```

### UNCHECKED_WARNING
Unchecked call to 'rejected(T)' as a member of raw type 'io.vertx.core.spi.metrics.PoolMetrics'
in `src/main/java/io/vertx/core/impl/ContextBase.java`
#### Snippet
```java
      // Pool is already shut down
      if (metrics != null) {
        metrics.rejected(queueMetric);
      }
      throw e;
```

### UNCHECKED_WARNING
Unchecked call to 'begin(T)' as a member of raw type 'io.vertx.core.spi.metrics.PoolMetrics'
in `src/main/java/io/vertx/core/impl/WorkerContext.java`
#### Snippet
```java
          Object execMetric = null;
          if (metrics != null) {
            execMetric = metrics.begin(queueMetric);
          }
          try {
```

### UNCHECKED_WARNING
Unchecked call to 'end(T, boolean)' as a member of raw type 'io.vertx.core.spi.metrics.PoolMetrics'
in `src/main/java/io/vertx/core/impl/WorkerContext.java`
#### Snippet
```java
          } finally {
            if (metrics != null) {
              metrics.end(execMetric, true);
            }
          }
```

### UNCHECKED_WARNING
Unchecked call to 'begin(T)' as a member of raw type 'io.vertx.core.spi.metrics.PoolMetrics'
in `src/main/java/io/vertx/core/impl/WorkerContext.java`
#### Snippet
```java
        Object execMetric = null;
        if (metrics != null) {
          execMetric = metrics.begin(queueMetric);
        }
        try {
```

### UNCHECKED_WARNING
Unchecked call to 'end(T, boolean)' as a member of raw type 'io.vertx.core.spi.metrics.PoolMetrics'
in `src/main/java/io/vertx/core/impl/WorkerContext.java`
#### Snippet
```java
        } finally {
          if (metrics != null) {
            metrics.end(execMetric, true);
          }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/io/vertx/core/impl/ConversionHelper.java`
#### Snippet
```java
      return null;
    }
    List<Object> list = new ArrayList<>(json.getList());
    for (int i = 0; i < list.size(); i++) {
      list.set(i, fromObject(list.get(i)));
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/io/vertx/core/impl/ConversionHelper.java`
#### Snippet
```java
      return null;
    }
    List<Object> list = new ArrayList<>(json.getList());
    for (int i = 0; i < list.size(); i++) {
      list.set(i, fromObject(list.get(i)));
```

### UNCHECKED_WARNING
Unchecked call to 'SucceededFuture(ContextInternal, T)' as a member of raw type 'io.vertx.core.impl.future.SucceededFuture'
in `src/main/java/io/vertx/core/impl/future/SucceededFuture.java`
#### Snippet
```java
   * Stateless instance of empty results that can be shared safely.
   */
  public static final SucceededFuture EMPTY = new SucceededFuture(null, null);

  private final T result;
```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.Handler\>' to 'io.vertx.core.impl.future.Listener'
in `src/main/java/io/vertx/core/impl/future/SucceededFuture.java`
#### Snippet
```java
  public Future<T> onComplete(Handler<AsyncResult<T>> handler) {
    if (handler instanceof Listener) {
      emitSuccess(result ,(Listener<T>) handler);
    } else if (context != null) {
      context.emit(this, handler);
```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.impl.future.FailedFuture' to 'io.vertx.core.Future++'++
in `src/main/java/io/vertx/core/impl/future/FailedFuture.java`
#### Snippet
```java
  @Override
  public <U> Future<U> map(Function<T, U> mapper) {
    return (Future<U>) this;
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.impl.future.FailedFuture' to 'io.vertx.core.Future'
in `src/main/java/io/vertx/core/impl/future/FailedFuture.java`
#### Snippet
```java
  @Override
  public <V> Future<V> map(V value) {
    return (Future<V>) this;
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.Handler\>' to 'io.vertx.core.impl.future.Listener'
in `src/main/java/io/vertx/core/impl/future/FailedFuture.java`
#### Snippet
```java
  public Future<T> onComplete(Handler<AsyncResult<T>> handler) {
    if (handler instanceof Listener) {
      emitFailure(cause, (Listener<T>) handler);
    } else if (context != null) {
      context.emit(this, handler);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/io/vertx/core/impl/future/FutureImpl.java`
#### Snippet
```java
   */
  public synchronized T result() {
    return value instanceof CauseHolder ? null : value == NULL_VALUE ? null : (T) value;
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.Handler\>' to 'io.vertx.core.impl.future.Listener'
in `src/main/java/io/vertx/core/impl/future/FutureImpl.java`
#### Snippet
```java
    Listener<T> listener;
    if (handler instanceof Listener) {
      listener = (Listener<T>) handler;
    } else {
      listener = new Listener<T>() {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/io/vertx/core/impl/future/FutureImpl.java`
#### Snippet
```java
        v = null;
      }
      emitSuccess((T) v, listener);
    }
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'io.vertx.core.Future' to 'io.vertx.core.Future'
in `src/main/java/io/vertx/core/impl/future/CompositeFutureImpl.java`
#### Snippet
```java
      throw new IndexOutOfBoundsException();
    }
    return (Future<T>) results[index];
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.Promise' to 'io.vertx.core.Promise'
in `src/main/java/io/vertx/core/impl/VertxImpl.java`
#### Snippet
```java
    fut = fut
      .transform(ar -> addressResolver.close())
      .transform(ar -> Future.future(h -> eventBus.close((Promise) h)))
      .transform(ar -> closeClusterManager())
      .transform(ar -> {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `src/main/java/io/vertx/core/impl/VertxImpl.java`
#### Snippet
```java
  public <S extends TCPServerBase> Map<ServerID, S> sharedTCPServers(Class<S> type) {
    if (NetServerImpl.class.isAssignableFrom(type)) {
      return (Map<ServerID, S>) sharedNetServers;
    } else if (HttpServerImpl.class.isAssignableFrom(type)) {
      return (Map<ServerID, S>) sharedHttpServers;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `src/main/java/io/vertx/core/impl/VertxImpl.java`
#### Snippet
```java
      return (Map<ServerID, S>) sharedNetServers;
    } else if (HttpServerImpl.class.isAssignableFrom(type)) {
      return (Map<ServerID, S>) sharedHttpServers;
    } else {
      throw new IllegalStateException();
```

### UNCHECKED_WARNING
Unchecked method 'valueOf(Class, String)' invocation
in `src/main/java/io/vertx/core/impl/launcher/commands/BareCommand.java`
#### Snippet
```java
            arg = Boolean.valueOf(propVal);
          } else if (argType.isEnum()){
            arg = Enum.valueOf((Class<? extends Enum>)argType, propVal);
          } else {
            log.warn("Invalid type for setter: " + argType);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `src/main/java/io/vertx/core/impl/launcher/commands/BareCommand.java`
#### Snippet
```java
            arg = Boolean.valueOf(propVal);
          } else if (argType.isEnum()){
            arg = Enum.valueOf((Class<? extends Enum>)argType, propVal);
          } else {
            log.warn("Invalid type for setter: " + argType);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
    // perform wrapping
    if (val instanceof Map) {
      val = new JsonObject((Map) val);
    } else if (val instanceof List) {
      val = new JsonArray((List) val);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/io/vertx/core/json/jackson/DatabindCodec.java`
#### Snippet
```java
    T value = DatabindCodec.mapper.convertValue(json, clazz);
    if (clazz == Object.class) {
      value = (T) adapt(value);
    }
    return value;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/io/vertx/core/json/jackson/DatabindCodec.java`
#### Snippet
```java
    }
    if (type.getType() == Object.class) {
      value = (T) adapt(value);
    }
    return value;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/io/vertx/core/json/jackson/DatabindCodec.java`
#### Snippet
```java
    }
    if (type == Object.class) {
      value = (T) adapt(value);
    }
    return value;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/io/vertx/core/json/jackson/DatabindCodec.java`
#### Snippet
```java
    T value = DatabindCodec.mapper.convertValue(json, type);
    if (type.getType() == Object.class) {
      value = (T) adapt(value);
    }
    return value;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
    Object val = list.get(pos);
    if (val instanceof Map) {
      val = new JsonObject((Map) val);
    }
    return (JsonObject) val;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
      throw new NullPointerException();
    }
    this.list = list;
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java

  private void fromBuffer(Buffer buf) {
    list = Json.CODEC.fromBuffer(buf, List.class);
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java

  private void fromJson(String json) {
    list = Json.CODEC.fromString(json, List.class);
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.reflect.Type' to 'java.lang.Class'
in `src/main/java/io/vertx/core/json/jackson/JacksonCodec.java`
#### Snippet
```java
    Type type = typeRef.getType();
    if (type instanceof Class) {
      return (Class<T>) type;
    } else if (type instanceof ParameterizedType) {
      return (Class<T>) ((ParameterizedType)type).getRawType();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.reflect.Type' to 'java.lang.Class'
in `src/main/java/io/vertx/core/json/jackson/JacksonCodec.java`
#### Snippet
```java
      return (Class<T>) type;
    } else if (type instanceof ParameterizedType) {
      return (Class<T>) ((ParameterizedType)type).getRawType();
    } else {
      throw new DecodeException();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/io/vertx/core/json/jackson/JacksonCodec.java`
#### Snippet
```java
      }
      if (clazz == Object.class) {
        o = new JsonObject((Map) o);
      }
      return clazz.cast(o);
```

### UNCHECKED_WARNING
Unchecked method 'valueOf(Class, String)' invocation
in `src/main/java/io/vertx/core/json/jackson/JacksonCodec.java`
#### Snippet
```java
      String str = (String) o;
      if (clazz.isEnum()) {
        o = Enum.valueOf((Class<Enum>) clazz, str);
      } else if (clazz == byte[].class) {
        o = BASE64_DECODER.decode(str);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class' to 'java.lang.Class'
in `src/main/java/io/vertx/core/json/jackson/JacksonCodec.java`
#### Snippet
```java
      String str = (String) o;
      if (clazz.isEnum()) {
        o = Enum.valueOf((Class<Enum>) clazz, str);
      } else if (clazz == byte[].class) {
        o = BASE64_DECODER.decode(str);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `src/main/java/io/vertx/core/json/jackson/JacksonCodec.java`
#### Snippet
```java
      if (json instanceof Map) {
        generator.writeStartObject();
        for (Map.Entry<String, ?> e : ((Map<String, ?>)json).entrySet()) {
          generator.writeFieldName(e.getKey());
          encodeJson(e.getValue(), generator);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java

  private void fromJson(String json) {
    map = Json.CODEC.fromString(json, Map.class);
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java

  private void fromBuffer(Buffer buf) {
    map = Json.CODEC.fromBuffer(buf, Map.class);
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
    Object val = map.get(key);
    if (val instanceof Map) {
      val = new JsonObject((Map) val);
    }
    return (JsonObject) val;
```

### UNCHECKED_WARNING
Unchecked call to 'receiveResponse(Context, R, O, Throwable, TagExtractor)' as a member of raw type 'io.vertx.core.spi.tracing.VertxTracer'
in `src/main/java/io/vertx/core/eventbus/impl/ReplyHandler.java`
#### Snippet
```java
    Object trace = this.trace;
    if (tracer != null && src && trace != null) {
      tracer.receiveResponse(context, reply, trace, failure, TagExtractor.empty());
    }
  }
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.eventbus.impl.MessageImpl' to 'io.vertx.core.eventbus.impl.MessageImpl'
in `src/main/java/io/vertx/core/eventbus/impl/OutboundDeliveryContext.java`
#### Snippet
```java

  OutboundDeliveryContext(ContextInternal ctx, MessageImpl message, DeliveryOptions options, ReplyHandler<T> replyHandler, Promise<Void> writePromise) {
    super(message, message.bus.outboundInterceptors(), ctx);
    this.ctx = ctx;
    this.options = options;
```

### UNCHECKED_WARNING
Unchecked call to 'sendRequest(Context, SpanKind, TracingPolicy, R, String, BiConsumer, TagExtractor)' as a member of raw type 'io.vertx.core.spi.tracing.VertxTracer'
in `src/main/java/io/vertx/core/eventbus/impl/OutboundDeliveryContext.java`
#### Snippet
```java
          tracingPolicy = TracingPolicy.PROPAGATE;
        }
        message.trace = tracer.sendRequest(ctx, SpanKind.RPC, tracingPolicy, message, message.send ? "send" : "publish", biConsumer, MessageTagExtractor.INSTANCE);
      } else {
        // Handle failure here
```

### UNCHECKED_WARNING
Unchecked call to 'sendResponse(Context, R, I, Throwable, TagExtractor)' as a member of raw type 'io.vertx.core.spi.tracing.VertxTracer'
in `src/main/java/io/vertx/core/eventbus/impl/OutboundDeliveryContext.java`
#### Snippet
```java
      } else {
        // Handle failure here
        tracer.sendResponse(ctx, null, message.trace, null, TagExtractor.empty());
      }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'receiveResponse(Context, R, O, Throwable, TagExtractor)' as a member of raw type 'io.vertx.core.spi.tracing.VertxTracer'
in `src/main/java/io/vertx/core/eventbus/impl/OutboundDeliveryContext.java`
#### Snippet
```java
            replyHandler.trace = message.trace;
          } else {
            tracer.receiveResponse(ctx, null, trace, failure, TagExtractor.empty());
          }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'messageDelivered(H, boolean)' as a member of raw type 'io.vertx.core.spi.metrics.EventBusMetrics'
in `src/main/java/io/vertx/core/eventbus/impl/HandlerRegistration.java`
#### Snippet
```java
      VertxTracer tracer = ctx.tracer();
      if (bus.metrics != null) {
        bus.metrics.messageDelivered(m, message.isLocal());
      }
      if (tracer != null && !src) {
```

### UNCHECKED_WARNING
Unchecked call to 'receiveRequest(Context, SpanKind, TracingPolicy, R, String, Iterable\>, TagExtractor)' as a member of raw type 'io.vertx.core.spi.tracing.VertxTracer'
in `src/main/java/io/vertx/core/eventbus/impl/HandlerRegistration.java`
#### Snippet
```java
      }
      if (tracer != null && !src) {
        message.trace = tracer.receiveRequest(ctx, SpanKind.RPC, TracingPolicy.PROPAGATE, message, message.isSend() ? "send" : "publish", message.headers(), MessageTagExtractor.INSTANCE);
        HandlerRegistration.this.dispatch(message, ctx, handler);
        Object trace = message.trace;
```

### UNCHECKED_WARNING
Unchecked call to 'sendResponse(Context, R, I, Throwable, TagExtractor)' as a member of raw type 'io.vertx.core.spi.tracing.VertxTracer'
in `src/main/java/io/vertx/core/eventbus/impl/HandlerRegistration.java`
#### Snippet
```java
        Object trace = message.trace;
        if (message.replyAddress == null && trace != null) {
          tracer.sendResponse(this.context, null, trace, null, TagExtractor.empty());
        }
      } else {
```

### UNCHECKED_WARNING
Unchecked call to 'handlerUnregistered(H)' as a member of raw type 'io.vertx.core.spi.metrics.EventBusMetrics'
in `src/main/java/io/vertx/core/eventbus/impl/HandlerRegistration.java`
#### Snippet
```java
        registered = null;
        if (bus.metrics != null) {
          bus.metrics.handlerUnregistered(metric);
        }
      } else {
```

### UNCHECKED_WARNING
Unchecked call to 'scheduleMessage(H, boolean)' as a member of raw type 'io.vertx.core.spi.metrics.EventBusMetrics'
in `src/main/java/io/vertx/core/eventbus/impl/HandlerRegistration.java`
#### Snippet
```java
  void receive(MessageImpl msg) {
    if (bus.metrics != null) {
      bus.metrics.scheduleMessage(metric, msg.isLocal());
    }
    context.executor().execute(() -> {
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.eventbus.impl.MessageImpl' to 'io.vertx.core.eventbus.Message'
in `src/main/java/io/vertx/core/eventbus/impl/HandlerRegistration.java`
#### Snippet
```java
      // Need to check handler is still there - the handler might have been removed after the message were sent but
      // before it was received
      if (!doReceive(msg)) {
        discard(msg);
      }
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.eventbus.impl.MessageImpl' to 'io.vertx.core.eventbus.Message'
in `src/main/java/io/vertx/core/eventbus/impl/HandlerRegistration.java`
#### Snippet
```java
      // before it was received
      if (!doReceive(msg)) {
        discard(msg);
      }
    });
```

### UNCHECKED_WARNING
Unchecked call to 'discardMessage(H, boolean, Message)' as a member of raw type 'io.vertx.core.spi.metrics.EventBusMetrics'
in `src/main/java/io/vertx/core/eventbus/impl/HandlerRegistration.java`
#### Snippet
```java
  void discard(Message<T> msg) {
    if (bus.metrics != null) {
      bus.metrics.discardMessage(metric, ((MessageImpl)msg).isLocal(), msg);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.eventbus.MessageCodec' to 'io.vertx.core.eventbus.MessageCodec'
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ClusteredMessage.java`
#### Snippet
```java
      byte[] bytes = buffer.getBytes(pos, pos + length);
      String codecName = new String(bytes, CharsetUtil.UTF_8);
      messageCodec = codecManager.getCodec(codecName);
      if (messageCodec == null) {
        setFailure("No message codec registered with name " + codecName);
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.eventbus.MessageCodec' to 'io.vertx.core.eventbus.MessageCodec'
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ClusteredMessage.java`
#### Snippet
```java
      pos += length;
    } else {
      messageCodec = codecManager.systemCodecs()[systemCodecCode];
    }
    byte bsend = buffer.getByte(pos);
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.Handler\[\]' to 'io.vertx.core.Handler\[\]'
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java
  private static final AtomicReferenceFieldUpdater<EventBusImpl, Handler[]> INBOUND_INTERCEPTORS_UPDATER = AtomicReferenceFieldUpdater.newUpdater(EventBusImpl.class, Handler[].class, "inboundInterceptors");

  private volatile Handler<DeliveryContext>[] outboundInterceptors = new Handler[0];
  private volatile Handler<DeliveryContext>[] inboundInterceptors = new Handler[0];
  private final AtomicLong replySequence = new AtomicLong(0);
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.Handler\[\]' to 'io.vertx.core.Handler\[\]'
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java

  private volatile Handler<DeliveryContext>[] outboundInterceptors = new Handler[0];
  private volatile Handler<DeliveryContext>[] inboundInterceptors = new Handler[0];
  private final AtomicLong replySequence = new AtomicLong(0);
  protected final VertxInternal vertx;
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.Handler\[\]' to 'io.vertx.core.Handler\[\]'
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java
        return;
      }
      Handler<DeliveryContext>[] copy = new Handler[interceptors.length - 1];
      System.arraycopy(interceptors, 0, copy, 0, idx);
      System.arraycopy(interceptors, idx + 1, copy, idx, copy.length - idx);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/io/vertx/core/parsetools/impl/JsonParserImpl.java`
#### Snippet
```java
      handler.handler = buffer -> {
        tokenHandler = this::handleEvent;
        handleEvent(new JsonEventImpl(null, JsonEventType.VALUE, event.fieldName(), new JsonObject(handler.convert(Map.class))));
      };
      tokenHandler = handler;
```

### UNCHECKED_WARNING
Unchecked assignment: 'io.vertx.core.eventbus.MessageCodec' to 'io.vertx.core.eventbus.MessageCodec'
in `src/main/java/docoverride/eventbus/Examples.java`
#### Snippet
```java
  public void example11(EventBus eventBus, MessageCodec myCodec) {

    eventBus.registerDefaultCodec(MyPOJO.class, myCodec);

    eventBus.send("orders", new MyPOJO());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/cli/OptionConverter.java`
#### Snippet
```java
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.String> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add((String)item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add((String)item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.buffer.Buffer> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add(io.vertx.core.buffer.Buffer.buffer(BASE64_DECODER.decode((String)item)));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add((String)item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.buffer.Buffer> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add(io.vertx.core.buffer.Buffer.buffer(BASE64_DECODER.decode((String)item)));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add((String)item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add((String)item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add((String)item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/net/PemTrustOptionsConverter.java`
#### Snippet
```java
        case "certPaths":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                obj.addCertPath((String)item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/net/PemTrustOptionsConverter.java`
#### Snippet
```java
        case "certValues":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                obj.addCertValue(io.vertx.core.buffer.Buffer.buffer(BASE64_DECODER.decode((String)item)));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/net/SSLOptionsConverter.java`
#### Snippet
```java
        case "crlPaths":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                obj.addCrlPath((String)item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/net/SSLOptionsConverter.java`
#### Snippet
```java
        case "crlValues":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                obj.addCrlValue(io.vertx.core.buffer.Buffer.buffer(BASE64_DECODER.decode((String)item)));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/net/SSLOptionsConverter.java`
#### Snippet
```java
        case "enabledCipherSuites":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                obj.addEnabledCipherSuite((String)item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/net/SSLOptionsConverter.java`
#### Snippet
```java
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.String> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add((String)item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/net/NetClientOptionsConverter.java`
#### Snippet
```java
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add((String)item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/http/WebSocketConnectOptionsConverter.java`
#### Snippet
```java
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add((String)item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "crlPaths":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                obj.addCrlPath((String)item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "crlValues":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                obj.addCrlValue(io.vertx.core.buffer.Buffer.buffer(BASE64_DECODER.decode((String)item)));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "enabledCipherSuites":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                obj.addEnabledCipherSuite((String)item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.String> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add((String)item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.http.HttpVersion> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add(io.vertx.core.http.HttpVersion.valueOf((String)item));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add((String)item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.http.HttpVersion> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add(io.vertx.core.http.HttpVersion.valueOf((String)item));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/eventbus/EventBusOptionsConverter.java`
#### Snippet
```java
        case "crlPaths":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                obj.addCrlPath((String)item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/eventbus/EventBusOptionsConverter.java`
#### Snippet
```java
        case "crlValues":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                obj.addCrlValue(io.vertx.core.buffer.Buffer.buffer(BASE64_DECODER.decode((String)item)));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/eventbus/EventBusOptionsConverter.java`
#### Snippet
```java
        case "enabledCipherSuites":
          if (member.getValue() instanceof JsonArray) {
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                obj.addEnabledCipherSuite((String)item);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/generated/io/vertx/core/eventbus/EventBusOptionsConverter.java`
#### Snippet
```java
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.String> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add((String)item);
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `executeBlocking(Handler, Handler)`
in `src/main/java/io/vertx/core/Context.java`
#### Snippet
```java
   * Is the current context an event loop context?
   * <p>
   * NOTE! when running blocking code using {@link io.vertx.core.Vertx#executeBlocking(Handler, Handler)} from a
   * standard (not worker) verticle, the context will still an event loop context and this {@link this#isEventLoopContext()}
   * will return true.
```

### JavadocReference
Cannot resolve symbol `executeBlocking(Handler, Handler)`
in `src/main/java/io/vertx/core/Context.java`
#### Snippet
```java
   * Is the current context a worker context?
   * <p>
   * NOTE! when running blocking code using {@link io.vertx.core.Vertx#executeBlocking(Handler, Handler)} from a
   * standard (not worker) verticle, the context will still an event loop context and this {@link this#isWorkerContext()}
   * will return false.
```

### JavadocReference
Cannot resolve symbol `io.netty.handler.traffic.GlobalTrafficShapingHandler`
in `src/main/java/io/vertx/core/net/TrafficShapingOptions.java`
#### Snippet
```java

/**
 * Options describing how {@link io.netty.handler.traffic.GlobalTrafficShapingHandler} will handle traffic shaping.
 */
@Unstable
```

### JavadocReference
Cannot resolve symbol `AsyncMapping`
in `src/main/java/io/vertx/core/net/impl/SslChannelProvider.java`
#### Snippet
```java

  /**
   * Server name {@link AsyncMapping} for {@link SniHandler}, mapping happens on a Vert.x worker thread.
   *
   * @return the {@link AsyncMapping}
```

### JavadocReference
Cannot resolve symbol `SniHandler`
in `src/main/java/io/vertx/core/net/impl/SslChannelProvider.java`
#### Snippet
```java

  /**
   * Server name {@link AsyncMapping} for {@link SniHandler}, mapping happens on a Vert.x worker thread.
   *
   * @return the {@link AsyncMapping}
```

### JavadocReference
Cannot resolve symbol `AsyncMapping`
in `src/main/java/io/vertx/core/net/impl/SslChannelProvider.java`
#### Snippet
```java
   * Server name {@link AsyncMapping} for {@link SniHandler}, mapping happens on a Vert.x worker thread.
   *
   * @return the {@link AsyncMapping}
   */
  public AsyncMapping<? super String, ? extends SslContext> serverNameMapping() {
```

### JavadocReference
Cannot resolve symbol `SslHandler`
in `src/main/java/io/vertx/core/net/impl/SslChannelProvider.java`
#### Snippet
```java

/**
 * Provider for {@link SslHandler} and {@link SniHandler}.
 * <br/>
 * {@link SslContext} instances are cached and reused.
```

### JavadocReference
Cannot resolve symbol `SniHandler`
in `src/main/java/io/vertx/core/net/impl/SslChannelProvider.java`
#### Snippet
```java

/**
 * Provider for {@link SslHandler} and {@link SniHandler}.
 * <br/>
 * {@link SslContext} instances are cached and reused.
```

### JavadocReference
Cannot resolve symbol `SslContext`
in `src/main/java/io/vertx/core/net/impl/SslChannelProvider.java`
#### Snippet
```java
 * Provider for {@link SslHandler} and {@link SniHandler}.
 * <br/>
 * {@link SslContext} instances are cached and reused.
 */
public class SslChannelProvider {
```

### JavadocReference
Cannot resolve symbol `ChannelHandlerContext`
in `src/main/java/io/vertx/core/net/impl/NetSocketInternal.java`
#### Snippet
```java

  /**
   * Returns the {@link ChannelHandlerContext} of the last handler (named {@code handler}) of the pipeline that
   * delivers message to the application with the {@link #handler(Handler)} and {@link #messageHandler(Handler)}.
   * <p/>
```

### JavadocReference
Cannot resolve symbol `io.netty.channel.ChannelPipeline`
in `src/main/java/io/vertx/core/net/impl/NetSocketInternal.java`
#### Snippet
```java
   * delivers message to the application with the {@link #handler(Handler)} and {@link #messageHandler(Handler)}.
   * <p/>
   * Handlers should be inserted in the pipeline using {@link io.netty.channel.ChannelPipeline#addBefore(String, String, ChannelHandler)}:
   * <p/>
   * <code><pre>
```

### JavadocReference
Cannot resolve symbol `addBefore(String, String, ChannelHandler)`
in `src/main/java/io/vertx/core/net/impl/NetSocketInternal.java`
#### Snippet
```java
   * delivers message to the application with the {@link #handler(Handler)} and {@link #messageHandler(Handler)}.
   * <p/>
   * Handlers should be inserted in the pipeline using {@link io.netty.channel.ChannelPipeline#addBefore(String, String, ChannelHandler)}:
   * <p/>
   * <code><pre>
```

### JavadocReference
Cannot resolve symbol `ChannelHandler`
in `src/main/java/io/vertx/core/net/impl/NetSocketInternal.java`
#### Snippet
```java
   * delivers message to the application with the {@link #handler(Handler)} and {@link #messageHandler(Handler)}.
   * <p/>
   * Handlers should be inserted in the pipeline using {@link io.netty.channel.ChannelPipeline#addBefore(String, String, ChannelHandler)}:
   * <p/>
   * <code><pre>
```

### JavadocReference
Cannot resolve symbol `io.netty.buffer.ByteBuf`
in `src/main/java/io/vertx/core/net/impl/NetSocketInternal.java`
#### Snippet
```java
  /**
   * Set a {@code handler} on this socket to process the messages produced by this socket. The message can be
   * {@link io.netty.buffer.ByteBuf} or other messages produced by channel pipeline handlers.
   * <p/>
   * The {@code} handler should take care of releasing pooled / direct messages.
```

### JavadocReference
Cannot resolve symbol `SslContext`
in `src/main/java/io/vertx/core/net/impl/SslContextProvider.java`
#### Snippet
```java

/**
 * Provides Netty's {@link SslContext}.
 *
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
```

### JavadocReference
Cannot resolve symbol `SslContext`
in `src/main/java/io/vertx/core/spi/tls/SslContextFactory.java`
#### Snippet
```java

/**
 * A factory for a Netty {@link SslContext}, the factory is configured with the fluent setters until {@link #create()}
 * to obtain a properly configured {@link SslContext}.
 *
```

### JavadocReference
Cannot resolve symbol `SslContext`
in `src/main/java/io/vertx/core/spi/tls/SslContextFactory.java`
#### Snippet
```java
/**
 * A factory for a Netty {@link SslContext}, the factory is configured with the fluent setters until {@link #create()}
 * to obtain a properly configured {@link SslContext}.
 *
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
```

### JavadocReference
Cannot resolve symbol `SslContext`
in `src/main/java/io/vertx/core/spi/tls/SslContextFactory.java`
#### Snippet
```java

  /**
   * @return a configured {@link SslContext}
   */
  SslContext create() throws SSLException;
```

### JavadocReference
Cannot resolve symbol `SslContext`
in `src/main/java/io/vertx/core/spi/tls/DefaultSslContextFactory.java`
#### Snippet
```java

/**
 * The default implementation of {@link SslContextFactory} that creates and configures a Netty {@link SslContext} using a
 * {@link SslContextBuilder}.
 *
```

### JavadocReference
Cannot resolve symbol `SslContextBuilder`
in `src/main/java/io/vertx/core/spi/tls/DefaultSslContextFactory.java`
#### Snippet
```java
/**
 * The default implementation of {@link SslContextFactory} that creates and configures a Netty {@link SslContext} using a
 * {@link SslContextBuilder}.
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
```

### JavadocReference
Cannot resolve symbol `ChannelHandlerContext`
in `src/main/java/io/vertx/core/http/impl/HttpClientConnection.java`
#### Snippet
```java

  /**
   * @return the {@link ChannelHandlerContext} of the handler managing the connection
   */
  ChannelHandlerContext channelHandlerContext();
```

### JavadocReference
Cannot resolve symbol `WebSocketHandshakeException`
in `src/main/java/io/vertx/core/http/WebSocketConnectOptions.java`
#### Snippet
```java
  /**
   * Sets the amount of time after which if the WebSocket handshake does not happen within the timeout period an
   * {@link WebSocketHandshakeException} will be passed to the exception handler and the connection will be closed.
   *
   * @param timeout the amount of time in milliseconds.
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `src/main/java/io/vertx/core/http/impl/Http1xServerConnection.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link #requestInProgress} is the request currently receiving messages, the field is set when
 *   a {@link HttpRequest} message is received and unset when {@link LastHttpContent} is received. Intermediate
 *   {@link HttpContent} messages are processed by the request.</li>
 *   <li>{@link #responseInProgress} is the request for which the response is currently being sent. This field
```

### JavadocReference
Cannot resolve symbol `LastHttpContent`
in `src/main/java/io/vertx/core/http/impl/Http1xServerConnection.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link #requestInProgress} is the request currently receiving messages, the field is set when
 *   a {@link HttpRequest} message is received and unset when {@link LastHttpContent} is received. Intermediate
 *   {@link HttpContent} messages are processed by the request.</li>
 *   <li>{@link #responseInProgress} is the request for which the response is currently being sent. This field
```

### JavadocReference
Cannot resolve symbol `HttpContent`
in `src/main/java/io/vertx/core/http/impl/Http1xServerConnection.java`
#### Snippet
```java
 *   <li>{@link #requestInProgress} is the request currently receiving messages, the field is set when
 *   a {@link HttpRequest} message is received and unset when {@link LastHttpContent} is received. Intermediate
 *   {@link HttpContent} messages are processed by the request.</li>
 *   <li>{@link #responseInProgress} is the request for which the response is currently being sent. This field
 *   is set when it is {@code null} and the {@link #requestInProgress} field if set, or when there is a pipelined
```

### JavadocReference
Cannot resolve symbol `io.netty.handler.codec.http.HttpResponseEncoder`
in `src/main/java/io/vertx/core/http/impl/VertxHttpResponseEncoder.java`
#### Snippet
```java

/**
 * {@link io.netty.handler.codec.http.HttpResponseEncoder} which forces the usage of direct buffers for max performance.
 *
 * @author <a href="mailto:nmaurer@redhat.com">Norman Maurer</a>
```

### JavadocReference
Cannot resolve symbol `HttpHeaders`
in `src/main/java/io/vertx/core/http/impl/headers/HeadersMultiMap.java`
#### Snippet
```java

/**
 * A case-insensitive {@link MultiMap} implementation that extends Netty {@link HttpHeaders}
 * for convenience.
 *
```

### JavadocReference
Cannot resolve symbol `io.netty.buffer.ByteBufAllocator`
in `src/main/java/io/vertx/core/buffer/impl/PartialPooledByteBufAllocator.java`
#### Snippet
```java

/**
 * A {@link io.netty.buffer.ByteBufAllocator} which is partial pooled. Which means only direct {@link io.netty.buffer.ByteBuf}s are pooled. The rest
 * is unpooled.
 *
```

### JavadocReference
Cannot resolve symbol `io.netty.buffer.ByteBuf`
in `src/main/java/io/vertx/core/buffer/impl/PartialPooledByteBufAllocator.java`
#### Snippet
```java

/**
 * A {@link io.netty.buffer.ByteBufAllocator} which is partial pooled. Which means only direct {@link io.netty.buffer.ByteBuf}s are pooled. The rest
 * is unpooled.
 *
```

## RuleId[id=AssignmentUsedAsCondition]
### AssignmentUsedAsCondition
Assignment `sendCloseFrame = closeStatusCode == null` used as condition
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
    boolean sendCloseFrame;
    synchronized (conn) {
      if (sendCloseFrame = closeStatusCode == null) {
        closeStatusCode = statusCode;
        closeReason = reason;
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/io/vertx/core/spi/VertxMetricsFactory.java`
#### Snippet
```java
        }
      }
      BareCommand.configureFromSystemProperties(metricsOptions, METRICS_OPTIONS_PROP_PREFIX);;
      builder.options().setMetricsOptions(metricsOptions);
      if (options.getMetricsOptions().isEnabled()) {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/io/vertx/core/impl/TaskQueue.java`
#### Snippet
```java
      }
    }
  };

  /**
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/examples/DatagramExamples.java`
#### Snippet
```java
      .listen(1234, "0.0.0.0")
      .onComplete(asyncResult -> System.out.println("Send succeeded? " + asyncResult.succeeded()));
    ;
  }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `content` may produce `NullPointerException`
in `src/main/java/io/vertx/core/dns/impl/decoder/RecordDecoder.java`
#### Snippet
```java
            return val;
        } else {
            ByteBuf content = ((DnsRawRecord) record).content();
            return RecordDecoder.getName(content, content.readerIndex());
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/io/vertx/core/net/TrafficShapingOptions.java`
#### Snippet
```java
   */
  public TrafficShapingOptions setCheckIntervalForStatsTimeUnit(TimeUnit checkIntervalForStatsTimeUnit) {
    this.maxDelayToWaitTimeUnit = maxDelayToWaitTimeUnit;
    return this;
  }
```

### DataFlowIssue
Condition `sslSessionContext instanceof OpenSslServerSessionContext` is redundant and can be replaced with a null check
in `src/main/java/io/vertx/core/spi/tls/DefaultSslContextFactory.java`
#### Snippet
```java
    if (ctx instanceof OpenSslServerContext){
      SSLSessionContext sslSessionContext = ctx.sessionContext();
      if (sslSessionContext instanceof OpenSslServerSessionContext){
        ((OpenSslServerSessionContext)sslSessionContext).setSessionCacheEnabled(sslSessionCacheEnabled);
      }
```

### DataFlowIssue
Dereference of `pool.waiters.poll()` may produce `NullPointerException`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
            extra = new LeaseImpl[m];
            for (int i = 0;i < m;i++) {
              extra[i] = new LeaseImpl<>(slot, pool.waiters.poll().handler);
            }
            slot.usage += m;
```

### DataFlowIssue
Dereference of `pool.waiters.poll()` may produce `NullPointerException`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
          leases = new LeaseImpl[m];
          for (int i = 0;i < m;i++) {
            leases[i] = new LeaseImpl<>(slot, pool.waiters.poll().handler);
          }
        } else {
```

### DataFlowIssue
Condition `cause instanceof TooLongHttpLineException` is redundant and can be replaced with a null check
in `src/main/java/io/vertx/core/http/HttpServerRequest.java`
#### Snippet
```java
    Throwable cause = result.cause();
    HttpResponseStatus status = null;
    if (cause instanceof TooLongHttpLineException) {
      status = HttpResponseStatus.REQUEST_URI_TOO_LONG;
    } else if (cause instanceof TooLongHttpHeaderException) {
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `src/main/java/io/vertx/core/file/impl/FileSystemImpl.java`
#### Snippet
```java
              files = file.listFiles(fnFilter);
            }
            List<String> ret = new ArrayList<>(files.length);
            for (File f : files) {
              ret.add(f.getCanonicalPath());
```

### DataFlowIssue
Switch label `"OPTIONS"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
  private static HttpMethod _fromNetty(io.netty.handler.codec.http.HttpMethod sMethod) {
    switch (sMethod.name()) {
      case "OPTIONS":
        return OPTIONS;
      case "HEAD":
```

### DataFlowIssue
Switch label `"HEAD"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "OPTIONS":
        return OPTIONS;
      case "HEAD":
        return HEAD;
      case "PUT":
```

### DataFlowIssue
Switch label `"PUT"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "HEAD":
        return HEAD;
      case "PUT":
        return PUT;
      case "DELETE":
```

### DataFlowIssue
Switch label `"DELETE"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "PUT":
        return PUT;
      case "DELETE":
        return DELETE;
      case "TRACE":
```

### DataFlowIssue
Switch label `"TRACE"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "DELETE":
        return DELETE;
      case "TRACE":
        return TRACE;
      case "CONNECT":
```

### DataFlowIssue
Switch label `"CONNECT"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "TRACE":
        return TRACE;
      case "CONNECT":
        return CONNECT;
      case "PATCH":
```

### DataFlowIssue
Switch label `"PATCH"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "CONNECT":
        return CONNECT;
      case "PATCH":
        return PATCH;
      case "PROPFIND":
```

### DataFlowIssue
Switch label `"PROPFIND"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "PATCH":
        return PATCH;
      case "PROPFIND":
        return PROPFIND;
      case "PROPPATCH":
```

### DataFlowIssue
Switch label `"PROPPATCH"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "PROPFIND":
        return PROPFIND;
      case "PROPPATCH":
        return PROPPATCH;
      case "MKCOL":
```

### DataFlowIssue
Switch label `"MKCOL"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "PROPPATCH":
        return PROPPATCH;
      case "MKCOL":
        return MKCOL;
      case "COPY":
```

### DataFlowIssue
Switch label `"COPY"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "MKCOL":
        return MKCOL;
      case "COPY":
        return COPY;
      case "MOVE":
```

### DataFlowIssue
Switch label `"MOVE"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "COPY":
        return COPY;
      case "MOVE":
        return MOVE;
      case "LOCK":
```

### DataFlowIssue
Switch label `"LOCK"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "MOVE":
        return MOVE;
      case "LOCK":
        return LOCK;
      case "UNLOCK":
```

### DataFlowIssue
Switch label `"UNLOCK"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "LOCK":
        return LOCK;
      case "UNLOCK":
        return UNLOCK;
      case "MKCALENDAR":
```

### DataFlowIssue
Switch label `"MKCALENDAR"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "UNLOCK":
        return UNLOCK;
      case "MKCALENDAR":
        return MKCALENDAR;
      case "VERSION-CONTROL":
```

### DataFlowIssue
Switch label `"VERSION-CONTROL"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "MKCALENDAR":
        return MKCALENDAR;
      case "VERSION-CONTROL":
        return VERSION_CONTROL;
      case "REPORT":
```

### DataFlowIssue
Switch label `"REPORT"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "VERSION-CONTROL":
        return VERSION_CONTROL;
      case "REPORT":
        return REPORT;
      case "CHECKOUT":
```

### DataFlowIssue
Switch label `"CHECKOUT"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "REPORT":
        return REPORT;
      case "CHECKOUT":
        return CHECKOUT;
      case "CHECKIN":
```

### DataFlowIssue
Switch label `"CHECKIN"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "CHECKOUT":
        return CHECKOUT;
      case "CHECKIN":
        return CHECKIN;
      case "UNCHECKOUT":
```

### DataFlowIssue
Switch label `"UNCHECKOUT"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "CHECKIN":
        return CHECKIN;
      case "UNCHECKOUT":
        return UNCHECKOUT;
      case "MKWORKSPACE":
```

### DataFlowIssue
Switch label `"MKWORKSPACE"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "UNCHECKOUT":
        return UNCHECKOUT;
      case "MKWORKSPACE":
        return MKWORKSPACE;
      case "UPDATE":
```

### DataFlowIssue
Switch label `"UPDATE"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "MKWORKSPACE":
        return MKWORKSPACE;
      case "UPDATE":
        return UPDATE;
      case "LABEL":
```

### DataFlowIssue
Switch label `"LABEL"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "UPDATE":
        return UPDATE;
      case "LABEL":
        return LABEL;
      case "MERGE":
```

### DataFlowIssue
Switch label `"MERGE"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "LABEL":
        return LABEL;
      case "MERGE":
        return MERGE;
      case "BASELINE-CONTROL":
```

### DataFlowIssue
Switch label `"BASELINE-CONTROL"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "MERGE":
        return MERGE;
      case "BASELINE-CONTROL":
        return BASELINE_CONTROL;
      case "MKACTIVITY":
```

### DataFlowIssue
Switch label `"MKACTIVITY"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "BASELINE-CONTROL":
        return BASELINE_CONTROL;
      case "MKACTIVITY":
        return MKACTIVITY;
      case "ORDERPATCH":
```

### DataFlowIssue
Switch label `"ORDERPATCH"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "MKACTIVITY":
        return MKACTIVITY;
      case "ORDERPATCH":
        return ORDERPATCH;
      case "ACL":
```

### DataFlowIssue
Switch label `"ACL"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "ORDERPATCH":
        return ORDERPATCH;
      case "ACL":
        return ACL;
      case "SEARCH":
```

### DataFlowIssue
Switch label `"SEARCH"` is unreachable
in `src/main/java/io/vertx/core/http/HttpMethod.java`
#### Snippet
```java
      case "ACL":
        return ACL;
      case "SEARCH":
        return SEARCH;
      default:
```

### DataFlowIssue
Condition `value instanceof AsciiString` is redundant and can be replaced with a null check
in `src/main/java/io/vertx/core/http/impl/HttpUtils.java`
#### Snippet
```java

  public static void validateHeaderName(CharSequence value) {
    if (value instanceof AsciiString) {
      // no need to check for ASCII-ness anymore
      validateHeaderName((AsciiString) value);
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `src/main/java/io/vertx/core/http/impl/HttpUtils.java`
#### Snippet
```java
      validateHeaderName((AsciiString) value);
    } else {
      validateHeaderName0(value);
    }
  }
```

### DataFlowIssue
Condition `value instanceof AsciiString` is redundant and can be replaced with a null check
in `src/main/java/io/vertx/core/http/impl/headers/HeadersMultiMap.java`
#### Snippet
```java

  private static void writeAscii(ByteBuf buf, int offset, CharSequence value) {
    if (value instanceof AsciiString) {
      ByteBufUtil.copy((AsciiString) value, 0, buf, offset, value.length());
    } else {
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `src/main/java/io/vertx/core/http/impl/headers/HeadersMultiMap.java`
#### Snippet
```java
          @Override
          public String getKey() {
            return next.key.toString();
          }
          @Override
```

### DataFlowIssue
Argument `current.key` might be null
in `src/main/java/io/vertx/core/http/impl/headers/HeadersMultiMap.java`
#### Snippet
```java
    HeadersMultiMap.MapEntry current = head.after;
    while (current != head) {
      encoderHeader(current.key, current.value, buf);
      current = current.after;
    }
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `src/main/java/io/vertx/core/http/impl/headers/HeadersMultiMap.java`
#### Snippet
```java
        return (Map.Entry) this;
      } else {
        return new AbstractMap.SimpleEntry<>(key.toString(), value.toString());
      }
    }
```

### DataFlowIssue
Dereference of `directory.listFiles()` may produce `NullPointerException`
in `src/main/java/io/vertx/core/impl/verticle/PackageHelper.java`
#### Snippet
```java
  private static List<JavaFileObject> browseDir(String packageName, File directory) {
    List<JavaFileObject> result = new ArrayList<>();
    for (File childFile : directory.listFiles()) {
      if (childFile.isFile() && childFile.getName().endsWith(CLASS_FILE)) {
        String binaryName = packageName + "." + childFile.getName().replaceAll(CLASS_FILE + "$", "");
```

### DataFlowIssue
Condition `address instanceof DomainSocketAddress` is redundant and can be replaced with a null check
in `src/main/java/io/vertx/core/impl/transports/KQueueTransport.java`
#### Snippet
```java
  @Override
  public io.vertx.core.net.SocketAddress convert(SocketAddress address) {
    if (address instanceof DomainSocketAddress) {
      return new SocketAddressImpl(((DomainSocketAddress) address).path());
    }
```

### DataFlowIssue
Condition `address instanceof DomainSocketAddress` is redundant and can be replaced with a null check
in `src/main/java/io/vertx/core/impl/transports/EpollTransport.java`
#### Snippet
```java
  @Override
  public io.vertx.core.net.SocketAddress convert(SocketAddress address) {
    if (address instanceof DomainSocketAddress) {
      return new SocketAddressImpl(((DomainSocketAddress) address).path());
    }
```

### DataFlowIssue
Casting `value` to `Long` will produce `ClassCastException` for any non-null value
in `src/main/java/io/vertx/core/parsetools/impl/JsonEventImpl.java`
#### Snippet
```java
      Number number = (Number) value;
      if (value instanceof Integer) {
        return (Long)value;  // Avoids unnecessary unbox/box
      } else {
        return number.longValue();
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/io/vertx/core/cli/impl/DefaultParser.java`
#### Snippet
```java

    // Check argument and option validity
    cli.getOptions().stream().forEach(Option::ensureValidity);
    cli.getArguments().stream().forEach(Argument::ensureValidity);

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/io/vertx/core/cli/impl/DefaultParser.java`
#### Snippet
```java
    // Check argument and option validity
    cli.getOptions().stream().forEach(Option::ensureValidity);
    cli.getArguments().stream().forEach(Argument::ensureValidity);

    // Extract the list of required options.
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `src/main/java/io/vertx/core/http/impl/headers/Http2HeadersAdaptor.java`
#### Snippet
```java
      // combine the cookie values into 1 header entry.
      // https://tools.ietf.org/html/rfc7540#section-8.1.2.5
      String value = cookies.stream().collect(Collectors.joining("; "));
      headers.set(HttpHeaderNames.COOKIE, value);
    }
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/io/vertx/core/impl/launcher/ServiceCommandFactoryLoader.java`
#### Snippet
```java
  public Collection<CommandFactory<?>> lookup() {
    List<CommandFactory<?>> list = new ArrayList<>();
    commands.stream().forEach(list::add);
    return list;
  }
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
    }
    if (classpath != null && !classpath.isEmpty()) {
      args.add("--classpath=" + classpath.stream().collect(Collectors.joining(File.pathSeparator)));
    }
    if (vertxOptions != null) {
```

### SimplifyStreamApiCallChains
Can be replaced with 'Collectors.joining'
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
      return replaceFragment(
          this.startingUri,
          "/" + String.join("/", decodedTokens.stream().map(this::escape).collect(Collectors.toList()))
      );
  }
```

### SimplifyStreamApiCallChains
Can be replaced with 'Collectors.joining'
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
      return "";
    else
      return "/" + String.join("/", decodedTokens.stream().map(this::escape).collect(Collectors.toList()));
  }

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/main/java/io/vertx/core/cli/impl/DefaultParser.java`
#### Snippet
```java
    }
    if (str.startsWith("--")) {
      return str.substring(2, str.length());
    } else if (str.startsWith("-")) {
      return str.substring(1, str.length());
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/main/java/io/vertx/core/cli/impl/DefaultParser.java`
#### Snippet
```java
      return str.substring(2, str.length());
    } else if (str.startsWith("-")) {
      return str.substring(1, str.length());
    }

```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/main/java/io/vertx/core/http/impl/MimeMapping.java`
#### Snippet
```java
    int li = filename.lastIndexOf('.');
    if (li != -1 && li != filename.length() - 1) {
      String ext = filename.substring(li + 1, filename.length());
      return MimeMapping.getMimeTypeForExtension(ext);
    }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'cookieMap' is still used
in `src/main/java/io/vertx/core/http/HttpServerRequest.java`
#### Snippet
```java
   */
  @Deprecated
  default Map<String, Cookie> cookieMap() {
    return cookies()
      .stream()
```

### DeprecatedIsStillUsed
Deprecated member 'getDelegate' is still used
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java
   */
  @Deprecated
  public LogDelegate getDelegate() {
    return delegate;
  }
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java

  protected String generateReplyAddress() {
    return "__vertx.reply." + Long.toString(replySequence.incrementAndGet());
  }

```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    public byte[] getObjectIdentifier() throws VertxException {

      switch(type) {
      case DerParser.OBJECT_IDENTIFIER:
        return value;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/io/vertx/core/net/impl/KeyStoreHelper.java`
#### Snippet
```java
    List<X509Certificate> certs = loadPems(buffer, (delimiter, content) -> {
      try {
        switch (delimiter) {
          case "CERTIFICATE":
            return (Collection<X509Certificate>) certFactory.generateCertificates(new ByteArrayInputStream(content));
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
    List<HttpVersion> alpnVersions = options.getAlpnVersions();
    if (alpnVersions == null || alpnVersions.isEmpty()) {
      switch (options.getProtocolVersion()) {
        case HTTP_2:
          alpnVersions = Arrays.asList(HttpVersion.HTTP_2, HttpVersion.HTTP_1_1);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/io/vertx/core/http/impl/HttpUtils.java`
#### Snippet
```java
        break;
      case 1:
        switch (character) {
          case '\n':
            return 2;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/generated/io/vertx/core/metrics/MetricsOptionsConverter.java`
#### Snippet
```java
   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, MetricsOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "enabled":
          if (member.getValue() instanceof Boolean) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
    FileSystem fs = vertx.fileSystem();

    Future<FileProps> future = fs.props("/my_file.txt");

    future.onComplete((AsyncResult<FileProps> ar) -> {
      if (ar.succeeded()) {
        FileProps props = ar.result();
        System.out.println("File size = " + props.size());
      } else {
        System.out.println("Failure: " + ar.cause().getMessage());
      }
    });
```

### DuplicatedCode
Duplicated code
in `src/main/java/examples/EventBusExamples.java`
#### Snippet
```java
    Vertx
      .clusteredVertx(options)
      .onComplete(res -> {
        if (res.succeeded()) {
          Vertx vertx = res.result();
          EventBus eventBus = vertx.eventBus();
          System.out.println("We now have a clustered event bus: " + eventBus);
        } else {
          System.out.println("Failed: " + res.cause());
        }
      });
```

### DuplicatedCode
Duplicated code
in `src/main/java/examples/HTTPExamples.java`
#### Snippet
```java
      .onComplete(ar1 -> {
        if (ar1.succeeded()) {
          HttpClientRequest request = ar1.result();
          request
            .send()
            .onComplete(ar2 -> {
              if (ar2.succeeded()) {
                HttpClientResponse response = ar2.result();
                System.out.println("Received response with status code " + response.statusCode());
              }
            });
        }
      });
```

### DuplicatedCode
Duplicated code
in `src/main/java/examples/HTTPExamples.java`
#### Snippet
```java
    client
      .request(HttpMethod.GET, "some-uri")
      .onComplete(ar1 -> {
        if (ar1.succeeded()) {

          HttpClientRequest request = ar1.result();
          request.setFollowRedirects(true);
          request
            .send()
            .onComplete(ar2 -> {
              if (ar2.succeeded()) {

                HttpClientResponse response = ar2.result();
                System.out.println("Received response with status code " + response.statusCode());
              }
            });
        }
      });
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/cli/UsageMessageFormatter.java`
#### Snippet
```java
      if (command.isHidden()) {
        continue;
      }

      StringBuilder buf = new StringBuilder(prefixList.get(x++).toString());

      if (buf.length() < max) {
        buf.append(createPadding(max - buf.length()));
      }

      buf.append(dpad);

      int nextLineTabStop = max + descPad;
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/cli/impl/DefaultCommandLine.java`
#### Snippet
```java
    Objects.requireNonNull(argument);
    if (value == null) {
      value = argument.getDefaultValue();
    }

    if (value == null) {
      return null;
    }

    try {
      if (argument.getConverter() != null) {
        return Converters.create(value, argument.getConverter());
      } else {
        return Converters.create(argument.getType(), value);
      }
    } catch (Exception e) {
      throw new InvalidValueException(argument, value, e);
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/http/HttpClientOptions.java`
#### Snippet
```java
    verifyHost = DEFAULT_VERIFY_HOST;
    maxPoolSize = DEFAULT_MAX_POOL_SIZE;
    keepAlive = DEFAULT_KEEP_ALIVE;
    keepAliveTimeout = DEFAULT_KEEP_ALIVE_TIMEOUT;
    pipelining = DEFAULT_PIPELINING;
    pipeliningLimit = DEFAULT_PIPELINING_LIMIT;
    http2MultiplexingLimit = DEFAULT_HTTP2_MULTIPLEXING_LIMIT;
    http2MaxPoolSize = DEFAULT_HTTP2_MAX_POOL_SIZE;
    http2ConnectionWindowSize = DEFAULT_HTTP2_CONNECTION_WINDOW_SIZE;
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/http/HttpClientOptions.java`
#### Snippet
```java
    alpnVersions = new ArrayList<>(DEFAULT_ALPN_VERSIONS);
    http2ClearTextUpgrade = DEFAULT_HTTP2_CLEAR_TEXT_UPGRADE;
    http2ClearTextUpgradeWithPreflightRequest = DEFAULT_HTTP2_CLEAR_TEXT_UPGRADE_WITH_PREFLIGHT_REQUEST;
    sendUnmaskedFrames = DEFAULT_SEND_UNMASKED_FRAMES;
    maxRedirects = DEFAULT_MAX_REDIRECTS;
    forceSni = DEFAULT_FORCE_SNI;
    decoderInitialBufferSize = DEFAULT_DECODER_INITIAL_BUFFER_SIZE;
    tryUsePerFrameWebSocketCompression = DEFAULT_TRY_USE_PER_FRAME_WEBSOCKET_COMPRESSION;
    tryUsePerMessageWebSocketCompression = DEFAULT_TRY_USE_PER_MESSAGE_WEBSOCKET_COMPRESSION;
    webSocketCompressionLevel = DEFAULT_WEBSOCKET_COMPRESSION_LEVEL;
    webSocketAllowClientNoContext = DEFAULT_WEBSOCKET_ALLOW_CLIENT_NO_CONTEXT;
    webSocketRequestServerNoContext = DEFAULT_WEBSOCKET_REQUEST_SERVER_NO_CONTEXT;
    webSocketClosingTimeout = DEFAULT_WEBSOCKET_CLOSING_TIMEOUT;
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/http/impl/Http1xServerResponse.java`
#### Snippet
```java
      RandomAccessFile raf;
      try {
        raf = new RandomAccessFile(file, "r");
      } catch (Exception e) {
        return ctx.failedFuture(e);
      }
      long actualLength = Math.min(length, file.length() - offset);
      long actualOffset = Math.min(offset, file.length());
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/http/impl/Http1xServerResponse.java`
#### Snippet
```java
    Handler<Void> handler;
    synchronized (conn) {
      boolean skip = this.writable && !writable;
      this.writable = writable;
      handler = drainHandler;
      if (handler == null || skip) {
        return;
      }
    }
    context.dispatch(null, handler);
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/http/impl/HttpChannelConnector.java`
#### Snippet
```java
    int idleTimeout = options.getIdleTimeout();
    int readIdleTimeout = options.getReadIdleTimeout();
    int writeIdleTimeout = options.getWriteIdleTimeout();
    if (idleTimeout > 0 || readIdleTimeout > 0 || writeIdleTimeout > 0) {
      pipeline.addLast("idle", new IdleStateHandler(readIdleTimeout, writeIdleTimeout, idleTimeout, options.getIdleTimeoutUnit()));
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/http/impl/HttpServerWorker.java`
#### Snippet
```java
      IdleStateHandler idle;
      io.netty.util.concurrent.Promise<Channel> p = ch.eventLoop().newPromise();
      ch.pipeline().addLast(new HAProxyMessageDecoder());
      if (options.getProxyProtocolTimeout() > 0) {
        ch.pipeline().addLast("idle", idle = new IdleStateHandler(0, 0, options.getProxyProtocolTimeout(), options.getProxyProtocolTimeoutUnit()));
      } else {
        idle = null;
      }
      ch.pipeline().addLast(new HAProxyMessageCompletionHandler(p));
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/impl/ContextInternal.java`
#### Snippet
```java
    if (p instanceof PromiseInternal) {
      PromiseInternal<T> promise = (PromiseInternal<T>) p;
      if (promise.context() != null) {
        return promise;
      }
    }
    PromiseInternal<T> promise = promise();
    promise.future().onComplete(p);
    return promise;
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
    Object val = list.get(pos);

    if (val == null) {
      return null;
    }

    if (val instanceof Instant) {
      return ISO_INSTANT.format((Instant) val);
    } else if (val instanceof byte[]) {
      return BASE64_ENCODER.encodeToString((byte[]) val);
    } else if (val instanceof Buffer) {
      return BASE64_ENCODER.encodeToString(((Buffer) val).getBytes());
    } else if (val instanceof Enum) {
      return ((Enum) val).name();
    } else {
      return val.toString();
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
    if (val instanceof Instant) {
      return ISO_INSTANT.format((Instant) val);
    } else if (val instanceof byte[]) {
      return BASE64_ENCODER.encodeToString((byte[]) val);
    } else if (val instanceof Buffer) {
      return BASE64_ENCODER.encodeToString(((Buffer) val).getBytes());
    } else if (val instanceof Enum) {
      return ((Enum) val).name();
    } else {
      return val.toString();
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
    Object val = list.get(pos);
    // no-op
    if (val == null) {
      return null;
    }
    // no-op if value is already an byte[]
    if (val instanceof byte[]) {
      return (byte[]) val;
    }
    // unwrap if value is already a Buffer
    if (val instanceof Buffer) {
      return ((Buffer) val).getBytes();
    }
    // assume that the value is in String format as per RFC
    String encoded = (String) val;
    // parse to proper type
    return BASE64_DECODER.decode(encoded);
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
    Object val = list.get(pos);
    // no-op
    if (val == null) {
      return null;
    }
    // no-op if value is already an Buffer
    if (val instanceof Buffer) {
      return (Buffer) val;
    }
    // wrap if value is already a byte[]
    if (val instanceof byte[]) {
      return Buffer.buffer((byte[]) val);
    }
    // assume that the value is in String format as per RFC
    String encoded = (String) val;
    // parse to proper type
    return Buffer.buffer(BASE64_DECODER.decode(encoded));
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
    Object val = list.get(pos);
    // no-op
    if (val == null) {
      return null;
    }
    // no-op if value is already an Instant
    if (val instanceof Instant) {
      return (Instant) val;
    }
    // assume that the value is in String format as per RFC
    String encoded = (String) val;
    // parse to proper type
    return Instant.from(ISO_INSTANT.parse(encoded));
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
    obj.put(k1, v1);
    obj.put(k2, v2);
    obj.put(k3, v3);
    obj.put(k4, v4);
    obj.put(k5, v5);
    obj.put(k6, v6);

    return obj;
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
    obj.put(k1, v1);
    obj.put(k2, v2);
    obj.put(k3, v3);
    obj.put(k4, v4);
    obj.put(k5, v5);
    obj.put(k6, v6);
    obj.put(k7, v7);

    return obj;
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
    obj.put(k1, v1);
    obj.put(k2, v2);
    obj.put(k3, v3);
    obj.put(k4, v4);
    obj.put(k5, v5);
    obj.put(k6, v6);
    obj.put(k7, v7);
    obj.put(k8, v8);

    return obj;
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
    obj.put(k1, v1);
    obj.put(k2, v2);
    obj.put(k3, v3);
    obj.put(k4, v4);
    obj.put(k5, v5);
    obj.put(k6, v6);
    obj.put(k7, v7);
    obj.put(k8, v8);
    obj.put(k9, v9);
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/net/impl/ConnectionBase.java`
#### Snippet
```java
      long bytes = remainingBytesWritten;
      bytes += numberOfBytes;
      long val = bytes & METRICS_REPORTED_BYTES_HIGH_MASK;
      if (val > 0) {
        bytes &= METRICS_REPORTED_BYTES_LOW_MASK;
        metrics.bytesWritten(metric, remoteAddress(), val);
      }
      remainingBytesWritten = bytes;
```

### DuplicatedCode
Duplicated code
in `src/main/java/io/vertx/core/net/impl/NetClientImpl.java`
#### Snippet
```java
    return fut.transform(ar -> {
      if (ar.failed()) {
        return ctx.failedFuture(ar.cause());
      } else if (ar.succeeded() && ar.result().error() != null) {
        return ctx.failedFuture(ar.result().error());
      } else {
        return ctx.succeededFuture();
      }
    });
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
        try {
          lastValue = iterator.getArrayElement(lastValue, Integer.parseInt(lastKey));
        } catch (NumberFormatException e) { }
      }
      if (!iterator.isNull(lastValue))
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/dns/impl/DnsClientImpl.java`
#### Snippet
```java
    channel.pipeline().addLast(new SimpleChannelInboundHandler<DnsResponse>() {
      @Override
      protected void channelRead0(ChannelHandlerContext ctx, DnsResponse msg) throws Exception {
        DefaultDnsQuestion question = msg.recordAt(DnsSection.QUESTION);
        Query query = inProgressMap.get(dnsMessageId(msg.id(), question.name()));
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/net/impl/ChannelProvider.java`
#### Snippet
```java
        bootstrap.handler(new ChannelInitializer<Channel>() {
          @Override
          protected void initChannel(Channel ch) throws Exception {
            ChannelPipeline pipeline = ch.pipeline();
            pipeline.addFirst("proxy", proxy);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/net/impl/ChannelProvider.java`
#### Snippet
```java
    bootstrap.handler(new ChannelInitializer<Channel>() {
      @Override
      protected void initChannel(Channel ch) {
        initSSL(handler, peerAddress, serverName, ssl, useAlpn, ch, channelHandler);
      }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/net/impl/SslContextProvider.java`
#### Snippet
```java
      return new VertxSslContext(context) {
        @Override
        protected void initEngine(SSLEngine engine) {
          configureEngine(engine, enabledProtocols, serverName, false);
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/net/impl/SslContextProvider.java`
#### Snippet
```java
      return new VertxSslContext(context) {
        @Override
        protected void initEngine(SSLEngine engine) {
          configureEngine(engine, enabledProtocols, serverName, true);
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/http/impl/HttpChunkContentCompressor.java`
#### Snippet
```java

  @Override
  protected Result beginEncode(HttpResponse httpResponse, String acceptEncoding) throws Exception {
    Result result = super.beginEncode(httpResponse, acceptEncoding);
    if (result == null && httpResponse.headers().contains(HttpHeaderNames.CONTENT_ENCODING, "identity", true)) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/http/impl/VertxHttpResponseEncoder.java`
#### Snippet
```java

  @Override
  protected boolean isContentAlwaysEmpty(HttpResponse msg) {
    // In HttpServerCodec this is tracked via a FIFO queue of HttpMethod
    // here we track it in the assembled response as we don't use HttpServerCodec
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/http/impl/VertxHttpResponseEncoder.java`
#### Snippet
```java

  @Override
  protected void encodeHeaders(HttpHeaders headers, ByteBuf buf) {
    if (headers instanceof HeadersMultiMap) {
      HeadersMultiMap vertxHeaders = (HeadersMultiMap) headers;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java
        webSocketURL, V00, subprotocol, customHeaders, maxFramePayloadLength, -1) {
        @Override
        protected FullHttpRequest newHandshakeRequest() {
          FullHttpRequest request = super.newHandshakeRequest();
          if (!allowOriginHeader) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java

        @Override
        protected FullHttpRequest newHandshakeRequest() {
          FullHttpRequest request = super.newHandshakeRequest();
          if (!allowOriginHeader) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java

        @Override
        protected FullHttpRequest newHandshakeRequest() {
          FullHttpRequest request = super.newHandshakeRequest();
          if (!allowOriginHeader) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java
        maxFramePayloadLength, performMasking, false, -1) {
        @Override
        protected WebSocketFrameDecoder newWebsocketDecoder() {
          return new WebSocket07FrameDecoder(config);
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java
        maxFramePayloadLength, performMasking, false, -1) {
        @Override
        protected WebSocketFrameDecoder newWebsocketDecoder() {
          return new WebSocket08FrameDecoder(config);
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java
        maxFramePayloadLength, performMasking, false, -1) {
        @Override
        protected WebSocketFrameDecoder newWebsocketDecoder() {
          return new WebSocket13FrameDecoder(config);
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java

        @Override
        protected FullHttpRequest newHandshakeRequest() {
          FullHttpRequest request = super.newHandshakeRequest();
          if (!allowOriginHeader) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/impl/launcher/commands/FileSelector.java`
#### Snippet
```java
  }

  protected static boolean matchPath(String pattern, String str, String separator, boolean isCaseSensitive) {
    return matchPathPattern(pattern, str, separator, isCaseSensitive);
  }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/impl/resolver/DnsResolverProvider.java`
#### Snippet
```java
    this.resolverGroup = new DnsAddressResolverGroup(builder) {
      @Override
      protected io.netty.resolver.AddressResolver<InetSocketAddress> newAddressResolver(EventLoop eventLoop, NameResolver<InetAddress> resolver) throws Exception {
        io.netty.resolver.AddressResolver<InetSocketAddress> addressResolver;
        if (options.isRoundRobinInetAddress()) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/buffer/impl/VertxByteBufAllocator.java`
#### Snippet
```java
  private static final VertxByteBufAllocator IMPL = new VertxByteBufAllocator() {
    @Override
    protected ByteBuf newHeapBuffer(int initialCapacity, int maxCapacity) {
      return new VertxHeapByteBuf(this, initialCapacity, maxCapacity);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/buffer/impl/VertxByteBufAllocator.java`
#### Snippet
```java
  private static final VertxByteBufAllocator UNSAFE_IMPL = new VertxByteBufAllocator() {
    @Override
    protected ByteBuf newHeapBuffer(int initialCapacity, int maxCapacity) {
      return new VertxUnsafeHeapByteBuf(this, initialCapacity, maxCapacity);
    }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/io/vertx/core/impl/launcher/VertxCommandLauncher.java`
#### Snippet
```java
    buildWrapped(builder, 0, "Run '" + getCommandLinePrefix() + " COMMAND --help' for more information on a command.");

    getPrintStream().println(builder.toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/io/vertx/core/impl/launcher/VertxCommandLauncher.java`
#### Snippet
```java
    buildWrapped(builder, 0, "The command '" + command + "' is not a valid command." + getNewLine()
        + "See '" + getCommandLinePrefix() + " --help'");
    getPrintStream().println(builder.toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/io/vertx/core/impl/launcher/VertxCommandLauncher.java`
#### Snippet
```java
    StringBuilder builder = new StringBuilder();
    cli.usage(builder, getCommandLinePrefix());
    getPrintStream().println(builder.toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
    }
    // Compute the application id. We append "-redeploy" to ease the identification in the process list.
    vertxApplicationBackgroundId = UUID.randomUUID().toString() + "-redeploy";
    watcher = new Watcher(getCwd(), redeploy,
        this::startAsBackgroundApplication,  // On deploy
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/io/vertx/core/logging/VertxLoggerFormatter.java`
#### Snippet
```java
        record.getThrown().printStackTrace(pw);
        pw.close();
        sb.append(sw.toString());
      } catch (Exception ex) {
        ex.printStackTrace();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ClusteredEventBus.java`
#### Snippet
```java
  protected String generateReplyAddress() {
    // The address is a cryptographically secure id that can't be guessed
    return "__vertx.reply." + UUID.randomUUID().toString();
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/examples/cli/CLIExamples.java`
#### Snippet
```java
      StringBuilder builder = new StringBuilder();
      cli.usage(builder);
      stream.print(builder.toString());
    }
  }
```

## RuleId[id=RedundantEscapeInRegexReplacement]
### RedundantEscapeInRegexReplacement
Redundant escape of '.'
in `src/main/java/io/vertx/core/net/impl/ProxyFilter.java`
#### Snippet
```java
      if (nonProxyHost.contains("*")) {
        String pattern = nonProxyHost
          .replaceAll("\\.", "\\.")
          .replaceAll("\\*", ".*");
        return Pattern.compile(pattern);
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `BufferingHandler` may be 'static'
in `src/main/java/io/vertx/core/parsetools/impl/JsonParserImpl.java`
#### Snippet
```java
  }

  private class BufferingHandler implements Handler<JsonEventImpl> {

    Handler<Void> handler;
```

### InnerClassMayBeStatic
Inner class `MyVerticle` may be 'static'
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
  }

  class MyVerticle extends AbstractVerticle {

    @Override
```

### InnerClassMayBeStatic
Inner class `BlockingAPI` may be 'static'
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
  BlockingAPI someAPI = new BlockingAPI();

  class BlockingAPI {
    String blockingMethod(String str) {
      return str;
```

### InnerClassMayBeStatic
Inner class `Person` may be 'static'
in `src/main/java/examples/cli/TypedCLIExamples.java`
#### Snippet
```java
  }

  private class Person {

  }
```

### InnerClassMayBeStatic
Inner class `MyPOJO` may be 'static'
in `src/main/java/docoverride/eventbus/Examples.java`
#### Snippet
```java
  }

  class MyPOJO {

  }
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `src/main/java/io/vertx/core/impl/ConcurrentHashSet.java`
#### Snippet
```java
  @Override
  public boolean contains(Object o) {
    return map.containsKey(o);
  }

```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/io/vertx/core/cli/impl/DefaultParser.java`
#### Snippet
```java
      // long or partial long options (--L, -L, --L=V, -L=V, --l, --l=V)
      return true;
    } else if (getLongPrefix(token) != null && !token.startsWith("--")) {
      // -LV
      return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/io/vertx/core/http/StreamPriority.java`
#### Snippet
```java
    if (exclusive != other.exclusive) return false;
    if (dependency != other.dependency) return false;
    if (weight != other.weight) return false;

    return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/io/vertx/core/http/Http2Settings.java`
#### Snippet
```java
    if (initialWindowSize != that.initialWindowSize) return false;
    if (maxFrameSize != that.maxFrameSize) return false;
    if (maxHeaderListSize != that.maxHeaderListSize) return false;
    return true;
  }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/io/vertx/core/http/impl/Http2ServerConnection.java`
#### Snippet
```java
        return true;
      }
      if (uri.getRawUserInfo() != null) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/io/vertx/core/impl/launcher/commands/FileSelector.java`
#### Snippet
```java
    if (!isCaseSensitive) {
      // NOTE: Try both upper case and lower case as done by String.equalsIgnoreCase()
      if (Character.toUpperCase(c1) == Character.toUpperCase(c2)
          || Character.toLowerCase(c1) == Character.toLowerCase(c2)) {
        return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java
  private <T> void sendLocally(OutboundDeliveryContext<T> sendContext) {
    ReplyException failure = deliverMessageLocally(sendContext.message);
    if (failure != null) {
      sendContext.written(failure);
    } else {
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/io/vertx/core/impl/launcher/commands/VersionCommand.java`
#### Snippet
```java
        throw new IllegalStateException("Cannot find vertx-version.txt on classpath");
      }
      try (Scanner scanner = new Scanner(is, "UTF-8").useDelimiter("\\A")) {
        return version = scanner.hasNext() ? scanner.next().trim() : "";
      }
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/io/vertx/core/impl/launcher/commands/BareCommand.java`
#### Snippet
```java
    JsonObject conf;
    if (jsonFileOrString != null) {
      try (Scanner scanner = new Scanner(new File(jsonFileOrString), "UTF-8").useDelimiter("\\A")) {
        String sconf = scanner.next();
        try {
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'FileResolver' used without 'try'-with-resources statement
in `src/main/java/io/vertx/core/spi/FileResolverFactory.java`
#### Snippet
```java
  @Override
  default void init(VertxBuilder builder) {
    if (builder.fileResolver() == null) {
      FileResolver fileResolver = resolver(builder.options());
      builder.fileResolver(fileResolver);
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'msg instanceof DefaultHttpContent' covered by subsequent condition 'msg instanceof HttpContent'
in `src/main/java/io/vertx/core/http/impl/Http1xServerConnection.java`
#### Snippet
```java
  private void handleOther(Object msg) {
    // concrete type check first
    if (msg instanceof DefaultHttpContent || msg instanceof HttpContent) {
      onContent(msg);
    } else if (msg instanceof WebSocketFrame) {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/io/vertx/core/net/impl/NetSocketImpl.java`
#### Snippet
```java
  @Override
  public Future<Void> upgradeToSsl() {
    return upgradeToSsl((String) null);
  }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/io/vertx/core/net/impl/NetClientImpl.java`
#### Snippet
```java
  @Override
  public Future<NetSocket> connect(int port, String host) {
    return connect(port, host, (String) null);
  }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/io/vertx/core/net/impl/NetClientImpl.java`
#### Snippet
```java
  @Override
  public Future<NetSocket> connect(SocketAddress remoteAddress) {
    return connect(remoteAddress, (String) null);
  }

```

### RedundantCast
Casting `readBufferSize` to `long` is redundant
in `src/main/java/io/vertx/core/file/impl/AsyncFileImpl.java`
#### Snippet
```java
  private synchronized void doRead(ByteBuffer bb) {
    Buffer buff = Buffer.buffer(readBufferSize);
    int readSize = (int) Math.min((long)readBufferSize, readLength);
    bb.limit(readSize);
    Promise<Buffer> promise = context.promise();
```

### RedundantCast
Casting `null` to `MultiMap` is redundant
in `src/main/java/io/vertx/core/http/HttpServerResponse.java`
#### Snippet
```java
   */
  default Future<HttpServerResponse> push(HttpMethod method, String host, String path) {
    return push(method, host, path, (MultiMap) null);
  }

```

### RedundantCast
Casting `maxHeaderListSize` to `long` is redundant
in `src/main/java/io/vertx/core/http/Http2Settings.java`
#### Snippet
```java
        return (long)maxFrameSize;
      case 6:
        return (long)maxHeaderListSize;
      default:
        return extraSettings != null ? extraSettings.get(id) : null;
```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
  @Override
  public Future<Void> close() {
    return close((short) 1000, (String) null);
  }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
  @Override
  public Future<Void> close(short statusCode) {
    return close(statusCode, (String) null);
  }

```

### RedundantCast
Casting `this` to `S` is redundant
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
      checkClosed();
      this.pongHandler = handler;
      return (S) this;
    }
  }
```

### RedundantCast
Casting `buffer.getByte(...)` to `int` is redundant
in `src/main/java/io/vertx/core/eventbus/impl/codecs/ReplyExceptionMessageCodec.java`
#### Snippet
```java
  @Override
  public ReplyException decodeFromWire(int pos, Buffer buffer) {
    int i = (int) buffer.getByte(pos);
    ReplyFailure rf = ReplyFailure.fromInt(i);
    pos++;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/io/vertx/core/Context.java`
#### Snippet
```java
   * <p>
   * NOTE! when running blocking code using {@link io.vertx.core.Vertx#executeBlocking(Handler, Handler)} from a
   * standard (not worker) verticle, the context will still an event loop context and this {@link this#isEventLoopContext()}
   * will return true.
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/io/vertx/core/Context.java`
#### Snippet
```java
   * <p>
   * NOTE! when running blocking code using {@link io.vertx.core.Vertx#executeBlocking(Handler, Handler)} from a
   * standard (not worker) verticle, the context will still an event loop context and this {@link this#isWorkerContext()}
   * will return false.
   *
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/io/vertx/core/AbstractVerticle.java`
#### Snippet
```java
   * If your verticle does a simple, synchronous start-up then override this method and put your start-up
   * code in here.
   * @throws Exception
   */
  public void start() throws Exception {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/io/vertx/core/AbstractVerticle.java`
#### Snippet
```java
   * and call the stopFuture some time later when clean-up is complete.
   * @param stopPromise  a promise which should be called when verticle clean-up is complete.
   * @throws Exception
   */
  @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/io/vertx/core/AbstractVerticle.java`
#### Snippet
```java
   * and call the startFuture some time later when start up is complete.
   * @param startPromise  a promise which should be called when verticle start-up is complete.
   * @throws Exception
   */
  @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/io/vertx/core/AbstractVerticle.java`
#### Snippet
```java
   * If your verticle has simple synchronous clean-up tasks to complete then override this method and put your clean-up
   * code in here.
   * @throws Exception
   */
  public void stop() throws Exception {
```

### JavadocDeclaration
`@param warningExceptionTime` tag description is missing
in `src/main/java/io/vertx/core/VertxOptions.java`
#### Snippet
```java
   * The default value of {@link VertxOptions#setWarningExceptionTimeUnit warningExceptionTimeUnit} is {@link TimeUnit#NANOSECONDS}
   *
   * @param warningExceptionTime
   * @return a reference to this, so the API can be used fluently
   */
```

### JavadocDeclaration
`@param record` tag description is missing
in `src/main/java/io/vertx/core/dns/impl/decoder/RecordDecoder.java`
#### Snippet
```java
     * Decodes a resource record and returns the result.
     *
     * @param record
     * @return the decoded resource record
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/io/vertx/core/net/TCPSSLOptions.java`
#### Snippet
```java
   * @param crlPath  the path
   * @return a reference to this, so the API can be used fluently
   * @throws NullPointerException
   */
  public TCPSSLOptions addCrlPath(String crlPath) throws NullPointerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/io/vertx/core/net/TCPSSLOptions.java`
#### Snippet
```java
   * @param crlValue  the value
   * @return a reference to this, so the API can be used fluently
   * @throws NullPointerException
   */
  public TCPSSLOptions addCrlValue(Buffer crlValue) throws NullPointerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/io/vertx/core/net/SSLOptions.java`
#### Snippet
```java
   * @param crlValue  the value
   * @return a reference to this, so the API can be used fluently
   * @throws NullPointerException
   */
  public SSLOptions addCrlValue(Buffer crlValue) throws NullPointerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/io/vertx/core/net/SSLOptions.java`
#### Snippet
```java
   * @param crlPath  the path
   * @return a reference to this, so the API can be used fluently
   * @throws NullPointerException
   */
  public SSLOptions addCrlPath(String crlPath) throws NullPointerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/io/vertx/core/net/PemTrustOptions.java`
#### Snippet
```java
   * @param certValue  the value to add
   * @return a reference to this, so the API can be used fluently
   * @throws NullPointerException
   */
  public PemTrustOptions addCertValue(Buffer certValue) throws NullPointerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/io/vertx/core/net/PemTrustOptions.java`
#### Snippet
```java
   * @param certPath  the path to add
   * @return a reference to this, so the API can be used fluently
   * @throws NullPointerException
   */
  public PemTrustOptions addCertPath(String certPath) throws NullPointerException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
     *
     * @param bytes The encoded bytes
     * @throws VertxException
     */
    DerParser(byte[] bytes) throws VertxException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
     *
     * @return A object
     * @throws VertxException
     */
    public Asn1Object read() throws VertxException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
   * @param keyBytes PKCS#1 encoded key
   * @return KeySpec
   * @throws VertxException
   */
  public static RSAPrivateCrtKeySpec getRSAKeySpec(byte[] keyBytes) throws VertxException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
     *
     * @return A parser for the construct.
     * @throws VertxException
     */
    public DerParser getParser() throws VertxException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
     *
     * @return BigInteger
     * @throws VertxException
     */
    public BigInteger getInteger() throws VertxException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
     *
     * @return The length as integer
     * @throws VertxException
     */
    private int getLength() throws VertxException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
     *
     * @return Java string
     * @throws VertxException
     */
    public String getString() throws VertxException {
```

### JavadocDeclaration
`@param localName` tag description is missing
in `src/main/java/io/vertx/core/spi/metrics/DatagramSocketMetrics.java`
#### Snippet
```java
   * has been created and is listening on a specific host/port.
   *
   * @param localName
   * @param localAddress the local address the net socket is listening on.
   */
```

### JavadocDeclaration
`@param recursive` tag description is missing
in `src/main/java/io/vertx/core/file/FileSystem.java`
#### Snippet
```java
   * @param from  the path to copy from
   * @param to  the path to copy to
   * @param recursive
   * @return a future notified on completion
   */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java
   * Remove all HTTP channel handlers of this connection
   *
   * @return the messages emitted by the removed handlers during their removal
   */
  private void removeChannelHandlers() {
```

### JavadocDeclaration
`@param currentValue` tag description is missing
in `src/main/java/io/vertx/core/json/pointer/JsonPointerIterator.java`
#### Snippet
```java
   * Append array element
   *
   * @param currentValue
   * @param value
   * @return true if the operation is successful
```

### JavadocDeclaration
`@param value` tag description is missing
in `src/main/java/io/vertx/core/json/pointer/JsonPointerIterator.java`
#### Snippet
```java
   *
   * @param currentValue
   * @param value
   * @return true if the operation is successful
   */
```

### JavadocDeclaration
`@param currentValue` tag description is missing
in `src/main/java/io/vertx/core/json/pointer/JsonPointerIterator.java`
#### Snippet
```java

  /**
   * @param currentValue
   * @return {@code true} if the current value is a queryable array
   */
```

### JavadocDeclaration
`@param currentValue` tag description is missing
in `src/main/java/io/vertx/core/json/pointer/JsonPointerIterator.java`
#### Snippet
```java

  /**
   * @param currentValue
   * @return {@code true} if the current value is null/empty
   */
```

### JavadocDeclaration
`@param currentValue` tag description is missing
in `src/main/java/io/vertx/core/json/pointer/JsonPointerIterator.java`
#### Snippet
```java
   * Returns the object parameter with specified key.
   *
   * @param currentValue
   * @param key object key
   * @param createOnMissing If the current value is an object that doesn't contain the key, put an empty object at provided key
```

### JavadocDeclaration
`@param currentValue` tag description is missing
in `src/main/java/io/vertx/core/json/pointer/JsonPointerIterator.java`
#### Snippet
```java
   * Write object parameter at specified key
   *
   * @param currentValue
   * @param key
   * @param value
```

### JavadocDeclaration
`@param key` tag description is missing
in `src/main/java/io/vertx/core/json/pointer/JsonPointerIterator.java`
#### Snippet
```java
   *
   * @param currentValue
   * @param key
   * @param value
   * @return true if the operation is successful
```

### JavadocDeclaration
`@param value` tag description is missing
in `src/main/java/io/vertx/core/json/pointer/JsonPointerIterator.java`
#### Snippet
```java
   * @param currentValue
   * @param key
   * @param value
   * @return true if the operation is successful
   */
```

### JavadocDeclaration
`@param currentValue` tag description is missing
in `src/main/java/io/vertx/core/json/pointer/JsonPointerIterator.java`
#### Snippet
```java

  /**
   * @param currentValue
   * @param key object key
   * @return {@code true} if current value is a queryable object that contains the specified key
```

### JavadocDeclaration
`@param currentValue` tag description is missing
in `src/main/java/io/vertx/core/json/pointer/JsonPointerIterator.java`
#### Snippet
```java
   * Move the iterator the array element at specified index
   *
   * @param currentValue
   * @param i array index
   * @return the request array element, or null if the method was not able to find it
```

### JavadocDeclaration
`@param currentValue` tag description is missing
in `src/main/java/io/vertx/core/json/pointer/JsonPointerIterator.java`
#### Snippet
```java

  /**
   * @param currentValue
   * @return {@code true} if the current value is a queryable object
   */
```

### JavadocDeclaration
`@param currentValue` tag description is missing
in `src/main/java/io/vertx/core/json/pointer/JsonPointerIterator.java`
#### Snippet
```java
   * Write array element at specified index
   *
   * @param currentValue
   * @param i
   * @param value
```

### JavadocDeclaration
`@param i` tag description is missing
in `src/main/java/io/vertx/core/json/pointer/JsonPointerIterator.java`
#### Snippet
```java
   *
   * @param currentValue
   * @param i
   * @param value
   * @return true if the operation is successful
```

### JavadocDeclaration
`@param value` tag description is missing
in `src/main/java/io/vertx/core/json/pointer/JsonPointerIterator.java`
#### Snippet
```java
   * @param currentValue
   * @param i
   * @param value
   * @return true if the operation is successful
   */
```

### JavadocDeclaration
`@param child` tag description is missing
in `src/main/java/io/vertx/core/json/pointer/JsonPointer.java`
#### Snippet
```java
   * For instance {@code "/properties"} pointer is parent pointer of {@code "/properties/parent"}
   *
   * @param child
   */
  boolean isParent(JsonPointer child);
```

### JavadocDeclaration
`@param index` tag description is missing
in `src/main/java/io/vertx/core/json/pointer/JsonPointer.java`
#### Snippet
```java
   * Append the {@code index} as reference token to JsonPointer
   *
   * @param index
   * @return a reference to this, so the API can be used fluently
   */
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `code` may be 'final'
in `src/main/java/io/vertx/core/dns/DnsException.java`
#### Snippet
```java

  private static final String ERROR_MESSAGE_PREFIX = "DNS query error occurred: ";
  private DnsResponseCode code;

  public DnsException(DnsResponseCode code) {
```

### FieldMayBeFinal
Field `certValues` may be 'final'
in `src/main/java/io/vertx/core/net/PemTrustOptions.java`
#### Snippet
```java
  private KeyStoreHelper helper;
  private ArrayList<String> certPaths;
  private ArrayList<Buffer> certValues;

  /**
```

### FieldMayBeFinal
Field `certPaths` may be 'final'
in `src/main/java/io/vertx/core/net/PemTrustOptions.java`
#### Snippet
```java

  private KeyStoreHelper helper;
  private ArrayList<String> certPaths;
  private ArrayList<Buffer> certValues;

```

### FieldMayBeFinal
Field `vertx` may be 'final'
in `src/main/java/io/vertx/core/net/impl/NetClientBuilder.java`
#### Snippet
```java
public class NetClientBuilder {

  private VertxInternal vertx;
  private NetClientOptions options;
  private TCPMetrics metrics;
```

### FieldMayBeFinal
Field `options` may be 'final'
in `src/main/java/io/vertx/core/net/impl/NetClientBuilder.java`
#### Snippet
```java

  private VertxInternal vertx;
  private NetClientOptions options;
  private TCPMetrics metrics;

```

### FieldMayBeFinal
Field `closePromise` may be 'final'
in `src/main/java/io/vertx/core/net/impl/ConnectionBase.java`
#### Snippet
```java
  private SocketAddress localAddress;
  private SocketAddress realLocalAddress;
  private ChannelPromise closePromise;
  private Future<Void> closeFuture;
  private long remainingBytesRead;
```

### FieldMayBeFinal
Field `closeFuture` may be 'final'
in `src/main/java/io/vertx/core/net/impl/ConnectionBase.java`
#### Snippet
```java
  private SocketAddress realLocalAddress;
  private ChannelPromise closePromise;
  private Future<Void> closeFuture;
  private long remainingBytesRead;
  private long remainingBytesWritten;
```

### FieldMayBeFinal
Field `in` may be 'final'
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int UTC_TIME = 0x17;

    private Buffer in;
    private int pos;

```

### FieldMayBeFinal
Field `fallbackSelector` may be 'final'
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
  private BiFunction<PoolWaiter<C>, List<PoolConnection<C>>, PoolConnection<C>> selector;
  private Function<ContextInternal, EventLoopContext> contextProvider;
  private BiFunction<PoolWaiter<C>, List<PoolConnection<C>>, PoolConnection<C>> fallbackSelector;

  // Connection state
```

### FieldMayBeFinal
Field `handlers` may be 'final'
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
  static class LazyFuture<T> extends io.vertx.core.impl.future.FutureBase<T> implements Promise<T> {

    private List<Handler<AsyncResult<T>>> handlers = new ArrayList<>();
    private Future<T> fut = null;

```

### FieldMayBeFinal
Field `LOCK_COMPLETION` may be 'final'
in `src/main/java/io/vertx/core/file/impl/AsyncFileImpl.java`
#### Snippet
```java
  }

  private static CompletionHandler<FileLock, PromiseInternal<AsyncFileLock>> LOCK_COMPLETION = new CompletionHandler<FileLock, PromiseInternal<AsyncFileLock>>() {
    @Override
    public void completed(FileLock result, PromiseInternal<AsyncFileLock> p) {
```

### FieldMayBeFinal
Field `queue` may be 'final'
in `src/main/java/io/vertx/core/file/impl/AsyncFileImpl.java`
#### Snippet
```java
  private int lwm = maxWrites / 2;
  private int readBufferSize = DEFAULT_READ_BUFFER_SIZE;
  private InboundBuffer<Buffer> queue;
  private Handler<Buffer> handler;
  private Handler<Void> endHandler;
```

### FieldMayBeFinal
Field `traceOperation` may be 'final'
in `src/main/java/io/vertx/core/http/impl/HttpClientRequestImpl.java`
#### Snippet
```java
  private boolean headWritten;
  private boolean isConnect;
  private String traceOperation;

  HttpClientRequestImpl(HttpClientImpl client, HttpClientStream stream, PromiseInternal<HttpClientResponse> responsePromise, boolean ssl, HttpMethod method,
```

### FieldMayBeFinal
Field `headers` may be 'final'
in `src/main/java/io/vertx/core/http/impl/HttpClientResponseImpl.java`
#### Snippet
```java

  // Cache these for performance
  private MultiMap headers;
  private MultiMap trailers;
  private List<String> cookies;
```

### FieldMayBeFinal
Field `head` may be 'final'
in `src/main/java/io/vertx/core/http/impl/AssembledHttpResponse.java`
#### Snippet
```java
class AssembledHttpResponse implements io.netty.handler.codec.http.HttpResponse, HttpContent {

  private boolean head;
  private HttpResponseStatus status;
  private HttpVersion version;
```

### FieldMayBeFinal
Field `headers` may be 'final'
in `src/main/java/io/vertx/core/http/impl/AssembledHttpResponse.java`
#### Snippet
```java
  private HttpResponseStatus status;
  private HttpVersion version;
  private HttpHeaders headers;
  private final ByteBuf content;
  private DecoderResult result = DecoderResult.SUCCESS;
```

### FieldMayBeFinal
Field `chctx` may be 'final'
in `src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java`
#### Snippet
```java
  private final int maxWebSocketMessageSize;
  private final InboundBuffer<WebSocketFrameInternal> pending;
  private ChannelHandlerContext chctx;
  protected final ContextInternal context;
  private MessageConsumer binaryHandlerRegistration;
```

### FieldMayBeFinal
Field `localSettings` may be 'final'
in `src/main/java/io/vertx/core/http/impl/Http2ConnectionBase.java`
#### Snippet
```java
  private final ArrayDeque<Handler<Void>> updateSettingsHandlers = new ArrayDeque<>();
  private final ArrayDeque<Promise<Buffer>> pongHandlers = new ArrayDeque<>();
  private Http2Settings localSettings;
  private Http2Settings remoteSettings;
  private Handler<GoAway> goAwayHandler;
```

### FieldMayBeFinal
Field `trailingHeaders` may be 'final'
in `src/main/java/io/vertx/core/http/impl/AssembledFullHttpResponse.java`
#### Snippet
```java
class AssembledFullHttpResponse extends AssembledHttpResponse implements FullHttpResponse {

  private HttpHeaders trailingHeaders;

  public AssembledFullHttpResponse(boolean head, HttpVersion version, HttpResponseStatus status, HttpHeaders headers, ByteBuf buf, HttpHeaders trailingHeaders) {
```

### FieldMayBeFinal
Field `closeParsed` may be 'final'
in `src/main/java/io/vertx/core/http/impl/ws/WebSocketFrameImpl.java`
#### Snippet
```java
  private ByteBuf binaryData;

  private boolean closeParsed = false;
  private short closeStatusCode;
  private String closeReason;
```

### FieldMayBeFinal
Field `client` may be 'final'
in `src/main/java/io/vertx/core/http/impl/Http2UpgradeClientConnection.java`
#### Snippet
```java
  private static final Logger log = LoggerFactory.getLogger(Http2UpgradeClientConnection.class);

  private HttpClientImpl client;
  private HttpClientConnection current;
  private boolean upgradeProcessed;
```

### FieldMayBeFinal
Field `responses` may be 'final'
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java

  private Deque<Stream> requests = new ArrayDeque<>();
  private Deque<Stream> responses = new ArrayDeque<>();
  private boolean closed;
  private boolean evicted;
```

### FieldMayBeFinal
Field `requests` may be 'final'
in `src/main/java/io/vertx/core/http/impl/Http1xClientConnection.java`
#### Snippet
```java
  private final long highWaterMark;

  private Deque<Stream> requests = new ArrayDeque<>();
  private Deque<Stream> responses = new ArrayDeque<>();
  private boolean closed;
```

### FieldMayBeFinal
Field `isolatedClasses` may be 'final'
in `src/main/java/io/vertx/core/impl/IsolatingClassLoader.java`
#### Snippet
```java

  private volatile boolean closed;
  private List<String> isolatedClasses;

  public IsolatingClassLoader(URL[] urls, ClassLoader parent, List<String> isolatedClasses) {
```

### FieldMayBeFinal
Field `options` may be 'final'
in `src/main/java/io/vertx/core/impl/VertxBuilder.java`
#### Snippet
```java
  private static final Logger log = LoggerFactory.getLogger(VertxBuilder.class);

  private VertxOptions options;
  private JsonObject config;
  private Transport transport;
```

### FieldMayBeFinal
Field `commands` may be 'final'
in `src/main/java/io/vertx/core/impl/launcher/ServiceCommandFactoryLoader.java`
#### Snippet
```java
public class ServiceCommandFactoryLoader implements CommandFactoryLookup {

  private Collection<CommandFactory> commands;

  /**
```

### FieldMayBeFinal
Field `osName` may be 'final'
in `src/main/java/io/vertx/core/impl/launcher/commands/ExecUtils.java`
#### Snippet
```java
   * The {@code os.name} property is mandatory (from the Java Virtual Machine specification).
   */
  private static String osName = System.getProperty("os.name").toLowerCase();

  /**
```

### FieldMayBeFinal
Field `commands` may be 'final'
in `src/main/java/io/vertx/core/impl/launcher/VertxCommandLauncher.java`
#### Snippet
```java
    public final CommandFactory factory;
    public final CLI cli;
    private List<Command> commands = new ArrayList<>();

    public CommandRegistration(CommandFactory factory) {
```

### FieldMayBeFinal
Field `resolverGroup` may be 'final'
in `src/main/java/io/vertx/core/impl/resolver/DnsResolverProvider.java`
#### Snippet
```java
  private final Vertx vertx;
  private final List<ResolverRegistration> resolvers = Collections.synchronizedList(new ArrayList<>());
  private AddressResolverGroup<InetSocketAddress> resolverGroup;
  private final List<InetSocketAddress> serverList = new ArrayList<>();

```

### FieldMayBeFinal
Field `datagramSocket` may be 'final'
in `src/main/java/io/vertx/core/datagram/impl/PacketWriteStreamImpl.java`
#### Snippet
```java
class PacketWriteStreamImpl implements WriteStream<Buffer>, Handler<AsyncResult<Void>> {

  private DatagramSocketImpl datagramSocket;
  private Handler<Throwable> exceptionHandler;
  private final int port;
```

### FieldMayBeFinal
Field `delegate` may be 'final'
in `src/main/java/io/vertx/core/eventbus/impl/BodyReadStream.java`
#### Snippet
```java
public class BodyReadStream<T> implements ReadStream<T> {

  private ReadStream<Message<T>> delegate;

  public BodyReadStream(ReadStream<Message<T>> delegate) {
```

### FieldMayBeFinal
Field `channel` may be 'final'
in `src/main/java/io/vertx/core/datagram/impl/DatagramSocketImpl.java`
#### Snippet
```java
  private final ContextInternal context;
  private final DatagramSocketMetrics metrics;
  private DatagramChannel channel;
  private Handler<io.vertx.core.datagram.DatagramPacket> packetHandler;
  private Handler<Throwable> exceptionHandler;
```

### FieldMayBeFinal
Field `outboundInterceptors` may be 'final'
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java
  private static final AtomicReferenceFieldUpdater<EventBusImpl, Handler[]> INBOUND_INTERCEPTORS_UPDATER = AtomicReferenceFieldUpdater.newUpdater(EventBusImpl.class, Handler[].class, "inboundInterceptors");

  private volatile Handler<DeliveryContext>[] outboundInterceptors = new Handler[0];
  private volatile Handler<DeliveryContext>[] inboundInterceptors = new Handler[0];
  private final AtomicLong replySequence = new AtomicLong(0);
```

### FieldMayBeFinal
Field `inboundInterceptors` may be 'final'
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java

  private volatile Handler<DeliveryContext>[] outboundInterceptors = new Handler[0];
  private volatile Handler<DeliveryContext>[] inboundInterceptors = new Handler[0];
  private final AtomicLong replySequence = new AtomicLong(0);
  protected final VertxInternal vertx;
```

### FieldMayBeFinal
Field `tokens` may be 'final'
in `src/main/java/io/vertx/core/parsetools/impl/JsonParserImpl.java`
#### Snippet
```java
  private static class TokenParser extends ParserBase {

    private ArrayDeque<Object> tokens = new ArrayDeque<>();
    private String text;

```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
      String k = decodedTokens.get(i);
      if (i == 0 && "".equals(k)) {
        continue; // Avoid errors with root empty string
      } else if (iterator.isObject(value)) {
        if (onNewValue != null) onNewValue.accept(value);
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `servers`
in `src/main/java/io/vertx/core/net/impl/TCPServerBase.java`
#### Snippet
```java
    listenContext.removeCloseHook(this);
    Map<ServerID, TCPServerBase> servers = vertx.sharedTCPServers((Class<TCPServerBase>) getClass());
    synchronized (servers) {
      ServerChannelLoadBalancer balancer = actualServer.channelBalancer;
      balancer.removeWorker(eventLoop, worker);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `base`
in `src/main/java/io/vertx/core/impl/CloseFuture.java`
#### Snippet
```java
    if (nested instanceof NestedCloseable) {
      NestedCloseable base = (NestedCloseable) nested;
      synchronized (base) {
        if (base.owner == this) {
          base.owner = null;
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `base`
in `src/main/java/io/vertx/core/impl/CloseFuture.java`
#### Snippet
```java
        if  (hook instanceof NestedCloseable) {
          NestedCloseable base = (NestedCloseable) hook;
          synchronized (base) {
            base.owner = null;
          }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `base`
in `src/main/java/io/vertx/core/impl/CloseFuture.java`
#### Snippet
```java
    if (child instanceof NestedCloseable) {
      NestedCloseable base = (NestedCloseable) child;
      synchronized (base) {
        if (base.owner != null) {
          throw new IllegalStateException();
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `fut` is redundant
in `src/main/java/io/vertx/core/net/impl/pool/EndpointResolver.java`
#### Snippet
```java
      });
      AtomicReference<S> state = new AtomicReference<>();
      Future<S> fut = resolved.andThen(ar -> {
        if (ar.succeeded()) {
          state.set(ar.result());
```

### UnnecessaryLocalVariable
Local variable `m` is redundant
in `src/main/java/io/vertx/core/http/impl/Http2ClientConnection.java`
#### Snippet
```java
        Http2ClientConnection conn = new Http2ClientConnection(client, context, connHandler, metrics);
        if (metrics != null) {
          Object m = socketMetric;
          conn.metric(m);
        }
```

### UnnecessaryLocalVariable
Local variable `conn` is redundant
in `src/main/java/io/vertx/core/http/impl/HttpServerWorker.java`
#### Snippet
```java
    HttpServerMetrics metrics = (HttpServerMetrics) server.getMetrics();
    VertxHandler<Http1xServerConnection> handler = VertxHandler.create(chctx -> {
      Http1xServerConnection conn = new Http1xServerConnection(
        streamContextSupplier,
        sslChannelProvider,
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/io/vertx/core/impl/launcher/commands/Watcher.java`
#### Snippet
```java
        }
        // Wait for the next scan.
        Thread.sleep(scanPeriod);
      }
    } catch (Throwable e) {
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy field 'classLoader'
in `src/main/java/io/vertx/core/DeploymentOptions.java`
#### Snippet
```java
   * @param other the instance to copy
   */
  public DeploymentOptions(DeploymentOptions other) {
    this.config = other.getConfig() == null ? null : other.getConfig().copy();
    this.worker = other.isWorker();
```

### CopyConstructorMissesField
Copy constructor does not copy field 'preferNativeTransport'
in `src/main/java/io/vertx/core/VertxOptions.java`
#### Snippet
```java
   * @param other The other {@code VertxOptions} to copy when creating this
   */
  public VertxOptions(VertxOptions other) {
    this.eventLoopPoolSize = other.getEventLoopPoolSize();
    this.workerPoolSize = other.getWorkerPoolSize();
```

### CopyConstructorMissesField
Copy constructor does not copy fields 'maxDelayToWaitTimeUnit' and 'checkIntervalForStatsTimeUnit'
in `src/main/java/io/vertx/core/net/TrafficShapingOptions.java`
#### Snippet
```java
  }

  public TrafficShapingOptions(TrafficShapingOptions other) {
    this.inboundGlobalBandwidth = other.getInboundGlobalBandwidth();
    this.outboundGlobalBandwidth = other.getOutboundGlobalBandwidth();
```

### CopyConstructorMissesField
Copy constructor does not copy fields 'helper' and 'provider'
in `src/main/java/io/vertx/core/net/KeyStoreOptionsBase.java`
#### Snippet
```java
   * @param other  the options to copy
   */
  protected KeyStoreOptionsBase(KeyStoreOptionsBase other) {
    super();
    this.type = other.type;
```

### CopyConstructorMissesField
Copy constructor does not copy field 'helper'
in `src/main/java/io/vertx/core/net/PemTrustOptions.java`
#### Snippet
```java
   * @param other  the options to copy
   */
  public PemTrustOptions(PemTrustOptions other) {
    super();
    this.certPaths = new ArrayList<>(other.getCertPaths());
```

### CopyConstructorMissesField
Copy constructor does not copy field 'helper'
in `src/main/java/io/vertx/core/net/PemKeyCertOptions.java`
#### Snippet
```java
   * @param other  the options to copy
   */
  public PemKeyCertOptions(PemKeyCertOptions other) {
    super();
    this.keyPaths = other.keyPaths != null ? new ArrayList<>(other.keyPaths) : new ArrayList<>();
```

### CopyConstructorMissesField
Copy constructor does not copy field 'json'
in `src/main/java/io/vertx/core/metrics/MetricsOptions.java`
#### Snippet
```java
   * @param other The other {@link MetricsOptions} to copy when creating this
   */
  public MetricsOptions(MetricsOptions other) {
    enabled = other.isEnabled();
    factory = other.factory;
```

### CopyConstructorMissesField
Copy constructor does not copy field 'json'
in `src/main/java/io/vertx/core/tracing/TracingOptions.java`
#### Snippet
```java
   * @param other The other {@link TracingOptions} to copy when creating this
   */
  public TracingOptions(TracingOptions other) {
    factory = other.factory;
  }
```

### CopyConstructorMissesField
Copy constructor does not copy field 'trace'
in `src/main/java/io/vertx/core/eventbus/impl/MessageImpl.java`
#### Snippet
```java
  }

  protected MessageImpl(MessageImpl<U, V> other) {
    this.bus = other.bus;
    this.address = other.address;
```

### CopyConstructorMissesField
Copy constructor does not copy fields 'repliedTo', 'toWire' and 'failure'
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ClusteredMessage.java`
#### Snippet
```java
  }

  protected ClusteredMessage(ClusteredMessage<U, V> other) {
    super(other);
    this.sender = other.sender;
```

## RuleId[id=ThrowableNotThrown]
### ThrowableNotThrown
Result of `deliverMessageLocally()` not thrown
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ClusteredEventBus.java`
#### Snippet
```java
              socket.write(PONG);
            } else {
              deliverMessageLocally(received);
            }
          }
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'currentContext' to 'ContextInternal'
in `src/main/java/io/vertx/core/impl/DeploymentManager.java`
#### Snippet
```java
    Context currentContext = vertx.getOrCreateContext();
    if (deployment == null) {
      return ((ContextInternal) currentContext).failedFuture(new IllegalStateException("Unknown deployment"));
    } else {
      return deployment.doUndeploy(vertx.getOrCreateContext());
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'client' to 'HttpClientInternal'
in `src/main/java/io/vertx/core/impl/VertxImpl.java`
#### Snippet
```java
        return impl;
      });
      client = new CleanableHttpClient((HttpClientInternal) client, cleaner, (timeout, timeunit) -> closeFuture.close());
      closeable = closeFuture;
    } else {
```

