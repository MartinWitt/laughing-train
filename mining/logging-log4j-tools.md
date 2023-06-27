# logging-log4j-tools 
 
# Bad smells
I found 3 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 2 | false |
| JavadocReference | 1 | false |
## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `freemarker.cache.FileTemplateLoader`
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/exporter/ChangelogExporter.java`
#### Snippet
```java
     * Creates a FreeMarker template name from the given path, assuming that the provided changelog directory is the template folder.
     * <p>
     * {@link freemarker.cache.FileTemplateLoader} works against a template folder, hence the path relativization required.
     * </p>
     */
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@edu.umd.cs.findbugs.annotations.Nullable'
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/importer/MavenChanges.java`
#### Snippet
```java
        final String dev;

        @Nullable
        final String dueTo;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@edu.umd.cs.findbugs.annotations.Nullable'
in `log4j-changelog/src/main/java/org/apache/logging/log4j/changelog/importer/MavenChanges.java`
#### Snippet
```java
    static final class Action {

        @Nullable
        final String issue;

```

