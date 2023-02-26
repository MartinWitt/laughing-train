# mahout 
 
# Bad smells
I found 497 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| AssignmentToMethodParameter | 121 | false |
| UnnecessaryFullyQualifiedName | 85 | false |
| NestedAssignment | 59 | false |
| RedundantMethodOverride | 55 | false |
| BoundedWildcard | 23 | false |
| ConstantValue | 23 | false |
| ManualMinMaxCalculation | 17 | false |
| CommentedOutCode | 14 | false |
| RedundantFieldInitialization | 12 | false |
| UnstableApiUsage | 10 | false |
| UnnecessaryCallToStringValueOf | 6 | false |
| RedundantSuppression | 6 | false |
| DataFlowIssue | 5 | false |
| UseCompareMethod | 5 | false |
| UnusedAssignment | 5 | false |
| RefusedBequest | 4 | false |
| NonSerializableFieldInSerializableClass | 4 | false |
| UNUSED_IMPORT | 4 | false |
| Anonymous2MethodRef | 4 | false |
| DeprecatedIsStillUsed | 3 | false |
| EqualsAndHashcode | 3 | false |
| IOResource | 2 | false |
| StaticInitializerReferencesSubClass | 2 | false |
| MethodOverloadsParentMethod | 2 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 2 | false |
| NonShortCircuitBoolean | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| ReturnNull | 2 | false |
| SuspiciousNameCombination | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| WhileCanBeForeach | 1 | false |
| StaticPseudoFunctionalStyleMethod | 1 | false |
| ForLoopReplaceableByWhile | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| IgnoreResultOfCall | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| MissingDeprecatedAnnotation | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| Convert2Lambda | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| SynchronizeOnThis | 1 | false |
## RuleId[ruleID=IOResource]
### IOResource
'FileInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `core/src/main/java/org/apache/mahout/math/FileBasedSparseBinaryMatrix.java`
#### Snippet
```java
  public void setData(File f) throws IOException {
    List<ByteBuffer> buffers = Lists.newArrayList();
    FileChannel input = new FileInputStream(f).getChannel();

    buffers.add(input.map(FileChannel.MapMode.READ_ONLY, 0, Math.min(Integer.MAX_VALUE, f.length())));
```

### IOResource
'FileInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `core/src/main/java/org/apache/mahout/math/FileBasedMatrix.java`
#### Snippet
```java
      long start = i * rowsPerBlock * columns * 8L;
      long size = rowsPerBlock * columns * 8L;
      MappedByteBuffer buf = new FileInputStream(f).getChannel().map(FileChannel.MapMode.READ_ONLY, start,
                                                                     Math.min(f.length() - start, size));
      if (loadNow) {
```

## RuleId[ruleID=SuspiciousNameCombination]
### SuspiciousNameCombination
'y' should probably not be passed as parameter 'x'
in `core/src/main/java/org/apache/mahout/math/ssvd/SequentialBigSvd.java`
#### Snippet
```java

    // R'R = Y' Y
    cd1 = new CholeskyDecomposition(y.transpose().times(y));

    // B = Q" A = (Y R^{-1} )' A
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Matrices` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/mahout/math/Matrices.java`
#### Snippet
```java
import java.util.Random;

public final class Matrices {

  /**
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `core/src/main/java/org/apache/mahout/math/set/OpenHashSet.java`
#### Snippet
```java
    final Collection<?> finalCollection = c;
    final boolean[] modified = new boolean[1];
    modified[0] = false;
    forEachKey(new ObjectProcedure<T>() {
      @Override
```

### DataFlowIssue
Dereference of `tScoredItem` may produce `NullPointerException`
in `core/src/main/java/org/apache/mahout/math/stats/LogLikelihood.java`
#### Snippet
```java
      @Override
      public int compare(ScoredItem<T> tScoredItem, ScoredItem<T> tScoredItem1) {
        return Double.compare(tScoredItem.score, tScoredItem1.score);
      }
    };
```

### DataFlowIssue
Dereference of `tScoredItem1` may produce `NullPointerException`
in `core/src/main/java/org/apache/mahout/math/stats/LogLikelihood.java`
#### Snippet
```java
      @Override
      public int compare(ScoredItem<T> tScoredItem, ScoredItem<T> tScoredItem1) {
        return Double.compare(tScoredItem.score, tScoredItem1.score);
      }
    };
```

### DataFlowIssue
Method invocation `assign` may produce `NullPointerException`
in `core/src/main/java/org/apache/mahout/math/solver/ConjugateGradientSolver.java`
#### Snippet
```java
        
        // updateDirection = residual + beta * updateDirection
        updateDirection.assign(Functions.MULT, beta);
        updateDirection.assign(conditionedResidual, Functions.PLUS);
      }
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `core/src/main/java/org/apache/mahout/math/decomposer/hebbian/HebbianSolver.java`
#### Snippet
```java
     */
    long now = System.currentTimeMillis();
    TrainingState finalState = solver.solve(corpus, rank);
    long time = (System.currentTimeMillis() - now) / 1000;
    log.info("Solved {} eigenVectors in {} seconds.  Persisted to {}",
```

## RuleId[ruleID=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `core/src/main/java/org/apache/mahout/math/VectorBinaryAggregate.java`
#### Snippet
```java
      }
      Iterator<Vector.Element> yi = y.nonZeroes().iterator();
      while (yi.hasNext()) {
        Vector.Element ye = yi.next();
        if (!visited.contains(ye.index())) {
```

## RuleId[ruleID=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass AssignAllLoopInplaceUpdates from superclass VectorBinaryAssign initializer might lead to class loading deadlock
in `core/src/main/java/org/apache/mahout/math/VectorBinaryAssign.java`
#### Snippet
```java
    new AssignAllIterateThatLookupThisInplaceUpdates(),
    new AssignAllLoopMergeUpdates(),
    new AssignAllLoopInplaceUpdates(),
  };

```

### StaticInitializerReferencesSubClass
Referencing subclass AggregateAllLoop from superclass VectorBinaryAggregate initializer might lead to class loading deadlock
in `core/src/main/java/org/apache/mahout/math/VectorBinaryAggregate.java`
#### Snippet
```java
    new AggregateAllIterateThisLookupThat(),
    new AggregateAllIterateThatLookupThis(),
    new AggregateAllLoop(),
  };

```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'LanczosState' is still used
in `core/src/main/java/org/apache/mahout/math/decomposer/lanczos/LanczosState.java`
#### Snippet
```java

@Deprecated
public class LanczosState {

  protected  Matrix diagonalMatrix;
```

### DeprecatedIsStillUsed
Deprecated member 'LanczosSolver' is still used
in `core/src/main/java/org/apache/mahout/math/decomposer/lanczos/LanczosSolver.java`
#### Snippet
```java
 */
@Deprecated
public class LanczosSolver {

  private static final Logger log = LoggerFactory.getLogger(LanczosSolver.class);
```

### DeprecatedIsStillUsed
Deprecated member 'SparseColumnMatrix' is still used
in `core/src/main/java/org/apache/mahout/math/SparseColumnMatrix.java`
#### Snippet
```java
 * @deprecated tons of inconsistences. Use transpose view of SparseRowMatrix for fast column-wise iteration.
 */
public class SparseColumnMatrix extends AbstractMatrix {

