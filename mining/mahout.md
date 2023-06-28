# mahout 
 
# Bad smells
I found 214 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicatedCode | 39 | false |
| ConstantValue | 23 | false |
| JavadocLinkAsPlainText | 21 | false |
| JavadocDeclaration | 18 | false |
| ManualMinMaxCalculation | 17 | false |
| FieldMayBeFinal | 15 | false |
| CommentedOutCode | 14 | false |
| UnstableApiUsage | 10 | false |
| UnnecessaryCallToStringValueOf | 6 | false |
| DataFlowIssue | 5 | false |
| UnusedAssignment | 5 | false |
| JavadocReference | 4 | false |
| RefusedBequest | 4 | false |
| DanglingJavadoc | 4 | false |
| NullableProblems | 4 | false |
| UNUSED_IMPORT | 4 | false |
| DeprecatedIsStillUsed | 3 | false |
| Deprecation | 3 | false |
| StaticInitializerReferencesSubClass | 2 | false |
| IgnoreResultOfCall | 2 | false |
| AutoCloseableResource | 2 | false |
| SuspiciousNameCombination | 1 | false |
| ForLoopReplaceableByWhile | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| RedundantMethodOverride | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| UnnecessaryUnaryMinus | 1 | false |
## RuleId[id=SuspiciousNameCombination]
### SuspiciousNameCombination
'y' should probably not be passed as parameter 'x'
in `core/src/main/java/org/apache/mahout/math/ssvd/SequentialBigSvd.java`
#### Snippet
```java

    // R'R = Y' Y
    cd1 = new CholeskyDecomposition(y.transpose().times(y));

    // B = Q" A = (Y R^{-1} )' A
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `IntComparator`
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
   * @param c         the comparator to determine the order of the generic data.
   * @param swapper   an object that knows how to swap the elements at any two indexes (a,b).
   * @see IntComparator
   * @see Swapper
   */
```

### JavadocReference
Cannot resolve symbol `RandomGenerator`
in `core/src/main/java/org/apache/mahout/common/RandomWrapper.java`
#### Snippet
```java

/**
 * A wrapper around a {@link RandomGenerator} that implements {@link Random} so that it can be
 * used in places that expect a {@link Random} instance.
 */
```

### JavadocReference
Cannot resolve symbol `DoubleProcedure`
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
 * org.apache.mahout.math.function.DoubleDoubleFunction}. All can be retrieved via <tt>public static final</tt>
 * variables named after the function. Unary predicates are of type
 * {@link DoubleProcedure},
 * binary predicates of type {@link org.apache.mahout.math.function.DoubleDoubleProcedure}. All can be retrieved via
 * <tt>public static final</tt> variables named <tt>isXXX</tt>.
```

### JavadocReference
Cannot resolve symbol `org.apache.mahout.math.function.DoubleDoubleProcedure`
in `core/src/main/java/org/apache/mahout/math/function/Functions.java`
#### Snippet
```java
 * variables named after the function. Unary predicates are of type
 * {@link DoubleProcedure},
 * binary predicates of type {@link org.apache.mahout.math.function.DoubleDoubleProcedure}. All can be retrieved via
 * <tt>public static final</tt> variables named <tt>isXXX</tt>.
 *
```

## RuleId[id=DataFlowIssue]
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

## RuleId[id=StaticInitializerReferencesSubClass]
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

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=CommentedOutCode]
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

## RuleId[id=UnnecessaryCallToStringValueOf]
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

## RuleId[id=RefusedBequest]
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

## RuleId[id=ForLoopReplaceableByWhile]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/collections/Arithmetic.java`
#### Snippet
```java
    if (k < 0) {
      return 0;
    }
    if (k == 0 || k == n) {
      return 1;
    }
    if (k == 1 || k == n - 1) {
      return n;
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/collections/Arithmetic.java`
#### Snippet
```java
      if (n < max) { // if (n! < inf && k! < inf)
        double n_fac = factorial((int) n);
        double k_fac = factorial((int) k);
        double n_minus_k_fac = factorial((int) (n - k));
        double nk = n_minus_k_fac * k_fac;
        if (nk != Double.POSITIVE_INFINITY) { // no numeric overflow?
          // now this is completely safe and accurate
          return n_fac / nk;
        }
      }
      if (k > n / 2) {
        k = n - k;
      } // quicker
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/collections/Arithmetic.java`
#### Snippet
```java
    if (k >= 30) {

      double r = 1.0 / k;
      double rr = r * r;
      double C7 = -5.95238095238095238e-04;
      double C5 = 7.93650793650793651e-04;
      double C3 = -2.77777777777777778e-03;
      double C1 = 8.33333333333333333e-02;
      double C0 = 9.18938533204672742e-01;
      return (k + 0.5) * Math.log(k) - k + C0 + r * (C1 + rr * (C3 + rr * (C5 + rr * C7)));
    } else {
      return LOG_FACTORIALS[k];
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/AbstractMatrix.java`
#### Snippet
```java
    if (columnLabelBindings == null || rowLabelBindings == null) {
      throw new IllegalStateException("Unbound label");
    }
    Integer row = rowLabelBindings.get(rowLabel);
    Integer col = columnLabelBindings.get(columnLabel);
    if (row == null || col == null) {
      throw new IllegalStateException("Unbound label");
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/AbstractMatrix.java`
#### Snippet
```java
    int rows = rowSize();
    if (rows != other.rowSize()) {
      throw new CardinalityException(rows, other.rowSize());
    }
    int columns = columnSize();
    if (columns != other.columnSize()) {
      throw new CardinalityException(columns, other.columnSize());
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/AbstractMatrix.java`
#### Snippet
```java
    if (offset[ROW] < 0) {
      throw new IndexException(offset[ROW], 0);
    }
    if (offset[ROW] + size[ROW] > rowSize()) {
      throw new IndexException(offset[ROW] + size[ROW], rowSize());
    }
    if (offset[COL] < 0) {
      throw new IndexException(offset[COL], 0);
    }
    if (offset[COL] + size[COL] > columnSize()) {
      throw new IndexException(offset[COL] + size[COL], columnSize());
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/AbstractVector.java`
#### Snippet
```java
    int nonZeroElements = 0;
    Iterator<Element> iter = this.iterateNonZero();
    while (iter.hasNext()) {
      nonZeroElements++;
      Element element = iter.next();
      double tmp = element.get();
      if (tmp > max) {
        max = tmp;
        result = element.index();
      }
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/Arrays.java`
#### Snippet
```java
    StringBuilder buf = new StringBuilder();
    buf.append('[');
    int maxIndex = array.length - 1;
    for (int i = 0; i <= maxIndex; i++) {
      buf.append(array[i]);
      if (i < maxIndex) {
        buf.append(", ");
      }
    }
    buf.append(']');
    return buf.toString();
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/BinarySearch.java`
#### Snippet
```java
    int mid = -1;
    while (from <= to) {
      mid = (from + to) >>> 1;
      if (value > array[mid]) {
        from = mid + 1;
      } else if (value == array[mid]) {
        return mid;
      } else {
        to = mid - 1;
      }
    }
    if (mid < 0) {
      return -1;
    }

    return -mid - (value < array[mid] ? 1 : 2);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/OldQRDecomposition.java`
