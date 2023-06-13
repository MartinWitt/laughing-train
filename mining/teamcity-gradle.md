# teamcity-gradle 
 
# Bad smells
I found 1 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 1 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-teamcity-gradle-14784641572107506943844821120662595032/gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleRunnerService.java`
#### Snippet
```java
getBuild().getBuildTypeOptionValue(BuildTypeOptions.BT_SUPPORT_TEST_RETRY).toString()
```

