# Cognitive-Vision-Android 
 
# Bad smells
I found 3 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| GroovyUnusedAssignment | 3 | false |
## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `ClientLibrary/lib/build.gradle`
#### Snippet
```java

// Group ID is the project name
group = "com.microsoft.projectoxford"
// Artifact name is the name of the technology
archivesBaseName = "vision"
```

### GroovyUnusedAssignment
Assignment is not used
in `ClientLibrary/lib/build.gradle`
#### Snippet
```java
group = "com.microsoft.projectoxford"
// Artifact name is the name of the technology
archivesBaseName = "vision"
// Update your version
version = "1.0.394"
```

### GroovyUnusedAssignment
Assignment is not used
in `ClientLibrary/lib/build.gradle`
#### Snippet
```java
archivesBaseName = "vision"
// Update your version
version = "1.0.394"

uploadArchives {
```

