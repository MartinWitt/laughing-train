# Dhalion 
 
# Bad smells
I found 48 bad smells with 10 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 16 | false |
| UnnecessaryToStringCall | 9 | true |
| UNCHECKED_WARNING | 7 | false |
| OptionalGetWithoutIsPresent | 4 | false |
| NonFinalFieldInEnum | 3 | false |
| SwitchStatementWithTooFewBranches | 2 | false |
| RegExpSimplifiable | 2 | false |
| DuplicatedCode | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| UNUSED_IMPORT | 1 | false |
| ConstantValue | 1 | false |
| RegExpRedundantEscape | 1 | false |
## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/microsoft/dhalion/examples/AlertPolicy.java`
#### Snippet
```java
    Instant currentTime = null;
    if (matcher.group("Time") != null && matcher.group("Type") != null) {
      switch (matcher.group("Type")) {
        case "Z":
          currentTime = Instant.parse(matcher.group("Time") + matcher.group("Type"));
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/microsoft/dhalion/examples/NodeStat.java`
#### Snippet
```java
    Instant currentTime = null;
    if (matcher.group(TIME) != null && matcher.group("Type") != null) {
      switch (matcher.group("Type")) {
        case "Z":
          currentTime = Instant.parse(matcher.group("Time") + matcher.group("Type"));
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `text` in enum 'SymptomName'
in `src/main/java/com/microsoft/dhalion/detectors/SymptomName.java`
#### Snippet
```java
  SCARCE_MEMORY(ScarceMemoryDetector.class.getSimpleName());

  private String text;

  SymptomName(String name) {
```

### NonFinalFieldInEnum
Non-final field `text` in enum 'MetricName'
in `src/main/java/com/microsoft/dhalion/examples/MetricName.java`
#### Snippet
```java
  METRIC_MEMORY("Mem");

  private String text;

  MetricName(String name) {
```

### NonFinalFieldInEnum
Non-final field `text` in enum 'CliArgs'
in `src/main/java/com/microsoft/dhalion/HealthManager.java`
#### Snippet
```java
    CONFIG_DIR("config_dir");

    private String text;

    CliArgs(String name) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/com/microsoft/dhalion/examples/UncommonUtilizationDiagnoser.java`
#### Snippet
```java
    ArrayList<String> overUtilizedNodes = new ArrayList<>();
    for (Symptom highCpuSymptom : highCpuUtilization.get()) {
      for (String node : highCpuSymptom.assignments()) {
        if (highMemoryUtilization.assignment(node).size() > 0) {
          overUtilizedNodes.add(node);
        }
      }
    }
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[Z]` can be simplified to 'Z'
in `src/main/java/com/microsoft/dhalion/examples/AlertPolicy.java`
#### Snippet
```java
  private Instant currentCheckPoint;
  private static final Pattern timeData =
      Pattern.compile("((?<Time>\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2,4}\\.\\d{2,4})" + "(?<Type>[Z]))");

  @Inject
```

### RegExpSimplifiable
`[Z]` can be simplified to 'Z'
in `src/main/java/com/microsoft/dhalion/examples/NodeStat.java`
#### Snippet
```java
      Pattern.compile("^((?<Node>Node.)\\[(?<Id>\\d+)\\]):" + "Mem=(?<Mem>\\d+)MB," + "Cpu=(?<Cpu>[^,]+)%,"
                          + "(Time=(?<Time>\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2,4}\\.\\d{2,4})" +
                          "(?<Type>[Z]))");

  @VisibleForTesting
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.Collection'
in `src/main/java/com/microsoft/dhalion/examples/AlertResolver.java`
#### Snippet
```java
      LOG.info("Alert " + d.toString());
    });
    return Collections.EMPTY_LIST;
  }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'com.microsoft.dhalion.events.EventDispatcher\>' to 'com.microsoft.dhalion.events.EventDispatcher'
in `src/main/java/com/microsoft/dhalion/events/EventManager.java`
#### Snippet
```java

  public synchronized <T> void addEventListener(Class<T> eventType, EventHandler<T> handler) {
    EventDispatcher<T> dispatcher = (EventDispatcher<T>) registry.get(eventType);
    if (dispatcher == null) {
      dispatcher = new EventDispatcher<>();
```

### UNCHECKED_WARNING
Unchecked cast: 'com.microsoft.dhalion.events.EventDispatcher\>' to 'com.microsoft.dhalion.events.EventDispatcher'
in `src/main/java/com/microsoft/dhalion/events/EventManager.java`
#### Snippet
```java
  public <T> void onEvent(T event) {
    Class<?> key = event.getClass();
    EventDispatcher<T> dispatcher = (EventDispatcher<T>) registry.get(event.getClass());
    if (dispatcher == null) {
      LOG.info("No dispatcher registered for event");
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `src/main/java/com/microsoft/dhalion/conf/ConfigBuilder.java`
#### Snippet
```java
      return new ArrayList<>();
    } else if (o instanceof List) {
      return (List<String>) o;
    } else {
      throw new IllegalArgumentException("Failed to convert " + o + " to List<String>");
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `src/main/java/com/microsoft/dhalion/conf/ConfigBuilder.java`
#### Snippet
```java
    Map<String, Object> ret = loadFile(policyConfigFile);
    getListOfStrings(ret.get(Key.POLICIES.value()))
        .forEach(id -> policyConf.add(new PolicyConfig(id, (Map<String, Object>) ret.get(id))));
    return this;
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `src/main/java/com/microsoft/dhalion/HealthManager.java`
#### Snippet
```java
    String metricsProviderClass = (String) conf.get(Key.METRICS_PROVIDER_CLASS.value());
    Class<MetricsProvider> mpClass
        = (Class<MetricsProvider>) this.getClass().getClassLoader().loadClass(metricsProviderClass);
    injector = injector.createChildInjector(new AbstractModule() {
      @Override
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `src/main/java/com/microsoft/dhalion/HealthManager.java`
#### Snippet
```java
      LOG.info(String.format("Initializing %s with class %s", policyConf.id(), policyClassName));
      Class<IHealthPolicy> policyClass
          = (Class<IHealthPolicy>) this.getClass().getClassLoader().loadClass(policyClassName);

      AbstractModule module = constructPolicySpecificModule(policyConf);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `future` is redundant
in `src/main/java/com/microsoft/dhalion/policy/PoliciesExecutor.java`
#### Snippet
```java

  public ScheduledFuture<?> start() {
    ScheduledFuture<?> future = executor.scheduleWithFixedDelay(() -> {
      // schedule the next execution cycle
      Duration nextScheduleDelay = policies.stream()
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/dhalion/detectors/ScarceMemoryDetector.java`
#### Snippet
```java
    super(policyConfig, CONFIG_KEY_PREFIX, SymptomName.SCARCE_MEMORY.text());
    thresholdRatio = (double) policyConfig.getConfig(CONFIG_KEY_PREFIX + THRESHOLD_RATIO_CONFIG_KEY, 1.5);
    LOG.info("Detector created: " + this.toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/dhalion/examples/UncommonUtilizationDiagnoser.java`
#### Snippet
```java
    }
    if (overUtilizedNodes.size() > 0) {
      LOG.fine(String.format("Overutilized nodes found: %s", overUtilizedNodes.toString()));
      Diagnosis diagnosis = new Diagnosis(DIAGNOSIS_OVER_UTILIZED_NODE, context.checkpoint(),
                                          overUtilizedNodes);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/dhalion/examples/UncommonUtilizationDiagnoser.java`
#### Snippet
```java

    if (underUtilizedNodes.size() > 0) {
      LOG.fine(String.format("Underutilized nodes found: %s", underUtilizedNodes.toString()));
      Diagnosis diagnosis = new Diagnosis(DIAGNOSIS_UNDER_UTILIZED_NODE, context.checkpoint(),
                                          underUtilizedNodes);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/dhalion/detectors/ResourceAvailabilityDetector.java`
#### Snippet
```java
    Symptom symptom = new Symptom(symptomType, now, assignments);
    if (LOG.isLoggable(Level.FINE)) {
      LOG.fine(String.format("Symptom (%s) created for %s", symptom, toString()));
    }
    return Collections.singletonList(symptom);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/dhalion/detectors/ExcessMemoryDetector.java`
#### Snippet
```java
    super(policyConfig, CONFIG_KEY_PREFIX, SymptomName.EXCESS_MEMORY.text());
    thresholdRatio = (double) policyConfig.getConfig(CONFIG_KEY_PREFIX + THRESHOLD_RATIO_CONFIG_KEY, 2.0);
    LOG.info("Detector created: " + this.toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/dhalion/detectors/ExcessCpuDetector.java`
#### Snippet
```java
    super(policyConfig, CONFIG_KEY_PREFIX, SymptomName.EXCESS_CPU.text());
    thresholdRatio = (double) policyConfig.getConfig(CONFIG_KEY_PREFIX + THRESHOLD_RATIO_CONFIG_KEY, 2.0);
    LOG.info("Detector created: " + this.toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/dhalion/detectors/ScarceCpuDetector.java`
#### Snippet
```java
    super(policyConfig, CONFIG_KEY_PREFIX, SymptomName.SCARCE_CPU.text());
    thresholdRatio = (double) policyConfig.getConfig(CONFIG_KEY_PREFIX + THRESHOLD_RATIO_CONFIG_KEY, 1.5);
    LOG.info("Detector created: " + this.toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/dhalion/policy/PoliciesExecutor.java`
#### Snippet
```java
    outcomes.stream()
        .filter(m -> m.instant().isAfter(current) || m.instant().isBefore(previous))
        .forEach(m -> LOG.warning(m.toString() + " is outside checkpoint window"));
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/dhalion/policy/PoliciesExecutor.java`
#### Snippet
```java
        measurements.stream()
            .filter(m -> m.instant().isAfter(current) || m.instant().isBefore(previous))
            .forEach(m -> LOG.info(m.toString() + "is outside checkpoint window"));
        context.measurementsTableBuilder.addAll(measurements);

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.microsoft.dhalion.core.MeasurementsTable.SortKey;`
in `src/main/java/com/microsoft/dhalion/core/OutcomeTable.java`
#### Snippet
```java
package com.microsoft.dhalion.core;

import com.microsoft.dhalion.core.MeasurementsTable.SortKey;
import tech.tablesaw.api.CategoryColumn;
import tech.tablesaw.api.IntColumn;
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `text` may be 'final'
in `src/main/java/com/microsoft/dhalion/detectors/SymptomName.java`
#### Snippet
```java
  SCARCE_MEMORY(ScarceMemoryDetector.class.getSimpleName());

  private String text;

  SymptomName(String name) {
```

### FieldMayBeFinal
Field `nodeStat` may be 'final'
in `src/main/java/com/microsoft/dhalion/examples/CSVMetricsProvider.java`
#### Snippet
```java
  private static final Logger LOG = Logger.getLogger(CSVMetricsProvider.class.getSimpleName());

  private NodeStat nodeStat;
  Config sysConf;

```

### FieldMayBeFinal
Field `timeStamps` may be 'final'
in `src/main/java/com/microsoft/dhalion/core/MeasurementsTable.java`
#### Snippet
```java
  private CategoryColumn instance;
  private CategoryColumn type;
  private LongColumn timeStamps;
  private DoubleColumn value;
  private MeasurementsTable() {
```

### FieldMayBeFinal
Field `type` may be 'final'
in `src/main/java/com/microsoft/dhalion/core/MeasurementsTable.java`
#### Snippet
```java
  private CategoryColumn component;
  private CategoryColumn instance;
  private CategoryColumn type;
  private LongColumn timeStamps;
  private DoubleColumn value;
```

### FieldMayBeFinal
Field `noCheckpoints` may be 'final'
in `src/main/java/com/microsoft/dhalion/detectors/BelowThresholdDetector.java`
#### Snippet
```java
  private final double lowThreshold;
  private String metricName;
  private double noCheckpoints;

  private static final Logger LOG = Logger.getLogger(BelowThresholdDetector.class.getSimpleName());
```

### FieldMayBeFinal
Field `metricName` may be 'final'
in `src/main/java/com/microsoft/dhalion/detectors/BelowThresholdDetector.java`
#### Snippet
```java

  private final double lowThreshold;
  private String metricName;
  private double noCheckpoints;

```

### FieldMayBeFinal
Field `value` may be 'final'
in `src/main/java/com/microsoft/dhalion/core/MeasurementsTable.java`
#### Snippet
```java
  private CategoryColumn type;
  private LongColumn timeStamps;
  private DoubleColumn value;
  private MeasurementsTable() {
    component = new CategoryColumn(COMPONENT);
```

### FieldMayBeFinal
Field `instance` may be 'final'
in `src/main/java/com/microsoft/dhalion/core/MeasurementsTable.java`
#### Snippet
```java
  private final Table measurements;
  private CategoryColumn component;
  private CategoryColumn instance;
  private CategoryColumn type;
  private LongColumn timeStamps;
```

### FieldMayBeFinal
Field `component` may be 'final'
in `src/main/java/com/microsoft/dhalion/core/MeasurementsTable.java`
#### Snippet
```java
  private static final String VALUE = SortKey.VALUE.name();
  private final Table measurements;
  private CategoryColumn component;
  private CategoryColumn instance;
  private CategoryColumn type;
```

### FieldMayBeFinal
Field `metricName` may be 'final'
in `src/main/java/com/microsoft/dhalion/detectors/AboveThresholdDetector.java`
#### Snippet
```java

  private final double highThreshold;
  private String metricName;
  private double noCheckpoints;

```

### FieldMayBeFinal
Field `noCheckpoints` may be 'final'
in `src/main/java/com/microsoft/dhalion/detectors/AboveThresholdDetector.java`
#### Snippet
```java
  private final double highThreshold;
  private String metricName;
  private double noCheckpoints;

  private static final Logger LOG = Logger.getLogger(AboveThresholdDetector.class.getSimpleName());
```

### FieldMayBeFinal
Field `text` may be 'final'
in `src/main/java/com/microsoft/dhalion/examples/MetricName.java`
#### Snippet
```java
  METRIC_MEMORY("Mem");

  private String text;

  MetricName(String name) {
```

### FieldMayBeFinal
Field `policy` may be 'final'
in `src/main/java/com/microsoft/dhalion/policy/PoliciesExecutor.java`
#### Snippet
```java
    private Instant checkpoint;
    private Instant previousCheckpoint;
    private IHealthPolicy policy;

    private ExecutionContext(IHealthPolicy policy) {
```

### FieldMayBeFinal
Field `text` may be 'final'
in `src/main/java/com/microsoft/dhalion/HealthManager.java`
#### Snippet
```java
    CONFIG_DIR("config_dir");

    private String text;

    CliArgs(String name) {
```

### FieldMayBeFinal
Field `healthPolicies` may be 'final'
in `src/main/java/com/microsoft/dhalion/HealthManager.java`
#### Snippet
```java
  private Injector injector;
  private Config config;
  private List<IHealthPolicy> healthPolicies = new ArrayList<>();
  private final MetricsProvider metricsProvider;

```

### FieldMayBeFinal
Field `config` may be 'final'
in `src/main/java/com/microsoft/dhalion/HealthManager.java`
#### Snippet
```java

  private Injector injector;
  private Config config;
  private List<IHealthPolicy> healthPolicies = new ArrayList<>();
  private final MetricsProvider metricsProvider;
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `matcher != null` is always `true`
in `src/main/java/com/microsoft/dhalion/examples/AlertPolicy.java`
#### Snippet
```java

    Matcher matcher = getDataMatcher("2018-01-08T01:34:36.934Z").get();
    if (matcher != null) {
      currentCheckPoint = getTimestamp(matcher).get();
    }
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/microsoft/dhalion/examples/AlertPolicy.java`
#### Snippet
```java
                     AlertResolver alertResolver) {

    Matcher matcher = getDataMatcher("2018-01-08T01:34:36.934Z").get();
    if (matcher != null) {
      currentCheckPoint = getTimestamp(matcher).get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/microsoft/dhalion/examples/AlertPolicy.java`
#### Snippet
```java
    Matcher matcher = getDataMatcher("2018-01-08T01:34:36.934Z").get();
    if (matcher != null) {
      currentCheckPoint = getTimestamp(matcher).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/microsoft/dhalion/examples/NodeStat.java`
#### Snippet
```java
    String nodeId = matcher.group(NODE_ID);
    double value = -1;
    Instant instant = getTimestamp(matcher).get();
    if (matcher.group(metric) != null && getTimestamp(matcher).get().equals(instant)) {
      switch (metric) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/microsoft/dhalion/examples/NodeStat.java`
#### Snippet
```java
    double value = -1;
    Instant instant = getTimestamp(matcher).get();
    if (matcher.group(metric) != null && getTimestamp(matcher).get().equals(instant)) {
      switch (metric) {
        case MEMORY_UTILIZATION:
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/com/microsoft/dhalion/examples/NodeStat.java`
#### Snippet
```java

  private static final Pattern linePatternData =
      Pattern.compile("^((?<Node>Node.)\\[(?<Id>\\d+)\\]):" + "Mem=(?<Mem>\\d+)MB," + "Cpu=(?<Cpu>[^,]+)%,"
                          + "(Time=(?<Time>\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2,4}\\.\\d{2,4})" +
                          "(?<Type>[Z]))");
```

