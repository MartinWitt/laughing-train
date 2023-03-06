# mug 
 
# Bad smells
I found 329 bad smells with 15 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 153 | false |
| ReturnNull | 52 | false |
| OptionalUsedAsFieldOrParameterType | 21 | false |
| UnstableApiUsage | 18 | false |
| RedundantFieldInitialization | 9 | false |
| UnnecessaryModifier | 7 | true |
| DeprecatedIsStillUsed | 6 | false |
| OptionalContainsCollection | 5 | false |
| AssignmentToMethodParameter | 5 | false |
| DataFlowIssue | 4 | false |
| UnnecessaryUnboxing | 4 | false |
| OptionalGetWithoutIsPresent | 4 | false |
| OptionalIsPresent | 3 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| Convert2MethodRef | 3 | false |
| CodeBlock2Expr | 3 | true |
| UnnecessarySemicolon | 2 | false |
| EmptyStatementBody | 2 | false |
| UnnecessaryStringEscape | 2 | true |
| StaticPseudoFunctionalStyleMethod | 2 | false |
| MissortedModifiers | 2 | false |
| NullableProblems | 2 | false |
| ForwardCompatibility | 2 | false |
| NestedAssignment | 2 | false |
| InstanceofCatchParameter | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| CastConflictsWithInstanceof | 2 | false |
| SimplifyStreamApiCallChains | 1 | false |
| RedundantComparatorComparing | 1 | false |
| RedundantMethodOverride | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| EmptyMethod | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=OptionalIsPresent]
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

  /** Corresponds to no characters. */
  static CharPredicate NONE = new CharPredicate() {
    @Override public boolean test(char c) {
      return false;
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

  /** Equivalent to the {@code [a-zA-Z]} character class. */
  static CharPredicate ALPHA = range('a', 'z').orRange('A', 'Z');

  /** Equivalent to the {@code [a-zA-Z0-9_]} character class. */
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `mug/src/main/java/com/google/mu/util/concurrent/Utils.java`
#### Snippet
```java

/** Some relatively trivial re-invented wheels as cost of 0-dependency. */
final class Utils {
  /** Only need it because we don't have Guava Lists.transform(). */
  static <F, T> List<T> mapList(List<F> list, Function<? super F, ? extends T> mapper) {
```

### UtilityClassWithoutPrivateConstructor
Class `Java9Collectors` has only 'static' members, and lacks a 'private' constructor
in `mug/src/main/java/com/google/mu/util/stream/Java9Collectors.java`
#### Snippet
```java

// TODO: switch to Java 9 Collectors.flatMapping() when we can.
final class Java9Collectors {
  static <T, E, A, R> Collector<T, A, R> flatMapping(
      Function<? super T, ? extends Stream<? extends E>> mapper, Collector<E, A, R> collector) {
```

### UtilityClassWithoutPrivateConstructor
Class `InternalCollectors` has only 'static' members, and lacks a 'private' constructor
in `mug/src/main/java/com/google/mu/util/InternalCollectors.java`
#### Snippet
```java
import java.util.stream.Collectors;

final class InternalCollectors {
  static <T> Collector<T, ?, List<T>> toImmutableList() {
    return checkingNulls(
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

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `Set`
in `mug/src/main/java/com/google/mu/util/Selection.java`
#### Snippet
```java
   * }</pre>
   */
  Optional<Set<T>> limited();

  /** Returns an intersection of this selection and {@code that}. */
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `mug/src/main/java/com/google/mu/util/StringFormat.java`
#### Snippet
```java
   * match, or to access the raw index in the input string.
   */
  public Optional<List<Substring.Match>> parse(String input) {
    if (!input.startsWith(literals.get(0))) {  // first literal is the prefix
      return Optional.empty();
```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `mug/src/main/java/com/google/mu/util/Selections.java`
#### Snippet
```java

    @Override
    public Optional<Set<T>> limited() {
      return Optional.of(choices);
    }
```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `mug/src/main/java/com/google/mu/util/Selections.java`
#### Snippet
```java

    @Override
    public Optional<Set<Object>> limited() {
      return Optional.of(emptySet());
    }
```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `mug/src/main/java/com/google/mu/util/Selections.java`
#### Snippet
```java

    @Override
    public Optional<Set<Object>> limited() {
      return Optional.empty();
    }
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `mug/src/main/java/com/google/mu/util/StringFormat.java`
#### Snippet
```java
    return scan(input)
        .map(values -> values.stream().map(Substring.Match::toString).collect(collector))
        .filter(v -> v != null);
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `mug/src/main/java/com/google/mu/util/stream/Joiner.java`
#### Snippet
```java
  /** Returns a Collector that skips null inputs and joins the remaining using this Joiner. */
  public Collector<Object, ?, String> skipNulls() {
    return Java9Collectors.filtering(v -> v != null, this);
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `mug/src/main/java/com/google/mu/util/stream/Cases.java`
#### Snippet
```java
            caseList.stream()
                .map(c -> input.stream().collect(c).orElse(null))
                .filter(v -> v != null)
                .findFirst()
                .orElseThrow(() -> unexpectedSize(input.size())));
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

