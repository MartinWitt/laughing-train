# jetCheck 
 
# Bad smells
I found 42 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 11 | false |
| ConstantValue | 6 | false |
| AssignmentToMethodParameter | 5 | false |
| ReturnNull | 5 | false |
| DeprecatedIsStillUsed | 3 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| ExceptionNameDoesntEndWithException | 2 | false |
| SystemOutErr | 1 | false |
| Convert2MethodRef | 1 | false |
| RedundantFieldInitialization | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| UnnecessaryToStringCall | 1 | true |
| MissortedModifiers | 1 | false |
## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/jetbrains/jetCheck/Iteration.java`
#### Snippet
```java

      ScheduledFuture<?> printSeeds = session.executor.schedule(
              () -> System.out.println("An iteration is running for too long, " + printSeeds()),
              1, TimeUnit.MINUTES);
      try {
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `PropertyChecker` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
 */
@SuppressWarnings("WeakerAccess")
public class PropertyChecker {
  static final int DEFAULT_MAX_SIZE_HINT = 100;

```

### UtilityClassWithoutPrivateConstructor
Class `DataSerializer` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/jetbrains/jetCheck/DataSerializer.java`
#### Snippet
```java
 * @author peter
 */
class DataSerializer {

  private static int readINT(ByteArrayInputStream record) {
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'withSeed' is still used
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
     */
    @Deprecated
    public Parameters withSeed(long seed) {
      if (serializedData != null) {
        System.err.println("withSeed ignored, because 'rechecking' is used");
```

### DeprecatedIsStillUsed
Deprecated member 'recheckingIteration' is still used
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
     */
    @Deprecated
    public Parameters recheckingIteration(long seed, int sizeHint) {
      return withForcedIterationCount(1).withSeed(seed).withSizeHint(whatever -> sizeHint);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'rechecking' is still used
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
     */
    @Deprecated
    public Parameters rechecking(@NotNull String serializedData) {
      return DataSerializer.deserializeInto(serializedData, this);
    }
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/org/jetbrains/jetCheck/IntDistribution.java`
#### Snippet
```java
    if (weights.isEmpty()) throw new IllegalArgumentException("No alternatives to choose from");
    
    int sum = weights.stream().reduce(0, (a, b) -> a + b);
    return new BoundedIntDistribution(0, weights.size() - 1, r -> {
      int value = r.nextInt(sum);
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/jetbrains/jetCheck/StatusNotifier.java`
#### Snippet
```java

  private int lastReportedStage = -1;
  private String lastReportedTrace = null;

  <T> void shrinkAttempt(PropertyFailure<T> failure, Iteration<T> iteration, StructureNode data) {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `val`
in `src/main/java/org/jetbrains/jetCheck/DataSerializer.java`
#### Snippet
```java
    if (0 > val || val >= 192) {
      record.write(192 + (val & 0x3F));
      val >>>= 6;
      while (val >= 128) {
        record.write((val & 0x7F) | 0x80);
```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `src/main/java/org/jetbrains/jetCheck/DataSerializer.java`
#### Snippet
```java
      while (val >= 128) {
        record.write((val & 0x7F) | 0x80);
        val >>>= 7;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `step`
in `src/main/java/org/jetbrains/jetCheck/PropertyFailureImpl.java`
#### Snippet
```java
      }

      step = step.onFailure();
    }
    return processDelayedCombinations(combinatorial);
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `src/main/java/org/jetbrains/jetCheck/PropertyFalsified.java`
#### Snippet
```java
  private static Throwable getRootCause(Throwable t) {
    while (t.getCause() != null) {
      t = t.getCause();
    }
    return t;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/jetbrains/jetCheck/StructureNode.java`
#### Snippet
```java
  ShrinkStep shrinkChild(int index) {
    int minIndex = kind == StructureKind.GENERIC ? 0 : 1;
    for (; index >= minIndex; index--) {
      ShrinkStep childShrink = children.get(index).shrink();
      if (childShrink != null) return wrapChildShrink(index, childShrink);
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'failure' in a Serializable class
in `src/main/java/org/jetbrains/jetCheck/PropertyFalsified.java`
#### Snippet
```java
  static final String NOT_REPRODUCIBLE = "The failure is not reproducible on re-run!!! Possible cause: side effects in the test.";
  private static final String SEPARATOR = "\n==========================\n";
  private final PropertyFailureImpl<?> failure;
  private final String message;

```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/jetbrains/jetCheck/CounterExampleImpl.java`
#### Snippet
```java
      return new CounterExampleImpl<>(node, value, e, iteration);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/org/jetbrains/jetCheck/Scenario.java`
#### Snippet
```java
          public Object apply(GenerationEnvironment cmdData) {
            performCommand(safeGenerate(cmdData, cmdGen), cmdData, indent + "  ");
            return null;
          }
        });
```

### ReturnNull
Return of `null`
in `src/main/java/org/jetbrains/jetCheck/StructureNode.java`
#### Snippet
```java
    return distribution.isValidValue(value)
            ? ShrinkStep.create(id, new IntData(id, value, distribution), __ -> success.get(), fail)
            : fail == null ? null : fail.get();
  }

```

### ReturnNull
Return of `null`
in `src/main/java/org/jetbrains/jetCheck/StructureNode.java`
#### Snippet
```java
      minValue = Math.max(minValue, distribution.getMin());
    }
    return tryInt(minValue, () -> null, this::tryNegation);
  }

```

### ReturnNull
Return of `null`
in `src/main/java/org/jetbrains/jetCheck/StructureNode.java`
#### Snippet
```java

  private ShrinkStep divisionLoop(int value) {
    if (value == 0) return null;
    int divided = value / 2;
    return tryInt(divided, () -> divisionLoop(divided), null);
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-28-19-14-14.630.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `CannotRestoreValue` does not end with 'Exception'
in `src/main/java/org/jetbrains/jetCheck/CannotRestoreValue.java`
#### Snippet
```java
 * @author peter
 */
class CannotRestoreValue extends RuntimeException {
  CannotRestoreValue() {
  }
```

### ExceptionNameDoesntEndWithException
Exception class name `WrongDataStructure` does not end with 'Exception'
in `src/main/java/org/jetbrains/jetCheck/GenerativeDataStructure.java`
#### Snippet
```java
}

class WrongDataStructure extends IllegalStateException {
  WrongDataStructure() {
    super("You're calling methods on wrong environment, confusing nested lambda arguments?");
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`s.length() > 0` can be replaced with '!s.isEmpty()'
in `src/main/java/org/jetbrains/jetCheck/Generator.java`
#### Snippet
```java
                               5, digits(),
                               1, constant('_')))
      .suchThat(s -> s.length() > 0 && !Character.isDigit(s.charAt(0)));
  }

```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/jetbrains/jetCheck/StructureNode.java`
#### Snippet
```java
      @Override
      public String toString() {
        return "-" + step.toString();
      }
    };
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Random`
in `src/main/java/org/jetbrains/jetCheck/BoundedIntDistribution.java`
#### Snippet
```java
  private final ToIntFunction<Random> producer;

  BoundedIntDistribution(int min, int max, ToIntFunction<Random> producer) {
    if (min > max) throw new IllegalArgumentException(min + ">" + max);
    this.min = min;
```

### BoundedWildcard
Can generalize to `? super StructureNode`
in `src/main/java/org/jetbrains/jetCheck/ShrinkStep.java`
#### Snippet
```java
  static ShrinkStep create(@NotNull NodeId replaced,
                           @NotNull StructureElement replacement,
                           @Nullable Function<StructureNode, ShrinkStep> onSuccess,
                           @Nullable Supplier<ShrinkStep> onFailure) {
    return new ShrinkStep() {
```

### BoundedWildcard
Can generalize to `? extends ShrinkStep`
in `src/main/java/org/jetbrains/jetCheck/ShrinkStep.java`
#### Snippet
```java
  static ShrinkStep create(@NotNull NodeId replaced,
                           @NotNull StructureElement replacement,
                           @Nullable Function<StructureNode, ShrinkStep> onSuccess,
                           @Nullable Supplier<ShrinkStep> onFailure) {
    return new ShrinkStep() {
```

### BoundedWildcard
Can generalize to `? extends ShrinkStep`
in `src/main/java/org/jetbrains/jetCheck/ShrinkStep.java`
#### Snippet
```java
                           @NotNull StructureElement replacement,
                           @Nullable Function<StructureNode, ShrinkStep> onSuccess,
                           @Nullable Supplier<ShrinkStep> onFailure) {
    return new ShrinkStep() {

```

### BoundedWildcard
Can generalize to `? extends CustomizedNode`
in `src/main/java/org/jetbrains/jetCheck/PropertyFailureImpl.java`
#### Snippet
```java

  @Nullable
  private ShrinkStep processDelayedCombinations(List<CustomizedNode> delayed) {
    Collections.sort(delayed);

```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/java/org/jetbrains/jetCheck/Scenario.java`
#### Snippet
```java
      }

      private void innerCommandLists(final Generator<List<Object>> listGen) {
        data.generate(Generator.from(new EquivalentGenerator<List<Object>>() {
          @Override
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/jetbrains/jetCheck/Scenario.java`
#### Snippet
```java
  private final Consumer<String> logConsumer;

  private Scenario(@NotNull ImperativeCommand cmd, @NotNull GenerationEnvironment data, Consumer<String> logConsumer) {
    this.logConsumer = logConsumer;
    try {
```

### BoundedWildcard
Can generalize to `? extends ShrinkStep`
in `src/main/java/org/jetbrains/jetCheck/StructureNode.java`
#### Snippet
```java
  }

  private ShrinkStep tryInt(int value, @NotNull Supplier<ShrinkStep> success, @Nullable Supplier<ShrinkStep> fail) {
    return distribution.isValidValue(value)
            ? ShrinkStep.create(id, new IntData(id, value, distribution), __ -> success.get(), fail)
```

### BoundedWildcard
Can generalize to `? extends StructureNode`
in `src/main/java/org/jetbrains/jetCheck/StructureNode.java`
#### Snippet
```java

  @Nullable
  private ShrinkStep tryReplacing(List<StructureNode> candidates, int index) {
    if (index < candidates.size()) {
      StructureNode replacement = candidates.get(index);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/jetbrains/jetCheck/Generator.java`
#### Snippet
```java
  }

  private static <T> List<T> generateList(Generator<T> itemGenerator, GenerationEnvironment data, int size) {
    ((AbstractDataStructure) data).changeKind(StructureKind.LIST);
    List<T> list = new ArrayList<>(size);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/jetbrains/jetCheck/Generator.java`
#### Snippet
```java

  /** A generator that returns one of the given values with equal probability */
  public static <T> Generator<T> sampledFrom(List<T> values) {
    return anyOf(values.stream().map(Generator::constant).collect(Collectors.toList()));
  }
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `static abstract`
in `src/main/java/org/jetbrains/jetCheck/Scenario.java`
#### Snippet
```java
  }

  private static abstract class EquivalentGenerator<T> implements Function<GenerationEnvironment, T> {
    @Override
    public boolean equals(Object obj) {
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `silent` is always 'false'
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
    public Parameters printRawData() {
      if (silent) throw new IllegalStateException("'printRawData' is incompatible with 'silent'");
      return new Parameters(globalSeed, serializedData, sizeHintFun, iterationCount, silent, printValues, true);
    }

```

### ConstantValue
Value `serializedData` is always 'null'
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
      }

      return new Parameters(globalSeed, serializedData, sizeHintFun, iterationCount, silent, printValues, printData);
    }

```

### ConstantValue
Value `printValues` is always 'false'
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
      if (printValues) throw new IllegalStateException("'silent' is incompatible with 'printGeneratedValues'");
      if (printData) throw new IllegalStateException("'silent' is incompatible with 'printRawData'");
      return new Parameters(globalSeed, serializedData, sizeHintFun, iterationCount, true, printValues, printData);
    }

```

### ConstantValue
Value `printData` is always 'false'
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
      if (printValues) throw new IllegalStateException("'silent' is incompatible with 'printGeneratedValues'");
      if (printData) throw new IllegalStateException("'silent' is incompatible with 'printRawData'");
      return new Parameters(globalSeed, serializedData, sizeHintFun, iterationCount, true, printValues, printData);
    }

```

### ConstantValue
Value `serializedData` is always 'null'
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
      }

      return new Parameters(seed, serializedData, sizeHintFun, iterationCount, silent, printValues, printData);
    }

```

### ConstantValue
Value `silent` is always 'false'
in `src/main/java/org/jetbrains/jetCheck/PropertyChecker.java`
#### Snippet
```java
    public Parameters printGeneratedValues() {
      if (silent) throw new IllegalStateException("'printGeneratedValues' is incompatible with 'silent'");
      return new Parameters(globalSeed, serializedData, sizeHintFun, iterationCount, silent, true, printData);
    }

```

