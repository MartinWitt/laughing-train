# conjure-java-runtime-api 
 
# Bad smells
I found 27 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalUsedAsFieldOrParameterType | 8 | false |
| Deprecation | 4 | false |
| DeprecatedIsStillUsed | 4 | false |
| SimplifyOptionalCallChains | 3 | false |
| JavadocReference | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| DefaultAnnotationParam | 1 | false |
| RedundantMethodOverride | 1 | false |
| DanglingJavadoc | 1 | false |
| JavadocDeclaration | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'first'
in `service-config/src/main/java/com/palantir/conjure/java/api/config/service/ServiceConfigurationFactory.java`
#### Snippet
```java

    // Returns the first Optional if present, or the second Optional otherwise.
    private static <T> Optional<T> orElse(Optional<T> first, Optional<T> second) {
        if (first.isPresent()) {
            return first;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'second'
in `service-config/src/main/java/com/palantir/conjure/java/api/config/service/ServiceConfigurationFactory.java`
#### Snippet
```java

    // Returns the first Optional if present, or the second Optional otherwise.
    private static <T> Optional<T> orElse(Optional<T> first, Optional<T> second) {
        if (first.isPresent()) {
            return first;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'retryAfter'
in `errors/src/main/java/com/palantir/conjure/java/api/errors/QosException.java`
#### Snippet
```java
        private final Optional<Duration> retryAfter;

        private Throttle(Optional<Duration> retryAfter) {
            super("Suggesting request throttling with optional retryAfter duration: " + retryAfter, DEFAULT_REASON);
            this.retryAfter = retryAfter;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'retryAfter'
in `errors/src/main/java/com/palantir/conjure/java/api/errors/QosException.java`
#### Snippet
```java
        private static final QosReason DEFAULT_REASON = QosReason.of("qos-throttle");

        private final Optional<Duration> retryAfter;

        private Throttle(Optional<Duration> retryAfter) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'retryAfter'
in `errors/src/main/java/com/palantir/conjure/java/api/errors/QosException.java`
#### Snippet
```java
        }

        private Throttle(Optional<Duration> retryAfter, Throwable cause, QosReason reason) {
            super("Suggesting request throttling with optional retryAfter duration: " + retryAfter, cause, reason);
            this.retryAfter = retryAfter;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'retryAfter'
in `errors/src/main/java/com/palantir/conjure/java/api/errors/QosException.java`
#### Snippet
```java
        }

        private Throttle(Optional<Duration> retryAfter, QosReason reason) {
            super("Suggesting request throttling with optional retryAfter duration: " + retryAfter, reason);
            this.retryAfter = retryAfter;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'retryAfter'
in `errors/src/main/java/com/palantir/conjure/java/api/errors/QosException.java`
#### Snippet
```java
        }

        private Throttle(Optional<Duration> retryAfter, Throwable cause) {
            super(
                    "Suggesting request throttling with optional retryAfter duration: " + retryAfter,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'sslConfig'
in `service-config/src/main/java/com/palantir/conjure/java/api/config/service/PartialServiceConfiguration.java`
#### Snippet
```java
    Optional<ProxyConfiguration> proxyConfiguration();

    static PartialServiceConfiguration of(List<String> uris, Optional<SslConfiguration> sslConfig) {
        return PartialServiceConfiguration.builder()
                .uris(uris)
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `errors/src/main/java/com/palantir/conjure/java/api/errors/SerializableError.java`
#### Snippet
```java
@JsonSerialize(as = ImmutableSerializableError.class)
@Value.Immutable
@Value.Style(overshadowImplementation = false)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SerializableError implements Serializable {
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `equals()` is identical to its super method
in `extras/jackson-support/src/main/java/com/palantir/conjure/java/api/ext/jackson/ShimJdk7Module.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `com.palantir.sls.versions.OrderableSlsVersion`
in `service-config/src/main/java/com/palantir/conjure/java/api/config/service/VersionParser.java`
#### Snippet
```java
/**
 * An optimized version parser that supports version numbers with up to four segments,
 * covering the most common {@link com.palantir.sls.versions.OrderableSlsVersion} and
 * browser user-agent version strings.
 * <p>
```

### JavadocReference
Symbol `args` is inaccessible from here
in `errors/src/main/java/com/palantir/conjure/java/api/errors/SerializableError.java`
#### Snippet
```java
    /**
     * Creates a {@link SerializableError} representation of this exception that derives from the error code and
     * message, as well as the {@link Arg#isSafeForLogging safe} and unsafe {@link ServiceException#args parameters}.
     */
    public static SerializableError forException(ServiceException exception) {
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `ssl-config/src/main/java/com/palantir/conjure/java/api/config/ssl/SslConfiguration.java`
#### Snippet
```java
    @Value.Check
    protected final void check() {
        if (keyStorePassword().isPresent() && !keyStorePath().isPresent()) {
            throw new SafeIllegalArgumentException("keyStorePath must be present if a keyStorePassword is provided");
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `ssl-config/src/main/java/com/palantir/conjure/java/api/config/ssl/SslConfiguration.java`
#### Snippet
```java
        if (keyStorePath().isPresent()
                && keyStoreType().equals(StoreType.JKS)
                && !keyStorePassword().isPresent()) {
            throw new SafeIllegalArgumentException("keyStorePassword must be present if keyStoreType is JKS");
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `ssl-config/src/main/java/com/palantir/conjure/java/api/config/ssl/SslConfiguration.java`
#### Snippet
```java
            throw new SafeIllegalArgumentException("keyStorePassword must be present if keyStoreType is JKS");
        }
        if (keyStoreKeyAlias().isPresent() && !keyStorePath().isPresent()) {
            throw new SafeIllegalArgumentException("keyStorePath must be present if keyStoreKeyAlias is present");
        }
```

## RuleId[id=Deprecation]
### Deprecation
'mappingException(java.lang.Class, com.fasterxml.jackson.core.JsonToken)' is deprecated
in `extras/jackson-support/src/main/java/com/palantir/conjure/java/api/ext/jackson/PathDeserializer.java`
#### Snippet
```java
            // 16-Oct-2015: should we perhaps allow JSON Arrays (of Strings) as well?
        }
        throw ctxt.mappingException(Path.class, token);
    }
}
```

### Deprecation
'fallbackToCommonNameVerification()' is deprecated
in `service-config/src/main/java/com/palantir/conjure/java/api/config/service/ServiceConfigurationFactory.java`
#### Snippet
```java
                .enableHttp2(orElse(partial.enableHttp2(), services.defaultEnableHttp2()))
                .fallbackToCommonNameVerification(orElse(
                        partial.fallbackToCommonNameVerification(), services.defaultFallbackToCommonNameVerification()))
                .build();
    }
