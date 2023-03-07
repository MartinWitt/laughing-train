# assertj-guava 
 
# Bad smells
I found 228 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 113 | false |
| UnnecessaryFullyQualifiedName | 73 | false |
| UnstableTypeUsedInSignature | 15 | false |
| RedundantSuppression | 9 | false |
| BoundedWildcard | 7 | false |
| OptionalUsedAsFieldOrParameterType | 5 | false |
| OptionalGetWithoutIsPresent | 4 | false |
| ReturnNull | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `src/main/java/org/assertj/guava/error/OptionalShouldBePresentWithValue.java`
#### Snippet
```java
public final class OptionalShouldBePresentWithValue extends BasicErrorMessageFactory {

  public static <T> ErrorMessageFactory shouldBePresentWithValue(final Optional<T> actual, final Object value) {
    return new OptionalShouldBePresentWithValue("%nExpecting Optional to contain value %n  %s%n but contained %n  %s",
                                                value, actual.get());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `src/main/java/org/assertj/guava/error/OptionalShouldBeAbsent.java`
#### Snippet
```java
public final class OptionalShouldBeAbsent extends BasicErrorMessageFactory {

  public static <T> ErrorMessageFactory shouldBeAbsent(final Optional<T> actual) {
    return new OptionalShouldBeAbsent("Expecting Optional to contain nothing (absent Optional) but contained %s",
                                      actual.get());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `src/main/java/org/assertj/guava/error/OptionalShouldBePresent.java`
#### Snippet
```java
public final class OptionalShouldBePresent extends BasicErrorMessageFactory {

  public static <T> ErrorMessageFactory shouldBePresent(final Optional<T> actual) {
    return new OptionalShouldBePresent(
                                       "Expecting Optional to contain a non-null instance but contained nothing (absent Optional)",
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `src/main/java/org/assertj/guava/api/OptionalAssert.java`
#### Snippet
```java
public class OptionalAssert<T> extends AbstractAssert<OptionalAssert<T>, Optional<T>> {

  protected OptionalAssert(final Optional<T> actual) {
    super(actual, OptionalAssert.class);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `src/main/java/org/assertj/guava/api/Assertions.java`
#### Snippet
```java
  }

  public static <T> OptionalAssert<T> assertThat(final Optional<T> actual) {
    return new OptionalAssert<>(actual);
  }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/assertj/guava/api/MultisetAssert.java`
#### Snippet
```java
  @Override
  protected ObjectAssert<T> toAssert(T value, String description) {
    return null;
  }

```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ExceptionUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/assertj/guava/util/ExceptionUtils.java`
#### Snippet
```java
import static java.lang.String.format;

public class ExceptionUtils {

  /**
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/error/RangeSetShouldIntersectAnyOf.java`
#### Snippet
```java
   * Creates a new <code>{@link BasicErrorMessageFactory}</code>.
   *
   * @param actual actual {@link com.google.common.collect.RangeSet}.
   * @param expected expected range to intersect.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/error/RangeSetShouldIntersectAnyOf.java`
#### Snippet
```java

/**
 * Creates an error message indicating that the given {@link com.google.common.collect.RangeSet} does not intersect
 * at lease one element of expected objects.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.guava.error` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/error/ShouldHaveSize.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.guava.error.ShouldHaveSize}</code>.
   * @param actual the actual value in the failed assertion.
   * @param actualSize the size of {@code actual}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/error/RangeShouldBeClosedInTheLowerBound.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.BasicErrorMessageFactory}</code>.
   *
   * @param format the format string.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/error/RangeShouldBeOpenedInTheLowerBound.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.BasicErrorMessageFactory}</code>.
   *
   * @param format the format string.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.io` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/ByteSourceAssert.java`
#### Snippet
```java
   * @param expectedSize the expected size of actual {@link ByteSource}.
   * @return this {@link ByteSourceAssert} for assertions chaining.
   * @throws IOException    if {@link com.google.common.io.ByteSource#size()} throws one.
   * @throws AssertionError if the actual {@link ByteSource} is {@code null}.
   * @throws AssertionError if the number of values of the actual {@link ByteSource} is not equal to the given one.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/error/RangeShouldHaveLowerEndpointEqual.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.BasicErrorMessageFactory}</code>.
   *
   * @param format the format string.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/error/RangeShouldBeOpenedInTheUpperBound.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.BasicErrorMessageFactory}</code>.
   *
   * @param format the format string.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/error/RangeShouldBeClosedInTheUpperBound.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.BasicErrorMessageFactory}</code>.
   *
   * @param format the format string.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.error` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/error/RangeShouldHaveUpperEndpointEqual.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.BasicErrorMessageFactory}</code>.
   *
   * @param format the format string.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.Range} upper bound is closed.<br>
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   *
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} upper bound is opened.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} upper bound is opened.
   */
  public RangeAssert<T> hasClosedUpperBound() throws AssertionError {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.Range} is not empty.<br>
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   *
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is empty.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is empty.
   */
  public RangeAssert<T> isNotEmpty() throws AssertionError {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.Range} upper endpoint is equal to the given value.<br>
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * assertThat(range).hasUpperEndpointEqualTo(12);</code></pre>
   *
   * @param value {@link com.google.common.collect.Range} expected upper bound value.
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * @param value {@link com.google.common.collect.Range} expected upper bound value.
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} does not have upper endpoint equal to
   *           the given values.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} does not have upper endpoint equal to
   *           the given values.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java

/**
 * Assertions for guava {@link com.google.common.collect.Range}.
 * <p>
 * To create an instance of this class, invoke <code>{@link
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.guava.api` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
 * <p>
 * To create an instance of this class, invoke <code>{@link
 * org.assertj.guava.api.Assertions#assertThat(com.google.common.collect.Range)}</code>
 * <p>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
 * <p>
 * To create an instance of this class, invoke <code>{@link
 * org.assertj.guava.api.Assertions#assertThat(com.google.common.collect.Range)}</code>
 * <p>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.Range} lower bound is closed.<br>
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   *
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} lower bound is opened.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} lower bound is opened.
   */
  public RangeAssert<T> hasClosedLowerBound() throws AssertionError {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.Range} lower bound is opened.<br>
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   *
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} lower bound is closed.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} lower bound is closed.
   */
  public RangeAssert<T> hasOpenedLowerBound() throws AssertionError {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.Range} is empty.<br>
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   *
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is not empty.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is not empty.
   */
  public RangeAssert<T> isEmpty() throws AssertionError {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.Range} does not contain the given values.<br>
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * assertThat(range).doesNotContain(13);</code></pre>
   *
   * @param values the values that should not be present in actual {@link com.google.common.collect.Range}.
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * @param values the values that should not be present in actual {@link com.google.common.collect.Range}.
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} contains the given values.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} contains the given values.
   */
  public RangeAssert<T> doesNotContain(@SuppressWarnings("unchecked") final T... values) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.Range} contains the given values.<br>
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * assertThat(range).contains(10, 11, 12);</code></pre>
   *
   * @param values the values to look for in actual {@link com.google.common.collect.Range}.
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * @param values the values to look for in actual {@link com.google.common.collect.Range}.
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} does not contain the given values.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} does not contain the given values.
   */
  public RangeAssert<T> contains(@SuppressWarnings("unchecked") final T... values) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.Range} upper bound is opened.<br>
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   *
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} upper bound is closed.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} upper bound is closed.
   */
  public RangeAssert<T> hasOpenedUpperBound() throws AssertionError {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.Range} lower endpoint is equal to the given value.<br>
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * assertThat(range).hasLowerEndpointEqualTo(10);</code></pre>
   *
   * @param value {@link com.google.common.collect.Range} expected lower bound value.
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * @param value {@link com.google.common.collect.Range} expected lower bound value.
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} does not have lower endpoint equal to
   *           the given values.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * @return this {@link RangeAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} does not have lower endpoint equal to
   *           the given values.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @deprecated use {@link #contains(MapEntry...)} instead (same method but using {@link MapEntry org.assertj.core.data.MapEntry} in place of {@link org.assertj.guava.data.MapEntry}.
   * <p>
   * Verifies that the actual {@link com.google.common.collect.RangeMap} contains the given entries.<br>
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * <p>
   *
   * @param entries the entries to look for in actual {@link com.google.common.collect.RangeMap}.
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws IllegalArgumentException if no param entries have been set.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws IllegalArgumentException if no param entries have been set.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} does not contain the given entries.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if no param entries have been set.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} does not contain the given entries.
   */
  @SafeVarargs
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.RangeMap} is empty.
   *
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   *
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is not empty.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is not empty.
   */
  public RangeMapAssert<K, V> isEmpty() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.RangeMap} contains the given entries.<br>
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.core.data` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * spectralColors.put(Range.closedOpen(620, 750), "red");
   *
   * // entry can be statically imported from {@link org.assertj.core.data.MapEntry}
   * assertThat(spectralColors).contains(entry("400", "violet"), entry("650", "red"));</code></pre>
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * <p>
   *
   * @param entries the entries to look for in actual {@link com.google.common.collect.RangeMap}.
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws IllegalArgumentException if no param entries have been set.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws IllegalArgumentException if no param entries have been set.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} does not contain the given entries.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if no param entries have been set.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} does not contain the given entries.
   */
  @SafeVarargs
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.RangeMap} contains the given values.<br>
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * <p>
   *
   * @param values the values to look for in actual {@link com.google.common.collect.RangeMap}.
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws IllegalArgumentException if no param values have been set.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws IllegalArgumentException if no param values have been set.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} does not contain the given values.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if no param values have been set.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} does not contain the given values.
   */
  public RangeMapAssert<K, V> containsValues(@SuppressWarnings("unchecked") V... values) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.RangeMap} contains the given keys.<br>
   * <p>
   * Example :
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * <p>
   *
   * @param keys the keys to look for in actual {@link com.google.common.collect.RangeMap}.
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws IllegalArgumentException if no param keys have been set.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws IllegalArgumentException if no param keys have been set.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} does not contain the given keys.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if no param keys have been set.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} does not contain the given keys.
   */
  public RangeMapAssert<K, V> containsKeys(@SuppressWarnings("unchecked") K... keys) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java

/**
 * Assertions for guava {@link com.google.common.collect.RangeMap}.
 * <p>
 * To create an instance of this class, invoke <code>{@link
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.guava.api` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
 * <p>
 * To create an instance of this class, invoke <code>{@link
 * org.assertj.guava.api.Assertions#assertThat(com.google.common.collect.RangeMap)}</code>
 * <p>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
 * <p>
 * To create an instance of this class, invoke <code>{@link
 * org.assertj.guava.api.Assertions#assertThat(com.google.common.collect.RangeMap)}</code>
 * <p>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.RangeMap} is not empty.
   *
   * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @return this {@link RangeMapAssert} for assertions chaining.
   *
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is empty.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   *
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is empty.
   */
  public RangeMapAssert<K, V> isNotEmpty() {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/assertj/guava/api/Assertions.java`
#### Snippet
```java
  }

  public static <T> MultisetAssert<T> assertThat(final Multiset<T> actual) {
    return new MultisetAssert<>(actual);
  }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/org/assertj/guava/api/Assertions.java`
#### Snippet
```java
  }

  public static <T extends Comparable<T>> RangeAssert<T> assertThat(final Range<T> actual) {
    return new RangeAssert<>(actual);
  }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/org/assertj/guava/api/Assertions.java`
#### Snippet
```java
  }

  public static <T extends Comparable<T>> RangeSetAssert<T> assertThat(final RangeSet<T> actual) {
    return new RangeSetAssert<>(actual);
  }
