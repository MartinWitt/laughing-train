# assertj-vavr 
 
# Bad smells
I found 167 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 104 | false |
| BoundedWildcard | 27 | false |
| RedundantSuppression | 24 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| IgnoreResultOfCall | 2 | false |
| UNUSED_IMPORT | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
| RedundantImplements | 1 | false |
| ReturnNull | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| UnnecessaryLocalVariable | 1 | true |
| UnnecessaryReturn | 1 | true |
## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ClassLoadingStrategyFactory` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/assertj/vavr/api/ClassLoadingStrategyFactory.java`
#### Snippet
```java
import java.lang.reflect.Method;

class ClassLoadingStrategyFactory {

    private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
```

### UtilityClassWithoutPrivateConstructor
Class `VavrAssumptions` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/assertj/vavr/api/VavrAssumptions.java`
#### Snippet
```java
import static org.assertj.vavr.api.ClassLoadingStrategyFactory.classLoadingStrategy;

public class VavrAssumptions {

    /**
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/OptionShouldBeEmpty.java`
#### Snippet
```java

/**
 * Build error message when an {@link io.vavr.control.Option} should be empty.
 *
 * @author Grzegorz Piwowarek
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/OptionShouldContain.java`
#### Snippet
```java

    /**
     * Indicates that the provided {@link io.vavr.control.Option} does not contain the provided argument.
     *
     * @param <VALUE>       the type of the value contained in the {@link Option}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/OptionShouldContain.java`
#### Snippet
```java

    /**
     * Indicates that the provided {@link io.vavr.control.Option} does not contain the provided argument (judging by reference
     * equality).
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/OptionShouldContain.java`
#### Snippet
```java

    /**
     * Indicates that an {@link io.vavr.control.Option} is empty so it doesn't contain the expected value.
     *
     * @param expectedValue the value we expect to be in an {@link Option}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/OptionShouldBePresent.java`
#### Snippet
```java
     *
     * @return a error message factory.
     * @throws java.lang.NullPointerException if option is null.
     */
    static OptionShouldBePresent shouldBePresent() {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/OptionShouldContainInstanceOf.java`
#### Snippet
```java

    /**
     * Indicates that a value of a specific class should be present in an empty {@link io.vavr.control.Option}.
     *
     * @param value Option to be checked.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/OptionShouldContainInstanceOf.java`
#### Snippet
```java
     * @param clazz expected class of a value
     * @return an error message factory.
     * @throws java.lang.NullPointerException if option is null.
     */
    static OptionShouldContainInstanceOf shouldContainInstanceOf(Object value, Class<?> clazz) {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/TryShouldContainInstanceOf.java`
#### Snippet
```java

    /**
     * Indicates that a value should be present in {@link io.vavr.control.Try}.
     *
     * @param value Try to be checked.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/TryShouldContainInstanceOf.java`
#### Snippet
```java
     * @param value Try to be checked.
     * @return an error message factory.
     * @throws java.lang.NullPointerException if Try is null.
     */
    static TryShouldContainInstanceOf shouldContainInstanceOf(Object value, Class<?> clazz) {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/TryAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link io.vavr.control.Try}.
 *
 * @param <VALUE> type of the value contained in the {@link io.vavr.control.Try}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/TryAssert.java`
#### Snippet
```java
 * Assertions for {@link io.vavr.control.Try}.
 *
 * @param <VALUE> type of the value contained in the {@link io.vavr.control.Try}.
 * @author Grzegorz Piwowarek
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/OptionAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link io.vavr.control.Option}.
 *
 * @param <VALUE> type of the value contained in the {@link io.vavr.control.Option}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/OptionAssert.java`
#### Snippet
```java
 * Assertions for {@link io.vavr.control.Option}.
 *
 * @param <VALUE> type of the value contained in the {@link io.vavr.control.Option}.
 * @author Grzegorz Piwowarek
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/EitherShouldContain.java`
#### Snippet
```java

    /**
     * Indicates that the provided {@link io.vavr.control.Either} does not contain the provided argument on expected side.
     *
     * @param either   the {@link io.vavr.control.Either} which contains a value.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/EitherShouldContain.java`
#### Snippet
```java
     * Indicates that the provided {@link io.vavr.control.Either} does not contain the provided argument on expected side.
     *
     * @param either   the {@link io.vavr.control.Either} which contains a value.
     * @param expected the value we expect to be in the provided {@link io.vavr.control.Either}.
     * @param <LEFT>   the type of the value contained in the {@link io.vavr.control.Either} on the left.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/EitherShouldContain.java`
#### Snippet
```java
     *
     * @param either   the {@link io.vavr.control.Either} which contains a value.
     * @param expected the value we expect to be in the provided {@link io.vavr.control.Either}.
     * @param <LEFT>   the type of the value contained in the {@link io.vavr.control.Either} on the left.
     * @param <RIGHT>  the type of the value contained in the {@link io.vavr.control.Either} on the right.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/EitherShouldContain.java`
#### Snippet
```java
     * @param either   the {@link io.vavr.control.Either} which contains a value.
     * @param expected the value we expect to be in the provided {@link io.vavr.control.Either}.
     * @param <LEFT>   the type of the value contained in the {@link io.vavr.control.Either} on the left.
     * @param <RIGHT>  the type of the value contained in the {@link io.vavr.control.Either} on the right.
     * @return an error message factory
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/EitherShouldContain.java`
#### Snippet
```java
     * @param expected the value we expect to be in the provided {@link io.vavr.control.Either}.
     * @param <LEFT>   the type of the value contained in the {@link io.vavr.control.Either} on the left.
     * @param <RIGHT>  the type of the value contained in the {@link io.vavr.control.Either} on the right.
     * @return an error message factory
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/EitherShouldContain.java`
#### Snippet
```java

    /**
     * Indicates that the provided {@link io.vavr.control.Either} does not contain the provided argument.
     *
     * @param either   the {@link io.vavr.control.Either} which contains a value.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/EitherShouldContain.java`
#### Snippet
```java
     * Indicates that the provided {@link io.vavr.control.Either} does not contain the provided argument.
     *
     * @param either   the {@link io.vavr.control.Either} which contains a value.
     * @param expected the value we expect to be in the provided {@link io.vavr.control.Either}.
     * @param <LEFT>   the type of the value contained in the {@link io.vavr.control.Either} on the left.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/EitherShouldContain.java`
#### Snippet
```java
     *
     * @param either   the {@link io.vavr.control.Either} which contains a value.
     * @param expected the value we expect to be in the provided {@link io.vavr.control.Either}.
     * @param <LEFT>   the type of the value contained in the {@link io.vavr.control.Either} on the left.
     * @param <RIGHT>  the type of the value contained in the {@link io.vavr.control.Either} on the right.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/EitherShouldContain.java`
#### Snippet
```java
     * @param either   the {@link io.vavr.control.Either} which contains a value.
     * @param expected the value we expect to be in the provided {@link io.vavr.control.Either}.
     * @param <LEFT>   the type of the value contained in the {@link io.vavr.control.Either} on the left.
     * @param <RIGHT>  the type of the value contained in the {@link io.vavr.control.Either} on the right.
     * @return an error message factory
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/EitherShouldContain.java`
#### Snippet
```java
     * @param expected the value we expect to be in the provided {@link io.vavr.control.Either}.
     * @param <LEFT>   the type of the value contained in the {@link io.vavr.control.Either} on the left.
     * @param <RIGHT>  the type of the value contained in the {@link io.vavr.control.Either} on the right.
     * @return an error message factory
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.collection` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/MultimapAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link io.vavr.collection.Multimap}.
 *
 * @param <KEY>   key type of the {@link Multimap}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/EitherAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link io.vavr.control.Either}.
 *
 * @param <LEFT>  type of the value on the left contained in the {@link io.vavr.control.Either}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/EitherAssert.java`
#### Snippet
```java
 * Assertions for {@link io.vavr.control.Either}.
 *
 * @param <LEFT>  type of the value on the left contained in the {@link io.vavr.control.Either}.
 * @param <RIGHT> type of the value on the right contained in the {@link io.vavr.control.Either}.
 * @author Alex Dukhno
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/EitherAssert.java`
#### Snippet
```java
 *
 * @param <LEFT>  type of the value on the left contained in the {@link io.vavr.control.Either}.
 * @param <RIGHT> type of the value on the right contained in the {@link io.vavr.control.Either}.
 * @author Alex Dukhno
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/TryShouldBeSuccess.java`
#### Snippet
```java
     *
     * @return a error message factory.
     * @throws java.lang.NullPointerException if Try is null.
     */
    static TryShouldBeSuccess shouldBeSuccess(Class<? extends Throwable> clazz, String message, StackTraceElement[] stackTrace) {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/TryShouldContain.java`
#### Snippet
```java

    /**
     * Indicates that the provided {@link io.vavr.control.Try} does not contain the provided argument.
     *
     * @param <VALUE>       the type of the value contained in the {@link Try}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/TryShouldContain.java`
#### Snippet
```java

    /**
     * Indicates that an {@link io.vavr.control.Try} is empty so it doesn't contain the expected value.
     *
     * @param expectedValue the value we expect to be in an {@link Try}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/TryShouldContain.java`
#### Snippet
```java

    /**
     * Indicates that the provided {@link io.vavr.control.Try} does not contain the provided argument (judging by reference
     * equality).
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/EitherShouldContainInstanceOf.java`
#### Snippet
```java

    /**
     * Indicates that a value should be present in a right-sided {@link io.vavr.control.Either}.
     *
     * @param value         Either to be checked.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/EitherShouldContainInstanceOf.java`
#### Snippet
```java
     * @param expectedClazz expected class of a right value
     * @return an error message factory.
     * @throws java.lang.NullPointerException if either is null.
     */
    static EitherShouldContainInstanceOf shouldContainOnRightInstanceOf(Object value, Class<?> expectedClazz) {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/EitherShouldContainInstanceOf.java`
#### Snippet
```java

    /**
     * Indicates that a value should be present in a left-sided {@link io.vavr.control.Either}.
     *
     * @param value         Either to be checked.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/EitherShouldContainInstanceOf.java`
#### Snippet
```java
     * @param expectedClazz expected class of a left value
     * @return an error message factory.
     * @throws java.lang.NullPointerException if either is null.
     */
    static EitherShouldContainInstanceOf shouldContainOnLeftInstanceOf(Object value,
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.collection` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/SeqShouldHaveAtIndex.java`
#### Snippet
```java

/**
 * Builds error message when a given condition is not met at specified index in actual {@link io.vavr.collection.Seq}
 *
 * @author Michał Chmielarz
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.collection` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/soft/StandardSoftVavrAssertionsProvider.java`
#### Snippet
```java

    /**
     * Creates assertion for {@link io.vavr.collection.Multimap}.
     *
     * @param <KEY>   key type of the {@link Multimap}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.collection` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/soft/StandardSoftVavrAssertionsProvider.java`
#### Snippet
```java

    /**
     * Creates assertion for {@link io.vavr.collection.Map}.
     *
     * @param <KEY>   key type of the {@link Map}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/soft/StandardSoftVavrAssertionsProvider.java`
#### Snippet
```java

    /**
     * Creates assertion for {@link io.vavr.control.Either}.
     *
     * @param <LEFT>  the type of a value contained on left by <code>actual {@link Either}</code>.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/soft/StandardSoftVavrAssertionsProvider.java`
#### Snippet
```java

    /**
     * Creates assertion for {@link io.vavr.control.Validation}.
     *
     * @param <INVALID> type of the value in the case of the invalid {@link Validation}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/soft/StandardSoftVavrAssertionsProvider.java`
#### Snippet
```java

    /**
     * Creates assertion for {@link io.vavr.control.Try}.
     *
     * @param <VALUE> the type of a value contained by <code>actual {@link Try}</code>.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.collection` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/soft/StandardSoftVavrAssertionsProvider.java`
#### Snippet
```java

    /**
     * Creates assertion for {@link io.vavr.collection.List}.
     *
     * @param <VALUE> the type of elements contained by <code>actual {@link List}</code>.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.collection` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/soft/StandardSoftVavrAssertionsProvider.java`
#### Snippet
```java

    /**
     * Creates assertion for {@link io.vavr.collection.Set}.
     *
     * @param <VALUE> the type of elements contained by <code> actual {@link Set}</code>.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/soft/StandardSoftVavrAssertionsProvider.java`
#### Snippet
```java

    /**
     * Creates assertion for {@link io.vavr.control.Option}.
     *
     * @param <VALUE> the type of a value contained by <code>actual {@link Option}</code>.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual left-sided {@link io.vavr.control.Either} contains a value that is an instance of the argument.
     *
     * @param clazz the expected class of the value inside the left-sided {@link io.vavr.control.Either}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java
     * Verifies that the actual left-sided {@link io.vavr.control.Either} contains a value that is an instance of the argument.
     *
     * @param clazz the expected class of the value inside the left-sided {@link io.vavr.control.Either}.
     * @return this assertion object.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Either} contains the instance given as an argument as the right value.
     *
     * @param expectedValue the expected value inside the {@link io.vavr.control.Either}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java
     * Verifies that the actual {@link io.vavr.control.Either} contains the instance given as an argument as the right value.
     *
     * @param expectedValue the expected value inside the {@link io.vavr.control.Either}.
     * @return this assertion object.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Either} is {@link io.vavr.control.Either.Right}
     * and contains the given value.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Either} is {@link io.vavr.control.Either.Right}
     * and contains the given value.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java
     * and contains the given value.
     *
     * @param expectedValue the expected value inside the {@link io.vavr.control.Either}.
     * @return this assertion object.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Either} contains the instance given as an argument as the left value.
     *
     * @param expectedValue the expected value inside the {@link io.vavr.control.Either}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java
     * Verifies that the actual {@link io.vavr.control.Either} contains the instance given as an argument as the left value.
     *
     * @param expectedValue the expected value inside the {@link io.vavr.control.Either}.
     * @return this assertion object.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Either} contains a left-sided value and gives this value to the given
     * {@link java.util.function.Consumer} for further assertions. Should be used as a way of deeper asserting on the
     * containing object, as further requirement(s) for the value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java
    /**
     * Verifies that the actual {@link io.vavr.control.Either} contains a left-sided value and gives this value to the given
     * {@link java.util.function.Consumer} for further assertions. Should be used as a way of deeper asserting on the
     * containing object, as further requirement(s) for the value.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java
     * assertThat(Either.right("something")).hasLeftValueSatisfying(it -&gt; {});</code></pre>
     *
     * @param requirement to further assert on the left-sided object contained inside the {@link io.vavr.control.Either}.
     * @return this assertion object.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual right-sided {@link io.vavr.control.Either} contains a value that is an instance of the argument.
     *
     * @param clazz the expected class of the value inside the right-sided {@link io.vavr.control.Either}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java
     * Verifies that the actual right-sided {@link io.vavr.control.Either} contains a value that is an instance of the argument.
     *
     * @param clazz the expected class of the value inside the right-sided {@link io.vavr.control.Either}.
     * @return this assertion object.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Either} is {@link io.vavr.control.Either.Left}
     * and contains the given value.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Either} is {@link io.vavr.control.Either.Left}
     * and contains the given value.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java
     * and contains the given value.
     *
     * @param expectedValue the expected value inside the {@link io.vavr.control.Either}.
     * @return this assertion object.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Either} contains a right-sided value and gives this value to the given
     * {@link java.util.function.Consumer} for further assertions. Should be used as a way of deeper asserting on the
     * containing object, as further requirement(s) for the value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java
    /**
     * Verifies that the actual {@link io.vavr.control.Either} contains a right-sided value and gives this value to the given
     * {@link java.util.function.Consumer} for further assertions. Should be used as a way of deeper asserting on the
     * containing object, as further requirement(s) for the value.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java
     * assertThat(Either.left(42)).hasRightValueSatisfying(it -&gt; {});</code></pre>
     *
     * @param requirement to further assert on the right-sided object contained inside the {@link io.vavr.control.Either}.
     * @return this assertion object.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.vavr.api` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java
     * @param <U> the type of a value contained in {@link Option}.
     * @param mapper the {@link Function} to use in the {@link Option#map(Function) map} operation.
     * @return a new {@link org.assertj.vavr.api.AbstractOptionAssert} for assertions chaining on the map of the Option.
     * @throws AssertionError if the actual {@link Option} is null.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link io.vavr.control.Option}.
 *
 * @param <SELF>  the "self" type of this assertion class.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java
 *
 * @param <SELF>  the "self" type of this assertion class.
 * @param <VALUE> type of the value contained in the {@link io.vavr.control.Option}.
 * @author Grzegorz Piwowarek
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.vavr.api` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java
     * @param <U> the type of a value contained in {@link Option}.
     * @param mapper the {@link Function} to use in the {@link Option#flatMap(Function) flatMap} operation.
     * @return a new {@link org.assertj.vavr.api.AbstractOptionAssert} for assertions chaining on the flatMap of the Option.
     * @throws AssertionError if the actual {@link Option} is null.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Option} is empty.
     *
     * @return this assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Option} contains the instance given as an argument.
     *
     * @param expectedValue the expected value inside the {@link io.vavr.control.Option}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java
     * Verifies that the actual {@link io.vavr.control.Option} contains the instance given as an argument.
     *
     * @param expectedValue the expected value inside the {@link io.vavr.control.Option}.
     * @return this assertion object.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Option} contains a value and gives this value to the given
     * {@link java.util.function.Consumer} for further assertions. Should be used as a way of deeper asserting on the
     * containing object, as further requirement(s) for the value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java
    /**
     * Verifies that the actual {@link io.vavr.control.Option} contains a value and gives this value to the given
     * {@link java.util.function.Consumer} for further assertions. Should be used as a way of deeper asserting on the
     * containing object, as further requirement(s) for the value.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java
     * containing object, as further requirement(s) for the value.
     *
     * @param requirement to further assert on the object contained inside the {@link io.vavr.control.Option}.
     * @return this assertion object.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Option} contains the given value.
     *
     * @param expectedValue the expected value inside the {@link io.vavr.control.Option}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java
     * Verifies that the actual {@link io.vavr.control.Option} contains the given value.
     *
     * @param expectedValue the expected value inside the {@link io.vavr.control.Option}.
     * @return this assertion object.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java

    /**
     * Verifies that there is a value present in the actual {@link io.vavr.control.Option}.
     *
     * @return this assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/ValidationAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link io.vavr.control.Validation}.
 *
 * @param <INVALID> type of the value in the case of the invalid {@link Validation}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.vavr.api` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java
     * @param mapper the {@link Function} to use in the {@link Try#map(Function) map} operation.
     *
     * @return a new {@link org.assertj.vavr.api.AbstractTryAssert} for assertions chaining on the map of the Try.
     * @throws AssertionError if the actual {@link Try} is null.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.vavr.api` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java
     * @param mapper the {@link Function} to use in the {@link Try#flatMap(Function) flatMap} operation.
     *
     * @return a new {@link org.assertj.vavr.api.AbstractTryAssert} for assertions chaining on the flatMap of the Try.
     * @throws AssertionError if the actual {@link Try} is null.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Try} contains a value and gives this value to the given
     * {@link java.util.function.Consumer} for further assertions. Should be used as a way of deeper asserting on the
     * containing object, as further requirement(s) for the value.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java
    /**
     * Verifies that the actual {@link io.vavr.control.Try} contains a value and gives this value to the given
     * {@link java.util.function.Consumer} for further assertions. Should be used as a way of deeper asserting on the
     * containing object, as further requirement(s) for the value.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java
     * containing object, as further requirement(s) for the value.
     *
     * @param requirement to further assert on the object contained inside the {@link io.vavr.control.Try}.
     * @return this assertion object.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Try} is a succeeded {code Try}.
     *
     * @return this assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Try} contains the instance given as an argument.
     *
     * @param expectedValue the expected value inside the {@link io.vavr.control.Try}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java
     * Verifies that the actual {@link io.vavr.control.Try} contains the instance given as an argument.
     *
     * @param expectedValue the expected value inside the {@link io.vavr.control.Try}.
     * @return this assertion object.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link io.vavr.control.Try}.
 *
 * @param <SELF>  the "self" type of this assertion class.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java
 *
 * @param <SELF>  the "self" type of this assertion class.
 * @param <VALUE> type of the value contained in the {@link io.vavr.control.Try}.
 * @author Grzegorz Piwowarek
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual @{@link io.vavr.control.Try} fails with specific message.
     *
     * @param exceptionMessage the expected exception message.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Try} is a failed {code Try}.
     *
     * @return this assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Try} contains the given value.
     *
     * @param expectedValue the expected value inside the {@link io.vavr.control.Try}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java
     * Verifies that the actual {@link io.vavr.control.Try} contains the given value.
     *
     * @param expectedValue the expected value inside the {@link io.vavr.control.Try}.
     * @return this assertion object.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/VavrAssertions.java`
#### Snippet
```java

    /**
     * Creates assertion for {@link io.vavr.control.Validation}.
     *
     * @param <INVALID> type of the value in the case of the invalid {@link Validation}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/VavrAssertions.java`
#### Snippet
```java

    /**
     * Creates assertion for {@link io.vavr.control.Either}.
     *
     * @param <LEFT>  the type of a value contained on left by <code>actual {@link Either}</code>.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.collection` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/VavrAssertions.java`
#### Snippet
```java

    /**
     * Creates assertion for {@link io.vavr.collection.Set}.
     *
     * @param <VALUE> the type of elements contained by <code> actual {@link Set}</code>.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/VavrAssertions.java`
#### Snippet
```java

    /**
     * Creates assertion for {@link io.vavr.control.Try}.
     *
     * @param <VALUE> the type of a value contained by <code>actual {@link Try}</code>.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.collection` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/VavrAssertions.java`
#### Snippet
```java

    /**
     * Creates assertion for {@link io.vavr.collection.List}.
     *
     * @param <VALUE> the type of elements contained by <code>actual {@link List}</code>.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/VavrAssertions.java`
#### Snippet
```java

    /**
     * Creates assertion for {@link io.vavr.control.Option}.
     *
     * @param <VALUE> the type of a value contained by <code>actual {@link Option}</code>.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.collection` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/VavrAssertions.java`
#### Snippet
```java

    /**
     * Creates assertion for {@link io.vavr.collection.Multimap}.
     *
     * @param <KEY>   key type of the {@link Multimap}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.collection` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/VavrAssertions.java`
#### Snippet
```java

    /**
     * Creates assertion for {@link io.vavr.collection.Map}.
     *
     * @param <KEY>   key type of the {@link Map}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.collection` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/MapAssert.java`
#### Snippet
```java

/**
 * Assertions for {@link io.vavr.collection.Map}.
 *
 * @param <KEY>  key type of the {@link Map}.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.control` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/api/VavrAssumptions.java`
#### Snippet
```java
     * Creates a new instance of <code>{@link TryAssert}</code> assumption.
     *
     * @param <VALUE> type of the value contained in the {@link io.vavr.control.Try}.
     * @param actual    the actual value.
     * @return the created assumption for assertion object.
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.collection` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
     * Verifies that the actual map contains only the given entries and nothing else, <b>in order</b>.<br>
     * This assertion should only be used with map that have a consistent iteration order (i.e. don't use it with
     * {@link io.vavr.collection.HashMap}).
     *
     * @param <K>     key type
```

### UnnecessaryFullyQualifiedName
Qualifier `io.vavr.collection` is unnecessary and can be removed
in `src/main/java/org/assertj/vavr/internal/Multimaps.java`
#### Snippet
```java
     * Verifies that the actual {@code Multimap} contains only the given entries and nothing else, <b>in order</b>.<br>
     * This assertion should only be used with {@code Multimap} that have a consistent iteration order (i.e. don't use it with
     * {@link io.vavr.collection.HashMultimap}).
     *
     * @param <K>     key type
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.Comparator;`
in `src/main/java/org/assertj/vavr/api/AbstractSetAssert.java`
#### Snippet
```java
import org.assertj.core.api.EnumerableAssert;

import java.util.Comparator;

abstract class AbstractSetAssert<SELF extends AbstractSetAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT>,
```

## RuleId[id=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
Cannot resolve method 'privateLookupIn'
in `src/main/java/org/assertj/vavr/api/ClassLoadingStrategyFactory.java`
#### Snippet
```java
    private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
    private static final Method PRIVATE_LOOKUP_IN = Try.of(
        () -> MethodHandles.class.getMethod("privateLookupIn", Class.class, MethodHandles.Lookup.class)
    ).getOrElse((Method) null);

```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `EnumerableAssert`
in `src/main/java/org/assertj/vavr/api/AbstractSetAssert.java`
#### Snippet
```java
        ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
        extends AbstractTraversableAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT>
        implements EnumerableAssert<SELF, ELEMENT> {

    AbstractSetAssert(ACTUAL actual, Class<?> selfType) {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/assertj/vavr/api/VavrAssumptions.java`
#### Snippet
```java
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-15-18-12-52.698.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`actual.size() == 0` can be replaced with 'actual.isEmpty()'
in `src/main/java/org/assertj/vavr/api/AbstractSeqAssert.java`
#### Snippet
```java
            // Empty collections are considered sorted even if comparator can't be applied to their element type
            // We can't verify that point because of erasure type at runtime.
            if (actual.size() == 0) return;
            Comparator rawComparator = comparator;
            if (actual.size() == 1) {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `rawComparator` is redundant
in `src/main/java/org/assertj/vavr/api/AbstractSeqAssert.java`
#### Snippet
```java
            // We can't verify that point because of erasure type at runtime.
            if (actual.size() == 0) return;
            Comparator rawComparator = comparator;
            if (actual.size() == 1) {
                // Compare unique element with itself to verify that it is compatible with comparator (a ClassCastException is
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/org/assertj/vavr/api/AbstractSeqAssert.java`
#### Snippet
```java
                    shouldHaveComparableElementsAccordingToGivenComparator(actual, comparator));
        }
        return;
    }

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super LEFT`
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java
     * @return this assertion object.
     */
    public SELF hasLeftValueSatisfying(Consumer<LEFT> requirement) {
        assertIsLeft();
        requirement.accept(actual.getLeft());
```

### BoundedWildcard
Can generalize to `? super RIGHT`
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java
     * @return this assertion object.
     */
    public SELF hasRightValueSatisfying(Consumer<RIGHT> requirement) {
        assertIsRight();
        requirement.accept(actual.get());
```

### BoundedWildcard
Can generalize to `? extends Option`
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java
     */
    @CheckReturnValue
    public <U> AbstractOptionAssert<?, U> flatMap(Function<? super VALUE, Option<U>> mapper) {
        isNotNull();
        return VavrAssertions.assertThat(actual.flatMap(mapper));
```

### BoundedWildcard
Can generalize to `? super VALUE`
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java
     * @return this assertion object.
     */
    public SELF hasValueSatisfying(Consumer<VALUE> requirement) {
        assertValueIsPresent();
        requirement.accept(actual.get());
```

### BoundedWildcard
Can generalize to `? extends Try`
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java
     */
    @CheckReturnValue
    public <U> AbstractTryAssert<?, U> flatMap(Function<? super VALUE, Try<U>> mapper) {
        isNotNull();
        return VavrAssertions.assertThat(actual.flatMap(mapper));
```

### BoundedWildcard
Can generalize to `? super VALUE`
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java
     * @return this assertion object.
     */
    public SELF hasValueSatisfying(Consumer<VALUE> requirement) {
        assertIsSuccess();
        requirement.accept(actual.get());
```

### BoundedWildcard
Can generalize to `? extends ASSERTION`
in `src/main/java/org/assertj/vavr/api/VavrAssumptions.java`
#### Snippet
```java
    }

    private static <ASSERTION> Class<? extends ASSERTION> generateAssumptionClass(Class<ASSERTION> assertionType) {
        return BYTE_BUDDY.subclass(assertionType)
                .method(any())
```

### BoundedWildcard
Can generalize to `? super V`
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
    }

    private static <V> Predicate<V> valueNotPresentIn(Seq<V> elements) {
        return not(valuePresentIn(elements));
    }
```

### BoundedWildcard
Can generalize to `? super V`
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
     * @throws NullPointerException if values vararg is {@code null}
     */
    public <K, V> void assertContainsValues(AssertionInfo info, Map<K, V> actual,
                                            @SuppressWarnings("unchecked") V... values) {
        assertNotNull(info, actual);
```

### BoundedWildcard
Can generalize to `? super K`
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
    }

    private static <K> Predicate<K> keyNotPresentIn(Set<K> elements) {
        return not(keyPresentIn(elements));
    }
```

### BoundedWildcard
Can generalize to `? super V`
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
    }

    private static <V> Predicate<V> valuePresentIn(Seq<V> elements) {
        return elements::contains;
    }
```

### BoundedWildcard
Can generalize to `? super K`
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
    }

    public <K, V> void assertContainsAnyOf(AssertionInfo info, Map<K, V> actual,
                                           Tuple2<K, V>[] entries) {
        doCommonContainsCheck(info, actual, entries);
```

### BoundedWildcard
Can generalize to `? super V`
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
    }

    public <K, V> void assertContainsAnyOf(AssertionInfo info, Map<K, V> actual,
                                           Tuple2<K, V>[] entries) {
        doCommonContainsCheck(info, actual, entries);
```

### BoundedWildcard
Can generalize to `? super V`
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
     * @throws NullPointerException if values vararg is {@code null}
     */
    public <K, V> void assertDoesNotContainValues(AssertionInfo info, Map<K, V> actual,
                                                  @SuppressWarnings("unchecked") V... values) {
        assertNotNull(info, actual);
```

### BoundedWildcard
Can generalize to `? super K`
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
     * @throws AssertionError           if the given {@code Map} does not contain the given keys
     */
    public <K, V> void assertContainsKeys(AssertionInfo info, Map<K, V> actual,
                                          @SuppressWarnings("unchecked") K... keys) {
        doCommonContainsCheck(info, actual, keys);
```

### BoundedWildcard
Can generalize to `? super K`
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
     * @throws AssertionError           if the given {@code Map} contains the given keys
     */
    public <K, V> void assertDoesNotContainKeys(AssertionInfo info, Map<K, V> actual,
                                                @SuppressWarnings("unchecked") K... keys) {
        doCommonContainsCheck(info, actual, keys);
```

### BoundedWildcard
Can generalize to `? super K`
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
    }

    private static <K> Predicate<K> keyPresentIn(Set<K> elements) {
        return elements::contains;
    }
```

### BoundedWildcard
Can generalize to `? super V`
in `src/main/java/org/assertj/vavr/internal/Multimaps.java`
#### Snippet
```java
     * @throws NullPointerException if values vararg is {@code null}
     */
    public <K, V> void assertDoesNotContainValues(AssertionInfo info, Multimap<K, V> actual,
                                                  @SuppressWarnings("unchecked") V... values) {
        assertNotNull(info, actual);
```

### BoundedWildcard
Can generalize to `? super K`
in `src/main/java/org/assertj/vavr/internal/Multimaps.java`
#### Snippet
```java
    }

    public <K, V> void assertContainsAnyOf(AssertionInfo info, Multimap<K, V> actual,
                                           Tuple2<K, V>[] entries) {
        doCommonContainsCheck(info, actual, entries);
```

### BoundedWildcard
Can generalize to `? super V`
in `src/main/java/org/assertj/vavr/internal/Multimaps.java`
#### Snippet
```java
    }

    public <K, V> void assertContainsAnyOf(AssertionInfo info, Multimap<K, V> actual,
                                           Tuple2<K, V>[] entries) {
        doCommonContainsCheck(info, actual, entries);
```

### BoundedWildcard
Can generalize to `? super V`
in `src/main/java/org/assertj/vavr/internal/Multimaps.java`
#### Snippet
```java
    }

    private static <V> Predicate<V> valuePresentIn(Traversable<V> elements) {
        return elements::contains;
    }
```

### BoundedWildcard
Can generalize to `? super K`
in `src/main/java/org/assertj/vavr/internal/Multimaps.java`
#### Snippet
```java
     * @throws AssertionError           if the given {@code Multimap} does not contain the given keys
     */
    public <K, V> void assertContainsKeys(AssertionInfo info, Multimap<K, V> actual,
                                          @SuppressWarnings("unchecked") K... keys) {
        doCommonContainsCheck(info, actual, keys);
```

### BoundedWildcard
Can generalize to `? super K`
in `src/main/java/org/assertj/vavr/internal/Multimaps.java`
#### Snippet
```java
    }

    private static <K> Predicate<K> keyNotPresentIn(Set<K> elements) {
        return not(keyPresentIn(elements));
    }
```

### BoundedWildcard
Can generalize to `? super K`
in `src/main/java/org/assertj/vavr/internal/Multimaps.java`
#### Snippet
```java
    }

    private static <K> Predicate<K> keyPresentIn(Set<K> elements) {
        return elements::contains;
    }
```

### BoundedWildcard
Can generalize to `? super V`
in `src/main/java/org/assertj/vavr/internal/Multimaps.java`
#### Snippet
```java
    }

    private static <V> Predicate<V> valueNotPresentIn(Traversable<V> elements) {
        return not(valuePresentIn(elements));
    }
```

### BoundedWildcard
Can generalize to `? super V`
in `src/main/java/org/assertj/vavr/internal/Multimaps.java`
#### Snippet
```java
     * @throws NullPointerException if values vararg is {@code null}
     */
    public <K, V> void assertContainsValues(AssertionInfo info, Multimap<K, V> actual,
                                            @SuppressWarnings("unchecked") V... values) {
        assertNotNull(info, actual);
```

### BoundedWildcard
Can generalize to `? super K`
in `src/main/java/org/assertj/vavr/internal/Multimaps.java`
#### Snippet
```java
     * @throws AssertionError           if the given {@code Multimap} contains the given keys
     */
    public <K, V> void assertDoesNotContainKeys(AssertionInfo info, Multimap<K, V> actual,
                                                @SuppressWarnings("unchecked") K... keys) {
        doCommonContainsCheck(info, actual, keys);
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/api/AbstractMapAssert.java`
#### Snippet
```java
     * @throws AssertionError       if the actual map does not contain the given entries.
     */
    public SELF contains(@SuppressWarnings("unchecked") Tuple2<KEY, VALUE>... entries) {
        maps.assertContains(info, actual, entries);
        return myself;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/api/AbstractMapAssert.java`
#### Snippet
```java
     * @throws AssertionError       if the actual map does not contain any of the given entries.
     */
    public SELF containsAnyOf(@SuppressWarnings("unchecked") Tuple2<KEY, VALUE>... entries) {
        maps.assertContainsAnyOf(info, actual, entries);
        return myself;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/api/AbstractMapAssert.java`
#### Snippet
```java
     *                                  or entries are the same but the order is not.
     */
    public SELF containsExactly(@SuppressWarnings("unchecked") Tuple2<? extends KEY, ? extends VALUE>... entries) {
        maps.assertContainsExactly(info, actual, entries);
        return myself;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/api/AbstractMapAssert.java`
#### Snippet
```java
     * @throws NullPointerException     if the array of keys is {@code null}.
     */
    public SELF containsKeys(@SuppressWarnings("unchecked") KEY... keys) {
        maps.assertContainsKeys(info, actual, keys);
        return myself;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/api/AbstractMapAssert.java`
#### Snippet
```java
     * @throws NullPointerException     if the array of keys is {@code null}.
     */
    public SELF doesNotContainKeys(@SuppressWarnings("unchecked") KEY... keys) {
        maps.assertDoesNotContainKeys(info, actual, keys);
        return myself;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/api/AbstractMapAssert.java`
#### Snippet
```java
     * @throws AssertionError if the actual map does not contain the given values.
     */
    public SELF containsValues(@SuppressWarnings("unchecked") VALUE... values) {
        maps.assertContainsValues(info, actual, values);
        return myself;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/api/AbstractMapAssert.java`
#### Snippet
```java
     * @throws AssertionError if the actual map contains the given values.
     */
    public SELF doesNotContainValues(@SuppressWarnings("unchecked") VALUE... values) {
        maps.assertDoesNotContainValues(info, actual, values);
        return myself;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/api/AbstractMultimapAssert.java`
#### Snippet
```java
     * @throws AssertionError       if the actual multimap does not contain the given entries.
     */
    public SELF contains(@SuppressWarnings("unchecked") Tuple2<KEY, VALUE>... entries) {
        multimaps.assertContains(info, actual, entries);
        return myself;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/api/AbstractMultimapAssert.java`
#### Snippet
```java
     * @throws AssertionError       if the actual multimap does not contain any of the given entries.
     */
    public SELF containsAnyOf(@SuppressWarnings("unchecked") Tuple2<KEY, VALUE>... entries) {
        multimaps.assertContainsAnyOf(info, actual, entries);
        return myself;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/api/AbstractMultimapAssert.java`
#### Snippet
```java
     *                                  or entries are the same but the order is not.
     */
    public SELF containsExactly(@SuppressWarnings("unchecked") Tuple2<? extends KEY, ? extends VALUE>... entries) {
        multimaps.assertContainsExactly(info, actual, entries);
        return myself;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/api/AbstractMultimapAssert.java`
#### Snippet
```java
     * @throws NullPointerException     if the array of keys is {@code null}.
     */
    public SELF containsKeys(@SuppressWarnings("unchecked") KEY... keys) {
        multimaps.assertContainsKeys(info, actual, keys);
        return myself;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/api/AbstractMultimapAssert.java`
#### Snippet
```java
     * @throws NullPointerException     if the array of keys is {@code null}.
     */
    public SELF doesNotContainKeys(@SuppressWarnings("unchecked") KEY... keys) {
        multimaps.assertDoesNotContainKeys(info, actual, keys);
        return myself;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/api/AbstractMultimapAssert.java`
#### Snippet
```java
     * @throws AssertionError if the actual multimap does not contain the given values.
     */
    public SELF containsValues(@SuppressWarnings("unchecked") VALUE... values) {
        multimaps.assertContainsValues(info, actual, values);
        return myself;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/api/AbstractMultimapAssert.java`
#### Snippet
```java
     * @throws AssertionError if the actual multimap contains the given values.
     */
    public SELF doesNotContainValues(@SuppressWarnings("unchecked") VALUE... values) {
        multimaps.assertDoesNotContainValues(info, actual, values);
        return myself;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
     */
    public <K, V> void assertContainsKeys(AssertionInfo info, Map<K, V> actual,
                                          @SuppressWarnings("unchecked") K... keys) {
        doCommonContainsCheck(info, actual, keys);
        if (doCommonEmptinessChecks(actual, keys)) return;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
     */
    public <K, V> void assertDoesNotContainKeys(AssertionInfo info, Map<K, V> actual,
                                                @SuppressWarnings("unchecked") K... keys) {
        doCommonContainsCheck(info, actual, keys);
        if (doCommonEmptinessChecks(actual, keys)) return;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
     */
    public <K, V> void assertContainsExactly(AssertionInfo info, Map<K, V> actual,
                                             @SuppressWarnings("unchecked") Tuple2<? extends K, ? extends V>... entries) {
        doCommonContainsCheck(info, actual, entries);
        if (actual.isEmpty() && entries.length == 0) return;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
     */
    public <K, V> void assertContainsValues(AssertionInfo info, Map<K, V> actual,
                                            @SuppressWarnings("unchecked") V... values) {
        assertNotNull(info, actual);
        checkNotNull(values, "The array of values to look for should not be null");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
     */
    public <K, V> void assertDoesNotContainValues(AssertionInfo info, Map<K, V> actual,
                                                  @SuppressWarnings("unchecked") V... values) {
        assertNotNull(info, actual);
        checkNotNull(values, "The array of values to look for should not be null");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/internal/Multimaps.java`
#### Snippet
```java
     */
    public <K, V> void assertContainsExactly(AssertionInfo info, Multimap<K, V> actual,
                                             @SuppressWarnings("unchecked") Tuple2<? extends K, ? extends V>... entries) {
        doCommonContainsCheck(info, actual, entries);
        if (actual.isEmpty() && entries.length == 0) return;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/internal/Multimaps.java`
#### Snippet
```java
     */
    public <K, V> void assertContainsKeys(AssertionInfo info, Multimap<K, V> actual,
                                          @SuppressWarnings("unchecked") K... keys) {
        doCommonContainsCheck(info, actual, keys);
        if (doCommonEmptinessChecks(actual, keys)) return;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/internal/Multimaps.java`
#### Snippet
```java
     */
    public <K, V> void assertDoesNotContainKeys(AssertionInfo info, Multimap<K, V> actual,
                                                @SuppressWarnings("unchecked") K... keys) {
        doCommonContainsCheck(info, actual, keys);
        if (doCommonEmptinessChecks(actual, keys)) return;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/internal/Multimaps.java`
#### Snippet
```java
     */
    public <K, V> void assertContainsValues(AssertionInfo info, Multimap<K, V> actual,
                                            @SuppressWarnings("unchecked") V... values) {
        assertNotNull(info, actual);
        checkNotNull(values, "The array of values to look for should not be null");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/assertj/vavr/internal/Multimaps.java`
#### Snippet
```java
     */
    public <K, V> void assertDoesNotContainValues(AssertionInfo info, Multimap<K, V> actual,
                                                  @SuppressWarnings("unchecked") V... values) {
        assertNotNull(info, actual);
        checkNotNull(values, "The array of values to look for should not be null");
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `AbstractIterableAssert.usingElementComparator()` is ignored
in `src/main/java/org/assertj/vavr/api/SetAssert.java`
#### Snippet
```java
            Comparator<ELEMENT> comparator = ((SortedSet<ELEMENT>) set).comparator();
            if (comparator != null) {
                usingElementComparator(comparator);
            }
        }
```

### IgnoreResultOfCall
Result of `Comparator.compare()` is ignored
in `src/main/java/org/assertj/vavr/api/AbstractSeqAssert.java`
#### Snippet
```java
                // Compare unique element with itself to verify that it is compatible with comparator (a ClassCastException is
                // thrown if not). We have to use a raw comparator to compare the unique element of actual ... :(
                rawComparator.compare(actual.get(0), actual.get(0));
                return;
            }
```

