# spooet 
 
# Bad smells
I found 4 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 4 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-spooet-53478983341067807807652612221167337416/src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
ctField.getDefaultExpression().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-spooet-53478983341067807807652612221167337416/src/main/java/spoon/reflect/visitor/JavaPoetPrettyPrinter.java`
#### Snippet
```java
stringObjectEntry.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-spooet-53478983341067807807652612221167337416/src/main/java/spoon/reflect/visitor/internal/CodePrinter.java`
#### Snippet
```java
ctCatch.getParameter().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-spooet-53478983341067807807652612221167337416/src/main/java/spoon/reflect/visitor/internal/CodePrinter.java`
#### Snippet
```java
ifElement.getCondition().toString()
```

