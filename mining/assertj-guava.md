# assertj-guava 
 
# Bad smells
I found 129 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 81 | false |
| JavadocReference | 40 | false |
| OptionalUsedAsFieldOrParameterType | 5 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| DuplicatedCode | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
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
in `src/main/java/org/assertj/guava/api/Assertions.java`
#### Snippet
```java
  }

  public static <T> OptionalAssert<T> assertThat(final Optional<T> actual) {
    return new OptionalAssert<>(actual);
  }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/assertj/guava/api/MultimapAssert.java`
#### Snippet
```java
    Set<V> valuesNotFound = newLinkedHashSet();
    for (V value : values) {
      if (!actual.containsValue(value)) {
        valuesNotFound.add(value);
      }
    }
    if (!valuesNotFound.isEmpty()) {
      throw assertionError(shouldContainValues(actual, values, valuesNotFound));
    }
    return myself;
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `org.assertj.core.error.BasicErrorMessageFactory`
in `src/main/java/org/assertj/guava/error/RangeShouldHaveUpperEndpointEqual.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.BasicErrorMessageFactory}</code>.
   *
   * @param format the format string.
```

### JavadocReference
Cannot resolve symbol `BasicErrorMessageFactory`
in `src/main/java/org/assertj/guava/error/RangeSetShouldNotIntersect.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link BasicErrorMessageFactory}</code>.
   * 
   * @param actual actual {@code RangeSet}.
```

### JavadocReference
Cannot resolve symbol `org.assertj.core.error.BasicErrorMessageFactory`
in `src/main/java/org/assertj/guava/error/RangeShouldBeOpenedInTheLowerBound.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.BasicErrorMessageFactory}</code>.
   *
   * @param format the format string.
```

### JavadocReference
Cannot resolve symbol `BasicErrorMessageFactory`
in `src/main/java/org/assertj/guava/error/RangeSetShouldNotEnclose.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link BasicErrorMessageFactory}</code>.
   * 
   * @param actual actual {@code RangeSet}.
```

### JavadocReference
Cannot resolve symbol `org.assertj.core.error.BasicErrorMessageFactory`
in `src/main/java/org/assertj/guava/error/RangeShouldBeClosedInTheLowerBound.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.BasicErrorMessageFactory}</code>.
   *
   * @param format the format string.
