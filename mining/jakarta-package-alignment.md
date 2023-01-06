# jakarta-package-alignment 
 
# Bad smells
I found 1 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| CodeBlock2Expr | 1 | true |
## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `jakarta-package-alignment/src/main/java/com/palantir/gradle/jakartapackagealignment/JakartaPackageAlignmentPlugin.java`
#### Snippet
```java
    @Override
    public final void apply(Project project) {
        project.getConfigurations().configureEach(configuration -> {
            configuration.getResolutionStrategy().getDependencySubstitution().all(dep -> {
                if (dep.getRequested() instanceof ModuleComponentSelector) {
```

