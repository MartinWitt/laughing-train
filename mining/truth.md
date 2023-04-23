# truth 
 
# Bad smells
I found 326 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 48 | false |
| BoundedWildcard | 30 | false |
| AbstractClassNeverImplemented | 28 | false |
| OptionalUsedAsFieldOrParameterType | 26 | false |
| AssignmentToMethodParameter | 25 | false |
| OptionalGetWithoutIsPresent | 23 | false |
| IgnoreResultOfCall | 21 | false |
| RedundantFieldInitialization | 16 | false |
| DataFlowIssue | 15 | false |
| OptionalAssignedToNull | 15 | false |
| UnstableApiUsage | 8 | false |
| DeprecatedIsStillUsed | 5 | false |
| KeySetIterationMayUseEntrySet | 5 | false |
| UnnecessaryUnboxing | 5 | false |
| RedundantMethodOverride | 5 | false |
| UnnecessarySemicolon | 4 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 4 | false |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| ZeroLengthArrayInitialization | 4 | false |
| UnnecessaryFullyQualifiedName | 3 | false |
| ReplaceAssignmentWithOperatorAssignment | 3 | false |
| EqualsWhichDoesntCheckParameterClass | 3 | false |
| UnnecessaryModifier | 2 | true |
| DuplicateBranchesInSwitch | 2 | false |
| NonShortCircuitBoolean | 2 | false |
| EmptyMethod | 2 | false |
| TypeParameterExtendsObject | 2 | false |
| ConstantValue | 2 | false |
| OptionalIsPresent | 1 | false |
| StaticPseudoFunctionalStyleMethod | 1 | false |
| FinalPrivateMethod | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| FinalStaticMethod | 1 | false |
| TrivialStringConcatenation | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| WrongPackageStatement | 1 | false |
| UnnecessaryInitCause | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| UNUSED_IMPORT | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| InstanceofCatchParameter | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
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

## RuleId[id=UnnecessarySemicolon]
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

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `other` might be null
in `core/src/main/java/com/google/common/truth/ComparableSubject.java`
#### Snippet
```java
   */
  public final void isAtLeast(@Nullable T other) {
    if (checkNotNull(actual).compareTo(other) < 0) {
      failWithActual("expected to be at least", other);
    }
```

### DataFlowIssue
Argument `other` might be null
in `core/src/main/java/com/google/common/truth/ComparableSubject.java`
#### Snippet
```java
   */
  public final void isLessThan(@Nullable T other) {
    if (checkNotNull(actual).compareTo(other) >= 0) {
      failWithActual("expected to be less than", other);
    }
```

### DataFlowIssue
Argument `other` might be null
in `core/src/main/java/com/google/common/truth/ComparableSubject.java`
#### Snippet
```java
   */
  public final void isGreaterThan(@Nullable T other) {
    if (checkNotNull(actual).compareTo(other) <= 0) {
      failWithActual("expected to be greater than", other);
    }
```

### DataFlowIssue
Argument `expected` might be null
in `core/src/main/java/com/google/common/truth/ComparableSubject.java`
#### Snippet
```java
   */
  public void isEquivalentAccordingToCompareTo(@Nullable T expected) {
    if (checkNotNull(actual).compareTo(expected) != 0) {
      failWithActual("expected value that sorts equal to", expected);
    }
```

### DataFlowIssue
Argument `other` might be null
in `core/src/main/java/com/google/common/truth/ComparableSubject.java`
#### Snippet
```java
   */
  public final void isAtMost(@Nullable T other) {
    if (checkNotNull(actual).compareTo(other) > 0) {
      failWithActual("expected to be at most", other);
    }
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

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java

    Iterable<Multiset.Entry<?>> entrySet() {
      return transform(contents.entrySet(), this::unwrapKey);
    }

```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
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

### KeySetIterationMayUseEntrySet
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

### KeySetIterationMayUseEntrySet
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

### KeySetIterationMayUseEntrySet
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

### KeySetIterationMayUseEntrySet
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

## RuleId[id=DuplicateBranchesInSwitch]
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

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `getCause()` overrides synchronized method
in `core/src/main/java/com/google/common/truth/Truth.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("UnsynchronizedOverridesSynchronized")
    public @Nullable Throwable getCause() {
      return cause;
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `getCause()` overrides synchronized method
in `core/src/main/java/com/google/common/truth/AssertionErrorWithFacts.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("UnsynchronizedOverridesSynchronized")
  public @Nullable Throwable getCause() {
    return cause;
  }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `getCause()` overrides synchronized method
