# mwt-ds-explore-java 
 
# Bad smells
I found 30 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 13 | false |
| UnusedAssignment | 5 | false |
| UnnecessaryToStringCall | 4 | true |
| FieldCanBeLocal | 2 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| UNUSED_IMPORT | 1 | false |
| EmptyStatementBody | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/com/mwt/explorers/TauFirstExplorer.java`
#### Snippet
```java
    boolean logAction;

    if ((tau > 0) && explore) {
      tau--;
      chosenAction = random.uniformInt(1, numActionsForContext); // Add 1 because actions are 1-indexed
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.Random;`
in `src/main/java/com/mwt/explorers/TauFirstExplorer.java`
#### Snippet
```java
import com.mwt.utilities.PRG;

import java.util.Random;

/**
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`else` statement has empty body
in `src/main/java/com/mwt/sample/ExploreOnlySample.java`
#### Snippet
```java

      System.out.println(out.toString());
    } else {
      // Add error here
    }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/mwt/sample/ExploreOnlySample.java`
#### Snippet
```java
      }

      System.out.println(out.toString());
    } else if (explorationType.equals("bootstrap")) {
      // Initialize Bootstrap explore algorithm using custom Recorder, Policy & Context types
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/mwt/sample/ExploreOnlySample.java`
#### Snippet
```java
      }

      System.out.println(out.toString());
    } else if (explorationType.equals("softmax")) {
      // Initialize Softmax explore algorithm using custom Recorder, Scorer & Context types
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/mwt/sample/ExploreOnlySample.java`
#### Snippet
```java
      }

      System.out.println(out.toString());
    } else if (explorationType.equals("generic")) {
      // Initialize Generic explore algorithm using custom Recorder, Scorer & Context types
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/mwt/sample/ExploreOnlySample.java`
#### Snippet
```java
      }

      System.out.println(out.toString());
    } else {
      // Add error here
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `chosenAction` initializer `0` is redundant
in `src/main/java/com/mwt/explorers/TauFirstExplorer.java`
#### Snippet
```java
    PRG random = new PRG(saltedSeed);

    int chosenAction = 0;
    float actionProbability = 0.0f;
    boolean logAction;
```

### UnusedAssignment
Variable `actionProbability` initializer `0.0f` is redundant
in `src/main/java/com/mwt/explorers/TauFirstExplorer.java`
#### Snippet
```java

    int chosenAction = 0;
    float actionProbability = 0.0f;
    boolean logAction;

```

### UnusedAssignment
Variable `actionProbability` initializer `0.0f` is redundant
in `src/main/java/com/mwt/explorers/BootstrapExplorer.java`
#### Snippet
```java
    // Invoke the default policy function to get the action
    int chosenAction = 0;
    float actionProbability = 0.0f;

    if (explore) {
```

### UnusedAssignment
Variable `actionFromBag` initializer `0` is redundant
in `src/main/java/com/mwt/explorers/BootstrapExplorer.java`
#### Snippet
```java

    if (explore) {
      int actionFromBag = 0;
      int[] actionsSelected = new int[numActionsForContext];

```

### UnusedAssignment
Variable `actionProbability` initializer `0f` is redundant
in `src/main/java/com/mwt/explorers/EpsilonGreedyExplorer.java`
#### Snippet
```java

    float epsilon = explore ? this.epsilon : 0f;
    float actionProbability = 0f;
    float baseProbability = epsilon / (float) numActionsForContext;
    if (random.uniformUnitInterval() < (1.0f - epsilon)) {
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/com/mwt/misc/Feature.java`
#### Snippet
```java

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `id` may be 'final'
in `src/main/java/com/mwt/misc/Feature.java`
#### Snippet
```java
final public class Feature {
  private float value;
  private int id;

  public Feature(int id, float value) {
```

### FieldMayBeFinal
Field `value` may be 'final'
in `src/main/java/com/mwt/misc/Feature.java`
#### Snippet
```java
 */
final public class Feature {
  private float value;
  private int id;

```

### FieldMayBeFinal
Field `numActions` may be 'final'
in `src/main/java/com/mwt/sample/MyScorer.java`
#### Snippet
```java
 */
class MyScorer implements Scorer<MyContext> {
  private int numActions;

  public MyScorer(int numActions) {
```

### FieldMayBeFinal
Field `index` may be 'final'
in `src/main/java/com/mwt/sample/MyPolicy.java`
#### Snippet
```java
 */
class MyPolicy implements Policy<MyContext> {
  private int index;

  public MyPolicy() {
```

### FieldMayBeFinal
Field `numActions` may be 'final'
in `src/main/java/com/mwt/explorers/TauFirstExplorer.java`
#### Snippet
```java
  private int tau;
  private boolean explore = true;
  private int numActions;

  /**
```

### FieldMayBeFinal
Field `interactions` may be 'final'
in `src/main/java/com/mwt/sample/MyRecorder.java`
#### Snippet
```java
 */
class MyRecorder implements Recorder<MyContext> {
  private List<Interaction<MyContext>> interactions = new ArrayList<Interaction<MyContext>>();
  public void record(MyContext context, int action, float probability, String uniqueKey) {
    interactions.add(new Interaction<MyContext>(context, action, probability, uniqueKey));
```

### FieldMayBeFinal
Field `record` may be 'final'
in `src/main/java/com/mwt/misc/DecisionTuple.java`
#### Snippet
```java
  private int action;
  private float probability;
  private boolean record;

  public DecisionTuple(int action, float probability, boolean record) {
```

### FieldMayBeFinal
Field `probability` may be 'final'
in `src/main/java/com/mwt/misc/DecisionTuple.java`
#### Snippet
```java
public class DecisionTuple {
  private int action;
  private float probability;
  private boolean record;

```

### FieldMayBeFinal
Field `action` may be 'final'
in `src/main/java/com/mwt/misc/DecisionTuple.java`
#### Snippet
```java
 */
public class DecisionTuple {
  private int action;
  private float probability;
  private boolean record;
```

### FieldMayBeFinal
Field `features` may be 'final'
in `src/main/java/com/mwt/contexts/SimpleContext.java`
#### Snippet
```java
 */
public class SimpleContext {
  private ArrayList<Feature> features;

  public SimpleContext(ArrayList<Feature> features) {
```

### FieldMayBeFinal
Field `numActions` may be 'final'
in `src/main/java/com/mwt/explorers/EpsilonGreedyExplorer.java`
#### Snippet
```java
  private final float epsilon;
  private boolean explore = true;
  private int numActions;

  /**
```

### FieldMayBeFinal
Field `appId` may be 'final'
in `src/main/java/com/mwt/explorers/MwtExplorer.java`
#### Snippet
```java
 */
public class MwtExplorer<T> {
  private long appId;
  private Recorder<T> recorder;

```

### FieldMayBeFinal
Field `recorder` may be 'final'
in `src/main/java/com/mwt/explorers/MwtExplorer.java`
#### Snippet
```java
public class MwtExplorer<T> {
  private long appId;
  private Recorder<T> recorder;

  /**
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/mwt/utilities/MurMurHash3.java`
#### Snippet
```java
 *  algorithms are optimized for their respective platforms.
 *  <p>
 *  See also http://github.com/yonik/java_util for future updates to this file.
 */
public final class MurMurHash3 {
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `logAction` is always 'true'
in `src/main/java/com/mwt/explorers/TauFirstExplorer.java`
#### Snippet
```java
    }

    return new DecisionTuple(chosenAction, actionProbability, logAction);
  }

```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/mwt/sample/MyPolicy.java`
#### Snippet
```java
 */
class MyPolicy implements Policy<MyContext> {
  private int index;

  public MyPolicy() {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/mwt/explorers/GenericExplorer.java`
#### Snippet
```java
public class GenericExplorer<T> implements Explorer<T>, ConsumeScorer<T> {
  private Scorer<T> defaultScorer;
  private boolean explore = true;
  private final int numActions;

```

