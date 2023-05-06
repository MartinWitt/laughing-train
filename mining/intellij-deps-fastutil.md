# intellij-deps-fastutil 
 
# Bad smells
I found 1 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ConstantValue | 1 | false |
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

