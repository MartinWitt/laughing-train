# assertj-automation 
 
# Bad smells
I found 2 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 2 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-automation-109664738281610328316212427724204595257/assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/AssertjCollectionAssert.java`
#### Snippet
```java
state.getSourceCode().subSequence(ASTHelpers.getStartPosition(tree.getArguments().get(0)), state.getEndPosition(Iterables.getLast(tree.getArguments()))).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-automation-109664738281610328316212427724204595257/assertj-error-prone/src/main/java/com/palantir/assertj/errorprone/PreferAssertj.java`
#### Snippet
```java
type.toString()
```

