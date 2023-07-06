# kiota-java 
 
# Bad smells
I found 165 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 41 | false |
| ConstantValue | 28 | false |
| DataFlowIssue | 22 | false |
| RegExpRedundantEscape | 14 | false |
| DuplicatedCode | 7 | false |
| FieldMayBeFinal | 7 | false |
| UNCHECKED_WARNING | 5 | false |
| CharsetObjectCanBeUsed | 4 | false |
| UnusedAssignment | 4 | false |
| WrapperTypeMayBePrimitive | 3 | false |
| StringOperationCanBeSimplified | 3 | false |
| Deprecation | 3 | false |
| RedundantCast | 3 | false |
| OptionalIsPresent | 2 | false |
| UnnecessaryModifier | 2 | true |
| UnnecessaryToStringCall | 2 | true |
| UNUSED_IMPORT | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| RedundantLengthCheck | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| UastIncorrectHttpHeaderInspection | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| TrivialIf | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| IfStatementWithIdenticalBranches | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
        Integer thisVariableCount = 0;
        Integer thatVariableCount = 0;
        Integer thisRawLength = 0;
        Integer thatRawLength = 0;

```

### WrapperTypeMayBePrimitive
Type may be primitive
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java

            final String statusCodeAsString = Integer.toString(response.code());
            final Integer statusCode = response.code();
            final ResponseHeaders responseHeaders = new ResponseHeaders();
            response.headers().toMultimap().forEach((name,value) ->{
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                final String contentLengthHeaderValue = getHeaderValue(x, "Content-Length");
                if(contentLengthHeaderValue != null && !contentLengthHeaderValue.isEmpty()) {
                    final Integer contentLengthHeaderValueAsInt = Integer.parseInt(contentLengthHeaderValue);
                    spanForAttributes.setAttribute(SemanticAttributes.HTTP_RESPONSE_CONTENT_LENGTH, contentLengthHeaderValueAsInt);
                }
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonSerializationWriter.java`
#### Snippet
```java
        if(values != null && !values.isEmpty()) {
            final Optional<String> concatenatedValue = values.stream().map(v -> this.getStringValueFromValuedEnum(v)).reduce((x, y) -> { return x + "," + y; });
            if(concatenatedValue.isPresent()) {
                this.writeStringValue(key, concatenatedValue.get());
            }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormSerializationWriter.java`
#### Snippet
```java
        if(values != null && !values.isEmpty()) {
            final Optional<String> concatenatedValue = values.stream().map(v -> this.getStringValueFromValuedEnum(v)).reduce((x, y) -> { return x + "," + y; });
            if(concatenatedValue.isPresent()) {
                this.writeStringValue(key, concatenatedValue.get());
            }
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestOption.java`
#### Snippet
```java
     */
    @Nonnull
    public <T extends RequestOption> Class<T> getType();
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `components/abstractions/src/main/java/com/microsoft/kiota/QueryParameter.java`
#### Snippet
```java
     * @return the name of the parameter in the template
     */
    public String name();
}
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
                        result = joiner.toString();
                    } else if (found instanceof Map) {
                        Map<Object, Object> map = (Map<Object, Object>) found;
                        if (map.isEmpty()) {
                            return "";
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                            final Object result = rootNode.getCollectionOfEnumValues(targetClass);
                            setResponseType(result, span);
                            return CompletableFuture.completedFuture((List<ModelType>)result);
                        } finally {
                            deserializationSpan.end();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'ModelType'
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                            final Object result = rootNode.getEnumValue(targetClass);
                            setResponseType(result, span);
                            return CompletableFuture.completedFuture((ModelType)result);
                        } finally {
                            deserializationSpan.end();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.io.InputStream' to 'ModelType'
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                                }
                                final InputStream rawInputStream = body.byteStream();
                                return CompletableFuture.completedFuture((ModelType)rawInputStream);
                            }
                            final ParseNode rootNode = getRootParseNode(response, span, span);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'ModelType'
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                                }
                                setResponseType(result, span);
                                return CompletableFuture.completedFuture((ModelType)result);
                            } finally {
                                deserializationSpan.end();
```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestInformation.java`
#### Snippet
```java
     */
    public void removeRequestOptions(@Nullable final RequestOption... options) {
        if(options == null || options.length == 0) return;
        for(final RequestOption option : options) {
            requestOptions.remove(option.getClass().getCanonicalName());
```

## RuleId[id=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `components/abstractions/src/main/java/com/microsoft/kiota/authentication/AllowedHostsValidator.java`
#### Snippet
```java
    public AllowedHostsValidator(@Nonnull final String... allowedHosts) {
        final HashSet<String> value = new HashSet<>(allowedHosts.length);
        for(final String val : allowedHosts) {
            value.add(val);
        }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Expression `internalMap.put(normalizeKey(key), new HashSet<>(value))` might evaluate to null but is returned by the method declared as @Nonnull
in `components/abstractions/src/main/java/com/microsoft/kiota/CaseInsensitiveMap.java`
#### Snippet
```java
        Objects.requireNonNull(key);
        Objects.requireNonNull(value);
        return internalMap.put(normalizeKey(key), new HashSet<>(value));
    }

```

### DataFlowIssue
Argument `this.getStringValue()` might be null
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
    @Nullable
    public LocalDate getLocalDateValue() {
        return LocalDate.parse(this.getStringValue());
    }
    @Nullable
```

### DataFlowIssue
Argument `this.getStringValue()` might be null
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
    @Nullable
    public UUID getUUIDValue() {
        return UUID.fromString(this.getStringValue());
    }
    @Nullable
```

### DataFlowIssue
Argument `this.getStringValue()` might be null
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
    @Nullable
    public Period getPeriodValue() {
        return Period.parse(this.getStringValue());
    }
    @Nullable
```

### DataFlowIssue
Argument `this.getStringValue()` might be null
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
    @Nullable
    public LocalTime getLocalTimeValue() {
        return LocalTime.parse(this.getStringValue());
    }
    @Nullable
```

### DataFlowIssue
Argument `this.getStringValue()` might be null
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
    @Nullable
    public OffsetDateTime getOffsetDateTimeValue() {
        return OffsetDateTime.parse(this.getStringValue());
    }
    @Nullable
```

