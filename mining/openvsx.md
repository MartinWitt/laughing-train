# openvsx 
 
# Bad smells
I found 1 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| GroovyUnusedAssignment | 1 | false |
## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `server/build.gradle`
#### Snippet
```java
]
ext['junit-jupiter.version'] = versions.junit
sourceCompatibility = versions.java

repositories {
```

