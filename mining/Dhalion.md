# Dhalion 
 
# Bad smells
I found 54 bad smells with 17 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 10 | false |
| UnnecessaryToStringCall | 9 | true |
| PublicFieldAccessedInSynchronizedContext | 6 | false |
| OptionalGetWithoutIsPresent | 4 | false |
| UnnecessarySuperQualifier | 3 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| NonProtectedConstructorInAbstractClass | 2 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| ReturnNull | 2 | false |
| RegExpSimplifiable | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| UNUSED_IMPORT | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| CodeBlock2Expr | 1 | true |
| RegExpRedundantEscape | 1 | false |
| RedundantFieldInitialization | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| RedundantImplements | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| MissortedModifiers | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `TableUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/microsoft/dhalion/core/TableUtils.java`
#### Snippet
```java
import static tech.tablesaw.api.QueryHelper.allOf;

class TableUtils {
  static Table sort(Table table, boolean descending, String[] columns) {
    Table result;
```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/microsoft/dhalion/Utils.java`
#### Snippet
```java
package com.microsoft.dhalion;

public class Utils {

  public static String getCompositeName(String... names) {
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/microsoft/dhalion/core/SymptomsTable.java`
#### Snippet
```java
   */
  public SymptomsTable expire(Instant expiration) {
    return new SymptomsTable(super.expireBefore(expiration));
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/microsoft/dhalion/core/ActionTable.java`
#### Snippet
```java
   */
  public ActionTable expire(Instant expiration) {
    return new ActionTable(super.expireBefore(expiration));
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/microsoft/dhalion/core/DiagnosisTable.java`
#### Snippet
```java
   */
  public DiagnosisTable expire(Instant expiration) {
    return new DiagnosisTable(super.expireBefore(expiration));
  }

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

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/microsoft/dhalion/examples/CSVMetricsProvider.java`
#### Snippet
```java
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return metrics;
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/microsoft/dhalion/examples/AlertResolver.java`
#### Snippet
```java
  @Override
  public Collection<Action> resolve(Collection<Diagnosis> diagnosis) {
    diagnosis.forEach(d -> {
      LOG.info("Alert " + d.toString());
    });
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ResourceAvailabilityDetector()` of an abstract class should not be declared 'public'
in `src/main/java/com/microsoft/dhalion/detectors/ResourceAvailabilityDetector.java`
#### Snippet
```java
  private final String symptomType;

  public ResourceAvailabilityDetector(PolicyConfig policyConf, String confPrefix, String symptomType) {
    this.freeMetric = (String) policyConf.getConfig(confPrefix + FREE_METRIC_NAME_KEY);
    this.demandMetric = (String) policyConf.getConfig(confPrefix + DEMAND_METRIC_NAME_KEY);
```

### NonProtectedConstructorInAbstractClass
Constructor `ResourceAvailabilityDetector()` of an abstract class should not be declared 'public'
in `src/main/java/com/microsoft/dhalion/detectors/ResourceAvailabilityDetector.java`
#### Snippet
```java
  }

  public ResourceAvailabilityDetector(String freeMetric, String demandMetric, String symptomType) {
    this.freeMetric = freeMetric;
    this.demandMetric = demandMetric;
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

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `handlers` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/microsoft/dhalion/events/EventDispatcher.java`
#### Snippet
```java

public class EventDispatcher<T> implements EventHandler<T> {
  Set<EventHandler<T>> handlers = new HashSet<>();

  public synchronized void addHandler(EventHandler<T> handler) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `context` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/microsoft/dhalion/sensors/BasicSensor.java`
#### Snippet
```java
  private final Collection<String> components;

  protected ExecutionContext context;
  protected final MetricsProvider metricsProvider;

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/microsoft/dhalion/policy/HealthPolicyImpl.java`
#### Snippet
```java
  protected Duration interval = Duration.ofMinutes(1);
  private Instant lastExecutionTimestamp;
  private Instant oneTimeDelay = null;

  private ExecutionContext executionContext;
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'defaultValue' in a Serializable class
in `src/main/java/com/microsoft/dhalion/conf/Key.java`
#### Snippet
```java

  private final String value;
  private final Object defaultValue;

  Key(String value) {
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `IHealthPolicy`
in `src/main/java/com/microsoft/dhalion/examples/AlertPolicy.java`
#### Snippet
```java
 * when a node is over utilized or under utilized.
 */
public class AlertPolicy extends HealthPolicyImpl implements IHealthPolicy {
  private Instant currentCheckPoint;
  private static final Pattern timeData =
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/dhalion/core/OutcomeTable.java`
#### Snippet
```java
  public T get(int index) {
    if (index < 0 || index >= table.rowCount() || table.isEmpty()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/microsoft/dhalion/core/MeasurementsTable.java`
#### Snippet
```java
  public Measurement get(int index) {
    if (index < 0 || index >= measurements.rowCount() || measurements.isEmpty()) {
      return null;
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`overUtilizedNodes.size() > 0` can be replaced with '!overUtilizedNodes.isEmpty()'
in `src/main/java/com/microsoft/dhalion/examples/UncommonUtilizationDiagnoser.java`
#### Snippet
```java
      }
    }
    if (overUtilizedNodes.size() > 0) {
      LOG.fine(String.format("Overutilized nodes found: %s", overUtilizedNodes.toString()));
      Diagnosis diagnosis = new Diagnosis(DIAGNOSIS_OVER_UTILIZED_NODE, context.checkpoint(),
```

### SizeReplaceableByIsEmpty
`underUtilizedNodes.size() > 0` can be replaced with '!underUtilizedNodes.isEmpty()'
in `src/main/java/com/microsoft/dhalion/examples/UncommonUtilizationDiagnoser.java`
#### Snippet
```java
    }

    if (underUtilizedNodes.size() > 0) {
      LOG.fine(String.format("Underutilized nodes found: %s", underUtilizedNodes.toString()));
      Diagnosis diagnosis = new Diagnosis(DIAGNOSIS_UNDER_UTILIZED_NODE, context.checkpoint(),
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
        measurements.stream()
            .filter(m -> m.instant().isAfter(current) || m.instant().isBefore(previous))
            .forEach(m -> LOG.info(m.toString() + "is outside checkpoint window"));
        context.measurementsTableBuilder.addAll(measurements);

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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Symptom`
in `src/main/java/com/microsoft/dhalion/core/Diagnosis.java`
#### Snippet
```java
                   Instant instant,
                   Collection<String> assignments,
                   Collection<Symptom> symptoms) {
    super(type, instant, assignments);
    if (symptoms != null) {
```

### BoundedWildcard
Can generalize to `? extends Symptom`
in `src/main/java/com/microsoft/dhalion/core/Diagnosis.java`
#### Snippet
```java
  }

  Diagnosis(int id, String type, Instant instant, Collection<String> assignments, Collection<Symptom> symptoms) {
    super(id, type, instant, assignments);
    if (symptoms != null) {
```

### BoundedWildcard
Can generalize to `? extends Measurement`
in `src/main/java/com/microsoft/dhalion/core/Symptom.java`
#### Snippet
```java
                 Instant instant,
                 Collection<String> assignments,
                 Collection<Measurement> measurements) {
    super(symptomType, instant, assignments);
    if (measurements != null) {
```

### BoundedWildcard
Can generalize to `? extends Measurement`
in `src/main/java/com/microsoft/dhalion/core/Symptom.java`
#### Snippet
```java
          Instant instant,
          Collection<String> assignments,
          Collection<Measurement> measurements) {
    super(id, symptomType, instant, assignments);
    if (measurements != null) {
```

### BoundedWildcard
Can generalize to `? extends Symptom`
in `src/main/java/com/microsoft/dhalion/core/SymptomsTable.java`
#### Snippet
```java
  }

  private void addAll(Collection<Symptom> symptoms) {
    symptoms.forEach(this::add);
  }
```

### BoundedWildcard
Can generalize to `? extends Action`
in `src/main/java/com/microsoft/dhalion/core/ActionTable.java`
#### Snippet
```java
  }

  private void addAll(Collection<Action> actions) {
    actions.forEach(this::add);
  }
```

### BoundedWildcard
Can generalize to `? extends Diagnosis`
in `src/main/java/com/microsoft/dhalion/core/DiagnosisTable.java`
#### Snippet
```java
  }

  private void addAll(Collection<Diagnosis> diagnosis) {
    diagnosis.forEach(this::add);
  }
```

### BoundedWildcard
Can generalize to `? extends Diagnosis`
in `src/main/java/com/microsoft/dhalion/core/Action.java`
#### Snippet
```java
  }

  public Action(String type, Instant instant, Collection<String> assignments, Collection<Diagnosis> diagnosis) {
    super(type, instant, assignments);
    if (diagnosis != null) {
```

### BoundedWildcard
Can generalize to `? extends Diagnosis`
in `src/main/java/com/microsoft/dhalion/core/Action.java`
#### Snippet
```java
  }

  Action(int id, String type, Instant instant, Collection<String> assignments, Collection<Diagnosis> diagnosis) {
    super(id, type, instant, assignments);
    if (diagnosis != null) {
```

### BoundedWildcard
Can generalize to `? extends Measurement`
in `src/main/java/com/microsoft/dhalion/core/MeasurementsTable.java`
#### Snippet
```java
  }

  private void addAll(Collection<Measurement> measurements) {
    measurements.forEach(measurement -> {
      component.append(measurement.component());
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `abstract protected`
in `src/main/java/com/microsoft/dhalion/detectors/ResourceAvailabilityDetector.java`
#### Snippet
```java
  }

  abstract protected boolean evaluate(String instance, double free, double used);

  @Override
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

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `handlers` accessed in synchronized context
in `src/main/java/com/microsoft/dhalion/events/EventDispatcher.java`
#### Snippet
```java

  public synchronized void addHandler(EventHandler<T> handler) {
    if (handlers.contains(handler)) {
      throw new IllegalArgumentException("Duplicate hanlder registration");
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `handlers` accessed in synchronized context
in `src/main/java/com/microsoft/dhalion/events/EventDispatcher.java`
#### Snippet
```java
      throw new IllegalArgumentException("Duplicate hanlder registration");
    }
    handlers.add(handler);
  }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `context` accessed in synchronized context
in `src/main/java/com/microsoft/dhalion/sensors/BasicSensor.java`
#### Snippet
```java
   */
  protected synchronized Duration getDuration() {
    if (context.previousCheckpoint() == null || context.previousCheckpoint().equals(Instant.MIN)) {
      return DEFAULT_METRIC_DURATION;
    } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `context` accessed in synchronized context
in `src/main/java/com/microsoft/dhalion/sensors/BasicSensor.java`
#### Snippet
```java
   */
  protected synchronized Duration getDuration() {
    if (context.previousCheckpoint() == null || context.previousCheckpoint().equals(Instant.MIN)) {
      return DEFAULT_METRIC_DURATION;
    } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `context` accessed in synchronized context
in `src/main/java/com/microsoft/dhalion/sensors/BasicSensor.java`
#### Snippet
```java
      return DEFAULT_METRIC_DURATION;
    } else {
      return Duration.between(context.previousCheckpoint(), context.checkpoint());
    }
  }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `context` accessed in synchronized context
in `src/main/java/com/microsoft/dhalion/sensors/BasicSensor.java`
#### Snippet
```java
      return DEFAULT_METRIC_DURATION;
    } else {
      return Duration.between(context.previousCheckpoint(), context.checkpoint());
    }
  }
```

