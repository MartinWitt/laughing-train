# assertj-assertions-generator 
 
# Bad smells
I found 1 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 1 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-assertions-generator-90200825899970453521658480283928766235/src/main/java/org/assertj/assertions/generator/util/ClassUtil.java`
#### Snippet
```java
type.getRawType().toString()
```

