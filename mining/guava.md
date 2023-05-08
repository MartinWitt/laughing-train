# guava 
 
# Bad smells
I found 1525 bad smells with 10 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 415 | false |
| RedundantTypeArguments | 200 | false |
| DataFlowIssue | 155 | false |
| SuspiciousMethodCalls | 100 | false |
| UnnecessaryUnicodeEscape | 68 | false |
| UNCHECKED_WARNING | 55 | false |
| DuplicatedCode | 54 | false |
| JavadocReference | 51 | false |
| DeprecatedIsStillUsed | 33 | false |
| PointlessArithmeticExpression | 31 | false |
| RedundantCast | 30 | false |
| EqualsWhichDoesntCheckParameterClass | 29 | false |
| UnusedAssignment | 25 | false |
| FinalMethodInFinalClass | 24 | false |
| ConstantValue | 22 | false |
| Deprecation | 16 | false |
| OptionalUsedAsFieldOrParameterType | 16 | false |
| SuspiciousNameCombination | 15 | false |
| TypeParameterExtendsObject | 12 | false |
| PointlessBitwiseExpression | 11 | false |
| JavadocLinkAsPlainText | 10 | false |
| EmptyStatementBody | 8 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 8 | false |
| StaticInitializerReferencesSubClass | 7 | false |
| AtomicFieldUpdaterNotStaticFinal | 7 | false |
| JavadocDeclaration | 7 | false |
| FieldMayBeFinal | 7 | false |
| CStyleArrayDeclaration | 6 | false |
| DuplicateExpressions | 6 | false |
| IgnoreResultOfCall | 6 | false |
| CharsetObjectCanBeUsed | 6 | false |
| CommentedOutCode | 5 | false |
| NotNullFieldNotInitialized | 5 | false |
| OptionalAssignedToNull | 5 | false |
| NullArgumentToVariableArgMethod | 5 | false |
| UnnecessaryToStringCall | 5 | true |
| TrivialIf | 5 | false |
| EqualsWithItself | 4 | false |
| ManualArrayCopy | 4 | false |
| CatchMayIgnoreException | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| FinalPrivateMethod | 3 | false |
| IfStatementWithIdenticalBranches | 3 | false |
| IOStreamConstructor | 3 | false |
| DanglingJavadoc | 3 | false |
| NegativeIntConstantInLongContext | 2 | false |
| FieldCanBeLocal | 2 | false |
| RedundantMethodOverride | 2 | false |
| PointlessNullCheck | 2 | false |
| UnnecessarySemicolon | 2 | false |
| ComparatorMethodParameterNotUsed | 2 | false |
| RegExpUnnecessaryNonCapturingGroup | 2 | false |
| SuspiciousSystemArraycopy | 1 | false |
| UnnecessaryReturn | 1 | true |
| ManualMinMaxCalculation | 1 | false |
| TrivialStringConcatenation | 1 | false |
| DefaultAnnotationParam | 1 | false |
| ThrowFromFinallyBlock | 1 | false |
| OptionalIsPresent | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| AutoCloseableResource | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| UseBulkOperation | 1 | false |
| CastCanBeRemovedNarrowingVariableType | 1 | false |
## RuleId[id=EqualsWithItself]
### EqualsWithItself
`compare()` called on itself
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
    if (hasLowerBound) {
      int unused =
          comparator.compare(
              uncheckedCastNullableTToT(lowerEndpoint), uncheckedCastNullableTToT(lowerEndpoint));
    }
```

### EqualsWithItself
`compare()` called on itself
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
    if (hasUpperBound) {
      int unused =
          comparator.compare(
              uncheckedCastNullableTToT(upperEndpoint), uncheckedCastNullableTToT(upperEndpoint));
    }
```