  private Vector[] columnVectors;
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `core/src/main/java/org/apache/mahout/math/Vector.java`
#### Snippet
```java
  // void foreachNonZero(IntDoubleFunction f);
  // DoubleDoubleFunction map);
  // NewVector assign(Vector y, DoubleDoubleFunction function, IntArrayList
  // nonZeroIndexes);

```

### CommentedOutCode
Commented out code (2 lines)
in `core/src/main/java/org/apache/mahout/math/FileBasedSparseBinaryMatrix.java`
#### Snippet
```java
      bufferIndex[i] = buffer;

//      final SparseBinaryVector v = new SparseBinaryVector(buffers.get(buffer), columns, offset, size);
//      this.rows.add(v);
      offset += size * 4;
```

### CommentedOutCode
Commented out code (3 lines)
in `core/src/main/java/org/apache/mahout/math/OldQRDecomposition.java`
#### Snippet
```java
        }
        QRcolumnsPart[k].assign(Functions.div(nrm));
        /*
        for (int i = k; i < m; i++) {
           QR[i][k] /= nrm;
```

### CommentedOutCode
Commented out code (7 lines)
in `core/src/main/java/org/apache/mahout/math/OldQRDecomposition.java`
#### Snippet
```java
          Vector QRcolj = qr.viewColumn(j).viewPart(k, originalRows - k);
          double s = QRcolumnsPart[k].dot(QRcolj);
          /*
          // fixes bug reported by John Chambers
          DoubleMatrix1D QRcolj = QR.viewColumn(j).viewPart(k,m-k);
```

### CommentedOutCode
Commented out code (7 lines)
in `core/src/main/java/org/apache/mahout/math/Matrix.java`
#### Snippet
```java
   * 
   */
  // void getNonZeros(IntArrayList jx, DoubleArrayList values);
  // void foreachNonZero(IntDoubleFunction f);
  // double aggregate(DoubleDoubleFunction aggregator, DoubleFunction map);
```

### CommentedOutCode
Commented out code (5 lines)
in `core/src/main/java/org/apache/mahout/math/RandomAccessSparseVector.java`
#### Snippet
```java
  }

  /*
  @Override
  public Element getElement(int index) {
```

### CommentedOutCode
Commented out code (2 lines)
in `core/src/main/java/org/apache/mahout/math/jet/random/Poisson.java`
#### Snippet
```java
      //static double        my_last = -1.0;
      //static long int      m,  k2, k4, k1, k5;
      //static double        dl, dr, r1, r2, r4, r5, ll, lr, l_my, c_pm,
      //             f1, f2, f4, f5, p1, p2, p3, p4, p5, p6;

```

### CommentedOutCode
Commented out code (6 lines)
in `core/src/main/java/org/apache/mahout/math/map/HashFunctions.java`
#### Snippet
```java
  public static int hash(long value) {
    return (int) (value ^ (value >> 32));
    /*
    value &= 0x7FFFFFFFFFFFFFFFL; // make it >=0 (0x7FFFFFFFFFFFFFFFL==Long.MAX_VALUE)
    int hashCode = 0;
```

### CommentedOutCode
Commented out code (5 lines)
in `core/src/main/java/org/apache/mahout/math/map/QuickOpenIntIntHashMap.java`
#### Snippet
```java
      if (oldState[i] == FULL) {
        put(oldTable[i], oldValues[i]);
        /*
        int element = oldTable[i];
        int index = indexOfInsertion(element);
```

### CommentedOutCode
Commented out code (2 lines)
in `core/src/main/java/org/apache/mahout/math/jet/stat/Gamma.java`
#### Snippet
```java
      1.00000000000000000320E0
    };
//double MAXGAM = 171.624376956302725;
//double LOGPI  = 1.14472988584940017414;

```

### CommentedOutCode
Commented out code (6 lines)
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
      chosen += S + 1;
      values[fromIndex++] = chosen;
      /*
      // invert
      for (int iter=0; iter<S && count > 0; iter++) {
```

### CommentedOutCode
Commented out code (17 lines)
in `core/src/main/java/org/apache/mahout/math/stats/OnlineSummarizer.java`
#### Snippet
```java
  }

//  public double getMin() {
//    return getQuartile(0);
//  }
```

### CommentedOutCode
Commented out code (5 lines)
in `core/src/main/java/org/apache/mahout/math/decomposer/hebbian/HebbianSolver.java`
#### Snippet
```java
    HebbianSolver solver = new HebbianSolver(updater, verifier, convergence, maxPasses);
    Matrix corpus = null;
    /*
    if (numThreads <= 1) {
      //  corpus = new DiskBufferedDoubleMatrix(new File(corpusDir), inBufferSize);
```

### CommentedOutCode
Commented out code (3 lines)
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
  public static DoubleFunction mult(double b) {
    return new Mult(b);
    /*
    return new DoubleFunction() {
      public final double apply(double a) { return a * b; }
```

## RuleId[ruleID=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `assign()` overloads a compatible method of a superclass, when overriding might have been intended
in `core/src/main/java/org/apache/mahout/math/DenseVector.java`
#### Snippet
```java
  }

  public Vector assign(DenseVector vector) {
    // make sure the data field has the correct length
    if (vector.values.length != this.values.length) {
```

### MethodOverloadsParentMethod
Method `assign()` overloads a compatible method of a superclass, when overriding might have been intended
in `core/src/main/java/org/apache/mahout/math/DenseMatrix.java`
#### Snippet
```java
  }
  
  public Matrix assign(DenseMatrix matrix) {
    // make sure the data field has the correct length
    if (matrix.values[0].length != this.values[0].length || matrix.values.length != this.values.length) {
```

## RuleId[ruleID=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
    String unknown = "Illegal operation or error: ";
    try {
      buf.append(String.valueOf(this.cond()));
    } catch (IllegalArgumentException exc) {
      buf.append(unknown).append(exc.getMessage());
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
    buf.append("\nrank = ");
    try {
      buf.append(String.valueOf(this.rank()));
    } catch (IllegalArgumentException exc) {
      buf.append(unknown).append(exc.getMessage());
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
    buf.append("\nnorm2 = ");
    try {
      buf.append(String.valueOf(this.norm2()));
    } catch (IllegalArgumentException exc) {
      buf.append(unknown).append(exc.getMessage());
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
    buf.append("\n\nU = ");
    try {
      buf.append(String.valueOf(this.getU()));
    } catch (IllegalArgumentException exc) {
      buf.append(unknown).append(exc.getMessage());
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
    buf.append("\n\nS = ");
    try {
      buf.append(String.valueOf(this.getS()));
    } catch (IllegalArgumentException exc) {
      buf.append(unknown).append(exc.getMessage());
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
    buf.append("\n\nV = ");
    try {
      buf.append(String.valueOf(this.getV()));
    } catch (IllegalArgumentException exc) {
      buf.append(unknown).append(exc.getMessage());
```

## RuleId[ruleID=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `core/src/main/java/org/apache/mahout/math/RandomAccessSparseVector.java`
#### Snippet
```java

  @Override
  public RandomAccessSparseVector clone() {
    return new RandomAccessSparseVector(size(), values.clone());
  }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `core/src/main/java/org/apache/mahout/math/SparseMatrix.java`
#### Snippet
```java

  @Override
  public Matrix clone() {
    SparseMatrix clone = new SparseMatrix(numRows(), numCols());
    for (MatrixSlice slice : this) {
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `core/src/main/java/org/apache/mahout/math/list/ObjectArrayList.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  @Override
  public Object clone() {
    // overridden for performance only.
    return new ObjectArrayList<>((T[]) elements.clone());
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `engine/hdfs/src/main/java/org/apache/mahout/math/VarIntWritable.java`
#### Snippet
```java

  @Override
  public VarIntWritable clone() {
    return new VarIntWritable(value);
  }
```

## RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `core/src/main/java/org/apache/mahout/math/FileBasedSparseBinaryMatrix.java`
#### Snippet
```java
    // write rows
    for (MatrixSlice row : m) {
      List<Integer> columns = Lists.newArrayList(Iterables.transform(row.vector().nonZeroes(),
        new Function<Vector.Element, Integer>() {
          @Override
```

## RuleId[ruleID=ForLoopReplaceableByWhile]
### ForLoopReplaceableByWhile
`for` loop statement may be replace by 'while' loop
in `core/src/main/java/org/apache/mahout/math/DenseVector.java`
#### Snippet
```java

        // Picking up slack
        for ( ;
          i < untilOffset;
          ) {
```

## RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `setSeed()` overrides synchronized method
in `core/src/main/java/org/apache/mahout/common/RandomWrapper.java`
#### Snippet
```java
   */
  @Override
  public void setSeed(long seed) {
    // Since this will be called by the java.util.Random() constructor before we construct
    // the delegate... and because we don't actually care about the result of this for our
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `nextGaussian()` overrides synchronized method
in `core/src/main/java/org/apache/mahout/common/RandomWrapper.java`
#### Snippet
```java

  @Override
  public double nextGaussian() {
    return random.nextGaussian();
  }
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'elements' in a Serializable class
in `core/src/main/java/org/apache/mahout/math/list/ObjectArrayList.java`
#### Snippet
```java
   * array buffer.
   */
  private Object[] elements;
  private int size;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'table' in a Serializable class
in `core/src/main/java/org/apache/mahout/math/set/OpenHashSet.java`
#### Snippet
```java

  /** The hash table keys. */
  private Object[] table;

  /** The state of each hash table entry (FREE, FULL, REMOVED). */
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'table' in a Serializable class
in `core/src/main/java/org/apache/mahout/math/map/OpenHashMap.java`
#### Snippet
```java

  /** The hash table keys. */
  protected Object[] table;

  /** The hash table values. */
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'values' in a Serializable class
in `core/src/main/java/org/apache/mahout/math/map/OpenHashMap.java`
#### Snippet
```java

  /** The hash table values. */
  protected Object[] values;

  /** The state of each hash table entry (FREE, FULL, REMOVED). */
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder bldr` can be replaced with 'String'
in `core/src/main/java/org/apache/mahout/math/NamedVector.java`
#### Snippet
```java
  @Override
  public String toString() {
    StringBuilder bldr = new StringBuilder();
    bldr.append(name).append(':').append(delegate.toString());
    return bldr.toString();
```

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `anyAdded |= added`
in `core/src/main/java/org/apache/mahout/math/set/OpenHashSet.java`
#### Snippet
```java
    for (T o : c) {
      boolean added = add(o);
      anyAdded |= added;
    }
    return anyAdded;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `anyRemoved |= removed`
in `core/src/main/java/org/apache/mahout/math/set/OpenHashSet.java`
#### Snippet
```java
    for (Object o : c) {
      boolean removed = remove(o);
      anyRemoved |= removed;
    }
    return anyRemoved;
```

## RuleId[ruleID=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `core/src/main/java/org/apache/mahout/math/SequentialAccessSparseVector.java`
#### Snippet
```java

  public SequentialAccessSparseVector(int cardinality) {
    this(cardinality, Math.min(100, cardinality / 1000 < 10 ? 10 : cardinality / 1000)); // arbitrary estimate of
                                                                                           // 'sparseness'
  }
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[c--] = temp;
    }
    length = a - start < b - a ? a - start : b - a;
    int l = start;
    int h = b - length;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[h++] = temp;
    }
    length = d - c < end - 1 - d ? d - c : end - 1 - d;
    l = b;
    h = end - length;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[c--] = temp;
    }
    length = a - start < b - a ? a - start : b - a;
    int l = start;
    int h = b - length;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[h++] = temp;
    }
    length = d - c < end - 1 - d ? d - c : end - 1 - d;
    l = b;
    h = end - length;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[c--] = temp;
    }
    length = a - start < b - a ? a - start : b - a;
    int l = start;
    int h = b - length;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[h++] = temp;
    }
    length = d - c < end - 1 - d ? d - c : end - 1 - d;
    l = b;
    h = end - length;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[c--] = temp;
    }
    length = a - start < b - a ? a - start : b - a;
    int l = start;
    int h = b - length;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[h++] = temp;
    }
    length = d - c < end - 1 - d ? d - c : end - 1 - d;
    l = b;
    h = end - length;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[c--] = temp;
    }
    length = a - start < b - a ? a - start : b - a;
    int l = start;
    int h = b - length;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[h++] = temp;
    }
    length = d - c < end - 1 - d ? d - c : end - 1 - d;
    l = b;
    h = end - length;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[c--] = temp;
    }
    length = a - start < b - a ? a - start : b - a;
    int l = start;
    int h = b - length;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[h++] = temp;
    }
    length = d - c < end - 1 - d ? d - c : end - 1 - d;
    l = b;
    h = end - length;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[c--] = temp;
    }
    length = a - start < b - a ? a - start : b - a;
    int l = start;
    int h = b - length;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[h++] = temp;
    }
    length = d - c < end - 1 - d ? d - c : end - 1 - d;
    l = b;
    h = end - length;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[c--] = temp;
    }
    length = a - start < b - a ? a - start : b - a;
    int l = start;
    int h = b - length;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[h++] = temp;
    }
    length = d - c < end - 1 - d ? d - c : end - 1 - d;
    l = b;
    h = end - length;