```

### Deprecation
'defaultFallbackToCommonNameVerification()' is deprecated
in `service-config/src/main/java/com/palantir/conjure/java/api/config/service/ServiceConfigurationFactory.java`
#### Snippet
```java
                .enableHttp2(orElse(partial.enableHttp2(), services.defaultEnableHttp2()))
                .fallbackToCommonNameVerification(orElse(
                        partial.fallbackToCommonNameVerification(), services.defaultFallbackToCommonNameVerification()))
                .build();
    }
```

### Deprecation
'configureAbsentsAsNulls(boolean)' is deprecated
in `extras/jackson-support/src/main/java/com/palantir/conjure/java/api/ext/jackson/ObjectMappers.java`
#### Snippet
```java
        return mapper.registerModule(new GuavaModule())
                .registerModule(new ShimJdk7Module())
                .registerModule(new Jdk8Module().configureAbsentsAsNulls(true))
                .registerModule(new JavaTimeModule())
                .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `ssl-config/src/main/java/com/palantir/conjure/java/api/config/ssl/SslConfiguration.java`
#### Snippet
```java

    @JsonAlias("key-store-key-alias")
    /** Alias of the key that should be used in the key store. If absent, first entry returned by key store is used. */
    public abstract Optional<String> keyStoreKeyAlias();

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `errors/src/main/java/com/palantir/conjure/java/api/errors/SerializableError.java`
#### Snippet
```java
     * A unique identifier for this error instance, typically used to correlate errors displayed in user-facing
     * applications with richer backend-level error information. In contrast to {@link #errorCode} and
     * {@link #errorName}, the {@link #errorInstanceId} identifies a specific occurrence of an error, not a class of
     * errors. By convention, this field is a UUID.
     */
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'defaultFallbackToCommonNameVerification' is still used
in `service-config/src/main/java/com/palantir/conjure/java/api/config/service/ServicesConfigBlock.java`
#### Snippet
```java
    @JsonProperty("fallbackToCommonNameVerification")
    @JsonAlias("fallback-to-common-name-verification")
    public abstract Optional<Boolean> defaultFallbackToCommonNameVerification();

    public static Builder builder() {
```

### DeprecatedIsStillUsed
Deprecated member 'getExceptionClass' is still used
in `errors/src/main/java/com/palantir/conjure/java/api/errors/SerializableError.java`
#### Snippet
```java
    @Value.Auxiliary
    @SuppressWarnings("checkstyle:designforextension")
    abstract Optional<String> getExceptionClass();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getMessage' is still used
in `errors/src/main/java/com/palantir/conjure/java/api/errors/SerializableError.java`
#### Snippet
```java
    @Value.Auxiliary
    @SuppressWarnings("checkstyle:designforextension")
    abstract Optional<String> getMessage();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'fallbackToCommonNameVerification' is still used
in `service-config/src/main/java/com/palantir/conjure/java/api/config/service/PartialServiceConfiguration.java`
#### Snippet
```java
    @Deprecated
    @JsonAlias("fallback-to-common-name-verification")
    Optional<Boolean> fallbackToCommonNameVerification();

    /** Proxy configuration for connecting to the service. If absent, uses system proxy configuration. */
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `service-config/src/main/java/com/palantir/conjure/java/api/config/service/UserAgents.java`
#### Snippet
```java
     * formatted primary user agent can be found. Incorrectly formatted informational agents are omitted.
     *
     * <p>Valid user agent strings loosely follow RFC 7230 (https://tools.ietf.org/html/rfc7230#section-3.2.6).
     */
    public static UserAgent parse(String userAgent) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `service-config/src/main/java/com/palantir/conjure/java/api/config/service/UserAgent.java`
#### Snippet
```java
/**
 * Constructs, validates, and formats a canonical User-Agent header. Because the http header spec
 * (https://www.w3.org/Protocols/rfc2616/rfc2616-sec4.html#sec4.2) requires headers to be joined on commas, individual
 * {@link Agent} header strings must never contain commas.
 */
```

