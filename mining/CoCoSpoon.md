# CoCoSpoon 
 
# Bad smells
I found 9 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=UNUSED_IMPORT] | 3 | false |
| RuleId[ruleID=NonShortCircuitBoolean] | 2 | false |
| RuleId[ruleID=HtmlWrongAttributeValue] | 1 | false |
| RuleId[ruleID=ExceptionNameDoesntEndWithException] | 1 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 1 | false |
| RuleId[ruleID=ConstantValue] | 1 | false |
## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-22-11-56-32.389.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ExceptionNameDoesntEndWithException]
### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `NoInsertionFound` does not end with 'Exception'
in `src/main/java/fil/iagl/opl/cocospoon/insert/NoInsertionFound.java`
#### Snippet
```java
package fil.iagl.opl.cocospoon.insert;

public class NoInsertionFound extends Exception {

}
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `_Instrumenting` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/instrumenting/_Instrumenting.java`
#### Snippet
```java
import java.util.Map;

public class _Instrumenting {

  public static String CURRENT_DIR;
```

## RuleId[ruleID=NonShortCircuitBoolean]
### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `isInsideForInit &= !statement.getElements(new ContainsSameElementFilter(candidate)).isEmpty()`
in `src/main/java/fil/iagl/opl/cocospoon/processors/WatcherProcessor.java`
#### Snippet
```java
			isInsideForInit = !(ctFor.getForInit() == null);
			for (CtStatement statement : ctFor.getForInit()) {
				isInsideForInit &= !statement.getElements(new ContainsSameElementFilter(candidate)).isEmpty();
				if (!isInsideForInit)
					break;
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `isInsideForUpdate &= !statement.getElements(new ContainsSameElementFilter(candidate)).isEmpty()`
in `src/main/java/fil/iagl/opl/cocospoon/processors/WatcherProcessor.java`
#### Snippet
```java
			isInsideForUpdate = !(ctFor.getForUpdate() == null);
			for (CtStatement statement : ctFor.getForUpdate()) {
				isInsideForUpdate &= !statement.getElements(new ContainsSameElementFilter(candidate)).isEmpty();
				if (!isInsideForUpdate)
					break;
```

## RuleId[ruleID=UNUSED_IMPORT]
### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.io.File;`
in `src/main/java/instrumenting/_Instrumenting.java`
#### Snippet
```java
package instrumenting;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.io.FileInputStream;`
in `src/main/java/instrumenting/_Instrumenting.java`
#### Snippet
```java

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
```

### RuleId[ruleID=UNUSED_IMPORT]
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

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Condition `isInsideWhileExpression` is always `false`
in `src/main/java/fil/iagl/opl/cocospoon/processors/WatcherProcessor.java`
#### Snippet
```java
		}

		return isInsideIfExpression || isInsideDoExpression || isInsideForExpression || isInsideForInit || isInsideForUpdate || isInsideSwitchInit || isInsideWhileExpression;
	}

```

