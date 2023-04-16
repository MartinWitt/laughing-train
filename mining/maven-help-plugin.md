# maven-help-plugin 
 
# Bad smells
I found 51 bad smells with 17 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 15 | true |
| BoundedWildcard | 7 | false |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| MismatchedCollectionQueryUpdate | 4 | false |
| PublicFieldAccessedInSynchronizedContext | 4 | false |
| AssignmentToMethodParameter | 3 | false |
| NonStrictComparisonCanBeEquality | 2 | true |
| SystemOutErr | 2 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| IgnoreResultOfCall | 2 | false |
| SynchronizeOnNonFinalField | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| RegExpRedundantEscape | 1 | false |
| RedundantFieldInitialization | 1 | false |
| ReturnNull | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `session`
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
            // Maven 3: PluginParameterExpressionEvaluator gets the current project from the session:
            // synchronize in case another thread wants to fetch the real current project in between
            synchronized ( session )
            {
                session.setCurrentProject( project );
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java

        String deprecation = md.getDeprecated();
        if ( deprecation != null && deprecation.length() <= 0 )
        {
            deprecation = NO_REASON;
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java

            String deprecation = parameter.getDeprecated();
            if ( deprecation != null && deprecation.length() <= 0 )
            {
                deprecation = NO_REASON;
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
                if ( forceStdout )
                {
                    System.out.print( response.toString() );
                    System.out.flush();
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
                {
                    System.out.print( response.toString() );
                    System.out.flush();
                }
            }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/help/EffectivePomMojo.java`
#### Snippet
```java
        {
            // tweak location tracking comment, that are put on a separate line by pretty print
            effectivePom = effectivePom.replaceAll( "(?m)>\\s+<!--}", ">  <!-- " );
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/help/EffectivePomMojo.java`
#### Snippet
```java
                String commentStart = comment.substring( 0, dotIndex );
                String commentEnd = comment.substring( dotIndex + 1 );
                effectivePom = effectivePom.replace( "<!--", commentStart ).replace( "-->", commentEnd );
            }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/help/EffectivePomMojo.java`
#### Snippet
```java
                String commentStart = comment.substring( 0, dotIndex );
                String commentEnd = comment.substring( dotIndex + 1 );
                effectivePom = effectivePom.replace( "<!--", commentStart ).replace( "-->", commentEnd );
            }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
                {
                    String name = jarEntry.getName().substring( 0, jarEntry.getName().indexOf( "." ) );
                    name = name.replace( "/", "\\." );

                    if ( name.contains( packageFilter ) && !name.contains( "$" ) )
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.resolution` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/maven/plugins/help/AbstractHelpMojo.java`
#### Snippet
```java
    }

    protected org.eclipse.aether.resolution.ArtifactResult resolveArtifact(
            org.eclipse.aether.artifact.Artifact artifact ) throws RepositoryException
    {
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `projects` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/help/ActiveProfilesMojo.java`
#### Snippet
```java
     */
    @Parameter( defaultValue = "${reactorProjects}", required = true, readonly = true )
    private List<MavenProject> projects;

    // ----------------------------------------------------------------------
```

### MismatchedCollectionQueryUpdate
Contents of collection `lifecycleMappings` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     */
    @Component
    private Map<String, LifecycleMapping> lifecycleMappings;

    // ----------------------------------------------------------------------
```

### MismatchedCollectionQueryUpdate
Contents of collection `settingsProfiles` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/help/AllProfilesMojo.java`
#### Snippet
```java
     */
    @Parameter( defaultValue = "${settings.profiles}", readonly = true, required = true )
    private List<org.apache.maven.settings.Profile> settingsProfiles;

    // ----------------------------------------------------------------------
```

### MismatchedCollectionQueryUpdate
Contents of collection `projects` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/help/AllProfilesMojo.java`
#### Snippet
```java
     */
    @Parameter( defaultValue = "${reactorProjects}", required = true, readonly = true )
    private List<MavenProject> projects;

    /**
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
    private static final String NO_REASON = "No reason given";

    private static final Pattern EXPRESSION = Pattern.compile( "^\\$\\{([^}]+)\\}$" );

    // ----------------------------------------------------------------------
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `project` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
     */
    @Parameter( defaultValue = "${project}", readonly = true, required = true )
    private MavenProject project;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `evaluator` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java

    /** lazy loading evaluator variable */
    private PluginParameterExpressionEvaluator evaluator;

    /** lazy loading xstream variable */
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/help/EffectivePomMojo.java`
#### Snippet
```java
     */
    @Parameter( property = "verbose", defaultValue = "false" )
    private boolean verbose = false;

    // ----------------------------------------------------------------------
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
        if ( StringUtils.isEmpty( value ) )
        {
            value = UNKNOWN;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
        if ( StringUtils.isEmpty( value ) )
        {
            value = UNKNOWN;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `project`
in `src/main/java/org/apache/maven/plugins/help/AllProfilesMojo.java`
#### Snippet
```java
                }
            }
            project = project.getParent();
        }
    }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/help/EffectiveSettingsMojo.java`
#### Snippet
```java
        if ( settings == null )
        {
            return null;
        }

```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
                urls.add( new File( artifact ).toURI().toURL() );
            }
            try ( URLClassLoader classLoader = new URLClassLoader( urls.toArray( new URL[0] ),
                    getClass().getClassLoader() ) )
            {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/SystemMojo.java`
#### Snippet
```java
            sb.append( "Generated by Maven Help Plugin" ).append( LS );
            sb.append( "See: https://maven.apache.org/plugins/maven-help-plugin/" ).append( LS ).append( LS );
            sb.append( message.toString() );

            try
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/ActiveProfilesMojo.java`
#### Snippet
```java
            sb.append( "Generated by Maven Help Plugin" ).append( LS );
            sb.append( "See: https://maven.apache.org/plugins/maven-help-plugin/" ).append( LS ).append( LS );
            sb.append( message.toString() );

            try
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
        else if ( obj instanceof String )
        {
            response.append( obj.toString() );
        }
        else if ( obj instanceof Boolean )
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
        else if ( obj instanceof Boolean )
        {
            response.append( obj.toString() );
        }
        else if ( obj instanceof Byte )
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
        else if ( obj instanceof Byte )
        {
            response.append( obj.toString() );
        }
        else if ( obj instanceof Character )
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
        else if ( obj instanceof Character )
        {
            response.append( obj.toString() );
        }
        else if ( obj instanceof Double )
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
        else if ( obj instanceof Double )
        {
            response.append( obj.toString() );
        }
        else if ( obj instanceof Float )
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
        else if ( obj instanceof Float )
        {
            response.append( obj.toString() );
        }
        else if ( obj instanceof Integer )
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
        else if ( obj instanceof Integer )
        {
            response.append( obj.toString() );
        }
        else if ( obj instanceof Long )
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
        else if ( obj instanceof Long )
        {
            response.append( obj.toString() );
        }
        else if ( obj instanceof Short )
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
        else if ( obj instanceof Short )
        {
            response.append( obj.toString() );
        }
        // handle specific objects
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
            }

            response.append( sWriter.toString() );
        }
        // handle Maven Settings object
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
            }

            response.append( sWriter.toString() );
        }
        else
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
            if ( getLog().isInfoEnabled() )
            {
                getLog().info( LS + response.toString() );
            }
            else
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
                if ( forceStdout )
                {
                    System.out.print( response.toString() );
                    System.out.flush();
                }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/maven/plugins/help/AllProfilesMojo.java`
#### Snippet
```java
     * @param activeProfiles Map to add the active profiles to.
     */
    private void addProjectPomProfiles( MavenProject project, Map<String, Profile> allProfiles,
                                        Map<String, Profile> activeProfiles )
    {
```

### BoundedWildcard
Can generalize to `? super Profile`
in `src/main/java/org/apache/maven/plugins/help/AllProfilesMojo.java`
#### Snippet
```java
     * @param activeProfiles Map to add the active profiles to.
     */
    private void addProjectPomProfiles( MavenProject project, Map<String, Profile> allProfiles,
                                        Map<String, Profile> activeProfiles )
    {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/maven/plugins/help/AllProfilesMojo.java`
#### Snippet
```java
     */
    private void addProjectPomProfiles( MavenProject project, Map<String, Profile> allProfiles,
                                        Map<String, Profile> activeProfiles )
    {
        if ( project == null )
```

### BoundedWildcard
Can generalize to `? super Profile`
in `src/main/java/org/apache/maven/plugins/help/AllProfilesMojo.java`
#### Snippet
```java
     */
    private void addProjectPomProfiles( MavenProject project, Map<String, Profile> allProfiles,
                                        Map<String, Profile> activeProfiles )
    {
        if ( project == null )
```

### BoundedWildcard
Can generalize to `? extends Profile`
in `src/main/java/org/apache/maven/plugins/help/AllProfilesMojo.java`
#### Snippet
```java
    // ----------------------------------------------------------------------

    private void writeProfilesDescription( StringBuilder sb, Map<String, Profile> profilesByIds, boolean active )
    {
        for ( Profile p : profilesByIds.values() )
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/maven/plugins/help/AllProfilesMojo.java`
#### Snippet
```java
     * @param allProfiles Map to add the profiles to.
     */
    private void addSettingsProfiles( Map<String, Profile> allProfiles )
    {
        getLog().debug( "Attempting to read profiles from settings.xml..." );
```

### BoundedWildcard
Can generalize to `? super Profile`
in `src/main/java/org/apache/maven/plugins/help/AllProfilesMojo.java`
#### Snippet
```java
     * @param allProfiles Map to add the profiles to.
     */
    private void addSettingsProfiles( Map<String, Profile> allProfiles )
    {
        getLog().debug( "Attempting to read profiles from settings.xml..." );
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `session` accessed in synchronized context
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
            // Maven 3: PluginParameterExpressionEvaluator gets the current project from the session:
            // synchronize in case another thread wants to fetch the real current project in between
            synchronized ( session )
            {
                session.setCurrentProject( project );
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `session` accessed in synchronized context
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
            synchronized ( session )
            {
                session.setCurrentProject( project );
                evaluator = new PluginParameterExpressionEvaluator( session, mojoExecution );
                session.setCurrentProject( currentProject );
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `session` accessed in synchronized context
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
            {
                session.setCurrentProject( project );
                evaluator = new PluginParameterExpressionEvaluator( session, mojoExecution );
                session.setCurrentProject( currentProject );
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `session` accessed in synchronized context
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
                session.setCurrentProject( project );
                evaluator = new PluginParameterExpressionEvaluator( session, mojoExecution );
                session.setCurrentProject( currentProject );
            }
        }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/help/AbstractEffectiveMojo.java`
#### Snippet
```java
        }

        output.getParentFile().mkdirs();
        try ( Writer out = WriterFactory.newXmlWriter( output ) )
        {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/help/AbstractHelpMojo.java`
#### Snippet
```java
        }

        output.getParentFile().mkdirs();
        try ( Writer out = WriterFactory.newPlatformWriter( output ) )
        {
```
