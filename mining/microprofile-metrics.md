# microprofile-metrics 
 
# Bad smells
I found 310 bad smells with 15 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| Deprecation | 176 | false |
| CdiInjectionPointsInspection | 46 | false |
| DuplicatedCode | 12 | false |
| JUnitMalformedDeclaration | 11 | false |
| UnnecessaryModifier | 9 | true |
| IgnoreResultOfCall | 9 | false |
| RegExpRedundantEscape | 8 | false |
| SimplifiableAssertion | 8 | false |
| DeprecatedIsStillUsed | 5 | false |
| UnnecessaryLocalVariable | 3 | true |
| UnnecessaryToStringCall | 3 | true |
| DanglingJavadoc | 3 | false |
| NullArgumentToVariableArgMethod | 3 | false |
| AutoCloseableResource | 2 | false |
| JavadocReference | 2 | false |
| FieldMayBeFinal | 2 | false |
| DefaultAnnotationParam | 1 | false |
| UNCHECKED_WARNING | 1 | false |
| RedundantCast | 1 | false |
| CommentedOutCode | 1 | false |
| CatchMayIgnoreException | 1 | false |
| NewClassNamingConvention | 1 | false |
| ConstantValue | 1 | false |
| FieldCanBeLocal | 1 | false |
## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimerFieldBean.java`
#### Snippet
```java

    @Inject
    @Metric(absolute = false)
    private Timer timerWithExplicitNonAbsoluteName;

```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     * String constant to represent the scope value used for the application scope
     */
    public static final String APPLICATION_SCOPE = "application";

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     * String constant to represent the scope value used for the application scope
     */
    public static final String APPLICATION_SCOPE = "application";

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     * String constant to represent the scope value used for the application scope
     */
    public static final String APPLICATION_SCOPE = "application";

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     * String constant to represent the scope value used for the vendor scope
     */
    public static final String VENDOR_SCOPE = "vendor";

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     * String constant to represent the scope value used for the vendor scope
     */
    public static final String VENDOR_SCOPE = "vendor";

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     * String constant to represent the scope value used for the vendor scope
     */
    public static final String VENDOR_SCOPE = "vendor";

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     * String constant to represent the scope value used for the base scope
     */
    public static final String BASE_SCOPE = "base";

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     * String constant to represent the scope value used for the base scope
     */
    public static final String BASE_SCOPE = "base";

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     * String constant to represent the scope value used for the base scope
     */
    public static final String BASE_SCOPE = "base";

    /**
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Context' used without 'try'-with-resources statement
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimerTest.java`
#### Snippet
```java

        double beforeStartTime = System.nanoTime();
        Context context = timer.time();
        double afterStartTime = System.nanoTime();
        Thread.sleep(1000);
```

### AutoCloseableResource
'Context' used without 'try'-with-resources statement
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MetricAppBean.java`
#### Snippet
```java
        Timer timer = metrics.timer("metricTest.test1.timer");

        Timer.Context context = timer.time();
        try {
            Thread.sleep((long) (Math.random() * 1000));
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/LambdaMatcher.java`
#### Snippet
```java
    @Override
    public boolean matches(Object argument) {
        return matcher.apply((T) argument);
    }

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `RegistryScope`
in `api/src/main/java/org/eclipse/microprofile/metrics/annotation/package-info.java`
#### Snippet
```java
 * <p>
 *
 * <b> This is DEPRECATED. Please use {@link RegistryScope} instead. </b>
 *
 * The {@link org.eclipse.microprofile.metrics.annotation.RegistryType RegistryType} is used to identify which
```

### JavadocReference
Cannot resolve symbol `percentileValue()`
in `api/src/main/java/org/eclipse/microprofile/metrics/Snapshot.java`
#### Snippet
```java
     * Represents a percentile and its value at the moment it was sampled from the Snapshot.
     *
     * See {@link #percentileValue()}
     */
    public static class PercentileValue {
```

## RuleId[id=JUnitMalformedDeclaration]
### JUnitMalformedDeclaration
Method `extendedTimedMethodNotCalledYet` annotated with '@Test' should not declare parameter 'registry'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteTimedBeanTest.java`
#### Snippet
```java
    @Test
    @InSequence(2)
    public void extendedTimedMethodNotCalledYet(MetricRegistry registry) {
        Timer timer = registry.getTimer(extendedTimedMID);
        assertThat("Timer is not registered correctly on the methods on the abstract class", timer, notNullValue());
```

### JUnitMalformedDeclaration
Method `callTimedMethodOnce` annotated with '@Test' should not declare parameter 'registry'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteTimedBeanTest.java`
#### Snippet
```java
    @Test
    @InSequence(3)
    public void callTimedMethodOnce(MetricRegistry registry) {
        Timer timer = registry.getTimer(timerMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());
```

### JUnitMalformedDeclaration
Method `callExtendedTimedMethodOnce` annotated with '@Test' should not declare parameter 'registry'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteTimedBeanTest.java`
#### Snippet
```java
    @Test
    @InSequence(4)
    public void callExtendedTimedMethodOnce(MetricRegistry registry) {
        Timer timer = registry.getTimer(extendedTimedMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());
```

### JUnitMalformedDeclaration
Method `timedMethodNotCalledYet` annotated with '@Test' should not declare parameter 'registry'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteTimedBeanTest.java`
#### Snippet
```java
    @Test
    @InSequence(1)
    public void timedMethodNotCalledYet(MetricRegistry registry) {
        Timer timer = registry.getTimer(timerMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());
```

### JUnitMalformedDeclaration
Method `callGaugeAfterSetterCall` annotated with '@Test' should not declare parameter 'gauge'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/GaugeInjectionBeanTest.java`
#### Snippet
```java
    @Test
    @InSequence(2)
    public void callGaugeAfterSetterCall(
            @Metric(absolute = true, name = "org.eclipse.microprofile.metrics.tck.cdi.GaugeInjectionBean.gaugeInjection") Gauge<Long> gauge) {
        // Call the setter method and assert the gauge is up-to-date
```

### JUnitMalformedDeclaration
Method `extendedTimedMethodNotCalledYet` annotated with '@Test' should not declare parameter 'registry'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteExtendedTimedBeanTest.java`
#### Snippet
```java
    @Test
    @InSequence(2)
    public void extendedTimedMethodNotCalledYet(MetricRegistry registry) {
        Timer timer = registry.getTimer(extendedTimedMID);
        assertThat("Timer is not registered correctly on the methods on the abstract class", timer, notNullValue());
```

### JUnitMalformedDeclaration
Method `callTimedMethodOnce` annotated with '@Test' should not declare parameter 'registry'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteExtendedTimedBeanTest.java`
#### Snippet
```java
    @Test
    @InSequence(3)
    public void callTimedMethodOnce(MetricRegistry registry) {
        Timer timer = registry.getTimer(timedMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());
```

### JUnitMalformedDeclaration
Method `callExtendedTimedMethodOnce` annotated with '@Test' should not declare parameter 'registry'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteExtendedTimedBeanTest.java`
#### Snippet
```java
    @Test
    @InSequence(4)
    public void callExtendedTimedMethodOnce(MetricRegistry registry) {
        Timer timer = registry.getTimer(extendedTimedMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());
```

### JUnitMalformedDeclaration
Method `timedMethodNotCalledYet` annotated with '@Test' should not declare parameter 'registry'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteExtendedTimedBeanTest.java`
#### Snippet
```java
    @Test
    @InSequence(1)
    public void timedMethodNotCalledYet(MetricRegistry registry) {
        Timer timer = registry.getTimer(timedMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());
```

### JUnitMalformedDeclaration
Method `countedTagMethodNotCalledYet` annotated with '@Test' should not declare parameters 'instanceOne', 'instanceTwo' and 'instanceTwo'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodTagBeanTest.java`
#### Snippet
```java
    @Test
    @InSequence(2)
    public void countedTagMethodNotCalledYet(
            @Metric(name = "countedMethod", absolute = true, tags = {"number=one"}) Counter instanceOne,
            @Metric(name = "countedMethod", absolute = true, tags = {"number=two"}) Counter instanceTwo) {
```

### JUnitMalformedDeclaration
Method `metricInjectionIntoTest` annotated with '@Test' should not declare parameter 'instance'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java
    @Test
    @InSequence(2)
    public void metricInjectionIntoTest(@Metric(name = "countedMethod", absolute = true) Counter instance) {
        Counter counter = registry.getCounter(counterMetricID);
        assertThat("Counter is not registered correctly", counter, notNullValue());
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `atomicInteger` to `AtomicInteger` is redundant
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/GaugeTest.java`
#### Snippet
```java
        metrics.gauge("tck.gaugetest.toDoubleFunctionGaugeManual", value,
                (atomicInteger) -> {
                    AtomicInteger myAtomicInteger = (AtomicInteger) atomicInteger;
                    return myAtomicInteger.getAndIncrement();
                }, null);
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `metric` may be 'final'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricFilterTest.java`
#### Snippet
```java
    }

    private Metric metric = new Metric() {
    };

```

### FieldMayBeFinal
Field `tags` may be 'final'
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java
        private boolean multi;
        private boolean optional;
        private Map<String, String> tags = new TreeMap<>();

        public MiniMeta() {
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'RegistryType' is still used
in `api/src/main/java/org/eclipse/microprofile/metrics/annotation/RegistryType.java`
#### Snippet
```java
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
public @interface RegistryType {
    /**
     * The scope of the MetricRegistry.
```

### DeprecatedIsStillUsed
Deprecated member 'VENDOR' is still used
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
         */
        @Deprecated
        VENDOR("vendor");

        private final String name;
```

### DeprecatedIsStillUsed
Deprecated member 'BASE' is still used
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
         */
        @Deprecated
        BASE("base"),

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'APPLICATION' is still used
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
         */
        @Deprecated
        APPLICATION("application"),

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'Type' is still used
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     */
    @Deprecated
    enum Type {
        /**
         * The Application (default) scoped MetricRegistry. Any metric registered/accessed via CDI will use this
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (6 lines)
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/MultipleMetricsConstructorBeanTest.java`
#### Snippet
```java
    private Instance<MultipleMetricsConstructorBean> instance;

    // @Test
    // @InSequence(1)
    // public void metricsConstructorNotCalledYet() {
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/ReusedMetricsTest.java`
#### Snippet
```java
     */
    private static String filterOutAppLabelPromMetrics(String responseBody) {
        return responseBody.replaceAll(OPENMETRICS_APP_LABEL_REGEX, "").replaceAll("\\{,", "{").replaceAll(",\\}",
                "}");
    }
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MpMetricTest.java`
#### Snippet
```java
     */
    private static String filterOutAppLabelPromMetrics(String responseBody) {
        return responseBody.replaceAll(PROM_APP_LABEL_REGEX, "").replaceAll("\\{,", "{").replaceAll(",\\}", "}");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java
            // explicitly check for the metric line wth value (i.e. the use of `{`)
            if (line.contains("gc_total{")) {
                final Pattern gcTotalPattern = Pattern.compile("(gc_total\\{.*?\\}) (\\d+\\.\\d+)");
                assertThat("Line format should be gc_total\\{.*?\\} \\d+\\.\\d+",
                        gcTotalPattern.matcher(line).matches());
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java

                final String metricID = gcTotalPattern.matcher(line).replaceAll("$1");
                final String tags = metricID.replaceAll("^gc_total\\{", "").replaceAll("\\}$", "");

                for (String expectedTag : expectedTags) {
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java
            // explicitly check for the metric line wth value (i.e. the use of `{`)
            if (line.contains("gc_time_seconds_total{")) {
                final Pattern gcTimeTotalPattern = Pattern.compile("(gc_time_seconds_total\\{.*?\\}) (\\d+\\.\\d+)");
                assertThat("Line format should be gc_time_seconds_total\\{.*?\\} \\d+\\.\\d+",
                        gcTimeTotalPattern.matcher(line).matches());
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java

                final String metricID = gcTimeTotalPattern.matcher(line).replaceAll("$1");
                final String tags = metricID.replaceAll("^gc_time_seconds_total\\{", "").replaceAll("\\}$", "");

                for (String expectedTag : expectedTags) {
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java
     */
    private static String filterOutAppLabelPromMetrics(String responseBody) {
        return responseBody.replaceAll(PROM_APP_LABEL_REGEX, "").replaceAll("\\{,", "{").replaceAll(",\\}", "}");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MpMetricOptionalTest.java`
#### Snippet
```java

    private static String filterOutAppLabelOpenMetrics(String responseBody) {
        return responseBody.replaceAll(PROM_APP_LABEL_REGEX, "").replaceAll("\\{,", "{").replaceAll(",\\}", "}");
    }

```

## RuleId[id=SimplifiableAssertion]
### SimplifiableAssertion
`assertTrue()` can be simplified to 'assertEquals()'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramTest.java`
#### Snippet
```java
        PercentileValue[] percentileValuesHistInt = histogramInt.getSnapshot().percentileValues();
        // Check that there are 6 percentiles - [0.75,0.95,0.98,0.99,0.999]
        Assert.assertTrue(percentileValuesHistInt.length == 6);

        int countDown = 6;
```

### SimplifiableAssertion
`assertTrue()` can be simplified to 'assertEquals()'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramTest.java`
#### Snippet
```java
            }
        }
        Assert.assertTrue(countDown == 0);

        PercentileValue[] percentileValuesHisLong = histogramLong.getSnapshot().percentileValues();
```

### SimplifiableAssertion
`assertTrue()` can be simplified to 'assertEquals()'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramTest.java`
#### Snippet
```java
        PercentileValue[] percentileValuesHisLong = histogramLong.getSnapshot().percentileValues();
        // Check that there are 6 percentiles - [0.5,0.75,0.95,0.98,0.99,0.999]
        Assert.assertTrue(percentileValuesHisLong.length == 6);

        countDown = 6;
```

### SimplifiableAssertion
`assertTrue()` can be simplified to 'assertEquals()'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramTest.java`
#### Snippet
```java
            }
        }
        Assert.assertTrue(countDown == 0);
    }

```

### SimplifiableAssertion
`assertFalse()` can be simplified to 'assertNotEquals()'
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/multipleinstances/MultipleBeanInstancesTest.java`
#### Snippet
```java
        instance1 = bean.get();
        instance2 = bean.get();
        assertFalse("CDI container should return two different bean instances",
                instance1.equals(instance2));
    }
```

### SimplifiableAssertion
`assertTrue()` can be simplified to 'assertEquals()'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimerTest.java`
#### Snippet
```java
        PercentileValue[] percentileValues = globalTimer.getSnapshot().percentileValues();
        // Check that there are 6 percentiles - [0.5, 0.75,0.95,0.98,0.99,0.999]
        Assert.assertTrue(percentileValues.length == 6);

        int countDown = 6;
```

### SimplifiableAssertion
`assertTrue()` can be simplified to 'assertEquals()'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimerTest.java`
#### Snippet
```java
            }
        }
        Assert.assertTrue(countDown == 0);

    }
```

### SimplifiableAssertion
`assertEquals()` can be simplified to 'assertTrue()'
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimerTest.java`
#### Snippet
```java
        Assert.assertEquals(timer.getCount(), 1);

        Assert.assertEquals(called.get(), true);
    }

```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricIDTest.java`
#### Snippet
```java
        Counter counter = registry.counter(counterNameNoTag);
        Counter counterRed = registry.counter(counterName, tagEarth, tagRed);
        Counter counterBlue = registry.counter(counterName, tagEarth, tagBlue);

        MetricID counterMID = new MetricID(counterNameNoTag);
        MetricID counterRedMID = new MetricID(counterName, tagEarth, tagRed);
        MetricID counterBlueMID = new MetricID(counterName, tagEarth, tagRed);

        // check multi-dimensional metrics are registered
        assertThat("Counter is not registered correctly", registry.getCounter(counterMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterRedMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterBlueMID), notNullValue());
```

### DuplicatedCode
Duplicated code
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedGaugeMethodBeanTest.java`
#### Snippet
```java
        @SuppressWarnings("unchecked")
        Gauge<Long> parentGauge = (Gauge<Long>) registry.getGauge(parentMID);
        @SuppressWarnings("unchecked")
        Gauge<Long> childGauge = (Gauge<Long>) registry.getGauge(childMID);
        assertThat("Gauges are not registered correctly", parentGauge, notNullValue());
        assertThat("Gauges are not registered correctly", childGauge, notNullValue());
```

### DuplicatedCode
Duplicated code
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramTest.java`
#### Snippet
```java
        PercentileValue[] percentileValuesHistInt = histogramInt.getSnapshot().percentileValues();
        // Check that there are 6 percentiles - [0.75,0.95,0.98,0.99,0.999]
        Assert.assertTrue(percentileValuesHistInt.length == 6);

        int countDown = 6;
        for (PercentileValue pv : percentileValuesHistInt) {
            double percentile = pv.getPercentile();
            if (percentile == 0.5 ||
                    percentile == 0.75 ||
                    percentile == 0.95 ||
                    percentile == 0.98 ||
                    percentile == 0.99 ||
                    percentile == 0.999) {
                countDown--;
            }
        }
        Assert.assertTrue(countDown == 0);
```

### DuplicatedCode
Duplicated code
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramTest.java`
#### Snippet
```java
        for (PercentileValue pv : percentileValuesHisLong) {
            double percentile = pv.getPercentile();
            if (percentile == 0.5 ||
                    percentile == 0.75 ||
                    percentile == 0.95 ||
                    percentile == 0.98 ||
                    percentile == 0.99 ||
                    percentile == 0.999) {
                countDown--;
            }
        }
        Assert.assertTrue(countDown == 0);
```

### DuplicatedCode
Duplicated code
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramTest.java`
#### Snippet
```java
        Snapshot snapshot = histo.getSnapshot();

        PercentileValue percentileValue = null;
        for (PercentileValue pv : snapshot.percentileValues()) {
            if (pv.getPercentile() == percentile) {
                percentileValue = pv;
                break;
            }
        }
        assertNotNull(percentileValue);
        return percentileValue;
```

### DuplicatedCode
Duplicated code
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanTest.java`
#### Snippet
```java
        Timer timer = registry.getTimer(timerMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());

        // Remove the timer from metrics registry
        registry.remove(timerMID);

        try {
            // Call the timed method and assert an exception is thrown
            bean.timedMethod();
        } catch (RuntimeException cause) {
            assertThat(cause, is(instanceOf(IllegalStateException.class)));
            // Make sure that the timer hasn't been called
            assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(TIMER_COUNT.get())));
            return;
        }

        fail("No exception has been re-thrown!");
```

### DuplicatedCode
Duplicated code
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanLookupTest.java`
#### Snippet
```java
        registry.remove(timerMID);

        try {
            // Call the timed method and assert an exception is thrown
            bean.timedMethod();
        } catch (RuntimeException cause) {
            assertThat(cause, is(instanceOf(IllegalStateException.class)));
            // Make sure that the timer hasn't been called
            assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(TIMER_COUNT.get())));
            return;
        }

        fail("No exception has been re-thrown!");
```

### DuplicatedCode
Duplicated code
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/GaugeTagMethodBeanTest.java`
#### Snippet
```java
        @SuppressWarnings("unchecked")
        Gauge<Long> gaugeOne = (Gauge<Long>) registry.getGauge(gaugeOneMID);

        @SuppressWarnings("unchecked")
        Gauge<Long> gaugeTwo = (Gauge<Long>) registry.getGauge(gaugeTwoMID);

        assertThat("Gauge is not registered correctly", gaugeOne, notNullValue());
        assertThat("Gauge is not registered correctly", gaugeTwo, notNullValue());
```

### DuplicatedCode
Duplicated code
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java
        String serverUrl = System.getProperty("test.url");
        String protocol = DEFAULT_PROTOCOL;
        String host = DEFAULT_HOST;
        int port = DEFAULT_PORT;

        if (serverUrl != null) {
            URL url = new URL(serverUrl);
            protocol = url.getProtocol();
            host = url.getHost();
            port = (url.getPort() == -1) ? DEFAULT_PORT : url.getPort();
        }

        RestAssured.baseURI = protocol + "://" + host;
        RestAssured.port = port;

        // set user name and password to use for basic authentication for all requests
        String userName = System.getProperty("test.user");
        String password = System.getProperty("test.pwd");

        if (userName != null && password != null) {
            RestAssured.authentication = RestAssured.basic(userName, password);
            RestAssured.useRelaxedHTTPSValidation();
        }
```

### DuplicatedCode
Duplicated code
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java
        Assume.assumeFalse(Boolean.getBoolean("skip.base.metric.tests"));
        Header wantPromMetricsFormat = new Header("Accept", TEXT_PLAIN);

        String data = given().header(wantPromMetricsFormat).get("/metrics?scope=base").asString();

        String[] lines = data.split("\n");

        Map<String, MiniMeta> expectedMetadata = getExpectedMetadataFromXmlFile(MetricRegistry.BASE_SCOPE);
```

### DuplicatedCode
Duplicated code
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MpMetricOptionalTest.java`
#### Snippet
```java
        Header acceptHeader = new Header("Accept", TEXT_PLAIN);

        given().header(acceptHeader).port(applicationPort).when().get(contextRoot + "/get-noparam").then()
                .statusCode(200);

        Response resp = given().header(acceptHeader).when().get(METRICS_ENDPOINT);
        ResponseBuilder responseBuilder = new ResponseBuilder();
        responseBuilder.clone(resp);
        responseBuilder.setBody(filterOutAppLabelOpenMetrics(resp.getBody().asString()));
        resp = responseBuilder.build();
```

### DuplicatedCode
Duplicated code
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MpMetricTest.java`
#### Snippet
```java
        Header wantPrometheus = new Header("Accept", TEXT_PLAIN);

        Response resp = given().header(wantPrometheus).get("/metrics?scope=application");

        ResponseBuilder responseBuilder = new ResponseBuilder();
        responseBuilder.clone(resp);
        responseBuilder.setBody(filterOutAppLabelPromMetrics(resp.getBody().asString()));
        resp = responseBuilder.build();
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MetricAppBean.java`
#### Snippet
```java
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
        } finally {
            context.stop();
```

## RuleId[id=NewClassNamingConvention]
### NewClassNamingConvention
Test class name `MiniMeta` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java

    @SuppressWarnings("StringBufferReplaceableByString")
    private static class MiniMeta {
        private String name;
        private String type;
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `myAtomicInteger` is redundant
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/GaugeTest.java`
#### Snippet
```java
        metrics.gauge("tck.gaugetest.toDoubleFunctionGaugeManual", value,
                (atomicInteger) -> {
                    AtomicInteger myAtomicInteger = (AtomicInteger) atomicInteger;
                    return myAtomicInteger.getAndIncrement();
                }, null);
```

### UnnecessaryLocalVariable
Local variable `jar` is redundant
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/ReusedMetricsTest.java`
#### Snippet
```java
    @Deployment
    public static WebArchive createDeployment() {
        WebArchive jar = ShrinkWrap.create(WebArchive.class).addClass(MetricAppBean2.class)
                .addAsWebInfResource("META-INF/beans.xml", "beans.xml");

```

### UnnecessaryLocalVariable
Local variable `archive` is redundant
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/multipleinstances/MultipleBeanInstancesTest.java`
#### Snippet
```java
    @Deployment
    public static WebArchive createDeployment() {
        WebArchive archive = ShrinkWrap.create(WebArchive.class).addClass(DependentScopedBean.class)
                .addAsWebInfResource("META-INF/beans.xml", "beans.xml");
        return archive;
```

## RuleId[id=Deprecation]
### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteTimedBeanTest.java`
#### Snippet
```java
    public void extendedTimedMethodNotCalledYet(MetricRegistry registry) {
        Timer timer = registry.getTimer(extendedTimedMID);
        assertThat("Timer is not registered correctly on the methods on the abstract class", timer, notNullValue());

        // Make sure that the timer hasn't been called yet
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteTimedBeanTest.java`
#### Snippet
```java

        // Make sure that the timer hasn't been called yet
        assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(0L)));
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteTimedBeanTest.java`
#### Snippet
```java
    public void callTimedMethodOnce(MetricRegistry registry) {
        Timer timer = registry.getTimer(timerMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());

        // Call the timed method and assert it's been timed
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteTimedBeanTest.java`
#### Snippet
```java

        // Make sure that the timer has been called
        assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(1L)));
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteTimedBeanTest.java`
#### Snippet
```java
    public void callExtendedTimedMethodOnce(MetricRegistry registry) {
        Timer timer = registry.getTimer(extendedTimedMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());

        // Call the timed method and assert it's been timed
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteTimedBeanTest.java`
#### Snippet
```java

        // Make sure that the timer has been called
        assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(1L)));
    }
}
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteTimedBeanTest.java`
#### Snippet
```java
    public void timedMethodNotCalledYet(MetricRegistry registry) {
        Timer timer = registry.getTimer(timerMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());

        // Make sure that the timer hasn't been called yet
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteTimedBeanTest.java`
#### Snippet
```java

        // Make sure that the timer hasn't been called yet
        assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(0L)));
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/GaugeInjectionBeanTest.java`
#### Snippet
```java
    public void gaugeCalledWithDefaultValue() {
        // Make sure that the gauge has the expected value
        assertThat("Gauge value is incorrect", gauge.getValue(), is(equalTo(0L)));
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/GaugeInjectionBeanTest.java`
#### Snippet
```java
        bean.setGauge(value);

        assertThat("Gauge value is incorrect", gauge.getValue(), is(equalTo(value)));
    }
}
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/MultipleMetricsConstructorBeanTest.java`
#### Snippet
```java

        // Make sure that the metrics have been called
        assertThat("Counter count is incorrect", registry.getCounter(
                new MetricID(absoluteMetricName("counter"))).getCount(), is(equalTo(count)));
        assertThat("Timer count is incorrect", registry.getTimer(
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/MultipleMetricsConstructorBeanTest.java`
#### Snippet
```java
        assertThat("Counter count is incorrect", registry.getCounter(
                new MetricID(absoluteMetricName("counter"))).getCount(), is(equalTo(count)));
        assertThat("Timer count is incorrect", registry.getTimer(
                new MetricID(absoluteMetricName("timer"))).getCount(), is(equalTo(count)));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramFieldBeanTest.java`
#### Snippet
```java
    @InSequence(1)
    public void histogramFieldRegistered() {
        assertThat("Histogram is not registered correctly", registry.getHistogram(histogramMID), notNullValue());
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramFieldBeanTest.java`
#### Snippet
```java
    public void updateHistogramField() {
        Histogram histogram = registry.getHistogram(histogramMID);
        assertThat("Histogram is not registered correctly", histogram, notNullValue());

        // Call the update method and assert the histogram is up-to-date
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramFieldBeanTest.java`
#### Snippet
```java

        bean.update(value);
        assertThat("Histogram count is incorrect", histogram.getCount(), is(equalTo(1L)));
        assertThat("Histogram sum is incorrect", histogram.getSum(), is(equalTo(value)));
        assertThat("Histogram size is incorrect", histogram.getSnapshot().size(), is(equalTo(1L)));
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramFieldBeanTest.java`
#### Snippet
```java
        bean.update(value);
        assertThat("Histogram count is incorrect", histogram.getCount(), is(equalTo(1L)));
        assertThat("Histogram sum is incorrect", histogram.getSum(), is(equalTo(value)));
        assertThat("Histogram size is incorrect", histogram.getSnapshot().size(), is(equalTo(1L)));
        assertThat("Histogram max value is incorrect", histogram.getSnapshot().getMax(), is(equalTo((double) value)));
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramFieldBeanTest.java`
#### Snippet
```java
        assertThat("Histogram count is incorrect", histogram.getCount(), is(equalTo(1L)));
        assertThat("Histogram sum is incorrect", histogram.getSum(), is(equalTo(value)));
        assertThat("Histogram size is incorrect", histogram.getSnapshot().size(), is(equalTo(1L)));
        assertThat("Histogram max value is incorrect", histogram.getSnapshot().getMax(), is(equalTo((double) value)));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramFieldBeanTest.java`
#### Snippet
```java
        assertThat("Histogram sum is incorrect", histogram.getSum(), is(equalTo(value)));
        assertThat("Histogram size is incorrect", histogram.getSnapshot().size(), is(equalTo(1L)));
        assertThat("Histogram max value is incorrect", histogram.getSnapshot().getMax(), is(equalTo((double) value)));
    }
}
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/TimerInjectionBeanTest.java`
#### Snippet
```java
    public void timedMethodNotCalledYet() {
        // Make sure that the timer hasn't been called yet
        assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(0L)));
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/TimerInjectionBeanTest.java`
#### Snippet
```java

        // Make sure that the timer has been called
        assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(1L)));
    }
}
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedConstructorBeanTest.java`
#### Snippet
```java

        Timer timer = registry.getTimer(timerMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());

        // Make sure that the timer has been called
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedConstructorBeanTest.java`
#### Snippet
```java

        // Make sure that the timer has been called
        assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(count)));
    }
}
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedClassBeanTest.java`
#### Snippet
```java
    @InSequence(1)
    public void countedMethodsNotCalledYet() {
        assertThat("Counters are not registered correctly", registry.getCounters().keySet(), is(equalTo(counterMIDs)));

        // Make sure that the counters haven't been incremented
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedClassBeanTest.java`
#### Snippet
```java

        // Make sure that the counters haven't been incremented
        assertThat("Method counter counts are incorrect", registry.getCounters(METHOD_COUNTERS).values(),
                everyItem(Matchers.<Counter>hasProperty("count", equalTo(0L))));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedClassBeanTest.java`
#### Snippet
```java
    @InSequence(2)
    public void callCountedMethodsOnce() {
        assertThat("Counters are not registered correctly", registry.getCounters().keySet(), is(equalTo(counterMIDs)));

        // Call the counted methods and assert they've been incremented
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedClassBeanTest.java`
#### Snippet
```java

        // Make sure that the counters have been incremented
        assertThat("Method counter counts are incorrect", registry.getCounters(METHOD_COUNTERS).values(),
                everyItem(Matchers.<Counter>hasProperty("count", equalTo(1L))));

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedClassBeanTest.java`
#### Snippet
```java
                everyItem(Matchers.<Counter>hasProperty("count", equalTo(1L))));

        assertThat("Constructor's metric should be incremented at least once",
                registry.getCounter(constructorMID).getCount(), is(greaterThanOrEqualTo(1L)));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/VisibilityTimedMethodBeanTest.java`
#### Snippet
```java
    @InSequence(1)
    public void timedMethodsNotCalledYet() {
        assertThat("Timers are not registered correctly", registry.getTimers().keySet(),
                is(equalTo(MetricsUtil.createMetricIDs(absoluteMetricNames()))));

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/VisibilityTimedMethodBeanTest.java`
#### Snippet
```java

        // Make sure that all the timers haven't been called yet
        assertThat("Timer counts are incorrect", registry.getTimers().values(),
                everyItem(Matchers.<Timer>hasProperty("count", equalTo(0L))));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/VisibilityTimedMethodBeanTest.java`
#### Snippet
```java
    @InSequence(2)
    public void callTimedMethodsOnce() {
        assertThat("Timers are not registered correctly", registry.getTimers().keySet(),
                is(equalTo(MetricsUtil.createMetricIDs(absoluteMetricNames()))));

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/VisibilityTimedMethodBeanTest.java`
#### Snippet
```java
        bean.packagePrivateTimedMethod();

        assertThat("Timer counts are incorrect", registry.getTimers().values(),
                everyItem(Matchers.<Timer>hasProperty("count", equalTo(1L))));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedTimedMethodBeanTest.java`
#### Snippet
```java
    @InSequence(2)
    public void callTimedMethodsOnce() {
        assertThat("Timers are not registered correctly", registry.getTimers().keySet(),
                is(equalTo(MetricsUtil.createMetricIDs(absoluteMetricNames()))));

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedTimedMethodBeanTest.java`
#### Snippet
```java
        bean.timedMethodPackagedPrivate();

        assertThat("Timer counts are incorrect", registry.getTimers().values(),
                everyItem(Matchers.<Timer>hasProperty("count", equalTo(1L))));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedTimedMethodBeanTest.java`
#### Snippet
```java
    @InSequence(1)
    public void timedMethodsNotCalledYet() {
        assertThat("Timers are not registered correctly", registry.getTimers().keySet(),
                is(equalTo(MetricsUtil.createMetricIDs(absoluteMetricNames()))));

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedTimedMethodBeanTest.java`
#### Snippet
```java

        // Make sure that all the timers haven't been called yet
        assertThat("Timer counts are incorrect", registry.getTimers().values(),
                everyItem(Matchers.<Timer>hasProperty("count", equalTo(0L))));
    }
```

### Deprecation
'org.eclipse.microprofile.metrics.annotation.RegistryType' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricRegistryTest.java`
#### Snippet
```java

    @Inject
    @RegistryType(type = MetricRegistry.Type.BASE)
    private MetricRegistry baseMetrics_RegistryType;

```

### Deprecation
'org.eclipse.microprofile.metrics.MetricRegistry.Type' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricRegistryTest.java`
#### Snippet
```java

    @Inject
    @RegistryType(type = MetricRegistry.Type.BASE)
    private MetricRegistry baseMetrics_RegistryType;

```

### Deprecation
'BASE' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricRegistryTest.java`
#### Snippet
```java

    @Inject
    @RegistryType(type = MetricRegistry.Type.BASE)
    private MetricRegistry baseMetrics_RegistryType;

```

### Deprecation
'org.eclipse.microprofile.metrics.annotation.RegistryType' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricRegistryTest.java`
#### Snippet
```java

    @Inject
    @RegistryType(type = MetricRegistry.Type.APPLICATION)
    private MetricRegistry applicationMetrics_RegistryType;

```

### Deprecation
'org.eclipse.microprofile.metrics.MetricRegistry.Type' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricRegistryTest.java`
#### Snippet
```java

    @Inject
    @RegistryType(type = MetricRegistry.Type.APPLICATION)
    private MetricRegistry applicationMetrics_RegistryType;

```

### Deprecation
'APPLICATION' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricRegistryTest.java`
#### Snippet
```java

    @Inject
    @RegistryType(type = MetricRegistry.Type.APPLICATION)
    private MetricRegistry applicationMetrics_RegistryType;

```

### Deprecation
'org.eclipse.microprofile.metrics.annotation.RegistryType' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricRegistryTest.java`
#### Snippet
```java

    @Inject
    @RegistryType(type = MetricRegistry.Type.VENDOR)
    private MetricRegistry vendorMetrics_RegistryType;

```

### Deprecation
'org.eclipse.microprofile.metrics.MetricRegistry.Type' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricRegistryTest.java`
#### Snippet
```java

    @Inject
    @RegistryType(type = MetricRegistry.Type.VENDOR)
    private MetricRegistry vendorMetrics_RegistryType;

```

### Deprecation
'VENDOR' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricRegistryTest.java`
#### Snippet
```java

    @Inject
    @RegistryType(type = MetricRegistry.Type.VENDOR)
    private MetricRegistry vendorMetrics_RegistryType;

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteExtendedTimedBeanTest.java`
#### Snippet
```java
    public void extendedTimedMethodNotCalledYet(MetricRegistry registry) {
        Timer timer = registry.getTimer(extendedTimedMID);
        assertThat("Timer is not registered correctly on the methods on the abstract class", timer, notNullValue());

        // Make sure that the timer hasn't been called yet
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteExtendedTimedBeanTest.java`
#### Snippet
```java

        // Make sure that the timer hasn't been called yet
        assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(0L)));
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteExtendedTimedBeanTest.java`
#### Snippet
```java
    public void callTimedMethodOnce(MetricRegistry registry) {
        Timer timer = registry.getTimer(timedMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());

        // Call the timed method and assert it's been timed
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteExtendedTimedBeanTest.java`
#### Snippet
```java

        // Make sure that the timer has been called
        assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(1L)));
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteExtendedTimedBeanTest.java`
#### Snippet
```java
    public void callExtendedTimedMethodOnce(MetricRegistry registry) {
        Timer timer = registry.getTimer(extendedTimedMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());

        // Call the timed method and assert it's been timed
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteExtendedTimedBeanTest.java`
#### Snippet
```java

        // Make sure that the timer has been called
        assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(1L)));
    }
}
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteExtendedTimedBeanTest.java`
#### Snippet
```java
    public void timedMethodNotCalledYet(MetricRegistry registry) {
        Timer timer = registry.getTimer(timedMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());

        // Make sure that the timer hasn't been called yet
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteExtendedTimedBeanTest.java`
#### Snippet
```java

        // Make sure that the timer hasn't been called yet
        assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(0L)));
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimerFieldBeanTest.java`
#### Snippet
```java
    @Test
    public void timerFieldsWithDefaultNamingConvention() {
        assertThat("Timers are not registered correctly", registry.getMetricIDs(),
                is(equalTo(MetricsUtil.createMetricIDs(metricNames()))));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TimerTagFieldBeanTest.java`
#### Snippet
```java
    @Test
    public void timersTagFieldRegistered() {
        assertThat("Timer is not registered correctly", registry.getTimer(timerOneMID), notNullValue());
        assertThat("Timer is not registered correctly", registry.getTimer(timerTwoMID), notNullValue());
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TimerTagFieldBeanTest.java`
#### Snippet
```java
    public void timersTagFieldRegistered() {
        assertThat("Timer is not registered correctly", registry.getTimer(timerOneMID), notNullValue());
        assertThat("Timer is not registered correctly", registry.getTimer(timerTwoMID), notNullValue());
    }
}
```

### Deprecation
'org.eclipse.microprofile.metrics.annotation.RegistryType' is deprecated
in `api/src/main/java/org/eclipse/microprofile/metrics/annotation/package-info.java`
#### Snippet
```java
 * <b> This is DEPRECATED. Please use {@link RegistryScope} instead. </b>
 *
 * The {@link org.eclipse.microprofile.metrics.annotation.RegistryType RegistryType} is used to identify which
 * <code>MetricRegistry</code> (Application, Base, or Vendor) should be injected. Injecting a
 * <code>MetricRegistry</code> without a <code>RegistryType</code> annotation gives the application-scoped
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CounterFieldBeanTest.java`
#### Snippet
```java
    public void incrementCounterField() {
        Counter counter = registry.getCounter(counterMID);
        assertThat("Counter is not registered correctly", counter, notNullValue());

        // Call the increment method and assert the counter is up-to-date
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CounterFieldBeanTest.java`
#### Snippet
```java
        long value = Math.round(Math.random() * Long.MAX_VALUE);
        bean.increment(value);
        assertThat("Counter value is incorrect", counter.getCount(), is(equalTo(value)));
    }
}
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CounterFieldBeanTest.java`
#### Snippet
```java
    @InSequence(1)
    public void counterFieldRegistered() {
        assertThat("Counter is not registered correctly", registry.getCounter(counterMID), notNullValue());
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramTest.java`
#### Snippet
```java
        Histogram histogramLong = metrics.getHistogram(histogramLongNameMetricID);

        assertThat("Histogram is not registered correctly", histogramInt, notNullValue());
        assertThat("Histogram is not registered correctly", histogramLong, notNullValue());

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramTest.java`
#### Snippet
```java

        assertThat("Histogram is not registered correctly", histogramInt, notNullValue());
        assertThat("Histogram is not registered correctly", histogramLong, notNullValue());

        PercentileValue histogramIntPercentileValue = getPercentileValueAt(histogramInt, 0.5);
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/ApplicationScopedTimedMethodBeanTest.java`
#### Snippet
```java
    public void callTimedMethodOnce() {
        Timer timer = registry.getTimer(timerMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());

        // Call the timed method and assert it's been timed
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/ApplicationScopedTimedMethodBeanTest.java`
#### Snippet
```java

        // Make sure that the timer has been called
        assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(1L)));
    }
}
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/ApplicationScopedTimedMethodBeanTest.java`
#### Snippet
```java
    public void timedMethodNotCalledYet() {
        Timer timer = registry.getTimer(timerMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());

        // Make sure that the timer hasn't been called yet
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/ApplicationScopedTimedMethodBeanTest.java`
#### Snippet
```java

        // Make sure that the timer hasn't been called yet
        assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(0L)));
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanLookupTest.java`
#### Snippet
```java

        Timer timer = registry.getTimer(timerMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());

        // Make sure that the timer hasn't been called yet
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanLookupTest.java`
#### Snippet
```java

        // Make sure that the timer hasn't been called yet
        assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(TIMER_COUNT.get())));
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanLookupTest.java`
#### Snippet
```java

        Timer timer = registry.getTimer(timerMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());

        // Call the timed method and assert it's been timed
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanLookupTest.java`
#### Snippet
```java

        // Make sure that the timer has been called
        assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(TIMER_COUNT.incrementAndGet())));
        TestUtils.assertEqualsWithTolerance(2000000000L, timer.getElapsedTime().toNanos());
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanLookupTest.java`
#### Snippet
```java

        Timer timer = registry.getTimer(timerMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());

        // Remove the timer from metrics registry
