# sls-version-java 
 
# Bad smells
I found 12 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| SimplifyOptionalCallChains | 3 | false |
| DuplicatedCode | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| NullableProblems | 1 | false |
| TrivialIf | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `sls-versions/src/main/java/com/palantir/sls/versions/ReleaseVersionParser.java`
#### Snippet
```java
        if (Parsers.failed(state)) {
            return null;
        }
        int first = Parsers.getResult(state);

        state = Parsers.literalDot(string, Parsers.getIndex(state));
        if (Parsers.failed(state)) {
            return null;
        }

        state = Parsers.number(string, Parsers.getIndex(state));
```

### DuplicatedCode
Duplicated code
in `sls-versions/src/main/java/com/palantir/sls/versions/SlsVersionMatcherParser.java`
#### Snippet
```java
        if (Parsers.failed(result)) {
            return Optional.empty(); // reject
        }
        if (Parsers.getResult(result) != Parsers.MAGIC_X_NUMBER) {
            major = OptionalInt.of(Parsers.getResult(result));
        }

        // dot
        result = Parsers.literalDot(string, Parsers.getIndex(result));
        if (Parsers.failed(result)) {
            return Optional.empty();
        }

        // minor
        result = Parsers.numberOrX(string, Parsers.getIndex(result));
```

## RuleId[id=SimplifyOptionalCallChains]
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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `sls-versions/src/main/java/com/palantir/sls/versions/OrderableSlsVersion.java`
#### Snippet
```java

    @Override
    public final int compareTo(OrderableSlsVersion other) {
        return VersionComparator.INSTANCE.compare(this, other);
    }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `sls-versions/src/main/java/com/palantir/sls/versions/SlsVersionMatcher.java`
#### Snippet
```java
/**
 * An SLS version matcher as defined by the [SLS
 * spec](https://github.com/palantir/sls-version-java#sls-product-version-specification).
 */
@Value.Immutable
```

### JavadocLinkAsPlainText
Link specified as plain text
in `sls-versions/src/main/java/com/palantir/sls/versions/OrderableSlsVersion.java`
#### Snippet
```java
/**
 * An orderable version string as defined by the [SLS
 * spec](https://github.com/palantir/sls-version-java#sls-product-version-specification).
 */
@Value.Immutable
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `sls-versions/src/main/java/com/palantir/sls/versions/SlsVersionMatcher.java`
#### Snippet
```java
        if (getPatchVersionNumber().isPresent()) {
            int comparison = Integer.compare(getPatchVersionNumber().getAsInt(), version.getPatchVersionNumber());
            if (comparison != 0) {
                return comparison;
            }
```