#### Snippet
```java
    Matrix qt = getQ().transpose();
    Matrix y = qt.times(B);

    Matrix r = getR();
    for (int k = Math.min(originalColumns, originalRows) - 1; k >= 0; k--) {
      // X[k,] = Y[k,] / R[k,k], note that X[k,] starts with 0 so += is same as =
      x.viewRow(k).assign(y.viewRow(k), Functions.plusMult(1 / r.get(k, k)));

      // Y[0:(k-1),] -= R[0:(k-1),k] * X[k,]
      Vector rColumn = r.viewColumn(k).viewPart(0, k);
      for (int c = 0; c < columns; c++) {
        y.viewColumn(c).viewPart(0, k).assign(rColumn, Functions.plusMult(-x.get(k, c)));
      }
    }
    return x;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/PermutedVectorView.java`
#### Snippet
```java
      @Override
      protected Vector.Element computeNext() {
        if (i.hasNext()) {
          final Element x = i.next();
          return new Element() {
            private final int index = unpivot[x.index()];

            @Override
            public double get() {
              return x.get();
            }

            @Override
            public int index() {
              return index;
            }

            @Override
            public void set(double value) {
              x.set(value);
            }
          };
        } else {
          return endOfData();
        }
      }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/SingularValueDecomposition.java`
#### Snippet
```java
      int numCols = Math.min(m + 1, n);
      Matrix r = new DenseMatrix(m, numCols);
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < numCols; j++) {
          r.set(i, j, u[i][j]);
        }
      }

      return r;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    int comparisonxy = comp.compare(x, y);
    int comparisonxz = comp.compare(x, z);
    int comparisonyz = comp.compare(y, z);
    return comparisonxy < 0 ? (comparisonyz < 0 ? b
        : (comparisonxz < 0 ? c : a)) : (comparisonyz > 0 ? b
        : (comparisonxz > 0 ? c : a));
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    int length = end - start;
    if (length < 7) {
      for (int i = start + 1; i < end; i++) {
        for (int j = i; j > start && comp.compare(array[j - 1], array[j]) > 0; j--) {
          temp = array[j];
          array[j] = array[j - 1];
          array[j - 1] = temp;
        }
      }
      return;
    }
    int middle = (start + end) / 2;
    if (length > 7) {
      int bottom = start;
      int top = end - 1;
      if (length > 40) {
        length /= 8;
        bottom = med3(array, bottom, bottom + length, bottom + (2 * length),
            comp);
        middle = med3(array, middle - length, middle, middle + length, comp);
        top = med3(array, top - (2 * length), top - length, top, comp);
      }
      middle = med3(array, bottom, middle, top, comp);
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    int a = start;
    int b = a;
    int c = end - 1;
    int d = c;
    while (true) {
      int comparison;
      while (b <= c && (comparison = comp.compare(array[b], partionValue)) <= 0) {
        if (comparison == 0) {
          temp = array[a];
          array[a++] = array[b];
          array[b] = temp;
        }
        b++;
      }
      while (c >= b && (comparison = comp.compare(array[c], partionValue)) >= 0) {
        if (comparison == 0) {
          temp = array[c];
          array[c] = array[d];
          array[d--] = temp;
        }
        c--;
      }
      if (b > c) {
        break;
      }
      temp = array[b];
      array[b++] = array[c];
      array[c--] = temp;
    }
    length = a - start < b - a ? a - start : b - a;
    int l = start;
    int h = b - length;
    while (length-- > 0) {
      temp = array[l];
      array[l++] = array[h];
      array[h++] = temp;
    }
    length = d - c < end - 1 - d ? d - c : end - 1 - d;
    l = b;
    h = end - length;
    while (length-- > 0) {
      temp = array[l];
      array[l++] = array[h];
      array[h++] = temp;
    }
    if ((length = b - a) > 0) {
      quickSort0(start, start + length, array, comp);
    }
    if ((length = d - c) > 0) {
      quickSort0(end - length, end, array, comp);
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    length = a - start < b - a ? a - start : b - a;
    int l = start;
    int h = b - length;
    while (length-- > 0) {
      temp = array[l];
      array[l++] = array[h];
      array[h++] = temp;
    }
    length = d - c < end - 1 - d ? d - c : end - 1 - d;
    l = b;
    h = end - length;
    while (length-- > 0) {
      temp = array[l];
      array[l++] = array[h];
      array[h++] = temp;
    }
    if ((length = b - a) > 0) {
      quickSort0(start, start + length, array, comp);
    }
    if ((length = d - c) > 0) {
      quickSort0(end - length, end, array, comp);
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    int length = end - start;
    if (length < 7) {
      for (int i = start + 1; i < end; i++) {
        for (int j = i; j > start && comp.compare(array[j], array[j - 1]) < 0; j--) {
          temp = array[j];
          array[j] = array[j - 1];
          array[j - 1] = temp;
        }
      }
      return;
    }
    int middle = (start + end) / 2;
    if (length > 7) {
      int bottom = start;
      int top = end - 1;
      if (length > 40) {
        length /= 8;
        bottom = med3(array, bottom, bottom + length, bottom + (2 * length),
            comp);
        middle = med3(array, middle - length, middle, middle + length, comp);
        top = med3(array, top - (2 * length), top - length, top, comp);
      }
      middle = med3(array, bottom, middle, top, comp);
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    int a = start;
    int b = a;
    int c = end - 1;
    int d = c;
    while (true) {
      int comparison;
      while (b <= c && (comparison = comp.compare(partionValue, array[b])) >= 0) {
        if (comparison == 0) {
          temp = array[a];
          array[a++] = array[b];
          array[b] = temp;
        }
        b++;
      }
      while (c >= b && (comparison = comp.compare(array[c], partionValue)) >= 0) {
        if (comparison == 0) {
          temp = array[c];
          array[c] = array[d];
          array[d--] = temp;
        }
        c--;
      }
      if (b > c) {
        break;
      }
      temp = array[b];
      array[b++] = array[c];
      array[c--] = temp;
    }
    length = a - start < b - a ? a - start : b - a;
    int l = start;
    int h = b - length;
    while (length-- > 0) {
      temp = array[l];
      array[l++] = array[h];
      array[h++] = temp;
    }
    length = d - c < end - 1 - d ? d - c : end - 1 - d;
    l = b;
    h = end - length;
    while (length-- > 0) {
      temp = array[l];
      array[l++] = array[h];
      array[h++] = temp;
    }
    if ((length = b - a) > 0) {
      quickSort0(start, start + length, array, comp);
    }
    if ((length = d - c) > 0) {
      quickSort0(end - length, end, array, comp);
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
        if (c.compare(prev, current) > 0) {
          int j = i;
          do {
            out[j--] = prev;
          } while (j > start && (c.compare(prev = out[j - 1], current) > 0));
          out[j] = current;
        }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    int med = (end + start) >>> 1;
    mergeSort(out, in, start, med, c);
    mergeSort(out, in, med, end, c);
    
    // merging
    
    // if arrays are already sorted - no merge
    if (c.compare(in[med - 1], in[med]) <= 0) {
      System.arraycopy(in, start, out, start, len);
      return;
    }
    int r = med;
    int i = start;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
      if (c.compare(fromVal, rVal) <= 0) {
        int l_1 = find(in, rVal, -1, start + 1, med - 1, c);
        int toCopy = l_1 - start + 1;
        System.arraycopy(in, start, out, i, toCopy);
        i += toCopy;
        out[i++] = rVal;
        r++;
        start = l_1 + 1;
      } else {
        int r_1 = find(in, fromVal, 0, r + 1, end - 1, c);
        int toCopy = r_1 - r + 1;
        System.arraycopy(in, r, out, i, toCopy);
        i += toCopy;
        out[i++] = fromVal;
        start++;
        r = r_1 + 1;
      }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
    int m = l;
    int d = 1;
    while (m <= r) {
      if (c.compare(val, arr[m]) > bnd) {
        l = m + 1;
      } else {
        r = m - 1;
        break;
      }
      m += d;
      d <<= 1;
    }
    while (l <= r) {
      m = (l + r) >>> 1;
      if (c.compare(val, arr[m]) > bnd) {
        l = m + 1;
      } else {
        r = m - 1;
      }
    }
    return l - 1;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/VectorBinaryAggregate.java`