```

### Deprecation
'assertThat(T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanLookupTest.java`
#### Snippet
```java
            bean.timedMethod();
        } catch (RuntimeException cause) {
            assertThat(cause, is(instanceOf(IllegalStateException.class)));
            // Make sure that the timer hasn't been called
            assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(TIMER_COUNT.get())));
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanLookupTest.java`
#### Snippet
```java
            assertThat(cause, is(instanceOf(IllegalStateException.class)));
            // Make sure that the timer hasn't been called
            assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(TIMER_COUNT.get())));
            return;
        }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TimedTagMethodBeanTest.java`
#### Snippet
```java
    @InSequence(1)
    public void timedTagMethodRegistered() {
        assertThat("Timer is not registered correctly", registry.getTimer(timerOneMID), notNullValue());
        assertThat("Timer is not registered correctly", registry.getTimer(timerTwoMID), notNullValue());
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TimedTagMethodBeanTest.java`
#### Snippet
```java
    public void timedTagMethodRegistered() {
        assertThat("Timer is not registered correctly", registry.getTimer(timerOneMID), notNullValue());
        assertThat("Timer is not registered correctly", registry.getTimer(timerTwoMID), notNullValue());
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/HistogramTagFieldBeanTest.java`
#### Snippet
```java
    @InSequence(1)
    public void histogramTagFieldRegistered() {
        assertThat("Histogram is not registered correctly", registry.getHistogram(histogramOneMID), notNullValue());
        assertThat("Histogram is not registered correctly", registry.getHistogram(histogramTwoMID), notNullValue());
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/HistogramTagFieldBeanTest.java`
#### Snippet
```java
    public void histogramTagFieldRegistered() {
        assertThat("Histogram is not registered correctly", registry.getHistogram(histogramOneMID), notNullValue());
        assertThat("Histogram is not registered correctly", registry.getHistogram(histogramTwoMID), notNullValue());
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/HistogramTagFieldBeanTest.java`
#### Snippet
```java
        Histogram histogramOne = registry.getHistogram(histogramOneMID);
        Histogram histogramTwo = registry.getHistogram(histogramTwoMID);
        assertThat("Histogram is not registered correctly", histogramOne, notNullValue());
        assertThat("Histogram is not registered correctly", histogramTwo, notNullValue());

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/HistogramTagFieldBeanTest.java`
#### Snippet
```java
        Histogram histogramTwo = registry.getHistogram(histogramTwoMID);
        assertThat("Histogram is not registered correctly", histogramOne, notNullValue());
        assertThat("Histogram is not registered correctly", histogramTwo, notNullValue());

        // Call the update method and assert the histogram is up-to-date
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/HistogramTagFieldBeanTest.java`
#### Snippet
```java
        bean.updateTwo(valueTwo);

        assertThat("Histogram count is incorrect", histogramOne.getCount(), is(equalTo(1L)));
        assertThat("Histogram size is incorrect", histogramOne.getSnapshot().size(), is(equalTo(1L)));
        assertThat("Histogram max value is incorrect", histogramOne.getSnapshot().getMax(),
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/HistogramTagFieldBeanTest.java`
#### Snippet
```java

        assertThat("Histogram count is incorrect", histogramOne.getCount(), is(equalTo(1L)));
        assertThat("Histogram size is incorrect", histogramOne.getSnapshot().size(), is(equalTo(1L)));
        assertThat("Histogram max value is incorrect", histogramOne.getSnapshot().getMax(),
                is(equalTo((double) value)));
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/HistogramTagFieldBeanTest.java`
#### Snippet
```java
        assertThat("Histogram count is incorrect", histogramOne.getCount(), is(equalTo(1L)));
        assertThat("Histogram size is incorrect", histogramOne.getSnapshot().size(), is(equalTo(1L)));
        assertThat("Histogram max value is incorrect", histogramOne.getSnapshot().getMax(),
                is(equalTo((double) value)));

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/HistogramTagFieldBeanTest.java`
#### Snippet
```java
                is(equalTo((double) value)));

        assertThat("Histogram count is incorrect", histogramTwo.getCount(), is(equalTo(1L)));
        assertThat("Histogram size is incorrect", histogramTwo.getSnapshot().size(), is(equalTo(1L)));
        assertThat("Histogram max value is incorrect", histogramTwo.getSnapshot().getMax(),
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/HistogramTagFieldBeanTest.java`
#### Snippet
```java

        assertThat("Histogram count is incorrect", histogramTwo.getCount(), is(equalTo(1L)));
        assertThat("Histogram size is incorrect", histogramTwo.getSnapshot().size(), is(equalTo(1L)));
        assertThat("Histogram max value is incorrect", histogramTwo.getSnapshot().getMax(),
                is(equalTo((double) valueTwo)));
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/HistogramTagFieldBeanTest.java`
#### Snippet
```java
        assertThat("Histogram count is incorrect", histogramTwo.getCount(), is(equalTo(1L)));
        assertThat("Histogram size is incorrect", histogramTwo.getSnapshot().size(), is(equalTo(1L)));
        assertThat("Histogram max value is incorrect", histogramTwo.getSnapshot().getMax(),
                is(equalTo((double) valueTwo)));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/OverloadedTimedMethodBeanTest.java`
