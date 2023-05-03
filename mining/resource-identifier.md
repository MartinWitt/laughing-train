# resource-identifier 
 
# Bad smells
I found 1 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| TrivialIf | 1 | false |
## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/com/palantir/ri/ResourceIdentifier.java`
#### Snippet
```java

        int locatorIndex = getLocatorIndex(rid, typeIndex + 1);
        if (locatorIndex != INDEX_END) {
            return false;
        }
```

