# keyple-plugin-cardresource-java-lib 
 
# Bad smells
I found 4 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 2 | false |
| ReplaceCallWithBinaryOperator | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=ReplaceCallWithBinaryOperator]
### ReplaceCallWithBinaryOperator
Call can be replaced with binary operator
in `build.gradle.kts`
#### Snippet
```java
      property("sonar.login", System.getenv("SONAR_LOGIN"))
      System.getenv("BRANCH_NAME")?.let {
        if (!"main".equals(it)) {
          property("sonar.branch.name", it)
        }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'withJavadocJar()' is marked unstable with @Incubating
in `build.gradle.kts`
#### Snippet
```java
  targetCompatibility = JavaVersion.toVersion(javaTargetLevel)
  println("Compiling Java $sourceCompatibility to Java $targetCompatibility.")
  withJavadocJar()
  withSourcesJar()
}
```

### UnstableApiUsage
'withSourcesJar()' is marked unstable with @Incubating
in `build.gradle.kts`
#### Snippet
```java
  println("Compiling Java $sourceCompatibility to Java $targetCompatibility.")
  withJavadocJar()
  withSourcesJar()
}

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Assert.notEmpty()` is ignored
in `src/main/java/org/eclipse/keyple/plugin/cardresource/CardResourcePluginFactoryBuilder.java`
#### Snippet
```java
        .notEmpty(cardResourceProfileNames, "cardResourceProfileNames");
    for (String cardResourceProfileName : cardResourceProfileNames) {
      Assert.getInstance().notEmpty(cardResourceProfileName, "cardResourceProfileName");
    }
    return new Builder(pluginName, cardResourceService, cardResourceProfileNames);
```

