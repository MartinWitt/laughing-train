# datasketches-hive 
 
# Bad smells
I found 38 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicatedCode | 18 | false |
| JavadocReference | 11 | false |
| ConstantValue | 4 | false |
| UNCHECKED_WARNING | 3 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| FieldCanBeLocal | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hive/cpc/DataToSketchUDAF.java`
#### Snippet
```java
    final ObjectInspector[] inspectors = info.getParameterObjectInspectors();

    // Validate the correct number of parameters
    if (inspectors.length < 1) {
      throw new UDFArgumentException("Please specify at least 1 argument");
    }

    if (inspectors.length > 3) {
      throw new UDFArgumentException("Please specify no more than 3 arguments");
    }

    // Validate first parameter type
    ObjectInspectorValidator.validateCategoryPrimitive(inspectors[0], 0);

    // Validate second argument if present
    if (inspectors.length > 1) {
      ObjectInspectorValidator.validateIntegralParameter(inspectors[1], 1);
      if (!ObjectInspectorUtils.isConstantObjectInspector(inspectors[1])) {
        throw new UDFArgumentTypeException(1, "The second argument must be a constant");
      }
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hive/cpc/DataToSketchUDAF.java`
#### Snippet
```java
      if (mode == Mode.PARTIAL1 || mode == Mode.PARTIAL2) {
        // intermediate results need to include the lgK and the target HLL type
        return ObjectInspectorFactory.getStandardStructObjectInspector(
          Arrays.asList(LG_K_FIELD, SEED_FIELD, SKETCH_FIELD),
          Arrays.asList(
            PrimitiveObjectInspectorFactory.getPrimitiveWritableObjectInspector(PrimitiveCategory.INT),
            PrimitiveObjectInspectorFactory.getPrimitiveWritableObjectInspector(PrimitiveCategory.LONG),
            PrimitiveObjectInspectorFactory.getPrimitiveWritableObjectInspector(PrimitiveCategory.BINARY)
          )
        );
      }
      // final results include just the sketch
      return PrimitiveObjectInspectorFactory.getPrimitiveWritableObjectInspector(PrimitiveCategory.BINARY);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hive/cpc/DataToSketchUDAF.java`
#### Snippet
```java
      int lgK = DEFAULT_LG_K;
      if (this.lgKInspector_ != null) {
        lgK = PrimitiveObjectInspectorUtils.getInt(parameters[1], this.lgKInspector_);
      }
      long seed = DEFAULT_UPDATE_SEED;
      if (this.seedInspector_ != null) {
        seed = PrimitiveObjectInspectorUtils.getLong(parameters[2], this.seedInspector_);
      }
      state.init(lgK, seed);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hive/cpc/ObjectInspectorValidator.java`
#### Snippet
```java
    validateCategoryPrimitive(inspector, index);
    final PrimitiveObjectInspector primitiveInspector = (PrimitiveObjectInspector) inspector;
    switch (primitiveInspector.getPrimitiveCategory()) {
    case BYTE:
    case SHORT:
    case INT:
    case LONG:
      break;
    // all other types are invalid
    default:
      throw new UDFArgumentTypeException(index, "Only integral type parameters are expected but "
          + primitiveInspector.getPrimitiveCategory().name() + " was passed as parameter " + (index + 1));
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hive/cpc/SketchEvaluator.java`
#### Snippet
```java
    if (data == null) { return; }
    final UnionState state = (UnionState) buf;
    if (!state.isInitialized()) {
      initializeState(state, data);
    }
    final BytesWritable serializedSketch = (BytesWritable) this.intermediateInspector_.getStructFieldData(
        data, this.intermediateInspector_.getStructFieldRef(SKETCH_FIELD));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hive/cpc/SketchState.java`
#### Snippet
```java
    switch (objectInspector.getPrimitiveCategory()) {
      case BINARY:
        this.sketch_.update(PrimitiveObjectInspectorUtils.getBinary(data, objectInspector)
            .copyBytes());
        return;
      case BYTE:
        this.sketch_.update(PrimitiveObjectInspectorUtils.getByte(data, objectInspector));
        return;
      case DOUBLE:
        this.sketch_.update(PrimitiveObjectInspectorUtils.getDouble(data, objectInspector));
        return;
      case FLOAT:
        this.sketch_.update(PrimitiveObjectInspectorUtils.getFloat(data, objectInspector));
        return;
      case INT:
        this.sketch_.update(PrimitiveObjectInspectorUtils.getInt(data, objectInspector));
        return;
      case LONG:
        this.sketch_.update(PrimitiveObjectInspectorUtils.getLong(data, objectInspector));
        return;
      case STRING:
        // conversion to char[] avoids costly UTF-8 encoding
        this.sketch_.update(PrimitiveObjectInspectorUtils.getString(data, objectInspector)
            .toCharArray());
        return;
      case CHAR:
        this.sketch_.update(PrimitiveObjectInspectorUtils.getHiveChar(data, objectInspector)
            .getValue().toCharArray());
        return;
      case VARCHAR:
        this.sketch_.update(PrimitiveObjectInspectorUtils.getHiveVarchar(data, objectInspector)
            .getValue().toCharArray());
        return;
      default:
        throw new IllegalArgumentException(
          "Unrecongnized input data type " + data.getClass().getSimpleName() + " category "
          + objectInspector.getPrimitiveCategory() + ", please use data of the following types: "
          + "byte, double, float, int, long, char, varchar or string.");
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hive/cpc/UnionSketchUDAF.java`
#### Snippet
```java
    final ObjectInspector[] inspectors = info.getParameterObjectInspectors();

    if (inspectors.length < 1) {
      throw new UDFArgumentException("Please specify at least 1 argument");
    }

    if (inspectors.length > 3) {
      throw new UDFArgumentTypeException(inspectors.length - 1, "Please specify no more than 3 arguments");
    }

    ObjectInspectorValidator.validateGivenPrimitiveCategory(inspectors[0], 0, PrimitiveCategory.BINARY);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hive/cpc/UnionSketchUDAF.java`
#### Snippet
```java
      if (parameters[0] == null) { return; }
      final UnionState state = (UnionState) buf;
      if (!state.isInitialized()) {
        initializeState(state, parameters);
      }
      final byte[] serializedSketch = (byte[]) this.inputInspector_.getPrimitiveJavaObject(parameters[0]);
      if (serializedSketch == null) { return; }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hive/frequencies/DataToStringsSketchUDAF.java`
#### Snippet
```java
      final Object value = this.inputObjectInspector.getPrimitiveJavaObject(data);
      if (value instanceof String) {
        return (String) value;
      } else if (value instanceof HiveChar) {
        return ((HiveChar) value).getValue();
      } else if (value instanceof HiveVarchar) {
        return ((HiveVarchar) value).getValue();
      } else {
        throw new UDFArgumentTypeException(0, "unsupported type " + value.getClass().getName());
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hive/frequencies/GetFrequentItemsFromStringsSketchUDTF.java`
#### Snippet
```java
    if (inspectors[0].getCategory() != ObjectInspector.Category.PRIMITIVE) {
      throw new UDFArgumentTypeException(0, "Primitive argument expected, but "
          + inspectors[0].getCategory().name() + " was recieved");
    }
    this.inputObjectInspector = (PrimitiveObjectInspector) inspectors[0];
    if (this.inputObjectInspector.getPrimitiveCategory()
        != PrimitiveObjectInspector.PrimitiveCategory.BINARY) {
      throw new UDFArgumentTypeException(0, "Binary value expected as the first argument, but "
          + this.inputObjectInspector.getPrimitiveCategory().name() + " was recieved");
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hive/hll/DataToSketchUDAF.java`
#### Snippet
```java
      if (mode == Mode.PARTIAL1 || mode == Mode.PARTIAL2) {
        // intermediate results need to include the lgK and the target HLL type
        return ObjectInspectorFactory.getStandardStructObjectInspector(
          Arrays.asList(LG_K_FIELD, HLL_TYPE_FIELD, SKETCH_FIELD),
          Arrays.asList(
            PrimitiveObjectInspectorFactory.getPrimitiveWritableObjectInspector(PrimitiveCategory.INT),
            PrimitiveObjectInspectorFactory.getPrimitiveWritableObjectInspector(PrimitiveCategory.STRING),
            PrimitiveObjectInspectorFactory.getPrimitiveWritableObjectInspector(PrimitiveCategory.BINARY)
          )
        );
      }
      // final results include just the sketch
      return PrimitiveObjectInspectorFactory.getPrimitiveWritableObjectInspector(PrimitiveCategory.BINARY);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hive/hll/DataToSketchUDAF.java`
#### Snippet
```java
      int lgK = DEFAULT_LG_K;
      if (this.lgKInspector_ != null) {
        lgK = PrimitiveObjectInspectorUtils.getInt(parameters[1], this.lgKInspector_);
      }
      TgtHllType type = DEFAULT_HLL_TYPE;
      if (this.hllTypeInspector_ != null) {
        type =
          TgtHllType.valueOf(PrimitiveObjectInspectorUtils.getString(parameters[2], this.hllTypeInspector_));
      }
      state.init(lgK, type);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hive/kll/DataToSketchUDAF.java`
#### Snippet
```java
      if (data[0] == null) { return; }
      final SketchState state = (SketchState) buf;
      if (!state.isInitialized()) {
        if (this.kInspector_ != null) {
          state.init(PrimitiveObjectInspectorUtils.getInt(data[1], this.kInspector_));
        } else {
          state.init();
        }
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hive/kll/UnionSketchUDAF.java`
#### Snippet
```java
    final ObjectInspector[] inspectors = info.getParameterObjectInspectors();
    if ((inspectors.length != 1) && (inspectors.length != 2)) {
      throw new UDFArgumentException("One or two arguments expected");
    }
    ObjectInspectorValidator.validateGivenPrimitiveCategory(inspectors[0], 0, PrimitiveCategory.BINARY);
    if (inspectors.length == 2) {
      ObjectInspectorValidator.validateGivenPrimitiveCategory(inspectors[1], 1, PrimitiveCategory.INT);
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hive/quantiles/DoublesEvaluator.java`
#### Snippet
```java
    super.init(mode, parameters);
    this.inputObjectInspector = (PrimitiveObjectInspector) parameters[0];

    // Parameters:
    // In PARTIAL1 and COMPLETE mode, the parameters are original data.
    // In PARTIAL2 and FINAL mode, the parameters are partial aggregations.
    if (mode == Mode.PARTIAL1 || mode == Mode.COMPLETE) {
      if (parameters.length > 1) {
        this.kObjectInspector = (PrimitiveObjectInspector) parameters[1];
      }
    }

    return PrimitiveObjectInspectorFactory.getPrimitiveWritableObjectInspector(PrimitiveCategory.BINARY);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hive/theta/EstimateSketchSimilarityUDF.java`
#### Snippet
```java
    Sketch firstSketch = null;
    if (firstSketchBytes != null && firstSketchBytes.getLength() > 0) {
      firstSketch = Sketch.wrap(BytesWritableHelper.wrapAsMemory(firstSketchBytes), DEFAULT_UPDATE_SEED);
    }

    Sketch secondSketch = null;
    if (secondSketchBytes != null && secondSketchBytes.getLength() > 0) {
      secondSketch = Sketch.wrap(BytesWritableHelper.wrapAsMemory(secondSketchBytes), DEFAULT_UPDATE_SEED);
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchToMeansUDF.java`
#### Snippet
```java
    if (serializedSketch == null) { return null; }
    final ArrayOfDoublesSketch sketch = ArrayOfDoublesSketches.wrapSketch(
        BytesWritableHelper.wrapAsMemory(serializedSketch));

    if (sketch.getRetainedEntries() < 1) {
      return null;
    }

    final SummaryStatistics[] summaries = ArrayOfDoublesSketchStats.sketchToSummaryStatistics(sketch);
    final List<Double> means = new ArrayList<>(sketch.getNumValues());
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/datasketches/hive/tuple/DataToDoubleSummaryWithModeSketchUDAF.java`
#### Snippet
```java
      @SuppressWarnings("unchecked")
      final State<DoubleSummary> state = (State<DoubleSummary>) buf;
      final Sketch<DoubleSummary> intermediate = state.getResult();
      if (intermediate == null) { return null; }
      final byte[] bytes = intermediate.toByteArray();
      return Arrays.asList(
        new IntWritable(state.getNominalNumEntries()),
        new Text(this.summaryMode_.toString()),
        new BytesWritable(bytes)
      );
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchToVariancesUDF.java`
#### Snippet
```java

    final SummaryStatistics[] summaries = ArrayOfDoublesSketchStats.sketchToSummaryStatistics(sketch);
    final List<Double> variances = new ArrayList<>(sketch.getNumValues());
    for (int i = 0; i < sketch.getNumValues(); i++) {
      variances.add(summaries[i].getVariance());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchToMeansUDF.java`
#### Snippet
```java

    final SummaryStatistics[] summaries = ArrayOfDoublesSketchStats.sketchToSummaryStatistics(sketch);
    final List<Double> means = new ArrayList<>(sketch.getNumValues());
    for (int i = 0; i < sketch.getNumValues(); i++) {
      means.add(summaries[i].getMean());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchesTTestUDF.java`
#### Snippet
```java

    final TTest tTest = new TTest();
    final List<Double> pValues = new ArrayList<>(sketchA.getNumValues());
    for (int i = 0; i < sketchA.getNumValues(); i++) {
      pValues.add(tTest.tTest(summariesA[i], summariesB[i]));
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver`
in `src/main/java/org/apache/datasketches/hive/cpc/DataToSketchUDAF.java`
#### Snippet
```java
   * </ul>
   *
   * @see org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver
   * #getEvaluator(org.apache.hadoop.hive.ql.udf.generic.GenericUDAFParameterInfo)
   *
```

### JavadocReference
Cannot resolve symbol `SemanticException`
in `src/main/java/org/apache/datasketches/hive/tuple/UnionSketchUDAF.java`
#### Snippet
```java
   * Override this if your UDF has more arguments
   * @param inspectors array of inspectors
   * @throws SemanticException if anything is wrong
   */
  protected void checkExtraArguments(final ObjectInspector[] inspectors) throws SemanticException {
```

### JavadocReference
Cannot resolve symbol `HiveException`
in `src/main/java/org/apache/datasketches/hive/tuple/DataToSketchUDAF.java`
#### Snippet
```java
     * @param valueInspector PrimitiveObjectInspector for the value
     * @return extracted value
     * @throws HiveException if anything goes wrong
     */
    public U extractValue(final Object data, final PrimitiveObjectInspector valueInspector)
```

### JavadocReference
Cannot resolve symbol `SemanticException`
in `src/main/java/org/apache/datasketches/hive/tuple/DataToSketchUDAF.java`
#### Snippet
```java
   * Override this if your UDF has more arguments
   * @param inspectors array of inspectors
   * @throws SemanticException if anything is wrong
   */
  protected void checkExtraArguments(final ObjectInspector[] inspectors) throws SemanticException {
```

### JavadocReference
Cannot resolve symbol `org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver`
in `src/main/java/org/apache/datasketches/hive/theta/DataToSketchUDAF.java`
#### Snippet
```java
   * </ul>
   *
   * @see org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver
   * #getEvaluator(org.apache.hadoop.hive.ql.udf.generic.GenericUDAFParameterInfo)
   *
```

### JavadocReference
Cannot resolve symbol `org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver`
in `src/main/java/org/apache/datasketches/hive/hll/UnionSketchUDAF.java`
#### Snippet
```java
   * be BINARY sketch). Also check lgK and target HLL type parameters if they are passed in.
   *
   * @see org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver
   * #getEvaluator(org.apache.hadoop.hive.ql.udf.generic.GenericUDAFParameterInfo)
   *
```

### JavadocReference
Cannot resolve symbol `org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver`
in `src/main/java/org/apache/datasketches/hive/hll/DataToSketchUDAF.java`
#### Snippet
```java
   * </ul>
   *
   * @see org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver
   * #getEvaluator(org.apache.hadoop.hive.ql.udf.generic.GenericUDAFParameterInfo)
   *
```

### JavadocReference
Cannot resolve symbol `org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver`
in `src/main/java/org/apache/datasketches/hive/theta/UnionSketchUDAF.java`
#### Snippet
```java
   * be BINARY sketch). Also check sketch size and seed params if they are passed in.
   *
   * @see org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver
   * #getEvaluator(org.apache.hadoop.hive.ql.udf.generic.GenericUDAFParameterInfo)
   *
```

### JavadocReference
Cannot resolve symbol `org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver`
in `src/main/java/org/apache/datasketches/hive/cpc/UnionSketchUDAF.java`
#### Snippet
```java
   * be BINARY sketch). Also check lgK and seed parameters if they are passed in.
   *
   * @see org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver
   * #getEvaluator(org.apache.hadoop.hive.ql.udf.generic.GenericUDAFParameterInfo)
   *
```

### JavadocReference
Cannot resolve symbol `org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator`
in `src/main/java/org/apache/datasketches/hive/theta/UnionEvaluator.java`
#### Snippet
```java
  /**
   *
   * @see org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator#getNewAggregationBuffer()
   */
  @SuppressWarnings("deprecation")
```

### JavadocReference
Cannot resolve symbol `getNewAggregationBuffer()`
in `src/main/java/org/apache/datasketches/hive/theta/UnionEvaluator.java`
#### Snippet
```java
  /**
   *
   * @see org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator#getNewAggregationBuffer()
   */
  @SuppressWarnings("deprecation")
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchToValuesUDTF.java`
#### Snippet
```java

    return ObjectInspectorFactory.getStandardStructObjectInspector(
      Arrays.asList("values"),
      Arrays.asList(
        ObjectInspectorFactory.getStandardListObjectInspector(
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `value instanceof HiveChar` is always `false`
in `src/main/java/org/apache/datasketches/hive/frequencies/DataToStringsSketchUDAF.java`
#### Snippet
```java
      if (value instanceof String) {
        return (String) value;
      } else if (value instanceof HiveChar) {
        return ((HiveChar) value).getValue();
      } else if (value instanceof HiveVarchar) {
```

### ConstantValue
Condition `value instanceof HiveVarchar` is always `false`
in `src/main/java/org/apache/datasketches/hive/frequencies/DataToStringsSketchUDAF.java`
#### Snippet
```java
      } else if (value instanceof HiveChar) {
        return ((HiveChar) value).getValue();
      } else if (value instanceof HiveVarchar) {
        return ((HiveVarchar) value).getValue();
      } else {
```

### ConstantValue
Condition `value instanceof HiveChar` is always `false`
in `src/main/java/org/apache/datasketches/hive/quantiles/DataToStringsSketchUDAF.java`
#### Snippet
```java
      if (value instanceof String) {
        return (String) value;
      } else if (value instanceof HiveChar) {
        return ((HiveChar) value).getValue();
      } else if (value instanceof HiveVarchar) {
```

### ConstantValue
Condition `value instanceof HiveVarchar` is always `false`
in `src/main/java/org/apache/datasketches/hive/quantiles/DataToStringsSketchUDAF.java`
#### Snippet
```java
      } else if (value instanceof HiveChar) {
        return ((HiveChar) value).getValue();
      } else if (value instanceof HiveVarchar) {
        return ((HiveVarchar) value).getValue();
      } else {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/datasketches/hive/frequencies/ItemsState.java`
#### Snippet
```java
class ItemsState<T> extends AbstractAggregationBuffer {

  private int maxMapSize_;
  private final ArrayOfItemsSerDe<T> serDe_;
  private ItemsSketch<T> sketch;
```