#### Snippet
```java
      Iterator<Vector.Element> xi = x.nonZeroes().iterator();
      Iterator<Vector.Element> yi = y.nonZeroes().iterator();
      Vector.Element xe = null;
      Vector.Element ye = null;
      boolean advanceThis = true;
      boolean advanceThat = true;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/VectorBinaryAggregate.java`
#### Snippet
```java
        if (advanceThis) {
          if (xi.hasNext()) {
            xe = xi.next();
          } else {
            xe = null;
          }
        }
        if (advanceThat) {
          if (yi.hasNext()) {
            ye = yi.next();
          } else {
            ye = null;
          }
        }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/jet/random/Gamma.java`
#### Snippet
```java
        v = t / (s + s);                  // Step 6.
        if (Math.abs(v) > 0.25) {
          q = q0 - s * t + 0.25 * t * t + (ss + ss) * Math.log1p(v);
        } else {
          q = q0 + 0.5 * t * t * ((((((((a9 * v + a8) * v + a7) * v + a6)
              * v + a5) * v + a4) * v + a3) * v + a2) * v + a1) * v;
        }                  // Step 7. Quotient acceptance
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
    long chosen = -1 + low;

    //long negalphainv =
    //    -13;  //tuning paramter, determines when to switch from method D to method A. Dependent on programming
    // language, platform, etc.

    double nreal = n;
    double ninv = 1.0 / nreal;
    double Nreal = N;
    double Vprime = Math.exp(Math.log(randomGenerator.nextDouble()) * ninv);
    long qu1 = -n + 1 + N;
    double qu1real = -nreal + 1.0 + Nreal;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
      double nmin1inv = 1.0 / (-1.0 + nreal);
      double negSreal;
      while (true) {
        double X;
        while (true) { // step D2: generate U and X
          X = Nreal * (-Vprime + 1.0);
          S = (long) X;
          if (S < qu1) {
            break;
          }
          Vprime = Math.exp(Math.log(randomGenerator.nextDouble()) * ninv);
        }
        double U = randomGenerator.nextDouble();
        negSreal = -S;

        //step D3: Accept?
        double y1 = Math.exp(Math.log(U * Nreal / qu1real) * nmin1inv);
        Vprime = y1 * (-X / Nreal + 1.0) * qu1real / (negSreal + qu1real);
        if (Vprime <= 1.0) {
          break;
        } //break inner loop

        //step D4: Accept?
        double top = -1.0 + Nreal;
        long limit;
        double bottom;
        if (n - 1 > S) {
          bottom = -nreal + Nreal;
          limit = -S + N;
        } else {
          bottom = -1.0 + negSreal + Nreal;
          limit = qu1;
        }
        double y2 = 1.0;
        for (long t = N - 1; t >= limit; t--) {
          y2 *= top / bottom;
          top--;
          bottom--;
        }
        if (Nreal / (-X + Nreal) >= y1 * Math.exp(Math.log(y2) * nmin1inv)) {
          // accept !
          Vprime = Math.exp(Math.log(randomGenerator.nextDouble()) * nmin1inv);
          break; //break inner loop
        }
        Vprime = Math.exp(Math.log(randomGenerator.nextDouble()) * ninv);
      }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/jet/random/sampling/RandomSampler.java`
