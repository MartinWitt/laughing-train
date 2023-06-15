# assertj-examples 
 
# Bad smells
I found 2 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 2 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-examples-340478412758650500410840357441327349025/assertions-examples/src/test/java/org/assertj/examples/PathAssertionsExamples.java`
#### Snippet
```java
path.getFileName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-examples-340478412758650500410840357441327349025/assertions-examples/src/test/java/org/assertj/examples/PathAssertionsExamples.java`
#### Snippet
```java
path.getFileName().toString()
```

