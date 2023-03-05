# malmo 
 
# Bad smells
I found 2 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| GroovyUnusedAssignment | 2 | false |
## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `Minecraft/build.gradle`
#### Snippet
```java
version = versionProp['malmomod.version']

group= "com.microsoft.MalmoMod" // http://maven.apache.org/guides/mini/guide-naming-conventions.html
archivesBaseName = "MalmoMod"

```

### GroovyUnusedAssignment
Assignment is not used
in `Minecraft/build.gradle`
#### Snippet
```java

group= "com.microsoft.MalmoMod" // http://maven.apache.org/guides/mini/guide-naming-conventions.html
archivesBaseName = "MalmoMod"

minecraft {
```

