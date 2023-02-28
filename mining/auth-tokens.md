# auth-tokens 
 
# Bad smells
I found 15 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalUsedAsFieldOrParameterType | 4 | false |
| OptionalContainsCollection | 4 | false |
| AbstractClassNeverImplemented | 3 | false |
| OptionalIsPresent | 2 | false |
| BoundedWildcard | 2 | false |
## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parsedJwt'
in `auth-tokens-filter/src/main/java/com/palantir/tokens/auth/http/Utilities.java`
#### Snippet
```java
    /** Writes to both the MDC and ContainerRequestContext. */
    static void recordUnverifiedJwt(
            ContainerRequestContext requestContext, Optional<UnverifiedJsonWebToken> parsedJwt) {
        if (parsedJwt.isPresent()) {
            UnverifiedJsonWebToken jwt = parsedJwt.get();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value'
in `auth-tokens-filter/src/main/java/com/palantir/tokens/auth/http/Utilities.java`
#### Snippet
```java
    }

    private static void setUnverifiedContext(ContainerRequestContext requestContext, Key key, Optional<String> value) {
        if (value.isPresent()) {
            setUnverifiedContext(requestContext, key, value.get());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parsedJwt'
in `auth-tokens-filter-jakarta/src/main/java/com/palantir/tokens/auth/http/Utilities.java`
#### Snippet
```java
    /** Writes to both the MDC and ContainerRequestContext. */
    static void recordUnverifiedJwt(
            ContainerRequestContext requestContext, Optional<UnverifiedJsonWebToken> parsedJwt) {
        if (parsedJwt.isPresent()) {
            UnverifiedJsonWebToken jwt = parsedJwt.get();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value'
in `auth-tokens-filter-jakarta/src/main/java/com/palantir/tokens/auth/http/Utilities.java`
#### Snippet
```java
    }

    private static void setUnverifiedContext(ContainerRequestContext requestContext, Key key, Optional<String> value) {
        if (value.isPresent()) {
            setUnverifiedContext(requestContext, key, value.get());
```

## RuleId[ruleID=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `auth-tokens-filter/src/main/java/com/palantir/tokens/auth/http/Utilities.java`
#### Snippet
```java

    private static void setUnverifiedContext(ContainerRequestContext requestContext, Key key, Optional<String> value) {
        if (value.isPresent()) {
            setUnverifiedContext(requestContext, key, value.get());
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `auth-tokens-filter-jakarta/src/main/java/com/palantir/tokens/auth/http/Utilities.java`
#### Snippet
```java

    private static void setUnverifiedContext(ContainerRequestContext requestContext, Key key, Optional<String> value) {
        if (value.isPresent()) {
            setUnverifiedContext(requestContext, key, value.get());
        }
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends UnverifiedJsonWebToken`
in `auth-tokens-filter/src/main/java/com/palantir/tokens/auth/http/Utilities.java`
#### Snippet
```java
    /** Writes to both the MDC and ContainerRequestContext. */
    static void recordUnverifiedJwt(
            ContainerRequestContext requestContext, Optional<UnverifiedJsonWebToken> parsedJwt) {
        if (parsedJwt.isPresent()) {
            UnverifiedJsonWebToken jwt = parsedJwt.get();
```

### BoundedWildcard
Can generalize to `? extends UnverifiedJsonWebToken`
in `auth-tokens-filter-jakarta/src/main/java/com/palantir/tokens/auth/http/Utilities.java`
#### Snippet
```java
    /** Writes to both the MDC and ContainerRequestContext. */
    static void recordUnverifiedJwt(
            ContainerRequestContext requestContext, Optional<UnverifiedJsonWebToken> parsedJwt) {
        if (parsedJwt.isPresent()) {
            UnverifiedJsonWebToken jwt = parsedJwt.get();
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `BearerToken` has no concrete subclass
in `auth-tokens/src/main/java/com/palantir/tokens/auth/BearerToken.java`
#### Snippet
```java
@Value.Immutable
@ImmutablesStyle
public abstract class BearerToken {

    private static final String VALIDATION_PATTERN_STRING = "^[A-Za-z0-9\\-\\._~\\+/]+=*$";
```

### AbstractClassNeverImplemented
Abstract class `UnverifiedJsonWebToken` has no concrete subclass
in `auth-tokens/src/main/java/com/palantir/tokens/auth/UnverifiedJsonWebToken.java`
#### Snippet
```java
@Value.Immutable
@ImmutablesStyle
public abstract class UnverifiedJsonWebToken {

    private static final ObjectReader READER = new ObjectMapper()
```

### AbstractClassNeverImplemented
Abstract class `AuthHeader` has no concrete subclass
in `auth-tokens/src/main/java/com/palantir/tokens/auth/AuthHeader.java`
#### Snippet
```java
// NOTE: no @JsonSerialize/@JsonDeserialize because auth headers are for use in @HeaderParam
// see: https://jersey.java.net/apidocs/latest/jersey/javax/ws/rs/HeaderParam.html
public abstract class AuthHeader {

    @Value.Parameter
```

## RuleId[ruleID=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `List`
in `auth-tokens-filter-jakarta/src/main/java/com/palantir/tokens/auth/http/BearerTokenLoggingFeature.java`
#### Snippet
```java
                .collect(Collectors.toList());

        Optional<List<Parameter>> authorizationHeaderParams = superInterfaceMethods.stream()
                .map(method -> Arrays.stream(method.getParameters())
                        .filter(param -> param.getAnnotation(HeaderParam.class) != null)
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `auth-tokens-filter-jakarta/src/main/java/com/palantir/tokens/auth/http/BearerTokenLoggingFeature.java`
#### Snippet
```java
        }

        Optional<List<Parameter>> cookieParams = superInterfaceMethods.stream()
                .map(method -> Arrays.stream(method.getParameters())
                        .filter(param -> param.getAnnotation(CookieParam.class) != null)
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `auth-tokens-filter/src/main/java/com/palantir/tokens/auth/http/BearerTokenLoggingFeature.java`
#### Snippet
```java
                .collect(Collectors.toList());

        Optional<List<Parameter>> authorizationHeaderParams = superInterfaceMethods.stream()
                .map(method -> Arrays.stream(method.getParameters())
                        .filter(param -> param.getAnnotation(HeaderParam.class) != null)
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `auth-tokens-filter/src/main/java/com/palantir/tokens/auth/http/BearerTokenLoggingFeature.java`
#### Snippet
```java
        }

        Optional<List<Parameter>> cookieParams = superInterfaceMethods.stream()
                .map(method -> Arrays.stream(method.getParameters())
                        .filter(param -> param.getAnnotation(CookieParam.class) != null)
```

