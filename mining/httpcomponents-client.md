# httpcomponents-client 
 
# Bad smells
I found 641 bad smells with 13 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 414 | false |
| DuplicatedCode | 60 | false |
| JavadocDeclaration | 38 | false |
| ConstantValue | 19 | false |
| NullableProblems | 13 | false |
| DeprecatedIsStillUsed | 11 | false |
| UNCHECKED_WARNING | 8 | false |
| DataFlowIssue | 8 | false |
| ProtectedMemberInFinalClass | 8 | true |
| StringBufferReplaceableByString | 8 | false |
| ArraysAsListWithZeroOrOneArgument | 7 | false |
| JavadocLinkAsPlainText | 5 | false |
| IOStreamConstructor | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| UnusedAssignment | 4 | false |
| CatchMayIgnoreException | 3 | false |
| IgnoreResultOfCall | 3 | false |
| EmptyStatementBody | 2 | false |
| CommentedOutCode | 2 | false |
| RegExpRedundantEscape | 2 | false |
| MismatchedJavadocCode | 2 | false |
| FieldCanBeLocal | 2 | false |
| RedundantMethodOverride | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| PointlessArithmeticExpression | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| AutoCloseableResource | 1 | false |
| ArrayObjectsEquals | 1 | false |
| UnnecessaryContinue | 1 | false |
| InfiniteRecursion | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
| NonAtomicOperationOnVolatileField | 1 | false |
## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
    private static void encodeLong( final byte[] buf, final int offset, final int value )
    {
        buf[offset + 0] = ( byte ) ( value & 0xff );
        buf[offset + 1] = ( byte ) ( value >> 8 & 0xff );
        buf[offset + 2] = ( byte ) ( value >> 16 & 0xff );
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `httpclient5/src/main/java/org/apache/hc/client5/http/HttpRoute.java`
#### Snippet
```java
        this.localAddress = local;
        if (proxies != null && !proxies.isEmpty()) {
            this.proxyChain = new ArrayList<>(proxies);
        } else {
            this.proxyChain = null;
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `httpclient5/src/main/java/org/apache/hc/client5/http/HttpRoute.java`
#### Snippet
```java
        this.localAddress = local;
        if (proxies != null && !proxies.isEmpty()) {
            this.proxyChain = new ArrayList<>(proxies);
        } else {
            this.proxyChain = null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `httpclient5-fluent/src/main/java/org/apache/hc/client5/http/fluent/Form.java`
#### Snippet
```java

    public List<NameValuePair> build() {
        return new ArrayList<>(this.params);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `httpclient5-fluent/src/main/java/org/apache/hc/client5/http/fluent/Form.java`
#### Snippet
```java

    public List<NameValuePair> build() {
        return new ArrayList<>(this.params);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MimeField.java`
#### Snippet
```java
        this.value = value;
        this.parameters = parameters != null ?
                Collections.unmodifiableList(new ArrayList<>(parameters)) : Collections.emptyList();
    }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MimeField.java`
#### Snippet
```java
        this.value = value;
        this.parameters = parameters != null ?
                Collections.unmodifiableList(new ArrayList<>(parameters)) : Collections.emptyList();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/AuthChallenge.java`
#### Snippet
```java
        this.schemeName = Args.notNull(schemeName, "schemeName");
        this.value = value;
        this.params = params != null ? Collections.unmodifiableList(new ArrayList<>(params)) : null;
    }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/AuthChallenge.java`
#### Snippet
```java
        this.schemeName = Args.notNull(schemeName, "schemeName");
        this.value = value;
        this.params = params != null ? Collections.unmodifiableList(new ArrayList<>(params)) : null;
    }

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpAsyncCache.java`
#### Snippet
```java

    /**
     * Update a {@link HttpCacheEntry} using a 304 {@link HttpResponse}.
     */
    Cancellable updateCacheEntry(
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.ConnectionReuseStrategy`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ConnectionKeepAliveStrategy.java`
#### Snippet
```java
     * there is no suitable suggestion.
     *
     * When coupled with a {@link org.apache.hc.core5.http.ConnectionReuseStrategy}, if
     * {@link org.apache.hc.core5.http.ConnectionReuseStrategy#keepAlive(
     * org.apache.hc.core5.http.HttpRequest, HttpResponse, HttpContext)} returns true,
```

### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpAsyncCache.java`
#### Snippet
```java
    /**
     * Update a specific {@link HttpCacheEntry} representing a cached variant
     * using a 304 {@link HttpResponse}.
     */
    Cancellable updateVariantCacheEntry(
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.ConnectionReuseStrategy`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ConnectionKeepAliveStrategy.java`
#### Snippet
```java
     *
     * When coupled with a {@link org.apache.hc.core5.http.ConnectionReuseStrategy}, if
     * {@link org.apache.hc.core5.http.ConnectionReuseStrategy#keepAlive(
     * org.apache.hc.core5.http.HttpRequest, HttpResponse, HttpContext)} returns true,
     * this allows you to control how long the reuse will last. If keepAlive returns
```

### JavadocReference
Cannot resolve symbol `keepAlive(
* org.apache.hc.core5.http.HttpRequest, HttpResponse, HttpContext)`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ConnectionKeepAliveStrategy.java`
#### Snippet
```java
     *
     * When coupled with a {@link org.apache.hc.core5.http.ConnectionReuseStrategy}, if
     * {@link org.apache.hc.core5.http.ConnectionReuseStrategy#keepAlive(
     * org.apache.hc.core5.http.HttpRequest, HttpResponse, HttpContext)} returns true,
     * this allows you to control how long the reuse will last. If keepAlive returns
```

### JavadocReference
Cannot resolve symbol `NamedEndpoint`
in `httpclient5/src/main/java/org/apache/hc/client5/http/HttpHostConnectException.java`
#### Snippet
```java

/**
 * A {@link ConnectException} that specifies the {@link NamedEndpoint} that was being connected to.
 *
 * @since 4.0
```

### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpAsyncCache.java`
#### Snippet
```java

    /**
     * Store a {@link HttpResponse} in the cache if possible, and return
     */
    Cancellable createCacheEntry(
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.HttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ConnectionKeepAliveStrategy.java`
#### Snippet
```java
     * When coupled with a {@link org.apache.hc.core5.http.ConnectionReuseStrategy}, if
     * {@link org.apache.hc.core5.http.ConnectionReuseStrategy#keepAlive(
     * org.apache.hc.core5.http.HttpRequest, HttpResponse, HttpContext)} returns true,
     * this allows you to control how long the reuse will last. If keepAlive returns
     * false, this should have no meaningful impact
```

### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ConnectionKeepAliveStrategy.java`
#### Snippet
```java
     * When coupled with a {@link org.apache.hc.core5.http.ConnectionReuseStrategy}, if
     * {@link org.apache.hc.core5.http.ConnectionReuseStrategy#keepAlive(
     * org.apache.hc.core5.http.HttpRequest, HttpResponse, HttpContext)} returns true,
     * this allows you to control how long the reuse will last. If keepAlive returns
     * false, this should have no meaningful impact
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ConnectionKeepAliveStrategy.java`
#### Snippet
```java
     * When coupled with a {@link org.apache.hc.core5.http.ConnectionReuseStrategy}, if
     * {@link org.apache.hc.core5.http.ConnectionReuseStrategy#keepAlive(
     * org.apache.hc.core5.http.HttpRequest, HttpResponse, HttpContext)} returns true,
     * this allows you to control how long the reuse will last. If keepAlive returns
     * false, this should have no meaningful impact
```

