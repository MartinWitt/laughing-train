# java-monitoring-client-library 
 
# Bad smells
I found 71 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 46 | false |
| FinalMethodInFinalClass | 11 | false |
| Deprecation | 7 | false |
| DataFlowIssue | 3 | false |
| NullableProblems | 2 | false |
| UNUSED_IMPORT | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java

  @Override
  public final void set(Long value, String... labelValues) {
    MetricsUtils.checkLabelValuesLength(this, labelValues);

```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java

  @Override
  public final void reset(String... labelValues) {
    MetricsUtils.checkLabelValuesLength(this, labelValues);

```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java
   */
  @Override
  public final ImmutableList<MetricPoint<Long>> getTimestampedValues() {
    return getTimestampedValues(Instant.now());
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java

  @VisibleForTesting
  final void reset(Instant startTimestamp) {
    // Lock the entire set of values so that all existing values will have a consistent timestamp
    // after this call, without the possibility of interleaving with another reset() call.
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java

  @VisibleForTesting
  final void set(Long value, Instant startTimestamp, ImmutableList<String> labelValues) {
    Lock lock = valueLocks.get(labelValues);
    lock.lock();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java

  @VisibleForTesting
  final void reset(Instant startTimestamp, ImmutableList<String> labelValues) {
    Lock lock = valueLocks.get(labelValues);
    lock.lock();
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java

  @Override
  public final void incrementBy(long offset, String... labelValues) {
    MetricsUtils.checkLabelValuesLength(this, labelValues);
    checkArgument(offset >= 0, "The offset provided must be non-negative");
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java

  @Override
  public final int getCardinality() {
    return values.size();
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java

  @Override
  public final void reset() {
    reset(Instant.now());
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java

  @Override
  public final void increment(String... labelValues) {
    MetricsUtils.checkLabelValuesLength(this, labelValues);

```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java

  @VisibleForTesting
  final ImmutableList<MetricPoint<Long>> getTimestampedValues(Instant endTimestamp) {
    ImmutableList.Builder<MetricPoint<Long>> timestampedValues = new ImmutableList.Builder<>();
    for (Entry<ImmutableList<String>, Long> entry : values.asMap().entrySet()) {
```

## RuleId[id=Deprecation]
### Deprecation
'failWithBadResults(java.lang.String, java.lang.Object, java.lang.String, java.lang.Object)' is deprecated
in `contrib/src/main/java/com/google/monitoring/metrics/contrib/DistributionMetricSubject.java`
#### Snippet
```java
    ImmutableList<MetricPoint<Distribution>> metricPoints = actual.getTimestampedValues();
    if (metricPoints.isEmpty()) {
      failWithBadResults(
          "has a distribution for labels", Joiner.on(':').join(labels), "has", "no values");
    }
```

### Deprecation
'failWithBadResults(java.lang.String, java.lang.Object, java.lang.String, java.lang.Object)' is deprecated
in `contrib/src/main/java/com/google/monitoring/metrics/contrib/AbstractMetricSubject.java`
#### Snippet
```java
      if (!expectedNondefaultLabelTuples.contains(metricPoint.labelValues())) {
        if (!hasDefaultValue(metricPoint)) {
          failWithBadResults(
              "has",
              "no other nondefault values",
```

### Deprecation
'failWithBadResults(java.lang.String, java.lang.Object, java.lang.String, java.lang.Object)' is deprecated
in `contrib/src/main/java/com/google/monitoring/metrics/contrib/AbstractMetricSubject.java`
#### Snippet
```java
    MetricPoint<T> metricPoint = findMetricPointForLabels(ImmutableList.copyOf(labels));
    if (metricPoint == null) {
      failWithBadResults(
          "has a value for labels",
          Joiner.on(':').join(labels),
```

### Deprecation
'failWithBadResults(java.lang.String, java.lang.Object, java.lang.String, java.lang.Object)' is deprecated
in `contrib/src/main/java/com/google/monitoring/metrics/contrib/AbstractMetricSubject.java`
#### Snippet
```java
    }
    if (hasDefaultValue(metricPoint)) {
      failWithBadResults(
          "has a non-default value for labels",
          Joiner.on(':').join(labels),
```

### Deprecation
'failWithBadResults(java.lang.String, java.lang.Object, java.lang.String, java.lang.Object)' is deprecated
in `contrib/src/main/java/com/google/monitoring/metrics/contrib/AbstractMetricSubject.java`
#### Snippet
```java
    MetricPoint<T> metricPoint = findMetricPointForLabels(ImmutableList.copyOf(labels));
    if (metricPoint != null) {
      failWithBadResults(
          "has no value for labels",
          Joiner.on(':').join(labels),
```

### Deprecation
'failWithBadResults(java.lang.String, java.lang.Object, java.lang.String, java.lang.Object)' is deprecated
in `contrib/src/main/java/com/google/monitoring/metrics/contrib/AbstractMetricSubject.java`
#### Snippet
```java
    MetricPoint<T> metricPoint = findMetricPointForLabels(ImmutableList.copyOf(labels));
    if (metricPoint == null) {
      failWithBadResults(
          "has a value for labels",
          Joiner.on(':').join(labels),
```

### Deprecation
'failWithBadResults(java.lang.String, java.lang.Object, java.lang.String, java.lang.Object)' is deprecated
in `contrib/src/main/java/com/google/monitoring/metrics/contrib/AbstractMetricSubject.java`
#### Snippet
```java
    }
    if (!metricPoint.value().equals(value)) {
      failWithBadResults(
          String.format("has a value of %s for labels", getMessageRepresentation(value)),
          Joiner.on(':').join(labels),
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getKey` may produce `NullPointerException`
in `metrics/src/main/java/com/google/monitoring/metrics/MutableDistribution.java`
#### Snippet
```java

    Map.Entry<Range<Double>, Long> entry = intervalCounts.getEntry(value);
    intervalCounts.put(entry.getKey(), entry.getValue() + numSamples);
    this.count += numSamples;

```

### DataFlowIssue
Method invocation `value` may produce `NullPointerException`
in `contrib/src/main/java/com/google/monitoring/metrics/contrib/AbstractMetricSubject.java`
#### Snippet
```java
          Joiner.on(':').join(labels),
          "has a value of",
          getMessageRepresentation(metricPoint.value()));
    }
    expectedNondefaultLabelTuples.add(ImmutableList.copyOf(labels));
```

### DataFlowIssue
Method invocation `value` may produce `NullPointerException`
in `contrib/src/main/java/com/google/monitoring/metrics/contrib/AbstractMetricSubject.java`
#### Snippet
```java
              metricPointConverter));
    }
    if (!metricPoint.value().equals(value)) {
      failWithBadResults(
          String.format("has a value of %s for labels", getMessageRepresentation(value)),
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.google.common.truth.Subject;`
in `contrib/src/main/java/com/google/monitoring/metrics/contrib/LongMetricSubject.java`
#### Snippet
```java

import com.google.common.truth.FailureMetadata;
import com.google.common.truth.Subject;
import com.google.monitoring.metrics.Metric;
import com.google.monitoring.metrics.MetricPoint;
```

## RuleId[id=NullableProblems]
### NullableProblems
Overridden method parameters are not annotated
in `metrics/src/main/java/com/google/monitoring/metrics/MetricWriter.java`
#### Snippet
```java
   *     cannot be flushed.
   */
  <V> void write(MetricPoint<V> metricPoint) throws IOException;

  /** Forces the writer to synchronously write all buffered metric values. */
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `stackdriver/src/main/java/com/google/monitoring/metrics/stackdriver/StackdriverWriter.java`
#### Snippet
```java
  /** Encodes and writes a metric point to Stackdriver. The point may be buffered. */
  @Override
  public <V> void write(com.google.monitoring.metrics.MetricPoint<V> point) throws IOException {
    checkNotNull(point);

```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/Distribution.java`
#### Snippet
```java

  /** Returns a histogram of the distribution's values. */
  ImmutableRangeMap<Double, Long> intervalCounts();

  /** Returns the {@link DistributionFitter} of this distribution. */
```

### UnstableApiUsage
'com.google.common.util.concurrent.Striped' is marked unstable with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/MetricsUtils.java`
#### Snippet
```java
   * The below constants replicate the default initial capacity, load factor, and concurrency level
   * for {@link ConcurrentHashMap} as of Java SE 7. They are recorded here so that a {@link
   * com.google.common.util.concurrent.Striped} object can be constructed with a concurrency level
   * matching the default concurrency level of a {@link ConcurrentHashMap}.
   */
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/ImmutableDistribution.java`
#### Snippet
```java

  @Override
  public abstract ImmutableRangeMap<Double, Long> intervalCounts();

  @Override
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/ImmutableDistribution.java`
#### Snippet
```java
      double sumOfSquaredDeviation,
      long count,
      ImmutableRangeMap<Double, Long> intervalCounts,
      DistributionFitter distributionFitter) {
    checkDouble(mean);
```

### UnstableApiUsage
'get(java.lang.Object)' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java
  @VisibleForTesting
  void incrementBy(long offset, Instant startTimestamp, ImmutableList<String> labelValues) {
    Lock lock = valueLocks.get(labelValues);
    lock.lock();

```

### UnstableApiUsage
'size()' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java
    // Lock the entire set of values so that all existing values will have a consistent timestamp
    // after this call, without the possibility of interleaving with another reset() call.
    for (int i = 0; i < valueLocks.size(); i++) {
      valueLocks.getAt(i).lock();
    }
```

### UnstableApiUsage
'getAt(int)' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java
    // after this call, without the possibility of interleaving with another reset() call.
    for (int i = 0; i < valueLocks.size(); i++) {
      valueLocks.getAt(i).lock();
    }

```

### UnstableApiUsage
'size()' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java
      }
    } finally {
      for (int i = 0; i < valueLocks.size(); i++) {
        valueLocks.getAt(i).unlock();
      }
```

### UnstableApiUsage
'getAt(int)' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java
    } finally {
      for (int i = 0; i < valueLocks.size(); i++) {
        valueLocks.getAt(i).unlock();
      }
    }
```

### UnstableApiUsage
'get(java.lang.Object)' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java
  @VisibleForTesting
  final void set(Long value, Instant startTimestamp, ImmutableList<String> labelValues) {
    Lock lock = valueLocks.get(labelValues);
    lock.lock();

```

### UnstableApiUsage
'get(java.lang.Object)' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java
  @VisibleForTesting
  final void reset(Instant startTimestamp, ImmutableList<String> labelValues) {
    Lock lock = valueLocks.get(labelValues);
    lock.lock();

```

### UnstableApiUsage
'get(java.lang.Object)' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java
    for (Entry<ImmutableList<String>, Long> entry : values.asMap().entrySet()) {
      ImmutableList<String> labelValues = entry.getKey();
      valueLocks.get(labelValues).lock();

      Instant startTimestamp;
```

### UnstableApiUsage
'get(java.lang.Object)' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java
        startTimestamp = valueStartTimestamps.get(labelValues);
      } finally {
        valueLocks.get(labelValues).unlock();
      }

```

### UnstableApiUsage
'com.google.common.util.concurrent.Striped' is marked unstable with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java
   * match the default concurrency level of {@link ConcurrentHashMap}.
   *
   * @see Striped
   */
  private final Striped<Lock> valueLocks = Striped.lock(DEFAULT_CONCURRENCY_LEVEL);
```

### UnstableApiUsage
'com.google.common.util.concurrent.Striped' is marked unstable with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java
   * @see Striped
   */
  private final Striped<Lock> valueLocks = Striped.lock(DEFAULT_CONCURRENCY_LEVEL);

  /**
```

### UnstableApiUsage
'com.google.common.util.concurrent.Striped' is marked unstable with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java
   * @see Striped
   */
  private final Striped<Lock> valueLocks = Striped.lock(DEFAULT_CONCURRENCY_LEVEL);

  /**
```

### UnstableApiUsage
'lock(int)' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/Counter.java`
#### Snippet
```java
   * @see Striped
   */
  private final Striped<Lock> valueLocks = Striped.lock(DEFAULT_CONCURRENCY_LEVEL);

  /**
```

### UnstableApiUsage
'get(java.lang.Object)' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/EventMetric.java`
#### Snippet
```java
  void recordMultiple(
      double sample, int count, Instant startTimestamp, ImmutableList<String> labelValues) {
    Lock lock = valueLocks.get(labelValues);
    lock.lock();

```

### UnstableApiUsage
'get(java.lang.Object)' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/EventMetric.java`
#### Snippet
```java
    for (Entry<ImmutableList<String>, MutableDistribution> entry : values.entrySet()) {
      ImmutableList<String> labelValues = entry.getKey();
      Lock lock = valueLocks.get(labelValues);
      lock.lock();

```

### UnstableApiUsage
'com.google.common.util.concurrent.Striped' is marked unstable with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/EventMetric.java`
#### Snippet
```java
   * match the default concurrency level of {@link ConcurrentHashMap}.
   *
   * @see Striped
   */
  private final Striped<Lock> valueLocks = Striped.lock(DEFAULT_CONCURRENCY_LEVEL);
```

### UnstableApiUsage
'com.google.common.util.concurrent.Striped' is marked unstable with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/EventMetric.java`
#### Snippet
```java
   * @see Striped
   */
  private final Striped<Lock> valueLocks = Striped.lock(DEFAULT_CONCURRENCY_LEVEL);

  EventMetric(
```

### UnstableApiUsage
'com.google.common.util.concurrent.Striped' is marked unstable with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/EventMetric.java`
#### Snippet
```java
   * @see Striped
   */
  private final Striped<Lock> valueLocks = Striped.lock(DEFAULT_CONCURRENCY_LEVEL);

  EventMetric(
```

### UnstableApiUsage
'lock(int)' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/EventMetric.java`
#### Snippet
```java
   * @see Striped
   */
  private final Striped<Lock> valueLocks = Striped.lock(DEFAULT_CONCURRENCY_LEVEL);

  EventMetric(
```

### UnstableApiUsage
'size()' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/EventMetric.java`
#### Snippet
```java
    // Lock the entire set of values so that all existing values will have a consistent timestamp
    // after this call, without the possibility of interleaving with another reset() call.
    for (int i = 0; i < valueLocks.size(); i++) {
      valueLocks.getAt(i).lock();
    }
```

### UnstableApiUsage
'getAt(int)' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/EventMetric.java`
#### Snippet
```java
    // after this call, without the possibility of interleaving with another reset() call.
    for (int i = 0; i < valueLocks.size(); i++) {
      valueLocks.getAt(i).lock();
    }

```

### UnstableApiUsage
'size()' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/EventMetric.java`
#### Snippet
```java
      }
    } finally {
      for (int i = 0; i < valueLocks.size(); i++) {
        valueLocks.getAt(i).unlock();
      }
```

### UnstableApiUsage
'getAt(int)' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/EventMetric.java`
#### Snippet
```java
    } finally {
      for (int i = 0; i < valueLocks.size(); i++) {
        valueLocks.getAt(i).unlock();
      }
    }
```

### UnstableApiUsage
'get(java.lang.Object)' is declared in unstable class 'com.google.common.util.concurrent.Striped' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/EventMetric.java`
#### Snippet
```java
  @VisibleForTesting
  final void reset(Instant startTimestamp, ImmutableList<String> labelValues) {
    Lock lock = valueLocks.get(labelValues);
    lock.lock();

```

### UnstableApiUsage
'asMapOfRanges()' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `contrib/src/main/java/com/google/monitoring/metrics/contrib/DistributionMetricSubject.java`
#### Snippet
```java
    boolean first = true;
    for (Map.Entry<Range<Double>, Long> entry :
        distribution.intervalCounts().asMapOfRanges().entrySet()) {
      if (entry.getValue() != 0L) {
        if (first) {
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeMap' is marked unstable with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/MutableDistribution.java`
#### Snippet
```java
public final class MutableDistribution implements Distribution {

  private final TreeRangeMap<Double, Long> intervalCounts;
  private final DistributionFitter distributionFitter;
  private double sumOfSquaredDeviation = 0.0;
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeMap' is marked unstable with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/MutableDistribution.java`
#### Snippet
```java
    checkArgument(Ordering.natural().isOrdered(boundaries));

    this.intervalCounts = TreeRangeMap.create();

    double[] boundariesArray = Doubles.toArray(distributionFitter.boundaries());
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/MutableDistribution.java`
#### Snippet
```java
    checkArgument(Ordering.natural().isOrdered(boundaries));

    this.intervalCounts = TreeRangeMap.create();

    double[] boundariesArray = Doubles.toArray(distributionFitter.boundaries());
```

### UnstableApiUsage
'put(com.google.common.collect.Range, V)' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/MutableDistribution.java`
#### Snippet
```java

    // Add underflow and overflow intervals
    this.intervalCounts.put(Range.lessThan(boundariesArray[0]), 0L);
    this.intervalCounts.put(Range.atLeast(boundariesArray[boundariesArray.length - 1]), 0L);

```

### UnstableApiUsage
'put(com.google.common.collect.Range, V)' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/MutableDistribution.java`
#### Snippet
```java
    // Add underflow and overflow intervals
    this.intervalCounts.put(Range.lessThan(boundariesArray[0]), 0L);
    this.intervalCounts.put(Range.atLeast(boundariesArray[boundariesArray.length - 1]), 0L);

    // Add finite intervals
```

### UnstableApiUsage
'put(com.google.common.collect.Range, V)' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/MutableDistribution.java`
#### Snippet
```java
    // Add finite intervals
    for (int i = 1; i < boundariesArray.length; i++) {
      this.intervalCounts.put(Range.closedOpen(boundariesArray[i - 1], boundariesArray[i]), 0L);
    }
  }
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/MutableDistribution.java`
#### Snippet
```java

  @Override
  public ImmutableRangeMap<Double, Long> intervalCounts() {
    return ImmutableRangeMap.copyOf(intervalCounts);
  }
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/MutableDistribution.java`
#### Snippet
```java
  @Override
  public ImmutableRangeMap<Double, Long> intervalCounts() {
    return ImmutableRangeMap.copyOf(intervalCounts);
  }

```

### UnstableApiUsage
'copyOf(com.google.common.collect.RangeMap)' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/MutableDistribution.java`
#### Snippet
```java
  @Override
  public ImmutableRangeMap<Double, Long> intervalCounts() {
    return ImmutableRangeMap.copyOf(intervalCounts);
  }

```

### UnstableApiUsage
'getEntry(K)' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/MutableDistribution.java`
#### Snippet
```java
    }

    Map.Entry<Range<Double>, Long> entry = intervalCounts.getEntry(value);
    intervalCounts.put(entry.getKey(), entry.getValue() + numSamples);
    this.count += numSamples;
```

### UnstableApiUsage
'put(com.google.common.collect.Range, V)' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `metrics/src/main/java/com/google/monitoring/metrics/MutableDistribution.java`
#### Snippet
```java

    Map.Entry<Range<Double>, Long> entry = intervalCounts.getEntry(value);
    intervalCounts.put(entry.getKey(), entry.getValue() + numSamples);
    this.count += numSamples;

```

### UnstableApiUsage
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `stackdriver/src/main/java/com/google/monitoring/metrics/stackdriver/StackdriverWriter.java`
#### Snippet
```java
    MetricDescriptor descriptor = encodeMetricDescriptor(metric);

    rateLimiter.acquire();
    // We try to create a descriptor, but it may have been created already, so we re-fetch it on
    // failure
```

### UnstableApiUsage
'acquire()' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `stackdriver/src/main/java/com/google/monitoring/metrics/stackdriver/StackdriverWriter.java`
#### Snippet
```java
    CreateTimeSeriesRequest request = new CreateTimeSeriesRequest().setTimeSeries(timeSeriesList);

    rateLimiter.acquire();
    monitoringClient.projects().timeSeries().create(projectResource, request).execute();

```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `stackdriver/src/main/java/com/google/monitoring/metrics/stackdriver/StackdriverWriter.java`
#### Snippet
```java
    this.maxPointsPerRequest = maxPointsPerRequest;
    this.timeSeriesBuffer = new ArrayDeque<>(maxPointsPerRequest);
    this.rateLimiter = RateLimiter.create(maxQps);
  }

```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `stackdriver/src/main/java/com/google/monitoring/metrics/stackdriver/StackdriverWriter.java`
#### Snippet
```java
    this.maxPointsPerRequest = maxPointsPerRequest;
    this.timeSeriesBuffer = new ArrayDeque<>(maxPointsPerRequest);
    this.rateLimiter = RateLimiter.create(maxQps);
  }

```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `stackdriver/src/main/java/com/google/monitoring/metrics/stackdriver/StackdriverWriter.java`
#### Snippet
```java
  private final Monitoring monitoringClient;
  private final int maxPointsPerRequest;
  private final RateLimiter rateLimiter;

  /**
```

### UnstableApiUsage
'asMapOfRanges()' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `stackdriver/src/main/java/com/google/monitoring/metrics/stackdriver/StackdriverWriter.java`
#### Snippet
```java
  private static List<Long> encodeDistributionPoints(
      com.google.monitoring.metrics.Distribution distribution) {
    return distribution.intervalCounts().asMapOfRanges().values().asList();
  }

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `BlockingQueue.offer()` is ignored
in `metrics/src/main/java/com/google/monitoring/metrics/MetricReporter.java`
#### Snippet
```java

    // Offer a poision pill to inform the exporter to stop.
    writeQueue.offer(Optional.empty());
    try {
      metricExporter.awaitTerminated(10, TimeUnit.SECONDS);
```

