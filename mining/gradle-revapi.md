# gradle-revapi 
 
# Bad smells
I found 2 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 2 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-revapi350407391974974244029916424499690014/src/main/java/com/palantir/gradle/revapi/ImmutablesFilter.java`
#### Snippet
```java
annotationMirror.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-gradle-revapi350407391974974244029916424499690014/src/main/java/com/palantir/gradle/revapi/RevapiExtension.java`
#### Snippet
```java
project.getGroup().toString()
```

