# mug 
 
# Bad smells
I found 138 bad smells with 9 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 25 | false |
| OptionalUsedAsFieldOrParameterType | 21 | false |
| AutoCloseableResource | 17 | false |
| JavadocDeclaration | 9 | false |
| UnnecessaryModifier | 7 | true |
| DuplicatedCode | 7 | false |
| DeprecatedIsStillUsed | 6 | false |
| FinalMethodInFinalClass | 6 | false |
| NullableProblems | 6 | false |
| Deprecation | 5 | false |
| DataFlowIssue | 4 | false |
| OptionalGetWithoutIsPresent | 4 | false |
| OptionalIsPresent | 3 | false |
| UnnecessarySemicolon | 2 | false |
| EmptyStatementBody | 2 | false |
| UnnecessaryStringEscape | 2 | true |
| RedundantTypeArguments | 2 | false |
| ForwardCompatibility | 2 | false |
| IgnoreResultOfCall | 2 | false |
| SimplifyStreamApiCallChains | 1 | false |
| RedundantComparatorComparing | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| FieldMayBeFinal | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `mug/src/main/java/com/google/mu/util/BiOptional.java`
#### Snippet
```java
   */
  public static <T> BiOptional<T, T> from(Optional<T> optional) {
    return optional.isPresent() ? of(optional.get(), optional.get()) : empty();
  }

```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
   */
  public static <T> Set<T> asSet(Optional<? extends T> optional) {
    return optional.isPresent() ? Collections.singleton(optional.get()) : Collections.emptySet();
  }

