# xtext 
 
# Bad smells
I found 2 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| GroovyUnusedAssignment | 2 | false |
## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.xtext.tests/testdata/wizard-expectations/lsGradleApp/lsGradleApp.parent/lsGradleApp.ide/build.gradle`
#### Snippet
```java

apply plugin: 'application'
mainClassName = "org.eclipse.xtext.ide.server.ServerLauncher"


```

### GroovyUnusedAssignment
Assignment is not used
in `org.eclipse.xtext.tests/testdata/wizard-expectations/lsGradleFatjar/lsGradleFatjar.parent/lsGradleFatjar.ide/build.gradle`
#### Snippet
```java
apply plugin: 'application'
apply plugin: 'com.github.johnrengelman.shadow'
mainClassName = "org.eclipse.xtext.ide.server.ServerLauncher"

shadowJar {
```

