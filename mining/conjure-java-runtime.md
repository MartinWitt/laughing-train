# conjure-java-runtime 
 
# Bad smells
I found 311 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 115 | false |
| Deprecation | 39 | false |
| JavadocReference | 19 | false |
| DataFlowIssue | 17 | false |
| OptionalUsedAsFieldOrParameterType | 17 | false |
| SimplifyOptionalCallChains | 17 | false |
| JavadocLinkAsPlainText | 13 | false |
| DuplicatedCode | 11 | false |
| UnstableApiUsage | 10 | false |
| EmptyStatementBody | 7 | false |
| OptionalAssignedToNull | 6 | false |
| FieldMayBeFinal | 6 | false |
| DanglingJavadoc | 5 | false |
| DeprecatedIsStillUsed | 4 | false |
| UNCHECKED_WARNING | 3 | false |
| RefusedBequest | 3 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| StringOperationCanBeSimplified | 2 | false |
| RedundantEscapeInRegexReplacement | 2 | false |
| TrivialIf | 2 | false |
| OptionalIsPresent | 1 | false |
| MismatchedArrayReadWrite | 1 | false |
| RegExpRedundantEscape | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| RedundantMethodOverride | 1 | false |
| AutoCloseableResource | 1 | false |
| JavadocDeclaration | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| DuplicateThrows | 1 | false |
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'com.palantir.conjure.java.client.retrofit2.QosExceptionThrowingCallAdapterFactory.QosExceptionThrowingCall' to 'com.palantir.conjure.java.client.retrofit2.QosExceptionThrowingCallAdapterFactory.QosExceptionThrowingCall'
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/QosExceptionThrowingCallAdapterFactory.java`
#### Snippet
```java
        @Override
        public T adapt(Call<R> call) {
            QosExceptionThrowingCall<R> throwingCall = new QosExceptionThrowingCall(call);
            return delegate.adapt(throwingCall);
        }
```

### UNCHECKED_WARNING
Unchecked call to 'QosExceptionThrowingCall(Call)' as a member of raw type 'com.palantir.conjure.java.client.retrofit2.QosExceptionThrowingCallAdapterFactory.QosExceptionThrowingCall'
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/QosExceptionThrowingCallAdapterFactory.java`
#### Snippet
```java
        @Override
        public T adapt(Call<R> call) {
            QosExceptionThrowingCall<R> throwingCall = new QosExceptionThrowingCall(call);
            return delegate.adapt(throwingCall);
        }
```