```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
  private static <K, V> BiOptional<K, V> fromOptionalEntry(
      Optional<? extends Map.Entry<? extends K, ? extends V>> optional) {
    return optional.isPresent()
        ? BiOptional.of(optional.get().getKey(), optional.get().getValue())
        : BiOptional.empty();
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `mug/src/main/java/com/google/mu/util/Selection.java`
#### Snippet
```java
   * @since 4.7
   */
  static final class Parser {
    private final Substring.Pattern delimiter;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `mug/src/main/java/com/google/mu/util/Both.java`
#### Snippet
```java
   * @since 5.8
   */
  public static <A, B> Both<A, B> of(A a, B b) {
    return new BiOptional.Present<>(a, b);
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `mug/src/main/java/com/google/mu/util/CharPredicate.java`
#### Snippet
```java

  /** Equivalent to the {@code [a-zA-Z0-9_]} character class. */
  static CharPredicate WORD = ALPHA .orRange('0', '9').or('_');

  /** Corresponds to the ASCII characters. */
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `mug/src/main/java/com/google/mu/util/CharPredicate.java`
#### Snippet
```java

  /** Corresponds to the ASCII characters. */
  static CharPredicate ASCII = new CharPredicate() {
    @Override public boolean test(char c) {
      return c <= '\u007f';
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `mug/src/main/java/com/google/mu/util/CharPredicate.java`
#### Snippet
```java

  /** Corresponds to all characters. */
  static CharPredicate ANY = new CharPredicate() {
    @Override public boolean test(char c) {
      return true;
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `mug/src/main/java/com/google/mu/util/CharPredicate.java`
#### Snippet
```java

  /** Equivalent to the {@code [a-zA-Z]} character class. */
  static CharPredicate ALPHA = range('a', 'z').orRange('A', 'Z');

  /** Equivalent to the {@code [a-zA-Z0-9_]} character class. */
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `mug/src/main/java/com/google/mu/util/CharPredicate.java`
#### Snippet
```java

  /** Corresponds to no characters. */
  static CharPredicate NONE = new CharPredicate() {
    @Override public boolean test(char c) {
      return false;
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `ordinal` is inaccessible from here
in `mug/src/main/java/com/google/mu/util/Ordinal.java`
#### Snippet
```java
   * Returns instance corresponding to the ordinal of the Enum object {@code e}.
   *
   * <p>Note that given {@link Enum#ordinal} is 0-based, an enum with {@code ordinal() == 0}
   * maps to {@link #first}, or {@code of(1)}.
   *
```

### JavadocReference
Cannot resolve symbol `NULL`
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/MoreValues.java`
#### Snippet
```java
  /**
   * Returns {@link ListValue} wrapping {@code values}.
   * Null structs are converted to {@link NULL}.
   */
  public static ListValue listValueOf(@Nullable Struct... values) {
```

### JavadocReference
Cannot resolve symbol `NULL`
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/MoreValues.java`
#### Snippet
```java
  /**
   * Returns {@link ListValue} wrapping {@code values}.
   * Null strings are converted to {@link NULL}.
   */
  public static ListValue listValueOf(@Nullable String... values) {
```

### JavadocReference
Symbol `com.google.common.collect.Ordering` is inaccessible from here
in `mug/src/main/java/com/google/mu/util/MoreIterables.java`
#### Snippet
```java
   *
   * <p>Note that this method performs a similar function for matching as {@link
   * com.google.common.collect.Ordering#lexicographical} does for orderings.
   *
   * <p>It can also be used to compare two {@code Optional} objects, by first converting the {@code
```

### JavadocReference
Symbol `lexicographical` is inaccessible from here
in `mug/src/main/java/com/google/mu/util/MoreIterables.java`
#### Snippet
```java
   *
   * <p>Note that this method performs a similar function for matching as {@link
   * com.google.common.collect.Ordering#lexicographical} does for orderings.
   *
   * <p>It can also be used to compare two {@code Optional} objects, by first converting the {@code
```

### JavadocReference
Cannot resolve symbol `Strings`
in `mug/src/main/java/com/google/mu/util/BiOptional.java`
#### Snippet
```java
   * Ensures that the pair must be present or else throws the exception returned by {@code
   * exceptionFactory} with {@code message} formatted with {@code args} using {@link
   * Strings#lenientFormat}.
   *
   * @throws NullPointerException if {@code exceptionFactory} or {@code message} is null, or if
```

### JavadocReference
Cannot resolve symbol `lenientFormat`
in `mug/src/main/java/com/google/mu/util/BiOptional.java`
#### Snippet
```java
   * Ensures that the pair must be present or else throws the exception returned by {@code
   * exceptionFactory} with {@code message} formatted with {@code args} using {@link
   * Strings#lenientFormat}.
   *
   * @throws NullPointerException if {@code exceptionFactory} or {@code message} is null, or if
```

### JavadocReference
Symbol `switching` is inaccessible from here
in `mug/src/main/java/com/google/mu/util/stream/FixedSizeCollector.java`
#### Snippet
```java
 *
 * <p>In addition to being used as regular Collector, can also be passed as one of the
 * multiple conditional cases to {@link MoreCollectors#switching}.
 *
 * @since 5.5
```

### JavadocReference
Cannot resolve symbol `ifPresentOrElse`
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
   *
   * <p>This method is very similar to JDK {@link Optional#ifPresent} with a few differences: <ol>
   * <li>{@link Premise#orElse orElse()} is chained fluently, compared to {@link Optional#ifPresentOrElse}.
   * <li>{@link Premise#or or()} allows chaining arbitrary number of alternative options on arbitrary
   *     optional types.
```

### JavadocReference
Cannot resolve symbol `ifPresentOrElse`
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
   *
   * <p>This method is very similar to JDK {@link OptionalDouble#ifPresent} with a few differences: <ol>
   * <li>{@link Premise#orElse orElse()} is chained fluently, compared to {@link OptionalDouble#ifPresentOrElse}.
   * <li>{@link Premise#or or()} allows chaining arbitrary number of alternative options on arbitrary
   *     optional types.
```

### JavadocReference
Cannot resolve symbol `ifPresentOrElse`
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
   *
   * <p>This method is very similar to JDK {@link OptionalLong#ifPresent} with a few differences: <ol>
   * <li>{@link Premise#orElse orElse()} is chained fluently, compared to {@link OptionalLong#ifPresentOrElse}.
   * <li>{@link Premise#or or()} allows chaining arbitrary number of alternative options on arbitrary
   *     optional types.
```

### JavadocReference
Cannot resolve symbol `ifPresentOrElse`
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
   *
   * <p>This method is very similar to JDK {@link OptionalInt#ifPresent} with a few differences: <ol>
   * <li>{@link Premise#orElse orElse()} is chained fluently, compared to {@link OptionalInt#ifPresentOrElse}.
   * <li>{@link Premise#or or()} allows chaining arbitrary number of alternative options on arbitrary
   *     optional types.
```

### JavadocReference
Cannot resolve symbol `placeholders`
in `mug/src/main/java/com/google/mu/util/StringFormat.java`
#### Snippet
```java
   * Parses {@code input} against the pattern.
   *
   * <p>Returns an immutable list of placeholder values in the same order as {@link #placeholders},
   * upon success; otherwise returns empty.
   *
```

### JavadocReference
Cannot resolve symbol `flatMapping`
in `mug/src/main/java/com/google/mu/util/stream/MoreCollectors.java`
#### Snippet
```java

  /**
   * Similar but slightly different than {@link Collectors#flatMapping}, returns a {@link Collector}
   * that first flattens the input stream of <em>pairs</em> (as opposed to single elements) and then
   * collects the flattened pairs with the {@code downstream} BiCollector.
```

### JavadocReference
Cannot resolve symbol `asIn(Function)`
in `mug/src/main/java/com/google/mu/util/stream/MoreCollectors.java`
#### Snippet
```java

  /**
   * Same as {@link #asIn(Function)}.
   *
   * @since 5.4
```

### JavadocReference
Symbol `sorted` is inaccessible from here
in `mug/src/main/java/com/google/mu/function/BiComparator.java`
#### Snippet
```java
/**
 * @deprecated Use one of:
 *     {@link com.google.mu.util.stream.BiStream#sorted},
 *     {@link com.google.mu.util.stream.BiStream#sortedByKeys},
 *     {@link com.google.mu.util.stream.BiStream#sortedByValues},
```

### JavadocReference
Symbol `minBy` is inaccessible from here
in `mug/src/main/java/com/google/mu/function/BiComparator.java`
#### Snippet
```java
 *     {@link com.google.mu.util.stream.BiStream#sortedByKeys},
 *     {@link com.google.mu.util.stream.BiStream#sortedByValues},
 *     {@link com.google.mu.util.stream.BiCollectors#minBy},
 *     {@link com.google.mu.util.stream.BiCollectors#minByKey},
 *     {@link com.google.mu.util.stream.BiCollectors#minByValue},
```

### JavadocReference
Symbol `maxBy` is inaccessible from here
in `mug/src/main/java/com/google/mu/function/BiComparator.java`
#### Snippet
```java
 *     {@link com.google.mu.util.stream.BiCollectors#minByKey},
 *     {@link com.google.mu.util.stream.BiCollectors#minByValue},
 *     {@link com.google.mu.util.stream.BiCollectors#maxBy},
 *     {@link com.google.mu.util.stream.BiCollectors#maxByKey},
 *     {@link com.google.mu.util.stream.BiCollectors#maxByValue}.
```

### JavadocReference
Cannot resolve symbol `inGraph`
in `mug/src/main/java/com/google/mu/util/graph/Walker.java`
#### Snippet
```java
   * walk in cycles if the {@code findChildren} function unexpectedly represents a cyclic graph.
   * If you need to guard against cycles just in case, you can use {@link
   * inGraph(Function, Predicate) inGraph()} with a custom node tracker to check for the critical
   * precondition:
   *
```

### JavadocReference
Cannot resolve symbol `or`
in `mug/src/main/java/com/google/mu/util/stream/Cases.java`
#### Snippet
```java
 * @deprecated Use {@link com.google.mu.util.MoreCollections#findFirstElements findFirstElements()}
 * and/or {@link com.google.mu.util.MoreCollections#findOnlyElements findOnlyElements()} methods
 * together with {@link Optional#or} instead.
 */
@Deprecated
```

### JavadocReference
Symbol `name` is inaccessible from here
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
   * <li>Primitive types (boolean, number, string)
   * <li>{@code null} mapped to {@link NullValue}
   * <li>Enum mapped to {@link Enum#name name}
   * <li>{@link Iterable} and array elements recursively converted and wrapped in {@link ListValue}
   * <li>{@link Map} values recursively converted and wrapped in {@link Struct}
```

### JavadocReference
Cannot resolve symbol `iterateIn`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
    /**
     * While {@code endIndex} demarcates the matched substring, {@code repetitionStartIndex} points to
     * the starting point to scan for the succeeding {@link Pattern#iterateIn iteration} of the same
     * pattern. It's by default equal to {@code endIndex}, but for {@link Substring#before} and
     * {@link Substring#upToIncluding}, {@code repetitionStartIndex} starts after the delimiters.
```

### JavadocReference
Cannot resolve symbol `minBykey`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
  /**
   * @since 6.0
   * @deprecated Use {@link #minBykey} or {@link #minByValue}.
   */
  @Deprecated
```

### JavadocReference
Symbol `minBy` is inaccessible from here
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
   *
   * @since 6.5
   * @deprecated Use {@link BiCollectors#minBy} instead
   */
  @Deprecated
```

### JavadocReference
Symbol `maxBy` is inaccessible from here
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
   *
   * @since 6.5
   * @deprecated Use {@link BiCollectors#maxBy} instead.
   */
  @SafeVarargs
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `mug/src/main/java/com/google/mu/util/graph/BinaryTreeWalker.java`
#### Snippet
```java
      return !leftPath.isEmpty();
    }
  };

  private final class PostOrder {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
  public static <E, K, V> Collector<E, ?, BiStream<K, V>> toBiStream(
      Function<? super E, ? extends Both<? extends K, ? extends V>> toPair) {
    requireNonNull(toPair);;
    return collectingAndThen(stream -> from(stream.map(toPair)));
  }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `ceiling` might be null
in `mug-guava/src/main/java/com/google/mu/util/InsertionPoint.java`
#### Snippet
```java
  public String toString() {
    if (floor == null) {
      return Range.lessThan(ceiling).toString();
    }
    if (ceiling == null) {
```

### DataFlowIssue
Argument `values` might be null
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/MoreValues.java`
#### Snippet
```java
   */
  public static ListValue listValueOf(@Nullable Struct... values) {
    return stream(values).map(MoreValues::nullableValueOf).collect(toListValue());
  }

```

### DataFlowIssue
Argument `values` might be null
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/MoreValues.java`
#### Snippet
```java
   */
  public static ListValue listValueOf(@Nullable String... values) {
    return stream(values).map(MoreValues::nullableValueOf).collect(toListValue());
  }

```

### DataFlowIssue
Argument `e` might be null
in `mug/src/main/java/com/google/mu/util/Maybe.java`
#### Snippet
```java
        }
      } catch (Throwable x) {  // Just in case there was a bug. Don't hang the thread.
        if (x != e) x.addSuppressed(e);
        future.completeExceptionally(x);
      }
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `mug/src/main/java/com/google/mu/util/stream/MoreCollectors.java`
#### Snippet
```java

      Builder merge(Builder that) {
        that.tie.stream().forEach(this::add);
        return this;
      }
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`for` statement has empty body
in `mug/src/main/java/com/google/mu/util/stream/MoreStreams.java`
#### Snippet
```java
      requireNonNull(action);
      List<T> chunk = new ArrayList<>(chunkSize());
      for (int i = 0; i < maxSize && underlying.tryAdvance(chunk::add); i++) {}
      if (chunk.isEmpty()) return false;
      action.accept(chunk);
```

### EmptyStatementBody
`while` statement has empty body
in `mug/src/main/java/com/google/mu/util/stream/MoreStreams.java`
#### Snippet
```java
      }
      boolean advanced = false;
      while ((!(advanced = currentBlock.tryAdvance(action))) && tryAdvanceBlock()) {}
      return advanced;
    }
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java

      @Override public String toString() {
        return "first(\'" + character + "\')";
      }
    };
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java

      @Override public String toString() {
        return "first(\'" + character + "\')";
      }
    };
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'mapBoth' is still used
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
   */
  @Deprecated
  public static <A, B, R, E extends Throwable> Optional<R> mapBoth(
      Optional<A> left, Optional<B> right, CheckedBiFunction<? super A, ? super B, ? extends R, E> mapper)
      throws E {
```

### DeprecatedIsStillUsed
Deprecated member 'flatMapBoth' is still used
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
   */
  @Deprecated
  public static <A, B, R, E extends Throwable> Optional<R> flatMapBoth(
      Optional<A> left, Optional<B> right,
      CheckedBiFunction<? super A, ? super B, ? extends Optional<R>, E> mapper)
```

### DeprecatedIsStillUsed
Deprecated member 'BiComparator' is still used
in `mug/src/main/java/com/google/mu/function/BiComparator.java`
#### Snippet
```java
@Deprecated
@FunctionalInterface
public interface BiComparator<K, V> {
  /**
   * Returns a {@code BiComparator} that first transforms the pairs using {@code function} and then
```

### DeprecatedIsStillUsed
Deprecated member 'Cases' is still used
in `mug/src/main/java/com/google/mu/util/stream/Cases.java`
#### Snippet
```java
 */
@Deprecated
public final class Cases {
  /**
   * A collector that collects the only element from the input,
```

### DeprecatedIsStillUsed
Deprecated member 'withBoundary' is still used
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
     */
    @Deprecated
    public final Pattern withBoundary(CharPredicate boundaryBefore, CharPredicate boundaryAfter) {
      return separatedBy(boundaryBefore, boundaryAfter);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'sorted' is still used
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
  @SafeVarargs
  @Deprecated
  public final BiStream<K, V> sorted(
      BiComparator<? super K, ? super V> primary,
      BiComparator<? super K, ? super V>... secondaries) {
```

## RuleId[id=RedundantComparatorComparing]
### RedundantComparatorComparing
'Entry.comparingByKey()' can be used instead
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
  public final BiStream<K, V> sorted(Comparator<? super K> byKey, Comparator<? super V> byValue) {
    return sorted(
        Comparator.<Map.Entry<? extends K, ? extends V>, K>comparing(Map.Entry::getKey, byKey)
            .thenComparing(Map.Entry::getValue, byValue));
  }
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `mug/src/main/java/com/google/mu/util/graph/CyclicGraphException.java`
#### Snippet
```java

  /** Returns the cyclic path with the last node being the entry point of the cycle. */
  public final List<?> cyclicPath() {
    return cyclicPath;
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `mug/src/main/java/com/google/mu/util/concurrent/Retryer.java`
#### Snippet
```java
   * {@code upon(InterruptedException.class, ...)} is illegal.
   */
  public final <E extends Throwable> Retryer upon(
      Class<E> exceptionType, List<? extends Delay<? super E>> delays) {
    return new Retryer(plan.upon(rejectInterruptedException(exceptionType), delays));
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `mug/src/main/java/com/google/mu/util/concurrent/Retryer.java`
#### Snippet
```java
   * {@code upon(InterruptedException.class, ...)} is illegal.
   */
  public final <E extends Throwable> Retryer upon(
      Class<E> exceptionType, Stream<? extends Delay<? super E>> delays) {
    return upon(exceptionType, copyOf(delays));
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
    }

    @Override public final BiIterator<K, V> iterator() {
      Spliterator<K> leftSpliterator = left.spliterator();
      Spliterator<V> rightSpliterator = right.spliterator();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
    }

    @Override public final <A> A collect(A container, BiAccumulator<? super A, ? super K, ? super V> accumulator) {
      forEach(accumulator.into(container));
      return container;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
    }

    @Override public final void close() {
      try (Stream<K> closeLeft = left) {
        right.close();
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `javadoc-stylesheet.css`
#### Snippet
```java
    background-image:url(resources/background.gif);
    background-repeat:repeat-x;
    color:#FFFFFF;
    float:left;
    padding:0;
    width:100%;
    clear:right;
    height:2.8em;
    padding-top:10px;
    overflow:hidden;
```

### DuplicatedCode
Duplicated code
in `mug-guava/src/main/java/com/google/mu/util/BinarySearch.java`
#### Snippet
```java
          int where = target.locate(low, mid, high);
          if (where > 0) {
            if (mid == high) { // mid is the floor
              return InsertionPoint.after(mid);
            }
            low = mid + 1;
          } else if (where < 0) {
            if (mid == low) { // mid is the ceiling
              return InsertionPoint.before(mid);
            }
            high = mid - 1;
          } else {
            return InsertionPoint.at(mid);
          }
```

### DuplicatedCode
Duplicated code
in `mug/src/main/java/com/google/mu/util/MoreCollections.java`
#### Snippet
```java
    if (collection instanceof List && collection instanceof RandomAccess) {
      List<T> list = (List<T>) collection;
      return Optional.of(found.apply(list.get(0), list.get(1)));
    }
    Iterator<T> it = collection.iterator();
    return Optional.of(found.apply(it.next(), it.next()));
```

### DuplicatedCode
Duplicated code
in `mug/src/main/java/com/google/mu/util/MoreCollections.java`
#### Snippet
```java
    if (collection instanceof List && collection instanceof RandomAccess) {
      List<T> list = (List<T>) collection;
      return Optional.of(found.apply(list.get(0), list.get(1), list.get(2)));
    }
    Iterator<T> it = collection.iterator();
    return Optional.of(found.apply(it.next(), it.next(), it.next()));
```

### DuplicatedCode
Duplicated code
in `mug/src/main/java/com/google/mu/util/MoreCollections.java`
#### Snippet
```java
    if (collection instanceof List && collection instanceof RandomAccess) {
      List<T> list = (List<T>) collection;
      return Optional.of(found.apply(list.get(0), list.get(1), list.get(2), list.get(3)));
    }
    Iterator<T> it = collection.iterator();
    return Optional.of(found.apply(it.next(), it.next(), it.next(), it.next()));
```

### DuplicatedCode
Duplicated code
in `mug/src/main/java/com/google/mu/util/MoreCollections.java`
#### Snippet
```java
    if (collection instanceof List && collection instanceof RandomAccess) {
      List<T> list = (List<T>) collection;
      return Optional.of(found.apply(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4)));
    }
    Iterator<T> it = collection.iterator();
    return Optional.of(found.apply(it.next(), it.next(), it.next(), it.next(), it.next()));
```

### DuplicatedCode
Duplicated code
in `mug/src/main/java/com/google/mu/util/MoreCollections.java`
#### Snippet
```java
    if (collection instanceof List && collection instanceof RandomAccess) {
      List<T> list = (List<T>) collection;
      return Optional.of(found.apply(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5)));
    }
    Iterator<T> it = collection.iterator();
    return Optional.of(found.apply(it.next(), it.next(), it.next(), it.next(), it.next(), it.next()));
```

## RuleId[id=Deprecation]
### Deprecation
'withBoundary(com.google.mu.util.CharPredicate, com.google.mu.util.CharPredicate)' is deprecated
in `mug-guava/src/main/java/com/google/mu/util/CaseBreaker.java`
#### Snippet
```java
  public Stream<String> breakCase(CharSequence text) {
    Substring.Pattern lowerTail = // The 'l' in 'camelCase', 'CamelCase', 'camel' or 'Camel'.
        first(camelLower).withBoundary(CharPredicate.ANY, camelLower.not());
    return Substring.consecutive(caseDelimiter.not())
        .repeatedly()
```

### Deprecation
'from(java.util.Collection, java.util.function.Function, java.util.function.Function)' is deprecated
in `mug/src/main/java/com/google/mu/util/graph/ShortestPath.java`
#### Snippet
```java
    }
    Collections.reverse(nodes);
    return BiStream.from(nodes, ShortestPath::to, ShortestPath::distance);
  }

```

### Deprecation
'com.google.mu.util.stream.Cases' is deprecated
in `mug/src/main/java/com/google/mu/util/stream/Cases.java`
#### Snippet
```java
package com.google.mu.util.stream;

import static com.google.mu.util.stream.Cases.TinyContainer.toTinyContainer;
import static java.util.Objects.requireNonNull;
import static java.util.function.Function.identity;
```

### Deprecation
Overrides deprecated method in 'com.google.mu.util.Substring.Pattern'
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
        }

        @Override public Pattern peek(Pattern following) {
          return base.peek(following).or(that.peek(following));
        }
```

### Deprecation
'com.google.mu.function.BiComparator' is deprecated
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
package com.google.mu.util.stream;

import static com.google.mu.function.BiComparator.comparingInOrder;
import static com.google.mu.util.stream.MoreStreams.collectingAndThen;
import static java.util.Map.Entry.comparingByKey;
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `mug/src/main/java/com/google/mu/util/concurrent/Retryer.java`
#### Snippet
```java
    public <R extends T, E extends Throwable> R retryBlockingly(
        CheckedSupplier<R, E> supplier) throws E {
      return ThrownReturn.<R, E>unwrap(() -> retryer.retryBlockingly(supplier.andThen(this::wrap)));
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `mug/src/main/java/com/google/mu/util/stream/MoreStreams.java`
#### Snippet
```java
   */
  public static <T> Stream<T> flatten(Stream<? extends Stream<? extends T>> streamOfStream) {
    return mapBySpliterator(streamOfStream.sequential(), 0, FlattenedSpliterator<T>::new);
  }

```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `mug-guava/src/main/java/com/google/mu/util/InsertionPoint.java`
#### Snippet
```java

  private final @Nullable C floor;
  private final @Nullable C ceiling;

  private InsertionPoint(@Nullable C floor, @Nullable C ceiling) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `mug-guava/src/main/java/com/google/mu/util/InsertionPoint.java`
#### Snippet
```java
      .nullsLast(naturalOrder());

  private final @Nullable C floor;
  private final @Nullable C ceiling;

```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
     * @since 4.6
     */
    @Override public CharSequence subSequence(int begin, int end) {
      if (begin < 0) {
        throw new IndexOutOfBoundsException("Invalid index: begin (" + begin + ") < 0");
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java

    /** @since 5.7 */
    @Override public String subSequence(int start, int end) {
      return suffix.substring(start, end);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java

    /** @since 5.7 */
    @Override public String subSequence(int start, int end) {
      return prefix.substring(start, end);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java

    /** Returns the matched substring. */
    @Override public String toString() {
      return context.substring(startIndex, endIndex);
    }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
   *
   * <pre>
   *   String uri = "http://google.com";
   *   String schemeStripped = upToIncluding(first("://")).removeFrom(uri);
   *   assertThat(schemeStripped).isEqualTo("google.com");
```

## RuleId[id=ForwardCompatibility]
### ForwardCompatibility
Unqualified call to 'yield' method is not supported in releases since Java 14
in `mug-algorithms/src/main/java/com/google/mu/algorithms/Fibonacci.java`
#### Snippet
```java

  private Fibonacci from(Long v1, Long v2) {
    yield(v1);
    yield(() -> from(v2, v1 + v2));
    return this;
```

### ForwardCompatibility
Unqualified call to 'yield' method is not supported in releases since Java 14
in `mug-algorithms/src/main/java/com/google/mu/algorithms/Fibonacci.java`
#### Snippet
```java
  private Fibonacci from(Long v1, Long v2) {
    yield(v1);
    yield(() -> from(v2, v1 + v2));
    return this;
  }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Thread.interrupted()` is ignored
in `mug/src/main/java/com/google/mu/util/Maybe.java`
#### Snippet
```java
  private static <E extends Throwable> E cleanupInterruption(E exception) {
    if (exception instanceof InterruptedException) {
      Thread.interrupted();
    }
    return exception;
```

### IgnoreResultOfCall
Result of `BaseStream.onClose()` is ignored
in `mug/src/main/java/com/google/mu/util/stream/MoreStreams.java`
#### Snippet
```java
    Stream<T> mapped = StreamSupport.stream(
        () -> mapper.apply(stream.spliterator()), characteristics, stream.isParallel());
    mapped.onClose(stream::close);
    return mapped;
  }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `mug/src/main/java/com/google/mu/util/BiOptional.java`
#### Snippet
```java

  @SuppressWarnings("unchecked") // Optional is an immutable type.
  static <T> Optional<T> covariant(Optional<? extends T> optional) {
    return (Optional<T>) requireNonNull(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `mug/src/main/java/com/google/mu/util/BiOptional.java`
#### Snippet
```java
   * @throws NullPointerException if {@code optional} is null.
   */
  public static <T> BiOptional<T, T> from(Optional<T> optional) {
    return optional.isPresent() ? of(optional.get(), optional.get()) : empty();
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'a'
in `mug/src/main/java/com/google/mu/util/BiOptional.java`
#### Snippet
```java
  /** @deprecated Use {@link Optionals#both} instead. */
  @Deprecated
  public static <A, B> BiOptional<A, B> both(Optional<A> a, Optional<B> b) {
    return Optionals.both(a, b);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional`**used as type for parameter 'b'**
in `mug/src/main/java/com/google/mu/util/BiOptional.java`
#### Snippet
```java
  /** @deprecated Use {@link Optionals#both} instead. */
  @Deprecated
  public static <A, B> BiOptional<A, B> both(Optional<A> a, Optional<B> b) {
    return Optionals.both(a, b);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `mug/src/main/java/com/google/mu/util/BiOptional.java`
#### Snippet
```java
   */
  public static <T, A, B> BiOptional<A, B> flatMap(
      Optional<T> optional,
      Function<? super T, ? extends BiOptional<? extends A, ? extends B>> mapper) {
    return optional.map(mapper).map(BiOptional::<A, B>covariant).orElse(empty());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
   */
  public static <T, E extends Throwable> Premise ifPresent(
      Optional<T> optional, CheckedConsumer<? super T, E> consumer) throws E {
    requireNonNull(optional);
    requireNonNull(consumer);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'a'
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
   * @since 5.7
   */
  public static <A, B> BiOptional<A, B> both(Optional<? extends A> a, Optional<? extends B> b) {
    requireNonNull(a);
    requireNonNull(b);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'b'
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
   * @since 5.7
   */
  public static <A, B> BiOptional<A, B> both(Optional<? extends A> a, Optional<? extends B> b) {
    requireNonNull(a);
    requireNonNull(b);
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'optional'
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
   */
  public static <E extends Throwable> Premise ifPresent(
      OptionalDouble optional, CheckedDoubleConsumer<E> consumer) throws E {
    requireNonNull(optional);
    requireNonNull(consumer);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'left'
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
  @Deprecated
  public static <A, B, R, E extends Throwable> Optional<R> mapBoth(
      Optional<A> left, Optional<B> right, CheckedBiFunction<? super A, ? super B, ? extends R, E> mapper)
      throws E {
    requireNonNull(left);
```

### OptionalUsedAsFieldOrParameterType
`Optional`**used as type for parameter 'right'**
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
  @Deprecated
  public static <A, B, R, E extends Throwable> Optional<R> mapBoth(
      Optional<A> left, Optional<B> right, CheckedBiFunction<? super A, ? super B, ? extends R, E> mapper)
      throws E {
    requireNonNull(left);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'left'
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
   */
  public static <A, B, E extends Throwable> Premise ifPresent(
      Optional<A> left, Optional<B> right, CheckedBiConsumer<? super A, ? super B, E> consumer)
      throws E {
    requireNonNull(left);
```

### OptionalUsedAsFieldOrParameterType
`Optional`**used as type for parameter 'right'**
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
   */
  public static <A, B, E extends Throwable> Premise ifPresent(
      Optional<A> left, Optional<B> right, CheckedBiConsumer<? super A, ? super B, E> consumer)
      throws E {
    requireNonNull(left);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
   * @since 6.1
   */
  public static <T> Set<T> asSet(Optional<? extends T> optional) {
    return optional.isPresent() ? Collections.singleton(optional.get()) : Collections.emptySet();
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'optional'
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
   */
  public static <E extends Throwable> Premise ifPresent(
      OptionalLong optional, CheckedLongConsumer<E> consumer) throws E {
    requireNonNull(optional);
    requireNonNull(consumer);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'left'
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
  @Deprecated
  public static <A, B, R, E extends Throwable> Optional<R> flatMapBoth(
      Optional<A> left, Optional<B> right,
      CheckedBiFunction<? super A, ? super B, ? extends Optional<R>, E> mapper)
      throws E {
```

### OptionalUsedAsFieldOrParameterType
`Optional`**used as type for parameter 'right'**
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
  @Deprecated
  public static <A, B, R, E extends Throwable> Optional<R> flatMapBoth(
      Optional<A> left, Optional<B> right,
      CheckedBiFunction<? super A, ? super B, ? extends Optional<R>, E> mapper)
      throws E {
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'optional'
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
   */
  public static <E extends Throwable> Premise ifPresent(
      OptionalInt optional, CheckedIntConsumer<E> consumer) throws E {
    requireNonNull(optional);
    requireNonNull(consumer);
```

### OptionalUsedAsFieldOrParameterType
`Optional``>` used as type for parameter 'optional'
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java

  private static <K, V> BiOptional<K, V> asBiOptional(
      Optional<? extends Map.Entry<? extends K, ? extends V>> optional) {
    return BiOptional.from(optional).map(Map.Entry::getKey, Map.Entry::getValue);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
  }

  private static <T> T orElseNull(Optional<T> optional) {
    return optional.orElse(null);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional``>` used as type for parameter 'optional'
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java

  private static <K, V> BiOptional<K, V> fromOptionalEntry(
      Optional<? extends Map.Entry<? extends K, ? extends V>> optional) {
    return optional.isPresent()
        ? BiOptional.of(optional.get().getKey(), optional.get().getValue())
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'BiStream' used without 'try'-with-resources statement
in `mug/src/main/java/com/google/mu/util/stream/MoreCollectors.java`
#### Snippet
```java

      Builder addAll(Builder that) {
        return BiStream.from(that.map).collect(this, Builder::add);
      }

```

### AutoCloseableResource
'BiStream\>' used without 'try'-with-resources statement
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/StructBuilder.java`
#### Snippet
```java
   */
  public StructBuilder addAll(Multimap<String, Value> multimap) {
    BiStream.from(multimap.asMap()).forEachOrdered(this::add);
    return this;
  }
```

### AutoCloseableResource
'BiStream' used without 'try'-with-resources statement
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/StructBuilder.java`
#### Snippet
```java
    return add(
        name,
        BiStream.from(map).collect(new StructBuilder(), StructBuilder::add).build());
  }

```

### AutoCloseableResource
'BiStream' used without 'try'-with-resources statement
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/StructBuilder.java`
#### Snippet
```java
   */
  public StructBuilder addAllFields(Struct that) {
    BiStream.from(that.getFieldsMap()).forEachOrdered(this::add);
    return this;
  }
```

### AutoCloseableResource
'BiStream' used without 'try'-with-resources statement
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/StructBuilder.java`
#### Snippet
```java
  public StructBuilder addAllFields(StructBuilder that) {
    checkArgument(this != that, "Cannot add this builder to itself.");
    BiStream.from(that.fields).forEachOrdered(this::add);
    return this;
  }
```

### AutoCloseableResource
'BiStream' used without 'try'-with-resources statement
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/StructBuilder.java`
#### Snippet
```java
   */
  public StructBuilder addAll(Map<String, Value> map) {
    BiStream.from(map).forEachOrdered(this::add);
    return this;
  }
```

### AutoCloseableResource
'BiStream\>' used without 'try'-with-resources statement
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/StructBuilder.java`
#### Snippet
```java
   */
  public StructBuilder addAll(Table<String, String, Value> table) {
    BiStream.from(table.rowMap()).forEachOrdered(this::add);
    return this;
  }
```

### AutoCloseableResource
'BiStream' used without 'try'-with-resources statement
in `mug/src/main/java/com/google/mu/util/graph/ShortestPath.java`
#### Snippet
```java

  @Override public String toString() {
    return stream().keys().map(Object::toString).collect(joining("->"));
  }

```

### AutoCloseableResource
'BiStream' used without 'try'-with-resources statement
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
  private Value toStructValue(Map<?, ?> map) {
    return valueOf(
        BiStream.from(map)
            .mapKeys(Structor::toStructKey)
            .mapValues(this::convertNonNull)
```

### AutoCloseableResource
'BiStream\>' used without 'try'-with-resources statement
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
   */
  public final Struct nestedStruct(Table<String, String, ?> table) {
    return BiStream.from(table.rowMap())
        .mapValues(cols -> valueOf(struct(cols)))
        .collect(Struct.newBuilder(), Struct.Builder::putFields)
```

### AutoCloseableResource
'BiStream' used without 'try'-with-resources statement
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
   */
  public final Struct struct(Map<String, ?> map) {
    return BiStream.from(map)
        .mapValues(this::convertNonNull)
        .collect(Struct.newBuilder(), Struct.Builder::putFields)
```

### AutoCloseableResource
'BiStream' used without 'try'-with-resources statement
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
    public final BiStream<String, String> alternationFrom(String input) {
      return Stream.concat(match(input), Stream.of(END.in(input).get()))
          .collect(BiStream.toAdjacentPairs())
          .mapValues((k, k2) -> input.substring(k.index() + k.length(), k2.index()))
          .mapKeys(Match::toString);
```

### AutoCloseableResource
'BiStream, V\>' used without 'try'-with-resources statement
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
  public final <K2> BiStream<K2, V> mapKeysIfPresent(
      BiFunction<? super K, ? super V, ? extends Optional<? extends K2>> keyMapper) {
    return mapKeys(keyMapper).<K2>mapKeys(BiStream::orElseNull).filterKeys(Objects::nonNull);
  }

```

### AutoCloseableResource
'BiStream, V\>' used without 'try'-with-resources statement
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
  public final <K2> BiStream<K2, V> mapKeysIfPresent(
      Function<? super K, ? extends Optional<? extends K2>> keyMapper) {
    return mapKeys(keyMapper).<K2>mapKeys(BiStream::orElseNull).filterKeys(Objects::nonNull);
  }

```

### AutoCloseableResource
'BiStream\>' used without 'try'-with-resources statement
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
  public final <V2> BiStream<K, V2> mapValuesIfPresent(
      Function<? super V, ? extends Optional<? extends V2>> valueMapper) {
    return mapValues(valueMapper).<V2>mapValues(BiStream::orElseNull).filterValues(Objects::nonNull);
  }

```

### AutoCloseableResource
'BiStream' used without 'try'-with-resources statement
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
  private <A, R> BiStream<K, R> groupConsecutiveByKeys(
      Collector<? super V, A, R> groupCollector) {
    return groupConsecutiveByKeys(groupCollector.supplier(), groupCollector.accumulator())
        .mapValues(groupCollector.finisher());
  }
```

### AutoCloseableResource
'BiStream\>' used without 'try'-with-resources statement
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
  public final <V2> BiStream<K, V2> mapValuesIfPresent(
      BiFunction<? super K, ? super V, ? extends Optional<? extends V2>> valueMapper) {
    return mapValues(valueMapper).<V2>mapValues(BiStream::orElseNull).filterValues(Objects::nonNull);
  }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Class/method reference, quoted text, or HTML link are expected after @see tag
in `mug-guava/src/main/java/com/google/mu/util/BinarySearch.java`
#### Snippet
```java
   * <p>This is an O(1) operation.
   *
   * @see {@link #forInts(Range)} for examples
   */
  public static Table<IntSearchTarget, Integer> forInts() {
```

### JavadocDeclaration
Javadoc pointing to itself
in `mug-guava/src/main/java/com/google/mu/util/BinarySearch.java`
#### Snippet
```java
     * Finds the insertion point immediately before the first element that's greater than or equal to the target.
     *
     * <p>If {@code target} is absent, {@link #insertionPointBefore} and {@link #insertionPointAfter} will be
     * the same point, after the last element less than the target and the first element greater than it.
     *
```

### JavadocDeclaration
Javadoc pointing to itself
in `mug-guava/src/main/java/com/google/mu/util/BinarySearch.java`
#### Snippet
```java
     * Finds the insertion point immediately after the last element that's less than or equal to the target.
     *
     * <p>If {@code target} is absent, {@link #insertionPointBefore} and {@link #insertionPointAfter} will be
     * the same point, after the last element less than the target and the first element greater than it.
     *
```

### JavadocDeclaration
Javadoc pointing to itself
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
     * Returns the part of the original string before the matched substring.
     *
     * <p>{@link #before} and {@link #after} are almost always used together to split a string into
     * two parts. If you just need the substring after the match, you might want to use {@code
     * Substring.after(pattern)} instead, because the pattern logic is encoded entirely in the
```

### JavadocDeclaration
Javadoc pointing to itself
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
     * Returns the part of the original string before the matched substring.
     *
     * <p>{@link #before} and {@link #after} are almost always used together to split a string into
     * two parts. If you just need the substring before the match, you might want to use {@code
     * Substring.before(pattern)} instead, because the pattern logic is encoded entirely in the
```

### JavadocDeclaration
Illegal character
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
  /**
   * Returns a {@link BiCollector} that collects the key-value pairs into an {@link
   * ImmutableTable<R, C, V>}, where each input key (of type {@code R}) is mapped to a row in the
   * table, and each input value is a {@code BiStream<C, V>} whose keys (of type {@code C}) are
   * mapped to columns in the table, and whose values (of type {@code V}) are mapped to the cell
```

### JavadocDeclaration
Illegal character
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
  /**
   * Returns a {@link BiCollector} that collects the key-value pairs into an {@link
   * ImmutableTable<R, C, V>}, where each input key (of type {@code R}) is mapped to a row in the
   * table, and each input value is a {@code BiStream<C, V>} whose keys (of type {@code C}) are
   * mapped to columns in the table, and whose values (of type {@code V}) are mapped to the cell
```

### JavadocDeclaration
Illegal character
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
  /**
   * Returns a {@link BiCollector} that collects the key-value pairs into an {@link
   * ImmutableTable<R, C, V>}, where each input key (of type {@code R}) is mapped to a row in the
   * table, and each input value is a {@code BiStream<C, V>} whose keys (of type {@code C}) are
   * mapped to columns in the table, and whose values (of type {@code V}) are mapped to the cell
```

### JavadocDeclaration
Illegal character
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
  /**
   * Returns a {@link BiCollector} that collects the key-value pairs into an {@link
   * ImmutableTable<R, C, V>}, where each input key (of type {@code R}) is mapped to a row in the
   * table, and each input value is a {@code BiStream<C, V>} whose keys (of type {@code C}) are
   * mapped to columns in the table, and whose values (of type {@code V}) are mapped to the cell
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `it` may be 'final'
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
          new Supplier<Match>() {
            int next = 0;
            Iterator<Match> it = match(string).iterator();

            @Override public Match get() {
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `mug/src/main/java/com/google/mu/util/stream/BiCollection.java`
#### Snippet
```java
  /** Returns a {@code BiCollection} for {@code left} and {@code right}. */
  public static <L, R> BiCollection<L, R> of(L left, R right) {
    return new BiCollection<>(asList(kv(left, right)));
  }

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `advanced` initializer `false` is redundant
in `mug/src/main/java/com/google/mu/util/stream/MoreStreams.java`
#### Snippet
```java
        return false;
      }
      boolean advanced = false;
      while ((!(advanced = currentBlock.tryAdvance(action))) && tryAdvanceBlock()) {}
      return advanced;
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
    requireNonNull(consumer);
    if (optional.isPresent()) {
      consumer.accept(optional.map(Optionals::first).get(), optional.map(Optionals::second).get());
      return Conditional.TRUE;
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `mug/src/main/java/com/google/mu/util/Optionals.java`
#### Snippet
```java
    requireNonNull(consumer);
    if (optional.isPresent()) {
      consumer.accept(optional.map(Optionals::first).get(), optional.map(Optionals::second).get());
      return Conditional.TRUE;
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
     */
    public final BiStream<String, String> alternationFrom(String input) {
      return Stream.concat(match(input), Stream.of(END.in(input).get()))
          .collect(BiStream.toAdjacentPairs())
          .mapValues((k, k2) -> input.substring(k.index() + k.length(), k2.index()))
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
        mapToObj(mapper)
            .filter(BiOptional::isPresent)
            .map(optional -> optional.map(BiStream::kv).get()));
  }

```