```

### BoundedWildcard
Can generalize to `? super K`
in `src/main/java/org/assertj/guava/api/Assertions.java`
#### Snippet
```java
  }

  public static <K extends Comparable<K>, V> RangeMapAssert<K, V> assertThat(final RangeMap<K, V> actual) {
    return new RangeMapAssert<>(actual);
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  }

  private void assertContainsAnyRangesOf(Iterable<T> values) {
    requireNonNull(values, shouldNotBeNull("values")::create);
    if (actual.isEmpty() && !values.iterator().hasNext()) return;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  }

  private void assertContainsAll(Iterable<T> values) {
    requireNonNull(values, shouldNotBeNull("values")::create);
    if (actual.isEmpty() && !values.iterator().hasNext()) return;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  }

  private void assertDoesNotContainAll(Iterable<T> values) {
    requireNonNull(values, shouldNotBeNull("values")::create);
    failIfEmpty(values, "values");
```

## RuleId[id=UnstableTypeUsedInSignature]
### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeSet'
in `src/main/java/org/assertj/guava/error/RangeSetShouldIntersectAnyOf.java`
#### Snippet
```java
public class RangeSetShouldIntersectAnyOf extends BasicErrorMessageFactory {

  public static ErrorMessageFactory shouldIntersectAnyOf(RangeSet<?> actual, Object expected) {
    return new RangeSetShouldIntersectAnyOf(actual, expected);
  }
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeSet'
in `src/main/java/org/assertj/guava/error/RangeSetShouldIntersect.java`
#### Snippet
```java
public class RangeSetShouldIntersect extends BasicErrorMessageFactory {

  public static ErrorMessageFactory shouldIntersect(RangeSet<?> actual, Object expected, Iterable<?> notIntersected) {
    return new RangeSetShouldIntersect(actual, expected, notIntersected);
  }
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeMap'
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
public class RangeMapAssert<K extends Comparable<K>, V> extends AbstractAssert<RangeMapAssert<K, V>, RangeMap<K, V>> {

  protected RangeMapAssert(final RangeMap<K, V> actual) {
    super(actual, RangeMapAssert.class);
  }
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeMap'
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java

  // visible for test
  protected RangeMap<K, V> getActual() {
    return actual;
  }
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeSet'
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java
   */
  @SuppressWarnings({ "rawtypes", "unused" }) // rawtypes: using Class instance, unused: parameter needed for type inference
  static <T extends Comparable<T>> InstanceOfAssertFactory<RangeSet, RangeSetAssert<T>> rangeSet(Class<T> comparableType) {
    return new InstanceOfAssertFactory<>(RangeSet.class, Assertions::<T> assertThat);
  }
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeMap'
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java
   */
  @SuppressWarnings({ "rawtypes", "unused" }) // rawtypes: using Class instance, unused: parameter needed for type inference
  static <K extends Comparable<K>, V> InstanceOfAssertFactory<RangeMap, RangeMapAssert<K, V>> rangeMap(Class<K> keyType,
                                                                                                       Class<V> valueType) {
    return new InstanceOfAssertFactory<>(RangeMap.class, Assertions::<K, V> assertThat);
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeSet'
in `src/main/java/org/assertj/guava/api/Assertions.java`
#### Snippet
```java
  }

  public static <T extends Comparable<T>> RangeSetAssert<T> assertThat(final RangeSet<T> actual) {
    return new RangeSetAssert<>(actual);
  }
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeMap'
in `src/main/java/org/assertj/guava/api/Assertions.java`
#### Snippet
```java
  }

  public static <K extends Comparable<K>, V> RangeMapAssert<K, V> assertThat(final RangeMap<K, V> actual) {
    return new RangeMapAssert<>(actual);
  }
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeSet'
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if range set is empty while actual is not empty.
   */
  public RangeSetAssert<T> enclosesAll(RangeSet<T> rangeSet) {
    isNotNull();
    assertEnclosesAll(rangeSet);
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeSet'
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if range set is empty.
   */
  public RangeSetAssert<T> doesNotEncloseAnyRangesOf(RangeSet<T> rangeSet) {
    isNotNull();
    assertDoesNotEncloseAnyRangesOf(rangeSet);
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeSet'
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if range set is empty while actual is not empty.
   */
  public RangeSetAssert<T> enclosesAnyRangesOf(RangeSet<T> rangeSet) {
    isNotNull();
    assertEnclosesAnyRangesOf(rangeSet);
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeSet'
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if range set is empty while actual is not empty.
   */
  public RangeSetAssert<T> intersectsAnyRangesOf(RangeSet<T> rangeSet) {
    isNotNull();
    assertIntersectsAnyRangesOf(rangeSet);
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeSet'
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if range set is empty.
   */
  public RangeSetAssert<T> doesNotIntersectAnyRangeFrom(RangeSet<T> rangeSet) {
    isNotNull();
    assertDoesNotIntersectAnyRangeFrom(rangeSet);
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeSet'
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
public class RangeSetAssert<T extends Comparable<T>> extends AbstractAssert<RangeSetAssert<T>, RangeSet<T>> {

  protected RangeSetAssert(RangeSet<T> actual) {
    super(actual, RangeSetAssert.class);
  }
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeSet'
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if range set is empty while actual is not empty.
   */
  public RangeSetAssert<T> intersectsAll(RangeSet<T> rangeSet) {
    isNotNull();
    assertIntersectsAll(rangeSet);
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/org/assertj/guava/error/OptionalShouldBePresentWithValue.java`
#### Snippet
```java
  public static <T> ErrorMessageFactory shouldBePresentWithValue(final Optional<T> actual, final Object value) {
    return new OptionalShouldBePresentWithValue("%nExpecting Optional to contain value %n  %s%n but contained %n  %s",
                                                value, actual.get());
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/org/assertj/guava/error/OptionalShouldBeAbsent.java`
#### Snippet
```java
  public static <T> ErrorMessageFactory shouldBeAbsent(final Optional<T> actual) {
    return new OptionalShouldBeAbsent("Expecting Optional to contain nothing (absent Optional) but contained %s",
                                      actual.get());
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/org/assertj/guava/api/OptionalAssert.java`
#### Snippet
```java
  public AbstractObjectAssert<?, T> extractingValue() {
    isPresent();
    T assertion = actual.get();
    return assertThat(assertion);
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/org/assertj/guava/api/OptionalAssert.java`
#### Snippet
```java
  public AbstractCharSequenceAssert<?, ? extends CharSequence> extractingCharSequence() {
    isPresent();
    assertThat(actual.get()).isInstanceOf(CharSequence.class);
    return assertThat((CharSequence) actual.get());
  }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/guava/api/MultimapAssert.java`
#### Snippet
```java
   * @throws AssertionError           if the actual {@link Multimap} does not contain the given keys.
   */
  public MultimapAssert<K, V> containsKeys(@SuppressWarnings("unchecked") K... keys) {
    isNotNull();
    throwIllegalArgumentExceptionIfTrue(keys == null, "The keys to look for should not be null");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/guava/api/MultimapAssert.java`
#### Snippet
```java
   * @throws AssertionError           if the actual {@link Multimap} does not contain the given values.
   */
  public MultimapAssert<K, V> containsValues(@SuppressWarnings("unchecked") V... values) {
    isNotNull();
    throwIllegalArgumentExceptionIfTrue(values == null, "The values to look for should not be null");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} does not contain the given values.
   */
  public RangeAssert<T> contains(@SuppressWarnings("unchecked") final T... values) {
    isNotNull();
    throwIllegalArgumentExceptionIfTrue(values == null, "The values to look for should not be null");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/guava/api/RangeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@link com.google.common.collect.Range} contains the given values.
   */
  public RangeAssert<T> doesNotContain(@SuppressWarnings("unchecked") final T... values) {
    isNotNull();

```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} does not contain the given keys.
   */
  public RangeMapAssert<K, V> containsKeys(@SuppressWarnings("unchecked") K... keys) {
    isNotNull();
    throwIllegalArgumentExceptionIfTrue(keys == null, "The keys to look for should not be null");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} does not contain the given values.
   */
  public RangeMapAssert<K, V> containsValues(@SuppressWarnings("unchecked") V... values) {
    isNotNull();
    throwIllegalArgumentExceptionIfTrue(values == null, "The values to look for should not be null");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/guava/api/TableAssert.java`
#### Snippet
```java
   * @throws AssertionError           if the actual {@link Table} does not contain the given rows.
   */
  public TableAssert<R, C, V> containsRows(@SuppressWarnings("unchecked") R... rows) {
    isNotNull();
    checkArgument(rows != null, "The rows to look for should not be null.");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/guava/api/TableAssert.java`
#### Snippet
```java
   * @throws AssertionError           if the actual {@link Table} does not contain the given columns.
   */
  public TableAssert<R, C, V> containsColumns(@SuppressWarnings("unchecked") C... columns) {
    isNotNull();
    checkArgument(columns != null, "The columns to look for should not be null.");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/guava/api/TableAssert.java`
#### Snippet
```java
   * @throws AssertionError           if the actual {@link Table} does not contain the given values.
   */
  public TableAssert<R, C, V> containsValues(@SuppressWarnings("unchecked") V... values) {
    isNotNull();
    checkArgument(values != null, "The values to look for should not be null.");
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/error/RangeSetShouldIntersectAnyOf.java`
#### Snippet
```java
   * Creates a new <code>{@link BasicErrorMessageFactory}</code>.
   *
   * @param actual actual {@link com.google.common.collect.RangeSet}.
   * @param expected expected range to intersect.
   */
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/error/RangeSetShouldIntersectAnyOf.java`
#### Snippet
```java

/**
 * Creates an error message indicating that the given {@link com.google.common.collect.RangeSet} does not intersect
 * at lease one element of expected objects.
 *
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/error/RangeSetShouldIntersectAnyOf.java`
#### Snippet
```java
public class RangeSetShouldIntersectAnyOf extends BasicErrorMessageFactory {

  public static ErrorMessageFactory shouldIntersectAnyOf(RangeSet<?> actual, Object expected) {
    return new RangeSetShouldIntersectAnyOf(actual, expected);
  }
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/error/RangeSetShouldIntersect.java`
#### Snippet
```java
   * Creates a new <code>{@link BasicErrorMessageFactory}</code>.
   *
   * @param actual actual {@link RangeSet}.
   * @param expected expected {@link RangeSet} that have to be intersected.
   * @param notIntersected not intersected ranges.
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/error/RangeSetShouldIntersect.java`
#### Snippet
```java
   *
   * @param actual actual {@link RangeSet}.
   * @param expected expected {@link RangeSet} that have to be intersected.
   * @param notIntersected not intersected ranges.
   */
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/error/RangeSetShouldIntersect.java`
#### Snippet
```java
public class RangeSetShouldIntersect extends BasicErrorMessageFactory {

  public static ErrorMessageFactory shouldIntersect(RangeSet<?> actual, Object expected, Iterable<?> notIntersected) {
    return new RangeSetShouldIntersect(actual, expected, notIntersected);
  }
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/error/RangeSetShouldIntersect.java`
#### Snippet
```java

/**
 * Creates an error message indicating that the given {@link RangeSet} does not intersect
 * either another one {@link RangeSet} or some set of {@link Range}.
 *
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/error/RangeSetShouldIntersect.java`
#### Snippet
```java
/**
 * Creates an error message indicating that the given {@link RangeSet} does not intersect
 * either another one {@link RangeSet} or some set of {@link Range}.
 *
 * @author Ilya Koshaleu
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/error/RangeSetShouldEncloseAnyOf.java`
#### Snippet
```java

/**
 * Creates an error message indicating that the given {@link com.google.common.collect.RangeSet} does not enclose
 * at lease one element of expected objects.
 *
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/error/RangeSetShouldEnclose.java`
#### Snippet
```java

/**
 * Creates an error message indicating that the given {@link com.google.common.collect.RangeSet} does not enclose 
 * neither another one {@link com.google.common.collect.RangeSet} nor some set of 
 * {@link com.google.common.collect.Range}.
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/error/RangeSetShouldEnclose.java`
#### Snippet
```java
/**
 * Creates an error message indicating that the given {@link com.google.common.collect.RangeSet} does not enclose 
 * neither another one {@link com.google.common.collect.RangeSet} nor some set of 
 * {@link com.google.common.collect.Range}.
 *
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @deprecated use {@link #contains(MapEntry...)} instead (same method but using {@link MapEntry org.assertj.core.data.MapEntry} in place of {@link org.assertj.guava.data.MapEntry}.
   * <p>
   * Verifies that the actual {@link com.google.common.collect.RangeMap} contains the given entries.<br>
   * <p>
   * Example :
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * <p>
   *
   * @param entries the entries to look for in actual {@link com.google.common.collect.RangeMap}.
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws IllegalArgumentException if no param entries have been set.
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws IllegalArgumentException if no param entries have been set.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} does not contain the given entries.
   */
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if no param entries have been set.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} does not contain the given entries.
   */
  @SafeVarargs
```

### UnstableApiUsage
'get(K)' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
    List<org.assertj.guava.data.MapEntry<K, V>> entriesNotFound = newArrayList();
    for (org.assertj.guava.data.MapEntry<K, V> entry : entries) {
      final V value = actual.get(entry.key);
      if (value == null || !value.equals(entry.value)) {
        entriesNotFound.add(entry);
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
public class RangeMapAssert<K extends Comparable<K>, V> extends AbstractAssert<RangeMapAssert<K, V>, RangeMap<K, V>> {

  protected RangeMapAssert(final RangeMap<K, V> actual) {
    super(actual, RangeMapAssert.class);
  }
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.RangeMap} is empty.
   *
   * <p>
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   *
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is not empty.
   */
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is not empty.
   */
  public RangeMapAssert<K, V> isEmpty() {
```

### UnstableApiUsage
'asMapOfRanges()' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
  public RangeMapAssert<K, V> isEmpty() {
    isNotNull();
    if (!actual.asMapOfRanges().isEmpty()) {
      throw assertionError(shouldBeEmpty(actual));
    }
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.RangeMap} contains the given entries.<br>
   * <p>
   * Example :
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * <p>
   *
   * @param entries the entries to look for in actual {@link com.google.common.collect.RangeMap}.
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws IllegalArgumentException if no param entries have been set.
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws IllegalArgumentException if no param entries have been set.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} does not contain the given entries.
   */
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if no param entries have been set.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} does not contain the given entries.
   */
  @SafeVarargs
```

### UnstableApiUsage
'get(K)' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
    List<MapEntry<K, V>> entriesNotFound = newArrayList();
    for (MapEntry<K, V> entry : entries) {
      final V value = actual.get(entry.key);
      if (value == null || !value.equals(entry.value)) {
        entriesNotFound.add(entry);
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java

  // visible for test
  protected RangeMap<K, V> getActual() {
    return actual;
  }
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.RangeMap} contains the given values.<br>
   * <p>
   * Example :
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * <p>
   *
   * @param values the values to look for in actual {@link com.google.common.collect.RangeMap}.
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws IllegalArgumentException if no param values have been set.
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws IllegalArgumentException if no param values have been set.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} does not contain the given values.
   */
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if no param values have been set.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} does not contain the given values.
   */
  public RangeMapAssert<K, V> containsValues(@SuppressWarnings("unchecked") V... values) {
```

### UnstableApiUsage
'asMapOfRanges()' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
    throwIllegalArgumentExceptionIfTrue(values.length == 0, "The values to look for should not be empty");

    final Map<Range<K>, V> mapOfRanges = actual.asMapOfRanges();
    Set<V> valuesNotFound = newLinkedHashSet();
    for (V value : values) {
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.RangeMap} contains the given keys.<br>
   * <p>
   * Example :
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * <p>
   *
   * @param keys the keys to look for in actual {@link com.google.common.collect.RangeMap}.
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws IllegalArgumentException if no param keys have been set.
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @return this {@link RangeMapAssert} for assertions chaining.
   * @throws IllegalArgumentException if no param keys have been set.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} does not contain the given keys.
   */
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if no param keys have been set.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} does not contain the given keys.
   */
  public RangeMapAssert<K, V> containsKeys(@SuppressWarnings("unchecked") K... keys) {
```

### UnstableApiUsage
'get(K)' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
    Set<K> keysNotFound = newLinkedHashSet();
    for (K key : keys) {
      if (actual.get(key) == null) {
        keysNotFound.add(key);
      }
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java

/**
 * Assertions for guava {@link com.google.common.collect.RangeMap}.
 * <p>
 * To create an instance of this class, invoke <code>{@link
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
 * <p>
 * To create an instance of this class, invoke <code>{@link
 * org.assertj.guava.api.Assertions#assertThat(com.google.common.collect.RangeMap)}</code>
 * <p>
 *
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
 * @author Marcin Kwaczyński
 */
public class RangeMapAssert<K extends Comparable<K>, V> extends AbstractAssert<RangeMapAssert<K, V>, RangeMap<K, V>> {

  protected RangeMapAssert(final RangeMap<K, V> actual) {
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java

  /**
   * Verifies that the actual {@link com.google.common.collect.RangeMap} is not empty.
   *
   * <p>
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * @return this {@link RangeMapAssert} for assertions chaining.
   *
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is empty.
   */
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   *
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is {@code null}.
   * @throws AssertionError if the actual {@link com.google.common.collect.RangeMap} is empty.
   */
  public RangeMapAssert<K, V> isNotEmpty() {
```

### UnstableApiUsage
'asMapOfRanges()' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
  public RangeMapAssert<K, V> isNotEmpty() {
    isNotNull();
    if (actual.asMapOfRanges().isEmpty()) {
      throw assertionError(shouldNotBeEmpty());
    }
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java

  /**
   * {@link InstanceOfAssertFactory} for a {@link RangeSet}.
   *
   * @param comparableType the comparable type instance.
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java
   */
  @SuppressWarnings({ "rawtypes", "unused" }) // rawtypes: using Class instance, unused: parameter needed for type inference
  static <T extends Comparable<T>> InstanceOfAssertFactory<RangeSet, RangeSetAssert<T>> rangeSet(Class<T> comparableType) {
    return new InstanceOfAssertFactory<>(RangeSet.class, Assertions::<T> assertThat);
  }
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java
  @SuppressWarnings({ "rawtypes", "unused" }) // rawtypes: using Class instance, unused: parameter needed for type inference
  static <T extends Comparable<T>> InstanceOfAssertFactory<RangeSet, RangeSetAssert<T>> rangeSet(Class<T> comparableType) {
    return new InstanceOfAssertFactory<>(RangeSet.class, Assertions::<T> assertThat);
  }

```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java

  /**
   * {@link InstanceOfAssertFactory} for a {@link RangeMap}.
   *
   * @param <K>       the {@code RangeMap} key type.
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java
   */
  @SuppressWarnings({ "rawtypes", "unused" }) // rawtypes: using Class instance, unused: parameter needed for type inference
  static <K extends Comparable<K>, V> InstanceOfAssertFactory<RangeMap, RangeMapAssert<K, V>> rangeMap(Class<K> keyType,
                                                                                                       Class<V> valueType) {
    return new InstanceOfAssertFactory<>(RangeMap.class, Assertions::<K, V> assertThat);
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java
  static <K extends Comparable<K>, V> InstanceOfAssertFactory<RangeMap, RangeMapAssert<K, V>> rangeMap(Class<K> keyType,
                                                                                                       Class<V> valueType) {
    return new InstanceOfAssertFactory<>(RangeMap.class, Assertions::<K, V> assertThat);
  }

```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/Assertions.java`
#### Snippet
```java
  }

  public static <T extends Comparable<T>> RangeSetAssert<T> assertThat(final RangeSet<T> actual) {
    return new RangeSetAssert<>(actual);
  }
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/Assertions.java`
#### Snippet
```java
  }

  public static <K extends Comparable<K>, V> RangeMapAssert<K, V> assertThat(final RangeMap<K, V> actual) {
    return new RangeMapAssert<>(actual);
  }
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  }

  private static <T> void failIfEmpty(RangeSet<?> rangeSet) {
    if (rangeSet.isEmpty()) throw new IllegalArgumentException("Expecting rangeSet not to be empty");
  }
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  private static <T> void failIfEmpty(RangeSet<?> rangeSet) {
    if (rangeSet.isEmpty()) throw new IllegalArgumentException("Expecting rangeSet not to be empty");
  }

