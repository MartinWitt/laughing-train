# kiota-java 
 
# Bad smells
I found 5 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| GroovyUnusedAssignment | 5 | false |
## RuleId[ruleID=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `components/serialization/text/build.gradle`
#### Snippet
```java
tasks.withType(Sign)*.enabled = mavenCentralPublishingEnabled.toBoolean()

def fixAscNames = { name -> 
    if(name.contains('pom')) {
        "${project.property('mavenArtifactId')}-${mavenMajorVersion}.${mavenMinorVersion}.${mavenPatchVersion}.pom.asc"
```

### GroovyUnusedAssignment
Assignment is not used
in `components/http/okHttp/build.gradle`
#### Snippet
```java
tasks.withType(Sign)*.enabled = mavenCentralPublishingEnabled.toBoolean()

def fixAscNames = { name -> 
    if(name.contains('pom')) {
        "${project.property('mavenArtifactId')}-${mavenMajorVersion}.${mavenMinorVersion}.${mavenPatchVersion}.pom.asc"
```

### GroovyUnusedAssignment
Assignment is not used
in `components/authentication/azure/build.gradle`
#### Snippet
```java
tasks.withType(Sign)*.enabled = mavenCentralPublishingEnabled.toBoolean()

def fixAscNames = { name -> 
    if(name.contains('pom')) {
        "${project.property('mavenArtifactId')}-${mavenMajorVersion}.${mavenMinorVersion}.${mavenPatchVersion}.pom.asc"
```

### GroovyUnusedAssignment
Assignment is not used
in `components/abstractions/build.gradle`
#### Snippet
```java
tasks.withType(Sign)*.enabled = mavenCentralPublishingEnabled.toBoolean()

def fixAscNames = { name -> 
    if(name.contains('pom')) {
        "${project.property('mavenArtifactId')}-${mavenMajorVersion}.${mavenMinorVersion}.${mavenPatchVersion}.pom.asc"
```

### GroovyUnusedAssignment
Assignment is not used
in `components/serialization/json/build.gradle`
#### Snippet
```java
tasks.withType(Sign)*.enabled = mavenCentralPublishingEnabled.toBoolean()

def fixAscNames = { name -> 
    if(name.contains('pom')) {
        "${project.property('mavenArtifactId')}-${mavenMajorVersion}.${mavenMinorVersion}.${mavenPatchVersion}.pom.asc"
```

