# assertj-vavr 
 
# Bad smells
I found 40 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 20 | false |
| DuplicatedCode | 8 | false |
| FieldMayBeFinal | 5 | false |
| UNCHECKED_WARNING | 2 | false |
| AutoCloseableResource | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| UnnecessaryReturn | 1 | true |
| JavaReflectionMemberAccess | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
        doCommonContainsCheck(info, actual, entries);
        if (actual.isEmpty() && entries.length == 0) return;
        failIfEmptySinceActualIsNotEmpty(entries);
        for (Tuple2<? extends K, ? extends V> entry : entries) {
            if (containsEntry(actual, entry)) return;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
        doCommonContainsCheck(info, actual, entries);
        if (actual.isEmpty() && entries.length == 0) return;
        failIfEmptySinceActualIsNotEmpty(entries);
        final Set<Tuple2<K, V>> notFound = Array.of(entries).filter(entryNotPresentIn(actual)).toSet();
        if (isNotEmpty(notFound)) {
            throw failures.failure(info, shouldContain(actual, entries, notFound));
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
        failIfNullOrEmpty(entries);
        assertNotNull(info, actual);
        failIfEmptySinceActualIsNotEmpty(entries);
        final Set<Tuple2<K, V>> found = Array.of(entries).filter(actual::contains).toSet();
        if (isNotEmpty(found)) {
            throw failures.failure(info, shouldNotContain(actual, entries, found));
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
        doCommonContainsCheck(info, actual, keys);
        if (doCommonEmptinessChecks(actual, keys)) return;

        Set<K> expected = HashSet.of(keys);
        Set<K> notFound = expected.filter(keyNotPresentIn(actual.keySet()));
        if (isNotEmpty(notFound)) {
            throw failures.failure(info, shouldContainKeys(actual, notFound.toJavaSet()));
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
        doCommonContainsCheck(info, actual, keys);
        if (doCommonEmptinessChecks(actual, keys)) return;

        Set<K> expected = HashSet.of(keys);
        Set<K> found = expected.filter(keyPresentIn(actual.keySet()));
        if (isNotEmpty(found)) {
            throw failures.failure(info, shouldNotContainKeys(actual, found.toJavaSet()));
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
        doCommonContainsCheck(info, actual, keys);
        if (doCommonEmptinessChecks(actual, keys)) return;

        Set<K> expected = HashSet.of(keys);
        Set<K> notExpected = actual.keySet().filter(keyNotPresentIn(expected));
        if (isNotEmpty(notExpected)) {
            Set<K> notFound = expected.filter(keyNotPresentIn(actual.keySet()));
            throw failures.failure(info, shouldContainOnlyKeys(actual, expected, notFound, notExpected));
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
        assertNotNull(info, actual);
        checkNotNull(values, "The array of values to look for should not be null");
        if (actual.isEmpty() && values.length == 0) return;

        Set<V> expected = HashSet.of(values);
        Set<V> notFound = expected.filter(valueNotPresentIn(actual.values()));
        if (isNotEmpty(notFound)) throw failures.failure(info, shouldContainValues(actual, notFound.toJavaSet()));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
        assertNotNull(info, actual);
        checkNotNull(values, "The array of values to look for should not be null");
        if (actual.isEmpty() && values.length == 0) return;

        Set<V> expected = HashSet.of(values);
        Set<V> found = expected.filter(valuePresentIn(actual.values()));
        if (isNotEmpty(found)) throw failures.failure(info, shouldNotContainValues(actual, found.toJavaSet()));
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Unloaded' used without 'try'-with-resources statement
in `src/main/java/org/assertj/vavr/api/VavrAssumptions.java`
#### Snippet
```java
                .method(any())
                .intercept(ASSUMPTION)
                .make()
                .load(VavrAssumptions.class.getClassLoader(), classLoadingStrategy(assertionType))
                .getLoaded();
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'compare(T, T)' as a member of raw type 'java.util.Comparator'
in `src/main/java/org/assertj/vavr/api/AbstractSeqAssert.java`
#### Snippet
```java
                // Compare unique element with itself to verify that it is compatible with comparator (a ClassCastException is
                // thrown if not). We have to use a raw comparator to compare the unique element of actual ... :(
                rawComparator.compare(actual.get(0), actual.get(0));
                return;
            }
```

### UNCHECKED_WARNING
Unchecked call to 'compare(T, T)' as a member of raw type 'java.util.Comparator'
in `src/main/java/org/assertj/vavr/api/AbstractSeqAssert.java`
#### Snippet
```java
            for (int i = 0; i < actual.size() - 1; i++) {
                // Seq is sorted in comparator defined order if current element is less or equal than next element
                if (rawComparator.compare(actual.get(i), actual.get(i + 1)) > 0)
                    throwAssertionError(shouldBeSortedAccordingToGivenComparator(i, actual, comparator));
            }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `assertAll()`
in `src/main/java/org/assertj/vavr/api/soft/AutoCloseableSoftVavrAssertions.java`
#### Snippet
```java
/**
 * A version of {@link SoftVavrAssertions} that uses try-with-resources statement to automatically call
 * {@link SoftVavrAssertions#assertAll()} so that you don't forget to.
 *
 * <pre><code class='java'> public class SoftlyTest {
```

### JavadocReference
Cannot resolve symbol `Condition`
in `src/main/java/org/assertj/vavr/api/SeqShouldBeAtIndex.java`
#### Snippet
```java
/**
 * Creates an error message indicating that an assertion that verifies a group of elements contains a value at a given index that
 * satisfies a {@link Condition} failed.
 *
 * @author Michał Chmielarz
```

### JavadocReference
Cannot resolve symbol `org.assertj.core.api.Condition`
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Try} contains a value which satisfies the given {@link org.assertj.core.api.Condition}.
     *
     * @param condition the given condition.
```

### JavadocReference
Cannot resolve symbol `org.assertj.core.api.Assertions`
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java
     * actual type A <code>equals</code> method to compare the {@link io.vavr.control.Try} value's object for incoming assertion
     * checks. Private fields are included but this can be disabled using
     * {@link org.assertj.core.api.Assertions#setAllowExtractingPrivateFields(boolean)}.
     *
     * @return {@code this} assertion object.
```

### JavadocReference
Cannot resolve symbol `setAllowExtractingPrivateFields(boolean)`
in `src/main/java/org/assertj/vavr/api/AbstractTryAssert.java`
#### Snippet
```java
     * actual type A <code>equals</code> method to compare the {@link io.vavr.control.Try} value's object for incoming assertion
     * checks. Private fields are included but this can be disabled using
     * {@link org.assertj.core.api.Assertions#setAllowExtractingPrivateFields(boolean)}.
     *
     * @return {@code this} assertion object.
```

### JavadocReference
Cannot resolve symbol `Condition`
in `src/main/java/org/assertj/vavr/api/AbstractSeqAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual object at the given index in the actual group satisfies the given condition (alias of {@link #has(Condition, Index)}).
     *
     * @param condition the given condition.
```

### JavadocReference
Cannot resolve symbol `Index`
in `src/main/java/org/assertj/vavr/api/AbstractSeqAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual object at the given index in the actual group satisfies the given condition (alias of {@link #has(Condition, Index)}).
     *
     * @param condition the given condition.
```

### JavadocReference
Cannot resolve symbol `SoftAssertionsProvider`
in `src/main/java/org/assertj/vavr/api/soft/SoftVavrAssertions.java`
#### Snippet
```java

    /**
     * Convenience method for calling {@link SoftAssertionsProvider#assertSoftly} for these assertion types.
     * Equivalent to {@code SoftVavrAssertions.assertSoftly(SoftVavrAssertions.class, consumer)}.
     * @param softly the Consumer containing the code that will make the soft assertions.
```

### JavadocReference
Cannot resolve symbol `assertSoftly`
in `src/main/java/org/assertj/vavr/api/soft/SoftVavrAssertions.java`
#### Snippet
```java

    /**
     * Convenience method for calling {@link SoftAssertionsProvider#assertSoftly} for these assertion types.
     * Equivalent to {@code SoftVavrAssertions.assertSoftly(SoftVavrAssertions.class, consumer)}.
     * @param softly the Consumer containing the code that will make the soft assertions.
```

### JavadocReference
Cannot resolve symbol `MultipleFailuresError`
in `src/main/java/org/assertj/vavr/api/soft/SoftVavrAssertions.java`
#### Snippet
```java
     * @param softly the Consumer containing the code that will make the soft assertions.
     *     Takes one parameter (the SoftVavrAssertions instance used to make the assertions).
     * @throws MultipleFailuresError if possible or SoftAssertionError if any proxied assertion objects threw an {@link AssertionError}
     */
    public static void assertSoftly(Consumer<SoftVavrAssertions> softly) {
```

### JavadocReference
Cannot resolve symbol `assertAll()`
in `src/main/java/org/assertj/vavr/api/soft/JUnitSoftVavrAssertions.java`
#### Snippet
```java
/**
 * Same as {@link SoftVavrAssertions}, but with the following differences: <br>
 * First, it's a junit rule, which can be used without having to call {@link SoftVavrAssertions#assertAll() assertAll()},
 * example:
 * <pre><code class='java'> public class SoftlyTest {
```

### JavadocReference
Cannot resolve symbol `Assertions`
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java
     * actual type A <code>equals</code> method to compare the {@link Either} value's object for incoming assertion
     * checks. Private fields are included but this can be disabled using
     * {@link Assertions#setAllowExtractingPrivateFields(boolean)}.
     *
     * @return {@code this} assertion object.
```

### JavadocReference
Cannot resolve symbol `setAllowExtractingPrivateFields(boolean)`
in `src/main/java/org/assertj/vavr/api/AbstractEitherAssert.java`
#### Snippet
```java
     * actual type A <code>equals</code> method to compare the {@link Either} value's object for incoming assertion
     * checks. Private fields are included but this can be disabled using
     * {@link Assertions#setAllowExtractingPrivateFields(boolean)}.
     *
     * @return {@code this} assertion object.
```

### JavadocReference
Cannot resolve symbol `org.assertj.core.api.Condition`
in `src/main/java/org/assertj/vavr/api/AbstractValidationAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Validation} contains an invalid value which satisfies the given {@link org.assertj.core.api.Condition}.
     *
     * @param condition the given condition.
```

### JavadocReference
Cannot resolve symbol `org.assertj.core.api.Condition`
in `src/main/java/org/assertj/vavr/api/AbstractValidationAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link io.vavr.control.Validation} contains a valid value which satisfies the given {@link org.assertj.core.api.Condition}.
     *
     * @param condition the given condition.
```

### JavadocReference
Cannot resolve symbol `org.assertj.core.api.Assertions`
in `src/main/java/org/assertj/vavr/api/AbstractValidationAssert.java`
#### Snippet
```java
     * actual type A <code>equals</code> method to compare the {@link io.vavr.control.Validation} value's object for incoming assertion
     * checks. Private fields are included but this can be disabled using
     * {@link org.assertj.core.api.Assertions#setAllowExtractingPrivateFields(boolean)}.
     *
     * @return {@code this} assertion object.
```

### JavadocReference
Cannot resolve symbol `setAllowExtractingPrivateFields(boolean)`
in `src/main/java/org/assertj/vavr/api/AbstractValidationAssert.java`
#### Snippet
```java
     * actual type A <code>equals</code> method to compare the {@link io.vavr.control.Validation} value's object for incoming assertion
     * checks. Private fields are included but this can be disabled using
     * {@link org.assertj.core.api.Assertions#setAllowExtractingPrivateFields(boolean)}.
     *
     * @return {@code this} assertion object.
```

### JavadocReference
Cannot resolve symbol `Condition`
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java

    /**
     * Verifies that the actual {@link Option} contains a value which satisfies the given {@link Condition}.
     *
     * @param condition the given condition.
```

### JavadocReference
Cannot resolve symbol `Assertions`
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java
     * actual type A <code>equals</code> method to compare the {@link Option} value's object for incoming assertion
     * checks. Private fields are included but this can be disabled using
     * {@link Assertions#setAllowExtractingPrivateFields(boolean)}.
     *
     * @return {@code this} assertion object.
```

### JavadocReference
Cannot resolve symbol `setAllowExtractingPrivateFields(boolean)`
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java
     * actual type A <code>equals</code> method to compare the {@link Option} value's object for incoming assertion
     * checks. Private fields are included but this can be disabled using
     * {@link Assertions#setAllowExtractingPrivateFields(boolean)}.
     *
     * @return {@code this} assertion object.
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `conditions` may be 'final'
in `src/main/java/org/assertj/vavr/api/AbstractOptionAssert.java`
#### Snippet
```java
        AbstractValueAssert<SELF, Option<VALUE>> {

    private Conditions conditions = Conditions.instance();

    private ComparisonStrategy optionValueComparisonStrategy;
```

### FieldMayBeFinal
Field `failures` may be 'final'
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
    private static final Maps INSTANCE = new Maps();

    private Failures failures = Failures.instance();

    private Conditions conditions = Conditions.instance();
```

### FieldMayBeFinal
Field `conditions` may be 'final'
in `src/main/java/org/assertj/vavr/internal/Maps.java`
#### Snippet
```java
    private Failures failures = Failures.instance();

    private Conditions conditions = Conditions.instance();

    private Maps() {}
```

### FieldMayBeFinal
Field `conditions` may be 'final'
in `src/main/java/org/assertj/vavr/internal/Multimaps.java`
#### Snippet
```java
    private Failures failures = Failures.instance();

    private Conditions conditions = Conditions.instance();

    private Multimaps() {
```

### FieldMayBeFinal
Field `failures` may be 'final'
in `src/main/java/org/assertj/vavr/internal/Multimaps.java`
#### Snippet
```java
    private static final Multimaps INSTANCE = new Multimaps();

    private Failures failures = Failures.instance();

    private Conditions conditions = Conditions.instance();
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

## RuleId[id=IgnoreResultOfCall]
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

