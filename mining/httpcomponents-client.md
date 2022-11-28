# httpcomponents-client 
 
# Bad smells
I found 855 bad smells with 38 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| IgnoreResultOfCall | 330 | false |
| ReturnNull | 138 | false |
| UnnecessaryFullyQualifiedName | 82 | false |
| BoundedWildcard | 60 | false |
| MissortedModifiers | 41 | false |
| UtilityClassWithoutPrivateConstructor | 18 | true |
| StringBufferReplaceableByString | 16 | false |
| NestedAssignment | 15 | false |
| DeprecatedIsStillUsed | 11 | false |
| NonProtectedConstructorInAbstractClass | 11 | true |
| SynchronizeOnThis | 10 | false |
| ZeroLengthArrayInitialization | 9 | false |
| MethodOverridesStaticMethod | 7 | false |
| RedundantSuppression | 7 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 6 | false |
| EmptyMethod | 6 | false |
| UnnecessaryUnboxing | 5 | false |
| ConstantValue | 5 | false |
| DataFlowIssue | 5 | false |
| NonSerializableFieldInSerializableClass | 5 | false |
| ReplaceAssignmentWithOperatorAssignment | 4 | false |
| InstanceofCatchParameter | 4 | false |
| UnusedAssignment | 4 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 4 | false |
| AssignmentToForLoopParameter | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| RedundantMethodOverride | 3 | false |
| IOResource | 3 | false |
| CatchMayIgnoreException | 3 | false |
| InnerClassMayBeStatic | 3 | true |
| EnumSwitchStatementWhichMissesCases | 2 | false |
| CommentedOutCode | 2 | false |
| RegExpRedundantEscape | 2 | false |
| TrivialStringConcatenation | 2 | false |
| AbstractClassNeverImplemented | 2 | false |
| MethodOverloadsParentMethod | 2 | false |
| MismatchedJavadocCode | 2 | false |
| StringEqualsEmptyString | 2 | false |
| ComparatorResultComparison | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| PointlessArithmeticExpression | 1 | false |
| EmptyStatementBody | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| ManualMinMaxCalculation | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| ArrayObjectsEquals | 1 | false |
| UnnecessaryContinue | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (redirect.connControl) { case KEEP_ALIVE: response.addHeader(new ...` statement on enum type 'org.apache.hc.client5.testing.redirect.Redirect.ConnControl' misses case 'PROTOCOL_DEFAULT'
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/async/RedirectingAsyncDecorator.java`
#### Snippet
```java
            response.addHeader(new BasicHeader(HttpHeaders.LOCATION, redirect.location));
        }
        switch (redirect.connControl) {
            case KEEP_ALIVE:
                response.addHeader(new BasicHeader(HttpHeaders.CONNECTION, HeaderElements.KEEP_ALIVE));
                break;
            case CLOSE:
                response.addHeader(new BasicHeader(HttpHeaders.CONNECTION, HeaderElements.CLOSE));
        }
        return response;
    }
```

### EnumSwitchStatementWhichMissesCases
`switch (redirect.connControl) { case KEEP_ALIVE: respons...` statement on enum type 'org.apache.hc.client5.testing.redirect.Redirect.ConnControl' misses case 'PROTOCOL_DEFAULT'
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/classic/RedirectingDecorator.java`
#### Snippet
```java
                    response.addHeader(new BasicHeader(HttpHeaders.LOCATION, redirect.location));
                }
                switch (redirect.connControl) {
                    case KEEP_ALIVE:
                        response.addHeader(new BasicHeader(HttpHeaders.CONNECTION, HeaderElements.KEEP_ALIVE));
                        break;
                    case CLOSE:
                        response.addHeader(new BasicHeader(HttpHeaders.CONNECTION, HeaderElements.CLOSE));
                }
                responseTrigger.submitResponse(response);
            } else {
```

## RuleId[ruleID=PointlessArithmeticExpression]
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

## RuleId[ruleID=EmptyStatementBody]
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

## RuleId[ruleID=CommentedOutCode]
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

## RuleId[ruleID=RegExpRedundantEscape]
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

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`credMap.size() == 0` can be replaced with 'credMap.isEmpty()'
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/CredentialsProviderBuilder.java`
#### Snippet
```java

    public CredentialsProvider build() {
        if (credMap.size() == 0) {
            return new BasicCredentialsProvider();
        } else if (credMap.size() == 1) {
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/TlsConfig.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("handshakeTimeout=").append(handshakeTimeout);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/ConnectionConfig.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("connectTimeout=").append(connectTimeout);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheConfig.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("[maxObjectSize=").append(this.maxObjectSize)
                .append(", maxCacheEntries=").append(this.maxCacheEntries)
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/RequestConfig.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("expectContinueEnabled=").append(expectContinueEnabled);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleResponseBuilder.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("SimpleResponseBuilder [status=");
        builder.append(getStatus());
```

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
        builder.append("[activeConnections=").append(activeConnections)
                .append(", scheduledConnections=").append(scheduledConnections)
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
`StringBuilder sb` can be replaced with 'String'
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/RequestEntityProxy.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RequestEntityProxy{");
        sb.append(original);
        sb.append('}');
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
`StringBuilder sb` can be replaced with 'String'
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/methods/HttpUriRequestBase.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getMethod()).append(" ").append(getRequestUri());
        return sb.toString();
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
`StringBuilder builder` can be replaced with 'String'
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleRequestBuilder.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("ClassicRequestBuilder [method=");
        builder.append(getMethod());
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
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/NTUserPrincipal.java`
#### Snippet
```java
        }
        if (this.domain != null && !this.domain.isEmpty()) {
            final StringBuilder buffer = new StringBuilder();
            buffer.append(this.domain);
            buffer.append('\\');
```

## RuleId[ruleID=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachedHttpResponseGenerator.java`
#### Snippet
```java
        if (TimeValue.isPositive(age)) {
            if (age.compareTo(CacheValidityPolicy.MAX_AGE) >= 0) {
                response.setHeader(HeaderConstants.AGE, "" + CacheValidityPolicy.MAX_AGE.toSeconds());
            } else {
                response.setHeader(HeaderConstants.AGE, "" + age.toSeconds());
```

### TrivialStringConcatenation
Empty string used in concatenation
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachedHttpResponseGenerator.java`
#### Snippet
```java
                response.setHeader(HeaderConstants.AGE, "" + CacheValidityPolicy.MAX_AGE.toSeconds());
            } else {
                response.setHeader(HeaderConstants.AGE, "" + age.toSeconds());
            }
        }
```

## RuleId[ruleID=ManualMinMaxCalculation]
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

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AbstractBinResponseConsumer` has no concrete subclass
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/AbstractBinResponseConsumer.java`
#### Snippet
```java
 * @param <T> response message representation.
 */
public abstract class AbstractBinResponseConsumer<T> extends AbstractBinDataConsumer implements AsyncResponseConsumer<T> {

    private volatile FutureCallback<T> resultCallback;
```

### AbstractClassNeverImplemented
Abstract class `AbstractCharPushConsumer` has no concrete subclass
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/AbstractCharPushConsumer.java`
#### Snippet
```java
 * @since 5.0
 */
public abstract class AbstractCharPushConsumer extends AbstractCharDataConsumer implements AsyncPushConsumer {

    /**
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super AsyncExecChainHandler`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachingHttpAsyncClientBuilder.java`
#### Snippet
```java