```

## RuleId[ruleID=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `DenseVectorView` may be 'static'
in `core/src/main/java/org/apache/mahout/math/DenseVector.java`
#### Snippet
```java
  }

  private final class DenseVectorView extends VectorView {

    public DenseVectorView(Vector vector, int offset, int cardinality) {
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends MatrixSlice`
in `core/src/main/java/org/apache/mahout/math/OrthonormalityVerifier.java`
#### Snippet
```java
  }

  public static VectorIterable pairwiseInnerProducts(Iterable<MatrixSlice> basis) {
    DenseMatrix out = null;
    for (MatrixSlice slice1 : basis) {
```

### BoundedWildcard
Can generalize to `? extends Vector`
in `core/src/main/java/org/apache/mahout/math/als/AlternatingLeastSquaresSolver.java`
#### Snippet
```java


  static Matrix createMiIi(Iterable<Vector> featureVectors, int numFeatures) {
    double[][] MiIi =  new double[numFeatures][Iterables.size(featureVectors)];
    int n = 0;
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/org/apache/mahout/math/list/ObjectArrayList.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public boolean forEach(ObjectProcedure<T> procedure) {
    T[] theElements = (T[]) elements;
    int theSize = size;
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/org/apache/mahout/math/random/Missing.java`
#### Snippet
```java
  private final T missingMarker;

  public Missing(int seed, double p, Sampler<T> delegate, T missingMarker) {
    this.p = p;
    this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/org/apache/mahout/math/set/OpenHashSet.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public boolean forEachKey(ObjectProcedure<T> procedure) {
    for (int i = table.length; i-- > 0;) {
      if (state[i] == FULL) {
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/org/apache/mahout/math/set/OpenHashSet.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public void keys(List<T> list) {
    list.clear();
  
```

### BoundedWildcard
Can generalize to `? super ScoredItem`
in `core/src/main/java/org/apache/mahout/math/stats/LogLikelihood.java`
#### Snippet
```java
                                        int totalA,
                                        int totalB,
                                        Queue<ScoredItem<T>> best,
                                        T t) {
    int kA = a.count(t);
```

### BoundedWildcard
Can generalize to `? super K`
in `core/src/main/java/org/apache/mahout/math/map/OpenHashMap.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public void keys(List<K> list) {
    list.clear();
  
```

### BoundedWildcard
Can generalize to `? super K`
in `core/src/main/java/org/apache/mahout/math/map/OpenHashMap.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public boolean forEachPair(ObjectObjectProcedure<K,V> procedure) {
    for (int i = table.length; i-- > 0;) {
      if (state[i] == FULL && !procedure.apply((K)table[i], (V)values[i])) {
```

### BoundedWildcard
Can generalize to `? super V`
in `core/src/main/java/org/apache/mahout/math/map/OpenHashMap.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public boolean forEachPair(ObjectObjectProcedure<K,V> procedure) {
    for (int i = table.length; i-- > 0;) {
      if (state[i] == FULL && !procedure.apply((K)table[i], (V)values[i])) {
```

### BoundedWildcard
Can generalize to `? super K`
in `core/src/main/java/org/apache/mahout/math/map/OpenHashMap.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public boolean forEachKey(ObjectProcedure<K> procedure) {
    for (int i = table.length; i-- > 0;) {
      if (state[i] == FULL && !procedure.apply((K)table[i])) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/org/apache/mahout/math/random/Multinomial.java`
#### Snippet
```java
  }

  public Multinomial(Multiset<T> counts) {
    this();
    Preconditions.checkArgument(!counts.isEmpty(), "Need some data to build sampler");
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/org/apache/mahout/math/random/IndianBuffet.java`
#### Snippet
```java
  private final Random gen;

  public IndianBuffet(double alpha, WordFunction<T> converter) {
    this.alpha = alpha;
    this.converter = converter;
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
   *          - the comparator to determine the order of the array.
   */
  private static <T> void mergeSort(T[] in, T[] out, int start, int end, Comparator<T> c) {
    int len = end - start;
    // use insertion sort for small arrays
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
   *           if {@code start < 0} or {@code end > array.length}.
   */
  public static <T> void quickSort(T[] array, int start, int end, Comparator<T> comp) {
    Preconditions.checkNotNull(array);
    checkBounds(array.length, start, end);
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
  }
  
  private static <T> void quickSort0(int start, int end, T[] array, Comparator<T> comp) {
    T temp;
    int length = end - start;
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
   *          - the comparator used to compare Objects
   */
  private static <T> int find(T[] arr, T val, int bnd, int l, int r, Comparator<T> c) {
    int m = l;
    int d = 1;
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
  private Sorting() {}
  
  private static <T> int med3(T[] array, int a, int b, int c, Comparator<T> comp) {
    T x = array[a];
    T y = array[b];
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked") // required to make the temp array work, afaict.
  public static <T> void mergeSort(T[] array, int start, int end, Comparator<T> comp) {
    checkBounds(array.length, start, end);
    int length = end - start;
```

### BoundedWildcard
Can generalize to `? super String`
in `engine/hdfs/src/main/java/org/apache/mahout/math/MatrixWritable.java`
#### Snippet
```java

  public static void readLabels(DataInput in,
                                Map<String, Integer> columnLabelBindings,
                                Map<String, Integer> rowLabelBindings) throws IOException {
    int colSize = in.readInt();
```

### BoundedWildcard
Can generalize to `? super Integer`
in `engine/hdfs/src/main/java/org/apache/mahout/math/MatrixWritable.java`
#### Snippet
```java

  public static void readLabels(DataInput in,
                                Map<String, Integer> columnLabelBindings,
                                Map<String, Integer> rowLabelBindings) throws IOException {
    int colSize = in.readInt();
```

### BoundedWildcard
Can generalize to `? super String`
in `engine/hdfs/src/main/java/org/apache/mahout/math/MatrixWritable.java`
#### Snippet
```java
  public static void readLabels(DataInput in,
                                Map<String, Integer> columnLabelBindings,
                                Map<String, Integer> rowLabelBindings) throws IOException {
    int colSize = in.readInt();
    if (colSize > 0) {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `engine/hdfs/src/main/java/org/apache/mahout/math/MatrixWritable.java`
#### Snippet
```java
  public static void readLabels(DataInput in,
                                Map<String, Integer> columnLabelBindings,
                                Map<String, Integer> rowLabelBindings) throws IOException {
    int colSize = in.readInt();
    if (colSize > 0) {
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `core/src/main/java/org/apache/mahout/math/AbstractMatrix.java`
#### Snippet
```java
  @SuppressWarnings("CloneDoesntDeclareCloneNotSupportedException")
  @Override
  public Matrix clone() {
    AbstractMatrix clone;
    try {
```

### RedundantSuppression
Redundant suppression
in `core/src/main/java/org/apache/mahout/math/AbstractVector.java`
#### Snippet
```java
  @SuppressWarnings("CloneDoesntDeclareCloneNotSupportedException")
  @Override
  public Vector clone() {
    try {
      AbstractVector r = (AbstractVector) super.clone();
```

### RedundantSuppression
Redundant suppression
in `core/src/main/java/org/apache/mahout/math/DelegatingVector.java`
#### Snippet
```java
  @SuppressWarnings("CloneDoesntDeclareCloneNotSupportedException")
  @Override
  public Vector clone() {
    DelegatingVector r;
    try {
```

### RedundantSuppression
Redundant suppression
in `core/src/main/java/org/apache/mahout/math/Vector.java`
#### Snippet
```java
   */
  @SuppressWarnings("CloneDoesntDeclareCloneNotSupportedException")
  Vector clone();

  Iterable<Element> all();
```

### RedundantSuppression
Redundant suppression
in `core/src/main/java/org/apache/mahout/math/list/ObjectArrayList.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public ObjectArrayList(int initialCapacity) {
    elements = new Object[initialCapacity];
    size = 0;
```

### RedundantSuppression
Redundant suppression
in `core/src/main/java/org/apache/mahout/math/list/ObjectArrayList.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public boolean equals(Object otherObj) { //delta
    // overridden for performance only.
    if (!(otherObj instanceof ObjectArrayList)) {
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `engine/hdfs/src/main/java/org/apache/mahout/common/IOUtils.java`
#### Snippet
```java
    public void close() throws IOException {
      if (file.isFile()) {
        file.delete();
      }
    }
```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `getNumNondefaultElements()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/MatrixView.java`
#### Snippet
```java

  @Override
  public int[] getNumNondefaultElements() {
    return new int[]{rowSize(), columnSize()};

```

### RedundantMethodOverride
Method `isLikeRightMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/PlusMult.java`
#### Snippet
```java
   */
  @Override
  public boolean isLikeRightMult() {
    return false;
  }
```

### RedundantMethodOverride
Method `isLikeLeftMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/PlusMult.java`
#### Snippet
```java
   */
  @Override
  public boolean isLikeLeftMult() {
    return false;
  }
```

### RedundantMethodOverride
Method `isLikeRightPlus()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/TimesFunction.java`
#### Snippet
```java
   */
  @Override
  public boolean isLikeRightPlus() {
    return false;
  }
```

### RedundantMethodOverride
Method `isLikeRightPlus()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeRightPlus() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
       */
      @Override
      public boolean isLikeRightMult() {
        return false;
      }
```

### RedundantMethodOverride
Method `isLikeRightMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeRightMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeLeftMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeLeftMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeLeftMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeLeftMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isCommutative()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isCommutative() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeLeftMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeLeftMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isAssociative()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isAssociative() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeLeftMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
       */
      @Override
      public boolean isLikeLeftMult() {
        return false;
      }
```

### RedundantMethodOverride
Method `isLikeRightMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeRightMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightPlus()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
       */
      @Override
      public boolean isLikeRightPlus() {
        return false;
      }
```

### RedundantMethodOverride
Method `isAssociative()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
       */
      @Override
      public boolean isAssociative() {
        return false;
      }
```

### RedundantMethodOverride
Method `isCommutative()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isCommutative() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeRightMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightPlus()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeRightPlus() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightPlus()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeRightPlus() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeLeftMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeLeftMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeLeftMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeLeftMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeLeftMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeLeftMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightPlus()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeRightPlus() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeLeftMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeLeftMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightPlus()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
       */
      @Override
      public boolean isLikeRightPlus() {
        return false;
      }
```

### RedundantMethodOverride
Method `isLikeLeftMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeLeftMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightPlus()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeRightPlus() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeRightMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightPlus()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
  */
    @Override
    public boolean isLikeRightPlus() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
       */
      @Override
      public boolean isLikeRightMult() {
        return false;
      }
```

### RedundantMethodOverride
Method `isAssociative()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isAssociative() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightPlus()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeRightPlus() {
      return false;
    }
```

### RedundantMethodOverride
Method `isAssociative()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isAssociative() {
      return false;
    }
```

### RedundantMethodOverride
Method `isCommutative()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isCommutative() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightPlus()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeRightPlus() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeRightMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isCommutative()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isCommutative() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeRightMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isAssociative()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isAssociative() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightPlus()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeRightPlus() {
      return false;
    }
```

### RedundantMethodOverride
Method `isAssociative()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
       */
      @Override
      public boolean isAssociative() {
        return false;
      }
```

### RedundantMethodOverride
Method `isLikeLeftMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
       */
      @Override
      public boolean isLikeLeftMult() {
        return false;
      }
```

### RedundantMethodOverride
Method `isAssociative()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
       */
      @Override
      public boolean isAssociative() {
        return false;
      }
```

### RedundantMethodOverride
Method `isLikeLeftMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeLeftMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeRightMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeRightMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isAssociative()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isAssociative() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightPlus()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
       */
      @Override
      public boolean isLikeRightPlus() {
        return false;
      }
```

### RedundantMethodOverride
Method `isCommutative()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isCommutative() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeLeftMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeLeftMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isAssociative()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isAssociative() {
      return false;
    }
```

### RedundantMethodOverride
Method `isLikeRightMult()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isLikeRightMult() {
      return false;
    }
```

### RedundantMethodOverride
Method `isCommutative()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
     */
    @Override
    public boolean isCommutative() {
      return false;
    }
```

### RedundantMethodOverride
Method `isAssociative()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
       */
      @Override
      public boolean isAssociative() {
        return false;
      }
```

## RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
columns \* 8: integer multiplication implicitly cast to long
in `core/src/main/java/org/apache/mahout/math/FileBasedMatrix.java`
#### Snippet
```java
  public FileBasedMatrix(int rows, int columns) {
    super(rows, columns);
    long maxRows = ((1L << 31) - 1) / (columns * 8);
    if (rows > maxRows) {
      rowsPerBlock = (int) maxRows;
```

## RuleId[ruleID=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `core/src/main/java/org/apache/mahout/math/SparseColumnMatrix.java`
#### Snippet
```java
 * @deprecated tons of inconsistences. Use transpose view of SparseRowMatrix for fast column-wise iteration.
 */
public class SparseColumnMatrix extends AbstractMatrix {

  private Vector[] columnVectors;
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/org/apache/mahout/math/AbstractMatrix.java`
#### Snippet
```java
    String returnString = s.toString();
    if (maxColsToDisplay <= columnSize()) {
      returnString = returnString.replace("}", " ... } ");
    }
    if(maxRowsToDisplay <= rowSize())
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/org/apache/mahout/math/SparseColumnMatrix.java`
#### Snippet
```java
    String returnString = s.toString();
    if (maxColsToDisplay <= columnSize()) {
      returnString = returnString.replace("}", " ... }");
    }

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/ConstantVector.java`
#### Snippet
```java
   * #getElement(int)} for the given index
   *
   * @return An {@link java.util.Iterator} over all non-zero elements
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/ConstantVector.java`
#### Snippet
```java
   * for the given index
   *
   * @return An {@link java.util.Iterator} over all elements
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.function` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/Matrices.java`
#### Snippet
```java
  /**
   * Shorter form of {@link Matrices#functionalMatrixView(int, int,
   * org.apache.mahout.math.function.IntIntFunction, boolean)}.
   */
  public static Matrix functionalMatrixView(final int rows,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/Matrices.java`
#### Snippet
```java
   * @param columns   Number of columns in a view.
   * @param gf        view generator
   * @param denseLike type of matrix returne dby {@link org.apache.mahout.math.Matrix#like()}.
   * @return new matrix view.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/UpperTriangular.java`
#### Snippet
```java
/**
 * 
 * Quick and dirty implementation of some {@link org.apache.mahout.math.Matrix} methods
 * over packed upper triangular matrix.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/PivotedMatrix.java`
#### Snippet
```java
   * @param other a Vector
   * @return the modified receiver
   * @throws org.apache.mahout.math.CardinalityException
   *          if the cardinalities differ
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/PivotedMatrix.java`
#### Snippet
```java
   * @param column an int column index
   * @return a Vector at the index
   * @throws org.apache.mahout.math.IndexException
   *          if the index is out of bounds
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/PivotedMatrix.java`
#### Snippet
```java
   * @param row an int row index
   * @return a Vector at the index
   * @throws org.apache.mahout.math.IndexException
   *          if the index is out of bounds
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/PivotedMatrix.java`
#### Snippet
```java
   * @param size   the int[2] size of the desired result
   * @return a new Matrix that is a view of the original
   * @throws org.apache.mahout.math.CardinalityException
   *          if the length is greater than the cardinality of the receiver
   * @throws org.apache.mahout.math.IndexException
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/PivotedMatrix.java`
#### Snippet
```java
   * @throws org.apache.mahout.math.CardinalityException
   *          if the length is greater than the cardinality of the receiver
   * @throws org.apache.mahout.math.IndexException
   *          if the offset is negative or the offset+length is outside of the receiver
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/PivotedMatrix.java`
#### Snippet
```java
   * @param other  a Vector
   * @return the modified receiver
   * @throws org.apache.mahout.math.CardinalityException
   *          if the cardinalities differ
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `core/src/main/java/org/apache/mahout/math/PersistentObject.java`
#### Snippet
```java
 * be switched to Objectivity compatibility (and back) with minimum effort.
 */
public abstract class PersistentObject implements java.io.Serializable, Cloneable {

  /** Not yet commented. */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/FileBasedSparseBinaryMatrix.java`
#### Snippet
```java
   * @param other  a Vector
   * @return the modified receiver
   * @throws org.apache.mahout.math.CardinalityException
   *          if the cardinalities differ
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/FileBasedSparseBinaryMatrix.java`
#### Snippet
```java
   * @param size   the int[2] size of the desired result
   * @return a matrix that shares storage with part of the original matrix.
   * @throws org.apache.mahout.math.CardinalityException
   *          if the length is greater than the cardinality of the receiver
   * @throws org.apache.mahout.math.IndexException
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/FileBasedSparseBinaryMatrix.java`
#### Snippet
```java
   * @throws org.apache.mahout.math.CardinalityException
   *          if the length is greater than the cardinality of the receiver
   * @throws org.apache.mahout.math.IndexException
   *          if the offset is negative or the offset+length is outside of the receiver
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/FileBasedSparseBinaryMatrix.java`
#### Snippet
```java
      * #getElement(int)} for the given index
      *
      * @return An {@link java.util.Iterator} over all non-zero elements
      */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/FileBasedSparseBinaryMatrix.java`
#### Snippet
```java
     * for the given index
     *
     * @return An {@link java.util.Iterator} over all elements
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/FileBasedSparseBinaryMatrix.java`
#### Snippet
```java
   * @param other a Vector
   * @return the modified receiver
   * @throws org.apache.mahout.math.CardinalityException
   *          if the cardinalities differ
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/PermutedVectorView.java`
#### Snippet
```java
   * #getElement(int)} for the given index
   *
   * @return An {@link java.util.Iterator} over all non-zero elements
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/PermutedVectorView.java`
#### Snippet
```java
   * #getElement(int)} for the given index
   *
   * @return An {@link java.util.Iterator} over all elements
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/FileBasedMatrix.java`
#### Snippet
```java
   * @param size   the int[2] size of the desired result
   * @return a matrix that shares storage with part of the original matrix.
   * @throws org.apache.mahout.math.CardinalityException
   *          if the length is greater than the cardinality of the receiver
   * @throws org.apache.mahout.math.IndexException
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/FileBasedMatrix.java`
#### Snippet
```java
   * @throws org.apache.mahout.math.CardinalityException
   *          if the length is greater than the cardinality of the receiver
   * @throws org.apache.mahout.math.IndexException
   *          if the offset is negative or the offset+length is outside of the receiver
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/FileBasedMatrix.java`
#### Snippet
```java
   * @param other  a Vector
   * @return the modified receiver
   * @throws org.apache.mahout.math.CardinalityException
   *          if the cardinalities differ
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/FileBasedMatrix.java`
#### Snippet
```java
   * @param other a Vector
   * @return the modified receiver
   * @throws org.apache.mahout.math.CardinalityException
   *          if the cardinalities differ
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/RandomTrinaryMatrix.java`
#### Snippet
```java
   * @param size   the int[2] size of the desired result
   * @return a new Matrix that is a view of the original
   * @throws org.apache.mahout.math.CardinalityException
   *          if the length is greater than the cardinality of the receiver
   * @throws org.apache.mahout.math.IndexException
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/RandomTrinaryMatrix.java`
#### Snippet
```java
   * @throws org.apache.mahout.math.CardinalityException
   *          if the length is greater than the cardinality of the receiver
   * @throws org.apache.mahout.math.IndexException
   *          if the offset is negative or the offset+length is outside of the receiver
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/Matrix.java`
#### Snippet
```java
  /**
   * Get matrix structural flavor (operations performance hints). This is optional operation, may
   * throw {@link java.lang.UnsupportedOperationException}.
   */
  MatrixFlavor getFlavor();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/SequentialAccessSparseVector.java`
#### Snippet
```java
 * one int[], one double[].  If there are <b>k</b> non-zero elements in the vector, this implementation has
 * O(log(k)) random-access read performance, and O(k) random-access write performance, which is far below that
 * of the hashmap based {@link org.apache.mahout.math.RandomAccessSparseVector RandomAccessSparseVector}.  This
 * class is primarily used for operations where the all the elements will be accessed in a read-only fashion
 * sequentially: methods which operate not via get() or set(), but via iterateNonZero(), such as (but not limited
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/MatrixVectorView.java`
#### Snippet
```java
   * the given index
   *
   * @return An {@link java.util.Iterator} over all elements
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/MatrixVectorView.java`
#### Snippet
```java
   * #getElement(int)} for the given index
   *
   * @return An {@link java.util.Iterator} over all non-zero elements
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
package org.apache.mahout.math;

public class SingularValueDecomposition implements java.io.Serializable {
  
  /** Arrays for internal storage of U and V. */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/Arrays.java`
#### Snippet
```java
 *
 * @see java.util.Arrays
 * @see org.apache.mahout.math.Sorting
 *
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/map/PrimeFinder.java`
#### Snippet
```java
   */
  public static int nextPrime(int desiredCapacity) {
    int i = java.util.Arrays.binarySearch(PRIME_CAPACITIES, desiredCapacity);
    if (i < 0) {
      // desired capacity not found, choose next prime greater than desired capacity
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary, and can be replaced with an import
in `core/src/main/java/org/apache/mahout/math/list/SimpleLongArrayList.java`
#### Snippet
```java
  @Override
  public void ensureCapacity(int minCapacity) {
    elements = org.apache.mahout.math.Arrays.ensureCapacity(elements, minCapacity);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary, and can be replaced with an import
in `core/src/main/java/org/apache/mahout/math/list/SimpleLongArrayList.java`
#### Snippet
```java
  @Override
  public void trimToSize() {
    elements = org.apache.mahout.math.Arrays.trimToCapacity(elements, size());
  }
}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary, and can be replaced with an import
in `core/src/main/java/org/apache/mahout/math/list/ObjectArrayList.java`
#### Snippet
```java
  @Override
  public void trimToSize() {
    elements = org.apache.mahout.math.Arrays.trimToCapacity(elements, size());
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary, and can be replaced with an import
in `core/src/main/java/org/apache/mahout/math/list/ObjectArrayList.java`
#### Snippet
```java
   */
  public void ensureCapacity(int minCapacity) {
    elements = org.apache.mahout.math.Arrays.ensureCapacity(elements, minCapacity);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/map/OpenHashMap.java`
#### Snippet
```java
   */
  @Override
  public Set<java.util.Map.Entry<K,V>> entrySet() {
    final Set<Entry<K, V>> entries = new OpenHashSet<>();
    forEachPair(new ObjectObjectProcedure<K,V>() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.decomposer` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/decomposer/hebbian/HebbianSolver.java`
#### Snippet
```java
  /**
   * Creates a new HebbianSolver with the default {@link HebbianUpdater } to do the updating work, and the default
   * {@link org.apache.mahout.math.decomposer.AsyncEigenVerifier } to check for convergence in a (single)
   * background thread, with
   * convergenceTarget set to 0, which means that the solver will not really care about convergence as a loop-exiting
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.decomposer` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/decomposer/hebbian/HebbianSolver.java`
#### Snippet
```java
  /**
   * Creates a new HebbianSolver with the default {@link HebbianUpdater } to do the updating work, and the default
   * {@link org.apache.mahout.math.decomposer.AsyncEigenVerifier } to check for convergence in a (single)
   * background thread, with
   * maxPassesPerEigen set to Integer.MAX_VALUE.  <b>Not recommended</b> unless only looking
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.decomposer` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/decomposer/hebbian/HebbianSolver.java`
#### Snippet
```java
   * @param updater {@link EigenUpdater} used to do the actual work of iteratively updating the current "best guess"
   *  singular vector one data-point presentation at a time.
   * @param verifier {@link org.apache.mahout.math.decomposer.SingularVectorVerifier }
   * an object which perpetually tries to check how close to
   *  convergence the current singular vector is (typically is a
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.decomposer` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/decomposer/hebbian/HebbianSolver.java`
#### Snippet
```java
   * an object which perpetually tries to check how close to
   *  convergence the current singular vector is (typically is a
   * {@link org.apache.mahout.math.decomposer.AsyncEigenVerifier } which does this
   *  in the background in another thread, while the main thread continues to converge)
   * @param convergenceTarget a small "epsilon" value which tells the solver how small you want the cosine of the
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.decomposer` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/decomposer/hebbian/HebbianSolver.java`
#### Snippet
```java
   *  {@link SingularVectorVerifier } an object which perpetually tries to check how close to
   *   convergence the current singular vector is (typically is a
   *  {@link org.apache.mahout.math.decomposer.AsyncEigenVerifier } which does this
   *   in the background in another thread, while the main thread continues to converge)
   * @param convergenceTarget a small "epsilon" value which tells the solver how small you want the cosine of the
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.decomposer` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/decomposer/hebbian/HebbianSolver.java`
#### Snippet
```java
   * <b>This is the recommended constructor to use if you're not sure</b>
   * Creates a new HebbianSolver with the default {@link HebbianUpdater } to do the updating work, and the default
   * {@link org.apache.mahout.math.decomposer.AsyncEigenVerifier } to check for convergence in a
   * (single) background thread.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/VectorWritable.java`
#### Snippet
```java

  /**
   * @return {@link org.apache.mahout.math.Vector} that this is to write, or has
   *  just read
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/VectorWritable.java`
#### Snippet
```java

  /**
   * @return true if this is allowed to encode {@link org.apache.mahout.math.Vector}
   *  values using fewer bytes, possibly losing precision. In particular this means
   *  that floating point values will be encoded as floats, not doubles.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @throws IllegalArgumentException if variable-length value does not terminate
   *  after 5 bytes have been read
   * @throws java.io.IOException if {@link java.io.DataInput} throws {@link java.io.IOException}
   * @see #readUnsignedVarLong(java.io.DataInput)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @throws IllegalArgumentException if variable-length value does not terminate
   *  after 5 bytes have been read
   * @throws java.io.IOException if {@link java.io.DataInput} throws {@link java.io.IOException}
   * @see #readUnsignedVarLong(java.io.DataInput)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @throws IllegalArgumentException if variable-length value does not terminate
   *  after 5 bytes have been read
   * @throws java.io.IOException if {@link java.io.DataInput} throws {@link java.io.IOException}
   * @see #readUnsignedVarLong(java.io.DataInput)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   *  after 5 bytes have been read
   * @throws java.io.IOException if {@link java.io.DataInput} throws {@link java.io.IOException}
   * @see #readUnsignedVarLong(java.io.DataInput)
   */
  public static int readUnsignedVarInt(DataInput in) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * Google Protocol Buffers</a>. It uses zig-zag encoding to efficiently
   * encode signed values. If values are known to be nonnegative,
   * {@link #writeUnsignedVarLong(long, java.io.DataOutput)} should be used.
   *
   * @param value value to encode
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @param value value to encode
   * @param out to write bytes to
   * @throws java.io.IOException if {@link java.io.DataOutput} throws {@link java.io.IOException}
   */
  public static void writeSignedVarLong(long value, DataOutput out) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @param value value to encode
   * @param out to write bytes to
   * @throws java.io.IOException if {@link java.io.DataOutput} throws {@link java.io.IOException}
   */
  public static void writeSignedVarLong(long value, DataOutput out) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @param value value to encode
   * @param out to write bytes to
   * @throws java.io.IOException if {@link java.io.DataOutput} throws {@link java.io.IOException}
   */
  public static void writeSignedVarLong(long value, DataOutput out) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @param in to read bytes from
   * @return decode value
   * @throws java.io.IOException if {@link java.io.DataInput} throws {@link java.io.IOException}
   * @throws IllegalArgumentException if variable-length value does not terminate
   *  after 9 bytes have been read
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @param in to read bytes from
   * @return decode value
   * @throws java.io.IOException if {@link java.io.DataInput} throws {@link java.io.IOException}
   * @throws IllegalArgumentException if variable-length value does not terminate
   *  after 9 bytes have been read
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @param in to read bytes from
   * @return decode value
   * @throws java.io.IOException if {@link java.io.DataInput} throws {@link java.io.IOException}
   * @throws IllegalArgumentException if variable-length value does not terminate
   *  after 9 bytes have been read
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @throws IllegalArgumentException if variable-length value does not terminate
   *  after 9 bytes have been read
   * @see #writeUnsignedVarLong(long, java.io.DataOutput)
   */
  public static long readUnsignedVarLong(DataInput in) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @param in to read bytes from
   * @return decode value
   * @throws java.io.IOException if {@link java.io.DataInput} throws {@link java.io.IOException}
   * @throws IllegalArgumentException if variable-length value does not terminate
   *  after 9 bytes have been read
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @param in to read bytes from
   * @return decode value
   * @throws java.io.IOException if {@link java.io.DataInput} throws {@link java.io.IOException}
   * @throws IllegalArgumentException if variable-length value does not terminate
   *  after 9 bytes have been read
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @param in to read bytes from
   * @return decode value
   * @throws java.io.IOException if {@link java.io.DataInput} throws {@link java.io.IOException}
   * @throws IllegalArgumentException if variable-length value does not terminate
   *  after 9 bytes have been read
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @throws IllegalArgumentException if variable-length value does not terminate
   *  after 9 bytes have been read
   * @see #writeSignedVarLong(long, java.io.DataOutput)
   */
  public static long readSignedVarLong(DataInput in) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java

  /**
   * @see #writeSignedVarLong(long, java.io.DataOutput)
   */
  public static void writeSignedVarInt(int value, DataOutput out) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * <a href="http://code.google.com/apis/protocolbuffers/docs/encoding.html">
   * Google Protocol Buffers</a>. Zig-zag is not used, so input must not be negative.
   * If values can be negative, use {@link #writeSignedVarLong(long, java.io.DataOutput)}
   * instead. This method treats negative input as like a large unsigned value.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @param value value to encode
   * @param out to write bytes to
   * @throws java.io.IOException if {@link java.io.DataOutput} throws {@link java.io.IOException}
   */
  public static void writeUnsignedVarLong(long value, DataOutput out) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @param value value to encode
   * @param out to write bytes to
   * @throws java.io.IOException if {@link java.io.DataOutput} throws {@link java.io.IOException}
   */
  public static void writeUnsignedVarLong(long value, DataOutput out) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @param value value to encode
   * @param out to write bytes to
   * @throws java.io.IOException if {@link java.io.DataOutput} throws {@link java.io.IOException}
   */
  public static void writeUnsignedVarLong(long value, DataOutput out) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java

  /**
   * @see #writeUnsignedVarLong(long, java.io.DataOutput)
   */
  public static void writeUnsignedVarInt(int value, DataOutput out) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @throws IllegalArgumentException if variable-length value does not terminate
   *  after 5 bytes have been read
   * @throws java.io.IOException if {@link java.io.DataInput} throws {@link java.io.IOException}
   * @see #readSignedVarLong(java.io.DataInput)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @throws IllegalArgumentException if variable-length value does not terminate
   *  after 5 bytes have been read
   * @throws java.io.IOException if {@link java.io.DataInput} throws {@link java.io.IOException}
   * @see #readSignedVarLong(java.io.DataInput)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   * @throws IllegalArgumentException if variable-length value does not terminate
   *  after 5 bytes have been read
   * @throws java.io.IOException if {@link java.io.DataInput} throws {@link java.io.IOException}
   * @see #readSignedVarLong(java.io.DataInput)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
   *  after 5 bytes have been read
   * @throws java.io.IOException if {@link java.io.DataInput} throws {@link java.io.IOException}
   * @see #readSignedVarLong(java.io.DataInput)
   */
  public static int readSignedVarInt(DataInput in) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java

/**
 * Function objects to be passed to generic methods. Contains the functions of {@link java.lang.Math} as function
 * objects, as well as a few more basic functions. <p>Function objects conveniently allow to express arbitrary functions
 * in a generic manner. Essentially, a function object is an object that can perform a function on some arguments. It
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.function` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
 * has a minimal interface: a method <tt>apply</tt> that takes the arguments, computes something and returns some result
 * value. Function objects are comparable to function pointers in C used for call-backs. <p>Unary functions are of type
 * {@link org.apache.mahout.math.function.DoubleFunction}, binary functions of type {@link
 * org.apache.mahout.math.function.DoubleDoubleFunction}. All can be retrieved via <tt>public static final</tt>
 * variables named after the function. Unary predicates are of type
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.function` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
 * value. Function objects are comparable to function pointers in C used for call-backs. <p>Unary functions are of type
 * {@link org.apache.mahout.math.function.DoubleFunction}, binary functions of type {@link
 * org.apache.mahout.math.function.DoubleDoubleFunction}. All can be retrieved via <tt>public static final</tt>
 * variables named after the function. Unary predicates are of type
 * {@link DoubleProcedure},
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.function` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
 * <li><tt>Functions.pow(3)</tt> gives the function <tt>a<sup>3</sup></tt>. <li><tt>Functions.pow(3).apply(2)==8</tt>.
 * </ul> More general, any binary function can be made an unary functions by fixing either the first or the second
 * argument. See methods {@link #bindArg1(org.apache.mahout.math.function.DoubleDoubleFunction ,double)} and {@link
 * #bindArg2(org.apache.mahout.math.function.DoubleDoubleFunction ,double)}. The order of arguments can
 * be swapped so that the first argument becomes the
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.function` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
 * </ul> More general, any binary function can be made an unary functions by fixing either the first or the second
 * argument. See methods {@link #bindArg1(org.apache.mahout.math.function.DoubleDoubleFunction ,double)} and {@link
 * #bindArg2(org.apache.mahout.math.function.DoubleDoubleFunction ,double)}. The order of arguments can
 * be swapped so that the first argument becomes the
 * second and vice-versa. See method {@link #swapArgs(org.apache.mahout.math.function.DoubleDoubleFunction)}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.function` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
 * #bindArg2(org.apache.mahout.math.function.DoubleDoubleFunction ,double)}. The order of arguments can
 * be swapped so that the first argument becomes the
 * second and vice-versa. See method {@link #swapArgs(org.apache.mahout.math.function.DoubleDoubleFunction)}.
 * Example: <ul> <li><tt>Functions.pow</tt>
 * gives the function <tt>a<sup>b</sup></tt>. <li><tt>Functions.bindArg2(Functions.pow,3)</tt> gives the function
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.function` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
 * general, functions can be chained (composed, assembled). Assume we have two unary functions <tt>g</tt> and
 * <tt>h</tt>. The unary function <tt>g(h(a))</tt> applying both in sequence can be generated via {@link
 * #chain(org.apache.mahout.math.function.DoubleFunction , org.apache.mahout.math.function.DoubleFunction)}:
 * <ul> <li><tt>Functions.chain(g,h);</tt> </ul> Assume further we have a binary
 * function <tt>f</tt>. The binary function <tt>g(f(a,b))</tt> can be generated via {@link
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.function` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
 * general, functions can be chained (composed, assembled). Assume we have two unary functions <tt>g</tt> and
 * <tt>h</tt>. The unary function <tt>g(h(a))</tt> applying both in sequence can be generated via {@link
 * #chain(org.apache.mahout.math.function.DoubleFunction , org.apache.mahout.math.function.DoubleFunction)}:
 * <ul> <li><tt>Functions.chain(g,h);</tt> </ul> Assume further we have a binary
 * function <tt>f</tt>. The binary function <tt>g(f(a,b))</tt> can be generated via {@link
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.function` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
 * <ul> <li><tt>Functions.chain(g,h);</tt> </ul> Assume further we have a binary
 * function <tt>f</tt>. The binary function <tt>g(f(a,b))</tt> can be generated via {@link
 * #chain(org.apache.mahout.math.function.DoubleFunction , org.apache.mahout.math.function.DoubleDoubleFunction)}:
 * <ul> <li><tt>Functions.chain(g,f);</tt> </ul> The binary function
 * <tt>f(g(a),h(b))</tt> can be generated via
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.function` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
 * <ul> <li><tt>Functions.chain(g,h);</tt> </ul> Assume further we have a binary
 * function <tt>f</tt>. The binary function <tt>g(f(a,b))</tt> can be generated via {@link
 * #chain(org.apache.mahout.math.function.DoubleFunction , org.apache.mahout.math.function.DoubleDoubleFunction)}:
 * <ul> <li><tt>Functions.chain(g,f);</tt> </ul> The binary function
 * <tt>f(g(a),h(b))</tt> can be generated via
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.function` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
 * <ul> <li><tt>Functions.chain(g,f);</tt> </ul> The binary function
 * <tt>f(g(a),h(b))</tt> can be generated via
 * {@link #chain(org.apache.mahout.math.function.DoubleDoubleFunction , org.apache.mahout.math.function.DoubleFunction ,
 * org.apache.mahout.math.function.DoubleFunction)}: <ul>
 * <li><tt>Functions.chain(f,g,h);</tt> </ul> Arbitrarily complex functions can be composed from these building blocks.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.function` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
 * <ul> <li><tt>Functions.chain(g,f);</tt> </ul> The binary function
 * <tt>f(g(a),h(b))</tt> can be generated via
 * {@link #chain(org.apache.mahout.math.function.DoubleDoubleFunction , org.apache.mahout.math.function.DoubleFunction ,
 * org.apache.mahout.math.function.DoubleFunction)}: <ul>
 * <li><tt>Functions.chain(f,g,h);</tt> </ul> Arbitrarily complex functions can be composed from these building blocks.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.mahout.math.function` is unnecessary and can be removed
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
 * <tt>f(g(a),h(b))</tt> can be generated via
 * {@link #chain(org.apache.mahout.math.function.DoubleDoubleFunction , org.apache.mahout.math.function.DoubleFunction ,
 * org.apache.mahout.math.function.DoubleFunction)}: <ul>
 * <li><tt>Functions.chain(f,g,h);</tt> </ul> Arbitrarily complex functions can be composed from these building blocks.
 * For example <tt>sin(a) + cos<sup>2</sup>(b)</tt> can be specified as follows: <ul>
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.apache.mahout.math.flavor.TraversingStructureEnum;`
in `core/src/main/java/org/apache/mahout/math/DenseSymmetricMatrix.java`
#### Snippet
```java
package org.apache.mahout.math;

import org.apache.mahout.math.flavor.TraversingStructureEnum;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.mahout.math.flavor.TraversingStructureEnum;`
in `core/src/main/java/org/apache/mahout/math/DiagonalMatrix.java`
#### Snippet
```java

import org.apache.mahout.math.flavor.MatrixFlavor;
import org.apache.mahout.math.flavor.TraversingStructureEnum;

import java.util.Iterator;
```

### UNUSED_IMPORT
Unused import `import org.apache.mahout.math.flavor.TraversingStructureEnum;`
in `core/src/main/java/org/apache/mahout/math/SparseColumnMatrix.java`
#### Snippet
```java
package org.apache.mahout.math;

import org.apache.mahout.math.flavor.TraversingStructureEnum;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.mahout.math.flavor.TraversingStructureEnum;`
in `core/src/main/java/org/apache/mahout/math/SparseRowMatrix.java`
#### Snippet
```java

import org.apache.mahout.math.flavor.MatrixFlavor;
import org.apache.mahout.math.flavor.TraversingStructureEnum;
import org.apache.mahout.math.function.DoubleDoubleFunction;
import org.apache.mahout.math.function.Functions;
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`iter = iter + 1` could be simplified to 'iter += 1'
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
          }
          e[p - 2] = f;
          iter = iter + 1;
        }
          break;
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
    while (from <= to) {
      mid = (from + to) >>> 1;
      if ((result = array[mid].compareTo(object)) < 0) {
        from = mid + 1;
      } else if (result == 0) {
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
    while (from <= to) {
      mid = (from + to) >>> 1;
      if ((result = comparator.compare(array[mid], object)) < 0) {
        from = mid + 1;
      } else if (result == 0) {
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/AbstractVector.java`
#### Snippet
```java
      return lengthSquared;
    }
    return lengthSquared = dotSelf();
  }

```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/jet/random/Poisson.java`
#### Snippet
```java
        int X;
        int Dk;
        if ((U = gen.nextDouble() * p6) < p2) {         // centre left

          // immediate acceptance region R2 = [k2, m) *[0, f2),  X = k2, ... m -1
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/jet/random/Poisson.java`
#### Snippet
```java

          // immediate acceptance region R2 = [k2, m) *[0, f2),  X = k2, ... m -1
          if ((V = U - p1) < 0.0) {
            return k2 + (int) (U / f2);
          }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/jet/random/Poisson.java`
#### Snippet
```java
          }
          // immediate acceptance region R1 = [k1, k2)*[0, f1),  X = k1, ... k2-1
          if ((W = V / dl) < f1) {
            return k1 + (int) (V / f1);
          }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/jet/random/Poisson.java`
#### Snippet
```java
            return k2 - Dk;                          // X = k2 - Dk
          }
          if ((V = f2 + f2 - W) < 1.0) {                // quick reject of Y
            Y = k2 + Dk;
            if (V <= f2 + Dk * (1.0 - f2) / (dl + 1.0)) { // quick accept of
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/jet/random/Poisson.java`
#### Snippet
```java
        } else if (U < p4) {                                 // centre right
          // immediate acceptance region R3 = [m, k4+1)*[0, f4), X = m, ... k4
          if ((V = U - p3) < 0.0) {
            return k4 - (int) ((U - p2) / f4);
          }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/jet/random/Poisson.java`
#### Snippet
```java
          }
          // immediate acceptance region R4 = [k4+1, k5+1)*[0, f5)
          if ((W = V / dr) < f5) {
            return k5 - (int) (V / f5);
          }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/jet/random/Poisson.java`
#### Snippet
```java
            return k4 + Dk;                           // X = k4 + Dk
          }
          if ((V = f4 + f4 - W) < 1.0) {                 // quick reject of Y
            Y = k4 - Dk;
            if (V <= f4 + Dk * (1.0 - f4) / dr) {       // quick accept of
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/jet/random/Poisson.java`
#### Snippet
```java
          if (U < p5) {                                  // expon. tail left
            Dk = (int) (1.0 - Math.log(W) / ll);
            if ((X = k1 - Dk) < 0) {
              continue;
            }          // 0 <= X <= k1 - 1
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/decomposer/lanczos/LanczosSolver.java`
#### Snippet
```java
      Vector basisVector = state.getBasisVector(i);
      double alpha;
      if (basisVector == null || (alpha = nextVector.dot(basisVector)) == 0.0) {
        continue;
      }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
          do {
            out[j--] = prev;
          } while (j > start && (c.compare(prev = out[j - 1], current) > 0));
          out[j] = current;
        }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
          do {
            out[j--] = prev;
          } while (j > start && (c.compare(prev = out[j - 1], current) > 0));
          out[j] = current;
        }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
          do {
            out[j--] = prev;
          } while (j > start && (c.compare(prev = out[j - 1], current) > 0));
          out[j] = current;
        }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    while (true) {
      int comparison;
      while (b <= c && (comparison = comp.compare(partionValue, array[b])) >= 0) {
        if (comparison == 0) {
          temp = array[a];
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        b++;
      }
      while (c >= b && (comparison = comp.compare(array[c], partionValue)) >= 0) {
        if (comparison == 0) {
          temp = array[c];
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[h++] = temp;
    }
    if ((length = b - a) > 0) {
      quickSort0(start, start + length, array, comp);
    }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      quickSort0(start, start + length, array, comp);
    }
    if ((length = d - c) > 0) {
      quickSort0(end - length, end, array, comp);
    }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
          do {
            out[j--] = prev;
          } while (j > start && (c.compare(prev = out[j - 1], current) > 0));
          out[j] = current;
        }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
          do {
            out[j--] = prev;
          } while (j > start && (c.compare(prev = out[j - 1], current) > 0));
          out[j] = current;
        }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      // as long as values less than the partition or equal are found, also stop when a..b collides with c..d
      int comparison;
      while (b <= c && (comparison = comp.compare(b, partitionIndex)) <= 0) {
        if (comparison == 0) {
          if (a == partitionIndex) {
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      // also, either b>c or v[b] > partition value

      while (c >= b && (comparison = comp.compare(c, partitionIndex)) >= 0) {
        if (comparison == 0) {
          if (c == partitionIndex) {
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
          do {
            out[j--] = prev;
          } while (j > start && (c.compare(prev = out[j - 1], current) > 0));
          out[j] = current;
        }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
          do {
            out[j--] = prev;
          } while (j > start && (c.compare(prev = out[j - 1], current) > 0));
          out[j] = current;
        }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    while (true) {
      int comparison;
      while (b <= c && (comparison = comp.compare(array[b], partionValue)) <= 0) {
        if (comparison == 0) {
          temp = array[a];
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        b++;
      }
      while (c >= b && (comparison = comp.compare(array[c], partionValue)) >= 0) {
        if (comparison == 0) {
          temp = array[c];
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[h++] = temp;
    }
    if ((length = b - a) > 0) {
      quickSort0(start, start + length, array, comp);
    }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      quickSort0(start, start + length, array, comp);
    }
    if ((length = d - c) > 0) {
      quickSort0(end - length, end, array, comp);
    }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    while (true) {
      int comparison;
      while (b <= c && (comparison = comp.compare(array[b], partionValue)) <= 0) {
        if (comparison == 0) {
          temp = array[a];
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        b++;
      }
      while (c >= b && (comparison = comp.compare(array[c], partionValue)) >= 0) {
        if (comparison == 0) {
          temp = array[c];
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[h++] = temp;
    }
    if ((length = b - a) > 0) {
      quickSort0(start, start + length, array, comp);
    }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      quickSort0(start, start + length, array, comp);
    }
    if ((length = d - c) > 0) {
      quickSort0(end - length, end, array, comp);
    }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    while (true) {
      int comparison;
      while (b <= c && (comparison = comp.compare(array[b], partionValue)) <= 0) {
        if (comparison == 0) {
          temp = array[a];
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        b++;
      }
      while (c >= b && (comparison = comp.compare(array[c], partionValue)) >= 0) {
        if (comparison == 0) {
          temp = array[c];
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[h++] = temp;
    }
    if ((length = b - a) > 0) {
      quickSort0(start, start + length, array, comp);
    }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      quickSort0(start, start + length, array, comp);
    }
    if ((length = d - c) > 0) {
      quickSort0(end - length, end, array, comp);
    }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    while (true) {
      int comparison;
      while (b <= c && (comparison = comp.compare(partionValue, array[b])) >= 0) {
        if (comparison == 0) {
          temp = array[a];
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        b++;
      }
      while (c >= b && (comparison = comp.compare(array[c], partionValue)) >= 0) {
        if (comparison == 0) {
          temp = array[c];
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[h++] = temp;
    }
    if ((length = b - a) > 0) {
      quickSort0(start, start + length, array, comp);
    }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      quickSort0(start, start + length, array, comp);
    }
    if ((length = d - c) > 0) {
      quickSort0(end - length, end, array, comp);
    }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    while (true) {
      int comparison;
      while (b <= c && (comparison = comp.compare(array[b], partionValue)) < 0) {
        if (comparison == 0) {
          temp = array[a];
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        b++;
      }
      while (c >= b && (comparison = comp.compare(array[c], partionValue)) > 0) {
        if (comparison == 0) {
          temp = array[c];
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[h++] = temp;
    }
    if ((length = b - a) > 0) {
      quickSort0(start, start + length, array, comp);
    }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      quickSort0(start, start + length, array, comp);
    }
    if ((length = d - c) > 0) {
      quickSort0(end - length, end, array, comp);
    }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    while (true) {
      int comparison;
      while (b <= c && (comparison = comp.compare(array[b], partionValue)) <= 0) {
        if (comparison == 0) {
          temp = array[a];
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        b++;
      }
      while (c >= b && (comparison = comp.compare(array[c], partionValue)) >= 0) {
        if (comparison == 0) {
          temp = array[c];
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[h++] = temp;
    }
    if ((length = b - a) > 0) {
      quickSort0(start, start + length, array, comp);
    }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      quickSort0(start, start + length, array, comp);
    }
    if ((length = d - c) > 0) {
      quickSort0(end - length, end, array, comp);
    }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
          do {
            out[j--] = prev;
          } while (j > start && (c.compare(prev = out[j - 1], current) > 0));
          out[j] = current;
        }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    while (true) {
      int comparison;
      while (b <= c && (comparison = comp.compare(array[b], partionValue)) <= 0) {
        if (comparison == 0) {
          temp = array[a];
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        b++;
      }
      while (c >= b && (comparison = comp.compare(array[c], partionValue)) >= 0) {
        if (comparison == 0) {
          temp = array[c];
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[h++] = temp;
    }
    if ((length = b - a) > 0) {
      quickSort0(start, start + length, array, comp);
    }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      quickSort0(start, start + length, array, comp);
    }
    if ((length = d - c) > 0) {
      quickSort0(end - length, end, array, comp);
    }
```

### NestedAssignment
Result of assignment expression used
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
    int i = 0;
    int b;
    while (((b = in.readByte()) & 0x80) != 0) {
      value |= (b & 0x7F) << i;
      i += 7;
```

### NestedAssignment
Result of assignment expression used
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
    int i = 0;
    long b;
    while (((b = in.readByte()) & 0x80L) != 0) {
      value |= (b & 0x7F) << i;
      i += 7;
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/solver/EigenDecomposition.java`
#### Snippet
```java
          }
          s = Math.abs(h.getQuick(n, n - 1)) + Math.abs(h.getQuick(n - 1, n - 2));
          x = y = 0.75 * s;
          w = -0.4375 * s * s;
        }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/solver/EigenDecomposition.java`
#### Snippet
```java
            }
            exshift += s;
            x = y = w = 0.964;
          }
        }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/mahout/math/solver/EigenDecomposition.java`
#### Snippet
```java
            }
            exshift += s;
            x = y = w = 0.964;
          }
        }
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `props` are queried, but never updated
in `core/src/main/java/org/apache/mahout/math/decomposer/hebbian/HebbianSolver.java`
#### Snippet
```java

  public static void main(String[] args) {
    Properties props = new Properties();
    String propertiesFile = args.length > 0 ? args[0] : "config/solver.properties";
    //  props.load(new FileInputStream(propertiesFile));
```

## RuleId[ruleID=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Function() can be replaced with method reference
in `core/src/main/java/org/apache/mahout/math/FileBasedSparseBinaryMatrix.java`
#### Snippet
```java
    for (MatrixSlice row : m) {
      List<Integer> columns = Lists.newArrayList(Iterables.transform(row.vector().nonZeroes(),
        new Function<Vector.Element, Integer>() {
          @Override
          public Integer apply(Vector.Element element) {
```

### Anonymous2MethodRef
Anonymous new Iterable() can be replaced with method reference
in `core/src/main/java/org/apache/mahout/math/AbstractVector.java`
#### Snippet
```java
  @Override
  public Iterable<Element> all() {
    return new Iterable<Element>() {
      @Override
      public Iterator<Element> iterator() {
```

### Anonymous2MethodRef
Anonymous new Iterable() can be replaced with method reference
in `core/src/main/java/org/apache/mahout/math/AbstractVector.java`
#### Snippet
```java
  @Override
  public Iterable<Element> nonZeroes() {
    return new Iterable<Element>() {
      @Override
      public Iterator<Element> iterator() {
```

### Anonymous2MethodRef
Anonymous new ObjectProcedure() can be replaced with method reference
in `core/src/main/java/org/apache/mahout/math/set/OpenHashSet.java`
#### Snippet
```java
    }

    return forEachKey(new ObjectProcedure<T>() {
      @Override
      public boolean apply(T key) {
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `core/src/main/java/org/apache/mahout/math/als/ImplicitFeedbackAlternatingLeastSquaresSolver.java`
#### Snippet
```java
        final int ii = i;
        final int jj = j;
        queue.execute(new Runnable() {
          @Override
          public void run() {
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/org/apache/mahout/math/ConstantVector.java`
#### Snippet
```java
  public Iterator<Element> iterator() {
    return new AbstractIterator<Element>() {
      private int i = 0;
      private final int n = size();
      @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/org/apache/mahout/math/FileBasedSparseBinaryMatrix.java`
#### Snippet
```java
    public Iterator<Element> iterateNonZero() {
      return new AbstractIterator<Element>() {
        int i = 0;
        @Override
        protected Element computeNext() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/org/apache/mahout/math/FileBasedSparseBinaryMatrix.java`
#### Snippet
```java
    public Iterator<Element> iterator() {
      return new AbstractIterator<Element>() {
        int i = 0;

        @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/mahout/math/RandomTrinaryMatrix.java`
#### Snippet
```java

  // set this to true to use a high quality hash
  private boolean highQuality = false;

  public RandomTrinaryMatrix(int seed, int rows, int columns, boolean highQuality) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/org/apache/mahout/math/DiagonalMatrix.java`
#### Snippet
```java
    protected Iterator<Element> iterator() {
      return new Iterator<Element>() {
        int i = 0;

        Element r = new Element() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/org/apache/mahout/math/random/ChineseRestaurant.java`
#### Snippet
```java
  private final double alpha;
  private double weight = 0;
  private double discount = 0;
  private final DoubleArrayList weights = new DoubleArrayList();
  private final Random rand = RandomUtils.getRandom();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/org/apache/mahout/math/random/ChineseRestaurant.java`
#### Snippet
```java

  private final double alpha;
  private double weight = 0;
  private double discount = 0;
  private final DoubleArrayList weights = new DoubleArrayList();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/org/apache/mahout/math/random/Normal.java`
#### Snippet
```java
public final class Normal extends AbstractSamplerFunction {
  private final Random rand = RandomUtils.getRandom();
  private double mean = 0;
  private double sd = 1;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/mahout/math/random/IndianBuffet.java`
#### Snippet
```java
  private int documents = 0;
  private final double alpha;
  private WordFunction<T> converter = null;
  private final Random gen;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/org/apache/mahout/math/random/IndianBuffet.java`
#### Snippet
```java
public final class IndianBuffet<T> implements Sampler<List<T>> {
  private final List<Integer> count = Lists.newArrayList();
  private int documents = 0;
  private final double alpha;
  private WordFunction<T> converter = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/mahout/common/RandomUtils.java`
#### Snippet
```java
      Collections.synchronizedMap(new WeakHashMap<RandomWrapper,Boolean>());

  private static boolean testSeed = false;

  private RandomUtils() { }
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/org/apache/mahout/math/decomposer/hebbian/HebbianSolver.java`
#### Snippet
```java
  private final Random rng = RandomUtils.getRandom();

  private int numPasses = 0;

  /**
```

## RuleId[ruleID=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `core/src/main/java/org/apache/mahout/math/DenseVector.java`
#### Snippet
```java

/** Implements vector as an array of doubles */
public class DenseVector extends AbstractVector {

  private double[] values;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `core/src/main/java/org/apache/mahout/math/list/ObjectArrayList.java`
#### Snippet
```java
*/

public class ObjectArrayList<T> extends AbstractObjectList<T> {

  /**
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `core/src/main/java/org/apache/mahout/math/map/OpenHashMap.java`
#### Snippet
```java
  * are <strong>not</strong> reflected in the container.
 **/
public class OpenHashMap<K,V> extends AbstractSet implements Map<K,V> {
  protected static final byte FREE = 0;
  protected static final byte FULL = 1;
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `row`
in `core/src/main/java/org/apache/mahout/math/DenseSymmetricMatrix.java`
#### Snippet
```java
    if (column < row) {
      int swap = row;
      row = column;
      column = swap;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `column`
in `core/src/main/java/org/apache/mahout/math/DenseSymmetricMatrix.java`
#### Snippet
```java
      int swap = row;
      row = column;
      column = swap;
    }
    return super.getQuick(row, column);
```

### AssignmentToMethodParameter
Assignment to method parameter `row`
in `core/src/main/java/org/apache/mahout/math/DenseSymmetricMatrix.java`
#### Snippet
```java
    if (column < row) {
      int swap = row;
      row = column;
      column = swap;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `column`
in `core/src/main/java/org/apache/mahout/math/DenseSymmetricMatrix.java`
#### Snippet
```java
      int swap = row;
      row = column;
      column = swap;
    }
    super.setQuick(row, column, value);
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
      mid = (from + to) >>> 1;
      if (value > array[mid]) {
        from = mid + 1;
      } else if (value == array[mid]) {
        return mid;
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
        return mid;
      } else {
        to = mid - 1;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
      mid = (from + to) >>> 1;
      if (lessThan(array[mid], value)) {
        from = mid + 1;
      } else if (longBits == Double.doubleToLongBits(array[mid])) {
        return mid;
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
        return mid;
      } else {
        to = mid - 1;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
      mid = (from + to) >>> 1;
      if (value > array[mid]) {
        from = mid + 1;
      } else if (value == array[mid]) {
        return mid;
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
        return mid;
      } else {
        to = mid - 1;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
      mid = (from + to) >>> 1;
      if (value > array[mid]) {
        from = mid + 1;
      } else if (value == array[mid]) {
        return mid;
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
        return mid;
      } else {
        to = mid - 1;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
      mid = (from + to) >>> 1;
      if (value > array[mid]) {
        from = mid + 1;
      } else if (value == array[mid]) {
        return mid;
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
        return mid;
      } else {
        to = mid - 1;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
      mid = (from + to) >>> 1;
      if ((result = array[mid].compareTo(object)) < 0) {
        from = mid + 1;
      } else if (result == 0) {
        return mid;
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
        return mid;
      } else {
        to = mid - 1;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
      mid = (from + to) >>> 1;
      if (lessThan(array[mid], value)) {
        from = mid + 1;
      } else if (intBits == Float.floatToIntBits(array[mid])) {
        return mid;
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
        return mid;
      } else {
        to = mid - 1;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
      mid = (from + to) >>> 1;
      if (value > array[mid]) {
        from = mid + 1;
      } else if (value == array[mid]) {
        return mid;
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
        return mid;
      } else {
        to = mid - 1;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
      mid = (from + to) >>> 1;
      if ((result = comparator.compare(array[mid], object)) < 0) {
        from = mid + 1;
      } else if (result == 0) {
        return mid;
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
        return mid;
      } else {
        to = mid - 1;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `row`
in `core/src/main/java/org/apache/mahout/math/FileBasedSparseBinaryMatrix.java`
#### Snippet
```java
    SparseBinaryVector(ByteBuffer row, int maxIndex, int offset, int size) {
      super(maxIndex);
      row = row.asReadOnlyBuffer();
      row.position(offset);
      row.limit(offset + size * 4);
```

### AssignmentToMethodParameter
Assignment to method parameter `row`
in `core/src/main/java/org/apache/mahout/math/FileBasedSparseBinaryMatrix.java`
#### Snippet
```java
      row.position(offset);
      row.limit(offset + size * 4);
      row = row.slice();
      this.buffer = row.slice().asIntBuffer();
      this.maxIndex = maxIndex;
```

### AssignmentToMethodParameter
Assignment to method parameter `k`
in `core/src/main/java/org/apache/mahout/math/jet/math/Arithmetic.java`
#### Snippet
```java
      }
      if (k > n / 2) {
        k = n - k;
      } // quicker
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `core/src/main/java/org/apache/mahout/math/Arrays.java`
#### Snippet
```java
    if (array.length > maxCapacity) {
      double[] oldArray = array;
      array = new double[maxCapacity];
      System.arraycopy(oldArray, 0, array, 0, maxCapacity);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `core/src/main/java/org/apache/mahout/math/Arrays.java`
#### Snippet
```java
    if (array.length > maxCapacity) {
      float[] oldArray = array;
      array = new float[maxCapacity];
      System.arraycopy(oldArray, 0, array, 0, maxCapacity);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `core/src/main/java/org/apache/mahout/math/Arrays.java`
#### Snippet
```java
    if (array.length > maxCapacity) {
      boolean[] oldArray = array;
      array = new boolean[maxCapacity];
      System.arraycopy(oldArray, 0, array, 0, maxCapacity);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `core/src/main/java/org/apache/mahout/math/Arrays.java`
#### Snippet
```java
    if (array.length > maxCapacity) {
      char[] oldArray = array;
      array = new char[maxCapacity];
      System.arraycopy(oldArray, 0, array, 0, maxCapacity);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `core/src/main/java/org/apache/mahout/math/Arrays.java`
#### Snippet
```java
    if (array.length > maxCapacity) {
      byte[] oldArray = array;
      array = new byte[maxCapacity];
      System.arraycopy(oldArray, 0, array, 0, maxCapacity);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `core/src/main/java/org/apache/mahout/math/Arrays.java`
#### Snippet
```java
    if (array.length > maxCapacity) {
      short[] oldArray = array;
      array = new short[maxCapacity];
      System.arraycopy(oldArray, 0, array, 0, maxCapacity);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `core/src/main/java/org/apache/mahout/math/Arrays.java`
#### Snippet
```java
    if (array.length > maxCapacity) {
      long[] oldArray = array;
      array = new long[maxCapacity];
      System.arraycopy(oldArray, 0, array, 0, maxCapacity);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `core/src/main/java/org/apache/mahout/math/Arrays.java`
#### Snippet
```java
    if (array.length > maxCapacity) {
      int[] oldArray = array;
      array = new int[maxCapacity];
      System.arraycopy(oldArray, 0, array, 0, maxCapacity);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `core/src/main/java/org/apache/mahout/math/Arrays.java`
#### Snippet
```java
    if (array.length > maxCapacity) {
      Object[] oldArray = array;
      array = new Object[maxCapacity];
      System.arraycopy(oldArray, 0, array, 0, maxCapacity);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `seed`
in `core/src/main/java/org/apache/mahout/math/jet/random/engine/MersenneTwister.java`
#### Snippet
```java
    for (int i = 0; i < N; i++) {
      mt[i] = seed & 0xffff0000;
      seed = 69069 * seed + 1;
      mt[i] |= (seed & 0xffff0000) >>> 16;
      seed = 69069 * seed + 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `seed`
in `core/src/main/java/org/apache/mahout/math/jet/random/engine/MersenneTwister.java`
#### Snippet
```java
      seed = 69069 * seed + 1;
      mt[i] |= (seed & 0xffff0000) >>> 16;
      seed = 69069 * seed + 1;
    }
    //log.info("init done");
```

### AssignmentToMethodParameter
Assignment to method parameter `x`
in `core/src/main/java/org/apache/mahout/math/jet/random/Gamma.java`
#### Snippet
```java

    double z;
    for (z = 1.0; x < 11.0; x++) {
      z *= x;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `x`
in `core/src/main/java/org/apache/mahout/math/jet/stat/Gamma.java`
#### Snippet
```java
      z = 1.0;
      while (x >= 3.0) {
        x -= 1.0;
        z *= x;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `x`
in `core/src/main/java/org/apache/mahout/math/jet/stat/Gamma.java`
#### Snippet
```java
        }
        z /= x;
        x += 1.0;
      }
      if (z < 0.0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `x`
in `core/src/main/java/org/apache/mahout/math/jet/stat/Gamma.java`
#### Snippet
```java
        return Math.log(z);
      }
      x -= 2.0;
      p = x * Polynomial.polevl(x, bCoefficient, 5) / Polynomial.p1evl(x, cCoefficient, 6);
      return Math.log(z) + p;
```

### AssignmentToMethodParameter
Assignment to method parameter `x`
in `core/src/main/java/org/apache/mahout/math/jet/stat/Gamma.java`
#### Snippet
```java
    z = 1.0;
    while (x >= 3.0) {
      x -= 1.0;
      z *= x;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `x`
in `core/src/main/java/org/apache/mahout/math/jet/stat/Gamma.java`
#### Snippet
```java
      }
      z /= x;
      x += 1.0;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `x`
in `core/src/main/java/org/apache/mahout/math/jet/stat/Gamma.java`
#### Snippet
```java
      }
      z /= x;
      x += 1.0;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `x`
in `core/src/main/java/org/apache/mahout/math/jet/stat/Gamma.java`
#### Snippet
```java
    }

    x -= 2.0;
    p = Polynomial.polevl(x, pCoefficient, 6);
    q = Polynomial.polevl(x, qCoefficient, 7);
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
      and not sampled elements included in the result set.
    */
    n = N - n; // IMPORTANT !!!

    //long threshold;
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
      }

      count -= iter;
      while (--iter >= 0) {
        values[fromIndex++] = ++chosen;
```

### AssignmentToMethodParameter
Assignment to method parameter `fromIndex`
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
      count -= iter;
      while (--iter >= 0) {
        values[fromIndex++] = ++chosen;
      }
      chosen++;
```

### AssignmentToMethodParameter
Assignment to method parameter `N`
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
      chosen++;

      N -= S + 1;
      Nreal = negSreal - 1.0 + Nreal;
      n--;
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
      N -= S + 1;
      Nreal = negSreal - 1.0 + Nreal;
      n--;
      nreal--;
      ninv = nmin1inv;
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
      }

      count -= iter;
      while (--iter >= 0) {
        values[fromIndex++] = ++chosen;
```

### AssignmentToMethodParameter
Assignment to method parameter `fromIndex`
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
      count -= iter;
      while (--iter >= 0) {
        values[fromIndex++] = ++chosen;
      }

```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java

      // fill the rest
      while (--count >= 0) {
        values[fromIndex++] = ++chosen;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `fromIndex`
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
      // fill the rest
      while (--count >= 0) {
        values[fromIndex++] = ++chosen;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `randomGenerator`
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
    }
    if (randomGenerator == null) {
      randomGenerator = RandomUtils.getRandom();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `fromIndex`
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
      //step D5: select the (S+1)st record !
      chosen += S + 1;
      values[fromIndex++] = chosen;
      /*
      // invert
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
      chosen++;
      */
      count--;

      N -= S + 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `N`
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
      count--;

      N -= S + 1;
      Nreal = negSreal - 1.0 + Nreal;
      n--;
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
      N -= S + 1;
      Nreal = negSreal - 1.0 + Nreal;
      n--;
      nreal--;
      ninv = nmin1inv;
```

### AssignmentToMethodParameter
Assignment to method parameter `fromIndex`
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
        S = (long) (N * vprime);
        chosen += S + 1;
        values[fromIndex++] = chosen;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `fromIndex`
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
      }
      chosen += S + 1;
      values[fromIndex++] = chosen;
      count--;
      Nreal--;
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
      chosen += S + 1;
      values[fromIndex++] = chosen;
      count--;
      Nreal--;
      n--;
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
      count--;
      Nreal--;
      n--;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `u`
in `core/src/main/java/org/apache/mahout/math/random/Empirical.java`
#### Snippet
```java
      // generate from left tail
      if (u == 0) {
        u = 1.0e-16;
      }
      return y[0] + Math.log(u / x[0]) * x[0] * (y[1] - y[0]) / (x[1] - x[0]);
```

### AssignmentToMethodParameter
Assignment to method parameter `u`
in `core/src/main/java/org/apache/mahout/math/random/Empirical.java`
#### Snippet
```java
    } else if (exceedMaximum && u > x[n - 1]) {
      if (u == 1) {
        u = 1 - 1.0e-16;
      }
      // generate from right tail
```

### AssignmentToMethodParameter
Assignment to method parameter `u`
in `core/src/main/java/org/apache/mahout/math/random/Multinomial.java`
#### Snippet
```java

  public T sample(double u) {
    u *= weight.get(1);

    int n = 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `u`
in `core/src/main/java/org/apache/mahout/math/random/Multinomial.java`
#### Snippet
```java
        n = 2 * n;
      } else {
        u -= left;
        n = 2 * n + 1;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `core/src/main/java/org/apache/mahout/math/solver/LSMR.java`
#### Snippet
```java
      if (old != null) {
        double x = v.dot(old);
        v = v.minus(old.times(x));
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `k`
in `core/src/main/java/org/apache/mahout/collections/Arithmetic.java`
#### Snippet
```java
      }
      if (k > n / 2) {
        k = n - k;
      } // quicker
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    while (m <= r) {
      if (c.compare(val, arr[m]) > bnd) {
        l = m + 1;
      } else {
        r = m - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        l = m + 1;
      } else {
        r = m - 1;
        break;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      m = (l + r) >>> 1;
      if (c.compare(val, arr[m]) > bnd) {
        l = m + 1;
      } else {
        r = m - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        l = m + 1;
      } else {
        r = m - 1;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `middle`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    // end inline
  
    middle = firstCut + (secondCut - middle);
    inplaceMerge(first, firstCut, middle, comp, swapper);
    inplaceMerge(middle, secondCut, last, comp, swapper);
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    while (m <= r) {
      if (c.compare(val, arr[m]) > bnd) {
        l = m + 1;
      } else {
        r = m - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        l = m + 1;
      } else {
        r = m - 1;
        break;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      m = (l + r) >>> 1;
      if (c.compare(val, arr[m]) > bnd) {
        l = m + 1;
      } else {
        r = m - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        l = m + 1;
      } else {
        r = m - 1;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    while (m <= r) {
      if (c.compare(val, arr[m]) > bnd) {
        l = m + 1;
      } else {
        r = m - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        l = m + 1;
      } else {
        r = m - 1;
        break;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      m = (l + r) >>> 1;
      if (c.compare(val, arr[m]) > bnd) {
        l = m + 1;
      } else {
        r = m - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        l = m + 1;
      } else {
        r = m - 1;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        out[i++] = rVal;
        r++;
        start = l_1 + 1;
      } else {
        int r_1 = find(in, fromVal, 0, r + 1, end - 1, c);
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        i += toCopy;
        out[i++] = fromVal;
        start++;
        r = r_1 + 1;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        out[i++] = rVal;
        r++;
        start = l_1 + 1;
      } else {
        int r_1 = find(in, fromVal, 0, r + 1, end - 1, c);
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        i += toCopy;
        out[i++] = fromVal;
        start++;
        r = r_1 + 1;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    while (m <= r) {
      if (c.compare(val, arr[m]) > bnd) {
        l = m + 1;
      } else {
        r = m - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        l = m + 1;
      } else {
        r = m - 1;
        break;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      m = (l + r) >>> 1;
      if (c.compare(val, arr[m]) > bnd) {
        l = m + 1;
      } else {
        r = m - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        l = m + 1;
      } else {
        r = m - 1;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    while (m <= r) {
      if (c.compare(val, arr[m]) > bnd) {
        l = m + 1;
      } else {
        r = m - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        l = m + 1;
      } else {
        r = m - 1;
        break;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      m = (l + r) >>> 1;
      if (c.compare(val, arr[m]) > bnd) {
        l = m + 1;
      } else {
        r = m - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        l = m + 1;
      } else {
        r = m - 1;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        out[i++] = rVal;
        r++;
        start = l_1 + 1;
      } else {
        int r_1 = find(in, fromVal, 0, r + 1, end - 1, c);
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        i += toCopy;
        out[i++] = fromVal;
        start++;
        r = r_1 + 1;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `first`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      int middle = first + half;
      if (comp.compare(middle, x) < 0) {
        first = middle + 1;
        len -= half + 1;
      } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        out[i++] = rVal;
        r++;
        start = l_1 + 1;
      } else {
        int r_1 = find(in, fromVal, 0, r + 1, end - 1, c);
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        i += toCopy;
        out[i++] = fromVal;
        start++;
        r = r_1 + 1;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    while (m <= r) {
      if (c.compare(val, arr[m]) > bnd) {
        l = m + 1;
      } else {
        r = m - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        l = m + 1;
      } else {
        r = m - 1;
        break;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      m = (l + r) >>> 1;
      if (c.compare(val, arr[m]) > bnd) {
        l = m + 1;
      } else {
        r = m - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        l = m + 1;
      } else {
        r = m - 1;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    while (m <= r) {
      if (c.compare(val, arr[m]) > bnd) {
        l = m + 1;
      } else {
        r = m - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        l = m + 1;
      } else {
        r = m - 1;
        break;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      m = (l + r) >>> 1;
      if (c.compare(val, arr[m]) > bnd) {
        l = m + 1;
      } else {
        r = m - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        l = m + 1;
      } else {
        r = m - 1;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        out[i++] = rVal;
        r++;
        start = l_1 + 1;
      } else {
        int r_1 = find(in, fromVal, 0, r + 1, end - 1, c);
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        i += toCopy;
        out[i++] = fromVal;
        start++;
        r = r_1 + 1;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        out[i++] = rVal;
        r++;
        start = l_1 + 1;
      } else {
        int r_1 = find(in, fromVal, 0, r + 1, end - 1, c);
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        i += toCopy;
        out[i++] = fromVal;
        start++;
        r = r_1 + 1;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        out[i++] = rVal;
        r++;
        start = l_1 + 1;
      } else {
        int r_1 = find(in, fromVal, 0, r + 1, end - 1, c);
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        i += toCopy;
        out[i++] = fromVal;
        start++;
        r = r_1 + 1;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    while (m <= r) {
      if (c.compare(val, arr[m]) > bnd) {
        l = m + 1;
      } else {
        r = m - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        l = m + 1;
      } else {
        r = m - 1;
        break;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      m = (l + r) >>> 1;
      if (c.compare(val, arr[m]) > bnd) {
        l = m + 1;
      } else {
        r = m - 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `r`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        l = m + 1;
      } else {
        r = m - 1;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `first`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        len = half;
      } else {
        first = middle + 1;
        len -= half + 1;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        out[i++] = rVal;
        r++;
        start = l_1 + 1;
      } else {
        int r_1 = find(in, fromVal, 0, r + 1, end - 1, c);
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        i += toCopy;
        out[i++] = fromVal;
        start++;
        r = r_1 + 1;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
    while ((value & 0xFFFFFFFFFFFFFF80L) != 0L) {
      out.writeByte(((int) value & 0x7F) | 0x80);
      value >>>= 7;
    }
    out.writeByte((int) value & 0x7F);
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `engine/hdfs/src/main/java/org/apache/mahout/math/Varint.java`
#### Snippet
```java
    while ((value & 0xFFFFFF80) != 0L) {
      out.writeByte((value & 0x7F) | 0x80);
      value >>>= 7;
    }
    out.writeByte(value & 0x7F);
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/mahout/math/map/OpenHashMap.java`
#### Snippet
```java
    int i = indexOfKey((K)key);
    if (i < 0) {
      return null;
    } //not contained
    return (V)values[i];
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/mahout/math/map/OpenHashMap.java`
#### Snippet
```java
    int i = indexOfKey((K)key);
    if (i < 0) {
      return null;
    }
    // key not contained
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `decorated` is redundant
in `core/src/main/java/org/apache/mahout/math/VectorView.java`
#### Snippet
```java
        Element el = it.next();
        if (isInView(el.index()) && el.get() != 0) {
          Element decorated = el; /* vector.getElement(el.index()); */
          return new DecoratorElement(decorated);
        }
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `core/src/main/java/org/apache/mahout/math/decomposer/AsyncEigenVerifier.java`
#### Snippet
```java
    public void run() {
      EigenStatus status = innerVerify(corpus, vector);
      synchronized (AsyncEigenVerifier.this) {
        AsyncEigenVerifier.this.status = status;
        finished = true;
```

## RuleId[ruleID=UseCompareMethod]
### UseCompareMethod
Expression can be replaced with 'Long.compare'
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    @Override
    public int compare(long o1, long o2) {
      return o1 < o2 ? -1 : o1 > o2 ? 1 : 0;
    }
  };
```

### UseCompareMethod
Expression can be replaced with 'Integer.compare'
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    @Override
    public int compare(int o1, int o2) {
      return o1 < o2 ? -1 : o1 > o2 ? 1 : 0;
    }
  };
```

### UseCompareMethod
Expression can be replaced with 'Integer.compare'
in `engine/hdfs/src/main/java/org/apache/mahout/math/VarIntWritable.java`
#### Snippet
```java
  @Override
  public int compareTo(VarIntWritable other) {
    if (value < other.value) {
      return -1;
    }
```

### UseCompareMethod
Expression can be replaced with 'Double.compare'
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
    @Override
    public double apply(double a, double b) {
      return a < b ? -1 : a > b ? 1 : 0;
    }
  };
```

### UseCompareMethod
Expression can be replaced with 'Double.compare'
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
      @Override
      public double apply(double a) {
        return a < b ? -1 : a > b ? 1 : 0;
      }
    };
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `highQuality` initializer `false` is redundant
in `core/src/main/java/org/apache/mahout/math/RandomTrinaryMatrix.java`
#### Snippet
```java

  // set this to true to use a high quality hash
  private boolean highQuality = false;

  public RandomTrinaryMatrix(int seed, int rows, int columns, boolean highQuality) {
```

### UnusedAssignment
The value changed at `fromIndex++` is never used
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
        S = (long) (N * vprime);
        chosen += S + 1;
        values[fromIndex++] = chosen;
      }
    }
```

### UnusedAssignment
Variable `discount` initializer `0` is redundant
in `core/src/main/java/org/apache/mahout/math/random/ChineseRestaurant.java`
#### Snippet
```java
  private final double alpha;
  private double weight = 0;
  private double discount = 0;
  private final DoubleArrayList weights = new DoubleArrayList();
  private final Random rand = RandomUtils.getRandom();
```

### UnusedAssignment
Variable `converter` initializer `null` is redundant
in `core/src/main/java/org/apache/mahout/math/random/IndianBuffet.java`
#### Snippet
```java
  private int documents = 0;
  private final double alpha;
  private WordFunction<T> converter = null;
  private final Random gen;

```

### UnusedAssignment
The value `currentEigen.norm(2) * previousEigen.norm(2)` assigned to `dot` is never used
in `core/src/main/java/org/apache/mahout/math/decomposer/hebbian/HebbianSolver.java`
#### Snippet
```java
            double dot = currentEigen.dot(previousEigen);
            if (dot > 0.0) {
              dot /= currentEigen.norm(2) * previousEigen.norm(2);
            }
           // log.info("Current pass * previous pass = {}", dot);
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `wantu` is always `true`
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
        e[j] = a[k][j];
      }
      if (wantu && k < nct) {
        
        // Place the transformation in U for subsequent back
```

### ConstantValue
Condition `wantv` is always `true`
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
          }
        }
        if (wantv) {
          
          // Place the transformation in V for subsequent
```

### ConstantValue
Condition `wantu` is always `true`
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
    // If required, generate U.
    
    if (wantu) {
      for (int j = nct; j < nu; j++) {
        for (int i = 0; i < m; i++) {
```

### ConstantValue
Condition `wantv` is always `true`
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
    // If required, generate V.
    
    if (wantv) {
      for (int k = n - 1; k >= 0; k--) {
        if (k < nrt && e[k] != 0.0) {
```

### ConstantValue
Condition `wantv` is always `true`
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
              e[j - 1] = cs * e[j - 1];
            }
            if (wantv) {
              for (int i = 0; i < n; i++) {
                t = cs * v[i][j] + sn * v[i][p - 1];
```

### ConstantValue
Condition `wantu` is always `true`
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
            f = -sn * e[j];
            e[j] = cs * e[j];
            if (wantu) {
              for (int i = 0; i < m; i++) {
                t = cs * u[i][j] + sn * u[i][k - 1];
```

### ConstantValue
Condition `wantv` is always `true`
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
            g = sn * s[j + 1];
            s[j + 1] = cs * s[j + 1];
            if (wantv) {
              for (int i = 0; i < n; i++) {
                t = cs * v[i][j] + sn * v[i][j + 1];
```

### ConstantValue
Condition `wantu` is always `true`
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
            g = sn * e[j + 1];
            e[j + 1] = cs * e[j + 1];
            if (wantu && j < m - 1) {
              for (int i = 0; i < m; i++) {
                t = cs * u[i][j] + sn * u[i][j + 1];
```

### ConstantValue
Condition `wantv` is always `true`
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
          if (s[k] <= 0.0) {
            s[k] = s[k] < 0.0 ? -s[k] : 0.0;
            if (wantv) {
              for (int i = 0; i <= pp; i++) {
                v[i][k] = -v[i][k];
```

### ConstantValue
Condition `wantv` is always `true`
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
            s[k] = s[k + 1];
            s[k + 1] = t;
            if (wantv && k < n - 1) {
              for (int i = 0; i < n; i++) {
                t = v[i][k + 1];
```

### ConstantValue
Condition `wantu` is always `true`
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
              }
            }
            if (wantu && k < m - 1) {
              for (int i = 0; i < m; i++) {
                t = u[i][k + 1];
```

### ConstantValue
Condition `alpha != -1.0` is always `true`
in `core/src/main/java/org/apache/mahout/math/jet/random/Gamma.java`
#### Snippet
```java
      double s = 0.0;
      double d = 0.0;
      if (alpha != -1.0) {                        // Step 1. Preparations
        ss = alpha - 0.5;
        s = Math.sqrt(ss);
```

### ConstantValue
Condition `alpha != -1.0` is always `true`
in `core/src/main/java/org/apache/mahout/math/jet/random/Gamma.java`
#### Snippet
```java
      double si = 0.0;
      double c = 0.0;
      if (alpha != -1.0) {                           // Step 4. Set-up for hat case
        double r = 1.0 / alpha;
        double q9 = 0.0001710320;
```

### ConstantValue
Condition `x == 0.0` is always `false`
in `core/src/main/java/org/apache/mahout/math/jet/stat/Gamma.java`
#### Snippet
```java

    while (x < 0.0) {
      if (x == 0.0) {
        throw new ArithmeticException("gamma: singular");
      }
```

### ConstantValue
Condition `newSize < currentSize` is always `true`
in `core/src/main/java/org/apache/mahout/math/list/AbstractList.java`
#### Snippet
```java
      if (newSize > currentSize) {
        beforeInsertDummies(currentSize, newSize - currentSize);
      } else if (newSize < currentSize) {
        removeFromTo(newSize, currentSize - 1);
      }
```

### ConstantValue
Condition `otherObj == null` is always `false`
in `core/src/main/java/org/apache/mahout/math/list/ObjectArrayList.java`
#### Snippet
```java
      return true;
    }
    if (otherObj == null) {
      return false;
    }
```

### ConstantValue
Value `corpus` is always 'null'
in `core/src/main/java/org/apache/mahout/math/decomposer/hebbian/HebbianSolver.java`
#### Snippet
```java
     */
    long now = System.currentTimeMillis();
    TrainingState finalState = solver.solve(corpus, rank);
    long time = (System.currentTimeMillis() - now) / 1000;
    log.info("Solved {} eigenVectors in {} seconds.  Persisted to {}",
```

### ConstantValue
Condition `realEigen != null` is always `true`
in `core/src/main/java/org/apache/mahout/math/decomposer/lanczos/LanczosSolver.java`
#### Snippet
```java

      Preconditions.checkState(realEigen != null);
      assert realEigen != null;

      realEigen = realEigen.normalize();
```

### ConstantValue
Condition `comparison == 0` is always `false`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      int comparison;
      while (b <= c && (comparison = comp.compare(array[b], partionValue)) < 0) {
        if (comparison == 0) {
          temp = array[a];
          array[a++] = array[b];
```

### ConstantValue
Condition `comparison == 0` is always `false`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      }
      while (c >= b && (comparison = comp.compare(array[c], partionValue)) > 0) {
        if (comparison == 0) {
          temp = array[c];
          array[c] = array[d];
```

### ConstantValue
Result of `a - start` is always '0'
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[c--] = temp;
    }
    length = a - start < b - a ? a - start : b - a;
    int l = start;
    int h = b - length;
```

### ConstantValue
Result of `a - start` is always '0'
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      array[c--] = temp;
    }
    length = a - start < b - a ? a - start : b - a;
    int l = start;
    int h = b - length;
```

### ConstantValue
Condition `i < low` is always `false`
in `core/src/main/java/org/apache/mahout/math/solver/EigenDecomposition.java`
#### Snippet
```java

    for (int i = 0; i < nn; i++) {
      if (i < low || i > high) {
        for (int j = i; j < nn; j++) {
          v.setQuick(i, j, h.getQuick(i, j));
```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
Overridden method 'getResult()' is declared in unstable interface 'com.google.common.io.LineProcessor' marked with @Beta
in `core/src/main/java/org/apache/mahout/math/random/IndianBuffet.java`
#### Snippet
```java

            @Override
            public List<String> getResult() {
              return theWords;
            }
```

### UnstableApiUsage
Overridden method 'processLine(java.lang.String)' is declared in unstable interface 'com.google.common.io.LineProcessor' marked with @Beta
in `core/src/main/java/org/apache/mahout/math/random/IndianBuffet.java`
#### Snippet
```java

            @Override
            public boolean processLine(String line) {
              Iterables.addAll(theWords, onSpace.split(line));
              return true;
```

### UnstableApiUsage
'com.google.common.io.LineProcessor' is marked unstable with @Beta
in `core/src/main/java/org/apache/mahout/math/random/IndianBuffet.java`
#### Snippet
```java
      try {
        words = Resources.readLines(Resources.getResource("words.txt"), Charsets.UTF_8,
                                    new LineProcessor<List<String>>() {
            private final List<String> theWords = Lists.newArrayList();

```

### UnstableApiUsage
'com.google.common.io.Resources' is marked unstable with @Beta
in `core/src/main/java/org/apache/mahout/math/random/IndianBuffet.java`
#### Snippet
```java
    public WordConverter() {
      try {
        words = Resources.readLines(Resources.getResource("words.txt"), Charsets.UTF_8,
                                    new LineProcessor<List<String>>() {
            private final List<String> theWords = Lists.newArrayList();
```

### UnstableApiUsage
'readLines(java.net.URL, java.nio.charset.Charset, com.google.common.io.LineProcessor)' is declared in unstable class 'com.google.common.io.Resources' marked with @Beta
in `core/src/main/java/org/apache/mahout/math/random/IndianBuffet.java`
#### Snippet
```java
    public WordConverter() {
      try {
        words = Resources.readLines(Resources.getResource("words.txt"), Charsets.UTF_8,
                                    new LineProcessor<List<String>>() {
            private final List<String> theWords = Lists.newArrayList();
```

### UnstableApiUsage
'com.google.common.io.Resources' is marked unstable with @Beta
in `core/src/main/java/org/apache/mahout/math/random/IndianBuffet.java`
#### Snippet
```java
    public WordConverter() {
      try {
        words = Resources.readLines(Resources.getResource("words.txt"), Charsets.UTF_8,
                                    new LineProcessor<List<String>>() {
            private final List<String> theWords = Lists.newArrayList();
```

### UnstableApiUsage
'getResource(java.lang.String)' is declared in unstable class 'com.google.common.io.Resources' marked with @Beta
in `core/src/main/java/org/apache/mahout/math/random/IndianBuffet.java`
#### Snippet
```java
    public WordConverter() {
      try {
        words = Resources.readLines(Resources.getResource("words.txt"), Charsets.UTF_8,
                                    new LineProcessor<List<String>>() {
            private final List<String> theWords = Lists.newArrayList();
```

### UnstableApiUsage
'on(com.google.common.base.CharMatcher)' is unstable because its signature references unstable class 'com.google.common.base.CharMatcher' marked with @Beta
in `core/src/main/java/org/apache/mahout/math/random/IndianBuffet.java`
#### Snippet
```java
   */
  public static final class WordConverter implements WordFunction<String> {
    private final Splitter onSpace = Splitter.on(CharMatcher.WHITESPACE).omitEmptyStrings().trimResults();
    private final List<String> words;

```

### UnstableApiUsage
'com.google.common.base.CharMatcher' is marked unstable with @Beta
in `core/src/main/java/org/apache/mahout/math/random/IndianBuffet.java`
#### Snippet
```java
   */
  public static final class WordConverter implements WordFunction<String> {
    private final Splitter onSpace = Splitter.on(CharMatcher.WHITESPACE).omitEmptyStrings().trimResults();
    private final List<String> words;

```

### UnstableApiUsage
'WHITESPACE' is declared in unstable class 'com.google.common.base.CharMatcher' marked with @Beta
in `core/src/main/java/org/apache/mahout/math/random/IndianBuffet.java`
#### Snippet
```java
   */
  public static final class WordConverter implements WordFunction<String> {
    private final Splitter onSpace = Splitter.on(CharMatcher.WHITESPACE).omitEmptyStrings().trimResults();
    private final List<String> words;

```