in `core/src/main/java/com/google/common/truth/Platform.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("UnsynchronizedOverridesSynchronized")
    public final @Nullable Throwable getCause() {
      return cause;
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
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

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
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

### NonShortCircuitBoolean
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

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `FieldScopeImpl` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeImpl.java`
#### Snippet
```java
 */
@AutoValue
abstract class FieldScopeImpl extends FieldScope {

  //////////////////////////////////////////////////////////////////////////////////////////////////
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
    /** Builder for {@link SingularField}. */
    @AutoValue.Builder
    abstract static class Builder {
      abstract Builder setResult(Result result);

```

### AbstractClassNeverImplemented
Abstract class `DiffResult` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
 */
@AutoValue
abstract class DiffResult extends RecursableDiffEntity.WithoutResultCode {

  /**
```

### AbstractClassNeverImplemented
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

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java

      @AutoValue.Builder
      abstract static class Builder {
        abstract Builder setResult(Result result);

```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder {
      abstract Builder setActual(UnknownFieldSet actual);

```

### AbstractClassNeverImplemented
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

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder {
      abstract Builder setFieldDescriptor(FieldDescriptor fieldDescriptor);

```

### AbstractClassNeverImplemented
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

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java

  @AutoValue.Builder
  abstract static class Builder {
    abstract Builder setActual(Message actual);

```

### AbstractClassNeverImplemented
Abstract class `RepeatedField` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
   */
  @AutoValue
  abstract static class RepeatedField extends RecursableDiffEntity.WithoutResultCode {

    /**
```

### AbstractClassNeverImplemented
Abstract class `UnknownFieldDescriptor` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/UnknownFieldDescriptor.java`
#### Snippet
```java
/** Convenience class encapsulating type information for unknown fields. */
@AutoValue
abstract class UnknownFieldDescriptor {

  enum Type {
```

### AbstractClassNeverImplemented
Abstract class `FieldScope` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScope.java`
#### Snippet
```java
 * FieldMask}s, directly in production code.
 */
public abstract class FieldScope {

  /**
```

### AbstractClassNeverImplemented
Abstract class `RecursableDiffEntity` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/RecursableDiffEntity.java`
#### Snippet
```java
 * children depends on the implementation - see {@link DiffResult} for concrete instances.
 */
abstract class RecursableDiffEntity {

  // Lazily-initialized return values for the recursive properties of the entity.
```

### AbstractClassNeverImplemented
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

### AbstractClassNeverImplemented
Abstract class `WithoutResultCode` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/RecursableDiffEntity.java`
#### Snippet
```java
   * children. If it has no children, it is considered both matched and ignored.
   */
  abstract static class WithoutResultCode extends RecursableDiffEntity {

    private Boolean isMatched = null;
```

### AbstractClassNeverImplemented
Abstract class `FluentEqualityConfig` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FluentEqualityConfig.java`
#### Snippet
```java
 */
@AutoValue
abstract class FluentEqualityConfig implements FieldScopeLogicContainer<FluentEqualityConfig> {

  private static final FluentEqualityConfig DEFAULT_INSTANCE =
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FluentEqualityConfig.java`
#### Snippet
```java

  @AutoValue.Builder
  abstract static class Builder {
    abstract Builder setIgnoreFieldAbsenceScope(FieldScopeLogic fieldScopeLogic);

```

### AbstractClassNeverImplemented
Abstract class `SubScopeId` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/SubScopeId.java`
#### Snippet
```java

@AutoOneOf(SubScopeId.Kind.class)
abstract class SubScopeId {
  enum Kind {
    FIELD_DESCRIPTOR,
```

### AbstractClassNeverImplemented
Abstract class `Entry` has no concrete subclass
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeLogicMap.java`
#### Snippet
```java

