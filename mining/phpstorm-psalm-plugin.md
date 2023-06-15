# phpstorm-psalm-plugin 
 
# Bad smells
I found 3 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 3 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-phpstorm-psalm-plugin287661603056683103316177535688030485790/src/com/jetbrains/php/psalm/lang/PsalmAdvancedClosureParameterInfoHandler.java`
#### Snippet
```java
p.getSecond().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-phpstorm-psalm-plugin287661603056683103316177535688030485790/src/com/jetbrains/php/psalm/lang/PsalmAdvancedClosureParameterInfoHandler.java`
#### Snippet
```java
p.getSecond().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-phpstorm-psalm-plugin287661603056683103316177535688030485790/src/com/jetbrains/php/tools/quality/psalm/PsalmGlobalInspection.java`
#### Snippet
```java
configPath.toString()
```

