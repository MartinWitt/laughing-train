# teamcity-fxcop 
 
# Bad smells
I found 3 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 3 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-teamcity-fxcop1855941272401149351985084988824627236/fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopBuildService.java`
#### Snippet
```java
getCheckoutDirectory().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-teamcity-fxcop1855941272401149351985084988824627236/fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopDataProcessor.java`
#### Snippet
```java
currentBuild.getCheckoutDirectory().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-teamcity-fxcop1855941272401149351985084988824627236/fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopFileProcessor.java`
#### Snippet
```java
InspectionAttributesId.SEVERITY.toString()
```