#### Snippet
```java
        bean.overloadedTimedMethod(new Object());
        bean.overloadedTimedMethod(Arrays.asList("string1", "string2"));
        assertThat("Timer counts are incorrect", registry.getTimers().values(),
                hasItem(Matchers.<Timer>hasProperty("count", equalTo(1L))));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/OverloadedTimedMethodBeanTest.java`
#### Snippet
```java

        // Make sure that all the timers haven't been called yet
        assertThat("Timer counts are incorrect", registry.getTimers().values(),
                hasItem(Matchers.<Timer>hasProperty("count", equalTo(0L))));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/GaugeTagMethodBeanTest.java`
#### Snippet
```java
        Gauge<Long> gaugeTwo = (Gauge<Long>) registry.getGauge(gaugeTwoMID);

        assertThat("Gauge is not registered correctly", gaugeOne, notNullValue());
        assertThat("Gauge is not registered correctly", gaugeTwo, notNullValue());

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/GaugeTagMethodBeanTest.java`
#### Snippet
```java

        assertThat("Gauge is not registered correctly", gaugeOne, notNullValue());
        assertThat("Gauge is not registered correctly", gaugeTwo, notNullValue());

        // Make sure that the gauge has the expected value
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/GaugeTagMethodBeanTest.java`
#### Snippet
```java

        // Make sure that the gauge has the expected value
        assertThat("Gauge value is incorrect", gaugeOne.getValue(), is(equalTo(0L)));
        assertThat("Gauge value is incorrect", gaugeTwo.getValue(), is(equalTo(0L)));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/GaugeTagMethodBeanTest.java`