## RuleId[id=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `mug-guava/src/main/java/com/google/mu/util/BinarySearch.java`
#### Snippet
```java
  public static <Q extends Comparable<Q>, E> Table<Q, Integer> inSortedList(
      List<? extends E> list, Function<? super E, ? extends Q> sortedBy) {
    return inSortedList(Lists.transform(list, sortedBy::apply));
  }

```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/MoreValues.java`
#### Snippet
```java
   */
  public static List<Object> asList(ListValueOrBuilder listValue) {
    return Lists.transform(listValue.getValuesList(), MoreValues::fromValue);
  }

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends E`
in `mug/src/main/java/com/google/mu/function/CheckedLongConsumer.java`
#### Snippet
```java
   * For example: {@code out::writeLong.andThen(logger::logLong).accept(123L)}.
   */
  default CheckedLongConsumer<E> andThen(CheckedLongConsumer<E> that) {
    requireNonNull(that);
    return input -> {
```

### BoundedWildcard
Can generalize to `? extends T`
in `mug/src/main/java/com/google/mu/util/concurrent/Utils.java`
#### Snippet
```java
   * returns {@code Optional.empty()}.
   */
  static <T> Optional<T> cast(Object object, Class<T> type) {
    return type.isInstance(object) ? Optional.of(type.cast(object)) : Optional.empty();
  }
```

### BoundedWildcard
Can generalize to `? extends R`
in `mug/src/main/java/com/google/mu/util/StringFormat.java`
#### Snippet
```java
  }

  private <R> Optional<R> parseAndCollect(String input, Collector<? super String, ?, R> collector) {
    return parse(input).map(values -> values.stream().map(Substring.Match::toString).collect(collector));
  }
```

### BoundedWildcard
Can generalize to `? super N`
in `mug/src/main/java/com/google/mu/util/graph/GraphWalker.java`
#### Snippet
```java
      private final LinkedHashSet<N> currentPath = new LinkedHashSet<>();

      Stream<N> startPostOrder(Iterable<? extends N> startNodes, Consumer<N> foundCycle) {
        Walk<N> walk = new Walk<>(
            findSuccessors,
```

### BoundedWildcard
Can generalize to `? extends E`
in `mug/src/main/java/com/google/mu/function/CheckedConsumer.java`
#### Snippet
```java
   * For example: {@code out::writeObject.andThen(logger::info).accept("message")}.
   */
  default CheckedConsumer<T, E> andThen(CheckedConsumer<? super T, E> that) {
    requireNonNull(that);
    return input -> {
```

### BoundedWildcard
Can generalize to `? extends E`
in `mug/src/main/java/com/google/mu/function/CheckedIntConsumer.java`
#### Snippet
```java
   * For example: {@code out::writeInt.andThen(logger::logInt).accept(123)}.
   */
  default CheckedIntConsumer<E> andThen(CheckedIntConsumer<E> that) {
    requireNonNull(that);
    return input -> {
```

### BoundedWildcard
Can generalize to `? super Match`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
    }

    private Pattern look(Predicate<Match> condition) {
      Last original = this;
      return new Last() {
```

### BoundedWildcard
Can generalize to `? super Occurrence`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
      }

      void enqueueNextOccurrence(String input, int fromIndex, Queue<Occurrence> queue) {
        Match nextMatch = pattern.match(input, fromIndex);
        if (nextMatch != null) {
```

### BoundedWildcard
Can generalize to `? super Q`
in `mug-guava/src/main/java/com/google/mu/util/BinarySearch.java`
#### Snippet
```java
     * @param <Q> the logical search key type of the returned {@link Table}.
     */
    public final <Q> Table<Q, C> by(Function<Q, ? extends K> keyFunction) {
      checkNotNull(keyFunction);
      Table<K, C> underlying = this;
```

### BoundedWildcard
Can generalize to `? extends R`
in `mug-guava/src/main/java/com/google/mu/util/BinarySearch.java`
#### Snippet
```java
   */
  @Nullable
  private static <R extends Comparable<R>> R high(Range<R> range, DiscreteDomain<R> domain) {
    if (range.hasUpperBound()) {
      return range.upperBoundType() == BoundType.CLOSED
```

### BoundedWildcard
Can generalize to `? extends R`
in `mug-guava/src/main/java/com/google/mu/util/BinarySearch.java`
#### Snippet
```java
   */
  @Nullable
  private static <R extends Comparable<R>> R low(Range<R> range, DiscreteDomain<R> domain) {
    if (range.hasLowerBound()) {
      return range.lowerBoundType() == BoundType.CLOSED
```

### BoundedWildcard
Can generalize to `? super T`
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java

  private <T> Collector<T, ?, Struct> toStruct(
      Function<T, CharSequence> keyFunction, Function<T, ?> valueFunction) {
    return MoreStructs.toStruct(keyFunction, valueFunction.andThen(this::convertNonNull));
  }
```

### BoundedWildcard
Can generalize to `? extends CharSequence`
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java

  private <T> Collector<T, ?, Struct> toStruct(
      Function<T, CharSequence> keyFunction, Function<T, ?> valueFunction) {
    return MoreStructs.toStruct(keyFunction, valueFunction.andThen(this::convertNonNull));
  }
```

### BoundedWildcard
Can generalize to `? super T`
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java

  private <T> Collector<T, ?, Struct> toStruct(
      Function<T, CharSequence> keyFunction, Function<T, ?> valueFunction) {
    return MoreStructs.toStruct(keyFunction, valueFunction.andThen(this::convertNonNull));
  }
```

### BoundedWildcard
Can generalize to `? super T`
in `mug/src/main/java/com/google/mu/util/InternalCollectors.java`
#### Snippet
```java
  }

  static <T, A, R> Collector<T, ?, R> checkingNulls(Collector<T, A, R> downstream) {
    return Collectors.mapping(Objects::requireNonNull, downstream);
  }
```

### BoundedWildcard
Can generalize to `? super T`
in `mug/src/main/java/com/google/mu/util/Funnel.java`
#### Snippet
```java
    }

    void convertInto(ArrayList<T> output) {
      if (indexedSources.isEmpty()) {
        return;
```

### BoundedWildcard
Can generalize to `? extends T`
in `mug/src/main/java/com/google/mu/util/stream/MoreStreams.java`
#### Snippet
```java

  private static <T> Spliterator<T> withSideEffect(
      Spliterator<T> spliterator, Consumer<? super T> sideEffect) {
    return new AbstractSpliterator<T>(spliterator.estimateSize(), 0) {
      @Override public boolean tryAdvance(Consumer<? super T> action) {
```

### BoundedWildcard
Can generalize to `? extends E`
in `mug/src/main/java/com/google/mu/function/CheckedDoubleConsumer.java`
#### Snippet
```java
   * For example: {@code out::writeDouble.andThen(logger::logDouble).accept(123D)}.
   */
  default CheckedDoubleConsumer<E> andThen(CheckedDoubleConsumer<E> that) {
    requireNonNull(that);
    return input -> {
```

### BoundedWildcard
Can generalize to `? extends E`
in `mug/src/main/java/com/google/mu/util/Maybe.java`
#### Snippet
```java

  private static <E extends Throwable> Optional<E> unwrapFutureException(
      Class<E> causeType, Throwable exception) {
    for (Throwable e = exception; ; e = e.getCause()) {
      if (causeType.isInstance(e)) {
```

### BoundedWildcard
Can generalize to `? extends Maybe`
in `mug/src/main/java/com/google/mu/util/Maybe.java`
#### Snippet
```java
    }

    @Override public <T2> Maybe<T2, E> flatMap(Function<? super T, Maybe<T2, E>> f) {
      return f.apply(value);
    }
```

### BoundedWildcard
Can generalize to `? extends E`
in `mug/src/main/java/com/google/mu/util/Maybe.java`
#### Snippet
```java
   */
  public static <F, T, E extends Throwable> Function<F, Maybe<T, E>> maybe(
      CheckedFunction<? super F, ? extends T, E> function) {
    requireNonNull(function);
    return from -> maybe(()->function.apply(from));
```

### BoundedWildcard
Can generalize to `? extends E`
in `mug/src/main/java/com/google/mu/util/Maybe.java`
#### Snippet
```java
   */
  public static <T, E extends Throwable> CompletionStage<Maybe<T, E>> catchException(
      Class<E> exceptionType, CompletionStage<? extends T> stage) {
    requireNonNull(exceptionType);
    CompletableFuture<Maybe<T, E>> future = new CompletableFuture<>();
```

### BoundedWildcard
Can generalize to `? extends E`
in `mug/src/main/java/com/google/mu/util/Maybe.java`
#### Snippet
```java
   */
  public static <T, E extends Throwable> Maybe<T, E> maybe(
      CheckedSupplier<? extends T, ? extends E> supplier, Class<E> exceptionType) {
    requireNonNull(supplier);
    requireNonNull(exceptionType);
```

### BoundedWildcard
Can generalize to `? super String`
in `mug/src/main/java/com/google/mu/util/BiOptional.java`
#### Snippet
```java
   */
  public final <E extends Throwable> Both<A, B> orElseThrow(
      Function<String, E> exceptionFactory, String message, Object... args) throws E {
    requireNonNull(exceptionFactory);
    requireNonNull(message);
```

### BoundedWildcard
Can generalize to `? extends A`
in `mug/src/main/java/com/google/mu/util/BiOptional.java`
#### Snippet
```java
  /** @deprecated Use {@link Optionals#both} instead. */
  @Deprecated
  public static <A, B> BiOptional<A, B> both(Optional<A> a, Optional<B> b) {
    return Optionals.both(a, b);
  }
```

### BoundedWildcard
Can generalize to `? extends B`
in `mug/src/main/java/com/google/mu/util/BiOptional.java`
#### Snippet
```java
  /** @deprecated Use {@link Optionals#both} instead. */
  @Deprecated
  public static <A, B> BiOptional<A, B> both(Optional<A> a, Optional<B> b) {
    return Optionals.both(a, b);
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `mug/src/main/java/com/google/mu/util/BiOptional.java`
#### Snippet
```java
   * @throws NullPointerException if {@code optional} is null.
   */
  public static <T> BiOptional<T, T> from(Optional<T> optional) {
    return optional.isPresent() ? of(optional.get(), optional.get()) : empty();
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `mug/src/main/java/com/google/mu/util/concurrent/Retryer.java`
#### Snippet
```java
   */
  public <T> CompletionStage<T> retry(
      CheckedSupplier<T, ?> supplier, ScheduledExecutorService executor) {
    return retryAsync(supplier.andThen(CompletableFuture::completedFuture), executor);
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `mug/src/main/java/com/google/mu/util/concurrent/Retryer.java`
#### Snippet
```java
     * <p>{@code clock} is used to measure time.
     */
    public final <T extends Delay<?>> List<T> timed(List<T> list, Clock clock) {
      Instant until = clock.instant().plus(duration());
      requireNonNull(list);
```

### BoundedWildcard
Can generalize to `? super F`
in `mug/src/main/java/com/google/mu/util/concurrent/Retryer.java`
#### Snippet
```java
     * translate events to type {@code E} before accepting them.
     */
    final <F> Delay<F> forEvents(Function<F, ? extends E> eventTranslator) {
      requireNonNull(eventTranslator);
      Delay<E> delegate = this;
```

### BoundedWildcard
Can generalize to `? super T`
in `mug/src/main/java/com/google/mu/util/concurrent/Retryer.java`
#### Snippet
```java
   */
  public <T> ForReturnValue<T> ifReturns(
      Predicate<T> condition, List<? extends Delay<? super T>> delays) {
    return new ForReturnValue<>(this, condition, delays);
  }
```

### BoundedWildcard
Can generalize to `? super K`
in `mug/src/main/java/com/google/mu/util/stream/MoreCollectors.java`
#### Snippet
```java
   */
  public static <K, V, R> Collector<Map<K, V>, ?, R> flatteningMaps(
      BiCollector<K, V, R> downstream) {
    return flatMapping(BiStream::from, downstream);
  }
```

### BoundedWildcard
Can generalize to `? super V`
in `mug/src/main/java/com/google/mu/util/stream/MoreCollectors.java`
#### Snippet
```java
   */
  public static <K, V, R> Collector<Map<K, V>, ?, R> flatteningMaps(
      BiCollector<K, V, R> downstream) {
    return flatMapping(BiStream::from, downstream);
  }
```

### BoundedWildcard
Can generalize to `? extends R`
in `mug/src/main/java/com/google/mu/util/stream/MoreCollectors.java`
#### Snippet
```java
   */
  public static <T, R> Collector<T, ?, R> allMax(
      Comparator<? super T> comparator, Collector<? super T, ?, R> downstream) {
    requireNonNull(comparator);
    requireNonNull(downstream);
```

### BoundedWildcard
Can generalize to `? extends T`
in `mug/src/main/java/com/google/mu/util/stream/MoreCollectors.java`
#### Snippet
```java
  public static <E, A1, A2, T, F> Collector<E, ?, Both<T, F>> partitioningBy(
      Predicate<? super E> predicate,
      Collector<E, A1, T> downstreamIfTrue,
      Collector<E, A2, F> downstreamIfFalse) {
    requireNonNull(predicate);
```

### BoundedWildcard
Can generalize to `? extends F`
in `mug/src/main/java/com/google/mu/util/stream/MoreCollectors.java`
#### Snippet
```java
      Predicate<? super E> predicate,
      Collector<E, A1, T> downstreamIfTrue,
      Collector<E, A2, F> downstreamIfFalse) {
    requireNonNull(predicate);
    Supplier<A1> factory1 = downstreamIfTrue.supplier();
```

### BoundedWildcard
Can generalize to `? extends FixedSizeCollector`
in `mug/src/main/java/com/google/mu/util/stream/MoreCollectors.java`
#### Snippet
```java
  }

  private static <T, R> Collector<T, ?, R> switching(List<FixedSizeCollector<T, ?, R>> cases) {
    if (cases.size() == 1) {
      return cases.get(0);
```

### BoundedWildcard
Can generalize to `? super E`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, ImmutableMap<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return ImmutableMap.toImmutableMap(toKey, toValue, valueMerger);
      }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, ImmutableMap<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return ImmutableMap.toImmutableMap(toKey, toValue, valueMerger);
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, ImmutableMap<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return ImmutableMap.toImmutableMap(toKey, toValue, valueMerger);
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, ImmutableMap<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return ImmutableMap.toImmutableMap(toKey, toValue, valueMerger);
      }
```

### BoundedWildcard
Can generalize to `? super T`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
      Function<? super T, ? extends R> rowFunction,
      Function<? super T, ? extends C> columnFunction,
      Collector<T, ?, V> cellCollector) {
    return collectingAndThen(
        groupingBy(rowFunction, groupingBy(columnFunction, cellCollector)),
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
      Function<? super T, ? extends R> rowFunction,
      Function<? super T, ? extends C> columnFunction,
      Collector<T, ?, V> cellCollector) {
    return collectingAndThen(
        groupingBy(rowFunction, groupingBy(columnFunction, cellCollector)),
```

### BoundedWildcard
Can generalize to `? super E`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, ImmutableSortedMap<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return ImmutableSortedMap.toImmutableSortedMap(comparator, toKey, toValue);
      }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, ImmutableSortedMap<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return ImmutableSortedMap.toImmutableSortedMap(comparator, toKey, toValue);
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, ImmutableSortedMap<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return ImmutableSortedMap.toImmutableSortedMap(comparator, toKey, toValue);
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, ImmutableSortedMap<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return ImmutableSortedMap.toImmutableSortedMap(comparator, toKey, toValue);
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, ImmutableSortedMap<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return ImmutableSortedMap.toImmutableSortedMap(comparator, toKey, toValue, valueMerger);
      }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, ImmutableSortedMap<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return ImmutableSortedMap.toImmutableSortedMap(comparator, toKey, toValue, valueMerger);
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, ImmutableSortedMap<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return ImmutableSortedMap.toImmutableSortedMap(comparator, toKey, toValue, valueMerger);
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, ImmutableSortedMap<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return ImmutableSortedMap.toImmutableSortedMap(comparator, toKey, toValue, valueMerger);
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
    return new BiCollector<K, V, R>() {
      @Override
      public <E> Collector<E, ?, R> collectorOf(Function<E, K> toKey, Function<E, V> toValue) {
        return downstream.collectorOf(toKey, toValue.andThen(mapper));
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
    return new BiCollector<K, V, M>() {
      @Override
      public <E> Collector<E, ?, M> collectorOf(Function<E, K> toKey, Function<E, V> toValue) {
        return Multimaps.toMultimap(toKey, toValue, multimapSupplier);
      }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
    return new BiCollector<K, V, M>() {
      @Override
      public <E> Collector<E, ?, M> collectorOf(Function<E, K> toKey, Function<E, V> toValue) {
        return Multimaps.toMultimap(toKey, toValue, multimapSupplier);
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
    return new BiCollector<K, V, M>() {
      @Override
      public <E> Collector<E, ?, M> collectorOf(Function<E, K> toKey, Function<E, V> toValue) {
        return Multimaps.toMultimap(toKey, toValue, multimapSupplier);
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
    return new BiCollector<K, V, M>() {
      @Override
      public <E> Collector<E, ?, M> collectorOf(Function<E, K> toKey, Function<E, V> toValue) {
        return Multimaps.toMultimap(toKey, toValue, multimapSupplier);
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, ImmutableMultiset<K>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return ImmutableMultiset.toImmutableMultiset(
            toKey, input -> countFunction.applyAsInt(toValue.apply(input)));
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, ImmutableMultiset<K>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return ImmutableMultiset.toImmutableMultiset(
            toKey, input -> countFunction.applyAsInt(toValue.apply(input)));
```

### BoundedWildcard
Can generalize to `? super E`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, ImmutableMultiset<K>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return ImmutableMultiset.toImmutableMultiset(
            toKey, input -> countFunction.applyAsInt(toValue.apply(input)));
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, ImmutableMultiset<K>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return ImmutableMultiset.toImmutableMultiset(
            toKey, input -> countFunction.applyAsInt(toValue.apply(input)));
```

### BoundedWildcard
Can generalize to `? super V1`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
   */
  public static <K, V1, V> BiCollector<K, V1, ImmutableMap<K, V>> toImmutableMap(
      Collector<V1, ?, V> valueCollector) {
    return BiCollectors.collectingAndThen(
        BiCollectors.groupingBy(identity(), valueCollector),
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug-guava/src/main/java/com/google/mu/util/stream/GuavaCollectors.java`
#### Snippet
```java
   */
  public static <K, V1, V> BiCollector<K, V1, ImmutableMap<K, V>> toImmutableMap(
      Collector<V1, ?, V> valueCollector) {
    return BiCollectors.collectingAndThen(
        BiCollectors.groupingBy(identity(), valueCollector),
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Integer> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summingInt(e -> mapper.applyAsInt(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Integer> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summingInt(e -> mapper.applyAsInt(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Integer> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summingInt(e -> mapper.applyAsInt(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Integer> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summingInt(e -> mapper.applyAsInt(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, BiOptional<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.collectingAndThen(
            Collectors.mapping(
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, BiOptional<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.collectingAndThen(
            Collectors.mapping(
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, BiOptional<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.collectingAndThen(
            Collectors.mapping(
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, BiOptional<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.collectingAndThen(
            Collectors.mapping(
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, BiStream<G, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return BiStream.groupingBy(toKey.andThen(classifier), toValue, groupReducer);
      }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, BiStream<G, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return BiStream.groupingBy(toKey.andThen(classifier), toValue, groupReducer);
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, BiStream<G, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return BiStream.groupingBy(toKey.andThen(classifier), toValue, groupReducer);
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, BiStream<G, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return BiStream.groupingBy(toKey.andThen(classifier), toValue, groupReducer);
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Double> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summingDouble(e -> mapper.applyAsDouble(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Double> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summingDouble(e -> mapper.applyAsDouble(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Double> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summingDouble(e -> mapper.applyAsDouble(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Double> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summingDouble(e -> mapper.applyAsDouble(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Double> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.averagingLong(e -> mapper.applyAsLong(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Double> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.averagingLong(e -> mapper.applyAsLong(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Double> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.averagingLong(e -> mapper.applyAsLong(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Double> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.averagingLong(e -> mapper.applyAsLong(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Long> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summingLong(e -> mapper.applyAsLong(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Long> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summingLong(e -> mapper.applyAsLong(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Long> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summingLong(e -> mapper.applyAsLong(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Long> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summingLong(e -> mapper.applyAsLong(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Double> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.averagingDouble(e -> mapper.applyAsDouble(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Double> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.averagingDouble(e -> mapper.applyAsDouble(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Double> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.averagingDouble(e -> mapper.applyAsDouble(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Double> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.averagingDouble(e -> mapper.applyAsDouble(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, LongSummaryStatistics> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summarizingLong(e -> mapper.applyAsLong(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, LongSummaryStatistics> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summarizingLong(e -> mapper.applyAsLong(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, LongSummaryStatistics> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summarizingLong(e -> mapper.applyAsLong(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, LongSummaryStatistics> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summarizingLong(e -> mapper.applyAsLong(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Map<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.toMap(toKey, toValue, valueMerger);
      }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Map<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.toMap(toKey, toValue, valueMerger);
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Map<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.toMap(toKey, toValue, valueMerger);
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Map<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.toMap(toKey, toValue, valueMerger);
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Double> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.averagingInt(e -> mapper.applyAsInt(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Double> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.averagingInt(e -> mapper.applyAsInt(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Double> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.averagingInt(e -> mapper.applyAsInt(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Double> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.averagingInt(e -> mapper.applyAsInt(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
    return new BiCollector<K, V, M>() {
      @Override public <E> Collector<E, ?, M> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return MoreCollectors.toMap(toKey, toValue, mapSupplier);
      }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
    return new BiCollector<K, V, M>() {
      @Override public <E> Collector<E, ?, M> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return MoreCollectors.toMap(toKey, toValue, mapSupplier);
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
    return new BiCollector<K, V, M>() {
      @Override public <E> Collector<E, ?, M> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return MoreCollectors.toMap(toKey, toValue, mapSupplier);
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
    return new BiCollector<K, V, M>() {
      @Override public <E> Collector<E, ?, M> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return MoreCollectors.toMap(toKey, toValue, mapSupplier);
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
    requireNonNull(downstream);
    return new BiCollector<K, V, R>() {
      @Override public <E> Collector<E, ?, R> collectorOf(Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.mapping(
            e -> mapper.apply(toKey.apply(e), toValue.apply(e)),
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
    requireNonNull(downstream);
    return new BiCollector<K, V, R>() {
      @Override public <E> Collector<E, ?, R> collectorOf(Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.mapping(
            e -> mapper.apply(toKey.apply(e), toValue.apply(e)),
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
    requireNonNull(downstream);
    return new BiCollector<K, V, R>() {
      @Override public <E> Collector<E, ?, R> collectorOf(Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.mapping(
            e -> mapper.apply(toKey.apply(e), toValue.apply(e)),
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
    requireNonNull(downstream);
    return new BiCollector<K, V, R>() {
      @Override public <E> Collector<E, ?, R> collectorOf(Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.mapping(
            e -> mapper.apply(toKey.apply(e), toValue.apply(e)),
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
    requireNonNull(downstream);
    return new BiCollector<K, V, R>() {
      @Override public <E> Collector<E, ?, R> collectorOf(Function<E, K> toKey, Function<E, V> toValue) {
        return Java9Collectors.flatMapping(e -> flattener.apply(toKey.apply(e), toValue.apply(e)), downstream);
      }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
    requireNonNull(downstream);
    return new BiCollector<K, V, R>() {
      @Override public <E> Collector<E, ?, R> collectorOf(Function<E, K> toKey, Function<E, V> toValue) {
        return Java9Collectors.flatMapping(e -> flattener.apply(toKey.apply(e), toValue.apply(e)), downstream);
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
    requireNonNull(downstream);
    return new BiCollector<K, V, R>() {
      @Override public <E> Collector<E, ?, R> collectorOf(Function<E, K> toKey, Function<E, V> toValue) {
        return Java9Collectors.flatMapping(e -> flattener.apply(toKey.apply(e), toValue.apply(e)), downstream);
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
    requireNonNull(downstream);
    return new BiCollector<K, V, R>() {
      @Override public <E> Collector<E, ?, R> collectorOf(Function<E, K> toKey, Function<E, V> toValue) {
        return Java9Collectors.flatMapping(e -> flattener.apply(toKey.apply(e), toValue.apply(e)), downstream);
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, BiOptional<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.collectingAndThen(
            Collectors.maxBy((e1, e2) -> comparator.compare(toKey.apply(e1), toValue.apply(e1), toKey.apply(e2), toValue.apply(e2))),
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, BiOptional<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.collectingAndThen(
            Collectors.maxBy((e1, e2) -> comparator.compare(toKey.apply(e1), toValue.apply(e1), toKey.apply(e2), toValue.apply(e2))),
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, BiOptional<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.collectingAndThen(
            Collectors.maxBy((e1, e2) -> comparator.compare(toKey.apply(e1), toValue.apply(e1), toKey.apply(e2), toValue.apply(e2))),
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, BiOptional<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.collectingAndThen(
            Collectors.maxBy((e1, e2) -> comparator.compare(toKey.apply(e1), toValue.apply(e1), toKey.apply(e2), toValue.apply(e2))),
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
    requireNonNull(downstream);
    return new BiCollector<K, V, R>() {
      @Override public <E> Collector<E, ?, R> collectorOf(Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.mapping(e -> mapper.apply(toKey.apply(e), toValue.apply(e)), downstream);
      }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
    requireNonNull(downstream);
    return new BiCollector<K, V, R>() {
      @Override public <E> Collector<E, ?, R> collectorOf(Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.mapping(e -> mapper.apply(toKey.apply(e), toValue.apply(e)), downstream);
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
    requireNonNull(downstream);
    return new BiCollector<K, V, R>() {
      @Override public <E> Collector<E, ?, R> collectorOf(Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.mapping(e -> mapper.apply(toKey.apply(e), toValue.apply(e)), downstream);
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
    requireNonNull(downstream);
    return new BiCollector<K, V, R>() {
      @Override public <E> Collector<E, ?, R> collectorOf(Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.mapping(e -> mapper.apply(toKey.apply(e), toValue.apply(e)), downstream);
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Map<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V1> toValue) {
        return Collectors.collectingAndThen(
            Collectors.groupingBy(
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Map<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V1> toValue) {
        return Collectors.collectingAndThen(
            Collectors.groupingBy(
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Map<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V1> toValue) {
        return Collectors.collectingAndThen(
            Collectors.groupingBy(
```

### BoundedWildcard
Can generalize to `? extends V1`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, Map<K, V>> collectorOf(
          Function<E, K> toKey, Function<E, V1> toValue) {
        return Collectors.collectingAndThen(
            Collectors.groupingBy(
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, BiStream<G, R>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return BiStream.groupingBy(
            e -> classifier.apply(toKey.apply(e), toValue.apply(e)),
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, BiStream<G, R>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return BiStream.groupingBy(
            e -> classifier.apply(toKey.apply(e), toValue.apply(e)),
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, BiStream<G, R>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return BiStream.groupingBy(
            e -> classifier.apply(toKey.apply(e), toValue.apply(e)),
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, BiStream<G, R>> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return BiStream.groupingBy(
            e -> classifier.apply(toKey.apply(e), toValue.apply(e)),
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, IntSummaryStatistics> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summarizingInt(e -> mapper.applyAsInt(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, IntSummaryStatistics> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summarizingInt(e -> mapper.applyAsInt(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, IntSummaryStatistics> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summarizingInt(e -> mapper.applyAsInt(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, IntSummaryStatistics> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summarizingInt(e -> mapper.applyAsInt(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? super V1`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
   * <p>Entries are collected in encounter order.
   */
  public static <K, V1, V> BiCollector<K, V1, Map<K, V>> toMap(Collector<V1, ?, V> valueCollector) {
    requireNonNull(valueCollector);
    return new BiCollector<K, V1, Map<K, V>>() {
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
   * <p>Entries are collected in encounter order.
   */
  public static <K, V1, V> BiCollector<K, V1, Map<K, V>> toMap(Collector<V1, ?, V> valueCollector) {
    requireNonNull(valueCollector);
    return new BiCollector<K, V1, Map<K, V>>() {
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, DoubleSummaryStatistics> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summarizingDouble(e -> mapper.applyAsDouble(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, DoubleSummaryStatistics> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summarizingDouble(e -> mapper.applyAsDouble(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? super E`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, DoubleSummaryStatistics> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summarizingDouble(e -> mapper.applyAsDouble(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiCollectors.java`
#### Snippet
```java
      @Override
      public <E> Collector<E, ?, DoubleSummaryStatistics> collectorOf(
          Function<E, K> toKey, Function<E, V> toValue) {
        return Collectors.summarizingDouble(e -> mapper.applyAsDouble(toKey.apply(e), toValue.apply(e)));
      }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
   */
  public static <K, V> BiStream<K, V> biStream(
      Function<? super V, ? extends K> toKey, Stream<V> values) {
    return new GenericEntryStream<>(values, toKey, identity());
  }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
   */
  public static <K, V> BiStream<K, V> biStream(
      Collection<K> keys, Function<? super K, ? extends V> toValue) {
    return new GenericEntryStream<>(keys.stream(), identity(), toValue);
  }
```

### BoundedWildcard
Can generalize to `? extends R`
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
   */
  public final <A, R> Stream<R> groupConsecutiveIf(
      BiPredicate<? super K, ? super K> sameGroup, Collector<? super V, A, R> groupCollector) {
    BiConsumer<A, ? super V> groupAccumulator = groupCollector.accumulator();
    return groupConsecutiveIf(
```

### BoundedWildcard
Can generalize to `? extends T`
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
   * @since 3.0
   */
  public static <T> BiStream<T, T> biStream(Collection<T> elements) {
    return from(elements, identity(), identity());
  }
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java

  /** Returns a {@code BiStream} of the entries in {@code map}. */
  public static <K, V> BiStream<K, V> from(Map<K, V> map) {
    return from(map.entrySet());
  }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java

  /** Returns a {@code BiStream} of the entries in {@code map}. */
  public static <K, V> BiStream<K, V> from(Map<K, V> map) {
    return from(map.entrySet());
  }
```

### BoundedWildcard
Can generalize to `? extends V`
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
   */
  public static <K, V> BiStream<K, V> biStream(
      Function<? super V, ? extends K> toKey, Collection<V> values) {
    return new GenericEntryStream<>(values.stream(), toKey, identity());
  }
```

### BoundedWildcard
Can generalize to `? extends A`
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java

  private <A> BiStream<K, A> groupConsecutiveByKeys(
      Supplier<A> newGroup, BiConsumer<? super A, ? super V> groupAccumulator) {
    requireNonNull(newGroup);
    requireNonNull(groupAccumulator);
```

### BoundedWildcard
Can generalize to `? extends R`
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
   * @since 3.0
   */
  public static <L, R> Collector<L, ?, BiStream<L, R>> crossJoining(Stream<R> right) {
    requireNonNull(right);
    return collectingAndThen(
```

### BoundedWildcard
Can generalize to `? extends R`
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java

  private <A, R> BiStream<K, R> groupConsecutiveByKeys(
      Collector<? super V, A, R> groupCollector) {
    return groupConsecutiveByKeys(groupCollector.supplier(), groupCollector.accumulator())
        .mapValues(groupCollector.finisher());
```

### BoundedWildcard
Can generalize to `? extends T`
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
    }

    final <T> Function<E, T> forEntry(BiFunction<? super K, ? super V, T> function) {
      requireNonNull(function);
      return e -> function.apply(toKey.apply(e), toValue.apply(e));
```

### BoundedWildcard
Can generalize to `? extends K`
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
   */
  public static <K, V> BiStream<K, V> biStream(
      Stream<K> keys, Function<? super K, ? extends V> toValue) {
    return new GenericEntryStream<>(keys, identity(), toValue);
  }
```

### BoundedWildcard
Can generalize to `? super T`
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
  public static <T, K, V> Collector<T, ?, BiStream<K, V>> groupingByEach(
      Function<? super T, ? extends Stream<? extends K>> keysFunction,
      Collector<T, ?, V> groupCollector) {
    requireNonNull(keysFunction);
    return Java9Collectors.flatMapping(
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `static abstract`
in `mug-guava/src/main/java/com/google/mu/util/BinarySearch.java`
#### Snippet
```java
   *     a parabola function.
   */
  public static abstract class Table<K, C extends Comparable<C>> {
    /**
     * Searches for {@code target} and returns the result if found; or else returns empty.
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `mug/src/main/java/com/google/mu/util/concurrent/Retryer.java`
#### Snippet
```java

  /** Represents a delay upon an event of type {@code E} prior to the retry attempt. */
  public static abstract class Delay<E> implements Comparable<Delay<E>> {

    /** Returns the delay interval. */
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

## RuleId[id=OptionalUsedAsFieldOrParameterType]
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

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `mug-guava/src/main/java/com/google/mu/util/BinarySearch.java`
#### Snippet
```java
    return inRangeInclusive(0, array.length - 1)
        .by(target -> {
          long longValue = target.longValue();
          return (l, i, h) -> Long.compare(longValue, array[i]);
        });
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `mug-guava/src/main/java/com/google/mu/util/BinarySearch.java`
#### Snippet
```java
    return inRangeInclusive(0, array.length - 1)
        .by(target -> {
          double v = target.doubleValue();
          return (l, i, h) -> DoubleMath.fuzzyCompare(v, array[i], tolerance);
        });
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `mug-guava/src/main/java/com/google/mu/util/BinarySearch.java`
#### Snippet
```java
    return inRangeInclusive(0, list.size() - 1)
        .by(target -> {
          double v = target.doubleValue();
          return (l, i, h) -> DoubleMath.fuzzyCompare(v, list.get(i), tolerance);
        });
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `mug-guava/src/main/java/com/google/mu/util/BinarySearch.java`
#### Snippet
```java
    return inRangeInclusive(0, array.length - 1)
        .by(target -> {
          int intValue = target.intValue();
          return (l, i, h) -> Integer.compare(intValue, array[i]);
        });
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `toString()` only delegates to its super method
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
     * and {@link Suffix} that have an explicitly defined representation.
     */
    @Override public String toString() {
      return super.toString();
    }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.google.mu.util` is unnecessary and can be removed
in `mug/src/main/java/com/google/mu/util/MoreIterables.java`
#### Snippet
```java
   *
   * <p>It can also be used to compare two {@code Optional} objects, by first converting the {@code
   * Optional} into a {@code Set} using {@link com.google.mu.util.Optionals#asSet}. For
   * example:
   *
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `mug/src/main/java/com/google/mu/util/stream/MoreStreams.java`
#### Snippet
```java
      }
      boolean advanced = false;
      while ((!(advanced = currentBlock.tryAdvance(action))) && tryAdvanceBlock()) {}
      return advanced;
    }
```

### NestedAssignment
Result of assignment expression used
in `mug/src/main/java/com/google/mu/util/stream/MoreCollectors.java`
#### Snippet
```java
      void add(T element) {
        if (empty) {
          min = max = element;
          empty = false;
        } else {
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
        toImmutableList(),
        candidates -> {
          return new Pattern() {
            @Override
            Match match(String input, int fromIndex) {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `mug/src/main/java/com/google/mu/util/stream/MoreStreams.java`
#### Snippet
```java
    private final Spliterator<? extends Stream<? extends T>> blocks;
    private Spliterator<? extends T> currentBlock;
    private final Consumer<Stream<? extends T>> nextBlock = block -> {
      currentBlock = block.spliterator();
    };
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `mug/src/main/java/com/google/mu/util/concurrent/Retryer.java`
#### Snippet
```java
          () -> afterDelay.run(result::completeExceptionally),
          duration().toMillis(), TimeUnit.MILLISECONDS);
      ifCancelled(result, canceled -> {scheduled.cancel(true);});
    }

```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
     * and {@link Suffix} that have an explicitly defined representation.
     */
    @Override public String toString() {
      return super.toString();
    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `mug/src/main/java/com/google/mu/util/StringFormat.java`
#### Snippet
```java
        new Supplier<List<Substring.Match>>() {
          private int inputIndex = 0;
          private boolean done = false;

          @Override public List<Substring.Match> get() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `mug/src/main/java/com/google/mu/util/StringFormat.java`
#### Snippet
```java
    return MoreStreams.whileNotNull(
        new Supplier<List<Substring.Match>>() {
          private int inputIndex = 0;
          private boolean done = false;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
          new Supplier<Match>() {
            private final int end = input.length();
            private int nextIndex = 0;

            @Override public Match get() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
      return MoreStreams.whileNotNull(
          new Supplier<Match>() {
            int next = 0;
            Iterator<Match> it = match(string).iterator();

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
        } else {
          return MoreStreams.whileNotNull(new Supplier<Match>() {
            private int next = 0;
            private int g = 1;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `mug/src/main/java/com/google/mu/util/stream/Cases.java`
#### Snippet
```java
    private T first;
    private T second;
    private int size = 0;

    static <T> Collector<T, ?, TinyContainer<T>> toTinyContainer() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `mug/src/main/java/com/google/mu/util/Funnel.java`
#### Snippet
```java
public final class Funnel<T> {

  private int size = 0;
  private final List<Batch<?, T>> batches = new ArrayList<>();
  private final Batch<T, T> passthrough = through(Function.identity());
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
      private K previousKey;
      private A currentRun = null;
      private boolean hasRunResult = false;
      private R runResult;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
      private final BiIterator<K, V> iterator = iterator();
      private K previousKey;
      private A currentRun = null;
      private boolean hasRunResult = false;
      private R runResult;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `string`
in `mug/src/main/java/com/google/mu/util/Selection.java`
#### Snippet
```java
        String string,
        CheckedFunction<String, ? extends T, E> elementParser) throws E {
      string = string.trim();
      requireNonNull(elementParser);
      if (string.equals("*")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `fromIndex`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
          while (fromIndex <= input.length()) {
            if (fromIndex > 0 && !separatorBefore.test(input.charAt(fromIndex - 1))) {
              fromIndex++;
              continue; // The current position cannot possibly be the beginning of match.
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `fromIndex`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
              }
            }
            fromIndex = match.backtrackFrom(fromIndex);
          }
          return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `fromIndex`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
              return match;
            }
            fromIndex = match.backtrackFrom(fromIndex);
          }
          return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `fromIndex`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
              return match;
            }
            fromIndex = match.backtrackFrom(fromIndex);
          }
          return null;
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `mug/src/main/java/com/google/mu/util/concurrent/Retryer.java`
#### Snippet
```java
      retryIfCovered(e, retryExecutor, supplier, future);
    } catch (Throwable e) {
      if (e instanceof InterruptedException) {
        CancellationException cancelled = new CancellationException();
        cancelled.initCause(e);
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `mug/src/main/java/com/google/mu/util/concurrent/Retryer.java`
#### Snippet
```java
          return supplier.get();
        } catch (Throwable e) {
          if (e instanceof InterruptedException) throw e;
          exceptions.add(e);
          currentPlan = delay(e, currentPlan);
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-06-04-24-59.089.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/concurrent/Utils.java`
#### Snippet
```java
    return stage.exceptionally(e -> {
      cast(e, CancellationException.class).ifPresent(action);
      return null;
    });
  }
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/StringFormat.java`
#### Snippet
```java
          @Override public List<Substring.Match> get() {
            if (done) {
              return null;
            }
            inputIndex = input.indexOf(literals.get(0), inputIndex);
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/StringFormat.java`
#### Snippet
```java
            inputIndex = input.indexOf(literals.get(0), inputIndex);
            if (inputIndex < 0) {
              return null;
            }
            inputIndex += literals.get(0).length();
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/StringFormat.java`
#### Snippet
```java
              Substring.Match placeholder = before(literalLocator).match(input, inputIndex);
              if (placeholder == null) {
                return null;
              }
              builder.add(placeholder);
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/graph/GraphWalker.java`
#### Snippet
```java
          }
        } while (!horizon.isEmpty());
        return null; // no more element
      });
    }
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/graph/ShortestPath.java`
#### Snippet
```java
  private static <F, T> Stream<T> mapOrNull(
      Stream<? extends F> stream, Function<? super F, ? extends T> mapper) {
    return stream == null ? null : stream.map(mapper);
  }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
            i = min(match.endIndex - 1, i - 1);
          }
          return null;
        }
      };
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
                    final Occurrence occurrence = occurrences.poll();
                    if (occurrence == null) {
                      return null;
                    }
                    final Match match = occurrence.match;
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
      @Override Match match(String input, int fromIndex) {
        Match match = delimiter.match(input, fromIndex);
        return match == null ? null : match.following();
      }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
          }
        }
        return len == 0 ? null : Match.suffix(input, len);
      }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
        Match match = delimiter.match(input, fromIndex);
        return match == null
            ? null
            // For example when matching before(first("//")) against "http://", there should be
            // only one iteration, which is "http:". If the next scan starts before //, we'd get
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
            Match match = target.match(input, fromIndex);
            if (match == null) {
              return null;
            }
            if (match.startIndex == fromIndex // Already checked boundaryBefore
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
            fromIndex = match.backtrackFrom(fromIndex);
          }
          return null;
        }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
    @Override Match match(String s, int fromIndex) {
      requireNonNull(s);
      return null;
    }
    @Override public String toString() {
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
          }
        }
        return len == 0 ? null : Match.nonBacktrackable(input, fromIndex, len);
      }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
          }
        }
        return null;
      }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
            @Override public Match get() {
              if (nextIndex > end) {
                return null;
              }
              Match match = match(input, nextIndex);
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
              Match match = match(input, nextIndex);
              if (match == null) {
                return null;
              }
              if (match.endIndex == end) { // We've consumed the entire string.
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
          Match preceding = base.match(input, fromIndex);
          if (preceding == null) {
            return null;
          }
          Match next = following.match(input, preceding.endIndex);
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
          Match next = following.match(input, preceding.endIndex);
          if (next == null) {
            return null;
          }
          // Keep the repetitionStartIndex strictly increasing to avoid the next iteration
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
      return index >= fromIndex && input.endsWith(suffix)
          ? Match.suffix(input, suffix.length())
          : null;
    }
  }
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
                return result;
              } else {
                return null;
              }
            }
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
          Match preceding = base.match(input, fromIndex);
          if (preceding == null) {
            return null;
          }
          return following.match(input, preceding.endIndex) == null ? null : preceding;
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
            return null;
          }
          return following.match(input, preceding.endIndex) == null ? null : preceding;
        }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
        @Override Match match(String input, int fromIndex) {
          Match match = base.match(input, fromIndex);
          return match == null ? null : match.toEnd();
        }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
        Match match = pattern.match(input, fromIndex);
        return match == null
            ? null
            // Do not include the delimiter pattern in the next iteration.
            // upToIncluding(first('/')).separatedBy() should not backtrack to the second '/'.
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
          return Match.backtrackable(1, input, start, matcher.end(group) - start);
        }
        return null;
      }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
      return new Pattern() {
        @Override Match match(String input, int fromIndex) {
          return base.match(input, fromIndex) == null ? BEGINNING.match(input, fromIndex) : null;
        }
        @Override public String toString() {
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
                }
              }
              return null;
            }
          });
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
            fromIndex = match.backtrackFrom(fromIndex);
          }
          return null;
        }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
          }
        }
        return null;
      }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
      return input.startsWith(prefix, fromIndex)
          ? Match.nonBacktrackable(input, fromIndex, prefix.length())
          : null;
    }
  }
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
      @Override Match match(String input, int fromIndex) {
        int index = input.indexOf(character, fromIndex);
        return index >= 0 ? Match.backtrackable(1, input, index, 1) : null;
      }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
            fromIndex = match.backtrackFrom(fromIndex);
          }
          return null;
        }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
        @Override Match match(String input, int fromIndex) {
          Match m = base.match(input, fromIndex);
          return m == null ? null : m.limit(maxChars);
        }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
      @Override Match match(String input, int fromIndex) {
        int index = input.indexOf(str, fromIndex);
        return index >= fromIndex ? Match.backtrackable(1, input, index, str.length()) : null;
      }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
          }
        }
        return null;
      }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
        return index >= fromIndex
            ? Match.nonBacktrackable(input, index, str.length())
            : null;
      }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
        Match left = open.match(input, fromIndex);
        if (left == null) {
          return null;
        }
        Match right = close.match(input, left.endIndex);
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
        Match right = close.match(input, left.endIndex);
        if (right == null) {
          return null;
        }
        int startIndex = left.endIndex;
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
        @Override Match match(String input, int fromIndex) {
          Match m = original.match(input, fromIndex);
          return m == null ? null : m.skip(fromBeginning, fromEnd);
        }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
          Match preceding = base.match(input, fromIndex);
          if (preceding == null) {
            return null;
          }
          Match next = following.match(input, preceding.endIndex);
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
          Match next = following.match(input, preceding.endIndex);
          if (next == null) {
            return null;
          }
          return new Match(
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Substring.java`
#### Snippet
```java
      @Override Match match(String input, int fromIndex, int endIndex) {
        int index = input.lastIndexOf(character, endIndex - 1);
        return index >= fromIndex ? Match.nonBacktrackable(input, index, 1) : null;
      }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/graph/BinaryTreeWalker.java`
#### Snippet
```java
        if (ready.get(leftPath.size() - 1)) return leftPath.pop();
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/graph/BinaryTreeWalker.java`
#### Snippet
```java
        return node;
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/stream/MoreStreams.java`
#### Snippet
```java
          }
          @Override public Spliterator<T> trySplit() {
            return null;
          }
        },
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/stream/MoreStreams.java`
#### Snippet
```java
      Spliterator<F> from, Function<? super Spliterator<F>, ? extends T> wrapper) {
    Spliterator<F> it = from.trySplit();
    return it == null ? null : wrapper.apply(it);
  }

```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/Maybe.java`
#### Snippet
```java
        future.completeExceptionally(x);
      }
      return null;
    });
    return future;
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/concurrent/Retryer.java`
#### Snippet
```java
        future.exceptionally(x -> {
          addSuppressedTo(x, e);
          return null;
        });
        if (future.isDone()) return;  // like, canceled immediately before scheduling.
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/concurrent/Retryer.java`
#### Snippet
```java
        if (e == null) future.complete(v);
        else scheduleRetry(getInterestedException(e), retryExecutor, supplier, future);
        return null;
      });
    } catch (RuntimeException e) {
```

### ReturnNull
Return of `null`
in `mug/src/main/java/com/google/mu/util/stream/BiStream.java`
#### Snippet
```java
                I in = nextInput;
                if (in == null) {
                  return null;
                }
                O out = work.apply(in);
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `mug/src/main/java/com/google/mu/util/stream/Java9Collectors.java`
#### Snippet
```java
        collector.combiner(),
        collector.finisher(),
        collector.characteristics().toArray(new Characteristics[0]));
  }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `mug/src/main/java/com/google/mu/util/stream/Java9Collectors.java`
#### Snippet
```java
        collector.combiner(),
        collector.finisher(),
        collector.characteristics().toArray(new Characteristics[0]));
  }

```

## RuleId[id=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof Collection' check
in `mug/src/main/java/com/google/mu/util/MoreIterables.java`
#### Snippet
```java
      }
      if (isRandomAccessList(left) && isRandomAccessList(right)) {
        List<A> list1 = (List<A>) left;
        List<B> list2 = (List<B>) right;
        for (int i = 0; i < size; i++) {
```

### CastConflictsWithInstanceof
Cast to 'List**' type conflicts with preceding 'instanceof Collection' check**
in `mug/src/main/java/com/google/mu/util/MoreIterables.java`
#### Snippet
```java
      if (isRandomAccessList(left) && isRandomAccessList(right)) {
        List<A> list1 = (List<A>) left;
        List<B> list2 = (List<B>) right;
        for (int i = 0; i < size; i++) {
          if (!matcher.test(list1.get(i), list2.get(i))) {
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

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.primitives.ImmutableIntArray' is marked unstable with @Beta
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
   * <li>{@link Table} converted as {@code toValue(table.rowMap())}
   * <li>{@link Optional} converted as {@code toValue(optional.orElse(null))}
   * <li>{@link ImmutableIntArray}, {@link ImmutableLongArray} and {@link ImmutableDoubleArray}
   *     elements wrapped in {@link ListValue}
   * <li>Built-in protobuf types ({@link Struct}, {@link Value}, {@link ListValue}, {@link NullValue})
```

### UnstableApiUsage
'com.google.common.primitives.ImmutableLongArray' is marked unstable with @Beta
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
   * <li>{@link Table} converted as {@code toValue(table.rowMap())}
   * <li>{@link Optional} converted as {@code toValue(optional.orElse(null))}
   * <li>{@link ImmutableIntArray}, {@link ImmutableLongArray} and {@link ImmutableDoubleArray}
   *     elements wrapped in {@link ListValue}
   * <li>Built-in protobuf types ({@link Struct}, {@link Value}, {@link ListValue}, {@link NullValue})
```

### UnstableApiUsage
'com.google.common.primitives.ImmutableDoubleArray' is marked unstable with @Beta
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
   * <li>{@link Table} converted as {@code toValue(table.rowMap())}
   * <li>{@link Optional} converted as {@code toValue(optional.orElse(null))}
   * <li>{@link ImmutableIntArray}, {@link ImmutableLongArray} and {@link ImmutableDoubleArray}
   *     elements wrapped in {@link ListValue}
   * <li>Built-in protobuf types ({@link Struct}, {@link Value}, {@link ListValue}, {@link NullValue})
```

### UnstableApiUsage
'com.google.common.primitives.ImmutableIntArray' is marked unstable with @Beta
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
          .collect(valuesToValue());
    }
    if (object instanceof ImmutableIntArray) {
      // TODO: use ImmutableIntArray.stream() when it's available in Android
     ImmutableIntArray array = (ImmutableIntArray) object;
```

### UnstableApiUsage
'com.google.common.primitives.ImmutableIntArray' is marked unstable with @Beta
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
    if (object instanceof ImmutableIntArray) {
      // TODO: use ImmutableIntArray.stream() when it's available in Android
     ImmutableIntArray array = (ImmutableIntArray) object;
     return IntStream.range(0, array.length())
          .mapToObj(i -> valueOf(array.get(i)))
```

### UnstableApiUsage
'com.google.common.primitives.ImmutableIntArray' is marked unstable with @Beta
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
    if (object instanceof ImmutableIntArray) {
      // TODO: use ImmutableIntArray.stream() when it's available in Android
     ImmutableIntArray array = (ImmutableIntArray) object;
     return IntStream.range(0, array.length())
          .mapToObj(i -> valueOf(array.get(i)))
```

### UnstableApiUsage
'length()' is declared in unstable class 'com.google.common.primitives.ImmutableIntArray' marked with @Beta
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
      // TODO: use ImmutableIntArray.stream() when it's available in Android
     ImmutableIntArray array = (ImmutableIntArray) object;
     return IntStream.range(0, array.length())
          .mapToObj(i -> valueOf(array.get(i)))
          .collect(valuesToValue());
```

### UnstableApiUsage
'get(int)' is declared in unstable class 'com.google.common.primitives.ImmutableIntArray' marked with @Beta
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
     ImmutableIntArray array = (ImmutableIntArray) object;
     return IntStream.range(0, array.length())
          .mapToObj(i -> valueOf(array.get(i)))
          .collect(valuesToValue());
    }
```

### UnstableApiUsage
'com.google.common.primitives.ImmutableLongArray' is marked unstable with @Beta
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
          .collect(valuesToValue());
    }
    if (object instanceof ImmutableLongArray) {
      // TODO: use ImmutableLongArray.stream() when it's available in Android
      ImmutableLongArray array = (ImmutableLongArray) object;
```

### UnstableApiUsage
'com.google.common.primitives.ImmutableLongArray' is marked unstable with @Beta
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
    if (object instanceof ImmutableLongArray) {
      // TODO: use ImmutableLongArray.stream() when it's available in Android
      ImmutableLongArray array = (ImmutableLongArray) object;
      return IntStream.range(0, array.length())
          .mapToObj(i -> valueOf(array.get(i)))
```

### UnstableApiUsage
'com.google.common.primitives.ImmutableLongArray' is marked unstable with @Beta
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
    if (object instanceof ImmutableLongArray) {
      // TODO: use ImmutableLongArray.stream() when it's available in Android
      ImmutableLongArray array = (ImmutableLongArray) object;
      return IntStream.range(0, array.length())
          .mapToObj(i -> valueOf(array.get(i)))
```

### UnstableApiUsage
'length()' is declared in unstable class 'com.google.common.primitives.ImmutableLongArray' marked with @Beta
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
      // TODO: use ImmutableLongArray.stream() when it's available in Android
      ImmutableLongArray array = (ImmutableLongArray) object;
      return IntStream.range(0, array.length())
          .mapToObj(i -> valueOf(array.get(i)))
          .collect(valuesToValue());
```

### UnstableApiUsage
'get(int)' is declared in unstable class 'com.google.common.primitives.ImmutableLongArray' marked with @Beta
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
      ImmutableLongArray array = (ImmutableLongArray) object;
      return IntStream.range(0, array.length())
          .mapToObj(i -> valueOf(array.get(i)))
          .collect(valuesToValue());
    }
```

### UnstableApiUsage
'com.google.common.primitives.ImmutableDoubleArray' is marked unstable with @Beta
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
          .collect(valuesToValue());
    }
    if (object instanceof ImmutableDoubleArray) {
      // TODO: use ImmutableDoubleArray.stream() when it's available in Android
      ImmutableDoubleArray array = (ImmutableDoubleArray) object;
```

### UnstableApiUsage
'com.google.common.primitives.ImmutableDoubleArray' is marked unstable with @Beta
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
    if (object instanceof ImmutableDoubleArray) {
      // TODO: use ImmutableDoubleArray.stream() when it's available in Android
      ImmutableDoubleArray array = (ImmutableDoubleArray) object;
      return IntStream.range(0, array.length())
          .mapToObj(i -> valueOf(array.get(i)))
```

### UnstableApiUsage
'com.google.common.primitives.ImmutableDoubleArray' is marked unstable with @Beta
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
    if (object instanceof ImmutableDoubleArray) {
      // TODO: use ImmutableDoubleArray.stream() when it's available in Android
      ImmutableDoubleArray array = (ImmutableDoubleArray) object;
      return IntStream.range(0, array.length())
          .mapToObj(i -> valueOf(array.get(i)))
```

### UnstableApiUsage
'length()' is declared in unstable class 'com.google.common.primitives.ImmutableDoubleArray' marked with @Beta
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
      // TODO: use ImmutableDoubleArray.stream() when it's available in Android
      ImmutableDoubleArray array = (ImmutableDoubleArray) object;
      return IntStream.range(0, array.length())
          .mapToObj(i -> valueOf(array.get(i)))
        .collect(valuesToValue());
```

### UnstableApiUsage
'get(int)' is declared in unstable class 'com.google.common.primitives.ImmutableDoubleArray' marked with @Beta
in `mug-protobuf/src/main/java/com/google/mu/protobuf/util/Structor.java`
#### Snippet
```java
      ImmutableDoubleArray array = (ImmutableDoubleArray) object;
      return IntStream.range(0, array.length())
          .mapToObj(i -> valueOf(array.get(i)))
        .collect(valuesToValue());
    }
```

