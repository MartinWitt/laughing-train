# CoCoSpoon 
 
# Bad smells
I found 7 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNUSED_IMPORT | 3 | false |
| FieldMayBeFinal | 2 | false |
| UNCHECKED_WARNING | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtSwitch' to 'spoon.reflect.code.CtSwitch\>'
in `src/main/java/fil/iagl/opl/cocospoon/insert/impl/SwitchInsert.java`
#### Snippet
```java
  @Override
  public void apply(CtElement element, CtStatement statementToInsert) {
    CtSwitch<CtCase<?>> ctSwitch = (CtSwitch) element;
    CtBlock<?> ctBlock = element.getParent(CtBlock.class);
    int idx = -1;
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.io.File;`
in `src/main/java/instrumenting/_Instrumenting.java`
#### Snippet
```java
package instrumenting;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
```

### UNUSED_IMPORT
Unused import `import java.io.FileInputStream;`
in `src/main/java/instrumenting/_Instrumenting.java`
#### Snippet
```java

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
```

### UNUSED_IMPORT
Unused import `import java.io.ObjectInputStream;`
in `src/main/java/instrumenting/_Instrumenting.java`
#### Snippet
```java
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `lookingFor` may be 'final'
in `src/main/java/fil/iagl/opl/cocospoon/tools/EqualsElementFilter.java`
#### Snippet
```java
public class EqualsElementFilter implements Filter<CtElement> {

  private CtElement lookingFor;

  public EqualsElementFilter(CtElement lookingFor) {
```

### FieldMayBeFinal
Field `lookingFor` may be 'final'
in `src/main/java/fil/iagl/opl/cocospoon/tools/ContainsSameElementFilter.java`
#### Snippet
```java
public class ContainsSameElementFilter implements Filter<CtElement> {

  private CtElement lookingFor;

  public ContainsSameElementFilter(CtElement lookingFor) {
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `isInsideWhileExpression` is always `false`
in `src/main/java/fil/iagl/opl/cocospoon/processors/WatcherProcessor.java`
#### Snippet
```java
		}

		return isInsideIfExpression || isInsideDoExpression || isInsideForExpression || isInsideForInit || isInsideForUpdate || isInsideSwitchInit || isInsideWhileExpression;
	}

```

