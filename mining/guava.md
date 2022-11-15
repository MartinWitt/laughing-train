# google/guava
# Bad smells
I found 2294 bad smells with 18 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=NullableProblems] | 398 | false |
| RuleId[ruleID=BoundedWildcard] | 232 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 192 | false |
| RuleId[ruleID=NestedAssignment] | 180 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 177 | false |
| RuleId[ruleID=DataFlowIssue] | 158 | false |
| RuleId[ruleID=MethodOverridesStaticMethod] | 88 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 60 | false |
| RuleId[ruleID=NonShortCircuitBoolean] | 50 | false |
| RuleId[ruleID=Convert2Lambda] | 45 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 33 | false |
| RuleId[ruleID=NonSerializableFieldInSerializableClass] | 33 | false |
| RuleId[ruleID=PointlessArithmeticExpression] | 31 | false |
| RuleId[ruleID=RedundantMethodOverride] | 29 | false |
| RuleId[ruleID=PublicFieldAccessedInSynchronizedContext] | 29 | false |
| RuleId[ruleID=EqualsWhichDoesntCheckParameterClass] | 29 | false |
| RuleId[ruleID=RedundantSuppression] | 28 | false |
| RuleId[ruleID=ClassNameSameAsAncestorName] | 27 | false |
| RuleId[ruleID=UnusedAssignment] | 25 | false |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 24 | false |
| RuleId[ruleID=ConstantValue] | 23 | false |
| RuleId[ruleID=EqualsAndHashcode] | 21 | false |
| RuleId[ruleID=EmptyMethod] | 18 | false |
| RuleId[ruleID=StaticPseudoFunctionalStyleMethod] | 17 | false |
| RuleId[ruleID=ReturnNull] | 17 | false |
| RuleId[ruleID=OptionalUsedAsFieldOrParameterType] | 16 | false |
| RuleId[ruleID=SuspiciousNameCombination] | 15 | false |
| RuleId[ruleID=SynchronizeOnThis] | 14 | false |
| RuleId[ruleID=Anonymous2MethodRef] | 14 | false |
| RuleId[ruleID=AbstractClassNeverImplemented] | 13 | false |
| RuleId[ruleID=UnnecessaryUnboxing] | 12 | false |
| RuleId[ruleID=RedundantImplements] | 12 | false |
| RuleId[ruleID=TypeParameterExtendsObject] | 12 | false |
| RuleId[ruleID=PointlessBitwiseExpression] | 11 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 10 | false |
| RuleId[ruleID=AssignmentToForLoopParameter] | 10 | false |
| RuleId[ruleID=ArrayEquality] | 9 | false |
| RuleId[ruleID=IgnoreResultOfCall] | 8 | false |
| RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter] | 8 | false |
| RuleId[ruleID=StaticInitializerReferencesSubClass] | 7 | false |
| RuleId[ruleID=AtomicFieldUpdaterNotStaticFinal] | 7 | false |
| RuleId[ruleID=CStyleArrayDeclaration] | 6 | false |
| RuleId[ruleID=UnnecessaryQualifierForThis] | 6 | false |
| RuleId[ruleID=DuplicateExpressions] | 6 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 6 | true |
| RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized] | 6 | false |
| RuleId[ruleID=UnstableTypeUsedInSignature] | 6 | false |
| RuleId[ruleID=CharsetObjectCanBeUsed] | 6 | false |
| RuleId[ruleID=CommentedOutCode] | 5 | false |
| RuleId[ruleID=NotNullFieldNotInitialized] | 5 | false |
| RuleId[ruleID=OptionalAssignedToNull] | 5 | false |
| RuleId[ruleID=NullArgumentToVariableArgMethod] | 5 | false |
| RuleId[ruleID=UnnecessaryToStringCall] | 5 | true |
| RuleId[ruleID=UnnecessaryLocalVariable] | 5 | true |
| RuleId[ruleID=EqualsWithItself] | 4 | false |
| RuleId[ruleID=EmptyStatementBody] | 4 | false |
| RuleId[ruleID=ManualArrayCopy] | 4 | false |
| RuleId[ruleID=AnonymousHasLambdaAlternative] | 4 | false |
| RuleId[ruleID=UnnecessarySuperQualifier] | 4 | false |
| RuleId[ruleID=CatchMayIgnoreException] | 4 | false |
| RuleId[ruleID=FinalPrivateMethod] | 3 | false |
| RuleId[ruleID=WhileLoopSpinsOnField] | 3 | false |
| RuleId[ruleID=IfStatementWithIdenticalBranches] | 3 | false |
| RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment] | 3 | false |
| RuleId[ruleID=IOResource] | 3 | false |
| RuleId[ruleID=SystemOutErr] | 3 | false |
| RuleId[ruleID=Finalize] | 2 | false |
| RuleId[ruleID=NegativeIntConstantInLongContext] | 2 | false |
| RuleId[ruleID=InstanceofCatchParameter] | 2 | false |
| RuleId[ruleID=CastConflictsWithInstanceof] | 2 | false |
| RuleId[ruleID=UnnecessarySemicolon] | 2 | false |
| RuleId[ruleID=Convert2MethodRef] | 2 | false |
| RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod] | 2 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 2 | false |
| RuleId[ruleID=ComparatorMethodParameterNotUsed] | 2 | false |
| RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup] | 2 | false |
| RuleId[ruleID=UseCompareMethod] | 2 | false |
| RuleId[ruleID=SuspiciousSystemArraycopy] | 1 | false |
| RuleId[ruleID=WhileCanBeForeach] | 1 | false |
| RuleId[ruleID=KeySetIterationMayUseEntrySet] | 1 | false |
| RuleId[ruleID=UnnecessaryReturn] | 1 | true |
| RuleId[ruleID=ManualMinMaxCalculation] | 1 | false |
| RuleId[ruleID=TrivialStringConcatenation] | 1 | false |
| RuleId[ruleID=DefaultAnnotationParam] | 1 | false |
| RuleId[ruleID=ThrowFromFinallyBlock] | 1 | false |
| RuleId[ruleID=ExceptionNameDoesntEndWithException] | 1 | false |
| RuleId[ruleID=OptionalIsPresent] | 1 | false |
| RuleId[ruleID=JavaReflectionMemberAccess] | 1 | false |
| RuleId[ruleID=StringEqualsEmptyString] | 1 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 1 | true |
| RuleId[ruleID=CaughtExceptionImmediatelyRethrown] | 1 | false |
| RuleId[ruleID=UseBulkOperation] | 1 | false |
| RuleId[ruleID=CastCanBeRemovedNarrowingVariableType] | 1 | false |
## RuleId[ruleID=EqualsWithItself]
### RuleId[ruleID=EqualsWithItself]
`compare()` called on itself
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
     */
    if (hasLowerBound) {
      comparator.compare(
          uncheckedCastNullableTToT(lowerEndpoint), uncheckedCastNullableTToT(lowerEndpoint));
    }
```

### RuleId[ruleID=EqualsWithItself]
`compare()` called on itself
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
    }
    if (hasUpperBound) {
      comparator.compare(
          uncheckedCastNullableTToT(upperEndpoint), uncheckedCastNullableTToT(upperEndpoint));
    }
```

### RuleId[ruleID=EqualsWithItself]
`compare()` called on itself
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
    AvlNode<E> root = rootReference.get();
    if (root == null) {
      comparator().compare(element, element);
      AvlNode<E> newRoot = new AvlNode<E>(element, occurrences);
      successor(header, newRoot, header);
```

### RuleId[ruleID=EqualsWithItself]
`compare()` called on itself
in `guava/src/com/google/common/collect/TreeMultimap.java`
#### Snippet
```java
  Collection<V> createCollection(@ParametricNullness K key) {
    if (key == null) {
      keyComparator().compare(key, key);
    }
    return super.createCollection(key);
```

## RuleId[ruleID=Finalize]
### RuleId[ruleID=Finalize]
'finalize()' should not be overridden
in `guava/src/com/google/common/io/FileBackedOutputStream.java`
#### Snippet
```java

            @Override
            protected void finalize() {
              try {
                reset();
```

### RuleId[ruleID=Finalize]
'finalize()' should not be overridden
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java

  @Override
  protected void finalize() {
    if (state.get().equals(OPEN)) {
      logger.log(SEVERE, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
```

## RuleId[ruleID=PointlessArithmeticExpression]
### RuleId[ruleID=PointlessArithmeticExpression]
`1 * 2` can be replaced with '2'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    1,
    1,
    1 * 2,
    1 * 2 * 3,
    1 * 2 * 3 * 4,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1 * 2 * 3` can be replaced with '2 \* 3'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    1,
    1 * 2,
    1 * 2 * 3,
    1 * 2 * 3 * 4,
    1 * 2 * 3 * 4 * 5,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1 * 2 * 3 * 4` can be replaced with '2 \* 3 \* 4'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    1 * 2,
    1 * 2 * 3,
    1 * 2 * 3 * 4,
    1 * 2 * 3 * 4 * 5,
    1 * 2 * 3 * 4 * 5 * 6,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1 * 2 * 3 * 4 * 5` can be replaced with '2 \* 3 \* 4 \* 5'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    1 * 2 * 3,
    1 * 2 * 3 * 4,
    1 * 2 * 3 * 4 * 5,
    1 * 2 * 3 * 4 * 5 * 6,
    1 * 2 * 3 * 4 * 5 * 6 * 7,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1 * 2 * 3 * 4 * 5 * 6` can be replaced with '2 \* 3 \* 4 \* 5 \* 6'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    1 * 2 * 3 * 4,
    1 * 2 * 3 * 4 * 5,
    1 * 2 * 3 * 4 * 5 * 6,
    1 * 2 * 3 * 4 * 5 * 6 * 7,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1 * 2 * 3 * 4 * 5 * 6 * 7` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    1 * 2 * 3 * 4 * 5,
    1 * 2 * 3 * 4 * 5 * 6,
    1 * 2 * 3 * 4 * 5 * 6 * 7,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1 * 2 * 3 * 4 * 5 * 6 * 7 * 8` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    1 * 2 * 3 * 4 * 5 * 6,
    1 * 2 * 3 * 4 * 5 * 6 * 7,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8 \* 9'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    1 * 2 * 3 * 4 * 5 * 6 * 7,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8 \* 9 \* 10'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8 \* 9 \* 10 \* 11'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12
  };
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8 \* 9 \* 10 \* 11 \* 12'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12
  };

```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2` can be replaced with '2'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L,
    1L,
    1L * 2,
    1L * 2 * 3,
    1L * 2 * 3 * 4,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2 * 3` can be replaced with '2 \* 3'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L,
    1L * 2,
    1L * 2 * 3,
    1L * 2 * 3 * 4,
    1L * 2 * 3 * 4 * 5,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2 * 3 * 4` can be replaced with '2 \* 3 \* 4'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L * 2,
    1L * 2 * 3,
    1L * 2 * 3 * 4,
    1L * 2 * 3 * 4 * 5,
    1L * 2 * 3 * 4 * 5 * 6,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2 * 3 * 4 * 5` can be replaced with '2 \* 3 \* 4 \* 5'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L * 2 * 3,
    1L * 2 * 3 * 4,
    1L * 2 * 3 * 4 * 5,
    1L * 2 * 3 * 4 * 5 * 6,
    1L * 2 * 3 * 4 * 5 * 6 * 7,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2 * 3 * 4 * 5 * 6` can be replaced with '2 \* 3 \* 4 \* 5 \* 6'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L * 2 * 3 * 4,
    1L * 2 * 3 * 4 * 5,
    1L * 2 * 3 * 4 * 5 * 6,
    1L * 2 * 3 * 4 * 5 * 6 * 7,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2 * 3 * 4 * 5 * 6 * 7` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L * 2 * 3 * 4 * 5,
    1L * 2 * 3 * 4 * 5 * 6,
    1L * 2 * 3 * 4 * 5 * 6 * 7,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2 * 3 * 4 * 5 * 6 * 7 * 8` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L * 2 * 3 * 4 * 5 * 6,
    1L * 2 * 3 * 4 * 5 * 6 * 7,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8 \* 9'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L * 2 * 3 * 4 * 5 * 6 * 7,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8 \* 9 \* 10'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8 \* 9 \* 10 \* 11'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8 \* 9 \* 10 \* 11 \* 12'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8 \* 9 \* 10 \* 11 \* 12 \* 13'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8 \* 9 \* 10 \* 11 \* 12 \* 13 \* 14'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8 \* 9 \* 10 \* 11 \* 12 \* 13 \* 14 \* 15'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8 \* 9 \* 10 \* 11 \* 12 \* 13 \* 14 \* 15 \* 16'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8 \* 9 \* 10 \* 11 \* 12 \* 13 \* 14 \* 15 \* 16 \* 17'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19,
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8 \* 9 \* 10 \* 11 \* 12 \* 13 \* 14 \* 15 \* 16 \* 17 \* 18'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19 * 20
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8 \* 9 \* 10 \* 11 \* 12 \* 13 \* 14 \* 15 \* 16 \* 17 \* 18 \* 19'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19 * 20
  };
```

### RuleId[ruleID=PointlessArithmeticExpression]
`1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19 * 20` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8 \* 9 \* 10 \* 11 \* 12 \* 13 \* 14 \* 15 \* 16 \* 17 \* 18 \* 19 \* 20'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19 * 20
  };

```

### RuleId[ruleID=PointlessArithmeticExpression]
`2 - 2` can be replaced with '0'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
      // Encode all primes less than 66 into mask without 0 and 1.
      long mask =
          (1L << (2 - 2))
              | (1L << (3 - 2))
              | (1L << (5 - 2))
```

## RuleId[ruleID=SuspiciousSystemArraycopy]
### RuleId[ruleID=SuspiciousSystemArraycopy]
Source parameter type 'java.lang.Object\[\]' is not assignable to destination parameter `dst` of type 'T\[\]'
in `guava/src/com/google/common/collect/ObjectArrays.java`
#### Snippet
```java
      unsoundlyCovariantArray[len] = null;
    }
    System.arraycopy(src, offset, dst, 0, len);
    return dst;
  }
```

## RuleId[ruleID=EmptyStatementBody]
### RuleId[ruleID=EmptyStatementBody]
`while` statement has empty body
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

    <T> void clearReferenceQueue(ReferenceQueue<T> referenceQueue) {
      while (referenceQueue.poll() != null) {}
    }

```

### RuleId[ruleID=EmptyStatementBody]
`while` statement has empty body
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    void clearKeyReferenceQueue() {
      while (keyReferenceQueue.poll() != null) {}
    }

```

### RuleId[ruleID=EmptyStatementBody]
`while` statement has empty body
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    void clearValueReferenceQueue() {
      while (valueReferenceQueue.poll() != null) {}
    }

```

### RuleId[ruleID=EmptyStatementBody]
`for` statement has empty body
in `guava/src/com/google/common/reflect/TypeResolver.java`
#### Snippet
```java
          // Otherwise, an F -> T cycle will end up resolving both F and T
          // nondeterministically to either F or T.
          for (Type x = arg; x != null; x = mappings.remove(TypeVariableKey.forLookup(x))) {}
          return;
        }
```

## RuleId[ruleID=WhileCanBeForeach]
### RuleId[ruleID=WhileCanBeForeach]
`while` loop can be replaced with enhanced 'for'
in `guava/src/com/google/common/collect/RegularImmutableSortedSet.java`
#### Snippet
```java
      try {
        Iterator<E> iterator = iterator();
        while (iterator.hasNext()) {
          Object element = iterator.next();
          Object otherElement = otherIterator.next();
```

## RuleId[ruleID=StaticInitializerReferencesSubClass]
### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass InactiveComparisonChain from superclass ComparisonChain initializer might lead to class loading deadlock
in `guava/src/com/google/common/collect/ComparisonChain.java`
#### Snippet
```java
      };

  private static final ComparisonChain LESS = new InactiveComparisonChain(-1);

  private static final ComparisonChain GREATER = new InactiveComparisonChain(1);
```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass InactiveComparisonChain from superclass ComparisonChain initializer might lead to class loading deadlock
in `guava/src/com/google/common/collect/ComparisonChain.java`
#### Snippet
```java
  private static final ComparisonChain LESS = new InactiveComparisonChain(-1);

  private static final ComparisonChain GREATER = new InactiveComparisonChain(1);

  private static final class InactiveComparisonChain extends ComparisonChain {
```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass StandardBaseEncoding from superclass BaseEncoding initializer might lead to class loading deadlock
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java

  private static final BaseEncoding BASE32 =
      new StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

  /**
```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass Base64Encoding from superclass BaseEncoding initializer might lead to class loading deadlock
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java

  private static final BaseEncoding BASE64_URL =
      new Base64Encoding(
          "base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass Base16Encoding from superclass BaseEncoding initializer might lead to class loading deadlock
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
  }

  private static final BaseEncoding BASE16 = new Base16Encoding("base16()", "0123456789ABCDEF");

  /**
```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass Base64Encoding from superclass BaseEncoding initializer might lead to class loading deadlock
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java

  private static final BaseEncoding BASE64 =
      new Base64Encoding(
          "base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass StandardBaseEncoding from superclass BaseEncoding initializer might lead to class loading deadlock
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java

  private static final BaseEncoding BASE32_HEX =
      new StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

  /**
```

## RuleId[ruleID=CommentedOutCode]
### RuleId[ruleID=CommentedOutCode]
Commented out code (3 lines)
in `guava/src/com/google/common/graph/EndpointPair.java`
#### Snippet
```java

      // Equivalent to the following simple implementation:
      // boolean condition1 = nodeU().equals(other.nodeU()) && nodeV().equals(other.nodeV());
      // boolean condition2 = nodeU().equals(other.nodeV()) && nodeV().equals(other.nodeU());
      // return condition1 || condition2;
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (9 lines)
in `guava/src/com/google/common/util/concurrent/Monitor.java`
#### Snippet
```java
   * cheap (typically one field read). Resurrect this method if you find that not to be true.
   */
  //   @GuardedBy("lock")
  //   private void signalNextWaiterSkipping(Guard guardToSkip) {
  //     for (Guard guard = activeGuards; guard != null; guard = guard.next) {
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (2 lines)
in `guava/src/com/google/common/collect/Ordering.java`
#### Snippet
```java
  @GwtCompatible(serializable = true)
  // type parameter <S> lets us avoid the extra <String> in statements like:
  // Ordering<Iterable<String>> o =
  //     Ordering.<String>natural().lexicographical();
  public <S extends T> Ordering<Iterable<S>> lexicographical() {
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (2 lines)
in `guava/src/com/google/common/primitives/Doubles.java`
#### Snippet
```java
    return ((Double) value).hashCode();
    // TODO(kevinb): do it this way when we can (GWT problem):
    // long bits = Double.doubleToLongBits(value);
    // return (int) (bits ^ (bits >>> 32));
  }
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (2 lines)
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    // work-around of a compiler type inference quirk that prevents the
    // following code from being compiled:
    // Comparator<Class<?>> comparator = null;
    // Map<Class<? extends Throwable>, String> map = newTreeMap(comparator);
    return new TreeMap<>(comparator);
```

## RuleId[ruleID=CStyleArrayDeclaration]
### RuleId[ruleID=CStyleArrayDeclaration]
C-style array declaration of parameter `b`
in `guava/src/com/google/common/io/ByteArrayDataOutput.java`
#### Snippet
```java

  @Override
  void write(byte b[]);

  @Override
```

### RuleId[ruleID=CStyleArrayDeclaration]
C-style array declaration of parameter `b`
in `guava/src/com/google/common/io/ByteArrayDataOutput.java`
#### Snippet
```java

  @Override
  void write(byte b[], int off, int len);

  @Override
```

### RuleId[ruleID=CStyleArrayDeclaration]
C-style array declaration of parameter `b`
in `guava/src/com/google/common/io/ByteStreams.java`
#### Snippet
```java

    @Override
    public void readFully(byte b[], int off, int len) {
      try {
        input.readFully(b, off, len);
```

### RuleId[ruleID=CStyleArrayDeclaration]
C-style array declaration of parameter `b`
in `guava/src/com/google/common/io/ByteStreams.java`
#### Snippet
```java

    @Override
    public void readFully(byte b[]) {
      try {
        input.readFully(b);
```

### RuleId[ruleID=CStyleArrayDeclaration]
C-style array declaration of parameter `b`
in `guava/src/com/google/common/io/ByteArrayDataInput.java`
#### Snippet
```java

  @Override
  void readFully(byte b[], int off, int len);

  // not guaranteed to skip n bytes so result should NOT be ignored
```

### RuleId[ruleID=CStyleArrayDeclaration]
C-style array declaration of parameter `b`
in `guava/src/com/google/common/io/ByteArrayDataInput.java`
#### Snippet
```java
public interface ByteArrayDataInput extends DataInput {
  @Override
  void readFully(byte b[]);

  @Override
```

## RuleId[ruleID=ManualArrayCopy]
### RuleId[ruleID=ManualArrayCopy]
Manual array copy
in `guava/src/com/google/common/escape/Escapers.java`
#### Snippet
```java
        if (hiChars != null) {
          // TODO: Is this faster than System.arraycopy() for small arrays?
          for (int n = 0; n < hiChars.length; ++n) {
            output[n] = hiChars[n];
          }
```

### RuleId[ruleID=ManualArrayCopy]
Manual array copy
in `guava/src/com/google/common/escape/Escapers.java`
#### Snippet
```java
        }
        if (loChars != null) {
          for (int n = 0; n < loChars.length; ++n) {
            output[hiCount + n] = loChars[n];
          }
```

### RuleId[ruleID=ManualArrayCopy]
Manual array copy
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
            if (cells == as) { // Expand table unless stale
              Cell[] rs = new Cell[n << 1];
              for (int i = 0; i < n; ++i) rs[i] = as[i];
              cells = rs;
            }
```

### RuleId[ruleID=ManualArrayCopy]
Manual array copy
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
            if (cells == as) { // Expand table unless stale
              Cell[] rs = new Cell[n << 1];
              for (int i = 0; i < n; ++i) rs[i] = as[i];
              cells = rs;
            }
```

## RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `guava/src/com/google/common/collect/TreeBasedTable.java`
#### Snippet
```java
    Iterator<C> merged =
        Iterators.mergeSorted(
            Iterables.transform(
                backingMap.values(), (Map<C, V> input) -> input.keySet().iterator()),
            comparator);
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
   */
  public final boolean anyMatch(Predicate<? super E> predicate) {
    return Iterables.any(getDelegate(), predicate);
  }

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
   */
  public final FluentIterable<E> filter(Predicate<? super E> predicate) {
    return from(Iterables.filter(getDelegate(), predicate));
  }

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
  public final <T extends @Nullable Object> FluentIterable<T> transform(
      Function<? super E, T> function) {
    return from(Iterables.transform(getDelegate(), function));
  }

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
   */
  public final boolean allMatch(Predicate<? super E> predicate) {
    return Iterables.all(getDelegate(), predicate);
  }

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
  @GwtIncompatible // Class.isInstance
  public final <T> FluentIterable<T> filter(Class<T> type) {
    return from(Iterables.filter(getDelegate(), type));
  }

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `guava/src/com/google/common/collect/Collections2.java`
#### Snippet
```java
    @Override
    public boolean isEmpty() {
      return !Iterables.any(unfiltered, predicate);
    }

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `guava/src/com/google/common/collect/SortedLists.java`
#### Snippet
```java
      KeyAbsentBehavior absentBehavior) {
    return binarySearch(
        Lists.transform(list, keyFunction), key, keyComparator, presentBehavior, absentBehavior);
  }

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `guava/src/com/google/common/reflect/Types.java`
#### Snippet
```java
          .append(rawType.getName())
          .append('<')
          .append(COMMA_JOINER.join(transform(argumentsList, JavaVersion.CURRENT::typeName)))
          .append('>')
          .toString();
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `guava/src/com/google/common/reflect/Types.java`
#### Snippet
```java

  private static Iterable<Type> filterUpperBounds(Iterable<Type> bounds) {
    return Iterables.filter(bounds, Predicates.not(Predicates.<Type>equalTo(Object.class)));
  }

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
    @CheckForNull
    public E ceiling(@ParametricNullness E e) {
      return Iterables.find(unfiltered().tailSet(e, true), predicate, null);
    }

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
    @CheckForNull
    public E higher(@ParametricNullness E e) {
      return Iterables.find(unfiltered().tailSet(e, false), predicate, null);
    }

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `guava/src/com/google/common/collect/Iterables.java`
#### Snippet
```java
    checkNotNull(unfiltered);
    checkNotNull(desiredType);
    return (Iterable<T>) filter(unfiltered, Predicates.instanceOf(desiredType));
  }

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `guava/src/com/google/common/collect/Iterables.java`
#### Snippet
```java
          public Iterator<T> iterator() {
            return Iterators.mergeSorted(
                Iterables.transform(iterables, Iterables.<T>toIterator()), comparator);
          }
        };
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
      Function<? super V1, V2> function = Maps.asValueToValueFunction(transformer, key);
      if (values instanceof List) {
        return Lists.transform((List<V1>) values, function);
      } else {
        return Collections2.transform(values, function);
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    @Override
    List<V2> transform(@ParametricNullness K key, Collection<V1> values) {
      return Lists.transform((List<V1>) values, Maps.asValueToValueFunction(transformer, key));
    }

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    @Override
    public boolean isEmpty() {
      return !Iterables.any(unfiltered.entrySet(), entryPredicate);
    }

```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `guava/src/com/google/common/escape/ArrayBasedEscaperMap.java`
#### Snippet
```java
    char max = Collections.max(map.keySet());
    char[][] replacements = new char[max + 1][];
    for (Character c : map.keySet()) {
      replacements[c] = map.get(c).toCharArray();
    }
```

## RuleId[ruleID=NotNullFieldNotInitialized]
### RuleId[ruleID=NotNullFieldNotInitialized]
@ElementTypesAreNonnullByDefault fields must be initialized
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java

  private transient Map<K, V> delegate;
  @RetainedWith transient AbstractBiMap<V, K> inverse;

  /** Package-private constructor for creating a map-backed bimap. */
```

### RuleId[ruleID=NotNullFieldNotInitialized]
@ElementTypesAreNonnullByDefault fields must be initialized
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java
    extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {

  private transient Map<K, V> delegate;
  @RetainedWith transient AbstractBiMap<V, K> inverse;

```

### RuleId[ruleID=NotNullFieldNotInitialized]
@ElementTypesAreNonnullByDefault fields must be initialized
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
   * constructor calls (as does readObject()).
   */
  private transient @Nullable BiEntry<K, V>[] hashTableKToV;
  private transient @Nullable BiEntry<K, V>[] hashTableVToK;
  @Weak @CheckForNull private transient BiEntry<K, V> firstInKeyInsertionOrder;
```

### RuleId[ruleID=NotNullFieldNotInitialized]
@ElementTypesAreNonnullByDefault fields must be initialized
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
   */
  private transient @Nullable BiEntry<K, V>[] hashTableKToV;
  private transient @Nullable BiEntry<K, V>[] hashTableVToK;
  @Weak @CheckForNull private transient BiEntry<K, V> firstInKeyInsertionOrder;
  @Weak @CheckForNull private transient BiEntry<K, V> lastInKeyInsertionOrder;
```

### RuleId[ruleID=NotNullFieldNotInitialized]
@ElementTypesAreNonnullByDefault fields must be initialized
in `guava/src/com/google/common/collect/MinMaxPriorityQueue.java`
#### Snippet
```java
  private class Heap {
    final Ordering<E> ordering;
    @Weak Heap otherHeap; // always initialized immediately after construction

    Heap(Ordering<E> ordering) {
```

## RuleId[ruleID=UnnecessaryQualifierForThis]
### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `PerListenerQueue` on 'this' is unnecessary in this context
in `guava/src/com/google/common/util/concurrent/ListenerCallQueue.java`
#### Snippet
```java
          ListenerCallQueue.Event<L> nextToRun;
          Object nextLabel;
          synchronized (PerListenerQueue.this) {
            Preconditions.checkState(isThreadScheduled);
            nextToRun = waitQueue.poll();
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `PerListenerQueue` on 'this' is unnecessary in this context
in `guava/src/com/google/common/util/concurrent/ListenerCallQueue.java`
#### Snippet
```java
          // An Error is bubbling up. We should mark ourselves as no longer running. That way, if
          // anyone tries to keep using us, we won't be corrupted.
          synchronized (PerListenerQueue.this) {
            isThreadScheduled = false;
          }
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `SubRangeMapAsMap` on 'this' is unnecessary in this context
in `guava/src/com/google/common/collect/TreeRangeMap.java`
#### Snippet
```java
      @Override
      public Set<Range<K>> keySet() {
        return new Maps.KeySet<Range<K>, V>(SubRangeMapAsMap.this) {
          @Override
          public boolean remove(@CheckForNull Object o) {
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `ValueSet` on 'this' is unnecessary in this context
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
      checkNotNull(action);
      for (ValueSetLink<K, V> entry = firstEntry;
          entry != ValueSet.this;
          entry = entry.getSuccessorInValueSet()) {
        action.accept(((ValueEntry<K, V>) entry).getValue());
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `LocalCache` on 'this' is unnecessary in this context
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        if (value == null || !filter.test(key, value)) {
          break;
        } else if (LocalCache.this.remove(key, value)) {
          changed = true;
          break;
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `LoadingValueReference` on 'this' is unnecessary in this context
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
            newValue,
            newResult -> {
              LoadingValueReference.this.set(newResult);
              return newResult;
            },
```

## RuleId[ruleID=FinalPrivateMethod]
### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `guava/src/com/google/common/graph/StandardValueGraph.java`
#### Snippet
```java
  }

  private final GraphConnections<N, V> checkedConnections(N node) {
    GraphConnections<N, V> connections = nodeConnections.get(node);
    if (connections == null) {
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `guava/src/com/google/common/graph/StandardValueGraph.java`
#### Snippet
```java

  @CheckForNull
  private final V edgeValueOrDefaultInternal(N nodeU, N nodeV, @CheckForNull V defaultValue) {
    GraphConnections<N, V> connectionsU = nodeConnections.get(nodeU);
    V value = (connectionsU == null) ? null : connectionsU.value(nodeV);
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `guava/src/com/google/common/graph/StandardValueGraph.java`
#### Snippet
```java
  }

  private final boolean hasEdgeConnectingInternal(N nodeU, N nodeV) {
    GraphConnections<N, V> connectionsU = nodeConnections.get(nodeU);
    return (connectionsU != null) && connectionsU.successors().contains(nodeV);
```

## RuleId[ruleID=DuplicateExpressions]
### RuleId[ruleID=DuplicateExpressions]
Multiple occurrences of `(cmpXToRoundArbitrarily <= 0) ? roundArbitrarily : Math.nextUp(roundArbitrarily)`
in `guava/src/com/google/common/math/ToDoubleRounder.java`
#### Snippet
```java
            : DoubleUtils.nextDown(roundArbitrarily);
      case CEILING:
        return (cmpXToRoundArbitrarily <= 0) ? roundArbitrarily : Math.nextUp(roundArbitrarily);
      case DOWN:
        if (sign(x) >= 0) {
```

### RuleId[ruleID=DuplicateExpressions]
Multiple occurrences of `(cmpXToRoundArbitrarily <= 0) ? roundArbitrarily : Math.nextUp(roundArbitrarily)`
in `guava/src/com/google/common/math/ToDoubleRounder.java`
#### Snippet
```java
              : DoubleUtils.nextDown(roundArbitrarily);
        } else {
          return (cmpXToRoundArbitrarily <= 0) ? roundArbitrarily : Math.nextUp(roundArbitrarily);
        }
      case UP:
```

### RuleId[ruleID=DuplicateExpressions]
Multiple occurrences of `(cmpXToRoundArbitrarily <= 0) ? roundArbitrarily : Math.nextUp(roundArbitrarily)`
in `guava/src/com/google/common/math/ToDoubleRounder.java`
#### Snippet
```java
      case UP:
        if (sign(x) >= 0) {
          return (cmpXToRoundArbitrarily <= 0) ? roundArbitrarily : Math.nextUp(roundArbitrarily);
        } else {
          return (cmpXToRoundArbitrarily >= 0)
```

### RuleId[ruleID=DuplicateExpressions]
Multiple occurrences of `(cmpXToRoundArbitrarily <= 0) ? roundArbitrarily : Math.nextUp(roundArbitrarily)`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
            : DoubleUtils.nextDown(roundArbitrarily);
      case CEILING:
        return (cmpXToRoundArbitrarily <= 0) ? roundArbitrarily : Math.nextUp(roundArbitrarily);
      case DOWN:
        if (x >= 0) {
```

### RuleId[ruleID=DuplicateExpressions]
Multiple occurrences of `(cmpXToRoundArbitrarily <= 0) ? roundArbitrarily : Math.nextUp(roundArbitrarily)`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
              : DoubleUtils.nextDown(roundArbitrarily);
        } else {
          return (cmpXToRoundArbitrarily <= 0) ? roundArbitrarily : Math.nextUp(roundArbitrarily);
        }
      case UP:
```

### RuleId[ruleID=DuplicateExpressions]
Multiple occurrences of `(cmpXToRoundArbitrarily <= 0) ? roundArbitrarily : Math.nextUp(roundArbitrarily)`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
      case UP:
        if (x >= 0) {
          return (cmpXToRoundArbitrarily <= 0) ? roundArbitrarily : Math.nextUp(roundArbitrarily);
        } else {
          return (cmpXToRoundArbitrarily >= 0)
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`stringValue.length() == 0` can be replaced with 'stringValue.isEmpty()'
in `guava/src/com/google/common/primitives/ParseRequest.java`
#### Snippet
```java

  static ParseRequest fromString(String stringValue) {
    if (stringValue.length() == 0) {
      throw new NumberFormatException("empty string");
    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`separator.length() != 0` can be replaced with '!separator.isEmpty()'
in `guava/src/com/google/common/base/Splitter.java`
#### Snippet
```java
   */
  public static Splitter on(final String separator) {
    checkArgument(separator.length() != 0, "The separator may not be the empty string.");
    if (separator.length() == 1) {
      return Splitter.on(separator.charAt(0));
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`string.length() == 0` can be replaced with 'string.isEmpty()'
in `guava/src/com/google/common/primitives/UnsignedLongs.java`
#### Snippet
```java
  public static long parseUnsignedLong(String string, int radix) {
    checkNotNull(string);
    if (string.length() == 0) {
      throw new NumberFormatException("empty string");
    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`domain.length() > 0` can be replaced with '!domain.isEmpty()'
in `guava/src/com/google/thirdparty/publicsuffix/TrieParser.java`
#### Snippet
```java
      String domain = DIRECT_JOINER.join(stack);

      if (domain.length() > 0) {
        builder.put(domain, PublicSuffixType.fromCode(c));
      }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`pathname.length() == 0` can be replaced with 'pathname.isEmpty()'
in `guava/src/com/google/common/io/Files.java`
#### Snippet
```java
  public static String simplifyPath(String pathname) {
    checkNotNull(pathname);
    if (pathname.length() == 0) {
      return ".";
    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`path.size() > 0` can be replaced with '!path.isEmpty()'
in `guava/src/com/google/common/io/Files.java`
#### Snippet
```java
          continue;
        case "..":
          if (path.size() > 0 && !path.get(path.size() - 1).equals("..")) {
            path.remove(path.size() - 1);
          } else {
```

## RuleId[ruleID=UnnecessaryReturn]
### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `guava/src/com/google/common/collect/TopKSelector.java`
#### Snippet
```java
  public void offer(@ParametricNullness T elem) {
    if (k == 0) {
      return;
    } else if (bufferSize == 0) {
      buffer[0] = elem;
```

## RuleId[ruleID=NonShortCircuitBoolean]
### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `localValue != null & !(localValue instanceof SetFuture)`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
  public boolean isDone() {
    final Object localValue = value;
    return localValue != null & !(localValue instanceof SetFuture);
  }

```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `!GENERATE_CANCELLATION_CAUSES & wasCancelled`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    boolean wasCancelled = future.isCancelled();
    // Don't allocate a CancellationException if it's not necessary
    if (!GENERATE_CANCELLATION_CAUSES & wasCancelled) {
      /*
       * requireNonNull is safe because we've initialized CAUSELESS_CANCELLED if
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `related != null & isCancelled()`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
   */
  final void maybePropagateCancellationTo(@CheckForNull Future<?> related) {
    if (related != null & isCancelled()) {
      related.cancel(wasInterrupted());
    }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `localValue != null & !(localValue instanceof SetFuture)`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    }
    Object localValue = value;
    if (localValue != null & !(localValue instanceof SetFuture)) {
      return getDoneValue(localValue);
    }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `localValue != null & !(localValue instanceof SetFuture)`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
              // wakeup
              localValue = value;
              if (localValue != null & !(localValue instanceof SetFuture)) {
                return getDoneValue(localValue);
              }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `localValue != null & !(localValue instanceof SetFuture)`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    while (remainingNanos > 0) {
      localValue = value;
      if (localValue != null & !(localValue instanceof SetFuture)) {
        return getDoneValue(localValue);
      }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `localValue == null | localValue instanceof SetFuture`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    Object localValue = value;
    boolean rValue = false;
    if (localValue == null | localValue instanceof SetFuture) {
      // Try to delay allocating the exception. At this point we may still lose the CAS, but it is
      // certainly less likely.
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `localValue == null | localValue instanceof SetFuture`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
              AbstractFuture<?> trusted = (AbstractFuture<?>) futureToPropagateTo;
              localValue = trusted.value;
              if (localValue == null | localValue instanceof SetFuture) {
                abstractFuture = trusted;
                continue; // loop back up and try to complete the new future
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `localValue != null & !(localValue instanceof SetFuture)`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    }
    Object localValue = value;
    if (localValue != null & !(localValue instanceof SetFuture)) {
      return getDoneValue(localValue);
    }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `localValue != null & !(localValue instanceof SetFuture)`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
            // wakeup
            localValue = value;
            if (localValue != null & !(localValue instanceof SetFuture)) {
              return getDoneValue(localValue);
            }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `bitsChanged |= bits.set(combinedHash % bitSize)`
in `guava/src/com/google/common/hash/BloomFilterStrategies.java`
#### Snippet
```java
          combinedHash = ~combinedHash;
        }
        bitsChanged |= bits.set(combinedHash % bitSize);
      }
      return bitsChanged;
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `bitsChanged |= bits.set((combinedHash & Long.MAX_VALUE) % bitSize)`
in `guava/src/com/google/common/hash/BloomFilterStrategies.java`
#### Snippet
```java
      for (int i = 0; i < numHashFunctions; i++) {
        // Make the combined hash positive and indexable
        bitsChanged |= bits.set((combinedHash & Long.MAX_VALUE) % bitSize);
        combinedHash += hash2;
      }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `areEqual &= (this.bytes[i] == that.getBytesInternal()[i])`
in `guava/src/com/google/common/hash/HashCode.java`
#### Snippet
```java
      boolean areEqual = true;
      for (int i = 0; i < this.bytes.length; i++) {
        areEqual &= (this.bytes[i] == that.getBytesInternal()[i]);
      }
      return areEqual;
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `cmp > 0 | (cmp == 0 & getUpperBoundType() == OPEN)`
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
    T ubound = uncheckedCastNullableTToT(getUpperEndpoint());
    int cmp = comparator.compare(t, ubound);
    return cmp > 0 | (cmp == 0 & getUpperBoundType() == OPEN);
  }

```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `cmp == 0 & getUpperBoundType() == OPEN`
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
    T ubound = uncheckedCastNullableTToT(getUpperEndpoint());
    int cmp = comparator.compare(t, ubound);
    return cmp > 0 | (cmp == 0 & getUpperBoundType() == OPEN);
  }

```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `cmp < 0 | (cmp == 0 & getLowerBoundType() == OPEN)`
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
    T lbound = uncheckedCastNullableTToT(getLowerEndpoint());
    int cmp = comparator.compare(t, lbound);
    return cmp < 0 | (cmp == 0 & getLowerBoundType() == OPEN);
  }

```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `cmp == 0 & getLowerBoundType() == OPEN`
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
    T lbound = uncheckedCastNullableTToT(getLowerEndpoint());
    int cmp = comparator.compare(t, lbound);
    return cmp < 0 | (cmp == 0 & getLowerBoundType() == OPEN);
  }

```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `mode == HALF_EVEN & (div & 1) != 0`
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
        // cmpRemToHalfDivisor has the same sign as compare(abs(rem), abs(q) / 2).
        if (cmpRemToHalfDivisor == 0) { // exactly on the half mark
          increment = (mode == HALF_UP || (mode == HALF_EVEN & (div & 1) != 0));
        } else {
          increment = cmpRemToHalfDivisor > 0; // closer to the UP value
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `-FLOOR_SQRT_MAX_INT > b | b > FLOOR_SQRT_MAX_INT`
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
          k >>= 1;
          if (k > 0) {
            if (-FLOOR_SQRT_MAX_INT > b | b > FLOOR_SQRT_MAX_INT) {
              return limit;
            }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `x > 0 & (x & (x - 1)) == 0`
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
   */
  public static boolean isPowerOfTwo(int x) {
    return x > 0 & (x & (x - 1)) == 0;
  }

```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `-FLOOR_SQRT_MAX_INT <= b & b <= FLOOR_SQRT_MAX_INT`
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
          k >>= 1;
          if (k > 0) {
            checkNoOverflow(-FLOOR_SQRT_MAX_INT <= b & b <= FLOOR_SQRT_MAX_INT, "checkedPow", b, k);
            b *= b;
          }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `changed |= put(entry.getKey(), entry.getValue())`
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
    boolean changed = false;
    for (Entry<? extends K, ? extends V> entry : multimap.entries()) {
      changed |= put(entry.getKey(), entry.getValue());
    }
    return changed;
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `changed |= multisetToModify.remove(o)`
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
      boolean changed = false;
      for (Object o : occurrencesToRemove) {
        changed |= multisetToModify.remove(o);
      }
      return changed;
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `isCancelled() & localFutures != null`
in `guava/src/com/google/common/util/concurrent/AggregateFuture.java`
#### Snippet
```java
    releaseResources(OUTPUT_FUTURE_DONE); // nulls out `futures`

    if (isCancelled() & localFutures != null) {
      boolean wasInterrupted = wasInterrupted();
      for (Future<?> future : localFutures) {
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `b >= -2 & b <= 2`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
  public static long checkedPow(long b, int k) {
    checkNonNegative("exponent", k);
    if (b >= -2 & b <= 2) {
      switch ((int) b) {
        case 0:
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `b >= -2 & b <= 2`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
  public static long saturatedPow(long b, int k) {
    checkNonNegative("exponent", k);
    if (b >= -2 & b <= 2) {
      switch ((int) b) {
        case 0:
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `-FLOOR_SQRT_MAX_LONG > b | b > FLOOR_SQRT_MAX_LONG`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
          k >>= 1;
          if (k > 0) {
            if (-FLOOR_SQRT_MAX_LONG > b | b > FLOOR_SQRT_MAX_LONG) {
              return limit;
            }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `(a ^ b) >= 0 | (a ^ result) >= 0`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
  public static long checkedSubtract(long a, long b) {
    long result = a - b;
    checkNoOverflow((a ^ b) >= 0 | (a ^ result) >= 0, "checkedSubtract", a, b);
    return result;
  }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `x > 0 & (x & (x - 1)) == 0`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
  @SuppressWarnings("ShortCircuitBoolean")
  public static boolean isPowerOfTwo(long x) {
    return x > 0 & (x & (x - 1)) == 0;
  }

```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `a >= 0 | b != Long.MIN_VALUE`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    }
    checkNoOverflow(leadingZeros >= Long.SIZE, "checkedMultiply", a, b);
    checkNoOverflow(a >= 0 | b != Long.MIN_VALUE, "checkedMultiply", a, b);
    long result = a * b;
    checkNoOverflow(a == 0 || result / a == b, "checkedMultiply", a, b);
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `(a ^ b) < 0 | (a ^ result) >= 0`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
  public static long checkedAdd(long a, long b) {
    long result = a + b;
    checkNoOverflow((a ^ b) < 0 | (a ^ result) >= 0, "checkedAdd", a, b);
    return result;
  }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `(a ^ b) >= 0 | (a ^ naiveDifference) >= 0`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
  public static long saturatedSubtract(long a, long b) {
    long naiveDifference = a - b;
    if ((a ^ b) >= 0 | (a ^ naiveDifference) >= 0) {
      // If a and b have the same signs or a has the same sign as the result then there was no
      // overflow, return.
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `leadingZeros < Long.SIZE | (a < 0 & b == Long.MIN_VALUE)`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    // the return value if we will overflow (which we calculate by overflowing a long :) )
    long limit = Long.MAX_VALUE + ((a ^ b) >>> (Long.SIZE - 1));
    if (leadingZeros < Long.SIZE | (a < 0 & b == Long.MIN_VALUE)) {
      // overflow
      return limit;
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `a < 0 & b == Long.MIN_VALUE`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    // the return value if we will overflow (which we calculate by overflowing a long :) )
    long limit = Long.MAX_VALUE + ((a ^ b) >>> (Long.SIZE - 1));
    if (leadingZeros < Long.SIZE | (a < 0 & b == Long.MIN_VALUE)) {
      // overflow
      return limit;
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `(a ^ b) < 0 | (a ^ naiveSum) >= 0`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
  public static long saturatedAdd(long a, long b) {
    long naiveSum = a + b;
    if ((a ^ b) < 0 | (a ^ naiveSum) >= 0) {
      // If a and b have different signs or a has the same sign as the result then there was no
      // overflow, return.
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `isParallel |= stream.isParallel()`
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
        new ImmutableList.Builder<>(streams.length);
    for (DoubleStream stream : streams) {
      isParallel |= stream.isParallel();
      Spliterator.OfDouble splitr = stream.spliterator();
      splitrsBuilder.add(splitr);
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `isParallel |= stream.isParallel()`
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
        new ImmutableList.Builder<>(streams.length);
    for (Stream<? extends T> stream : streams) {
      isParallel |= stream.isParallel();
      Spliterator<? extends T> splitr = stream.spliterator();
      splitrsBuilder.add(splitr);
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `isParallel |= stream.isParallel()`
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
        new ImmutableList.Builder<>(streams.length);
    for (LongStream stream : streams) {
      isParallel |= stream.isParallel();
      Spliterator.OfLong splitr = stream.spliterator();
      splitrsBuilder.add(splitr);
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `isParallel |= stream.isParallel()`
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
        new ImmutableList.Builder<>(streams.length);
    for (IntStream stream : streams) {
      isParallel |= stream.isParallel();
      Spliterator.OfInt splitr = stream.spliterator();
      splitrsBuilder.add(splitr);
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `isCancelled() | localInputFuture == null | localFunction == null`
in `guava/src/com/google/common/util/concurrent/AbstractTransformFuture.java`
#### Snippet
```java
    ListenableFuture<? extends I> localInputFuture = inputFuture;
    F localFunction = function;
    if (isCancelled() | localInputFuture == null | localFunction == null) {
      return;
    }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `localInputFuture == null | localExceptionType == null | localFallback == null`
in `guava/src/com/google/common/util/concurrent/AbstractCatchingFuture.java`
#### Snippet
```java
    Class<X> localExceptionType = exceptionType;
    F localFallback = fallback;
    if (localInputFuture == null | localExceptionType == null | localFallback == null
        // This check, unlike all the others, is a volatile read
        || isCancelled()) {
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `interruptedDuringTask |= Thread.interrupted()`
in `guava/src/com/google/common/util/concurrent/SequentialExecutor.java`
#### Snippet
```java
          // it is sent, so subsequent tasks in the queue should not be caused to be interrupted
          // by a previous one in the queue being interrupted.
          interruptedDuringTask |= Thread.interrupted();
          try {
            task.run();
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `exponent < 0 & !isPowerOfTwo(x)`
in `guava/src/com/google/common/math/DoubleMath.java`
#### Snippet
```java
        break;
      case DOWN:
        increment = exponent < 0 & !isPowerOfTwo(x);
        break;
      case UP:
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `exponent >= 0 & !isPowerOfTwo(x)`
in `guava/src/com/google/common/math/DoubleMath.java`
#### Snippet
```java
        break;
      case UP:
        increment = exponent >= 0 & !isPowerOfTwo(x);
        break;
      case HALF_DOWN:
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `MIN_LONG_AS_DOUBLE - x < 1.0 & x < MAX_LONG_AS_DOUBLE_PLUS_ONE`
in `guava/src/com/google/common/math/DoubleMath.java`
#### Snippet
```java
  public static BigInteger roundToBigInteger(double x, RoundingMode mode) {
    x = roundIntermediate(x, mode);
    if (MIN_LONG_AS_DOUBLE - x < 1.0 & x < MAX_LONG_AS_DOUBLE_PLUS_ONE) {
      return BigInteger.valueOf((long) x);
    }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `MIN_LONG_AS_DOUBLE - z < 1.0 & z < MAX_LONG_AS_DOUBLE_PLUS_ONE`
in `guava/src/com/google/common/math/DoubleMath.java`
#### Snippet
```java
    double z = roundIntermediate(x, mode);
    checkInRangeForRoundingInputs(
        MIN_LONG_AS_DOUBLE - z < 1.0 & z < MAX_LONG_AS_DOUBLE_PLUS_ONE, x, mode);
    return (long) z;
  }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `z > MIN_INT_AS_DOUBLE - 1.0 & z < MAX_INT_AS_DOUBLE + 1.0`
in `guava/src/com/google/common/math/DoubleMath.java`
#### Snippet
```java
    double z = roundIntermediate(x, mode);
    checkInRangeForRoundingInputs(
        z > MIN_INT_AS_DOUBLE - 1.0 & z < MAX_INT_AS_DOUBLE + 1.0, x, mode);
    return (int) z;
  }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `log &= from != State.STARTING`
in `guava/src/com/google/common/util/concurrent/ServiceManager.java`
#### Snippet
```java
         * exceptions. We don't need to log those exceptions again.
         */
        log &= from != State.STARTING;
        if (log) {
          logger.log(
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `changed |= set.remove(iterator.next())`
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
    boolean changed = false;
    while (iterator.hasNext()) {
      changed |= set.remove(iterator.next());
    }
    return changed;
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `wasModified |= addTo.add(iterator.next())`
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
    boolean wasModified = false;
    while (iterator.hasNext()) {
      wasModified |= addTo.add(iterator.next());
    }
    return wasModified;
```

## RuleId[ruleID=ManualMinMaxCalculation]
### RuleId[ruleID=ManualMinMaxCalculation]
Can be replaced with 'Math.max()' call
in `guava/src/com/google/common/math/PairedStats.java`
#### Snippet
```java
      return 1.0;
    }
    if (value <= -1.0) {
      return -1.0;
    }
```

## RuleId[ruleID=TrivialStringConcatenation]
### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `guava/src/com/google/common/hash/SipHashFunction.java`
#### Snippet
```java
  @Override
  public String toString() {
    return "Hashing.sipHash" + c + "" + d + "(" + k0 + ", " + k1 + ")";
  }

```

## RuleId[ruleID=AbstractClassNeverImplemented]
### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ForwardingImmutableMap` has no concrete subclass
in `guava/src/com/google/common/collect/ForwardingImmutableMap.java`
#### Snippet
```java
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
abstract class ForwardingImmutableMap<K, V> {
  private ForwardingImmutableMap() {}
}
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SimpleForwardingLoadingCache` has no concrete subclass
in `guava/src/com/google/common/cache/ForwardingLoadingCache.java`
#### Snippet
```java
   * @since 10.0
   */
  public abstract static class SimpleForwardingLoadingCache<K, V>
      extends ForwardingLoadingCache<K, V> {
    private final LoadingCache<K, V> delegate;
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ForwardingImmutableList` has no concrete subclass
in `guava/src/com/google/common/collect/ForwardingImmutableList.java`
#### Snippet
```java
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
abstract class ForwardingImmutableList<E> {
  private ForwardingImmutableList() {}
}
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ForwardingImmutableSet` has no concrete subclass
in `guava/src/com/google/common/collect/ForwardingImmutableSet.java`
#### Snippet
```java
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
abstract class ForwardingImmutableSet<E> {
  private ForwardingImmutableSet() {}
}
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `FinalizablePhantomReference` has no concrete subclass
in `guava/src/com/google/common/base/FinalizablePhantomReference.java`
#### Snippet
```java
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class FinalizablePhantomReference<T> extends PhantomReference<T>
    implements FinalizableReference {
  /**
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SimpleForwardingFuture` has no concrete subclass
in `guava/src/com/google/common/util/concurrent/ForwardingFuture.java`
#### Snippet
```java
   * @since 9.0
   */
  public abstract static class SimpleForwardingFuture<V extends @Nullable Object>
      extends ForwardingFuture<V> {
    private final Future<V> delegate;
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ForwardingBlockingQueue` has no concrete subclass
in `guava/src/com/google/common/util/concurrent/ForwardingBlockingQueue.java`
#### Snippet
```java
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingBlockingQueue<E> extends ForwardingQueue<E>
    implements BlockingQueue<E> {

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ForwardingBlockingDeque` has no concrete subclass
in `guava/src/com/google/common/collect/ForwardingBlockingDeque.java`
#### Snippet
```java
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingBlockingDeque<E> extends ForwardingDeque<E>
    implements BlockingDeque<E> {

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ForwardingExecutorService` has no concrete subclass
in `guava/src/com/google/common/util/concurrent/ForwardingExecutorService.java`
#### Snippet
```java
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingExecutorService extends ForwardingObject
    implements ExecutorService {
  /** Constructor for use by subclasses. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `FinalizableSoftReference` has no concrete subclass
in `guava/src/com/google/common/base/FinalizableSoftReference.java`
#### Snippet
```java
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class FinalizableSoftReference<T> extends SoftReference<T>
    implements FinalizableReference {
  /**
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ForwardingBlockingDeque` has no concrete subclass
in `guava/src/com/google/common/util/concurrent/ForwardingBlockingDeque.java`
#### Snippet
```java
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingBlockingDeque<E> extends ForwardingDeque<E>
    implements BlockingDeque<E> {

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SimpleForwardingCache` has no concrete subclass
in `guava/src/com/google/common/cache/ForwardingCache.java`
#### Snippet
```java
   * @since 10.0
   */
  public abstract static class SimpleForwardingCache<K, V> extends ForwardingCache<K, V> {
    private final Cache<K, V> delegate;

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ForwardingListeningExecutorService` has no concrete subclass
in `guava/src/com/google/common/util/concurrent/ForwardingListeningExecutorService.java`
#### Snippet
```java
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingListeningExecutorService extends ForwardingExecutorService
    implements ListeningExecutorService {
  /** Constructor for use by subclasses. */
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `guava/src/com/google/common/collect/ImmutableMapEntry.java`
#### Snippet
```java
  }

  ImmutableMapEntry(ImmutableMapEntry<K, V> contents) {
    super(contents.getKey(), contents.getValue());
    // null check would be redundant
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/collect/ImmutableMapEntry.java`
#### Snippet
```java
  }

  ImmutableMapEntry(ImmutableMapEntry<K, V> contents) {
    super(contents.getKey(), contents.getValue());
    // null check would be redundant
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/collect/JdkBackedImmutableMap.java`
#### Snippet
```java
  private final transient ImmutableList<Entry<K, V>> entries;

  JdkBackedImmutableMap(Map<K, V> delegateMap, ImmutableList<Entry<K, V>> entries) {
    this.delegateMap = delegateMap;
    this.entries = entries;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Entry`
in `guava/src/com/google/common/collect/JdkBackedImmutableMap.java`
#### Snippet
```java
  private final transient ImmutableList<Entry<K, V>> entries;

  JdkBackedImmutableMap(Map<K, V> delegateMap, ImmutableList<Entry<K, V>> entries) {
    this.delegateMap = delegateMap;
    this.entries = entries;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/collect/RegularImmutableMap.java`
#### Snippet
```java
    final RegularImmutableMap<K, V> map;

    Values(RegularImmutableMap<K, V> map) {
      this.map = map;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Entry`
in `guava/src/com/google/common/collect/RegularImmutableMap.java`
#### Snippet
```java
   */
  static <K, V> Entry<K, V>[] removeDuplicates(
      Entry<K, V>[] entries, int n, int newN, IdentityHashMap<Entry<K, V>, Boolean> duplicates) {
    Entry<K, V>[] newEntries = createEntryArray(newN);
    for (int in = 0, out = 0; in < n; in++) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `guava/src/com/google/common/collect/RegularImmutableMap.java`
#### Snippet
```java
    private final RegularImmutableMap<K, ?> map;

    KeySet(RegularImmutableMap<K, ?> map) {
      this.map = map;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends HashFunction`
in `guava/src/com/google/common/hash/Hashing.java`
#### Snippet
```java
   * @since 19.0
   */
  public static HashFunction concatenating(Iterable<HashFunction> hashFunctions) {
    checkNotNull(hashFunctions);
    // We can't use Iterables.toArray() here because there's no hash->collect dependency
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Waiter`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java

    SafeAtomicHelper(
        AtomicReferenceFieldUpdater<Waiter, Thread> waiterThreadUpdater,
        AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater,
        AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Thread`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java

    SafeAtomicHelper(
        AtomicReferenceFieldUpdater<Waiter, Thread> waiterThreadUpdater,
        AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater,
        AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Waiter`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    SafeAtomicHelper(
        AtomicReferenceFieldUpdater<Waiter, Thread> waiterThreadUpdater,
        AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater,
        AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater,
        AtomicReferenceFieldUpdater<AbstractFuture, Listener> listenersUpdater,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Waiter`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    SafeAtomicHelper(
        AtomicReferenceFieldUpdater<Waiter, Thread> waiterThreadUpdater,
        AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater,
        AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater,
        AtomicReferenceFieldUpdater<AbstractFuture, Listener> listenersUpdater,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AbstractFuture`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
        AtomicReferenceFieldUpdater<Waiter, Thread> waiterThreadUpdater,
        AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater,
        AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater,
        AtomicReferenceFieldUpdater<AbstractFuture, Listener> listenersUpdater,
        AtomicReferenceFieldUpdater<AbstractFuture, Object> valueUpdater) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AbstractFuture`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
        AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater,
        AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater,
        AtomicReferenceFieldUpdater<AbstractFuture, Listener> listenersUpdater,
        AtomicReferenceFieldUpdater<AbstractFuture, Object> valueUpdater) {
      this.waiterThreadUpdater = waiterThreadUpdater;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AbstractFuture`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
        AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater,
        AtomicReferenceFieldUpdater<AbstractFuture, Listener> listenersUpdater,
        AtomicReferenceFieldUpdater<AbstractFuture, Object> valueUpdater) {
      this.waiterThreadUpdater = waiterThreadUpdater;
      this.waiterNextUpdater = waiterNextUpdater;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super E1`
in `guava/src/com/google/common/graph/NetworkBuilder.java`
#### Snippet
```java
   * <p>The default value is {@link ElementOrder#insertion() insertion order}.
   */
  public <E1 extends E> NetworkBuilder<N, E1> edgeOrder(ElementOrder<E1> edgeOrder) {
    NetworkBuilder<N, E1> newBuilder = cast();
    newBuilder.edgeOrder = checkNotNull(edgeOrder);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Path`
in `guava/src/com/google/common/io/MoreFiles.java`
#### Snippet
```java
  @CheckForNull
  private static Collection<IOException> deleteDirectoryContentsInsecure(
      DirectoryStream<Path> dir) {
    Collection<IOException> exceptions = null;
    try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Path`
in `guava/src/com/google/common/io/MoreFiles.java`
#### Snippet
```java
  /** Returns whether or not the file with the given name in the given dir is a directory. */
  private static boolean isDirectory(
      SecureDirectoryStream<Path> dir, Path name, LinkOption... options) throws IOException {
    return dir.getFileAttributeView(name, BasicFileAttributeView.class, options)
        .readAttributes()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends IOException`
in `guava/src/com/google/common/io/MoreFiles.java`
#### Snippet
```java

  @CheckForNull
  private static NoSuchFileException pathNotFound(Path path, Collection<IOException> exceptions) {
    if (exceptions.size() != 1) {
      return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/MutableClassToInstanceMap.java`
#### Snippet
```java
  @Override
  @CheckForNull
  public <T extends B> T putInstance(Class<T> type, T value) {
    return cast(type, put(type, value));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `guava/src/com/google/common/collect/SingletonImmutableTable.java`
#### Snippet
```java
  }

  SingletonImmutableTable(Cell<R, C, V> cell) {
    this(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends C`
in `guava/src/com/google/common/collect/SingletonImmutableTable.java`
#### Snippet
```java
  }

  SingletonImmutableTable(Cell<R, C, V> cell) {
    this(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/collect/SingletonImmutableTable.java`
#### Snippet
```java
  }

  SingletonImmutableTable(Cell<R, C, V> cell) {
    this(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/graph/UndirectedMultiNetworkConnections.java`
#### Snippet
```java
  }

  static <N, E> UndirectedMultiNetworkConnections<N, E> ofImmutable(Map<E, N> incidentEdges) {
    return new UndirectedMultiNetworkConnections<>(ImmutableMap.copyOf(incidentEdges));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/UndirectedMultiNetworkConnections.java`
#### Snippet
```java
  }

  static <N, E> UndirectedMultiNetworkConnections<N, E> ofImmutable(Map<E, N> incidentEdges) {
    return new UndirectedMultiNetworkConnections<>(ImmutableMap.copyOf(incidentEdges));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super E`
in `guava/src/com/google/common/collect/SortedIterables.java`
#### Snippet
```java
  // if sortedSet.comparator() is null, the set must be naturally ordered
  public static <E extends @Nullable Object> Comparator<? super E> comparator(
      SortedSet<E> sortedSet) {
    Comparator<? super E> result = sortedSet.comparator();
    if (result == null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/UnmodifiableSortedMultiset.java`
#### Snippet
```java
final class UnmodifiableSortedMultiset<E extends @Nullable Object> extends UnmodifiableMultiset<E>
    implements SortedMultiset<E> {
  UnmodifiableSortedMultiset(SortedMultiset<E> delegate) {
    super(delegate);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
final class GeneralRange<T extends @Nullable Object> implements Serializable {
  /** Converts a Range to a GeneralRange. */
  static <T extends Comparable> GeneralRange<T> from(Range<T> range) {
    T lowerEndpoint = range.hasLowerBound() ? range.lowerEndpoint() : null;
    BoundType lowerBoundType = range.hasLowerBound() ? range.lowerBoundType() : OPEN;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
   */
  @SuppressWarnings("nullness") // TODO(cpovirk): Add casts as needed. Will be noisy and annoying...
  GeneralRange<T> intersect(GeneralRange<T> other) {
    checkNotNull(other);
    checkArgument(comparator.equals(other.comparator));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Class`
in `guava/src/com/google/common/primitives/Primitives.java`
#### Snippet
```java

  private static void add(
      Map<Class<?>, Class<?>> forward,
      Map<Class<?>, Class<?>> backward,
      Class<?> key,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Class`
in `guava/src/com/google/common/primitives/Primitives.java`
#### Snippet
```java

  private static void add(
      Map<Class<?>, Class<?>> forward,
      Map<Class<?>, Class<?>> backward,
      Class<?> key,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Class`
in `guava/src/com/google/common/primitives/Primitives.java`
#### Snippet
```java
  private static void add(
      Map<Class<?>, Class<?>> forward,
      Map<Class<?>, Class<?>> backward,
      Class<?> key,
      Class<?> value) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Class`
in `guava/src/com/google/common/primitives/Primitives.java`
#### Snippet
```java
  private static void add(
      Map<Class<?>, Class<?>> forward,
      Map<Class<?>, Class<?>> backward,
      Class<?> key,
      Class<?> value) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `guava/src/com/google/common/collect/Comparators.java`
#### Snippet
```java
  @ParametricNullness
  public static <T extends @Nullable Object> T max(
      @ParametricNullness T a, @ParametricNullness T b, Comparator<T> comparator) {
    return (comparator.compare(a, b) >= 0) ? a : b;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `guava/src/com/google/common/collect/Comparators.java`
#### Snippet
```java
  @ParametricNullness
  public static <T extends @Nullable Object> T min(
      @ParametricNullness T a, @ParametricNullness T b, Comparator<T> comparator) {
    return (comparator.compare(a, b) <= 0) ? a : b;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/UndirectedGraphConnections.java`
#### Snippet
```java
  }

  static <N, V> UndirectedGraphConnections<N, V> ofImmutable(Map<N, V> adjacentNodeValues) {
    return new UndirectedGraphConnections<>(ImmutableMap.copyOf(adjacentNodeValues));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/graph/UndirectedGraphConnections.java`
#### Snippet
```java
  }

  static <N, V> UndirectedGraphConnections<N, V> ofImmutable(Map<N, V> adjacentNodeValues) {
    return new UndirectedGraphConnections<>(ImmutableMap.copyOf(adjacentNodeValues));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ImmutableList`
in `guava/src/com/google/common/collect/ImmutableListMultimap.java`
#### Snippet
```java
  }

  ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> map, int size) {
    super(map, size);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/graph/UndirectedNetworkConnections.java`
#### Snippet
```java
  }

  static <N, E> UndirectedNetworkConnections<N, E> ofImmutable(Map<E, N> incidentEdges) {
    return new UndirectedNetworkConnections<>(ImmutableBiMap.copyOf(incidentEdges));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/UndirectedNetworkConnections.java`
#### Snippet
```java
  }

  static <N, E> UndirectedNetworkConnections<N, E> ofImmutable(Map<E, N> incidentEdges) {
    return new UndirectedNetworkConnections<>(ImmutableBiMap.copyOf(incidentEdges));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/graph/ImmutableValueGraph.java`
#### Snippet
```java
  }

  private static <N, V> GraphConnections<N, V> connectionsOf(ValueGraph<N, V> graph, N node) {
    Function<N, V> successorNodeToValueFn =
        (N successorNode) ->
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Subscriber`
in `guava/src/com/google/common/eventbus/Dispatcher.java`
#### Snippet
```java

    @Override
    void dispatch(Object event, Iterator<Subscriber> subscribers) {
      checkNotNull(event);
      while (subscribers.hasNext()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Subscriber`
in `guava/src/com/google/common/eventbus/Dispatcher.java`
#### Snippet
```java

    @Override
    void dispatch(Object event, Iterator<Subscriber> subscribers) {
      checkNotNull(event);
      while (subscribers.hasNext()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends L`
in `guava/src/com/google/common/util/concurrent/Striped.java`
#### Snippet
```java
    final ReferenceQueue<L> queue = new ReferenceQueue<>();

    SmallLazyStriped(int stripes, Supplier<L> supplier) {
      super(stripes);
      this.size = (mask == ALL_SET) ? Integer.MAX_VALUE : mask + 1;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends L`
in `guava/src/com/google/common/util/concurrent/Striped.java`
#### Snippet
```java
    final int size;

    LargeLazyStriped(int stripes, Supplier<L> supplier) {
      super(stripes);
      this.size = (mask == ALL_SET) ? Integer.MAX_VALUE : mask + 1;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AbstractFuture`
in `guava/src/com/google/common/util/concurrent/Futures.java`
#### Snippet
```java

    private void recordInputCompletion(
        ImmutableList<AbstractFuture<T>> delegates, int inputFutureIndex) {
      /*
       * requireNonNull is safe because we accepted an Iterable of non-null Future instances, and we
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/util/concurrent/Futures.java`
#### Snippet
```java
    final FutureCallback<? super V> callback;

    CallbackListener(Future<V> future, FutureCallback<? super V> callback) {
      this.future = future;
      this.callback = callback;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ListenableFuture`
in `guava/src/com/google/common/util/concurrent/Futures.java`
#### Snippet
```java

    private FutureCombiner(
        boolean allMustSucceed, ImmutableList<ListenableFuture<? extends V>> futures) {
      this.allMustSucceed = allMustSucceed;
      this.futures = futures;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Entry`
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java

  static <E extends @Nullable Object> Iterator<E> elementIterator(
      Iterator<Entry<E>> entryIterator) {
    return new TransformedIterator<Entry<E>, E>(entryIterator) {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Entry`
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
    private boolean canRemove;

    MultisetIteratorImpl(Multiset<E> multiset, Iterator<Entry<E>> entryIterator) {
      this.multiset = multiset;
      this.entryIterator = entryIterator;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java

  <E extends @Nullable Object> Collection<E> unmodifiableCollectionSubclass(
      Collection<E> collection) {
    return Collections.unmodifiableCollection(collection);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
    }

    Entry<K, Collection<V>> wrapEntry(Entry<K, Collection<V>> entry) {
      K key = entry.getKey();
      return Maps.immutableEntry(key, wrapCollection(key, entry.getValue()));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Collection`
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
    }

    Entry<K, Collection<V>> wrapEntry(Entry<K, Collection<V>> entry) {
      K key = entry.getKey();
      return Maps.immutableEntry(key, wrapCollection(key, entry.getValue()));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Entry`>
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java

    @CheckForNull
    Entry<K, Collection<V>> pollAsMapEntry(Iterator<Entry<K, Collection<V>>> entryIterator) {
      if (!entryIterator.hasNext()) {
        return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/collect/EnumBiMap.java`
#### Snippet
```java
  }

  private static <V extends Enum<V>> Class<V> inferValueType(Map<?, V> map) {
    if (map instanceof EnumBiMap) {
      return ((EnumBiMap<?, V>) map).valueType;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `guava/src/com/google/common/collect/EnumBiMap.java`
#### Snippet
```java
  }

  static <K extends Enum<K>> Class<K> inferKeyType(Map<K, ?> map) {
    if (map instanceof EnumBiMap) {
      return ((EnumBiMap<K, ?>) map).keyType();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
  }

  private long aggregateAboveRange(Aggregate aggr, @CheckForNull AvlNode<E> node) {
    if (node == null) {
      return 0;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
  }

  private long aggregateBelowRange(Aggregate aggr, @CheckForNull AvlNode<E> node) {
    if (node == null) {
      return 0;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
  }

  private Entry<E> wrapEntry(final AvlNode<E> baseEntry) {
    return new Multisets.AbstractEntry<E>() {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/StandardMutableGraph.java`
#### Snippet
```java

  @Override
  public boolean removeEdge(EndpointPair<N> endpoints) {
    validateEndpoints(endpoints);
    return removeEdge(endpoints.nodeU(), endpoints.nodeV());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/StandardMutableGraph.java`
#### Snippet
```java

  @Override
  public boolean putEdge(EndpointPair<N> endpoints) {
    validateEndpoints(endpoints);
    return putEdge(endpoints.nodeU(), endpoints.nodeV());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/StandardMutableValueGraph.java`
#### Snippet
```java
  @CanIgnoreReturnValue
  @CheckForNull
  public V removeEdge(EndpointPair<N> endpoints) {
    validateEndpoints(endpoints);
    return removeEdge(endpoints.nodeU(), endpoints.nodeV());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/StandardMutableValueGraph.java`
#### Snippet
```java
  @CanIgnoreReturnValue
  @CheckForNull
  public V putEdgeValue(EndpointPair<N> endpoints, V value) {
    validateEndpoints(endpoints);
    return putEdgeValue(endpoints.nodeU(), endpoints.nodeV(), value);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/StandardMutableNetwork.java`
#### Snippet
```java
  @Override
  @CanIgnoreReturnValue
  public boolean addEdge(EndpointPair<N> endpoints, E edge) {
    validateEndpoints(endpoints);
    return addEdge(endpoints.nodeU(), endpoints.nodeV(), edge);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Throwable`
in `guava/src/com/google/common/util/concurrent/AggregateFuture.java`
#### Snippet
```java

  /** Adds the chain to the seen set, and returns whether all the chain was new to us. */
  private static boolean addCausalChain(Set<Throwable> seen, Throwable param) {
    // Declare a "true" local variable so that the Checker Framework will infer nullness.
    Throwable t = param;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/JdkBackedImmutableSet.java`
#### Snippet
```java
  private final ImmutableList<E> delegateList;

  JdkBackedImmutableSet(Set<?> delegate, ImmutableList<E> delegateList) {
    this.delegate = delegate;
    this.delegateList = delegateList;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/ImmutableNetwork.java`
#### Snippet
```java
  }

  private static <N, E> Function<E, N> targetNodeFn(Network<N, E> network) {
    return (E edge) -> network.incidentNodes(edge).target();
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super E`
in `guava/src/com/google/common/graph/ImmutableNetwork.java`
#### Snippet
```java
  }

  private static <N, E> Function<E, N> targetNodeFn(Network<N, E> network) {
    return (E edge) -> network.incidentNodes(edge).target();
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/ImmutableNetwork.java`
#### Snippet
```java
  }

  private static <N, E> Map<E, N> getEdgeToReferenceNode(Network<N, E> network) {
    // ImmutableMap.Builder maintains the order of the elements as inserted, so the map will have
    // whatever ordering the network's edges do, so ImmutableSortedMap is unnecessary even if the
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super E`
in `guava/src/com/google/common/graph/ImmutableNetwork.java`
#### Snippet
```java
  }

  private static <N, E> Function<E, N> adjacentNodeFn(Network<N, E> network, N node) {
    return (E edge) -> network.incidentNodes(edge).adjacentNode(node);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/ImmutableNetwork.java`
#### Snippet
```java
  }

  private static <N, E> Function<E, N> sourceNodeFn(Network<N, E> network) {
    return (E edge) -> network.incidentNodes(edge).source();
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super E`
in `guava/src/com/google/common/graph/ImmutableNetwork.java`
#### Snippet
```java
  }

  private static <N, E> Function<E, N> sourceNodeFn(Network<N, E> network) {
    return (E edge) -> network.incidentNodes(edge).source();
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/EnumMultiset.java`
#### Snippet
```java

  /** Creates an empty {@code EnumMultiset}. */
  private EnumMultiset(Class<E> type) {
    this.type = type;
    checkArgument(type.isEnum());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/EnumMultiset.java`
#### Snippet
```java
   * @since 14.0
   */
  public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> elements, Class<E> type) {
    EnumMultiset<E> result = create(type);
    Iterables.addAll(result, elements);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/AbstractBaseGraph.java`
#### Snippet
```java

  @Override
  public boolean hasEdgeConnecting(EndpointPair<N> endpoints) {
    checkNotNull(endpoints);
    if (!isOrderingCompatible(endpoints)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super File`
in `guava/src/com/google/common/reflect/ClassPath.java`
#### Snippet
```java
        File directory,
        String packagePrefix,
        Set<File> currentPath,
        ImmutableSet.Builder<ResourceInfo> builder)
        throws IOException {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ResourceInfo`
in `guava/src/com/google/common/reflect/ClassPath.java`
#### Snippet
```java
        String packagePrefix,
        Set<File> currentPath,
        ImmutableSet.Builder<ResourceInfo> builder)
        throws IOException {
      File[] files = directory.listFiles();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ResourceInfo`
in `guava/src/com/google/common/reflect/ClassPath.java`
#### Snippet
```java
    }

    private void scanJarFile(JarFile file, ImmutableSet.Builder<ResourceInfo> builder) {
      Enumeration<JarEntry> entries = file.entries();
      while (entries.hasMoreElements()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/StandardValueGraph.java`
#### Snippet
```java
  @Override
  @CheckForNull
  public V edgeValueOrDefault(EndpointPair<N> endpoints, @CheckForNull V defaultValue) {
    validateEndpoints(endpoints);
    return edgeValueOrDefaultInternal(endpoints.nodeU(), endpoints.nodeV(), defaultValue);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/StandardValueGraph.java`
#### Snippet
```java

  @Override
  public boolean hasEdgeConnecting(EndpointPair<N> endpoints) {
    checkNotNull(endpoints);
    return isOrderingCompatible(endpoints)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super S`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    final AtomicInteger readCount = new AtomicInteger();

    Segment(MapMakerInternalMap<K, V, E, S> map, int initialCapacity, int maxSegmentSize) {
      this.map = map;
      this.maxSegmentSize = maxSegmentSize;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

    @GuardedBy("this")
    void drainValueReferenceQueue(ReferenceQueue<V> valueReferenceQueue) {
      Reference<? extends V> ref;
      int i = 0;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
  }

  private static <E> ArrayList<E> toArrayList(Collection<E> c) {
    // Avoid calling ArrayList(Collection), which may call back into toArray.
    ArrayList<E> result = new ArrayList<>(c.size());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

    @GuardedBy("this")
    void drainKeyReferenceQueue(ReferenceQueue<K> keyReferenceQueue) {
      Reference<? extends K> ref;
      int i = 0;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/reflect/ImmutableTypeToInstanceMap.java`
#### Snippet
```java
     */
    @CanIgnoreReturnValue
    public <T extends B> Builder<B> put(Class<T> key, T value) {
      mapBuilder.put(TypeToken.of(key), value);
      return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/reflect/ImmutableTypeToInstanceMap.java`
#### Snippet
```java
     */
    @CanIgnoreReturnValue
    public <T extends B> Builder<B> put(TypeToken<T> key, T value) {
      mapBuilder.put(key.rejectTypeVariables(), value);
      return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `guava/src/com/google/common/collect/Tables.java`
#### Snippet
```java
      extends UnmodifiableTable<R, C, V> implements RowSortedTable<R, C, V> {

    public UnmodifiableRowSortedMap(RowSortedTable<R, ? extends C, ? extends V> delegate) {
      super(delegate);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/util/concurrent/Callables.java`
#### Snippet
```java
  @GwtIncompatible // threads
  static <T extends @Nullable Object> Callable<T> threadRenaming(
      Callable<T> callable, Supplier<String> nameSupplier) {
    checkNotNull(nameSupplier);
    checkNotNull(callable);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/ImmutableSortedAsList.java`
#### Snippet
```java
final class ImmutableSortedAsList<E> extends RegularImmutableAsList<E>
    implements SortedIterable<E> {
  ImmutableSortedAsList(ImmutableSortedSet<E> backingSet, ImmutableList<E> backingList) {
    super(backingSet, backingList);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super E`
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
   * @throws NullPointerException if {@code comparator} is null
   */
  public static <E> Builder<E> orderedBy(Comparator<E> comparator) {
    return new Builder<E>(comparator);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/util/concurrent/ExecutionSequencer.java`
#### Snippet
```java
   */
  public <T extends @Nullable Object> ListenableFuture<T> submit(
      Callable<T> callable, Executor executor) {
    checkNotNull(callable);
    checkNotNull(executor);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Entry`
in `guava/src/com/google/common/collect/JdkBackedImmutableBiMap.java`
#### Snippet
```java

  private JdkBackedImmutableBiMap(
      ImmutableList<Entry<K, V>> entries, Map<K, V> forwardDelegate, Map<V, K> backwardDelegate) {
    this.entries = entries;
    this.forwardDelegate = forwardDelegate;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/Ordering.java`
#### Snippet
```java
   * @since 14.0
   */
  public <E extends T> List<E> leastOf(Iterator<E> iterator, int k) {
    checkNotNull(iterator);
    checkNonnegative(k, "k");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/Ordering.java`
#### Snippet
```java
  // TODO(kevinb): rerun benchmarks including new options
  @SuppressWarnings("nullness") // unsafe, but there's not much we can do about it now
  public <E extends T> ImmutableList<E> immutableSortedCopy(Iterable<E> elements) {
    return ImmutableList.sortedCopyOf(this, elements);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/CollectSpliterators.java`
#### Snippet
```java
      int size,
      int extraCharacteristics,
      IntFunction<T> function,
      @CheckForNull Comparator<? super T> comparator) {
    if (comparator != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/TopKSelector.java`
#### Snippet
```java
  }

  TopKSelector<T> combine(TopKSelector<T> other) {
    for (int i = 0; i < other.bufferSize; i++) {
      this.offer(uncheckedCastNullableTToT(other.buffer[i]));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/ImmutableSet.java`
#### Snippet
```java

    /** Adds all the elements from the specified SetBuilderImpl to this SetBuilderImpl. */
    final SetBuilderImpl<E> combine(SetBuilderImpl<E> other) {
      SetBuilderImpl<E> result = this;
      for (int i = 0; i < other.distinct; i++) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Entry`
in `guava/src/com/google/common/reflect/MutableTypeToInstanceMap.java`
#### Snippet
```java
    }

    private static <K, V> Iterator<Entry<K, V>> transformEntries(Iterator<Entry<K, V>> entries) {
      return Iterators.transform(entries, UnmodifiableEntry::new);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/reflect/MutableTypeToInstanceMap.java`
#### Snippet
```java
  @SuppressWarnings("unchecked") // value could not get in if not a T
  @CheckForNull
  private <T extends B> T trustedPut(TypeToken<T> type, T value) {
    return (T) backingMap.put(type, value);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/graph/DirectedMultiNetworkConnections.java`
#### Snippet
```java

  static <N, E> DirectedMultiNetworkConnections<N, E> ofImmutable(
      Map<E, N> inEdges, Map<E, N> outEdges, int selfLoopCount) {
    return new DirectedMultiNetworkConnections<>(
        ImmutableMap.copyOf(inEdges), ImmutableMap.copyOf(outEdges), selfLoopCount);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/DirectedMultiNetworkConnections.java`
#### Snippet
```java

  static <N, E> DirectedMultiNetworkConnections<N, E> ofImmutable(
      Map<E, N> inEdges, Map<E, N> outEdges, int selfLoopCount) {
    return new DirectedMultiNetworkConnections<>(
        ImmutableMap.copyOf(inEdges), ImmutableMap.copyOf(outEdges), selfLoopCount);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/graph/DirectedMultiNetworkConnections.java`
#### Snippet
```java

  static <N, E> DirectedMultiNetworkConnections<N, E> ofImmutable(
      Map<E, N> inEdges, Map<E, N> outEdges, int selfLoopCount) {
    return new DirectedMultiNetworkConnections<>(
        ImmutableMap.copyOf(inEdges), ImmutableMap.copyOf(outEdges), selfLoopCount);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/DirectedMultiNetworkConnections.java`
#### Snippet
```java

  static <N, E> DirectedMultiNetworkConnections<N, E> ofImmutable(
      Map<E, N> inEdges, Map<E, N> outEdges, int selfLoopCount) {
    return new DirectedMultiNetworkConnections<>(
        ImmutableMap.copyOf(inEdges), ImmutableMap.copyOf(outEdges), selfLoopCount);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends LockGraphNode`
in `guava/src/com/google/common/util/concurrent/CycleDetectingLockFactory.java`
#### Snippet
```java
    }

    void checkAcquiredLocks(Policy policy, List<LockGraphNode> acquiredLocks) {
      for (LockGraphNode acquiredLock : acquiredLocks) {
        checkAcquiredLock(policy, acquiredLock);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends LockGraphNode`
in `guava/src/com/google/common/util/concurrent/CycleDetectingLockFactory.java`
#### Snippet
```java

    @VisibleForTesting
    WithExplicitOrdering(Policy policy, Map<E, LockGraphNode> lockGraphNodes) {
      super(policy);
      this.lockGraphNodes = lockGraphNodes;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/AbstractNetwork.java`
#### Snippet
```java
  @Override
  @CheckForNull
  public E edgeConnectingOrNull(EndpointPair<N> endpoints) {
    validateEndpoints(endpoints);
    return edgeConnectingOrNull(endpoints.nodeU(), endpoints.nodeV());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/AbstractNetwork.java`
#### Snippet
```java

  @Override
  public Optional<E> edgeConnecting(EndpointPair<N> endpoints) {
    validateEndpoints(endpoints);
    return edgeConnecting(endpoints.nodeU(), endpoints.nodeV());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/AbstractNetwork.java`
#### Snippet
```java

  @Override
  public boolean hasEdgeConnecting(EndpointPair<N> endpoints) {
    checkNotNull(endpoints);
    if (!isOrderingCompatible(endpoints)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/AbstractNetwork.java`
#### Snippet
```java

  @Override
  public Set<E> edgesConnecting(EndpointPair<N> endpoints) {
    validateEndpoints(endpoints);
    return edgesConnecting(endpoints.nodeU(), endpoints.nodeV());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  public static <A extends @Nullable Object, B extends @Nullable Object, R extends @Nullable Object>
      Stream<R> zip(
          Stream<A> streamA, Stream<B> streamB, BiFunction<? super A, ? super B, R> function) {
    checkNotNull(streamA);
    checkNotNull(streamB);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
   */
  public static <R extends @Nullable Object> Stream<R> mapWithIndex(
      IntStream stream, IntFunctionWithIndex<R> function) {
    checkNotNull(stream);
    checkNotNull(function);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
   */
  public static <R extends @Nullable Object> Stream<R> mapWithIndex(
      LongStream stream, LongFunctionWithIndex<R> function) {
    checkNotNull(stream);
    checkNotNull(function);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
   */
  @Beta
  public static <T> Stream<T> stream(com.google.common.base.Optional<T> optional) {
    return optional.isPresent() ? Stream.of(optional.get()) : Stream.empty();
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
   */
  public static <R extends @Nullable Object> Stream<R> mapWithIndex(
      DoubleStream stream, DoubleFunctionWithIndex<R> function) {
    checkNotNull(stream);
    checkNotNull(function);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
   */
  @Beta
  public static <T extends @Nullable Object> Stream<T> stream(Iterator<T> iterator) {
    return StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, 0), false);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  @InlineMe(replacement = "optional.stream()")
  @com.google.errorprone.annotations.InlineMeValidationDisabled("Java 9+ API only")
  public static <T> Stream<T> stream(java.util.Optional<T> optional) {
    return optional.isPresent() ? Stream.of(optional.get()) : Stream.empty();
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/graph/AbstractValueGraph.java`
#### Snippet
```java
  }

  private static <N, V> Map<EndpointPair<N>, V> edgeValueMap(final ValueGraph<N, V> graph) {
    Function<EndpointPair<N>, V> edgeToValueFn =
        new Function<EndpointPair<N>, V>() {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        int hash,
        LoadingValueReference<K, V> loadingValueReference,
        ListenableFuture<V> newValue)
        throws ExecutionException {
      V value = null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @GuardedBy("this")
    void removeCollectedEntry(ReferenceEntry<K, V> entry) {
      enqueueNotification(
          entry.getKey(),
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @GuardedBy("this")
    void removeCollectedEntry(ReferenceEntry<K, V> entry) {
      enqueueNotification(
          entry.getKey(),
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    }

    V waitForLoadingValue(ReferenceEntry<K, V> e, K key, ValueReference<K, V> valueReference)
        throws ExecutionException {
      if (!valueReference.isLoading()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
  }

  private static <E> ArrayList<E> toArrayList(Collection<E> c) {
    // Avoid calling ArrayList(Collection), which may call back into toArray.
    ArrayList<E> result = new ArrayList<>(c.size());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/ImmutableClassToInstanceMap.java`
#### Snippet
```java
     */
    @CanIgnoreReturnValue
    public <T extends B> Builder<B> put(Class<T> key, T value) {
      mapBuilder.put(key, value);
      return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/ImmutableClassToInstanceMap.java`
#### Snippet
```java
   * @since 19.0
   */
  public static <B, T extends B> ImmutableClassToInstanceMap<B> of(Class<T> type, T value) {
    ImmutableMap<Class<? extends B>, B> map = ImmutableMap.<Class<? extends B>, B>of(type, value);
    return new ImmutableClassToInstanceMap<>(map);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/AllEqualOrdering.java`
#### Snippet
```java

  @Override
  public <E extends @Nullable Object> List<E> sortedCopy(Iterable<E> iterable) {
    return Lists.newArrayList(iterable);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/AllEqualOrdering.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("nullness") // unsafe: see supertype
  public <E extends @Nullable Object> ImmutableList<E> immutableSortedCopy(Iterable<E> iterable) {
    return ImmutableList.copyOf(iterable);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
  }

  private ArrayTable(Table<R, C, ? extends @Nullable V> table) {
    this(table.rowKeySet(), table.columnKeySet());
    putAll(table);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends C`
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
  }

  private ArrayTable(Table<R, C, ? extends @Nullable V> table) {
    this(table.rowKeySet(), table.columnKeySet());
    putAll(table);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
   */
  public final <T extends @Nullable Object> FluentIterable<T> transform(
      Function<? super E, T> function) {
    return from(Iterables.transform(getDelegate(), function));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Entry`
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java
    private final Multiset<E> delegate;

    ElementSet(List<Entry<E>> entries, Multiset<E> delegate) {
      this.entries = entries;
      this.delegate = delegate;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Cell`
in `guava/src/com/google/common/collect/RegularImmutableTable.java`
#### Snippet
```java

  private static <R, C, V> RegularImmutableTable<R, C, V> forCellsInternal(
      Iterable<Cell<R, C, V>> cells,
      @CheckForNull Comparator<? super R> rowComparator,
      @CheckForNull Comparator<? super C> columnComparator) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Future`
in `guava/src/com/google/common/util/concurrent/MoreExecutors.java`
#### Snippet
```java
      ListeningExecutorService executorService,
      Callable<T> task,
      final BlockingQueue<Future<T>> queue) {
    final ListenableFuture<T> future = executorService.submit(task);
    future.addListener(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super K`
in `guava/src/com/google/common/collect/ImmutableEnumMap.java`
#### Snippet
```java
    final EnumMap<K, V> delegate;

    EnumSerializedForm(EnumMap<K, V> delegate) {
      this.delegate = delegate;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends EndpointPair`
in `guava/src/com/google/common/graph/DirectedGraphConnections.java`
#### Snippet
```java

  static <N, V> DirectedGraphConnections<N, V> ofImmutable(
      N thisNode, Iterable<EndpointPair<N>> incidentEdges, Function<N, V> successorNodeToValueFn) {
    checkNotNull(thisNode);
    checkNotNull(successorNodeToValueFn);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super N`
in `guava/src/com/google/common/graph/DirectedGraphConnections.java`
#### Snippet
```java

  static <N, V> DirectedGraphConnections<N, V> ofImmutable(
      N thisNode, Iterable<EndpointPair<N>> incidentEdges, Function<N, V> successorNodeToValueFn) {
    checkNotNull(thisNode);
    checkNotNull(successorNodeToValueFn);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/graph/DirectedGraphConnections.java`
#### Snippet
```java

  static <N, V> DirectedGraphConnections<N, V> ofImmutable(
      N thisNode, Iterable<EndpointPair<N>> incidentEdges, Function<N, V> successorNodeToValueFn) {
    checkNotNull(thisNode);
    checkNotNull(successorNodeToValueFn);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/graph/DirectedNetworkConnections.java`
#### Snippet
```java

  static <N, E> DirectedNetworkConnections<N, E> ofImmutable(
      Map<E, N> inEdges, Map<E, N> outEdges, int selfLoopCount) {
    return new DirectedNetworkConnections<>(
        ImmutableBiMap.copyOf(inEdges), ImmutableBiMap.copyOf(outEdges), selfLoopCount);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/DirectedNetworkConnections.java`
#### Snippet
```java

  static <N, E> DirectedNetworkConnections<N, E> ofImmutable(
      Map<E, N> inEdges, Map<E, N> outEdges, int selfLoopCount) {
    return new DirectedNetworkConnections<>(
        ImmutableBiMap.copyOf(inEdges), ImmutableBiMap.copyOf(outEdges), selfLoopCount);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/graph/DirectedNetworkConnections.java`
#### Snippet
```java

  static <N, E> DirectedNetworkConnections<N, E> ofImmutable(
      Map<E, N> inEdges, Map<E, N> outEdges, int selfLoopCount) {
    return new DirectedNetworkConnections<>(
        ImmutableBiMap.copyOf(inEdges), ImmutableBiMap.copyOf(outEdges), selfLoopCount);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends N`
in `guava/src/com/google/common/graph/DirectedNetworkConnections.java`
#### Snippet
```java

  static <N, E> DirectedNetworkConnections<N, E> ofImmutable(
      Map<E, N> inEdges, Map<E, N> outEdges, int selfLoopCount) {
    return new DirectedNetworkConnections<>(
        ImmutableBiMap.copyOf(inEdges), ImmutableBiMap.copyOf(outEdges), selfLoopCount);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends BigInteger`
in `guava/src/com/google/common/math/BigIntegerMath.java`
#### Snippet
```java
  }

  static BigInteger listProduct(List<BigInteger> nums, int start, int end) {
    switch (end - start) {
      case 0:
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/Collections2.java`
#### Snippet
```java
   */
  public static <F extends @Nullable Object, T extends @Nullable Object> Collection<T> transform(
      Collection<F> fromCollection, Function<? super F, T> function) {
    return new TransformedCollection<>(fromCollection, function);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/Collections2.java`
#### Snippet
```java
   */
  @Beta
  public static <E> Collection<List<E>> permutations(Collection<E> elements) {
    return new PermutationCollection<E>(ImmutableList.copyOf(elements));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/util/concurrent/SimpleTimeLimiter.java`
#### Snippet
```java
  @Override
  public <T> T newProxy(
      T target, Class<T> interfaceType, long timeoutDuration, TimeUnit timeoutUnit) {
    checkNotNull(target);
    checkNotNull(interfaceType);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
        @Override
        @ParametricNullness
        K output(BiEntry<K, V> entry) {
          return entry.key;
        }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
          @Override
          @ParametricNullness
          V output(BiEntry<K, V> entry) {
            return entry.value;
          }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super E`
in `guava/src/com/google/common/collect/ImmutableSortedMultiset.java`
#### Snippet
```java
   * @throws NullPointerException if {@code comparator} is null
   */
  public static <E> Builder<E> orderedBy(Comparator<E> comparator) {
    return new Builder<E>(comparator);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Entry`
in `guava/src/com/google/common/collect/ImmutableSortedMultiset.java`
#### Snippet
```java

  private static <E> ImmutableSortedMultiset<E> copyOfSortedEntries(
      Comparator<? super E> comparator, Collection<Entry<E>> entries) {
    if (entries.isEmpty()) {
      return emptyMultiset(comparator);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/base/Optional.java`
#### Snippet
```java
   */
  @CheckForNull
  public static <T> Optional<T> fromJavaUtil(@CheckForNull java.util.Optional<T> javaUtilOptional) {
    return (javaUtilOptional == null) ? null : fromNullable(javaUtilOptional.orElse(null));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super CharSequence`
in `guava/src/com/google/thirdparty/publicsuffix/TrieParser.java`
#### Snippet
```java
   */
  private static int doParseTrieToBuilder(
      Deque<CharSequence> stack,
      CharSequence encoded,
      int start,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `guava/src/com/google/thirdparty/publicsuffix/TrieParser.java`
#### Snippet
```java
      CharSequence encoded,
      int start,
      ImmutableMap.Builder<String, PublicSuffixType> builder) {

    int encodedLen = encoded.length();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super PublicSuffixType`
in `guava/src/com/google/thirdparty/publicsuffix/TrieParser.java`
#### Snippet
```java
      CharSequence encoded,
      int start,
      ImmutableMap.Builder<String, PublicSuffixType> builder) {

    int encodedLen = encoded.length();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super K0`
in `guava/src/com/google/common/collect/MultimapBuilder.java`
#### Snippet
```java
   */
  public static <K0 extends @Nullable Object> MultimapBuilderWithKeys<K0> treeKeys(
      Comparator<K0> comparator) {
    checkNotNull(comparator);
    return new MultimapBuilderWithKeys<K0>() {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Iterator`
in `guava/src/com/google/common/graph/Traverser.java`
#### Snippet
```java
        @Override
        @CheckForNull
        N visitNext(Deque<Iterator<? extends N>> horizon) {
          Iterator<? extends N> top = horizon.getFirst();
          while (top.hasNext()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Iterator`
in `guava/src/com/google/common/graph/Traverser.java`
#### Snippet
```java
        @CheckForNull
        @Override
        N visitNext(Deque<Iterator<? extends N>> horizon) {
          Iterator<? extends N> top = horizon.getFirst();
          if (top.hasNext()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `guava/src/com/google/common/collect/SortedLists.java`
#### Snippet
```java
  public static <E extends @Nullable Object, K extends @Nullable Object> int binarySearch(
      List<E> list,
      Function<? super E, K> keyFunction,
      @ParametricNullness K key,
      Comparator<? super K> keyComparator,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/ObjectArrays.java`
#### Snippet
```java
   */
  @GwtIncompatible // Array.newInstance(Class, int)
  public static <T> T[] concat(T[] first, T[] second, Class<T> type) {
    T[] result = newArray(type, first.length + second.length);
    System.arraycopy(first, 0, result, 0, first.length);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V1`
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
    private final ClosingFuture<V2> future2;

    private Combiner2(ClosingFuture<V1> future1, ClosingFuture<V2> future2) {
      super(true, ImmutableList.of(future1, future2));
      this.future1 = future1;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V2`
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
    private final ClosingFuture<V2> future2;

    private Combiner2(ClosingFuture<V1> future1, ClosingFuture<V2> future2) {
      super(true, ImmutableList.of(future1, future2));
      this.future1 = future1;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends U`
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
    <V extends @Nullable Object, U extends @Nullable Object>
        ListenableFuture<U> applyClosingFunction(
            ClosingFunction<? super V, U> transformation, @ParametricNullness V input)
            throws Exception {
      // TODO(dpb): Consider ways to defer closing without creating a separate CloseableList.
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
     */
    public <V extends @Nullable Object> ClosingFuture<V> call(
        final CombiningCallable<V> combiningCallable, Executor executor) {
      Callable<V> callable =
          new Callable<V>() {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V1`
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java

    private Combiner4(
        ClosingFuture<V1> future1,
        ClosingFuture<V2> future2,
        ClosingFuture<V3> future3,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V2`
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
    private Combiner4(
        ClosingFuture<V1> future1,
        ClosingFuture<V2> future2,
        ClosingFuture<V3> future3,
        ClosingFuture<V4> future4) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V3`
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
        ClosingFuture<V1> future1,
        ClosingFuture<V2> future2,
        ClosingFuture<V3> future3,
        ClosingFuture<V4> future4) {
      super(true, ImmutableList.of(future1, future2, future3, future4));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V4`
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
        ClosingFuture<V2> future2,
        ClosingFuture<V3> future3,
        ClosingFuture<V4> future4) {
      super(true, ImmutableList.of(future1, future2, future3, future4));
      this.future1 = future1;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V1`
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java

    private Combiner3(
        ClosingFuture<V1> future1, ClosingFuture<V2> future2, ClosingFuture<V3> future3) {
      super(true, ImmutableList.of(future1, future2, future3));
      this.future1 = future1;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V2`
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java

    private Combiner3(
        ClosingFuture<V1> future1, ClosingFuture<V2> future2, ClosingFuture<V3> future3) {
      super(true, ImmutableList.of(future1, future2, future3));
      this.future1 = future1;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V3`
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java

    private Combiner3(
        ClosingFuture<V1> future1, ClosingFuture<V2> future2, ClosingFuture<V3> future3) {
      super(true, ImmutableList.of(future1, future2, future3));
      this.future1 = future1;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
   */
  public static <V extends @Nullable Object, U extends @Nullable Object>
      AsyncClosingFunction<V, U> withoutCloser(final AsyncFunction<V, U> function) {
    checkNotNull(function);
    return new AsyncClosingFunction<V, U>() {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V1`
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java

    private Combiner5(
        ClosingFuture<V1> future1,
        ClosingFuture<V2> future2,
        ClosingFuture<V3> future3,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V2`
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
    private Combiner5(
        ClosingFuture<V1> future1,
        ClosingFuture<V2> future2,
        ClosingFuture<V3> future3,
        ClosingFuture<V4> future4,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V3`
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
        ClosingFuture<V1> future1,
        ClosingFuture<V2> future2,
        ClosingFuture<V3> future3,
        ClosingFuture<V4> future4,
        ClosingFuture<V5> future5) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V4`
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
        ClosingFuture<V2> future2,
        ClosingFuture<V3> future3,
        ClosingFuture<V4> future4,
        ClosingFuture<V5> future5) {
      super(true, ImmutableList.of(future1, future2, future3, future4, future5));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V5`
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
        ClosingFuture<V3> future3,
        ClosingFuture<V4> future4,
        ClosingFuture<V5> future5) {
      super(true, ImmutableList.of(future1, future2, future3, future4, future5));
      this.future1 = future1;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/base/Present.java`
#### Snippet
```java

  @Override
  public <V> Optional<V> transform(Function<? super T, V> function) {
    return new Present<>(
        checkNotNull(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super E`
in `guava/src/com/google/common/collect/MinMaxPriorityQueue.java`
#### Snippet
```java
    @Weak Heap otherHeap; // always initialized immediately after construction

    Heap(Ordering<E> ordering) {
      this.ordering = ordering;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `guava/src/com/google/common/reflect/TypeResolver.java`
#### Snippet
```java
    }

    private TypeTable(ImmutableMap<TypeVariableKey, Type> map) {
      this.map = map;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TypeVariableKey`
in `guava/src/com/google/common/reflect/TypeResolver.java`
#### Snippet
```java

  private static void populateTypeMappings(
      Map<TypeVariableKey, Type> mappings, Type from, Type to) {
    if (from.equals(to)) {
      return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Type`
in `guava/src/com/google/common/reflect/TypeResolver.java`
#### Snippet
```java

  private static void populateTypeMappings(
      Map<TypeVariableKey, Type> mappings, Type from, Type to) {
    if (from.equals(to)) {
      return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java

  private static <K extends Enum<K>, V> ImmutableMap<K, V> copyOfEnumMap(
      EnumMap<K, ? extends V> original) {
    EnumMap<K, V> copy = new EnumMap<>(original);
    for (Entry<K, V> entry : copy.entrySet()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/base/Predicates.java`
#### Snippet
```java
  }

  static <T> List<T> defensiveCopy(Iterable<T> iterable) {
    ArrayList<T> list = new ArrayList<>();
    for (T element : iterable) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `guava/src/com/google/common/collect/CartesianList.java`
#### Snippet
```java
  }

  CartesianList(ImmutableList<List<E>> axes) {
    this.axes = axes;
    int[] axesSizeProduct = new int[axes.size() + 1];
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super K`
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
   * @throws NullPointerException if {@code comparator} is null
   */
  public static <K, V> Builder<K, V> orderedBy(Comparator<K> comparator) {
    return new Builder<>(comparator);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
  @GwtIncompatible // NavigableSet
  public static <K extends Comparable<? super K>> NavigableSet<K> subSet(
      NavigableSet<K> set, Range<K> range) {
    if (set.comparator() != null
        && set.comparator() != Ordering.natural()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
   */
  public static <E extends Enum<E>> EnumSet<E> newEnumSet(
      Iterable<E> iterable, Class<E> elementType) {
    EnumSet<E> set = EnumSet.noneOf(elementType);
    Iterables.addAll(set, iterable);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
   */
  public static <T extends @Nullable Object> UnmodifiableIterator<T> forEnumeration(
      Enumeration<T> enumeration) {
    checkNotNull(enumeration);
    return new UnmodifiableIterator<T>() {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java

    // If we inline this, we get a javac error.
    private static <T extends @Nullable Object> Ordering<T> reverse(Comparator<T> forward) {
      return Ordering.from(forward).reverse();
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
   */
  public static <T extends @Nullable Object> Iterator<T> limit(
      Iterator<T> iterator, int limitSize) {
    checkNotNull(iterator);
    checkArgument(limitSize >= 0, "limit is negative");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ImmutableSet`
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
    }

    private CartesianSet(ImmutableList<ImmutableSet<E>> axes, CartesianList<E> delegate) {
      this.axes = axes;
      this.delegate = delegate;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
   * @since 2.0
   */
  public static <T extends @Nullable Object> Iterator<T> consumingIterator(Iterator<T> iterator) {
    checkNotNull(iterator);
    return new UnmodifiableIterator<T>() {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
   */
  public static <T extends @Nullable Object> UnmodifiableIterator<T> filter(
      Iterator<T> unfiltered, Predicate<? super T> retainIfTrue) {
    checkNotNull(unfiltered);
    checkNotNull(retainIfTrue);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
   * you have a {@link Collection}), or {@code Iterators.asEnumeration(collection.iterator())}.
   */
  public static <T extends @Nullable Object> Enumeration<T> asEnumeration(Iterator<T> iterator) {
    checkNotNull(iterator);
    return new Enumeration<T>() {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
   * @since 11.0
   */
  public static <T> Optional<T> tryFind(Iterator<T> iterator, Predicate<? super T> predicate) {
    checkNotNull(iterator);
    checkNotNull(predicate);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java

  private static <T extends @Nullable Object> UnmodifiableIterator<List<@Nullable T>> partitionImpl(
      Iterator<T> iterator, int size, boolean pad) {
    checkNotNull(iterator);
    checkArgument(size > 0);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/Iterables.java`
#### Snippet
```java
   */
  private static <E extends @Nullable Object> Collection<E> castOrCopyToCollection(
      Iterable<E> iterable) {
    return (iterable instanceof Collection)
        ? (Collection<E>) iterable
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `guava/src/com/google/common/collect/Iterables.java`
#### Snippet
```java
   * instead of a @Nullable T[].
   */
  public static <T> @Nullable T[] toArray(Iterable<? extends @Nullable T> iterable, Class<T> type) {
    return toArray(iterable, ObjectArrays.newArray(type, 0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `guava/src/com/google/common/collect/TreeTraverser.java`
#### Snippet
```java
  @Deprecated
  public static <T> TreeTraverser<T> using(
      final Function<T, ? extends Iterable<T>> nodeToChildrenFunction) {
    checkNotNull(nodeToChildrenFunction);
    return new TreeTraverser<T>() {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V1`
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    }

    Collection<V2> transform(@ParametricNullness K key, Collection<V1> values) {
      Function<? super V1, V2> function = Maps.asValueToValueFunction(transformer, key);
      if (values instanceof List) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    @Override
    <E extends @Nullable Object> Collection<E> unmodifiableCollectionSubclass(
        Collection<E> collection) {
      if (collection instanceof NavigableSet) {
        return Sets.unmodifiableNavigableSet((NavigableSet<E>) collection);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
   */
  private static <V extends @Nullable Object> Collection<V> unmodifiableValueCollection(
      Collection<V> collection) {
    if (collection instanceof SortedSet) {
      return Collections.unmodifiableSortedSet((SortedSet<V>) collection);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Entry`
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
   */
  private static <K extends @Nullable Object, V extends @Nullable Object>
      Collection<Entry<K, V>> unmodifiableEntries(Collection<Entry<K, V>> entries) {
    if (entries instanceof Set) {
      return Maps.unmodifiableEntrySet((Set<Entry<K, V>>) entries);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
   */
  public static <K, V> ImmutableListMultimap<K, V> index(
      Iterator<V> values, Function<? super V, K> keyFunction) {
    checkNotNull(keyFunction);
    ImmutableListMultimap.Builder<K, V> builder = ImmutableListMultimap.builder();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
   */
  public static <K, V> ImmutableListMultimap<K, V> index(
      Iterator<V> values, Function<? super V, K> keyFunction) {
    checkNotNull(keyFunction);
    ImmutableListMultimap.Builder<K, V> builder = ImmutableListMultimap.builder();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V1`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java

    @CheckForNull
    private Entry<K, V2> transformEntry(@CheckForNull Entry<K, V1> entry) {
      return (entry == null) ? null : Maps.transformEntry(transformer, entry);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java

    // If we inline this, we get a javac error.
    private static <T extends @Nullable Object> Ordering<T> reverse(Comparator<T> forward) {
      return Ordering.from(forward).reverse();
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
  @CheckForNull
  private static <K extends @Nullable Object, V extends @Nullable Object>
      Entry<K, V> unmodifiableOrNull(@CheckForNull Entry<K, ? extends V> entry) {
    return (entry == null) ? null : Maps.unmodifiableEntry(entry);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java

  private static <K extends @Nullable Object, V extends @Nullable Object> Map<K, V> unmodifiableMap(
      Map<K, ? extends V> map) {
    if (map instanceof SortedMap) {
      return Collections.unmodifiableSortedMap((SortedMap<K, ? extends V>) map);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Entry`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java

  static <K extends @Nullable Object, V extends @Nullable Object> Iterator<V> valueIterator(
      Iterator<Entry<K, V>> entryIterator) {
    return new TransformedIterator<Entry<K, V>, V>(entryIterator) {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V2`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
  static <V2 extends @Nullable Object, K extends @Nullable Object, V1 extends @Nullable Object>
      Entry<K, V2> transformEntry(
          final EntryTransformer<? super K, ? super V1, V2> transformer, final Entry<K, V1> entry) {
    checkNotNull(transformer);
    checkNotNull(entry);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
  static <V2 extends @Nullable Object, K extends @Nullable Object, V1 extends @Nullable Object>
      Entry<K, V2> transformEntry(
          final EntryTransformer<? super K, ? super V1, V2> transformer, final Entry<K, V1> entry) {
    checkNotNull(transformer);
    checkNotNull(entry);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V1`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
  static <K extends @Nullable Object, V1 extends @Nullable Object, V2 extends @Nullable Object>
      Function<V1, V2> asValueToValueFunction(
          final EntryTransformer<? super K, V1, V2> transformer, @ParametricNullness final K key) {
    checkNotNull(transformer);
    return new Function<V1, V2>() {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V2`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
  static <K extends @Nullable Object, V1 extends @Nullable Object, V2 extends @Nullable Object>
      Function<V1, V2> asValueToValueFunction(
          final EntryTransformer<? super K, V1, V2> transformer, @ParametricNullness final K key) {
    checkNotNull(transformer);
    return new Function<V1, V2>() {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V2`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
  static <K extends @Nullable Object, V1 extends @Nullable Object, V2 extends @Nullable Object>
      Function<Entry<K, V1>, V2> asEntryToValueFunction(
          final EntryTransformer<? super K, ? super V1, V2> transformer) {
    checkNotNull(transformer);
    return new Function<Entry<K, V1>, V2>() {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java

  private static <K, V> ImmutableMap<K, V> uniqueIndex(
      Iterator<V> values, Function<? super V, K> keyFunction, ImmutableMap.Builder<K, V> builder) {
    checkNotNull(keyFunction);
    while (values.hasNext()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java

  private static <K, V> ImmutableMap<K, V> uniqueIndex(
      Iterator<V> values, Function<? super V, K> keyFunction, ImmutableMap.Builder<K, V> builder) {
    checkNotNull(keyFunction);
    while (values.hasNext()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
   */
  public static <K, V> ImmutableMap<K, V> toMap(
      Iterator<K> keys, Function<? super K, V> valueFunction) {
    checkNotNull(valueFunction);
    ImmutableMap.Builder<K, V> builder = ImmutableMap.builder();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
   */
  public static <K, V> ImmutableMap<K, V> toMap(
      Iterator<K> keys, Function<? super K, V> valueFunction) {
    checkNotNull(valueFunction);
    ImmutableMap.Builder<K, V> builder = ImmutableMap.builder();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java

  /** Returns a map from the ith element of list to i. */
  static <E> ImmutableMap<E, Integer> indexMap(Collection<E> list) {
    ImmutableMap.Builder<E, Integer> builder = new ImmutableMap.Builder<>(list.size());
    int i = 0;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Entry`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
   */
  static <K extends @Nullable Object, V extends @Nullable Object>
      Set<Entry<K, V>> unmodifiableEntrySet(Set<Entry<K, V>> entrySet) {
    return new UnmodifiableEntrySet<>(Collections.unmodifiableSet(entrySet));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Entry`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java

  static <K extends @Nullable Object, V extends @Nullable Object> Iterator<K> keyIterator(
      Iterator<Entry<K, V>> entryIterator) {
    return new TransformedIterator<Entry<K, V>, K>(entryIterator) {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Entry`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
  static <K extends @Nullable Object, V extends @Nullable Object>
      UnmodifiableIterator<Entry<K, V>> unmodifiableEntryIterator(
          final Iterator<Entry<K, V>> entryIterator) {
    return new UnmodifiableIterator<Entry<K, V>>() {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super K`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
      Map<? extends K, ? extends V> right,
      Equivalence<? super V> valueEquivalence,
      Map<K, V> onlyOnLeft,
      Map<K, V> onlyOnRight,
      Map<K, V> onBoth,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
      Map<? extends K, ? extends V> right,
      Equivalence<? super V> valueEquivalence,
      Map<K, V> onlyOnLeft,
      Map<K, V> onlyOnRight,
      Map<K, V> onBoth,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
      Equivalence<? super V> valueEquivalence,
      Map<K, V> onlyOnLeft,
      Map<K, V> onlyOnRight,
      Map<K, V> onBoth,
      Map<K, MapDifference.ValueDifference<V>> differences) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super K`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
      Map<K, V> onlyOnLeft,
      Map<K, V> onlyOnRight,
      Map<K, V> onBoth,
      Map<K, MapDifference.ValueDifference<V>> differences) {
    for (Entry<? extends K, ? extends V> entry : left.entrySet()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
      Map<K, V> onlyOnLeft,
      Map<K, V> onlyOnRight,
      Map<K, V> onBoth,
      Map<K, MapDifference.ValueDifference<V>> differences) {
    for (Entry<? extends K, ? extends V> entry : left.entrySet()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super K`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
      Map<K, V> onlyOnRight,
      Map<K, V> onBoth,
      Map<K, MapDifference.ValueDifference<V>> differences) {
    for (Entry<? extends K, ? extends V> entry : left.entrySet()) {
      K leftKey = entry.getKey();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super MapDifference.ValueDifference`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
      Map<K, V> onlyOnRight,
      Map<K, V> onBoth,
      Map<K, MapDifference.ValueDifference<V>> differences) {
    for (Entry<? extends K, ? extends V> entry : left.entrySet()) {
      K leftKey = entry.getKey();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java

  static <K extends @Nullable Object, V extends @Nullable Object>
      Iterator<Entry<K, V>> asMapEntryIterator(Set<K> set, final Function<? super K, V> function) {
    return new TransformedIterator<K, Entry<K, V>>(set.iterator()) {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java

  static <K extends @Nullable Object, V extends @Nullable Object>
      Iterator<Entry<K, V>> asMapEntryIterator(Set<K> set, final Function<? super K, V> function) {
    return new TransformedIterator<K, Entry<K, V>>(set.iterator()) {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V2`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
  /** Views a function as an entry transformer that ignores the entry key. */
  static <K extends @Nullable Object, V1 extends @Nullable Object, V2 extends @Nullable Object>
      EntryTransformer<K, V1, V2> asEntryTransformer(final Function<? super V1, V2> function) {
    checkNotNull(function);
    return new EntryTransformer<K, V1, V2>() {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
  @GwtIncompatible // NavigableMap
  public static <K extends Comparable<? super K>, V extends @Nullable Object>
      NavigableMap<K, V> subMap(NavigableMap<K, V> map, Range<K> range) {
    if (map.comparator() != null
        && map.comparator() != Ordering.natural()
```

## RuleId[ruleID=NullableProblems]
### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/RegularImmutableMultiset.java`
#### Snippet
```java
  private final transient int hashCode;

  @LazyInit @CheckForNull private transient ImmutableSet<E> elementSet;

  private RegularImmutableMultiset(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMapEntry.java`
#### Snippet
```java
     * in the value bucket (or vice versa).
     */
    @CheckForNull private final transient ImmutableMapEntry<K, V> nextInKeyBucket;

    NonTerminalImmutableMapEntry(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMapEntry.java`
#### Snippet
```java
  static final class NonTerminalImmutableBiMapEntry<K, V>
      extends NonTerminalImmutableMapEntry<K, V> {
    @CheckForNull private final transient ImmutableMapEntry<K, V> nextInValueBucket;

    NonTerminalImmutableBiMapEntry(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/RateLimiter.java`
#### Snippet
```java

  // Can't be initialized in the constructor because mocks don't call the constructor.
  @CheckForNull private volatile Object mutexDoNotUseDirectly;

  private Object mutex() {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractIterator.java`
#### Snippet
```java
  }

  @CheckForNull private T next;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/RegularImmutableMap.java`
#### Snippet
```java
  @VisibleForTesting final transient Entry<K, V>[] entries;
  // array of linked lists of entries
  @CheckForNull private final transient @Nullable ImmutableMapEntry<K, V>[] table;
  // 'and' with an int to get a table index
  private final transient int mask;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java

  /** All waiting threads. */
  @CheckForNull private volatile Waiter waiters;

  /** Constructor for use by subclasses. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    // constants to use when GENERATE_CANCELLATION_CAUSES = false
    @CheckForNull static final Cancellation CAUSELESS_INTERRUPTED;
    @CheckForNull static final Cancellation CAUSELESS_CANCELLED;

    static {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    static final Waiter TOMBSTONE = new Waiter(false /* ignored param */);

    @CheckForNull volatile Thread thread;
    @CheckForNull volatile Waiter next;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
   * </ul>
   */
  @CheckForNull private volatile Object value;

  /** All listeners. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    @CheckForNull // null only for TOMBSTONE
    final Runnable task;
    @CheckForNull // null only for TOMBSTONE
    final Executor executor;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java

    @CheckForNull volatile Thread thread;
    @CheckForNull volatile Waiter next;

    /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java

  /** All listeners. */
  @CheckForNull private volatile Listener listeners;

  /** All waiting threads. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java

    final boolean wasInterrupted;
    @CheckForNull final Throwable cause;

    Cancellation(boolean wasInterrupted, @CheckForNull Throwable cause) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java

    // writes to next are made visible by subsequent CAS's on the listeners field
    @CheckForNull Listener next;

    Listener(Runnable task, Executor executor) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
  private static final class Listener {
    static final Listener TOMBSTONE = new Listener();
    @CheckForNull // null only for TOMBSTONE
    final Runnable task;
    @CheckForNull // null only for TOMBSTONE
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
  private static final class Cancellation {
    // constants to use when GENERATE_CANCELLATION_CAUSES = false
    @CheckForNull static final Cancellation CAUSELESS_INTERRUPTED;
    @CheckForNull static final Cancellation CAUSELESS_CANCELLED;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilderSpec.java`
#### Snippet
```java
  @VisibleForTesting @CheckForNull TimeUnit accessExpirationTimeUnit;
  @VisibleForTesting long refreshDuration;
  @VisibleForTesting @CheckForNull TimeUnit refreshTimeUnit;
  /** Specification; used for toParseableString(). */
  private final String specification;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilderSpec.java`
#### Snippet
```java
          .buildOrThrow();

  @VisibleForTesting @CheckForNull Integer initialCapacity;
  @VisibleForTesting @CheckForNull Long maximumSize;
  @VisibleForTesting @CheckForNull Long maximumWeight;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilderSpec.java`
#### Snippet
```java

  @VisibleForTesting @CheckForNull Integer initialCapacity;
  @VisibleForTesting @CheckForNull Long maximumSize;
  @VisibleForTesting @CheckForNull Long maximumWeight;
  @VisibleForTesting @CheckForNull Integer concurrencyLevel;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilderSpec.java`
#### Snippet
```java
  @VisibleForTesting @CheckForNull Integer initialCapacity;
  @VisibleForTesting @CheckForNull Long maximumSize;
  @VisibleForTesting @CheckForNull Long maximumWeight;
  @VisibleForTesting @CheckForNull Integer concurrencyLevel;
  @VisibleForTesting @CheckForNull Strength keyStrength;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilderSpec.java`
#### Snippet
```java
  @VisibleForTesting @CheckForNull TimeUnit writeExpirationTimeUnit;
  @VisibleForTesting long accessExpirationDuration;
  @VisibleForTesting @CheckForNull TimeUnit accessExpirationTimeUnit;
  @VisibleForTesting long refreshDuration;
  @VisibleForTesting @CheckForNull TimeUnit refreshTimeUnit;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilderSpec.java`
#### Snippet
```java
  @VisibleForTesting @CheckForNull Boolean recordStats;
  @VisibleForTesting long writeExpirationDuration;
  @VisibleForTesting @CheckForNull TimeUnit writeExpirationTimeUnit;
  @VisibleForTesting long accessExpirationDuration;
  @VisibleForTesting @CheckForNull TimeUnit accessExpirationTimeUnit;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilderSpec.java`
#### Snippet
```java
  @VisibleForTesting @CheckForNull Integer concurrencyLevel;
  @VisibleForTesting @CheckForNull Strength keyStrength;
  @VisibleForTesting @CheckForNull Strength valueStrength;
  @VisibleForTesting @CheckForNull Boolean recordStats;
  @VisibleForTesting long writeExpirationDuration;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilderSpec.java`
#### Snippet
```java
  @VisibleForTesting @CheckForNull Long maximumWeight;
  @VisibleForTesting @CheckForNull Integer concurrencyLevel;
  @VisibleForTesting @CheckForNull Strength keyStrength;
  @VisibleForTesting @CheckForNull Strength valueStrength;
  @VisibleForTesting @CheckForNull Boolean recordStats;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilderSpec.java`
#### Snippet
```java
  @VisibleForTesting @CheckForNull Long maximumSize;
  @VisibleForTesting @CheckForNull Long maximumWeight;
  @VisibleForTesting @CheckForNull Integer concurrencyLevel;
  @VisibleForTesting @CheckForNull Strength keyStrength;
  @VisibleForTesting @CheckForNull Strength valueStrength;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilderSpec.java`
#### Snippet
```java
  @VisibleForTesting @CheckForNull Strength keyStrength;
  @VisibleForTesting @CheckForNull Strength valueStrength;
  @VisibleForTesting @CheckForNull Boolean recordStats;
  @VisibleForTesting long writeExpirationDuration;
  @VisibleForTesting @CheckForNull TimeUnit writeExpirationTimeUnit;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ExecutionList.java`
#### Snippet
```java
    final Runnable runnable;
    final Executor executor;
    @CheckForNull RunnableExecutorPair next;

    RunnableExecutorPair(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ExecutionList.java`
#### Snippet
```java
   */
  @GuardedBy("this")
  @CheckForNull
  private RunnableExecutorPair runnables;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/base/Functions.java`
#### Snippet
```java
      implements Function<K, V>, Serializable {
    final Map<K, ? extends V> map;
    @ParametricNullness final V defaultValue;

    ForMapWithDefault(Map<K, ? extends V> map, @ParametricNullness V defaultValue) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/base/Functions.java`
#### Snippet
```java
  private static class ConstantFunction<E extends @Nullable Object>
      implements Function<@Nullable Object, E>, Serializable {
    @ParametricNullness private final E value;

    public ConstantFunction(@ParametricNullness E value) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/CharSequenceReader.java`
#### Snippet
```java
final class CharSequenceReader extends Reader {

  @CheckForNull private CharSequence seq;
  private int pos;
  private int mark;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/AbstractIterator.java`
#### Snippet
```java
  }

  @CheckForNull private T next;

  @CheckForNull
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/MoreCollectors.java`
#### Snippet
```java
    static final int MAX_EXTRAS = 4;

    @Nullable Object element;
    List<Object> extras;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMultiset.java`
#### Snippet
```java
  abstract Iterator<E> elementIterator();

  @LazyInit @CheckForNull private transient Set<Entry<E>> entrySet;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMultiset.java`
#### Snippet
```java
  // Views

  @LazyInit @CheckForNull private transient Set<E> elementSet;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
    int nextIndex;
    @CheckForNull Node<K, V> next;
    @CheckForNull Node<K, V> current;
    @CheckForNull Node<K, V> previous;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
    @CheckForNull Node<K, V> previous; // the previous node (with any key)
    @CheckForNull Node<K, V> nextSibling; // the next node with the same key
    @CheckForNull Node<K, V> previousSibling; // the previous node with the same key

    Node(@ParametricNullness K key, @ParametricNullness V value) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
    int nextIndex;
    @CheckForNull Node<K, V> next;
    @CheckForNull Node<K, V> current;
    @CheckForNull Node<K, V> previous;
    int expectedModCount = modCount;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
    @ParametricNullness final K key;
    @ParametricNullness V value;
    @CheckForNull Node<K, V> next; // the next node (with any key)
    @CheckForNull Node<K, V> previous; // the previous node (with any key)
    @CheckForNull Node<K, V> nextSibling; // the next node with the same key
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
    final Set<K> seenKeys = Sets.<K>newHashSetWithExpectedSize(keySet().size());
    @CheckForNull Node<K, V> next = head;
    @CheckForNull Node<K, V> current;
    int expectedModCount = modCount;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
    @CheckForNull Node<K, V> next;
    @CheckForNull Node<K, V> current;
    @CheckForNull Node<K, V> previous;

    /** Constructs a new iterator over all values for the specified key. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
  private static final class Node<K extends @Nullable Object, V extends @Nullable Object>
      extends AbstractMapEntry<K, V> {
    @ParametricNullness final K key;
    @ParametricNullness V value;
    @CheckForNull Node<K, V> next; // the next node (with any key)
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
    @ParametricNullness V value;
    @CheckForNull Node<K, V> next; // the next node (with any key)
    @CheckForNull Node<K, V> previous; // the previous node (with any key)
    @CheckForNull Node<K, V> nextSibling; // the next node with the same key
    @CheckForNull Node<K, V> previousSibling; // the previous node with the same key
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
    @ParametricNullness final K key;
    int nextIndex;
    @CheckForNull Node<K, V> next;
    @CheckForNull Node<K, V> current;
    @CheckForNull Node<K, V> previous;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
  }

  @CheckForNull private transient Node<K, V> head; // the head for all keys
  @CheckForNull private transient Node<K, V> tail; // the tail for all keys
  private transient Map<K, KeyList<K, V>> keyToKeyList;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
    @CheckForNull Node<K, V> next;
    @CheckForNull Node<K, V> current;
    @CheckForNull Node<K, V> previous;
    int expectedModCount = modCount;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
    @CheckForNull Node<K, V> next; // the next node (with any key)
    @CheckForNull Node<K, V> previous; // the previous node (with any key)
    @CheckForNull Node<K, V> nextSibling; // the next node with the same key
    @CheckForNull Node<K, V> previousSibling; // the previous node with the same key

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
  /** A {@code ListIterator} over values for a specified key. */
  private class ValueForKeyIterator implements ListIterator<V> {
    @ParametricNullness final K key;
    int nextIndex;
    @CheckForNull Node<K, V> next;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
      extends AbstractMapEntry<K, V> {
    @ParametricNullness final K key;
    @ParametricNullness V value;
    @CheckForNull Node<K, V> next; // the next node (with any key)
    @CheckForNull Node<K, V> previous; // the previous node (with any key)
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java

  @CheckForNull private transient Node<K, V> head; // the head for all keys
  @CheckForNull private transient Node<K, V> tail; // the tail for all keys
  private transient Map<K, KeyList<K, V>> keyToKeyList;
  private transient int size;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
  private class DistinctKeyIterator implements Iterator<K> {
    final Set<K> seenKeys = Sets.<K>newHashSetWithExpectedSize(keySet().size());
    @CheckForNull Node<K, V> next = head;
    @CheckForNull Node<K, V> current;
    int expectedModCount = modCount;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
  private class NodeIterator implements ListIterator<Entry<K, V>> {
    int nextIndex;
    @CheckForNull Node<K, V> next;
    @CheckForNull Node<K, V> current;
    @CheckForNull Node<K, V> previous;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/SingletonImmutableBiMap.java`
#### Snippet
```java
  }

  @CheckForNull private final transient ImmutableBiMap<V, K> inverse;
  @LazyInit @RetainedWith @CheckForNull private transient ImmutableBiMap<V, K> lazyInverse;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/SingletonImmutableBiMap.java`
#### Snippet
```java

  @CheckForNull private final transient ImmutableBiMap<V, K> inverse;
  @LazyInit @RetainedWith @CheckForNull private transient ImmutableBiMap<V, K> lazyInverse;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ForwardingNavigableMap.java`
#### Snippet
```java
    protected Iterator<Entry<K, V>> entryIterator() {
      return new Iterator<Entry<K, V>>() {
        @CheckForNull private Entry<K, V> toRemove = null;
        @CheckForNull private Entry<K, V> nextOrNull = forward().lastEntry();

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ForwardingNavigableMap.java`
#### Snippet
```java
      return new Iterator<Entry<K, V>>() {
        @CheckForNull private Entry<K, V> toRemove = null;
        @CheckForNull private Entry<K, V> nextOrNull = forward().lastEntry();

        @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
    // These two fields are volatile because their values will be accessed from multiple threads.
    @CheckForNull private volatile Cancellable runningTask;
    @CheckForNull private volatile ScheduledExecutorService executorService;

    // This lock protects the task so we can ensure that none of the template methods (startUp,
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
      /** The future that represents the next execution of this task. */
      @GuardedBy("lock")
      @CheckForNull
      private SupplantableFuture cancellationDelegate;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
    // A handle to the running task so that we can stop it when a shutdown has been requested.
    // These two fields are volatile because their values will be accessed from multiple threads.
    @CheckForNull private volatile Cancellable runningTask;
    @CheckForNull private volatile ScheduledExecutorService executorService;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashSet.java`
#### Snippet
```java
   * </ul>
   */
  @CheckForNull private transient Object table;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashSet.java`
#### Snippet
```java
   * elements.length) are all {@code null}.
   */
  @VisibleForTesting @CheckForNull transient @Nullable Object[] elements;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashSet.java`
#### Snippet
```java
   * <p>The pointers in [size(), entries.length) are all "null" (UNSET).
   */
  @CheckForNull private transient int[] entries;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMultimap.java`
#### Snippet
```java
    final Map<K, Collection<V>> builderMap;
    @CheckForNull Comparator<? super K> keyComparator;
    @CheckForNull Comparator<? super V> valueComparator;

    /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMultimap.java`
#### Snippet
```java
      final Iterator<? extends Entry<K, ? extends ImmutableCollection<V>>> asMapItr =
          map.entrySet().iterator();
      @CheckForNull K currentKey = null;
      Iterator<V> valueItr = Iterators.emptyIterator();

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMultimap.java`
#### Snippet
```java
  public static class Builder<K, V> {
    final Map<K, Collection<V>> builderMap;
    @CheckForNull Comparator<? super K> keyComparator;
    @CheckForNull Comparator<? super V> valueComparator;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/FilteredEntryMultimap.java`
#### Snippet
```java

  final class ValuePredicate implements Predicate<V> {
    @ParametricNullness private final K key;

    ValuePredicate(@ParametricNullness K key) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
  }

  @CheckForNull private transient Collection<V> valuesView;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
  }

  @CheckForNull private transient Set<K> keySetView;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
   * </ul>
   */
  @CheckForNull private transient Object table;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
  }

  @CheckForNull private transient Set<Entry<K, V>> entrySetView;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java

  final class MapEntry extends AbstractMapEntry<K, V> {
    @ParametricNullness private final K key;

    private int lastKnownIndex;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
   * keys.length) are all {@code null}.
   */
  @VisibleForTesting @CheckForNull transient @Nullable Object[] keys;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
   * values.length) are all {@code null}.
   */
  @VisibleForTesting @CheckForNull transient @Nullable Object[] values;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
   * <p>The pointers in [size(), entries.length) are all "null" (UNSET).
   */
  @VisibleForTesting @CheckForNull transient int[] entries;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/LineReader.java`
#### Snippet
```java
public final class LineReader {
  private final Readable readable;
  @CheckForNull private final Reader reader;
  private final CharBuffer cbuf = createBuffer();
  private final char[] buf = cbuf.array();
```

### RuleId[ruleID=NullableProblems]
Method annotated with @NotNull must not override @NotNull method
in `guava/src/com/google/common/util/concurrent/WrappingExecutorService.java`
#### Snippet
```java

  @Override
  public final <T extends @Nullable Object> T invokeAny(Collection<? extends Callable<T>> tasks)
      throws InterruptedException, ExecutionException {
    return delegate.invokeAny(wrapTasks(tasks));
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/UndirectedMultiNetworkConnections.java`
#### Snippet
```java
  }

  @CheckForNull @LazyInit private transient Reference<Multiset<N>> adjacentNodesReference;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/escape/Escapers.java`
#### Snippet
```java
    public Escaper build() {
      return new ArrayBasedCharEscaper(replacementMap, safeMin, safeMax) {
        @CheckForNull
        private final char[] replacementChars =
            unsafeReplacement != null ? unsafeReplacement.toCharArray() : null;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/escape/Escapers.java`
#### Snippet
```java
    private char safeMin = Character.MIN_VALUE;
    private char safeMax = Character.MAX_VALUE;
    @CheckForNull private String unsafeReplacement = null;

    // The constructor is exposed via the builder() method above.
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/UnmodifiableSortedMultiset.java`
#### Snippet
```java
  }

  @CheckForNull private transient UnmodifiableSortedMultiset<E> descendingMultiset;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
  private final Comparator<? super T> comparator;
  private final boolean hasLowerBound;
  @CheckForNull private final T lowerEndpoint;
  private final BoundType lowerBoundType;
  private final boolean hasUpperBound;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
  private final BoundType lowerBoundType;
  private final boolean hasUpperBound;
  @CheckForNull private final T upperEndpoint;
  private final BoundType upperBoundType;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
  }

  @CheckForNull private transient GeneralRange<T> reverse;

  /** Returns the same range relative to the reversed comparator. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ConcurrentHashMultiset.java`
#### Snippet
```java

    return new ForwardingIterator<Entry<E>>() {
      @CheckForNull private Entry<E> last;

      @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java

  /** Table of cells. When non-null, size is a power of 2. */
  @CheckForNull transient volatile Cell[] cells;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableListMultimap.java`
#### Snippet
```java
  }

  @LazyInit @RetainedWith @CheckForNull private transient ImmutableListMultimap<V, K> inverse;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/RegularImmutableBiMap.java`
#### Snippet
```java
  }

  @LazyInit @RetainedWith @CheckForNull private transient ImmutableBiMap<V, K> inverse;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/RegularImmutableBiMap.java`
#### Snippet
```java
  static final double MAX_LOAD_FACTOR = 1.2;

  @CheckForNull private final transient @Nullable ImmutableMapEntry<K, V>[] keyTable;
  @CheckForNull private final transient @Nullable ImmutableMapEntry<K, V>[] valueTable;
  @VisibleForTesting final transient Entry<K, V>[] entries;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/RegularImmutableBiMap.java`
#### Snippet
```java

  @CheckForNull private final transient @Nullable ImmutableMapEntry<K, V>[] keyTable;
  @CheckForNull private final transient @Nullable ImmutableMapEntry<K, V>[] valueTable;
  @VisibleForTesting final transient Entry<K, V>[] entries;
  private final transient int mask;
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningExecutorService.java`
#### Snippet
```java
   */
  @Override
  <T extends @Nullable Object> ListenableFuture<T> submit(Callable<T> task);

  /**
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningExecutorService.java`
#### Snippet
```java
   */
  @Override
  ListenableFuture<?> submit(Runnable task);

  /**
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningExecutorService.java`
#### Snippet
```java
   */
  @Override
  <T extends @Nullable Object> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks)
      throws InterruptedException;

```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningExecutorService.java`
#### Snippet
```java
  @Override
  <T extends @Nullable Object> List<Future<T>> invokeAll(
      Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
      throws InterruptedException;
}
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningExecutorService.java`
#### Snippet
```java
  @Override
  <T extends @Nullable Object> List<Future<T>> invokeAll(
      Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
      throws InterruptedException;
}
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningExecutorService.java`
#### Snippet
```java
  @Override
  <T extends @Nullable Object> ListenableFuture<T> submit(
      Runnable task, @ParametricNullness T result);

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/Futures.java`
#### Snippet
```java
  private static final class NonCancellationPropagatingFuture<V extends @Nullable Object>
      extends AbstractFuture.TrustedFuture<V> implements Runnable {
    @CheckForNull private ListenableFuture<V> delegate;

    NonCancellationPropagatingFuture(final ListenableFuture<V> delegate) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/Futures.java`
#### Snippet
```java
  private static final class InCompletionOrderFuture<T extends @Nullable Object>
      extends AbstractFuture<T> {
    @CheckForNull private InCompletionOrderState<T> state;

    private InCompletionOrderFuture(InCompletionOrderState<T> state) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  }

  @LazyInit @CheckForNull private transient Collection<Entry<K, V>> entries;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  }

  @LazyInit @CheckForNull private transient Set<K> keySet;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  abstract Set<K> createKeySet();

  @LazyInit @CheckForNull private transient Multiset<K> keys;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  }

  @LazyInit @CheckForNull private transient Map<K, Collection<V>> asMap;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  abstract Multiset<K> createKeys();

  @LazyInit @CheckForNull private transient Collection<V> values;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
    }

    @CheckForNull transient Set<Multiset.Entry<E>> entrySet;

    @SuppressWarnings("unchecked")
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
    private final Multiset<E> multiset;
    private final Iterator<Entry<E>> entryIterator;
    @CheckForNull private Entry<E> currentEntry;

    /** Count of subsequent elements equal to current element */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
    }

    @CheckForNull transient Set<E> elementSet;

    Set<E> createElementSet() {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
  static class ImmutableEntry<E extends @Nullable Object> extends AbstractEntry<E>
      implements Serializable {
    @ParametricNullness private final E element;
    private final int count;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/base/Equivalence.java`
#### Snippet
```java
    private final Equivalence<? super @NonNull T> equivalence;

    @ParametricNullness private final T reference;

    private Wrapper(Equivalence<? super @NonNull T> equivalence, @ParametricNullness T reference) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/Equivalence.java`
#### Snippet
```java

    private final Equivalence<T> equivalence;
    @CheckForNull private final T target;

    EquivalentToPredicate(Equivalence<T> equivalence, @CheckForNull T target) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/ImmutableEntry.java`
#### Snippet
```java
    extends AbstractMapEntry<K, V> implements Serializable {
  @ParametricNullness final K key;
  @ParametricNullness final V value;

  ImmutableEntry(@ParametricNullness K key, @ParametricNullness V value) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/ImmutableEntry.java`
#### Snippet
```java
class ImmutableEntry<K extends @Nullable Object, V extends @Nullable Object>
    extends AbstractMapEntry<K, V> implements Serializable {
  @ParametricNullness final K key;
  @ParametricNullness final V value;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMaker.java`
#### Snippet
```java
  @CheckForNull Strength valueStrength;

  @CheckForNull Equivalence<Object> keyEquivalence;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMaker.java`
#### Snippet
```java
  int concurrencyLevel = UNSET_INT;

  @CheckForNull Strength keyStrength;
  @CheckForNull Strength valueStrength;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMaker.java`
#### Snippet
```java

  @CheckForNull Strength keyStrength;
  @CheckForNull Strength valueStrength;

  @CheckForNull Equivalence<Object> keyEquivalence;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
    class AsMapIterator implements Iterator<Entry<K, Collection<V>>> {
      final Iterator<Entry<K, Collection<V>>> delegateIterator = submap.entrySet().iterator();
      @CheckForNull Collection<V> collection;

      @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
      final Iterator<Entry<K, Collection<V>>> entryIterator = map().entrySet().iterator();
      return new Iterator<K>() {
        @CheckForNull Entry<K, Collection<V>> entry;

        @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
    Collection<V> delegate;
    @CheckForNull final WrappedCollection ancestor;
    @CheckForNull final Collection<V> ancestorDelegate;

    WrappedCollection(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
  private abstract class Itr<T extends @Nullable Object> implements Iterator<T> {
    final Iterator<Entry<K, Collection<V>>> keyIterator;
    @CheckForNull K key;
    @CheckForNull Collection<V> collection;
    Iterator<V> valueIterator;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
    }

    @CheckForNull SortedSet<K> sortedKeySet;

    // returns a SortedSet, even though returning a Set would be sufficient to
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
  @WeakOuter
  class WrappedCollection extends AbstractCollection<V> {
    @ParametricNullness final K key;
    Collection<V> delegate;
    @CheckForNull final WrappedCollection ancestor;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
    final Iterator<Entry<K, Collection<V>>> keyIterator;
    @CheckForNull K key;
    @CheckForNull Collection<V> collection;
    Iterator<V> valueIterator;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
    @ParametricNullness final K key;
    Collection<V> delegate;
    @CheckForNull final WrappedCollection ancestor;
    @CheckForNull final Collection<V> ancestorDelegate;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/DescendingMultiset.java`
#### Snippet
```java
  }

  @CheckForNull private transient NavigableSet<E> elementSet;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/DescendingMultiset.java`
#### Snippet
```java
  abstract Iterator<Entry<E>> entryIterator();

  @CheckForNull private transient Set<Entry<E>> entrySet;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/DescendingMultiset.java`
#### Snippet
```java
  abstract SortedMultiset<E> forwardMultiset();

  @CheckForNull private transient Comparator<? super E> comparator;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/Lists.java`
#### Snippet
```java
  private static class OnePlusArrayList<E extends @Nullable Object> extends AbstractList<E>
      implements Serializable, RandomAccess {
    @ParametricNullness final E first;
    final E[] rest;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/Lists.java`
#### Snippet
```java
      implements Serializable, RandomAccess {
    @ParametricNullness final E first;
    @ParametricNullness final E second;
    final E[] rest;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/Lists.java`
#### Snippet
```java
  private static class TwoPlusArrayList<E extends @Nullable Object> extends AbstractList<E>
      implements Serializable, RandomAccess {
    @ParametricNullness final E first;
    @ParametricNullness final E second;
    final E[] rest;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
  Iterator<Entry<E>> descendingEntryIterator() {
    return new Iterator<Entry<E>>() {
      @CheckForNull AvlNode<E> current = lastNode();
      @CheckForNull Entry<E> prevEntry = null;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java

  private static final class Reference<T> {
    @CheckForNull private T value;

    @CheckForNull
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
    private int height;
    @CheckForNull private AvlNode<E> left;
    @CheckForNull private AvlNode<E> right;
    /*
     * pred and succ are nullable after construction, but we always call successor() to initialize
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
    return new Iterator<Entry<E>>() {
      @CheckForNull AvlNode<E> current = lastNode();
      @CheckForNull Entry<E> prevEntry = null;

      @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
     */
    @CheckForNull private AvlNode<E> pred;
    @CheckForNull private AvlNode<E> succ;

    AvlNode(@ParametricNullness E elem, int elemCount) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
    private long totalCount;
    private int height;
    @CheckForNull private AvlNode<E> left;
    @CheckForNull private AvlNode<E> right;
    /*
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
     * methods, which perform null checks before returning the fields.
     */
    @CheckForNull private AvlNode<E> pred;
    @CheckForNull private AvlNode<E> succ;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
  Iterator<Entry<E>> entryIterator() {
    return new Iterator<Entry<E>>() {
      @CheckForNull AvlNode<E> current = firstNode();
      @CheckForNull Entry<E> prevEntry;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
     * the elem field without a null check by calling getElement().
     */
    @CheckForNull private final E elem;

    // elemCount is 0 iff this node has been deleted.
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
    return new Iterator<Entry<E>>() {
      @CheckForNull AvlNode<E> current = firstNode();
      @CheckForNull Entry<E> prevEntry;

      @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AggregateFuture.java`
#### Snippet
```java
   * triggered by cancel(). For details, see the comments on the fields of TimeoutFuture.
   */
  @CheckForNull private ImmutableCollection<? extends ListenableFuture<? extends InputT>> futures;

  private final boolean allMustSucceed;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractTable.java`
#### Snippet
```java
  }

  @LazyInit @CheckForNull private transient Collection<V> values;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractTable.java`
#### Snippet
```java
  }

  @LazyInit @CheckForNull private transient Set<Cell<R, C, V>> cellSet;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/MultiInputStream.java`
#### Snippet
```java

  private Iterator<? extends ByteSource> it;
  @CheckForNull private InputStream in;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/TrustedListenableFutureTask.java`
#### Snippet
```java
   * https://developers.google.com/j2objc/guides/j2objc-memory-model#atomicity
   */
  @CheckForNull private volatile InterruptibleTask<?> task;

  TrustedListenableFutureTask(Callable<V> callable) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/MoreObjects.java`
#### Snippet
```java
    // Holder object for values that might be null and/or empty.
    private static class ValueHolder {
      @CheckForNull String name;
      @CheckForNull Object value;
      @CheckForNull ValueHolder next;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/MoreObjects.java`
#### Snippet
```java
      @CheckForNull String name;
      @CheckForNull Object value;
      @CheckForNull ValueHolder next;
    }

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/MoreObjects.java`
#### Snippet
```java
    private static class ValueHolder {
      @CheckForNull String name;
      @CheckForNull Object value;
      @CheckForNull ValueHolder next;
    }
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactLinkedHashSet.java`
#### Snippet
```java
   * node in insertion order; all values at indices ? {@link #size()} are UNSET.
   */
  @CheckForNull private transient int[] successor;

  /** Pointer to the first node in the linked list, or {@code ENDPOINT} if there are no entries. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactLinkedHashSet.java`
#### Snippet
```java
   * first node in insertion order; all values at indices ? {@link #size()} are UNSET.
   */
  @CheckForNull private transient int[] predecessor;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
    @LazyInit @CheckForNull private volatile BaseEncoding upperCase;
    @LazyInit @CheckForNull private volatile BaseEncoding lowerCase;
    @LazyInit @CheckForNull private volatile BaseEncoding ignoreCase;

    @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java

    @LazyInit @CheckForNull private volatile BaseEncoding upperCase;
    @LazyInit @CheckForNull private volatile BaseEncoding lowerCase;
    @LazyInit @CheckForNull private volatile BaseEncoding ignoreCase;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
    }

    @LazyInit @CheckForNull private volatile BaseEncoding upperCase;
    @LazyInit @CheckForNull private volatile BaseEncoding lowerCase;
    @LazyInit @CheckForNull private volatile BaseEncoding ignoreCase;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
    final Alphabet alphabet;

    @CheckForNull final Character paddingChar;

    StandardBaseEncoding(String name, String alphabetChars, @CheckForNull Character paddingChar) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
  }

  @LazyInit @RetainedWith @CheckForNull private transient ImmutableSetMultimap<V, K> inverse;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
  }

  @LazyInit @RetainedWith @CheckForNull private transient ImmutableSet<Entry<K, V>> entries;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
    }

    @CheckForNull private transient Integer size;

    @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
  }

  @LazyInit @CheckForNull private transient ImmutableRangeSet<C> complement;

  private final class ComplementRanges extends ImmutableList<Range<C>> {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/Converter.java`
#### Snippet
```java

  // We lazily cache the reverse view to avoid allocating on every call to reverse().
  @LazyInit @RetainedWith @CheckForNull private transient Converter<B, A> reverse;

  /** Constructor for use by subclasses. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/NaturalOrdering.java`
#### Snippet
```java
  static final NaturalOrdering INSTANCE = new NaturalOrdering();

  @CheckForNull private transient Ordering<@Nullable Comparable<?>> nullsFirst;
  @CheckForNull private transient Ordering<@Nullable Comparable<?>> nullsLast;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/NaturalOrdering.java`
#### Snippet
```java

  @CheckForNull private transient Ordering<@Nullable Comparable<?>> nullsFirst;
  @CheckForNull private transient Ordering<@Nullable Comparable<?>> nullsLast;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/MultiReader.java`
#### Snippet
```java
class MultiReader extends Reader {
  private final Iterator<? extends CharSource> it;
  @CheckForNull private Reader current;

  MultiReader(Iterator<? extends CharSource> readers) throws IOException {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
     */

    @ParametricNullness private final K key;
    @VisibleForTesting @Nullable ValueEntry<K, V>[] hashTable;
    private int size = 0;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
      return new Iterator<V>() {
        ValueSetLink<K, V> nextEntry = firstEntry;
        @CheckForNull ValueEntry<K, V> toRemove;
        int expectedModCount = modCount;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java

    @CheckForNull ValueEntry<K, V> predecessorInMultimap;
    @CheckForNull ValueEntry<K, V> successorInMultimap;

    ValueEntry(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
    @CheckForNull ValueSetLink<K, V> successorInValueSet;

    @CheckForNull ValueEntry<K, V> predecessorInMultimap;
    @CheckForNull ValueEntry<K, V> successorInMultimap;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java

    @CheckForNull ValueSetLink<K, V> predecessorInValueSet;
    @CheckForNull ValueSetLink<K, V> successorInValueSet;

    @CheckForNull ValueEntry<K, V> predecessorInMultimap;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
    final int smearedValueHash;

    @CheckForNull ValueEntry<K, V> nextInValueBucket;
    /*
     * The *InValueSet and *InMultimap fields below are null after construction, but we almost
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
     */

    @CheckForNull ValueSetLink<K, V> predecessorInValueSet;
    @CheckForNull ValueSetLink<K, V> successorInValueSet;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
    return new Iterator<Entry<K, V>>() {
      ValueEntry<K, V> nextEntry = multimapHeaderEntry.getSuccessorInMultimap();
      @CheckForNull ValueEntry<K, V> toRemove;

      @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    int nextTableIndex;
    @CheckForNull Segment<K, V, E, S> currentSegment;
    @CheckForNull AtomicReferenceArray<E> currentTable;
    @CheckForNull E nextEntry;
    @CheckForNull WriteThroughEntry nextExternal;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
  }

  @CheckForNull transient Set<K> keySet;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      extends AbstractWeakKeyEntry<K, V, WeakKeyStrongValueEntry<K, V>>
      implements StrongValueEntry<K, V, WeakKeyStrongValueEntry<K, V>> {
    @CheckForNull private volatile V value = null;

    private WeakKeyStrongValueEntry(ReferenceQueue<K> queue, K key, int hash) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    @CheckForNull Segment<K, V, E, S> currentSegment;
    @CheckForNull AtomicReferenceArray<E> currentTable;
    @CheckForNull E nextEntry;
    @CheckForNull WriteThroughEntry nextExternal;
    @CheckForNull WriteThroughEntry lastReturned;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      extends AbstractStrongKeyEntry<K, V, StrongKeyStrongValueEntry<K, V>>
      implements StrongValueEntry<K, V, StrongKeyStrongValueEntry<K, V>> {
    @CheckForNull private volatile V value = null;

    private StrongKeyStrongValueEntry(K key, int hash) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    @CheckForNull E nextEntry;
    @CheckForNull WriteThroughEntry nextExternal;
    @CheckForNull WriteThroughEntry lastReturned;

    HashIterator() {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    int nextSegmentIndex;
    int nextTableIndex;
    @CheckForNull Segment<K, V, E, S> currentSegment;
    @CheckForNull AtomicReferenceArray<E> currentTable;
    @CheckForNull E nextEntry;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    @CheckForNull AtomicReferenceArray<E> currentTable;
    @CheckForNull E nextEntry;
    @CheckForNull WriteThroughEntry nextExternal;
    @CheckForNull WriteThroughEntry lastReturned;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
  }

  @CheckForNull transient Collection<V> values;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
  }

  @CheckForNull transient Set<Entry<K, V>> entrySet;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

    /** The per-segment table. */
    @CheckForNull volatile AtomicReferenceArray<E> table;

    /** The maximum size of this map. MapMaker.UNSET_INT if there is no maximum. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
  }

  @CheckForNull private transient Set<Range<C>> asRanges;
  @CheckForNull private transient Set<Range<C>> asDescendingSetOfRanges;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
  }

  @CheckForNull private transient RangeSet<C> complement;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java

  @CheckForNull private transient Set<Range<C>> asRanges;
  @CheckForNull private transient Set<Range<C>> asDescendingSetOfRanges;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/internal/Finalizer.java`
#### Snippet
```java
  private static final Constructor<Thread> bigThreadConstructor = getBigThreadConstructor();

  @CheckForNull
  private static final Field inheritableThreadLocals =
      (bigThreadConstructor == null) ? getInheritableThreadLocalsField() : null;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/internal/Finalizer.java`
#### Snippet
```java
  // But before Java 9, our only way not to inherit ThreadLocals is to zap them after the thread
  // is created, by accessing a private field.
  @CheckForNull
  private static final Constructor<Thread> bigThreadConstructor = getBigThreadConstructor();

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java
  }

  @CheckForNull private transient Set<V> valueSet;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java
  }

  @CheckForNull private transient Set<K> keySet;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java
  }

  @CheckForNull private transient Set<Entry<K, V>> entrySet;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java
    final Iterator<Entry<K, V>> iterator = delegate.entrySet().iterator();
    return new Iterator<Entry<K, V>>() {
      @CheckForNull Entry<K, V> entry;

      @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/Tables.java`
#### Snippet
```java
    @ParametricNullness private final R rowKey;
    @ParametricNullness private final C columnKey;
    @ParametricNullness private final V value;

    ImmutableCell(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/Tables.java`
#### Snippet
```java
      extends AbstractCell<R, C, V> implements Serializable {
    @ParametricNullness private final R rowKey;
    @ParametricNullness private final C columnKey;
    @ParametricNullness private final V value;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/Tables.java`
#### Snippet
```java
          R extends @Nullable Object, C extends @Nullable Object, V extends @Nullable Object>
      extends AbstractCell<R, C, V> implements Serializable {
    @ParametricNullness private final R rowKey;
    @ParametricNullness private final C columnKey;
    @ParametricNullness private final V value;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/util/concurrent/ImmediateFuture.java`
#### Snippet
```java

  static final class ImmediateCancelledFuture<V extends @Nullable Object> extends TrustedFuture<V> {
    static final @Nullable ImmediateCancelledFuture<Object> INSTANCE =
        AbstractFuture.GENERATE_CANCELLATION_CAUSES ? null : new ImmediateCancelledFuture<>();

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/util/concurrent/ImmediateFuture.java`
#### Snippet
```java
  private static final Logger log = Logger.getLogger(ImmediateFuture.class.getName());

  @ParametricNullness private final V value;

  ImmediateFuture(@ParametricNullness V value) {
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningScheduledExecutorService.java`
#### Snippet
```java
  @Override
  ListenableScheduledFuture<?> scheduleAtFixedRate(
      Runnable command, long initialDelay, long period, TimeUnit unit);

  /**
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningScheduledExecutorService.java`
#### Snippet
```java
  @Override
  ListenableScheduledFuture<?> scheduleAtFixedRate(
      Runnable command, long initialDelay, long period, TimeUnit unit);

  /**
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningScheduledExecutorService.java`
#### Snippet
```java
  @Override
  <V extends @Nullable Object> ListenableScheduledFuture<V> schedule(
      Callable<V> callable, long delay, TimeUnit unit);

  /**
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningScheduledExecutorService.java`
#### Snippet
```java
  @Override
  <V extends @Nullable Object> ListenableScheduledFuture<V> schedule(
      Callable<V> callable, long delay, TimeUnit unit);

  /**
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningScheduledExecutorService.java`
#### Snippet
```java
  @Override
  ListenableScheduledFuture<?> scheduleWithFixedDelay(
      Runnable command, long initialDelay, long delay, TimeUnit unit);

  /**
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningScheduledExecutorService.java`
#### Snippet
```java
  @Override
  ListenableScheduledFuture<?> scheduleWithFixedDelay(
      Runnable command, long initialDelay, long delay, TimeUnit unit);

  /**
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningScheduledExecutorService.java`
#### Snippet
```java
  /** @since 15.0 (previously returned ScheduledFuture) */
  @Override
  ListenableScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit);

  /**
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningScheduledExecutorService.java`
#### Snippet
```java
  /** @since 15.0 (previously returned ScheduledFuture) */
  @Override
  ListenableScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit);

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ThreadFactoryBuilder.java`
#### Snippet
```java
  @CheckForNull private Boolean daemon = null;
  @CheckForNull private Integer priority = null;
  @CheckForNull private UncaughtExceptionHandler uncaughtExceptionHandler = null;
  @CheckForNull private ThreadFactory backingThreadFactory = null;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ThreadFactoryBuilder.java`
#### Snippet
```java
  @CheckForNull private String nameFormat = null;
  @CheckForNull private Boolean daemon = null;
  @CheckForNull private Integer priority = null;
  @CheckForNull private UncaughtExceptionHandler uncaughtExceptionHandler = null;
  @CheckForNull private ThreadFactory backingThreadFactory = null;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ThreadFactoryBuilder.java`
#### Snippet
```java
@ElementTypesAreNonnullByDefault
public final class ThreadFactoryBuilder {
  @CheckForNull private String nameFormat = null;
  @CheckForNull private Boolean daemon = null;
  @CheckForNull private Integer priority = null;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ThreadFactoryBuilder.java`
#### Snippet
```java
public final class ThreadFactoryBuilder {
  @CheckForNull private String nameFormat = null;
  @CheckForNull private Boolean daemon = null;
  @CheckForNull private Integer priority = null;
  @CheckForNull private UncaughtExceptionHandler uncaughtExceptionHandler = null;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ThreadFactoryBuilder.java`
#### Snippet
```java
  @CheckForNull private Integer priority = null;
  @CheckForNull private UncaughtExceptionHandler uncaughtExceptionHandler = null;
  @CheckForNull private ThreadFactory backingThreadFactory = null;

  /** Creates a new {@link ThreadFactory} builder. */
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ForwardingFuture.java`
#### Snippet
```java
  @CanIgnoreReturnValue
  @ParametricNullness
  public V get(long timeout, TimeUnit unit)
      throws InterruptedException, ExecutionException, TimeoutException {
    return delegate().get(timeout, unit);
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
  @GwtIncompatible // NavigableSet
  @LazyInit
  @CheckForNull
  transient ImmutableSortedSet<E> descendingSet;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeBasedTable.java`
#### Snippet
```java
  private class TreeRow extends Row implements SortedMap<C, V> {
    @CheckForNull final C lowerBound;
    @CheckForNull final C upperBound;

    TreeRow(R rowKey) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeBasedTable.java`
#### Snippet
```java

    return new AbstractIterator<C>() {
      @CheckForNull C lastValue;

      @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeBasedTable.java`
#### Snippet
```java

  private class TreeRow extends Row implements SortedMap<C, V> {
    @CheckForNull final C lowerBound;
    @CheckForNull final C upperBound;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeBasedTable.java`
#### Snippet
```java
    }

    @CheckForNull transient SortedMap<C, V> wholeRow;

    // If the row was previously empty, we check if there's a new row here every time we're queried.
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/TimeoutFuture.java`
#### Snippet
```java
   */

  @CheckForNull private ListenableFuture<V> delegateRef;
  @CheckForNull private ScheduledFuture<?> timer;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/TimeoutFuture.java`
#### Snippet
```java
  /** A runnable that is called when the delegate or the timer completes. */
  private static final class Fire<V extends @Nullable Object> implements Runnable {
    @CheckForNull TimeoutFuture<V> timeoutFutureRef;

    Fire(TimeoutFuture<V> timeoutFuture) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/TimeoutFuture.java`
#### Snippet
```java

  @CheckForNull private ListenableFuture<V> delegateRef;
  @CheckForNull private ScheduledFuture<?> timer;

  private TimeoutFuture(ListenableFuture<V> delegate) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ExecutionSequencer.java`
#### Snippet
```java
     * cancelled.
     */
    @CheckForNull Executor delegate;

    /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ExecutionSequencer.java`
#### Snippet
```java

    /** Thread that called execute(). Set in execute, cleared when delegate.execute() returns. */
    @CheckForNull Thread submitting;

    private TaskNonReentrantExecutor(Executor delegate, ExecutionSequencer sequencer) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ExecutionSequencer.java`
#### Snippet
```java
    @CheckForNull Runnable nextTask;
    /** Only used by the thread associated with this object */
    @CheckForNull Executor nextExecutor;
  }

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ExecutionSequencer.java`
#### Snippet
```java
     * though it's racy, we don't care which of those values we get, so no need to synchronize.
     */
    @CheckForNull Thread thread;
    /** Only used by the thread associated with this object */
    @CheckForNull Runnable nextTask;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ExecutionSequencer.java`
#### Snippet
```java
     * or queued.
     */
    @CheckForNull ExecutionSequencer sequencer;

    /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ExecutionSequencer.java`
#### Snippet
```java
     * object may live on after, if submitAsync returns an incomplete future.
     */
    @CheckForNull Runnable task;

    /** Thread that called execute(). Set in execute, cleared when delegate.execute() returns. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ExecutionSequencer.java`
#### Snippet
```java
    @CheckForNull Thread thread;
    /** Only used by the thread associated with this object */
    @CheckForNull Runnable nextTask;
    /** Only used by the thread associated with this object */
    @CheckForNull Executor nextExecutor;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/Monitor.java`
#### Snippet
```java
   */
  @GuardedBy("lock")
  @CheckForNull
  private Guard activeGuards = null;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/Monitor.java`
#### Snippet
```java
    /** The next active guard */
    @GuardedBy("monitor.lock")
    @CheckForNull
    Guard next;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/JdkBackedImmutableBiMap.java`
#### Snippet
```java
  }

  @LazyInit @RetainedWith @CheckForNull private transient JdkBackedImmutableBiMap<V, K> inverse;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CollectSpliterators.java`
#### Snippet
```java
    }

    @Weak @CheckForNull OutSpliteratorT prefix;
    final Spliterator<InElementT> from;
    final Function<? super InElementT, OutSpliteratorT> function;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CollectSpliterators.java`
#### Snippet
```java
    checkNotNull(predicate);
    class Splitr implements Spliterator<T>, Consumer<T> {
      @CheckForNull T holder = null;

      @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractSortedMultiset.java`
#### Snippet
```java
  }

  @CheckForNull private transient SortedMultiset<E> descendingMultiset;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TopKSelector.java`
#### Snippet
```java
   * bufferSize ? k, then we can ignore any elements greater than this value.
   */
  @CheckForNull private T threshold;

  private TopKSelector(Comparator<? super T> comparator, int k) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableSet.java`
#### Snippet
```java
     * that this field is non-null.
     */
    @CheckForNull private SetBuilderImpl<E> impl;
    boolean forceCopy;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableSet.java`
#### Snippet
```java
  @GwtCompatible
  abstract static class CachingAsList<E> extends ImmutableSet<E> {
    @LazyInit @RetainedWith @CheckForNull private transient ImmutableList<E> asList;

    @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/ImmutableSet.java`
#### Snippet
```java
  private static final class RegularSetBuilderImpl<E> extends SetBuilderImpl<E> {
    // null until at least two elements are present
    private @Nullable Object @Nullable [] hashTable;
    private int maxRunBeforeFallback;
    private int expandTableThreshold;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/DirectedMultiNetworkConnections.java`
#### Snippet
```java
  }

  @CheckForNull @LazyInit private transient Reference<Multiset<N>> predecessorsReference;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/DirectedMultiNetworkConnections.java`
#### Snippet
```java
  }

  @CheckForNull @LazyInit private transient Reference<Multiset<N>> successorsReference;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
    }
    class Splitr extends MapWithIndexSpliterator<Spliterator<T>, R, Splitr> implements Consumer<T> {
      @CheckForNull T holder;

      Splitr(Spliterator<T> splitr, long index) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  // Use this carefully - it doesn't implement value semantics
  private static class TemporaryPair<A extends @Nullable Object, B extends @Nullable Object> {
    @ParametricNullness final A a;
    @ParametricNullness final B b;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
    class OptionalState {
      boolean set = false;
      @CheckForNull T value = null;

      void set(T value) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  private static class TemporaryPair<A extends @Nullable Object, B extends @Nullable Object> {
    @ParametricNullness final A a;
    @ParametricNullness final B b;

    TemporaryPair(@ParametricNullness A a, @ParametricNullness B b) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/MapIteratorCache.java`
#### Snippet
```java
   * concurrently. For more information, see AbstractNetworkTest.concurrentIteration.
   */
  @CheckForNull private transient volatile Entry<K, V> cacheEntry;

  MapIteratorCache(Map<K, V> backingMap) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/CombinedFuture.java`
#### Snippet
```java
final class CombinedFuture<V extends @Nullable Object>
    extends AggregateFuture<@Nullable Object, V> {
  @CheckForNull private CombinedFutureInterruptibleTask<?> task;

  CombinedFuture(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    int nextTableIndex;
    @CheckForNull Segment<K, V> currentSegment;
    @CheckForNull AtomicReferenceArray<ReferenceEntry<K, V>> currentTable;
    @CheckForNull ReferenceEntry<K, V> nextEntry;
    @CheckForNull WriteThroughEntry nextExternal;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    private static final long serialVersionUID = 1;

    @CheckForNull transient LoadingCache<K, V> autoDelegate;

    LoadingSerializationProxy(LocalCache<K, V> cache) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
  }

  @RetainedWith @CheckForNull Collection<V> values;

  @Override
```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @CheckForNull parameter
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @Override
    public ValueReference<K, V> copyFor(
        ReferenceQueue<V> queue, V value, ReferenceEntry<K, V> entry) {
      return this;
    }
```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @CheckForNull parameter
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public void notifyNewValue(V newValue) {}

    @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    final CacheLoader<? super K, V> loader;

    @CheckForNull transient Cache<K, V> delegate;

    ManualSerializationProxy(LocalCache<K, V> cache) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

  /** The default cache loader to use on loading operations. */
  @CheckForNull final CacheLoader<? super K, V> defaultLoader;

  /**
```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @CheckForNull parameter
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @Override
    public ValueReference<K, V> copyFor(
        ReferenceQueue<V> queue, V value, ReferenceEntry<K, V> entry) {
      return new SoftValueReference<>(queue, value, entry);
    }
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @CheckForNull Segment<K, V> currentSegment;
    @CheckForNull AtomicReferenceArray<ReferenceEntry<K, V>> currentTable;
    @CheckForNull ReferenceEntry<K, V> nextEntry;
    @CheckForNull WriteThroughEntry nextExternal;
    @CheckForNull WriteThroughEntry lastReturned;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @CheckForNull ReferenceEntry<K, V> nextEntry;
    @CheckForNull WriteThroughEntry nextExternal;
    @CheckForNull WriteThroughEntry lastReturned;

    HashIterator() {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
     * and which need to be cleaned up internally.
     */
    @CheckForNull final ReferenceQueue<V> valueReferenceQueue;

    /**
```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @CheckForNull parameter
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @Override
    public ValueReference<K, V> copyFor(
        ReferenceQueue<V> queue, V value, ReferenceEntry<K, V> entry) {
      return new WeakValueReference<>(queue, value, entry);
    }
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
     * need to be cleaned up internally.
     */
    @CheckForNull final ReferenceQueue<K> keyReferenceQueue;

    /**
```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @CheckForNull parameter
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public void notifyNewValue(V newValue) {}

    @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    /** The per-segment table. */
    @CheckForNull volatile AtomicReferenceArray<ReferenceEntry<K, V>> table;

    /** The maximum weight of this segment. UNSET_INT if there is no maximum. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
  }

  @RetainedWith @CheckForNull Set<K> keySet;

  @Override
```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @CheckForNull parameter
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        @Override
        public void notifyNewValue(Object newValue) {}
      };

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    final int hash;
    @CheckForNull final ReferenceEntry<K, V> next;
    volatile ValueReference<K, V> valueReference = unset();

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @CheckForNull AtomicReferenceArray<ReferenceEntry<K, V>> currentTable;
    @CheckForNull ReferenceEntry<K, V> nextEntry;
    @CheckForNull WriteThroughEntry nextExternal;
    @CheckForNull WriteThroughEntry lastReturned;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
  }

  @RetainedWith @CheckForNull Set<Entry<K, V>> entrySet;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    final int hash;
    @CheckForNull final ReferenceEntry<K, V> next;
    volatile ValueReference<K, V> valueReference = unset();

```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @CheckForNull parameter
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public void notifyNewValue(V newValue) {}
  }

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    final int concurrencyLevel;
    final RemovalListener<? super K, ? super V> removalListener;
    @CheckForNull final Ticker ticker;
    final CacheLoader<? super K, V> loader;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    int nextSegmentIndex;
    int nextTableIndex;
    @CheckForNull Segment<K, V> currentSegment;
    @CheckForNull AtomicReferenceArray<ReferenceEntry<K, V>> currentTable;
    @CheckForNull ReferenceEntry<K, V> nextEntry;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractSequentialIterator.java`
#### Snippet
```java
@ElementTypesAreNonnullByDefault
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {
  @CheckForNull private T nextOrNull;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
  }

  @CheckForNull private transient RowMap rowMap;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
  }

  @CheckForNull private transient ColumnMap columnMap;

  @Override
```

### RuleId[ruleID=NullableProblems]
Nullable method 'remove' from 'ForwardingQueue' implements non-null method from 'BlockingDeque'
in `guava/src/com/google/common/collect/ForwardingBlockingDeque.java`
#### Snippet
```java
@ElementTypesAreNonnullByDefault
public abstract class ForwardingBlockingDeque<E> extends ForwardingDeque<E>
    implements BlockingDeque<E> {

  /** Constructor for use by subclasses. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractTransformFuture.java`
#### Snippet
```java
   * triggered by cancel(). For details, see the comments on the fields of TimeoutFuture.
   */
  @CheckForNull ListenableFuture<? extends I> inputFuture;
  @CheckForNull F function;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractTransformFuture.java`
#### Snippet
```java
   */
  @CheckForNull ListenableFuture<? extends I> inputFuture;
  @CheckForNull F function;

  AbstractTransformFuture(ListenableFuture<? extends I> inputFuture, F function) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java
    return new UnmodifiableIterator<E>() {
      int remaining;
      @CheckForNull E element;

      @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java
  }

  @LazyInit @CheckForNull private transient ImmutableList<E> asList;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java
  public abstract ImmutableSet<E> elementSet();

  @LazyInit @CheckForNull private transient ImmutableSet<Entry<E>> entrySet;

  @Override
```

### RuleId[ruleID=NullableProblems]
Method annotated with @NotNull must not override @NotNull method
in `guava/src/com/google/common/util/concurrent/ForwardingExecutorService.java`
#### Snippet
```java

  @Override
  public <T extends @Nullable Object> T invokeAny(Collection<? extends Callable<T>> tasks)
      throws InterruptedException, ExecutionException {
    return delegate().invokeAny(tasks);
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractCatchingFuture.java`
#### Snippet
```java
  @CheckForNull ListenableFuture<? extends V> inputFuture;
  @CheckForNull Class<X> exceptionType;
  @CheckForNull F fallback;

  AbstractCatchingFuture(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractCatchingFuture.java`
#### Snippet
```java
   */
  @CheckForNull ListenableFuture<? extends V> inputFuture;
  @CheckForNull Class<X> exceptionType;
  @CheckForNull F fallback;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractCatchingFuture.java`
#### Snippet
```java
   * triggered by cancel(). For details, see the comments on the fields of TimeoutFuture.
   */
  @CheckForNull ListenableFuture<? extends V> inputFuture;
  @CheckForNull Class<X> exceptionType;
  @CheckForNull F fallback;
```

### RuleId[ruleID=NullableProblems]
Nullable method 'remove' from 'ForwardingQueue' implements non-null method from 'BlockingDeque'
in `guava/src/com/google/common/util/concurrent/ForwardingBlockingDeque.java`
#### Snippet
```java
@ElementTypesAreNonnullByDefault
public abstract class ForwardingBlockingDeque<E> extends ForwardingDeque<E>
    implements BlockingDeque<E> {

  /** Constructor for use by subclasses. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/DirectedGraphConnections.java`
#### Snippet
```java
   * not have been inserted consecutively.
   */
  @CheckForNull private final List<NodeConnection<N>> orderedNodeConnections;

  private int predecessorCount;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/net/MediaType.java`
#### Snippet
```java
  @LazyInit private int hashCode;

  @LazyInit @CheckForNull private Optional<Charset> parsedCharset;

  private MediaType(String type, String subtype, ImmutableListMultimap<String, String> parameters) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/net/MediaType.java`
#### Snippet
```java
  private final ImmutableListMultimap<String, String> parameters;

  @LazyInit @CheckForNull private String toString;

  @LazyInit private int hashCode;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/FileBackedOutputStream.java`
#### Snippet
```java

  @GuardedBy("this")
  @CheckForNull
  private MemoryOutput memory;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/FileBackedOutputStream.java`
#### Snippet
```java
  private final boolean resetOnFinalize;
  private final ByteSource source;
  @CheckForNull private final File parentDirectory;

  @GuardedBy("this")
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/FileBackedOutputStream.java`
#### Snippet
```java

  @GuardedBy("this")
  @CheckForNull
  private File file;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Collections2.java`
#### Snippet
```java

  private static final class OrderedPermutationIterator<E> extends AbstractIterator<List<E>> {
    @CheckForNull List<E> nextPermutation;
    final Comparator<? super E> comparator;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/SequentialExecutor.java`
#### Snippet
```java
  /** Worker that runs tasks from {@link #queue} until it is empty. */
  private final class QueueWorker implements Runnable {
    @CheckForNull Runnable task;

    @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
  }

  @LazyInit @RetainedWith @CheckForNull private transient BiMap<V, K> inverse;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
    // which would cause memory leaks when non-empty HashBiMap with cyclic BiEntry
    // instances is deallocated.
    @CheckForNull BiEntry<K, V> nextInKToVBucket;
    @Weak @CheckForNull BiEntry<K, V> nextInVToKBucket;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
  private transient @Nullable BiEntry<K, V>[] hashTableKToV;
  private transient @Nullable BiEntry<K, V>[] hashTableVToK;
  @Weak @CheckForNull private transient BiEntry<K, V> firstInKeyInsertionOrder;
  @Weak @CheckForNull private transient BiEntry<K, V> lastInKeyInsertionOrder;
  private transient int size;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
  abstract class Itr<T extends @Nullable Object> implements Iterator<T> {
    @CheckForNull BiEntry<K, V> next = firstInKeyInsertionOrder;
    @CheckForNull BiEntry<K, V> toRemove = null;
    int expectedModCount = modCount;
    int remaining = size();
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
  private transient @Nullable BiEntry<K, V>[] hashTableVToK;
  @Weak @CheckForNull private transient BiEntry<K, V> firstInKeyInsertionOrder;
  @Weak @CheckForNull private transient BiEntry<K, V> lastInKeyInsertionOrder;
  private transient int size;
  private transient int mask;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java

  abstract class Itr<T extends @Nullable Object> implements Iterator<T> {
    @CheckForNull BiEntry<K, V> next = firstInKeyInsertionOrder;
    @CheckForNull BiEntry<K, V> toRemove = null;
    int expectedModCount = modCount;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
    // instances is deallocated.
    @CheckForNull BiEntry<K, V> nextInKToVBucket;
    @Weak @CheckForNull BiEntry<K, V> nextInVToKBucket;

    @Weak @CheckForNull BiEntry<K, V> nextInKeyInsertionOrder;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java

    @Weak @CheckForNull BiEntry<K, V> nextInKeyInsertionOrder;
    @Weak @CheckForNull BiEntry<K, V> prevInKeyInsertionOrder;

    BiEntry(@ParametricNullness K key, int keyHash, @ParametricNullness V value, int valueHash) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
    @Weak @CheckForNull BiEntry<K, V> nextInVToKBucket;

    @Weak @CheckForNull BiEntry<K, V> nextInKeyInsertionOrder;
    @Weak @CheckForNull BiEntry<K, V> prevInKeyInsertionOrder;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableSortedMultiset.java`
#### Snippet
```java
  public abstract ImmutableSortedSet<E> elementSet();

  @LazyInit @CheckForNull transient ImmutableSortedMultiset<E> descendingMultiset;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/util/concurrent/CollectionFuture.java`
#### Snippet
```java
  /** The result of a successful {@code Future}. */
  private static final class Present<V extends @Nullable Object> {
    final V value;

    Present(V value) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/CollectionFuture.java`
#### Snippet
```java
   * harmless, rather than just 99.99% harmless.
   */
  @CheckForNull private List<@Nullable Present<V>> values;

  CollectionFuture(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/ElementOrder.java`
#### Snippet
```java

  @SuppressWarnings("Immutable") // Hopefully the comparator provided is immutable!
  @CheckForNull
  private final Comparator<T> comparator;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
  @Nullable Equivalence<Object> valueEquivalence;

  @Nullable RemovalListener<? super K, ? super V> removalListener;
  @Nullable Ticker ticker;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java

  @Nullable Strength keyStrength;
  @Nullable Strength valueStrength;

  @SuppressWarnings("GoodTime") // should be a java.time.Duration
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
  long maximumSize = UNSET_INT;
  long maximumWeight = UNSET_INT;
  @Nullable Weigher<? super K, ? super V> weigher;

  @Nullable Strength keyStrength;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java

  @Nullable RemovalListener<? super K, ? super V> removalListener;
  @Nullable Ticker ticker;

  Supplier<? extends StatsCounter> statsCounterSupplier = NULL_STATS_COUNTER;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
  @Nullable Weigher<? super K, ? super V> weigher;

  @Nullable Strength keyStrength;
  @Nullable Strength valueStrength;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java

  @Nullable Equivalence<Object> keyEquivalence;
  @Nullable Equivalence<Object> valueEquivalence;

  @Nullable RemovalListener<? super K, ? super V> removalListener;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
  long refreshNanos = UNSET_INT;

  @Nullable Equivalence<Object> keyEquivalence;
  @Nullable Equivalence<Object> valueEquivalence;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AggregateFutureState.java`
#### Snippet
```java
  // Lazily initialized the first time we see an exception; not released until all the input futures
  // have completed and we have processed them all.
  @CheckForNull private volatile Set<Throwable> seenExceptions = null;

  private volatile int remaining;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/MapRetrievalCache.java`
#### Snippet
```java
final class MapRetrievalCache<K, V> extends MapIteratorCache<K, V> {
  // See the note about volatile in the superclass.
  @CheckForNull private transient volatile CacheEntry<K, V> cacheEntry1;
  @CheckForNull private transient volatile CacheEntry<K, V> cacheEntry2;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/MapRetrievalCache.java`
#### Snippet
```java
  // See the note about volatile in the superclass.
  @CheckForNull private transient volatile CacheEntry<K, V> cacheEntry1;
  @CheckForNull private transient volatile CacheEntry<K, V> cacheEntry2;

  MapRetrievalCache(Map<K, V> backingMap) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/JdkBackedImmutableMultiset.java`
#### Snippet
```java
  }

  @CheckForNull private transient ImmutableSet<E> elementSet;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CollectCollectors.java`
#### Snippet
```java
  private static class EnumMapAccumulator<K extends Enum<K>, V> {
    private final BinaryOperator<V> mergeFunction;
    @CheckForNull private EnumMap<K, V> map = null;

    EnumMapAccumulator(BinaryOperator<V> mergeFunction) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CollectCollectors.java`
#### Snippet
```java
                Collector.Characteristics.UNORDERED);

    @CheckForNull private EnumSet<E> set;

    void add(E e) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AtomicLongMap.java`
#### Snippet
```java
  }

  @CheckForNull private transient Map<K, Long> asMap;

  /** Returns a live, read-only view of the map backing this {@code AtomicLongMap}. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/FilteredKeyMultimap.java`
#### Snippet
```java
  static class AddRejectingSet<K extends @Nullable Object, V extends @Nullable Object>
      extends ForwardingSet<V> {
    @ParametricNullness final K key;

    AddRejectingSet(@ParametricNullness K key) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/FilteredKeyMultimap.java`
#### Snippet
```java
  static class AddRejectingList<K extends @Nullable Object, V extends @Nullable Object>
      extends ForwardingList<V> {
    @ParametricNullness final K key;

    AddRejectingList(@ParametricNullness K key) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/EndpointPairIterator.java`
#### Snippet
```java
  private static final class Undirected<N> extends EndpointPairIterator<N> {
    // It's a little weird that we add `null` to this set, but it makes for slightly simpler code.
    @CheckForNull private Set<@Nullable N> visitedNodes;

    private Undirected(BaseGraph<N> graph) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/EndpointPairIterator.java`
#### Snippet
```java
  private final Iterator<N> nodeIterator;

  @CheckForNull
  N node = null; // null is safe as an initial value because graphs don't allow null nodes

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    @CheckForNull transient Set<K> keySet;
    @CheckForNull transient Collection<V> values;
    @CheckForNull transient Set<Map.Entry<K, V>> entrySet;

    SynchronizedMap(Map<K, V> delegate, @CheckForNull Object mutex) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
      extends SynchronizedMap<K, V> implements BiMap<K, V>, Serializable {
    @CheckForNull private transient Set<V> valueSet;
    @RetainedWith @CheckForNull private transient BiMap<V, K> inverse;

    private SynchronizedBiMap(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
  private static class SynchronizedMap<K extends @Nullable Object, V extends @Nullable Object>
      extends SynchronizedObject implements Map<K, V> {
    @CheckForNull transient Set<K> keySet;
    @CheckForNull transient Collection<V> values;
    @CheckForNull transient Set<Map.Entry<K, V>> entrySet;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
      extends SynchronizedObject implements Multimap<K, V> {
    @CheckForNull transient Set<K> keySet;
    @CheckForNull transient Collection<V> valuesCollection;
    @CheckForNull transient Collection<Map.Entry<K, V>> entries;
    @CheckForNull transient Map<K, Collection<V>> asMap;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
  private static class SynchronizedMultimap<K extends @Nullable Object, V extends @Nullable Object>
      extends SynchronizedObject implements Multimap<K, V> {
    @CheckForNull transient Set<K> keySet;
    @CheckForNull transient Collection<V> valuesCollection;
    @CheckForNull transient Collection<Map.Entry<K, V>> entries;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    }

    @CheckForNull transient NavigableSet<K> descendingKeySet;

    @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    }

    @CheckForNull transient NavigableSet<K> navigableKeySet;

    @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
  private static class SynchronizedMultiset<E extends @Nullable Object>
      extends SynchronizedCollection<E> implements Multiset<E> {
    @CheckForNull transient Set<E> elementSet;
    @CheckForNull transient Set<Multiset.Entry<E>> entrySet;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    @CheckForNull transient Collection<V> valuesCollection;
    @CheckForNull transient Collection<Map.Entry<K, V>> entries;
    @CheckForNull transient Map<K, Collection<V>> asMap;
    @CheckForNull transient Multiset<K> keys;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    }

    @CheckForNull transient NavigableSet<E> descendingSet;

    @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    }

    @CheckForNull transient NavigableMap<K, V> descendingMap;

    @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
  private static class SynchronizedAsMap<K extends @Nullable Object, V extends @Nullable Object>
      extends SynchronizedMap<K, Collection<V>> {
    @CheckForNull transient Set<Map.Entry<K, Collection<V>>> asMapEntrySet;
    @CheckForNull transient Collection<Collection<V>> asMapValues;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
  static class SynchronizedBiMap<K extends @Nullable Object, V extends @Nullable Object>
      extends SynchronizedMap<K, V> implements BiMap<K, V>, Serializable {
    @CheckForNull private transient Set<V> valueSet;
    @RetainedWith @CheckForNull private transient BiMap<V, K> inverse;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
          K extends @Nullable Object, V extends @Nullable Object>
      extends SynchronizedMultimap<K, V> implements SetMultimap<K, V> {
    @CheckForNull transient Set<Map.Entry<K, V>> entrySet;

    SynchronizedSetMultimap(SetMultimap<K, V> delegate, @CheckForNull Object mutex) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
      extends SynchronizedCollection<E> implements Multiset<E> {
    @CheckForNull transient Set<E> elementSet;
    @CheckForNull transient Set<Multiset.Entry<E>> entrySet;

    SynchronizedMultiset(Multiset<E> delegate, @CheckForNull Object mutex) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
      extends SynchronizedObject implements Map<K, V> {
    @CheckForNull transient Set<K> keySet;
    @CheckForNull transient Collection<V> values;
    @CheckForNull transient Set<Map.Entry<K, V>> entrySet;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
      extends SynchronizedMap<K, Collection<V>> {
    @CheckForNull transient Set<Map.Entry<K, Collection<V>>> asMapEntrySet;
    @CheckForNull transient Collection<Collection<V>> asMapValues;

    SynchronizedAsMap(Map<K, Collection<V>> delegate, @CheckForNull Object mutex) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    @CheckForNull transient Collection<Map.Entry<K, V>> entries;
    @CheckForNull transient Map<K, Collection<V>> asMap;
    @CheckForNull transient Multiset<K> keys;

    @SuppressWarnings("unchecked")
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    @CheckForNull transient Set<K> keySet;
    @CheckForNull transient Collection<V> valuesCollection;
    @CheckForNull transient Collection<Map.Entry<K, V>> entries;
    @CheckForNull transient Map<K, Collection<V>> asMap;
    @CheckForNull transient Multiset<K> keys;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/Closer.java`
#### Snippet
```java
  // only need space for 2 elements in most cases, so try to use the smallest array possible
  private final Deque<Closeable> stack = new ArrayDeque<>(4);
  @CheckForNull private Throwable thrown;

  @VisibleForTesting
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMapBasedMultiset.java`
#### Snippet
```java
    final Iterator<Map.Entry<E, Count>> backingEntries = backingMap.entrySet().iterator();
    return new Iterator<E>() {
      @CheckForNull Map.Entry<E, Count> toRemove;

      @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMapBasedMultiset.java`
#### Snippet
```java
  private class MapBasedMultisetIterator implements Iterator<E> {
    final Iterator<Map.Entry<E, Count>> entryIterator;
    @CheckForNull Map.Entry<E, Count> currentEntry;
    int occurrencesLeft;
    boolean canRemove;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMapBasedMultiset.java`
#### Snippet
```java
    final Iterator<Map.Entry<E, Count>> backingEntries = backingMap.entrySet().iterator();
    return new Iterator<Multiset.Entry<E>>() {
      @CheckForNull Map.Entry<E, Count> toRemove;

      @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
  }

  @CheckForNull private transient ColumnMap columnMap;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
  }

  @CheckForNull private transient Map<R, Map<C, V>> rowMap;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
  }

  @CheckForNull private transient Set<C> columnKeySet;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
    }

    @CheckForNull Map<C, V> backingRowMap;

    final void updateBackingRowMapField() {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
  private class CellIterator implements Iterator<Cell<R, C, V>> {
    final Iterator<Entry<R, Map<C, V>>> rowIterator = backingMap.entrySet().iterator();
    @CheckForNull Entry<R, Map<C, V>> rowEntry;
    Iterator<Entry<C, V>> columnIterator = Iterators.emptyModifiableIterator();

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
    private final DeferredCloser closer = new DeferredCloser(this);
    private volatile boolean closed;
    @CheckForNull private volatile CountDownLatch whenClosed;

    <V extends @Nullable Object, U extends @Nullable Object>
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactLinkedHashMap.java`
#### Snippet
```java
   * and a node with "next" pointer equal to {@code ENDPOINT} is the last node.
   */
  @CheckForNull @VisibleForTesting transient long[] links;

  /** Pointer to the first node in the linked list, or {@code ENDPOINT} if there are no entries. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
    final Supplier<T> delegate;
    final long durationNanos;
    @CheckForNull transient volatile T value;
    // The special value 0 means "not yet initialized".
    transient volatile long expirationNanos;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
  @VisibleForTesting
  static class NonSerializableMemoizingSupplier<T extends @Nullable Object> implements Supplier<T> {
    @CheckForNull volatile Supplier<T> delegate;
    volatile boolean initialized;
    // "value" does not need to be volatile; visibility piggy-backs
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
    // "value" does not need to be volatile; visibility piggy-backs
    // on volatile read of "initialized".
    @CheckForNull transient T value;

    MemoizingSupplier(Supplier<T> delegate) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
    // "value" does not need to be volatile; visibility piggy-backs
    // on volatile read of "initialized".
    @CheckForNull T value;

    NonSerializableMemoizingSupplier(Supplier<T> delegate) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
  private static class SupplierOfInstance<T extends @Nullable Object>
      implements Supplier<T>, Serializable {
    @ParametricNullness final T instance;

    SupplierOfInstance(@ParametricNullness T instance) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MinMaxPriorityQueue.java`
#### Snippet
```java
    // either of them, up to the same multiplicity as the queue.
    @CheckForNull private Queue<E> forgetMeNot;
    @CheckForNull private List<E> skipMe;
    @CheckForNull private E lastFromForgetMeNot;
    private boolean canRemove;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MinMaxPriorityQueue.java`
#### Snippet
```java
    @CheckForNull private Queue<E> forgetMeNot;
    @CheckForNull private List<E> skipMe;
    @CheckForNull private E lastFromForgetMeNot;
    private boolean canRemove;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MinMaxPriorityQueue.java`
#### Snippet
```java
    // The same element is not allowed in both forgetMeNot and skipMe, but duplicates are allowed in
    // either of them, up to the same multiplicity as the queue.
    @CheckForNull private Queue<E> forgetMeNot;
    @CheckForNull private List<E> skipMe;
    @CheckForNull private E lastFromForgetMeNot;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/reflect/Types.java`
#### Snippet
```java
  private static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {

    @CheckForNull private final Type ownerType;
    private final ImmutableList<Type> argumentsList;
    private final Class<?> rawType;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java

  // cached so that this.multimapView().inverse() only computes inverse once
  @LazyInit @CheckForNull private transient ImmutableSetMultimap<K, V> multimapView;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
  @DoNotMock
  public static class Builder<K, V> {
    @CheckForNull Comparator<? super V> valueComparator;
    @Nullable Entry<K, V>[] entries;
    int size;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
  abstract ImmutableSet<Entry<K, V>> createEntrySet();

  @LazyInit @RetainedWith @CheckForNull private transient ImmutableSet<K> keySet;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
  }

  @LazyInit @RetainedWith @CheckForNull private transient ImmutableCollection<V> values;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
  }

  @LazyInit @RetainedWith @CheckForNull private transient ImmutableSet<Entry<K, V>> entrySet;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractService.java`
#### Snippet
```java
     * has failed.
     */
    @CheckForNull final Throwable failure;

    StateSnapshot(State internalState) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java

    private final transient TypeSet allTypes;
    @CheckForNull private transient ImmutableSet<TypeToken<? super T>> interfaces;

    InterfaceSet(TypeSet allTypes) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java

  /** Resolver for resolving parameter and field types with {@link #runtimeType} as context. */
  @CheckForNull private transient TypeResolver invariantTypeResolver;

  /** Resolver for resolving covariant types with {@link #runtimeType} as context. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java
  public class TypeSet extends ForwardingSet<TypeToken<? super T>> implements Serializable {

    @CheckForNull private transient ImmutableSet<TypeToken<? super T>> types;

    TypeSet() {}
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java
  private final class ClassSet extends TypeSet {

    @CheckForNull private transient ImmutableSet<TypeToken<? super T>> classes;

    @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java

  /** Resolver for resolving covariant types with {@link #runtimeType} as context. */
  @CheckForNull private transient TypeResolver covariantTypeResolver;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/math/LinearTransformation.java`
#### Snippet
```java
    final double yIntercept;

    @CheckForNull @LazyInit LinearTransformation inverse;

    RegularLinearTransformation(double slope, double yIntercept) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/math/LinearTransformation.java`
#### Snippet
```java
    final double x;

    @CheckForNull @LazyInit LinearTransformation inverse;

    VerticalLinearTransformation(double x) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java

  /** Table of cells. When non-null, size is a power of 2. */
  @CheckForNull transient volatile Cell[] cells;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableTable.java`
#### Snippet
```java
  public static final class Builder<R, C, V> {
    private final List<Cell<R, C, V>> cells = Lists.newArrayList();
    @CheckForNull private Comparator<? super R> rowComparator;
    @CheckForNull private Comparator<? super C> columnComparator;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableTable.java`
#### Snippet
```java
    private final List<Cell<R, C, V>> cells = Lists.newArrayList();
    @CheckForNull private Comparator<? super R> rowComparator;
    @CheckForNull private Comparator<? super C> columnComparator;

    /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
  private final transient RegularImmutableSortedSet<K> keySet;
  private final transient ImmutableList<V> valueList;
  @CheckForNull private transient ImmutableSortedMap<K, V> descendingMap;

  ImmutableSortedMap(RegularImmutableSortedSet<K> keySet, ImmutableList<V> valueList) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
    }

    @CheckForNull private transient UnmodifiableNavigableSet<E> descendingSet;

    @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java

    // Only becomes nonnull if we encounter nested concatenations.
    @CheckForNull private Deque<Iterator<? extends Iterator<? extends T>>> metaIterators;

    ConcatenatedIterator(Iterator<? extends Iterator<? extends T>> metaIterator) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/Throwables.java`
#### Snippet
```java
   */
  @GwtIncompatible // java.lang.reflect
  @CheckForNull
  private static final Method getStackTraceDepthMethod = (jla == null) ? null : getSizeMethod(jla);

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
  private static class ConcatenatedIterator<T extends @Nullable Object> implements Iterator<T> {
    /* The last iterator to return an element.  Calls to remove() go to this iterator. */
    @CheckForNull private Iterator<? extends T> toRemove;

    /* The iterator currently returning elements. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/Throwables.java`
#### Snippet
```java
   */
  @GwtIncompatible // java.lang.reflect
  @CheckForNull
  private static final Method getStackTraceElementMethod = (jla == null) ? null : getGetMethod();

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/Throwables.java`
#### Snippet
```java
  /** Access to some fancy internal JVM internals. */
  @GwtIncompatible // java.lang.reflect
  @CheckForNull
  private static final Object jla = getJLA();

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
     */

    @CheckForNull private Iterator<? extends Iterator<? extends T>> topMetaIterator;

    // Only becomes nonnull if we encounter nested concatenations.
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
    private final Iterator<? extends E> iterator;
    private boolean hasPeeked;
    @CheckForNull private E peekedElement;

    public PeekingImpl(Iterator<? extends E> iterator) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    @LazyInit @CheckForNull transient Collection<Entry<K, V>> entries;
    @LazyInit @CheckForNull transient Multiset<K> keys;
    @LazyInit @CheckForNull transient Set<K> keySet;
    @LazyInit @CheckForNull transient Collection<V> values;
    @LazyInit @CheckForNull transient Map<K, Collection<V>> map;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    @LazyInit @CheckForNull transient Set<K> keySet;
    @LazyInit @CheckForNull transient Collection<V> values;
    @LazyInit @CheckForNull transient Map<K, Collection<V>> map;

    UnmodifiableMultimap(final Multimap<K, V> delegate) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    final Multimap<K, V> delegate;
    @LazyInit @CheckForNull transient Collection<Entry<K, V>> entries;
    @LazyInit @CheckForNull transient Multiset<K> keys;
    @LazyInit @CheckForNull transient Set<K> keySet;
    @LazyInit @CheckForNull transient Collection<V> values;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
      extends AbstractSortedSetMultimap<K, V> {
    transient Supplier<? extends SortedSet<V>> factory;
    @CheckForNull transient Comparator<? super V> valueComparator;

    CustomSortedSetMultimap(Map<K, Collection<V>> map, Supplier<? extends SortedSet<V>> factory) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    @LazyInit @CheckForNull transient Multiset<K> keys;
    @LazyInit @CheckForNull transient Set<K> keySet;
    @LazyInit @CheckForNull transient Collection<V> values;
    @LazyInit @CheckForNull transient Map<K, Collection<V>> map;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
      extends ForwardingMultimap<K, V> implements Serializable {
    final Multimap<K, V> delegate;
    @LazyInit @CheckForNull transient Collection<Entry<K, V>> entries;
    @LazyInit @CheckForNull transient Multiset<K> keys;
    @LazyInit @CheckForNull transient Set<K> keySet;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    }

    @CheckForNull private transient Set<K> keySet;

    @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    }

    @CheckForNull private transient Comparator<? super K> comparator;

    @SuppressWarnings("unchecked")
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    final Map<K, V> unmodifiableMap;
    final BiMap<? extends K, ? extends V> delegate;
    @RetainedWith @CheckForNull BiMap<V, K> inverse;
    @CheckForNull transient Set<V> values;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    }

    @CheckForNull private transient Collection<V> values;

    @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
  static class ValueDifferenceImpl<V extends @Nullable Object>
      implements MapDifference.ValueDifference<V> {
    @ParametricNullness private final V left;
    @ParametricNullness private final V right;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    }

    @CheckForNull private transient Set<Entry<K, V>> entrySet;

    @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    final BiMap<? extends K, ? extends V> delegate;
    @RetainedWith @CheckForNull BiMap<V, K> inverse;
    @CheckForNull transient Set<V> values;

    UnmodifiableBiMap(BiMap<? extends K, ? extends V> delegate, @CheckForNull BiMap<V, K> inverse) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
      implements MapDifference.ValueDifference<V> {
    @ParametricNullness private final V left;
    @ParametricNullness private final V right;

    static <V extends @Nullable Object> ValueDifference<V> create(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    }

    @CheckForNull private transient NavigableSet<K> navigableKeySet;

    @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    abstract Set<Entry<K, V>> createEntrySet();

    @CheckForNull private transient Set<Entry<K, V>> entrySet;

    @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    }

    @CheckForNull private transient UnmodifiableNavigableMap<K, V> descendingMap;

    @Override
```

## RuleId[ruleID=NegativeIntConstantInLongContext]
### RuleId[ruleID=NegativeIntConstantInLongContext]
Negative int hexadecimal constant in long context
in `guava/src/com/google/common/collect/Hashing.java`
#### Snippet
```java
   */
  static int smear(int hashCode) {
    return (int) (C2 * Integer.rotateLeft((int) (hashCode * C1), 15));
  }

```

### RuleId[ruleID=NegativeIntConstantInLongContext]
Negative int hexadecimal constant in long context
in `guava/src/com/google/common/collect/Hashing.java`
#### Snippet
```java
   * enough precision.
   */
  private static final long C1 = 0xcc9e2d51;
  private static final long C2 = 0x1b873593;

```

## RuleId[ruleID=AnonymousHasLambdaAlternative]
### RuleId[ruleID=AnonymousHasLambdaAlternative]
Anonymous new ThreadLocal() can be replaced with ThreadLocal.withInitial()
in `guava/src/com/google/common/escape/Platform.java`
#### Snippet
```java
   */
  private static final ThreadLocal<char[]> DEST_TL =
      new ThreadLocal<char[]>() {
        @Override
        protected char[] initialValue() {
```

### RuleId[ruleID=AnonymousHasLambdaAlternative]
Anonymous new ThreadLocal\>() can be replaced with ThreadLocal.withInitial()
in `guava/src/com/google/common/eventbus/Dispatcher.java`
#### Snippet
```java
    /** Per-thread queue of events to dispatch. */
    private final ThreadLocal<Queue<Event>> queue =
        new ThreadLocal<Queue<Event>>() {
          @Override
          protected Queue<Event> initialValue() {
```

### RuleId[ruleID=AnonymousHasLambdaAlternative]
Anonymous new ThreadLocal() can be replaced with ThreadLocal.withInitial()
in `guava/src/com/google/common/eventbus/Dispatcher.java`
#### Snippet
```java
    /** Per-thread dispatch state, used to avoid reentrant event dispatching. */
    private final ThreadLocal<Boolean> dispatching =
        new ThreadLocal<Boolean>() {
          @Override
          protected Boolean initialValue() {
```

### RuleId[ruleID=AnonymousHasLambdaAlternative]
Anonymous new ThreadLocal\>() can be replaced with ThreadLocal.withInitial()
in `guava/src/com/google/common/util/concurrent/CycleDetectingLockFactory.java`
#### Snippet
```java
  // of allocation done on lock()/unlock().
  private static final ThreadLocal<ArrayList<LockGraphNode>> acquiredLocks =
      new ThreadLocal<ArrayList<LockGraphNode>>() {
        @Override
        protected ArrayList<LockGraphNode> initialValue() {
```

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
Result of `Character.toChars()` is ignored
in `guava/src/com/google/common/escape/Escapers.java`
#### Snippet
```java
        // synchronization issues and makes the escaper thread safe.
        char[] surrogateChars = new char[2];
        Character.toChars(cp, surrogateChars, 0);
        char[] hiChars = escaper.escape(surrogateChars[0]);
        char[] loChars = escaper.escape(surrogateChars[1]);
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `Comparator.compare()` is ignored
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
     */
    if (hasLowerBound) {
      comparator.compare(
          uncheckedCastNullableTToT(lowerEndpoint), uncheckedCastNullableTToT(lowerEndpoint));
    }
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `Comparator.compare()` is ignored
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
    }
    if (hasUpperBound) {
      comparator.compare(
          uncheckedCastNullableTToT(upperEndpoint), uncheckedCastNullableTToT(upperEndpoint));
    }
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `Comparator.compare()` is ignored
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
    AvlNode<E> root = rootReference.get();
    if (root == null) {
      comparator().compare(element, element);
      AvlNode<E> newRoot = new AvlNode<E>(element, occurrences);
      successor(header, newRoot, header);
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `Comparator.compare()` is ignored
in `guava/src/com/google/common/collect/TreeMultimap.java`
#### Snippet
```java
  Collection<V> createCollection(@ParametricNullness K key) {
    if (key == null) {
      keyComparator().compare(key, key);
    }
    return super.createCollection(key);
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.delete()` is ignored
in `guava/src/com/google/common/io/FileBackedOutputStream.java`
#### Snippet
```java
        out = transfer;
      } catch (IOException e) {
        temp.delete();
        throw e;
      }
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `SuccessorsFunction.successors()` is ignored
in `guava/src/com/google/common/graph/Traverser.java`
#### Snippet
```java
    ImmutableSet<N> copy = ImmutableSet.copyOf(startNodes);
    for (N node : copy) {
      successorFunction.successors(node); // Will throw if node doesn't exist
    }
    return copy;
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `guava/src/com/google/common/io/Files.java`
#### Snippet
```java
      return;
    }
    parent.mkdirs();
    if (!parent.isDirectory()) {
      throw new IOException("Unable to create parent directories of " + file);
```

## RuleId[ruleID=UnnecessaryUnboxing]
### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `guava/src/com/google/common/primitives/Ints.java`
#### Snippet
```java
  public static Integer tryParse(String string, int radix) {
    Long result = Longs.tryParse(string, radix);
    if (result == null || result.longValue() != result.intValue()) {
      return null;
    } else {
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
        return chars;
      }
      char padChar = paddingChar.charValue();
      int l;
      for (l = chars.length() - 1; l >= 0; l--) {
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
      if (paddingChar != null) {
        checkArgument(
            separator.indexOf(paddingChar.charValue()) < 0,
            "Separator (%s) cannot contain padding character",
            separator);
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
            if (paddingChar != null) {
              while (writtenChars % alphabet.charsPerChunk != 0) {
                out.write(paddingChar.charValue());
                writtenChars++;
              }
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
    public BaseEncoding withPadChar(char padChar) {
      if (8 % alphabet.bitsPerChar == 0
          || (paddingChar != null && paddingChar.charValue() == padChar)) {
        return this;
      } else {
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
            readChars++;
            char ch = (char) readChar;
            if (paddingChar != null && paddingChar.charValue() == ch) {
              if (!hitPadding
                  && (readChars == 1 || !alphabet.isValidPaddingStartPosition(readChars - 1))) {
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
      if (paddingChar != null) {
        while (bitsProcessed < alphabet.bytesPerChunk * 8) {
          target.append(paddingChar.charValue());
          bitsProcessed += alphabet.bitsPerChar;
        }
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
        result = size = Ints.saturatedCast(total);
      }
      return result.intValue();
    }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `guava/src/com/google/common/util/concurrent/AtomicLongMap.java`
#### Snippet
```java
        key,
        (k, value) -> {
          long oldValue = (value == null) ? 0L : value.longValue();
          holder.set(oldValue);
          return updaterFunction.applyAsLong(oldValue);
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `guava/src/com/google/common/util/concurrent/AtomicLongMap.java`
#### Snippet
```java
  public long remove(K key) {
    Long result = map.remove(key);
    return (result == null) ? 0L : result.longValue();
  }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `guava/src/com/google/common/util/concurrent/AtomicLongMap.java`
#### Snippet
```java
              }
            });
    return noValue.get() ? 0L : result.longValue();
  }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `guava/src/com/google/common/util/concurrent/AtomicLongMap.java`
#### Snippet
```java
    checkNotNull(updaterFunction);
    return map.compute(
        key, (k, value) -> updaterFunction.applyAsLong((value == null) ? 0L : value.longValue()));
  }

```

## RuleId[ruleID=DefaultAnnotationParam]
### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
   * @since 4.0
   */
  @GwtCompatible(serializable = false)
  public static <E> Set<Set<E>> powerSet(Set<E> set) {
    return new PowerSet<E>(set);
```

## RuleId[ruleID=WhileLoopSpinsOnField]
### RuleId[ruleID=WhileLoopSpinsOnField]
`while` loop spins on field
in `guava/src/com/google/common/io/MultiInputStream.java`
#### Snippet
```java
  @Override
  public int read() throws IOException {
    while (in != null) {
      int result = in.read();
      if (result != -1) {
```

### RuleId[ruleID=WhileLoopSpinsOnField]
`while` loop spins on field
in `guava/src/com/google/common/io/MultiInputStream.java`
#### Snippet
```java
  public int read(byte[] b, int off, int len) throws IOException {
    checkNotNull(b);
    while (in != null) {
      int result = in.read(b, off, len);
      if (result != -1) {
```

### RuleId[ruleID=WhileLoopSpinsOnField]
`while` loop spins on field
in `guava/src/com/google/common/io/MultiReader.java`
#### Snippet
```java
    Preconditions.checkArgument(n >= 0, "n is negative");
    if (n > 0) {
      while (current != null) {
        long result = current.skip(n);
        if (result > 0) {
```

## RuleId[ruleID=RedundantMethodOverride]
### RuleId[ruleID=RedundantMethodOverride]
Method `asMap()` only delegates to its super method
in `guava/src/com/google/common/collect/EmptyImmutableListMultimap.java`
#### Snippet
```java
   */
  @Override
  public ImmutableMap<Object, Collection<Object>> asMap() {
    return super.asMap();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `equals()` only delegates to its super method
in `guava/src/com/google/common/collect/AbstractSetMultimap.java`
#### Snippet
```java
   */
  @Override
  public boolean equals(@CheckForNull Object object) {
    return super.equals(object);
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `asMap()` only delegates to its super method
in `guava/src/com/google/common/collect/AbstractSetMultimap.java`
#### Snippet
```java
   */
  @Override
  public Map<K, Collection<V>> asMap() {
    return super.asMap();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `toString()` only delegates to its super method
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
   */
  @Override
  public String toString() {
    return super.toString();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `entries()` only delegates to its super method
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
   */
  @Override
  public Collection<Entry<K, V>> entries() {
    return super.entries();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `values()` only delegates to its super method
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
   */
  @Override
  public Collection<V> values() {
    return super.values();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `asMap()` only delegates to its super method
in `guava/src/com/google/common/collect/EmptyImmutableSetMultimap.java`
#### Snippet
```java
   */
  @Override
  public ImmutableMap<Object, Collection<Object>> asMap() {
    return super.asMap();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `values()` only delegates to its super method
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
   */
  @Override
  public Collection<V> values() {
    return super.values();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `entries()` only delegates to its super method
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
   */
  @Override
  public Set<Entry<K, V>> entries() {
    return super.entries();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `replaceValues()` only delegates to its super method
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
  @CanIgnoreReturnValue
  @Override
  public Set<V> replaceValues(@ParametricNullness K key, Iterable<? extends V> values) {
    return super.replaceValues(key, values);
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `keySet()` only delegates to its super method
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
   */
  @Override
  public Set<K> keySet() {
    return super.keySet();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `hashCode()` is identical to its super method
in `guava/src/com/google/common/collect/RegularContiguousSet.java`
#### Snippet
```java
  // copied to make sure not to use the GWT-emulated version
  @Override
  public int hashCode() {
    return Sets.hashCodeImpl(this);
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `rowKeySet()` only delegates to its super method
in `guava/src/com/google/common/collect/TreeBasedTable.java`
#### Snippet
```java

  @Override
  public SortedSet<R> rowKeySet() {
    return super.rowKeySet();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `rowMap()` only delegates to its super method
in `guava/src/com/google/common/collect/TreeBasedTable.java`
#### Snippet
```java

  @Override
  public SortedMap<R, Map<C, V>> rowMap() {
    return super.rowMap();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `asMap()` only delegates to its super method
in `guava/src/com/google/common/collect/AbstractSortedSetMultimap.java`
#### Snippet
```java
   */
  @Override
  public Map<K, Collection<V>> asMap() {
    return super.asMap();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `values()` only delegates to its super method
in `guava/src/com/google/common/collect/AbstractSortedSetMultimap.java`
#### Snippet
```java
   */
  @Override
  public Collection<V> values() {
    return super.values();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `incidentEdgeOrder()` is identical to its super method
in `guava/src/com/google/common/graph/AbstractNetwork.java`
#### Snippet
```java

      @Override
      public ElementOrder<N> incidentEdgeOrder() {
        // TODO(b/142723300): Return AbstractNetwork.this.incidentEdgeOrder() once Network has that
        //   method.
```

### RuleId[ruleID=RedundantMethodOverride]
Method `hashCode()` only delegates to its super method
in `guava/src/com/google/common/reflect/AbstractInvocationHandler.java`
#### Snippet
```java
   */
  @Override
  public int hashCode() {
    return super.hashCode();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `toString()` only delegates to its super method
in `guava/src/com/google/common/reflect/AbstractInvocationHandler.java`
#### Snippet
```java
   */
  @Override
  public String toString() {
    return super.toString();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `cellSet()` only delegates to its super method
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
   */
  @Override
  public Set<Cell<R, C, @Nullable V>> cellSet() {
    return super.cellSet();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `values()` only delegates to its super method
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
   */
  @Override
  public Collection<@Nullable V> values() {
    return super.values();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `putAll()` only delegates to its super method
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
   */
  @Override
  public void putAll(Table<? extends R, ? extends C, ? extends @Nullable V> table) {
    super.putAll(table);
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `equals()` only delegates to its super method
in `guava/src/com/google/common/collect/AbstractListMultimap.java`
#### Snippet
```java
   */
  @Override
  public boolean equals(@CheckForNull Object object) {
    return super.equals(object);
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `asMap()` only delegates to its super method
in `guava/src/com/google/common/collect/AbstractListMultimap.java`
#### Snippet
```java
   */
  @Override
  public Map<K, Collection<V>> asMap() {
    return super.asMap();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `writeReplace()` is identical to its super method
in `guava/src/com/google/common/collect/ImmutableList.java`
#### Snippet
```java

  @Override
  Object writeReplace() {
    return new SerializedForm(toArray());
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `entrySet()` only delegates to its super method
in `guava/src/com/google/common/collect/AbstractMapBasedMultiset.java`
#### Snippet
```java
   */
  @Override
  public Set<Multiset.Entry<E>> entrySet() {
    return super.entrySet();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `cellSet()` only delegates to its super method
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
   */
  @Override
  public Set<Cell<R, C, V>> cellSet() {
    return super.cellSet();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `values()` only delegates to its super method
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
   */
  @Override
  public Collection<V> values() {
    return super.values();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `entrySet()` only delegates to its super method
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
  /** Returns an immutable set of the mappings in this map, sorted by the key ordering. */
  @Override
  public ImmutableSet<Entry<K, V>> entrySet() {
    return super.entrySet();
  }
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `ElementSet` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/SortedMultisets.java`
#### Snippet
```java
  /** A skeleton implementation for {@link SortedMultiset#elementSet}. */
  @SuppressWarnings("JdkObsolete") // TODO(b/6160855): Switch GWT emulations to NavigableSet.
  static class ElementSet<E extends @Nullable Object> extends Multisets.ElementSet<E>
      implements SortedSet<E> {
    @Weak private final SortedMultiset<E> multiset;
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `EntrySet` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/AbstractMultiset.java`
#### Snippet
```java

  @WeakOuter
  class EntrySet extends Multisets.EntrySet<E> {
    @Override
    Multiset<E> multiset() {
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `ElementSet` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/AbstractMultiset.java`
#### Snippet
```java

  @WeakOuter
  class ElementSet extends Multisets.ElementSet<E> {
    @Override
    Multiset<E> multiset() {
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `DescendingMap` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/AbstractNavigableMap.java`
#### Snippet
```java
  }

  private final class DescendingMap extends Maps.DescendingMap<K, V> {
    @Override
    NavigableMap<K, V> forward() {
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Keys` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/FilteredEntryMultimap.java`
#### Snippet
```java

  @WeakOuter
  class Keys extends Multimaps.Keys<K, V> {
    Keys() {
      super(FilteredEntryMultimap.this);
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Supplier` is the same as one of its superclass' names
in `guava/src/com/google/common/base/Supplier.java`
#### Snippet
```java
@FunctionalInterface
@ElementTypesAreNonnullByDefault
public interface Supplier<T extends @Nullable Object> extends java.util.function.Supplier<T> {
  /**
   * Retrieves an instance of the appropriate type. The returned object may or may not be a new
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `EntrySet` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/ConcurrentHashMultiset.java`
#### Snippet
```java

  @WeakOuter
  private class EntrySet extends AbstractMultiset<E>.EntrySet {
    @Override
    ConcurrentHashMultiset<E> multiset() {
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Builder` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/ImmutableListMultimap.java`
#### Snippet
```java
   * @since 2.0
   */
  public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
    /**
     * Creates a new builder. The returned builder is equivalent to the builder generated by {@link
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Entries` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java

  @WeakOuter
  class Entries extends Multimaps.Entries<K, V> {
    @Override
    Multimap<K, V> multimap() {
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Function` is the same as one of its superclass' names
in `guava/src/com/google/common/base/Function.java`
#### Snippet
```java
@FunctionalInterface
@ElementTypesAreNonnullByDefault
public interface Function<F extends @Nullable Object, T extends @Nullable Object>
    extends java.util.function.Function<F, T> {
  @Override
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `KeySet` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java

  @WeakOuter
  private class KeySet extends Maps.KeySet<K, Collection<V>> {
    KeySet(final Map<K, Collection<V>> subMap) {
      super(subMap);
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Predicate` is the same as one of its superclass' names
in `guava/src/com/google/common/base/Predicate.java`
#### Snippet
```java
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface Predicate<T extends @Nullable Object> extends java.util.function.Predicate<T> {
  /**
   * Returns the result of applying this predicate to {@code input} (Java 8 users, see notes in the
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Builder` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
   * @since 2.0
   */
  public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
    /**
     * Creates a new builder. The returned builder is equivalent to the builder generated by {@link
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Builder` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
   * @since 2.0
   */
  public static final class Builder<E> extends ImmutableSet.Builder<E> {
    private final Comparator<? super E> comparator;
    private E[] elements;
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Builder` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/ImmutableSet.java`
#### Snippet
```java
   * @since 2.0
   */
  public static class Builder<E> extends ImmutableCollection.Builder<E> {
    /*
     * `impl` is null only for instances of the subclass, ImmutableSortedSet.Builder. That subclass
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Builder` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   * @since 2.0
   */
  public static final class Builder<K, V> extends ImmutableMap.Builder<K, V> {

    /**
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `SerializedForm` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   * bimap and its inverse in sync during serialization, the way AbstractBiMap does.
   */
  private static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
    SerializedForm(ImmutableBiMap<K, V> bimap) {
      super(bimap);
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Builder` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java
   * @since 2.0
   */
  public static class Builder<E> extends ImmutableCollection.Builder<E> {
    final Multiset<E> contents;

```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Builder` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/ImmutableList.java`
#### Snippet
```java
   * @since 2.0
   */
  public static final class Builder<E> extends ImmutableCollection.Builder<E> {
    // The first `size` elements are non-null.
    @VisibleForTesting @Nullable Object[] contents;
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `KeySet` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
  }

  private final class KeySet extends Maps.KeySet<K, V> {
    KeySet() {
      super(HashBiMap.this);
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Builder` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/ImmutableSortedMultiset.java`
#### Snippet
```java
   * @since 12.0
   */
  public static class Builder<E> extends ImmutableMultiset.Builder<E> {
    /**
     * Creates a new builder. The returned builder is equivalent to the builder generated by {@link
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Values` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java

    @WeakOuter
    private class Values extends Maps.Values<R, V> {
      Values() {
        super(Column.this);
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `KeySet` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java

    @WeakOuter
    private class KeySet extends Maps.KeySet<R, V> {
      KeySet() {
        super(Column.this);
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Builder` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
   * @since 2.0
   */
  public static class Builder<K, V> extends ImmutableMap.Builder<K, V> {
    private final Comparator<? super K> comparator;

```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `SerializedForm` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
   * remain as implementation details.
   */
  private static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
    private final Comparator<? super K> comparator;

```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `EntrySet` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java

    @WeakOuter
    class EntrySet extends Maps.EntrySet<K, Collection<V>> {
      @Override
      Map<K, Collection<V>> map() {
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `KeySet` is the same as one of its superclass' names
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java

    @WeakOuter
    class KeySet extends Maps.KeySet<K, V> {
      KeySet() {
        super(FilteredEntryMap.this);
```

## RuleId[ruleID=ThrowFromFinallyBlock]
### RuleId[ruleID=ThrowFromFinallyBlock]
`throw` inside 'finally' block
in `guava/src/com/google/common/io/FileBackedOutputStream.java`
#### Snippet
```java
        file = null;
        if (!deleteMe.delete()) {
          throw new IOException("Could not delete: " + deleteMe);
        }
      }
```

## RuleId[ruleID=OptionalAssignedToNull]
### RuleId[ruleID=OptionalAssignedToNull]
Optional value is compared with null
in `guava/src/com/google/common/net/MediaType.java`
#### Snippet
```java
    // racy single-check idiom, this is safe because Optional is immutable.
    Optional<Charset> local = parsedCharset;
    if (local == null) {
      String value = null;
      local = Optional.absent();
```

### RuleId[ruleID=OptionalAssignedToNull]
Optional value is compared with null
in `guava/src/com/google/common/base/Optional.java`
#### Snippet
```java
  @CheckForNull
  public static <T> java.util.Optional<T> toJavaUtil(@CheckForNull Optional<T> googleOptional) {
    return googleOptional == null ? null : googleOptional.toJavaUtil();
  }

```

### RuleId[ruleID=OptionalAssignedToNull]
Null is used for 'Optional' type in return statement
in `guava/src/com/google/common/base/Optional.java`
#### Snippet
```java
  @CheckForNull
  public static <T> java.util.Optional<T> toJavaUtil(@CheckForNull Optional<T> googleOptional) {
    return googleOptional == null ? null : googleOptional.toJavaUtil();
  }

```

### RuleId[ruleID=OptionalAssignedToNull]
Optional value is compared with null
in `guava/src/com/google/common/base/Optional.java`
#### Snippet
```java
  @CheckForNull
  public static <T> Optional<T> fromJavaUtil(@CheckForNull java.util.Optional<T> javaUtilOptional) {
    return (javaUtilOptional == null) ? null : fromNullable(javaUtilOptional.orElse(null));
  }

```

### RuleId[ruleID=OptionalAssignedToNull]
Null is used for 'Optional' type in return statement
in `guava/src/com/google/common/base/Optional.java`
#### Snippet
```java
  @CheckForNull
  public static <T> Optional<T> fromJavaUtil(@CheckForNull java.util.Optional<T> javaUtilOptional) {
    return (javaUtilOptional == null) ? null : fromNullable(javaUtilOptional.orElse(null));
  }

```

## RuleId[ruleID=IfStatementWithIdenticalBranches]
### RuleId[ruleID=IfStatementWithIdenticalBranches]
Common part can be extracted from 'if'
in `guava/src/com/google/common/collect/CompactHashSet.java`
#### Snippet
```java
    incrementModCount();
    Set<E> delegate = delegateOrNull();
    if (delegate != null) {
      metadata =
          Ints.constrainToRange(size(), CompactHashing.DEFAULT_SIZE, CompactHashing.MAX_SIZE);
```

### RuleId[ruleID=IfStatementWithIdenticalBranches]
Common part can be extracted from 'if'
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
    incrementModCount();
    Map<K, V> delegate = delegateOrNull();
    if (delegate != null) {
      metadata =
          Ints.constrainToRange(size(), CompactHashing.DEFAULT_SIZE, CompactHashing.MAX_SIZE);
```

### RuleId[ruleID=IfStatementWithIdenticalBranches]
Common part can be extracted from 'if'
in `guava/src/com/google/common/reflect/Types.java`
#### Snippet
```java
    @Override
    public boolean equals(@CheckForNull Object obj) {
      if (NativeTypeVariableEquals.NATIVE_TYPE_VARIABLE_ONLY) {
        // equal only to our TypeVariable implementation with identical bounds
        if (obj != null
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java

    SortedMap<K, Collection<V>> sortedMap() {
      return (SortedMap<K, Collection<V>>) super.map();
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `guava/src/com/google/common/util/concurrent/InterruptibleTask.java`
#### Snippet
```java
    @VisibleForTesting
    Thread getOwner() {
      return super.getExclusiveOwnerThread();
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `guava/src/com/google/common/util/concurrent/InterruptibleTask.java`
#### Snippet
```java

    private void setOwner(Thread thread) {
      super.setExclusiveOwnerThread(thread);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java
   */
  protected TypeToken(Class<?> declaringClass) {
    Type captured = super.capture();
    if (captured instanceof Class) {
      this.runtimeType = captured;
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`buffer = buffer >>> 32` could be simplified to 'buffer \>\>\>= 32'
in `guava/src/com/google/common/hash/Murmur3_32HashFunction.java`
#### Snippet
```java
          int k1 = mixK1((int) buffer);
          h1 = mixH1(h1, k1);
          buffer = buffer >>> 32;
          shift -= 32;
        }
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`c = (char) (c >> 4)` could be simplified to 'c \>\>= 4'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    for (int i = 0; i < 4; i++) {
      tmp[5 - i] = hex.charAt(c & 0xF);
      c = (char) (c >> 4);
    }
    return String.copyValueOf(tmp);
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`hextet = hextet << 4` could be simplified to 'hextet \<\<= 4'
in `guava/src/com/google/common/net/InetAddresses.java`
#### Snippet
```java
    int hextet = 0;
    for (int i = start; i < end; i++) {
      hextet = hextet << 4;
      hextet |= Character.digit(ipString.charAt(i), 16);
    }
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/RegularImmutableMultiset.java`
#### Snippet
```java
  public ImmutableSet<E> elementSet() {
    ImmutableSet<E> result = elementSet;
    return (result == null) ? elementSet = new ElementSet<E>(Arrays.asList(entries), this) : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/util/concurrent/RateLimiter.java`
#### Snippet
```java
        mutex = mutexDoNotUseDirectly;
        if (mutex == null) {
          mutexDoNotUseDirectly = mutex = new Object();
        }
      }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/AbstractMultiset.java`
#### Snippet
```java
    Set<Entry<E>> result = entrySet;
    if (result == null) {
      entrySet = result = createEntrySet();
    }
    return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/AbstractMultiset.java`
#### Snippet
```java
    Set<E> result = elementSet;
    if (result == null) {
      elementSet = result = createElementSet();
    }
    return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
        throw new NoSuchElementException();
      }
      previous = current = next;
      next = next.next;
      nextIndex++;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
    Node<K, V> node = new Node<>(key, value);
    if (head == null) { // empty list
      head = tail = node;
      keyToKeyList.put(key, new KeyList<K, V>(node));
      modCount++;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
      KeyList<K, V> keyList = keyToKeyList.get(key);
      if (keyList == null) {
        keyToKeyList.put(key, keyList = new KeyList<>(node));
        modCount++;
      } else {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
        throw new NoSuchElementException();
      }
      next = current = previous;
      previous = previous.previous;
      nextIndex--;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
        throw new NoSuchElementException();
      }
      next = current = previous;
      previous = previous.previousSibling;
      nextIndex--;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
        throw new NoSuchElementException();
      }
      previous = current = next;
      next = next.nextSibling;
      nextIndex++;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/SingletonImmutableBiMap.java`
#### Snippet
```java
      ImmutableBiMap<V, K> result = lazyInverse;
      if (result == null) {
        return lazyInverse = new SingletonImmutableBiMap<>(singleValue, singleKey, this);
      } else {
        return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
      private Cancellable initializeOrUpdateCancellationDelegate(Schedule schedule) {
        if (cancellationDelegate == null) {
          return cancellationDelegate = new SupplantableFuture(lock, submitToExecutor(schedule));
        }
        if (!cancellationDelegate.currentFuture.isCancelled()) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableMultimap.java`
#### Snippet
```java
      Collection<V> valueCollection = builderMap.get(key);
      if (valueCollection == null) {
        builderMap.put(key, valueCollection = newMutableValueCollection());
      }
      valueCollection.add(value);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
  @Override
  public Collection<V> values() {
    return (valuesView == null) ? valuesView = createValues() : valuesView;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
  @Override
  public Set<Entry<K, V>> entrySet() {
    return (entrySetView == null) ? entrySetView = createEntrySet() : entrySetView;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
  @Override
  public Set<K> keySet() {
    return (keySetView == null) ? keySetView = createKeySet() : keySetView;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Count.java`
#### Snippet
```java

  public int addAndGet(int delta) {
    return value += delta;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/base/Utf8.java`
#### Snippet
```java
          return true;
        }
      } while ((byte1 = bytes[index++]) >= 0);

      if (byte1 < (byte) 0xE0) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/base/CaseFormat.java`
#### Snippet
```java
    int i = 0;
    int j = -1;
    while ((j = wordBoundary.indexIn(s, ++j)) != -1) {
      if (i == 0) {
        // include some extra space for separators
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/UnmodifiableSortedMultiset.java`
#### Snippet
```java
      result = new UnmodifiableSortedMultiset<>(delegate().descendingMultiset());
      result.descendingMultiset = this;
      return descendingMultiset = result;
    }
    return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
              getLowerBoundType());
      result.reverse = this;
      return this.reverse = result;
    }
    return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/io/CharStreams.java`
#### Snippet
```java
    int nRead;
    long total = 0;
    while ((nRead = from.read(buf)) != -1) {
      to.append(buf, 0, nRead);
      total += nRead;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/io/CharStreams.java`
#### Snippet
```java
    LineReader lineReader = new LineReader(r);
    String line;
    while ((line = lineReader.readLine()) != null) {
      result.add(line);
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/io/CharStreams.java`
#### Snippet
```java
    LineReader lineReader = new LineReader(readable);
    String line;
    while ((line = lineReader.readLine()) != null) {
      if (!processor.processLine(line)) {
        break;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/io/CharStreams.java`
#### Snippet
```java
    long read;
    CharBuffer buf = createBuffer();
    while ((read = readable.read(buf)) != -1) {
      total += read;
      Java8Compatibility.clear(buf);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/io/CharStreams.java`
#### Snippet
```java
    int nRead;
    long total = 0;
    while ((nRead = from.read(buf)) != -1) {
      to.write(buf, 0, nRead);
      total += nRead;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
    int h;
    if (hc == null) {
      threadHashCode.set(hc = new int[1]); // Initialize randomly
      int r = rng.nextInt(); // Avoid zero to allow xorShift rehash
      h = hc[0] = (r == 0) ? 1 : r;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
      threadHashCode.set(hc = new int[1]); // Initialize randomly
      int r = rng.nextInt(); // Avoid zero to allow xorShift rehash
      h = hc[0] = (r == 0) ? 1 : r;
    } else h = hc[0];
    boolean collide = false; // True if last slot nonempty
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
      int n;
      long v;
      if ((as = cells) != null && (n = as.length) > 0) {
        if ((a = as[(n - 1) & h]) == null) {
          if (busy == 0) { // Try to attach new Cell
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
      int n;
      long v;
      if ((as = cells) != null && (n = as.length) > 0) {
        if ((a = as[(n - 1) & h]) == null) {
          if (busy == 0) { // Try to attach new Cell
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
      long v;
      if ((as = cells) != null && (n = as.length) > 0) {
        if ((a = as[(n - 1) & h]) == null) {
          if (busy == 0) { // Try to attach new Cell
            Cell r = new Cell(x); // Optimistically create
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
                Cell[] rs;
                int m, j;
                if ((rs = cells) != null && (m = rs.length) > 0 && rs[j = (m - 1) & h] == null) {
                  rs[j] = r;
                  created = true;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
                Cell[] rs;
                int m, j;
                if ((rs = cells) != null && (m = rs.length) > 0 && rs[j = (m - 1) & h] == null) {
                  rs[j] = r;
                  created = true;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
                Cell[] rs;
                int m, j;
                if ((rs = cells) != null && (m = rs.length) > 0 && rs[j = (m - 1) & h] == null) {
                  rs[j] = r;
                  created = true;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
        } else if (!wasUncontended) // CAS already known to fail
        wasUncontended = true; // Continue after rehash
        else if (a.cas(v = a.value, fn(v, x))) break;
        else if (n >= NCPU || cells != as) collide = false; // At max size or stale
        else if (!collide) collide = true;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
        }
        if (init) break;
      } else if (casBase(v = base, fn(v, x))) break; // Fall back on using base
    }
  }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableListMultimap.java`
#### Snippet
```java
  public ImmutableListMultimap<V, K> inverse() {
    ImmutableListMultimap<V, K> result = inverse;
    return (result == null) ? (inverse = invert()) : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/RegularImmutableBiMap.java`
#### Snippet
```java
    }
    ImmutableBiMap<V, K> result = inverse;
    return (result == null) ? inverse = new Inverse() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/eventbus/Dispatcher.java`
#### Snippet
```java

      EventWithSubscriber e;
      while ((e = queue.poll()) != null) {
        e.subscriber.dispatchEvent(e.event);
      }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/eventbus/Dispatcher.java`
#### Snippet
```java
        try {
          Event nextEvent;
          while ((nextEvent = queueForThread.poll()) != null) {
            while (nextEvent.subscribers.hasNext()) {
              nextEvent.subscribers.next().dispatchEvent(nextEvent.event);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/util/concurrent/Striped.java`
#### Snippet
```java
    private void drainQueue() {
      Reference<? extends L> ref;
      while ((ref = queue.poll()) != null) {
        // We only ever register ArrayReferences with the queue so this is always safe.
        ArrayReference<? extends L> arrayRef = (ArrayReference<? extends L>) ref;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/io/ByteSource.java`
#### Snippet
```java
    long count = 0;
    long skipped;
    while ((skipped = skipUpTo(in, Integer.MAX_VALUE)) > 0) {
      count += skipped;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  public Set<K> keySet() {
    Set<K> result = keySet;
    return (result == null) ? keySet = createKeySet() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  public Multiset<K> keys() {
    Multiset<K> result = keys;
    return (result == null) ? keys = createKeys() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  public Map<K, Collection<V>> asMap() {
    Map<K, Collection<V>> result = asMap;
    return (result == null) ? asMap = createAsMap() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  public Collection<Entry<K, V>> entries() {
    Collection<Entry<K, V>> result = entries;
    return (result == null) ? entries = createEntries() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  public Collection<V> values() {
    Collection<V> result = values;
    return (result == null) ? values = createValues() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/LongAdder.java`
#### Snippet
```java
    Cell a;
    int n;
    if ((as = cells) != null || !casBase(b = base, b + x)) {
      boolean uncontended = true;
      if ((hc = threadHashCode.get()) == null
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/LongAdder.java`
#### Snippet
```java
    Cell a;
    int n;
    if ((as = cells) != null || !casBase(b = base, b + x)) {
      boolean uncontended = true;
      if ((hc = threadHashCode.get()) == null
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/LongAdder.java`
#### Snippet
```java
    if ((as = cells) != null || !casBase(b = base, b + x)) {
      boolean uncontended = true;
      if ((hc = threadHashCode.get()) == null
          || as == null
          || (n = as.length) < 1
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/LongAdder.java`
#### Snippet
```java
      if ((hc = threadHashCode.get()) == null
          || as == null
          || (n = as.length) < 1
          || (a = as[(n - 1) & hc[0]]) == null
          || !(uncontended = a.cas(v = a.value, v + x))) retryUpdate(x, hc, uncontended);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/LongAdder.java`
#### Snippet
```java
          || as == null
          || (n = as.length) < 1
          || (a = as[(n - 1) & hc[0]]) == null
          || !(uncontended = a.cas(v = a.value, v + x))) retryUpdate(x, hc, uncontended);
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/LongAdder.java`
#### Snippet
```java
          || (n = as.length) < 1
          || (a = as[(n - 1) & hc[0]]) == null
          || !(uncontended = a.cas(v = a.value, v + x))) retryUpdate(x, hc, uncontended);
    }
  }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/LongAdder.java`
#### Snippet
```java
          || (n = as.length) < 1
          || (a = as[(n - 1) & hc[0]]) == null
          || !(uncontended = a.cas(v = a.value, v + x))) retryUpdate(x, hc, uncontended);
    }
  }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
    public Set<E> elementSet() {
      Set<E> es = elementSet;
      return (es == null) ? elementSet = createElementSet() : es;
    }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
          // Safe because the returned set is made unmodifiable and Entry
          // itself is readonly
          ? entrySet = (Set) Collections.unmodifiableSet(delegate.entrySet())
          : es;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
      if (laterCount == 0) {
        currentEntry = entryIterator.next();
        totalCount = laterCount = currentEntry.getCount();
      }
      laterCount--;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
    public SortedSet<K> keySet() {
      SortedSet<K> result = sortedKeySet;
      return (result == null) ? sortedKeySet = createKeySet() : result;
    }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/DescendingMultiset.java`
#### Snippet
```java
    Comparator<? super E> result = comparator;
    if (result == null) {
      return comparator = Ordering.from(forwardMultiset().comparator()).<E>reverse();
    }
    return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/DescendingMultiset.java`
#### Snippet
```java
  public Set<Entry<E>> entrySet() {
    Set<Entry<E>> result = entrySet;
    return (result == null) ? entrySet = createEntrySet() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/DescendingMultiset.java`
#### Snippet
```java
    NavigableSet<E> result = elementSet;
    if (result == null) {
      return elementSet = new SortedMultisets.NavigableElementSet<>(this);
    }
    return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/AbstractTable.java`
#### Snippet
```java
  public Set<Cell<R, C, V>> cellSet() {
    Set<Cell<R, C, V>> result = cellSet;
    return (result == null) ? cellSet = createCellSet() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/AbstractTable.java`
#### Snippet
```java
  public Collection<V> values() {
    Collection<V> result = values;
    return (result == null) ? values = createValues() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/base/MoreObjects.java`
#### Snippet
```java
    private UnconditionalValueHolder addUnconditionalHolder() {
      UnconditionalValueHolder valueHolder = new UnconditionalValueHolder();
      holderTail = holderTail.next = valueHolder;
      return valueHolder;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/base/MoreObjects.java`
#### Snippet
```java
    private ValueHolder addHolder() {
      ValueHolder valueHolder = new ValueHolder();
      holderTail = holderTail.next = valueHolder;
      return valueHolder;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
      if (result == null) {
        Alphabet upper = alphabet.upperCase();
        result = upperCase = (upper == alphabet) ? this : newInstance(upper, paddingChar);
      }
      return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
      if (result == null) {
        Alphabet ignore = alphabet.ignoreCase();
        result = ignoreCase = (ignore == alphabet) ? this : newInstance(ignore, paddingChar);
      }
      return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
      if (result == null) {
        Alphabet lower = alphabet.lowerCase();
        result = lowerCase = (lower == alphabet) ? this : newInstance(lower, paddingChar);
      }
      return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
  public ImmutableSet<Entry<K, V>> entries() {
    ImmutableSet<Entry<K, V>> result = entries;
    return result == null ? (entries = new EntrySet<>(this)) : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
  public ImmutableSetMultimap<V, K> inverse() {
    ImmutableSetMultimap<V, K> result = inverse;
    return (result == null) ? (inverse = invert()) : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
          }
        }
        result = size = Ints.saturatedCast(total);
      }
      return result.intValue();
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
      return result;
    } else if (ranges.isEmpty()) {
      return complement = all();
    } else if (ranges.size() == 1 && ranges.get(0).equals(Range.all())) {
      return complement = of();
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
      return complement = all();
    } else if (ranges.size() == 1 && ranges.get(0).equals(Range.all())) {
      return complement = of();
    } else {
      ImmutableList<Range<C>> complementRanges = new ComplementRanges();
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
    } else {
      ImmutableList<Range<C>> complementRanges = new ComplementRanges();
      result = complement = new ImmutableRangeSet<C>(complementRanges, this);
    }
    return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/base/Converter.java`
#### Snippet
```java
  public Converter<B, A> reverse() {
    Converter<B, A> result = reverse;
    return (result == null) ? reverse = new ReverseConverter<>(this) : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/NaturalOrdering.java`
#### Snippet
```java
    Ordering<@Nullable Comparable<?>> result = nullsFirst;
    if (result == null) {
      result = nullsFirst = super.<Comparable<?>>nullsFirst();
    }
    return (Ordering<@Nullable S>) result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/NaturalOrdering.java`
#### Snippet
```java
    Ordering<@Nullable Comparable<?>> result = nullsLast;
    if (result == null) {
      result = nullsLast = super.<Comparable<?>>nullsLast();
    }
    return (Ordering<@Nullable S>) result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/io/ByteStreams.java`
#### Snippet
```java
    long read;
    byte[] buf = createBuffer();
    while ((read = in.read(buf)) != -1) {
      total += read;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/io/ByteStreams.java`
#### Snippet
```java
          buf = new byte[skip];
        }
        if ((skipped = in.read(buf, 0, skip)) == -1) {
          // Reached EOF
          break;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
  public Set<Entry<K, V>> entrySet() {
    Set<Entry<K, V>> es = entrySet;
    return (es != null) ? es : (entrySet = new EntrySet());
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      Reference<? extends V> ref;
      int i = 0;
      while ((ref = valueReferenceQueue.poll()) != null) {
        @SuppressWarnings("unchecked")
        WeakValueReference<K, V, E> valueReference = (WeakValueReference<K, V, E>) ref;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
  public Collection<V> values() {
    Collection<V> vs = values;
    return (vs != null) ? vs : (values = new Values());
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
  public Set<K> keySet() {
    Set<K> ks = keySet;
    return (ks != null) ? ks : (keySet = new KeySet());
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      Reference<? extends K> ref;
      int i = 0;
      while ((ref = keyReferenceQueue.poll()) != null) {
        @SuppressWarnings("unchecked")
        E entry = (E) ref;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    boolean nextInTable() {
      while (nextTableIndex >= 0) {
        if ((nextEntry = currentTable.get(nextTableIndex--)) != null) {
          if (advanceTo(nextEntry) || nextInChain()) {
            return true;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
  public Set<Range<C>> asRanges() {
    Set<Range<C>> result = asRanges;
    return (result == null) ? asRanges = new AsRanges(rangesByLowerBound.values()) : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
  public RangeSet<C> complement() {
    RangeSet<C> result = complement;
    return (result == null) ? complement = new Complement() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
    Set<Range<C>> result = asDescendingSetOfRanges;
    return (result == null)
        ? asDescendingSetOfRanges = new AsRanges(rangesByLowerBound.descendingMap().values())
        : result;
  }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/base/internal/Finalizer.java`
#### Snippet
```java
       * over and over again.
       */
    } while ((reference = queue.poll()) != null);
    return true;
  }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java
  public Set<Entry<K, V>> entrySet() {
    Set<Entry<K, V>> result = entrySet;
    return (result == null) ? entrySet = new EntrySet() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java
     */
    Set<V> result = valueSet;
    return (result == null) ? valueSet = new ValueSet() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java
  public Set<K> keySet() {
    Set<K> result = keySet;
    return (result == null) ? keySet = new KeySet() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
    ImmutableSortedSet<E> result = descendingSet;
    if (result == null) {
      result = descendingSet = createDescendingSet();
      result.descendingSet = this;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/util/concurrent/ExecutionSequencer.java`
#### Snippet
```java
        Executor queuedExecutor;
        // Intentionally using non-short-circuit operator
        while ((queuedTask = executingTaskQueue.nextTask) != null
            && (queuedExecutor = executingTaskQueue.nextExecutor) != null) {
          executingTaskQueue.nextTask = null;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/util/concurrent/ExecutionSequencer.java`
#### Snippet
```java
        // Intentionally using non-short-circuit operator
        while ((queuedTask = executingTaskQueue.nextTask) != null
            && (queuedExecutor = executingTaskQueue.nextExecutor) != null) {
          executingTaskQueue.nextTask = null;
          executingTaskQueue.nextExecutor = null;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/util/concurrent/Monitor.java`
#### Snippet
```java
    boolean satisfied = false;
    try {
      return satisfied = guard.isSatisfied();
    } finally {
      if (!satisfied) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/util/concurrent/Monitor.java`
#### Snippet
```java
    boolean satisfied = false;
    try {
      return satisfied = guard.isSatisfied();
    } finally {
      if (!satisfied) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/util/concurrent/Monitor.java`
#### Snippet
```java
    boolean satisfied = false;
    try {
      return satisfied = guard.isSatisfied();
    } finally {
      if (!satisfied) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/util/concurrent/Monitor.java`
#### Snippet
```java
    boolean satisfied = false;
    try {
      return satisfied = guard.isSatisfied();
    } finally {
      if (!satisfied) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/util/concurrent/Monitor.java`
#### Snippet
```java
    boolean satisfied = false;
    try {
      return satisfied = guard.isSatisfied();
    } finally {
      if (!satisfied) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/JdkBackedImmutableBiMap.java`
#### Snippet
```java
    if (result == null) {
      inverse =
          result =
              new JdkBackedImmutableBiMap<>(
                  new InverseEntries(), backwardDelegate, forwardDelegate);
      result.inverse = this;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/AbstractSortedMultiset.java`
#### Snippet
```java
  public SortedMultiset<E> descendingMultiset() {
    SortedMultiset<E> result = descendingMultiset;
    return (result == null) ? descendingMultiset = createDescendingMultiset() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableSet.java`
#### Snippet
```java
      ImmutableList<E> result = asList;
      if (result == null) {
        return asList = createAsList();
      } else {
        return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/hash/LongAdder.java`
#### Snippet
```java
    Cell a;
    int n;
    if ((as = cells) != null || !casBase(b = base, b + x)) {
      boolean uncontended = true;
      if ((hc = threadHashCode.get()) == null
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/hash/LongAdder.java`
#### Snippet
```java
    Cell a;
    int n;
    if ((as = cells) != null || !casBase(b = base, b + x)) {
      boolean uncontended = true;
      if ((hc = threadHashCode.get()) == null
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/hash/LongAdder.java`
#### Snippet
```java
    if ((as = cells) != null || !casBase(b = base, b + x)) {
      boolean uncontended = true;
      if ((hc = threadHashCode.get()) == null
          || as == null
          || (n = as.length) < 1
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/hash/LongAdder.java`
#### Snippet
```java
      if ((hc = threadHashCode.get()) == null
          || as == null
          || (n = as.length) < 1
          || (a = as[(n - 1) & hc[0]]) == null
          || !(uncontended = a.cas(v = a.value, v + x))) retryUpdate(x, hc, uncontended);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/hash/LongAdder.java`
#### Snippet
```java
          || as == null
          || (n = as.length) < 1
          || (a = as[(n - 1) & hc[0]]) == null
          || !(uncontended = a.cas(v = a.value, v + x))) retryUpdate(x, hc, uncontended);
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/hash/LongAdder.java`
#### Snippet
```java
          || (n = as.length) < 1
          || (a = as[(n - 1) & hc[0]]) == null
          || !(uncontended = a.cas(v = a.value, v + x))) retryUpdate(x, hc, uncontended);
    }
  }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/hash/LongAdder.java`
#### Snippet
```java
          || (n = as.length) < 1
          || (a = as[(n - 1) & hc[0]]) == null
          || !(uncontended = a.cas(v = a.value, v + x))) retryUpdate(x, hc, uncontended);
    }
  }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/base/FinalizableReferenceQueue.java`
#### Snippet
```java

    Reference<?> reference;
    while ((reference = queue.poll()) != null) {
      /*
       * This is for the benefit of phantom references. Weak and soft references will have already
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    void drainRecencyQueue() {
      ReferenceEntry<K, V> e;
      while ((e = recencyQueue.poll()) != null) {
        // An entry may be in the recency queue despite it being removed from
        // the map . This can occur when the entry was concurrently read while a
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    // does not impact recency ordering
    Collection<V> vs = values;
    return (vs != null) ? vs : (values = new Values());
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    // does not impact recency ordering
    Set<Entry<K, V>> es = entrySet;
    return (es != null) ? es : (entrySet = new EntrySet());
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      Reference<? extends K> ref;
      int i = 0;
      while ((ref = keyReferenceQueue.poll()) != null) {
        @SuppressWarnings("unchecked")
        ReferenceEntry<K, V> entry = (ReferenceEntry<K, V>) ref;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    boolean nextInTable() {
      while (nextTableIndex >= 0) {
        if ((nextEntry = currentTable.get(nextTableIndex--)) != null) {
          if (advanceTo(nextEntry) || nextInChain()) {
            return true;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      Reference<? extends V> ref;
      int i = 0;
      while ((ref = valueReferenceQueue.poll()) != null) {
        @SuppressWarnings("unchecked")
        ValueReference<K, V> valueReference = (ValueReference<K, V>) ref;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

      ReferenceEntry<K, V> e;
      while ((e = writeQueue.peek()) != null && map.isExpired(e, now)) {
        if (!removeEntry(e, e.getHash(), RemovalCause.EXPIRED)) {
          throw new AssertionError();
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        }
      }
      while ((e = accessQueue.peek()) != null && map.isExpired(e, now)) {
        if (!removeEntry(e, e.getHash(), RemovalCause.EXPIRED)) {
          throw new AssertionError();
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    // does not impact recency ordering
    Set<K> ks = keySet;
    return (ks != null) ? ks : (keySet = new KeySet());
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
  void processPendingNotifications() {
    RemovalNotification<K, V> notification;
    while ((notification = removalNotificationQueue.poll()) != null) {
      try {
        removalListener.onRemoval(notification);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
  public Map<R, Map<C, @Nullable V>> rowMap() {
    RowMap map = rowMap;
    return (map == null) ? rowMap = new RowMap() : map;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
  public Map<C, Map<R, @Nullable V>> columnMap() {
    ColumnMap map = columnMap;
    return (map == null) ? columnMap = new ColumnMap() : map;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java
  public ImmutableList<E> asList() {
    ImmutableList<E> result = asList;
    return (result == null) ? asList = super.asList() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java
  public ImmutableSet<Entry<E>> entrySet() {
    ImmutableSet<Entry<E>> es = entrySet;
    return (es == null) ? (entrySet = createEntrySet()) : es;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableEnumSet.java`
#### Snippet
```java
  public int hashCode() {
    int result = hashCode;
    return (result == 0) ? hashCode = delegate.hashCode() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
  public BiMap<V, K> inverse() {
    BiMap<V, K> result = inverse;
    return (result == null) ? inverse = new Inverse() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableSortedMultiset.java`
#### Snippet
```java
    ImmutableSortedMultiset<E> result = descendingMultiset;
    if (result == null) {
      return descendingMultiset =
          this.isEmpty()
              ? emptyMultiset(Ordering.from(comparator()).reverse())
              : new DescendingImmutableSortedMultiset<E>(this);
    }
    return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/JdkBackedImmutableMultiset.java`
#### Snippet
```java
  public ImmutableSet<E> elementSet() {
    ImmutableSet<E> result = elementSet;
    return (result == null) ? elementSet = new ElementSet<>(entries, this) : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/util/concurrent/AtomicLongMap.java`
#### Snippet
```java
  public Map<K, Long> asMap() {
    Map<K, Long> result = asMap;
    return (result == null) ? asMap = createAsMap() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
      synchronized (mutex) {
        if (descendingKeySet == null) {
          return descendingKeySet = Synchronized.navigableSet(delegate().descendingKeySet(), mutex);
        }
        return descendingKeySet;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
      synchronized (mutex) {
        if (descendingMap == null) {
          return descendingMap = navigableMap(delegate().descendingMap(), mutex);
        }
        return descendingMap;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
      synchronized (mutex) {
        if (navigableKeySet == null) {
          return navigableKeySet = Synchronized.navigableSet(delegate().navigableKeySet(), mutex);
        }
        return navigableKeySet;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
  public Map<C, Map<R, V>> columnMap() {
    ColumnMap result = columnMap;
    return (result == null) ? columnMap = new ColumnMap() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
  public Map<R, Map<C, V>> rowMap() {
    Map<R, Map<C, V>> result = rowMap;
    return (result == null) ? rowMap = createRowMap() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
  public Set<C> columnKeySet() {
    Set<C> result = columnKeySet;
    return (result == null) ? columnKeySet = new ColumnKeySet() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
        }
        checkState(whenClosed == null);
        return whenClosed = new CountDownLatch(1);
      }
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/MinMaxPriorityQueue.java`
#### Snippet
```java
    int fillHoleAt(int index) {
      int minGrandchildIndex;
      while ((minGrandchildIndex = findMinGrandChild(index)) > 0) {
        queue[index] = elementData(minGrandchildIndex);
        index = minGrandchildIndex;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
  public ImmutableSet<K> keySet() {
    ImmutableSet<K> result = keySet;
    return (result == null) ? keySet = createKeySet() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
    ImmutableSetMultimap<K, V> result = multimapView;
    return (result == null)
        ? (multimapView =
            new ImmutableSetMultimap<>(new MapViewOfValuesAsSingletonSets(), size(), null))
        : result;
  }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
  public ImmutableSet<Entry<K, V>> entrySet() {
    ImmutableSet<Entry<K, V>> result = entrySet;
    return (result == null) ? entrySet = createEntrySet() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
  public ImmutableCollection<V> values() {
    ImmutableCollection<V> result = values;
    return (result == null) ? values = createValues() : result;
  }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/io/CharSource.java`
#### Snippet
```java
      List<String> result = Lists.newArrayList();
      String line;
      while ((line = reader.readLine()) != null) {
        result.add(line);
      }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/io/CharSource.java`
#### Snippet
```java
    long count = 0;
    long read;
    while ((read = reader.skip(Long.MAX_VALUE)) != 0) {
      count += read;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java
        ImmutableList<TypeToken<? super T>> collectedTypes =
            (ImmutableList) TypeCollector.FOR_GENERIC_TYPE.collectTypes(TypeToken.this);
        return (types =
            FluentIterable.from(collectedTypes)
                .filter(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD)
                .toSet());
      } else {
        return filteredTypes;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java
      ImmutableSet<TypeToken<? super T>> result = interfaces;
      if (result == null) {
        return (interfaces =
            FluentIterable.from(allTypes).filter(TypeFilter.INTERFACE_ONLY).toSet());
      } else {
        return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java
    TypeResolver resolver = invariantTypeResolver;
    if (resolver == null) {
      resolver = (invariantTypeResolver = TypeResolver.invariantly(runtimeType));
    }
    return resolver;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java
    TypeResolver resolver = covariantTypeResolver;
    if (resolver == null) {
      resolver = (covariantTypeResolver = TypeResolver.covariantly(runtimeType));
    }
    return resolver;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java
            (ImmutableList)
                TypeCollector.FOR_GENERIC_TYPE.classesOnly().collectTypes(TypeToken.this);
        return (classes =
            FluentIterable.from(collectedTypes)
                .filter(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD)
                .toSet());
      } else {
        return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/math/LinearTransformation.java`
#### Snippet
```java
    public LinearTransformation inverse() {
      LinearTransformation result = inverse;
      return (result == null) ? inverse = createInverse() : result;
    }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/math/LinearTransformation.java`
#### Snippet
```java
    public LinearTransformation inverse() {
      LinearTransformation result = inverse;
      return (result == null) ? inverse = createInverse() : result;
    }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
    int h;
    if (hc == null) {
      threadHashCode.set(hc = new int[1]); // Initialize randomly
      int r = rng.nextInt(); // Avoid zero to allow xorShift rehash
      h = hc[0] = (r == 0) ? 1 : r;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
      threadHashCode.set(hc = new int[1]); // Initialize randomly
      int r = rng.nextInt(); // Avoid zero to allow xorShift rehash
      h = hc[0] = (r == 0) ? 1 : r;
    } else h = hc[0];
    boolean collide = false; // True if last slot nonempty
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
      int n;
      long v;
      if ((as = cells) != null && (n = as.length) > 0) {
        if ((a = as[(n - 1) & h]) == null) {
          if (busy == 0) { // Try to attach new Cell
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
      int n;
      long v;
      if ((as = cells) != null && (n = as.length) > 0) {
        if ((a = as[(n - 1) & h]) == null) {
          if (busy == 0) { // Try to attach new Cell
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
      long v;
      if ((as = cells) != null && (n = as.length) > 0) {
        if ((a = as[(n - 1) & h]) == null) {
          if (busy == 0) { // Try to attach new Cell
            Cell r = new Cell(x); // Optimistically create
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
                Cell[] rs;
                int m, j;
                if ((rs = cells) != null && (m = rs.length) > 0 && rs[j = (m - 1) & h] == null) {
                  rs[j] = r;
                  created = true;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
                Cell[] rs;
                int m, j;
                if ((rs = cells) != null && (m = rs.length) > 0 && rs[j = (m - 1) & h] == null) {
                  rs[j] = r;
                  created = true;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
                Cell[] rs;
                int m, j;
                if ((rs = cells) != null && (m = rs.length) > 0 && rs[j = (m - 1) & h] == null) {
                  rs[j] = r;
                  created = true;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
        } else if (!wasUncontended) // CAS already known to fail
        wasUncontended = true; // Continue after rehash
        else if (a.cas(v = a.value, fn(v, x))) break;
        else if (n >= NCPU || cells != as) collide = false; // At max size or stale
        else if (!collide) collide = true;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
        }
        if (init) break;
      } else if (casBase(v = base, fn(v, x))) break; // Fall back on using base
    }
  }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
    if (result == null) {
      if (isEmpty()) {
        return result = emptyMap(Ordering.from(comparator()).reverse());
      } else {
        return result =
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
        return result = emptyMap(Ordering.from(comparator()).reverse());
      } else {
        return result =
            new ImmutableSortedMap<>(
                (RegularImmutableSortedSet<K>) keySet.descendingSet(), valueList.reverse(), this);
      }
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
      UnmodifiableNavigableSet<E> result = descendingSet;
      if (result == null) {
        result = descendingSet = new UnmodifiableNavigableSet<E>(delegate.descendingSet());
        result.descendingSet = this;
      }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/base/Throwables.java`
#### Snippet
```java

    Throwable cause;
    while ((cause = throwable.getCause()) != null) {
      throwable = cause;
      causes.add(throwable);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/base/Throwables.java`
#### Snippet
```java

    Throwable cause;
    while ((cause = throwable.getCause()) != null) {
      throwable = cause;

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
      if (result == null) {
        result =
            map =
                Collections.unmodifiableMap(
                    Maps.transformValues(
                        delegate.asMap(),
                        new Function<Collection<V>, Collection<V>>() {
                          @Override
                          public Collection<V> apply(Collection<V> collection) {
                            return unmodifiableValueCollection(collection);
                          }
                        }));
      }
      return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
      Collection<V> result = values;
      if (result == null) {
        values = result = Collections.unmodifiableCollection(delegate.values());
      }
      return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
      Multiset<K> result = keys;
      if (result == null) {
        keys = result = Multisets.unmodifiableMultiset(delegate.keys());
      }
      return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
      Set<K> result = keySet;
      if (result == null) {
        keySet = result = Collections.unmodifiableSet(delegate.keySet());
      }
      return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
      Collection<Entry<K, V>> result = entries;
      if (result == null) {
        entries = result = unmodifiableEntries(delegate.entries());
      }
      return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    public Collection<V> values() {
      Collection<V> result = values;
      return (result == null) ? values = createValues() : result;
    }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    public Set<V> values() {
      Set<V> result = values;
      return (result == null) ? values = Collections.unmodifiableSet(delegate.values()) : result;
    }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    public Set<Entry<K, V>> entrySet() {
      Set<Entry<K, V>> result = entrySet;
      return (result == null) ? entrySet = createEntrySet() : result;
    }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
      BiMap<V, K> result = inverse;
      return (result == null)
          ? inverse = new UnmodifiableBiMap<>(delegate.inverse(), this)
          : result;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    public Set<Entry<K, V>> entrySet() {
      Set<Entry<K, V>> result = entrySet;
      return (result == null) ? entrySet = createEntrySet() : result;
    }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
      UnmodifiableNavigableMap<K, V> result = descendingMap;
      return (result == null)
          ? descendingMap = new UnmodifiableNavigableMap<>(delegate.descendingMap(), this)
          : result;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    public NavigableSet<K> navigableKeySet() {
      NavigableSet<K> result = navigableKeySet;
      return (result == null) ? navigableKeySet = new NavigableKeySet<>(this) : result;
    }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
          forwardCmp = (Comparator) Ordering.natural();
        }
        result = comparator = reverse(forwardCmp);
      }
      return result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    public Set<K> keySet() {
      Set<K> result = keySet;
      return (result == null) ? keySet = createKeySet() : result;
    }

```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `left` is accessed in both synchronized and unsynchronized contexts
in `guava/src/com/google/common/io/ByteStreams.java`
#### Snippet
```java
  private static final class LimitedInputStream extends FilterInputStream {

    private long left;
    private long mark = -1;

```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `count` is accessed in both synchronized and unsynchronized contexts
in `guava/src/com/google/common/io/CountingInputStream.java`
#### Snippet
```java
public final class CountingInputStream extends FilterInputStream {

  private long count;
  private long mark = -1;

```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `task` is accessed in both synchronized and unsynchronized contexts
in `guava/src/com/google/common/util/concurrent/SequentialExecutor.java`
#### Snippet
```java
  /** Worker that runs tasks from {@link #queue} until it is empty. */
  private final class QueueWorker implements Runnable {
    @CheckForNull Runnable task;

    @Override
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `workerRunningState` is accessed in both synchronized and unsynchronized contexts
in `guava/src/com/google/common/util/concurrent/SequentialExecutor.java`
#### Snippet
```java
  /** see {@link WorkerRunningState} */
  @GuardedBy("queue")
  private WorkerRunningState workerRunningState = IDLE;

  /**
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `value` is accessed in both synchronized and unsynchronized contexts
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
    // "value" does not need to be volatile; visibility piggy-backs
    // on volatile read of "initialized".
    @CheckForNull transient T value;

    MemoizingSupplier(Supplier<T> delegate) {
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `value` is accessed in both synchronized and unsynchronized contexts
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
    // "value" does not need to be volatile; visibility piggy-backs
    // on volatile read of "initialized".
    @CheckForNull T value;

    NonSerializableMemoizingSupplier(Supplier<T> delegate) {
```

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
   */
  @Override
  public Collection<V> values() {
    return super.values();
  }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
   */
  @Override
  public Collection<Entry<K, V>> entries() {
    return super.entries();
  }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `guava/src/com/google/common/collect/AbstractMapBasedMultiset.java`
#### Snippet
```java
   */
  @Override
  public Set<Multiset.Entry<E>> entrySet() {
    return super.entrySet();
  }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `guava/src/com/google/common/collect/AbstractSetMultimap.java`
#### Snippet
```java
   */
  @Override
  public Map<K, Collection<V>> asMap() {
    return super.asMap();
  }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
   */
  @Override
  public Set<Cell<R, C, @Nullable V>> cellSet() {
    return super.cellSet();
  }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
   */
  @Override
  public Collection<@Nullable V> values() {
    return super.values();
  }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `guava/src/com/google/common/collect/EmptyImmutableSetMultimap.java`
#### Snippet
```java
   */
  @Override
  public ImmutableMap<Object, Collection<Object>> asMap() {
    return super.asMap();
  }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `guava/src/com/google/common/collect/EvictingQueue.java`
#### Snippet
```java

  @Override
  public Object[] toArray() {
    /*
     * If we could, we'd declare the no-arg `Collection.toArray()` to return "Object[] but elements
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
  /** Returns an immutable set of the mappings in this map, sorted by the key ordering. */
  @Override
  public ImmutableSet<Entry<K, V>> entrySet() {
    return super.entrySet();
  }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
   */
  @Override
  public Set<Entry<K, V>> entries() {
    return super.entries();
  }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
   */
  @Override
  public Set<K> keySet() {
    return super.keySet();
  }
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `guava/src/com/google/common/collect/ListMultimap.java`
#### Snippet
```java
   */
  @Override
  Map<K, Collection<V>> asMap();

  /**
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

    /** Unsets the referenced value. Subsequent calls to {@link #get} will return {@code null}. */
    void clear();

    /**
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
   */
  @Override
  public Set<Cell<R, C, V>> cellSet() {
    return super.cellSet();
  }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
   */
  @Override
  public Collection<V> values() {
    return super.values();
  }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `guava/src/com/google/common/collect/TreeBasedTable.java`
#### Snippet
```java

  @Override
  public SortedSet<R> rowKeySet() {
    return super.rowKeySet();
  }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `guava/src/com/google/common/collect/TreeBasedTable.java`
#### Snippet
```java

  @Override
  public SortedMap<R, Map<C, V>> rowMap() {
    return super.rowMap();
  }
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `guava/src/com/google/common/util/concurrent/ForwardingExecutorService.java`
#### Snippet
```java

  @Override
  protected abstract ExecutorService delegate();

  @CheckReturnValue
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/primitives/ImmutableDoubleArray.java`
#### Snippet
```java
  public static final class Builder {
    private double[] array;
    private int count = 0; // <= array.length

    Builder(int initialCapacity) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/primitives/ImmutableLongArray.java`
#### Snippet
```java
  public static final class Builder {
    private long[] array;
    private int count = 0; // <= array.length

    Builder(int initialCapacity) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `guava/src/com/google/common/graph/NetworkBuilder.java`
#### Snippet
```java
@ElementTypesAreNonnullByDefault
public final class NetworkBuilder<N, E> extends AbstractGraphBuilder<N> {
  boolean allowsParallelEdges = false;
  ElementOrder<? super E> edgeOrder = ElementOrder.insertion();
  Optional<Integer> expectedEdgeCount = Optional.absent();
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `guava/src/com/google/common/collect/ForwardingNavigableMap.java`
#### Snippet
```java
    protected Iterator<Entry<K, V>> entryIterator() {
      return new Iterator<Entry<K, V>>() {
        @CheckForNull private Entry<K, V> toRemove = null;
        @CheckForNull private Entry<K, V> nextOrNull = forward().lastEntry();

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `guava/src/com/google/common/hash/Crc32cHashFunction.java`
#### Snippet
```java
    }

    private boolean finished = false;

    /*
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/hash/Crc32cHashFunction.java`
#### Snippet
```java
     */
    private int crc0 = INVERSE_COMPUTE_FOR_WORD_OF_ALL_1S;
    private int crc1 = 0;
    private int crc2 = 0;
    private int crc3 = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/hash/Crc32cHashFunction.java`
#### Snippet
```java
    private int crc1 = 0;
    private int crc2 = 0;
    private int crc3 = 0;

    @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/hash/Crc32cHashFunction.java`
#### Snippet
```java
    private int crc0 = INVERSE_COMPUTE_FOR_WORD_OF_ALL_1S;
    private int crc1 = 0;
    private int crc2 = 0;
    private int crc3 = 0;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `guava/src/com/google/common/collect/ImmutableMultimap.java`
#### Snippet
```java
      final Iterator<? extends Entry<K, ? extends ImmutableCollection<V>>> asMapItr =
          map.entrySet().iterator();
      @CheckForNull K currentKey = null;
      Iterator<V> valueItr = Iterators.emptyIterator();

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/primitives/ImmutableIntArray.java`
#### Snippet
```java
  public static final class Builder {
    private int[] array;
    private int count = 0; // <= array.length

    Builder(int initialCapacity) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `guava/src/com/google/common/escape/Escapers.java`
#### Snippet
```java
    private char safeMin = Character.MIN_VALUE;
    private char safeMax = Character.MAX_VALUE;
    @CheckForNull private String unsafeReplacement = null;

    // The constructor is exposed via the builder() method above.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/base/Splitter.java`
#### Snippet
```java
    abstract int separatorEnd(int separatorPosition);

    int offset = 0;
    int limit;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0L` is redundant
in `guava/src/com/google/common/util/concurrent/SmoothRateLimiter.java`
#### Snippet
```java
   * this is pushed further in the future. Large requests push this further than small requests.
   */
  private long nextFreeTicketMicros = 0L; // could be either in the past or future

  private SmoothRateLimiter(SleepingStopwatch stopwatch) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `guava/src/com/google/common/util/concurrent/Futures.java`
#### Snippet
```java
    // in order to read these fields, the corresponding write to incompleteOutputCount must have
    // been read.
    private boolean wasCancelled = false;
    private boolean shouldInterrupt = true;
    private final AtomicInteger incompleteOutputCount;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/util/concurrent/Futures.java`
#### Snippet
```java
    // We set the elements of the array to null as they complete.
    private final @Nullable ListenableFuture<? extends T>[] inputFutures;
    private volatile int delegateIndex = 0;

    private InCompletionOrderState(ListenableFuture<? extends T>[] inputFutures) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/hash/SipHashFunction.java`
#### Snippet
```java

    // The number of bytes in the input.
    private long b = 0;

    // The final 64-bit chunk includes the last 0 through 7 bytes of m followed by null bytes
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/hash/SipHashFunction.java`
#### Snippet
```java
    // The final 64-bit chunk includes the last 0 through 7 bytes of m followed by null bytes
    // and ending with a byte encoding the positive integer b mod 256.
    private long finalM = 0;

    SipHasher(int c, int d, long k0, long k1) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
    return new Iterator<Entry<E>>() {
      @CheckForNull AvlNode<E> current = lastNode();
      @CheckForNull Entry<E> prevEntry = null;

      @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `guava/src/com/google/common/graph/AbstractGraphBuilder.java`
#### Snippet
```java
abstract class AbstractGraphBuilder<N> {
  final boolean directed;
  boolean allowsSelfLoops = false;
  ElementOrder<N> nodeOrder = ElementOrder.insertion();
  ElementOrder<N> incidentEdgeOrder = ElementOrder.unordered();
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/collect/EnumMultiset.java`
#### Snippet
```java

  abstract class Itr<T> implements Iterator<T> {
    int index = 0;
    int toRemove = -1;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `guava/src/com/google/common/base/MoreObjects.java`
#### Snippet
```java
    private final ValueHolder holderHead = new ValueHolder();
    private ValueHolder holderTail = holderHead;
    private boolean omitNullValues = false;
    private boolean omitEmptyValues = false;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `guava/src/com/google/common/base/MoreObjects.java`
#### Snippet
```java
    private ValueHolder holderTail = holderHead;
    private boolean omitNullValues = false;
    private boolean omitEmptyValues = false;

    /** Use {@link MoreObjects#toStringHelper(Object)} to create an instance. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
      checkNotNull(reader);
      return new InputStream() {
        int bitBuffer = 0;
        int bitBufferLength = 0;
        int readChars = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
        int bitBuffer = 0;
        int bitBufferLength = 0;
        int readChars = 0;
        boolean hitPadding = false;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
        int bitBuffer = 0;
        int bitBufferLength = 0;
        int writtenChars = 0;

        @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
      return new OutputStream() {
        int bitBuffer = 0;
        int bitBufferLength = 0;
        int writtenChars = 0;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
        int bitBufferLength = 0;
        int readChars = 0;
        boolean hitPadding = false;

        @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
      checkNotNull(out);
      return new OutputStream() {
        int bitBuffer = 0;
        int bitBufferLength = 0;
        int writtenChars = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
      return new InputStream() {
        int bitBuffer = 0;
        int bitBufferLength = 0;
        int readChars = 0;
        boolean hitPadding = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
    @ParametricNullness private final K key;
    @VisibleForTesting @Nullable ValueEntry<K, V>[] hashTable;
    private int size = 0;
    private int modCount = 0;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
    @VisibleForTesting @Nullable ValueEntry<K, V>[] hashTable;
    private int size = 0;
    private int modCount = 0;

    // We use the set object itself as the end of the linked list, avoiding an unnecessary
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      extends AbstractWeakKeyEntry<K, V, WeakKeyStrongValueEntry<K, V>>
      implements StrongValueEntry<K, V, WeakKeyStrongValueEntry<K, V>> {
    @CheckForNull private volatile V value = null;

    private WeakKeyStrongValueEntry(ReferenceQueue<K> queue, K key, int hash) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      extends AbstractStrongKeyEntry<K, V, StrongKeyStrongValueEntry<K, V>>
      implements StrongValueEntry<K, V, StrongKeyStrongValueEntry<K, V>> {
    @CheckForNull private volatile V value = null;

    private StrongKeyStrongValueEntry(K key, int hash) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `guava/src/com/google/common/util/concurrent/ThreadFactoryBuilder.java`
#### Snippet
```java
  @CheckForNull private Boolean daemon = null;
  @CheckForNull private Integer priority = null;
  @CheckForNull private UncaughtExceptionHandler uncaughtExceptionHandler = null;
  @CheckForNull private ThreadFactory backingThreadFactory = null;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `guava/src/com/google/common/util/concurrent/ThreadFactoryBuilder.java`
#### Snippet
```java
  @CheckForNull private String nameFormat = null;
  @CheckForNull private Boolean daemon = null;
  @CheckForNull private Integer priority = null;
  @CheckForNull private UncaughtExceptionHandler uncaughtExceptionHandler = null;
  @CheckForNull private ThreadFactory backingThreadFactory = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `guava/src/com/google/common/util/concurrent/ThreadFactoryBuilder.java`
#### Snippet
```java
@ElementTypesAreNonnullByDefault
public final class ThreadFactoryBuilder {
  @CheckForNull private String nameFormat = null;
  @CheckForNull private Boolean daemon = null;
  @CheckForNull private Integer priority = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `guava/src/com/google/common/util/concurrent/ThreadFactoryBuilder.java`
#### Snippet
```java
public final class ThreadFactoryBuilder {
  @CheckForNull private String nameFormat = null;
  @CheckForNull private Boolean daemon = null;
  @CheckForNull private Integer priority = null;
  @CheckForNull private UncaughtExceptionHandler uncaughtExceptionHandler = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `guava/src/com/google/common/util/concurrent/ThreadFactoryBuilder.java`
#### Snippet
```java
  @CheckForNull private Integer priority = null;
  @CheckForNull private UncaughtExceptionHandler uncaughtExceptionHandler = null;
  @CheckForNull private ThreadFactory backingThreadFactory = null;

  /** Creates a new {@link ThreadFactory} builder. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/util/concurrent/Monitor.java`
#### Snippet
```java

    @GuardedBy("monitor.lock")
    int waiterCount = 0;

    /** The next active guard */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `guava/src/com/google/common/util/concurrent/Monitor.java`
#### Snippet
```java
  @GuardedBy("lock")
  @CheckForNull
  private Guard activeGuards = null;

  /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `guava/src/com/google/common/collect/CollectSpliterators.java`
#### Snippet
```java
    checkNotNull(predicate);
    class Splitr implements Spliterator<T>, Consumer<T> {
      @CheckForNull T holder = null;

      @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  public static <T> java.util.Optional<T> findLast(Stream<T> stream) {
    class OptionalState {
      boolean set = false;
      @CheckForNull T value = null;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
                  fromSpliterator.estimateSize(),
                  fromSpliterator.characteristics() & (Spliterator.ORDERED | Spliterator.SIZED)) {
                long index = 0;

                @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
    class OptionalState {
      boolean set = false;
      @CheckForNull T value = null;

      void set(T value) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
                  fromSpliterator.estimateSize(),
                  fromSpliterator.characteristics() & (Spliterator.ORDERED | Spliterator.SIZED)) {
                long index = 0;

                @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
                  fromSpliterator.estimateSize(),
                  fromSpliterator.characteristics() & (Spliterator.ORDERED | Spliterator.SIZED)) {
                long index = 0;

                @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
                  fromSpliterator.estimateSize(),
                  fromSpliterator.characteristics() & (Spliterator.ORDERED | Spliterator.SIZED)) {
                long index = 0;

                @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0.0` is redundant
in `guava/src/com/google/common/math/PairedStatsAccumulator.java`
#### Snippet
```java
  private final StatsAccumulator xStats = new StatsAccumulator();
  private final StatsAccumulator yStats = new StatsAccumulator();
  private double sumOfProductsOfDeltas = 0.0;

  /** Adds the given pair of values to the dataset. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0.0` is redundant
in `guava/src/com/google/common/math/StatsAccumulator.java`
#### Snippet
```java
  private long count = 0;
  private double mean = 0.0; // any finite value will do, we only use it to multiply by zero for sum
  private double sumOfSquaresOfDeltas = 0.0;
  private double min = NaN; // any value will do
  private double max = NaN; // any value will do
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0.0` is redundant
in `guava/src/com/google/common/math/StatsAccumulator.java`
#### Snippet
```java
  // methods of this class.
  private long count = 0;
  private double mean = 0.0; // any finite value will do, we only use it to multiply by zero for sum
  private double sumOfSquaresOfDeltas = 0.0;
  private double min = NaN; // any value will do
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/math/StatsAccumulator.java`
#### Snippet
```java
  // These fields must satisfy the requirements of Stats' constructor as well as those of the stat
  // methods of this class.
  private long count = 0;
  private double mean = 0.0; // any finite value will do, we only use it to multiply by zero for sum
  private double sumOfSquaresOfDeltas = 0.0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `guava/src/com/google/common/util/concurrent/MoreExecutors.java`
#### Snippet
```java

    @GuardedBy("lock")
    private boolean shutdown = false;

    @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/util/concurrent/MoreExecutors.java`
#### Snippet
```java
     */
    @GuardedBy("lock")
    private int runningTasks = 0;

    @GuardedBy("lock")
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/net/MediaType.java`
#### Snippet
```java
  private static final class Tokenizer {
    final String input;
    int position = 0;

    Tokenizer(String input) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/util/concurrent/SequentialExecutor.java`
#### Snippet
```java
   */
  @GuardedBy("queue")
  private long workerRunCount = 0;

  @RetainedWith private final QueueWorker worker = new QueueWorker();
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
  abstract class Itr<T extends @Nullable Object> implements Iterator<T> {
    @CheckForNull BiEntry<K, V> next = firstInKeyInsertionOrder;
    @CheckForNull BiEntry<K, V> toRemove = null;
    int expectedModCount = modCount;
    int remaining = size();
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `guava/src/com/google/common/util/concurrent/AggregateFutureState.java`
#### Snippet
```java
  // Lazily initialized the first time we see an exception; not released until all the input futures
  // have completed and we have processed them all.
  @CheckForNull private volatile Set<Throwable> seenExceptions = null;

  private volatile int remaining;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `guava/src/com/google/common/collect/CollectCollectors.java`
#### Snippet
```java
  private static class EnumMapAccumulator<K extends Enum<K>, V> {
    private final BinaryOperator<V> mergeFunction;
    @CheckForNull private EnumMap<K, V> map = null;

    EnumMapAccumulator(BinaryOperator<V> mergeFunction) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `guava/src/com/google/common/graph/EndpointPairIterator.java`
#### Snippet
```java

  @CheckForNull
  N node = null; // null is safe as an initial value because graphs don't allow null nodes

  Iterator<N> successorIterator = ImmutableSet.<N>of().iterator();
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
  private static <I extends Iterator<?>> Iterator<I> consumingForArray(@Nullable I... elements) {
    return new UnmodifiableIterator<I>() {
      int index = 0;

      @Override
```

## RuleId[ruleID=EqualsAndHashcode]
### RuleId[ruleID=EqualsAndHashcode]
Class has `hashCode()` defined but does not define `equals()`
in `guava/src/com/google/common/collect/SingletonImmutableSet.java`
#### Snippet
```java
@SuppressWarnings("serial") // uses writeReplace(), not default serialization
@ElementTypesAreNonnullByDefault
final class SingletonImmutableSet<E> extends ImmutableSet<E> {
  // We deliberately avoid caching the asList and hashCode here, to ensure that with
  // compressed oops, a SingletonImmutableSet packs all the way down to the optimal 16 bytes.
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `hashCode()` defined but does not define `equals()`
in `guava/src/com/google/common/collect/RegularImmutableMultiset.java`
#### Snippet
```java
@SuppressWarnings("serial") // uses writeReplace(), not default serialization
@ElementTypesAreNonnullByDefault
class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
  private static final ImmutableEntry<?>[] EMPTY_ARRAY = new ImmutableEntry<?>[0];
  static final ImmutableMultiset<Object> EMPTY = create(ImmutableList.<Entry<Object>>of());
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `hashCode()` defined but does not define `equals()`
in `guava/src/com/google/common/collect/ImmutableMapEntrySet.java`
#### Snippet
```java
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet.CachingAsList<Entry<K, V>> {
  static final class RegularEntrySet<K, V> extends ImmutableMapEntrySet<K, V> {
    private final transient ImmutableMap<K, V> map;
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `hashCode()` defined but does not define `equals()`
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java
  }

  private static final class BelowValue<C extends Comparable> extends Cut<C> {
    BelowValue(C endpoint) {
      super(checkNotNull(endpoint));
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class Cut<C extends Comparable> implements Comparable<Cut<C>>, Serializable {
  final C endpoint;

```

### RuleId[ruleID=EqualsAndHashcode]
Class has `hashCode()` defined but does not define `equals()`
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java
  }

  private static final class AboveAll extends Cut<Comparable<?>> {
    private static final AboveAll INSTANCE = new AboveAll();

```

### RuleId[ruleID=EqualsAndHashcode]
Class has `hashCode()` defined but does not define `equals()`
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java
  private static final long serialVersionUID = 0;

  private static final class BelowAll extends Cut<Comparable<?>> {
    private static final BelowAll INSTANCE = new BelowAll();

```

### RuleId[ruleID=EqualsAndHashcode]
Class has `hashCode()` defined but does not define `equals()`
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java
  }

  private static final class AboveValue<C extends Comparable> extends Cut<C> {
    AboveValue(C endpoint) {
      super(checkNotNull(endpoint));
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `guava/src/com/google/common/collect/AbstractSetMultimap.java`
#### Snippet
```java
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractSetMultimap<K extends @Nullable Object, V extends @Nullable Object>
    extends AbstractMapBasedMultimap<K, V> implements SetMultimap<K, V> {
  /**
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `hashCode()` defined but does not define `equals()`
in `guava/src/com/google/common/collect/RegularImmutableSet.java`
#### Snippet
```java
@SuppressWarnings("serial") // uses writeReplace(), not default serialization
@ElementTypesAreNonnullByDefault
final class RegularImmutableSet<E> extends ImmutableSet.CachingAsList<E> {
  private static final Object[] EMPTY_ARRAY = new Object[0];
  static final RegularImmutableSet<Object> EMPTY =
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `hashCode()` defined but does not define `equals()`
in `guava/src/com/google/common/collect/RegularImmutableBiMap.java`
#### Snippet
```java
@SuppressWarnings("serial") // uses writeReplace(), not default serialization
@ElementTypesAreNonnullByDefault
class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
  static final RegularImmutableBiMap<Object, Object> EMPTY =
      new RegularImmutableBiMap<>(
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `hashCode()` defined but does not define `equals()`
in `guava/src/com/google/common/collect/RegularImmutableBiMap.java`
#### Snippet
```java
    }

    final class InverseEntrySet extends ImmutableMapEntrySet<V, K> {
      @Override
      ImmutableMap<V, K> map() {
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `guava/src/com/google/common/collect/RegularImmutableSortedSet.java`
#### Snippet
```java
@SuppressWarnings({"serial", "rawtypes"})
@ElementTypesAreNonnullByDefault
final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {
  static final RegularImmutableSortedSet<Comparable> NATURAL_EMPTY_SET =
      new RegularImmutableSortedSet<>(ImmutableList.<Comparable>of(), Ordering.natural());
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `guava/src/com/google/common/base/Converter.java`
#### Snippet
```java
 * [*] In annotating this class, we're ignoring LegacyConverter.
 */
public abstract class Converter<A, B> implements Function<A, B> {
  private final boolean handleNullAutomatically;

```

### RuleId[ruleID=EqualsAndHashcode]
Class has `hashCode()` defined but does not define `equals()`
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java

  @WeakOuter
  private final class EntrySet extends IndexedImmutableSet<Entry<E>> {
    @Override
    boolean isPartialView() {
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `guava/src/com/google/common/collect/ImmutableEnumMap.java`
#### Snippet
```java
@SuppressWarnings("serial") // we're overriding default serialization
@ElementTypesAreNonnullByDefault
final class ImmutableEnumMap<K extends Enum<K>, V> extends IteratorBasedImmutableMap<K, V> {
  static <K extends Enum<K>, V> ImmutableMap<K, V> asImmutable(EnumMap<K, V> map) {
    switch (map.size()) {
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `guava/src/com/google/common/collect/AbstractListMultimap.java`
#### Snippet
```java
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractListMultimap<K extends @Nullable Object, V extends @Nullable Object>
    extends AbstractMapBasedMultimap<K, V> implements ListMultimap<K, V> {
  /**
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
  }

  private static class SynchronizedAsMapEntries<
          K extends @Nullable Object, V extends @Nullable Object>
      extends SynchronizedSet<Map.Entry<K, Collection<V>>> {
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java

    Entry<C, V> wrapEntry(final Entry<C, V> entry) {
      return new ForwardingMapEntry<C, V>() {
        @Override
        protected Entry<C, V> delegate() {
          return entry;
        }

        @Override
        public V setValue(V value) {
          return super.setValue(checkNotNull(value));
        }

        @Override
        public boolean equals(@CheckForNull Object object) {
          // TODO(lowasser): identify why this affects GWT tests
          return standardEquals(object);
        }
      };
    }
  }
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `hashCode()` defined but does not define `equals()`
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java

  @WeakOuter
  private final class MapViewOfValuesAsSingletonSets
      extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {

```

### RuleId[ruleID=EqualsAndHashcode]
Class has `hashCode()` defined but does not define `equals()`
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java

  /** @see Multimaps#forMap */
  private static class MapMultimap<K extends @Nullable Object, V extends @Nullable Object>
      extends AbstractMultimap<K, V> implements SetMultimap<K, V>, Serializable {
    final Map<K, V> map;
```

## RuleId[ruleID=PointlessBitwiseExpression]
### RuleId[ruleID=PointlessBitwiseExpression]
`~~(x - y)` can be replaced with '(x - y)'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    // The double negation is optimized away by normal Java, but is necessary for GWT
    // to make sure bit twiddling works as expected.
    return ~~(x - y) >>> (Integer.SIZE - 1);
  }

```

### RuleId[ruleID=PointlessBitwiseExpression]
`~~hashCode` can be replaced with 'hashCode'
in `guava/src/com/google/common/collect/Lists.java`
#### Snippet
```java
      hashCode = 31 * hashCode + (o == null ? 0 : o.hashCode());

      hashCode = ~~hashCode;
      // needed to deal with GWT integer overflow
    }
```

### RuleId[ruleID=PointlessBitwiseExpression]
`~~(x - y)` can be replaced with '(x - y)'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
  static int lessThanBranchFree(long x, long y) {
    // Returns the sign bit of x - y.
    return (int) (~~(x - y) >>> (Long.SIZE - 1));
  }

```

### RuleId[ruleID=PointlessBitwiseExpression]
`~(stride - 1)` can be replaced with '-stride'
in `guava/src/com/google/common/primitives/UnsignedBytes.java`
#### Snippet
```java
        int stride = 8;
        int minLength = Math.min(left.length, right.length);
        int strideLimit = minLength & ~(stride - 1);
        int i;

```

### RuleId[ruleID=PointlessBitwiseExpression]
`~~hashCode` can be replaced with 'hashCode'
in `guava/src/com/google/common/collect/ImmutableList.java`
#### Snippet
```java
      hashCode = 31 * hashCode + get(i).hashCode();

      hashCode = ~~hashCode;
      // needed to deal with GWT integer overflow
    }
```

### RuleId[ruleID=PointlessBitwiseExpression]
`value & 0xffffffff` can be replaced with 'value'
in `guava/src/com/google/common/primitives/UnsignedInteger.java`
#### Snippet
```java
  private UnsignedInteger(int value) {
    // GWT doesn't consistently overflow values to make them 32-bit, so we need to force it.
    this.value = value & 0xffffffff;
  }

```

### RuleId[ruleID=PointlessBitwiseExpression]
`~~(index + 1)` can be replaced with '(index + 1)'
in `guava/src/com/google/common/collect/MinMaxPriorityQueue.java`
#### Snippet
```java
  @VisibleForTesting
  static boolean isEvenLevel(int index) {
    int oneBased = ~~(index + 1); // for GWT
    checkState(oneBased > 0, "negative index");
    return (oneBased & EVEN_POWERS_OF_TWO) > (oneBased & ODD_POWERS_OF_TWO);
```

### RuleId[ruleID=PointlessBitwiseExpression]
`~~adjust` can be replaced with 'adjust'
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
      for (int i = 0; i < axes.size(); i++) {
        adjust *= 31;
        adjust = ~~adjust;
        // in GWT, we have to deal with integer overflow carefully
      }
```

### RuleId[ruleID=PointlessBitwiseExpression]
`~~hash` can be replaced with 'hash'
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
        hash = 31 * hash + (size() / axis.size() * axis.hashCode());

        hash = ~~hash;
      }
      hash += adjust;
```

### RuleId[ruleID=PointlessBitwiseExpression]
`~~hash` can be replaced with 'hash'
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
      }
      hash += adjust;
      return ~~hash;
    }
  }
```

### RuleId[ruleID=PointlessBitwiseExpression]
`~~hashCode` can be replaced with 'hashCode'
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
      hashCode += o != null ? o.hashCode() : 0;

      hashCode = ~~hashCode;
      // Needed to deal with unusual integer overflow in GWT.
    }
```

## RuleId[ruleID=RedundantImplements]
### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `guava/src/com/google/common/hash/Funnels.java`
#### Snippet
```java
  }

  private static class StringCharsetFunnel implements Funnel<CharSequence>, Serializable {
    private final Charset charset;

```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `guava/src/com/google/common/hash/Funnels.java`
#### Snippet
```java

  private static class SequentialFunnel<E extends @Nullable Object>
      implements Funnel<Iterable<? extends E>>, Serializable {
    private final Funnel<E> elementFunnel;

```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `guava/src/com/google/common/collect/Range.java`
#### Snippet
```java
@ElementTypesAreNonnullByDefault
public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies
    implements Predicate<C>, Serializable {

  static class LowerBoundFn implements Function<Range, Cut> {
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `guava/src/com/google/common/primitives/UnsignedLong.java`
#### Snippet
```java
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
public final class UnsignedLong extends Number implements Comparable<UnsignedLong>, Serializable {

  private static final long UNSIGNED_MASK = 0x7fffffffffffffffL;
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `guava/src/com/google/common/cache/LongAdder.java`
#### Snippet
```java
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
final class LongAdder extends Striped64 implements Serializable, LongAddable {
  private static final long serialVersionUID = 7249069246863182397L;

```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Spliterator`
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
    }
    class Splitr extends MapWithIndexSpliterator<Spliterator.OfLong, R, Splitr>
        implements LongConsumer, Spliterator<R> {
      long holder;

```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Spliterator`
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
    }
    class Splitr extends MapWithIndexSpliterator<Spliterator.OfDouble, R, Splitr>
        implements DoubleConsumer, Spliterator<R> {
      double holder;

```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Spliterator`
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
    }
    class Splitr extends MapWithIndexSpliterator<Spliterator.OfInt, R, Splitr>
        implements IntConsumer, Spliterator<R> {
      int holder;

```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `guava/src/com/google/common/hash/LongAdder.java`
#### Snippet
```java
 */
@ElementTypesAreNonnullByDefault
final class LongAdder extends Striped64 implements Serializable, LongAddable {
  private static final long serialVersionUID = 7249069246863182397L;

```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
   */
  static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V>
      implements LoadingCache<K, V>, Serializable {
    private static final long serialVersionUID = 1;

```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `java.io.Serializable`
in `guava/src/com/google/common/util/concurrent/AtomicDouble.java`
#### Snippet
```java
@ReflectionSupport(value = ReflectionSupport.Level.FULL)
@ElementTypesAreNonnullByDefault
public class AtomicDouble extends Number implements java.io.Serializable {
  private static final long serialVersionUID = 0L;

```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
  @VisibleForTesting
  static class SynchronizedBiMap<K extends @Nullable Object, V extends @Nullable Object>
      extends SynchronizedMap<K, V> implements BiMap<K, V>, Serializable {
    @CheckForNull private transient Set<V> valueSet;
    @RetainedWith @CheckForNull private transient BiMap<V, K> inverse;
```

## RuleId[ruleID=InstanceofCatchParameter]
### RuleId[ruleID=InstanceofCatchParameter]
'instanceof' on 'catch' parameter `t`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      } catch (Throwable t) {
        ListenableFuture<V> result = setException(t) ? futureValue : fullyFailedFuture(t);
        if (t instanceof InterruptedException) {
          Thread.currentThread().interrupt();
        }
```

### RuleId[ruleID=InstanceofCatchParameter]
'instanceof' on 'catch' parameter `t`
in `guava/src/com/google/common/util/concurrent/SequentialExecutor.java`
#### Snippet
```java
        // If the delegate is directExecutor(), the submitted runnable could have thrown a REE. But
        // that's handled by the log check that catches RuntimeExceptions in the queue worker.
        if (!(t instanceof RejectedExecutionException) || removed) {
          throw t;
        }
```

## RuleId[ruleID=ExceptionNameDoesntEndWithException]
### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `ExampleStackTrace` does not end with 'Exception'
in `guava/src/com/google/common/util/concurrent/CycleDetectingLockFactory.java`
#### Snippet
```java
   * </pre>
   */
  private static class ExampleStackTrace extends IllegalStateException {

    static final StackTraceElement[] EMPTY_STACK_TRACE = new StackTraceElement[0];
```

## RuleId[ruleID=ArrayEquality]
### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `guava/src/com/google/common/collect/RegularImmutableMap.java`
#### Snippet
```java
        // Make sure we are not overwriting the original entries array, in case we later do
        // buildOrThrow(). We would want an exception to include two values for the duplicate key.
        if (entries == entryArray) {
          entries = entries.clone();
        }
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `!=`, not 'Arrays.equals()'
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
        wasUncontended = true; // Continue after rehash
        else if (a.cas(v = a.value, fn(v, x))) break;
        else if (n >= NCPU || cells != as) collide = false; // At max size or stale
        else if (!collide) collide = true;
        else if (busy == 0 && casBusy()) {
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
        else if (busy == 0 && casBusy()) {
          try {
            if (cells == as) { // Expand table unless stale
              Cell[] rs = new Cell[n << 1];
              for (int i = 0; i < n; ++i) rs[i] = as[i];
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
        h ^= h << 5;
        hc[0] = h; // Record index for next time
      } else if (busy == 0 && cells == as && casBusy()) {
        boolean init = false;
        try { // Initialize table
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
        boolean init = false;
        try { // Initialize table
          if (cells == as) {
            Cell[] rs = new Cell[2];
            rs[h & 1] = new Cell(x);
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `!=`, not 'Arrays.equals()'
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
        wasUncontended = true; // Continue after rehash
        else if (a.cas(v = a.value, fn(v, x))) break;
        else if (n >= NCPU || cells != as) collide = false; // At max size or stale
        else if (!collide) collide = true;
        else if (busy == 0 && casBusy()) {
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
        else if (busy == 0 && casBusy()) {
          try {
            if (cells == as) { // Expand table unless stale
              Cell[] rs = new Cell[n << 1];
              for (int i = 0; i < n; ++i) rs[i] = as[i];
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
        h ^= h << 5;
        hc[0] = h; // Record index for next time
      } else if (busy == 0 && cells == as && casBusy()) {
        boolean init = false;
        try { // Initialize table
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
        boolean init = false;
        try { // Initialize table
          if (cells == as) {
            Cell[] rs = new Cell[2];
            rs[h & 1] = new Cell(x);
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/hash/Hashing.java`
#### Snippet
```java
    }
    checkArgument(!list.isEmpty(), "number of hash functions (%s) must be > 0", list.size());
    return new ConcatenatedHashFunction(list.toArray(new HashFunction[0]));
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/hash/Hashing.java`
#### Snippet
```java
    list.add(second);
    Collections.addAll(list, rest);
    return new ConcatenatedHashFunction(list.toArray(new HashFunction[0]));
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/collect/CompactHashSet.java`
#### Snippet
```java
  public @Nullable Object[] toArray() {
    if (needsAllocArrays()) {
      return new Object[0];
    }
    Set<E> delegate = delegateOrNull();
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/collect/CompactHashSet.java`
#### Snippet
```java
  public Spliterator<E> spliterator() {
    if (needsAllocArrays()) {
      return Spliterators.spliterator(new Object[0], Spliterator.DISTINCT | Spliterator.ORDERED);
    }
    Set<E> delegate = delegateOrNull();
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
    public Spliterator<V> spliterator() {
      if (needsAllocArrays()) {
        return Spliterators.spliterator(new Object[0], Spliterator.ORDERED);
      }
      Map<K, V> delegate = delegateOrNull();
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
    public @Nullable Object[] toArray() {
      if (needsAllocArrays()) {
        return new Object[0];
      }
      Map<K, V> delegate = delegateOrNull();
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
    public Spliterator<K> spliterator() {
      if (needsAllocArrays()) {
        return Spliterators.spliterator(new Object[0], Spliterator.DISTINCT | Spliterator.ORDERED);
      }
      Map<K, V> delegate = delegateOrNull();
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
    public @Nullable Object[] toArray() {
      if (needsAllocArrays()) {
        return new Object[0];
      }
      Map<K, V> delegate = delegateOrNull();
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/io/ByteSource.java`
#### Snippet
```java

    EmptyByteSource() {
      super(new byte[0]);
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/io/ByteSource.java`
#### Snippet
```java
          // offset was beyond EOF
          in.close();
          return new ByteArrayInputStream(new byte[0]);
        }
      }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/util/concurrent/Futures.java`
#### Snippet
```java
      collection = ImmutableList.copyOf(futures);
    }
    return (ListenableFuture<? extends T>[]) collection.toArray(new ListenableFuture<?>[0]);
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
  @Beta
  public static <E> ImmutableMultiset<E> copyHighestCountFirst(Multiset<E> multiset) {
    Entry<E>[] entries = (Entry<E>[]) multiset.entrySet().toArray(new Entry[0]);
    Arrays.sort(entries, DecreasingCount.INSTANCE);
    return ImmutableMultiset.copyFromEntries(Arrays.asList(entries));
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/io/ByteStreams.java`
#### Snippet
```java
  private static byte[] combineBuffers(Queue<byte[]> bufs, int totalLen) {
    if (bufs.isEmpty()) {
      return new byte[0];
    }
    byte[] result = bufs.remove();
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/util/concurrent/TimeoutFuture.java`
#### Snippet
```java
    @Override
    public synchronized Throwable fillInStackTrace() {
      setStackTrace(new StackTraceElement[0]);
      return this; // no stack trace, wouldn't be useful anyway
    }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/reflect/Parameter.java`
#### Snippet
```java
  @Override
  public Annotation[] getDeclaredAnnotations() {
    return annotations.toArray(new Annotation[0]);
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/collect/CompoundOrdering.java`
#### Snippet
```java

  CompoundOrdering(Iterable<? extends Comparator<? super T>> comparators) {
    this.comparators = Iterables.toArray(comparators, new Comparator[0]);
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/collect/ImmutableList.java`
#### Snippet
```java
  public static <E extends Comparable<? super E>> ImmutableList<E> sortedCopyOf(
      Iterable<? extends E> elements) {
    Comparable<?>[] array = Iterables.toArray(elements, new Comparable<?>[0]);
    checkElementsNotNull((Object[]) array);
    Arrays.sort(array);
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/collect/JdkBackedImmutableMultiset.java`
#### Snippet
```java
  static <E> ImmutableMultiset<E> create(Collection<? extends Entry<? extends E>> entries) {
    @SuppressWarnings("unchecked")
    Entry<E>[] entriesArray = entries.toArray(new Entry[0]);
    Map<E, Integer> delegateMap = Maps.newHashMapWithExpectedSize(entriesArray.length);
    long size = 0;
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/collect/CollectCollectors.java`
#### Snippet
```java
        ImmutableBiMap.Builder::combine,
        ImmutableBiMap.Builder::build,
        new Collector.Characteristics[0]);
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/collect/ObjectArrays.java`
#### Snippet
```java
    checkPositionIndexes(offset, offset + length, elements.length);
    if (length == 0) {
      return new Object[0];
    }
    @Nullable Object[] result = new Object[length];
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/reflect/TypeResolver.java`
#### Snippet
```java
            combined.remove(Object.class);
          }
          return super.captureAsTypeVariable(combined.toArray(new Type[0]));
        }
      };
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/reflect/Types.java`
#### Snippet
```java

  private static Type[] toArray(Collection<Type> types) {
    return types.toArray(new Type[0]);
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/reflect/Types.java`
#### Snippet
```java
  @VisibleForTesting
  static WildcardType subtypeOf(Type upperBound) {
    return new WildcardTypeImpl(new Type[0], new Type[] {upperBound});
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java
      }
    }
    return new Types.WildcardTypeImpl(type.getLowerBounds(), upperBounds.toArray(new Type[0]));
  }

```

## RuleId[ruleID=SynchronizeOnThis]
### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `guava/src/com/google/common/util/concurrent/RateLimiter.java`
#### Snippet
```java
    Object mutex = mutexDoNotUseDirectly;
    if (mutex == null) {
      synchronized (this) {
        mutex = mutexDoNotUseDirectly;
        if (mutex == null) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `guava/src/com/google/common/util/concurrent/ListenerCallQueue.java`
#### Snippet
```java
          ListenerCallQueue.Event<L> nextToRun;
          Object nextLabel;
          synchronized (PerListenerQueue.this) {
            Preconditions.checkState(isThreadScheduled);
            nextToRun = waitQueue.poll();
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `guava/src/com/google/common/util/concurrent/ListenerCallQueue.java`
#### Snippet
```java
          // An Error is bubbling up. We should mark ourselves as no longer running. That way, if
          // anyone tries to keep using us, we won't be corrupted.
          synchronized (PerListenerQueue.this) {
            isThreadScheduled = false;
          }
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `guava/src/com/google/common/util/concurrent/ListenerCallQueue.java`
#### Snippet
```java
    void dispatch() {
      boolean scheduleEventRunner = false;
      synchronized (this) {
        if (!isThreadScheduled) {
          isThreadScheduled = true;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `guava/src/com/google/common/util/concurrent/ListenerCallQueue.java`
#### Snippet
```java
        } catch (RuntimeException e) {
          // reset state in case of an error so that later dispatch calls will actually do something
          synchronized (this) {
            isThreadScheduled = false;
          }
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `guava/src/com/google/common/util/concurrent/ExecutionList.java`
#### Snippet
```java
    // before we start to run them.
    RunnableExecutorPair list;
    synchronized (this) {
      if (executed) {
        return;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `guava/src/com/google/common/util/concurrent/ExecutionList.java`
#### Snippet
```java
    // another thread can't run the list out from under us. We only add to the list if we have not
    // yet started execution.
    synchronized (this) {
      if (!executed) {
        runnables = new RunnableExecutorPair(runnable, executor, runnables);
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `guava/src/com/google/common/eventbus/Subscriber.java`
#### Snippet
```java
    @Override
    void invokeSubscriberMethod(Object event) throws InvocationTargetException {
      synchronized (this) {
        super.invokeSubscriberMethod(event);
      }
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
        return new CountDownLatch(0);
      }
      synchronized (this) {
        if (closed) {
          return new CountDownLatch(0);
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
        return;
      }
      synchronized (this) {
        if (!closed) {
          put(closeable, executor);
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
        return;
      }
      synchronized (this) {
        if (closed) {
          return;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
      // A 2-field variant of Double Checked Locking.
      if (!initialized) {
        synchronized (this) {
          if (!initialized) {
            /*
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
      // A 2-field variant of Double Checked Locking.
      if (!initialized) {
        synchronized (this) {
          if (!initialized) {
            T t = delegate.get();
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
      long now = Platform.systemNanoTime();
      if (nanos == 0 || now - nanos >= 0) {
        synchronized (this) {
          if (nanos == expirationNanos) { // recheck for lost race
            T t = delegate.get();
```

## RuleId[ruleID=NullArgumentToVariableArgMethod]
### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `elements`, unclear if a varargs or non-varargs call is desired
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
    @Override
    public Builder<E> add(E... elements) {
      checkElementsNotNull(elements);
      for (E e : elements) {
        add(e);
```

### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `elements.clone()`, unclear if a varargs or non-varargs call is desired
in `guava/src/com/google/common/collect/ImmutableSet.java`
#### Snippet
```java
        return of(elements[0]);
      default:
        return constructUnknownDuplication(elements.length, elements.clone());
    }
  }
```

### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `array`, unclear if a varargs or non-varargs call is desired
in `guava/src/com/google/common/collect/ImmutableList.java`
#### Snippet
```java
    @SuppressWarnings("unchecked") // all supported methods are covariant
    E[] array = (E[]) Iterables.toArray(elements);
    checkElementsNotNull(array);
    Arrays.sort(array, comparator);
    return asImmutableList(array);
```

### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `elements.clone()`, unclear if a varargs or non-varargs call is desired
in `guava/src/com/google/common/collect/ImmutableList.java`
#### Snippet
```java
        return of(elements[0]);
      default:
        return construct(elements.clone());
    }
  }
```

### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `elements`, unclear if a varargs or non-varargs call is desired
in `guava/src/com/google/common/collect/ImmutableList.java`
#### Snippet
```java
    @Override
    public Builder<E> add(E... elements) {
      checkElementsNotNull(elements);
      add(elements, elements.length);
      return this;
```

## RuleId[ruleID=CastConflictsWithInstanceof]
### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'AbstractFuture' type conflicts with preceding 'instanceof Trusted' check
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
      // and unpacking the exceptions like we do below (just much faster because it is a single
      // field read instead of a read, several branches and possibly creating exceptions).
      Object v = ((AbstractFuture<?>) future).value;
      if (v instanceof Cancellation) {
        // If the other future was interrupted, clear the interrupted bit while preserving the cause
```

### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'AbstractFuture' type conflicts with preceding 'instanceof Trusted' check
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
              // We can only do this for TrustedFuture, because TrustedFuture.cancel is final and
              // does nothing but delegate to this method.
              AbstractFuture<?> trusted = (AbstractFuture<?>) futureToPropagateTo;
              localValue = trusted.value;
              if (localValue == null | localValue instanceof SetFuture) {
```

## RuleId[ruleID=UnstableTypeUsedInSignature]
### RuleId[ruleID=UnstableTypeUsedInSignature]
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.hash.Hasher'
in `guava/src/com/google/common/hash/HashFunction.java`
#### Snippet
```java
   * functions that need to buffer their whole input before processing any of it).
   */
  Hasher newHasher(int expectedInputSize);

  /**
```

### RuleId[ruleID=UnstableTypeUsedInSignature]
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.hash.Hasher'
in `guava/src/com/google/common/hash/HashFunction.java`
#### Snippet
```java
   * }</pre>
   */
  Hasher newHasher();

  /**
```

### RuleId[ruleID=UnstableTypeUsedInSignature]
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.hash.Funnel'
in `guava/src/com/google/common/hash/HashFunction.java`
#### Snippet
```java
   * @since 14.0
   */
  <T extends @Nullable Object> HashCode hashObject(
      @ParametricNullness T instance, Funnel<? super T> funnel);

```

### RuleId[ruleID=UnstableTypeUsedInSignature]
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.io.LineProcessor'
in `guava/src/com/google/common/io/Resources.java`
#### Snippet
```java
  @CanIgnoreReturnValue // some processors won't return a useful result
  @ParametricNullness
  public static <T extends @Nullable Object> T readLines(
      URL url, Charset charset, LineProcessor<T> callback) throws IOException {
    return asCharSource(url, charset).readLines(callback);
```

### RuleId[ruleID=UnstableTypeUsedInSignature]
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.io.LineProcessor'
in `guava/src/com/google/common/io/Files.java`
#### Snippet
```java
  @ParametricNullness
  public
  static <T extends @Nullable Object> T readLines(
      File file, Charset charset, LineProcessor<T> callback) throws IOException {
    return asCharSource(file, charset).readLines(callback);
```

### RuleId[ruleID=UnstableTypeUsedInSignature]
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.io.ByteProcessor'
in `guava/src/com/google/common/io/Files.java`
#### Snippet
```java
  @ParametricNullness
  public
  static <T extends @Nullable Object> T readBytes(File file, ByteProcessor<T> processor)
      throws IOException {
    return asByteSource(file).read(processor);
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
Variable `unsafe` initializer `null` is redundant
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java

    static {
      sun.misc.Unsafe unsafe = null;
      try {
        unsafe = sun.misc.Unsafe.getUnsafe();
```

### RuleId[ruleID=UnusedAssignment]
The value `null` assigned to `future` is never used
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
      // push the current set of listeners onto next
      next = future.clearListeners(next);
      future = null;
      while (next != null) {
        Listener curr = next;
```

### RuleId[ruleID=UnusedAssignment]
The value `new KeyList<>(node)` assigned to `keyList` is never used
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
      KeyList<K, V> keyList = keyToKeyList.get(key);
      if (keyList == null) {
        keyToKeyList.put(key, keyList = new KeyList<>(node));
        modCount++;
      } else {
```

### RuleId[ruleID=UnusedAssignment]
Variable `addressAsLong` initializer `0` is redundant
in `guava/src/com/google/common/net/InetAddresses.java`
#### Snippet
```java

    Inet6Address ip6 = (Inet6Address) ip;
    long addressAsLong = 0;
    if (hasEmbeddedIPv4ClientAddress(ip6)) {
      addressAsLong = getEmbeddedIPv4ClientAddress(ip6).hashCode();
```

### RuleId[ruleID=UnusedAssignment]
Variable `valueSetCapacity` initializer `DEFAULT_VALUE_SET_CAPACITY` is redundant
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
  @VisibleForTesting static final double VALUE_SET_LOAD_FACTOR = 1.0;

  @VisibleForTesting transient int valueSetCapacity = DEFAULT_VALUE_SET_CAPACITY;
  private transient ValueEntry<K, V> multimapHeaderEntry;

```

### RuleId[ruleID=UnusedAssignment]
Variable `newCount` initializer `this.count - 1` is redundant
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
            if (entryValue == null) {
              if (isCollected(e)) {
                int newCount = this.count - 1;
                ++modCount;
                E newFirst = removeFromChain(first, e);
```

### RuleId[ruleID=UnusedAssignment]
Variable `newCount` initializer `count - 1` is redundant
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      lock();
      try {
        int newCount = count - 1;
        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
```

### RuleId[ruleID=UnusedAssignment]
Variable `newCount` initializer `this.count - 1` is redundant
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      lock();
      try {
        int newCount = this.count - 1;
        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
```

### RuleId[ruleID=UnusedAssignment]
Variable `newCount` initializer `this.count - 1` is redundant
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    boolean removeEntryForTesting(E entry) {
      int hash = entry.getHash();
      int newCount = this.count - 1;
      AtomicReferenceArray<E> table = this.table;
      int index = hash & (table.length() - 1);
```

### RuleId[ruleID=UnusedAssignment]
Variable `newCount` initializer `this.count - 1` is redundant
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
            if (entryValue == null) {
              if (isCollected(e)) {
                int newCount = this.count - 1;
                ++modCount;
                E newFirst = removeFromChain(first, e);
```

### RuleId[ruleID=UnusedAssignment]
Variable `newCount` initializer `this.count - 1` is redundant
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        preWriteCleanup();

        int newCount = this.count - 1;
        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
```

### RuleId[ruleID=UnusedAssignment]
Variable `newCount` initializer `this.count - 1` is redundant
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        preWriteCleanup();

        int newCount = this.count - 1;
        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
```

### RuleId[ruleID=UnusedAssignment]
Variable `newCount` initializer `this.count - 1` is redundant
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        preWriteCleanup(now);

        int newCount = this.count - 1;
        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
```

### RuleId[ruleID=UnusedAssignment]
Variable `newCount` initializer `count - 1` is redundant
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      lock();
      try {
        int newCount = count - 1;
        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
```

### RuleId[ruleID=UnusedAssignment]
Variable `newCount` initializer `this.count - 1` is redundant
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @CanIgnoreReturnValue
    boolean removeEntry(ReferenceEntry<K, V> entry, int hash, RemovalCause cause) {
      int newCount = this.count - 1;
      AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
      int index = hash & (table.length() - 1);
```

### RuleId[ruleID=UnusedAssignment]
Variable `newCount` initializer `this.count - 1` is redundant
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        preWriteCleanup(now);

        int newCount = this.count - 1;
        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
```

### RuleId[ruleID=UnusedAssignment]
Variable `e` initializer `null` is redundant
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    LoadingValueReference<K, V> insertLoadingValueReference(
        final K key, final int hash, boolean checkTime) {
      ReferenceEntry<K, V> e = null;
      lock();
      try {
```

### RuleId[ruleID=UnusedAssignment]
Variable `newCount` initializer `this.count - 1` is redundant
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
              if (valueReference.isActive()) {
                // If the value disappeared, this entry is partially collected.
                int newCount = this.count - 1;
                ++modCount;
                ReferenceEntry<K, V> newFirst =
```

### RuleId[ruleID=UnusedAssignment]
The value `this.count + 1` assigned to `newCount` is never used
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        if (newCount > this.threshold) { // ensure capacity
          expand();
          newCount = this.count + 1;
        }

```

### RuleId[ruleID=UnusedAssignment]
Variable `newCount` initializer `this.count - 1` is redundant
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      lock();
      try {
        int newCount = this.count - 1;
        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
```

### RuleId[ruleID=UnusedAssignment]
Variable `newCount` initializer `this.count - 1` is redundant
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
              if (valueReference.isActive()) {
                // If the value disappeared, this entry is partially collected.
                int newCount = this.count - 1;
                ++modCount;
                ReferenceEntry<K, V> newFirst =
```

### RuleId[ruleID=UnusedAssignment]
Variable `computingValueReference` initializer `null` is redundant
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      ReferenceEntry<K, V> e;
      ValueReference<K, V> valueReference = null;
      ComputingValueReference<K, V> computingValueReference = null;
      boolean createNewEntry = true;
      V newValue;
```

### RuleId[ruleID=UnusedAssignment]
The value `0` assigned to `productBits` is never used
in `guava/src/com/google/common/math/BigIntegerMath.java`
#### Snippet
```java
        bignums.add(BigInteger.valueOf(product));
        product = 1;
        productBits = 0;
      }
      product *= normalizedNum;
```

### RuleId[ruleID=UnusedAssignment]
The value `emptyMap(Ordering.from(comparator()).reverse())` assigned to `result` is never used
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
    if (result == null) {
      if (isEmpty()) {
        return result = emptyMap(Ordering.from(comparator()).reverse());
      } else {
        return result =
```

### RuleId[ruleID=UnusedAssignment]
The value `new ImmutableSortedMap<>(
(RegularImmutableSortedSet`) keySet.descendingSet(), valueList.reverse(), this) assigned to `result` is never used
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
        return result = emptyMap(Ordering.from(comparator()).reverse());
      } else {
        return result =
            new ImmutableSortedMap<>(
                (RegularImmutableSortedSet<K>) keySet.descendingSet(), valueList.reverse(), this);
```

## RuleId[ruleID=TypeParameterExtendsObject]
### RuleId[ruleID=TypeParameterExtendsObject]
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `guava/src/com/google/common/cache/Cache.java`
#### Snippet
```java
   */
  // For discussion of <? extends Object>, see getAllPresent.
  void invalidateAll(Iterable<? extends Object> keys);

  /** Discards all entries in the cache. */
```

### RuleId[ruleID=TypeParameterExtendsObject]
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `guava/src/com/google/common/cache/Cache.java`
#### Snippet
```java
   * differ: <? extends Object> means "non-null types," while <?> means "all types."
   */
  ImmutableMap<K, V> getAllPresent(Iterable<? extends Object> keys);

  /**
```

### RuleId[ruleID=TypeParameterExtendsObject]
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `guava/src/com/google/common/collect/TreeRangeMap.java`
#### Snippet
```java

        @Override
        public void putAll(RangeMap<Comparable<?>, ? extends Object> rangeMap) {
          if (!rangeMap.asMapOfRanges().isEmpty()) {
            throw new IllegalArgumentException(
```

### RuleId[ruleID=TypeParameterExtendsObject]
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `guava/src/com/google/common/util/concurrent/Striped.java`
#### Snippet
```java
   *     {@link #get(Object)}; may contain duplicates), in an increasing index order.
   */
  public Iterable<L> bulkGet(Iterable<? extends Object> keys) {
    // Initially using the list to store the keys, then reusing it to store the respective L's
    List<Object> result = newArrayList(keys);
```

### RuleId[ruleID=TypeParameterExtendsObject]
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `guava/src/com/google/common/cache/AbstractCache.java`
#### Snippet
```java
  @Override
  // For discussion of <? extends Object>, see getAllPresent.
  public void invalidateAll(Iterable<? extends Object> keys) {
    for (Object key : keys) {
      invalidate(key);
```

### RuleId[ruleID=TypeParameterExtendsObject]
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `guava/src/com/google/common/cache/AbstractCache.java`
#### Snippet
```java
   */
  @Override
  public ImmutableMap<K, V> getAllPresent(Iterable<? extends Object> keys) {
    Map<K, V> result = Maps.newLinkedHashMap();
    for (Object key : keys) {
```

### RuleId[ruleID=TypeParameterExtendsObject]
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java

    // "extends Object" works around https://github.com/typetools/checker-framework/issues/3013
    SerializedForm(Multiset<? extends Object> multiset) {
      int distinct = multiset.entrySet().size();
      elements = new Object[distinct];
```

### RuleId[ruleID=TypeParameterExtendsObject]
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java
      counts = new int[distinct];
      int i = 0;
      for (Entry<? extends Object> entry : multiset.entrySet()) {
        elements[i] = entry.getElement();
        counts[i] = entry.getCount();
```

### RuleId[ruleID=TypeParameterExtendsObject]
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `guava/src/com/google/common/cache/ForwardingCache.java`
#### Snippet
```java
   * differ: <? extends Object> means "non-null types," while <?> means "all types."
   */
  public ImmutableMap<K, V> getAllPresent(Iterable<? extends Object> keys) {
    return delegate().getAllPresent(keys);
  }
```

### RuleId[ruleID=TypeParameterExtendsObject]
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `guava/src/com/google/common/cache/ForwardingCache.java`
#### Snippet
```java
  @Override
  // For discussion of <? extends Object>, see getAllPresent.
  public void invalidateAll(Iterable<? extends Object> keys) {
    delegate().invalidateAll(keys);
  }
```

### RuleId[ruleID=TypeParameterExtendsObject]
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
        int i = 0;
        // "extends Object" works around https://github.com/typetools/checker-framework/issues/3013
        for (Entry<? extends Object, ? extends Object> entry : map.entrySet()) {
          keys[i] = entry.getKey();
          values[i] = entry.getValue();
```

### RuleId[ruleID=TypeParameterExtendsObject]
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
        int i = 0;
        // "extends Object" works around https://github.com/typetools/checker-framework/issues/3013
        for (Entry<? extends Object, ? extends Object> entry : map.entrySet()) {
          keys[i] = entry.getKey();
          values[i] = entry.getValue();
```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Condition `!Double.isNaN(permitsPerSecond)` is always `true` when reached
in `guava/src/com/google/common/util/concurrent/RateLimiter.java`
#### Snippet
```java
  public final void setRate(double permitsPerSecond) {
    checkArgument(
        permitsPerSecond > 0.0 && !Double.isNaN(permitsPerSecond), "rate must be positive");
    synchronized (mutex()) {
      doSetRate(permitsPerSecond, stopwatch.readMicros());
```

### RuleId[ruleID=ConstantValue]
Result of `Double.isNaN(permitsPerSecond)` is always 'false'
in `guava/src/com/google/common/util/concurrent/RateLimiter.java`
#### Snippet
```java
  public final void setRate(double permitsPerSecond) {
    checkArgument(
        permitsPerSecond > 0.0 && !Double.isNaN(permitsPerSecond), "rate must be positive");
    synchronized (mutex()) {
      doSetRate(permitsPerSecond, stopwatch.readMicros());
```

### RuleId[ruleID=ConstantValue]
Condition `key == null` is always `false`
in `guava/src/com/google/common/collect/ImmutableMultimap.java`
#### Snippet
```java
    @CanIgnoreReturnValue
    public Builder<K, V> putAll(K key, Iterable<? extends V> values) {
      if (key == null) {
        throw new NullPointerException("null key in entry: null=" + Iterables.toString(values));
      }
```

### RuleId[ruleID=ConstantValue]
Condition `rem == 0` is always `false`
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    switch (mode) {
      case UNNECESSARY:
        checkRoundingUnnecessary(rem == 0);
        // fall through
      case DOWN:
```

### RuleId[ruleID=ConstantValue]
Value `root` is always 'null'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
      AvlNode<E> newRoot = new AvlNode<E>(element, occurrences);
      successor(header, newRoot, header);
      rootReference.checkAndSet(root, newRoot);
      return 0;
    }
```

### RuleId[ruleID=ConstantValue]
Condition `cmp > 0` is always `true`
in `guava/src/com/google/common/collect/RegularImmutableSortedSet.java`
#### Snippet
```java
          target = thatIterator.next();

        } else if (cmp > 0) {
          return false;
        }
```

### RuleId[ruleID=ConstantValue]
Condition `rem == 0` is always `false`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    switch (mode) {
      case UNNECESSARY:
        checkRoundingUnnecessary(rem == 0);
        // fall through
      case DOWN:
```

### RuleId[ruleID=ConstantValue]
Condition `second != null` is always `true`
in `guava/src/com/google/common/base/MoreObjects.java`
#### Snippet
```java
      return first;
    }
    if (second != null) {
      return second;
    }
```

### RuleId[ruleID=ConstantValue]
Condition `key == null` is always `false`
in `guava/src/com/google/common/collect/CollectPreconditions.java`
#### Snippet
```java

  static void checkEntryNotNull(Object key, Object value) {
    if (key == null) {
      throw new NullPointerException("null key in entry: null=" + value);
    } else if (value == null) {
```

### RuleId[ruleID=ConstantValue]
Condition `value == null` is always `false`
in `guava/src/com/google/common/collect/CollectPreconditions.java`
#### Snippet
```java
    if (key == null) {
      throw new NullPointerException("null key in entry: null=" + value);
    } else if (value == null) {
      throw new NullPointerException("null value in entry: " + key + "=null");
    }
```

### RuleId[ruleID=ConstantValue]
Condition `delegate == null` is always `false`
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java
   */
  void setDelegates(Map<K, V> forward, Map<V, K> backward) {
    checkState(delegate == null);
    checkState(inverse == null);
    checkArgument(forward.isEmpty());
```

### RuleId[ruleID=ConstantValue]
Condition `oldValue == null` is always `false`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    public LoadingValueReference(ValueReference<K, V> oldValue) {
      this.oldValue = (oldValue == null) ? LocalCache.unset() : oldValue;
    }

```

### RuleId[ruleID=ConstantValue]
Condition `result == null` is always `false`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    }

    if (result == null) {
      globalStatsCounter.recordLoadException(stopwatch.elapsed(NANOSECONDS));
      throw new InvalidCacheLoadException(loader + " returned null map from loadAll");
```

### RuleId[ruleID=ConstantValue]
Value `entryValue` is always 'null'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
                        entryKey,
                        hash,
                        entryValue,
                        valueReference,
                        RemovalCause.COLLECTED);
```

### RuleId[ruleID=ConstantValue]
Value `entryValue` is always 'null'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
              if (valueReference.isActive()) {
                enqueueNotification(
                    key, hash, entryValue, valueReference.getWeight(), RemovalCause.COLLECTED);
                setValue(e, key, value, now);
                newCount = this.count; // count remains unchanged
```

### RuleId[ruleID=ConstantValue]
Value `value` is always 'null'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
              if (value == null) {
                enqueueNotification(
                    entryKey, hash, value, valueReference.getWeight(), RemovalCause.COLLECTED);
              } else if (map.isExpired(e, now)) {
                // This is a duplicate check, as preWriteCleanup already purged expired
```

### RuleId[ruleID=ConstantValue]
Condition `newValue == null` is always `false`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        }
        ListenableFuture<V> newValue = loader.reload(key, previousValue);
        if (newValue == null) {
          return Futures.immediateFuture(null);
        }
```

### RuleId[ruleID=ConstantValue]
Value `entryValue` is always 'null'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
                        entryKey,
                        hash,
                        entryValue,
                        valueReference,
                        RemovalCause.COLLECTED);
```

### RuleId[ruleID=ConstantValue]
Condition `valueReference != null` is always `true`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        newValue = computingValueReference.compute(key, function);
        if (newValue != null) {
          if (valueReference != null && newValue == valueReference.get()) {
            computingValueReference.set(newValue);
            e.setValueReference(valueReference);
```

### RuleId[ruleID=ConstantValue]
Value `key` is always 'null'
in `guava/src/com/google/common/collect/TreeMultimap.java`
#### Snippet
```java
  Collection<V> createCollection(@ParametricNullness K key) {
    if (key == null) {
      keyComparator().compare(key, key);
    }
    return super.createCollection(key);
```

### RuleId[ruleID=ConstantValue]
Value `key` is always 'null'
in `guava/src/com/google/common/collect/TreeMultimap.java`
#### Snippet
```java
  Collection<V> createCollection(@ParametricNullness K key) {
    if (key == null) {
      keyComparator().compare(key, key);
    }
    return super.createCollection(key);
```

### RuleId[ruleID=ConstantValue]
Condition `element == null` is always `false`
in `guava/src/com/google/common/collect/ObjectArrays.java`
#### Snippet
```java
  @CanIgnoreReturnValue
  static Object checkElementNotNull(Object element, int index) {
    if (element == null) {
      throw new NullPointerException("at index " + index);
    }
```

### RuleId[ruleID=ConstantValue]
Condition `AnnotatedElement.class.isAssignableFrom(TypeVariable.class)` is always `true`
in `guava/src/com/google/common/reflect/Types.java`
#### Snippet
```java

    static {
      if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
        if (new TypeCapture<Entry<String, int[][]>>() {}.capture()
            .toString()
```

## RuleId[ruleID=MethodOverridesStaticMethod]
### RuleId[ruleID=MethodOverridesStaticMethod]
Method `builderWithExpectedSize()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedSetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Use naturalOrder (which does not accept an expected size)")
  @Deprecated
  public static <E> ImmutableSortedSet.Builder<E> builderWithExpectedSize(int expectedSize) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `copyOf()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedSetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Pass parameters of type Comparable")
  @Deprecated
  public static <E> ImmutableSortedSet<E> copyOf(E[] elements) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedSetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Pass parameters of type Comparable")
  @Deprecated
  public static <E> ImmutableSortedSet<E> of(E e1, E e2, E e3) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedSetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Pass parameters of type Comparable")
  @Deprecated
  public static <E> ImmutableSortedSet<E> of(E e1, E e2, E e3, E e4, E e5) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedSetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Pass parameters of type Comparable")
  @Deprecated
  public static <E> ImmutableSortedSet<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E... remaining) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedSetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Pass parameters of type Comparable")
  @Deprecated
  public static <E> ImmutableSortedSet<E> of(E e1, E e2, E e3, E e4) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedSetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Pass parameters of type Comparable")
  @Deprecated
  public static <E> ImmutableSortedSet<E> of(E e1, E e2) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `builder()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedSetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Use naturalOrder")
  @Deprecated
  public static <E> ImmutableSortedSet.Builder<E> builder() {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `toImmutableSet()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedSetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Use toImmutableSortedSet")
  @Deprecated
  public static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedSetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Pass a parameter of type Comparable")
  @Deprecated
  public static <E> ImmutableSortedSet<E> of(E element) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableListMultimap.java`
#### Snippet
```java

  /** Returns an immutable multimap containing the given entries, in order. */
  public static <K, V> ImmutableListMultimap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3) {
    ImmutableListMultimap.Builder<K, V> builder = ImmutableListMultimap.builder();
    builder.put(k1, v1);
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableListMultimap.java`
#### Snippet
```java

  /** Returns an immutable multimap containing a single entry. */
  public static <K, V> ImmutableListMultimap<K, V> of(K k1, V v1) {
    ImmutableListMultimap.Builder<K, V> builder = ImmutableListMultimap.builder();
    builder.put(k1, v1);
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `copyOf()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableListMultimap.java`
#### Snippet
```java
   */
  @Beta
  public static <K, V> ImmutableListMultimap<K, V> copyOf(
      Iterable<? extends Entry<? extends K, ? extends V>> entries) {
    return new Builder<K, V>().putAll(entries).build();
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableListMultimap.java`
#### Snippet
```java

  /** Returns an immutable multimap containing the given entries, in order. */
  public static <K, V> ImmutableListMultimap<K, V> of(
      K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
    ImmutableListMultimap.Builder<K, V> builder = ImmutableListMultimap.builder();
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableListMultimap.java`
#### Snippet
```java
  // Casting is safe because the multimap will never hold any elements.
  @SuppressWarnings("unchecked")
  public static <K, V> ImmutableListMultimap<K, V> of() {
    return (ImmutableListMultimap<K, V>) EmptyImmutableListMultimap.INSTANCE;
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableListMultimap.java`
#### Snippet
```java

  /** Returns an immutable multimap containing the given entries, in order. */
  public static <K, V> ImmutableListMultimap<K, V> of(
      K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
    ImmutableListMultimap.Builder<K, V> builder = ImmutableListMultimap.builder();
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `builder()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableListMultimap.java`
#### Snippet
```java
   * Builder} constructor.
   */
  public static <K, V> Builder<K, V> builder() {
    return new Builder<>();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableListMultimap.java`
#### Snippet
```java

  /** Returns an immutable multimap containing the given entries, in order. */
  public static <K, V> ImmutableListMultimap<K, V> of(K k1, V v1, K k2, V v2) {
    ImmutableListMultimap.Builder<K, V> builder = ImmutableListMultimap.builder();
    builder.put(k1, v1);
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `copyOf()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableListMultimap.java`
#### Snippet
```java
   * @throws NullPointerException if any key or value in {@code multimap} is null
   */
  public static <K, V> ImmutableListMultimap<K, V> copyOf(
      Multimap<? extends K, ? extends V> multimap) {
    if (multimap.isEmpty()) {
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `builder()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ContiguousSet.java`
#### Snippet
```java
  @Deprecated
  @DoNotCall("Always throws UnsupportedOperationException")
  public static <E> ImmutableSortedSet.Builder<E> builder() {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `createWithExpectedSize()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/CompactLinkedHashSet.java`
#### Snippet
```java
   * @throws IllegalArgumentException if {@code expectedSize} is negative
   */
  public static <E extends @Nullable Object> CompactLinkedHashSet<E> createWithExpectedSize(
      int expectedSize) {
    return new CompactLinkedHashSet<>(expectedSize);
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `create()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/CompactLinkedHashSet.java`
#### Snippet
```java
   * @return a new {@code CompactLinkedHashSet} containing those elements (minus duplicates)
   */
  public static <E extends @Nullable Object> CompactLinkedHashSet<E> create(
      Collection<? extends E> collection) {
    CompactLinkedHashSet<E> set = createWithExpectedSize(collection.size());
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `create()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/CompactLinkedHashSet.java`
#### Snippet
```java
   */
  @SafeVarargs
  public static <E extends @Nullable Object> CompactLinkedHashSet<E> create(E... elements) {
    CompactLinkedHashSet<E> set = createWithExpectedSize(elements.length);
    Collections.addAll(set, elements);
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `create()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/CompactLinkedHashSet.java`
#### Snippet
```java

  /** Creates an empty {@code CompactLinkedHashSet} instance. */
  public static <E extends @Nullable Object> CompactLinkedHashSet<E> create() {
    return new CompactLinkedHashSet<>();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `copyOf()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
   * @throws NullPointerException if any key or value in {@code multimap} is null
   */
  public static <K, V> ImmutableSetMultimap<K, V> copyOf(
      Multimap<? extends K, ? extends V> multimap) {
    return copyOf(multimap, null);
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java

  /** Returns an immutable multimap containing a single entry. */
  public static <K, V> ImmutableSetMultimap<K, V> of(K k1, V v1) {
    ImmutableSetMultimap.Builder<K, V> builder = ImmutableSetMultimap.builder();
    builder.put(k1, v1);
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
   * an entry (according to {@link Object#equals}) after the first are ignored.
   */
  public static <K, V> ImmutableSetMultimap<K, V> of(
      K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
    ImmutableSetMultimap.Builder<K, V> builder = ImmutableSetMultimap.builder();
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `copyOf()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
   */
  @Beta
  public static <K, V> ImmutableSetMultimap<K, V> copyOf(
      Iterable<? extends Entry<? extends K, ? extends V>> entries) {
    return new Builder<K, V>().putAll(entries).build();
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
   * an entry (according to {@link Object#equals}) after the first are ignored.
   */
  public static <K, V> ImmutableSetMultimap<K, V> of(K k1, V v1, K k2, V v2) {
    ImmutableSetMultimap.Builder<K, V> builder = ImmutableSetMultimap.builder();
    builder.put(k1, v1);
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
   * an entry (according to {@link Object#equals}) after the first are ignored.
   */
  public static <K, V> ImmutableSetMultimap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3) {
    ImmutableSetMultimap.Builder<K, V> builder = ImmutableSetMultimap.builder();
    builder.put(k1, v1);
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `builder()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java

  /** Returns a new {@link Builder}. */
  public static <K, V> Builder<K, V> builder() {
    return new Builder<>();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
   * an entry (according to {@link Object#equals}) after the first are ignored.
   */
  public static <K, V> ImmutableSetMultimap<K, V> of(
      K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
    ImmutableSetMultimap.Builder<K, V> builder = ImmutableSetMultimap.builder();
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
  // Casting is safe because the multimap will never hold any elements.
  @SuppressWarnings("unchecked")
  public static <K, V> ImmutableSetMultimap<K, V> of() {
    return (ImmutableSetMultimap<K, V>) EmptyImmutableSetMultimap.INSTANCE;
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
   * <p><b>Performance note:</b> the instance returned is a singleton.
   */
  public static <E> ImmutableSortedSet<E> of() {
    return (ImmutableSortedSet<E>) RegularImmutableSortedSet.NATURAL_EMPTY_SET;
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `copyOf()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
   * @throws NullPointerException if any of {@code elements} is null
   */
  public static <E> ImmutableSortedSet<E> copyOf(Iterator<? extends E> elements) {
    // Hack around E not being a subtype of Comparable.
    // Unsafe, see ImmutableSortedSetFauxverideShim.
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `copyOf()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
   * @since 7.0 (source-compatible since 2.0)
   */
  public static <E> ImmutableSortedSet<E> copyOf(Collection<? extends E> elements) {
    // Hack around E not being a subtype of Comparable.
    // Unsafe, see ImmutableSortedSetFauxverideShim.
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `copyOf()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
   * @throws NullPointerException if any of {@code elements} is null
   */
  public static <E> ImmutableSortedSet<E> copyOf(Iterable<? extends E> elements) {
    // Hack around E not being a subtype of Comparable.
    // Unsafe, see ImmutableSortedSetFauxverideShim.
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMultisetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
  @Deprecated
  public static <E> ImmutableSortedMultiset<E> of(E e1, E e2, E e3, E e4, E e5) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `copyOf()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMultisetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
  @Deprecated
  public static <E> ImmutableSortedMultiset<E> copyOf(E[] elements) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMultisetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
  @Deprecated
  public static <E> ImmutableSortedMultiset<E> of(E element) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMultisetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
  @Deprecated
  public static <E> ImmutableSortedMultiset<E> of(
      E e1, E e2, E e3, E e4, E e5, E e6, E... remaining) {
    throw new UnsupportedOperationException();
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `toImmutableMultiset()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMultisetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Use toImmutableSortedMultiset.")
  @Deprecated
  public static <E> Collector<E, ?, ImmutableMultiset<E>> toImmutableMultiset() {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMultisetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
  @Deprecated
  public static <E> ImmutableSortedMultiset<E> of(E e1, E e2, E e3) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `builder()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMultisetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Use naturalOrder.")
  @Deprecated
  public static <E> ImmutableSortedMultiset.Builder<E> builder() {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `toImmutableMultiset()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMultisetFauxverideShim.java`
#### Snippet
```java
  @Deprecated
  public static <T extends @Nullable Object, E>
      Collector<T, ?, ImmutableMultiset<E>> toImmutableMultiset(
          Function<? super T, ? extends E> elementFunction,
          ToIntFunction<? super T> countFunction) {
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMultisetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
  @Deprecated
  public static <E> ImmutableSortedMultiset<E> of(E e1, E e2) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMultisetFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
  @Deprecated
  public static <E> ImmutableSortedMultiset<E> of(E e1, E e2, E e3, E e4) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `copyOf()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   */
  @Beta
  public static <K, V> ImmutableBiMap<K, V> copyOf(
      Iterable<? extends Entry<? extends K, ? extends V>> entries) {
    @SuppressWarnings("unchecked") // we'll only be using getKey and getValue, which are covariant
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   * @since 31.0
   */
  public static <K, V> ImmutableBiMap<K, V> of(
      K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
    return RegularImmutableBiMap.fromEntries(
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `builder()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   * Builder} constructor.
   */
  public static <K, V> Builder<K, V> builder() {
    return new Builder<>();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
  // Casting to any type is safe because the set will never hold any elements.
  @SuppressWarnings("unchecked")
  public static <K, V> ImmutableBiMap<K, V> of() {
    return (ImmutableBiMap<K, V>) RegularImmutableBiMap.EMPTY;
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   * @throws IllegalArgumentException if duplicate keys or values are added
   */
  public static <K, V> ImmutableBiMap<K, V> of(
      K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
    return RegularImmutableBiMap.fromEntries(
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `builderWithExpectedSize()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   */
  @Beta
  public static <K, V> Builder<K, V> builderWithExpectedSize(int expectedSize) {
    checkNonnegative(expectedSize, "expectedSize");
    return new Builder<>(expectedSize);
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java

  /** Returns an immutable bimap containing a single entry. */
  public static <K, V> ImmutableBiMap<K, V> of(K k1, V v1) {
    return new SingletonImmutableBiMap<>(k1, v1);
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `copyOf()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   * @throws NullPointerException if any key or value in {@code map} is null
   */
  public static <K, V> ImmutableBiMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
    if (map instanceof ImmutableBiMap) {
      @SuppressWarnings("unchecked") // safe since map is not writable
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   * @throws IllegalArgumentException if duplicate keys or values are added
   */
  public static <K, V> ImmutableBiMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3) {
    return RegularImmutableBiMap.fromEntries(entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3));
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   * @throws IllegalArgumentException if duplicate keys or values are added
   */
  public static <K, V> ImmutableBiMap<K, V> of(K k1, V v1, K k2, V v2) {
    return RegularImmutableBiMap.fromEntries(entryOf(k1, v1), entryOf(k2, v2));
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   * @since 31.0
   */
  public static <K, V> ImmutableBiMap<K, V> of(
      K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
    return RegularImmutableBiMap.fromEntries(
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   * @since 31.0
   */
  public static <K, V> ImmutableBiMap<K, V> of(
      K k1,
      V v1,
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   * @since 31.0
   */
  public static <K, V> ImmutableBiMap<K, V> of(
      K k1,
      V v1,
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   * @since 31.0
   */
  public static <K, V> ImmutableBiMap<K, V> of(
      K k1,
      V v1,
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   * @throws IllegalArgumentException if duplicate keys or values are added
   */
  public static <K, V> ImmutableBiMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
    return RegularImmutableBiMap.fromEntries(
        entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4));
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `ofEntries()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   */
  @SafeVarargs
  public static <K, V> ImmutableBiMap<K, V> ofEntries(Entry<? extends K, ? extends V>... entries) {
    @SuppressWarnings("unchecked") // we will only ever read these
    Entry<K, V>[] entries2 = (Entry<K, V>[]) entries;
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `toImmutableMap()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableBiMapFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Use toImmutableBiMap")
  public static <T extends @Nullable Object, K, V>
      Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(
          Function<? super T, ? extends K> keyFunction,
          Function<? super T, ? extends V> valueFunction) {
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `toImmutableMap()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableBiMapFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Use toImmutableBiMap")
  public static <T extends @Nullable Object, K, V>
      Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(
          Function<? super T, ? extends K> keyFunction,
          Function<? super T, ? extends V> valueFunction,
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMapFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Pass keys of type Comparable")
  @Deprecated
  public static <K, V> ImmutableSortedMap<K, V> of(
      K k1,
      V v1,
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMapFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Pass keys of type Comparable")
  @Deprecated
  public static <K, V> ImmutableSortedMap<K, V> of(
      K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
    throw new UnsupportedOperationException();
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMapFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Pass keys of type Comparable")
  @Deprecated
  public static <K, V> ImmutableSortedMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMapFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Pass keys of type Comparable")
  @Deprecated
  public static <K, V> ImmutableSortedMap<K, V> of(
      K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
    throw new UnsupportedOperationException();
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMapFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Pass keys of type Comparable")
  @Deprecated
  public static <K, V> ImmutableSortedMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `ofEntries()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMapFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("ImmutableSortedMap.ofEntries not currently available; use ImmutableSortedMap.copyOf")
  @Deprecated
  public static <K, V> ImmutableSortedMap<K, V> ofEntries(
      Entry<? extends K, ? extends V>... entries) {
    throw new UnsupportedOperationException();
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `builderWithExpectedSize()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMapFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Use naturalOrder (which does not accept an expected size)")
  @Deprecated
  public static <K, V> ImmutableSortedMap.Builder<K, V> builderWithExpectedSize(int expectedSize) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `builder()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMapFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Use naturalOrder")
  @Deprecated
  public static <K, V> ImmutableSortedMap.Builder<K, V> builder() {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMapFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Pass keys of type Comparable")
  @Deprecated
  public static <K, V> ImmutableSortedMap<K, V> of(
      K k1,
      V v1,
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMapFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Pass a key of type Comparable")
  @Deprecated
  public static <K, V> ImmutableSortedMap<K, V> of(K k1, V v1) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `toImmutableMap()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMapFauxverideShim.java`
#### Snippet
```java
  @Deprecated
  public static <T extends @Nullable Object, K, V>
      Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(
          Function<? super T, ? extends K> keyFunction,
          Function<? super T, ? extends V> valueFunction,
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMapFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Pass keys of type Comparable")
  @Deprecated
  public static <K, V> ImmutableSortedMap<K, V> of(
      K k1,
      V v1,
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMapFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Pass keys of type Comparable")
  @Deprecated
  public static <K, V> ImmutableSortedMap<K, V> of(K k1, V v1, K k2, V v2) {
    throw new UnsupportedOperationException();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMapFauxverideShim.java`
#### Snippet
```java
  @DoNotCall("Pass keys of type Comparable")
  @Deprecated
  public static <K, V> ImmutableSortedMap<K, V> of(
      K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
    throw new UnsupportedOperationException();
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `toImmutableMap()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMapFauxverideShim.java`
#### Snippet
```java
  @Deprecated
  public static <T extends @Nullable Object, K, V>
      Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(
          Function<? super T, ? extends K> keyFunction,
          Function<? super T, ? extends V> valueFunction) {
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `copyOf()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMultiset.java`
#### Snippet
```java
   * @throws NullPointerException if any of {@code elements} is null
   */
  public static <E> ImmutableSortedMultiset<E> copyOf(Iterator<? extends E> elements) {
    // Hack around E not being a subtype of Comparable.
    // Unsafe, see ImmutableSortedMultisetFauxverideShim.
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMultiset.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public static <E> ImmutableSortedMultiset<E> of() {
    return (ImmutableSortedMultiset) RegularImmutableSortedMultiset.NATURAL_EMPTY_MULTISET;
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `copyOf()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMultiset.java`
#### Snippet
```java
   * @throws NullPointerException if any of {@code elements} is null
   */
  public static <E> ImmutableSortedMultiset<E> copyOf(Iterable<? extends E> elements) {
    // Hack around E not being a subtype of Comparable.
    // Unsafe, see ImmutableSortedMultisetFauxverideShim.
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `create()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/CompactLinkedHashMap.java`
#### Snippet
```java
  /** Creates an empty {@code CompactLinkedHashMap} instance. */
  public static <K extends @Nullable Object, V extends @Nullable Object>
      CompactLinkedHashMap<K, V> create() {
    return new CompactLinkedHashMap<>();
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `createWithExpectedSize()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/CompactLinkedHashMap.java`
#### Snippet
```java
   */
  public static <K extends @Nullable Object, V extends @Nullable Object>
      CompactLinkedHashMap<K, V> createWithExpectedSize(int expectedSize) {
    return new CompactLinkedHashMap<>(expectedSize);
  }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `copyOf()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
   */
  @Beta
  public static <K, V> ImmutableSortedMap<K, V> copyOf(
      Iterable<? extends Entry<? extends K, ? extends V>> entries) {
    // Hack around K not being a subtype of Comparable.
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `copyOf()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
   * @throws IllegalArgumentException if any two keys are equal according to their natural ordering
   */
  public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
    // Hack around K not being a subtype of Comparable.
    // Unsafe, see ImmutableSortedSetFauxverideShim.
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
  // unsafe, comparator() returns a comparator on the specified type
  // TODO(kevinb): evaluate whether or not of().comparator() should return null
  public static <K, V> ImmutableSortedMap<K, V> of() {
    return (ImmutableSortedMap<K, V>) NATURAL_EMPTY_MAP;
  }
```

## RuleId[ruleID=IOResource]
### RuleId[ruleID=IOResource]
'DataOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `guava/src/com/google/common/hash/BloomFilter.java`
#### Snippet
```java
    // 1 big endian int, the number of longs in our bitset
    // N big endian longs of our bitset
    DataOutputStream dout = new DataOutputStream(out);
    dout.writeByte(SignedBytes.checkedCast(strategy.ordinal()));
    dout.writeByte(UnsignedBytes.checkedCast(numHashFunctions)); // note: checked at the c'tor
```

### RuleId[ruleID=IOResource]
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `guava/src/com/google/common/hash/BloomFilter.java`
#### Snippet
```java
    int dataLength = -1;
    try {
      DataInputStream din = new DataInputStream(in);
      // currently this assumes there is no negative ordinal; will have to be updated if we
      // add non-stateless strategies (for which we've reserved negative ordinals; see
```

### RuleId[ruleID=IOResource]
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `guava/src/com/google/common/io/LittleEndianDataInputStream.java`
#### Snippet
```java
  @Override
  public String readUTF() throws IOException {
    return new DataInputStream(in).readUTF();
  }

```

## RuleId[ruleID=OptionalIsPresent]
### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  @com.google.errorprone.annotations.InlineMeValidationDisabled("Java 9+ API only")
  public static <T> Stream<T> stream(java.util.Optional<T> optional) {
    return optional.isPresent() ? Stream.of(optional.get()) : Stream.empty();
  }

```

## RuleId[ruleID=SuspiciousNameCombination]
### RuleId[ruleID=SuspiciousNameCombination]
'x' should probably not be passed as parameter 'y'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
      case CEILING:
      case UP:
        return sqrtFloor + lessThanBranchFree(sqrtFloor * sqrtFloor, x);
      case HALF_DOWN:
      case HALF_UP:
```

### RuleId[ruleID=SuspiciousNameCombination]
'x' should probably not be passed as parameter 'y'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
         * signed int, so lessThanBranchFree is safe for use.
         */
        return sqrtFloor + lessThanBranchFree(halfSquare, x);
      default:
        throw new AssertionError();
```

### RuleId[ruleID=SuspiciousNameCombination]
'x' should probably not be passed as parameter 'y'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
        // floor(2^(logFloor + 0.5))
        int logFloor = (Integer.SIZE - 1) - leadingZeros;
        return logFloor + lessThanBranchFree(cmp, x);

      default:
```

### RuleId[ruleID=SuspiciousNameCombination]
'x' should probably not be passed as parameter 'y'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
      case CEILING:
      case UP:
        return logFloor + lessThanBranchFree(floorPow, x);
      case HALF_DOWN:
      case HALF_UP:
```

### RuleId[ruleID=SuspiciousNameCombination]
'x' should probably not be passed as parameter 'y'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
      case HALF_EVEN:
        // sqrt(10) is irrational, so log10(x) - logFloor is never exactly 0.5
        return logFloor + lessThanBranchFree(halfPowersOf10[logFloor], x);
      default:
        throw new AssertionError();
```

### RuleId[ruleID=SuspiciousNameCombination]
'left' should probably not be assigned to 'newTop'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
    private AvlNode<E> rotateRight() {
      checkState(left != null);
      AvlNode<E> newTop = left;
      this.left = newTop.right;
      newTop.right = this;
```

### RuleId[ruleID=SuspiciousNameCombination]
'newTop' should probably not be returned from method 'rotateRight'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
      this.recompute();
      newTop.recomputeHeight();
      return newTop;
    }

```

### RuleId[ruleID=SuspiciousNameCombination]
'right' should probably not be assigned to 'newTop'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
    private AvlNode<E> rotateLeft() {
      checkState(right != null);
      AvlNode<E> newTop = right;
      this.right = newTop.left;
      newTop.left = this;
```

### RuleId[ruleID=SuspiciousNameCombination]
'newTop' should probably not be returned from method 'rotateLeft'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
      this.recompute();
      newTop.recomputeHeight();
      return newTop;
    }

```

### RuleId[ruleID=SuspiciousNameCombination]
'x' should probably not be passed as parameter 'y'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
         * signed long, so lessThanBranchFree is safe for use.
         */
        return sqrtFloor + lessThanBranchFree(halfSquare, x);
    }
    throw new AssertionError();
```

### RuleId[ruleID=SuspiciousNameCombination]
'x' should probably not be passed as parameter 'y'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
      case CEILING:
      case UP:
        return logFloor + lessThanBranchFree(floorPow, x);
      case HALF_DOWN:
      case HALF_UP:
```

### RuleId[ruleID=SuspiciousNameCombination]
'x' should probably not be passed as parameter 'y'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
      case HALF_EVEN:
        // sqrt(10) is irrational, so log10(x)-logFloor is never exactly 0.5
        return logFloor + lessThanBranchFree(halfPowersOf10[logFloor], x);
    }
    throw new AssertionError();
```

### RuleId[ruleID=SuspiciousNameCombination]
'x' should probably not be passed as parameter 'y'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
        // floor(2^(logFloor + 0.5))
        int logFloor = (Long.SIZE - 1) - leadingZeros;
        return logFloor + lessThanBranchFree(cmp, x);
    }
    throw new AssertionError("impossible");
```

### RuleId[ruleID=SuspiciousNameCombination]
'yIntercept' should probably not be passed as parameter 'x'
in `guava/src/com/google/common/math/LinearTransformation.java`
#### Snippet
```java
        return new RegularLinearTransformation(1.0 / slope, -1.0 * yIntercept / slope, this);
      } else {
        return new VerticalLinearTransformation(yIntercept, this);
      }
    }
```

### RuleId[ruleID=SuspiciousNameCombination]
'x' should probably not be passed as parameter 'yIntercept'
in `guava/src/com/google/common/math/LinearTransformation.java`
#### Snippet
```java

    private LinearTransformation createInverse() {
      return new RegularLinearTransformation(0.0, x, this);
    }
  }
```

## RuleId[ruleID=AtomicFieldUpdaterNotStaticFinal]
### RuleId[ruleID=AtomicFieldUpdaterNotStaticFinal]
AtomicReferenceFieldUpdater field `waitersUpdater` is not declared 'static final'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    final AtomicReferenceFieldUpdater<Waiter, Thread> waiterThreadUpdater;
    final AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater;
    final AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater;
    final AtomicReferenceFieldUpdater<AbstractFuture, Listener> listenersUpdater;
    final AtomicReferenceFieldUpdater<AbstractFuture, Object> valueUpdater;
```

### RuleId[ruleID=AtomicFieldUpdaterNotStaticFinal]
AtomicReferenceFieldUpdater field `waiterNextUpdater` is not declared 'static final'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
  private static final class SafeAtomicHelper extends AtomicHelper {
    final AtomicReferenceFieldUpdater<Waiter, Thread> waiterThreadUpdater;
    final AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater;
    final AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater;
    final AtomicReferenceFieldUpdater<AbstractFuture, Listener> listenersUpdater;
```

### RuleId[ruleID=AtomicFieldUpdaterNotStaticFinal]
AtomicReferenceFieldUpdater field `listenersUpdater` is not declared 'static final'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    final AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater;
    final AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater;
    final AtomicReferenceFieldUpdater<AbstractFuture, Listener> listenersUpdater;
    final AtomicReferenceFieldUpdater<AbstractFuture, Object> valueUpdater;

```

### RuleId[ruleID=AtomicFieldUpdaterNotStaticFinal]
AtomicReferenceFieldUpdater field `valueUpdater` is not declared 'static final'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    final AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater;
    final AtomicReferenceFieldUpdater<AbstractFuture, Listener> listenersUpdater;
    final AtomicReferenceFieldUpdater<AbstractFuture, Object> valueUpdater;

    SafeAtomicHelper(
```

### RuleId[ruleID=AtomicFieldUpdaterNotStaticFinal]
AtomicReferenceFieldUpdater field `waiterThreadUpdater` is not declared 'static final'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
  @SuppressWarnings("rawtypes")
  private static final class SafeAtomicHelper extends AtomicHelper {
    final AtomicReferenceFieldUpdater<Waiter, Thread> waiterThreadUpdater;
    final AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater;
    final AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater;
```

### RuleId[ruleID=AtomicFieldUpdaterNotStaticFinal]
AtomicReferenceFieldUpdater, Set\> field `seenExceptionsUpdater` is not declared 'static final'
in `guava/src/com/google/common/util/concurrent/AggregateFutureState.java`
#### Snippet
```java
  private static final class SafeAtomicHelper extends AtomicHelper {
    final AtomicReferenceFieldUpdater<AggregateFutureState<?>, Set<Throwable>>
        seenExceptionsUpdater;

    final AtomicIntegerFieldUpdater<AggregateFutureState<?>> remainingCountUpdater;
```

### RuleId[ruleID=AtomicFieldUpdaterNotStaticFinal]
AtomicIntegerFieldUpdater\> field `remainingCountUpdater` is not declared 'static final'
in `guava/src/com/google/common/util/concurrent/AggregateFutureState.java`
#### Snippet
```java
        seenExceptionsUpdater;

    final AtomicIntegerFieldUpdater<AggregateFutureState<?>> remainingCountUpdater;

    @SuppressWarnings({"rawtypes", "unchecked"}) // Unavoidable with reflection API
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `LongAddables` has only 'static' members, and lacks a 'private' constructor
in `guava/src/com/google/common/cache/LongAddables.java`
#### Snippet
```java
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
final class LongAddables {
  private static final Supplier<LongAddable> SUPPLIER;

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FieldSettersHolder` has only 'static' members, and lacks a 'private' constructor
in `guava/src/com/google/common/collect/ImmutableMultimap.java`
#### Snippet
```java
  // deserialized.
  @GwtIncompatible // java serialization is not supported
  static class FieldSettersHolder {
    static final Serialization.FieldSetter<ImmutableMultimap> MAP_FIELD_SETTER =
        Serialization.getFieldSetter(ImmutableMultimap.class, "map");
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `LongAddables` has only 'static' members, and lacks a 'private' constructor
in `guava/src/com/google/common/hash/LongAddables.java`
#### Snippet
```java
 */
@ElementTypesAreNonnullByDefault
final class LongAddables {
  private static final Supplier<LongAddable> SUPPLIER;

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CollectPreconditions` has only 'static' members, and lacks a 'private' constructor
in `guava/src/com/google/common/collect/CollectPreconditions.java`
#### Snippet
```java
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class CollectPreconditions {

  static void checkEntryNotNull(Object key, Object value) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Quantiles` has only 'static' members, and lacks a 'private' constructor
in `guava/src/com/google/common/math/Quantiles.java`
#### Snippet
```java
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class Quantiles {

  /** Specifies the computation of a median (i.e. the 1st 2-quantile). */
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `LexicographicalComparatorHolder` has only 'static' members, and lacks a 'private' constructor
in `guava/src/com/google/common/primitives/UnsignedBytes.java`
#### Snippet
```java
   */
  @VisibleForTesting
  static class LexicographicalComparatorHolder {
    static final String UNSAFE_COMPARATOR_NAME =
        LexicographicalComparatorHolder.class.getName() + "$UnsafeComparator";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `GetCheckedTypeValidatorHolder` has only 'static' members, and lacks a 'private' constructor
in `guava/src/com/google/common/util/concurrent/FuturesGetChecked.java`
#### Snippet
```java
   */
  @VisibleForTesting
  static class GetCheckedTypeValidatorHolder {
    static final String CLASS_VALUE_VALIDATOR_NAME =
        GetCheckedTypeValidatorHolder.class.getName() + "$ClassValueValidator";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CollectCollectors` has only 'static' members, and lacks a 'private' constructor
in `guava/src/com/google/common/collect/CollectCollectors.java`
#### Snippet
```java
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class CollectCollectors {

  private static final Collector<Object, ?, ImmutableList<Object>> TO_IMMUTABLE_LIST =
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `TrieParser` has only 'static' members, and lacks a 'private' constructor
in `guava/src/com/google/thirdparty/publicsuffix/TrieParser.java`
#### Snippet
```java
/** Parser for a map of reversed domain names stored as a serialized radix tree. */
@GwtCompatible
final class TrieParser {

  private static final Joiner DIRECT_JOINER = Joiner.on("");
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `NativeTypeVariableEquals` has only 'static' members, and lacks a 'private' constructor
in `guava/src/com/google/common/reflect/Types.java`
#### Snippet
```java
   * anyway.
   */
  static final class NativeTypeVariableEquals<X> {
    static final boolean NATIVE_TYPE_VARIABLE_ONLY =
        !NativeTypeVariableEquals.class.getTypeParameters()[0].equals(
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `guava/src/com/google/common/util/concurrent/CycleDetectingLockFactory.java`
#### Snippet
```java
      @Override
      public void handlePotentialDeadlock(PotentialDeadlockException e) {}
    };
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
        return entry.getValue();
      }
    };
  }

```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
The call to 'checkNoConflict' always fails, according to its method contracts
in `guava/src/com/google/common/collect/RegularImmutableMap.java`
#### Snippet
```java
      if (keyBucketHead.getKey().equals(key)) {
        if (throwIfDuplicateKeys) {
          checkNoConflict(/* safe= */ false, "key", keyBucketHead, key + "=" + newValue);
        } else {
          return keyBucketHead;
```

### RuleId[ruleID=DataFlowIssue]
Expression `old` might evaluate to null but is returned by the method declared as @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
          future.listeners = update;
        }
        return old;
      }
    }
```

### RuleId[ruleID=DataFlowIssue]
@CheckForNull method 'clearListeners' always returns a non-null value
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
   * added first.
   */
  @CheckForNull
  private Listener clearListeners(@CheckForNull Listener onto) {
    // We need to
```

### RuleId[ruleID=DataFlowIssue]
Condition `localValue instanceof SetFuture` is redundant and can be replaced with a null check
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
          rValue = true;
          complete(abstractFuture, mayInterruptIfRunning);
          if (localValue instanceof SetFuture) {
            // propagate cancellation to the future set in setfuture, this is racy, and we don't
            // care if we are successful or not.
```

### RuleId[ruleID=DataFlowIssue]
Expression `old` might evaluate to null but is returned by the method declared as @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
          future.waiters = update;
        }
        return old;
      }
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `executorService` might be null
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
              try {
                startUp();
                runningTask = scheduler().schedule(delegate, executorService, task);
                notifyStarted();
              } catch (Throwable t) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `cancel` may produce `NullPointerException`
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
                if (runningTask != null) {
                  // prevent the task from running if possible
                  runningTask.cancel(false);
                }
              } finally {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `execute` may produce `NullPointerException`
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
                }
              });
      executorService.execute(
          new Runnable() {
            @Override
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `cancel` may produce `NullPointerException`
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
      requireNonNull(runningTask);
      requireNonNull(executorService);
      runningTask.cancel(false);
      executorService.execute(
          new Runnable() {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `execute` may produce `NullPointerException`
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
      requireNonNull(executorService);
      runningTask.cancel(false);
      executorService.execute(
          new Runnable() {
            @Override
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `compareTo` may produce `NullPointerException`
in `guava/src/com/google/common/collect/ForwardingSortedMap.java`
#### Snippet
```java
      @CheckForNull Comparator<?> comparator, @CheckForNull Object o1, @CheckForNull Object o2) {
    if (comparator == null) {
      return ((Comparable<@Nullable Object>) o1).compareTo(o2);
    } else {
      return ((Comparator<@Nullable Object>) comparator).compare(o1, o2);
```

### RuleId[ruleID=DataFlowIssue]
Argument `o2` might be null
in `guava/src/com/google/common/collect/ForwardingSortedMap.java`
#### Snippet
```java
      @CheckForNull Comparator<?> comparator, @CheckForNull Object o1, @CheckForNull Object o2) {
    if (comparator == null) {
      return ((Comparable<@Nullable Object>) o1).compareTo(o2);
    } else {
      return ((Comparator<@Nullable Object>) comparator).compare(o1, o2);
```

### RuleId[ruleID=DataFlowIssue]
Argument `element` might be null
in `guava/src/com/google/common/collect/ConcurrentHashMultiset.java`
#### Snippet
```java
            // Just CASed to 0; remove the entry to clean up the map. If the removal fails,
            // another thread has already replaced it with a new counter, which is fine.
            countMap.remove(element, existingCounter);
          }
          return oldValue;
```

### RuleId[ruleID=DataFlowIssue]
Argument `element` might be null
in `guava/src/com/google/common/collect/ConcurrentHashMultiset.java`
#### Snippet
```java
          // Just CASed to 0; remove the entry to clean up the map. If the removal fails,
          // another thread has already replaced it with a new counter, which is fine.
          countMap.remove(element, existingCounter);
        }
        return true;
```

### RuleId[ruleID=DataFlowIssue]
The call to 'checkRoundingUnnecessary' always fails, according to its method contracts
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    switch (mode) {
      case UNNECESSARY:
        checkRoundingUnnecessary(rem == 0);
        // fall through
      case DOWN:
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `compare` may produce `NullPointerException`
in `guava/src/com/google/common/collect/ContiguousSet.java`
#### Snippet
```java
    checkNotNull(fromElement);
    checkNotNull(toElement);
    checkArgument(comparator().compare(fromElement, toElement) <= 0);
    return subSetImpl(fromElement, true, toElement, false);
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `compare` may produce `NullPointerException`
in `guava/src/com/google/common/collect/ContiguousSet.java`
#### Snippet
```java
    checkNotNull(fromElement);
    checkNotNull(toElement);
    checkArgument(comparator().compare(fromElement, toElement) <= 0);
    return subSetImpl(fromElement, fromInclusive, toElement, toInclusive);
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `removeMax` may produce `NullPointerException`
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
        AvlNode<E> newTop = pred();
        // newTop is the maximum node in my left subtree
        newTop.left = left.removeMax(newTop);
        newTop.right = right;
        newTop.distinctElements = distinctElements - 1;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `removeMin` may produce `NullPointerException`
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
      } else {
        AvlNode<E> newTop = succ();
        newTop.right = right.removeMin(newTop);
        newTop.left = left;
        newTop.distinctElements = distinctElements - 1;
```

### RuleId[ruleID=DataFlowIssue]
Argument `left` might be null
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
    private AvlNode<E> addLeftChild(@ParametricNullness E e, int count) {
      left = new AvlNode<E>(e, count);
      successor(pred(), left, this);
      height = Math.max(2, height);
      distinctElements++;
```

### RuleId[ruleID=DataFlowIssue]
Argument `comparator()` might be null
in `guava/src/com/google/common/collect/RegularImmutableSortedSet.java`
#### Snippet
```java
      targets = ((Multiset<?>) targets).elementSet();
    }
    if (!SortedIterables.hasSameComparator(comparator(), targets) || (targets.size() <= 1)) {
      return super.containsAll(targets);
    }
```

### RuleId[ruleID=DataFlowIssue]
The call to 'checkRoundingUnnecessary' always fails, according to its method contracts
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    switch (mode) {
      case UNNECESSARY:
        checkRoundingUnnecessary(rem == 0);
        // fall through
      case DOWN:
```

### RuleId[ruleID=DataFlowIssue]
Argument `forward.comparator()` might be null
in `guava/src/com/google/common/collect/DescendingImmutableSortedSet.java`
#### Snippet
```java

  DescendingImmutableSortedSet(ImmutableSortedSet<E> forward) {
    super(Ordering.from(forward.comparator()).reverse());
    this.forward = forward;
  }
```

### RuleId[ruleID=DataFlowIssue]
Argument `successor` might be null
in `guava/src/com/google/common/collect/CompactLinkedHashSet.java`
#### Snippet
```java
    if (predecessor != null && successor != null) {
      Arrays.fill(predecessor, 0, size(), 0);
      Arrays.fill(successor, 0, size(), 0);
    }
    super.clear();
```

### RuleId[ruleID=DataFlowIssue]
Expression `result` might evaluate to null but is returned by the method declared as @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
        result = upperCase = (upper == alphabet) ? this : newInstance(upper, paddingChar);
      }
      return result;
    }

```

### RuleId[ruleID=DataFlowIssue]
Expression `result` might evaluate to null but is returned by the method declared as @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
        result = ignoreCase = (ignore == alphabet) ? this : newInstance(ignore, paddingChar);
      }
      return result;
    }

```

### RuleId[ruleID=DataFlowIssue]
Expression `result` might evaluate to null but is returned by the method declared as @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
        result = lowerCase = (lower == alphabet) ? this : newInstance(lower, paddingChar);
      }
      return result;
    }

```

### RuleId[ruleID=DataFlowIssue]
@CheckForNull method 'unsafeDoBackward' always returns a non-null value
in `guava/src/com/google/common/base/Converter.java`
#### Snippet
```java
  }

  @CheckForNull
  private A unsafeDoBackward(@CheckForNull B b) {
    return doBackward(uncheckedCastNullableTToT(b));
```

### RuleId[ruleID=DataFlowIssue]
Argument `uncheckedCastNullableTToT(b)` might be null
in `guava/src/com/google/common/base/Converter.java`
#### Snippet
```java
  @CheckForNull
  private A unsafeDoBackward(@CheckForNull B b) {
    return doBackward(uncheckedCastNullableTToT(b));
  }

```

### RuleId[ruleID=DataFlowIssue]
@CheckForNull method 'unsafeDoForward' always returns a non-null value
in `guava/src/com/google/common/base/Converter.java`
#### Snippet
```java
   */

  @CheckForNull
  private B unsafeDoForward(@CheckForNull A a) {
    return doForward(uncheckedCastNullableTToT(a));
```

### RuleId[ruleID=DataFlowIssue]
Argument `uncheckedCastNullableTToT(a)` might be null
in `guava/src/com/google/common/base/Converter.java`
#### Snippet
```java
  @CheckForNull
  private B unsafeDoForward(@CheckForNull A a) {
    return doForward(uncheckedCastNullableTToT(a));
  }

```

### RuleId[ruleID=DataFlowIssue]
Argument `PATH_SEPARATOR.value()` might be null
in `guava/src/com/google/common/reflect/ClassPath.java`
#### Snippet
```java
  static ImmutableList<URL> parseJavaClassPath() {
    ImmutableList.Builder<URL> urls = ImmutableList.builder();
    for (String entry : Splitter.on(PATH_SEPARATOR.value()).split(JAVA_CLASS_PATH.value())) {
      try {
        try {
```

### RuleId[ruleID=DataFlowIssue]
Argument `JAVA_CLASS_PATH.value()` might be null
in `guava/src/com/google/common/reflect/ClassPath.java`
#### Snippet
```java
  static ImmutableList<URL> parseJavaClassPath() {
    ImmutableList.Builder<URL> urls = ImmutableList.builder();
    for (String entry : Splitter.on(PATH_SEPARATOR.value()).split(JAVA_CLASS_PATH.value())) {
      try {
        try {
```

### RuleId[ruleID=DataFlowIssue]
Argument `get()` might be null
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    @Override
    public WeakValueReference<K, V, E> copyFor(ReferenceQueue<V> queue, E entry) {
      return new WeakValueReferenceImpl<>(queue, get(), entry);
    }
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
        E first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `set` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
     */
    void setTableEntryForTesting(int i, InternalEntry<K, V, ?> entry) {
      table.set(i, castForTesting(entry));
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      // read this volatile field only once
      AtomicReferenceArray<E> table = this.table;
      return table.get(hash & (table.length() - 1));
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        int newCount = count - 1;
        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
        E first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        try {
          AtomicReferenceArray<E> table = this.table;
          for (int i = 0; i < table.length(); ++i) {
            table.set(i, null);
          }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        if (currentSegment.count != 0) {
          currentTable = currentSegment.table;
          nextTableIndex = currentTable.length() - 1;
          if (nextInTable()) {
            return;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        int newCount = this.count - 1;
        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
        E first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `postReadCleanup` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        }
      } finally {
        currentSegment.postReadCleanup();
      }
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      try {
        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
        E first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
        E first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        int newCount = this.count - 1;
        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
        E first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    void expand() {
      AtomicReferenceArray<E> oldTable = table;
      int oldCapacity = oldTable.length();
      if (oldCapacity >= MAXIMUM_CAPACITY) {
        return;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        if (count != 0) { // read-volatile
          AtomicReferenceArray<E> table = this.table;
          int length = table.length();
          for (int i = 0; i < length; ++i) {
            for (E e = table.get(i); e != null; e = e.getNext()) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    boolean nextInTable() {
      while (nextTableIndex >= 0) {
        if ((nextEntry = currentTable.get(nextTableIndex--)) != null) {
          if (advanceTo(nextEntry) || nextInChain()) {
            return true;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

        AtomicReferenceArray<E> table = segment.table;
        for (int j = 0; j < table.length(); j++) {
          for (E e = table.get(j); e != null; e = e.getNext()) {
            V v = segment.getLiveValue(e);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      int newCount = this.count - 1;
      AtomicReferenceArray<E> table = this.table;
      int index = hash & (table.length() - 1);
      E first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
        E first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        int newCount = this.count - 1;
        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
        E first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Argument `next` might be null
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    /** Unsafely returns a fresh entry. */
    E newEntryForTesting(K key, int hash, @CheckForNull InternalEntry<K, V, ?> next) {
      return this.map.entryHelper.newEntry(self(), key, hash, castForTesting(next));
    }

```

### RuleId[ruleID=DataFlowIssue]
Argument `newNext` might be null
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    /** Unsafely returns a copy of the given entry. */
    E copyForTesting(InternalEntry<K, V, ?> entry, @CheckForNull InternalEntry<K, V, ?> newNext) {
      return this.map.entryHelper.copy(self(), castForTesting(entry), castForTesting(newNext));
    }

```

### RuleId[ruleID=DataFlowIssue]
The call to 'checkState' always fails, according to its method contracts
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java
   */
  void setDelegates(Map<K, V> forward, Map<V, K> backward) {
    checkState(delegate == null);
    checkState(inverse == null);
    checkArgument(forward.isEmpty());
```

### RuleId[ruleID=DataFlowIssue]
Expression `delegateCollection().comparator()` might evaluate to null but is returned by the method declared as @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/collect/ImmutableSortedAsList.java`
#### Snippet
```java
  @Override
  public Comparator<? super E> comparator() {
    return delegateCollection().comparator();
  }

```

### RuleId[ruleID=DataFlowIssue]
Dereference of `p` may produce `NullPointerException`
in `guava/src/com/google/common/util/concurrent/Monitor.java`
#### Snippet
```java
    if (waiters == 0) {
      // unlink guard from activeGuards
      for (Guard p = activeGuards, pred = null; ; pred = p, p = p.next) {
        if (p == guard) {
          if (pred == null) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        int newCount = this.count - 1;
        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
              && map.keyEquivalence.equivalent(key, entryKey)) {
            ValueReference<K, V> valueReference = e.getValueReference();
            V entryValue = valueReference.get();

            RemovalCause cause;
```

### RuleId[ruleID=DataFlowIssue]
Argument `entryValue` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
            ++modCount;
            ReferenceEntry<K, V> newFirst =
                removeValueFromChain(first, e, entryKey, hash, entryValue, valueReference, cause);
            newCount = this.count - 1;
            table.set(index, newFirst);
```

### RuleId[ruleID=DataFlowIssue]
Argument `segment.keyReferenceQueue` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      <K, V> ReferenceEntry<K, V> newEntry(
          Segment<K, V> segment, K key, int hash, @CheckForNull ReferenceEntry<K, V> next) {
        return new WeakAccessEntry<>(segment.keyReferenceQueue, key, hash, next);
      }

```

### RuleId[ruleID=DataFlowIssue]
Argument `segment.valueReferenceQueue` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
          Segment<K, V> segment, ReferenceEntry<K, V> entry, V value, int weight) {
        return (weight == 1)
            ? new SoftValueReference<K, V>(segment.valueReferenceQueue, value, entry)
            : new WeightedSoftValueReference<K, V>(
                segment.valueReferenceQueue, value, entry, weight);
```

### RuleId[ruleID=DataFlowIssue]
Argument `segment.valueReferenceQueue` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
            ? new SoftValueReference<K, V>(segment.valueReferenceQueue, value, entry)
            : new WeightedSoftValueReference<K, V>(
                segment.valueReferenceQueue, value, entry, weight);
      }

```

### RuleId[ruleID=DataFlowIssue]
Argument `key` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        V value = getLiveValue(entry, now);
        if (value != null) {
          nextExternal = new WriteThroughEntry(key, value);
          return true;
        } else {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `postReadCleanup` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        }
      } finally {
        currentSegment.postReadCleanup();
      }
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

      ValueReference<K, V> valueReference = original.getValueReference();
      V value = valueReference.get();
      if ((value == null) && valueReference.isActive()) {
        // value collected
```

### RuleId[ruleID=DataFlowIssue]
Argument `this.valueReferenceQueue` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

      ReferenceEntry<K, V> newEntry = map.entryFactory.copyEntry(this, original, newNext, key);
      newEntry.setValueReference(valueReference.copyFor(this.valueReferenceQueue, value, newEntry));
      return newEntry;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `poll` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    void clearKeyReferenceQueue() {
      while (keyReferenceQueue.poll() != null) {}
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      try {
        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Argument `segment.valueReferenceQueue` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
          Segment<K, V> segment, ReferenceEntry<K, V> entry, V value, int weight) {
        return (weight == 1)
            ? new WeakValueReference<K, V>(segment.valueReferenceQueue, value, entry)
            : new WeightedWeakValueReference<K, V>(
                segment.valueReferenceQueue, value, entry, weight);
```

### RuleId[ruleID=DataFlowIssue]
Argument `segment.valueReferenceQueue` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
            ? new WeakValueReference<K, V>(segment.valueReferenceQueue, value, entry)
            : new WeightedWeakValueReference<K, V>(
                segment.valueReferenceQueue, value, entry, weight);
      }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isLoading` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
            }
            ValueReference<K, V> valueReference = e.getValueReference();
            if (valueReference.isLoading()) {
              return waitForLoadingValue(e, key, valueReference);
            }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

          AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
          for (int i = 0; i < table.length(); ++i) {
            for (ReferenceEntry<K, V> e = table.get(i); e != null; e = e.getNext()) {
              // Loading references aren't actually in the map yet.
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isActive` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
            for (ReferenceEntry<K, V> e = table.get(i); e != null; e = e.getNext()) {
              // Loading references aren't actually in the map yet.
              if (e.getValueReference().isActive()) {
                K key = e.getKey();
                V value = e.getValueReference().get();
```

### RuleId[ruleID=DataFlowIssue]
Argument `defaultLoader` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      if (!keysToLoad.isEmpty()) {
        try {
          Map<K, V> newEntries = loadAll(unmodifiableSet(keysToLoad), defaultLoader);
          for (K key : keysToLoad) {
            V value = newEntries.get(key);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
          Map<K, V> newEntries = loadAll(unmodifiableSet(keysToLoad), defaultLoader);
          for (K key : keysToLoad) {
            V value = newEntries.get(key);
            if (value == null) {
              throw new InvalidCacheLoadException("loadAll failed to return a value for " + key);
```

### RuleId[ruleID=DataFlowIssue]
Argument `defaultLoader` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
          for (K key : keysToLoad) {
            misses--; // get will count this miss
            result.put(key, get(key, defaultLoader));
          }
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `poll` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      Reference<? extends V> ref;
      int i = 0;
      while ((ref = valueReferenceQueue.poll()) != null) {
        @SuppressWarnings("unchecked")
        ValueReference<K, V> valueReference = (ValueReference<K, V>) ref;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
              && map.keyEquivalence.equivalent(key, entryKey)) {
            ValueReference<K, V> valueReference = e.getValueReference();
            V entryValue = valueReference.get();
            if (entryValue == null) {
              if (valueReference.isActive()) {
```

### RuleId[ruleID=DataFlowIssue]
Passing `null` argument to parameter annotated as @NotNull
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
                        entryKey,
                        hash,
                        entryValue,
                        valueReference,
                        RemovalCause.COLLECTED);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        int newCount = this.count - 1;
        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Argument `valueReference.get()` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
                      entryKey,
                      hash,
                      valueReference.get(),
                      valueReference,
                      RemovalCause.COLLECTED);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getWeight` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    ReferenceEntry<K, V> getNextEvictable() {
      for (ReferenceEntry<K, V> e : accessQueue) {
        int weight = e.getValueReference().getWeight();
        if (weight > 0) {
          return e;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      // read this volatile field only once
      AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
      return table.get(hash & (table.length() - 1));
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `notifyNewValue` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      entry.setValueReference(valueReference);
      recordWrite(entry, weight, now);
      previous.notifyNewValue(value);
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isLoading` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

            ValueReference<K, V> valueReference = e.getValueReference();
            if (valueReference.isLoading()
                || (checkTime && (now - e.getWriteTime() < map.refreshNanos))) {
              // refresh is a no-op if loading is pending
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @Override
    public V get(K key) throws ExecutionException {
      return autoDelegate.get(key);
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        AtomicReferenceArray<ReferenceEntry<K, V>> table = segment.table;
        for (int j = 0; j < table.length(); j++) {
          for (ReferenceEntry<K, V> e = table.get(j); e != null; e = e.getNext()) {
            V v = segment.getLiveValue(e, now);
```

### RuleId[ruleID=DataFlowIssue]
Argument `segment.keyReferenceQueue` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      <K, V> ReferenceEntry<K, V> newEntry(
          Segment<K, V> segment, K key, int hash, @CheckForNull ReferenceEntry<K, V> next) {
        return new WeakWriteEntry<>(segment.keyReferenceQueue, key, hash, next);
      }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getAll` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @Override
    public ImmutableMap<K, V> getAll(Iterable<? extends K> keys) throws ExecutionException {
      return autoDelegate.getAll(keys);
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      return null;
    }
    V value = entry.getValueReference().get();
    if (value == null) {
      return null;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      int newCount = this.count - 1;
      AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
      int index = hash & (table.length() - 1);
      ReferenceEntry<K, V> first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Argument `e.getValueReference().get()` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
                  e.getKey(),
                  hash,
                  e.getValueReference().get(),
                  e.getValueReference(),
                  cause);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
                  e.getKey(),
                  hash,
                  e.getValueReference().get(),
                  e.getValueReference(),
                  cause);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

            ValueReference<K, V> valueReference = e.getValueReference();
            V entryValue = valueReference.get();

            if (entryValue == null) {
```

### RuleId[ruleID=DataFlowIssue]
Passing `null` argument to parameter annotated as @NotNull
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    public LoadingValueReference() {
      this(null);
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        int newCount = count - 1;
        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Argument `e.getValueReference().get()` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
                    e.getKey(),
                    hash,
                    e.getValueReference().get(),
                    e.getValueReference(),
                    RemovalCause.COLLECTED);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
                    e.getKey(),
                    hash,
                    e.getValueReference().get(),
                    e.getValueReference(),
                    RemovalCause.COLLECTED);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
              && map.keyEquivalence.equivalent(key, entryKey)) {
            ValueReference<K, V> valueReference = e.getValueReference();
            V entryValue = valueReference.get();
            // replace the old LoadingValueReference if it's live, otherwise
            // perform a putIfAbsent
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        int newCount = this.count - 1;
        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
              && map.keyEquivalence.equivalent(key, entryKey)) {
            ValueReference<K, V> valueReference = e.getValueReference();
            V entryValue = valueReference.get();

            RemovalCause cause;
```

### RuleId[ruleID=DataFlowIssue]
Argument `entryValue` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
            ++modCount;
            ReferenceEntry<K, V> newFirst =
                removeValueFromChain(first, e, entryKey, hash, entryValue, valueReference, cause);
            newCount = this.count - 1;
            table.set(index, newFirst);
```

### RuleId[ruleID=DataFlowIssue]
Argument `defaultLoader` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

  V getOrLoad(K key) throws ExecutionException {
    return get(key, defaultLoader);
  }

```

### RuleId[ruleID=DataFlowIssue]
Argument `defaultLoader` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
  void refresh(K key) {
    int hash = hash(checkNotNull(key));
    segmentFor(hash).refresh(key, hash, defaultLoader, false);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
          long now = map.ticker.read();
          AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
          int length = table.length();
          for (int i = 0; i < length; ++i) {
            for (ReferenceEntry<K, V> e = table.get(i); e != null; e = e.getNext()) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        return null;
      }
      V value = entry.getValueReference().get();
      if (value == null) {
        tryDrainReferenceQueues();
```

### RuleId[ruleID=DataFlowIssue]
Argument `segment.keyReferenceQueue` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      <K, V> ReferenceEntry<K, V> newEntry(
          Segment<K, V> segment, K key, int hash, @CheckForNull ReferenceEntry<K, V> next) {
        return new WeakAccessWriteEntry<>(segment.keyReferenceQueue, key, hash, next);
      }

```

### RuleId[ruleID=DataFlowIssue]
Argument `e` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      ReferenceEntry<K, V> newFirst = entry.getNext();
      for (ReferenceEntry<K, V> e = first; e != entry; e = e.getNext()) {
        ReferenceEntry<K, V> next = copyEntry(e, newFirst);
        if (next != null) {
          newFirst = next;
```

### RuleId[ruleID=DataFlowIssue]
Argument `newFirst` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      ReferenceEntry<K, V> newFirst = entry.getNext();
      for (ReferenceEntry<K, V> e = first; e != entry; e = e.getNext()) {
        ReferenceEntry<K, V> next = copyEntry(e, newFirst);
        if (next != null) {
          newFirst = next;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
              && map.keyEquivalence.equivalent(key, entryKey)) {
            ValueReference<K, V> valueReference = e.getValueReference();
            V entryValue = valueReference.get();
            if (entryValue == null) {
              if (valueReference.isActive()) {
```

### RuleId[ruleID=DataFlowIssue]
Passing `null` argument to parameter annotated as @NotNull
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
                        entryKey,
                        hash,
                        entryValue,
                        valueReference,
                        RemovalCause.COLLECTED);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
                  entryKey,
                  hash,
                  valueReference.get(),
                  valueReference.getWeight(),
                  RemovalCause.EXPIRED);
```

### RuleId[ruleID=DataFlowIssue]
Argument `valueReference` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        // note valueReference can be an existing value or even itself another loading value if
        // the value for the key is already being computed.
        computingValueReference = new ComputingValueReference<>(valueReference);

        if (e == null) {
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        if (e == null) {
          createNewEntry = true;
          e = newEntry(key, hash, first);
          e.setValueReference(computingValueReference);
```

### RuleId[ruleID=DataFlowIssue]
Argument `cache.defaultLoader` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
          cache.removalListener,
          cache.ticker,
          cache.defaultLoader);
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getUnchecked` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @Override
    public V getUnchecked(K key) {
      return autoDelegate.getUnchecked(key);
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getHash` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
  void reclaimValue(ValueReference<K, V> valueReference) {
    ReferenceEntry<K, V> entry = valueReference.getEntry();
    int hash = entry.getHash();
    segmentFor(hash).reclaimValue(entry.getKey(), hash, valueReference);
  }
```

### RuleId[ruleID=DataFlowIssue]
Argument `entry.getKey()` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    ReferenceEntry<K, V> entry = valueReference.getEntry();
    int hash = entry.getHash();
    segmentFor(hash).reclaimValue(entry.getKey(), hash, valueReference);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `poll` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      Reference<? extends K> ref;
      int i = 0;
      while ((ref = keyReferenceQueue.poll()) != null) {
        @SuppressWarnings("unchecked")
        ReferenceEntry<K, V> entry = (ReferenceEntry<K, V>) ref;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    boolean nextInTable() {
      while (nextTableIndex >= 0) {
        if ((nextEntry = currentTable.get(nextTableIndex--)) != null) {
          if (advanceTo(nextEntry) || nextInChain()) {
            return true;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    void expand() {
      AtomicReferenceArray<ReferenceEntry<K, V>> oldTable = table;
      int oldCapacity = oldTable.length();
      if (oldCapacity >= MAXIMUM_CAPACITY) {
        return;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getHash` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
            // Clone nodes leading up to the tail.
            for (ReferenceEntry<K, V> e = head; e != tail; e = e.getNext()) {
              int newIndex = e.getHash() & newMask;
              ReferenceEntry<K, V> newNext = newTable.get(newIndex);
              ReferenceEntry<K, V> newFirst = copyEntry(e, newNext);
```

### RuleId[ruleID=DataFlowIssue]
Argument `segment.keyReferenceQueue` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      <K, V> ReferenceEntry<K, V> newEntry(
          Segment<K, V> segment, K key, int hash, @CheckForNull ReferenceEntry<K, V> next) {
        return new WeakEntry<>(segment.keyReferenceQueue, key, hash, next);
      }
    },
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
          entry.getKey(),
          entry.getHash(),
          entry.getValueReference().get(),
          entry.getValueReference().getWeight(),
          RemovalCause.COLLECTED);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
            return false;
          }
          return e.getValueReference().get() != null;
        }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        int newCount = this.count - 1;
        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isLoading` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
              && map.keyEquivalence.equivalent(key, entryKey)) {
            valueReference = e.getValueReference();
            if (valueReference.isLoading()) {
              createNewEntry = false;
            } else {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `poll` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    void clearValueReferenceQueue() {
      while (valueReferenceQueue.poll() != null) {}
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isLoading` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      if (map.refreshes()
          && (now - entry.getWriteTime() > map.refreshNanos)
          && !entry.getValueReference().isLoading()) {
        V newValue = refresh(key, hash, loader, true);
        if (newValue != null) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
          }

          V value = e.getValueReference().get();
          if (value != null) {
            recordRead(e, now);
```

### RuleId[ruleID=DataFlowIssue]
Argument `e.getKey()` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
          if (value != null) {
            recordRead(e, now);
            return scheduleRefresh(e, e.getKey(), hash, value, now, map.defaultLoader);
          }
          tryDrainReferenceQueues();
```

### RuleId[ruleID=DataFlowIssue]
Argument `map.defaultLoader` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
          if (value != null) {
            recordRead(e, now);
            return scheduleRefresh(e, e.getKey(), hash, value, now, map.defaultLoader);
          }
          tryDrainReferenceQueues();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `refresh` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @Override
    public void refresh(K key) {
      autoDelegate.refresh(key);
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getWeight` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      // If the newest entry by itself is too heavy for the segment, don't bother evicting
      // anything else, just that
      if (newest.getValueReference().getWeight() > maxSegmentWeight) {
        if (!removeEntry(newest, newest.getHash(), RemovalCause.SIZE)) {
          throw new AssertionError();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        if (currentSegment.count != 0) {
          currentTable = currentSegment.table;
          nextTableIndex = currentTable.length() - 1;
          if (nextInTable()) {
            return;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `apply` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @Override
    public V apply(K key) {
      return autoDelegate.apply(key);
    }

```

### RuleId[ruleID=DataFlowIssue]
Argument `iterator.next()` might be null
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
  public final Optional<E> first() {
    Iterator<E> iterator = getDelegate().iterator();
    return iterator.hasNext() ? Optional.of(iterator.next()) : Optional.<E>absent();
  }

```

### RuleId[ruleID=DataFlowIssue]
Argument `list.get(list.size() - 1)` might be null
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
        return Optional.absent();
      }
      return Optional.of(list.get(list.size() - 1));
    }
    Iterator<E> iterator = iterable.iterator();
```

### RuleId[ruleID=DataFlowIssue]
Argument `sortedSet.last()` might be null
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
    if (iterable instanceof SortedSet) {
      SortedSet<E> sortedSet = (SortedSet<E>) iterable;
      return Optional.of(sortedSet.last());
    }

```

### RuleId[ruleID=DataFlowIssue]
Argument `current` might be null
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
      E current = iterator.next();
      if (!iterator.hasNext()) {
        return Optional.of(current);
      }
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `key` might be null
in `guava/src/com/google/common/collect/ForwardingConcurrentMap.java`
#### Snippet
```java
  @Override
  public boolean remove(@CheckForNull Object key, @CheckForNull Object value) {
    return delegate().remove(key, value);
  }

```

### RuleId[ruleID=DataFlowIssue]
Argument `enumClass.cast(ref.get())` might be null
in `guava/src/com/google/common/base/Platform.java`
#### Snippet
```java
  static <T extends Enum<T>> Optional<T> getEnumIfPresent(Class<T> enumClass, String value) {
    WeakReference<? extends Enum<?>> ref = Enums.getEnumConstants(enumClass).get(value);
    return ref == null ? Optional.<T>absent() : Optional.of(enumClass.cast(ref.get()));
  }

```

### RuleId[ruleID=DataFlowIssue]
Dereference of `bucketEntry` may produce `NullPointerException`
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
    for (BiEntry<K, V> bucketEntry = hashTableKToV[keyBucket];
        true;
        bucketEntry = bucketEntry.nextInKToVBucket) {
      if (bucketEntry == entry) {
        if (prevBucketEntry == null) {
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `bucketEntry` may produce `NullPointerException`
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
    for (BiEntry<K, V> bucketEntry = hashTableVToK[valueBucket];
        true;
        bucketEntry = bucketEntry.nextInVToKBucket) {
      if (bucketEntry == entry) {
        if (prevBucketEntry == null) {
```

### RuleId[ruleID=DataFlowIssue]
Expression `elementSet().comparator()` might evaluate to null but is returned by the method declared as @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/collect/ImmutableSortedMultiset.java`
#### Snippet
```java
  @Override
  public final Comparator<? super E> comparator() {
    return elementSet().comparator();
  }

```

### RuleId[ruleID=DataFlowIssue]
Argument `value` might be null
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
        K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
      synchronized (mutex) {
        return delegate().merge(key, value, remappingFunction);
      }
    }
```

### RuleId[ruleID=DataFlowIssue]
Expression `whenClosed = new CountDownLatch(1)` might evaluate to null but is returned by the method declared as @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
        }
        checkState(whenClosed == null);
        return whenClosed = new CountDownLatch(1);
      }
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `countDown` may produce `NullPointerException`
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
      clear();
      if (whenClosed != null) {
        whenClosed.countDown();
      }
    }
```

### RuleId[ruleID=DataFlowIssue]
Result of 'min' is the same as the second argument making the call meaningless
in `guava/src/com/google/common/util/concurrent/ListenableFutureTask.java`
#### Snippet
```java
    // Waiting 68 years should be enough for any program.
    return super.get(
        min(timeoutNanos, OverflowAvoidingLockSupport.MAX_NANOSECONDS_THRESHOLD), NANOSECONDS);
  }

```

### RuleId[ruleID=DataFlowIssue]
Expression `keySet().comparator()` might evaluate to null but is returned by the method declared as @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
  @Override
  public Comparator<? super K> comparator() {
    return keySet().comparator();
  }

```

### RuleId[ruleID=DataFlowIssue]
The call to 'checkRemove' always fails, according to its method contracts
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
    @Override
    public void remove() {
      checkRemove(false);
    }
  }
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'trimToSize' is still used
in `guava/src/com/google/common/collect/ArrayListMultimap.java`
#### Snippet
```java
   */
  @Deprecated
  public void trimToSize() {
    for (Collection<V> collection : backingMap().values()) {
      ArrayList<V> arrayList = (ArrayList<V>) collection;
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'murmur3_32' is still used
in `guava/src/com/google/common/hash/Hashing.java`
#### Snippet
```java
   */
  @Deprecated
  public static HashFunction murmur3_32() {
    return Murmur3_32HashFunction.MURMUR3_32;
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'murmur3_32' is still used
in `guava/src/com/google/common/hash/Hashing.java`
#### Snippet
```java
   */
  @Deprecated
  public static HashFunction murmur3_32(int seed) {
    return new Murmur3_32HashFunction(seed, /* supplementaryPlaneFix= */ false);
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'sha1' is still used
in `guava/src/com/google/common/hash/Hashing.java`
#### Snippet
```java
   */
  @Deprecated
  public static HashFunction sha1() {
    return Sha1Holder.SHA_1;
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'invisible' is still used
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
   */
  @Deprecated
  public static CharMatcher invisible() {
    return Invisible.INSTANCE;
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'singleWidth' is still used
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
   */
  @Deprecated
  public static CharMatcher singleWidth() {
    return SingleWidth.INSTANCE;
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'javaDigit' is still used
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
   */
  @Deprecated
  public static CharMatcher javaDigit() {
    return JavaDigit.INSTANCE;
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'unmodifiableMultiset' is still used
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
   */
  @Deprecated
  public static <E> Multiset<E> unmodifiableMultiset(ImmutableMultiset<E> multiset) {
    return checkNotNull(multiset);
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'columnComparator' is still used
in `guava/src/com/google/common/collect/TreeBasedTable.java`
#### Snippet
```java
   */
  @Deprecated
  public Comparator<? super C> columnComparator() {
    return columnComparator;
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'rowComparator' is still used
in `guava/src/com/google/common/collect/TreeBasedTable.java`
#### Snippet
```java
   */
  @Deprecated
  public Comparator<? super R> rowComparator() {
    /*
     * requireNonNull is safe because the factories require non-null Comparators, which they pass on
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'binarySearch' is still used
in `guava/src/com/google/common/collect/Ordering.java`
#### Snippet
```java
   */
  @Deprecated
  public int binarySearch(
      List<? extends T> sortedList, @ParametricNullness T key) {
    return Collections.binarySearch(sortedList, key, this);
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'writeBytes' is still used
in `guava/src/com/google/common/io/LittleEndianDataOutputStream.java`
#### Snippet
```java
  @Deprecated
  @Override
  public void writeBytes(String s) throws IOException {
    ((DataOutputStream) out).writeBytes(s);
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'JAVA_EXT_DIRS' is still used
in `guava/src/com/google/common/base/StandardSystemProperty.java`
#### Snippet
```java
   */
  @Deprecated
  JAVA_EXT_DIRS("java.ext.dirs"),

  /** Operating system name. */
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'keyComparator' is still used
in `guava/src/com/google/common/collect/TreeMultimap.java`
#### Snippet
```java
   */
  @Deprecated
  public Comparator<? super K> keyComparator() {
    return keyComparator;
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'eventuallyClosing' is still used
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
  @Deprecated
  public static <C extends @Nullable Object & @Nullable AutoCloseable>
      ClosingFuture<C> eventuallyClosing(
          ListenableFuture<C> future, final Executor closingExecutor) {
    checkNotNull(closingExecutor);
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'readFirstLine' is still used
in `guava/src/com/google/common/io/Files.java`
#### Snippet
```java
  @CheckForNull
  public
  static String readFirstLine(File file, Charset charset) throws IOException {
    return asCharSource(file, charset).readFirstLine();
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'createTempDir' is still used
in `guava/src/com/google/common/io/Files.java`
#### Snippet
```java
  @Beta
  @Deprecated
  public static File createTempDir() {
    File baseDir = new File(System.getProperty("java.io.tmpdir"));
    @SuppressWarnings("GoodTime") // reading system time without TimeSource
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'readBytes' is still used
in `guava/src/com/google/common/io/Files.java`
#### Snippet
```java
  @ParametricNullness
  public
  static <T extends @Nullable Object> T readBytes(File file, ByteProcessor<T> processor)
      throws IOException {
    return asByteSource(file).read(processor);
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'orderEntriesByValue' is still used
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
    @Deprecated
    @DoNotCall("Always throws UnsupportedOperationException")
    public final Builder<K, V> orderEntriesByValue(Comparator<? super V> valueComparator) {
      throw new UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
    }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'newSetFromMap' is still used
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
   */
  @Deprecated
  public static <E extends @Nullable Object> Set<E> newSetFromMap(
      Map<E, Boolean> map) {
    return Collections.newSetFromMap(map);
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'lazyStackTrace' is still used
in `guava/src/com/google/common/base/Throwables.java`
#### Snippet
```java
  @Deprecated
  @GwtIncompatible // lazyStackTraceIsLazy, jlaStackTrace
  public static List<StackTraceElement> lazyStackTrace(Throwable throwable) {
    return lazyStackTraceIsLazy()
        ? jlaStackTrace(throwable)
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'peekingIterator' is still used
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
   */
  @Deprecated
  public static <T extends @Nullable Object> PeekingIterator<T> peekingIterator(
      PeekingIterator<T> iterator) {
    return checkNotNull(iterator);
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'propagateIfInstanceOf' is still used
in `guava/src/com/google/common/base/Throwables.java`
#### Snippet
```java
  @Deprecated
  @GwtIncompatible // throwIfInstanceOf
  public static <X extends Throwable> void propagateIfInstanceOf(
      @CheckForNull Throwable throwable, Class<X> declaredType) throws X {
    if (throwable != null) {
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'propagateIfPossible' is still used
in `guava/src/com/google/common/base/Throwables.java`
#### Snippet
```java
  @Deprecated
  @GwtIncompatible
  public static void propagateIfPossible(@CheckForNull Throwable throwable) {
    if (throwable != null) {
      throwIfUnchecked(throwable);
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'lazyStackTraceIsLazy' is still used
in `guava/src/com/google/common/base/Throwables.java`
#### Snippet
```java
  @Deprecated
  @GwtIncompatible // getStackTraceElementMethod
  public static boolean lazyStackTraceIsLazy() {
    return getStackTraceElementMethod != null && getStackTraceDepthMethod != null;
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'unmodifiableIterable' is still used
in `guava/src/com/google/common/collect/Iterables.java`
#### Snippet
```java
   */
  @Deprecated
  public static <E> Iterable<E> unmodifiableIterable(ImmutableCollection<E> iterable) {
    return checkNotNull(iterable);
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'preOrderTraversal' is still used
in `guava/src/com/google/common/collect/TreeTraverser.java`
#### Snippet
```java
   */
  @Deprecated
  public final FluentIterable<T> preOrderTraversal(final T root) {
    checkNotNull(root);
    return new FluentIterable<T>() {
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'TreeTraverser' is still used
in `guava/src/com/google/common/collect/TreeTraverser.java`
#### Snippet
```java
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class TreeTraverser<T> {

  /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'breadthFirstTraversal' is still used
in `guava/src/com/google/common/collect/TreeTraverser.java`
#### Snippet
```java
   */
  @Deprecated
  public final FluentIterable<T> breadthFirstTraversal(final T root) {
    checkNotNull(root);
    return new FluentIterable<T>() {
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'postOrderTraversal' is still used
in `guava/src/com/google/common/collect/TreeTraverser.java`
#### Snippet
```java
   */
  @Deprecated
  public final FluentIterable<T> postOrderTraversal(final T root) {
    checkNotNull(root);
    return new FluentIterable<T>() {
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'unmodifiableListMultimap' is still used
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
   */
  @Deprecated
  public static <K, V> ListMultimap<K, V> unmodifiableListMultimap(
      ImmutableListMultimap<K, V> delegate) {
    return checkNotNull(delegate);
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'unmodifiableSetMultimap' is still used
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
   */
  @Deprecated
  public static <K, V> SetMultimap<K, V> unmodifiableSetMultimap(
      ImmutableSetMultimap<K, V> delegate) {
    return checkNotNull(delegate);
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'unmodifiableMultimap' is still used
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
   */
  @Deprecated
  public static <K, V> Multimap<K, V> unmodifiableMultimap(ImmutableMultimap<K, V> delegate) {
    return checkNotNull(delegate);
  }
```

## RuleId[ruleID=Convert2MethodRef]
### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `guava/src/com/google/common/collect/TableCollectors.java`
#### Snippet
```java
                mergeFunction),
        (s1, s2) -> s1.combine(s2, mergeFunction),
        state -> state.toTable());
  }

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
   * the lambda implementation is generated as a method in the _same class_ as the usage?
   */
  static final Supplier<StatsCounter> CACHE_STATS_COUNTER = () -> new SimpleStatsCounter();

  enum NullListener implements RemovalListener<Object, Object> {
```

## RuleId[ruleID=JavaReflectionMemberAccess]
### RuleId[ruleID=JavaReflectionMemberAccess]
Cannot resolve constructor with specified argument types
in `guava/src/com/google/common/base/internal/Finalizer.java`
#### Snippet
```java
  private static Constructor<Thread> getBigThreadConstructor() {
    try {
      return Thread.class.getConstructor(
          ThreadGroup.class, Runnable.class, String.class, long.class, boolean.class);
    } catch (Throwable t) {
      // Probably pre Java 9. We'll fall back to Thread.inheritableThreadLocals.
```

## RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
### RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
Unsynchronized method `reset()` overrides synchronized method
in `guava/src/com/google/common/hash/HashingInputStream.java`
#### Snippet
```java
   */
  @Override
  public void reset() throws IOException {
    throw new IOException("reset not supported");
  }
```

### RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
Unsynchronized method `mark()` overrides synchronized method
in `guava/src/com/google/common/hash/HashingInputStream.java`
#### Snippet
```java
  /** mark() is not supported for HashingInputStream */
  @Override
  public void mark(int readlimit) {}

  /**
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'defaultValue' in a Serializable class
in `guava/src/com/google/common/base/Functions.java`
#### Snippet
```java
      implements Function<K, V>, Serializable {
    final Map<K, ? extends V> map;
    @ParametricNullness final V defaultValue;

    ForMapWithDefault(Map<K, ? extends V> map, @ParametricNullness V defaultValue) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'value' in a Serializable class
in `guava/src/com/google/common/base/Functions.java`
#### Snippet
```java
  private static class ConstantFunction<E extends @Nullable Object>
      implements Function<@Nullable Object, E>, Serializable {
    @ParametricNullness private final E value;

    public ConstantFunction(@ParametricNullness E value) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'lowerEndpoint' in a Serializable class
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
  private final Comparator<? super T> comparator;
  private final boolean hasLowerBound;
  @CheckForNull private final T lowerEndpoint;
  private final BoundType lowerBoundType;
  private final boolean hasUpperBound;
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'upperEndpoint' in a Serializable class
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
  private final BoundType lowerBoundType;
  private final boolean hasUpperBound;
  @CheckForNull private final T upperEndpoint;
  private final BoundType upperBoundType;

```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'element' in a Serializable class
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
  static class ImmutableEntry<E extends @Nullable Object> extends AbstractEntry<E>
      implements Serializable {
    @ParametricNullness private final E element;
    private final int count;

```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'reference' in a Serializable class
in `guava/src/com/google/common/base/Equivalence.java`
#### Snippet
```java
    private final Equivalence<? super @NonNull T> equivalence;

    @ParametricNullness private final T reference;

    private Wrapper(Equivalence<? super @NonNull T> equivalence, @ParametricNullness T reference) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'value' in a Serializable class
in `guava/src/com/google/common/collect/ImmutableEntry.java`
#### Snippet
```java
    extends AbstractMapEntry<K, V> implements Serializable {
  @ParametricNullness final K key;
  @ParametricNullness final V value;

  ImmutableEntry(@ParametricNullness K key, @ParametricNullness V value) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'key' in a Serializable class
in `guava/src/com/google/common/collect/ImmutableEntry.java`
#### Snippet
```java
class ImmutableEntry<K extends @Nullable Object, V extends @Nullable Object>
    extends AbstractMapEntry<K, V> implements Serializable {
  @ParametricNullness final K key;
  @ParametricNullness final V value;

```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'rest' in a Serializable class
in `guava/src/com/google/common/collect/Lists.java`
#### Snippet
```java
      implements Serializable, RandomAccess {
    @ParametricNullness final E first;
    final E[] rest;

    OnePlusArrayList(@ParametricNullness E first, E[] rest) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'first' in a Serializable class
in `guava/src/com/google/common/collect/Lists.java`
#### Snippet
```java
  private static class OnePlusArrayList<E extends @Nullable Object> extends AbstractList<E>
      implements Serializable, RandomAccess {
    @ParametricNullness final E first;
    final E[] rest;

```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'second' in a Serializable class
in `guava/src/com/google/common/collect/Lists.java`
#### Snippet
```java
      implements Serializable, RandomAccess {
    @ParametricNullness final E first;
    @ParametricNullness final E second;
    final E[] rest;

```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'first' in a Serializable class
in `guava/src/com/google/common/collect/Lists.java`
#### Snippet
```java
  private static class TwoPlusArrayList<E extends @Nullable Object> extends AbstractList<E>
      implements Serializable, RandomAccess {
    @ParametricNullness final E first;
    @ParametricNullness final E second;
    final E[] rest;
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'rest' in a Serializable class
in `guava/src/com/google/common/collect/Lists.java`
#### Snippet
```java
    @ParametricNullness final E first;
    @ParametricNullness final E second;
    final E[] rest;

    TwoPlusArrayList(@ParametricNullness E first, @ParametricNullness E second, E[] rest) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'queueForValues' in a Serializable class
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      extends Segment<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {
    private final ReferenceQueue<K> queueForKeys = new ReferenceQueue<K>();
    private final ReferenceQueue<V> queueForValues = new ReferenceQueue<V>();

    WeakKeyWeakValueSegment(
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'queueForKeys' in a Serializable class
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
  static final class WeakKeyWeakValueSegment<K, V>
      extends Segment<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {
    private final ReferenceQueue<K> queueForKeys = new ReferenceQueue<K>();
    private final ReferenceQueue<V> queueForValues = new ReferenceQueue<V>();

```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'queueForValues' in a Serializable class
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
  static final class StrongKeyWeakValueSegment<K, V>
      extends Segment<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {
    private final ReferenceQueue<V> queueForValues = new ReferenceQueue<V>();

    StrongKeyWeakValueSegment(
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'queueForKeys' in a Serializable class
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
  static final class WeakKeyDummyValueSegment<K>
      extends Segment<K, Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {
    private final ReferenceQueue<K> queueForKeys = new ReferenceQueue<K>();

    WeakKeyDummyValueSegment(
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'queueForKeys' in a Serializable class
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
  static final class WeakKeyStrongValueSegment<K, V>
      extends Segment<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {
    private final ReferenceQueue<K> queueForKeys = new ReferenceQueue<K>();

    WeakKeyStrongValueSegment(
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'value' in a Serializable class
in `guava/src/com/google/common/collect/Tables.java`
#### Snippet
```java
    @ParametricNullness private final R rowKey;
    @ParametricNullness private final C columnKey;
    @ParametricNullness private final V value;

    ImmutableCell(
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'columnKey' in a Serializable class
in `guava/src/com/google/common/collect/Tables.java`
#### Snippet
```java
      extends AbstractCell<R, C, V> implements Serializable {
    @ParametricNullness private final R rowKey;
    @ParametricNullness private final C columnKey;
    @ParametricNullness private final V value;

```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'rowKey' in a Serializable class
in `guava/src/com/google/common/collect/Tables.java`
#### Snippet
```java
          R extends @Nullable Object, C extends @Nullable Object, V extends @Nullable Object>
      extends AbstractCell<R, C, V> implements Serializable {
    @ParametricNullness private final R rowKey;
    @ParametricNullness private final C columnKey;
    @ParametricNullness private final V value;
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'submitting' in a Serializable class
in `guava/src/com/google/common/util/concurrent/ExecutionSequencer.java`
#### Snippet
```java

    /** Thread that called execute(). Set in execute, cleared when delegate.execute() returns. */
    @CheckForNull Thread submitting;

    private TaskNonReentrantExecutor(Executor delegate, ExecutionSequencer sequencer) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'sequencer' in a Serializable class
in `guava/src/com/google/common/util/concurrent/ExecutionSequencer.java`
#### Snippet
```java
     * or queued.
     */
    @CheckForNull ExecutionSequencer sequencer;

    /**
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'value' in a Serializable class
in `guava/src/com/google/common/collect/Ordering.java`
#### Snippet
```java
  @VisibleForTesting
  static class IncomparableValueException extends ClassCastException {
    final Object value;

    IncomparableValueException(Object value) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'lockGraphNode' in a Serializable class
in `guava/src/com/google/common/util/concurrent/CycleDetectingLockFactory.java`
#### Snippet
```java
  final class CycleDetectingReentrantLock extends ReentrantLock implements CycleDetectingLock {

    private final LockGraphNode lockGraphNode;

    private CycleDetectingReentrantLock(LockGraphNode lockGraphNode, boolean fair) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'lockGraphNode' in a Serializable class
in `guava/src/com/google/common/util/concurrent/CycleDetectingLockFactory.java`
#### Snippet
```java
    private final CycleDetectingReentrantWriteLock writeLock;

    private final LockGraphNode lockGraphNode;

    private CycleDetectingReentrantReadWriteLock(LockGraphNode lockGraphNode, boolean fair) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'closer' in a Serializable class
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
  private static final class CloseableList extends IdentityHashMap<AutoCloseable, Executor>
      implements Closeable {
    private final DeferredCloser closer = new DeferredCloser(this);
    private volatile boolean closed;
    @CheckForNull private volatile CountDownLatch whenClosed;
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'whenClosed' in a Serializable class
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
    private final DeferredCloser closer = new DeferredCloser(this);
    private volatile boolean closed;
    @CheckForNull private volatile CountDownLatch whenClosed;

    <V extends @Nullable Object, U extends @Nullable Object>
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'instance' in a Serializable class
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
  private static class SupplierOfInstance<T extends @Nullable Object>
      implements Supplier<T>, Serializable {
    @ParametricNullness final T instance;

    SupplierOfInstance(@ParametricNullness T instance) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'target' in a Serializable class
in `guava/src/com/google/common/base/Predicates.java`
#### Snippet
```java
  /** @see Predicates#equalTo(Object) */
  private static class IsEqualToPredicate implements Predicate<@Nullable Object>, Serializable {
    private final Object target;

    private IsEqualToPredicate(Object target) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'cellValues' in a Serializable class
in `guava/src/com/google/common/collect/ImmutableTable.java`
#### Snippet
```java
    private final Object[] columnKeys;

    private final Object[] cellValues;
    private final int[] cellRowIndices;
    private final int[] cellColumnIndices;
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'rowKeys' in a Serializable class
in `guava/src/com/google/common/collect/ImmutableTable.java`
#### Snippet
```java
   */
  static final class SerializedForm implements Serializable {
    private final Object[] rowKeys;
    private final Object[] columnKeys;

```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'columnKeys' in a Serializable class
in `guava/src/com/google/common/collect/ImmutableTable.java`
#### Snippet
```java
  static final class SerializedForm implements Serializable {
    private final Object[] rowKeys;
    private final Object[] columnKeys;

    private final Object[] cellValues;
```

## RuleId[ruleID=CatchMayIgnoreException]
### RuleId[ruleID=CatchMayIgnoreException]
'catch' parameter named `ignored` is used
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
          try {
            shutDown();
          } catch (Exception ignored) {
            restoreInterruptIfIsInterruptedException(ignored);
            logger.log(
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
    try {
      return sun.misc.Unsafe.getUnsafe();
    } catch (SecurityException tryReflectionInstead) {
    }
    try {
```

### RuleId[ruleID=CatchMayIgnoreException]
'catch' parameter named `ignored` is used
in `guava/src/com/google/common/util/concurrent/AbstractExecutionThreadService.java`
#### Snippet
```java
                        try {
                          shutDown();
                        } catch (Exception ignored) {
                          restoreInterruptIfIsInterruptedException(ignored);
                          // TODO(lukes): if guava ever moves to java7, this would be a good
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
    try {
      return sun.misc.Unsafe.getUnsafe();
    } catch (SecurityException tryReflectionInstead) {
    }
    try {
```

## RuleId[ruleID=UnnecessaryToStringCall]
### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `guava/src/com/google/common/io/ByteSource.java`
#### Snippet
```java
    @Override
    public String toString() {
      return ByteSource.this.toString() + ".slice(" + offset + ", " + length + ")";
    }
  }
```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `guava/src/com/google/common/io/ByteSource.java`
#### Snippet
```java
    @Override
    public String toString() {
      return ByteSource.this.toString() + ".asCharSource(" + charset + ")";
    }
  }
```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `guava/src/com/google/common/io/ByteSink.java`
#### Snippet
```java
    @Override
    public String toString() {
      return ByteSink.this.toString() + ".asCharSink(" + charset + ")";
    }
  }
```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `guava/src/com/google/common/io/CharSource.java`
#### Snippet
```java
    @Override
    public String toString() {
      return CharSource.this.toString() + ".asByteSource(" + charset + ")";
    }
  }
```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `guava/src/com/google/common/collect/Iterables.java`
#### Snippet
```java
      @Override
      public String toString() {
        return iterable.toString() + " (cycled)";
      }
    };
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `outI`
in `guava/src/com/google/common/collect/JdkBackedImmutableMap.java`
#### Snippet
```java
          duplicates.put(key, null);
        }
        newEntryArray[outI++] = entry;
      }
      entryArray = newEntryArray;
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `out`
in `guava/src/com/google/common/collect/RegularImmutableMap.java`
#### Snippet
```java
        }
      }
      newEntries[out++] = entry;
    }
    return newEntries;
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `guava/src/com/google/common/base/Utf8.java`
#### Snippet
```java
            throw new IllegalArgumentException(unpairedSurrogateMsg(i));
          }
          i++;
        }
      }
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `guava/src/com/google/common/collect/RegularImmutableSet.java`
#### Snippet
```java
    }
    for (int i = Hashing.smearedHash(target); ; i++) {
      i &= mask;
      Object candidate = table[i];
      if (candidate == null) {
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `accum`
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
          return b * accum;
        default:
          accum *= ((k & 1) == 0) ? 1 : b;
          b *= b;
      }
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
        if (c == replacement && (i == len - 1 || !matches(sequence.charAt(i + 1)))) {
          // a no-op replacement
          i++;
        } else {
          StringBuilder builder = new StringBuilder(len).append(sequence, 0, i).append(replacement);
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `accum`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
          return accum * b;
        default:
          accum *= ((k & 1) == 0) ? 1 : b;
          b *= b;
      }
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `guava/src/com/google/common/base/Ascii.java`
#### Snippet
```java
      if (isUpperCase(string.charAt(i))) {
        char[] chars = string.toCharArray();
        for (; i < length; i++) {
          char c = chars[i];
          if (isUpperCase(c)) {
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `guava/src/com/google/common/base/Ascii.java`
#### Snippet
```java
      if (isLowerCase(string.charAt(i))) {
        char[] chars = string.toCharArray();
        for (; i < length; i++) {
          char c = chars[i];
          if (isLowerCase(c)) {
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `outI`
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
      for (int inI = 0, outI = 0; inI < size; inI++) {
        if (!dups.get(inI)) {
          newEntries[outI++] = entries[inI];
        }
      }
```

## RuleId[ruleID=StringEqualsEmptyString]
### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `guava/src/com/google/common/io/Files.java`
#### Snippet
```java
    if (result.equals("/..")) {
      result = "/";
    } else if ("".equals(result)) {
      result = ".";
    }
```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `in` accessed in synchronized context
in `guava/src/com/google/common/io/ByteStreams.java`
#### Snippet
```java
    @Override
    public synchronized void mark(int readLimit) {
      in.mark(readLimit);
      mark = left;
    }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `in` accessed in synchronized context
in `guava/src/com/google/common/io/ByteStreams.java`
#### Snippet
```java
    @Override
    public synchronized void reset() throws IOException {
      if (!in.markSupported()) {
        throw new IOException("Mark not supported");
      }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `in` accessed in synchronized context
in `guava/src/com/google/common/io/ByteStreams.java`
#### Snippet
```java
      }

      in.reset();
      left = mark;
    }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `in` accessed in synchronized context
in `guava/src/com/google/common/io/CountingInputStream.java`
#### Snippet
```java
  @Override
  public synchronized void mark(int readlimit) {
    in.mark(readlimit);
    mark = count;
    // it's okay to mark even if mark isn't supported, as reset won't work
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `in` accessed in synchronized context
in `guava/src/com/google/common/io/CountingInputStream.java`
#### Snippet
```java
  @Override
  public synchronized void reset() throws IOException {
    if (!in.markSupported()) {
      throw new IOException("Mark not supported");
    }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `in` accessed in synchronized context
in `guava/src/com/google/common/io/CountingInputStream.java`
#### Snippet
```java
    }

    in.reset();
    count = mark;
  }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `descendingKeySet` accessed in synchronized context
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    public NavigableSet<K> descendingKeySet() {
      synchronized (mutex) {
        if (descendingKeySet == null) {
          return descendingKeySet = Synchronized.navigableSet(delegate().descendingKeySet(), mutex);
        }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `descendingKeySet` accessed in synchronized context
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
      synchronized (mutex) {
        if (descendingKeySet == null) {
          return descendingKeySet = Synchronized.navigableSet(delegate().descendingKeySet(), mutex);
        }
        return descendingKeySet;
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `descendingKeySet` accessed in synchronized context
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
          return descendingKeySet = Synchronized.navigableSet(delegate().descendingKeySet(), mutex);
        }
        return descendingKeySet;
      }
    }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `descendingSet` accessed in synchronized context
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    public NavigableSet<E> descendingSet() {
      synchronized (mutex) {
        if (descendingSet == null) {
          NavigableSet<E> dS = Synchronized.navigableSet(delegate().descendingSet(), mutex);
          descendingSet = dS;
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `descendingSet` accessed in synchronized context
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
        if (descendingSet == null) {
          NavigableSet<E> dS = Synchronized.navigableSet(delegate().descendingSet(), mutex);
          descendingSet = dS;
          return dS;
        }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `descendingSet` accessed in synchronized context
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
          return dS;
        }
        return descendingSet;
      }
    }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `descendingMap` accessed in synchronized context
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    public NavigableMap<K, V> descendingMap() {
      synchronized (mutex) {
        if (descendingMap == null) {
          return descendingMap = navigableMap(delegate().descendingMap(), mutex);
        }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `descendingMap` accessed in synchronized context
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
      synchronized (mutex) {
        if (descendingMap == null) {
          return descendingMap = navigableMap(delegate().descendingMap(), mutex);
        }
        return descendingMap;
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `descendingMap` accessed in synchronized context
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
          return descendingMap = navigableMap(delegate().descendingMap(), mutex);
        }
        return descendingMap;
      }
    }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `navigableKeySet` accessed in synchronized context
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    public NavigableSet<K> navigableKeySet() {
      synchronized (mutex) {
        if (navigableKeySet == null) {
          return navigableKeySet = Synchronized.navigableSet(delegate().navigableKeySet(), mutex);
        }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `navigableKeySet` accessed in synchronized context
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
      synchronized (mutex) {
        if (navigableKeySet == null) {
          return navigableKeySet = Synchronized.navigableSet(delegate().navigableKeySet(), mutex);
        }
        return navigableKeySet;
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `navigableKeySet` accessed in synchronized context
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
          return navigableKeySet = Synchronized.navigableSet(delegate().navigableKeySet(), mutex);
        }
        return navigableKeySet;
      }
    }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `initialized` accessed in synchronized context
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
      if (!initialized) {
        synchronized (this) {
          if (!initialized) {
            /*
             * requireNonNull is safe because we read and write `delegate` under synchronization.
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `delegate` accessed in synchronized context
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
             * `Supplier` that always throws an exception.
             */
            T t = requireNonNull(delegate).get();
            value = t;
            initialized = true;
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `value` accessed in synchronized context
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
             */
            T t = requireNonNull(delegate).get();
            value = t;
            initialized = true;
            // Release the delegate to GC.
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `initialized` accessed in synchronized context
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
            T t = requireNonNull(delegate).get();
            value = t;
            initialized = true;
            // Release the delegate to GC.
            delegate = null;
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `delegate` accessed in synchronized context
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
            initialized = true;
            // Release the delegate to GC.
            delegate = null;
            return t;
          }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `initialized` accessed in synchronized context
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
      if (!initialized) {
        synchronized (this) {
          if (!initialized) {
            T t = delegate.get();
            value = t;
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `value` accessed in synchronized context
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
          if (!initialized) {
            T t = delegate.get();
            value = t;
            initialized = true;
            return t;
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `initialized` accessed in synchronized context
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
            T t = delegate.get();
            value = t;
            initialized = true;
            return t;
          }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `expirationNanos` accessed in synchronized context
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
      if (nanos == 0 || now - nanos >= 0) {
        synchronized (this) {
          if (nanos == expirationNanos) { // recheck for lost race
            T t = delegate.get();
            value = t;
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `value` accessed in synchronized context
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
          if (nanos == expirationNanos) { // recheck for lost race
            T t = delegate.get();
            value = t;
            nanos = now + durationNanos;
            // In the very unlikely event that nanos is 0, set it to 1;
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `expirationNanos` accessed in synchronized context
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
            // In the very unlikely event that nanos is 0, set it to 1;
            // no one will notice 1 ns of tardiness.
            expirationNanos = (nanos == 0) ? 1 : nanos;
            return t;
          }
```

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/base/internal/Finalizer.java`
#### Snippet
```java
  @SuppressWarnings("InfiniteLoopStatement")
  @Override
  public void run() {
    while (true) {
      try {
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java

  @SuppressWarnings({"unchecked", "rawtypes"})
  private @Nullable BiEntry<K, V>[] createTable(int length) {
    return new @Nullable BiEntry[length];
  }
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java

    @SuppressWarnings({"unchecked", "rawtypes"})
    Builder(int initialCapacity) {
      this.entries = new @Nullable Entry[initialCapacity];
      this.size = 0;
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
        return entries;
      }
      @SuppressWarnings({"rawtypes", "unchecked"})
      Entry<K, V>[] newEntries = new Entry[size - dups.cardinality()];
      for (int inI = 0, outI = 0; inI < size; inI++) {
        if (!dups.get(inI)) {
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
    // Hack around K not being a subtype of Comparable.
    // Unsafe, see ImmutableSortedSetFauxverideShim.
    @SuppressWarnings("unchecked")
    Ordering<K> naturalOrder = (Ordering<K>) NATURAL_ORDER;
    return copyOfInternal(map, naturalOrder);
  }
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
    // Hack around K not being a subtype of Comparable.
    // Unsafe, see ImmutableSortedSetFauxverideShim.
    @SuppressWarnings("unchecked")
    Ordering<K> naturalOrder = (Ordering<K>) NATURAL_ORDER;
    return copyOf(entries, naturalOrder);
  }
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public Builder(Comparator<? super K> comparator) {
      this.comparator = checkNotNull(comparator);
    }
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/collect/JdkBackedImmutableMap.java`
#### Snippet
```java
    }
    if (duplicates != null) {
      @SuppressWarnings({"rawtypes", "unchecked"})
      Entry<K, V>[] newEntryArray = new Entry[n - dupCount];
      for (int inI = 0, outI = 0; inI < n; inI++) {
        Entry<K, V> entry = requireNonNull(entryArray[inI]);
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
      int tableSize = Hashing.closedTableSize(expectedValues, VALUE_SET_LOAD_FACTOR);

      @SuppressWarnings({"rawtypes", "unchecked"})
      @Nullable
      ValueEntry<K, V>[] hashTable = new @Nullable ValueEntry[tableSize];
      this.hashTable = hashTable;
    }
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

    @SuppressWarnings("deprecation") // serialization of deprecated feature
    MapMaker readMapMaker(ObjectInputStream in) throws IOException {
      int size = in.readInt();
      return new MapMaker()
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/collect/NaturalOrdering.java`
#### Snippet
```java
@SuppressWarnings({"unchecked", "rawtypes"}) // TODO(kevinb): the right way to explain this??
@ElementTypesAreNonnullByDefault
final class NaturalOrdering extends Ordering<Comparable<?>> implements Serializable {
  static final NaturalOrdering INSTANCE = new NaturalOrdering();

```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/collect/Ordering.java`
#### Snippet
```java
  @GwtCompatible(serializable = true)
  @SuppressWarnings("unchecked")
  public static Ordering<@Nullable Object> allEqual() {
    return AllEqualOrdering.INSTANCE;
  }
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/collect/RegularImmutableMultiset.java`
#### Snippet
```java
  static <E> ImmutableMultiset<E> create(Collection<? extends Entry<? extends E>> entries) {
    int distinct = entries.size();
    @SuppressWarnings({"unchecked", "rawtypes"})
    ImmutableEntry<E>[] entryArray = new ImmutableEntry[distinct];
    if (distinct == 0) {
      return new RegularImmutableMultiset<>(entryArray, EMPTY_ARRAY, 0, 0, ImmutableSet.of());
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/collect/RegularImmutableMultiset.java`
#### Snippet
```java
    int tableSize = Hashing.closedTableSize(distinct, MAX_LOAD_FACTOR);
    int mask = tableSize - 1;
    @SuppressWarnings({"unchecked", "rawtypes"})
    @Nullable
    ImmutableEntry<E>[] hashTable = new @Nullable ImmutableEntry[tableSize];

    int index = 0;
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/collect/ReverseNaturalOrdering.java`
#### Snippet
```java
@SuppressWarnings({"unchecked", "rawtypes"}) // TODO(kevinb): the right way to explain this??
@ElementTypesAreNonnullByDefault
final class ReverseNaturalOrdering extends Ordering<Comparable<?>> implements Serializable {
  static final ReverseNaturalOrdering INSTANCE = new ReverseNaturalOrdering();

```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/graph/DirectedGraphConnections.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  @Override
  public void removePredecessor(N node) {
    checkNotNull(node);

```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/hash/Murmur3_32HashFunction.java`
#### Snippet
```java
  @SuppressWarnings("deprecation") // need to use Charsets for Android tests to pass
  @Override
  public HashCode hashString(CharSequence input, Charset charset) {
    if (Charsets.UTF_8.equals(charset)) {
      int utf16Length = input.length();
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/hash/Murmur3_32HashFunction.java`
#### Snippet
```java
    @SuppressWarnings("deprecation") // need to use Charsets for Android tests to pass
    @Override
    public Hasher putString(CharSequence input, Charset charset) {
      if (Charsets.UTF_8.equals(charset)) {
        int utf16Length = input.length();
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/math/BigIntegerMath.java`
#### Snippet
```java
  @GwtIncompatible // TODO
  @SuppressWarnings("fallthrough")
  public static int log10(BigInteger x, RoundingMode mode) {
    checkPositive("x", x);
    if (fitsInLong(x)) {
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/math/DoubleMath.java`
#### Snippet
```java
  @GwtIncompatible // java.lang.Math.getExponent, com.google.common.math.DoubleUtils
  @SuppressWarnings("fallthrough")
  public static int log2(double x, RoundingMode mode) {
    checkArgument(x > 0.0 && isFinite(x), "x must be positive and finite");
    int exponent = getExponent(x);
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
  @SuppressWarnings("fallthrough")
  // TODO(kevinb): remove after this warning is disabled globally
  public static int log2(int x, RoundingMode mode) {
    checkPositive("x", x);
    switch (mode) {
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
  @GwtIncompatible // need BigIntegerMath to adequately test
  @SuppressWarnings("fallthrough")
  public static int log10(int x, RoundingMode mode) {
    checkPositive("x", x);
    int logFloor = log10Floor(x);
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
   */
  @SuppressWarnings("fallthrough")
  public static int divide(int p, int q, RoundingMode mode) {
    checkNotNull(mode);
    if (q == 0) {
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
  @SuppressWarnings("fallthrough")
  // TODO(kevinb): remove after this warning is disabled globally
  public static int log2(long x, RoundingMode mode) {
    checkPositive("x", x);
    switch (mode) {
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
  @SuppressWarnings("fallthrough")
  // TODO(kevinb): remove after this warning is disabled globally
  public static int log10(long x, RoundingMode mode) {
    checkPositive("x", x);
    int logFloor = log10Floor(x);
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
  @GwtIncompatible // TODO
  @SuppressWarnings("fallthrough")
  public static long divide(long p, long q, RoundingMode mode) {
    checkNotNull(mode);
    long div = p / q; // throws if q == 0
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
  @SuppressWarnings("deprecation")
  @GwtIncompatible
  public static double roundToDouble(long x, RoundingMode mode) {
    // Logic adapted from ToDoubleRounder.
    double roundArbitrarily = (double) x;
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `guava/src/com/google/common/util/concurrent/MoreExecutors.java`
#### Snippet
```java
      implements ListeningScheduledExecutorService {
    @SuppressWarnings("hiding")
    final ScheduledExecutorService delegate;

    ScheduledListeningDecorator(ScheduledExecutorService delegate) {
```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'expectedEdgeCount'
in `guava/src/com/google/common/graph/NetworkBuilder.java`
#### Snippet
```java
  boolean allowsParallelEdges = false;
  ElementOrder<? super E> edgeOrder = ElementOrder.insertion();
  Optional<Integer> expectedEdgeCount = Optional.absent();

  /** Creates a new instance with the specified edge directionality. */
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'expectedNodeCount'
in `guava/src/com/google/common/graph/AbstractGraphBuilder.java`
#### Snippet
```java
  ElementOrder<N> incidentEdgeOrder = ElementOrder.unordered();

  Optional<Integer> expectedNodeCount = Optional.absent();

  /**
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`OptionalLong` used as type for parameter 'optional'
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  @InlineMe(replacement = "optional.stream()")
  @com.google.errorprone.annotations.InlineMeValidationDisabled("Java 9+ API only")
  public static LongStream stream(OptionalLong optional) {
    return optional.isPresent() ? LongStream.of(optional.getAsLong()) : LongStream.empty();
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`OptionalDouble` used as type for parameter 'optional'
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  @InlineMe(replacement = "optional.stream()")
  @com.google.errorprone.annotations.InlineMeValidationDisabled("Java 9+ API only")
  public static DoubleStream stream(OptionalDouble optional) {
    return optional.isPresent() ? DoubleStream.of(optional.getAsDouble()) : DoubleStream.empty();
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`com.google.common.base.Optional` used as type for parameter 'optional'
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
   */
  @Beta
  public static <T> Stream<T> stream(com.google.common.base.Optional<T> optional) {
    return optional.isPresent() ? Stream.of(optional.get()) : Stream.empty();
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`OptionalInt` used as type for parameter 'optional'
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  @InlineMe(replacement = "optional.stream()")
  @com.google.errorprone.annotations.InlineMeValidationDisabled("Java 9+ API only")
  public static IntStream stream(OptionalInt optional) {
    return optional.isPresent() ? IntStream.of(optional.getAsInt()) : IntStream.empty();
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`java.util.Optional` used as type for parameter 'optional'
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  @InlineMe(replacement = "optional.stream()")
  @com.google.errorprone.annotations.InlineMeValidationDisabled("Java 9+ API only")
  public static <T> Stream<T> stream(java.util.Optional<T> optional) {
    return optional.isPresent() ? Stream.of(optional.get()) : Stream.empty();
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for field 'iterableDelegate'
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
  // Optional.of(this). To access the delegate iterable, call #getDelegate(), which converts to
  // absent() back to 'this'.
  private final Optional<Iterable<E>> iterableDelegate;

  /** Constructor for use by subclasses. */
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'parsedCharset'
in `guava/src/com/google/common/net/MediaType.java`
#### Snippet
```java
  @LazyInit private int hashCode;

  @LazyInit @CheckForNull private Optional<Charset> parsedCharset;

  private MediaType(String type, String subtype, ImmutableListMultimap<String, String> parameters) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'googleOptional'
in `guava/src/com/google/common/base/Optional.java`
#### Snippet
```java
   */
  @CheckForNull
  public static <T> java.util.Optional<T> toJavaUtil(@CheckForNull Optional<T> googleOptional) {
    return googleOptional == null ? null : googleOptional.toJavaUtil();
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`java.util.Optional` used as type for parameter 'javaUtilOptional'
in `guava/src/com/google/common/base/Optional.java`
#### Snippet
```java
   */
  @CheckForNull
  public static <T> Optional<T> fromJavaUtil(@CheckForNull java.util.Optional<T> javaUtilOptional) {
    return (javaUtilOptional == null) ? null : fromNullable(javaUtilOptional.orElse(null));
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'secondChoice'
in `guava/src/com/google/common/base/Optional.java`
#### Snippet
```java
   * instead.
   */
  public abstract Optional<T> or(Optional<? extends T> secondChoice);

  /**
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'desiredType'
in `guava/src/com/google/common/net/InternetDomainName.java`
#### Snippet
```java
   */
  private static boolean matchesType(
      Optional<PublicSuffixType> desiredType, Optional<PublicSuffixType> actualType) {
    return desiredType.isPresent() ? desiredType.equals(actualType) : actualType.isPresent();
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'actualType'
in `guava/src/com/google/common/net/InternetDomainName.java`
#### Snippet
```java
   */
  private static boolean matchesType(
      Optional<PublicSuffixType> desiredType, Optional<PublicSuffixType> actualType) {
    return desiredType.isPresent() ? desiredType.equals(actualType) : actualType.isPresent();
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'desiredType'
in `guava/src/com/google/common/net/InternetDomainName.java`
#### Snippet
```java
   * Otherwise, it finds the first suffix of any type.
   */
  private int findSuffixOfType(Optional<PublicSuffixType> desiredType) {
    int partsSize = parts.size();

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'desiredType'
in `guava/src/com/google/common/net/InternetDomainName.java`
#### Snippet
```java
   */
  private static boolean matchesWildcardSuffixType(
      Optional<PublicSuffixType> desiredType, String domain) {
    List<String> pieces = DOT_SPLITTER.limit(2).splitToList(domain);
    return pieces.size() == 2
```

## RuleId[ruleID=CharsetObjectCanBeUsed]
### RuleId[ruleID=CharsetObjectCanBeUsed]
StandardCharsets.UTF_16LE can be used instead
in `guava/src/com/google/common/base/Charsets.java`
#### Snippet
```java
   */
  @GwtIncompatible // Charset not supported by GWT
  public static final Charset UTF_16LE = Charset.forName("UTF-16LE");

  /**
```

### RuleId[ruleID=CharsetObjectCanBeUsed]
StandardCharsets.US_ASCII can be used instead
in `guava/src/com/google/common/base/Charsets.java`
#### Snippet
```java
   */
  @GwtIncompatible // Charset not supported by GWT
  public static final Charset US_ASCII = Charset.forName("US-ASCII");

  /**
```

### RuleId[ruleID=CharsetObjectCanBeUsed]
StandardCharsets.UTF_16 can be used instead
in `guava/src/com/google/common/base/Charsets.java`
#### Snippet
```java
   */
  @GwtIncompatible // Charset not supported by GWT
  public static final Charset UTF_16 = Charset.forName("UTF-16");

  /*
```

### RuleId[ruleID=CharsetObjectCanBeUsed]
StandardCharsets.UTF_16BE can be used instead
in `guava/src/com/google/common/base/Charsets.java`
#### Snippet
```java
   */
  @GwtIncompatible // Charset not supported by GWT
  public static final Charset UTF_16BE = Charset.forName("UTF-16BE");

  /**
```

### RuleId[ruleID=CharsetObjectCanBeUsed]
StandardCharsets.UTF_8 can be used instead
in `guava/src/com/google/common/base/Charsets.java`
#### Snippet
```java
   *
   */
  public static final Charset UTF_8 = Charset.forName("UTF-8");

  /**
```

### RuleId[ruleID=CharsetObjectCanBeUsed]
StandardCharsets.ISO_8859_1 can be used instead
in `guava/src/com/google/common/base/Charsets.java`
#### Snippet
```java
   *
   */
  public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

  /**
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `guava/src/com/google/common/util/concurrent/UncaughtExceptionHandlers.java`
#### Snippet
```java
        // If logging fails, e.g. due to missing memory, at least try to log the
        // message and the cause for the failed logging.
        System.err.println(e.getMessage());
        System.err.println(errorInLogging.getMessage());
      } finally {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `guava/src/com/google/common/util/concurrent/UncaughtExceptionHandlers.java`
#### Snippet
```java
        // message and the cause for the failed logging.
        System.err.println(e.getMessage());
        System.err.println(errorInLogging.getMessage());
      } finally {
        runtime.exit(1);
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `guava/src/com/google/common/io/FileBackedOutputStream.java`
#### Snippet
```java
                reset();
              } catch (Throwable t) {
                t.printStackTrace(System.err);
              }
            }
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `guava/src/com/google/common/net/PercentEscaper.java`
#### Snippet
```java
    checkNotNull(safeChars); // eager for GWT.
    // Avoid any misunderstandings about the behavior of this escaper
    if (safeChars.matches(".*[0-9A-Za-z].*")) {
      throw new IllegalArgumentException(
          "Alphanumeric characters are always 'safe' and should not be explicitly specified");
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `guava/src/com/google/common/primitives/Doubles.java`
#### Snippet
```java
    String fpPattern = "[+-]?(?:NaN|Infinity|" + completeDec + "|" + completeHex + ")";
    fpPattern =
        fpPattern.replace(
            "#",
            "+"
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
 * submitting a task to a {@link ListeningExecutorService}, and deriving a {@code Future} from an
 * existing one, typically using methods like {@link Futures#transform(ListenableFuture,
 * com.google.common.base.Function, java.util.concurrent.Executor) Futures.transform} and {@link
 * Futures#catching(ListenableFuture, Class, com.google.common.base.Function,
 * java.util.concurrent.Executor) Futures.catching}.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
 * com.google.common.base.Function, java.util.concurrent.Executor) Futures.transform} and {@link
 * Futures#catching(ListenableFuture, Class, com.google.common.base.Function,
 * java.util.concurrent.Executor) Futures.catching}.
 *
 * <p>This class implements all methods in {@code ListenableFuture}. Subclasses should provide a way
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
  @SuppressWarnings("sunapi")
  private static final class UnsafeAtomicHelper extends AtomicHelper {
    static final sun.misc.Unsafe UNSAFE;
    static final long LISTENERS_OFFSET;
    static final long WAITERS_OFFSET;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
                  new PrivilegedExceptionAction<sun.misc.Unsafe>() {
                    @Override
                    public sun.misc.Unsafe run() throws Exception {
                      Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
                      for (java.lang.reflect.Field f : k.getDeclaredFields()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
                    @Override
                    public sun.misc.Unsafe run() throws Exception {
                      Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
                      for (java.lang.reflect.Field f : k.getDeclaredFields()) {
                        f.setAccessible(true);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
                    @Override
                    public sun.misc.Unsafe run() throws Exception {
                      Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
                      for (java.lang.reflect.Field f : k.getDeclaredFields()) {
                        f.setAccessible(true);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
                    public sun.misc.Unsafe run() throws Exception {
                      Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
                      for (java.lang.reflect.Field f : k.getDeclaredFields()) {
                        f.setAccessible(true);
                        Object x = f.get(null);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
          unsafe =
              AccessController.doPrivileged(
                  new PrivilegedExceptionAction<sun.misc.Unsafe>() {
                    @Override
                    public sun.misc.Unsafe run() throws Exception {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java

    static {
      sun.misc.Unsafe unsafe = null;
      try {
        unsafe = sun.misc.Unsafe.getUnsafe();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
      sun.misc.Unsafe unsafe = null;
      try {
        unsafe = sun.misc.Unsafe.getUnsafe();
      } catch (SecurityException tryReflectionInstead) {
        try {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.function` is unnecessary and can be removed
in `guava/src/com/google/common/collect/TableCollectors.java`
#### Snippet
```java
          I extends Table<R, C, V>>
      Collector<T, ?, I> toTable(
          java.util.function.Function<? super T, ? extends R> rowFunction,
          java.util.function.Function<? super T, ? extends C> columnFunction,
          java.util.function.Function<? super T, ? extends V> valueFunction,
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.function` is unnecessary and can be removed
in `guava/src/com/google/common/collect/TableCollectors.java`
#### Snippet
```java
      Collector<T, ?, I> toTable(
          java.util.function.Function<? super T, ? extends R> rowFunction,
          java.util.function.Function<? super T, ? extends C> columnFunction,
          java.util.function.Function<? super T, ? extends V> valueFunction,
          java.util.function.Supplier<I> tableSupplier) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.function` is unnecessary and can be removed
in `guava/src/com/google/common/collect/TableCollectors.java`
#### Snippet
```java
          java.util.function.Function<? super T, ? extends R> rowFunction,
          java.util.function.Function<? super T, ? extends C> columnFunction,
          java.util.function.Function<? super T, ? extends V> valueFunction,
          java.util.function.Supplier<I> tableSupplier) {
    return toTable(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.function` is unnecessary and can be removed
in `guava/src/com/google/common/collect/TableCollectors.java`
#### Snippet
```java
          java.util.function.Function<? super T, ? extends C> columnFunction,
          java.util.function.Function<? super T, ? extends V> valueFunction,
          java.util.function.Supplier<I> tableSupplier) {
    return toTable(
        rowFunction,
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.function` is unnecessary and can be removed
in `guava/src/com/google/common/collect/TableCollectors.java`
#### Snippet
```java
          I extends Table<R, C, V>>
      Collector<T, ?, I> toTable(
          java.util.function.Function<? super T, ? extends R> rowFunction,
          java.util.function.Function<? super T, ? extends C> columnFunction,
          java.util.function.Function<? super T, ? extends V> valueFunction,
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.function` is unnecessary and can be removed
in `guava/src/com/google/common/collect/TableCollectors.java`
#### Snippet
```java
      Collector<T, ?, I> toTable(
          java.util.function.Function<? super T, ? extends R> rowFunction,
          java.util.function.Function<? super T, ? extends C> columnFunction,
          java.util.function.Function<? super T, ? extends V> valueFunction,
          BinaryOperator<V> mergeFunction,
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.function` is unnecessary and can be removed
in `guava/src/com/google/common/collect/TableCollectors.java`
#### Snippet
```java
          java.util.function.Function<? super T, ? extends R> rowFunction,
          java.util.function.Function<? super T, ? extends C> columnFunction,
          java.util.function.Function<? super T, ? extends V> valueFunction,
          BinaryOperator<V> mergeFunction,
          java.util.function.Supplier<I> tableSupplier) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.function` is unnecessary and can be removed
in `guava/src/com/google/common/collect/TableCollectors.java`
#### Snippet
```java
          java.util.function.Function<? super T, ? extends V> valueFunction,
          BinaryOperator<V> mergeFunction,
          java.util.function.Supplier<I> tableSupplier) {
    checkNotNull(rowFunction);
    checkNotNull(columnFunction);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/collect/ListMultimap.java`
#### Snippet
```java
   *
   * <p>Because the values for a given key may have duplicates and follow the insertion ordering,
   * this method returns a {@link List}, instead of the {@link java.util.Collection} specified in
   * the {@link Multimap} interface.
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/collect/ListMultimap.java`
#### Snippet
```java
   *
   * <p>Because the values for a given key may have duplicates and follow the insertion ordering,
   * this method returns a {@link List}, instead of the {@link java.util.Collection} specified in
   * the {@link Multimap} interface.
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/collect/ListMultimap.java`
#### Snippet
```java
   *
   * <p>Because the values for a given key may have duplicates and follow the insertion ordering,
   * this method returns a {@link List}, instead of the {@link java.util.Collection} specified in
   * the {@link Multimap} interface.
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/ForwardingNavigableMap.java`
#### Snippet
```java

        @Override
        public java.util.Map.Entry<K, V> next() {
          if (nextOrNull == null) {
            throw new NoSuchElementException();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/AtomicDoubleArray.java`
#### Snippet
```java
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public class AtomicDoubleArray implements java.io.Serializable {
  private static final long serialVersionUID = 0L;

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/AtomicDoubleArray.java`
#### Snippet
```java

  /** Reconstitutes the instance from a stream (that is, deserializes it). */
  private void readObject(java.io.ObjectInputStream s)
      throws java.io.IOException, ClassNotFoundException {
    s.defaultReadObject();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/AtomicDoubleArray.java`
#### Snippet
```java
  /** Reconstitutes the instance from a stream (that is, deserializes it). */
  private void readObject(java.io.ObjectInputStream s)
      throws java.io.IOException, ClassNotFoundException {
    s.defaultReadObject();

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/AtomicDoubleArray.java`
#### Snippet
```java
   *     {@code double}) in the proper order.
   */
  private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
    s.defaultWriteObject();

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/AtomicDoubleArray.java`
#### Snippet
```java
   *     {@code double}) in the proper order.
   */
  private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
    s.defaultWriteObject();

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/ParametricNullness.java`
#### Snippet
```java
@Retention(RUNTIME)
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/graph/ParametricNullness.java`
#### Snippet
```java
@Retention(RUNTIME)
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/graph/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/graph/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/xml/ParametricNullness.java`
#### Snippet
```java
@Retention(RUNTIME)
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/xml/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/xml/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/primitives/ParametricNullness.java`
#### Snippet
```java
@Retention(RUNTIME)
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/primitives/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/primitives/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `guava/src/com/google/common/io/CharStreams.java`
#### Snippet
```java
 *
 * <p>Some of the methods in this class take arguments with a generic type of {@code Readable &
 * Closeable}. A {@link java.io.Reader} implements both of those interfaces. Similarly for {@code
 * Appendable & Closeable} and {@link java.io.Writer}.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `guava/src/com/google/common/io/CharStreams.java`
#### Snippet
```java
 * <p>Some of the methods in this class take arguments with a generic type of {@code Readable &
 * Closeable}. A {@link java.io.Reader} implements both of those interfaces. Similarly for {@code
 * Appendable & Closeable} and {@link java.io.Writer}.
 *
 * @author Chris Nokleberg
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java

  // Unsafe mechanics
  private static final sun.misc.Unsafe UNSAFE;
  private static final long baseOffset;
  private static final long busyOffset;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
    try {
      return java.security.AccessController.doPrivileged(
          new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() {
            @Override
            public sun.misc.Unsafe run() throws Exception {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
    try {
      return java.security.AccessController.doPrivileged(
          new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() {
            @Override
            public sun.misc.Unsafe run() throws Exception {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
          new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() {
            @Override
            public sun.misc.Unsafe run() throws Exception {
              Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
              for (java.lang.reflect.Field f : k.getDeclaredFields()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
            @Override
            public sun.misc.Unsafe run() throws Exception {
              Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
              for (java.lang.reflect.Field f : k.getDeclaredFields()) {
                f.setAccessible(true);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
            @Override
            public sun.misc.Unsafe run() throws Exception {
              Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
              for (java.lang.reflect.Field f : k.getDeclaredFields()) {
                f.setAccessible(true);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
            public sun.misc.Unsafe run() throws Exception {
              Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
              for (java.lang.reflect.Field f : k.getDeclaredFields()) {
                f.setAccessible(true);
                Object x = f.get(null);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java

    // Unsafe mechanics
    private static final sun.misc.Unsafe UNSAFE;
    private static final long valueOffset;

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
   * @return a sun.misc.Unsafe
   */
  private static sun.misc.Unsafe getUnsafe() {
    try {
      return sun.misc.Unsafe.getUnsafe();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
  private static sun.misc.Unsafe getUnsafe() {
    try {
      return sun.misc.Unsafe.getUnsafe();
    } catch (SecurityException tryReflectionInstead) {
    }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
    }
    try {
      return java.security.AccessController.doPrivileged(
          new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() {
            @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
            }
          });
    } catch (java.security.PrivilegedActionException e) {
      throw new RuntimeException("Could not initialize intrinsics", e.getCause());
    }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/ParametricNullness.java`
#### Snippet
```java
@Retention(RUNTIME)
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.primitives` is unnecessary and can be removed
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
 * <p>Similar functionality for {@code long} and for {@link BigInteger} can be found in {@link
 * LongMath} and {@link BigIntegerMath} respectively. For other common operations on {@code int}
 * values, see {@link com.google.common.primitives.Ints}.
 *
 * @author Louis Wasserman
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `guava/src/com/google/common/util/concurrent/Futures.java`
#### Snippet
```java
  /**
   * Registers separate success and failure callbacks to be run when the {@code Future}'s
   * computation is {@linkplain java.util.concurrent.Future#isDone() complete} or, if the
   * computation is already complete, immediately.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `guava/src/com/google/common/collect/ImmutableEntry.java`
#### Snippet
```java
import org.checkerframework.checker.nullness.qual.Nullable;

/** @see com.google.common.collect.Maps#immutableEntry(Object, Object) */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.net` is unnecessary and can be removed
in `guava/src/com/google/common/net/InetAddresses.java`
#### Snippet
```java
   * IPv6 addresses are surrounded by square brackets.
   *
   * <p>This method is the inverse of {@link InetAddresses#toUriString(java.net.InetAddress)}.
   *
   * <p>This method accepts non-ASCII digits, for example {@code "???.???.?.?"} (those are fullwidth
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Queues.java`
#### Snippet
```java
  @GwtIncompatible // BlockingQueue
  public static <E> int drain(
      BlockingQueue<E> q, Collection<? super E> buffer, int numElements, java.time.Duration timeout)
      throws InterruptedException {
    // TODO(b/126049426): Consider using saturateToNanos(timeout) instead.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Queues.java`
#### Snippet
```java
      Collection<? super E> buffer,
      int numElements,
      java.time.Duration timeout) {
    // TODO(b/126049426): Consider using saturateToNanos(timeout) instead.
    return drainUninterruptibly(q, buffer, numElements, timeout.toNanos(), TimeUnit.NANOSECONDS);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/math/ParametricNullness.java`
#### Snippet
```java
@Retention(RUNTIME)
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/math/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/math/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.primitives` is unnecessary and can be removed
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
 * <p>Similar functionality for {@code int} and for {@link BigInteger} can be found in {@link
 * IntMath} and {@link BigIntegerMath} respectively. For other common operations on {@code long}
 * values, see {@link com.google.common.primitives.Longs}.
 *
 * @author Louis Wasserman
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `guava/src/com/google/common/util/concurrent/FutureCallback.java`
#### Snippet
```java

/**
 * A callback for accepting the results of a {@link java.util.concurrent.Future} computation
 * asynchronously.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/base/ParametricNullness.java`
#### Snippet
```java
@Retention(RUNTIME)
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/base/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/base/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/io/ParametricNullness.java`
#### Snippet
```java
@Retention(RUNTIME)
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/io/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/io/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `guava/src/com/google/common/reflect/Invokable.java`
#### Snippet
```java
  }

  /** See {@link java.lang.reflect.AccessibleObject#trySetAccessible()}. */
  public final boolean trySetAccessible() {
    // We can't call accessibleObject.trySetAccessible since that was added in Java 9 and this code
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `guava/src/com/google/common/reflect/Invokable.java`
#### Snippet
```java
  public abstract TypeVariable<?>[] getTypeParameters();

  /** See {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)}. */
  public final void setAccessible(boolean flag) {
    accessibleObject.setAccessible(flag);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `guava/src/com/google/common/reflect/Invokable.java`
#### Snippet
```java
 *
 * <p><b>Note:</b> earlier versions of this class inherited from {@link
 * java.lang.reflect.AccessibleObject AccessibleObject} and {@link
 * java.lang.reflect.GenericDeclaration GenericDeclaration}. Since version 31.0 that is no longer
 * the case. However, most methods from those types are present with the same signature in this
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `guava/src/com/google/common/reflect/Invokable.java`
#### Snippet
```java
  }

  /** See {@link java.lang.reflect.AccessibleObject#isAccessible()}. */
  public final boolean isAccessible() {
    return accessibleObject.isAccessible();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/reflect/ParametricNullness.java`
#### Snippet
```java
@Retention(RUNTIME)
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/reflect/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/reflect/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent.locks` is unnecessary and can be removed
in `guava/src/com/google/common/util/concurrent/Monitor.java`
#### Snippet
```java
 * eliminating explicit signaling, this class can guarantee that only one thread is awakened when a
 * condition becomes true (no "signaling storms" due to use of {@link
 * java.util.concurrent.locks.Condition#signalAll Condition.signalAll}) and that no signals are lost
 * (no "hangs" due to incorrect use of {@link java.util.concurrent.locks.Condition#signal
 * Condition.signal}).
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent.locks` is unnecessary and can be removed
in `guava/src/com/google/common/util/concurrent/Monitor.java`
#### Snippet
```java
 * condition becomes true (no "signaling storms" due to use of {@link
 * java.util.concurrent.locks.Condition#signalAll Condition.signalAll}) and that no signals are lost
 * (no "hangs" due to incorrect use of {@link java.util.concurrent.locks.Condition#signal
 * Condition.signal}).
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `guava/src/com/google/common/hash/BloomFilter.java`
#### Snippet
```java
   * <p>Implementations should be collections of pure functions (i.e. stateless).
   */
  interface Strategy extends java.io.Serializable {

    /**
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/reflect/MutableTypeToInstanceMap.java`
#### Snippet
```java
    }

    private UnmodifiableEntry(java.util.Map.Entry<K, V> delegate) {
      this.delegate = checkNotNull(delegate);
    }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/net/ParametricNullness.java`
#### Snippet
```java
@Retention(RUNTIME)
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/net/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/net/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  public static OptionalDouble findLast(DoubleStream stream) {
    // findLast(Stream) does some allocation, so we might as well box some more
    java.util.Optional<Double> boxedLast = findLast(stream.boxed());
    return boxedLast.map(OptionalDouble::of).orElseGet(OptionalDouble::empty);
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  @Beta
  @InlineMe(replacement = "optional.stream()")
  @com.google.errorprone.annotations.InlineMeValidationDisabled("Java 9+ API only")
  public static LongStream stream(OptionalLong optional) {
    return optional.isPresent() ? LongStream.of(optional.getAsLong()) : LongStream.empty();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  @Beta
  @InlineMe(replacement = "optional.stream()")
  @com.google.errorprone.annotations.InlineMeValidationDisabled("Java 9+ API only")
  public static DoubleStream stream(OptionalDouble optional) {
    return optional.isPresent() ? DoubleStream.of(optional.getAsDouble()) : DoubleStream.empty();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
   */
  @Beta
  public static <T> Stream<T> stream(com.google.common.base.Optional<T> optional) {
    return optional.isPresent() ? Stream.of(optional.get()) : Stream.empty();
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
   * element in the prior one.")
   */
  public static <T> java.util.Optional<T> findLast(Stream<T> stream) {
    class OptionalState {
      boolean set = false;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
        // spliterator is known to be nonempty now
        spliterator.forEachRemaining(state::set);
        return java.util.Optional.of(state.get());
      }

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
        spliterator.forEachRemaining(state::set);
        if (state.set) {
          return java.util.Optional.of(state.get());
        }
        // fall back to the last split
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
      splits.addLast(spliterator);
    }
    return java.util.Optional.empty();
  }

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  @Beta
  @InlineMe(replacement = "optional.stream()")
  @com.google.errorprone.annotations.InlineMeValidationDisabled("Java 9+ API only")
  public static IntStream stream(OptionalInt optional) {
    return optional.isPresent() ? IntStream.of(optional.getAsInt()) : IntStream.empty();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  public static OptionalInt findLast(IntStream stream) {
    // findLast(Stream) does some allocation, so we might as well box some more
    java.util.Optional<Integer> boxedLast = findLast(stream.boxed());
    return boxedLast.map(OptionalInt::of).orElseGet(OptionalInt::empty);
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  public static OptionalLong findLast(LongStream stream) {
    // findLast(Stream) does some allocation, so we might as well box some more
    java.util.Optional<Long> boxedLast = findLast(stream.boxed());
    return boxedLast.map(OptionalLong::of).orElseGet(OptionalLong::empty);
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  @Beta
  @InlineMe(replacement = "optional.stream()")
  @com.google.errorprone.annotations.InlineMeValidationDisabled("Java 9+ API only")
  public static <T> Stream<T> stream(java.util.Optional<T> optional) {
    return optional.isPresent() ? Stream.of(optional.get()) : Stream.empty();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  @InlineMe(replacement = "optional.stream()")
  @com.google.errorprone.annotations.InlineMeValidationDisabled("Java 9+ API only")
  public static <T> Stream<T> stream(java.util.Optional<T> optional) {
    return optional.isPresent() ? Stream.of(optional.get()) : Stream.empty();
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/ParametricNullness.java`
#### Snippet
```java
@Retention(RUNTIME)
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/collect/TreeMultimap.java`
#### Snippet
```java
   *
   * <p>Because a {@code TreeMultimap} has unique sorted keys, this method returns a {@link
   * NavigableMap}, instead of the {@link java.util.Map} specified in the {@link Multimap}
   * interface.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.stream` is unnecessary and can be removed
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
   * <p>The returned iterable is an unmodifiable view of the input array.
   *
   * <p><b>{@code Stream} equivalent:</b> {@link java.util.stream.Stream#of(Object[])
   * Stream.of(T...)}.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.stream` is unnecessary and can be removed
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
   * Returns a fluent iterable containing the specified elements in order.
   *
   * <p><b>{@code Stream} equivalent:</b> {@link java.util.stream.Stream#of(Object[])
   * Stream.of(T...)}.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/primitives/SignedBytes.java`
#### Snippet
```java
   * <p>The returned comparator is inconsistent with {@link Object#equals(Object)} (since arrays
   * support only identity equality), but it is consistent with {@link
   * java.util.Arrays#equals(byte[], byte[])}.
   *
   * @since 2.0
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `guava/src/com/google/common/util/concurrent/MoreExecutors.java`
#### Snippet
```java

/**
 * Factory and utility methods for {@link java.util.concurrent.Executor}, {@link ExecutorService},
 * and {@link java.util.concurrent.ThreadFactory}.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `guava/src/com/google/common/util/concurrent/MoreExecutors.java`
#### Snippet
```java
/**
 * Factory and utility methods for {@link java.util.concurrent.Executor}, {@link ExecutorService},
 * and {@link java.util.concurrent.ThreadFactory}.
 *
 * @author Eric Fellheimer
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/primitives/UnsignedBytes.java`
#### Snippet
```java
        try {
          return java.security.AccessController.doPrivileged(
              new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() {
                @Override
                public sun.misc.Unsafe run() throws Exception {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary and can be removed
in `guava/src/com/google/common/primitives/UnsignedBytes.java`
#### Snippet
```java
        try {
          return java.security.AccessController.doPrivileged(
              new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() {
                @Override
                public sun.misc.Unsafe run() throws Exception {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary and can be removed
in `guava/src/com/google/common/primitives/UnsignedBytes.java`
#### Snippet
```java
       * @return a sun.misc.Unsafe
       */
      private static sun.misc.Unsafe getUnsafe() {
        try {
          return sun.misc.Unsafe.getUnsafe();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary and can be removed
in `guava/src/com/google/common/primitives/UnsignedBytes.java`
#### Snippet
```java
      private static sun.misc.Unsafe getUnsafe() {
        try {
          return sun.misc.Unsafe.getUnsafe();
        } catch (SecurityException e) {
          // that's okay; try reflection instead
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/primitives/UnsignedBytes.java`
#### Snippet
```java
        }
        try {
          return java.security.AccessController.doPrivileged(
              new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() {
                @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/primitives/UnsignedBytes.java`
#### Snippet
```java
                }
              });
        } catch (java.security.PrivilegedActionException e) {
          throw new RuntimeException("Could not initialize intrinsics", e.getCause());
        }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/primitives/UnsignedBytes.java`
#### Snippet
```java
   * <p>The returned comparator is inconsistent with {@link Object#equals(Object)} (since arrays
   * support only identity equality), but it is consistent with {@link
   * java.util.Arrays#equals(byte[], byte[])}.
   *
   * @since 2.0
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary and can be removed
in `guava/src/com/google/common/primitives/UnsignedBytes.java`
#### Snippet
```java
              new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() {
                @Override
                public sun.misc.Unsafe run() throws Exception {
                  Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
                  for (java.lang.reflect.Field f : k.getDeclaredFields()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary and can be removed
in `guava/src/com/google/common/primitives/UnsignedBytes.java`
#### Snippet
```java
                @Override
                public sun.misc.Unsafe run() throws Exception {
                  Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
                  for (java.lang.reflect.Field f : k.getDeclaredFields()) {
                    f.setAccessible(true);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary and can be removed
in `guava/src/com/google/common/primitives/UnsignedBytes.java`
#### Snippet
```java
                @Override
                public sun.misc.Unsafe run() throws Exception {
                  Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
                  for (java.lang.reflect.Field f : k.getDeclaredFields()) {
                    f.setAccessible(true);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/primitives/UnsignedBytes.java`
#### Snippet
```java
                public sun.misc.Unsafe run() throws Exception {
                  Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
                  for (java.lang.reflect.Field f : k.getDeclaredFields()) {
                    f.setAccessible(true);
                    Object x = f.get(null);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.math` is unnecessary and can be removed
in `guava/src/com/google/common/collect/DiscreteDomain.java`
#### Snippet
```java
   * @return the minimum value of type {@code C}; never null
   * @throws NoSuchElementException if the type has no (practical) minimum value; for example,
   *     {@link java.math.BigInteger}
   */
  @CanIgnoreReturnValue
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.math` is unnecessary and can be removed
in `guava/src/com/google/common/collect/DiscreteDomain.java`
#### Snippet
```java
   * @return the maximum value of type {@code C}; never null
   * @throws NoSuchElementException if the type has no (practical) maximum value; for example,
   *     {@link java.math.BigInteger}
   */
  @CanIgnoreReturnValue
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/collect/ImmutableEnumMap.java`
#### Snippet
```java

/**
 * Implementation of {@link ImmutableMap} backed by a non-empty {@link java.util.EnumMap}.
 *
 * @author Louis Wasserman
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/collect/ImmutableEnumSet.java`
#### Snippet
```java

/**
 * Implementation of {@link ImmutableSet} backed by a non-empty {@link java.util.EnumSet}.
 *
 * @author Jared Levy
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.logging` is unnecessary and can be removed
in `guava/src/com/google/common/base/Platform.java`
#### Snippet
```java
    }
    logger.log(
        java.util.logging.Level.WARNING,
        "Later in 2020, we will remove GWT-RPC support for Guava types. You are seeing this"
            + " warning because you are sending a Guava type over GWT-RPC, which will break. You"
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `guava/src/com/google/common/math/DoubleMath.java`
#### Snippet
```java

/**
 * A class for arithmetic on doubles that is not covered by {@link java.lang.Math}.
 *
 * @author Louis Wasserman
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/eventbus/ParametricNullness.java`
#### Snippet
```java
@Retention(RUNTIME)
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/eventbus/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/eventbus/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
  @GwtIncompatible // java.time.Duration
  @SuppressWarnings("GoodTime") // duration decomposition
  private static long toNanosSaturated(java.time.Duration duration) {
    // Using a try/catch seems lazy, but the catch block will rarely get invoked (except for
    // durations longer than approximately +/- 292 years).
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
  @SuppressWarnings("GoodTime") // java.time.Duration decomposition
  @CanIgnoreReturnValue
  public CacheBuilder<K, V> expireAfterWrite(java.time.Duration duration) {
    return expireAfterWrite(toNanosSaturated(duration), TimeUnit.NANOSECONDS);
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
  @SuppressWarnings("GoodTime") // java.time.Duration decomposition
  @CanIgnoreReturnValue
  public CacheBuilder<K, V> expireAfterAccess(java.time.Duration duration) {
    return expireAfterAccess(toNanosSaturated(duration), TimeUnit.NANOSECONDS);
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
  @SuppressWarnings("GoodTime") // java.time.Duration decomposition
  @CanIgnoreReturnValue
  public CacheBuilder<K, V> refreshAfterWrite(java.time.Duration duration) {
    return refreshAfterWrite(toNanosSaturated(duration), TimeUnit.NANOSECONDS);
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/AtomicDouble.java`
#### Snippet
```java
@ReflectionSupport(value = ReflectionSupport.Level.FULL)
@ElementTypesAreNonnullByDefault
public class AtomicDouble extends Number implements java.io.Serializable {
  private static final long serialVersionUID = 0L;

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/AtomicDouble.java`
#### Snippet
```java
   * @serialData The current value is emitted (a {@code double}).
   */
  private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
    s.defaultWriteObject();

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/AtomicDouble.java`
#### Snippet
```java
   * @serialData The current value is emitted (a {@code double}).
   */
  private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
    s.defaultWriteObject();

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/AtomicDouble.java`
#### Snippet
```java

  /** Reconstitutes the instance from a stream (that is, deserializes it). */
  private void readObject(java.io.ObjectInputStream s)
      throws java.io.IOException, ClassNotFoundException {
    s.defaultReadObject();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/util/concurrent/AtomicDouble.java`
#### Snippet
```java
  /** Reconstitutes the instance from a stream (that is, deserializes it). */
  private void readObject(java.io.ObjectInputStream s)
      throws java.io.IOException, ClassNotFoundException {
    s.defaultReadObject();

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Platform.java`
#### Snippet
```java
    if (!Boolean.parseBoolean(System.getProperty(propertyName, "false"))) {
      throw new UnsupportedOperationException(
          com.google.common.base.Strings.lenientFormat(
              "We are removing GWT-RPC support for Guava types. You can temporarily reenable"
                  + " support by setting the system property %s to true. For more about system"
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.logging` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Platform.java`
#### Snippet
```java
    }
    logger.log(
        java.util.logging.Level.WARNING,
        "Later in 2020, we will remove GWT-RPC support for Guava types. You are seeing this"
            + " warning because you are sending a Guava type over GWT-RPC, which will break. You"
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.logging` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Platform.java`
#### Snippet
```java
@ElementTypesAreNonnullByDefault
final class Platform {
  private static final java.util.logging.Logger logger =
      java.util.logging.Logger.getLogger(Platform.class.getName());

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.logging` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/collect/Platform.java`
#### Snippet
```java
final class Platform {
  private static final java.util.logging.Logger logger =
      java.util.logging.Logger.getLogger(Platform.class.getName());

  /** Returns the platform preferred implementation of a map based on a hash table. */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/collect/MultimapBuilder.java`
#### Snippet
```java
   *
   * <p>For all multimaps generated by the resulting builder, the {@link Multimap#keySet()} can be
   * safely cast to a {@link java.util.SortedSet}, and the {@link Multimap#asMap()} can safely be
   * cast to a {@link java.util.SortedMap}.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/collect/MultimapBuilder.java`
#### Snippet
```java
   *
   * <p>For all multimaps generated by the resulting builder, the {@link Multimap#keySet()} can be
   * safely cast to a {@link java.util.SortedSet}, and the {@link Multimap#asMap()} can safely be
   * cast to a {@link java.util.SortedMap}.
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.net` is unnecessary and can be removed
in `guava/src/com/google/common/net/HostSpecifier.java`
#### Snippet
```java
 *
 * <p>If you know that a given string represents a numeric IP address, use {@link InetAddresses} to
 * obtain and manipulate a {@link java.net.InetAddress} instance from it rather than using this
 * class. Similarly, if you know that a given string represents a domain name, use {@link
 * InternetDomainName} rather than this class.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/collect/SortedLists.java`
#### Snippet
```java
     * list that compares as equal to the key.
     *
     * <p>This is equivalent to the behavior of {@link java.util.Collections#binarySearch(List,
     * Object)} when the key isn't present, since {@code ~insertionIndex} is equal to {@code -1 -
     * insertionIndex}.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
   * Starts a {@link ClosingFuture} pipeline by submitting a callable block to an executor.
   *
   * @throws java.util.concurrent.RejectedExecutionException if the task cannot be scheduled for
   *     execution
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
   * Starts a {@link ClosingFuture} pipeline by submitting a callable block to an executor.
   *
   * @throws java.util.concurrent.RejectedExecutionException if the task cannot be scheduled for
   *     execution
   * @since 30.1
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.errorprone.annotations` is unnecessary and can be removed
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
   */
  // TODO(cpovirk): Use simple name instead of fully qualified after we stop building with JDK 8.
  @com.google.errorprone.annotations.DoNotMock(
      "Use ClosingFuture.whenAllSucceed() or .whenAllComplete() instead.")
  public static class Combiner {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/collect/CompactLinkedHashMap.java`
#### Snippet
```java
 * from uniform), and amortized since some operations can trigger a hash table resize.
 *
 * <p>As compared with {@link java.util.LinkedHashMap}, this structure places significantly reduced
 * load on the garbage collector by only using a constant number of internal objects.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/collect/SortedSetMultimap.java`
#### Snippet
```java
   *
   * <p>Because a {@code SortedSetMultimap} has unique sorted values for a given key, this method
   * returns a {@link SortedSet}, instead of the {@link java.util.Collection} specified in the
   * {@link Multimap} interface.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/collect/SortedSetMultimap.java`
#### Snippet
```java
   *
   * <p>Because a {@code SortedSetMultimap} has unique sorted values for a given key, this method
   * returns a {@link SortedSet}, instead of the {@link java.util.Collection} specified in the
   * {@link Multimap} interface.
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/collect/SortedSetMultimap.java`
#### Snippet
```java
   *
   * <p>Because a {@code SortedSetMultimap} has unique sorted values for a given key, this method
   * returns a {@link SortedSet}, instead of the {@link java.util.Collection} specified in the
   * {@link Multimap} interface.
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/collect/SetMultimap.java`
#### Snippet
```java
   *
   * <p>Because a {@code SetMultimap} has unique values for a given key, this method returns a
   * {@link Set}, instead of the {@link java.util.Collection} specified in the {@link Multimap}
   * interface.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/collect/SetMultimap.java`
#### Snippet
```java
   *
   * <p>Because a {@code SetMultimap} has unique values for a given key, this method returns a
   * {@link Set}, instead of the {@link java.util.Collection} specified in the {@link Multimap}
   * interface.
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/collect/SetMultimap.java`
#### Snippet
```java
   *
   * <p>Because a {@code SetMultimap} has unique values for a given key, this method returns a
   * {@link Set}, instead of the {@link java.util.Collection} specified in the {@link Multimap}
   * interface.
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `guava/src/com/google/common/collect/SetMultimap.java`
#### Snippet
```java
   *
   * <p>Because a {@code SetMultimap} has unique values for a given key, this method returns a
   * {@link Set}, instead of the {@link java.util.Collection} specified in the {@link Multimap}
   * interface.
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/hash/ParametricNullness.java`
#### Snippet
```java
@Retention(RUNTIME)
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/hash/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/hash/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/html/ParametricNullness.java`
#### Snippet
```java
@Retention(RUNTIME)
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/html/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/html/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.logging` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/primitives/Platform.java`
#### Snippet
```java
@ElementTypesAreNonnullByDefault
final class Platform {
  private static final java.util.logging.Logger logger =
      java.util.logging.Logger.getLogger(Platform.class.getName());

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.logging` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/primitives/Platform.java`
#### Snippet
```java
final class Platform {
  private static final java.util.logging.Logger logger =
      java.util.logging.Logger.getLogger(Platform.class.getName());

  static void checkGwtRpcEnabled() {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/primitives/Platform.java`
#### Snippet
```java
    if (!Boolean.parseBoolean(System.getProperty(propertyName, "false"))) {
      throw new UnsupportedOperationException(
          com.google.common.base.Strings.lenientFormat(
              "We are removing GWT-RPC support for Guava types. You can temporarily reenable"
                  + " support by setting the system property %s to true. For more about system"
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.logging` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/primitives/Platform.java`
#### Snippet
```java
    }
    logger.log(
        java.util.logging.Level.WARNING,
        "Later in 2020, we will remove GWT-RPC support for Guava types. You are seeing this"
            + " warning because you are sending a Guava type over GWT-RPC, which will break. You"
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.nio.channels` is unnecessary and can be removed
in `guava/src/com/google/common/io/Files.java`
#### Snippet
```java
  /**
   * Fully maps a file read-only in to memory as per {@link
   * FileChannel#map(java.nio.channels.FileChannel.MapMode, long, long)}.
   *
   * <p>Files are mapped from offset 0 to its length.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.nio.channels` is unnecessary and can be removed
in `guava/src/com/google/common/io/Files.java`
#### Snippet
```java

  /**
   * Maps a file in to memory as per {@link FileChannel#map(java.nio.channels.FileChannel.MapMode,
   * long, long)} using the requested {@link MapMode}.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.nio.channels` is unnecessary and can be removed
in `guava/src/com/google/common/io/Files.java`
#### Snippet
```java
  /**
   * Fully maps a file in to memory as per {@link
   * FileChannel#map(java.nio.channels.FileChannel.MapMode, long, long)} using the requested {@link
   * MapMode}.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/primitives/Doubles.java`
#### Snippet
```java
  @GwtIncompatible // regular expressions
  static final
  java.util.regex.Pattern
      FLOATING_POINT_PATTERN = fpPattern();

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/primitives/Doubles.java`
#### Snippet
```java
  @GwtIncompatible // regular expressions
  private static
  java.util.regex.Pattern
      fpPattern() {
    /*
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/primitives/Doubles.java`
#### Snippet
```java
            );
    return
    java.util.regex.Pattern
        .compile(fpPattern);
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java
  /**
   * Returns the raw type of {@code T}. Formally speaking, if {@code T} is returned by {@link
   * java.lang.reflect.Method#getGenericReturnType}, the raw type is what's returned by {@link
   * java.lang.reflect.Method#getReturnType} of the same method object. Specifically:
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java
   * Returns the raw type of {@code T}. Formally speaking, if {@code T} is returned by {@link
   * java.lang.reflect.Method#getGenericReturnType}, the raw type is what's returned by {@link
   * java.lang.reflect.Method#getReturnType} of the same method object. Specifically:
   *
   * <ul>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
   * @return a sun.misc.Unsafe
   */
  private static sun.misc.Unsafe getUnsafe() {
    try {
      return sun.misc.Unsafe.getUnsafe();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
  private static sun.misc.Unsafe getUnsafe() {
    try {
      return sun.misc.Unsafe.getUnsafe();
    } catch (SecurityException tryReflectionInstead) {
    }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
    }
    try {
      return java.security.AccessController.doPrivileged(
          new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() {
            @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
            }
          });
    } catch (java.security.PrivilegedActionException e) {
      throw new RuntimeException("Could not initialize intrinsics", e.getCause());
    }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java

    // Unsafe mechanics
    private static final sun.misc.Unsafe UNSAFE;
    private static final long valueOffset;

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
    try {
      return java.security.AccessController.doPrivileged(
          new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() {
            @Override
            public sun.misc.Unsafe run() throws Exception {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
    try {
      return java.security.AccessController.doPrivileged(
          new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() {
            @Override
            public sun.misc.Unsafe run() throws Exception {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java

  // Unsafe mechanics
  private static final sun.misc.Unsafe UNSAFE;
  private static final long baseOffset;
  private static final long busyOffset;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
          new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() {
            @Override
            public sun.misc.Unsafe run() throws Exception {
              Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
              for (java.lang.reflect.Field f : k.getDeclaredFields()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
            @Override
            public sun.misc.Unsafe run() throws Exception {
              Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
              for (java.lang.reflect.Field f : k.getDeclaredFields()) {
                f.setAccessible(true);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `sun.misc` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
            @Override
            public sun.misc.Unsafe run() throws Exception {
              Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
              for (java.lang.reflect.Field f : k.getDeclaredFields()) {
                f.setAccessible(true);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
            public sun.misc.Unsafe run() throws Exception {
              Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
              for (java.lang.reflect.Field f : k.getDeclaredFields()) {
                f.setAccessible(true);
                Object x = f.get(null);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/escape/ParametricNullness.java`
#### Snippet
```java
@Retention(RUNTIME)
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/escape/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.meta` is unnecessary, and can be replaced with an import
in `guava/src/com/google/common/escape/ParametricNullness.java`
#### Snippet
```java
@Target({FIELD, METHOD, PARAMETER})
@javax.annotation.meta.TypeQualifierNickname
@javax.annotation.Nonnull(when = javax.annotation.meta.When.UNKNOWN)
@interface ParametricNullness {}

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.stream` is unnecessary and can be removed
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
   *
   * <p><b>Java 8 users:</b> many use cases for this method are better addressed by {@link
   * java.util.stream.Stream#filter}. This method is not being deprecated, but we gently encourage
   * you to migrate to streams.
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.stream` is unnecessary and can be removed
in `guava/src/com/google/common/collect/Iterables.java`
#### Snippet
```java
 *
 * <p><b>Java 8 users:</b> several common uses for this class are now more comprehensively addressed
 * by the new {@link java.util.stream.Stream} library. Read the method documentation below for
 * comparisons. This class is not being deprecated, but we gently encourage you to migrate to
 * streams.
```

## RuleId[ruleID=ComparatorMethodParameterNotUsed]
### RuleId[ruleID=ComparatorMethodParameterNotUsed]
Comparator never returns negative value
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java

    @Override
    public int compareTo(Cut<Comparable<?>> o) {
      return (o == this) ? 0 : 1;
    }
```

### RuleId[ruleID=ComparatorMethodParameterNotUsed]
Comparator never returns positive value
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java

    @Override
    public int compareTo(Cut<Comparable<?>> o) {
      return (o == this) ? 0 : -1;
    }
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `StandardDescendingMultiset()` of an abstract class should not be declared 'public'
in `guava/src/com/google/common/collect/ForwardingSortedMultiset.java`
#### Snippet
```java
  protected abstract class StandardDescendingMultiset extends DescendingMultiset<E> {
    /** Constructor for use by subclasses. */
    public StandardDescendingMultiset() {}

    @Override
```

## RuleId[ruleID=Anonymous2MethodRef]
### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new Supplier() can be replaced with method reference
in `guava/src/com/google/common/cache/LongAddables.java`
#### Snippet
```java
      LongAdder unused = new LongAdder();
      supplier =
          new Supplier<LongAddable>() {
            @Override
            public LongAddable get() {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new Supplier() can be replaced with method reference
in `guava/src/com/google/common/cache/LongAddables.java`
#### Snippet
```java
    } catch (Throwable t) { // we really want to catch *everything*
      supplier =
          new Supplier<LongAddable>() {
            @Override
            public LongAddable get() {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new SuccessorsFunction() can be replaced with method reference
in `guava/src/com/google/common/io/MoreFiles.java`
#### Snippet
```java

  private static final SuccessorsFunction<Path> FILE_TREE =
      new SuccessorsFunction<Path>() {
        @Override
        public Iterable<Path> successors(Path path) {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new Supplier() can be replaced with method reference
in `guava/src/com/google/common/hash/LongAddables.java`
#### Snippet
```java
      LongAdder unused = new LongAdder();
      supplier =
          new Supplier<LongAddable>() {
            @Override
            public LongAddable get() {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new Supplier() can be replaced with method reference
in `guava/src/com/google/common/hash/LongAddables.java`
#### Snippet
```java
    } catch (Throwable t) { // we really want to catch *everything*
      supplier =
          new Supplier<LongAddable>() {
            @Override
            public LongAddable get() {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new Supplier() can be replaced with method reference
in `guava/src/com/google/common/util/concurrent/AbstractExecutionThreadService.java`
#### Snippet
```java
              MoreExecutors.renamingDecorator(
                  executor(),
                  new Supplier<String>() {
                    @Override
                    public String get() {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new Function, Map\>() can be replaced with method reference
in `guava/src/com/google/common/collect/Tables.java`
#### Snippet
```java

  private static final Function<? extends Map<?, ?>, ? extends Map<?, ?>> UNMODIFIABLE_WRAPPER =
      new Function<Map<Object, Object>, Map<Object, Object>>() {
        @Override
        public Map<Object, Object> apply(Map<Object, Object> input) {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new Function\>() can be replaced with method reference
in `guava/src/com/google/common/graph/AbstractNetwork.java`
#### Snippet
```java
            return Iterators.transform(
                AbstractNetwork.this.edges().iterator(),
                new Function<E, EndpointPair<N>>() {
                  @Override
                  public EndpointPair<N> apply(E edge) {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new Function\>() can be replaced with method reference
in `guava/src/com/google/common/graph/AbstractNetwork.java`
#### Snippet
```java
  private static <N, E> Map<E, EndpointPair<N>> edgeIncidentNodesMap(final Network<N, E> network) {
    Function<E, EndpointPair<N>> edgeToIncidentNodesFn =
        new Function<E, EndpointPair<N>>() {
          @Override
          public EndpointPair<N> apply(E edge) {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new Function\>() can be replaced with method reference
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
        return Maps.asMapEntryIterator(
            backingMap.keySet(),
            new Function<R, Map<C, V>>() {
              @Override
              public Map<C, V> apply(R rowKey) {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new Function\>() can be replaced with method reference
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
        return Maps.asMapEntryIterator(
            columnKeySet(),
            new Function<C, Map<R, V>>() {
              @Override
              public Map<R, V> apply(C columnKey) {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new Function, Long\>() can be replaced with method reference
in `guava/src/com/google/common/util/concurrent/ServiceManager.java`
#### Snippet
```java
          Ordering.natural()
              .onResultOf(
                  new Function<Entry<Service, Long>, Long>() {
                    @Override
                    public Long apply(Entry<Service, Long> input) {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new Function, Iterator\>() can be replaced with method reference
in `guava/src/com/google/common/collect/Iterables.java`
#### Snippet
```java
  static <T extends @Nullable Object>
      Function<Iterable<? extends T>, Iterator<? extends T>> toIterator() {
    return new Function<Iterable<? extends T>, Iterator<? extends T>>() {
      @Override
      public Iterator<? extends T> apply(Iterable<? extends T> iterable) {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new Function, Collection\>() can be replaced with method reference
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
                    Maps.transformValues(
                        delegate.asMap(),
                        new Function<Collection<V>, Collection<V>>() {
                          @Override
                          public Collection<V> apply(Collection<V> collection) {
```

## RuleId[ruleID=Convert2Lambda]
### RuleId[ruleID=Convert2Lambda]
Anonymous new Supplier() can be replaced with lambda
in `guava/src/com/google/common/cache/LongAddables.java`
#### Snippet
```java
      LongAdder unused = new LongAdder();
      supplier =
          new Supplier<LongAddable>() {
            @Override
            public LongAddable get() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Supplier() can be replaced with lambda
in `guava/src/com/google/common/cache/LongAddables.java`
#### Snippet
```java
    } catch (Throwable t) { // we really want to catch *everything*
      supplier =
          new Supplier<LongAddable>() {
            @Override
            public LongAddable get() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Supplier() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
          MoreExecutors.renamingDecorator(
              executor(),
              new Supplier<String>() {
                @Override
                public String get() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Runnable() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
              });
      executorService.execute(
          new Runnable() {
            @Override
            public void run() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Runnable() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
      runningTask.cancel(false);
      executorService.execute(
          new Runnable() {
            @Override
            public void run() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Runnable() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/Futures.java`
#### Snippet
```java
    final Future<?> scheduled = executorService.schedule(task, delay, timeUnit);
    task.addListener(
        new Runnable() {
          @Override
          public void run() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Runnable() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/Futures.java`
#### Snippet
```java
      final int localI = i;
      copy[i].addListener(
          new Runnable() {
            @Override
            public void run() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Predicate\>() can be replaced with lambda
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
      return Sets.filter(
          unfiltered.entrySet(),
          new Predicate<Entry<E>>() {
            @Override
            public boolean apply(Entry<E> entry) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Supplier() can be replaced with lambda
in `guava/src/com/google/common/hash/LongAddables.java`
#### Snippet
```java
      LongAdder unused = new LongAdder();
      supplier =
          new Supplier<LongAddable>() {
            @Override
            public LongAddable get() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Supplier() can be replaced with lambda
in `guava/src/com/google/common/hash/LongAddables.java`
#### Snippet
```java
    } catch (Throwable t) { // we really want to catch *everything*
      supplier =
          new Supplier<LongAddable>() {
            @Override
            public LongAddable get() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function, EndpointPair\>() can be replaced with lambda
in `guava/src/com/google/common/graph/Graphs.java`
#### Snippet
```java
          return Iterators.transform(
              delegate().incidentEdges(node).iterator(),
              new Function<EndpointPair<N>, EndpointPair<N>>() {
                @Override
                public EndpointPair<N> apply(EndpointPair<N> edge) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Runnable() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/AbstractIdleService.java`
#### Snippet
```java
      MoreExecutors.renamingDecorator(executor(), threadNameSupplier)
          .execute(
              new Runnable() {
                @Override
                public void run() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Runnable() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/AbstractIdleService.java`
#### Snippet
```java
      MoreExecutors.renamingDecorator(executor(), threadNameSupplier)
          .execute(
              new Runnable() {
                @Override
                public void run() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Runnable() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/Runnables.java`
#### Snippet
```java

  private static final Runnable EMPTY_RUNNABLE =
      new Runnable() {
        @Override
        public void run() {}
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Supplier() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/AbstractExecutionThreadService.java`
#### Snippet
```java
              MoreExecutors.renamingDecorator(
                  executor(),
                  new Supplier<String>() {
                    @Override
                    public String get() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Runnable() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/AbstractExecutionThreadService.java`
#### Snippet
```java
                  });
          executor.execute(
              new Runnable() {
                @Override
                public void run() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function, Cell\>() can be replaced with lambda
in `guava/src/com/google/common/collect/Tables.java`
#### Snippet
```java

    Function<Cell<R, C, V1>, Cell<R, C, V2>> cellFunction() {
      return new Function<Cell<R, C, V1>, Cell<R, C, V2>>() {
        @Override
        public Cell<R, C, V2> apply(Cell<R, C, V1> cell) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function, Cell\>() can be replaced with lambda
in `guava/src/com/google/common/collect/Tables.java`
#### Snippet
```java
    // Will cast TRANSPOSE_CELL to a type that always succeeds
    private static final Function<Cell<?, ?, ?>, Cell<?, ?, ?>> TRANSPOSE_CELL =
        new Function<Cell<?, ?, ?>, Cell<?, ?, ?>>() {
          @Override
          public Cell<?, ?, ?> apply(Cell<?, ?, ?> cell) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function, Map\>() can be replaced with lambda
in `guava/src/com/google/common/collect/Tables.java`
#### Snippet
```java
    public Map<R, Map<C, V2>> rowMap() {
      Function<Map<C, V1>, Map<C, V2>> rowFunction =
          new Function<Map<C, V1>, Map<C, V2>>() {
            @Override
            public Map<C, V2> apply(Map<C, V1> row) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function, Map\>() can be replaced with lambda
in `guava/src/com/google/common/collect/Tables.java`
#### Snippet
```java
    public Map<C, Map<R, V2>> columnMap() {
      Function<Map<R, V1>, Map<R, V2>> columnFunction =
          new Function<Map<R, V1>, Map<R, V2>>() {
            @Override
            public Map<R, V2> apply(Map<R, V1> column) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function, Map\>() can be replaced with lambda
in `guava/src/com/google/common/collect/Tables.java`
#### Snippet
```java

  private static final Function<? extends Map<?, ?>, ? extends Map<?, ?>> UNMODIFIABLE_WRAPPER =
      new Function<Map<Object, Object>, Map<Object, Object>>() {
        @Override
        public Map<Object, Object> apply(Map<Object, Object> input) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Predicate() can be replaced with lambda
in `guava/src/com/google/common/graph/AbstractNetwork.java`
#### Snippet
```java

  private Predicate<E> connectedPredicate(final N nodePresent, final N nodeToCheck) {
    return new Predicate<E>() {
      @Override
      public boolean apply(E edge) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function\>() can be replaced with lambda
in `guava/src/com/google/common/graph/AbstractNetwork.java`
#### Snippet
```java
            return Iterators.transform(
                AbstractNetwork.this.edges().iterator(),
                new Function<E, EndpointPair<N>>() {
                  @Override
                  public EndpointPair<N> apply(E edge) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function\>() can be replaced with lambda
in `guava/src/com/google/common/graph/AbstractNetwork.java`
#### Snippet
```java
  private static <N, E> Map<E, EndpointPair<N>> edgeIncidentNodesMap(final Network<N, E> network) {
    Function<E, EndpointPair<N>> edgeToIncidentNodesFn =
        new Function<E, EndpointPair<N>>() {
          @Override
          public EndpointPair<N> apply(E edge) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function, V\>() can be replaced with lambda
in `guava/src/com/google/common/graph/AbstractValueGraph.java`
#### Snippet
```java
  private static <N, V> Map<EndpointPair<N>, V> edgeValueMap(final ValueGraph<N, V> graph) {
    Function<EndpointPair<N>, V> edgeToValueFn =
        new Function<EndpointPair<N>, V>() {
          @Override
          public V apply(EndpointPair<N> edge) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Runnable() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/MoreExecutors.java`
#### Snippet
```java
    final ListenableFuture<T> future = executorService.submit(task);
    future.addListener(
        new Runnable() {
          @Override
          public void run() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Runnable() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/MoreExecutors.java`
#### Snippet
```java
          MoreExecutors.newThread(
              "DelayedShutdownHook-for-" + service,
              new Runnable() {
                @Override
                public void run() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function, Boolean\>() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/FuturesGetChecked.java`
#### Snippet
```java
      Ordering.natural()
          .onResultOf(
              new Function<Constructor<?>, Boolean>() {
                @Override
                public Boolean apply(Constructor<?> input) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new com.google.common.base.Function, Map\>() can be replaced with lambda
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
            Maps.transformValues(
                delegate().columnMap(),
                new com.google.common.base.Function<Map<R, V>, Map<R, V>>() {
                  @Override
                  public Map<R, V> apply(Map<R, V> t) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new com.google.common.base.Function, Map\>() can be replaced with lambda
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
            Maps.transformValues(
                delegate().rowMap(),
                new com.google.common.base.Function<Map<C, V>, Map<C, V>>() {
                  @Override
                  public Map<C, V> apply(Map<C, V> t) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function\>() can be replaced with lambda
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
        return Maps.asMapEntryIterator(
            backingMap.keySet(),
            new Function<R, Map<C, V>>() {
              @Override
              public Map<C, V> apply(R rowKey) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function\>() can be replaced with lambda
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
        return Maps.asMapEntryIterator(
            columnKeySet(),
            new Function<C, Map<R, V>>() {
              @Override
              public Map<R, V> apply(C columnKey) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function, FluentFuture\>() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java

    private static final Function<ClosingFuture<?>, FluentFuture<?>> INNER_FUTURE =
        new Function<ClosingFuture<?>, FluentFuture<?>>() {
          @Override
          public FluentFuture<?> apply(ClosingFuture<?> future) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Runnable() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
    }
    future.addListener(
        new Runnable() {
          @Override
          public void run() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Runnable() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
      logger.log(FINER, "will close {0}", this);
      future.addListener(
          new Runnable() {
            @Override
            public void run() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new AsyncClosingFunction() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
      AsyncClosingFunction<V, U> withoutCloser(final AsyncFunction<V, U> function) {
    checkNotNull(function);
    return new AsyncClosingFunction<V, U>() {
      @Override
      public ClosingFuture<U> apply(DeferredCloser closer, V input) throws Exception {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Runnable() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
    try {
      executor.execute(
          new Runnable() {
            @Override
            public void run() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function, Long\>() can be replaced with lambda
in `guava/src/com/google/common/util/concurrent/ServiceManager.java`
#### Snippet
```java
          Ordering.natural()
              .onResultOf(
                  new Function<Entry<Service, Long>, Long>() {
                    @Override
                    public Long apply(Entry<Service, Long> input) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Comparator\<@Nullable Entry\>() can be replaced with lambda
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
              0,
              size,
              new Comparator<@Nullable Entry<K, V>>() {
                @Override
                public int compare(@CheckForNull Entry<K, V> e1, @CheckForNull Entry<K, V> e2) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function, Iterator\>() can be replaced with lambda
in `guava/src/com/google/common/collect/Iterables.java`
#### Snippet
```java
  static <T extends @Nullable Object>
      Function<Iterable<? extends T>, Iterator<? extends T>> toIterator() {
    return new Function<Iterable<? extends T>, Iterator<? extends T>>() {
      @Override
      public Iterator<? extends T> apply(Iterable<? extends T> iterable) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function, Collection\>() can be replaced with lambda
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
                    Maps.transformValues(
                        delegate.asMap(),
                        new Function<Collection<V>, Collection<V>>() {
                          @Override
                          public Collection<V> apply(Collection<V> collection) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function\>() can be replaced with lambda
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
        return Maps.asMapEntryIterator(
            multimap.keySet(),
            new Function<K, Collection<V>>() {
              @Override
              public Collection<V> apply(@ParametricNullness K key) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new EntryTransformer, Collection\>() can be replaced with lambda
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
      return Maps.transformEntries(
          fromMultimap.asMap(),
          new EntryTransformer<K, Collection<V1>, Collection<V2>>() {
            @Override
            public Collection<V2> transformEntry(@ParametricNullness K key, Collection<V1> value) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function, Entry\>() can be replaced with lambda
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
          final EntryTransformer<? super K, ? super V1, V2> transformer) {
    checkNotNull(transformer);
    return new Function<Entry<K, V1>, Entry<K, V2>>() {
      @Override
      public Entry<K, V2> apply(final Entry<K, V1> entry) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Predicate\>() can be replaced with lambda
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
        Predicate<Entry<V, K>> inversePredicate(
            final Predicate<? super Entry<K, V>> forwardPredicate) {
      return new Predicate<Entry<V, K>>() {
        @Override
        public boolean apply(Entry<V, K> input) {
```

## RuleId[ruleID=CaughtExceptionImmediatelyRethrown]
### RuleId[ruleID=CaughtExceptionImmediatelyRethrown]
Caught exception `e` is immediately rethrown
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
      } catch (NoSuchFieldException e) {
        throw new RuntimeException(e);
      } catch (RuntimeException e) {
        throw e;
      }
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `entryArray`
in `guava/src/com/google/common/collect/JdkBackedImmutableMap.java`
#### Snippet
```java
        newEntryArray[outI++] = entry;
      }
      entryArray = newEntryArray;
    }
    return new JdkBackedImmutableMap<>(delegateMap, ImmutableList.asImmutableList(entryArray, n));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `guava/src/com/google/common/escape/CharEscaper.java`
#### Snippet
```java
    // Loop through the rest of the string, replacing when needed into the
    // destination buffer, which gets grown as needed as well.
    for (; index < slen; index++) {

      // Get a replacement for the current character.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h1`
in `guava/src/com/google/common/hash/Murmur3_32HashFunction.java`
#### Snippet
```java

  private static int mixH1(int h1, int k1) {
    h1 ^= k1;
    h1 = Integer.rotateLeft(h1, 13);
    h1 = h1 * 5 + 0xe6546b64;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h1`
in `guava/src/com/google/common/hash/Murmur3_32HashFunction.java`
#### Snippet
```java
  private static int mixH1(int h1, int k1) {
    h1 ^= k1;
    h1 = Integer.rotateLeft(h1, 13);
    h1 = h1 * 5 + 0xe6546b64;
    return h1;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h1`
in `guava/src/com/google/common/hash/Murmur3_32HashFunction.java`
#### Snippet
```java
    h1 ^= k1;
    h1 = Integer.rotateLeft(h1, 13);
    h1 = h1 * 5 + 0xe6546b64;
    return h1;
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k1`
in `guava/src/com/google/common/hash/Murmur3_32HashFunction.java`
#### Snippet
```java

  private static int mixK1(int k1) {
    k1 *= C1;
    k1 = Integer.rotateLeft(k1, 15);
    k1 *= C2;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k1`
in `guava/src/com/google/common/hash/Murmur3_32HashFunction.java`
#### Snippet
```java
  private static int mixK1(int k1) {
    k1 *= C1;
    k1 = Integer.rotateLeft(k1, 15);
    k1 *= C2;
    return k1;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k1`
in `guava/src/com/google/common/hash/Murmur3_32HashFunction.java`
#### Snippet
```java
    k1 *= C1;
    k1 = Integer.rotateLeft(k1, 15);
    k1 *= C2;
    return k1;
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h1`
in `guava/src/com/google/common/hash/Murmur3_32HashFunction.java`
#### Snippet
```java
  // Finalization mix - force all bits of a hash block to avalanche
  private static HashCode fmix(int h1, int length) {
    h1 ^= length;
    h1 ^= h1 >>> 16;
    h1 *= 0x85ebca6b;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h1`
in `guava/src/com/google/common/hash/Murmur3_32HashFunction.java`
#### Snippet
```java
  private static HashCode fmix(int h1, int length) {
    h1 ^= length;
    h1 ^= h1 >>> 16;
    h1 *= 0x85ebca6b;
    h1 ^= h1 >>> 13;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h1`
in `guava/src/com/google/common/hash/Murmur3_32HashFunction.java`
#### Snippet
```java
    h1 ^= length;
    h1 ^= h1 >>> 16;
    h1 *= 0x85ebca6b;
    h1 ^= h1 >>> 13;
    h1 *= 0xc2b2ae35;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h1`
in `guava/src/com/google/common/hash/Murmur3_32HashFunction.java`
#### Snippet
```java
    h1 ^= h1 >>> 16;
    h1 *= 0x85ebca6b;
    h1 ^= h1 >>> 13;
    h1 *= 0xc2b2ae35;
    h1 ^= h1 >>> 16;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h1`
in `guava/src/com/google/common/hash/Murmur3_32HashFunction.java`
#### Snippet
```java
    h1 *= 0x85ebca6b;
    h1 ^= h1 >>> 13;
    h1 *= 0xc2b2ae35;
    h1 ^= h1 >>> 16;
    return HashCode.fromInt(h1);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h1`
in `guava/src/com/google/common/hash/Murmur3_32HashFunction.java`
#### Snippet
```java
    h1 ^= h1 >>> 13;
    h1 *= 0xc2b2ae35;
    h1 ^= h1 >>> 16;
    return HashCode.fromInt(h1);
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `keyBucketHead`
in `guava/src/com/google/common/collect/RegularImmutableMap.java`
#### Snippet
```java
      throws BucketOverflowException {
    int bucketSize = 0;
    for (; keyBucketHead != null; keyBucketHead = keyBucketHead.getNextInKeyBucket()) {
      if (keyBucketHead.getKey().equals(key)) {
        if (throwIfDuplicateKeys) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `callInterruptTask`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
         * invoke interruptTask on any subsequent futures.
         */
        callInterruptTask = false;
      }
      // We call this before the listeners in order to avoid needing to manage a separate stack data
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `exceptions`
in `guava/src/com/google/common/io/MoreFiles.java`
#### Snippet
```java
      @CheckForNull Collection<IOException> exceptions, IOException e) {
    if (exceptions == null) {
      exceptions = new ArrayList<>(); // don't need Set semantics
    }
    exceptions.add(e);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `safeMax`
in `guava/src/com/google/common/escape/ArrayBasedCharEscaper.java`
#### Snippet
```java
      // If the safe range is empty, set the range limits to opposite extremes
      // to ensure the first test of either value will (almost certainly) fail.
      safeMax = Character.MIN_VALUE;
      safeMin = Character.MAX_VALUE;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `safeMin`
in `guava/src/com/google/common/escape/ArrayBasedCharEscaper.java`
#### Snippet
```java
      // to ensure the first test of either value will (almost certainly) fail.
      safeMax = Character.MIN_VALUE;
      safeMin = Character.MAX_VALUE;
    }
    this.safeMin = safeMin;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
        previous = (keyList == null) ? null : keyList.tail;
        nextIndex = size;
        while (index++ < size) {
          previous();
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
      } else {
        next = (keyList == null) ? null : keyList.head;
        while (index-- > 0) {
          next();
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
        previous = tail;
        nextIndex = size;
        while (index++ < size) {
          previous();
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
      } else {
        next = head;
        while (index-- > 0) {
          next();
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `csum`
in `guava/src/com/google/common/hash/Crc32cHashFunction.java`
#### Snippet
```java

    static int combine(int csum, int crc) {
      csum ^= crc;
      for (int i = 0; i < 4; i++) {
        csum = (csum >>> 8) ^ BYTE_TABLE[csum & 0xFF];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `csum`
in `guava/src/com/google/common/hash/Crc32cHashFunction.java`
#### Snippet
```java
      csum ^= crc;
      for (int i = 0; i < 4; i++) {
        csum = (csum >>> 8) ^ BYTE_TABLE[csum & 0xFF];
      }
      return csum;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `seedA`
in `guava/src/com/google/common/hash/Fingerprint2011.java`
#### Snippet
```java
    long part4 = load64(bytes, offset + 24);

    seedA += part1;
    seedB = rotateRight(seedB + seedA + part4, 51);
    long c = seedA;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `seedB`
in `guava/src/com/google/common/hash/Fingerprint2011.java`
#### Snippet
```java

    seedA += part1;
    seedB = rotateRight(seedB + seedA + part4, 51);
    long c = seedA;
    seedA += part2;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `seedA`
in `guava/src/com/google/common/hash/Fingerprint2011.java`
#### Snippet
```java
    seedB = rotateRight(seedB + seedA + part4, 51);
    long c = seedA;
    seedA += part2;
    seedA += part3;
    seedB += rotateRight(seedA, 23);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `seedA`
in `guava/src/com/google/common/hash/Fingerprint2011.java`
#### Snippet
```java
    long c = seedA;
    seedA += part2;
    seedA += part3;
    seedB += rotateRight(seedA, 23);
    output[0] = seedA + part4;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `seedB`
in `guava/src/com/google/common/hash/Fingerprint2011.java`
#### Snippet
```java
    seedA += part2;
    seedA += part3;
    seedB += rotateRight(seedA, 23);
    output[0] = seedA + part4;
    output[1] = seedB + c;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `length`
in `guava/src/com/google/common/hash/Fingerprint2011.java`
#### Snippet
```java

    // Decrease length to the nearest multiple of 64, and operate on 64-byte chunks.
    length = (length - 1) & ~63;
    do {
      x = rotateRight(x + y + v[0] + load64(bytes, offset + 16), 37) * K1;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `guava/src/com/google/common/hash/Fingerprint2011.java`
#### Snippet
```java
      z = x;
      x = tmp;
      offset += 64;
      length -= 64;
    } while (length != 0);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `length`
in `guava/src/com/google/common/hash/Fingerprint2011.java`
#### Snippet
```java
      x = tmp;
      offset += 64;
      length -= 64;
    } while (length != 0);
    return hash128to64(hash128to64(v[0], w[0]) + shiftMix(y) * K1 + z, hash128to64(v[1], w[1]) + x);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `guava/src/com/google/common/collect/ImmutableMultimap.java`
#### Snippet
```java
    int copyIntoArray(@Nullable Object[] dst, int offset) {
      for (ImmutableCollection<V> valueCollection : multimap.map.values()) {
        offset = valueCollection.copyIntoArray(dst, offset);
      }
      return offset;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `maxLength`
in `guava/src/com/google/common/hash/HashCode.java`
#### Snippet
```java
  @CanIgnoreReturnValue
  public int writeBytesTo(byte[] dest, int offset, int maxLength) {
    maxLength = Ints.min(maxLength, bits() / 8);
    Preconditions.checkPositionIndexes(offset, offset + maxLength, dest.length);
    writeBytesToImpl(dest, offset, maxLength);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `guava/src/com/google/common/primitives/Longs.java`
#### Snippet
```java
    for (int i = 7; i >= 0; i--) {
      result[i] = (byte) (value & 0xffL);
      value >>= 8;
    }
    return result;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `safeMax`
in `guava/src/com/google/common/escape/ArrayBasedUnicodeEscaper.java`
#### Snippet
```java
      // If the safe range is empty, set the range limits to opposite extremes
      // to ensure the first test of either value will fail.
      safeMax = -1;
      safeMin = Integer.MAX_VALUE;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `safeMin`
in `guava/src/com/google/common/escape/ArrayBasedUnicodeEscaper.java`
#### Snippet
```java
      // to ensure the first test of either value will fail.
      safeMax = -1;
      safeMin = Integer.MAX_VALUE;
    }
    this.safeMin = safeMin;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `guava/src/com/google/common/escape/ArrayBasedUnicodeEscaper.java`
#### Snippet
```java
        break;
      }
      index++;
    }
    return index;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `permitsToTake`
in `guava/src/com/google/common/util/concurrent/SmoothRateLimiter.java`
#### Snippet
```java
                + permitsToTime(availablePermitsAboveThreshold - permitsAboveThresholdToTake);
        micros = (long) (permitsAboveThresholdToTake * length / 2.0);
        permitsToTake -= permitsAboveThresholdToTake;
      }
      // measuring the integral on the left part of the function (the horizontal line)
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `n`
in `guava/src/com/google/common/io/CharStreams.java`
#### Snippet
```java
        throw new EOFException();
      }
      n -= amt;
    }
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k`
in `guava/src/com/google/common/hash/Murmur3_128HashFunction.java`
#### Snippet
```java

    private static long fmix64(long k) {
      k ^= k >>> 33;
      k *= 0xff51afd7ed558ccdL;
      k ^= k >>> 33;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k`
in `guava/src/com/google/common/hash/Murmur3_128HashFunction.java`
#### Snippet
```java
    private static long fmix64(long k) {
      k ^= k >>> 33;
      k *= 0xff51afd7ed558ccdL;
      k ^= k >>> 33;
      k *= 0xc4ceb9fe1a85ec53L;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k`
in `guava/src/com/google/common/hash/Murmur3_128HashFunction.java`
#### Snippet
```java
      k ^= k >>> 33;
      k *= 0xff51afd7ed558ccdL;
      k ^= k >>> 33;
      k *= 0xc4ceb9fe1a85ec53L;
      k ^= k >>> 33;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k`
in `guava/src/com/google/common/hash/Murmur3_128HashFunction.java`
#### Snippet
```java
      k *= 0xff51afd7ed558ccdL;
      k ^= k >>> 33;
      k *= 0xc4ceb9fe1a85ec53L;
      k ^= k >>> 33;
      return k;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k`
in `guava/src/com/google/common/hash/Murmur3_128HashFunction.java`
#### Snippet
```java
      k ^= k >>> 33;
      k *= 0xc4ceb9fe1a85ec53L;
      k ^= k >>> 33;
      return k;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k1`
in `guava/src/com/google/common/hash/Murmur3_128HashFunction.java`
#### Snippet
```java

    private static long mixK1(long k1) {
      k1 *= C1;
      k1 = Long.rotateLeft(k1, 31);
      k1 *= C2;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k1`
in `guava/src/com/google/common/hash/Murmur3_128HashFunction.java`
#### Snippet
```java
    private static long mixK1(long k1) {
      k1 *= C1;
      k1 = Long.rotateLeft(k1, 31);
      k1 *= C2;
      return k1;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k1`
in `guava/src/com/google/common/hash/Murmur3_128HashFunction.java`
#### Snippet
```java
      k1 *= C1;
      k1 = Long.rotateLeft(k1, 31);
      k1 *= C2;
      return k1;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k2`
in `guava/src/com/google/common/hash/Murmur3_128HashFunction.java`
#### Snippet
```java

    private static long mixK2(long k2) {
      k2 *= C2;
      k2 = Long.rotateLeft(k2, 33);
      k2 *= C1;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k2`
in `guava/src/com/google/common/hash/Murmur3_128HashFunction.java`
#### Snippet
```java
    private static long mixK2(long k2) {
      k2 *= C2;
      k2 = Long.rotateLeft(k2, 33);
      k2 *= C1;
      return k2;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k2`
in `guava/src/com/google/common/hash/Murmur3_128HashFunction.java`
#### Snippet
```java
      k2 *= C2;
      k2 = Long.rotateLeft(k2, 33);
      k2 *= C1;
      return k2;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `hc`
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
    int h;
    if (hc == null) {
      threadHashCode.set(hc = new int[1]); // Initialize randomly
      int r = rng.nextInt(); // Avoid zero to allow xorShift rehash
      h = hc[0] = (r == 0) ? 1 : r;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `wasUncontended`
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
          collide = false;
        } else if (!wasUncontended) // CAS already known to fail
        wasUncontended = true; // Continue after rehash
        else if (a.cas(v = a.value, fn(v, x))) break;
        else if (n >= NCPU || cells != as) collide = false; // At max size or stale
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `valueBucketHead`
in `guava/src/com/google/common/collect/RegularImmutableBiMap.java`
#### Snippet
```java
      throws BucketOverflowException {
    int bucketSize = 0;
    for (; valueBucketHead != null; valueBucketHead = valueBucketHead.getNextInValueBucket()) {
      checkNoConflict(!value.equals(valueBucketHead.getValue()), "value", entry, valueBucketHead);
      if (++bucketSize > MAX_HASH_BUCKET_LENGTH) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `hashCode`
in `guava/src/com/google/common/util/concurrent/Striped.java`
#### Snippet
```java
  // Copied from java/com/google/common/collect/Hashing.java
  private static int smear(int hashCode) {
    hashCode ^= (hashCode >>> 20) ^ (hashCode >>> 12);
    return hashCode ^ (hashCode >>> 7) ^ (hashCode >>> 4);
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `guava/src/com/google/common/io/ByteSource.java`
#### Snippet
```java
      checkArgument(length >= 0, "length (%s) may not be negative", length);

      offset = Math.min(offset, this.length);
      length = Math.min(length, this.length - offset);
      int newOffset = this.offset + (int) offset;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `length`
in `guava/src/com/google/common/io/ByteSource.java`
#### Snippet
```java

      offset = Math.min(offset, this.length);
      length = Math.min(length, this.length - offset);
      int newOffset = this.offset + (int) offset;
      return new ByteArrayByteSource(bytes, newOffset, (int) length);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
     */
    int aTwos = Integer.numberOfTrailingZeros(a);
    a >>= aTwos; // divide out all 2s
    int bTwos = Integer.numberOfTrailingZeros(b);
    b >>= bTwos; // divide out all 2s
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `b`
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    a >>= aTwos; // divide out all 2s
    int bTwos = Integer.numberOfTrailingZeros(b);
    b >>= bTwos; // divide out all 2s
    while (a != b) { // both a, b are odd
      // The key to the binary GCD algorithm is as follows:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
      // equivalent to Math.min(delta, 0)

      a = delta - minDeltaOrZero - minDeltaOrZero; // sets a to Math.abs(a - b)
      // a is now nonnegative and even

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `b`
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
      // a is now nonnegative and even

      b += minDeltaOrZero; // sets b to min(old a, b)
      a >>= Integer.numberOfTrailingZeros(a); // divide out all 2s, since 2 doesn't divide b
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java

      b += minDeltaOrZero; // sets b to min(old a, b)
      a >>= Integer.numberOfTrailingZeros(a); // divide out all 2s, since 2 doesn't divide b
    }
    return a << min(aTwos, bTwos);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k`
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
        // continue below to handle the general case
    }
    for (int accum = 1; ; k >>= 1) {
      switch (k) {
        case 0:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `b`
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
        default:
          accum *= ((k & 1) == 0) ? 1 : b;
          b *= b;
      }
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k`
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    checkArgument(k <= n, "k (%s) > n (%s)", k, n);
    if (k > (n >> 1)) {
      k = n - k;
    }
    if (k >= biggestBinomials.length || n > biggestBinomials[k]) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k`
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
            accum = saturatedMultiply(accum, b);
          }
          k >>= 1;
          if (k > 0) {
            if (-FLOOR_SQRT_MAX_INT > b | b > FLOOR_SQRT_MAX_INT) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `b`
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
              return limit;
            }
            b *= b;
          }
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k`
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
            accum = checkedMultiply(accum, b);
          }
          k >>= 1;
          if (k > 0) {
            checkNoOverflow(-FLOOR_SQRT_MAX_INT <= b & b <= FLOOR_SQRT_MAX_INT, "checkedPow", b, k);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `b`
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
          if (k > 0) {
            checkNoOverflow(-FLOOR_SQRT_MAX_INT <= b & b <= FLOOR_SQRT_MAX_INT, "checkedPow", b, k);
            b *= b;
          }
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `inMatchingGroup`
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
        if (!inMatchingGroup) {
          builder.append(replacement);
          inMatchingGroup = true;
        }
      } else {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `inMatchingGroup`
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
      } else {
        builder.append(c);
        inMatchingGroup = false;
      }
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    for (int i = 0; i < 4; i++) {
      tmp[5 - i] = hex.charAt(c & 0xF);
      c = (char) (c >> 4);
    }
    return String.copyValueOf(tmp);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `table`
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
      super(description);
      if (table.length() + Long.SIZE < table.size()) {
        table = (BitSet) table.clone();
        // If only we could actually call BitSet.trimToSize() ourselves...
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `expectedEntries`
in `guava/src/com/google/common/collect/Hashing.java`
#### Snippet
```java
    // Get the recommended table size.
    // Round down to the nearest power of 2.
    expectedEntries = Math.max(expectedEntries, 2);
    int tableSize = Integer.highestOneBit(expectedEntries);
    // Check to make sure that we will not exceed the maximum load factor.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `targets`
in `guava/src/com/google/common/collect/RegularImmutableSortedSet.java`
#### Snippet
```java
    // graduates from labs.
    if (targets instanceof Multiset) {
      targets = ((Multiset<?>) targets).elementSet();
    }
    if (!SortedIterables.hasSameComparator(comparator(), targets) || (targets.size() <= 1)) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
     */
    int aTwos = Long.numberOfTrailingZeros(a);
    a >>= aTwos; // divide out all 2s
    int bTwos = Long.numberOfTrailingZeros(b);
    b >>= bTwos; // divide out all 2s
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `b`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    a >>= aTwos; // divide out all 2s
    int bTwos = Long.numberOfTrailingZeros(b);
    b >>= bTwos; // divide out all 2s
    while (a != b) { // both a, b are odd
      // The key to the binary GCD algorithm is as follows:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
      // equivalent to Math.min(delta, 0)

      a = delta - minDeltaOrZero - minDeltaOrZero; // sets a to Math.abs(a - b)
      // a is now nonnegative and even

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `b`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
      // a is now nonnegative and even

      b += minDeltaOrZero; // sets b to min(old a, b)
      a >>= Long.numberOfTrailingZeros(a); // divide out all 2s, since 2 doesn't divide b
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java

      b += minDeltaOrZero; // sets b to min(old a, b)
      a >>= Long.numberOfTrailingZeros(a); // divide out all 2s, since 2 doesn't divide b
    }
    return a << min(aTwos, bTwos);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
            accum = checkedMultiply(accum, b);
          }
          k >>= 1;
          if (k > 0) {
            checkNoOverflow(
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `b`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
            checkNoOverflow(
                -FLOOR_SQRT_MAX_LONG <= b && b <= FLOOR_SQRT_MAX_LONG, "checkedPow", b, k);
            b *= b;
          }
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
            accum = saturatedMultiply(accum, b);
          }
          k >>= 1;
          if (k > 0) {
            if (-FLOOR_SQRT_MAX_LONG > b | b > FLOOR_SQRT_MAX_LONG) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `b`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
              return limit;
            }
            b *= b;
          }
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
          // shift is either the number of powers of 2 left to multiply a by, or the biggest shift
          // possible while keeping a in an unsigned long.
          a = UnsignedLongs.remainder(a << shift, m);
          remainingPowersOf2 -= shift;
        } while (remainingPowersOf2 > 0);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `x`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    }
    long commonDivisor = gcd(x, denominator);
    x /= commonDivisor;
    denominator /= commonDivisor;
    // We know gcd(x, denominator) = 1, and x * numerator / denominator is exact,
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `denominator`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    long commonDivisor = gcd(x, denominator);
    x /= commonDivisor;
    denominator /= commonDivisor;
    // We know gcd(x, denominator) = 1, and x * numerator / denominator is exact,
    // so denominator must be a divisor of numerator.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `p`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    private long powMod(long a, long p, long m) {
      long res = 1;
      for (; p != 0; p >>= 1) {
        if ((p & 1) != 0) {
          res = mulMod(res, a, m);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
          res = mulMod(res, a, m);
        }
        a = squareMod(a, m);
      }
      return res;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
      }
    }
    for (long accum = 1; ; k >>= 1) {
      switch (k) {
        case 0:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `b`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
        default:
          accum *= ((k & 1) == 0) ? 1 : b;
          b *= b;
      }
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `base`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
      int r = Long.numberOfTrailingZeros(n - 1);
      long d = (n - 1) >> r;
      base %= n;
      if (base == 0) {
        return true;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    checkArgument(k <= n, "k (%s) > n (%s)", k, n);
    if (k > (n >> 1)) {
      k = n - k;
    }
    switch (k) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `n`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
        } else if (k < biggestSimpleBinomials.length && n <= biggestSimpleBinomials[k]) {
          // guaranteed not to overflow
          long result = n--;
          for (int i = 2; i <= k; n--, i++) {
            result *= n;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `n`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
          // guaranteed not to overflow
          long result = n--;
          for (int i = 2; i <= k; n--, i++) {
            result *= n;
            result /= i;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `n`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java

          long result = 1;
          long numerator = n--;
          long denominator = 1;

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `n`
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
           * denominator accumulators, multiplying the fraction into result when near overflow.
           */
          for (int i = 2; i <= k; i++, n--) {
            if (numeratorBits + nBits < Long.SIZE - 1) {
              // It's definitely safe to multiply into numerator and denominator.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `x`
in `guava/src/com/google/common/primitives/UnsignedLongs.java`
#### Snippet
```java
        do {
          buf[--i] = Character.forDigit(((int) x) & mask, radix);
          x >>>= shift;
        } while (x != 0);
      } else {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `x`
in `guava/src/com/google/common/primitives/UnsignedLongs.java`
#### Snippet
```java
        long rem = x - quotient * radix;
        buf[--i] = Character.forDigit((int) rem, radix);
        x = quotient;
        // Simple modulo/division approach
        while (x > 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `x`
in `guava/src/com/google/common/primitives/UnsignedLongs.java`
#### Snippet
```java
        while (x > 0) {
          buf[--i] = Character.forDigit((int) (x % radix), radix);
          x /= radix;
        }
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `chars`
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
    int decodeTo(byte[] target, CharSequence chars) throws DecodingException {
      checkNotNull(target);
      chars = trimTrailingPadding(chars);
      if (!alphabet.isValidPaddingStartPosition(chars.length())) {
        throw new DecodingException("Invalid input length " + chars.length());
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `chars`
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
    public boolean canDecode(CharSequence chars) {
      checkNotNull(chars);
      chars = trimTrailingPadding(chars);
      if (!alphabet.isValidPaddingStartPosition(chars.length())) {
        return false;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `chars`
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
    int decodeTo(byte[] target, CharSequence chars) throws DecodingException {
      checkNotNull(target);
      chars = trimTrailingPadding(chars);
      if (!alphabet.isValidPaddingStartPosition(chars.length())) {
        throw new DecodingException("Invalid input length " + chars.length());
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `chars`
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
  final byte[] decodeChecked(CharSequence chars)
      throws DecodingException {
    chars = trimTrailingPadding(chars);
    byte[] tmp = new byte[maxDecodedSize(chars.length())];
    int len = decodeTo(tmp, chars);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `len`
in `guava/src/com/google/common/io/ByteStreams.java`
#### Snippet
```java
      }

      len = (int) Math.min(len, left);
      int result = in.read(b, off, len);
      if (result != -1) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `totalLen`
in `guava/src/com/google/common/io/ByteStreams.java`
#### Snippet
```java
        }
        off += r;
        totalLen += r;
      }
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `n`
in `guava/src/com/google/common/io/ByteStreams.java`
#### Snippet
```java
    @Override
    public long skip(long n) throws IOException {
      n = Math.min(n, left);
      long skipped = in.skip(n);
      left -= skipped;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cp`
in `guava/src/com/google/common/net/PercentEscaper.java`
#### Snippet
```java
      dest[3] = '%';
      dest[5] = UPPER_HEX_DIGITS[cp & 0xF];
      cp >>>= 4;
      dest[4] = UPPER_HEX_DIGITS[0x8 | (cp & 0x3)];
      cp >>>= 2;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cp`
in `guava/src/com/google/common/net/PercentEscaper.java`
#### Snippet
```java
      cp >>>= 4;
      dest[4] = UPPER_HEX_DIGITS[0x8 | (cp & 0x3)];
      cp >>>= 2;
      dest[2] = UPPER_HEX_DIGITS[cp & 0xF];
      cp >>>= 4;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cp`
in `guava/src/com/google/common/net/PercentEscaper.java`
#### Snippet
```java
      cp >>>= 2;
      dest[2] = UPPER_HEX_DIGITS[cp & 0xF];
      cp >>>= 4;
      dest[1] = UPPER_HEX_DIGITS[0xC | cp];
      return dest;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cp`
in `guava/src/com/google/common/net/PercentEscaper.java`
#### Snippet
```java
      dest[6] = '%';
      dest[8] = UPPER_HEX_DIGITS[cp & 0xF];
      cp >>>= 4;
      dest[7] = UPPER_HEX_DIGITS[0x8 | (cp & 0x3)];
      cp >>>= 2;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cp`
in `guava/src/com/google/common/net/PercentEscaper.java`
#### Snippet
```java
      cp >>>= 4;
      dest[7] = UPPER_HEX_DIGITS[0x8 | (cp & 0x3)];
      cp >>>= 2;
      dest[5] = UPPER_HEX_DIGITS[cp & 0xF];
      cp >>>= 4;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cp`
in `guava/src/com/google/common/net/PercentEscaper.java`
#### Snippet
```java
      cp >>>= 2;
      dest[5] = UPPER_HEX_DIGITS[cp & 0xF];
      cp >>>= 4;
      dest[4] = UPPER_HEX_DIGITS[0x8 | (cp & 0x3)];
      cp >>>= 2;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cp`
in `guava/src/com/google/common/net/PercentEscaper.java`
#### Snippet
```java
      cp >>>= 4;
      dest[4] = UPPER_HEX_DIGITS[0x8 | (cp & 0x3)];
      cp >>>= 2;
      dest[2] = UPPER_HEX_DIGITS[cp];
      return dest;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cp`
in `guava/src/com/google/common/net/PercentEscaper.java`
#### Snippet
```java
      dest[9] = '%';
      dest[11] = UPPER_HEX_DIGITS[cp & 0xF];
      cp >>>= 4;
      dest[10] = UPPER_HEX_DIGITS[0x8 | (cp & 0x3)];
      cp >>>= 2;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cp`
in `guava/src/com/google/common/net/PercentEscaper.java`
#### Snippet
```java
      cp >>>= 4;
      dest[10] = UPPER_HEX_DIGITS[0x8 | (cp & 0x3)];
      cp >>>= 2;
      dest[8] = UPPER_HEX_DIGITS[cp & 0xF];
      cp >>>= 4;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cp`
in `guava/src/com/google/common/net/PercentEscaper.java`
#### Snippet
```java
      cp >>>= 2;
      dest[8] = UPPER_HEX_DIGITS[cp & 0xF];
      cp >>>= 4;
      dest[7] = UPPER_HEX_DIGITS[0x8 | (cp & 0x3)];
      cp >>>= 2;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cp`
in `guava/src/com/google/common/net/PercentEscaper.java`
#### Snippet
```java
      cp >>>= 4;
      dest[7] = UPPER_HEX_DIGITS[0x8 | (cp & 0x3)];
      cp >>>= 2;
      dest[5] = UPPER_HEX_DIGITS[cp & 0xF];
      cp >>>= 4;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cp`
in `guava/src/com/google/common/net/PercentEscaper.java`
#### Snippet
```java
      cp >>>= 2;
      dest[5] = UPPER_HEX_DIGITS[cp & 0xF];
      cp >>>= 4;
      dest[4] = UPPER_HEX_DIGITS[0x8 | (cp & 0x3)];
      cp >>>= 2;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cp`
in `guava/src/com/google/common/net/PercentEscaper.java`
#### Snippet
```java
      cp >>>= 4;
      dest[4] = UPPER_HEX_DIGITS[0x8 | (cp & 0x3)];
      cp >>>= 2;
      dest[2] = UPPER_HEX_DIGITS[cp & 0x7];
      return dest;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `safeChars`
in `guava/src/com/google/common/net/PercentEscaper.java`
#### Snippet
```java
          "Alphanumeric characters are always 'safe' and should not be explicitly specified");
    }
    safeChars += "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    // Avoid ambiguous parameters. Safe characters are never modified so if
    // space is a safe character then setting plusForSpace is meaningless.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `guava/src/com/google/common/net/PercentEscaper.java`
#### Snippet
```java
  protected int nextEscapeIndex(CharSequence csq, int index, int end) {
    checkNotNull(csq);
    for (; index < end; index++) {
      char c = csq.charAt(index);
      if (c >= safeOctets.length || !safeOctets[c]) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    // using variant of single-word Wang/Jenkins hash.
    // TODO(kevinb): use Hashing/move this to Hashing?
    h += (h << 15) ^ 0xffffcd7d;
    h ^= (h >>> 10);
    h += (h << 3);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    // TODO(kevinb): use Hashing/move this to Hashing?
    h += (h << 15) ^ 0xffffcd7d;
    h ^= (h >>> 10);
    h += (h << 3);
    h ^= (h >>> 6);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    h += (h << 15) ^ 0xffffcd7d;
    h ^= (h >>> 10);
    h += (h << 3);
    h ^= (h >>> 6);
    h += (h << 2) + (h << 14);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    h ^= (h >>> 10);
    h += (h << 3);
    h ^= (h >>> 6);
    h += (h << 2) + (h << 14);
    return h ^ (h >>> 16);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    h += (h << 3);
    h ^= (h >>> 6);
    h += (h << 2) + (h << 14);
    return h ^ (h >>> 16);
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `subWindow`
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
        return ImmutableSortedMap.of();
      } else {
        subWindow = subWindow.intersection(complementLowerBoundWindow);
        return new ComplementRangesByLowerBound<>(positiveRangesByLowerBound, subWindow);
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `template`
in `guava/src/com/google/common/base/Strings.java`
#### Snippet
```java
  public static String lenientFormat(
      @CheckForNull String template, @CheckForNull @Nullable Object... args) {
    template = String.valueOf(template); // null -> "null"

    if (args == null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `guava/src/com/google/common/base/Strings.java`
#### Snippet
```java

    if (args == null) {
      args = new Object[] {"(Object[])null"};
    } else {
      for (int i = 0; i < args.length; i++) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `reference`
in `guava/src/com/google/common/base/internal/Finalizer.java`
#### Snippet
```java
       * over and over again.
       */
    } while ((reference = queue.poll()) != null);
    return true;
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `seq`
in `guava/src/com/google/common/base/Ascii.java`
#### Snippet
```java
      }
      // if the length of the toString() result was > maxLength for some reason, truncate that
      seq = string;
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `nanos`
in `guava/src/com/google/common/util/concurrent/Monitor.java`
#### Snippet
```java
          firstTime = false;
        }
        nanos = guard.condition.awaitNanos(nanos);
      } while (!guard.isSatisfied());
      return true;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `to`
in `guava/src/com/google/common/math/Quantiles.java`
#### Snippet
```java
      int partitionPoint = partition(array, from, to);
      if (partitionPoint >= required) {
        to = partitionPoint - 1;
      }
      if (partitionPoint <= required) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `from`
in `guava/src/com/google/common/math/Quantiles.java`
#### Snippet
```java
      }
      if (partitionPoint <= required) {
        from = partitionPoint + 1;
      }
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `expectedInsertions`
in `guava/src/com/google/common/hash/BloomFilter.java`
#### Snippet
```java

    if (expectedInsertions == 0) {
      expectedInsertions = 1;
    }
    /*
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `p`
in `guava/src/com/google/common/hash/BloomFilter.java`
#### Snippet
```java
  static long optimalNumOfBits(long n, double p) {
    if (p == 0) {
      p = Double.MIN_VALUE;
    }
    return (long) (-n * Math.log(p) / (Math.log(2) * Math.log(2)));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `setSize`
in `guava/src/com/google/common/collect/ImmutableSet.java`
#### Snippet
```java
  // TODO(cpovirk): Move to Hashing or something, since it's used elsewhere in the Android version.
  static int chooseTableSize(int setSize) {
    setSize = Math.max(setSize, 2);
    // Correct the size for open addressing to match desired load factor.
    if (setSize < CUTOFF) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    // using variant of single-word Wang/Jenkins hash.
    // TODO(kevinb): use Hashing/move this to Hashing?
    h += (h << 15) ^ 0xffffcd7d;
    h ^= (h >>> 10);
    h += (h << 3);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    // TODO(kevinb): use Hashing/move this to Hashing?
    h += (h << 15) ^ 0xffffcd7d;
    h ^= (h >>> 10);
    h += (h << 3);
    h ^= (h >>> 6);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    h += (h << 15) ^ 0xffffcd7d;
    h ^= (h >>> 10);
    h += (h << 3);
    h ^= (h >>> 6);
    h += (h << 2) + (h << 14);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    h ^= (h >>> 10);
    h += (h << 3);
    h ^= (h >>> 6);
    h += (h << 2) + (h << 14);
    return h ^ (h >>> 16);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `h`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    h += (h << 3);
    h ^= (h >>> 6);
    h += (h << 2) + (h << 14);
    return h ^ (h >>> 16);
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `guava/src/com/google/common/reflect/AbstractInvocationHandler.java`
#### Snippet
```java
      throws Throwable {
    if (args == null) {
      args = NO_ARGS;
    }
    if (args.length == 0 && method.getName().equals("hashCode")) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java
    for (Multiset.Entry<E> entry : entrySet()) {
      Arrays.fill(dst, offset, offset + entry.getCount(), entry.getElement());
      offset += entry.getCount();
    }
    return offset;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `object`
in `guava/src/com/google/common/collect/ImmutableEnumMap.java`
#### Snippet
```java
    }
    if (object instanceof ImmutableEnumMap) {
      object = ((ImmutableEnumMap<?, ?>) object).delegate;
    }
    return delegate.equals(object);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `seedA`
in `guava/src/com/google/common/hash/FarmHashFingerprint64.java`
#### Snippet
```java
    long part4 = load64(bytes, offset + 24);

    seedA += part1;
    seedB = rotateRight(seedB + seedA + part4, 21);
    long c = seedA;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `seedB`
in `guava/src/com/google/common/hash/FarmHashFingerprint64.java`
#### Snippet
```java

    seedA += part1;
    seedB = rotateRight(seedB + seedA + part4, 21);
    long c = seedA;
    seedA += part2;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `seedA`
in `guava/src/com/google/common/hash/FarmHashFingerprint64.java`
#### Snippet
```java
    seedB = rotateRight(seedB + seedA + part4, 21);
    long c = seedA;
    seedA += part2;
    seedA += part3;
    seedB += rotateRight(seedA, 44);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `seedA`
in `guava/src/com/google/common/hash/FarmHashFingerprint64.java`
#### Snippet
```java
    long c = seedA;
    seedA += part2;
    seedA += part3;
    seedB += rotateRight(seedA, 44);
    output[0] = seedA + part4;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `seedB`
in `guava/src/com/google/common/hash/FarmHashFingerprint64.java`
#### Snippet
```java
    seedA += part2;
    seedA += part3;
    seedB += rotateRight(seedA, 44);
    output[0] = seedA + part4;
    output[1] = seedB + c;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `guava/src/com/google/common/hash/FarmHashFingerprint64.java`
#### Snippet
```java
      x = z;
      z = tmp;
      offset += 64;
    } while (offset != end);
    long mul = K1 + ((z & 0xFF) << 1);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `guava/src/com/google/common/hash/FarmHashFingerprint64.java`
#### Snippet
```java
    long mul = K1 + ((z & 0xFF) << 1);
    // Operate on the last 64 bytes of input.
    offset = last64offset;
    w[0] += ((length - 1) & 63);
    v[0] += w[0];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `other`
in `guava/src/com/google/common/collect/ImmutableCollection.java`
#### Snippet
```java
        return Platform.copy(internal, internalArrayStart(), internalArrayEnd(), other);
      }
      other = ObjectArrays.newArray(other, size);
    } else if (other.length > size) {
      other[size] = null;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `guava/src/com/google/common/collect/ImmutableCollection.java`
#### Snippet
```java
  int copyIntoArray(@Nullable Object[] dst, int offset) {
    for (E e : this) {
      dst[offset++] = e;
    }
    return offset;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `object`
in `guava/src/com/google/common/collect/ImmutableEnumSet.java`
#### Snippet
```java
    }
    if (object instanceof ImmutableEnumSet) {
      object = ((ImmutableEnumSet<?>) object).delegate;
    }
    return delegate.equals(object);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `collection`
in `guava/src/com/google/common/collect/ImmutableEnumSet.java`
#### Snippet
```java
  public boolean containsAll(Collection<?> collection) {
    if (collection instanceof ImmutableEnumSet<?>) {
      collection = ((ImmutableEnumSet<?>) collection).delegate;
    }
    return delegate.containsAll(collection);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `k`
in `guava/src/com/google/common/math/BigIntegerMath.java`
#### Snippet
```java
    checkArgument(k <= n, "k (%s) > n (%s)", k, n);
    if (k > (n >> 1)) {
      k = n - k;
    }
    if (k < LongMath.biggestBinomials.length && n <= LongMath.biggestBinomials[k]) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `x`
in `guava/src/com/google/common/math/DoubleMath.java`
#### Snippet
```java
  @GwtIncompatible
  public static BigInteger roundToBigInteger(double x, RoundingMode mode) {
    x = roundIntermediate(x, mode);
    if (MIN_LONG_AS_DOUBLE - x < 1.0 & x < MAX_LONG_AS_DOUBLE_PLUS_ONE) {
      return BigInteger.valueOf((long) x);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `elements`
in `guava/src/com/google/common/collect/ImmutableSortedMultiset.java`
#### Snippet
```java
      }
    }
    elements = Lists.newArrayList(elements); // defensive copy
    TreeMultiset<E> sortedCopy = TreeMultiset.create(checkNotNull(comparator));
    Iterables.addAll(sortedCopy, elements);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `guava/src/com/google/common/escape/UnicodeEscaper.java`
#### Snippet
```java
    checkNotNull(seq);
    if (index < end) {
      char c1 = seq.charAt(index++);
      if (c1 < Character.MIN_HIGH_SURROGATE || c1 > Character.MAX_LOW_SURROGATE) {
        // Fast path (first test is probably all we need to do)
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `guava/src/com/google/common/escape/UnicodeEscaper.java`
#### Snippet
```java
        unescapedChunkStart = nextIndex;
      }
      index = nextEscapeIndex(s, nextIndex, end);
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `list`
in `guava/src/com/google/common/collect/SortedLists.java`
#### Snippet
```java
    checkNotNull(absentBehavior);
    if (!(list instanceof RandomAccess)) {
      list = Lists.newArrayList(list);
    }
    // TODO(lowasser): benchmark when it's best to do a linear search
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `array`
in `guava/src/com/google/common/collect/ObjectArrays.java`
#### Snippet
```java
    int size = c.size();
    if (array.length < size) {
      array = newArray(array, size);
    }
    fillArray(c, array);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `dst`
in `guava/src/com/google/common/collect/ObjectArrays.java`
#### Snippet
```java
    checkPositionIndexes(offset, offset + len, src.length);
    if (dst.length < len) {
      dst = newArray(dst, len);
    } else if (dst.length > len) {
      @Nullable Object[] unsoundlyCovariantArray = dst;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `name`
in `guava/src/com/google/common/net/InternetDomainName.java`
#### Snippet
```java
    // * Strip trailing '.'

    name = Ascii.toLowerCase(DOTS_MATCHER.replaceFrom(name, '.'));

    if (name.endsWith(".")) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `name`
in `guava/src/com/google/common/net/InternetDomainName.java`
#### Snippet
```java

    if (name.endsWith(".")) {
      name = name.substring(0, name.length() - 1);
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `guava/src/com/google/common/collect/MinMaxPriorityQueue.java`
#### Snippet
```java
        if (skipMe != null) {
          while (c < size() && foundAndRemovedExactReference(skipMe, elementData(c))) {
            c++;
          }
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `guava/src/com/google/common/collect/MinMaxPriorityQueue.java`
#### Snippet
```java
        }
        queue[index] = e;
        index = grandParentIndex;
      }
      queue[index] = x;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `guava/src/com/google/common/collect/MinMaxPriorityQueue.java`
#### Snippet
```java
      while ((minGrandchildIndex = findMinGrandChild(index)) > 0) {
        queue[index] = elementData(minGrandchildIndex);
        index = minGrandchildIndex;
      }
      return index;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `guava/src/com/google/common/collect/MinMaxPriorityQueue.java`
#### Snippet
```java
        heap = this;
      } else {
        index = crossOver;
        heap = otherHeap;
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `hc`
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
    int h;
    if (hc == null) {
      threadHashCode.set(hc = new int[1]); // Initialize randomly
      int r = rng.nextInt(); // Avoid zero to allow xorShift rehash
      h = hc[0] = (r == 0) ? 1 : r;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `wasUncontended`
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
          collide = false;
        } else if (!wasUncontended) // CAS already known to fail
        wasUncontended = true; // Continue after rehash
        else if (a.cas(v = a.value, fn(v, x))) break;
        else if (n >= NCPU || cells != as) collide = false; // At max size or stale
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `throwable`
in `guava/src/com/google/common/base/Throwables.java`
#### Snippet
```java
    Throwable cause;
    while ((cause = throwable.getCause()) != null) {
      throwable = cause;
      causes.add(throwable);

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `throwable`
in `guava/src/com/google/common/base/Throwables.java`
#### Snippet
```java
    Throwable cause;
    while ((cause = throwable.getCause()) != null) {
      throwable = cause;

      if (throwable == slowPointer) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `collection`
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
    checkNotNull(collection); // for GWT
    if (collection instanceof Multiset) {
      collection = ((Multiset<?>) collection).elementSet();
    }
    /*
```

## RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
Synchronization on method parameter `future`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    @Override
    boolean casValue(AbstractFuture<?> future, @CheckForNull Object expect, Object update) {
      synchronized (future) {
        if (future.value == expect) {
          future.value = update;
```

### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
Synchronization on method parameter `future`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    boolean casWaiters(
        AbstractFuture<?> future, @CheckForNull Waiter expect, @CheckForNull Waiter update) {
      synchronized (future) {
        if (future.waiters == expect) {
          future.waiters = update;
```

### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
Synchronization on method parameter `future`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    @Override
    Listener gasListeners(AbstractFuture<?> future, Listener update) {
      synchronized (future) {
        Listener old = future.listeners;
        if (old != update) {
```

### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
Synchronization on method parameter `future`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    @Override
    boolean casListeners(AbstractFuture<?> future, @CheckForNull Listener expect, Listener update) {
      synchronized (future) {
        if (future.listeners == expect) {
          future.listeners = update;
```

### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
Synchronization on method parameter `future`
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    @Override
    Waiter gasWaiters(AbstractFuture<?> future, Waiter update) {
      synchronized (future) {
        Waiter old = future.waiters;
        if (old != update) {
```

### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
Synchronization on local variable `e`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
          // detected. This may be circumvented when an entry is copied, but will fail fast most
          // of the time.
          synchronized (e) {
            return loadSync(key, hash, loadingValueReference, loader);
          }
```

### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
Synchronization on method parameter `state`
in `guava/src/com/google/common/util/concurrent/AggregateFutureState.java`
#### Snippet
```java
    void compareAndSetSeenExceptions(
        AggregateFutureState<?> state, @CheckForNull Set<Throwable> expect, Set<Throwable> update) {
      synchronized (state) {
        if (state.seenExceptions == expect) {
          state.seenExceptions = update;
```

### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
Synchronization on method parameter `state`
in `guava/src/com/google/common/util/concurrent/AggregateFutureState.java`
#### Snippet
```java
    @Override
    int decrementAndGetRemainingCount(AggregateFutureState<?> state) {
      synchronized (state) {
        return --state.remaining;
      }
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
  E getEntry(@CheckForNull Object key) {
    if (key == null) {
      return null;
    }
    int hash = hash(key);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
                this.count = newCount; // write-volatile
              }
              return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        }

        return null;
      } finally {
        unlock();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
  V getLiveValue(E entry) {
    if (entry.getKey() == null) {
      return null;
    }
    return entry.getValue();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        E e = getLiveEntry(key, hash);
        if (e == null) {
          return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      }

      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
              newCount = this.count; // count remains unchanged
              this.count = newCount; // write-volatile
              return null;
            } else if (onlyIfAbsent) {
              // Mimic
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        table.set(index, newEntry);
        this.count = newCount; // write-volatile
        return null;
      } finally {
        unlock();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
              // TODO(kak): Remove this branch
            } else {
              return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        }

        return null;
      } finally {
        unlock();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      if (entry.getKey() == null) {
        tryDrainReferenceQueues();
        return null;
      }
      V value = entry.getValueReference().get();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      if (value == null) {
        tryDrainReferenceQueues();
        return null;
      }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      if (map.isExpired(entry, now)) {
        tryExpireEntries(now);
        return null;
      }
      return value;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        } else if (createNewEntry || valueReference.isLoading()) {
          removeLoadingValue(key, hash, computingValueReference);
          return null;
        } else {
          removeEntry(e, hash, RemovalCause.EXPLICIT);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        } else {
          removeEntry(e, hash, RemovalCause.EXPLICIT);
          return null;
        }
      } finally {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `guava/src/com/google/common/base/Optional.java`
#### Snippet
```java
  @CheckForNull
  public static <T> java.util.Optional<T> toJavaUtil(@CheckForNull Optional<T> googleOptional) {
    return googleOptional == null ? null : googleOptional.toJavaUtil();
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `guava/src/com/google/common/base/Optional.java`
#### Snippet
```java
  @CheckForNull
  public static <T> Optional<T> fromJavaUtil(@CheckForNull java.util.Optional<T> javaUtilOptional) {
    return (javaUtilOptional == null) ? null : fromNullable(javaUtilOptional.orElse(null));
  }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `timeoutNanos` is redundant
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    // NOTE: if timeout < 0, remainingNanos will be < 0 and we will fall into the while(true) loop
    // at the bottom and throw a timeoutexception.
    final long timeoutNanos = unit.toNanos(timeout); // we rely on the implicit null check on unit.
    long remainingNanos = timeoutNanos;
    if (Thread.interrupted()) {
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `nullable` is redundant
in `guava/src/com/google/common/util/concurrent/Futures.java`
#### Snippet
```java
  public static <V extends @Nullable Object> ListenableFuture<List<V>> allAsList(
      ListenableFuture<? extends V>... futures) {
    ListenableFuture<List<@Nullable V>> nullable =
        new ListFuture<V>(ImmutableList.copyOf(futures), true);
    // allAsList ensures that it fills the output list with V instances.
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `nullable` is redundant
in `guava/src/com/google/common/util/concurrent/Futures.java`
#### Snippet
```java
  public static <V extends @Nullable Object> ListenableFuture<List<V>> allAsList(
      Iterable<? extends ListenableFuture<? extends V>> futures) {
    ListenableFuture<List<@Nullable V>> nullable =
        new ListFuture<V>(ImmutableList.copyOf(futures), true);
    // allAsList ensures that it fills the output list with V instances.
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `w` is redundant
in `guava/src/com/google/common/base/Equivalence.java`
#### Snippet
```java
   */
  public final <S extends @Nullable T> Wrapper<S> wrap(@ParametricNullness S reference) {
    Wrapper<S> w = new Wrapper<>(this, reference);
    return w;
  }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `next` is redundant
in `guava/src/com/google/common/util/concurrent/AtomicDouble.java`
#### Snippet
```java
   */
  public final void set(double newValue) {
    long next = doubleToRawLongBits(newValue);
    value = next;
  }
```

## RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)`
in `guava/src/com/google/common/primitives/Doubles.java`
#### Snippet
```java
     * java.util.regex (where we want them in order to avoid catastrophic backtracking).
     */
    String decimal = "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)";
    String completeDec = decimal + "(?:[eE][+-]?\\d+#)?[fFdD]?";
    String hex = "(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)";
```

### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)`
in `guava/src/com/google/common/primitives/Doubles.java`
#### Snippet
```java
    String decimal = "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)";
    String completeDec = decimal + "(?:[eE][+-]?\\d+#)?[fFdD]?";
    String hex = "(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)";
    String completeHex = "0[xX]" + hex + "[pP][+-]?\\d+#[fFdD]?";
    String fpPattern = "[+-]?(?:NaN|Infinity|" + completeDec + "|" + completeHex + ")";
```

## RuleId[ruleID=UseCompareMethod]
### RuleId[ruleID=UseCompareMethod]
Expression can be replaced with 'Long.compare'
in `guava/src/com/google/common/primitives/Longs.java`
#### Snippet
```java
   */
  public static int compare(long a, long b) {
    return (a < b) ? -1 : ((a > b) ? 1 : 0);
  }

```

### RuleId[ruleID=UseCompareMethod]
Expression can be replaced with 'Integer.compare'
in `guava/src/com/google/common/primitives/Ints.java`
#### Snippet
```java
   */
  public static int compare(int a, int b) {
    return (a < b) ? -1 : ((a > b) ? 1 : 0);
  }

```

## RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/AbstractMultiset.java`
#### Snippet
```java
   */
  @Override
  public final boolean equals(@CheckForNull Object object) {
    return Multisets.equalsImpl(this, object);
  }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ForwardingTable.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object obj) {
    return (obj == this) || delegate().equals(obj);
  }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ForwardingMap.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object object) {
    return object == this || delegate().equals(object);
  }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ForwardingMapEntry.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object object) {
    return delegate().equals(object);
  }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object obj) {
      return Sets.equalsImpl(this, obj);
    }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object object) {
    return Multimaps.equalsImpl(this, object);
  }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ForwardingMultiset.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object object) {
    return object == this || delegate().equals(object);
  }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object object) {
      return this == object || this.map().keySet().equals(object);
    }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object object) {
      return this == object || submap.equals(object);
    }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object object) {
      if (object == this) {
        return true;
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/AbstractTable.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object obj) {
    return Tables.equalsImpl(this, obj);
  }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object o) {
      return Sets.equalsImpl(this, o);
    }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ForwardingSet.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object object) {
    return object == this || delegate().equals(object);
  }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ForwardingMultimap.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object object) {
    return object == this || delegate().equals(object);
  }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object object) {
    return Multisets.equalsImpl(this, object);
  }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ImmutableList.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object obj) {
    return Lists.equalsImpl(this, obj);
  }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ForwardingList.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object object) {
    return object == this || delegate().equals(object);
  }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object o) {
      if (o == this) {
        return true;
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object o) {
      if (o == this) {
        return true;
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object o) {
      if (o == this) {
        return true;
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object o) {
      if (o == this) {
        return true;
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object o) {
      if (o == this) {
        return true;
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object obj) {
      if (this == obj) {
        return true;
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object o) {
      if (o == this) {
        return true;
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java

        @Override
        public boolean equals(@CheckForNull Object object) {
          // TODO(lowasser): identify why this affects GWT tests
          return standardEquals(object);
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object object) {
    return Maps.equalsImpl(this, object);
  }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/FilteredKeySetMultimap.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object o) {
      return Sets.equalsImpl(this, o);
    }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object object) {
      return equalsImpl(this, object);
    }
```

### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object object) {
      return Sets.equalsImpl(this, object);
    }
```

## RuleId[ruleID=UseBulkOperation]
### RuleId[ruleID=UseBulkOperation]
Iteration can be replaced with bulk 'Map.putAll()' call
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
      Map<K, V> self, Map<? extends K, ? extends V> map) {
    for (Entry<? extends K, ? extends V> entry : map.entrySet()) {
      self.put(entry.getKey(), entry.getValue());
    }
  }
```

## RuleId[ruleID=CastCanBeRemovedNarrowingVariableType]
### RuleId[ruleID=CastCanBeRemovedNarrowingVariableType]
Cast may be removed by changing the type of 'rawType' to 'Class'
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java
    Class<?> rawType = getRawTypes().iterator().next();
    @SuppressWarnings("unchecked") // raw type is |T|
    Class<? super T> result = (Class<? super T>) rawType;
    return result;
  }
```

