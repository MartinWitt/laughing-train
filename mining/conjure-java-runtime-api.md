# conjure-java-runtime-api 
 
# Bad smells
I found 37 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalUsedAsFieldOrParameterType | 8 | false |
| AbstractClassNeverImplemented | 6 | false |
| DeprecatedIsStillUsed | 4 | false |
| SimplifyOptionalCallChains | 3 | false |
| ExceptionNameDoesntEndWithException | 3 | false |
| BoundedWildcard | 3 | false |
| NonSerializableFieldInSerializableClass | 2 | false |
| Java9CollectionFactory | 2 | false |
| ClassNameSameAsAncestorName | 1 | false |
| DefaultAnnotationParam | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| NonFinalFieldOfException | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
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

        private Throttle(Optional<Duration> retryAfter, Throwable cause, QosReason reason) {
            super("Suggesting request throttling with optional retryAfter duration: " + retryAfter, cause, reason);
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

        private Throttle(Optional<Duration> retryAfter, Throwable cause) {
            super(
                    "Suggesting request throttling with optional retryAfter duration: " + retryAfter,
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

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Assertions` is the same as one of its superclass' names
in `test-utils/src/main/java/com/palantir/conjure/java/api/testing/Assertions.java`
#### Snippet
```java

@CheckReturnValue
public class Assertions extends org.assertj.core.api.Assertions {

    Assertions() {}
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

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `service-config/src/main/java/com/palantir/conjure/java/api/config/service/UserAgents.java`
#### Snippet
```java
    private static Map<String, String> parseComments(String commentsString) {
        Map<String, String> comments = new HashMap<>();
        for (String comment : commentsString.split("[,;]")) {
            String[] fields = comment.split(":");
            if (fields.length == 2) {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.logsafe` is unnecessary and can be removed
in `errors/src/main/java/com/palantir/conjure/java/api/errors/ServiceException.java`
#### Snippet
```java

    /**
     * Creates a new exception for the given error. All {@link com.palantir.logsafe.Arg parameters} are propagated to
     * clients; they are serialized via {@link Object#toString}.
     */
```

## RuleId[id=DeprecatedIsStillUsed]
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
Deprecated member 'fallbackToCommonNameVerification' is still used
in `service-config/src/main/java/com/palantir/conjure/java/api/config/service/PartialServiceConfiguration.java`
#### Snippet
```java
    @Deprecated
    @JsonAlias("fallback-to-common-name-verification")
    Optional<Boolean> fallbackToCommonNameVerification();

    /** Proxy configuration for connecting to the service. If absent, uses system proxy configuration. */
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'retryAfter' in a Serializable class
in `errors/src/main/java/com/palantir/conjure/java/api/errors/QosException.java`
#### Snippet
```java
        private static final QosReason DEFAULT_REASON = QosReason.of("qos-throttle");

        private final Optional<Duration> retryAfter;

        private Throttle(Optional<Duration> retryAfter) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'reason' in a Serializable class
in `errors/src/main/java/com/palantir/conjure/java/api/errors/QosException.java`
#### Snippet
```java
public abstract class QosException extends RuntimeException {

    private final QosReason reason;

    // Not meant for external subclassing.
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `Unavailable` does not end with 'Exception'
in `errors/src/main/java/com/palantir/conjure/java/api/errors/QosException.java`
#### Snippet
```java

    /** See {@link #unavailable}. */
    public static final class Unavailable extends QosException implements SafeLoggable {
        private static final QosReason DEFAULT_REASON = QosReason.of("qos-unavailable");

```

### ExceptionNameDoesntEndWithException
Exception class name `Throttle` does not end with 'Exception'
in `errors/src/main/java/com/palantir/conjure/java/api/errors/QosException.java`
#### Snippet
```java

    /** See {@link #throttle}. */
    public static final class Throttle extends QosException implements SafeLoggable {
        private static final QosReason DEFAULT_REASON = QosReason.of("qos-throttle");

```

### ExceptionNameDoesntEndWithException
Exception class name `RetryOther` does not end with 'Exception'
in `errors/src/main/java/com/palantir/conjure/java/api/errors/QosException.java`
#### Snippet
```java

    /** See {@link #retryOther}. */
    public static final class RetryOther extends QosException implements SafeLoggable {
        private static final QosReason DEFAULT_REASON = QosReason.of("qos-retry-other");

```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`portString.length() > 0` can be replaced with '!portString.isEmpty()'
in `service-config/src/main/java/com/palantir/conjure/java/api/config/service/HostAndPort.java`
#### Snippet
```java

        int port = NO_PORT;
        if (portString != null && portString.length() > 0) {
            // Try to parse the whole port string as a number.
            // JDK7 accepts leading plus signs. We don't want to.
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `unsafeMessage` of exception class
in `errors/src/main/java/com/palantir/conjure/java/api/errors/RemoteException.java`
#### Snippet
```java
    // Lazily evaluated based on the stableMessage, errorInstanceId, and args.
    @SuppressWarnings("MutableException")
    private String unsafeMessage;

    /** Returns the error thrown by a remote process which caused an RPC call to fail. */
```

## RuleId[id=Java9CollectionFactory]
### Java9CollectionFactory
Can be replaced with 'List.of()' call
in `errors/src/main/java/com/palantir/conjure/java/api/errors/RemoteException.java`
#### Snippet
```java
        this.error = error;
        this.status = status;
        this.args = Collections.unmodifiableList(Arrays.asList(
                SafeArg.of(ERROR_INSTANCE_ID, error.errorInstanceId()),
                SafeArg.of(ERROR_NAME, error.errorName()),
```

### Java9CollectionFactory
Can be replaced with 'List.of()' call
in `errors/src/main/java/com/palantir/conjure/java/api/errors/UnknownRemoteException.java`
#### Snippet
```java
        args.add(SafeArg.of("status", getStatus()));
        args.add(UnsafeArg.of("body", getBody()));
        return Collections.unmodifiableList(args);
    }
}
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Throwable`
in `errors/src/main/java/com/palantir/conjure/java/api/errors/ServiceException.java`
#### Snippet
```java
            @Nullable Throwable cause,
            // Guard against cause cycles, see Throwable.printStackTrace(PrintStreamOrWriter)
            Set<Throwable> dejaVu) {
        if (cause == null || !dejaVu.add(cause)) {
            return UUID.randomUUID().toString();
```

### BoundedWildcard
Can generalize to `? extends Arg`
in `test-utils/src/main/java/com/palantir/conjure/java/api/testing/ServiceExceptionAssert.java`
#### Snippet
```java
        private final Map<String, Object> unsafeArgs = new HashMap<>();

        private AssertableArgs(List<Arg<?>> args) {
            args.forEach(arg -> {
                if (arg.isSafeForLogging()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `test-utils/src/main/java/com/palantir/conjure/java/api/testing/ServiceExceptionAssert.java`
#### Snippet
```java
        }

        private static void assertPut(Map<String, Object> map, String key, Object value, String name) {
            Object previous = map.put(key, value);
            if (previous != null) {
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `BasicCredentials` has no concrete subclass
in `service-config/src/main/java/com/palantir/conjure/java/api/config/service/BasicCredentials.java`
#### Snippet
```java
@JsonDeserialize(as = ImmutableBasicCredentials.class)
@ImmutablesStyle
public abstract class BasicCredentials {

    @Value.Parameter
```

### AbstractClassNeverImplemented
Abstract class `ProxyConfiguration` has no concrete subclass
in `service-config/src/main/java/com/palantir/conjure/java/api/config/service/ProxyConfiguration.java`
#### Snippet
```java
@JsonDeserialize(builder = ProxyConfiguration.Builder.class)
@ImmutablesStyle
public abstract class ProxyConfiguration {

    public static final ProxyConfiguration DIRECT =
```

### AbstractClassNeverImplemented
Abstract class `SerializableError` has no concrete subclass
in `errors/src/main/java/com/palantir/conjure/java/api/errors/SerializableError.java`
#### Snippet
```java
@Value.Style(overshadowImplementation = false)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SerializableError implements Serializable {

    /**
```

### AbstractClassNeverImplemented
Abstract class `ErrorType` has no concrete subclass
in `errors/src/main/java/com/palantir/conjure/java/api/errors/ErrorType.java`
#### Snippet
```java
@Value.Immutable
@ImmutablesStyle
public abstract class ErrorType {

    private static final String UPPER_CAMEL_CASE = "(([A-Z][a-z0-9]+)+)";
```

### AbstractClassNeverImplemented
Abstract class `SslConfiguration` has no concrete subclass
in `ssl-config/src/main/java/com/palantir/conjure/java/api/config/ssl/SslConfiguration.java`
#### Snippet
```java
@Value.Immutable
@ImmutablesStyle
public abstract class SslConfiguration {

    private static final ImmutableSet<String> PEM_EXTENSIONS = ImmutableSet.of("key", "pem", "cer", "crt");
```

### AbstractClassNeverImplemented
Abstract class `ServicesConfigBlock` has no concrete subclass
in `service-config/src/main/java/com/palantir/conjure/java/api/config/service/ServicesConfigBlock.java`
#### Snippet
```java
@JsonDeserialize(builder = ServicesConfigBlock.Builder.class)
@ImmutablesStyle
public abstract class ServicesConfigBlock {

    /**
```

