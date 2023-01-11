# kiota-java 
 
# Bad smells
I found 234 bad smells with 17 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ConstantValue | 31 | false |
| DataFlowIssue | 24 | false |
| NullableProblems | 22 | false |
| DoubleBraceInitialization | 21 | false |
| MissortedModifiers | 17 | false |
| ReturnNull | 16 | false |
| BoundedWildcard | 12 | false |
| GroovyUnusedAssignment | 12 | false |
| SamePackageImport | 11 | false |
| JavaLangImport | 9 | false |
| UNUSED_IMPORT | 8 | false |
| SizeReplaceableByIsEmpty | 5 | true |
| StringOperationCanBeSimplified | 4 | false |
| UnusedAssignment | 4 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| Convert2MethodRef | 3 | false |
| InstanceofIncompatibleInterface | 3 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| OptionalIsPresent | 2 | false |
| UnnecessaryModifier | 2 | true |
| RedundantArrayCreation | 2 | true |
| UnnecessaryBoxing | 2 | false |
| CodeBlock2Expr | 2 | true |
| NonProtectedConstructorInAbstractClass | 2 | true |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| RedundantLengthCheck | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| MethodOverloadsParentMethod | 1 | false |
| RegExpRedundantEscape | 1 | false |
| IgnoreResultOfCall | 1 | false |
| UnnecessaryUnboxing | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| RedundantFieldInitialization | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| ZeroLengthArrayInitialization | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[ruleID=WrapperTypeMayBePrimitive]
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
public @interface QueryParameter {
    /** The name of the parameter in the template */
    public String name();
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
Class `ParseNodeHelper` has only 'static' members, and lacks a 'private' constructor
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/ParseNodeHelper.java`
#### Snippet
```java
import javax.annotation.Nonnull;

public class ParseNodeHelper {
	/**
	 * Merges the given fields deserializers for an intersection type into a single collection.
```

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
Class `BackingStoreFactorySingleton` has only 'static' members, and lacks a 'private' constructor
in `components/abstractions/src/main/java/com/microsoft/kiota/store/BackingStoreFactorySingleton.java`
#### Snippet
```java

/** This class is used to register the backing store factory. */
public class BackingStoreFactorySingleton {
    /** The backing store factory singleton instance. */
    @Nonnull
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
Expression `headers.put(normalizeKey(key), new HashSet<>(value))` might evaluate to null but is returned by the method declared as @Nonnull
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestHeaders.java`
#### Snippet
```java
        Objects.requireNonNull(key);
        Objects.requireNonNull(value);
        return headers.put(normalizeKey(key), new HashSet<>(value));
    }
    @Override
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
    public Byte getByteValue() {
        try {
            return Byte.parseByte(getStringValue());
        } catch (final NumberFormatException ex) {
            return null;
```

### DataFlowIssue
`null` is returned by the method declared as @Nonnull
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
            result.setOnAfterAssignFieldValues(onAfter);
            return result;
        } else return null;
    }
    @Nullable
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
    public BigDecimal getBigDecimalValue() {
        try {
            return new BigDecimal(getStringValue());
        } catch (final NumberFormatException ex) {
            return null;
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
    public OffsetDateTime getOffsetDateTimeValue() {
        return OffsetDateTime.parse(this.getStringValue());
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
`null` is returned by the method declared as @Nonnull
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonParseNode.java`
#### Snippet
```java
                this.setOnAfterAssignFieldValues(onAfter);
            }};
        } else return null;
    }
    @Nullable
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

### DataFlowIssue
Argument `body.contentType()` might be null
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
            }
            final InputStream rawInputStream = body.byteStream();
            final ParseNode rootNode = pNodeFactory.getParseNode(getMediaTypeAndSubType(body.contentType()), rawInputStream);
            return rootNode;
        } finally {
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
        final Span span = GlobalOpenTelemetry.getTracer(obsOptions.GetTracerInstrumentationName()).spanBuilder("getRequestFromRequestInformation").setParent(Context.current().with(parentSpan)).startSpan();
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

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`new String()` is redundant
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/ParametersNameDecodingHandler.java`
#### Snippet
```java
    public static String decodeQueryParameters(@Nullable final String original, @Nonnull final char[] charactersToDecode) {
        Objects.requireNonNull(charactersToDecode);
        String decoded = original == null ? new String() : new String(original);
        final ArrayList<SimpleEntry<String, String>> symbolsToReplace = new ArrayList<SimpleEntry<String, String>>(charactersToDecode.length);
        for (final char charToReplace : charactersToDecode) {
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/ParametersNameDecodingHandler.java`
#### Snippet
```java
    public static String decodeQueryParameters(@Nullable final String original, @Nonnull final char[] charactersToDecode) {
        Objects.requireNonNull(charactersToDecode);
        String decoded = original == null ? new String() : new String(original);
        final ArrayList<SimpleEntry<String, String>> symbolsToReplace = new ArrayList<SimpleEntry<String, String>>(charactersToDecode.length);
        for (final char charToReplace : charactersToDecode) {
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

## RuleId[ruleID=RegExpRedundantEscape]
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

## RuleId[ruleID=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `components/authentication/azure/src/main/java/com/microsoft/kiota/authentication/AzureIdentityAccessTokenProvider.java`
#### Snippet
```java
            _scopes = new ArrayList<String>();
        } else if(scopes.length == 0) {
            _scopes = Arrays.asList(new String[] { "https://graph.microsoft.com/.default" });
        } else {
            _scopes = Arrays.asList(scopes);
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `components/authentication/azure/src/main/java/com/microsoft/kiota/authentication/AzureIdentityAccessTokenProvider.java`
#### Snippet
```java
        }
        if (allowedHosts == null || allowedHosts.length == 0) {
            _hostValidator = new AllowedHostsValidator(new String[] { "graph.microsoft.com", "graph.microsoft.us", "dod-graph.microsoft.us", "graph.microsoft.de", "microsoftgraph.chinacloudapi.cn", "canary.graph.microsoft.com" });
        } else {
            _hostValidator = new AllowedHostsValidator(allowedHosts);
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

## RuleId[ruleID=BoundedWildcard]
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
Can generalize to `? extends ParsableFactory`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
    @Nonnull
    public static final String errorBodyFoundAttributeName = "com.microsoft.kiota.error_body_found";
    private Response throwIfFailedResponse(@Nonnull final Response response, @Nonnull final Span spanForAttributes, @Nullable final HashMap<String, ParsableFactory<? extends Parsable>> errorMappings) throws IOException, ApiException {
        final Span span = GlobalOpenTelemetry.getTracer(obsOptions.GetTracerInstrumentationName()).spanBuilder("throwIfFailedResponse").setParent(Context.current().with(spanForAttributes)).startSpan();
        try(final Scope scope = span.makeCurrent()) {
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
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/SerializationWriterFactoryRegistry.java`
#### Snippet
```java
public class SerializationWriterFactoryRegistry implements SerializationWriterFactory {
    /** Default singleton instance of the registry to be used when registering new factories that should be available by default. */
    public final static SerializationWriterFactoryRegistry defaultInstance = new SerializationWriterFactoryRegistry();
    /** List of factories that are registered by content type. */
    @Nonnull
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
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextSerializationWriter.java`
#### Snippet
```java

public class TextSerializationWriter implements SerializationWriter {
    private final static String NoStructuredDataMessage = "text does not support structured data";
    private final ByteArrayOutputStream stream = new ByteArrayOutputStream();
    private final OutputStreamWriter writer;
```

### MissortedModifiers
Missorted modifiers `final static`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
public class TextParseNode implements ParseNode {
    private final String text;
    private final static String NoStructuredDataMessage = "text does not support structured data";
    public TextParseNode(@Nonnull final String rawText) {
        Objects.requireNonNull(rawText, "parameter node cannot be null");
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
    @Nonnull
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

public class OkHttpRequestAdapter implements com.microsoft.kiota.RequestAdapter {
    private final static String contentTypeHeaderKey = "Content-Type";
    private final OkHttpClient client;
    private final AuthenticationProvider authProvider;
```

### MissortedModifiers
Missorted modifiers `final static`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
    }
    private final static Pattern bearerPattern = Pattern.compile("^Bearer\\s.*", Pattern.CASE_INSENSITIVE);
    private final static Pattern claimsPattern = Pattern.compile("\\s?claims=\"([^\"]+)\"", Pattern.CASE_INSENSITIVE);
    @Nonnull
    public static final String authenticateChallengedEventKey = "com.microsoft.kiota.authenticate_challenge_received";
```

## RuleId[ruleID=NullableProblems]
### NullableProblems
Overridden methods are not annotated
in `components/abstractions/src/main/java/com/microsoft/kiota/serialization/ParseNode.java`
#### Snippet
```java
     * @return the model object value of the node.
     */
    @Nonnull
    <T extends Parsable> T getObjectValue(@Nonnull final ParsableFactory<T> factory);
    /**
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
public class RequestInformation {
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
    private static String RAW_URL_KEY = "request-raw-url";
    /** The HTTP method for the request */
    @Nullable
    public HttpMethod httpMethod;

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
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `components/abstractions/src/main/java/com/microsoft/kiota/store/BackingStoreFactorySingleton.java`
#### Snippet
```java
public class BackingStoreFactorySingleton {
    /** The backing store factory singleton instance. */
    @Nonnull
    public static BackingStoreFactory instance = new InMemoryBackingStoreFactory();
}
```

### NullableProblems
Method annotated with @Nullable must not override @Nonnull method
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
        throw new UnsupportedOperationException(NoStructuredDataMessage);
    }
    @Nullable
    public <T extends Parsable> T getObjectValue(@Nonnull final ParsableFactory<T> factory) {
        throw new UnsupportedOperationException(NoStructuredDataMessage);
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

## RuleId[ruleID=UnnecessaryBoxing]
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

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `String.concat()` is ignored
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
            if(split.length == 2) {
                if(fields.containsKey(key))
                    fields.get(key).concat("," + split[1].trim());
                else
                    fields.put(key, split[1].trim());
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
import com.microsoft.kiota.serialization.Parsable;

import java.lang.Enum;
import java.lang.reflect.Field;
import java.lang.UnsupportedOperationException;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextSerializationWriter.java`
#### Snippet
```java
import java.lang.Enum;
import java.lang.reflect.Field;
import java.lang.UnsupportedOperationException;
import java.math.BigDecimal;
import java.io.ByteArrayInputStream;
```

### JavaLangImport
Unnecessary import from the 'java.lang' package
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
import com.google.common.collect.Lists;

import java.lang.UnsupportedOperationException;
import java.math.BigDecimal;
import java.time.LocalDate;
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
import io.opentelemetry.context.Context;

public class OkHttpRequestAdapter implements com.microsoft.kiota.RequestAdapter {
    private final static String contentTypeHeaderKey = "Content-Type";
    private final OkHttpClient client;
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

### UNUSED_IMPORT
Unused import `import com.google.common.collect.Lists;`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
package com.microsoft.kiota.serialization;

import com.google.common.collect.Lists;

import java.lang.UnsupportedOperationException;
```

### UNUSED_IMPORT
Unused import `import java.util.Iterator;`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
import java.util.Base64;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
```

### UNUSED_IMPORT
Unused import `import java.util.function.BiConsumer;`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
import java.util.Objects;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

```

### UNUSED_IMPORT
Unused import `import com.microsoft.kiota.serialization.AdditionalDataHolder;`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.AdditionalDataHolder;

import javax.annotation.Nonnull;
```

### UNUSED_IMPORT
Unused import `import java.lang.reflect.Field;`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextSerializationWriter.java`
#### Snippet
```java

import java.lang.Enum;
import java.lang.reflect.Field;
import java.lang.UnsupportedOperationException;
import java.math.BigDecimal;
```

### UNUSED_IMPORT
Unused import `import java.util.Optional;`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextSerializationWriter.java`
#### Snippet
```java
import java.util.EnumSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;
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
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextSerializationWriter.java`
#### Snippet
```java
package com.microsoft.kiota.serialization;

import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.ValuedEnum;
import com.microsoft.kiota.serialization.Parsable;
```

### SamePackageImport
Unnecessary import from the same package `import com.microsoft.kiota.serialization.ValuedEnum;`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextSerializationWriter.java`
#### Snippet
```java

import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.ValuedEnum;
import com.microsoft.kiota.serialization.Parsable;

```

### SamePackageImport
Unnecessary import from the same package `import com.microsoft.kiota.serialization.Parsable;`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextSerializationWriter.java`
#### Snippet
```java
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.ValuedEnum;
import com.microsoft.kiota.serialization.Parsable;

import java.lang.Enum;
```

### SamePackageImport
Unnecessary import from the same package `import com.microsoft.kiota.serialization.ParseNode;`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
import java.util.function.Consumer;

import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
```

### SamePackageImport
Unnecessary import from the same package `import com.microsoft.kiota.serialization.Parsable;`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java

import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.AdditionalDataHolder;

```

### SamePackageImport
Unnecessary import from the same package `import com.microsoft.kiota.serialization.AdditionalDataHolder;`
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.AdditionalDataHolder;

import javax.annotation.Nonnull;
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

## RuleId[ruleID=GroovyUnusedAssignment]
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

## RuleId[ruleID=ReturnNull]
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
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
            result.setOnAfterAssignFieldValues(onAfter);
            return result;
        } else return null;
    }
    @Nullable
```

### ReturnNull
Return of `null`
in `components/serialization/form/src/main/java/com/microsoft/kiota/serialization/FormParseNode.java`
#### Snippet
```java
            return (T)targetEnum.getMethod("forValue", String.class).invoke(null, rawValue);
        } catch (Exception ex) {
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
in `components/serialization/text/src/main/java/com/microsoft/kiota/serialization/TextParseNode.java`
#### Snippet
```java
            return (T)targetEnum.getMethod("forValue", String.class).invoke(null, rawValue);
        } catch (Exception ex) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonParseNode.java`
#### Snippet
```java
            return (T)targetEnum.getMethod("forValue", String.class).invoke(null, rawValue);
        } catch (Exception ex) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `components/serialization/json/src/main/java/com/microsoft/kiota/serialization/JsonParseNode.java`
#### Snippet
```java
                this.setOnAfterAssignFieldValues(onAfter);
            }};
        } else return null;
    }
    @Nullable
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
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
            final ResponseBody body = response.body(); // closing the response closes the body and stream https://square.github.io/okhttp/4.x/okhttp/okhttp3/-response-body/
            if(body == null) {
                return null;
            }
            final InputStream rawInputStream = body.byteStream();
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

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `rootNode` is redundant
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
            }
            final InputStream rawInputStream = body.byteStream();
            final ParseNode rootNode = pNodeFactory.getParseNode(getMediaTypeAndSubType(body.contentType()), rawInputStream);
            return rootNode;
        } finally {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
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
in `components/abstractions/src/main/java/com/microsoft/kiota/RequestInformation.java`
#### Snippet
```java

            final URITemplate template = new URITemplate(urlTemplate)
                            .expandOnly(new HashMap<String, Object>(queryParameters) {{
                                putAll(pathParameters);
                            }});
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
                    } catch (IOException ex) {
                        spanForAttributes.recordException(ex);
                        return new CompletableFuture<Response>(){{
                            this.completeExceptionally(ex);
                        }};
```

## RuleId[ruleID=UnusedAssignment]
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
Condition `retryAfterHeader == null` is always `true`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java
                retryDelay = tryParseDateHeader(retryAfterHeader);
            }
        } else if( retryAfterHeader == null || retryDelay == -1) {
            retryDelay = exponentialBackOffDelay(delay, executionCount);
        }
