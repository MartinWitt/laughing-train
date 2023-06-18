# teamcity-kubernetes-plugin 
 
# Bad smells
I found 2 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 2 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-teamcity-kubernetes-plugin-41843461503903906586870749441923536499/teamcity-kubernetes-plugin-server/src/main/java/jetbrains/buildServer/clouds/kubernetes/KubeCloudImageImpl.java`
#### Snippet
```java
node.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-teamcity-kubernetes-plugin-41843461503903906586870749441923536499/teamcity-kubernetes-plugin-server/src/main/java/jetbrains/buildServer/clouds/kubernetes/KubeCloudImageImpl.java`
#### Snippet
```java
node.toString()
```

