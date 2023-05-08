# diffmin 
 
# Bad smells
I found 1 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalGetWithoutIsPresent | 1 | false |
## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`OptionalInt.getAsInt()` without 'isPresent()' check
in `src/main/java/com/diffmin/patch/PatchGeneration.java`
#### Snippet
```java
                                    .filter((i) -> newCollectionList.get(i) == srcNode)
                                    .findFirst()
                                    .getAsInt();
                        }
                        return -1;
```