#### Snippet
```java
      int iter = count; //int iter = (int) (Math.min(S,count));
      if (S < iter) {
        iter = (int) S;
      }

      count -= iter;
      while (--iter >= 0) {
        values[fromIndex++] = ++chosen;
      }
      chosen++;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/jet/stat/Gamma.java`
#### Snippet
```java
      double xk = -(x * k1 * k2) / (k3 * k4);
      double pk = pkm1 + pkm2 * xk;
      double qk = qkm1 + qkm2 * xk;
      pkm2 = pkm1;
      pkm1 = pk;
      qkm2 = qkm1;
      qkm1 = qk;

      xk = (x * k5 * k6) / (k7 * k8);
      pk = pkm1 + pkm2 * xk;
      qk = qkm1 + qkm2 * xk;
      pkm2 = pkm1;
      pkm1 = pk;
      qkm2 = qkm1;
      qkm1 = qk;

      if (qk != 0) {
        r = pk / qk;
      }
      double t;
      if (r != 0) {
        t = Math.abs((ans - r) / r);
        ans = r;
      } else {
        t = 1.0;
      }

      if (t < thresh) {
        return ans;
      }

      k1 += 1.0;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/jet/stat/Gamma.java`
#### Snippet
```java
      if ((Math.abs(qk) + Math.abs(pk)) > Constants.BIG) {
        pkm2 *= Constants.BIG_INVERSE;
        pkm1 *= Constants.BIG_INVERSE;
        qkm2 *= Constants.BIG_INVERSE;
        qkm1 *= Constants.BIG_INVERSE;
      }
      if ((Math.abs(qk) < Constants.BIG_INVERSE) || (Math.abs(pk) < Constants.BIG_INVERSE)) {
        pkm2 *= Constants.BIG;
        pkm1 *= Constants.BIG;
        qkm2 *= Constants.BIG;
        qkm1 *= Constants.BIG;
      }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/map/OpenHashMap.java`
#### Snippet
```java
    Object[] tab = table;
    byte[] stat = state;
    int length = tab.length;

    int hash = key.hashCode() & 0x7FFFFFFF;
    int i = hash % length;
    int decrement = hash % (length - 2); // double hashing, see http://www.eece.unm.edu/faculty/heileman/hash/node4.html
    //int decrement = (hash / length) % length;
    if (decrement == 0) {
      decrement = 1;
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/map/OpenHashMap.java`
#### Snippet
```java
    if (stat[i] == REMOVED) {
      // stop if we find a free slot, or if we find the key itself.
      // do skip over removed slots (yes, open addressing is like that...)
      // assertion: there is at least one FREE slot.
      int j = i;
      while (stat[i] != FREE && (stat[i] == REMOVED || tab[i] != key)) {
        i -= decrement;
        //hashCollisions++;
        if (i < 0) {
          i += length;
        }
      }
      if (stat[i] == FREE) {
        i = j;
      }
    }


    if (stat[i] == FULL) {
      // key already contained at slot i.
      // return a negative number identifying the slot.
      return -i - 1;
    }
    // not already contained, should be inserted at slot i.
    // return a number >= 0 identifying the slot.
    return i;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/map/OpenHashMap.java`
#### Snippet
```java
    this.table[i] = key;
    this.values[i] = value;
    if (this.state[i] == FREE) {
      this.freeEntries--;
    }
    this.state[i] = FULL;
    this.distinct++;

    if (this.freeEntries < 1) { //delta
      int newCapacity = chooseGrowCapacity(this.distinct + 1, this.minLoadFactor, this.maxLoadFactor);
      rehash(newCapacity);
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/map/QuickOpenIntIntHashMap.java`
#### Snippet
```java
    byte[] newState = new byte[newCapacity];

    this.lowWaterMark = chooseLowWaterMark(newCapacity, this.minLoadFactor);
    this.highWaterMark = chooseHighWaterMark(newCapacity, this.maxLoadFactor);

    this.table = newTable;
    this.values = newValues;
    this.state = newState;
    this.freeEntries = newCapacity - this.distinct; // delta
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/map/OpenHashMap.java`
#### Snippet
```java
    this.state = new byte[capacity];

    // memory will be exhausted long before this pathological case happens, anyway.
    this.minLoadFactor = minLoadFactor;
    if (capacity == PrimeFinder.LARGEST_PRIME) {
      this.maxLoadFactor = 1.0;
    } else {
      this.maxLoadFactor = maxLoadFactor;
    }

    this.distinct = 0;
    this.freeEntries = capacity; // delta

    // lowWaterMark will be established upon first expansion.
    // establishing it now (upon instance construction) would immediately make the table shrink upon first put(...).
    // After all the idea of an "initialCapacity" implies violating lowWaterMarks when an object is young.
    // See ensureCapacity(...)
    this.lowWaterMark = 0;
    this.highWaterMark = chooseHighWaterMark(capacity, this.maxLoadFactor);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/solver/EigenDecomposition.java`
#### Snippet
```java
            z = h.getQuick(i, n - 1);
            h.setQuick(i, n - 1, q * z + p * h.getQuick(i, n));
            h.setQuick(i, n, q * h.getQuick(i, n) - p * z);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/mahout/math/solver/EigenDecomposition.java`
#### Snippet
```java
              p = x * h.getQuick(i, k) + y * h.getQuick(i, k + 1);
              if (notlast) {
                p += z * h.getQuick(i, k + 2);
                h.setQuick(i, k + 2, h.getQuick(i, k + 2) - p * r);
              }
              h.setQuick(i, k, h.getQuick(i, k) - p);
              h.setQuick(i, k + 1, h.getQuick(i, k + 1) - p * q);
```