  @AutoValue
  abstract static class Entry<V> {
    abstract FieldScopeLogic fieldScopeLogic();

```

### AbstractClassNeverImplemented
Abstract class `InferredType` has no concrete subclass
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
  @CopyAnnotations
  @GwtIncompatible
  abstract static class InferredType {

    static final String UNINITIALIZED_PREFIX = "UNINIT@";
```

### AbstractClassNeverImplemented
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

### AbstractClassNeverImplemented
Abstract class `StackEntry` has no concrete subclass
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
   * special case, whether {@linkplain SubjectEntry the value is a Truth subject}.
   */
  abstract static class StackEntry {
    abstract InferredType type();

```

### AbstractClassNeverImplemented
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

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder {
      abstract Builder setReceiver(StackEntry receiver);

```

### AbstractClassNeverImplemented
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

### AbstractClassNeverImplemented
Abstract class `FrameInfo` has no concrete subclass
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
  @CopyAnnotations
  @GwtIncompatible
  abstract static class FrameInfo {

    static FrameInfo create(ImmutableList<StackEntry> locals, ImmutableList<StackEntry> stack) {
```

### AbstractClassNeverImplemented
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Number`
in `core/src/main/java/com/google/common/truth/PrimitiveDoubleArraySubject.java`
#### Snippet
```java

    DoubleArrayAsIterable(
        Correspondence<? super Double, Number> correspondence, IterableSubject subject) {
      super(subject, correspondence);
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/com/google/common/truth/ComparableSubject.java`
#### Snippet
```java

  /** Checks that the subject is <i>not</i> in {@code range}. */
  public final void isNotIn(Range<T> range) {
    if (range.contains(checkNotNull(actual))) {
      failWithActual("expected not to be in range", range);
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/com/google/common/truth/ComparableSubject.java`
#### Snippet
```java

  /** Checks that the subject is in {@code range}. */
  public final void isIn(Range<T> range) {
    if (!range.contains(checkNotNull(actual))) {
      failWithActual("expected to be in range", range);
```

### BoundedWildcard
Can generalize to `? extends FieldScopeLogic`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeLogic.java`
#### Snippet
```java

    @Override
    IntersectionFieldScopeLogic newLogicOfSameType(List<FieldScopeLogic> newElements) {
      checkArgument(newElements.size() == 2, "Expected 2 elements: %s", newElements);
      return new IntersectionFieldScopeLogic(newElements.get(0), newElements.get(1));
```

### BoundedWildcard
Can generalize to `? extends FieldScopeLogic`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeLogic.java`
#### Snippet
```java

    @Override
    UnionFieldScopeLogic newLogicOfSameType(List<FieldScopeLogic> newElements) {
      checkArgument(newElements.size() == 2, "Expected 2 elements: %s", newElements);
      return new UnionFieldScopeLogic(newElements.get(0), newElements.get(1));
```

### BoundedWildcard
Can generalize to `? extends FieldScopeLogic`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScopeLogic.java`
#### Snippet
```java

    @Override
    NegationFieldScopeLogic newLogicOfSameType(List<FieldScopeLogic> newElements) {
      checkArgument(newElements.size() == 1, "Expected 1 element: %s", newElements);
      return new NegationFieldScopeLogic(newElements.get(0));
```

### BoundedWildcard
Can generalize to `? extends SingularField`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java

      @CanIgnoreReturnValue
      final Builder addAllSingularFields(int fieldNumber, Iterable<SingularField> singularFields) {
        singularFieldsBuilder().putAll(fieldNumber, singularFields);
        return this;
```

### BoundedWildcard
Can generalize to `? extends SingularField`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java

    @CanIgnoreReturnValue
    final Builder addAllSingularFields(int fieldNumber, Iterable<SingularField> singularFields) {
      singularFieldsBuilder().putAll(fieldNumber, singularFields);
      return this;
```

### BoundedWildcard
Can generalize to `? super A`
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java
  public static <A extends @Nullable Object, E extends @Nullable Object>
      Correspondence<A, E> transforming(
          Function<A, ?> actualTransform, Function<E, ?> expectedTransform, String description) {
    return new Transforming<>(actualTransform, expectedTransform, description);
  }
```

### BoundedWildcard
Can generalize to `? super E`
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java
  public static <A extends @Nullable Object, E extends @Nullable Object>
      Correspondence<A, E> transforming(
          Function<A, ?> actualTransform, Function<E, ?> expectedTransform, String description) {
    return new Transforming<>(actualTransform, expectedTransform, description);
  }
```

### BoundedWildcard
Can generalize to `? super A`
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java
  public static <A extends @Nullable Object, E extends @Nullable Object>
      Correspondence<A, E> transforming(
          Function<A, ? extends E> actualTransform, String description) {
    return new Transforming<>(actualTransform, identity(), description);
  }
```

### BoundedWildcard
Can generalize to `? extends V`
in `core/src/main/java/com/google/common/truth/GraphMatching.java`
#### Snippet
```java
    }

    private HopcroftKarp(Multimap<U, V> graph) {
      this.graph = graph;
    }
```

### BoundedWildcard
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

### BoundedWildcard
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

### BoundedWildcard
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

### BoundedWildcard
Can generalize to `? super Number`
in `core/src/main/java/com/google/common/truth/PrimitiveFloatArraySubject.java`
#### Snippet
```java

    FloatArrayAsIterable(
        Correspondence<? super Float, Number> correspondence, IterableSubject subject) {
      super(subject, correspondence);
    }
```

### BoundedWildcard
Can generalize to `? extends Multiset.Entry`
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
  }

  private static boolean containsEmptyOrLong(Iterable<Multiset.Entry<?>> entries) {
    int totalLength = 0;
    for (Multiset.Entry<?> entry : entries) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
     */
    private <T extends @Nullable Object> List<T> findNotIndexed(
        List<T> list, Set<Integer> indexes) {
      if (indexes.size() == list.size()) {
        // If there are as many distinct valid indexes are there are elements in the list then every
```

### BoundedWildcard
Can generalize to `? extends Multiset.Entry`
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
  }

  private static boolean hasMultiple(Iterable<Multiset.Entry<?>> entries) {
    int totalCount = 0;
    for (Multiset.Entry<?> entry : entries) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java
  }

  static <T extends @Nullable Object> Collection<T> iterableToCollection(Iterable<T> iterable) {
    if (iterable instanceof Collection) {
      // Should be safe to assume that any Iterable implementing Collection isn't a one-shot
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java
  }

  static <T> int countOf(T t, Iterable<T> items) {
    int count = 0;
    for (T item : items) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java

  private static <T extends @Nullable Object> NonHashingMultiset<T> countDuplicatesToMultiset(
      Iterable<T> items) {
    // We use avoid hashing in case the elements don't have a proper
    // .hashCode() method (e.g., MessageSet from old versions of protobuf).
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/com/google/common/truth/SubjectUtils.java`
#### Snippet
```java
  }

  static <T extends @Nullable Object> List<T> iterableToList(Iterable<T> iterable) {
    if (iterable instanceof List) {
      return (List<T>) iterable;
```

### BoundedWildcard
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

### BoundedWildcard
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

### BoundedWildcard
Can generalize to `? super Integer`
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
        String name,
        String methodDescriptor,
        ImmutableSetMultimap.Builder<Integer, StackEntry> actualValueAtLine) {
      super(Opcodes.ASM9);
      localVariableSlots = createInitialLocalVariableSlots(access, owner, name, methodDescriptor);
```

### BoundedWildcard
Can generalize to `? super StackEntry`
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
        String name,
        String methodDescriptor,
        ImmutableSetMultimap.Builder<Integer, StackEntry> actualValueAtLine) {
      super(Opcodes.ASM9);
      localVariableSlots = createInitialLocalVariableSlots(access, owner, name, methodDescriptor);
```

### BoundedWildcard
Can generalize to `? extends StackEntry`
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java

    private ImmutableList<StackEntry> appendArrayToList(
        ImmutableList<StackEntry> list, int size, Object[] array) {
      ImmutableList.Builder<StackEntry> builder = ImmutableList.builder();
      builder.addAll(list);
```

### BoundedWildcard
Can generalize to `? extends Label`
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java

    private static ImmutableSet<Integer> lineNumbers(
        ImmutableList<Label> labels, ImmutableSetMultimap<Label, Integer> lineNumbersAtLabel) {
      for (Label label : labels.reverse()) {
        if (lineNumbersAtLabel.containsKey(label)) {
```

### BoundedWildcard
Can generalize to `? super Label`
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java

    private static ImmutableSet<Integer> lineNumbers(
        ImmutableList<Label> labels, ImmutableSetMultimap<Label, Integer> lineNumbersAtLabel) {
      for (Label label : labels.reverse()) {
        if (lineNumbersAtLabel.containsKey(label)) {
```

## RuleId[id=NullableProblems]
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
in `core/src/main/java/com/google/common/truth/AssertionErrorWithFacts.java`
#### Snippet
```java

  /** Separate cause field, in case initCause() fails. */
  private final @Nullable Throwable cause;

  AssertionErrorWithFacts(
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
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/common/truth/ClassSubject.java`
#### Snippet
```java
@GwtIncompatible("reflection")
public final class ClassSubject extends Subject {
  private final @Nullable Class<?> actual;

  ClassSubject(FailureMetadata metadata, @Nullable Class<?> o) {
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
in `extensions/re2j/src/main/java/com/google/common/truth/extensions/re2j/Re2jSubjects.java`
#### Snippet
```java
        };

    private final @Nullable String actual;

    private Re2jStringSubject(FailureMetadata failureMetadata, @Nullable String subject) {
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
in `core/src/main/java/com/google/common/truth/FloatSubject.java`
#### Snippet
```java
  private static final int NEG_ZERO_BITS = floatToIntBits(-0.0f);

  private final @Nullable Float actual;
  private final DoubleSubject asDouble;

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
      };

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
in `core/src/main/java/com/google/common/truth/TruthFailureSubject.java`
#### Snippet
```java
      };

  private final @Nullable AssertionError actual;

  TruthFailureSubject(
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

  private static class ValueDifference<A extends @Nullable Object, E extends @Nullable Object> {
    private final A actual;
    private final E expected;

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
 */
public class MapSubject extends Subject {
  private final @Nullable Map<?, ?> actual;

  /**
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
in `core/src/main/java/com/google/common/truth/MultimapSubject.java`
#### Snippet
```java
  private static final Ordered ALREADY_FAILED = () -> {};

  private final @Nullable Multimap<?, ?> actual;

  /**
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
in `core/src/main/java/com/google/common/truth/MultisetSubject.java`
#### Snippet
```java
public final class MultisetSubject extends IterableSubject {

  private final @Nullable Multiset<?> actual;

  MultisetSubject(FailureMetadata metadata, @Nullable Multiset<?> multiset) {
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
    return singularFieldBuilder.build();
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
`OptionalDouble` used as type for field 'actual'
in `extensions/java8/src/main/java/com/google/common/truth/OptionalDoubleSubject.java`
#### Snippet
```java
public final class OptionalDoubleSubject extends Subject {

  private final OptionalDouble actual;

  OptionalDoubleSubject(
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
 */
public final class Truth8 {
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
`Optional` used as type for field 'pairer'
in `core/src/main/java/com/google/common/truth/IterableSubject.java`
#### Snippet
```java
    private final IterableSubject subject;
    private final Correspondence<? super A, ? super E> correspondence;
    private final Optional<Pairer> pairer;

    UsingCorrespondence(
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

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
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

### UnnecessaryUnboxing
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

### UnnecessaryUnboxing
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

### UnnecessaryUnboxing
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

### UnnecessaryUnboxing
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

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Factory` is the same as one of its superclass' names
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoSubjectBuilder.java`
#### Snippet
```java

  /** Factory for ProtoSubjectBuilder. */
  private static class Factory implements CustomSubjectBuilder.Factory<ProtoSubjectBuilder> {
    private static final Factory INSTANCE = new Factory();

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `isEqualTo()` only delegates to its super method
in `core/src/main/java/com/google/common/truth/PrimitiveDoubleArraySubject.java`
#### Snippet
```java
  // TODO(cpovirk): Move some or all of this Javadoc to the supertype, maybe deleting this override?
  @Override
  public void isEqualTo(@Nullable Object expected) {
    super.isEqualTo(expected);
  }
```

### RedundantMethodOverride
Method `isNotEqualTo()` only delegates to its super method
in `core/src/main/java/com/google/common/truth/PrimitiveDoubleArraySubject.java`
#### Snippet
```java
   */
  @Override
  public void isNotEqualTo(@Nullable Object expected) {
    super.isNotEqualTo(expected);
  }
```

### RedundantMethodOverride
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

### RedundantMethodOverride
Method `isNotEqualTo()` only delegates to its super method
in `core/src/main/java/com/google/common/truth/PrimitiveFloatArraySubject.java`
#### Snippet
```java
   */
  @Override
  public void isNotEqualTo(@Nullable Object expected) {
    super.isNotEqualTo(expected);
  }
```

### RedundantMethodOverride
Method `isEqualTo()` only delegates to its super method
in `core/src/main/java/com/google/common/truth/PrimitiveFloatArraySubject.java`
#### Snippet
```java
   */
  @Override
  public void isEqualTo(@Nullable Object expected) {
    super.isEqualTo(expected);
  }
```

## RuleId[id=OptionalAssignedToNull]
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
  /** Fails if the {@link OptionalDouble} is empty or the subject is null. */
  public void isPresent() {
    if (actual == null) {
      failWithActual(simpleFact("expected present optional"));
    } else if (!actual.isPresent()) {
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
  /** Fails if the {@link Optional}{@code <T>} is empty or the subject is null. */
  public void isPresent() {
    if (actual == null) {
      failWithActual(simpleFact("expected present optional"));
    } else if (!actual.isPresent()) {
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
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

### DynamicRegexReplaceableByCompiledPattern
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

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/common/truth/Expect.java`
#### Snippet
```java
      String s = Throwables.getStackTraceAsString(e);
      // Force single line reluctant matching
      return s.replaceFirst("(?s)^.*?__EXCEPTION_MARKER__.*?Caused by:\\s+", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/common/truth/Expect.java`
#### Snippet
```java
    private static void appendIndented(int countLength, StringBuilder builder, String toAppend) {
      int indent = countLength + 4; // "  " and ". "
      builder.append(toAppend.replace("\n", "\n" + repeat(" ", indent)));
    }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.objectweb.asm.Opcodes;`
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import org.objectweb.asm.Opcodes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
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

### ReplaceAssignmentWithOperatorAssignment
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

### ReplaceAssignmentWithOperatorAssignment
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

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `core/src/main/java/com/google/common/truth/super/com/google/common/truth/Platform.java`
#### Snippet
```java
  }

  static void cleanStackTrace(Throwable throwable) {
    // Do nothing. See notes in StackTraceCleanerTest.
  }
```

### EmptyMethod
All implementations of this method are empty
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/FieldScope.java`
#### Snippet
```java

  /** Returns the underlying logical implementation of the {@link FieldScope}. */
  abstract FieldScopeLogic logic();

  /**
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/com/google/common/truth/StackTraceCleaner.java`
#### Snippet
```java
  private @Nullable StackTraceElementWrapper lastStackFrameElementWrapper = null;
  private @Nullable StackFrameType currentStreakType = null;
  private int currentStreakLength = 0;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/com/google/common/truth/StackTraceCleaner.java`
#### Snippet
```java
  private final List<StackTraceElementWrapper> cleanedStackTrace = new ArrayList<>();
  private @Nullable StackTraceElementWrapper lastStackFrameElementWrapper = null;
  private @Nullable StackFrameType currentStreakType = null;
  private int currentStreakLength = 0;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/com/google/common/truth/StackTraceCleaner.java`
#### Snippet
```java
  private final Throwable throwable;
  private final List<StackTraceElementWrapper> cleanedStackTrace = new ArrayList<>();
  private @Nullable StackTraceElementWrapper lastStackFrameElementWrapper = null;
  private @Nullable StackFrameType currentStreakType = null;
  private int currentStreakLength = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java
    private @Nullable StoredException firstCompareException = null;
    private @Nullable StoredException firstPairingException = null;
    private @Nullable StoredException firstFormatDiffException = null;

    static ExceptionStore forIterable() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java
    private final String argumentLabel;
    private @Nullable StoredException firstCompareException = null;
    private @Nullable StoredException firstPairingException = null;
    private @Nullable StoredException firstFormatDiffException = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java

    private final String argumentLabel;
    private @Nullable StoredException firstCompareException = null;
    private @Nullable StoredException firstPairingException = null;
    private @Nullable StoredException firstFormatDiffException = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/com/google/common/truth/ExpectFailure.java`
#### Snippet
```java
 */
public final class ExpectFailure implements Platform.JUnitTestRule {
  private boolean inRuleContext = false;
  private boolean failureExpected = false;
  private @Nullable AssertionError failure = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/com/google/common/truth/ExpectFailure.java`
#### Snippet
```java
  private boolean inRuleContext = false;
  private boolean failureExpected = false;
  private @Nullable AssertionError failure = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/com/google/common/truth/ExpectFailure.java`
#### Snippet
```java
public final class ExpectFailure implements Platform.JUnitTestRule {
  private boolean inRuleContext = false;
  private boolean failureExpected = false;
  private @Nullable AssertionError failure = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/RecursableDiffEntity.java`
#### Snippet
```java

  private Boolean isAnyChildIgnored = null;
  private Boolean isAnyChildMatched = null;

  // Only extended by inner classes.
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/RecursableDiffEntity.java`
#### Snippet
```java
  // inheritance, than to duplicate the @Memoized methods for every subclass.

  private Boolean isAnyChildIgnored = null;
  private Boolean isAnyChildMatched = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/RecursableDiffEntity.java`
#### Snippet
```java
  abstract static class WithoutResultCode extends RecursableDiffEntity {

    private Boolean isMatched = null;
    private Boolean isIgnored = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/RecursableDiffEntity.java`
#### Snippet
```java

    private Boolean isMatched = null;
    private Boolean isIgnored = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/com/google/common/truth/DiffUtils.java`
#### Snippet
```java
  private final List<Integer> unifiedDiffContentId = new ArrayList<>();
  private final List<String> reducedUnifiedDiff = new ArrayList<>();
  private int offsetHead = 0;
  private int offsetTail = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/com/google/common/truth/DiffUtils.java`
#### Snippet
```java
  private final List<String> reducedUnifiedDiff = new ArrayList<>();
  private int offsetHead = 0;
  private int offsetTail = 0;

  private List<String> diff(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/com/google/common/truth/ActualValueInference.java`
#### Snippet
```java

  private static final class InferenceMethodVisitor extends MethodVisitor {
    private boolean used = false;
    private final ArrayList<StackEntry> localVariableSlots;
    private final ArrayList<StackEntry> operandStack = new ArrayList<>();
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `fieldPrefix`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/DiffResult.java`
#### Snippet
```java
      }

      fieldPrefix = newFieldPrefix(fieldPrefix, fieldName());
      switch (result()) {
        case ADDED:
```

### AssignmentToMethodParameter
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

### AssignmentToMethodParameter
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

### AssignmentToMethodParameter
Assignment to method parameter `actual`
in `core/src/main/java/com/google/common/truth/ComparisonFailures.java`
#### Snippet
```java
    if (prefix > 3) {
      expected = "…" + expected.substring(prefix);
      actual = "…" + actual.substring(prefix);
    }

```

### AssignmentToMethodParameter
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

### AssignmentToMethodParameter
Assignment to method parameter `actual`
in `core/src/main/java/com/google/common/truth/ComparisonFailures.java`
#### Snippet
```java
    if (suffix > 3) {
      expected = expected.substring(0, expected.length() - suffix) + "…";
      actual = actual.substring(0, actual.length() - suffix) + "…";
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `subclass`
in `core/src/main/java/com/google/common/truth/StackTraceCleaner.java`
#### Snippet
```java

  private static boolean isSubtypeOf(@Nullable Class<?> subclass, String superclass) {
    for (; subclass != null; subclass = checkNotNull(subclass).getSuperclass()) {
      if (subclass.getCanonicalName() != null && subclass.getCanonicalName().equals(superclass)) {
        return true;
```

### AssignmentToMethodParameter
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

### AssignmentToMethodParameter
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

### AssignmentToMethodParameter
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

### AssignmentToMethodParameter
Assignment to method parameter `originalLines`
in `core/src/main/java/com/google/common/truth/DiffUtils.java`
#### Snippet
```java
      List<String> originalLines, List<String> revisedLines, int contextSize) {
    reduceEqualLinesFromHeadAndTail(originalLines, revisedLines, contextSize);
    originalLines = originalLines.subList(offsetHead, originalLines.size() - offsetTail);
    revisedLines = revisedLines.subList(offsetHead, revisedLines.size() - offsetTail);

```

### AssignmentToMethodParameter
Assignment to method parameter `revisedLines`
in `core/src/main/java/com/google/common/truth/DiffUtils.java`
#### Snippet
```java
    reduceEqualLinesFromHeadAndTail(originalLines, revisedLines, contextSize);
    originalLines = originalLines.subList(offsetHead, originalLines.size() - offsetTail);
    revisedLines = revisedLines.subList(offsetHead, revisedLines.size() - offsetTail);

    original = new int[originalLines.size() + 1];
```

### AssignmentToMethodParameter
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

### AssignmentToMethodParameter
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

### AssignmentToMethodParameter
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

### AssignmentToMethodParameter
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

### AssignmentToMethodParameter
Assignment to method parameter `actual`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    boolean ignoreFieldAbsence =
        !hasPresence || config.ignoreFieldAbsenceScope().contains(rootDescriptor, subScopeId);
    actual = orIfIgnoringFieldAbsence(actual, defaultValue, ignoreFieldAbsence);
    expected = orIfIgnoringFieldAbsence(expected, defaultValue, ignoreFieldAbsence);

```

### AssignmentToMethodParameter
Assignment to method parameter `expected`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
        !hasPresence || config.ignoreFieldAbsenceScope().contains(rootDescriptor, subScopeId);
    actual = orIfIgnoringFieldAbsence(actual, defaultValue, ignoreFieldAbsence);
    expected = orIfIgnoringFieldAbsence(expected, defaultValue, ignoreFieldAbsence);

    // If actual or expected is missing here, we know our result.
```

### AssignmentToMethodParameter
Assignment to method parameter `actual`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    boolean ignoreFieldAbsence =
        config.ignoreFieldAbsenceScope().contains(rootDescriptor, SubScopeId.of(fieldDescriptor));
    actual = orIfIgnoringFieldAbsence(actual, defaultValue, ignoreFieldAbsence);
    expected = orIfIgnoringFieldAbsence(expected, defaultValue, ignoreFieldAbsence);

```

### AssignmentToMethodParameter
Assignment to method parameter `expected`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
        config.ignoreFieldAbsenceScope().contains(rootDescriptor, SubScopeId.of(fieldDescriptor));
    actual = orIfIgnoringFieldAbsence(actual, defaultValue, ignoreFieldAbsence);
    expected = orIfIgnoringFieldAbsence(expected, defaultValue, ignoreFieldAbsence);

    // If actual or expected is missing here, we know our result so long as it's not ignored.
```

### AssignmentToMethodParameter
Assignment to method parameter `actual`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    @Nullable DiffResult breakdown = null;
    if (result.build() == Result.MATCHED || excludeNonRecursive) {
      actual = orDefaultForType(actual, expected);
      expected = orDefaultForType(expected, actual);

```

### AssignmentToMethodParameter
Assignment to method parameter `expected`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    if (result.build() == Result.MATCHED || excludeNonRecursive) {
      actual = orDefaultForType(actual, expected);
      expected = orDefaultForType(expected, actual);

      breakdown = diffMessages(actual, expected, config);
```

### AssignmentToMethodParameter
Assignment to method parameter `actual`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    @Nullable UnknownFieldSetDiff unknownsBreakdown = null;
    if (result.build() == Result.MATCHED || excludeNonRecursive) {
      actual = firstNonNull(actual, UnknownFieldSet.getDefaultInstance());
      expected = firstNonNull(expected, UnknownFieldSet.getDefaultInstance());

```

### AssignmentToMethodParameter
Assignment to method parameter `expected`
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
    if (result.build() == Result.MATCHED || excludeNonRecursive) {
      actual = firstNonNull(actual, UnknownFieldSet.getDefaultInstance());
      expected = firstNonNull(expected, UnknownFieldSet.getDefaultInstance());

      unknownsBreakdown = diffUnknowns(actual, expected, config);
```

### AssignmentToMethodParameter
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

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-19-18-59-26.694.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
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

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
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

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/com/google/common/truth/Platform.java`
#### Snippet
```java
      return (Throwable[]) checkNotNull(getSuppressed.invoke(throwable));
    } catch (NoSuchMethodException e) {
      return new Throwable[0];
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/com/google/common/truth/Subject.java`
#### Snippet
```java
  @Deprecated
  final void fail(String check) {
    fail(check, new Object[0]);
  }

```

### ZeroLengthArrayInitialization
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

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `StoredException` ends with 'Exception'
in `core/src/main/java/com/google/common/truth/Correspondence.java`
#### Snippet
```java
  public abstract boolean compare(A actual, E expected);

  private static class StoredException {

    private static final Joiner ARGUMENT_JOINER = Joiner.on(", ").useForNull("null");
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
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java
        // Move all prior elements to actualNotInOrder.
        while (!actualIndices.isEmpty()
            && actualIndices.getFirst() < matchingResult.actualFieldIndex().get()) {
          actualNotInOrder.add(actualIndices.removeFirst());
        }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `extensions/proto/src/main/java/com/google/common/truth/extensions/proto/ProtoTruthMessageDifferencer.java`
#### Snippet
```java

    ImmutableList.Builder<SingularField> builder =
        ImmutableList.builderWithExpectedSize(actualAndExpectedKeys.size());
    for (Object key : actualAndExpectedKeys) {
      @Nullable Object actualValue = actualMap.get(key);
```

### UnstableApiUsage
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

### UnstableApiUsage
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
