# conjure-java-runtime 
 
# Bad smells
I found 247 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 48 | false |
| ReturnNull | 44 | false |
| BoundedWildcard | 24 | false |
| DataFlowIssue | 17 | false |
| OptionalUsedAsFieldOrParameterType | 17 | false |
| SimplifyOptionalCallChains | 17 | false |
| ReplaceAssignmentWithOperatorAssignment | 9 | false |
| EmptyStatementBody | 6 | false |
| OptionalAssignedToNull | 6 | false |
| EmptyMethod | 6 | false |
| ZeroLengthArrayInitialization | 6 | false |
| UnstableApiUsage | 6 | false |
| DeprecatedIsStillUsed | 4 | false |
| RedundantFieldInitialization | 4 | false |
| AssignmentToMethodParameter | 4 | false |
| RefusedBequest | 3 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| StringOperationCanBeSimplified | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| RedundantEscapeInRegexReplacement | 2 | false |
| AbstractClassNeverImplemented | 2 | false |
| ClassNameSameAsAncestorName | 2 | false |
| OptionalIsPresent | 1 | false |
| MismatchedArrayReadWrite | 1 | false |
| StaticCallOnSubclass | 1 | false |
| RegExpRedundantEscape | 1 | false |
| AbstractMethodCallInConstructor | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| CodeBlock2Expr | 1 | true |
| Convert2Lambda | 1 | false |
| InstanceofCatchParameter | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| NonExceptionNameEndsWithException | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/Java8NullOptionalExpander.java`
#### Snippet
```java
        Preconditions.checkArgument(value instanceof Optional, "Value must be an Optional. Was: %s", value.getClass());
        Optional<?> optional = (Optional<?>) value;
        return optional.isPresent() ? Objects.toString(optional.get()) : null;
    }
}
```

## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `encoded` are written to, but never read
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java

        // get byte encoding from string representation
        byte[] encoded = new byte[hexLen / 2];
        for (int i = 0, p = beg + 1; i < encoded.length; p += 2, i++) {
            encoded[i] = (byte) getByte(p);
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `create()` declared in class 'com.palantir.conjure.java.client.jaxrs.AbstractFeignJaxRsClientBuilder' but referenced via subclass 'com.palantir.conjure.java.client.jaxrs.FeignJaxRsClientBuilder'
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/JaxRsClient.java`
#### Snippet
```java
        Preconditions.checkNotNull(serviceClass, "JAX-RS interface is required");
        Preconditions.checkNotNull(runtime, "ConjureRuntime is required");
        return FeignJaxRsClientBuilder.create(
                "JaxRsClient-" + serviceClass.getSimpleName(),
                serviceClass,
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `args` may produce `NullPointerException`
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/WebPreconditions.java`
#### Snippet
```java

        // start substituting the arguments into the '%s' placeholders
        StringBuilder builder = new StringBuilder(nonNullTemplate.length() + 16 * args.length);
        int templateStart = 0;
        int index = 0;
```

### DataFlowIssue
Dereference of `args` may produce `NullPointerException`
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/WebPreconditions.java`
#### Snippet
```java

        // start substituting the arguments into the '%s' placeholders
        StringBuilder builder = new StringBuilder(nonNullTemplate.length() + 16 * args.length);
        int templateStart = 0;
        int index = 0;
```

### DataFlowIssue
@Nullable method 'get' always returns a non-null value
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/QosExceptionThrowingCallAdapterFactory.java`
#### Snippet
```java
    }

    @Nullable
    @Override
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
```

### DataFlowIssue
Method invocation `dispatcherSpan` may produce `NullPointerException`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/SpanTerminatingInterceptor.java`
#### Snippet
```java
        DetachedSpan attemptSpan = attemptSpanTag.attemptSpan();
        DetachedSpan dispatcherSpan =
                chain.request().tag(Tags.SettableDispatcherSpan.class).dispatcherSpan();

        if (attemptSpan == null || dispatcherSpan == null) {
```

### DataFlowIssue
Method invocation `waitForBodySpan` may produce `NullPointerException`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/SpanTerminatingInterceptor.java`
#### Snippet
```java
            chain.request()
                    .tag(Tags.SettableWaitForBodySpan.class)
                    .waitForBodySpan()
                    .complete();
        }
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CborConverterFactory.java`
#### Snippet
```java
        @Override
        public T convert(ResponseBody value) throws IOException {
            if (value.contentType() == null || !value.contentType().equals(CBOR_MIME_TYPE)) {
                return delegate.convert(value);
            }
```

### DataFlowIssue
@Nullable method 'get' always returns a non-null value
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java
    }

    @Nullable
    @Override
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
```

### DataFlowIssue
Method invocation `convert` may produce `NullPointerException`
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/NeverReturnNullConverterFactory.java`
#### Snippet
```java
            @Override
            public Object convert(ResponseBody value) throws IOException {
                Object object = responseBodyConverter.convert(value);
                Preconditions.checkNotNull(object, "Unexpected null body");
                return object;
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
    private Tags.AttemptSpan createNextAttempt() {
        Tags.AttemptSpan previousAttempt = request().tag(Tags.AttemptSpan.class);
        DetachedSpan entireSpan = request().tag(Tags.EntireSpan.class).get();
        return previousAttempt.nextAttempt(entireSpan);
    }
```

### DataFlowIssue
Method invocation `nextAttempt` may produce `NullPointerException`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
        Tags.AttemptSpan previousAttempt = request().tag(Tags.AttemptSpan.class);
        DetachedSpan entireSpan = request().tag(Tags.EntireSpan.class).get();
        return previousAttempt.nextAttempt(entireSpan);
    }

```

### DataFlowIssue
Method invocation `setDispatcherSpan` may produce `NullPointerException`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
                        concurrencyLimiterSpan.complete();
                        DetachedSpan dispatcherSpan = attemptSpan.childDetachedSpan("OkHttp: dispatcher");
                        request().tag(Tags.SettableDispatcherSpan.class).setDispatcherSpan(dispatcherSpan);
                        enqueueClosingEntireSpan(callback);
                    }
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
            public void onFailure(Call call, IOException exception) {
                try {
                    call.request().tag(Tags.EntireSpan.class).get().complete();
                } finally {
                    callback.onFailure(call, exception);
```

### DataFlowIssue
Method invocation `attemptSpan` may produce `NullPointerException`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
    @Override
    public void enqueue(Callback callback) {
        DetachedSpan attemptSpan = request().tag(Tags.AttemptSpan.class).attemptSpan();
        DetachedSpan concurrencyLimiterSpan = attemptSpan.childDetachedSpan(limiter.spanName());
        ListenableFuture<Limiter.Listener> limiterListener = limiter.acquire();
```

### DataFlowIssue
Method invocation `setLimiterListener` may produce `NullPointerException`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
        DetachedSpan concurrencyLimiterSpan = attemptSpan.childDetachedSpan(limiter.spanName());
        ListenableFuture<Limiter.Listener> limiterListener = limiter.acquire();
        request().tag(ConcurrencyLimiterListener.class).setLimiterListener(limiterListener);
        Futures.addCallback(
                limiterListener,
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    call.request().tag(Tags.EntireSpan.class).get().complete();
                } finally {
                    callback.onResponse(call, response);
```

### DataFlowIssue
Method invocation `setWaitForBodySpan` may produce `NullPointerException`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/OkhttpTraceInterceptor.java`
#### Snippet
```java
                    attemptSpanTag.attemptSpan().childDetachedSpan("OkHttp: wait-for-body", SpanType.CLIENT_OUTGOING);

            chain.request().tag(Tags.SettableWaitForBodySpan.class).setWaitForBodySpan(waitForBody);
        }
    }
```

### DataFlowIssue
Method invocation `attemptSpan` may produce `NullPointerException`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/OkhttpTraceInterceptor.java`
#### Snippet
```java
    private static CloseableSpan createSpan(Request request) {
        return request.tag(Tags.AttemptSpan.class)
                .attemptSpan()
                .childSpan("OkHttp: wait-for-headers", SpanType.CLIENT_OUTGOING);
    }
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`for` statement has empty body
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
        // skip preceding space chars, they can present after
        // comma or semicolon (compatibility with RFC 1779)
        for (; pos < length && chars[pos] == ' '; pos++) {}
        if (pos == length) {
            return null; // reached the end of DN
```