### JavadocReference
Cannot resolve symbol `Timeout`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/ConnectionConfig.java`
#### Snippet
```java

    /**
     * @see Builder#setSocketTimeout(Timeout)
     */
    public Timeout getSocketTimeout() {
```

### JavadocReference
Cannot resolve symbol `TimeValue`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/ConnectionConfig.java`
#### Snippet
```java

        /**
         * @see #setValidateAfterInactivity(TimeValue)
         */
        public Builder setValidateAfterInactivity(final long validateAfterInactivity, final TimeUnit timeUnit) {
```

### JavadocReference
Cannot resolve symbol `TimeValue`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/ConnectionConfig.java`
#### Snippet
```java

        /**
         * @see #setTimeToLive(TimeValue)
         */
        public Builder setTimeToLive(final long timeToLive, final TimeUnit timeUnit) {
```

### JavadocReference
Cannot resolve symbol `TimeValue`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/ConnectionConfig.java`
#### Snippet
```java

    /**
     * @see Builder#setTimeToLive(TimeValue) (TimeValue)
     */
    public TimeValue getTimeToLive() {
```

### JavadocReference
Cannot resolve symbol `Timeout`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/ConnectionConfig.java`
#### Snippet
```java

    /**
     * @see Builder#setConnectTimeout(Timeout)
     */
    public Timeout getConnectTimeout() {
```

### JavadocReference
Cannot resolve symbol `Timeout`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/ConnectionConfig.java`
#### Snippet
```java

        /**
         * @see #setConnectTimeout(Timeout)
         */
        public Builder setConnectTimeout(final long connectTimeout, final TimeUnit timeUnit) {
```

### JavadocReference
Cannot resolve symbol `Timeout`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/ConnectionConfig.java`
#### Snippet
```java

        /**
         * @see #setSocketTimeout(Timeout)
         */
        public Builder setSocketTimeout(final int soTimeout, final TimeUnit timeUnit) {
```

### JavadocReference
Cannot resolve symbol `TimeValue`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/ConnectionConfig.java`
#### Snippet
```java

    /**
     * @see Builder#setValidateAfterInactivity(TimeValue)
     */
    public TimeValue getValidateAfterInactivity() {
```

### JavadocReference
Cannot resolve symbol `Timeout`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/TlsConfig.java`
#### Snippet
```java

    /**
     * @see Builder#setHandshakeTimeout(Timeout)
     */
    public Timeout getHandshakeTimeout() {
```

### JavadocReference
Cannot resolve symbol `HttpVersionPolicy`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/TlsConfig.java`
#### Snippet
```java
         * extension to negotiate the application protocol to be used by both endpoints.
         * <p>
         * Default: {@link HttpVersionPolicy#NEGOTIATE}
         * </p>
         */
```

### JavadocReference
Cannot resolve symbol `NEGOTIATE`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/TlsConfig.java`
#### Snippet
```java
         * extension to negotiate the application protocol to be used by both endpoints.
         * <p>
         * Default: {@link HttpVersionPolicy#NEGOTIATE}
         * </p>
         */
```

### JavadocReference
Cannot resolve symbol `HttpVersionPolicy`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/TlsConfig.java`
#### Snippet
```java

    /**
     * @see Builder#setVersionPolicy(HttpVersionPolicy)
     */
    public HttpVersionPolicy getHttpVersionPolicy() {
```

### JavadocReference
Cannot resolve symbol `Timeout`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/TlsConfig.java`
#### Snippet
```java

        /**
         * @see #setHandshakeTimeout(Timeout)
         */
        public Builder setHandshakeTimeout(final long handshakeTimeout, final TimeUnit timeUnit) {
```

### JavadocReference
Cannot resolve symbol `Timeout`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/RequestConfig.java`
#### Snippet
```java

    /**
     * @see Builder#setConnectionRequestTimeout(Timeout)
     */
    public Timeout getConnectionRequestTimeout() {
```

### JavadocReference
Cannot resolve symbol `Timeout`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/RequestConfig.java`
#### Snippet
```java

    /**
     * @see Builder#setResponseTimeout(Timeout)
     */
    public Timeout getResponseTimeout() {
```

### JavadocReference
Cannot resolve symbol `Timeout`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/RequestConfig.java`
#### Snippet
```java

        /**
         * @see #setConnectTimeout(Timeout)
         *
         * @deprecated Use {@link ConnectionConfig.Builder#setConnectTimeout(long, TimeUnit)}.
```

### JavadocReference
Cannot resolve symbol `TimeValue`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/RequestConfig.java`
#### Snippet
```java

        /**
         * @see #setConnectionKeepAlive(TimeValue)
         */
        public Builder setDefaultKeepAlive(final long defaultKeepAlive, final TimeUnit timeUnit) {
```

### JavadocReference
Cannot resolve symbol `Timeout`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/RequestConfig.java`
#### Snippet
```java

        /**
         * @see #setConnectionRequestTimeout(Timeout)
         */
        public Builder setConnectionRequestTimeout(final long connectionRequestTimeout, final TimeUnit timeUnit) {
```

### JavadocReference
Cannot resolve symbol `Timeout`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/RequestConfig.java`
#### Snippet
```java

    /**
     * @see Builder#setConnectTimeout(Timeout)
     *
     * @deprecated Use {@link ConnectionConfig#getConnectTimeout()}.
```

### JavadocReference
Cannot resolve symbol `Timeout`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/RequestConfig.java`
#### Snippet
```java

        /**
         * @see #setResponseTimeout(Timeout)
         */
        public Builder setResponseTimeout(final long responseTimeout, final TimeUnit timeUnit) {
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/RequestConfig.java`
#### Snippet
```java

    /**
     * @see Builder#setProxy(HttpHost)
     *
     * @deprecated Use {@link org.apache.hc.client5.http.impl.routing.DefaultProxyRoutePlanner}
```

### JavadocReference
Cannot resolve symbol `Timeout`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/RequestConfig.java`
#### Snippet
```java
         * </p>
         *
         * @deprecated Use {@link ConnectionConfig.Builder#setConnectTimeout(Timeout)}.
         */
        @Deprecated
```

### JavadocReference
Cannot resolve symbol `TimeValue`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/RequestConfig.java`
#### Snippet
```java

    /**
     * @see Builder#setConnectionKeepAlive(TimeValue)
     */
    public TimeValue getConnectionKeepAlive() {
```

### JavadocReference
Cannot resolve symbol `cancel()`
in `httpclient5/src/main/java/org/apache/hc/client5/http/io/HttpClientConnectionManager.java`
#### Snippet
```java
     * Returns a {@link LeaseRequest} object which can be used to obtain
     * a {@link ConnectionEndpoint} to cancel the request by calling
     * {@link LeaseRequest#cancel()}.
     * <p>
     * Please note that newly allocated endpoints can be leased
```

### JavadocReference
Cannot resolve symbol `TimeValue`
in `httpclient5/src/main/java/org/apache/hc/client5/http/io/HttpClientConnectionManager.java`
#### Snippet
```java
     * {@link ConnectionEndpoint#isConnected() disconnected}. The consumer of the endpoint
     * is responsible for fully establishing the route to the endpoint target
     * by calling {@link #connect(ConnectionEndpoint, TimeValue, HttpContext)}
     * in order to connect directly to the target or to the first proxy hop,
     * and optionally calling {@link #upgrade(ConnectionEndpoint, HttpContext)} method
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/io/HttpClientConnectionManager.java`
#### Snippet
```java
     * {@link ConnectionEndpoint#isConnected() disconnected}. The consumer of the endpoint
     * is responsible for fully establishing the route to the endpoint target
     * by calling {@link #connect(ConnectionEndpoint, TimeValue, HttpContext)}
     * in order to connect directly to the target or to the first proxy hop,
     * and optionally calling {@link #upgrade(ConnectionEndpoint, HttpContext)} method
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/io/HttpClientConnectionManager.java`
#### Snippet
```java
     * by calling {@link #connect(ConnectionEndpoint, TimeValue, HttpContext)}
     * in order to connect directly to the target or to the first proxy hop,
     * and optionally calling {@link #upgrade(ConnectionEndpoint, HttpContext)} method
     * to upgrade the underlying transport to Transport Layer Security after having
     * executed a {@code CONNECT} method to all intermediate proxy hops.
```

### JavadocReference
Cannot resolve symbol `URIBuilder`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/URIUtils.java`
#### Snippet
```java
     * @since 5.0
     *
     * @deprecated Use {@link URIBuilder}.
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/URIUtils.java`
#### Snippet
```java
    /**
     * A convenience method for
     * {@link URIUtils#rewriteURI(URI, HttpHost, boolean)} that always keeps the
     * fragment.
     *
```

### JavadocReference
Cannot resolve symbol `URIBuilder`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/URIUtils.java`
#### Snippet
```java
     * fragment.
     *
     * @deprecated Use {@link URIBuilder}.
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `URIBuilder`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/URIUtils.java`
#### Snippet
```java
     *             If the resulting URI is invalid.
     *
     * @deprecated Use {@link URIBuilder}.
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `URIBuilder`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/URIUtils.java`
#### Snippet
```java
     * @since 5.0
     *
     * @deprecated Use {@link URIBuilder}.
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `URIBuilder`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/URIUtils.java`
#### Snippet
```java
     *             If the resulting URI is invalid.
     *
     * @deprecated Use {@link URIBuilder}.
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `MessageHeaders`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/DateUtils.java`
#### Snippet
```java
     * @since 5.0
     *
     * @deprecated Use {@link #parseStandardDate(MessageHeaders, String)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachedHttpResponseGenerator.java`
#### Snippet
```java

    /**
     * Extract error information about the {@link HttpRequest} telling the 'caller'
     * that a problem occurred.
     *
```

### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachedHttpResponseGenerator.java`
#### Snippet
```java
     *
     * @param errorCheck What type of error should I get
     * @return The {@link HttpResponse} that is the error generated
     */
    public SimpleHttpResponse getErrorForRequest(final RequestProtocolError errorCheck) {
```

### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachedHttpResponseGenerator.java`
#### Snippet
```java

/**
 * Rebuilds an {@link HttpResponse} from a {@link HttpCacheEntry}
 */
class CachedHttpResponseGenerator {
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachedHttpResponseGenerator.java`
#### Snippet
```java

    /**
     * If it is legal to use cached content in response response to the {@link HttpRequest} then
     * generate an {@link HttpResponse} based on {@link HttpCacheEntry}.
     * @param request {@link HttpRequest} to generate the response for
```

### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachedHttpResponseGenerator.java`
#### Snippet
```java
    /**
     * If it is legal to use cached content in response response to the {@link HttpRequest} then
     * generate an {@link HttpResponse} based on {@link HttpCacheEntry}.
     * @param request {@link HttpRequest} to generate the response for
     * @param entry {@link HttpCacheEntry} to transform into an {@link HttpResponse}
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachedHttpResponseGenerator.java`
#### Snippet
```java
     * If it is legal to use cached content in response response to the {@link HttpRequest} then
     * generate an {@link HttpResponse} based on {@link HttpCacheEntry}.
     * @param request {@link HttpRequest} to generate the response for
     * @param entry {@link HttpCacheEntry} to transform into an {@link HttpResponse}
     * @return {@link SimpleHttpResponse} constructed response
```

### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachedHttpResponseGenerator.java`
#### Snippet
```java
     * generate an {@link HttpResponse} based on {@link HttpCacheEntry}.
     * @param request {@link HttpRequest} to generate the response for
     * @param entry {@link HttpCacheEntry} to transform into an {@link HttpResponse}
     * @return {@link SimpleHttpResponse} constructed response
     */
```

### JavadocReference
Cannot resolve symbol `HttpClientConnection`
in `httpclient5/src/main/java/org/apache/hc/client5/http/io/ManagedHttpClientConnection.java`
#### Snippet
```java
/**
 * Represents a managed connection whose state and life cycle is managed by
 * a connection manager. This interface extends {@link HttpClientConnection}
 * with methods to bind the connection to an arbitrary socket and
 * to obtain SSL session details.
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ConditionalRequestBuilder.java`
#### Snippet
```java
    /**
     * When a {@link HttpCacheEntry} does not exist for a specific
     * {@link org.apache.hc.core5.http.HttpRequest} we attempt to see if an existing
     * {@link HttpCacheEntry} is appropriate by building a conditional
     * {@link org.apache.hc.core5.http.HttpRequest} using the variants' ETag values.
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ConditionalRequestBuilder.java`
#### Snippet
```java
     * {@link org.apache.hc.core5.http.HttpRequest} we attempt to see if an existing
     * {@link HttpCacheEntry} is appropriate by building a conditional
     * {@link org.apache.hc.core5.http.HttpRequest} using the variants' ETag values.
     * If no such values exist, the request is unmodified
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ConditionalRequestBuilder.java`
#### Snippet
```java
    /**
     * When a {@link HttpCacheEntry} is stale but 'might' be used as a response
     * to an {@link org.apache.hc.core5.http.HttpRequest} we will attempt to revalidate
     * the entry with the origin.  Build the origin {@link org.apache.hc.core5.http.HttpRequest}
     * here and return it.
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ConditionalRequestBuilder.java`
#### Snippet
```java
     * When a {@link HttpCacheEntry} is stale but 'might' be used as a response
     * to an {@link org.apache.hc.core5.http.HttpRequest} we will attempt to revalidate
     * the entry with the origin.  Build the origin {@link org.apache.hc.core5.http.HttpRequest}
     * here and return it.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.io.entity.HttpEntityWrapper`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/DeflateDecompressingEntity.java`
#### Snippet
```java

/**
 * {@link org.apache.hc.core5.http.io.entity.HttpEntityWrapper} responsible for
 * handling deflate Content Coded responses. In RFC2616 terms, {@code deflate}
 * means a {@code zlib} stream as defined in RFC1950. Some server
```

### JavadocReference
Cannot resolve symbol `HttpEntity`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/DeflateDecompressingEntity.java`
#### Snippet
```java
    /**
     * Creates a new {@link DeflateDecompressingEntity} which will wrap the specified
     * {@link HttpEntity}.
     *
     * @param entity
```

### JavadocReference
Cannot resolve symbol `HttpEntity`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/DeflateDecompressingEntity.java`
#### Snippet
```java
     *
     * @param entity
     *            a non-null {@link HttpEntity} to be wrapped
     */
    public DeflateDecompressingEntity(final HttpEntity entity) {
```

### JavadocReference
Cannot resolve symbol `ConnectionInitiator`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/MultihomeConnectionInitiator.java`
#### Snippet
```java

/**
 * Multi-home DNS aware implementation of {@link ConnectionInitiator}.
 *
 * @since 5.0
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.nio.AsyncResponseConsumer`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleHttpResponse.java`
#### Snippet
```java
 * IMPORTANT: {@link SimpleHttpResponse}s are intended for simple scenarios where entities inclosed
 * in responses are known to be small. It is generally recommended to use streaming
 * {@link org.apache.hc.core5.http.nio.AsyncResponseConsumer}s, for instance, such as based on
 * {@link AbstractCharResponseConsumer} or {@link AbstractBinResponseConsumer}.
 *
```

### JavadocReference
Cannot resolve symbol `H2Config`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClients.java`
#### Snippet
```java
     * functionality.
     *
     * @deprecated Use {@link #createMinimal(H2Config, Http1Config, IOReactorConfig)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `Http1Config`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClients.java`
#### Snippet
```java
     * functionality.
     *
     * @deprecated Use {@link #createMinimal(H2Config, Http1Config, IOReactorConfig)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `IOReactorConfig`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClients.java`
#### Snippet
```java
     * functionality.
     *
     * @deprecated Use {@link #createMinimal(H2Config, Http1Config, IOReactorConfig)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `H2Config`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClients.java`
#### Snippet
```java
     * functionality.
     *
     * @deprecated Use {@link #createMinimal(H2Config, Http1Config, IOReactorConfig, AsyncClientConnectionManager)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `Http1Config`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClients.java`
#### Snippet
```java
     * functionality.
     *
     * @deprecated Use {@link #createMinimal(H2Config, Http1Config, IOReactorConfig, AsyncClientConnectionManager)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `IOReactorConfig`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClients.java`
#### Snippet
```java
     * functionality.
     *
     * @deprecated Use {@link #createMinimal(H2Config, Http1Config, IOReactorConfig, AsyncClientConnectionManager)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCache.java`
#### Snippet
```java

    /**
     * Update a {@link HttpCacheEntry} using a 304 {@link HttpResponse}.
     */
    HttpCacheEntry updateCacheEntry(
```

### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCache.java`
#### Snippet
```java
    /**
     * Update a specific {@link HttpCacheEntry} representing a cached variant
     * using a 304 {@link HttpResponse}.
     */
    HttpCacheEntry updateVariantCacheEntry(
```

### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCache.java`
#### Snippet
```java

    /**
     * Store a {@link HttpResponse} in the cache if possible, and return
     */
    HttpCacheEntry createCacheEntry(
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachingExecBase.java`
#### Snippet
```java
    /**
     * Reports the number of times that the cache successfully responded
     * to an {@link HttpRequest} without contacting the origin server.
     * @return the number of cache hits
     */
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCacheSupport.java`
#### Snippet
```java

    /**
     * Returns text representation of the request URI of the given {@link HttpRequest}.
     * This method will use {@link HttpRequest#getPath()}, {@link HttpRequest#getScheme()} and
     * {@link HttpRequest#getAuthority()} values when available or attributes of target
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCacheSupport.java`
#### Snippet
```java
    /**
     * Returns text representation of the request URI of the given {@link HttpRequest}.
     * This method will use {@link HttpRequest#getPath()}, {@link HttpRequest#getScheme()} and
     * {@link HttpRequest#getAuthority()} values when available or attributes of target
     * {@link HttpHost } in order to construct an absolute URI.
```

### JavadocReference
Cannot resolve symbol `getPath()`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCacheSupport.java`
#### Snippet
```java
    /**
     * Returns text representation of the request URI of the given {@link HttpRequest}.
     * This method will use {@link HttpRequest#getPath()}, {@link HttpRequest#getScheme()} and
     * {@link HttpRequest#getAuthority()} values when available or attributes of target
     * {@link HttpHost } in order to construct an absolute URI.
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCacheSupport.java`
#### Snippet
```java
    /**
     * Returns text representation of the request URI of the given {@link HttpRequest}.
     * This method will use {@link HttpRequest#getPath()}, {@link HttpRequest#getScheme()} and
     * {@link HttpRequest#getAuthority()} values when available or attributes of target
     * {@link HttpHost } in order to construct an absolute URI.
```

### JavadocReference
Cannot resolve symbol `getScheme()`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCacheSupport.java`
#### Snippet
```java
    /**
     * Returns text representation of the request URI of the given {@link HttpRequest}.
     * This method will use {@link HttpRequest#getPath()}, {@link HttpRequest#getScheme()} and
     * {@link HttpRequest#getAuthority()} values when available or attributes of target
     * {@link HttpHost } in order to construct an absolute URI.
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCacheSupport.java`
#### Snippet
```java
     * Returns text representation of the request URI of the given {@link HttpRequest}.
     * This method will use {@link HttpRequest#getPath()}, {@link HttpRequest#getScheme()} and
     * {@link HttpRequest#getAuthority()} values when available or attributes of target
     * {@link HttpHost } in order to construct an absolute URI.
     * <p>
```

### JavadocReference
Cannot resolve symbol `getAuthority()`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCacheSupport.java`
#### Snippet
```java
     * Returns text representation of the request URI of the given {@link HttpRequest}.
     * This method will use {@link HttpRequest#getPath()}, {@link HttpRequest#getScheme()} and
     * {@link HttpRequest#getAuthority()} values when available or attributes of target
     * {@link HttpHost } in order to construct an absolute URI.
     * <p>
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCacheSupport.java`
#### Snippet
```java
     * This method will use {@link HttpRequest#getPath()}, {@link HttpRequest#getScheme()} and
     * {@link HttpRequest#getAuthority()} values when available or attributes of target
     * {@link HttpHost } in order to construct an absolute URI.
     * <p>
     * This method will not attempt to ensure validity of the resultant text representation.
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCacheSupport.java`
#### Snippet
```java
     * This method will not attempt to ensure validity of the resultant text representation.
     *
     * @param request the {@link HttpRequest}
     * @param target target host
     *
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachedResponseSuitabilityChecker.java`
#### Snippet
```java
    /**
     * Determine if I can utilize a {@link HttpCacheEntry} to respond to the given
     * {@link HttpRequest}
     *
     * @param host
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachedResponseSuitabilityChecker.java`
#### Snippet
```java
     *
     * @param host
     *            {@link HttpHost}
     * @param request
     *            {@link HttpRequest}
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachedResponseSuitabilityChecker.java`
#### Snippet
```java
     *            {@link HttpHost}
     * @param request
     *            {@link HttpRequest}
     * @param entry
     *            {@link HttpCacheEntry}
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachedResponseSuitabilityChecker.java`
#### Snippet
```java
/**
 * Determines whether a given {@link HttpCacheEntry} is suitable to be
 * used as a response for a given {@link HttpRequest}.
 */
class CachedResponseSuitabilityChecker {
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ResponseProtocolCompliance.java`
#### Snippet
```java
     * make it so.
     *
     * @param originalRequest The original {@link HttpRequest}
     * @param request The {@link HttpRequest} that generated an origin hit and response
     * @param response The {@link HttpResponse} from the origin server
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ResponseProtocolCompliance.java`
#### Snippet
```java
     *
     * @param originalRequest The original {@link HttpRequest}
     * @param request The {@link HttpRequest} that generated an origin hit and response
     * @param response The {@link HttpResponse} from the origin server
     * @throws IOException Bad things happened
```

### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ResponseProtocolCompliance.java`
#### Snippet
```java
     * @param originalRequest The original {@link HttpRequest}
     * @param request The {@link HttpRequest} that generated an origin hit and response
     * @param response The {@link HttpResponse} from the origin server
     * @throws IOException Bad things happened
     */
```

### JavadocReference
Cannot resolve symbol `Header`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/WarningValue.java`
#### Snippet
```java
     * skipped, in keeping with the philosophy of "ignore what you
     * cannot understand."
     * @param h Warning {@link Header} to parse
     * @return array of {@code WarnValue} objects
     */
```

### JavadocReference
Cannot resolve symbol `Header`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/WarningValue.java`
#### Snippet
```java
 * the Warning header can be multi-valued, but the values can contain
 * separators like commas inside quoted strings, we cannot use the regular
 * {@link Header#getValue()} } call to access the values.
 */
class WarningValue {
```

### JavadocReference
Cannot resolve symbol `getValue()`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/WarningValue.java`
#### Snippet
```java
 * the Warning header can be multi-valued, but the values can contain
 * separators like commas inside quoted strings, we cannot use the regular
 * {@link Header#getValue()} } call to access the values.
 */
class WarningValue {
```

### JavadocReference
Cannot resolve symbol `NameValuePair`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * Returns entity content as a parameter list if set using
     * {@link #setParameters(java.util.List)} or
     * {@link #setParameters(NameValuePair...)} methods.
     */
    public List<NameValuePair> getParameters() {
```

### JavadocReference
Cannot resolve symbol `ContentType`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java

    /**
     * Returns {@link ContentType} of the entity, if set.
     */
    public ContentType getContentType() {
```

### JavadocReference
Cannot resolve symbol `ContentType`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java

    /**
     * Sets {@link ContentType} of the entity.
     */
    public EntityBuilder setContentType(final ContentType contentType) {
```

### JavadocReference
Cannot resolve symbol `NameValuePair`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setStream(java.io.InputStream)} ,
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
     * {@link #setSerializable(java.io.Serializable)} methods.
     */
```

### JavadocReference
Cannot resolve symbol `NameValuePair`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setStream(java.io.InputStream)} ,
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
     * {@link #setFile(java.io.File)} methods.
     */
```

### JavadocReference
Cannot resolve symbol `HttpEntity`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java

    /**
     * Creates new instance of {@link HttpEntity} based on the current state.
     */
    public HttpEntity build() {
```

### JavadocReference
Cannot resolve symbol `NameValuePair`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setSerializable(java.io.Serializable)} ,
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
     * {@link #setFile(java.io.File)} methods.
     */
```

### JavadocReference
Cannot resolve symbol `NameValuePair`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setSerializable(java.io.Serializable)} ,
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
     * {@link #setFile(java.io.File)} methods.
     */
```

### JavadocReference
Cannot resolve symbol `HttpEntity`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java

/**
 * Builder for {@link HttpEntity} instances.
 * <p>
 * Several setter methods of this builder are mutually exclusive. In case of multiple invocations
```

### JavadocReference
Cannot resolve symbol `NameValuePair`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
 *   <li>{@link #setSerializable(java.io.Serializable)}</li>
 *   <li>{@link #setParameters(java.util.List)}</li>
 *   <li>{@link #setParameters(NameValuePair...)}</li>
 *   <li>{@link #setFile(java.io.File)}</li>
 * </ul>
```

### JavadocReference
Cannot resolve symbol `NameValuePair`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setSerializable(java.io.Serializable)} ,
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
     * {@link #setFile(java.io.File)} methods.
     */
```

### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncHttpRequestRetryExec.java`
#### Snippet
```java
 * an I/O exception or received a specific response from the target server should
 * be re-executed. Note that this exec chain handler <em>will not</em> respect
 * {@link HttpRequestRetryStrategy#getRetryInterval(HttpResponse, int, org.apache.hc.core5.http.protocol.HttpContext)}.
 * <p>
 * Further responsibilities such as communication with the opposite
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.protocol.HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncHttpRequestRetryExec.java`
#### Snippet
```java
 * an I/O exception or received a specific response from the target server should
 * be re-executed. Note that this exec chain handler <em>will not</em> respect
 * {@link HttpRequestRetryStrategy#getRetryInterval(HttpResponse, int, org.apache.hc.core5.http.protocol.HttpContext)}.
 * <p>
 * Further responsibilities such as communication with the opposite
```

### JavadocReference
Cannot resolve symbol `BasicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/BasicHttpRequests.java`
#### Snippet
```java

    /**
     * Creates a request object of the exact subclass of {@link BasicHttpRequest}.
     *
     * @param uri a non-null URI String.
```

### JavadocReference
Cannot resolve symbol `BasicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/BasicHttpRequests.java`
#### Snippet
```java

    /**
     * Creates a request object of the exact subclass of {@link BasicHttpRequest}.
     *
     * @param host HTTP host.
```

### JavadocReference
Cannot resolve symbol `BasicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/BasicHttpRequests.java`
#### Snippet
```java

    /**
     * Creates a request object of the exact subclass of {@link BasicHttpRequest}.
     *
     * @param uri a non-null URI.
```

### JavadocReference
Cannot resolve symbol `BasicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/BasicHttpRequests.java`
#### Snippet
```java

/**
 * Common HTTP methods using {@link BasicHttpRequest} as a HTTP request message representation.
 *
 * @since 5.0
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.support.BasicRequestBuilder`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/BasicHttpRequests.java`
#### Snippet
```java
 * @since 5.0
 *
 * @deprecated Use {@link org.apache.hc.core5.http.support.BasicRequestBuilder}.
 */
@Deprecated
```

### JavadocReference
Cannot resolve symbol `ContentType`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/ByteArrayBody.java`
#### Snippet
```java
     * Public constructor that creates a new ByteArrayBody.
     *
     * @param contentType the {@link ContentType}
     * @param data the array of byte.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.message.BasicLineParser`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/LenientHttpResponseParser.java`
#### Snippet
```java
     *
     * @param lineParser      the line parser. If {@code null}
     *                        {@link org.apache.hc.core5.http.message.BasicLineParser#INSTANCE} will be used.
     * @param responseFactory HTTP response factory. If {@code null}
     *                        {@link org.apache.hc.core5.http.impl.io.DefaultClassicHttpResponseFactory#INSTANCE}
```

### JavadocReference
Cannot resolve symbol `INSTANCE`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/LenientHttpResponseParser.java`
#### Snippet
```java
     *
     * @param lineParser      the line parser. If {@code null}
     *                        {@link org.apache.hc.core5.http.message.BasicLineParser#INSTANCE} will be used.
     * @param responseFactory HTTP response factory. If {@code null}
     *                        {@link org.apache.hc.core5.http.impl.io.DefaultClassicHttpResponseFactory#INSTANCE}
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.impl.io.DefaultClassicHttpResponseFactory`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/LenientHttpResponseParser.java`
#### Snippet
```java
     *                        {@link org.apache.hc.core5.http.message.BasicLineParser#INSTANCE} will be used.
     * @param responseFactory HTTP response factory. If {@code null}
     *                        {@link org.apache.hc.core5.http.impl.io.DefaultClassicHttpResponseFactory#INSTANCE}
     *                        will be used.
     * @param h1Config        HTTP/1.1 parameters. If {@code null}. {@link Http1Config#DEFAULT} will be used.
```

### JavadocReference
Cannot resolve symbol `INSTANCE`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/LenientHttpResponseParser.java`
#### Snippet
```java
     *                        {@link org.apache.hc.core5.http.message.BasicLineParser#INSTANCE} will be used.
     * @param responseFactory HTTP response factory. If {@code null}
     *                        {@link org.apache.hc.core5.http.impl.io.DefaultClassicHttpResponseFactory#INSTANCE}
     *                        will be used.
     * @param h1Config        HTTP/1.1 parameters. If {@code null}. {@link Http1Config#DEFAULT} will be used.
```

### JavadocReference
Cannot resolve symbol `Http1Config`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/LenientHttpResponseParser.java`
#### Snippet
```java
     *                        {@link org.apache.hc.core5.http.impl.io.DefaultClassicHttpResponseFactory#INSTANCE}
     *                        will be used.
     * @param h1Config        HTTP/1.1 parameters. If {@code null}. {@link Http1Config#DEFAULT} will be used.
     *
     * @since 4.3
```

### JavadocReference
Cannot resolve symbol `DEFAULT`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/LenientHttpResponseParser.java`
#### Snippet
```java
     *                        {@link org.apache.hc.core5.http.impl.io.DefaultClassicHttpResponseFactory#INSTANCE}
     *                        will be used.
     * @param h1Config        HTTP/1.1 parameters. If {@code null}. {@link Http1Config#DEFAULT} will be used.
     *
     * @since 4.3
```

### JavadocReference
Cannot resolve symbol `Http1Config`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/LenientHttpResponseParser.java`
#### Snippet
```java
     * Creates new instance of DefaultHttpResponseParser.
     *
     * @param h1Config        HTTP/1.1 parameters. If {@code null}. {@link Http1Config#DEFAULT} will be used.
     *
     * @since 4.3
```

### JavadocReference
Cannot resolve symbol `DEFAULT`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/LenientHttpResponseParser.java`
#### Snippet
```java
     * Creates new instance of DefaultHttpResponseParser.
     *
     * @param h1Config        HTTP/1.1 parameters. If {@code null}. {@link Http1Config#DEFAULT} will be used.
     *
     * @since 4.3
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.io.entity.HttpEntityWrapper`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/BrotliDecompressingEntity.java`
#### Snippet
```java

/**
 * {@link org.apache.hc.core5.http.io.entity.HttpEntityWrapper} responsible for
 * handling br Content Coded responses.
 *
```

### JavadocReference
Cannot resolve symbol `HttpEntity`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/DecompressingEntity.java`
#### Snippet
```java
     * Creates a new {@link DecompressingEntity}.
     *
     * @param wrapped the non-null {@link HttpEntity} to be wrapped
     * @param inputStreamFactory factory to create decompressing stream.
     */
```

### JavadocReference
Cannot resolve symbol `HttpEntity`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/DecompressingEntity.java`
#### Snippet
```java

/**
 * Common base class for decompressing {@link HttpEntity} implementations.
 *
 * @since 4.4
```

### JavadocReference
Cannot resolve symbol `TransportSecurityLayer`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/AbstractClientTlsStrategy.java`
#### Snippet
```java

    /**
     * @deprecated use {@link #upgrade(TransportSecurityLayer, NamedEndpoint, Object, Timeout, FutureCallback)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `NamedEndpoint`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/AbstractClientTlsStrategy.java`
#### Snippet
```java

    /**
     * @deprecated use {@link #upgrade(TransportSecurityLayer, NamedEndpoint, Object, Timeout, FutureCallback)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `Timeout`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/AbstractClientTlsStrategy.java`
#### Snippet
```java

    /**
     * @deprecated use {@link #upgrade(TransportSecurityLayer, NamedEndpoint, Object, Timeout, FutureCallback)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `FutureCallback`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/AbstractClientTlsStrategy.java`
#### Snippet
```java

    /**
     * @deprecated use {@link #upgrade(TransportSecurityLayer, NamedEndpoint, Object, Timeout, FutureCallback)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpEntity`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/GzipDecompressingEntity.java`
#### Snippet
```java
    /**
     * Creates a new {@link GzipDecompressingEntity} which will wrap the
     * specified {@link HttpEntity}.
     *
     * @param entity
```

### JavadocReference
Cannot resolve symbol `HttpEntity`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/GzipDecompressingEntity.java`
#### Snippet
```java
     *
     * @param entity
     *            the non-null {@link HttpEntity} to be wrapped
     */
    public GzipDecompressingEntity(final HttpEntity entity) {
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.io.entity.HttpEntityWrapper`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/GzipDecompressingEntity.java`
#### Snippet
```java

/**
 * {@link org.apache.hc.core5.http.io.entity.HttpEntityWrapper} for handling
 * gzip Content Coded responses.
 *
```

### JavadocReference
Cannot resolve symbol `Resolver`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/MinimalH2AsyncClient.java`
#### Snippet
```java

    /**
     * Sets {@link Resolver} for {@link ConnectionConfig} on a per host basis.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `SSLBufferMode`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/ClientTlsStrategyBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link SSLBufferMode} value.
     */
    public ClientTlsStrategyBuilder setSslBufferMode(final SSLBufferMode sslBufferMode) {
```

### JavadocReference
Cannot resolve symbol `TlsDetails`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/ClientTlsStrategyBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link TlsDetails} {@link Factory} instance.
     *
     * @deprecated Do not use.
```

### JavadocReference
Cannot resolve symbol `Factory`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/ClientTlsStrategyBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link TlsDetails} {@link Factory} instance.
     *
     * @deprecated Do not use.
```

### JavadocReference
Cannot resolve symbol `TlsStrategy`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/ClientTlsStrategyBuilder.java`
#### Snippet
```java

/**
 * Builder for client {@link TlsStrategy} instances.
 * <p>
 * When a particular component is not explicitly set this class will
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/RequestProtocolCompliance.java`
#### Snippet
```java

    /**
     * Test to see if the {@link HttpRequest} is HTTP1.1 compliant or not
     * and if not, we can not continue.
     *
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/RequestProtocolCompliance.java`
#### Snippet
```java

    /**
     * If the {@link HttpRequest} is non-compliant but 'fixable' we go ahead and
     * fix the request here.
     *
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/AsyncExecChain.java`
#### Snippet
```java

        /**
         * @deprecated Use {@link Scope#Scope(String, HttpRoute, HttpRequest, CancellableDependency, HttpClientContext,
         * AsyncExecRuntime, Scheduler, AtomicInteger)}
         */
```

### JavadocReference
Cannot resolve symbol `CancellableDependency`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/AsyncExecChain.java`
#### Snippet
```java

        /**
         * @deprecated Use {@link Scope#Scope(String, HttpRoute, HttpRequest, CancellableDependency, HttpClientContext,
         * AsyncExecRuntime, Scheduler, AtomicInteger)}
         */
```

### JavadocReference
Cannot resolve symbol `TlsStrategy`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link TlsStrategy} instance.
     */
    public final H2AsyncClientBuilder setTlsStrategy(final TlsStrategy tlsStrategy) {
```

### JavadocReference
Cannot resolve symbol `IOSessionListener`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java

    /**
     * Sets {@link IOSessionListener} listener.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `IOReactorConfig`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java

    /**
     * Sets {@link IOReactorConfig} configuration.
     */
    public final H2AsyncClientBuilder setIOReactorConfig(final IOReactorConfig ioReactorConfig) {
```

### JavadocReference
Cannot resolve symbol `Resolver`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link Resolver} for {@link ConnectionConfig} on a per host basis.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `H2Config`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java

    /**
     * Sets {@link H2Config} configuration.
     */
    public final H2AsyncClientBuilder setH2Config(final H2Config h2Config) {
```

### JavadocReference
Cannot resolve symbol `close()`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
     * connection pool using a background thread.
     * <p>
     * One MUST explicitly close HttpClient with {@link CloseableHttpAsyncClient#close()}
     * in order to stop and release the background thread.
     * <p>
```

### JavadocReference
Cannot resolve symbol `CharCodingConfig`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java

    /**
     * Sets {@link CharCodingConfig} configuration.
     */
    public final H2AsyncClientBuilder setCharCodingConfig(final CharCodingConfig charCodingConfig) {
```

### JavadocReference
Cannot resolve symbol `IOSession`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java

    /**
     * Sets the {@link IOSession} {@link Decorator} that will be use with the client's IOReactor.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `Decorator`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java

    /**
     * Sets the {@link IOSession} {@link Decorator} that will be use with the client's IOReactor.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.nio.support.AsyncRequestBuilder`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleRequestProducer.java`
#### Snippet
```java
 * IMPORTANT: {@link SimpleHttpRequest}s are intended for simple scenarios where entities inclosed
 * in requests are known to be small. It is generally recommended to use
 * {@link org.apache.hc.core5.http.nio.support.AsyncRequestBuilder} and streaming
 * {@link org.apache.hc.core5.http.nio.AsyncEntityProducer}s.
 *
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.nio.AsyncEntityProducer`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleRequestProducer.java`
#### Snippet
```java
 * in requests are known to be small. It is generally recommended to use
 * {@link org.apache.hc.core5.http.nio.support.AsyncRequestBuilder} and streaming
 * {@link org.apache.hc.core5.http.nio.AsyncEntityProducer}s.
 *
 * @since 5.0
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.nio.support.AsyncRequestBuilder`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleRequestProducer.java`
#### Snippet
```java
 * @see SimpleBody
 * @see SimpleHttpRequest
 * @see org.apache.hc.core5.http.nio.support.AsyncRequestBuilder
 * @see org.apache.hc.core5.http.nio.AsyncEntityProducer
 */
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.nio.AsyncEntityProducer`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleRequestProducer.java`
#### Snippet
```java
 * @see SimpleHttpRequest
 * @see org.apache.hc.core5.http.nio.support.AsyncRequestBuilder
 * @see org.apache.hc.core5.http.nio.AsyncEntityProducer
 */
public final class SimpleRequestProducer extends BasicRequestProducer {
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/AuthScheme.java`
#### Snippet
```java
     * @return authorization header
     *
     * @see #isResponseReady(HttpHost, CredentialsProvider, HttpContext)
     *
     * @since 5.0
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/AuthScheme.java`
#### Snippet
```java
     * @return authorization header
     *
     * @see #isResponseReady(HttpHost, CredentialsProvider, HttpContext)
     *
     * @since 5.0
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/AuthScheme.java`
#### Snippet
```java
 * </p>
 * <p>
 * The {@link #processChallenge(AuthChallenge, HttpContext)} method is called  to
 * process an authentication challenge received either from the target server or a proxy.
 * The authentication scheme transitions to CHALLENGED state and is expected to validate
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/AuthScheme.java`
#### Snippet
```java
 * </p>
 * <p>
 * Once the challenge has been fully processed the {@link #isResponseReady(HttpHost,
 * CredentialsProvider, HttpContext)} method to determine whether the scheme is capable of
 * generating a authorization response based on its current state and it holds user credentials
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/AuthScheme.java`
#### Snippet
```java
 * <p>
 * Once the challenge has been fully processed the {@link #isResponseReady(HttpHost,
 * CredentialsProvider, HttpContext)} method to determine whether the scheme is capable of
 * generating a authorization response based on its current state and it holds user credentials
 * required to do so. If this method returns {@code false} the authentication is considered
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/AuthScheme.java`
#### Snippet
```java
 * <p>
 * Once the scheme is ready to respond to the challenge the {@link #generateAuthResponse(
 * HttpHost, HttpRequest, HttpContext)} method to generate a response token, which will
 * be sent to the opposite endpoint in the subsequent request message.
 * </p>
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/AuthScheme.java`
#### Snippet
```java
 * <p>
 * Once the scheme is ready to respond to the challenge the {@link #generateAuthResponse(
 * HttpHost, HttpRequest, HttpContext)} method to generate a response token, which will
 * be sent to the opposite endpoint in the subsequent request message.
 * </p>
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/AuthScheme.java`
#### Snippet
```java
 * <p>
 * Once the scheme is ready to respond to the challenge the {@link #generateAuthResponse(
 * HttpHost, HttpRequest, HttpContext)} method to generate a response token, which will
 * be sent to the opposite endpoint in the subsequent request message.
 * </p>
```

### JavadocReference
Cannot resolve symbol `ConnectionInitiator`
in `httpclient5/src/main/java/org/apache/hc/client5/http/nio/AsyncClientConnectionOperator.java`
#### Snippet
```java
    /**
     * Initiates operation to create a connection to the remote endpoint using
     * the provided {@link ConnectionInitiator}.
     *
     * @param connectionInitiator the connection initiator.
```

### JavadocReference
Cannot resolve symbol `ConnectionInitiator`
in `httpclient5/src/main/java/org/apache/hc/client5/http/nio/AsyncClientConnectionOperator.java`
#### Snippet
```java
    /**
     * Initiates operation to create a connection to the remote endpoint using
     * the provided {@link ConnectionInitiator}.
     *
     * @param connectionInitiator the connection initiator.
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.HttpResponse`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheEntry.java`
#### Snippet
```java

/**
 * Structure used to store an {@link org.apache.hc.core5.http.HttpResponse} in a cache.
 * Some entries can optionally depend on system resources that may require
 * explicit deallocation. In such a case {@link #getResource()} should return
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.HttpResponse`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheEntry.java`
#### Snippet
```java

    /**
     * Returns the status from the origin {@link org.apache.hc.core5.http.HttpResponse}.
     */
    public int getStatus() {
```

### JavadocReference
Cannot resolve symbol `Header`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheEntry.java`
#### Snippet
```java
     * @param responseHeaders Header[] from original HTTP Response
     * @param resource        representing origin response body
     * @deprecated {{@link #HttpCacheEntry(Instant, Instant, int, Header[], Resource)}}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `Header`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheEntry.java`
#### Snippet
```java
     *   from the varying request headers) to a "cache key" (where
     *   in the cache storage the particular variant is located)
     * @deprecated  Use {{@link #HttpCacheEntry(Instant, Instant, int, Header[], Resource, Map)}}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `Resolver`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManager.java`
#### Snippet
```java

    /**
     * @deprecated Use custom {@link #setConnectionConfigResolver(Resolver)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.HttpConnection`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManager.java`
#### Snippet
```java
/**
 * {@code PoolingAsyncClientConnectionManager} maintains a pool of non-blocking
 * {@link org.apache.hc.core5.http.HttpConnection}s and is able to service
 * connection requests from multiple execution threads. Connections are pooled
 * on a per route basis. A request for a route which already the manager has
```

### JavadocReference
Cannot resolve symbol `ConnPoolControl`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManager.java`
#### Snippet
```java
 * {@code PoolingAsyncClientConnectionManager} maintains a maximum limit
 * of connection on a per route basis and in total. Connection limits
 * can be adjusted using {@link ConnPoolControl} methods.
 * <p>
 * Total time to live (TTL) set at construction time defines maximum life span
```

### JavadocReference
Cannot resolve symbol `Resolver`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManager.java`
#### Snippet
```java

    /**
     * Sets {@link Resolver} of {@link ConnectionConfig} on a per route basis.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `Resolver`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManager.java`
#### Snippet
```java

    /**
     * Sets {@link Resolver} of {@link TlsConfig} on a per host basis.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `Timeout`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManager.java`
#### Snippet
```java
    /**
     * Defines period of inactivity after which persistent connections must
     * be re-validated prior to being {@link #lease(String, HttpRoute, Object, Timeout,
     * FutureCallback)} leased} to the consumer. Negative values passed
     * to this method disable connection validation. This check helps detect connections
```

### JavadocReference
Cannot resolve symbol `FutureCallback`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManager.java`
#### Snippet
```java
     * Defines period of inactivity after which persistent connections must
     * be re-validated prior to being {@link #lease(String, HttpRoute, Object, Timeout,
     * FutureCallback)} leased} to the consumer. Negative values passed
     * to this method disable connection validation. This check helps detect connections
     * that have become stale (half-closed) while kept inactive in the pool.
```

### JavadocReference
Cannot resolve symbol `Resolver`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManager.java`
#### Snippet
```java
     * that have become stale (half-closed) while kept inactive in the pool.
     *
     * @deprecated Use {@link #setConnectionConfigResolver(Resolver)}.
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpException`
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/classic/RandomHandler.java`
#### Snippet
```java
     * @param context   the context
     *
     * @throws HttpException    in case of a problem
     * @throws IOException      in case of an IO problem
     */
```

### JavadocReference
Cannot resolve symbol `DefaultConnectionReuseStrategy`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/DefaultClientConnectionReuseStrategy.java`
#### Snippet
```java

/**
 * Extension of core {@link DefaultConnectionReuseStrategy} that treats
 * CONNECT method exchanges involved in proxy tunnelling as a special case.
 *
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.nio.support.AsyncRequestBuilder`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleHttpRequest.java`
#### Snippet
```java
 * IMPORTANT: {@link SimpleHttpRequest}s are intended for simple scenarios where entities inclosed
 * in requests are known to be small. It is generally recommended to use
 * {@link org.apache.hc.core5.http.nio.support.AsyncRequestBuilder} and streaming
 * {@link org.apache.hc.core5.http.nio.AsyncEntityProducer}s.
 *
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.nio.AsyncEntityProducer`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleHttpRequest.java`
#### Snippet
```java
 * in requests are known to be small. It is generally recommended to use
 * {@link org.apache.hc.core5.http.nio.support.AsyncRequestBuilder} and streaming
 * {@link org.apache.hc.core5.http.nio.AsyncEntityProducer}s.
 *
 * @since 5.0
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.nio.support.AsyncRequestBuilder`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleHttpRequest.java`
#### Snippet
```java
 *
 * @see SimpleBody
 * @see org.apache.hc.core5.http.nio.support.AsyncRequestBuilder
 * @see org.apache.hc.core5.http.nio.AsyncEntityProducer
 */
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.nio.AsyncEntityProducer`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleHttpRequest.java`
#### Snippet
```java
 * @see SimpleBody
 * @see org.apache.hc.core5.http.nio.support.AsyncRequestBuilder
 * @see org.apache.hc.core5.http.nio.AsyncEntityProducer
 */
public final class SimpleHttpRequest extends ConfigurableHttpRequest {
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/AbstractHttpClientResponseHandler.java`
#### Snippet
```java

/**
 * A generic {@link HttpClientResponseHandler} that works with the response entity
 * for successful (2xx) responses. If the response code was &gt;= 300, the response
 * body is consumed and an {@link HttpResponseException} is thrown.
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/AbstractHttpClientResponseHandler.java`
#### Snippet
```java
 * If this is used with
 * {@link org.apache.hc.client5.http.classic.HttpClient#execute(
 * org.apache.hc.core5.http.ClassicHttpRequest, HttpClientResponseHandler)},
 * HttpClient may handle redirects (3xx responses) internally.
 * </p>
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/AbstractHttpClientResponseHandler.java`
#### Snippet
```java
 * If this is used with
 * {@link org.apache.hc.client5.http.classic.HttpClient#execute(
 * org.apache.hc.core5.http.ClassicHttpRequest, HttpClientResponseHandler)},
 * HttpClient may handle redirects (3xx responses) internally.
 * </p>
```

### JavadocReference
Cannot resolve symbol `close(org.apache.hc.core5.io.CloseMode)`
in `httpclient5/src/main/java/org/apache/hc/client5/http/io/ConnectionEndpoint.java`
#### Snippet
```java
     * Executes HTTP request using the provided request executor.
     * <p>
     * Once the endpoint is no longer needed it MUST be released with {@link #close(org.apache.hc.core5.io.CloseMode)}.
     * </p>
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.io.CloseMode`
in `httpclient5/src/main/java/org/apache/hc/client5/http/io/ConnectionEndpoint.java`
#### Snippet
```java
     * Executes HTTP request using the provided request executor.
     * <p>
     * Once the endpoint is no longer needed it MUST be released with {@link #close(org.apache.hc.core5.io.CloseMode)}.
     * </p>
     *
```

### JavadocReference
Cannot resolve symbol `close(org.apache.hc.core5.io.CloseMode)`
in `httpclient5/src/main/java/org/apache/hc/client5/http/io/ConnectionEndpoint.java`
#### Snippet
```java
 * to execute HTTP requests.
 * <p>
 * Once the endpoint is no longer needed it MUST be released with {@link #close(org.apache.hc.core5.io.CloseMode)} )}.
 * </p>
 *
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.io.CloseMode`
in `httpclient5/src/main/java/org/apache/hc/client5/http/io/ConnectionEndpoint.java`
#### Snippet
```java
 * to execute HTTP requests.
 * <p>
 * Once the endpoint is no longer needed it MUST be released with {@link #close(org.apache.hc.core5.io.CloseMode)} )}.
 * </p>
 *
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.protocol.HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/CredentialsStore.java`
#### Snippet
```java
     * for the given scope.
     *
     * @see #getCredentials(AuthScope, org.apache.hc.core5.http.protocol.HttpContext)
     */
    void setCredentials(AuthScope authScope, Credentials credentials);
```

### JavadocReference
Cannot resolve symbol `ConnPoolControl`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/AIMDBackoffManager.java`
#### Snippet
```java
     * Creates an {@code AIMDBackoffManager} to manage
     * per-host connection pool sizes represented by the
     * given {@link ConnPoolControl}.
     * @param connPerRoute per-host routing maximums to
     *   be managed
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java

    /**
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
    /**
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
    /**
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
    /**
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * such as {@link #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * such as {@link #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * such as {@link #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     *
     * @see #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     *
     * @see #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     *
     * @see #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java

    /**
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
    /**
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
    /**
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
    /**
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
    /**
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * with the response is fully consumed and the underlying connection is
     * released back to the connection manager automatically in all cases
     * relieving individual {@link HttpClientResponseHandler}s from having to manage
     * resource deallocation internally.
     *
```

### JavadocReference
Cannot resolve symbol `ModalCloseable`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java

/**
 * Base implementation of {@link HttpClient} that also implements {@link ModalCloseable}.
 *
 * @since 4.3
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java

    /**
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
    /**
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
    /**
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * such as {@link #execute(ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * such as {@link #execute(ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * such as {@link #execute(ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     *
     * @see #execute(ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     *
     * @see #execute(ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     *
     * @see #execute(ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java

    /**
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
    /**
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
    /**
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
    /**
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * with the response is fully consumed and the underlying connection is
     * released back to the connection manager automatically in all cases
     * relieving individual {@link HttpClientResponseHandler}s from having to manage
     * resource deallocation internally.
     *
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * with the response is fully consumed and the underlying connection is
     * released back to the connection manager automatically in all cases
     * relieving individual {@link HttpClientResponseHandler}s from having to manage
     * resource deallocation internally.
     *
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
     * with the response is fully consumed and the underlying connection is
     * released back to the connection manager automatically in all cases
     * relieving individual {@link HttpClientResponseHandler}s from having to manage
     * resource deallocation internally.
     *
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/methods/HttpUriRequest.java`
#### Snippet
```java

/**
 * Extended version of the {@link ClassicHttpRequest} interface that provides
 * convenience methods to access request properties such as request URI
 * and method type.
```

### JavadocReference
Cannot resolve symbol `close()`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
     * connection pool using a background thread.
     * <p>
     * One MUST explicitly close HttpClient with {@link CloseableHttpAsyncClient#close()} in order
     * to stop and release the background thread.
     * <p>
```

### JavadocReference
Cannot resolve symbol `ConnPoolControl`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
     *
     * @see #setConnectionManagerShared(boolean)
     * @see ConnPoolControl#closeExpired()
     */
    public final HttpAsyncClientBuilder evictExpiredConnections() {
```

### JavadocReference
Cannot resolve symbol `closeExpired()`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
     *
     * @see #setConnectionManagerShared(boolean)
     * @see ConnPoolControl#closeExpired()
     */
    public final HttpAsyncClientBuilder evictExpiredConnections() {
```

### JavadocReference
Cannot resolve symbol `IOSessionListener`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java

    /**
     * Sets {@link IOSessionListener} listener.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `H2Config`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java

    /**
     * Sets {@link H2Config} configuration.
     */
    public final HttpAsyncClientBuilder setH2Config(final H2Config h2Config) {
```

### JavadocReference
Cannot resolve symbol `CharCodingConfig`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java

    /**
     * Sets {@link CharCodingConfig} configuration.
     */
    public final HttpAsyncClientBuilder setCharCodingConfig(final CharCodingConfig charCodingConfig) {
```

### JavadocReference
Cannot resolve symbol `IOReactorConfig`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java

    /**
     * Sets {@link IOReactorConfig} configuration.
     */
    public final HttpAsyncClientBuilder setIOReactorConfig(final IOReactorConfig ioReactorConfig) {
```

### JavadocReference
Cannot resolve symbol `IOSession`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java

    /**
     * Sets the {@link IOSession} {@link Decorator} that will be use with the client's IOReactor.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `Decorator`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java

    /**
     * Sets the {@link IOSession} {@link Decorator} that will be use with the client's IOReactor.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `close()`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
     * connection pool using a background thread.
     * <p>
     * One MUST explicitly close HttpClient with {@link CloseableHttpAsyncClient#close()}
     * in order to stop and release the background thread.
     * <p>
```

### JavadocReference
Cannot resolve symbol `ConnPoolControl`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
     *
     * @see #setConnectionManagerShared(boolean)
     * @see ConnPoolControl#closeIdle(TimeValue)
     *
     * @param maxIdleTime maximum time persistent connections can stay idle while kept alive
```

### JavadocReference
Cannot resolve symbol `closeIdle(TimeValue)`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
     *
     * @see #setConnectionManagerShared(boolean)
     * @see ConnPoolControl#closeIdle(TimeValue)
     *
     * @param maxIdleTime maximum time persistent connections can stay idle while kept alive
```

### JavadocReference
Cannot resolve symbol `TimeValue`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
     *
     * @see #setConnectionManagerShared(boolean)
     * @see ConnPoolControl#closeIdle(TimeValue)
     *
     * @param maxIdleTime maximum time persistent connections can stay idle while kept alive
```

### JavadocReference
Cannot resolve symbol `ConnectionReuseStrategy`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link ConnectionReuseStrategy} instance.
     * <p>
     * Please note this strategy applies to HTTP/1.0 and HTTP/1.1 connections only
```

### JavadocReference
Cannot resolve symbol `Http1Config`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java

    /**
     * Sets {@link Http1Config} configuration.
     */
    public final HttpAsyncClientBuilder setHttp1Config(final Http1Config h1Config) {
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/CredentialsProvider.java`
#### Snippet
```java
     *
     * @param authScope the {@link AuthScope authentication scope}
     * @param context the {@link HttpContext http context}
     * @return the credentials
     * @since 5.0
```

### JavadocReference
Cannot resolve symbol `ClassicHttpResponse`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/ExecChainHandler.java`
#### Snippet
```java
 * Important: please note it is required for decorators that implement post execution aspects
 * or response post-processing of any sort to release resources associated with the response
 * by calling {@link ClassicHttpResponse#close()} methods in case of an I/O, protocol or
 * runtime exception, or in case the response is not propagated to the caller.
 * </p>
```

### JavadocReference
Cannot resolve symbol `close()`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/ExecChainHandler.java`
#### Snippet
```java
 * Important: please note it is required for decorators that implement post execution aspects
 * or response post-processing of any sort to release resources associated with the response
 * by calling {@link ClassicHttpResponse#close()} methods in case of an I/O, protocol or
 * runtime exception, or in case the response is not propagated to the caller.
 * </p>
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * @throws IOException in case of a problem or the connection was aborted
     *
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
     @Deprecated
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
     @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
     @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * @throws IOException in case of a problem or the connection was aborted
     *
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * such as {@link #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @see #execute(HttpHost, ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * @throws IOException in case of a problem or the connection was aborted
     *
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * such as {@link #execute(ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * such as {@link #execute(ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * such as {@link #execute(ClassicHttpRequest, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @see #execute(ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @see #execute(ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @see #execute(ClassicHttpRequest, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * associated with the response is fully consumed and the underlying
     * connection is released back to the connection manager automatically
     * in all cases relieving individual {@link HttpClientResponseHandler}s from
     * having to manage resource deallocation internally.
     * </p>
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * associated with the response is fully consumed and the underlying
     * connection is released back to the connection manager automatically
     * in all cases relieving individual {@link HttpClientResponseHandler}s from
     * having to manage resource deallocation internally.
     * </p>
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * associated with the response is fully consumed and the underlying
     * connection is released back to the connection manager automatically
     * in all cases relieving individual {@link HttpClientResponseHandler}s from
     * having to manage resource deallocation internally.
     * </p>
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * associated with the response is fully consumed and the underlying
     * connection is released back to the connection manager automatically
     * in all cases relieving individual {@link HttpClientResponseHandler}s from
     * having to manage resource deallocation internally.
     * </p>
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * @throws IOException in case of a problem or the connection was aborted
     *
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @deprecated It is strongly recommended to use execute methods with {@link HttpClientResponseHandler}
     * such as {@link #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * such as {@link #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * such as {@link #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * such as {@link #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)} in order
     * to ensure automatic resource deallocation by the client.
     * For special cases one can still use {@link #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)}
     * to keep the response object open after the request execution.
     *
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     * to keep the response object open after the request execution.
     *
     * @see #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @see #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @see #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     *
     * @see #execute(ClassicHttpRequest, HttpContext, HttpClientResponseHandler)
     * @see #executeOpen(HttpHost, ClassicHttpRequest, HttpContext)
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/RequestCopier.java`
#### Snippet
```java

/**
 * {@link HttpRequest} copier.
 *
 * @since 5.0
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.support.BasicRequestBuilder`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/RequestCopier.java`
#### Snippet
```java
 * @since 5.0
 *
 * @deprecated Use {@link org.apache.hc.core5.http.support.BasicRequestBuilder}
 */
@Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpException`
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/classic/EchoHandler.java`
#### Snippet
```java
     * @param context   the context
     *
     * @throws HttpException    in case of a problem
     * @throws IOException      in case of an IO problem
     */
```

### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/ConnectionBackoffStrategy.java`
#### Snippet
```java

    /**
     * Determines whether receiving the given {@link HttpResponse} as
     * a result of request execution should result in a backoff
     * signal. Implementations MUST restrict themselves to examining
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheContext.java`
#### Snippet
```java
     * This is the name under which the {@link CacheResponseStatus} of a request
     * (for example, whether it resulted in a cache hit) will be recorded if an
     * {@link HttpContext} is provided during execution.
     */
    public static final String CACHE_RESPONSE_STATUS = "http.cache.response.status";
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheContext.java`
#### Snippet
```java
/**
 * Adaptor class that provides convenience type safe setters and getters
 * for caching {@link HttpContext} attributes.
 *
 * @since 4.3
```

### JavadocReference
Cannot resolve symbol `HttpException`
in `httpclient5/src/main/java/org/apache/hc/client5/http/routing/HttpRoutePlanner.java`
#### Snippet
```java
     * @return  the route that the request should take
     *
     * @throws HttpException    in case of a problem
     */
    HttpRoute determineRoute(HttpHost target, HttpContext context) throws HttpException;
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.io.HttpClientResponseHandler`
in `httpclient5-fluent/src/main/java/org/apache/hc/client5/http/fluent/Executor.java`
#### Snippet
```java
     * connection used for the request might not be released to the pool.
     *
     * @see Response#handleResponse(org.apache.hc.core5.http.io.HttpClientResponseHandler)
     * @see Response#discardContent()
     */
```

### JavadocReference
Cannot resolve symbol `ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ClassicRequestCopier.java`
#### Snippet
```java

/**
 * {@link ClassicHttpRequest} copier.
 *
 * @since 5.0
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.io.support.ClassicRequestBuilder`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ClassicRequestCopier.java`
#### Snippet
```java
 * @since 5.0
 *
 * @deprecated Use {@link org.apache.hc.core5.http.io.support.ClassicRequestBuilder}
 */
@Deprecated
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.io.HttpClientResponseHandler`
in `httpclient5-fluent/src/main/java/org/apache/hc/client5/http/fluent/ContentResponseHandler.java`
#### Snippet
```java

/**
 * {@link org.apache.hc.core5.http.io.HttpClientResponseHandler} implementation
 * that converts {@link org.apache.hc.core5.http.HttpResponse} messages
 * to {@link Content} instances.
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.HttpResponse`
in `httpclient5-fluent/src/main/java/org/apache/hc/client5/http/fluent/ContentResponseHandler.java`
#### Snippet
```java
/**
 * {@link org.apache.hc.core5.http.io.HttpClientResponseHandler} implementation
 * that converts {@link org.apache.hc.core5.http.HttpResponse} messages
 * to {@link Content} instances.
 *
```

### JavadocReference
Cannot resolve symbol `SSLBufferMode`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/DefaultClientTlsStrategy.java`
#### Snippet
```java

    /**
     * @deprecated Use {@link DefaultClientTlsStrategy#DefaultClientTlsStrategy(SSLContext, String[], String[], SSLBufferMode, HostnameVerifier)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpException`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/routing/DefaultRoutePlanner.java`
#### Snippet
```java
     * This implementation returns null.
     *
     * @throws HttpException may be thrown if overridden
     */
    protected HttpHost determineProxy(
```

### JavadocReference
Cannot resolve symbol `HttpException`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/routing/DefaultRoutePlanner.java`
#### Snippet
```java
     * This implementation returns null.
     *
     * @throws HttpException may be thrown if overridden
     */
    protected InetAddress determineLocalAddress(
```

### JavadocReference
Cannot resolve symbol `Cancellable`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/Operations.java`
#### Snippet
```java

    /**
     * Creates a {@link Cancellable} operation handle for an ongoing process
     * or operation that cannot be cancelled. Attempts to cancel the operation
     * with this handle will have no effect.
```

### JavadocReference
Cannot resolve symbol `Cancellable`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/Operations.java`
#### Snippet
```java

    /**
     * Creates a {@link Cancellable} operation handle for an ongoing process
     * or operation represented by a {@link Future}.
     *
```

### JavadocReference
Cannot resolve symbol `TimeValue`
in `httpclient5/src/main/java/org/apache/hc/client5/http/socket/ConnectionSocketFactory.java`
#### Snippet
```java
    /**
     * Creates new, unconnected socket. The socket should subsequently be passed to
     * {@link #connectSocket(TimeValue, Socket, HttpHost, InetSocketAddress, InetSocketAddress,
     *    HttpContext) connectSocket} method.
     *
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/socket/ConnectionSocketFactory.java`
#### Snippet
```java
    /**
     * Creates new, unconnected socket. The socket should subsequently be passed to
     * {@link #connectSocket(TimeValue, Socket, HttpHost, InetSocketAddress, InetSocketAddress,
     *    HttpContext) connectSocket} method.
     *
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/socket/ConnectionSocketFactory.java`
#### Snippet
```java
     * Creates new, unconnected socket. The socket should subsequently be passed to
     * {@link #connectSocket(TimeValue, Socket, HttpHost, InetSocketAddress, InetSocketAddress,
     *    HttpContext) connectSocket} method.
     *
     * @return  a new socket
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/socket/ConnectionSocketFactory.java`
#### Snippet
```java
     * Connects the socket to the target host with the given resolved remote address.
     *
     * @param socket the socket to connect, as obtained from {@link #createSocket(HttpContext)}.
     * {@code null} indicates that a new socket should be created and connected.
     * @param host target host as specified by the caller (end user).
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/socket/ConnectionSocketFactory.java`
#### Snippet
```java
     *
     * @param connectTimeout connect timeout.
     * @param socket the socket to connect, as obtained from {@link #createSocket(HttpContext)}.
     * {@code null} indicates that a new socket should be created and connected.
     * @param host target host as specified by the caller (end user).
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/SSLConnectionSocketFactory.java`
#### Snippet
```java

    /**
     * @deprecated Use {@link #prepareSocket(SSLSocket, HttpContext)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `Resolver`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManagerBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link Resolver} of {@link ConnectionConfig} on a per route basis.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `Resolver`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManagerBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link Resolver} of {@link TlsConfig} on a per host basis.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `PoolReusePolicy`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManagerBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link PoolReusePolicy} value.
     */
    public final PoolingHttpClientConnectionManagerBuilder setConnPoolPolicy(final PoolReusePolicy poolReusePolicy) {
```

### JavadocReference
Cannot resolve symbol `Resolver`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManagerBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link Resolver} of {@link SocketConfig} on a per route basis.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `SocketConfig`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManagerBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link Resolver} of {@link SocketConfig} on a per route basis.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `SocketConfig`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManagerBuilder.java`
#### Snippet
```java

    /**
     * Assigns the same {@link SocketConfig} for all routes.
     */
    public final PoolingHttpClientConnectionManagerBuilder setDefaultSocketConfig(final SocketConfig config) {
```

### JavadocReference
Cannot resolve symbol `PoolConcurrencyPolicy`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManagerBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link PoolConcurrencyPolicy} value.
     */
    public final PoolingHttpClientConnectionManagerBuilder setPoolConcurrencyPolicy(final PoolConcurrencyPolicy poolConcurrencyPolicy) {
```

### JavadocReference
Cannot resolve symbol `HttpConnectionFactory`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManagerBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link HttpConnectionFactory} instance.
     */
    public final PoolingHttpClientConnectionManagerBuilder setConnectionFactory(
```

### JavadocReference
Cannot resolve symbol `TimeValue`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/BasicHttpClientConnectionManager.java`
#### Snippet
```java

    /**
     * @see #setValidateAfterInactivity(TimeValue)
     *
     * @since 5.1
```

### JavadocReference
Cannot resolve symbol `ModalCloseable`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/CloseableHttpAsyncClient.java`
#### Snippet
```java

/**
 * Base implementation of {@link HttpAsyncClient} that also implements {@link ModalCloseable}.
 *
 * @since 5.0
```

### JavadocReference
Cannot resolve symbol `HttpRequestExecutor`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link HttpRequestExecutor} instance.
     */
    public final HttpClientBuilder setRequestExecutor(final HttpRequestExecutor requestExec) {
```

### JavadocReference
Cannot resolve symbol `ConnectionReuseStrategy`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link ConnectionReuseStrategy} instance.
     */
    public final HttpClientBuilder setConnectionReuseStrategy(
```

### JavadocReference
Cannot resolve symbol `close()`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
     * connection pool using a background thread.
     * <p>
     * One MUST explicitly close HttpClient with {@link CloseableHttpClient#close()} in order
     * to stop and release the background thread.
     * <p>
```

### JavadocReference
Cannot resolve symbol `ConnPoolControl`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
     *
     * @see #setConnectionManagerShared(boolean)
     * @see ConnPoolControl#closeIdle(TimeValue)
     *
     * @param maxIdleTime maximum time persistent connections can stay idle while kept alive
```

### JavadocReference
Cannot resolve symbol `closeIdle(TimeValue)`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
     *
     * @see #setConnectionManagerShared(boolean)
     * @see ConnPoolControl#closeIdle(TimeValue)
     *
     * @param maxIdleTime maximum time persistent connections can stay idle while kept alive
```

### JavadocReference
Cannot resolve symbol `TimeValue`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
     *
     * @see #setConnectionManagerShared(boolean)
     * @see ConnPoolControl#closeIdle(TimeValue)
     *
     * @param maxIdleTime maximum time persistent connections can stay idle while kept alive
```

### JavadocReference
Cannot resolve symbol `close()`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
     * connection pool using a background thread.
     * <p>
     * One MUST explicitly close HttpClient with {@link CloseableHttpClient#close()} in order
     * to stop and release the background thread.
     * <p>
```

### JavadocReference
Cannot resolve symbol `ConnPoolControl`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
     *
     * @see #setConnectionManagerShared(boolean)
     * @see ConnPoolControl#closeExpired()
     *
     * @since 4.4
```

### JavadocReference
Cannot resolve symbol `closeExpired()`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
     *
     * @see #setConnectionManagerShared(boolean)
     * @see ConnPoolControl#closeExpired()
     *
     * @since 4.4
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.config.Lookup`
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/HttpClientContext.java`
#### Snippet
```java

    /**
     * Attribute name of a {@link org.apache.hc.core5.http.config.Lookup} object that represents
     * the actual {@link AuthSchemeFactory} registry.
     */
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/HttpClientContext.java`
#### Snippet
```java
/**
 * Adaptor class that provides convenience type safe setters and getters
 * for common {@link HttpContext} attributes used in the course
 * of HTTP request execution.
 *
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.config.Lookup`
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/HttpClientContext.java`
#### Snippet
```java

    /**
     * Attribute name of a {@link org.apache.hc.core5.http.config.Lookup} object that represents
     * the actual {@link CookieSpecFactory} registry.
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.HttpHost`
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/HttpClientContext.java`
#### Snippet
```java
    /**
     * Attribute name of a map containing actual {@link AuthExchange}s keyed by their respective
     * {@link org.apache.hc.core5.http.HttpHost}.
     */
    public static final String AUTH_EXCHANGE_MAP     = "http.auth.exchanges";
```

### JavadocReference
Cannot resolve symbol `Resolver`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManagerBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link Resolver} of {@link ConnectionConfig} on a per route basis.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `Resolver`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManagerBuilder.java`
#### Snippet
```java
     * connections must be checked to ensure they are still valid.
     *
     * @deprecated Use {@link #setConnectionConfigResolver(Resolver)}.
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `Resolver`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManagerBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link Resolver} of {@link TlsConfig} on a per host basis.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `PoolReusePolicy`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManagerBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link PoolReusePolicy} value.
     */
    public final PoolingAsyncClientConnectionManagerBuilder setConnPoolPolicy(final PoolReusePolicy poolReusePolicy) {
```

### JavadocReference
Cannot resolve symbol `PoolConcurrencyPolicy`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManagerBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link PoolConcurrencyPolicy} value.
     */
    public final PoolingAsyncClientConnectionManagerBuilder setPoolConcurrencyPolicy(final PoolConcurrencyPolicy poolConcurrencyPolicy) {
```

### JavadocReference
Cannot resolve symbol `TlsStrategy`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManagerBuilder.java`
#### Snippet
```java

    /**
     * Assigns {@link TlsStrategy} instance for TLS connections.
     */
    public final PoolingAsyncClientConnectionManagerBuilder setTlsStrategy(
```

### JavadocReference
Cannot resolve symbol `ContentType`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/UrlEncodedFormEntity.java`
#### Snippet
```java
    /**
     * Constructs a new {@link UrlEncodedFormEntity} with the list
     * of parameters with the default encoding of {@link ContentType#APPLICATION_FORM_URLENCODED}
     *
     * @param parameters list of name/value pairs
```

### JavadocReference
Cannot resolve symbol `APPLICATION_FORM_URLENCODED`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/UrlEncodedFormEntity.java`
#### Snippet
```java
    /**
     * Constructs a new {@link UrlEncodedFormEntity} with the list
     * of parameters with the default encoding of {@link ContentType#APPLICATION_FORM_URLENCODED}
     *
     * @param parameters list of name/value pairs
```

### JavadocReference
Cannot resolve symbol `ContentType`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/UrlEncodedFormEntity.java`
#### Snippet
```java
    /**
     * Constructs a new {@link UrlEncodedFormEntity} with the list
     * of parameters with the default encoding of {@link ContentType#APPLICATION_FORM_URLENCODED}
     *
     * @param parameters iterable collection of name/value pairs
```

### JavadocReference
Cannot resolve symbol `APPLICATION_FORM_URLENCODED`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/UrlEncodedFormEntity.java`
#### Snippet
```java
    /**
     * Constructs a new {@link UrlEncodedFormEntity} with the list
     * of parameters with the default encoding of {@link ContentType#APPLICATION_FORM_URLENCODED}
     *
     * @param parameters iterable collection of name/value pairs
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.io.HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/BasicHttpClientResponseHandler.java`
#### Snippet
```java

/**
 * A {@link org.apache.hc.core5.http.io.HttpClientResponseHandler} that returns
 * the response body as a String for successful (2xx) responses. If the response
 * code was &gt;= 300, the response body is consumed
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.ClassicHttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/BasicHttpClientResponseHandler.java`
#### Snippet
```java
 * If this is used with
 * {@link org.apache.hc.client5.http.classic.HttpClient#execute(
 *  org.apache.hc.core5.http.ClassicHttpRequest,
 *  org.apache.hc.core5.http.io.HttpClientResponseHandler)},
 * HttpClient may handle redirects (3xx responses) internally.
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.io.HttpClientResponseHandler`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/BasicHttpClientResponseHandler.java`
#### Snippet
```java
 * {@link org.apache.hc.client5.http.classic.HttpClient#execute(
 *  org.apache.hc.core5.http.ClassicHttpRequest,
 *  org.apache.hc.core5.http.io.HttpClientResponseHandler)},
 * HttpClient may handle redirects (3xx responses) internally.
 * </p>
```

### JavadocReference
Cannot resolve symbol `SocketConfig`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java

    /**
     * Sets the same {@link SocketConfig} for all routes
     */
    public void setDefaultSocketConfig(final SocketConfig config) {
```

### JavadocReference
Cannot resolve symbol `Resolver`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java
     * @since 4.4
     *
     * @deprecated Use {@link #setConnectionConfigResolver(Resolver)}.
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `Resolver`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java

    /**
     * Sets {@link Resolver} of {@link SocketConfig} on a per route basis.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `SocketConfig`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java

    /**
     * Sets {@link Resolver} of {@link SocketConfig} on a per route basis.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `Resolver`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java

    /**
     * Sets {@link Resolver} of {@link ConnectionConfig} on a per route basis.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `Resolver`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java

    /**
     * @deprecated Use custom {@link #setConnectionConfigResolver(Resolver)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `ConnPoolControl`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java
 * {@code ClientConnectionPoolManager} maintains a maximum limit of connection
 * on a per route basis and in total. Connection limits, however, can be adjusted
 * using {@link ConnPoolControl} methods.
 * <p>
 * Total time to live (TTL) set at construction time defines maximum life span
```

### JavadocReference
Cannot resolve symbol `Resolver`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java

    /**
     * Sets {@link Resolver} of {@link TlsConfig} on a per host basis.
     *
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `Resolver`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java
     * @since 4.4
     *
     * @deprecated Use {@link #setConnectionConfigResolver(Resolver)}.
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.nio.AsyncResponseConsumer`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleResponseConsumer.java`
#### Snippet
```java
 * IMPORTANT: {@link SimpleHttpResponse}s are intended for simple scenarios where entities inclosed
 * in responses are known to be small. It is generally recommended to use streaming
 * {@link org.apache.hc.core5.http.nio.AsyncResponseConsumer}s, for instance, such as based on
 * {@link AbstractCharResponseConsumer} or {@link AbstractBinResponseConsumer}.
 *
```

### JavadocReference
Cannot resolve symbol `ConnectionInitiator`
in `httpclient5/src/main/java/org/apache/hc/client5/http/nio/AsyncClientConnectionManager.java`
#### Snippet
```java
     * of the endpoint is responsible for fully establishing the route to
     * the endpoint target by calling {@link #connect(AsyncConnectionEndpoint,
     * ConnectionInitiator, Timeout, Object, HttpContext, FutureCallback)}
     * in order to connect directly to the target or to the first proxy hop,
     * and optionally calling {@link #upgrade(AsyncConnectionEndpoint, Object, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `Timeout`
in `httpclient5/src/main/java/org/apache/hc/client5/http/nio/AsyncClientConnectionManager.java`
#### Snippet
```java
     * of the endpoint is responsible for fully establishing the route to
     * the endpoint target by calling {@link #connect(AsyncConnectionEndpoint,
     * ConnectionInitiator, Timeout, Object, HttpContext, FutureCallback)}
     * in order to connect directly to the target or to the first proxy hop,
     * and optionally calling {@link #upgrade(AsyncConnectionEndpoint, Object, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/nio/AsyncClientConnectionManager.java`
#### Snippet
```java
     * of the endpoint is responsible for fully establishing the route to
     * the endpoint target by calling {@link #connect(AsyncConnectionEndpoint,
     * ConnectionInitiator, Timeout, Object, HttpContext, FutureCallback)}
     * in order to connect directly to the target or to the first proxy hop,
     * and optionally calling {@link #upgrade(AsyncConnectionEndpoint, Object, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `FutureCallback`
in `httpclient5/src/main/java/org/apache/hc/client5/http/nio/AsyncClientConnectionManager.java`
#### Snippet
```java
     * of the endpoint is responsible for fully establishing the route to
     * the endpoint target by calling {@link #connect(AsyncConnectionEndpoint,
     * ConnectionInitiator, Timeout, Object, HttpContext, FutureCallback)}
     * in order to connect directly to the target or to the first proxy hop,
     * and optionally calling {@link #upgrade(AsyncConnectionEndpoint, Object, HttpContext)}
```

### JavadocReference
Cannot resolve symbol `HttpContext`
in `httpclient5/src/main/java/org/apache/hc/client5/http/nio/AsyncClientConnectionManager.java`
#### Snippet
```java
     * ConnectionInitiator, Timeout, Object, HttpContext, FutureCallback)}
     * in order to connect directly to the target or to the first proxy hop,
     * and optionally calling {@link #upgrade(AsyncConnectionEndpoint, Object, HttpContext)}
     * method to upgrade the underlying transport to Transport Layer Security
     * after having executed a {@code CONNECT} method to all intermediate
```

### JavadocReference
Cannot resolve symbol `org.brotli.dec.BrotliInputStream`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ContentCompressionExec.java`
#### Snippet
```java
     * <li>gzip - see {@link java.util.zip.GZIPInputStream}</li>
     * <li>deflate - see {@link org.apache.hc.client5.http.entity.DeflateInputStream}</li>
     * <li>brotli - see {@link org.brotli.dec.BrotliInputStream}</li>
     * </ul>
     */
```

### JavadocReference
Cannot resolve symbol `cancel()`
in `httpclient5/src/main/java/org/apache/hc/client5/http/io/LeaseRequest.java`
#### Snippet
```java
     * Timeouts are handled with millisecond precision.
     *
     * If {@link #cancel()} is called while this is blocking or
     * before this began, an {@link InterruptedException} will
     * be thrown.
```

### JavadocReference
Cannot resolve symbol `HttpClientResponseHandler`
in `httpclient5-fluent/src/main/java/org/apache/hc/client5/http/fluent/Response.java`
#### Snippet
```java

    /**
     * Handles the response using the specified {@link HttpClientResponseHandler}
     */
    public <T> T handleResponse(final HttpClientResponseHandler<T> handler) throws IOException {
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/HttpAuthenticator.java`
#### Snippet
```java
    /**
     * Generates a response to the authentication challenge based on the actual {@link AuthExchange} state
     * and adds it to the given {@link HttpRequest} message .
     *
     * @param host the hostname of the opposite endpoint.
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheKeyGenerator.java`
#### Snippet
```java

    /**
     * Computes a key for the given {@link HttpHost} and {@link HttpRequest}
     * that can be used as a unique identifier for cached resources. if the request has a
     * {@literal VARY} header the identifier will also include variant key.
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheKeyGenerator.java`
#### Snippet
```java

    /**
     * Computes a key for the given {@link HttpHost} and {@link HttpRequest}
     * that can be used as a unique identifier for cached resources. if the request has a
     * {@literal VARY} header the identifier will also include variant key.
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheKeyGenerator.java`
#### Snippet
```java
     *
     * @param host The host for this request
     * @param request the {@link HttpRequest}
     * @param entry the parent entry used to track the variants
     * @return cache key
```

### JavadocReference
Cannot resolve symbol `HttpHost`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheKeyGenerator.java`
#### Snippet
```java

    /**
     * Computes a key for the given {@link HttpHost} and {@link HttpRequest}
     * that can be used as a unique identifier for cached resources.
     *
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheKeyGenerator.java`
#### Snippet
```java

    /**
     * Computes a key for the given {@link HttpHost} and {@link HttpRequest}
     * that can be used as a unique identifier for cached resources.
     *
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheKeyGenerator.java`
#### Snippet
```java
     *
     * @param host The host for this request
     * @param request the {@link HttpRequest}
     * @return cache key
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.hc.core5.http.io.support.ClassicRequestBuilder`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/methods/ClassicHttpRequests.java`
#### Snippet
```java
 * @since 5.0
 *
 * @deprecated Use {@link org.apache.hc.core5.http.io.support.ClassicRequestBuilder}
 */
@Deprecated
```

### JavadocReference
Cannot resolve symbol `HttpEntity`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MultipartEntityBuilder.java`
#### Snippet
```java

/**
 * Builder for multipart {@link HttpEntity}s.
 *
 * @since 5.0
```

### JavadocReference
Cannot resolve symbol `ContentType`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MultipartEntityBuilder.java`
#### Snippet
```java
    }
    /**
     *  Add parameter to the current {@link ContentType}.
     *
     * @param parameter The name-value pair parameter to add to the {@link ContentType}.
```

### JavadocReference
Cannot resolve symbol `ContentType`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MultipartEntityBuilder.java`
#### Snippet
```java
     *  Add parameter to the current {@link ContentType}.
     *
     * @param parameter The name-value pair parameter to add to the {@link ContentType}.
     * @return the {@link MultipartEntityBuilder} instance.
     * @since 5.2
```

### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpByteArrayCacheEntrySerializer.java`
#### Snippet
```java
     *
     * @param httpResponse HTTP response object to un-escape headers in
     * @see #unescapeHeaders(HttpResponse) for the corresponding escaper
     */
    private void unescapeHeaders(final HttpResponse httpResponse) {
```

### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpByteArrayCacheEntrySerializer.java`
#### Snippet
```java
     *
     * @param httpResponse HTTP response object to escape headers in
     * @see #unescapeHeaders(HttpResponse) for the corresponding un-escaper.
     */
    private static void escapeHeaders(final HttpResponse httpResponse) {
```

### JavadocReference
Cannot resolve symbol `TimeValue`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpByteArrayCacheEntrySerializer.java`
#### Snippet
```java

    /**
     * Cache validity policy that always returns an age of {@link TimeValue#ZERO_MILLISECONDS}.
     *
     * This prevents the Age header from being written to the cache (it does not make sense to cache it),
```

### JavadocReference
Cannot resolve symbol `ZERO_MILLISECONDS`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpByteArrayCacheEntrySerializer.java`
#### Snippet
```java

    /**
     * Cache validity policy that always returns an age of {@link TimeValue#ZERO_MILLISECONDS}.
     *
     * This prevents the Age header from being written to the cache (it does not make sense to cache it),
```

### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ResponseCachingPolicy.java`
#### Snippet
```java

    /**
     * Determine if the {@link HttpResponse} gotten from the origin is a
     * cacheable response.
     *
```

### JavadocReference
Cannot resolve symbol `HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ResponseCachingPolicy.java`
#### Snippet
```java
     * cacheable response.
     *
     * @param request the {@link HttpRequest} that generated an origin hit
     * @param response the {@link HttpResponse} from the origin
     * @return {@code true} if response is cacheable
```

### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ResponseCachingPolicy.java`
#### Snippet
```java
     *
     * @param request the {@link HttpRequest} that generated an origin hit
     * @param response the {@link HttpResponse} from the origin
     * @return {@code true} if response is cacheable
     */
```

### JavadocReference
Cannot resolve symbol `HttpResponse`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ResponseCachingPolicy.java`
#### Snippet
```java
    /**
     * Define a cache policy that limits the size of things that should be stored
     * in the cache to a maximum of {@link HttpResponse} bytes in size.
     *
     * @param maxObjectSizeBytes the size to limit items into the cache
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Condition `cause instanceof HttpException` is redundant and can be replaced with a null check
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/DefaultAsyncCacheRevalidator.java`
#### Snippet
```java
                if (cause instanceof IOException) {
                    LOG.debug("Asynchronous revalidation failed due to I/O error", cause);
                } else if (cause instanceof HttpException) {
                    LOG.error("HTTP protocol exception during asynchronous revalidation", cause);
                } else {
```

### DataFlowIssue
Condition `underlyingStream instanceof ChunkedInputStream` is redundant and can be replaced with a null check
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ResponseEntityProxy.java`
#### Snippet
```java
                return () -> {
                    final Header[] footers;
                    if (underlyingStream instanceof ChunkedInputStream) {
                        final ChunkedInputStream chunkedInputStream = (ChunkedInputStream) underlyingStream;
                        footers = chunkedInputStream.getFooters();
```

### DataFlowIssue
Condition `connManagerCopy instanceof ConnPoolControl` is redundant and can be replaced with a null check
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
            }
            if (evictExpiredConnections || evictIdleConnections) {
                if (connManagerCopy instanceof ConnPoolControl) {
                    final IdleConnectionEvictor connectionEvictor = new IdleConnectionEvictor((ConnPoolControl<?>) connManagerCopy,
                            maxIdleTime,  maxIdleTime);
```

### DataFlowIssue
Method invocation `getHopCount` may produce `NullPointerException`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ConnectExec.java`
#### Snippet
```java
                            // route: Source -> P1 -> P2 -> Target (3 hops)
                            // fact:  Source -> P1 -> Target       (2 hops)
                            final int hop = fact.getHopCount()-1; // the hop to establish
                            final boolean secure = createTunnelToProxy(route, hop, context);
                            if (LOG.isDebugEnabled()) {
```

### DataFlowIssue
Condition `runnable instanceof Cancellable` is redundant and can be replaced with a null check
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/InternalAbstractHttpAsyncClient.java`
#### Snippet
```java
        final List<Runnable> runnables = this.scheduledExecutorService.shutdownNow();
        for (final Runnable runnable: runnables) {
            if (runnable instanceof Cancellable) {
                ((Cancellable) runnable).cancel();
            }
```

### DataFlowIssue
Method invocation `toMilliseconds` may produce `NullPointerException`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/BasicHttpClientConnectionManager.java`
#### Snippet
```java
                        LOG.debug("{} Connection can be kept alive for {}", id, keepAlive);
                    }
                    this.expiry = this.updated + keepAlive.toMilliseconds();
                } else {
                    if (LOG.isDebugEnabled()) {
```

### DataFlowIssue
Condition `connManagerCopy instanceof ConnPoolControl` is redundant and can be replaced with a null check
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
            }
            if (evictExpiredConnections || evictIdleConnections) {
                if (connManagerCopy instanceof ConnPoolControl) {
                    final IdleConnectionEvictor connectionEvictor = new IdleConnectionEvictor((ConnPoolControl<?>) connManagerCopy,
                            maxIdleTime, maxIdleTime);
```

### DataFlowIssue
Method invocation `getValue` will produce `NullPointerException`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/HttpAuthenticator.java`
#### Snippet
```java
                pos = ((FormattedHeader) header).getValuePos();
            } else {
                final String s = header.getValue();
                if (s == null) {
                    continue;
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/DefaultHostnameVerifier.java`
#### Snippet
```java
                        if (o instanceof String) {
                            result.add(new SubjectName((String) o, type));
                        } else if (o instanceof byte[]) {
                            // TODO ASN.1 DER encoded form
                        }
```

### EmptyStatementBody
`while` statement has empty body
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ManagedHttpCacheStorage.java`
#### Snippet
```java
                }
                this.resources.clear();
                while (this.morque.poll() != null) {
                }
            }
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary arguments
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/BasicScheme.java`
#### Snippet
```java
        final byte[] encodedCreds = this.base64codec.encode(this.buffer.toByteArray());
        this.buffer.reset();
        return StandardAuthScheme.BASIC + " " + new String(encodedCreds, 0, encodedCreds.length, StandardCharsets.US_ASCII);
    }

```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (8 lines)
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/Hex.java`
#### Snippet
```java
    }

    /*

       // Can be replaced in Java 17 with the following:
```

### CommentedOutCode
Commented out code (3 lines)
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
        {
            final byte[] computedSignature = computeSignature( message );
            //            log.info( "SSSSS validateSignature("+seqNumber+")\n"
            //                + "  received: " + DebugUtil.dump( signature ) + "\n"
            //                + "  computed: " + DebugUtil.dump( computedSignature ) );
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'getProxy' is still used
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/RequestConfig.java`
#### Snippet
```java
     */
    @Deprecated
    public HttpHost getProxy() {
        return proxy;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'clearExpired' is still used
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/CookieStore.java`
#### Snippet
```java
     */
    @Deprecated
    boolean clearExpired(Date date);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'createMinimal' is still used
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClients.java`
#### Snippet
```java
     */
    @Deprecated
    public static MinimalHttpAsyncClient createMinimal(
            final HttpVersionPolicy versionPolicy,
            final H2Config h2Config,
```

### DeprecatedIsStillUsed
Deprecated member 'isExpired' is still used
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/Cookie.java`
#### Snippet
```java
     */
    @Deprecated
    boolean isExpired(final Date date);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getExpiryDate' is still used
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/Cookie.java`
#### Snippet
```java
     */
    @Deprecated
    Date getExpiryDate();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'tlsDetailsFactory' is still used
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/ClientTlsStrategyBuilder.java`
#### Snippet
```java
     */
    @Deprecated
    private Factory<SSLEngine, TlsDetails> tlsDetailsFactory;
    private boolean systemProperties;

```

### DeprecatedIsStillUsed
Deprecated member 'setExpiryDate' is still used
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/SetCookie.java`
#### Snippet
```java
     */
    @Deprecated
    void setExpiryDate (Date expiryDate);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'tlsConfig' is still used
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
     */
    @Deprecated
    private TlsConfig tlsConfig;
    private AsyncClientConnectionManager connManager;
    private boolean connManagerShared;
```

### DeprecatedIsStillUsed
Deprecated member 'tlsDetailsFactory' is still used
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/DefaultClientTlsStrategy.java`
#### Snippet
```java
     */
    @Deprecated
    private Factory<SSLEngine, TlsDetails> tlsDetailsFactory;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'prepareSocket' is still used
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/SSLConnectionSocketFactory.java`
#### Snippet
```java
     */
    @Deprecated
    protected void prepareSocket(final SSLSocket socket) throws IOException {
    }

```

### DeprecatedIsStillUsed
Deprecated member 'tlsConfig' is still used
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/InternalHttpAsyncExecRuntime.java`
#### Snippet
```java
     */
    @Deprecated
    private final TlsConfig tlsConfig;
    private final AtomicReference<AsyncConnectionEndpoint> endpointRef;
    private volatile boolean reusable;
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/WarningValue.java`
#### Snippet
```java
    private static final String HOST = "(" + HOSTNAME + ")|(" + IPV4ADDRESS + ")";
    private static final String PORT = "\\d*";
    private static final String HOSTPORT = "(" + HOST + ")(\\:" + PORT + ")?";
    private static final Pattern HOSTPORT_PATTERN = Pattern.compile(HOSTPORT);

```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/LaxMaxAgeHandler.java`
#### Snippet
```java
    public static final LaxMaxAgeHandler INSTANCE = new LaxMaxAgeHandler();

    private final static Pattern MAX_AGE_PATTERN = Pattern.compile("^\\-?[0-9]+$");

    public LaxMaxAgeHandler() {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingAsyncCacheStorage.java`
#### Snippet
```java
                        HttpCacheStorageEntry storageEntry = cas != null ? serializer.deserialize(getStorageObject(cas)) : null;
                        if (storageEntry != null && !key.equals(storageEntry.getKey())) {
                            storageEntry = null;
                        }
                        final HttpCacheEntry existingEntry = storageEntry != null ? storageEntry.getContent() : null;
                        final HttpCacheEntry updatedEntry = casOperation.execute(existingEntry);
```

### DuplicatedCode
Duplicated code
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingAsyncCacheStorage.java`
#### Snippet
```java
                        final Map<String, HttpCacheEntry> resultMap = new HashMap<>();
                        for (final String key: keys) {
                            final String storageKey = digestToStorageKey(key);
                            final T storageObject = storageObjectMap.get(storageKey);
                            if (storageObject != null) {
                                final HttpCacheStorageEntry entry = serializer.deserialize(storageObject);
                                if (key.equals(entry.getKey())) {
                                    resultMap.put(key, entry.getContent());
                                }
                            }
                        }
```

### DuplicatedCode
Duplicated code
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachingExec.java`
#### Snippet
```java
        context.setAttribute(HttpCoreContext.HTTP_REQUEST, request);

        final URIAuthority authority = request.getAuthority();
        final String scheme = request.getScheme();
        final HttpHost target = authority != null ? new HttpHost(scheme, authority) : route.getTargetHost();
        final String via = generateViaHeader(request);

        // default response context
        setResponseStatus(context, CacheResponseStatus.CACHE_MISS);
```

### DuplicatedCode
Duplicated code
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AsyncCachingExec.java`
#### Snippet
```java
        final URIAuthority authority = request.getAuthority();
        final String scheme = request.getScheme();
        final HttpHost target = authority != null ? new HttpHost(scheme, authority) : route.getTargetHost();
        final String via = generateViaHeader(request);

        // default response context
        setResponseStatus(context, CacheResponseStatus.CACHE_MISS);
```

### DuplicatedCode
Duplicated code
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpAsyncCache.java`
#### Snippet
```java
                storage.updateEntry(cacheKey,
                        existing -> cacheUpdateHandler.updateParentCacheEntry(req.getRequestUri(), existing, entry, variantKey, variantCacheKey),
                        new FutureCallback<Boolean>() {

                            @Override
                            public void completed(final Boolean result) {
                                callback.completed(result);
                            }

                            @Override
                            public void failed(final Exception ex) {
                                if (ex instanceof HttpCacheUpdateException) {
                                    if (LOG.isWarnEnabled()) {
                                        LOG.warn("Cannot update cache entry with key {}", cacheKey);
                                    }
                                } else if (ex instanceof ResourceIOException) {
                                    if (LOG.isWarnEnabled()) {
                                        LOG.warn("I/O error updating cache entry with key {}", cacheKey);
                                    }
                                } else {
                                    callback.failed(ex);
                                }
                            }

                            @Override
                            public void cancelled() {
                                callback.cancelled();
                            }

                        });
```

### DuplicatedCode
Duplicated code
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpAsyncCache.java`
#### Snippet
```java
        if (LOG.isDebugEnabled()) {
            LOG.debug("Re-use variant entry: {}; {} / {}", host, new RequestLine(request), variant);
        }
        final String cacheKey = cacheKeyGenerator.generateKey(host, request);
        final HttpCacheEntry entry = variant.getEntry();
        final String variantKey = cacheKeyGenerator.generateVariantKey(request, entry);
        final String variantCacheKey = variant.getCacheKey();
```

### DuplicatedCode
Duplicated code
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpAsyncCache.java`
#### Snippet
```java
            return storeInCache(cacheKey, host, request, updatedEntry, new FutureCallback<Boolean>() {

                @Override
                public void completed(final Boolean result) {
                    callback.completed(updatedEntry);
                }

                @Override
                public void failed(final Exception ex) {
                    callback.failed(ex);
                }

                @Override
                public void cancelled() {
                    callback.cancelled();
                }

            });
```

### DuplicatedCode
Duplicated code
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpCache.java`
#### Snippet
```java
        try {
            storage.updateEntry(cacheKey, existing -> cacheUpdateHandler.updateParentCacheEntry(req.getRequestUri(), existing, entry, variantKey, variantCacheKey));
        } catch (final HttpCacheUpdateException ex) {
            if (LOG.isWarnEnabled()) {
                LOG.warn("Cannot update cache entry with key {}", cacheKey);
            }
        } catch (final ResourceIOException ex) {
            if (LOG.isWarnEnabled()) {
                LOG.warn("I/O error updating cache entry with key {}", cacheKey);
            }
        }
```

### DuplicatedCode
Duplicated code
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpCacheStorage.java`
#### Snippet
```java
        Args.notNull(keys, "Key");
        final Map<String, HttpCacheEntry> resultMap = new HashMap<>(keys.size());
        for (final String key: keys) {
            final HttpCacheEntry entry = getEntry(key);
            if (entry != null) {
                resultMap.put(key, entry);
            }
        }
        return resultMap;
```

### DuplicatedCode
Duplicated code
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachingH2AsyncClientBuilder.java`
#### Snippet
```java
        final CacheConfig config = this.cacheConfig != null ? this.cacheConfig : CacheConfig.DEFAULT;
        // We copy the instance fields to avoid changing them, and rename to avoid accidental use of the wrong version
        ResourceFactory resourceFactoryCopy = this.resourceFactory;
        if (resourceFactoryCopy == null) {
            if (this.cacheDir == null) {
                resourceFactoryCopy = new HeapResourceFactory();
            } else {
                resourceFactoryCopy = new FileResourceFactory(cacheDir);
            }
        }
```

### DuplicatedCode
Duplicated code
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/DefaultAsyncCacheInvalidator.java`
#### Snippet
```java
                    if (uri != null) {
                        if (LOG.isWarnEnabled()) {
                            LOG.warn("{} is not a valid URI", s);
                        }
                        final Header clHdr = request.getFirstHeader(HttpHeaders.CONTENT_LOCATION);
                        if (clHdr != null) {
                            final URI contentLocation = HttpCacheSupport.normalizeQuietly(clHdr.getValue());
                            if (contentLocation != null) {
                                if (!flushAbsoluteUriFromSameHost(uri, contentLocation, cacheKeyResolver, storage)) {
                                    flushRelativeUriFromSameHost(uri, contentLocation, cacheKeyResolver, storage);
                                }
                            }
                        }
                        final Header lHdr = request.getFirstHeader(HttpHeaders.LOCATION);
                        if (lHdr != null) {
                            final URI location = HttpCacheSupport.normalizeQuietly(lHdr.getValue());
                            if (location != null) {
                                flushAbsoluteUriFromSameHost(uri, location, cacheKeyResolver, storage);
                            }
                        }
                    }
```

### DuplicatedCode
Duplicated code
in `httpclient5-fluent/src/main/java/org/apache/hc/client5/http/fluent/Executor.java`
#### Snippet
```java
        final CredentialsStore credentialsStoreSnapshot = credentialsStore;
        if (credentialsStoreSnapshot != null) {
            final Credentials credentials = credentialsStoreSnapshot.getCredentials(new AuthScope(host), null);
            if (credentials != null) {
                final BasicScheme basicScheme = new BasicScheme();
                basicScheme.initPreemptive(credentials);
                this.authCache.put(host, basicScheme);
            }
        }
        return this;
```

### DuplicatedCode
Duplicated code
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/async/AbstractSimpleServerExchangeHandler.java`
#### Snippet
```java
        final SimpleBody body = response.getBody();
        final AsyncEntityProducer entityProducer;
        if (body != null) {
            if (body.isText()) {
                entityProducer = new StringAsyncEntityProducer(body.getBodyText(), body.getContentType());
            } else {
                entityProducer = new BasicAsyncEntityProducer(body.getBodyBytes(), body.getContentType());
            }
        } else {
            entityProducer = null;
        }
```

### DuplicatedCode
Duplicated code
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/async/AsyncRandomHandler.java`
#### Snippet
```java
        final String method = request.getMethod();
        if (!"GET".equalsIgnoreCase(method) &&
                !"HEAD".equalsIgnoreCase(method) &&
                !"POST".equalsIgnoreCase(method) &&
                !"PUT".equalsIgnoreCase(method)) {
            throw new MethodNotSupportedException(method + " not supported by " + getClass().getName());
        }
        final URI uri;
        try {
            uri = request.getUri();
        } catch (final URISyntaxException ex) {
            throw new ProtocolException(ex.getMessage(), ex);
        }
        final String path = uri.getPath();
        final int slash = path.lastIndexOf('/');
```

### DuplicatedCode
Duplicated code
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/async/AsyncRandomHandler.java`
#### Snippet
```java
            final String payload = path.substring(slash + 1);
            final long n;
            if (!payload.isEmpty()) {
                try {
                    n = Long.parseLong(payload);
                } catch (final NumberFormatException ex) {
                    throw new ProtocolException("Invalid request path: " + path);
                }
            } else {
                // random length, but make sure at least something is sent
                n = 1 + (int)(Math.random() * 79.0);
            }
```

### DuplicatedCode
Duplicated code
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/async/AuthenticatingAsyncDecorator.java`
#### Snippet
```java
        final Header h = request.getFirstHeader(HttpHeaders.AUTHORIZATION);
        final String challengeResponse = h != null ? authTokenExtractor.extract(h.getValue()) : null;

        final URIAuthority authority = request.getAuthority();
        final String requestUri = request.getRequestUri();

        final boolean authenticated = authenticator.authenticate(authority, requestUri, challengeResponse);
        final Header expect = request.getFirstHeader(HttpHeaders.EXPECT);
        final boolean expectContinue = expect != null && "100-continue".equalsIgnoreCase(expect.getValue());
```

### DuplicatedCode
Duplicated code
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/async/RedirectingAsyncDecorator.java`
#### Snippet
```java
        if (redirect.location != null) {
            response.addHeader(new BasicHeader(HttpHeaders.LOCATION, redirect.location));
        }
        switch (redirect.connControl) {
            case KEEP_ALIVE:
                response.addHeader(new BasicHeader(HttpHeaders.CONNECTION, HeaderElements.KEEP_ALIVE));
                break;
            case CLOSE:
                response.addHeader(new BasicHeader(HttpHeaders.CONNECTION, HeaderElements.CLOSE));
        }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/HttpRoute.java`
#### Snippet
```java
        if (this.tunnelled == TunnelType.TUNNELLED) {
            cab.append('t');
        }
        if (this.layered == LayerType.LAYERED) {
            cab.append('l');
        }
        if (this.secure) {
            cab.append('s');
        }
        cab.append("}->");
        if (this.proxyChain != null) {
            for (final HttpHost aProxyChain : this.proxyChain) {
                cab.append(aProxyChain);
                cab.append("->");
            }
        }
        cab.append(this.targetHost);
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/AbstractCharPushConsumer.java`
#### Snippet
```java
            final ContentType contentType;
            try {
                contentType = ContentType.parse(entityDetails.getContentType());
            } catch (final UnsupportedCharsetException ex) {
                throw new UnsupportedEncodingException(ex.getMessage());
            }
            Charset charset = contentType != null ? contentType.getCharset() : null;
            if (charset == null) {
                charset = StandardCharsets.US_ASCII;
            }
            setCharset(charset);
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/BasicCookieStore.java`
#### Snippet
```java
        if (date == null) {
            return false;
        }
        lock.writeLock().lock();
        try {
            boolean removed = false;
            for (final Iterator<Cookie> it = cookies.iterator(); it.hasNext(); ) {
                if (it.next().isExpired(date)) {
                    it.remove();
                    removed = true;
                }
            }
            return removed;
        } finally {
            lock.writeLock().unlock();
        }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/FormBodyPartBuilder.java`
#### Snippet
```java
        if (headerCopy.getField(MimeConsts.CONTENT_TYPE) == null) {
            final ContentType contentType;
            if (body instanceof AbstractContentBody) {
                contentType = ((AbstractContentBody) body).getContentType();
            } else {
                contentType = null;
            }
            if (contentType != null) {
                headerCopy.addField(new MimeField(MimeConsts.CONTENT_TYPE, contentType.toString()));
            } else {
                final StringBuilder buffer = new StringBuilder();
                buffer.append(this.body.getMimeType()); // MimeType cannot be null
                if (this.body.getCharset() != null) { // charset may legitimately be null
                    buffer.append("; charset=");
                    buffer.append(this.body.getCharset());
                }
                headerCopy.addField(new MimeField(MimeConsts.CONTENT_TYPE, buffer.toString()));
            }
        }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AbstractMinimalHttpAsyncClientBase.java`
#### Snippet
```java
        future.setDependency(execute(new BasicClientExchangeHandler<>(
                requestProducer,
                responseConsumer,
                new FutureCallback<T>() {

                    @Override
                    public void completed(final T result) {
                        future.completed(result);
                    }

                    @Override
                    public void failed(final Exception ex) {
                        future.failed(ex);
                    }

                    @Override
                    public void cancelled() {
                        future.cancel();
                    }

                }), pushHandlerFactory, context));
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncConnectExec.java`
#### Snippet
```java
            final boolean proxyAuthRequested = authenticator.isChallenged(proxy, ChallengeType.PROXY, response, proxyAuthExchange, context);

            if (authCacheKeeper != null) {
                if (proxyAuthRequested) {
                    authCacheKeeper.updateOnChallenge(proxy, null, proxyAuthExchange, context);
                } else {
                    authCacheKeeper.updateOnNoChallenge(proxy, null, proxyAuthExchange, context);
                }
            }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncProtocolExec.java`
#### Snippet
```java
        if (request.getScheme() == null) {
            request.setScheme(routeTarget.getSchemeName());
        }
        if (request.getAuthority() == null) {
            request.setAuthority(new URIAuthority(routeTarget));
        }

        final URIAuthority authority = request.getAuthority();
        if (authority.getUserInfo() != null) {
            throw new ProtocolException("Request URI authority contains deprecated userinfo component");
        }

        final HttpHost target = new HttpHost(
                request.getScheme(),
                authority.getHostName(),
                schemePortResolver.resolve(request.getScheme(), authority));
        final String pathPrefix = RequestSupport.extractPathPrefix(request);
        final AuthExchange targetAuthExchange = clientContext.getAuthExchange(target);
        final AuthExchange proxyAuthExchange = proxy != null ? clientContext.getAuthExchange(proxy) : new AuthExchange();

        if (!targetAuthExchange.isConnectionBased() &&
                targetAuthExchange.getPathPrefix() != null &&
                !pathPrefix.startsWith(targetAuthExchange.getPathPrefix())) {
            // force re-authentication if the current path prefix does not match
            // that of the previous authentication exchange.
            targetAuthExchange.reset();
        }
        if (targetAuthExchange.getPathPrefix() == null) {
            targetAuthExchange.setPathPrefix(pathPrefix);
        }

        if (authCacheKeeper != null) {
            authCacheKeeper.loadPreemptively(target, pathPrefix, targetAuthExchange, clientContext);
            if (proxy != null) {
                authCacheKeeper.loadPreemptively(proxy, null, proxyAuthExchange, clientContext);
            }
        }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncProtocolExec.java`
#### Snippet
```java
        if (!request.containsHeader(HttpHeaders.AUTHORIZATION)) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("{} target auth state: {}", exchangeId, targetAuthExchange.getState());
            }
            authenticator.addAuthResponse(target, ChallengeType.TARGET, request, targetAuthExchange, clientContext);
        }
        if (!request.containsHeader(HttpHeaders.PROXY_AUTHORIZATION) && !route.isTunnelled()) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("{} proxy auth state: {}", exchangeId, proxyAuthExchange.getState());
            }
            authenticator.addAuthResponse(proxy, ChallengeType.PROXY, request, proxyAuthExchange, clientContext);
        }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncProtocolExec.java`
#### Snippet
```java
                    if (proxyAuthExchange.getState() == AuthExchange.State.SUCCESS
                            && proxyAuthExchange.isConnectionBased()) {
                        if (LOG.isDebugEnabled()) {
                            LOG.debug("{} resetting proxy auth state", exchangeId);
                        }
                        proxyAuthExchange.reset();
                    }
                    if (targetAuthExchange.getState() == AuthExchange.State.SUCCESS
                            && targetAuthExchange.isConnectionBased()) {
                        if (LOG.isDebugEnabled()) {
                            LOG.debug("{} resetting target auth state", exchangeId);
                        }
                        targetAuthExchange.reset();
                    }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncProtocolExec.java`
#### Snippet
```java
final RequestConfig config = context.getRequestConfig();
        if (config.isAuthenticationEnabled()) {
            final boolean targetAuthRequested = authenticator.isChallenged(
                    target, ChallengeType.TARGET, response, targetAuthExchange, context);

            if (authCacheKeeper != null) {
                if (targetAuthRequested) {
                    authCacheKeeper.updateOnChallenge(target, pathPrefix, targetAuthExchange, context);
                } else {
                    authCacheKeeper.updateOnNoChallenge(target, pathPrefix, targetAuthExchange, context);
                }
            }

            final boolean proxyAuthRequested = authenticator.isChallenged(
                    proxy, ChallengeType.PROXY, response, proxyAuthExchange, context);

            if (authCacheKeeper != null) {
                if (proxyAuthRequested) {
                    authCacheKeeper.updateOnChallenge(proxy, null, proxyAuthExchange, context);
                } else {
                    authCacheKeeper.updateOnNoChallenge(proxy, null, proxyAuthExchange, context);
                }
            }

            if (targetAuthRequested) {
                final boolean updated = authenticator.updateAuthState(target, ChallengeType.TARGET, response,
                        targetAuthStrategy, targetAuthExchange, context);

                if (authCacheKeeper != null) {
                    authCacheKeeper.updateOnResponse(target, pathPrefix, targetAuthExchange, context);
                }

                return updated;
            }
            if (proxyAuthRequested) {
                final boolean updated = authenticator.updateAuthState(proxy, ChallengeType.PROXY, response,
                        proxyAuthStrategy, proxyAuthExchange, context);

                if (authCacheKeeper != null) {
                    authCacheKeeper.updateOnResponse(proxy, null, proxyAuthExchange, context);
                }

                return updated;
            }
        }
        return false;
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncRedirectExec.java`
#### Snippet
```java
                            final AuthExchange targetAuthExchange = clientContext.getAuthExchange(currentRoute.getTargetHost());
                            if (LOG.isDebugEnabled()) {
                                LOG.debug("{} resetting target auth state", exchangeId);
                            }
                            targetAuthExchange.reset();
                            if (currentRoute.getProxyHost() != null) {
                                final AuthExchange proxyAuthExchange = clientContext.getAuthExchange(currentRoute.getProxyHost());
                                if (proxyAuthExchange.isConnectionBased()) {
                                    if (LOG.isDebugEnabled()) {
                                        LOG.debug("{} resetting proxy auth state", exchangeId);
                                    }
                                    proxyAuthExchange.reset();
                                }
                            }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncRedirectExec.java`
#### Snippet
```java
        final HttpClientContext clientContext = scope.clientContext;
        RedirectLocations redirectLocations = clientContext.getRedirectLocations();
        if (redirectLocations == null) {
            redirectLocations = new RedirectLocations();
            clientContext.setAttribute(HttpClientContext.REDIRECT_LOCATIONS, redirectLocations);
        }
        redirectLocations.clear();

        final RequestConfig config = clientContext.getRequestConfig();
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
        Args.notBlank(existing, "Existing");
        Args.notBlank(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
        }
        execInterceptors.add(new ExecInterceptorEntry(ExecInterceptorEntry.Position.BEFORE, name, interceptor, existing));
        return this;
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
        Args.notBlank(existing, "Existing");
        Args.notBlank(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
        }
        execInterceptors.add(new ExecInterceptorEntry(ExecInterceptorEntry.Position.AFTER, name, interceptor, existing));
        return this;
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
        Args.notBlank(existing, "Existing");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
        }
        execInterceptors.add(new ExecInterceptorEntry(ExecInterceptorEntry.Position.REPLACE, existing, interceptor, existing));
        return this;
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
        Args.notNull(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
        }
        execInterceptors.add(new ExecInterceptorEntry(ExecInterceptorEntry.Position.FIRST, name, interceptor, null));
        return this;
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
        Args.notNull(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
        }
        execInterceptors.add(new ExecInterceptorEntry(ExecInterceptorEntry.Position.LAST, name, interceptor, null));
        return this;
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
AuthenticationStrategy targetAuthStrategyCopy = this.targetAuthStrategy;
        if (targetAuthStrategyCopy == null) {
            targetAuthStrategyCopy = DefaultAuthenticationStrategy.INSTANCE;
        }
        AuthenticationStrategy proxyAuthStrategyCopy = this.proxyAuthStrategy;
        if (proxyAuthStrategyCopy == null) {
            proxyAuthStrategyCopy = DefaultAuthenticationStrategy.INSTANCE;
        }

        String userAgentCopy = this.userAgent;
        if (userAgentCopy == null) {
            if (systemProperties) {
                userAgentCopy = getProperty("http.agent", null);
            }
            if (userAgentCopy == null) {
                userAgentCopy = VersionInfo.getSoftwareInfo("Apache-HttpAsyncClient",
                        "org.apache.hc.client5", getClass());
            }
        }

        final HttpProcessorBuilder b = HttpProcessorBuilder.create();
        if (requestInterceptors != null) {
            for (final RequestInterceptorEntry entry: requestInterceptors) {
                if (entry.position == RequestInterceptorEntry.Position.FIRST) {
                    b.addFirst(entry.interceptor);
                }
            }
        }
        if (responseInterceptors != null) {
            for (final ResponseInterceptorEntry entry: responseInterceptors) {
                if (entry.position == ResponseInterceptorEntry.Position.FIRST) {
                    b.addFirst(entry.interceptor);
                }
            }
        }
        b.addAll(
                new RequestDefaultHeaders(defaultHeaders),
                new RequestUserAgent(userAgentCopy),
                new RequestExpectContinue(),
                new H2RequestContent(),
                new H2RequestTargetHost(),
                new H2RequestConnControl());
        if (!cookieManagementDisabled) {
            b.add(RequestAddCookies.INSTANCE);
        }
        if (!cookieManagementDisabled) {
            b.add(ResponseProcessCookies.INSTANCE);
        }
        if (requestInterceptors != null) {
            for (final RequestInterceptorEntry entry: requestInterceptors) {
                if (entry.position == RequestInterceptorEntry.Position.LAST) {
                    b.addLast(entry.interceptor);
                }
            }
        }
        if (responseInterceptors != null) {
            for (final ResponseInterceptorEntry entry: responseInterceptors) {
                if (entry.position == ResponseInterceptorEntry.Position.LAST) {
                    b.addLast(entry.interceptor);
                }
            }
        }

        final HttpProcessor httpProcessor = b.build();

        final NamedElementChain<AsyncExecChainHandler> execChainDefinition = new NamedElementChain<>();
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
        final HttpProcessorBuilder b = HttpProcessorBuilder.create();
        if (requestInterceptors != null) {
            for (final RequestInterceptorEntry entry: requestInterceptors) {
                if (entry.position == RequestInterceptorEntry.Position.FIRST) {
                    b.addFirst(entry.interceptor);
                }
            }
        }
        if (responseInterceptors != null) {
            for (final ResponseInterceptorEntry entry: responseInterceptors) {
                if (entry.position == ResponseInterceptorEntry.Position.FIRST) {
                    b.addFirst(entry.interceptor);
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
        if (!cookieManagementDisabled) {
            b.add(RequestAddCookies.INSTANCE);
        }
        if (!cookieManagementDisabled) {
            b.add(ResponseProcessCookies.INSTANCE);
        }
        if (requestInterceptors != null) {
            for (final RequestInterceptorEntry entry: requestInterceptors) {
                if (entry.position == RequestInterceptorEntry.Position.LAST) {
                    b.addLast(entry.interceptor);
                }
            }
        }
        if (responseInterceptors != null) {
            for (final ResponseInterceptorEntry entry: responseInterceptors) {
                if (entry.position == ResponseInterceptorEntry.Position.LAST) {
                    b.addLast(entry.interceptor);
                }
            }
        }
        final HttpProcessor httpProcessor = b.build();
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
        execChainDefinition.addFirst(
                new AsyncConnectExec(
                        new DefaultHttpProcessor(new RequestTargetHost(), new RequestUserAgent(userAgentCopy)),
                        proxyAuthStrategyCopy,
                        schemePortResolver != null ? schemePortResolver : DefaultSchemePortResolver.INSTANCE,
                        authCachingDisabled),
                ChainElement.CONNECT.name());

        execChainDefinition.addFirst(
                new AsyncProtocolExec(
                        targetAuthStrategyCopy,
                        proxyAuthStrategyCopy,
                        schemePortResolver != null ? schemePortResolver : DefaultSchemePortResolver.INSTANCE,
                        authCachingDisabled),
                ChainElement.PROTOCOL.name());

        // Add request retry executor, if not disabled
        if (!automaticRetriesDisabled) {
            HttpRequestRetryStrategy retryStrategyCopy = this.retryStrategy;
            if (retryStrategyCopy == null) {
                retryStrategyCopy = DefaultHttpRequestRetryStrategy.INSTANCE;
            }
            execChainDefinition.addFirst(
                    new AsyncHttpRequestRetryExec(retryStrategyCopy),
                    ChainElement.RETRY.name());
        }

        HttpRoutePlanner routePlannerCopy = this.routePlanner;
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
final DefaultConnectingIOReactor ioReactor = new DefaultConnectingIOReactor(
                ioEventHandlerFactory,
                ioReactorConfig != null ? ioReactorConfig : IOReactorConfig.DEFAULT,
                threadFactory != null ? threadFactory : new DefaultThreadFactory("httpclient-dispatch", true),
                ioSessionDecorator != null ? ioSessionDecorator : LoggingIOSessionDecorator.INSTANCE,
                ioReactorExceptionCallback != null ? ioReactorExceptionCallback : LoggingExceptionCallback.INSTANCE,
                ioSessionListener,
                ioSession -> ioSession.enqueue(new ShutdownCommand(CloseMode.GRACEFUL), Command.Priority.IMMEDIATE));

        if (execInterceptors != null) {
            for (final ExecInterceptorEntry entry: execInterceptors) {
                switch (entry.position) {
                    case AFTER:
                        execChainDefinition.addAfter(entry.existing, entry.interceptor, entry.name);
                        break;
                    case BEFORE:
                        execChainDefinition.addBefore(entry.existing, entry.interceptor, entry.name);
                        break;
                    case REPLACE:
                        execChainDefinition.replace(entry.existing, entry.interceptor);
                        break;
                    case FIRST:
                        execChainDefinition.addFirst(entry.interceptor, entry.name);
                        break;
                    case LAST:
                        // Don't add last, after H2AsyncMainClientExec, as that does not delegate to the chain
                        // Instead, add the interceptor just before it, making it effectively the last interceptor
                        execChainDefinition.addBefore(ChainElement.MAIN_TRANSPORT.name(), entry.interceptor, entry.name);
                        break;
                }
            }
        }

        customizeExecChain(execChainDefinition);

        NamedElementChain<AsyncExecChainHandler>.Node current = execChainDefinition.getLast();
        AsyncExecChainElement execChain = null;
        while (current != null) {
            execChain = new AsyncExecChainElement(current.getValue(), execChain);
            current = current.getPrevious();
        }

        Lookup<AuthSchemeFactory> authSchemeRegistryCopy = this.authSchemeRegistry;
        if (authSchemeRegistryCopy == null) {
            authSchemeRegistryCopy = RegistryBuilder.<AuthSchemeFactory>create()
                    .register(StandardAuthScheme.BASIC, BasicSchemeFactory.INSTANCE)
                    .register(StandardAuthScheme.DIGEST, DigestSchemeFactory.INSTANCE)
                    .register(StandardAuthScheme.NTLM, NTLMSchemeFactory.INSTANCE)
                    .register(StandardAuthScheme.SPNEGO, SPNegoSchemeFactory.DEFAULT)
                    .register(StandardAuthScheme.KERBEROS, KerberosSchemeFactory.DEFAULT)
                    .build();
        }
        Lookup<CookieSpecFactory> cookieSpecRegistryCopy = this.cookieSpecRegistry;
        if (cookieSpecRegistryCopy == null) {
            cookieSpecRegistryCopy = CookieSpecSupport.createDefault();
        }

        CookieStore cookieStoreCopy = this.cookieStore;
        if (cookieStoreCopy == null) {
            cookieStoreCopy = new BasicCookieStore();
        }

        CredentialsProvider credentialsProviderCopy = this.credentialsProvider;
        if (credentialsProviderCopy == null) {
            if (systemProperties) {
                credentialsProviderCopy = new SystemDefaultCredentialsProvider();
            } else {
                credentialsProviderCopy = new BasicCredentialsProvider();
            }
        }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
        if (execInterceptors != null) {
            for (final ExecInterceptorEntry entry: execInterceptors) {
                switch (entry.position) {
                    case AFTER:
                        execChainDefinition.addAfter(entry.existing, entry.interceptor, entry.name);
                        break;
                    case BEFORE:
                        execChainDefinition.addBefore(entry.existing, entry.interceptor, entry.name);
                        break;
                    case REPLACE:
                        execChainDefinition.replace(entry.existing, entry.interceptor);
                        break;
                    case FIRST:
                        execChainDefinition.addFirst(entry.interceptor, entry.name);
                        break;
                    case LAST:
                        // Don't add last, after MainClientExec, as that does not delegate to the chain
                        // Instead, add the interceptor just before it, making it effectively the last interceptor
                        execChainDefinition.addBefore(ChainElement.MAIN_TRANSPORT.name(), entry.interceptor, entry.name);
                        break;
                }
            }
        }

        customizeExecChain(execChainDefinition);
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
        Lookup<AuthSchemeFactory> authSchemeRegistryCopy = this.authSchemeRegistry;
        if (authSchemeRegistryCopy == null) {
            authSchemeRegistryCopy = RegistryBuilder.<AuthSchemeFactory>create()
                .register(StandardAuthScheme.BASIC, BasicSchemeFactory.INSTANCE)
                .register(StandardAuthScheme.DIGEST, DigestSchemeFactory.INSTANCE)
                .register(StandardAuthScheme.NTLM, NTLMSchemeFactory.INSTANCE)
                .register(StandardAuthScheme.SPNEGO, SPNegoSchemeFactory.DEFAULT)
                .register(StandardAuthScheme.KERBEROS, KerberosSchemeFactory.DEFAULT)
                .build();
        }
        Lookup<CookieSpecFactory> cookieSpecRegistryCopy = this.cookieSpecRegistry;
        if (cookieSpecRegistryCopy == null) {
            cookieSpecRegistryCopy = CookieSpecSupport.createDefault();
        }

        CookieStore defaultCookieStore = this.cookieStore;
        if (defaultCookieStore == null) {
            defaultCookieStore = new BasicCookieStore();
        }

        CredentialsProvider defaultCredentialsProvider = this.credentialsProvider;
        if (defaultCredentialsProvider == null) {
            if (systemProperties) {
                defaultCredentialsProvider = new SystemDefaultCredentialsProvider();
            } else {
                defaultCredentialsProvider = new BasicCredentialsProvider();
            }
        }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientProtocolStarter.java`
#### Snippet
```java
new ClientH2StreamMultiplexerFactory(
                    httpProcessor,
                    exchangeHandlerFactory,
                    h2Config,
                    charCodingConfig,
                    new H2StreamListener() {

                        final FramePrinter framePrinter = new FramePrinter();

                        private void logFrameInfo(final String prefix, final RawFrame frame) {
                            try {
                                final LogAppendable logAppendable = new LogAppendable(FRAME_LOG, prefix);
                                framePrinter.printFrameInfo(frame, logAppendable);
                                logAppendable.flush();
                            } catch (final IOException ignore) {
                            }
                        }

                        private void logFramePayload(final String prefix, final RawFrame frame) {
                            try {
                                final LogAppendable logAppendable = new LogAppendable(FRAME_PAYLOAD_LOG, prefix);
                                framePrinter.printPayload(frame, logAppendable);
                                logAppendable.flush();
                            } catch (final IOException ignore) {
                            }
                        }

                        private void logFlowControl(final String prefix, final int streamId, final int delta, final int actualSize) {
                            FLOW_CTRL_LOG.debug("{} stream {} flow control {} -> {}", prefix, streamId, delta, actualSize);
                        }

                        @Override
                        public void onHeaderInput(final HttpConnection connection, final int streamId, final List<? extends Header> headers) {
                            if (HEADER_LOG.isDebugEnabled()) {
                                for (int i = 0; i < headers.size(); i++) {
                                    HEADER_LOG.debug("{} << {}", id, headers.get(i));
                                }
                            }
                        }

                        @Override
                        public void onHeaderOutput(final HttpConnection connection, final int streamId, final List<? extends Header> headers) {
                            if (HEADER_LOG.isDebugEnabled()) {
                                for (int i = 0; i < headers.size(); i++) {
                                    HEADER_LOG.debug("{} >> {}", id, headers.get(i));
                                }
                            }
                        }

                        @Override
                        public void onFrameInput(final HttpConnection connection, final int streamId, final RawFrame frame) {
                            if (FRAME_LOG.isDebugEnabled()) {
                                logFrameInfo(id + " <<", frame);
                            }
                            if (FRAME_PAYLOAD_LOG.isDebugEnabled()) {
                                logFramePayload(id + " <<", frame);
                            }
                        }

                        @Override
                        public void onFrameOutput(final HttpConnection connection, final int streamId, final RawFrame frame) {
                            if (FRAME_LOG.isDebugEnabled()) {
                                logFrameInfo(id + " >>", frame);
                            }
                            if (FRAME_PAYLOAD_LOG.isDebugEnabled()) {
                                logFramePayload(id + " >>", frame);
                            }
                        }

                        @Override
                        public void onInputFlowControl(final HttpConnection connection, final int streamId, final int delta, final int actualSize) {
                            if (FLOW_CTRL_LOG.isDebugEnabled()) {
                                logFlowControl(id + " <<", streamId, delta, actualSize);
                            }
                        }

                        @Override
                        public void onOutputFlowControl(final HttpConnection connection, final int streamId, final int delta, final int actualSize) {
                            if (FLOW_CTRL_LOG.isDebugEnabled()) {
                                logFlowControl(id + " >>", streamId, delta, actualSize);
                            }
                        }

                    })
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncMainClientExec.java`
#### Snippet
```java
        final String exchangeId = scope.exchangeId;
        final HttpRoute route = scope.route;
        final CancellableDependency operation = scope.cancellableDependency;
        final HttpClientContext clientContext = scope.clientContext;
        final AsyncExecRuntime execRuntime = scope.execRuntime;

        if (LOG.isDebugEnabled()) {
            LOG.debug("{} executing {}", exchangeId, new RequestLine(request));
        }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/InternalAbstractHttpAsyncClient.java`
#### Snippet
```java
        if (this.closeables != null) {
            Closeable closeable;
            while ((closeable = this.closeables.poll()) != null) {
                try {
                    if (closeable instanceof ModalCloseable) {
                        ((ModalCloseable) closeable).close(closeMode);
                    } else {
                        closeable.close();
                    }
                } catch (final IOException ex) {
                    LOG.error(ex.getMessage(), ex);
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/InternalAbstractHttpAsyncClient.java`
#### Snippet
```java
                RequestConfig requestConfig = null;
                if (request instanceof Configurable) {
                    requestConfig = ((Configurable) request).getConfig();
                }
                if (requestConfig != null) {
                    clientContext.setRequestConfig(requestConfig);
                }

                setupContext(clientContext);

                final HttpRoute route = determineRoute(
                        httpHost != null ? httpHost : RoutingSupport.determineHost(request),
                        clientContext);
                final String exchangeId = ExecSupport.getNextExchangeId();
                clientContext.setExchangeId(exchangeId);
                if (LOG.isDebugEnabled()) {
                    LOG.debug("{} preparing request execution", exchangeId);
                }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/InternalHttpClient.java`
#### Snippet
```java
            setupContext(localcontext);
            final HttpRoute route = determineRoute(
                    target != null ? target : RoutingSupport.determineHost(request),
                    localcontext);
            final String exchangeId = ExecSupport.getNextExchangeId();
            localcontext.setExchangeId(exchangeId);
            if (LOG.isDebugEnabled()) {
                LOG.debug("{} preparing request execution", exchangeId);
            }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/InternalHttpAsyncExecRuntime.java`
#### Snippet
```java
        try {
            endpoint.close(CloseMode.IMMEDIATE);
            if (log.isDebugEnabled()) {
                log.debug("{} endpoint closed", ConnPoolSupport.getId(endpoint));
            }
        } finally {
            if (log.isDebugEnabled()) {
                log.debug("{} discarding endpoint", ConnPoolSupport.getId(endpoint));
            }
            manager.release(endpoint, null, TimeValue.ZERO_MILLISECONDS);
        }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/BasicScheme.java`
#### Snippet
```java
        this.paramMap.clear();
        final List<NameValuePair> params = authChallenge.getParams();
        if (params != null) {
            for (final NameValuePair param: params) {
                this.paramMap.put(param.getName().toLowerCase(Locale.ROOT), param.getValue());
            }
        }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
        System.arraycopy(blobSignature, 0, blob, offset, blobSignature.length);
        offset += blobSignature.length;
        System.arraycopy(reserved, 0, blob, offset, reserved.length);
        offset += reserved.length;
        System.arraycopy(timestamp, 0, blob, offset, timestamp.length);
        offset += timestamp.length;
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
            addUShort(lmRespLen);
            addUShort(lmRespLen);

            // LM Resp Offset
            addULong(lmRespOffset);

            // NT Resp Length (twice)
            addUShort(ntRespLen);
            addUShort(ntRespLen);

            // NT Resp Offset
            addULong(ntRespOffset);

            // Domain length (twice)
            addUShort(domainLen);
            addUShort(domainLen);

            // Domain offset.
            addULong(domainOffset);
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ConnectExec.java`
#### Snippet
```java
        Args.notNull(request, "HTTP request");
        Args.notNull(scope, "Scope");

        final String exchangeId = scope.exchangeId;
        final HttpRoute route = scope.route;
        final HttpClientContext context = scope.clientContext;
        final ExecRuntime execRuntime = scope.execRuntime;
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpRequestRetryExec.java`
#### Snippet
```java
                    if (TimeValue.isPositive(nextInterval)) {
                        try {
                            if (LOG.isDebugEnabled()) {
                                LOG.debug("{} wait for {}", exchangeId, nextInterval);
                            }
                            nextInterval.sleep();
                        } catch (final InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                    currentRequest = ClassicRequestBuilder.copy(scope.originalRequest).build();
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/InternalHttpClient.java`
#### Snippet
```java
            final HttpClientContext localcontext = HttpClientContext.adapt(
                    context != null ? context : new BasicHttpContext());
            RequestConfig config = null;
            if (request instanceof Configurable) {
                config = ((Configurable) request).getConfig();
            }
            if (config != null) {
                localcontext.setRequestConfig(config);
            }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/CookieSpecBase.java`
#### Snippet
```java
        String defaultPath = origin.getPath();
        int lastSlashIndex = defaultPath.lastIndexOf('/');
        if (lastSlashIndex >= 0) {
            if (lastSlashIndex == 0) {
                //Do not remove the very first slash
                lastSlashIndex = 1;
            }
            defaultPath = defaultPath.substring(0, lastSlashIndex);
        }
        return defaultPath;
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/BasicHttpClientConnectionManager.java`
#### Snippet
```java
        this.connectionOperator.connect(
                connection,
                host,
                route.getLocalSocketAddress(),
                connectTimeout,
                socketConfig,
                tlsConfig,
                context);
        if (LOG.isDebugEnabled()) {
            LOG.debug("{} connected {}", ConnPoolSupport.getId(endpoint), ConnPoolSupport.getId(conn));
        }
        final Timeout socketTimeout = connectionConfig.getSocketTimeout();
        if (socketTimeout != null) {
            connection.setSocketTimeout(socketTimeout);
        }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java
                    if (poolEntry.hasConnection()) {
                        final TimeValue timeToLive = connectionConfig.getTimeToLive();
                        if (TimeValue.isNonNegative(timeToLive)) {
                            final Deadline deadline = Deadline.calculate(poolEntry.getCreated(), timeToLive);
                            if (deadline.isExpired()) {
                                poolEntry.discardConnection(CloseMode.GRACEFUL);
                            }
                        }
                    }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java
                entry.updateState(state);
                entry.updateExpiry(keepAlive);
                conn.passivate();
                if (LOG.isDebugEnabled()) {
                    final String s;
                    if (TimeValue.isPositive(keepAlive)) {
                        s = "for " + keepAlive;
                    } else {
                        s = "indefinitely";
                    }
                    LOG.debug("{} connection {} can be kept alive {}", ConnPoolSupport.getId(endpoint), ConnPoolSupport.getId(conn), s);
                }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java
        final long now = System.currentTimeMillis();
        if (entry.getExpiryDeadline().isBefore(now)) {
            entry.discardConnection(CloseMode.GRACEFUL);
        } else {
            final ConnectionConfig connectionConfig = resolveConnectionConfig(entry.getRoute());
            final TimeValue timeToLive = connectionConfig.getTimeToLive();
            if (timeToLive != null && Deadline.calculate(entry.getCreated(), timeToLive).isBefore(now)) {
                entry.discardConnection(CloseMode.GRACEFUL);
            }
        }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/ClientTlsStrategyBuilder.java`
#### Snippet
```java
        final String[] tlsVersionsCopy;
        if (tlsVersions != null) {
            tlsVersionsCopy = tlsVersions;
        } else {
            tlsVersionsCopy = systemProperties ? HttpsSupport.getSystemProtocols() : null;
        }
        final String[] ciphersCopy;
        if (ciphers != null) {
            ciphersCopy = ciphers;
        } else {
            ciphersCopy = systemProperties ? HttpsSupport.getSystemCipherSuits() : null;
        }
```

### DuplicatedCode
Duplicated code
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/ByteArrayBuilder.java`
#### Snippet
```java
        if (b == null) {
            return this;
        }
        if ((off < 0) || (off > b.length) || (len < 0) ||
                ((off + len) < 0) || ((off + len) > b.length)) {
            throw new IndexOutOfBoundsException("off: " + off + " len: " + len + " b.length: " + b.length);
        }
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return array but the return type is list
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/CookieSpec.java`
#### Snippet
```java
      * @param header the {@code Set-Cookie} received from the server
      * @param origin details of the cookie origin
      * @return an array of {@code Cookie}s parsed from the header
      * @throws MalformedCookieException if an exception occurs during parsing
      */
```

### MismatchedJavadocCode
Method is specified to return array but the return type is list
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/BasicCookieStore.java`
#### Snippet
```java
     * state currently contains.
     *
     * @return an array of {@link Cookie cookies}.
     */
    @Override
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/SystemDefaultCredentialsProvider.java`
#### Snippet
```java
                        proxyPassword != null ? proxyPassword.toCharArray() : new char[] {});
            }
        } catch (final NumberFormatException ex) {
        }

```

### CatchMayIgnoreException
Empty `catch` block
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
                } catch (final InterruptedException ex) {
                    Thread.currentThread().interrupt();
                } catch (final Exception ex) {
                }

```

### CatchMayIgnoreException
Empty `catch` block
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/IdleConnectionEvictor.java`
#### Snippet
```java
            } catch (final InterruptedException ex) {
                Thread.currentThread().interrupt();
            } catch (final Exception ex) {
            }

```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleAsyncEntityConsumer.java`
#### Snippet
```java

    @Override
    protected int capacityIncrement() {
        return Integer.MAX_VALUE;
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleAsyncEntityConsumer.java`
#### Snippet
```java

    @Override
    protected void streamStart(final ContentType contentType) throws HttpException, IOException {
    }

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleAsyncEntityConsumer.java`
#### Snippet
```java

    @Override
    protected byte[] generateContent() throws IOException {
        return buffer.toByteArray();
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleAsyncEntityConsumer.java`
#### Snippet
```java

    @Override
    protected void data(final ByteBuffer src, final boolean endOfStream) throws IOException {
        if (src == null) {
            return;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/DefaultManagedHttpClientConnection.java`
#### Snippet
```java

    @Override
    protected void onResponseReceived(final ClassicHttpResponse response) {
        if (response != null && HEADER_LOG.isDebugEnabled()) {
            HEADER_LOG.debug("{} << {}", this.id, new StatusLine(response));
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/DefaultManagedHttpClientConnection.java`
#### Snippet
```java

    @Override
    protected void onRequestSubmitted(final ClassicHttpRequest request) {
        if (request != null && HEADER_LOG.isDebugEnabled()) {
            HEADER_LOG.debug("{} >> {}", this.id, new RequestLine(request));
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/async/AbstractSimpleServerExchangeHandler.java`
#### Snippet
```java

            @Override
            protected SimpleHttpRequest buildResult(
                    final HttpRequest request,
                    final byte[] body,
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleResponseConsumer.java`
#### Snippet
```java

    @Override
    protected SimpleHttpResponse buildResult(final HttpResponse response, final byte[] entity, final ContentType contentType) {
        final SimpleHttpResponse simpleResponse = SimpleHttpResponse.copy(response);
        if (entity != null) {
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/FileResource.java`
#### Snippet
```java
            throw new ResourceIOException("Resource already disposed");
        }
        try (final InputStream in = new FileInputStream(file)) {
            final ByteArrayBuffer buf = new ByteArrayBuffer(1024);
            final byte[] tmp = new byte[2048];
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/FileBody.java`
#### Snippet
```java

    public InputStream getInputStream() throws IOException {
        return new FileInputStream(this.file);
    }

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/FileBody.java`
#### Snippet
```java
    public void writeTo(final OutputStream out) throws IOException {
        Args.notNull(out, "Output stream");
        try (InputStream in = new FileInputStream(this.file)) {
            final byte[] tmp = new byte[4096];
            int l;
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixMatcherLoader.java`
#### Snippet
```java
    public static PublicSuffixMatcher load(final File file) throws IOException {
        Args.notNull(file, "File");
        try (InputStream in = new FileInputStream(file)) {
            return load(in);
        }
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MimeField.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder buffer = new StringBuilder();
        buffer.append(this.name);
        buffer.append(": ");
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/FutureRequestExecutionMetrics.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder builder = new StringBuilder();
            builder.append("[count=").append(count())
                    .append(", averageDuration=").append(averageDuration())
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/FutureRequestExecutionMetrics.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("[activeConnections=").append(activeConnections)
                .append(", scheduledConnections=").append(scheduledConnections)
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/KerberosConfig.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("stripPort=").append(stripPort);
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicClientCookie.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder buffer = new StringBuilder();
        buffer.append("[name: ");
        buffer.append(this.name);
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/NTCredentials.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder buffer = new StringBuilder();
        buffer.append("[principal: ");
        buffer.append(this.principal);
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/NTUserPrincipal.java`
#### Snippet
```java
        }
        if (this.domain != null && !this.domain.isEmpty()) {
            final StringBuilder buffer = new StringBuilder();
            buffer.append(this.domain);
            buffer.append('\\');
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/BasicUserPrincipal.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder buffer = new StringBuilder();
        buffer.append("[principal: ");
        buffer.append(this.username);
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheValidityPolicy.java`
#### Snippet
```java
                hdrAge = MAX_AGE.toSeconds();
            }
            ageValue = (hdrAge > ageValue) ? hdrAge : ageValue;
        }
        return ageValue;
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/LoggingInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] b) throws IOException {
        try {
            final int bytesRead = in.read(b);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/LoggingInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] b, final int off, final int len) throws IOException {
        try {
            final int bytesRead = in.read(b, off, len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManager.java`
#### Snippet
```java
            @Override
            public AsyncConnectionEndpoint get(
                    final long timeout, final TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
                return resultFuture.get(timeout, unit);
            }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/DeflateInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] b, final int off, final int len) throws IOException {
        return sourceStream.read(b, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/DeflateInputStream.java`
#### Snippet
```java
     */
    @Override
    public int read(final byte[] b) throws IOException {
        return sourceStream.read(b);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ResponseEntityProxy.java`
#### Snippet
```java

        @Override
        public void write(@SuppressWarnings("unused") final byte[] buffer) {
            // no-op
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ResponseEntityProxy.java`
#### Snippet
```java
        @Override
        public void write(
                @SuppressWarnings("unused") final byte[] buffer,
                @SuppressWarnings("unused") final int off,
                @SuppressWarnings("unused") final int len) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/LoggingOutputStream.java`
#### Snippet
```java

    @Override
    public void write(final byte[] b) throws IOException {
        try {
            wire.output(b);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/LoggingOutputStream.java`
#### Snippet
```java

    @Override
    public void write(final byte[] b, final int off, final int len) throws IOException {
        try {
            wire.output(b, off, len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/Operations.java`
#### Snippet
```java

        @Override
        public T get(final long timeout, final TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
            return result;
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/LazyDecompressingInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] b, final int off, final int len) throws IOException {
        initWrapper();
        return wrapperStream.read(b, off, len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/LazyDecompressingInputStream.java`
#### Snippet
```java

    @Override
    public int read(final byte[] b) throws IOException {
        initWrapper();
        return wrapperStream.read(b);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/HttpEntityDigester.java`
#### Snippet
```java

    @Override
    public void write(final byte[] b, final int off, final int len) throws IOException {
        if (this.closed) {
            throw new IOException("Stream has been already closed");
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/URIUtils.java`
#### Snippet
```java
    /**
     * Resolves a URI reference against a base URI. Work-around for bug in
     * java.net.URI (http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4708535)
     *
     * @param baseURI the base URI
```

### JavadocLinkAsPlainText
Link specified as plain text
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/URIUtils.java`
#### Snippet
```java
    /**
     * Resolves a URI reference against a base URI. Work-around for bugs in
     * java.net.URI (e.g. http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4708535)
     *
     * @param baseURI the base URI
```

### JavadocLinkAsPlainText
Link specified as plain text
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachedResponseSuitabilityChecker.java`
#### Snippet
```java
    /**
     * Check entry against If-Modified-Since, if If-Modified-Since is in the future it is invalid as per
     * http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html
     * @param request The current httpRequest being made
     * @param entry the cache entry
```

### JavadocLinkAsPlainText
Link specified as plain text
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
    /**
     * Cryptography support - MD4. The following class was based loosely on the
     * RFC and on code found at http://www.cs.umd.edu/~harry/jotp/src/md.java.
     * Code correctness was verified by looking at MD4.java from the jcifs
     * library (http://jcifs.samba.org). It was massaged extensively to the
```

### JavadocLinkAsPlainText
Link specified as plain text
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
     * RFC and on code found at http://www.cs.umd.edu/~harry/jotp/src/md.java.
     * Code correctness was verified by looking at MD4.java from the jcifs
     * library (http://jcifs.samba.org). It was massaged extensively to the
     * final form found here by Karl Wright (kwright@metacarta.com).
     */
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/MinimalH2AsyncClient.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(MinimalH2AsyncClient.class);
    private final InternalH2ConnPool connPool;
    private final ConnectionInitiator connectionInitiator;

    MinimalH2AsyncClient(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/IdleConnectionEvictor.java`
#### Snippet
```java
public final class IdleConnectionEvictor {

    private final ThreadFactory threadFactory;
    private final Thread thread;

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/FileResource.java`
#### Snippet
```java
        final File file = this.fileRef.getAndSet(null);
        if (file != null) {
            file.delete();
        }
    }
```

### IgnoreResultOfCall
Result of `InputStream.available()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/SSLConnectionSocketFactory.java`
#### Snippet
```java
                // chain.  Hopefully this will unearth the real problem:
                final InputStream in = sslsock.getInputStream();
                in.available();
                // If ssl.getInputStream().available() didn't cause an
                // exception, maybe at least now the session is available?
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheRevalidatorBase.java`
#### Snippet
```java
            public void awaitTermination(final Timeout timeout) throws InterruptedException {
                Args.notNull(timeout, "Timeout");
                executorService.awaitTermination(timeout.getDuration(), timeout.getTimeUnit());
            }

```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/Wire.java`
#### Snippet
```java
                log.debug("{} {}", this.id, buffer);
                buffer.setLength(0);
            } else if ((ch < 32) || (ch >= 127)) {
                buffer.append("[0x");
                buffer.append(Integer.toHexString(ch));
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `markSupported()` is identical to its super method
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/LoggingInputStream.java`
#### Snippet
```java

    @Override
    public boolean markSupported() {
        return false;
    }
```

### RedundantMethodOverride
Method `markSupported()` is identical to its super method
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/LazyDecompressingInputStream.java`
#### Snippet
```java

    @Override
    public boolean markSupported() {
        return false;
    }
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'IdleConnectionEvictor' used without 'try'-with-resources statement
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
        }
        if (evictIdleConnections) {
            final IdleConnectionEvictor connectionEvictor = new IdleConnectionEvictor(connPool,
                    maxIdleTime != null ? maxIdleTime : TimeValue.ofSeconds(30L));
            closeablesCopy.add(connectionEvictor::shutdown);
```

## RuleId[id=ArrayObjectsEquals]
### ArrayObjectsEquals
Arrays comparison should probably be done using 'Arrays.equals()'
in `httpclient5/src/main/java/org/apache/hc/client5/http/RouteTracker.java`
#### Snippet
```java
            Objects.equals(this.targetHost, that.targetHost) &&
            Objects.equals(this.localAddress, that.localAddress) &&
            Objects.equals(this.proxyChain, that.proxyChain);
    }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Class org.apache.hc.client5.http.cookie.MalformedCookieException is not a descendant of Throwable
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/CookieAttributeHandler.java`
#### Snippet
```java
   * @param cookie {@link org.apache.hc.client5.http.cookie.Cookie} to validate
   * @param origin the cookie source to validate against
   * @throws MalformedCookieException if cookie validation fails for this attribute
   */
  void validate(Cookie cookie, CookieOrigin origin)
```

### JavadocDeclaration
Class org.apache.hc.client5.http.cookie.MalformedCookieException is not a descendant of Throwable
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/CookieAttributeHandler.java`
#### Snippet
```java
   * @param cookie {@link org.apache.hc.client5.http.cookie.Cookie} to be updated
   * @param value cookie attribute value from the cookie response header
   * @throws MalformedCookieException if cookie parsing fails for this attribute
   */
  void parse(SetCookie cookie, String value)
```

### JavadocDeclaration
Class org.apache.hc.client5.http.cookie.MalformedCookieException is not a descendant of Throwable
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/CookieSpec.java`
#### Snippet
```java
      * @param cookie the Cookie to validate
      * @param origin details of the cookie origin
      * @throws MalformedCookieException if the cookie is invalid
      */
    void validate(Cookie cookie, CookieOrigin origin) throws MalformedCookieException;
```

### JavadocDeclaration
Class org.apache.hc.client5.http.cookie.MalformedCookieException is not a descendant of Throwable
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/CookieSpec.java`
#### Snippet
```java
      * @param origin details of the cookie origin
      * @return an array of {@code Cookie}s parsed from the header
      * @throws MalformedCookieException if an exception occurs during parsing
      */
    List<Cookie> parse(Header header, CookieOrigin origin) throws MalformedCookieException;
```

### JavadocDeclaration
`@param uri` tag description is missing
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/URIUtils.java`
#### Snippet
```java
     * Extracts target host from the given {@link URI}.
     *
     * @param uri
     * @return the target host if the URI is absolute or {@code null} if the URI is
     * relative or does not contain a valid host name.
```

### JavadocDeclaration
`@param variants` tag description is missing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ConditionalRequestBuilder.java`
#### Snippet
```java
     *
     * @param request the original request from the caller
     * @param variants
     * @return the wrapped request
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngine.java`
#### Snippet
```java
     * @param challenge Type2 challenge.
     * @return Type3 response.
     * @throws NTLMEngineException
     */
    String generateType3Msg(
```

### JavadocDeclaration
Class org.apache.hc.client5.http.impl.auth.NTLMEngineException is not a descendant of Throwable
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngine.java`
#### Snippet
```java
     * @param challenge Type2 challenge.
     * @return Type3 response.
     * @throws NTLMEngineException
     */
    String generateType3Msg(
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngine.java`
#### Snippet
```java
     *  {@code null}.
     * @return Type1 message
     * @throws NTLMEngineException
     */
    String generateType1Msg(
```

### JavadocDeclaration
Class org.apache.hc.client5.http.impl.auth.NTLMEngineException is not a descendant of Throwable
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngine.java`
#### Snippet
```java
     *  {@code null}.
     * @return Type1 message
     * @throws NTLMEngineException
     */
    String generateType1Msg(
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCacheSupport.java`
#### Snippet
```java
     * @param requestUri original request URI
     * @return normalized URI.
     * @throws URISyntaxException
     */
    public static URI normalize(final URI requestUri) throws URISyntaxException {
```

### JavadocDeclaration
`@param prefix` tag description is missing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/memcached/PrefixKeyHashingScheme.java`
#### Snippet
```java
     * length, so the combination of this prefix plus the results of
     * the backing hashing scheme must still fit within these limits.
     * @param prefix
     * @param backingScheme
     */
```

### JavadocDeclaration
`@param backingScheme` tag description is missing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/memcached/PrefixKeyHashingScheme.java`
#### Snippet
```java
     * the backing hashing scheme must still fit within these limits.
     * @param prefix
     * @param backingScheme
     */
    public PrefixKeyHashingScheme(final String prefix, final KeyHashingScheme backingScheme) {
```

### JavadocDeclaration
Class org.apache.hc.client5.http.impl.auth.NTLMEngineException is not a descendant of Throwable
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
     *            the 8 byte array the server sent.
     * @return The type 3 message.
     * @throws NTLMEngineException
     *             If {@link Type3Message#Type3Message(String, String, String, char[], byte[], int, String, byte[])} fails.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/ResourceFactory.java`
#### Snippet
```java
     * @param resource the original response body to clone.
     * @return the {@code Resource} copy
     * @throws ResourceIOException
     */
    Resource copy(String requestId, Resource resource) throws ResourceIOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/ResourceFactory.java`
#### Snippet
```java
     * @return a {@code Resource} containing however much of
     *   the response body was successfully read.
     * @throws ResourceIOException
     */
    Resource generate(String requestId, byte[] content) throws ResourceIOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/ResourceFactory.java`
#### Snippet
```java
     * @return a {@code Resource} containing however much of
     *   the response body was successfully read.
     * @throws ResourceIOException
     */
    Resource generate(String requestId, byte[] content, int off, int len) throws ResourceIOException;
```

### JavadocDeclaration
Class org.apache.hc.client5.http.auth.AuthenticationException is not a descendant of Throwable
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/AuthScheme.java`
#### Snippet
```java
     * @param request The request being authenticated
     * @param context HTTP context
     * @throws AuthenticationException if authorization string cannot
     *   be generated due to an authentication failure
     *
```

### JavadocDeclaration
Class org.apache.hc.client5.http.auth.MalformedChallengeException is not a descendant of Throwable
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/AuthScheme.java`
#### Snippet
```java
     * @param authChallenge the auth challenge
     * @param context HTTP context
     * @throws MalformedChallengeException in case the auth challenge is incomplete,
     * malformed or otherwise invalid.
     * @since 5.0
```

### JavadocDeclaration
Class org.apache.hc.client5.http.auth.AuthenticationException is not a descendant of Throwable
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/AuthScheme.java`
#### Snippet
```java
     * @param credentialsProvider The credentials to be used for authentication
     * @param context HTTP context
     * @throws AuthenticationException if authorization string cannot
     *   be generated due to an authentication failure
     *
```

### JavadocDeclaration
`@param key` tag description is missing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpAsyncCacheStorage.java`
#### Snippet
```java
     * Deletes/invalidates/removes any cache entries currently
     * stored under the given key.
     * @param key
     * @param callback result callback
     */
```

### JavadocDeclaration
`@param domain` tag description is missing
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixMatcher.java`
#### Snippet
```java
     * if given domain represents a public suffix.
     *
     * @param domain
     * @return domain root
     */
```

### JavadocDeclaration
`@param domain` tag description is missing
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixMatcher.java`
#### Snippet
```java
     * Tests whether the given domain matches any of entry from the public suffix list.
     *
     * @param domain
     * @param expectedType expected domain type or {@code null} if any.
     * @return {@code true} if the given domain matches any of the public suffixes.
```

### JavadocDeclaration
`@param domain` tag description is missing
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixMatcher.java`
#### Snippet
```java
     * if given domain represents a public suffix.
     *
     * @param domain
     * @param expectedType expected domain type or {@code null} if any.
     * @return domain root
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheStorage.java`
#### Snippet
```java
     * @param key where in the cache to store the entry
     * @param entry cached response to store
     * @throws ResourceIOException
     */
    void putEntry(String key, HttpCacheEntry entry) throws ResourceIOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheStorage.java`
#### Snippet
```java
     * @param key indicates which entry to modify
     * @param casOperation the CAS operation to perform.
     * @throws ResourceIOException
     * @throws HttpCacheUpdateException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheStorage.java`
#### Snippet
```java
     * @param casOperation the CAS operation to perform.
     * @throws ResourceIOException
     * @throws HttpCacheUpdateException
     */
    void updateEntry(
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheStorage.java`
#### Snippet
```java
     * @return an {@link HttpCacheEntry} or {@code null} if no
     *   entry exists
     * @throws ResourceIOException
     */
    HttpCacheEntry getEntry(String key) throws ResourceIOException;
```

### JavadocDeclaration
`@param key` tag description is missing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheStorage.java`
#### Snippet
```java
     * Deletes/invalidates/removes any cache entries currently
     * stored under the given key.
     * @param key
     * @throws ResourceIOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheStorage.java`
#### Snippet
```java
     * stored under the given key.
     * @param key
     * @throws ResourceIOException
     */
    void removeEntry(String key) throws ResourceIOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/Resource.java`
#### Snippet
```java
     * Returns resource content as a {@link InputStream}.
     *
     * @throws ResourceIOException
     */
    public InputStream getInputStream() throws ResourceIOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/Resource.java`
#### Snippet
```java
     * value should be treated as immutable.
     *
     * @throws ResourceIOException
     *
     * @since 5.0
```

### JavadocDeclaration
`@param value` tag description is missing
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicClientCookie.java`
#### Snippet
```java
     * Sets the value
     *
     * @param value
     */
    @Override
```

### JavadocDeclaration
`@param gssCredential` tag description is missing
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/KerberosCredentials.java`
#### Snippet
```java
     * Constructor with GSSCredential argument
     *
     * @param gssCredential
     */
    public KerberosCredentials(final GSSCredential gssCredential) {
```

### JavadocDeclaration
`@param ` tag description is missing
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/FutureRequestExecutionService.java`
#### Snippet
```java
     * Schedule a request for execution.
     *
     * @param <T>
     *
     * @param request
```

### JavadocDeclaration
`@param ` tag description is missing
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/FutureRequestExecutionService.java`
#### Snippet
```java
     * Schedule a request for execution.
     *
     * @param <T>
     *
     * @param request
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheEntrySerializer.java`
#### Snippet
```java
     * @param entry cache entry
     * @return serialized representation of the cache entry
     * @throws ResourceIOException
     */
    T serialize(HttpCacheStorageEntry entry) throws ResourceIOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheEntrySerializer.java`
#### Snippet
```java
     * @param serializedObject serialized representation of the cache entry
     * @return cache entry
     * @throws ResourceIOException
     */
    HttpCacheStorageEntry deserialize(T serializedObject) throws ResourceIOException;
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/LaxExpiresHandler.java`
#### Snippet
```java
                        foundYear = true;
                        year = Integer.parseInt(matcher.group(1));
                        continue;
                    }
                }
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `random`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
    private static byte[] makeSecondaryKey(final Random random) {
        final byte[] rval = new byte[16];
        synchronized (random) {
            random.nextBytes(rval);
        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `random`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
    private static byte[] makeRandomChallenge(final Random random) {
        final byte[] rval = new byte[8];
        synchronized (random) {
            random.nextBytes(rval);
        }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `unqualifiedHost` is redundant
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java

            // All host name manipulations now take place in the credentials
            final String unqualifiedHost = host;
            // All domain name manipulations now take place in the credentials
            final String unqualifiedDomain = domain;
```

### UnnecessaryLocalVariable
Local variable `unqualifiedDomain` is redundant
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
            final String unqualifiedHost = host;
            // All domain name manipulations now take place in the credentials
            final String unqualifiedDomain = domain;

            byte[] responseTargetInformation = targetInformation;
```

### UnnecessaryLocalVariable
Local variable `unqualifiedHost` is redundant
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java

            // See HTTPCLIENT-1662
            final String unqualifiedHost = host;
            final String unqualifiedDomain = domain;

```

### UnnecessaryLocalVariable
Local variable `unqualifiedDomain` is redundant
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
            // See HTTPCLIENT-1662
            final String unqualifiedHost = host;
            final String unqualifiedDomain = domain;

            hostBytes = unqualifiedHost != null ?
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `httpclient5/src/main/java/org/apache/hc/client5/http/HttpRoute.java`
#### Snippet
```java
    public HttpRoute(final HttpHost target, final InetAddress local, final HttpHost[] proxies,
                     final boolean secure, final TunnelType tunnelled, final LayerType layered) {
        this(target, local, proxies != null ? Arrays.asList(proxies) : null,
                secure, tunnelled, layered);
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     */
    public EntityBuilder setParameters(final NameValuePair... parameters) {
        return setParameters(Arrays.asList(parameters));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/DefaultHttpClientConnectionOperator.java`
#### Snippet
```java

            if (LOG.isDebugEnabled()) {
                LOG.debug("{} resolved to {}", host.getHostName(), Arrays.asList(remoteAddresses));
            }
        }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ResponseEntityProxy.java`
#### Snippet
```java
                        footers = new Header[0];
                    }
                    return Arrays.asList(footers);
                };
            } catch (final IOException e) {
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/AuthChallenge.java`
#### Snippet
```java

    public AuthChallenge(final ChallengeType challengeType, final String schemeName, final NameValuePair... params) {
        this(challengeType, schemeName, null, Arrays.asList(params));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/MultihomeIOSessionRequester.java`
#### Snippet
```java

        if (LOG.isDebugEnabled()) {
            LOG.debug("{} resolved to {}", remoteEndpoint.getHostName(), Arrays.asList(remoteAddresses));
        }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `httpclient5-fluent/src/main/java/org/apache/hc/client5/http/fluent/Request.java`
#### Snippet
```java

    public Request bodyForm(final NameValuePair... formParams) {
        return bodyForm(Arrays.asList(formParams), StandardCharsets.ISO_8859_1);
    }

```

## RuleId[id=InfiniteRecursion]
### InfiniteRecursion
Method `close()` recurses infinitely, and can only end by throwing an exception
in `httpclient5/src/main/java/org/apache/hc/client5/http/nio/AsyncConnectionEndpoint.java`
#### Snippet
```java

    @Override
    public final void close() throws IOException {
        close(CloseMode.GRACEFUL);
    }
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ResourceReference.java`
#### Snippet
```java

    @Override
    public boolean equals(final Object obj) {
        return this.resource.equals(obj);
    }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `step` initializer `UNREACHABLE` is redundant
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/routing/BasicRouteDirector.java`
#### Snippet
```java
        Args.notNull(plan, "Planned route");

        int step = UNREACHABLE;

        if ((fact == null) || (fact.getHopCount() < 1)) {
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `httpclient5/src/main/java/org/apache/hc/client5/http/RouteTracker.java`
#### Snippet
```java
        final int hopcount = getHopCount();
        Args.check(hop < hopcount, "Hop index exceeds tracked route length");
        HttpHost result = null;
        if (hop < hopcount-1) {
            result = this.proxyChain[hop];
```

### UnusedAssignment
The value `unknown2.length` assigned to `offset` is never used
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
        offset += targetInformation.length;
        System.arraycopy(unknown2, 0, blob, offset, unknown2.length);
        offset += unknown2.length;
        return blob;
    }
```

### UnusedAssignment
The value `transferAmt` assigned to `curBufferPos` is never used
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
                System.arraycopy(input, inputIndex, dataBuffer, curBufferPos, transferAmt);
                count += transferAmt;
                curBufferPos += transferAmt;
            }
        }
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `result` is always 'true'
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingAsyncCacheStorage.java`
#### Snippet
```java
                                public void completed(final Boolean result) {
                                    if (result.booleanValue()) {
                                        callback.completed(result);
                                    } else {
                                        if (!complexCancellable.isCancelled()) {
```

### ConstantValue
Condition `(int) c >=0` is always `true` when reached
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/WarningValue.java`
#### Snippet
```java
     */
    private boolean isControl(final char c) {
        return ((int) c == 127 || ((int) c >=0 && (int) c <= 31));
    }

```

### ConstantValue
Condition `(int) c >= 0` is always `true`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/WarningValue.java`
#### Snippet
```java
     */
    private boolean isChar(final char c) {
        return ((int) c >= 0 && (int) c <= 127);
    }

```

### ConstantValue
Value `hostname` is always 'null'
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/DefaultHostnameVerifier.java`
#### Snippet
```java
    static String normaliseAddress(final String hostname) {
        if (hostname == null) {
            return hostname;
        }
        try {
```

### ConstantValue
Condition `result == null || !result` is always `true`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManager.java`
#### Snippet
```java
                                        if (protocolVersion != null && protocolVersion.greaterEquals(HttpVersion.HTTP_2_0)) {
                                            connection.submitCommand(new PingCommand(new BasicPingHandler(result -> {
                                                if (result == null || !result)  {
                                                    if (LOG.isDebugEnabled()) {
                                                        LOG.debug("{} connection {} is stale", id, ConnPoolSupport.getId(connection));
```

### ConstantValue
Value `cause` is always 'null'
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/DefaultAsyncCacheRevalidator.java`
#### Snippet
```java
                    LOG.error("HTTP protocol exception during asynchronous revalidation", cause);
                } else {
                    LOG.error("Unexpected runtime exception thrown during asynchronous revalidation", cause);
                }
                try {
```

### ConstantValue
Condition `ex instanceof NoHttpResponseException` is always `true`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpRequestRetryExec.java`
#### Snippet
```java
                    continue;
                } else {
                    if (ex instanceof NoHttpResponseException) {
                        final NoHttpResponseException updatedex = new NoHttpResponseException(
                                route.getTargetHost().toHostString() + " failed to respond");
```

### ConstantValue
Condition `closeable instanceof ModalCloseable` is always `true`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/InternalAbstractHttpAsyncClient.java`
#### Snippet
```java
            while ((closeable = this.closeables.poll()) != null) {
                try {
                    if (closeable instanceof ModalCloseable) {
                        ((ModalCloseable) closeable).close(closeMode);
                    } else {
```

### ConstantValue
Value `context` is always 'null'
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheContext.java`
#### Snippet
```java
            return (HttpCacheContext) context;
        } else {
            return new HttpCacheContext(context);
        }
    }
```

### ConstantValue
Condition `future instanceof Cancellable` is always `true`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/Operations.java`
#### Snippet
```java
            return NOOP_CANCELLABLE;
        }
        if (future instanceof Cancellable) {
            return (Cancellable) future;
        }
```

### ConstantValue
Value `context` is always 'null'
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/HttpClientContext.java`
#### Snippet
```java
            return (HttpClientContext) context;
        }
        return new HttpClientContext(context);
    }

```

### ConstantValue
Condition `e instanceof NTLMEngineException` is always `false`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
            return lmResponse(ntlmHash, sessionHash);
        } catch (final Exception e) {
            if (e instanceof NTLMEngineException) {
                throw (NTLMEngineException) e;
            }
```

### ConstantValue
Value `returnString` is always 'null'
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/NTCredentials.java`
#### Snippet
```java
    private static String convertDomain(final String domain) {
        final String returnString = stripDotSuffix(domain);
        return returnString == null ? returnString : returnString.toUpperCase(Locale.ROOT);
    }

```

### ConstantValue
Condition `closeable instanceof ModalCloseable` is always `true`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/InternalHttpClient.java`
#### Snippet
```java
            while ((closeable = this.closeables.poll()) != null) {
                try {
                    if (closeable instanceof ModalCloseable) {
                        ((ModalCloseable) closeable).close(closeMode);
                    } else {
```

### ConstantValue
Condition `config != null` is always `false`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/InternalHttpClient.java`
#### Snippet
```java
                config = ((Configurable) request).getConfig();
            }
            if (config != null) {
                localcontext.setRequestConfig(config);
            }
```

### ConstantValue
Value `request` is always 'null'
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/InternalHttpClient.java`
#### Snippet
```java
            setupContext(localcontext);
            final HttpRoute route = determineRoute(
                    target != null ? target : RoutingSupport.determineHost(request),
                    localcontext);
            final String exchangeId = ExecSupport.getNextExchangeId();
```

### ConstantValue
Value `request` is always 'null'
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/InternalHttpClient.java`
#### Snippet
```java

            final ExecRuntime execRuntime = new InternalExecRuntime(LOG, connManager, requestExecutor,
                    request instanceof CancellableDependency ? (CancellableDependency) request : null);
            final ExecChain.Scope scope = new ExecChain.Scope(exchangeId, route, request, execRuntime, localcontext);
            final ClassicHttpResponse response = this.execChain.execute(ClassicRequestBuilder.copy(request).build(), scope);
```

### ConstantValue
Value `request` is always 'null'
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/InternalHttpClient.java`
#### Snippet
```java
            final ExecRuntime execRuntime = new InternalExecRuntime(LOG, connManager, requestExecutor,
                    request instanceof CancellableDependency ? (CancellableDependency) request : null);
            final ExecChain.Scope scope = new ExecChain.Scope(exchangeId, route, request, execRuntime, localcontext);
            final ClassicHttpResponse response = this.execChain.execute(ClassicRequestBuilder.copy(request).build(), scope);
            return CloseableHttpResponse.adapt(response);
```

### ConstantValue
Value `request` is always 'null'
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/InternalHttpClient.java`
#### Snippet
```java
                    request instanceof CancellableDependency ? (CancellableDependency) request : null);
            final ExecChain.Scope scope = new ExecChain.Scope(exchangeId, route, request, execRuntime, localcontext);
            final ClassicHttpResponse response = this.execChain.execute(ClassicRequestBuilder.copy(request).build(), scope);
            return CloseableHttpResponse.adapt(response);
        } catch (final HttpException httpException) {
```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `redirectCount`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncRedirectExec.java`
#### Snippet
```java
                    }

                    state.redirectCount++;

                    final URI redirectUri = redirectStrategy.getLocationURI(request, response, clientContext);
```

