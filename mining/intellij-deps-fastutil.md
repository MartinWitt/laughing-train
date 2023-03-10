# intellij-deps-fastutil 
 
# Bad smells
I found 2 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| ConstantValue | 1 | false |
## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Usages` has only 'static' members, and lacks a 'private' constructor
in `src/usages/Usages.java`
#### Snippet
```java
import it.unimi.dsi.fastutil.objects.*;

public final class Usages {
  public static void main(String[] args) {
    Hash.Strategy<String> strategy = new Hash.Strategy<String>() {
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `IntLists.EMPTY_LIST != null` is always `true`
in `src/usages/Usages.java`
#### Snippet
```java

    //noinspection StatementWithEmptyBody
    if (IntLists.EMPTY_LIST != null) {
    }
  }
```

