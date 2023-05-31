# maven-jlink-plugin 
 
# Bad smells
I found 7 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| MismatchedCollectionQueryUpdate | 4 | false |
| TrivialIf | 2 | false |
| TrivialStringConcatenation | 1 | false |
## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/maven/plugins/jlink/JLinkMojo.java`
#### Snippet
```java
        {
            jlinkArgs.add( "--compress" );
            jlinkArgs.add( compress + "" );
        }
        if ( launcher != null )
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `modulePaths` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/jlink/JLinkMojo.java`
#### Snippet
```java
     */
    @Parameter
    private List<String> modulePaths;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `addModules` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/jlink/JLinkMojo.java`
#### Snippet
```java
     */
    @Parameter
    private List<String> addModules;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `modulesToAdd` are updated, but never queried
in `src/main/java/org/apache/maven/plugins/jlink/AbstractJLinkExecutor.java`
#### Snippet
```java
    private final Log log;

    private final List<String> modulesToAdd = new ArrayList<>();
    private final List<String> modulePaths = new ArrayList<>();

```

### MismatchedCollectionQueryUpdate
Contents of collection `modulePaths` are updated, but never queried
in `src/main/java/org/apache/maven/plugins/jlink/AbstractJLinkExecutor.java`
#### Snippet
```java

    private final List<String> modulesToAdd = new ArrayList<>();
    private final List<String> modulePaths = new ArrayList<>();

    AbstractJLinkExecutor( Log log )
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/maven/plugins/jlink/JLinkMojo.java`
#### Snippet
```java
    {
        boolean result = false;
        if ( getClassifier() != null && !getClassifier().isEmpty() )
        {
            result = true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/maven/plugins/jlink/AbstractJLinkMojo.java`
#### Snippet
```java
    {
        boolean result = false;
        if ( classifier != null && !classifier.isEmpty() )
        {
            result = true;
```