### DuplicatedCode
Duplicated code
in `engine/hdfs/src/main/java/org/apache/mahout/math/MatrixWritable.java`
#### Snippet
```java
    if (columnLabelBindings == null) {
      out.writeInt(0);
    } else {
      out.writeInt(columnLabelBindings.size());
      for (Map.Entry<String, Integer> stringIntegerEntry : columnLabelBindings.entrySet()) {
        out.writeUTF(stringIntegerEntry.getKey());
        out.writeInt(stringIntegerEntry.getValue());
      }
    }
```

### DuplicatedCode
Duplicated code
in `engine/hdfs/src/main/java/org/apache/mahout/math/MatrixWritable.java`
#### Snippet
```java
    Preconditions.checkArgument(flags >> NUM_FLAGS == 0, "Unknown flags set: %d", Integer.toString(flags, 2));
    boolean dense = (flags & FLAG_DENSE) != 0;
    boolean sequential = (flags & FLAG_SEQUENTIAL) != 0;
    boolean hasLabels = (flags & FLAG_LABELS) != 0;
    boolean isSparseRowMatrix = (flags & FLAG_SPARSE_ROW) != 0;
```

## RuleId[id=StringBufferReplaceableByString]
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

## RuleId[id=Deprecation]
### Deprecation
'org.apache.mahout.math.SparseColumnMatrix' is deprecated
in `core/src/main/java/org/apache/mahout/math/Matrices.java`
#### Snippet
```java
  public static Matrix transposedView(final Matrix m) {

    Preconditions.checkArgument(!(m instanceof SparseColumnMatrix));

    if (m instanceof TransposedMatrixView) {
```

### Deprecation
'org.apache.mahout.math.SparseColumnMatrix' is deprecated
in `core/src/main/java/org/apache/mahout/math/SparseRowMatrix.java`
#### Snippet
```java
  @Override
  public Matrix transpose() {
    SparseColumnMatrix scm = new SparseColumnMatrix(columns, rows);
    for (int i = 0; i < rows; i++) {
      Vector row = rowVectors[i];
```

### Deprecation
'org.apache.mahout.math.SparseColumnMatrix' is deprecated
in `core/src/main/java/org/apache/mahout/math/SparseRowMatrix.java`
#### Snippet
```java
  @Override
  public Matrix transpose() {
    SparseColumnMatrix scm = new SparseColumnMatrix(columns, rows);
    for (int i = 0; i < rows; i++) {
      Vector row = rowVectors[i];
```

## RuleId[id=ManualMinMaxCalculation]
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

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `core/src/main/java/org/apache/mahout/math/OldQRDecomposition.java`
#### Snippet
```java


/**
 For an <tt>m x n</tt> matrix <tt>A</tt> with <tt>m >= n</tt>, the QR decomposition is an <tt>m x n</tt>
 orthogonal matrix <tt>Q</tt> and an <tt>n x n</tt> upper triangular matrix <tt>R</tt> so that
```

### DanglingJavadoc
Dangling Javadoc comment
in `core/src/main/java/org/apache/mahout/math/jet/random/Poisson.java`
#### Snippet
```java
  /** Returns a random number from the distribution; bypasses the internal state. */
  public int nextInt(double theMean) {
    /******************************************************************
     *                                                                *
     * Poisson Distribution - Patchwork Rejection/Inversion           *
```

### DanglingJavadoc
Dangling Javadoc comment
in `core/src/main/java/org/apache/mahout/math/decomposer/hebbian/HebbianSolver.java`
#### Snippet
```java
      log.info("Found eigenvector {}, eigenvalue: {}", i, eigenValue);

      /**
       *  TODO: Persist intermediate output!
       */
```