### DataFlowIssue
Method invocation `containsKey` may produce `NullPointerException`
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestInformation.java`
#### Snippet
```java
        if(uri != null) {
            return uri;
        } else if(pathParameters.containsKey(RAW_URL_KEY) &&
            pathParameters.get(RAW_URL_KEY) instanceof String) {
            setUri(new URI((String)pathParameters.get(RAW_URL_KEY)));
```

### DataFlowIssue
Method invocation `split` may produce `NullPointerException`
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
    @Nullable
    public <T> List<T> getCollectionOfPrimitiveValues(@Nonnull final Class<T> targetClass) {
        final List<String> primitiveStringCollection = Arrays.asList(getStringValue().split(","));
        final Iterator<String> sourceIterator = primitiveStringCollection.iterator();
        final FormParseNode _this = this;
```

### DataFlowIssue
Argument `getStringValue()` might be null
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
    public Integer getIntegerValue() {
        try {
            return Integer.parseInt(getStringValue());
        } catch (final NumberFormatException ex) {
            return null;
```

### DataFlowIssue
Argument `getStringValue()` might be null
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
    public Short getShortValue() {
        try {
            return Short.parseShort(getStringValue());
        } catch (final NumberFormatException ex) {
            return null;
```

### DataFlowIssue
Argument `getStringValue()` might be null
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
    public Byte getByteValue() {
        try {
            return Byte.parseByte(getStringValue());
        } catch (final NumberFormatException ex) {
            return null;
```

### DataFlowIssue
Argument `getStringValue()` might be null
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
    public Long getLongValue() {
        try {
            return Long.parseLong(getStringValue());
        } catch (final NumberFormatException ex) {
            return null;
```

### DataFlowIssue
Method invocation `toLowerCase` may produce `NullPointerException`
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
    @Nullable
    public Boolean getBooleanValue() {
        switch(getStringValue().toLowerCase(Locale.ROOT)) { //boolean parse returns false for any value that is not true
            case "true":
            case "1":
```

### DataFlowIssue
Argument `getStringValue()` might be null
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
    public Float getFloatValue() {
        try {
            return Float.parseFloat(getStringValue());
        } catch (final NumberFormatException ex) {
            return null;
```

### DataFlowIssue
Argument `getStringValue()` might be null
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
    public BigDecimal getBigDecimalValue() {
        try {
            return new BigDecimal(getStringValue());
        } catch (final NumberFormatException ex) {
            return null;
```

### DataFlowIssue
Argument `getStringValue()` might be null
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
    public Double getDoubleValue() {
        try {
            return Double.parseDouble(getStringValue());
        } catch (final NumberFormatException ex) {
            return null;
```

### DataFlowIssue
Method invocation `addEvent` may produce `NullPointerException`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/ChaosHandler.java`
#### Snippet
```java

            if(dice % failureRate == 0) {
                span.addEvent(chaosHandlerTriggeredEventKey);
                return new Response
                        .Builder()
```

### DataFlowIssue
Method invocation `getValue1` may produce `NullPointerException`
in `components/abstractions/src/main/java/com/microsoft/kiota/store/InMemoryBackingStore.java`
#### Snippet
```java
        final Pair<Boolean, Object> oldValue = this.store.put(key, valueToAdd);
        for(final TriConsumer<String, Object, Object> callback : this.subscriptionStore.values()) {
            callback.accept(key, oldValue.getValue1(), value);
        }
    }
```

### DataFlowIssue
Argument `targetUri` might be null
in `components/abstractions/src/main/java/com/microsoft/kiota/authentication/BaseBearerTokenAuthenticationProvider.java`
#### Snippet
```java
                return result;
            }
            return this.accessTokenProvider.getAuthorizationToken(targetUri, additionalAuthenticationContext)
                .thenApply(token -> {
                    if(token != null && !token.isEmpty()) { 
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
        final Span span = GlobalOpenTelemetry.getTracer(obsOptions.getTracerInstrumentationName()).spanBuilder("getRequestFromRequestInformation").setParent(Context.current().with(parentSpan)).startSpan();
        try(final Scope scope = span.makeCurrent()) {
            spanForAttributes.setAttribute(SemanticAttributes.HTTP_METHOD, requestInfo.httpMethod.toString());
            final URL requestURL = requestInfo.getUri().toURL();
            if (obsOptions.getIncludeEUIIAttributes()) {
```

### DataFlowIssue
Method invocation `toURL` may produce `NullPointerException`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
        try(final Scope scope = span.makeCurrent()) {
            spanForAttributes.setAttribute(SemanticAttributes.HTTP_METHOD, requestInfo.httpMethod.toString());
            final URL requestURL = requestInfo.getUri().toURL();
            if (obsOptions.getIncludeEUIIAttributes()) {
                spanForAttributes.setAttribute(SemanticAttributes.HTTP_URL, requestURL.toString());
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
    private void setBaseUrlForRequestInformation(@Nonnull final RequestInformation requestInfo) {
        Objects.requireNonNull(requestInfo);
        requestInfo.pathParameters.put("baseurl", getBaseUrl());
    }
    /** {@inheritDoc} */
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RedirectHandler.java`
#### Snippet
```java
        // way to retain them.
        boolean sameScheme = locationUrl.scheme().equalsIgnoreCase(requestUrl.scheme());
        boolean sameHost = locationUrl.host().toString().equalsIgnoreCase(requestUrl.host().toString());
        if (!sameScheme || !sameHost) {
            requestBuilder.removeHeader("Authorization");
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RedirectHandler.java`
#### Snippet
```java
        // way to retain them.
        boolean sameScheme = locationUrl.scheme().equalsIgnoreCase(requestUrl.scheme());
        boolean sameHost = locationUrl.host().toString().equalsIgnoreCase(requestUrl.host().toString());
        if (!sameScheme || !sameHost) {
            requestBuilder.removeHeader("Authorization");
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
                            case ';':
                                if (prefixToUse != null && prefixToUse.endsWith("=")) {
                                    finalResult.append(prefixToUse.substring(0, prefixToUse.length() - 1)).append(result);
                                    break;
                                }
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
    private static final String STRING_PATTERN_HOST_IPV6 = "\\[[\\p{XDigit}\\:\\.]*[%\\p{Alnum}]*\\]";
    private static final String STRING_PATTERN_HOST = "(" + STRING_PATTERN_HOST_IPV6 + "|" + STRING_PATTERN_HOST_IPV4 + ")";
    private static final String STRING_PATTERN_PORT = "(\\d*(?:\\{[^/]+?\\})?)";
    private static final String STRING_PATTERN_PATH = "([^#]*)";
    private static final String STRING_PATTERN_QUERY = "([^#]*)";
```

### RegExpRedundantEscape
Redundant character escape `\\?` in RegExp
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
    // Regex patterns that matches URIs. See RFC 3986, appendix B
    static final Pattern PATTERN_SCHEME = Pattern.compile("^" + STRING_PATTERN_SCHEME + "//.*");
    static final Pattern PATTERN_FULL_PATH = Pattern.compile("^([^#\\?]*)(\\?([^#]*))?(\\#(.*))?$");
    static final Pattern PATTERN_FULL_URI = Pattern.compile(
            "^(" + STRING_PATTERN_SCHEME + ")?" + "(//(" + STRING_PATTERN_USER_INFO + "@)?" + STRING_PATTERN_HOST + "(:" + STRING_PATTERN_PORT +
```

### RegExpRedundantEscape
Redundant character escape `\\#` in RegExp
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
    // Regex patterns that matches URIs. See RFC 3986, appendix B
    static final Pattern PATTERN_SCHEME = Pattern.compile("^" + STRING_PATTERN_SCHEME + "//.*");
    static final Pattern PATTERN_FULL_PATH = Pattern.compile("^([^#\\?]*)(\\?([^#]*))?(\\#(.*))?$");
    static final Pattern PATTERN_FULL_URI = Pattern.compile(
            "^(" + STRING_PATTERN_SCHEME + ")?" + "(//(" + STRING_PATTERN_USER_INFO + "@)?" + STRING_PATTERN_HOST + "(:" + STRING_PATTERN_PORT +
```

### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
    private static final String STRING_PATTERN_USER_INFO = "([^@\\[/?#]*)";
    private static final String STRING_PATTERN_HOST_IPV4 = "[^\\[{/?#:]*";
    private static final String STRING_PATTERN_HOST_IPV6 = "\\[[\\p{XDigit}\\:\\.]*[%\\p{Alnum}]*\\]";
    private static final String STRING_PATTERN_HOST = "(" + STRING_PATTERN_HOST_IPV6 + "|" + STRING_PATTERN_HOST_IPV4 + ")";
    private static final String STRING_PATTERN_PORT = "(\\d*(?:\\{[^/]+?\\})?)";
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
    private static final String STRING_PATTERN_USER_INFO = "([^@\\[/?#]*)";
    private static final String STRING_PATTERN_HOST_IPV4 = "[^\\[{/?#:]*";
    private static final String STRING_PATTERN_HOST_IPV6 = "\\[[\\p{XDigit}\\:\\.]*[%\\p{Alnum}]*\\]";
    private static final String STRING_PATTERN_HOST = "(" + STRING_PATTERN_HOST_IPV6 + "|" + STRING_PATTERN_HOST_IPV4 + ")";
    private static final String STRING_PATTERN_PORT = "(\\d*(?:\\{[^/]+?\\})?)";
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
    private static final String STRING_PATTERN_USER_INFO = "([^@\\[/?#]*)";
    private static final String STRING_PATTERN_HOST_IPV4 = "[^\\[{/?#:]*";
    private static final String STRING_PATTERN_HOST_IPV6 = "\\[[\\p{XDigit}\\:\\.]*[%\\p{Alnum}]*\\]";
    private static final String STRING_PATTERN_HOST = "(" + STRING_PATTERN_HOST_IPV6 + "|" + STRING_PATTERN_HOST_IPV4 + ")";
    private static final String STRING_PATTERN_PORT = "(\\d*(?:\\{[^/]+?\\})?)";
```

### RegExpRedundantEscape
Redundant character escape `\:` in RegExp
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
    private static final String STRING_PATTERN_HOST_IPV4 = "[^\\[{/?#:]*";
    private static final String STRING_PATTERN_HOST_IPV6 = "\\[[\\p{XDigit}\\:\\.]*[%\\p{Alnum}]*\\]";
    private static final String STRING_PATTERN_HOST = "(" + STRING_PATTERN_HOST_IPV6 + "|" + STRING_PATTERN_HOST_IPV4 + ")";
    private static final String STRING_PATTERN_PORT = "(\\d*(?:\\{[^/]+?\\})?)";
    private static final String STRING_PATTERN_PATH = "([^#]*)";
```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
    private static final String STRING_PATTERN_HOST_IPV4 = "[^\\[{/?#:]*";
    private static final String STRING_PATTERN_HOST_IPV6 = "\\[[\\p{XDigit}\\:\\.]*[%\\p{Alnum}]*\\]";
    private static final String STRING_PATTERN_HOST = "(" + STRING_PATTERN_HOST_IPV6 + "|" + STRING_PATTERN_HOST_IPV4 + ")";
    private static final String STRING_PATTERN_PORT = "(\\d*(?:\\{[^/]+?\\})?)";
    private static final String STRING_PATTERN_PATH = "([^#]*)";
```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
    private static final String STRING_PATTERN_HOST_IPV4 = "[^\\[{/?#:]*";
    private static final String STRING_PATTERN_HOST_IPV6 = "\\[[\\p{XDigit}\\:\\.]*[%\\p{Alnum}]*\\]";
    private static final String STRING_PATTERN_HOST = "(" + STRING_PATTERN_HOST_IPV6 + "|" + STRING_PATTERN_HOST_IPV4 + ")";
    private static final String STRING_PATTERN_PORT = "(\\d*(?:\\{[^/]+?\\})?)";
    private static final String STRING_PATTERN_PATH = "([^#]*)";
```

### RegExpRedundantEscape
Redundant character escape `\:` in RegExp
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
    static final Pattern PATTERN_FULL_PATH = Pattern.compile("^([^#\\?]*)(\\?([^#]*))?(\\#(.*))?$");
    static final Pattern PATTERN_FULL_URI = Pattern.compile(
            "^(" + STRING_PATTERN_SCHEME + ")?" + "(//(" + STRING_PATTERN_USER_INFO + "@)?" + STRING_PATTERN_HOST + "(:" + STRING_PATTERN_PORT +
                    ")?" + ")?" + STRING_PATTERN_PATH + "(\\?" + STRING_PATTERN_QUERY + ")?" + "(#" + STRING_PATTERN_REMAINING + ")?");

```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
    static final Pattern PATTERN_FULL_PATH = Pattern.compile("^([^#\\?]*)(\\?([^#]*))?(\\#(.*))?$");
    static final Pattern PATTERN_FULL_URI = Pattern.compile(
            "^(" + STRING_PATTERN_SCHEME + ")?" + "(//(" + STRING_PATTERN_USER_INFO + "@)?" + STRING_PATTERN_HOST + "(:" + STRING_PATTERN_PORT +
                    ")?" + ")?" + STRING_PATTERN_PATH + "(\\?" + STRING_PATTERN_QUERY + ")?" + "(#" + STRING_PATTERN_REMAINING + ")?");

```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
    static final Pattern PATTERN_FULL_PATH = Pattern.compile("^([^#\\?]*)(\\?([^#]*))?(\\#(.*))?$");
    static final Pattern PATTERN_FULL_URI = Pattern.compile(
            "^(" + STRING_PATTERN_SCHEME + ")?" + "(//(" + STRING_PATTERN_USER_INFO + "@)?" + STRING_PATTERN_HOST + "(:" + STRING_PATTERN_PORT +
                    ")?" + ")?" + STRING_PATTERN_PATH + "(\\?" + STRING_PATTERN_QUERY + ")?" + "(#" + STRING_PATTERN_REMAINING + ")?");

```

### RegExpRedundantEscape
Redundant character escape `\}` in RegExp
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
    static final Pattern PATTERN_FULL_PATH = Pattern.compile("^([^#\\?]*)(\\?([^#]*))?(\\#(.*))?$");
    static final Pattern PATTERN_FULL_URI = Pattern.compile(
            "^(" + STRING_PATTERN_SCHEME + ")?" + "(//(" + STRING_PATTERN_USER_INFO + "@)?" + STRING_PATTERN_HOST + "(:" + STRING_PATTERN_PORT +
                    ")?" + ")?" + STRING_PATTERN_PATH + "(\\?" + STRING_PATTERN_QUERY + ")?" + "(#" + STRING_PATTERN_REMAINING + ")?");

```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
        return null;
    }
    private final static Pattern queryParametersCleanupPattern = Pattern.compile("\\{\\?[^\\}]+}", Pattern.CASE_INSENSITIVE);
    private final char[] queryParametersToDecodeForTracing = {'-', '.', '~', '$'};
    private Span startSpan(@Nonnull final RequestInformation requestInfo, @Nonnull final String methodName) {
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
                                case ';':
                                    prefixToUse = String.valueOf(operator);
                                    joiner = new StringJoiner(String.valueOf(prefixToUse));
                                    break;
                                default:
```

## RuleId[id=UastIncorrectHttpHeaderInspection]
### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java
     * Header name to track the retry attempt number
     */
    private static final String RETRY_ATTEMPT_HEADER = "Retry-Attempt";
    /**
     * Header name for the retry after information
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                        this.throwIfFailedResponse(response, span, errorMappings);
                        if(this.shouldReturnNull(response)) {
                            return CompletableFuture.completedFuture(null);
                        }
                        final ParseNode rootNode = getRootParseNode(response, span, span);
                        if (rootNode == null) {
                            closeResponse = false;
                            return CompletableFuture.completedFuture(null);
                        }
```

### DuplicatedCode
Duplicated code
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
if(targetClass == Boolean.class) {
                            return (T)itemNode.getBooleanValue();
                        } else if(targetClass == Short.class) {
                            return (T)itemNode.getShortValue();
                        } else if(targetClass == Byte.class) {
                            return (T)itemNode.getByteValue();
                        } else if(targetClass == BigDecimal.class) {
                            return (T)itemNode.getBigDecimalValue();
                        } else if(targetClass == String.class) {
                            return (T)itemNode.getStringValue();
                        } else if(targetClass == Integer.class) {
                            return (T)itemNode.getIntegerValue();
                        } else if(targetClass == Float.class) {
                            return (T)itemNode.getFloatValue();
                        } else if(targetClass == Long.class) {
                            return (T)itemNode.getLongValue();
                        } else if(targetClass == UUID.class) {
                            return (T)itemNode.getUUIDValue();
                        } else if(targetClass == OffsetDateTime.class) {
                            return (T)itemNode.getOffsetDateTimeValue();
                        } else if(targetClass == LocalDate.class) {
                            return (T)itemNode.getLocalDateValue();
                        } else if(targetClass == LocalTime.class) {
                            return (T)itemNode.getLocalTimeValue();
                        } else if(targetClass == Period.class) {
                            return (T)itemNode.getPeriodValue();
                        } else {
                            throw new RuntimeException("unknown type to deserialize " + targetClass.getName());
                        }
```

### DuplicatedCode
Duplicated code
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
        final String rawValue = this.getStringValue();
        if(rawValue == null || rawValue.isEmpty()) {
            return null;
        }
        final EnumSet<T> result = EnumSet.noneOf(targetEnum);
        final String[] rawValues = rawValue.split(",");
        for (final String rawValueItem : rawValues) {
            final T value = getEnumValueInt(rawValueItem, targetEnum);
            if(value != null) {
                result.add(value);
            }
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNodeFactory.java`
#### Snippet
```java
        Objects.requireNonNull(contentType, "parameter contentType cannot be null");
        Objects.requireNonNull(rawResponse, "parameter rawResponse cannot be null");
        if(contentType.isEmpty()) {
            throw new NullPointerException("contentType cannot be empty");
        } else if (!contentType.equals(validContentType)) {
            throw new IllegalArgumentException("expected a " + validContentType + " content type");
        }
        String rawText;
        try(final InputStreamReader reader = new InputStreamReader(rawResponse, StandardCharsets.UTF_8)) {
            try(final BufferedReader buff = new BufferedReader(reader)) {
                rawText = buff.lines()
                .collect(Collectors.joining("\n"));
            }
        } catch (IOException ex) {
            throw new RuntimeException("could not close the reader", ex);
        }
```

### DuplicatedCode
Duplicated code
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormSerializationWriter.java`
#### Snippet
```java
            if(value != null) {
                if(onStartObjectSerialization != null) {
                    onStartObjectSerialization.accept(value, this);
                }
                value.serialize(this);
            }
            for(final Parsable additionalValueToMerge : nonNullAdditionalValuesToMerge) {
                if(onBeforeObjectSerialization != null) {
                    onBeforeObjectSerialization.accept(additionalValueToMerge);
                }
                if(onStartObjectSerialization != null) {
                    onStartObjectSerialization.accept(additionalValueToMerge, this);
                }
                additionalValueToMerge.serialize(this);
                if(onAfterObjectSerialization != null) {
                    onAfterObjectSerialization.accept(additionalValueToMerge);
                }
            }
```

### DuplicatedCode
Duplicated code
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormSerializationWriter.java`
#### Snippet
```java
        if(values != null && !values.isEmpty()) {
            final Optional<String> concatenatedValue = values.stream().map(v -> this.getStringValueFromValuedEnum(v)).reduce((x, y) -> { return x + "," + y; });
            if(concatenatedValue.isPresent()) {
                this.writeStringValue(key, concatenatedValue.get());
            }
        }
```

### DuplicatedCode
Duplicated code
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonParseNode.java`
#### Snippet
```java
                            final JsonElement item = sourceIterator.next();
                            final Consumer<Parsable> onBefore = _this.getOnBeforeAssignFieldValues();
                            final Consumer<Parsable> onAfter = _this.getOnAfterAssignFieldValues();
                            final JsonParseNode itemNode = new JsonParseNode(item) {{
                                this.setOnBeforeAssignFieldValues(onBefore);
                                this.setOnAfterAssignFieldValues(onAfter);
                            }};
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
                    return finalResult.toString();
                } else {
                    switch (operator) {
                        case SLASH_OPERATOR:
                            return null;
```

## RuleId[id=Deprecation]
### Deprecation
'HTTP_HOST' is deprecated
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
            }
            spanForAttributes.setAttribute("http.port", requestURL.getPort());
            spanForAttributes.setAttribute(SemanticAttributes.HTTP_HOST, requestURL.getHost());
            spanForAttributes.setAttribute(SemanticAttributes.HTTP_SCHEME, requestURL.getProtocol());

```

### Deprecation
'HTTP_RETRY_COUNT' is deprecated
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                closeResponse(true, response);
                span.addEvent(authenticateChallengedEventKey);
                spanForAttributes.setAttribute(SemanticAttributes.HTTP_RETRY_COUNT, 1);
                return this.getHttpResponseMessage(requestInfo, span, spanForAttributes, responseClaims);
            }
```

### Deprecation
'HTTP_FLAVOR' is deprecated
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                }
                spanForAttributes.setAttribute(SemanticAttributes.HTTP_STATUS_CODE, x.code());
                spanForAttributes.setAttribute(SemanticAttributes.HTTP_FLAVOR, x.protocol().toString().toUpperCase(Locale.ROOT));
                return x;
            })
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuffer` can be replaced with 'String'
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/ParametersNameDecodingHandler.java`
#### Snippet
```java
    public static String decodeQueryParameters(@Nullable final String original, @Nonnull final char[] charactersToDecode) {
        Objects.requireNonNull(charactersToDecode);
        String decoded = original == null ? "" : new StringBuffer(original).toString();
        final ArrayList<SimpleEntry<String, String>> symbolsToReplace = new ArrayList<SimpleEntry<String, String>>(charactersToDecode.length);
        for (final char charToReplace : charactersToDecode) {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
                    }
                }
                builder.append(segment.toString());
                previousVariable = varSeg;
            } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
                        builder.append(op);
                    }
                    builder.append(segment.toString());
                } else {
                    if (previousVariable != null) {
```

## RuleId[id=NullableProblems]
### NullableProblems
Overridden methods are not annotated
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/Parsable.java`
#### Snippet
```java
     * @return The deserialization information for this object where each entry is a property key with its deserialization callback.
     */
    @Nonnull
    Map<String, Consumer<ParseNode>> getFieldDeserializers();
    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/Parsable.java`
#### Snippet
```java
     * @param writer The writer to write to.
     */
    void serialize(@Nonnull final SerializationWriter writer);
}

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/SerializationWriterFactoryRegistry.java`
#### Snippet
```java
    public final static SerializationWriterFactoryRegistry defaultInstance = new SerializationWriterFactoryRegistry();
    /** List of factories that are registered by content type. */
    @Nonnull
    public final HashMap<String, SerializationWriterFactory> contentTypeAssociatedFactories = new HashMap<>();
    @Nonnull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/ParseNodeFactoryRegistry.java`
#### Snippet
```java
    public static final ParseNodeFactoryRegistry defaultInstance = new ParseNodeFactoryRegistry();
    /** List of factories that are registered by content type. */
    @Nonnull
    public final HashMap<String, ParseNodeFactory> contentTypeAssociatedFactories = new HashMap<>();
    @Nonnull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `components/abstractions/src/main/java/com/microsoft/kiota/ApiException.java`
#### Snippet
```java

    /** The HTTP response headers for the error response*/
    @Nonnull
    private ResponseHeaders responseHeaders = new ResponseHeaders();

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/TelemetryHandler.java`
#### Snippet
```java
	@SuppressWarnings("UnknownNullness")
    @Nonnull
    public Response intercept(Chain chain) throws IOException {
		Objects.requireNonNull(chain, "parameter chain cannot be null");
        final Request request = chain.request();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `components/abstractions/src/main/java/com/microsoft/kiota/BaseRequestBuilder.java`
#### Snippet
```java
    protected HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    @Nonnull
    protected RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `components/abstractions/src/main/java/com/microsoft/kiota/BaseRequestBuilder.java`
#### Snippet
```java
    protected RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    @Nonnull
    protected String urlTemplate;
    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `components/abstractions/src/main/java/com/microsoft/kiota/BaseRequestBuilder.java`
#### Snippet
```java
public abstract class BaseRequestBuilder {
    /** Path parameters for the request */
    @Nonnull
    protected HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/ParametersNameDecodingHandler.java`
#### Snippet
```java
    @Nonnull
	@SuppressWarnings("UnknownNullness")
    public Response intercept(final Chain chain) throws IOException {
        Objects.requireNonNull(chain);
        final Request request = chain.request();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java
    @Nonnull
	@SuppressWarnings("UnknownNullness")
    public Response intercept(final Chain chain) throws IOException {
        Objects.requireNonNull(chain, "parameter chain cannot be null");
        Request request = chain.request();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `components/abstractions/src/main/java/com/microsoft/kiota/store/BackingStoreFactorySingleton.java`
#### Snippet
```java
    public BackingStoreFactorySingleton() {}
    /** The backing store factory singleton instance. */
    @Nonnull
    public static BackingStoreFactory instance = new InMemoryBackingStoreFactory();
}
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `components/abstractions/src/main/java/com/microsoft/kiota/BaseRequestConfiguration.java`
#### Snippet
```java
public abstract class BaseRequestConfiguration {
    /** Request headers */
    @Nullable
    public RequestHeaders headers = new RequestHeaders();
    /** Request options */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `components/abstractions/src/main/java/com/microsoft/kiota/BaseRequestConfiguration.java`
#### Snippet
```java
    public RequestHeaders headers = new RequestHeaders();
    /** Request options */
    @Nullable
    public java.util.List<RequestOption> options = Collections.emptyList();
}
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `components/abstractions/src/main/java/com/microsoft/kiota/authentication/ApiKeyAuthenticationProvider.java`
#### Snippet
```java
    @Nonnull
    private final String paramName;
    @Nonnull
    private final String apiKey;
    private final AllowedHostsValidator validator;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `components/abstractions/src/main/java/com/microsoft/kiota/authentication/ApiKeyAuthenticationProvider.java`
#### Snippet
```java
public class ApiKeyAuthenticationProvider implements AuthenticationProvider {
    private final ApiKeyLocation location;
    @Nonnull
    private final String paramName;
    @Nonnull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestInformation.java`
#### Snippet
```java
    @Nonnull
    private static final String BINARY_CONTENT_TYPE = "application/octet-stream";
    @Nonnull
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestInformation.java`
#### Snippet
```java
    public String urlTemplate;
    /** The path parameters for the current request */
    @Nullable
    public Map<String, Object> pathParameters = new HashMap<>();
    private URI uri;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestInformation.java`
#### Snippet
```java
    static final String RAW_URL_KEY = "request-raw-url";
    /** The HTTP method for the request */
    @Nullable
    public HttpMethod httpMethod;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestInformation.java`
#### Snippet
```java
    }
    /** The url template for the current request */
    @Nullable
    public String urlTemplate;
    /** The path parameters for the current request */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestInformation.java`
#### Snippet
```java
    @Nullable
    public InputStream content;
    @Nonnull
    private final HashMap<String, RequestOption> requestOptions = new HashMap<>();
    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestInformation.java`
#### Snippet
```java
    public final RequestHeaders headers = new RequestHeaders();
    /** The Request Body. */
    @Nullable
    public InputStream content;
    @Nonnull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestInformation.java`
#### Snippet
```java
        addRequestOptions(new ArrayList<>(Arrays.asList(handlerOption)));
    }
    @Nonnull
    private static final String BINARY_CONTENT_TYPE = "application/octet-stream";
    @Nonnull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestInformation.java`
#### Snippet
```java
    }
    /** The request headers */
    @Nonnull
    public final RequestHeaders headers = new RequestHeaders();
    /** The Request Body. */
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpCallbackFutureWrapper.java`
#### Snippet
```java

	@Override
	public void onResponse(Call arg0, Response arg1) throws IOException {
		future.complete(arg1);
	}
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpCallbackFutureWrapper.java`
#### Snippet
```java

	@Override
	public void onResponse(Call arg0, Response arg1) throws IOException {
		future.complete(arg1);
	}
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpCallbackFutureWrapper.java`
#### Snippet
```java
    final CompletableFuture<Response> future = new CompletableFuture<>();
	@Override
	public void onFailure(Call arg0, IOException arg1) {
		future.completeExceptionally(arg1);
	}
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpCallbackFutureWrapper.java`
#### Snippet
```java
    final CompletableFuture<Response> future = new CompletableFuture<>();
	@Override
	public void onFailure(Call arg0, IOException arg1) {
		future.completeExceptionally(arg1);
	}
```

### NullableProblems
Cannot annotate with both @Nullable and @Nonnull
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonSerializationWriter.java`
#### Snippet
```java
        this.onStartObjectSerialization = value;
    }
    public void writeByteArrayValue(@Nullable final String key, @Nullable @Nonnull final byte[] value) {
        if(value != null)
            this.writeStringValue(key, Base64.getEncoder().encodeToString(value));
```

### NullableProblems
Cannot annotate with both @Nonnull and @Nullable
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonSerializationWriter.java`
#### Snippet
```java
        this.onStartObjectSerialization = value;
    }
    public void writeByteArrayValue(@Nullable final String key, @Nullable @Nonnull final byte[] value) {
        if(value != null)
            this.writeStringValue(key, Base64.getEncoder().encodeToString(value));
```

### NullableProblems
Overridden methods are not annotated
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/AdditionalDataHolder.java`
#### Snippet
```java
     * @return The additional data for this object.
     */
    @Nonnull
    Map<String, Object> getAdditionalData();    
}
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/UserAgentHandler.java`
#### Snippet
```java
    @Override
	@SuppressWarnings("UnknownNullness")
    public Response intercept(final Chain chain) throws IOException {
        Objects.requireNonNull(chain, "parameter chain cannot be null");
        final Request request = chain.request();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/UserAgentHandler.java`
#### Snippet
```java
    @Override
	@SuppressWarnings("UnknownNullness")
    public Response intercept(final Chain chain) throws IOException {
        Objects.requireNonNull(chain, "parameter chain cannot be null");
        final Request request = chain.request();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RedirectHandler.java`
#### Snippet
```java
    @Nonnull
	@SuppressWarnings("UnknownNullness")
    public Response intercept(final Chain chain) throws IOException {
        Objects.requireNonNull(chain, "parameter chain cannot be null");
        Request request = chain.request();
```

### NullableProblems
Cannot annotate with both @Nullable and @Nonnull
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormSerializationWriter.java`
#### Snippet
```java
        this.onStartObjectSerialization = value;
    }
    public void writeByteArrayValue(@Nullable final String key, @Nullable @Nonnull final byte[] value) {
        if(value != null)
            this.writeStringValue(key, Base64.getEncoder().encodeToString(value));
```

### NullableProblems
Cannot annotate with both @Nonnull and @Nullable
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormSerializationWriter.java`
#### Snippet
```java
        this.onStartObjectSerialization = value;
    }
    public void writeByteArrayValue(@Nullable final String key, @Nullable @Nonnull final byte[] value) {
        if(value != null)
            this.writeStringValue(key, Base64.getEncoder().encodeToString(value));
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java

            @Override
            public String toString() {
                StringBuilder builder = new StringBuilder();
                builder.append(variable);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java

            @Override
            public CharSequence subSequence(int start, int end) {
                return value.subSequence(start, end);
            }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java

    @Override
    public int compareTo(UriTemplate o) {
        if (this == o) {
            return 0;
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java

            @Override
            public CharSequence subSequence(int start, int end) {
                return toString().subSequence(start, end);
            }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java

                    @Override
                    public void writeTo(BufferedSink sink) throws IOException {
                        sink.writeAll(Okio.source(requestInfo.content));
                    }
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RedirectHandler.java`
#### Snippet
```java
        // If any of 301,302,303,307,308 then redirect
        final int statusCode = response.code();
        if(statusCode == HTTP_PERM_REDIRECT || //308
                statusCode == HTTP_MOVED_PERM || //301
                statusCode == HTTP_TEMP_REDIRECT || //307
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
     */
    protected String normalizeNested(String uri, CharSequence nested) {
        if (nested.length() <= 0 || nested.toString().trim().isEmpty()) {
            return uri;
        }
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonSerializationWriter.java`
#### Snippet
```java
    public JsonSerializationWriter() {
        try {
            this.writer = new JsonWriter(new OutputStreamWriter(this.stream, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("could not create json writer", e);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `components/authentication/azure/src/main/java/com/microsoft/kiota/authentication/AzureIdentityAccessTokenProvider.java`
#### Snippet
```java
                final String rawClaim = (String) additionalAuthenticationContext.get(ClaimsKey);
                try {
                    decodedClaim = new String(Base64.getDecoder().decode(rawClaim), "UTF-8");
                } catch (final UnsupportedEncodingException e) {
                    span.recordException(e);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextSerializationWriter.java`
#### Snippet
```java
    public TextSerializationWriter() {
        try {
            this.writer = new OutputStreamWriter(this.stream, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormSerializationWriter.java`
#### Snippet
```java
    public FormSerializationWriter() {
        try {
            this.writer = new OutputStreamWriter(this.stream, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("could not create writer", e);
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
                switch (state) {
                    case STATE_TEXT:
                        if (c == VAR_START) {
                            if (buff.length() > 0) {
                                String val = buff.toString();
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.concurrent.CompletionStage;`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import javax.annotation.Nonnull;
```

### UNUSED_IMPORT
Unused import `import com.google.gson.JsonParser;`
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonParseNode.java`
#### Snippet
```java
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;

```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `((Math.pow(...) - 1) * 0.5)` to `double` is redundant
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java
    private double exponentialBackOffDelay(double delay, int executionCount) {
        double retryDelay = RetryHandlerOption.DEFAULT_DELAY * DELAY_MILLISECONDS;
        retryDelay = (double)((Math.pow(2.0, (double)executionCount)-1)*0.5);
        retryDelay = (executionCount < 2 ? delay : retryDelay + delay) + (double)Math.random();
        retryDelay *= DELAY_MILLISECONDS;
```

### RedundantCast
Casting `executionCount` to `double` is redundant
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java
    private double exponentialBackOffDelay(double delay, int executionCount) {
        double retryDelay = RetryHandlerOption.DEFAULT_DELAY * DELAY_MILLISECONDS;
        retryDelay = (double)((Math.pow(2.0, (double)executionCount)-1)*0.5);
        retryDelay = (executionCount < 2 ? delay : retryDelay + delay) + (double)Math.random();
        retryDelay *= DELAY_MILLISECONDS;
```

### RedundantCast
Casting `Math.random()` to `double` is redundant
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java
        double retryDelay = RetryHandlerOption.DEFAULT_DELAY * DELAY_MILLISECONDS;
        retryDelay = (double)((Math.pow(2.0, (double)executionCount)-1)*0.5);
        retryDelay = (executionCount < 2 ? delay : retryDelay + delay) + (double)Math.random();
        retryDelay *= DELAY_MILLISECONDS;
        return retryDelay;
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `contentTypeVendorCleanupPattern` may be 'final'
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/SerializationWriterFactoryRegistry.java`
#### Snippet
```java
        throw new UnsupportedOperationException("The registry supports multiple content types. Get the registered factory instead.");
    }
    private static Pattern contentTypeVendorCleanupPattern = Pattern.compile("[^/]+\\+", Pattern.CASE_INSENSITIVE);
    @Override
    @Nonnull
```

### FieldMayBeFinal
Field `contentTypeVendorCleanupPattern` may be 'final'
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/ParseNodeFactoryRegistry.java`
#### Snippet
```java
        throw new UnsupportedOperationException("The registry supports multiple content types. Get the registered factory instead.");
    }
    private static Pattern contentTypeVendorCleanupPattern = Pattern.compile("[^/]+\\+", Pattern.CASE_INSENSITIVE);
    @Override
    @Nonnull
```

### FieldMayBeFinal
Field `mRetryOption` may be 'final'
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java

    @Nonnull
    private RetryHandlerOption mRetryOption;

    /**
```

### FieldMayBeFinal
Field `queryParameters` may be 'final'
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestInformation.java`
#### Snippet
```java
    public HttpMethod httpMethod;

    private HashMap<String, Object> queryParameters = new HashMap<>();
    /**
     * Adds query parameters to the request based on the object passed in and its fields.
```

### FieldMayBeFinal
Field `maxRedirects` may be 'final'
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/options/RedirectHandlerOption.java`
#### Snippet
```java
 */
public class RedirectHandlerOption implements RequestOption {
    private int maxRedirects;
    /**
     * The default maximum number of redirects to follow
```

### FieldMayBeFinal
Field `mDelay` may be 'final'
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/options/RetryHandlerOption.java`
#### Snippet
```java
     * Delay in seconds
     */
    private long mDelay;
    /**
     * Default retry delay
```

### FieldMayBeFinal
Field `mMaxRetries` may be 'final'
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/options/RetryHandlerOption.java`
#### Snippet
```java
    public static final IShouldRetry DEFAULT_SHOULD_RETRY = (delay, executionCount, request, response) -> true;

    private int mMaxRetries;
    /**
     * Absolute maximum number of retries
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestInformation.java`
#### Snippet
```java
        ResponseHandlerOption handlerOption = new ResponseHandlerOption();
        handlerOption.setResponseHandler(responseHandler);
        addRequestOptions(new ArrayList<>(Arrays.asList(handlerOption)));
    }
    @Nonnull
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `shouldRetry` initializer `false` is redundant
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java
        }

        boolean shouldRetry = false;
        // Status codes 429 503 504
        int statusCode = response.code();
```

### UnusedAssignment
Variable `retryDelay` initializer `RetryHandlerOption.DEFAULT_DELAY * DELAY_MILLISECONDS` is redundant
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java

    private double exponentialBackOffDelay(double delay, int executionCount) {
        double retryDelay = RetryHandlerOption.DEFAULT_DELAY * DELAY_MILLISECONDS;
        retryDelay = (double)((Math.pow(2.0, (double)executionCount)-1)*0.5);
        retryDelay = (executionCount < 2 ? delay : retryDelay + delay) + (double)Math.random();
```

### UnusedAssignment
Variable `response` initializer `null` is redundant
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RedirectHandler.java`
#### Snippet
```java
            throw new IllegalArgumentException("request cannot be null");
        }
        Response response = null;
        int requestsCount = 1;
        boolean shouldRedirect = true;
```

### UnusedAssignment
Variable `shouldRedirect` initializer `true` is redundant
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RedirectHandler.java`
#### Snippet
```java
        Response response = null;
        int requestsCount = 1;
        boolean shouldRedirect = true;

        // Use should retry pass along with this request
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `components/abstractions/src/main/java/com/microsoft/kiota/authentication/AllowedHostsValidator.java`
#### Snippet
```java
        final HashSet<String> value = new HashSet<>(allowedHosts.length);
        for(final String val : allowedHosts) {
            value.add(val);
        }
        this.setAllowedHosts(value);
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `nameOption.parametersToDecode == null` is always `false`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/ParametersNameDecodingHandler.java`
#### Snippet
```java
                nameOption == null ||
                !nameOption.enable ||
                nameOption.parametersToDecode == null ||
                nameOption.parametersToDecode.length == 0) {
                    return chain.proceed(request);
```

### ConstantValue
Condition `request == null` is always `false`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java
        Objects.requireNonNull(chain, "parameter chain cannot be null");
        Request request = chain.request();
        if (request == null) {
            throw new IllegalArgumentException("request cannot be null");
        }
```

### ConstantValue
Condition `response == null` is always `false`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java
            }
            Response response = chain.proceed(request);
            if (response == null)
                throw new RuntimeException("unable to get a response from the chain");

```

### ConstantValue
Condition `request == null` is always `false`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java
                }
                request = builder.build();
                if (request == null) {
                    throw new IllegalArgumentException("request cannot be null");
                }
```

### ConstantValue
Condition `response == null` is always `false`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java
                retrySpan.end();
                response = chain.proceed(request);
                if (response == null)
                    throw new RuntimeException("unable to get a response from the chain");
            }
```

### ConstantValue
Condition `retryOption != null` is always `true`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java
        // Use should retry common for all requests
        IShouldRetry shouldRetryCallback = null;
        if(retryOption != null) {
            shouldRetryCallback = retryOption.shouldRetry();
        }
```

### ConstantValue
Condition `shouldRetryCallback != null` is always `true`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java
        // without any retry attempt.
        shouldRetry =
                    shouldRetryCallback != null
                        && executionCount <= retryOption.maxRetries()
                        && checkStatus(statusCode) && isBuffered(request)
```

### ConstantValue
Condition `retryDelay == -1` is always `true`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java
                retryDelay = tryParseDateHeader(retryAfterHeader);
            }
        } else if(retryDelay == -1) {
            retryDelay = exponentialBackOffDelay(delay, executionCount);
        }
```

### ConstantValue
Condition `backingStore != null` is always `true`
in `components/abstractions/src/main/java/com/microsoft/kiota/store/BackingStoreParseNodeFactory.java`
#### Snippet
```java
                    final BackedModel backedModel = (BackedModel)x;
                    final BackingStore backingStore = backedModel.getBackingStore();
                    if(backingStore != null) {
                        backingStore.setIsInitializationCompleted(false);
                    }
```

### ConstantValue
Condition `backingStore != null` is always `true`
in `components/abstractions/src/main/java/com/microsoft/kiota/store/BackingStoreParseNodeFactory.java`
#### Snippet
```java
                    final BackedModel backedModel = (BackedModel)x;
                    final BackingStore backingStore = backedModel.getBackingStore();
                    if(backingStore != null) {
                        backingStore.setIsInitializationCompleted(true);
                    }
```

### ConstantValue
Condition `value == null` is always `false`
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonSerializationWriter.java`
#### Snippet
```java
    }
    public void writeAdditionalData(@Nonnull final Map<String, Object> value) {
        if(value == null) return;
        for(final Map.Entry<String, Object> dataValue : value.entrySet()) {
            this.writeAnyValue(dataValue.getKey(), dataValue.getValue());
```

### ConstantValue
Condition `concatenatedValue.isPresent()` is always `true`
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonSerializationWriter.java`
#### Snippet
```java
        if(values != null && !values.isEmpty()) {
            final Optional<String> concatenatedValue = values.stream().map(v -> this.getStringValueFromValuedEnum(v)).reduce((x, y) -> { return x + "," + y; });
            if(concatenatedValue.isPresent()) {
                this.writeStringValue(key, concatenatedValue.get());
            }
```

### ConstantValue
Condition `scopes == null` is always `false`
in `components/authentication/azure/src/main/java/com/microsoft/kiota/authentication/AzureIdentityAccessTokenProvider.java`
#### Snippet
```java
        creds = Objects.requireNonNull(tokenCredential, "parameter tokenCredential cannot be null");

        if(scopes == null) {
            _scopes = new ArrayList<String>();
        } else {
```

### ConstantValue
Condition `allowedHosts == null` is always `false`
in `components/authentication/azure/src/main/java/com/microsoft/kiota/authentication/AzureIdentityAccessTokenProvider.java`
#### Snippet
```java
            _scopes = Arrays.asList(scopes);
        }
        if (allowedHosts == null || allowedHosts.length == 0) {
            _hostValidator = new AllowedHostsValidator();
        } else {
```

### ConstantValue
Condition `this.returnOnlyChangedValues` is always `true` when reached
in `components/abstractions/src/main/java/com/microsoft/kiota/store/InMemoryBackingStore.java`
#### Snippet
```java
            final Boolean hasChanged = wrapper.getValue0();
            if(!this.returnOnlyChangedValues ||
                (this.returnOnlyChangedValues && hasChanged != null && hasChanged.booleanValue())) {
                return wrapper.getValue1();
            }
```

### ConstantValue
Condition `allowedHosts != null` is always `true`
in `components/abstractions/src/main/java/com/microsoft/kiota/authentication/AllowedHostsValidator.java`
#### Snippet
```java
    public void setAllowedHosts(@Nonnull final Set<String> allowedHosts) {
        validHosts = new HashSet<String>();
        if(allowedHosts != null) {
            for (final String host : allowedHosts) {
                if (host != null && !host.isEmpty())
```

### ConstantValue
Condition `backingStore != null` is always `true`
in `components/abstractions/src/main/java/com/microsoft/kiota/store/BackingStoreSerializationWriterProxyFactory.java`
#### Snippet
```java
                final BackedModel backedModel = (BackedModel)x;
                final BackingStore backingStore = backedModel.getBackingStore();
                if(backingStore != null) {
                    backingStore.setReturnOnlyChangedValues(true);
                }
```

### ConstantValue
Condition `backingStore != null` is always `true`
in `components/abstractions/src/main/java/com/microsoft/kiota/store/BackingStoreSerializationWriterProxyFactory.java`
#### Snippet
```java
                final BackedModel backedModel = (BackedModel)x;
                final BackingStore backingStore = backedModel.getBackingStore();
                if(backingStore != null) {
                    backingStore.setReturnOnlyChangedValues(false);
                    backingStore.setIsInitializationCompleted(true);
```

### ConstantValue
Condition `backingStore != null` is always `true`
in `components/abstractions/src/main/java/com/microsoft/kiota/store/BackingStoreSerializationWriterProxyFactory.java`
#### Snippet
```java
                final BackedModel backedModel = (BackedModel)x;
                final BackingStore backingStore = backedModel.getBackingStore();
                if(backingStore != null) {
                    final Iterable<String> keys = backingStore.enumerateKeysForValuesChangedToNull();
                    for(final String key : keys) {
```

### ConstantValue
Condition `request == null` is always `false`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RedirectHandler.java`
#### Snippet
```java
        Objects.requireNonNull(chain, "parameter chain cannot be null");
        Request request = chain.request();
        if (request == null) {
            throw new IllegalArgumentException("request cannot be null");
        }
```

### ConstantValue
Condition `request == null` is always `false`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RedirectHandler.java`
#### Snippet
```java
                if (span != null) {
                    request = request.newBuilder().tag(Span.class, span).build();
                    if (request == null) {
                        throw new IllegalArgumentException("request cannot be null");
                    }
```

### ConstantValue
Condition `response == null` is always `false`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RedirectHandler.java`
#### Snippet
```java
                }
                response = chain.proceed(request);
                if (response == null) {
                    throw new IllegalArgumentException("response cannot be null");
                }
```

### ConstantValue
Condition `value != null` is always `true`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextSerializationWriter.java`
#### Snippet
```java
    }
    public void writeByteArrayValue(@Nullable final String key, @Nonnull final byte[] value) {
        if(value != null)
            this.writeStringValue(key, Base64.getEncoder().encodeToString(value));
    }
```

### ConstantValue
Condition `concatenatedValue.isPresent()` is always `true`
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormSerializationWriter.java`
#### Snippet
```java
        if(values != null && !values.isEmpty()) {
            final Optional<String> concatenatedValue = values.stream().map(v -> this.getStringValueFromValuedEnum(v)).reduce((x, y) -> { return x + "," + y; });
            if(concatenatedValue.isPresent()) {
                this.writeStringValue(key, concatenatedValue.get());
            }
```

### ConstantValue
Condition `value == null` is always `false`
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormSerializationWriter.java`
#### Snippet
```java
    }
    public void writeAdditionalData(@Nonnull final Map<String, Object> value) {
        if(value == null) return;
        for(final Map.Entry<String, Object> dataValue : value.entrySet()) {
            this.writeAnyValue(dataValue.getKey(), dataValue.getValue());
```

### ConstantValue
Condition `headerValue != null` is always `true`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
    private String getHeaderValue(final Response response, String key) {
        final List<String> headerValue = response.headers().values(key);
        if(headerValue != null && headerValue.size() > 0) {
            final String firstEntryValue = headerValue.get(0);
            if(firstEntryValue != null && !firstEntryValue.isEmpty()) {
```

### ConstantValue
Condition `authenticateHeader != null` is always `true`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
           (requestInfo.content == null || requestInfo.content.markSupported())) {
               final List<String> authenticateHeader = response.headers("WWW-Authenticate");
               if(authenticateHeader != null && !authenticateHeader.isEmpty()) {
                    String rawHeaderValue = null;
                    for(final String authenticateEntry: authenticateHeader) {
```

### ConstantValue
Condition `contentLengthHeader != null` is always `true`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
            final Request request = requestBuilder.build();
            final List<String> contentLengthHeader = request.headers().values("Content-Length");
            if(contentLengthHeader != null && contentLengthHeader.size() > 0) {
                final String firstEntryValue = contentLengthHeader.get(0);
                if(firstEntryValue != null && !firstEntryValue.isEmpty()) {
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'result' to 'List'
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                            final Object result = rootNode.getCollectionOfEnumValues(targetClass);
                            setResponseType(result, span);
                            return CompletableFuture.completedFuture((List<ModelType>)result);
                        } finally {
                            deserializationSpan.end();
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'result' to 'ModelType'
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                            final Object result = rootNode.getEnumValue(targetClass);
                            setResponseType(result, span);
                            return CompletableFuture.completedFuture((ModelType)result);
                        } finally {
                            deserializationSpan.end();
```

