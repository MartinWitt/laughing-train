# gradle-jdks-latest 
 
# Bad smells
I found 1 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| CodeBlock2Expr | 1 | true |
## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-jdks-latest/src/main/java/com/palantir/gradle/jdkslatest/LatestJdksPlugin.java`
#### Snippet
```java
        JdksExtension jdksExtension = project.getExtensions().getByType(JdksExtension.class);

        deserializeLatestJdkVersions().forEach((javaVersionAsString, jdkInfo) -> {
            jdksExtension.jdk(JavaLanguageVersion.of(javaVersionAsString), jdkExtension -> {
                jdkExtension.getDistributionName().set(jdkInfo.distribution());
```