### EqualsWithItself
`compare()` called on itself
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
    AvlNode<E> root = rootReference.get();
    if (root == null) {
      int unused = comparator().compare(element, element);
      AvlNode<E> newRoot = new AvlNode<E>(element, occurrences);
      successor(header, newRoot, header);
```

### EqualsWithItself
`compare()` called on itself
in `guava/src/com/google/common/collect/TreeMultimap.java`
#### Snippet
```java
  Collection<V> createCollection(@ParametricNullness K key) {
    if (key == null) {
      int unused = keyComparator().compare(key, key);
    }
    return super.createCollection(key);
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
`1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8 \* 9 \* 10 \* 11 \* 12'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11,
    1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12
  };

```

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
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

### PointlessArithmeticExpression
`1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19 * 20` can be replaced with '2 \* 3 \* 4 \* 5 \* 6 \* 7 \* 8 \* 9 \* 10 \* 11 \* 12 \* 13 \* 14 \* 15 \* 16 \* 17 \* 18 \* 19 \* 20'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19,
    1L * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19 * 20
  };

```

## RuleId[id=SuspiciousSystemArraycopy]
### SuspiciousSystemArraycopy
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
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

### EmptyStatementBody
`else` statement has empty body
in `guava/src/com/google/common/collect/Interners.java`
#### Snippet
```java
        if (sneaky == null) {
          return sample;
        } else {
          /* Someone beat us to it! Trying again...
           *
```

### EmptyStatementBody
`while` statement has empty body
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    void clearKeyReferenceQueue() {
      while (keyReferenceQueue.poll() != null) {}
    }

```

### EmptyStatementBody
`while` statement has empty body
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    void clearValueReferenceQueue() {
      while (valueReferenceQueue.poll() != null) {}
    }

```

### EmptyStatementBody
`while` statement has empty body
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

    <T> void clearReferenceQueue(ReferenceQueue<T> referenceQueue) {
      while (referenceQueue.poll() != null) {}
    }

```

### EmptyStatementBody
`if` statement has empty body
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
            V entryValue = e.getValue();

            if (entryValue != null) {
              // TODO(kak): Remove this branch
            } else if (isCollected(e)) {
```

### EmptyStatementBody
`if` statement has empty body
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
            if (entryValue != null) {
              // TODO(kak): Remove this branch
            } else if (isCollected(e)) {
              // TODO(kak): Remove this branch
            } else {
```

### EmptyStatementBody
`if` statement has empty body
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
            if (map.valueEquivalence().equivalent(value, entryValue)) {
              explicitRemoval = true;
            } else if (isCollected(e)) {
              // TODO(kak): Remove this branch
            } else {
```

## RuleId[id=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass Base16Encoding from superclass BaseEncoding initializer might lead to class loading deadlock
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
  }

  private static final BaseEncoding BASE16 = new Base16Encoding("base16()", "0123456789ABCDEF");

  /**
```

### StaticInitializerReferencesSubClass
Referencing subclass Base64Encoding from superclass BaseEncoding initializer might lead to class loading deadlock
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java

  private static final BaseEncoding BASE64 =
      new Base64Encoding(
          "base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

```

### StaticInitializerReferencesSubClass
Referencing subclass StandardBaseEncoding from superclass BaseEncoding initializer might lead to class loading deadlock
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java

  private static final BaseEncoding BASE32 =
      new StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

  /**
```

### StaticInitializerReferencesSubClass
Referencing subclass Base64Encoding from superclass BaseEncoding initializer might lead to class loading deadlock
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java

  private static final BaseEncoding BASE64_URL =
      new Base64Encoding(
          "base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

```

### StaticInitializerReferencesSubClass
Referencing subclass StandardBaseEncoding from superclass BaseEncoding initializer might lead to class loading deadlock
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java

  private static final BaseEncoding BASE32_HEX =
      new StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

  /**
```

### StaticInitializerReferencesSubClass
Referencing subclass InactiveComparisonChain from superclass ComparisonChain initializer might lead to class loading deadlock
in `guava/src/com/google/common/collect/ComparisonChain.java`
#### Snippet
```java
      };

  private static final ComparisonChain LESS = new InactiveComparisonChain(-1);

  private static final ComparisonChain GREATER = new InactiveComparisonChain(1);
```

### StaticInitializerReferencesSubClass
Referencing subclass InactiveComparisonChain from superclass ComparisonChain initializer might lead to class loading deadlock
in `guava/src/com/google/common/collect/ComparisonChain.java`
#### Snippet
```java
  private static final ComparisonChain LESS = new InactiveComparisonChain(-1);

  private static final ComparisonChain GREATER = new InactiveComparisonChain(1);

  private static final class InactiveComparisonChain extends ComparisonChain {
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of parameter `b`
in `guava/src/com/google/common/io/ByteStreams.java`
#### Snippet
```java

    @Override
    public void readFully(byte b[]) {
      try {
        input.readFully(b);
```

### CStyleArrayDeclaration
C-style array declaration of parameter `b`
in `guava/src/com/google/common/io/ByteStreams.java`
#### Snippet
```java

    @Override
    public void readFully(byte b[], int off, int len) {
      try {
        input.readFully(b, off, len);
```

### CStyleArrayDeclaration
C-style array declaration of parameter `b`
in `guava/src/com/google/common/io/ByteArrayDataOutput.java`
#### Snippet
```java

  @Override
  void write(byte b[], int off, int len);

  @Override
```

### CStyleArrayDeclaration
C-style array declaration of parameter `b`
in `guava/src/com/google/common/io/ByteArrayDataOutput.java`
#### Snippet
```java

  @Override
  void write(byte b[]);

  @Override
```

### CStyleArrayDeclaration
C-style array declaration of parameter `b`
in `guava/src/com/google/common/io/ByteArrayDataInput.java`
#### Snippet
```java
public interface ByteArrayDataInput extends DataInput {
  @Override
  void readFully(byte b[]);

  @Override
```

### CStyleArrayDeclaration
C-style array declaration of parameter `b`
in `guava/src/com/google/common/io/ByteArrayDataInput.java`
#### Snippet
```java

  @Override
  void readFully(byte b[], int off, int len);

  // not guaranteed to skip n bytes so result should NOT be ignored
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (3 lines)
in `guava/src/com/google/common/graph/EndpointPair.java`
#### Snippet
```java

      // Equivalent to the following simple implementation:
      // boolean condition1 = nodeU().equals(other.nodeU()) && nodeV().equals(other.nodeV());
      // boolean condition2 = nodeU().equals(other.nodeV()) && nodeV().equals(other.nodeU());
      // return condition1 || condition2;
```

### CommentedOutCode
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

### CommentedOutCode
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

### CommentedOutCode
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

### CommentedOutCode
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

## RuleId[id=ManualArrayCopy]
### ManualArrayCopy
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

### ManualArrayCopy
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

### ManualArrayCopy
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

### ManualArrayCopy
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

## RuleId[id=NotNullFieldNotInitialized]
### NotNullFieldNotInitialized
@ElementTypesAreNonnullByDefault fields must be initialized
in `guava/src/com/google/common/collect/MinMaxPriorityQueue.java`
#### Snippet
```java
    @SuppressWarnings("nullness:initialization.field.uninitialized")
    @Weak
    Heap otherHeap; // always initialized immediately after construction

    Heap(Ordering<E> ordering) {
```

### NotNullFieldNotInitialized
@ElementTypesAreNonnullByDefault fields must be initialized
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java

  @SuppressWarnings("nullness:initialization.field.uninitialized") // For J2KT (lateinit)
  private transient Map<K, V> delegate;

  @SuppressWarnings("nullness:initialization.field.uninitialized") // For J2KT (lateinit)
```

### NotNullFieldNotInitialized
@ElementTypesAreNonnullByDefault fields must be initialized
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java
  @SuppressWarnings("nullness:initialization.field.uninitialized") // For J2KT (lateinit)
  @RetainedWith
  transient AbstractBiMap<V, K> inverse;

  /** Package-private constructor for creating a map-backed bimap. */
```

### NotNullFieldNotInitialized
@ElementTypesAreNonnullByDefault fields must be initialized
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
   */
  @SuppressWarnings("nullness:initialization.field.uninitialized") // For J2KT (see above)
  private transient @Nullable BiEntry<K, V>[] hashTableKToV;

  @SuppressWarnings("nullness:initialization.field.uninitialized") // For J2KT (see above)
```

### NotNullFieldNotInitialized
@ElementTypesAreNonnullByDefault fields must be initialized
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java

  @SuppressWarnings("nullness:initialization.field.uninitialized") // For J2KT (see above)
  private transient @Nullable BiEntry<K, V>[] hashTableVToK;

  @Weak @CheckForNull private transient BiEntry<K, V> firstInKeyInsertionOrder;
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/util/concurrent/AbstractExecutionThreadService.java`
#### Snippet
```java
      new AbstractService() {
        @Override
        protected final void doStart() {
          Executor executor = MoreExecutors.renamingDecorator(executor(), () -> serviceName());
          executor.execute(
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/util/concurrent/TrustedListenableFutureTask.java`
#### Snippet
```java

    @Override
    final boolean isDone() {
      return TrustedListenableFutureTask.this.isDone();
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/util/concurrent/TrustedListenableFutureTask.java`
#### Snippet
```java

    @Override
    final boolean isDone() {
      return TrustedListenableFutureTask.this.isDone();
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/util/concurrent/AbstractIdleService.java`
#### Snippet
```java
  private final class DelegateService extends AbstractService {
    @Override
    protected final void doStart() {
      MoreExecutors.renamingDecorator(executor(), threadNameSupplier)
          .execute(
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/util/concurrent/AbstractIdleService.java`
#### Snippet
```java

    @Override
    protected final void doStop() {
      MoreExecutors.renamingDecorator(executor(), threadNameSupplier)
          .execute(
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
     */
    @ParametricNullness
    public final <D extends @Nullable Object> D getDone(ClosingFuture<D> closingFuture)
        throws ExecutionException {
      checkState(beingCalled);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/cache/LongAdder.java`
#### Snippet
```java
  /** Version of plus for use in retryUpdate */
  @Override
  final long fn(long v, long x) {
    return v + x;
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java
    }

    final boolean cas(long cmp, long val) {
      return UNSAFE.compareAndSwapLong(this, valueOffset, cmp, val);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/hash/LongAdder.java`
#### Snippet
```java
  /** Version of plus for use in retryUpdate */
  @Override
  final long fn(long v, long x) {
    return v + x;
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/math/PairedStatsAccumulator.java`
#### Snippet
```java
   * @throws IllegalStateException if the dataset is empty or contains a single pair of values
   */
  public final double sampleCovariance() {
    checkState(count() > 1);
    return sumOfProductsOfDeltas / (count() - 1);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/math/PairedStatsAccumulator.java`
#### Snippet
```java
   *     either the {@code x} and {@code y} dataset has zero population variance
   */
  public final double pearsonsCorrelationCoefficient() {
    checkState(count() > 1);
    if (isNaN(sumOfProductsOfDeltas)) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/math/PairedStatsAccumulator.java`
#### Snippet
```java
   *     both the {@code x} and {@code y} dataset have zero population variance
   */
  public final LinearTransformation leastSquaresFit() {
    checkState(count() > 1);
    if (isNaN(sumOfProductsOfDeltas)) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/reflect/ClassPath.java`
#### Snippet
```java

    /** Returns the file this location is from. */
    public final File file() {
      return home;
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/collect/SingletonImmutableSet.java`
#### Snippet
```java

  @Override
  public final int hashCode() {
    return element.hashCode();
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java

    @Override
    protected final void doStart() {
      executorService =
          MoreExecutors.renamingDecorator(executor(), () -> serviceName() + " " + state());
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java

    @Override
    protected final void doStop() {
      // Both requireNonNull calls are safe because doStop can run only after a successful doStart.
      requireNonNull(runningTask);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/math/StatsAccumulator.java`
#### Snippet
```java
   * @throws IllegalStateException if the dataset is empty or contains a single value
   */
  public final double sampleStandardDeviation() {
    return Math.sqrt(sampleVariance());
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/math/StatsAccumulator.java`
#### Snippet
```java
   * @throws IllegalStateException if the dataset is empty
   */
  public final double populationVariance() {
    checkState(count != 0);
    if (isNaN(sumOfSquaresOfDeltas)) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/math/StatsAccumulator.java`
#### Snippet
```java
   * Double#NEGATIVE_INFINITY} only, the result is {@link Double#NEGATIVE_INFINITY}.
   */
  public final double sum() {
    return mean * count;
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/math/StatsAccumulator.java`
#### Snippet
```java
   * @throws IllegalStateException if the dataset is empty
   */
  public final double populationStandardDeviation() {
    return Math.sqrt(populationVariance());
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/math/StatsAccumulator.java`
#### Snippet
```java
   * @throws IllegalStateException if the dataset is empty or contains a single value
   */
  public final double sampleVariance() {
    checkState(count > 1);
    if (isNaN(sumOfSquaresOfDeltas)) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
    }

    final boolean cas(long cmp, long val) {
      return UNSAFE.compareAndSwapLong(this, valueOffset, cmp, val);
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
  @DoNotCall("Always throws UnsupportedOperationException")
  @CheckForNull
  public final Entry<K, V> pollLastEntry() {
    throw new UnsupportedOperationException();
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
  @DoNotCall("Always throws UnsupportedOperationException")
  @CheckForNull
  public final Entry<K, V> pollFirstEntry() {
    throw new UnsupportedOperationException();
  }
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `guava/src/com/google/common/graph/StandardValueGraph.java`
#### Snippet
```java

  @CheckForNull
  private final V edgeValueOrDefaultInternal(N nodeU, N nodeV, @CheckForNull V defaultValue) {
    GraphConnections<N, V> connectionsU = nodeConnections.get(nodeU);
    V value = (connectionsU == null) ? null : connectionsU.value(nodeV);
```

### FinalPrivateMethod
'private' method declared `final`
in `guava/src/com/google/common/graph/StandardValueGraph.java`
#### Snippet
```java
  }

  private final boolean hasEdgeConnectingInternal(N nodeU, N nodeV) {
    GraphConnections<N, V> connectionsU = nodeConnections.get(nodeU);
    return (connectionsU != null) && connectionsU.successors().contains(nodeV);
```

### FinalPrivateMethod
'private' method declared `final`
in `guava/src/com/google/common/graph/StandardValueGraph.java`
#### Snippet
```java
  }

  private final GraphConnections<N, V> checkedConnections(N node) {
    GraphConnections<N, V> connections = nodeConnections.get(node);
    if (connections == null) {
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
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

### DuplicateExpressions
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

### DuplicateExpressions
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

### DuplicateExpressions
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

### DuplicateExpressions
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

### DuplicateExpressions
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

## RuleId[id=Deprecation]
### Deprecation
Overrides deprecated method in 'com.google.common.collect.ImmutableMultimap'
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
  @Override
  @DoNotCall("Always throws UnsupportedOperationException")
  public final ImmutableSet<V> replaceValues(K key, Iterable<? extends V> values) {
    throw new UnsupportedOperationException();
  }
```

### Deprecation
Overrides deprecated method in 'com.google.common.collect.ImmutableMultimap'
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
  @Override
  @DoNotCall("Always throws UnsupportedOperationException")
  public final ImmutableSet<V> removeAll(@CheckForNull Object key) {
    throw new UnsupportedOperationException();
  }
```

### Deprecation
'remove()' is deprecated
in `guava/src/com/google/common/collect/AbstractSequentialIterator.java`
#### Snippet
```java
 * This class provides a skeletal implementation of the {@code Iterator} interface for sequences
 * whose next element can always be derived from the previous element. Null elements are not
 * supported, nor is the {@link #remove()} method.
 *
 * <p>Example:
```

### Deprecation
'builder()' is deprecated
in `guava/src/com/google/common/collect/ImmutableSortedMultiset.java`
#### Snippet
```java
   * Returns a builder that creates immutable sorted multisets whose elements are ordered by their
   * natural ordering. The sorted multisets use {@link Ordering#natural()} as the comparator. This
   * method provides more type-safety than {@link #builder}, as it can be called only for classes
   * that implement {@link Comparable}.
   *
```

### Deprecation
'com.google.common.collect.ForwardingBlockingDeque' is deprecated
in `guava/src/com/google/common/util/concurrent/ForwardingBlockingDeque.java`
#### Snippet
```java
 *
 * @author Emily Soldal
 * @since 21.0 (since 14.0 as {@link com.google.common.collect.ForwardingBlockingDeque})
 */
@J2ktIncompatible
```

### Deprecation
'builder()' is deprecated
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
   * Returns a builder that creates immutable sorted sets whose elements are ordered by their
   * natural ordering. The sorted sets use {@link Ordering#natural()} as the comparator. This method
   * provides more type-safety than {@link #builder}, as it can be called only for classes that
   * implement {@link Comparable}.
   */
```

### Deprecation
'sha1()' is deprecated
in `guava/src/com/google/common/hash/HashFunction.java`
#### Snippet
```java
 *       byte sequences under the covers.
 *   <li><b>hash code:</b> each hash function always yields hash codes of the same fixed bit length
 *       (given by {@link #bits}). For example, {@link Hashing#sha1} produces a 160-bit number,
 *       while {@link Hashing#murmur3_32()} yields only 32 bits. Because a {@code long} value is
 *       clearly insufficient to hold all hash code values, this API represents a hash code as an
```

### Deprecation
'murmur3_32()' is deprecated
in `guava/src/com/google/common/hash/HashFunction.java`
#### Snippet
```java
 *   <li><b>hash code:</b> each hash function always yields hash codes of the same fixed bit length
 *       (given by {@link #bits}). For example, {@link Hashing#sha1} produces a 160-bit number,
 *       while {@link Hashing#murmur3_32()} yields only 32 bits. Because a {@code long} value is
 *       clearly insufficient to hold all hash code values, this API represents a hash code as an
 *       instance of {@link HashCode}.
```

### Deprecation
'apply(K)' is deprecated
in `guava/src/com/google/common/cache/ForwardingLoadingCache.java`
#### Snippet
```java
  @Override
  public V apply(K key) {
    return delegate().apply(key);
  }

```

### Deprecation
'set(E)' is deprecated
in `guava/src/com/google/common/collect/AbstractIndexedListIterator.java`
#### Snippet
```java
 * This class provides a skeletal implementation of the {@link ListIterator} interface across a
 * fixed number of elements that may be retrieved by position. It does not support {@link #remove},
 * {@link #set}, or {@link #add}.
 *
 * @author Jared Levy
```

### Deprecation
'add(E)' is deprecated
in `guava/src/com/google/common/collect/AbstractIndexedListIterator.java`
#### Snippet
```java
 * This class provides a skeletal implementation of the {@link ListIterator} interface across a
 * fixed number of elements that may be retrieved by position. It does not support {@link #remove},
 * {@link #set}, or {@link #add}.
 *
 * @author Jared Levy
```

### Deprecation
'apply(K)' is deprecated
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @Override
    public V apply(K key) {
      return autoDelegate.apply(key);
    }

```

### Deprecation
Overrides deprecated method in 'com.google.common.collect.ImmutableMultimap'
in `guava/src/com/google/common/collect/ImmutableListMultimap.java`
#### Snippet
```java
  @Override
  @DoNotCall("Always throws UnsupportedOperationException")
  public final ImmutableList<V> removeAll(@CheckForNull Object key) {
    throw new UnsupportedOperationException();
  }
```

### Deprecation
Overrides deprecated method in 'com.google.common.collect.ImmutableMultimap'
in `guava/src/com/google/common/collect/ImmutableListMultimap.java`
#### Snippet
```java
  @Override
  @DoNotCall("Always throws UnsupportedOperationException")
  public final ImmutableList<V> replaceValues(K key, Iterable<? extends V> values) {
    throw new UnsupportedOperationException();
  }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `guava/src/com/google/common/util/concurrent/MoreExecutors.java`
#### Snippet
```java
      throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
    } catch (InvocationTargetException e) {
      throw Throwables.propagate(e.getCause());
    }
  }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `guava/src/com/google/common/eventbus/SubscriberRegistry.java`
#### Snippet
```java
      return flattenHierarchyCache.getUnchecked(concreteClass);
    } catch (UncheckedExecutionException e) {
      throw Throwables.propagate(e.getCause());
    }
  }
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
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

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
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

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `guava/src/com/google/common/hash/SipHashFunction.java`
#### Snippet
```java
  @Override
  public String toString() {
    return "Hashing.sipHash" + c + "" + d + "(" + k0 + ", " + k1 + ")";
  }

```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/graph/ImmutableGraph.java`
#### Snippet
```java
      // The incidentEdgeOrder for immutable graphs is always stable. However, we don't want to
      // modify this builder, so we make a copy instead.
      this.mutableGraph = graphBuilder.copy().incidentEdgeOrder(ElementOrder.<N>stable()).build();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/graph/StandardMutableValueGraph.java`
#### Snippet
```java
  private GraphConnections<N, V> newConnections() {
    return isDirected()
        ? DirectedGraphConnections.<N, V>of(incidentEdgeOrder)
        : UndirectedGraphConnections.<N, V>of(incidentEdgeOrder);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/graph/StandardMutableValueGraph.java`
#### Snippet
```java
    return isDirected()
        ? DirectedGraphConnections.<N, V>of(incidentEdgeOrder)
        : UndirectedGraphConnections.<N, V>of(incidentEdgeOrder);
  }
}
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
  private static <V> ImmutableSet<V> emptySet(@CheckForNull Comparator<? super V> valueComparator) {
    return (valueComparator == null)
        ? ImmutableSet.<V>of()
        : ImmutableSortedSet.<V>emptySet(valueComparator);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
    return (valueComparator == null)
        ? ImmutableSet.<V>of()
        : ImmutableSortedSet.<V>emptySet(valueComparator);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/reflect/Types.java`
#### Snippet
```java

  private static Iterable<Type> filterUpperBounds(Iterable<Type> bounds) {
    return Iterables.filter(bounds, Predicates.not(Predicates.<Type>equalTo(Object.class)));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/graph/StandardValueGraph.java`
#### Snippet
```java
    this(
        builder,
        builder.nodeOrder.<N, GraphConnections<N, V>>createMap(
            builder.expectedNodeCount.or(DEFAULT_NODE_COUNT)),
        0L);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/NaturalOrdering.java`
#### Snippet
```java
    Ordering<@Nullable Comparable<?>> result = nullsFirst;
    if (result == null) {
      result = nullsFirst = super.<Comparable<?>>nullsFirst();
    }
    return (Ordering<@Nullable S>) result;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/NaturalOrdering.java`
#### Snippet
```java
    Ordering<@Nullable Comparable<?>> result = nullsLast;
    if (result == null) {
      result = nullsLast = super.<Comparable<?>>nullsLast();
    }
    return (Ordering<@Nullable S>) result;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java

  private LinkedHashMultimap(int keyCapacity, int valueSetCapacity) {
    super(Platform.<K, Collection<V>>newLinkedHashMapWithExpectedSize(keyCapacity));
    checkNonnegative(valueSetCapacity, "expectedValuesPerKey");

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableClassToInstanceMap.java`
#### Snippet
```java
   */
  public static <B, T extends B> ImmutableClassToInstanceMap<B> of(Class<T> type, T value) {
    ImmutableMap<Class<? extends B>, B> map = ImmutableMap.<Class<? extends B>, B>of(type, value);
    return new ImmutableClassToInstanceMap<>(map);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableClassToInstanceMap.java`
#### Snippet
```java

  private static final ImmutableClassToInstanceMap<Object> EMPTY =
      new ImmutableClassToInstanceMap<>(ImmutableMap.<Class<?>, Object>of());

  /**
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
              return Maps.immutableEntry(negativeRange.lowerBound, negativeRange);
            }
          } else if (complementLowerBoundWindow.lowerBound.isLessThan(Cut.<C>belowAll())) {
            Range<C> negativeRange = Range.create(Cut.<C>belowAll(), nextComplementRangeUpperBound);
            nextComplementRangeUpperBound = Cut.belowAll();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
            }
          } else if (complementLowerBoundWindow.lowerBound.isLessThan(Cut.<C>belowAll())) {
            Range<C> negativeRange = Range.create(Cut.<C>belowAll(), nextComplementRangeUpperBound);
            nextComplementRangeUpperBound = Cut.belowAll();
            return Maps.immutableEntry(Cut.<C>belowAll(), negativeRange);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
            Range<C> negativeRange = Range.create(Cut.<C>belowAll(), nextComplementRangeUpperBound);
            nextComplementRangeUpperBound = Cut.belowAll();
            return Maps.immutableEntry(Cut.<C>belowAll(), negativeRange);
          }
          return endOfData();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
            nextComplementRangeLowerBound = positiveRange.upperBound;
          } else {
            negativeRange = Range.create(nextComplementRangeLowerBound, Cut.<C>aboveAll());
            nextComplementRangeLowerBound = Cut.aboveAll();
          }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java

    ComplementRangesByLowerBound(NavigableMap<Cut<C>, Range<C>> positiveRangesByLowerBound) {
      this(positiveRangesByLowerBound, Range.<Cut<C>>all());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
    @Override
    public Comparator<? super Cut<C>> comparator() {
      return Ordering.<Cut<C>>natural();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
    @Override
    public Comparator<? super Cut<C>> comparator() {
      return Ordering.<Cut<C>>natural();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
      super(
          new SubRangeSetRangesByLowerBound<C>(
              Range.<Cut<C>>all(), restriction, TreeRangeSet.this.rangesByLowerBound));
      this.restriction = restriction;
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
      PeekingIterator<Range<C>> positiveItr = Iterators.peekingIterator(positiveRanges.iterator());
      Cut<C> firstComplementRangeLowerBound;
      if (complementLowerBoundWindow.contains(Cut.<C>belowAll())
          && (!positiveItr.hasNext() || positiveItr.peek().lowerBound != Cut.<C>belowAll())) {
        firstComplementRangeLowerBound = Cut.belowAll();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
          complementLowerBoundWindow.hasUpperBound()
              ? complementLowerBoundWindow.upperEndpoint()
              : Cut.<C>aboveAll();
      boolean inclusive =
          complementLowerBoundWindow.hasUpperBound()
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
                ? positiveItr.next().lowerBound
                : positiveRangesByLowerBound.higherKey(positiveItr.peek().upperBound);
      } else if (!complementLowerBoundWindow.contains(Cut.<C>belowAll())
          || positiveRangesByLowerBound.containsKey(Cut.belowAll())) {
        return Iterators.emptyIterator();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
        return Iterators.emptyIterator();
      } else {
        cut = positiveRangesByLowerBound.higherKey(Cut.<C>belowAll());
      }
      Cut<C> firstComplementRangeUpperBound = MoreObjects.firstNonNull(cut, Cut.<C>aboveAll());
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
        cut = positiveRangesByLowerBound.higherKey(Cut.<C>belowAll());
      }
      Cut<C> firstComplementRangeUpperBound = MoreObjects.firstNonNull(cut, Cut.<C>aboveAll());
      return new AbstractIterator<Entry<Cut<C>, Range<C>>>() {
        Cut<C> nextComplementRangeUpperBound = firstComplementRangeUpperBound;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
    @Override
    public Comparator<? super Cut<C>> comparator() {
      return Ordering.<Cut<C>>natural();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/base/Predicates.java`
#### Snippet
```java
  public static <T extends @Nullable Object> Predicate<T> equalTo(@ParametricNullness T target) {
    return (target == null)
        ? Predicates.<T>isNull()
        : new IsEqualToPredicate(target).withNarrowedType();
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/base/Predicates.java`
#### Snippet
```java
  public static <T extends @Nullable Object> Predicate<T> or(
      Predicate<? super T> first, Predicate<? super T> second) {
    return new OrPredicate<>(Predicates.<T>asList(checkNotNull(first), checkNotNull(second)));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/base/Predicates.java`
#### Snippet
```java
  public static <T extends @Nullable Object> Predicate<T> and(
      Predicate<? super T> first, Predicate<? super T> second) {
    return new AndPredicate<>(Predicates.<T>asList(checkNotNull(first), checkNotNull(second)));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/base/Predicates.java`
#### Snippet
```java
      Predicate<? super T> first, Predicate<? super T> second) {
    // TODO(kevinb): understand why we still get a warning despite @SafeVarargs!
    return Arrays.<Predicate<? super T>>asList(first, second);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/net/InternetDomainName.java`
#### Snippet
```java
    checkArgument(validateSyntax(parts), "Not a valid domain name: '%s'", name);

    this.publicSuffixIndex = findSuffixOfType(Optional.<PublicSuffixType>absent());
    this.registrySuffixIndex = findSuffixOfType(Optional.of(PublicSuffixType.REGISTRY));
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/RegularImmutableBiMap.java`
#### Snippet
```java
  ImmutableSet<Entry<K, V>> createEntrySet() {
    return isEmpty()
        ? ImmutableSet.<Entry<K, V>>of()
        : new ImmutableMapEntrySet.RegularEntrySet<K, V>(this, entries);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/RegularImmutableAsList.java`
#### Snippet
```java

  RegularImmutableAsList(ImmutableCollection<E> delegate, Object[] array) {
    this(delegate, ImmutableList.<E>asImmutableList(array));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
    checkArgument(size <= index.size(), "size (%s) must be <= set.size() (%s)", size, index.size());
    if (size == 0) {
      return ImmutableSet.<Set<E>>of(ImmutableSet.<E>of());
    } else if (size == index.size()) {
      return ImmutableSet.<Set<E>>of(index.keySet());
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
    checkArgument(size <= index.size(), "size (%s) must be <= set.size() (%s)", size, index.size());
    if (size == 0) {
      return ImmutableSet.<Set<E>>of(ImmutableSet.<E>of());
    } else if (size == index.size()) {
      return ImmutableSet.<Set<E>>of(index.keySet());
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
      return ImmutableSet.<Set<E>>of(ImmutableSet.<E>of());
    } else if (size == index.size()) {
      return ImmutableSet.<Set<E>>of(index.keySet());
    }
    return new AbstractSet<Set<E>>() {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
      // collection.
      FilteredSet<E> filtered = (FilteredSet<E>) unfiltered;
      Predicate<E> combinedPredicate = Predicates.<E>and(filtered.predicate, predicate);
      return new FilteredSet<E>((Set<E>) filtered.unfiltered, combinedPredicate);
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
      // collection.
      FilteredSet<E> filtered = (FilteredSet<E>) unfiltered;
      Predicate<E> combinedPredicate = Predicates.<E>and(filtered.predicate, predicate);
      return new FilteredSortedSet<E>((SortedSet<E>) filtered.unfiltered, combinedPredicate);
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
      // collection.
      FilteredSet<E> filtered = (FilteredSet<E>) unfiltered;
      Predicate<E> combinedPredicate = Predicates.<E>and(filtered.predicate, predicate);
      return new FilteredNavigableSet<E>((NavigableSet<E>) filtered.unfiltered, combinedPredicate);
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
   */
  public static <E extends @Nullable Object> Set<E> newIdentityHashSet() {
    return Collections.newSetFromMap(Maps.<E, Boolean>newIdentityHashMap());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/EnumHashBiMap.java`
#### Snippet
```java
    super(
        new EnumMap<K, V>(keyType),
        Maps.<V, K>newHashMapWithExpectedSize(keyType.getEnumConstants().length));
    this.keyType = keyType;
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/reflect/ImmutableTypeToInstanceMap.java`
#### Snippet
```java
  /** Returns an empty type to instance map. */
  public static <B> ImmutableTypeToInstanceMap<B> of() {
    return new ImmutableTypeToInstanceMap<>(ImmutableMap.<TypeToken<? extends B>, B>of());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/util/concurrent/CycleDetectingLockFactory.java`
#### Snippet
```java
        @Override
        protected ArrayList<LockGraphNode> initialValue() {
          return Lists.<LockGraphNode>newArrayListWithCapacity(3);
        }
      };
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/net/MediaType.java`
#### Snippet
```java
   */
  public static MediaType create(String type, String subtype) {
    MediaType mediaType = create(type, subtype, ImmutableListMultimap.<String, String>of());
    mediaType.parsedCharset = Optional.absent();
    return mediaType;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/net/MediaType.java`
#### Snippet
```java
  private static MediaType createConstant(String type, String subtype) {
    MediaType mediaType =
        addKnownType(new MediaType(type, subtype, ImmutableListMultimap.<String, String>of()));
    mediaType.parsedCharset = Optional.absent();
    return mediaType;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/base/Platform.java`
#### Snippet
```java
  static <T extends Enum<T>> Optional<T> getEnumIfPresent(Class<T> enumClass, String value) {
    WeakReference<? extends Enum<?>> ref = Enums.getEnumConstants(enumClass).get(value);
    return ref == null ? Optional.<T>absent() : Optional.of(enumClass.cast(ref.get()));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/EmptyImmutableListMultimap.java`
#### Snippet
```java

  private EmptyImmutableListMultimap() {
    super(ImmutableMap.<Object, ImmutableList<Object>>of(), 0);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/graph/StandardNetwork.java`
#### Snippet
```java
    this(
        builder,
        builder.nodeOrder.<N, NetworkConnections<N, E>>createMap(
            builder.expectedNodeCount.or(DEFAULT_NODE_COUNT)),
        builder.edgeOrder.<E, N>createMap(builder.expectedEdgeCount.or(DEFAULT_EDGE_COUNT)));
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/graph/StandardNetwork.java`
#### Snippet
```java
        builder.nodeOrder.<N, NetworkConnections<N, E>>createMap(
            builder.expectedNodeCount.or(DEFAULT_NODE_COUNT)),
        builder.edgeOrder.<E, N>createMap(builder.expectedEdgeCount.or(DEFAULT_EDGE_COUNT)));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Ordering.java`
#### Snippet
```java

  <T2 extends T> Ordering<Entry<T2, ?>> onKeys() {
    return onResultOf(Maps.<T2>keyFunction());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableList.java`
#### Snippet
```java
      @SuppressWarnings("unchecked") // all supported methods are covariant
      ImmutableList<E> list = ((ImmutableCollection<E>) elements).asList();
      return list.isPartialView() ? ImmutableList.<E>asImmutableList(list.toArray()) : list;
    }
    return construct(elements.toArray());
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableSortedMultiset.java`
#### Snippet
```java
     */
    public Builder(Comparator<? super E> comparator) {
      super(TreeMultiset.<E>create(checkNotNull(comparator)));
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableSortedMultiset.java`
#### Snippet
```java
    // Unsafe, see ImmutableSortedMultisetFauxverideShim.
    @SuppressWarnings("unchecked")
    Ordering<E> naturalOrder = (Ordering<E>) Ordering.<Comparable>natural();
    return copyOf(naturalOrder, elements);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableSortedMultiset.java`
#### Snippet
```java
    // Unsafe, see ImmutableSortedMultisetFauxverideShim.
    @SuppressWarnings("unchecked")
    Ordering<E> naturalOrder = (Ordering<E>) Ordering.<Comparable>natural();
    return copyOf(naturalOrder, elements);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java
     */
    public Builder() {
      this(LinkedHashMultiset.<E>create());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java

  private ImmutableSet<Entry<E>> createEntrySet() {
    return isEmpty() ? ImmutableSet.<Entry<E>>of() : new EntrySet();
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/graph/ImmutableValueGraph.java`
#### Snippet
```java
      // modify this builder, so we make a copy instead.
      this.mutableValueGraph =
          graphBuilder.copy().incidentEdgeOrder(ElementOrder.<N>stable()).build();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Collections2.java`
#### Snippet
```java

    FilteredCollection<E> createCombined(Predicate<? super E> newPredicate) {
      return new FilteredCollection<E>(unfiltered, Predicates.<E>and(predicate, newPredicate));
      // .<E> above needed to compile in JDK 5
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableRangeMap.java`
#### Snippet
```java
        SortedLists.binarySearch(
            ranges,
            Range.<K>upperBoundFn(),
            range.lowerBound,
            KeyPresentBehavior.FIRST_AFTER,
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableRangeMap.java`
#### Snippet
```java
        SortedLists.binarySearch(
            ranges,
            Range.<K>lowerBoundFn(),
            range.upperBound,
            KeyPresentBehavior.ANY_PRESENT,
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableRangeMap.java`
#### Snippet
```java
        SortedLists.binarySearch(
            ranges,
            Range.<K>lowerBoundFn(),
            Cut.belowValue(key),
            KeyPresentBehavior.ANY_PRESENT,
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableRangeMap.java`
#### Snippet
```java

  private static final ImmutableRangeMap<Comparable<?>, Object> EMPTY =
      new ImmutableRangeMap<>(ImmutableList.<Range<Comparable<?>>>of(), ImmutableList.of());

  /**
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableRangeMap.java`
#### Snippet
```java
    }
    RegularImmutableSortedSet<Range<K>> rangeSet =
        new RegularImmutableSortedSet<>(ranges, Range.<K>rangeLexOrdering());
    return new ImmutableSortedMap<>(rangeSet, values);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableRangeMap.java`
#### Snippet
```java
        SortedLists.binarySearch(
            ranges,
            Range.<K>lowerBoundFn(),
            Cut.belowValue(key),
            KeyPresentBehavior.ANY_PRESENT,
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
  @Override
  Spliterator<Cell<R, C, @Nullable V>> cellSpliterator() {
    return CollectSpliterators.<Cell<R, C, @Nullable V>>indexed(
        size(), Spliterator.ORDERED | Spliterator.NONNULL | Spliterator.DISTINCT, this::getCell);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/graph/StandardMutableNetwork.java`
#### Snippet
```java
    return isDirected()
        ? allowsParallelEdges()
            ? DirectedMultiNetworkConnections.<N, E>of()
            : DirectedNetworkConnections.<N, E>of()
        : allowsParallelEdges()
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/graph/StandardMutableNetwork.java`
#### Snippet
```java
        ? allowsParallelEdges()
            ? DirectedMultiNetworkConnections.<N, E>of()
            : DirectedNetworkConnections.<N, E>of()
        : allowsParallelEdges()
            ? UndirectedMultiNetworkConnections.<N, E>of()
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/graph/StandardMutableNetwork.java`
#### Snippet
```java
            : DirectedNetworkConnections.<N, E>of()
        : allowsParallelEdges()
            ? UndirectedMultiNetworkConnections.<N, E>of()
            : UndirectedNetworkConnections.<N, E>of();
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/graph/StandardMutableNetwork.java`
#### Snippet
```java
        : allowsParallelEdges()
            ? UndirectedMultiNetworkConnections.<N, E>of()
            : UndirectedNetworkConnections.<N, E>of();
  }
}
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/EmptyImmutableSetMultimap.java`
#### Snippet
```java

  private EmptyImmutableSetMultimap() {
    super(ImmutableMap.<Object, ImmutableSet<Object>>of(), 0, null);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/DescendingMultiset.java`
#### Snippet
```java
    Comparator<? super E> result = comparator;
    if (result == null) {
      return comparator = Ordering.from(forwardMultiset().comparator()).<E>reverse();
    }
    return result;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/DenseImmutableTable.java`
#### Snippet
```java
    // Casts without copying.
    ImmutableMap<R, ImmutableMap<C, V>> rowMap = this.rowMap;
    return ImmutableMap.<R, Map<C, V>>copyOf(rowMap);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/DenseImmutableTable.java`
#### Snippet
```java
    // Casts without copying.
    ImmutableMap<C, ImmutableMap<R, V>> columnMap = this.columnMap;
    return ImmutableMap.<C, Map<R, V>>copyOf(columnMap);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
          SortedLists.binarySearch(
              ranges,
              Range.<C>upperBoundFn(),
              range.lowerBound,
              KeyPresentBehavior.FIRST_AFTER,
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
          SortedLists.binarySearch(
              ranges,
              Range.<C>lowerBoundFn(),
              range.upperBound,
              KeyPresentBehavior.FIRST_PRESENT,
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
        SortedLists.binarySearch(
            ranges,
            Range.<C>lowerBoundFn(),
            Cut.belowValue(value),
            Ordering.natural(),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java

  private static final ImmutableRangeSet<Comparable<?>> ALL =
      new ImmutableRangeSet<>(ImmutableList.of(Range.<Comparable<?>>all()));

  /**
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
      return ImmutableSet.of();
    }
    return new RegularImmutableSortedSet<>(ranges, Range.<C>rangeLexOrdering());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
        SortedLists.binarySearch(
            ranges,
            Range.<C>lowerBoundFn(),
            otherRange.lowerBound,
            Ordering.natural(),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
    if (rangeSet.isEmpty()) {
      return of();
    } else if (rangeSet.encloses(Range.<C>all())) {
      return all();
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java

  private static final ImmutableRangeSet<Comparable<?>> EMPTY =
      new ImmutableRangeSet<>(ImmutableList.<Range<Comparable<?>>>of());

  private static final ImmutableRangeSet<Comparable<?>> ALL =
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
        SortedLists.binarySearch(
            ranges,
            Range.<C>lowerBoundFn(),
            otherRange.lowerBound,
            Ordering.natural(),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
      ImmutableList.Builder<Range<C>> mergedRangesBuilder =
          new ImmutableList.Builder<>(ranges.size());
      Collections.sort(ranges, Range.<C>rangeLexOrdering());
      PeekingIterator<Range<C>> peekingItr = Iterators.peekingIterator(ranges.iterator());
      while (peekingItr.hasNext()) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
      Cut<C> lowerBound;
      if (positiveBoundedBelow) {
        lowerBound = (index == 0) ? Cut.<C>belowAll() : ranges.get(index - 1).upperBound;
      } else {
        lowerBound = ranges.get(index).upperBound;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
      Cut<C> upperBound;
      if (positiveBoundedAbove && index == size - 1) {
        upperBound = Cut.<C>aboveAll();
      } else {
        upperBound = ranges.get(index + (positiveBoundedBelow ? 0 : 1)).lowerBound;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/HashMultimap.java`
#### Snippet
```java
  @Override
  Set<V> createCollection() {
    return Platform.<V>newHashSetWithExpectedSize(expectedValuesPerKey);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/HashMultimap.java`
#### Snippet
```java

  private HashMultimap(int expectedKeys, int expectedValuesPerKey) {
    super(Platform.<K, Collection<V>>newHashMapWithExpectedSize(expectedKeys));
    Preconditions.checkArgument(expectedValuesPerKey >= 0);
    this.expectedValuesPerKey = expectedValuesPerKey;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/HashMultimap.java`
#### Snippet
```java

  private HashMultimap(Multimap<? extends K, ? extends V> multimap) {
    super(Platform.<K, Collection<V>>newHashMapWithExpectedSize(multimap.keySet().size()));
    putAll(multimap);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
      SortedMap<K, V> filterValues(
          SortedMap<K, V> unfiltered, final Predicate<? super V> valuePredicate) {
    return filterEntries(unfiltered, Maps.<V>valuePredicateOnEntries(valuePredicate));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    Iterator<Entry<K, V2>> entryIterator() {
      return Iterators.transform(
          fromMap.entrySet().iterator(), Maps.<K, V1, V2>asEntryToEntryFunction(transformer));
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
      AbstractFilteredMap<K, V> map, Predicate<? super Entry<K, V>> entryPredicate) {
    return new FilteredEntryMap<>(
        map.unfiltered, Predicates.<Entry<K, V>>and(map.predicate, entryPredicate));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
          FilteredEntryNavigableMap<K, V> map, Predicate<? super Entry<K, V>> entryPredicate) {
    Predicate<Entry<K, V>> predicate =
        Predicates.<Entry<K, V>>and(map.entryPredicate, entryPredicate);
    return new FilteredEntryNavigableMap<>(map.unfiltered, predicate);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    Spliterator<Entry<K, V2>> entrySpliterator() {
      return CollectSpliterators.map(
          fromMap.entrySet().spliterator(), Maps.<K, V1, V2>asEntryToEntryFunction(transformer));
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
      BiMap<K, V> filterFiltered(
          FilteredEntryBiMap<K, V> map, Predicate<? super Entry<K, V>> entryPredicate) {
    Predicate<Entry<K, V>> predicate = Predicates.<Entry<K, V>>and(map.predicate, entryPredicate);
    return new FilteredEntryBiMap<>(map.unfiltered(), predicate);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    // TODO(lowasser): Return a subclass of Maps.FilteredKeyMap for slightly better
    // performance.
    return filterEntries(unfiltered, Maps.<K>keyPredicateOnEntries(keyPredicate));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
      BiMap<K, V> unfiltered, final Predicate<? super K> keyPredicate) {
    checkNotNull(keyPredicate);
    return filterEntries(unfiltered, Maps.<K>keyPredicateOnEntries(keyPredicate));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
  public static <K extends @Nullable Object, V extends @Nullable Object> BiMap<K, V> filterValues(
      BiMap<K, V> unfiltered, final Predicate<? super V> valuePredicate) {
    return filterEntries(unfiltered, Maps.<V>valuePredicateOnEntries(valuePredicate));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    // TODO(lowasser): Return a subclass of Maps.FilteredKeyMap for slightly better
    // performance.
    return filterEntries(unfiltered, Maps.<K>keyPredicateOnEntries(keyPredicate));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
  public static <K extends @Nullable Object, V extends @Nullable Object> Map<K, V> filterValues(
      Map<K, V> unfiltered, final Predicate<? super V> valuePredicate) {
    return filterEntries(unfiltered, Maps.<V>valuePredicateOnEntries(valuePredicate));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
      SortedMap<K, V> filterFiltered(
          FilteredEntrySortedMap<K, V> map, Predicate<? super Entry<K, V>> entryPredicate) {
    Predicate<Entry<K, V>> predicate = Predicates.<Entry<K, V>>and(map.predicate, entryPredicate);
    return new FilteredEntrySortedMap<>(map.sortedMap(), predicate);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
      NavigableMap<K, V> filterValues(
          NavigableMap<K, V> unfiltered, final Predicate<? super V> valuePredicate) {
    return filterEntries(unfiltered, Maps.<V>valuePredicateOnEntries(valuePredicate));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
  static <V extends @Nullable Object> Predicate<Entry<?, V>> valuePredicateOnEntries(
      Predicate<? super V> valuePredicate) {
    return compose(valuePredicate, Maps.<V>valueFunction());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
  static <K extends @Nullable Object> Predicate<Entry<K, ?>> keyPredicateOnEntries(
      Predicate<? super K> keyPredicate) {
    return compose(keyPredicate, Maps.<K>keyFunction());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
    Arrays.fill(contents, uniques, n, null);
    return new RegularImmutableSortedSet<E>(
        ImmutableList.<E>asImmutableList(contents, uniques), comparator);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
    // Unsafe, see ImmutableSortedSetFauxverideShim.
    @SuppressWarnings("unchecked")
    Ordering<E> naturalOrder = (Ordering<E>) Ordering.<Comparable>natural();
    return copyOf(naturalOrder, elements);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
    // Unsafe, see ImmutableSortedSetFauxverideShim.
    @SuppressWarnings("unchecked")
    Ordering<E> naturalOrder = (Ordering<E>) Ordering.<Comparable>natural();
    return copyOf(naturalOrder, elements);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
    // Unsafe, see ImmutableSortedSetFauxverideShim.
    @SuppressWarnings("unchecked")
    Ordering<E> naturalOrder = (Ordering<E>) Ordering.<Comparable>natural();
    return copyOf(naturalOrder, elements);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
      return (RegularImmutableSortedSet<E>) RegularImmutableSortedSet.NATURAL_EMPTY_SET;
    } else {
      return new RegularImmutableSortedSet<E>(ImmutableList.<E>of(), comparator);
    }
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/SingletonImmutableList.java`
#### Snippet
```java
  public ImmutableList<E> subList(int fromIndex, int toIndex) {
    Preconditions.checkPositionIndexes(fromIndex, toIndex, 1);
    return (fromIndex == toIndex) ? ImmutableList.<E>of() : this;
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java
        case CLOSED:
          C next = domain.next(endpoint);
          return (next == null) ? Cut.<C>belowAll() : belowValue(next);
        default:
          throw new AssertionError();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java
    Cut<Comparable<?>> canonical(DiscreteDomain<Comparable<?>> domain) {
      try {
        return Cut.<Comparable<?>>belowValue(domain.minValue());
      } catch (NoSuchElementException e) {
        return this;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java
    Cut<C> canonical(DiscreteDomain<C> domain) {
      C next = leastValueAbove(domain);
      return (next != null) ? belowValue(next) : Cut.<C>aboveAll();
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java
        case OPEN:
          C next = domain.next(endpoint);
          return (next == null) ? Cut.<C>aboveAll() : belowValue(next);
        case CLOSED:
          return this;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java
        case OPEN:
          C previous = domain.previous(endpoint);
          return (previous == null) ? Cut.<C>belowAll() : new AboveValue<C>(previous);
        default:
          throw new AssertionError();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java
        case CLOSED:
          C previous = domain.previous(endpoint);
          return (previous == null) ? Cut.<C>aboveAll() : new AboveValue<C>(previous);
        case OPEN:
          return this;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ArrayListMultimap.java`
#### Snippet
```java

  private ArrayListMultimap(int expectedKeys, int expectedValuesPerKey) {
    super(Platform.<K, Collection<V>>newHashMapWithExpectedSize(expectedKeys));
    checkNonnegative(expectedValuesPerKey, "expectedValuesPerKey");
    this.expectedValuesPerKey = expectedValuesPerKey;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Range.java`
#### Snippet
```java
   */
  public static <C extends Comparable<?>> Range<C> lessThan(C endpoint) {
    return create(Cut.<C>belowAll(), Cut.belowValue(endpoint));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Range.java`
#### Snippet
```java
   */
  public static <C extends Comparable<?>> Range<C> greaterThan(C endpoint) {
    return create(Cut.aboveValue(endpoint), Cut.<C>aboveAll());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Range.java`
#### Snippet
```java
   */
  public static <C extends Comparable<?>> Range<C> atMost(C endpoint) {
    return create(Cut.<C>belowAll(), Cut.aboveValue(endpoint));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Range.java`
#### Snippet
```java
   */
  public static <C extends Comparable<?>> Range<C> atLeast(C endpoint) {
    return create(Cut.belowValue(endpoint), Cut.<C>aboveAll());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableMapEntrySet.java`
#### Snippet
```java

    RegularEntrySet(ImmutableMap<K, V> map, Entry<K, V>[] entries) {
      this(map, ImmutableList.<Entry<K, V>>asImmutableList(entries));
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/LinkedHashMultiset.java`
#### Snippet
```java

  private LinkedHashMultiset(int distinctElements) {
    super(Maps.<E, Count>newLinkedHashMapWithExpectedSize(distinctElements));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/SparseImmutableTable.java`
#### Snippet
```java
  static final ImmutableTable<Object, Object, Object> EMPTY =
      new SparseImmutableTable<>(
          ImmutableList.<Cell<Object, Object, Object>>of(), ImmutableSet.of(), ImmutableSet.of());

  private final ImmutableMap<R, ImmutableMap<C, V>> rowMap;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/SparseImmutableTable.java`
#### Snippet
```java
    // Casts without copying.
    ImmutableMap<R, ImmutableMap<C, V>> rowMap = this.rowMap;
    return ImmutableMap.<R, Map<C, V>>copyOf(rowMap);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/SparseImmutableTable.java`
#### Snippet
```java
    // Casts without copying.
    ImmutableMap<C, ImmutableMap<R, V>> columnMap = this.columnMap;
    return ImmutableMap.<C, Map<R, V>>copyOf(columnMap);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
      Multimap<K, V> filterValues(
          Multimap<K, V> unfiltered, final Predicate<? super V> valuePredicate) {
    return filterEntries(unfiltered, Maps.<V>valuePredicateOnEntries(valuePredicate));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
      FilteredKeyListMultimap<K, V> prev = (FilteredKeyListMultimap<K, V>) unfiltered;
      return new FilteredKeyListMultimap<>(
          prev.unfiltered(), Predicates.<K>and(prev.keyPredicate, keyPredicate));
    } else {
      return new FilteredKeyListMultimap<>(unfiltered, keyPredicate);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    Iterator<Entry<K, V2>> entryIterator() {
      return Iterators.transform(
          fromMultimap.entries().iterator(), Maps.<K, V1, V2>asEntryToEntryFunction(transformer));
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
      SetMultimap<K, V> filterValues(
          SetMultimap<K, V> unfiltered, final Predicate<? super V> valuePredicate) {
    return filterEntries(unfiltered, Maps.<V>valuePredicateOnEntries(valuePredicate));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
          FilteredSetMultimap<K, V> multimap, Predicate<? super Entry<K, V>> entryPredicate) {
    Predicate<Entry<K, V>> predicate =
        Predicates.<Entry<K, V>>and(multimap.entryPredicate(), entryPredicate);
    return new FilteredEntrySetMultimap<>(multimap.unfiltered(), predicate);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    Collection<V2> createValues() {
      return Collections2.transform(
          fromMultimap.entries(), Maps.<K, V1, V2>asEntryToValueFunction(transformer));
    }
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
          FilteredMultimap<K, V> multimap, Predicate<? super Entry<K, V>> entryPredicate) {
    Predicate<Entry<K, V>> predicate =
        Predicates.<Entry<K, V>>and(multimap.entryPredicate(), entryPredicate);
    return new FilteredEntryMultimap<>(multimap.unfiltered(), predicate);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
      FilteredKeyMultimap<K, V> prev = (FilteredKeyMultimap<K, V>) unfiltered;
      return new FilteredKeyMultimap<>(
          prev.unfiltered, Predicates.<K>and(prev.keyPredicate, keyPredicate));
    } else if (unfiltered instanceof FilteredMultimap) {
      FilteredMultimap<K, V> prev = (FilteredMultimap<K, V>) unfiltered;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    } else if (unfiltered instanceof FilteredMultimap) {
      FilteredMultimap<K, V> prev = (FilteredMultimap<K, V>) unfiltered;
      return filterFiltered(prev, Maps.<K>keyPredicateOnEntries(keyPredicate));
    } else {
      return new FilteredKeyMultimap<>(unfiltered, keyPredicate);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
      FilteredKeySetMultimap<K, V> prev = (FilteredKeySetMultimap<K, V>) unfiltered;
      return new FilteredKeySetMultimap<>(
          prev.unfiltered(), Predicates.<K>and(prev.keyPredicate, keyPredicate));
    } else if (unfiltered instanceof FilteredSetMultimap) {
      FilteredSetMultimap<K, V> prev = (FilteredSetMultimap<K, V>) unfiltered;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    } else if (unfiltered instanceof FilteredSetMultimap) {
      FilteredSetMultimap<K, V> prev = (FilteredSetMultimap<K, V>) unfiltered;
      return filterFiltered(prev, Maps.<K>keyPredicateOnEntries(keyPredicate));
    } else {
      return new FilteredKeySetMultimap<>(unfiltered, keyPredicate);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/TreeRangeMap.java`
#### Snippet
```java
          @Override
          public boolean removeAll(Collection<?> c) {
            return removeEntryIf(compose(in(c), Maps.<V>valueFunction()));
          }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/TreeRangeMap.java`
#### Snippet
```java
          @Override
          public boolean retainAll(Collection<?> c) {
            return removeEntryIf(compose(not(in(c)), Maps.<Range<K>>keyFunction()));
          }
        };
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/TreeRangeMap.java`
#### Snippet
```java
          @Override
          public boolean retainAll(Collection<?> c) {
            return removeEntryIf(compose(not(in(c)), Maps.<V>valueFunction()));
          }
        };
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/RegularImmutableSortedSet.java`
#### Snippet
```java
final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {
  static final RegularImmutableSortedSet<Comparable> NATURAL_EMPTY_SET =
      new RegularImmutableSortedSet<>(ImmutableList.<Comparable>of(), Ordering.natural());

  private final transient ImmutableList<E> elements;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
    @Override
    public Iterator<E> iterator() {
      return Iterators.<E>unmodifiableIterator(delegate.iterator());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java

    Set<E> createElementSet() {
      return Collections.<E>unmodifiableSet(delegate.elementSet());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
      // collection.
      FilteredMultiset<E> filtered = (FilteredMultiset<E>) unfiltered;
      Predicate<E> combinedPredicate = Predicates.<E>and(filtered.predicate, predicate);
      return new FilteredMultiset<E>(filtered.unfiltered, combinedPredicate);
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/HashMultiset.java`
#### Snippet
```java

  private HashMultiset(int distinctElements) {
    super(Maps.<E, Count>newHashMapWithExpectedSize(distinctElements));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/HashMultiset.java`
#### Snippet
```java
    stream.defaultReadObject();
    int distinctElements = Serialization.readCount(stream);
    setBackingMap(Maps.<E, Count>newHashMap());
    Serialization.populateMultiset(this, stream, distinctElements);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/FilteredEntryMultimap.java`
#### Snippet
```java
        @Override
        public boolean removeAll(Collection<?> c) {
          return removeEntriesIf(Maps.<Collection<V>>valuePredicateOnEntries(in(c)));
        }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/FilteredEntryMultimap.java`
#### Snippet
```java
    // These return false, rather than throwing a UOE, on remove calls.
    return (unfiltered instanceof SetMultimap)
        ? Collections.<V>emptySet()
        : Collections.<V>emptyList();
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/FilteredEntryMultimap.java`
#### Snippet
```java
    return (unfiltered instanceof SetMultimap)
        ? Collections.<V>emptySet()
        : Collections.<V>emptyList();
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/FilteredEntryMultimap.java`
#### Snippet
```java
        @Override
        public boolean retainAll(Collection<?> c) {
          return removeEntriesIf(Maps.<K>keyPredicateOnEntries(not(in(c))));
        }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/FilteredEntryMultimap.java`
#### Snippet
```java
        @Override
        public boolean removeAll(Collection<?> c) {
          return removeEntriesIf(Maps.<K>keyPredicateOnEntries(in(c)));
        }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/FilteredEntryMultimap.java`
#### Snippet
```java
        @Override
        public boolean retainAll(Collection<?> c) {
          return removeEntriesIf(Maps.<Collection<V>>valuePredicateOnEntries(not(in(c))));
        }
      }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/graph/UndirectedNetworkConnections.java`
#### Snippet
```java

  static <N, E> UndirectedNetworkConnections<N, E> of() {
    return new UndirectedNetworkConnections<>(HashBiMap.<E, N>create(EXPECTED_DEGREE));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/RegularImmutableSet.java`
#### Snippet
```java
  ImmutableList<E> createAsList() {
    return (table.length == 0)
        ? ImmutableList.<E>of()
        : new RegularImmutableAsList<E>(this, elements);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/base/Optional.java`
#### Snippet
```java
   */
  public static <T> Optional<T> fromNullable(@CheckForNull T nullableReference) {
    return (nullableReference == null) ? Optional.<T>absent() : new Present<T>(nullableReference);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/RegularImmutableTable.java`
#### Snippet
```java
  @Override
  final ImmutableSet<Cell<R, C, V>> createCellSet() {
    return isEmpty() ? ImmutableSet.<Cell<R, C, V>>of() : new CellSet();
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/RegularImmutableTable.java`
#### Snippet
```java
  @Override
  final ImmutableCollection<V> createValues() {
    return isEmpty() ? ImmutableList.<V>of() : new Values();
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/SingletonImmutableTable.java`
#### Snippet
```java
    return containsColumn(columnKey)
        ? ImmutableMap.of(singleRowKey, singleValue)
        : ImmutableMap.<R, V>of();
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/AbstractRangeSet.java`
#### Snippet
```java
  @Override
  public void clear() {
    remove(Range.<C>all());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableListMultimap.java`
#### Snippet
```java
    // This cast is safe as its type is known in constructor.
    ImmutableList<V> list = (ImmutableList<V>) map.get(key);
    return (list == null) ? ImmutableList.<V>of() : list;
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    if (builder.getKeyStrength() == Strength.STRONG
        && builder.getValueStrength() == Strength.STRONG) {
      return new MapMakerInternalMap<>(builder, StrongKeyDummyValueEntry.Helper.<K>instance());
    }
    if (builder.getKeyStrength() == Strength.WEAK
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    if (builder.getKeyStrength() == Strength.WEAK
        && builder.getValueStrength() == Strength.STRONG) {
      return new MapMakerInternalMap<>(builder, WeakKeyDummyValueEntry.Helper.<K>instance());
    }
    if (builder.getValueStrength() == Strength.WEAK) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    if (builder.getKeyStrength() == Strength.STRONG
        && builder.getValueStrength() == Strength.STRONG) {
      return new MapMakerInternalMap<>(builder, StrongKeyStrongValueEntry.Helper.<K, V>instance());
    }
    if (builder.getKeyStrength() == Strength.STRONG
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    if (builder.getKeyStrength() == Strength.STRONG
        && builder.getValueStrength() == Strength.WEAK) {
      return new MapMakerInternalMap<>(builder, StrongKeyWeakValueEntry.Helper.<K, V>instance());
    }
    if (builder.getKeyStrength() == Strength.WEAK
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    if (builder.getKeyStrength() == Strength.WEAK
        && builder.getValueStrength() == Strength.STRONG) {
      return new MapMakerInternalMap<>(builder, WeakKeyStrongValueEntry.Helper.<K, V>instance());
    }
    if (builder.getKeyStrength() == Strength.WEAK && builder.getValueStrength() == Strength.WEAK) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    }
    if (builder.getKeyStrength() == Strength.WEAK && builder.getValueStrength() == Strength.WEAK) {
      return new MapMakerInternalMap<>(builder, WeakKeyWeakValueEntry.Helper.<K, V>instance());
    }
    throw new AssertionError();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/Iterables.java`
#### Snippet
```java
      @Override
      public Spliterator<T> spliterator() {
        return Stream.generate(() -> iterable).<T>flatMap(Streams::stream).spliterator();
      }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
      @Override
      public boolean retainAll(final Collection<?> c) {
        return removeFromColumnIf(Maps.<R>keyPredicateOnEntries(not(in(c))));
      }
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
      @Override
      public boolean removeAll(final Collection<?> c) {
        return removeFromColumnIf(Maps.<V>valuePredicateOnEntries(in(c)));
      }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
      @Override
      public boolean remove(@CheckForNull Object obj) {
        return obj != null && removeFromColumnIf(Maps.<V>valuePredicateOnEntries(equalTo(obj)));
      }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
      @Override
      public boolean retainAll(final Collection<?> c) {
        return removeFromColumnIf(Maps.<V>valuePredicateOnEntries(not(in(c))));
      }
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/MinMaxPriorityQueue.java`
#### Snippet
```java
     */
    public <T extends B> MinMaxPriorityQueue<T> create() {
      return create(Collections.<T>emptySet());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/MinMaxPriorityQueue.java`
#### Snippet
```java
  public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create(
      Iterable<? extends E> initialContents) {
    return new Builder<E>(Ordering.<E>natural()).create(initialContents);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
   */
  public static <E extends @Nullable Object> FluentIterable<E> of() {
    return FluentIterable.from(Collections.<E>emptyList());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
  @SuppressWarnings("nullness") // Unsafe, but we can't do much about it now.
  public final Optional<@NonNull E> firstMatch(Predicate<? super E> predicate) {
    return Iterables.<E>tryFind((Iterable<@NonNull E>) getDelegate(), predicate);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableTable.java`
#### Snippet
```java
    checkNotNull(rowKey, "rowKey");
    return MoreObjects.firstNonNull(
        (ImmutableMap<C, V>) rowMap().get(rowKey), ImmutableMap.<C, V>of());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableTable.java`
#### Snippet
```java
    checkNotNull(columnKey, "columnKey");
    return MoreObjects.firstNonNull(
        (ImmutableMap<R, V>) columnMap().get(columnKey), ImmutableMap.<R, V>of());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/reflect/MutableTypeToInstanceMap.java`
#### Snippet
```java
  @CheckForNull
  public <T extends B> T putInstance(TypeToken<@NonNull T> type, @ParametricNullness T value) {
    return this.<T>trustedPut(type.rejectTypeVariables(), value);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/FilteredMultimapValues.java`
#### Snippet
```java
        multimap.unfiltered().entries(),
        // explicit <Entry<K, V>> is required to build with JDK6
        Predicates.<Entry<K, V>>and(
            multimap.entryPredicate(), Maps.<V>valuePredicateOnEntries(Predicates.in(c))));
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/FilteredMultimapValues.java`
#### Snippet
```java
        // explicit <Entry<K, V>> is required to build with JDK6
        Predicates.<Entry<K, V>>and(
            multimap.entryPredicate(), Maps.<V>valuePredicateOnEntries(Predicates.in(c))));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/FilteredMultimapValues.java`
#### Snippet
```java
        multimap.unfiltered().entries(),
        // explicit <Entry<K, V>> is required to build with JDK6
        Predicates.<Entry<K, V>>and(
            multimap.entryPredicate(),
            Maps.<V>valuePredicateOnEntries(Predicates.not(Predicates.in(c)))));
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/FilteredMultimapValues.java`
#### Snippet
```java
        Predicates.<Entry<K, V>>and(
            multimap.entryPredicate(),
            Maps.<V>valuePredicateOnEntries(Predicates.not(Predicates.in(c)))));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/graph/ElementOrder.java`
#### Snippet
```java
   */
  public static <S extends Comparable<? super S>> ElementOrder<S> natural() {
    return new ElementOrder<>(Type.SORTED, Ordering.<S>natural());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
  /** An {@code Iterator} over distinct keys in key head order. */
  private class DistinctKeyIterator implements Iterator<K> {
    final Set<K> seenKeys = Sets.<K>newHashSetWithExpectedSize(keySet().size());
    @CheckForNull Node<K, V> next = head;
    @CheckForNull Node<K, V> current;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/util/concurrent/ServiceManager.java`
#### Snippet
```java
  public ImmutableMap<Service, Duration> startupDurations() {
    return ImmutableMap.copyOf(
        Maps.<Service, Long, Duration>transformValues(startupTimes(), Duration::ofMillis));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/util/concurrent/ServiceManager.java`
#### Snippet
```java
          "ServiceManager configured with no services.  Is your application configured properly?",
          new EmptyServiceManagerWarning());
      copy = ImmutableList.<Service>of(new NoOpService());
    }
    this.state = new ServiceManagerState(copy);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/RegularImmutableMap.java`
#### Snippet
```java
    if (duplicates != null) {
      // Explicit type parameters needed here to avoid a problem with nullness inference.
      entries = RegularImmutableMap.<K, V>removeDuplicates(entries, n, n - dupCount, duplicates);
      int newTableSize = Hashing.closedTableSize(entries.length, MAX_LOAD_FACTOR);
      if (newTableSize != tableSize) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
            0,
            localSize,
            Ordering.from(valueComparator).onResultOf(Maps.<V>valueFunction()));
        localEntries = (@Nullable Entry<K, V>[]) nonNullEntries;
      }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/MultimapBuilder.java`
#### Snippet
```java
        public <K extends K0, V extends @Nullable Object> SetMultimap<K, V> build() {
          return Multimaps.newSetMultimap(
              MultimapBuilderWithKeys.this.<K, V>createMap(),
              new HashSetSupplier<V>(expectedValuesPerKey));
        }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/MultimapBuilder.java`
#### Snippet
```java
        public <K extends K0, V extends V0> SortedSetMultimap<K, V> build() {
          return Multimaps.newSortedSetMultimap(
              MultimapBuilderWithKeys.this.<K, V>createMap(), new TreeSetSupplier<V>(comparator));
        }
      };
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/MultimapBuilder.java`
#### Snippet
```java
          @SuppressWarnings({"unchecked", "rawtypes"})
          Supplier<Set<V>> factory = (Supplier) new EnumSetSupplier<V0>(valueClass);
          return Multimaps.newSetMultimap(MultimapBuilderWithKeys.this.<K, V>createMap(), factory);
        }
      };
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/MultimapBuilder.java`
#### Snippet
```java
        public <K extends K0, V extends @Nullable Object> SetMultimap<K, V> build() {
          return Multimaps.newSetMultimap(
              MultimapBuilderWithKeys.this.<K, V>createMap(),
              new LinkedHashSetSupplier<V>(expectedValuesPerKey));
        }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/MultimapBuilder.java`
#### Snippet
```java
        public <K extends K0, V extends @Nullable Object> ListMultimap<K, V> build() {
          return Multimaps.newListMultimap(
              MultimapBuilderWithKeys.this.<K, V>createMap(), LinkedListSupplier.<V>instance());
        }
      };
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/MultimapBuilder.java`
#### Snippet
```java
        public <K extends K0, V extends @Nullable Object> ListMultimap<K, V> build() {
          return Multimaps.newListMultimap(
              MultimapBuilderWithKeys.this.<K, V>createMap(), LinkedListSupplier.<V>instance());
        }
      };
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/MultimapBuilder.java`
#### Snippet
```java
        public <K extends K0, V extends @Nullable Object> ListMultimap<K, V> build() {
          return Multimaps.newListMultimap(
              MultimapBuilderWithKeys.this.<K, V>createMap(),
              new ArrayListSupplier<V>(expectedValuesPerKey));
        }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/graph/DirectedNetworkConnections.java`
#### Snippet
```java
  static <N, E> DirectedNetworkConnections<N, E> of() {
    return new DirectedNetworkConnections<>(
        HashBiMap.<E, N>create(EXPECTED_DEGREE), HashBiMap.<E, N>create(EXPECTED_DEGREE), 0);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/graph/DirectedNetworkConnections.java`
#### Snippet
```java
  static <N, E> DirectedNetworkConnections<N, E> of() {
    return new DirectedNetworkConnections<>(
        HashBiMap.<E, N>create(EXPECTED_DEGREE), HashBiMap.<E, N>create(EXPECTED_DEGREE), 0);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
      }
    }
    return isEmpty() ? ImmutableSet.<Entry<K, V>>of() : new EntrySet();
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
    } else {
      return new ImmutableSortedMap<>(
          ImmutableSortedSet.emptySet(comparator), ImmutableList.<V>of());
    }
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
  private static final ImmutableSortedMap<Comparable, Object> NATURAL_EMPTY_MAP =
      new ImmutableSortedMap<>(
          ImmutableSortedSet.emptySet(Ordering.natural()), ImmutableList.<Object>of());

  static <K, V> ImmutableSortedMap<K, V> emptyMap(Comparator<? super K> comparator) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `guava/src/com/google/common/collect/CollectCollectors.java`
#### Snippet
```java

    ImmutableMap<K, V> toImmutableMap() {
      return (map == null) ? ImmutableMap.<K, V>of() : ImmutableEnumMap.asImmutable(map);
    }
  }
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/MultiReader.java`
#### Snippet
```java
class MultiReader extends Reader {
  private final Iterator<? extends CharSource> it;
  @CheckForNull private Reader current;

  MultiReader(Iterator<? extends CharSource> readers) throws IOException {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ThreadFactoryBuilder.java`
#### Snippet
```java
  @CheckForNull private Boolean daemon = null;
  @CheckForNull private Integer priority = null;
  @CheckForNull private UncaughtExceptionHandler uncaughtExceptionHandler = null;
  @CheckForNull private ThreadFactory backingThreadFactory = null;

```

### NullableProblems
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

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ThreadFactoryBuilder.java`
#### Snippet
```java
  @CheckForNull private Integer priority = null;
  @CheckForNull private UncaughtExceptionHandler uncaughtExceptionHandler = null;
  @CheckForNull private ThreadFactory backingThreadFactory = null;

  /** Creates a new {@link ThreadFactory} builder. */
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/Converter.java`
#### Snippet
```java

  // We lazily cache the reverse view to avoid allocating on every call to reverse().
  @LazyInit @RetainedWith @CheckForNull private transient Converter<B, A> reverse;

  /** Constructor for use by subclasses. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
  }

  @LazyInit @RetainedWith @CheckForNull private transient ImmutableSetMultimap<V, K> inverse;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
  }

  @LazyInit @RetainedWith @CheckForNull private transient ImmutableSet<Entry<K, V>> entries;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/reflect/Types.java`
#### Snippet
```java
  private static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {

    @CheckForNull private final Type ownerType;
    private final ImmutableList<Type> argumentsList;
    private final Class<?> rawType;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/TrustedListenableFutureTask.java`
#### Snippet
```java
   * https://developers.google.com/j2objc/guides/j2objc-memory-model#atomicity
   */
  @CheckForNull private volatile InterruptibleTask<?> task;

  TrustedListenableFutureTask(Callable<V> callable) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
    return new Iterator<Entry<K, V>>() {
      ValueEntry<K, V> nextEntry = multimapHeaderEntry.getSuccessorInMultimap();
      @CheckForNull ValueEntry<K, V> toRemove;

      @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java

    @CheckForNull ValueEntry<K, V> predecessorInMultimap;
    @CheckForNull ValueEntry<K, V> successorInMultimap;

    ValueEntry(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
      return new Iterator<V>() {
        ValueSetLink<K, V> nextEntry = firstEntry;
        @CheckForNull ValueEntry<K, V> toRemove;
        int expectedModCount = modCount;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
     */

    @CheckForNull ValueSetLink<K, V> predecessorInValueSet;
    @CheckForNull ValueSetLink<K, V> successorInValueSet;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
    final int smearedValueHash;

    @CheckForNull ValueEntry<K, V> nextInValueBucket;
    /*
     * The *InValueSet and *InMultimap fields below are null after construction, but we almost
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/NaturalOrdering.java`
#### Snippet
```java
  static final NaturalOrdering INSTANCE = new NaturalOrdering();

  @CheckForNull private transient Ordering<@Nullable Comparable<?>> nullsFirst;
  @CheckForNull private transient Ordering<@Nullable Comparable<?>> nullsLast;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
    @CheckForNull ValueSetLink<K, V> successorInValueSet;

    @CheckForNull ValueEntry<K, V> predecessorInMultimap;
    @CheckForNull ValueEntry<K, V> successorInMultimap;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/NaturalOrdering.java`
#### Snippet
```java

  @CheckForNull private transient Ordering<@Nullable Comparable<?>> nullsFirst;
  @CheckForNull private transient Ordering<@Nullable Comparable<?>> nullsLast;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java

    @CheckForNull ValueSetLink<K, V> predecessorInValueSet;
    @CheckForNull ValueSetLink<K, V> successorInValueSet;

    @CheckForNull ValueEntry<K, V> predecessorInMultimap;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractSequentialIterator.java`
#### Snippet
```java
@ElementTypesAreNonnullByDefault
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {
  @CheckForNull private T nextOrNull;

  /**
```

### NullableProblems
Non-annotated parameter 'e' in method 'addFirst' from 'ForwardingDeque' should not override non-null parameter from 'BlockingDeque'
in `guava/src/com/google/common/collect/ForwardingBlockingDeque.java`
#### Snippet
```java
@ElementTypesAreNonnullByDefault
public abstract class ForwardingBlockingDeque<E> extends ForwardingDeque<E>
    implements BlockingDeque<E> {

  /** Constructor for use by subclasses. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
    @LazyInit @CheckForNull private volatile BaseEncoding upperCase;
    @LazyInit @CheckForNull private volatile BaseEncoding lowerCase;
    @LazyInit @CheckForNull private volatile BaseEncoding ignoreCase;

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
    }

    @LazyInit @CheckForNull private volatile BaseEncoding upperCase;
    @LazyInit @CheckForNull private volatile BaseEncoding lowerCase;
    @LazyInit @CheckForNull private volatile BaseEncoding ignoreCase;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
    final Alphabet alphabet;

    @CheckForNull final Character paddingChar;

    StandardBaseEncoding(String name, String alphabetChars, @CheckForNull Character paddingChar) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java

    @LazyInit @CheckForNull private volatile BaseEncoding upperCase;
    @LazyInit @CheckForNull private volatile BaseEncoding lowerCase;
    @LazyInit @CheckForNull private volatile BaseEncoding ignoreCase;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/CombinedFuture.java`
#### Snippet
```java
final class CombinedFuture<V extends @Nullable Object>
    extends AggregateFuture<@Nullable Object, V> {
  @CheckForNull private CombinedFutureInterruptibleTask<?> task;

  CombinedFuture(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMapBasedMultiset.java`
#### Snippet
```java
    final Iterator<Map.Entry<E, Count>> backingEntries = backingMap.entrySet().iterator();
    return new Iterator<E>() {
      @CheckForNull Map.Entry<E, Count> toRemove;

      @Override
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMapBasedMultiset.java`
#### Snippet
```java
    final Iterator<Map.Entry<E, Count>> backingEntries = backingMap.entrySet().iterator();
    return new Iterator<Multiset.Entry<E>>() {
      @CheckForNull Map.Entry<E, Count> toRemove;

      @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
  }

  @CheckForNull private transient RangeSet<C> complement;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java

  @CheckForNull private transient Set<Range<C>> asRanges;
  @CheckForNull private transient Set<Range<C>> asDescendingSetOfRanges;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java
  }

  @CheckForNull private transient Set<Range<C>> asRanges;
  @CheckForNull private transient Set<Range<C>> asDescendingSetOfRanges;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/DirectedMultiNetworkConnections.java`
#### Snippet
```java
  }

  @CheckForNull @LazyInit private transient Reference<Multiset<N>> successorsReference;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/DirectedMultiNetworkConnections.java`
#### Snippet
```java
  }

  @CheckForNull @LazyInit private transient Reference<Multiset<N>> predecessorsReference;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractService.java`
#### Snippet
```java
     * has failed.
     */
    @CheckForNull final Throwable failure;

    StateSnapshot(State internalState) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TopKSelector.java`
#### Snippet
```java
   * bufferSize ≥ k, then we can ignore any elements greater than this value.
   */
  @CheckForNull private T threshold;

  private TopKSelector(Comparator<? super T> comparator, int k) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractSortedMultiset.java`
#### Snippet
```java
  }

  @CheckForNull private transient SortedMultiset<E> descendingMultiset;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/RegularImmutableBiMap.java`
#### Snippet
```java

  @CheckForNull private final transient @Nullable ImmutableMapEntry<K, V>[] keyTable;
  @CheckForNull private final transient @Nullable ImmutableMapEntry<K, V>[] valueTable;
  @VisibleForTesting final transient Entry<K, V>[] entries;
  private final transient int mask;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/RegularImmutableBiMap.java`
#### Snippet
```java
  static final double MAX_LOAD_FACTOR = 1.2;

  @CheckForNull private final transient @Nullable ImmutableMapEntry<K, V>[] keyTable;
  @CheckForNull private final transient @Nullable ImmutableMapEntry<K, V>[] valueTable;
  @VisibleForTesting final transient Entry<K, V>[] entries;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/RegularImmutableBiMap.java`
#### Snippet
```java
  }

  @LazyInit @RetainedWith @CheckForNull private transient ImmutableBiMap<V, K> inverse;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
    }

    @CheckForNull private transient UnmodifiableNavigableSet<E> descendingSet;

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ImmediateFuture.java`
#### Snippet
```java

  static final class ImmediateCancelledFuture<V extends @Nullable Object> extends TrustedFuture<V> {
    @CheckForNull
    static final ImmediateCancelledFuture<Object> INSTANCE =
        AbstractFuture.GENERATE_CANCELLATION_CAUSES ? null : new ImmediateCancelledFuture<>();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
    private final DeferredCloser closer = new DeferredCloser(this);
    private volatile boolean closed;
    @CheckForNull private volatile CountDownLatch whenClosed;

    <V extends @Nullable Object, U extends @Nullable Object>
```

### NullableProblems
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningScheduledExecutorService.java`
#### Snippet
```java
  /** @since 15.0 (previously returned ScheduledFuture) */
  @Override
  ListenableScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit);

  /**
```

### NullableProblems
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningScheduledExecutorService.java`
#### Snippet
```java
  /** @since 15.0 (previously returned ScheduledFuture) */
  @Override
  ListenableScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit);

  /**
```

### NullableProblems
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningScheduledExecutorService.java`
#### Snippet
```java
  @Override
  <V extends @Nullable Object> ListenableScheduledFuture<V> schedule(
      Callable<V> callable, long delay, TimeUnit unit);

  /**
```

### NullableProblems
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningScheduledExecutorService.java`
#### Snippet
```java
  @Override
  <V extends @Nullable Object> ListenableScheduledFuture<V> schedule(
      Callable<V> callable, long delay, TimeUnit unit);

  /**
```

### NullableProblems
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningScheduledExecutorService.java`
#### Snippet
```java
  @Override
  ListenableScheduledFuture<?> scheduleWithFixedDelay(
      Runnable command, long initialDelay, long delay, TimeUnit unit);

  /**
```

### NullableProblems
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningScheduledExecutorService.java`
#### Snippet
```java
  @Override
  ListenableScheduledFuture<?> scheduleWithFixedDelay(
      Runnable command, long initialDelay, long delay, TimeUnit unit);

  /**
```

### NullableProblems
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningScheduledExecutorService.java`
#### Snippet
```java
  @Override
  ListenableScheduledFuture<?> scheduleAtFixedRate(
      Runnable command, long initialDelay, long period, TimeUnit unit);

  /**
```

### NullableProblems
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningScheduledExecutorService.java`
#### Snippet
```java
  @Override
  ListenableScheduledFuture<?> scheduleAtFixedRate(
      Runnable command, long initialDelay, long period, TimeUnit unit);

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/JdkBackedImmutableMultiset.java`
#### Snippet
```java
  }

  @CheckForNull private transient ImmutableSet<E> elementSet;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/internal/Finalizer.java`
#### Snippet
```java
  private static final Constructor<Thread> bigThreadConstructor = getBigThreadConstructor();

  @CheckForNull
  private static final Field inheritableThreadLocals =
      (bigThreadConstructor == null) ? getInheritableThreadLocalsField() : null;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/internal/Finalizer.java`
#### Snippet
```java
  // But before Java 9, our only way not to inherit ThreadLocals is to zap them after the thread
  // is created, by accessing a private field.
  @CheckForNull
  private static final Constructor<Thread> bigThreadConstructor = getBigThreadConstructor();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/net/MediaType.java`
#### Snippet
```java
  private final ImmutableListMultimap<String, String> parameters;

  @LazyInit @CheckForNull private String toString;

  @LazyInit private int hashCode;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/net/MediaType.java`
#### Snippet
```java
  @LazyInit private int hashCode;

  @LazyInit @CheckForNull private Optional<Charset> parsedCharset;

  private MediaType(String type, String subtype, ImmutableListMultimap<String, String> parameters) {
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ExecutionSequencer.java`
#### Snippet
```java
     * object may live on after, if submitAsync returns an incomplete future.
     */
    @CheckForNull Runnable task;

    /** Thread that called execute(). Set in execute, cleared when delegate.execute() returns. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ExecutionSequencer.java`
#### Snippet
```java
     * or queued.
     */
    @CheckForNull ExecutionSequencer sequencer;

    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ExecutionSequencer.java`
#### Snippet
```java
    @CheckForNull Runnable nextTask;
    /** Only used by the thread associated with this object */
    @CheckForNull Executor nextExecutor;
  }

```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ExecutionSequencer.java`
#### Snippet
```java
     * cancelled.
     */
    @CheckForNull Executor delegate;

    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ExecutionSequencer.java`
#### Snippet
```java

    /** Thread that called execute(). Set in execute, cleared when delegate.execute() returns. */
    @CheckForNull Thread submitting;

    private TaskNonReentrantExecutor(Executor delegate, ExecutionSequencer sequencer) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeBasedTable.java`
#### Snippet
```java

  private class TreeRow extends Row implements SortedMap<C, V> {
    @CheckForNull final C lowerBound;
    @CheckForNull final C upperBound;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeBasedTable.java`
#### Snippet
```java
  private class TreeRow extends Row implements SortedMap<C, V> {
    @CheckForNull final C lowerBound;
    @CheckForNull final C upperBound;

    TreeRow(R rowKey) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeBasedTable.java`
#### Snippet
```java

    return new AbstractIterator<C>() {
      @CheckForNull C lastValue;

      @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeBasedTable.java`
#### Snippet
```java
    }

    @CheckForNull transient SortedMap<C, V> wholeRow;

    // If the row was previously empty, we check if there's a new row here every time we're queried.
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java

  /** Resolver for resolving parameter and field types with {@link #runtimeType} as context. */
  @CheckForNull private transient TypeResolver invariantTypeResolver;

  /** Resolver for resolving covariant types with {@link #runtimeType} as context. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java

    private final transient TypeSet allTypes;
    @CheckForNull private transient ImmutableSet<TypeToken<? super T>> interfaces;

    InterfaceSet(TypeSet allTypes) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java
  public class TypeSet extends ForwardingSet<TypeToken<? super T>> implements Serializable {

    @CheckForNull private transient ImmutableSet<TypeToken<? super T>> types;

    TypeSet() {}
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java
  private final class ClassSet extends TypeSet {

    @CheckForNull private transient ImmutableSet<TypeToken<? super T>> classes;

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java

  /** Resolver for resolving covariant types with {@link #runtimeType} as context. */
  @CheckForNull private transient TypeResolver covariantTypeResolver;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableSortedMultiset.java`
#### Snippet
```java
  public abstract ImmutableSortedSet<E> elementSet();

  @LazyInit @CheckForNull transient ImmutableSortedMultiset<E> descendingMultiset;

  @Override
```

### NullableProblems
Non-annotated parameter 'e' in method 'addFirst' from 'ForwardingDeque' should not override non-null parameter from 'BlockingDeque'
in `guava/src/com/google/common/util/concurrent/ForwardingBlockingDeque.java`
#### Snippet
```java
@ElementTypesAreNonnullByDefault
public abstract class ForwardingBlockingDeque<E> extends ForwardingDeque<E>
    implements BlockingDeque<E> {

  /** Constructor for use by subclasses. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ConcurrentHashMultiset.java`
#### Snippet
```java

    return new ForwardingIterator<Entry<E>>() {
      @CheckForNull private Entry<E> last;

      @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java
  public abstract ImmutableSet<E> elementSet();

  @LazyInit @CheckForNull private transient ImmutableSet<Entry<E>> entrySet;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java
  }

  @LazyInit @CheckForNull private transient ImmutableList<E> asList;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java
    return new UnmodifiableIterator<E>() {
      int remaining;
      @CheckForNull E element;

      @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/hash/Striped64.java`
#### Snippet
```java

  /** Table of cells. When non-null, size is a power of 2. */
  @CheckForNull transient volatile Cell[] cells;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/UnmodifiableSortedMultiset.java`
#### Snippet
```java
  }

  @CheckForNull private transient UnmodifiableSortedMultiset<E> descendingMultiset;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AggregateFuture.java`
#### Snippet
```java
   * triggered by cancel(). For details, see the comments on the fields of TimeoutFuture.
   */
  @CheckForNull private ImmutableCollection<? extends ListenableFuture<? extends InputT>> futures;

  private final boolean allMustSucceed;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Collections2.java`
#### Snippet
```java

  private static final class OrderedPermutationIterator<E> extends AbstractIterator<List<E>> {
    @CheckForNull List<E> nextPermutation;
    final Comparator<? super E> comparator;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
  }

  @CheckForNull private transient ColumnMap columnMap;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
  }

  @CheckForNull private transient RowMap rowMap;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/Equivalence.java`
#### Snippet
```java

    private final Equivalence<T> equivalence;
    @CheckForNull private final T target;

    EquivalentToPredicate(Equivalence<T> equivalence, @CheckForNull T target) {
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
  private final BoundType lowerBoundType;
  private final boolean hasUpperBound;
  @CheckForNull private final T upperEndpoint;
  private final BoundType upperBoundType;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
  }

  @CheckForNull private transient GeneralRange<T> reverse;

  /** Returns the same range relative to the reversed comparator. */
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/MoreObjects.java`
#### Snippet
```java
      @CheckForNull String name;
      @CheckForNull Object value;
      @CheckForNull ValueHolder next;
    }

```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractTable.java`
#### Snippet
```java
  }

  @LazyInit @CheckForNull private transient Set<Cell<R, C, V>> cellSet;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractTable.java`
#### Snippet
```java
  }

  @LazyInit @CheckForNull private transient Collection<V> values;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/escape/Escapers.java`
#### Snippet
```java
    private char safeMin = Character.MIN_VALUE;
    private char safeMax = Character.MAX_VALUE;
    @CheckForNull private String unsafeReplacement = null;

    // The constructor is exposed via the builder() method above.
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/JdkBackedImmutableBiMap.java`
#### Snippet
```java
  }

  @LazyInit @RetainedWith @CheckForNull private transient JdkBackedImmutableBiMap<V, K> inverse;

  @Override
```

### NullableProblems
Non-annotated parameter 'element' in method 'add' from 'ForwardingCollection' should not override non-null parameter from 'BlockingQueue'
in `guava/src/com/google/common/util/concurrent/ForwardingBlockingQueue.java`
#### Snippet
```java
@ElementTypesAreNonnullByDefault
public abstract class ForwardingBlockingQueue<E> extends ForwardingQueue<E>
    implements BlockingQueue<E> {

  /** Constructor for use by subclasses. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMaker.java`
#### Snippet
```java
  @CheckForNull Strength valueStrength;

  @CheckForNull Equivalence<Object> keyEquivalence;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMaker.java`
#### Snippet
```java

  @CheckForNull Strength keyStrength;
  @CheckForNull Strength valueStrength;

  @CheckForNull Equivalence<Object> keyEquivalence;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMaker.java`
#### Snippet
```java
  int concurrencyLevel = UNSET_INT;

  @CheckForNull Strength keyStrength;
  @CheckForNull Strength valueStrength;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/DescendingMultiset.java`
#### Snippet
```java
  abstract Iterator<Entry<E>> entryIterator();

  @CheckForNull private transient Set<Entry<E>> entrySet;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/DescendingMultiset.java`
#### Snippet
```java
  }

  @CheckForNull private transient NavigableSet<E> elementSet;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/DescendingMultiset.java`
#### Snippet
```java
  abstract SortedMultiset<E> forwardMultiset();

  @CheckForNull private transient Comparator<? super E> comparator;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
  }

  @LazyInit @CheckForNull private transient ImmutableRangeSet<C> complement;

  private final class ComplementRanges extends ImmutableList<Range<C>> {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableRangeSet.java`
#### Snippet
```java
    }

    @CheckForNull private transient Integer size;

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/Futures.java`
#### Snippet
```java
  private static final class InCompletionOrderFuture<T extends @Nullable Object>
      extends AbstractFuture<T> {
    @CheckForNull private InCompletionOrderState<T> state;

    private InCompletionOrderFuture(InCompletionOrderState<T> state) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/Futures.java`
#### Snippet
```java
  private static final class NonCancellationPropagatingFuture<V extends @Nullable Object>
      extends AbstractFuture.TrustedFuture<V> implements Runnable {
    @CheckForNull private ListenableFuture<V> delegate;

    NonCancellationPropagatingFuture(final ListenableFuture<V> delegate) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/SingletonImmutableBiMap.java`
#### Snippet
```java

  @CheckForNull private final transient ImmutableBiMap<V, K> inverse;
  @LazyInit @RetainedWith @CheckForNull private transient ImmutableBiMap<V, K> lazyInverse;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/SingletonImmutableBiMap.java`
#### Snippet
```java
  }

  @CheckForNull private final transient ImmutableBiMap<V, K> inverse;
  @LazyInit @RetainedWith @CheckForNull private transient ImmutableBiMap<V, K> lazyInverse;

```

### NullableProblems
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningExecutorService.java`
#### Snippet
```java
   */
  @Override
  <T extends @Nullable Object> ListenableFuture<T> submit(Callable<T> task);

  /**
```

### NullableProblems
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningExecutorService.java`
#### Snippet
```java
  @Override
  <T extends @Nullable Object> ListenableFuture<T> submit(
      Runnable task, @ParametricNullness T result);

  /**
```

### NullableProblems
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningExecutorService.java`
#### Snippet
```java
   */
  @Override
  <T extends @Nullable Object> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks)
      throws InterruptedException;

```

### NullableProblems
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

### NullableProblems
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

### NullableProblems
Overridden method parameters are not annotated
in `guava/src/com/google/common/util/concurrent/ListeningExecutorService.java`
#### Snippet
```java
   */
  @Override
  ListenableFuture<?> submit(Runnable task);

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/Monitor.java`
#### Snippet
```java
   */
  @GuardedBy("lock")
  @CheckForNull
  private Guard activeGuards = null;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/Monitor.java`
#### Snippet
```java
    /** The next active guard */
    @GuardedBy("monitor.lock")
    @CheckForNull
    Guard next;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
    final Iterator<Entry<K, Collection<V>>> keyIterator;
    @CheckForNull K key;
    @CheckForNull Collection<V> collection;
    Iterator<V> valueIterator;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
    Collection<V> delegate;
    @CheckForNull final WrappedCollection ancestor;
    @CheckForNull final Collection<V> ancestorDelegate;

    WrappedCollection(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
    }

    @CheckForNull SortedSet<K> sortedKeySet;

    // returns a SortedSet, even though returning a Set would be sufficient to
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
    @ParametricNullness final K key;
    Collection<V> delegate;
    @CheckForNull final WrappedCollection ancestor;
    @CheckForNull final Collection<V> ancestorDelegate;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
    class AsMapIterator implements Iterator<Entry<K, Collection<V>>> {
      final Iterator<Entry<K, Collection<V>>> delegateIterator = submap.entrySet().iterator();
      @CheckForNull Collection<V> collection;

      @Override
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
      final Iterator<Entry<K, Collection<V>>> entryIterator = map().entrySet().iterator();
      return new Iterator<K>() {
        @CheckForNull Entry<K, Collection<V>> entry;

        @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMultimap.java`
#### Snippet
```java
      final Iterator<? extends Entry<K, ? extends ImmutableCollection<V>>> asMapItr =
          map.entrySet().iterator();
      @CheckForNull K currentKey = null;
      Iterator<V> valueItr = Iterators.emptyIterator();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMultimap.java`
#### Snippet
```java
    final Map<K, Collection<V>> builderMap;
    @CheckForNull Comparator<? super K> keyComparator;
    @CheckForNull Comparator<? super V> valueComparator;

    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMultimap.java`
#### Snippet
```java
  public static class Builder<K, V> {
    final Map<K, Collection<V>> builderMap;
    @CheckForNull Comparator<? super K> keyComparator;
    @CheckForNull Comparator<? super V> valueComparator;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/CharSequenceReader.java`
#### Snippet
```java
final class CharSequenceReader extends Reader {

  @CheckForNull private CharSequence seq;
  private int pos;
  private int mark;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactLinkedHashSet.java`
#### Snippet
```java
   * first node in insertion order; all values at indices ≥ {@link #size()} are UNSET.
   */
  @CheckForNull private transient int[] predecessor;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactLinkedHashSet.java`
#### Snippet
```java
   * node in insertion order; all values at indices ≥ {@link #size()} are UNSET.
   */
  @CheckForNull private transient int[] successor;

  /** Pointer to the first node in the linked list, or {@code ENDPOINT} if there are no entries. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  }

  @LazyInit @CheckForNull private transient Set<K> keySet;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  abstract Multiset<K> createKeys();

  @LazyInit @CheckForNull private transient Collection<V> values;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  }

  @LazyInit @CheckForNull private transient Collection<Entry<K, V>> entries;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  }

  @LazyInit @CheckForNull private transient Map<K, Collection<V>> asMap;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  abstract Set<K> createKeySet();

  @LazyInit @CheckForNull private transient Multiset<K> keys;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/TimeoutFuture.java`
#### Snippet
```java
   */

  @CheckForNull private ListenableFuture<V> delegateRef;
  @CheckForNull private ScheduledFuture<?> timer;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/TimeoutFuture.java`
#### Snippet
```java

  @CheckForNull private ListenableFuture<V> delegateRef;
  @CheckForNull private ScheduledFuture<?> timer;

  private TimeoutFuture(ListenableFuture<V> delegate) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/TimeoutFuture.java`
#### Snippet
```java
  /** A runnable that is called when the delegate or the timer completes. */
  private static final class Fire<V extends @Nullable Object> implements Runnable {
    @CheckForNull TimeoutFuture<V> timeoutFutureRef;

    Fire(TimeoutFuture<V> timeoutFuture) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilderSpec.java`
#### Snippet
```java

  @VisibleForTesting @CheckForNull Integer initialCapacity;
  @VisibleForTesting @CheckForNull Long maximumSize;
  @VisibleForTesting @CheckForNull Long maximumWeight;
  @VisibleForTesting @CheckForNull Integer concurrencyLevel;
```

### NullableProblems
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

### NullableProblems
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

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilderSpec.java`
#### Snippet
```java
          .buildOrThrow();

  @VisibleForTesting @CheckForNull Integer initialCapacity;
  @VisibleForTesting @CheckForNull Long maximumSize;
  @VisibleForTesting @CheckForNull Long maximumWeight;
```

### NullableProblems
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

### NullableProblems
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

### NullableProblems
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

### NullableProblems
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

### NullableProblems
Parameter annotated @ElementTypesAreNonnullByDefault must not override @CheckForNull parameter
in `guava/src/com/google/common/cache/CacheBuilderSpec.java`
#### Snippet
```java

    @Override
    public void parse(CacheBuilderSpec spec, String key, @Nullable String value) {
      if (isNullOrEmpty(value)) {
        throw new IllegalArgumentException("value of key " + key + " omitted");
```

### NullableProblems
Parameter annotated @ElementTypesAreNonnullByDefault must not override @CheckForNull parameter
in `guava/src/com/google/common/cache/CacheBuilderSpec.java`
#### Snippet
```java

    @Override
    public void parse(CacheBuilderSpec spec, String key, @Nullable String value) {
      if (isNullOrEmpty(value)) {
        throw new IllegalArgumentException("value of key " + key + " omitted");
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    }

    @CheckForNull private transient Collection<V> values;

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    }

    @CheckForNull private transient Set<K> keySet;

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    final BiMap<? extends K, ? extends V> delegate;
    @RetainedWith @CheckForNull BiMap<V, K> inverse;
    @CheckForNull transient Set<V> values;

    UnmodifiableBiMap(BiMap<? extends K, ? extends V> delegate, @CheckForNull BiMap<V, K> inverse) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    }

    @CheckForNull private transient NavigableSet<K> navigableKeySet;

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    }

    @CheckForNull private transient Comparator<? super K> comparator;

    @SuppressWarnings("unchecked")
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    abstract Set<Entry<K, V>> createEntrySet();

    @CheckForNull private transient Set<Entry<K, V>> entrySet;

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    }

    @CheckForNull private transient UnmodifiableNavigableMap<K, V> descendingMap;

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    }

    @CheckForNull private transient Set<Entry<K, V>> entrySet;

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    final Map<K, V> unmodifiableMap;
    final BiMap<? extends K, ? extends V> delegate;
    @RetainedWith @CheckForNull BiMap<V, K> inverse;
    @CheckForNull transient Set<V> values;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
  @GwtIncompatible // NavigableSet
  @LazyInit
  @CheckForNull
  transient ImmutableSortedSet<E> descendingSet;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableSet.java`
#### Snippet
```java
  private static final class RegularSetBuilderImpl<E> extends SetBuilderImpl<E> {
    // null until at least two elements are present
    @CheckForNull private @Nullable Object[] hashTable;
    private int maxRunBeforeFallback;
    private int expandTableThreshold;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableSet.java`
#### Snippet
```java
     * that this field is non-null.
     */
    @CheckForNull private SetBuilderImpl<E> impl;
    boolean forceCopy;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableSet.java`
#### Snippet
```java
  @GwtCompatible
  abstract static class CachingAsList<E> extends ImmutableSet<E> {
    @LazyInit @RetainedWith @CheckForNull private transient ImmutableList<E> asList;

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/UndirectedMultiNetworkConnections.java`
#### Snippet
```java
  }

  @CheckForNull @LazyInit private transient Reference<Multiset<N>> adjacentNodesReference;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMapEntry.java`
#### Snippet
```java
     * in the value bucket (or vice versa).
     */
    @CheckForNull private final transient ImmutableMapEntry<K, V> nextInKeyBucket;

    NonTerminalImmutableMapEntry(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMapEntry.java`
#### Snippet
```java
  static final class NonTerminalImmutableBiMapEntry<K, V>
      extends NonTerminalImmutableMapEntry<K, V> {
    @CheckForNull private final transient ImmutableMapEntry<K, V> nextInValueBucket;

    NonTerminalImmutableBiMapEntry(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/RateLimiter.java`
#### Snippet
```java

  // Can't be initialized in the constructor because mocks don't call the constructor.
  @CheckForNull private volatile Object mutexDoNotUseDirectly;

  private Object mutex() {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/RegularImmutableMultiset.java`
#### Snippet
```java
  private final transient int hashCode;

  @LazyInit @CheckForNull private transient ImmutableSet<E> elementSet;

  private RegularImmutableMultiset(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMultiset.java`
#### Snippet
```java
  abstract Iterator<E> elementIterator();

  @LazyInit @CheckForNull private transient Set<Entry<E>> entrySet;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractMultiset.java`
#### Snippet
```java
  // Views

  @LazyInit @CheckForNull private transient Set<E> elementSet;

  @Override
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    @LazyInit @CheckForNull transient Multiset<K> keys;
    @LazyInit @CheckForNull transient Set<K> keySet;
    @LazyInit @CheckForNull transient Collection<V> values;
    @LazyInit @CheckForNull transient Map<K, Collection<V>> map;

```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
      extends AbstractSortedSetMultimap<K, V> {
    transient Supplier<? extends SortedSet<V>> factory;
    @CheckForNull transient Comparator<? super V> valueComparator;

    CustomSortedSetMultimap(Map<K, Collection<V>> map, Supplier<? extends SortedSet<V>> factory) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    @LazyInit @CheckForNull transient Set<K> keySet;
    @LazyInit @CheckForNull transient Collection<V> values;
    @LazyInit @CheckForNull transient Map<K, Collection<V>> map;

    UnmodifiableMultimap(final Multimap<K, V> delegate) {
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/MultiInputStream.java`
#### Snippet
```java

  private Iterator<? extends ByteSource> it;
  @CheckForNull private InputStream in;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MoreCollectors.java`
#### Snippet
```java
    static final int MAX_EXTRAS = 4;

    @CheckForNull Object element;
    List<Object> extras;

```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
    private final Multiset<E> multiset;
    private final Iterator<Entry<E>> entryIterator;
    @CheckForNull private Entry<E> currentEntry;

    /** Count of subsequent elements equal to current element */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
    }

    @CheckForNull transient Set<E> elementSet;

    Set<E> createElementSet() {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
    }

    @CheckForNull transient Set<Multiset.Entry<E>> entrySet;

    @SuppressWarnings("unchecked")
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/AbstractIterator.java`
#### Snippet
```java
  }

  @CheckForNull private T next;

  @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/MapRetrievalCache.java`
#### Snippet
```java
  // See the note about volatile in the superclass.
  @CheckForNull private transient volatile CacheEntry<K, V> cacheEntry1;
  @CheckForNull private transient volatile CacheEntry<K, V> cacheEntry2;

  MapRetrievalCache(Map<K, V> backingMap) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/MapRetrievalCache.java`
#### Snippet
```java
final class MapRetrievalCache<K, V> extends MapIteratorCache<K, V> {
  // See the note about volatile in the superclass.
  @CheckForNull private transient volatile CacheEntry<K, V> cacheEntry1;
  @CheckForNull private transient volatile CacheEntry<K, V> cacheEntry2;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashSet.java`
#### Snippet
```java
   * elements.length) are all {@code null}.
   */
  @VisibleForTesting @CheckForNull transient @Nullable Object[] elements;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashSet.java`
#### Snippet
```java
   * <p>The pointers in [size(), entries.length) are all "null" (UNSET).
   */
  @CheckForNull private transient int[] entries;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashSet.java`
#### Snippet
```java
   * </ul>
   */
  @CheckForNull private transient Object table;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
    // These two fields are volatile because their values will be accessed from multiple threads.
    @CheckForNull private volatile Cancellable runningTask;
    @CheckForNull private volatile ScheduledExecutorService executorService;

    // This lock protects the task so we can ensure that none of the template methods (startUp,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
      /** The future that represents the next execution of this task. */
      @GuardedBy("lock")
      @CheckForNull
      private SupplantableFuture cancellationDelegate;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
    // A handle to the running task so that we can stop it when a shutdown has been requested.
    // These two fields are volatile because their values will be accessed from multiple threads.
    @CheckForNull private volatile Cancellable runningTask;
    @CheckForNull private volatile ScheduledExecutorService executorService;

```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public ImmutableMap<K, V> getAll(Iterable<? extends K> keys) throws ExecutionException {
      return autoDelegate.getAll(keys);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public Iterator<ReferenceEntry<K, V>> iterator() {
      return new AbstractSequentialIterator<ReferenceEntry<K, V>>(peek()) {
        @CheckForNull
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
          new CacheLoader<Object, V>() {
            @Override
            public V load(Object key) throws Exception {
              return valueLoader.call();
            }
```

### NullableProblems
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

### NullableProblems
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

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public ReferenceEntry<Object, Object> getNextInAccessQueue() {
      return this;
    }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public ReferenceEntry<K, V> getPreviousInAccessQueue() {
      throw new UnsupportedOperationException();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public Iterator<V> iterator() {
      return new ValueIterator();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public ReferenceEntry<K, V> getPreviousInWriteQueue() {
      throw new UnsupportedOperationException();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public Iterator<ReferenceEntry<K, V>> iterator() {
      return new AbstractSequentialIterator<ReferenceEntry<K, V>>(peek()) {
        @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    /** The per-segment table. */
    @CheckForNull volatile AtomicReferenceArray<ReferenceEntry<K, V>> table;

    /** The maximum weight of this segment. UNSET_INT if there is no maximum. */
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public ConcurrentMap<K, V> asMap() {
      return localCache;
    }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public ReferenceEntry<K, V> getNextInAccessQueue() {
      throw new UnsupportedOperationException();
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
  }

  @RetainedWith @CheckForNull Collection<V> values;

  @Override
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
  }

  @RetainedWith @CheckForNull Set<K> keySet;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
  }

  @RetainedWith @CheckForNull Set<Entry<K, V>> entrySet;

  @Override
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public Object[] toArray() {
      return toArrayList(this).toArray();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public ReferenceEntry<K, V> getPreviousInAccessQueue() {
      throw new UnsupportedOperationException();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public ReferenceEntry<K, V> getPreviousInWriteQueue() {
      throw new UnsupportedOperationException();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public V getUnchecked(K key) {
      return autoDelegate.getUnchecked(key);
    }
```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @CheckForNull parameter
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public void notifyNewValue(V newValue) {}

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
     * need to be cleaned up internally.
     */
    @CheckForNull final ReferenceQueue<K> keyReferenceQueue;

    /**
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public CacheStats stats() {
      SimpleStatsCounter aggregator = new SimpleStatsCounter();
      aggregator.incrementBy(localCache.globalStatsCounter);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        @Override
        public Iterator<Object> iterator() {
          return ImmutableSet.of().iterator();
        }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    final int hash;
    @CheckForNull final ReferenceEntry<K, V> next;
    volatile ValueReference<K, V> valueReference = unset();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @CheckForNull AtomicReferenceArray<ReferenceEntry<K, V>> currentTable;
    @CheckForNull ReferenceEntry<K, V> nextEntry;
    @CheckForNull WriteThroughEntry nextExternal;
    @CheckForNull WriteThroughEntry lastReturned;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    final int concurrencyLevel;
    final RemovalListener<? super K, ? super V> removalListener;
    @CheckForNull final Ticker ticker;
    final CacheLoader<? super K, V> loader;

```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    protected Cache<K, V> delegate() {
      return delegate;
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @CheckForNull ReferenceEntry<K, V> nextEntry;
    @CheckForNull WriteThroughEntry nextExternal;
    @CheckForNull WriteThroughEntry lastReturned;

    HashIterator() {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    private static final long serialVersionUID = 1;

    @CheckForNull transient LoadingCache<K, V> autoDelegate;

    LoadingSerializationProxy(LocalCache<K, V> cache) {
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public Iterator<K> iterator() {
      return new KeyIterator();
    }
```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @CheckForNull parameter
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        @Override
        public void notifyNewValue(Object newValue) {}
      };

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
     * and which need to be cleaned up internally.
     */
    @CheckForNull final ReferenceQueue<V> valueReferenceQueue;

    /**
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public V get(K key, final Callable<? extends V> valueLoader) throws ExecutionException {
      checkNotNull(valueLoader);
      return localCache.get(
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public V get(K key) throws ExecutionException {
      return autoDelegate.get(key);
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    final int hash;
    @CheckForNull final ReferenceEntry<K, V> next;
    volatile ValueReference<K, V> valueReference = unset();

```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public ReferenceEntry<Object, Object> getPreviousInAccessQueue() {
      return this;
    }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public ReferenceEntry<Object, Object> getPreviousInWriteQueue() {
      return this;
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

  /** The default cache loader to use on loading operations. */
  @CheckForNull final CacheLoader<? super K, V> defaultLoader;

  /**
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public ReferenceEntry<K, V> getNextInWriteQueue() {
      throw new UnsupportedOperationException();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public <E> E[] toArray(E[] a) {
      return toArrayList(this).toArray(a);
    }
```

### NullableProblems
Non-annotated method 'asMap' from 'LocalManualCache' implements non-null method from 'LoadingCache'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

  static class LocalLoadingCache<K, V> extends LocalManualCache<K, V>
      implements LoadingCache<K, V> {

    LocalLoadingCache(
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public ReferenceEntry<K, V> getNextInWriteQueue() {
      throw new UnsupportedOperationException();
    }
```

### NullableProblems
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

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public ReferenceEntry<K, V> getNextInAccessQueue() {
      throw new UnsupportedOperationException();
    }
```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @CheckForNull parameter
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public void notifyNewValue(V newValue) {}

    @Override
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public ImmutableMap<K, V> getAll(Iterable<? extends K> keys) throws ExecutionException {
      return localCache.getAll(keys);
    }
```

### NullableProblems
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

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public ReferenceEntry<Object, Object> getNextInWriteQueue() {
      return this;
    }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @CanIgnoreReturnValue // TODO(b/27479612): consider removing this
    @Override
    public V getUnchecked(K key) {
      try {
        return get(key);
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public V get(K key) throws ExecutionException {
      return localCache.getOrLoad(key);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public ImmutableMap<K, V> getAllPresent(Iterable<?> keys) {
      return localCache.getAllPresent(keys);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public Iterator<Entry<K, V>> iterator() {
      return new EntryIterator();
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    final CacheLoader<? super K, V> loader;

    @CheckForNull transient Cache<K, V> delegate;

    ManualSerializationProxy(LocalCache<K, V> cache) {
```

### NullableProblems
Parameter annotated @ParametersAreNonnullByDefault must not override @CheckForNull parameter
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    @Override
    public void notifyNewValue(V newValue) {}
  }

```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
   * </ul>
   */
  @CheckForNull private transient Object table;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
   * keys.length) are all {@code null}.
   */
  @VisibleForTesting @CheckForNull transient @Nullable Object[] keys;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
  }

  @CheckForNull private transient Set<K> keySetView;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
   * values.length) are all {@code null}.
   */
  @VisibleForTesting @CheckForNull transient @Nullable Object[] values;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
  }

  @CheckForNull private transient Collection<V> valuesView;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
   * <p>The pointers in [size(), entries.length) are all "null" (UNSET).
   */
  @VisibleForTesting @CheckForNull transient int[] entries;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
  }

  @CheckForNull private transient Set<Entry<K, V>> entrySetView;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractIterator.java`
#### Snippet
```java
  }

  @CheckForNull private T next;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java

  /** All listeners. */
  @CheckForNull private volatile Listener listeners;

  /** All waiting threads. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java

    @CheckForNull volatile Thread thread;
    @CheckForNull volatile Waiter next;

    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    @CheckForNull // null only for TOMBSTONE
    final Runnable task;
    @CheckForNull // null only for TOMBSTONE
    final Executor executor;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
  private static final class Cancellation {
    // constants to use when GENERATE_CANCELLATION_CAUSES = false
    @CheckForNull static final Cancellation CAUSELESS_INTERRUPTED;
    @CheckForNull static final Cancellation CAUSELESS_CANCELLED;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    static final Waiter TOMBSTONE = new Waiter(false /* ignored param */);

    @CheckForNull volatile Thread thread;
    @CheckForNull volatile Waiter next;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
   * </ul>
   */
  @CheckForNull private volatile Object value;

  /** All listeners. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java

    final boolean wasInterrupted;
    @CheckForNull final Throwable cause;

    Cancellation(boolean wasInterrupted, @CheckForNull Throwable cause) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java

    // writes to next are made visible by subsequent CAS's on the listeners field
    @CheckForNull Listener next;

    Listener(Runnable task, Executor executor) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    // constants to use when GENERATE_CANCELLATION_CAUSES = false
    @CheckForNull static final Cancellation CAUSELESS_INTERRUPTED;
    @CheckForNull static final Cancellation CAUSELESS_CANCELLED;

    static {
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java

  /** All waiting threads. */
  @CheckForNull private volatile Waiter waiters;

  /** Constructor for use by subclasses. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractCatchingFuture.java`
#### Snippet
```java
   */
  @CheckForNull ListenableFuture<? extends V> inputFuture;
  @CheckForNull Class<X> exceptionType;
  @CheckForNull F fallback;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractCatchingFuture.java`
#### Snippet
```java
  @CheckForNull ListenableFuture<? extends V> inputFuture;
  @CheckForNull Class<X> exceptionType;
  @CheckForNull F fallback;

  AbstractCatchingFuture(
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/math/LinearTransformation.java`
#### Snippet
```java
    final double yIntercept;

    @CheckForNull @LazyInit LinearTransformation inverse;

    RegularLinearTransformation(double slope, double yIntercept) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/math/LinearTransformation.java`
#### Snippet
```java
    final double x;

    @CheckForNull @LazyInit LinearTransformation inverse;

    VerticalLinearTransformation(double x) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/SequentialExecutor.java`
#### Snippet
```java
  /** Worker that runs tasks from {@link #queue} until it is empty. */
  private final class QueueWorker implements Runnable {
    @CheckForNull Runnable task;

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/DirectedGraphConnections.java`
#### Snippet
```java
   * not have been inserted consecutively.
   */
  @CheckForNull private final List<NodeConnection<N>> orderedNodeConnections;

  private int predecessorCount;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
     * methods, which perform null checks before returning the fields.
     */
    @CheckForNull private AvlNode<E> pred;
    @CheckForNull private AvlNode<E> succ;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
    return new Iterator<Entry<E>>() {
      @CheckForNull AvlNode<E> current = firstNode();
      @CheckForNull Entry<E> prevEntry;

      @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
     */
    @CheckForNull private AvlNode<E> pred;
    @CheckForNull private AvlNode<E> succ;

    AvlNode(@ParametricNullness E elem, int elemCount) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java

  private static final class Reference<T> {
    @CheckForNull private T value;

    @CheckForNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
  Iterator<Entry<E>> descendingEntryIterator() {
    return new Iterator<Entry<E>>() {
      @CheckForNull AvlNode<E> current = lastNode();
      @CheckForNull Entry<E> prevEntry = null;

```

### NullableProblems
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

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
    return new Iterator<Entry<E>>() {
      @CheckForNull AvlNode<E> current = lastNode();
      @CheckForNull Entry<E> prevEntry = null;

      @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
  Iterator<Entry<E>> entryIterator() {
    return new Iterator<Entry<E>>() {
      @CheckForNull AvlNode<E> current = firstNode();
      @CheckForNull Entry<E> prevEntry;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
     * the elem field without a null check by calling getElement().
     */
    @CheckForNull private final E elem;

    // elemCount is 0 iff this node has been deleted.
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractTransformFuture.java`
#### Snippet
```java
   */
  @CheckForNull ListenableFuture<? extends I> inputFuture;
  @CheckForNull F function;

  AbstractTransformFuture(ListenableFuture<? extends I> inputFuture, F function) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AbstractTransformFuture.java`
#### Snippet
```java
   * triggered by cancel(). For details, see the comments on the fields of TimeoutFuture.
   */
  @CheckForNull ListenableFuture<? extends I> inputFuture;
  @CheckForNull F function;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/MapIteratorCache.java`
#### Snippet
```java
   * concurrently. For more information, see AbstractNetworkTest.concurrentIteration.
   */
  @CheckForNull private transient volatile Entry<K, V> cacheEntry;

  MapIteratorCache(Map<K, V> backingMap) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableListMultimap.java`
#### Snippet
```java
  }

  @LazyInit @RetainedWith @CheckForNull private transient ImmutableListMultimap<V, K> inverse;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CompactLinkedHashMap.java`
#### Snippet
```java
   * and a node with "next" pointer equal to {@code ENDPOINT} is the last node.
   */
  @CheckForNull @VisibleForTesting transient long[] links;

  /** Pointer to the first node in the linked list, or {@code ENDPOINT} if there are no entries. */
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
  }

  @CheckForNull transient Set<Entry<K, V>> entrySet;

  @Override
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      extends AbstractStrongKeyEntry<K, V, StrongKeyStrongValueEntry<K, V>>
      implements StrongValueEntry<K, V, StrongKeyStrongValueEntry<K, V>> {
    @CheckForNull private volatile V value = null;

    private StrongKeyStrongValueEntry(K key, int hash) {
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

    @Override
    public Iterator<V> iterator() {
      return new ValueIterator();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(T[] a) {
      return toArrayList(this).toArray(a);
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

    /** The per-segment table. */
    @CheckForNull volatile AtomicReferenceArray<E> table;

    /**
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    @CheckForNull E nextEntry;
    @CheckForNull WriteThroughEntry nextExternal;
    @CheckForNull WriteThroughEntry lastReturned;

    HashIterator() {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
  }

  @CheckForNull transient Collection<V> values;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
  }

  @CheckForNull transient Set<K> keySet;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      extends AbstractWeakKeyEntry<K, V, WeakKeyStrongValueEntry<K, V>>
      implements StrongValueEntry<K, V, WeakKeyStrongValueEntry<K, V>> {
    @CheckForNull private volatile V value = null;

    private WeakKeyStrongValueEntry(ReferenceQueue<K> queue, K key, int hash) {
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

    @Override
    public Iterator<Entry<K, V>> iterator() {
      return new EntryIterator();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

    @Override
    public Object[] toArray() {
      return toArrayList(this).toArray();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

    @Override
    public Iterator<K> iterator() {
      return new KeyIterator();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

    @Override
    protected ConcurrentMap<K, V> delegate() {
      return delegate;
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    @CheckForNull AtomicReferenceArray<E> currentTable;
    @CheckForNull E nextEntry;
    @CheckForNull WriteThroughEntry nextExternal;
    @CheckForNull WriteThroughEntry lastReturned;

```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
    private volatile Supplier<T> delegate;
    // "value" does not need to be volatile; visibility piggy-backs on volatile read of "delegate".
    @CheckForNull private T value;

    NonSerializableMemoizingSupplier(Supplier<T> delegate) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/Suppliers.java`
#### Snippet
```java
    // "value" does not need to be volatile; visibility piggy-backs
    // on volatile read of "initialized".
    @CheckForNull transient T value;

    MemoizingSupplier(Supplier<T> delegate) {
```

### NullableProblems
Overridden method parameters are not annotated
in `guava/src/com/google/common/collect/ForwardingSortedMap.java`
#### Snippet
```java
   */
  @Beta
  protected SortedMap<K, V> standardSubMap(K fromKey, K toKey) {
    checkArgument(unsafeCompare(comparator(), fromKey, toKey) <= 0, "fromKey must be <= toKey");
    return tailMap(fromKey).headMap(toKey);
```

### NullableProblems
Overridden method parameters are not annotated
in `guava/src/com/google/common/collect/ForwardingSortedMap.java`
#### Snippet
```java
   */
  @Beta
  protected SortedMap<K, V> standardSubMap(K fromKey, K toKey) {
    checkArgument(unsafeCompare(comparator(), fromKey, toKey) <= 0, "fromKey must be <= toKey");
    return tailMap(fromKey).headMap(toKey);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
  }

  @CheckForNull private transient ColumnMap columnMap;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
  private class CellIterator implements Iterator<Cell<R, C, V>> {
    final Iterator<Entry<R, Map<C, V>>> rowIterator = backingMap.entrySet().iterator();
    @CheckForNull Entry<R, Map<C, V>> rowEntry;
    Iterator<Entry<C, V>> columnIterator = Iterators.emptyModifiableIterator();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
  }

  @CheckForNull private transient Set<C> columnKeySet;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
    }

    @CheckForNull Map<C, V> backingRowMap;

    final void updateBackingRowMapField() {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
  }

  @CheckForNull private transient Map<R, Map<C, V>> rowMap;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java

  /** Table of cells. When non-null, size is a power of 2. */
  @CheckForNull transient volatile Cell[] cells;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/MinMaxPriorityQueue.java`
#### Snippet
```java
    @CheckForNull private Queue<E> forgetMeNot;
    @CheckForNull private List<E> skipMe;
    @CheckForNull private E lastFromForgetMeNot;
    private boolean canRemove;

```

### NullableProblems
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

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    }

    @CheckForNull transient NavigableMap<K, V> descendingMap;

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
      extends SynchronizedMap<K, Collection<V>> {
    @CheckForNull transient Set<Map.Entry<K, Collection<V>>> asMapEntrySet;
    @CheckForNull transient Collection<Collection<V>> asMapValues;

    SynchronizedAsMap(Map<K, Collection<V>> delegate, @CheckForNull Object mutex) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    @CheckForNull transient Set<K> keySet;
    @CheckForNull transient Collection<V> values;
    @CheckForNull transient Set<Map.Entry<K, V>> entrySet;

    SynchronizedMap(Map<K, V> delegate, @CheckForNull Object mutex) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
      extends SynchronizedMap<K, V> implements BiMap<K, V>, Serializable {
    @CheckForNull private transient Set<V> valueSet;
    @RetainedWith @CheckForNull private transient BiMap<V, K> inverse;

    private SynchronizedBiMap(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
      extends SynchronizedObject implements Map<K, V> {
    @CheckForNull transient Set<K> keySet;
    @CheckForNull transient Collection<V> values;
    @CheckForNull transient Set<Map.Entry<K, V>> entrySet;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
      extends SynchronizedCollection<E> implements Multiset<E> {
    @CheckForNull transient Set<E> elementSet;
    @CheckForNull transient Set<Multiset.Entry<E>> entrySet;

    SynchronizedMultiset(Multiset<E> delegate, @CheckForNull Object mutex) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
          K extends @Nullable Object, V extends @Nullable Object>
      extends SynchronizedMultimap<K, V> implements SetMultimap<K, V> {
    @CheckForNull transient Set<Map.Entry<K, V>> entrySet;

    SynchronizedSetMultimap(SetMultimap<K, V> delegate, @CheckForNull Object mutex) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    }

    @CheckForNull transient NavigableSet<K> descendingKeySet;

    @Override
```

### NullableProblems
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

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
  static class SynchronizedBiMap<K extends @Nullable Object, V extends @Nullable Object>
      extends SynchronizedMap<K, V> implements BiMap<K, V>, Serializable {
    @CheckForNull private transient Set<V> valueSet;
    @RetainedWith @CheckForNull private transient BiMap<V, K> inverse;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    @CheckForNull transient Collection<V> valuesCollection;
    @CheckForNull transient Collection<Map.Entry<K, V>> entries;
    @CheckForNull transient Map<K, Collection<V>> asMap;
    @CheckForNull transient Multiset<K> keys;

```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    @CheckForNull transient Collection<Map.Entry<K, V>> entries;
    @CheckForNull transient Map<K, Collection<V>> asMap;
    @CheckForNull transient Multiset<K> keys;

    @SuppressWarnings("unchecked")
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
  private static class SynchronizedMultiset<E extends @Nullable Object>
      extends SynchronizedCollection<E> implements Multiset<E> {
    @CheckForNull transient Set<E> elementSet;
    @CheckForNull transient Set<Multiset.Entry<E>> entrySet;

```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    }

    @CheckForNull transient NavigableSet<K> navigableKeySet;

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    }

    @CheckForNull transient NavigableSet<E> descendingSet;

    @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
  private static class SynchronizedAsMap<K extends @Nullable Object, V extends @Nullable Object>
      extends SynchronizedMap<K, Collection<V>> {
    @CheckForNull transient Set<Map.Entry<K, Collection<V>>> asMapEntrySet;
    @CheckForNull transient Collection<Collection<V>> asMapValues;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java

  @CheckForNull RemovalListener<? super K, ? super V> removalListener;
  @CheckForNull Ticker ticker;

  Supplier<? extends StatsCounter> statsCounterSupplier = NULL_STATS_COUNTER;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
  @CheckForNull Equivalence<Object> valueEquivalence;

  @CheckForNull RemovalListener<? super K, ? super V> removalListener;
  @CheckForNull Ticker ticker;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java

  @CheckForNull Strength keyStrength;
  @CheckForNull Strength valueStrength;

  @SuppressWarnings("GoodTime") // should be a java.time.Duration
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
  @CheckForNull Weigher<? super K, ? super V> weigher;

  @CheckForNull Strength keyStrength;
  @CheckForNull Strength valueStrength;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
  long maximumSize = UNSET_INT;
  long maximumWeight = UNSET_INT;
  @CheckForNull Weigher<? super K, ? super V> weigher;

  @CheckForNull Strength keyStrength;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
  long refreshNanos = UNSET_INT;

  @CheckForNull Equivalence<Object> keyEquivalence;
  @CheckForNull Equivalence<Object> valueEquivalence;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java

  @CheckForNull Equivalence<Object> keyEquivalence;
  @CheckForNull Equivalence<Object> valueEquivalence;

  @CheckForNull RemovalListener<? super K, ? super V> removalListener;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AggregateFutureState.java`
#### Snippet
```java
  // Lazily initialized the first time we see an exception; not released until all the input futures
  // have completed and we have processed them all.
  @CheckForNull private volatile Set<Throwable> seenExceptions = null;

  private volatile int remaining;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableTable.java`
#### Snippet
```java
  public static final class Builder<R, C, V> {
    private final List<Cell<R, C, V>> cells = Lists.newArrayList();
    @CheckForNull private Comparator<? super R> rowComparator;
    @CheckForNull private Comparator<? super C> columnComparator;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableTable.java`
#### Snippet
```java
    private final List<Cell<R, C, V>> cells = Lists.newArrayList();
    @CheckForNull private Comparator<? super R> rowComparator;
    @CheckForNull private Comparator<? super C> columnComparator;

    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ForwardingNavigableMap.java`
#### Snippet
```java
    protected Iterator<Entry<K, V>> entryIterator() {
      return new Iterator<Entry<K, V>>() {
        @CheckForNull private Entry<K, V> toRemove = null;
        @CheckForNull private Entry<K, V> nextOrNull = forward().lastEntry();

```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `guava/src/com/google/common/collect/ForwardingNavigableMap.java`
#### Snippet
```java
  @Override
  protected SortedMap<K, V> standardSubMap(
      @ParametricNullness K fromKey, @ParametricNullness K toKey) {
    return subMap(fromKey, true, toKey, false);
  }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `guava/src/com/google/common/collect/ForwardingNavigableMap.java`
#### Snippet
```java
  @Override
  protected SortedMap<K, V> standardSubMap(
      @ParametricNullness K fromKey, @ParametricNullness K toKey) {
    return subMap(fromKey, true, toKey, false);
  }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ForwardingNavigableMap.java`
#### Snippet
```java
      return new Iterator<Entry<K, V>>() {
        @CheckForNull private Entry<K, V> toRemove = null;
        @CheckForNull private Entry<K, V> nextOrNull = forward().lastEntry();

        @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ExecutionList.java`
#### Snippet
```java
    final Runnable runnable;
    final Executor executor;
    @CheckForNull RunnableExecutorPair next;

    RunnableExecutorPair(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/ExecutionList.java`
#### Snippet
```java
   */
  @GuardedBy("this")
  @CheckForNull
  private RunnableExecutorPair runnables;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/AtomicLongMap.java`
#### Snippet
```java
  }

  @CheckForNull private transient Map<K, Long> asMap;

  /** Returns a live, read-only view of the map backing this {@code AtomicLongMap}. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/ElementOrder.java`
#### Snippet
```java

  @SuppressWarnings("Immutable") // Hopefully the comparator provided is immutable!
  @CheckForNull
  private final Comparator<T> comparator;

```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
  }

  @CheckForNull private transient Node<K, V> head; // the head for all keys
  @CheckForNull private transient Node<K, V> tail; // the tail for all keys
  private transient Map<K, KeyList<K, V>> keyToKeyList;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
    @CheckForNull Node<K, V> previous; // the previous node (with any key)
    @CheckForNull Node<K, V> nextSibling; // the next node with the same key
    @CheckForNull Node<K, V> previousSibling; // the previous node with the same key

    Node(@ParametricNullness K key, @ParametricNullness V value) {
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
    int nextIndex;
    @CheckForNull Node<K, V> next;
    @CheckForNull Node<K, V> current;
    @CheckForNull Node<K, V> previous;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
    @CheckForNull Node<K, V> next;
    @CheckForNull Node<K, V> current;
    @CheckForNull Node<K, V> previous;
    int expectedModCount = modCount;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java

  @CheckForNull private transient Node<K, V> head; // the head for all keys
  @CheckForNull private transient Node<K, V> tail; // the tail for all keys
  private transient Map<K, KeyList<K, V>> keyToKeyList;
  private transient int size;
```

### NullableProblems
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

### NullableProblems
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

### NullableProblems
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

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
    final Set<K> seenKeys = Sets.<K>newHashSetWithExpectedSize(keySet().size());
    @CheckForNull Node<K, V> next = head;
    @CheckForNull Node<K, V> current;
    int expectedModCount = modCount;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
    @CheckForNull Node<K, V> next; // the next node (with any key)
    @CheckForNull Node<K, V> previous; // the previous node (with any key)
    @CheckForNull Node<K, V> nextSibling; // the next node with the same key
    @CheckForNull Node<K, V> previousSibling; // the previous node with the same key

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
    @CheckForNull Node<K, V> next;
    @CheckForNull Node<K, V> current;
    @CheckForNull Node<K, V> previous;

    /** Constructs a new iterator over all values for the specified key. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/EndpointPairIterator.java`
#### Snippet
```java
  private final Iterator<N> nodeIterator;

  @CheckForNull
  N node = null; // null is safe as an initial value because graphs don't allow null nodes

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/graph/EndpointPairIterator.java`
#### Snippet
```java
  private static final class Undirected<N> extends EndpointPairIterator<N> {
    // It's a little weird that we add `null` to this set, but it makes for slightly simpler code.
    @CheckForNull private Set<@Nullable N> visitedNodes;

    private Undirected(BaseGraph<N> graph) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/Closer.java`
#### Snippet
```java
  // only need space for 2 elements in most cases, so try to use the smallest array possible
  private final Deque<Closeable> stack = new ArrayDeque<>(4);
  @CheckForNull private Throwable thrown;

  @VisibleForTesting
```

### NullableProblems
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

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
  }

  @LazyInit @RetainedWith @CheckForNull private transient ImmutableCollection<V> values;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
  }

  @LazyInit @RetainedWith @CheckForNull private transient ImmutableSet<Entry<K, V>> entrySet;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java

  // cached so that this.multimapView().inverse() only computes inverse once
  @LazyInit @CheckForNull private transient ImmutableSetMultimap<K, V> multimapView;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
  abstract ImmutableSet<Entry<K, V>> createEntrySet();

  @LazyInit @RetainedWith @CheckForNull private transient ImmutableSet<K> keySet;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java
  }

  @CheckForNull private transient Set<V> valueSet;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java
    final Iterator<Entry<K, V>> iterator = delegate.entrySet().iterator();
    return new Iterator<Entry<K, V>>() {
      @CheckForNull Entry<K, V> entry;

      @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java
  }

  @CheckForNull private transient Set<Entry<K, V>> entrySet;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java
  }

  @CheckForNull private transient Set<K> keySet;

  @Override
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
    @Weak @CheckForNull BiEntry<K, V> nextInVToKBucket;

    @Weak @CheckForNull BiEntry<K, V> nextInKeyInsertionOrder;
    @Weak @CheckForNull BiEntry<K, V> prevInKeyInsertionOrder;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java

    @Weak @CheckForNull BiEntry<K, V> nextInKeyInsertionOrder;
    @Weak @CheckForNull BiEntry<K, V> prevInKeyInsertionOrder;

    BiEntry(@ParametricNullness K key, int keyHash, @ParametricNullness V value, int valueHash) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java

  abstract class Itr<T extends @Nullable Object> implements Iterator<T> {
    @CheckForNull BiEntry<K, V> next = firstInKeyInsertionOrder;
    @CheckForNull BiEntry<K, V> toRemove = null;
    int expectedModCount = modCount;
```

### NullableProblems
Non-annotated parameter 'm' in method 'putAll' from 'AbstractMap' should not override non-null parameter from 'BiMap'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java

  private final class Inverse extends IteratorBasedAbstractMap<V, K>
      implements BiMap<V, K>, Serializable {
    BiMap<K, V> forward() {
      return HashBiMap.this;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
  }

  @LazyInit @RetainedWith @CheckForNull private transient BiMap<V, K> inverse;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
    // which would cause memory leaks when non-empty HashBiMap with cyclic BiEntry
    // instances is deallocated.
    @CheckForNull BiEntry<K, V> nextInKToVBucket;
    @Weak @CheckForNull BiEntry<K, V> nextInVToKBucket;

```

### NullableProblems
Non-annotated parameter 'm' in method 'putAll' from 'AbstractMap' should not override non-null parameter from 'BiMap'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
@ElementTypesAreNonnullByDefault
public final class HashBiMap<K extends @Nullable Object, V extends @Nullable Object>
    extends IteratorBasedAbstractMap<K, V> implements BiMap<K, V>, Serializable {

  /** Returns a new, empty {@code HashBiMap} with the default initial capacity (16). */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java

  @Weak @CheckForNull private transient BiEntry<K, V> firstInKeyInsertionOrder;
  @Weak @CheckForNull private transient BiEntry<K, V> lastInKeyInsertionOrder;
  private transient int size;
  private transient int mask;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
  private transient @Nullable BiEntry<K, V>[] hashTableVToK;

  @Weak @CheckForNull private transient BiEntry<K, V> firstInKeyInsertionOrder;
  @Weak @CheckForNull private transient BiEntry<K, V> lastInKeyInsertionOrder;
  private transient int size;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
    // instances is deallocated.
    @CheckForNull BiEntry<K, V> nextInKToVBucket;
    @Weak @CheckForNull BiEntry<K, V> nextInVToKBucket;

    @Weak @CheckForNull BiEntry<K, V> nextInKeyInsertionOrder;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/FileBackedOutputStream.java`
#### Snippet
```java
  private final boolean resetOnFinalize;
  private final ByteSource source;
  @CheckForNull private final File parentDirectory;

  @GuardedBy("this")
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/FileBackedOutputStream.java`
#### Snippet
```java

  @GuardedBy("this")
  @CheckForNull
  private File file;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/io/FileBackedOutputStream.java`
#### Snippet
```java

  @GuardedBy("this")
  @CheckForNull
  private MemoryOutput memory;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CollectSpliterators.java`
#### Snippet
```java
    checkNotNull(predicate);
    class Splitr implements Spliterator<T>, Consumer<T> {
      @CheckForNull T holder = null;

      @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CollectSpliterators.java`
#### Snippet
```java
    }

    @Weak @CheckForNull OutSpliteratorT prefix;
    final Spliterator<InElementT> from;
    final Function<? super InElementT, OutSpliteratorT> function;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/util/concurrent/CollectionFuture.java`
#### Snippet
```java
   * harmless, rather than just 99.99% harmless.
   */
  @CheckForNull private List<@Nullable Present<V>> values;

  CollectionFuture(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
  private final transient RegularImmutableSortedSet<K> keySet;
  private final transient ImmutableList<V> valueList;
  @CheckForNull private transient ImmutableSortedMap<K, V> descendingMap;

  ImmutableSortedMap(RegularImmutableSortedSet<K> keySet, ImmutableList<V> valueList) {
```

### NullableProblems
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

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
    class OptionalState {
      boolean set = false;
      @CheckForNull T value = null;

      void set(T value) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
    }
    class Splitr extends MapWithIndexSpliterator<Spliterator<T>, R, Splitr> implements Consumer<T> {
      @CheckForNull T holder;

      Splitr(Spliterator<T> splitr, long index) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/Throwables.java`
#### Snippet
```java
  @J2ktIncompatible
  @GwtIncompatible // java.lang.reflect
  @CheckForNull
  private static final Method getStackTraceDepthMethod = (jla == null) ? null : getSizeMethod(jla);

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/Throwables.java`
#### Snippet
```java
  @J2ktIncompatible
  @GwtIncompatible // java.lang.reflect
  @CheckForNull
  private static final Method getStackTraceElementMethod = (jla == null) ? null : getGetMethod();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/base/Throwables.java`
#### Snippet
```java
  @J2ktIncompatible
  @GwtIncompatible // java.lang.reflect
  @CheckForNull
  private static final Object jla = getJLA();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
  private static class ConcatenatedIterator<T extends @Nullable Object> implements Iterator<T> {
    /* The last iterator to return an element.  Calls to remove() go to this iterator. */
    @CheckForNull private Iterator<? extends T> toRemove;

    /* The iterator currently returning elements. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
    private final Iterator<? extends E> iterator;
    private boolean hasPeeked;
    @CheckForNull private E peekedElement;

    public PeekingImpl(Iterator<? extends E> iterator) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
     */

    @CheckForNull private Iterator<? extends Iterator<? extends T>> topMetaIterator;

    // Only becomes nonnull if we encounter nested concatenations.
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java

    // Only becomes nonnull if we encounter nested concatenations.
    @CheckForNull private Deque<Iterator<? extends Iterator<? extends T>>> metaIterators;

    ConcatenatedIterator(Iterator<? extends Iterator<? extends T>> metaIterator) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CollectCollectors.java`
#### Snippet
```java
  private static class EnumMapAccumulator<K extends Enum<K>, V> {
    private final BinaryOperator<V> mergeFunction;
    @CheckForNull private EnumMap<K, V> map = null;

    EnumMapAccumulator(BinaryOperator<V> mergeFunction) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.CheckForNull'
in `guava/src/com/google/common/collect/CollectCollectors.java`
#### Snippet
```java
        (Collector) toImmutableEnumSetGeneric();

    @CheckForNull private EnumSet<E> set;

    void add(E e) {
```

## RuleId[id=NegativeIntConstantInLongContext]
### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `guava/src/com/google/common/collect/Hashing.java`
#### Snippet
```java
   */
  static int smear(int hashCode) {
    return (int) (C2 * Integer.rotateLeft((int) (hashCode * C1), 15));
  }

```

### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `guava/src/com/google/common/collect/Hashing.java`
#### Snippet
```java
   * enough precision.
   */
  private static final long C1 = 0xcc9e2d51;
  private static final long C2 = 0x1b873593;

```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `guava/src/com/google/common/hash/BloomFilter.java`
#### Snippet
```java
   * expected insertions, the required false positive probability.
   *
   * <p>See http://en.wikipedia.org/wiki/Bloom_filter#Probability_of_false_positives for the
   * formula.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `guava/src/com/google/common/hash/BloomFilter.java`
#### Snippet
```java
   * expected insertions and total number of bits in the Bloom filter.
   *
   * <p>See http://en.wikipedia.org/wiki/File:Bloom_filter_fp_probability.svg for the formula.
   *
   * @param n expected insertions (must be positive)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `guava/src/com/google/common/collect/ImmutableSet.java`
#### Snippet
```java
     * <p>Note that for a RegularImmutableSet with elements with truly random hash codes, contains
     * operations take expected O(1) time but with high probability take O(log n) for at least some
     * element. (https://en.wikipedia.org/wiki/Linear_probing#Analysis)
     *
     * <p>This method may return {@code true} even on truly random input, but {@code
```

### JavadocLinkAsPlainText
Link specified as plain text
in `guava/src/com/google/common/io/Java8Compatibility.java`
#### Snippet
```java
/**
 * Wrappers around {@link Buffer} methods that are covariantly overridden in Java 9+. See
 * https://github.com/google/guava/issues/3990
 */
@J2ktIncompatible
```

### JavadocLinkAsPlainText
Link specified as plain text
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
  }

  /** Used to avoid http://bugs.sun.com/view_bug.do?bug_id=6558557 */
  static <T extends @Nullable Object> Multiset<T> cast(Iterable<T> iterable) {
    return (Multiset<T>) iterable;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `guava/src/com/google/common/collect/Lists.java`
#### Snippet
```java
  }

  /** Used to avoid http://bugs.sun.com/view_bug.do?bug_id=6558557 */
  static <T extends @Nullable Object> List<T> cast(Iterable<T> iterable) {
    return (List<T>) iterable;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `guava/src/com/google/common/hash/Java8Compatibility.java`
#### Snippet
```java
/**
 * Wrappers around {@link Buffer} methods that are covariantly overridden in Java 9+. See
 * https://github.com/google/guava/issues/3990
 */
@GwtIncompatible
```

### JavadocLinkAsPlainText
Link specified as plain text
in `guava/src/com/google/common/base/Java8Compatibility.java`
#### Snippet
```java
/**
 * Wrappers around {@link Buffer} methods that are covariantly overridden in Java 9+. See
 * https://github.com/google/guava/issues/3990
 */
@J2ktIncompatible
```

### JavadocLinkAsPlainText
Link specified as plain text
in `guava/src/com/google/common/hash/Hashing.java`
#### Snippet
```java
  /**
   * Linear CongruentialGenerator to use for consistent hashing. See
   * http://en.wikipedia.org/wiki/Linear_congruential_generator
   */
  private static final class LinearCongruentialGenerator {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
  }

  /** Used to avoid http://bugs.sun.com/view_bug.do?bug_id=6558557 */
  static <T extends @Nullable Object> ListIterator<T> cast(Iterator<T> iterator) {
    return (ListIterator<T>) iterator;
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `guava/src/com/google/common/base/MoreObjects.java`
#### Snippet
```java
    private ValueHolder holderTail = holderHead;
    private boolean omitNullValues = false;
    private boolean omitEmptyValues = false;

    /** Use {@link MoreObjects#toStringHelper(Object)} to create an instance. */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `guava/src/com/google/common/util/concurrent/Striped.java`
#### Snippet
```java

    @SuppressWarnings("unused")
    private final WeakSafeReadWriteLock strongReference;

    WeakSafeCondition(Condition delegate, WeakSafeReadWriteLock strongReference) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
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

### IgnoreResultOfCall
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

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `guava/src/com/google/common/util/concurrent/MoreExecutors.java`
#### Snippet
```java
        service.shutdownNow();
        // Wait the other half of the timeout for tasks to respond to being cancelled
        service.awaitTermination(halfTimeoutNanos, TimeUnit.NANOSECONDS);
      }
    } catch (InterruptedException ie) {
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `guava/src/com/google/common/util/concurrent/MoreExecutors.java`
#### Snippet
```java
                    // own. See Cleaner class inside {@link LogManager}.
                    service.shutdown();
                    service.awaitTermination(terminationTimeout, timeUnit);
                  } catch (InterruptedException ignored) {
                    // We're shutting down anyway, so just ignore.
```

### IgnoreResultOfCall
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

### IgnoreResultOfCall
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

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `writeReplace()` is identical to its super method
in `guava/src/com/google/common/collect/ImmutableList.java`
#### Snippet
```java
  @Override
  @J2ktIncompatible // serialization
  Object writeReplace() {
    return new SerializedForm(toArray());
  }
```

### RedundantMethodOverride
Method `markSupported()` is identical to its super method
in `guava/src/com/google/common/io/MultiInputStream.java`
#### Snippet
```java

  @Override
  public boolean markSupported() {
    return false;
  }
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
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

## RuleId[id=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
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

## RuleId[id=OptionalAssignedToNull]
### OptionalAssignedToNull
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

### OptionalAssignedToNull
Optional value is compared with null
in `guava/src/com/google/common/base/Optional.java`
#### Snippet
```java
  @CheckForNull
  public static <T> java.util.Optional<T> toJavaUtil(@CheckForNull Optional<T> googleOptional) {
    return googleOptional == null ? null : googleOptional.toJavaUtil();
  }

```

### OptionalAssignedToNull
Null is used for 'Optional' type in return statement
in `guava/src/com/google/common/base/Optional.java`
#### Snippet
```java
  @CheckForNull
  public static <T> java.util.Optional<T> toJavaUtil(@CheckForNull Optional<T> googleOptional) {
    return googleOptional == null ? null : googleOptional.toJavaUtil();
  }

```

### OptionalAssignedToNull
Optional value is compared with null
in `guava/src/com/google/common/base/Optional.java`
#### Snippet
```java
  @CheckForNull
  public static <T> Optional<T> fromJavaUtil(@CheckForNull java.util.Optional<T> javaUtilOptional) {
    return (javaUtilOptional == null) ? null : fromNullable(javaUtilOptional.orElse(null));
  }

```

### OptionalAssignedToNull
Null is used for 'Optional' type in return statement
in `guava/src/com/google/common/base/Optional.java`
#### Snippet
```java
  @CheckForNull
  public static <T> Optional<T> fromJavaUtil(@CheckForNull java.util.Optional<T> javaUtilOptional) {
    return (javaUtilOptional == null) ? null : fromNullable(javaUtilOptional.orElse(null));
  }

```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
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

### IfStatementWithIdenticalBranches
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

### IfStatementWithIdenticalBranches
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

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
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

### PointlessBitwiseExpression
`~~hash` can be replaced with 'hash'
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
        hash = 31 * hash + (size() / axis.size() * axis.hashCode());

        hash = ~~hash;
      }
      hash += adjust;
```

### PointlessBitwiseExpression
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

### PointlessBitwiseExpression
`~~hashCode` can be replaced with 'hashCode'
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
      hashCode += o != null ? o.hashCode() : 0;

      hashCode = ~~hashCode;
      // Needed to deal with unusual integer overflow in GWT.
    }
```

### PointlessBitwiseExpression
`~~(x - y)` can be replaced with '(x - y)'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    // The double negation is optimized away by normal Java, but is necessary for GWT
    // to make sure bit twiddling works as expected.
    return ~~(x - y) >>> (Integer.SIZE - 1);
  }

```

### PointlessBitwiseExpression
`~~hashCode` can be replaced with 'hashCode'
in `guava/src/com/google/common/collect/ImmutableList.java`
#### Snippet
```java
      hashCode = 31 * hashCode + get(i).hashCode();

      hashCode = ~~hashCode;
      // needed to deal with GWT integer overflow
    }
```

### PointlessBitwiseExpression
`~~(x - y)` can be replaced with '(x - y)'
in `guava/src/com/google/common/math/LongMath.java`
#### Snippet
```java
  static int lessThanBranchFree(long x, long y) {
    // Returns the sign bit of x - y.
    return (int) (~~(x - y) >>> (Long.SIZE - 1));
  }

```

### PointlessBitwiseExpression
`value & 0xffffffff` can be replaced with 'value'
in `guava/src/com/google/common/primitives/UnsignedInteger.java`
#### Snippet
```java
  private UnsignedInteger(int value) {
    // GWT doesn't consistently overflow values to make them 32-bit, so we need to force it.
    this.value = value & 0xffffffff;
  }

```

### PointlessBitwiseExpression
`~~hashCode` can be replaced with 'hashCode'
in `guava/src/com/google/common/collect/Lists.java`
#### Snippet
```java
      hashCode = 31 * hashCode + (o == null ? 0 : o.hashCode());

      hashCode = ~~hashCode;
      // needed to deal with GWT integer overflow
    }
```

### PointlessBitwiseExpression
`~(stride - 1)` can be replaced with '-stride'
in `guava/src/com/google/common/primitives/UnsignedBytes.java`
#### Snippet
```java
        int stride = 8;
        int minLength = Math.min(left.length, right.length);
        int strideLimit = minLength & ~(stride - 1);
        int i;

```

### PointlessBitwiseExpression
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

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'isActuallyE()' call
in `guava/src/com/google/common/collect/EnumMultiset.java`
#### Snippet
```java
  public int count(@CheckForNull Object element) {
    // isActuallyE checks for null, but we check explicitly to help nullness checkers.
    if (element == null || !isActuallyE(element)) {
      return 0;
    }
```

### PointlessNullCheck
Unnecessary 'null' check before 'isActuallyE()' call
in `guava/src/com/google/common/collect/EnumMultiset.java`
#### Snippet
```java
  public int remove(@CheckForNull Object element, int occurrences) {
    // isActuallyE checks for null, but we check explicitly to help nullness checkers.
    if (element == null || !isActuallyE(element)) {
      return 0;
    }
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
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

### NullArgumentToVariableArgMethod
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

### NullArgumentToVariableArgMethod
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

### NullArgumentToVariableArgMethod
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

### NullArgumentToVariableArgMethod
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

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java

    // "extends Object" works around https://github.com/typetools/checker-framework/issues/3013
    SerializedForm(Multiset<? extends Object> multiset) {
      int distinct = multiset.entrySet().size();
      elements = new Object[distinct];
```

### TypeParameterExtendsObject
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

### TypeParameterExtendsObject
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

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `guava/src/com/google/common/collect/TreeRangeMap.java`
#### Snippet
```java

        @Override
        public void putAll(RangeMap<Comparable<?>, ? extends Object> rangeMap) {
          if (!rangeMap.asMapOfRanges().isEmpty()) {
            throw new IllegalArgumentException(
```

### TypeParameterExtendsObject
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

### TypeParameterExtendsObject
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

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `guava/src/com/google/common/cache/Cache.java`
#### Snippet
```java
   * differ: <? extends Object> means "non-null types," while <?> means "all types."
   */
  ImmutableMap<K, V> getAllPresent(Iterable<? extends Object> keys);

  /**
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `guava/src/com/google/common/cache/Cache.java`
#### Snippet
```java
   */
  // For discussion of <? extends Object>, see getAllPresent.
  void invalidateAll(Iterable<? extends Object> keys);

  /** Discards all entries in the cache. */
```

### TypeParameterExtendsObject
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

### TypeParameterExtendsObject
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

### TypeParameterExtendsObject
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

### TypeParameterExtendsObject
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

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `valueSetCapacity` initializer `DEFAULT_VALUE_SET_CAPACITY` is redundant
in `guava/src/com/google/common/collect/LinkedHashMultimap.java`
#### Snippet
```java
  @VisibleForTesting static final double VALUE_SET_LOAD_FACTOR = 1.0;

  @VisibleForTesting transient int valueSetCapacity = DEFAULT_VALUE_SET_CAPACITY;
  private transient ValueEntry<K, V> multimapHeaderEntry;

```

### UnusedAssignment
Variable `addressAsLong` initializer `0` is redundant
in `guava/src/com/google/common/net/InetAddresses.java`
#### Snippet
```java

    Inet6Address ip6 = (Inet6Address) ip;
    long addressAsLong = 0;
    if (hasEmbeddedIPv4ClientAddress(ip6)) {
      addressAsLong = getEmbeddedIPv4ClientAddress(ip6).hashCode();
```

### UnusedAssignment
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

### UnusedAssignment
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

### UnusedAssignment
Variable `newCount` initializer `this.count - 1` is redundant
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        preWriteCleanup(now);

        int newCount = this.count - 1;
        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
```

### UnusedAssignment
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

### UnusedAssignment
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

### UnusedAssignment
The value `this.count + 1` assigned to `newCount` is never used
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        if (newCount > this.threshold) { // ensure capacity
          expand();
          newCount = this.count + 1;
        }

```

### UnusedAssignment
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

### UnusedAssignment
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

### UnusedAssignment
Variable `newCount` initializer `this.count - 1` is redundant
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        preWriteCleanup(now);

        int newCount = this.count - 1;
        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
```

### UnusedAssignment
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

### UnusedAssignment
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

### UnusedAssignment
Variable `unsafe` initializer `null` is redundant
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java

    static {
      sun.misc.Unsafe unsafe = null;
      try {
        unsafe = sun.misc.Unsafe.getUnsafe();
```

### UnusedAssignment
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

### UnusedAssignment
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

### UnusedAssignment
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

### UnusedAssignment
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

### UnusedAssignment
Variable `newCount` initializer `this.count - 1` is redundant
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        preWriteCleanup();

        int newCount = this.count - 1;
        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
```

### UnusedAssignment
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

### UnusedAssignment
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

### UnusedAssignment
Variable `newCount` initializer `this.count - 1` is redundant
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        preWriteCleanup();

        int newCount = this.count - 1;
        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
```

### UnusedAssignment
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

### UnusedAssignment
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

### UnusedAssignment
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

## RuleId[id=ConstantValue]
### ConstantValue
Condition `AnnotatedElement.class.isAssignableFrom(TypeVariable.class)` is always `true`
in `guava/src/com/google/common/reflect/Types.java`
#### Snippet
```java

    static {
      if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
        if (new TypeCapture<Entry<String, int[][]>>() {}.capture()
            .toString()
```

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
Condition `cmp > 0` is always `true`
in `guava/src/com/google/common/collect/RegularImmutableSortedSet.java`
#### Snippet
```java
          target = thatIterator.next();

        } else if (cmp > 0) {
          return false;
        }
```

### ConstantValue
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

### ConstantValue
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

### ConstantValue
Condition `oldValue == null` is always `false`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    public LoadingValueReference(ValueReference<K, V> oldValue) {
      this.oldValue = (oldValue == null) ? LocalCache.unset() : oldValue;
    }

```

### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

### ConstantValue
Condition `result == null` is always `false`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    }

    if (result == null) {
      globalStatsCounter.recordLoadException(stopwatch.elapsed(NANOSECONDS));
      throw new InvalidCacheLoadException(loader + " returned null map from loadAll");
```

### ConstantValue
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

### ConstantValue
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

### ConstantValue
Value `key` is always 'null'
in `guava/src/com/google/common/collect/TreeMultimap.java`
#### Snippet
```java
  Collection<V> createCollection(@ParametricNullness K key) {
    if (key == null) {
      int unused = keyComparator().compare(key, key);
    }
    return super.createCollection(key);
```

### ConstantValue
Value `key` is always 'null'
in `guava/src/com/google/common/collect/TreeMultimap.java`
#### Snippet
```java
  Collection<V> createCollection(@ParametricNullness K key) {
    if (key == null) {
      int unused = keyComparator().compare(key, key);
    }
    return super.createCollection(key);
```

### ConstantValue
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

### ConstantValue
Condition `key == null` is always `false`
in `guava/src/com/google/common/collect/CollectPreconditions.java`
#### Snippet
```java

  static void checkEntryNotNull(Object key, Object value) {
    if (key == null) {
      throw new NullPointerException("null key in entry: null=" + value);
    } else if (value == null) {
```

### ConstantValue
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

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
  @com.google.errorprone.annotations.InlineMeValidationDisabled("Java 9+ API only")
  public static <T> Stream<T> stream(java.util.Optional<T> optional) {
    return optional.isPresent() ? Stream.of(optional.get()) : Stream.empty();
  }

```

## RuleId[id=SuspiciousNameCombination]
### SuspiciousNameCombination
'x' should probably not be passed as parameter 'y'
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
        // floor(2^(logFloor + 0.5))
        int logFloor = (Integer.SIZE - 1) - leadingZeros;
        return logFloor + lessThanBranchFree(cmp, x);

      default:
```

### SuspiciousNameCombination
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

### SuspiciousNameCombination
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

### SuspiciousNameCombination
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

### SuspiciousNameCombination
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

### SuspiciousNameCombination
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

### SuspiciousNameCombination
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

### SuspiciousNameCombination
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

### SuspiciousNameCombination
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

### SuspiciousNameCombination
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

### SuspiciousNameCombination
'x' should probably not be passed as parameter 'yIntercept'
in `guava/src/com/google/common/math/LinearTransformation.java`
#### Snippet
```java

    private LinearTransformation createInverse() {
      return new RegularLinearTransformation(0.0, x, this);
    }
  }
```

### SuspiciousNameCombination
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

### SuspiciousNameCombination
'newTop' should probably not be returned from method 'rotateRight'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
      this.recompute();
      newTop.recomputeHeight();
      return newTop;
    }

```

### SuspiciousNameCombination
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

### SuspiciousNameCombination
'newTop' should probably not be returned from method 'rotateLeft'
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
      this.recompute();
      newTop.recomputeHeight();
      return newTop;
    }

```

## RuleId[id=AtomicFieldUpdaterNotStaticFinal]
### AtomicFieldUpdaterNotStaticFinal
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

### AtomicFieldUpdaterNotStaticFinal
AtomicReferenceFieldUpdater field `valueUpdater` is not declared 'static final'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    final AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater;
    final AtomicReferenceFieldUpdater<AbstractFuture, Listener> listenersUpdater;
    final AtomicReferenceFieldUpdater<AbstractFuture, Object> valueUpdater;

    SafeAtomicHelper(
```

### AtomicFieldUpdaterNotStaticFinal
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

### AtomicFieldUpdaterNotStaticFinal
AtomicReferenceFieldUpdater field `listenersUpdater` is not declared 'static final'
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    final AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater;
    final AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater;
    final AtomicReferenceFieldUpdater<AbstractFuture, Listener> listenersUpdater;
    final AtomicReferenceFieldUpdater<AbstractFuture, Object> valueUpdater;

```

### AtomicFieldUpdaterNotStaticFinal
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

### AtomicFieldUpdaterNotStaticFinal
AtomicIntegerFieldUpdater\> field `remainingCountUpdater` is not declared 'static final'
in `guava/src/com/google/common/util/concurrent/AggregateFutureState.java`
#### Snippet
```java
        seenExceptionsUpdater;

    final AtomicIntegerFieldUpdater<AggregateFutureState<?>> remainingCountUpdater;

    @SuppressWarnings({"rawtypes", "unchecked"}) // Unavoidable with reflection API
```

### AtomicFieldUpdaterNotStaticFinal
AtomicReferenceFieldUpdater, Set\> field `seenExceptionsUpdater` is not declared 'static final'
in `guava/src/com/google/common/util/concurrent/AggregateFutureState.java`
#### Snippet
```java
  private static final class SafeAtomicHelper extends AtomicHelper {
    final AtomicReferenceFieldUpdater<AggregateFutureState<?>, Set<Throwable>>
        seenExceptionsUpdater;

    final AtomicIntegerFieldUpdater<AggregateFutureState<?>> remainingCountUpdater;
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'T\[\]'
in `guava/src/com/google/common/collect/TopKSelector.java`
#### Snippet
```java
    checkArgument(k >= 0, "k (%s) must be >= 0", k);
    checkArgument(k <= Integer.MAX_VALUE / 2, "k (%s) must be <= Integer.MAX_VALUE / 2", k);
    this.buffer = (T[]) new Object[IntMath.checkedMultiply(k, 2)];
    this.bufferSize = 0;
    this.threshold = null;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map.Entry\[\]' to 'java.util.Map.Entry\[\]'
in `guava/src/com/google/common/collect/RegularImmutableBiMap.java`
#### Snippet
```java
  static final RegularImmutableBiMap<Object, Object> EMPTY =
      new RegularImmutableBiMap<>(
          null, null, (Entry<Object, Object>[]) ImmutableMap.EMPTY_ENTRY_ARRAY, 0, 0);

  static final double MAX_LOAD_FACTOR = 1.2;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.SortedSet' to 'com.google.common.collect.Sets.FilteredSet'
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
      // Support clear(), removeAll(), and retainAll() when filtering a filtered
      // collection.
      FilteredSet<E> filtered = (FilteredSet<E>) unfiltered;
      Predicate<E> combinedPredicate = Predicates.<E>and(filtered.predicate, predicate);
      return new FilteredSortedSet<E>((SortedSet<E>) filtered.unfiltered, combinedPredicate);
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/util/concurrent/ClosingFuture.java`
#### Snippet
```java
      ClosingFuture<?>... moreFutures) {
    return whenAllSucceed(
        FluentIterable.of(future1, future2, future3, future4, future5, future6)
            .append(moreFutures));
  }
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java
   */
  public static <E> ImmutableMultiset<E> of(E e1, E e2, E e3, E e4) {
    return copyFromElements(e1, e2, e3, e4);
  }

```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java
   */
  public static <E> ImmutableMultiset<E> of(E e1, E e2, E e3) {
    return copyFromElements(e1, e2, e3);
  }

```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java
   */
  public static <E> ImmutableMultiset<E> of(E e1, E e2, E e3, E e4, E e5) {
    return copyFromElements(e1, e2, e3, e4, e5);
  }

```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java
   */
  public static <E> ImmutableMultiset<E> of(E element) {
    return copyFromElements(element);
  }

```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java
   */
  public static <E> ImmutableMultiset<E> of(E e1, E e2) {
    return copyFromElements(e1, e2);
  }

```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   */
  public static <K, V> ImmutableBiMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
    return RegularImmutableBiMap.fromEntries(
        entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4));
  }
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   */
  public static <K, V> ImmutableBiMap<K, V> of(K k1, V v1, K k2, V v2) {
    return RegularImmutableBiMap.fromEntries(entryOf(k1, v1), entryOf(k2, v2));
  }

```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
  public static <K, V> ImmutableBiMap<K, V> of(
      K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
    return RegularImmutableBiMap.fromEntries(
        entryOf(k1, v1),
        entryOf(k2, v2),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
  public static <K, V> ImmutableBiMap<K, V> of(
      K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
    return RegularImmutableBiMap.fromEntries(
        entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5));
  }
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
      K k9,
      V v9) {
    return RegularImmutableBiMap.fromEntries(
        entryOf(k1, v1),
        entryOf(k2, v2),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
      K k8,
      V v8) {
    return RegularImmutableBiMap.fromEntries(
        entryOf(k1, v1),
        entryOf(k2, v2),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   */
  public static <K, V> ImmutableBiMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3) {
    return RegularImmutableBiMap.fromEntries(entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3));
  }

```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
      K k10,
      V v10) {
    return RegularImmutableBiMap.fromEntries(
        entryOf(k1, v1),
        entryOf(k2, v2),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
  public static <K, V> ImmutableBiMap<K, V> of(
      K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
    return RegularImmutableBiMap.fromEntries(
        entryOf(k1, v1),
        entryOf(k2, v2),
```

### UNCHECKED_WARNING
Unchecked cast: 'com.google.common.collect.Table\>' to 'com.google.common.collect.ArrayTable'
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
  public static <R, C, V> ArrayTable<R, C, V> create(Table<R, C, ? extends @Nullable V> table) {
    return (table instanceof ArrayTable)
        ? new ArrayTable<R, C, V>((ArrayTable<R, C, V>) table)
        : new ArrayTable<R, C, V>(table);
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map,V\>' to 'com.google.common.collect.EnumBiMap'
in `guava/src/com/google/common/collect/EnumBiMap.java`
#### Snippet
```java
  private static <V extends Enum<V>> Class<V> inferValueType(Map<?, V> map) {
    if (map instanceof EnumBiMap) {
      return ((EnumBiMap<?, V>) map).valueType;
    }
    checkArgument(!map.isEmpty());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map\>' to 'com.google.common.collect.EnumBiMap'
in `guava/src/com/google/common/collect/EnumBiMap.java`
#### Snippet
```java
  static <K extends Enum<K>> Class<K> inferKeyType(Map<K, ?> map) {
    if (map instanceof EnumBiMap) {
      return ((EnumBiMap<K, ?>) map).keyType();
    }
    if (map instanceof EnumHashBiMap) {
```

### UNCHECKED_WARNING
Unchecked cast: 'com.google.common.util.concurrent.ListenableFuture' to 'com.google.common.util.concurrent.ListenableFuture'
in `guava/src/com/google/common/util/concurrent/Futures.java`
#### Snippet
```java
    ListenableFuture<Object> instance = ImmediateCancelledFuture.INSTANCE;
    if (instance != null) {
      return (ListenableFuture<V>) instance;
    }
    return new ImmediateCancelledFuture<>();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'E\[\]'
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
      super(true); // don't construct guts of hash-based set builder
      this.comparator = checkNotNull(comparator);
      this.elements = (E[]) new Object[ImmutableCollection.Builder.DEFAULT_INITIAL_CAPACITY];
      this.n = 0;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'com.google.common.collect.RegularImmutableSortedSet' to 'com.google.common.collect.ImmutableSortedSet'
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
   */
  public static <E> ImmutableSortedSet<E> of() {
    return (ImmutableSortedSet<E>) RegularImmutableSortedSet.NATURAL_EMPTY_SET;
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'com.google.common.collect.RegularImmutableSortedSet' to 'com.google.common.collect.RegularImmutableSortedSet'
in `guava/src/com/google/common/collect/ImmutableSortedSet.java`
#### Snippet
```java
  static <E> RegularImmutableSortedSet<E> emptySet(Comparator<? super E> comparator) {
    if (Ordering.natural().equals(comparator)) {
      return (RegularImmutableSortedSet<E>) RegularImmutableSortedSet.NATURAL_EMPTY_SET;
    } else {
      return new RegularImmutableSortedSet<E>(ImmutableList.<E>of(), comparator);
```

### UNCHECKED_WARNING
Unchecked method 'asImmutable(EnumSet)' invocation
in `guava/src/com/google/common/collect/ImmutableSet.java`
#### Snippet
```java
  @SuppressWarnings("rawtypes") // necessary to compile against Java 8
  private static ImmutableSet copyOfEnumSet(EnumSet enumSet) {
    return ImmutableEnumSet.asImmutable(EnumSet.copyOf(enumSet));
  }

```

### UNCHECKED_WARNING
Unchecked method 'copyOf(EnumSet)' invocation
in `guava/src/com/google/common/collect/ImmutableSet.java`
#### Snippet
```java
  @SuppressWarnings("rawtypes") // necessary to compile against Java 8
  private static ImmutableSet copyOfEnumSet(EnumSet enumSet) {
    return ImmutableEnumSet.asImmutable(EnumSet.copyOf(enumSet));
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.google.common.collect.ImmutableSet' to 'com.google.common.collect.ImmutableSet'
in `guava/src/com/google/common/collect/ImmutableSet.java`
#### Snippet
```java
      }
    } else if (elements instanceof EnumSet) {
      return copyOfEnumSet((EnumSet) elements);
    }
    Object[] array = elements.toArray();
```

### UNCHECKED_WARNING
Unchecked cast: 'com.google.common.collect.Ordering' to 'com.google.common.collect.Ordering\>'
in `guava/src/com/google/common/collect/Range.java`
#### Snippet
```java

  static <C extends Comparable<?>> Ordering<Range<C>> rangeLexOrdering() {
    return (Ordering<Range<C>>) (Ordering) RangeLexOrdering.INSTANCE;
  }

```

### UNCHECKED_WARNING
Unchecked call to 'SerializedForm(Map, B\>)' as a member of raw type 'com.google.common.collect.MutableClassToInstanceMap.SerializedForm'
in `guava/src/com/google/common/collect/MutableClassToInstanceMap.java`
#### Snippet
```java

  private Object writeReplace() {
    return new SerializedForm(delegate());
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'com.google.common.collect.Multiset.Entry\[\]' to 'com.google.common.collect.Multiset.Entry\[\]'
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
  @Beta
  public static <E> ImmutableMultiset<E> copyHighestCountFirst(Multiset<E> multiset) {
    Entry<E>[] entries = (Entry<E>[]) multiset.entrySet().toArray(new Entry[0]);
    Arrays.sort(entries, DecreasingCount.INSTANCE);
    return ImmutableMultiset.copyFromEntries(Arrays.asList(entries));
```

### UNCHECKED_WARNING
Unchecked cast: 'com.google.common.collect.UnmodifiableIterator' to 'com.google.common.collect.UnmodifiableIterator'
in `guava/src/com/google/common/collect/RegularImmutableSet.java`
#### Snippet
```java
  @Override
  public UnmodifiableIterator<E> iterator() {
    return (UnmodifiableIterator<E>) Iterators.forArray(elements);
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'E' to 'com.google.common.collect.MapMakerInternalMap.WeakValueEntry'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
              && entryKey != null
              && map.keyEquivalence.equivalent(key, entryKey)) {
            WeakValueReference<K, V, E> v = ((WeakValueEntry<K, V, E>) e).getValueReference();
            if (v == valueReference) {
              ++modCount;
```

### UNCHECKED_WARNING
Unchecked cast: 'E' to 'com.google.common.collect.MapMakerInternalMap.WeakValueEntry'
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
              && entryKey != null
              && map.keyEquivalence.equivalent(key, entryKey)) {
            WeakValueReference<K, V, E> v = ((WeakValueEntry<K, V, E>) e).getValueReference();
            if (v == valueReference) {
              E newFirst = removeFromChain(first, e);
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
      Iterable<? extends T> c,
      Iterable<? extends T> d) {
    return concatNoDefensiveCopy(a, b, c, d);
  }

```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
  public static <T extends @Nullable Object> FluentIterable<T> concat(
      Iterable<? extends T> a, Iterable<? extends T> b, Iterable<? extends T> c) {
    return concatNoDefensiveCopy(a, b, c);
  }

```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
  public static <T extends @Nullable Object> FluentIterable<T> concat(
      Iterable<? extends T> a, Iterable<? extends T> b) {
    return concatNoDefensiveCopy(a, b);
  }

```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
      K k10,
      V v10) {
    return RegularImmutableMap.fromEntries(
        entryOf(k1, v1),
        entryOf(k2, v2),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
   */
  public static <K, V> ImmutableMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
    return RegularImmutableMap.fromEntries(
        entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4));
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.EnumMap,capture\>' to 'java.util.EnumMap'
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
  private static <K extends Enum<K>, V> ImmutableMap<K, ? extends V> copyOfEnumMap(
      EnumMap<?, ? extends V> original) {
    EnumMap<K, V> copy = new EnumMap<>((EnumMap<K, ? extends V>) original);
    for (Entry<K, V> entry : copy.entrySet()) {
      checkEntryNotNull(entry.getKey(), entry.getValue());
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
  public static <K, V> ImmutableMap<K, V> of(
      K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
    return RegularImmutableMap.fromEntries(
        entryOf(k1, v1),
        entryOf(k2, v2),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
      K k9,
      V v9) {
    return RegularImmutableMap.fromEntries(
        entryOf(k1, v1),
        entryOf(k2, v2),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
   */
  public static <K, V> ImmutableMap<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3) {
    return RegularImmutableMap.fromEntries(entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3));
  }

```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
      K k8,
      V v8) {
    return RegularImmutableMap.fromEntries(
        entryOf(k1, v1),
        entryOf(k2, v2),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
  public static <K, V> ImmutableMap<K, V> of(
      K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
    return RegularImmutableMap.fromEntries(
        entryOf(k1, v1),
        entryOf(k2, v2),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
  public static <K, V> ImmutableMap<K, V> of(
      K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
    return RegularImmutableMap.fromEntries(
        entryOf(k1, v1), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5));
  }
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
   */
  public static <K, V> ImmutableMap<K, V> of(K k1, V v1, K k2, V v2) {
    return RegularImmutableMap.fromEntries(entryOf(k1, v1), entryOf(k2, v2));
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `guava/src/com/google/common/collect/Platform.java`
#### Snippet
```java
  @SuppressWarnings("nullness")
  static <T extends @Nullable Object> T[] copy(Object[] source, int from, int to, T[] arrayOfType) {
    return Arrays.copyOfRange(source, from, to, (Class<? extends T[]>) arrayOfType.getClass());
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'com.google.common.collect.Multimap,capture\>' to 'com.google.common.collect.ListMultimap'
in `guava/src/com/google/common/collect/MultimapBuilder.java`
#### Snippet
```java
    public <K extends K0, V extends V0> ListMultimap<K, V> build(
        Multimap<? extends K, ? extends V> multimap) {
      return (ListMultimap<K, V>) super.build(multimap);
    }
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'com.google.common.collect.SetMultimap,capture\>' to 'com.google.common.collect.SortedSetMultimap'
in `guava/src/com/google/common/collect/MultimapBuilder.java`
#### Snippet
```java
    public <K extends K0, V extends V0> SortedSetMultimap<K, V> build(
        Multimap<? extends K, ? extends V> multimap) {
      return (SortedSetMultimap<K, V>) super.build(multimap);
    }
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'com.google.common.collect.Multimap,capture\>' to 'com.google.common.collect.SetMultimap'
in `guava/src/com/google/common/collect/MultimapBuilder.java`
#### Snippet
```java
    public <K extends K0, V extends V0> SetMultimap<K, V> build(
        Multimap<? extends K, ? extends V> multimap) {
      return (SetMultimap<K, V>) super.build(multimap);
    }
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Spliterator\>' to 'java.util.Spliterator'
in `guava/src/com/google/common/collect/Streams.java`
#### Snippet
```java
            CollectSpliterators.flatMap(
                splitrsBuilder.build().spliterator(),
                splitr -> (Spliterator<T>) splitr,
                characteristics,
                estimatedSize),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
    checkNotNull(c);
    checkNotNull(d);
    return concat(consumingForArray(a, b, c, d));
  }

```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
    checkNotNull(a);
    checkNotNull(b);
    return concat(consumingForArray(a, b));
  }

```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `guava/src/com/google/common/collect/Iterators.java`
#### Snippet
```java
    checkNotNull(b);
    checkNotNull(c);
    return concat(consumingForArray(a, b, c));
  }

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `catching(Class, com.google.common.base.Function)`
in `guava/src/com/google/common/util/concurrent/GwtFluentFutureCatchingSpecialization.java`
#### Snippet
```java
/**
 * Hidden superclass of {@link FluentFuture} that provides us a place to declare special GWT
 * versions of the {@link FluentFuture#catching(Class, com.google.common.base.Function)
 * FluentFuture.catching} family of methods. Those versions have slightly different signatures.
 */
```

### JavadocReference
Symbol `rowMap` is inaccessible from here
in `guava/src/com/google/common/collect/StandardRowSortedTable.java`
#### Snippet
```java
 * are both sorted, it's easier to use the {@link TreeBasedTable} subclass.
 *
 * <p>The {@link #rowKeySet} method returns a {@link SortedSet} and the {@link #rowMap} method
 * returns a {@link SortedMap}, instead of the {@link Set} and {@link Map} specified by the {@link
 * Table} interface.
```

### JavadocReference
Cannot resolve symbol `least(int)`
in `guava/src/com/google/common/collect/TopKSelector.java`
#### Snippet
```java
 *
 * <p>If your input data is available as a {@link Stream}, prefer passing {@link
 * Comparators#least(int)} to {@link Stream#collect(java.util.stream.Collector)}. If it is available
 * as an {@link Iterable} or {@link Iterator}, prefer {@link Ordering#leastOf(Iterable, int)}.
 *
```

### JavadocReference
Cannot resolve symbol `Collection`
in `guava/src/com/google/common/graph/BaseGraph.java`
#### Snippet
```java
   * <p>Unlike the other {@code EndpointPair}-accepting methods, this method does not throw if the
   * endpoints are unordered; it simply returns false. This is for consistency with the behavior of
   * {@link Collection#contains(Object)} (which does not generally throw if the object cannot be
   * present in the collection), and the desire to have this method's behavior be compatible with
   * {@code edges().contains(endpoints)}.
```

### JavadocReference
Cannot resolve symbol `contains(Object)`
in `guava/src/com/google/common/graph/BaseGraph.java`
#### Snippet
```java
   * <p>Unlike the other {@code EndpointPair}-accepting methods, this method does not throw if the
   * endpoints are unordered; it simply returns false. This is for consistency with the behavior of
   * {@link Collection#contains(Object)} (which does not generally throw if the object cannot be
   * present in the collection), and the desire to have this method's behavior be compatible with
   * {@code edges().contains(endpoints)}.
```

### JavadocReference
Cannot resolve symbol `drain(BlockingQueue, Collection, int, Duration)`
in `guava/src/com/google/common/collect/Queues.java`
#### Snippet
```java

  /**
   * Drains the queue as {@linkplain #drain(BlockingQueue, Collection, int, Duration)}, but with a
   * different behavior in case it is interrupted while waiting. In that case, the operation will
   * continue as usual, and in the end the thread's interruption status will be set (no {@code
```

### JavadocReference
Cannot resolve symbol `Duration`
in `guava/src/com/google/common/collect/Queues.java`
#### Snippet
```java

  /**
   * Drains the queue as {@linkplain #drain(BlockingQueue, Collection, int, Duration)}, but with a
   * different behavior in case it is interrupted while waiting. In that case, the operation will
   * continue as usual, and in the end the thread's interruption status will be set (no {@code
```

### JavadocReference
Cannot resolve symbol `trySetAccessible()`
in `guava/src/com/google/common/reflect/Invokable.java`
#### Snippet
```java
  }

  /** See {@link java.lang.reflect.AccessibleObject#trySetAccessible()}. */
  public final boolean trySetAccessible() {
    // We can't call accessibleObject.trySetAccessible since that was added in Java 9 and this code
```

### JavadocReference
Symbol `name` is inaccessible from here
in `guava/src/com/google/common/net/MediaType.java`
#### Snippet
```java
  /**
   * Returns a new instance with the same type and subtype as this instance, with the {@code
   * charset} parameter set to the {@link Charset#name name} of the given charset. Only one {@code
   * charset} parameter will be present on the new instance regardless of the number set on this
   * one.
```

### JavadocReference
Symbol `rowMap` is inaccessible from here
in `guava/src/com/google/common/collect/TreeBasedTable.java`
#### Snippet
```java
 * comparators for the row keys and the column keys, or you may use natural ordering for both.
 *
 * <p>The {@link #rowKeySet} method returns a {@link SortedSet} and the {@link #rowMap} method
 * returns a {@link SortedMap}, instead of the {@link Set} and {@link Map} specified by the {@link
 * Table} interface.
```

### JavadocReference
Cannot resolve symbol `toString()`
in `guava/src/com/google/common/collect/Collections2.java`
#### Snippet
```java
  }

  /** An implementation of {@link Collection#toString()}. */
  static String toStringImpl(final Collection<?> collection) {
    StringBuilder sb = newStringBuilderForCollection(collection.size()).append('[');
```

### JavadocReference
Symbol `build` is inaccessible from here
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
    /**
     * Associates {@code key} with {@code value} in the built bimap. Duplicate keys or values are
     * not allowed, and will cause {@link #build} to fail.
     */
    @CanIgnoreReturnValue
```

### JavadocReference
Symbol `entrySet` is inaccessible from here
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
  /**
   * Returns an immutable set of the values in this map, in the same order they appear in {@link
   * #entrySet}.
   */
  @Override
```

### JavadocReference
Symbol `build` is inaccessible from here
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
   *
   * <p>If {@code expectedSize} is exactly the number of entries added to the builder before {@link
   * Builder#build} is called, the builder is likely to perform better than an unsized {@link
   * #builder()} would have.
   *
```

### JavadocReference
Symbol `build` is inaccessible from here
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
    /**
     * Adds all of the given entries to the built bimap. Duplicate keys or values are not allowed,
     * and will cause {@link #build} to fail.
     *
     * @throws NullPointerException if any key, value, or entry is null
```

### JavadocReference
Symbol `build` is inaccessible from here
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
    /**
     * Associates all of the given map's keys and values in the built bimap. Duplicate keys or
     * values are not allowed, and will cause {@link #build} to fail.
     *
     * @throws NullPointerException if any key or value in {@code map} is null
```

### JavadocReference
Symbol `build` is inaccessible from here
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
    /**
     * Adds the given {@code entry} to the bimap. Duplicate keys or values are not allowed, and will
     * cause {@link #build} to fail.
     *
     * @since 19.0
```

### JavadocReference
Cannot resolve symbol `Interners.WeakInterner`
in `guava/src/com/google/common/collect/MapMaker.java`
#### Snippet
```java
   * <p>By default, the map uses {@link Equivalence#identity} to determine key equality when {@link
   * #weakKeys} is specified, and {@link Equivalence#equals()} otherwise. The only place this is
   * used is in {@link Interners.WeakInterner}.
   */
  @CanIgnoreReturnValue
```

### JavadocReference
Cannot resolve symbol `executor`
in `guava/src/com/google/common/util/concurrent/ListenerCallQueue.java`
#### Snippet
```java
 *   <li>Multiple events for the same listener are never dispatched concurrently.
 *   <li>Events for the different listeners are dispatched concurrently.
 *   <li>All events for a given listener dispatch on the provided {@link #executor}.
 *   <li>It is easy for the user to ensure that listeners are never invoked while holding locks.
 * </ul>
```

### JavadocReference
Symbol `keySet` is inaccessible from here
in `guava/src/com/google/common/collect/ImmutableMultimap.java`
#### Snippet
```java
   * Returns an immutable multiset containing all the keys in this multimap, in the same order and
   * with the same frequencies as they appear in this multimap; to get only a single occurrence of
   * each key, use {@link #keySet}.
   */
  @Override
```

### JavadocReference
Cannot resolve symbol `toString`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
  }

  /** An implementation of {@link Map#toString}. */
  static String toStringImpl(Map<?, ?> map) {
    StringBuilder sb = Collections2.newStringBuilderForCollection(map.size()).append('{');
```

### JavadocReference
Symbol `unmodifiableEntries` is inaccessible from here
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
  }

  /** The implementation of {@link Multimaps#unmodifiableEntries}. */
  static class UnmodifiableEntries<K extends @Nullable Object, V extends @Nullable Object>
      extends ForwardingCollection<Entry<K, V>> {
```

### JavadocReference
Symbol `set` is inaccessible from here
in `guava/src/com/google/common/util/concurrent/ListenableFuture.java`
#### Snippet
```java
 *       MoreExecutors#listeningDecorator(java.util.concurrent.ExecutorService)
 *       MoreExecutors.listeningDecorator}.
 *   <li>If you manually call {@link java.util.concurrent.FutureTask#set} or a similar method,
 *       create a {@link SettableFuture} instead. (If your needs are more complex, you may prefer
 *       {@link AbstractFuture}.)
```

### JavadocReference
Cannot resolve symbol `com.google.gwt.user.client.rpc.GwtTransient`
in `guava/src/com/google/common/collect/GwtTransient.java`
#### Snippet
```java

/**
 * Private replacement for {@link com.google.gwt.user.client.rpc.GwtTransient} to work around
 * build-system quirks. This annotation should be used <b>only</b> in {@code
 * com.google.common.collect}.
```

### JavadocReference
Symbol `keySet` is inaccessible from here
in `guava/src/com/google/common/collect/ImmutableCollection.java`
#### Snippet
```java
 *       once. This reduces the expense of habitually making defensive copies at API boundaries.
 *       However, the precise conditions for skipping the copy operation are undefined.
 *   <li><b>Warning:</b> a view collection such as {@link ImmutableMap#keySet} or {@link
 *       ImmutableList#subList} may retain a reference to the entire data set, preventing it from
 *       being garbage collected. If some of the data is no longer reachable through other means,
```

### JavadocReference
Symbol `HASH_TABLE_BITS_MAX_BITS` is inaccessible from here
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
   * metadata} is the size that the arrays should be allocated with. Once the arrays have been
   * allocated, the value of {@code metadata} combines the number of bits in the "short hash", in
   * its bottom {@value CompactHashing#HASH_TABLE_BITS_MAX_BITS} bits, with a modification count in
   * the remaining bits that is used to detect concurrent modification during iteration.
   */
```

### JavadocReference
Symbol `keySet` is inaccessible from here
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
 * collector by only using a constant number of internal objects.
 *
 * <p>If there are no removals, then iteration order for the {@link #entrySet}, {@link #keySet}, and
 * {@link #values} views is the same as insertion order. Any removal invalidates any ordering
 * guarantees.
```

### JavadocReference
Cannot resolve symbol `transformAsync(ListenableFuture, AsyncFunction, Executor)`
in `guava/src/com/google/common/util/concurrent/AsyncFunction.java`
#### Snippet
```java
/**
 * Transforms a value, possibly asynchronously. For an example usage and more information, see
 * {@link Futures#transformAsync(ListenableFuture, AsyncFunction, Executor)}.
 *
 * @author Chris Povirk
```

### JavadocReference
Cannot resolve symbol `Executor`
in `guava/src/com/google/common/util/concurrent/AsyncFunction.java`
#### Snippet
```java
/**
 * Transforms a value, possibly asynchronously. For an example usage and more information, see
 * {@link Futures#transformAsync(ListenableFuture, AsyncFunction, Executor)}.
 *
 * @author Chris Povirk
```

### JavadocReference
Symbol `comparator` is inaccessible from here
in `guava/src/com/google/common/collect/MinMaxPriorityQueue.java`
#### Snippet
```java
  /**
   * Returns the comparator used to order the elements in this queue. Obeys the general contract of
   * {@link PriorityQueue#comparator}, but returns {@link Ordering#natural} instead of {@code null}
   * to indicate natural ordering.
   */
```

### JavadocReference
Cannot resolve symbol `expireAfterAccess(Duration)`
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
   *
   * <p>If you can represent the duration as a {@link java.time.Duration} (which should be preferred
   * when feasible), use {@link #expireAfterAccess(Duration)} instead.
   *
   * @param duration the length of time after an entry is last accessed that it should be
```

### JavadocReference
Cannot resolve symbol `Duration`
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
   *
   * <p>If you can represent the duration as a {@link java.time.Duration} (which should be preferred
   * when feasible), use {@link #expireAfterAccess(Duration)} instead.
   *
   * @param duration the length of time after an entry is last accessed that it should be
```

### JavadocReference
Cannot resolve symbol `expireAfterWrite(Duration)`
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
   *
   * <p>If you can represent the duration as a {@link java.time.Duration} (which should be preferred
   * when feasible), use {@link #expireAfterWrite(Duration)} instead.
   *
   * @param duration the length of time after an entry is created that it should be automatically
```

### JavadocReference
Cannot resolve symbol `Duration`
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
   *
   * <p>If you can represent the duration as a {@link java.time.Duration} (which should be preferred
   * when feasible), use {@link #expireAfterWrite(Duration)} instead.
   *
   * @param duration the length of time after an entry is created that it should be automatically
```

### JavadocReference
Cannot resolve symbol `refreshAfterWrite(Duration)`
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
   *
   * <p>If you can represent the duration as a {@link java.time.Duration} (which should be preferred
   * when feasible), use {@link #refreshAfterWrite(Duration)} instead.
   *
   * @param duration the length of time after an entry is created that it should be considered
```

### JavadocReference
Cannot resolve symbol `Duration`
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
   *
   * <p>If you can represent the duration as a {@link java.time.Duration} (which should be preferred
   * when feasible), use {@link #refreshAfterWrite(Duration)} instead.
   *
   * @param duration the length of time after an entry is created that it should be considered
```

### JavadocReference
Symbol `asMap` is inaccessible from here
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
 * {@link #replaceValues} attempts to preserve iteration order as much as possible.
 *
 * <p>The collections returned by {@link #keySet()} and {@link #asMap} iterate through the keys in
 * the order they were first added to the multimap. Similarly, {@link #get}, {@link #removeAll}, and
 * {@link #replaceValues} return collections that iterate through the values in the order they were
```

### JavadocReference
Symbol `values` is inaccessible from here
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
 * the order they were first added to the multimap. Similarly, {@link #get}, {@link #removeAll}, and
 * {@link #replaceValues} return collections that iterate through the values in the order they were
 * added. The collections generated by {@link #entries()}, {@link #keys()}, and {@link #values}
 * iterate across the key-value mappings in the order they were added to the multimap.
 *
```

### JavadocReference
Symbol `values` is inaccessible from here
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
 * the {@code Collection} specified by the {@link ListMultimap} interface.
 *
 * <p>The methods {@link #get}, {@link #keySet()}, {@link #keys()}, {@link #values}, {@link
 * #entries()}, and {@link #asMap} return collections that are views of the multimap. If the
 * multimap is modified while an iteration over any of those collections is in progress, except
```

### JavadocReference
Symbol `asMap` is inaccessible from here
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
 *
 * <p>The methods {@link #get}, {@link #keySet()}, {@link #keys()}, {@link #values}, {@link
 * #entries()}, and {@link #asMap} return collections that are views of the multimap. If the
 * multimap is modified while an iteration over any of those collections is in progress, except
 * through the iterator's methods, the results of the iteration are undefined.
```

### JavadocReference
Cannot resolve symbol `SEC_CH_UA_FULL_VERSION_LIST`
in `guava/src/com/google/common/net/HttpHeaders.java`
#### Snippet
```java
   * Sec-CH-UA-Full-Version}</a> header field name.
   *
   * @deprecated Prefer {@link SEC_CH_UA_FULL_VERSION_LIST}.
   * @since 30.0
   */
```

### JavadocReference
Cannot resolve symbol `Stream`
in `guava/src/com/google/common/collect/CollectSpliterators.java`
#### Snippet
```java

  /**
   * Implements the {@link Stream#flatMap} operation on spliterators.
   *
   * @param <InElementT> the element type of the input spliterator
```

### JavadocReference
Cannot resolve symbol `flatMap`
in `guava/src/com/google/common/collect/CollectSpliterators.java`
#### Snippet
```java

  /**
   * Implements the {@link Stream#flatMap} operation on spliterators.
   *
   * @param <InElementT> the element type of the input spliterator
```

### JavadocReference
Cannot resolve symbol `Stream`
in `guava/src/com/google/common/collect/CollectSpliterators.java`
#### Snippet
```java

  /**
   * Implementation of {@link Stream#flatMap} with an object spliterator output type.
   *
   * <p>To avoid having this type, we could use {@code FlatMapSpliterator} directly. The main
```

### JavadocReference
Cannot resolve symbol `flatMap`
in `guava/src/com/google/common/collect/CollectSpliterators.java`
#### Snippet
```java

  /**
   * Implementation of {@link Stream#flatMap} with an object spliterator output type.
   *
   * <p>To avoid having this type, we could use {@code FlatMapSpliterator} directly. The main
```

### JavadocReference
Cannot resolve symbol `Stream`
in `guava/src/com/google/common/collect/CollectSpliterators.java`
#### Snippet
```java

  /**
   * Implementation of {@link Stream#flatMap} with a primitive spliterator output type.
   *
   * @param <InElementT> the element type of the input spliterator
```

### JavadocReference
Cannot resolve symbol `flatMap`
in `guava/src/com/google/common/collect/CollectSpliterators.java`
#### Snippet
```java

  /**
   * Implementation of {@link Stream#flatMap} with a primitive spliterator output type.
   *
   * @param <InElementT> the element type of the input spliterator
```

### JavadocReference
Symbol `build` is inaccessible from here
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
     * Adds the given {@code entry} to the map, making it immutable if necessary. Duplicate keys,
     * according to the comparator (which might be the keys' natural order), are not allowed, and
     * will cause {@link #build} to fail.
     *
     * @since 11.0
```

### JavadocReference
Symbol `build` is inaccessible from here
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
    /**
     * Adds all the given entries to the built map. Duplicate keys, according to the comparator
     * (which might be the keys' natural order), are not allowed, and will cause {@link #build} to
     * fail.
     *
```

### JavadocReference
Symbol `build` is inaccessible from here
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
     * Associates {@code key} with {@code value} in the built map. Duplicate keys, according to the
     * comparator (which might be the keys' natural order), are not allowed, and will cause {@link
     * #build} to fail.
     */
    @CanIgnoreReturnValue
```

### JavadocReference
Symbol `build` is inaccessible from here
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
     * Associates all of the given map's keys and values in the built map. Duplicate keys, according
     * to the comparator (which might be the keys' natural order), are not allowed, and will cause
     * {@link #build} to fail.
     *
     * @throws NullPointerException if any key or value in {@code map} is null
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `guava/src/com/google/common/util/concurrent/CycleDetectingLockFactory.java`
#### Snippet
```java
      @Override
      public void handlePotentialDeadlock(PotentialDeadlockException e) {}
    };
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
        return entry.getValue();
      }
    };
  }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Expression `delegateCollection().comparator()` might evaluate to null but is returned by the method declared as @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/collect/ImmutableSortedAsList.java`
#### Snippet
```java
  @Override
  public Comparator<? super E> comparator() {
    return delegateCollection().comparator();
  }

```

### DataFlowIssue
@CheckForNull method 'unsafeDoBackward' always returns a non-null value
in `guava/src/com/google/common/base/Converter.java`
#### Snippet
```java
  }

  @CheckForNull
  private A unsafeDoBackward(@CheckForNull B b) {
    return doBackward(uncheckedCastNullableTToT(b));
```

### DataFlowIssue
Argument `uncheckedCastNullableTToT(b)` might be null
in `guava/src/com/google/common/base/Converter.java`
#### Snippet
```java
  @CheckForNull
  private A unsafeDoBackward(@CheckForNull B b) {
    return doBackward(uncheckedCastNullableTToT(b));
  }

```

### DataFlowIssue
Expression `convert(fromIterator.next())` might evaluate to null but is returned by the method declared as @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/base/Converter.java`
#### Snippet
```java
          @Override
          public B next() {
            return convert(fromIterator.next());
          }

```

### DataFlowIssue
@CheckForNull method 'unsafeDoForward' always returns a non-null value
in `guava/src/com/google/common/base/Converter.java`
#### Snippet
```java
   */

  @CheckForNull
  private B unsafeDoForward(@CheckForNull A a) {
    return doForward(uncheckedCastNullableTToT(a));
```

### DataFlowIssue
Argument `uncheckedCastNullableTToT(a)` might be null
in `guava/src/com/google/common/base/Converter.java`
#### Snippet
```java
  @CheckForNull
  private B unsafeDoForward(@CheckForNull A a) {
    return doForward(uncheckedCastNullableTToT(a));
  }

```

### DataFlowIssue
Argument `forward.comparator()` might be null
in `guava/src/com/google/common/collect/DescendingImmutableSortedSet.java`
#### Snippet
```java

  DescendingImmutableSortedSet(ImmutableSortedSet<E> forward) {
    super(Ordering.from(forward.comparator()).reverse());
    this.forward = forward;
  }
```

### DataFlowIssue
Expression `result` might evaluate to null but is returned by the method declared as @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
        result = lowerCase = (lower == alphabet) ? this : newInstance(lower, paddingChar);
      }
      return result;
    }

```

### DataFlowIssue
Expression `result` might evaluate to null but is returned by the method declared as @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
        result = upperCase = (upper == alphabet) ? this : newInstance(upper, paddingChar);
      }
      return result;
    }

```

### DataFlowIssue
Expression `result` might evaluate to null but is returned by the method declared as @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/io/BaseEncoding.java`
#### Snippet
```java
        result = ignoreCase = (ignore == alphabet) ? this : newInstance(ignore, paddingChar);
      }
      return result;
    }

```

### DataFlowIssue
Result of 'min' is the same as the second argument making the call meaningless
in `guava/src/com/google/common/util/concurrent/ListenableFutureTask.java`
#### Snippet
```java
    // Waiting 68 years should be enough for any program.
    return super.get(
        min(timeoutNanos, OverflowAvoidingLockSupport.MAX_NANOSECONDS_THRESHOLD), NANOSECONDS);
  }

```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Argument `enumClass.cast(ref.get())` might be null
in `guava/src/com/google/common/base/Platform.java`
#### Snippet
```java
  static <T extends Enum<T>> Optional<T> getEnumIfPresent(Class<T> enumClass, String value) {
    WeakReference<? extends Enum<?>> ref = Enums.getEnumConstants(enumClass).get(value);
    return ref == null ? Optional.<T>absent() : Optional.of(enumClass.cast(ref.get()));
  }

```

### DataFlowIssue
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

### DataFlowIssue
Expression `elementSet().comparator()` might evaluate to null but is returned by the method declared as @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/collect/ImmutableSortedMultiset.java`
#### Snippet
```java
  @Override
  public final Comparator<? super E> comparator() {
    return elementSet().comparator();
  }

```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `execute` may produce `NullPointerException`
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
      executorService =
          MoreExecutors.renamingDecorator(executor(), () -> serviceName() + " " + state());
      executorService.execute(
          () -> {
            lock.lock();
```

### DataFlowIssue
Argument `executorService` might be null
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
               */
              requireNonNull(executorService);
              runningTask = scheduler().schedule(delegate, executorService, task);
              notifyStarted();
            } catch (Throwable t) {
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `cancel` may produce `NullPointerException`
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
      requireNonNull(runningTask);
      requireNonNull(executorService);
      runningTask.cancel(false);
      executorService.execute(
          () -> {
```

### DataFlowIssue
Method invocation `execute` may produce `NullPointerException`
in `guava/src/com/google/common/util/concurrent/AbstractScheduledService.java`
#### Snippet
```java
      requireNonNull(executorService);
      runningTask.cancel(false);
      executorService.execute(
          () -> {
            try {
```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `poll` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    void clearKeyReferenceQueue() {
      while (keyReferenceQueue.poll() != null) {}
    }

```

### DataFlowIssue
Method invocation `getAll` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @Override
    public ImmutableMap<K, V> getAll(Iterable<? extends K> keys) throws ExecutionException {
      return autoDelegate.getAll(keys);
    }

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

          AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
          for (int i = 0; i < table.length(); ++i) {
            for (ReferenceEntry<K, V> e = table.get(i); e != null; e = e.getNext()) {
              // Loading references aren't actually in the map yet.
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      // read this volatile field only once
      AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
      return table.get(hash & (table.length() - 1));
    }

```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        int newCount = this.count - 1;
        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getUnchecked` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @Override
    public V getUnchecked(K key) {
      return autoDelegate.getUnchecked(key);
    }

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      int newCount = this.count - 1;
      AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
      int index = hash & (table.length() - 1);
      ReferenceEntry<K, V> first = table.get(index);

```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    public LoadingValueReference() {
      this(null);
    }

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

      ValueReference<K, V> valueReference = original.getValueReference();
      V value = valueReference.get();
      if ((value == null) && valueReference.isActive()) {
        // value collected
```

### DataFlowIssue
Argument `this.valueReferenceQueue` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

      ReferenceEntry<K, V> newEntry = map.entryFactory.copyEntry(this, original, newNext, key);
      newEntry.setValueReference(valueReference.copyFor(this.valueReferenceQueue, value, newEntry));
      return newEntry;
    }
```

### DataFlowIssue
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

### DataFlowIssue
Argument `entry.getKey()` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    ReferenceEntry<K, V> entry = valueReference.getEntry();
    int hash = entry.getHash();
    segmentFor(hash).reclaimValue(entry.getKey(), hash, valueReference);
  }

```

### DataFlowIssue
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

### DataFlowIssue
Argument `segment.keyReferenceQueue` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      <K, V> ReferenceEntry<K, V> newEntry(
          Segment<K, V> segment, K key, int hash, @CheckForNull ReferenceEntry<K, V> next) {
        return new WeakWriteEntry<>(segment.keyReferenceQueue, key, hash, next);
      }

```

### DataFlowIssue
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

### DataFlowIssue
Argument `segment.valueReferenceQueue` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
            ? new SoftValueReference<K, V>(segment.valueReferenceQueue, value, entry)
            : new WeightedSoftValueReference<K, V>(
                segment.valueReferenceQueue, value, entry, weight);
      }

```

### DataFlowIssue
Method invocation `apply` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @Override
    public V apply(K key) {
      return autoDelegate.apply(key);
    }

```

### DataFlowIssue
Argument `segment.keyReferenceQueue` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      <K, V> ReferenceEntry<K, V> newEntry(
          Segment<K, V> segment, K key, int hash, @CheckForNull ReferenceEntry<K, V> next) {
        return new WeakAccessEntry<>(segment.keyReferenceQueue, key, hash, next);
      }

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

            ValueReference<K, V> valueReference = e.getValueReference();
            V entryValue = valueReference.get();

            if (entryValue == null) {
```

### DataFlowIssue
Method invocation `refresh` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @Override
    public void refresh(K key) {
      autoDelegate.refresh(key);
    }

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        int newCount = this.count - 1;
        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      try {
        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### DataFlowIssue
Argument `defaultLoader` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
  void refresh(K key) {
    int hash = hash(checkNotNull(key));
    segmentFor(hash).refresh(key, hash, defaultLoader, false);
  }

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    @Override
    public V get(K key) throws ExecutionException {
      return autoDelegate.get(key);
    }

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        int newCount = this.count - 1;
        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
              && map.keyEquivalence.equivalent(key, entryKey)) {
            ValueReference<K, V> valueReference = e.getValueReference();
            V entryValue = valueReference.get();

            RemovalCause cause;
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        AtomicReferenceArray<ReferenceEntry<K, V>> table = segment.table;
        for (int j = 0; j < table.length(); j++) {
          for (ReferenceEntry<K, V> e = table.get(j); e != null; e = e.getNext()) {
            V v = segment.getLiveValue(e, now);
```

### DataFlowIssue
Argument `segment.keyReferenceQueue` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      <K, V> ReferenceEntry<K, V> newEntry(
          Segment<K, V> segment, K key, int hash, @CheckForNull ReferenceEntry<K, V> next) {
        return new WeakAccessWriteEntry<>(segment.keyReferenceQueue, key, hash, next);
      }

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        int newCount = this.count - 1;
        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
              && map.keyEquivalence.equivalent(key, entryKey)) {
            ValueReference<K, V> valueReference = e.getValueReference();
            V entryValue = valueReference.get();

            RemovalCause cause;
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Argument `cache.defaultLoader` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
          cache.removalListener,
          cache.ticker,
          cache.defaultLoader);
    }

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `notifyNewValue` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      entry.setValueReference(valueReference);
      recordWrite(entry, weight, now);
      previous.notifyNewValue(value);
    }

```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
          }

          V value = e.getValueReference().get();
          if (value != null) {
            recordRead(e, now);
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
            return false;
          }
          return e.getValueReference().get() != null;
        }

```

### DataFlowIssue
Method invocation `poll` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

    void clearValueReferenceQueue() {
      while (valueReferenceQueue.poll() != null) {}
    }

```

### DataFlowIssue
Argument `defaultLoader` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

  V getOrLoad(K key) throws ExecutionException {
    return get(key, defaultLoader);
  }

```

### DataFlowIssue
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

### DataFlowIssue
Argument `segment.valueReferenceQueue` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
            ? new WeakValueReference<K, V>(segment.valueReferenceQueue, value, entry)
            : new WeightedWeakValueReference<K, V>(
                segment.valueReferenceQueue, value, entry, weight);
      }

```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### DataFlowIssue
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

### DataFlowIssue
Argument `valueReference` might be null
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        // note valueReference can be an existing value or even itself another loading value if
        // the value for the key is already being computed.
        computingValueReference = new ComputingValueReference<>(valueReference);

        if (e == null) {
```

### DataFlowIssue
Variable is already assigned to this value
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        if (e == null) {
          createNewEntry = true;
          e = newEntry(key, hash, first);
          e.setValueReference(computingValueReference);
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
        int newCount = count - 1;
        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

        AtomicReferenceArray<ReferenceEntry<K, V>> table = this.table;
        int index = hash & (table.length() - 1);
        ReferenceEntry<K, V> first = table.get(index);

```

### DataFlowIssue
Method invocation `isLoading` may produce `NullPointerException`
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java

            ValueReference<K, V> valueReference = e.getValueReference();
            if (valueReference.isLoading()
                || (checkTime && (now - e.getWriteTime() < map.refreshNanos))) {
              // refresh is a no-op if loading is pending
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Argument `key` might be null
in `guava/src/com/google/common/collect/ForwardingConcurrentMap.java`
#### Snippet
```java
  @Override
  public boolean remove(@CheckForNull Object key, @CheckForNull Object value) {
    return delegate().remove(key, value);
  }

```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
        E first = table.get(index);

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

        AtomicReferenceArray<E> table = segment.table;
        for (int j = 0; j < table.length(); j++) {
          for (E e = table.get(j); e != null; e = e.getNext()) {
            V v = segment.getLiveValue(e);
```

### DataFlowIssue
Argument `newNext` might be null
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    /** Unsafely returns a copy of the given entry. */
    E copyForTesting(InternalEntry<K, V, ?> entry, @CheckForNull InternalEntry<K, V, ?> newNext) {
      return this.map.entryHelper.copy(self(), castForTesting(entry), castForTesting(newNext));
    }

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      // read this volatile field only once
      AtomicReferenceArray<E> table = this.table;
      return table.get(hash & (table.length() - 1));
    }

```

### DataFlowIssue
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

### DataFlowIssue
Argument `next` might be null
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
    /** Unsafely returns a fresh entry. */
    E newEntryForTesting(K key, int hash, @CheckForNull InternalEntry<K, V, ?> next) {
      return this.map.entryHelper.newEntry(self(), key, hash, castForTesting(next));
    }

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
        E first = table.get(index);

```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `set` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
     */
    void setTableEntryForTesting(int i, InternalEntry<K, V, ?> entry) {
      table.set(i, castForTesting(entry));
    }

```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        int newCount = count - 1;
        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
        E first = table.get(index);

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java

        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
        E first = table.get(index);

```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        int newCount = this.count - 1;
        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
        E first = table.get(index);

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      int newCount = this.count - 1;
      AtomicReferenceArray<E> table = this.table;
      int index = hash & (table.length() - 1);
      E first = table.get(index);

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        int newCount = this.count - 1;
        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
        E first = table.get(index);

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        int newCount = this.count - 1;
        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
        E first = table.get(index);

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      try {
        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
        E first = table.get(index);

```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Expression `delegate().computeIfPresent(key, remappingFunction)` might evaluate to null but is returned by the method declared as @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
        K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
      synchronized (mutex) {
        return delegate().computeIfPresent(key, remappingFunction);
      }
    }
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Expression `keySet().comparator()` might evaluate to null but is returned by the method declared as @ElementTypesAreNonnullByDefault
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
  @Override
  public Comparator<? super K> comparator() {
    return keySet().comparator();
  }

```

### DataFlowIssue
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

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
Deprecated member 'JAVA_EXT_DIRS' is still used
in `guava/src/com/google/common/base/StandardSystemProperty.java`
#### Snippet
```java
   */
  @Deprecated
  JAVA_EXT_DIRS("java.ext.dirs"),

  /** Operating system name. */
```

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
Deprecated member 'TreeTraverser' is still used
in `guava/src/com/google/common/collect/TreeTraverser.java`
#### Snippet
```java
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class TreeTraverser<T> {

  /**
```

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
Deprecated member 'propagateIfPossible' is still used
in `guava/src/com/google/common/base/Throwables.java`
#### Snippet
```java
  @J2ktIncompatible
  @GwtIncompatible
  public static void propagateIfPossible(@CheckForNull Throwable throwable) {
    if (throwable != null) {
      throwIfUnchecked(throwable);
```

### DeprecatedIsStillUsed
Deprecated member 'lazyStackTraceIsLazy' is still used
in `guava/src/com/google/common/base/Throwables.java`
#### Snippet
```java
  @J2ktIncompatible
  @GwtIncompatible // getStackTraceElementMethod
  public static boolean lazyStackTraceIsLazy() {
    return getStackTraceElementMethod != null && getStackTraceDepthMethod != null;
  }
```

### DeprecatedIsStillUsed
Deprecated member 'propagateIfInstanceOf' is still used
in `guava/src/com/google/common/base/Throwables.java`
#### Snippet
```java
  @J2ktIncompatible
  @GwtIncompatible // throwIfInstanceOf
  public static <X extends Throwable> void propagateIfInstanceOf(
      @CheckForNull Throwable throwable, Class<X> declaredType) throws X {
    if (throwable != null) {
```

### DeprecatedIsStillUsed
Deprecated member 'lazyStackTrace' is still used
in `guava/src/com/google/common/base/Throwables.java`
#### Snippet
```java
  @J2ktIncompatible
  @GwtIncompatible // lazyStackTraceIsLazy, jlaStackTrace
  public static List<StackTraceElement> lazyStackTrace(Throwable throwable) {
    return lazyStackTraceIsLazy()
        ? jlaStackTrace(throwable)
```

### DeprecatedIsStillUsed
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

## RuleId[id=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `guava/src/com/google/common/cache/CacheBuilderSpec.java`
#### Snippet
```java
    }
    if (keyStrength != null) {
      switch (keyStrength) {
        case WEAK:
          builder.weakKeys();
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/base/AbstractIterator.java`
#### Snippet
```java
    checkState(state != State.FAILED);
    switch (state) {
      case DONE:
        return false;
      case READY:
        return true;
      default:
    }
    return tryToComputeNext();
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
    if (keyStrength != null) {
      s.add("keyStrength", Ascii.toLowerCase(keyStrength.toString()));
    }
    if (valueStrength != null) {
      s.add("valueStrength", Ascii.toLowerCase(valueStrength.toString()));
    }
    if (keyEquivalence != null) {
      s.addValue("keyEquivalence");
    }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/cache/LongAdder.java`
#### Snippet
```java
    Cell[] as;
    long b, v;
    int[] hc;
    Cell a;
    int n;
    if ((as = cells) != null || !casBase(b = base, b + x)) {
      boolean uncontended = true;
      if ((hc = threadHashCode.get()) == null
          || as == null
          || (n = as.length) < 1
          || (a = as[(n - 1) & hc[0]]) == null
          || !(uncontended = a.cas(v = a.value, v + x))) retryUpdate(x, hc, uncontended);
    }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/cache/LongAdder.java`
#### Snippet
```java
    long sum = base;
    Cell[] as = cells;
    if (as != null) {
      int n = as.length;
      for (int i = 0; i < n; ++i) {
        Cell a = as[i];
        if (a != null) sum += a.value;
      }
    }
    return sum;
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/cache/LongAdder.java`
#### Snippet
```java
    long sum = base;
    Cell[] as = cells;
    base = 0L;
    if (as != null) {
      int n = as.length;
      for (int i = 0; i < n; ++i) {
        Cell a = as[i];
        if (a != null) {
          sum += a.value;
          a.value = 0L;
        }
      }
    }
    return sum;
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
int h;
    if (hc == null) {
      threadHashCode.set(hc = new int[1]); // Initialize randomly
      int r = rng.nextInt(); // Avoid zero to allow xorShift rehash
      h = hc[0] = (r == 0) ? 1 : r;
    } else h = hc[0];
    boolean collide = false; // True if last slot nonempty
    for (; ; ) {
      Cell[] as;
      Cell a;
      int n;
      long v;
      if ((as = cells) != null && (n = as.length) > 0) {
        if ((a = as[(n - 1) & h]) == null) {
          if (busy == 0) { // Try to attach new Cell
            Cell r = new Cell(x); // Optimistically create
            if (busy == 0 && casBusy()) {
              boolean created = false;
              try { // Recheck under lock
                Cell[] rs;
                int m, j;
                if ((rs = cells) != null && (m = rs.length) > 0 && rs[j = (m - 1) & h] == null) {
                  rs[j] = r;
                  created = true;
                }
              } finally {
                busy = 0;
              }
              if (created) break;
              continue; // Slot is now non-empty
            }
          }
          collide = false;
        } else if (!wasUncontended) // CAS already known to fail
        wasUncontended = true; // Continue after rehash
        else if (a.cas(v = a.value, fn(v, x))) break;
        else if (n >= NCPU || cells != as) collide = false; // At max size or stale
        else if (!collide) collide = true;
        else if (busy == 0 && casBusy()) {
          try {
            if (cells == as) { // Expand table unless stale
              Cell[] rs = new Cell[n << 1];
              for (int i = 0; i < n; ++i) rs[i] = as[i];
              cells = rs;
            }
          } finally {
            busy = 0;
          }
          collide = false;
          continue; // Retry with expanded table
        }
        h ^= h << 13; // Rehash
        h ^= h >>> 17;
        h ^= h << 5;
        hc[0] = h; // Record index for next time
      } else if (busy == 0 && cells == as && casBusy()) {
        boolean init = false;
        try { // Initialize table
          if (cells == as) {
            Cell[] rs = new Cell[2];
            rs[h & 1] = new Cell(x);
            cells = rs;
            init = true;
          }
        } finally {
          busy = 0;
        }
        if (init) break;
      } else if (casBase(v = base, fn(v, x))) break; // Fall back on using base
    }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
    Cell[] as = cells;
    base = initialValue;
    if (as != null) {
      int n = as.length;
      for (int i = 0; i < n; ++i) {
        Cell a = as[i];
        if (a != null) a.value = initialValue;
      }
    }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/cache/Striped64.java`
#### Snippet
```java
    try {
      return sun.misc.Unsafe.getUnsafe();
    } catch (SecurityException tryReflectionInstead) {
    }
    try {
      return java.security.AccessController.doPrivileged(
          new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() {
            @Override
            public sun.misc.Unsafe run() throws Exception {
              Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
              for (java.lang.reflect.Field f : k.getDeclaredFields()) {
                f.setAccessible(true);
                Object x = f.get(null);
                if (k.isInstance(x)) return k.cast(x);
              }
              throw new NoSuchFieldError("the Unsafe");
            }
          });
    } catch (java.security.PrivilegedActionException e) {
      throw new RuntimeException("Could not initialize intrinsics", e.getCause());
    }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
                      Class<sun.misc.Unsafe> k = sun.misc.Unsafe.class;
                      for (java.lang.reflect.Field f : k.getDeclaredFields()) {
                        f.setAccessible(true);
                        Object x = f.get(null);
                        if (k.isInstance(x)) {
                          return k.cast(x);
                        }
                      }
                      throw new NoSuchFieldError("the Unsafe");
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/collect/CartesianList.java`
#### Snippet
```java
    if (!(o instanceof List)) {
      return -1;
    }
    List<?> list = (List<?>) o;
    if (list.size() != axes.size()) {
      return -1;
    }
    ListIterator<?> itr = list.listIterator();
    int computedIndex = 0;
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/collect/CartesianList.java`
#### Snippet
```java
    if (!(object instanceof List)) {
      return false;
    }
    List<?> list = (List<?>) object;
    if (list.size() != axes.size()) {
      return false;
    }
    int i = 0;
    for (Object o : list) {
      if (!axes.get(i).contains(o)) {
        return false;
      }
      i++;
    }
    return true;
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/collect/CollectSpliterators.java`
#### Snippet
```java
      while (true) {
        if (prefix != null && prefix.tryAdvance(action)) {
          if (estimatedSize != Long.MAX_VALUE) {
            estimatedSize--;
          }
          return true;
        } else {
          prefix = null;
        }
        if (!from.tryAdvance(fromElement -> prefix = function.apply(fromElement))) {
          return false;
        }
      }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
Object newTable = CompactHashing.createTable(newCapacity);
    int newMask = newCapacity - 1;

    if (targetEntryIndex != UNSET) {
      // Add target first; it must be last in the chain because its entry hasn't yet been created
      CompactHashing.tableSet(newTable, targetHash & newMask, targetEntryIndex + 1);
    }

    Object oldTable = requireTable();
    int[] entries = requireEntries();

    // Loop over `oldTable` to construct its replacement, ``newTable`. The entries do not move, so
    // the `keys` and `values` arrays do not need to change. But because the "short hash" now has a
    // different number of bits, we must rewrite each element of `entries` so that its contribution
    // to the full hashcode reflects the change, and so that its `next` link corresponds to the new
    // linked list of entries with the new short hash.
    for (int oldTableIndex = 0; oldTableIndex <= oldMask; oldTableIndex++) {
      int oldNext = CompactHashing.tableGet(oldTable, oldTableIndex);
      // Each element of `oldTable` is the head of a (possibly empty) linked list of elements in
      // `entries`. The `oldNext` loop is going to traverse that linked list.
      // We need to rewrite the `next` link of each of the elements so that it is in the appropriate
      // linked list starting from `newTable`. In general, each element from the old linked list
      // belongs to a different linked list from `newTable`. We insert each element in turn at the
      // head of its appropriate `newTable` linked list.
      while (oldNext != UNSET) {
        int entryIndex = oldNext - 1;
        int oldEntry = entries[entryIndex];

        // Rebuild the full 32-bit hash using entry hashPrefix and oldTableIndex ("hashSuffix").
        int hash = CompactHashing.getHashPrefix(oldEntry, oldMask) | oldTableIndex;

        int newTableIndex = hash & newMask;
        int newNext = CompactHashing.tableGet(newTable, newTableIndex);
        CompactHashing.tableSet(newTable, newTableIndex, oldNext);
        entries[entryIndex] = CompactHashing.maskCombine(hash, newNext, newMask);

        oldNext = CompactHashing.getNext(oldEntry, oldMask);
      }
    }

    this.table = newTable;
    setHashTableMask(newMask);
    return newMask;
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
      values[srcIndex] = null;

      // move the last entry to the removed spot, just like we moved the element
      entries[dstIndex] = entries[srcIndex];
      entries[srcIndex] = 0;

      // also need to update whoever's "next" pointer was pointing to the last entry place
      int tableIndex = smearedHash(key) & mask;
      int next = CompactHashing.tableGet(table, tableIndex);
      int srcNext = srcIndex + 1;
      if (next == srcNext) {
        // we need to update the root pointer
        CompactHashing.tableSet(table, tableIndex, dstIndex + 1);
      } else {
        // we need to update a pointer in an entry
        int entryIndex;
        int entry;
        do {
          entryIndex = next - 1;
          entry = entries[entryIndex];
          next = CompactHashing.getNext(entry, mask);
        } while (next != srcNext);
        // here, entries[entryIndex] points to the old entry location; update it
        entries[entryIndex] = CompactHashing.maskCombine(entry, dstIndex + 1, mask);
      }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/collect/CompactHashMap.java`
#### Snippet
```java
    int size = this.size;
    if (size < requireEntries().length) {
      resizeEntries(size);
    }
    int minimumTableSize = CompactHashing.tableSize(size);
    int mask = hashTableMask();
    if (minimumTableSize < mask) { // smaller table size will always be less than current mask
      resizeTable(mask, minimumTableSize, UNSET, UNSET);
    }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/collect/ImmutableCollection.java`
#### Snippet
```java
      if (minCapacity < 0) {
        throw new AssertionError("cannot store more than MAX_VALUE elements");
      }
      // careful of overflow!
      int newCapacity = oldCapacity + (oldCapacity >> 1) + 1;
      if (newCapacity < minCapacity) {
        newCapacity = Integer.highestOneBit(minCapacity - 1) << 1;
      }
      if (newCapacity < 0) {
        newCapacity = Integer.MAX_VALUE;
        // guaranteed to be >= newCapacity
      }
      return newCapacity;
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
              if (isCollected(e)) {
                int newCount = this.count - 1;
                ++modCount;
                E newFirst = removeFromChain(first, e);
                newCount = this.count - 1;
                table.set(index, newFirst);
                this.count = newCount; // write-volatile
              }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
        AtomicReferenceArray<E> table = this.table;
        int index = hash & (table.length() - 1);
        E first = table.get(index);

        for (E e = first; e != null; e = e.getNext()) {
          if (e == entry) {
            ++modCount;
            E newFirst = removeFromChain(first, e);
            newCount = this.count - 1;
            table.set(index, newFirst);
            this.count = newCount; // write-volatile
            return true;
          }
        }

        return false;
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
      for (E e = first; e != null; e = e.getNext()) {
        if (e == entry) {
          ++modCount;
          E newFirst = removeFromChain(first, e);
          newCount = this.count - 1;
          table.set(index, newFirst);
          this.count = newCount; // write-volatile
          return true;
        }
      }

      return false;
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/collect/MapMakerInternalMap.java`
#### Snippet
```java
            if (v == valueReference) {
              ++modCount;
              E newFirst = removeFromChain(first, e);
              newCount = this.count - 1;
              table.set(index, newFirst);
              this.count = newCount; // write-volatile
              return true;
            }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
            while (iterator2.hasNext()) {
              Entry<? extends E> entry2 = iterator2.next();
              E element = entry2.getElement();
              if (!multiset1.contains(element)) {
                return immutableEntry(element, entry2.getCount());
              }
            }
            return endOfData();
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/collect/Platform.java`
#### Snippet
```java
    String propertyName = "guava.gwt.emergency_reenable_rpc";

    if (!Boolean.parseBoolean(System.getProperty(propertyName, "false"))) {
      throw new UnsupportedOperationException(
          com.google.common.base.Strings.lenientFormat(
              "We are removing GWT-RPC support for Guava types. You can temporarily reenable"
                  + " support by setting the system property %s to true. For more about system"
                  + " properties, see %s. For more about Guava's GWT-RPC support, see %s.",
              propertyName,
              "https://stackoverflow.com/q/5189914/28465",
              "https://groups.google.com/d/msg/guava-announce/zHZTFg7YF3o/rQNnwdHeEwAJ"));
    }
    logger.log(
        java.util.logging.Level.WARNING,
        "Later in 2020, we will remove GWT-RPC support for Guava types. You are seeing this"
            + " warning because you are sending a Guava type over GWT-RPC, which will break. You"
            + " can identify which type by looking at the class name in the attached stack trace.",
        new Throwable());
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
        int initHeight = initLeft.height;

        left = initLeft.add(comparator, e, count, result);
        if (result[0] == 0) {
          distinctElements++;
        }
        this.totalCount += count;
        return (left.height == initHeight) ? this : rebalance();
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
        AvlNode<E> initLeft = left;
        if (initLeft == null) {
          result[0] = 0;
          return this;
        }

        left = initLeft.remove(comparator, e, count, result);

        if (result[0] > 0) {
          if (count >= result[0]) {
            this.distinctElements--;
            this.totalCount -= result[0];
          } else {
            this.totalCount -= count;
          }
        }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
        left = initLeft.setCount(comparator, e, count, result);

        if (count == 0 && result[0] != 0) {
          this.distinctElements--;
        } else if (count > 0 && result[0] == 0) {
          this.distinctElements++;
        }

        this.totalCount += count - result[0];
        return rebalance();
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/collect/TreeMultiset.java`
#### Snippet
```java
        left = initLeft.setCount(comparator, e, expectedCount, newCount, result);

        if (result[0] == expectedCount) {
          if (newCount == 0 && result[0] != 0) {
            this.distinctElements--;
          } else if (newCount > 0 && result[0] == 0) {
            this.distinctElements++;
          }
          this.totalCount += newCount - result[0];
        }
        return rebalance();
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/escape/ArrayBasedCharEscaper.java`
#### Snippet
```java
    checkNotNull(s); // GWT specific check (do not optimize).
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if ((c < replacementsLength && replacements[c] != null) || c > safeMax || c < safeMin) {
        return escapeSlow(s, i);
      }
    }
    return s;
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/escape/ArrayBasedCharEscaper.java`
#### Snippet
```java
    if (c < replacementsLength) {
      char[] chars = replacements[c];
      if (chars != null) {
        return chars;
      }
    }
    if (c >= safeMin && c <= safeMax) {
      return null;
    }
    return escapeUnsafe(c);
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/graph/AbstractBaseGraph.java`
#### Snippet
```java
      @SuppressWarnings("unchecked")
      @Override
      public boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof EndpointPair)) {
          return false;
        }
        EndpointPair<?> endpointPair = (EndpointPair<?>) obj;
        return isOrderingCompatible(endpointPair)
            && nodes().contains(endpointPair.nodeU())
            && successors((N) endpointPair.nodeU()).contains(endpointPair.nodeV());
      }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/hash/FarmHashFingerprint64.java`
#### Snippet
```java
    long a = (u ^ v) * mul;
    a ^= (a >>> 47);
    long b = (v ^ a) * mul;
    b ^= (b >>> 47);
    b *= mul;
    return b;
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/hash/FarmHashFingerprint64.java`
#### Snippet
```java
    long mul = K2 + length * 2L;
    long a = load64(bytes, offset) * K1;
    long b = load64(bytes, offset + 8);
    long c = load64(bytes, offset + length - 8) * mul;
    long d = load64(bytes, offset + length - 16) * K2;
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/io/Files.java`
#### Snippet
```java
            new LineProcessor<List<String>>() {
              final List<String> result = Lists.newArrayList();

              @Override
              public boolean processLine(String line) {
                result.add(line);
                return true;
              }

              @Override
              public List<String> getResult() {
                return result;
              }
            });
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
      switch (k) {
        case 0:
          return accum;
        case 1:
          return b * accum;
        default:
          accum *= ((k & 1) == 0) ? 1 : b;
          b *= b;
      }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/math/IntMath.java`
#### Snippet
```java
    while (true) {
      switch (k) {
        case 0:
          return accum;
        case 1:
          return saturatedMultiply(accum, b);
        default:
          if ((k & 1) != 0) {
            accum = saturatedMultiply(accum, b);
          }
          k >>= 1;
          if (k > 0) {
            if (-FLOOR_SQRT_MAX_INT > b | b > FLOOR_SQRT_MAX_INT) {
              return limit;
            }
            b *= b;
          }
      }
    }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/math/PairedStats.java`
#### Snippet
```java
    checkState(count() > 1);
    if (isNaN(sumOfProductsOfDeltas)) {
      return LinearTransformation.forNaN();
    }
    double xSumOfSquaresOfDeltas = xStats.sumOfSquaresOfDeltas();
    if (xSumOfSquaresOfDeltas > 0.0) {
      if (yStats.sumOfSquaresOfDeltas() > 0.0) {
        return LinearTransformation.mapping(xStats.mean(), yStats.mean())
            .withSlope(sumOfProductsOfDeltas / xSumOfSquaresOfDeltas);
      } else {
        return LinearTransformation.horizontal(yStats.mean());
      }
    } else {
      checkState(yStats.sumOfSquaresOfDeltas() > 0.0);
      return LinearTransformation.vertical(xStats.mean());
    }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/math/Stats.java`
#### Snippet
```java
    checkArgument(values.length > 0);
    double mean = values[0];
    for (int index = 1; index < values.length; index++) {
      double value = values[index];
      if (isFinite(value) && isFinite(mean)) {
        // Art of Computer Programming vol. 2, Knuth, 4.2.2, (15)
        mean += (value - mean) / (index + 1);
      } else {
        mean = calculateNewMeanNonFinite(mean, value);
      }
    }
    return mean;
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/net/PercentEscaper.java`
#### Snippet
```java
      dest[8] = UPPER_HEX_DIGITS[cp & 0xF];
      cp >>>= 4;
      dest[7] = UPPER_HEX_DIGITS[0x8 | (cp & 0x3)];
      cp >>>= 2;
      dest[5] = UPPER_HEX_DIGITS[cp & 0xF];
      cp >>>= 4;
      dest[4] = UPPER_HEX_DIGITS[0x8 | (cp & 0x3)];
      cp >>>= 2;
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/primitives/Booleans.java`
#### Snippet
```java
    checkNotNull(array, "array");
    checkNotNull(target, "target");
    if (target.length == 0) {
      return 0;
    }

    outer:
    for (int i = 0; i < array.length - target.length + 1; i++) {
      for (int j = 0; j < target.length; j++) {
        if (array[i + j] != target[j]) {
          continue outer;
        }
      }
      return i;
    }
    return -1;
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/primitives/Booleans.java`
#### Snippet
```java
    checkNotNull(array);
    checkPositionIndexes(fromIndex, toIndex, array.length);
    if (array.length <= 1) {
      return;
    }

    int length = toIndex - fromIndex;
    // Obtain m = (-distance mod length), a non-negative value less than "length". This is how many
    // places left to rotate.
    int m = -distance % length;
    m = (m < 0) ? m + length : m;
    // The current index of what will become the first element of the rotated section.
    int newFirstIndex = m + fromIndex;
    if (newFirstIndex == fromIndex) {
      return;
    }

    reverse(array, fromIndex, newFirstIndex);
    reverse(array, newFirstIndex, toIndex);
    reverse(array, fromIndex, toIndex);
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/primitives/Bytes.java`
#### Snippet
```java
      StringBuilder builder = new StringBuilder(size() * 5);
      builder.append('[').append(array[start]);
      for (int i = start + 1; i < end; i++) {
        builder.append(", ").append(array[i]);
      }
      return builder.append(']').toString();
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/primitives/Doubles.java`
#### Snippet
```java
    checkNotNull(separator);
    if (array.length == 0) {
      return "";
    }

    // For pre-sizing a builder, just get the right order of magnitude
    StringBuilder builder = new StringBuilder(array.length * 12);
    builder.append(array[0]);
    for (int i = 1; i < array.length; i++) {
      builder.append(separator).append(array[i]);
    }
    return builder.toString();
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/primitives/Doubles.java`
#### Snippet
```java
      StringBuilder builder = new StringBuilder(size() * 12);
      builder.append('[').append(array[start]);
      for (int i = start + 1; i < end; i++) {
        builder.append(", ").append(array[i]);
      }
      return builder.append(']').toString();
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/primitives/ImmutableDoubleArray.java`
#### Snippet
```java
    if (isEmpty()) {
      return "[]";
    }
    StringBuilder builder = new StringBuilder(length() * 5); // rough estimate is fine
    builder.append('[').append(array[start]);

    for (int i = start + 1; i < end; i++) {
      builder.append(", ").append(array[i]);
    }
    builder.append(']');
    return builder.toString();
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/primitives/Ints.java`
#### Snippet
```java
    checkNotNull(separator);
    if (array.length == 0) {
      return "";
    }

    // For pre-sizing a builder, just get the right order of magnitude
    StringBuilder builder = new StringBuilder(array.length * 5);
    builder.append(array[0]);
    for (int i = 1; i < array.length; i++) {
      builder.append(separator).append(array[i]);
    }
    return builder.toString();
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/primitives/UnsignedBytes.java`
#### Snippet
```java
    checkArgument(array.length > 0);
    int min = toInt(array[0]);
    for (int i = 1; i < array.length; i++) {
      int next = toInt(array[i]);
      if (next < min) {
        min = next;
      }
    }
    return (byte) min;
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/primitives/UnsignedBytes.java`
#### Snippet
```java
    checkNotNull(array);
    checkPositionIndexes(fromIndex, toIndex, array.length);
    for (int i = fromIndex; i < toIndex; i++) {
      array[i] = flip(array[i]);
    }
    Arrays.sort(array, fromIndex, toIndex);
    for (int i = fromIndex; i < toIndex; i++) {
      array[i] = flip(array[i]);
    }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/primitives/UnsignedInts.java`
#### Snippet
```java
    checkArgument(array.length > 0);
    int min = flip(array[0]);
    for (int i = 1; i < array.length; i++) {
      int next = flip(array[i]);
      if (next < min) {
        min = next;
      }
    }
    return flip(min);
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/primitives/UnsignedInts.java`
#### Snippet
```java
    checkNotNull(separator);
    if (array.length == 0) {
      return "";
    }

    // For pre-sizing a builder, just get the right order of magnitude
    StringBuilder builder = new StringBuilder(array.length * 5);
    builder.append(toString(array[0]));
    for (int i = 1; i < array.length; i++) {
      builder.append(separator).append(toString(array[i]));
    }
    return builder.toString();
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/primitives/UnsignedLongs.java`
#### Snippet
```java
    checkArgument(array.length > 0);
    long min = flip(array[0]);
    for (int i = 1; i < array.length; i++) {
      long next = flip(array[i]);
      if (next < min) {
        min = next;
      }
    }
    return flip(min);
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
    boolean interrupted = false;
    try {
      while (true) {
        try {
          return future.get();
        } catch (InterruptedException e) {
          interrupted = true;
        }
      }
    } finally {
      if (interrupted) {
        Thread.currentThread().interrupt();
      }
    }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/util/concurrent/AtomicDouble.java`
#### Snippet
```java
    while (true) {
      long current = value;
      double currentVal = longBitsToDouble(current);
      double nextVal = updateFunction.applyAsDouble(currentVal);
      long next = doubleToRawLongBits(nextVal);
      if (updater.compareAndSet(this, current, next)) {
        return currentVal;
      }
    }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/util/concurrent/AtomicDoubleArray.java`
#### Snippet
```java
    while (true) {
      long current = longs.get(i);
      double currentVal = longBitsToDouble(current);
      double nextVal = updaterFunction.applyAsDouble(currentVal);
      long next = doubleToRawLongBits(nextVal);
      if (longs.compareAndSet(i, current, next)) {
        return currentVal;
      }
    }
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/util/concurrent/MoreExecutors.java`
#### Snippet
```java
    checkNotNull(service);
    checkNotNull(nameSupplier);
    return new WrappingExecutorService(service) {
      @Override
      protected <T extends @Nullable Object> Callable<T> wrapTask(Callable<T> callable) {
        return Callables.threadRenaming(callable, nameSupplier);
      }

      @Override
      protected Runnable wrapTask(Runnable command) {
        return Callables.threadRenaming(command, nameSupplier);
      }
    };
```

### DuplicatedCode
Duplicated code
in `guava/src/com/google/common/util/concurrent/Uninterruptibles.java`
#### Snippet
```java
    boolean interrupted = false;
    try {
      long remainingNanos = unit.toNanos(timeout);
      long end = System.nanoTime() + remainingNanos;

      while (true) {
        try {
          // CountDownLatch treats negative timeouts just like zero.
          return latch.await(remainingNanos, NANOSECONDS);
        } catch (InterruptedException e) {
          interrupted = true;
          remainingNanos = end - System.nanoTime();
        }
      }
    } finally {
      if (interrupted) {
        Thread.currentThread().interrupt();
      }
    }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
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

### CatchMayIgnoreException
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

### CatchMayIgnoreException
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

### CatchMayIgnoreException
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

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `guava/src/com/google/common/io/Files.java`
#### Snippet
```java
    checkNotNull(file);
    checkNotNull(charset);
    return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
  }

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `guava/src/com/google/common/io/Files.java`
#### Snippet
```java
    checkNotNull(file);
    checkNotNull(charset);
    return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
  }

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `guava/src/com/google/common/io/FileBackedOutputStream.java`
#### Snippet
```java
  private synchronized InputStream openInputStream() throws IOException {
    if (file != null) {
      return new FileInputStream(file);
    } else {
      // requireNonNull is safe because we always have either `file` or `memory`.
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
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

### UnnecessaryToStringCall
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

### UnnecessaryToStringCall
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

### UnnecessaryToStringCall
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

### UnnecessaryToStringCall
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

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `guava/src/com/google/common/hash/BloomFilter.java`
#### Snippet
```java
    long bitCount = bits.bitCount();

    /**
     * Each insertion is expected to reduce the # of clear bits by a factor of
     * `numHashFunctions/bitSize`. So, after n insertions, expected bitCount is `bitSize * (1 - (1 -
```

### DanglingJavadoc
Dangling Javadoc comment
in `guava/src/com/google/common/util/concurrent/Monitor.java`
#### Snippet
```java
  }

  /**
   * Exactly like signalNextWaiter, but caller guarantees that guardToSkip need not be considered,
   * because caller has previously checked that guardToSkip.isSatisfied() returned false. An
```

### DanglingJavadoc
Dangling Javadoc comment
in `guava/src/com/google/common/cache/ReferenceEntry.java`
#### Snippet
```java

  @SuppressWarnings("GoodTime")
  /** Returns the time that this entry was last written, in ns. */
  long getWriteTime();

```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Table.containsColumn()'
in `guava/src/com/google/common/collect/Tables.java`
#### Snippet
```java
    @Override
    public boolean containsRow(@CheckForNull Object rowKey) {
      return original.containsColumn(rowKey);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'Table.containsRow()'
in `guava/src/com/google/common/collect/Tables.java`
#### Snippet
```java
    @Override
    public boolean containsColumn(@CheckForNull Object columnKey) {
      return original.containsRow(columnKey);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'AbstractMultimap.containsEntry()'
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
      if (object instanceof Entry) {
        Entry<?, ?> entry = (Entry<?, ?>) object;
        return multimap.containsEntry(entry.getKey(), entry.getValue());
      }
      return false;
```

### SuspiciousMethodCalls
Suspicious call to 'AbstractMultimap.containsEntry()'
in `guava/src/com/google/common/collect/ImmutableSetMultimap.java`
#### Snippet
```java
      if (object instanceof Entry) {
        Entry<?, ?> entry = (Entry<?, ?>) object;
        return multimap.containsEntry(entry.getKey(), entry.getValue());
      }
      return false;
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `guava/src/com/google/common/collect/AbstractMapBasedMultiset.java`
#### Snippet
```java
    }
    checkArgument(occurrences > 0, "occurrences cannot be negative: %s", occurrences);
    Count frequency = backingMap.get(element);
    if (frequency == null) {
      return 0;
```

### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `guava/src/com/google/common/collect/AbstractMapBasedMultiset.java`
#### Snippet
```java
    } else {
      numberRemoved = oldCount;
      backingMap.remove(element);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'Multimap.containsKey()'
in `guava/src/com/google/common/collect/FilteredKeyMultimap.java`
#### Snippet
```java
      if (o instanceof Entry) {
        Entry<?, ?> entry = (Entry<?, ?>) o;
        if (unfiltered.containsKey(entry.getKey())
            // if this holds, then we know entry.getKey() is a K
            && keyPredicate.apply((K) entry.getKey())) {
```

### SuspiciousMethodCalls
Suspicious call to 'Multimap.remove()'
in `guava/src/com/google/common/collect/FilteredKeyMultimap.java`
#### Snippet
```java
            // if this holds, then we know entry.getKey() is a K
            && keyPredicate.apply((K) entry.getKey())) {
          return unfiltered.remove(entry.getKey(), entry.getValue());
        }
      }
```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.get()'
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
              @Override
              public boolean contains(@CheckForNull Object o) {
                Integer i = index.get(o);
                return i != null && copy.get(i);
              }
```

### SuspiciousMethodCalls
'Set' may not contain objects of type 'E'
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
      @Override
      public boolean isEmpty() {
        return set2.containsAll(set1);
      }

```

### SuspiciousMethodCalls
'ImmutableSet' may not contain objects of type 'capture of ?'
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
      if (obj instanceof Set) {
        Set<?> set = (Set<?>) obj;
        return inputSet.keySet().containsAll(set);
      }
      return false;
```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.get()'
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
    @Override
    public boolean contains(@CheckForNull Object o) {
      Integer index = inputSet.get(o);
      return index != null && (mask & (1 << index)) != 0;
    }
```

### SuspiciousMethodCalls
'ImmutableSet' may not contain objects of type 'capture of ?'
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
        if (o instanceof Set) {
          Set<?> s = (Set<?>) o;
          return s.size() == size && index.keySet().containsAll(s);
        }
        return false;
```

### SuspiciousMethodCalls
'Set' may not contain objects of type 'capture of ?'
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java

      try {
        return s.size() == o.size() && s.containsAll(o);
      } catch (NullPointerException | ClassCastException ignored) {
        return false;
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `guava/src/com/google/common/graph/AbstractDirectedNetworkConnections.java`
#### Snippet
```java
      @Override
      public boolean contains(@CheckForNull Object obj) {
        return inEdgeMap.containsKey(obj) || outEdgeMap.containsKey(obj);
      }
    };
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `guava/src/com/google/common/graph/AbstractDirectedNetworkConnections.java`
#### Snippet
```java
      @Override
      public boolean contains(@CheckForNull Object obj) {
        return inEdgeMap.containsKey(obj) || outEdgeMap.containsKey(obj);
      }
    };
```

### SuspiciousMethodCalls
Suspicious call to 'Map.getOrDefault()'
in `guava/src/com/google/common/collect/JdkBackedImmutableMultiset.java`
#### Snippet
```java
  @Override
  public int count(@CheckForNull Object element) {
    return delegateMap.getOrDefault(element, 0);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `guava/src/com/google/common/reflect/TypeToken.java`
#### Snippet
```java

  private boolean isWrapper() {
    return Primitives.allWrapperTypes().contains(runtimeType);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableList.indexOf()'
in `guava/src/com/google/common/collect/ImmutableList.java`
#### Snippet
```java
    @Override
    public int lastIndexOf(@CheckForNull Object object) {
      int index = forwardList.indexOf(object);
      return (index >= 0) ? reverseIndex(index) : -1;
    }
```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableList.lastIndexOf()'
in `guava/src/com/google/common/collect/ImmutableList.java`
#### Snippet
```java
    @Override
    public int indexOf(@CheckForNull Object object) {
      int index = forwardList.lastIndexOf(object);
      return (index >= 0) ? reverseIndex(index) : -1;
    }
```

### SuspiciousMethodCalls
Suspicious call to 'ConcurrentMap.remove()'
in `guava/src/com/google/common/collect/ConcurrentHashMultiset.java`
#### Snippet
```java
          // Just CASed to 0; remove the entry to clean up the map. If the removal fails,
          // another thread has already replaced it with a new counter, which is fine.
          countMap.remove(element, existingCounter);
        }
        return true;
```

### SuspiciousMethodCalls
Suspicious call to 'ConcurrentMap.remove()'
in `guava/src/com/google/common/collect/ConcurrentHashMultiset.java`
#### Snippet
```java
            // Just CASed to 0; remove the entry to clean up the map. If the removal fails,
            // another thread has already replaced it with a new counter, which is fine.
            countMap.remove(element, existingCounter);
          }
          return oldValue;
```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.containsKey()'
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
  @Override
  public boolean containsColumn(@CheckForNull Object columnKey) {
    return columnKeyToIndex.containsKey(columnKey);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.get()'
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
  @CheckForNull
  public V erase(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
    Integer rowIndex = rowKeyToIndex.get(rowKey);
    Integer columnIndex = columnKeyToIndex.get(columnKey);
    if (rowIndex == null || columnIndex == null) {
```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.get()'
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
  public V erase(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
    Integer rowIndex = rowKeyToIndex.get(rowKey);
    Integer columnIndex = columnKeyToIndex.get(columnKey);
    if (rowIndex == null || columnIndex == null) {
      return null;
```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.get()'
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
  @CheckForNull
  public V get(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
    Integer rowIndex = rowKeyToIndex.get(rowKey);
    Integer columnIndex = columnKeyToIndex.get(columnKey);
    return (rowIndex == null || columnIndex == null) ? null : at(rowIndex, columnIndex);
```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.get()'
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
  public V get(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
    Integer rowIndex = rowKeyToIndex.get(rowKey);
    Integer columnIndex = columnKeyToIndex.get(columnKey);
    return (rowIndex == null || columnIndex == null) ? null : at(rowIndex, columnIndex);
  }
```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.containsKey()'
in `guava/src/com/google/common/collect/ArrayTable.java`
#### Snippet
```java
  @Override
  public boolean containsRow(@CheckForNull Object rowKey) {
    return rowKeyToIndex.containsKey(rowKey);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsValue()'
in `guava/src/com/google/common/collect/AbstractTable.java`
#### Snippet
```java
  public boolean containsValue(@CheckForNull Object value) {
    for (Map<C, V> row : rowMap().values()) {
      if (row.containsValue(value)) {
        return true;
      }
```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.get()'
in `guava/src/com/google/common/collect/DenseImmutableTable.java`
#### Snippet
```java
  @CheckForNull
  public V get(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
    Integer rowIndex = rowKeyToIndex.get(rowKey);
    Integer columnIndex = columnKeyToIndex.get(columnKey);
    return ((rowIndex == null) || (columnIndex == null)) ? null : values[rowIndex][columnIndex];
```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.get()'
in `guava/src/com/google/common/collect/DenseImmutableTable.java`
#### Snippet
```java
  public V get(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
    Integer rowIndex = rowKeyToIndex.get(rowKey);
    Integer columnIndex = columnKeyToIndex.get(columnKey);
    return ((rowIndex == null) || (columnIndex == null)) ? null : values[rowIndex][columnIndex];
  }
```

### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
  @Override
  public Collection<V> removeAll(@CheckForNull Object key) {
    Collection<V> collection = map.remove(key);

    if (collection == null) {
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java
  @Override
  public boolean containsKey(@CheckForNull Object key) {
    return map.containsKey(key);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMultimap.containsValue()'
in `guava/src/com/google/common/collect/ImmutableMultimap.java`
#### Snippet
```java
    @Override
    public boolean contains(@CheckForNull Object object) {
      return multimap.containsValue(object);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.get()'
in `guava/src/com/google/common/collect/ImmutableMultimap.java`
#### Snippet
```java
    @Override
    public int count(@CheckForNull Object element) {
      Collection<V> values = map.get(element);
      return (values == null) ? 0 : values.size();
    }
```

### SuspiciousMethodCalls
Suspicious call to 'AbstractMultimap.containsEntry()'
in `guava/src/com/google/common/collect/ImmutableMultimap.java`
#### Snippet
```java
      if (object instanceof Entry) {
        Entry<?, ?> entry = (Entry<?, ?>) object;
        return multimap.containsEntry(entry.getKey(), entry.getValue());
      }
      return false;
```

### SuspiciousMethodCalls
Suspicious call to 'AbstractMultimap.containsEntry()'
in `guava/src/com/google/common/collect/ImmutableMultimap.java`
#### Snippet
```java
      if (object instanceof Entry) {
        Entry<?, ?> entry = (Entry<?, ?>) object;
        return multimap.containsEntry(entry.getKey(), entry.getValue());
      }
      return false;
```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.containsKey()'
in `guava/src/com/google/common/collect/ImmutableMultimap.java`
#### Snippet
```java
  @Override
  public boolean containsKey(@CheckForNull Object key) {
    return map.containsKey(key);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  @Override
  public boolean remove(@CheckForNull Object key, @CheckForNull Object value) {
    Collection<V> collection = asMap().get(key);
    return collection != null && collection.remove(value);
  }
```

### SuspiciousMethodCalls
Suspicious call to 'Collection.remove()'
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  public boolean remove(@CheckForNull Object key, @CheckForNull Object value) {
    Collection<V> collection = asMap().get(key);
    return collection != null && collection.remove(value);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'Collection.contains()'
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  public boolean containsValue(@CheckForNull Object value) {
    for (Collection<V> collection : asMap().values()) {
      if (collection.contains(value)) {
        return true;
      }
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  @Override
  public boolean containsEntry(@CheckForNull Object key, @CheckForNull Object value) {
    Collection<V> collection = asMap().get(key);
    return collection != null && collection.contains(value);
  }
```

### SuspiciousMethodCalls
Suspicious call to 'Collection.contains()'
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java
  public boolean containsEntry(@CheckForNull Object key, @CheckForNull Object value) {
    Collection<V> collection = asMap().get(key);
    return collection != null && collection.contains(value);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    @Override
    public boolean containsKey(@CheckForNull Object key) {
      return backingSet().contains(key);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsValue()'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    @Override
    public boolean contains(@CheckForNull Object o) {
      return map().containsValue(o);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    @Override
    public boolean containsKey(@CheckForNull Object key) {
      return unfiltered.containsKey(key) && apply(key, unfiltered.get(key));
    }

```

### SuspiciousMethodCalls
Suspicious call to 'Set.remove()'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    @CheckForNull
    public V remove(@CheckForNull Object key) {
      if (backingSet().remove(key)) {
        @SuppressWarnings("unchecked") // unsafe, but Javadoc warns about it
        K k = (K) key;
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    @CheckForNull
    public V2 remove(@CheckForNull Object key) {
      return fromMap.containsKey(key)
          // The cast is safe because of the containsKey check.
          ? transformer.transformEntry((K) key, uncheckedCastNullableTToT(fromMap.remove(key)))
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    @CheckForNull
    public V2 getOrDefault(@CheckForNull Object key, @CheckForNull V2 defaultValue) {
      V1 value = fromMap.get(key);
      if (value != null || fromMap.containsKey(key)) {
        // The cast is safe because of the containsKey check.
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    public V2 getOrDefault(@CheckForNull Object key, @CheckForNull V2 defaultValue) {
      V1 value = fromMap.get(key);
      if (value != null || fromMap.containsKey(key)) {
        // The cast is safe because of the containsKey check.
        return transformer.transformEntry((K) key, uncheckedCastNullableTToT(value));
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
        Object key = entry.getKey();
        V value = Maps.safeGet(map(), key);
        return Objects.equal(value, entry.getValue()) && (value != null || map().containsKey(key));
      }
      return false;
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java
    @Override
    public boolean contains(@CheckForNull Object o) {
      return map().containsKey(o);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.get()'
in `guava/src/com/google/common/collect/ImmutableMapEntrySet.java`
#### Snippet
```java
    if (object instanceof Entry) {
      Entry<?, ?> entry = (Entry<?, ?>) object;
      V value = map().get(entry.getKey());
      return value != null && value.equals(entry.getValue());
    }
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    public Set<V> removeAll(@CheckForNull Object key) {
      Set<V> values = new HashSet<V>(2);
      if (!map.containsKey(key)) {
        return values;
      }
```

### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
        return values;
      }
      values.add(map.remove(key));
      return values;
    }
```

### SuspiciousMethodCalls
Suspicious call to 'Multimap.remove()'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
      if (o instanceof Map.Entry) {
        Map.Entry<?, ?> entry = (Map.Entry<?, ?>) o;
        return multimap().remove(entry.getKey(), entry.getValue());
      }
      return false;
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsValue()'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    @Override
    public boolean containsValue(@CheckForNull Object value) {
      return map.containsValue(value);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'Multimap.removeAll()'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    @CheckForNull
    public Collection<V> remove(@CheckForNull Object key) {
      return containsKey(key) ? multimap.removeAll(key) : null;
    }

```

### SuspiciousMethodCalls
Suspicious call to 'Multimap.containsEntry()'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
      if (o instanceof Map.Entry) {
        Map.Entry<?, ?> entry = (Map.Entry<?, ?>) o;
        return multimap().containsEntry(entry.getKey(), entry.getValue());
      }
      return false;
```

### SuspiciousMethodCalls
Suspicious call to 'Multimap.containsEntry()'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
      if (o instanceof Map.Entry) {
        Map.Entry<?, ?> entry = (Map.Entry<?, ?>) o;
        return multimap().containsEntry(entry.getKey(), entry.getValue());
      }
      return false;
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    @Override
    public boolean containsKey(@CheckForNull Object key) {
      return map.containsKey(key);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'Multimap.containsKey()'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    @Override
    public boolean contains(@CheckForNull Object element) {
      return multimap.containsKey(element);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'Set.remove()'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java

    void removeValuesForKey(@CheckForNull Object key) {
      multimap.keySet().remove(key);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'Collection.remove()'
in `guava/src/com/google/common/collect/Multimaps.java`
#### Snippet
```java
    @Override
    public boolean remove(@CheckForNull Object key, @CheckForNull Object value) {
      return get((K) key).remove(value);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'Multiset.count()'
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
          return false;
        }
        int count = multiset().count(entry.getElement());
        return count == entry.getCount();
      }
```

### SuspiciousMethodCalls
'Set' may not contain objects of type 'capture of ?'
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
            : elementsToRemove;

    return self.elementSet().removeAll(collection);
  }

```

### SuspiciousMethodCalls
'Set' may not contain objects of type 'capture of ?'
in `guava/src/com/google/common/collect/Multisets.java`
#### Snippet
```java
            : elementsToRetain;

    return self.elementSet().retainAll(collection);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `guava/src/com/google/common/graph/MultiEdgesConnecting.java`
#### Snippet
```java
  @Override
  public boolean contains(@CheckForNull Object edge) {
    return targetNode.equals(outEdgeToNode.get(edge));
  }
}
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `guava/src/com/google/common/collect/FilteredEntryMultimap.java`
#### Snippet
```java
        return count(key);
      }
      Collection<V> collection = unfiltered.asMap().get(key);
      if (collection == null) {
        return 0;
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `guava/src/com/google/common/collect/FilteredEntryMultimap.java`
#### Snippet
```java
  @Override
  public boolean containsKey(@CheckForNull Object key) {
    return asMap().get(key) != null;
  }

```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `guava/src/com/google/common/collect/FilteredEntryMultimap.java`
#### Snippet
```java
    @CheckForNull
    public Collection<V> remove(@CheckForNull Object key) {
      Collection<V> collection = unfiltered.asMap().get(key);
      if (collection == null) {
        return null;
```

### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `guava/src/com/google/common/collect/FilteredEntryMultimap.java`
#### Snippet
```java
  @Override
  public Collection<V> removeAll(@CheckForNull Object key) {
    return MoreObjects.firstNonNull(asMap().remove(key), unmodifiableEmptyCollection());
  }

```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `guava/src/com/google/common/cache/AbstractCache.java`
#### Snippet
```java
    Map<K, V> result = Maps.newLinkedHashMap();
    for (Object key : keys) {
      if (!result.containsKey(key)) {
        @SuppressWarnings("unchecked")
        K castKey = (K) key;
```

### SuspiciousMethodCalls
Suspicious call to 'LocalCache.remove()'
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
    public void invalidate(Object key) {
      checkNotNull(key);
      localCache.remove(key);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.containsKey()'
in `guava/src/com/google/common/collect/ImmutableMapKeySet.java`
#### Snippet
```java
  @Override
  public boolean contains(@CheckForNull Object object) {
    return map.containsKey(object);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `guava/src/com/google/common/graph/DirectedGraphConnections.java`
#### Snippet
```java
      @Override
      public boolean contains(@CheckForNull Object obj) {
        return isPredecessor(adjacentNodeValues.get(obj));
      }
    };
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `guava/src/com/google/common/graph/DirectedGraphConnections.java`
#### Snippet
```java
      @Override
      public boolean contains(@CheckForNull Object obj) {
        return isSuccessor(adjacentNodeValues.get(obj));
      }
    };
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `guava/src/com/google/common/graph/DirectedGraphConnections.java`
#### Snippet
```java
        @Override
        public boolean contains(@CheckForNull Object obj) {
          return adjacentNodeValues.containsKey(obj);
        }
      };
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `guava/src/com/google/common/graph/DirectedGraphConnections.java`
#### Snippet
```java
  public V removeSuccessor(Object node) {
    checkNotNull(node);
    Object previousValue = adjacentNodeValues.get(node);
    Object removedValue;

```

### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `guava/src/com/google/common/graph/DirectedGraphConnections.java`
#### Snippet
```java
      removedValue = ((PredAndSucc) previousValue).successorValue;
    } else { // successor
      adjacentNodeValues.remove(node);
      removedValue = previousValue;
    }
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `guava/src/com/google/common/graph/MapIteratorCache.java`
#### Snippet
```java

  final boolean containsKey(@CheckForNull Object key) {
    return getIfCached(key) != null || backingMap.containsKey(key);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `guava/src/com/google/common/graph/MapIteratorCache.java`
#### Snippet
```java
  final V getWithoutCaching(Object key) {
    checkNotNull(key);
    return backingMap.get(key);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `guava/src/com/google/common/graph/MapIteratorCache.java`
#### Snippet
```java
    checkNotNull(key);
    clearCache();
    return backingMap.remove(key);
  }

```

### SuspiciousMethodCalls
'Collection' may not contain objects of type 'capture of ?'
in `guava/src/com/google/common/collect/Iterables.java`
#### Snippet
```java
  public static boolean removeAll(Iterable<?> removeFrom, Collection<?> elementsToRemove) {
    return (removeFrom instanceof Collection)
        ? ((Collection<?>) removeFrom).removeAll(checkNotNull(elementsToRemove))
        : Iterators.removeAll(removeFrom.iterator(), elementsToRemove);
  }
```

### SuspiciousMethodCalls
'Collection' may not contain objects of type 'capture of ?'
in `guava/src/com/google/common/collect/Iterables.java`
#### Snippet
```java
  public static boolean retainAll(Iterable<?> removeFrom, Collection<?> elementsToRetain) {
    return (removeFrom instanceof Collection)
        ? ((Collection<?>) removeFrom).retainAll(checkNotNull(elementsToRetain))
        : Iterators.retainAll(removeFrom.iterator(), elementsToRetain);
  }
```

### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
      return null;
    }
    V value = map.remove(columnKey);
    if (map.isEmpty()) {
      backingMap.remove(rowKey);
```

### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
    V value = map.remove(columnKey);
    if (map.isEmpty()) {
      backingMap.remove(rowKey);
    }
    return value;
```

### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java
    while (iterator.hasNext()) {
      Entry<R, Map<C, V>> entry = iterator.next();
      V value = entry.getValue().remove(column);
      if (value != null) {
        output.put(entry.getKey(), value);
```

### SuspiciousMethodCalls
Suspicious call to 'Collection.contains()'
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java
    public boolean containsValue(@CheckForNull Object o) {
      // values() and its contains() method are both synchronized.
      return values().contains(o);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableCollection.contains()'
in `guava/src/com/google/common/collect/ImmutableTable.java`
#### Snippet
```java
  @Override
  public boolean containsValue(@CheckForNull Object value) {
    return values().contains(value);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'Multimap.containsValue()'
in `guava/src/com/google/common/collect/FilteredMultimapValues.java`
#### Snippet
```java
  @Override
  public boolean contains(@CheckForNull Object o) {
    return multimap.containsValue(o);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'ConcurrentHashMap.containsKey()'
in `guava/src/com/google/common/util/concurrent/AtomicLongMap.java`
#### Snippet
```java
  /** Returns true if this map contains a mapping for the specified key. */
  public boolean containsKey(Object key) {
    return map.containsKey(key);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
  @Override
  public boolean containsKey(@CheckForNull Object key) {
    return keyToKeyList.containsKey(key);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `guava/src/com/google/common/collect/LinkedListMultimap.java`
#### Snippet
```java
  @Override
  public boolean containsValue(@CheckForNull Object value) {
    return values().contains(value);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableMap.containsKey()'
in `guava/src/com/google/common/collect/RegularImmutableMap.java`
#### Snippet
```java
    @Override
    public boolean contains(@CheckForNull Object object) {
      return map.containsKey(object);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableCollection.contains()'
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
  @Override
  public boolean containsValue(@CheckForNull Object value) {
    return values().contains(value);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java
       * nullness checker.
       */
      if (!esDelegate.contains(object) || !(object instanceof Entry)) {
        return false;
      }
```

### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java
  private V removeFromBothMaps(@CheckForNull Object key) {
    // The cast is safe because the callers of this method first check that the key is present.
    V oldValue = uncheckedCastNullableTToT(delegate.remove(key));
    removeFromInverseMap(oldValue);
    return oldValue;
```

### SuspiciousMethodCalls
Suspicious call to 'ForwardingMap.containsKey()'
in `guava/src/com/google/common/collect/AbstractBiMap.java`
#### Snippet
```java
  @Override
  public boolean containsValue(@CheckForNull Object value) {
    return inverse.containsKey(value);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsValue()'
in `guava/src/com/google/common/collect/HashBiMap.java`
#### Snippet
```java
    @Override
    public boolean containsKey(@CheckForNull Object value) {
      return forward().containsValue(value);
    }

```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `guava/src/com/google/common/net/InternetDomainName.java`
#### Snippet
```java
     */

    if (isFinalPart && DIGIT_MATCHER.matches(part.charAt(0))) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `guava/src/com/google/common/net/InetAddresses.java`
#### Snippet
```java

    byte[] bytes = ip.getAddress();
    if ((bytes[12] == 0)
        && (bytes[13] == 0)
        && (bytes[14] == 0)
```

### TrivialIf
`if` statement can be simplified
in `guava/src/com/google/common/graph/Graphs.java`
#### Snippet
```java
  private static boolean canTraverseWithoutReusingEdge(
      Graph<?> graph, Object nextNode, @CheckForNull Object previousNode) {
    if (graph.isDirected() || !Objects.equal(previousNode, nextNode)) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `guava/src/com/google/common/cache/LocalCache.java`
#### Snippet
```java
      return true;
    }
    if (expiresAfterWrite() && (now - entry.getWriteTime() >= expireAfterWriteNanos)) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `guava/src/com/google/common/collect/MinMaxPriorityQueue.java`
#### Snippet
```java
        return false;
      }
      if ((i > 2) && (compareElements(getGrandparentIndex(i), i) > 0)) {
        return false;
      }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'desiredType'
in `guava/src/com/google/common/net/InternetDomainName.java`
#### Snippet
```java
   * Otherwise, it finds the first suffix of any type.
   */
  private int findSuffixOfType(Optional<PublicSuffixType> desiredType) {
    int partsSize = parts.size();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'parsedCharset'
in `guava/src/com/google/common/net/MediaType.java`
#### Snippet
```java
  @LazyInit private int hashCode;

  @LazyInit @CheckForNull private Optional<Charset> parsedCharset;

  private MediaType(String type, String subtype, ImmutableListMultimap<String, String> parameters) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'expectedNodeCount'
in `guava/src/com/google/common/graph/AbstractGraphBuilder.java`
#### Snippet
```java
  ElementOrder<N> incidentEdgeOrder = ElementOrder.unordered();

  Optional<Integer> expectedNodeCount = Optional.absent();

  /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'expectedEdgeCount'
in `guava/src/com/google/common/graph/NetworkBuilder.java`
#### Snippet
```java
  boolean allowsParallelEdges = false;
  ElementOrder<? super E> edgeOrder = ElementOrder.insertion();
  Optional<Integer> expectedEdgeCount = Optional.absent();

  /** Creates a new instance with the specified edge directionality. */
```

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'secondChoice'
in `guava/src/com/google/common/base/Optional.java`
#### Snippet
```java
   * instead.
   */
  public abstract Optional<T> or(Optional<? extends T> secondChoice);

  /**
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'iterableDelegate'
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
  // Optional.of(this). To access the delegate iterable, call #getDelegate(), which converts to
  // absent() back to 'this'.
  private final Optional<Iterable<E>> iterableDelegate;

  /** Constructor for use by subclasses. */
```

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
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

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `guava/src/com/google/common/base/Charsets.java`
#### Snippet
```java
   *
   */
  public static final Charset UTF_8 = Charset.forName("UTF-8");

  /**
```

### CharsetObjectCanBeUsed
StandardCharsets.US_ASCII can be used instead
in `guava/src/com/google/common/base/Charsets.java`
#### Snippet
```java
  @J2ktIncompatible
  @GwtIncompatible // Charset not supported by GWT
  public static final Charset US_ASCII = Charset.forName("US-ASCII");

  /**
```

### CharsetObjectCanBeUsed
StandardCharsets.ISO_8859_1 can be used instead
in `guava/src/com/google/common/base/Charsets.java`
#### Snippet
```java
   *
   */
  public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

  /**
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_16LE can be used instead
in `guava/src/com/google/common/base/Charsets.java`
#### Snippet
```java
  @J2ktIncompatible
  @GwtIncompatible // Charset not supported by GWT
  public static final Charset UTF_16LE = Charset.forName("UTF-16LE");

  /**
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_16 can be used instead
in `guava/src/com/google/common/base/Charsets.java`
#### Snippet
```java
  @J2ktIncompatible
  @GwtIncompatible // Charset not supported by GWT
  public static final Charset UTF_16 = Charset.forName("UTF-16");

  /*
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_16BE can be used instead
in `guava/src/com/google/common/base/Charsets.java`
#### Snippet
```java
  @J2ktIncompatible
  @GwtIncompatible // Charset not supported by GWT
  public static final Charset UTF_16BE = Charset.forName("UTF-16BE");

  /**
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'URLClassLoader' used without 'try'-with-resources statement
in `guava/src/com/google/common/base/FinalizableReferenceQueue.java`
#### Snippet
```java
         * System class loader will (and must) be the parent.
         */
        ClassLoader finalizerLoader = newLoader(getBaseUrl());
        return finalizerLoader.loadClass(FINALIZER_CLASS_NAME);
      } catch (Exception e) {
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator never returns positive values
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java

    @Override
    public int compareTo(Cut<Comparable<?>> o) {
      return (o == this) ? 0 : -1;
    }
```

### ComparatorMethodParameterNotUsed
Comparator never returns negative values
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java

    @Override
    public int compareTo(Cut<Comparable<?>> o) {
      return (o == this) ? 0 : 1;
    }
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `error` to `ExecutionException` is redundant
in `guava/src/com/google/common/util/concurrent/CombinedFuture.java`
#### Snippet
```java
         * *usually* safely) assumes that getCause() returns non-null on an ExecutionException.
         */
        CombinedFuture.this.setException(((ExecutionException) error).getCause());
      } else if (error instanceof CancellationException) {
        cancel(false);
```

### RedundantCast
Casting `buffer` to `T[]` is redundant
in `guava/src/com/google/common/collect/TopKSelector.java`
#### Snippet
```java
      if (iterations >= maxIterations) {
        @SuppressWarnings("nullness") // safe because we pass sort() a range that contains real Ts
        T[] castBuffer = (T[]) buffer;
        // We've already taken O(k log k), let's make sure we don't take longer than O(k log k).
        Arrays.sort(castBuffer, left, right + 1, comparator);
```

### RedundantCast
Casting `buffer` to `T[]` is redundant
in `guava/src/com/google/common/collect/TopKSelector.java`
#### Snippet
```java
  public List<T> topK() {
    @SuppressWarnings("nullness") // safe because we pass sort() a range that contains real Ts
    T[] castBuffer = (T[]) buffer;
    Arrays.sort(castBuffer, 0, bufferSize, comparator);
    if (bufferSize > k) {
```

### RedundantCast
Casting `entryArray` to `Entry`[] is redundant
in `guava/src/com/google/common/collect/RegularImmutableBiMap.java`
#### Snippet
```java
    @SuppressWarnings("nullness")
    Entry<K, V>[] entries =
        (n == entryArray.length) ? (Entry<K, V>[]) entryArray : createEntryArray(n);
    int hashCode = 0;

```

### RedundantCast
Casting `this` to `SetView<@NonNull E>` is redundant
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
    @SuppressWarnings("nullness") // Unsafe, but we can't fix it now.
    public ImmutableSet<@NonNull E> immutableCopy() {
      return ImmutableSet.copyOf((SetView<@NonNull E>) this);
    }

```

### RedundantCast
Casting `set1` to `Iterable<@NonNull E>` is redundant
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
        ImmutableSet.Builder<@NonNull E> builder =
            new ImmutableSet.Builder<@NonNull E>()
                .addAll((Iterable<@NonNull E>) set1)
                .addAll((Iterable<@NonNull E>) set2);
        return (ImmutableSet<@NonNull E>) builder.build();
```

### RedundantCast
Casting `set2` to `Iterable<@NonNull E>` is redundant
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
            new ImmutableSet.Builder<@NonNull E>()
                .addAll((Iterable<@NonNull E>) set1)
                .addAll((Iterable<@NonNull E>) set2);
        return (ImmutableSet<@NonNull E>) builder.build();
      }
```

### RedundantCast
Casting `builder.build()` to `ImmutableSet<@NonNull E>` is redundant
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java
                .addAll((Iterable<@NonNull E>) set1)
                .addAll((Iterable<@NonNull E>) set2);
        return (ImmutableSet<@NonNull E>) builder.build();
      }
    };
```

### RedundantCast
Casting `null` to `ThreadGroup` is redundant
in `guava/src/com/google/common/base/internal/Finalizer.java`
#### Snippet
```java
        thread =
            bigThreadConstructor.newInstance(
                (ThreadGroup) null, finalizer, threadName, defaultStackSize, inheritThreadLocals);
      } catch (Throwable t) {
        logger.log(
```

### RedundantCast
Casting `null` to `ThreadGroup` is redundant
in `guava/src/com/google/common/base/internal/Finalizer.java`
#### Snippet
```java
    }
    if (thread == null) {
      thread = new Thread((ThreadGroup) null, finalizer, threadName);
    }
    thread.setDaemon(true);
```

### RedundantCast
Casting `entries` to `Entry`[] is redundant
in `guava/src/com/google/common/collect/ImmutableBiMap.java`
#### Snippet
```java
            }
            Arrays.sort(
                (Entry<K, V>[]) entries, // Entries up to size are not null
                0,
                size,
```

### RedundantCast
Casting `EMPTY_SUB_RANGE_MAP` to `RangeMap` is redundant
in `guava/src/com/google/common/collect/TreeRangeMap.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  private RangeMap<K, V> emptySubRangeMap() {
    return (RangeMap<K, V>) (RangeMap<?, ?>) EMPTY_SUB_RANGE_MAP;
  }

```

### RedundantCast
Casting `node` to `N` is redundant
in `guava/src/com/google/common/graph/DirectedGraphConnections.java`
#### Snippet
```java
      removedPredecessor = true;
    } else if (previousValue instanceof PredAndSucc) {
      adjacentNodeValues.put((N) node, ((PredAndSucc) previousValue).successorValue);
      removedPredecessor = true;
    } else {
```

### RedundantCast
Casting `toInt(...)` to `long` is redundant
in `guava/src/com/google/common/hash/Murmur3_128HashFunction.java`
#### Snippet
```java
          k2 ^= (long) toInt(bb.get(9)) << 8; // fall through
        case 9:
          k2 ^= (long) toInt(bb.get(8)); // fall through
        case 8:
          k1 ^= bb.getLong();
```

### RedundantCast
Casting `toInt(...)` to `long` is redundant
in `guava/src/com/google/common/hash/Murmur3_128HashFunction.java`
#### Snippet
```java
          k1 ^= (long) toInt(bb.get(1)) << 8; // fall through
        case 1:
          k1 ^= (long) toInt(bb.get(0));
          break;
        default:
```

### RedundantCast
Casting `ImmutableMap.of(...)` to `Map` is redundant
in `guava/src/com/google/common/collect/SingletonImmutableTable.java`
#### Snippet
```java
  @Override
  public ImmutableMap<R, Map<C, V>> rowMap() {
    return ImmutableMap.of(singleRowKey, (Map<C, V>) ImmutableMap.of(singleColumnKey, singleValue));
  }

```

### RedundantCast
Casting `ImmutableMap.of(...)` to `Map` is redundant
in `guava/src/com/google/common/collect/SingletonImmutableTable.java`
#### Snippet
```java
  @Override
  public ImmutableMap<C, Map<R, V>> columnMap() {
    return ImmutableMap.of(singleColumnKey, (Map<R, V>) ImmutableMap.of(singleRowKey, singleValue));
  }

```

### RedundantCast
Casting `getDelegate()` to `Iterable<@NonNull E>` is redundant
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
  @SuppressWarnings("nullness") // Unsafe, but we can't do much about it now.
  public final <K> ImmutableMap<K, @NonNull E> uniqueIndex(Function<? super E, K> keyFunction) {
    return Maps.uniqueIndex((Iterable<@NonNull E>) getDelegate(), keyFunction);
  }

```

### RedundantCast
Casting `getDelegate()` to `Iterable<@NonNull E>` is redundant
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
  @SuppressWarnings("nullness") // Unsafe, but we can't do much about it now.
  public final <K> ImmutableListMultimap<K, @NonNull E> index(Function<? super E, K> keyFunction) {
    return Multimaps.index((Iterable<@NonNull E>) getDelegate(), keyFunction);
  }

```

### RedundantCast
Casting `getDelegate()` to `Iterable<@NonNull E>` is redundant
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
  @SuppressWarnings("nullness") // Unsafe, but we can't do much about it now.
  public final ImmutableList<@NonNull E> toSortedList(Comparator<? super E> comparator) {
    return Ordering.from(comparator).immutableSortedCopy((Iterable<@NonNull E>) getDelegate());
  }

```

### RedundantCast
Casting `getDelegate()` to `Iterable<@NonNull E>` is redundant
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
  @SuppressWarnings("nullness") // Unsafe, but we can't do much about it now.
  public final ImmutableSet<@NonNull E> toSet() {
    return ImmutableSet.copyOf((Iterable<@NonNull E>) getDelegate());
  }

```

### RedundantCast
Casting `getDelegate()` to `Iterable<@NonNull E>` is redundant
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
  @SuppressWarnings("nullness") // Unsafe, but we can't do much about it now.
  public final ImmutableMultiset<@NonNull E> toMultiset() {
    return ImmutableMultiset.copyOf((Iterable<@NonNull E>) getDelegate());
  }

```

### RedundantCast
Casting `getDelegate()` to `Iterable<@NonNull E>` is redundant
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
  @SuppressWarnings("nullness") // Unsafe, but we can't do much about it now.
  public final ImmutableSortedSet<@NonNull E> toSortedSet(Comparator<? super E> comparator) {
    return ImmutableSortedSet.copyOf(comparator, (Iterable<@NonNull E>) getDelegate());
  }

```

### RedundantCast
Casting `getDelegate()` to `Iterable<@NonNull E>` is redundant
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
  @SuppressWarnings("nullness") // Unsafe, but we can't do much about it now.
  public final ImmutableList<@NonNull E> toList() {
    return ImmutableList.copyOf((Iterable<@NonNull E>) getDelegate());
  }

```

### RedundantCast
Casting `getDelegate()` to `Iterable<@NonNull E>` is redundant
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
  @SuppressWarnings("nullness") // Unsafe, but we can't do much about it now.
  public final <V> ImmutableMap<@NonNull E, V> toMap(Function<? super E, V> valueFunction) {
    return Maps.toMap((Iterable<@NonNull E>) getDelegate(), valueFunction);
  }

```

### RedundantCast
Casting `getDelegate()` to `Iterable<@NonNull E>` is redundant
in `guava/src/com/google/common/collect/FluentIterable.java`
#### Snippet
```java
  @SuppressWarnings("nullness") // Unsafe, but we can't do much about it now.
  public final Optional<@NonNull E> firstMatch(Predicate<? super E> predicate) {
    return Iterables.<E>tryFind((Iterable<@NonNull E>) getDelegate(), predicate);
  }

```

### RedundantCast
Casting `result` to `A[]` is redundant
in `guava/src/com/google/common/reflect/Parameter.java`
#### Snippet
```java
    A[] result = FluentIterable.from(annotations).filter(annotationType).toArray(annotationType);
    @SuppressWarnings("nullness") // safe because the input list contains no nulls
    A[] cast = (A[]) result;
    return cast;
  }
```

### RedundantCast
Casting `entryArray` to `Entry`[] is redundant
in `guava/src/com/google/common/collect/RegularImmutableMap.java`
#### Snippet
```java
    @SuppressWarnings("nullness")
    Entry<K, V>[] entries =
        (n == entryArray.length) ? (Entry<K, V>[]) entryArray : createEntryArray(n);
    int tableSize = Hashing.closedTableSize(n, MAX_LOAD_FACTOR);
    @Nullable ImmutableMapEntry<K, V>[] table = createEntryArray(tableSize);
```

### RedundantCast
Casting `entries` to `Entry`[] is redundant
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
        }
        @SuppressWarnings("nullness") // entries 0..localSize-1 are non-null
        Entry<K, V>[] nonNullEntries = (Entry<K, V>[]) entries;
        if (!throwIfDuplicateKeys) {
          // We want to retain only the last-put value for any given key, before sorting.
```

### RedundantCast
Casting `nonNullEntries` to `@Nullable Entry`[] is redundant
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java
            localSize,
            Ordering.from(valueComparator).onResultOf(Maps.<V>valueFunction()));
        localEntries = (@Nullable Entry<K, V>[]) nonNullEntries;
      }
      entriesUsed = true;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `guava/src/com/google/common/util/concurrent/AbstractExecutionThreadService.java`
#### Snippet
```java
   *
   * <p>...or you could respond to stop requests by implementing {@link #triggerShutdown()}, which
   * should cause {@link #run()} to return.
   */
  protected abstract void run() throws Exception;
```

### JavadocDeclaration
Javadoc pointing to itself
in `guava/src/com/google/common/base/Splitter.java`
#### Snippet
```java
   * "e"]}. The last piece can be smaller than {@code length} but will never be empty.
   *
   * <p><b>Note:</b> if {@link #fixedLength} is used in conjunction with {@link #limit}, the final
   * split piece <i>may be longer than the specified fixed length</i>. This is because the splitter
   * will <i>stop splitting when the limit is reached</i>, and just return the final piece as-is.
```

### JavadocDeclaration
Javadoc pointing to itself
in `guava/src/com/google/common/util/concurrent/AbstractFuture.java`
#### Snippet
```java
   * Callback method that is called exactly once after the future is completed.
   *
   * <p>If {@link #interruptTask} is also run during completion, {@link #afterDone} runs after it.
   *
   * <p>The default implementation of this method in {@code AbstractFuture} does nothing. This is
```

### JavadocDeclaration
Javadoc pointing to itself
in `guava/src/com/google/common/xml/XmlEscapers.java`
#### Snippet
```java
   *
   * <p><b>Note:</b> Double and single quotes are not escaped, so it is <b>not safe</b> to use this
   * escaper to escape attribute values. Use {@link #xmlContentEscaper} if the output can appear in
   * element content or {@link #xmlAttributeEscaper} in attribute values.
   *
```

### JavadocDeclaration
Duplicate @return tag
in `guava/src/com/google/common/cache/CacheBuilder.java`
#### Snippet
```java
   * @return the cache builder reference that should be used instead of {@code this} for any
   *     remaining configuration and cache building
   * @return this {@code CacheBuilder} instance (for chaining)
   * @throws IllegalStateException if a removal listener was already set
   */
```

### JavadocDeclaration
Javadoc pointing to itself
in `guava/src/com/google/common/util/concurrent/ServiceManager.java`
#### Snippet
```java
     * These two booleans are used to mark the state as ready to start.
     *
     * <p>{@link #ready}: is set by {@link #markReady} to indicate that all listeners have been
     * correctly installed
     *
```

### JavadocDeclaration
Javadoc pointing to itself
in `guava/src/com/google/common/cache/LoadingCache.java`
#### Snippet
```java
   * used in situations where checked exceptions are not thrown by the cache loader.
   *
   * <p>If another call to {@link #get} or {@link #getUnchecked} is currently loading the value for
   * {@code key}, simply waits for that thread to finish and returns its loaded value. Note that
   * multiple threads can concurrently load values for distinct keys.
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `coldFactor` may be 'final'
in `guava/src/com/google/common/util/concurrent/SmoothRateLimiter.java`
#### Snippet
```java

    private double thresholdPermits;
    private double coldFactor;

    SmoothWarmingUp(
```

### FieldMayBeFinal
Field `omitEmptyValues` may be 'final'
in `guava/src/com/google/common/base/MoreObjects.java`
#### Snippet
```java
    private ValueHolder holderTail = holderHead;
    private boolean omitNullValues = false;
    private boolean omitEmptyValues = false;

    /** Use {@link MoreObjects#toStringHelper(Object)} to create an instance. */
```

### FieldMayBeFinal
Field `valueCollectionItr` may be 'final'
in `guava/src/com/google/common/collect/ImmutableMultimap.java`
#### Snippet
```java
  UnmodifiableIterator<V> valueIterator() {
    return new UnmodifiableIterator<V>() {
      Iterator<? extends ImmutableCollection<V>> valueCollectionItr = map.values().iterator();
      Iterator<V> valueItr = Iterators.emptyIterator();

```

### FieldMayBeFinal
Field `it` may be 'final'
in `guava/src/com/google/common/io/MultiInputStream.java`
#### Snippet
```java
final class MultiInputStream extends InputStream {

  private Iterator<? extends ByteSource> it;
  @CheckForNull private InputStream in;

```

### FieldMayBeFinal
Field `bus` may be 'final'
in `guava/src/com/google/common/eventbus/Subscriber.java`
#### Snippet
```java

  /** The event bus this subscriber belongs to. */
  @Weak private EventBus bus;

  /** The object with the subscriber method. */
```

### FieldMayBeFinal
Field `lines` may be 'final'
in `guava/src/com/google/common/io/CharSource.java`
#### Snippet
```java
    private Iterator<String> linesIterator() {
      return new AbstractIterator<String>() {
        Iterator<String> lines = LINE_SPLITTER.split(seq).iterator();

        @Override
```

### FieldMayBeFinal
Field `descendingMap` may be 'final'
in `guava/src/com/google/common/collect/ImmutableSortedMap.java`
#### Snippet
```java
  private final transient RegularImmutableSortedSet<K> keySet;
  private final transient ImmutableList<V> valueList;
  @CheckForNull private transient ImmutableSortedMap<K, V> descendingMap;

  ImmutableSortedMap(RegularImmutableSortedSet<K> keySet, ImmutableList<V> valueList) {
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
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

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u3002` can be replaced with '。'
in `guava/src/com/google/common/net/InternetDomainName.java`
#### Snippet
```java
public final class InternetDomainName {

  private static final CharMatcher DOTS_MATCHER = CharMatcher.anyOf(".\u3002\uFF0E\uFF61");
  private static final Splitter DOT_SPLITTER = Splitter.on('.');
  private static final Joiner DOT_JOINER = Joiner.on('.');
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\uFF0E` can be replaced with '．'
in `guava/src/com/google/common/net/InternetDomainName.java`
#### Snippet
```java
public final class InternetDomainName {

  private static final CharMatcher DOTS_MATCHER = CharMatcher.anyOf(".\u3002\uFF0E\uFF61");
  private static final Splitter DOT_SPLITTER = Splitter.on('.');
  private static final Joiner DOT_JOINER = Joiner.on('.');
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\uFF61` can be replaced with '｡'
in `guava/src/com/google/common/net/InternetDomainName.java`
#### Snippet
```java
public final class InternetDomainName {

  private static final CharMatcher DOTS_MATCHER = CharMatcher.anyOf(".\u3002\uFF0E\uFF61");
  private static final Splitter DOT_SPLITTER = Splitter.on('.');
  private static final Joiner DOT_JOINER = Joiner.on('.');
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0020` can be replaced with ' '
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
            + "\u3000\ud800\ufeff\ufff9";
    private static final String RANGE_ENDS = // inclusive ends
        "\u0020\u00a0\u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f\u202f\u2064\u206f"
            + "\u3000\uf8ff\ufeff\ufffb";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u12AB` can be replaced with 'ካ'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java

  /**
   * Returns the Java Unicode escape sequence for the given {@code char}, in the form "\u12AB" where
   * "12AB" is the four hexadecimal digits representing the 16-bit code unit.
   */
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u05be` can be replaced with '־'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
      super(
          "CharMatcher.singleWidth()",
          "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(),
          "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
    }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u05d0` can be replaced with 'א'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
      super(
          "CharMatcher.singleWidth()",
          "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(),
          "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
    }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u05f3` can be replaced with '׳'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
      super(
          "CharMatcher.singleWidth()",
          "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(),
          "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
    }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0750` can be replaced with 'ݐ'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
      super(
          "CharMatcher.singleWidth()",
          "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(),
          "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
    }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1e00` can be replaced with 'Ḁ'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
      super(
          "CharMatcher.singleWidth()",
          "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(),
          "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
    }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2100` can be replaced with '℀'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
      super(
          "CharMatcher.singleWidth()",
          "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(),
          "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
    }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\ufb50` can be replaced with 'ﭐ'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
      super(
          "CharMatcher.singleWidth()",
          "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(),
          "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
    }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\ufe70` can be replaced with 'ﹰ'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
      super(
          "CharMatcher.singleWidth()",
          "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(),
          "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
    }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\uff61` can be replaced with '｡'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
      super(
          "CharMatcher.singleWidth()",
          "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(),
          "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
    }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u04f9` can be replaced with 'ӹ'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
          "CharMatcher.singleWidth()",
          "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(),
          "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
    }
  }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u05be` can be replaced with '־'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
          "CharMatcher.singleWidth()",
          "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(),
          "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
    }
  }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u05ea` can be replaced with 'ת'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
          "CharMatcher.singleWidth()",
          "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(),
          "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
    }
  }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u05f4` can be replaced with '״'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
          "CharMatcher.singleWidth()",
          "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(),
          "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
    }
  }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u06ff` can be replaced with 'ۿ'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
          "CharMatcher.singleWidth()",
          "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(),
          "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
    }
  }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u077f` can be replaced with 'ݿ'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
          "CharMatcher.singleWidth()",
          "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(),
          "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
    }
  }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u20af` can be replaced with '₯'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
          "CharMatcher.singleWidth()",
          "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(),
          "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
    }
  }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u213a` can be replaced with '℺'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
          "CharMatcher.singleWidth()",
          "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(),
          "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
    }
  }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\uffdc` can be replaced with 'ￜ'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
          "CharMatcher.singleWidth()",
          "\u0000\u05be\u05d0\u05f3\u0600\u0750\u0e00\u1e00\u2100\ufb50\ufe70\uff61".toCharArray(),
          "\u04f9\u05be\u05ea\u05f4\u06ff\u077f\u0e7f\u20af\u213a\ufdff\ufeff\uffdc".toCharArray());
    }
  }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0009` can be replaced with a tab character
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
        "\u2002\u3000\r\u0085\u200A\u2005\u2000\u3000"
            + "\u2029\u000B\u3000\u2008\u2003\u205F\u3000\u1680"
            + "\u0009\u0020\u2006\u2001\u202F\u00A0\u000C\u2009"
            + "\u3000\u2004\u3000\u3000\u2028\n\u2007\u3000";
    static final int MULTIPLIER = 1682554634;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0020` can be replaced with ' '
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
        "\u2002\u3000\r\u0085\u200A\u2005\u2000\u3000"
            + "\u2029\u000B\u3000\u2008\u2003\u205F\u3000\u1680"
            + "\u0009\u0020\u2006\u2001\u202F\u00A0\u000C\u2009"
            + "\u3000\u2004\u3000\u3000\u2028\n\u2007\u3000";
    static final int MULTIPLIER = 1682554634;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0660` can be replaced with '٠'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    // Must be in ascending order.
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u06f0` can be replaced with '۰'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    // Must be in ascending order.
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u07c0` can be replaced with '߀'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    // Must be in ascending order.
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0966` can be replaced with '०'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    // Must be in ascending order.
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u09e6` can be replaced with '০'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    // Must be in ascending order.
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0a66` can be replaced with '੦'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    // Must be in ascending order.
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0ae6` can be replaced with '૦'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    // Must be in ascending order.
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0b66` can be replaced with '୦'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    // Must be in ascending order.
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0be6` can be replaced with '௦'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    // Must be in ascending order.
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0c66` can be replaced with '౦'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    // Must be in ascending order.
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0ce6` can be replaced with '೦'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    // Must be in ascending order.
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0d66` can be replaced with '൦'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    // Must be in ascending order.
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0de6` can be replaced with '෦'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    // Must be in ascending order.
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0e50` can be replaced with '๐'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0ed0` can be replaced with '໐'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0f20` can be replaced with '༠'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1040` can be replaced with '၀'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1090` can be replaced with '႐'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u17e0` can be replaced with '០'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1810` can be replaced with '᠐'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1946` can be replaced with '᥆'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u19d0` can be replaced with '᧐'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1a80` can be replaced with '᪀'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1a90` can be replaced with '᪐'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1b50` can be replaced with '᭐'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1bb0` can be replaced with '᮰'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
    private static final String ZEROES =
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1c40` can be replaced with '᱀'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

    private static char[] zeroes() {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1c50` can be replaced with '᱐'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

    private static char[] zeroes() {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\ua620` can be replaced with '꘠'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

    private static char[] zeroes() {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\ua8d0` can be replaced with '꣐'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

    private static char[] zeroes() {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\ua900` can be replaced with '꤀'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

    private static char[] zeroes() {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\ua9d0` can be replaced with '꧐'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

    private static char[] zeroes() {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\ua9f0` can be replaced with '꧰'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

    private static char[] zeroes() {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\uaa50` can be replaced with '꩐'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

    private static char[] zeroes() {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\uabf0` can be replaced with '꯰'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

    private static char[] zeroes() {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\uff10` can be replaced with '０'
in `guava/src/com/google/common/base/CharMatcher.java`
#### Snippet
```java
        "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0de6"
            + "\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1a80\u1a90\u1b50\u1bb0"
            + "\u1c40\u1c50\ua620\ua8d0\ua900\ua9d0\ua9f0\uaa50\uabf0\uff10";

    private static char[] zeroes() {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u221e` can be replaced with '∞'
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
        + ":"
        + (lowerBoundType == CLOSED ? '[' : '(')
        + (hasLowerBound ? lowerEndpoint : "-\u221e")
        + ','
        + (hasUpperBound ? upperEndpoint : "\u221e")
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u221e` can be replaced with '∞'
in `guava/src/com/google/common/collect/GeneralRange.java`
#### Snippet
```java
        + (hasLowerBound ? lowerEndpoint : "-\u221e")
        + ','
        + (hasUpperBound ? upperEndpoint : "\u221e")
        + (upperBoundType == CLOSED ? ']' : ')');
  }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u221e` can be replaced with '∞'
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java
    @Override
    public String toString() {
      return "+\u221e";
    }

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u221e` can be replaced with '∞'
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java
    @Override
    void describeAsUpperBound(StringBuilder sb) {
      sb.append("+\u221e)");
    }

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u221e` can be replaced with '∞'
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java
    @Override
    void describeAsLowerBound(StringBuilder sb) {
      sb.append("(-\u221e");
    }

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u221e` can be replaced with '∞'
in `guava/src/com/google/common/collect/Cut.java`
#### Snippet
```java
    @Override
    public String toString() {
      return "-\u221e";
    }

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03bc` can be replaced with 'μ'
in `guava/src/com/google/common/base/Stopwatch.java`
#### Snippet
```java
        return "ns";
      case MICROSECONDS:
        return "\u03bcs"; // μs
      case MILLISECONDS:
        return "ms";
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
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

### SynchronizationOnLocalVariableOrMethodParameter
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

### SynchronizationOnLocalVariableOrMethodParameter
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

### SynchronizationOnLocalVariableOrMethodParameter
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

### SynchronizationOnLocalVariableOrMethodParameter
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

### SynchronizationOnLocalVariableOrMethodParameter
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

### SynchronizationOnLocalVariableOrMethodParameter
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

### SynchronizationOnLocalVariableOrMethodParameter
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

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
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

### UnnecessaryLocalVariable
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

### UnnecessaryLocalVariable
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

### UnnecessaryLocalVariable
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

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
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

### RegExpUnnecessaryNonCapturingGroup
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

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ForwardingSet.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object object) {
    return object == this || delegate().equals(object);
  }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ForwardingMultiset.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object object) {
    return object == this || delegate().equals(object);
  }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/TreeRangeSet.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object o) {
      return Sets.equalsImpl(this, o);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ForwardingMultimap.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object object) {
    return object == this || delegate().equals(object);
  }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/Sets.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object object) {
      return equalsImpl(this, object);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ForwardingMapEntry.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object object) {
    return delegate().equals(object);
  }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ImmutableList.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object obj) {
    return Lists.equalsImpl(this, obj);
  }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ForwardingMap.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object object) {
    return object == this || delegate().equals(object);
  }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ImmutableMultiset.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object object) {
    return Multisets.equalsImpl(this, object);
  }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/AbstractTable.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object obj) {
    return Tables.equalsImpl(this, obj);
  }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object object) {
      return this == object || submap.equals(object);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object object) {
      if (object == this) {
        return true;
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/AbstractMapBasedMultimap.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object object) {
      return this == object || this.map().keySet().equals(object);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object object) {
    return Multimaps.equalsImpl(this, object);
  }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/AbstractMultimap.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object obj) {
      return Sets.equalsImpl(this, obj);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/Maps.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object object) {
      return Sets.equalsImpl(this, object);
    }
```

### EqualsWhichDoesntCheckParameterClass
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

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ForwardingTable.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object obj) {
    return (obj == this) || delegate().equals(obj);
  }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ForwardingList.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object object) {
    return object == this || delegate().equals(object);
  }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/FilteredKeySetMultimap.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object o) {
      return Sets.equalsImpl(this, o);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/StandardTable.java`
#### Snippet
```java

        @Override
        public boolean equals(@CheckForNull Object object) {
          // TODO(lowasser): identify why this affects GWT tests
          return standardEquals(object);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object o) {
      if (o == this) {
        return true;
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object o) {
      if (o == this) {
        return true;
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object obj) {
      if (this == obj) {
        return true;
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object o) {
      if (o == this) {
        return true;
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object o) {
      if (o == this) {
        return true;
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object o) {
      if (o == this) {
        return true;
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/Synchronized.java`
#### Snippet
```java

    @Override
    public boolean equals(@CheckForNull Object o) {
      if (o == this) {
        return true;
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `guava/src/com/google/common/collect/ImmutableMap.java`
#### Snippet
```java

  @Override
  public boolean equals(@CheckForNull Object object) {
    return Maps.equalsImpl(this, object);
  }
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
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

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
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