#### Snippet
```java
        // Make sure that the gauge has the expected value
        assertThat("Gauge value is incorrect", gaugeOne.getValue(), is(equalTo(0L)));
        assertThat("Gauge value is incorrect", gaugeTwo.getValue(), is(equalTo(0L)));
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/GaugeTagMethodBeanTest.java`
#### Snippet
```java
        @SuppressWarnings("unchecked")
        Gauge<Long> gaugeTwo = (Gauge<Long>) registry.getGauge(gaugeTwoMID);
        assertThat("Gauge is not registered correctly", gaugeOne, notNullValue());
        assertThat("Gauge is not registered correctly", gaugeTwo, notNullValue());

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/GaugeTagMethodBeanTest.java`
#### Snippet
```java
        Gauge<Long> gaugeTwo = (Gauge<Long>) registry.getGauge(gaugeTwoMID);
        assertThat("Gauge is not registered correctly", gaugeOne, notNullValue());
        assertThat("Gauge is not registered correctly", gaugeTwo, notNullValue());

        // Call the setter method and assert the gauge is up-to-date
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/GaugeTagMethodBeanTest.java`
#### Snippet
```java
        bean.setGaugeTwo(secondValue);

        assertThat("Gauge value is incorrect", gaugeOne.getValue(), is(equalTo(value)));
        assertThat("Gauge value is incorrect", gaugeTwo.getValue(), is(equalTo(secondValue)));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/GaugeTagMethodBeanTest.java`
