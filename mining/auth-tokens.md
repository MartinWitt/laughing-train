# auth-tokens 
 
# Bad smells
I found 18 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicatedCode | 7 | false |
| OptionalUsedAsFieldOrParameterType | 4 | false |
| OptionalIsPresent | 2 | false |
| RedundantMethodOverride | 2 | false |
| BlockingMethodInNonBlockingContext | 2 | false |
| JavadocLinkAsPlainText | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
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
in `auth-tokens-filter/src/main/java/com/palantir/tokens/auth/http/Utilities.java`
#### Snippet
```java
    /** Writes to both the MDC and ContainerRequestContext. */
    static void recordUnverifiedJwt(
            ContainerRequestContext requestContext, Optional<UnverifiedJsonWebToken> parsedJwt) {
        if (parsedJwt.isPresent()) {
            UnverifiedJsonWebToken jwt = parsedJwt.get();
```

## RuleId[id=OptionalIsPresent]
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

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `destroy()` is identical to its super method
in `auth-tokens-filter-jakarta/src/main/java/com/palantir/tokens/auth/http/BasicAuthToBearerTokenFilter.java`
#### Snippet
```java

    @Override
    public void destroy() {}

    private ServletRequest addBearerTokenIfBasicAuth(ServletRequest request) {
```

### RedundantMethodOverride
Method `destroy()` is identical to its super method
in `auth-tokens-filter/src/main/java/com/palantir/tokens/auth/http/BasicAuthToBearerTokenFilter.java`
#### Snippet
```java

    @Override
    public void destroy() {}

    private ServletRequest addBearerTokenIfBasicAuth(ServletRequest request) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `auth-tokens-filter-jakarta/src/main/java/com/palantir/tokens/auth/http/BasicAuthToBearerTokenFilter.java`
#### Snippet
```java
        if (isBasicAuth(rawAuthHeader)) {
            AuthHeader authHeader;
            try {
                authHeader = base64DecodePassword(rawAuthHeader);
            } catch (IllegalArgumentException e) {
                log.warn("Could not decode password in basic auth header", e);
                return request;
            }
            return addBearerToken(request, authHeader);
        } else {
            log.debug("Auth header is not basic auth.");
            return request;
        }
```

### DuplicatedCode
Duplicated code
in `auth-tokens-filter-jakarta/src/main/java/com/palantir/tokens/auth/http/BasicAuthToBearerTokenFilter.java`
#### Snippet
```java
        return new HttpServletRequestWrapper(request) {
            @Override
            public Enumeration<String> getHeaders(String name) {
                if (Objects.equals(name, HttpHeaders.AUTHORIZATION)) {
                    return Collections.enumeration(Collections.singletonList(authHeader.toString()));
                }
                return super.getHeaders(name);
            }

            @Override
            public String getHeader(String name) {
                if (Objects.equals(name, HttpHeaders.AUTHORIZATION)) {
                    return authHeader.toString();
                } else {
                    return super.getHeader(name);
                }
            }
        };
```

### DuplicatedCode
Duplicated code
in `auth-tokens-filter-jakarta/src/main/java/com/palantir/tokens/auth/http/BasicAuthToBearerTokenFilter.java`
#### Snippet
```java
        String base64Credentials =
                rawAuthHeader.substring(BASIC_AUTH_STR.length()).trim();
        String credentials;
        try {
            credentials = new String(Base64.getUrlDecoder().decode(base64Credentials), StandardCharsets.UTF_8);
        } catch (IllegalArgumentException e) {
            throw new SafeIllegalArgumentException("Could not decode credentials from auth header", e);
        }
        Preconditions.checkArgument(credentials.contains(":"), "Credentials lack colon character (:).");
        String password = credentials.split(":", 2)[1];
        return AuthHeader.valueOf(password);
```

### DuplicatedCode
Duplicated code
in `auth-tokens-filter-jakarta/src/main/java/com/palantir/tokens/auth/http/BearerTokenCookieLoggingFilter.java`
#### Snippet
```java
        Utilities.clearMdc();

        Cookie authCookie = requestContext.getCookies().get(cookie);
        if (authCookie == null) {
            log.debug("No auth token present in request cookies.");
            return;
        }

        Optional<UnverifiedJsonWebToken> parsedJwt = UnverifiedJsonWebToken.tryParse(authCookie.getValue());
        Utilities.recordUnverifiedJwt(requestContext, parsedJwt);
