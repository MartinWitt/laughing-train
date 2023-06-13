# compile-testing 
 
# Bad smells
I found 1 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 1 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-compile-testing-20679530258573530845010375982287261930/src/main/java/com/google/testing/compile/InMemoryJavaFileManager.java`
#### Snippet
```java
MoreObjects.toStringHelper(this).add("uri", toUri()).add("kind", kind).toString()
```