```

### ConstantValue
Condition `retryAfterHeader == null || retryDelay == -1` is always `true`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java
                retryDelay = tryParseDateHeader(retryAfterHeader);
            }
        } else if( retryAfterHeader == null || retryDelay == -1) {
            retryDelay = exponentialBackOffDelay(delay, executionCount);
        }
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
Condition `retryOption != null` is always `true`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java
        // without any retry attempt.
        shouldRetry =
                retryOption != null
                        && executionCount <= retryOption.maxRetries()
                        && checkStatus(statusCode) && isBuffered(request)
```

### ConstantValue
Condition `shouldRetryCallback != null` is always `true`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/middleware/RetryHandler.java`
#### Snippet
```java
                        && executionCount <= retryOption.maxRetries()
                        && checkStatus(statusCode) && isBuffered(request)
                        && shouldRetryCallback != null
                        && shouldRetryCallback.shouldRetry(retryOption.delay(), executionCount, request, response);

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
        } else if(scopes.length == 0) {
```

### ConstantValue
Condition `allowedHosts == null` is always `false`
in `components/authentication/azure/src/main/java/com/microsoft/kiota/authentication/AzureIdentityAccessTokenProvider.java`
#### Snippet
```java
            _scopes = Arrays.asList(scopes);
        }
        if (allowedHosts == null || allowedHosts.length == 0) {
            _hostValidator = new AllowedHostsValidator(new String[] { "graph.microsoft.com", "graph.microsoft.us", "dod-graph.microsoft.us", "graph.microsoft.de", "microsoftgraph.chinacloudapi.cn", "canary.graph.microsoft.com" });
        } else {
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
Condition `requestBuilder.tag(obsOptions.getType()) == null` is always `false`
in `components/http/okHttp/src/main/java/com/microsoft/kiota/http/OkHttpRequestAdapter.java`
#### Snippet
```java
                requestBuilder.tag(option.getType(), option);
            }
            if (requestBuilder.tag(obsOptions.getType()) == null) {
                requestBuilder.tag(obsOptions.getType(), obsOptions);
            }
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

