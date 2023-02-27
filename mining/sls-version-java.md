# sls-version-java 
 
# Bad smells
I found 14 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| AbstractClassNeverImplemented | 4 | false |
| MethodOverridesStaticMethod | 4 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| SimplifyOptionalCallChains | 3 | false |
## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'major'
in `sls-versions/src/main/java/com/palantir/sls/versions/SlsVersionMatcher.java`
#### Snippet
```java

    static Optional<SlsVersionMatcher> maybeCreate(
            String value, OptionalInt major, OptionalInt minor, OptionalInt patch) {
        SlsVersionMatcher maybeMatcher = ImmutableSlsVersionMatcher.of(value, major, minor, patch);

```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'minor'
in `sls-versions/src/main/java/com/palantir/sls/versions/SlsVersionMatcher.java`
#### Snippet
```java

    static Optional<SlsVersionMatcher> maybeCreate(
            String value, OptionalInt major, OptionalInt minor, OptionalInt patch) {
        SlsVersionMatcher maybeMatcher = ImmutableSlsVersionMatcher.of(value, major, minor, patch);

```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'patch'
in `sls-versions/src/main/java/com/palantir/sls/versions/SlsVersionMatcher.java`
#### Snippet
```java

    static Optional<SlsVersionMatcher> maybeCreate(
            String value, OptionalInt major, OptionalInt minor, OptionalInt patch) {
        SlsVersionMatcher maybeMatcher = ImmutableSlsVersionMatcher.of(value, major, minor, patch);

```

## RuleId[ruleID=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `sls-versions/src/main/java/com/palantir/sls/versions/SlsVersionMatcher.java`
#### Snippet
```java

        if (maybeMatcher.getPatchVersionNumber().isPresent()
                && (!maybeMatcher.getMinorVersionNumber().isPresent()
                        || !maybeMatcher.getMajorVersionNumber().isPresent())) {
            // String contains a pattern where major or minor version is underspecified.
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `sls-versions/src/main/java/com/palantir/sls/versions/SlsVersionMatcher.java`
#### Snippet
```java
        if (maybeMatcher.getPatchVersionNumber().isPresent()
                && (!maybeMatcher.getMinorVersionNumber().isPresent()
                        || !maybeMatcher.getMajorVersionNumber().isPresent())) {
            // String contains a pattern where major or minor version is underspecified.
            // Example: x.x.2, 1.x.3, x.2.3
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `sls-versions/src/main/java/com/palantir/sls/versions/SlsVersionMatcher.java`
#### Snippet
```java
        }
        if (maybeMatcher.getMinorVersionNumber().isPresent()
                && !maybeMatcher.getMajorVersionNumber().isPresent()) {
            // String contains a pattern where major version is underspecified. Example: x.2.x
            log.info(
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `OrderableSlsVersion` has no concrete subclass
in `sls-versions/src/main/java/com/palantir/sls/versions/OrderableSlsVersion.java`
#### Snippet
```java
@Value.Immutable
@ImmutablesStyle
public abstract class OrderableSlsVersion extends SlsVersion implements Comparable<OrderableSlsVersion> {

    private static final SlsVersionType[] ORDERED_VERSION_TYPES = {
```

### AbstractClassNeverImplemented
Abstract class `SlsVersion` has no concrete subclass
in `sls-versions/src/main/java/com/palantir/sls/versions/SlsVersion.java`
#### Snippet
```java
import org.immutables.value.Value;

public abstract class SlsVersion implements Serializable {

    @JsonCreator
```

### AbstractClassNeverImplemented
Abstract class `SlsVersionMatcher` has no concrete subclass
in `sls-versions/src/main/java/com/palantir/sls/versions/SlsVersionMatcher.java`
#### Snippet
```java
@Value.Immutable
@ImmutablesStyle
public abstract class SlsVersionMatcher {

    private static final SafeLogger log = SafeLoggerFactory.get(SlsVersionMatcher.class);
```

### AbstractClassNeverImplemented
Abstract class `NonOrderableSlsVersion` has no concrete subclass
in `sls-versions/src/main/java/com/palantir/sls/versions/NonOrderableSlsVersion.java`
#### Snippet
```java
@Value.Immutable
@ImmutablesStyle
public abstract class NonOrderableSlsVersion extends SlsVersion {

    @JsonCreator
```

## RuleId[ruleID=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `valueOf()` tries to override a static method of a superclass
in `sls-versions/src/main/java/com/palantir/sls/versions/OrderableSlsVersion.java`
#### Snippet
```java

    @JsonCreator
    public static OrderableSlsVersion valueOf(String value) {
        Optional<OrderableSlsVersion> optional = safeValueOf(value);
        checkArgument(optional.isPresent(), "Not an orderable version: {value}", UnsafeArg.of("value", value));
```

### MethodOverridesStaticMethod
Method `check()` tries to override a static method of a superclass
in `sls-versions/src/main/java/com/palantir/sls/versions/OrderableSlsVersion.java`
#### Snippet
```java

    /** Returns true iff the given coordinate has a version which can be parsed into a valid orderable SLS version. */
    public static boolean check(String coordinate) {
        return safeValueOf(coordinate).isPresent();
    }
```

### MethodOverridesStaticMethod
Method `check()` tries to override a static method of a superclass
in `sls-versions/src/main/java/com/palantir/sls/versions/NonOrderableSlsVersion.java`
#### Snippet
```java
     * orderable one.
     */
    public static boolean check(String coordinate) {
        return safeValueOf(coordinate).isPresent() && !OrderableSlsVersion.check(coordinate);
    }
```

### MethodOverridesStaticMethod
Method `valueOf()` tries to override a static method of a superclass
in `sls-versions/src/main/java/com/palantir/sls/versions/NonOrderableSlsVersion.java`
#### Snippet
```java

    @JsonCreator
    public static NonOrderableSlsVersion valueOf(String value) {
        Optional<NonOrderableSlsVersion> optional = safeValueOf(value);
        checkArgument(optional.isPresent(), "Not a non-orderable version: {value}", UnsafeArg.of("value", value));
```

