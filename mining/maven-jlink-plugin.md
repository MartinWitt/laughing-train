# maven-jlink-plugin 
 
# Bad smells
I found 9 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| MismatchedCollectionQueryUpdate | 4 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| GroovyUnusedAssignment | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| TrivialStringConcatenation | 1 | false |
## RuleId[ruleID=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `src/it/projects/MJLINK-40_includeLocales/verify.groovy`
#### Snippet
```java
    }

    def line = buildLog.eachLine { line ->
        if (line.contains('--include-locales, en,ja,de,*-IN'))
        {
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`tcs.size() > 0` can be replaced with '!tcs.isEmpty()'
in `src/main/java/org/apache/maven/plugins/jlink/AbstractJLinkMojo.java`
#### Snippet
```java
                        "jdk", jdkToolchain );

                if ( tcs != null && tcs.size() > 0 )
                {
                    tc = tcs.get( 0 );
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/jlink/AbstractJLinkToolchainExecutor.java`
#### Snippet
```java
        {
            // no quoted arguments ???
            getLog().debug( CommandLineUtils.toString( cmd.getCommandline() ).replaceAll( "'", "" ) );
        }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/jlink/AbstractJLinkMojo.java`
#### Snippet
```java
        // Split the module path by either ":" or ";" linux/windows path separator and
        // convert uniformly to the platform used separator.
        String[] splitModule = pluginModulePath.split( "[;:]" );
        for ( String module : splitModule )
        {
```

## RuleId[ruleID=TrivialStringConcatenation]
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

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `modulePaths` are updated, but never queried
in `src/main/java/org/apache/maven/plugins/jlink/AbstractJLinkExecutor.java`
#### Snippet
```java

    private final List<String> modulesToAdd = new ArrayList<>();
    private final List<String> modulePaths = new ArrayList<>();

    AbstractJLinkExecutor( Log log )
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
Contents of collection `modulePaths` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/jlink/JLinkMojo.java`
#### Snippet
```java
     */
    @Parameter
    private List<String> modulePaths;

    /**
```

