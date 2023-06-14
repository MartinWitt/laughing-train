# simple-store 
 
# Bad smells
I found 2 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 2 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-simple-store636852484162285861718010836729922083590/sample/src/main/java/com/uber/simplestore/sample/JavaActivity.java`
#### Snippet
```java
t.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-simple-store636852484162285861718010836729922083590/sample/src/main/java/com/uber/simplestore/sample/JavaActivity.java`
#### Snippet
```java
editText.getText().toString()
```