#### Snippet
```java

        assertThat("Gauge value is incorrect", gaugeOne.getValue(), is(equalTo(value)));
        assertThat("Gauge value is incorrect", gaugeTwo.getValue(), is(equalTo(secondValue)));
    }
}
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodTagBeanTest.java`
#### Snippet
```java
        Counter counterTwo = registry.getCounter(counterTwoMID);

        assertThat("Counter is not registered correctly", counterOne, notNullValue());
        assertThat("Counter is not registered correctly", counterTwo, notNullValue());

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodTagBeanTest.java`
#### Snippet
```java

        assertThat("Counter is not registered correctly", counterOne, notNullValue());
        assertThat("Counter is not registered correctly", counterTwo, notNullValue());

        // Make sure that the counter registered and the bean instance are the same
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodTagBeanTest.java`
#### Snippet
```java

        // Make sure that the counter registered and the bean instance are the same
        assertThat("Counter and bean instance are not equal", instanceOne, is(equalTo(counterOne)));
        assertThat("Counter and bean instance are not equal", instanceTwo, is(equalTo(counterTwo)));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodTagBeanTest.java`
#### Snippet
```java
        // Make sure that the counter registered and the bean instance are the same
        assertThat("Counter and bean instance are not equal", instanceOne, is(equalTo(counterOne)));
        assertThat("Counter and bean instance are not equal", instanceTwo, is(equalTo(counterTwo)));
    }
}
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodTagBeanTest.java`
#### Snippet
```java
    @InSequence(1)
    public void counterTagMethodsRegistered() {
        assertThat("Counter is not registered correctly", registry.getCounter(counterOneMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterTwoMID), notNullValue());
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodTagBeanTest.java`
#### Snippet
```java
    public void counterTagMethodsRegistered() {
        assertThat("Counter is not registered correctly", registry.getCounter(counterOneMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterTwoMID), notNullValue());
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedClassBeanTest.java`
#### Snippet
```java
    @InSequence(1)
    public void timedMethodsNotCalledYet() {
        assertThat("Timers are not registered correctly", registry.getTimers().keySet(),
                is(equalTo(timerMIDsIncludingToString)));

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedClassBeanTest.java`
#### Snippet
```java
                is(equalTo(timerMIDsIncludingToString)));

        assertThat("Constructor timer count is incorrect", registry.getTimer(constructorMID).getCount(),
                is(equalTo(1L)));

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedClassBeanTest.java`
#### Snippet
```java

        // Make sure that the method timers haven't been timed yet
        assertThat("Method timer counts are incorrect", registry.getTimers(METHOD_TIMERS).values(),
                everyItem(Matchers.<Timer>hasProperty("count", equalTo(METHOD_COUNT.get()))));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedClassBeanTest.java`
