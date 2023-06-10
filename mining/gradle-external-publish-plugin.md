# gradle-external-publish-plugin 
 
# Bad smells
I found 1 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 1 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-external-publish-plugin61814832769741363655046535829294885061/src/main/java/com/palantir/gradle/externalpublish/CheckVersionTask.java`
#### Snippet
```java
getProject().getVersion().toString()
```

