# Grammar-Kit 
 
# Bad smells
I found 5 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 5 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-Grammar-Kit-83103593776843211659126051358800496651/src/org/intellij/grammar/BnfParserDefinition.java`
#### Snippet
```java
astNode.getElementType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-Grammar-Kit-83103593776843211659126051358800496651/src/org/intellij/grammar/psi/impl/BnfCompositeImpl.java`
#### Snippet
```java
getNode().getElementType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-Grammar-Kit-83103593776843211659126051358800496651/tests/org/intellij/grammar/expression/ExpressionParserDefinition.java`
#### Snippet
```java
astNode.getElementType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-Grammar-Kit-83103593776843211659126051358800496651/src/org/intellij/jflex/parser/JFlexParserDefinition.java`
#### Snippet
```java
astNode.getElementType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-Grammar-Kit-83103593776843211659126051358800496651/src/org/intellij/jflex/editor/JFlexFindUsagesProvider.java`
#### Snippet
```java
node.getElementType().toString()
```

