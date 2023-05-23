# datasketches-java 
 
# Bad smells
I found 1499 bad smells with 101 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| PointlessArithmeticExpression | 570 | false |
| DuplicatedCode | 135 | false |
| FinalStaticMethod | 132 | false |
| FieldMayBeFinal | 91 | false |
| FinalMethodInFinalClass | 63 | false |
| JavadocReference | 59 | false |
| FinalPrivateMethod | 51 | false |
| UnnecessaryLocalVariable | 51 | true |
| ConstantValue | 40 | false |
| UnusedAssignment | 34 | false |
| IntegerMultiplicationImplicitCastToLong | 31 | false |
| StringConcatenationInsideStringBufferAppend | 30 | false |
| UnnecessaryToStringCall | 25 | true |
| UnnecessaryModifier | 22 | true |
| CommentedOutCode | 22 | false |
| NonFinalFieldInEnum | 20 | false |
| OctalLiteral | 17 | false |
| ManualMinMaxCalculation | 14 | false |
| DataFlowIssue | 13 | false |
| TrivialIf | 9 | false |
| DuplicateBranchesInSwitch | 8 | false |
| FieldCanBeLocal | 8 | false |
| DeprecatedIsStillUsed | 6 | false |
| EmptyStatementBody | 5 | false |
| StringBufferReplaceableByString | 5 | false |
| SimplifiableConditionalExpression | 4 | false |
| IfStatementWithIdenticalBranches | 4 | false |
| CStyleArrayDeclaration | 3 | false |
| SuspiciousSystemArraycopy | 2 | false |
| UnnecessarySemicolon | 2 | false |
| ManualArrayCopy | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| RedundantMethodOverride | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| RedundantCast | 2 | false |
| PointlessBitwiseExpression | 2 | false |
| BusyWait | 2 | false |
| PointlessBooleanExpression | 2 | true |
| NonAtomicOperationOnVolatileField | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| MismatchedJavadocCode | 1 | false |
| JavadocDeclaration | 1 | false |
| SimplifiableBooleanExpression | 1 | false |
| UnnecessaryContinue | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Row\[rowList.size()\]'
in `src/main/java/org/apache/datasketches/frequencies/LongsSketch.java`
#### Snippet
```java
    });

    final Row[] rowsArr = rowList.toArray(new Row[rowList.size()]);
    return rowsArr;
  }
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/org/apache/datasketches/quantilescommon/QuantilesFloatsAPI.java`
#### Snippet
```java
   */

  static class FloatsPartitionBoundaries {

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/ArrayOfDoublesSketch.java`
#### Snippet
```java
  // For example, as a result of a sampling, when some data was presented to the sketch, but no
  //  entries were retained.
  static enum Flags { IS_BIG_ENDIAN, IS_IN_SAMPLING_MODE, IS_EMPTY, HAS_ENTRIES }

  static final int SIZE_OF_KEY_BYTES = Long.BYTES;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/org/apache/datasketches/quantilescommon/QuantilesDoublesAPI.java`
#### Snippet
```java
   * <i>getPartitionBoundaries(int, QuantileSearchCritera)</i> method.
   */
  static class DoublesPartitionBoundaries {

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `src/main/java/org/apache/datasketches/quantilescommon/QuantilesGenericAPI.java`
#### Snippet
```java
   * @param <T> generic value T for the item type
   */
  static class GenericPartitionBoundaries<T> {

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/datasketches/tuple/SummaryDeserializer.java`
#### Snippet
```java
   * from the Memory
   */
  public DeserializeResult<S> heapifySummary(Memory mem);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/datasketches/tuple/SummaryFactory.java`
#### Snippet
```java
   * @return new instance of Summary
   */
  public S newSummary();

}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/org/apache/datasketches/kll/KllSketch.java`
#### Snippet
```java
    private String msg;

    private Error(final String msg) {
      this.msg = msg;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/datasketches/tuple/Summary.java`
#### Snippet
```java
   * @return serialized representation of the Summary
   */
  public byte[] toByteArray();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/datasketches/tuple/Summary.java`
#### Snippet
```java
   * @return deep copy of the Summary
   */
  public Summary copy();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/ArrayOfDoublesSketchIterator.java`
#### Snippet
```java
   * @return array of double values for the current entry (may or may not be a copy)
   */
  public double[] getValues();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/ArrayOfDoublesSketchIterator.java`
#### Snippet
```java
   * @return hash key from the current entry
   */
  public long getKey();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/ArrayOfDoublesSketchIterator.java`
#### Snippet
```java
   * @return true if the next element exists
   */
  public boolean next();

  /**
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/org/apache/datasketches/kll/KllMemoryValidate.java`
#### Snippet
```java
    private String msg;

    private MemoryInputError(final String msg) {
      this.msg = msg;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/datasketches/tuple/SummarySetOperations.java`
#### Snippet
```java
   * @return union of Summary A and Summary B
   */
  public S union(S a, S b);

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/datasketches/tuple/SummarySetOperations.java`
#### Snippet
```java
   * @return intersection of Summary A and Summary B
   */
  public S intersection(S a, S b);

}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/org/apache/datasketches/common/Family.java`
#### Snippet
```java
  }

  private Family(final int id, final String famName, final int minPreLongs, final int maxPreLongs) {
    id_ = id;
    famName_ = famName.toUpperCase(Locale.US);
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    }

    private CornerCase(final int caseId, final String caseDescription,
        final IntersectAction intersectAction, final AnotbAction anotbAction, final UnionAction unionAction) {
      this.caseId = caseId;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    private String actionDescription;

    private IntersectAction(final String actionId, final String actionDescription) {
      this.actionId = actionId;
      this.actionDescription = actionDescription;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    private String actionDescription;

    private AnotbAction(final String actionId, final String actionDescription) {
      this.actionId = actionId;
      this.actionDescription = actionDescription;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    private String actionDescription;

    private UnionAction(final String actionId, final String actionDescription) {
      this.actionId = actionId;
      this.actionDescription = actionDescription;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/ArrayOfDoublesCombiner.java`
#### Snippet
```java
   * @return Result of combining A and B
   */
  public double[] combine(double[] a, double[] b);

}
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `src/main/java/org/apache/datasketches/tuple/SerializerDeserializer.java`
#### Snippet
```java
   * Defines the sketch classes that this SerializerDeserializer can handle.
   */
  public static enum SketchType { QuickSelectSketch, CompactSketch, ArrayOfDoublesQuickSelectSketch,
    ArrayOfDoublesCompactSketch, ArrayOfDoublesUnion }

```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/datasketches/hll/CubicInterpolation.java`
#### Snippet
```java
      final int offset, final double x) {
    return cubicInterpolate(
        xArr[offset + 0], yStride * (offset + 0),
        xArr[offset + 1], yStride * (offset + 1),
        xArr[offset + 2], yStride * (offset + 2),
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/datasketches/hll/CubicInterpolation.java`
#### Snippet
```java
      final int offset, final double x) {
    return cubicInterpolate(
        xArr[offset + 0], yStride * (offset + 0),
        xArr[offset + 1], yStride * (offset + 1),
        xArr[offset + 2], yStride * (offset + 2),
```

### PointlessArithmeticExpression
`offset - 0` can be replaced with 'offset'
in `src/main/java/org/apache/datasketches/hll/CubicInterpolation.java`
#### Snippet
```java

    if (offset == 0) { /* corner case */
      return (interpolateUsingXArrAndYStride(xArr, yStride, (offset - 0), x));
    }
    else if (offset == xArrLenM2) { /* corner case */
```

### PointlessArithmeticExpression
`lgK + 0` can be replaced with 'lgK'
in `src/main/java/org/apache/datasketches/cpc/MergingValidation.java`
#### Snippet
```java
    for (int lgK = lgMinK; lgK <= lgMaxK; lgK += incLgK) {
      multiTestMerging(lgK, lgK - 1, lgK - 1);
      multiTestMerging(lgK, lgK - 1, lgK + 0);
      multiTestMerging(lgK, lgK - 1, lgK + 1);

```

### PointlessArithmeticExpression
`lgK + 0` can be replaced with 'lgK'
in `src/main/java/org/apache/datasketches/cpc/MergingValidation.java`
#### Snippet
```java
      multiTestMerging(lgK, lgK - 1, lgK + 1);

      multiTestMerging(lgK, lgK + 0, lgK - 1);
      multiTestMerging(lgK, lgK + 0, lgK + 0);
      multiTestMerging(lgK, lgK + 0, lgK + 1);
```

### PointlessArithmeticExpression
`lgK + 0` can be replaced with 'lgK'
in `src/main/java/org/apache/datasketches/cpc/MergingValidation.java`
#### Snippet
```java

      multiTestMerging(lgK, lgK + 0, lgK - 1);
      multiTestMerging(lgK, lgK + 0, lgK + 0);
      multiTestMerging(lgK, lgK + 0, lgK + 1);

```

### PointlessArithmeticExpression
`lgK + 0` can be replaced with 'lgK'
in `src/main/java/org/apache/datasketches/cpc/MergingValidation.java`
#### Snippet
```java

      multiTestMerging(lgK, lgK + 0, lgK - 1);
      multiTestMerging(lgK, lgK + 0, lgK + 0);
      multiTestMerging(lgK, lgK + 0, lgK + 1);

```

### PointlessArithmeticExpression
`lgK + 0` can be replaced with 'lgK'
in `src/main/java/org/apache/datasketches/cpc/MergingValidation.java`
#### Snippet
```java
      multiTestMerging(lgK, lgK + 0, lgK - 1);
      multiTestMerging(lgK, lgK + 0, lgK + 0);
      multiTestMerging(lgK, lgK + 0, lgK + 1);

      multiTestMerging(lgK, lgK + 1, lgK - 1);
```

### PointlessArithmeticExpression
`lgK + 0` can be replaced with 'lgK'
in `src/main/java/org/apache/datasketches/cpc/MergingValidation.java`
#### Snippet
```java

      multiTestMerging(lgK, lgK + 1, lgK - 1);
      multiTestMerging(lgK, lgK + 1, lgK + 0);
      multiTestMerging(lgK, lgK + 1, lgK + 1);
    }
```

### PointlessArithmeticExpression
`16 + 0` can be replaced with '16'
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
    // The thresholds were chosen by hand after looking at plots of measured compression.
    if ((1000 * c) < (2375 * k)) {
      if      (   (4 * c) <    (3 * k)) { return ( 16 + 0 ); } // midrange table
      else if (  (10 * c) <   (11 * k)) { return ( 16 + 1 ); } // midrange table
      else if ( (100 * c) <  (132 * k)) { return ( 16 + 2 ); } // midrange table
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits23(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits23(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 1) << 22;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits63(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 55;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 47;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 39;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits63(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 55;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 47;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 39;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 31;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 55;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 47;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 39;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 31;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 47;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 39;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 31;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 39;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 31;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 31;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 1) << 62;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits60(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 52;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 44;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 36;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits60(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 52;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 44;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 36;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 28;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 52;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 44;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 36;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 28;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 44;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 36;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 28;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 36;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 28;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 28;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0xf) << 56;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits24(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits24(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]);
    values[i + 1] = Byte.toUnsignedLong(buf[off++]) << 16;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]);
    values[i + 1] = Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 1] |= Byte.toUnsignedLong(buf[off++]) << 8;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits27(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 19);

    buf[off++] = (byte) (values[i + 0] >>> 11);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 19);

    buf[off++] = (byte) (values[i + 0] >>> 11);

    buf[off++] = (byte) (values[i + 0] >>> 3);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 11);

    buf[off++] = (byte) (values[i + 0] >>> 3);

    buf[off] = (byte) (values[i + 0] << 5);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 3);

    buf[off] = (byte) (values[i + 0] << 5);
    buf[off++] |= values[i + 1] >>> 22;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits35(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 27);
    buf[off++] = (byte) (values[i + 0] >>> 19);
    buf[off++] = (byte) (values[i + 0] >>> 11);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits35(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 27);
    buf[off++] = (byte) (values[i + 0] >>> 19);
    buf[off++] = (byte) (values[i + 0] >>> 11);
    buf[off++] = (byte) (values[i + 0] >>> 3);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 27);
    buf[off++] = (byte) (values[i + 0] >>> 19);
    buf[off++] = (byte) (values[i + 0] >>> 11);
    buf[off++] = (byte) (values[i + 0] >>> 3);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 19);
    buf[off++] = (byte) (values[i + 0] >>> 11);
    buf[off++] = (byte) (values[i + 0] >>> 3);

    buf[off] = (byte) (values[i + 0] << 5);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 3);

    buf[off] = (byte) (values[i + 0] << 5);
    buf[off++] |= values[i + 1] >>> 30;
    buf[off++] = (byte) (values[i + 1] >>> 22);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits36(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 28);
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits36(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 28);
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
    buf[off++] = (byte) (values[i + 0] >>> 4);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 28);
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
    buf[off++] = (byte) (values[i + 0] >>> 4);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
    buf[off++] = (byte) (values[i + 0] >>> 4);

    buf[off] = (byte) (values[i + 0] << 4);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 4);

    buf[off] = (byte) (values[i + 0] << 4);
    buf[off++] |= values[i + 1] >>> 32;
    buf[off++] = (byte) (values[i + 1] >>> 24);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits51(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 43;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 35;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 27;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits51(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 43;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 35;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 27;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 43;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 35;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 27;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 35;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 27;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 27;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x1f) << 46;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits52(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 44);
    buf[off++] = (byte) (values[i + 0] >>> 36);
    buf[off++] = (byte) (values[i + 0] >>> 28);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits52(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 44);
    buf[off++] = (byte) (values[i + 0] >>> 36);
    buf[off++] = (byte) (values[i + 0] >>> 28);
    buf[off++] = (byte) (values[i + 0] >>> 20);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 44);
    buf[off++] = (byte) (values[i + 0] >>> 36);
    buf[off++] = (byte) (values[i + 0] >>> 28);
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 36);
    buf[off++] = (byte) (values[i + 0] >>> 28);
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
    buf[off++] = (byte) (values[i + 0] >>> 4);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 28);
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
    buf[off++] = (byte) (values[i + 0] >>> 4);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
    buf[off++] = (byte) (values[i + 0] >>> 4);

    buf[off] = (byte) (values[i + 0] << 4);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 4);

    buf[off] = (byte) (values[i + 0] << 4);
    buf[off++] |= values[i + 1] >>> 48;
    buf[off++] = (byte) (values[i + 1] >>> 40);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits46(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 38);
    buf[off++] = (byte) (values[i + 0] >>> 30);
    buf[off++] = (byte) (values[i + 0] >>> 22);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits46(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 38);
    buf[off++] = (byte) (values[i + 0] >>> 30);
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 38);
    buf[off++] = (byte) (values[i + 0] >>> 30);
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
    buf[off++] = (byte) (values[i + 0] >>> 6);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 30);
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
    buf[off++] = (byte) (values[i + 0] >>> 6);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
    buf[off++] = (byte) (values[i + 0] >>> 6);

    buf[off] = (byte) (values[i + 0] << 2);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 6);

    buf[off] = (byte) (values[i + 0] << 2);
    buf[off++] |= values[i + 1] >>> 44;
    buf[off++] = (byte) (values[i + 1] >>> 36);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits44(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 36);
    buf[off++] = (byte) (values[i + 0] >>> 28);
    buf[off++] = (byte) (values[i + 0] >>> 20);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits44(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 36);
    buf[off++] = (byte) (values[i + 0] >>> 28);
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 36);
    buf[off++] = (byte) (values[i + 0] >>> 28);
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
    buf[off++] = (byte) (values[i + 0] >>> 4);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 28);
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
    buf[off++] = (byte) (values[i + 0] >>> 4);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
    buf[off++] = (byte) (values[i + 0] >>> 4);

    buf[off] = (byte) (values[i + 0] << 4);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 4);

    buf[off] = (byte) (values[i + 0] << 4);
    buf[off++] |= values[i + 1] >>> 40;
    buf[off++] = (byte) (values[i + 1] >>> 32);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits10(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 2);

    buf[off] = (byte) (values[i + 0] << 6);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 2);

    buf[off] = (byte) (values[i + 0] << 6);
    buf[off++] |= values[i + 1] >>> 4;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits7(final long[] values, final int i, final byte[] buf, int off) {
    buf[off] = (byte) (values[i + 0] << 1);
    buf[off++] |= values[i + 1] >>> 6;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits29(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 21);

    buf[off++] = (byte) (values[i + 0] >>> 13);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 21);

    buf[off++] = (byte) (values[i + 0] >>> 13);

    buf[off++] = (byte) (values[i + 0] >>> 5);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 13);

    buf[off++] = (byte) (values[i + 0] >>> 5);

    buf[off] = (byte) (values[i + 0] << 3);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 5);

    buf[off] = (byte) (values[i + 0] << 3);
    buf[off++] |= values[i + 1] >>> 26;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits24(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
    buf[off++] = (byte) (values[i + 0]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits24(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
    buf[off++] = (byte) (values[i + 0]);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
    buf[off++] = (byte) (values[i + 0]);

    buf[off++] = (byte) (values[i + 1] >>> 16);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits54(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 46;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 38;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 30;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits54(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 46;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 38;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 30;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 46;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 38;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 30;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 38;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 30;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 30;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 3) << 52;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits62(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 54);
    buf[off++] = (byte) (values[i + 0] >>> 46);
    buf[off++] = (byte) (values[i + 0] >>> 38);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits62(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 54);
    buf[off++] = (byte) (values[i + 0] >>> 46);
    buf[off++] = (byte) (values[i + 0] >>> 38);
    buf[off++] = (byte) (values[i + 0] >>> 30);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 54);
    buf[off++] = (byte) (values[i + 0] >>> 46);
    buf[off++] = (byte) (values[i + 0] >>> 38);
    buf[off++] = (byte) (values[i + 0] >>> 30);
    buf[off++] = (byte) (values[i + 0] >>> 22);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 46);
    buf[off++] = (byte) (values[i + 0] >>> 38);
    buf[off++] = (byte) (values[i + 0] >>> 30);
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 38);
    buf[off++] = (byte) (values[i + 0] >>> 30);
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
    buf[off++] = (byte) (values[i + 0] >>> 6);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 30);
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
    buf[off++] = (byte) (values[i + 0] >>> 6);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
    buf[off++] = (byte) (values[i + 0] >>> 6);

    buf[off] = (byte) (values[i + 0] << 2);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 6);

    buf[off] = (byte) (values[i + 0] << 2);
    buf[off++] |= values[i + 1] >>> 60;
    buf[off++] = (byte) (values[i + 1] >>> 52);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits59(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 51);
    buf[off++] = (byte) (values[i + 0] >>> 43);
    buf[off++] = (byte) (values[i + 0] >>> 35);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits59(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 51);
    buf[off++] = (byte) (values[i + 0] >>> 43);
    buf[off++] = (byte) (values[i + 0] >>> 35);
    buf[off++] = (byte) (values[i + 0] >>> 27);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 51);
    buf[off++] = (byte) (values[i + 0] >>> 43);
    buf[off++] = (byte) (values[i + 0] >>> 35);
    buf[off++] = (byte) (values[i + 0] >>> 27);
    buf[off++] = (byte) (values[i + 0] >>> 19);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 43);
    buf[off++] = (byte) (values[i + 0] >>> 35);
    buf[off++] = (byte) (values[i + 0] >>> 27);
    buf[off++] = (byte) (values[i + 0] >>> 19);
    buf[off++] = (byte) (values[i + 0] >>> 11);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 35);
    buf[off++] = (byte) (values[i + 0] >>> 27);
    buf[off++] = (byte) (values[i + 0] >>> 19);
    buf[off++] = (byte) (values[i + 0] >>> 11);
    buf[off++] = (byte) (values[i + 0] >>> 3);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 27);
    buf[off++] = (byte) (values[i + 0] >>> 19);
    buf[off++] = (byte) (values[i + 0] >>> 11);
    buf[off++] = (byte) (values[i + 0] >>> 3);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 19);
    buf[off++] = (byte) (values[i + 0] >>> 11);
    buf[off++] = (byte) (values[i + 0] >>> 3);

    buf[off] = (byte) (values[i + 0] << 5);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 3);

    buf[off] = (byte) (values[i + 0] << 5);
    buf[off++] |= values[i + 1] >>> 54;
    buf[off++] = (byte) (values[i + 1] >>> 46);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits28(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits28(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0xf) << 24;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits9(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits9(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x7f) << 2;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits19(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits19(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x1f) << 14;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits57(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 49);
    buf[off++] = (byte) (values[i + 0] >>> 41);
    buf[off++] = (byte) (values[i + 0] >>> 33);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits57(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 49);
    buf[off++] = (byte) (values[i + 0] >>> 41);
    buf[off++] = (byte) (values[i + 0] >>> 33);
    buf[off++] = (byte) (values[i + 0] >>> 25);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 49);
    buf[off++] = (byte) (values[i + 0] >>> 41);
    buf[off++] = (byte) (values[i + 0] >>> 33);
    buf[off++] = (byte) (values[i + 0] >>> 25);
    buf[off++] = (byte) (values[i + 0] >>> 17);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 41);
    buf[off++] = (byte) (values[i + 0] >>> 33);
    buf[off++] = (byte) (values[i + 0] >>> 25);
    buf[off++] = (byte) (values[i + 0] >>> 17);
    buf[off++] = (byte) (values[i + 0] >>> 9);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 33);
    buf[off++] = (byte) (values[i + 0] >>> 25);
    buf[off++] = (byte) (values[i + 0] >>> 17);
    buf[off++] = (byte) (values[i + 0] >>> 9);
    buf[off++] = (byte) (values[i + 0] >>> 1);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 25);
    buf[off++] = (byte) (values[i + 0] >>> 17);
    buf[off++] = (byte) (values[i + 0] >>> 9);
    buf[off++] = (byte) (values[i + 0] >>> 1);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 17);
    buf[off++] = (byte) (values[i + 0] >>> 9);
    buf[off++] = (byte) (values[i + 0] >>> 1);

    buf[off] = (byte) (values[i + 0] << 7);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 1);

    buf[off] = (byte) (values[i + 0] << 7);
    buf[off++] |= values[i + 1] >>> 50;
    buf[off++] = (byte) (values[i + 1] >>> 42);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits1(final long[] values, final int i, final byte[] buf, final int off) {
    buf[off] = (byte) (values[i + 0] << 7);
    buf[off] |= values[i + 1] << 6;
    buf[off] |= values[i + 2] << 5;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits57(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 49;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 41;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 33;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits57(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 49;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 41;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 33;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 25;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 49;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 41;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 33;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 25;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 41;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 33;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 25;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 33;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 25;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 25;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x7f) << 50;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits29(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits29(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 7) << 26;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits13(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 5);

    buf[off] = (byte) (values[i + 0] << 3);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 5);

    buf[off] = (byte) (values[i + 0] << 3);
    buf[off++] |= values[i + 1] >>> 10;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits52(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 44;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 36;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 28;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits52(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 44;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 36;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 28;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 44;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 36;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 28;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 36;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 28;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 28;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0xf) << 48;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits26(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 18);

    buf[off++] = (byte) (values[i + 0] >>> 10);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 18);

    buf[off++] = (byte) (values[i + 0] >>> 10);

    buf[off++] = (byte) (values[i + 0] >>> 2);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 10);

    buf[off++] = (byte) (values[i + 0] >>> 2);

    buf[off] = (byte) (values[i + 0] << 6);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 2);

    buf[off] = (byte) (values[i + 0] << 6);
    buf[off++] |= values[i + 1] >>> 20;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits18(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 10);

    buf[off++] = (byte) (values[i + 0] >>> 2);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 10);

    buf[off++] = (byte) (values[i + 0] >>> 2);

    buf[off] = (byte) (values[i + 0] << 6);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 2);

    buf[off] = (byte) (values[i + 0] << 6);
    buf[off++] |= values[i + 1] >>> 12;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits31(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
    buf[off++] = (byte) (values[i + 0] >>> 7);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits31(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
    buf[off++] = (byte) (values[i + 0] >>> 7);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
    buf[off++] = (byte) (values[i + 0] >>> 7);

    buf[off] = (byte) (values[i + 0] << 1);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 7);

    buf[off] = (byte) (values[i + 0] << 1);
    buf[off++] |= values[i + 1] >>> 30;
    buf[off++] = (byte) (values[i + 1] >>> 22);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits23(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 15);

    buf[off++] = (byte) (values[i + 0] >>> 7);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 15);

    buf[off++] = (byte) (values[i + 0] >>> 7);

    buf[off] = (byte) (values[i + 0] << 1);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 7);

    buf[off] = (byte) (values[i + 0] << 1);
    buf[off++] |= values[i + 1] >>> 22;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits38(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 30);
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits38(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 30);
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
    buf[off++] = (byte) (values[i + 0] >>> 6);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 30);
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
    buf[off++] = (byte) (values[i + 0] >>> 6);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
    buf[off++] = (byte) (values[i + 0] >>> 6);

    buf[off] = (byte) (values[i + 0] << 2);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 6);

    buf[off] = (byte) (values[i + 0] << 2);
    buf[off++] |= values[i + 1] >>> 36;
    buf[off++] = (byte) (values[i + 1] >>> 28);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits13(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits13(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 7) << 10;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits30(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits30(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 3) << 28;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits2(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off]) >>> 6) & 3;
    values[i + 1] = (Byte.toUnsignedLong(buf[off]) >>> 4) & 3;
    values[i + 2] = (Byte.toUnsignedLong(buf[off]) >>> 2) & 3;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits45(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 37);
    buf[off++] = (byte) (values[i + 0] >>> 29);
    buf[off++] = (byte) (values[i + 0] >>> 21);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits45(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 37);
    buf[off++] = (byte) (values[i + 0] >>> 29);
    buf[off++] = (byte) (values[i + 0] >>> 21);
    buf[off++] = (byte) (values[i + 0] >>> 13);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 37);
    buf[off++] = (byte) (values[i + 0] >>> 29);
    buf[off++] = (byte) (values[i + 0] >>> 21);
    buf[off++] = (byte) (values[i + 0] >>> 13);
    buf[off++] = (byte) (values[i + 0] >>> 5);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 29);
    buf[off++] = (byte) (values[i + 0] >>> 21);
    buf[off++] = (byte) (values[i + 0] >>> 13);
    buf[off++] = (byte) (values[i + 0] >>> 5);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 21);
    buf[off++] = (byte) (values[i + 0] >>> 13);
    buf[off++] = (byte) (values[i + 0] >>> 5);

    buf[off] = (byte) (values[i + 0] << 3);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 5);

    buf[off] = (byte) (values[i + 0] << 3);
    buf[off++] |= values[i + 1] >>> 42;
    buf[off++] = (byte) (values[i + 1] >>> 34);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits49(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 41);
    buf[off++] = (byte) (values[i + 0] >>> 33);
    buf[off++] = (byte) (values[i + 0] >>> 25);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits49(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 41);
    buf[off++] = (byte) (values[i + 0] >>> 33);
    buf[off++] = (byte) (values[i + 0] >>> 25);
    buf[off++] = (byte) (values[i + 0] >>> 17);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 41);
    buf[off++] = (byte) (values[i + 0] >>> 33);
    buf[off++] = (byte) (values[i + 0] >>> 25);
    buf[off++] = (byte) (values[i + 0] >>> 17);
    buf[off++] = (byte) (values[i + 0] >>> 9);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 33);
    buf[off++] = (byte) (values[i + 0] >>> 25);
    buf[off++] = (byte) (values[i + 0] >>> 17);
    buf[off++] = (byte) (values[i + 0] >>> 9);
    buf[off++] = (byte) (values[i + 0] >>> 1);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 25);
    buf[off++] = (byte) (values[i + 0] >>> 17);
    buf[off++] = (byte) (values[i + 0] >>> 9);
    buf[off++] = (byte) (values[i + 0] >>> 1);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 17);
    buf[off++] = (byte) (values[i + 0] >>> 9);
    buf[off++] = (byte) (values[i + 0] >>> 1);

    buf[off] = (byte) (values[i + 0] << 7);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 1);

    buf[off] = (byte) (values[i + 0] << 7);
    buf[off++] |= values[i + 1] >>> 42;
    buf[off++] = (byte) (values[i + 1] >>> 34);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits38(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 30;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits38(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 30;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 30;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 3) << 36;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits53(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 45);
    buf[off++] = (byte) (values[i + 0] >>> 37);
    buf[off++] = (byte) (values[i + 0] >>> 29);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits53(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 45);
    buf[off++] = (byte) (values[i + 0] >>> 37);
    buf[off++] = (byte) (values[i + 0] >>> 29);
    buf[off++] = (byte) (values[i + 0] >>> 21);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 45);
    buf[off++] = (byte) (values[i + 0] >>> 37);
    buf[off++] = (byte) (values[i + 0] >>> 29);
    buf[off++] = (byte) (values[i + 0] >>> 21);
    buf[off++] = (byte) (values[i + 0] >>> 13);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 37);
    buf[off++] = (byte) (values[i + 0] >>> 29);
    buf[off++] = (byte) (values[i + 0] >>> 21);
    buf[off++] = (byte) (values[i + 0] >>> 13);
    buf[off++] = (byte) (values[i + 0] >>> 5);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 29);
    buf[off++] = (byte) (values[i + 0] >>> 21);
    buf[off++] = (byte) (values[i + 0] >>> 13);
    buf[off++] = (byte) (values[i + 0] >>> 5);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 21);
    buf[off++] = (byte) (values[i + 0] >>> 13);
    buf[off++] = (byte) (values[i + 0] >>> 5);

    buf[off] = (byte) (values[i + 0] << 3);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 5);

    buf[off] = (byte) (values[i + 0] << 3);
    buf[off++] |= values[i + 1] >>> 50;
    buf[off++] = (byte) (values[i + 1] >>> 42);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits45(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 37;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 29;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits45(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 37;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 29;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 37;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 29;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 29;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 7) << 42;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits33(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 25;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits33(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 25;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 25;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x7f) << 26;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits19(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 11);

    buf[off++] = (byte) (values[i + 0] >>> 3);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 11);

    buf[off++] = (byte) (values[i + 0] >>> 3);

    buf[off] = (byte) (values[i + 0] << 5);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 3);

    buf[off] = (byte) (values[i + 0] << 5);
    buf[off++] |= values[i + 1] >>> 14;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits42(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 34;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 26;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits42(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 34;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 26;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 34;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 26;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 26;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x3f) << 36;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits37(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 29;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits37(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 29;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 29;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 7) << 34;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits8(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]);
    values[i + 1] = Byte.toUnsignedLong(buf[off++]);
    values[i + 2] = Byte.toUnsignedLong(buf[off++]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits12(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 4);

    buf[off] = (byte) (values[i + 0] << 4);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 4);

    buf[off] = (byte) (values[i + 0] << 4);
    buf[off++] |= values[i + 1] >>> 8;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits20(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 12);

    buf[off++] = (byte) (values[i + 0] >>> 4);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 12);

    buf[off++] = (byte) (values[i + 0] >>> 4);

    buf[off] = (byte) (values[i + 0] << 4);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 4);

    buf[off] = (byte) (values[i + 0] << 4);
    buf[off++] |= values[i + 1] >>> 16;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits40(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 32);
    buf[off++] = (byte) (values[i + 0] >>> 24);
    buf[off++] = (byte) (values[i + 0] >>> 16);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits40(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 32);
    buf[off++] = (byte) (values[i + 0] >>> 24);
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 32);
    buf[off++] = (byte) (values[i + 0] >>> 24);
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
    buf[off++] = (byte) (values[i + 0]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 24);
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
    buf[off++] = (byte) (values[i + 0]);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
    buf[off++] = (byte) (values[i + 0]);

    buf[off++] = (byte) (values[i + 1] >>> 32);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits32(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 24);
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits32(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 24);
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
    buf[off++] = (byte) (values[i + 0]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 24);
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
    buf[off++] = (byte) (values[i + 0]);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
    buf[off++] = (byte) (values[i + 0]);

    buf[off++] = (byte) (values[i + 1] >>> 24);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits41(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 33);
    buf[off++] = (byte) (values[i + 0] >>> 25);
    buf[off++] = (byte) (values[i + 0] >>> 17);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits41(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 33);
    buf[off++] = (byte) (values[i + 0] >>> 25);
    buf[off++] = (byte) (values[i + 0] >>> 17);
    buf[off++] = (byte) (values[i + 0] >>> 9);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 33);
    buf[off++] = (byte) (values[i + 0] >>> 25);
    buf[off++] = (byte) (values[i + 0] >>> 17);
    buf[off++] = (byte) (values[i + 0] >>> 9);
    buf[off++] = (byte) (values[i + 0] >>> 1);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 25);
    buf[off++] = (byte) (values[i + 0] >>> 17);
    buf[off++] = (byte) (values[i + 0] >>> 9);
    buf[off++] = (byte) (values[i + 0] >>> 1);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 17);
    buf[off++] = (byte) (values[i + 0] >>> 9);
    buf[off++] = (byte) (values[i + 0] >>> 1);

    buf[off] = (byte) (values[i + 0] << 7);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 1);

    buf[off] = (byte) (values[i + 0] << 7);
    buf[off++] |= values[i + 1] >>> 34;
    buf[off++] = (byte) (values[i + 1] >>> 26);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits35(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 27;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits35(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 27;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 27;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x1f) << 30;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits28(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
    buf[off++] = (byte) (values[i + 0] >>> 4);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits28(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
    buf[off++] = (byte) (values[i + 0] >>> 4);
    buf[off] = (byte) (values[i + 0] << 4);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
    buf[off++] = (byte) (values[i + 0] >>> 4);
    buf[off] = (byte) (values[i + 0] << 4);
    buf[off++] |= values[i + 1] >>> 24;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 12);
    buf[off++] = (byte) (values[i + 0] >>> 4);
    buf[off] = (byte) (values[i + 0] << 4);
    buf[off++] |= values[i + 1] >>> 24;
    buf[off++] = (byte) (values[i + 1] >>> 16);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits53(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 45;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 37;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 29;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits53(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 45;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 37;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 29;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 45;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 37;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 29;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 37;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 29;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 29;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 7) << 50;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits63(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 55);
    buf[off++] = (byte) (values[i + 0] >>> 47);
    buf[off++] = (byte) (values[i + 0] >>> 39);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits63(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 55);
    buf[off++] = (byte) (values[i + 0] >>> 47);
    buf[off++] = (byte) (values[i + 0] >>> 39);
    buf[off++] = (byte) (values[i + 0] >>> 31);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 55);
    buf[off++] = (byte) (values[i + 0] >>> 47);
    buf[off++] = (byte) (values[i + 0] >>> 39);
    buf[off++] = (byte) (values[i + 0] >>> 31);
    buf[off++] = (byte) (values[i + 0] >>> 23);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 47);
    buf[off++] = (byte) (values[i + 0] >>> 39);
    buf[off++] = (byte) (values[i + 0] >>> 31);
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 39);
    buf[off++] = (byte) (values[i + 0] >>> 31);
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
    buf[off++] = (byte) (values[i + 0] >>> 7);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 31);
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
    buf[off++] = (byte) (values[i + 0] >>> 7);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
    buf[off++] = (byte) (values[i + 0] >>> 7);

    buf[off] = (byte) (values[i + 0] << 1);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 7);

    buf[off] = (byte) (values[i + 0] << 1);
    buf[off++] |= values[i + 1] >>> 62;
    buf[off++] = (byte) (values[i + 1] >>> 54);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits44(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 36;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 28;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits44(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 36;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 28;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 36;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 28;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 28;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0xf) << 40;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits15(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits15(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 1) << 14;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits31(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits31(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 1) << 30;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits46(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 38;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 30;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits46(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 38;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 30;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 38;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 30;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 30;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 3) << 44;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits6(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off]) >>> 2;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 3) << 4;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits20(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits20(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0xf) << 16;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits4(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off]) >>> 4;
    values[i + 1] = Byte.toUnsignedLong(buf[off++]) & 0xf;
    values[i + 2] = Byte.toUnsignedLong(buf[off]) >>> 4;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits21(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits21(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 7) << 18;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits9(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 1);

    buf[off] = (byte) (values[i + 0] << 7);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 1);

    buf[off] = (byte) (values[i + 0] << 7);
    buf[off++] |= values[i + 1] >>> 2;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits8(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0]);
    buf[off++] = (byte) (values[i + 1]);
    buf[off++] = (byte) (values[i + 2]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits10(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits10(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x3f) << 4;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits58(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 50);
    buf[off++] = (byte) (values[i + 0] >>> 42);
    buf[off++] = (byte) (values[i + 0] >>> 34);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits58(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 50);
    buf[off++] = (byte) (values[i + 0] >>> 42);
    buf[off++] = (byte) (values[i + 0] >>> 34);
    buf[off++] = (byte) (values[i + 0] >>> 26);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 50);
    buf[off++] = (byte) (values[i + 0] >>> 42);
    buf[off++] = (byte) (values[i + 0] >>> 34);
    buf[off++] = (byte) (values[i + 0] >>> 26);
    buf[off++] = (byte) (values[i + 0] >>> 18);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 42);
    buf[off++] = (byte) (values[i + 0] >>> 34);
    buf[off++] = (byte) (values[i + 0] >>> 26);
    buf[off++] = (byte) (values[i + 0] >>> 18);
    buf[off++] = (byte) (values[i + 0] >>> 10);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 34);
    buf[off++] = (byte) (values[i + 0] >>> 26);
    buf[off++] = (byte) (values[i + 0] >>> 18);
    buf[off++] = (byte) (values[i + 0] >>> 10);
    buf[off++] = (byte) (values[i + 0] >>> 2);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 26);
    buf[off++] = (byte) (values[i + 0] >>> 18);
    buf[off++] = (byte) (values[i + 0] >>> 10);
    buf[off++] = (byte) (values[i + 0] >>> 2);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 18);
    buf[off++] = (byte) (values[i + 0] >>> 10);
    buf[off++] = (byte) (values[i + 0] >>> 2);

    buf[off] = (byte) (values[i + 0] << 6);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 2);

    buf[off] = (byte) (values[i + 0] << 6);
    buf[off++] |= values[i + 1] >>> 52;
    buf[off++] = (byte) (values[i + 1] >>> 44);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits51(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 43);
    buf[off++] = (byte) (values[i + 0] >>> 35);
    buf[off++] = (byte) (values[i + 0] >>> 27);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits51(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 43);
    buf[off++] = (byte) (values[i + 0] >>> 35);
    buf[off++] = (byte) (values[i + 0] >>> 27);
    buf[off++] = (byte) (values[i + 0] >>> 19);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 43);
    buf[off++] = (byte) (values[i + 0] >>> 35);
    buf[off++] = (byte) (values[i + 0] >>> 27);
    buf[off++] = (byte) (values[i + 0] >>> 19);
    buf[off++] = (byte) (values[i + 0] >>> 11);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 35);
    buf[off++] = (byte) (values[i + 0] >>> 27);
    buf[off++] = (byte) (values[i + 0] >>> 19);
    buf[off++] = (byte) (values[i + 0] >>> 11);
    buf[off++] = (byte) (values[i + 0] >>> 3);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 27);
    buf[off++] = (byte) (values[i + 0] >>> 19);
    buf[off++] = (byte) (values[i + 0] >>> 11);
    buf[off++] = (byte) (values[i + 0] >>> 3);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 19);
    buf[off++] = (byte) (values[i + 0] >>> 11);
    buf[off++] = (byte) (values[i + 0] >>> 3);

    buf[off] = (byte) (values[i + 0] << 5);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 3);

    buf[off] = (byte) (values[i + 0] << 5);
    buf[off++] |= values[i + 1] >>> 46;
    buf[off++] = (byte) (values[i + 1] >>> 38);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits14(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits14(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 3) << 12;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits47(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 39;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 31;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits47(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 39;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 31;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 39;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 31;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 31;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 1) << 46;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits33(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 25);
    buf[off++] = (byte) (values[i + 0] >>> 17);
    buf[off++] = (byte) (values[i + 0] >>> 9);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits33(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 25);
    buf[off++] = (byte) (values[i + 0] >>> 17);
    buf[off++] = (byte) (values[i + 0] >>> 9);
    buf[off++] = (byte) (values[i + 0] >>> 1);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 25);
    buf[off++] = (byte) (values[i + 0] >>> 17);
    buf[off++] = (byte) (values[i + 0] >>> 9);
    buf[off++] = (byte) (values[i + 0] >>> 1);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 17);
    buf[off++] = (byte) (values[i + 0] >>> 9);
    buf[off++] = (byte) (values[i + 0] >>> 1);

    buf[off] = (byte) (values[i + 0] << 7);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 1);

    buf[off] = (byte) (values[i + 0] << 7);
    buf[off++] |= values[i + 1] >>> 26;
    buf[off++] = (byte) (values[i + 1] >>> 18);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits55(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 47);
    buf[off++] = (byte) (values[i + 0] >>> 39);
    buf[off++] = (byte) (values[i + 0] >>> 31);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits55(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 47);
    buf[off++] = (byte) (values[i + 0] >>> 39);
    buf[off++] = (byte) (values[i + 0] >>> 31);
    buf[off++] = (byte) (values[i + 0] >>> 23);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 47);
    buf[off++] = (byte) (values[i + 0] >>> 39);
    buf[off++] = (byte) (values[i + 0] >>> 31);
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 39);
    buf[off++] = (byte) (values[i + 0] >>> 31);
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
    buf[off++] = (byte) (values[i + 0] >>> 7);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 31);
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
    buf[off++] = (byte) (values[i + 0] >>> 7);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
    buf[off++] = (byte) (values[i + 0] >>> 7);

    buf[off] = (byte) (values[i + 0] << 1);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 7);

    buf[off] = (byte) (values[i + 0] << 1);
    buf[off++] |= values[i + 1] >>> 54;
    buf[off++] = (byte) (values[i + 1] >>> 46);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits2(final long[] values, final int i, final byte[] buf, int off) {
    buf[off] = (byte) (values[i + 0] << 6);
    buf[off] |= values[i + 1] << 4;
    buf[off] |= values[i + 2] << 2;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits48(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 40;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 32;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 24;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits48(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 40;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 32;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 24;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 40;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 32;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 24;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 32;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 24;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 24;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]);
    values[i + 1] = (Byte.toUnsignedLong(buf[off++])) << 40;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]);
    values[i + 1] = (Byte.toUnsignedLong(buf[off++])) << 40;
    values[i + 1] |= (Byte.toUnsignedLong(buf[off++])) << 32;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits21(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 13);

    buf[off++] = (byte) (values[i + 0] >>> 5);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 13);

    buf[off++] = (byte) (values[i + 0] >>> 5);

    buf[off] = (byte) (values[i + 0] << 3);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 5);

    buf[off] = (byte) (values[i + 0] << 3);
    buf[off++] |= values[i + 1] >>> 18;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits18(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits18(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x3f) << 12;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits54(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 46);
    buf[off++] = (byte) (values[i + 0] >>> 38);
    buf[off++] = (byte) (values[i + 0] >>> 30);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits54(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 46);
    buf[off++] = (byte) (values[i + 0] >>> 38);
    buf[off++] = (byte) (values[i + 0] >>> 30);
    buf[off++] = (byte) (values[i + 0] >>> 22);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 46);
    buf[off++] = (byte) (values[i + 0] >>> 38);
    buf[off++] = (byte) (values[i + 0] >>> 30);
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 38);
    buf[off++] = (byte) (values[i + 0] >>> 30);
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
    buf[off++] = (byte) (values[i + 0] >>> 6);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 30);
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
    buf[off++] = (byte) (values[i + 0] >>> 6);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
    buf[off++] = (byte) (values[i + 0] >>> 6);

    buf[off] = (byte) (values[i + 0] << 2);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 6);

    buf[off] = (byte) (values[i + 0] << 2);
    buf[off++] |= values[i + 1] >>> 52;
    buf[off++] = (byte) (values[i + 1] >>> 44);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits34(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 26);
    buf[off++] = (byte) (values[i + 0] >>> 18);
    buf[off++] = (byte) (values[i + 0] >>> 10);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits34(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 26);
    buf[off++] = (byte) (values[i + 0] >>> 18);
    buf[off++] = (byte) (values[i + 0] >>> 10);
    buf[off++] = (byte) (values[i + 0] >>> 2);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 26);
    buf[off++] = (byte) (values[i + 0] >>> 18);
    buf[off++] = (byte) (values[i + 0] >>> 10);
    buf[off++] = (byte) (values[i + 0] >>> 2);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 18);
    buf[off++] = (byte) (values[i + 0] >>> 10);
    buf[off++] = (byte) (values[i + 0] >>> 2);

    buf[off] = (byte) (values[i + 0] << 6);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 2);

    buf[off] = (byte) (values[i + 0] << 6);
    buf[off++] |= values[i + 1] >>> 28;
    buf[off++] = (byte) (values[i + 1] >>> 20);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits17(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits17(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x7f) << 10;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits11(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 3);

    buf[off] = (byte) (values[i + 0] << 5);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 3);

    buf[off] = (byte) (values[i + 0] << 5);
    buf[off++] |= values[i + 1] >>> 6;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits49(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 41;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 33;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 25;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits49(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 41;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 33;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 25;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 41;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 33;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 25;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 33;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 25;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 25;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x7f) << 42;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits60(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 52);
    buf[off++] = (byte) (values[i + 0] >>> 44);
    buf[off++] = (byte) (values[i + 0] >>> 36);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits60(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 52);
    buf[off++] = (byte) (values[i + 0] >>> 44);
    buf[off++] = (byte) (values[i + 0] >>> 36);
    buf[off++] = (byte) (values[i + 0] >>> 28);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 52);
    buf[off++] = (byte) (values[i + 0] >>> 44);
    buf[off++] = (byte) (values[i + 0] >>> 36);
    buf[off++] = (byte) (values[i + 0] >>> 28);
    buf[off++] = (byte) (values[i + 0] >>> 20);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 44);
    buf[off++] = (byte) (values[i + 0] >>> 36);
    buf[off++] = (byte) (values[i + 0] >>> 28);
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 36);
    buf[off++] = (byte) (values[i + 0] >>> 28);
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
    buf[off++] = (byte) (values[i + 0] >>> 4);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 28);
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
    buf[off++] = (byte) (values[i + 0] >>> 4);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 20);
    buf[off++] = (byte) (values[i + 0] >>> 12);
    buf[off++] = (byte) (values[i + 0] >>> 4);

    buf[off] = (byte) (values[i + 0] << 4);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 4);

    buf[off] = (byte) (values[i + 0] << 4);
    buf[off++] |= values[i + 1] >>> 56;
    buf[off++] = (byte) (values[i + 1] >>> 48);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits26(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits26(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x3f) << 20;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits16(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]);
    values[i + 1] = Byte.toUnsignedLong(buf[off++]) << 8;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits16(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]);
    values[i + 1] = Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 1] |= Byte.toUnsignedLong(buf[off++]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits50(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 42;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 34;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 26;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits50(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 42;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 34;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 26;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 42;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 34;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 26;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 34;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 26;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 26;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x3f) << 44;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits59(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 51;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 43;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 35;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits59(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 51;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 43;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 35;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 27;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 51;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 43;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 35;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 27;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 43;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 35;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 27;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 35;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 27;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 27;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x1f) << 54;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits32(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 24;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits32(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 24;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 24;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]);
    values[i + 1] = (Byte.toUnsignedLong(buf[off++])) << 24;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]);
    values[i + 1] = (Byte.toUnsignedLong(buf[off++])) << 24;
    values[i + 1] |= Byte.toUnsignedLong(buf[off++]) << 16;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits27(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits27(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x1f) << 22;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits25(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 17);

    buf[off++] = (byte) (values[i + 0] >>> 9);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 17);

    buf[off++] = (byte) (values[i + 0] >>> 9);

    buf[off++] = (byte) (values[i + 0] >>> 1);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 9);

    buf[off++] = (byte) (values[i + 0] >>> 1);

    buf[off] = (byte) (values[i + 0] << 7);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 1);

    buf[off] = (byte) (values[i + 0] << 7);
    buf[off++] |= values[i + 1] >>> 18;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits43(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 35);
    buf[off++] = (byte) (values[i + 0] >>> 27);
    buf[off++] = (byte) (values[i + 0] >>> 19);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits43(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 35);
    buf[off++] = (byte) (values[i + 0] >>> 27);
    buf[off++] = (byte) (values[i + 0] >>> 19);
    buf[off++] = (byte) (values[i + 0] >>> 11);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 35);
    buf[off++] = (byte) (values[i + 0] >>> 27);
    buf[off++] = (byte) (values[i + 0] >>> 19);
    buf[off++] = (byte) (values[i + 0] >>> 11);
    buf[off++] = (byte) (values[i + 0] >>> 3);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 27);
    buf[off++] = (byte) (values[i + 0] >>> 19);
    buf[off++] = (byte) (values[i + 0] >>> 11);
    buf[off++] = (byte) (values[i + 0] >>> 3);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 19);
    buf[off++] = (byte) (values[i + 0] >>> 11);
    buf[off++] = (byte) (values[i + 0] >>> 3);

    buf[off] = (byte) (values[i + 0] << 5);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 3);

    buf[off] = (byte) (values[i + 0] << 5);
    buf[off++] |= values[i + 1] >>> 38;
    buf[off++] = (byte) (values[i + 1] >>> 30);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits22(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits22(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 3) << 20;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits22(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 14);

    buf[off++] = (byte) (values[i + 0] >>> 6);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 14);

    buf[off++] = (byte) (values[i + 0] >>> 6);

    buf[off] = (byte) (values[i + 0] << 2);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 6);

    buf[off] = (byte) (values[i + 0] << 2);
    buf[off++] |= values[i + 1] >>> 20;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits1(final long[] values, final int i, final byte[] buf, final int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off]) >>> 7) & 1;
    values[i + 1] = (Byte.toUnsignedLong(buf[off]) >>> 6) & 1;
    values[i + 2] = (Byte.toUnsignedLong(buf[off]) >>> 5) & 1;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits41(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 33;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 25;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits41(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 33;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 25;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 33;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 25;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 25;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x7f) << 34;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits58(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 50;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 42;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 34;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits58(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 50;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 42;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 34;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 26;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 50;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 42;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 34;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 26;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 42;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 34;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 26;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 34;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 26;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 26;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x3f) << 52;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits42(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 34);
    buf[off++] = (byte) (values[i + 0] >>> 26);
    buf[off++] = (byte) (values[i + 0] >>> 18);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits42(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 34);
    buf[off++] = (byte) (values[i + 0] >>> 26);
    buf[off++] = (byte) (values[i + 0] >>> 18);
    buf[off++] = (byte) (values[i + 0] >>> 10);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 34);
    buf[off++] = (byte) (values[i + 0] >>> 26);
    buf[off++] = (byte) (values[i + 0] >>> 18);
    buf[off++] = (byte) (values[i + 0] >>> 10);
    buf[off++] = (byte) (values[i + 0] >>> 2);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 26);
    buf[off++] = (byte) (values[i + 0] >>> 18);
    buf[off++] = (byte) (values[i + 0] >>> 10);
    buf[off++] = (byte) (values[i + 0] >>> 2);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 18);
    buf[off++] = (byte) (values[i + 0] >>> 10);
    buf[off++] = (byte) (values[i + 0] >>> 2);

    buf[off] = (byte) (values[i + 0] << 6);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 2);

    buf[off] = (byte) (values[i + 0] << 6);
    buf[off++] |= values[i + 1] >>> 36;
    buf[off++] = (byte) (values[i + 1] >>> 28);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits6(final long[] values, final int i, final byte[] buf, int off) {
    buf[off] = (byte) (values[i + 0] << 2);
    buf[off++] |= values[i + 1] >>> 4;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits17(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 9);

    buf[off++] = (byte) (values[i + 0] >>> 1);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 9);

    buf[off++] = (byte) (values[i + 0] >>> 1);

    buf[off] = (byte) (values[i + 0] << 7);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 1);

    buf[off] = (byte) (values[i + 0] << 7);
    buf[off++] |= values[i + 1] >>> 10;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits56(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 48);
    buf[off++] = (byte) (values[i + 0] >>> 40);
    buf[off++] = (byte) (values[i + 0] >>> 32);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits56(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 48);
    buf[off++] = (byte) (values[i + 0] >>> 40);
    buf[off++] = (byte) (values[i + 0] >>> 32);
    buf[off++] = (byte) (values[i + 0] >>> 24);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 48);
    buf[off++] = (byte) (values[i + 0] >>> 40);
    buf[off++] = (byte) (values[i + 0] >>> 32);
    buf[off++] = (byte) (values[i + 0] >>> 24);
    buf[off++] = (byte) (values[i + 0] >>> 16);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 40);
    buf[off++] = (byte) (values[i + 0] >>> 32);
    buf[off++] = (byte) (values[i + 0] >>> 24);
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 32);
    buf[off++] = (byte) (values[i + 0] >>> 24);
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
    buf[off++] = (byte) (values[i + 0]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 24);
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
    buf[off++] = (byte) (values[i + 0]);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
    buf[off++] = (byte) (values[i + 0]);

    buf[off++] = (byte) (values[i + 1] >>> 48);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits12(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits12(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0xf) << 8;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits5(final long[] values, final int i, final byte[] buf, int off) {
    buf[off] = (byte) (values[i + 0] << 3);
    buf[off++] |= values[i + 1] >>> 2;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits4(final long[] values, final int i, final byte[] buf, int off) {
    buf[off] = (byte) (values[i + 0] << 4);
    buf[off++] |= values[i + 1];

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits39(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 31;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits39(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 31;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 31;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 1) << 38;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits62(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 54;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 46;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 38;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits62(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 54;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 46;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 38;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 30;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 54;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 46;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 38;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 30;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 46;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 38;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 30;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 38;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 30;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 30;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 22;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 14;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 6;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 2;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 3) << 60;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits56(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 48;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 40;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 32;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits56(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 48;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 40;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 32;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 24;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 48;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 40;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 32;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 24;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 40;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 32;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 24;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 32;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 24;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 24;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]);
    values[i + 1] = (Byte.toUnsignedLong(buf[off++])) << 48;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]);
    values[i + 1] = (Byte.toUnsignedLong(buf[off++])) << 48;
    values[i + 1] |= (Byte.toUnsignedLong(buf[off++])) << 40;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits47(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 39);
    buf[off++] = (byte) (values[i + 0] >>> 31);
    buf[off++] = (byte) (values[i + 0] >>> 23);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits47(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 39);
    buf[off++] = (byte) (values[i + 0] >>> 31);
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 39);
    buf[off++] = (byte) (values[i + 0] >>> 31);
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
    buf[off++] = (byte) (values[i + 0] >>> 7);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 31);
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
    buf[off++] = (byte) (values[i + 0] >>> 7);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
    buf[off++] = (byte) (values[i + 0] >>> 7);

    buf[off] = (byte) (values[i + 0] << 1);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 7);

    buf[off] = (byte) (values[i + 0] << 1);
    buf[off++] |= values[i + 1] >>> 46;
    buf[off++] = (byte) (values[i + 1] >>> 38);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits40(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 32;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 24;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits40(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 32;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 24;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 32;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 24;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 24;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]);
    values[i + 1] = (Byte.toUnsignedLong(buf[off++])) << 32;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]);
    values[i + 1] = (Byte.toUnsignedLong(buf[off++])) << 32;
    values[i + 1] |= (Byte.toUnsignedLong(buf[off++])) << 24;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits15(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 7);

    buf[off] = (byte) (values[i + 0] << 1);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 7);

    buf[off] = (byte) (values[i + 0] << 1);
    buf[off++] |= values[i + 1] >>> 14;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits3(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off]) >>> 5;
    values[i + 1] = (Byte.toUnsignedLong(buf[off]) >>> 2) & 7;
    values[i + 2] = (Byte.toUnsignedLong(buf[off++]) & 3) << 1;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits7(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off]) >>> 1;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 1) << 6;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits3(final long[] values, final int i, final byte[] buf, int off) {
    buf[off] = (byte) (values[i + 0] << 5);
    buf[off] |= values[i + 1] << 2;
    buf[off++] |= values[i + 2] >>> 1;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits61(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 53;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 45;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 37;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits61(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 53;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 45;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 37;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 29;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 53;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 45;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 37;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 29;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 45;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 37;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 29;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 37;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 29;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 29;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 21;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 13;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 5;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 3;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 7) << 58;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits43(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 35;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 27;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits43(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 35;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 27;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 35;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 27;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 27;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 19;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 11;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x1f) << 38;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits55(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 47;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 39;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 31;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits55(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 47;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 39;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 31;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 47;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 39;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 31;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 39;
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 31;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= (Byte.toUnsignedLong(buf[off++])) << 31;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 23;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 15;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 7;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 1;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 1) << 54;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits11(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits11(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 3;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 5;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x1f) << 6;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits61(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 53);
    buf[off++] = (byte) (values[i + 0] >>> 45);
    buf[off++] = (byte) (values[i + 0] >>> 37);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits61(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 53);
    buf[off++] = (byte) (values[i + 0] >>> 45);
    buf[off++] = (byte) (values[i + 0] >>> 37);
    buf[off++] = (byte) (values[i + 0] >>> 29);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 53);
    buf[off++] = (byte) (values[i + 0] >>> 45);
    buf[off++] = (byte) (values[i + 0] >>> 37);
    buf[off++] = (byte) (values[i + 0] >>> 29);
    buf[off++] = (byte) (values[i + 0] >>> 21);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 45);
    buf[off++] = (byte) (values[i + 0] >>> 37);
    buf[off++] = (byte) (values[i + 0] >>> 29);
    buf[off++] = (byte) (values[i + 0] >>> 21);
    buf[off++] = (byte) (values[i + 0] >>> 13);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 37);
    buf[off++] = (byte) (values[i + 0] >>> 29);
    buf[off++] = (byte) (values[i + 0] >>> 21);
    buf[off++] = (byte) (values[i + 0] >>> 13);
    buf[off++] = (byte) (values[i + 0] >>> 5);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 29);
    buf[off++] = (byte) (values[i + 0] >>> 21);
    buf[off++] = (byte) (values[i + 0] >>> 13);
    buf[off++] = (byte) (values[i + 0] >>> 5);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 21);
    buf[off++] = (byte) (values[i + 0] >>> 13);
    buf[off++] = (byte) (values[i + 0] >>> 5);

    buf[off] = (byte) (values[i + 0] << 3);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 5);

    buf[off] = (byte) (values[i + 0] << 3);
    buf[off++] |= values[i + 1] >>> 58;
    buf[off++] = (byte) (values[i + 1] >>> 50);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits16(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 8);
    buf[off++] = (byte) (values[i + 0]);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits16(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 8);
    buf[off++] = (byte) (values[i + 0]);

    buf[off++] = (byte) (values[i + 1] >>> 8);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits36(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 28;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits36(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 28;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 28;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 20;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 12;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 4;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 4;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0xf) << 32;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits25(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits25(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = Byte.toUnsignedLong(buf[off++]) << 17;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 9;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 1;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 7;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x7f) << 18;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits50(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 42);
    buf[off++] = (byte) (values[i + 0] >>> 34);
    buf[off++] = (byte) (values[i + 0] >>> 26);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits50(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 42);
    buf[off++] = (byte) (values[i + 0] >>> 34);
    buf[off++] = (byte) (values[i + 0] >>> 26);
    buf[off++] = (byte) (values[i + 0] >>> 18);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 42);
    buf[off++] = (byte) (values[i + 0] >>> 34);
    buf[off++] = (byte) (values[i + 0] >>> 26);
    buf[off++] = (byte) (values[i + 0] >>> 18);
    buf[off++] = (byte) (values[i + 0] >>> 10);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 34);
    buf[off++] = (byte) (values[i + 0] >>> 26);
    buf[off++] = (byte) (values[i + 0] >>> 18);
    buf[off++] = (byte) (values[i + 0] >>> 10);
    buf[off++] = (byte) (values[i + 0] >>> 2);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 26);
    buf[off++] = (byte) (values[i + 0] >>> 18);
    buf[off++] = (byte) (values[i + 0] >>> 10);
    buf[off++] = (byte) (values[i + 0] >>> 2);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 18);
    buf[off++] = (byte) (values[i + 0] >>> 10);
    buf[off++] = (byte) (values[i + 0] >>> 2);

    buf[off] = (byte) (values[i + 0] << 6);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 2);

    buf[off] = (byte) (values[i + 0] << 6);
    buf[off++] |= values[i + 1] >>> 44;
    buf[off++] = (byte) (values[i + 1] >>> 36);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits30(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
    buf[off++] = (byte) (values[i + 0] >>> 6);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits30(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
    buf[off++] = (byte) (values[i + 0] >>> 6);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 22);
    buf[off++] = (byte) (values[i + 0] >>> 14);
    buf[off++] = (byte) (values[i + 0] >>> 6);

    buf[off] = (byte) (values[i + 0] << 2);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 6);

    buf[off] = (byte) (values[i + 0] << 2);
    buf[off++] |= values[i + 1] >>> 28;
    buf[off++] = (byte) (values[i + 1] >>> 20);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits14(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 6);

    buf[off] = (byte) (values[i + 0] << 2);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 6);

    buf[off] = (byte) (values[i + 0] << 2);
    buf[off++] |= values[i + 1] >>> 12;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits48(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 40);
    buf[off++] = (byte) (values[i + 0] >>> 32);
    buf[off++] = (byte) (values[i + 0] >>> 24);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits48(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 40);
    buf[off++] = (byte) (values[i + 0] >>> 32);
    buf[off++] = (byte) (values[i + 0] >>> 24);
    buf[off++] = (byte) (values[i + 0] >>> 16);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 40);
    buf[off++] = (byte) (values[i + 0] >>> 32);
    buf[off++] = (byte) (values[i + 0] >>> 24);
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 32);
    buf[off++] = (byte) (values[i + 0] >>> 24);
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
    buf[off++] = (byte) (values[i + 0]);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 24);
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
    buf[off++] = (byte) (values[i + 0]);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 16);
    buf[off++] = (byte) (values[i + 0] >>> 8);
    buf[off++] = (byte) (values[i + 0]);

    buf[off++] = (byte) (values[i + 1] >>> 40);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits37(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 29);
    buf[off++] = (byte) (values[i + 0] >>> 21);
    buf[off++] = (byte) (values[i + 0] >>> 13);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits37(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 29);
    buf[off++] = (byte) (values[i + 0] >>> 21);
    buf[off++] = (byte) (values[i + 0] >>> 13);
    buf[off++] = (byte) (values[i + 0] >>> 5);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 29);
    buf[off++] = (byte) (values[i + 0] >>> 21);
    buf[off++] = (byte) (values[i + 0] >>> 13);
    buf[off++] = (byte) (values[i + 0] >>> 5);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 21);
    buf[off++] = (byte) (values[i + 0] >>> 13);
    buf[off++] = (byte) (values[i + 0] >>> 5);

    buf[off] = (byte) (values[i + 0] << 3);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 5);

    buf[off] = (byte) (values[i + 0] << 3);
    buf[off++] |= values[i + 1] >>> 34;
    buf[off++] = (byte) (values[i + 1] >>> 26);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits34(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 26;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void unpackBits34(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 26;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] = (Byte.toUnsignedLong(buf[off++])) << 26;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 18;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 10;
    values[i + 0] |= Byte.toUnsignedLong(buf[off++]) << 2;
    values[i + 0] |= Byte.toUnsignedLong(buf[off]) >>> 6;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 0x3f) << 28;
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void packBits39(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 31);
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
  static void packBits39(final long[] values, final int i, final byte[] buf, int off) {
    buf[off++] = (byte) (values[i + 0] >>> 31);
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
    buf[off++] = (byte) (values[i + 0] >>> 7);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 31);
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
    buf[off++] = (byte) (values[i + 0] >>> 7);

```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 23);
    buf[off++] = (byte) (values[i + 0] >>> 15);
    buf[off++] = (byte) (values[i + 0] >>> 7);

    buf[off] = (byte) (values[i + 0] << 1);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    buf[off++] = (byte) (values[i + 0] >>> 7);

    buf[off] = (byte) (values[i + 0] << 1);
    buf[off++] |= values[i + 1] >>> 38;
    buf[off++] = (byte) (values[i + 1] >>> 30);
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java

  static void unpackBits5(final long[] values, final int i, final byte[] buf, int off) {
    values[i + 0] = Byte.toUnsignedLong(buf[off]) >>> 3;

    values[i + 1] = (Byte.toUnsignedLong(buf[off++]) & 7) << 2;
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `org.apache.datasketches.memory.DefaultMemoryRequestServer`
in `src/main/java/org/apache/datasketches/theta/UpdateSketchBuilder.java`
#### Snippet
```java
   * be fixed at either {@link ResizeFactor#X1} or {@link ResizeFactor#X2}.</li>
   * <li>MemoryRequestServer (Direct only):
   * {@link org.apache.datasketches.memory.DefaultMemoryRequestServer}.</li>
   * </ul>
   * Parameters unique to the concurrent sketches only:
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link CompactSketch#wrap(Memory) CompactSketch.wrap(Memory)}
   * @param srcMem Ref: {@link CompactSketch#wrap(Memory) CompactSketch.wrap(Memory)}, {@code srcMem}
   * @return {@link CompactSketch CompactSketch}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link CompactSketch#wrap(Memory) CompactSketch.wrap(Memory)}
   * @param srcMem Ref: {@link CompactSketch#wrap(Memory) CompactSketch.wrap(Memory)}, {@code srcMem}
   * @return {@link CompactSketch CompactSketch}
   */
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link CompactSketch#heapify(Memory, long) CompactSketch.heapify(Memory, long)}
   * @param srcMem Ref: {@link CompactSketch#heapify(Memory, long) CompactSketch.heapify(Memory, long)}, {@code srcMem}
   * @param expectedSeed Ref: {@link CompactSketch#heapify(Memory, long) CompactSketch.heapify(Memory, long)},
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link CompactSketch#heapify(Memory, long) CompactSketch.heapify(Memory, long)}
   * @param srcMem Ref: {@link CompactSketch#heapify(Memory, long) CompactSketch.heapify(Memory, long)}, {@code srcMem}
   * @param expectedSeed Ref: {@link CompactSketch#heapify(Memory, long) CompactSketch.heapify(Memory, long)},
   * {@code expectedSeed}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
   * Ref: {@link CompactSketch#heapify(Memory, long) CompactSketch.heapify(Memory, long)}
   * @param srcMem Ref: {@link CompactSketch#heapify(Memory, long) CompactSketch.heapify(Memory, long)}, {@code srcMem}
   * @param expectedSeed Ref: {@link CompactSketch#heapify(Memory, long) CompactSketch.heapify(Memory, long)},
   * {@code expectedSeed}
   * @return {@link CompactSketch CompactSketch}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link UpdateSketch#heapify(Memory, long) UpdateSketch.heapify(Memory, long)}
   * @param srcMem Ref: {@link UpdateSketch#heapify(Memory, long) UpdateSketch.heapify(Memory, long)},
   *   {@code srcMem}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link UpdateSketch#heapify(Memory, long) UpdateSketch.heapify(Memory, long)}
   * @param srcMem Ref: {@link UpdateSketch#heapify(Memory, long) UpdateSketch.heapify(Memory, long)},
   *   {@code srcMem}
   * @param expectedSeed the seed used to validate the given Memory image.
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
   *   {@code srcMem}
   * @param expectedSeed the seed used to validate the given Memory image.
   * Ref: {@link UpdateSketch#heapify(Memory, long) UpdateSketch.heapify(Memory, long)},
   *   {@code expectedSeed}
   * @return {@link UpdateSketch UpdateSketch}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Convenience method, calls {@link SetOperation#wrap(Memory)} and casts the result to a Intersection
   * @param srcMem Ref: {@link SetOperation#wrap(Memory)}, {@code srcMem}
   * @return a Intersection backed by the given Memory
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Convenience method, calls {@link SetOperation#wrap(Memory)} and casts the result to a Intersection
   * @param srcMem Ref: {@link SetOperation#wrap(Memory)}, {@code srcMem}
   * @return a Intersection backed by the given Memory
   */
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Convenience method, calls {@link SetOperation#wrap(Memory)} and casts the result to a Union
   * @param srcMem Ref: {@link SetOperation#wrap(Memory)}, {@code srcMem}
   * @return a Union backed by the given Memory
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Convenience method, calls {@link SetOperation#wrap(Memory)} and casts the result to a Union
   * @param srcMem Ref: {@link SetOperation#wrap(Memory)}, {@code srcMem}
   * @return a Union backed by the given Memory
   */
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link UpdateSketch#heapify(Memory) UpdateSketch.heapify(Memory)}
   * @param srcMem Ref: {@link UpdateSketch#heapify(Memory) UpdateSketch.heapify(Memory)}, {@code srcMem}
   * @return {@link UpdateSketch UpdateSketch}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link UpdateSketch#heapify(Memory) UpdateSketch.heapify(Memory)}
   * @param srcMem Ref: {@link UpdateSketch#heapify(Memory) UpdateSketch.heapify(Memory)}, {@code srcMem}
   * @return {@link UpdateSketch UpdateSketch}
   */
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link Sketch#wrap(Memory, long) Sketch.wrap(Memory, long)}
   * @param srcMem Ref: {@link Sketch#wrap(Memory, long) Sketch.wrap(Memory, long)}, {@code srcMem}
   * @param expectedSeed the expectedSeed used to validate the given Memory image.
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link Sketch#wrap(Memory, long) Sketch.wrap(Memory, long)}
   * @param srcMem Ref: {@link Sketch#wrap(Memory, long) Sketch.wrap(Memory, long)}, {@code srcMem}
   * @param expectedSeed the expectedSeed used to validate the given Memory image.
   * Ref: {@link Sketch#wrap(Memory, long) Sketch.wrap(Memory, long)}, {@code expectedSeed}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
   * @param srcMem Ref: {@link Sketch#wrap(Memory, long) Sketch.wrap(Memory, long)}, {@code srcMem}
   * @param expectedSeed the expectedSeed used to validate the given Memory image.
   * Ref: {@link Sketch#wrap(Memory, long) Sketch.wrap(Memory, long)}, {@code expectedSeed}
   * @return {@link Sketch Sketch}
   */
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link SetOperation#wrap(Memory, long) SetOperation.wrap(Memory, long)}
   * @param srcMem Ref: {@link SetOperation#wrap(Memory, long) SetOperation.wrap(Memory, long)},
   * {@code srcMem}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link SetOperation#wrap(Memory, long) SetOperation.wrap(Memory, long)}
   * @param srcMem Ref: {@link SetOperation#wrap(Memory, long) SetOperation.wrap(Memory, long)},
   * {@code srcMem}
   * @param expectedSeed the seed used to validate the given Memory image.
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
   * {@code srcMem}
   * @param expectedSeed the seed used to validate the given Memory image.
   * Ref: {@link SetOperation#wrap(Memory, long) SetOperation.wrap(Memory, long)},
   * {@code expectedSeed}
   * @return {@link SetOperation SetOperation}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link Sketch#heapify(Memory, long) Sketch.heapify(Memory, long)}
   * @param srcMem Ref: {@link Sketch#heapify(Memory, long) Sketch.heapify(Memory, long)}, {@code srcMem}
   * @param expectedSeed the seed used to validate the given Memory image.
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link Sketch#heapify(Memory, long) Sketch.heapify(Memory, long)}
   * @param srcMem Ref: {@link Sketch#heapify(Memory, long) Sketch.heapify(Memory, long)}, {@code srcMem}
   * @param expectedSeed the seed used to validate the given Memory image.
   * Ref: {@link Sketch#heapify(Memory, long) Sketch.heapify(Memory, long)}, {@code expectedSeed}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
   * @param srcMem Ref: {@link Sketch#heapify(Memory, long) Sketch.heapify(Memory, long)}, {@code srcMem}
   * @param expectedSeed the seed used to validate the given Memory image.
   * Ref: {@link Sketch#heapify(Memory, long) Sketch.heapify(Memory, long)}, {@code expectedSeed}
   * @return {@link Sketch Sketch}
   */
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link Sketch#getSerializationVersion(Memory)}
   * @param srcMem Ref: {@link Sketch#getSerializationVersion(Memory)}, {@code srcMem}
   * @return Ref: {@link Sketch#getSerializationVersion(Memory)}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link Sketch#getSerializationVersion(Memory)}
   * @param srcMem Ref: {@link Sketch#getSerializationVersion(Memory)}, {@code srcMem}
   * @return Ref: {@link Sketch#getSerializationVersion(Memory)}
   */
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
   * Ref: {@link Sketch#getSerializationVersion(Memory)}
   * @param srcMem Ref: {@link Sketch#getSerializationVersion(Memory)}, {@code srcMem}
   * @return Ref: {@link Sketch#getSerializationVersion(Memory)}
   */
  public static int getSerializationVersion(final Memory srcMem) {
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link Sketch#heapify(Memory) Sketch.heapify(Memory)}
   * @param srcMem Ref: {@link Sketch#heapify(Memory) Sketch.heapify(Memory)}, {@code srcMem}
   * @return {@link Sketch Sketch}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link Sketch#heapify(Memory) Sketch.heapify(Memory)}
   * @param srcMem Ref: {@link Sketch#heapify(Memory) Sketch.heapify(Memory)}, {@code srcMem}
   * @return {@link Sketch Sketch}
   */
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link SetOperation#heapify(Memory) SetOperation.heapify(Memory)}
   * @param srcMem Ref: {@link SetOperation#heapify(Memory) SetOperation.heapify(Memory)}, {@code srcMem}
   * @return {@link SetOperation SetOperation}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link SetOperation#heapify(Memory) SetOperation.heapify(Memory)}
   * @param srcMem Ref: {@link SetOperation#heapify(Memory) SetOperation.heapify(Memory)}, {@code srcMem}
   * @return {@link SetOperation SetOperation}
   */
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link Sketch#wrap(Memory) Sketch.wrap(Memory)}
   * @param srcMem Ref: {@link Sketch#wrap(Memory) Sketch.wrap(Memory)}, {@code srcMem}
   * @return {@link Sketch Sketch}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link Sketch#wrap(Memory) Sketch.wrap(Memory)}
   * @param srcMem Ref: {@link Sketch#wrap(Memory) Sketch.wrap(Memory)}, {@code srcMem}
   * @return {@link Sketch Sketch}
   */
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Convenience method, calls {@link SetOperation#wrap(Memory)} and casts the result to a Intersection
   * @param srcMem Ref: {@link SetOperation#wrap(Memory)}, {@code srcMem}
   * @return a Intersection backed by the given Memory
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Convenience method, calls {@link SetOperation#wrap(Memory)} and casts the result to a Intersection
   * @param srcMem Ref: {@link SetOperation#wrap(Memory)}, {@code srcMem}
   * @return a Intersection backed by the given Memory
   */
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link SetOperation#wrap(Memory, long) SetOperation.wrap(Memory, long)}
   * @param srcMem Ref: {@link SetOperation#wrap(Memory, long) SetOperation.wrap(Memory, long)},
   * {@code srcMem}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link SetOperation#wrap(Memory, long) SetOperation.wrap(Memory, long)}
   * @param srcMem Ref: {@link SetOperation#wrap(Memory, long) SetOperation.wrap(Memory, long)},
   * {@code srcMem}
   * @param expectedSeed the seed used to validate the given Memory image.
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
   * {@code srcMem}
   * @param expectedSeed the seed used to validate the given Memory image.
   * Ref: {@link SetOperation#wrap(Memory, long) SetOperation.wrap(Memory, long)},
   * {@code expectedSeed}
   * @return {@link SetOperation SetOperation}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link SetOperation#wrap(Memory) SetOperation.wrap(Memory)}
   * @param srcMem Ref: {@link SetOperation#wrap(Memory) SetOperation.wrap(Memory)}, {@code srcMem}
   * @return {@link SetOperation SetOperation}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link SetOperation#wrap(Memory) SetOperation.wrap(Memory)}
   * @param srcMem Ref: {@link SetOperation#wrap(Memory) SetOperation.wrap(Memory)}, {@code srcMem}
   * @return {@link SetOperation SetOperation}
   */
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link CompactSketch#heapify(Memory) CompactSketch.heapify(Memory)}
   * @param srcMem Ref: {@link CompactSketch#heapify(Memory) CompactSketch.heapify(Memory)}, {@code srcMem}
   * @return {@link CompactSketch CompactSketch}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link CompactSketch#heapify(Memory) CompactSketch.heapify(Memory)}
   * @param srcMem Ref: {@link CompactSketch#heapify(Memory) CompactSketch.heapify(Memory)}, {@code srcMem}
   * @return {@link CompactSketch CompactSketch}
   */
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link UpdateSketch#wrap(Memory) UpdateSketch.wrap(Memory)}
   * @param srcMem Ref: {@link UpdateSketch#wrap(Memory) UpdateSketch.wrap(Memory)}, {@code srcMem}
   * @return {@link UpdateSketch UpdateSketch}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link UpdateSketch#wrap(Memory) UpdateSketch.wrap(Memory)}
   * @param srcMem Ref: {@link UpdateSketch#wrap(Memory) UpdateSketch.wrap(Memory)}, {@code srcMem}
   * @return {@link UpdateSketch UpdateSketch}
   */
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link UpdateSketch#wrap(Memory, long) UpdateSketch.wrap(Memory, long)}
   * @param srcMem Ref: {@link UpdateSketch#wrap(Memory, long) UpdateSketch.wrap(Memory, long)}, {@code srcMem}
   * @param expectedSeed the seed used to validate the given Memory image.
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link UpdateSketch#wrap(Memory, long) UpdateSketch.wrap(Memory, long)}
   * @param srcMem Ref: {@link UpdateSketch#wrap(Memory, long) UpdateSketch.wrap(Memory, long)}, {@code srcMem}
   * @param expectedSeed the seed used to validate the given Memory image.
   * Ref: {@link UpdateSketch#wrap(Memory, long) UpdateSketch.wrap(Memory, long)}, {@code expectedSeed}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
   * @param srcMem Ref: {@link UpdateSketch#wrap(Memory, long) UpdateSketch.wrap(Memory, long)}, {@code srcMem}
   * @param expectedSeed the seed used to validate the given Memory image.
   * Ref: {@link UpdateSketch#wrap(Memory, long) UpdateSketch.wrap(Memory, long)}, {@code expectedSeed}
   * @return {@link UpdateSketch UpdateSketch}
   */
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link SetOperation#heapify(Memory, long) SetOperation.heapify(Memory, long)}
   * @param srcMem Ref: {@link SetOperation#heapify(Memory, long) SetOperation.heapify(Memory, long)},
   * {@code srcMem}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link SetOperation#heapify(Memory, long) SetOperation.heapify(Memory, long)}
   * @param srcMem Ref: {@link SetOperation#heapify(Memory, long) SetOperation.heapify(Memory, long)},
   * {@code srcMem}
   * @param expectedSeed the seed used to validate the given Memory image.
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
   * {@code srcMem}
   * @param expectedSeed the seed used to validate the given Memory image.
   * Ref: {@link SetOperation#heapify(Memory, long) SetOperation.heapify(Memory, long)},
   * {@code expectedSeed}
   * @return {@link SetOperation SetOperation}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link CompactSketch#wrap(Memory, long) CompactSketch.wrap(Memory, long)}
   * @param srcMem Ref: {@link CompactSketch#wrap(Memory, long) CompactSketch.wrap(Memory, long)}, {@code srcMem}
   * @param expectedSeed Ref: {@link CompactSketch#wrap(Memory, long) CompactSketch.wrap(Memory, long)},
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link CompactSketch#wrap(Memory, long) CompactSketch.wrap(Memory, long)}
   * @param srcMem Ref: {@link CompactSketch#wrap(Memory, long) CompactSketch.wrap(Memory, long)}, {@code srcMem}
   * @param expectedSeed Ref: {@link CompactSketch#wrap(Memory, long) CompactSketch.wrap(Memory, long)},
   * {@code expectedSeed}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
   * Ref: {@link CompactSketch#wrap(Memory, long) CompactSketch.wrap(Memory, long)}
   * @param srcMem Ref: {@link CompactSketch#wrap(Memory, long) CompactSketch.wrap(Memory, long)}, {@code srcMem}
   * @param expectedSeed Ref: {@link CompactSketch#wrap(Memory, long) CompactSketch.wrap(Memory, long)},
   * {@code expectedSeed}
   * @return {@link CompactSketch CompactSketch}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Ref: {@link SetOperation#wrap(Memory) SetOperation.wrap(Memory)}
   * @param srcMem Ref: {@link SetOperation#wrap(Memory) SetOperation.wrap(Memory)}, {@code srcMem}
   * @return {@link SetOperation SetOperation}
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Ref: {@link SetOperation#wrap(Memory) SetOperation.wrap(Memory)}
   * @param srcMem Ref: {@link SetOperation#wrap(Memory) SetOperation.wrap(Memory)}, {@code srcMem}
   * @return {@link SetOperation SetOperation}
   */
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java

  /**
   * Convenience method, calls {@link SetOperation#wrap(Memory)} and casts the result to a Union
   * @param srcMem Ref: {@link SetOperation#wrap(Memory)}, {@code srcMem}
   * @return a Union backed by the given Memory
```

### JavadocReference
Cannot resolve symbol `Memory`
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
  /**
   * Convenience method, calls {@link SetOperation#wrap(Memory)} and casts the result to a Union
   * @param srcMem Ref: {@link SetOperation#wrap(Memory)}, {@code srcMem}
   * @return a Union backed by the given Memory
   */
```

### JavadocReference
Cannot resolve symbol `WritableMemory`
in `src/main/java/org/apache/datasketches/theta/AnotB.java`
#### Snippet
```java
   * Thus, this is not an accumulating update and does not interact with the {@link #setA(Sketch)},
   * {@link #notB(Sketch)}, {@link #getResult(boolean)}, or
   * {@link #getResult(boolean, WritableMemory, boolean)} methods.</p>
   *
   * <p>If either argument is null an exception is thrown.</p>
```

### JavadocReference
Cannot resolve symbol `WritableMemory`
in `src/main/java/org/apache/datasketches/theta/AnotB.java`
#### Snippet
```java
   * Thus, this is not an accumulating update and does not interact with the {@link #setA(Sketch)},
   * {@link #notB(Sketch)}, {@link #getResult(boolean)}, or
   * {@link #getResult(boolean, WritableMemory, boolean)} methods.</p>
   *
   * <p>If either argument is null an exception is thrown.</p>
```

## RuleId[id=SuspiciousSystemArraycopy]
### SuspiciousSystemArraycopy
Source parameter type 'java.lang.Object\[\]' is not assignable to destination parameter `outArr` of type 'T\[\]'
in `src/main/java/org/apache/datasketches/quantiles/ItemsByteArrayImpl.java`
#### Snippet
```java

    //Load base buffer
    System.arraycopy(combinedBuffer, 0, outArr, extra, baseBufferCount);

    //Load levels
```

### SuspiciousSystemArraycopy
Source parameter type 'java.lang.Object\[\]' is not assignable to destination parameter `outArr` of type 'T\[\]'
in `src/main/java/org/apache/datasketches/quantiles/ItemsByteArrayImpl.java`
#### Snippet
```java
      for (int level = 0; bitPattern != 0L; level++, bitPattern >>>= 1) {
        if ((bitPattern & 1L) > 0L) {
          System.arraycopy(combinedBuffer, (2 + level) * k, outArr, index, k);
          index += k;
        }
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/org/apache/datasketches/quantilescommon/QuantileSearchCriteria.java`
#### Snippet
```java
   *
   */
  EXCLUSIVE;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/org/apache/datasketches/theta/UpdateReturnState.java`
#### Snippet
```java
   * greater than theta.
   */
  RejectedOverTheta; //all UpdateSketches.hashUpdate()

}
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `getSamples()` may produce `NullPointerException`
in `src/main/java/org/apache/datasketches/sampling/ReservoirLongsSketch.java`
#### Snippet
```java
  ReservoirLongsSketch downsampledCopy(final int maxK) {
    final ReservoirLongsSketch rls = new ReservoirLongsSketch(maxK, rf_);
    for (final long l: getSamples()) {
      // Pretending old implicit weights are all 1. Not true in general, but they're all
      // equal so update should work properly as long as we update itemsSeen_ at the end.
```

### DataFlowIssue
Dereference of `getSamples()` may produce `NullPointerException`
in `src/main/java/org/apache/datasketches/sampling/ReservoirItemsSketch.java`
#### Snippet
```java
  ReservoirItemsSketch<T> downsampledCopy(final int maxK) {
    final ReservoirItemsSketch<T> ris = new ReservoirItemsSketch<>(maxK, rf_);
    for (final T item : getSamples()) {
      // Pretending old implicit weights are all 1. Not true in general, but they're all
      // equal so update should work properly as long as we update itemsSeen_ at the end.
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/datasketches/req/ReqSketchBuilder.java`
#### Snippet
```java
   */
  public ReqSketchBuilder() {
    bK = DEFAULT_K;
    bHRA = true;
    bReqDebug = null;
```

### DataFlowIssue
Array access `pairs[i]` may produce `NullPointerException`
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java

      for (int i = 0; i < numPairs; i++) {
        final int rowCol = pairs[i];
        final int  row = rowCol >>> 6;
        int col = (rowCol & 63);
```

### DataFlowIssue
Array access `pairs[i]` may produce `NullPointerException`
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
      // shift the columns over by 8 positions before compressing (because of the window)
      for (int i = 0; i < numPairs; i++) {
        assert (pairs[i] & 63) >= 8;
        pairs[i] -= 8;
      }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/datasketches/quantiles/ItemsUnion.java`
#### Snippet
```java

    switch (sw1) {
      case 0:  outCase = 0; break; //myQS = null,  other = null ; return null
      case 1:  outCase = 4; break; //myQS = null,  other = empty; create empty-heap(myMaxK)
      case 2:  outCase = 2; break; //myQS = null,  other = valid; stream or downsample to myMaxK
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/datasketches/quantiles/ItemsUnion.java`
#### Snippet
```java

    switch (outCase) {
      case 0: ret = null; break;
      case 1: ret = myQS; break;
      case 2: { //myQS = null,  other = valid; stream or downsample to myMaxK
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/datasketches/quantiles/DoublesUnionImpl.java`
#### Snippet
```java

    switch (sw1) {
      case 0:  outCase = 0; break; //myQS = null,  other = null ; return null
      case 1:  outCase = 4; break; //myQS = null,  other = empty; create empty-heap(myMaxK)
      case 2:  outCase = 2; break; //myQS = null,  other = valid; stream or downsample to myMaxK
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/datasketches/quantiles/DoublesUnionImpl.java`
#### Snippet
```java

    switch (outCase) {
      case 0: ret = null; break; //return null
      case 1: ret = myQS; break; //no-op
      case 2: { //myQS = null,  other = valid; stream or downsample to myMaxK
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/datasketches/theta/ForwardCompatibility.java`
#### Snippet
```java
    long thetaLong = Long.MAX_VALUE;
    if (preLongs == 1) {
      reqBytesIn = 8;
      validateInputSize(reqBytesIn, memCap);
      return EmptyCompactSketch.getInstance();
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/datasketches/theta/HeapQuickSelectSketch.java`
#### Snippet
```java

    assert newCount == curCount_;  //Assumes no dirty values.
    curCount_ = newCount;

    cache_ = tgtArr;
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
    final int newCount = HashOperations.hashArrayInsert(cache_, tgtArr, lgArrLongs_, thetaLong_);
    assert (curCount_ == newCount);
    curCount_ = newCount;
    cache_ = tgtArr;
    hashTableThreshold_ = setHashTableThreshold(lgNomLongs_, lgArrLongs_);
```

### DataFlowIssue
Array access `summariesBytes[i]` may produce `NullPointerException`
in `src/main/java/org/apache/datasketches/tuple/QuickSelectSketch.java`
#### Snippet
```java
          ByteArrayUtil.putLongLE(bytes, offset, hashTable_[j]);
          offset += Long.BYTES;
          System.arraycopy(summariesBytes[i], 0, bytes, offset, summariesBytes[i].length);
          offset += summariesBytes[i].length;
          i++;
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `src/main/java/org/apache/datasketches/theta/ConcurrentDirectQuickSelectSketch.java`
#### Snippet
```java
  @Override
  public byte[] toByteArray() {
    while (!sharedPropagationInProgress_.compareAndSet(false, true)) { } //busy wait till free
    final byte[] res = super.toByteArray();
    sharedPropagationInProgress_.set(false);
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/org/apache/datasketches/theta/ConcurrentDirectQuickSelectSketch.java`
#### Snippet
```java
  @Override
  public boolean startEagerPropagation() {
    while (!sharedPropagationInProgress_.compareAndSet(false, true)) { } //busy wait till free
    return (!isEstimationMode());// no eager propagation is allowed in estimation mode
  }
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/org/apache/datasketches/req/ReqCompactor.java`
#### Snippet
```java
    assert lgWeight == other.lgWeight;
    state |= other.state;
    while (ensureEnoughSections()) {}
    buf.sort();
    final FloatBuffer otherBuf = new FloatBuffer(other.buf);
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/org/apache/datasketches/theta/ConcurrentHeapQuickSelectSketch.java`
#### Snippet
```java
  @Override
  public boolean startEagerPropagation() {
    while (!sharedPropagationInProgress_.compareAndSet(false, true)) { } //busy wait till free
    return (!isEstimationMode());// no eager propagation is allowed in estimation mode
  }
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/org/apache/datasketches/theta/ConcurrentHeapQuickSelectSketch.java`
#### Snippet
```java
  @Override
  public byte[] toByteArray() {
    while (!sharedPropagationInProgress_.compareAndSet(false, true)) { } //busy wait till free
    final byte[] res = super.toByteArray();
    sharedPropagationInProgress_.set(false);
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of field `values`
in `src/main/java/org/apache/datasketches/hll/TgtHllType.java`
#### Snippet
```java
public enum TgtHllType { HLL_4, HLL_6, HLL_8;

  private static final TgtHllType values[] = values();

  public static final TgtHllType fromOrdinal(final int typeId) {
```

### CStyleArrayDeclaration
C-style array declaration of field `values`
in `src/main/java/org/apache/datasketches/hll/CurMode.java`
#### Snippet
```java
enum CurMode { LIST, SET, HLL; //do not change the order.

  public static final CurMode values[] = values();

  /**
```

### CStyleArrayDeclaration
C-style array declaration of field `xArrs`
in `src/main/java/org/apache/datasketches/hll/CompositeInterpolationXTable.java`
#### Snippet
```java
    {1, 2, 3, 5, 10, 20, 40, 80, 160, 320, 640, 1280, 2560, 5120, 10240, 20480, 40960, 81920 };

  static final double xArrs[][] = {
  // log K = 4
  {
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/datasketches/sampling/PreambleUtil.java`
#### Snippet
```java

  // flag bit masks
  //static final int BIG_ENDIAN_FLAG_MASK = 1;
  //static final int READ_ONLY_FLAG_MASK  = 2;
  static final int EMPTY_FLAG_MASK      = 4;
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/datasketches/sampling/PreambleUtil.java`
#### Snippet
```java
    final int flags = extractFlags(mem);
    final String flagsStr = zeroPad(Integer.toBinaryString(flags), 8) + ", " + (flags);
    //final boolean bigEndian = (flags & BIG_ENDIAN_FLAG_MASK) > 0;
    //final String nativeOrder = ByteOrder.nativeOrder().toString();
    //final boolean readOnly = (flags & READ_ONLY_FLAG_MASK) > 0;
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/datasketches/sampling/PreambleUtil.java`
#### Snippet
```java
    final int flags = extractFlags(mem);
    final String flagsStr = zeroPad(Integer.toBinaryString(flags), 8) + ", " + (flags);
    //final boolean bigEndian = (flags & BIG_ENDIAN_FLAG_MASK) > 0;
    //final String nativeOrder = ByteOrder.nativeOrder().toString();
    //final boolean readOnly = (flags & READ_ONLY_FLAG_MASK) > 0;
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/org/apache/datasketches/sampling/VarOptItemsSketch.java`
#### Snippet
```java

  /* Validates the heap condition for the weight array */
  /*
  private void validateHeap() {
    for (int j = h_ - 1; j >= 1; --j) {
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/datasketches/cpc/MergingValidation.java`
#### Snippet
```java
    final CpcUnion ugM = new CpcUnion(lgKm);

    // int lgKd = ((nA != 0) && (lgKa < lgKm)) ? lgKa : lgKm;
    // lgKd =     ((nB != 0) && (lgKb < lgKd)) ? lgKb : lgKd;
    int lgKd = lgKm;
```

### CommentedOutCode
Commented out code (7 lines)
in `src/main/java/org/apache/datasketches/kll/KllDoublesHelper.java`
#### Snippet
```java
   * above need to be modified.
   */ //NOTE Validation Method: Need to uncomment
  //    static int nextOffset = 0;
  //
  //    private static int deterministicOffset() {
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java

    // At this point we free the unused portion of the compression output buffer.
    //  final int[] shorterBuf = Arrays.copyOf(windowBuf, target.cwLength);
    //  target.compressedWindow = shorterBuf;
    target.cwStream = windowBuf; //avoid extra copy
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java

    //FOR TESTING If needed
    //        for (int i = 0; i < (source.numCoupons - 1); i++) {
    //          assert (Integer.compareUnsigned(allPairs[i], allPairs[i + 1]) < 0); }

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
      assert (bufBits < 32);
      compressedWords[nextWordIndex++] = (int) bitBuf;
      //bitBuf = 0;
      //bufBits = 0; // not really necessary
    }
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java

    // At this point we free the unused portion of the compression output buffer.
    //  final int[] shorterBuf = Arrays.copyOf(pairBuf, target.csvLength);
    //  target.compressedWindow = shorterBuf;

```

### CommentedOutCode
Commented out code (7 lines)
in `src/main/java/org/apache/datasketches/cpc/PairTable.java`
#### Snippet
```java
        for (int m = 0; m < a.length; m++) { a[m] = (int) b[m]; }
        // The following sanity check can be used during development
        //int bad = 0;
        //for (int m = l; m < (r - 1); m++) {
        //  final long b1 = a[m] & 0XFFFF_FFFFL;
```

### CommentedOutCode
Commented out code (7 lines)
in `src/main/java/org/apache/datasketches/cpc/PairTable.java`
#### Snippet
```java
    }
    // The following sanity check can be used during development
    //    int bad = 0;
    //    for (int m = l; m < (r - 1); m++) {
    //      final long b1 = a[m] & 0XFFFF_FFFFL;
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/datasketches/quantiles/HeapCompactDoublesSketch.java`
#### Snippet
```java
    assert hcds.baseBufferCount_ == sketch.getBaseBufferCount();

    //if (sketch.isEmpty()) {
    //  hcds.combinedBuffer_ = null;
    //  return hcds;
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/datasketches/quantiles/DoublesSketchAccessor.java`
#### Snippet
```java

    // shorter implementation, testing suggests a tiny bit slower
    //final long mask = (1 << tgtLvl) - 1;
    //return Long.bitCount(ds_.getBitPattern() & mask);
  }
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/datasketches/kll/KllHelper.java`
#### Snippet
```java
    } while (lvlStats.n < n);

    //gStats.numLevels = lvlStats.numLevels; //
    //gStats.maxItems = lvlStats.numItems; //
    return gStats;
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/datasketches/cpc/CompressedState.java`
#### Snippet
```java
        state.numCsv = (int) state.numCoupons; //only true for sparse_hybrid
        state.csvLengthInts = getSvLengthInts(mem);
        //state.cwLength = getCwLength(mem);
        //state.kxp = getKxP(mem);
        //state.hipEstAccum = getHipAccum(mem);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/datasketches/cpc/CompressedState.java`
#### Snippet
```java
        state.fiCol = getFiCol(mem);
        state.numCoupons = getNumCoupons(mem);
        //state.numCsv = getNumCsv(mem);
        //state.csvLength = getCsvLength(mem);
        state.cwLengthInts = getWLengthInts(mem);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/datasketches/cpc/CompressedState.java`
#### Snippet
```java
        //state.csvLength = getCsvLength(mem);
        state.cwLengthInts = getWLengthInts(mem);
        //state.kxp = getKxP(mem);
        //state.hipEstAccum = getHipAccum(mem);
        checkCapacity(mem.getCapacity(), state.getRequiredSerializedBytes());
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/datasketches/cpc/CompressedState.java`
#### Snippet
```java
        state.fiCol = getFiCol(mem);
        state.numCoupons = getNumCoupons(mem);
        //state.numCsv = getNumCsv(mem);
        //state.csvLength = getCsvLength(mem);
        state.cwLengthInts = getWLengthInts(mem);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/datasketches/cpc/CompressedState.java`
#### Snippet
```java
        state.csvLengthInts = getSvLengthInts(mem);
        state.cwLengthInts = getWLengthInts(mem);
        //state.kxp = getKxP(mem);
        //state.hipEstAccum = getHipAccum(mem);
        checkCapacity(mem.getCapacity(), state.getRequiredSerializedBytes());
```

### CommentedOutCode
Commented out code (7 lines)
in `src/main/java/org/apache/datasketches/kll/KllFloatsHelper.java`
#### Snippet
```java
   * above need to be modified.
   */ //NOTE Validation Method: Need to uncomment to use
  //    static int nextOffset = 0;
  //
  //    private static int deterministicOffset() {
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/datasketches/cpc/CompressionData.java`
#### Snippet
```java
      final int encodedLength = tmpE >> 12;

      // encodedBitpattern++; // uncomment this line to force failure when testing this method
      // encodedLength++;     // uncomment this line to force failure when testing this method

```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'IntegerSketch' is still used
in `src/main/java/org/apache/datasketches/tuple/aninteger/IntegerSketch.java`
#### Snippet
```java
   */
  @Deprecated
  public IntegerSketch(final Memory mem, final IntegerSummary.Mode mode) {
    super(mem, new IntegerSummaryDeserializer(), new IntegerSummaryFactory(mode));
  }
```

### DeprecatedIsStillUsed
Deprecated member 'DoubleSketch' is still used
in `src/main/java/org/apache/datasketches/tuple/adouble/DoubleSketch.java`
#### Snippet
```java
   */
  @Deprecated
  public DoubleSketch(final Memory mem, final DoubleSummary.Mode mode) {
    super(mem, new DoubleSummaryDeserializer(), new DoubleSummaryFactory(mode));
  }
```

### DeprecatedIsStillUsed
Deprecated member 'heapifyUpdatableSketch' is still used
in `src/main/java/org/apache/datasketches/tuple/Sketches.java`
#### Snippet
```java
   */
  @Deprecated
  public static <U, S extends UpdatableSummary<U>> UpdatableSketch<U, S> heapifyUpdatableSketch(
      final Memory mem,
      final SummaryDeserializer<S> deserializer,
```

### DeprecatedIsStillUsed
Deprecated member 'PairwiseSetOperations' is still used
in `src/main/java/org/apache/datasketches/theta/PairwiseSetOperations.java`
#### Snippet
```java
 */
@Deprecated
public class PairwiseSetOperations {

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'FdtSketch' is still used
in `src/main/java/org/apache/datasketches/fdt/FdtSketch.java`
#### Snippet
```java
   */
  @Deprecated
  FdtSketch(final Memory mem) {
    super(mem);
  }
```

### DeprecatedIsStillUsed
Deprecated member 'QuickSelectSketch' is still used
in `src/main/java/org/apache/datasketches/tuple/QuickSelectSketch.java`
#### Snippet
```java
   */
  @Deprecated
  QuickSelectSketch(
      final Memory mem,
      final SummaryDeserializer<S> deserializer,
```

## RuleId[id=ManualArrayCopy]
### ManualArrayCopy
Manual array copy
in `src/main/java/org/apache/datasketches/common/Util.java`
#### Snippet
```java

      if (postpend) {
        for (int i = 0; i < sLen; i++) {
          out[i] = chArr[i];
        }
```

### ManualArrayCopy
Manual array copy
in `src/main/java/org/apache/datasketches/common/Util.java`
#### Snippet
```java
          out[i] = padChar;
        }
        for (int i = blanks; i < fieldLength; i++) {
          out[i] = chArr[i - blanks];
        }
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/quantilescommon/QuantilesUtil.java`
#### Snippet
```java
   * @param values the given array of double values
   */
  public static final void checkDoublesSplitPointsOrder(final double[] values) {
    Objects.requireNonNull(values);
    final int len = values.length - 1;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/quantilescommon/QuantilesUtil.java`
#### Snippet
```java
   * @param values the given array of double values
   */
  public static final void checkFloatsSplitPointsOrder(final float[] values) {
    Objects.requireNonNull(values);
    final int len = values.length - 1;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/quantilescommon/QuantilesUtil.java`
#### Snippet
```java
   * @param nRank the given normalized rank.
   */
  public static final void checkNormalizedRankBounds(final double nRank) {
    if ((nRank < 0.0) || (nRank > 1.0)) {
      throw new SketchesArgumentException(
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/SingleItemSketch.java`
#### Snippet
```java
  }

  static final boolean otherCheckForSingleItem(final int preLongs, final int serVer,
      final int famId, final int flags) {
    // Flags byte: SI=X, Ordered=T, Compact=T, Empty=F, ReadOnly=T, BigEndian=F = X11010 = 0x1A.
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/SingleItemSketch.java`
#### Snippet
```java
  }

  static final boolean otherCheckForSingleItem(final Memory mem) {
    return otherCheckForSingleItem(extractPreLongs(mem), extractSerVer(mem),
        extractFamilyID(mem), extractFlags(mem) );
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hllmap/CouponHashMap.java`
#### Snippet
```java
  }

  private static final void checkMaxCouponsPerKey(final int maxCouponsPerKey) {
    checkIfIntPowerOf2(maxCouponsPerKey, "maxCouponsPerKey");
    final int cpk = maxCouponsPerKey;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hllmap/SingleCouponMap.java`
#### Snippet
```java
  }

  private static final double updateEntrySizeBytes(final int tableEntries, final int keySizeBytes) {
    final double byteFraction = Math.ceil(tableEntries / 8.0) / tableEntries;
    return keySizeBytes + Short.BYTES + byteFraction;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/Rebuilder.java`
#### Snippet
```java
   * @param lgNomLongs the log_base2 of k, the configuration parameter of the sketch
   */
  static final void quickSelectAndRebuild(final WritableMemory mem, final int preambleLongs,
      final int lgNomLongs) {
    //Note: This copies the Memory data onto the heap and then at the end copies the result
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/Rebuilder.java`
#### Snippet
```java
   * @param tgtLgArrLongs the LgArrLongs value for the new hash table
   */
  static final void resize(final WritableMemory mem, final int preambleLongs,
      final int srcLgArrLongs, final int tgtLgArrLongs) {
    //Note: This copies the Memory data onto the heap and then at the end copies the result
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/Rebuilder.java`
#### Snippet
```java
   * @param thetaLong theta as a long
   */
  static final void moveAndResize(final Memory srcMem, final int preambleLongs,
      final int srcLgArrLongs, final WritableMemory dstMem, final int dstLgArrLongs, final long thetaLong) {
    //Note: This copies the Memory data onto the heap and then at the end copies the result
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/Rebuilder.java`
#### Snippet
```java
   * @return the actual log2 Resize Factor that can be used to grow the hash table
   */
  static final int actLgResizeFactor(final long capBytes, final int lgArrLongs, final int preLongs,
      final int lgRF) {
    final int maxHTLongs = Util.floorPowerOf2(((int)(capBytes >>> 3) - preLongs));
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/ConcurrentDirectQuickSelectSketch.java`
#### Snippet
```java

  @Override
  public final void initBgPropagationService() {
    executorService_ = ConcurrentPropagationService.getExecutorService(Thread.currentThread().getId());
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
   * @return the compacted array.
   */
  static final long[] compactCache(final long[] srcCache, final int curCount,
      final long thetaLong, final boolean dstOrdered) {
    if (curCount == 0) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
  }

  private static final void checkFamilyAndFlags(
      final int srcFamId,
      final boolean srcCompactFlag,
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
   * @return the number of preamble longs
   */
  static final int computeCompactPreLongs(final boolean empty, final int curCount,
      final long thetaLong) {
    return (thetaLong < Long.MAX_VALUE) ? 3 : empty ? 1 : (curCount > 1) ? 2 : 1;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
  //All arguments must be valid and correct including flags.
  // Used as helper to create byte arrays as well as loading Memory for direct compact sketches
  static final Memory loadCompactMemory(
      final long[] compactHashArr,
      final short seedHash,
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
   * @param curCount the given current count
   */ //This handles #2 and #6 above
  static final void checkIllegalCurCountAndEmpty(final boolean empty, final int curCount) {
    if (empty && (curCount != 0)) { //this handles #2 and #6 above
      throw new SketchesStateException("Illegal State: Empty=true and Current Count != 0.");
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
   * @return thetaLong
   */
  static final long correctThetaOnCompact(final boolean empty, final int curCount,
      final long thetaLong) { //handles #4 above
    return (empty && (curCount == 0)) ? Long.MAX_VALUE : thetaLong;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
   * @return true if notEmpty, curCount = 1 and theta = 1.0;
   */
  static final boolean isSingleItem(final boolean empty, final int curCount,
      final long thetaLong) {
    return !empty && (curCount == 1) && (thetaLong == Long.MAX_VALUE);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hllmap/CouponTraverseMap.java`
#### Snippet
```java
  }

  private static final double updateEntrySizeBytes(final int tableEntries, final int keySizeBytes,
      final int maxCouponsPerKey) {
    final double byteFraction = Math.ceil(tableEntries / 8.0) / tableEntries;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hll/HllUtil.java`
#### Snippet
```java

  //Checks
  static final int checkLgK(final int lgK) {
    if ((lgK >= MIN_LOG_K) && (lgK <= MAX_LOG_K)) { return lgK; }
    throw new SketchesArgumentException(
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hll/HllUtil.java`
#### Snippet
```java
  }

  static final int getPairLow26(final int coupon) {
    return coupon & KEY_MASK_26;
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hll/HllUtil.java`
#### Snippet
```java
  }

  static final void checkNumStdDev(final int numStdDev) {
    if ((numStdDev < 1) || (numStdDev > 3)) {
      throw new SketchesArgumentException(
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hll/HllUtil.java`
#### Snippet
```java
  }

  static final int getPairValue(final int coupon) {
    return coupon >>> KEY_BITS_26;
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hll/HllUtil.java`
#### Snippet
```java

  //Exceptions
  static final void noWriteAccess() {
    throw new SketchesReadOnlyException(
        "This sketch is compact or does not have write access to the underlying resource.");
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/cpc/CpcSketch.java`
#### Snippet
```java
   * Resets this sketch to empty but retains the original LgK and Seed.
   */
  public final void reset() {
    numCoupons = 0;
    mergeFlag = false;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/tuple/Util.java`
#### Snippet
```java
   * @param seedHashB given seed hash B
   */
  public static final void checkSeedHashes(final short seedHashA, final short seedHashB) {
    if (seedHashA != seedHashB) {
      throw new SketchesArgumentException("Incompatible Seed Hashes. " + seedHashA + ", "
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/tuple/Util.java`
#### Snippet
```java
   * @return the UTF_8 byte array
   */
  public static final byte[] stringToByteArray(final String value) {
    if ((value == null) || value.isEmpty()) { return null; }
    return value.getBytes(UTF_8);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/tuple/Util.java`
#### Snippet
```java
   * @return the long array
   */
  public static final long[] doubleToLongArray(final double value) {
    final double d = (value == 0.0) ? 0.0 : value; // canonicalize -0.0, 0.0
    final long[] array = { Double.doubleToLongBits(d) }; // canonicalize all NaN forms
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/PreambleUtil.java`
#### Snippet
```java
   * @return the size in bytes
   */
  static final int getMemBytes(final int lgArrLongs, final int preambleLongs) {
    return (8 << lgArrLongs) + (preambleLongs << 3);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/PreambleUtil.java`
#### Snippet
```java
  }

  static final short checkMemorySeedHash(final Memory mem, final long seed) {
    final short seedHashMem = (short) extractSeedHash(mem);
    ThetaUtil.checkSeedHashes(seedHashMem, ThetaUtil.computeSeedHash(seed)); //throws if bad seedHash
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/quantiles/ItemsSketchSortedView.java`
#### Snippet
```java
   * @param comparator the given comparator for data type T
   */
  private final static <T> void populateFromItemsSketch(
      final int k, final long n, final long bitPattern, final T[] combinedBuffer,
      final int baseBufferCount, final int numQuantiles, final T[] quantilesArr, final long[] weightsArr,
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hll/Hll4Array.java`
#### Snippet
```java
  }

  static final Hll4Array heapify(final Memory mem) {
    final int lgConfigK = extractLgK(mem);
    final Hll4Array hll4Array = new Hll4Array(lgConfigK);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/quantiles/DoublesSketchSortedView.java`
#### Snippet
```java
   * it will be cumulative later.
   */
  private final static void populateFromDoublesSketch(
          final int k, final long n, final long bitPattern,
          final DoublesSketchAccessor sketchAccessor,
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/req/ReqSketch.java`
#### Snippet
```java
   * @return a new ReqSketchBuilder
   */
  public static final ReqSketchBuilder builder() {
    return new ReqSketchBuilder();
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/req/ReqSketch.java`
#### Snippet
```java
  }

  private final void refreshSortedView() {
    reqSV = (reqSV == null) ? new ReqSketchSortedView(this) : reqSV;
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hllmap/HllMap.java`
#### Snippet
```java
   * @return the first empty slot for the given key
   */
  private static final int findEmpty(final byte[] key, final int tableEntries, final byte[] stateArr) {
    final long[] hash = MurmurHash3.hash(key, SEED);
    int entryIndex  = getIndex(hash[0], tableEntries);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hllmap/HllMap.java`
#### Snippet
```java
  }

  private final void resize() {
    final int newTableEntries = nextPrime((int)(tableEntries_ * growthFactor_));
    final int newCapacityEntries = (int)(newTableEntries * LOAD_FACTOR);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hllmap/HllMap.java`
#### Snippet
```java
  }

  private static final double updateEntrySizeBytes(final int tableEntries, final int keySizeBytes,
      final int hllArrLongs) {
    final double byteFraction = Math.ceil(tableEntries / 8.0) / tableEntries;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hllmap/HllMap.java`
#### Snippet
```java
   */
  @Override
  final int findKey(final byte[] key) {
    final int keyLen = key.length;
    final long[] hash = MurmurHash3.hash(key, SEED);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hllmap/HllMap.java`
#### Snippet
```java
  //This method is specifically tied to the HLL array layout
  @SuppressFBWarnings(value = "IM_MULTIPLYING_RESULT_OF_IREM", justification = "False Positive")
  private final boolean updateHll(final int entryIndex, final int coupon) {
    final int newValue = coupon16Value(coupon);

```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/quantiles/ItemsUtil.java`
#### Snippet
```java
   * @param comparator the comparator for generic item data type T
   */
  static final <T> void validateItems(final T[] items, final Comparator<? super T> comparator) {
    final int lenM1 = items.length - 1;
    for (int j = 0; j < lenM1; j++) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/quantiles/ItemsSketch.java`
#### Snippet
```java
  // Restricted

  private final void refreshSortedView() {
    classicQisSV = (classicQisSV == null) ? new ItemsSketchSortedView<T>(this) : classicQisSV;
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hll/DirectHll6Array.java`
#### Snippet
```java

  //off-heap / direct
  private static final void put6Bit(final WritableMemory wmem, final int offsetBytes, final int slotNo,
      final int newValue) {
    final int startBit = slotNo * 6;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hll/DirectHll6Array.java`
#### Snippet
```java
  @Override
  //Would be used by Union, but not used because the gadget is always HLL8 type
  final void updateSlotNoKxQ(final int slotNo, final int newValue) {
    throw new SketchesStateException("Improper access.");
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hll/DirectHll6Array.java`
#### Snippet
```java

  @Override
  final int getSlotValue(final int slotNo) {
    return get6Bit(mem, HLL_BYTE_ARR_START, slotNo);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hll/DirectHll6Array.java`
#### Snippet
```java
  //Used by this couponUpdate()
  //updates HipAccum, CurMin, NumAtCurMin, KxQs and checks newValue > oldValue
  final void updateSlotWithKxQ(final int slotNo, final int newValue) {
    final int oldValue = getSlotValue(slotNo);
    if (newValue > oldValue) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/hll/DirectHll6Array.java`
#### Snippet
```java

  //off-heap / direct
  private static final int get6Bit(final Memory mem, final int offsetBytes, final int slotNo) {
    final int startBit = slotNo * 6;
    final int shift = startBit & 0X7;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/ForwardCompatibility.java`
#### Snippet
```java
   * @return a SerVer 3 {@link CompactSketch}.
   */
  static final CompactSketch heapify1to3(final Memory srcMem, final short seedHash) {
    final int memCap = (int) srcMem.getCapacity();
    final int preLongs = extractPreLongs(srcMem); //always 3 for serVer 1
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/ForwardCompatibility.java`
#### Snippet
```java
  }

  private static final void validateInputSize(final int reqBytesIn, final int memCap) {
    if (reqBytesIn > memCap) {
      throw new SketchesArgumentException(
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/ForwardCompatibility.java`
#### Snippet
```java
   * @return a SerVer 3 HeapCompactOrderedSketch
   */
  static final CompactSketch heapify2to3(final Memory srcMem, final short seedHash) {
    final int memCap = (int) srcMem.getCapacity();
    final int preLongs = extractPreLongs(srcMem); //1,2 or 3
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
   * @return <a href="{@docRoot}/resources/dictionary.html#updateReturnState">See Update Return State</a>
   */
  final UpdateReturnState enhancedHashInsert(final long[] hashTable, final long hash) {
    final int arrayMask = (1 << lgArrLongs_) - 1; // arrayLongs -1
    // make odd and independent of curProbe:
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
  //Checks for rare lockup condition
  // Used by hashUpdate(), rebuild()
  private final void rebuildDirty() {
    final int curCountBefore = curCount_;
    forceRebuildDirtyCache(); //changes curCount_ only
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
  //Force resize. Changes lgArrLongs_ only. Theta doesn't change, count doesn't change.
  // Used by rebuildDirty(), resizeClean()
  private final void forceResizeCleanCache(final int lgResizeFactor) {
    assert (!dirty_); // Should never be dirty before a resize.
    lgArrLongs_ += lgResizeFactor; // new tgt size
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java

  @Override
  public final void reset() {
    final int lgArrLongs =
        ThetaUtil.startingSubMultiple(lgNomLongs_ + 1, getResizeFactor().lg(), ThetaUtil.MIN_LG_ARR_LONGS);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
  //Cache stays the same size. Must be dirty. Theta doesn't change, count will change.
  // Used by rebuildDirtyAtTgtSize()
  private final void forceRebuildDirtyCache() {
    final long[] tgtArr = new long[1 << lgArrLongs_];
    curCount_ = HashOperations.hashArrayInsert(cache_, tgtArr, lgArrLongs_, thetaLong_);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
  //Checks for rare lockup condition
  // Used by hashUpdate()
  private final void resizeClean() {
    //must resize, but are we at tgt size?
    final int lgTgtLongs = lgNomLongs_ + 1;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
   * @return R.
   */
  private static final int getR(final double theta, final double alpha, final double p) {
    final double split1 = (p * (alpha + 1.0)) / 2.0;
    if (theta > split1) { return 0; }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
   */
  // @formatter:on
  private static final double getVariance(final double k, final double p, final double alpha,
      final double theta, final int count) {
    final double kPlus1 = k + 1.0;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
   * @return the hash table threshold
   */
  private static final int setHashTableThreshold(final int lgNomLongs, final int lgArrLongs) {
    final double fraction = (lgArrLongs <= lgNomLongs) ? ThetaUtil.RESIZE_THRESHOLD : ThetaUtil.REBUILD_THRESHOLD;
    return (int) Math.floor(fraction * (1 << lgArrLongs));
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
  }

  static final boolean isCompressed(final Memory mem) {
    return (getFlags(mem) & COMPRESSED_FLAG_MASK) > 0;
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
  }

  static final boolean hasWindow(final Memory mem) {
    return (getFlags(mem) & WINDOW_FLAG_MASK) > 0;
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
  }

  static final boolean hasSv(final Memory mem) {
    return (getFlags(mem) & SUP_VAL_FLAG_MASK) > 0;
  }
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/datasketches/quantiles/ItemsUnion.java`
#### Snippet
```java
      case 2:  outCase = 2; break; //myQS = null,  other = valid; stream or downsample to myMaxK
      case 4:  outCase = 1; break; //myQS = empty, other = null ; no-op
      case 5:  outCase = 1; break; //myQS = empty, other = empty; no-op
      case 6:  outCase = 3; break; //myQS = empty, other = valid; merge
      case 8:  outCase = 1; break; //myQS = valid, other = null ; no-op
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/datasketches/quantiles/ItemsUnion.java`
#### Snippet
```java
      case 5:  outCase = 1; break; //myQS = empty, other = empty; no-op
      case 6:  outCase = 3; break; //myQS = empty, other = valid; merge
      case 8:  outCase = 1; break; //myQS = valid, other = null ; no-op
      case 9:  outCase = 1; break; //myQS = valid, other = empty: no-op
      case 10: outCase = 3; break; //myQS = valid, other = valid; merge
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/datasketches/quantiles/ItemsUnion.java`
#### Snippet
```java
      case 6:  outCase = 3; break; //myQS = empty, other = valid; merge
      case 8:  outCase = 1; break; //myQS = valid, other = null ; no-op
      case 9:  outCase = 1; break; //myQS = valid, other = empty: no-op
      case 10: outCase = 3; break; //myQS = valid, other = valid; merge
      default: break; //This cannot happen
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/datasketches/quantiles/ItemsUnion.java`
#### Snippet
```java
      case 8:  outCase = 1; break; //myQS = valid, other = null ; no-op
      case 9:  outCase = 1; break; //myQS = valid, other = empty: no-op
      case 10: outCase = 3; break; //myQS = valid, other = valid; merge
      default: break; //This cannot happen
    }
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/datasketches/quantiles/DoublesUnionImpl.java`
#### Snippet
```java
      case 2:  outCase = 2; break; //myQS = null,  other = valid; stream or downsample to myMaxK
      case 4:  outCase = 1; break; //myQS = empty, other = null ; no-op
      case 5:  outCase = 1; break; //myQS = empty, other = empty; no-op
      case 6:  outCase = 3; break; //myQS = empty, other = valid; merge
      case 8:  outCase = 1; break; //myQS = valid, other = null ; no-op
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/datasketches/quantiles/DoublesUnionImpl.java`
#### Snippet
```java
      case 5:  outCase = 1; break; //myQS = empty, other = empty; no-op
      case 6:  outCase = 3; break; //myQS = empty, other = valid; merge
      case 8:  outCase = 1; break; //myQS = valid, other = null ; no-op
      case 9:  outCase = 1; break; //myQS = valid, other = empty: no-op
      case 10: outCase = 3; break; //myQS = valid, other = valid; merge
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/datasketches/quantiles/DoublesUnionImpl.java`
#### Snippet
```java
      case 6:  outCase = 3; break; //myQS = empty, other = valid; merge
      case 8:  outCase = 1; break; //myQS = valid, other = null ; no-op
      case 9:  outCase = 1; break; //myQS = valid, other = empty: no-op
      case 10: outCase = 3; break; //myQS = valid, other = valid; merge
      default: break; //This cannot happen
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/datasketches/quantiles/DoublesUnionImpl.java`
#### Snippet
```java
      case 8:  outCase = 1; break; //myQS = valid, other = null ; no-op
      case 9:  outCase = 1; break; //myQS = valid, other = empty: no-op
      case 10: outCase = 3; break; //myQS = valid, other = valid; merge
      default: break; //This cannot happen
    }
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `lg_` in enum 'ResizeFactor'
in `src/main/java/org/apache/datasketches/common/ResizeFactor.java`
#### Snippet
```java
  X8(3);

  private int lg_;

  ResizeFactor(final int lg) {
```

### NonFinalFieldInEnum
Non-final field `msg` in enum 'Error'
in `src/main/java/org/apache/datasketches/kll/KllSketch.java`
#### Snippet
```java
    MUST_NOT_BE_UPDATABLE_FORMAT("Given Memory object must not be in updatableFormat.");

    private String msg;

    private Error(final String msg) {
```

### NonFinalFieldInEnum
Non-final field `msg` in enum 'MemoryInputError'
in `src/main/java/org/apache/datasketches/kll/KllMemoryValidate.java`
#### Snippet
```java
    EMPTYBIT_AND_SINGLEBIT("Empty flag bit and SingleItem flag bit cannot both be set. Flags: ");

    private String msg;

    private MemoryInputError(final String msg) {
```

### NonFinalFieldInEnum
Non-final field `fmtArr` in enum 'Format'
in `src/main/java/org/apache/datasketches/cpc/Format.java`
#### Snippet
```java
  PINNED_SLIDING_HIP;

  private static Format[] fmtArr = Format.class.getEnumConstants();

  /**
```

### NonFinalFieldInEnum
Non-final field `fmtArr` in enum 'Flavor'
in `src/main/java/org/apache/datasketches/cpc/Flavor.java`
#### Snippet
```java
  SLIDING; // 27K/8 <= C

  private static Flavor[] fmtArr = Flavor.class.getEnumConstants();

  /**
```

### NonFinalFieldInEnum
Non-final field `maxPreLongs_` in enum 'Family'
in `src/main/java/org/apache/datasketches/common/Family.java`
#### Snippet
```java
  private String famName_;
  private int minPreLongs_;
  private int maxPreLongs_;

  static {
```

### NonFinalFieldInEnum
Non-final field `minPreLongs_` in enum 'Family'
in `src/main/java/org/apache/datasketches/common/Family.java`
#### Snippet
```java
  private int id_;
  private String famName_;
  private int minPreLongs_;
  private int maxPreLongs_;

```

### NonFinalFieldInEnum
Non-final field `famName_` in enum 'Family'
in `src/main/java/org/apache/datasketches/common/Family.java`
#### Snippet
```java
  private static final Map<String, Family> lookupFamName = new HashMap<>();
  private int id_;
  private String famName_;
  private int minPreLongs_;
  private int maxPreLongs_;
```

### NonFinalFieldInEnum
Non-final field `id_` in enum 'Family'
in `src/main/java/org/apache/datasketches/common/Family.java`
#### Snippet
```java
  private static final Map<Integer, Family> lookupID = new HashMap<>();
  private static final Map<String, Family> lookupFamName = new HashMap<>();
  private int id_;
  private String famName_;
  private int minPreLongs_;
```

### NonFinalFieldInEnum
Non-final field `unionAction` in enum 'CornerCase'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    private IntersectAction intersectAction;
    private AnotbAction anotbAction;
    private UnionAction unionAction;

    static {
```

### NonFinalFieldInEnum
Non-final field `anotbAction` in enum 'CornerCase'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    private String caseDescription;
    private IntersectAction intersectAction;
    private AnotbAction anotbAction;
    private UnionAction unionAction;

```

### NonFinalFieldInEnum
Non-final field `caseDescription` in enum 'CornerCase'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    private static final Map<Integer, CornerCase> caseIdToCornerCaseMap = new HashMap<>();
    private int caseId;
    private String caseDescription;
    private IntersectAction intersectAction;
    private AnotbAction anotbAction;
```

### NonFinalFieldInEnum
Non-final field `intersectAction` in enum 'CornerCase'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    private int caseId;
    private String caseDescription;
    private IntersectAction intersectAction;
    private AnotbAction anotbAction;
    private UnionAction unionAction;
```

### NonFinalFieldInEnum
Non-final field `actionId` in enum 'IntersectAction'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    FULL_INTERSECT("I", "Full Intersect");

    private String actionId;
    private String actionDescription;

```

### NonFinalFieldInEnum
Non-final field `actionId` in enum 'AnotbAction'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    FULL_ANOTB("N", "Full AnotB");

    private String actionId;
    private String actionDescription;

```

### NonFinalFieldInEnum
Non-final field `actionDescription` in enum 'IntersectAction'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java

    private String actionId;
    private String actionDescription;

    private IntersectAction(final String actionId, final String actionDescription) {
```

### NonFinalFieldInEnum
Non-final field `caseId` in enum 'CornerCase'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java

    private static final Map<Integer, CornerCase> caseIdToCornerCaseMap = new HashMap<>();
    private int caseId;
    private String caseDescription;
    private IntersectAction intersectAction;
```

### NonFinalFieldInEnum
Non-final field `actionDescription` in enum 'AnotbAction'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java

    private String actionId;
    private String actionDescription;

    private AnotbAction(final String actionId, final String actionDescription) {
```

### NonFinalFieldInEnum
Non-final field `actionDescription` in enum 'UnionAction'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java

    private String actionId;
    private String actionDescription;

    private UnionAction(final String actionId, final String actionDescription) {
```

### NonFinalFieldInEnum
Non-final field `actionId` in enum 'UnionAction'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    FULL_UNION("N", "Full Union");

    private String actionId;
    private String actionDescription;

```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/DirectHllArray.java`
#### Snippet
```java
  }

  private static final void checkReadOnly(final WritableMemory wmem) {
    if (wmem == null) {
      throw new SketchesArgumentException("Cannot modify a read-only sketch");
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/BaseHllSketch.java`
#### Snippet
```java
  }

  private static final int coupon(final long[] hash) {
    final int addr26 = (int) ((hash[0] & KEY_MASK_26));
    final int lz = Long.numberOfLeadingZeros(hash[1]);
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/ToByteArrayImpl.java`
#### Snippet
```java
  }

  private static final void insertAux(final AbstractHllArray srcImpl, final WritableMemory tgtWmem,
      final boolean tgtCompact) {
    final AuxHashMap auxHashMap = srcImpl.getAuxHashMap();
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/ToByteArrayImpl.java`
#### Snippet
```java
  }

  private static final void insertCommonHll(final AbstractHllArray srcImpl,
      final WritableMemory tgtWmem, final boolean compact) {
    insertPreInts(tgtWmem, srcImpl.getPreInts());
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/ToByteArrayImpl.java`
#### Snippet
```java
  }

  private static final void insertHll(final AbstractHllArray impl, final WritableMemory wmem,
      final boolean compact) {
    insertCommonHll(impl, wmem, compact);
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/ToByteArrayImpl.java`
#### Snippet
```java
  }

  private static final void copyCommonListAndSet(final AbstractCoupons impl,
      final WritableMemory wmem) {
    insertPreInts(wmem, impl.getPreInts());
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/CouponHashSet.java`
#### Snippet
```java
  }

  private static final int[] growHashSet(final int[] coupIntArr, final int tgtLgCoupArrSize) {
    final int[] tgtCouponIntArr = new int[1 << tgtLgCoupArrSize]; //create tgt
    final int len = coupIntArr.length;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Union.java`
#### Snippet
```java
  }

  private static final HllSketch useGadgetMemory(
      final HllSketch gadget, final HllSketch hll8Heap, final boolean setOooFlag) {
    final WritableMemory wmem = gadget.getWritableMemory();    //use the gdt wmem
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Union.java`
#### Snippet
```java
  }

  private static final void mergeHlltoHLLmode(final HllSketch src, final HllSketch tgt,
      final int srcLgK, final int tgtLgK, final boolean srcIsMem, final boolean tgtIsMem) {
      final int sw = (tgtIsMem ? 1 : 0) | (srcIsMem ? 2 : 0)
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Union.java`
#### Snippet
```java
   * @return the downsampled HllSketch.
   */
  private static final HllSketch downsample(final HllSketch candidate, final int tgtLgK) {
    final AbstractHllArray candArr = (AbstractHllArray) candidate.hllSketchImpl;
    final HllArray tgtHllArr = HllArray.newHeapHll(tgtLgK, TgtHllType.HLL_8);
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/theta/Sketch.java`
#### Snippet
```java
   * @return a Sketch
   */
  private static final Sketch heapifyUpdateFromMemory(final Memory srcMem, final long expectedSeed) {
    final long cap = srcMem.getCapacity();
    if (cap < 8) {
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/theta/Sketch.java`
#### Snippet
```java
  }

  private static final boolean estMode(final long thetaLong, final boolean empty) {
    return thetaLong < Long.MAX_VALUE && !empty;
  }
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/CouponHashMap.java`
#### Snippet
```java
  }

  private static final void checkMaxCouponsPerKey(final int maxCouponsPerKey) {
    checkIfIntPowerOf2(maxCouponsPerKey, "maxCouponsPerKey");
    final int cpk = maxCouponsPerKey;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/SingleCouponMap.java`
#### Snippet
```java
  }

  private static final double updateEntrySizeBytes(final int tableEntries, final int keySizeBytes) {
    final double byteFraction = Math.ceil(tableEntries / 8.0) / tableEntries;
    return keySizeBytes + Short.BYTES + byteFraction;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/UniqueCountMap.java`
#### Snippet
```java
  }

  private final void checkMethodKeySize(final byte[] key) {
    if (key.length != keySizeBytes_) {
      throw new SketchesArgumentException("Key size must be " + keySizeBytes_ + " bytes.");
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/UniqueCountMap.java`
#### Snippet
```java
  }

  private static final void checkConstructorKeySize(final int keySizeBytes) {
    if (keySizeBytes < 4) {
      throw new SketchesArgumentException("KeySizeBytes must be >= 4: " + keySizeBytes);
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
  }

  private static final void checkFamilyAndFlags(
      final int srcFamId,
      final boolean srcCompactFlag,
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/CouponTraverseMap.java`
#### Snippet
```java
  }

  private static final double updateEntrySizeBytes(final int tableEntries, final int keySizeBytes,
      final int maxCouponsPerKey) {
    final double byteFraction = Math.ceil(tableEntries / 8.0) / tableEntries;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/DirectAuxHashMap.java`
#### Snippet
```java
  }

  private static final void grow(final DirectHllArray host, final int oldLgAuxArrInts) {
    if (host.wmem == null) { noWriteAccess(); }
    final int oldAuxArrInts = 1 << oldLgAuxArrInts;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/DirectAuxHashMap.java`
#### Snippet
```java
  //Continues searching.
  //If the probe comes back to original index, throws an exception.
  private static final int find(final DirectHllArray host, final int slotNo) {
    final int lgAuxArrInts = extractLgArr(host.mem);
    assert lgAuxArrInts < host.lgConfigK : lgAuxArrInts;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/DirectCouponHashSet.java`
#### Snippet
```java
  //Continues searching
  //If the probe comes back to original index, throws an exception.
  private static final int find(final Memory mem, final int lgArr,
      final int coupon) {
    final int arrMask = (1 << lgArr) - 1;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/DirectCouponHashSet.java`
#### Snippet
```java
  }

  private static final void growHashSet(final WritableMemory wmem, final int tgtLgCouponArrSize) {
    final int tgtArrSize = 1 << tgtLgCouponArrSize;
    final int[] tgtCouponIntArr = new int[tgtArrSize];
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/quantiles/DoublesSketch.java`
#### Snippet
```java
  }

private final void refreshSortedView() {
  classicQdsSV = (classicQdsSV == null) ? new DoublesSketchSortedView(this) : classicQdsSV;
}
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/quantiles/ItemsSketchSortedView.java`
#### Snippet
```java
   * @param comparator the given comparator for data type T
   */
  private final static <T> void populateFromItemsSketch(
      final int k, final long n, final long bitPattern, final T[] combinedBuffer,
      final int baseBufferCount, final int numQuantiles, final T[] quantilesArr, final long[] weightsArr,
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/kll/KllDoublesSketch.java`
#### Snippet
```java
  void setMinFloatItem(final float item) { kllSketchThrow(MUST_NOT_CALL); }

  private final void refreshSortedView() {
    kllDoublesSV = (kllDoublesSV == null) ? new KllDoublesSketchSortedView(this) : kllDoublesSV;
  }
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Hll6Array.java`
#### Snippet
```java

  //on-heap
  private static final int get6Bit(final byte[] arr, final int offsetBytes, final int slotNo) {
    final int startBit = slotNo * 6;
    final int shift = startBit & 0X7;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Hll6Array.java`
#### Snippet
```java

  //on-heap
  private static final void put6Bit(final byte[] arr, final int offsetBytes, final int slotNo,
      final int newValue) {
    final int startBit = slotNo * 6;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HeapAuxHashMap.java`
#### Snippet
```java
  //Continues searching.
  //If the probe comes back to original index, throws an exception.
  private static final int find(final int[] auxArr, final int lgAuxArrInts, final int lgConfigK,
      final int slotNo) {
    assert lgAuxArrInts < lgConfigK;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/quantiles/DoublesSketchSortedView.java`
#### Snippet
```java
   * it will be cumulative later.
   */
  private final static void populateFromDoublesSketch(
          final int k, final long n, final long bitPattern,
          final DoublesSketchAccessor sketchAccessor,
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/req/ReqSketch.java`
#### Snippet
```java
  }

  private final void refreshSortedView() {
    reqSV = (reqSV == null) ? new ReqSketchSortedView(this) : reqSV;
  }
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/kll/KllFloatsSketch.java`
#### Snippet
```java
  void setMinDoubleItem(final double item) { kllSketchThrow(MUST_NOT_CALL); }

  private final void refreshSortedView() {
    kllFloatsSV = (kllFloatsSV == null) ? new KllFloatsSketchSortedView(this) : kllFloatsSV;
  }
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/HllMap.java`
#### Snippet
```java
   * @return the first empty slot for the given key
   */
  private static final int findEmpty(final byte[] key, final int tableEntries, final byte[] stateArr) {
    final long[] hash = MurmurHash3.hash(key, SEED);
    int entryIndex  = getIndex(hash[0], tableEntries);
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/HllMap.java`
#### Snippet
```java
  }

  private final void resize() {
    final int newTableEntries = nextPrime((int)(tableEntries_ * growthFactor_));
    final int newCapacityEntries = (int)(newTableEntries * LOAD_FACTOR);
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/HllMap.java`
#### Snippet
```java
  }

  private static final double updateEntrySizeBytes(final int tableEntries, final int keySizeBytes,
      final int hllArrLongs) {
    final double byteFraction = Math.ceil(tableEntries / 8.0) / tableEntries;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/HllMap.java`
#### Snippet
```java
  //This method is specifically tied to the HLL array layout
  @SuppressFBWarnings(value = "IM_MULTIPLYING_RESULT_OF_IREM", justification = "False Positive")
  private final boolean updateHll(final int entryIndex, final int coupon) {
    final int newValue = coupon16Value(coupon);

```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/quantiles/ItemsSketch.java`
#### Snippet
```java
  // Restricted

  private final void refreshSortedView() {
    classicQisSV = (classicQisSV == null) ? new ItemsSketchSortedView<T>(this) : classicQisSV;
  }
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/DirectHll6Array.java`
#### Snippet
```java

  //off-heap / direct
  private static final void put6Bit(final WritableMemory wmem, final int offsetBytes, final int slotNo,
      final int newValue) {
    final int startBit = slotNo * 6;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/DirectHll6Array.java`
#### Snippet
```java

  //off-heap / direct
  private static final int get6Bit(final Memory mem, final int offsetBytes, final int slotNo) {
    final int startBit = slotNo * 6;
    final int shift = startBit & 0X7;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Hll4Update.java`
#### Snippet
```java
  //An AuxHashMap must exist if any values in the current hllByteArray are already 15.
  //In C: again-two-registers.c Lines 710 "hhb_shift_to_bigger_curmin"
  private static final void shiftToBiggerCurMin(final AbstractHllArray host) {
    final int oldCurMin = host.getCurMin();
    final int newCurMin = oldCurMin + 1;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/theta/ForwardCompatibility.java`
#### Snippet
```java
  }

  private static final void validateInputSize(final int reqBytesIn, final int memCap) {
    if (reqBytesIn > memCap) {
      throw new SketchesArgumentException(
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllEstimators.java`
#### Snippet
```java
   */
  //In C: again-two-registers.c hhb_get_improved_linear_counting_estimate L1274
  private static final double getHllBitMapEstimate(
      final int lgConfigK, final int curMin, final int numAtCurMin) {
    final int configK = 1 << lgConfigK;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllEstimators.java`
#### Snippet
```java
  //In C: again-two-registers.c hhb_get_raw_estimate L1167
  //This algorithm is from Flajolet's, et al, 2007 HLL paper, Fig 3.
  private static final double getHllRawEstimate(final int lgConfigK, final double kxqSum) {
    final int configK = 1 << lgConfigK;
    final double correctionFactor;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/theta/HeapQuickSelectSketch.java`
#### Snippet
```java
  // theta and count don't change.
  // Used by hashUpdate()
  private final void resizeCache() {
    final ResizeFactor rf = getResizeFactor();
    final int lgMaxArrLongs = lgNomLongs_ + 1;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/theta/HeapQuickSelectSketch.java`
#### Snippet
```java

  //array stays the same size. Changes theta and thus count
  private final void quickSelectAndRebuild() {
    final int arrLongs = 1 << lgArrLongs_; // generally 2 * k,

```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
  //Checks for rare lockup condition
  // Used by hashUpdate(), rebuild()
  private final void rebuildDirty() {
    final int curCountBefore = curCount_;
    forceRebuildDirtyCache(); //changes curCount_ only
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
  //Force resize. Changes lgArrLongs_ only. Theta doesn't change, count doesn't change.
  // Used by rebuildDirty(), resizeClean()
  private final void forceResizeCleanCache(final int lgResizeFactor) {
    assert (!dirty_); // Should never be dirty before a resize.
    lgArrLongs_ += lgResizeFactor; // new tgt size
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
  //Cache stays the same size. Must be dirty. Theta doesn't change, count will change.
  // Used by rebuildDirtyAtTgtSize()
  private final void forceRebuildDirtyCache() {
    final long[] tgtArr = new long[1 << lgArrLongs_];
    curCount_ = HashOperations.hashArrayInsert(cache_, tgtArr, lgArrLongs_, thetaLong_);
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
  //Checks for rare lockup condition
  // Used by hashUpdate()
  private final void resizeClean() {
    //must resize, but are we at tgt size?
    final int lgTgtLongs = lgNomLongs_ + 1;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
   * @return R.
   */
  private static final int getR(final double theta, final double alpha, final double p) {
    final double split1 = (p * (alpha + 1.0)) / 2.0;
    if (theta > split1) { return 0; }
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
   */
  // @formatter:on
  private static final double getVariance(final double k, final double p, final double alpha,
      final double theta, final int count) {
    final double kPlus1 = k + 1.0;
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
   * @return the hash table threshold
   */
  private static final int setHashTableThreshold(final int lgNomLongs, final int lgArrLongs) {
    final double fraction = (lgArrLongs <= lgNomLongs) ? ThetaUtil.RESIZE_THRESHOLD : ThetaUtil.REBUILD_THRESHOLD;
    return (int) Math.floor(fraction * (1 << lgArrLongs));
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/CompressionCharacterization.java`
#### Snippet
```java
    final double avgUpd_nS = Math.round((double) sumUpd_nS / totalTrials);
    final double avgUpd_nSperN = avgUpd_nS / n;

    final double avgCom_nS = Math.round((double) sumCom_nS / totalTrials);
    final double avgCom_nSper2C = avgCom_nS / (2.0 * avgC);
    final double avgCom_nSperK = avgCom_nS / k;

    final double avgSer_nS = Math.round((double) sumSer_nS / totalTrials);
    final double avgSer_nSperW = avgSer_nS / avgWords;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/CompressionCharacterization.java`
#### Snippet
```java
    for (int i = 0; i < cols; i++) {
      hStrArr[i] = assy[i][0];
      headerFmt.append(assy[i][1]);
      headerFmt.append((i < (cols - 1)) ? "\t" : "\n");
      dataFmt.append(assy[i][2]);
      dataFmt.append((i < (cols - 1)) ? "\t" : "\n");
    }
    hfmt = headerFmt.toString();
    dfmt = dataFmt.toString();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
      final long codeVal = codeInfo & 0XFFFL;
      final int codeWordLength = (int) (codeInfo >>> 12);
      bitBuf |= (codeVal << bufBits);
      bufBits += codeWordLength;
      //MAYBE_FLUSH_BITBUF(compressedWords, nextWordIndex);
      if (bufBits >= 32) {
        compressedWords[nextWordIndex++] = (int) bitBuf;
        bitBuf >>>= 32;
        bufBits -= 32;
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
    if (bufBits >= 32) {
      compressedWords[nextWordIndex++] = (int) bitBuf;
      bitBuf >>>= 32;
      bufBits -= 32;
    }

    if (bufBits > 0) { // We are done encoding now, so we flush the bit buffer.
      assert (bufBits < 32);
      compressedWords[nextWordIndex++] = (int) bitBuf;
    }
    return nextWordIndex;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
      if (bufBits < 12) { // Prepare for a 12-bit peek into the bitstream.
        bitBuf |= ((compressedWords[nextWordIndex++] & 0XFFFF_FFFFL) << bufBits);
        bufBits += 32;
      }

      // These 12 bits will include an entire Huffman codeword.
      final int peek12 = (int) (bitBuf & 0XFFFL);
      final int lookup = decodingTable[peek12] & 0XFFFF;
      final int codeWordLength = lookup >>> 8;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
    int pairIndex = 0;

    final long[] ptrArr = new long[3];
    int nextWordIndex = 0; //must be int
    long bitBuf = 0;       //must be long
    int bufBits = 0;       //could be byte

    final long golombLoMask = (1L << numBaseBits) - 1L;

    int predictedRowIndex = 0;
    int predictedColIndex = 0;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/CpcConfidence.java`
#### Snippet
```java
    if (numCoupons == 0) { return 0.0; }
    assert lgK >= 4;
    assert (kappa >= 1) && (kappa <= 3);
    double x = iconErrorConstant;
    if (lgK <= 14) { x = (iconHighSideData[(3 * (lgK - 4)) + (kappa - 1)]) / 10000.0; }
    final double rel = x / sqrt(1 << lgK);
    final double eps = kappa * rel;
    final double est = getIconEstimate(lgK, numCoupons);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/CpcConfidence.java`
#### Snippet
```java
    if (numCoupons == 0) { return 0.0; }
    assert lgK >= 4;
    assert (kappa >= 1) && (kappa <= 3);
    double x = hipErrorConstant;
    if (lgK <= 14) { x = (hipHighSideData[(3 * (lgK - 4)) + (kappa - 1)]) / 10000.0; }
    final double rel = x / sqrt(1 << lgK);
    final double eps = kappa * rel;
    final double est = hipEstAccum;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/QuickMergingValidation.java`
#### Snippet
```java
    final Flavor fA = skA.getFlavor();
    final Flavor fB = skB.getFlavor();
    final Flavor fR = skR.getFlavor();
    final String aOff = Integer.toString(skA.windowOffset);
    final String bOff = Integer.toString(skB.windowOffset);
    final String rOff = Integer.toString(skR.windowOffset);
    final String fAoff = fA + String.format("%2s",aOff);
    final String fBoff = fB + String.format("%2s",bOff);
    final String fRoff = fR + String.format("%2s",rOff);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/MergingValidation.java`
#### Snippet
```java
    final Flavor flavorA = skA.getFlavor();
    final Flavor flavorB = skB.getFlavor();
    final String dOff = Integer.toString(skD.windowOffset);
    final String aOff = Integer.toString(skA.windowOffset);
    final String bOff = Integer.toString(skB.windowOffset);
    final String flavorDoff = flavorD + String.format("%2s",dOff);
    final String flavorAoff = flavorA + String.format("%2s",aOff);
    final String flavorBoff = flavorB + String.format("%2s",bOff);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/PairTable.java`
#### Snippet
```java
    final int lgSizeInts = table.lgSizeInts;
    final int sizeInts = 1 << lgSizeInts;
    final int mask = sizeInts - 1;
    final int shift = table.validBits - lgSizeInts;
    rtAssert(shift > 0);
    int probe = item >>> shift; //extract high tablesize bits
    rtAssert((probe >= 0) && (probe <= mask));
    final int[] arr = table.slotsArr;
    int fetched = arr[probe];
    while ((fetched != item) && (fetched != -1)) {
      probe = (probe + 1) & mask;
      fetched = arr[probe];
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
    final byte preInts = getDefinedPreInts(format);
    final byte fiCol = (byte) 0;
    final byte flags = (byte) ((format.ordinal() << 2) | COMPRESSED_FLAG_MASK);
    checkCapacity(wmem.getCapacity(), 8);
    putFirst8(wmem, preInts, (byte) lgK, fiCol, flags, seedHash);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
    final byte preInts = getDefinedPreInts(format);
    final byte fiCol = (byte) 0;
    final byte flags = (byte) ((format.ordinal() << 2) | COMPRESSED_FLAG_MASK);
    checkCapacity(wmem.getCapacity(), 4L * (preInts + svLengthInts));
    putFirst8(wmem, preInts, (byte) lgK, fiCol, flags, seedHash);

    wmem.putInt(getHiFieldOffset(format, HiField.NUM_COUPONS), numCoupons);
    wmem.putInt(getHiFieldOffset(format, HiField.SV_LENGTH_INTS), svLengthInts);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
    final byte preInts = getDefinedPreInts(format);
    final byte flags = (byte) ((format.ordinal() << 2) | COMPRESSED_FLAG_MASK);
    checkCapacity(wmem.getCapacity(), 4L * (preInts + wLengthInts));
    putFirst8(wmem, preInts, (byte) lgK, (byte) fiCol, flags, seedHash);

    wmem.putInt(getHiFieldOffset(format, HiField.NUM_COUPONS), numCoupons);
    wmem.putInt(getHiFieldOffset(format, HiField.W_LENGTH_INTS), wLengthInts);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
    final byte preInts = getDefinedPreInts(format);
    final byte flags = (byte) ((format.ordinal() << 2) | COMPRESSED_FLAG_MASK);
    checkCapacity(wmem.getCapacity(), 4L * (preInts + svLengthInts + wLengthInts));
    putFirst8(wmem, preInts, (byte) lgK, (byte) fiCol, flags, seedHash);

    wmem.putInt(getHiFieldOffset(format, HiField.NUM_COUPONS), numCoupons);
    wmem.putInt(getHiFieldOffset(format, HiField.NUM_SV), numSv);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
        reqBytes = svStreamStart + (svLengthInts << 2);
        flavor = CpcUtil.determineFlavor(lgK, numCoupons);
        sb.append("Flavor                          : ").append(flavor).append(LS);
        sb.append("Num Coupons                     : ").append(numCoupons).append(LS);

        sb.append("Num SV                          : ").append(numSv).append(LS);
        sb.append("SV Length Ints                  : ").append(svLengthInts).append(LS);
        sb.append("SV Stream Start                 : ").append(svStreamStart).append(LS);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
        kxp = mem.getDouble(getHiFieldOffset(format, HiField.KXP));
        hipAccum = mem.getDouble(getHiFieldOffset(format, HiField.HIP_ACCUM));
        reqBytes = svStreamStart + (svLengthInts << 2);

        flavor = CpcUtil.determineFlavor(lgK, numCoupons);
        sb.append("Flavor                          : ").append(flavor).append(LS);
        sb.append("Num Coupons                     : ").append(numCoupons).append(LS);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
        reqBytes = wStreamStart + (wLengthInts << 2);

        flavor = CpcUtil.determineFlavor(lgK, numCoupons);
        sb.append("Flavor                          : ").append(flavor).append(LS);
        sb.append("Num Coupons                     : ").append(numCoupons).append(LS);

        sb.append("Window Offset                   : ").append(winOffset).append(LS);
        sb.append("Window Length Ints              : ").append(wLengthInts).append(LS);
        sb.append("Window Stream Start             : ").append(wStreamStart).append(LS);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
        sb.append("Window Offset                   : ").append(winOffset).append(LS);
        sb.append("Window Length Ints              : ").append(wLengthInts).append(LS);
        sb.append("Window Stream Start             : ").append(wStreamStart).append(LS);

        sb.append("KxP                             : ").append(kxp).append(LS);
        sb.append("HipAccum                        : ").append(hipAccum).append(LS);
        break;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
        numCoupons = mem.getInt(getHiFieldOffset(format, HiField.NUM_COUPONS) & 0xFFFF_FFFFL);

        winOffset = CpcUtil.determineCorrectOffset(lgK, numCoupons);
        wLengthInts = mem.getInt(getHiFieldOffset(format, HiField.W_LENGTH_INTS)) & 0xFFFF_FFFFL;

        numSv = mem.getInt(getHiFieldOffset(format, HiField.NUM_SV)) & 0xFFFF_FFFFL;
        svLengthInts = mem.getInt(getHiFieldOffset(format, HiField.SV_LENGTH_INTS)) & 0xFFFF_FFFFL;

        wStreamStart = getWStreamOffset(mem);
        svStreamStart = getSvStreamOffset(mem);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/cpc/RuntimeAsserts.java`
#### Snippet
```java
    if ((a == null) && (b == null)) { return; }
    if ((a != null) && (b != null)) {
      final int alen = a.length;
      if (alen != b.length) { error("Array lengths not equal: " + a.length + ", " + b.length); }
      for (int i = 0; i < alen; i++) {
        if (a[i] != b[i]) { error(a[i] + " != " + b[i] + " at index " + i); }
      }
    } else { error("Array " + ((a == null) ? "a" : "b") + " is null"); }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/frequencies/ItemsSketch.java`
#### Snippet
```java
    final long pre0 = PreambleUtil.checkPreambleSize(srcMem); //make sure preamble will fit
    final int maxPreLongs = Family.FREQUENCY.getMaxPreLongs();

    final int preLongs = extractPreLongs(pre0);         //Byte 0
    final int serVer = extractSerVer(pre0);             //Byte 1
    final int familyID = extractFamilyID(pre0);         //Byte 2
    final int lgMaxMapSize = extractLgMaxMapSize(pre0); //Byte 3
    final int lgCurMapSize = extractLgCurMapSize(pre0); //Byte 4
    final boolean empty = (extractFlags(pre0) & EMPTY_FLAG_MASK) != 0; //Byte 5

    // Checks
    final boolean preLongsEq1 = (preLongs == 1);        //Byte 0
    final boolean preLongsEqMax = (preLongs == maxPreLongs);
    if (!preLongsEq1 && !preLongsEqMax) {
      throw new SketchesArgumentException(
          "Possible Corruption: PreLongs must be 1 or " + maxPreLongs + ": " + preLongs);
    }
    if (serVer != SER_VER) {                            //Byte 1
      throw new SketchesArgumentException(
          "Possible Corruption: Ser Ver must be " + SER_VER + ": " + serVer);
    }
    final int actFamID = Family.FREQUENCY.getID();      //Byte 2
    if (familyID != actFamID) {
      throw new SketchesArgumentException(
          "Possible Corruption: FamilyID must be " + actFamID + ": " + familyID);
    }
    if (empty ^ preLongsEq1) {                          //Byte 5 and Byte 0
      throw new SketchesArgumentException(
          "Possible Corruption: (PreLongs == 1) ^ Empty == True.");
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/frequencies/ItemsSketch.java`
#### Snippet
```java
    final byte[] outArr = new byte[outBytes];
    final WritableMemory mem = WritableMemory.writableWrap(outArr);

    // build first preLong empty or not
    long pre0 = 0L;
    pre0 = insertPreLongs(preLongs, pre0);                  //Byte 0
    pre0 = insertSerVer(SER_VER, pre0);                     //Byte 1
    pre0 = insertFamilyID(Family.FREQUENCY.getID(), pre0);  //Byte 2
    pre0 = insertLgMaxMapSize(lgMaxMapSize, pre0);          //Byte 3
    pre0 = insertLgCurMapSize(hashMap.getLgLength(), pre0); //Byte 4
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/frequencies/ItemsSketch.java`
#### Snippet
```java
    hashMap.adjustOrPutValue(item, count);

    if (getNumActiveItems() > curMapCap) { //over the threshold, we need to do something
      if (hashMap.getLgLength() < lgMaxMapSize) { //below tgt size, we can grow
        hashMap.resize(2 * hashMap.getLength());
        curMapCap = hashMap.getCapacity();
      } else { //At tgt size, must purge
        offset += hashMap.purge(sampleSize);
        if (getNumActiveItems() > getMaximumMapCapacity()) {
          throw new SketchesStateException("Purge did not reduce active items.");
        }
      }
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/frequencies/ItemsSketch.java`
#### Snippet
```java
      while (iter.next()) {
        final long est = getEstimate(iter.getKey());
        final long ub = getUpperBound(iter.getKey());
        final long lb = getLowerBound(iter.getKey());
        if (ub >= threshold) {
          final Row<T> row = new Row<>(iter.getKey(), est, ub, lb);
          rowList.add(row);
        }
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/frequencies/LongsSketch.java`
#### Snippet
```java
      while (iter.next()) {
        final long est = getEstimate(iter.getKey());
        final long ub = getUpperBound(iter.getKey());
        final long lb = getLowerBound(iter.getKey());
        if (ub >= threshold) {
          final Row row = new Row(iter.getKey(), est, ub, lb);
          rowList.add(row);
        }
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/frequencies/LongsSketch.java`
#### Snippet
```java
    for (int i = 0; i < numActive; i++) {
      final long key = Long.parseLong(tokens[j++]);
      final long value = Long.parseLong(tokens[j++]);
      hashMap.adjustOrPutValue(key, value);
    }
    return hashMap;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/frequencies/ReversePurgeItemHashMap.java`
#### Snippet
```java
    if (numActive == 0) { return null; }
    final long[] returnedValues = new long[numActive];
    int j = 0;
    for (int i = 0; i < values.length; i++) {
      if (isActive(i)) {
        returnedValues[j] = values[i];
        j++;
      }
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/frequencies/ReversePurgeItemHashMap.java`
#### Snippet
```java
    final int limit = Math.min(sampleSize, getNumActive());

    int numSamples = 0;
    int i = 0;
    final long[] samples = new long[limit];

    while (numSamples < limit) {
      if (isActive(i)) {
        samples[numSamples] = values[i];
        numSamples++;
      }
      i++;
    }

    final long val = QuickSelect.select(samples, 0, numSamples - 1, limit / 2);
    adjustAllValuesBy(-1 * val);
    keepOnlyPositiveCounts();
    return val;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/frequencies/ReversePurgeItemHashMap.java`
#### Snippet
```java
      if (states[probe] > drift) {
        // move current element
        keys[deleteProbe] = keys[probe];
        values[deleteProbe] = values[probe];
        states[deleteProbe] = (short) (states[probe] - drift);
        // marking this location as deleted
        states[probe] = 0;
        drift = 0;
        deleteProbe = probe;
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/frequencies/ReversePurgeItemHashMap.java`
#### Snippet
```java
      keys_ = keys;
      values_ = values;
      states_ = states;
      numActive_ = numActive;
      stride_ = (int) (keys.length * GOLDEN_RATIO_RECIPROCAL) | 1;
      mask_ = keys.length - 1;
      i_ = -stride_;
      count_ = 0;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hll/AbstractCoupons.java`
#### Snippet
```java
    int probe = coupon & arrMask;
    final int loopIndex = probe;
    do {
      final int couponAtIdx = array[probe];
      if (couponAtIdx == EMPTY) {
        return ~probe; //empty
      }
      else if (coupon == couponAtIdx) {
        return probe; //duplicate
      }
      final int stride = ((coupon & KEY_MASK_26) >>> lgArrInts) | 1;
      probe = (probe + stride) & arrMask;
    } while (probe != loopIndex);
    throw new SketchesArgumentException("Key not found and no empty slots!");
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hll/HeapAuxHashMap.java`
#### Snippet
```java
    do {
      final int arrVal = auxArr[probe];
      if (arrVal == EMPTY) { //Compares on entire entry
        return ~probe; //empty
      }
      else if (slotNo == (arrVal & configKmask)) { //Compares only on slotNo
        return probe; //found given slotNo, return probe = index into aux array
      }
      final int stride = (slotNo >>> lgAuxArrInts) | 1;
      probe = (probe + stride) & auxArrMask;
    } while (probe != loopIndex);
    throw new SketchesArgumentException("Key not found and no empty slots!");
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hll/Conversions.java`
#### Snippet
```java
    hll6Array.putOutOfOrder(srcAbsHllArr.isOutOfOrder());
    int numZeros = 1 << lgConfigK;
    final PairIterator itr = srcAbsHllArr.iterator();
    while (itr.nextAll()) {
      if (itr.getValue() != EMPTY) {
        numZeros--;
        hll6Array.couponUpdate(itr.getPair()); //couponUpdate creates KxQ registers
      }
    }
    hll6Array.putNumAtCurMin(numZeros);
    hll6Array.putHipAccum(srcAbsHllArr.getHipAccum()); //intentional overwrite
    hll6Array.putRebuildCurMinNumKxQFlag(false);
    return hll6Array;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hll/CubicInterpolation.java`
#### Snippet
```java
    final double l0Numer = (x - x1) * (x - x2) * (x - x3);
    final double l1Numer = (x - x0) * (x - x2) * (x - x3);
    final double l2Numer = (x - x0) * (x - x1) * (x - x3);
    final double l3Numer = (x - x0) * (x - x1) * (x - x2);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hll/DirectHll6Array.java`
#### Snippet
```java
    if (wmem == null) { noWriteAccess(); }
    final int newValue = HllUtil.getPairValue(coupon);
    final int configKmask = (1 << getLgConfigK()) - 1;
    final int slotNo = HllUtil.getPairLow26(coupon) & configKmask;
    updateSlotWithKxQ(slotNo, newValue);
    return this;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hll/HllSketch.java`
#### Snippet
```java
      sb.append(pitr.getHeader()).append(LS);
      if (all) {
        while (pitr.nextAll()) {
          sb.append(pitr.getString()).append(LS);
        }
      } else {
        while (pitr.nextValid()) {
          sb.append(pitr.getString()).append(LS);
        }
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hll/PreambleUtil.java`
#### Snippet
```java
    final String nativeOrder = ByteOrder.nativeOrder().toString();
    final boolean compact = (flags & COMPACT_FLAG_MASK) > 0;
    final boolean oooFlag = (flags & OUT_OF_ORDER_FLAG_MASK) > 0;
    final boolean readOnly = (flags & READ_ONLY_FLAG_MASK) > 0;
    final boolean empty = (flags & EMPTY_FLAG_MASK) > 0;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hll/ToByteArrayImpl.java`
#### Snippet
```java
        final int dataStart = impl.getMemDataStart();
        final int bytesOut = dataStart + (srcCouponArrInts << 2);
        byteArrOut = new byte[bytesOut];
        final WritableMemory memOut = WritableMemory.writableWrap(byteArrOut);
        copyCommonListAndSet(impl, memOut);
        insertCompactFlag(memOut, dstCompact);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hll/Union.java`
#### Snippet
```java
              tgtAbsHllArr.updateSlotNoKxQ(j, value == AUX_TOKEN ? auxHashMap.mustFindValueFor(j) : value + curMin);
              j++;
              value = Byte.toUnsignedInt(b) >>> 4;
              tgtAbsHllArr.updateSlotNoKxQ(j, value == AUX_TOKEN ? auxHashMap.mustFindValueFor(j) : value + curMin);
              j++;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hll/Union.java`
#### Snippet
```java
              tgtAbsHllArr.updateSlotNoKxQ(j++, value);
              value = Byte.toUnsignedInt(b1) >>> 6;
              value |= (Byte.toUnsignedInt(b2) & 0x0f) << 2;
              tgtAbsHllArr.updateSlotNoKxQ(j++, value);
              value = Byte.toUnsignedInt(b2) >>> 4;
              value |= (Byte.toUnsignedInt(b3) & 3) << 4;
              tgtAbsHllArr.updateSlotNoKxQ(j++, value);
              value = Byte.toUnsignedInt(b3) >>> 2;
              tgtAbsHllArr.updateSlotNoKxQ(j++, value);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hll/Union.java`
#### Snippet
```java
              tgtAbsHllArr.updateSlotNoKxQ(j & tgtKmask, value == AUX_TOKEN
                  ? auxHashMap.mustFindValueFor(j) : value + curMin);
              j++;
              value = Byte.toUnsignedInt(b) >>> 4;
              tgtAbsHllArr.updateSlotNoKxQ(j & tgtKmask, value == AUX_TOKEN
                  ? auxHashMap.mustFindValueFor(j) : value + curMin);
              j++;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hll/Union.java`
#### Snippet
```java
              tgtAbsHllArr.updateSlotNoKxQ(j++ & tgtKmask, value);
              value = Byte.toUnsignedInt(b1) >>> 6;
              value |= (Byte.toUnsignedInt(b2) & 0x0f) << 2;
              tgtAbsHllArr.updateSlotNoKxQ(j++ & tgtKmask, value);
              value = Byte.toUnsignedInt(b2) >>> 4;
              value |= (Byte.toUnsignedInt(b3) & 3) << 4;
              tgtAbsHllArr.updateSlotNoKxQ(j++ & tgtKmask, value);
              value = Byte.toUnsignedInt(b3) >>> 2;
              tgtAbsHllArr.updateSlotNoKxQ(j++ & tgtKmask, value);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hllmap/UniqueCountMap.java`
#### Snippet
```java
    if (key == null) { return Double.NaN; }
    checkMethodKeySize(key);
    final double est = maps_[0].getEstimate(key);
    if (est >= 0.0) { return est; }
    //key has been promoted
    final int level = -(int)est;
    final Map map = maps_[level];
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllDirectDoublesSketch.java`
#### Snippet
```java
    setMemoryK(dstMem, k);
    setMemoryM(dstMem, m);
    setMemoryN(dstMem, 0);
    setMemoryMinK(dstMem, k);
    setMemoryNumLevels(dstMem, 1);
    int offset = DATA_START_ADR;
    dstMem.putIntArray(offset, new int[] {k, k}, 0, 2);
    offset += 2 * Integer.BYTES;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllDoublesHelper.java`
#### Snippet
```java
      final int freeSpaceAtBottom = targetItemCount - curItemCount;
      //shift the new items array
      System.arraycopy(workbuf, outlevels[0], myNewDoubleItemsArr, freeSpaceAtBottom, curItemCount);
      final int theShift = freeSpaceAtBottom - outlevels[0];

      //calculate the new levels array length
      final int finalLevelsArrLen;
      if (myCurLevelsArr.length < myNewNumLevels + 1) { finalLevelsArrLen = myNewNumLevels + 1; }
      else { finalLevelsArrLen = myCurLevelsArr.length; }

      //THE NEW LEVELS ARRAY
      myNewLevelsArr = new int[finalLevelsArrLen];
      for (int lvl = 0; lvl < myNewNumLevels + 1; lvl++) { // includes the "extra" index
        myNewLevelsArr[lvl] = outlevels[lvl] + theShift;
      }

      //MEMORY SPACE MANAGEMENT
      if (sketch.updatableMemFormat) {
        sketch.wmem = KllHelper.memorySpaceMgmt(sketch, myNewLevelsArr.length, myNewDoubleItemsArr.length);
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllDoublesHelper.java`
#### Snippet
```java
    final int lenC = lenA + lenB;
    final int limA = startA + lenA;
    final int limB = startB + lenB;
    final int limC = startC + lenC;

    int a = startA;
    int b = startB;

    for (int c = startC; c < limC; c++) {
      if (a == limA) {
        bufC[c] = bufB[b];
        b++;
      } else if (b == limB) {
        bufC[c] = bufA[a];
        a++;
      } else if (bufA[a] < bufB[b]) {
        bufC[c] = bufA[a];
        a++;
      } else {
        bufC[c] = bufB[b];
        b++;
      }
    }
    assert a == limA;
    assert b == limB;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllDoublesHelper.java`
#### Snippet
```java
    assert isEven(length);
    final int half_length = length / 2;
    final int offset = random.nextInt(2);       // disable for validation
    //final int offset = deterministicOffset(); // enable for validation
    int j = start + offset;
    for (int i = start; i < (start + half_length); i++) {
      buf[i] = buf[j];
      j += 2;
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllDoublesHelper.java`
#### Snippet
```java
    assert isEven(length);
    final int half_length = length / 2;
    final int offset = random.nextInt(2);       // disable for validation
    //final int offset = deterministicOffset(); // enable for validation
    int j = (start + length) - 1 - offset;
    for (int i = (start + length) - 1; i >= (start + half_length); i--) {
      buf[i] = buf[j];
      j -= 2;
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllDoublesHelper.java`
#### Snippet
```java
    if (sketch.getLevelsArray()[0] == 0) { KllHelper.compressWhileUpdatingSketch(sketch); }
    final int myLevelsArrAtZero = sketch.getLevelsArray()[0]; //LevelsArr could be expanded
    sketch.incN();
    sketch.setLevelZeroSorted(false);
    final int nextPos = myLevelsArrAtZero - 1;
    assert myLevelsArrAtZero >= 0;
    sketch.setLevelsArrayAt(0, nextPos);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllDoublesHelper.java`
#### Snippet
```java
    assert numLevelsIn > 0; // things are too weird if zero levels are allowed
    int numLevels = numLevelsIn;
    int currentItemCount = inLevels[numLevels] - inLevels[0]; // decreases with each compaction
    int targetItemCount = KllHelper.computeTotalItemCapacity(k, m, numLevels); // increases if we add levels
    boolean doneYet = false;
    outLevels[0] = 0;
    int curLevel = -1;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllDoublesHelper.java`
#### Snippet
```java
      curLevel++; // start out at level 0

      // If we are at the current top level, add an empty level above it for convenience,
      // but do not increment numLevels until later
      if (curLevel == (numLevels - 1)) {
        inLevels[curLevel + 2] = inLevels[curLevel + 1];
      }

      final int rawBeg = inLevels[curLevel];
      final int rawLim = inLevels[curLevel + 1];
      final int rawPop = rawLim - rawBeg;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllDoublesHelper.java`
#### Snippet
```java
        final int popAbove = inLevels[curLevel + 2] - rawLim;
        final boolean oddPop = isOdd(rawPop);
        final int adjBeg = oddPop ? 1 + rawBeg : rawBeg;
        final int adjPop = oddPop ? rawPop - 1 : rawPop;
        final int halfAdjPop = adjPop / 2;

        if (oddPop) { // copy one guy over
          outBuf[outLevels[curLevel]] = inBuf[rawBeg];
          outLevels[curLevel + 1] = outLevels[curLevel] + 1;
        } else { // copy zero guys over
          outLevels[curLevel + 1] = outLevels[curLevel];
        }

        // level zero might not be sorted, so we must sort it if we wish to compact it
        if ((curLevel == 0) && !isLevelZeroSorted) {
          Arrays.sort(inBuf, adjBeg, adjBeg + adjPop);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllDoublesSketch.java`
#### Snippet
```java
    if (isEmpty()) { throw new IllegalArgumentException(THROWS_EMPTY); }
    final double[] ranks = equallyWeightedRanks(numEquallyWeighted);
    final double[] boundaries = getQuantiles(ranks, searchCrit);
    boundaries[0] = getMinItem();
    boundaries[boundaries.length - 1] = getMaxItem();
    final DoublesPartitionBoundaries dpb = new DoublesPartitionBoundaries();
    dpb.N = this.getN();
    dpb.ranks = ranks;
    dpb.boundaries = boundaries;
    return dpb;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllDoublesSketch.java`
#### Snippet
```java
    if (isEmpty()) { throw new IllegalArgumentException(THROWS_EMPTY); }
    refreshSortedView();
    final int len = ranks.length;
    final double[] quantiles = new double[len];
    for (int i = 0; i < len; i++) {
      quantiles[i] = kllDoublesSV.getQuantile(ranks[i], searchCrit);
    }
    return quantiles;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllDoublesSketch.java`
#### Snippet
```java
    if (isEmpty()) { throw new IllegalArgumentException(THROWS_EMPTY); }
    refreshSortedView();
    final int len = quantiles.length;
    final double[] ranks = new double[len];
    for (int i = 0; i < len; i++) {
      ranks[i] = kllDoublesSV.getRank(quantiles[i], searchCrit);
    }
    return ranks;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllDoublesSketchIterator.java`
#### Snippet
```java
    if (!isInitialized) {
      level = 0;
      index = levels[level];
      weight = 1;
      isInitialized = true;
    } else {
      index++;
    }
    if (index < levels[level + 1]) {
      return true;
    }
    // go to the next non-empty level
    do {
      level++;
      if (level == numLevels) {
        return false; // run out of levels
      }
      weight *= 2;
    } while (levels[level] == levels[level + 1]);
    index = levels[level];
    return true;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllDoublesSketchSortedView.java`
#### Snippet
```java
    if (isEmpty()) { throw new IllegalArgumentException(THROWS_EMPTY); }
    QuantilesUtil.checkNormalizedRankBounds(rank);
    final int len = cumWeights.length;
    final long naturalRank = (searchCrit == INCLUSIVE)
        ? (long)Math.ceil(rank * totalN) : (long)Math.floor(rank * totalN);
    final InequalitySearch crit = (searchCrit == INCLUSIVE) ? InequalitySearch.GE : InequalitySearch.GT;
    final int index = InequalitySearch.find(cumWeights, 0, len - 1, naturalRank, crit);
    if (index == -1) {
      return quantiles[quantiles.length - 1]; //EXCLUSIVE (GT) case: normRank == 1.0;
    }
    return quantiles[index];
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantiles/ItemsSketchSortedView.java`
#### Snippet
```java
    final InequalitySearch crit = (searchCrit == INCLUSIVE) ? InequalitySearch.GE : InequalitySearch.GT;
    final int index = InequalitySearch.find(cumWeights, 0, len - 1, naturalRank, crit);
    if (index == -1) {
      return quantiles[quantiles.length - 1]; //EXCLUSIVE (GT) case: normRank == 1.0;
    }
    return quantiles[index];
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllDoublesSketchSortedView.java`
#### Snippet
```java
    if (isEmpty()) { throw new IllegalArgumentException(THROWS_EMPTY); }
    final int len = quantiles.length;
    final InequalitySearch crit = (searchCrit == INCLUSIVE) ? InequalitySearch.LE : InequalitySearch.LT;
    final int index = InequalitySearch.find(quantiles,  0, len - 1, quantile, crit);
    if (index == -1) {
      return 0; //EXCLUSIVE (LT) case: quantile <= minQuantile; INCLUSIVE (LE) case: quantile < minQuantile
    }
    return (double)cumWeights[index] / totalN;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllDoublesSketchSortedView.java`
#### Snippet
```java
    final int[] myLevels = new int[srcNumLevels + 1];
    final int offset = srcLevels[0];
    System.arraycopy(srcQuantiles, offset, quantiles, 0, numItems);
    int srcLevel = 0;
    int dstLevel = 0;
    long weight = 1;
    while (srcLevel < srcNumLevels) {
      final int fromIndex = srcLevels[srcLevel] - offset;
      final int toIndex = srcLevels[srcLevel + 1] - offset; // exclusive
      if (fromIndex < toIndex) { // if equal, skip empty level
        Arrays.fill(cumWeights, fromIndex, toIndex, weight);
        myLevels[dstLevel] = fromIndex;
        myLevels[dstLevel + 1] = toIndex;
        dstLevel++;
      }
      srcLevel++;
      weight *= 2;
    }
    final int numLevels = dstLevel;
    blockyTandemMergeSort(quantiles, cumWeights, myLevels, numLevels); //create unit weights
    KllHelper.convertToCumulative(cumWeights);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllDoublesSketchSortedView.java`
#### Snippet
```java
    if (numLevels == 1) { return; }
    final int numLevels1 = numLevels / 2;
    final int numLevels2 = numLevels - numLevels1;
    assert numLevels1 >= 1;
    assert numLevels2 >= numLevels1;
    final int startingLevel1 = startingLevel;
    final int startingLevel2 = startingLevel + numLevels1;
    // swap roles of src and dst
    blockyTandemMergeSortRecursion(
        quantilesDst, weightsDst,
        quantilesSrc, weightsSrc,
        levels, startingLevel1, numLevels1);
    blockyTandemMergeSortRecursion(
        quantilesDst, weightsDst,
        quantilesSrc, weightsSrc,
        levels, startingLevel2, numLevels2);
    tandemMerge(
        quantilesSrc, weightsSrc,
        quantilesDst, weightsDst,
        levels,
        startingLevel1, numLevels1,
        startingLevel2, numLevels2);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllDoublesSketchSortedView.java`
#### Snippet
```java
    final int fromIndex1 = levelStarts[startingLevel1];
    final int toIndex1 = levelStarts[startingLevel1 + numLevels1]; // exclusive
    final int fromIndex2 = levelStarts[startingLevel2];
    final int toIndex2 = levelStarts[startingLevel2 + numLevels2]; // exclusive
    int iSrc1 = fromIndex1;
    int iSrc2 = fromIndex2;
    int iDst = fromIndex1;

    while (iSrc1 < toIndex1 && iSrc2 < toIndex2) {
      if (quantilesSrc[iSrc1] < quantilesSrc[iSrc2]) {
        quantilesDst[iDst] = quantilesSrc[iSrc1];
        weightsDst[iDst] = weightsSrc[iSrc1];
        iSrc1++;
      } else {
        quantilesDst[iDst] = quantilesSrc[iSrc2];
        weightsDst[iDst] = weightsSrc[iSrc2];
        iSrc2++;
      }
      iDst++;
    }
    if (iSrc1 < toIndex1) {
      System.arraycopy(quantilesSrc, iSrc1, quantilesDst, iDst, toIndex1 - iSrc1);
      System.arraycopy(weightsSrc, iSrc1, weightsDst, iDst, toIndex1 - iSrc1);
    } else if (iSrc2 < toIndex2) {
      System.arraycopy(quantilesSrc, iSrc2, quantilesDst, iDst, toIndex2 - iSrc2);
      System.arraycopy(weightsSrc, iSrc2, weightsDst, iDst, toIndex2 - iSrc2);
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantiles/DoublesSketchSortedView.java`
#### Snippet
```java
      if (qSrc[i2] < qSrc[i1]) {
        qDst[i3] = qSrc[i2];
        cwDst[i3] = cwSrc[i2];
        i2++;
      } else {
        qDst[i3] = qSrc[i1];
        cwDst[i3] = cwSrc[i1];
        i1++;
      }
      i3++;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllFloatsSketch.java`
#### Snippet
```java
    if (isEmpty()) { throw new IllegalArgumentException(THROWS_EMPTY); }
    final double[] ranks = equallyWeightedRanks(numEquallyWeighted);
    final float[] boundaries = getQuantiles(ranks, searchCrit);
    boundaries[0] = getMinItem();
    boundaries[boundaries.length - 1] = getMaxItem();
    final FloatsPartitionBoundaries fpb = new FloatsPartitionBoundaries();
    fpb.N = this.getN();
    fpb.ranks = ranks;
    fpb.boundaries = boundaries;
    return fpb;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllFloatsSketch.java`
#### Snippet
```java
    if (isEmpty()) { throw new IllegalArgumentException(THROWS_EMPTY); }
    refreshSortedView();
    final int len = ranks.length;
    final float[] quantiles = new float[len];
    for (int i = 0; i < len; i++) {
      quantiles[i] = kllFloatsSV.getQuantile(ranks[i], searchCrit);
    }
    return quantiles;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllHelper.java`
#### Snippet
```java
      int newIndex = myLevelsArr[level + 1] - halfAdjPop;  // adjust boundaries of the level above
      sketch.setLevelsArrayAt(level + 1, newIndex);

      if (oddPop) {
        sketch.setLevelsArrayAt(level, myLevelsArr[level + 1] - 1); // the current level now contains one item
        myDoubleItemsArr[myLevelsArr[level]] = myDoubleItemsArr[rawBeg];  // namely this leftover guy
      } else {
        sketch.setLevelsArrayAt(level, myLevelsArr[level + 1]); // the current level is now empty
      }

      // verify that we freed up halfAdjPop array slots just below the current level
      assert myLevelsArr[level] == rawBeg + halfAdjPop;

   // finally, we need to shift up the data in the levels below
      // so that the freed-up space can be used by level zero
      if (level > 0) {
        final int amount = rawBeg - myLevelsArr[0];
        System.arraycopy(myDoubleItemsArr, myLevelsArr[0], myDoubleItemsArr, myLevelsArr[0] + halfAdjPop, amount);
      }
      for (int lvl = 0; lvl < level; lvl++) {
        newIndex = myLevelsArr[lvl] + halfAdjPop; //adjust boundary
        sketch.setLevelsArrayAt(lvl, newIndex);
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllHelper.java`
#### Snippet
```java
    byteArr[0] = PREAMBLE_INTS_EMPTY_SINGLE; //2
    byteArr[1] = SERIAL_VERSION_EMPTY_FULL;  //1
    byteArr[2] = KLL_FAMILY; //15
    byteArr[3] = (byte) (EMPTY_BIT_MASK | doubleFlagBit);
    ByteArrayUtil.putShortLE(byteArr, K_SHORT_ADR, (short)sketch.getK());
    byteArr[6] = (byte)sketch.getM();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/kll/KllPreambleUtil.java`
#### Snippet
```java
        sb.append("MIN/MAX:").append(LS);
        if (doublesSketch) {
          sb.append(mem.getDouble(offsetBytes)).append(LS);
          offsetBytes += typeBytes;
          sb.append(mem.getDouble(offsetBytes)).append(LS);
          offsetBytes += typeBytes;
        } else { //floats
          sb.append(mem.getFloat(offsetBytes)).append(LS);
          offsetBytes += typeBytes;
          sb.append(mem.getFloat(offsetBytes)).append(LS);
          offsetBytes += typeBytes;
        }
        sb.append("ITEMS DATA").append(LS);
        final int itemsSpace = (sketchBytes - offsetBytes) / typeBytes;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantiles/DirectCompactDoublesSketch.java`
#### Snippet
```java
    final long memCap = srcMem.getCapacity();

    final int preLongs = extractPreLongs(srcMem);
    final int serVer = extractSerVer(srcMem);
    final int familyID = extractFamilyID(srcMem);
    final int flags = extractFlags(srcMem);
    final int k = extractK(srcMem);

    final boolean empty = (flags & EMPTY_FLAG_MASK) > 0;
    final long n = empty ? 0 : extractN(srcMem);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantiles/DoublesMergeImpl.java`
#### Snippet
```java
    final int srcK = src.getK();
    final int tgtK = tgt.getK();
    final long srcN = src.getN();
    final long tgtN = tgt.getN();

    if (srcK != tgtK) {
      downSamplingMergeInto(src, tgt);
      return;
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantiles/DoublesMergeImpl.java`
#### Snippet
```java
    for (int i = 0; i < srcSketchBuf.numItems(); i++) { // update only the base buffer
      tgt.update(srcSketchBuf.get(i));
    }

    final int spaceNeeded = DoublesUpdateImpl.getRequiredItemCapacity(tgtK, nFinal);
    final int tgtCombBufItemCap = tgt.getCombinedBufferItemCapacity();
    if (spaceNeeded > tgtCombBufItemCap) { //copies base buffer plus current levels
      tgt.growCombinedBuffer(tgtCombBufItemCap, spaceNeeded);
    }

    final DoublesArrayAccessor scratch2KAcc = DoublesArrayAccessor.initialize(2 * tgtK);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantiles/DoublesMergeImpl.java`
#### Snippet
```java
    double srcMax = src.getMaxItem();
    srcMax = Double.isNaN(srcMax) ? Double.NEGATIVE_INFINITY : srcMax;
    double srcMin = src.getMinItem();
    srcMin = Double.isNaN(srcMin) ? Double.POSITIVE_INFINITY : srcMin;

    double tgtMax = tgt.getMaxItem();
    tgtMax = Double.isNaN(tgtMax) ? Double.NEGATIVE_INFINITY : tgtMax;
    double tgtMin = tgt.getMinItem();
    tgtMin = Double.isNaN(tgtMin) ? Double.POSITIVE_INFINITY : tgtMin;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantiles/DoublesSketchIterator.java`
#### Snippet
```java
    do {
      level++;
      if (level > 0) {
        bitPattern >>>= 1;
      }
      if (bitPattern == 0L) {
        return false; // run out of levels
      }
      weight *= 2;
    } while ((bitPattern & 1L) == 0L);
    index = 0;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantiles/DoublesSketchSortedView.java`
#### Snippet
```java
    assert blkSize >= 1;
    if (arrLen <= blkSize) { return; }
    int numblks = arrLen / blkSize;
    if ((numblks * blkSize) < arrLen) { numblks += 1; }
    assert ((numblks * blkSize) >= arrLen);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantiles/DoublesSketchSortedView.java`
#### Snippet
```java
    assert (grpLen > 0);
    if (grpLen == 1) { return; }
    final int grpLen1 = grpLen / 2;
    final int grpLen2 = grpLen - grpLen1;
    assert (grpLen1 >= 1);
    assert (grpLen2 >= grpLen1);

    final int grpStart1 = grpStart;
    final int grpStart2 = grpStart + grpLen1;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantiles/DoublesSketchSortedView.java`
#### Snippet
```java
    final int arrStart1 = grpStart1 * blkSize;
    final int arrStart2 = grpStart2 * blkSize;
    final int arrLen1   = grpLen1   * blkSize;
    int arrLen2         = grpLen2   * blkSize;

    // special case for the final block which might be shorter than blkSize.
    if ((arrStart2 + arrLen2) > arrLim) { arrLen2 = arrLim - arrStart2; }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantiles/DoublesSketchSortedView.java`
#### Snippet
```java
    if (i1 < arrStop1) {
      arraycopy(qSrc, i1, qDst, i3, arrStop1 - i1);
      arraycopy(cwSrc, i1, cwDst, i3, arrStop1 - i1);
    } else {
      assert i2 < arrStop2;
      arraycopy(qSrc, i2, qDst, i3, arrStop2 - i2);
      arraycopy(cwSrc, i2, cwDst, i3, arrStop2 - i2);
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantiles/DoublesUnionImpl.java`
#### Snippet
```java
    int sw1 = ((myQS  == null) ? 0 :  myQS.isEmpty() ? 4 : 8);
    sw1 |=    ((other == null) ? 0 : other.isEmpty() ? 1 : 2);
    int outCase = 0; //0=null, 1=NOOP, 2=copy, 3=merge

    switch (sw1) {
      case 0:  outCase = 0; break; //myQS = null,  other = null ; return null
      case 1:  outCase = 4; break; //myQS = null,  other = empty; create empty-heap(myMaxK)
      case 2:  outCase = 2; break; //myQS = null,  other = valid; stream or downsample to myMaxK
      case 4:  outCase = 1; break; //myQS = empty, other = null ; no-op
      case 5:  outCase = 1; break; //myQS = empty, other = empty; no-op
      case 6:  outCase = 3; break; //myQS = empty, other = valid; merge
      case 8:  outCase = 1; break; //myQS = valid, other = null ; no-op
      case 9:  outCase = 1; break; //myQS = valid, other = empty: no-op
      case 10: outCase = 3; break; //myQS = valid, other = valid; merge
      default: break; //This cannot happen
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantiles/HeapCompactDoublesSketch.java`
#### Snippet
```java
    final int preLongs = extractPreLongs(srcMem);
    final int serVer = extractSerVer(srcMem);
    final int familyID = extractFamilyID(srcMem);
    final int flags = extractFlags(srcMem);
    final int k = extractK(srcMem);

    final boolean empty = (flags & EMPTY_FLAG_MASK) > 0; //Preamble flags empty state
    final long n = empty ? 0 : extractN(srcMem);

    //VALIDITY CHECKS
    DoublesUtil.checkDoublesSerVer(serVer, MIN_HEAP_DOUBLES_SER_VER);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantiles/ItemsMergeImpl.java`
#### Snippet
```java
    tgt.n_ = nFinal;

    assert (tgt.getN() / (2L * tgtK)) == tgt.getBitPattern(); // internal consistency check

    final T srcMax = src.isEmpty() ? null : src.getMaxItem();
    final T srcMin = src.isEmpty() ? null : src.getMinItem();
    final T tgtMax = tgt.isEmpty() ? null : tgt.getMaxItem();
    final T tgtMin = tgt.isEmpty() ? null : tgt.getMinItem();

    if ((srcMax != null) && (tgtMax != null)) {
      tgt.maxItem_ = (src.getComparator().compare(srcMax, tgtMax) > 0) ? srcMax : tgtMax;
    } //only one could be null
    else if (tgtMax == null) { //if srcMax were null we would leave tgt alone
      tgt.maxItem_ = srcMax;
    }

    if ((srcMin != null) && (tgtMin != null)) {
      tgt.minItem_ = (src.getComparator().compare(srcMin, tgtMin) > 0) ? tgtMin : srcMin;
    } //only one could be null
    else if (tgtMin == null) { //if srcMin were null we would leave tgt alone
      tgt.minItem_ = srcMin;
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantiles/ItemsSketchSortedView.java`
#### Snippet
```java
    final int len = splitPoints.length + 1;
    final double[] buckets = new double[len];
    for (int i = 0; i < len - 1; i++) {
      buckets[i] = getRank(splitPoints[i], searchCrit);
    }
    buckets[len - 1] = 1.0;
    return buckets;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantilescommon/BinarySearch.java`
#### Snippet
```java
    int lo = low;
    int hi = high;
    while (lo <= hi) {
      final int mid = lo + (hi - lo) / 2;
      if (v < arr[mid]) { hi = mid - 1; }
      else {
        if (v > arr[mid]) { lo = mid + 1; }
        else { return mid; }
      }
    }
    return -1;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantilescommon/InequalitySearch.java`
#### Snippet
```java
      if (idx == -1) {
        return "LT: " + v + " <= arr[" + low + "]=" + arr[low] + "; return -1";
      }
      if (idx == high) {
        return "LT: " + v + " > arr[" + high + "]=" + arr[high]
            + "; return arr[" + high + "]=" + arr[high];
      } //idx < high
      return "LT: " + v
      + ": arr[" + idx + "]=" + arr[idx] + " < " + v + " <= arr[" + (idx + 1) + "]=" + arr[idx + 1]
      + "; return arr[" + idx + "]=" + arr[idx];
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantilescommon/InequalitySearch.java`
#### Snippet
```java
      if (idx == -1) {
        return "LE: " + v + " < arr[" + low + "]=" + arr[low] + "; return -1";
      }
      if (idx == high) {
        return "LE: " + v + " >= arr[" + high + "]=" + arr[high]
            + "; return arr[" + high + "]=" + arr[high];
      }
      return "LE: " + v
      + ": arr[" + idx + "]=" + arr[idx] + " <= " + v + " < arr[" + (idx + 1) + "]=" + arr[idx + 1]
          + "; return arr[" + idx + "]=" + arr[idx];
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantilescommon/InequalitySearch.java`
#### Snippet
```java
      if (idx == -1) {
        if (v > arr[high]) {
          return "EQ: " + v + " > arr[" + high + "]; return -1";
        }
        if (v < arr[low]) {
          return "EQ: " + v + " < arr[" + low + "]; return -1";
        }
        return "EQ: " + v + " Cannot be found within arr[" + low + "], arr[" + high + "]; return -1";
      }
      return "EQ: " + v + " == arr[" + idx + "]; return arr[" + idx + "]=" + arr[idx];
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantilescommon/InequalitySearch.java`
#### Snippet
```java
      if (idx == -1) {
        return "GE: " + v + " > arr[" + high + "]=" + arr[high] + "; return -1";
      }
      if (idx == low) {
        return "GE: " + v + " <= arr[" + low + "]=" + arr[low]
            + "; return arr[" + low + "]=" + arr[low];
      } //idx > low
      return "GE: " + v
      + ": arr[" + (idx - 1) + "]=" + arr[idx - 1] + " < " + v + " <= arr[" + idx + "]=" + arr[idx]
          + "; return arr[" + idx + "]=" + arr[idx];
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantilescommon/InequalitySearch.java`
#### Snippet
```java
      if (idx == -1) {
        return "GT: " + v + " >= arr[" + high + "]=" + arr[high] + "; return -1";
      }
      if (idx == low) {
        return "GT: " + v + " < arr[" + low + "]=" + arr[low]
            + "; return arr[" + low + "]=" + arr[low];
      } //idx > low
      return "GT: " + v
      + ": arr[" + (idx - 1) + "]=" + arr[idx - 1] + " <= " + v + " < arr[" + idx + "]=" + arr[idx]
          + "; return arr[" + idx + "]=" + arr[idx];
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantilescommon/InequalitySearch.java`
#### Snippet
```java
    int lo = low;
    int hi = high;
    while (lo <= hi) {
      if (hi - lo <= 1) {
        return crit.resolve(arr, lo, hi, v);
      }
      final int mid = lo + (hi - lo) / 2;
      final int ret = crit.compare(arr, mid, mid + 1, v);
      if (ret == -1 ) { hi = mid; }
      else if (ret == 1) { lo = mid + 1; }
      else  { return crit.getIndex(arr, mid, mid + 1, v); }
    }
    return -1; //should never return here
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/quantilescommon/QuantilesUtil.java`
#### Snippet
```java
    Objects.requireNonNull(values);
    final int len = values.length - 1;
    for (int j = 0; j < len; j++) {
      if (values[j] < values[j + 1]) { continue; }
      throw new SketchesArgumentException(
          "Values must be unique, monotonically increasing and not NaN.");
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/sampling/PreambleUtil.java`
#### Snippet
```java
    final ResizeFactor rf = ResizeFactor.getRF(extractResizeFactor(mem));
    final int serVer = extractSerVer(mem);

    // Flags
    final int flags = extractFlags(mem);
    final String flagsStr = zeroPad(Integer.toBinaryString(flags), 8) + ", " + (flags);
    //final boolean bigEndian = (flags & BIG_ENDIAN_FLAG_MASK) > 0;
    //final String nativeOrder = ByteOrder.nativeOrder().toString();
    //final boolean readOnly = (flags & READ_ONLY_FLAG_MASK) > 0;
    final boolean isEmpty = (flags & EMPTY_FLAG_MASK) > 0;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/sampling/PreambleUtil.java`
#### Snippet
```java
    final boolean isGadget = (flags & GADGET_FLAG_MASK) > 0;

    final int k;
    if (serVer == 1) {
      final short encK = extractEncodedReservoirSize(mem);
      k = ReservoirSize.decodeValue(encK);
    } else {
      k = extractK(mem);
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/sampling/ReservoirItemsSketch.java`
#### Snippet
```java
    Family.RESERVOIR.checkFamilyID(srcMem.getByte(FAMILY_BYTE));

    final int numPreLongs = extractPreLongs(srcMem);
    final ResizeFactor rf = ResizeFactor.getRF(extractResizeFactor(srcMem));
    final int serVer = extractSerVer(srcMem);
    final boolean isEmpty = (extractFlags(srcMem) & EMPTY_FLAG_MASK) != 0;
    final long itemsSeen = (isEmpty ? 0 : extractN(srcMem));
    int k = extractK(srcMem);

    // Check values
    final boolean preLongsEqMin = (numPreLongs == Family.RESERVOIR.getMinPreLongs());
    final boolean preLongsEqMax = (numPreLongs == Family.RESERVOIR.getMaxPreLongs());
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/sampling/ReservoirItemsSketch.java`
#### Snippet
```java
    final StringBuilder sb = new StringBuilder();

    final String thisSimpleName = this.getClass().getSimpleName();

    sb.append(LS);
    sb.append("### ").append(thisSimpleName).append(" SUMMARY: ").append(LS);
    sb.append("   k            : ").append(reservoirSize_).append(LS);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/sampling/ReservoirItemsSketch.java`
#### Snippet
```java
    final byte[] outArr = new byte[outBytes];
    final WritableMemory mem = WritableMemory.writableWrap(outArr);

    // Common header elements
    PreambleUtil.insertPreLongs(mem, preLongs);                  // Byte 0
    PreambleUtil.insertLgResizeFactor(mem, rf_.lg());
    PreambleUtil.insertSerVer(mem, SER_VER);                     // Byte 1
    PreambleUtil.insertFamilyID(mem, Family.RESERVOIR.getID());  // Byte 2
    if (empty) {
      PreambleUtil.insertFlags(mem, EMPTY_FLAG_MASK);            // Byte 3
    } else {
      PreambleUtil.insertFlags(mem, 0);
    }
    PreambleUtil.insertK(mem, reservoirSize_);                   // Bytes 4-7
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/sampling/ReservoirItemsSketch.java`
#### Snippet
```java
    if (itemsSeen_ == 0) {
      return new SampleSubsetSummary(0.0, 0.0, 0.0, 0.0);
    }

    final int numSamples = getNumSamples();
    final double samplingRate = numSamples / (double) itemsSeen_;
    assert samplingRate >= 0.0;
    assert samplingRate <= 1.0;

    int trueCount = 0;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/sampling/ReservoirItemsSketch.java`
#### Snippet
```java
    if (itemsSeen_ <= reservoirSize_) {
      return new SampleSubsetSummary(trueCount, trueCount, trueCount, numSamples);
    }

    final double lbTrueFraction = pseudoHypergeometricLBonP(numSamples, trueCount, samplingRate);
    final double estimatedTrueFraction = (1.0 * trueCount) / numSamples;
    final double ubTrueFraction = pseudoHypergeometricUBonP(numSamples, trueCount, samplingRate);
    return new SampleSubsetSummary(
            itemsSeen_ * lbTrueFraction,
            itemsSeen_ * estimatedTrueFraction,
            itemsSeen_ * ubTrueFraction,
            itemsSeen_);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/sampling/ReservoirItemsUnion.java`
#### Snippet
```java
    Family.RESERVOIR_UNION.checkFamilyID(srcMem.getByte(FAMILY_BYTE));

    final int numPreLongs = extractPreLongs(srcMem);
    final int serVer = extractSerVer(srcMem);
    final boolean isEmpty = (extractFlags(srcMem) & EMPTY_FLAG_MASK) != 0;
    int maxK = extractMaxK(srcMem);

    final boolean preLongsEqMin = (numPreLongs == Family.RESERVOIR_UNION.getMinPreLongs());
    final boolean preLongsEqMax = (numPreLongs == Family.RESERVOIR_UNION.getMaxPreLongs());

    if (!preLongsEqMin & !preLongsEqMax) {
      throw new SketchesArgumentException("Possible corruption: Non-empty union with only "
          + Family.RESERVOIR_UNION.getMinPreLongs() + "preLongs");
    }

    if (serVer != SER_VER) {
      if (serVer == 1) {
        final short encMaxK = extractEncodedReservoirSize(srcMem);
        maxK = ReservoirSize.decodeValue(encMaxK);
      } else {
        throw new SketchesArgumentException(
                "Possible Corruption: Ser Ver must be " + SER_VER + ": " + serVer);
      }
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/sampling/ReservoirItemsUnion.java`
#### Snippet
```java
    if (empty) {
      preLongs = Family.RESERVOIR_UNION.getMinPreLongs();
      outBytes = 8;
    } else {
      preLongs = Family.RESERVOIR_UNION.getMaxPreLongs();
      outBytes = (preLongs << 3) + gadgetBytes.length; // for longs, we know the size
    }
    final byte[] outArr = new byte[outBytes];
    final WritableMemory mem = WritableMemory.writableWrap(outArr);

    // build preLong
    PreambleUtil.insertPreLongs(mem, preLongs);                       // Byte 0
    PreambleUtil.insertSerVer(mem, SER_VER);                          // Byte 1
    PreambleUtil.insertFamilyID(mem, Family.RESERVOIR_UNION.getID()); // Byte 2
    if (empty) {
      PreambleUtil.insertFlags(mem, EMPTY_FLAG_MASK);
    } else {
      PreambleUtil.insertFlags(mem, 0);                               // Byte 3
    }
    PreambleUtil.insertMaxK(mem, maxK_);                              // Bytes 4-5

    if (!empty) {
      final int preBytes = preLongs << 3;
      mem.putByteArray(preBytes, gadgetBytes, 0, gadgetBytes.length);
    }

    return outArr;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/sampling/ReservoirItemsUnion.java`
#### Snippet
```java
    assert (gadget_.getN() >= gadget_.getK());

    final int numSourceSamples = source.getK();

    final double sourceItemWeight = (source.getN() / (double) numSourceSamples);
    final double rescaled_prob = gadget_.getK() * sourceItemWeight; // K * weight
    double targetTotal = gadget_.getN(); // assumes fractional values during merge

    final int tgtK = gadget_.getK();

    for (int i = 0; i < numSourceSamples; ++i) {
      // inlining the update procedure, using targetTotal for the fractional N values
      // similar to ReservoirLongsSketch.update()
      // p(keep_new_item) = (k * w) / newTotal
      // require p(keep_new_item) < 1.0, meaning strict lightness

      targetTotal += sourceItemWeight;

      final double rescaled_one = targetTotal;
      assert (rescaled_prob < rescaled_one); // Use an exception to enforce strict lightness?
      final double rescaled_flip = rescaled_one * SamplingUtil.rand().nextDouble();
      if (rescaled_flip < rescaled_prob) {
        // Intentionally NOT doing optimization to extract slot number from rescaled_flip.
        // Grabbing new random bits to ensure all slots in play
        final int slotNo = SamplingUtil.rand().nextInt(tgtK);
        gadget_.insertValueAtPosition(source.getValueAtPosition(i), slotNo);
      } // end of inlined weight update
    } // end of loop over source samples

    // targetTotal was fractional but should now be an integer again. Could validate with low
    // tolerance, but for now just round to check.
    final long checkN = (long) Math.floor(0.5 + targetTotal);
    gadget_.forceIncrementItemsSeen(source.getN());
    assert (checkN == gadget_.getN());
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/theta/ConcurrentDirectQuickSelectSketch.java`
#### Snippet
```java
    final long epoch = epoch_;
    if ((singleHash != NOT_SINGLE_HASH)                   // namely, is a single hash and
        && (getRetainedEntries(false) < exactLimit_)) {   // a small sketch then propagate myself (blocking)
      if (!startEagerPropagation()) {
        endPropagation(localPropagationInProgress, true);
        return false;
      }
      if (!validateEpoch(epoch)) {
        endPropagation(null, true); // do not change local flag
        return true;
      }
      propagate(singleHash);
      endPropagation(localPropagationInProgress, true);
      return true;
    }
    // otherwise, be nonblocking, let background thread do the work
    final ConcurrentBackgroundThetaPropagation job = new ConcurrentBackgroundThetaPropagation(
        this, localPropagationInProgress, sketchIn, singleHash, epoch);
    executorService_.execute(job);
    return true;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/theta/ForwardCompatibility.java`
#### Snippet
```java
      reqBytesIn = (curCount + preLongs) << 3;
      validateInputSize(reqBytesIn, memCap);
      final long[] compactOrderedCache = new long[curCount];
      srcMem.getLongArray(preLongs << 3, compactOrderedCache, 0, curCount);
      return new HeapCompactSketch(compactOrderedCache, false, seedHash, curCount, thetaLong,true);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
    has.lgArrLongs_ = lgArrLongs;
    has.hashTableThreshold_ = setHashTableThreshold(lgNomLongs, lgArrLongs);
    has.curCount_ = extractCurCount(srcMem);
    has.thetaLong_ = extractThetaLong(srcMem);
    has.empty_ = PreambleUtil.isEmptyFlag(srcMem);
    has.cache_ = new long[1 << lgArrLongs];
    srcMem.getLongArray(preambleLongs << 3, has.cache_, 0, 1 << lgArrLongs); //read in as hash table
    return has;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
    if (lgArrLongs == lgArrLongs_) {
      final int arrLongs = cache_.length;
      assert (1 << lgArrLongs_) == arrLongs;
      java.util.Arrays.fill(cache_, 0L);
    }
    else {
      cache_ = new long[1 << lgArrLongs];
      lgArrLongs_ = lgArrLongs;
    }
    hashTableThreshold_ = setHashTableThreshold(lgNomLongs_, lgArrLongs_);
    empty_ = true;
    curCount_ = 0;
    thetaLong_ =  (long)(getP() * LONG_MAX_VALUE_AS_DOUBLE);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/theta/IntersectionImpl.java`
#### Snippet
```java
    final long[] hashTable;
    if (wmem_ != null) {
      final int htLen = 1 << lgArrLongs_;
      hashTable = new long[htLen];
      wmem_.getLongArray(CONST_PREAMBLE_LONGS << 3, hashTable, 0, htLen);
    } else {
      hashTable = hashTable_;
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/theta/JaccardSimilarity.java`
#### Snippet
```java
    if (sketchA == null || sketchB == null) { return false; }
    if (sketchA == sketchB) { return true; }
    if (sketchA.isEmpty() && sketchB.isEmpty()) { return true; }
    if (sketchA.isEmpty() || sketchB.isEmpty()) { return false; }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/theta/PreambleUtil.java`
#### Snippet
```java
      sb.append("Bytes 8-11 : CurrentCount     : ").append(curCount).append(LS);
      sb.append("Bytes 12-15: P                : ").append(p).append(LS);
      sb.append("Bytes 16-23: Theta (double)   : ").append(thetaDbl).append(LS);
      sb.append("             Theta (long)     : ").append(thetaLong).append(LS);
      sb.append("             Theta (long,hex) : ").append(thetaHex).append(LS);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/theta/Rebuilder.java`
#### Snippet
```java
    final int srcHTLen = 1 << srcLgArrLongs;
    final long[] srcHTArr = new long[srcHTLen];
    srcMem.getLongArray(preBytes, srcHTArr, 0, srcHTLen);

    //Create destination buffer
    final int dstHTLen = 1 << dstLgArrLongs;
    final long[] dstHTArr = new long[dstHTLen];
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/theta/UnionImpl.java`
#### Snippet
```java
          for (int i = 0; i < curCountIn; i++ ) {
            final int offsetBytes = preambleLongs + i << 3;
            final long hashIn = skMem.getLong(offsetBytes);
            if (hashIn >= unionThetaLong_) { break; } // "early stop"
            gadget_.hashUpdate(hashIn); //backdoor update, hash function is bypassed
          }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/thetacommon/BinomialBoundsN.java`
#### Snippet
```java
    final double b = numSDev * Math.sqrt((1.0 - theta) / theta);
    final double d  = 0.5 * b * Math.sqrt((b * b) + (4.0 * nHat));
    final double center = nHat + (0.5 * (b * b));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/thetacommon/BinomialBoundsN.java`
#### Snippet
```java
    double tot, curTerm;
    long m;
    assertTrue(numSamplesI >= 1);
    assertTrue((0.0 < p) && (p < 1.0));
    assertTrue((0.0 < delta) && (delta < 1.0));
    q = 1.0 - p;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/thetacommon/BoundsOnRatiosInThetaSketchedSets.java`
#### Snippet
```java
    final long thetaLongA = sketchA.getThetaLong();
    final long thetaLongB = sketchB.getThetaLong();
    checkThetas(thetaLongA, thetaLongB);

    final int countB = sketchB.getRetainedEntries(true);
    final int countA = (thetaLongB == thetaLongA)
        ? sketchA.getRetainedEntries(true)
        : sketchA.getCountLessThanThetaLong(thetaLongB);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/thetacommon/BoundsOnRatiosInTupleSketchedSets.java`
#### Snippet
```java
    final long thetaLongA = sketchA.getThetaLong();
    final long thetaLongB = sketchB.getThetaLong();
    checkThetas(thetaLongA, thetaLongB);

    final int countB = sketchB.getRetainedEntries();
    final int countA = thetaLongB == thetaLongA
        ? sketchA.getRetainedEntries()
        : sketchA.getCountLessThanThetaLong(thetaLongB);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/thetacommon/BoundsOnRatiosInTupleSketchedSets.java`
#### Snippet
```java
    final long thetaLongA = sketchA.getThetaLong();
    final long thetaLongB = sketchB.getThetaLong();
    checkThetas(thetaLongA, thetaLongB);

    final int countB = sketchB.getRetainedEntries(true);
    final int countA = thetaLongB == thetaLongA
        ? sketchA.getRetainedEntries()
        : sketchA.getCountLessThanThetaLong(thetaLongB);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/thetacommon/HashOperations.java`
#### Snippet
```java
    if (hash == 0) {
      throw new SketchesArgumentException("Given hash must not be zero: " + hash);
    }
    final int arrayMask = (1 << lgArrLongs) - 1; // current Size -1
    final int stride = getStride(hash, lgArrLongs);
    int curProbe = (int) (hash & arrayMask);

    // search for duplicate or empty slot
    final int loopIndex = curProbe;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/thetacommon/QuickSelect.java`
#### Snippet
```java
    while (hi > lo) {
      final int j = partition(arr, lo, hi);
      if (j == pivot) {
        return arr[pivot];
      }
      if (j > pivot) {
        hi = j - 1;
      }
      else {
        lo = j + 1;
      }
    }
    return arr[pivot];
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/thetacommon/QuickSelect.java`
#### Snippet
```java
    if (pivot > nonZeros) {
      return 0L;
    }
    final int arrSize = arr.length;
    final int zeros = arrSize - nonZeros;
    final int adjK = (pivot + zeros) - 1;
    return select(arr, 0, arrSize - 1, adjK);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/thetacommon/QuickSelect.java`
#### Snippet
```java
      while (arr[ ++i] < v) {
        if (i == hi) {
          break;
        }
      }
      while (v < arr[ --j]) {
        if (j == lo) {
          break;
        }
      }
      if (i >= j) {
        break;
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/tuple/AnotB.java`
#### Snippet
```java
    if (skB == null) { return; } //ignore

    final long thetaLongB = skB.getThetaLong();
    final int countB = skB.getRetainedEntries();
    final boolean emptyB = skB.isEmpty();

    final int id =
        SetOperationCornerCases.createCornerCaseId(thetaLong_, curCount_, empty_, thetaLongB, countB, emptyB);
    final CornerCase cCase = CornerCase.caseIdToCornerCase(id);
    final AnotbAction anotbAction = cCase.getAnotbAction();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/tuple/AnotB.java`
#### Snippet
```java
        thetaLong_ = min(thetaLong_, thetaLongB);
        final DataArrays<S> da = trimAndCopyDataArrays(hashArr_, summaryArr_, thetaLong_, true);
        hashArr_ = da.hashArr;
        curCount_ = (hashArr_ == null) ? 0 : hashArr_.length;
        summaryArr_ = da.summaryArr;
        //empty_ = is whatever SkA is,
        break;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/tuple/AnotB.java`
#### Snippet
```java
    if (skA == null || skB == null) {
      throw new SketchesArgumentException("Neither argument may be null for this stateless operation.");
    }

    final long thetaLongA = skA.getThetaLong();
    final int countA = skA.getRetainedEntries();
    final boolean emptyA = skA.isEmpty();

    final long thetaLongB = skB.getThetaLong();
    final int countB = skB.getRetainedEntries();
    final boolean emptyB = skB.isEmpty();

    final int id =
        SetOperationCornerCases.createCornerCaseId(thetaLongA, countA, emptyA, thetaLongB, countB, emptyB);
    final CornerCase cCase = CornerCase.caseIdToCornerCase(id);
    final AnotbAction anotbAction = cCase.getAnotbAction();

    CompactSketch<S> result = null;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/ArrayOfDoublesAnotBImpl.java`
#### Snippet
```java
    final long thetaLongA = skA.getThetaLong();
    final int countA = skA.getRetainedEntries();
    final boolean emptyA = skA.isEmpty();

    final long thetaLongB = skB.getThetaLong();
    final int countB = skB.getRetainedEntries();
    final boolean emptyB = skB.isEmpty();

    final int id =
        SetOperationCornerCases.createCornerCaseId(thetaLongA, countA, emptyA, thetaLongB, countB, emptyB);
    final CornerCase cCase = CornerCase.caseIdToCornerCase(id);
    final AnotbAction anotbAction = cCase.getAnotbAction();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/tuple/AnotB.java`
#### Snippet
```java
        final DataArrays<S> daA = getCopyOfDataArraysTuple(skA);
        final long[] hashArrA = daA.hashArr;
        final S[] summaryArrA = daA.summaryArr;
        final long minThetaLong =  min(thetaLongA, thetaLongB);
        final DataArrays<S> da = trimAndCopyDataArrays(hashArrA, summaryArrA, minThetaLong, false);
        result = new CompactSketch<>(da.hashArr, da.summaryArr, minThetaLong, skA.empty_);
        break;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/tuple/AnotB.java`
#### Snippet
```java
        final int countR = (daR.hashArr == null) ? 0 : daR.hashArr.length;
        if (countR == 0) {
          result = new CompactSketch<>(null, null, minThetaLong, minThetaLong == Long.MAX_VALUE);
        } else {
          result = new CompactSketch<>(daR.hashArr, daR.summaryArr, minThetaLong, false);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/tuple/AnotB.java`
#### Snippet
```java
    final long[] tmpHashArrA = new long[countA];
    final S[] tmpSummaryArrA = Util.newSummaryArray(summaryArrA, countA);

    //search for non matches and build temp arrays
    final int lgHTBLen = exactLog2OfLong(hashTableB.length);
    int nonMatches = 0;
    for (int i = 0; i < countA; i++) {
      final long hash = hashArrA[i];
      if (hash != 0 && hash < minThetaLong) { //skips hashes of A >= minTheta
        final int index = hashSearch(hashTableB, lgHTBLen, hash);
        if (index == -1) {
          tmpHashArrA[nonMatches] = hash;
          tmpSummaryArrA[nonMatches] = (S) summaryArrA[i].copy();
          nonMatches++;
        }
      }
    }
    daR.hashArr = Arrays.copyOfRange(tmpHashArrA, 0, nonMatches);
    daR.summaryArr = Arrays.copyOfRange(tmpSummaryArrA, 0, nonMatches);
    return daR;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/tuple/Intersection.java`
#### Snippet
```java
    final boolean firstCall = firstCall_;
    firstCall_ = false;

    // input sketch could be first or next call

    final boolean emptyIn = tupleSketch.isEmpty();
    if (empty_ || emptyIn) { //empty rule
      //Whatever the current internal state, we make our local empty.
      resetToEmpty();
      return;
    }

    final long thetaLongIn = tupleSketch.getThetaLong();
    thetaLong_ = min(thetaLong_, thetaLongIn); //Theta rule
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/tuple/JaccardSimilarity.java`
#### Snippet
```java
    if (sketchA == null || sketchB == null) { return ZEROS.clone(); }
    if (sketchA.isEmpty() && sketchB.isEmpty()) { return ONES.clone(); }
    if (sketchA.isEmpty() || sketchB.isEmpty()) { return ZEROS.clone(); }

    final int countA = sketchA.getRetainedEntries();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/tuple/JaccardSimilarity.java`
#### Snippet
```java
    final int minK = 1 << ThetaUtil.MIN_LG_NOM_LONGS;
    final int maxK = 1 << ThetaUtil.MAX_LG_NOM_LONGS;
    final int newK = max(min(ceilingIntPowerOf2(countA + countB), maxK), minK);
    final Union<S> union = new Union<>(newK, summarySetOps);
    union.union(sketchA);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/tuple/JaccardSimilarity.java`
#### Snippet
```java
    union.union(sketchB);

    final Sketch<S> unionAB = union.getResult();
    final long thetaLongUAB = unionAB.getThetaLong();
    final long thetaLongA = sketchA.getThetaLong();
    final long thetaLongB = sketchB.getThetaLong();
    final int countUAB = unionAB.getRetainedEntries();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/tuple/JaccardSimilarity.java`
#### Snippet
```java
    if (countUAB == countA && countUAB == countB
            && thetaLongUAB == thetaLongA && thetaLongUAB == thetaLongB) {
      return ONES.clone();
    }

    //Create the Intersection
    final Intersection<S> inter = new Intersection<>(summarySetOps);
    inter.intersect(sketchA);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/tuple/JaccardSimilarity.java`
#### Snippet
```java
    inter.intersect(unionAB); //ensures that intersection is a subset of the union
    final Sketch<S> interABU = inter.getResult();

    final double lb = getLowerBoundForBoverA(unionAB, interABU);
    final double est = getEstimateOfBoverA(unionAB, interABU);
    final double ub = getUpperBoundForBoverA(unionAB, interABU);
    return new double[] {lb, est, ub};
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/tuple/JaccardSimilarity.java`
#### Snippet
```java
    union.union(sketchB, summary);

    final Sketch<S> unionAB = union.getResult();
    final long thetaLongUAB = unionAB.getThetaLong();
    final long thetaLongA = sketchA.getThetaLong();
    final long thetaLongB = sketchB.getThetaLong();
    final int countUAB = unionAB.getRetainedEntries();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/tuple/Sketch.java`
#### Snippet
```java
    final StringBuilder sb = new StringBuilder();
    sb.append("### ").append(this.getClass().getSimpleName()).append(" SUMMARY: ").append(LS);
    sb.append("   Estimate                : ").append(getEstimate()).append(LS);
    sb.append("   Upper Bound, 95% conf   : ").append(getUpperBound(2)).append(LS);
    sb.append("   Lower Bound, 95% conf   : ").append(getLowerBound(2)).append(LS);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/tuple/Sketch.java`
#### Snippet
```java
      sb.append("   Nominal Entries (k)     : ").append(updatable.getNominalEntries()).append(LS);
      sb.append("   Current Capacity        : ").append(updatable.getCurrentCapacity()).append(LS);
      sb.append("   Resize Factor           : ").append(updatable.getResizeFactor().getValue()).append(LS);
      sb.append("   Sampling Probability (p): ").append(updatable.getSamplingProbability()).append(LS);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/DirectArrayOfDoublesQuickSelectSketch.java`
#### Snippet
```java
    lgCurrentCapacity_ = Integer.numberOfTrailingZeros(newCapacity);
    for (int i = 0; i < keys.length; i++) {
      if ((keys[i] != 0) && (keys[i] < thetaLong_)) {
        insert(keys[i], Arrays.copyOfRange(values, i * numValues, (i + 1) * numValues));
      }
    }
    setRebuildThreshold();
```

## RuleId[id=OctalLiteral]
### OctalLiteral
Octal integer `01`
in `src/main/java/org/apache/datasketches/cpc/TestUtil.java`
#### Snippet
```java
      rtAssertEquals(ficolA, ficolB);
      rtAssertEquals(sk1.kxp, sk2.kxp, .01 * sk1.kxp); //1% tolerance
      rtAssertEquals(sk1.hipEstAccum, sk2.hipEstAccum, 01 * sk1.hipEstAccum); //1% tolerance
    }
    return true;
```

### OctalLiteral
Octal integer `066`
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    Exact_Empty(065, "A{ 1.0,>0, F} ; B{ 1.0, 0, T}",
        IntersectAction.EMPTY_1_0_T, AnotbAction.SKETCH_A, UnionAction.SKETCH_A),
    Exact_Exact(066, "A{ 1.0,>0, F} ; B{ 1.0,>0, F}",
        IntersectAction.FULL_INTERSECT, AnotbAction.FULL_ANOTB, UnionAction.FULL_UNION),
    Exact_Estimation(062, "A{ 1.0,>0, F} ; B{<1.0,>0, F}",
```

### OctalLiteral
Octal integer `065`
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
        IntersectAction.EMPTY_1_0_T, AnotbAction.EMPTY_1_0_T, UnionAction.DEGEN_THB_0_F),

    Exact_Empty(065, "A{ 1.0,>0, F} ; B{ 1.0, 0, T}",
        IntersectAction.EMPTY_1_0_T, AnotbAction.SKETCH_A, UnionAction.SKETCH_A),
    Exact_Exact(066, "A{ 1.0,>0, F} ; B{ 1.0,>0, F}",
```

### OctalLiteral
Octal integer `052`
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    Empty_Exact(056, "A{ 1.0, 0, T} ; B{ 1.0,>0, F}",
        IntersectAction.EMPTY_1_0_T, AnotbAction.EMPTY_1_0_T, UnionAction.SKETCH_B),
    Empty_Estimation(052, "A{ 1.0, 0, T} ; B{<1.0,>0, F",
        IntersectAction.EMPTY_1_0_T, AnotbAction.EMPTY_1_0_T, UnionAction.SKETCH_B),
    Empty_Degen(050, "A{ 1.0, 0, T} ; B{<1.0, 0, F}",
```

### OctalLiteral
Octal integer `056`
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    Empty_Empty(055, "A{ 1.0, 0, T} ; B{ 1.0, 0, T}",
        IntersectAction.EMPTY_1_0_T, AnotbAction.EMPTY_1_0_T, UnionAction.EMPTY_1_0_T),
    Empty_Exact(056, "A{ 1.0, 0, T} ; B{ 1.0,>0, F}",
        IntersectAction.EMPTY_1_0_T, AnotbAction.EMPTY_1_0_T, UnionAction.SKETCH_B),
    Empty_Estimation(052, "A{ 1.0, 0, T} ; B{<1.0,>0, F",
```

### OctalLiteral
Octal integer `025`
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
        IntersectAction.DEGEN_MIN_0_F, AnotbAction.TRIM_A, UnionAction.TRIM_A),

    Estimation_Empty(025, "A{<1.0,>0, F} ; B{ 1.0, 0, T}",
        IntersectAction.EMPTY_1_0_T, AnotbAction.SKETCH_A, UnionAction.SKETCH_A),
    Estimation_Exact(026, "A{<1.0,>0, F} ; B{ 1.0,>0, F}",
```

### OctalLiteral
Octal integer `060`
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    Exact_Estimation(062, "A{ 1.0,>0, F} ; B{<1.0,>0, F}",
        IntersectAction.FULL_INTERSECT, AnotbAction.FULL_ANOTB, UnionAction.FULL_UNION),
    Exact_Degen(060, "A{ 1.0,>0, F} ; B{<1.0, 0, F}",
        IntersectAction.DEGEN_MIN_0_F, AnotbAction.TRIM_A, UnionAction.TRIM_A),

```

### OctalLiteral
Octal integer `050`
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    Empty_Estimation(052, "A{ 1.0, 0, T} ; B{<1.0,>0, F",
        IntersectAction.EMPTY_1_0_T, AnotbAction.EMPTY_1_0_T, UnionAction.SKETCH_B),
    Empty_Degen(050, "A{ 1.0, 0, T} ; B{<1.0, 0, F}",
        IntersectAction.EMPTY_1_0_T, AnotbAction.EMPTY_1_0_T, UnionAction.DEGEN_THB_0_F),

```

### OctalLiteral
Octal integer `006`
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    Degen_Empty(005, "A{<1.0, 0, F} ; B{ 1.0, 0, T}",
        IntersectAction.EMPTY_1_0_T, AnotbAction.DEGEN_THA_0_F, UnionAction.DEGEN_THA_0_F),
    Degen_Exact(006, "A{<1.0, 0, F} ; B{ 1.0,>0, F}",
        IntersectAction.DEGEN_MIN_0_F, AnotbAction.DEGEN_THA_0_F, UnionAction.TRIM_B),
    Degen_Estimation(002, "A{<1.0, 0, F} ; B{<1.0,>0, F}",
```

### OctalLiteral
Octal integer `000`
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    Degen_Estimation(002, "A{<1.0, 0, F} ; B{<1.0,>0, F}",
        IntersectAction.DEGEN_MIN_0_F, AnotbAction.DEGEN_MIN_0_F, UnionAction.TRIM_B),
    Degen_Degen(000, "A{<1.0, 0, F} ; B{<1.0, 0, F}",
        IntersectAction.DEGEN_MIN_0_F, AnotbAction.DEGEN_MIN_0_F, UnionAction.DEGEN_MIN_0_F);

```

### OctalLiteral
Octal integer `022`
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    Estimation_Exact(026, "A{<1.0,>0, F} ; B{ 1.0,>0, F}",
        IntersectAction.FULL_INTERSECT, AnotbAction.FULL_ANOTB, UnionAction.FULL_UNION),
    Estimation_Estimation(022, "A{<1.0,>0, F} ; B{<1.0,>0, F}",
        IntersectAction.FULL_INTERSECT, AnotbAction.FULL_ANOTB, UnionAction.FULL_UNION),
    Estimation_Degen(020, "A{<1.0,>0, F} ; B{<1.0, 0, F}",
```

### OctalLiteral
Octal integer `026`
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    Estimation_Empty(025, "A{<1.0,>0, F} ; B{ 1.0, 0, T}",
        IntersectAction.EMPTY_1_0_T, AnotbAction.SKETCH_A, UnionAction.SKETCH_A),
    Estimation_Exact(026, "A{<1.0,>0, F} ; B{ 1.0,>0, F}",
        IntersectAction.FULL_INTERSECT, AnotbAction.FULL_ANOTB, UnionAction.FULL_UNION),
    Estimation_Estimation(022, "A{<1.0,>0, F} ; B{<1.0,>0, F}",
```

### OctalLiteral
Octal integer `002`
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    Degen_Exact(006, "A{<1.0, 0, F} ; B{ 1.0,>0, F}",
        IntersectAction.DEGEN_MIN_0_F, AnotbAction.DEGEN_THA_0_F, UnionAction.TRIM_B),
    Degen_Estimation(002, "A{<1.0, 0, F} ; B{<1.0,>0, F}",
        IntersectAction.DEGEN_MIN_0_F, AnotbAction.DEGEN_MIN_0_F, UnionAction.TRIM_B),
    Degen_Degen(000, "A{<1.0, 0, F} ; B{<1.0, 0, F}",
```

### OctalLiteral
Octal integer `005`
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
        IntersectAction.DEGEN_MIN_0_F, AnotbAction.TRIM_A, UnionAction.TRIM_A),

    Degen_Empty(005, "A{<1.0, 0, F} ; B{ 1.0, 0, T}",
        IntersectAction.EMPTY_1_0_T, AnotbAction.DEGEN_THA_0_F, UnionAction.DEGEN_THA_0_F),
    Degen_Exact(006, "A{<1.0, 0, F} ; B{ 1.0,>0, F}",
```

### OctalLiteral
Octal integer `055`
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java

  public enum CornerCase {
    Empty_Empty(055, "A{ 1.0, 0, T} ; B{ 1.0, 0, T}",
        IntersectAction.EMPTY_1_0_T, AnotbAction.EMPTY_1_0_T, UnionAction.EMPTY_1_0_T),
    Empty_Exact(056, "A{ 1.0, 0, T} ; B{ 1.0,>0, F}",
```

### OctalLiteral
Octal integer `062`
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    Exact_Exact(066, "A{ 1.0,>0, F} ; B{ 1.0,>0, F}",
        IntersectAction.FULL_INTERSECT, AnotbAction.FULL_ANOTB, UnionAction.FULL_UNION),
    Exact_Estimation(062, "A{ 1.0,>0, F} ; B{<1.0,>0, F}",
        IntersectAction.FULL_INTERSECT, AnotbAction.FULL_ANOTB, UnionAction.FULL_UNION),
    Exact_Degen(060, "A{ 1.0,>0, F} ; B{<1.0, 0, F}",
```

### OctalLiteral
Octal integer `020`
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    Estimation_Estimation(022, "A{<1.0,>0, F} ; B{<1.0,>0, F}",
        IntersectAction.FULL_INTERSECT, AnotbAction.FULL_ANOTB, UnionAction.FULL_UNION),
    Estimation_Degen(020, "A{<1.0,>0, F} ; B{<1.0, 0, F}",
        IntersectAction.DEGEN_MIN_0_F, AnotbAction.TRIM_A, UnionAction.TRIM_A),

```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `src/main/java/org/apache/datasketches/common/SuppressFBWarnings.java`
#### Snippet
```java
   * A list of comma-separated, quoted SpotBugs warnings that are to be suppressed in the associated
   * annotated element. The value can be a bug category, kind or pattern.
   * @return list of relevant bug descriptors
   */
  String[] value() default {};
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/datasketches/quantiles/DoublesSketchBuilder.java`
#### Snippet
```java
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("QuantileSketchBuilder configuration:").append(LS);
    sb.append("K     : ").append(TAB).append(bK).append(LS);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/datasketches/frequencies/LongsSketch.java`
#### Snippet
```java
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("FrequentLongsSketch:").append(LS);
    sb.append("  Stream Length    : " + streamWeight).append(LS);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/datasketches/frequencies/ItemsSketch.java`
#### Snippet
```java
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("FrequentItemsSketch<T>:").append(LS);
    sb.append("  Stream Length    : " + streamWeight).append(LS);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/datasketches/req/ReqSketchBuilder.java`
#### Snippet
```java
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("ReqSketchBuilder configuration:").append(LS);
    sb.append("K:").append(TAB).append(bK).append(LS);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/datasketches/req/ReqSketch.java`
#### Snippet
```java
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("**********Relative Error Quantiles Sketch Summary**********").append(LS);
    sb.append("  K               : " + k).append(LS);
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`(srcEmptyFlag || single) ? true : dstOrdered` can be simplified to 'srcEmptyFlag \|\| single \|\| dstOrdered'
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
    //dispatch empty and single cases
    //Note: for empty and single we always output the ordered form.
    final boolean dstOrderedOut = (srcEmptyFlag || single) ? true : dstOrdered;
    if (srcEmptyFlag) {
      if (dstMem != null) {
```

### SimplifiableConditionalExpression
`(empty || single) ? true : dstOrdered` can be simplified to 'empty \|\| single \|\| dstOrdered'
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
    }
    //Note: for empty or single we always output the ordered form.
    final boolean dstOrderedOut = (empty || single) ? true : dstOrdered;
    if (direct) {
      final int preLongs = computeCompactPreLongs(empty, curCount, thetaLong);
```

### SimplifiableConditionalExpression
`(gadget_ == null) ? false : gadget_.isSameResource(that)` can be simplified to 'gadget_!=null \&\& gadget_.isSameResource(that)'
in `src/main/java/org/apache/datasketches/quantiles/DoublesUnionImplR.java`
#### Snippet
```java
  @Override
  public boolean isSameResource(final Memory that) {
    return (gadget_ == null) ? false : gadget_.isSameResource(that);
  }

```

### SimplifiableConditionalExpression
`i == 0 ? lvl0Sorted : true` can be simplified to 'i!=0 \|\| lvl0Sorted'
in `src/main/java/org/apache/datasketches/req/ReqSerDe.java`
#### Snippet
```java
        final List<ReqCompactor> compactors = new ArrayList<>();
        for (int i = 0; i < numCompactors; i++) {
          final boolean level0sorted = i == 0 ? lvl0Sorted : true;
          final Compactor compactor = extractCompactor(buff, level0sorted, hra);
          compactors.add(compactor.reqCompactor);
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/SetOperation.java`
#### Snippet
```java
   * @return a new builder
   */
  public static final SetOperationBuilder builder() {
    return new SetOperationBuilder();
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/DirectHllArray.java`
#### Snippet
```java
  }

  private static final void checkReadOnly(final WritableMemory wmem) {
    if (wmem == null) {
      throw new SketchesArgumentException("Cannot modify a read-only sketch");
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/BaseHllSketch.java`
#### Snippet
```java
   * @return the current serialization version.
   */
  public static final int getSerializationVersion() {
    return PreambleUtil.SER_VER;
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/BaseHllSketch.java`
#### Snippet
```java
  }

  private static final int coupon(final long[] hash) {
    final int addr26 = (int) ((hash[0] & KEY_MASK_26));
    final int lz = Long.numberOfLeadingZeros(hash[1]);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/BaseHllSketch.java`
#### Snippet
```java
   * @return the current serialization version.
   */
  public static final int getSerializationVersion(final Memory mem) {
    return mem.getByte(PreambleUtil.SER_VER_BYTE) & 0XFF;
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/quantilescommon/QuantilesUtil.java`
#### Snippet
```java
   * @param values the given array of double values
   */
  public static final void checkDoublesSplitPointsOrder(final double[] values) {
    Objects.requireNonNull(values);
    final int len = values.length - 1;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/quantilescommon/QuantilesUtil.java`
#### Snippet
```java
   * @param values the given array of double values
   */
  public static final void checkFloatsSplitPointsOrder(final float[] values) {
    Objects.requireNonNull(values);
    final int len = values.length - 1;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/quantilescommon/QuantilesUtil.java`
#### Snippet
```java
   * @param nRank the given normalized rank.
   */
  public static final void checkNormalizedRankBounds(final double nRank) {
    if ((nRank < 0.0) || (nRank > 1.0)) {
      throw new SketchesArgumentException(
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/ToByteArrayImpl.java`
#### Snippet
```java
  }

  private static final void insertAux(final AbstractHllArray srcImpl, final WritableMemory tgtWmem,
      final boolean tgtCompact) {
    final AuxHashMap auxHashMap = srcImpl.getAuxHashMap();
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/ToByteArrayImpl.java`
#### Snippet
```java

  // To byte array used by the heap HLL modes.
  static final byte[] toHllByteArray(final AbstractHllArray impl, final boolean compact) {
    int auxBytes = 0;
    if (impl.tgtHllType == TgtHllType.HLL_4) {
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/ToByteArrayImpl.java`
#### Snippet
```java

  //To byte array for coupons
  static final byte[] toCouponByteArray(final AbstractCoupons impl, final boolean dstCompact) {
    final int srcCouponCount = impl.getCouponCount();
    final int srcLgCouponArrInts = impl.getLgCouponArrInts();
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/ToByteArrayImpl.java`
#### Snippet
```java
  }

  private static final void insertCommonHll(final AbstractHllArray srcImpl,
      final WritableMemory tgtWmem, final boolean compact) {
    insertPreInts(tgtWmem, srcImpl.getPreInts());
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/ToByteArrayImpl.java`
#### Snippet
```java
  }

  private static final void insertHll(final AbstractHllArray impl, final WritableMemory wmem,
      final boolean compact) {
    insertCommonHll(impl, wmem, compact);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/ToByteArrayImpl.java`
#### Snippet
```java
  }

  private static final void copyCommonListAndSet(final AbstractCoupons impl,
      final WritableMemory wmem) {
    insertPreInts(wmem, impl.getPreInts());
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/CouponList.java`
#### Snippet
```java
  }

  static final HllSketchImpl promoteHeapListToSet(final CouponList list) {
    final int couponCount = list.couponCount;
    final int[] arr = list.couponIntArr;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/CouponList.java`
#### Snippet
```java
  //called by CouponHashSet.couponUpdate()
  //called by CouponList.couponUpdate()
  static final HllSketchImpl promoteHeapListOrSetToHll(final CouponList src) {
    final HllArray tgtHllArr = HllArray.newHeapHll(src.lgConfigK, src.tgtHllType);
    final PairIterator srcItr = src.iterator();
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/CouponList.java`
#### Snippet
```java
  }

  static final CouponList heapifyList(final Memory mem) {
    final int lgConfigK = extractLgK(mem);
    final TgtHllType tgtHllType = extractTgtHllType(mem);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/CouponHashSet.java`
#### Snippet
```java

  //will also accept List, but results in a Set
  static final CouponHashSet heapifySet(final Memory mem) {
    final int lgConfigK = extractLgK(mem);
    final TgtHllType tgtHllType = extractTgtHllType(mem);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/CouponHashSet.java`
#### Snippet
```java
  }

  private static final int[] growHashSet(final int[] coupIntArr, final int tgtLgCoupArrSize) {
    final int[] tgtCouponIntArr = new int[1 << tgtLgCoupArrSize]; //create tgt
    final int len = coupIntArr.length;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/SingleItemSketch.java`
#### Snippet
```java
  }

  static final boolean otherCheckForSingleItem(final int preLongs, final int serVer,
      final int famId, final int flags) {
    // Flags byte: SI=X, Ordered=T, Compact=T, Empty=F, ReadOnly=T, BigEndian=F = X11010 = 0x1A.
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/SingleItemSketch.java`
#### Snippet
```java
  }

  static final boolean otherCheckForSingleItem(final Memory mem) {
    return otherCheckForSingleItem(extractPreLongs(mem), extractSerVer(mem),
        extractFamilyID(mem), extractFlags(mem) );
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/DirectQuickSelectSketchR.java`
#### Snippet
```java
   */
  @SuppressFBWarnings(value = "DB_DUPLICATE_BRANCHES", justification = "False Positive, see the code comments")
  static final int setHashTableThreshold(final int lgNomLongs, final int lgArrLongs) {
    //SpotBugs may complain (DB_DUPLICATE_BRANCHES) if DQS_RESIZE_THRESHOLD == REBUILD_THRESHOLD,
    //but this allows us to tune these constants for different sketches.
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Union.java`
#### Snippet
```java
  }

  private static final HllSketch useGadgetMemory(
      final HllSketch gadget, final HllSketch hll8Heap, final boolean setOooFlag) {
    final WritableMemory wmem = gadget.getWritableMemory();    //use the gdt wmem
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Union.java`
#### Snippet
```java
   * @return a union operator populated with the given byte array image of an HllSketch.
   */
  public static final Union heapify(final byte[] byteArray) {
    return heapify(Memory.wrap(byteArray));
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Union.java`
#### Snippet
```java
   * @return a Union operator where the sketch data is in the given dstMem.
   */
  public static final Union writableWrap(final WritableMemory srcWmem) {
    final TgtHllType tgtHllType = extractTgtHllType(srcWmem);
    if (tgtHllType != TgtHllType.HLL_8) {
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Union.java`
#### Snippet
```java
   * @return a union operator populated with the given Memory image of an HllSketch.
   */
  public static final Union heapify(final Memory mem) {
    final int lgK = HllUtil.checkLgK(mem.getByte(PreambleUtil.LG_K_BYTE));
    final HllSketch sk = HllSketch.heapify(mem, false); //allows non-finalized image
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Union.java`
#### Snippet
```java
  }

  private static final void mergeHlltoHLLmode(final HllSketch src, final HllSketch tgt,
      final int srcLgK, final int tgtLgK, final boolean srcIsMem, final boolean tgtIsMem) {
      final int sw = (tgtIsMem ? 1 : 0) | (srcIsMem ? 2 : 0)
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Union.java`
#### Snippet
```java

  //Used to rebuild curMin, numAtCurMin and KxQ registers, due to high performance merge operation
  static final void checkRebuildCurMinNumKxQ(final HllSketch sketch) {
    final HllSketchImpl hllSketchImpl = sketch.hllSketchImpl;
    final CurMode curMode = sketch.getCurMode();
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Union.java`
#### Snippet
```java
   * @return the downsampled HllSketch.
   */
  private static final HllSketch downsample(final HllSketch candidate, final int tgtLgK) {
    final AbstractHllArray candArr = (AbstractHllArray) candidate.hllSketchImpl;
    final HllArray tgtHllArr = HllArray.newHeapHll(tgtLgK, TgtHllType.HLL_8);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/Sketch.java`
#### Snippet
```java
  }

  static final double lowerBound(final int curCount, final long thetaLong, final int numStdDev,
      final boolean empty) {
    final double theta = thetaLong / LONG_MAX_VALUE_AS_DOUBLE;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/Sketch.java`
#### Snippet
```java
  }

  static final double estimate(final long thetaLong, final int curCount) {
    return curCount * (LONG_MAX_VALUE_AS_DOUBLE / thetaLong);
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/Sketch.java`
#### Snippet
```java
   * @return true if given Family id is one of the theta sketches
   */
  static final boolean isValidSketchID(final int id) {
    return id == Family.ALPHA.getID()
        || id == Family.QUICKSELECT.getID()
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/Sketch.java`
#### Snippet
```java
  }

  static final double upperBound(final int curCount, final long thetaLong, final int numStdDev,
      final boolean empty) {
    final double theta = thetaLong / LONG_MAX_VALUE_AS_DOUBLE;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/Sketch.java`
#### Snippet
```java
   * @return a Sketch
   */
  private static final Sketch heapifyUpdateFromMemory(final Memory srcMem, final long expectedSeed) {
    final long cap = srcMem.getCapacity();
    if (cap < 8) {
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/Sketch.java`
#### Snippet
```java
  }

  private static final boolean estMode(final long thetaLong, final boolean empty) {
    return thetaLong < Long.MAX_VALUE && !empty;
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/Sketch.java`
#### Snippet
```java
   * @param sketch the given sketch
   */
  static final void checkSketchAndMemoryFlags(final Sketch sketch) {
    final Memory mem = sketch.getMemory();
    if (mem == null) { return; }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/CouponHashMap.java`
#### Snippet
```java
  }

  private static final void checkMaxCouponsPerKey(final int maxCouponsPerKey) {
    checkIfIntPowerOf2(maxCouponsPerKey, "maxCouponsPerKey");
    final int cpk = maxCouponsPerKey;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/AbstractHllArray.java`
#### Snippet
```java
  }

  static final int hll8ArrBytes(final int lgConfigK) {
    return 1 << lgConfigK;
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/AbstractHllArray.java`
#### Snippet
```java
  //Compute HLL byte array lengths, used by both heap and direct.

  static final int hll4ArrBytes(final int lgConfigK) {
    return 1 << (lgConfigK - 1);
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/AbstractHllArray.java`
#### Snippet
```java

  //separate KxQ updates
  static final void incrementalUpdateKxQ(final AbstractHllArray host,
      final int oldValue, final int newValue, double kxq0, double kxq1) {
    //update kxq0 and kxq1; subtract first, then add.
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/AbstractHllArray.java`
#### Snippet
```java
  //Called here and by Heap and Direct 6 and 8 bit implementations
  //In C: again-two-registers.c Lines 851 to 871
  static final void hipAndKxQIncrementalUpdate(final AbstractHllArray host,
      final int oldValue, final int newValue) {
    assert newValue > oldValue;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/AbstractHllArray.java`
#### Snippet
```java
  }

  static final int hll6ArrBytes(final int lgConfigK) {
    final int numSlots = 1 << lgConfigK;
    return ((numSlots * 3) >>> 2) + 1;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Conversions.java`
#### Snippet
```java
class Conversions {

  static final Hll4Array convertToHll4(final AbstractHllArray srcAbsHllArr) {
    final int lgConfigK = srcAbsHllArr.getLgConfigK();
    final Hll4Array hll4Array = new Hll4Array(lgConfigK);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Conversions.java`
#### Snippet
```java
  }

  static final Hll8Array convertToHll8(final AbstractHllArray srcAbsHllArr) {
    final int lgConfigK = srcAbsHllArr.lgConfigK;
    final Hll8Array hll8Array = new Hll8Array(lgConfigK);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Conversions.java`
#### Snippet
```java
  }

  static final Hll6Array convertToHll6(final AbstractHllArray srcAbsHllArr) {
    final int lgConfigK = srcAbsHllArr.lgConfigK;
    final Hll6Array hll6Array = new Hll6Array(lgConfigK);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Conversions.java`
#### Snippet
```java
   * @return pair values representing numAtCurMin and curMin
   */
  static final int curMinAndNum(final AbstractHllArray absHllArr) {
    int curMin = 64;
    int numAtCurMin = 0;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/SingleCouponMap.java`
#### Snippet
```java
  }

  private static final double updateEntrySizeBytes(final int tableEntries, final int keySizeBytes) {
    final double byteFraction = Math.ceil(tableEntries / 8.0) / tableEntries;
    return keySizeBytes + Short.BYTES + byteFraction;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/AbstractCoupons.java`
#### Snippet
```java
  //Called by CouponHashSet.growHashSet()
  //Called by DirectCouponHashSet.growHashSet()
  static final int find(final int[] array, final int lgArrInts, final int coupon) {
    final int arrMask = array.length - 1;
    int probe = coupon & arrMask;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/Rebuilder.java`
#### Snippet
```java
   * @param lgNomLongs the log_base2 of k, the configuration parameter of the sketch
   */
  static final void quickSelectAndRebuild(final WritableMemory mem, final int preambleLongs,
      final int lgNomLongs) {
    //Note: This copies the Memory data onto the heap and then at the end copies the result
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/Rebuilder.java`
#### Snippet
```java
   * @param tgtLgArrLongs the LgArrLongs value for the new hash table
   */
  static final void resize(final WritableMemory mem, final int preambleLongs,
      final int srcLgArrLongs, final int tgtLgArrLongs) {
    //Note: This copies the Memory data onto the heap and then at the end copies the result
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/Rebuilder.java`
#### Snippet
```java
   * @param thetaLong theta as a long
   */
  static final void moveAndResize(final Memory srcMem, final int preambleLongs,
      final int srcLgArrLongs, final WritableMemory dstMem, final int dstLgArrLongs, final long thetaLong) {
    //Note: This copies the Memory data onto the heap and then at the end copies the result
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/Rebuilder.java`
#### Snippet
```java
   * @return the actual log2 Resize Factor that can be used to grow the hash table
   */
  static final int actLgResizeFactor(final long capBytes, final int lgArrLongs, final int preLongs,
      final int lgRF) {
    final int maxHTLongs = Util.floorPowerOf2(((int)(capBytes >>> 3) - preLongs));
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
   * @return the compacted array.
   */
  static final long[] compactCache(final long[] srcCache, final int curCount,
      final long thetaLong, final boolean dstOrdered) {
    if (curCount == 0) {
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
  }

  private static final void checkFamilyAndFlags(
      final int srcFamId,
      final boolean srcCompactFlag,
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
   * @return the number of preamble longs
   */
  static final int computeCompactPreLongs(final boolean empty, final int curCount,
      final long thetaLong) {
    return (thetaLong < Long.MAX_VALUE) ? 3 : empty ? 1 : (curCount > 1) ? 2 : 1;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
  //All arguments must be valid and correct including flags.
  // Used as helper to create byte arrays as well as loading Memory for direct compact sketches
  static final Memory loadCompactMemory(
      final long[] compactHashArr,
      final short seedHash,
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
   * @param curCount the given current count
   */ //This handles #2 and #6 above
  static final void checkIllegalCurCountAndEmpty(final boolean empty, final int curCount) {
    if (empty && (curCount != 0)) { //this handles #2 and #6 above
      throw new SketchesStateException("Illegal State: Empty=true and Current Count != 0.");
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
   * @return thetaLong
   */
  static final long correctThetaOnCompact(final boolean empty, final int curCount,
      final long thetaLong) { //handles #4 above
    return (empty && (curCount == 0)) ? Long.MAX_VALUE : thetaLong;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
   * @return true if notEmpty, curCount = 1 and theta = 1.0;
   */
  static final boolean isSingleItem(final boolean empty, final int curCount,
      final long thetaLong) {
    return !empty && (curCount == 1) && (thetaLong == Long.MAX_VALUE);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/UniqueCountMap.java`
#### Snippet
```java
  }

  private static final void checkConstructorKeySize(final int keySizeBytes) {
    if (keySizeBytes < 4) {
      throw new SketchesArgumentException("KeySizeBytes must be >= 4: " + keySizeBytes);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/CouponTraverseMap.java`
#### Snippet
```java
  }

  private static final double updateEntrySizeBytes(final int tableEntries, final int keySizeBytes,
      final int maxCouponsPerKey) {
    final double byteFraction = Math.ceil(tableEntries / 8.0) / tableEntries;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllUtil.java`
#### Snippet
```java

  //Checks
  static final int checkLgK(final int lgK) {
    if ((lgK >= MIN_LOG_K) && (lgK <= MAX_LOG_K)) { return lgK; }
    throw new SketchesArgumentException(
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllUtil.java`
#### Snippet
```java
  }

  static final int getPairLow26(final int coupon) {
    return coupon & KEY_MASK_26;
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllUtil.java`
#### Snippet
```java
  }

  static final void checkNumStdDev(final int numStdDev) {
    if ((numStdDev < 1) || (numStdDev > 3)) {
      throw new SketchesArgumentException(
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllUtil.java`
#### Snippet
```java
  }

  static final int getPairValue(final int coupon) {
    return coupon >>> KEY_BITS_26;
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllUtil.java`
#### Snippet
```java

  //Exceptions
  static final void noWriteAccess() {
    throw new SketchesReadOnlyException(
        "This sketch is compact or does not have write access to the underlying resource.");
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/req/ReqCompactor.java`
#### Snippet
```java
   * @return the nearest even integer to the given float.
   */
  static final int nearestEven(final float fltVal) {
    return (int) round(fltVal / 2.0) << 1;
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/DirectAuxHashMap.java`
#### Snippet
```java
  }

  private static final void grow(final DirectHllArray host, final int oldLgAuxArrInts) {
    if (host.wmem == null) { noWriteAccess(); }
    final int oldAuxArrInts = 1 << oldLgAuxArrInts;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/DirectAuxHashMap.java`
#### Snippet
```java
  //Continues searching.
  //If the probe comes back to original index, throws an exception.
  private static final int find(final DirectHllArray host, final int slotNo) {
    final int lgAuxArrInts = extractLgArr(host.mem);
    assert lgAuxArrInts < host.lgConfigK : lgAuxArrInts;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/TgtHllType.java`
#### Snippet
```java
  private static final TgtHllType values[] = values();

  public static final TgtHllType fromOrdinal(final int typeId) {
    return values[typeId];
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/DirectCouponHashSet.java`
#### Snippet
```java
  //Continues searching
  //If the probe comes back to original index, throws an exception.
  private static final int find(final Memory mem, final int lgArr,
      final int coupon) {
    final int arrMask = (1 << lgArr) - 1;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/DirectCouponHashSet.java`
#### Snippet
```java
  }

  private static final void growHashSet(final WritableMemory wmem, final int tgtLgCouponArrSize) {
    final int tgtArrSize = 1 << tgtLgCouponArrSize;
    final int[] tgtCouponIntArr = new int[tgtArrSize];
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/tuple/Util.java`
#### Snippet
```java
   * @param seedHashB given seed hash B
   */
  public static final void checkSeedHashes(final short seedHashA, final short seedHashB) {
    if (seedHashA != seedHashB) {
      throw new SketchesArgumentException("Incompatible Seed Hashes. " + seedHashA + ", "
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/tuple/Util.java`
#### Snippet
```java
   * @return the UTF_8 byte array
   */
  public static final byte[] stringToByteArray(final String value) {
    if ((value == null) || value.isEmpty()) { return null; }
    return value.getBytes(UTF_8);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/tuple/Util.java`
#### Snippet
```java
   * @return the long array
   */
  public static final long[] doubleToLongArray(final double value) {
    final double d = (value == 0.0) ? 0.0 : value; // canonicalize -0.0, 0.0
    final long[] array = { Double.doubleToLongBits(d) }; // canonicalize all NaN forms
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/cpc/TestUtil.java`
#### Snippet
```java
public class TestUtil {

  static final double pwrLaw10NextDouble(final int ppb, final double curPoint) {
    final double cur = (curPoint < 1.0) ? 1.0 : curPoint;
    double gi = round(Math.log10(cur) * ppb); //current generating index
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/PreambleUtil.java`
#### Snippet
```java
   * @return the size in bytes
   */
  static final int getMemBytes(final int lgArrLongs, final int preambleLongs) {
    return (8 << lgArrLongs) + (preambleLongs << 3);
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/PreambleUtil.java`
#### Snippet
```java
  }

  static final short checkMemorySeedHash(final Memory mem, final long seed) {
    final short seedHashMem = (short) extractSeedHash(mem);
    ThetaUtil.checkSeedHashes(seedHashMem, ThetaUtil.computeSeedHash(seed)); //throws if bad seedHash
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/quantiles/DoublesSketch.java`
#### Snippet
```java
   * @return a new builder
   */
  public static final DoublesSketchBuilder builder() {
    return new DoublesSketchBuilder();
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/kll/KllSketch.java`
#### Snippet
```java
    }

    final static void kllSketchThrow(final Error errType) {
      throw new SketchesArgumentException(errType.getMessage());
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/quantiles/ItemsSketchSortedView.java`
#### Snippet
```java
   * @param comparator the given comparator for data type T
   */
  private final static <T> void populateFromItemsSketch(
      final int k, final long n, final long bitPattern, final T[] combinedBuffer,
      final int baseBufferCount, final int numQuantiles, final T[] quantilesArr, final long[] weightsArr,
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Hll4Array.java`
#### Snippet
```java
  }

  static final Hll4Array heapify(final Memory mem) {
    final int lgConfigK = extractLgK(mem);
    final Hll4Array hll4Array = new Hll4Array(lgConfigK);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/UpdateSketch.java`
#### Snippet
```java
   * @return a new builder
   */
  public static final UpdateSketchBuilder builder() {
    return new UpdateSketchBuilder();
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/Intersection.java`
#### Snippet
```java
   * @return the compacted array
   */ //Only used in IntersectionImpl & Test
  static final long[] compactCachePart(final long[] srcCache, final int lgArrLongs,
      final int curCount, final long thetaLong, final boolean dstOrdered) {
    if (curCount == 0) {
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/kll/KllMemoryValidate.java`
#### Snippet
```java
    }

    final static void memoryValidateThrow(final MemoryInputError errType, final int errVal) {
      throw new SketchesArgumentException(errType.getMessage() + errVal);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Hll6Array.java`
#### Snippet
```java

  //on-heap
  private static final int get6Bit(final byte[] arr, final int offsetBytes, final int slotNo) {
    final int startBit = slotNo * 6;
    final int shift = startBit & 0X7;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Hll6Array.java`
#### Snippet
```java
  }

  static final Hll6Array heapify(final Memory mem) {
    final int lgConfigK = extractLgK(mem);
    final Hll6Array hll6Array = new Hll6Array(lgConfigK);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Hll6Array.java`
#### Snippet
```java

  //on-heap
  private static final void put6Bit(final byte[] arr, final int offsetBytes, final int slotNo,
      final int newValue) {
    final int startBit = slotNo * 6;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HeapAuxHashMap.java`
#### Snippet
```java
  //Continues searching.
  //If the probe comes back to original index, throws an exception.
  private static final int find(final int[] auxArr, final int lgAuxArrInts, final int lgConfigK,
      final int slotNo) {
    assert lgAuxArrInts < lgConfigK;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/req/ReqSerDe.java`
#### Snippet
```java
  }

  static final Compactor extractCompactor(final Buffer buff, final boolean lvl0Sorted,
      final boolean hra) {
    final long state = buff.getLong();
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HeapAuxHashMap.java`
#### Snippet
```java
  }

  static final HeapAuxHashMap heapify(final Memory mem, final long offset, final int lgConfigK,
      final int auxCount, final boolean srcCompact) {
    final int lgAuxArrInts;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/quantiles/DoublesSketchSortedView.java`
#### Snippet
```java
   * it will be cumulative later.
   */
  private final static void populateFromDoublesSketch(
          final int k, final long n, final long bitPattern,
          final DoublesSketchAccessor sketchAccessor,
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/req/ReqSketch.java`
#### Snippet
```java
   * @return a new ReqSketchBuilder
   */
  public static final ReqSketchBuilder builder() {
    return new ReqSketchBuilder();
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/HllMap.java`
#### Snippet
```java
   * @return the first empty slot for the given key
   */
  private static final int findEmpty(final byte[] key, final int tableEntries, final byte[] stateArr) {
    final long[] hash = MurmurHash3.hash(key, SEED);
    int entryIndex  = getIndex(hash[0], tableEntries);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/HllMap.java`
#### Snippet
```java
  }

  private static final double updateEntrySizeBytes(final int tableEntries, final int keySizeBytes,
      final int hllArrLongs) {
    final double byteFraction = Math.ceil(tableEntries / 8.0) / tableEntries;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Hll8Array.java`
#### Snippet
```java
  }

  static final Hll8Array heapify(final Memory mem) {
    final int lgConfigK = extractLgK(mem);
    final Hll8Array hll8Array = new Hll8Array(lgConfigK);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/DirectCouponList.java`
#### Snippet
```java

  //Called by DirectCouponList.couponUpdate()
  static final DirectCouponHashSet promoteListToSet(final DirectCouponList src) {
    final WritableMemory wmem = src.wmem;

```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/DirectCouponList.java`
#### Snippet
```java
  }

  static final DirectHllArray promoteListOrSetToHll(final DirectCouponList src) {
    final WritableMemory wmem = src.wmem;

```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/quantiles/ItemsUtil.java`
#### Snippet
```java
   * @param comparator the comparator for generic item data type T
   */
  static final <T> void validateItems(final T[] items, final Comparator<? super T> comparator) {
    final int lenM1 = items.length - 1;
    for (int j = 0; j < lenM1; j++) {
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllSketch.java`
#### Snippet
```java

  //used by union and above
  static final HllSketch heapify(final Memory srcMem, final boolean checkRebuild) {
    Objects.requireNonNull(srcMem, "Source Memory must not be null");
    checkBounds(0, 8, srcMem.getCapacity()); //need min 8 bytes
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllSketch.java`
#### Snippet
```java
   * @return the maximum size in bytes that this sketch can grow to.
   */
  public static final int getMaxUpdatableSerializationBytes(final int lgConfigK,
      final TgtHllType tgtHllType) {
    final int arrBytes;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllSketch.java`
#### Snippet
```java
   * @return an HllSketch where the sketch data is in the given dstMem.
   */
  public static final HllSketch writableWrap(final WritableMemory srcWmem) {
    return writableWrap(srcWmem, true);
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllSketch.java`
#### Snippet
```java
   * @return an HllSketch on the java heap.
   */
  public static final HllSketch heapify(final byte[] byteArray) {
    return heapify(Memory.wrap(byteArray));
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllSketch.java`
#### Snippet
```java
   *
   */
  public static final HllSketch wrap(final Memory srcMem) {
    Objects.requireNonNull(srcMem, "Source Memory must not be null");
    checkBounds(0, 8, srcMem.getCapacity()); //need min 8 bytes
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllSketch.java`
#### Snippet
```java

  //used by union and above
  static final HllSketch writableWrap( final WritableMemory srcWmem, final boolean checkRebuild) {
    Objects.requireNonNull(srcWmem, "Source Memory must not be null");
    checkBounds(0, 8, srcWmem.getCapacity()); //need min 8 bytes
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllSketch.java`
#### Snippet
```java
   * @return an HllSketch on the java heap.
   */
  public static final HllSketch heapify(final Memory srcMem) {
    return heapify(srcMem, true);
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/Map.java`
#### Snippet
```java
   * @return the HLL array index and value
   */
  static final int coupon16(final byte[] identifier) {
    final long[] hash = MurmurHash3.hash(identifier, SEED);
    final int hllIdx = (int) (((hash[0] >>> 1) % 1024) & TEN_BIT_MASK); //hash[0] for 10-bit address
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/Map.java`
#### Snippet
```java
  }

  static final int getStride(final long hash, final int tableEntries) {
    return (int) ((hash >>> 1) % (tableEntries - 2L) + 1L);
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/Map.java`
#### Snippet
```java
  }

  static final int coupon16Value(final int coupon) {
    return (coupon >>> 10) & SIX_BIT_MASK;
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/Map.java`
#### Snippet
```java
   * @return <code>true</code> if the two sub-arrays are equal
   */
  static final boolean arraysEqual(final byte[] a, final int offsetA, final byte[] b,
      final int offsetB, final int length) {
    for (int i = 0; i < length; i++) {
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hllmap/Map.java`
#### Snippet
```java
  }

  static final int getIndex(final long hash, final int tableEntries) {
    return (int) ((hash >>> 1) % tableEntries);
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/DirectHll6Array.java`
#### Snippet
```java

  //off-heap / direct
  private static final void put6Bit(final WritableMemory wmem, final int offsetBytes, final int slotNo,
      final int newValue) {
    final int startBit = slotNo * 6;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/DirectHll6Array.java`
#### Snippet
```java

  //off-heap / direct
  private static final int get6Bit(final Memory mem, final int offsetBytes, final int slotNo) {
    final int startBit = slotNo * 6;
    final int shift = startBit & 0X7;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Hll4Update.java`
#### Snippet
```java
  //Only called by Hll4Array and DirectHll4Array
  //In C: two-registers.c Line 836 in "hhb_abstract_set_slot_if_new_value_bigger" non-sparse
  static final void internalHll4Update(final AbstractHllArray host, final int slotNo,
      final int newValue) {
    assert ((0 <= slotNo) && (slotNo < (1 << host.getLgConfigK())));
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/Hll4Update.java`
#### Snippet
```java
  //An AuxHashMap must exist if any values in the current hllByteArray are already 15.
  //In C: again-two-registers.c Lines 710 "hhb_shift_to_bigger_curmin"
  private static final void shiftToBiggerCurMin(final AbstractHllArray host) {
    final int oldCurMin = host.getCurMin();
    final int newCurMin = oldCurMin + 1;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/ForwardCompatibility.java`
#### Snippet
```java
   * @return a SerVer 3 {@link CompactSketch}.
   */
  static final CompactSketch heapify1to3(final Memory srcMem, final short seedHash) {
    final int memCap = (int) srcMem.getCapacity();
    final int preLongs = extractPreLongs(srcMem); //always 3 for serVer 1
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/ForwardCompatibility.java`
#### Snippet
```java
  }

  private static final void validateInputSize(final int reqBytesIn, final int memCap) {
    if (reqBytesIn > memCap) {
      throw new SketchesArgumentException(
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/ForwardCompatibility.java`
#### Snippet
```java
   * @return a SerVer 3 HeapCompactOrderedSketch
   */
  static final CompactSketch heapify2to3(final Memory srcMem, final short seedHash) {
    final int memCap = (int) srcMem.getCapacity();
    final int preLongs = extractPreLongs(srcMem); //1,2 or 3
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllArray.java`
#### Snippet
```java

  //used by heapify by all Heap HLL
  static final void extractCommonHll(final Memory srcMem, final HllArray hllArray) {
    hllArray.putOutOfOrder(extractOooFlag(srcMem));
    hllArray.putEmptyFlag(extractEmptyFlag(srcMem));
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllArray.java`
#### Snippet
```java
  }

  static final HllArray newHeapHll(final int lgConfigK, final TgtHllType tgtHllType) {
    if (tgtHllType == HLL_4) { return new Hll4Array(lgConfigK); }
    if (tgtHllType == HLL_6) { return new Hll6Array(lgConfigK); }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllEstimators.java`
#### Snippet
```java
   */
  //In C: again-two-registers.c hhb_get_improved_linear_counting_estimate L1274
  private static final double getHllBitMapEstimate(
      final int lgConfigK, final int curMin, final int numAtCurMin) {
    final int configK = 1 << lgConfigK;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllEstimators.java`
#### Snippet
```java
   */

  static final double hllLowerBound(final AbstractHllArray absHllArr, final int numStdDev) {
    final int lgConfigK = absHllArr.lgConfigK;
    final int configK = 1 << lgConfigK;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllEstimators.java`
#### Snippet
```java
  }

  static final double hllUpperBound(final AbstractHllArray absHllArr, final int numStdDev) {
    final int lgConfigK = absHllArr.lgConfigK;
    final double estimate = absHllArr.getEstimate();
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllEstimators.java`
#### Snippet
```java
  //In C: again-two-registers.c hhb_get_raw_estimate L1167
  //This algorithm is from Flajolet's, et al, 2007 HLL paper, Fig 3.
  private static final double getHllRawEstimate(final int lgConfigK, final double kxqSum) {
    final int configK = 1 << lgConfigK;
    final double correctionFactor;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/hll/HllEstimators.java`
#### Snippet
```java
   */
  //In C: again-two-registers.c hhb_get_composite_estimate L1489
  static final double hllCompositeEstimate(final AbstractHllArray absHllArr) {
    final int lgConfigK = absHllArr.getLgConfigK();
    final double rawEst = getHllRawEstimate(lgConfigK, absHllArr.getKxQ0() + absHllArr.getKxQ1());
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/HeapQuickSelectSketch.java`
#### Snippet
```java
   * @return the hash table threshold
   */
  static final int setHashTableThreshold(final int lgNomLongs, final int lgArrLongs) {
    final double fraction = (lgArrLongs <= lgNomLongs) ? ThetaUtil.RESIZE_THRESHOLD : ThetaUtil.REBUILD_THRESHOLD;
    return (int) Math.floor(fraction * (1 << lgArrLongs));
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
   * @return R.
   */
  private static final int getR(final double theta, final double alpha, final double p) {
    final double split1 = (p * (alpha + 1.0)) / 2.0;
    if (theta > split1) { return 0; }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
   */
  // @formatter:on
  private static final double getVariance(final double k, final double p, final double alpha,
      final double theta, final int count) {
    final double kPlus1 = k + 1.0;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
   * @return the hash table threshold
   */
  private static final int setHashTableThreshold(final int lgNomLongs, final int lgArrLongs) {
    final double fraction = (lgArrLongs <= lgNomLongs) ? ThetaUtil.RESIZE_THRESHOLD : ThetaUtil.REBUILD_THRESHOLD;
    return (int) Math.floor(fraction * (1 << lgArrLongs));
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
  }

  static final boolean isCompressed(final Memory mem) {
    return (getFlags(mem) & COMPRESSED_FLAG_MASK) > 0;
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
  }

  static final boolean hasWindow(final Memory mem) {
    return (getFlags(mem) & WINDOW_FLAG_MASK) > 0;
  }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
  }

  static final boolean hasSv(final Memory mem) {
    return (getFlags(mem) & SUP_VAL_FLAG_MASK) > 0;
  }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/theta/SetOperation.java`
#### Snippet
```java
      default:
        throw new SketchesArgumentException("SetOperation cannot wrap family: "
            + family.toString());
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/theta/SetOperation.java`
#### Snippet
```java
      }
      default:
        throw new SketchesArgumentException("SetOperation cannot wrap family: " + family.toString());
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/theta/SetOperation.java`
#### Snippet
```java
      default: {
        throw new SketchesArgumentException("SetOperation cannot heapify family: "
            + family.toString());
      }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/sampling/ReservoirLongsUnion.java`
#### Snippet
```java
      sb.append("Gadget is null").append(LS);
    } else {
      sb.append("Gadget summary: ").append(gadget_.toString());
    }
    sb.append("### END UNION SUMMARY").append(LS);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/sampling/PreambleUtil.java`
#### Snippet
```java
            + "Byte  0: ResizeFactor             : " + rf.toString() + LS
            + "Byte  1: Serialization Version    : " + serVer + LS
            + "Byte  2: Family                   : " + family.toString() + LS
            + "Byte  3: Flags Field              : " + flagsStr + LS
            //+ "  BIG_ENDIAN_STORAGE              : " + bigEndian + LS
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/sampling/PreambleUtil.java`
#### Snippet
```java
      .append("Byte  0: ResizeFactor         : ").append(rf.toString()).append(LS)
      .append("Byte  1: Serialization Version: ").append(serVer).append(LS)
      .append("Byte  2: Family               : ").append(family.toString()).append(LS)
      .append("Byte  3: Flags Field          : ").append(flagsStr).append(LS)
      //.append("  BIG_ENDIAN_STORAGE          : ").append(bigEndian).append(LS)
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/sampling/VarOptItemsSketch.java`
#### Snippet
```java
    if (weight <= 0.0) {
      throw new SketchesArgumentException("Item weights must be strictly positive: "
              + weight + ", for item " + item.toString());
    }
    ++n_;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/hllmap/UniqueCountMap.java`
#### Snippet
```java
      final Map cMap = maps_[i];
      if (cMap != null) {
        sb.append(cMap.toString());
        sb.append(LS);
      }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
    throw new SketchesArgumentException(
        "Possible Corruption: Family does not match flags: Family: "
            + srcFamily.toString()
            + ", Compact Flag: " + srcCompactFlag
            + ", ReadOnly Flag: " + srcReadOnlyFlag);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/theta/SetOperationBuilder.java`
#### Snippet
```java
      default:
        throw new SketchesArgumentException(
            "Given Family cannot be built as a SetOperation: " + family.toString());
    }
    return setOp;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/quantiles/DoublesUnionImplR.java`
#### Snippet
```java
    sb.append("   maxK                         : ").append(kStr);
    if (gadget_ == null) {
      sb.append(HeapUpdateDoublesSketch.newInstance(maxK_).toString());
      return sb.toString();
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/sampling/ReservoirItemsUnion.java`
#### Snippet
```java
      sb.append("   Gadget is null").append(LS);
    } else {
      sb.append("   Gadget summary: ").append(gadget_.toString());
    }
    sb.append("### END UNION SUMMARY").append(LS);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/theta/PreambleUtil.java`
#### Snippet
```java
    sb.append("Byte  0: ResizeFactor         : ").append(rfId + ", " + rf.toString()).append(LS);
    sb.append("Byte  1: Serialization Version: ").append(serVer).append(LS);
    sb.append("Byte  2: Family               : ").append(familyId + ", " + family.toString()).append(LS);
    sb.append("Byte  3: LgNomLongs           : ").append(lgNomLongs).append(LS);
    sb.append("Byte  4: LgArrLongs           : ").append(lgArrLongs).append(LS);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/quantiles/ClassicUtil.java`
#### Snippet
```java
    if (!family.equals(Family.QUANTILES)) {
      throw new SketchesArgumentException(
          "Possible corruption: Invalid Family: " + family.toString());
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/quantiles/ItemsUnion.java`
#### Snippet
```java
    sb.append("   maxK                         : ").append(kStr);
    if (gadget_ == null) {
      sb.append(ItemsSketch.getInstance(this.clazz_, maxK_, comparator_).toString());
      return sb.toString();
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/theta/UpdateSketch.java`
#### Snippet
```java
    } else {
      throw new SketchesArgumentException(
          "Possible corruption: Invalid Family: " + family.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/theta/UpdateSketchBuilder.java`
#### Snippet
```java
      default: {
        throw new SketchesArgumentException(
          "Given Family cannot be built as a Theta Sketch: " + bFam.toString());
      }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/frequencies/PreambleUtil.java`
#### Snippet
```java
      .append("Byte  0: Preamble Longs       : ").append(preLongs).append(LS)
      .append("Byte  1: Serialization Version: ").append(serVer).append(LS)
      .append("Byte  2: Family               : ").append(family.toString()).append(LS)
      .append("Byte  3: MaxMapSize           : ").append(maxMapSize).append(LS)
      .append("Byte  4: CurMapSize           : ").append(curMapSize).append(LS)
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/common/Family.java`
#### Snippet
```java
    if (id != id_) {
      throw new SketchesArgumentException(
          "Possible Corruption: This Family " + toString()
            + " does not match the ID of the given Family: " + idToFamily(id).toString());
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/common/Family.java`
#### Snippet
```java
      throw new SketchesArgumentException(
          "Possible Corruption: This Family " + toString()
            + " does not match the ID of the given Family: " + idToFamily(id).toString());
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/theta/Sketches.java`
#### Snippet
```java
    if (!Sketch.isValidSketchID(fam)) {
     throw new SketchesArgumentException("Source Memory not a valid Sketch. Family: "
         + Family.idToFamily(fam).toString());
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/tuple/SerializerDeserializer.java`
#### Snippet
```java
    } else {
      throw new SketchesArgumentException(
          "Possible corruption: Invalid Family: " + family.toString());
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
    else {
      throw new SketchesArgumentException(
          "Possible corruption: Invalid Family: " + family.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
    if (fieldOffset == 0) {
      throw new SketchesStateException("Undefined preamble field given the Format: "
          + "Format: " + format.toString() + ", HiField: " + hiField.toString());
    }
    return fieldOffset;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
    if (fieldOffset == 0) {
      throw new SketchesStateException("Undefined preamble field given the Format: "
          + "Format: " + format.toString() + ", HiField: " + hiField.toString());
    }
    return fieldOffset;
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `src/main/java/org/apache/datasketches/hll/BaseHllSketch.java`
#### Snippet
```java
    final int addr26 = (int) ((hash[0] & KEY_MASK_26));
    final int lz = Long.numberOfLeadingZeros(hash[1]);
    final int value = ((lz > 62 ? 62 : lz) + 1);
    return (value << KEY_BITS_26) | addr26;
  }
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `src/main/java/org/apache/datasketches/theta/Rebuilder.java`
#### Snippet
```java
    final int maxHTLongs = Util.floorPowerOf2(((int)(capBytes >>> 3) - preLongs));
    final int lgFactor = Math.max(Integer.numberOfTrailingZeros(maxHTLongs) - lgArrLongs, 0);
    return (lgFactor >= lgRF) ? lgRF : lgFactor;
  }

```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `src/main/java/org/apache/datasketches/common/Util.java`
#### Snippet
```java
  public static double powerSeriesNextDouble(final int ppb, final double curPoint,
      final boolean roundToLong, final double logBase) {
    final double cur = curPoint < 1.0 ? 1.0 : curPoint;
    double gi = round(logBaseOfX(logBase, cur) * ppb ); //current generating index
    double next;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `src/main/java/org/apache/datasketches/common/Util.java`
#### Snippet
```java
   */
  public static double floorPowerBaseOfDouble(final double base, final double n) {
    final double x = n < 1.0 ? 1.0 : n;
    return pow(base, floor(logBaseOfX(base, x)));
  }
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `src/main/java/org/apache/datasketches/common/Util.java`
#### Snippet
```java
   */
  public static double ceilingPowerBaseOfDouble(final double base, final double n) {
    final double x = n < 1.0 ? 1.0 : n;
    return pow(base, ceil(logBaseOfX(base, x)));
  }
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `src/main/java/org/apache/datasketches/common/Util.java`
#### Snippet
```java
   */
  public static long pwr2SeriesNext(final int ppo, final long curPoint) {
    final long cur = curPoint < 1L ? 1L : curPoint;
    int gi = (int)round(log2(cur) * ppo); //current generating index
    long next;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `src/main/java/org/apache/datasketches/frequencies/LongsSketch.java`
#### Snippet
```java
   */
  public Row[] getFrequentItems(final long threshold, final ErrorType errorType) {
    return sortItems(threshold > getMaximumError() ? threshold : getMaximumError(), errorType);
  }

```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `src/main/java/org/apache/datasketches/frequencies/ItemsSketch.java`
#### Snippet
```java
   */
  public Row<T>[] getFrequentItems(final long threshold, final ErrorType errorType) {
    return sortItems(threshold > getMaximumError() ? threshold : getMaximumError(), errorType);
  }

```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `src/main/java/org/apache/datasketches/cpc/TestUtil.java`
#### Snippet
```java

  static final double pwrLaw10NextDouble(final int ppb, final double curPoint) {
    final double cur = (curPoint < 1.0) ? 1.0 : curPoint;
    double gi = round(Math.log10(cur) * ppb); //current generating index
    double next;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `src/main/java/org/apache/datasketches/kll/KllDoublesHelper.java`
#### Snippet
```java
      //calculate the new levels array length
      final int finalLevelsArrLen;
      if (myCurLevelsArr.length < myNewNumLevels + 1) { finalLevelsArrLen = myNewNumLevels + 1; }
      else { finalLevelsArrLen = myCurLevelsArr.length; }

```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `src/main/java/org/apache/datasketches/cpc/IconEstimator.java`
#### Snippet
```java
    final double term = 1.0 + ((ratio * ratio * ratio) / 66.774757);
    final double result = doubleC * factor * term;
    return (result >= doubleC) ? result : doubleC;
  }

```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `src/main/java/org/apache/datasketches/hllmap/Map.java`
#### Snippet
```java
    final int hllIdx = (int) (((hash[0] >>> 1) % 1024) & TEN_BIT_MASK); //hash[0] for 10-bit address
    final int lz = Long.numberOfLeadingZeros(hash[1]);
    final int value = (lz > 62 ? 62 : lz) + 1;
    return (value << 10) | hllIdx;
  }
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `src/main/java/org/apache/datasketches/kll/KllFloatsHelper.java`
#### Snippet
```java
      //calculate the new levels array length
      final int finalLevelsArrLen;
      if (myCurLevelsArr.length < myNewNumLevels + 1) { finalLevelsArrLen = myNewNumLevels + 1; }
      else { finalLevelsArrLen = myCurLevelsArr.length; }

```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
      int bufOffset,final int bitOffset) {
    final int availBits = 8 - bitOffset;
    final int chunkBits = availBits <= bits ? availBits : bits;
    final int mask = (1 << chunkBits) - 1;
    value[index] = (buffer[bufOffset] >>> (availBits - chunkBits)) & mask;
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/datasketches/req/BaseReqSketch.java`
#### Snippet
```java
  /**
   * Returns an a priori estimate of relative standard error (RSE, expressed as a number in [0,1]).
   * Derived from Lemma 12 in https://arxiv.org/abs/2004.01668v2, but the constant factors were
   * adjusted based on empirical measurements.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/datasketches/req/ReqSketch.java`
#### Snippet
```java
 * Justin Thaler, Pavel Veselý, and loosely derived from a Python prototype written by Pavel Veselý.
 *
 * <p>Reference: https://arxiv.org/abs/2004.01668</p>
 *
 * <p>This implementation differs from the algorithm described in the paper in the following:</p>
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/datasketches/cpc/CompressionCharacterization.java`
#### Snippet
```java
  private CpcSketch[] streamSketches;
  private CompressedState[] compressedStates1;
  private WritableMemory[] memoryArr;
  private CompressedState[] compressedStates2;
  private CpcSketch[] unCompressedSketches;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/datasketches/cpc/CompressionCharacterization.java`
#### Snippet
```java
  private CompressedState[] compressedStates1;
  private WritableMemory[] memoryArr;
  private CompressedState[] compressedStates2;
  private CpcSketch[] unCompressedSketches;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/datasketches/cpc/CompressionCharacterization.java`
#### Snippet
```java
  private WritableMemory[] memoryArr;
  private CompressedState[] compressedStates2;
  private CpcSketch[] unCompressedSketches;

  @SuppressFBWarnings(value = "EI_EXPOSE_REP2", justification = "This is OK here")
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/datasketches/cpc/CompressionCharacterization.java`
#### Snippet
```java
  //intermediates
  private CpcSketch[] streamSketches;
  private CompressedState[] compressedStates1;
  private WritableMemory[] memoryArr;
  private CompressedState[] compressedStates2;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/datasketches/cpc/CompressionCharacterization.java`
#### Snippet
```java

  //intermediates
  private CpcSketch[] streamSketches;
  private CompressedState[] compressedStates1;
  private WritableMemory[] memoryArr;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/datasketches/cpc/StreamingValidation.java`
#### Snippet
```java

  //sketches
  private CpcSketch sketch = null;
  private BitMatrix matrix = null;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/datasketches/cpc/StreamingValidation.java`
#### Snippet
```java
  //sketches
  private CpcSketch sketch = null;
  private BitMatrix matrix = null;

  /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/datasketches/fdt/PostProcessor.java`
#### Snippet
```java
  private int groupCount;
  @SuppressWarnings("unused")
  private Group group; //uninitialized

  //simple hash-map
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/datasketches/theta/JaccardSimilarity.java`
#### Snippet
```java

    //Check for identical counts and thetas
    if (countUAB == countA && countUAB == countB
        && thetaLongUAB == thetaLongA && thetaLongUAB == thetaLongB) {
      return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java

    //do some basic checks ...
    if (srcEmptyFlag)  { assert (curCount == 0) && (thetaLong == Long.MAX_VALUE); }
    if (single) { assert (curCount == 1) && (thetaLong == Long.MAX_VALUE); }
    checkFamilyAndFlags(srcFamId, srcCompactFlag, srcReadOnlyFlag);
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
    //do some basic checks ...
    if (srcEmptyFlag)  { assert (curCount == 0) && (thetaLong == Long.MAX_VALUE); }
    if (single) { assert (curCount == 1) && (thetaLong == Long.MAX_VALUE); }
    checkFamilyAndFlags(srcFamId, srcCompactFlag, srcReadOnlyFlag);

```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/datasketches/frequencies/LongsSketch.java`
#### Snippet
```java
      if ( !(obj instanceof Row)) { return false; }
      final Row that = (Row) obj;
      if (est != that.est) { return false; }
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/datasketches/frequencies/ItemsSketch.java`
#### Snippet
```java
      if ( !(obj instanceof Row)) { return false; }
      final Row<T> that = (Row<T>) obj;
      if (est != that.est) { return false; }
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/datasketches/tuple/JaccardSimilarity.java`
#### Snippet
```java

    //Check for identical counts and thetas
    if (countUAB == countA && countUAB == countB
        && thetaLongUAB == thetaLongA && thetaLongUAB == thetaLongB) {
      return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/datasketches/tuple/JaccardSimilarity.java`
#### Snippet
```java

    //Check for identical counts and thetas
    if (countUAB == countA && countUAB == countB
            && thetaLongUAB == thetaLongA && thetaLongUAB == thetaLongB) {
      return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/datasketches/req/ReqSketchSortedView.java`
#### Snippet
```java
      cumWeights[i] +=  cumWeights[i - 1];
    }
    if (totalN > 0) {
      assert cumWeights[len - 1] == totalN;
    }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/datasketches/hll/Hll4Update.java`
#### Snippet
```java
    }

    if (newAuxMap != null) {
      assert newAuxMap.getAuxCount() == numAuxTokens : "auxCount: " + newAuxMap.getAuxCount()
        + ", HLL tokens: " + numAuxTokens;
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getLgConfigK()` is identical to its super method
in `src/main/java/org/apache/datasketches/hll/HllArray.java`
#### Snippet
```java

  @Override
  int getLgConfigK() {
    return lgConfigK;
  }
```

### RedundantMethodOverride
Method `getCurMode()` is identical to its super method
in `src/main/java/org/apache/datasketches/hll/HllArray.java`
#### Snippet
```java

  @Override
  CurMode getCurMode() {
    return curMode;
  }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
index \<\< 2: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/hll/IntMemoryPairIterator.java`
#### Snippet
```java

  int pair() {
    return mem.getInt(offsetBytes + (index << 2));
  }

```

### IntegerMultiplicationImplicitCastToLong
cnt++ \<\< 2: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/hll/ToByteArrayImpl.java`
#### Snippet
```java
      int cnt = 0;
      while (itr.nextValid()) { //works whether src has compact memory or not
        insertInt(tgtWmem, auxStart + (cnt++ << 2), itr.getPair());
      }
      assert cnt == auxCount;
```

### IntegerMultiplicationImplicitCastToLong
cnt++ \<\< 2: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/hll/ToByteArrayImpl.java`
#### Snippet
```java
        int cnt = 0;
        while (itr.nextValid()) {
          insertInt(memOut, dataStart + (cnt++ << 2), itr.getPair());
        }
        if (list) {
```

### IntegerMultiplicationImplicitCastToLong
resizeTarget \<\< 1: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/sampling/SamplingUtil.java`
#### Snippet
```java
   */
  static int getAdjustedSize(final int maxSize, final int resizeTarget) {
    if (maxSize - (resizeTarget << 1) < 0L) {
      return maxSize;
    }
```

### IntegerMultiplicationImplicitCastToLong
i \<\< 2: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/hll/CouponHashSet.java`
#### Snippet
```java
    if (memIsCompact) {
      for (int i = 0; i < couponCount; i++) {
        set.couponUpdate(extractInt(mem, memArrStart + (i << 2)));
      }
    } else { //updatable
```

### IntegerMultiplicationImplicitCastToLong
2 \* k: integer multiplication implicitly cast to long
in `src/main/java/org/apache/datasketches/quantiles/DoublesUtil.java`
#### Snippet
```java
    //output all the levels
    final int combBufSize = combBuf.length;
    if (n >= (2 * k)) {
      sb.append("   Valid | Level");
      for (int j = 2 * k; j < combBufSize; j++) { //output level data starting at 2K
```

### IntegerMultiplicationImplicitCastToLong
bbCount \<\< 3: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/quantiles/DirectCompactDoublesSketch.java`
#### Snippet
```java
      Arrays.sort(bbArray);
      dstMem.putDoubleArray(dstMemOffset, bbArray, 0, bbCount);
      dstMemOffset += bbCount << 3;

      long bitPattern = computeBitPattern(k, n);
```

### IntegerMultiplicationImplicitCastToLong
k \<\< 3: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/quantiles/DirectCompactDoublesSketch.java`
#### Snippet
```java
          inputAccessor.setLevel(lvl);
          dstMem.putDoubleArray(dstMemOffset, inputAccessor.getArray(0, k), 0, k);
          dstMemOffset += k << 3;
        }
      }
```

### IntegerMultiplicationImplicitCastToLong
oldAuxArrInts \<\< 3: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/hll/DirectAuxHashMap.java`
#### Snippet
```java
    insertLgArr(host.wmem, oldLgAuxArrInts + 1); //update LgArr field

    final long newAuxBytes = oldAuxArrInts << 3;
    final long requestBytes = host.auxStart + newAuxBytes;
    final long oldCapBytes = host.wmem.getCapacity();
```

### IntegerMultiplicationImplicitCastToLong
index \<\< 3: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/theta/MemoryHashIterator.java`
#### Snippet
```java
  public boolean next() {
    while (++index < arrLongs) {
      hash = mem.getLong(offsetBytes + (index << 3));
      if ((hash != 0) && (hash < thetaLong)) {
        return true;
```

### IntegerMultiplicationImplicitCastToLong
PreambleUtil.extractPreLongs(mem) \<\< 3: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/theta/MemoryHashIterator.java`
#### Snippet
```java
    this.arrLongs = arrLongs;
    this.thetaLong = thetaLong;
    offsetBytes = PreambleUtil.extractPreLongs(mem) << 3;
    index = -1;
    hash = 0;
```

### IntegerMultiplicationImplicitCastToLong
1 \<\< cIndex: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/req/ReqSketchIterator.java`
#### Snippet
```java
  @Override
  public long getWeight() {
    return 1 << cIndex;
  }

```

### IntegerMultiplicationImplicitCastToLong
3 \* k: integer multiplication implicitly cast to long
in `src/main/java/org/apache/datasketches/cpc/CpcSketch.java`
#### Snippet
```java
    final int k = (1 << lgK);
    final long c32 = sketch.numCoupons << 5;
    assert ((c32 == (3 * k)) || ((lgK == 4) && (c32 > (3 * k))));

    final byte[] window = new byte[k];
```

### IntegerMultiplicationImplicitCastToLong
3 \* k: integer multiplication implicitly cast to long
in `src/main/java/org/apache/datasketches/cpc/CpcSketch.java`
#### Snippet
```java
    final int k = (1 << lgK);
    final long c32 = sketch.numCoupons << 5;
    assert ((c32 == (3 * k)) || ((lgK == 4) && (c32 > (3 * k))));

    final byte[] window = new byte[k];
```

### IntegerMultiplicationImplicitCastToLong
probe \<\< 2: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/hll/DirectCouponHashSet.java`
#### Snippet
```java
    final int loopIndex = probe;
    do {
      final int couponAtIndex = extractInt(mem, HASH_SET_INT_ARR_START + (probe << 2));
      if (couponAtIndex == EMPTY) { return ~probe; } //empty
      else if (coupon == couponAtIndex) { return probe; } //duplicate
```

### IntegerMultiplicationImplicitCastToLong
i \<\< 2: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/hll/DirectCouponHashSet.java`
#### Snippet
```java
    final int oldLen = 1 << extractLgArr(wmem);
    for (int i = 0; i < oldLen; i++) {
      final int fetched = extractInt(wmem, HASH_SET_INT_ARR_START + (i << 2));
      if (fetched != EMPTY) {
        final int idx = find(tgtCouponIntArr, tgtLgCouponArrSize, fetched);
```

### IntegerMultiplicationImplicitCastToLong
preambleLongs \<\< 3: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/quantiles/ClassicUtil.java`
#### Snippet
```java
    }
    checkHeapFlags(flags);
    if (memCapBytes < (preambleLongs << 3)) {
      throw new SketchesArgumentException(
          "Possible corruption: Insufficient capacity for preamble: " + memCapBytes);
```

### IntegerMultiplicationImplicitCastToLong
1 \<\< c.getLgWeight(): integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/req/ReqSketchSortedView.java`
#### Snippet
```java
      final ReqCompactor c = compactors.get(i);
      final FloatBuffer bufIn = c.getBuffer();
      final long bufWeight = 1 << c.getLgWeight();
      final int bufInLen = bufIn.getCount();
      mergeSortIn(bufIn, bufWeight, count, sk.getHighRankAccuracyMode());
```

### IntegerMultiplicationImplicitCastToLong
bbCnt \<\< 3: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/quantiles/HeapUpdateDoublesSketch.java`
#### Snippet
```java
      long bitPattern = bitPattern_;
      if (bitPattern != 0) {
        long memOffset = preBytes + (bbCnt << 3);
        int combBufOffset = 2 * k;
        while (bitPattern != 0L) {
```

### IntegerMultiplicationImplicitCastToLong
k \<\< 3: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/quantiles/HeapUpdateDoublesSketch.java`
#### Snippet
```java
          if ((bitPattern & 1L) > 0L) {
            srcMem.getDoubleArray(memOffset, combinedBuffer, combBufOffset, k);
            memOffset += (k << 3); //bytes, increment compactly
          }
          combBufOffset += k; //doubles, increment every level
```

### IntegerMultiplicationImplicitCastToLong
i \<\< 2: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/hll/HeapAuxHashMap.java`
#### Snippet
```java
    if (srcCompact) {
      for (int i = 0; i < auxCount; i++) {
        final int pair = extractInt(mem, offset + (i << 2));
        final int slotNo = HllUtil.getPairLow26(pair) & configKmask;
        final int value = HllUtil.getPairValue(pair);
```

### IntegerMultiplicationImplicitCastToLong
i \<\< 2: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/hll/HeapAuxHashMap.java`
#### Snippet
```java
      final int auxArrInts = 1 << lgAuxArrInts;
      for (int i = 0; i < auxArrInts; i++) {
        final int pair = extractInt(mem, offset + (i << 2));
        if (pair == EMPTY) { continue; }
        final int slotNo = HllUtil.getPairLow26(pair) & configKmask;
```

### IntegerMultiplicationImplicitCastToLong
cnt++ \<\< 2: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/hll/DirectHll4Array.java`
#### Snippet
```java
      int cnt = 0;
      while (itr.nextValid()) { //works whether src has compact memory or not
        insertInt(memOut, auxStart + (cnt++ << 2), itr.getPair());
      }
      assert cnt == auxCount;
```

### IntegerMultiplicationImplicitCastToLong
i \<\< 2: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/hll/DirectCouponList.java`
#### Snippet
```java
    final int len = 1 << getLgCouponArrInts();
    for (int i = 0; i < len; i++) { //search for empty slot and duplicates
      final int couponAtIdx = extractInt(mem, LIST_INT_ARR_START + (i << 2));
      if (couponAtIdx == EMPTY) {
        insertInt(wmem, LIST_INT_ARR_START + (i << 2), coupon);
```

### IntegerMultiplicationImplicitCastToLong
i \<\< 2: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/hll/DirectCouponList.java`
#### Snippet
```java
      final int couponAtIdx = extractInt(mem, LIST_INT_ARR_START + (i << 2));
      if (couponAtIdx == EMPTY) {
        insertInt(wmem, LIST_INT_ARR_START + (i << 2), coupon);
        int couponCount = extractListCount(mem);
        insertListCount(wmem, ++couponCount);
```

### IntegerMultiplicationImplicitCastToLong
lengthChars \<\< 1: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/hash/MurmurHash3.java`
#### Snippet
```java
    }
    // Mix the tail into the hash and return
    return hashState.finalMix128(k1, k2, lengthChars << 1); //convert to bytes
  }

```

### IntegerMultiplicationImplicitCastToLong
lengthInts \<\< 2: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/hash/MurmurHash3.java`
#### Snippet
```java
    }
    // Mix the tail into the hash and return
    return hashState.finalMix128(k1, k2, lengthInts << 2); //convert to bytes
  }

```

### IntegerMultiplicationImplicitCastToLong
lengthLongs \<\< 3: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/hash/MurmurHash3.java`
#### Snippet
```java
    final long k1 = rem == 0 ? 0 : key[offsetLongs + tail]; //k2 -> 0
    // Mix the tail into the hash and return
    return hashState.finalMix128(k1, 0, lengthLongs << 3); //convert to bytes
  }

```

### IntegerMultiplicationImplicitCastToLong
2 \* k: integer multiplication implicitly cast to long
in `src/main/java/org/apache/datasketches/quantiles/DoublesByteArrayImpl.java`
#### Snippet
```java
    }
    // If n < 2k, totalLevels == 0 so ok to overshoot the offset update
    memOffsetBytes += (compact ? bbCnt : 2 * k) << 3;

    // If serializing from a compact sketch to a non-compact form, we may end up copying data for a
```

### IntegerMultiplicationImplicitCastToLong
k \<\< 3: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/quantiles/DoublesByteArrayImpl.java`
#### Snippet
```java
        assert dsa.numItems() == k;
        memOut.putDoubleArray(memOffsetBytes, dsa.getArray(0, k), 0, k);
        memOffsetBytes += (k << 3);
      }
    }
```

### IntegerMultiplicationImplicitCastToLong
getPreInts(mem) \<\< 2: integer shift implicitly cast to long
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
        throw new SketchesStateException("wLengthInts cannot be zero");
      }
    return getPreInts(mem) << 2;
  }

```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/org/apache/datasketches/theta/DirectQuickSelectSketch.java`
#### Snippet
```java
        int tgtLgArrLongs = Math.min(lgArrLongs + actLgRF, lgNomLongs + 1);

        if (actLgRF > 0) { //Expand in current Memory
          //lgArrLongs will change; thetaLong, curCount will not
          resize(wmem_, preambleLongs, lgArrLongs, tgtLgArrLongs);
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/org/apache/datasketches/cpc/CpcUnion.java`
#### Snippet
```java
    assert (newLgK < union.lgK);

    if (union.bitMatrix != null) { // downsample the union's bit matrix
      final int newK = 1 << newLgK;
      final long[] newMatrix = new long[newK];
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/org/apache/datasketches/kll/KllPreambleUtil.java`
#### Snippet
```java
        }
        sb.append("MIN/MAX:").append(LS);
        if (doublesSketch) {
          sb.append(mem.getDouble(offsetBytes)).append(LS);
          offsetBytes += typeBytes;
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/org/apache/datasketches/kll/KllPreambleUtil.java`
#### Snippet
```java
        sb.append("(top level of Levels arr is absent)").append(LS);
        sb.append("MIN/MAX:").append(LS);
        if (doublesSketch) {
          sb.append(mem.getDouble(offsetBytes)).append(LS);
          offsetBytes += typeBytes;
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'summary == null' covered by subsequent condition '!(summary instanceof ArrayOfStringsSummary)'
in `src/main/java/org/apache/datasketches/tuple/strings/ArrayOfStringsSummary.java`
#### Snippet
```java
  @Override
  public boolean equals(final Object summary) {
    if (summary == null || !(summary instanceof ArrayOfStringsSummary)) {
      return false;
    }
```

### ConditionCoveredByFurtherCondition
Condition 'shared == null' covered by subsequent condition '!(shared instanceof ConcurrentSharedThetaSketch)'
in `src/main/java/org/apache/datasketches/theta/UpdateSketchBuilder.java`
#### Snippet
```java
   */
  public UpdateSketch buildLocal(final UpdateSketch shared) {
    if ((shared == null) || !(shared instanceof ConcurrentSharedThetaSketch)) {
      throw new SketchesStateException("The concurrent shared sketch must be built first.");
    }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/datasketches/tuple/AnotB.java`
#### Snippet
```java
   * Performs an <i>AND NOT</i> operation with the existing internal state of this AnotB operator.
   * Calls to this method can be intermingled with calls to
   * {@link #notB(org.apache.datasketches.theta.Sketch)}.
   *
   * <p>An input argument of null or empty is ignored.</p>
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `sketchIn` to `CompactSketch` is redundant
in `src/main/java/org/apache/datasketches/theta/UnionImpl.java`
#### Snippet
```java
        //Ordered, thus compact
        if (sketchIn.hasMemory()) {
          final Memory skMem = ((CompactSketch) sketchIn).getMemory();
          final int preambleLongs = skMem.getByte(PREAMBLE_LONGS_BYTE) & 0X3F;
          for (int i = 0; i < curCountIn; i++ ) {
```

### RedundantCast
Casting `sk` to `QuickSelectSketch` is redundant
in `src/main/java/org/apache/datasketches/tuple/AnotB.java`
#### Snippet
```java
      csk = (CompactSketch<S>) sk;
    } else {
      csk = ((QuickSelectSketch<S>)sk).compact();
    }
    final int count = csk.getRetainedEntries();
```

## RuleId[id=SimplifiableBooleanExpression]
### SimplifiableBooleanExpression
`!((accumulator != null) ^ (union.bitMatrix != null))` can be simplified to '(accumulator != null)==(union.bitMatrix != null)'
in `src/main/java/org/apache/datasketches/cpc/CpcUnion.java`
#### Snippet
```java
    }
    final CpcSketch accumulator = union.accumulator;
    if ( !((accumulator != null) ^ (union.bitMatrix != null)) ) {
      throw new SketchesStateException(
        "accumulator and bitMatrix cannot be both valid or both null: "
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `adjustedWeight_` may be 'final'
in `src/main/java/org/apache/datasketches/sampling/VarOptItemsSamples.java`
#### Snippet
```java
  public final class WeightedSample {
    private final int idx_;
    private double adjustedWeight_;

    WeightedSample(final int i) {
```

### FieldMayBeFinal
Field `NON_HIP_LB` may be 'final'
in `src/main/java/org/apache/datasketches/hll/RelativeErrorTables.java`
#### Snippet
```java

  //case 2
  private static double[] NON_HIP_LB = //sd 1, 2, 3
    { //Q(.84134), Q(.97725), Q(.99865) respectively
      0.254409839, 0.682266712, 1.304022158, //4
```

### FieldMayBeFinal
Field `NON_HIP_UB` may be 'final'
in `src/main/java/org/apache/datasketches/hll/RelativeErrorTables.java`
#### Snippet
```java

  //case 3
  private static double[] NON_HIP_UB = //sd 1, 2, 3
    { //Q(.15866), Q(.02275), Q(.00135) respectively
      -0.256980172, -0.411905944, -0.52651057,  //4
```

### FieldMayBeFinal
Field `HIP_UB` may be 'final'
in `src/main/java/org/apache/datasketches/hll/RelativeErrorTables.java`
#### Snippet
```java

  //case 1
  private static double[] HIP_UB = //sd 1, 2, 3
    { //Q(.15866), Q(.02275), Q(.00135) respectively
      -0.207805347, -0.355574279, -0.475535095, //4
```

### FieldMayBeFinal
Field `HIP_LB` may be 'final'
in `src/main/java/org/apache/datasketches/hll/RelativeErrorTables.java`
#### Snippet
```java

  //case 0
  private static double[] HIP_LB = //sd 1, 2, 3
    { //Q(.84134), Q(.97725), Q(.99865) respectively
      0.207316195, 0.502865572, 0.882303765, //4
```

### FieldMayBeFinal
Field `upperBound` may be 'final'
in `src/main/java/org/apache/datasketches/sampling/SampleSubsetSummary.java`
#### Snippet
```java
  private double lowerBound;
  private double estimate;
  private double upperBound;
  private double totalSketchWeight;

```

### FieldMayBeFinal
Field `lowerBound` may be 'final'
in `src/main/java/org/apache/datasketches/sampling/SampleSubsetSummary.java`
#### Snippet
```java
 */
public class SampleSubsetSummary {
  private double lowerBound;
  private double estimate;
  private double upperBound;
```

### FieldMayBeFinal
Field `totalSketchWeight` may be 'final'
in `src/main/java/org/apache/datasketches/sampling/SampleSubsetSummary.java`
#### Snippet
```java
  private double estimate;
  private double upperBound;
  private double totalSketchWeight;

  SampleSubsetSummary(final double lowerBound,
```

### FieldMayBeFinal
Field `estimate` may be 'final'
in `src/main/java/org/apache/datasketches/sampling/SampleSubsetSummary.java`
#### Snippet
```java
public class SampleSubsetSummary {
  private double lowerBound;
  private double estimate;
  private double upperBound;
  private double totalSketchWeight;
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `src/main/java/org/apache/datasketches/theta/HeapCompactHashIterator.java`
#### Snippet
```java

class HeapCompactHashIterator implements HashIterator {
  private long[] cache;
  private int index;

```

### FieldMayBeFinal
Field `tableOfExactHarmonicNumbers` may be 'final'
in `src/main/java/org/apache/datasketches/hll/HarmonicNumbers.java`
#### Snippet
```java
  private static final int NUM_EXACT_HARMONIC_NUMBERS = 25;

  private static double[] tableOfExactHarmonicNumbers = {
      0.0, // 0
      1.0, // 1
```

### FieldMayBeFinal
Field `qsk_` may be 'final'
in `src/main/java/org/apache/datasketches/tuple/Union.java`
#### Snippet
```java
public class Union<S extends Summary> {
  private final SummarySetOperations<S> summarySetOps_;
  private QuickSelectSketch<S> qsk_;
  private long unionThetaLong_; // need to maintain outside of the sketch
  private boolean empty_;
```

### FieldMayBeFinal
Field `uPPO` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/MergingValidation.java`
#### Snippet
```java
  private int lgMaxK; //inclusive
  private int lgMulK; //multiplier of K to produce maxNa, maxNb
  private int uPPO;
  private int incLgK; //increment of lgK
  private PrintStream printStream;
```

### FieldMayBeFinal
Field `lgMaxK` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/MergingValidation.java`
#### Snippet
```java
  //inputs
  private int lgMinK;
  private int lgMaxK; //inclusive
  private int lgMulK; //multiplier of K to produce maxNa, maxNb
  private int uPPO;
```

### FieldMayBeFinal
Field `lgMulK` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/MergingValidation.java`
#### Snippet
```java
  private int lgMinK;
  private int lgMaxK; //inclusive
  private int lgMulK; //multiplier of K to produce maxNa, maxNb
  private int uPPO;
  private int incLgK; //increment of lgK
```

### FieldMayBeFinal
Field `printStream` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/MergingValidation.java`
#### Snippet
```java
  private int uPPO;
  private int incLgK; //increment of lgK
  private PrintStream printStream;
  private PrintWriter printWriter;

```

### FieldMayBeFinal
Field `printWriter` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/MergingValidation.java`
#### Snippet
```java
  private int incLgK; //increment of lgK
  private PrintStream printStream;
  private PrintWriter printWriter;

  /**
```

### FieldMayBeFinal
Field `incLgK` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/MergingValidation.java`
#### Snippet
```java
  private int lgMulK; //multiplier of K to produce maxNa, maxNb
  private int uPPO;
  private int incLgK; //increment of lgK
  private PrintStream printStream;
  private PrintWriter printWriter;
```

### FieldMayBeFinal
Field `lgMinK` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/MergingValidation.java`
#### Snippet
```java

  //inputs
  private int lgMinK;
  private int lgMaxK; //inclusive
  private int lgMulK; //multiplier of K to produce maxNa, maxNb
```

### FieldMayBeFinal
Field `lg_` may be 'final'
in `src/main/java/org/apache/datasketches/common/ResizeFactor.java`
#### Snippet
```java
  X8(3);

  private int lg_;

  ResizeFactor(final int lg) {
```

### FieldMayBeFinal
Field `pw` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/CompressionCharacterization.java`
#### Snippet
```java
  private int incLgK; //increment of lgK
  private PrintStream ps;
  private PrintWriter pw;

  //intermediates
```

### FieldMayBeFinal
Field `lgMinT` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/CompressionCharacterization.java`
#### Snippet
```java
  private int lgMinK;
  private int lgMaxK; //inclusive
  private int lgMinT; //Trials at end
  private int lgMaxT; //Trials at start
  private int lgMulK; //multiplier of K to produce maxU
```

### FieldMayBeFinal
Field `lgMaxT` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/CompressionCharacterization.java`
#### Snippet
```java
  private int lgMaxK; //inclusive
  private int lgMinT; //Trials at end
  private int lgMaxT; //Trials at start
  private int lgMulK; //multiplier of K to produce maxU
  private int uPPO;
```

### FieldMayBeFinal
Field `lgMulK` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/CompressionCharacterization.java`
#### Snippet
```java
  private int lgMinT; //Trials at end
  private int lgMaxT; //Trials at start
  private int lgMulK; //multiplier of K to produce maxU
  private int uPPO;
  private int incLgK; //increment of lgK
```

### FieldMayBeFinal
Field `ps` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/CompressionCharacterization.java`
#### Snippet
```java
  private int uPPO;
  private int incLgK; //increment of lgK
  private PrintStream ps;
  private PrintWriter pw;

```

### FieldMayBeFinal
Field `lgMaxK` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/CompressionCharacterization.java`
#### Snippet
```java
  //inputs
  private int lgMinK;
  private int lgMaxK; //inclusive
  private int lgMinT; //Trials at end
  private int lgMaxT; //Trials at start
```

### FieldMayBeFinal
Field `incLgK` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/CompressionCharacterization.java`
#### Snippet
```java
  private int lgMulK; //multiplier of K to produce maxU
  private int uPPO;
  private int incLgK; //increment of lgK
  private PrintStream ps;
  private PrintWriter pw;
```

### FieldMayBeFinal
Field `uPPO` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/CompressionCharacterization.java`
#### Snippet
```java
  private int lgMaxT; //Trials at start
  private int lgMulK; //multiplier of K to produce maxU
  private int uPPO;
  private int incLgK; //increment of lgK
  private PrintStream ps;
```

### FieldMayBeFinal
Field `lgMinK` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/CompressionCharacterization.java`
#### Snippet
```java

  //inputs
  private int lgMinK;
  private int lgMaxK; //inclusive
  private int lgMinT; //Trials at end
```

### FieldMayBeFinal
Field `arrLongs` may be 'final'
in `src/main/java/org/apache/datasketches/theta/MemoryHashIterator.java`
#### Snippet
```java
class MemoryHashIterator implements HashIterator {
  private Memory mem;
  private int arrLongs;
  private long thetaLong;
  private long offsetBytes;
```

### FieldMayBeFinal
Field `mem` may be 'final'
in `src/main/java/org/apache/datasketches/theta/MemoryHashIterator.java`
#### Snippet
```java
 */
class MemoryHashIterator implements HashIterator {
  private Memory mem;
  private int arrLongs;
  private long thetaLong;
```

### FieldMayBeFinal
Field `offsetBytes` may be 'final'
in `src/main/java/org/apache/datasketches/theta/MemoryHashIterator.java`
#### Snippet
```java
  private int arrLongs;
  private long thetaLong;
  private long offsetBytes;
  private int index;
  private long hash;
```

### FieldMayBeFinal
Field `thetaLong` may be 'final'
in `src/main/java/org/apache/datasketches/theta/MemoryHashIterator.java`
#### Snippet
```java
  private Memory mem;
  private int arrLongs;
  private long thetaLong;
  private long offsetBytes;
  private int index;
```

### FieldMayBeFinal
Field `sampleSize` may be 'final'
in `src/main/java/org/apache/datasketches/frequencies/LongsSketch.java`
#### Snippet
```java
   * decrement
   */
  private int sampleSize;

  /**
```

### FieldMayBeFinal
Field `lgMaxMapSize` may be 'final'
in `src/main/java/org/apache/datasketches/frequencies/LongsSketch.java`
#### Snippet
```java
   * structure.
   */
  private int lgMaxMapSize;

  /**
```

### FieldMayBeFinal
Field `sampleSize` may be 'final'
in `src/main/java/org/apache/datasketches/frequencies/ItemsSketch.java`
#### Snippet
```java
   * decrement
   */
  private int sampleSize;

  /**
```

### FieldMayBeFinal
Field `lgMaxMapSize` may be 'final'
in `src/main/java/org/apache/datasketches/frequencies/ItemsSketch.java`
#### Snippet
```java
   * structure.
   */
  private int lgMaxMapSize;

  /**
```

### FieldMayBeFinal
Field `numRetainedItems` may be 'final'
in `src/main/java/org/apache/datasketches/req/ReqSketchIterator.java`
#### Snippet
```java
  private int cIndex;
  private int bIndex;
  private int numRetainedItems;
  private FloatBuffer currentBuf;

```

### FieldMayBeFinal
Field `compactors` may be 'final'
in `src/main/java/org/apache/datasketches/req/ReqSketchIterator.java`
#### Snippet
```java
 */
public class ReqSketchIterator implements QuantilesFloatsSketchIterator {
  private List<ReqCompactor> compactors;
  private int cIndex;
  private int bIndex;
```

### FieldMayBeFinal
Field `mem_` may be 'final'
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/DirectArrayOfDoublesCompactSketch.java`
#### Snippet
```java

  // this value exists only on heap, never serialized
  private Memory mem_;

  /**
```

### FieldMayBeFinal
Field `ubEquivTable` may be 'final'
in `src/main/java/org/apache/datasketches/thetacommon/EquivTables.java`
#### Snippet
```java
  };

  private static double[] ubEquivTable = {
    1.0, 2.0, 3.0, // fake values for k = 0
    0.99067760836669549, 1.75460517119302040, 2.48055626001627161, // k = 1
```

### FieldMayBeFinal
Field `lbEquivTable` may be 'final'
in `src/main/java/org/apache/datasketches/thetacommon/EquivTables.java`
#### Snippet
```java
  }

  private static double[] lbEquivTable = {
    1.0, 2.0, 3.0, // fake values for k = 0
    0.78733703534118149, 3.14426768537558132, 13.56789685109913535, // k = 1
```

### FieldMayBeFinal
Field `numValues_` may be 'final'
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/DirectArrayOfDoublesSketchIterator.java`
#### Snippet
```java
  private int offset_;
  private int numEntries_;
  private int numValues_;
  private int i_;
  private static final int SIZE_OF_KEY_BYTES = 8;
```

### FieldMayBeFinal
Field `offset_` may be 'final'
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/DirectArrayOfDoublesSketchIterator.java`
#### Snippet
```java

  private Memory mem_;
  private int offset_;
  private int numEntries_;
  private int numValues_;
```

### FieldMayBeFinal
Field `mem_` may be 'final'
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/DirectArrayOfDoublesSketchIterator.java`
#### Snippet
```java
final class DirectArrayOfDoublesSketchIterator implements ArrayOfDoublesSketchIterator {

  private Memory mem_;
  private int offset_;
  private int numEntries_;
```

### FieldMayBeFinal
Field `numEntries_` may be 'final'
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/DirectArrayOfDoublesSketchIterator.java`
#### Snippet
```java
  private Memory mem_;
  private int offset_;
  private int numEntries_;
  private int numValues_;
  private int i_;
```

### FieldMayBeFinal
Field `thetaLong` may be 'final'
in `src/main/java/org/apache/datasketches/theta/HeapHashIterator.java`
#### Snippet
```java
class HeapHashIterator implements HashIterator {
  private long[] cache;
  private long thetaLong;
  private int index;
  private long hash;
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `src/main/java/org/apache/datasketches/theta/HeapHashIterator.java`
#### Snippet
```java
 */
class HeapHashIterator implements HashIterator {
  private long[] cache;
  private long thetaLong;
  private int index;
```

### FieldMayBeFinal
Field `mem_` may be 'final'
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/DirectArrayOfDoublesQuickSelectSketch.java`
#### Snippet
```java

  // these values exist only on heap, never serialized
  private WritableMemory mem_;
  // these can be derived from the mem_ contents, but are kept here for performance
  private int keysOffset_;
```

### FieldMayBeFinal
Field `bitMatrix` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/BitMatrix.java`
#### Snippet
```java
  private final long seed;
  private long numCoupons;
  private long[] bitMatrix;
  private boolean numCouponsInvalid; //only used if we allowed merges

```

### FieldMayBeFinal
Field `mem_` may be 'final'
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/DirectArrayOfDoublesIntersection.java`
#### Snippet
```java
final class DirectArrayOfDoublesIntersection extends ArrayOfDoublesIntersection {

  private WritableMemory mem_;

  /**
```

### FieldMayBeFinal
Field `msg` may be 'final'
in `src/main/java/org/apache/datasketches/kll/KllSketch.java`
#### Snippet
```java
    MUST_NOT_BE_UPDATABLE_FORMAT("Given Memory object must not be in updatableFormat.");

    private String msg;

    private Error(final String msg) {
```

### FieldMayBeFinal
Field `printStream` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/StreamingValidation.java`
#### Snippet
```java
  private int trials;
  private int ppoN;
  private PrintStream printStream;
  private PrintWriter printWriter;

```

### FieldMayBeFinal
Field `printWriter` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/StreamingValidation.java`
#### Snippet
```java
  private int ppoN;
  private PrintStream printStream;
  private PrintWriter printWriter;

  //sketches
```

### FieldMayBeFinal
Field `trials` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/StreamingValidation.java`
#### Snippet
```java
  private int lgMinK;
  private int lgMaxK; //inclusive
  private int trials;
  private int ppoN;
  private PrintStream printStream;
```

### FieldMayBeFinal
Field `ppoN` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/StreamingValidation.java`
#### Snippet
```java
  private int lgMaxK; //inclusive
  private int trials;
  private int ppoN;
  private PrintStream printStream;
  private PrintWriter printWriter;
```

### FieldMayBeFinal
Field `lgMaxK` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/StreamingValidation.java`
#### Snippet
```java
  //inputs
  private int lgMinK;
  private int lgMaxK; //inclusive
  private int trials;
  private int ppoN;
```

### FieldMayBeFinal
Field `lgMinK` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/StreamingValidation.java`
#### Snippet
```java

  //inputs
  private int lgMinK;
  private int lgMaxK; //inclusive
  private int trials;
```

### FieldMayBeFinal
Field `group` may be 'final'
in `src/main/java/org/apache/datasketches/fdt/PostProcessor.java`
#### Snippet
```java
  private int groupCount;
  @SuppressWarnings("unused")
  private Group group; //uninitialized

  //simple hash-map
```

### FieldMayBeFinal
Field `sketchAccessor` may be 'final'
in `src/main/java/org/apache/datasketches/quantiles/DoublesSketchIterator.java`
#### Snippet
```java
 */
public class DoublesSketchIterator implements QuantilesDoublesSketchIterator {
  private DoublesSketchAccessor sketchAccessor;
  private long bitPattern;
  private int level;
```

### FieldMayBeFinal
Field `printWriter` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/QuickMergingValidation.java`
#### Snippet
```java
  private int incLgK; //increment of lgK
  private PrintStream printStream;
  private PrintWriter printWriter;

  /**
```

### FieldMayBeFinal
Field `lgMinK` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/QuickMergingValidation.java`
#### Snippet
```java

  //inputs
  private int lgMinK;
  private int lgMaxK; //inclusive
  private int incLgK; //increment of lgK
```

### FieldMayBeFinal
Field `incLgK` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/QuickMergingValidation.java`
#### Snippet
```java
  private int lgMinK;
  private int lgMaxK; //inclusive
  private int incLgK; //increment of lgK
  private PrintStream printStream;
  private PrintWriter printWriter;
```

### FieldMayBeFinal
Field `lgMaxK` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/QuickMergingValidation.java`
#### Snippet
```java
  //inputs
  private int lgMinK;
  private int lgMaxK; //inclusive
  private int incLgK; //increment of lgK
  private PrintStream printStream;
```

### FieldMayBeFinal
Field `printStream` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/QuickMergingValidation.java`
#### Snippet
```java
  private int lgMaxK; //inclusive
  private int incLgK; //increment of lgK
  private PrintStream printStream;
  private PrintWriter printWriter;

```

### FieldMayBeFinal
Field `msg` may be 'final'
in `src/main/java/org/apache/datasketches/kll/KllMemoryValidate.java`
#### Snippet
```java
    EMPTYBIT_AND_SINGLEBIT("Empty flag bit and SingleItem flag bit cannot both be set. Flags: ");

    private String msg;

    private MemoryInputError(final String msg) {
```

### FieldMayBeFinal
Field `keys_` may be 'final'
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/HeapArrayOfDoublesSketchIterator.java`
#### Snippet
```java
final class HeapArrayOfDoublesSketchIterator implements ArrayOfDoublesSketchIterator {

  private long[] keys_;
  private double[] values_;
  private int numValues_;
```

### FieldMayBeFinal
Field `numValues_` may be 'final'
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/HeapArrayOfDoublesSketchIterator.java`
#### Snippet
```java
  private long[] keys_;
  private double[] values_;
  private int numValues_;
  private int i_;

```

### FieldMayBeFinal
Field `values_` may be 'final'
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/HeapArrayOfDoublesSketchIterator.java`
#### Snippet
```java

  private long[] keys_;
  private double[] values_;
  private int numValues_;
  private int i_;
```

### FieldMayBeFinal
Field `combinedBuffer` may be 'final'
in `src/main/java/org/apache/datasketches/quantiles/ItemsSketchIterator.java`
#### Snippet
```java
 */
public class ItemsSketchIterator<T> implements QuantilesGenericSketchIterator<T> {
  private Object[] combinedBuffer;
  private long bitPattern;
  private int level;
```

### FieldMayBeFinal
Field `k` may be 'final'
in `src/main/java/org/apache/datasketches/quantiles/ItemsSketchIterator.java`
#### Snippet
```java
  private int offset;
  private int num;
  private int k;

  ItemsSketchIterator(final ItemsSketch<T> sketch, final long bitPattern) {
```

### FieldMayBeFinal
Field `fmtArr` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/Format.java`
#### Snippet
```java
  PINNED_SLIDING_HIP;

  private static Format[] fmtArr = Format.class.getEnumConstants();

  /**
```

### FieldMayBeFinal
Field `powersOfThree` may be 'final'
in `src/main/java/org/apache/datasketches/kll/KllHelper.java`
#### Snippet
```java
   * This is the exact powers of 3 from 3^0 to 3^30 where the exponent is the index
   */
  private static long[] powersOfThree =
      new long[] {1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441,
  1594323, 4782969, 14348907, 43046721, 129140163, 387420489, 1162261467,
```

### FieldMayBeFinal
Field `fmtArr` may be 'final'
in `src/main/java/org/apache/datasketches/cpc/Flavor.java`
#### Snippet
```java
  SLIDING; // 27K/8 <= C

  private static Flavor[] fmtArr = Flavor.class.getEnumConstants();

  /**
```

### FieldMayBeFinal
Field `maxPreLongs_` may be 'final'
in `src/main/java/org/apache/datasketches/common/Family.java`
#### Snippet
```java
  private String famName_;
  private int minPreLongs_;
  private int maxPreLongs_;

  static {
```

### FieldMayBeFinal
Field `minPreLongs_` may be 'final'
in `src/main/java/org/apache/datasketches/common/Family.java`
#### Snippet
```java
  private int id_;
  private String famName_;
  private int minPreLongs_;
  private int maxPreLongs_;

```

### FieldMayBeFinal
Field `famName_` may be 'final'
in `src/main/java/org/apache/datasketches/common/Family.java`
#### Snippet
```java
  private static final Map<String, Family> lookupFamName = new HashMap<>();
  private int id_;
  private String famName_;
  private int minPreLongs_;
  private int maxPreLongs_;
```

### FieldMayBeFinal
Field `id_` may be 'final'
in `src/main/java/org/apache/datasketches/common/Family.java`
#### Snippet
```java
  private static final Map<Integer, Family> lookupID = new HashMap<>();
  private static final Map<String, Family> lookupFamName = new HashMap<>();
  private int id_;
  private String famName_;
  private int minPreLongs_;
```

### FieldMayBeFinal
Field `unionAction` may be 'final'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    private IntersectAction intersectAction;
    private AnotbAction anotbAction;
    private UnionAction unionAction;

    static {
```

### FieldMayBeFinal
Field `anotbAction` may be 'final'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    private String caseDescription;
    private IntersectAction intersectAction;
    private AnotbAction anotbAction;
    private UnionAction unionAction;

```

### FieldMayBeFinal
Field `caseDescription` may be 'final'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    private static final Map<Integer, CornerCase> caseIdToCornerCaseMap = new HashMap<>();
    private int caseId;
    private String caseDescription;
    private IntersectAction intersectAction;
    private AnotbAction anotbAction;
```

### FieldMayBeFinal
Field `intersectAction` may be 'final'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    private int caseId;
    private String caseDescription;
    private IntersectAction intersectAction;
    private AnotbAction anotbAction;
    private UnionAction unionAction;
```

### FieldMayBeFinal
Field `actionId` may be 'final'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    FULL_INTERSECT("I", "Full Intersect");

    private String actionId;
    private String actionDescription;

```

### FieldMayBeFinal
Field `actionId` may be 'final'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    FULL_ANOTB("N", "Full AnotB");

    private String actionId;
    private String actionDescription;

```

### FieldMayBeFinal
Field `actionDescription` may be 'final'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java

    private String actionId;
    private String actionDescription;

    private IntersectAction(final String actionId, final String actionDescription) {
```

### FieldMayBeFinal
Field `caseId` may be 'final'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java

    private static final Map<Integer, CornerCase> caseIdToCornerCaseMap = new HashMap<>();
    private int caseId;
    private String caseDescription;
    private IntersectAction intersectAction;
```

### FieldMayBeFinal
Field `actionDescription` may be 'final'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java

    private String actionId;
    private String actionDescription;

    private AnotbAction(final String actionId, final String actionDescription) {
```

### FieldMayBeFinal
Field `actionDescription` may be 'final'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java

    private String actionId;
    private String actionDescription;

    private UnionAction(final String actionId, final String actionDescription) {
```

### FieldMayBeFinal
Field `actionId` may be 'final'
in `src/main/java/org/apache/datasketches/thetacommon/SetOperationCornerCases.java`
#### Snippet
```java
    FULL_UNION("N", "Full Union");

    private String actionId;
    private String actionDescription;

```

### FieldMayBeFinal
Field `numItems_` may be 'final'
in `src/main/java/org/apache/datasketches/quantiles/DoublesArrayAccessor.java`
#### Snippet
```java
 */
final class DoublesArrayAccessor extends DoublesBufferAccessor {
  private int numItems_;
  private double[] buffer_;

```

### FieldMayBeFinal
Field `buffer_` may be 'final'
in `src/main/java/org/apache/datasketches/quantiles/DoublesArrayAccessor.java`
#### Snippet
```java
final class DoublesArrayAccessor extends DoublesBufferAccessor {
  private int numItems_;
  private double[] buffer_;

  private DoublesArrayAccessor(final double[] buffer) {
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/org/apache/datasketches/tuple/AnotB.java`
#### Snippet
```java
        tmpSummaryArr[countResult] = (S) (copy ? summaryArr[i].copy() : summaryArr[i]);
        countResult++;
      } else { continue; }
    }
    //Remove empty slots
```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`(0XFFL << newOffset) ^ -1L` can be replaced with '\~(0XFFL \<\< newOffset)'
in `src/main/java/org/apache/datasketches/cpc/CpcSketch.java`
#### Snippet
```java
    final PairTable table = sketch.pairTable;
    final byte[] window = sketch.slidingWindow;
    final long maskForClearingWindow = (0XFFL << newOffset) ^ -1L;
    final long maskForFlippingEarlyZone = (1L << newOffset) - 1L;
    long allSurprisesORed = 0;
```

### PointlessBitwiseExpression
`(0XFFL << offset) ^ -1L` can be replaced with '\~(0XFFL \<\< offset)'
in `src/main/java/org/apache/datasketches/cpc/CpcUnion.java`
#### Snippet
```java

    // The following works even when the offset is zero.
    final long maskForClearingWindow = (0XFFL << offset) ^ -1L;
    final long maskForFlippingEarlyZone = (1L << offset) - 1L;
    long allSurprisesORed = 0;
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `bytes` is redundant
in `src/main/java/org/apache/datasketches/theta/SetOperation.java`
#### Snippet
```java
  public static int getMaxIntersectionBytes(final int nomEntries) {
    final int nomEnt = ceilingIntPowerOf2(nomEntries);
    final int bytes = (nomEnt << 4) + (Family.INTERSECTION.getMaxPreLongs() << 3);
    return bytes;
  }
```

### UnnecessaryLocalVariable
Local variable `curCount` is redundant
in `src/main/java/org/apache/datasketches/theta/DirectCompactSketch.java`
#### Snippet
```java
    if (otherCheckForSingleItem(mem_)) { return 1; }
    final int preLongs = extractPreLongs(mem_);
    final int curCount = (preLongs == 1) ? 0 : extractCurCount(mem_);
    return curCount;
  }
```

### UnnecessaryLocalVariable
Local variable `nodes` is redundant
in `src/main/java/org/apache/datasketches/tuple/strings/ArrayOfStringsSummary.java`
#### Snippet
```java
  @Override
  public ArrayOfStringsSummary copy() {
    final ArrayOfStringsSummary nodes = new ArrayOfStringsSummary(nodesArr);
    return nodes;
  }
```

### UnnecessaryLocalVariable
Local variable `lengthBytes` is redundant
in `src/main/java/org/apache/datasketches/theta/DirectQuickSelectSketchR.java`
#### Snippet
```java
    final byte lgArrLongs = wmem_.getByte(LG_ARR_LONGS_BYTE);
    final int preLongs = wmem_.getByte(PREAMBLE_LONGS_BYTE) & 0X3F;
    final int lengthBytes = (preLongs + (1 << lgArrLongs)) << 3;
    return lengthBytes;
  }
```

### UnnecessaryLocalVariable
Local variable `cpk` is redundant
in `src/main/java/org/apache/datasketches/hllmap/CouponHashMap.java`
#### Snippet
```java
  private static final void checkMaxCouponsPerKey(final int maxCouponsPerKey) {
    checkIfIntPowerOf2(maxCouponsPerKey, "maxCouponsPerKey");
    final int cpk = maxCouponsPerKey;
    if ((cpk < 16) || (cpk > 256)) {
      throw new SketchesArgumentException(
```

### UnnecessaryLocalVariable
Local variable `newLgArrLongs` is redundant
in `src/main/java/org/apache/datasketches/thetacommon/HashOperations.java`
#### Snippet
```java
    final int upperCount = (int) Math.ceil(count / rebuild_threshold);
    final int arrLongs = max(ceilingIntPowerOf2(upperCount), 1 << ThetaUtil.MIN_LG_ARR_LONGS);
    final int newLgArrLongs = Integer.numberOfTrailingZeros(arrLongs);
    return newLgArrLongs;
  }
```

### UnnecessaryLocalVariable
Local variable `x` is redundant
in `src/main/java/org/apache/datasketches/hll/HarmonicNumbers.java`
#### Snippet
```java
      return tableOfExactHarmonicNumbers[(int) x_i];
    } else {
      final double x = x_i;
      final double invSq = 1.0 / (x * x);
      double sum = Math.log(x) + EULER_MASCHERONI_CONSTANT + (1.0 / (2.0 * x));
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `src/main/java/org/apache/datasketches/theta/AnotBimpl.java`
#### Snippet
```java
    final boolean empty = countOut == 0 && minThetaLong == Long.MAX_VALUE;

    final CompactSketch result = CompactOperations.componentsToCompact(
          minThetaLong, countOut, seedHash_, empty, true, false, dstOrdered, dstMem, hashArrOut);
    return result;
```

### UnnecessaryLocalVariable
Local variable `hashArrA` is redundant
in `src/main/java/org/apache/datasketches/theta/AnotBimpl.java`
#### Snippet
```java
    //Get skA cache as array
    final CompactSketch cskA = skA.compact(false, null); //sorting not required
    final long[] hashArrA = cskA.getCache().clone();
    return hashArrA;
  }
```

### UnnecessaryLocalVariable
Local variable `d` is redundant
in `src/main/java/org/apache/datasketches/hash/MurmurHash3Adaptor.java`
#### Snippet
```java
   */
  public static int modulo(final long h0, final long h1, final int divisor) {
    final long d = divisor;
    final long modH0 = (h0 < 0L) ? addRule(mulRule(BIT62, 2L, d), (h0 & MAX_LONG), d) : h0 % d;
    final long modH1 = (h1 < 0L) ? addRule(mulRule(BIT62, 2L, d), (h1 & MAX_LONG), d) : h1 % d;
```

### UnnecessaryLocalVariable
Local variable `csk` is redundant
in `src/main/java/org/apache/datasketches/tuple/Union.java`
#### Snippet
```java
    union(tupleSketch);
    union(thetaSketch, summary);
    final CompactSketch<S> csk = getResult(true);
    return csk;
  }
```

### UnnecessaryLocalVariable
Local variable `csk` is redundant
in `src/main/java/org/apache/datasketches/tuple/Union.java`
#### Snippet
```java
    union(tupleSketchA);
    union(tupleSketchB);
    final CompactSketch<S> csk = getResult(true);
    return csk;
  }
```

### UnnecessaryLocalVariable
Local variable `max` is redundant
in `src/main/java/org/apache/datasketches/quantiles/DoublesUtil.java`
#### Snippet
```java
   */
  static void checkDoublesSerVer(final int serVer, final int minSupportedSerVer) {
    final int max = DOUBLES_SER_VER;
    if ((serVer > max) || (serVer < minSupportedSerVer)) {
      throw new SketchesArgumentException(
```

### UnnecessaryLocalVariable
Local variable `spaceNeeded` is redundant
in `src/main/java/org/apache/datasketches/quantiles/DoublesUpdateImpl.java`
#### Snippet
```java
    assert newN >= (2L * k);
    assert numLevelsNeeded > 0;
    final int spaceNeeded = (2 + numLevelsNeeded) * k;
    return spaceNeeded;
  }
```

### UnnecessaryLocalVariable
Local variable `daR` is redundant
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/ArrayOfDoublesAnotBImpl.java`
#### Snippet
```java
    tmpHashArrA = Arrays.copyOf(tmpHashArrA, nonMatches);
    tmpValuesArrA = Arrays.copyOf(tmpValuesArrA, nonMatches * numValues);
    final DataArrays daR = new DataArrays(tmpHashArrA, tmpValuesArrA, nonMatches);
    return daR;
  }
```

### UnnecessaryLocalVariable
Local variable `prefix` is redundant
in `src/main/java/org/apache/datasketches/req/ReqCompactor.java`
#### Snippet
```java
    final int numSec = getNumSections();
    final long num = getState();
    final String prefix = String.format(
      "  C:%d Len:%d NomSz:%d SecSz:%d NumSec:%d State:%d",
           h, len, nom, secSz, numSec, num);
```

### UnnecessaryLocalVariable
Local variable `path` is redundant
in `src/main/java/org/apache/datasketches/common/Util.java`
#### Snippet
```java
      final URI uri = url.toURI();
      //decodes any special characters
      final String path = uri.isAbsolute() ? Paths.get(uri).toAbsolutePath().toString() : uri.getPath();
      return path;
    } catch (final URISyntaxException e) {
```

### UnnecessaryLocalVariable
Local variable `rowsArr` is redundant
in `src/main/java/org/apache/datasketches/frequencies/LongsSketch.java`
#### Snippet
```java
    });

    final Row[] rowsArr = rowList.toArray(new Row[rowList.size()]);
    return rowsArr;
  }
```

### UnnecessaryLocalVariable
Local variable `serVer` is redundant
in `src/main/java/org/apache/datasketches/frequencies/LongsSketch.java`
#### Snippet
```java
    final StringBuilder sb = new StringBuilder();
    //start the string with parameters of the sketch
    final int serVer = SER_VER;                 //0
    final int famID = Family.FREQUENCY.getID(); //1
    final int lgMaxMapSz = lgMaxMapSize;        //2
```

### UnnecessaryLocalVariable
Local variable `tmpSummaryArr` is redundant
in `src/main/java/org/apache/datasketches/tuple/Util.java`
#### Snippet
```java
  public static <S extends Summary> S[] newSummaryArray(final S[] summaryArr, final int length) {
    final Class<S> summaryType = (Class<S>) summaryArr.getClass().getComponentType();
    final S[] tmpSummaryArr = (S[]) Array.newInstance(summaryType, length);
    return tmpSummaryArr;
  }
```

### UnnecessaryLocalVariable
Local variable `array` is redundant
in `src/main/java/org/apache/datasketches/tuple/Util.java`
#### Snippet
```java
  public static final long[] doubleToLongArray(final double value) {
    final double d = (value == 0.0) ? 0.0 : value; // canonicalize -0.0, 0.0
    final long[] array = { Double.doubleToLongBits(d) }; // canonicalize all NaN forms
    return array;
  }
```

### UnnecessaryLocalVariable
Local variable `alpha` is redundant
in `src/main/java/org/apache/datasketches/quantiles/KolmogorovSmirnov.java`
#### Snippet
```java
    final double r1 = sketch1.getNumRetained();
    final double r2 = sketch2.getNumRetained();
    final double alpha = tgtPvalue;
    final double alphaFactor = Math.sqrt(-0.5 * Math.log(0.5 * alpha));
    final double deltaAreaThreshold = alphaFactor * Math.sqrt((r1 + r2) / (r1 * r2));
```

### UnnecessaryLocalVariable
Local variable `lgArr` is redundant
in `src/main/java/org/apache/datasketches/hll/PreambleUtil.java`
#### Snippet
```java

  static int extractLgArr(final Memory mem) {
    final int lgArr = mem.getByte(LG_ARR_BYTE) & 0XFF;
    return lgArr;
  }
```

### UnnecessaryLocalVariable
Local variable `listCount` is redundant
in `src/main/java/org/apache/datasketches/hll/PreambleUtil.java`
#### Snippet
```java

    final int hllCurMin = mem.getByte(HLL_CUR_MIN_BYTE);
    final int listCount = hllCurMin;
    final int modeByte = mem.getByte(MODE_BYTE);
    final CurMode curMode = CurMode.fromOrdinal(modeByte & 3);
```

### UnnecessaryLocalVariable
Local variable `startingLevel1` is redundant
in `src/main/java/org/apache/datasketches/kll/KllFloatsSketchSortedView.java`
#### Snippet
```java
    assert numLevels1 >= 1;
    assert numLevels2 >= numLevels1;
    final int startingLevel1 = startingLevel;
    final int startingLevel2 = startingLevel + numLevels1;
    // swap roles of src and dst
```

### UnnecessaryLocalVariable
Local variable `sk` is redundant
in `src/main/java/org/apache/datasketches/req/ReqSketchBuilder.java`
#### Snippet
```java
   */
  public ReqSketch build() {
    final ReqSketch sk = new ReqSketch(bK, bHRA, bReqDebug);
    return sk;
  }
```

### UnnecessaryLocalVariable
Local variable `k` is redundant
in `src/main/java/org/apache/datasketches/cpc/IconEstimator.java`
#### Snippet
```java
    assert lgK <= maxLgK;
    if (c < 2L) { return ((c == 0L) ? 0.0 : 1.0); }
    final int k = 1 << lgK;
    final double doubleK = k;
    final double doubleC = c;
```

### UnnecessaryLocalVariable
Local variable `doubleK` is redundant
in `src/main/java/org/apache/datasketches/cpc/IconEstimator.java`
#### Snippet
```java
    if (c < 2L) { return ((c == 0L) ? 0.0 : 1.0); }
    final int k = 1 << lgK;
    final double doubleK = k;
    final double doubleC = c;
    // Differing thresholds ensure that the approximated estimator is monotonically increasing.
```

### UnnecessaryLocalVariable
Local variable `doubleC` is redundant
in `src/main/java/org/apache/datasketches/cpc/IconEstimator.java`
#### Snippet
```java
    final int k = 1 << lgK;
    final double doubleK = k;
    final double doubleC = c;
    // Differing thresholds ensure that the approximated estimator is monotonically increasing.
    final double thresholdFactor = ((lgK < 14) ? 5.7 : 5.6);
```

### UnnecessaryLocalVariable
Local variable `table` is redundant
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
    target.windowOffset = 0;

    final PairTable table = PairTable.newInstanceFromPairsArray(pairs, nextTruePair, srcLgK);
    target.pairTable = table;
    target.slidingWindow = window;
```

### UnnecessaryLocalVariable
Local variable `table` is redundant
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
    final int[] srcPairArr = uncompressTheSurprisingValues(source);
    final int numPairs = source.numCsv;
    final PairTable table = PairTable.newInstanceFromPairsArray(srcPairArr, numPairs, source.lgK);
    target.pairTable = table;
  }
```

### UnnecessaryLocalVariable
Local variable `table` is redundant
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
        pairs[i] += 8;
      }
      final PairTable table = PairTable.newInstanceFromPairsArray(pairs, numPairs, srcLgK);
      target.pairTable = table;
    }
```

### UnnecessaryLocalVariable
Local variable `c` is redundant
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
  private static int determinePseudoPhase(final int lgK, final long numCoupons) {
    final long k = 1L << lgK;
    final long c = numCoupons;
    // This midrange logic produces pseudo-phases. They are used to select encoding tables.
    // The thresholds were chosen by hand after looking at plots of measured compression.
```

### UnnecessaryLocalVariable
Local variable `table` is redundant
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
      }

      final PairTable table = PairTable.newInstanceFromPairsArray(pairs, numPairs, srcLgK);
      target.pairTable = table;
    }
```

### UnnecessaryLocalVariable
Local variable `est` is redundant
in `src/main/java/org/apache/datasketches/cpc/CpcConfidence.java`
#### Snippet
```java
    final double rel = x / sqrt(1 << lgK);
    final double eps = kappa * rel;
    final double est = hipEstAccum;
    final double result = est / (1.0 - eps);
    return ceil(result); // widening for coverage
```

### UnnecessaryLocalVariable
Local variable `est` is redundant
in `src/main/java/org/apache/datasketches/cpc/CpcConfidence.java`
#### Snippet
```java
    final double rel = x / sqrt(1 << lgK);
    final double eps = kappa * rel;
    final double est = hipEstAccum;
    double result = est / (1.0 + eps);
    if (result < numCoupons) { result = numCoupons; }
```

### UnnecessaryLocalVariable
Local variable `lgA` is redundant
in `src/main/java/org/apache/datasketches/theta/UpdateSketch.java`
#### Snippet
```java
      final int lgArrLongs) {
    final int lgT = lgNomLongs + 1;
    final int lgA = lgArrLongs;
    final int lgR = extractLgResizeFactor(srcMem);
    if (lgR == 0) { return lgA != lgT; }
```

### UnnecessaryLocalVariable
Local variable `xp` is redundant
in `src/main/java/org/apache/datasketches/common/BoundsOnBinomialProportions.java`
#### Snippet
```java
    final double term3 = (lambda + (5.0 / 6.0)) - (2.0 / (3.0 * h));
    final double w = term1 - (term2 * term3);
    final double xp = a / (a + (b * (Math.exp(2.0 * w))));
    return xp;
  }
```

### UnnecessaryLocalVariable
Local variable `c` is redundant
in `src/main/java/org/apache/datasketches/cpc/CpcUtil.java`
#### Snippet
```java

  static int determineCorrectOffset(final int lgK, final long numCoupons) {
    final long c = numCoupons;
    final long k = (1L << lgK);
    final long tmp = (c << 3) - (19L * k); // 8C - 19K
```

### UnnecessaryLocalVariable
Local variable `c` is redundant
in `src/main/java/org/apache/datasketches/cpc/CpcUtil.java`
#### Snippet
```java

  static Flavor determineFlavor(final int lgK, final long numCoupons) {
    final long c = numCoupons;
    final long k = 1L << lgK;
    final long c2 = c << 1;
```

### UnnecessaryLocalVariable
Local variable `grpStart1` is redundant
in `src/main/java/org/apache/datasketches/quantiles/DoublesSketchSortedView.java`
#### Snippet
```java
    assert (grpLen2 >= grpLen1);

    final int grpStart1 = grpStart;
    final int grpStart2 = grpStart + grpLen1;

```

### UnnecessaryLocalVariable
Local variable `grpStart1` is redundant
in `src/main/java/org/apache/datasketches/quantiles/ItemsMergeImpl.java`
#### Snippet
```java
    assert (grpLen2 >= grpLen1);

    final int grpStart1 = grpStart;
    final int grpStart2 = grpStart + grpLen1;

```

### UnnecessaryLocalVariable
Local variable `firstSketch` is redundant
in `src/main/java/org/apache/datasketches/tuple/Intersection.java`
#### Snippet
```java

    if (firstCall) {
      final org.apache.datasketches.theta.Sketch firstSketch = thetaSketch;
      //Copy firstSketch data into local instance hashTables_
      hashTables_.fromSketch(firstSketch, summary);
```

### UnnecessaryLocalVariable
Local variable `numItems` is redundant
in `src/main/java/org/apache/datasketches/quantiles/ItemsUtil.java`
#### Snippet
```java
      sb.append(ClassicUtil.LS);
      //output all the levels
      final int numItems = combAllocCount;
      if (numItems > (2 * k)) {
        sb.append("   Valid | Level");
```

### UnnecessaryLocalVariable
Local variable `numSamplesF` is redundant
in `src/main/java/org/apache/datasketches/thetacommon/BinomialBoundsN.java`
#### Snippet
```java
    checkArgs(numSamples, theta, numSDev);
    final double ub = computeApproxBinoUB(numSamples, theta, numSDev);
    final double numSamplesF = numSamples;
    final double est = numSamplesF / theta;
    return (Math.max(est, ub));
```

### UnnecessaryLocalVariable
Local variable `nprimef` is redundant
in `src/main/java/org/apache/datasketches/thetacommon/BinomialBoundsN.java`
#### Snippet
```java
      // We know that est <= 360, so specialNPrimeF() shouldn't be ridiculously slow.
      final double delta = deltaOfNumSDev[numSDev];
      final long nprimef = specialNPrimeF(numSamplesI, theta, delta);
      return (nprimef); // don't need to round
    }
```

### UnnecessaryLocalVariable
Local variable `nstar` is redundant
in `src/main/java/org/apache/datasketches/thetacommon/BinomialBoundsN.java`
#### Snippet
```java
      // We know that est <= 360, so specialNStar() shouldn't be ridiculously slow.
      final double delta = deltaOfNumSDev[numSDev];
      final long nstar = specialNStar(numSamplesI, theta, delta);
      return (nstar); // don't need to round
    }
```

### UnnecessaryLocalVariable
Local variable `numSamplesF` is redundant
in `src/main/java/org/apache/datasketches/thetacommon/BinomialBoundsN.java`
#### Snippet
```java
    checkArgs(numSamples, theta, numSDev);
    final double lb = computeApproxBinoLB(numSamples, theta, numSDev);
    final double numSamplesF = numSamples;
    final double est = numSamplesF / theta;
    return (Math.min(est, Math.max(numSamplesF, lb)));
```

### UnnecessaryLocalVariable
Local variable `startingLevel1` is redundant
in `src/main/java/org/apache/datasketches/kll/KllDoublesSketchSortedView.java`
#### Snippet
```java
    assert numLevels1 >= 1;
    assert numLevels2 >= numLevels1;
    final int startingLevel1 = startingLevel;
    final int startingLevel2 = startingLevel + numLevels1;
    // swap roles of src and dst
```

### UnnecessaryLocalVariable
Local variable `hyperEst` is redundant
in `src/main/java/org/apache/datasketches/hll/HllEstimators.java`
#### Snippet
```java
    else if (lgConfigK == 6) { correctionFactor = 0.709; }
    else { correctionFactor = 0.7213 / (1.0 + (1.079 / configK)); }
    final double hyperEst = (correctionFactor * configK * configK) / kxqSum;
    return hyperEst;
  }
```

### UnnecessaryLocalVariable
Local variable `curCount` is redundant
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
    if (curCount_ > 0) {
      if (valid && isDirty()) {
        final int curCount = HashOperations.countPart(getCache(), getLgArrLongs(), getThetaLong());
        return curCount;
      }
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/org/apache/datasketches/theta/ConcurrentDirectQuickSelectSketch.java`
#### Snippet
```java
      executorService_.shutdown();
      while (!executorService_.awaitTermination(1, TimeUnit.MILLISECONDS)) {
        Thread.sleep(1);
      }
    } catch (final InterruptedException e) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/org/apache/datasketches/theta/ConcurrentHeapQuickSelectSketch.java`
#### Snippet
```java
      executorService_.shutdown();
      while (!executorService_.awaitTermination(1, TimeUnit.MILLISECONDS)) {
        Thread.sleep(1);
      }
    } catch (final InterruptedException e) {
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`isNovel == true` can be simplified to 'isNovel'
in `src/main/java/org/apache/datasketches/cpc/CpcSketch.java`
#### Snippet
```java
        final int rowCol = (i << 6) | col;
        final boolean isNovel = PairTable.maybeInsert(table, rowCol);
        assert isNovel == true;
      }
    }
```

### PointlessBooleanExpression
`isNovel == true` can be simplified to 'isNovel'
in `src/main/java/org/apache/datasketches/cpc/CpcSketch.java`
#### Snippet
```java
          // cannot use Table.mustInsert(), because it doesn't provide for growth
          final boolean isNovel = PairTable.maybeInsert(newTable, rowCol);
          assert (isNovel == true);
        }
      }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `pre0_` initializer `0` is redundant
in `src/main/java/org/apache/datasketches/theta/SingleItemSketch.java`
#### Snippet
```java

  private static final long PRE0_LO6_SI   = 0X00_00_3A_00_00_03_03_01L; //with SI flag
  private long pre0_ = 0;
  private long hash_ = 0;

```

### UnusedAssignment
Variable `hash_` initializer `0` is redundant
in `src/main/java/org/apache/datasketches/theta/SingleItemSketch.java`
#### Snippet
```java
  private static final long PRE0_LO6_SI   = 0X00_00_3A_00_00_03_03_01L; //with SI flag
  private long pre0_ = 0;
  private long hash_ = 0;

  //Internal Constructor. All checking & hashing has been done, assumes default seed
```

### UnusedAssignment
Variable `nodesArr` initializer `null` is redundant
in `src/main/java/org/apache/datasketches/tuple/strings/ArrayOfStringsSummary.java`
#### Snippet
```java
public class ArrayOfStringsSummary implements UpdatableSummary<String[]> {

  private String[] nodesArr = null;

  ArrayOfStringsSummary() { //required for ArrayOfStringsSummaryFactory
```

### UnusedAssignment
Variable `hllSketchImpl` initializer `null` is redundant
in `src/main/java/org/apache/datasketches/hll/Union.java`
#### Snippet
```java
    final int bit4 = (srcLgK > lgMaxK) ? 16 : 0;
    final int sw = bit4 | bit3 | bits1_2 | bit0;
    HllSketchImpl hllSketchImpl = null; //never returned as null

    switch (sw) {
```

### UnusedAssignment
Variable `f` initializer `0` is redundant
in `src/main/java/org/apache/datasketches/hll/RelativeErrorTables.java`
#### Snippet
```java
    final int idx = ((lgK - 4) * 3) + (stdDev - 1);
    final int sw = (oooFlag ? 2 : 0) | (upperBound ? 1 : 0);
    double f = 0;
    switch (sw) {
      case 0 : { //HIP, LB
```

### UnusedAssignment
The value `invPow2(newValue)` assigned to `kxq0` is never used
in `src/main/java/org/apache/datasketches/hll/AbstractHllArray.java`
#### Snippet
```java
    if (oldValue < 32) { host.putKxQ0(kxq0 -= invPow2(oldValue)); }
    else               { host.putKxQ1(kxq1 -= invPow2(oldValue)); }
    if (newValue < 32) { host.putKxQ0(kxq0 += invPow2(newValue)); }
    else               { host.putKxQ1(kxq1 += invPow2(newValue)); }
  }
```

### UnusedAssignment
The value `invPow2(newValue)` assigned to `kxq1` is never used
in `src/main/java/org/apache/datasketches/hll/AbstractHllArray.java`
#### Snippet
```java
    else               { host.putKxQ1(kxq1 -= invPow2(oldValue)); }
    if (newValue < 32) { host.putKxQ0(kxq0 += invPow2(newValue)); }
    else               { host.putKxQ1(kxq1 += invPow2(newValue)); }
  }
}
```

### UnusedAssignment
Variable `uncSk` initializer `null` is redundant
in `src/main/java/org/apache/datasketches/cpc/CompressionCharacterization.java`
#### Snippet
```java
      for (int trial = 0; trial < trialsPerWave; trial++) {
        final CompressedState state = compressedStates2[trial];
        CpcSketch uncSk = null;
        uncSk = CpcSketch.uncompress(state, ThetaUtil.DEFAULT_UPDATE_SEED);
        unCompressedSketches[trial] = uncSk;
```

### UnusedAssignment
The value `nanoEnd` assigned to `nanoStart` is never used
in `src/main/java/org/apache/datasketches/cpc/CompressionCharacterization.java`
#### Snippet
```java
      nanoEnd = System.nanoTime();
      sumEqu_nS += nanoEnd - nanoStart;
      nanoStart = nanoEnd;

    } // end wave loop
```

### UnusedAssignment
Variable `numKeys` initializer `0` is redundant
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/HashTables.java`
#### Snippet
```java
  private int numValues = 0;
  private int lgTableSize = 0;
  private int numKeys = 0;

  //Construct from sketch
```

### UnusedAssignment
Variable `valueTable` initializer `null` is redundant
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/HashTables.java`
#### Snippet
```java
class HashTables {
  private long[] hashTable = null;
  private double[][] valueTable = null;
  private int numValues = 0;
  private int lgTableSize = 0;
```

### UnusedAssignment
Variable `numValues` initializer `0` is redundant
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/HashTables.java`
#### Snippet
```java
  private long[] hashTable = null;
  private double[][] valueTable = null;
  private int numValues = 0;
  private int lgTableSize = 0;
  private int numKeys = 0;
```

### UnusedAssignment
Variable `lgTableSize` initializer `0` is redundant
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/HashTables.java`
#### Snippet
```java
  private double[][] valueTable = null;
  private int numValues = 0;
  private int lgTableSize = 0;
  private int numKeys = 0;

```

### UnusedAssignment
Variable `hashTable` initializer `null` is redundant
in `src/main/java/org/apache/datasketches/tuple/arrayofdoubles/HashTables.java`
#### Snippet
```java

class HashTables {
  private long[] hashTable = null;
  private double[][] valueTable = null;
  private int numValues = 0;
```

### UnusedAssignment
Variable `setOp` initializer `null` is redundant
in `src/main/java/org/apache/datasketches/theta/SetOperationBuilder.java`
#### Snippet
```java
   */
  public SetOperation build(final Family family, final WritableMemory dstMem) {
    SetOperation setOp = null;
    switch (family) {
      case UNION: {
```

### UnusedAssignment
Variable `levelsBytes` initializer `0` is redundant
in `src/main/java/org/apache/datasketches/kll/KllSketch.java`
#### Snippet
```java
      final SketchType sketchType, final boolean updatableMemFormat) {
    final int typeBytes = (sketchType == DOUBLES_SKETCH) ? Double.BYTES : Float.BYTES;
    int levelsBytes = 0;
    if (updatableMemFormat) {
      levelsBytes = (numLevels + 1) * Integer.BYTES;
```

### UnusedAssignment
Variable `offsetBytes` initializer `0` is redundant
in `src/main/java/org/apache/datasketches/kll/KllPreambleUtil.java`
#### Snippet
```java
      sb.append(LS);
      sb.append("### START KLL DATA:").append(LS);
      int offsetBytes = 0;

      if (updatableMemFormat) {
```

### UnusedAssignment
Variable `bK` initializer `DEFAULT_K` is redundant
in `src/main/java/org/apache/datasketches/req/ReqSketchBuilder.java`
#### Snippet
```java
public class ReqSketchBuilder {
  private final static int DEFAULT_K = 12;
  private int bK = DEFAULT_K;
  private boolean bHRA;
  private ReqDebug bReqDebug;
```

### UnusedAssignment
Variable `byteIndex` initializer `0` is redundant
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
      final long numCompressedWords) { // input

    int byteIndex = 0;
    int nextWordIndex = 0;
    long bitBuf = 0;
```

### UnusedAssignment
Variable `pairIndex` initializer `0` is redundant
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
      final long numCompressedWords) { // input

    int pairIndex = 0;

    final long[] ptrArr = new long[3];
```

### UnusedAssignment
Variable `pairIndex` initializer `0` is redundant
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
      final int[] compressedWords) { // output

    int pairIndex = 0;

    final long[] ptrArr = new long[3];
```

### UnusedAssignment
Variable `rowIndex` initializer `0` is redundant
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
    final int outputLength = emptySpace + numPairsToGet;
    final int[] pairs = new int[outputLength];
    int rowIndex = 0;
    int pairIndex = emptySpace;
    for (rowIndex = 0; rowIndex < k; rowIndex++) {
```

### UnusedAssignment
Variable `updatableMemFormat` initializer `false` is redundant
in `src/main/java/org/apache/datasketches/kll/KllMemoryValidate.java`
#### Snippet
```java
  final boolean level0Sorted;
  final boolean doublesSketch;
  boolean updatableMemFormat = false;
  final boolean readOnly;
  final int k;
```

### UnusedAssignment
Variable `sketch` initializer `null` is redundant
in `src/main/java/org/apache/datasketches/theta/UpdateSketchBuilder.java`
#### Snippet
```java
   */
  public UpdateSketch build(final WritableMemory dstMem) {
    UpdateSketch sketch = null;
    switch (bFam) {
      case ALPHA: {
```

### UnusedAssignment
Variable `hllSketchImpl` initializer `null` is redundant
in `src/main/java/org/apache/datasketches/hll/HllSketch.java`
#### Snippet
```java

  private static final String LS = System.getProperty("line.separator");
  HllSketchImpl hllSketchImpl = null;

  /**
```

### UnusedAssignment
Variable `reqBytesIn` initializer `8` is redundant
in `src/main/java/org/apache/datasketches/theta/ForwardCompatibility.java`
#### Snippet
```java
      throw new SketchesArgumentException("Family (Sketch Type) must be 1 to 4: " + familyId);
    }
    int reqBytesIn = 8;
    int curCount = 0;
    long thetaLong = Long.MAX_VALUE;
```

### UnusedAssignment
Variable `curCount` initializer `0` is redundant
in `src/main/java/org/apache/datasketches/theta/ForwardCompatibility.java`
#### Snippet
```java
    }
    int reqBytesIn = 8;
    int curCount = 0;
    long thetaLong = Long.MAX_VALUE;
    if (preLongs == 1) {
```

### UnusedAssignment
Variable `numSv` initializer `0` is redundant
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java

    long numCoupons = 0;
    long numSv = 0;
    long winOffset = 0;
    long svLengthInts = 0;
```

### UnusedAssignment
Variable `winOffset` initializer `0` is redundant
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
    long numCoupons = 0;
    long numSv = 0;
    long winOffset = 0;
    long svLengthInts = 0;
    long wLengthInts = 0;
```

### UnusedAssignment
Variable `kxp` initializer `0` is redundant
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
    long svLengthInts = 0;
    long wLengthInts = 0;
    double kxp = 0;
    double hipAccum = 0;
    long svStreamStart = 0;
```

### UnusedAssignment
Variable `hipAccum` initializer `0` is redundant
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
    long wLengthInts = 0;
    double kxp = 0;
    double hipAccum = 0;
    long svStreamStart = 0;
    long wStreamStart = 0;
```

### UnusedAssignment
The value changed at `off++` is never used
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 7] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 7] |= Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 7] |= Byte.toUnsignedLong(buf[off++]);
  }

```

### UnusedAssignment
The value changed at `off++` is never used
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 7] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 7] |= Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 7] |= Byte.toUnsignedLong(buf[off++]);
  }

```

### UnusedAssignment
The value changed at `off++` is never used
in `src/main/java/org/apache/datasketches/theta/BitPacking.java`
#### Snippet
```java
    values[i + 7] |= Byte.toUnsignedLong(buf[off++]) << 16;
    values[i + 7] |= Byte.toUnsignedLong(buf[off++]) << 8;
    values[i + 7] |= Byte.toUnsignedLong(buf[off++]);
  }

```

## RuleId[id=ConstantValue]
### ConstantValue
Value `dstCompact` is always 'false'
in `src/main/java/org/apache/datasketches/hll/ToByteArrayImpl.java`
#### Snippet
```java
        final WritableMemory memOut = WritableMemory.writableWrap(byteArrOut);
        copyCommonListAndSet(impl, memOut);
        insertCompactFlag(memOut, dstCompact);

        final int[] tgtCouponIntArr = new int[srcCouponArrInts];
```

### ConstantValue
Value `dstCompact` is always 'true'
in `src/main/java/org/apache/datasketches/hll/ToByteArrayImpl.java`
#### Snippet
```java
        final WritableMemory memOut = WritableMemory.writableWrap(byteArrOut);
        copyCommonListAndSet(impl, memOut);
        insertCompactFlag(memOut, dstCompact);

        final PairIterator itr = impl.iterator();
```

### ConstantValue
Result of `offset - 0` is always '0'
in `src/main/java/org/apache/datasketches/hll/CubicInterpolation.java`
#### Snippet
```java

    if (offset == 0) { /* corner case */
      return (interpolateUsingXArrAndYStride(xArr, yStride, (offset - 0), x));
    }
    else if (offset == xArrLenM2) { /* corner case */
```

### ConstantValue
Condition `curCount == 1` is always `true`
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
    //do some basic checks ...
    if (srcEmptyFlag)  { assert (curCount == 0) && (thetaLong == Long.MAX_VALUE); }
    if (single) { assert (curCount == 1) && (thetaLong == Long.MAX_VALUE); }
    checkFamilyAndFlags(srcFamId, srcCompactFlag, srcReadOnlyFlag);

```

### ConstantValue
Value `srcEmptyFlag` is always 'false'
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
      return new DirectCompactSketch(tgtMem);
    } else { //heap
      return new HeapCompactSketch(hashArr, srcEmptyFlag, srcSeedHash, curCount, thetaLong,
          dstOrderedOut);
    }
```

### ConstantValue
Value `empty` is always 'false'
in `src/main/java/org/apache/datasketches/theta/CompactOperations.java`
#### Snippet
```java
        return new SingleItemSketch(hashArrOut[0], seedHash);
      }
      return new HeapCompactSketch(hashArrOut, empty, seedHash, curCount, thetaLong, dstOrderedOut);
    }
  }
```

### ConstantValue
Condition `reqDebug != null` is always `false`
in `src/main/java/org/apache/datasketches/req/ReqCompactor.java`
#### Snippet
```java
   */
  FloatBuffer compact(final CompactorReturn cReturn, final Random rand) {
    if (reqDebug != null) { reqDebug.emitCompactingStart(lgWeight); }
    final int startRetItems = buf.getCount();
    final int startNomCap = getNomCapacity();
```

### ConstantValue
Condition `reqDebug != null` is always `false`
in `src/main/java/org/apache/datasketches/req/ReqCompactor.java`
#### Snippet
```java
    final FloatBuffer promote = buf.getEvensOrOdds(compactionStart, compactionEnd, coin);

    if (reqDebug != null) {
      reqDebug.emitCompactionDetail(compactionStart, compactionEnd, secsToCompact,
          promote.getCount(), coin);
```

### ConstantValue
Condition `reqDebug != null` is always `false`
in `src/main/java/org/apache/datasketches/req/ReqCompactor.java`
#### Snippet
```java
    cReturn.deltaRetItems = buf.getCount() - startRetItems + promote.getCount();
    cReturn.deltaNomSize = getNomCapacity() - startNomCap;
    if (reqDebug != null) { reqDebug.emitCompactionDone(lgWeight); }
    return promote;
  } //End Compact
```

### ConstantValue
Condition `reqDebug != null` is always `false`
in `src/main/java/org/apache/datasketches/req/ReqCompactor.java`
#### Snippet
```java
      numSections <<= 1;
      buf.ensureCapacity(2 * getNomCapacity());
      if (reqDebug != null) { reqDebug.emitAdjSecSizeNumSec(lgWeight); }
      return true;
    }
```

### ConstantValue
Value `srcCompact` is always 'true'
in `src/main/java/org/apache/datasketches/theta/IntersectionImpl.java`
#### Snippet
```java
      srcOrdered = false; //hashTable, even tho empty
      return CompactOperations.componentsToCompact(
          thetaLong_, curCount_, seedHash_, empty_, srcCompact, srcOrdered, dstOrdered,
          dstMem, compactCache);
    }
```

### ConstantValue
Value `srcOrdered` is always 'false'
in `src/main/java/org/apache/datasketches/theta/IntersectionImpl.java`
#### Snippet
```java
      srcOrdered = false; //hashTable, even tho empty
      return CompactOperations.componentsToCompact(
          thetaLong_, curCount_, seedHash_, empty_, srcCompact, srcOrdered, dstOrdered,
          dstMem, compactCache);
    }
```

### ConstantValue
Value `srcCompact` is always 'true'
in `src/main/java/org/apache/datasketches/theta/IntersectionImpl.java`
#### Snippet
```java
    srcOrdered = dstOrdered;
    return CompactOperations.componentsToCompact(
        thetaLong_, curCount_, seedHash_, empty_, srcCompact, srcOrdered, dstOrdered,
        dstMem, compactCache);
  }
```

### ConstantValue
Condition `col >= sketch.windowOffset` is always `true`
in `src/main/java/org/apache/datasketches/cpc/CpcSketch.java`
#### Snippet
```java
    }
    else if (col < (sketch.windowOffset + 8)) { // track the 8 bits inside the window
      assert (col >= sketch.windowOffset);
      final int row = rowCol >>> 6;
      final byte oldBits = sketch.slidingWindow[row];
```

### ConstantValue
Condition `(trailingZeros >= 0) && (trailingZeros <= 8)` is always `true`
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
      trailingZeros = Math.min(8, Integer.numberOfTrailingZeros(peek8));

      assert ((trailingZeros >= 0) && (trailingZeros <= 8)) : "TZ+ " + trailingZeros;

      if (trailingZeros == 8) { // The codeword was partial, so read some more.
```

### ConstantValue
Condition `trailingZeros >= 0` is always `true`
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
      trailingZeros = Math.min(8, Integer.numberOfTrailingZeros(peek8));

      assert ((trailingZeros >= 0) && (trailingZeros <= 8)) : "TZ+ " + trailingZeros;

      if (trailingZeros == 8) { // The codeword was partial, so read some more.
```

### ConstantValue
Condition `trailingZeros <= 8` is always `true` when reached
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
      trailingZeros = Math.min(8, Integer.numberOfTrailingZeros(peek8));

      assert ((trailingZeros >= 0) && (trailingZeros <= 8)) : "TZ+ " + trailingZeros;

      if (trailingZeros == 8) { // The codeword was partial, so read some more.
```

### ConstantValue
Condition `col >= 0` is always `true`
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
        //   new = ((old - (offset+8)) + 64) mod 64
        col = ((col + 56) - offset) & 63;
        assert (col >= 0) && (col < 56);
        // then apply the permutation
        col = permutation[col];
```

### ConstantValue
Condition `remaining <= 15` is always `true` when reached
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
    }

    assert (remaining >= 0) && (remaining <= 15);

    final long theUnaryCode = 1L << remaining; //must be a long
```

### ConstantValue
Condition `(phase >= 0) && (phase < 16)` is always `true`
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
      final long tmp = c >>> (lgK - 4);
      final int phase = (int) (tmp & 15L);
      assert (phase >= 0) && (phase < 16);
      return phase;
    }
```

### ConstantValue
Condition `phase >= 0` is always `true`
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
      final long tmp = c >>> (lgK - 4);
      final int phase = (int) (tmp & 15L);
      assert (phase >= 0) && (phase < 16);
      return phase;
    }
```

### ConstantValue
Condition `phase < 16` is always `true` when reached
in `src/main/java/org/apache/datasketches/cpc/CpcCompression.java`
#### Snippet
```java
      final long tmp = c >>> (lgK - 4);
      final int phase = (int) (tmp & 15L);
      assert (phase >= 0) && (phase < 16);
      return phase;
    }
```

### ConstantValue
Condition `other != null` is always `true`
in `src/main/java/org/apache/datasketches/quantiles/ItemsUnion.java`
#### Snippet
```java
      case 1: ret = myQS; break;
      case 2: { //myQS = null,  other = valid; stream or downsample to myMaxK
        assert other != null;
        if (!other.isEstimationMode()) { //other is exact, stream items in
          ret = ItemsSketch.getInstance(other.getSketchType(), myMaxK, comparator);
```

### ConstantValue
Condition `other != null` is always `true`
in `src/main/java/org/apache/datasketches/quantiles/ItemsUnion.java`
#### Snippet
```java
      }
      case 3: { //myQS = empty/valid, other = valid; merge
        assert other != null;
        assert myQS != null;
        if (!other.isEstimationMode()) { //other is exact, stream items in
```

### ConstantValue
Condition `myQS != null` is always `true`
in `src/main/java/org/apache/datasketches/quantiles/ItemsUnion.java`
#### Snippet
```java
      case 3: { //myQS = empty/valid, other = valid; merge
        assert other != null;
        assert myQS != null;
        if (!other.isEstimationMode()) { //other is exact, stream items in
          ret = myQS;
```

### ConstantValue
Condition `other != null` is always `true`
in `src/main/java/org/apache/datasketches/quantiles/ItemsUnion.java`
#### Snippet
```java
      }
      case 4: {
        assert other != null;
        ret = ItemsSketch.getInstance(other.getSketchType(), Math.min(myMaxK, other.getK()), comparator);
        break;
```

### ConstantValue
Value `empty` is always 'true'
in `src/main/java/org/apache/datasketches/theta/Intersection.java`
#### Snippet
```java
      if (curCount != 0) {
        throw new SketchesArgumentException(
            "srcMem empty state inconsistent with curCount: " + empty + "," + curCount);
      }
      //empty = true AND curCount_ = 0: OK
```

### ConstantValue
Condition `fetched == -1` is always `true`
in `src/main/java/org/apache/datasketches/cpc/PairTable.java`
#### Snippet
```java
    if (fetched == item) { throw new SketchesStateException("PairTable mustInsert() failed"); }
    else {
      assert (fetched == -1);
      arr[probe] = item;
      // counts and resizing must be handled by the caller.
```

### ConstantValue
Condition `fetched == item` is always `true`
in `src/main/java/org/apache/datasketches/cpc/PairTable.java`
#### Snippet
```java
    if (fetched == -1) { return false; }
    else {
      assert (fetched == item);
      // delete the item
      arr[probe] = -1;
```

### ConstantValue
Condition `fetched == -1` is always `true`
in `src/main/java/org/apache/datasketches/cpc/PairTable.java`
#### Snippet
```java
    if (fetched == item) { return false; }
    else {
      assert (fetched == -1);
      arr[probe] = item;
      table.numPairs += 1;
```

### ConstantValue
Condition `grpLen1 >= 1` is always `true`
in `src/main/java/org/apache/datasketches/quantiles/DoublesSketchSortedView.java`
#### Snippet
```java
    final int grpLen1 = grpLen / 2;
    final int grpLen2 = grpLen - grpLen1;
    assert (grpLen1 >= 1);
    assert (grpLen2 >= grpLen1);

```

### ConstantValue
Condition `other != null` is always `true`
in `src/main/java/org/apache/datasketches/quantiles/DoublesUnionImpl.java`
#### Snippet
```java
      case 1: ret = myQS; break; //no-op
      case 2: { //myQS = null,  other = valid; stream or downsample to myMaxK
        assert other != null;
        if (!other.isEstimationMode()) { //other is exact, stream items in
          ret = HeapUpdateDoublesSketch.newInstance(myMaxK);
```

### ConstantValue
Condition `other != null` is always `true`
in `src/main/java/org/apache/datasketches/quantiles/DoublesUnionImpl.java`
#### Snippet
```java
      }
      case 3: { //myQS = empty/valid, other = valid; merge
        assert other != null;
        assert myQS != null;
        if (!other.isEstimationMode()) { //other is exact, stream items in
```

### ConstantValue
Condition `myQS != null` is always `true`
in `src/main/java/org/apache/datasketches/quantiles/DoublesUnionImpl.java`
#### Snippet
```java
      case 3: { //myQS = empty/valid, other = valid; merge
        assert other != null;
        assert myQS != null;
        if (!other.isEstimationMode()) { //other is exact, stream items in
          ret = myQS;
```

### ConstantValue
Condition `grpLen1 >= 1` is always `true`
in `src/main/java/org/apache/datasketches/quantiles/ItemsMergeImpl.java`
#### Snippet
```java
    final int grpLen1 = grpLen / 2;
    final int grpLen2 = grpLen - grpLen1;
    assert (grpLen1 >= 1);
    assert (grpLen2 >= grpLen1);

```

### ConstantValue
Value `compact` is always 'true'
in `src/main/java/org/apache/datasketches/hll/DirectHll4Array.java`
#### Snippet
```java
      final AuxHashMap auxHashMap;
      if (compact) {
        auxHashMap = HeapAuxHashMap.heapify(mem, auxStart, lgConfigK, auxCount, compact);
      } else {
        auxHashMap =  new DirectAuxHashMap(this, false); //not compact
```

### ConstantValue
Condition `curTableHash == 0` is always `true`
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
          return RejectedDuplicate; // duplicate, just return
        }
        assert (curTableHash == 0); // must be zero
        // Now that we know there are no duplicates we can
        // go back and insert at first garbage value position
```

### ConstantValue
Condition `curTableHash < thetaLong_` is always `true`
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
      // curTableHash was not a duplicate, not zero, and NOT garbage,
      // so we keep searching
      assert (curTableHash < thetaLong_);
      curProbe = (curProbe + stride) & arrayMask;
      curTableHash = hashTable[curProbe];
```

### ConstantValue
Condition `curTableHash == 0` is always `true`
in `src/main/java/org/apache/datasketches/theta/HeapAlphaSketch.java`
#### Snippet
```java
    }
    // must be zero, so insert and increment
    assert (curTableHash == 0);
    hashTable[curProbe] = hash;
    thetaLong_ = (long) (thetaLong_ * alpha_); //decrement theta
```

### ConstantValue
Result of `format.ordinal() << 2` is always '0'
in `src/main/java/org/apache/datasketches/cpc/PreambleUtil.java`
#### Snippet
```java
    final byte preInts = getDefinedPreInts(format);
    final byte fiCol = (byte) 0;
    final byte flags = (byte) ((format.ordinal() << 2) | COMPRESSED_FLAG_MASK);
    checkCapacity(wmem.getCapacity(), 8);
    putFirst8(wmem, preInts, (byte) lgK, fiCol, flags, seedHash);
```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `epoch_`
in `src/main/java/org/apache/datasketches/theta/ConcurrentDirectQuickSelectSketch.java`
#### Snippet
```java
    // this increment of a volatile field is done within the scope of the propagation
    // synchronization and hence is done by a single thread.
    epoch_++;
    endPropagation(null, true);
    initBgPropagationService();
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `epoch_`
in `src/main/java/org/apache/datasketches/theta/ConcurrentHeapQuickSelectSketch.java`
#### Snippet
```java
    // synchronization and hence is done by a single thread
    // Ignore a FindBugs warning
    epoch_++;
    endPropagation(null, true);
    initBgPropagationService();
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/theta/Sketch.java`
#### Snippet
```java
          }
          if (hexMode) {
            sb.append(" " + zeroPad(Long.toHexString(h), 16) + ",");
          }
          else {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/theta/Sketch.java`
#### Snippet
```java
          j++ ;
        }
        sb.append(LS).append("### END DATA DETAIL").append(LS + LS);
      }
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/quantiles/DoublesUtil.java`
#### Snippet
```java
    sb.append("   N                            : ").append(nStr).append(LS);
    sb.append("   Levels (Needed, Total, Valid): ")
      .append(neededLevels + ", " + totalLevels + ", " + validLevels).append(LS);
    sb.append("   Level Bit Pattern            : ")
      .append(Long.toBinaryString(bitPattern)).append(LS);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/frequencies/LongsSketch.java`
#### Snippet
```java
    final StringBuilder sb = new StringBuilder();
    sb.append("FrequentLongsSketch:").append(LS);
    sb.append("  Stream Length    : " + streamWeight).append(LS);
    sb.append("  Max Error Offset : " + offset).append(LS);
    sb.append(hashMap.toString());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/frequencies/LongsSketch.java`
#### Snippet
```java
    sb.append("FrequentLongsSketch:").append(LS);
    sb.append("  Stream Length    : " + streamWeight).append(LS);
    sb.append("  Max Error Offset : " + offset).append(LS);
    sb.append(hashMap.toString());
    return sb.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/frequencies/ItemsSketch.java`
#### Snippet
```java
    final StringBuilder sb = new StringBuilder();
    sb.append("FrequentItemsSketch<T>:").append(LS);
    sb.append("  Stream Length    : " + streamWeight).append(LS);
    sb.append("  Max Error Offset : " + offset).append(LS);
    sb.append(hashMap.toString());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/frequencies/ItemsSketch.java`
#### Snippet
```java
    sb.append("FrequentItemsSketch<T>:").append(LS);
    sb.append("  Stream Length    : " + streamWeight).append(LS);
    sb.append("  Max Error Offset : " + offset).append(LS);
    sb.append(hashMap.toString());
    return sb.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/theta/PreambleUtil.java`
#### Snippet
```java
    sb.append("Native Byte Order             : ").append(nativeOrder).append(LS);
    sb.append("Byte  0: Preamble Longs       : ").append(preLongs).append(LS);
    sb.append("Byte  0: ResizeFactor         : ").append(rfId + ", " + rf.toString()).append(LS);
    sb.append("Byte  1: Serialization Version: ").append(serVer).append(LS);
    sb.append("Byte  2: Family               : ").append(familyId + ", " + family.toString()).append(LS);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/theta/PreambleUtil.java`
#### Snippet
```java
    sb.append("Byte  0: ResizeFactor         : ").append(rfId + ", " + rf.toString()).append(LS);
    sb.append("Byte  1: Serialization Version: ").append(serVer).append(LS);
    sb.append("Byte  2: Family               : ").append(familyId + ", " + family.toString()).append(LS);
    sb.append("Byte  3: LgNomLongs           : ").append(lgNomLongs).append(LS);
    sb.append("Byte  4: LgArrLongs           : ").append(lgArrLongs).append(LS);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/kll/KllPreambleUtil.java`
#### Snippet
```java
        offsetBytes = DATA_START_ADR;
        for (int i = 0; i < numLevels + 1; i++) {
          sb.append(i + ", " + mem.getInt(offsetBytes)).append(LS);
          offsetBytes += Integer.BYTES;
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/kll/KllPreambleUtil.java`
#### Snippet
```java
        if (doublesSketch) {
          for (int i = 0; i < itemsSpace; i++) {
            sb.append(i + ", " + mem.getDouble(offsetBytes)).append(LS);
            offsetBytes += typeBytes;
          }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/kll/KllPreambleUtil.java`
#### Snippet
```java
        offsetBytes = DATA_START_ADR;
        for (int i = 0; i < numLevels; i++) {
          sb.append(i + ", " + mem.getInt(offsetBytes)).append(LS);
          offsetBytes += Integer.BYTES;
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/kll/KllPreambleUtil.java`
#### Snippet
```java
        if (doublesSketch) {
          for (int i = 0; i < itemSpace; i++) {
            sb.append(i + ", " + mem.getDouble(offsetBytes)).append(LS);
            offsetBytes += typeBytes;
          }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/kll/KllPreambleUtil.java`
#### Snippet
```java
        } else { //floats
          for (int i = 0; i < itemSpace; i++) {
            sb.append(i + ", " + mem.getFloat(offsetBytes)).append(LS);
            offsetBytes += typeBytes;
          }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/req/ReqSketch.java`
#### Snippet
```java
    final StringBuilder sb = new StringBuilder();
    sb.append("**********Relative Error Quantiles Sketch Summary**********").append(LS);
    sb.append("  K               : " + k).append(LS);
    sb.append("  N               : " + totalN).append(LS);
    sb.append("  Retained Items  : " + retItems).append(LS);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/req/ReqSketch.java`
#### Snippet
```java
    sb.append("**********Relative Error Quantiles Sketch Summary**********").append(LS);
    sb.append("  K               : " + k).append(LS);
    sb.append("  N               : " + totalN).append(LS);
    sb.append("  Retained Items  : " + retItems).append(LS);
    sb.append("  Min Item        : " + minItem).append(LS);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/req/ReqSketch.java`
#### Snippet
```java
    sb.append("  K               : " + k).append(LS);
    sb.append("  N               : " + totalN).append(LS);
    sb.append("  Retained Items  : " + retItems).append(LS);
    sb.append("  Min Item        : " + minItem).append(LS);
    sb.append("  Max Item        : " + maxItem).append(LS);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/req/ReqSketch.java`
#### Snippet
```java
    sb.append("  N               : " + totalN).append(LS);
    sb.append("  Retained Items  : " + retItems).append(LS);
    sb.append("  Min Item        : " + minItem).append(LS);
    sb.append("  Max Item        : " + maxItem).append(LS);
    sb.append("  Estimation Mode : " + isEstimationMode()).append(LS);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/req/ReqSketch.java`
#### Snippet
```java
    sb.append("  Retained Items  : " + retItems).append(LS);
    sb.append("  Min Item        : " + minItem).append(LS);
    sb.append("  Max Item        : " + maxItem).append(LS);
    sb.append("  Estimation Mode : " + isEstimationMode()).append(LS);
    sb.append("  High Rank Acc   : " + hra).append(LS);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/req/ReqSketch.java`
#### Snippet
```java
    sb.append("  Min Item        : " + minItem).append(LS);
    sb.append("  Max Item        : " + maxItem).append(LS);
    sb.append("  Estimation Mode : " + isEstimationMode()).append(LS);
    sb.append("  High Rank Acc   : " + hra).append(LS);
    sb.append("  Levels          : " + compactors.size()).append(LS);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/req/ReqSketch.java`
#### Snippet
```java
    sb.append("  Max Item        : " + maxItem).append(LS);
    sb.append("  Estimation Mode : " + isEstimationMode()).append(LS);
    sb.append("  High Rank Acc   : " + hra).append(LS);
    sb.append("  Levels          : " + compactors.size()).append(LS);
    sb.append("************************End Summary************************").append(LS);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/req/ReqSketch.java`
#### Snippet
```java
    sb.append("  Estimation Mode : " + isEstimationMode()).append(LS);
    sb.append("  High Rank Acc   : " + hra).append(LS);
    sb.append("  Levels          : " + compactors.size()).append(LS);
    sb.append("************************End Summary************************").append(LS);
    return sb.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/kll/KllHelper.java`
#### Snippet
```java
    sb.append("### KLL items data {index, item}:").append(Util.LS);
    if (levelsArr[0] > 0) {
      sb.append(" Garbage:" + Util.LS);
      if (doubleType) {
        for (int i = 0; i < levelsArr[0]; i++) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/kll/KllHelper.java`
#### Snippet
```java
      if (doubleType) {
        for (int i = 0; i < levelsArr[0]; i++) {
          sb.append("   ").append(i + ", ").append(doubleItemsArr[i]).append(Util.LS);
        }
      } else {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/kll/KllHelper.java`
#### Snippet
```java
      } else {
        for (int i = 0; i < levelsArr[0]; i++) {
          sb.append("   ").append(i + ", ").append(floatItemsArr[i]).append(Util.LS);
        }
      }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/kll/KllHelper.java`
#### Snippet
```java
        final int toIndex = levelsArr[level + 1]; // exclusive
        if (fromIndex < toIndex) {
          sb.append(" level[").append(level).append("]: offset: " + levelsArr[level] + " wt: " + (1 << level));
          sb.append(Util.LS);
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/kll/KllHelper.java`
#### Snippet
```java

        for (int i = fromIndex; i < toIndex; i++) {
          sb.append("   ").append(i + ", ").append(doubleItemsArr[i]).append(Util.LS);
        }
        level++;
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/kll/KllHelper.java`
#### Snippet
```java
        final int toIndex = levelsArr[level + 1]; // exclusive
        if (fromIndex <= toIndex) {
          sb.append(" level[").append(level).append("]: offset: " + levelsArr[level] + " wt: " + (1 << level));
          sb.append(Util.LS);
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/kll/KllHelper.java`
#### Snippet
```java

        for (int i = fromIndex; i < toIndex; i++) {
          sb.append("   ").append(i + ", ").append(floatItemsArr[i]).append(Util.LS);
        }
        level++;
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/datasketches/kll/KllHelper.java`
#### Snippet
```java
      }
    }
    sb.append(" level[" + level + "]: offset: " + levelsArr[level] + " (Exclusive)");
    sb.append(Util.LS);
    sb.append("### End items data").append(Util.LS);
```

