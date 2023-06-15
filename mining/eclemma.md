# eclemma 
 
# Bad smells
I found 4 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 4 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-eclemma72441929622556023818890514762791761504/org.eclipse.eclemma.core.test/src/org/eclipse/eclemma/core/JavaProjectKit.java`
#### Snippet
```java
typepath.removeLastSegments(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-eclemma72441929622556023818890514762791761504/org.eclipse.eclemma.core/src/org/eclipse/eclemma/internal/core/DefaultScopeFilter.java`
#### Snippet
```java
root.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-eclemma72441929622556023818890514762791761504/org.eclipse.eclemma.core/src/org/eclipse/eclemma/internal/core/analysis/SessionAnalyzer.java`
#### Snippet
```java
path.removeFirstSegments(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-eclemma72441929622556023818890514762791761504/org.eclipse.eclemma.ui/src/org/eclipse/eclemma/internal/ui/ScopeViewer.java`
#### Snippet
```java
path.removeFirstSegments(1).toString()
```