#### Snippet
```java
    @InSequence(2)
    public void callTimedMethodsOnce() {
        assertThat("Timers are not registered correctly", registry.getTimers().keySet(),
                is(equalTo(timerMIDsIncludingToString)));

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedClassBeanTest.java`
#### Snippet
```java
                is(equalTo(timerMIDsIncludingToString)));

        assertThat("Constructor timer count is incorrect", registry.getTimer(constructorMID).getCount(),
                is(equalTo(1L)));

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedClassBeanTest.java`
#### Snippet
```java

        // Make sure that the method timers have been timed
        assertThat("Method timer counts are incorrect", registry.getTimers(METHOD_TIMERS).values(),
                everyItem(Matchers.<Timer>hasProperty("count", equalTo(METHOD_COUNT.incrementAndGet()))));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java
    public void incrementCounterTagFields() {
        Counter counterOne = registry.getCounter(counterMID);
        assertThat("Counter is not registered correctly", counterOne, notNullValue());

        Counter counterTwo = registry.getCounter(counterTwoMID);
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java

        Counter counterTwo = registry.getCounter(counterTwoMID);
        assertThat("Counter is not registered correctly", counterTwo, notNullValue());

        Counter counterThree = registry.getCounter(counterThreeMID);
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java

        Counter counterThree = registry.getCounter(counterThreeMID);
        assertThat("Counter is not registered correctly", counterThree, notNullValue());

        // Call the increment method and assert the counter is up-to-date
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java
        bean.incrementThree(valueThree);

        assertThat("Counter value is incorrect", counterOne.getCount(), is(equalTo(value)));
        assertThat("Counter value is incorrect", counterTwo.getCount(), is(equalTo(valueTwo)));
        assertThat("Counter value is incorrect", counterThree.getCount(), is(equalTo(valueThree)));
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java

        assertThat("Counter value is incorrect", counterOne.getCount(), is(equalTo(value)));
        assertThat("Counter value is incorrect", counterTwo.getCount(), is(equalTo(valueTwo)));
        assertThat("Counter value is incorrect", counterThree.getCount(), is(equalTo(valueThree)));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java
        assertThat("Counter value is incorrect", counterOne.getCount(), is(equalTo(value)));
        assertThat("Counter value is incorrect", counterTwo.getCount(), is(equalTo(valueTwo)));
        assertThat("Counter value is incorrect", counterThree.getCount(), is(equalTo(valueThree)));
    }
}
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java
    @InSequence(1)
    public void counterTagFieldsRegistered() {
        assertThat("Counter is not registered correctly", registry.getCounter(counterMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterTwoMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterThreeMID), notNullValue());
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java
    public void counterTagFieldsRegistered() {
        assertThat("Counter is not registered correctly", registry.getCounter(counterMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterTwoMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterThreeMID), notNullValue());
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java
        assertThat("Counter is not registered correctly", registry.getCounter(counterMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterTwoMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterThreeMID), notNullValue());
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/DefaultNameMetricMethodBeanTest.java`
#### Snippet
```java
    @Test
    public void metricMethodsWithDefaultNamingConvention() {
        assertThat("Metrics are not registered correctly", registry.getMetricIDs(),
                is(equalTo(MetricsUtil.createMetricIDs(metricNames()))));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricIDTest.java`
#### Snippet
```java

        // check multi-dimensional metrics are registered
        assertThat("Counter is not registered correctly", registry.getCounter(counterMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterRedMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterBlueMID), notNullValue());
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricIDTest.java`
#### Snippet
```java
        // check multi-dimensional metrics are registered
        assertThat("Counter is not registered correctly", registry.getCounter(counterMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterRedMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterBlueMID), notNullValue());

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricIDTest.java`
#### Snippet
```java
        assertThat("Counter is not registered correctly", registry.getCounter(counterMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterRedMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterBlueMID), notNullValue());

        // remove one metric
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricIDTest.java`
#### Snippet
```java
        // remove one metric
        registry.remove(counterMID);
        assertThat("Registry did not remove metric", registry.getCounters().size(), equalTo(2));
        assertThat("Counter is not registered correctly", registry.getCounter(counterMID), nullValue());

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricIDTest.java`
#### Snippet
```java
        registry.remove(counterMID);
        assertThat("Registry did not remove metric", registry.getCounters().size(), equalTo(2));
        assertThat("Counter is not registered correctly", registry.getCounter(counterMID), nullValue());

        // remove all metrics with the given name
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricIDTest.java`
#### Snippet
```java
        // remove all metrics with the given name
        registry.remove(counterName);
        assertThat("Counter is not registered correctly", registry.getCounter(counterRedMID), nullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterBlueMID), nullValue());

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricIDTest.java`
#### Snippet
```java
        registry.remove(counterName);
        assertThat("Counter is not registered correctly", registry.getCounter(counterRedMID), nullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterBlueMID), nullValue());

    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java
    public void countedMethodNotCalledYet() {
        Counter counter = registry.getCounter(counterMetricID);
        assertThat("Counter is not registered correctly", counter, notNullValue());

        // Make sure that the counter hasn't been called yet
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java

        // Make sure that the counter hasn't been called yet
        assertThat("Counter count is incorrect", counter.getCount(), is(equalTo(COUNTER_COUNT.get())));
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java
    public void callCountedMethodOnce() throws InterruptedException, TimeoutException {
        Counter counter = registry.getCounter(counterMetricID);
        assertThat("Counter is not registered correctly", counter, notNullValue());

        // Call the counted method, block and assert it's been counted
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java
        // Wait until the method is executing and make sure that the counter has been incremented
        exchanger.exchange(0L, 5L, TimeUnit.SECONDS);
        assertThat("Counter count is incorrect", counter.getCount(), is(equalTo(COUNTER_COUNT.incrementAndGet())));

        // Exchange the result and unblock the method execution
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java

        // Wait until the method has returned
        assertThat("Counted method return value is incorrect", exchanger.exchange(0L), is(equalTo(random)));

        // Then make sure that the counter has not been decremented
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java

        // Then make sure that the counter has not been decremented
        assertThat("Counter count is incorrect", counter.getCount(), is(equalTo(COUNTER_COUNT.get())));

        // Finally make sure calling thread is returns correctly
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java
        // Finally make sure calling thread is returns correctly
        thread.join();
        assertThat("Exception thrown in method call thread", uncaught.get(), is(equalTo(0)));
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java
    public void removeCounterFromRegistry() {
        Counter counter = registry.getCounter(counterMetricID);
        assertThat("Counter is not registered correctly", counter, notNullValue());

        // Remove the counter from metrics registry
```

