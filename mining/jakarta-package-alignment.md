# jakarta-package-alignment 
 
# Bad smells
I found 3 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 2 | false |
| CodeBlock2Expr | 1 | true |
## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `jakarta-package-alignment-mappings/src/main/java/com/palantir/gradle/jakartapackagealignment/VersionMappings.java`
#### Snippet
```java
    }

    private static void addMapping(Map<String, VersionMapping> map, String key, VersionMapping value) {
        if (map.putIfAbsent(key, value) != null) {
            throw new IllegalArgumentException("duplicate key: " + key);
```

### BoundedWildcard
Can generalize to `? super VersionMapping`
in `jakarta-package-alignment-mappings/src/main/java/com/palantir/gradle/jakartapackagealignment/VersionMappings.java`
#### Snippet
```java
    }

    private static void addMapping(Map<String, VersionMapping> map, String key, VersionMapping value) {
        if (map.putIfAbsent(key, value) != null) {
            throw new IllegalArgumentException("duplicate key: " + key);
```

## RuleId[id=CodeBlock2Expr]
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