```

### JavadocReference
Cannot resolve symbol `org.assertj.core.error.ShouldContainKeys`
in `src/main/java/org/assertj/guava/error/ShouldContainKeys.java`
#### Snippet
```java
/**
 * Creates an error message indicating that an assertion that verifies a map contains some keys failed. TODO : move to
 * assertj-core to replace {@link org.assertj.core.error.ShouldContainKeys}.
 *
 * @author Joel Costigliola
```

### JavadocReference
Cannot resolve symbol `BasicErrorMessageFactory`
in `src/main/java/org/assertj/guava/error/RangeSetShouldEnclose.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link BasicErrorMessageFactory}</code>.
   *
   * @param actual actual {@code RangeSet}.
```

### JavadocReference
Cannot resolve symbol `ShouldContainValue`
in `src/main/java/org/assertj/guava/error/ShouldContainValues.java`
#### Snippet
```java
/**
 * Creates an error message indicating that an assertion that verifies a map contains some values failed. TODO : move to
 * assertj-core to replace {@link ShouldContainValue}
 *
 * @author Joel Costigliola
```

### JavadocReference
Cannot resolve symbol `AbstractCharSequenceAssert`
in `src/main/java/org/assertj/guava/api/OptionalAssert.java`
#### Snippet
```java
   * assertThat(optional).extractingCharSequence().startsWith("Bi");</code></pre>
   *
   * @return a new {@link AbstractCharSequenceAssert} for assertions chaining on the content of the Optional.
   * @throws AssertionError if the actual {@link Optional} is {@code null}.
   * @throws AssertionError if the actual {@link Optional} contains a null instance.
```

### JavadocReference
Cannot resolve symbol `AbstractObjectAssert`
in `src/main/java/org/assertj/guava/api/OptionalAssert.java`
#### Snippet
```java
   * assertThat(optional).extractingValue().isInstanceOf(Long.class);</code></pre>
   *
   * @return a new {@link AbstractObjectAssert} for assertions chaining on the content of the Optional.
   * @throws AssertionError if the actual {@link Optional} is {@code null}.
   * @throws AssertionError if the actual {@link Optional} contains a null instance.
```

### JavadocReference
Cannot resolve symbol `BasicErrorMessageFactory`
in `src/main/java/org/assertj/guava/error/RangeSetShouldIntersect.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link BasicErrorMessageFactory}</code>.
   *
   * @param actual actual {@link RangeSet}.
```

### JavadocReference
Cannot resolve symbol `org.assertj.core.error.BasicErrorMessageFactory`
in `src/main/java/org/assertj/guava/error/RangeShouldBeOpenedInTheUpperBound.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.BasicErrorMessageFactory}</code>.
   *
   * @param format the format string.
```

### JavadocReference
Cannot resolve symbol `BasicErrorMessageFactory`
in `src/main/java/org/assertj/guava/error/RangeSetShouldEncloseAnyOf.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link BasicErrorMessageFactory}</code>.
   *
   * @param actual actual {@code RangeSet}.
```

### JavadocReference
Cannot resolve symbol `org.assertj.core.error.BasicErrorMessageFactory`
in `src/main/java/org/assertj/guava/error/RangeShouldBeClosedInTheUpperBound.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.BasicErrorMessageFactory}</code>.
   *
   * @param format the format string.
```

### JavadocReference
Cannot resolve symbol `org.assertj.core.error.BasicErrorMessageFactory`
in `src/main/java/org/assertj/guava/error/RangeShouldHaveLowerEndpointEqual.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.core.error.BasicErrorMessageFactory}</code>.
   *
   * @param format the format string.
```

### JavadocReference
Cannot resolve symbol `BasicErrorMessageFactory`
in `src/main/java/org/assertj/guava/error/RangeSetShouldIntersectAnyOf.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link BasicErrorMessageFactory}</code>.
   *
   * @param actual actual {@link com.google.common.collect.RangeSet}.
```

### JavadocReference
Cannot resolve symbol `MapEntry`
in `src/main/java/org/assertj/guava/api/Assertions.java`
#### Snippet
```java

  /**
   * Only delegate to {@link MapEntry#entry(Object, Object)} so that Assertions offers a fully featured entry point to all
   * AssertJ Guava features (but you can use {@link MapEntry} if you prefer).
   * <p>
```

### JavadocReference
Cannot resolve symbol `entry(Object, Object)`
in `src/main/java/org/assertj/guava/api/Assertions.java`
#### Snippet
```java

  /**
   * Only delegate to {@link MapEntry#entry(Object, Object)} so that Assertions offers a fully featured entry point to all
   * AssertJ Guava features (but you can use {@link MapEntry} if you prefer).
   * <p>
```

### JavadocReference
Cannot resolve symbol `MapEntry`
in `src/main/java/org/assertj/guava/api/Assertions.java`
#### Snippet
```java
  /**
   * Only delegate to {@link MapEntry#entry(Object, Object)} so that Assertions offers a fully featured entry point to all
   * AssertJ Guava features (but you can use {@link MapEntry} if you prefer).
   * <p>
   * Typical usage is to call <code>entry</code> in MultimapAssert <code>contains</code> assertion as shown below :
```

### JavadocReference
Cannot resolve symbol `InstanceOfAssertFactory`
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java

  /**
   * {@link InstanceOfAssertFactory} for an {@link Optional}.
   *
   * @param <VALUE>    the {@code Optional} value type.
```

### JavadocReference
Cannot resolve symbol `InstanceOfAssertFactory`
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java

/**
 * Guava {@link InstanceOfAssertFactory InstanceOfAssertFactories} for {@link Assert#asInstanceOf(InstanceOfAssertFactory)}.
 *
 * @author Stefano Cordio
```

### JavadocReference
Cannot resolve symbol `Assert`
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java

/**
 * Guava {@link InstanceOfAssertFactory InstanceOfAssertFactories} for {@link Assert#asInstanceOf(InstanceOfAssertFactory)}.
 *
 * @author Stefano Cordio
```

### JavadocReference
Cannot resolve symbol `asInstanceOf(InstanceOfAssertFactory)`
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java

/**
 * Guava {@link InstanceOfAssertFactory InstanceOfAssertFactories} for {@link Assert#asInstanceOf(InstanceOfAssertFactory)}.
 *
 * @author Stefano Cordio
```

### JavadocReference
Cannot resolve symbol `InstanceOfAssertFactory`
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java

/**
 * Guava {@link InstanceOfAssertFactory InstanceOfAssertFactories} for {@link Assert#asInstanceOf(InstanceOfAssertFactory)}.
 *
 * @author Stefano Cordio
```

### JavadocReference
Cannot resolve symbol `InstanceOfAssertFactory`
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java

  /**
   * {@link InstanceOfAssertFactory} for a {@link ByteSource}.
   */
  InstanceOfAssertFactory<ByteSource, ByteSourceAssert> BYTE_SOURCE = new InstanceOfAssertFactory<>(ByteSource.class,
```

### JavadocReference
Cannot resolve symbol `InstanceOfAssertFactory`
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java

  /**
   * {@link InstanceOfAssertFactory} for a {@link RangeMap}.
   *
   * @param <K>       the {@code RangeMap} key type.
```

### JavadocReference
Cannot resolve symbol `InstanceOfAssertFactory`
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java

  /**
   * {@link InstanceOfAssertFactory} for a {@link Multimap}.
   *
   * @param <K>       the {@code Multimap} key type.
```

### JavadocReference
Cannot resolve symbol `InstanceOfAssertFactory`
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java

  /**
   * {@link InstanceOfAssertFactory} for a {@link Table}, assuming {@code Object} as row key type, column key type and
   * value type.
   *
```

### JavadocReference
Cannot resolve symbol `InstanceOfAssertFactory`
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java

  /**
   * {@link InstanceOfAssertFactory} for an {@link Optional}, assuming {@code Object} as value type.
   *
   * @see #optional(Class)
```

### JavadocReference
Cannot resolve symbol `InstanceOfAssertFactory`
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java

  /**
   * {@link InstanceOfAssertFactory} for a {@link Multiset}.
   *
   * @param <ELEMENT>   the {@code Multiset} element type.
```

### JavadocReference
Cannot resolve symbol `InstanceOfAssertFactory`
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java

  /**
   * {@link InstanceOfAssertFactory} for a {@link Table}.
   *
   * @param <R>           the {@code Table} row key type.
```

### JavadocReference
Cannot resolve symbol `InstanceOfAssertFactory`
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java

  /**
   * {@link InstanceOfAssertFactory} for a {@link RangeSet}.
   *
   * @param comparableType the comparable type instance.
```

### JavadocReference
Cannot resolve symbol `InstanceOfAssertFactory`
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java

  /**
   * {@link InstanceOfAssertFactory} for a {@link Multiset}, assuming {@code Object} as element type.
   *
   * @see #multiset(Class)
```

### JavadocReference
Cannot resolve symbol `InstanceOfAssertFactory`
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java

  /**
   * {@link InstanceOfAssertFactory} for a {@link Range}.
   *
   * @param <C>            the {@code Comparable} type.
```

### JavadocReference
Cannot resolve symbol `InstanceOfAssertFactory`
in `src/main/java/org/assertj/guava/api/InstanceOfAssertFactories.java`
#### Snippet
```java

  /**
   * {@link InstanceOfAssertFactory} for a {@link Multimap}, assuming {@code Object} as key and value types.
   *
   * @see #multimap(Class, Class)
```

### JavadocReference
Cannot resolve symbol `org.assertj.core.data.MapEntry`
in `src/main/java/org/assertj/guava/data/MapEntry.java`
#### Snippet
```java

/**
 * This is generic version of {@link org.assertj.core.data.MapEntry}
 *
 * @param <K> key type
```

### JavadocReference
Cannot resolve symbol `org.assertj.core.data.MapEntry`
in `src/main/java/org/assertj/guava/data/MapEntry.java`
#### Snippet
```java
 * @param <V> value type
 *
 * @deprecated use {@link org.assertj.core.data.MapEntry org.assertj.core.data.MapEntry} instead.
 */
@Deprecated
```

### JavadocReference
Cannot resolve symbol `org.assertj.core.data.MapEntry`
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java
   * spectralColors.put(Range.closedOpen(620, 750), "red");
   *
   * // entry can be statically imported from {@link org.assertj.core.data.MapEntry}
   * assertThat(spectralColors).contains(entry("400", "violet"), entry("650", "red"));</code></pre>
   *
```

### JavadocReference
Cannot resolve symbol `MapEntry`
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java

  /**
   * @deprecated use {@link #contains(MapEntry...)} instead (same method but using {@link MapEntry org.assertj.core.data.MapEntry} in place of {@link org.assertj.guava.data.MapEntry}.
   * <p>
   * Verifies that the actual {@link com.google.common.collect.RangeMap} contains the given entries.<br>
```

### JavadocReference
Cannot resolve symbol `MapEntry`
in `src/main/java/org/assertj/guava/api/RangeMapAssert.java`
#### Snippet
```java

  /**
   * @deprecated use {@link #contains(MapEntry...)} instead (same method but using {@link MapEntry org.assertj.core.data.MapEntry} in place of {@link org.assertj.guava.data.MapEntry}.
   * <p>
   * Verifies that the actual {@link com.google.common.collect.RangeMap} contains the given entries.<br>
```

## RuleId[id=OptionalGetWithoutIsPresent]
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
in `src/main/java/org/assertj/guava/error/OptionalShouldBePresentWithValue.java`
#### Snippet
```java
  public static <T> ErrorMessageFactory shouldBePresentWithValue(final Optional<T> actual, final Object value) {
    return new OptionalShouldBePresentWithValue("%nExpecting Optional to contain value %n  %s%n but contained %n  %s",
                                                value, actual.get());
  }

```

## RuleId[id=UnstableApiUsage]
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
   * @throws IllegalArgumentException if range set is empty.
   */
  public RangeSetAssert<T> doesNotEncloseAnyRangesOf(RangeSet<T> rangeSet) {
    isNotNull();
    assertDoesNotEncloseAnyRangesOf(rangeSet);
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
  public RangeSetAssert<T> enclosesAll(RangeSet<T> rangeSet) {
    isNotNull();
    assertEnclosesAll(rangeSet);
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

  /**
   * Verifies that the given {@link RangeSet} intersects at least one of the given ranges.
   * <p>
   * Example:
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