### UNCHECKED_WARNING
Unchecked call to 'adapt(Call)' as a member of raw type 'retrofit2.CallAdapter'
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java
        public Object adapt(Call<R> call) {
            DefaultingCall<R> defaultingCall = new DefaultingCall<>(call, defaultValue);
            return delegate.adapt(defaultingCall);
        }
    }
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `url` is inaccessible from here
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/UrlSelector.java`
#### Snippet
```java
     * Returns the base URLs that this UrlSelector matches against. Note that implementations should parse web socket
     * (ws:// and ws:///) URLs as http (http:// and https:// respectively), in a similar to how
     * {@link okhttp3.Request#url} does.
     */
    List<HttpUrl> getBaseUrls();
```

### JavadocReference
Symbol `url` is inaccessible from here
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/MeshProxyInterceptor.java`
#### Snippet
```java

/**
 * An {@link Interceptor} that changes the {@link okhttp3.Request#url Request URL's} authority to a given
 * {@link HostAndPort}, and adds an explicit "Host" header that is set to the original Request's authority. This allows
 * the use of a L4 service mesh proxy over SSL.
```

### JavadocReference
Symbol `jakarta.ws.rs.QueryParam` is inaccessible from here
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/Java8OptionalAwareContract.java`
#### Snippet
```java
/**
 * Decorates a {@link Contract} and uses {@link Java8NullOptionalExpander}
 * for any {@link jakarta.ws.rs.QueryParam} parameters,
 * {@link Java8EmptyOptionalExpander} for any {@link jakarta.ws.rs.HeaderParam} parameters,
 * and throws a {@link RuntimeException} at
```

### JavadocReference
Symbol `jakarta.ws.rs.HeaderParam` is inaccessible from here
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/Java8OptionalAwareContract.java`
#### Snippet
```java
 * Decorates a {@link Contract} and uses {@link Java8NullOptionalExpander}
 * for any {@link jakarta.ws.rs.QueryParam} parameters,
 * {@link Java8EmptyOptionalExpander} for any {@link jakarta.ws.rs.HeaderParam} parameters,
 * and throws a {@link RuntimeException} at
 * first encounter of an {@link Optional} typed {@link jakarta.ws.rs.PathParam}.
```

### JavadocReference
Symbol `jakarta.ws.rs.PathParam` is inaccessible from here
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/Java8OptionalAwareContract.java`
#### Snippet
```java
 * {@link Java8EmptyOptionalExpander} for any {@link jakarta.ws.rs.HeaderParam} parameters,
 * and throws a {@link RuntimeException} at
 * first encounter of an {@link Optional} typed {@link jakarta.ws.rs.PathParam}.
 *
 * <p>{@link jakarta.ws.rs.PathParam}s require a value, and so we explicitly disallow use with {@link Optional}.
```

### JavadocReference
Symbol `jakarta.ws.rs.PathParam` is inaccessible from here
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/Java8OptionalAwareContract.java`
#### Snippet
```java
 * first encounter of an {@link Optional} typed {@link jakarta.ws.rs.PathParam}.
 *
 * <p>{@link jakarta.ws.rs.PathParam}s require a value, and so we explicitly disallow use with {@link Optional}.
 */
public final class Java8OptionalAwareContract extends AbstractDelegatingContract {
```

### JavadocReference
Cannot resolve symbol `com.netflix.concurrency.limits.limit.ImmutableSampleWindow`
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ImmutableSampleWindow.java`
#### Snippet
```java
 * Class used to track immutable samples in an AtomicReference.
 *
 * <p>Changes made to {@link com.netflix.concurrency.limits.limit.ImmutableSampleWindow}
 *
 * <p>1. Package was changed. 2. Fields made private. 3. Fixed a typo (getAverateRttNanos -> getAverageRttNanos)
```

### JavadocReference
Symbol `retrofit2.OkHttpCall` is inaccessible from here
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesConverterFactory.java`
#### Snippet
```java
 * collection.
 *
 * <p>Note that {@link retrofit2.OkHttpCall#parseResponse(Response)} does not call this ConverterFactory if the response
 * is 204 or 205 - those cases are handled by {@link CoerceNullCollectionsCallAdapterFactory}.
 *
```

### JavadocReference
Symbol `parseResponse(Response)` is inaccessible from here
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesConverterFactory.java`
#### Snippet
```java
 * collection.
 *
 * <p>Note that {@link retrofit2.OkHttpCall#parseResponse(Response)} does not call this ConverterFactory if the response
 * is 204 or 205 - those cases are handled by {@link CoerceNullCollectionsCallAdapterFactory}.
 *
```

### JavadocReference
Cannot resolve symbol `CoerceNullCollectionsCallAdapterFactory`
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesConverterFactory.java`
#### Snippet
```java
 *
 * <p>Note that {@link retrofit2.OkHttpCall#parseResponse(Response)} does not call this ConverterFactory if the response
 * is 204 or 205 - those cases are handled by {@link CoerceNullCollectionsCallAdapterFactory}.
 *
 * <p>(Jackson can only do this coercion for fields inside an object, but for top-level fields we have to do this
```

### JavadocReference
Symbol `retrofit2.OkHttpCall` is inaccessible from here
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java
 * <p>This class is the counterpart of {@link CoerceNullValuesConverterFactory} and handles coercion of 204/205
 * responses to the default values for collections (without this, the {@link Response} body would be null, according to
 * {@link retrofit2.OkHttpCall#parseResponse(okhttp3.Response)}).
 */
// TODO(dsanduleac): link to spec
```

### JavadocReference
Symbol `parseResponse(okhttp3.Response)` is inaccessible from here
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java
 * <p>This class is the counterpart of {@link CoerceNullValuesConverterFactory} and handles coercion of 204/205
 * responses to the default values for collections (without this, the {@link Response} body would be null, according to
 * {@link retrofit2.OkHttpCall#parseResponse(okhttp3.Response)}).
 */
// TODO(dsanduleac): link to spec
```

### JavadocReference
Symbol `retrofit2.OkHttpCall` is inaccessible from here
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java
    /**
     * A {@link retrofit2.Call} that returns a default if the result coming out of the delegate call (probably
     * {@link retrofit2.OkHttpCall}) is null.
     */
    private static final class DefaultingCall<R> implements Call<R> {
```

### JavadocReference
Symbol `retrofit2.DefaultCallAdapterFactory` is inaccessible from here
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java
    }

    /** This is essentially {@link retrofit2.DefaultCallAdapterFactory} but we can't access it. */
    private static final class IdentityCallAdapter implements CallAdapter<Object, Object> {
        private Type responseType;
```

### JavadocReference
Symbol `jakarta.ws.rs.QueryParam` is inaccessible from here
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/GuavaOptionalAwareContract.java`
#### Snippet
```java
/**
 * Decorates a {@link Contract} and uses {@link GuavaNullOptionalExpander} for
 * any {@link jakarta.ws.rs.QueryParam} parameters,
 * {@link GuavaEmptyOptionalExpander} for any {@link jakarta.ws.rs.HeaderParam} parameters,
 * and throws a {@link RuntimeException} at
```

### JavadocReference
Symbol `jakarta.ws.rs.HeaderParam` is inaccessible from here
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/GuavaOptionalAwareContract.java`
#### Snippet
```java
 * Decorates a {@link Contract} and uses {@link GuavaNullOptionalExpander} for
 * any {@link jakarta.ws.rs.QueryParam} parameters,
 * {@link GuavaEmptyOptionalExpander} for any {@link jakarta.ws.rs.HeaderParam} parameters,
 * and throws a {@link RuntimeException} at
 * first encounter of an {@link com.google.common.base.Optional} typed {@link jakarta.ws.rs.PathParam}.
```

### JavadocReference
Symbol `jakarta.ws.rs.PathParam` is inaccessible from here
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/GuavaOptionalAwareContract.java`
#### Snippet
```java
 * {@link GuavaEmptyOptionalExpander} for any {@link jakarta.ws.rs.HeaderParam} parameters,
 * and throws a {@link RuntimeException} at
 * first encounter of an {@link com.google.common.base.Optional} typed {@link jakarta.ws.rs.PathParam}.
 *
 * <p>{@link jakarta.ws.rs.PathParam}s require a value, and so we explicitly disallow use with
```

### JavadocReference
Symbol `jakarta.ws.rs.PathParam` is inaccessible from here
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/GuavaOptionalAwareContract.java`
#### Snippet
```java
 * first encounter of an {@link com.google.common.base.Optional} typed {@link jakarta.ws.rs.PathParam}.
 *
 * <p>{@link jakarta.ws.rs.PathParam}s require a value, and so we explicitly disallow use with
 * {@link com.google.common.base.Optional}.
 */
```

### JavadocReference
Symbol `okhttp3.RealCall` is inaccessible from here
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/CatchThrowableInterceptor.java`
#### Snippet
```java

/**
 * {@link okhttp3.RealCall#execute()} only catches IOExceptions, which means that any non-IOException eventually mean
 * the {@link okhttp3.Dispatcher} runs out of threads and can't make *any* outgoing requests.
 *
```

## RuleId[id=DataFlowIssue]
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
            public void onFailure(Call call, IOException exception) {
                try {
                    call.request().tag(Tags.EntireSpan.class).get().complete();
                } finally {
                    callback.onFailure(call, exception);
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
Dereference of `args` may produce `NullPointerException`
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/WebPreconditions.java`
#### Snippet
```java

        // start substituting the arguments into the '%s' placeholders
        StringBuilder builder = new StringBuilder(nonNullTemplate.length() + 16 * args.length);
        int templateStart = 0;
        int index = 0;
```

## RuleId[id=EmptyStatementBody]
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
        // attribute type chars
        pos++;
        for (; pos < length && chars[pos] != '=' && chars[pos] != ' '; pos++) {
            // we don't follow exact BNF syntax here:
            // accept any char except space and '='
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
Deprecated member 'HostEventCallback' is still used
in `conjure-java-legacy-clients/src/main/java/com/palantir/conjure/java/okhttp/HostEventsSink.java`
#### Snippet
```java
     */
    @Deprecated
    interface HostEventCallback extends com.palantir.conjure.java.client.config.HostEventsSink.HostEventCallback {

        @Override
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
Deprecated member 'WebPreconditions' is still used
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/WebPreconditions.java`
#### Snippet
```java
 */
@Deprecated
public final class WebPreconditions {

    private WebPreconditions() {}
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
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java
        @SuppressWarnings({"checkstyle:NoClone", "checkstyle:SuperClone"})
        @Override
        public Call<R> clone() {
            return new DefaultingCall<>(delegate.clone(), defaultValue);
        }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/ConjureJerseyFeature.java`
#### Snippet
```java
context.register(new NoContentExceptionMapper());
        context.register(new IllegalArgumentExceptionMapper(exceptionListener));
        context.register(new RetryableExceptionMapper(exceptionListener));
        context.register(new RuntimeExceptionMapper(exceptionListener));
        context.register(new WebApplicationExceptionMapper(exceptionListener));
        context.register(new RemoteExceptionMapper(exceptionListener));
        context.register(new ServiceExceptionMapper(exceptionListener));
        context.register(new QosExceptionMapper(exceptionListener));
        context.register(new ThrowableExceptionMapper(exceptionListener));
        JacksonExceptionMappers.configure(context, exceptionListener);

        // Cbor handling
        context.register(new JacksonCBORProvider(ObjectMappers.newServerCborMapper()));

        // Auth handling
        context.register(AuthHeaderParamConverterProvider.class);
        context.register(BearerTokenParamConverterProvider.class);

        // Optional handling
        context.register(GuavaOptionalMessageBodyWriter.class);
        context.register(GuavaOptionalParamConverterProvider.class);
        context.register(Java8OptionalMessageBodyWriter.class);
        context.register(Java8OptionalParamConverterProvider.class);
        context.register(Java8OptionalIntMessageBodyWriter.class);
        context.register(Java8OptionalIntParamConverterProvider.class);
        context.register(Java8OptionalDoubleMessageBodyWriter.class);
        context.register(Java8OptionalDoubleParamConverterProvider.class);
        context.register(Java8OptionalLongMessageBodyWriter.class);
        context.register(Java8OptionalLongParamConverterProvider.class);

        // DateTime handling
        context.register(InstantParamConverterProvider.class);
        context.register(ZonedDateTimeParamConverterProvider.class);
        context.register(OffsetDateTimeParamConverterProvider.class);

        // Tracing
        context.register(new TraceEnrichingFilter());

        // Deprecation
        context.register(DeprecationReportingResponseFeature.INSTANCE);

        return true;
```

### DuplicatedCode
Duplicated code
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/GuavaOptionalMessageBodyWriter.java`
#### Snippet
```java
        if (!entity.isPresent()) {
            throw new NoContentException("Absent value for type: " + genericType);
        }

        Type innerGenericType = (genericType instanceof ParameterizedType)
                ? ((ParameterizedType) genericType).getActualTypeArguments()[0]
                : entity.get().getClass();

        MessageBodyWriter writer =
                mbw.get().getMessageBodyWriter(entity.get().getClass(), innerGenericType, annotations, mediaType);

        writer.writeTo(
                entity.get(),
                entity.get().getClass(),
                innerGenericType,
                annotations,
                mediaType,
                httpHeaders,
                entityStream);
```

### DuplicatedCode
Duplicated code
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/GuavaOptionalParamConverterProvider.java`
#### Snippet
```java
        if (com.google.common.base.Optional.class.equals(rawType)) {
            final List<ClassTypePair> ctps = ReflectionHelper.getTypeArgumentAndClass(genericType);
            final ClassTypePair ctp = (ctps.size() == 1) ? ctps.get(0) : null;

            if (ctp == null || ctp.rawClass() == String.class) {
                return new ParamConverter<T>() {
                    @Override
                    public T fromString(final String value) {
                        return rawType.cast(com.google.common.base.Optional.fromNullable(value));
                    }

                    @Override
                    public String toString(final T value) {
                        return value.toString();
                    }
                };
            }

            for (ParamConverterProvider provider :
                    Providers.getProviders(injectionManager, ParamConverterProvider.class)) {
                final ParamConverter<?> converter = provider.getConverter(ctp.rawClass(), ctp.type(), annotations);
                if (converter != null) {
                    return new ParamConverter<T>() {
                        @Override
                        public T fromString(final String value) {
                            return rawType.cast(com.google.common.base.Optional.fromNullable(value)
                                    .transform(converter::fromString));
                        }

                        @Override
                        public String toString(final T value) {
                            return value.toString();
                        }
                    };
                }
            }
        }

        return null;
```

### DuplicatedCode
Duplicated code
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/Java8OptionalParamConverterProvider.java`
#### Snippet
```java
        if (Optional.class.equals(rawType)) {
            final List<ClassTypePair> ctps = ReflectionHelper.getTypeArgumentAndClass(genericType);
            final ClassTypePair ctp = (ctps.size() == 1) ? ctps.get(0) : null;

            if (ctp == null || ctp.rawClass() == String.class) {
                return new ParamConverter<T>() {
                    @Override
                    public T fromString(final String value) {
                        return rawType.cast(Optional.ofNullable(value));
                    }

                    @Override
                    public String toString(final T value) {
                        return value.toString();
                    }
                };
            }

            for (ParamConverterProvider provider :
                    Providers.getProviders(injectionManager, ParamConverterProvider.class)) {
                final ParamConverter<?> converter = provider.getConverter(ctp.rawClass(), ctp.type(), annotations);
                if (converter != null) {
                    return new ParamConverter<T>() {
                        @Override
                        public T fromString(final String value) {
                            return rawType.cast(Optional.ofNullable(value).map(converter::fromString));
                        }

                        @Override
                        public String toString(final T value) {
                            return value.toString();
                        }
                    };
                }
            }
        }

        return null;
```

### DuplicatedCode
Duplicated code
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/JsonExceptionMapper.java`
#### Snippet
```java
        String errorInstanceId = UUID.randomUUID().toString();
        ErrorType errorType = getErrorType(exception);

        if (errorType.httpErrorCode() / 100 == 4 /* client error */) {
            log.info(
                    "Error handling request. {}: {}",
                    SafeArg.of("errorName", errorType.name()),
                    SafeArg.of("errorInstanceId", errorInstanceId),
                    exception);
        } else {
            log.error(
                    "Error handling request. {}: {}",
                    SafeArg.of("errorName", errorType.name()),
                    SafeArg.of("errorInstanceId", errorInstanceId),
                    exception);
        }

        return createResponse(errorType, errorInstanceId);
```

### DuplicatedCode
Duplicated code
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/QosExceptionMapper.java`
#### Snippet
```java
        log.debug("Possible quality-of-service intervention", qosException);

        return qosException.accept(new QosException.Visitor<Response>() {
            @Override
            public Response visit(QosException.Throttle exception) {
                Response.ResponseBuilder response = Response.status(429);
                exception
                        .getRetryAfter()
                        .ifPresent(duration -> response.header(
                                HttpHeaders.RETRY_AFTER, Long.toString(duration.get(ChronoUnit.SECONDS))));
                return response.build();
            }

            @Override
            public Response visit(QosException.RetryOther exception) {
                return Response.status(308)
                        .header(HttpHeaders.LOCATION, exception.getRedirectTo().toString())
                        .build();
            }

            @Override
            public Response visit(QosException.Unavailable _exception) {
                return Response.status(503).build();
            }
        });
```

### DuplicatedCode
Duplicated code
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/RemoteExceptionMapper.java`
#### Snippet
```java
        if (exception.getStatus() == 401 || exception.getStatus() == 403) {
            log.info(
                    "Encountered a remote exception",
                    SafeArg.of("errorInstanceId", exception.getError().errorInstanceId()),
                    SafeArg.of("errorName", exception.getError().errorName()),
                    SafeArg.of("statusCode", exception.getStatus()),
                    exception);

            return Response.status(exception.getStatus())
                    .type(MediaType.APPLICATION_JSON)
                    .entity(SerializableError.builder()
                            .errorCode(exception.getError().errorCode())
                            .errorName(exception.getError().errorName())
                            .errorInstanceId(exception.getError().errorInstanceId())
                            .build())
                    .build();
        } else {
            log.warn(
                    "Encountered a remote exception. Mapping to an internal error before propagating",
                    SafeArg.of("errorInstanceId", exception.getError().errorInstanceId()),
                    SafeArg.of("errorName", exception.getError().errorName()),
                    SafeArg.of("statusCode", exception.getStatus()),
                    exception);

            ServiceException propagatedException = new ServiceException(ErrorType.INTERNAL, exception);
            return Response.status(propagatedException.getErrorType().httpErrorCode())
                    .type(MediaType.APPLICATION_JSON)
                    .entity(SerializableError.forException(propagatedException))
                    .build();
        }
```

### DuplicatedCode
Duplicated code
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/ServiceExceptionMapper.java`
#### Snippet
```java
        int httpStatus = exception.getErrorType().httpErrorCode();
        if (httpStatus / 100 == 4 /* client error */) {
            log.info(
                    "Error handling request",
                    SafeArg.of("errorInstanceId", exception.getErrorInstanceId()),
                    SafeArg.of("errorName", exception.getErrorType().name()),
                    exception);
        } else {
            log.error(
                    "Error handling request",
                    SafeArg.of("errorInstanceId", exception.getErrorInstanceId()),
                    SafeArg.of("errorName", exception.getErrorType().name()),
                    exception);
        }

        return Response.status(httpStatus)
                .type(MediaType.APPLICATION_JSON)
                .entity(SerializableError.forException(exception))
                .build();
```

### DuplicatedCode
Duplicated code
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/WebApplicationExceptionMapper.java`
#### Snippet
```java
        String errorInstanceId = UUID.randomUUID().toString();

        if (exception.getResponse().getStatusInfo().getFamily() == Response.Status.Family.SERVER_ERROR) {
            log.error("Error handling request", SafeArg.of("errorInstanceId", errorInstanceId), exception);
        } else {
            log.info("Error handling request", SafeArg.of("errorInstanceId", errorInstanceId), exception);
        }

        if (exception instanceof NotAuthorizedException) {
            return JsonExceptionMapper.createResponse(ErrorType.UNAUTHORIZED, errorInstanceId);
        } else if (exception instanceof UnauthorizedException) {
            return JsonExceptionMapper.createResponse(
                    ((UnauthorizedException) exception).getErrorType(), errorInstanceId);
        } else if (exception instanceof ForbiddenException) {
            return JsonExceptionMapper.createResponse(ErrorType.PERMISSION_DENIED, errorInstanceId);
        } else if (exception instanceof NotFoundException) {
            return JsonExceptionMapper.createResponse(ErrorType.NOT_FOUND, errorInstanceId);
        } else if (exception instanceof BadRequestException || exception instanceof ParamException) {
            return JsonExceptionMapper.createResponse(ErrorType.INVALID_ARGUMENT, errorInstanceId);
        } else {
            return JsonExceptionMapper.createResponse(
                    exception.getResponse().getStatus(),
                    exception.getClass().getName(),
                    exception.getClass().getSimpleName(),
                    errorInstanceId);
        }
```

### DuplicatedCode
Duplicated code
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/WebPreconditions.java`
#### Snippet
```java
        String nonNullTemplate = String.valueOf(template); // null -> "null"

        // start substituting the arguments into the '%s' placeholders
        StringBuilder builder = new StringBuilder(nonNullTemplate.length() + 16 * args.length);
        int templateStart = 0;
        int index = 0;
        while (index < args.length) {
            int placeholderStart = nonNullTemplate.indexOf("%s", templateStart);
            if (placeholderStart == -1) {
                break;
            }
            builder.append(nonNullTemplate.substring(templateStart, placeholderStart));
            builder.append(args[index++]);
            templateStart = placeholderStart + 2;
        }
        builder.append(nonNullTemplate.substring(templateStart));

        // if we run out of placeholders, append the extra args in square braces
        if (index < args.length) {
            builder.append(" [");
            builder.append(args[index++]);
            while (index < args.length) {
                builder.append(", ");
                builder.append(args[index++]);
            }
            builder.append(']');
        }

        return builder.toString();
```

### DuplicatedCode
Duplicated code
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
        if (b1 >= '0' && b1 <= '9') {
            b1 = b1 - '0';
        } else if (b1 >= 'a' && b1 <= 'f') {
            b1 = b1 - 87; // 87 = 'a' - 10
        } else if (b1 >= 'A' && b1 <= 'F') {
            b1 = b1 - 55; // 55 = 'A' - 10
        } else {
            throw new IllegalStateException("Malformed DN: " + dn);
        }
```

## RuleId[id=Deprecation]
### Deprecation
'com.palantir.conjure.java.okhttp.HostEventsSink.HostEventCallback' is deprecated
in `conjure-java-legacy-clients/src/main/java/com/palantir/conjure/java/okhttp/HostMetricsRegistry.java`
#### Snippet
```java
    }

    private final class HostEventRegistryCallback implements HostEventCallback {

        private final ServiceHostAndPort target;
```

### Deprecation
'com.palantir.conjure.java.okhttp.HostEventsSink.HostEventCallback' is deprecated
in `conjure-java-legacy-clients/src/main/java/com/palantir/conjure/java/okhttp/HostMetricsRegistry.java`
#### Snippet
```java

    @Override
    public HostEventCallback callback(String serviceName, String hostname, int port) {
        return new HostEventRegistryCallback(serviceName, hostname, port);
    }
```

### Deprecation
'com.palantir.conjure.java.okhttp.HostEventsSink' is deprecated
in `conjure-java-legacy-clients/src/main/java/com/palantir/conjure/java/okhttp/HostMetricsRegistry.java`
#### Snippet
```java
import org.immutables.value.Value;

public final class HostMetricsRegistry implements HostEventsSink {

    private static final SafeLogger log = SafeLoggerFactory.get(HostMetricsRegistry.class);
```

### Deprecation
'com.palantir.conjure.java.okhttp.HostEventsSink' is deprecated
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/Retrofit2Client.java`
#### Snippet
```java
     */
    public static <T> T create(
            Class<T> serviceClass, UserAgent userAgent, HostEventsSink hostEventsSink, ClientConfiguration config) {
        return new Retrofit2ClientBuilder(config).hostEventsSink(hostEventsSink).build(serviceClass, userAgent);
    }
```

### Deprecation
'fallbackToCommonNameVerification()' is deprecated
in `client-config/src/main/java/com/palantir/conjure/java/client/config/ClientConfiguration.java`
#### Snippet
```java
    Optional<Boolean> enableHttp2();

    /** See {@link PartialServiceConfiguration#fallbackToCommonNameVerification}. */
    boolean fallbackToCommonNameVerification();

```

### Deprecation
'com.palantir.conjure.java.okhttp.HostEventsSink' is deprecated
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/JaxRsClient.java`
#### Snippet
```java
     */
    public static <T> T create(
            Class<T> serviceClass, UserAgent userAgent, HostEventsSink hostEventsSink, ClientConfiguration config) {
        return new FeignJaxRsClientBuilder(config)
                .hostEventsSink(hostEventsSink)
```

### Deprecation
'mappingException(java.lang.Class, com.fasterxml.jackson.core.JsonToken)' is deprecated
in `conjure-java-jackson-serialization/src/main/java/com/palantir/conjure/java/serialization/PathDeserializer.java`
#### Snippet
```java
            // 16-Oct-2015: should we perhaps allow JSON Arrays (of Strings) as well?
        }
        throw ctxt.mappingException(Path.class, token);
    }
}
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/SslSocketFactories.java`
#### Snippet
```java
            return keyManagerFactory;
        } catch (GeneralSecurityException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/SslSocketFactories.java`
#### Snippet
```java
            return trustManagerFactory;
        } catch (GeneralSecurityException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/SslSocketFactories.java`
#### Snippet
```java
            return sslContext;
        } catch (GeneralSecurityException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/SslSocketFactories.java`
#### Snippet
```java
            return sslContext;
        } catch (GeneralSecurityException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/SslSocketFactories.java`
#### Snippet
```java
            return trustManagerFactory.getTrustManagers();
        } catch (NoSuchAlgorithmException | KeyStoreException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'execute(org.apache.hc.core5.http.HttpHost, org.apache.hc.core5.http.ClassicHttpRequest)' is deprecated
in `undertow-jakarta-testing/src/main/java/com/palantir/undertest/UndertowServerExtension.java`
#### Snippet
```java
    @CheckReturnValue
    public CloseableHttpResponse makeRequest(ClassicHttpRequest request) throws IOException {
        return httpClient.execute(HttpHost.create(URI.create("http://localhost:" + getLocalPort())), request);
    }

```

### Deprecation
'configureAbsentsAsNulls(boolean)' is deprecated
in `conjure-java-jackson-serialization/src/main/java/com/palantir/conjure/java/serialization/ObjectMappers.java`
#### Snippet
```java
                .addModule(new GuavaModule())
                .addModule(new ShimJdk7Module())
                .addModule(new Jdk8Module().configureAbsentsAsNulls(true))
                .addModules(ObjectMapperOptimizations.createModules())
                .addModule(new JavaTimeModule())
```

### Deprecation
'configureAbsentsAsNulls(boolean)' is deprecated
in `conjure-java-jackson-serialization/src/main/java/com/palantir/conjure/java/serialization/ObjectMappers.java`
#### Snippet
```java
                .registerModule(new GuavaModule())
                .registerModule(new ShimJdk7Module())
                .registerModule(new Jdk8Module().configureAbsentsAsNulls(true))
                .registerModules(ObjectMapperOptimizations.createModules())
                .registerModule(new JavaTimeModule())
```

### Deprecation
'disable(com.fasterxml.jackson.databind.MapperFeature...)' is deprecated
in `conjure-java-jackson-serialization/src/main/java/com/palantir/conjure/java/serialization/ObjectMappers.java`
#### Snippet
```java
                .disable(SerializationFeature.FAIL_ON_EMPTY_BEANS)
                .enable(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)
                .disable(MapperFeature.ALLOW_COERCION_OF_SCALARS)
                .disable(DeserializationFeature.ACCEPT_FLOAT_AS_INT);
    }
```

### Deprecation
'com.palantir.conjure.java.okhttp.HostEventsSink' is deprecated
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/AbstractFeignJaxRsClientBuilder.java`
#### Snippet
```java
    private final ClientConfiguration config;

    private HostEventsSink hostEventsSink;

    AbstractFeignJaxRsClientBuilder(ClientConfiguration config) {
```

### Deprecation
'com.palantir.conjure.java.okhttp.HostEventsSink' is deprecated
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/AbstractFeignJaxRsClientBuilder.java`
#### Snippet
```java

    /** Set the host metrics registry to use when constructing the OkHttp client. */
    final AbstractFeignJaxRsClientBuilder hostEventsSink(HostEventsSink newHostEventsSink) {
        Preconditions.checkNotNull(newHostEventsSink, "hostEventsSink can't be null");
        hostEventsSink = newHostEventsSink;
```

### Deprecation
'channelFactory(com.palantir.dialogue.core.ChannelFactory)' is deprecated
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/AbstractFeignJaxRsClientBuilder.java`
#### Snippet
```java
        Channel channel = DialogueChannel.builder()
                .channelName(name)
                .channelFactory(uri -> ApacheHttpClientChannels.createSingleUri(uri, client))
                .clientConfiguration(hydratedConfiguration)
                .buildNonLiveReloading();
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/KeyStores.java`
#### Snippet
```java
            keyStore.load(null, null);
        } catch (GeneralSecurityException | IOException e) {
            throw Throwables.propagate(e);
        }
        return keyStore;
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/KeyStores.java`
#### Snippet
```java
            return keyStore;
        } catch (GeneralSecurityException | IOException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/KeyStores.java`
#### Snippet
```java
                addCertificatesToKeystore(keyStore, entry.getKey(), readX509Certificates(certIn));
            } catch (IOException e) {
                throw Throwables.propagate(e);
            } catch (KeyStoreException | CertificateException e) {
                throw new RuntimeException(
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/KeyStores.java`
#### Snippet
```java
            return keyStore;
        } catch (GeneralSecurityException | IOException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `keystores/src/main/java/com/palantir/conjure/java/config/ssl/KeyStores.java`
#### Snippet
```java
            return newKeyStore;
        } catch (GeneralSecurityException | IOException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'com.palantir.conjure.java.okhttp.HostEventsSink' is deprecated
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/Retrofit2ClientBuilder.java`
#### Snippet
```java
                config,
                userAgent,
                config.hostEventsSink().map(HostEventsSink::from).orElse(NoOpHostEventsSink.INSTANCE),
                serviceClass);

```

### Deprecation
'com.palantir.conjure.java.okhttp.HostEventsSink' is deprecated
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/Retrofit2ClientBuilder.java`
#### Snippet
```java

    /** Set the host metrics registry to use when constructing the OkHttp client. */
    public Retrofit2ClientBuilder hostEventsSink(HostEventsSink newHostEventsSink) {
        Preconditions.checkNotNull(newHostEventsSink, "hostEventsSink can't be null");
        config = ClientConfiguration.builder()
```

### Deprecation
'com.palantir.conjure.java.okhttp.HostEventsSink' is deprecated
in `conjure-scala-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/JaxRsScalaClient.java`
#### Snippet
```java
            Class<T> serviceClass,
            UserAgent userAgent,
            HostEventsSink hostEventsSink,
            Refreshable<ClientConfiguration> config) {
        return Reflection.newProxy(
```

### Deprecation
'com.palantir.conjure.java.ext.refresh.Refreshable' is deprecated
in `conjure-scala-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/JaxRsScalaClient.java`
#### Snippet
```java
            UserAgent userAgent,
            HostEventsSink hostEventsSink,
            Refreshable<ClientConfiguration> config) {
        return Reflection.newProxy(
                serviceClass,
```

### Deprecation
'com.palantir.conjure.java.ext.refresh.RefreshableProxyInvocationHandler' is deprecated
in `conjure-scala-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/JaxRsScalaClient.java`
#### Snippet
```java
        return Reflection.newProxy(
                serviceClass,
                RefreshableProxyInvocationHandler.create(
                        config,
                        serviceConfiguration -> create(serviceClass, userAgent, hostEventsSink, serviceConfiguration)));
```

### Deprecation
'com.palantir.conjure.java.okhttp.HostEventsSink' is deprecated
in `conjure-scala-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/JaxRsScalaClient.java`
#### Snippet
```java
    /** See {@link JaxRsClient}. */
    public static <T> T create(
            Class<T> serviceClass, UserAgent userAgent, HostEventsSink hostEventsSink, ClientConfiguration config) {
        return new FeignJaxRsScalaClientBuilder(config)
                .hostEventsSink(hostEventsSink)
```

### Deprecation
'getSingleton()' is deprecated
in `client-config/src/main/java/com/palantir/conjure/java/client/config/ClientConfigurations.java`
#### Snippet
```java
                .retryOnTimeout(RETRY_ON_TIMEOUT_DEFAULT)
                .retryOnSocketException(RETRY_ON_SOCKET_EXCEPTION_DEFAULT)
                .taggedMetricRegistry(SharedTaggedMetricRegistries.getSingleton())
                .build();
    }
```

### Deprecation
'getSingleton()' is deprecated
in `client-config/src/main/java/com/palantir/conjure/java/client/config/ClientConfigurations.java`
#### Snippet
```java
                .retryOnTimeout(RETRY_ON_TIMEOUT_DEFAULT)
                .retryOnSocketException(RETRY_ON_SOCKET_EXCEPTION_DEFAULT)
                .taggedMetricRegistry(SharedTaggedMetricRegistries.getSingleton())
                .userAgent(userAgent)
                .build();
```

### Deprecation
Overrides deprecated method in 'com.fasterxml.jackson.core.JsonParser'
in `conjure-java-jackson-serialization/src/main/java/com/palantir/conjure/java/serialization/InstrumentedJsonFactory.java`
#### Snippet
```java
        @Override
        @Deprecated
        public JsonParser setFeatureMask(int mask) {
            delegate.setFeatureMask(mask);
            return this;
```

### Deprecation
'com.palantir.conjure.java.okhttp.HostEventsSink' is deprecated
in `conjure-java-legacy-clients/src/main/java/com/palantir/conjure/java/okhttp/NoOpHostEventsSink.java`
#### Snippet
```java
package com.palantir.conjure.java.okhttp;

/** A no-op implementation of {@link HostEventsSink} - i.e. it discards all events. */
public enum NoOpHostEventsSink implements HostEventsSink {
    INSTANCE;
```

### Deprecation
'com.palantir.conjure.java.okhttp.HostEventsSink' is deprecated
in `conjure-java-legacy-clients/src/main/java/com/palantir/conjure/java/okhttp/NoOpHostEventsSink.java`
#### Snippet
```java

/** A no-op implementation of {@link HostEventsSink} - i.e. it discards all events. */
public enum NoOpHostEventsSink implements HostEventsSink {
    INSTANCE;

```

### Deprecation
Overrides deprecated method in 'com.fasterxml.jackson.databind.type.TypeFactory'
in `conjure-java-jackson-serialization/src/main/java/com/palantir/conjure/java/serialization/NonCachingTypeFactory.java`
#### Snippet
```java

    @Override
    public NonCachingTypeFactory withCache(LRUMap<Object, JavaType> _cache) {
        // Changes to the cache are ignored
        return this;
```

### Deprecation
'com.palantir.conjure.java.okhttp.HostEventsSink' is deprecated
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/OkHttpClients.java`
#### Snippet
```java
    @VisibleForTesting
    static RemotingOkHttpClient withStableUris(
            ClientConfiguration config, HostEventsSink hostEventsSink, Class<?> serviceClass) {
        return createInternal(
                new OkHttpClient.Builder(),
```

### Deprecation
'com.palantir.conjure.java.okhttp.HostEventsSink' is deprecated
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/OkHttpClients.java`
#### Snippet
```java
     */
    public static OkHttpClient create(
            ClientConfiguration config, UserAgent userAgent, HostEventsSink hostEventsSink, Class<?> serviceClass) {
        return create(new OkHttpClient.Builder(), config, userAgent, hostEventsSink, serviceClass);
    }
```

### Deprecation
'com.palantir.conjure.java.okhttp.HostEventsSink' is deprecated
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/OkHttpClients.java`
#### Snippet
```java
            ClientConfiguration config,
            UserAgent userAgent,
            HostEventsSink hostEventsSink,
            Class<?> serviceClass) {
        boolean reshuffle =
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

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ConcurrencyLimiters.java`
#### Snippet
```java
    Limit newLimit() {
        return new ConjureWindowedLimit(AIMDLimit.newBuilder()
                /**
                 * Requests slower than this timeout are treated as failures, which reduce concurrency. Since we have
                 * plenty of long streaming requests, we set this timeout to 292.27726 years to effectively turn it off.
```

### DanglingJavadoc
Dangling Javadoc comment
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ConcurrencyLimiters.java`
#### Snippet
```java
                 */
                .timeout(Long.MAX_VALUE, TimeUnit.NANOSECONDS)
                /**
                 * Our initial limit is pretty conservative - only 10 concurrent requests in flight at the same time. If
                 * a client is consistently maxing out its concurrency permits, this increases additively once per
```

### DanglingJavadoc
Dangling Javadoc comment
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ConcurrencyLimiters.java`
#### Snippet
```java
                 */
                .initialLimit(10)
                /**
                 * We reduce concurrency _immediately_ as soon as a request fails, which can result in drastic limit
                 * reductions, e.g. starting with 30 concurrent permits, 100 failures in a row results in: 30 * 0.9^100
```

### DanglingJavadoc
Dangling Javadoc comment
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ConcurrencyLimiters.java`
#### Snippet
```java
                 */
                .backoffRatio(0.9)
                /** However many failures we get, we always need at least 1 permit so we can keep trying. */
                .minLimit(1)
                /** Note that the Dispatcher in {@link OkHttpClients} has a max concurrent requests too. */
```

### DanglingJavadoc
Dangling Javadoc comment
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ConcurrencyLimiters.java`
#### Snippet
```java
                /** However many failures we get, we always need at least 1 permit so we can keep trying. */
                .minLimit(1)
                /** Note that the Dispatcher in {@link OkHttpClients} has a max concurrent requests too. */
                .maxLimit(Integer.MAX_VALUE)
                .build());
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/UserAgentInterceptor.java`
#### Snippet
```java

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        Request requestWithUserAgent =
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DeprecationWarningInterceptor.java`
#### Snippet
```java

    @Override
    public Response intercept(Chain chain) throws IOException {
        Response response = chain.proceed(chain.request());

```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/MeshProxyInterceptor.java`
#### Snippet
```java

    @Override
    public Response intercept(Chain chain) throws IOException {
        HttpUrl originalUri = chain.request().url();

```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/OkhttpTraceInterceptor.java`
#### Snippet
```java

    @Override
    public Response intercept(Chain chain) throws IOException {
        Tags.AttemptSpan attemptSpanTag = chain.request().tag(Tags.AttemptSpan.class);
        if (attemptSpanTag == null) {
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/SpanTerminatingInterceptor.java`
#### Snippet
```java

    @Override
    public Response intercept(Chain chain) throws IOException {
        Tags.AttemptSpan attemptSpanTag = chain.request().tag(Tags.AttemptSpan.class);
        if (attemptSpanTag == null) {
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingCall.java`
#### Snippet
```java

    @Override
    public void enqueue(Callback responseCallback) {
        delegate.enqueue(responseCallback);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingCall.java`
#### Snippet
```java

    @Override
    public Request request() {
        return delegate.request();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingCall.java`
#### Snippet
```java

    @Override
    public Response execute() throws IOException {
        return delegate.execute();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingCall.java`
#### Snippet
```java

    @Override
    public Call clone() {
        return doClone();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingCall.java`
#### Snippet
```java

    @Override
    public Timeout timeout() {
        return delegate.timeout();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ConcurrencyLimitingInterceptor.java`
#### Snippet
```java

    @Override
    public Response intercept(Chain chain) throws IOException {
        ConcurrencyLimiterListener limiterListenerTag = chain.request().tag(ConcurrencyLimiterListener.class);
        if (limiterListenerTag == null) {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/AsyncSerializableErrorCallAdapterFactory.java`
#### Snippet
```java

                @Override
                public void onFailure(Call<R> _call, Throwable throwable) {
                    // TODO(rfink): Would be good to not leak okhttp internals here
                    if (throwable instanceof IoRemoteException) {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/AsyncSerializableErrorCallAdapterFactory.java`
#### Snippet
```java

                @Override
                public void onFailure(Call<R> _call, Throwable throwable) {
                    // TODO(rfink): Would be good to not leak okhttp internals here
                    if (throwable instanceof IoRemoteException) {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/AsyncSerializableErrorCallAdapterFactory.java`
#### Snippet
```java

        @Override
        public void onFailure(Call<R> _call, Throwable throwable) {
            // TODO(rfink): Would be good to not leak okhttp internals here
            if (throwable instanceof IoRemoteException) {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/AsyncSerializableErrorCallAdapterFactory.java`
#### Snippet
```java

        @Override
        public void onFailure(Call<R> _call, Throwable throwable) {
            // TODO(rfink): Would be good to not leak okhttp internals here
            if (throwable instanceof IoRemoteException) {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/AsyncSerializableErrorCallAdapterFactory.java`
#### Snippet
```java

        @Override
        public ListenableFuture<R> adapt(final Call<R> call) {
            ListenableFutureCallback<R> callback = new ListenableFutureCallback<>(call);
            call.enqueue(callback);
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/AsyncSerializableErrorCallAdapterFactory.java`
#### Snippet
```java

        @Override
        public void onResponse(Call<R> _call, Response<R> response) {
            boolean futureWasCancelled = !set(response.body());
            if (futureWasCancelled) {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/AsyncSerializableErrorCallAdapterFactory.java`
#### Snippet
```java
            call.enqueue(new Callback<R>() {
                @Override
                public void onResponse(Call<R> _call, Response<R> response) {
                    boolean futureWasCancelled = !future.complete(response.body());
                    if (futureWasCancelled) {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/AsyncSerializableErrorCallAdapterFactory.java`
#### Snippet
```java
            call.enqueue(new Callback<R>() {
                @Override
                public void onResponse(Call<R> _call, Response<R> response) {
                    boolean futureWasCancelled = !future.complete(response.body());
                    if (futureWasCancelled) {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/AsyncSerializableErrorCallAdapterFactory.java`
#### Snippet
```java

    @Override
    public CallAdapter<?, ?> get(Type returnType, Annotation[] _annotations, Retrofit _retrofit) {
        Type outerType = getRawType(returnType);
        if (outerType != CompletableFuture.class && outerType != ListenableFuture.class) {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/AsyncSerializableErrorCallAdapterFactory.java`
#### Snippet
```java

    @Override
    public CallAdapter<?, ?> get(Type returnType, Annotation[] _annotations, Retrofit _retrofit) {
        Type outerType = getRawType(returnType);
        if (outerType != CompletableFuture.class && outerType != ListenableFuture.class) {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/AsyncSerializableErrorCallAdapterFactory.java`
#### Snippet
```java

    @Override
    public CallAdapter<?, ?> get(Type returnType, Annotation[] _annotations, Retrofit _retrofit) {
        Type outerType = getRawType(returnType);
        if (outerType != CompletableFuture.class && outerType != ListenableFuture.class) {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/QosExceptionThrowingCallAdapterFactory.java`
#### Snippet
```java

        @Override
        public T adapt(Call<R> call) {
            QosExceptionThrowingCall<R> throwingCall = new QosExceptionThrowingCall(call);
            return delegate.adapt(throwingCall);
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/QosExceptionThrowingCallAdapterFactory.java`
#### Snippet
```java

        @Override
        public void enqueue(Callback<R> callback) {
            delegate.enqueue(new Callback<R>() {
                @Override
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/QosExceptionThrowingCallAdapterFactory.java`
#### Snippet
```java

                @Override
                public void onFailure(Call<R> call, Throwable throwable) {
                    callback.onFailure(call, throwable);
                }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/QosExceptionThrowingCallAdapterFactory.java`
#### Snippet
```java

                @Override
                public void onFailure(Call<R> call, Throwable throwable) {
                    callback.onFailure(call, throwable);
                }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/QosExceptionThrowingCallAdapterFactory.java`
#### Snippet
```java
            delegate.enqueue(new Callback<R>() {
                @Override
                public void onResponse(Call<R> call, Response<R> response) {
                    Optional<QosException> exception = handlePotentialQosException(response);
                    if (exception.isPresent()) {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/QosExceptionThrowingCallAdapterFactory.java`
#### Snippet
```java
            delegate.enqueue(new Callback<R>() {
                @Override
                public void onResponse(Call<R> call, Response<R> response) {
                    Optional<QosException> exception = handlePotentialQosException(response);
                    if (exception.isPresent()) {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/QosExceptionThrowingCallAdapterFactory.java`
#### Snippet
```java
    @Nullable
    @Override
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        CallAdapter<?, ?> adapter = delegate.get(returnType, annotations, retrofit);
        return new QosExceptionThrowingCallAdapter<>(adapter);
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/QosExceptionThrowingCallAdapterFactory.java`
#### Snippet
```java
    @Nullable
    @Override
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        CallAdapter<?, ?> adapter = delegate.get(returnType, annotations, retrofit);
        return new QosExceptionThrowingCallAdapter<>(adapter);
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/QosExceptionThrowingCallAdapterFactory.java`
#### Snippet
```java
    @Nullable
    @Override
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        CallAdapter<?, ?> adapter = delegate.get(returnType, annotations, retrofit);
        return new QosExceptionThrowingCallAdapter<>(adapter);
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java

        @Override
        public void onFailure(Throwable _throwable) {
            // do nothing
        }
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java

        @Override
        public void onFailure(Call call, IOException exception) {
            ResponseCapturingInterceptor.getResponse().ifPresent(RemotingOkHttpCall::close);
            ResponseCapturingInterceptor.clearThreadState();
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java

        @Override
        public void onFailure(Call call, IOException exception) {
            ResponseCapturingInterceptor.getResponse().ifPresent(RemotingOkHttpCall::close);
            ResponseCapturingInterceptor.clearThreadState();
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java

            @Override
            public void onResponse(Call call, Response response) {
                if (!future.set(response)) {
                    close(response);
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java

            @Override
            public void onResponse(Call call, Response response) {
                if (!future.set(response)) {
                    close(response);
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
        enqueueInternal(new Callback() {
            @Override
            public void onFailure(Call call, IOException exception) {
                try {
                    call.request().tag(Tags.EntireSpan.class).get().complete();
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
        enqueueInternal(new Callback() {
            @Override
            public void onFailure(Call call, IOException exception) {
                try {
                    call.request().tag(Tags.EntireSpan.class).get().complete();
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                urls.markAsSucceeded(request().url());

```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                urls.markAsSucceeded(request().url());

```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
        enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException exception) {
                if (!future.setException(exception)) {
                    log.warn(
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
        enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException exception) {
                if (!future.setException(exception)) {
                    log.warn(
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    call.request().tag(Tags.EntireSpan.class).get().complete();
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    call.request().tag(Tags.EntireSpan.class).get().complete();
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java

                    @Override
                    public void onFailure(Throwable throwable) {
                        callback.onFailure(
                                RemotingOkHttpCall.this,
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java

        @Override
        public void onResponse(Call call, Response response) throws IOException {
            ResponseCapturingInterceptor.clearThreadState();
            delegate.onResponse(call, response);
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java

        @Override
        public void onResponse(Call call, Response response) throws IOException {
            ResponseCapturingInterceptor.clearThreadState();
            delegate.onResponse(call, response);
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
        super.enqueue(new LeakedResponseClosingCallback(new Callback() {
            @Override
            public void onFailure(Call call, IOException exception) {
                if (isCanceled()) {
                    callback.onFailure(call, exception);
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/RemotingOkHttpCall.java`
#### Snippet
```java
        super.enqueue(new LeakedResponseClosingCallback(new Callback() {
            @Override
            public void onFailure(Call call, IOException exception) {
                if (isCanceled()) {
                    callback.onFailure(call, exception);
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesConverterFactory.java`
#### Snippet
```java

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        Converter<ResponseBody, ?> responseBodyConverter = delegate.responseBodyConverter(type, annotations, retrofit);
        return new CoerceNullCollectionsConverter(responseBodyConverter, type);
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesConverterFactory.java`
#### Snippet
```java

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        Converter<ResponseBody, ?> responseBodyConverter = delegate.responseBodyConverter(type, annotations, retrofit);
        return new CoerceNullCollectionsConverter(responseBodyConverter, type);
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesConverterFactory.java`
#### Snippet
```java

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        Converter<ResponseBody, ?> responseBodyConverter = delegate.responseBodyConverter(type, annotations, retrofit);
        return new CoerceNullCollectionsConverter(responseBodyConverter, type);
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesConverterFactory.java`
#### Snippet
```java
    @Override
    public Converter<?, RequestBody> requestBodyConverter(
            Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        return delegate.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesConverterFactory.java`
#### Snippet
```java
    @Override
    public Converter<?, RequestBody> requestBodyConverter(
            Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        return delegate.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesConverterFactory.java`
#### Snippet
```java
    @Override
    public Converter<?, RequestBody> requestBodyConverter(
            Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        return delegate.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesConverterFactory.java`
#### Snippet
```java
    @Override
    public Converter<?, RequestBody> requestBodyConverter(
            Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        return delegate.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CborConverterFactory.java`
#### Snippet
```java
    @Override
    public Converter<?, RequestBody> requestBodyConverter(
            Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        if (contentTypeIsCbor(methodAnnotations)) {
            return new CborRequestBodyConverter<>(cborMapper.writer());
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CborConverterFactory.java`
#### Snippet
```java
    @Override
    public Converter<?, RequestBody> requestBodyConverter(
            Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        if (contentTypeIsCbor(methodAnnotations)) {
            return new CborRequestBodyConverter<>(cborMapper.writer());
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CborConverterFactory.java`
#### Snippet
```java
    @Override
    public Converter<?, RequestBody> requestBodyConverter(
            Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        if (contentTypeIsCbor(methodAnnotations)) {
            return new CborRequestBodyConverter<>(cborMapper.writer());
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CborConverterFactory.java`
#### Snippet
```java
    @Override
    public Converter<?, RequestBody> requestBodyConverter(
            Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        if (contentTypeIsCbor(methodAnnotations)) {
            return new CborRequestBodyConverter<>(cborMapper.writer());
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CborConverterFactory.java`
#### Snippet
```java

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        // given we don't know how to convert the response until we check the Content-Type, we construct a delegate
        // converter for when the response is not application/cbor.
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CborConverterFactory.java`
#### Snippet
```java

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        // given we don't know how to convert the response until we check the Content-Type, we construct a delegate
        // converter for when the response is not application/cbor.
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CborConverterFactory.java`
#### Snippet
```java

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        // given we don't know how to convert the response until we check the Content-Type, we construct a delegate
        // converter for when the response is not application/cbor.
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CborConverterFactory.java`
#### Snippet
```java

        @Override
        public RequestBody convert(T value) throws IOException {
            byte[] bytes = cborObjectWriter.writeValueAsBytes(value);
            return RequestBody.create(CBOR_MIME_TYPE, bytes);
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ConcurrencyLimiters.java`
#### Snippet
```java

                        @Override
                        public void onFailure(Throwable _error) {}
                    },
                    MoreExecutors.directExecutor());
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ResponseCapturingInterceptor.java`
#### Snippet
```java

    @Override
    public Response intercept(Chain chain) throws IOException {
        Response response = chain.proceed(chain.request());
        currentResponse.set(response);
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public List<ConnectionSpec> connectionSpecs() {
        return delegate.connectionSpecs();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public Authenticator proxyAuthenticator() {
        return delegate.proxyAuthenticator();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public List<Interceptor> networkInterceptors() {
        return delegate.networkInterceptors();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public Call newCall(Request request) {
        return delegate.newCall(request);
    }
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public Call newCall(Request request) {
        return delegate.newCall(request);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public SocketFactory socketFactory() {
        return delegate.socketFactory();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public HostnameVerifier hostnameVerifier() {
        return delegate.hostnameVerifier();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public List<Protocol> protocols() {
        return delegate.protocols();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public CookieJar cookieJar() {
        return delegate.cookieJar();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public List<Interceptor> interceptors() {
        return delegate.interceptors();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public Dispatcher dispatcher() {
        return delegate.dispatcher();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public ConnectionPool connectionPool() {
        return delegate.connectionPool();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public SSLSocketFactory sslSocketFactory() {
        return delegate.sslSocketFactory();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public Dns dns() {
        return delegate.dns();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public Builder newBuilder() {
        return delegate.newBuilder();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public ProxySelector proxySelector() {
        return delegate.proxySelector();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public CertificatePinner certificatePinner() {
        return delegate.certificatePinner();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public Authenticator authenticator() {
        return delegate.authenticator();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public WebSocket newWebSocket(Request request, WebSocketListener listener) {
        return delegate.newWebSocket(request, listener);
    }
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public WebSocket newWebSocket(Request request, WebSocketListener listener) {
        return delegate.newWebSocket(request, listener);
    }
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ForwardingOkHttpClient.java`
#### Snippet
```java

    @Override
    public WebSocket newWebSocket(Request request, WebSocketListener listener) {
        return delegate.newWebSocket(request, listener);
    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java

                @Override
                public void onFailure(Call<R> call, Throwable throwable) {
                    callback.onFailure(call, throwable);
                }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java

                @Override
                public void onFailure(Call<R> call, Throwable throwable) {
                    callback.onFailure(call, throwable);
                }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java
            delegate.enqueue(new Callback<R>() {
                @Override
                public void onResponse(Call<R> call, Response<R> response) {
                    callback.onResponse(call, adaptResponse(response));
                }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java
            delegate.enqueue(new Callback<R>() {
                @Override
                public void onResponse(Call<R> call, Response<R> response) {
                    callback.onResponse(call, adaptResponse(response));
                }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java

        @Override
        public Object adapt(Call<R> call) {
            DefaultingCall<R> defaultingCall = new DefaultingCall<>(call, defaultValue);
            return delegate.adapt(defaultingCall);
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java

        @Override
        public void enqueue(Callback<R> callback) {
            delegate.enqueue(new Callback<R>() {
                @Override
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java

        @Override
        public Object adapt(Call<Object> call) {
            return call;
        }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java
    @Nullable
    @Override
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        // we only support Call<T> and CompletableFuture<T>
        Preconditions.checkState(
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java
    @Nullable
    @Override
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        // we only support Call<T> and CompletableFuture<T>
        Preconditions.checkState(
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java
    @Nullable
    @Override
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        // we only support Call<T> and CompletableFuture<T>
        Preconditions.checkState(
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/NeverReturnNullConverterFactory.java`
#### Snippet
```java

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        Converter<ResponseBody, ?> responseBodyConverter = delegate.responseBodyConverter(type, annotations, retrofit);
        return new Converter<ResponseBody, Object>() {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/NeverReturnNullConverterFactory.java`
#### Snippet
```java

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        Converter<ResponseBody, ?> responseBodyConverter = delegate.responseBodyConverter(type, annotations, retrofit);
        return new Converter<ResponseBody, Object>() {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/NeverReturnNullConverterFactory.java`
#### Snippet
```java

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        Converter<ResponseBody, ?> responseBodyConverter = delegate.responseBodyConverter(type, annotations, retrofit);
        return new Converter<ResponseBody, Object>() {
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/NeverReturnNullConverterFactory.java`
#### Snippet
```java
    @Override
    public Converter<?, RequestBody> requestBodyConverter(
            Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        return delegate.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/NeverReturnNullConverterFactory.java`
#### Snippet
```java
    @Override
    public Converter<?, RequestBody> requestBodyConverter(
            Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        return delegate.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/NeverReturnNullConverterFactory.java`
#### Snippet
```java
    @Override
    public Converter<?, RequestBody> requestBodyConverter(
            Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        return delegate.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/NeverReturnNullConverterFactory.java`
#### Snippet
```java
    @Override
    public Converter<?, RequestBody> requestBodyConverter(
            Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        return delegate.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/NeverReturnNullConverterFactory.java`
#### Snippet
```java
        return new Converter<ResponseBody, Object>() {
            @Override
            public Object convert(ResponseBody value) throws IOException {
                Object object = responseBodyConverter.convert(value);
                Preconditions.checkNotNull(object, "Unexpected null body");
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalResponseBodyConverterFactory.java`
#### Snippet
```java

        @Override
        public Optional<ResponseBody> convert(ResponseBody value) {
            return Optional.of(value);
        }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalResponseBodyConverterFactory.java`
#### Snippet
```java
    @Nullable
    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] _annotations, Retrofit _retrofit) {
        if (type instanceof ParameterizedType) {
            Type innerType = getParameterUpperBound(0, (ParameterizedType) type);
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalResponseBodyConverterFactory.java`
#### Snippet
```java
    @Nullable
    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] _annotations, Retrofit _retrofit) {
        if (type instanceof ParameterizedType) {
            Type innerType = getParameterUpperBound(0, (ParameterizedType) type);
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalResponseBodyConverterFactory.java`
#### Snippet
```java
    @Nullable
    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] _annotations, Retrofit _retrofit) {
        if (type instanceof ParameterizedType) {
            Type innerType = getParameterUpperBound(0, (ParameterizedType) type);
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/InstrumentedInterceptor.java`
#### Snippet
```java

    @Override
    public Response intercept(Chain chain) throws IOException {
        HttpUrl url = chain.request().url();
        String hostname = url.host();
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalObjectToStringConverterFactory.java`
#### Snippet
```java

    @Override
    public Converter<?, String> stringConverter(Type type, Annotation[] annotations, Retrofit _retrofit) {
        Optional<?> pathQueryAnnotation = ImmutableList.copyOf(annotations).stream()
                .map(Annotation::annotationType)
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalObjectToStringConverterFactory.java`
#### Snippet
```java

    @Override
    public Converter<?, String> stringConverter(Type type, Annotation[] annotations, Retrofit _retrofit) {
        Optional<?> pathQueryAnnotation = ImmutableList.copyOf(annotations).stream()
                .map(Annotation::annotationType)
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/OptionalObjectToStringConverterFactory.java`
#### Snippet
```java

    @Override
    public Converter<?, String> stringConverter(Type type, Annotation[] annotations, Retrofit _retrofit) {
        Optional<?> pathQueryAnnotation = ImmutableList.copyOf(annotations).stream()
                .map(Annotation::annotationType)
```

### NullableProblems
Not annotated method overrides method annotated with @EverythingIsNonNull
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/CatchThrowableInterceptor.java`
#### Snippet
```java

    @Override
    public Response intercept(Chain chain) throws IOException {
        try {
            return chain.proceed(chain.request());
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/CatchThrowableInterceptor.java`
#### Snippet
```java

    @Override
    public Response intercept(Chain chain) throws IOException {
        try {
            return chain.proceed(chain.request());
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `conjure-java-jersey-jakarta-server/src/main/java/com/palantir/conjure/java/server/jersey/DeprecationReportingResponseFeature.java`
#### Snippet
```java
 * Adds HTTP response headers to indicate endpoint deprecation.
 *
 * <p>https://tools.ietf.org/id/draft-dalal-deprecation-header-01.html#rfc.section.2.1
 */
enum DeprecationReportingResponseFeature implements DynamicFeature {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extras/refresh-utils/src/main/java/com/palantir/conjure/java/ext/refresh/Refreshable.java`
#### Snippet
```java
 * A layman's Observable: Stores a reference to a value until it is {@link #getAndClear retrieved} once.
 *
 * @deprecated Prefer com.palantir.refreshable:refreshable from https://github.com/palantir/refreshable as it has
 * much better protection against memory leaks.
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/feignimpl/HeaderAccessUtils.java`
#### Snippet
```java
 * are in Train-Case. This can be removed once {@link feign.Request} and {@link feign.Response} expose the headers as a
 * map which is case-insensitive with respect to the key. com.netflix.feign:feign-core:8.18.0 will have it for the
 * {@link feign.Response} headers due to https://github.com/Netflix/feign/pull/418.
 */
public final class HeaderAccessUtils {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/Retrofit2Client.java`
#### Snippet
```java
     * {@link ClientConfiguration} changes.
     *
     * @deprecated Prefer com.palantir.refreshable:refreshable from https://github.com/palantir/refreshable as it has
     * much better protection against memory leaks.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `conjure-java-jersey-server/src/main/java/com/palantir/conjure/java/server/jersey/DeprecationReportingResponseFeature.java`
#### Snippet
```java
 * Adds HTTP response headers to indicate endpoint deprecation.
 *
 * <p>https://tools.ietf.org/id/draft-dalal-deprecation-header-01.html#rfc.section.2.1
 */
enum DeprecationReportingResponseFeature implements DynamicFeature {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/JaxRsClient.java`
#### Snippet
```java
     * {@link ClientConfiguration} changes.
     *
     * @deprecated Prefer com.palantir.refreshable:refreshable from https://github.com/palantir/refreshable as it has
     * much better protection against memory leaks.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/DistinguishedNameParser.java`
#### Snippet
```java
 *
 * <p>Copied from
 * https://raw.githubusercontent.com/square/okhttp/parent-3.9.1/okhttp/src/main/java/okhttp3/internal/tls/DistinguishedNameParser.java
 * Original license preserved. Changes made:
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/ConjureFeignJacksonEncoder.java`
#### Snippet
```java
/**
 * Similar to {@link feign.jackson.JacksonEncoder}, but optimized to avoid intermediate String representation of request
 * body. See upstream PR https://github.com/OpenFeign/feign/pull/989 .
 */
final class ConjureFeignJacksonEncoder implements Encoder {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/ResponseCapturingInterceptor.java`
#### Snippet
```java
/**
 * Workaround a bug in okhttp where cancellation in flight results in leaked responses.
 * https://github.com/square/okhttp/blob/d28d2cec21641b61f3d34e05dd52f43a717c2d32/okhttp/src/main/java/okhttp3/RealCall.java#L210-L213
 */
enum ResponseCapturingInterceptor implements Interceptor {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `conjure-java-jackson-optimizations/src/main/java/com/palantir/conjure/java/jackson/optimizations/ObjectMapperOptimizations.java`
#### Snippet
```java
    /**
     * We disable afterburner optimizations by default on java 16+ where internal access is
     * restricted by https://openjdk.java.net/jeps/396 and https://openjdk.java.net/jeps/403.
     */
    private static boolean shouldDisableByDefault() {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `conjure-java-jackson-optimizations/src/main/java/com/palantir/conjure/java/jackson/optimizations/ObjectMapperOptimizations.java`
#### Snippet
```java
    /**
     * We disable afterburner optimizations by default on java 16+ where internal access is
     * restricted by https://openjdk.java.net/jeps/396 and https://openjdk.java.net/jeps/403.
     */
    private static boolean shouldDisableByDefault() {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `extras/refresh-utils/src/main/java/com/palantir/conjure/java/ext/refresh/RefreshableProxyInvocationHandler.java`
#### Snippet
```java
 * Useful for constructing dynamic proxies based on live-reloadable configuration.
 *
 * @deprecated Prefer com.palantir.refreshable:refreshable from https://github.com/palantir/refreshable as it has
 * much better protection against memory leaks.
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/CatchThrowableInterceptor.java`
#### Snippet
```java
 * the {@link okhttp3.Dispatcher} runs out of threads and can't make *any* outgoing requests.
 *
 * <p>https://github.com/square/okhttp/issues/5151
 */
enum CatchThrowableInterceptor implements Interceptor {
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/Okhttp39HostnameVerifier.java`
#### Snippet
```java
        // Check that asterisk did not match across domain name labels.
        int suffixStartIndexInHostname = hostname.length() - suffix.length();
        if ((suffixStartIndexInHostname > 0) && (hostname.lastIndexOf('.', suffixStartIndexInHostname - 1) != -1)) {
            // Asterisk is matching across domain name labels -- not permitted.
            return false;
```

### TrivialIf
`if` statement can be simplified
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/DialogueFeignClient.java`
#### Snippet
```java
            return false;
        }
        if (EndpointNameHeaderEnrichmentContract.ENDPOINT_NAME_HEADER.equalsIgnoreCase(headerName)) {
            return false;
        }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
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

    synchronized void register(T objectToMonitor, Optional<RuntimeException> stackTrace) {
        references.add(new LeakDetectingReference<>(objectToMonitor, stackTrace));
        pruneAndLog();
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

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `equals()` is identical to its super method
in `conjure-java-jackson-serialization/src/main/java/com/palantir/conjure/java/serialization/ShimJdk7Module.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
```

## RuleId[id=OptionalAssignedToNull]
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/AsyncSerializableErrorCallAdapterFactory.java`
#### Snippet
```java

    private static void close(Response<?> response) {
        ResponseBody body = response.raw().body();
        if (body != null) {
            body.close();
```

## RuleId[id=SimplifyOptionalCallChains]
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

                Optional<Duration> nonAdvertizedBackoff = backoffStrategy.nextBackoff();
                if (!nonAdvertizedBackoff.isPresent()) {
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
in `conjure-java-jaxrs-client/src/main/java/com/palantir/conjure/java/client/jaxrs/DialogueFeignClient.java`
#### Snippet
```java
        }
        Optional<String> maybeContentType = getFirstHeader(request, HttpHeaders.CONTENT_TYPE);
        if (!maybeContentType.isPresent()) {
            if (requestBodyContent.length == 0) {
                return Optional.empty();
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `extras/refresh-utils/src/main/java/com/palantir/conjure/java/ext/refresh/Refreshable.java`
#### Snippet
```java
     * Returns the currently stored value if it exists and clears it. For instance, the following sequence of events,
     * {@code set(a), getAndClear, getAndClear, set(b), getAndClear, getAndClear} yield values {@code a, empty, b,
     * empty} for the four {@link #getAndClear} calls.
     */
    public Optional<T> getAndClear() {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `responseType` may be 'final'
in `conjure-java-retrofit2-client/src/main/java/com/palantir/conjure/java/client/retrofit2/CoerceNullValuesCallAdapterFactory.java`
#### Snippet
```java
    /** This is essentially {@link retrofit2.DefaultCallAdapterFactory} but we can't access it. */
    private static final class IdentityCallAdapter implements CallAdapter<Object, Object> {
        private Type responseType;

        IdentityCallAdapter(Type responseType) {
```

### FieldMayBeFinal
Field `jerseyObjects` may be 'final'
in `undertow-jakarta-testing/src/main/java/com/palantir/undertest/UndertowServerExtension.java`
#### Snippet
```java
    private Map<String, String> filterUrlMapping = new LinkedHashMap<>();

    private List<Object> jerseyObjects = new ArrayList<>();

    public static UndertowServerExtension create() {
```

### FieldMayBeFinal
Field `filters` may be 'final'
in `undertow-jakarta-testing/src/main/java/com/palantir/undertest/UndertowServerExtension.java`
#### Snippet
```java

    private List<ServletInfo> servlets = new ArrayList<>();
    private List<FilterInfo> filters = new ArrayList<>();

    // LinkedHashMap preserves order
```

### FieldMayBeFinal
Field `servlets` may be 'final'
in `undertow-jakarta-testing/src/main/java/com/palantir/undertest/UndertowServerExtension.java`
#### Snippet
```java
    private CloseableHttpClient httpClient;

    private List<ServletInfo> servlets = new ArrayList<>();
    private List<FilterInfo> filters = new ArrayList<>();

```

### FieldMayBeFinal
Field `filterUrlMapping` may be 'final'
in `undertow-jakarta-testing/src/main/java/com/palantir/undertest/UndertowServerExtension.java`
#### Snippet
```java

    // LinkedHashMap preserves order
    private Map<String, String> filterUrlMapping = new LinkedHashMap<>();

    private List<Object> jerseyObjects = new ArrayList<>();
```

### FieldMayBeFinal
Field `dispatcherMetricSet` may be 'final'
in `okhttp-clients/src/main/java/com/palantir/conjure/java/okhttp/OkHttpClients.java`
#### Snippet
```java
            TimeUnit.SECONDS);

    private static DispatcherMetricSet dispatcherMetricSet;

    static {
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

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `conjure-java-jackson-serialization/src/main/java/com/palantir/conjure/java/serialization/InstrumentedSmileFactory.java`
#### Snippet
```java
                ObjectCodec codec,
                ByteQuadsCanonicalizer rootByteSymbols)
                throws IOException, JsonParseException {
            // 13-Mar-2021, tatu: [dataformats-binary#252] Create canonicalizing OR
            //    placeholder, depending on settings
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

### UnstableApiUsage
'tryAcquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `conjure-java-jackson-serialization/src/main/java/com/palantir/conjure/java/serialization/ParserInstrumentation.java`
#### Snippet
```java
    private void recordNontrivialStringLength(int length) {
        parsedStringLength.update(length);
        if (length > 4_000_000 && LOGGING_RATE_LIMITER.tryAcquire()) {
            log.warn(
                    "Detected an unusually large JSON string value",
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `conjure-java-jackson-serialization/src/main/java/com/palantir/conjure/java/serialization/ParserInstrumentation.java`
#### Snippet
```java
final class ParserInstrumentation {
    // Log at most once per second
    private static final RateLimiter LOGGING_RATE_LIMITER = RateLimiter.create(1);
    private static final SafeLogger log = SafeLoggerFactory.get(ParserInstrumentation.class);

```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `conjure-java-jackson-serialization/src/main/java/com/palantir/conjure/java/serialization/ParserInstrumentation.java`
#### Snippet
```java
final class ParserInstrumentation {
    // Log at most once per second
    private static final RateLimiter LOGGING_RATE_LIMITER = RateLimiter.create(1);
    private static final SafeLogger log = SafeLoggerFactory.get(ParserInstrumentation.class);

```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `conjure-java-jackson-serialization/src/main/java/com/palantir/conjure/java/serialization/ParserInstrumentation.java`
#### Snippet
```java
final class ParserInstrumentation {
    // Log at most once per second
    private static final RateLimiter LOGGING_RATE_LIMITER = RateLimiter.create(1);
    private static final SafeLogger log = SafeLoggerFactory.get(ParserInstrumentation.class);

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

