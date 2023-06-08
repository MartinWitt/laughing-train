# truth 
 
# Bad smells
I found 279 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 53 | false |
| FinalMethodInFinalClass | 35 | false |
| OptionalUsedAsFieldOrParameterType | 26 | false |
| OptionalGetWithoutIsPresent | 23 | false |
| IgnoreResultOfCall | 21 | false |
| RedundantTypeArguments | 17 | false |
| OptionalAssignedToNull | 15 | false |
| JavadocReference | 12 | false |
| DataFlowIssue | 10 | false |
| RedundantCast | 10 | false |
| ArraysAsListWithZeroOrOneArgument | 10 | false |
| JavadocDeclaration | 9 | false |
| DeprecatedIsStillUsed | 5 | false |
| UnnecessarySemicolon | 4 | false |
| DuplicatedCode | 3 | false |
| EqualsWhichDoesntCheckParameterClass | 3 | false |
| UnnecessaryModifier | 2 | true |
| EmptyStatementBody | 2 | false |
| DuplicateBranchesInSwitch | 2 | false |
| TypeParameterExtendsObject | 2 | false |
| ConstantValue | 2 | false |
| OptionalIsPresent | 1 | false |
| UNCHECKED_WARNING | 1 | false |
| FinalPrivateMethod | 1 | false |
| Deprecation | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| TrivialStringConcatenation | 1 | false |
| FinalStaticMethod | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| WrongPackageStatement | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| UnnecessaryInitCause | 1 | false |
| UNUSED_IMPORT | 1 | false |
| PointlessNullCheck | 1 | false |
## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `extensions/java8/src/main/java/com/google/common/truth/OptionalSubject.java`
#### Snippet
```java
    if (actual == null) {
      failWithActual(simpleFact("expected empty optional"));
    } else if (actual.isPresent()) {
      failWithoutActual(
          simpleFact("expected to be empty"), fact("but was present with value", actual.get()));
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/MultimapWithProtoValuesFluentAssertion.java`
#### Snippet
```java
   */
  @CanIgnoreReturnValue
  public Ordered containsExactly(@Nullable Object k0, @Nullable M v0, @Nullable Object... rest);

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/MultimapWithProtoValuesFluentAssertion.java`
#### Snippet
```java
  /** Fails if the multimap is not empty. */
  @CanIgnoreReturnValue
  public Ordered containsExactly();

  /**
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
    boolean firstHasMultiple = hasMultiple(first);
    boolean secondHasMultiple = hasMultiple(second);
    if ((firstHasMultiple || secondHasMultiple) && anyContainsCommaOrNewline(first, second)) {
      return FACT_PER_ELEMENT;
    }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `containsExactly(Object...)`
in `core/src/main/java/com/google/common/truth/PrimitiveDoubleArraySubject.java`
#### Snippet
```java
    }

    /** As {@link #containsExactly(Object...)} but taking a primitive double array. */
    @CanIgnoreReturnValue
    public Ordered containsExactly(double[] expected) {
```

### JavadocReference
Cannot resolve symbol `containsNoneOf(Object, Object, Object...)`
in `core/src/main/java/com/google/common/truth/PrimitiveDoubleArraySubject.java`
#### Snippet
```java

    /**
     * As {@link #containsNoneOf(Object, Object, Object...)} but taking a primitive double array.
     */
    public void containsNoneOf(double[] excluded) {
```

### JavadocReference
Cannot resolve symbol `containsAnyOf(Object, Object, Object...)`
in `core/src/main/java/com/google/common/truth/PrimitiveDoubleArraySubject.java`
#### Snippet
```java
    }

    /** As {@link #containsAnyOf(Object, Object, Object...)} but taking a primitive double array. */
    public void containsAnyOf(double[] expected) {
      containsAnyIn(Doubles.asList(expected));
```

### JavadocReference
Cannot resolve symbol `containsAtLeast(Object, Object, Object...)`
in `core/src/main/java/com/google/common/truth/PrimitiveDoubleArraySubject.java`
#### Snippet
```java

    /**
     * As {@link #containsAtLeast(Object, Object, Object...)} but taking a primitive double array.
     */
    @CanIgnoreReturnValue
```

### JavadocReference
Cannot resolve symbol `partialScope`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldNumberTree.java`
#### Snippet
```java
 * <p>Sub messages are represented by child {@link FieldNumberTree} objects.
 *
 * @see FieldScopeImpl#partialScope
 */
final class FieldNumberTree {
```

### JavadocReference
Cannot resolve symbol `ignoreRepeatedFieldOrder()`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
   * A list of top-level repeated field comparison results grouped by field number.
   *
   * <p>This is only populated if {@link FluentEqualityConfig#ignoreRepeatedFieldOrder()} is set.
   * Otherwise, repeated fields are compared strictly in index order, as singular fields.
   */
```

### JavadocReference
Cannot resolve symbol `containsNoneOf(Object, Object, Object...)`
in `core/src/main/java/com/google/common/truth/PrimitiveFloatArraySubject.java`
#### Snippet
```java
    }

    /** As {@link #containsNoneOf(Object, Object, Object...)} but taking a primitive float array. */
    public void containsNoneOf(float[] excluded) {
      containsNoneIn(Floats.asList(excluded));
```

### JavadocReference
Cannot resolve symbol `containsAnyOf(Object, Object, Object...)`
in `core/src/main/java/com/google/common/truth/PrimitiveFloatArraySubject.java`
#### Snippet
```java
    }

    /** As {@link #containsAnyOf(Object, Object, Object...)} but taking a primitive float array. */
    public void containsAnyOf(float[] expected) {
      containsAnyIn(Floats.asList(expected));
```

### JavadocReference
Cannot resolve symbol `containsExactly(Object...)`
in `core/src/main/java/com/google/common/truth/PrimitiveFloatArraySubject.java`
#### Snippet
```java
    }

    /** As {@link #containsExactly(Object...)} but taking a primitive float array. */
    @CanIgnoreReturnValue
    public Ordered containsExactly(float[] expected) {
```

### JavadocReference
Cannot resolve symbol `containsAtLeast(Object, Object, Object...)`
in `core/src/main/java/com/google/common/truth/PrimitiveFloatArraySubject.java`
#### Snippet
```java

    /**
     * As {@link #containsAtLeast(Object, Object, Object...)} but taking a primitive float array.
     */
    @CanIgnoreReturnValue
```

### JavadocReference
Cannot resolve symbol `isEqualTo(Message)`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoSubject.java`
#### Snippet
```java
   *
   * <p>The "expected proto(s)" are those passed to the void method at the end of the {@code
   * ProtoFluentAssertion} call-chain: For example, {@link #isEqualTo(Message)}, or {@link
   * #isNotEqualTo(Message)}.
   *
```

### JavadocReference
Cannot resolve symbol `isNotEqualTo(Message)`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoSubject.java`
#### Snippet
```java
   * <p>The "expected proto(s)" are those passed to the void method at the end of the {@code
   * ProtoFluentAssertion} call-chain: For example, {@link #isEqualTo(Message)}, or {@link
   * #isNotEqualTo(Message)}.
   *
   * <p>Fields not set in the expected proto(s) are ignored. In particular, proto3 fields which have
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getClass` may produce `NullPointerException`
in `extensions/liteproto/src/main/java/com/google/common/truth/extensions/proto/LiteProtoSubject.java`
#### Snippet
```java
          String.format(
              "# %s@%s",
              messageLite.getClass().getName(), Integer.toHexString(messageLite.hashCode()));
      if (trimmedSubjectString.startsWith(objectToString)) {
        subjectString = trimmedSubjectString.replaceFirst(Pattern.quote(objectToString), "").trim();
```

### DataFlowIssue
Method invocation `getSerializedSize` may produce `NullPointerException`
in `extensions/liteproto/src/main/java/com/google/common/truth/extensions/proto/LiteProtoSubject.java`
#### Snippet
```java
   */
  public IntegerSubject serializedSize() {
    return check("getSerializedSize()").that(actual.getSerializedSize());
  }

```

### DataFlowIssue
Method invocation `isInitialized` may produce `NullPointerException`
in `extensions/liteproto/src/main/java/com/google/common/truth/extensions/proto/LiteProtoSubject.java`
#### Snippet
```java
   */
  public void hasAllRequiredFields() {
    if (!actual.isInitialized()) {
      // MessageLite doesn't support reflection so this is the best we can do.
      failWithoutActual(
```

### DataFlowIssue
Method invocation `getDefaultInstanceForType` may produce `NullPointerException`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
  // Requires at least one parameter is non-null.
  private static Message orDefaultForType(@Nullable Message input, @Nullable Message other) {
    return (input != null) ? input : other.getDefaultInstanceForType();
  }

```

### DataFlowIssue
Unboxing of `actualFieldIndex` may produce `NullPointerException`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
            .setProtoPrinter(protoPrinter);
    if (actual != null) {
      pairResultBuilder.setActual(actual).setActualFieldIndex(actualFieldIndex);
    }
    if (expected != null) {
```

### DataFlowIssue
Unboxing of `expectedFieldIndex` may produce `NullPointerException`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    }
    if (expected != null) {
      pairResultBuilder.setExpected(expected).setExpectedFieldIndex(expectedFieldIndex);
    }
    if (comparison.breakdown().isPresent()) {
```

### DataFlowIssue
Casting `(Object)value` to `NativeNumber` will produce `ClassCastException` for any non-null value
in `core/src/main/java/com/google/common/truth/super/com/google/common/truth/Platform.java`
#### Snippet
```java
  private static String toLocaleString(double value) {
    // Recieve a double as a parameter so that "(Object) value" does not box it.
    return ((NativeNumber) (Object) value).toLocaleString("en-US", JavaLikeOptions.INSTANCE);
  }

```

### DataFlowIssue
Method invocation `getKey` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MultimapSubject.java`
#### Snippet
```java
    return Correspondence.from(
        (Map.Entry<K, A> actual, Map.Entry<K, E> expected) ->
            Objects.equal(actual.getKey(), expected.getKey())
                && valueCorrespondence.compare(actual.getValue(), expected.getValue()),
        lenientFormat(
```

### DataFlowIssue
Method invocation `getKey` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MultimapSubject.java`
#### Snippet
```java
    return Correspondence.from(
        (Map.Entry<K, A> actual, Map.Entry<K, E> expected) ->
            Objects.equal(actual.getKey(), expected.getKey())
                && valueCorrespondence.compare(actual.getValue(), expected.getValue()),
        lenientFormat(
```

### DataFlowIssue
Argument `stream` might be null
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
      stream = loader.getResourceAsStream(className.replace('.', '/') + ".class");
      // TODO(cpovirk): Disable inference if the bytecode version is newer than we've tested on?
      new ClassReader(stream).accept(visitor, /* parsingOptions= */ 0);
      ImmutableSet<StackEntry> actualsAtLine = visitor.actualValueAtLine.build().get(lineNumber);
      /*
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/com/google/common/truth/FailureMetadata.java`
#### Snippet
```java
  enum OldAndNewValuesAreSimilar {
    SIMILAR,
    DIFFERENT;
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/com/google/common/truth/Expect.java`
#### Snippet
```java
    BEFORE,
    DURING,
    AFTER;
  }
}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/SubScopeId.java`
#### Snippet
```java
  enum Kind {
    FIELD_DESCRIPTOR,
    UNKNOWN_FIELD_DESCRIPTOR;
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
  enum ElementFactGrouping {
    ALL_IN_ONE_FACT,
    FACT_PER_ELEMENT;
  }

```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`for` statement has empty body
in `core/src/main/java/com/google/common/truth/StackTraceCleaner.java`
#### Snippet
```java

    int stackIndex = stackFrames.length - 1;
    for (; stackIndex >= 0 && !isTruthEntrance(stackFrames[stackIndex]); stackIndex--) {
      // Find first frame that enters Truth's world, and remove all above.
    }
```

### EmptyStatementBody
`for` statement has empty body
in `core/src/main/java/com/google/common/truth/StackTraceCleaner.java`
#### Snippet
```java

    int endIndex = 0;
    for (;
        endIndex < stackFrames.length && !isJUnitIntrastructure(stackFrames[endIndex]);
        endIndex++) {
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'isEquivalentAccordingToCompareTo' is still used
in `core/src/main/java/com/google/common/truth/IntegerSubject.java`
#### Snippet
```java
  @Override
  @Deprecated
  public final void isEquivalentAccordingToCompareTo(@Nullable Integer other) {
    super.isEquivalentAccordingToCompareTo(other);
  }
```

### DeprecatedIsStillUsed
Deprecated member 'isNotEqualTo' is still used
in `extensions/java8/src/main/java/com/google/common/truth/StreamSubject.java`
#### Snippet
```java
          + " equality semantics")
  @Deprecated
  public void isNotEqualTo(@Nullable Object unexpected) {
    throw new UnsupportedOperationException(
        "StreamSubject.isNotEqualTo() is not supported because Streams do not have well-defined"
```

### DeprecatedIsStillUsed
Deprecated member 'isNotEqualTo' is still used
in `extensions/liteproto/src/main/java/com/google/common/truth/extensions/proto/LiteProtoSubject.java`
#### Snippet
```java
  // TODO(cpovirk): Consider @DoNotCall or other static analysis. (See isEqualTo(Builder).)
  @Deprecated
  public void isNotEqualTo(MessageLite.@Nullable Builder builder) {
    isNotEqualTo((Object) builder);
  }
```

### DeprecatedIsStillUsed
Deprecated member 'isNotIn' is still used
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
  @Override
  @Deprecated
  public void isNotIn(@Nullable Iterable<?> iterable) {
    checkNotNull(iterable);
    if (Iterables.contains(iterable, actual)) {
```

### DeprecatedIsStillUsed
Deprecated member 'isNoneOf' is still used
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
  @Override
  @Deprecated
  public void isNoneOf(
      @Nullable Object first, @Nullable Object second, @Nullable Object @Nullable ... rest) {
    super.isNoneOf(first, second, rest);
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/TableSubject.java`
#### Snippet
```java

  /** Fails if the table does not have the given size. */
  public final void hasSize(int expectedSize) {
    checkArgument(expectedSize >= 0, "expectedSize(%s) must be >= 0", expectedSize);
    check("size()").that(checkNotNull(actual).size()).isEqualTo(expectedSize);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/MultisetSubject.java`
#### Snippet
```java

  /** Fails if the element does not have the given count. */
  public final void hasCount(@Nullable Object element, int expectedCount) {
    checkArgument(expectedCount >= 0, "expectedCount(%s) must be >= 0", expectedCount);
    int actualCount = checkNotNull(actual).count(element);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeLogic.java`
#### Snippet
```java

        @Override
        final boolean isAll() {
          return true;
        }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeLogic.java`
#### Snippet
```java

        @Override
        final FieldScopeResult policyFor(Descriptor rootDescriptor, SubScopeId subScopeId) {
          return FieldScopeResult.INCLUDED_RECURSIVELY;
        }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeLogic.java`
#### Snippet
```java

        @Override
        final FieldScopeResult policyFor(Descriptor rootDescriptor, SubScopeId subScopeId) {
          return FieldScopeResult.EXCLUDED_RECURSIVELY;
        }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/TruthJUnit.java`
#### Snippet
```java
   * throw {@link AssumptionViolatedException}.
   */
  public static final StandardSubjectBuilder assume() {
    return ASSUME;
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/DoubleSubject.java`
#### Snippet
```java

  /** Asserts that the subject is {@link Double#POSITIVE_INFINITY}. */
  public final void isPositiveInfinity() {
    isEqualTo(Double.POSITIVE_INFINITY);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/DoubleSubject.java`
#### Snippet
```java
   * #isAtMost} .
   */
  public final void isLessThan(int other) {
    isLessThan((double) other);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/DoubleSubject.java`
#### Snippet
```java
   * {@link Double#POSITIVE_INFINITY} or {@link Double#NEGATIVE_INFINITY}).
   */
  public final void isNotNaN() {
    if (actual == null) {
      failWithActual(simpleFact("expected a double other than NaN"));
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/DoubleSubject.java`
#### Snippet
```java
   * {@code -0.0} or {@code null}).
   */
  public final void isNonZero() {
    if (actual == null) {
      failWithActual(simpleFact("expected a double other than zero"));
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/DoubleSubject.java`
#### Snippet
```java
  @Override
  @Deprecated
  public final void isEquivalentAccordingToCompareTo(@Nullable Double other) {
    super.isEquivalentAccordingToCompareTo(other);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/DoubleSubject.java`
#### Snippet
```java

  /** Asserts that the subject is zero (i.e. it is either {@code 0.0} or {@code -0.0}). */
  public final void isZero() {
    if (actual == null || actual.doubleValue() != 0.0) {
      failWithActual(simpleFact("expected zero"));
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/DoubleSubject.java`
#### Snippet
```java

  /** Asserts that the subject is {@link Double#NaN}. */
  public final void isNaN() {
    isEqualTo(NaN);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/DoubleSubject.java`
#### Snippet
```java

  /** Asserts that the subject is {@link Double#NEGATIVE_INFINITY}. */
  public final void isNegativeInfinity() {
    isEqualTo(Double.NEGATIVE_INFINITY);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/DoubleSubject.java`
#### Snippet
```java
   * #isLessThan}.
   */
  public final void isAtMost(int other) {
    isAtMost((double) other);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/DoubleSubject.java`
#### Snippet
```java
   */
  @Override
  public final void isNotEqualTo(@Nullable Object other) {
    super.isNotEqualTo(other);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/DoubleSubject.java`
#### Snippet
```java
   * Double#NEGATIVE_INFINITY}, or {@link Double#NaN}.
   */
  public final void isFinite() {
    if (actual == null || actual.isNaN() || actual.isInfinite()) {
      failWithActual(simpleFact("expected to be finite"));
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/DoubleSubject.java`
#### Snippet
```java
   * #isGreaterThan}.
   */
  public final void isAtLeast(int other) {
    isAtLeast((double) other);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/DoubleSubject.java`
#### Snippet
```java
   * #isAtLeast}.
   */
  public final void isGreaterThan(int other) {
    isGreaterThan((double) other);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/DoubleSubject.java`
#### Snippet
```java
   */
  @Override
  public final void isEqualTo(@Nullable Object other) {
    super.isEqualTo(other);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/FloatSubject.java`
#### Snippet
```java
   * #isLessThan}.
   */
  public final void isAtMost(int other) {
    asDouble.isAtMost(other);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/FloatSubject.java`
#### Snippet
```java
   * #isAtLeast}.
   */
  public final void isGreaterThan(int other) {
    asDouble.isGreaterThan(other);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/FloatSubject.java`
#### Snippet
```java

  /** Asserts that the subject is {@link Float#NEGATIVE_INFINITY}. */
  public final void isNegativeInfinity() {
    isEqualTo(Float.NEGATIVE_INFINITY);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/FloatSubject.java`
#### Snippet
```java
   * #isAtMost} .
   */
  public final void isLessThan(int other) {
    asDouble.isLessThan(other);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/FloatSubject.java`
#### Snippet
```java

  /** Asserts that the subject is {@link Float#POSITIVE_INFINITY}. */
  public final void isPositiveInfinity() {
    isEqualTo(Float.POSITIVE_INFINITY);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/FloatSubject.java`
#### Snippet
```java

  /** Asserts that the subject is zero (i.e. it is either {@code 0.0f} or {@code -0.0f}). */
  public final void isZero() {
    if (actual == null || actual.floatValue() != 0.0f) {
      failWithActual(simpleFact("expected zero"));
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/FloatSubject.java`
#### Snippet
```java
   */
  @Override
  public final void isEqualTo(@Nullable Object other) {
    super.isEqualTo(other);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/FloatSubject.java`
#### Snippet
```java
   * #isGreaterThan}.
   */
  public final void isAtLeast(int other) {
    asDouble.isAtLeast(other);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/FloatSubject.java`
#### Snippet
```java
   * {@code -0.0f} or {@code null}).
   */
  public final void isNonZero() {
    if (actual == null) {
      failWithActual(simpleFact("expected a float other than zero"));
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/FloatSubject.java`
#### Snippet
```java
  @Override
  @Deprecated
  public final void isEquivalentAccordingToCompareTo(@Nullable Float other) {
    super.isEquivalentAccordingToCompareTo(other);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/FloatSubject.java`
#### Snippet
```java
   * Float#NEGATIVE_INFINITY}, or {@link Float#NaN}.
   */
  public final void isFinite() {
    if (actual == null || actual.isNaN() || actual.isInfinite()) {
      failWithActual(simpleFact("expected to be finite"));
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/FloatSubject.java`
#### Snippet
```java

  /** Asserts that the subject is {@link Float#NaN}. */
  public final void isNaN() {
    isEqualTo(NaN);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/FloatSubject.java`
#### Snippet
```java
   */
  @Override
  public final void isNotEqualTo(@Nullable Object other) {
    super.isNotEqualTo(other);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/common/truth/FloatSubject.java`
#### Snippet
```java
   * Float#POSITIVE_INFINITY} or {@link Float#NEGATIVE_INFINITY}).
   */
  public final void isNotNaN() {
    if (actual == null) {
      failWithActual(simpleFact("expected a float other than NaN"));
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/IterableOfProtosSubject.java`
#### Snippet
```java
    }

    private final IterableOfProtosUsingCorrespondence<M> usingCorrespondence() {
      return subject.usingCorrespondence();
    }
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
          break;
        case Opcodes.F_FULL:
          previousFrame =
              FrameInfo.create(
                  convertTypesInStackMapFrame(nLocal, local),
                  convertTypesInStackMapFrame(nStack, stack));
          break;
        default:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
        case Opcodes.FCMPL:
        case Opcodes.FCMPG:
          pop(2);
          push(InferredType.INT);
          break;

```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/IterableOfProtosSubject.java`
#### Snippet
```java
    }

    private final IterableOfProtosUsingCorrespondence<M> usingCorrespondence() {
      return subject.usingCorrespondence();
    }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
      for (int i = 0; i < size; ++i) {
        InferredType type = convertTypeInStackMapFrame(array[i]);
        builder.add(opaque(type));
        if (type.isCategory2()) {
          builder.add(opaque(InferredType.TOP));
        }
      }
      return builder.build();
```

### DuplicatedCode
Duplicated code
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/MapWithProtoValuesSubject.java`
#### Snippet
```java
      List<M> expectedValues = new ArrayList<>();
      expectedValues.add(v0);
      for (int i = 1; i < rest.length; i += 2) {
        expectedValues.add((M) rest[i]);
      }
      return subject.usingCorrespondence(expectedValues).containsExactly(k0, v0, rest);
```

### DuplicatedCode
Duplicated code
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    SingularField.Builder singularFieldBuilder =
        SingularField.newBuilder()
            .setSubScopeId(SubScopeId.of(fieldDescriptor))
            .setFieldName(fieldName)
            .setResult(result.build())
            .setProtoPrinter(protoPrinter);
    if (actual != null) {
      singularFieldBuilder.setActual(actual);
    }
    if (expected != null) {
      singularFieldBuilder.setExpected(expected);
    }
```

## RuleId[id=Deprecation]
### Deprecation
'printFieldValue(com.google.protobuf.Descriptors.FieldDescriptor, java.lang.Object, java.lang.Appendable)' is deprecated
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    StringBuilder sb = new StringBuilder();
    try {
      TextFormat.printFieldValue(keyFieldDescriptor, key, sb);
    } catch (IOException impossible) {
      throw new AssertionError(impossible);
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder header` can be replaced with 'String'
in `core/src/main/java/com/google/common/truth/DiffUtils.java`
#### Snippet
```java
      int blockSizeRevised = lineNumRevised - startLineRevised - (next - end - 1);

      StringBuilder header = new StringBuilder();
      header
          .append("@@ -")
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `core/src/main/java/com/google/common/truth/super/com/google/common/truth/Platform.java`
#### Snippet
```java
    @Override
    public final String toString() {
      return "" + getLocalizedMessage();
    }
  }
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `core/src/main/java/com/google/common/truth/TruthJUnit.java`
#### Snippet
```java
   * throw {@link AssumptionViolatedException}.
   */
  public static final StandardSubjectBuilder assume() {
    return ASSUME;
  }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeImpl.java`
#### Snippet
```java
      return create(
          FieldScopeLogic.none(),
          Functions.constant(String.format("FieldScopes.fromSetFields(%s)", messages.toString())));
    }

```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeLogicMap.java`
#### Snippet
```java

  private static final FieldScopeLogicMap<Object> EMPTY_INSTANCE =
      new FieldScopeLogicMap<>(ImmutableList.<Entry<Object>>of());

  // Key -> value mappings for this map.  Earlier entries override later ones.
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java
      return new DuplicateGroupedAndTyped(
          countDuplicatesToMultiset(itemsIterable),
          /* homogeneousTypeToDisplay= */ Optional.<String>absent());
    }
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/common/truth/StackTraceCleaner.java`
#### Snippet
```java
   */
  static void cleanStackTrace(Throwable throwable) {
    new StackTraceCleaner(throwable).clean(Sets.<Throwable>newIdentityHashSet());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/common/truth/FailureMetadata.java`
#### Snippet
```java
  static FailureMetadata forFailureStrategy(FailureStrategy failureStrategy) {
    return new FailureMetadata(
        failureStrategy, ImmutableList.<LazyMessage>of(), ImmutableList.<Step>of());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/common/truth/FailureMetadata.java`
#### Snippet
```java
  static FailureMetadata forFailureStrategy(FailureStrategy failureStrategy) {
    return new FailureMetadata(
        failureStrategy, ImmutableList.<LazyMessage>of(), ImmutableList.<Step>of());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/common/truth/FailureMetadata.java`
#### Snippet
```java
                checkNotNull(checkNotNull(rootSubject).subject)
                    .actualCustomStringRepresentationForPackageMembersToCall()))
        : ImmutableList.<Fact>of();
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/common/truth/FailureMetadata.java`
#### Snippet
```java
    return descriptionIsInteresting
        ? ImmutableList.of(fact("value of", description))
        : ImmutableList.<Fact>of();
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/common/truth/StandardSubjectBuilder.java`
#### Snippet
```java
   */
  public final void fail() {
    metadata().fail(ImmutableList.<Fact>of());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/MapWithProtoValuesSubject.java`
#### Snippet
```java
        config
            .withExpectedMessages(expectedValues)
            .<M>toCorrespondence(FieldScopeUtil.getSingleDescriptor(actual.values())));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/MultimapWithProtoValuesSubject.java`
#### Snippet
```java
        config
            .withExpectedMessages(expectedValues)
            .<M>toCorrespondence(FieldScopeUtil.getSingleDescriptor(actual.values())));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java

    ImmutableList<Fact> factsOrEmpty() {
      return firstNonNull(facts, ImmutableList.<Fact>of());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
    private static final ComparisonResult EQUAL = new ComparisonResult(null);
    private static final ComparisonResult DIFFERENT_NO_DESCRIPTION =
        new ComparisonResult(ImmutableList.<Fact>of());

    private final @Nullable ImmutableList<Fact> facts;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/IterableOfProtosSubject.java`
#### Snippet
```java
                  .config
                  .withExpectedMessages(messages)
                  .<M>toCorrespondence(FieldScopeUtil.getSingleDescriptor(subject.actual)));
      if (keyFunction != null) {
        usingCorrespondence = usingCorrespondence.displayingDiffsPairedBy(keyFunction);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
          // This frame type indicates that the frame has exactly the same local variables as the
          // previous frame and that the operand stack is empty.
          previousFrame = FrameInfo.create(previousFrame.locals(), ImmutableList.<StackEntry>of());
          break;
        case Opcodes.F_SAME1:
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
              FrameInfo.create(
                  appendArrayToList(previousFrame.locals(), nLocal, local),
                  ImmutableList.<StackEntry>of());
          break;
        case Opcodes.F_CHOP:
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
              FrameInfo.create(
                  removeBackFromList(previousFrame.locals(), nLocal),
                  ImmutableList.<StackEntry>of());
          break;
        case Opcodes.F_FULL:
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
      previousFrame =
          FrameInfo.create(
              ImmutableList.copyOf(localVariableSlots), ImmutableList.<StackEntry>of());
      this.methodSignature = owner + "." + name + methodDescriptor;
      this.actualValueAtLine = actualValueAtLine;
```

## RuleId[id=WrongPackageStatement]
### WrongPackageStatement
Package name 'com.google.common.truth' does not correspond to the file path 'com.google.common.truth.super.com.google.common.truth'
in `core/src/main/java/com/google/common/truth/super/com/google/common/truth/Platform.java`
#### Snippet
```java
 * limitations under the License.
 */
package com.google.common.truth;

import static java.lang.Double.parseDouble;
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/PrimitiveShortArraySubject.java`
#### Snippet
```java
 */
public final class PrimitiveShortArraySubject extends AbstractArraySubject {
  private final short @Nullable [] actual;

  PrimitiveShortArraySubject(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/Truth.java`
#### Snippet
```java
  static final class SimpleAssertionError extends AssertionError {
    /** Separate cause field, in case initCause() fails. */
    private final @Nullable Throwable cause;

    private SimpleAssertionError(String message, @Nullable Throwable cause) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/PrimitiveDoubleArraySubject.java`
#### Snippet
```java
 */
public final class PrimitiveDoubleArraySubject extends AbstractArraySubject {
  private final double @Nullable [] actual;

  PrimitiveDoubleArraySubject(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/AssertionErrorWithFacts.java`
#### Snippet
```java

  /** Separate cause field, in case initCause() fails. */
  private final @Nullable Throwable cause;

  AssertionErrorWithFacts(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/TableSubject.java`
#### Snippet
```java
 */
public final class TableSubject extends Subject {
  private final @Nullable Table<?, ?, ?> actual;

  TableSubject(FailureMetadata metadata, @Nullable Table<?, ?, ?> table) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `extensions/re2j/src/main/java/com/google/common/truth/extensions/re2j/Re2jSubjects.java`
#### Snippet
```java
        };

    private final @Nullable String actual;

    private Re2jStringSubject(FailureMetadata failureMetadata, @Nullable String subject) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/BigDecimalSubject.java`
#### Snippet
```java
 */
public final class BigDecimalSubject extends ComparableSubject<BigDecimal> {
  private final @Nullable BigDecimal actual;

  BigDecimalSubject(FailureMetadata metadata, @Nullable BigDecimal actual) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/Platform.java`
#### Snippet
```java

    /** Separate cause field, in case initCause() fails. */
    private final @Nullable Throwable cause;

    PlatformComparisonFailure(
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java
        new Equivalence<Object>() {
          @Override
          protected boolean doEquivalent(Object a, Object b) {
            return Objects.equal(a, b);
          }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java
        new Equivalence<Object>() {
          @Override
          protected boolean doEquivalent(Object a, Object b) {
            return Objects.equal(a, b);
          }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java

          @Override
          protected int doHash(Object o) {
            return 0; // slow but hopefully not much worse than what we get with a flat list
          }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/StackTraceCleaner.java`
#### Snippet
```java
  private final List<StackTraceElementWrapper> cleanedStackTrace = new ArrayList<>();
  private @Nullable StackTraceElementWrapper lastStackFrameElementWrapper = null;
  private @Nullable StackFrameType currentStreakType = null;
  private int currentStreakLength = 0;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/StackTraceCleaner.java`
#### Snippet
```java
  private final Throwable throwable;
  private final List<StackTraceElementWrapper> cleanedStackTrace = new ArrayList<>();
  private @Nullable StackTraceElementWrapper lastStackFrameElementWrapper = null;
  private @Nullable StackFrameType currentStreakType = null;
  private int currentStreakLength = 0;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/MultisetSubject.java`
#### Snippet
```java
public final class MultisetSubject extends IterableSubject {

  private final @Nullable Multiset<?> actual;

  MultisetSubject(FailureMetadata metadata, @Nullable Multiset<?> multiset) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/AbstractArraySubject.java`
#### Snippet
```java
 */
abstract class AbstractArraySubject extends Subject {
  private final @Nullable Object actual;

  AbstractArraySubject(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/ThrowableSubject.java`
#### Snippet
```java
 */
public class ThrowableSubject extends Subject {
  private final @Nullable Throwable actual;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/PrimitiveByteArraySubject.java`
#### Snippet
```java
 */
public final class PrimitiveByteArraySubject extends AbstractArraySubject {
  private final byte @Nullable [] actual;

  PrimitiveByteArraySubject(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/FailureMetadata.java`
#### Snippet
```java

    // Present only when descriptionUpdate is.
    final @Nullable OldAndNewValuesAreSimilar valuesAreSimilar;

    private Step(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/FailureMetadata.java`
#### Snippet
```java
     * but it might try to look at facts initialized by a subclass, which aren't ready yet.
     */
    final @Nullable Subject subject;

    final @Nullable Function<String, String> descriptionUpdate;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/FailureMetadata.java`
#### Snippet
```java
    final @Nullable Subject subject;

    final @Nullable Function<String, String> descriptionUpdate;

    // Present only when descriptionUpdate is.
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/ComparableSubject.java`
#### Snippet
```java
   * {@link Subject#check(String, Object...) check(...)}{@code .that(actual)}.
   */
  private final @Nullable T actual;

  protected ComparableSubject(FailureMetadata metadata, @Nullable T actual) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/StringSubject.java`
#### Snippet
```java
 */
public class StringSubject extends ComparableSubject<String> {
  private final @Nullable String actual;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/TruthFailureSubject.java`
#### Snippet
```java
      };

  private final @Nullable AssertionError actual;

  TruthFailureSubject(
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FluentEqualityConfig.java`
#### Snippet
```java
              new CacheLoader<Descriptor, ProtoTruthMessageDifferencer>() {
                @Override
                public ProtoTruthMessageDifferencer load(Descriptor descriptor) {
                  return ProtoTruthMessageDifferencer.create(FluentEqualityConfig.this, descriptor);
                }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FluentEqualityConfig.java`
#### Snippet
```java
              new CacheLoader<Descriptor, ProtoTruthMessageDifferencer>() {
                @Override
                public ProtoTruthMessageDifferencer load(Descriptor descriptor) {
                  return ProtoTruthMessageDifferencer.create(FluentEqualityConfig.this, descriptor);
                }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/PrimitiveBooleanArraySubject.java`
#### Snippet
```java
 */
public final class PrimitiveBooleanArraySubject extends AbstractArraySubject {
  private final boolean @Nullable [] actual;

  PrimitiveBooleanArraySubject(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java

    private final String argumentLabel;
    private @Nullable StoredException firstCompareException = null;
    private @Nullable StoredException firstPairingException = null;
    private @Nullable StoredException firstFormatDiffException = null;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java
    private final String argumentLabel;
    private @Nullable StoredException firstCompareException = null;
    private @Nullable StoredException firstPairingException = null;
    private @Nullable StoredException firstFormatDiffException = null;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java
    private @Nullable StoredException firstCompareException = null;
    private @Nullable StoredException firstPairingException = null;
    private @Nullable StoredException firstFormatDiffException = null;

    static ExceptionStore forIterable() {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/Fact.java`
#### Snippet
```java

  final String key;
  final @Nullable String value;

  private Fact(String key, @Nullable String value) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/BooleanSubject.java`
#### Snippet
```java
 */
public final class BooleanSubject extends Subject {
  private final @Nullable Boolean actual;

  BooleanSubject(FailureMetadata metadata, @Nullable Boolean actual) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/DoubleSubject.java`
#### Snippet
```java
  private static final long NEG_ZERO_BITS = doubleToLongBits(-0.0);

  private final @Nullable Double actual;

  DoubleSubject(FailureMetadata metadata, @Nullable Double actual) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/ExpectFailure.java`
#### Snippet
```java
  private boolean inRuleContext = false;
  private boolean failureExpected = false;
  private @Nullable AssertionError failure = null;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/PrimitiveIntArraySubject.java`
#### Snippet
```java
 */
public final class PrimitiveIntArraySubject extends AbstractArraySubject {
  private final int @Nullable [] actual;

  PrimitiveIntArraySubject(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/GuavaOptionalSubject.java`
#### Snippet
```java
 */
public final class GuavaOptionalSubject extends Subject {
  private final @Nullable Optional<?> actual;

  GuavaOptionalSubject(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
        new ComparisonResult(ImmutableList.<Fact>of());

    private final @Nullable ImmutableList<Fact> facts;

    private ComparisonResult(@Nullable ImmutableList<Fact> facts) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java

  private final @Nullable FailureMetadata metadata;
  private final @Nullable Object actual;
  private final @Nullable String typeDescriptionOverride;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
  private final @Nullable FailureMetadata metadata;
  private final @Nullable Object actual;
  private final @Nullable String typeDescriptionOverride;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
  }

  private final @Nullable FailureMetadata metadata;
  private final @Nullable Object actual;
  private final @Nullable String typeDescriptionOverride;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/ObjectArraySubject.java`
#### Snippet
```java
 */
public final class ObjectArraySubject<T extends @Nullable Object> extends AbstractArraySubject {
  private final @Nullable T @Nullable [] actual;

  ObjectArraySubject(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/PrimitiveCharArraySubject.java`
#### Snippet
```java
 */
public final class PrimitiveCharArraySubject extends AbstractArraySubject {
  private final char @Nullable [] actual;

  PrimitiveCharArraySubject(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/ClassSubject.java`
#### Snippet
```java
@J2ktIncompatible
public final class ClassSubject extends Subject {
  private final @Nullable Class<?> actual;

  ClassSubject(FailureMetadata metadata, @Nullable Class<?> o) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `extensions/java8/src/main/java/com/google/common/truth/OptionalSubject.java`
#### Snippet
```java
 */
public final class OptionalSubject extends Subject {
  private final @Nullable Optional<?> actual;

  OptionalSubject(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/PrimitiveLongArraySubject.java`
#### Snippet
```java
 */
public final class PrimitiveLongArraySubject extends AbstractArraySubject {
  private final long @Nullable [] actual;

  PrimitiveLongArraySubject(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/MapSubject.java`
#### Snippet
```java
  private static class ValueDifference<A extends @Nullable Object, E extends @Nullable Object> {
    private final A actual;
    private final E expected;

    ValueDifference(A actual, E expected) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/MapSubject.java`
#### Snippet
```java
 */
public class MapSubject extends Subject {
  private final @Nullable Map<?, ?> actual;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/MapSubject.java`
#### Snippet
```java
    private final Map<?, ?> expectedMap;
    private final boolean allowUnexpected;
    private final @Nullable Correspondence<?, ?> correspondence;

    MapInOrder(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/MapSubject.java`
#### Snippet
```java

  private static class ValueDifference<A extends @Nullable Object, E extends @Nullable Object> {
    private final A actual;
    private final E expected;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/FloatSubject.java`
#### Snippet
```java
  private static final int NEG_ZERO_BITS = floatToIntBits(-0.0f);

  private final @Nullable Float actual;
  private final DoubleSubject asDouble;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/PrimitiveFloatArraySubject.java`
#### Snippet
```java
 */
public final class PrimitiveFloatArraySubject extends AbstractArraySubject {
  private final float @Nullable [] actual;

  PrimitiveFloatArraySubject(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/MultimapSubject.java`
#### Snippet
```java
  private static final Ordered ALREADY_FAILED = () -> {};

  private final @Nullable Multimap<?, ?> actual;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
public class IterableSubject extends Subject {

  private final @Nullable Iterable<?> actual;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/IterableOfProtosSubject.java`
#### Snippet
```java
      implements IterableOfProtosUsingCorrespondence<M> {
    private final IterableOfProtosSubject<M> subject;
    private final @Nullable Function<? super M, ? extends Object> keyFunction;

    UsingCorrespondence(
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/com/google/common/truth/DiffUtils.java`
#### Snippet
```java
/**
 * A custom implementation of the diff algorithm based on the solution described at
 * https://en.wikipedia.org/wiki/Longest_common_subsequence_problem
 *
 * @author Yun Peng (pcloudy@google.com)
```

## RuleId[id=UnnecessaryInitCause]
### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `core/src/main/java/com/google/common/truth/Platform.java`
#### Snippet
```java
  private static LinkageError newLinkageError(Throwable cause) {
    LinkageError error = new LinkageError(cause.toString());
    error.initCause(cause);
    return error;
  }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Builder.setUseTypeRegistry()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FluentEqualityConfig.java`
#### Snippet
```java
    final Builder setUnpackingAnyUsing(
        TypeRegistry typeRegistry, ExtensionRegistry extensionRegistry) {
      setUseTypeRegistry(typeRegistry);
      setUseExtensionRegistry(extensionRegistry);
      return this;
```

### IgnoreResultOfCall
Result of `Builder.setUseExtensionRegistry()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FluentEqualityConfig.java`
#### Snippet
```java
        TypeRegistry typeRegistry, ExtensionRegistry extensionRegistry) {
      setUseTypeRegistry(typeRegistry);
      setUseExtensionRegistry(extensionRegistry);
      return this;
    }
```

### IgnoreResultOfCall
Result of `Builder.setCompareFieldsScope()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FluentEqualityConfig.java`
#### Snippet
```java
    Builder builder = toBuilder().setHasExpectedMessages(true);
    if (compareExpectedFieldsOnly()) {
      builder.setCompareFieldsScope(
          FieldScopeLogic.and(compareFieldsScope(), FieldScopes.fromSetFields(messages).logic()));
    }
```

### IgnoreResultOfCall
Result of `Builder.setUnknownFields()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
      UnknownFieldSetDiff diff =
          diffUnknowns(actual.getUnknownFields(), expected.getUnknownFields(), config);
      builder.setUnknownFields(diff);
    }

```

### IgnoreResultOfCall
Result of `Builder.setUnknownFields()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
      UnknownFieldSetDiff diff =
          diffUnknowns(actual.getUnknownFields(), expected.getUnknownFields(), config);
      builder.setUnknownFields(diff);
    }

```

### IgnoreResultOfCall
Result of `Builder.setActualFieldIndex()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
            .setProtoPrinter(protoPrinter);
    if (actual != null) {
      pairResultBuilder.setActual(actual).setActualFieldIndex(actualFieldIndex);
    }
    if (expected != null) {
```

### IgnoreResultOfCall
Result of `Builder.setExpectedFieldIndex()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    }
    if (expected != null) {
      pairResultBuilder.setExpected(expected).setExpectedFieldIndex(expectedFieldIndex);
    }
    if (comparison.breakdown().isPresent()) {
```

### IgnoreResultOfCall
Result of `Builder.setBreakdown()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    }
    if (comparison.breakdown().isPresent()) {
      pairResultBuilder.setBreakdown(comparison.breakdown().get());
    }
    return pairResultBuilder.build();
```

### IgnoreResultOfCall
Result of `Builder.setActual()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
            .setProtoPrinter(protoPrinter);
    if (actual != null) {
      singularFieldBuilder.setActual(actual);
    }
    if (expected != null) {
```

### IgnoreResultOfCall
Result of `Builder.setExpected()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    }
    if (expected != null) {
      singularFieldBuilder.setExpected(expected);
    }
    if (unknownsBreakdown != null) {
```

### IgnoreResultOfCall
Result of `Builder.setUnknownsBreakdown()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    }
    if (unknownsBreakdown != null) {
      singularFieldBuilder.setUnknownsBreakdown(unknownsBreakdown);
    }
    return singularFieldBuilder.build();
```

### IgnoreResultOfCall
Result of `Builder.setActual()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
            .setProtoPrinter(protoPrinter);
    if (actual != null) {
      singularFieldBuilder.setActual(actual);
    }
    if (expected != null) {
```

### IgnoreResultOfCall
Result of `Builder.setExpected()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    }
    if (expected != null) {
      singularFieldBuilder.setExpected(expected);
    }
    return singularFieldBuilder.build();
```

### IgnoreResultOfCall
Result of `Builder.setActual()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
            .setProtoPrinter(protoPrinter);
    if (actual != null) {
      singularFieldBuilder.setActual(actual);
    }
    if (expected != null) {
```

### IgnoreResultOfCall
Result of `Builder.setExpected()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    }
    if (expected != null) {
      singularFieldBuilder.setExpected(expected);
    }
    if (breakdown != null) {
```

### IgnoreResultOfCall
Result of `Builder.setBreakdown()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    }
    if (breakdown != null) {
      singularFieldBuilder.setBreakdown(breakdown);
    }
    return singularFieldBuilder.build();
```

### IgnoreResultOfCall
Result of `Builder.setActual()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
            .setProtoPrinter(protoPrinter);
    if (actual != null) {
      singularFieldBuilder.setActual(actual);
    }
    if (expected != null) {
```

### IgnoreResultOfCall
Result of `Builder.setExpected()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    }
    if (expected != null) {
      singularFieldBuilder.setExpected(expected);
    }
    return singularFieldBuilder.build();
```

### IgnoreResultOfCall
Result of `Builder.setActualValue()` is ignored
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java

          if (isThatOrAssertThat(owner, name)) {
            invocation.setActualValue(getOperandFromTop(0));
          } else if (isBoxing(owner, name, desc)) {
            invocation.setBoxingInput(
```

### IgnoreResultOfCall
Result of `Builder.setBoxingInput()` is ignored
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
            invocation.setActualValue(getOperandFromTop(0));
          } else if (isBoxing(owner, name, desc)) {
            invocation.setBoxingInput(
                // double and long are represented by a TOP with the "real" value under it.
                getOperandFromTop(0).type() == InferredType.TOP
```

### IgnoreResultOfCall
Result of `Builder.setReceiver()` is ignored
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java

          if (opcode != Opcodes.INVOKESTATIC) {
            invocation.setReceiver(pop());
          }

```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `core/src/main/java/com/google/common/truth/Truth.java`
#### Snippet
```java
  }

  public static GuavaOptionalSubject assertThat(@Nullable Optional<?> actual) {
    return assert_().that(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'subject'
in `extensions/java8/src/main/java/com/google/common/truth/OptionalIntSubject.java`
#### Snippet
```java
  OptionalIntSubject(
      FailureMetadata failureMetadata,
      @Nullable OptionalInt subject,
      @Nullable String typeDescription) {
    super(failureMetadata, subject, typeDescription);
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for field 'actual'
in `extensions/java8/src/main/java/com/google/common/truth/OptionalIntSubject.java`
#### Snippet
```java
 */
public final class OptionalIntSubject extends Subject {
  private final OptionalInt actual;

  OptionalIntSubject(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'homogeneousTypeToDisplay'
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java
  static final class DuplicateGroupedAndTyped {
    final NonHashingMultiset<?> valuesAndMaybeTypes;
    final Optional<String> homogeneousTypeToDisplay;

    DuplicateGroupedAndTyped(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'homogeneousTypeToDisplay'
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java

    DuplicateGroupedAndTyped(
        NonHashingMultiset<?> valuesAndMaybeTypes, Optional<String> homogeneousTypeToDisplay) {
      this.valuesAndMaybeTypes = valuesAndMaybeTypes;
      this.homogeneousTypeToDisplay = homogeneousTypeToDisplay;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'fieldIndex'
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
      }

      private static String indexed(String fieldPrefix, Optional<Integer> fieldIndex) {
        String index = fieldIndex.isPresent() ? fieldIndex.get().toString() : "?";
        return fieldPrefix + "[" + index + "]";
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'descriptor'
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScope.java`
#### Snippet
```java
   *     if present. Used to pretty-print raw field numbers.
   */
  abstract String usingCorrespondenceString(Optional<Descriptor> descriptor);
}

```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'target'
in `extensions/java8/src/main/java/com/google/common/truth/Truth8.java`
#### Snippet
```java
  }

  public static OptionalLongSubject assertThat(@Nullable OptionalLong target) {
    return assertAbout(OptionalLongSubject.optionalLongs()).that(target);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'target'
in `extensions/java8/src/main/java/com/google/common/truth/Truth8.java`
#### Snippet
```java
public final class Truth8 {
  @SuppressWarnings("AssertAboutOptionals") // suggests infinite recursion
  public static OptionalSubject assertThat(@Nullable Optional<?> target) {
    return assertAbout(OptionalSubject.optionals()).that(target);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'target'
in `extensions/java8/src/main/java/com/google/common/truth/Truth8.java`
#### Snippet
```java
  }

  public static OptionalIntSubject assertThat(@Nullable OptionalInt target) {
    return assertAbout(OptionalIntSubject.optionalInts()).that(target);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'target'
in `extensions/java8/src/main/java/com/google/common/truth/Truth8.java`
#### Snippet
```java
  }

  public static OptionalDoubleSubject assertThat(@Nullable OptionalDouble target) {
    return assertAbout(OptionalDoubleSubject.optionalDoubles()).that(target);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `core/src/main/java/com/google/common/truth/StandardSubjectBuilder.java`
#### Snippet
```java
  }

  public final GuavaOptionalSubject that(@Nullable Optional<?> actual) {
    return new GuavaOptionalSubject(metadata(), actual, "optional");
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optDescriptor'
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FluentEqualityConfig.java`
#### Snippet
```java

  final <M extends Message> Correspondence<M, M> toCorrespondence(
      Optional<Descriptor> optDescriptor) {
    checkState(hasExpectedMessages(), "withExpectedMessages() not called");
    return Correspondence.from(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'descriptor'
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FluentEqualityConfig.java`
#### Snippet
```java
  abstract Function<? super Optional<Descriptor>, String> usingCorrespondenceStringFunction();

  final String usingCorrespondenceString(Optional<Descriptor> descriptor) {
    return usingCorrespondenceStringFunction().apply(descriptor);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'correspondence'
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
      float x,
      float y,
      Optional<Correspondence<Number, Number>> correspondence
      ) {
    if (correspondence.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'correspondence'
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
      double x,
      double y,
      Optional<Correspondence<Number, Number>> correspondence
      ) {
    if (correspondence.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'subject'
in `extensions/java8/src/main/java/com/google/common/truth/OptionalLongSubject.java`
#### Snippet
```java
  OptionalLongSubject(
      FailureMetadata failureMetadata,
      @Nullable OptionalLong subject,
      @Nullable String typeDescription) {
    super(failureMetadata, subject, typeDescription);
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'actual'
in `extensions/java8/src/main/java/com/google/common/truth/OptionalLongSubject.java`
#### Snippet
```java
 */
public final class OptionalLongSubject extends Subject {
  private final OptionalLong actual;

  OptionalLongSubject(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'actual'
in `core/src/main/java/com/google/common/truth/GuavaOptionalSubject.java`
#### Snippet
```java
 */
public final class GuavaOptionalSubject extends Subject {
  private final @Nullable Optional<?> actual;

  GuavaOptionalSubject(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `core/src/main/java/com/google/common/truth/GuavaOptionalSubject.java`
#### Snippet
```java

  GuavaOptionalSubject(
      FailureMetadata metadata, @Nullable Optional<?> actual, @Nullable String typeDescription) {
    super(metadata, actual, typeDescription);
    this.actual = actual;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optDescriptor'
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeUtil.java`
#### Snippet
```java
   */
  private static String resolveFieldNumbers(
      Optional<Descriptor> optDescriptor, String fmt, Iterable<Integer> fieldNumbers) {
    if (optDescriptor.isPresent()) {
      Descriptor descriptor = optDescriptor.get();
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for field 'actual'
in `extensions/java8/src/main/java/com/google/common/truth/OptionalDoubleSubject.java`
#### Snippet
```java
public final class OptionalDoubleSubject extends Subject {

  private final OptionalDouble actual;

  OptionalDoubleSubject(
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'subject'
in `extensions/java8/src/main/java/com/google/common/truth/OptionalDoubleSubject.java`
#### Snippet
```java
  OptionalDoubleSubject(
      FailureMetadata failureMetadata,
      @Nullable OptionalDouble subject,
      @Nullable String typeDescription) {
    super(failureMetadata, subject, typeDescription);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'actual'
in `extensions/java8/src/main/java/com/google/common/truth/OptionalSubject.java`
#### Snippet
```java
 */
public final class OptionalSubject extends Subject {
  private final @Nullable Optional<?> actual;

  OptionalSubject(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'subject'
in `extensions/java8/src/main/java/com/google/common/truth/OptionalSubject.java`
#### Snippet
```java
  OptionalSubject(
      FailureMetadata failureMetadata,
      @Nullable Optional<?> subject,
      @Nullable String typeDescription) {
    super(failureMetadata, subject, typeDescription);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'pairer'
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
    private final IterableSubject subject;
    private final Correspondence<? super A, ? super E> correspondence;
    private final Optional<Pairer> pairer;

    UsingCorrespondence(
```

## RuleId[id=OptionalAssignedToNull]
### OptionalAssignedToNull
Optional value is compared with null
in `extensions/java8/src/main/java/com/google/common/truth/OptionalIntSubject.java`
#### Snippet
```java
   */
  public void hasValue(int expected) {
    if (actual == null) {
      failWithActual("expected an optional with value", expected);
    } else if (!actual.isPresent()) {
```

### OptionalAssignedToNull
Optional value is compared with null
in `extensions/java8/src/main/java/com/google/common/truth/OptionalIntSubject.java`
#### Snippet
```java
  /** Fails if the {@link OptionalInt} is present or the subject is null. */
  public void isEmpty() {
    if (actual == null) {
      failWithActual(simpleFact("expected empty optional"));
    } else if (actual.isPresent()) {
```

### OptionalAssignedToNull
Optional value is compared with null
in `extensions/java8/src/main/java/com/google/common/truth/OptionalIntSubject.java`
#### Snippet
```java
  /** Fails if the {@link OptionalInt} is empty or the subject is null. */
  public void isPresent() {
    if (actual == null) {
      failWithActual(simpleFact("expected present optional"));
    } else if (!actual.isPresent()) {
```

### OptionalAssignedToNull
Optional value is compared with null
in `extensions/java8/src/main/java/com/google/common/truth/OptionalLongSubject.java`
#### Snippet
```java
  /** Fails if the {@link OptionalLong} is empty or the subject is null. */
  public void isPresent() {
    if (actual == null) {
      failWithActual(simpleFact("expected present optional"));
    } else if (!actual.isPresent()) {
```

### OptionalAssignedToNull
Optional value is compared with null
in `extensions/java8/src/main/java/com/google/common/truth/OptionalLongSubject.java`
#### Snippet
```java
  /** Fails if the {@link OptionalLong} is present or the subject is null. */
  public void isEmpty() {
    if (actual == null) {
      failWithActual(simpleFact("expected empty optional"));
    } else if (actual.isPresent()) {
```

### OptionalAssignedToNull
Optional value is compared with null
in `extensions/java8/src/main/java/com/google/common/truth/OptionalLongSubject.java`
#### Snippet
```java
   */
  public void hasValue(long expected) {
    if (actual == null) {
      failWithActual("expected an optional with value", expected);
    } else if (!actual.isPresent()) {
```

### OptionalAssignedToNull
Optional value is compared with null
in `core/src/main/java/com/google/common/truth/GuavaOptionalSubject.java`
#### Snippet
```java
  /** Fails if the {@link Optional}{@code <T>} is absent or the subject is null. */
  public void isPresent() {
    if (actual == null) {
      failWithActual(simpleFact("expected present optional"));
    } else if (!actual.isPresent()) {
```

### OptionalAssignedToNull
Optional value is compared with null
in `core/src/main/java/com/google/common/truth/GuavaOptionalSubject.java`
#### Snippet
```java
      throw new NullPointerException("Optional cannot have a null value.");
    }
    if (actual == null) {
      failWithActual("expected an optional with value", expected);
    } else if (!actual.isPresent()) {
```

### OptionalAssignedToNull
Optional value is compared with null
in `core/src/main/java/com/google/common/truth/GuavaOptionalSubject.java`
#### Snippet
```java
  /** Fails if the {@link Optional}{@code <T>} is present or the subject is null. */
  public void isAbsent() {
    if (actual == null) {
      failWithActual(simpleFact("expected absent optional"));
    } else if (actual.isPresent()) {
```

### OptionalAssignedToNull
Optional value is compared with null
in `extensions/java8/src/main/java/com/google/common/truth/OptionalDoubleSubject.java`
#### Snippet
```java
  /** Fails if the {@link OptionalDouble} is present or the subject is null. */
  public void isEmpty() {
    if (actual == null) {
      failWithActual(simpleFact("expected empty optional"));
    } else if (actual.isPresent()) {
```

### OptionalAssignedToNull
Optional value is compared with null
in `extensions/java8/src/main/java/com/google/common/truth/OptionalDoubleSubject.java`
#### Snippet
```java
   */
  public void hasValue(double expected) {
    if (actual == null) {
      failWithActual("expected an optional with value", expected);
    } else if (!actual.isPresent()) {
```

### OptionalAssignedToNull
Optional value is compared with null
in `extensions/java8/src/main/java/com/google/common/truth/OptionalDoubleSubject.java`
#### Snippet
```java
  /** Fails if the {@link OptionalDouble} is empty or the subject is null. */
  public void isPresent() {
    if (actual == null) {
      failWithActual(simpleFact("expected present optional"));
    } else if (!actual.isPresent()) {
```

### OptionalAssignedToNull
Optional value is compared with null
in `extensions/java8/src/main/java/com/google/common/truth/OptionalSubject.java`
#### Snippet
```java
      throw new NullPointerException("Optional cannot have a null value.");
    }
    if (actual == null) {
      failWithActual("expected an optional with value", expected);
    } else if (!actual.isPresent()) {
```

### OptionalAssignedToNull
Optional value is compared with null
in `extensions/java8/src/main/java/com/google/common/truth/OptionalSubject.java`
#### Snippet
```java
  /** Fails if the {@link Optional}{@code <T>} is present or the subject is null. */
  public void isEmpty() {
    if (actual == null) {
      failWithActual(simpleFact("expected empty optional"));
    } else if (actual.isPresent()) {
```

### OptionalAssignedToNull
Optional value is compared with null
in `extensions/java8/src/main/java/com/google/common/truth/OptionalSubject.java`
#### Snippet
```java
  /** Fails if the {@link Optional}{@code <T>} is empty or the subject is null. */
  public void isPresent() {
    if (actual == null) {
      failWithActual(simpleFact("expected present optional"));
    } else if (!actual.isPresent()) {
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.objectweb.asm.Opcodes;`
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.Iterables;
import org.objectweb.asm.Opcodes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `left` to `double` is redundant
in `core/src/main/java/com/google/common/truth/MathUtil.java`
#### Snippet
```java
   */
  public static boolean notEqualWithinTolerance(float left, float right, float tolerance) {
    return notEqualWithinTolerance((double) left, (double) right, (double) tolerance);
  }
}
```

### RedundantCast
Casting `right` to `double` is redundant
in `core/src/main/java/com/google/common/truth/MathUtil.java`
#### Snippet
```java
   */
  public static boolean notEqualWithinTolerance(float left, float right, float tolerance) {
    return notEqualWithinTolerance((double) left, (double) right, (double) tolerance);
  }
}
```

### RedundantCast
Casting `left` to `double` is redundant
in `core/src/main/java/com/google/common/truth/MathUtil.java`
#### Snippet
```java
   */
  public static boolean equalWithinTolerance(float left, float right, float tolerance) {
    return equalWithinTolerance((double) left, (double) right, (double) tolerance);
  }

```

### RedundantCast
Casting `right` to `double` is redundant
in `core/src/main/java/com/google/common/truth/MathUtil.java`
#### Snippet
```java
   */
  public static boolean equalWithinTolerance(float left, float right, float tolerance) {
    return equalWithinTolerance((double) left, (double) right, (double) tolerance);
  }

```

### RedundantCast
Casting `null` to `T` is redundant
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java
    items.add(second);
    if (rest == null) {
      items.add((T) null);
    } else {
      items.addAll(Arrays.asList(rest));
```

### RedundantCast
Casting `((Character)o).charValue()` to `long` is redundant
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
  private static long integralValue(Object o) {
    if (o instanceof Character) {
      return (long) ((Character) o).charValue();
    } else if (o instanceof Number) {
      return ((Number) o).longValue();
```

### RedundantCast
Casting `unexpected.remove(...)` to `A` is redundant
in `core/src/main/java/com/google/common/truth/MapSubject.java`
#### Snippet
```java
        if (actual.containsKey(expectedKey)) {
          @SuppressWarnings("UnnecessaryCast") // needed by nullness checker
          A actualValue = (A) unexpected.remove(expectedKey);
          if (!valueTester.test(actualValue, expectedValue)) {
            wrongValues.put(expectedKey, new ValueDifference<>(actualValue, expectedValue));
```

### RedundantCast
Casting `actualValue` to `A` is redundant
in `core/src/main/java/com/google/common/truth/MapSubject.java`
#### Snippet
```java
        A actualValue = getCastSubject().get(expectedKey);
        Correspondence.ExceptionStore exceptions = Correspondence.ExceptionStore.forMapValues();
        if (correspondence.safeCompare((A) actualValue, expectedValue, exceptions)) {
          // The expected key had the expected value. There's no need to check exceptions here,
          // because if Correspondence.compare() threw then safeCompare() would return false.
```

### RedundantCast
Casting `actualValue` to `A` is redundant
in `core/src/main/java/com/google/common/truth/MapSubject.java`
#### Snippet
```java
        }
        // Found matching key with non-matching value.
        String diff = correspondence.safeFormatDiff((A) actualValue, expectedValue, exceptions);
        if (diff != null) {
          failWithoutActual(
```

### RedundantCast
Casting `actualValue` to `A` is redundant
in `core/src/main/java/com/google/common/truth/MapSubject.java`
#### Snippet
```java
        A actualValue = getCastSubject().get(excludedKey);
        Correspondence.ExceptionStore exceptions = Correspondence.ExceptionStore.forMapValues();
        if (correspondence.safeCompare((A) actualValue, excludedValue, exceptions)) {
          // The matching key had a matching value. There's no need to check exceptions here,
          // because if Correspondence.compare() threw then safeCompare() would return false.
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/MapWithProtoValuesFluentAssertion.java`
#### Snippet
```java
   *
   * <p>This setting applies to all repeated fields recursively, but it does not ignore structure.
   * For example, with {@link #ignoringRepeatedFieldOrderForValues()}, a repeated {@code int32}
   * field {@code bar}, set inside a repeated message field {@code foo}, the following protos will
   * all compare equal:
```

### JavadocDeclaration
Javadoc pointing to itself
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoFluentAssertion.java`
#### Snippet
```java
   *
   * <p>This setting applies to all repeated fields recursively, but it does not ignore structure.
   * For example, with {@link #ignoringRepeatedFieldOrder()}, a repeated {@code int32} field {@code
   * bar}, set inside a repeated message field {@code foo}, the following protos will all compare
   * equal:
```

### JavadocDeclaration
Javadoc pointing to itself
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/MultimapWithProtoValuesFluentAssertion.java`
#### Snippet
```java
   *
   * <p>This setting applies to all repeated fields recursively, but it does not ignore structure.
   * For example, with {@link #ignoringRepeatedFieldOrderForValues()}, a repeated {@code int32}
   * field {@code bar}, set inside a repeated message field {@code foo}, the following protos will
   * all compare equal:
```

### JavadocDeclaration
Javadoc pointing to itself
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/MapWithProtoValuesSubject.java`
#### Snippet
```java
   *
   * <p>This setting applies to all repeated fields recursively, but it does not ignore structure.
   * For example, with {@link #ignoringRepeatedFieldOrderForValues()}, a repeated {@code int32}
   * field {@code bar}, set inside a repeated message field {@code foo}, the following protos will
   * all compare equal:
```

### JavadocDeclaration
Javadoc pointing to itself
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java
   *
   * <p>(N.B. This section is only really of interest when implementing assertion methods that call
   * {@link Correspondence#compare}, not to users making such assertions in their tests.)
   *
   * <p>The only requirement on an assertion is that, if it encounters an exception from this
```

### JavadocDeclaration
Javadoc pointing to itself
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/IterableOfProtosFluentAssertion.java`
#### Snippet
```java
   *
   * <p>This setting applies to all repeated fields recursively, but it does not ignore structure.
   * For example, with {@link #ignoringRepeatedFieldOrder()}, a repeated {@code int32} field {@code
   * bar}, set inside a repeated message field {@code foo}, the following protos will all compare
   * equal:
```

### JavadocDeclaration
Javadoc pointing to itself
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/MultimapWithProtoValuesSubject.java`
#### Snippet
```java
   *
   * <p>This setting applies to all repeated fields recursively, but it does not ignore structure.
   * For example, with {@link #ignoringRepeatedFieldOrderForValues()}, a repeated {@code int32}
   * field {@code bar}, set inside a repeated message field {@code foo}, the following protos will
   * all compare equal:
```

### JavadocDeclaration
Javadoc pointing to itself
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoSubject.java`
#### Snippet
```java
   *
   * <p>This setting applies to all repeated fields recursively, but it does not ignore structure.
   * For example, with {@link #ignoringRepeatedFieldOrder()}, a repeated {@code int32} field {@code
   * bar}, set inside a repeated message field {@code foo}, the following protos will all compare
   * equal:
```

### JavadocDeclaration
Javadoc pointing to itself
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/IterableOfProtosSubject.java`
#### Snippet
```java
   *
   * <p>This setting applies to all repeated fields recursively, but it does not ignore structure.
   * For example, with {@link #ignoringRepeatedFieldOrder()}, a repeated {@code int32} field {@code
   * bar}, set inside a repeated message field {@code foo}, the following protos will all compare
   * equal:
```

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'equalsIgnoreCase()' call
in `core/src/main/java/com/google/common/truth/StringSubject.java`
#### Snippet
```java
        }
      } else {
        if (unexpected != null && actual.equalsIgnoreCase(unexpected)) {
          failWithoutActual(
              fact("expected not to be", unexpected), butWas(), simpleFact("(case is ignored)"));
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/MapWithProtoValuesSubject.java`
#### Snippet
```java
    public void containsEntry(@Nullable Object expectedKey, @Nullable M expectedValue) {
      subject
          .usingCorrespondence(Arrays.asList(expectedValue))
          .containsEntry(expectedKey, expectedValue);
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/MapWithProtoValuesSubject.java`
#### Snippet
```java
    public void doesNotContainEntry(@Nullable Object excludedKey, @Nullable M excludedValue) {
      subject
          .usingCorrespondence(Arrays.asList(excludedValue))
          .doesNotContainEntry(excludedKey, excludedValue);
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java
        truncateStackTrace(exception, callingClass);
        firstPairingException =
            new StoredException(exception, "expectedKeyFunction.apply", asList(expected));
      }
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java
        truncateStackTrace(exception, callingClass);
        firstPairingException =
            new StoredException(exception, "actualKeyFunction.apply", asList(actual));
      }
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/MultimapWithProtoValuesSubject.java`
#### Snippet
```java
    public void containsEntry(@Nullable Object expectedKey, @Nullable M expectedValue) {
      subject
          .usingCorrespondence(Arrays.asList(expectedValue))
          .containsEntry(expectedKey, expectedValue);
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/MultimapWithProtoValuesSubject.java`
#### Snippet
```java
    public void doesNotContainEntry(@Nullable Object excludedKey, @Nullable M excludedValue) {
      subject
          .usingCorrespondence(Arrays.asList(excludedValue))
          .doesNotContainEntry(excludedKey, excludedValue);
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoSubject.java`
#### Snippet
```java
  private ProtoTruthMessageDifferencer makeDifferencer(Message expected) {
    return config
        .withExpectedMessages(Arrays.asList(expected))
        .toMessageDifferencer(actual.getDescriptorForType());
  }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
        // If there are as many distinct valid indexes are there are elements in the list then every
        // index must be in there once.
        return asList();
      }
      List<T> notIndexed = newArrayList();
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/IterableOfProtosSubject.java`
#### Snippet
```java
    @Override
    public void doesNotContain(@Nullable M excluded) {
      delegate(Arrays.asList(excluded)).doesNotContain(excluded);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/IterableOfProtosSubject.java`
#### Snippet
```java
    @Override
    public void contains(@Nullable M expected) {
      delegate(Arrays.asList(expected)).contains(expected);
    }

```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/IterableOfProtosSubject.java`
#### Snippet
```java
      implements IterableOfProtosUsingCorrespondence<M> {
    private final IterableOfProtosSubject<M> subject;
    private final @Nullable Function<? super M, ? extends Object> keyFunction;

    UsingCorrespondence(
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/IterableOfProtosSubject.java`
#### Snippet
```java
    UsingCorrespondence(
        IterableOfProtosSubject<M> subject,
        @Nullable Function<? super M, ? extends Object> keyFunction) {
      this.subject = checkNotNull(subject);
      this.keyFunction = keyFunction;
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/MapWithProtoValuesSubject.java`
#### Snippet
```java
    @Override
    @Deprecated
    public boolean equals(Object o) {
      return subject.equals(o);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/MultimapWithProtoValuesSubject.java`
#### Snippet
```java
    @Override
    @Deprecated
    public boolean equals(Object o) {
      return subject.equals(o);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/IterableOfProtosSubject.java`
#### Snippet
```java
    @Override
    @Deprecated
    public boolean equals(Object o) {
      return subject.equals(o);
    }
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `i > 0` is always `true`
in `core/src/main/java/com/google/common/truth/DiffUtils.java`
#### Snippet
```java
        unifiedDiffContentId.add(revised[j]);
        j--;
      } else if (i > 0 && (j == 0 || lcs[i][j - 1] < lcs[i - 1][j])) {
        unifiedDiffType.add('-');
        unifiedDiffContentId.add(original[i]);
```

### ConstantValue
Value `expected` is always 'null'
in `extensions/liteproto/src/main/java/com/google/common/truth/extensions/proto/LiteProtoSubject.java`
#### Snippet
```java
    if (Objects.equal(actual, expected)) {
      if (actual == null) {
        super.isNotEqualTo(expected);
      } else {
        failWithoutActual(
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
    @Memoized
    Object actualOrExpected() {
      return actual().or(expected()).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
            if (isMessage()) {
              sb.append("\n");
              printMessage((Message) actual().get(), sb);
            } else {
              printFieldValue(fieldDescriptor(), actual().get(), sb);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
              printMessage((Message) actual().get(), sb);
            } else {
              printFieldValue(fieldDescriptor(), actual().get(), sb);
              sb.append("\n");
            }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
            } else {
              sb.append(" ");
              printFieldValue(fieldDescriptor(), actual().get(), sb);
              sb.append("\n");
            }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
            return;
          case MATCHED:
            if (actualFieldIndex().get().equals(expectedFieldIndex().get())) {
              sb.append("matched: ").append(indexed(fieldPrefix, actualFieldIndex()));
            } else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
            return;
          case MATCHED:
            if (actualFieldIndex().get().equals(expectedFieldIndex().get())) {
              sb.append("matched: ").append(indexed(fieldPrefix, actualFieldIndex()));
            } else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
            } else {
              sb.append(" ");
              printFieldValue(fieldDescriptor(), actual().get(), sb);
              sb.append("\n");
            }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
            } else {
              sb.append(" ");
              printFieldValue(fieldDescriptor(), actual().get(), sb);
              sb.append("\n");
            }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
          case MODIFIED:
            sb.append("modified: ");
            if (actualFieldIndex().get().equals(expectedFieldIndex().get())) {
              sb.append(indexed(fieldPrefix, actualFieldIndex()));
            } else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
          case MODIFIED:
            sb.append("modified: ");
            if (actualFieldIndex().get().equals(expectedFieldIndex().get())) {
              sb.append(indexed(fieldPrefix, actualFieldIndex()));
            } else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
            } else {
              sb.append(" ");
              printFieldValue(fieldDescriptor(), expected().get(), sb);
              sb.append(" -> ");
              printFieldValue(fieldDescriptor(), actual().get(), sb);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
              printFieldValue(fieldDescriptor(), expected().get(), sb);
              sb.append(" -> ");
              printFieldValue(fieldDescriptor(), actual().get(), sb);
            }
            return;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
            if (isMessage()) {
              sb.append("\n");
              printMessage((Message) expected().get(), sb);
            } else {
              printFieldValue(fieldDescriptor(), expected().get(), sb);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
              printMessage((Message) expected().get(), sb);
            } else {
              printFieldValue(fieldDescriptor(), expected().get(), sb);
              sb.append("\n");
            }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
        case ADDED:
          sb.append("added: ").append(fieldPrefix).append(": ");
          if (actual().get() instanceof Message) {
            sb.append("\n");
            printMessage((Message) actual().get(), sb);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
            printMessage((Message) actual().get(), sb);
          } else {
            printFieldValue(subScopeId().get(), actual().get(), sb);
            sb.append("\n");
          }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
          } else {
            sb.append(": ");
            printFieldValue(subScopeId().get(), actualOrExpected(), sb);
            sb.append("\n");
          }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
          } else {
            sb.append(": ");
            printFieldValue(subScopeId().get(), expected().get(), sb);
            sb.append(" -> ");
            printFieldValue(subScopeId().get(), actual().get(), sb);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
          } else {
            sb.append(": ");
            printFieldValue(subScopeId().get(), expected().get(), sb);
            sb.append(" -> ");
            printFieldValue(subScopeId().get(), actual().get(), sb);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
            printFieldValue(subScopeId().get(), expected().get(), sb);
            sb.append(" -> ");
            printFieldValue(subScopeId().get(), actual().get(), sb);
            sb.append("\n");
          }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
        case REMOVED:
          sb.append("deleted: ").append(fieldPrefix).append(": ");
          if (expected().get() instanceof Message) {
            sb.append("\n");
            printMessage((Message) expected().get(), sb);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
            printMessage((Message) expected().get(), sb);
          } else {
            printFieldValue(subScopeId().get(), expected().get(), sb);
            sb.append("\n");
          }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
        // Move all prior elements to actualNotInOrder.
        while (!actualIndices.isEmpty()
            && actualIndices.getFirst() < matchingResult.actualFieldIndex().get()) {
          actualNotInOrder.add(actualIndices.removeFirst());
        }
```

