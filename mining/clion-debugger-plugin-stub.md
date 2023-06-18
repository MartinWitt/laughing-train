# clion-debugger-plugin-stub 
 
# Bad smells
I found 1 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 1 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-clion-debugger-plugin-stub-389290896199387216616465580523641924823/src/com/jetbrains/clion/bugeater/debugger/BugEaterDriver.java`
#### Snippet
```java
Paths.get(project.getBasePath(), "main.cpp").toString()
```