```

### DuplicatedCode
Duplicated code
in `auth-tokens-filter-jakarta/src/main/java/com/palantir/tokens/auth/http/BearerTokenLoggingFeature.java`
#### Snippet
```java
List<Method> superInterfaceMethods = Stream.concat(
                        Stream.of(resourceInfo.getResourceMethod()),
                        Arrays.stream(resourceInfo.getResourceClass().getInterfaces())
                                .flatMap(cls -> {
                                    try {
                                        return Stream.of(cls.getDeclaredMethod(
                                                resourceInfo.getResourceMethod().getName(),
                                                resourceInfo.getResourceMethod().getParameterTypes()));
                                    } catch (NoSuchMethodException e) {
                                        return Stream.empty();
                                    }
                                }))
                .collect(Collectors.toList());

        Optional<List<Parameter>> authorizationHeaderParams = superInterfaceMethods.stream()
                .map(method -> Arrays.stream(method.getParameters())
                        .filter(param -> param.getAnnotation(HeaderParam.class) != null)
                        .filter(param -> param.getAnnotation(HeaderParam.class)
                                .value()
                                .equalsIgnoreCase(HttpHeaders.AUTHORIZATION))
                        .collect(Collectors.toList()))
                .filter(paramList -> !paramList.isEmpty())
                .findFirst();

        if (authorizationHeaderParams.isPresent()
                && authorizationHeaderParams.get().size() > 1) {
            throw new SafeIllegalStateException(
                    "Multiple parameters annotated with @HeaderParam('Authorization')",
                    SafeArg.of("class", resourceInfo.getResourceClass()),
                    SafeArg.of("method", Objects.toString(resourceInfo.getResourceMethod())));
        }

        if (authorizationHeaderParams.isPresent()
                && authorizationHeaderParams.get().size() == 1) {
            log.debug(
                    "Enabling BearerTokenLoggingFilter",
                    SafeArg.of("class", resourceInfo.getResourceClass()),
                    SafeArg.of("method", Objects.toString(resourceInfo.getResourceMethod())));
            context.register(BearerTokenLoggingFilter.class);
            return;
        }

        Optional<List<Parameter>> cookieParams = superInterfaceMethods.stream()
                .map(method -> Arrays.stream(method.getParameters())
                        .filter(param -> param.getAnnotation(CookieParam.class) != null)
                        .filter(param -> param.getType().isAssignableFrom(BearerToken.class))
                        .collect(Collectors.toList()))
                .filter(paramList -> !paramList.isEmpty())
                .findFirst();

        if (cookieParams.isPresent() && cookieParams.get().size() > 1) {
            throw new SafeIllegalStateException(
                    "Multiple BearerToken parameters annotated with @CookieParam",
                    SafeArg.of("class", resourceInfo.getResourceClass()),
                    SafeArg.of("method", Objects.toString(resourceInfo.getResourceMethod())));
        }

        if (cookieParams.isPresent() && cookieParams.get().size() == 1) {
            String cookieName =
                    cookieParams.get().get(0).getAnnotation(CookieParam.class).value();
            log.debug(
                    "Enabling BearerTokenCookieLoggingFilter",
                    SafeArg.of("class", resourceInfo.getResourceClass()),
                    SafeArg.of("method", Objects.toString(resourceInfo.getResourceMethod())));
            context.register(new BearerTokenCookieLoggingFilter(cookieName));
            return;
        }

        log.debug(
                "Setting filter to clear auth from logging information. "
                        + "Not adding BearerTokenLoggingFilter or BearerTokenCookieLoggingFilter as no "
                        + "@HeaderParam or @CookieParam annotated arguments were found.",
                SafeArg.of("class", resourceInfo.getResourceClass()),
                SafeArg.of("method", Objects.toString(resourceInfo.getResourceMethod())));

        context.register(new BearerTokenClearingFilter());
```

### DuplicatedCode
Duplicated code
in `auth-tokens-filter-jakarta/src/main/java/com/palantir/tokens/auth/http/BearerTokenLoggingFilter.java`
#### Snippet
```java
        Utilities.clearMdc();

        String rawAuthHeader = requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);
        if (rawAuthHeader == null) {
            log.debug("No AuthHeader present on request.");
            return;
        }

        Optional<UnverifiedJsonWebToken> parsedJwt = UnverifiedJsonWebToken.tryParse(rawAuthHeader);
        Utilities.recordUnverifiedJwt(requestContext, parsedJwt);
```

### DuplicatedCode
Duplicated code
in `auth-tokens-filter-jakarta/src/main/java/com/palantir/tokens/auth/http/Utilities.java`
#### Snippet
```java
        if (parsedJwt.isPresent()) {
            UnverifiedJsonWebToken jwt = parsedJwt.get();
            setUnverifiedContext(requestContext, Key.USER_ID, jwt.getUnverifiedUserId());
            setUnverifiedContext(requestContext, Key.SESSION_ID, jwt.getUnverifiedSessionId());
            setUnverifiedContext(requestContext, Key.TOKEN_ID, jwt.getUnverifiedTokenId());
            requestContext.setProperty(JSON_WEB_TOKEN_KEY, jwt);
        }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `auth-tokens/src/main/java/com/palantir/tokens/auth/UuidStringConverter.java`
#### Snippet
```java
 * so here we link to their license file.
 *
 * https://github.com/FasterXML/jackson-databind/blob/master/src/main/resources/META-INF/LICENSE
 */
final class UuidStringConverter {
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `auth-tokens-filter-jakarta/src/main/java/com/palantir/tokens/auth/http/BasicAuthToBearerTokenFilter.java`
#### Snippet
```java
            throws IOException, ServletException {
        ServletRequest updatedRequest = addBearerTokenIfBasicAuth(request);
        chain.doFilter(updatedRequest, response);
    }

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `auth-tokens-filter/src/main/java/com/palantir/tokens/auth/http/BasicAuthToBearerTokenFilter.java`
#### Snippet
```java
            throws IOException, ServletException {
        ServletRequest updatedRequest = addBearerTokenIfBasicAuth(request);
        chain.doFilter(updatedRequest, response);
    }

```

