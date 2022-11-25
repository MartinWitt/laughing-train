# truth 
 
# Bad smells
I found 353 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=DataFlowIssue] | 76 | false |
| RuleId[ruleID=BoundedWildcard] | 30 | false |
| RuleId[ruleID=AbstractClassNeverImplemented] | 28 | false |
| RuleId[ruleID=OptionalUsedAsFieldOrParameterType] | 26 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 25 | false |
| RuleId[ruleID=OptionalGetWithoutIsPresent] | 23 | false |
| RuleId[ruleID=IgnoreResultOfCall] | 21 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 17 | false |
| RuleId[ruleID=OptionalAssignedToNull] | 15 | false |
| RuleId[ruleID=NullableProblems] | 12 | false |
| RuleId[ruleID=UnstableApiUsage] | 8 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 5 | false |
| RuleId[ruleID=KeySetIterationMayUseEntrySet] | 5 | false |
| RuleId[ruleID=UnnecessaryUnboxing] | 5 | false |
| RuleId[ruleID=UnnecessarySemicolon] | 4 | false |
| RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod] | 4 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 4 | false |
| RuleId[ruleID=Anonymous2MethodRef] | 4 | false |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 4 | false |
| RuleId[ruleID=StaticPseudoFunctionalStyleMethod] | 3 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 3 | false |
| RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment] | 3 | false |
| RuleId[ruleID=EqualsWhichDoesntCheckParameterClass] | 3 | false |
| RuleId[ruleID=UnnecessaryModifier] | 2 | true |
| RuleId[ruleID=DuplicateBranchesInSwitch] | 2 | false |
| RuleId[ruleID=NonShortCircuitBoolean] | 2 | false |
| RuleId[ruleID=EmptyMethod] | 2 | false |
| RuleId[ruleID=TypeParameterExtendsObject] | 2 | false |
| RuleId[ruleID=ConstantValue] | 2 | false |
| RuleId[ruleID=OptionalIsPresent] | 1 | false |
| RuleId[ruleID=Convert2MethodRef] | 1 | false |
| RuleId[ruleID=FinalPrivateMethod] | 1 | false |
| RuleId[ruleID=StringBufferReplaceableByString] | 1 | false |
| RuleId[ruleID=UnnecessaryToStringCall] | 1 | true |
| RuleId[ruleID=FinalStaticMethod] | 1 | false |
| RuleId[ruleID=WrongPackageStatement] | 1 | false |
| RuleId[ruleID=UnnecessaryInitCause] | 1 | false |
| RuleId[ruleID=RedundantMethodOverride] | 1 | false |
| RuleId[ruleID=ClassNameSameAsAncestorName] | 1 | false |
| RuleId[ruleID=ReturnNull] | 1 | false |
| RuleId[ruleID=InstanceofCatchParameter] | 1 | false |
| RuleId[ruleID=NonExceptionNameEndsWithException] | 1 | false |
## RuleId[ruleID=OptionalIsPresent]
### RuleId[ruleID=OptionalIsPresent]
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

## RuleId[ruleID=UnnecessaryModifier]
### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/MultimapWithProtoValuesFluentAssertion.java`
#### Snippet
```java
   */
  @CanIgnoreReturnValue
  public Ordered containsExactly(@Nullable Object k0, @Nullable M v0, @Nullable Object... rest);

  /**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/MultimapWithProtoValuesFluentAssertion.java`
