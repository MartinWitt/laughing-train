# microprofile-metrics 
 
# Bad smells
I found 279 bad smells with 18 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| MissortedModifiers | 59 | false |
| EmptyMethod | 49 | false |
| UnnecessaryFullyQualifiedName | 37 | false |
| AssignmentToStaticFieldFromInstanceMethod | 36 | false |
| DynamicRegexReplaceableByCompiledPattern | 18 | false |
| JUnitMalformedDeclaration | 11 | false |
| UnnecessaryModifier | 9 | true |
| IgnoreResultOfCall | 9 | false |
| RegExpRedundantEscape | 8 | false |
| DeprecatedIsStillUsed | 5 | false |
| SystemOutErr | 4 | false |
| Convert2Lambda | 4 | false |
| RedundantFieldInitialization | 4 | false |
| UnnecessaryToStringCall | 3 | true |
| UnnecessaryLocalVariable | 3 | true |
| NullArgumentToVariableArgMethod | 3 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| BoundedWildcard | 2 | false |
| StringEqualsEmptyString | 2 | false |
| UnnecessaryUnboxing | 2 | false |
| CommentedOutCode | 1 | false |
| CatchMayIgnoreException | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| RedundantSuppression | 1 | false |
| DefaultAnnotationParam | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| CodeBlock2Expr | 1 | true |
| ReturnNull | 1 | false |
| ConstantValue | 1 | false |
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
Deprecated member 'VENDOR' is still used
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
         */
        @Deprecated
        VENDOR("vendor");

        private final String name;
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `timerOneMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TimedTagMethodBeanTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        timerOneMID = new MetricID(TIMER_NAME, NUMBER_ONE_TAG);
        timerTwoMID = new MetricID(TIMER_NAME, NUMBER_TWO_TAG);

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `timerTwoMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TimedTagMethodBeanTest.java`
#### Snippet
```java
         */
        timerOneMID = new MetricID(TIMER_NAME, NUMBER_ONE_TAG);
        timerTwoMID = new MetricID(TIMER_NAME, NUMBER_TWO_TAG);

    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `counterOneMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodTagBeanTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        counterOneMID = new MetricID(COUNTER_NAME, NUMBER_ONE_TAG);
        counterTwoMID = new MetricID(COUNTER_NAME, NUMBER_TWO_TAG);
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `counterTwoMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodTagBeanTest.java`
#### Snippet
```java
         */
        counterOneMID = new MetricID(COUNTER_NAME, NUMBER_ONE_TAG);
        counterTwoMID = new MetricID(COUNTER_NAME, NUMBER_TWO_TAG);
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `counterMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        counterMID = new MetricID(COUNTER_NAME_NO_TAG);
        counterTwoMID = new MetricID(COUNTER_NAME, NUMBER_TWO_TAG, COLOUR_RED_TAG);
        counterThreeMID = new MetricID(COUNTER_NAME, NUMBER_THREE_TAG, COLOUR_BLUE_TAG);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `counterTwoMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java
         */
        counterMID = new MetricID(COUNTER_NAME_NO_TAG);
        counterTwoMID = new MetricID(COUNTER_NAME, NUMBER_TWO_TAG, COLOUR_RED_TAG);
        counterThreeMID = new MetricID(COUNTER_NAME, NUMBER_THREE_TAG, COLOUR_BLUE_TAG);
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `counterThreeMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java
        counterMID = new MetricID(COUNTER_NAME_NO_TAG);
        counterTwoMID = new MetricID(COUNTER_NAME, NUMBER_TWO_TAG, COLOUR_RED_TAG);
        counterThreeMID = new MetricID(COUNTER_NAME, NUMBER_THREE_TAG, COLOUR_BLUE_TAG);
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `gaugeOneMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/GaugeTagMethodBeanTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        gaugeOneMID = new MetricID(GAUGE_NAME, NUMBER_ONE_TAG);
        gaugeTwoMID = new MetricID(GAUGE_NAME, NUMBER_TWO_TAG);
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `gaugeTwoMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/GaugeTagMethodBeanTest.java`
#### Snippet
```java
         */
        gaugeOneMID = new MetricID(GAUGE_NAME, NUMBER_ONE_TAG);
        gaugeTwoMID = new MetricID(GAUGE_NAME, NUMBER_TWO_TAG);
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `histogramOneMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/HistogramTagFieldBeanTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        histogramOneMID = new MetricID(HISTOGRAM_NAME, NUMBER_ONE_TAG);
        histogramTwoMID = new MetricID(HISTOGRAM_NAME, NUMBER_TWO_TAG);
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `histogramTwoMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/HistogramTagFieldBeanTest.java`
#### Snippet
```java
         */
        histogramOneMID = new MetricID(HISTOGRAM_NAME, NUMBER_ONE_TAG);
        histogramTwoMID = new MetricID(HISTOGRAM_NAME, NUMBER_TWO_TAG);
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `globalTimer` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimerTest.java`
#### Snippet
```java
        }

        globalTimer = registry.timer("test.longData.timer");

        for (long i : SAMPLE_LONG_DATA) {
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `isInitialized` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimerTest.java`
#### Snippet
```java
            globalTimer.update(Duration.ofNanos(i));
        }
        isInitialized = true;
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `constructorMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedClassBeanTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        constructorMID = new MetricID(CONSTRUCTOR_TIMER_NAME);
        timerMIDs = MetricsUtil.createMetricIDs(TIMER_NAMES);

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `timerMIDs` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedClassBeanTest.java`
#### Snippet
```java
         */
        constructorMID = new MetricID(CONSTRUCTOR_TIMER_NAME);
        timerMIDs = MetricsUtil.createMetricIDs(TIMER_NAMES);

        timerMIDsIncludingToString = new HashSet<>();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `timerMIDsIncludingToString` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedClassBeanTest.java`
#### Snippet
```java
        timerMIDs = MetricsUtil.createMetricIDs(TIMER_NAMES);

        timerMIDsIncludingToString = new HashSet<>();
        timerMIDsIncludingToString.addAll(timerMIDs);
        timerMIDsIncludingToString.addAll(MetricsUtil.createMetricIDs(
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `timerMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        timerMID = new MetricID(TIMER_NAME);
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `counterMetricID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        counterMetricID = new MetricID(COUNTER_NAME);
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `gaugeMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/GaugeMethodBeanTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        gaugeMID = new MetricID(GAUGE_NAME);
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `parentMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedGaugeMethodBeanTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        parentMID = new MetricID(PARENT_GAUGE_NAME);
        childMID = new MetricID(CHILD_GAUGE_NAME);
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `childMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedGaugeMethodBeanTest.java`
#### Snippet
```java
         */
        parentMID = new MetricID(PARENT_GAUGE_NAME);
        childMID = new MetricID(CHILD_GAUGE_NAME);
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `timerMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedConstructorBeanTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        timerMID = new MetricID(TIMER_NAME);
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `histogramMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramFieldBeanTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        histogramMID = new MetricID(HISTOGRAM_NAME);
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `timerMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteTimedBeanTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        timerMID = new MetricID(TIMED_NAME);
        extendedTimedMID = new MetricID(EXTENDED_TIMED_NAME);
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `extendedTimedMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteTimedBeanTest.java`
#### Snippet
```java
         */
        timerMID = new MetricID(TIMED_NAME);
        extendedTimedMID = new MetricID(EXTENDED_TIMED_NAME);
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `constructorMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedClassBeanTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        constructorMID = new MetricID(CONSTRUCTOR_COUNTER_NAME);
        counterMIDs = MetricsUtil.createMetricIDs(COUNTER_NAMES);
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `counterMIDs` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedClassBeanTest.java`
#### Snippet
```java
         */
        constructorMID = new MetricID(CONSTRUCTOR_COUNTER_NAME);
        counterMIDs = MetricsUtil.createMetricIDs(COUNTER_NAMES);
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `timedMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteExtendedTimedBeanTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        timedMID = new MetricID(TIMED_NAME);
        extendedTimedMID = new MetricID(EXTENDED_TIMED_NAME);
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `extendedTimedMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteExtendedTimedBeanTest.java`
#### Snippet
```java
         */
        timedMID = new MetricID(TIMED_NAME);
        extendedTimedMID = new MetricID(EXTENDED_TIMED_NAME);
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `counterMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CounterFieldBeanTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        counterMID = new MetricID(COUNTER_NAME);
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `timerOneMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TimerTagFieldBeanTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        timerOneMID = new MetricID(TIMER_NAME, NUMBER_ONE_TAG);
        timerTwoMID = new MetricID(TIMER_NAME, NUMBER_TWO_TAG);

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `timerTwoMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TimerTagFieldBeanTest.java`
#### Snippet
```java
         */
        timerOneMID = new MetricID(TIMER_NAME, NUMBER_ONE_TAG);
        timerTwoMID = new MetricID(TIMER_NAME, NUMBER_TWO_TAG);

    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `histogramLong` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramTest.java`
#### Snippet
```java
        }

        histogramLong = metrics.histogram("test.longData.histogram");
        for (int i : SAMPLE_INT_DATA) {
            histogramInt.update(i);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `isInitialized` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramTest.java`
#### Snippet
```java
            histogramLong.update(i);
        }
        isInitialized = true;
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `timerMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanLookupTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        timerMID = new MetricID(TIMER_NAME);
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `timerMID` from instance context
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/ApplicationScopedTimedMethodBeanTest.java`
#### Snippet
```java
         * This will cause client instantiated MetricIDs to throw an exception. (i.e the global MetricIDs)
         */
        timerMID = new MetricID(TIMER_NAME);
    }

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
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MpMetricOptionalTest.java`
#### Snippet
```java

    private static String filterOutAppLabelOpenMetrics(String responseBody) {
        return responseBody.replaceAll(PROM_APP_LABEL_REGEX, "").replaceAll("\\{,", "{").replaceAll(",\\}", "}");
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`tags.length() == 0` can be replaced with 'tags.isEmpty()'
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java
            mm.optional = Boolean.parseBoolean(metric.getAttribute("optional"));
            String tags = metric.getAttribute("tags");
            if (!(tags == null || tags.length() == 0)) {
                for (String tag : tags.split(",")) {
                    String[] str = tag.split("=");
```

### SizeReplaceableByIsEmpty
`value.length() > 0` can be replaced with '!value.isEmpty()'
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MpMetricOptionalTest.java`
#### Snippet
```java
        String value = elements[elements.length - 1];
        assertNotNull(value);
        assertThat("Expected value to be not empty", value.length() > 0);
        return Double.parseDouble(value);

```

## RuleId[id=UnnecessaryToStringCall]
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

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `Snapshot` has no concrete subclass
in `api/src/main/java/org/eclipse/microprofile/metrics/Snapshot.java`
#### Snippet
```java
 * A statistical snapshot of a {@link Snapshot}.
 */
public abstract class Snapshot {

    /**
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super T`
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/LambdaMatcher.java`
#### Snippet
```java
    private final String description;

    public LambdaMatcher(Function<T, Boolean> matcher,
            String description) {
        this.matcher = matcher;
```

### BoundedWildcard
Can generalize to `? extends T`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBean.java`
#### Snippet
```java

    @Counted(name = "countedMethod", absolute = true)
    public T countedMethod(Callable<T> callable) {
        try {
            return callable.call();
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TimedTagMethodBeanTest.java`
#### Snippet
```java

    private final static Tag NUMBER_ONE_TAG = new Tag("number", "one");
    private final static Tag NUMBER_TWO_TAG = new Tag("number", "two");

    private static MetricID timerOneMID;
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TimedTagMethodBeanTest.java`
#### Snippet
```java
public class TimedTagMethodBeanTest {

    private final static String TIMER_NAME = MetricRegistry.name(TimedTagMethodBean.class, "timedMethod");

    private final static Tag NUMBER_ONE_TAG = new Tag("number", "one");
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TimedTagMethodBeanTest.java`
#### Snippet
```java
    private final static String TIMER_NAME = MetricRegistry.name(TimedTagMethodBean.class, "timedMethod");

    private final static Tag NUMBER_ONE_TAG = new Tag("number", "one");
    private final static Tag NUMBER_TWO_TAG = new Tag("number", "two");

```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodTagBeanTest.java`
#### Snippet
```java
    private final static String COUNTER_NAME = "countedMethod";

    private final static Tag NUMBER_ONE_TAG = new Tag("number", "one");
    private final static Tag NUMBER_TWO_TAG = new Tag("number", "two");

```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodTagBeanTest.java`
#### Snippet
```java

    private final static Tag NUMBER_ONE_TAG = new Tag("number", "one");
    private final static Tag NUMBER_TWO_TAG = new Tag("number", "two");

    private static MetricID counterOneMID;
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodTagBeanTest.java`
#### Snippet
```java
public class CountedMethodTagBeanTest {

    private final static String COUNTER_NAME = "countedMethod";

    private final static Tag NUMBER_ONE_TAG = new Tag("number", "one");
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/OverloadedTimedMethodBeanTest.java`
#### Snippet
```java
public class OverloadedTimedMethodBeanTest {

    private final static String[] TIMER_NAMES =
            {"overloadedTimedMethodWithNoArguments", "overloadedTimedMethodWithStringArgument",
                    "overloadedTimedMethodWithListOfStringArgument", "overloadedTimedMethodWithObjectArgument"};
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java
    private final static Tag NUMBER_THREE_TAG = new Tag("number", "three");

    private final static Tag COLOUR_RED_TAG = new Tag("colour", "red");
    private final static Tag COLOUR_BLUE_TAG = new Tag("colour", "blue");

```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java
    private final static String COUNTER_NAME_NO_TAG =
            MetricRegistry.name(CounterFieldTagBean.class, "counterNameNoTag");
    private final static String COUNTER_NAME = MetricRegistry.name(CounterFieldTagBean.class, "counterName");

    private final static Tag NUMBER_TWO_TAG = new Tag("number", "two");
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java
public class CounterFieldTagBeanTest {

    private final static String COUNTER_NAME_NO_TAG =
            MetricRegistry.name(CounterFieldTagBean.class, "counterNameNoTag");
    private final static String COUNTER_NAME = MetricRegistry.name(CounterFieldTagBean.class, "counterName");
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java

    private final static Tag NUMBER_TWO_TAG = new Tag("number", "two");
    private final static Tag NUMBER_THREE_TAG = new Tag("number", "three");

    private final static Tag COLOUR_RED_TAG = new Tag("colour", "red");
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java

    private final static Tag COLOUR_RED_TAG = new Tag("colour", "red");
    private final static Tag COLOUR_BLUE_TAG = new Tag("colour", "blue");

    private static MetricID counterMID;
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/CounterFieldTagBeanTest.java`
#### Snippet
```java
    private final static String COUNTER_NAME = MetricRegistry.name(CounterFieldTagBean.class, "counterName");

    private final static Tag NUMBER_TWO_TAG = new Tag("number", "two");
    private final static Tag NUMBER_THREE_TAG = new Tag("number", "three");

```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/GaugeTagMethodBeanTest.java`
#### Snippet
```java
public class GaugeTagMethodBeanTest {

    private final static String GAUGE_NAME = MetricRegistry.name(GaugeTagMethodBean.class, "gaugeMethod");

    private final static Tag NUMBER_ONE_TAG = new Tag("number", "one");
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/GaugeTagMethodBeanTest.java`
#### Snippet
```java

    private final static Tag NUMBER_ONE_TAG = new Tag("number", "one");
    private final static Tag NUMBER_TWO_TAG = new Tag("number", "two");

    private static MetricID gaugeOneMID;
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/GaugeTagMethodBeanTest.java`
#### Snippet
```java
    private final static String GAUGE_NAME = MetricRegistry.name(GaugeTagMethodBean.class, "gaugeMethod");

    private final static Tag NUMBER_ONE_TAG = new Tag("number", "one");
    private final static Tag NUMBER_TWO_TAG = new Tag("number", "two");

```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/HistogramTagFieldBeanTest.java`
#### Snippet
```java
public class HistogramTagFieldBeanTest {

    private final static String HISTOGRAM_NAME = MetricRegistry.name(HistogramTagFieldBean.class, "histogramName");

    private final static Tag NUMBER_ONE_TAG = new Tag("number", "one");
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/HistogramTagFieldBeanTest.java`
#### Snippet
```java
    private final static String HISTOGRAM_NAME = MetricRegistry.name(HistogramTagFieldBean.class, "histogramName");

    private final static Tag NUMBER_ONE_TAG = new Tag("number", "one");
    private final static Tag NUMBER_TWO_TAG = new Tag("number", "two");

```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/HistogramTagFieldBeanTest.java`
#### Snippet
```java

    private final static Tag NUMBER_ONE_TAG = new Tag("number", "one");
    private final static Tag NUMBER_TWO_TAG = new Tag("number", "two");

    private static MetricID histogramOneMID;
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimerTest.java`
#### Snippet
```java
    private static boolean isInitialized = false;

    final static long[] SAMPLE_LONG_DATA = {0, 10, 20, 20, 20, 30, 30, 30, 30, 30, 40, 50, 50, 60, 70, 70, 70, 80, 90,
            90, 100, 110, 110, 120, 120, 120, 120, 130, 130, 130, 130, 140, 140, 150, 150, 170, 180, 180, 200, 200, 200,
            210, 220, 220, 220, 240, 240, 250, 250, 270, 270, 270, 270, 270, 270, 270, 280, 280, 290, 300, 310, 310,
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanTest.java`
#### Snippet
```java
public class TimedMethodBeanTest {

    private final static String TIMER_NAME = MetricRegistry.name(TimedMethodBean2.class, "timedMethod");

    private static MetricID timerMID;
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanTest.java`
#### Snippet
```java
    private static MetricID timerMID;

    private final static AtomicLong TIMER_COUNT = new AtomicLong();

    @Deployment
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/DefaultNameMetricMethodBeanTest.java`
#### Snippet
```java
            {"defaultNameCountedMethod", "defaultNameTimedMethod"};

    private final static String[] ABSOLUTE_METRIC_NAMES =
            {"absoluteDefaultNameCountedMethod", "absoluteDefaultNameTimedMethod"};

```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/DefaultNameMetricMethodBeanTest.java`
#### Snippet
```java
public class DefaultNameMetricMethodBeanTest {

    private final static String[] METRIC_NAMES =
            {"defaultNameCountedMethod", "defaultNameTimedMethod"};

```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/MultipleMetricsMethodBeanTest.java`
#### Snippet
```java
public class MultipleMetricsMethodBeanTest {

    private final static String[] METRIC_NAMES = {"counter", "gauge", "timer"};

    private Set<String> absoluteMetricNames() {
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java
    private static MetricID counterMetricID; // new MetricID(COUNTER_NAME);

    private final static AtomicLong COUNTER_COUNT = new AtomicLong();

    @Deployment
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java
public class CountedMethodBeanTest {

    private final static String COUNTER_NAME = "countedMethod";
    private static MetricID counterMetricID; // new MetricID(COUNTER_NAME);

```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/GaugeMethodBeanTest.java`
#### Snippet
```java
public class GaugeMethodBeanTest {

    private final static String GAUGE_NAME = MetricRegistry.name(GaugeMethodBean.class, "gaugeMethod");

    private static MetricID gaugeMID;
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedGaugeMethodBeanTest.java`
#### Snippet
```java
public class InheritedGaugeMethodBeanTest {

    private final static String PARENT_GAUGE_NAME =
            MetricRegistry.name(InheritedParentGaugeMethodBean.class, "inheritedParentGaugeMethod");
    private final static String CHILD_GAUGE_NAME =
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedGaugeMethodBeanTest.java`
#### Snippet
```java
    private final static String PARENT_GAUGE_NAME =
            MetricRegistry.name(InheritedParentGaugeMethodBean.class, "inheritedParentGaugeMethod");
    private final static String CHILD_GAUGE_NAME =
            MetricRegistry.name(InheritedChildGaugeMethodBean.class, "inheritedChildGaugeMethod");

```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedConstructorBeanTest.java`
#### Snippet
```java
public class TimedConstructorBeanTest {

    private final static String TIMER_NAME = MetricRegistry.name(TimedConstructorBean.class, "timedConstructor");

    private static MetricID timerMID;
```

### MissortedModifiers
Missorted modifiers `static public`
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/ReusedMetricsTest.java`
#### Snippet
```java

    @BeforeClass
    static public void setup() throws MalformedURLException {
        // set base URI and port number to use for all requests
        String serverUrl = System.getProperty("test.url");
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramFieldBeanTest.java`
#### Snippet
```java
public class HistogramFieldBeanTest {

    private final static String HISTOGRAM_NAME = MetricRegistry.name(HistogramFieldBean.class, "histogramName");
    private static MetricID histogramMID;

```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteTimedBeanTest.java`
#### Snippet
```java

    private final static String TIMED_NAME = MetricRegistry.name(ConcreteTimedBean.class, "timedMethod");
    private final static String EXTENDED_TIMED_NAME =
            MetricRegistry.name(ConcreteTimedBean.class, "normallyNotTimedMethod");

```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteTimedBeanTest.java`
#### Snippet
```java
public class ConcreteTimedBeanTest {

    private final static String TIMED_NAME = MetricRegistry.name(ConcreteTimedBean.class, "timedMethod");
    private final static String EXTENDED_TIMED_NAME =
            MetricRegistry.name(ConcreteTimedBean.class, "normallyNotTimedMethod");
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteExtendedTimedBeanTest.java`
#### Snippet
```java
public class ConcreteExtendedTimedBeanTest {

    private final static String TIMED_NAME = MetricRegistry.name(ConcreteExtendedTimedBean.class, "timedMethod");
    private final static String EXTENDED_TIMED_NAME =
            MetricRegistry.name(ConcreteExtendedTimedBean.class, "anotherTimedMethod");
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteExtendedTimedBeanTest.java`
#### Snippet
```java

    private final static String TIMED_NAME = MetricRegistry.name(ConcreteExtendedTimedBean.class, "timedMethod");
    private final static String EXTENDED_TIMED_NAME =
            MetricRegistry.name(ConcreteExtendedTimedBean.class, "anotherTimedMethod");

```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimerFieldBeanTest.java`
#### Snippet
```java
public class TimerFieldBeanTest {

    private final static String[] METRIC_NAMES =
            {"timerWithoutAnnotation", "timerWithExplicitNonAbsoluteName", "timerWithNoName", "timerName"};

```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimerFieldBeanTest.java`
#### Snippet
```java
            {"timerWithoutAnnotation", "timerWithExplicitNonAbsoluteName", "timerWithNoName", "timerName"};

    private final static String[] ABSOLUTE_METRIC_NAMES = {"timerWithAbsoluteDefaultName", "timerAbsoluteName"};

    private Set<String> metricNames() {
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CounterFieldBeanTest.java`
#### Snippet
```java
public class CounterFieldBeanTest {

    private final static String COUNTER_NAME = MetricRegistry.name(CounterFieldBean.class, "counterName");

    private static MetricID counterMID;
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TimerTagFieldBeanTest.java`
#### Snippet
```java

    private final static Tag NUMBER_ONE_TAG = new Tag("number", "one");
    private final static Tag NUMBER_TWO_TAG = new Tag("number", "two");

    private static MetricID timerOneMID;
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TimerTagFieldBeanTest.java`
#### Snippet
```java
public class TimerTagFieldBeanTest {

    private final static String TIMER_NAME = "timerName";

    private final static Tag NUMBER_ONE_TAG = new Tag("number", "one");
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TimerTagFieldBeanTest.java`
#### Snippet
```java
    private final static String TIMER_NAME = "timerName";

    private final static Tag NUMBER_ONE_TAG = new Tag("number", "one");
    private final static Tag NUMBER_TWO_TAG = new Tag("number", "two");

```

### MissortedModifiers
Missorted modifiers `static public`
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java

    @BeforeClass
    static public void setup() throws MalformedURLException {
        // set base URI and port number to use for all requests
        String serverUrl = System.getProperty("test.url");
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramTest.java`
#### Snippet
```java
            96, 96, 96, 96, 97, 97, 97, 97, 98, 98, 98, 99, 99};

    final static long[] SAMPLE_LONG_DATA = {0, 10, 20, 20, 20, 30, 30, 30, 30, 30, 40, 50, 50, 60, 70, 70, 70, 80, 90,
            90, 100, 110, 110, 120, 120, 120, 120, 130, 130, 130, 130, 140, 140, 150, 150, 170, 180, 180, 200, 200, 200,
            210, 220, 220, 220, 240, 240, 250, 250, 270, 270, 270, 270, 270, 270, 270, 280, 280, 290, 300, 310, 310,
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramTest.java`
#### Snippet
```java

    private static boolean isInitialized = false;
    final static int[] SAMPLE_INT_DATA = {0, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 5, 5, 6, 7, 7, 7, 8, 9, 9, 10, 11, 11, 12,
            12,
            12, 12, 13, 13, 13, 13, 14, 14, 15, 15, 17, 18, 18, 20, 20, 20, 21, 22, 22, 22, 24, 24, 25, 25, 27, 27, 27,
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanLookupTest.java`
#### Snippet
```java
    private static MetricID timerMID;

    private final static AtomicLong TIMER_COUNT = new AtomicLong();

    @Deployment
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedMethodBeanLookupTest.java`
#### Snippet
```java
public class TimedMethodBeanLookupTest {

    private final static String TIMER_NAME = MetricRegistry.name(TimedMethodBean1.class, "timedMethod");

    private static MetricID timerMID;
```

### MissortedModifiers
Missorted modifiers `final static`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/ApplicationScopedTimedMethodBeanTest.java`
#### Snippet
```java
public class ApplicationScopedTimedMethodBeanTest {

    private final static String TIMER_NAME =
            MetricRegistry.name(ApplicationScopedTimedMethodBean.class, "applicationScopedTimedMethod");
    private static MetricID timerMID;
```

### MissortedModifiers
Missorted modifiers `final @Context`
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MetricAppBeanOptional.java`
#### Snippet
```java
    @Path("/get-context-params")
    public String getContextParams(
            final @Context HttpHeaders httpheaders,
            final @Context Request request,
            final @Context UriInfo uriInfo,
```

### MissortedModifiers
Missorted modifiers `final @Context`
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MetricAppBeanOptional.java`
#### Snippet
```java
    public String getContextParams(
            final @Context HttpHeaders httpheaders,
            final @Context Request request,
            final @Context UriInfo uriInfo,
            final @Context ResourceContext resourceContext,
```

### MissortedModifiers
Missorted modifiers `final @Context`
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MetricAppBeanOptional.java`
#### Snippet
```java
            final @Context HttpHeaders httpheaders,
            final @Context Request request,
            final @Context UriInfo uriInfo,
            final @Context ResourceContext resourceContext,
            final @Context Providers providers,
```

### MissortedModifiers
Missorted modifiers `final @Context`
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MetricAppBeanOptional.java`
#### Snippet
```java
            final @Context Request request,
            final @Context UriInfo uriInfo,
            final @Context ResourceContext resourceContext,
            final @Context Providers providers,
            final @Context Application application,
```

### MissortedModifiers
Missorted modifiers `final @Context`
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MetricAppBeanOptional.java`
#### Snippet
```java
            final @Context UriInfo uriInfo,
            final @Context ResourceContext resourceContext,
            final @Context Providers providers,
            final @Context Application application,
            final @Context SecurityContext securityContext,
```

### MissortedModifiers
Missorted modifiers `final @Context`
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MetricAppBeanOptional.java`
#### Snippet
```java
            final @Context ResourceContext resourceContext,
            final @Context Providers providers,
            final @Context Application application,
            final @Context SecurityContext securityContext,
            final @Context Configuration configuration) throws Exception {
```

### MissortedModifiers
Missorted modifiers `final @Context`
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MetricAppBeanOptional.java`
#### Snippet
```java
            final @Context Providers providers,
            final @Context Application application,
            final @Context SecurityContext securityContext,
            final @Context Configuration configuration) throws Exception {

```

### MissortedModifiers
Missorted modifiers `final @Context`
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MetricAppBeanOptional.java`
#### Snippet
```java
            final @Context Application application,
            final @Context SecurityContext securityContext,
            final @Context Configuration configuration) throws Exception {

        return "This is a GET request with context parameters";
```

### MissortedModifiers
Missorted modifiers `static public`
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MpMetricOptionalTest.java`
#### Snippet
```java

    @BeforeClass
    static public void setup() throws MalformedURLException {
        // set base URI and port number to use for all requests
        String serverUrl = System.getProperty("test.url");
```

### MissortedModifiers
Missorted modifiers `static public`
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MpMetricTest.java`
#### Snippet
```java

    @BeforeClass
    static public void setup() throws MalformedURLException {
        // set base URI and port number to use for all requests
        String serverUrl = System.getProperty("test.url");
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `api/src/main/java/org/eclipse/microprofile/metrics/MetadataBuilder.java`
#### Snippet
```java
     */
    public MetadataBuilder withDescription(String description) {
        this.description = "".equals(description) ? null : description;
        return this;
    }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `api/src/main/java/org/eclipse/microprofile/metrics/MetadataBuilder.java`
#### Snippet
```java
    public MetadataBuilder withName(String name) {
        this.name = Objects.requireNonNull(name, "name is required");
        if ("".equals(name)) {
            throw new IllegalArgumentException("Name must not be empty");
        }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    <T extends Metric> SortedMap<MetricID, T> getMetrics(Class<T> ofType, MetricFilter filter);

    /**
```

## RuleId[id=IgnoreResultOfCall]
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
Result of `GaugeInjectionBean.getGauge()` is ignored
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/GaugeInjectionBeanTest.java`
#### Snippet
```java
        // explicitly
        // as only a proxy gets injected otherwise
        bean.getGauge();
    }

```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java
        WebArchive jar = ShrinkWrap.create(WebArchive.class).addAsWebInfResource("META-INF/beans.xml", "beans.xml");

        System.out.println(jar.toString(true));
        return jar;
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MetricAppBeanOptional.java`
#### Snippet
```java
                asyncResponse.resume("This is a GET request with AsyncResponse");
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        });
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MpMetricOptionalTest.java`
#### Snippet
```java
                .addAsWebInfResource("META-INF/beans.xml", "beans.xml");

        System.out.println(jar.toString(true));
        return jar;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MpMetricTest.java`
#### Snippet
```java
                .addAsWebInfResource("META-INF/beans.xml", "beans.xml");

        System.out.println(jar.toString(true));
        return jar;
    }
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java
                final String value = gcTimeTotalPattern.matcher(line).replaceAll("$2");
                Assert.assertTrue("gc.time.seconds.total value should be numeric and not negative",
                        Double.valueOf(value).doubleValue() >= 0);

                found = true;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java
                final String value = gcTotalPattern.matcher(line).replaceAll("$2");
                Assert.assertTrue("gc.total value should be numeric and not negative",
                        Double.valueOf(value).doubleValue() >= 0);

                found = true;
```

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

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/ReusedMetricsTest.java`
#### Snippet
```java
     */
    private static String filterOutAppLabelPromMetrics(String responseBody) {
        return responseBody.replaceAll(OPENMETRICS_APP_LABEL_REGEX, "").replaceAll("\\{,", "{").replaceAll(",\\}",
                "}");
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/ReusedMetricsTest.java`
#### Snippet
```java
     */
    private static String filterOutAppLabelPromMetrics(String responseBody) {
        return responseBody.replaceAll(OPENMETRICS_APP_LABEL_REGEX, "").replaceAll("\\{,", "{").replaceAll(",\\}",
                "}");
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/ReusedMetricsTest.java`
#### Snippet
```java
     */
    private static String filterOutAppLabelPromMetrics(String responseBody) {
        return responseBody.replaceAll(OPENMETRICS_APP_LABEL_REGEX, "").replaceAll("\\{,", "{").replaceAll(",\\}",
                "}");
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java

                final String metricID = gcTimeTotalPattern.matcher(line).replaceAll("$1");
                final String tags = metricID.replaceAll("^gc_time_seconds_total\\{", "").replaceAll("\\}$", "");

                for (String expectedTag : expectedTags) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java

                final String metricID = gcTimeTotalPattern.matcher(line).replaceAll("$1");
                final String tags = metricID.replaceAll("^gc_time_seconds_total\\{", "").replaceAll("\\}$", "");

                for (String expectedTag : expectedTags) {
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java
                    ? nameAndTagsPart.substring(0, nameAndTagsPart.lastIndexOf("{"))
                    : nameAndTagsPart;
            assertFalse("Name has illegal chars " + line, namePart.matches(".*[-.].*"));
            assertFalse("Found __ in " + line, line.matches(".*__.*"));
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java
                    : nameAndTagsPart;
            assertFalse("Name has illegal chars " + line, namePart.matches(".*[-.].*"));
            assertFalse("Found __ in " + line, line.matches(".*__.*"));
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java
     */
    private static String filterOutAppLabelPromMetrics(String responseBody) {
        return responseBody.replaceAll(PROM_APP_LABEL_REGEX, "").replaceAll("\\{,", "{").replaceAll(",\\}", "}");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java
     */
    private static String filterOutAppLabelPromMetrics(String responseBody) {
        return responseBody.replaceAll(PROM_APP_LABEL_REGEX, "").replaceAll("\\{,", "{").replaceAll(",\\}", "}");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java
     */
    private static String filterOutAppLabelPromMetrics(String responseBody) {
        return responseBody.replaceAll(PROM_APP_LABEL_REGEX, "").replaceAll("\\{,", "{").replaceAll(",\\}", "}");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java

                final String metricID = gcTotalPattern.matcher(line).replaceAll("$1");
                final String tags = metricID.replaceAll("^gc_total\\{", "").replaceAll("\\}$", "");

                for (String expectedTag : expectedTags) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MPMetricBaseMetricsTest.java`
#### Snippet
```java

                final String metricID = gcTotalPattern.matcher(line).replaceAll("$1");
                final String tags = metricID.replaceAll("^gc_total\\{", "").replaceAll("\\}$", "");

                for (String expectedTag : expectedTags) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MpMetricOptionalTest.java`
#### Snippet
```java

    private static String filterOutAppLabelOpenMetrics(String responseBody) {
        return responseBody.replaceAll(PROM_APP_LABEL_REGEX, "").replaceAll("\\{,", "{").replaceAll(",\\}", "}");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MpMetricOptionalTest.java`
#### Snippet
```java

    private static String filterOutAppLabelOpenMetrics(String responseBody) {
        return responseBody.replaceAll(PROM_APP_LABEL_REGEX, "").replaceAll("\\{,", "{").replaceAll(",\\}", "}");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/optional/src/main/java/org/eclipse/microprofile/metrics/test/optional/MpMetricOptionalTest.java`
#### Snippet
```java

    private static String filterOutAppLabelOpenMetrics(String responseBody) {
        return responseBody.replaceAll(PROM_APP_LABEL_REGEX, "").replaceAll("\\{,", "{").replaceAll(",\\}", "}");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MpMetricTest.java`
#### Snippet
```java
     */
    private static String filterOutAppLabelPromMetrics(String responseBody) {
        return responseBody.replaceAll(PROM_APP_LABEL_REGEX, "").replaceAll("\\{,", "{").replaceAll(",\\}", "}");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MpMetricTest.java`
#### Snippet
```java
     */
    private static String filterOutAppLabelPromMetrics(String responseBody) {
        return responseBody.replaceAll(PROM_APP_LABEL_REGEX, "").replaceAll("\\{,", "{").replaceAll(",\\}", "}");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MpMetricTest.java`
#### Snippet
```java
     */
    private static String filterOutAppLabelPromMetrics(String responseBody) {
        return responseBody.replaceAll(PROM_APP_LABEL_REGEX, "").replaceAll("\\{,", "{").replaceAll(",\\}", "}");
    }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/metrics/package-info.java`
#### Snippet
```java
 * </pre>
 */
@org.osgi.annotation.versioning.Version("5.0.1")
package org.eclipse.microprofile.metrics;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/Timer.java`
#### Snippet
```java
     * {@link #update(Duration)}.
     *
     * @return the elapsed time {@link java.time.Duration duration}
     */
    Duration getElapsedTime();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/Timer.java`
#### Snippet
```java
     *
     * @param duration
     *            the length of the {@link java.time.Duration duration}
     */
    void update(Duration duration);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.metrics` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/annotation/Timed.java`
#### Snippet
```java
     *
     * @see org.eclipse.microprofile.metrics.Metadata
     * @see org.eclipse.microprofile.metrics.MetricUnits
     */
    @Nonbinding
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/annotation/Gauge.java`
#### Snippet
```java
 * return value as its value.
 *
 * The annotated method/field must be of numeric type (extends {@link java.lang.Number}).
 *
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.metrics` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/annotation/RegistryType.java`
#### Snippet
```java
     * @return Returns the scope of the MetricRegistry. The {@link MetricRegistry.Type} can be {@code APPLICATION},
     *         {@code BASE}, or {@code VENDOR}.
     * @see org.eclipse.microprofile.metrics.MetricRegistry.Type
     */
    MetricRegistry.Type type() default MetricRegistry.Type.APPLICATION;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.metrics` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/annotation/RegistryType.java`
#### Snippet
```java
 * </pre>
 *
 * @see org.eclipse.microprofile.metrics.MetricRegistry.Type
 *
 * @author Raymond Lam
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.metrics` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/annotation/Metric.java`
#### Snippet
```java
     *
     * @see org.eclipse.microprofile.metrics.Metadata
     * @see org.eclipse.microprofile.metrics.MetricUnits
     */
    @Nonbinding
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/metrics/annotation/package-info.java`
#### Snippet
```java
 *
 */
@org.osgi.annotation.versioning.Version("5.0.1")
package org.eclipse.microprofile.metrics.annotation;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.metrics` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/annotation/Counted.java`
#### Snippet
```java
     *
     * @see org.eclipse.microprofile.metrics.Metadata
     * @see org.eclipse.microprofile.metrics.MetricUnits
     */
    @Nonbinding
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     * {@link Metadata} object is already registered with this metric name then that {@link Metadata} will be used.
     *
     * The created {@link Gauge} will return the value that the {@link java.util.function.Supplier Supplier} will
     * provide.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     *
     * @param <T>
     *            A {@link java.lang.Number Number}
     * @param metadata
     *            The metadata of the gauge
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     *            The metadata of the gauge
     * @param supplier
     *            The {@link java.util.function.Supplier Supplier} function that will return the value for the Gauge
     *            metric
     * @param tags
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java

    /**
     * Return the {@link Gauge} of type {@link java.lang.Number Number} registered under the {@link MetricID} with this
     * name and with the provided {@link Tag}s; or create and register this gauge if none is registered.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     * {@link Metadata} object is already registered with this metric name then that {@link Metadata} will be used.
     *
     * The created {@link Gauge} will apply a {@link java.util.function.Function Function} to the provided object to
     * resolve a {@link java.lang.Number Number} value.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     *
     * The created {@link Gauge} will apply a {@link java.util.function.Function Function} to the provided object to
     * resolve a {@link java.lang.Number Number} value.
     *
     * @param <T>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     *            The Type of the Object of which the function <code>func</code> is applied to
     * @param <R>
     *            A {@link java.lang.Number Number}
     * @param name
     *            The name of the Gauge metric
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     *            The name of the Gauge metric
     * @param object
     *            The object that the {@link java.util.function.Function Function} <code>func</code> will be applied to
     * @param func
     *            The {@link java.util.function.Function Function} that will be applied to <code>object</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     *            The object that the {@link java.util.function.Function Function} <code>func</code> will be applied to
     * @param func
     *            The {@link java.util.function.Function Function} that will be applied to <code>object</code>
     * @param tags
     *            The tags of the metric
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java

    /**
     * Return the {@link Gauge} of type {@link java.lang.Number Number} registered under the {@link MetricID} with
     * the @{link Metadata}'s name and with the provided {@link Tag}s; or create and register this gauge if none is
     * registered.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     * {@link Metadata} object is already registered with this metric name then that {@link Metadata} will be used.
     *
     * The created {@link Gauge} will apply a {@link java.util.function.Function Function} to the provided object to
     * resolve a {@link java.lang.Number Number} value.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     *
     * The created {@link Gauge} will apply a {@link java.util.function.Function Function} to the provided object to
     * resolve a {@link java.lang.Number Number} value.
     *
     * @param <T>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     *            The Type of the Object of which the function <code>func</code> is applied to
     * @param <R>
     *            A {@link java.lang.Number Number}
     * @param metadata
     *            The Metadata of the Gauge
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     *            The Metadata of the Gauge
     * @param object
     *            The object that the {@link java.util.function.Function Function} <code>func</code> will be applied to
     * @param func
     *            The {@link java.util.function.Function Function} that will be applied to <code>object</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     *            The object that the {@link java.util.function.Function Function} <code>func</code> will be applied to
     * @param func
     *            The {@link java.util.function.Function Function} that will be applied to <code>object</code>
     * @param tags
     *            The tags of the metric
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java

    /**
     * Return the {@link Gauge} of type {@link java.lang.Number Number} registered under the {@link MetricID}; or create
     * and register this gauge if none is registered.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     * {@link Metadata} object is already registered with this metric name then that {@link Metadata} will be used.
     *
     * The created {@link Gauge} will apply a {@link java.util.function.Function Function} to the provided object to
     * resolve a {@link java.lang.Number Number} value.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     *
     * The created {@link Gauge} will apply a {@link java.util.function.Function Function} to the provided object to
     * resolve a {@link java.lang.Number Number} value.
     *
     * @param <T>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     *            The Type of the Object of which the function <code>func</code> is applied to
     * @param <R>
     *            A {@link java.lang.Number Number}
     * @param metricID
     *            The MetricID of the Gauge metric
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     *            The MetricID of the Gauge metric
     * @param object
     *            The object that the {@link java.util.function.Function Function} <code>func</code> will be applied to
     * @param func
     *            The {@link java.util.function.Function Function} that will be applied to <code>object</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     *            The object that the {@link java.util.function.Function Function} <code>func</code> will be applied to
     * @param func
     *            The {@link java.util.function.Function Function} that will be applied to <code>object</code>
     * @return a new or pre-existing {@link Gauge}
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     * {@link Metadata} object is already registered with this metric name then that {@link Metadata} will be used.
     *
     * The created {@link Gauge} will return the value that the {@link java.util.function.Supplier Supplier} will
     * provide.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     *
     * @param <T>
     *            A {@link java.lang.Number Number}
     * @param metricID
     *            The {@link MetricID}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     *            The {@link MetricID}
     * @param supplier
     *            The {@link java.util.function.Supplier Supplier} function that will return the value for the Gauge
     *            metric
     * @return a new or pre-existing {@link Gauge}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     * {@link Metadata} object is already registered with this metric name then that {@link Metadata} will be used.
     *
     * The created {@link Gauge} will return the value that the {@link java.util.function.Supplier Supplier} will
     * provide.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     *
     * @param <T>
     *            A {@link java.lang.Number Number}
     * @param name
     *            The name of the Gauge
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/metrics/MetricRegistry.java`
#### Snippet
```java
     *            The name of the Gauge
     * @param supplier
     *            The {@link java.util.function.Supplier Supplier} function that will return the value for the Gauge
     *            metric
     * @param tags
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                e.printStackTrace();
                uncaught.incrementAndGet();
            }
```

## RuleId[id=JUnitMalformedDeclaration]
### JUnitMalformedDeclaration
Method `countedTagMethodNotCalledYet` annotated with '@Test' should not declare parameters '@org.eclipse.microprofile.metrics.annotation.Metric(name = "countedMethod", absolute = true, tags = ("number=one")) var instanceOne: org.eclipse.microprofile.metrics.Counter', '@org.eclipse.microprofile.metrics.annotation.Metric(name = "countedMethod", absolute = true, tags = ("number=two")) var instanceTwo: org.eclipse.microprofile.metrics.Counter' and 'instanceTwo'
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

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MetricAppBean.java`
#### Snippet
```java

            Supplier<Long> gaugeSupp = () -> {
                return 19L;
            };

```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java
        // Call the counted method, block and assert it's been counted
        final Exchanger<Long> exchanger = new Exchanger<>();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Thread.UncaughtExceptionHandler() can be replaced with lambda
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java
        });
        final AtomicInteger uncaught = new AtomicInteger();
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java
        try {
            // Call the counted method and assert an exception is thrown
            bean.countedMethod(new Callable<Long>() {
                @Override
                public Long call() throws Exception {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java
            public void run() {
                try {
                    exchanger.exchange(bean.countedMethod(new Callable<Long>() {
                        @Override
                        public Long call() throws Exception {
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `api/src/main/java/org/eclipse/microprofile/metrics/Counting.java`
#### Snippet
```java
     * @return the current count
     */
    long getCount();
}

```

### EmptyMethod
All implementations of this method are empty
in `api/src/main/java/org/eclipse/microprofile/metrics/Sampling.java`
#### Snippet
```java
     * @return a snapshot of the values
     */
    Snapshot getSnapshot();
}

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/ApplicationScopedTimedMethodBean.java`
#### Snippet
```java

    @Timed
    public void applicationScopedTimedMethod() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/stereotype/StereotypeCountedClassBean.java`
#### Snippet
```java
public class StereotypeCountedClassBean {

    public void foo() {

    }
```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/cdi/stereotype/StereotypeCountedClassBeanWithSpecifiedMetadata.java`
#### Snippet
```java
public class StereotypeCountedClassBeanWithSpecifiedMetadata {

    public void foo() {

    }
```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedTimedMethodBean.java`
#### Snippet
```java

    @Timed
    public void timedMethodOne() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedTimedMethodBean.java`
#### Snippet
```java

    @Timed
    public void timedMethodTwo() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedTimedMethodBean.java`
#### Snippet
```java

    @Timed
    protected void timedMethodProtected() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/InheritedTimedMethodBean.java`
#### Snippet
```java

    @Timed
    void timedMethodPackagedPrivate() {
    }
}
```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/VisibilityTimedMethodBean.java`
#### Snippet
```java

    @Timed
    public void publicTimedMethod() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/VisibilityTimedMethodBean.java`
#### Snippet
```java

    @Timed
    void packagePrivateTimedMethod() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/VisibilityTimedMethodBean.java`
#### Snippet
```java

    @Timed
    protected void protectedTimedMethod() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/inheritance/VisibilityTimedMethodBean.java`
#### Snippet
```java
    // http://docs.jboss.org/cdi/spec/1.2/cdi-spec.html#biz_method
    // http://docs.jboss.org/cdi/spec/1.2/cdi-spec.html#binding_interceptor_to_bean
    private void privateTimedMethod() {
    }
}
```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/AbstractGenericBean.java`
#### Snippet
```java
public abstract class AbstractGenericBean {

    public void normallyNotTimedMethod() {
        // This should become timed if a concrete implementation class is Timed
    }
```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/AbstractTimedBean.java`
#### Snippet
```java
public abstract class AbstractTimedBean {

    public void timedMethod() {
    }
}
```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteExtendedTimedBean.java`
#### Snippet
```java
public class ConcreteExtendedTimedBean extends AbstractTimedBean {

    public void anotherTimedMethod() {
    }
}
```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/ConcreteTimedBean.java`
#### Snippet
```java
public class ConcreteTimedBean extends AbstractGenericBean {

    public void timedMethod() {
    }
}
```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedClassBean.java`
#### Snippet
```java
public class CountedClassBean {

    public void countedMethodOne() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedClassBean.java`
#### Snippet
```java
    }

    public void countedMethodTwo() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedClassBean.java`
#### Snippet
```java
    }

    protected void countedMethodProtected() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedClassBean.java`
#### Snippet
```java
    }

    void countedMethodPackagedPrivate() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedClassBean.java`
#### Snippet
```java
    }

    private void countedMethodPrivate() {
    }
}
```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodTagBean.java`
#### Snippet
```java

    @Counted(name = "countedMethod", absolute = true, tags = {"number=one"})
    public void countedMethodOne() {

    }
```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodTagBean.java`
#### Snippet
```java

    @Counted(name = "countedMethod", absolute = true, tags = {"number=two"})
    public void countedMethodTwo() {

    }
```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/DefaultNameMetricMethodBean.java`
#### Snippet
```java

    @Counted
    public void defaultNameCountedMethod() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/DefaultNameMetricMethodBean.java`
#### Snippet
```java

    @Counted(absolute = true)
    public void absoluteDefaultNameCountedMethod() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/DefaultNameMetricMethodBean.java`
#### Snippet
```java

    @Timed
    public void defaultNameTimedMethod() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/DefaultNameMetricMethodBean.java`
#### Snippet
```java

    @Timed(absolute = true)
    public void absoluteDefaultNameTimedMethod() {
    }
}
```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/OverloadedTimedMethodBean.java`
#### Snippet
```java

    @Timed(name = "overloadedTimedMethodWithNoArguments")
    public void overloadedTimedMethod() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/OverloadedTimedMethodBean.java`
#### Snippet
```java

    @Timed(name = "overloadedTimedMethodWithStringArgument")
    public void overloadedTimedMethod(String string) {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/OverloadedTimedMethodBean.java`
#### Snippet
```java

    @Timed(name = "overloadedTimedMethodWithListOfStringArgument")
    public void overloadedTimedMethod(List<String> strings) {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/OverloadedTimedMethodBean.java`
#### Snippet
```java

    @Timed(name = "overloadedTimedMethodWithObjectArgument")
    public void overloadedTimedMethod(Object object) {
    }
}
```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedClassBean.java`
#### Snippet
```java
public class TimedClassBean {

    public void timedMethodOne() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedClassBean.java`
#### Snippet
```java
    }

    public void timedMethodTwo() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedClassBean.java`
#### Snippet
```java
    }

    protected void timedMethodProtected() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedClassBean.java`
#### Snippet
```java
    }

    void timedMethodPackagedPrivate() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimedClassBean.java`
#### Snippet
```java
    }

    private void timedMethodPrivate() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TimedTagMethodBean.java`
#### Snippet
```java

    @Timed(name = "timedMethod", tags = {"number=one"})
    public void timedMethodOne() {
    }

```

### EmptyMethod
The method is empty
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/tags/TimedTagMethodBean.java`
#### Snippet
```java

    @Timed(name = "timedMethod", tags = {"number=two"})
    public void timedMethodTwo() {
    }
}
```

### EmptyMethod
The method is empty
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MetricAppBean.java`
#### Snippet
```java

    @Counted(name = SHARED_METRIC_NAME, absolute = true, scope = "customScopeA")
    public void countMeMetricNameScopeA() {

    }
```

### EmptyMethod
The method is empty
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MetricAppBean.java`
#### Snippet
```java

    @Timed(name = SHARED_METRIC_NAME, absolute = true, scope = "customScopeB")
    public void timeMeMetricNameScopeB() {

    }
```

### EmptyMethod
The method is empty
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MetricAppBean.java`
#### Snippet
```java

    @Counted(name = "metricTest.test1.countMeA", absolute = true, description = "count-me-a-description")
    public void countMeA() {

    }
```

### EmptyMethod
The method is empty
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MetricAppBean.java`
#### Snippet
```java

    @Timed
    public void timeMeA() {

    }
```

### EmptyMethod
The method is empty
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MetricAppBean2.java`
#### Snippet
```java

    @Counted(name = "countMe2", absolute = true)
    public void countMeA() {

    }
```

### EmptyMethod
The method is empty
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MetricAppBean2.java`
#### Snippet
```java

    @Counted(name = "countMe2", absolute = true)
    public void countMeB() {

    }
```

### EmptyMethod
The method is empty
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MetricAppBean2.java`
#### Snippet
```java

    @Timed(absolute = true, name = "timeMe2")
    public void timeMeA() {

    }
```

### EmptyMethod
The method is empty
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/MetricAppBean2.java`
#### Snippet
```java
    }
    @Timed(absolute = true, name = "timeMe2")
    public void timeMeB() {

    }
```

### EmptyMethod
The method is empty
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/multipleinstances/DependentScopedBean.java`
#### Snippet
```java

    @Counted(name = "counter", absolute = true)
    public void countedMethod() {

    }
```

### EmptyMethod
The method is empty
in `tck/rest/src/main/java/org/eclipse/microprofile/metrics/test/multipleinstances/DependentScopedBean.java`
#### Snippet
```java

    @Timed(name = "timer", absolute = true)
    public void timedMethod() {

    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimerTest.java`
#### Snippet
```java
    private static Timer globalTimer = null;

    private static boolean isInitialized = false;

    final static long[] SAMPLE_LONG_DATA = {0, 10, 20, 20, 20, 30, 30, 30, 30, 30, 40, 50, 50, 60, 70, 70, 70, 80, 90,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/TimerTest.java`
#### Snippet
```java
    private MetricRegistry registry;

    private static Timer globalTimer = null;

    private static boolean isInitialized = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramTest.java`
#### Snippet
```java
    private MetricRegistry metrics;

    private static Histogram histogramLong = null;

    private static boolean isInitialized = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/HistogramTest.java`
#### Snippet
```java
    private static Histogram histogramLong = null;

    private static boolean isInitialized = false;
    final static int[] SAMPLE_INT_DATA = {0, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 5, 5, 6, 7, 7, 7, 8, 9, 9, 10, 11, 11, 12,
            12,
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `tck/api/src/main/java/org/eclipse/microprofile/metrics/tck/metrics/CountedMethodBeanTest.java`
#### Snippet
```java
                @Override
                public Long call() throws Exception {
                    return null;
                }
            });
```

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=NullArgumentToVariableArgMethod]
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

