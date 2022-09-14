# MartinWitt/laughing-train
# Bad smells
I found 3 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| GroovyUnusedAssignment | 3 | false |
## GroovyUnusedAssignment
### GroovyUnusedAssignment
Assignment is not used
in `code-transformation/build.gradle`
#### Snippet
```java
	id 'xyz.keksdose.spoon.code_solver.java-common-conventions'
}
version = "0.0.5"

jar {
```

### GroovyUnusedAssignment
Assignment is not used
in `code-transformation/build.gradle`
#### Snippet
```java


def test = tasks.named("test") {
	useJUnitPlatform {
		excludeTags "Mining"
```

### GroovyUnusedAssignment
Assignment is not used
in `code-transformation/build.gradle`
#### Snippet
```java
}

def mining = tasks.register("mining", Test) {
	useJUnitPlatform {
		includeTags "Mining"
```