### EmptyStatementBody
`for` statement has empty body
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
        // (compatibility with RFC 1779)
        if (chars[pos] == ' ') {
            for (; pos < length && chars[pos] != '=' && chars[pos] == ' '; pos++) {}

            if (chars[pos] != '=' || pos == length) {
```

### EmptyStatementBody
`for` statement has empty body
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
        // skip space chars between '=' and attribute value
        // (compatibility with RFC 1779)
        for (; pos < length && chars[pos] == ' '; pos++) {}

        // in case of oid attribute type skip its prefix: "oid." or "OID."
```

### EmptyStatementBody
`for` statement has empty body
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
        // skip trailing space chars before comma or semicolon.
        // (compatibility with RFC 1779)
        for (; pos < length && chars[pos] == ' '; pos++) {}

        return new String(chars, beg, end - beg);
```

### EmptyStatementBody
`for` statement has empty body
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
                // skip trailing space chars before comma or semicolon.
                // (compatibility with RFC 1779)
                for (; pos < length && chars[pos] == ' '; pos++) {}
                break;
            } else if (chars[pos] >= 'A' && chars[pos] <= 'F') {
```

### EmptyStatementBody
`if` statement has empty body
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
            }

            if (chars[pos] == ',' || chars[pos] == ';') {
            } else if (chars[pos] != '+') {
                throw new IllegalStateException("Malformed DN: " + dn);
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/WebPreconditions.java`
#### Snippet
```java
                break;
            }
            builder.append(nonNullTemplate.substring(templateStart, placeholderStart));
            builder.append(args[index++]);
            templateStart = placeholderStart + 2;
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/WebPreconditions.java`
#### Snippet
```java
                break;
            }
            builder.append(nonNullTemplate.substring(templateStart, placeholderStart));
            builder.append(args[index++]);
            templateStart = placeholderStart + 2;
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'WebPreconditions' is still used
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/WebPreconditions.java`
#### Snippet
```java
 */
@Deprecated
public final class WebPreconditions {

    private WebPreconditions() {}
```

### DeprecatedIsStillUsed
Deprecated member 'Refreshable' is still used
in `extras/refresh-utils/src/main/java/com/palantir/conjure/java/ext/refresh/Refreshable.java`
#### Snippet
```java
@Deprecated
@ThreadSafe
public final class Refreshable<T> {

    private final AtomicReference<T> value;
```

### DeprecatedIsStillUsed
Deprecated member 'RefreshableProxyInvocationHandler' is still used
in `extras/refresh-utils/src/main/java/com/palantir/conjure/java/ext/refresh/RefreshableProxyInvocationHandler.java`
#### Snippet
```java
 */
@Deprecated
public final class RefreshableProxyInvocationHandler<R, T> extends AbstractInvocationHandler {

    private final Refreshable<R> refreshable;
```

### DeprecatedIsStillUsed
Deprecated member 'HostEventCallback' is still used
in `conjure-java-legacy-clients/src/main/java/com/palantir/conjure/java/okhttp/HostEventsSink.java`
#### Snippet
```java
     */
    @Deprecated
    interface HostEventCallback extends com.palantir.conjure.java.client.config.HostEventsSink.HostEventCallback {