### Deprecation
'assertThat(T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java
            });
        } catch (Exception cause) {
            assertThat(cause, is(Matchers.<Exception>instanceOf(IllegalStateException.class)));
            // Make sure that the counter hasn't been called
            assertThat("Counter count is incorrect", counter.getCount(), is(equalTo(COUNTER_COUNT.get())));
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java
            assertThat(cause, is(Matchers.<Exception>instanceOf(IllegalStateException.class)));
            // Make sure that the counter hasn't been called
            assertThat("Counter count is incorrect", counter.getCount(), is(equalTo(COUNTER_COUNT.get())));
            return;
        }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java
    public void metricInjectionIntoTest(@Metric(name = "countedMethod", absolute = true) Counter instance) {
        Counter counter = registry.getCounter(counterMetricID);
        assertThat("Counter is not registered correctly", counter, notNullValue());

        // Make sure that the counter registered and the bean instance are the same
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java

        // Make sure that the counter registered and the bean instance are the same
        assertThat("Counter and bean instance are not equal", instance, is(equalTo(counter)));
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanTest.java`
#### Snippet
```java
    public void removeTimerFromRegistry() throws InterruptedException {
        Timer timer = registry.getTimer(timerMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());

        // Remove the timer from metrics registry
```

### Deprecation
'assertThat(T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanTest.java`
#### Snippet
```java
            bean.timedMethod();
        } catch (RuntimeException cause) {
            assertThat(cause, is(instanceOf(IllegalStateException.class)));
            // Make sure that the timer hasn't been called
            assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(TIMER_COUNT.get())));
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanTest.java`
#### Snippet
```java
            assertThat(cause, is(instanceOf(IllegalStateException.class)));
            // Make sure that the timer hasn't been called
            assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(TIMER_COUNT.get())));
            return;
        }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanTest.java`
#### Snippet
```java
    public void callTimedMethodOnce() throws InterruptedException {
        Timer timer = registry.getTimer(timerMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());

        // Call the timed method and assert it's been timed
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanTest.java`
#### Snippet
```java

        // Make sure that the timer has been called
        assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(TIMER_COUNT.incrementAndGet())));
        TestUtils.assertEqualsWithTolerance(2000000000L, timer.getElapsedTime().toNanos());
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanTest.java`
#### Snippet
```java
    public void timedMethodNotCalledYet() {
        Timer timer = registry.getTimer(timerMID);
        assertThat("Timer is not registered correctly", timer, notNullValue());

        // Make sure that the timer hasn't been called yet
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanTest.java`
#### Snippet
```java

        // Make sure that the timer hasn't been called yet
        assertThat("Timer count is incorrect", timer.getCount(), is(equalTo(TIMER_COUNT.get())));
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/MultipleMetricsMethodBeanTest.java`
#### Snippet
```java
    @InSequence(2)
    public void callMetricsMethodOnce() {
        assertThat("Metrics are not registered correctly", registry.getMetricIDs(),
                is(equalTo(MetricsUtil.createMetricIDs(absoluteMetricNames()))));

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/MultipleMetricsMethodBeanTest.java`
#### Snippet
```java

        // Make sure that the metrics have been called
        assertThat("Counter count is incorrect", registry.getCounter(
                new MetricID(absoluteMetricName("counter"))).getCount(), is(equalTo(1L)));
        assertThat("Timer count is incorrect", registry.getTimer(
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/MultipleMetricsMethodBeanTest.java`
#### Snippet
```java
        assertThat("Counter count is incorrect", registry.getCounter(
                new MetricID(absoluteMetricName("counter"))).getCount(), is(equalTo(1L)));
        assertThat("Timer count is incorrect", registry.getTimer(
                new MetricID(absoluteMetricName("timer"))).getCount(), is(equalTo(1L)));
        // Let's call the gauge at the end as Weld is intercepting the gauge
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/MultipleMetricsMethodBeanTest.java`
#### Snippet
```java
        // Let's call the gauge at the end as Weld is intercepting the gauge
        // invocation while OWB not
        assertThat("Gauge value is incorrect", registry.getGauge(
                new MetricID(absoluteMetricName("gauge"))).getValue(), is(equalTo(1234L)));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/MultipleMetricsMethodBeanTest.java`
#### Snippet
```java
    @InSequence(1)
    public void metricsMethodNotCalledYet() {
        assertThat("Metrics are not registered correctly", registry.getMetricIDs(),
                is(equalTo(MetricsUtil.createMetricIDs(absoluteMetricNames()))));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/GaugeMethodBeanTest.java`
#### Snippet
```java
        @SuppressWarnings("unchecked")
        Gauge<Long> gauge = (Gauge<Long>) registry.getGauge(gaugeMID);
        assertThat("Gauge is not registered correctly", gauge, notNullValue());

        // Make sure that the gauge has the expected value
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/GaugeMethodBeanTest.java`
#### Snippet
```java

        // Make sure that the gauge has the expected value
        assertThat("Gauge value is incorrect", gauge.getValue(), is(equalTo(0L)));
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/GaugeMethodBeanTest.java`
#### Snippet
```java
        @SuppressWarnings("unchecked")
        Gauge<Long> gauge = (Gauge<Long>) registry.getGauge(gaugeMID);
        assertThat("Gauge is not registered correctly", gauge, notNullValue());

        // Call the setter method and assert the gauge is up-to-date
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/GaugeMethodBeanTest.java`
#### Snippet
```java
        long value = Math.round(Math.random() * Long.MAX_VALUE);
        bean.setGauge(value);
        assertThat("Gauge value is incorrect", gauge.getValue(), is(equalTo(value)));
    }
}
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedGaugeMethodBeanTest.java`
#### Snippet
```java
        @SuppressWarnings("unchecked")
        Gauge<Long> childGauge = (Gauge<Long>) registry.getGauge(childMID);
        assertThat("Gauges are not registered correctly", parentGauge, notNullValue());
        assertThat("Gauges are not registered correctly", childGauge, notNullValue());

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedGaugeMethodBeanTest.java`
#### Snippet
```java
        Gauge<Long> childGauge = (Gauge<Long>) registry.getGauge(childMID);
        assertThat("Gauges are not registered correctly", parentGauge, notNullValue());
        assertThat("Gauges are not registered correctly", childGauge, notNullValue());

        // Make sure that the gauge has the expected value
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedGaugeMethodBeanTest.java`
#### Snippet
```java

        // Make sure that the gauge has the expected value
        assertThat("Gauge values are incorrect", Arrays.asList(parentGauge.getValue(), childGauge.getValue()),
                contains(0L, 0L));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedGaugeMethodBeanTest.java`
#### Snippet
```java
        @SuppressWarnings("unchecked")
        Gauge<Long> childGauge = (Gauge<Long>) registry.getGauge(childMID);
        assertThat("Gauges are not registered correctly", parentGauge, notNullValue());
        assertThat("Gauges are not registered correctly", childGauge, notNullValue());

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedGaugeMethodBeanTest.java`
#### Snippet
```java
        Gauge<Long> childGauge = (Gauge<Long>) registry.getGauge(childMID);
        assertThat("Gauges are not registered correctly", parentGauge, notNullValue());
        assertThat("Gauges are not registered correctly", childGauge, notNullValue());

        // Call the setter methods and assert the gauges are up-to-date
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedGaugeMethodBeanTest.java`
#### Snippet
```java
        long childValue = Math.round(Math.random() * Long.MAX_VALUE);
        bean.setChildGauge(childValue);
        assertThat("Gauge values are incorrect", Arrays.asList(parentGauge.getValue(), childGauge.getValue()),
                contains(parentValue, childValue));
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java

        // check multi-dimensional metrics are registered
        assertThat("Counter is not registered correctly", registry.getCounter(counterColourMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterRedMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterBlueMID), notNullValue());
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java
        // check multi-dimensional metrics are registered
        assertThat("Counter is not registered correctly", registry.getCounter(counterColourMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterRedMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterBlueMID), notNullValue());
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java
        assertThat("Counter is not registered correctly", registry.getCounter(counterColourMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterRedMID), notNullValue());
        assertThat("Counter is not registered correctly", registry.getCounter(counterBlueMID), notNullValue());
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java

        // check multi-dimensional metrics are registered
        assertThat("Timer is not registered correctly", registry.getTimer(timerColourMID), notNullValue());
        assertThat("Timer is not registered correctly", registry.getTimer(timerRedMID), notNullValue());
        assertThat("Timer is not registered correctly", registry.getTimer(timerBlueMID), notNullValue());
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java
        // check multi-dimensional metrics are registered
        assertThat("Timer is not registered correctly", registry.getTimer(timerColourMID), notNullValue());
        assertThat("Timer is not registered correctly", registry.getTimer(timerRedMID), notNullValue());
        assertThat("Timer is not registered correctly", registry.getTimer(timerBlueMID), notNullValue());
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java
        assertThat("Timer is not registered correctly", registry.getTimer(timerColourMID), notNullValue());
        assertThat("Timer is not registered correctly", registry.getTimer(timerRedMID), notNullValue());
        assertThat("Timer is not registered correctly", registry.getTimer(timerBlueMID), notNullValue());
    }

```

### Deprecation
'assertThat(T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java

        } catch (Exception cause) {
            assertThat(cause, is(Matchers.<Exception>instanceOf(IllegalArgumentException.class)));
            return;
        }
```

### Deprecation
'assertThat(T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java

        } catch (Exception cause) {
            assertThat(cause, is(Matchers.<Exception>instanceOf(IllegalArgumentException.class)));
            return;
        }
```

### Deprecation
'assertThat(T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java

        } catch (Exception cause) {
            assertThat(cause, is(Matchers.<Exception>instanceOf(IllegalArgumentException.class)));
            return;
        }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java

        // check multi-dimensional metrics are registered
        assertThat("Histogram is not registered correctly", registry.getHistogram(histogramColourMID), notNullValue());
        assertThat("Histogram is not registered correctly", registry.getHistogram(histogramRedMID), notNullValue());
        assertThat("Histogram is not registered correctly", registry.getHistogram(histogramBlueMID), notNullValue());
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java
        // check multi-dimensional metrics are registered
        assertThat("Histogram is not registered correctly", registry.getHistogram(histogramColourMID), notNullValue());
        assertThat("Histogram is not registered correctly", registry.getHistogram(histogramRedMID), notNullValue());
        assertThat("Histogram is not registered correctly", registry.getHistogram(histogramBlueMID), notNullValue());
    }
```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java
        assertThat("Histogram is not registered correctly", registry.getHistogram(histogramColourMID), notNullValue());
        assertThat("Histogram is not registered correctly", registry.getHistogram(histogramRedMID), notNullValue());
        assertThat("Histogram is not registered correctly", registry.getHistogram(histogramBlueMID), notNullValue());
    }

```

