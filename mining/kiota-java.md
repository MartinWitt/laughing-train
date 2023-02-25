# kiota-java 
 
# Bad smells
I found 252 bad smells with 22 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ConstantValue | 28 | false |
| DataFlowIssue | 22 | false |
| DoubleBraceInitialization | 21 | false |
| NullableProblems | 20 | false |
| MissortedModifiers | 17 | false |
| BoundedWildcard | 15 | false |
| RegExpRedundantEscape | 14 | false |
| ReturnNull | 14 | false |
| GroovyUnusedAssignment | 12 | false |
| SizeReplaceableByIsEmpty | 10 | true |
| JavaLangImport | 9 | false |
| SamePackageImport | 5 | false |
| CharsetObjectCanBeUsed | 4 | false |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| UnusedAssignment | 4 | false |
| WrapperTypeMayBePrimitive | 3 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| StringOperationCanBeSimplified | 3 | false |
| Convert2MethodRef | 3 | false |
| InstanceofIncompatibleInterface | 3 | false |
| ZeroLengthArrayInitialization | 3 | false |
| OptionalIsPresent | 2 | false |
| UnnecessaryModifier | 2 | true |
| UnnecessaryToStringCall | 2 | true |
| UtilityClassWithPublicConstructor | 2 | false |
| UnnecessaryBoxing | 2 | false |
| CodeBlock2Expr | 2 | true |
| NonProtectedConstructorInAbstractClass | 2 | true |
| RedundantFieldInitialization | 2 | false |
| AssignmentToMethodParameter | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| RedundantLengthCheck | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| MethodOverloadsParentMethod | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| UnnecessaryUnboxing | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| UNUSED_IMPORT | 1 | false |
| CallToStringConcatCanBeReplacedByOperator | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[ruleID=WrapperTypeMayBePrimitive]
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
                final String contentLengthHeaderValue = getHeaderValue(x, "Content-Length");
                if(contentLengthHeaderValue != null && !contentLengthHeaderValue.isEmpty()) {
                    final Integer contentLengthHeaderValueAsInt = Integer.parseInt(contentLengthHeaderValue);
                    spanForAttributes.setAttribute(SemanticAttributes.HTTP_RESPONSE_CONTENT_LENGTH, contentLengthHeaderValueAsInt);
                }
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java

            final String statusCodeAsString = Integer.toString(response.code());
            final Integer statusCode = response.code();
            if (errorMappings == null ||
            !errorMappings.containsKey(statusCodeAsString) &&
```

## RuleId[ruleID=OptionalIsPresent]
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

## RuleId[ruleID=UnnecessaryModifier]
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

## RuleId[ruleID=RedundantLengthCheck]
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

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ObservabilityHelper` has only 'static' members, and lacks a 'private' constructor
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/ObservabilityHelper.java`
#### Snippet
```java
import okhttp3.Request;

class ObservabilityHelper {
	static Span getSpanForRequest(@Nonnull final Request request, @Nonnull final String spanName) {
		return getSpanForRequest(request, spanName, null);
```

### UtilityClassWithoutPrivateConstructor
Class `ParseNodeHelper` has only 'static' members, and lacks a 'private' constructor
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/ParseNodeHelper.java`
#### Snippet
```java

/** Utility methods to reduce the amount of code being generated. */
public class ParseNodeHelper {
	/** Default constructor */
	public ParseNodeHelper() {}
```

### UtilityClassWithoutPrivateConstructor
Class `BackingStoreFactorySingleton` has only 'static' members, and lacks a 'private' constructor
in `components/abstractions/src/main/java/com/microsoft/kiota/store/BackingStoreFactorySingleton.java`
#### Snippet
```java

/** This class is used to register the backing store factory. */
public class BackingStoreFactorySingleton {
    /** Default constructor */
    public BackingStoreFactorySingleton() {}
```

## RuleId[ruleID=ManualArrayToCollectionCopy]
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

## RuleId[ruleID=DataFlowIssue]
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
Expression `headers.put(normalizeKey(key), new HashSet<>(value))` might evaluate to null but is returned by the method declared as @Nonnull
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestHeaders.java`
#### Snippet
```java
        Objects.requireNonNull(key);
        Objects.requireNonNull(value);
        return headers.put(normalizeKey(key), new HashSet<>(value));
    }
    /** {@inheritDoc} */
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
    public Float getFloatValue() {
        try {
            return Float.parseFloat(getStringValue());
        } catch (final NumberFormatException ex) {
            return null;
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
    public OffsetDateTime getOffsetDateTimeValue() {
        return OffsetDateTime.parse(this.getStringValue());
    }
    @Nullable
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

## RuleId[ruleID=StringOperationCanBeSimplified]
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

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BackingStoreFactorySingleton.instance` from instance context
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
        this.sWriterFactory = Objects.requireNonNull(ApiClientBuilder.enableBackingStoreForSerializationWriterFactory(sWriterFactory));
        if(backingStoreFactory != null) {
            BackingStoreFactorySingleton.instance = backingStoreFactory;
        }
    }
```

## RuleId[ruleID=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `remove()` overloads a compatible method of a superclass, when overriding might have been intended
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestHeaders.java`
#### Snippet
```java
     * @return true if the value was removed, false otherwise
     */
    public boolean remove(@Nonnull final String key, @Nonnull final String value) { 
        Objects.requireNonNull(key);
        Objects.requireNonNull(value);
```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `components/authentication/azure/src/main/java/com/microsoft/kiota/authentication/AzureIdentityAccessTokenProvider.java`
#### Snippet
```java
                context.setClaims(decodedClaim);
            }
            return this.creds.getToken(context).toFuture().thenApply(r -> r.getToken());
        } finally {
            span.end();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormSerializationWriter.java`
#### Snippet
```java
    public <T extends Enum<T>> void writeEnumSetValue(@Nullable final String key, @Nullable final EnumSet<T> values) {
        if(values != null && !values.isEmpty()) {
            final Optional<String> concatenatedValue = values.stream().map(v -> this.getStringValueFromValuedEnum(v)).reduce((x, y) -> { return x + "," + y; });
            if(concatenatedValue.isPresent()) {
                this.writeStringValue(key, concatenatedValue.get());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonSerializationWriter.java`
#### Snippet
```java
    public <T extends Enum<T>> void writeEnumSetValue(@Nullable final String key, @Nullable final EnumSet<T> values) {
        if(values != null && !values.isEmpty()) {
            final Optional<String> concatenatedValue = values.stream().map(v -> this.getStringValueFromValuedEnum(v)).reduce((x, y) -> { return x + "," + y; });
            if(concatenatedValue.isPresent()) {
                this.writeStringValue(key, concatenatedValue.get());
```

## RuleId[ruleID=UnnecessaryCallToStringValueOf]
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

## RuleId[ruleID=RegExpRedundantEscape]
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
    static final Pattern PATTERN_FULL_URI = Pattern.compile(
            "^(" + STRING_PATTERN_SCHEME + ")?" + "(//(" + STRING_PATTERN_USER_INFO + "@)?" + STRING_PATTERN_HOST + "(:" + STRING_PATTERN_PORT +
                    ")?" + ")?" + STRING_PATTERN_PATH + "(\\?" + STRING_PATTERN_QUERY + ")?" + "(#" + STRING_PATTERN_REMAINING + ")?");

    protected final String templateString;
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

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`location.length() == 0` can be replaced with 'location.isEmpty()'
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RedirectHandler.java`
#### Snippet
```java
            final Response userResponse) throws ProtocolException {
        String location = userResponse.header("Location");
        if (location == null || location.length() == 0) return null;

        // For relative URL in location header, the new url to redirect is relative to original request
```

### SizeReplaceableByIsEmpty
`nonNullAdditionalValuesToMerge.size() > 0` can be replaced with '!nonNullAdditionalValuesToMerge.isEmpty()'
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormSerializationWriter.java`
#### Snippet
```java
        depth++;
        final List<Parsable> nonNullAdditionalValuesToMerge = Stream.of(additionalValuesToMerge).filter(Objects::nonNull).collect(Collectors.toList());
        if(value != null || nonNullAdditionalValuesToMerge.size() > 0) {
            if(onBeforeObjectSerialization != null && value != null) {
                onBeforeObjectSerialization.accept(value);
```

### SizeReplaceableByIsEmpty
`nonNullAdditionalValuesToMerge.size() > 0` can be replaced with '!nonNullAdditionalValuesToMerge.isEmpty()'
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonSerializationWriter.java`
#### Snippet
```java
        try {
            final List<Parsable> nonNullAdditionalValuesToMerge = Stream.of(additionalValuesToMerge).filter(Objects::nonNull).collect(Collectors.toList());
            if(value != null || nonNullAdditionalValuesToMerge.size() > 0) {
                if(key != null && !key.isEmpty()) {
                    writer.name(key);
```

### SizeReplaceableByIsEmpty
`buff.length() > 0` can be replaced with '!buff.isEmpty()'
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
                    case STATE_TEXT:
                        if (c == VAR_START) {
                            if (buff.length() > 0) {
                                String val = buff.toString();
                                addRawContentSegment(segments, val, isQuerySegment);
```

### SizeReplaceableByIsEmpty
`buff.length() > 0` can be replaced with '!buff.isEmpty()'
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
                            case VAR_END: // arrived to variable end

                                if (buff.length() > 0) {
                                    String val = buff.toString();
                                    final String prefix;
```

### SizeReplaceableByIsEmpty
`buff.length() > 0` can be replaced with '!buff.isEmpty()'
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
            }

            if (state == STATE_TEXT && buff.length() > 0) {
                String val = buff.toString();
                addRawContentSegment(segments, val, isQuerySegment);
```

### SizeReplaceableByIsEmpty
`result.length() > 0` can be replaced with '!result.isEmpty()'
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
                    anyPreviousHasOperator = true;
                }
                anyPreviousHasContent = anyPreviousHasContent || result.length() > 0;
            }
            builder.append(result);
```

### SizeReplaceableByIsEmpty
`modifierStr.length() > 0` can be replaced with '!modifierStr.isEmpty()'
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java

            private String applyModifier(String modifierStr, char modifierChar, String result, int len) {
                if (modifierChar == ':' && modifierStr.length() > 0 && Character.isDigit(modifierStr.charAt(0))) {
                    try {
                        int subResult = Integer.parseInt(modifierStr.trim(), 10);
```

### SizeReplaceableByIsEmpty
`contentLengthHeader.size() > 0` can be replaced with '!contentLengthHeader.isEmpty()'
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
            final Request request = requestBuilder.build();
            final List<String> contentLengthHeader = request.headers().values("Content-Length");
            if(contentLengthHeader != null && contentLengthHeader.size() > 0) {
                final String firstEntryValue = contentLengthHeader.get(0);
                if(firstEntryValue != null && !firstEntryValue.isEmpty()) {
```

### SizeReplaceableByIsEmpty
`headerValue.size() > 0` can be replaced with '!headerValue.isEmpty()'
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
    private String getHeaderValue(final Response response, String key) {
        final List<String> headerValue = response.headers().values(key);
        if(headerValue != null && headerValue.size() > 0) {
            final String firstEntryValue = headerValue.get(0);
            if(firstEntryValue != null && !firstEntryValue.isEmpty()) {
```

## RuleId[ruleID=StringBufferReplaceableByString]
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

## RuleId[ruleID=UnnecessaryToStringCall]
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

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Parsable`
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/SerializationWriterProxyFactory.java`
#### Snippet
```java
     */
    public SerializationWriterProxyFactory(@Nonnull final SerializationWriterFactory concrete,
        @Nullable final Consumer<Parsable> onBeforeSerialization,
        @Nullable final Consumer<Parsable> onAfterSerialization,
        @Nullable final BiConsumer<Parsable, SerializationWriter> onStartObjectSerialization) {
```

### BoundedWildcard
Can generalize to `? super Parsable`
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/SerializationWriterProxyFactory.java`
#### Snippet
```java
    public SerializationWriterProxyFactory(@Nonnull final SerializationWriterFactory concrete,
        @Nullable final Consumer<Parsable> onBeforeSerialization,
        @Nullable final Consumer<Parsable> onAfterSerialization,
        @Nullable final BiConsumer<Parsable, SerializationWriter> onStartObjectSerialization) {
        _concrete = Objects.requireNonNull(concrete);
```

### BoundedWildcard
Can generalize to `? super Parsable`
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/SerializationWriterProxyFactory.java`
#### Snippet
```java
        @Nullable final Consumer<Parsable> onBeforeSerialization,
        @Nullable final Consumer<Parsable> onAfterSerialization,
        @Nullable final BiConsumer<Parsable, SerializationWriter> onStartObjectSerialization) {
        _concrete = Objects.requireNonNull(concrete);
        _onBefore = onBeforeSerialization;
```

### BoundedWildcard
Can generalize to `? super SerializationWriter`
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/SerializationWriterProxyFactory.java`
#### Snippet
```java
        @Nullable final Consumer<Parsable> onBeforeSerialization,
        @Nullable final Consumer<Parsable> onAfterSerialization,
        @Nullable final BiConsumer<Parsable, SerializationWriter> onStartObjectSerialization) {
        _concrete = Objects.requireNonNull(concrete);
        _onBefore = onBeforeSerialization;
```

### BoundedWildcard
Can generalize to `? extends RequestOption`
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestInformation.java`
#### Snippet
```java
     * @param options the request options to add.
     */
    public void addRequestOptions(@Nullable final Collection<RequestOption> options) { 
        if(options == null || options.isEmpty()) return;
        for(final RequestOption option : options) {
```

### BoundedWildcard
Can generalize to `? super Parsable`
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/ParseNodeProxyFactory.java`
#### Snippet
```java
     */
    public ParseNodeProxyFactory(@Nonnull final ParseNodeFactory concrete,
        @Nullable final Consumer<Parsable> onBefore,
        @Nullable final Consumer<Parsable> onAfter) {
            _concrete = Objects.requireNonNull(concrete);
```

### BoundedWildcard
Can generalize to `? super Parsable`
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/ParseNodeProxyFactory.java`
#### Snippet
```java
    public ParseNodeProxyFactory(@Nonnull final ParseNodeFactory concrete,
        @Nullable final Consumer<Parsable> onBefore,
        @Nullable final Consumer<Parsable> onAfter) {
            _concrete = Objects.requireNonNull(concrete);
            _onBefore = onBefore;
```

### BoundedWildcard
Can generalize to `? extends Consumer`
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonParseNode.java`
#### Snippet
```java
        return result;
    }
    private <T extends Parsable> void assignFieldValues(final T item, final Map<String, Consumer<ParseNode>> fieldDeserializers) {
        if(currentNode.isJsonObject()) {
            if(this.onBeforeAssignFieldValues != null) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonParseNode.java`
#### Snippet
```java
    }
    @Nullable
    public <T extends Parsable> List<T> getCollectionOfObjectValues(@Nonnull final ParsableFactory<T> factory) {
        Objects.requireNonNull(factory, "parameter factory cannot be null");
        if(currentNode.isJsonNull()) {
```

### BoundedWildcard
Can generalize to `? extends Consumer`
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
        return result;
    }
    private <T extends Parsable> void assignFieldValues(final T item, final Map<String, Consumer<ParseNode>> fieldDeserializers) {
        if(!fields.isEmpty()) {
            if(this.onBeforeAssignFieldValues != null) {
```

### BoundedWildcard
Can generalize to `? super PathSegment`
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
         * @param isQuerySegment    Whether is a query segment
         */
        protected void addVariableSegment(List<PathSegment> segments,
                                          String variable,
                                          String prefix,
```

### BoundedWildcard
Can generalize to `? super PathSegment`
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
     * @return The template as a string
     */
    protected String toString(Predicate<PathSegment> filter) {
        StringBuilder builder = new StringBuilder(templateString.length());
        UriTemplateParser.VariablePathSegment previousVariable = null;
```

### BoundedWildcard
Can generalize to `? super PathSegment`
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
         * @param isQuerySegment Whether is a query segment
         */
        protected void addRawContentSegment(List<PathSegment> segments, String value, boolean isQuerySegment) {
            segments.add(new RawPathSegment(isQuerySegment, value));
        }
```

### BoundedWildcard
Can generalize to `? extends ModelType`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
    public static final String eventResponseHandlerInvokedKey = "com.microsoft.kiota.response_handler_invoked";
    @Nullable
    public <ModelType extends Parsable> CompletableFuture<ModelType> sendAsync(@Nonnull final RequestInformation requestInfo, @Nonnull final ParsableFactory<ModelType> factory, @Nullable final HashMap<String, ParsableFactory<? extends Parsable>> errorMappings) {
        Objects.requireNonNull(requestInfo, "parameter requestInfo cannot be null");
        Objects.requireNonNull(factory, "parameter factory cannot be null");
```

### BoundedWildcard
Can generalize to `? extends ParsableFactory`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
    @Nonnull
    public static final String errorBodyFoundAttributeName = "com.microsoft.kiota.error_body_found";
    private Response throwIfFailedResponse(@Nonnull final Response response, @Nonnull final Span spanForAttributes, @Nullable final HashMap<String, ParsableFactory<? extends Parsable>> errorMappings) throws IOException, ApiException {
        final Span span = GlobalOpenTelemetry.getTracer(obsOptions.getTracerInstrumentationName()).spanBuilder("throwIfFailedResponse").setParent(Context.current().with(spanForAttributes)).startSpan();
        try(final Scope scope = span.makeCurrent()) {
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNodeFactory.java`
#### Snippet
```java
        return validContentType;
    }
    private final static String validContentType = "application/x-www-form-urlencoded";
    @Override
    @Nonnull
```

### MissortedModifiers
Missorted modifiers `final static`
in `components/abstractions/src/main/java/com/microsoft/kiota/authentication/BaseBearerTokenAuthenticationProvider.java`
#### Snippet
```java
    private final AccessTokenProvider accessTokenProvider;
    private final static String authorizationHeaderKey = "Authorization";
    private final static String ClaimsKey = "claims";
    @Nonnull
    public CompletableFuture<Void> authenticateRequest(@Nonnull final RequestInformation request, @Nullable final Map<String, Object> additionalAuthenticationContext) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `components/abstractions/src/main/java/com/microsoft/kiota/authentication/BaseBearerTokenAuthenticationProvider.java`
#### Snippet
```java
    }
    private final AccessTokenProvider accessTokenProvider;
    private final static String authorizationHeaderKey = "Authorization";
    private final static String ClaimsKey = "claims";
    @Nonnull
```

### MissortedModifiers
Missorted modifiers `final static`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNodeFactory.java`
#### Snippet
```java
        return validContentType;
    }
    private final static String validContentType = "text/plain";
    @Override
    @Nonnull
```

### MissortedModifiers
Missorted modifiers `final static`
in `components/authentication/azure/src/main/java/com/microsoft/kiota/authentication/AzureIdentityAccessTokenProvider.java`
#### Snippet
```java
        }
    }
    private final static String ClaimsKey = "claims";
    private final static String parentSpanKey = "parent-span";
    @Nonnull
```

### MissortedModifiers
Missorted modifiers `final static`
in `components/authentication/azure/src/main/java/com/microsoft/kiota/authentication/AzureIdentityAccessTokenProvider.java`
#### Snippet
```java
    }
    private final static String ClaimsKey = "claims";
    private final static String parentSpanKey = "parent-span";
    @Nonnull
    public CompletableFuture<String> getAuthorizationToken(@Nonnull final URI uri, @Nullable final Map<String, Object> additionalAuthenticationContext) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/UserAgentHandler.java`
#### Snippet
```java
        }
    }
    private final static String USER_AGENT_HEADER_NAME = "User-Agent";
    /* @inheritdoc */
    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/SerializationWriterFactoryRegistry.java`
#### Snippet
```java
    public SerializationWriterFactoryRegistry() {}
    /** Default singleton instance of the registry to be used when registering new factories that should be available by default. */
    public final static SerializationWriterFactoryRegistry defaultInstance = new SerializationWriterFactoryRegistry();
    /** List of factories that are registered by content type. */
    @Nonnull
```

### MissortedModifiers
Missorted modifiers `final static`
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonParseNodeFactory.java`
#### Snippet
```java
        return validContentType;
    }
    private final static String validContentType = "application/json";
    /** {@inheritDoc} */
    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
public class TextParseNode implements ParseNode {
    private final String text;
    private final static String NO_STRUCTURED_DATA_MESSAGE = "text does not support structured data";
    /**
     * Initializes a new instance of the {@link TextParseNode} class.
```

### MissortedModifiers
Missorted modifiers `final static`
in `components/abstractions/src/main/java/com/microsoft/kiota/authentication/ApiKeyAuthenticationProvider.java`
#### Snippet
```java
        this.validator = new AllowedHostsValidator(validHosts);
    }
    private final static String parentSpanKey = "parent-span";
    /** {@inheritDoc} */
    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextSerializationWriter.java`
#### Snippet
```java
/** Serialization writer implementation for text/plain */
public class TextSerializationWriter implements SerializationWriter {
    private final static String NO_STRUCTURED_DATA_MESSAGE = "text does not support structured data";
    private final ByteArrayOutputStream stream = new ByteArrayOutputStream();
    private final OutputStreamWriter writer;
```

### MissortedModifiers
Missorted modifiers `final static`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
    }
    private final static Pattern bearerPattern = Pattern.compile("^Bearer\\s.*", Pattern.CASE_INSENSITIVE);
    private final static Pattern claimsPattern = Pattern.compile("\\s?claims=\"([^\"]+)\"", Pattern.CASE_INSENSITIVE);
    /** Key used for events when an authentication challenge is returned by the API */
    @Nonnull
```

### MissortedModifiers
Missorted modifiers `final static`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
        }
    }
    private final static String claimsKey = "claims";
    private CompletableFuture<Response> getHttpResponseMessage(@Nonnull final RequestInformation requestInfo, @Nonnull final Span parentSpan, @Nonnull final Span spanForAttributes, @Nullable final String claims) {
        Objects.requireNonNull(requestInfo, "parameter requestInfo cannot be null");
```

### MissortedModifiers
Missorted modifiers `final static`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
        return null;
    }
    private final static Pattern bearerPattern = Pattern.compile("^Bearer\\s.*", Pattern.CASE_INSENSITIVE);
    private final static Pattern claimsPattern = Pattern.compile("\\s?claims=\"([^\"]+)\"", Pattern.CASE_INSENSITIVE);
    /** Key used for events when an authentication challenge is returned by the API */
```

### MissortedModifiers
Missorted modifiers `final static`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
/** RequestAdapter implementation for OkHttp */
public class OkHttpRequestAdapter implements com.microsoft.kiota.RequestAdapter {
    private final static String contentTypeHeaderKey = "Content-Type";
    @Nonnull
    private final OkHttpClient client;
```

### MissortedModifiers
Missorted modifiers `final static`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
        return null;
    }
    private final static Pattern queryParametersCleanupPattern = Pattern.compile("\\{\\?[^\\}]+}", Pattern.CASE_INSENSITIVE);
    private final char[] queryParametersToDecodeForTracing = {'-', '.', '~', '$'};
    private Span startSpan(@Nonnull final RequestInformation requestInfo, @Nonnull final String methodName) {
```

## RuleId[ruleID=NullableProblems]
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
    @Nullable
    public InputStream content;
    @Nonnull
    private final HashMap<String, RequestOption> requestOptions = new HashMap<>();
    /**
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
    public HashMap<String, Object> pathParameters = new HashMap<>();
    private URI uri;
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
        }
    }
    @Nonnull
    private static final String BINARY_CONTENT_TYPE = "application/octet-stream";
    @Nonnull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestInformation.java`
#### Snippet
```java
    private static String RAW_URL_KEY = "request-raw-url";
    /** The HTTP method for the request */
    @Nullable
    public HttpMethod httpMethod;

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

## RuleId[ruleID=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `ParseNodeHelper` has only 'static' members, and a 'public' constructor
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/ParseNodeHelper.java`
#### Snippet
```java

/** Utility methods to reduce the amount of code being generated. */
public class ParseNodeHelper {
	/** Default constructor */
	public ParseNodeHelper() {}
```

### UtilityClassWithPublicConstructor
Class `BackingStoreFactorySingleton` has only 'static' members, and a 'public' constructor
in `components/abstractions/src/main/java/com/microsoft/kiota/store/BackingStoreFactorySingleton.java`
#### Snippet
```java

/** This class is used to register the backing store factory. */
public class BackingStoreFactorySingleton {
    /** Default constructor */
    public BackingStoreFactorySingleton() {}
```

## RuleId[ruleID=InstanceofIncompatibleInterface]
### InstanceofIncompatibleInterface
'instanceof' incompatible interface `ValuedEnum`
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormSerializationWriter.java`
#### Snippet
```java
    }
    private <T extends Enum<T>> String getStringValueFromValuedEnum(final T value) {
        if(value instanceof ValuedEnum) {
            final ValuedEnum valued = (ValuedEnum)value;
            return valued.getValue();
```

### InstanceofIncompatibleInterface
'instanceof' incompatible interface `ValuedEnum`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextSerializationWriter.java`
#### Snippet
```java
    }
    private <T extends Enum<T>> String getStringValueFromValuedEnum(final T value) {
        if(value instanceof ValuedEnum) {
            final ValuedEnum valued = (ValuedEnum)value;
            return valued.getValue();
```

### InstanceofIncompatibleInterface
'instanceof' incompatible interface `ValuedEnum`
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonSerializationWriter.java`
#### Snippet
```java
    }
    private <T extends Enum<T>> String getStringValueFromValuedEnum(final T value) {
        if(value instanceof ValuedEnum) {
            final ValuedEnum valued = (ValuedEnum)value;
            return valued.getValue();
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `components/abstractions/src/main/java/com/microsoft/kiota/store/InMemoryBackingStore.java`
#### Snippet
```java
        for(final Map.Entry<String, Pair<Boolean, Object>> entry : this.store.entrySet()) {
            final Pair<Boolean, Object> wrapper = entry.getValue();
            final Pair<Boolean, Object> updatedValue = wrapper.setAt0(Boolean.valueOf(!value));
            entry.setValue(updatedValue);
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `components/abstractions/src/main/java/com/microsoft/kiota/store/InMemoryBackingStore.java`
#### Snippet
```java
    public <T> void set(@Nonnull final String key, @Nullable final T value) {
        Objects.requireNonNull(key);
        final Pair<Boolean, Object> valueToAdd = Pair.with(Boolean.valueOf(this.isInitializationCompleted), value);
        final Pair<Boolean, Object> oldValue = this.store.put(key, valueToAdd);
        for(final TriConsumer<String, Object, Object> callback : this.subscriptionStore.values()) {
```

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
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

## RuleId[ruleID=CharsetObjectCanBeUsed]
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
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormSerializationWriter.java`
#### Snippet
```java
    public FormSerializationWriter() {
        try {
            this.writer = new OutputStreamWriter(this.stream, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("could not create writer", e);
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
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonSerializationWriter.java`
#### Snippet
```java
    public JsonSerializationWriter() {
        try {
            this.writer = new JsonWriter(new OutputStreamWriter(this.stream, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("could not create json writer", e);
```

## RuleId[ruleID=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `components/abstractions/src/main/java/com/microsoft/kiota/store/InMemoryBackingStore.java`
#### Snippet
```java
            final Boolean hasChanged = wrapper.getValue0();
            if(!this.returnOnlyChangedValues ||
                (this.returnOnlyChangedValues && hasChanged != null && hasChanged.booleanValue())) {
                return wrapper.getValue1();
            }
```

## RuleId[ruleID=IfStatementWithIdenticalBranches]
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

## RuleId[ruleID=JavaLangImport]
### JavaLangImport
Unnecessary import from the 'java.lang' package
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/ParseNode.java`
#### Snippet
```java
package com.microsoft.kiota.serialization;

import java.lang.Enum;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/SerializationWriter.java`
#### Snippet
```java
import java.util.UUID;
import java.util.EnumSet;
import java.lang.Enum;
import java.math.BigDecimal;
import java.util.function.Consumer;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `components/abstractions/src/main/java/com/microsoft/kiota/store/InMemoryBackingStore.java`
#### Snippet
```java
package com.microsoft.kiota.store;

import java.lang.ClassCastException;

import java.util.List;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormSerializationWriter.java`
#### Snippet
```java
package com.microsoft.kiota.serialization;

import java.lang.Enum;
import java.math.BigDecimal;
import java.net.URLEncoder;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
package com.microsoft.kiota.serialization;

import java.lang.UnsupportedOperationException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `components/abstractions/src/main/java/com/microsoft/kiota/ApiClientBuilder.java`
#### Snippet
```java

import java.lang.reflect.InvocationTargetException;
import java.lang.NoSuchMethodException;

import java.util.Objects;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextSerializationWriter.java`
#### Snippet
```java
package com.microsoft.kiota.serialization;

import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.math.BigDecimal;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextSerializationWriter.java`
#### Snippet
```java

import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.math.BigDecimal;
import java.io.ByteArrayInputStream;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonSerializationWriter.java`
#### Snippet
```java
import com.microsoft.kiota.serialization.Parsable;

import java.lang.Enum;
import java.lang.reflect.Field;
import java.math.BigDecimal;
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
                        return encoded;
                    } else {
                        return encoded.replace("+", "%20");
                    }
                } catch (UnsupportedEncodingException e) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java

            private String escape(String v) {
                return v.replace("%", "%25").replaceAll("\\s", "%20");
            }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java

            private String escape(String v) {
                return v.replace("%", "%25").replaceAll("\\s", "%20");
            }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                        final Matcher matcher = bearerPattern.matcher(authenticateEntry);
                        if(matcher.matches()) {
                            rawHeaderValue = authenticateEntry.replaceFirst("^Bearer\\s", "");
                            break;
                        }
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.kiota` is unnecessary, and can be replaced with an import
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java

/** RequestAdapter implementation for OkHttp */
public class OkHttpRequestAdapter implements com.microsoft.kiota.RequestAdapter {
    private final static String contentTypeHeaderKey = "Content-Type";
    @Nonnull
```

## RuleId[ruleID=UNUSED_IMPORT]
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

## RuleId[ruleID=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import com.microsoft.kiota.authentication.AccessTokenProvider;`
in `components/authentication/azure/src/main/java/com/microsoft/kiota/authentication/AzureIdentityAccessTokenProvider.java`
#### Snippet
```java
import com.azure.core.credential.TokenRequestContext;

import com.microsoft.kiota.authentication.AccessTokenProvider;

import io.opentelemetry.api.trace.Span;
```

### SamePackageImport
Unnecessary import from the same package `import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;`
in `components/authentication/azure/src/main/java/com/microsoft/kiota/authentication/AzureIdentityAuthenticationProvider.java`
#### Snippet
```java

import com.azure.core.credential.TokenCredential;
import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;

/** Implementation of AuthenticationProvider that supports implementations of TokenCredential from Azure.Identity. */
```

### SamePackageImport
Unnecessary import from the same package `import com.microsoft.kiota.serialization.SerializationWriter;`
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonSerializationWriter.java`
#### Snippet
```java
package com.microsoft.kiota.serialization;

import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.ValuedEnum;
import com.microsoft.kiota.serialization.Parsable;
```

### SamePackageImport
Unnecessary import from the same package `import com.microsoft.kiota.serialization.ValuedEnum;`
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonSerializationWriter.java`
#### Snippet
```java

import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.ValuedEnum;
import com.microsoft.kiota.serialization.Parsable;

```

### SamePackageImport
Unnecessary import from the same package `import com.microsoft.kiota.serialization.Parsable;`
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonSerializationWriter.java`
#### Snippet
```java
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.ValuedEnum;
import com.microsoft.kiota.serialization.Parsable;

import java.lang.Enum;
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormSerializationWriter.java`
#### Snippet
```java
    public <T extends Enum<T>> void writeEnumSetValue(@Nullable final String key, @Nullable final EnumSet<T> values) {
        if(values != null && !values.isEmpty()) {
            final Optional<String> concatenatedValue = values.stream().map(v -> this.getStringValueFromValuedEnum(v)).reduce((x, y) -> { return x + "," + y; });
            if(concatenatedValue.isPresent()) {
                this.writeStringValue(key, concatenatedValue.get());
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonSerializationWriter.java`
#### Snippet
```java
    public <T extends Enum<T>> void writeEnumSetValue(@Nullable final String key, @Nullable final EnumSet<T> values) {
        if(values != null && !values.isEmpty()) {
            final Optional<String> concatenatedValue = values.stream().map(v -> this.getStringValueFromValuedEnum(v)).reduce((x, y) -> { return x + "," + y; });
            if(concatenatedValue.isPresent()) {
                this.writeStringValue(key, concatenatedValue.get());
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `SerializationWriterProxyFactory()` of an abstract class should not be declared 'public'
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/SerializationWriterProxyFactory.java`
#### Snippet
```java
     * @param onStartObjectSerialization the callback to invoke when the serialization of a model object starts.
     */
    public SerializationWriterProxyFactory(@Nonnull final SerializationWriterFactory concrete,
        @Nullable final Consumer<Parsable> onBeforeSerialization,
        @Nullable final Consumer<Parsable> onAfterSerialization,
```

### NonProtectedConstructorInAbstractClass
Constructor `ParseNodeProxyFactory()` of an abstract class should not be declared 'public'
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/ParseNodeProxyFactory.java`
#### Snippet
```java
     * @param onAfter the callback to invoke after the deserialization of any model object.
     */
    public ParseNodeProxyFactory(@Nonnull final ParseNodeFactory concrete,
        @Nullable final Consumer<Parsable> onBefore,
        @Nullable final Consumer<Parsable> onAfter) {
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormSerializationWriter.java`
#### Snippet
```java
    private final String encoding  = StandardCharsets.UTF_8.name();
    private boolean written;
    private int depth = 0;
    /** Instantiates a new FormSerializationWriter. */
    public FormSerializationWriter() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
        private char modifier = OPERATOR_NONE; // zero means no modifier
        private String varDelimiter;
        private boolean isQuerySegment = false;

        /**
```

## RuleId[ruleID=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `components/serialization/form/build.gradle`
#### Snippet
```java
apply from: "gradle/dependencies.gradle"

def pomConfig = {
    licenses {
        license([:]) {
```

### GroovyUnusedAssignment
Assignment is not used
in `components/serialization/form/build.gradle`
#### Snippet
```java
tasks.withType(Sign)*.enabled = mavenCentralPublishingEnabled.toBoolean()

def fixAscNames = { name -> 
    if(name.contains('pom')) {
        "${project.property('mavenArtifactId')}-${mavenMajorVersion}.${mavenMinorVersion}.${mavenPatchVersion}.pom.asc"
```

### GroovyUnusedAssignment
Assignment is not used
in `components/serialization/json/build.gradle`
#### Snippet
```java
apply from: "gradle/dependencies.gradle"

def pomConfig = {
    licenses {
        license([:]) {
```

### GroovyUnusedAssignment
Assignment is not used
in `components/serialization/json/build.gradle`
#### Snippet
```java
tasks.withType(Sign)*.enabled = mavenCentralPublishingEnabled.toBoolean()

def fixAscNames = { name -> 
    if(name.contains('pom')) {
        "${project.property('mavenArtifactId')}-${mavenMajorVersion}.${mavenMinorVersion}.${mavenPatchVersion}.pom.asc"
```

### GroovyUnusedAssignment
Assignment is not used
in `components/abstractions/build.gradle`
#### Snippet
```java
apply from: "gradle/dependencies.gradle"

def pomConfig = {
    licenses {
        license([:]) {
```

### GroovyUnusedAssignment
Assignment is not used
in `components/abstractions/build.gradle`
#### Snippet
```java
tasks.withType(Sign)*.enabled = mavenCentralPublishingEnabled.toBoolean()

def fixAscNames = { name -> 
    if(name.contains('pom')) {
        "${project.property('mavenArtifactId')}-${mavenMajorVersion}.${mavenMinorVersion}.${mavenPatchVersion}.pom.asc"
```

### GroovyUnusedAssignment
Assignment is not used
in `components/authentication/azure/build.gradle`
#### Snippet
```java
apply from: "gradle/dependencies.gradle"

def pomConfig = {
    licenses {
        license([:]) {
```

### GroovyUnusedAssignment
Assignment is not used
in `components/authentication/azure/build.gradle`
#### Snippet
```java
tasks.withType(Sign)*.enabled = mavenCentralPublishingEnabled.toBoolean()

def fixAscNames = { name -> 
    if(name.contains('pom')) {
        "${project.property('mavenArtifactId')}-${mavenMajorVersion}.${mavenMinorVersion}.${mavenPatchVersion}.pom.asc"
```

### GroovyUnusedAssignment
Assignment is not used
in `components/serialization/text/build.gradle`
#### Snippet
```java
apply from: "gradle/dependencies.gradle"

def pomConfig = {
    licenses {
        license([:]) {
```

### GroovyUnusedAssignment
Assignment is not used
in `components/serialization/text/build.gradle`
#### Snippet
```java
tasks.withType(Sign)*.enabled = mavenCentralPublishingEnabled.toBoolean()

def fixAscNames = { name -> 
    if(name.contains('pom')) {
        "${project.property('mavenArtifactId')}-${mavenMajorVersion}.${mavenMinorVersion}.${mavenPatchVersion}.pom.asc"
```

### GroovyUnusedAssignment
Assignment is not used
in `components/http/okHttp/build.gradle`
#### Snippet
```java
apply from: "gradle/dependencies.gradle"

def pomConfig = {
    licenses {
        license([:]) {
```

### GroovyUnusedAssignment
Assignment is not used
in `components/http/okHttp/build.gradle`
#### Snippet
```java
tasks.withType(Sign)*.enabled = mavenCentralPublishingEnabled.toBoolean()

def fixAscNames = { name -> 
    if(name.contains('pom')) {
        "${project.property('mavenArtifactId')}-${mavenMajorVersion}.${mavenMinorVersion}.${mavenPatchVersion}.pom.asc"
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `result`
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
                        int subResult = Integer.parseInt(modifierStr.trim(), 10);
                        if (subResult < len) {
                            result = result.substring(0, subResult);
                        }
                    } catch (NumberFormatException e) {
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
                        }
                    } catch (NumberFormatException e) {
                        result = ":" + modifierStr;
                    }
                }
```

## RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
            if(split.length == 2) {
                if(fields.containsKey(key))
                    fields.put(key, fields.get(key).concat("," + split[1].trim()));
                else
                    fields.put(key, split[1].trim());
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `components/abstractions/src/main/java/com/microsoft/kiota/store/InMemoryBackingStore.java`
#### Snippet
```java
            }
        }
        return null;
    }
    @SuppressWarnings("unchecked")
```

### ReturnNull
Return of `null`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RedirectHandler.java`
#### Snippet
```java
            final Response userResponse) throws ProtocolException {
        String location = userResponse.header("Location");
        if (location == null || location.length() == 0) return null;

        // For relative URL in location header, the new url to redirect is relative to original request
```

### ReturnNull
Return of `null`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RedirectHandler.java`
#### Snippet
```java

        // Don't follow redirects to unsupported protocols.
        if (locationUrl == null) return null;

        // Most redirects don't include a request body.
```

### ReturnNull
Return of `null`
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormSerializationWriter.java`
#### Snippet
```java
            final ValuedEnum valued = (ValuedEnum)value;
            return valued.getValue();
        } else return null;
    }
    @Nonnull
```

### ReturnNull
Return of `null`
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonParseNode.java`
#### Snippet
```java
            return (T)targetEnum.getMethod("forValue", String.class).invoke(null, rawValue);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | SecurityException ex) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonParseNode.java`
#### Snippet
```java
                throw new RuntimeException("Could not get the value during deserialization, unknown primitive type");
        } else if(element.isJsonNull())
            return null;
        else if (element.isJsonObject() || element.isJsonArray())
            return element;
```

### ReturnNull
Return of `null`
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
            return (T)targetEnum.getMethod("forValue", String.class).invoke(null, rawValue);
        } catch (SecurityException | IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
            return (T)targetEnum.getMethod("forValue", String.class).invoke(null, rawValue);
        } catch (SecurityException | IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextSerializationWriter.java`
#### Snippet
```java
            final ValuedEnum valued = (ValuedEnum)value;
            return valued.getValue();
        } else return null;
    }
    @Nonnull
```

### ReturnNull
Return of `null`
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonSerializationWriter.java`
#### Snippet
```java
            final ValuedEnum valued = (ValuedEnum)value;
            return valued.getValue();
        } else return null;
    }
    @Nonnull
```

### ReturnNull
Return of `null`
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
                    switch (operator) {
                        case SLASH_OPERATOR:
                            return null;
                        default:
                            return "";
```

### ReturnNull
Return of `null`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                }
            }
            return null;
    }
    private void setBaseUrlForRequestInformation(@Nonnull final RequestInformation requestInfo) {
```

### ReturnNull
Return of `null`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
            }
        }
        return null;
    }
    private final static Pattern queryParametersCleanupPattern = Pattern.compile("\\{\\?[^\\}]+}", Pattern.CASE_INSENSITIVE);
```

### ReturnNull
Return of `null`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
            }
        }
        return null;
    }
    private final static Pattern bearerPattern = Pattern.compile("^Bearer\\s.*", Pattern.CASE_INSENSITIVE);
```

## RuleId[ruleID=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer buffer` may be declared as 'StringBuilder'
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormSerializationWriter.java`
#### Snippet
```java
    public <T extends Enum<T>> void writeCollectionOfEnumValues(@Nullable final String key, @Nullable final Iterable<T> values) {
        if(values != null) { //empty array is meaningful
            final StringBuffer buffer = new StringBuffer();
            int writtenValuesCount = -1;
            for (final T t : values) {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
     */
    protected UriTemplate(CharSequence templateString) {
        this(templateString, new Object[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
     */
    public UriTemplate nest(CharSequence uriTemplate) {
        return nest(uriTemplate, new Object[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                            return null;
                        } else {
                            final String contentType = contentTypes.toArray(new String[]{})[0];
                            spanForAttributes.setAttribute("http.request_content_type", contentType);
                            return MediaType.parse(contentType);
```

## RuleId[ruleID=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonParseNode.java`
#### Snippet
```java
                            final Consumer<Parsable> onBefore = _this.getOnBeforeAssignFieldValues();
                            final Consumer<Parsable> onAfter = _this.getOnAfterAssignFieldValues();
                            final JsonParseNode itemNode = new JsonParseNode(item) {{
                                this.setOnBeforeAssignFieldValues(onBefore);
                                this.setOnAfterAssignFieldValues(onAfter);
```

### DoubleBraceInitialization
Double brace initialization
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonParseNode.java`
#### Snippet
```java
                            final Consumer<Parsable> onBefore = _this.getOnBeforeAssignFieldValues();
                            final Consumer<Parsable> onAfter = _this.getOnAfterAssignFieldValues();
                            final JsonParseNode itemNode = new JsonParseNode(item) {{
                                this.setOnBeforeAssignFieldValues(onBefore);
                                this.setOnAfterAssignFieldValues(onAfter);
```

### DoubleBraceInitialization
Double brace initialization
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonParseNode.java`
#### Snippet
```java
                            final Consumer<Parsable> onBefore = _this.getOnBeforeAssignFieldValues();
                            final Consumer<Parsable> onAfter = _this.getOnAfterAssignFieldValues();
                            final JsonParseNode itemNode = new JsonParseNode(item) {{
                                this.setOnBeforeAssignFieldValues(onBefore);
                                this.setOnAfterAssignFieldValues(onAfter);
```

### DoubleBraceInitialization
Double brace initialization
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonParseNode.java`
#### Snippet
```java
                    final Consumer<Parsable> onBefore = this.onBeforeAssignFieldValues;
                    final Consumer<Parsable> onAfter = this.onAfterAssignFieldValues;
                    fieldDeserializer.accept(new JsonParseNode(fieldValue) {{
                        this.setOnBeforeAssignFieldValues(onBefore);
                        this.setOnAfterAssignFieldValues(onAfter);
```

### DoubleBraceInitialization
Double brace initialization
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonParseNode.java`
#### Snippet
```java
            final Consumer<Parsable> onBefore = this.onBeforeAssignFieldValues;
            final Consumer<Parsable> onAfter = this.onAfterAssignFieldValues;
            return new JsonParseNode(object.get(identifier)) {{
                this.setOnBeforeAssignFieldValues(onBefore);
                this.setOnAfterAssignFieldValues(onAfter);
```

### DoubleBraceInitialization
Double brace initialization
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
                        final Consumer<Parsable> onBefore = _this.getOnBeforeAssignFieldValues();
                        final Consumer<Parsable> onAfter = _this.getOnAfterAssignFieldValues();
                        final FormParseNode itemNode = new FormParseNode(item) {{
                            this.setOnBeforeAssignFieldValues(onBefore);
                            this.setOnAfterAssignFieldValues(onAfter);
```

### DoubleBraceInitialization
Double brace initialization
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
                    final Consumer<Parsable> onBefore = this.onBeforeAssignFieldValues;
                    final Consumer<Parsable> onAfter = this.onAfterAssignFieldValues;
                    fieldDeserializer.accept(new FormParseNode(fieldValue) {{
                        this.setOnBeforeAssignFieldValues(onBefore);
                        this.setOnAfterAssignFieldValues(onAfter);
```

### DoubleBraceInitialization
Double brace initialization
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                        }
                    } catch(ApiException ex) {
                        return new CompletableFuture<List<ModelType>>(){{
                            this.completeExceptionally(ex);
                        }};
```

### DoubleBraceInitialization
Double brace initialization
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                        }
                    } catch(ApiException ex) {
                        return new CompletableFuture<ModelType>(){{
                            this.completeExceptionally(ex);
                        }};
```

### DoubleBraceInitialization
Double brace initialization
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                    } catch(ApiException ex) {
                        span.recordException(ex);
                        return new CompletableFuture<ModelType>(){{
                            this.completeExceptionally(ex);
                        }};
```

### DoubleBraceInitialization
Double brace initialization
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                        }};
                    } catch(IOException ex) {
                        return new CompletableFuture<List<ModelType>>(){{
                            this.completeExceptionally(new RuntimeException("failed to read the response body", ex));
                        }};
```

### DoubleBraceInitialization
Double brace initialization
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                        }};
                    } catch(IOException ex) {
                        return new CompletableFuture<ModelType>(){{
                            this.completeExceptionally(new RuntimeException("failed to read the response body", ex));
                        }};
```

### DoubleBraceInitialization
Double brace initialization
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                        }};
                    } catch(IOException ex) {
                        return new CompletableFuture<List<ModelType>>(){{
                            this.completeExceptionally(new RuntimeException("failed to read the response body", ex));
                        }};
```

### DoubleBraceInitialization
Double brace initialization
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                        }};
                    } catch(IOException ex) {
                        return new CompletableFuture<List<ModelType>>(){{
                            this.completeExceptionally(new RuntimeException("failed to read the response body", ex));
                        }};
```

### DoubleBraceInitialization
Double brace initialization
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                    } catch (IOException ex) {
                        spanForAttributes.recordException(ex);
                        return new CompletableFuture<Response>(){{
                            this.completeExceptionally(ex);
                        }};
```

### DoubleBraceInitialization
Double brace initialization
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                        }
                    } catch(ApiException ex) {
                        return new CompletableFuture<List<ModelType>>(){{
                            this.completeExceptionally(ex);
                        }};
```

### DoubleBraceInitialization
Double brace initialization
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                        }};
                    } catch(IOException ex) {
                        return new CompletableFuture<ModelType>(){{
                            this.completeExceptionally(new RuntimeException("failed to read the response body", ex));
                        }};
```

### DoubleBraceInitialization
Double brace initialization
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                    } catch(IOException ex) {
                        span.recordException(ex);
                        return new CompletableFuture<ModelType>(){{
                            this.completeExceptionally(new RuntimeException("failed to read the response body", ex));
                        }};
```

### DoubleBraceInitialization
Double brace initialization
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                        }
                    } catch(ApiException ex) {
                        return new CompletableFuture<List<ModelType>>(){{
                            this.completeExceptionally(ex);
                        }};
```

### DoubleBraceInitialization
Double brace initialization
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
        try(final Scope scope = span.makeCurrent()) {
            this.setBaseUrlForRequestInformation(requestInfo);
            final Map<String, Object> additionalContext = new HashMap<String, Object>() {{
                put("parent-span", span);
            }};
```

### DoubleBraceInitialization
Double brace initialization
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                        }
                    } catch(ApiException ex) {
                        return new CompletableFuture<ModelType>(){{
                            this.completeExceptionally(ex);
                        }};
```

## RuleId[ruleID=UnusedAssignment]
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
Variable `shouldRetry` initializer `false` is redundant
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java
        }

        boolean shouldRetry = false;
        // Status codes 429 503 504
        int statusCode = response.code();
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `components/abstractions/src/main/java/com/microsoft/kiota/UriTemplate.java`
#### Snippet
```java
                if (found != null && !(isOptional && !((Optional) found).isPresent())) {
                    if (isOptional) {
                        found = ((Optional) found).get();
                    }
                    String prefixToUse = prefix;
```

## RuleId[ruleID=UseBulkOperation]
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

## RuleId[ruleID=ConstantValue]
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

## RuleId[ruleID=CastCanBeRemovedNarrowingVariableType]
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

