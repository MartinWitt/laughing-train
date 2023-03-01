# datasketches-hive 
 
# Bad smells
I found 136 bad smells with 11 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 87 | false |
| MissortedModifiers | 21 | false |
| UtilityClassWithoutPrivateConstructor | 10 | true |
| UnnecessaryFullyQualifiedName | 7 | false |
| RedundantSuppression | 6 | false |
| UnnecessarySuperQualifier | 3 | false |
| HtmlWrongAttributeValue | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-01-10-16-20.300.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/UnionDoubleSummarySketchUDAF.java`
#### Snippet
```java
    @Override
    protected SummaryFactory<DoubleSummary> getSummaryFactory(final Object[] data) {
      return null; // union never needs to create new instances
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/DoubleSummarySketchToEstimatesUDF.java`
#### Snippet
```java
   */
  public List<Double> evaluate(final BytesWritable serializedSketch) {
    if (serializedSketch == null) { return null; }
    final Sketch<DoubleSummary> sketch =
        Sketches.heapifySketch(BytesWritableHelper.wrapAsMemory(serializedSketch), SUMMARY_DESERIALIZER);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchToVariancesUDF.java`
#### Snippet
```java
   */
  public List<Double> evaluate(final BytesWritable serializedSketch) {
    if (serializedSketch == null) { return null; }
    final ArrayOfDoublesSketch sketch = ArrayOfDoublesSketches.wrapSketch(
        BytesWritableHelper.wrapAsMemory(serializedSketch));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchToVariancesUDF.java`
#### Snippet
```java

    if (sketch.getRetainedEntries() < 1) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchToMeansUDF.java`
#### Snippet
```java
   */
  public List<Double> evaluate(final BytesWritable serializedSketch) {
    if (serializedSketch == null) { return null; }
    final ArrayOfDoublesSketch sketch = ArrayOfDoublesSketches.wrapSketch(
        BytesWritableHelper.wrapAsMemory(serializedSketch));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchToMeansUDF.java`
#### Snippet
```java

    if (sketch.getRetainedEntries() < 1) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/cpc/GetEstimateUDF.java`
#### Snippet
```java
   */
  public Double evaluate(final BytesWritable serializedSketch, final long seed) {
    if (serializedSketch == null) { return null; }
    final CpcSketch sketch = CpcSketch.heapify(BytesWritableHelper.wrapAsMemory(serializedSketch), seed);
    return sketch.getEstimate();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchToQuantilesSketchUDF.java`
#### Snippet
```java
  public BytesWritable evaluate(final BytesWritable serializedSketch, final int column,
      final int k) {
    if (serializedSketch == null) { return null; }
    final ArrayOfDoublesSketch sketch = ArrayOfDoublesSketches.wrapSketch(
        BytesWritableHelper.wrapAsMemory(serializedSketch));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetQuantilesFromStringsSketchUDF.java`
#### Snippet
```java
   */
  public List<String> evaluate(final BytesWritable serializedSketch, final int number) {
    if (serializedSketch == null) { return null; }
    final ItemsSketch<String> sketch = ItemsSketch.getInstance(
      BytesWritableHelper.wrapAsMemory(serializedSketch),
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetQuantilesFromStringsSketchUDF.java`
#### Snippet
```java
    );
    final String[] quantiles = sketch.getQuantiles(number);
    if (quantiles == null) { return null; }
    return Arrays.asList(quantiles);
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetQuantilesFromStringsSketchUDF.java`
#### Snippet
```java
   */
  public List<String> evaluate(final BytesWritable serializedSketch, final Double... fractions) {
    if (serializedSketch == null) { return null; }
    final ItemsSketch<String> sketch = ItemsSketch.getInstance(
      BytesWritableHelper.wrapAsMemory(serializedSketch),
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetKFromStringsSketchUDF.java`
#### Snippet
```java
   */
  public Integer evaluate(final BytesWritable serializedSketch) {
    if (serializedSketch == null) { return null; }
    final ItemsSketch<String> sketch = ItemsSketch.getInstance(
      BytesWritableHelper.wrapAsMemory(serializedSketch),
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/DataToDoubleSummaryWithModeSketchUDAF.java`
#### Snippet
```java
      final State<DoubleSummary> state = (State<DoubleSummary>) buf;
      final Sketch<DoubleSummary> intermediate = state.getResult();
      if (intermediate == null) { return null; }
      final byte[] bytes = intermediate.toByteArray();
      return Arrays.asList(
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/DataToDoubleSummaryWithModeSketchUDAF.java`
#### Snippet
```java
    @Override
    protected SummarySetOperations<DoubleSummary> getSummarySetOperationsForIterate(final Object[] data) {
      return null; // not needed for building sketches
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetCdfFromDoublesSketchUDF.java`
#### Snippet
```java
   */
  public List<Double> evaluate(final BytesWritable serializedSketch, final Double... splitPoints) {
    if (serializedSketch == null) { return null; }
    final DoublesSketch sketch = DoublesSketch.wrap(BytesWritableHelper.wrapAsMemory(serializedSketch));
    final double[] cdf = sketch.getCDF(Util.objectsToPrimitives(splitPoints));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetCdfFromDoublesSketchUDF.java`
#### Snippet
```java
    final DoublesSketch sketch = DoublesSketch.wrap(BytesWritableHelper.wrapAsMemory(serializedSketch));
    final double[] cdf = sketch.getCDF(Util.objectsToPrimitives(splitPoints));
    if (cdf == null) { return null; }
    return Util.primitivesToList(cdf);
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/cpc/SketchState.java`
#### Snippet
```java
  @Override
  CpcSketch getResult() {
    if (this.sketch_ == null) { return null; }
    return this.sketch_;
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/DoublesEvaluator.java`
#### Snippet
```java
    final DoublesUnionState state = (DoublesUnionState) buf;
    final DoublesSketch resultSketch = state.getResult();
    if (resultSketch == null) { return null; }
    return new BytesWritable(resultSketch.toByteArray(true));
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/kll/SketchToStringUDF.java`
#### Snippet
```java
   */
  public String evaluate(final BytesWritable serializedSketch) {
    if (serializedSketch == null) { return null; }
    final KllFloatsSketch sketch =
        KllFloatsSketch.heapify(BytesWritableHelper.wrapAsMemory(serializedSketch));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/kll/GetCdfUDF.java`
#### Snippet
```java
   */
  public List<Double> evaluate(final BytesWritable serializedSketch, final Float... splitPoints) {
    if (serializedSketch == null) { return null; }
    final KllFloatsSketch sketch =
        KllFloatsSketch.heapify(BytesWritableHelper.wrapAsMemory(serializedSketch));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/kll/GetCdfUDF.java`
#### Snippet
```java
        KllFloatsSketch.heapify(BytesWritableHelper.wrapAsMemory(serializedSketch));
    final double[] cdf = sketch.getCDF(Util.objectsToPrimitives(splitPoints));
    if (cdf == null) { return null; }
    return Util.primitivesToList(cdf);
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/kll/GetNUDF.java`
#### Snippet
```java
   */
  public Long evaluate(final BytesWritable serializedSketch) {
    if (serializedSketch == null) { return null; }
    final KllFloatsSketch sketch =
        KllFloatsSketch.heapify(BytesWritableHelper.wrapAsMemory(serializedSketch));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/ItemsUnionState.java`
#### Snippet
```java

  public ItemsSketch<T> getResult() {
    if (this.union == null) { return null; }
    return this.union.getResultAndReset();
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/kll/GetPmfUDF.java`
#### Snippet
```java
   */
  public List<Double> evaluate(final BytesWritable serializedSketch, final Float... splitPoints) {
    if (serializedSketch == null) { return null; }
    final KllFloatsSketch sketch =
        KllFloatsSketch.heapify(BytesWritableHelper.wrapAsMemory(serializedSketch));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/kll/GetPmfUDF.java`
#### Snippet
```java
        KllFloatsSketch.heapify(BytesWritableHelper.wrapAsMemory(serializedSketch));
    final double[] pmf = sketch.getPMF(Util.objectsToPrimitives(splitPoints));
    if (pmf == null) { return null; }
    return Util.primitivesToList(pmf);
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/ItemsEvaluator.java`
#### Snippet
```java
    final ItemsUnionState<T> state = (ItemsUnionState<T>) buf;
    final ItemsSketch<T> resultSketch = state.getResult();
    if (resultSketch == null) { return null; }
    return new BytesWritable(resultSketch.toByteArray(this.serDe_));
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/cpc/SketchToStringUDF.java`
#### Snippet
```java
   */
  public String evaluate(final BytesWritable serializedSketch, final long seed) {
    if (serializedSketch == null) { return null; }
    final CpcSketch sketch = CpcSketch.heapify(BytesWritableHelper.wrapAsMemory(serializedSketch), seed);
    return sketch.toString();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/DoublesUnionState.java`
#### Snippet
```java

  public DoublesSketch getResult() {
    if (this.union == null) { return null; }
    return this.union.getResultAndReset();
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchEvaluator.java`
#### Snippet
```java
    final ArrayOfDoublesState state = (ArrayOfDoublesState) buf;
    final ArrayOfDoublesSketch intermediate = state.getResult();
    if (intermediate == null) { return null; }
    final byte[] bytes = intermediate.toByteArray();
    return Arrays.asList(
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchEvaluator.java`
#### Snippet
```java
      throws HiveException {
    final ArrayOfDoublesState state = (ArrayOfDoublesState) buf;
    if (state == null) { return null; }
    final ArrayOfDoublesSketch result = state.getResult();
    if (result == null) { return null; }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchEvaluator.java`
#### Snippet
```java
    if (state == null) { return null; }
    final ArrayOfDoublesSketch result = state.getResult();
    if (result == null) { return null; }
    return new BytesWritable(result.toByteArray());
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetQuantileFromDoublesSketchUDF.java`
#### Snippet
```java
   */
  public Double evaluate(final BytesWritable serializedSketch, final double fraction) {
    if (serializedSketch == null) { return null; }
    final DoublesSketch sketch = DoublesSketch.wrap(BytesWritableHelper.wrapAsMemory(serializedSketch));
    return sketch.getQuantile(fraction);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/kll/SketchEvaluator.java`
#### Snippet
```java
    final SketchState state = (SketchState) buf;
    final KllFloatsSketch resultSketch = state.getResult();
    if (resultSketch == null) { return null; }
    return new BytesWritable(resultSketch.toByteArray());
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchToEstimatesUDF.java`
#### Snippet
```java
   */
  public List<Double> evaluate(final BytesWritable serializedSketch) {
    if (serializedSketch == null) { return null; }
    final ArrayOfDoublesSketch sketch = ArrayOfDoublesSketches.wrapSketch(
        BytesWritableHelper.wrapAsMemory(serializedSketch));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/hll/SketchToStringUDF.java`
#### Snippet
```java
   */
  public String evaluate(final BytesWritable serializedSketch) {
    if (serializedSketch == null) { return null; }
    final HllSketch sketch = HllSketch.wrap(BytesWritableHelper.wrapAsMemory(serializedSketch));
    return sketch.toString();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/theta/UnionState.java`
#### Snippet
```java

  public Sketch getResult() {
    if (this.union_ == null) { return null; }
    return this.union_.getResult();
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/SketchEvaluator.java`
#### Snippet
```java
    final State<S> state = (State<S>) buf;
    final Sketch<S> intermediate = state.getResult();
    if (intermediate == null) { return null; }
    final byte[] bytes = intermediate.toByteArray();
    return Arrays.asList(
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/SketchEvaluator.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    final State<S> state = (State<S>) buf;
    if (state == null) { return null; }
    final Sketch<S> result = state.getResult();
    if (result == null) { return null; }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/SketchEvaluator.java`
#### Snippet
```java
    if (state == null) { return null; }
    final Sketch<S> result = state.getResult();
    if (result == null) { return null; }
    return new BytesWritable(result.toByteArray());
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchToNumberOfRetainedEntriesUDF.java`
#### Snippet
```java
   */
  public Integer evaluate(final BytesWritable serializedSketch) {
    if (serializedSketch == null) { return null; }
    final ArrayOfDoublesSketch sketch = ArrayOfDoublesSketches.wrapSketch(
        BytesWritableHelper.wrapAsMemory(serializedSketch));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/theta/IntersectSketchUDAF.java`
#### Snippet
```java

      Sketch getResult() {
        if (this.intersection_ == null) { return null; }
        return this.intersection_.getResult();
      }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/theta/IntersectSketchUDAF.java`
#### Snippet
```java
      final IntersectionState state = (IntersectionState) buf;
      final Sketch resultSketch = state.getResult();
      if (resultSketch == null) { return null; }
      return new BytesWritable(resultSketch.toByteArray());
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/theta/IntersectSketchUDAF.java`
#### Snippet
```java
      final IntersectionState state = (IntersectionState) buf;
      final Sketch intermediate = state.getResult();
      if (intermediate == null) { return null; }
      final byte[] bytes = intermediate.toByteArray();
      return Arrays.asList(
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/StringsSketchToStringUDF.java`
#### Snippet
```java
   */
  public String evaluate(final BytesWritable serializedSketch) {
    if (serializedSketch == null) { return null; }
    final ItemsSketch<String> sketch = ItemsSketch.getInstance(
      BytesWritableHelper.wrapAsMemory(serializedSketch),
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetCdfFromStringsSketchUDF.java`
#### Snippet
```java
   */
  public List<Double> evaluate(final BytesWritable serializedSketch, final String... splitPoints) {
    if (serializedSketch == null) { return null; }
    final ItemsSketch<String> sketch = ItemsSketch.getInstance(
      BytesWritableHelper.wrapAsMemory(serializedSketch),
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetCdfFromStringsSketchUDF.java`
#### Snippet
```java
    );
    final double[] cdf = sketch.getCDF(splitPoints);
    if (cdf == null) { return null; }
    return Util.primitivesToList(cdf);
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesUnionState.java`
#### Snippet
```java
  @Override
  ArrayOfDoublesSketch getResult() {
    if (this.union_ == null) { return null; }
    return this.union_.getResult();
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/DoublesSketchToStringUDF.java`
#### Snippet
```java
   */
  public String evaluate(final BytesWritable serializedSketch) {
    if (serializedSketch == null) { return null; }
    final DoublesSketch sketch = DoublesSketch.wrap(BytesWritableHelper.wrapAsMemory(serializedSketch));
    return sketch.toString();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetNFromDoublesSketchUDF.java`
#### Snippet
```java
   */
  public Long evaluate(final BytesWritable serializedSketch) {
    if (serializedSketch == null) { return null; }
    final DoublesSketch sketch = DoublesSketch.wrap(BytesWritableHelper.wrapAsMemory(serializedSketch));
    return sketch.getN();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetPmfFromDoublesSketchUDF.java`
#### Snippet
```java
   */
  public List<Double> evaluate(final BytesWritable serializedSketch, final Double... splitPoints) {
    if (serializedSketch == null) { return null; }
    final DoublesSketch sketch = DoublesSketch.wrap(BytesWritableHelper.wrapAsMemory(serializedSketch));
    final double[] pmf = sketch.getPMF(Util.objectsToPrimitives(splitPoints));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetPmfFromDoublesSketchUDF.java`
#### Snippet
```java
    final DoublesSketch sketch = DoublesSketch.wrap(BytesWritableHelper.wrapAsMemory(serializedSketch));
    final double[] pmf = sketch.getPMF(Util.objectsToPrimitives(splitPoints));
    if (pmf == null) { return null; }
    return Util.primitivesToList(pmf);
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetPmfFromStringsSketchUDF.java`
#### Snippet
```java
   */
  public List<Double> evaluate(final BytesWritable serializedSketch, final String... splitPoints) {
    if (serializedSketch == null) { return null; }
    final ItemsSketch<String> sketch = ItemsSketch.getInstance(
      BytesWritableHelper.wrapAsMemory(serializedSketch),
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetPmfFromStringsSketchUDF.java`
#### Snippet
```java
    );
    final double[] pmf = sketch.getPMF(splitPoints);
    if (pmf == null) { return null; }
    return Util.primitivesToList(pmf);
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchState.java`
#### Snippet
```java
  @Override
  ArrayOfDoublesSketch getResult() {
    if (this.sketch_ == null) { return null; }
    // assumes that it is called once at the end of processing
    // since trimming to nominal number of entries is expensive
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/hll/SketchState.java`
#### Snippet
```java
  @Override
  HllSketch getResult() {
    if (this.sketch_ == null) { return null; }
    return this.sketch_;
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/hll/SketchToEstimateUDF.java`
#### Snippet
```java
   */
  public Double evaluate(final BytesWritable serializedSketch) {
    if (serializedSketch == null) { return null; }
    final HllSketch sketch = HllSketch.wrap(BytesWritableHelper.wrapAsMemory(serializedSketch));
    return sketch.getEstimate();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/kll/GetQuantilesUDF.java`
#### Snippet
```java
   */
  public List<Float> evaluate(final BytesWritable serializedSketch, final Double... fractions) {
    if (serializedSketch == null) { return null; }
    final KllFloatsSketch sketch =
        KllFloatsSketch.heapify(BytesWritableHelper.wrapAsMemory(serializedSketch));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/hll/UnionState.java`
#### Snippet
```java
  @Override
  HllSketch getResult() {
    if (this.union_ == null) { return null; }
    return this.union_.getResult(getType());
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetNFromStringsSketchUDF.java`
#### Snippet
```java
   */
  public Long evaluate(final BytesWritable serializedSketch) {
    if (serializedSketch == null) { return null; }
    final ItemsSketch<String> sketch = ItemsSketch.getInstance(
      BytesWritableHelper.wrapAsMemory(serializedSketch),
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/cpc/UnionState.java`
#### Snippet
```java
  @Override
  CpcSketch getResult() {
    if (this.union_ == null) { return null; }
    return this.union_.getResult();
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetQuantilesFromDoublesSketchUDF.java`
#### Snippet
```java
   */
  public List<Double> evaluate(final BytesWritable serializedSketch, final Double... fractions) {
    if (serializedSketch == null) { return null; }
    final DoublesSketch sketch = DoublesSketch.wrap(BytesWritableHelper.wrapAsMemory(serializedSketch));
    return Util.primitivesToList(sketch.getQuantiles(Util.objectsToPrimitives(fractions)));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetQuantilesFromDoublesSketchUDF.java`
#### Snippet
```java
   */
  public List<Double> evaluate(final BytesWritable serializedSketch, final int number) {
    if (serializedSketch == null) { return null; }
    final DoublesSketch sketch = DoublesSketch.wrap(BytesWritableHelper.wrapAsMemory(serializedSketch));
    final double[] quantiles = sketch.getQuantiles(number);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetKFromDoublesSketchUDF.java`
#### Snippet
```java
   */
  public Integer evaluate(final BytesWritable serializedSketch) {
    if (serializedSketch == null) { return null; }
    final DoublesSketch sketch = DoublesSketch.wrap(BytesWritableHelper.wrapAsMemory(serializedSketch));
    return sketch.getK();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetQuantilesFromDoublesSketchUDF.java`
#### Snippet
```java
    final DoublesSketch sketch = DoublesSketch.wrap(BytesWritableHelper.wrapAsMemory(serializedSketch));
    final double[] quantiles = sketch.getQuantiles(number);
    if (quantiles == null) { return null; }
    return Util.primitivesToList(quantiles);
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/cpc/SketchEvaluator.java`
#### Snippet
```java
      throws HiveException {
    final State state = (State) buf;
    if (state == null) { return null; }
    final CpcSketch result = state.getResult();
    if (result == null) { return null; }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/cpc/SketchEvaluator.java`
#### Snippet
```java
    if (state == null) { return null; }
    final CpcSketch result = state.getResult();
    if (result == null) { return null; }
    return new BytesWritable(result.toByteArray());
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/cpc/SketchEvaluator.java`
#### Snippet
```java
    final State state = (State) buf;
    final CpcSketch intermediate = state.getResult();
    if (intermediate == null) { return null; }
    final byte[] bytes = intermediate.toByteArray();
    return Arrays.asList(
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/cpc/GetEstimateAndErrorBoundsUDF.java`
#### Snippet
```java
   */
  public List<Double> evaluate(final BytesWritable serializedSketch, final int kappa, final long seed) {
    if (serializedSketch == null) { return null; }
    final CpcSketch sketch = CpcSketch.heapify(BytesWritableHelper.wrapAsMemory(serializedSketch), seed);
    return Arrays.asList(sketch.getEstimate(), sketch.getLowerBound(kappa), sketch.getUpperBound(kappa));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/theta/UnionEvaluator.java`
#### Snippet
```java
    final UnionState state = (UnionState) agg;
    final Sketch intermediate = state.getResult();
    if (intermediate == null) { return null; }
    final byte[] bytes = intermediate.toByteArray();
    // sampling probability is not relevant for merging
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/theta/UnionEvaluator.java`
#### Snippet
```java
    final UnionState state = (UnionState) agg;
    final Sketch result = state.getResult();
    if (result == null) { return null; }
    return new BytesWritable(result.toByteArray());
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/DoubleSummarySketchToPercentileUDF.java`
#### Snippet
```java
   */
  public Double evaluate(final BytesWritable serializedSketch, final double percentile) {
    if (serializedSketch == null) { return null; }
    if ((percentile < 0) || (percentile > 100)) {
      throw new IllegalArgumentException("percentile must be between 0 and 100");
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchToEstimateAndErrorBoundsUDF.java`
#### Snippet
```java
   */
  public List<Double> evaluate(final BytesWritable serializedSketch) {
    if (serializedSketch == null) { return null; }
    final ArrayOfDoublesSketch sketch = ArrayOfDoublesSketches.wrapSketch(
        BytesWritableHelper.wrapAsMemory(serializedSketch));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/SketchState.java`
#### Snippet
```java
  @Override
  Sketch<S> getResult() {
    if (this.sketch_ == null) { return null; }
    // assumes that it is called once at the end of processing
    // since trimming to nominal number of entries is expensive
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/UnionDoubleSummaryWithModeSketchUDAF.java`
#### Snippet
```java
    @Override
    protected SummaryFactory<DoubleSummary> getSummaryFactory(final Object[] data) {
      return null; // union never needs to create new instances
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/UnionDoubleSummaryWithModeSketchUDAF.java`
#### Snippet
```java
      final State<DoubleSummary> state = (State<DoubleSummary>) buf;
      final Sketch<DoubleSummary> intermediate = state.getResult();
      if (intermediate == null) { return null; }
      final byte[] bytes = intermediate.toByteArray();
      return Arrays.asList(
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/frequencies/ItemsEvaluator.java`
#### Snippet
```java
    final ItemsState<T> state = (ItemsState<T>) buf;
    final ItemsSketch<T> resultSketch = state.getResult();
    if (resultSketch == null) { return null; }
    return new BytesWritable(resultSketch.toByteArray(this.serDe_));
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/DataToDoubleSummarySketchUDAF.java`
#### Snippet
```java
    @Override
    protected SummarySetOperations<DoubleSummary> getSummarySetOperationsForIterate(final Object[] data) {
      return null; // not needed for building sketches
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/kll/GetRankUDF.java`
#### Snippet
```java
   */
  public Double evaluate(final BytesWritable serializedSketch, final float value) {
    if (serializedSketch == null) { return null; }
    final KllFloatsSketch sketch =
        KllFloatsSketch.heapify(BytesWritableHelper.wrapAsMemory(serializedSketch));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/kll/GetQuantileUDF.java`
#### Snippet
```java
   */
  public Float evaluate(final BytesWritable serializedSketch, final double fraction) {
    if (serializedSketch == null) { return null; }
    final KllFloatsSketch sketch =
        KllFloatsSketch.heapify(BytesWritableHelper.wrapAsMemory(serializedSketch));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/UnionState.java`
#### Snippet
```java
  @Override
  Sketch<S> getResult() {
    if (this.union_ == null) { return null; }
    return this.union_.getResult();
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchesTTestUDF.java`
#### Snippet
```java
   */
  public List<Double> evaluate(final BytesWritable serializedSketchA, final BytesWritable serializedSketchB) {
    if (serializedSketchA == null || serializedSketchB == null) { return null; }
    final ArrayOfDoublesSketch sketchA =
        ArrayOfDoublesSketches.wrapSketch(BytesWritableHelper.wrapAsMemory(serializedSketchA));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchesTTestUDF.java`
#### Snippet
```java
    // If the sketches contain fewer than 2 values, the p-value can't be calculated
    if (sketchA.getRetainedEntries() < 2 || sketchB.getRetainedEntries() < 2) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/hll/SketchToEstimateAndErrorBoundsUDF.java`
#### Snippet
```java
   */
  public List<Double> evaluate(final BytesWritable serializedSketch, final int kappa) {
    if (serializedSketch == null) { return null; }
    final HllSketch sketch = HllSketch.wrap(BytesWritableHelper.wrapAsMemory(serializedSketch));
    return Arrays.asList(sketch.getEstimate(), sketch.getLowerBound(kappa), sketch.getUpperBound(kappa));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/hll/SketchEvaluator.java`
#### Snippet
```java
      throws HiveException {
    final State state = (State) buf;
    if (state == null) { return null; }
    final HllSketch result = state.getResult();
    if (result == null) { return null; }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/hll/SketchEvaluator.java`
#### Snippet
```java
    if (state == null) { return null; }
    final HllSketch result = state.getResult();
    if (result == null) { return null; }
    return new BytesWritable(result.toCompactByteArray());
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/hll/SketchEvaluator.java`
#### Snippet
```java
    final State state = (State) buf;
    final HllSketch intermediate = state.getResult();
    if (intermediate == null) { return null; }
    final byte[] bytes = intermediate.toCompactByteArray();
    return Arrays.asList(
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/datasketches/hive/quantiles/GetQuantileFromStringsSketchUDF.java`
#### Snippet
```java
   */
  public String evaluate(final BytesWritable serializedSketch, final double fraction) {
    if (serializedSketch == null) { return null; }
    final ItemsSketch<String> sketch = ItemsSketch.getInstance(
      BytesWritableHelper.wrapAsMemory(serializedSketch),
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ObjectInspectorValidator` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/datasketches/hive/tuple/ObjectInspectorValidator.java`
#### Snippet
```java
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;

class ObjectInspectorValidator {

  static void validateCategoryPrimitive(final ObjectInspector inspector, final int index)
```

### UtilityClassWithoutPrivateConstructor
Class `Util` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/datasketches/hive/kll/Util.java`
#### Snippet
```java
import java.util.List;

final class Util {

  static float[] objectsToPrimitives(final Float[] array) {
```

### UtilityClassWithoutPrivateConstructor
Class `ObjectInspectorValidator` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/datasketches/hive/quantiles/ObjectInspectorValidator.java`
#### Snippet
```java
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;

final class ObjectInspectorValidator {

  static void validateCategoryPrimitive(
```

### UtilityClassWithoutPrivateConstructor
Class `ObjectInspectorValidator` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/datasketches/hive/theta/ObjectInspectorValidator.java`
#### Snippet
```java
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;

class ObjectInspectorValidator {

  static void validateCategoryPrimitive(final ObjectInspector inspector, final int index)
```

### UtilityClassWithoutPrivateConstructor
Class `ArrayOfDoublesSketchStats` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchStats.java`
#### Snippet
```java
import org.apache.datasketches.tuple.arrayofdoubles.ArrayOfDoublesSketchIterator;

class ArrayOfDoublesSketchStats {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `BytesWritableHelper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/datasketches/hive/common/BytesWritableHelper.java`
#### Snippet
```java
 * Provides a helper class to simplify frequent operations on BytesWritable.
 */
public class BytesWritableHelper {
    /**
     * Wraps BytesWritable with a read-only Memory interface, without copying the underlying data.
```

### UtilityClassWithoutPrivateConstructor
Class `ObjectInspectorValidator` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/datasketches/hive/hll/ObjectInspectorValidator.java`
#### Snippet
```java
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;

class ObjectInspectorValidator {

  static void validateCategoryPrimitive(final ObjectInspector inspector, final int index)
```

### UtilityClassWithoutPrivateConstructor
Class `Util` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/datasketches/hive/quantiles/Util.java`
#### Snippet
```java
import java.util.List;

final class Util {

  static double[] objectsToPrimitives(final Double[] array) {
```

### UtilityClassWithoutPrivateConstructor
Class `ObjectInspectorValidator` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/datasketches/hive/cpc/ObjectInspectorValidator.java`
#### Snippet
```java
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;

class ObjectInspectorValidator {

  static void validateCategoryPrimitive(final ObjectInspector inspector, final int index)
```

### UtilityClassWithoutPrivateConstructor
Class `ObjectInspectorValidator` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/datasketches/hive/kll/ObjectInspectorValidator.java`
#### Snippet
```java
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;

final class ObjectInspectorValidator {

  static void validateCategoryPrimitive(
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchState.java`
#### Snippet
```java

  void init(final int nominalNumEntries, final float samplingProbability, final int numValues) {
    super.init(nominalNumEntries, numValues);
    this.sketch_ = new ArrayOfDoublesUpdatableSketchBuilder().setNominalEntries(nominalNumEntries)
        .setSamplingProbability(samplingProbability).setNumberOfValues(numValues).build();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/datasketches/hive/tuple/SketchState.java`
#### Snippet
```java
  void init(final int nominalNumEntries, final float samplingProbability,
      final SummaryFactory<S> summaryFactory) {
    super.init(nominalNumEntries);
    this.sketch_ = new UpdatableSketchBuilder<>(summaryFactory).setNominalEntries(nominalNumEntries)
        .setSamplingProbability(samplingProbability).build();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/datasketches/hive/tuple/UnionState.java`
#### Snippet
```java

  void init(final int nominalNumEntries, final SummarySetOperations<S> summarySetOps) {
    super.init(nominalNumEntries);
    this.union_ = new Union<>(nominalNumEntries, summarySetOps);
  }
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.hive.ql.udf.generic` is unnecessary and can be removed
in `src/main/java/org/apache/datasketches/hive/cpc/DataToSketchUDAF.java`
#### Snippet
```java
   * </ul>
   *
   * @see org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver
   * #getEvaluator(org.apache.hadoop.hive.ql.udf.generic.GenericUDAFParameterInfo)
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.hive.ql.udf.generic` is unnecessary and can be removed
in `src/main/java/org/apache/datasketches/hive/theta/DataToSketchUDAF.java`
#### Snippet
```java
   * </ul>
   *
   * @see org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver
   * #getEvaluator(org.apache.hadoop.hive.ql.udf.generic.GenericUDAFParameterInfo)
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.hive.ql.udf.generic` is unnecessary and can be removed
in `src/main/java/org/apache/datasketches/hive/theta/UnionSketchUDAF.java`
#### Snippet
```java
   * be BINARY sketch). Also check sketch size and seed params if they are passed in.
   *
   * @see org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver
   * #getEvaluator(org.apache.hadoop.hive.ql.udf.generic.GenericUDAFParameterInfo)
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.hive.ql.udf.generic` is unnecessary and can be removed
in `src/main/java/org/apache/datasketches/hive/hll/DataToSketchUDAF.java`
#### Snippet
```java
   * </ul>
   *
   * @see org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver
   * #getEvaluator(org.apache.hadoop.hive.ql.udf.generic.GenericUDAFParameterInfo)
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.hive.ql.udf.generic` is unnecessary and can be removed
in `src/main/java/org/apache/datasketches/hive/theta/UnionEvaluator.java`
#### Snippet
```java
  /**
   *
   * @see org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator#getNewAggregationBuffer()
   */
  @SuppressWarnings("deprecation")
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.hive.ql.udf.generic` is unnecessary and can be removed
in `src/main/java/org/apache/datasketches/hive/cpc/UnionSketchUDAF.java`
#### Snippet
```java
   * be BINARY sketch). Also check lgK and seed parameters if they are passed in.
   *
   * @see org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver
   * #getEvaluator(org.apache.hadoop.hive.ql.udf.generic.GenericUDAFParameterInfo)
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.hive.ql.udf.generic` is unnecessary and can be removed
in `src/main/java/org/apache/datasketches/hive/hll/UnionSketchUDAF.java`
#### Snippet
```java
   * be BINARY sketch). Also check lgK and target HLL type parameters if they are passed in.
   *
   * @see org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver
   * #getEvaluator(org.apache.hadoop.hive.ql.udf.generic.GenericUDAFParameterInfo)
   *
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `DataToItemsSketchEvaluator()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/datasketches/hive/frequencies/DataToItemsSketchUDAF.java`
#### Snippet
```java
    private PrimitiveObjectInspector maxMapSizeObjectInspector;

    public DataToItemsSketchEvaluator(final ArrayOfItemsSerDe<T> serDe) {
      super(serDe);
    }
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final @SuppressWarnings("deprecation")`
in `src/main/java/org/apache/datasketches/hive/tuple/DataToDoubleSummaryWithModeSketchUDAF.java`
#### Snippet
```java
    // need to add summary mode
    @Override
    public Object terminatePartial(final @SuppressWarnings("deprecation") AggregationBuffer buf)
        throws HiveException {
      @SuppressWarnings("unchecked")
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `src/main/java/org/apache/datasketches/hive/quantiles/DataToItemsSketchUDAF.java`
#### Snippet
```java
  public abstract GenericUDAFEvaluator createEvaluator();

  public static abstract class DataToSketchEvaluator<T> extends ItemsEvaluator<T> {

    DataToSketchEvaluator(final Comparator<? super T> comparator, final ArrayOfItemsSerDe<T> serDe) {
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `src/main/java/org/apache/datasketches/hive/tuple/DataToSketchUDAF.java`
#### Snippet
```java
  public abstract GenericUDAFEvaluator createEvaluator();

  public static abstract class DataToSketchEvaluator<U, S extends UpdatableSummary<U>>
      extends SketchEvaluator<S> {

```

### MissortedModifiers
Missorted modifiers `final @SuppressWarnings("deprecation")`
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchEvaluator.java`
#### Snippet
```java

  @Override
  public void merge(final @SuppressWarnings("deprecation") AggregationBuffer buf, final Object data)
      throws HiveException {
    if (data == null) { return; }
```

### MissortedModifiers
Missorted modifiers `final @SuppressWarnings("deprecation")`
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchEvaluator.java`
#### Snippet
```java

  @Override
  public Object terminatePartial(final @SuppressWarnings("deprecation") AggregationBuffer buf)
      throws HiveException {
    final ArrayOfDoublesState state = (ArrayOfDoublesState) buf;
```

### MissortedModifiers
Missorted modifiers `final @SuppressWarnings("deprecation")`
in `src/main/java/org/apache/datasketches/hive/tuple/ArrayOfDoublesSketchEvaluator.java`
#### Snippet
```java

  @Override
  public Object terminate(final @SuppressWarnings("deprecation") AggregationBuffer buf)
      throws HiveException {
    final ArrayOfDoublesState state = (ArrayOfDoublesState) buf;
```

### MissortedModifiers
Missorted modifiers `final @SuppressWarnings("deprecation")`
in `src/main/java/org/apache/datasketches/hive/tuple/SketchEvaluator.java`
#### Snippet
```java

  @Override
  public void merge(final @SuppressWarnings("deprecation") AggregationBuffer buf, final Object data)
      throws HiveException {
    if (data == null) { return; }
```

### MissortedModifiers
Missorted modifiers `final @SuppressWarnings("deprecation")`
in `src/main/java/org/apache/datasketches/hive/tuple/SketchEvaluator.java`
#### Snippet
```java

  @Override
  public Object terminatePartial(final @SuppressWarnings("deprecation") AggregationBuffer buf)
      throws HiveException {
    @SuppressWarnings("unchecked")
```

### MissortedModifiers
Missorted modifiers `final @SuppressWarnings("deprecation")`
in `src/main/java/org/apache/datasketches/hive/tuple/SketchEvaluator.java`
#### Snippet
```java

  @Override
  public Object terminate(final @SuppressWarnings("deprecation") AggregationBuffer buf)
      throws HiveException {
    @SuppressWarnings("unchecked")
```

### MissortedModifiers
Missorted modifiers `final @SuppressWarnings("deprecation")`
in `src/main/java/org/apache/datasketches/hive/cpc/SketchEvaluator.java`
#### Snippet
```java

  @Override
  public Object terminate(final @SuppressWarnings("deprecation") AggregationBuffer buf)
      throws HiveException {
    final State state = (State) buf;
```

### MissortedModifiers
Missorted modifiers `final @SuppressWarnings("deprecation")`
in `src/main/java/org/apache/datasketches/hive/cpc/SketchEvaluator.java`
#### Snippet
```java

  @Override
  public Object terminatePartial(final @SuppressWarnings("deprecation") AggregationBuffer buf)
      throws HiveException {
    final State state = (State) buf;
```

### MissortedModifiers
Missorted modifiers `final @SuppressWarnings("deprecation")`
in `src/main/java/org/apache/datasketches/hive/theta/UnionEvaluator.java`
#### Snippet
```java
   */
  @Override
  public Object terminatePartial(final @SuppressWarnings("deprecation") AggregationBuffer agg)
      throws HiveException {
    final UnionState state = (UnionState) agg;
```

### MissortedModifiers
Missorted modifiers `final @SuppressWarnings("deprecation")`
in `src/main/java/org/apache/datasketches/hive/theta/UnionEvaluator.java`
#### Snippet
```java
   */
  @Override
  public Object terminate(final @SuppressWarnings("deprecation") AggregationBuffer agg)
      throws HiveException {
    final UnionState state = (UnionState) agg;
```

### MissortedModifiers
Missorted modifiers `final @SuppressWarnings("deprecation")`
in `src/main/java/org/apache/datasketches/hive/theta/UnionEvaluator.java`
#### Snippet
```java
   */
  @Override
  public void reset(final @SuppressWarnings("deprecation") AggregationBuffer agg)
      throws HiveException {
    final UnionState state = (UnionState) agg;
```

### MissortedModifiers
Missorted modifiers `final @SuppressWarnings("deprecation")`
in `src/main/java/org/apache/datasketches/hive/theta/UnionEvaluator.java`
#### Snippet
```java
   */
  @Override
  public void merge(final @SuppressWarnings("deprecation") AggregationBuffer agg,
      final Object partial) throws HiveException {
    if (partial == null) { return; }
```

### MissortedModifiers
Missorted modifiers `final @SuppressWarnings("deprecation")`
in `src/main/java/org/apache/datasketches/hive/tuple/UnionDoubleSummaryWithModeSketchUDAF.java`
#### Snippet
```java
    // need to add summary mode
    @Override
    public Object terminatePartial(final @SuppressWarnings("deprecation") AggregationBuffer buf)
        throws HiveException {
      @SuppressWarnings("unchecked")
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `src/main/java/org/apache/datasketches/hive/tuple/UnionSketchUDAF.java`
#### Snippet
```java
  public abstract GenericUDAFEvaluator createEvaluator();

  public static abstract class UnionSketchEvaluator<S extends Summary> extends SketchEvaluator<S> {

    private PrimitiveObjectInspector sketchInspector_;
```

### MissortedModifiers
Missorted modifiers `final @SuppressWarnings("deprecation")`
in `src/main/java/org/apache/datasketches/hive/hll/SketchEvaluator.java`
#### Snippet
```java

  @Override
  public Object terminate(final @SuppressWarnings("deprecation") AggregationBuffer buf)
      throws HiveException {
    final State state = (State) buf;
```

### MissortedModifiers
Missorted modifiers `final @SuppressWarnings("deprecation")`
in `src/main/java/org/apache/datasketches/hive/hll/SketchEvaluator.java`
#### Snippet
```java

  @Override
  public void merge(final @SuppressWarnings("deprecation") AggregationBuffer buf, final Object data)
      throws HiveException {
    if (data == null) { return; }
```

### MissortedModifiers
Missorted modifiers `final @SuppressWarnings("deprecation")`
in `src/main/java/org/apache/datasketches/hive/hll/SketchEvaluator.java`
#### Snippet
```java

  @Override
  public Object terminatePartial(final @SuppressWarnings("deprecation") AggregationBuffer buf)
      throws HiveException {
    final State state = (State) buf;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `src/main/java/org/apache/datasketches/hive/frequencies/DataToItemsSketchUDAF.java`
#### Snippet
```java
  public abstract GenericUDAFEvaluator createEvaluator();

  public static abstract class DataToItemsSketchEvaluator<T> extends ItemsEvaluator<T> {

    private PrimitiveObjectInspector maxMapSizeObjectInspector;
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/datasketches/hive/cpc/DataToSketchUDAF.java`
#### Snippet
```java
  @SuppressWarnings("javadoc")
  @Override
  public GenericUDAFEvaluator getEvaluator(final GenericUDAFParameterInfo info) throws SemanticException {
    final ObjectInspector[] inspectors = info.getParameterObjectInspectors();

```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/datasketches/hive/cpc/UnionSketchUDAF.java`
#### Snippet
```java
  @SuppressWarnings("javadoc")
  @Override
  public GenericUDAFEvaluator getEvaluator(final GenericUDAFParameterInfo info) throws SemanticException {
    final ObjectInspector[] inspectors = info.getParameterObjectInspectors();

```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/datasketches/hive/hll/DataToSketchUDAF.java`
#### Snippet
```java
    + " The default is 'HLL_4'")
@SuppressWarnings({"javadoc","deprecation"})
public class DataToSketchUDAF extends AbstractGenericUDAFResolver {

  /**
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/datasketches/hive/hll/UnionSketchUDAF.java`
#### Snippet
```java
  @SuppressWarnings("javadoc")
  @Override
  public GenericUDAFEvaluator getEvaluator(final GenericUDAFParameterInfo info) throws SemanticException {
    final ObjectInspector[] inspectors = info.getParameterObjectInspectors();

```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/datasketches/hive/theta/DataToSketchUDAF.java`
#### Snippet
```java
    + " The seed is optional, and using it is not recommended unless you really know why you need it")
@SuppressWarnings({"javadoc","deprecation"})
public class DataToSketchUDAF extends AbstractGenericUDAFResolver {

  /**
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/datasketches/hive/theta/UnionSketchUDAF.java`
#### Snippet
```java
  @SuppressWarnings("javadoc")
  @Override
  public GenericUDAFEvaluator getEvaluator(final GenericUDAFParameterInfo info) throws SemanticException {
    final ObjectInspector[] parameters = info.getParameterObjectInspectors();

```