### Deprecation
'assertThat(T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java
        MetricID metricID = new MetricID("metricName", one, two);

        assertThat(metricID.getTags(), hasKey("hello"));
        assertThat(metricID.getTags(), hasValue("world"));

```

### Deprecation
'assertThat(T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java

        assertThat(metricID.getTags(), hasKey("hello"));
        assertThat(metricID.getTags(), hasValue("world"));

        assertThat(metricID.getTags(), hasKey("goodbye"));
```

### Deprecation
'assertThat(T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java
        assertThat(metricID.getTags(), hasValue("world"));

        assertThat(metricID.getTags(), hasKey("goodbye"));
        assertThat(metricID.getTags(), hasValue("friend"));
    }
```

### Deprecation
'assertThat(T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java

        assertThat(metricID.getTags(), hasKey("goodbye"));
        assertThat(metricID.getTags(), hasValue("friend"));
    }

```

### Deprecation
'assertThat(java.lang.String, T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java

        // check the metric is registered
        assertThat("Counter is not registered correctly", registry.getCounter(counterMID), notNullValue());
    }

```

### Deprecation
'assertThat(T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java

        } catch (Exception cause) {
            assertThat(cause, is(Matchers.<Exception>instanceOf(IllegalArgumentException.class)));
            return;
        }
```

### Deprecation
'assertThat(T, org.hamcrest.Matcher)' is deprecated
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java

        } catch (Exception cause) {
            assertThat(cause, is(Matchers.<Exception>instanceOf(IllegalArgumentException.class)));
            return;
        }
```

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CounterTest.java`
#### Snippet
```java

    @Inject
    private Counter count;

    @Test
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/MultipleMetricsConstructorBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramFieldBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedConstructorBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedClassBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/VisibilityTimedMethodBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Ambiguous dependency: there are multiple beans that match the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/VisibilityTimedMethodBeanTest.java`
#### Snippet
```java

    @Inject
    private VisibilityTimedMethodBean bean;

    @Test
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedTimedMethodBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimerFieldBean.java`
#### Snippet
```java

    @Inject
    private Timer timerWithoutAnnotation;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricRegistryTest.java`
#### Snippet
```java
    @Inject
    @RegistryScope(scope = MetricRegistry.BASE_SCOPE)
    private MetricRegistry baseMetrics;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricRegistryTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry metrics;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricRegistryTest.java`
#### Snippet
```java
    @Inject
    @RegistryType(type = MetricRegistry.Type.BASE)
    private MetricRegistry baseMetrics_RegistryType;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricRegistryTest.java`
#### Snippet
```java
    @Inject
    @RegistryType(type = MetricRegistry.Type.APPLICATION)
    private MetricRegistry applicationMetrics_RegistryType;

    @Deployment
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricRegistryTest.java`
#### Snippet
```java
    @Inject
    @RegistryScope(scope = CUSTOM_SCOPE)
    private MetricRegistry customScope;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricRegistryTest.java`
#### Snippet
```java
    @Inject
    @RegistryType(type = MetricRegistry.Type.VENDOR)
    private MetricRegistry vendorMetrics_RegistryType;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricRegistryTest.java`
#### Snippet
```java
    @Inject
    @RegistryScope(scope = MetricRegistry.VENDOR_SCOPE)
    private MetricRegistry vendorMetrics;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimerFieldBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TimerTagFieldBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CounterFieldBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry metrics;

    private static Histogram histogramLong = null;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramTest.java`
#### Snippet
```java

    @Inject
    private Histogram histogramInt;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/stereotype/StereotypeCountedClassBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry metricRegistry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/ApplicationScopedTimedMethodBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/GaugeTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry metrics;

    private final AtomicInteger value = new AtomicInteger(0);
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanLookupTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TimedTagMethodBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MetricAppBean2.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Counted(name = "countMe2", absolute = true)
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/HistogramTagFieldBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/OverloadedTimedMethodBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/GaugeTagMethodBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodTagBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedClassBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/multipleinstances/MultipleBeanInstancesTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/DefaultNameMetricMethodBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/MetricIDTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Deployment
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/MultipleMetricsMethodBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MetricAppBeanOptional.java`
#### Snippet
```java

    @Inject
    private MetricRegistry metrics;

    @GET
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimerTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    private static Timer globalTimer = null;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/GaugeMethodBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Ambiguous dependency: there are multiple beans that match the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/GaugeMethodBeanTest.java`
#### Snippet
```java

    @Inject
    private GaugeMethodBean bean;

    @Before
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedGaugeMethodBeanTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TagsTest.java`
#### Snippet
```java

    @Inject
    private MetricRegistry registry;

    @Deployment
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MetricAppBean.java`
#### Snippet
```java

    @Inject
    private MetricRegistry metrics;

    public void countMe() {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MetricAppBeanOptional.java`
#### Snippet
```java
                asyncResponse.resume("This is a GET request with AsyncResponse");
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        });
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java
                if (tmp[2].startsWith(promName)) {
                    found = true;
                    assertEquals("Expected [" + mm.toString() + "] got [" + line + "]", tmp[3], mm.type);
                }
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java
                }
            }
            assertTrue("Not found [" + mm.toString() + "]", found);

        }
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MpMetricTest.java`
#### Snippet
```java
         */
        resp.then().statusCode(200)
                /**
                 * COUNTERS
                 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MpMetricTest.java`
#### Snippet
```java
                .body(containsString(
                        "org_eclipse_microprofile_metrics_test_MetricAppBean_taggedCounter_total{mp_scope=\"application\",number=\"two\",tier=\"integration\"} 0"))
                /**
                 * GAUGES
                 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MpMetricOptionalTest.java`
#### Snippet
```java
    @RunAsClient
    @InSequence(15)
    /**
     * This test checks that all elapsed times are not 0 and that all counts are 1 (or 2 if it belongs to the the
     * REST.request metric assosciated to the "getNoParam" endpoint as it was requested twice)
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/GaugeTest.java`
#### Snippet
```java

    public void gaugeMe() {
        metrics.gauge("tck.gaugetest.supplierGaugeManual", value::getAndIncrement, null);

        metrics.gauge("tck.gaugetest.toDoubleFunctionGaugeManual", value,
```

### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/GaugeTest.java`
#### Snippet
```java
                    AtomicInteger myAtomicInteger = (AtomicInteger) atomicInteger;
                    return myAtomicInteger.getAndIncrement();
                }, null);

    }
```

### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricID.java`
#### Snippet
```java
     */
    public MetricID(String name) {
        this(name, null);
    }

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `tags == null` is always `false`
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java
            mm.optional = Boolean.parseBoolean(metric.getAttribute("optional"));
            String tags = metric.getAttribute("tags");
            if (!(tags == null || tags.length() == 0)) {
                for (String tag : tags.split(",")) {
                    String[] str = tag.split("=");
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedClassBeanTest.java`
#### Snippet
```java
                    CONSTRUCTOR_NAME);

    private static Set<MetricID> timerMIDs;

    // toString is overridden just to be able to trigger instantiation of the bean by calling it
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `GaugeInjectionBean.getGauge()` is ignored
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/GaugeInjectionBeanTest.java`
#### Snippet
```java
        // explicitly
        // as only a proxy gets injected otherwise
        bean.getGauge();
    }

```

### IgnoreResultOfCall
Result of `ApplicationScopedTimedMethodBean.toString()` is ignored
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/ApplicationScopedTimedMethodBeanTest.java`
#### Snippet
```java
        // Let's trigger the instantiation of the application scoped bean explicitly
        // as only a proxy gets injected otherwise
        bean.toString();
        /*
         * The MetricID relies on the MicroProfile Config API. Running a managed arquillian container will result with
```

### IgnoreResultOfCall
Result of `GaugeTagMethodBean.getGaugeOne()` is ignored
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/GaugeTagMethodBeanTest.java`
#### Snippet
```java
        // Let's trigger the instantiation of the application scoped bean explicitly
        // as only a proxy gets injected otherwise
        bean.getGaugeOne();
        bean.getGaugeTwo();
        /*
```

### IgnoreResultOfCall
Result of `GaugeTagMethodBean.getGaugeTwo()` is ignored
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/GaugeTagMethodBeanTest.java`
#### Snippet
```java
        // as only a proxy gets injected otherwise
        bean.getGaugeOne();
        bean.getGaugeTwo();
        /*
         * The MetricID relies on the MicroProfile Config API. Running a managed arquillian container will result with
```

### IgnoreResultOfCall
Result of `TimedClassBean.toString()` is ignored
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedClassBeanTest.java`
#### Snippet
```java
        // explicitly
        // as only a proxy gets injected otherwise
        bean.toString();
        /*
         * The MetricID relies on the MicroProfile Config API. Running a managed arquillian container will result with
```

### IgnoreResultOfCall
Result of `MultipleMetricsMethodBean.toString()` is ignored
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/MultipleMetricsMethodBeanTest.java`
#### Snippet
```java
        // explicitly
        // as only a proxy gets injected otherwise
        bean.toString();
    }

```

### IgnoreResultOfCall
Result of `GaugeMethodBean.getGauge()` is ignored
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/GaugeMethodBeanTest.java`
#### Snippet
```java
        // Let's trigger the instantiation of the application scoped bean explicitly
        // as only a proxy gets injected otherwise
        bean.getGauge();
        /*
         * The MetricID relies on the MicroProfile Config API. Running a managed arquillian container will result with
```

### IgnoreResultOfCall
Result of `InheritedParentGaugeMethodBean.getGauge()` is ignored
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedGaugeMethodBeanTest.java`
#### Snippet
```java
        // explicitly
        // as only a proxy gets injected otherwise
        pBean.getGauge();
        bean.getChildGauge();

```

### IgnoreResultOfCall
Result of `InheritedChildGaugeMethodBean.getChildGauge()` is ignored
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedGaugeMethodBeanTest.java`
#### Snippet
```java
        // as only a proxy gets injected otherwise
        pBean.getGauge();
        bean.getChildGauge();

        /*
```