    @Override
    protected void customizeExecChain(final NamedElementChain<AsyncExecChainHandler> execChainDefinition) {
        final CacheConfig config = this.cacheConfig != null ? this.cacheConfig : CacheConfig.DEFAULT;
        // We copy the instance fields to avoid changing them, and rename to avoid accidental use of the wrong version
```

### BoundedWildcard
Can generalize to `? extends AuthScope`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/CredentialsMatcher.java`
#### Snippet
```java
     *
     */
    static Credentials matchCredentials(final Map<AuthScope, Credentials> map, final AuthScope authScope) {
        // see if we get a direct hit
        Credentials creds = map.get(authScope);
```

### BoundedWildcard
Can generalize to `? extends Credentials`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/CredentialsMatcher.java`
#### Snippet
```java
     *
     */
    static Credentials matchCredentials(final Map<AuthScope, Credentials> map, final AuthScope authScope) {
        // see if we get a direct hit
        Credentials creds = map.get(authScope);
```

### BoundedWildcard
Can generalize to `? super URI`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/DefaultCacheInvalidator.java`
#### Snippet
```java
            final URI requestUri,
            final URI uri,
            final Resolver<URI, String> cacheKeyResolver,
            final HttpCacheStorage storage) {
        if (uri != null && isSameHost(requestUri, uri)) {
```

### BoundedWildcard
Can generalize to `? super URI`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/DefaultCacheInvalidator.java`
#### Snippet
```java
            final URI requestUri,
            final URI uri,
            final Resolver<URI, String> cacheKeyResolver,
            final HttpCacheStorage storage) {
        final URI resolvedUri = uri != null ? URIUtils.resolve(requestUri, uri) : null;
```

### BoundedWildcard
Can generalize to `? super URI`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/DefaultCacheInvalidator.java`
#### Snippet
```java
            final URI location,
            final HttpCacheStorage storage,
            final Resolver<URI, String> cacheKeyResolver) {
        final String cacheKey = cacheKeyResolver.resolve(location);
        final HttpCacheEntry entry = getEntry(storage, cacheKey);
```

### BoundedWildcard
Can generalize to `? super ExecChainHandler`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachingHttpClientBuilder.java`
#### Snippet
```java

    @Override
    protected void customizeExecChain(final NamedElementChain<ExecChainHandler> execChainDefinition) {
        final CacheConfig config = this.cacheConfig != null ? this.cacheConfig : CacheConfig.DEFAULT;
        // We copy the instance fields to avoid changing them, and rename to avoid accidental use of the wrong version
```

### BoundedWildcard
Can generalize to `? extends HeaderElement`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/RequestProtocolCompliance.java`
#### Snippet
```java
    }

    private String buildHeaderFromElements(final List<HeaderElement> outElts) {
        final StringBuilder newHdr = new StringBuilder();
        boolean first = true;
```

### BoundedWildcard
Can generalize to `? super HttpRequest`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AsyncCachingExec.java`
#### Snippet
```java
            final RequestProtocolCompliance requestCompliance,
            final DefaultAsyncCacheRevalidator cacheRevalidator,
            final ConditionalRequestBuilder<HttpRequest> conditionalRequestBuilder,
            final CacheConfig config) {
        super(validityPolicy, responseCachingPolicy, responseGenerator, cacheableRequestPolicy,
```

### BoundedWildcard
Can generalize to `? super AsyncExecRuntime`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/AsyncExecRuntime.java`
#### Snippet
```java
     */
    default void upgradeTls(HttpClientContext context,
                            FutureCallback<AsyncExecRuntime> callback) {
        upgradeTls(context);
        if (callback != null) {
```

### BoundedWildcard
Can generalize to `? super Map`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingAsyncCacheStorage.java`
#### Snippet
```java

    @Override
    public final Cancellable getEntries(final Collection<String> keys, final FutureCallback<Map<String, HttpCacheEntry>> callback) {
        Args.notNull(keys, "Storage keys");
        Args.notNull(callback, "Callback");
```

### BoundedWildcard
Can generalize to `? super HttpCacheEntry`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingAsyncCacheStorage.java`
#### Snippet
```java

    @Override
    public final Cancellable getEntry(final String key, final FutureCallback<HttpCacheEntry> callback) {
        Args.notNull(key, "Storage key");
        Args.notNull(callback, "Callback");
```

### BoundedWildcard
Can generalize to `? super HttpCacheEntry`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpAsyncCache.java`
#### Snippet
```java

    @Override
    public Cancellable getCacheEntry(final HttpHost host, final HttpRequest request, final FutureCallback<HttpCacheEntry> callback) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Get cache entry: {}; {}", host, new RequestLine(request));
```

### BoundedWildcard
Can generalize to `? super Map`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpAsyncCache.java`
#### Snippet
```java
    @Override
    public Cancellable getVariantCacheEntriesWithEtags(
            final HttpHost host, final HttpRequest request, final FutureCallback<Map<String, Variant>> callback) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Get variant cache entries: {}; {}", host, new RequestLine(request));
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpAsyncCache.java`
#### Snippet
```java
            final String cacheKey,
            final HttpCacheEntry entry,
            final FutureCallback<Boolean> callback) {
        return storage.putEntry(cacheKey, entry, new FutureCallback<Boolean>() {

```

### BoundedWildcard
Can generalize to `? super HttpCacheEntry`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpAsyncCache.java`
#### Snippet
```java
            final Instant requestSent,
            final Instant responseReceived,
            final FutureCallback<HttpCacheEntry> callback) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Create cache entry: {}; {}", host, new RequestLine(request));
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpAsyncCache.java`
#### Snippet
```java
    @Override
    public Cancellable flushCacheEntriesFor(
            final HttpHost host, final HttpRequest request, final FutureCallback<Boolean> callback) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Flush cache entries: {}; {}", host, new RequestLine(request));
```

### BoundedWildcard
Can generalize to `? super HttpCacheEntry`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpAsyncCache.java`
#### Snippet
```java
            final Instant requestSent,
            final Instant responseReceived,
            final FutureCallback<HttpCacheEntry> callback) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Update variant cache entry: {}; {} / {}", host, new RequestLine(request), variant);
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpAsyncCache.java`
#### Snippet
```java
    @Override
    public Cancellable reuseVariantEntryFor(
            final HttpHost host, final HttpRequest request, final Variant variant, final FutureCallback<Boolean> callback) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Re-use variant entry: {}; {} / {}", host, new RequestLine(request), variant);
```

### BoundedWildcard
Can generalize to `? super HttpCacheEntry`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpAsyncCache.java`
#### Snippet
```java
            final Instant requestSent,
            final Instant responseReceived,
            final FutureCallback<HttpCacheEntry> callback) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Update cache entry: {}; {}", host, new RequestLine(request));
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpAsyncCache.java`
#### Snippet
```java
            final HttpRequest req,
            final HttpCacheEntry entry,
            final FutureCallback<Boolean> callback) {
        final String variantKey = cacheKeyGenerator.generateVariantKey(req, entry);
        final String variantCacheKey = cacheKeyGenerator.generateKey(host, req, entry);
```

### BoundedWildcard
Can generalize to `? super ManagedAsyncClientConnection`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/DefaultAsyncClientConnectionOperator.java`
#### Snippet
```java
            final Object attachment,
            final HttpContext context,
            final FutureCallback<ManagedAsyncClientConnection> callback) {
        final TlsStrategy tlsStrategy = tlsStrategyLookup != null ? tlsStrategyLookup.lookup(host.getSchemeName()) : null;
        if (tlsStrategy != null) {
```

### BoundedWildcard
Can generalize to `? super ManagedAsyncClientConnection`
in `httpclient5/src/main/java/org/apache/hc/client5/http/nio/AsyncClientConnectionOperator.java`
#### Snippet
```java
            Object attachment,
            HttpContext context,
            FutureCallback<ManagedAsyncClientConnection> callback) {
        upgrade(conn, host, attachment, context);
        if (callback != null) {
```

### BoundedWildcard
Can generalize to `? super IOSession`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/InternalH2ConnPool.java`
#### Snippet
```java
            final HttpHost endpoint,
            final Timeout connectTimeout,
            final FutureCallback<IOSession> callback) {
        final ConnectionConfig connectionConfig = resolveConnectionConfig(endpoint);
        return connPool.getSession(
```

### BoundedWildcard
Can generalize to `? super AsyncExecRuntime`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/InternalH2AsyncExecRuntime.java`
#### Snippet
```java
            final Object object,
            final HttpClientContext context,
            final FutureCallback<AsyncExecRuntime> callback) {
        if (sessionRef.get() == null) {
            final HttpHost target = route.getTargetHost();
```

### BoundedWildcard
Can generalize to `? super AsyncExecRuntime`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/InternalH2AsyncExecRuntime.java`
#### Snippet
```java
    public Cancellable connectEndpoint(
            final HttpClientContext context,
            final FutureCallback<AsyncExecRuntime> callback) {
        final Endpoint endpoint = ensureValid();
        if (endpoint.session.isOpen()) {
```

### BoundedWildcard
Can generalize to `? super URI`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/DefaultAsyncCacheInvalidator.java`
#### Snippet
```java
            final HttpRequest request,
            final HttpResponse response,
            final Resolver<URI, String> cacheKeyResolver,
            final HttpAsyncCacheStorage storage,
            final FutureCallback<Boolean> callback) {
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/DefaultAsyncCacheInvalidator.java`
#### Snippet
```java
            final Resolver<URI, String> cacheKeyResolver,
            final HttpAsyncCacheStorage storage,
            final FutureCallback<Boolean> callback) {
        final int status = response.getCode();
        if (status >= HttpStatus.SC_SUCCESS && status < HttpStatus.SC_REDIRECTION) {
```

### BoundedWildcard
Can generalize to `? super URI`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/DefaultAsyncCacheInvalidator.java`
#### Snippet
```java
            final URI requestUri,
            final URI uri,
            final Resolver<URI, String> cacheKeyResolver,
            final HttpAsyncCacheStorage storage) {
        final URI resolvedUri = uri != null ? URIUtils.resolve(requestUri, uri) : null;
```

### BoundedWildcard
Can generalize to `? super URI`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/DefaultAsyncCacheInvalidator.java`
#### Snippet
```java
            final URI requestUri,
            final URI uri,
            final Resolver<URI, String> cacheKeyResolver,
            final HttpAsyncCacheStorage storage) {
        if (uri != null && isSameHost(requestUri, uri)) {
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/DefaultAsyncCacheInvalidator.java`
#### Snippet
```java
            final Resolver<URI, String> cacheKeyResolver,
            final HttpAsyncCacheStorage storage,
            final FutureCallback<Boolean> callback) {
        final String s = HttpCacheSupport.getRequestUri(request, host);
        final URI uri = HttpCacheSupport.normalizeQuietly(s);
```

### BoundedWildcard
Can generalize to `? super HttpRoute`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/AIMDBackoffManager.java`
#### Snippet
```java
    }

    AIMDBackoffManager(final ConnPoolControl<HttpRoute> connPerRoute, final Clock clock) {
        this.clock = clock;
        this.connPerRoute = connPerRoute;
```

### BoundedWildcard
Can generalize to `? super Map`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpAsyncCacheStorageAdaptor.java`
#### Snippet
```java

    @Override
    public Cancellable getEntries(final Collection<String> keys, final FutureCallback<Map<String, HttpCacheEntry>> callback) {
        Args.notNull(keys, "Key");
        Args.notNull(callback, "Callback");
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpAsyncCacheStorageAdaptor.java`
#### Snippet
```java

    @Override
    public Cancellable removeEntry(final String key, final FutureCallback<Boolean> callback) {
        Args.notEmpty(key, "Key");
        Args.notNull(callback, "Callback");
```

### BoundedWildcard
Can generalize to `? super HttpCacheEntry`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpAsyncCacheStorageAdaptor.java`
#### Snippet
```java

    @Override
    public Cancellable getEntry(final String key, final FutureCallback<HttpCacheEntry> callback) {
        Args.notEmpty(key, "Key");
        Args.notNull(callback, "Callback");
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpAsyncCacheStorageAdaptor.java`
#### Snippet
```java
    @Override
    public Cancellable updateEntry(
            final String key, final HttpCacheCASOperation casOperation, final FutureCallback<Boolean> callback) {
        Args.notEmpty(key, "Key");
        Args.notNull(casOperation, "CAS operation");
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpAsyncCacheStorageAdaptor.java`
#### Snippet
```java

    @Override
    public Cancellable putEntry(final String key, final HttpCacheEntry entry, final FutureCallback<Boolean> callback) {
        Args.notEmpty(key, "Key");
        Args.notNull(entry, "Cache entry");
```

### BoundedWildcard
Can generalize to `? extends Cookie`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/RFC6265CookieSpec.java`
#### Snippet
```java

    @Override
    public List<Header> formatCookies(final List<Cookie> cookies) {
        Args.notEmpty(cookies, "List of cookies");
        final List<? extends Cookie> sortedCookies;
```

### BoundedWildcard
Can generalize to `? super HttpRoute`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/ConnPoolSupport.java`
#### Snippet
```java
            final HttpRoute route,
            final Object state,
            final ConnPoolControl<HttpRoute> connPool) {
        final StringBuilder buf = new StringBuilder();
        buf.append("[route: ").append(route).append("]");
```

### BoundedWildcard
Can generalize to `? super SSLEngine`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/DefaultClientTlsStrategy.java`
#### Snippet
```java
            final SSLBufferMode sslBufferManagement,
            final HostnameVerifier hostnameVerifier,
            final Factory<SSLEngine, TlsDetails> tlsDetailsFactory) {
        super(sslContext, supportedProtocols, supportedCipherSuites, sslBufferManagement, hostnameVerifier);
        this.tlsDetailsFactory = tlsDetailsFactory;
```

### BoundedWildcard
Can generalize to `? extends V`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpRequestTaskCallable.java`
#### Snippet
```java
            final ClassicHttpRequest request,
            final HttpContext context,
            final HttpClientResponseHandler<V> responseHandler,
            final FutureCallback<V> callback,
            final FutureRequestExecutionMetrics metrics) {
```

### BoundedWildcard
Can generalize to `? super V`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpRequestTaskCallable.java`
#### Snippet
```java
            final HttpContext context,
            final HttpClientResponseHandler<V> responseHandler,
            final FutureCallback<V> callback,
            final FutureRequestExecutionMetrics metrics) {
        this.httpclient = httpClient;
```

### BoundedWildcard
Can generalize to `? extends Header`
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/ResponseProcessCookies.java`
#### Snippet
```java
    private void processCookies(
            final String exchangeId,
            final Iterator<Header> iterator,
            final CookieSpec cookieSpec,
            final CookieOrigin cookieOrigin,
```

### BoundedWildcard
Can generalize to `? extends T`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/memcached/MemcachedHttpAsyncCacheStorage.java`
#### Snippet
```java
    }

    private <T> Cancellable operation(final OperationFuture<T> operationFuture, final FutureCallback<T> callback) {
        operationFuture.addListener(future -> {
            try {
```

### BoundedWildcard
Can generalize to `? super T`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/memcached/MemcachedHttpAsyncCacheStorage.java`
#### Snippet
```java
    }

    private <T> Cancellable operation(final OperationFuture<T> operationFuture, final FutureCallback<T> callback) {
        operationFuture.addListener(future -> {
            try {
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/memcached/MemcachedHttpAsyncCacheStorage.java`
#### Snippet
```java
    @Override
    protected Cancellable updateCAS(
            final String storageKey, final CASValue<Object> casValue, final byte[] storageObject, final FutureCallback<Boolean> callback) {
        return operation(client.asyncCAS(storageKey, casValue.getCas(), storageObject), new FutureCallback<CASResponse>() {

```

### BoundedWildcard
Can generalize to `? super Map`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/memcached/MemcachedHttpAsyncCacheStorage.java`
#### Snippet
```java

    @Override
    protected Cancellable bulkRestore(final Collection<String> storageKeys, final FutureCallback<Map<String, byte[]>> callback) {
        final BulkFuture<Map<String, Object>> future = client.asyncGetBulk(storageKeys);
        future.addListener(future1 -> {
```

### BoundedWildcard
Can generalize to `? super AsyncConnectionEndpoint`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManager.java`
#### Snippet
```java
            final Object attachment,
            final HttpContext context,
            final FutureCallback<AsyncConnectionEndpoint> callback) {
        Args.notNull(endpoint, "Managed endpoint");
        final InternalConnectionEndpoint internalEndpoint = cast(endpoint);
```

### BoundedWildcard
Can generalize to `? extends Proxy`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/routing/SystemDefaultRoutePlanner.java`
#### Snippet
```java
    }

    private Proxy chooseProxy(final List<Proxy> proxies) {
        Proxy result = null;
        // check the list for one we can use
```

### BoundedWildcard
Can generalize to `? super T`
in `httpclient5-fluent/src/main/java/org/apache/hc/client5/http/fluent/Async.java`
#### Snippet
```java

        ExecRunnable(
                final BasicFuture<T> future,
                final Request request,
                final Executor executor,
```

### BoundedWildcard
Can generalize to `? extends T`
in `httpclient5-fluent/src/main/java/org/apache/hc/client5/http/fluent/Async.java`
#### Snippet
```java
                final Request request,
                final Executor executor,
                final HttpClientResponseHandler<T> handler) {
            super();
            this.future = future;
```

### BoundedWildcard
Can generalize to `? super AsyncExecChainHandler`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachingH2AsyncClientBuilder.java`
#### Snippet
```java

    @Override
    protected void customizeExecChain(final NamedElementChain<AsyncExecChainHandler> execChainDefinition) {
        final CacheConfig config = this.cacheConfig != null ? this.cacheConfig : CacheConfig.DEFAULT;
        // We copy the instance fields to avoid changing them, and rename to avoid accidental use of the wrong version
```

### BoundedWildcard
Can generalize to `? extends InputStreamFactory`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ContentCompressionExec.java`
#### Snippet
```java
    public ContentCompressionExec(
            final List<String> acceptEncoding,
            final Lookup<InputStreamFactory> decoderRegistry,
            final boolean ignoreUnknown) {

```

### BoundedWildcard
Can generalize to `? super AsyncConnectionEndpoint`
in `httpclient5/src/main/java/org/apache/hc/client5/http/nio/AsyncClientConnectionManager.java`
#### Snippet
```java
            Object attachment,
            HttpContext context,
            FutureCallback<AsyncConnectionEndpoint> callback) {
        upgrade(endpoint, attachment, context);
        if (callback != null) {
```

### BoundedWildcard
Can generalize to `? super T`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ConditionalRequestBuilder.java`
#### Snippet
```java
    private final Factory<T, T> messageCopier;

    ConditionalRequestBuilder(final Factory<T, T> messageCopier) {
        this.messageCopier = messageCopier;
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ConditionalRequestBuilder.java`
#### Snippet
```java
    private final Factory<T, T> messageCopier;

    ConditionalRequestBuilder(final Factory<T, T> messageCopier) {
        this.messageCopier = messageCopier;
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/IgnoreCompleteExceptionFutureCallback.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(IgnoreCompleteExceptionFutureCallback.class);

    public IgnoreCompleteExceptionFutureCallback(final FutureCallback<T> callback) {
        super();
        this.callback = callback;
```

### BoundedWildcard
Can generalize to `? super AsyncExecRuntime`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/InternalHttpAsyncExecRuntime.java`
#### Snippet
```java
    public Cancellable connectEndpoint(
            final HttpClientContext context,
            final FutureCallback<AsyncExecRuntime> callback) {
        final AsyncConnectionEndpoint endpoint = ensureValid();
        if (endpoint.isConnected()) {
```

### BoundedWildcard
Can generalize to `? super AsyncExecRuntime`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/InternalHttpAsyncExecRuntime.java`
#### Snippet
```java
            final Object object,
            final HttpClientContext context,
            final FutureCallback<AsyncExecRuntime> callback) {
        if (endpointRef.get() == null) {
            state = object;
```

### BoundedWildcard
Can generalize to `? super AsyncExecRuntime`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/InternalHttpAsyncExecRuntime.java`
#### Snippet
```java

    @Override
    public void upgradeTls(final HttpClientContext context, final FutureCallback<AsyncExecRuntime> callback) {
        final AsyncConnectionEndpoint endpoint = ensureValid();
        if (log.isDebugEnabled()) {
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheConfig.java`
#### Snippet
```java
    /** Default setting for heuristic caching
     */
    public final static boolean DEFAULT_HEURISTIC_CACHING_ENABLED = false;

    /** Default coefficient used to heuristically determine freshness
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheConfig.java`
#### Snippet
```java
    /** Default setting to allow weak tags on PUT/DELETE methods
     */
    public final static boolean DEFAULT_WEAK_ETAG_ON_PUTDELETE_ALLOWED = false;

    /** Default setting for heuristic caching
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheConfig.java`
#### Snippet
```java
     * cache processChallenge
     */
    public final static int DEFAULT_MAX_UPDATE_RETRIES = 1;

    /** Default setting for 303 caching
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheConfig.java`
#### Snippet
```java
     * that will be retained.
     */
    public final static int DEFAULT_MAX_CACHE_ENTRIES = 1000;

    /** Default setting for the number of retries on a failed
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheConfig.java`
#### Snippet
```java
     * cached, in bytes.
     */
    public final static int DEFAULT_MAX_OBJECT_SIZE_BYTES = 8192;

    /** Default setting for the maximum number of cache entries
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheConfig.java`
#### Snippet
```java
     * lifetime from the Last-Modified time of a cache entry.
     */
    public final static float DEFAULT_HEURISTIC_COEFFICIENT = 0.1f;

    /** Default lifetime to be assumed when we cannot calculate
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheConfig.java`
#### Snippet
```java
     * freshness heuristically.
     */
    public final static TimeValue DEFAULT_HEURISTIC_LIFETIME = TimeValue.ZERO_MILLISECONDS;

    /** Default number of worker threads to allow for background revalidations
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheConfig.java`
#### Snippet
```java
    /** Default setting for 303 caching
     */
    public final static boolean DEFAULT_303_CACHING_ENABLED = false;

    /** Default setting to allow weak tags on PUT/DELETE methods
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ResponseCachingPolicy.java`
#### Snippet
```java
    };

    private final static Set<Integer> CACHEABLE_STATUS_CODES =
            new HashSet<>(Arrays.asList(HttpStatus.SC_OK,
                    HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION,
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/AuthChallengeParser.java`
#### Snippet
```java

    private final static char BLANK            = ' ';
    private final static char COMMA_CHAR       = ',';
    private final static char EQUAL_CHAR       = '=';

```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/AuthChallengeParser.java`
#### Snippet
```java
    private final Tokenizer tokenParser = Tokenizer.INSTANCE;

    private final static char BLANK            = ' ';
    private final static char COMMA_CHAR       = ',';
    private final static char EQUAL_CHAR       = '=';
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/AuthChallengeParser.java`
#### Snippet
```java
    private final static char BLANK            = ' ';
    private final static char COMMA_CHAR       = ',';
    private final static char EQUAL_CHAR       = '=';

    // IMPORTANT!
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/InternalAbstractHttpAsyncClient.java`
#### Snippet
```java
abstract class InternalAbstractHttpAsyncClient extends AbstractHttpAsyncClientBase {

    private final static ThreadFactory SCHEDULER_THREAD_FACTORY = new DefaultThreadFactory("Scheduled-executor", true);

    private static final Logger LOG = LoggerFactory.getLogger(InternalAbstractHttpAsyncClient.class);
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/methods/HttpOptions.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    public final static String METHOD_NAME = "OPTIONS";

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/LaxExpiresHandler.java`
#### Snippet
```java
    private final static Pattern MONTH_PATTERN = Pattern.compile(
            "^(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)(.*)?$", Pattern.CASE_INSENSITIVE);
    private final static Pattern YEAR_PATTERN = Pattern.compile(
            "^([0-9]{2,4})([^0-9].*)?$");

```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/LaxExpiresHandler.java`
#### Snippet
```java
    private final static Pattern TIME_PATTERN = Pattern.compile(
            "^([0-9]{1,2}):([0-9]{1,2}):([0-9]{1,2})([^0-9].*)?$");
    private final static Pattern DAY_OF_MONTH_PATTERN = Pattern.compile(
            "^([0-9]{1,2})([^0-9].*)?$");
    private final static Pattern MONTH_PATTERN = Pattern.compile(
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/LaxExpiresHandler.java`
#### Snippet
```java
    }

    private final static Pattern TIME_PATTERN = Pattern.compile(
            "^([0-9]{1,2}):([0-9]{1,2}):([0-9]{1,2})([^0-9].*)?$");
    private final static Pattern DAY_OF_MONTH_PATTERN = Pattern.compile(
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/LaxExpiresHandler.java`
#### Snippet
```java
    private final static Pattern DAY_OF_MONTH_PATTERN = Pattern.compile(
            "^([0-9]{1,2})([^0-9].*)?$");
    private final static Pattern MONTH_PATTERN = Pattern.compile(
            "^(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)(.*)?$", Pattern.CASE_INSENSITIVE);
    private final static Pattern YEAR_PATTERN = Pattern.compile(
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5-fluent/src/main/java/org/apache/hc/client5/http/fluent/Executor.java`
#### Snippet
```java
public class Executor {

    final static CloseableHttpClient CLIENT;

    static {
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/methods/HttpGet.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    public final static String METHOD_NAME = "GET";

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/Operations.java`
#### Snippet
```java
public final class Operations {

    private final static Cancellable NOOP_CANCELLABLE = () -> false;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/methods/HttpPost.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    public final static String METHOD_NAME = "POST";

    /**
```

### MissortedModifiers
Missorted modifiers `final private`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
        private final Cipher rc4;
        final Mode mode;
        final private boolean isConnection;
        int sequenceNumber;

```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/methods/HttpDelete.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    public final static String METHOD_NAME = "DELETE";


```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/methods/HttpPatch.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    public final static String METHOD_NAME = "PATCH";

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/RFC6265CookieSpec.java`
#### Snippet
```java

    private final static char PARAM_DELIMITER  = ';';
    private final static char COMMA_CHAR       = ',';
    private final static char EQUAL_CHAR       = '=';
    private final static char DQUOTE_CHAR      = '"';
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/RFC6265CookieSpec.java`
#### Snippet
```java
    private final static char EQUAL_CHAR       = '=';
    private final static char DQUOTE_CHAR      = '"';
    private final static char ESCAPE_CHAR      = '\\';

    // IMPORTANT!
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/RFC6265CookieSpec.java`
#### Snippet
```java
public class RFC6265CookieSpec implements CookieSpec {

    private final static char PARAM_DELIMITER  = ';';
    private final static char COMMA_CHAR       = ',';
    private final static char EQUAL_CHAR       = '=';
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/RFC6265CookieSpec.java`
#### Snippet
```java
    private final static char PARAM_DELIMITER  = ';';
    private final static char COMMA_CHAR       = ',';
    private final static char EQUAL_CHAR       = '=';
    private final static char DQUOTE_CHAR      = '"';
    private final static char ESCAPE_CHAR      = '\\';
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/RFC6265CookieSpec.java`
#### Snippet
```java
    private final static char COMMA_CHAR       = ',';
    private final static char EQUAL_CHAR       = '=';
    private final static char DQUOTE_CHAR      = '"';
    private final static char ESCAPE_CHAR      = '\\';

```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/async/AsyncRandomHandler.java`
#### Snippet
```java

        /** The range from which to generate random data. */
        private final static byte[] RANGE = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
                .getBytes(StandardCharsets.US_ASCII);

```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/classic/RandomHandler.java`
#### Snippet
```java

        /** The range from which to generate random data. */
        private final static byte[] RANGE = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
                .getBytes(StandardCharsets.US_ASCII);

```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/methods/HttpPut.java`
#### Snippet
```java

    private static final long serialVersionUID = 1L;
    public final static String METHOD_NAME = "PUT";

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/LoggingIOSessionDecorator.java`
#### Snippet
```java
final class LoggingIOSessionDecorator implements Decorator<IOSession> {

    public final static LoggingIOSessionDecorator INSTANCE = new LoggingIOSessionDecorator();

    private static final Logger WIRE_LOG = LoggerFactory.getLogger("org.apache.hc.client5.http.wire");
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/DistinguishedNameParser.java`
#### Snippet
```java
final class DistinguishedNameParser {

    public final static DistinguishedNameParser INSTANCE = new DistinguishedNameParser();

    private static final BitSet EQUAL_OR_COMMA_OR_PLUS      = Tokenizer.INIT_BITSET('=', ',', '+');
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachingExecBase.java`
#### Snippet
```java
public class CachingExecBase {

    final static boolean SUPPORTS_RANGE_AND_CONTENT_RANGE_HEADERS = false;

    final AtomicLong cacheHits = new AtomicLong();
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/schedule/ImmediateSchedulingStrategy.java`
#### Snippet
```java
public class ImmediateSchedulingStrategy implements SchedulingStrategy {

    public final static ImmediateSchedulingStrategy INSTANCE = new ImmediateSchedulingStrategy();

    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/methods/HttpTrace.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    public final static String METHOD_NAME = "TRACE";

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MultipartEntityBuilder.java`
#### Snippet
```java
     * The pool of ASCII chars to be used for generating a multipart boundary.
     */
    private final static char[] MULTIPART_CHARS =
            "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
                    .toCharArray();
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/LaxMaxAgeHandler.java`
#### Snippet
```java
    public static final LaxMaxAgeHandler INSTANCE = new LaxMaxAgeHandler();

    private final static Pattern MAX_AGE_PATTERN = Pattern.compile("^\\-?[0-9]+$");

    public LaxMaxAgeHandler() {
```

### MissortedModifiers
Missorted modifiers `final static`
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/methods/HttpHead.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    public final static String METHOD_NAME = "HEAD";

    /**
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/SystemDefaultCredentialsProvider.java`
#### Snippet
```java
    @Override
    public Credentials getCredentials(final AuthScope authScope, final HttpContext context) {
        Args.notNull(authScope, "Auth scope");
        final Credentials localcreds = internal.getCredentials(authScope, context);
        if (localcreds != null) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/BasicAuthCache.java`
#### Snippet
```java
    @Override
    public void remove(final HttpHost host, final String pathPrefix) {
        Args.notNull(host, "HTTP host");
        this.map.remove(key(host.getSchemeName(), host, pathPrefix));
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/BasicAuthCache.java`
#### Snippet
```java
    @Override
    public AuthScheme get(final HttpHost host, final String pathPrefix) {
        Args.notNull(host, "HTTP host");
        final byte[] bytes = this.map.get(key(host.getSchemeName(), host, pathPrefix));
        if (bytes != null) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/BasicAuthCache.java`
#### Snippet
```java
    @Override
    public void put(final HttpHost host, final String pathPrefix, final AuthScheme authScheme) {
        Args.notNull(host, "HTTP host");
        if (authScheme == null) {
            return;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/GGSSchemeBase.java`
#### Snippet
```java
            final HttpRequest request,
            final HttpContext context) throws AuthenticationException {
        Args.notNull(host, "HTTP host");
        Args.notNull(request, "HTTP request");
        switch (state) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/GGSSchemeBase.java`
#### Snippet
```java
            final HttpContext context) throws AuthenticationException {
        Args.notNull(host, "HTTP host");
        Args.notNull(request, "HTTP request");
        switch (state) {
        case UNINITIATED:
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/GGSSchemeBase.java`
#### Snippet
```java
            final HttpContext context) throws AuthenticationException {

        Args.notNull(host, "Auth host");
        Args.notNull(credentialsProvider, "CredentialsProvider");

```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/GGSSchemeBase.java`
#### Snippet
```java

        Args.notNull(host, "Auth host");
        Args.notNull(credentialsProvider, "CredentialsProvider");

        final Credentials credentials = credentialsProvider.getCredentials(
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/GGSSchemeBase.java`
#### Snippet
```java
            final AuthChallenge authChallenge,
            final HttpContext context) throws MalformedChallengeException {
        Args.notNull(authChallenge, "AuthChallenge");

        this.challenge = authChallenge.getValue() != null ? authChallenge.getValue() : NO_TOKEN;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheConfig.java`
#### Snippet
```java

    public static Builder copy(final CacheConfig config) {
        Args.notNull(config, "Cache config");
        return new Builder()
            .setMaxObjectSize(config.getMaxObjectSize())
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/CookieOrigin.java`
#### Snippet
```java
        Args.notBlank(host, "Host");
        Args.notNegative(port, "Port");
        Args.notNull(path, "Path");
        this.host = host.toLowerCase(Locale.ROOT);
        this.port = port;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HeapResourceFactory.java`
#### Snippet
```java
            final String requestId,
            final Resource resource) throws ResourceIOException {
        Args.notNull(resource, "Resource");
        return new HeapResource(resource.get());
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/CredentialsProviderBuilder.java`
#### Snippet
```java

    public CredentialsProviderBuilder add(final HttpHost httpHost, final String username, final char[] password) {
        Args.notNull(httpHost, "Host");
        credMap.put(new AuthScope(httpHost), new UsernamePasswordCredentials(username, password));
        return this;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/CredentialsProviderBuilder.java`
#### Snippet
```java

    public CredentialsProviderBuilder add(final HttpHost httpHost, final Credentials credentials) {
        Args.notNull(httpHost, "Host");
        credMap.put(new AuthScope(httpHost), credentials);
        return this;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/CredentialsProviderBuilder.java`
#### Snippet
```java

    public CredentialsProviderBuilder add(final AuthScope authScope, final String username, final char[] password) {
        Args.notNull(authScope, "Host");
        credMap.put(authScope, new UsernamePasswordCredentials(username, password));
        return this;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/CredentialsProviderBuilder.java`
#### Snippet
```java

    public CredentialsProviderBuilder add(final AuthScope authScope, final Credentials credentials) {
        Args.notNull(authScope, "Host");
        credMap.put(authScope, credentials);
        return this;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/RouteTracker.java`
#### Snippet
```java
     */
    public void tunnelProxy(final HttpHost proxy, final boolean secure) {
        Args.notNull(proxy, "Proxy host");
        Asserts.check(this.connected, "No tunnel unless connected");
        Asserts.notNull(this.proxyChain, "No tunnel without proxy");
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/RouteTracker.java`
#### Snippet
```java
     */
    public RouteTracker(final HttpHost target, final InetAddress local) {
        Args.notNull(target, "Target host");
        this.targetHost   = target;
        this.localAddress = local;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/RouteTracker.java`
#### Snippet
```java
     */
    public void connectProxy(final HttpHost proxy, final boolean secure) {
        Args.notNull(proxy, "Proxy host");
        Asserts.check(!this.connected, "Already connected");
        this.connected  = true;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/ContextBuilder.java`
#### Snippet
```java

    public ContextBuilder preemptiveBasicAuth(final HttpHost host, final UsernamePasswordCredentials credentials) {
        Args.notNull(host, "HTTP host");
        final BasicScheme authScheme = new BasicScheme(StandardCharsets.UTF_8);
        authScheme.initPreemptive(credentials);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/ContextBuilder.java`
#### Snippet
```java

    public ContextBuilder preemptiveAuth(final HttpHost host, final AuthScheme authScheme) {
        Args.notNull(host, "HTTP host");
        if (authSchemeMap == null) {
            authSchemeMap = new HashMap<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/DateUtils.java`
#### Snippet
```java
    @Deprecated
    public static String formatDate(final Date date, final String pattern) {
        Args.notNull(date, "Date");
        Args.notNull(pattern, "Pattern");
        return DateTimeFormatter.ofPattern(pattern).format(toInstant(date).atZone(GMT_ID));
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/DateUtils.java`
#### Snippet
```java
    public static String formatDate(final Date date, final String pattern) {
        Args.notNull(date, "Date");
        Args.notNull(pattern, "Pattern");
        return DateTimeFormatter.ofPattern(pattern).format(toInstant(date).atZone(GMT_ID));
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/DateUtils.java`
#### Snippet
```java
     */
    public static Instant parseDate(final String dateValue, final DateTimeFormatter... dateFormatters) {
        Args.notNull(dateValue, "Date value");
        String v = dateValue;
        // trim single quotes around date if present
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/DateUtils.java`
#### Snippet
```java
     */
    public static String formatDate(final Instant instant, final DateTimeFormatter dateTimeFormatter) {
        Args.notNull(instant, "Instant");
        Args.notNull(dateTimeFormatter, "DateTimeFormatter");
        return dateTimeFormatter.format(instant.atZone(GMT_ID));
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/DateUtils.java`
#### Snippet
```java
    public static String formatDate(final Instant instant, final DateTimeFormatter dateTimeFormatter) {
        Args.notNull(instant, "Instant");
        Args.notNull(dateTimeFormatter, "DateTimeFormatter");
        return dateTimeFormatter.format(instant.atZone(GMT_ID));
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CombinedEntity.java`
#### Snippet
```java
    @Override
    public void writeTo(final OutputStream outStream) throws IOException {
        Args.notNull(outStream, "Output stream");
        try (InputStream inStream = getContent()) {
            int l;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingCacheStorage.java`
#### Snippet
```java
    @Override
    public final Map<String, HttpCacheEntry> getEntries(final Collection<String> keys) throws ResourceIOException {
        Args.notNull(keys, "Storage keys");
        final List<String> storageKeys = new ArrayList<>(keys.size());
        for (final String key: keys) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/MultihomeConnectionInitiator.java`
#### Snippet
```java
            final Object attachment,
            final FutureCallback<IOSession> callback) {
        Args.notNull(remoteEndpoint, "Remote endpoint");
        return sessionRequester.connect(connectionInitiator, remoteEndpoint, remoteAddress, localAddress, connectTimeout, attachment, callback);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/MultihomeConnectionInitiator.java`
#### Snippet
```java
            final Object attachment,
            final FutureCallback<IOSession> callback) {
        Args.notNull(remoteEndpoint, "Remote endpoint");
        return sessionRequester.connect(connectionInitiator, remoteEndpoint, localAddress, connectTimeout, attachment, callback);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/BasicScheme.java`
#### Snippet
```java
            final HttpContext context) throws AuthenticationException {

        Args.notNull(host, "Auth host");
        Args.notNull(credentialsProvider, "CredentialsProvider");

```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/BasicScheme.java`
#### Snippet
```java

        Args.notNull(host, "Auth host");
        Args.notNull(credentialsProvider, "CredentialsProvider");

        final AuthScope authScope = new AuthScope(host, getRealm(), getName());
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ResourceReference.java`
#### Snippet
```java
    public ResourceReference(final HttpCacheEntry entry, final ReferenceQueue<HttpCacheEntry> q) {
        super(entry, q);
        Args.notNull(entry.getResource(), "Resource");
        this.resource = entry.getResource();
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleRequestProducer.java`
#### Snippet
```java

    public static SimpleRequestProducer create(final SimpleHttpRequest request) {
        Args.notNull(request, "Request");
        final SimpleBody body = request.getBody();
        final AsyncEntityProducer entityProducer;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/DigestScheme.java`
#### Snippet
```java
            final AuthChallenge authChallenge,
            final HttpContext context) throws MalformedChallengeException {
        Args.notNull(authChallenge, "AuthChallenge");
        this.paramMap.clear();
        final List<NameValuePair> params = authChallenge.getParams();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/DigestScheme.java`
#### Snippet
```java
            final HttpContext context) throws AuthenticationException {

        Args.notNull(request, "HTTP request");
        if (this.paramMap.get("realm") == null) {
            throw new AuthenticationException("missing realm");
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/DigestScheme.java`
#### Snippet
```java

    public void initPreemptive(final Credentials credentials, final String cnonce, final String realm) {
        Args.notNull(credentials, "Credentials");
        this.username = credentials.getUserPrincipal().getName();
        this.password = credentials.getPassword();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/DigestScheme.java`
#### Snippet
```java
            final HttpContext context) throws AuthenticationException {

        Args.notNull(host, "Auth host");
        Args.notNull(credentialsProvider, "CredentialsProvider");

```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/DigestScheme.java`
#### Snippet
```java

        Args.notNull(host, "Auth host");
        Args.notNull(credentialsProvider, "CredentialsProvider");

        final AuthScope authScope = new AuthScope(host, getRealm(), getName());
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleResponseBuilder.java`
#### Snippet
```java

    public static SimpleResponseBuilder copy(final SimpleHttpResponse response) {
        Args.notNull(response, "HTTP response");
        final SimpleResponseBuilder builder = new SimpleResponseBuilder(response.getCode());
        builder.digest(response);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncHttpRequestRetryExec.java`
#### Snippet
```java

    public AsyncHttpRequestRetryExec(final HttpRequestRetryStrategy retryStrategy) {
        Args.notNull(retryStrategy, "retryStrategy");
        this.retryStrategy = retryStrategy;
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/GzipCompressingEntity.java`
#### Snippet
```java
    @Override
    public void writeTo(final OutputStream outStream) throws IOException {
        Args.notNull(outStream, "Output stream");
        final GZIPOutputStream gzip = new GZIPOutputStream(outStream);
        super.writeTo(gzip);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixMatcherLoader.java`
#### Snippet
```java

    public static PublicSuffixMatcher load(final URL url) throws IOException {
        Args.notNull(url, "URL");
        try (InputStream in = url.openStream()) {
            return load(in);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixMatcherLoader.java`
#### Snippet
```java

    public static PublicSuffixMatcher load(final File file) throws IOException {
        Args.notNull(file, "File");
        try (InputStream in = new FileInputStream(file)) {
            return load(in);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpCacheStorage.java`
#### Snippet
```java
    @Override
    public Map<String, HttpCacheEntry> getEntries(final Collection<String> keys) throws ResourceIOException {
        Args.notNull(keys, "Key");
        final Map<String, HttpCacheEntry> resultMap = new HashMap<>(keys.size());
        for (final String key: keys) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/LoggingIOSession.java`
#### Snippet
```java
    @Override
    public void upgrade(final IOEventHandler handler) {
        Args.notNull(handler, "Protocol handler");
        if (log.isDebugEnabled()) {
            log.debug("{} protocol upgrade {}", session, handler.getClass());
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AsyncCachingExec.java`
#### Snippet
```java
            final AsyncExecChain chain,
            final AsyncExecCallback asyncExecCallback) throws HttpException, IOException {
        Args.notNull(request, "HTTP request");
        Args.notNull(scope, "Scope");

```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AsyncCachingExec.java`
#### Snippet
```java
            final AsyncExecCallback asyncExecCallback) throws HttpException, IOException {
        Args.notNull(request, "HTTP request");
        Args.notNull(scope, "Scope");

        final HttpRoute route = scope.route;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleHttpResponse.java`
#### Snippet
```java

    public static SimpleHttpResponse copy(final HttpResponse original) {
        Args.notNull(original, "HTTP response");
        final SimpleHttpResponse copy = new SimpleHttpResponse(original.getCode());
        copy.setVersion(original.getVersion());
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingAsyncCacheStorage.java`
#### Snippet
```java
    @Override
    public final Cancellable getEntries(final Collection<String> keys, final FutureCallback<Map<String, HttpCacheEntry>> callback) {
        Args.notNull(keys, "Storage keys");
        Args.notNull(callback, "Callback");
        try {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingAsyncCacheStorage.java`
#### Snippet
```java
    public final Cancellable getEntries(final Collection<String> keys, final FutureCallback<Map<String, HttpCacheEntry>> callback) {
        Args.notNull(keys, "Storage keys");
        Args.notNull(callback, "Callback");
        try {
            final List<String> storageKeys = new ArrayList<>(keys.size());
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingAsyncCacheStorage.java`
#### Snippet
```java
    public final Cancellable updateEntry(
            final String key, final HttpCacheCASOperation casOperation, final FutureCallback<Boolean> callback) {
        Args.notNull(key, "Storage key");
        Args.notNull(casOperation, "CAS operation");
        Args.notNull(callback, "Callback");
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingAsyncCacheStorage.java`
#### Snippet
```java
            final String key, final HttpCacheCASOperation casOperation, final FutureCallback<Boolean> callback) {
        Args.notNull(key, "Storage key");
        Args.notNull(casOperation, "CAS operation");
        Args.notNull(callback, "Callback");
        final ComplexCancellable complexCancellable = new ComplexCancellable();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingAsyncCacheStorage.java`
#### Snippet
```java
        Args.notNull(key, "Storage key");
        Args.notNull(casOperation, "CAS operation");
        Args.notNull(callback, "Callback");
        final ComplexCancellable complexCancellable = new ComplexCancellable();
        final AtomicInteger count = new AtomicInteger(0);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingAsyncCacheStorage.java`
#### Snippet
```java
    @Override
    public final Cancellable getEntry(final String key, final FutureCallback<HttpCacheEntry> callback) {
        Args.notNull(key, "Storage key");
        Args.notNull(callback, "Callback");
        try {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingAsyncCacheStorage.java`
#### Snippet
```java
    public final Cancellable getEntry(final String key, final FutureCallback<HttpCacheEntry> callback) {
        Args.notNull(key, "Storage key");
        Args.notNull(callback, "Callback");
        try {
            final String storageKey = digestToStorageKey(key);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingAsyncCacheStorage.java`
#### Snippet
```java
    public final Cancellable putEntry(
            final String key, final HttpCacheEntry entry, final FutureCallback<Boolean> callback) {
        Args.notNull(key, "Storage key");
        Args.notNull(callback, "Callback");
        try {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingAsyncCacheStorage.java`
#### Snippet
```java
            final String key, final HttpCacheEntry entry, final FutureCallback<Boolean> callback) {
        Args.notNull(key, "Storage key");
        Args.notNull(callback, "Callback");
        try {
            final String storageKey = digestToStorageKey(key);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingAsyncCacheStorage.java`
#### Snippet
```java
    @Override
    public final Cancellable removeEntry(final String key, final FutureCallback<Boolean> callback) {
        Args.notNull(key, "Storage key");
        Args.notNull(callback, "Callback");
        try {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingAsyncCacheStorage.java`
#### Snippet
```java
    public final Cancellable removeEntry(final String key, final FutureCallback<Boolean> callback) {
        Args.notNull(key, "Storage key");
        Args.notNull(callback, "Callback");
        try {
            final String storageKey = digestToStorageKey(key);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/URIUtils.java`
#### Snippet
```java
            final HttpHost target,
            final boolean dropFragment) throws URISyntaxException {
        Args.notNull(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/URIUtils.java`
#### Snippet
```java
    @Deprecated
    public static URI rewriteURI(final URI uri) throws URISyntaxException {
        Args.notNull(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/URIUtils.java`
#### Snippet
```java
            final HttpHost target,
            final List<URI> redirects) throws URISyntaxException {
        Args.notNull(originalURI, "Request URI");
        final URIBuilder uribuilder;
        if (redirects == null || redirects.isEmpty()) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/URIUtils.java`
#### Snippet
```java
     */
    public static URI resolve(final URI baseURI, final URI reference) {
        Args.notNull(baseURI, "Base URI");
        Args.notNull(reference, "Reference URI");
        final String s = reference.toASCIIString();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/URIUtils.java`
#### Snippet
```java
    public static URI resolve(final URI baseURI, final URI reference) {
        Args.notNull(baseURI, "Base URI");
        Args.notNull(reference, "Reference URI");
        final String s = reference.toASCIIString();
        if (s.startsWith("?")) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/FileBody.java`
#### Snippet
```java
    public FileBody(final File file, final ContentType contentType, final String filename) {
        super(contentType);
        Args.notNull(file, "File");
        this.file = file;
        this.filename = filename == null ? file.getName() : filename;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/FileBody.java`
#### Snippet
```java
    @Override
    public void writeTo(final OutputStream out) throws IOException {
        Args.notNull(out, "Output stream");
        try (InputStream in = new FileInputStream(this.file)) {
            final byte[] tmp = new byte[4096];
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/DefaultHttpClientConnectionOperator.java`
#### Snippet
```java
            final Object attachment,
            final HttpContext context) throws IOException {
        Args.notNull(conn, "Connection");
        Args.notNull(host, "Host");
        Args.notNull(socketConfig, "Socket config");
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/DefaultHttpClientConnectionOperator.java`
#### Snippet
```java
            final HttpContext context) throws IOException {
        Args.notNull(conn, "Connection");
        Args.notNull(host, "Host");
        Args.notNull(socketConfig, "Socket config");
        Args.notNull(context, "Context");
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/DefaultHttpClientConnectionOperator.java`
#### Snippet
```java
        Args.notNull(conn, "Connection");
        Args.notNull(host, "Host");
        Args.notNull(socketConfig, "Socket config");
        Args.notNull(context, "Context");
        final Lookup<ConnectionSocketFactory> registry = getSocketFactoryRegistry(context);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/DefaultHttpClientConnectionOperator.java`
#### Snippet
```java
        Args.notNull(host, "Host");
        Args.notNull(socketConfig, "Socket config");
        Args.notNull(context, "Context");
        final Lookup<ConnectionSocketFactory> registry = getSocketFactoryRegistry(context);
        final ConnectionSocketFactory sf = registry.lookup(host.getSchemeName());
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/DefaultHttpClientConnectionOperator.java`
#### Snippet
```java
            final DnsResolver dnsResolver) {
        super();
        Args.notNull(socketFactoryRegistry, "Socket factory registry");
        this.socketFactoryRegistry = socketFactoryRegistry;
        this.schemePortResolver = schemePortResolver != null ? schemePortResolver :
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncPushConsumerRegistry.java`
#### Snippet
```java

    public AsyncPushConsumer get(final HttpRequest request) {
        Args.notNull(request, "Request");
        final URIAuthority authority = request.getAuthority();
        final String key = authority != null ? authority.getHostName().toLowerCase(Locale.ROOT) : null;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncPushConsumerRegistry.java`
#### Snippet
```java
    public void register(final String hostname, final String uriPattern, final Supplier<AsyncPushConsumer> supplier) {
        Args.notBlank(uriPattern, "URI pattern");
        Args.notNull(supplier, "Supplier");
        if (hostname == null) {
            primary.register(uriPattern, supplier);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/RequestAddCookies.java`
#### Snippet
```java
    public void process(final HttpRequest request, final EntityDetails entity, final HttpContext context)
            throws HttpException, IOException {
        Args.notNull(request, "HTTP request");
        Args.notNull(context, "HTTP context");

```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/RequestAddCookies.java`
#### Snippet
```java
            throws HttpException, IOException {
        Args.notNull(request, "HTTP request");
        Args.notNull(context, "HTTP context");

        final String method = request.getMethod();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/DefaultAuthenticationStrategy.java`
#### Snippet
```java
            final Map<String, AuthChallenge> challenges,
            final HttpContext context) {
        Args.notNull(challengeType, "ChallengeType");
        Args.notNull(challenges, "Map of auth challenges");
        Args.notNull(context, "HTTP context");
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/DefaultAuthenticationStrategy.java`
#### Snippet
```java
            final HttpContext context) {
        Args.notNull(challengeType, "ChallengeType");
        Args.notNull(challenges, "Map of auth challenges");
        Args.notNull(context, "HTTP context");
        final HttpClientContext clientContext = HttpClientContext.adapt(context);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/DefaultAuthenticationStrategy.java`
#### Snippet
```java
        Args.notNull(challengeType, "ChallengeType");
        Args.notNull(challenges, "Map of auth challenges");
        Args.notNull(context, "HTTP context");
        final HttpClientContext clientContext = HttpClientContext.adapt(context);
        final String exchangeId = clientContext.getExchangeId();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicDomainHandler.java`
#### Snippet
```java
    public void parse(final SetCookie cookie, final String value)
            throws MalformedCookieException {
        Args.notNull(cookie, "Cookie");
        if (TextUtils.isBlank(value)) {
            throw new MalformedCookieException("Blank or null value for domain attribute");
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicDomainHandler.java`
#### Snippet
```java
    public void validate(final Cookie cookie, final CookieOrigin origin)
            throws MalformedCookieException {
        Args.notNull(cookie, "Cookie");
        Args.notNull(origin, "Cookie origin");
        // Validate the cookies domain attribute.  NOTE:  Domains without
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicDomainHandler.java`
#### Snippet
```java
            throws MalformedCookieException {
        Args.notNull(cookie, "Cookie");
        Args.notNull(origin, "Cookie origin");
        // Validate the cookies domain attribute.  NOTE:  Domains without
        // any dots are allowed to support hosts on private LANs that don't
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicDomainHandler.java`
#### Snippet
```java
    @Override
    public boolean match(final Cookie cookie, final CookieOrigin origin) {
        Args.notNull(cookie, "Cookie");
        Args.notNull(origin, "Cookie origin");
        final String host = origin.getHost();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicDomainHandler.java`
#### Snippet
```java
    public boolean match(final Cookie cookie, final CookieOrigin origin) {
        Args.notNull(cookie, "Cookie");
        Args.notNull(origin, "Cookie origin");
        final String host = origin.getHost();
        String domain = cookie.getDomain();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/RequestDefaultHeaders.java`
#### Snippet
```java
    public void process(final HttpRequest request, final EntityDetails entity, final HttpContext context)
            throws HttpException, IOException {
        Args.notNull(request, "HTTP request");

        final String method = request.getMethod();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/DecompressingEntity.java`
#### Snippet
```java
    @Override
    public void writeTo(final OutputStream outStream) throws IOException {
        Args.notNull(outStream, "Output stream");
        try (InputStream inStream = getContent()) {
            final byte[] buffer = new byte[BUFFER_SIZE];
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/PublicSuffixDomainFilter.java`
#### Snippet
```java
    public static CommonCookieAttributeHandler decorate(
            final CommonCookieAttributeHandler handler, final PublicSuffixMatcher publicSuffixMatcher) {
        Args.notNull(handler, "Cookie attribute handler");
        return publicSuffixMatcher != null ? new PublicSuffixDomainFilter(handler, publicSuffixMatcher) : handler;
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/PublicSuffixDomainFilter.java`
#### Snippet
```java
    public PublicSuffixDomainFilter(
            final CommonCookieAttributeHandler handler, final PublicSuffixList suffixList) {
        Args.notNull(handler, "Cookie handler");
        Args.notNull(suffixList, "Public suffix list");
        this.handler = handler;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/PublicSuffixDomainFilter.java`
#### Snippet
```java
            final CommonCookieAttributeHandler handler, final PublicSuffixList suffixList) {
        Args.notNull(handler, "Cookie handler");
        Args.notNull(suffixList, "Public suffix list");
        this.handler = handler;
        this.publicSuffixMatcher = new PublicSuffixMatcher(suffixList.getRules(), suffixList.getExceptions());
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCacheSupport.java`
#### Snippet
```java
     */
    public static String getRequestUri(final HttpRequest request, final HttpHost target) {
        Args.notNull(request, "HTTP request");
        Args.notNull(target, "Target");
        final StringBuilder buf = new StringBuilder();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCacheSupport.java`
#### Snippet
```java
    public static String getRequestUri(final HttpRequest request, final HttpHost target) {
        Args.notNull(request, "HTTP request");
        Args.notNull(target, "Target");
        final StringBuilder buf = new StringBuilder();
        final URIAuthority authority = request.getAuthority();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCacheSupport.java`
#### Snippet
```java
     */
    public static URI normalize(final URI requestUri) throws URISyntaxException {
        Args.notNull(requestUri, "URI");
        final URIBuilder builder = new URIBuilder(requestUri.isAbsolute() ? URIUtils.resolve(BASE_URI, requestUri) : requestUri) ;
        if (builder.getHost() != null) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixMatcher.java`
#### Snippet
```java
    public PublicSuffixMatcher(
            final DomainType domainType, final Collection<String> rules, final Collection<String> exceptions) {
        Args.notNull(domainType,  "Domain type");
        Args.notNull(rules,  "Domain suffix rules");
        this.rules = new ConcurrentHashMap<>(rules.size());
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixMatcher.java`
#### Snippet
```java
            final DomainType domainType, final Collection<String> rules, final Collection<String> exceptions) {
        Args.notNull(domainType,  "Domain type");
        Args.notNull(rules,  "Domain suffix rules");
        this.rules = new ConcurrentHashMap<>(rules.size());
        for (final String rule: rules) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixMatcher.java`
#### Snippet
```java
     */
    public PublicSuffixMatcher(final Collection<PublicSuffixList> lists) {
        Args.notNull(lists,  "Domain suffix lists");
        this.rules = new ConcurrentHashMap<>();
        this.exceptions = new ConcurrentHashMap<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/DefaultAsyncClientConnectionOperator.java`
#### Snippet
```java
            final HttpContext context,
            final FutureCallback<ManagedAsyncClientConnection> callback) {
        Args.notNull(connectionInitiator, "Connection initiator");
        Args.notNull(host, "Host");
        final ComplexFuture<ManagedAsyncClientConnection> future = new ComplexFuture<>(callback);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/DefaultAsyncClientConnectionOperator.java`
#### Snippet
```java
            final FutureCallback<ManagedAsyncClientConnection> callback) {
        Args.notNull(connectionInitiator, "Connection initiator");
        Args.notNull(host, "Host");
        final ComplexFuture<ManagedAsyncClientConnection> future = new ComplexFuture<>(callback);
        final HttpHost remoteEndpoint = RoutingSupport.normalize(host, schemePortResolver);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheRevalidatorBase.java`
#### Snippet
```java

    public void awaitTermination(final Timeout timeout) throws InterruptedException {
        Args.notNull(timeout, "Timeout");
        scheduledExecutor.awaitTermination(timeout);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheRevalidatorBase.java`
#### Snippet
```java
            @Override
            public ScheduledFuture<?> schedule(final Runnable command, final TimeValue timeValue) throws RejectedExecutionException {
                Args.notNull(command, "Runnable");
                Args.notNull(timeValue, "Time value");
                return executorService.schedule(command, timeValue.getDuration(), timeValue.getTimeUnit());
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheRevalidatorBase.java`
#### Snippet
```java
            public ScheduledFuture<?> schedule(final Runnable command, final TimeValue timeValue) throws RejectedExecutionException {
                Args.notNull(command, "Runnable");
                Args.notNull(timeValue, "Time value");
                return executorService.schedule(command, timeValue.getDuration(), timeValue.getTimeUnit());
            }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheRevalidatorBase.java`
#### Snippet
```java
            @Override
            public void awaitTermination(final Timeout timeout) throws InterruptedException {
                Args.notNull(timeout, "Timeout");
                executorService.awaitTermination(timeout.getDuration(), timeout.getTimeUnit());
            }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMScheme.java`
#### Snippet
```java
            final HttpContext context) throws AuthenticationException {

        Args.notNull(host, "Auth host");
        Args.notNull(credentialsProvider, "CredentialsProvider");

```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMScheme.java`
#### Snippet
```java

        Args.notNull(host, "Auth host");
        Args.notNull(credentialsProvider, "CredentialsProvider");

        final AuthScope authScope = new AuthScope(host, null, getName());
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMScheme.java`
#### Snippet
```java
            final AuthChallenge authChallenge,
            final HttpContext context) throws MalformedChallengeException {
        Args.notNull(authChallenge, "AuthChallenge");

        this.challenge = authChallenge.getValue();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMScheme.java`
#### Snippet
```java
    public NTLMScheme(final NTLMEngine engine) {
        super();
        Args.notNull(engine, "NTLM engine");
        this.engine = engine;
        this.state = State.UNINITIATED;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/RequestClientConnControl.java`
#### Snippet
```java
    public void process(final HttpRequest request, final EntityDetails entity, final HttpContext context)
            throws HttpException, IOException {
        Args.notNull(request, "HTTP request");

        final String method = request.getMethod();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/RequestAuthCache.java`
#### Snippet
```java
    public void process(final HttpRequest request, final EntityDetails entity, final HttpContext context)
            throws HttpException, IOException {
        Args.notNull(request, "HTTP request");
        Args.notNull(context, "HTTP context");

```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/RequestAuthCache.java`
#### Snippet
```java
            throws HttpException, IOException {
        Args.notNull(request, "HTTP request");
        Args.notNull(context, "HTTP context");

        final HttpClientContext clientContext = HttpClientContext.adapt(context);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/Wire.java`
#### Snippet
```java

    public void output(final byte[] b) {
        Args.notNull(b, "Output");
        output(b, 0, b.length);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/Wire.java`
#### Snippet
```java

    public void input(final byte[] b) {
        Args.notNull(b, "Input");
        input(b, 0, b.length);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/Wire.java`
#### Snippet
```java

    public void output(final ByteBuffer b) {
        Args.notNull(b, "Output");
        if (b.hasArray()) {
            output(b.array(), b.arrayOffset() + b.position(), b.remaining());
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/Wire.java`
#### Snippet
```java

    public void input(final String s) {
        Args.notNull(s, "Input");
        input(s.getBytes());
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/Wire.java`
#### Snippet
```java

    public void input(final byte[] b, final int pos, final int off) {
        Args.notNull(b, "Input");
        wire("<< ", b, pos, off);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/Wire.java`
#### Snippet
```java

    public void input(final ByteBuffer b) {
        Args.notNull(b, "Input");
        if (b.hasArray()) {
            input(b.array(), b.arrayOffset() + b.position(), b.remaining());
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/Wire.java`
#### Snippet
```java

    public void output(final String s) {
        Args.notNull(s, "Output");
        output(s.getBytes());
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/Wire.java`
#### Snippet
```java

    public void output(final byte[] b, final int pos, final int off) {
        Args.notNull(b, "Output");
        wire(">> ", b, pos, off);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/methods/HttpOptions.java`
#### Snippet
```java

    public Set<String> getAllowedMethods(final HttpResponse response) {
        Args.notNull(response, "HTTP response");

        final Iterator<HeaderElement> it = MessageSupport.iterate(response, "Allow");
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/LaxExpiresHandler.java`
#### Snippet
```java
    @Override
    public void parse(final SetCookie cookie, final String value) throws MalformedCookieException {
        Args.notNull(cookie, "Cookie");
        if (TextUtils.isBlank(value)) {
            return;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/CookieSpecBase.java`
#### Snippet
```java
    @Override
    public boolean match(final Cookie cookie, final CookieOrigin origin) {
        Args.notNull(cookie, "Cookie");
        Args.notNull(origin, "Cookie origin");
        for (final CookieAttributeHandler handler: getAttribHandlers()) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/CookieSpecBase.java`
#### Snippet
```java
    public boolean match(final Cookie cookie, final CookieOrigin origin) {
        Args.notNull(cookie, "Cookie");
        Args.notNull(origin, "Cookie origin");
        for (final CookieAttributeHandler handler: getAttribHandlers()) {
            if (!handler.match(cookie, origin)) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/CookieSpecBase.java`
#### Snippet
```java
    public void validate(final Cookie cookie, final CookieOrigin origin)
            throws MalformedCookieException {
        Args.notNull(cookie, "Cookie");
        Args.notNull(origin, "Cookie origin");
        for (final CookieAttributeHandler handler: getAttribHandlers()) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/CookieSpecBase.java`
#### Snippet
```java
            throws MalformedCookieException {
        Args.notNull(cookie, "Cookie");
        Args.notNull(origin, "Cookie origin");
        for (final CookieAttributeHandler handler: getAttribHandlers()) {
            handler.validate(cookie, origin);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleHttpRequest.java`
#### Snippet
```java
    @Deprecated
    public static SimpleHttpRequest copy(final HttpRequest original) {
        Args.notNull(original, "HTTP request");
        final SimpleHttpRequest copy = new SimpleHttpRequest(original.getMethod(), original.getRequestUri());
        copy.setVersion(original.getVersion());
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleBody.java`
#### Snippet
```java

    static SimpleBody create(final byte[] body, final ContentType contentType) {
        Args.notNull(body, "Body");
        return new SimpleBody(body, null, contentType);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleBody.java`
#### Snippet
```java

    static SimpleBody create(final String body, final ContentType contentType) {
        Args.notNull(body, "Body");
        if (body.length() > 2048) {
            return new SimpleBody(null, body, contentType);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/schedule/ConcurrentCountMap.java`
#### Snippet
```java

    public int increaseCount(final T identifier) {
        Args.notNull(identifier, "Identifier");
        final AtomicInteger count = get(identifier);
        return count.incrementAndGet();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/schedule/ConcurrentCountMap.java`
#### Snippet
```java

    public void resetCount(final T identifier) {
        Args.notNull(identifier, "Identifier");
        map.remove(identifier);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/schedule/ConcurrentCountMap.java`
#### Snippet
```java

    public int getCount(final T identifier) {
        Args.notNull(identifier, "Identifier");
        final AtomicInteger count = map.get(identifier);
        return count != null ? count.get() : 0;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpRequestRetryExec.java`
#### Snippet
```java
    public HttpRequestRetryExec(
            final HttpRequestRetryStrategy retryStrategy) {
         Args.notNull(retryStrategy, "retryStrategy");
         this.retryStrategy = retryStrategy;
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpRequestRetryExec.java`
#### Snippet
```java
            final Scope scope,
            final ExecChain chain) throws IOException, HttpException {
        Args.notNull(request, "request");
        Args.notNull(scope, "scope");
        final String exchangeId = scope.exchangeId;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpRequestRetryExec.java`
#### Snippet
```java
            final ExecChain chain) throws IOException, HttpException {
        Args.notNull(request, "request");
        Args.notNull(scope, "scope");
        final String exchangeId = scope.exchangeId;
        final HttpRoute route = scope.route;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
     */
    public final H2AsyncClientBuilder addRequestInterceptorLast(final HttpRequestInterceptor interceptor) {
        Args.notNull(interceptor, "Interceptor");
        if (requestInterceptors == null) {
            requestInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
     */
    public final H2AsyncClientBuilder addExecInterceptorFirst(final String name, final AsyncExecChainHandler interceptor) {
        Args.notNull(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
    public final H2AsyncClientBuilder addExecInterceptorFirst(final String name, final AsyncExecChainHandler interceptor) {
        Args.notNull(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
     */
    public final H2AsyncClientBuilder addExecInterceptorLast(final String name, final AsyncExecChainHandler interceptor) {
        Args.notNull(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
    public final H2AsyncClientBuilder addExecInterceptorLast(final String name, final AsyncExecChainHandler interceptor) {
        Args.notNull(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
    public final H2AsyncClientBuilder replaceExecInterceptor(final String existing, final AsyncExecChainHandler interceptor) {
        Args.notBlank(existing, "Existing");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
        Args.notBlank(existing, "Existing");
        Args.notBlank(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
        Args.notBlank(existing, "Existing");
        Args.notBlank(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
     */
    public final H2AsyncClientBuilder addResponseInterceptorLast(final HttpResponseInterceptor interceptor) {
        Args.notNull(interceptor, "Interceptor");
        if (responseInterceptors == null) {
            responseInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
     */
    public final H2AsyncClientBuilder addResponseInterceptorFirst(final HttpResponseInterceptor interceptor) {
        Args.notNull(interceptor, "Interceptor");
        if (responseInterceptors == null) {
            responseInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
     */
    public final H2AsyncClientBuilder addRequestInterceptorFirst(final HttpRequestInterceptor interceptor) {
        Args.notNull(interceptor, "Interceptor");
        if (requestInterceptors == null) {
            requestInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/IdleConnectionEvictor.java`
#### Snippet
```java
    public IdleConnectionEvictor(final ConnPoolControl<?> connectionManager, final ThreadFactory threadFactory,
                                 final TimeValue sleepTime, final TimeValue maxIdleTime) {
        Args.notNull(connectionManager, "Connection manager");
        this.threadFactory = threadFactory != null ? threadFactory : new DefaultThreadFactory("idle-connection-evictor", true);
        final TimeValue localSleepTime = sleepTime != null ? sleepTime : TimeValue.ofSeconds(5);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/InMemoryDnsResolver.java`
#### Snippet
```java
     */
    public void add(final String host, final InetAddress... ips) {
        Args.notNull(host, "Host name");
        Args.notNull(ips, "Array of IP addresses");
        dnsMap.put(host, ips);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/InMemoryDnsResolver.java`
#### Snippet
```java
    public void add(final String host, final InetAddress... ips) {
        Args.notNull(host, "Host name");
        Args.notNull(ips, "Array of IP addresses");
        dnsMap.put(host, ips);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ConnectExec.java`
#### Snippet
```java
            final SchemePortResolver schemePortResolver,
            final boolean authCachingDisabled) {
        Args.notNull(reuseStrategy, "Connection reuse strategy");
        Args.notNull(proxyHttpProcessor, "Proxy HTTP processor");
        Args.notNull(proxyAuthStrategy, "Proxy authentication strategy");
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ConnectExec.java`
#### Snippet
```java
            final boolean authCachingDisabled) {
        Args.notNull(reuseStrategy, "Connection reuse strategy");
        Args.notNull(proxyHttpProcessor, "Proxy HTTP processor");
        Args.notNull(proxyAuthStrategy, "Proxy authentication strategy");
        this.reuseStrategy = reuseStrategy;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ConnectExec.java`
#### Snippet
```java
        Args.notNull(reuseStrategy, "Connection reuse strategy");
        Args.notNull(proxyHttpProcessor, "Proxy HTTP processor");
        Args.notNull(proxyAuthStrategy, "Proxy authentication strategy");
        this.reuseStrategy = reuseStrategy;
        this.proxyHttpProcessor = proxyHttpProcessor;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ConnectExec.java`
#### Snippet
```java
            final ExecChain.Scope scope,
            final ExecChain chain) throws IOException, HttpException {
        Args.notNull(request, "HTTP request");
        Args.notNull(scope, "Scope");

```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ConnectExec.java`
#### Snippet
```java
            final ExecChain chain) throws IOException, HttpException {
        Args.notNull(request, "HTTP request");
        Args.notNull(scope, "Scope");

        final String exchangeId = scope.exchangeId;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/AuthExchange.java`
#### Snippet
```java
     */
    public void select(final AuthScheme authScheme) {
        Args.notNull(authScheme, "Auth scheme");
        this.authScheme = authScheme;
        this.authOptions = null;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpAsyncCacheStorageAdaptor.java`
#### Snippet
```java
    @Override
    public Cancellable getEntries(final Collection<String> keys, final FutureCallback<Map<String, HttpCacheEntry>> callback) {
        Args.notNull(keys, "Key");
        Args.notNull(callback, "Callback");
        try {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpAsyncCacheStorageAdaptor.java`
#### Snippet
```java
    public Cancellable getEntries(final Collection<String> keys, final FutureCallback<Map<String, HttpCacheEntry>> callback) {
        Args.notNull(keys, "Key");
        Args.notNull(callback, "Callback");
        try {
            callback.completed(cacheStorage.getEntries(keys));
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpAsyncCacheStorageAdaptor.java`
#### Snippet
```java
    public Cancellable removeEntry(final String key, final FutureCallback<Boolean> callback) {
        Args.notEmpty(key, "Key");
        Args.notNull(callback, "Callback");
        try {
            cacheStorage.removeEntry(key);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpAsyncCacheStorageAdaptor.java`
#### Snippet
```java
    public Cancellable getEntry(final String key, final FutureCallback<HttpCacheEntry> callback) {
        Args.notEmpty(key, "Key");
        Args.notNull(callback, "Callback");
        try {
            final HttpCacheEntry entry = cacheStorage.getEntry(key);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpAsyncCacheStorageAdaptor.java`
#### Snippet
```java
            final String key, final HttpCacheCASOperation casOperation, final FutureCallback<Boolean> callback) {
        Args.notEmpty(key, "Key");
        Args.notNull(casOperation, "CAS operation");
        Args.notNull(callback, "Callback");
        try {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpAsyncCacheStorageAdaptor.java`
#### Snippet
```java
        Args.notEmpty(key, "Key");
        Args.notNull(casOperation, "CAS operation");
        Args.notNull(callback, "Callback");
        try {
            cacheStorage.updateEntry(key, casOperation);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpAsyncCacheStorageAdaptor.java`
#### Snippet
```java
    public Cancellable putEntry(final String key, final HttpCacheEntry entry, final FutureCallback<Boolean> callback) {
        Args.notEmpty(key, "Key");
        Args.notNull(entry, "Cache entry");
        Args.notNull(callback, "Callback");
        try {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpAsyncCacheStorageAdaptor.java`
#### Snippet
```java
        Args.notEmpty(key, "Key");
        Args.notNull(entry, "Cache entry");
        Args.notNull(callback, "Callback");
        try {
            cacheStorage.putEntry(key, entry);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicMaxAgeHandler.java`
#### Snippet
```java
    public void parse(final SetCookie cookie, final String value)
            throws MalformedCookieException {
        Args.notNull(cookie, "Cookie");
        if (value == null) {
            throw new MalformedCookieException("Missing value for 'max-age' attribute");
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/MainClientExec.java`
#### Snippet
```java
            final ExecChain.Scope scope,
            final ExecChain chain) throws IOException, HttpException {
        Args.notNull(request, "HTTP request");
        Args.notNull(scope, "Scope");
        final String exchangeId = scope.exchangeId;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/MainClientExec.java`
#### Snippet
```java
            final ExecChain chain) throws IOException, HttpException {
        Args.notNull(request, "HTTP request");
        Args.notNull(scope, "Scope");
        final String exchangeId = scope.exchangeId;
        final HttpRoute route = scope.route;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/InternalExecRuntime.java`
#### Snippet
```java
    public void acquireEndpoint(
            final String id, final HttpRoute route, final Object object, final HttpClientContext context) throws IOException {
        Args.notNull(route, "Route");
        if (endpointRef.get() == null) {
            final RequestConfig requestConfig = context.getRequestConfig();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/RFC6265CookieSpec.java`
#### Snippet
```java
    @Override
    public final List<Cookie> parse(final Header header, final CookieOrigin origin) throws MalformedCookieException {
        Args.notNull(header, "Header");
        Args.notNull(origin, "Cookie origin");
        if (!header.getName().equalsIgnoreCase("Set-Cookie")) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/RFC6265CookieSpec.java`
#### Snippet
```java
    public final List<Cookie> parse(final Header header, final CookieOrigin origin) throws MalformedCookieException {
        Args.notNull(header, "Header");
        Args.notNull(origin, "Cookie origin");
        if (!header.getName().equalsIgnoreCase("Set-Cookie")) {
            throw new MalformedCookieException("Unrecognized cookie header: '" + header + "'");
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/RFC6265CookieSpec.java`
#### Snippet
```java
    public final void validate(final Cookie cookie, final CookieOrigin origin)
            throws MalformedCookieException {
        Args.notNull(cookie, "Cookie");
        Args.notNull(origin, "Cookie origin");
        for (final CookieAttributeHandler handler: this.attribHandlers) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/RFC6265CookieSpec.java`
#### Snippet
```java
            throws MalformedCookieException {
        Args.notNull(cookie, "Cookie");
        Args.notNull(origin, "Cookie origin");
        for (final CookieAttributeHandler handler: this.attribHandlers) {
            handler.validate(cookie, origin);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/RFC6265CookieSpec.java`
#### Snippet
```java
    @Override
    public final boolean match(final Cookie cookie, final CookieOrigin origin) {
        Args.notNull(cookie, "Cookie");
        Args.notNull(origin, "Cookie origin");
        for (final CookieAttributeHandler handler: this.attribHandlers) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/RFC6265CookieSpec.java`
#### Snippet
```java
    public final boolean match(final Cookie cookie, final CookieOrigin origin) {
        Args.notNull(cookie, "Cookie");
        Args.notNull(origin, "Cookie origin");
        for (final CookieAttributeHandler handler: this.attribHandlers) {
            if (!handler.match(cookie, origin)) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/DefaultSchemePortResolver.java`
#### Snippet
```java
    @Override
    public int resolve(final HttpHost host) {
        Args.notNull(host, "HTTP host");
        return resolve(host.getSchemeName(), host);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/DefaultSchemePortResolver.java`
#### Snippet
```java
    @Override
    public int resolve(final String scheme, final NamedEndpoint endpoint) {
        Args.notNull(endpoint, "Endpoint");
        final int port = endpoint.getPort();
        if (port > 0) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/InputStreamBody.java`
#### Snippet
```java
    public InputStreamBody(final InputStream in, final ContentType contentType, final String filename, final long contentLength) {
        super(contentType);
        Args.notNull(in, "Input stream");
        this.in = in;
        this.filename = filename;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/InputStreamBody.java`
#### Snippet
```java
    @Override
    public void writeTo(final OutputStream out) throws IOException {
        Args.notNull(out, "Output stream");
        try {
            final byte[] tmp = new byte[4096];
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicExpiresHandler.java`
#### Snippet
```java
    public void parse(final SetCookie cookie, final String value)
            throws MalformedCookieException {
        Args.notNull(cookie, "Cookie");
        if (value == null) {
            throw new MalformedCookieException("Missing value for 'expires' attribute");
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicExpiresHandler.java`
#### Snippet
```java
    @Deprecated
    public BasicExpiresHandler(final String[] datePatterns) {
        Args.notNull(datePatterns, "Array of date patterns");
        this.datePatterns = new DateTimeFormatter[datePatterns.length];
        for (int i = 0; i < datePatterns.length; i++) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ProtocolExec.java`
#### Snippet
```java
            final ExecChain.Scope scope,
            final ExecChain chain) throws IOException, HttpException {
        Args.notNull(userRequest, "HTTP request");
        Args.notNull(scope, "Scope");

```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ProtocolExec.java`
#### Snippet
```java
            final ExecChain chain) throws IOException, HttpException {
        Args.notNull(userRequest, "HTTP request");
        Args.notNull(scope, "Scope");

        if (Method.CONNECT.isSame(userRequest.getMethod())) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/DefaultConnectionKeepAliveStrategy.java`
#### Snippet
```java
    @Override
    public TimeValue getKeepAliveDuration(final HttpResponse response, final HttpContext context) {
        Args.notNull(response, "HTTP response");
        final Iterator<HeaderElement> it = MessageSupport.iterate(response, HeaderElements.KEEP_ALIVE);
        while (it.hasNext()) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/FormBodyPartBuilder.java`
#### Snippet
```java
     */
    public FormBodyPartBuilder addField(final String name, final String value, final List<NameValuePair> parameters) {
        Args.notNull(name, "Field name");
        this.header.addField(new MimeField(name, value, parameters));
        return this;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/FormBodyPartBuilder.java`
#### Snippet
```java

    public FormBodyPartBuilder setField(final String name, final String value) {
        Args.notNull(name, "Field name");
        this.header.setField(new MimeField(name, value));
        return this;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/FormBodyPartBuilder.java`
#### Snippet
```java

    public FormBodyPartBuilder removeFields(final String name) {
        Args.notNull(name, "Field name");
        this.header.removeFields(name);
        return this;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/FormBodyPartBuilder.java`
#### Snippet
```java

    public FormBodyPartBuilder addField(final String name, final String value) {
        Args.notNull(name, "Field name");
        this.header.addField(new MimeField(name, value));
        return this;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/BackoffStrategyExec.java`
#### Snippet
```java
            final ExecChain.Scope scope,
            final ExecChain chain) throws IOException, HttpException {
        Args.notNull(request, "HTTP request");
        Args.notNull(scope, "Scope");
        final HttpRoute route = scope.route;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/BackoffStrategyExec.java`
#### Snippet
```java
            final ExecChain chain) throws IOException, HttpException {
        Args.notNull(request, "HTTP request");
        Args.notNull(scope, "Scope");
        final HttpRoute route = scope.route;

```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/BackoffStrategyExec.java`
#### Snippet
```java
            final BackoffManager backoffManager) {
        super();
        Args.notNull(connectionBackoffStrategy, "Connection backoff strategy");
        Args.notNull(backoffManager, "Backoff manager");
        this.connectionBackoffStrategy = connectionBackoffStrategy;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/BackoffStrategyExec.java`
#### Snippet
```java
        super();
        Args.notNull(connectionBackoffStrategy, "Connection backoff strategy");
        Args.notNull(backoffManager, "Backoff manager");
        this.connectionBackoffStrategy = connectionBackoffStrategy;
        this.backoffManager = backoffManager;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/StringBody.java`
#### Snippet
```java
    @Override
    public void writeTo(final OutputStream out) throws IOException {
        Args.notNull(out, "Output stream");
        out.write(this.content);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/StringBody.java`
#### Snippet
```java
    public StringBody(final String text, final ContentType contentType) {
        super(contentType);
        Args.notNull(text, "Text");
        final Charset charset = contentType.getCharset();
        this.content = text.getBytes(charset != null ? charset : StandardCharsets.US_ASCII);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicHttpOnlyHandler.java`
#### Snippet
```java
    public void parse(final SetCookie cookie, final String value)
            throws MalformedCookieException {
        Args.notNull(cookie, "Cookie");
        cookie.setHttpOnly(true);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/UsernamePasswordCredentials.java`
#### Snippet
```java
    public UsernamePasswordCredentials(final String userName, final char[] password) {
        super();
        Args.notNull(userName, "Username");
        this.principal = new BasicUserPrincipal(userName);
        this.password = password;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/RedirectExec.java`
#### Snippet
```java
            final RedirectStrategy redirectStrategy) {
        super();
        Args.notNull(routePlanner, "HTTP route planner");
        Args.notNull(redirectStrategy, "HTTP redirect strategy");
        this.routePlanner = routePlanner;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/RedirectExec.java`
#### Snippet
```java
        super();
        Args.notNull(routePlanner, "HTTP route planner");
        Args.notNull(redirectStrategy, "HTTP redirect strategy");
        this.routePlanner = routePlanner;
        this.redirectStrategy = redirectStrategy;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/RedirectExec.java`
#### Snippet
```java
            final ExecChain.Scope scope,
            final ExecChain chain) throws IOException, HttpException {
        Args.notNull(request, "HTTP request");
        Args.notNull(scope, "Scope");

```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/RedirectExec.java`
#### Snippet
```java
            final ExecChain chain) throws IOException, HttpException {
        Args.notNull(request, "HTTP request");
        Args.notNull(scope, "Scope");

        final HttpClientContext context = scope.clientContext;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/NTCredentials.java`
#### Snippet
```java
            final String netbiosDomain) {
        super();
        Args.notNull(userName, "User name");
        this.principal = new NTUserPrincipal(domain, userName);
        this.password = password;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/AbstractContentBody.java`
#### Snippet
```java
    public AbstractContentBody(final ContentType contentType) {
        super();
        Args.notNull(contentType, "Content type");
        this.contentType = contentType;
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ProxyClient.java`
#### Snippet
```java
            final HttpHost target,
            final Credentials credentials) throws IOException, HttpException {
        Args.notNull(proxy, "Proxy host");
        Args.notNull(target, "Target host");
        Args.notNull(credentials, "Credentials");
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ProxyClient.java`
#### Snippet
```java
            final Credentials credentials) throws IOException, HttpException {
        Args.notNull(proxy, "Proxy host");
        Args.notNull(target, "Target host");
        Args.notNull(credentials, "Credentials");
        HttpHost host = target;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ProxyClient.java`
#### Snippet
```java
        Args.notNull(proxy, "Proxy host");
        Args.notNull(target, "Target host");
        Args.notNull(credentials, "Credentials");
        HttpHost host = target;
        if (host.getPort() <= 0) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
     */
    public final HttpAsyncClientBuilder addExecInterceptorFirst(final String name, final AsyncExecChainHandler interceptor) {
        Args.notNull(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
    public final HttpAsyncClientBuilder addExecInterceptorFirst(final String name, final AsyncExecChainHandler interceptor) {
        Args.notNull(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
     */
    public final HttpAsyncClientBuilder addResponseInterceptorFirst(final HttpResponseInterceptor interceptor) {
        Args.notNull(interceptor, "Interceptor");
        if (responseInterceptors == null) {
            responseInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
        Args.notBlank(existing, "Existing");
        Args.notBlank(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
    public final HttpAsyncClientBuilder replaceExecInterceptor(final String existing, final AsyncExecChainHandler interceptor) {
        Args.notBlank(existing, "Existing");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
     */
    public final HttpAsyncClientBuilder addRequestInterceptorFirst(final HttpRequestInterceptor interceptor) {
        Args.notNull(interceptor, "Interceptor");
        if (requestInterceptors == null) {
            requestInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
     */
    public final HttpAsyncClientBuilder addExecInterceptorLast(final String name, final AsyncExecChainHandler interceptor) {
        Args.notNull(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
    public final HttpAsyncClientBuilder addExecInterceptorLast(final String name, final AsyncExecChainHandler interceptor) {
        Args.notNull(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
     */
    public final HttpAsyncClientBuilder addResponseInterceptorLast(final HttpResponseInterceptor interceptor) {
        Args.notNull(interceptor, "Interceptor");
        if (responseInterceptors == null) {
            responseInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
     */
    public final HttpAsyncClientBuilder addRequestInterceptorLast(final HttpRequestInterceptor interceptor) {
        Args.notNull(interceptor, "Interceptor");
        if (requestInterceptors == null) {
            requestInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/HttpAsyncClientBuilder.java`
#### Snippet
```java
        Args.notBlank(existing, "Existing");
        Args.notBlank(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/routing/BasicRouteDirector.java`
#### Snippet
```java
    @Override
    public int nextStep(final RouteInfo plan, final RouteInfo fact) {
        Args.notNull(plan, "Planned route");

        int step = UNREACHABLE;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/ResponseProcessCookies.java`
#### Snippet
```java
    public void process(final HttpResponse response, final EntityDetails entity, final HttpContext context)
            throws HttpException, IOException {
        Args.notNull(response, "HTTP request");
        Args.notNull(context, "HTTP context");

```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/ResponseProcessCookies.java`
#### Snippet
```java
            throws HttpException, IOException {
        Args.notNull(response, "HTTP request");
        Args.notNull(context, "HTTP context");

        final HttpClientContext clientContext = HttpClientContext.adapt(context);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
            final HttpContext context,
            final HttpClientResponseHandler<? extends T> responseHandler) throws IOException {
        Args.notNull(responseHandler, "Response handler");

        try (final ClassicHttpResponse response = doExecute(target, request, context)) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpClient.java`
#### Snippet
```java
            final ClassicHttpRequest request,
            final HttpContext context) throws IOException {
        Args.notNull(request, "HTTP request");
        return doExecute(determineTarget(request), request, context);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicPathHandler.java`
#### Snippet
```java
    @Override
    public boolean match(final Cookie cookie, final CookieOrigin origin) {
        Args.notNull(cookie, "Cookie");
        Args.notNull(origin, "Cookie origin");
        return pathMatch(origin.getPath(), cookie.getPath());
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicPathHandler.java`
#### Snippet
```java
    public boolean match(final Cookie cookie, final CookieOrigin origin) {
        Args.notNull(cookie, "Cookie");
        Args.notNull(origin, "Cookie origin");
        return pathMatch(origin.getPath(), cookie.getPath());
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicPathHandler.java`
#### Snippet
```java
    public void parse(
            final SetCookie cookie, final String value) throws MalformedCookieException {
        Args.notNull(cookie, "Cookie");
        cookie.setPath(!TextUtils.isBlank(value) ? value : "/");
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheEntry.java`
#### Snippet
```java
            final Map<String, String> variantMap) {
        super();
        Args.notNull(requestDate, "Request date");
        Args.notNull(responseDate, "Response date");
        Args.check(status >= HttpStatus.SC_SUCCESS, "Status code");
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheEntry.java`
#### Snippet
```java
        super();
        Args.notNull(requestDate, "Request date");
        Args.notNull(responseDate, "Response date");
        Args.check(status >= HttpStatus.SC_SUCCESS, "Status code");
        Args.notNull(responseHeaders, "Response headers");
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheEntry.java`
#### Snippet
```java
        Args.notNull(responseDate, "Response date");
        Args.check(status >= HttpStatus.SC_SUCCESS, "Status code");
        Args.notNull(responseHeaders, "Response headers");
        this.requestDate = DateUtils.toInstant(requestDate);
        this.responseDate = DateUtils.toInstant(responseDate);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheEntry.java`
#### Snippet
```java
            final Map<String, String> variantMap) {
        super();
        Args.notNull(requestDate, "Request date");
        Args.notNull(responseDate, "Response date");
        Args.check(status >= HttpStatus.SC_SUCCESS, "Status code");
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheEntry.java`
#### Snippet
```java
        super();
        Args.notNull(requestDate, "Request date");
        Args.notNull(responseDate, "Response date");
        Args.check(status >= HttpStatus.SC_SUCCESS, "Status code");
        Args.notNull(responseHeaders, "Response headers");
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheEntry.java`
#### Snippet
```java
        Args.notNull(responseDate, "Response date");
        Args.check(status >= HttpStatus.SC_SUCCESS, "Status code");
        Args.notNull(responseHeaders, "Response headers");
        this.requestDate = requestDate;
        this.responseDate = responseDate;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/FormBodyPart.java`
#### Snippet
```java
    FormBodyPart(final String name, final ContentBody body, final Header header) {
        super(body, header);
        Args.notNull(name, "Name");
        Args.notNull(body, "Body");
        this.name = name;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/FormBodyPart.java`
#### Snippet
```java
        super(body, header);
        Args.notNull(name, "Name");
        Args.notNull(body, "Body");
        this.name = name;
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/FormBodyPart.java`
#### Snippet
```java
    @Override
    public void addField(final String name, final String value) {
        Args.notNull(name, "Field name");
        super.addField(name, value);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/MinimalHttpClient.java`
#### Snippet
```java
            final ClassicHttpRequest request,
            final HttpContext context) throws IOException {
        Args.notNull(target, "Target host");
        Args.notNull(request, "HTTP request");
        if (request.getScheme() == null) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicClientCookie.java`
#### Snippet
```java
    @Override
    public boolean isExpired(final Date date) {
        Args.notNull(date, "Date");
        return (cookieExpiryDate != null
            && cookieExpiryDate.compareTo(DateUtils.toInstant(date)) <= 0);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/MinimalHttpClient.java`
#### Snippet
```java
            final HttpContext context) throws IOException {
        Args.notNull(target, "Target host");
        Args.notNull(request, "HTTP request");
        if (request.getScheme() == null) {
            request.setScheme(target.getSchemeName());
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicClientCookie.java`
#### Snippet
```java
    public BasicClientCookie(final String name, final String value) {
        super();
        Args.notNull(name, "Name");
        this.name = name;
        this.attribs = new HashMap<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicClientCookie.java`
#### Snippet
```java
    @Override
    public boolean isExpired(final Instant instant) {
        Args.notNull(instant, "Instant");
        return (cookieExpiryDate != null
                && cookieExpiryDate.compareTo(instant) <= 0);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/AuthScope.java`
#### Snippet
```java
    public AuthScope(final AuthScope authScope) {
        super();
        Args.notNull(authScope, "Scope");
        this.protocol = authScope.getProtocol();
        this.host = authScope.getHost();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/AuthScope.java`
#### Snippet
```java
            final String realm,
            final String schemeName) {
        Args.notNull(origin, "Host");
        this.protocol = origin.getSchemeName().toLowerCase(Locale.ROOT);
        this.host = origin.getHostName().toLowerCase(Locale.ROOT);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ManagedHttpCacheStorage.java`
#### Snippet
```java
    @Override
    public Map<String, HttpCacheEntry> getEntries(final Collection<String> keys) throws ResourceIOException {
        Args.notNull(keys, "Key");
        final Map<String, HttpCacheEntry> resultMap = new HashMap<>(keys.size());
        for (final String key: keys) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ManagedHttpCacheStorage.java`
#### Snippet
```java
            final String url,
            final HttpCacheCASOperation casOperation) throws ResourceIOException {
        Args.notNull(url, "URL");
        Args.notNull(casOperation, "CAS operation");
        ensureValidState();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ManagedHttpCacheStorage.java`
#### Snippet
```java
            final HttpCacheCASOperation casOperation) throws ResourceIOException {
        Args.notNull(url, "URL");
        Args.notNull(casOperation, "CAS operation");
        ensureValidState();
        synchronized (this) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ManagedHttpCacheStorage.java`
#### Snippet
```java
    @Override
    public void removeEntry(final String url) throws ResourceIOException {
        Args.notNull(url, "URL");
        ensureValidState();
        synchronized (this) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ManagedHttpCacheStorage.java`
#### Snippet
```java
    @Override
    public HttpCacheEntry getEntry(final String url) throws ResourceIOException {
        Args.notNull(url, "URL");
        ensureValidState();
        synchronized (this) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ManagedHttpCacheStorage.java`
#### Snippet
```java
    @Override
    public void putEntry(final String url, final HttpCacheEntry entry) throws ResourceIOException {
        Args.notNull(url, "URL");
        Args.notNull(entry, "Cache entry");
        ensureValidState();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ManagedHttpCacheStorage.java`
#### Snippet
```java
    public void putEntry(final String url, final HttpCacheEntry entry) throws ResourceIOException {
        Args.notNull(url, "URL");
        Args.notNull(entry, "Cache entry");
        ensureValidState();
        synchronized (this) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncConnectExec.java`
#### Snippet
```java
            final AsyncExecChain chain,
            final AsyncExecCallback asyncExecCallback) throws HttpException, IOException {
        Args.notNull(request, "HTTP request");
        Args.notNull(scope, "Scope");

```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncConnectExec.java`
#### Snippet
```java
            final AsyncExecCallback asyncExecCallback) throws HttpException, IOException {
        Args.notNull(request, "HTTP request");
        Args.notNull(scope, "Scope");

        final String exchangeId = scope.exchangeId;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncConnectExec.java`
#### Snippet
```java
            final SchemePortResolver schemePortResolver,
            final boolean authCachingDisabled) {
        Args.notNull(proxyHttpProcessor, "Proxy HTTP processor");
        Args.notNull(proxyAuthStrategy, "Proxy authentication strategy");
        this.proxyHttpProcessor = proxyHttpProcessor;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncConnectExec.java`
#### Snippet
```java
            final boolean authCachingDisabled) {
        Args.notNull(proxyHttpProcessor, "Proxy HTTP processor");
        Args.notNull(proxyAuthStrategy, "Proxy authentication strategy");
        this.proxyHttpProcessor = proxyHttpProcessor;
        this.proxyAuthStrategy  = proxyAuthStrategy;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/InternalHttpClient.java`
#### Snippet
```java
            final ClassicHttpRequest request,
            final HttpContext context) throws IOException {
        Args.notNull(request, "HTTP request");
        try {
            final HttpClientContext localcontext = HttpClientContext.adapt(
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
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/SSLConnectionSocketFactory.java`
#### Snippet
```java
            final Object attachment,
            final HttpContext context) throws IOException {
        Args.notNull(host, "HTTP host");
        Args.notNull(remoteAddress, "Remote address");
        final Socket sock = socket != null ? socket : createSocket(context);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/SSLConnectionSocketFactory.java`
#### Snippet
```java
            final HttpContext context) throws IOException {
        Args.notNull(host, "HTTP host");
        Args.notNull(remoteAddress, "Remote address");
        final Socket sock = socket != null ? socket : createSocket(context);
        if (localAddress != null) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/RequestExpectContinue.java`
#### Snippet
```java
    public void process(final HttpRequest request, final EntityDetails entity, final HttpContext context)
            throws HttpException, IOException {
        Args.notNull(request, "HTTP request");

        if (!request.containsHeader(HttpHeaders.EXPECT)) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/AbstractMultipartFormat.java`
#### Snippet
```java
    public AbstractMultipartFormat(final Charset charset, final String boundary) {
        super();
        Args.notNull(boundary, "Multipart boundary");
        this.charset = charset != null ? charset : StandardCharsets.ISO_8859_1;
        this.boundary = boundary;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachingExec.java`
#### Snippet
```java
            final ExecChain.Scope scope,
            final ExecChain chain) throws IOException, HttpException {
        Args.notNull(request, "HTTP request");
        Args.notNull(scope, "Scope");

```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachingExec.java`
#### Snippet
```java
            final ExecChain chain) throws IOException, HttpException {
        Args.notNull(request, "HTTP request");
        Args.notNull(scope, "Scope");

        final HttpRoute route = scope.route;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManager.java`
#### Snippet
```java
            final HttpContext context,
            final FutureCallback<AsyncConnectionEndpoint> callback) {
        Args.notNull(endpoint, "Managed endpoint");
        final InternalConnectionEndpoint internalEndpoint = cast(endpoint);
        final PoolEntry<HttpRoute, ManagedAsyncClientConnection> poolEntry = internalEndpoint.getValidatedPoolEntry();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManager.java`
#### Snippet
```java
            final HttpContext context,
            final FutureCallback<AsyncConnectionEndpoint> callback) {
        Args.notNull(endpoint, "Endpoint");
        Args.notNull(connectionInitiator, "Connection initiator");
        final InternalConnectionEndpoint internalEndpoint = cast(endpoint);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManager.java`
#### Snippet
```java
            final FutureCallback<AsyncConnectionEndpoint> callback) {
        Args.notNull(endpoint, "Endpoint");
        Args.notNull(connectionInitiator, "Connection initiator");
        final InternalConnectionEndpoint internalEndpoint = cast(endpoint);
        final ComplexFuture<AsyncConnectionEndpoint> resultFuture = new ComplexFuture<>(callback);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManager.java`
#### Snippet
```java
    @Override
    public void release(final AsyncConnectionEndpoint endpoint, final Object state, final TimeValue keepAlive) {
        Args.notNull(endpoint, "Managed endpoint");
        Args.notNull(keepAlive, "Keep-alive time");
        final PoolEntry<HttpRoute, ManagedAsyncClientConnection> entry = cast(endpoint).detach();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManager.java`
#### Snippet
```java
    public void release(final AsyncConnectionEndpoint endpoint, final Object state, final TimeValue keepAlive) {
        Args.notNull(endpoint, "Managed endpoint");
        Args.notNull(keepAlive, "Keep-alive time");
        final PoolEntry<HttpRoute, ManagedAsyncClientConnection> entry = cast(endpoint).detach();
        if (entry == null) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/HttpClientContext.java`
#### Snippet
```java

    public static HttpClientContext adapt(final HttpContext context) {
        Args.notNull(context, "HTTP context");
        if (context instanceof HttpClientContext) {
            return (HttpClientContext) context;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/FileResourceFactory.java`
#### Snippet
```java
    @Override
    public Resource generate(final String requestId, final byte[] content) throws ResourceIOException {
        Args.notNull(content, "Content");
        return generate(requestId, content, 0, content.length);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/FileResourceFactory.java`
#### Snippet
```java
            final String requestId,
            final byte[] content, final int off, final int len) throws ResourceIOException {
        Args.notNull(requestId, "Request id");
        final File file = generateUniqueCacheFile(requestId);
        try (FileOutputStream outStream = new FileOutputStream(file)) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5-win/src/main/java/org/apache/hc/client5/http/impl/win/WindowsNegotiateScheme.java`
#### Snippet
```java
            final AuthChallenge authChallenge,
            final HttpContext context) throws MalformedChallengeException {
        Args.notNull(authChallenge, "AuthChallenge");
        challengeType = authChallenge.getChallengeType();
        challenge = authChallenge.getValue();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
    public final HttpClientBuilder replaceExecInterceptor(final String existing, final ExecChainHandler interceptor) {
        Args.notBlank(existing, "Existing");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
        Args.notBlank(existing, "Existing");
        Args.notBlank(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
     */
    public final HttpClientBuilder addResponseInterceptorFirst(final HttpResponseInterceptor interceptor) {
        Args.notNull(interceptor, "Interceptor");
        if (responseInterceptors == null) {
            responseInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
     */
    public final HttpClientBuilder addExecInterceptorFirst(final String name, final ExecChainHandler interceptor) {
        Args.notNull(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
    public final HttpClientBuilder addExecInterceptorFirst(final String name, final ExecChainHandler interceptor) {
        Args.notNull(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
     */
    public final HttpClientBuilder addResponseInterceptorLast(final HttpResponseInterceptor interceptor) {
        Args.notNull(interceptor, "Interceptor");
        if (responseInterceptors == null) {
            responseInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
     */
    public final HttpClientBuilder addRequestInterceptorLast(final HttpRequestInterceptor interceptor) {
        Args.notNull(interceptor, "Interceptor");
        if (requestInterceptors == null) {
            requestInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
     */
    public final HttpClientBuilder addExecInterceptorLast(final String name, final ExecChainHandler interceptor) {
        Args.notNull(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
    public final HttpClientBuilder addExecInterceptorLast(final String name, final ExecChainHandler interceptor) {
        Args.notNull(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
     */
    public final HttpClientBuilder addRequestInterceptorFirst(final HttpRequestInterceptor interceptor) {
        Args.notNull(interceptor, "Interceptor");
        if (requestInterceptors == null) {
            requestInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
        Args.notBlank(existing, "Existing");
        Args.notBlank(name, "Name");
        Args.notNull(interceptor, "Interceptor");
        if (execInterceptors == null) {
            execInterceptors = new LinkedList<>();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/MinimalHttpAsyncClient.java`
#### Snippet
```java
            final HttpContext context,
            final FutureCallback<AsyncClientEndpoint> callback) {
        Args.notNull(host, "Host");
        Args.notNull(context, "HTTP context");
        final BasicFuture<AsyncClientEndpoint> future = new BasicFuture<>(callback);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/MinimalHttpAsyncClient.java`
#### Snippet
```java
            final FutureCallback<AsyncClientEndpoint> callback) {
        Args.notNull(host, "Host");
        Args.notNull(context, "HTTP context");
        final BasicFuture<AsyncClientEndpoint> future = new BasicFuture<>(callback);
        if (!isRunning()) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/BasicHttpClientConnectionManager.java`
#### Snippet
```java

    public synchronized void closeIdle(final TimeValue idleTime) {
        Args.notNull(idleTime, "Idle time");
        if (isClosed()) {
            return;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/BasicHttpClientConnectionManager.java`
#### Snippet
```java
    @Override
    public synchronized void connect(final ConnectionEndpoint endpoint, final TimeValue timeout, final HttpContext context) throws IOException {
        Args.notNull(endpoint, "Endpoint");

        final InternalConnectionEndpoint internalEndpoint = cast(endpoint);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/BasicHttpClientConnectionManager.java`
#### Snippet
```java
                final HttpRequestExecutor requestExecutor,
                final HttpContext context) throws IOException, HttpException {
            Args.notNull(request, "HTTP request");
            Args.notNull(requestExecutor, "Request executor");
            if (LOG.isDebugEnabled()) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/BasicHttpClientConnectionManager.java`
#### Snippet
```java
                final HttpContext context) throws IOException, HttpException {
            Args.notNull(request, "HTTP request");
            Args.notNull(requestExecutor, "Request executor");
            if (LOG.isDebugEnabled()) {
                LOG.debug("{} Executing exchange {}", id, exchangeId);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/BasicHttpClientConnectionManager.java`
#### Snippet
```java
            final ConnectionEndpoint endpoint,
            final HttpContext context) throws IOException {
        Args.notNull(endpoint, "Endpoint");
        Args.notNull(route, "HTTP route");
        final InternalConnectionEndpoint internalEndpoint = cast(endpoint);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/BasicHttpClientConnectionManager.java`
#### Snippet
```java
            final HttpContext context) throws IOException {
        Args.notNull(endpoint, "Endpoint");
        Args.notNull(route, "HTTP route");
        final InternalConnectionEndpoint internalEndpoint = cast(endpoint);
        this.connectionOperator.upgrade(
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/BasicHttpClientConnectionManager.java`
#### Snippet
```java
    @Override
    public synchronized void release(final ConnectionEndpoint endpoint, final Object state, final TimeValue keepAlive) {
        Args.notNull(endpoint, "Managed endpoint");
        final InternalConnectionEndpoint internalEndpoint = cast(endpoint);
        final ManagedHttpClientConnection conn = internalEndpoint.detach();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicSecureHandler.java`
#### Snippet
```java
    public void parse(final SetCookie cookie, final String value)
            throws MalformedCookieException {
        Args.notNull(cookie, "Cookie");
        cookie.setSecure(true);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicSecureHandler.java`
#### Snippet
```java
    @Override
    public boolean match(final Cookie cookie, final CookieOrigin origin) {
        Args.notNull(cookie, "Cookie");
        Args.notNull(origin, "Cookie origin");
        return !cookie.isSecure() || origin.isSecure();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicSecureHandler.java`
#### Snippet
```java
    public boolean match(final Cookie cookie, final CookieOrigin origin) {
        Args.notNull(cookie, "Cookie");
        Args.notNull(origin, "Cookie origin");
        return !cookie.isSecure() || origin.isSecure();
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ContentCompressionExec.java`
#### Snippet
```java
            final ExecChain.Scope scope,
            final ExecChain chain) throws IOException, HttpException {
        Args.notNull(request, "HTTP request");
        Args.notNull(scope, "Scope");

```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ContentCompressionExec.java`
#### Snippet
```java
            final ExecChain chain) throws IOException, HttpException {
        Args.notNull(request, "HTTP request");
        Args.notNull(scope, "Scope");

        final HttpClientContext clientContext = scope.clientContext;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleRequestBuilder.java`
#### Snippet
```java
     */
    public static SimpleRequestBuilder copy(final SimpleHttpRequest request) {
        Args.notNull(request, "HTTP request");
        final SimpleRequestBuilder builder = new SimpleRequestBuilder(request.getMethod());
        builder.digest(request);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleRequestBuilder.java`
#### Snippet
```java
     */
    public static SimpleRequestBuilder copy(final HttpRequest request) {
        Args.notNull(request, "HTTP request");
        final SimpleRequestBuilder builder = new SimpleRequestBuilder(request.getMethod());
        builder.digest(request);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleRequestBuilder.java`
#### Snippet
```java

    public static SimpleRequestBuilder create(final Method method) {
        Args.notNull(method, "HTTP method");
        return new SimpleRequestBuilder(method);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/BasicUserPrincipal.java`
#### Snippet
```java
    public BasicUserPrincipal(final String username) {
        super();
        Args.notNull(username, "User name");
        this.username = username;
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/CloseableHttpAsyncClient.java`
#### Snippet
```java
            final HttpContext context,
            final FutureCallback<T> callback) {
        Args.notNull(requestProducer, "Request producer");
        Args.notNull(responseConsumer, "Response consumer");
        return execute(requestProducer, responseConsumer, null, context, callback);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/CloseableHttpAsyncClient.java`
#### Snippet
```java
            final FutureCallback<T> callback) {
        Args.notNull(requestProducer, "Request producer");
        Args.notNull(responseConsumer, "Response consumer");
        return execute(requestProducer, responseConsumer, null, context, callback);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/CloseableHttpAsyncClient.java`
#### Snippet
```java
            final HttpContext context,
            final FutureCallback<T> callback) {
        Args.notNull(requestProducer, "Request producer");
        Args.notNull(responseConsumer, "Response consumer");
        return doExecute(target, requestProducer, responseConsumer, pushHandlerFactory, context, callback);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/CloseableHttpAsyncClient.java`
#### Snippet
```java
            final FutureCallback<T> callback) {
        Args.notNull(requestProducer, "Request producer");
        Args.notNull(responseConsumer, "Response consumer");
        return doExecute(target, requestProducer, responseConsumer, pushHandlerFactory, context, callback);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/CloseableHttpAsyncClient.java`
#### Snippet
```java
            final HttpContext context,
            final FutureCallback<T> callback) {
        Args.notNull(requestProducer, "Request producer");
        Args.notNull(responseConsumer, "Response consumer");
        return doExecute(null, requestProducer, responseConsumer, pushHandlerFactory, context, callback);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/CloseableHttpAsyncClient.java`
#### Snippet
```java
            final FutureCallback<T> callback) {
        Args.notNull(requestProducer, "Request producer");
        Args.notNull(responseConsumer, "Response consumer");
        return doExecute(null, requestProducer, responseConsumer, pushHandlerFactory, context, callback);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/CloseableHttpAsyncClient.java`
#### Snippet
```java
            final HttpContext context,
            final FutureCallback<SimpleHttpResponse> callback) {
        Args.notNull(request, "Request");
        return execute(SimpleRequestProducer.create(request), SimpleResponseConsumer.create(), context, callback);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/CloseableHttpAsyncClient.java`
#### Snippet
```java
            final AsyncResponseConsumer<T> responseConsumer,
            final FutureCallback<T> callback) {
        Args.notNull(requestProducer, "Request producer");
        Args.notNull(responseConsumer, "Response consumer");
        return execute(requestProducer, responseConsumer, HttpClientContext.create(), callback);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/CloseableHttpAsyncClient.java`
#### Snippet
```java
            final FutureCallback<T> callback) {
        Args.notNull(requestProducer, "Request producer");
        Args.notNull(responseConsumer, "Response consumer");
        return execute(requestProducer, responseConsumer, HttpClientContext.create(), callback);
    }
```

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
Result of `Args.notNull()` is ignored
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/FileResource.java`
#### Snippet
```java
    public FileResource(final File file) {
        super();
        Args.notNull(file, "File");
        this.fileRef = new AtomicReference<>(file);
        this.len = file.length();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MultipartPartBuilder.java`
#### Snippet
```java

    public MultipartPartBuilder addHeader(final String name, final String value) {
        Args.notNull(name, "Header name");
        this.header.addField(new MimeField(name, value));
        return this;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MultipartPartBuilder.java`
#### Snippet
```java

    public MultipartPartBuilder setHeader(final String name, final String value) {
        Args.notNull(name, "Header name");
        this.header.setField(new MimeField(name, value));
        return this;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MultipartPartBuilder.java`
#### Snippet
```java

    public MultipartPartBuilder addHeader(final String name, final String value, final List<NameValuePair> parameters) {
        Args.notNull(name, "Header name");
        this.header.addField(new MimeField(name, value, parameters));
        return this;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MultipartPartBuilder.java`
#### Snippet
```java

    public MultipartPartBuilder removeHeaders(final String name) {
        Args.notNull(name, "Header name");
        this.header.removeFields(name);
        return this;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/DefaultRedirectStrategy.java`
#### Snippet
```java
            final HttpResponse response,
            final HttpContext context) throws HttpException {
        Args.notNull(request, "HTTP request");
        Args.notNull(response, "HTTP response");
        Args.notNull(context, "HTTP context");
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/DefaultRedirectStrategy.java`
#### Snippet
```java
            final HttpContext context) throws HttpException {
        Args.notNull(request, "HTTP request");
        Args.notNull(response, "HTTP response");
        Args.notNull(context, "HTTP context");

```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/DefaultRedirectStrategy.java`
#### Snippet
```java
        Args.notNull(request, "HTTP request");
        Args.notNull(response, "HTTP response");
        Args.notNull(context, "HTTP context");

        //get the location header to find out where to redirect to
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/DefaultRedirectStrategy.java`
#### Snippet
```java
            final HttpResponse response,
            final HttpContext context) throws ProtocolException {
        Args.notNull(request, "HTTP request");
        Args.notNull(response, "HTTP response");

```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/DefaultRedirectStrategy.java`
#### Snippet
```java
            final HttpContext context) throws ProtocolException {
        Args.notNull(request, "HTTP request");
        Args.notNull(response, "HTTP response");

        if (!response.containsHeader(HttpHeaders.LOCATION)) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/BasicCredentialsProvider.java`
#### Snippet
```java
            final AuthScope authScope,
            final Credentials credentials) {
        Args.notNull(authScope, "Authentication scope");
        credMap.put(authScope, credentials);
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MultipartEntityBuilder.java`
#### Snippet
```java
     */
    public MultipartEntityBuilder setContentType(final ContentType contentType) {
        Args.notNull(contentType, "Content type");
        this.contentType = contentType;
        return this;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MultipartEntityBuilder.java`
#### Snippet
```java

    public MultipartEntityBuilder addPart(final String name, final ContentBody contentBody) {
        Args.notNull(name, "Name");
        Args.notNull(contentBody, "Content body");
        return addPart(FormBodyPartBuilder.create(name, contentBody).build());
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MultipartEntityBuilder.java`
#### Snippet
```java
    public MultipartEntityBuilder addPart(final String name, final ContentBody contentBody) {
        Args.notNull(name, "Name");
        Args.notNull(contentBody, "Content body");
        return addPart(FormBodyPartBuilder.create(name, contentBody).build());
    }
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/LaxMaxAgeHandler.java`
#### Snippet
```java
    @Override
    public void parse(final SetCookie cookie, final String value) throws MalformedCookieException {
        Args.notNull(cookie, "Cookie");
        if (TextUtils.isBlank(value)) {
            return;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/DefaultHttpRequestRetryStrategy.java`
#### Snippet
```java
            final int execCount,
            final HttpContext context) {
        Args.notNull(response, "response");

        final Header header = response.getFirstHeader(HttpHeaders.RETRY_AFTER);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/DefaultHttpRequestRetryStrategy.java`
#### Snippet
```java
            final int execCount,
            final HttpContext context) {
        Args.notNull(request, "request");
        Args.notNull(exception, "exception");

```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/DefaultHttpRequestRetryStrategy.java`
#### Snippet
```java
            final HttpContext context) {
        Args.notNull(request, "request");
        Args.notNull(exception, "exception");

        if (execCount > this.maxRetries) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/DefaultHttpRequestRetryStrategy.java`
#### Snippet
```java
            final int execCount,
            final HttpContext context) {
        Args.notNull(response, "response");

        return execCount <= this.maxRetries && retriableCodes.contains(response.getCode());
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/NTUserPrincipal.java`
#### Snippet
```java
            final String username) {
        super();
        Args.notNull(username, "User name");
        this.username = username;
        if (domain != null) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/HttpRoute.java`
#### Snippet
```java
    private HttpRoute(final HttpHost targetHost, final InetAddress local, final List<HttpHost> proxies,
                     final boolean secure, final TunnelType tunnelled, final LayerType layered) {
        Args.notNull(targetHost, "Target host");
        Args.notNegative(targetHost.getPort(), "Target port");
        this.targetHost = targetHost;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java
            public synchronized ConnectionEndpoint get(
                    final Timeout timeout) throws InterruptedException, ExecutionException, TimeoutException {
                Args.notNull(timeout, "Operation timeout");
                if (this.endpoint != null) {
                    return this.endpoint;
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java
                final HttpRequestExecutor requestExecutor,
                final HttpContext context) throws IOException, HttpException {
            Args.notNull(request, "HTTP request");
            Args.notNull(requestExecutor, "Request executor");
            final ManagedHttpClientConnection connection = getValidatedPoolEntry().getConnection();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java
                final HttpContext context) throws IOException, HttpException {
            Args.notNull(request, "HTTP request");
            Args.notNull(requestExecutor, "Request executor");
            final ManagedHttpClientConnection connection = getValidatedPoolEntry().getConnection();
            if (LOG.isDebugEnabled()) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java
    @Override
    public void release(final ConnectionEndpoint endpoint, final Object state, final TimeValue keepAlive) {
        Args.notNull(endpoint, "Managed endpoint");
        final PoolEntry<HttpRoute, ManagedHttpClientConnection> entry = cast(endpoint).detach();
        if (entry == null) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java
    @Override
    public void upgrade(final ConnectionEndpoint endpoint, final HttpContext context) throws IOException {
        Args.notNull(endpoint, "Managed endpoint");
        final InternalConnectionEndpoint internalEndpoint = cast(endpoint);
        final PoolEntry<HttpRoute, ManagedHttpClientConnection> poolEntry = internalEndpoint.getValidatedPoolEntry();
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java
    @Override
    public void closeIdle(final TimeValue idleTime) {
        Args.notNull(idleTime, "Idle time");
        if (LOG.isDebugEnabled()) {
            LOG.debug("Closing connections idle longer than {}", idleTime);
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java
    @Override
    public void connect(final ConnectionEndpoint endpoint, final TimeValue timeout, final HttpContext context) throws IOException {
        Args.notNull(endpoint, "Managed endpoint");
        final InternalConnectionEndpoint internalEndpoint = cast(endpoint);
        if (internalEndpoint.isConnected()) {
```

### IgnoreResultOfCall
Result of `Args.notNull()` is ignored
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java
            final Timeout requestTimeout,
            final Object state) {
        Args.notNull(route, "HTTP route");
        if (LOG.isDebugEnabled()) {
            LOG.debug("{} endpoint lease request ({}) {}", id, requestTimeout, ConnPoolSupport.formatStats(route, state, pool));
```

## RuleId[ruleID=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingAsyncCacheStorage.java`
#### Snippet
```java
                                @Override
                                public void completed(final Boolean result) {
                                    if (result.booleanValue()) {
                                        callback.completed(result);
                                    } else {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `httpclient5-fluent/src/main/java/org/apache/hc/client5/http/fluent/Request.java`
#### Snippet
```java
        }
        if (this.useExpectContinue != null) {
            builder.setExpectContinueEnabled(this.useExpectContinue.booleanValue());
        }
        if (this.connectTimeout != null) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/DefaultAsyncCacheInvalidator.java`
#### Snippet
```java
            public void completed(final Boolean result) {
                if (LOG.isDebugEnabled()) {
                    if (result.booleanValue()) {
                        LOG.debug("Cache entry with key {} successfully flushed", cacheKey);
                    } else {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
        Type1Message(final String domain, final String host, final Integer flags) {
            super();
            this.flags = ((flags == null)?getDefaultFlags(): flags.intValue());

            // See HTTPCLIENT-1662
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/ConscryptClientTlsStrategy.java`
#### Snippet
```java
            final Class<?> clazz = Class.forName("org.conscrypt.Conscrypt");
            final Method method = clazz.getMethod("isAvailable");
            return ((Boolean) method.invoke(null)).booleanValue();
        } catch (final ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            return false;
```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `validate()` is identical to its super method
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/RFC6265CookieSpecFactory.java`
#### Snippet
```java
                                    new BasicPathHandler() {
                                        @Override
                                        public void validate(
                                                final Cookie cookie,
                                                final CookieOrigin origin) throws MalformedCookieException {
```

### RedundantMethodOverride
Method `digest()` only delegates to its super method
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleRequestBuilder.java`
#### Snippet
```java

    @Override
    protected void digest(final HttpRequest request) {
        super.digest(request);
    }
```

### RedundantMethodOverride
Method `handleResponse()` only delegates to its super method
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/BasicHttpClientResponseHandler.java`
#### Snippet
```java

    @Override
    public String handleResponse(final ClassicHttpResponse response) throws IOException {
        return super.handleResponse(response);
    }
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/DecompressingEntity.java`
#### Snippet
```java
    @Override
    public InputStream getContent() throws IOException {
        if (super.isStreaming()) {
            if (content == null) {
                content = getDecompressingStream();
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`path = path + '/'` could be simplified to 'path += '/''
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/CookiePathComparator.java`
#### Snippet
```java
        }
        if (!path.endsWith("/")) {
            path = path + '/';
        }
        return path;
```

### ReplaceAssignmentWithOperatorAssignment
`value = value * RANGE.length` could be simplified to 'value \*= RANGE.length'
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/classic/RandomHandler.java`
#### Snippet
```java
                        value = Math.random();
                    }
                    value = value * RANGE.length;
                    final int d = (int) value;
                    value = value - d;
```

### ReplaceAssignmentWithOperatorAssignment
`value = value - d` could be simplified to 'value -= d'
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/classic/RandomHandler.java`
#### Snippet
```java
                    value = value * RANGE.length;
                    final int d = (int) value;
                    value = value - d;
                    data[i] = RANGE[d];
                }
```

### ReplaceAssignmentWithOperatorAssignment
`remaining = remaining - end` could be simplified to 'remaining -= end'
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/classic/RandomHandler.java`
#### Snippet
```java
                out.flush();

                remaining = remaining - end;
            }
            out.close();
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CombinedEntity.java`
#### Snippet
```java
            int l;
            final byte[] tmp = new byte[2048];
            while ((l = inStream.read(tmp)) != -1) {
                outStream.write(tmp, 0, l);
            }
```

### NestedAssignment
Result of assignment expression used
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/WarningValue.java`
#### Snippet
```java

    WarningValue(final String s, final int offs) {
        this.offs = this.init_offs = offs;
        this.src = s;
        consumeWarnValue();
```

### NestedAssignment
Result of assignment expression used
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/FileBody.java`
#### Snippet
```java
            final byte[] tmp = new byte[4096];
            int l;
            while ((l = in.read(tmp)) != -1) {
                out.write(tmp, 0, l);
            }
```

### NestedAssignment
Result of assignment expression used
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/DecompressingEntity.java`
#### Snippet
```java
            final byte[] buffer = new byte[BUFFER_SIZE];
            int l;
            while ((l = inStream.read(buffer)) != -1) {
                outStream.write(buffer, 0, l);
            }
```

### NestedAssignment
Result of assignment expression used
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/InternalAbstractHttpAsyncClient.java`
#### Snippet
```java
        if (this.closeables != null) {
            Closeable closeable;
            while ((closeable = this.closeables.poll()) != null) {
                try {
                    if (closeable instanceof ModalCloseable) {
```

### NestedAssignment
Result of assignment expression used
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixListParser.java`
#### Snippet
```java

        String line;
        while ((line = r.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
```

### NestedAssignment
Result of assignment expression used
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixListParser.java`
#### Snippet
```java
        List<String> exceptions = null;
        String line;
        while ((line = r.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
```

### NestedAssignment
Result of assignment expression used
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpByteArrayCacheEntrySerializer.java`
#### Snippet
```java
        final byte[] buf = new byte[BUFFER_SIZE];
        int lastBytesRead;
        while ((lastBytesRead = srcBuf.read(buf, src)) != -1) {
            dest.write(buf, 0, lastBytesRead);
        }
```

### NestedAssignment
Result of assignment expression used
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/InputStreamBody.java`
#### Snippet
```java
            final byte[] tmp = new byte[4096];
            int l;
            while ((l = this.in.read(tmp)) != -1) {
                out.write(tmp, 0, l);
            }
```

### NestedAssignment
Result of assignment expression used
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ManagedHttpCacheStorage.java`
#### Snippet
```java
        if (isActive()) {
            ResourceReference ref;
            while ((ref = (ResourceReference) this.morque.poll()) != null) {
                synchronized (this) {
                    this.resources.remove(ref);
```

### NestedAssignment
Result of assignment expression used
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ManagedHttpCacheStorage.java`
#### Snippet
```java
            synchronized (this) {
                ResourceReference ref;
                while ((ref = (ResourceReference) this.morque.poll()) != null) {
                    this.resources.remove(ref);
                    ref.getResource().dispose();
```

### NestedAssignment
Result of assignment expression used
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/InternalHttpClient.java`
#### Snippet
```java
        if (this.closeables != null) {
            Closeable closeable;
            while ((closeable = this.closeables.poll()) != null) {
                try {
                    if (closeable instanceof ModalCloseable) {
```

### NestedAssignment
Result of assignment expression used
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachingExec.java`
#### Snippet
```java
            long total = 0;
            int l;
            while ((l = inStream.read(tmp)) != -1) {
                buf.append(tmp, 0, l);
                total += l;
```

### NestedAssignment
Result of assignment expression used
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/FileResourceFactory.java`
#### Snippet
```java
                    final byte[] buf = new byte[2048];
                    int len;
                    while ((len = in.read(buf)) != -1) {
                        out.write(buf, 0, len);
                    }
```

### NestedAssignment
Result of assignment expression used
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/FileResource.java`
#### Snippet
```java
            final byte[] tmp = new byte[2048];
            int len;
            while ((len = in.read(tmp)) != -1) {
                buf.append(tmp, 0, len);
            }
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `backoffFactor` is accessed in both synchronized and unsynchronized contexts
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/AIMDBackoffManager.java`
#### Snippet
```java
    private final Map<HttpRoute, Long> lastRouteBackoffs;
    private TimeValue coolDown = TimeValue.ofSeconds(5L);
    private double backoffFactor = 0.5;
    private int cap = 2; // Per RFC 2616 sec 8.1.4

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `coolDown` is accessed in both synchronized and unsynchronized contexts
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/AIMDBackoffManager.java`
#### Snippet
```java
    private final Map<HttpRoute, Long> lastRouteProbes;
    private final Map<HttpRoute, Long> lastRouteBackoffs;
    private TimeValue coolDown = TimeValue.ofSeconds(5L);
    private double backoffFactor = 0.5;
    private int cap = 2; // Per RFC 2616 sec 8.1.4
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `cap` is accessed in both synchronized and unsynchronized contexts
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/AIMDBackoffManager.java`
#### Snippet
```java
    private TimeValue coolDown = TimeValue.ofSeconds(5L);
    private double backoffFactor = 0.5;
    private int cap = 2; // Per RFC 2616 sec 8.1.4

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `route` is accessed in both synchronized and unsynchronized contexts
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/BasicHttpClientConnectionManager.java`
#### Snippet
```java

    private ManagedHttpClientConnection conn;
    private HttpRoute route;
    private Object state;
    private long created;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `connectionConfig` is accessed in both synchronized and unsynchronized contexts
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/BasicHttpClientConnectionManager.java`
#### Snippet
```java
    private boolean leased;
    private SocketConfig socketConfig;
    private ConnectionConfig connectionConfig;
    private TlsConfig tlsConfig;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `state` is accessed in both synchronized and unsynchronized contexts
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/BasicHttpClientConnectionManager.java`
#### Snippet
```java
    private ManagedHttpClientConnection conn;
    private HttpRoute route;
    private Object state;
    private long created;
    private long updated;
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/BasicScheme.java`
#### Snippet
```java
    }

    private void readObjectNoData() {
    }

```

### EmptyMethod
The method and all its derivables are empty
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicPathHandler.java`
#### Snippet
```java

    @Override
    public void validate(final Cookie cookie, final CookieOrigin origin)
            throws MalformedCookieException {
    }
```

### EmptyMethod
Method only calls its super
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/LoggingInputStream.java`
#### Snippet
```java

    @Override
    public void reset() throws IOException {
        super.reset();
    }
```

### EmptyMethod
The method is empty
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/AbstractClientTlsStrategy.java`
#### Snippet
```java
    abstract TlsDetails createTlsDetails(SSLEngine sslEngine);

    protected void initializeEngine(final SSLEngine sslEngine) {
    }

```

### EmptyMethod
The method is empty
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/SSLConnectionSocketFactory.java`
#### Snippet
```java
     * @throws IOException may be thrown if overridden
     */
    protected void prepareSocket(final SSLSocket socket) throws IOException {
    }

```

### EmptyMethod
The method is empty
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/DateUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static void clearThreadLocal() {
    }

```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `ex`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpRequestRetryExec.java`
#### Snippet
```java
                    continue;
                } else {
                    if (ex instanceof NoHttpResponseException) {
                        final NoHttpResponseException updatedex = new NoHttpResponseException(
                                route.getTargetHost().toHostString() + " failed to respond");
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
            return lmResponse(ntlmHash, sessionHash);
        } catch (final Exception e) {
            if (e instanceof NTLMEngineException) {
                throw (NTLMEngineException) e;
            }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `ex`
in `httpclient5-win/src/main/java/org/apache/hc/client5/http/impl/win/WindowsNegotiateScheme.java`
#### Snippet
```java
            } catch (final RuntimeException ex) {
                failAuthCleanup();
                if (ex instanceof Win32Exception) {
                    throw new AuthenticationException("Authentication Failed", ex);
                }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `ex`
in `httpclient5-win/src/main/java/org/apache/hc/client5/http/impl/win/WindowsNegotiateScheme.java`
#### Snippet
```java
            } catch (final RuntimeException ex) {
                failAuthCleanup();
                if (ex instanceof Win32Exception) {
                    throw new AuthenticationException("Authentication Failed", ex);
                }
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-28-02-30-20.317.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixMatcherLoader.java`
#### Snippet
```java
    public static PublicSuffixMatcher getDefault() {
        if (DEFAULT_INSTANCE == null) {
            synchronized (PublicSuffixMatcherLoader.class) {
                if (DEFAULT_INSTANCE == null){
                    final URL url = PublicSuffixMatcherLoader.class.getResource(
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/RFC6265CookieSpecFactory.java`
#### Snippet
```java
    public CookieSpec create(final HttpContext context) {
        if (cookieSpec == null) {
            synchronized (this) {
                if (cookieSpec == null) {
                    switch (this.compatibilityLevel) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ManagedHttpCacheStorage.java`
#### Snippet
```java
            ResourceReference ref;
            while ((ref = (ResourceReference) this.morque.poll()) != null) {
                synchronized (this) {
                    this.resources.remove(ref);
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ManagedHttpCacheStorage.java`
#### Snippet
```java
        Args.notNull(casOperation, "CAS operation");
        ensureValidState();
        synchronized (this) {
            final HttpCacheEntry existing = this.entries.get(url);
            final HttpCacheEntry updated = casOperation.execute(existing);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ManagedHttpCacheStorage.java`
#### Snippet
```java
        Args.notNull(url, "URL");
        ensureValidState();
        synchronized (this) {
            // Cannot deallocate the associated resources immediately as the
            // cache entry may still be in use
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ManagedHttpCacheStorage.java`
#### Snippet
```java
        Args.notNull(url, "URL");
        ensureValidState();
        synchronized (this) {
            return this.entries.get(url);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ManagedHttpCacheStorage.java`
#### Snippet
```java
        Args.notNull(entry, "Cache entry");
        ensureValidState();
        synchronized (this) {
            this.entries.put(url, entry);
            keepResourceReference(entry);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ManagedHttpCacheStorage.java`
#### Snippet
```java
    public void shutdown() {
        if (compareAndSet()) {
            synchronized (this) {
                this.entries.clear();
                for (final ResourceReference ref: this.resources) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ManagedHttpCacheStorage.java`
#### Snippet
```java
    public void close() {
        if (compareAndSet()) {
            synchronized (this) {
                ResourceReference ref;
                while ((ref = (ResourceReference) this.morque.poll()) != null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/IgnoreCookieSpecFactory.java`
#### Snippet
```java
    public CookieSpec create(final HttpContext context) {
        if (cookieSpec == null) {
            synchronized (this) {
                if (cookieSpec == null) {
                    this.cookieSpec = IgnoreSpecSpec.INSTANCE;
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/SystemDefaultCredentialsProvider.java`
#### Snippet
```java

                return new PasswordAuthentication(proxyUser,
                        proxyPassword != null ? proxyPassword.toCharArray() : new char[] {});
            }
        } catch (final NumberFormatException ex) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/GGSSchemeBase.java`
#### Snippet
```java
            return gssContext.initSecContext(input, 0, input.length);
        } else {
            return gssContext.initSecContext(new byte[] {}, 0, 0);
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/ByteArrayBuilder.java`
#### Snippet
```java
    public byte[] toByteArray() {
        if (this.buffer == null) {
            return new byte[] {};
        }
        this.buffer.flip();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/WarningValue.java`
#### Snippet
```java
            }
        }
        final WarningValue[] wvs = {};
        return out.toArray(wvs);
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ResponseEntityProxy.java`
#### Snippet
```java
                        footers = chunkedInputStream.getFooters();
                    } else {
                        footers = new Header[0];
                    }
                    return Arrays.asList(footers);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/classic/EchoHandler.java`
#### Snippet
```java
        final ContentType contentType;
        if (entity == null) {
            data = new byte [0];
            contentType = null;
        } else {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
                // This likely means we couldn't find the MD4 hash algorithm -
                // fail back to just using LM
                ntResp = new byte[0];
                lmResp = gen.getLMResponse();
                if ((type2Flags & FLAG_REQUEST_LAN_MANAGER_KEY) != 0) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheEntry.java`
#### Snippet
```java
    public Header[] getHeaders(final String name) {
        if (REQUEST_METHOD_HEADER_NAME.equalsIgnoreCase(name)) {
            return new Header[0];
        }
        return responseHeaders.getHeaders(name);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/MultihomeIOSessionRequester.java`
#### Snippet
```java
                                (remoteAddress instanceof InetSocketAddress) ?
                                        new InetAddress[] { ((InetSocketAddress) remoteAddress).getAddress() } :
                                        new InetAddress[] {}));
                    } else {
                        future.failed(cause);
```

## RuleId[ruleID=UnusedAssignment]
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
Variable `step` initializer `UNREACHABLE` is redundant
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/routing/BasicRouteDirector.java`
#### Snippet
```java
        Args.notNull(plan, "Planned route");

        int step = UNREACHABLE;

        if ((fact == null) || (fact.getHopCount() < 1)) {
```

## RuleId[ruleID=ConstantValue]
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
Value `returnString` is always 'null'
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/NTCredentials.java`
#### Snippet
```java
    private static String convertDomain(final String domain) {
        final String returnString = stripDotSuffix(domain);
        return returnString == null ? returnString : returnString.toUpperCase(Locale.ROOT);
    }

```

## RuleId[ruleID=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `create()` tries to override a static method of a superclass
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachingHttpAsyncClientBuilder.java`
#### Snippet
```java
    private boolean deleteCache;

    public static CachingHttpAsyncClientBuilder create() {
        return new CachingHttpAsyncClientBuilder();
    }
```

### MethodOverridesStaticMethod
Method `create()` tries to override a static method of a superclass
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachingHttpClientBuilder.java`
#### Snippet
```java
    private boolean deleteCache;

    public static CachingHttpClientBuilder create() {
        return new CachingHttpClientBuilder();
    }
```

### MethodOverridesStaticMethod
Method `create()` tries to override a static method of a superclass
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheContext.java`
#### Snippet
```java
    }

    public static HttpCacheContext create() {
        return new HttpCacheContext(new BasicHttpContext());
    }
```

### MethodOverridesStaticMethod
Method `adapt()` tries to override a static method of a superclass
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheContext.java`
#### Snippet
```java
    public static final String CACHE_RESPONSE_STATUS = "http.cache.response.status";

    public static HttpCacheContext adapt(final HttpContext context) {
        if (context instanceof HttpCacheContext) {
            return (HttpCacheContext) context;
```

### MethodOverridesStaticMethod
Method `adapt()` tries to override a static method of a superclass
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/HttpClientContext.java`
#### Snippet
```java
    public static final String EXCHANGE_ID = "http.exchange-id";

    public static HttpClientContext adapt(final HttpContext context) {
        Args.notNull(context, "HTTP context");
        if (context instanceof HttpClientContext) {
```

### MethodOverridesStaticMethod
Method `create()` tries to override a static method of a superclass
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/HttpClientContext.java`
#### Snippet
```java
    }

    public static HttpClientContext create() {
        return new HttpClientContext(new BasicHttpContext());
    }
```

### MethodOverridesStaticMethod
Method `create()` tries to override a static method of a superclass
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachingH2AsyncClientBuilder.java`
#### Snippet
```java
    private boolean deleteCache;

    public static CachingH2AsyncClientBuilder create() {
        return new CachingH2AsyncClientBuilder();
    }
```

## RuleId[ruleID=IOResource]
### IOResource
'BufferedReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixListParser.java`
#### Snippet
```java
        final List<String> rules = new ArrayList<>();
        final List<String> exceptions = new ArrayList<>();
        final BufferedReader r = new BufferedReader(reader);

        String line;
```

### IOResource
'BufferedReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixListParser.java`
#### Snippet
```java
        final List<PublicSuffixList> result = new ArrayList<>(2);

        final BufferedReader r = new BufferedReader(reader);

        DomainType domainType = null;
```

### IOResource
'IdleConnectionEvictor' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java
        }
        if (evictIdleConnections) {
            final IdleConnectionEvictor connectionEvictor = new IdleConnectionEvictor(connPool,
                    maxIdleTime != null ? maxIdleTime : TimeValue.ofSeconds(30L));
            closeablesCopy.add(connectionEvictor::shutdown);
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ConnectExceptionSupport` has only 'static' members, and lacks a 'private' constructor
in `httpclient5/src/main/java/org/apache/hc/client5/http/ConnectExceptionSupport.java`
#### Snippet
```java
 */
@Internal
public final class ConnectExceptionSupport {

    public static ConnectTimeoutException createConnectTimeoutException(
```

### UtilityClassWithoutPrivateConstructor
Class `DateSupport` has only 'static' members, and lacks a 'private' constructor
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/DateSupport.java`
#### Snippet
```java
 */
@Internal
public final class DateSupport {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CredentialsMatcher` has only 'static' members, and lacks a 'private' constructor
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/CredentialsMatcher.java`
#### Snippet
```java
import org.apache.hc.client5.http.auth.Credentials;

final class CredentialsMatcher {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `BasicHttpRequests` has only 'static' members, and lacks a 'private' constructor
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/BasicHttpRequests.java`
#### Snippet
```java
 */
@Deprecated
public final class BasicHttpRequests {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PublicSuffixMatcherLoader` has only 'static' members, and lacks a 'private' constructor
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixMatcherLoader.java`
#### Snippet
```java
 */
@Contract(threading = ThreadingBehavior.SAFE)
public final class PublicSuffixMatcherLoader {

    private static final Logger LOG = LoggerFactory.getLogger(PublicSuffixMatcherLoader.class);
```

### UtilityClassWithoutPrivateConstructor
Class `HttpHeader` has only 'static' members, and lacks a 'private' constructor
in `httpclient5-fluent/src/main/java/org/apache/hc/client5/http/fluent/HttpHeader.java`
#### Snippet
```java
package org.apache.hc.client5.http.fluent;

class HttpHeader {

    public static final String CONTENT_LENGTH = "Content-Length";
```

### UtilityClassWithoutPrivateConstructor
Class `MimeConsts` has only 'static' members, and lacks a 'private' constructor
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MimeConsts.java`
#### Snippet
```java
package org.apache.hc.client5.http.entity.mime;

final class MimeConsts {

    public static final String CONTENT_TYPE          = "Content-Type";
```

### UtilityClassWithoutPrivateConstructor
Class `HttpCacheSupport` has only 'static' members, and lacks a 'private' constructor
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCacheSupport.java`
#### Snippet
```java
 * @since 5.0
 */
public final class HttpCacheSupport {

    private static final URI BASE_URI = URI.create("http://example.com/");
```

### UtilityClassWithoutPrivateConstructor
Class `RoutingSupport` has only 'static' members, and lacks a 'private' constructor
in `httpclient5/src/main/java/org/apache/hc/client5/http/routing/RoutingSupport.java`
#### Snippet
```java
import org.apache.hc.core5.net.URIAuthority;

public final class RoutingSupport {

    public static HttpHost determineHost(final HttpRequest request) throws HttpException {
```

### UtilityClassWithoutPrivateConstructor
Class `AuthSchemeSupport` has only 'static' members, and lacks a 'private' constructor
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/AuthSchemeSupport.java`
#### Snippet
```java
 */
@Internal
public class AuthSchemeSupport {

    public static Charset parseCharset(
```

### UtilityClassWithoutPrivateConstructor
Class `SimpleHttpRequests` has only 'static' members, and lacks a 'private' constructor
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleHttpRequests.java`
#### Snippet
```java
 */
@Deprecated
public final class SimpleHttpRequests {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Operations` has only 'static' members, and lacks a 'private' constructor
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/Operations.java`
#### Snippet
```java
 * @since 5.0
 */
public final class Operations {

    private final static Cancellable NOOP_CANCELLABLE = () -> false;
```

### UtilityClassWithoutPrivateConstructor
Class `HeaderConstants` has only 'static' members, and lacks a 'private' constructor
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HeaderConstants.java`
#### Snippet
```java
 * @since 4.1
 */
public class HeaderConstants {

    public static final String GET_METHOD = "GET";
```

### UtilityClassWithoutPrivateConstructor
Class `ConnPoolSupport` has only 'static' members, and lacks a 'private' constructor
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/ConnPoolSupport.java`
#### Snippet
```java
 */
@Internal
public final class ConnPoolSupport {

    public static String getId(final Object object) {
```

### UtilityClassWithoutPrivateConstructor
Class `HttpsSupport` has only 'static' members, and lacks a 'private' constructor
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/HttpsSupport.java`
#### Snippet
```java
 * @since 5.0
 */
public final class HttpsSupport {

    private static String[] split(final String s) {
```

### UtilityClassWithoutPrivateConstructor
Class `RequestSupport` has only 'static' members, and lacks a 'private' constructor
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/RequestSupport.java`
#### Snippet
```java
 */
@Internal
public final class RequestSupport {

    public static String extractPathPrefix(final HttpRequest request) {
```

### UtilityClassWithoutPrivateConstructor
Class `ClassicHttpRequests` has only 'static' members, and lacks a 'private' constructor
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/methods/ClassicHttpRequests.java`
#### Snippet
```java
 */
@Deprecated
public final class ClassicHttpRequests {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ExecSupport` has only 'static' members, and lacks a 'private' constructor
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/ExecSupport.java`
#### Snippet
```java
 */
@Internal
public final class ExecSupport {

    private static final PrefixedIncrementingId INCREMENTING_ID = new PrefixedIncrementingId("ex-");
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Argument `body.getBodyBytes()` might be null
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleRequestProducer.java`
#### Snippet
```java
                entityProducer = new StringAsyncEntityProducer(body.getBodyText(), body.getContentType());
            } else {
                entityProducer = new BasicAsyncEntityProducer(body.getBodyBytes(), body.getContentType());
            }
        } else {
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
Argument `body.getBodyBytes()` might be null
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/async/AbstractSimpleServerExchangeHandler.java`
#### Snippet
```java
                entityProducer = new StringAsyncEntityProducer(body.getBodyText(), body.getContentType());
            } else {
                entityProducer = new BasicAsyncEntityProducer(body.getBodyBytes(), body.getContentType());
            }
        } else {
```

### DataFlowIssue
Argument `body.getBodyBytes()` might be null
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachingExec.java`
#### Snippet
```java
                response.setEntity(new StringEntity(body.getBodyText(), contentType, contentEncoding, false));
            } else {
                response.setEntity(new ByteArrayEntity(body.getBodyBytes(), contentType, contentEncoding, false));
            }
        }
```

### DataFlowIssue
Argument `keepAlive` might be null
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java
            if (reusable) {
                entry.updateState(state);
                entry.updateExpiry(keepAlive);
                conn.passivate();
                if (LOG.isDebugEnabled()) {
```

## RuleId[ruleID=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `digest()` overloads a compatible method of a superclass, when overriding might have been intended
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleResponseBuilder.java`
#### Snippet
```java
    }

    protected void digest(final SimpleHttpResponse response) {
        super.digest(response);
        setBody(response.getBody());
```

### MethodOverloadsParentMethod
Method `digest()` overloads a compatible method of a superclass, when overriding might have been intended
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleRequestBuilder.java`
#### Snippet
```java
    }

    protected void digest(final SimpleHttpRequest request) {
        super.digest(request);
        setBody(request.getBody());
```

## RuleId[ruleID=DeprecatedIsStillUsed]
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

## RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/DeflateInputStream.java`
#### Snippet
```java
     */
    @Override
    public void reset() throws IOException {
        sourceStream.reset();
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `mark()` overrides synchronized method
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/DeflateInputStream.java`
#### Snippet
```java
     */
    @Override
    public void mark(final int readLimit) {
        sourceStream.mark(readLimit);
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/LoggingInputStream.java`
#### Snippet
```java

    @Override
    public void reset() throws IOException {
        super.reset();
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `mark()` overrides synchronized method
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/LoggingInputStream.java`
#### Snippet
```java

    @Override
    public void mark(final int readlimit) {
        super.mark(readlimit);
    }
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'body' in a Serializable class
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleHttpResponse.java`
#### Snippet
```java

    private static final long serialVersionUID = 1L;
    private SimpleBody body;

    public SimpleHttpResponse(final int code) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'requestConfig' in a Serializable class
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/ConfigurableHttpRequest.java`
#### Snippet
```java

    private static final long serialVersionUID = 1L;
    private RequestConfig requestConfig;

    public ConfigurableHttpRequest(final String method, final String path) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'body' in a Serializable class
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleHttpRequest.java`
#### Snippet
```java

    private static final long serialVersionUID = 1L;
    private SimpleBody body;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'cancellableRef' in a Serializable class
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/methods/HttpUriRequestBase.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private final AtomicMarkableReference<Cancellable> cancellableRef;
    private RequestConfig requestConfig;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'requestConfig' in a Serializable class
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/methods/HttpUriRequestBase.java`
#### Snippet
```java

    private final AtomicMarkableReference<Cancellable> cancellableRef;
    private RequestConfig requestConfig;

    public HttpUriRequestBase(final String method, final URI requestUri) {
```

## RuleId[ruleID=MismatchedJavadocCode]
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

## RuleId[ruleID=CatchMayIgnoreException]
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

## RuleId[ruleID=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/Hex.java`
#### Snippet
```java
        // two characters form the hex value.
        for (int i = dataOffset, j = outOffset; i < dataOffset + dataLen; i++) {
            out[j++] = toDigits[(0xF0 & data[i]) >>> 4];
            out[j++] = toDigits[0x0F & data[i]];
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/Hex.java`
#### Snippet
```java
        for (int i = dataOffset, j = outOffset; i < dataOffset + dataLen; i++) {
            out[j++] = toDigits[(0xF0 & data[i]) >>> 4];
            out[j++] = toDigits[0x0F & data[i]];
        }
    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/HttpRFC7578Multipart.java`
#### Snippet
```java
                        throw new IllegalArgumentException("Invalid encoding: too short");
                    }
                    final int u = digit16(bytes[++i]);
                    final int l = digit16(bytes[++i]);
                    buffer.append((char) ((u << 4) + l));
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/HttpRFC7578Multipart.java`
#### Snippet
```java
                    }
                    final int u = digit16(bytes[++i]);
                    final int l = digit16(bytes[++i]);
                    buffer.append((char) ((u << 4) + l));
                } else {
```

## RuleId[ruleID=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `SimpleHttpResponseWriter` may be 'static'
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpByteArrayCacheEntrySerializer.java`
#### Snippet
```java
     */
    // Seems like the DefaultHttpResponseWriter should be able to do this, but it doesn't seem to be able to
    private class SimpleHttpResponseWriter extends AbstractMessageWriter<SimpleHttpResponse> {

        public SimpleHttpResponseWriter() {
```

### InnerClassMayBeStatic
Inner class `InternalConnectionEndpoint` may be 'static'
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/PoolingAsyncClientConnectionManager.java`
#### Snippet
```java
    private static final PrefixedIncrementingId INCREMENTING_ID = new PrefixedIncrementingId("ep-");

    class InternalConnectionEndpoint extends AsyncConnectionEndpoint implements Identifiable {

        private final AtomicReference<PoolEntry<HttpRoute, ManagedAsyncClientConnection>> poolEntryRef;
```

### InnerClassMayBeStatic
Inner class `InternalConnectionEndpoint` may be 'static'
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManager.java`
#### Snippet
```java
    private static final PrefixedIncrementingId INCREMENTING_ID = new PrefixedIncrementingId("ep-");

    class InternalConnectionEndpoint extends ConnectionEndpoint implements Identifiable {

        private final AtomicReference<PoolEntry<HttpRoute, ManagedHttpClientConnection>> poolEntryRef;
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java

        final String response;
        if (message == null || message.trim().equals("")) {
            response = new Type1Message(host, domain).getResponse();
        } else {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java

        final String response;
        if (message == null || message.trim().equals("")) {
            response = getType1Message(host, domain);
        } else {
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `httpclient5/src/main/java/org/apache/hc/client5/http/classic/HttpClient.java`
#### Snippet
```java
     */
    @SuppressWarnings("deprecation")
    default ClassicHttpResponse executeOpen(HttpHost target, ClassicHttpRequest request, HttpContext context) throws IOException {
        return (ClassicHttpResponse) execute(target, request, context);
    }
```

### RedundantSuppression
Redundant suppression
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/RequestConfig.java`
#### Snippet
```java
    }
    @SuppressWarnings("deprecation")
    public static RequestConfig.Builder copy(final RequestConfig config) {
        return new Builder()
            .setExpectContinueEnabled(config.isExpectContinueEnabled())
```

### RedundantSuppression
Redundant suppression
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/Cookie.java`
#### Snippet
```java
     */
    @SuppressWarnings("deprecation")
    default boolean isExpired(final Instant date) {
        return isExpired(date != null ? new Date(date.toEpochMilli()) : null);
    }
```

### RedundantSuppression
Redundant suppression
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/CookieStore.java`
#### Snippet
```java
     */
    @SuppressWarnings("deprecation")
    default boolean clearExpired(Instant date) {
        return clearExpired(date != null ? new Date(date.toEpochMilli()) : null);
    }
```

### RedundantSuppression
Redundant suppression
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/BasicScheme.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        try {
```

### RedundantSuppression
Redundant suppression
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/PoolingHttpClientConnectionManagerBuilder.java`
#### Snippet
```java

    public PoolingHttpClientConnectionManager build() {
        @SuppressWarnings("resource") final PoolingHttpClientConnectionManager poolingmgr = new PoolingHttpClientConnectionManager(
                RegistryBuilder.<ConnectionSocketFactory>create()
                        .register(URIScheme.HTTP.id, PlainConnectionSocketFactory.getSocketFactory())
                        .register(URIScheme.HTTPS.id, sslSocketFactory != null ? sslSocketFactory :
                                (systemProperties ?
                                        SSLConnectionSocketFactory.getSystemSocketFactory() :
                                        SSLConnectionSocketFactory.getSocketFactory()))
                        .build(),
                poolConcurrencyPolicy,
                poolReusePolicy,
                null,
                schemePortResolver,
                dnsResolver,
                connectionFactory);
        poolingmgr.setSocketConfigResolver(socketConfigResolver);
        poolingmgr.setConnectionConfigResolver(connectionConfigResolver);
```

### RedundantSuppression
Redundant suppression
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheUpdateHandler.java`
#### Snippet
```java
    }
    @SuppressWarnings("deprecation")
    public HttpCacheEntry updateParentCacheEntry(
            final String requestId,
            final HttpCacheEntry existing,
```

## RuleId[ruleID=ComparatorResultComparison]
### ComparatorResultComparison
Comparison of compare method result with specific constant
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheValidityPolicy.java`
#### Snippet
```java
    public boolean isResponseHeuristicallyFresh(final HttpCacheEntry entry,
            final Instant now, final float coefficient, final TimeValue defaultLifetime) {
        return getCurrentAge(entry, now).compareTo(getHeuristicFreshnessLifetime(entry, coefficient, defaultLifetime)) == -1;
    }

```

### ComparatorResultComparison
Comparison of compare method result with specific constant
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheValidityPolicy.java`
#### Snippet
```java

    public boolean isResponseFresh(final HttpCacheEntry entry, final Instant now) {
        return getCurrentAge(entry, now).compareTo(getFreshnessLifetime(entry)) == -1;
    }

```

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
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

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ResponseCachingPolicy.java`
#### Snippet
```java
        if (it.hasNext()) {
            final HeaderElement elt = it.next();
            final String proto = elt.toString().split("\\s")[0];
            if (proto.contains("/")) {
                return proto.equals("HTTP/1.0");
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/HttpsSupport.java`
#### Snippet
```java
            return null;
        }
        return s.split(" *, *");
    }

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http.auth` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/BasicAuthCache.java`
#### Snippet
```java
/**
 * Default implementation of {@link AuthCache}. This implements
 * expects {@link org.apache.hc.client5.http.auth.AuthScheme} to be {@link java.io.Serializable}
 * in order to be cacheable.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/BasicAuthCache.java`
#### Snippet
```java
/**
 * Default implementation of {@link AuthCache}. This implements
 * expects {@link org.apache.hc.client5.http.auth.AuthScheme} to be {@link java.io.Serializable}
 * in order to be cacheable.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/CookieStore.java`
#### Snippet
```java
    /**
     * Removes all of {@link Cookie}s in this store that have expired by
     * the specified {@link java.util.Date}.
     *
     * @return true if any cookies were purged.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/BasicCookieStore.java`
#### Snippet
```java
    /**
     * Removes all of {@link Cookie cookies} in this HTTP state
     * that have expired by the specified {@link java.util.Date date}.
     *
     * @return true if any cookies were purged.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/InputStreamFactory.java`
#### Snippet
```java

/**
 * Factory for decorated {@link java.io.InputStream}s.
 *
 * @since 4.4
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.core5.http.nio` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleRequestProducer.java`
#### Snippet
```java
 * in requests are known to be small. It is generally recommended to use
 * {@link org.apache.hc.core5.http.nio.support.AsyncRequestBuilder} and streaming
 * {@link org.apache.hc.core5.http.nio.AsyncEntityProducer}s.
 *
 * @since 5.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.core5.http.nio` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleRequestProducer.java`
#### Snippet
```java
 * @see SimpleHttpRequest
 * @see org.apache.hc.core5.http.nio.support.AsyncRequestBuilder
 * @see org.apache.hc.core5.http.nio.AsyncEntityProducer
 */
public final class SimpleRequestProducer extends BasicRequestProducer {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http.impl.classic` is unnecessary and can be removed
in `httpclient5-win/src/main/java/org/apache/hc/client5/http/impl/win/WinHttpClients.java`
#### Snippet
```java

/**
 * Factory methods for {@link org.apache.hc.client5.http.impl.classic.CloseableHttpClient} instances configured to use integrated
 * Windows authentication by default.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http.entity.mime` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/FileBody.java`
#### Snippet
```java
 * Binary body part backed by a file.
 *
 * @see org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder
 *
 * @since 4.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixListParser.java`
#### Snippet
```java
     *
     * @param reader the data reader. The caller is responsible for closing the reader.
     * @throws java.io.IOException on error while reading from list
     */
    public PublicSuffixList parse(final Reader reader) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixListParser.java`
#### Snippet
```java
     *
     * @param reader the data reader. The caller is responsible for closing the reader.
     * @throws java.io.IOException on error while reading from list
     *
     * @since 4.5
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http.cookie` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/CookieAttributeHandler.java`
#### Snippet
```java
   * submitted) with the corresponding cookie attribute.
   *
   * @param cookie {@link org.apache.hc.client5.http.cookie.Cookie} to match
   * @param origin the cookie source to match against
   * @return {@code true} if the match is successful; {@code false} otherwise
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http.cookie` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/CookieAttributeHandler.java`
#### Snippet
```java
   * Performs cookie validation for the given attribute value.
   *
   * @param cookie {@link org.apache.hc.client5.http.cookie.Cookie} to validate
   * @param origin the cookie source to validate against
   * @throws MalformedCookieException if cookie validation fails for this attribute
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http.cookie` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/CookieAttributeHandler.java`
#### Snippet
```java
  /**
   * Parse the given cookie attribute value and processChallenge the corresponding
   * {@link org.apache.hc.client5.http.cookie.Cookie} property.
   *
   * @param cookie {@link org.apache.hc.client5.http.cookie.Cookie} to be updated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http.cookie` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/CookieAttributeHandler.java`
#### Snippet
```java
   * {@link org.apache.hc.client5.http.cookie.Cookie} property.
   *
   * @param cookie {@link org.apache.hc.client5.http.cookie.Cookie} to be updated
   * @param value cookie attribute value from the cookie response header
   * @throws MalformedCookieException if cookie parsing fails for this attribute
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http.impl` is unnecessary, and can be replaced with an import
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ClassicRequestCopier.java`
#### Snippet
```java
 */
@Deprecated
public final class ClassicRequestCopier implements org.apache.hc.client5.http.impl.MessageCopier<ClassicHttpRequest> {

    public static final ClassicRequestCopier INSTANCE = new ClassicRequestCopier();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
    private static final java.security.SecureRandom RND_GEN;
    static {
        java.security.SecureRandom rnd = null;
        try {
            rnd = java.security.SecureRandom.getInstance("SHA1PRNG");
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java
        java.security.SecureRandom rnd = null;
        try {
            rnd = java.security.SecureRandom.getInstance("SHA1PRNG");
        } catch (final Exception ignore) {
            // ignore
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMEngineImpl.java`
#### Snippet
```java

    /** Secure random generator */
    private static final java.security.SecureRandom RND_GEN;
    static {
        java.security.SecureRandom rnd = null;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http.entity.mime` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/InputStreamBody.java`
#### Snippet
```java
 * Binary body part backed by an input stream.
 *
 * @see org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder
 *
 * @since 4.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http.entity.mime` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/FormBodyPartBuilder.java`
#### Snippet
```java

/**
 * Builder for individual {@link org.apache.hc.client5.http.entity.mime.FormBodyPart}s.
 *
 * @since 4.4
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http.entity.mime` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/StringBody.java`
#### Snippet
```java
 * Text body part backed by a byte array.
 *
 * @see org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder
 *
 * @since 4.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicClientCookie.java`
#### Snippet
```java
     * @return The value of the path attribute.
     *
     * @see #setPath(java.lang.String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicClientCookie.java`
#### Snippet
```java
     * @return the value of the domain attribute
     *
     * @see #setDomain(java.lang.String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/BasicClientCookie.java`
#### Snippet
```java
     * @return Expiration {@link Date}, or {@code null}.
     *
     * @see #setExpiryDate(java.util.Date)
     *
     * @deprecated Use {@link #getExpiryInstant()}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http.entity.mime` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/ByteArrayBody.java`
#### Snippet
```java
 * Binary body part backed by a byte array.
 *
 * @see org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder
 *
 * @since 4.1
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.net.ssl` is unnecessary, and can be replaced with an import
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/SSLConnectionSocketFactoryBuilder.java`
#### Snippet
```java

    public SSLConnectionSocketFactory build() {
        final javax.net.ssl.SSLSocketFactory socketFactory;
        if (sslContext != null) {
            socketFactory = sslContext.getSocketFactory();
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.net.ssl` is unnecessary, and can be replaced with an import
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/SSLConnectionSocketFactoryBuilder.java`
#### Snippet
```java
        } else {
            if (systemProperties) {
                socketFactory = (javax.net.ssl.SSLSocketFactory) javax.net.ssl.SSLSocketFactory.getDefault();
            } else {
                socketFactory = SSLContexts.createDefault().getSocketFactory();
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.net.ssl` is unnecessary, and can be replaced with an import
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/SSLConnectionSocketFactoryBuilder.java`
#### Snippet
```java
        } else {
            if (systemProperties) {
                socketFactory = (javax.net.ssl.SSLSocketFactory) javax.net.ssl.SSLSocketFactory.getDefault();
            } else {
                socketFactory = SSLContexts.createDefault().getSocketFactory();
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.net.ssl` is unnecessary, and can be replaced with an import
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/SSLConnectionSocketFactory.java`
#### Snippet
```java
     */
    public SSLConnectionSocketFactory(
            final javax.net.ssl.SSLSocketFactory socketFactory,
            final HostnameVerifier hostnameVerifier) {
        this(socketFactory, null, null, hostnameVerifier);
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.net.ssl` is unnecessary, and can be replaced with an import
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/SSLConnectionSocketFactory.java`
#### Snippet
```java
    public static SSLConnectionSocketFactory getSystemSocketFactory() throws SSLInitializationException {
        return new SSLConnectionSocketFactory(
                (javax.net.ssl.SSLSocketFactory) javax.net.ssl.SSLSocketFactory.getDefault(),
                HttpsSupport.getSystemProtocols(),
                HttpsSupport.getSystemCipherSuits(),
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.net.ssl` is unnecessary, and can be replaced with an import
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/SSLConnectionSocketFactory.java`
#### Snippet
```java
    public static SSLConnectionSocketFactory getSystemSocketFactory() throws SSLInitializationException {
        return new SSLConnectionSocketFactory(
                (javax.net.ssl.SSLSocketFactory) javax.net.ssl.SSLSocketFactory.getDefault(),
                HttpsSupport.getSystemProtocols(),
                HttpsSupport.getSystemCipherSuits(),
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/SSLConnectionSocketFactory.java`
#### Snippet
```java
     *
     * The default implementation is a no-op, but could be overridden to, e.g.,
     * call {@link javax.net.ssl.SSLSocket#setEnabledCipherSuites(String[])}.
     * @throws IOException may be thrown if overridden
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.net.ssl` is unnecessary, and can be replaced with an import
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/SSLConnectionSocketFactory.java`
#### Snippet
```java
     */
    public SSLConnectionSocketFactory(
            final javax.net.ssl.SSLSocketFactory socketFactory,
            final String[] supportedProtocols,
            final String[] supportedCipherSuites,
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.net.ssl` is unnecessary, and can be replaced with an import
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/SSLConnectionSocketFactory.java`
#### Snippet
```java
    }

    private final javax.net.ssl.SSLSocketFactory socketFactory;
    private final HostnameVerifier hostnameVerifier;
    private final String[] supportedProtocols;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http.config` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/HttpClientContext.java`
#### Snippet
```java

    /**
     * Attribute name of a {@link org.apache.hc.client5.http.config.RequestConfig} object that
     * represents the actual request configuration.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http.cookie` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/HttpClientContext.java`
#### Snippet
```java

    /**
     * Attribute name of a {@link org.apache.hc.client5.http.cookie.CookieOrigin}
     * object that represents the actual details of the origin server.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/HttpClientContext.java`
#### Snippet
```java

    /**
     * Attribute name of a {@link java.lang.Object} object that represents
     * the actual user identity such as user {@link java.security.Principal}.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.core5.http` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/HttpClientContext.java`
#### Snippet
```java
    /**
     * Attribute name of a map containing actual {@link AuthExchange}s keyed by their respective
     * {@link org.apache.hc.core5.http.HttpHost}.
     */
    public static final String AUTH_EXCHANGE_MAP     = "http.auth.exchanges";
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.core5.http.config` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/HttpClientContext.java`
#### Snippet
```java

    /**
     * Attribute name of a {@link org.apache.hc.core5.http.config.Lookup} object that represents
     * the actual {@link CookieSpecFactory} registry.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http.cookie` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/HttpClientContext.java`
#### Snippet
```java

    /**
     * Attribute name of a {@link org.apache.hc.client5.http.cookie.CookieSpec}
     * object that represents the actual cookie specification.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/HttpClientContext.java`
#### Snippet
```java

    /**
     * Attribute name of a {@link java.lang.String} object that represents the ID of the
     * current message exchange.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.core5.http.config` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/HttpClientContext.java`
#### Snippet
```java

    /**
     * Attribute name of a {@link org.apache.hc.core5.http.config.Lookup} object that represents
     * the actual {@link AuthSchemeFactory} registry.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setText(String)},
     * {@link #setBinary(byte[])},
     * {@link #setStream(java.io.InputStream)} ,
     * {@link #setSerializable(java.io.Serializable)} ,
     * {@link #setFile(java.io.File)} methods.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setBinary(byte[])},
     * {@link #setStream(java.io.InputStream)} ,
     * {@link #setSerializable(java.io.Serializable)} ,
     * {@link #setFile(java.io.File)} methods.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setStream(java.io.InputStream)} ,
     * {@link #setSerializable(java.io.Serializable)} ,
     * {@link #setFile(java.io.File)} methods.
     */
    public EntityBuilder setParameters(final List<NameValuePair> parameters) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
    /**
     * Returns entity content as a {@link File} if set using
     * {@link #setFile(java.io.File)} method.
     */
    public File getFile() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
    /**
     * Returns entity content as a {@link Serializable} if set using
     * {@link #setSerializable(java.io.Serializable)} method.
     */
    public Serializable getSerializable() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * Sets entity content as a string. This method is mutually exclusive with
     * {@link #setBinary(byte[])},
     * {@link #setStream(java.io.InputStream)} ,
     * {@link #setSerializable(java.io.Serializable)} ,
     * {@link #setParameters(java.util.List)},
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setBinary(byte[])},
     * {@link #setStream(java.io.InputStream)} ,
     * {@link #setSerializable(java.io.Serializable)} ,
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setStream(java.io.InputStream)} ,
     * {@link #setSerializable(java.io.Serializable)} ,
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
     * {@link #setFile(java.io.File)} methods.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
     * {@link #setFile(java.io.File)} methods.
     */
    public EntityBuilder setText(final String text) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
    /**
     * Returns entity content as a parameter list if set using
     * {@link #setParameters(java.util.List)} or
     * {@link #setParameters(NameValuePair...)} methods.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setText(String)},
     * {@link #setBinary(byte[])},
     * {@link #setSerializable(java.io.Serializable)} ,
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setBinary(byte[])},
     * {@link #setSerializable(java.io.Serializable)} ,
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
     * {@link #setFile(java.io.File)} methods.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
     * {@link #setFile(java.io.File)} methods.
     */
    public EntityBuilder setStream(final InputStream stream) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
 *   <li>{@link #setText(String)}</li>
 *   <li>{@link #setBinary(byte[])}</li>
 *   <li>{@link #setStream(java.io.InputStream)}</li>
 *   <li>{@link #setSerializable(java.io.Serializable)}</li>
 *   <li>{@link #setParameters(java.util.List)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
 *   <li>{@link #setBinary(byte[])}</li>
 *   <li>{@link #setStream(java.io.InputStream)}</li>
 *   <li>{@link #setSerializable(java.io.Serializable)}</li>
 *   <li>{@link #setParameters(java.util.List)}</li>
 *   <li>{@link #setParameters(NameValuePair...)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
 *   <li>{@link #setStream(java.io.InputStream)}</li>
 *   <li>{@link #setSerializable(java.io.Serializable)}</li>
 *   <li>{@link #setParameters(java.util.List)}</li>
 *   <li>{@link #setParameters(NameValuePair...)}</li>
 *   <li>{@link #setFile(java.io.File)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
 *   <li>{@link #setParameters(java.util.List)}</li>
 *   <li>{@link #setParameters(NameValuePair...)}</li>
 *   <li>{@link #setFile(java.io.File)}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setText(String)},
     * {@link #setBinary(byte[])},
     * {@link #setStream(java.io.InputStream)} ,
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setBinary(byte[])},
     * {@link #setStream(java.io.InputStream)} ,
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
     * {@link #setFile(java.io.File)} methods.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
     * {@link #setFile(java.io.File)} methods.
     */
    public EntityBuilder setSerializable(final Serializable serializable) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setText(String)},
     * {@link #setBinary(byte[])},
     * {@link #setStream(java.io.InputStream)} ,
     * {@link #setSerializable(java.io.Serializable)} ,
     * {@link #setFile(java.io.File)} methods.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setBinary(byte[])},
     * {@link #setStream(java.io.InputStream)} ,
     * {@link #setSerializable(java.io.Serializable)} ,
     * {@link #setFile(java.io.File)} methods.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setStream(java.io.InputStream)} ,
     * {@link #setSerializable(java.io.Serializable)} ,
     * {@link #setFile(java.io.File)} methods.
     */
    public EntityBuilder setParameters(final NameValuePair... parameters) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
    /**
     * Returns entity content as a {@link InputStream} if set using
     * {@link #setStream(java.io.InputStream)} method.
     */
    public InputStream getStream() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * Sets entity content as a byte array. This method is mutually exclusive with
     * {@link #setText(String)},
     * {@link #setStream(java.io.InputStream)} ,
     * {@link #setSerializable(java.io.Serializable)} ,
     * {@link #setParameters(java.util.List)},
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setText(String)},
     * {@link #setStream(java.io.InputStream)} ,
     * {@link #setSerializable(java.io.Serializable)} ,
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setStream(java.io.InputStream)} ,
     * {@link #setSerializable(java.io.Serializable)} ,
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
     * {@link #setFile(java.io.File)} methods.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
     * {@link #setFile(java.io.File)} methods.
     */
    public EntityBuilder setBinary(final byte[] binary) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setText(String)},
     * {@link #setBinary(byte[])},
     * {@link #setStream(java.io.InputStream)} ,
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setBinary(byte[])},
     * {@link #setStream(java.io.InputStream)} ,
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
     * {@link #setSerializable(java.io.Serializable)} methods.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/EntityBuilder.java`
#### Snippet
```java
     * {@link #setParameters(java.util.List)},
     * {@link #setParameters(NameValuePair...)}
     * {@link #setSerializable(java.io.Serializable)} methods.
     */
    public EntityBuilder setFile(final File file) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http.routing` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java
     * <p>
     * Please note this value can be overridden by the {@link #setRoutePlanner(
     *   org.apache.hc.client5.http.routing.HttpRoutePlanner)} method.
     */
    public final HttpClientBuilder setProxy(final HttpHost proxy) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http.entity` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/HttpClientBuilder.java`
#### Snippet
```java

    /**
     * Assigns a map of {@link org.apache.hc.client5.http.entity.InputStreamFactory}s
     * to be used for automatic content decompression.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.client5.http.cookie` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/CommonCookieAttributeHandler.java`
#### Snippet
```java

/**
 * Extension of {@link org.apache.hc.client5.http.cookie.CookieAttributeHandler} intended
 * to handle one specific common attribute whose name is returned with
 * {@link #getAttributeName()} method.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `httpclient5/src/main/java/org/apache/hc/client5/http/protocol/RedirectLocations.java`
#### Snippet
```java

/**
 * This class represents a collection of {@link java.net.URI}s used
 * as redirect locations.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.core5.http` is unnecessary and can be removed
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ConditionalRequestBuilder.java`
#### Snippet
```java
    /**
     * When a {@link HttpCacheEntry} is stale but 'might' be used as a response
     * to an {@link org.apache.hc.core5.http.HttpRequest} we will attempt to revalidate
     * the entry with the origin.  Build the origin {@link org.apache.hc.core5.http.HttpRequest}
     * here and return it.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.core5.http` is unnecessary and can be removed
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ConditionalRequestBuilder.java`
#### Snippet
```java
     * When a {@link HttpCacheEntry} is stale but 'might' be used as a response
     * to an {@link org.apache.hc.core5.http.HttpRequest} we will attempt to revalidate
     * the entry with the origin.  Build the origin {@link org.apache.hc.core5.http.HttpRequest}
     * here and return it.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.core5.http` is unnecessary and can be removed
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ConditionalRequestBuilder.java`
#### Snippet
```java
    /**
     * When a {@link HttpCacheEntry} does not exist for a specific
     * {@link org.apache.hc.core5.http.HttpRequest} we attempt to see if an existing
     * {@link HttpCacheEntry} is appropriate by building a conditional
     * {@link org.apache.hc.core5.http.HttpRequest} using the variants' ETag values.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hc.core5.http` is unnecessary and can be removed
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ConditionalRequestBuilder.java`
#### Snippet
```java
     * {@link org.apache.hc.core5.http.HttpRequest} we attempt to see if an existing
     * {@link HttpCacheEntry} is appropriate by building a conditional
     * {@link org.apache.hc.core5.http.HttpRequest} using the variants' ETag values.
     * If no such values exist, the request is unmodified
     *
```

## RuleId[ruleID=ArrayObjectsEquals]
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

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractBinaryCacheStorage()` of an abstract class should not be declared 'public'
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractBinaryCacheStorage.java`
#### Snippet
```java
    }

    public AbstractBinaryCacheStorage(final int maxUpdateRetries) {
        super(maxUpdateRetries, ByteArrayCacheEntrySerializer.INSTANCE);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractBinaryCacheStorage()` of an abstract class should not be declared 'public'
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractBinaryCacheStorage.java`
#### Snippet
```java
public abstract class AbstractBinaryCacheStorage<CAS> extends AbstractSerializingCacheStorage<byte[], CAS> {

    public AbstractBinaryCacheStorage(final int maxUpdateRetries, final HttpCacheEntrySerializer<byte[]> serializer) {
        super(maxUpdateRetries, serializer);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSerializingCacheStorage()` of an abstract class should not be declared 'public'
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingCacheStorage.java`
#### Snippet
```java
    private final HttpCacheEntrySerializer<T> serializer;

    public AbstractSerializingCacheStorage(final int maxUpdateRetries, final HttpCacheEntrySerializer<T> serializer) {
        this.maxUpdateRetries = Args.notNegative(maxUpdateRetries, "Max retries");
        this.serializer = Args.notNull(serializer, "Cache entry serializer");
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSerializingAsyncCacheStorage()` of an abstract class should not be declared 'public'
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingAsyncCacheStorage.java`
#### Snippet
```java
    private final HttpCacheEntrySerializer<T> serializer;

    public AbstractSerializingAsyncCacheStorage(final int maxUpdateRetries, final HttpCacheEntrySerializer<T> serializer) {
        this.maxUpdateRetries = Args.notNegative(maxUpdateRetries, "Max retries");
        this.serializer = Args.notNull(serializer, "Cache entry serializer");
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractCookieSpec()` of an abstract class should not be declared 'public'
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/AbstractCookieSpec.java`
#### Snippet
```java
     * Default constructor
     * */
    public AbstractCookieSpec() {
        super();
        this.attribHandlerMap = new ConcurrentHashMap<>(10);
```

### NonProtectedConstructorInAbstractClass
Constructor `CookieSpecBase()` of an abstract class should not be declared 'public'
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/cookie/CookieSpecBase.java`
#### Snippet
```java
public abstract class CookieSpecBase extends AbstractCookieSpec {

    public CookieSpecBase() {
        super();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractContentBody()` of an abstract class should not be declared 'public'
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/AbstractContentBody.java`
#### Snippet
```java
     * @since 4.3
     */
    public AbstractContentBody(final ContentType contentType) {
        super();
        Args.notNull(contentType, "Content type");
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractMultipartFormat()` of an abstract class should not be declared 'public'
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/AbstractMultipartFormat.java`
#### Snippet
```java
     * @throws IllegalArgumentException if charset is null or boundary is null
     */
    public AbstractMultipartFormat(final Charset charset, final String boundary) {
        super();
        Args.notNull(boundary, "Multipart boundary");
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractMultipartFormat()` of an abstract class should not be declared 'public'
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/AbstractMultipartFormat.java`
#### Snippet
```java
    }

    public AbstractMultipartFormat(final String boundary) {
        this(null, boundary);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractBinaryAsyncCacheStorage()` of an abstract class should not be declared 'public'
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractBinaryAsyncCacheStorage.java`
#### Snippet
```java
public abstract class AbstractBinaryAsyncCacheStorage<CAS> extends AbstractSerializingAsyncCacheStorage<byte[], CAS> {

    public AbstractBinaryAsyncCacheStorage(final int maxUpdateRetries, final HttpCacheEntrySerializer<byte[]> serializer) {
        super(maxUpdateRetries, serializer);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractBinaryAsyncCacheStorage()` of an abstract class should not be declared 'public'
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractBinaryAsyncCacheStorage.java`
#### Snippet
```java
    }

    public AbstractBinaryAsyncCacheStorage(final int maxUpdateRetries) {
        super(maxUpdateRetries, ByteArrayCacheEntrySerializer.INSTANCE);
    }
```

## RuleId[ruleID=UnnecessaryContinue]
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

## RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
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

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/TlsConfig.java`
#### Snippet
```java
     */
    public String[] getSupportedProtocols() {
        return supportedProtocols != null ? supportedProtocols.clone() : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/config/TlsConfig.java`
#### Snippet
```java
     */
    public String[] getSupportedCipherSuites() {
        return supportedCipherSuites != null ? supportedCipherSuites.clone() : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/SystemDefaultCredentialsProvider.java`
#### Snippet
```java
        final String proxyHost = System.getProperty(protocol + ".proxyHost");
        if (proxyHost == null) {
            return null;
        }
        final String proxyPort = System.getProperty(protocol + ".proxyPort");
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/SystemDefaultCredentialsProvider.java`
#### Snippet
```java
        final String proxyPort = System.getProperty(protocol + ".proxyPort");
        if (proxyPort == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/SystemDefaultCredentialsProvider.java`
#### Snippet
```java
                final String proxyUser = System.getProperty(protocol + ".proxyUser");
                if (proxyUser == null) {
                    return null;
                }
                final String proxyPassword = System.getProperty(protocol + ".proxyPassword");
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/SystemDefaultCredentialsProvider.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/SystemDefaultCredentialsProvider.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/BasicAuthCache.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/GGSSchemeBase.java`
#### Snippet
```java
    @Override
    public String getRealm() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/GGSSchemeBase.java`
#### Snippet
```java
    @Override
    public Principal getPrincipal() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpCache.java`
#### Snippet
```java
                LOG.warn("I/O error retrieving cache entry with key {}", cacheKey);
            }
            return null;
        }
        if (root == null) {
```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpCache.java`
#### Snippet
```java
        }
        if (root == null) {
            return null;
        }
        if (!root.hasVariants()) {
```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpCache.java`
#### Snippet
```java
        final String variantCacheKey = root.getVariantMap().get(variantKey);
        if (variantCacheKey == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/BasicHttpCache.java`
#### Snippet
```java
                LOG.warn("I/O error retrieving cache entry with key {}", variantCacheKey);
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/DnsUtils.java`
#### Snippet
```java
    public static String normalize(final String s) {
        if (s == null) {
            return null;
        }
        int pos = 0;
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/RouteTracker.java`
#### Snippet
```java
    public HttpRoute toRoute() {
        return !this.connected ?
            null : new HttpRoute(this.targetHost, this.localAddress,
                                 this.proxyChain, this.secure,
                                 this.tunnelled, this.layered);
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/RouteTracker.java`
#### Snippet
```java
    @Override
    public HttpHost getProxyHost() {
        return (this.proxyChain == null) ? null : this.proxyChain[0];
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/Base64.java`
#### Snippet
```java
    public byte[] decode(final String base64) {
        if (null == base64) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/Base64.java`
#### Snippet
```java
    public byte[] encode(final byte[] value) {
        if (null == value) {
            return null;
        }
        return getEncoder().encode(value);
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/Base64.java`
#### Snippet
```java
    public byte[] decode(final byte[] base64) {
        if (null == base64) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/Base64.java`
#### Snippet
```java
    public static String encodeBase64String(final byte[] bytes) {
        if (null == bytes) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/AuthCacheKeeper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/DefaultCacheInvalidator.java`
#### Snippet
```java
                LOG.warn("Unable to get cache entry with key {}", cacheKey, ex);
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ByteArrayCacheEntrySerializer.java`
#### Snippet
```java
    public HttpCacheStorageEntry deserialize(final byte[] serializedObject) throws ResourceIOException {
        if (serializedObject == null) {
            return null;
        }
        try (final ObjectInputStream ois = new RestrictedObjectInputStream(new ByteArrayInputStream(serializedObject))) {
```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/ByteArrayCacheEntrySerializer.java`
#### Snippet
```java
    public byte[] serialize(final HttpCacheStorageEntry cacheEntry) throws ResourceIOException {
        if (cacheEntry == null) {
            return null;
        }
        final ByteArrayOutputStream buf = new ByteArrayOutputStream();
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/DateUtils.java`
#### Snippet
```java
     */
    public static Instant toInstant(final Date date) {
        return date != null ? Instant.ofEpochMilli(date.getTime()) : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/DateUtils.java`
#### Snippet
```java
    public static Instant parseStandardDate(final MessageHeaders headers, final String headerName) {
        if (headers == null) {
            return null;
        }
        final Header header = headers.getFirstHeader(headerName);
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/DateUtils.java`
#### Snippet
```java
        final Header header = headers.getFirstHeader(headerName);
        if (header == null) {
            return null;
        }
        return parseStandardDate(header.getValue());
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/DateUtils.java`
#### Snippet
```java
     */
    public static LocalDateTime toUTC(final Instant instant) {
        return instant != null ? instant.atZone(ZoneOffset.UTC).toLocalDateTime() : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/DateUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/DateUtils.java`
#### Snippet
```java
     */
    public static Date toDate(final Instant instant) {
        return instant != null ? new Date(instant.toEpochMilli()) : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/RequestProtocolCompliance.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/RequestProtocolCompliance.java`
#### Snippet
```java
        final String method = request.getMethod();
        if (!(HeaderConstants.GET_METHOD.equals(method))) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/RequestProtocolCompliance.java`
#### Snippet
```java
        final Header range = request.getFirstHeader(HeaderConstants.RANGE);
        if (range == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/RequestProtocolCompliance.java`
#### Snippet
```java
        final Header ifRange = request.getFirstHeader(HeaderConstants.IF_RANGE);
        if (ifRange == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/RequestProtocolCompliance.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/RequestProtocolCompliance.java`
#### Snippet
```java
        final String method = request.getMethod();
        if (!(HeaderConstants.PUT_METHOD.equals(method) || HeaderConstants.DELETE_METHOD.equals(method))) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/RequestProtocolCompliance.java`
#### Snippet
```java
            final Header ifNoneMatch = request.getFirstHeader(HeaderConstants.IF_NONE_MATCH);
            if (ifNoneMatch == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/RequestProtocolCompliance.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/SingleCredentialsProvider.java`
#### Snippet
```java
    @Override
    public Credentials getCredentials(final AuthScope authScope, final HttpContext context) {
        return this.authScope.match(authScope) >= 0 ? credentials : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingCacheStorage.java`
#### Snippet
```java
        final T storageObject = restore(storageKey);
        if (storageObject == null) {
            return null;
        }
        final HttpCacheStorageEntry entry = serializer.deserialize(storageObject);
```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AbstractSerializingCacheStorage.java`
#### Snippet
```java
            return entry.getContent();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/BasicScheme.java`
#### Snippet
```java
    @Override
    public Principal getPrincipal() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/DigestScheme.java`
#### Snippet
```java

    String getA1() {
        return a1 != null ? new String(a1, StandardCharsets.US_ASCII) : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/DigestScheme.java`
#### Snippet
```java
    @Override
    public Principal getPrincipal() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/DigestScheme.java`
#### Snippet
```java

    String getA2() {
        return a2 != null ? new String(a2, StandardCharsets.US_ASCII) : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/SystemDefaultDnsResolver.java`
#### Snippet
```java
    public String resolveCanonicalHostname(final String host) throws UnknownHostException {
        if (host == null) {
            return null;
        }
        final InetAddress in = InetAddress.getByName(host);
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/Cookie.java`
#### Snippet
```java
     * Returns creation time of the cookie.
     */
    default Instant getCreationInstant() { return null;  }

    /**
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/cookie/Cookie.java`
#### Snippet
```java
    default Instant getExpiryInstant() {
        final Date date = getExpiryDate();
        return date != null ? Instant.ofEpochMilli(date.getTime()) : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/AsyncCachingExec.java`
#### Snippet
```java
                final HttpResponse response,
                final EntityDetails entityDetails) throws HttpException, IOException {
            return null;
        }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/AuthChallengeParser.java`
#### Snippet
```java
            tokenParser.skipWhiteSpace(buffer, cursor);
            if (cursor.atEnd()) {
                return null;
            }
            final String token = parseToken(buffer, cursor);
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleHttpResponse.java`
#### Snippet
```java

    public ContentType getContentType() {
        return body != null ? body.getContentType() : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleHttpResponse.java`
#### Snippet
```java

    public String getBodyText() {
        return body != null ? body.getBodyText() : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleHttpResponse.java`
#### Snippet
```java

    public byte[] getBodyBytes() {
        return body != null ? body.getBodyBytes() : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/LenientHttpResponseParser.java`
#### Snippet
```java
                LOG.debug("Garbage in response: {}", buffer);
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/URIUtils.java`
#### Snippet
```java
    public static HttpHost extractHost(final URI uri) {
        if (uri == null) {
            return null;
        }
        final URIBuilder uriBuilder = new URIBuilder(uri);
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/utils/URIUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/routing/DefaultRoutePlanner.java`
#### Snippet
```java
            final HttpHost target,
            final HttpContext context) throws HttpException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/routing/DefaultRoutePlanner.java`
#### Snippet
```java
            final HttpHost firstHop,
            final HttpContext context) throws HttpException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/DefaultHostnameVerifier.java`
#### Snippet
```java
    static String extractCN(final String subjectPrincipal) throws SSLException {
        if (subjectPrincipal == null) {
            return null;
        }
        final List<NameValuePair> attributes = DistinguishedNameParser.INSTANCE.parse(subjectPrincipal);
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/DefaultHostnameVerifier.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/MinimalH2AsyncClient.java`
#### Snippet
```java
                threadFactory);
        this.connectionInitiator = new MultihomeConnectionInitiator(getConnectionInitiator(), dnsResolver);
        this.connPool = new InternalH2ConnPool(this.connectionInitiator, object -> null, tlsStrategy);
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/Header.java`
#### Snippet
```java
    public List<MimeField> getFields(final String name) {
        if (name == null) {
            return null;
        }
        final String key = name.toLowerCase(Locale.ROOT);
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/Header.java`
#### Snippet
```java
    public MimeField getField(final String name) {
        if (name == null) {
            return null;
        }
        final String key = name.toLowerCase(Locale.ROOT);
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/Header.java`
#### Snippet
```java
            return list.get(0);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncPushConsumerRegistry.java`
#### Snippet
```java
        final UriPatternMatcher<Supplier<AsyncPushConsumer>> patternMatcher = getPatternMatcher(key);
        if (patternMatcher == null) {
            return null;
        }
        String path = request.getPath();
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncPushConsumerRegistry.java`
#### Snippet
```java
        }
        final Supplier<AsyncPushConsumer> supplier = patternMatcher.lookup(path);
        return supplier != null ? supplier.get() : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/DecompressingEntity.java`
#### Snippet
```java
    public String getContentEncoding() {
        /* Content encoding is now 'identity' */
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/DefaultManagedAsyncClientConnection.java`
#### Snippet
```java
    public SSLSession getSSLSession() {
        final TlsDetails tlsDetails = getTlsDetails();
        return tlsDetails != null ? tlsDetails.getSSLSession() : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/DefaultManagedAsyncClientConnection.java`
#### Snippet
```java
            return ((HttpConnection) handler).getEndpointDetails();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/nio/DefaultManagedAsyncClientConnection.java`
#### Snippet
```java
    @Override
    public TlsDetails getTlsDetails() {
        return ioSession instanceof TransportSecurityLayer ? ((TransportSecurityLayer) ioSession).getTlsDetails() : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/InternalAbstractHttpAsyncClient.java`
#### Snippet
```java

                                        });
                                return entityDetails != null ? responseConsumer : null;
                            }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncRedirectExec.java`
#### Snippet
```java
                        LOG.debug("{} redirecting to '{}' via {}", exchangeId, state.redirectURI, currentRoute);
                    }
                    return null;
                }
                return asyncExecCallback.handleResponse(response, entityDetails);
```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCacheSupport.java`
#### Snippet
```java
    public static URI normalizeQuetly(final String requestUri) {
        if (requestUri == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCacheSupport.java`
#### Snippet
```java
            return normalize(new URI(requestUri));
        } catch (final URISyntaxException ex) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCacheSupport.java`
#### Snippet
```java
    public static URI normalizeQuietly(final String requestUri) {
        if (requestUri == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpCacheSupport.java`
#### Snippet
```java
            return normalize(new URI(requestUri));
        } catch (final URISyntaxException ex) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/HttpByteArrayCacheEntrySerializer.java`
#### Snippet
```java
        final Header header = response.getFirstHeader(name);
        if (header == null) {
            return null;
        }
        response.removeHeader(header);
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/routing/RoutingSupport.java`
#### Snippet
```java
    public static HttpHost determineHost(final HttpRequest request) throws HttpException {
        if (request == null) {
            return null;
        }
        final URIAuthority authority = request.getAuthority();
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/routing/RoutingSupport.java`
#### Snippet
```java
        } catch (final URISyntaxException ignore) {
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/routing/RoutingSupport.java`
#### Snippet
```java
    public static HttpHost normalize(final HttpHost host, final SchemePortResolver schemePortResolver) {
        if (host == null) {
            return null;
        }
        if (host.getPort() < 0) {
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixMatcher.java`
#### Snippet
```java
    public String getDomainRoot(final String domain, final DomainType expectedType) {
        if (domain == null) {
            return null;
        }
        if (domain.startsWith(".")) {
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixMatcher.java`
#### Snippet
```java
        }
        if (domain.startsWith(".")) {
            return null;
        }
        String segment = DnsUtils.normalize(domain);
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixMatcher.java`
#### Snippet
```java

        // If we did have expectations apparently there was no match
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/psl/PublicSuffixMatcher.java`
#### Snippet
```java
    private static DomainType findEntry(final Map<String, DomainType> map, final String rule) {
        if (map == null) {
            return null;
        }
        return map.get(rule);
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMScheme.java`
#### Snippet
```java
    @Override
    public Principal getPrincipal() {
        return this.credentials != null ? this.credentials.getUserPrincipal() : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/auth/NTLMScheme.java`
#### Snippet
```java
    @Override
    public String getRealm() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/DefaultManagedHttpClientConnection.java`
#### Snippet
```java
    public Socket getSocket() {
        final SocketHolder socketHolder = getSocketHolder();
        return socketHolder != null ? socketHolder.getSocket() : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/io/DefaultManagedHttpClientConnection.java`
#### Snippet
```java
            return ((SSLSocket) socket).getSession();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/AbstractHttpClientResponseHandler.java`
#### Snippet
```java
            throw new HttpResponseException(response.getCode(), response.getReasonPhrase());
        }
        return entity == null ? null : handleEntity(entity);
    }

```

### ReturnNull
Return of `null`
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/async/RedirectingAsyncDecorator.java`
#### Snippet
```java
        try {
            final URI requestURI = request.getUri();
            return redirectResolver != null ? redirectResolver.resolve(requestURI) : null;
        } catch (final URISyntaxException ex) {
            throw new ProtocolException(ex.getMessage(), ex);
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleHttpRequest.java`
#### Snippet
```java

    public String getBodyText() {
        return body != null ? body.getBodyText() : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleHttpRequest.java`
#### Snippet
```java

    public byte[] getBodyBytes() {
        return body != null ? body.getBodyBytes() : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleHttpRequest.java`
#### Snippet
```java

    public ContentType getContentType() {
        return body != null ? body.getContentType() : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/async/methods/SimpleBody.java`
#### Snippet
```java
            return bodyAsText.getBytes(charset != null ? charset : StandardCharsets.US_ASCII);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/ClassicRequestCopier.java`
#### Snippet
```java
    public ClassicHttpRequest copy(final ClassicHttpRequest original) {
        if (original == null) {
            return null;
        }
        final BasicClassicHttpRequest copy = new BasicClassicHttpRequest(original.getMethod(), null, original.getPath());
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/H2AsyncClientBuilder.java`
#### Snippet
```java

        final MultihomeConnectionInitiator connectionInitiator = new MultihomeConnectionInitiator(ioReactor, dnsResolver);
        final InternalH2ConnPool connPool = new InternalH2ConnPool(connectionInitiator, host -> null, tlsStrategyCopy);
        connPool.setConnectionConfigResolver(connectionConfigResolver);

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/RequestCopier.java`
#### Snippet
```java
    public HttpRequest copy(final HttpRequest original) {
        if (original == null) {
            return null;
        }
        final BasicHttpRequest copy = new BasicHttpRequest(original.getMethod(), null, original.getPath());
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/KerberosCredentials.java`
#### Snippet
```java
    @Override
    public char[] getPassword() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/KerberosCredentials.java`
#### Snippet
```java
    @Override
    public Principal getUserPrincipal() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/classic/CloseableHttpResponse.java`
#### Snippet
```java
    static CloseableHttpResponse adapt(final ClassicHttpResponse response) {
        if (response == null) {
            return null;
        }
        return response instanceof CloseableHttpResponse
```

### ReturnNull
Return of `null`
in `httpclient5-testing/src/main/java/org/apache/hc/client5/testing/auth/BasicAuthTokenExtractor.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/socket/PlainConnectionSocketFactory.java`
#### Snippet
```java
                AccessController.doPrivileged((PrivilegedExceptionAction<Object>) () -> {
                    sock.connect(remoteAddress, TimeValue.isPositive(connectTimeout) ? connectTimeout.toMillisecondsIntBound() : 0);
                    return null;
                });
            } catch (final PrivilegedActionException e) {
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MultipartFormEntity.java`
#### Snippet
```java
    @Override
    public Supplier<List<? extends Header>> getTrailers() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MultipartFormEntity.java`
#### Snippet
```java
    @Override
    public String getContentEncoding() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MultipartFormEntity.java`
#### Snippet
```java
    @Override
    public Set<String> getTrailerNames() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/MultipartFormEntity.java`
#### Snippet
```java
    @Override
    public String getContentType() {
        return this.contentType != null ? this.contentType.toString() : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/ConnPoolSupport.java`
#### Snippet
```java
    public static String getId(final Object object) {
        if (object == null) {
            return null;
        }
        return object instanceof Identifiable
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/StringBody.java`
#### Snippet
```java
    @Override
    public String getFilename() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/NTCredentials.java`
#### Snippet
```java
    private static String stripDotSuffix(final String value) {
        if (value == null) {
            return null;
        }
        final int index = value.indexOf('.');
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/AbstractContentBody.java`
#### Snippet
```java
    public String getCharset() {
        final Charset charset = this.contentType.getCharset();
        return charset != null ? charset.name() : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/AbstractContentBody.java`
#### Snippet
```java
            return mimeType.substring(i + 1);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/HttpsSupport.java`
#### Snippet
```java
    private static String[] split(final String s) {
        if (TextUtils.isBlank(s)) {
            return null;
        }
        return s.split(" *, *");
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/DefaultClientTlsStrategy.java`
#### Snippet
```java
    @SuppressWarnings("deprecated")
    TlsDetails createTlsDetails(final SSLEngine sslEngine) {
        return tlsDetailsFactory != null ? tlsDetailsFactory.create(sslEngine) : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/cache/HttpCacheEntry.java`
#### Snippet
```java
    public Header getFirstHeader(final String name) {
        if (REQUEST_METHOD_HEADER_NAME.equalsIgnoreCase(name)) {
            return null;
        }
        return responseHeaders.getFirstHeader(name);
```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/memcached/MemcachedHttpAsyncCacheStorage.java`
#### Snippet
```java
    private byte[] castAsByteArray(final Object storageObject) throws ResourceIOException {
        if (storageObject == null) {
            return null;
        }
        if (storageObject instanceof byte[]) {
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/NoopUserTokenHandler.java`
#### Snippet
```java
    @Override
    public Object getUserToken(final HttpRoute route, final HttpContext context) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/HttpRFC7578Multipart.java`
#### Snippet
```java
        public byte[] decode(final byte[] bytes) {
            if (bytes == null) {
                return null;
            }
            final ByteArrayBuffer buffer = new ByteArrayBuffer(bytes.length);
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/HttpRFC7578Multipart.java`
#### Snippet
```java
        public byte[] encode(final byte[] bytes) {
            if (bytes == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/ByteArrayBody.java`
#### Snippet
```java
    @Override
    public String getCharset() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/auth/AuthScope.java`
#### Snippet
```java

    private String toNullSafeLowerCase(final String str) {
        return str != null ? str.toLowerCase(Locale.ROOT) : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncProtocolExec.java`
#### Snippet
```java
                        clientContext)) {
                    challenged.set(true);
                    return null;
                }
                challenged.set(false);
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/DistinguishedNameParser.java`
#### Snippet
```java
    List<NameValuePair> parse(final String s) {
        if (s == null) {
            return null;
        }
        final CharArrayBuffer buffer = new CharArrayBuffer(s.length());
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncConnectExec.java`
#### Snippet
```java
                if (needAuthentication(proxyAuthExchange, proxy, response, clientContext)) {
                    state.challenged = true;
                    return null;
                }
                state.challenged = false;
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/async/AsyncConnectExec.java`
#### Snippet
```java
                    return asyncExecCallback.handleResponse(response, entityDetails);
                }
                return null;
            }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/DefaultUserTokenHandler.java`
#### Snippet
```java
            return scheme.getPrincipal();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/DefaultUserTokenHandler.java`
#### Snippet
```java
            return sslSession.getLocalPrincipal();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/SSLConnectionSocketFactory.java`
#### Snippet
```java
                AccessController.doPrivileged((PrivilegedExceptionAction<Object>) () -> {
                    sock.connect(remoteAddress, Timeout.defaultsToDisabled(connectTimeout).toMillisecondsIntBound());
                    return null;
                });
            } catch (final PrivilegedActionException e) {
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/entity/mime/AbstractMultipartFormat.java`
#### Snippet
```java
    static CharSequence stripLineBreaks(final CharSequence s) {
        if (s == null) {
            return null;
        }
        boolean requiresRewrite = false;
```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachingExec.java`
#### Snippet
```java
    private static ClassicHttpResponse convert(final SimpleHttpResponse cacheResponse, final ExecChain.Scope scope) {
        if (cacheResponse == null) {
            return null;
        }
        final ClassicHttpResponse response = new BasicClassicHttpResponse(cacheResponse.getCode(), cacheResponse.getReasonPhrase());
```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CachingExecBase.java`
#### Snippet
```java
            return responseGenerator.getErrorForRequest(fatalError.get(0));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/ssl/ConscryptClientTlsStrategy.java`
#### Snippet
```java
            return new TlsDetails(sslEngine.getSession(), Conscrypt.getApplicationProtocol(sslEngine));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/impl/routing/SystemDefaultRoutePlanner.java`
#### Snippet
```java
        if (proxySelectorInstance == null) {
            //The proxy selector can be "unset", so we must be able to deal with a null selector
            return null;
        }
        final List<Proxy> proxies = proxySelectorInstance.select(targetURI);
```

### ReturnNull
Return of `null`
in `httpclient5-win/src/main/java/org/apache/hc/client5/http/impl/win/WindowsNegotiateScheme.java`
#### Snippet
```java
    @Override
    public String getRealm() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/CacheInvalidatorBase.java`
#### Snippet
```java
        final Header h = response.getFirstHeader(headerName);
        if (h == null) {
            return null;
        }
        final URI locationUri = HttpCacheSupport.normalizeQuietly(h.getValue());
```

### ReturnNull
Return of `null`
in `httpclient5-cache/src/main/java/org/apache/hc/client5/http/impl/cache/memcached/MemcachedHttpCacheStorage.java`
#### Snippet
```java
    private byte[] castAsByteArray(final Object storageObject) throws ResourceIOException {
        if (storageObject == null) {
            return null;
        }
        if (storageObject instanceof byte[]) {
```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/HttpRoute.java`
#### Snippet
```java

    public InetSocketAddress getLocalSocketAddress() {
        return this.localAddress != null ? new InetSocketAddress(this.localAddress, 0) : null;
    }

```

### ReturnNull
Return of `null`
in `httpclient5/src/main/java/org/apache/hc/client5/http/HttpRoute.java`
#### Snippet
```java
    @Override
    public HttpHost getProxyHost() {
        return proxyChain != null && !this.proxyChain.isEmpty() ? this.proxyChain.get(0) : null;
    }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
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

## RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
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