```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  private void assertIntersects(Range<T>[] ranges) {
    requireNonNull(ranges, shouldNotBeNull("ranges")::create);
    if (actual.isEmpty() && ranges.length == 0) return;
    failIfEmpty(ranges, "ranges");
    assertRangeSetIntersectsGivenValues(ranges);
```

### UnstableApiUsage
'encloses(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  private void assertRangeSetEnclosesAnyOfGivenValues(Range<T>[] ranges) {
    boolean match = stream(ranges).anyMatch(actual::encloses);
    if (!match) throwAssertionError(shouldEncloseAnyOf(actual, ranges));
  }
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private void assertIntersectsAnyRangesOf(RangeSet<T> rangeSet) {
    requireNonNull(rangeSet, shouldNotBeNull("rangeSet")::create);
    if (actual.isEmpty() && rangeSet.isEmpty()) return;
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  private void assertIntersectsAnyRangesOf(RangeSet<T> rangeSet) {
    requireNonNull(rangeSet, shouldNotBeNull("rangeSet")::create);
    if (actual.isEmpty() && rangeSet.isEmpty()) return;
    failIfEmpty(rangeSet);
    assertRangeSetIntersectsAnyOfGivenValues(toArray(rangeSet.asRanges(), Range.class));
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  private void assertIntersectsAnyRangesOf(RangeSet<T> rangeSet) {
    requireNonNull(rangeSet, shouldNotBeNull("rangeSet")::create);
    if (actual.isEmpty() && rangeSet.isEmpty()) return;
    failIfEmpty(rangeSet);
    assertRangeSetIntersectsAnyOfGivenValues(toArray(rangeSet.asRanges(), Range.class));
```

### UnstableApiUsage
'asRanges()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
    if (actual.isEmpty() && rangeSet.isEmpty()) return;
    failIfEmpty(rangeSet);
    assertRangeSetIntersectsAnyOfGivenValues(toArray(rangeSet.asRanges(), Range.class));
  }

```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  private void assertIntersectsAll(Iterable<Range<T>> ranges) {
    requireNonNull(ranges, shouldNotBeNull("ranges")::create);
    if (actual.isEmpty() && !ranges.iterator().hasNext()) return;
    failIfEmpty(ranges, "ranges");
    assertRangeSetIntersectsGivenValues(toArray(ranges, Range.class));
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  private void assertEnclosesAnyOf(Range<T>[] ranges) {
    requireNonNull(ranges, shouldNotBeNull("ranges")::create);
    if (actual.isEmpty() && ranges.length == 0) return;
    failIfEmpty(ranges, "ranges");
    assertRangeSetEnclosesAnyOfGivenValues(ranges);
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  private void assertEncloses(Range<T>[] ranges) {
    requireNonNull(ranges, shouldNotBeNull("ranges")::create);
    if (actual.isEmpty() && ranges.length == 0) return;
    failIfEmpty(ranges, "ranges");
    assertRangeSetEnclosesGivenValues(ranges);
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  private void assertContains(T[] values) {
    requireNonNull(values, shouldNotBeNull("values")::create);
    if (actual.isEmpty() && values.length == 0) return;
    failIfEmpty(values, "values");
    assertRangeSetContainsGivenValues(actual, values);
```

### UnstableApiUsage
'intersects(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  private void assertRangeSetDoesNotIntersectGivenValues(Range<T>[] ranges) {
    List<?> intersected = stream(ranges).filter(actual::intersects).collect(toList());
    if (!intersected.isEmpty()) throwAssertionError(shouldNotIntersect(actual, ranges, intersected));
  }
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  private void assertEnclosesAnyRangesOf(Iterable<Range<T>> ranges) {
    requireNonNull(ranges, shouldNotBeNull("ranges")::create);
    if (actual.isEmpty() && !ranges.iterator().hasNext()) return;
    failIfEmpty(ranges, "ranges");
    assertRangeSetEnclosesAnyOfGivenValues(toArray(ranges, Range.class));
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private void assertEnclosesAnyRangesOf(RangeSet<T> rangeSet) {
    requireNonNull(rangeSet, shouldNotBeNull("rangeSet")::create);
    if (actual.isEmpty() && rangeSet.isEmpty()) return;
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  private void assertEnclosesAnyRangesOf(RangeSet<T> rangeSet) {
    requireNonNull(rangeSet, shouldNotBeNull("rangeSet")::create);
    if (actual.isEmpty() && rangeSet.isEmpty()) return;
    failIfEmpty(rangeSet);
    assertRangeSetEnclosesAnyOfGivenValues(toArray(rangeSet.asRanges(), Range.class));
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  private void assertEnclosesAnyRangesOf(RangeSet<T> rangeSet) {
    requireNonNull(rangeSet, shouldNotBeNull("rangeSet")::create);
    if (actual.isEmpty() && rangeSet.isEmpty()) return;
    failIfEmpty(rangeSet);
    assertRangeSetEnclosesAnyOfGivenValues(toArray(rangeSet.asRanges(), Range.class));
```

### UnstableApiUsage
'asRanges()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
    if (actual.isEmpty() && rangeSet.isEmpty()) return;
    failIfEmpty(rangeSet);
    assertRangeSetEnclosesAnyOfGivenValues(toArray(rangeSet.asRanges(), Range.class));
  }

```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private void assertDoesNotEncloseAnyRangesOf(RangeSet<T> rangeSet) {
    requireNonNull(rangeSet, shouldNotBeNull("rangeSet")::create);
    failIfEmpty(rangeSet);
```

### UnstableApiUsage
'asRanges()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
    requireNonNull(rangeSet, shouldNotBeNull("rangeSet")::create);
    failIfEmpty(rangeSet);
    assertRangeSetDoesNotEncloseGivenValues(toArray(rangeSet.asRanges(), Range.class));
  }

```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  private void assertIntersectsAnyRangesOf(Iterable<Range<T>> ranges) {
    requireNonNull(ranges, shouldNotBeNull("ranges")::create);
    if (actual.isEmpty() && !ranges.iterator().hasNext()) return;
    failIfEmpty(ranges, "ranges");
    assertRangeSetIntersectsAnyOfGivenValues(toArray(ranges, Range.class));
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  private void assertEmpty() {
    if (!actual.isEmpty()) throwAssertionError(shouldBeEmpty(actual));
  }

```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private void assertEnclosesAll(RangeSet<T> rangeSet) {
    requireNonNull(rangeSet, shouldNotBeNull("rangeSet")::create);
    if (actual.isEmpty() && rangeSet.isEmpty()) return;
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  private void assertEnclosesAll(RangeSet<T> rangeSet) {
    requireNonNull(rangeSet, shouldNotBeNull("rangeSet")::create);
    if (actual.isEmpty() && rangeSet.isEmpty()) return;
    failIfEmpty(rangeSet);
    assertRangeSetEnclosesGivenValues(toArray(rangeSet.asRanges(), Range.class));
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  private void assertEnclosesAll(RangeSet<T> rangeSet) {
    requireNonNull(rangeSet, shouldNotBeNull("rangeSet")::create);
    if (actual.isEmpty() && rangeSet.isEmpty()) return;
    failIfEmpty(rangeSet);
    assertRangeSetEnclosesGivenValues(toArray(rangeSet.asRanges(), Range.class));
```

### UnstableApiUsage
'asRanges()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
    if (actual.isEmpty() && rangeSet.isEmpty()) return;
    failIfEmpty(rangeSet);
    assertRangeSetEnclosesGivenValues(toArray(rangeSet.asRanges(), Range.class));
  }

```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  private void assertContainsAnyRangesOf(Iterable<T> values) {
    requireNonNull(values, shouldNotBeNull("values")::create);
    if (actual.isEmpty() && !values.iterator().hasNext()) return;
    failIfEmpty(values, "values");
    assertRangeSetContainsAnyGivenValues(actual, toArray(values, Comparable.class));
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
public class RangeSetAssert<T extends Comparable<T>> extends AbstractAssert<RangeSetAssert<T>, RangeSet<T>> {

  protected RangeSetAssert(RangeSet<T> actual) {
    super(actual, RangeSetAssert.class);
  }
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if range set is empty while actual is not empty.
   */
  public RangeSetAssert<T> intersectsAll(RangeSet<T> rangeSet) {
    isNotNull();
    assertIntersectsAll(rangeSet);
```

### UnstableApiUsage
'asRanges()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  private void assertHasSize(int expectedSize) {
    int actualSize = actual.asRanges().size();
    if (actualSize != expectedSize) throwAssertionError(shouldHaveSize(actual, actualSize, expectedSize));
  }
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if range set is empty.
   */
  public RangeSetAssert<T> doesNotEncloseAnyRangesOf(RangeSet<T> rangeSet) {
    isNotNull();
    assertDoesNotEncloseAnyRangesOf(rangeSet);
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  private void assertIntersectsAnyOf(Range<T>[] ranges) {
    requireNonNull(ranges, shouldNotBeNull("ranges")::create);
    if (actual.isEmpty() && ranges.length == 0) return;
    failIfEmpty(ranges, "ranges");
    assertRangeSetIntersectsAnyOfGivenValues(ranges);
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  @SuppressWarnings({ "rawtypes", "unchecked" })
  private void assertRangeSetContainsAnyGivenValues(RangeSet actual, Comparable[] values) {
    boolean match = stream(values).anyMatch(actual::contains);
    if (!match) throwAssertionError(shouldContainAnyOf(actual, values));
```

### UnstableApiUsage
'contains(C)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  @SuppressWarnings({ "rawtypes", "unchecked" })
  private void assertRangeSetContainsAnyGivenValues(RangeSet actual, Comparable[] values) {
    boolean match = stream(values).anyMatch(actual::contains);
    if (!match) throwAssertionError(shouldContainAnyOf(actual, values));
  }
```

### UnstableApiUsage
'encloses(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  private void assertRangeSetDoesNotEncloseGivenValues(Range<T>[] ranges) {
    List<?> enclosed = stream(ranges).filter(actual::encloses).collect(toList());
    if (!enclosed.isEmpty()) throwAssertionError(shouldNotEnclose(actual, ranges, enclosed));
  }
```

### UnstableApiUsage
'encloses(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  private void assertRangeSetEnclosesGivenValues(Range<T>[] ranges) {
    List<?> notEnclosed = stream(ranges).filter(range -> !actual.encloses(range)).collect(toList());
    if (!notEnclosed.isEmpty()) throwAssertionError(shouldEnclose(actual, ranges, notEnclosed));
  }
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
    requireNonNull(values, shouldNotBeNull("values")::create);
    // Should pass if both actual and expected are empty
    if (actual.isEmpty() && values.length == 0) return;
    failIfEmpty(values, "values");
    assertRangeSetContainsAnyGivenValues(actual, values);
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  private void assertEnclosesAll(Iterable<Range<T>> ranges) {
    requireNonNull(ranges, shouldNotBeNull("ranges")::create);
    if (actual.isEmpty() && !ranges.iterator().hasNext()) return;
    failIfEmpty(ranges, "ranges");
    assertRangeSetEnclosesGivenValues(toArray(ranges, Range.class));
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if range set is empty.
   */
  public RangeSetAssert<T> doesNotIntersectAnyRangeFrom(RangeSet<T> rangeSet) {
    isNotNull();
    assertDoesNotIntersectAnyRangeFrom(rangeSet);
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

/**
 * Assertion for guava {@link RangeSet}.
 * <p>
 * To create an instance of this class, invoke <code>{@link Assertions#assertThat(RangeSet)}</code>.
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
 * Assertion for guava {@link RangeSet}.
 * <p>
 * To create an instance of this class, invoke <code>{@link Assertions#assertThat(RangeSet)}</code>.
 * <p>
 *
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
 * @author Ilya Koshaleu
 */
public class RangeSetAssert<T extends Comparable<T>> extends AbstractAssert<RangeSetAssert<T>, RangeSet<T>> {

  protected RangeSetAssert(RangeSet<T> actual) {
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  /**
   * Verifies that the given {@link RangeSet} intersects at least one of the given ranges.
   * <p>
   * Example:
```

### UnstableApiUsage
'intersects(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  private void assertRangeSetIntersectsGivenValues(Range<T>[] ranges) {
    List<?> notIntersected = stream(ranges).filter(range -> !actual.intersects(range)).collect(toList());
    if (!notIntersected.isEmpty()) throwAssertionError(shouldIntersect(actual, ranges, notIntersected));
  }
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if range set is empty while actual is not empty.
   */
  public RangeSetAssert<T> enclosesAll(RangeSet<T> rangeSet) {
    isNotNull();
    assertEnclosesAll(rangeSet);
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  private void assertNotEmpty() {
    if (actual.isEmpty()) throwAssertionError(shouldNotBeEmpty());
  }

```

### UnstableApiUsage
'intersects(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  private void assertRangeSetIntersectsAnyOfGivenValues(Range<T>[] ranges) {
    boolean intersects = stream(ranges).anyMatch(actual::intersects);
    if (!intersects) throwAssertionError(shouldIntersectAnyOf(actual, ranges));
  }
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  private void assertNullOrEmpty() {
    if (actual != null && !actual.isEmpty()) throwAssertionError(shouldBeNullOrEmpty(actual));
  }

```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if range set is empty while actual is not empty.
   */
  public RangeSetAssert<T> enclosesAnyRangesOf(RangeSet<T> rangeSet) {
    isNotNull();
    assertEnclosesAnyRangesOf(rangeSet);
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  @SuppressWarnings({ "rawtypes", "unchecked" })
  private void assertRangeSetDoesNotContainGivenValues(RangeSet actual, Comparable[] values) {
    List<?> elementsFound = stream(values).filter(actual::contains).collect(toList());
    if (!elementsFound.isEmpty()) throwAssertionError(shouldNotContain(actual, values, elementsFound));
```

### UnstableApiUsage
'contains(C)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  @SuppressWarnings({ "rawtypes", "unchecked" })
  private void assertRangeSetDoesNotContainGivenValues(RangeSet actual, Comparable[] values) {
    List<?> elementsFound = stream(values).filter(actual::contains).collect(toList());
    if (!elementsFound.isEmpty()) throwAssertionError(shouldNotContain(actual, values, elementsFound));
  }
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
   * @throws IllegalArgumentException if range set is empty while actual is not empty.
   */
  public RangeSetAssert<T> intersectsAnyRangesOf(RangeSet<T> rangeSet) {
    isNotNull();
    assertIntersectsAnyRangesOf(rangeSet);
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  private void assertContainsAll(Iterable<T> values) {
    requireNonNull(values, shouldNotBeNull("values")::create);
    if (actual.isEmpty() && !values.iterator().hasNext()) return;
    failIfEmpty(values, "values");
    assertRangeSetContainsGivenValues(actual, toArray(values, Comparable.class));
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  @SuppressWarnings({ "rawtypes", "unchecked" })
  private void assertRangeSetContainsGivenValues(RangeSet actual, Comparable[] values) {
    List<?> elementsNotFound = stream(values).filter(value -> !actual.contains(value)).collect(toList());
    if (!elementsNotFound.isEmpty()) throwAssertionError(shouldContain(actual, values, elementsNotFound));
```

### UnstableApiUsage
'contains(C)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
  @SuppressWarnings({ "rawtypes", "unchecked" })
  private void assertRangeSetContainsGivenValues(RangeSet actual, Comparable[] values) {
    List<?> elementsNotFound = stream(values).filter(value -> !actual.contains(value)).collect(toList());
    if (!elementsNotFound.isEmpty()) throwAssertionError(shouldContain(actual, values, elementsNotFound));
  }
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private void assertIntersectsAll(RangeSet<T> rangeSet) {
    requireNonNull(rangeSet, shouldNotBeNull("rangeSet")::create);
    // Should pass if both actual and expected are empty
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
    requireNonNull(rangeSet, shouldNotBeNull("rangeSet")::create);
    // Should pass if both actual and expected are empty
    if (actual.isEmpty() && rangeSet.isEmpty()) return;
    failIfEmpty(rangeSet);
    assertRangeSetIntersectsGivenValues(toArray(rangeSet.asRanges(), Range.class));
```

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
    requireNonNull(rangeSet, shouldNotBeNull("rangeSet")::create);
    // Should pass if both actual and expected are empty
    if (actual.isEmpty() && rangeSet.isEmpty()) return;
    failIfEmpty(rangeSet);
    assertRangeSetIntersectsGivenValues(toArray(rangeSet.asRanges(), Range.class));
```

### UnstableApiUsage
'asRanges()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
    if (actual.isEmpty() && rangeSet.isEmpty()) return;
    failIfEmpty(rangeSet);
    assertRangeSetIntersectsGivenValues(toArray(rangeSet.asRanges(), Range.class));
  }

```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private void assertDoesNotIntersectAnyRangeFrom(RangeSet<T> rangeSet) {
    requireNonNull(rangeSet, shouldNotBeNull("rangeSet")::create);
    failIfEmpty(rangeSet);
```

### UnstableApiUsage
'asRanges()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `src/main/java/org/assertj/guava/api/RangeSetAssert.java`
#### Snippet
```java
    requireNonNull(rangeSet, shouldNotBeNull("rangeSet")::create);
    failIfEmpty(rangeSet);
    assertRangeSetDoesNotIntersectGivenValues(toArray(rangeSet.asRanges(), Range.class));
  }

```