#### Snippet
```java
  /** Fails if the multimap is not empty. */
  @CanIgnoreReturnValue
  public Ordered containsExactly();

  /**
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/SubScopeId.java`
#### Snippet
```java
  enum Kind {
    FIELD_DESCRIPTOR,
    UNKNOWN_FIELD_DESCRIPTOR;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
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

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `core/src/main/java/com/google/common/truth/FailureMetadata.java`
#### Snippet
```java
  enum OldAndNewValuesAreSimilar {
    SIMILAR,
    DIFFERENT;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
  enum ElementFactGrouping {
    ALL_IN_ONE_FACT,
    FACT_PER_ELEMENT;
  }

```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/ObjectArraySubject.java`
#### Snippet
```java

  public IterableSubject asList() {
    return checkNoNeedToDisplayBothValues("asList()").that(Arrays.asList(actual));
  }
}
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/StringSubject.java`
#### Snippet
```java
      String subject = actual;
      for (int subjectOffset = 0;
          subjectOffset <= subject.length() - string.length();
          subjectOffset++) {
        if (subject.regionMatches(
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/StringSubject.java`
#### Snippet
```java
  public void hasLength(int expectedLength) {
    checkArgument(expectedLength >= 0, "expectedLength(%s) must be >= 0", expectedLength);
    check("length()").that(actual.length()).isEqualTo(expectedLength);
  }

```

### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/ClassSubject.java`
#### Snippet
```java
   */
  public void isAssignableTo(Class<?> clazz) {
    if (!clazz.isAssignableFrom(actual)) {
      failWithActual("expected to be assignable to", clazz.getName());
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `count` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MultisetSubject.java`
#### Snippet
```java
  public final void hasCount(@Nullable Object element, int expectedCount) {
    checkArgument(expectedCount >= 0, "expectedCount(%s) must be >= 0", expectedCount);
    int actualCount = ((Multiset<?>) actual).count(element);
    check("count(%s)", element).that(actualCount).isEqualTo(expectedCount);
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `compareTo` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/ComparableSubject.java`
#### Snippet
```java
   */
  public final void isAtMost(T other) {
    if (actual.compareTo(other) > 0) {
      failWithActual("expected to be at most", other);
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/ComparableSubject.java`
#### Snippet
```java
  /** Checks that the subject is <i>not</i> in {@code range}. */
  public final void isNotIn(Range<T> range) {
    if (range.contains(actual)) {
      failWithActual("expected not to be in range", range);
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `compareTo` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/ComparableSubject.java`
#### Snippet
```java
   */
  public final void isLessThan(T other) {
    if (actual.compareTo(other) >= 0) {
      failWithActual("expected to be less than", other);
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `compareTo` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/ComparableSubject.java`
#### Snippet
```java
   */
  public final void isAtLeast(T other) {
    if (actual.compareTo(other) < 0) {
      failWithActual("expected to be at least", other);
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `compareTo` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/ComparableSubject.java`
#### Snippet
```java
   */
  public final void isGreaterThan(T other) {
    if (actual.compareTo(other) <= 0) {
      failWithActual("expected to be greater than", other);
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/ComparableSubject.java`
#### Snippet
```java
  /** Checks that the subject is in {@code range}. */
  public final void isIn(Range<T> range) {
    if (!range.contains(actual)) {
      failWithActual("expected to be in range", range);
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `compareTo` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/ComparableSubject.java`
#### Snippet
```java
   */
  public void isEquivalentAccordingToCompareTo(T expected) {
    if (actual.compareTo(expected) != 0) {
      failWithActual("expected value that sorts equal to", expected);
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/PrimitiveByteArraySubject.java`
#### Snippet
```java

  public IterableSubject asList() {
    return checkNoNeedToDisplayBothValues("asList()").that(Bytes.asList(actual));
  }
}
```

### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/PrimitiveLongArraySubject.java`
#### Snippet
```java

  public IterableSubject asList() {
    return checkNoNeedToDisplayBothValues("asList()").that(Longs.asList(actual));
  }
}
```

### RuleId[ruleID=DataFlowIssue]
Casting `(Object)value` to `NativeNumber` will produce `ClassCastException` for any non-null value
in `core/src/main/java/com/google/common/truth/super/com/google/common/truth/Platform.java`
#### Snippet
```java
  private static String toLocaleString(double value) {
    // Recieve a double as a parameter so that "(Object) value" does not box it.
    return ((NativeNumber) (Object) value).toLocaleString("en-US", JavaLikeOptions.INSTANCE);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `actual` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/FailureMetadata.java`
#### Snippet
```java
  private @Nullable Throwable rootCause() {
    for (Step step : steps) {
      if (!step.isCheckCall() && step.subject.actual() instanceof Throwable) {
        return (Throwable) step.subject.actual();
      }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `actual` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/FailureMetadata.java`
#### Snippet
```java

      if (rootSubject == null) {
        if (step.subject.actual() instanceof Throwable) {
          /*
           * We'll already include the Throwable as a cause of the AssertionError (see rootCause()),
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `rootSubject` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/FailureMetadata.java`
#### Snippet
```java
            fact(
                // TODO(cpovirk): Use inferDescription() here when appropriate? But it can be long.
                rootSubject.subject.typeDescription() + " was",
                rootSubject.subject.actualCustomStringRepresentationForPackageMembersToCall()))
        : ImmutableList.<Fact>of();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `typeDescription` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/FailureMetadata.java`
#### Snippet
```java
            fact(
                // TODO(cpovirk): Use inferDescription() here when appropriate? But it can be long.
                rootSubject.subject.typeDescription() + " was",
                rootSubject.subject.actualCustomStringRepresentationForPackageMembersToCall()))
        : ImmutableList.<Fact>of();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `typeDescription` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/FailureMetadata.java`
#### Snippet
```java

      if (description == null) {
        description = step.subject.typeDescription();
      }
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isEmpty` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MapSubject.java`
#### Snippet
```java
  public final Ordered containsExactlyEntriesIn(Map<?, ?> expectedMap) {
    if (expectedMap.isEmpty()) {
      if (actual.isEmpty()) {
        return IN_ORDER;
      } else {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `keySet` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MapSubject.java`
#### Snippet
```java
      // We're using the fact that Sets.intersection keeps the order of the first set.
      List<?> expectedKeyOrder =
          Lists.newArrayList(Sets.intersection(expectedMap.keySet(), actual.keySet()));
      List<?> actualKeyOrder =
          Lists.newArrayList(Sets.intersection(actual.keySet(), expectedMap.keySet()));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isEmpty` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MapSubject.java`
#### Snippet
```java
  /** Fails if the map is not empty. */
  public final void isEmpty() {
    if (!actual.isEmpty()) {
      failWithActual(simpleFact("expected to be empty"));
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `size` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MapSubject.java`
#### Snippet
```java
  public final void hasSize(int expectedSize) {
    checkArgument(expectedSize >= 0, "expectedSize (%s) must be >= 0", expectedSize);
    check("size()").that(actual.size()).isEqualTo(expectedSize);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `entrySet` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MapSubject.java`
#### Snippet
```java
  public final void doesNotContainEntry(@Nullable Object key, @Nullable Object value) {
    checkNoNeedToDisplayBothValues("entrySet()")
        .that(actual.entrySet())
        .doesNotContain(immutableEntry(key, value));
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `keySet` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MapSubject.java`
#### Snippet
```java
  /** Fails if the map contains the given key. */
  public final void doesNotContainKey(@Nullable Object key) {
    check("keySet()").that(actual.keySet()).doesNotContain(key);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `keySet` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MapSubject.java`
#### Snippet
```java
  /** Fails if the map does not contain the given key. */
  public final void containsKey(@Nullable Object key) {
    check("keySet()").that(actual.keySet()).contains(key);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `entrySet` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MapSubject.java`
#### Snippet
```java
  public final void containsEntry(@Nullable Object key, @Nullable Object value) {
    Map.Entry<Object, Object> entry = immutableEntry(key, value);
    if (!actual.entrySet().contains(entry)) {
      List<Object> keyList = singletonList(key);
      List<Object> valueList = singletonList(value);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isEmpty` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MapSubject.java`
#### Snippet
```java
  /** Fails if the map is empty. */
  public final void isNotEmpty() {
    if (actual.isEmpty()) {
      failWithoutActual(simpleFact("expected not to be empty"));
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/PrimitiveIntArraySubject.java`
#### Snippet
```java

  public IterableSubject asList() {
    return checkNoNeedToDisplayBothValues("asList()").that(Ints.asList(actual));
  }
}
```

### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/PrimitiveCharArraySubject.java`
#### Snippet
```java

  public IterableSubject asList() {
    return checkNoNeedToDisplayBothValues("asList()").that(Chars.asList(actual));
  }
}
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `containsEntry` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MultimapSubject.java`
#### Snippet
```java
  public final void containsEntry(@Nullable Object key, @Nullable Object value) {
    // TODO(kak): Can we share any of this logic w/ MapSubject.containsEntry()?
    if (!actual.containsEntry(key, value)) {
      Map.Entry<Object, Object> entry = immutableEntry(key, value);
      List<Map.Entry<Object, Object>> entryList = ImmutableList.of(entry);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `entries` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MultimapSubject.java`
#### Snippet
```java
  @CanIgnoreReturnValue
  public final Ordered containsExactly() {
    return check().about(iterableEntries()).that(actual.entries()).containsExactly();
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `size` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MultimapSubject.java`
#### Snippet
```java
  public final void hasSize(int expectedSize) {
    checkArgument(expectedSize >= 0, "expectedSize(%s) must be >= 0", expectedSize);
    check("size()").that(actual.size()).isEqualTo(expectedSize);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `keySet` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MultimapSubject.java`
#### Snippet
```java
      // We use the fact that Sets.intersection's result has the same order as the first parameter
      boolean keysInOrder =
          Lists.newArrayList(Sets.intersection(actual.keySet(), expectedMultimap.keySet()))
              .equals(Lists.newArrayList(expectedMultimap.keySet()));

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `entries` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MultimapSubject.java`
#### Snippet
```java
  public final void doesNotContainEntry(@Nullable Object key, @Nullable Object value) {
    checkNoNeedToDisplayBothValues("entries()")
        .that(actual.entries())
        .doesNotContain(immutableEntry(key, value));
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `keySet` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MultimapSubject.java`
#### Snippet
```java
  /** Fails if the multimap contains the given key. */
  public final void doesNotContainKey(@Nullable Object key) {
    check("keySet()").that(actual.keySet()).doesNotContain(key);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `keySet` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MultimapSubject.java`
#### Snippet
```java
  /** Fails if the multimap does not contain the given key. */
  public final void containsKey(@Nullable Object key) {
    check("keySet()").that(actual.keySet()).contains(key);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isEmpty` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MultimapSubject.java`
#### Snippet
```java
  /** Fails if the multimap is empty. */
  public final void isNotEmpty() {
    if (actual.isEmpty()) {
      failWithoutActual(simpleFact("expected not to be empty"));
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/MultimapSubject.java`
#### Snippet
```java
    checkNotNull(expectedMultimap, "expectedMultimap");
    ListMultimap<?, ?> missing = difference(expectedMultimap, actual);
    ListMultimap<?, ?> extra = difference(actual, expectedMultimap);

    // TODO(kak): Possible enhancement: Include "[1 copy]" if the element does appear in
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MultimapSubject.java`
#### Snippet
```java
   */
  public IterableSubject valuesForKey(@Nullable Object key) {
    return check("valuesForKey(%s)", key).that(((Multimap<Object, Object>) actual).get(key));
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isEmpty` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/MultimapSubject.java`
#### Snippet
```java
  /** Fails if the multimap is not empty. */
  public final void isEmpty() {
    if (!actual.isEmpty()) {
      failWithActual(simpleFact("expected to be empty"));
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getMessage` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/ThrowableSubject.java`
#### Snippet
```java
                  + " about individual facts by using ExpectFailure.assertThat.)");
    }
    return check.that(actual.getMessage());
  }

```

### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/PrimitiveShortArraySubject.java`
#### Snippet
```java

  public IterableSubject asList() {
    return checkNoNeedToDisplayBothValues("asList()").that(Shorts.asList(actual));
  }
}
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `cellSet` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/TableSubject.java`
#### Snippet
```java
  public void containsCell(Cell<?, ?, ?> cell) {
    checkNotNull(cell);
    checkNoNeedToDisplayBothValues("cellSet()").that(actual.cellSet()).contains(cell);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `contains` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/TableSubject.java`
#### Snippet
```java
  /** Fails if the table does not contain a mapping for the given row key and column key. */
  public void contains(@Nullable Object rowKey, @Nullable Object columnKey) {
    if (!actual.contains(rowKey, columnKey)) {
      fail("contains mapping for row/column", rowKey, columnKey);
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `rowKeySet` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/TableSubject.java`
#### Snippet
```java
  /** Fails if the table does not contain the given row key. */
  public void containsRow(@Nullable Object rowKey) {
    check("rowKeySet()").that(actual.rowKeySet()).contains(rowKey);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `cellSet` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/TableSubject.java`
#### Snippet
```java
  public void doesNotContainCell(Cell<?, ?, ?> cell) {
    checkNotNull(cell);
    checkNoNeedToDisplayBothValues("cellSet()").that(actual.cellSet()).doesNotContain(cell);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isEmpty` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/TableSubject.java`
#### Snippet
```java
  /** Fails if the table is not empty. */
  public void isEmpty() {
    if (!actual.isEmpty()) {
      failWithActual(simpleFact("expected to be empty"));
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `columnKeySet` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/TableSubject.java`
#### Snippet
```java
  /** Fails if the table does not contain the given column key. */
  public void containsColumn(@Nullable Object columnKey) {
    check("columnKeySet()").that(actual.columnKeySet()).contains(columnKey);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isEmpty` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/TableSubject.java`
#### Snippet
```java
  /** Fails if the table is empty. */
  public void isNotEmpty() {
    if (actual.isEmpty()) {
      failWithoutActual(simpleFact("expected not to be empty"));
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `values` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/TableSubject.java`
#### Snippet
```java
  /** Fails if the table does not contain the given value. */
  public void containsValue(@Nullable Object value) {
    check("values()").that(actual.values()).contains(value);
  }
}
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `contains` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/TableSubject.java`
#### Snippet
```java
  /** Fails if the table contains a mapping for the given row key and column key. */
  public void doesNotContain(@Nullable Object rowKey, @Nullable Object columnKey) {
    if (actual.contains(rowKey, columnKey)) {
      fail("does not contain mapping for row/column", rowKey, columnKey);
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `size` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/TableSubject.java`
#### Snippet
```java
  public final void hasSize(int expectedSize) {
    checkArgument(expectedSize >= 0, "expectedSize(%s) must be >= 0", expectedSize);
    check("size()").that(actual.size()).isEqualTo(expectedSize);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getSerializedSize` may produce `NullPointerException`
in `extensions/liteproto/src/main/java/com/google/common/truth/extensions/proto/LiteProtoSubject.java`
#### Snippet
```java
   */
  public IntegerSubject serializedSize() {
    return check("getSerializedSize()").that(actual.getSerializedSize());
  }

```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/PrimitiveFloatArraySubject.java`
#### Snippet
```java
    return checkNoNeedToDisplayBothValues("asList()")
        .about(iterablesWithCustomFloatToString())
        .that(Floats.asList(actual));
  }

```

### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/PrimitiveBooleanArraySubject.java`
#### Snippet
```java

  public IterableSubject asList() {
    return checkNoNeedToDisplayBothValues("asList()").that(Booleans.asList(actual));
  }
}
```

### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/PrimitiveDoubleArraySubject.java`
#### Snippet
```java
    return checkNoNeedToDisplayBothValues("asList()")
        .about(iterablesWithCustomDoubleToString())
        .that(Doubles.asList(actual));
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `compareTo` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/BigDecimalSubject.java`
#### Snippet
```java

  private void compareValues(BigDecimal expected) {
    if (actual.compareTo(expected) != 0) {
      failWithoutActual(fact("expected", expected), butWas(), simpleFact("(scale is ignored)"));
    }
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Method invocation `getDefaultInstanceForType` may produce `NullPointerException`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
  // Requires at least one parameter is non-null.
  private static Message orDefaultForType(@Nullable Message input, @Nullable Message other) {
    return (input != null) ? input : other.getDefaultInstanceForType();
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `iterator` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java

  private void pairwiseCheck(String expectedFact, PairwiseChecker checker) {
    Iterator<?> iterator = actual.iterator();
    if (iterator.hasNext()) {
      Object prev = iterator.next();
```

### RuleId[ruleID=DataFlowIssue]
Argument `this.actual` might be null
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
  @CanIgnoreReturnValue
  public final Ordered containsAtLeastElementsIn(Iterable<?> expectedIterable) {
    List<?> actual = Lists.newLinkedList(this.actual);
    final Collection<?> expected = iterableToCollection(expectedIterable);

```

### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
  /** Fails if the subject is not empty. */
  public final void isEmpty() {
    if (!Iterables.isEmpty(actual)) {
      failWithActual(simpleFact("expected to be empty"));
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
  public final void containsNoDuplicates() {
    List<Multiset.Entry<?>> duplicates = newArrayList();
    for (Multiset.Entry<?> entry : LinkedHashMultiset.create(actual).entrySet()) {
      if (entry.getCount() > 1) {
        duplicates.add(entry);
```

### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
  /** Checks (with a side-effect failure) that the subject contains the supplied item. */
  public final void contains(@Nullable Object element) {
    if (!Iterables.contains(actual, element)) {
      List<Object> elementList = newArrayList(element);
      if (hasMatchingToStringPair(actual, elementList)) {
```

### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
  /** Fails if the subject is empty. */
  public final void isNotEmpty() {
    if (Iterables.isEmpty(actual)) {
      failWithoutActual(simpleFact("expected not to be empty"));
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
  /** Checks (with a side-effect failure) that the subject does not contain the supplied item. */
  public final void doesNotContain(@Nullable Object element) {
    if (Iterables.contains(actual, element)) {
      failWithActual("expected not to contain", element);
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `iterator` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
  private Ordered containsExactlyElementsIn(
      final Iterable<?> required, boolean addElementsInWarning) {
    Iterator<?> actualIter = actual.iterator();
    Iterator<?> requiredIter = required.iterator();

```

### RuleId[ruleID=DataFlowIssue]
Argument `actual` might be null
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
  public final void hasSize(int expectedSize) {
    checkArgument(expectedSize >= 0, "expectedSize(%s) must be >= 0", expectedSize);
    int actualSize = size(actual);
    check("size()").that(actualSize).isEqualTo(expectedSize);
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `actualValue` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
    private void pushDescriptorAndMaybeProcessMethodCall(String desc, Invocation invocation) {
      if (invocation != null && invocation.isOnSubjectInstance()) {
        actualValueAtLocation.put(labelsSeen.build(), invocation.receiver().actualValue());
      }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `actualValue` may produce `NullPointerException`
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
        return subjectFor(type, actualValue());
      } else if (isOnSubjectInstance()) {
        return subjectFor(type, receiver().actualValue());
      } else if (BORING_NAMES.contains(name())) {
        /*
```

### RuleId[ruleID=DataFlowIssue]
Argument `stream` might be null
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
      stream = loader.getResourceAsStream(className.replace('.', '/') + ".class");
      // TODO(cpovirk): Disable inference if the bytecode version is newer than we've tested on?
      new ClassReader(stream).accept(visitor, /*parsingOptions=*/ 0);
      ImmutableSet<StackEntry> actualsAtLine = visitor.actualValueAtLine.build().get(lineNumber);
      /*
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'isEquivalentAccordingToCompareTo' is still used
in `core/src/main/java/com/google/common/truth/IntegerSubject.java`
#### Snippet
```java
  @Override
  @Deprecated
  public final void isEquivalentAccordingToCompareTo(Integer other) {
    super.isEquivalentAccordingToCompareTo(other);
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'isNotIn' is still used
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
  @Override
  @Deprecated
  public void isNotIn(Iterable<?> iterable) {
    if (Iterables.contains(iterable, actual)) {
      failWithActual("expected not to be any of", iterable);
```

### RuleId[ruleID=DeprecatedIsStillUsed]
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

## RuleId[ruleID=Convert2MethodRef]
### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `extensions/java8/src/main/java/com/google/common/truth/StreamSubject.java`
#### Snippet
```java

  public static Subject.Factory<StreamSubject, Stream<?>> streams() {
    return (metadata, subject) -> new StreamSubject(metadata, subject);
  }

```

## RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java

    Iterable<Multiset.Entry<?>> entrySet() {
      return transform(contents.entrySet(), unwrapKey);
    }

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
              iterable = Arrays.asList((Object[]) input);
            }
            return Iterables.transform(iterable, STRINGIFY);
          }
          return input;
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java

  private static Iterable<?> stringableIterable(Object[] array) {
    return Iterables.transform(asList(array), STRINGIFY);
  }

```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `knownFieldValues.keySet()` may be replaced with 'entrySet()' iteration
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldNumberTree.java`
#### Snippet
```java
    // Known fields.
    Map<FieldDescriptor, Object> knownFieldValues = message.getAllFields();
    for (FieldDescriptor field : knownFieldValues.keySet()) {
      SubScopeId subScopeId = SubScopeId.of(field);
      FieldNumberTree childTree = new FieldNumberTree();
```

### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `other.children.keySet()` may be replaced with 'entrySet()' iteration
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldNumberTree.java`
#### Snippet
```java
  /** Adds the other tree onto this one. May destroy {@code other} in the process. */
  private void merge(FieldNumberTree other) {
    for (SubScopeId subScopeId : other.children.keySet()) {
      FieldNumberTree value = other.children.get(subScopeId);
      if (!this.children.containsKey(subScopeId)) {
```

### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `pairing.pairedKeysToExpectedValues.keySet()` may be replaced with 'entrySet()' iteration
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
        Pairing pairing, Correspondence.ExceptionStore exceptions) {
      ImmutableList.Builder<Fact> facts = ImmutableList.builder();
      for (Object key : pairing.pairedKeysToExpectedValues.keySet()) {
        E missing = pairing.pairedKeysToExpectedValues.get(key);
        List<A> extras = pairing.pairedKeysToActualValues.get(key);
```

### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `pairing.pairedKeysToExpectedValues.keySet()` may be replaced with 'entrySet()' iteration
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
        Pairing pairing, Correspondence.ExceptionStore exceptions) {
      ImmutableList.Builder<Fact> facts = ImmutableList.builder();
      for (Object key : pairing.pairedKeysToExpectedValues.keySet()) {
        E missing = pairing.pairedKeysToExpectedValues.get(key);
        List<A> extras = pairing.pairedKeysToActualValues.get(key);
```

### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `pairing.pairedKeysToExpectedValues.keySet()` may be replaced with 'entrySet()' iteration
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
        Pairing pairing, Correspondence.ExceptionStore exceptions) {
      ImmutableList.Builder<Fact> facts = ImmutableList.builder();
      for (Object key : pairing.pairedKeysToExpectedValues.keySet()) {
        E expected = pairing.pairedKeysToExpectedValues.get(key);
        List<A> got = pairing.pairedKeysToActualValues.get(key);
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### RuleId[ruleID=DuplicateBranchesInSwitch]
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

### RuleId[ruleID=DuplicateBranchesInSwitch]
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

## RuleId[ruleID=FinalPrivateMethod]
### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/IterableOfProtosSubject.java`
#### Snippet
```java
    }

    private final IterableOfProtosUsingCorrespondence<M> usingCorrespondence() {
      return subject.usingCorrespondence();
    }
```

## RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
### RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
Unsynchronized method `getCause()` overrides synchronized method
in `core/src/main/java/com/google/common/truth/AssertionErrorWithFacts.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("UnsynchronizedOverridesSynchronized")
  public Throwable getCause() {
    return cause;
  }
```

### RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
Unsynchronized method `getCause()` overrides synchronized method
in `core/src/main/java/com/google/common/truth/Platform.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("UnsynchronizedOverridesSynchronized")
    public final Throwable getCause() {
      return cause;
    }
```

### RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
Unsynchronized method `getCause()` overrides synchronized method
in `core/src/main/java/com/google/common/truth/Truth.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("UnsynchronizedOverridesSynchronized")
    public Throwable getCause() {
      return cause;
    }
```

### RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
Unsynchronized method `fillInStackTrace()` overrides synchronized method
in `core/src/main/java/com/google/common/truth/ThrowableSubject.java`
#### Snippet
```java
              new Throwable() {
                @Override
                public Throwable fillInStackTrace() {
                  setStackTrace(new StackTraceElement[0]); // for old versions of Android
                  return this;
```

## RuleId[ruleID=StringBufferReplaceableByString]
### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder header` can be replaced with 'String'
in `core/src/main/java/com/google/common/truth/DiffUtils.java`
#### Snippet
```java
      int blockSizeRevised = lineNumRevised - startLineRevised - (next - end - 1);

      StringBuilder header = new StringBuilder();
      header
          .append("@@ -")
```

## RuleId[ruleID=NonShortCircuitBoolean]
### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `seenDerivation |= step.descriptionUpdate != null && step.valuesAreSimila...`
in `core/src/main/java/com/google/common/truth/FailureMetadata.java`
#### Snippet
```java
         * old and new values are "different enough" to be worth both displaying.
         */
        seenDerivation |=
            step.descriptionUpdate != null
                && step.valuesAreSimilar == OldAndNewValuesAreSimilar.DIFFERENT;
        continue;
      }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `seenNewlineInValue |= fact.value.contains("\n")`
in `core/src/main/java/com/google/common/truth/Fact.java`
#### Snippet
```java
        longestKeyLength = max(longestKeyLength, fact.key.length());
        // TODO(cpovirk): Look for other kinds of newlines.
        seenNewlineInValue |= fact.value.contains("\n");
      }
    }
```

## RuleId[ruleID=UnnecessaryToStringCall]
### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeImpl.java`
#### Snippet
```java
      return create(
          FieldScopeLogic.none(),
          Functions.constant(String.format("FieldScopes.fromSetFields(%s)", messages.toString())));
    }

```

## RuleId[ruleID=FinalStaticMethod]
### RuleId[ruleID=FinalStaticMethod]
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

## RuleId[ruleID=WrongPackageStatement]
### RuleId[ruleID=WrongPackageStatement]
Package name 'com.google.common.truth' does not correspond to the file path 'com.google.common.truth.super.com.google.common.truth'
in `core/src/main/java/com/google/common/truth/super/com/google/common/truth/Platform.java`
#### Snippet
```java
 * limitations under the License.
 */
package com.google.common.truth;

import static java.lang.Double.parseDouble;
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `core/src/main/java/com/google/common/truth/GraphMatching.java`
#### Snippet
```java
    }

    private HopcroftKarp(Multimap<U, V> graph) {
      this.graph = graph;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends U`
in `core/src/main/java/com/google/common/truth/GraphMatching.java`
#### Snippet
```java
     *     absent value if the BFS was exhausted without finding any free RHS vertex
     */
    private Optional<Integer> breadthFirstSearch(BiMap<U, V> matching, Map<U, Integer> layers) {
      Queue<U> queue = new ArrayDeque<>();
      Optional<Integer> freeRhsVertexLayer = Optional.absent();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super U`
in `core/src/main/java/com/google/common/truth/GraphMatching.java`
#### Snippet
```java
     *     absent value if the BFS was exhausted without finding any free RHS vertex
     */
    private Optional<Integer> breadthFirstSearch(BiMap<U, V> matching, Map<U, Integer> layers) {
      Queue<U> queue = new ArrayDeque<>();
      Optional<Integer> freeRhsVertexLayer = Optional.absent();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `core/src/main/java/com/google/common/truth/GraphMatching.java`
#### Snippet
```java
    @CanIgnoreReturnValue
    private boolean depthFirstSearch(
        BiMap<U, V> matching, Map<U, Integer> layers, int freeRhsVertexLayer, U lhs) {
      // Note that this differs from the method described in the text of the wikipedia article (at
      // time of writing) in two ways. Firstly, we proceed from a free LHS vertex to a free RHS
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `core/src/main/java/com/google/common/truth/ComparableSubject.java`
#### Snippet
```java

  /** Checks that the subject is <i>not</i> in {@code range}. */
  public final void isNotIn(Range<T> range) {
    if (range.contains(actual)) {
      failWithActual("expected not to be in range", range);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `core/src/main/java/com/google/common/truth/ComparableSubject.java`
#### Snippet
```java

  /** Checks that the subject is in {@code range}. */
  public final void isIn(Range<T> range) {
    if (!range.contains(actual)) {
      failWithActual("expected to be in range", range);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FieldScopeLogic`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeLogic.java`
#### Snippet
```java

    @Override
    IntersectionFieldScopeLogic newLogicOfSameType(List<FieldScopeLogic> newElements) {
      checkArgument(newElements.size() == 2, "Expected 2 elements: %s", newElements);
      return new IntersectionFieldScopeLogic(newElements.get(0), newElements.get(1));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FieldScopeLogic`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeLogic.java`
#### Snippet
```java

    @Override
    UnionFieldScopeLogic newLogicOfSameType(List<FieldScopeLogic> newElements) {
      checkArgument(newElements.size() == 2, "Expected 2 elements: %s", newElements);
      return new UnionFieldScopeLogic(newElements.get(0), newElements.get(1));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FieldScopeLogic`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeLogic.java`
#### Snippet
```java

    @Override
    NegationFieldScopeLogic newLogicOfSameType(List<FieldScopeLogic> newElements) {
      checkArgument(newElements.size() == 1, "Expected 1 element: %s", newElements);
      return new NegationFieldScopeLogic(newElements.get(0));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java
  }

  static <T> Collection<T> iterableToCollection(Iterable<T> iterable) {
    if (iterable instanceof Collection) {
      // Should be safe to assume that any Iterable implementing Collection isn't a one-shot
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java
  }

  static <T> List<T> iterableToList(Iterable<T> iterable) {
    if (iterable instanceof List) {
      return (List<T>) iterable;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java
  }

  private static <T> NonHashingMultiset<T> countDuplicatesToMultiset(Iterable<T> items) {
    // We use avoid hashing in case the elements don't have a proper
    // .hashCode() method (e.g., MessageSet from old versions of protobuf).
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java
  }

  static <T> int countOf(T t, Iterable<T> items) {
    int count = 0;
    for (T item : items) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Number`
in `core/src/main/java/com/google/common/truth/PrimitiveFloatArraySubject.java`
#### Snippet
```java

    FloatArrayAsIterable(
        Correspondence<? super Float, Number> correspondence, IterableSubject subject) {
      super(subject, correspondence);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Number`
in `core/src/main/java/com/google/common/truth/PrimitiveDoubleArraySubject.java`
#### Snippet
```java

    DoubleArrayAsIterable(
        Correspondence<? super Double, Number> correspondence, IterableSubject subject) {
      super(subject, correspondence);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SingularField`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java

      @CanIgnoreReturnValue
      final Builder addAllSingularFields(int fieldNumber, Iterable<SingularField> singularFields) {
        singularFieldsBuilder().putAll(fieldNumber, singularFields);
        return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SingularField`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java

    @CanIgnoreReturnValue
    final Builder addAllSingularFields(int fieldNumber, Iterable<SingularField> singularFields) {
      singularFieldsBuilder().putAll(fieldNumber, singularFields);
      return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super A`
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java
   */
  public static <A, E> Correspondence<A, E> transforming(
      Function<A, ?> actualTransform, Function<E, ?> expectedTransform, String description) {
    return new Transforming<>(actualTransform, expectedTransform, description);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super E`
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java
   */
  public static <A, E> Correspondence<A, E> transforming(
      Function<A, ?> actualTransform, Function<E, ?> expectedTransform, String description) {
    return new Transforming<>(actualTransform, expectedTransform, description);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super A`
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java
   */
  public static <A, E> Correspondence<A, E> transforming(
      Function<A, ? extends E> actualTransform, String description) {
    return new Transforming<>(actualTransform, identity(), description);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Correspondence`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
      double x,
      double y,
      Optional<Correspondence<Number, Number>> correspondence
      ) {
    if (correspondence.isPresent()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Correspondence`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
      float x,
      float y,
      Optional<Correspondence<Number, Number>> correspondence
      ) {
    if (correspondence.isPresent()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Multiset.Entry`
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
  }

  private static boolean containsEmptyOrLong(Iterable<Multiset.Entry<?>> entries) {
    int totalLength = 0;
    for (Multiset.Entry<?> entry : entries) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
     * that all the given indexes really are valid indexes into the list.
     */
    private <T> List<T> findNotIndexed(List<T> list, Set<Integer> indexes) {
      if (indexes.size() == list.size()) {
        // If there are as many distinct valid indexes are there are elements in the list then every
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Multiset.Entry`
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
  }

  private static boolean hasMultiple(Iterable<Multiset.Entry<?>> entries) {
    int totalCount = 0;
    for (Multiset.Entry<?> entry : entries) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Label`
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java

    private static ImmutableSet<Integer> lineNumbers(
        ImmutableList<Label> labels, ImmutableSetMultimap<Label, Integer> lineNumbersAtLabel) {
      for (Label label : labels.reverse()) {
        if (lineNumbersAtLabel.containsKey(label)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Label`
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java

    private static ImmutableSet<Integer> lineNumbers(
        ImmutableList<Label> labels, ImmutableSetMultimap<Label, Integer> lineNumbersAtLabel) {
      for (Label label : labels.reverse()) {
        if (lineNumbersAtLabel.containsKey(label)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Integer`
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
        String name,
        String methodDescriptor,
        ImmutableSetMultimap.Builder<Integer, StackEntry> actualValueAtLine) {
      super(Opcodes.ASM8);
      localVariableSlots = createInitialLocalVariableSlots(access, owner, name, methodDescriptor);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super StackEntry`
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
        String name,
        String methodDescriptor,
        ImmutableSetMultimap.Builder<Integer, StackEntry> actualValueAtLine) {
      super(Opcodes.ASM8);
      localVariableSlots = createInitialLocalVariableSlots(access, owner, name, methodDescriptor);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StackEntry`
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java

    private ImmutableList<StackEntry> appendArrayToList(
        ImmutableList<StackEntry> list, int size, Object[] array) {
      ImmutableList.Builder<StackEntry> builder = ImmutableList.builder();
      builder.addAll(list);
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SubScopeId` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/SubScopeId.java`
#### Snippet
```java

@AutoOneOf(SubScopeId.Kind.class)
abstract class SubScopeId {
  enum Kind {
    FIELD_DESCRIPTOR,
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `WithResultCode` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/RecursableDiffEntity.java`
#### Snippet
```java
   * provided enum instead of any child states.
   */
  abstract static class WithResultCode extends RecursableDiffEntity {
    enum Result {
      /** No differences. The expected case. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `WithoutResultCode` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/RecursableDiffEntity.java`
#### Snippet
```java
   * children. If it has no children, it is considered both matched and ignored.
   */
  abstract static class WithoutResultCode extends RecursableDiffEntity {

    private Boolean isMatched = null;
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `RecursableDiffEntity` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/RecursableDiffEntity.java`
#### Snippet
```java
 * children depends on the implementation - see {@link DiffResult} for concrete instances.
 */
abstract class RecursableDiffEntity {

  // Lazily-initialized return values for the recursive properties of the entity.
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Entry` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeLogicMap.java`
#### Snippet
```java

  @AutoValue
  abstract static class Entry<V> {
    abstract FieldScopeLogic fieldScopeLogic();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UnknownFieldDescriptor` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/UnknownFieldDescriptor.java`
#### Snippet
```java
/** Convenience class encapsulating type information for unknown fields. */
@AutoValue
abstract class UnknownFieldDescriptor {

  enum Type {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `FieldScope` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScope.java`
#### Snippet
```java
 * FieldMask}s, directly in production code.
 */
public abstract class FieldScope {

  /**
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UnknownFieldSetDiff` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
  /** Structural summary of the difference between two unknown field sets. */
  @AutoValue
  abstract static class UnknownFieldSetDiff extends RecursableDiffEntity.WithoutResultCode {
    /** The {@link UnknownFieldSet} being tested. */
    abstract Optional<UnknownFieldSet> actual();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SingularField` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
   */
  @AutoValue
  abstract static class SingularField extends RecursableDiffEntity.WithResultCode
      implements ProtoPrintable {
    /** The type information for this field. May be absent if result code is {@code IGNORED}. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `DiffResult` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
 */
@AutoValue
abstract class DiffResult extends RecursableDiffEntity.WithoutResultCode {

  /**
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `RepeatedField` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
   */
  @AutoValue
  abstract static class RepeatedField extends RecursableDiffEntity.WithoutResultCode {

    /**
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java

  @AutoValue.Builder
  abstract static class Builder {
    abstract Builder setActual(Message actual);

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java

      @AutoValue.Builder
      abstract static class Builder {
        abstract Builder setResult(Result result);

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder {
      abstract Builder setFieldDescriptor(FieldDescriptor fieldDescriptor);

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
    /** Builder for {@link SingularField}. */
    @AutoValue.Builder
    abstract static class Builder {
      abstract Builder setResult(Result result);

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder {
      abstract Builder setActual(UnknownFieldSet actual);

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `PairResult` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
     */
    @AutoValue
    abstract static class PairResult extends RecursableDiffEntity.WithResultCode
        implements ProtoPrintable {
      /** The {@link FieldDescriptor} describing the repeated field for this pair. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `FieldScopeImpl` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeImpl.java`
#### Snippet
```java
 */
@AutoValue
abstract class FieldScopeImpl extends FieldScope {

  //////////////////////////////////////////////////////////////////////////////////////////////////
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FluentEqualityConfig.java`
#### Snippet
```java

  @AutoValue.Builder
  abstract static class Builder {
    abstract Builder setIgnoreFieldAbsenceScope(FieldScopeLogic fieldScopeLogic);

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `FluentEqualityConfig` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FluentEqualityConfig.java`
#### Snippet
```java
 */
@AutoValue
abstract class FluentEqualityConfig implements FieldScopeLogicContainer<FluentEqualityConfig> {

  private static final FluentEqualityConfig DEFAULT_INSTANCE =
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Invocation` has no concrete subclass
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
  @CopyAnnotations
  @GwtIncompatible
  abstract static class Invocation {
    static Builder builder(String name) {
      return new AutoValue_ActualValueInference_Invocation.Builder().setName(name);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `FrameInfo` has no concrete subclass
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
  @CopyAnnotations
  @GwtIncompatible
  abstract static class FrameInfo {

    static FrameInfo create(ImmutableList<StackEntry> locals, ImmutableList<StackEntry> stack) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SubjectEntry` has no concrete subclass
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
  @CopyAnnotations
  @GwtIncompatible
  abstract static class SubjectEntry extends StackEntry {
    @Override
    abstract StackEntry actualValue();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder {
      abstract Builder setReceiver(StackEntry receiver);

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `DescribedEntry` has no concrete subclass
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
  @CopyAnnotations
  @GwtIncompatible
  abstract static class DescribedEntry extends StackEntry {
    @Override
    abstract String description();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `OpaqueEntry` has no concrete subclass
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
  @CopyAnnotations
  @GwtIncompatible
  abstract static class OpaqueEntry extends StackEntry {
    @Override
    public final String toString() {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `StackEntry` has no concrete subclass
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
   * special case, whether {@linkplain SubjectEntry the value is a Truth subject}.
   */
  abstract static class StackEntry {
    abstract InferredType type();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `InferredType` has no concrete subclass
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
  @CopyAnnotations
  @GwtIncompatible
  abstract static class InferredType {

    static final String UNINITIALIZED_PREFIX = "UNINIT@";
```

## RuleId[ruleID=NullableProblems]
### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/ExpectFailure.java`
#### Snippet
```java
  private boolean inRuleContext = false;
  private boolean failureExpected = false;
  private @Nullable AssertionError failure = null;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/AssertionErrorWithFacts.java`
#### Snippet
```java

  /** Separate cause field, in case initCause() fails. */
  private final @Nullable Throwable cause;

  AssertionErrorWithFacts(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/FailureMetadata.java`
#### Snippet
```java
     * but it might try to look at facts initialized by a subclass, which aren't ready yet.
     */
    final @Nullable Subject subject;

    final @Nullable Function<String, String> descriptionUpdate;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/FailureMetadata.java`
#### Snippet
```java

    // Present only when descriptionUpdate is.
    final @Nullable OldAndNewValuesAreSimilar valuesAreSimilar;

    private Step(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/FailureMetadata.java`
#### Snippet
```java
    final @Nullable Subject subject;

    final @Nullable Function<String, String> descriptionUpdate;

    // Present only when descriptionUpdate is.
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/Fact.java`
#### Snippet
```java

  final String key;
  final @Nullable String value;

  private Fact(String key, @Nullable String value) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/MapSubject.java`
#### Snippet
```java
    private final Map<?, ?> expectedMap;
    private final boolean allowUnexpected;
    private final @Nullable Correspondence<?, ?> correspondence;

    MapInOrder(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/Platform.java`
#### Snippet
```java

    /** Separate cause field, in case initCause() fails. */
    private final @Nullable Throwable cause;

    PlatformComparisonFailure(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/Truth.java`
#### Snippet
```java
  static final class SimpleAssertionError extends AssertionError {
    /** Separate cause field, in case initCause() fails. */
    private final @Nullable Throwable cause;

    private SimpleAssertionError(String message, @Nullable Throwable cause) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
        new ComparisonResult(ImmutableList.<Fact>of());

    private final @Nullable ImmutableList<Fact> facts;

    private ComparisonResult(ImmutableList<Fact> facts) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
  private final Object actual;
  private String customName = null;
  private final @Nullable String typeDescriptionOverride;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/IterableOfProtosSubject.java`
#### Snippet
```java
      implements IterableOfProtosUsingCorrespondence<M> {
    private final IterableOfProtosSubject<M> subject;
    private final @Nullable Function<? super M, ? extends Object> keyFunction;

    UsingCorrespondence(
```

## RuleId[ruleID=UnnecessaryInitCause]
### RuleId[ruleID=UnnecessaryInitCause]
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

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
Result of `Builder.setUnknownFields()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
      UnknownFieldSetDiff diff =
          diffUnknowns(actual.getUnknownFields(), expected.getUnknownFields(), config);
      builder.setUnknownFields(diff);
    }

```

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
Result of `Builder.setUnknownFields()` is ignored
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
      UnknownFieldSetDiff diff =
          diffUnknowns(actual.getUnknownFields(), expected.getUnknownFields(), config);
      builder.setUnknownFields(diff);
    }

```

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
Result of `Builder.setActualValue()` is ignored
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java

          if (isThatOrAssertThat(owner, name)) {
            invocation.setActualValue(getOperandFromTop(0));
          } else if (isBoxing(owner, name, desc)) {
            invocation.setBoxingInput(
```

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
Result of `Builder.setReceiver()` is ignored
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java

          if (opcode != Opcodes.INVOKESTATIC) {
            invocation.setReceiver(pop());
          }

```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'actual'
in `core/src/main/java/com/google/common/truth/GuavaOptionalSubject.java`
#### Snippet
```java

  GuavaOptionalSubject(
      FailureMetadata metadata, @Nullable Optional<?> actual, @Nullable String typeDescription) {
    super(metadata, actual, typeDescription);
    this.actual = actual;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'actual'
in `core/src/main/java/com/google/common/truth/GuavaOptionalSubject.java`
#### Snippet
```java
 */
public final class GuavaOptionalSubject extends Subject {
  private final Optional<?> actual;

  GuavaOptionalSubject(
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`OptionalDouble` used as type for field 'actual'
in `extensions/java8/src/main/java/com/google/common/truth/OptionalDoubleSubject.java`
#### Snippet
```java
public final class OptionalDoubleSubject extends Subject {

  private final OptionalDouble actual;

  OptionalDoubleSubject(
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
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

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
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

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`OptionalLong` used as type for field 'actual'
in `extensions/java8/src/main/java/com/google/common/truth/OptionalLongSubject.java`
#### Snippet
```java
 */
public final class OptionalLongSubject extends Subject {
  private final OptionalLong actual;

  OptionalLongSubject(
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`OptionalInt` used as type for field 'actual'
in `extensions/java8/src/main/java/com/google/common/truth/OptionalIntSubject.java`
#### Snippet
```java
 */
public final class OptionalIntSubject extends Subject {
  private final OptionalInt actual;

  OptionalIntSubject(
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
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

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'actual'
in `extensions/java8/src/main/java/com/google/common/truth/OptionalSubject.java`
#### Snippet
```java
 */
public final class OptionalSubject extends Subject {
  private final Optional<?> actual;

  OptionalSubject(
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
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

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'descriptor'
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScope.java`
#### Snippet
```java
   *     if present. Used to pretty-print raw field numbers.
   */
  abstract String usingCorrespondenceString(Optional<Descriptor> descriptor);
}

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'actual'
in `core/src/main/java/com/google/common/truth/Truth.java`
#### Snippet
```java
  }

  public static GuavaOptionalSubject assertThat(@Nullable Optional<?> actual) {
    return assert_().that(actual);
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
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

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'homogeneousTypeToDisplay'
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java

    DuplicateGroupedAndTyped(
        NonHashingMultiset<?> valuesAndMaybeTypes, Optional<String> homogeneousTypeToDisplay) {
      this.valuesAndMaybeTypes = valuesAndMaybeTypes;
      this.homogeneousTypeToDisplay = homogeneousTypeToDisplay;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'homogeneousTypeToDisplay'
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java
  static final class DuplicateGroupedAndTyped {
    final NonHashingMultiset<?> valuesAndMaybeTypes;
    final Optional<String> homogeneousTypeToDisplay;

    DuplicateGroupedAndTyped(
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`OptionalDouble` used as type for parameter 'target'
in `extensions/java8/src/main/java/com/google/common/truth/Truth8.java`
#### Snippet
```java
  }

  public static OptionalDoubleSubject assertThat(@Nullable OptionalDouble target) {
    return assertAbout(OptionalDoubleSubject.optionalDoubles()).that(target);
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`OptionalInt` used as type for parameter 'target'
in `extensions/java8/src/main/java/com/google/common/truth/Truth8.java`
#### Snippet
```java
  }

  public static OptionalIntSubject assertThat(@Nullable OptionalInt target) {
    return assertAbout(OptionalIntSubject.optionalInts()).that(target);
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`OptionalLong` used as type for parameter 'target'
in `extensions/java8/src/main/java/com/google/common/truth/Truth8.java`
#### Snippet
```java
  }

  public static OptionalLongSubject assertThat(@Nullable OptionalLong target) {
    return assertAbout(OptionalLongSubject.optionalLongs()).that(target);
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'target'
in `extensions/java8/src/main/java/com/google/common/truth/Truth8.java`
#### Snippet
```java
 */
public final class Truth8 {
  public static OptionalSubject assertThat(@Nullable Optional<?> target) {
    return assertAbout(OptionalSubject.optionals()).that(target);
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'actual'
in `core/src/main/java/com/google/common/truth/StandardSubjectBuilder.java`
#### Snippet
```java
  }

  public final GuavaOptionalSubject that(@Nullable Optional<?> actual) {
    return new GuavaOptionalSubject(metadata(), actual, "optional");
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'fieldIndex'
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
      }

      private static String indexed(String fieldPrefix, Optional<Integer> fieldIndex) {
        String index = fieldIndex.isPresent() ? fieldIndex.get().toString() : "?";
        return fieldPrefix + "[" + index + "]";
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
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

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
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

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'pairer'
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
    private final IterableSubject subject;
    private final Correspondence<? super A, ? super E> correspondence;
    private final Optional<Pairer> pairer;

    UsingCorrespondence(
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'optDescriptor'
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FluentEqualityConfig.java`
#### Snippet
```java

  final <M extends Message> Correspondence<M, M> toCorrespondence(
      final Optional<Descriptor> optDescriptor) {
    checkState(hasExpectedMessages(), "withExpectedMessages() not called");
    return Correspondence.from(
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'descriptor'
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FluentEqualityConfig.java`
#### Snippet
```java
  abstract Function<? super Optional<Descriptor>, String> usingCorrespondenceStringFunction();

  final String usingCorrespondenceString(Optional<Descriptor> descriptor) {
    return usingCorrespondenceStringFunction().apply(descriptor);
  }
```

## RuleId[ruleID=UnnecessaryUnboxing]
### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `core/src/main/java/com/google/common/truth/FloatSubject.java`
#### Snippet
```java
  /** Asserts that the subject is zero (i.e. it is either {@code 0.0f} or {@code -0.0f}). */
  public final void isZero() {
    if (actual == null || actual.floatValue() != 0.0f) {
      failWithActual(simpleFact("expected zero"));
    }
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `core/src/main/java/com/google/common/truth/FloatSubject.java`
#### Snippet
```java
    if (actual == null) {
      failWithActual(simpleFact("expected a float other than zero"));
    } else if (actual.floatValue() == 0.0f) {
      failWithActual(simpleFact("expected not to be zero"));
    }
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `core/src/main/java/com/google/common/truth/DoubleSubject.java`
#### Snippet
```java
    if (actual == null) {
      failWithActual(simpleFact("expected a double other than zero"));
    } else if (actual.doubleValue() == 0.0) {
      failWithActual(simpleFact("expected not to be zero"));
    }
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `core/src/main/java/com/google/common/truth/DoubleSubject.java`
#### Snippet
```java
  /** Asserts that the subject is zero (i.e. it is either {@code 0.0} or {@code -0.0}). */
  public final void isZero() {
    if (actual == null || actual.doubleValue() != 0.0) {
      failWithActual(simpleFact("expected zero"));
    }
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
  private static long integralValue(Object o) {
    if (o instanceof Character) {
      return (long) ((Character) o).charValue();
    } else if (o instanceof Number) {
      return ((Number) o).longValue();
```

## RuleId[ruleID=RedundantMethodOverride]
### RuleId[ruleID=RedundantMethodOverride]
Method `isEqualTo()` only delegates to its super method
in `core/src/main/java/com/google/common/truth/BigDecimalSubject.java`
#### Snippet
```java
   */
  @Override // To express more specific javadoc
  public void isEqualTo(@Nullable Object expected) {
    super.isEqualTo(expected);
  }
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Factory` is the same as one of its superclass' names
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoSubjectBuilder.java`
#### Snippet
```java

  /** Factory for ProtoSubjectBuilder. */
  private static class Factory implements CustomSubjectBuilder.Factory<ProtoSubjectBuilder> {
    private static final Factory INSTANCE = new Factory();

```

## RuleId[ruleID=OptionalAssignedToNull]
### RuleId[ruleID=OptionalAssignedToNull]
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

### RuleId[ruleID=OptionalAssignedToNull]
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

### RuleId[ruleID=OptionalAssignedToNull]
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

### RuleId[ruleID=OptionalAssignedToNull]
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

### RuleId[ruleID=OptionalAssignedToNull]
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

### RuleId[ruleID=OptionalAssignedToNull]
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

### RuleId[ruleID=OptionalAssignedToNull]
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

### RuleId[ruleID=OptionalAssignedToNull]
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

### RuleId[ruleID=OptionalAssignedToNull]
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

### RuleId[ruleID=OptionalAssignedToNull]
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

### RuleId[ruleID=OptionalAssignedToNull]
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

### RuleId[ruleID=OptionalAssignedToNull]
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

### RuleId[ruleID=OptionalAssignedToNull]
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

### RuleId[ruleID=OptionalAssignedToNull]
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

### RuleId[ruleID=OptionalAssignedToNull]
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

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/common/truth/Expect.java`
#### Snippet
```java
    private static void appendIndented(int countLength, StringBuilder builder, String toAppend) {
      int indent = countLength + 4; // "  " and ". "
      builder.append(toAppend.replace("\n", "\n" + repeat(" ", indent)));
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/common/truth/Expect.java`
#### Snippet
```java
      String s = Throwables.getStackTraceAsString(e);
      // Force single line reluctant matching
      return s.replaceFirst("(?s)^.*?__EXCEPTION_MARKER__.*?Caused by:\\s+", "");
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/common/truth/Fact.java`
#### Snippet
```java
    // We don't want to indent with \t\t because it would be very far for people with 8-space tabs.
    // Let's compromise and indent by 4 spaces, which is different than both 2- and 8-space tabs.
    return "    " + value.replaceAll("\n", "\n    ");
  }
}
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
     * "BarSubject," so we strip any likely enclosing type ourselves.
     */
    String subjectClass = clazz.getSimpleName().replaceFirst(".*[$]", "");
    String actualClass =
        (subjectClass.endsWith("Subject") && !subjectClass.equals("Subject"))
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/MapWithProtoValuesFluentAssertion.java`
#### Snippet
```java
 * <p>The <b>keys</b> of these maps are treated as ordinary objects, and keys which happen to be
 * protocol buffers are not given special treatment. They are compared with {@link Object#equals}
 * and {@link Object#hashCode()} as documented by the {@link java.util.Map} interface.
 *
 * <p>Methods may be chained in any order, but the chain should terminate with a method that doesn't
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.re2j` is unnecessary and can be removed
in `extensions/re2j/src/main/java/com/google/common/truth/extensions/re2j/Re2jSubjects.java`
#### Snippet
```java
  /**
   * Subject for {@link String} subjects which you can use to assert things about {@link
   * com.google.re2j.Pattern} regexes.
   *
   * @see #re2jString
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.re2j` is unnecessary and can be removed
in `extensions/re2j/src/main/java/com/google/common/truth/extensions/re2j/Re2jSubjects.java`
#### Snippet
```java
  /**
   * Returns a subject factory for {@link String} subjects which you can use to assert things about
   * {@link com.google.re2j.Pattern} regexes.
   *
   * <p>This subject does not replace Truth's built-in {@link com.google.common.truth.StringSubject}
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`c = (char) (c >>> 4)` could be simplified to 'c \>\>\>= 4'
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
    r[1] = 'u';
    r[5] = HEX_DIGITS[c & 0xF];
    c = (char) (c >>> 4);
    r[4] = HEX_DIGITS[c & 0xF];
    c = (char) (c >>> 4);
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`c = (char) (c >>> 4)` could be simplified to 'c \>\>\>= 4'
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
    c = (char) (c >>> 4);
    r[4] = HEX_DIGITS[c & 0xF];
    c = (char) (c >>> 4);
    r[3] = HEX_DIGITS[c & 0xF];
    c = (char) (c >>> 4);
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`c = (char) (c >>> 4)` could be simplified to 'c \>\>\>= 4'
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
    c = (char) (c >>> 4);
    r[3] = HEX_DIGITS[c & 0xF];
    c = (char) (c >>> 4);
    r[2] = HEX_DIGITS[c & 0xF];
    return r;
```

## RuleId[ruleID=Anonymous2MethodRef]
### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new FailureStrategy() can be replaced with method reference
in `core/src/main/java/com/google/common/truth/ExpectFailure.java`
#### Snippet
```java
public final class ExpectFailure implements Platform.JUnitTestRule {
  private final FailureStrategy strategy =
      new FailureStrategy() {
        @Override
        public void fail(AssertionError failure) {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new Subject.Factory() can be replaced with method reference
in `extensions/re2j/src/main/java/com/google/common/truth/extensions/re2j/Re2jSubjects.java`
#### Snippet
```java
  public static final class Re2jStringSubject extends Subject {
    private static final Subject.Factory<Re2jStringSubject, String> FACTORY =
        new Subject.Factory<Re2jStringSubject, String>() {
          @Override
          public Re2jStringSubject createSubject(FailureMetadata failureMetadata, String target) {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new Factory\>() can be replaced with method reference
in `core/src/main/java/com/google/common/truth/PrimitiveFloatArraySubject.java`
#### Snippet
```java
   */
  private Factory<IterableSubject, Iterable<?>> iterablesWithCustomFloatToString() {
    return new Factory<IterableSubject, Iterable<?>>() {
      @Override
      public IterableSubject createSubject(FailureMetadata metadata, Iterable<?> actual) {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new Factory\>() can be replaced with method reference
in `core/src/main/java/com/google/common/truth/PrimitiveDoubleArraySubject.java`
#### Snippet
```java
   */
  private Factory<IterableSubject, Iterable<?>> iterablesWithCustomDoubleToString() {
    return new Factory<IterableSubject, Iterable<?>>() {
      @Override
      public IterableSubject createSubject(FailureMetadata metadata, Iterable<?> actual) {
```

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
The method is empty
in `core/src/main/java/com/google/common/truth/super/com/google/common/truth/Platform.java`
#### Snippet
```java
  }

  static void cleanStackTrace(Throwable throwable) {
    // Do nothing. See notes in StackTraceCleanerTest.
  }
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScope.java`
#### Snippet
```java

  /** Returns the underlying logical implementation of the {@link FieldScope}. */
  abstract FieldScopeLogic logic();

  /**
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `core/src/main/java/com/google/common/truth/ExpectFailure.java`
#### Snippet
```java
  private boolean inRuleContext = false;
  private boolean failureExpected = false;
  private @Nullable AssertionError failure = null;

  /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/common/truth/ExpectFailure.java`
#### Snippet
```java

  private boolean inRuleContext = false;
  private boolean failureExpected = false;
  private @Nullable AssertionError failure = null;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/common/truth/ExpectFailure.java`
#### Snippet
```java
      };

  private boolean inRuleContext = false;
  private boolean failureExpected = false;
  private @Nullable AssertionError failure = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `core/src/main/java/com/google/common/truth/DiffUtils.java`
#### Snippet
```java
  private final List<String> reducedUnifiedDiff = new ArrayList<>();
  private int offsetHead = 0;
  private int offsetTail = 0;

  private List<String> diff(
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `core/src/main/java/com/google/common/truth/DiffUtils.java`
#### Snippet
```java
  private final List<Integer> unifiedDiffContentId = new ArrayList<>();
  private final List<String> reducedUnifiedDiff = new ArrayList<>();
  private int offsetHead = 0;
  private int offsetTail = 0;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/RecursableDiffEntity.java`
#### Snippet
```java

    private Boolean isMatched = null;
    private Boolean isIgnored = null;

    @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/RecursableDiffEntity.java`
#### Snippet
```java
  // inheritance, than to duplicate the @Memoized methods for every subclass.

  private Boolean isAnyChildIgnored = null;
  private Boolean isAnyChildMatched = null;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/RecursableDiffEntity.java`
#### Snippet
```java

  private Boolean isAnyChildIgnored = null;
  private Boolean isAnyChildMatched = null;

  // Only extended by inner classes.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/RecursableDiffEntity.java`
#### Snippet
```java
  abstract static class WithoutResultCode extends RecursableDiffEntity {

    private Boolean isMatched = null;
    private Boolean isIgnored = null;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `core/src/main/java/com/google/common/truth/StackTraceCleaner.java`
#### Snippet
```java
  private StackTraceElementWrapper lastStackFrameElementWrapper = null;
  private StackFrameType currentStreakType = null;
  private int currentStreakLength = 0;

  /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `core/src/main/java/com/google/common/truth/StackTraceCleaner.java`
#### Snippet
```java
  private final Throwable throwable;
  private final List<StackTraceElementWrapper> cleanedStackTrace = new ArrayList<>();
  private StackTraceElementWrapper lastStackFrameElementWrapper = null;
  private StackFrameType currentStreakType = null;
  private int currentStreakLength = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `core/src/main/java/com/google/common/truth/StackTraceCleaner.java`
#### Snippet
```java
  private final List<StackTraceElementWrapper> cleanedStackTrace = new ArrayList<>();
  private StackTraceElementWrapper lastStackFrameElementWrapper = null;
  private StackFrameType currentStreakType = null;
  private int currentStreakLength = 0;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
  private final FailureMetadata metadata;
  private final Object actual;
  private String customName = null;
  private final @Nullable String typeDescriptionOverride;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java

    private final String argumentLabel;
    private StoredException firstCompareException = null;
    private StoredException firstPairingException = null;
    private StoredException firstFormatDiffException = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java
    private final String argumentLabel;
    private StoredException firstCompareException = null;
    private StoredException firstPairingException = null;
    private StoredException firstFormatDiffException = null;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java
    private StoredException firstCompareException = null;
    private StoredException firstPairingException = null;
    private StoredException firstFormatDiffException = null;

    static ExceptionStore forIterable() {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java

  private static final class InferenceMethodVisitor extends MethodVisitor {
    private boolean used = false;
    private final ArrayList<StackEntry> localVariableSlots;
    private final ArrayList<StackEntry> operandStack = new ArrayList<>();
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `originalLines`
in `core/src/main/java/com/google/common/truth/DiffUtils.java`
#### Snippet
```java
      List<String> originalLines, List<String> revisedLines, int contextSize) {
    reduceEqualLinesFromHeadAndTail(originalLines, revisedLines, contextSize);
    originalLines = originalLines.subList(offsetHead, originalLines.size() - offsetTail);
    revisedLines = revisedLines.subList(offsetHead, revisedLines.size() - offsetTail);

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `revisedLines`
in `core/src/main/java/com/google/common/truth/DiffUtils.java`
#### Snippet
```java
    reduceEqualLinesFromHeadAndTail(originalLines, revisedLines, contextSize);
    originalLines = originalLines.subList(offsetHead, originalLines.size() - offsetTail);
    revisedLines = revisedLines.subList(offsetHead, revisedLines.size() - offsetTail);

    original = new int[originalLines.size() + 1];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `i`
in `core/src/main/java/com/google/common/truth/DiffUtils.java`
#### Snippet
```java
        unifiedDiffType.add(' ');
        unifiedDiffContentId.add(original[i]);
        i--;
        j--;
      } else if (j > 0 && (i == 0 || lcs[i][j - 1] >= lcs[i - 1][j])) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `j`
in `core/src/main/java/com/google/common/truth/DiffUtils.java`
#### Snippet
```java
        unifiedDiffContentId.add(original[i]);
        i--;
        j--;
      } else if (j > 0 && (i == 0 || lcs[i][j - 1] >= lcs[i - 1][j])) {
        unifiedDiffType.add('+');
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `j`
in `core/src/main/java/com/google/common/truth/DiffUtils.java`
#### Snippet
```java
        unifiedDiffType.add('+');
        unifiedDiffContentId.add(revised[j]);
        j--;
      } else if (i > 0 && (j == 0 || lcs[i][j - 1] < lcs[i - 1][j])) {
        unifiedDiffType.add('-');
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `i`
in `core/src/main/java/com/google/common/truth/DiffUtils.java`
#### Snippet
```java
        unifiedDiffType.add('-');
        unifiedDiffContentId.add(original[i]);
        i--;
      }
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `subclass`
in `core/src/main/java/com/google/common/truth/StackTraceCleaner.java`
#### Snippet
```java

  private static boolean isSubtypeOf(Class<?> subclass, String superclass) {
    for (; subclass != null; subclass = subclass.getSuperclass()) {
      if (subclass.getCanonicalName() != null && subclass.getCanonicalName().equals(superclass)) {
        return true;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
    r[1] = 'u';
    r[5] = HEX_DIGITS[c & 0xF];
    c = (char) (c >>> 4);
    r[4] = HEX_DIGITS[c & 0xF];
    c = (char) (c >>> 4);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
    c = (char) (c >>> 4);
    r[4] = HEX_DIGITS[c & 0xF];
    c = (char) (c >>> 4);
    r[3] = HEX_DIGITS[c & 0xF];
    c = (char) (c >>> 4);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
    c = (char) (c >>> 4);
    r[3] = HEX_DIGITS[c & 0xF];
    c = (char) (c >>> 4);
    r[2] = HEX_DIGITS[c & 0xF];
    return r;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `expected`
in `core/src/main/java/com/google/common/truth/ComparisonFailures.java`
#### Snippet
```java
    // No need to hide the prefix unless it's long.
    if (prefix > 3) {
      expected = "…" + expected.substring(prefix);
      actual = "…" + actual.substring(prefix);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `actual`
in `core/src/main/java/com/google/common/truth/ComparisonFailures.java`
#### Snippet
```java
    if (prefix > 3) {
      expected = "…" + expected.substring(prefix);
      actual = "…" + actual.substring(prefix);
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `expected`
in `core/src/main/java/com/google/common/truth/ComparisonFailures.java`
#### Snippet
```java
    // No need to hide the suffix unless it's long.
    if (suffix > 3) {
      expected = expected.substring(0, expected.length() - suffix) + "…";
      actual = actual.substring(0, actual.length() - suffix) + "…";
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `actual`
in `core/src/main/java/com/google/common/truth/ComparisonFailures.java`
#### Snippet
```java
    if (suffix > 3) {
      expected = expected.substring(0, expected.length() - suffix) + "…";
      actual = actual.substring(0, actual.length() - suffix) + "…";
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `fieldPrefix`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
    @Override
    final void printContents(boolean includeMatches, String fieldPrefix, StringBuilder sb) {
      fieldPrefix = newFieldPrefix(fieldPrefix, fieldDescriptor().getName());
      for (PairResult pairResult : pairResults()) {
        pairResult.printContentsForRepeatedField(
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `fieldPrefix`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
      }

      fieldPrefix = newFieldPrefix(fieldPrefix, fieldName());
      switch (result()) {
        case ADDED:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `actual`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    @Nullable UnknownFieldSetDiff unknownsBreakdown = null;
    if (result.build() == Result.MATCHED || excludeNonRecursive) {
      actual = firstNonNull(actual, UnknownFieldSet.getDefaultInstance());
      expected = firstNonNull(expected, UnknownFieldSet.getDefaultInstance());

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `expected`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    if (result.build() == Result.MATCHED || excludeNonRecursive) {
      actual = firstNonNull(actual, UnknownFieldSet.getDefaultInstance());
      expected = firstNonNull(expected, UnknownFieldSet.getDefaultInstance());

      unknownsBreakdown = diffUnknowns(actual, expected, config);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `actual`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    boolean ignoreFieldAbsence =
        config.ignoreFieldAbsenceScope().contains(rootDescriptor, SubScopeId.of(fieldDescriptor));
    actual = orIfIgnoringFieldAbsence(actual, defaultValue, ignoreFieldAbsence);
    expected = orIfIgnoringFieldAbsence(expected, defaultValue, ignoreFieldAbsence);

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `expected`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
        config.ignoreFieldAbsenceScope().contains(rootDescriptor, SubScopeId.of(fieldDescriptor));
    actual = orIfIgnoringFieldAbsence(actual, defaultValue, ignoreFieldAbsence);
    expected = orIfIgnoringFieldAbsence(expected, defaultValue, ignoreFieldAbsence);

    // If actual or expected is missing here, we know our result so long as it's not ignored.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `actual`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    @Nullable DiffResult breakdown = null;
    if (result.build() == Result.MATCHED || excludeNonRecursive) {
      actual = orDefaultForType(actual, expected);
      expected = orDefaultForType(expected, actual);

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `expected`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    if (result.build() == Result.MATCHED || excludeNonRecursive) {
      actual = orDefaultForType(actual, expected);
      expected = orDefaultForType(expected, actual);

      breakdown = diffMessages(actual, expected, config);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `actual`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
        isNonRepeatedProto3
            || config.ignoreFieldAbsenceScope().contains(rootDescriptor, subScopeId);
    actual = orIfIgnoringFieldAbsence(actual, defaultValue, ignoreFieldAbsence);
    expected = orIfIgnoringFieldAbsence(expected, defaultValue, ignoreFieldAbsence);

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `expected`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
            || config.ignoreFieldAbsenceScope().contains(rootDescriptor, subScopeId);
    actual = orIfIgnoringFieldAbsence(actual, defaultValue, ignoreFieldAbsence);
    expected = orIfIgnoringFieldAbsence(expected, defaultValue, ignoreFieldAbsence);

    // If actual or expected is missing here, we know our result.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `countToRemove`
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
        }
        --index; // Eat this local variable.
        --countToRemove;
      }
      checkState(
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/common/truth/Platform.java`
#### Snippet
```java
               */
            } catch (ClassNotFoundException notAvailable) {
              return null;
            }
          });
```

## RuleId[ruleID=InstanceofCatchParameter]
### RuleId[ruleID=InstanceofCatchParameter]
'instanceof' on 'catch' parameter `e`
in `core/src/main/java/com/google/common/truth/StackTraceCleaner.java`
#### Snippet
```java
        return false;
      }
      if (e instanceof IncompatibleClassChangeError) {
        // OEM class-loading bug? https://issuetracker.google.com/issues/37045084
        return false;
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `core/src/main/java/com/google/common/truth/Platform.java`
#### Snippet
```java
      return (Throwable[]) getSuppressed.invoke(throwable);
    } catch (NoSuchMethodException e) {
      return new Throwable[0];
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `core/src/main/java/com/google/common/truth/Truth.java`
#### Snippet
```java
    static SimpleAssertionError createWithNoStack(String message, @Nullable Throwable cause) {
      SimpleAssertionError error = create(message, cause);
      error.setStackTrace(new StackTraceElement[0]);
      return error;
    }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `core/src/main/java/com/google/common/truth/ThrowableSubject.java`
#### Snippet
```java
                @Override
                public Throwable fillInStackTrace() {
                  setStackTrace(new StackTraceElement[0]); // for old versions of Android
                  return this;
                }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
  @Deprecated
  final void fail(String check) {
    fail(check, new Object[0]);
  }

```

## RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
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

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
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

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
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

## RuleId[ruleID=TypeParameterExtendsObject]
### RuleId[ruleID=TypeParameterExtendsObject]
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

### RuleId[ruleID=TypeParameterExtendsObject]
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/IterableOfProtosSubject.java`
#### Snippet
```java
      implements IterableOfProtosUsingCorrespondence<M> {
    private final IterableOfProtosSubject<M> subject;
    private final @Nullable Function<? super M, ? extends Object> keyFunction;

    UsingCorrespondence(
```

## RuleId[ruleID=NonExceptionNameEndsWithException]
### RuleId[ruleID=NonExceptionNameEndsWithException]
Non-exception class name `StoredException` ends with 'Exception'
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java
  public abstract boolean compare(A actual, E expected);

  private static class StoredException {

    private static final Joiner ARGUMENT_JOINER = Joiner.on(", ").useForNull("null");
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
    @Memoized
    Object actualOrExpected() {
      return actual().or(expected()).get();
    }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

## RuleId[ruleID=UnstableApiUsage]
### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeLogicMap.java`
#### Snippet
```java
 * An immutable map of {@link FieldScopeLogic} to an arbitrary value type.
 *
 * <p>This is the field-path based analog to {@link com.google.common.collect.RangeMap}. Setting a
 * value {@code v} for a {@link FieldScopeLogic} {@code l} on the {@code FieldScopeLogicMap} means
 * that, for any field path {@code f} contained in {@code l}, the value mapped to {@code f} is
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeLogicMap.java`
#### Snippet
```java
 * {@code v}. This overrides any previous {FieldScopeLogic -> value} pairs/mappings.
 *
 * <p>Unlike {@link com.google.common.collect.RangeMap}, this class does not support analysis of its
 * internals, only {@link #get} operations, and it is not performant. All {@code get} and {@code
 * with} operations are O(N), where N = number of mappings, so this class is intended only for small
```

### RuleId[ruleID=UnstableApiUsage]
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeLogicMap.java`
#### Snippet
```java
  public FieldScopeLogicMap<V> subScope(Descriptor rootDescriptor, SubScopeId subScopeId) {
    ImmutableList.Builder<Entry<V>> newEntries =
        ImmutableList.builderWithExpectedSize(entries.size());
    for (Entry<V> entry : entries) {
      newEntries.add(
```

### RuleId[ruleID=UnstableApiUsage]
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeLogic.java`
#### Snippet
```java
    final FieldScopeLogic subScopeImpl(Descriptor rootDescriptor, SubScopeId subScopeId) {
      ImmutableList.Builder<FieldScopeLogic> builder =
          ImmutableList.builderWithExpectedSize(elements.size());
      for (FieldScopeLogic elem : elements) {
        builder.add(elem.subScope(rootDescriptor, subScopeId));
```

### RuleId[ruleID=UnstableApiUsage]
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
    // Assemble the diffs in field number order so it most closely matches the schema.
    ImmutableList.Builder<RecursableDiffEntity> builder =
        ImmutableList.builderWithExpectedSize(
            singularFields().size() + repeatedFields().size() + unknownFields().asSet().size());
    Set<Integer> fieldNumbers = Sets.union(singularFields().keySet(), repeatedFields().keySet());
```

### RuleId[ruleID=UnstableApiUsage]
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
      FluentEqualityConfig config) {
    int maxSize = Math.max(actualValues.size(), expectedValues.size());
    ImmutableList.Builder<SingularField> builder = ImmutableList.builderWithExpectedSize(maxSize);
    for (int i = 0; i < maxSize; i++) {
      @Nullable Object actual = actualValues.size() > i ? actualValues.get(i) : null;
```

### RuleId[ruleID=UnstableApiUsage]
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
      FluentEqualityConfig config) {
    int maxSize = Math.max(actualList.size(), expectedList.size());
    ImmutableList.Builder<SingularField> builder = ImmutableList.builderWithExpectedSize(maxSize);
    for (int i = 0; i < maxSize; i++) {
      @Nullable Object actual = actualList.size() > i ? actualList.get(i) : null;
```

### RuleId[ruleID=UnstableApiUsage]
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java

    ImmutableList.Builder<SingularField> builder =
        ImmutableList.builderWithExpectedSize(actualAndExpectedKeys.size());
    for (Object key : actualAndExpectedKeys) {
      @Nullable Object actualValue = actualMap.get(key);
```

