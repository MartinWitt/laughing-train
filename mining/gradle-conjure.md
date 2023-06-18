# gradle-conjure 
 
# Bad smells
I found 3 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 3 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-conjure72534847074213990599781909811920725657/gradle-conjure/src/main/java/com/palantir/gradle/conjure/CompileConjurePythonTask.java`
#### Snippet
```java
getProject().getVersion().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-conjure72534847074213990599781909811920725657/gradle-conjure/src/main/java/com/palantir/gradle/conjure/CompileConjureTypeScriptTask.java`
#### Snippet
```java
project.getVersion().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-conjure72534847074213990599781909811920725657/gradle-conjure/src/main/java/com/palantir/gradle/conjure/ConjureJavaLocalCodegenPlugin.java`
#### Snippet
```java
project.getGroup().toString()
```