### DanglingJavadoc
Dangling Javadoc comment
in `core/src/main/java/org/apache/mahout/math/solver/EigenDecomposition.java`
#### Snippet
```java
 */

/**
 * Adapted from the public domain Jama code.
 */
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `DenseVectorView` may be 'static'
in `core/src/main/java/org/apache/mahout/math/DenseVector.java`
#### Snippet
```java
  }

  private final class DenseVectorView extends VectorView {

    public DenseVectorView(Vector vector, int offset, int cardinality) {
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `core/src/main/java/org/apache/mahout/math/random/Multinomial.java`
#### Snippet
```java

  @Override
  public Iterator<T> iterator() {
    return new AbstractIterator<T>() {
      Iterator<T> valuesIterator = Iterables.skip(values, 1).iterator();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/mahout/math/set/OpenHashSet.java`
#### Snippet
```java

  @Override
  public boolean retainAll(Collection<?> c) {
    final Collection<?> finalCollection = c;
    final boolean[] modified = new boolean[1];
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/mahout/math/set/OpenHashSet.java`
#### Snippet
```java

  @Override
  public <T1> T1[] toArray(T1[] a) {
    return keys().toArray(a);
  }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `core/src/main/java/org/apache/mahout/math/random/IndianBuffet.java`
#### Snippet
```java

            @Override
            public boolean processLine(String line) {
              Iterables.addAll(theWords, onSpace.split(line));
              return true;
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/MurmurHash3.java`
#### Snippet
```java
 *  algorithms are optimized for their respective platforms.
 *  <p>
 *  See also http://github.com/yonik/java_util for future updates to this file.
 */
public final class MurmurHash3 {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/MurmurHash.java`
#### Snippet
```java
/**
 * <p>This is a very fast, non-cryptographic hash suitable for general hash-based
 * lookup.  See http://murmurhash.googlepages.com/ for more details.
 * </p>
 * <p>The C version of MurmurHash 2.0 found at that site was ported
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/Algebra.java`
#### Snippet
```java
  /**
   * Compute Maximum Absolute Row Sum Norm of input Matrix m
   * http://mathworld.wolfram.com/MaximumAbsoluteRowSumNorm.html 
   */
  public static double getNorm(Matrix m) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/Vector.java`
#### Snippet
```java
   * Return a new Vector containing the normalized (L_power norm) values of the recipient. <p>
   * See
   * http://en.wikipedia.org/wiki/Lp_space <p>
   * Technically, when {@code 0 < power < 1}, we don't have a norm, just a metric,
   * but we'll overload this here. <p>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/Vector.java`
#### Snippet
```java

  /**
   * Return the k-norm of the vector. <p/> See http://en.wikipedia.org/wiki/Lp_space <p>
   * Technically, when {@code 0 > power < 1}, we don't have a norm, just a metric, but we'll overload this here. Also supports power == 0 (number of
   * non-zero elements) and power = {@link Double#POSITIVE_INFINITY} (max element). Again, see the Wikipedia page for
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/VectorBinaryAggregate.java`
#### Snippet
```java
 * The best one will be selected through assignBest(), which is itself called through Vector.assign().
 *
 * See https://docs.google.com/document/d/1g1PjUuvjyh2LBdq2_rKLIcUiDbeOORA1sCJiSsz-JVU/edit# for a more detailed
 * explanation.
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/jet/stat/Probability.java`
#### Snippet
```java
   * <tt>y = Gamma.incompleteGamma( alpha, beta*x )</tt>.
   *
   * See http://en.wikipedia.org/wiki/Gamma_distribution#Probability_density_function
   *
   * @param alpha the shape parameter of the gamma distribution.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/jet/stat/Probability.java`
#### Snippet
```java
   * <tt>errorFunctionComplement</tt>.
   * <p>
   * Computed using method 26.2.17 from Abramovitz and Stegun (see http://www.math.sfu.ca/~cbm/aands/page_932.htm
   * and http://en.wikipedia.org/wiki/Normal_distribution#Numerical_approximations_of_the_normal_cdf
   */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/jet/stat/Probability.java`
#### Snippet
```java
   * <p>
   * Computed using method 26.2.17 from Abramovitz and Stegun (see http://www.math.sfu.ca/~cbm/aands/page_932.htm
   * and http://en.wikipedia.org/wiki/Normal_distribution#Numerical_approximations_of_the_normal_cdf
   */

```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/jet/random/NegativeBinomial.java`
#### Snippet
```java
   *
   * This algorithm is essentially the same as described at
   * http://en.wikipedia.org/wiki/Negative_binomial_distribution#Gamma.E2.80.93Poisson_mixture
   * except that the notion of positive and negative outcomes is uniformly
   * inverted.  Because the inversion is complete and consistent, this
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/VectorBinaryAssign.java`
#### Snippet
```java
 * The best one will be selected through assignBest(), which is itself called through Vector.assign().
 *
 * See https://docs.google.com/document/d/1g1PjUuvjyh2LBdq2_rKLIcUiDbeOORA1sCJiSsz-JVU/edit# for a more detailed
 * explanation.
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/jet/random/engine/MersenneTwister.java`
#### Snippet
```java
   * Sets the receiver's seed in a fashion compatible with the
   * reference C implementation. See
   * http://www.math.sci.hiroshima-u.ac.jp/~m-mat/MT/VERSIONS/C-LANG/980409/mt19937int.c
   *
   * This method isn't as good as the default method due to poor distribution of the
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/jet/stat/Gamma.java`
#### Snippet
```java
   * Returns the regularized Incomplete Beta Function evaluated from zero to <tt>xx</tt>; formerly named <tt>ibeta</tt>.
   *
   * See http://en.wikipedia.org/wiki/Incomplete_beta_function#Incomplete_beta_function
   *
   * @param alpha the alpha parameter of the beta distribution.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/stats/OnlineSummarizer.java`
#### Snippet
```java
 * The method used for mean and variance is Welford's method.  See
 * <p/>
 * http://en.wikipedia.org/wiki/Algorithms_for_calculating_variance#On-line_algorithm
 * <p/>
 * The method used for computing the quartiles is a simplified form of the stochastic approximation
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/stats/OnlineSummarizer.java`
#### Snippet
```java
 * See
 * <p/>
 * http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.105.1580
 */
public class OnlineSummarizer {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/stats/OnlineExponentialAverage.java`
#### Snippet
```java
   * that is more recent than alpha/3 is about as important as current data.
   *
   * See http://tdunning.blogspot.com/2011/03/exponential-weighted-averages-with.html for a
   * derivation.  See http://tdunning.blogspot.com/2011/03/exponentially-weighted-averaging-for.html
   * for the rate method.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/stats/OnlineExponentialAverage.java`
#### Snippet
```java
   *
   * See http://tdunning.blogspot.com/2011/03/exponential-weighted-averages-with.html for a
   * derivation.  See http://tdunning.blogspot.com/2011/03/exponentially-weighted-averaging-for.html
   * for the rate method.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/stats/LogLikelihood.java`
#### Snippet
```java
   *
   * <p/>
   * Credit to http://tdunning.blogspot.com/2008/03/surprise-and-coincidence.html for the table and the descriptions.
   */
  public static double logLikelihoodRatio(long k11, long k12, long k21, long k22) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/stats/LogLikelihood.java`
#### Snippet
```java
   * 
   * <p/>
   * There is some more discussion here: http://s.apache.org/CGL
   *
   * And see the response to Wataru's comment here:
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/stats/LogLikelihood.java`
#### Snippet
```java
   *
   * And see the response to Wataru's comment here:
   * http://tdunning.blogspot.com/2008/03/surprise-and-coincidence.html
   */
  public static double rootLogLikelihoodRatio(long k11, long k12, long k21, long k22) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/mahout/math/random/IndianBuffet.java`
#### Snippet
```java
 * Samples a "document" from an IndianBuffet process.
 *
 * See http://mlg.eng.cam.ac.uk/zoubin/talks/turin09.pdf for details
 */
public final class IndianBuffet<T> implements Sampler<List<T>> {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `core/src/main/java/org/apache/mahout/math/als/ImplicitFeedbackAlternatingLeastSquaresSolver.java`
#### Snippet
```java
    queue.shutdown();
    try {
      queue.awaitTermination(1, TimeUnit.DAYS);
    } catch (InterruptedException e) {
      log.error("Error during Y'Y queue shutdown", e);
```

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

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getNumNondefaultElements()` is identical to its super method
in `core/src/main/java/org/apache/mahout/math/MatrixView.java`
#### Snippet
```java

  @Override
  public int[] getNumNondefaultElements() {
    return new int[]{rowSize(), columnSize()};

```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'FileInputStream' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/mahout/math/FileBasedMatrix.java`
#### Snippet
```java
      long start = i * rowsPerBlock * columns * 8L;
      long size = rowsPerBlock * columns * 8L;
      MappedByteBuffer buf = new FileInputStream(f).getChannel().map(FileChannel.MapMode.READ_ONLY, start,
                                                                     Math.min(f.length() - start, size));
      if (loadNow) {
```

### AutoCloseableResource
'FileInputStream' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/mahout/math/FileBasedSparseBinaryMatrix.java`
#### Snippet
```java
  public void setData(File f) throws IOException {
    List<ByteBuffer> buffers = Lists.newArrayList();
    FileChannel input = new FileInputStream(f).getChannel();

    buffers.add(input.map(FileChannel.MapMode.READ_ONLY, 0, Math.min(Integer.MAX_VALUE, f.length())));
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
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

## RuleId[id=UNUSED_IMPORT]
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param n` tag description is missing
in `core/src/main/java/org/apache/mahout/math/UpperTriangular.java`
#### Snippet
```java
   * represents n x n upper triangular matrix
   * 
   * @param n
   */

```

### JavadocDeclaration
`@param z` tag description is missing
in `core/src/main/java/org/apache/mahout/math/CholeskyDecomposition.java`
#### Snippet
```java
   * Compute inv(L) * z efficiently.
   *
   * @param z
   */
  public Matrix solveLeft(Matrix z) {
```

### JavadocDeclaration
`@param columnVectors` tag description is missing
in `core/src/main/java/org/apache/mahout/math/SparseColumnMatrix.java`
#### Snippet
```java
   *
   * @param columns       a RandomAccessSparseVector[] array of columns
   * @param columnVectors
   */
  public SparseColumnMatrix(int rows, int columns, Vector[] columnVectors) {
```

### JavadocDeclaration
`@param alpha` tag description is missing
in `core/src/main/java/org/apache/mahout/math/jet/stat/Gamma.java`
#### Snippet
```java
   *                    | (a+b)
   * </pre>
   * @param alpha
   * @param beta
   * @return The beta function for given values of alpha and beta.
```

### JavadocDeclaration
`@param beta` tag description is missing
in `core/src/main/java/org/apache/mahout/math/jet/stat/Gamma.java`
#### Snippet
```java
   * </pre>
   * @param alpha
   * @param beta
   * @return The beta function for given values of alpha and beta.
   */
```

### JavadocDeclaration
`@param capacity` tag description is missing
in `core/src/main/java/org/apache/mahout/math/map/OpenHashMap.java`
#### Snippet
```java
  /**
   * Access for unit tests.
   * @param capacity
   * @param minLoadFactor
   * @param maxLoadFactor
```

### JavadocDeclaration
`@param minLoadFactor` tag description is missing
in `core/src/main/java/org/apache/mahout/math/map/OpenHashMap.java`
#### Snippet
```java
   * Access for unit tests.
   * @param capacity
   * @param minLoadFactor
   * @param maxLoadFactor
   */
```

### JavadocDeclaration
`@param maxLoadFactor` tag description is missing
in `core/src/main/java/org/apache/mahout/math/map/OpenHashMap.java`
#### Snippet
```java
   * @param capacity
   * @param minLoadFactor
   * @param maxLoadFactor
   */
  void getInternalFactors(int[] capacity, 
```

### JavadocDeclaration
`@param capacity` tag description is missing
in `core/src/main/java/org/apache/mahout/math/set/OpenHashSet.java`
#### Snippet
```java
  /**
   * Access for unit tests.
   * @param capacity
   * @param minLoadFactor
   * @param maxLoadFactor
```

### JavadocDeclaration
`@param minLoadFactor` tag description is missing
in `core/src/main/java/org/apache/mahout/math/set/OpenHashSet.java`
#### Snippet
```java
   * Access for unit tests.
   * @param capacity
   * @param minLoadFactor
   * @param maxLoadFactor
   */
```

### JavadocDeclaration
`@param maxLoadFactor` tag description is missing
in `core/src/main/java/org/apache/mahout/math/set/OpenHashSet.java`
#### Snippet
```java
   * @param capacity
   * @param minLoadFactor
   * @param maxLoadFactor
   */
  void getInternalFactors(int[] capacity, 
```

### JavadocDeclaration
`@param a` tag description is missing
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
   * This is used for 'external' sorting. The comparator takes <em>indices</em>,
   * not values, and compares the external values found at those indices.
   * @param a
   * @param b
   * @param c
```

### JavadocDeclaration
`@param b` tag description is missing
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
   * not values, and compares the external values found at those indices.
   * @param a
   * @param b
   * @param c
   * @param comp
```

### JavadocDeclaration
`@param c` tag description is missing
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
   * @param a
   * @param b
   * @param c
   * @param comp
   * @return
```

### JavadocDeclaration
`@param comp` tag description is missing
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
   * @param b
   * @param c
   * @param comp
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/mahout/math/Sorting.java`
#### Snippet
```java
   * @param c
   * @param comp
   * @return
   */
  private static int med3(int a, int b, int c, IntComparator comp) {
```

### JavadocDeclaration
`@param n` tag description is missing
in `core/src/main/java/org/apache/mahout/collections/Arithmetic.java`
#### Snippet
```java
   * </ul>
   *
     * @param n
     * @param k
   * @return the binomial coefficient.
```

### JavadocDeclaration
`@param k` tag description is missing
in `core/src/main/java/org/apache/mahout/collections/Arithmetic.java`
#### Snippet
```java
   *
     * @param n
     * @param k
   * @return the binomial coefficient.
   */
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `data` may be 'final'
in `core/src/main/java/org/apache/mahout/math/Matrices.java`
#### Snippet
```java
  public static IntIntFunction uniformSymmetricGenerator(final int seed) {
    return new IntIntFunction() {
      private byte[] data = new byte[8];

      @Override
```

### FieldMayBeFinal
Field `index` may be 'final'
in `core/src/main/java/org/apache/mahout/math/FileBasedSparseBinaryMatrix.java`
#### Snippet
```java
          if (i < maxIndex) {
            return new Element() {
              int index = i++;
              /**
               * @return the value of this vector element.
```

### FieldMayBeFinal
Field `denseLike` may be 'final'
in `core/src/main/java/org/apache/mahout/math/FunctionalMatrixView.java`
#### Snippet
```java
   */
  private IntIntFunction gf;
  private boolean denseLike;
  private MatrixFlavor flavor;

```

### FieldMayBeFinal
Field `gf` may be 'final'
in `core/src/main/java/org/apache/mahout/math/FunctionalMatrixView.java`
#### Snippet
```java
   * view generator function
   */
  private IntIntFunction gf;
  private boolean denseLike;
  private MatrixFlavor flavor;
```

### FieldMayBeFinal
Field `flavor` may be 'final'
in `core/src/main/java/org/apache/mahout/math/FunctionalMatrixView.java`
#### Snippet
```java
  private IntIntFunction gf;
  private boolean denseLike;
  private MatrixFlavor flavor;

  public FunctionalMatrixView(int rows, int columns, IntIntFunction gf) {
```

### FieldMayBeFinal
Field `index` may be 'final'
in `core/src/main/java/org/apache/mahout/math/MatrixSlice.java`
#### Snippet
```java

public class MatrixSlice extends DelegatingVector {
  private int index;

  public MatrixSlice(Vector v, int index) {
```

### FieldMayBeFinal
Field `rowVectors` may be 'final'
in `core/src/main/java/org/apache/mahout/math/SparseMatrix.java`
#### Snippet
```java
public class SparseMatrix extends AbstractMatrix {

  private Int2ObjectOpenHashMap<Vector> rowVectors;
  
  /**
```

### FieldMayBeFinal
Field `r` may be 'final'
in `core/src/main/java/org/apache/mahout/math/DiagonalMatrix.java`
#### Snippet
```java
        int i = 0;

        Element r = new Element() {
          @Override
          public double get() {
```

### FieldMayBeFinal
Field `index` may be 'final'
in `core/src/main/java/org/apache/mahout/math/DiagonalMatrix.java`
#### Snippet
```java
   */
  public class SingleElementVector extends AbstractVector {
    private int index;

    public SingleElementVector(int index) {
```

### FieldMayBeFinal
Field `m` may be 'final'
in `core/src/main/java/org/apache/mahout/math/TransposedMatrixView.java`
#### Snippet
```java
public class TransposedMatrixView extends AbstractMatrix {

  private Matrix m;

  public TransposedMatrixView(Matrix m) {
```

### FieldMayBeFinal
Field `flavor` may be 'final'
in `core/src/main/java/org/apache/mahout/math/TransposedMatrixView.java`
#### Snippet
```java
  }

  private MatrixFlavor flavor = new MatrixFlavor() {
    @Override
    public BackEnum getBacking() {
```

### FieldMayBeFinal
Field `pBacking` may be 'final'
in `core/src/main/java/org/apache/mahout/math/flavor/MatrixFlavor.java`
#### Snippet
```java

  final class FlavorImpl implements MatrixFlavor {
    private BackEnum pBacking;
    private TraversingStructureEnum pStructure;
    private boolean pDense;
```

### FieldMayBeFinal
Field `pStructure` may be 'final'
in `core/src/main/java/org/apache/mahout/math/flavor/MatrixFlavor.java`
#### Snippet
```java
  final class FlavorImpl implements MatrixFlavor {
    private BackEnum pBacking;
    private TraversingStructureEnum pStructure;
    private boolean pDense;

```

### FieldMayBeFinal
Field `pDense` may be 'final'
in `core/src/main/java/org/apache/mahout/math/flavor/MatrixFlavor.java`
#### Snippet
```java
    private BackEnum pBacking;
    private TraversingStructureEnum pStructure;
    private boolean pDense;

    public FlavorImpl(BackEnum backing, TraversingStructureEnum structure, boolean dense) {
```

### FieldMayBeFinal
Field `valuesIterator` may be 'final'
in `core/src/main/java/org/apache/mahout/math/random/Multinomial.java`
#### Snippet
```java
  public Iterator<T> iterator() {
    return new AbstractIterator<T>() {
      Iterator<T> valuesIterator = Iterables.skip(values, 1).iterator();
      @Override
      protected T computeNext() {
```

## RuleId[id=MismatchedCollectionQueryUpdate]
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

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=UnnecessaryUnaryMinus]
### UnnecessaryUnaryMinus
Unnecessary unary `-` operator
in `core/src/main/java/org/apache/mahout/math/jet/random/engine/RandomEngine.java`
#### Snippet
```java
      // -9.223372036854776E18 == (double) Long.MIN_VALUE
      // 5.421010862427522E-20 == 1 / Math.pow(2,64) == 1 / ((double) Long.MAX_VALUE - (double) Long.MIN_VALUE);
      nextDouble = (nextLong() - -9.223372036854776E18) * 5.421010862427522E-20;
    }
    // catch loss of precision of long --> double conversion
```

## RuleId[id=UnusedAssignment]
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

## RuleId[id=ConstantValue]
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
Condition `realEigen != null` is always `true`
in `core/src/main/java/org/apache/mahout/math/decomposer/lanczos/LanczosSolver.java`
#### Snippet
```java

      Preconditions.checkState(realEigen != null);
      assert realEigen != null;

      realEigen = realEigen.normalize();
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
Condition `i < low` is always `false`
in `core/src/main/java/org/apache/mahout/math/solver/EigenDecomposition.java`
#### Snippet
```java

    for (int i = 0; i < nn; i++) {
      if (i < low || i > high) {
        for (int j = i; j < nn; j++) {
          v.setQuick(i, j, h.getQuick(i, j));
```

## RuleId[id=UnstableApiUsage]
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
'com.google.common.io.LineProcessor' is marked unstable with @Beta
in `core/src/main/java/org/apache/mahout/math/random/IndianBuffet.java`
#### Snippet
```java
      try {
        words = Resources.readLines(Resources.getResource("words.txt"), Charsets.UTF_8,
                                    new LineProcessor<List<String>>() {
            private final List<String> theWords = Lists.newArrayList();

```