        @Override
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/CompatibleJaxRsContract.java`
#### Snippet
```java
            // jax-rs allows whitespace around the param name, as well as an optional regex. The contract should
            // strip these out appropriately.
            pathValue = pathValue.replaceAll("\\{\\s*(.+?)\\s*(:.+?)?\\}", "\\{$1\\}");
            data.template().append(pathValue);
        } else if (Annotations.PRODUCES.matches(annotationType)) {
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/QosExceptionThrowingCallAdapterFactory.java`
#### Snippet
```java
        @SuppressWarnings({"checkstyle:NoClone", "checkstyle:SuperClone"})
        @Override
        public Call<R> clone() {
            return new QosExceptionThrowingCall<>(delegate.clone());
        }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingCall.java`
#### Snippet
```java

    @Override
    public Call clone() {
        return doClone();
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java
        @SuppressWarnings({"checkstyle:NoClone", "checkstyle:SuperClone"})
        @Override
        public Call<R> clone() {
            return new DefaultingCall<>(delegate.clone(), defaultValue);
        }
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `doClone()` during object construction
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingCall.java`
#### Snippet
```java
    @Override
    public Call clone() {
        return doClone();
    }

```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`hostname.length() == 0` can be replaced with 'hostname.isEmpty()'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/Okhttp39HostnameVerifier.java`
#### Snippet
```java
        // Basic sanity checks
        // Check length == 0 instead of .isEmpty() to support Java 5.
        if ((hostname == null) || (hostname.length() == 0) || hostname.startsWith(".") || hostname.endsWith("..")) {
            // Invalid domain name
            return false;
```

### SizeReplaceableByIsEmpty
`pattern.length() == 0` can be replaced with 'pattern.isEmpty()'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/Okhttp39HostnameVerifier.java`
#### Snippet
```java
            return false;
        }
        if ((pattern == null) || (pattern.length() == 0) || pattern.startsWith(".") || pattern.endsWith("..")) {
            // Invalid pattern/domain name
            return false;
```

## RuleId[id=RedundantEscapeInRegexReplacement]
### RedundantEscapeInRegexReplacement
Redundant escape of '{'
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/CompatibleJaxRsContract.java`
#### Snippet
```java
            // jax-rs allows whitespace around the param name, as well as an optional regex. The contract should
            // strip these out appropriately.
            pathValue = pathValue.replaceAll("\\{\\s*(.+?)\\s*(:.+?)?\\}", "\\{$1\\}");
            data.template().append(pathValue);
        } else if (Annotations.PRODUCES.matches(annotationType)) {
```

### RedundantEscapeInRegexReplacement
Redundant escape of '}'
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/CompatibleJaxRsContract.java`
#### Snippet
```java
            // jax-rs allows whitespace around the param name, as well as an optional regex. The contract should
            // strip these out appropriately.
            pathValue = pathValue.replaceAll("\\{\\s*(.+?)\\s*(:.+?)?\\}", "\\{$1\\}");
            data.template().append(pathValue);
        } else if (Annotations.PRODUCES.matches(annotationType)) {
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `TrustContext` has no concrete subclass
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/TrustContext.java`
#### Snippet
```java
/** A wrapper for {@link javax.net.ssl.SSLSocketFactory} and {@link javax.net.ssl.X509TrustManager}. */
@Value.Immutable
public abstract class TrustContext {
    @Value.Parameter
    public abstract SSLSocketFactory sslSocketFactory();
```

### AbstractClassNeverImplemented
Abstract class `PemX509Certificate` has no concrete subclass
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/PemX509Certificate.java`
#### Snippet
```java
@ImmutablesStyle
@JsonSerialize(as = ImmutablePemX509Certificate.class)
public abstract class PemX509Certificate {

    /**
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends ClientConfiguration`
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/JaxRsClient.java`
#### Snippet
```java
            UserAgent userAgent,
            HostEventsSink hostEventsSink,
            Refreshable<ClientConfiguration> config) {
        return Reflection.newProxy(
                serviceClass,
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/QosExceptionThrowingCallAdapterFactory.java`
#### Snippet
```java
        private final CallAdapter<R, T> delegate;

        private QosExceptionThrowingCallAdapter(CallAdapter<R, T> delegate) {
            this.delegate = delegate;
        }
```

### BoundedWildcard
Can generalize to `? extends ClientConfiguration`
in `conjure-scala-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/JaxRsScalaClient.java`
#### Snippet
```java
            UserAgent userAgent,
            HostEventsSink hostEventsSink,
            Refreshable<ClientConfiguration> config) {
        return Reflection.newProxy(
                serviceClass,
```

### BoundedWildcard
Can generalize to `? extends Certificate`
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/KeyStores.java`
#### Snippet
```java

    private static void addCertificatesToKeystore(
            KeyStore keyStore, String certificateEntryNamePrefix, List<Certificate> certificates)
            throws KeyStoreException {
        int certIndex = 0;
```

### BoundedWildcard
Can generalize to `? super ResponseBody`
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CborConverterFactory.java`
#### Snippet
```java
        private final Converter<ResponseBody, T> delegate;

        CborResponseBodyConverter(ObjectReader cborObjectReader, Converter<ResponseBody, T> delegate) {
            this.cborObjectReader = cborObjectReader;
            this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? extends T`
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CborConverterFactory.java`
#### Snippet
```java
        private final Converter<ResponseBody, T> delegate;

        CborResponseBodyConverter(ObjectReader cborObjectReader, Converter<ResponseBody, T> delegate) {
            this.cborObjectReader = cborObjectReader;
            this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? super CloseableHttpResponse`
in `undertow-jakarta-testing/src/main/java/com/palantir/undertest/UndertowServerExtension.java`
#### Snippet
```java
    }

    public void runRequest(ClassicHttpRequest request, ThrowableConsumer<CloseableHttpResponse> handler) {
        try (CloseableHttpResponse response = makeRequest(request)) {
            handler.accept(response);
```

### BoundedWildcard
Can generalize to `? extends R`
in `extras/refresh-utils/src/main/java/com/palantir/conjure/java/ext/refresh/RefreshableProxyInvocationHandler.java`
#### Snippet
```java
    private T delegate;

    private RefreshableProxyInvocationHandler(Refreshable<R> refreshable, Function<R, T> delegateSupplier) {
        this.refreshable = refreshable;
        this.delegateSupplier = delegateSupplier;
```

### BoundedWildcard
Can generalize to `? super R`
in `extras/refresh-utils/src/main/java/com/palantir/conjure/java/ext/refresh/RefreshableProxyInvocationHandler.java`
#### Snippet
```java
    private T delegate;

    private RefreshableProxyInvocationHandler(Refreshable<R> refreshable, Function<R, T> delegateSupplier) {
        this.refreshable = refreshable;
        this.delegateSupplier = delegateSupplier;
```

### BoundedWildcard
Can generalize to `? extends T`
in `extras/refresh-utils/src/main/java/com/palantir/conjure/java/ext/refresh/RefreshableProxyInvocationHandler.java`
#### Snippet
```java
    private T delegate;

    private RefreshableProxyInvocationHandler(Refreshable<R> refreshable, Function<R, T> delegateSupplier) {
        this.refreshable = refreshable;
        this.delegateSupplier = delegateSupplier;
```

### BoundedWildcard
Can generalize to `? extends SimpleLimiter`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ConcurrencyLimiters.java`
#### Snippet
```java
        private final LeakDetector<Limiter.Listener> leakDetector = new LeakDetector<>(Limiter.Listener.class);

        DefaultConcurrencyLimiter(Key limiterKey, Supplier<SimpleLimiter<Void>> limiterFactory) {
            this.limiterKey = limiterKey;
            this.limiterFactory = limiterFactory;
```

### BoundedWildcard
Can generalize to `? extends Limiter.Listener`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ConcurrencyLimiters.java`
#### Snippet
```java
        }

        private void addSlowAcquireMarker(ListenableFuture<Limiter.Listener> future) {
            long start = System.nanoTime();
            Futures.addCallback(
```

### BoundedWildcard
Can generalize to `? super ResponseBody`
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesConverterFactory.java`
#### Snippet
```java
        private final Type type;

        CoerceNullCollectionsConverter(Converter<ResponseBody, ?> responseBodyConverter, Type type) {
            this.responseBodyConverter = responseBodyConverter;
            this.type = type;
```

### BoundedWildcard
Can generalize to `? extends Call`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
    RemotingOkHttpCall(
            Call delegate,
            Optional<Call> previous,
            BackoffStrategy backoffStrategy,
            UrlSelector urls,
```

### BoundedWildcard
Can generalize to `? super String`
in `conjure-java-legacy-clients/src/main/java/com/palantir/conjure/java/QosExceptionResponseMapper.java`
#### Snippet
```java
    }

    private static QosException map429(Function<String, String> headerFn) {
        String duration = headerFn.apply(HttpHeaders.RETRY_AFTER);
        if (duration != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `conjure-java-legacy-clients/src/main/java/com/palantir/conjure/java/QosExceptionResponseMapper.java`
#### Snippet
```java
    }

    private static Optional<QosException> map308(Function<String, String> headerFn) {
        String locationHeader = headerFn.apply(HttpHeaders.LOCATION);
        if (locationHeader == null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `conjure-java-legacy-clients/src/main/java/com/palantir/conjure/java/QosExceptionResponseMapper.java`
#### Snippet
```java

    public static Optional<QosException> mapResponseCodeHeaderStream(
            int code, Function<String, Stream<String>> headerFn) {
        return mapResponseCode(
                code, header -> headerFn.apply(header).findFirst().orElse(null));
```

### BoundedWildcard
Can generalize to `? extends Stream`
in `conjure-java-legacy-clients/src/main/java/com/palantir/conjure/java/QosExceptionResponseMapper.java`
#### Snippet
```java

    public static Optional<QosException> mapResponseCodeHeaderStream(
            int code, Function<String, Stream<String>> headerFn) {
        return mapResponseCode(
                code, header -> headerFn.apply(header).findFirst().orElse(null));
```

### BoundedWildcard
Can generalize to `? extends RuntimeException`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/LeakDetector.java`
#### Snippet
```java
    }

    private void logLeak(Optional<RuntimeException> stackTrace) {
        if (stackTrace.isPresent()) {
            log.warn(
```

### BoundedWildcard
Can generalize to `? super Optional`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/LeakDetector.java`
#### Snippet
```java

    @VisibleForTesting
    LeakDetector(Class<T> resourceType, Consumer<Optional<RuntimeException>> subscriber) {
        this.resourceType = resourceType;
        this.subscriber = subscriber;
```

### BoundedWildcard
Can generalize to `? extends ClientConfiguration`
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/Retrofit2Client.java`
#### Snippet
```java
            UserAgent userAgent,
            HostEventsSink hostEventsSink,
            Refreshable<ClientConfiguration> config) {
        return Reflection.newProxy(
                serviceClass,
```

### BoundedWildcard
Can generalize to `? extends BackoffStrategy`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpClient.java`
#### Snippet
```java
    RemotingOkHttpClient(
            OkHttpClient delegate,
            Supplier<BackoffStrategy> backoffStrategy,
            NodeSelectionStrategy nodeSelectionStrategy,
            UrlSelector urls,
```

### BoundedWildcard
Can generalize to `? extends T`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/UrlSelectorImpl.java`
#### Snippet
```java
    }

    static <T> List<T> shuffle(List<T> list) {
        List<T> shuffledList = new ArrayList<>(list);
        Collections.shuffle(shuffledList);
```

### BoundedWildcard
Can generalize to `? extends ProxyConfiguration`
in `client-config/src/main/java/com/palantir/conjure/java/client/config/ClientConfigurations.java`
#### Snippet
```java
    }

    private static Optional<HostAndPort> meshProxy(Optional<ProxyConfiguration> proxy) {
        if (proxy.isPresent() && proxy.get().type() == ProxyConfiguration.Type.MESH) {
            return Optional.of(HostAndPort.fromString(proxy.get().hostAndPort().get()));
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'password'
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/KeyStores.java`
#### Snippet
```java
     *     given alias
     */
    static KeyStore newKeyStoreWithEntry(KeyStore original, Optional<String> password, String alias) {
        try {
            KeyStore newKeyStore = KeyStore.getInstance(original.getType());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'password'
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/KeyStores.java`
#### Snippet
```java
     *     the provided password.
     */
    static KeyStore loadKeyStore(String storeType, Path path, Optional<String> password) {
        try {
            KeyStore keyStore = KeyStore.getInstance(storeType);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'allocationStackTrace'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ConcurrencyLimiters.java`
#### Snippet
```java

        private QueuedRequest(
                SettableFuture<Limiter.Listener> future, Optional<RuntimeException> allocationStackTrace) {
            this.future = future;
            this.allocationStackTrace = allocationStackTrace;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'allocationStackTrace'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ConcurrencyLimiters.java`
#### Snippet
```java
        }

        private Limiter.Listener wrap(Limiter.Listener listener, Optional<RuntimeException> allocationStackTrace) {
            Limiter.Listener result = new Limiter.Listener() {
                @Override
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'allocationStackTrace'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ConcurrencyLimiters.java`
#### Snippet
```java
    private static final class QueuedRequest {
        private final SettableFuture<Limiter.Listener> future;
        private final Optional<RuntimeException> allocationStackTrace;

        private QueuedRequest(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'backoff'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
    }

    private boolean shouldRetry(IOException exception, Optional<Duration> backoff) {
        if (retryOnSocketException == ClientConfiguration.RetryOnSocketException.DANGEROUS_DISABLED) {
            return false;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'previous'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
    RemotingOkHttpCall(
            Call delegate,
            Optional<Call> previous,
            BackoffStrategy backoffStrategy,
            UrlSelector urls,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'previous'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
    private final ClientConfiguration.RetryOnSocketException retryOnSocketException;
    // Previous call in the chain if this is a retry request
    private final Optional<Call> previous;

    private final int maxNumRelocations;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'stackTrace'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/LeakDetector.java`
#### Snippet
```java
    }

    synchronized void register(T objectToMonitor, Optional<RuntimeException> stackTrace) {
        references.add(new LeakDetectingReference<>(objectToMonitor, stackTrace));
        pruneAndLog();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'stackTrace'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/LeakDetector.java`
#### Snippet
```java

    private static final class LeakDetectingReference<T> extends WeakReference<T> {
        private final Optional<RuntimeException> stackTrace;

        LeakDetectingReference(T referent, Optional<RuntimeException> stackTrace) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'stackTrace'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/LeakDetector.java`
#### Snippet
```java
    }

    private void logLeak(Optional<RuntimeException> stackTrace) {
        if (stackTrace.isPresent()) {
            log.warn(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'stackTrace'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/LeakDetector.java`
#### Snippet
```java
        private final Optional<RuntimeException> stackTrace;

        LeakDetectingReference(T referent, Optional<RuntimeException> stackTrace) {
            super(referent);
            this.stackTrace = stackTrace;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'previousCall'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpClient.java`
#### Snippet
```java

    RemotingOkHttpCall newCallWithMutableState(
            Request request, BackoffStrategy backoffStrategy, int maxNumRelocations, Optional<Call> previousCall) {
        return new RemotingOkHttpCall(
                getDelegate().newCall(request),
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'proxy'
in `client-config/src/main/java/com/palantir/conjure/java/client/config/ClientConfigurations.java`
#### Snippet
```java
    }

    private static Optional<HostAndPort> meshProxy(Optional<ProxyConfiguration> proxy) {
        if (proxy.isPresent() && proxy.get().type() == ProxyConfiguration.Type.MESH) {
            return Optional.of(HostAndPort.fromString(proxy.get().hostAndPort().get()));
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'userAgent'
in `client-config/src/main/java/com/palantir/conjure/java/client/config/ClientConfigurations.java`
#### Snippet
```java
            SSLSocketFactory sslSocketFactory,
            X509TrustManager trustManager,
            Optional<UserAgent> userAgent) {
        return ClientConfiguration.builder()
                .sslSocketFactory(sslSocketFactory)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'keyStorePassword'
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/SslSocketFactories.java`
#### Snippet
```java
    private static KeyManagerFactory createKeyManagerFactory(
            Path keyStorePath,
            Optional<String> keyStorePassword,
            SslConfiguration.StoreType keyStoreType,
            Optional<String> keyStoreKeyAlias) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'keyStoreKeyAlias'
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/SslSocketFactories.java`
#### Snippet
```java
            Optional<String> keyStorePassword,
            SslConfiguration.StoreType keyStoreType,
            Optional<String> keyStoreKeyAlias) {
        KeyStore keyStore;
        switch (keyStoreType) {
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/DialogueFeignClient.java`
#### Snippet
```java
    private static String urlDecode(String input) {
        try {
            return URLDecoder.decode(input, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new SafeRuntimeException("Failed to decode path segment", e, UnsafeArg.of("encoded", input));
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `HostEventsSink` is the same as one of its superclass' names
in `conjure-java-legacy-clients/src/main/java/com/palantir/conjure/java/okhttp/HostEventsSink.java`
#### Snippet
```java
 */
@Deprecated
public interface HostEventsSink extends com.palantir.conjure.java.client.config.HostEventsSink {
    @Override
    void record(String serviceName, String hostname, int port, int statusCode, long micros);
```

### ClassNameSameAsAncestorName
Class name `HostEventCallback` is the same as one of its superclass' names
in `conjure-java-legacy-clients/src/main/java/com/palantir/conjure/java/okhttp/HostEventsSink.java`
#### Snippet
```java
     */
    @Deprecated
    interface HostEventCallback extends com.palantir.conjure.java.client.config.HostEventsSink.HostEventCallback {

        @Override
```

## RuleId[id=OptionalAssignedToNull]
### OptionalAssignedToNull
Optional value is compared with null
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalDoubleParamConverterProvider.java`
#### Snippet
```java
        @Override
        public String toString(final OptionalDouble value) {
            Preconditions.checkArgument(value != null);
            return value.isPresent() ? Double.toString(value.getAsDouble()) : "";
        }
```

### OptionalAssignedToNull
Optional value is compared with null
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalIntParamConverterProvider.java`
#### Snippet
```java
        @Override
        public String toString(final OptionalInt value) {
            Preconditions.checkArgument(value != null);
            return value.isPresent() ? Integer.toString(value.getAsInt()) : "";
        }
```

### OptionalAssignedToNull
Optional value is compared with null
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalLongParamConverterProvider.java`
#### Snippet
```java
        @Override
        public String toString(final OptionalLong value) {
            Preconditions.checkArgument(value != null);
            return value.isPresent() ? Long.toString(value.getAsLong()) : "";
        }
```

### OptionalAssignedToNull
Optional value is compared with null
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalLongParamConverterProvider.java`
#### Snippet
```java
        @Override
        public String toString(final OptionalLong value) {
            Preconditions.checkArgument(value != null);
            return value.isPresent() ? Long.toString(value.getAsLong()) : "";
        }
```

### OptionalAssignedToNull
Optional value is compared with null
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalIntParamConverterProvider.java`
#### Snippet
```java
        @Override
        public String toString(final OptionalInt value) {
            Preconditions.checkArgument(value != null);
            return value.isPresent() ? Integer.toString(value.getAsInt()) : "";
        }
```

### OptionalAssignedToNull
Optional value is compared with null
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalDoubleParamConverterProvider.java`
#### Snippet
```java
        @Override
        public String toString(final OptionalDouble value) {
            Preconditions.checkArgument(value != null);
            return value.isPresent() ? Double.toString(value.getAsDouble()) : "";
        }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/CompatibleJaxRsContract.java`
#### Snippet
```java
            // jax-rs allows whitespace around the param name, as well as an optional regex. The contract should
            // strip these out appropriately.
            pathValue = pathValue.replaceAll("\\{\\s*(.+?)\\s*(:.+?)?\\}", "\\{$1\\}");
            data.template().append(pathValue);
        } else if (Annotations.PRODUCES.matches(annotationType)) {
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalDoubleMessageBodyWriter.java`
#### Snippet
```java
            OutputStream entityStream)
            throws IOException {
        if (!entity.isPresent()) {
            throw new NoContentException("Absent value for type: " + genericType);
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalIntMessageBodyWriter.java`
#### Snippet
```java
            OutputStream entityStream)
            throws IOException {
        if (!entity.isPresent()) {
            throw new NoContentException("Absent value for type: " + genericType);
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalMessageBodyWriter.java`
#### Snippet
```java
            OutputStream entityStream)
            throws IOException {
        if (!entity.isPresent()) {
            throw new NoContentException("Absent value for type: " + genericType);
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalLongMessageBodyWriter.java`
#### Snippet
```java
            OutputStream entityStream)
            throws IOException {
        if (!entity.isPresent()) {
            throw new NoContentException("Absent value for type: " + genericType);
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalMessageBodyWriter.java`
#### Snippet
```java
            OutputStream entityStream)
            throws IOException {
        if (!entity.isPresent()) {
            throw new NoContentException("Absent value for type: " + genericType);
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalDoubleMessageBodyWriter.java`
#### Snippet
```java
            OutputStream entityStream)
            throws IOException {
        if (!entity.isPresent()) {
            throw new NoContentException("Absent value for type: " + genericType);
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalLongMessageBodyWriter.java`
#### Snippet
```java
            OutputStream entityStream)
            throws IOException {
        if (!entity.isPresent()) {
            throw new NoContentException("Absent value for type: " + genericType);
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/DialogueFeignClient.java`
#### Snippet
```java
        }
        Optional<String> maybeContentType = getFirstHeader(request, HttpHeaders.CONTENT_TYPE);
        if (!maybeContentType.isPresent()) {
            if (requestBodyContent.length == 0) {
                return Optional.empty();
```

### SimplifyOptionalCallChains
Optional chain can be simplified
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/QosExceptionThrowingCallAdapterFactory.java`
#### Snippet
```java
                    response.code(), header -> Optional.ofNullable(headers.get(header))
                            .map(List::stream)
                            .orElseGet(Stream::empty));
        }

```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ConcurrencyLimiters.java`
#### Snippet
```java
                }
                Optional<Limiter.Listener> maybeAcquired = limiter.acquire(NO_CONTEXT);
                if (!maybeAcquired.isPresent()) {
                    if (!timeoutScheduled()) {
                        timeoutCleanup = scheduledExecutorService.schedule(
```

### SimplifyOptionalCallChains
Optional chain can be simplified
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/QosErrorDecoder.java`
#### Snippet
```java
                        header -> Optional.ofNullable(response.headers().get(header))
                                .map(Collection::stream)
                                .orElseGet(Stream::empty))
                .map(Function.identity());
        return exception.orElseGet(() -> delegate.decode(methodKey, response));
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalIntMessageBodyWriter.java`
#### Snippet
```java
            OutputStream entityStream)
            throws IOException {
        if (!entity.isPresent()) {
            throw new NoContentException("Absent value for type: " + genericType);
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java

                Optional<Duration> backoff = backoffStrategy.nextBackoff();
                if (!backoff.isPresent()) {
                    callback.onFailure(
                            call,
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
                // Redirect to the "next" URL, whichever that may be, after backing off.
                Optional<HttpUrl> redirectTo = urls.redirectToNext(request().url());
                if (!redirectTo.isPresent()) {
                    callback.onFailure(
                            call,
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
                Optional<HttpUrl> redirectTo = urls.redirectTo(
                        request().url(), exception.getRedirectTo().toString());
                if (!redirectTo.isPresent()) {
                    callback.onFailure(
                            call,
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java

                Optional<HttpUrl> redirectTo = urls.redirectToNext(request().url());
                if (!redirectTo.isPresent()) {
                    callback.onFailure(
                            call,
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java

                Optional<Duration> nonAdvertizedBackoff = backoffStrategy.nextBackoff();
                if (!nonAdvertizedBackoff.isPresent()) {
                    callback.onFailure(
                            call,
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `javax.ws.rs.ext` is unnecessary and can be removed
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/ListenableExceptionMapper.java`
#### Snippet
```java
    }

    /** Just like the jaxrs {@link javax.ws.rs.ext.ExceptionMapper#toResponse} method. */
    abstract Response toResponseInner(T exception);

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/GuavaOptionalParamConverterProvider.java`
#### Snippet
```java
                    @Override
                    public T fromString(final String value) {
                        return rawType.cast(com.google.common.base.Optional.fromNullable(value));
                    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/GuavaOptionalParamConverterProvider.java`
#### Snippet
```java
                        @Override
                        public T fromString(final String value) {
                            return rawType.cast(com.google.common.base.Optional.fromNullable(value)
                                    .transform(converter::fromString));
                        }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/GuavaOptionalParamConverterProvider.java`
#### Snippet
```java
    public <T> ParamConverter<T> getConverter(
            final Class<T> rawType, final Type genericType, final Annotation[] annotations) {
        if (com.google.common.base.Optional.class.equals(rawType)) {
            final List<ClassTypePair> ctps = ReflectionHelper.getTypeArgumentAndClass(genericType);
            final ClassTypePair ctp = (ctps.size() == 1) ? ctps.get(0) : null;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/GuavaNullOptionalExpander.java`
#### Snippet
```java
    public String expand(Object value) {
        Preconditions.checkArgument(
                value instanceof com.google.common.base.Optional,
                "Value must be an Optional. Was: %s",
                value.getClass());
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/GuavaNullOptionalExpander.java`
#### Snippet
```java
                "Value must be an Optional. Was: %s",
                value.getClass());
        com.google.common.base.Optional<?> optional = (com.google.common.base.Optional<?>) value;
        return optional.isPresent() ? Objects.toString(optional.get()) : null;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/GuavaNullOptionalExpander.java`
#### Snippet
```java
                "Value must be an Optional. Was: %s",
                value.getClass());
        com.google.common.base.Optional<?> optional = (com.google.common.base.Optional<?>) value;
        return optional.isPresent() ? Objects.toString(optional.get()) : null;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `client-config/src/main/java/com/palantir/conjure/java/clients/ConjureClients.java`
#### Snippet
```java
        T withRetryOnTimeout(ClientConfiguration.RetryOnTimeout value);

        T withSecurityProvider(java.security.Provider securityProvider);

        T withMaxNumRetries(int maxNumRetries);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/GuavaOptionalAwareContract.java`
#### Snippet
```java
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls.equals(com.google.common.base.Optional.class)) {
                Set<Class<?>> paramAnnotations = Arrays.stream(annotations[i])
                        .map(Annotation::annotationType)
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/GuavaOptionalAwareDecoder.java`
#### Snippet
```java
    @Override
    public Object decode(Response response, Type type) throws IOException, FeignException {
        if (RawTypes.get(type).equals(com.google.common.base.Optional.class)) {
            if (response.status() == 204) {
                return com.google.common.base.Optional.absent();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/GuavaOptionalAwareDecoder.java`
#### Snippet
```java
        if (RawTypes.get(type).equals(com.google.common.base.Optional.class)) {
            if (response.status() == 204) {
                return com.google.common.base.Optional.absent();
            } else {
                Object decoded = checkNotNull(
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/GuavaOptionalAwareDecoder.java`
#### Snippet
```java
                        "Unexpected null content for response status %s",
                        response.status());
                return com.google.common.base.Optional.of(decoded);
            }
        } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.ws.rs.ext` is unnecessary and can be removed
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/ListenableExceptionMapper.java`
#### Snippet
```java
    }

    /** Just like the jaxrs {@link jakarta.ws.rs.ext.ExceptionMapper#toResponse} method. */
    abstract Response toResponseInner(T exception);

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/GuavaOptionalMessageBodyWriter.java`
#### Snippet
```java
    @Override
    public boolean isWriteable(Class<?> type, Type _genericType, Annotation[] _annotations, MediaType _mediaType) {
        return com.google.common.base.Optional.class.isAssignableFrom(type);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/GuavaOptionalMessageBodyWriter.java`
#### Snippet
```java
    @Override
    public long getSize(
            com.google.common.base.Optional<?> _entity,
            Class<?> _type,
            Type _genericType,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/GuavaOptionalMessageBodyWriter.java`
#### Snippet
```java
@Provider
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
public final class GuavaOptionalMessageBodyWriter implements MessageBodyWriter<com.google.common.base.Optional<?>> {

    @Inject
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/GuavaOptionalMessageBodyWriter.java`
#### Snippet
```java
    @Override
    public void writeTo(
            com.google.common.base.Optional<?> entity,
            Class<?> _type,
            Type genericType,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/GuavaOptionalMessageBodyWriter.java`
#### Snippet
```java
    @Override
    public boolean isWriteable(Class<?> type, Type _genericType, Annotation[] _annotations, MediaType _mediaType) {
        return com.google.common.base.Optional.class.isAssignableFrom(type);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/GuavaOptionalMessageBodyWriter.java`
#### Snippet
```java
    @Override
    public void writeTo(
            com.google.common.base.Optional<?> entity,
            Class<?> _type,
            Type genericType,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/GuavaOptionalMessageBodyWriter.java`
#### Snippet
```java
    @Override
    public long getSize(
            com.google.common.base.Optional<?> _entity,
            Class<?> _type,
            Type _genericType,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/GuavaOptionalMessageBodyWriter.java`
#### Snippet
```java
@Provider
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
public final class GuavaOptionalMessageBodyWriter implements MessageBodyWriter<com.google.common.base.Optional<?>> {

    @Inject
```

### UnnecessaryFullyQualifiedName
Qualifier `feign.codec` is unnecessary, and can be replaced with an import
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/DialogueFeignClient.java`
#### Snippet
```java

    /** Implements exception handling equivalent dialogue decoders. */
    static final class RemoteExceptionDecoder implements feign.codec.ErrorDecoder {

        private final ConjureRuntime runtime;
```

### UnnecessaryFullyQualifiedName
Qualifier `feign` is unnecessary, and can be replaced with an import
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/DialogueFeignClient.java`
#### Snippet
```java
 * taking advantage of the superior observability and stability provided by Dialogue.
 */
final class DialogueFeignClient implements feign.Client {

    private static final String PATH_TEMPLATE = "hr-path-template";
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/TrustContext.java`
#### Snippet
```java
import org.immutables.value.Value;

/** A wrapper for {@link javax.net.ssl.SSLSocketFactory} and {@link javax.net.ssl.X509TrustManager}. */
@Value.Immutable
public abstract class TrustContext {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/TrustContext.java`
#### Snippet
```java
import org.immutables.value.Value;

/** A wrapper for {@link javax.net.ssl.SSLSocketFactory} and {@link javax.net.ssl.X509TrustManager}. */
@Value.Immutable
public abstract class TrustContext {
```

### UnnecessaryFullyQualifiedName
Qualifier `okhttp3` is unnecessary and can be removed
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java
import okhttp3.WebSocketListener;

/** A forwarding/delegating {@link okhttp3.OkHttpClient}. Sub-classes should override individual methods. */
class ForwardingOkHttpClient extends OkHttpClient {

```

### UnnecessaryFullyQualifiedName
Qualifier `okhttp3` is unnecessary and can be removed
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingCall.java`
#### Snippet
```java
import okio.Timeout;

/** A forwarding/delegating {@link okhttp3.Call}. Sub-classes should override individual methods. */
@SuppressWarnings({"checkstyle:noclone", "checkstyle:superclone"})
abstract class ForwardingCall implements Call {
```

### UnnecessaryFullyQualifiedName
Qualifier `retrofit2` is unnecessary and can be removed
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java

    /**
     * A {@link retrofit2.Call} that returns a default if the result coming out of the delegate call (probably
     * {@link retrofit2.OkHttpCall}) is null.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `okhttp3` is unnecessary, and can be replaced with an import
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/Retrofit2ClientBuilder.java`
#### Snippet
```java

    public <T> T build(Class<T> serviceClass, UserAgent userAgent) {
        okhttp3.OkHttpClient client = OkHttpClients.create(
                config,
                userAgent,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/GuavaEmptyOptionalExpander.java`
#### Snippet
```java
    public String expand(Object value) {
        Preconditions.checkArgument(
                value instanceof com.google.common.base.Optional,
                "Value must be an Optional. Was: %s",
                value.getClass());
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/GuavaEmptyOptionalExpander.java`
#### Snippet
```java
                "Value must be an Optional. Was: %s",
                value.getClass());
        com.google.common.base.Optional<?> optional = (com.google.common.base.Optional<?>) value;
        return optional.isPresent() ? Objects.toString(optional.get()) : "";
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/GuavaEmptyOptionalExpander.java`
#### Snippet
```java
                "Value must be an Optional. Was: %s",
                value.getClass());
        com.google.common.base.Optional<?> optional = (com.google.common.base.Optional<?>) value;
        return optional.isPresent() ? Objects.toString(optional.get()) : "";
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/GuavaOptionalParamConverterProvider.java`
#### Snippet
```java
                        @Override
                        public T fromString(final String value) {
                            return rawType.cast(com.google.common.base.Optional.fromNullable(value)
                                    .transform(converter::fromString));
                        }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/GuavaOptionalParamConverterProvider.java`
#### Snippet
```java
                    @Override
                    public T fromString(final String value) {
                        return rawType.cast(com.google.common.base.Optional.fromNullable(value));
                    }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/GuavaOptionalParamConverterProvider.java`
#### Snippet
```java
    public <T> ParamConverter<T> getConverter(
            final Class<T> rawType, final Type genericType, final Annotation[] annotations) {
        if (com.google.common.base.Optional.class.equals(rawType)) {
            final List<ClassTypePair> ctps = ReflectionHelper.getTypeArgumentAndClass(genericType);
            final ClassTypePair ctp = (ctps.size() == 1) ? ctps.get(0) : null;
```

### UnnecessaryFullyQualifiedName
Qualifier `feign.codec` is unnecessary and can be removed
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/TextDelegateEncoder.java`
#### Snippet
```java

/**
 * Delegates to a {@link feign.codec.Encoder.Default} if the response has a Content-Type of text/plain, or falls back to
 * the given delegate otherwise.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalObjectToStringConverterFactory.java`
#### Snippet
```java
    }

    enum Java8OptionalIntStringConverter implements Converter<java.util.OptionalInt, String> {
        INSTANCE;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalObjectToStringConverterFactory.java`
#### Snippet
```java
 * A retrofit2 {@link Converter} that converts {@code Optional<?>} retrofit {@link Path}, {@link Query} and
 * {@link Header} parameters into the string representation of the wrapped object, or null if the optional is empty.
 * Handles both {@link java.util.Optional Java8 Optional} and {@link com.google.common.base.Optional Guava Optional}.
 */
public final class OptionalObjectToStringConverterFactory extends Converter.Factory {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalObjectToStringConverterFactory.java`
#### Snippet
```java

        @Override
        public String convert(java.util.OptionalInt value) throws IOException {
            return value.isPresent() ? Integer.toString(value.getAsInt()) : null;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalObjectToStringConverterFactory.java`
#### Snippet
```java
    }

    enum Java8OptionalLongStringConverter implements Converter<java.util.OptionalLong, String> {
        INSTANCE;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalObjectToStringConverterFactory.java`
#### Snippet
```java

        @Override
        public String convert(java.util.OptionalDouble value) throws IOException {
            return value.isPresent() ? Double.toString(value.getAsDouble()) : null;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalObjectToStringConverterFactory.java`
#### Snippet
```java
    }

    enum Java8OptionalDoubleStringConverter implements Converter<java.util.OptionalDouble, String> {
        INSTANCE;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalObjectToStringConverterFactory.java`
#### Snippet
```java
        if (rawType == Optional.class) {
            return Optional.of(Java8OptionalStringConverter.INSTANCE);
        } else if (rawType == java.util.OptionalInt.class) {
            return Optional.of(Java8OptionalIntStringConverter.INSTANCE);
        } else if (rawType == java.util.OptionalDouble.class) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalObjectToStringConverterFactory.java`
#### Snippet
```java
        } else if (rawType == java.util.OptionalInt.class) {
            return Optional.of(Java8OptionalIntStringConverter.INSTANCE);
        } else if (rawType == java.util.OptionalDouble.class) {
            return Optional.of(Java8OptionalDoubleStringConverter.INSTANCE);
        } else if (rawType == java.util.OptionalLong.class) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalObjectToStringConverterFactory.java`
#### Snippet
```java
        } else if (rawType == java.util.OptionalDouble.class) {
            return Optional.of(Java8OptionalDoubleStringConverter.INSTANCE);
        } else if (rawType == java.util.OptionalLong.class) {
            return Optional.of(Java8OptionalLongStringConverter.INSTANCE);
        } else if (rawType == com.google.common.base.Optional.class) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalObjectToStringConverterFactory.java`
#### Snippet
```java

        @Override
        public String convert(java.util.OptionalLong value) throws IOException {
            return value.isPresent() ? Long.toString(value.getAsLong()) : null;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `okhttp3` is unnecessary and can be removed
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpClient.java`
#### Snippet
```java

/**
 * An {@link OkHttpClient} that executes {@link okhttp3.Call}s as {@link RemotingOkHttpCall}s in order to retry a class
 * of retryable error states.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/SslSocketFactories.java`
#### Snippet
```java
    /**
     * Returns the first {@link TrustManager} initialized from the given configuration. This is always an
     * {@link javax.net.ssl.X509TrustManager}.
     */
    public static X509TrustManager createX509TrustManager(SslConfiguration config) {
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`b1 = b1 - '0'` could be simplified to 'b1 -= '0''
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
        b1 = chars[position];
        if (b1 >= '0' && b1 <= '9') {
            b1 = b1 - '0';
        } else if (b1 >= 'a' && b1 <= 'f') {
            b1 = b1 - 87; // 87 = 'a' - 10
```

### ReplaceAssignmentWithOperatorAssignment
`b1 = b1 - 87` could be simplified to 'b1 -= 87'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
            b1 = b1 - '0';
        } else if (b1 >= 'a' && b1 <= 'f') {
            b1 = b1 - 87; // 87 = 'a' - 10
        } else if (b1 >= 'A' && b1 <= 'F') {
            b1 = b1 - 55; // 55 = 'A' - 10
```

### ReplaceAssignmentWithOperatorAssignment
`b1 = b1 - 55` could be simplified to 'b1 -= 55'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
            b1 = b1 - 87; // 87 = 'a' - 10
        } else if (b1 >= 'A' && b1 <= 'F') {
            b1 = b1 - 55; // 55 = 'A' - 10
        } else {
            throw new IllegalStateException("Malformed DN: " + dn);
```

### ReplaceAssignmentWithOperatorAssignment
`b2 = b2 - '0'` could be simplified to 'b2 -= '0''
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
        b2 = chars[position + 1];
        if (b2 >= '0' && b2 <= '9') {
            b2 = b2 - '0';
        } else if (b2 >= 'a' && b2 <= 'f') {
            b2 = b2 - 87; // 87 = 'a' - 10
```

### ReplaceAssignmentWithOperatorAssignment
`b2 = b2 - 87` could be simplified to 'b2 -= 87'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
            b2 = b2 - '0';
        } else if (b2 >= 'a' && b2 <= 'f') {
            b2 = b2 - 87; // 87 = 'a' - 10
        } else if (b2 >= 'A' && b2 <= 'F') {
            b2 = b2 - 55; // 55 = 'A' - 10
```

### ReplaceAssignmentWithOperatorAssignment
`b2 = b2 - 55` could be simplified to 'b2 -= 55'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
            b2 = b2 - 87; // 87 = 'a' - 10
        } else if (b2 >= 'A' && b2 <= 'F') {
            b2 = b2 - 55; // 55 = 'A' - 10
        } else {
            throw new IllegalStateException("Malformed DN: " + dn);
```

### ReplaceAssignmentWithOperatorAssignment
`res = res & 0x1F` could be simplified to 'res \&= 0x1F'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
            if (res <= 223) { // two bytes: C0-DF
                count = 1;
                res = res & 0x1F;
            } else if (res <= 239) { // three bytes: E0-EF
                count = 2;
```

### ReplaceAssignmentWithOperatorAssignment
`res = res & 0x0F` could be simplified to 'res \&= 0x0F'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
            } else if (res <= 239) { // three bytes: E0-EF
                count = 2;
                res = res & 0x0F;
            } else { // four bytes: F0-F7
                count = 3;
```

### ReplaceAssignmentWithOperatorAssignment
`res = res & 0x07` could be simplified to 'res \&= 0x07'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
            } else { // four bytes: F0-F7
                count = 3;
                res = res & 0x07;
            }

```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `undertow-jakarta-testing/src/main/java/com/palantir/undertest/UndertowServerExtension.java`
#### Snippet
```java
        servletBuilder.addFilters(filters);

        filterUrlMapping.forEach((key, value) -> {
            servletBuilder.addFilterUrlMapping(key, value, DispatcherType.REQUEST);
        });
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new FileFilter() can be replaced with lambda
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/KeyStores.java`
#### Snippet
```java
            Pattern.compile("-----BEGIN CERTIFICATE-----\n?(.+?)\n?-----END CERTIFICATE-----", Pattern.DOTALL);

    private static final FileFilter VISIBLE_FILE_FILTER = new FileFilter() {
        @Override
        public boolean accept(File pathname) {
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/ConjureJerseyFeature.java`
#### Snippet
```java
    public interface ExceptionListener {

        void onException(Throwable throwable);

        /** Invoked in a finally block, so use this to unset any MDC values. */
```

### EmptyMethod
All implementations of this method are empty
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/ConjureJerseyFeature.java`
#### Snippet
```java

        /** Invoked in a finally block, so use this to unset any MDC values. */
        void afterResponseBuilt();
    }

```

### EmptyMethod
All implementations of this method are empty
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/ConjureJerseyFeature.java`
#### Snippet
```java
    public interface ExceptionListener {

        void onException(Throwable throwable);

        /** Invoked in a finally block, so use this to unset any MDC values. */
```

### EmptyMethod
All implementations of this method are empty
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/ConjureJerseyFeature.java`
#### Snippet
```java

        /** Invoked in a finally block, so use this to unset any MDC values. */
        void afterResponseBuilt();
    }

```

### EmptyMethod
The method is empty
in `jetty-http2-agent/src/main/java/com/palantir/conjure/java/http2/Http2Agent.java`
#### Snippet
```java
     */
    @Deprecated
    public static void install() {
        // no-op
    }
```

### EmptyMethod
The method is empty
in `jetty-http2-agent/src/main/java/com/palantir/conjure/java/http2/Http2Agent.java`
#### Snippet
```java
     */
    @Deprecated
    public static void agentmain(String _args, Instrumentation _inst) throws Exception {
        // no-op
    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ExponentialBackoff.java`
#### Snippet
```java
    private final DoubleSupplier random;

    private int retryNumber = 0;

    ExponentialBackoff(int maxNumRetries, Duration backoffSlotSize) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ConcurrencyLimitingInterceptor.java`
#### Snippet
```java
        private final BufferedSource delegate;
        private final Limiter.Listener listener;
        private boolean closed = false;

        private ReleaseConcurrencyLimitProxy(BufferedSource delegate, Limiter.Listener listener) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ThreadWorkQueue.java`
#### Snippet
```java
final class ThreadWorkQueue<T> {
    private final Map<Long, Queue<T>> queuedRequests = new LinkedHashMap<>();
    private int size = 0;

    boolean isEmpty() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ConjureWindowedLimit.java`
#### Snippet
```java

    /** End time for the sampling window at which point the limit should be updated. */
    private volatile long nextUpdateTime = 0;

    private final Object lock = new Object();
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `hostname`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/Okhttp39HostnameVerifier.java`
#### Snippet
```java
    /** Returns true if {@code certificate} matches {@code hostname}. */
    private boolean verifyHostname(String hostname, X509Certificate certificate) {
        hostname = hostname.toLowerCase(Locale.US);
        boolean hasDns = false;
        List<String> altNames = getSubjectAltNames(certificate, ALT_DNS_NAME);
```

### AssignmentToMethodParameter
Assignment to method parameter `hostname`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/Okhttp39HostnameVerifier.java`
#### Snippet
```java
        //   www.android.com. matches www.android.com
        if (!hostname.endsWith(".")) {
            hostname += '.';
        }
        if (!pattern.endsWith(".")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/Okhttp39HostnameVerifier.java`
#### Snippet
```java
        }
        if (!pattern.endsWith(".")) {
            pattern += '.';
        }
        // hostname and pattern are now absolute domain names.
```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/Okhttp39HostnameVerifier.java`
#### Snippet
```java
        // hostname and pattern are now absolute domain names.

        pattern = pattern.toLowerCase(Locale.US);
        // hostname and pattern are now in lower case -- domain names are case-insensitive.

```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/CatchThrowableInterceptor.java`
#### Snippet
```java
            return chain.proceed(chain.request());
        } catch (Throwable t) {
            if (t instanceof IOException) {
                throw (IOException) t;
            }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalDoubleParamConverterProvider.java`
#### Snippet
```java
    public <T> ParamConverter<T> getConverter(
            final Class<T> rawType, final Type _genericType, final Annotation[] _annotations) {
        return OptionalDouble.class.equals(rawType) ? (ParamConverter<T>) paramConverter : null;
    }

```

### ReturnNull
Return of `null`
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/GuavaOptionalParamConverterProvider.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/OffsetDateTimeParamConverterProvider.java`
#### Snippet
```java
    public <T> ParamConverter<T> getConverter(
            final Class<T> rawType, final Type _genericType, final Annotation[] _annotations) {
        return OffsetDateTime.class.equals(rawType) ? (ParamConverter<T>) paramConverter : null;
    }

```

### ReturnNull
Return of `null`
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalIntParamConverterProvider.java`
#### Snippet
```java
    public <T> ParamConverter<T> getConverter(
            final Class<T> rawType, final Type _genericType, final Annotation[] _annotations) {
        return OptionalInt.class.equals(rawType) ? (ParamConverter<T>) paramConverter : null;
    }

```

### ReturnNull
Return of `null`
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/Java8NullOptionalLongExpander.java`
#### Snippet
```java
        checkArgument(value instanceof OptionalLong, "Value must be an OptionalLong. Was: %s", value.getClass());
        OptionalLong optional = (OptionalLong) value;
        return optional.isPresent() ? Long.toString(optional.getAsLong()) : null;
    }
}
```

### ReturnNull
Return of `null`
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/GuavaNullOptionalExpander.java`
#### Snippet
```java
                value.getClass());
        com.google.common.base.Optional<?> optional = (com.google.common.base.Optional<?>) value;
        return optional.isPresent() ? Objects.toString(optional.get()) : null;
    }
}
```

### ReturnNull
Return of `null`
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalLongParamConverterProvider.java`
#### Snippet
```java
    public <T> ParamConverter<T> getConverter(
            final Class<T> rawType, final Type _genericType, final Annotation[] _annotations) {
        return OptionalLong.class.equals(rawType) ? (ParamConverter<T>) paramConverter : null;
    }

```

### ReturnNull
Return of `null`
in `conjure-java-jackson-serialization/src/main/java/com/palantir/conjure/java/serialization/LenientLongModule.java`
#### Snippet
```java
                    return parseLong(jsonParser);
                case VALUE_NULL:
                    return null;
                default:
                    throw new SafeIoException("Expected a long value");
```

### ReturnNull
Return of `null`
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/InstantParamConverterProvider.java`
#### Snippet
```java
    public <T> ParamConverter<T> getConverter(
            final Class<T> rawType, final Type _genericType, final Annotation[] _annotations) {
        return Instant.class.equals(rawType) ? (ParamConverter<T>) paramConverter : null;
    }

```

### ReturnNull
Return of `null`
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/InstantParamConverterProvider.java`
#### Snippet
```java
    public <T> ParamConverter<T> getConverter(
            final Class<T> rawType, final Type _genericType, final Annotation[] _annotations) {
        return Instant.class.equals(rawType) ? (ParamConverter<T>) paramConverter : null;
    }

```

### ReturnNull
Return of `null`
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalLongParamConverterProvider.java`
#### Snippet
```java
    public <T> ParamConverter<T> getConverter(
            final Class<T> rawType, final Type _genericType, final Annotation[] _annotations) {
        return OptionalLong.class.equals(rawType) ? (ParamConverter<T>) paramConverter : null;
    }

```

### ReturnNull
Return of `null`
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/Java8NullOptionalExpander.java`
#### Snippet
```java
        Preconditions.checkArgument(value instanceof Optional, "Value must be an Optional. Was: %s", value.getClass());
        Optional<?> optional = (Optional<?>) value;
        return optional.isPresent() ? Objects.toString(optional.get()) : null;
    }
}
```

### ReturnNull
Return of `null`
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/Java8NullOptionalIntExpander.java`
#### Snippet
```java
        checkArgument(value instanceof OptionalInt, "Value must be an OptionalInt. Was: %s", value.getClass());
        OptionalInt optional = (OptionalInt) value;
        return optional.isPresent() ? Integer.toString(optional.getAsInt()) : null;
    }
}
```

### ReturnNull
Return of `null`
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/OffsetDateTimeParamConverterProvider.java`
#### Snippet
```java
    public <T> ParamConverter<T> getConverter(
            final Class<T> rawType, final Type _genericType, final Annotation[] _annotations) {
        return OffsetDateTime.class.equals(rawType) ? (ParamConverter<T>) paramConverter : null;
    }

```

### ReturnNull
Return of `null`
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/CborDelegateDecoder.java`
#### Snippet
```java
            int firstByte = pushbackInputStream.read();
            if (firstByte == -1) {
                return null; // we don't have any data in the stream
            }
            // put the byte back
```

### ReturnNull
Return of `null`
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/AsyncSerializableErrorCallAdapterFactory.java`
#### Snippet
```java
        Type outerType = getRawType(returnType);
        if (outerType != CompletableFuture.class && outerType != ListenableFuture.class) {
            return null;
        }
        if (!(returnType instanceof ParameterizedType)) {
```

### ReturnNull
Return of `null`
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/AsyncSerializableErrorCallAdapterFactory.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/AsyncSerializableErrorCallAdapterFactory.java`
#### Snippet
```java
            return new CompletableFutureBodyCallAdapter<>(innerType);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/Java8NullOptionalDoubleExpander.java`
#### Snippet
```java
        checkArgument(value instanceof OptionalDouble, "Value must be an OptionalDouble. Was: %s", value.getClass());
        OptionalDouble optional = (OptionalDouble) value;
        return optional.isPresent() ? Double.toString(optional.getAsDouble()) : null;
    }
}
```

### ReturnNull
Return of `null`
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalParamConverterProvider.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalParamConverterProvider.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
        for (; pos < length && chars[pos] == ' '; pos++) {}
        if (pos == length) {
            return null; // reached the end of DN
        }

```

### ReturnNull
Return of `null`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
        String attType = nextAT();
        if (attType == null) {
            return null;
        }
        while (true) {
```

### ReturnNull
Return of `null`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java

            if (pos == length) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java

            if (pos >= length) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesConverterFactory.java`
#### Snippet
```java
            }

            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/GuavaOptionalParamConverterProvider.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalIntParamConverterProvider.java`
#### Snippet
```java
    public <T> ParamConverter<T> getConverter(
            final Class<T> rawType, final Type _genericType, final Annotation[] _annotations) {
        return OptionalInt.class.equals(rawType) ? (ParamConverter<T>) paramConverter : null;
    }

```

### ReturnNull
Return of `null`
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalDoubleParamConverterProvider.java`
#### Snippet
```java
    public <T> ParamConverter<T> getConverter(
            final Class<T> rawType, final Type _genericType, final Annotation[] _annotations) {
        return OptionalDouble.class.equals(rawType) ? (ParamConverter<T>) paramConverter : null;
    }

```

### ReturnNull
Return of `null`
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/ZonedDateTimeParamConverterProvider.java`
#### Snippet
```java
    public <T> ParamConverter<T> getConverter(
            final Class<T> rawType, final Type _genericType, final Annotation[] _annotations) {
        return ZonedDateTime.class.equals(rawType) ? (ParamConverter<T>) paramConverter : null;
    }

```

### ReturnNull
Return of `null`
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/HeaderAccessUtils.java`
#### Snippet
```java
            }
        }
        return neverFound ? null : result;
    }
}
```

### ReturnNull
Return of `null`
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalObjectToStringConverterFactory.java`
#### Snippet
```java
        @Override
        public String convert(java.util.OptionalInt value) throws IOException {
            return value.isPresent() ? Integer.toString(value.getAsInt()) : null;
        }
    }
```

### ReturnNull
Return of `null`
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalObjectToStringConverterFactory.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalObjectToStringConverterFactory.java`
#### Snippet
```java
        @Override
        public String convert(java.util.OptionalDouble value) throws IOException {
            return value.isPresent() ? Double.toString(value.getAsDouble()) : null;
        }
    }
```

### ReturnNull
Return of `null`
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalObjectToStringConverterFactory.java`
#### Snippet
```java
        @Override
        public String convert(java.util.OptionalLong value) throws IOException {
            return value.isPresent() ? Long.toString(value.getAsLong()) : null;
        }
    }
```

### ReturnNull
Return of `null`
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/AuthHeaderParamConverterProvider.java`
#### Snippet
```java
            if (value == null) {
                if (nullable) {
                    return null;
                }
                throw UnauthorizedException.missingCredentials();
```

### ReturnNull
Return of `null`
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/AuthHeaderParamConverterProvider.java`
#### Snippet
```java
                    (hasNullableAnnotation(annotations) ? nullableParamConverter : nonNullParamConverter);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/BearerTokenParamConverterProvider.java`
#### Snippet
```java
            if (value == null) {
                if (nullable) {
                    return null;
                }
                throw UnauthorizedException.missingCredentials();
```

### ReturnNull
Return of `null`
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/AuthHeaderParamConverterProvider.java`
#### Snippet
```java
            if (value == null) {
                if (nullable) {
                    return null;
                }
                throw UnauthorizedException.missingCredentials();
```

### ReturnNull
Return of `null`
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/BearerTokenParamConverterProvider.java`
#### Snippet
```java
                    (hasAnnotation(annotations, Nullable.class) ? nullableParamConverter : nonNullParamConverter);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/AuthHeaderParamConverterProvider.java`
#### Snippet
```java
                    (hasNullableAnnotation(annotations) ? nullableParamConverter : nonNullParamConverter);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/ZonedDateTimeParamConverterProvider.java`
#### Snippet
```java
    public <T> ParamConverter<T> getConverter(
            final Class<T> rawType, final Type _genericType, final Annotation[] _annotations) {
        return ZonedDateTime.class.equals(rawType) ? (ParamConverter<T>) paramConverter : null;
    }

```

### ReturnNull
Return of `null`
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/BearerTokenParamConverterProvider.java`
#### Snippet
```java
                    (hasAnnotation(annotations, Nullable.class) ? nullableParamConverter : nonNullParamConverter);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/BearerTokenParamConverterProvider.java`
#### Snippet
```java
            if (value == null) {
                if (nullable) {
                    return null;
                }
                throw UnauthorizedException.missingCredentials();
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `annotation` is redundant
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/JaxRsJakartaCompatibility.java`
#### Snippet
```java
            }
            if (javax != null) {
                Annotation annotation = element.getAnnotation(javax);
                return annotation;
            }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/InputStreamDelegateDecoder.java`
#### Snippet
```java
        if (type.equals(InputStream.class)) {
            byte[] body =
                    response.body() != null ? Util.toByteArray(response.body().asInputStream()) : new byte[0];
            dangerousBufferingMeter.mark(Math.max(1, body.length));
            return new ByteArrayInputStream(body);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/DialogueFeignClient.java`
#### Snippet
```java
                }
            }
            return new ByteArrayInputStream(new byte[0]);
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `client-config/src/main/java/com/palantir/conjure/java/client/config/CipherSuites.java`
#### Snippet
```java
    /** Union of {@link #fastCipherSuites()} and {@link #gcmCipherSuites()}. */
    public static String[] allCipherSuites() {
        return ALL_CIPHER_SUITES.toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/KeyStores.java`
#### Snippet
```java
            String certPemFileString =
                    privateKeyFilePath.equals(certFilePath) ? keyPemFileString : readFileAsString(certFilePath);
            certificates = getCertificatesFromString(certPemFileString).toArray(new Certificate[0]);
        } catch (IOException | GeneralSecurityException e) {
            throw new RuntimeException(
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/SslSocketFactories.java`
#### Snippet
```java
    public static SSLContext createSslContext(Map<String, PemX509Certificate> trustCertificatesByAlias) {
        TrustManager[] trustManagers = createTrustManagers(trustCertificatesByAlias);
        return createSslContext(trustManagers, new KeyManager[] {});
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/SslSocketFactories.java`
#### Snippet
```java
            Map<String, PemX509Certificate> trustCertificatesByAlias, Provider provider) {
        TrustManager[] trustManagers = createTrustManagers(trustCertificatesByAlias);
        return createSslContext(trustManagers, new KeyManager[] {}, provider);
    }

```

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `RetryOnSocketException` ends with 'Exception'
in `client-config/src/main/java/com/palantir/conjure/java/client/config/ClientConfiguration.java`
#### Snippet
```java
    }

    enum RetryOnSocketException {
        /** Default. */
        ENABLED,
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
                        log.info(
                                "Retrying call after failure",
                                SafeArg.of("backoffMillis", backoff.get().toMillis()),
                                // toString required because this object is mutable, and the logger may
                                // format this value asynchronously.
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
                    RemotingOkHttpCall retryCall = client.newCallWithMutableState(
                            redirectedRequest, backoffStrategy, maxNumRelocations - 1, Optional.of(call));
                    scheduleExecution(backoff.get(), nextAttempt, retryCall, callback);
                });
            }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `client-config/src/main/java/com/palantir/conjure/java/client/config/ClientConfigurations.java`
#### Snippet
```java
    private static Optional<HostAndPort> meshProxy(Optional<ProxyConfiguration> proxy) {
        if (proxy.isPresent() && proxy.get().type() == ProxyConfiguration.Type.MESH) {
            return Optional.of(HostAndPort.fromString(proxy.get().hostAndPort().get()));
        } else {
            return Optional.empty();
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `response.body().byteStream() == null` is always `false`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemoteExceptionResponseHandler.java`
#### Snippet
```java
    public Optional<RemoteException> handle(Response response) {
        if (response.body() == null
                || response.body().byteStream() == null
                || response.isSuccessful()
                || response.code() == MoreHttpCodes.SWITCHING_PROTOCOLS) {
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'tryParse(java.lang.String)' is marked unstable with @Beta
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/DialogueFeignClient.java`
#### Snippet
```java
        public Integer length() {
            return response.getFirstHeader(HttpHeaders.CONTENT_LENGTH)
                    .map(Ints::tryParse)
                    .orElse(null);
        }
```

### UnstableApiUsage
'asMap(com.google.common.collect.Multimap)' is marked unstable with @Beta
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/DialogueFeignClient.java`
#### Snippet
```java
                    response.code(),
                    null,
                    Multimaps.asMap((Multimap<String, String>) response.headers()),
                    new DialogueResponseBody(response));
        }
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DeprecationWarningInterceptor.java`
#### Snippet
```java
    private static final SafeLogger log = SafeLoggerFactory.get(DeprecationWarningInterceptor.class);
    // log at most once per minute
    private final RateLimiter loggingRateLimiter = RateLimiter.create(1.0 / 60.0);
    private final ClientMetrics clientMetrics;
    private final String serviceClassName;
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DeprecationWarningInterceptor.java`
#### Snippet
```java
    private static final SafeLogger log = SafeLoggerFactory.get(DeprecationWarningInterceptor.class);
    // log at most once per minute
    private final RateLimiter loggingRateLimiter = RateLimiter.create(1.0 / 60.0);
    private final ClientMetrics clientMetrics;
    private final String serviceClassName;
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DeprecationWarningInterceptor.java`
#### Snippet
```java
    private static final SafeLogger log = SafeLoggerFactory.get(DeprecationWarningInterceptor.class);
    // log at most once per minute
    private final RateLimiter loggingRateLimiter = RateLimiter.create(1.0 / 60.0);
    private final ClientMetrics clientMetrics;
    private final String serviceClassName;
```

### UnstableApiUsage
'tryAcquire(int)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DeprecationWarningInterceptor.java`
#### Snippet
```java
            clientMetrics.deprecations(serviceClassName).mark();

            if (loggingRateLimiter.tryAcquire(1)) {
                log.warn(
                        "Using a deprecated endpoint when connecting to service",
```

