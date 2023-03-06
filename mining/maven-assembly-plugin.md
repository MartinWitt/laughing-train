# maven-assembly-plugin 
 
# Bad smells
I found 127 bad smells with 27 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SizeReplaceableByIsEmpty | 15 | true |
| BoundedWildcard | 15 | false |
| PublicFieldAccessedInSynchronizedContext | 12 | false |
| AssignmentToMethodParameter | 12 | false |
| UnnecessaryFullyQualifiedName | 11 | false |
| RedundantFieldInitialization | 10 | false |
| ReturnNull | 9 | false |
| GroovyUnusedAssignment | 6 | false |
| ZeroLengthArrayInitialization | 5 | false |
| UtilityClassWithoutPrivateConstructor | 4 | true |
| UnnecessaryToStringCall | 3 | true |
| UnnecessaryLocalVariable | 3 | true |
| DataFlowIssue | 2 | false |
| UnnecessaryStringEscape | 2 | true |
| MissortedModifiers | 2 | false |
| RedundantSuppression | 2 | false |
| UnusedAssignment | 2 | false |
| RedundantLengthCheck | 1 | false |
| FieldMayBeStatic | 1 | false |
| CommentedOutCode | 1 | false |
| TrivialStringConcatenation | 1 | false |
| StringEqualsEmptyString | 1 | false |
| UtilityClassWithPublicConstructor | 1 | false |
| MissingDeprecatedAnnotation | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| Anonymous2MethodRef | 1 | false |
| Java8MapApi | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `src/main/java/org/apache/maven/plugins/assembly/utils/FilterUtils.java`
#### Snippet
```java
        final AndArtifactFilter filter = new AndArtifactFilter();

        if ( additionalFilters != null && additionalFilters.length > 0 )
        {
            for ( final ArtifactFilter additionalFilter : additionalFilters )
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `commentChars` may be 'static'
in `src/main/java/org/apache/maven/plugins/assembly/filter/SimpleAggregatingDescriptorHandler.java`
#### Snippet
```java

    @SuppressWarnings( "FieldCanBeLocal" )
    private final String commentChars = "#";

    private final StringWriter aggregateWriter = new StringWriter();
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Assemblies` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/plugins/assembly/model/Assemblies.java`
#### Snippet
```java
 *
 */
public class Assemblies
{

```

### UtilityClassWithoutPrivateConstructor
Class `ReaderFormatter` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/plugins/assembly/format/ReaderFormatter.java`
#### Snippet
```java
 *
 */
public class ReaderFormatter
{
    private static Reader createReaderFilter( Reader source, String escapeString, List<String> delimiters,
```

### UtilityClassWithoutPrivateConstructor
Class `MavenProjects` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/plugins/assembly/functions/MavenProjects.java`
#### Snippet
```java
 *
 */
public class MavenProjects
{
    public static void without( Iterable<MavenProject> source, String packagingType, MavenProjectConsumer consumer )
```

### UtilityClassWithoutPrivateConstructor
Class `AssemblyInterpolator` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/plugins/assembly/interpolation/AssemblyInterpolator.java`
#### Snippet
```java
 *
 */
public class AssemblyInterpolator
{
    private static final Set<String> INTERPOLATION_BLACKLIST;
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `startsWith` may produce `NullPointerException`
in `src/main/java/org/apache/maven/plugins/assembly/archive/archiver/PrefixedArchivedFileSet.java`
#### Snippet
```java
    {
        String prefix = fileSet.getPrefix();
        if ( prefix.startsWith( "/" ) )
        {
            if ( prefix.length() > 1 )
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java
            {
                final String hint = config.getHandlerName();
                final ContainerDescriptorHandler handler = containerDescriptorHandlers.get( hint );

                if ( handler == null )
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/maven/plugins/assembly/utils/TypeConversionUtils.java`
#### Snippet
```java
        catch ( final NumberFormatException e )
        {
            throw new AssemblyFormattingException( "Failed to parse mode as an octal number: \'" + mode + "\'.", e );
        }
    }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/maven/plugins/assembly/utils/TypeConversionUtils.java`
#### Snippet
```java
        catch ( final NumberFormatException e )
        {
            throw new AssemblyFormattingException( "Failed to parse mode as an octal number: \'" + mode + "\'.", e );
        }
    }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/maven/plugins/assembly/utils/FilterUtils.java`
#### Snippet
```java

        // FIXME: Why is this added twice??
        // if ( additionalFilters != null && !additionalFilters.isEmpty() )
        // {
        // allFilters.addAll( additionalFilters );
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`prefix.length() > 0` can be replaced with '!prefix.isEmpty()'
in `src/main/java/org/apache/maven/plugins/assembly/io/PrefixedClasspathLocatorStrategy.java`
#### Snippet
```java
        }

        if ( prefix.length() > 0 && !prefix.endsWith( "/" ) )
        {
            prefix += "/";
```

### SizeReplaceableByIsEmpty
`path.length() > 0` can be replaced with '!path.isEmpty()'
in `src/main/java/org/apache/maven/plugins/assembly/utils/AssemblyFileUtils.java`
#### Snippet
```java
        {
            path = path.substring( base.length() );
            if ( path.length() > 0 )
            {
                if ( path.startsWith( "/" ) || path.startsWith( "\\" ) )
```

### SizeReplaceableByIsEmpty
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `src/main/java/org/apache/maven/plugins/assembly/utils/AssemblyFileUtils.java`
#### Snippet
```java
            }

            if ( path.length() == 0 )
            {
                path = ".";
```

### SizeReplaceableByIsEmpty
`leftover.length() > 0` can be replaced with '!leftover.isEmpty()'
in `src/main/java/org/apache/maven/plugins/assembly/filter/MetaInfSpringHandler.java`
#### Snippet
```java
        }

        return leftover != null && leftover.length() > 0;
    }

```

### SizeReplaceableByIsEmpty
`leftover.length() > 0` can be replaced with '!leftover.isEmpty()'
in `src/main/java/org/apache/maven/plugins/assembly/filter/MetaInfServicesHandler.java`
#### Snippet
```java
        }

        return leftover != null && leftover.length() > 0;
    }

```

### SizeReplaceableByIsEmpty
`classifier.length() == 0` can be replaced with 'classifier.isEmpty()'
in `src/main/java/org/apache/maven/plugins/assembly/utils/ProjectUtils.java`
#### Snippet
```java
    {
        String classifier = artifact.getClassifier();
        if ( classifier != null && classifier.length() == 0 )
        {
            classifier = null;
```

### SizeReplaceableByIsEmpty
`value.length() > 0` can be replaced with '!value.isEmpty()'
in `src/main/java/org/apache/maven/plugins/assembly/utils/AssemblyFormatUtils.java`
#### Snippet
```java
        value = interpolator.interpolate( value );

        if ( ( value.length() > 0 ) && !value.endsWith( "/" ) && !value.endsWith( "\\" ) )
        {
            value += "/";
```

### SizeReplaceableByIsEmpty
`value.length() > 0` can be replaced with '!value.isEmpty()'
in `src/main/java/org/apache/maven/plugins/assembly/utils/AssemblyFormatUtils.java`
#### Snippet
```java
        }

        if ( ( value.length() > 0 ) && ( value.startsWith( "/" ) || value.startsWith( "\\" ) ) )
        {
            value = value.substring( 1 );
```

### SizeReplaceableByIsEmpty
`value.length() > 0` can be replaced with '!value.isEmpty()'
in `src/main/java/org/apache/maven/plugins/assembly/utils/AssemblyFormatUtils.java`
#### Snippet
```java
        }

        if ( finalSep != null && value.length() > 0 && !value.endsWith( finalSep ) )
        {
            value += finalSep;
```

### SizeReplaceableByIsEmpty
`effectiveFormats.size() == 0` can be replaced with 'effectiveFormats.isEmpty()'
in `src/main/java/org/apache/maven/plugins/assembly/mojos/AbstractAssemblyMojo.java`
#### Snippet
```java

                List<String> effectiveFormats = formats;
                if ( effectiveFormats == null || effectiveFormats.size() == 0 )
                {
                    effectiveFormats = assembly.getFormats();
```

### SizeReplaceableByIsEmpty
`effectiveFormats.size() == 0` can be replaced with 'effectiveFormats.isEmpty()'
in `src/main/java/org/apache/maven/plugins/assembly/mojos/AbstractAssemblyMojo.java`
#### Snippet
```java
                    effectiveFormats = assembly.getFormats();
                }
                if ( effectiveFormats == null || effectiveFormats.size() == 0 )
                {
                    throw new MojoFailureException(
```

### SizeReplaceableByIsEmpty
`rootPrefix.length() > 0` can be replaced with '!rootPrefix.isEmpty()'
in `src/main/java/org/apache/maven/plugins/assembly/archive/archiver/PrefixedFileSet.java`
#### Snippet
```java
        this.selectors = selectors;

        if ( rootPrefix.length() > 0 && !rootPrefix.endsWith( "/" ) )
        {
            this.rootPrefix = rootPrefix + "/";
```

### SizeReplaceableByIsEmpty
`rootPrefix.length() > 0` can be replaced with '!rootPrefix.isEmpty()'
in `src/main/java/org/apache/maven/plugins/assembly/archive/archiver/PrefixedArchivedFileSet.java`
#### Snippet
```java
        this.selectors = selectors;

        if ( rootPrefix.length() > 0 && !rootPrefix.endsWith( "/" ) )
        {
            this.rootPrefix = rootPrefix + "/";
```

### SizeReplaceableByIsEmpty
`outputLocation.length() > 0` can be replaced with '!outputLocation.isEmpty()'
in `src/main/java/org/apache/maven/plugins/assembly/archive/task/AddArtifactTask.java`
#### Snippet
```java
        String outputLocation = destDirectory;

        if ( ( outputLocation.length() > 0 ) && !outputLocation.endsWith( "/" ) )
        {
            outputLocation += "/";
```

### SizeReplaceableByIsEmpty
`interpolationState.asList().size() > 0` can be replaced with '!interpolationState.asList().isEmpty()'
in `src/main/java/org/apache/maven/plugins/assembly/interpolation/AssemblyInterpolator.java`
#### Snippet
```java
    public static void checkErrors( AssemblyId assemblyId, InterpolationState interpolationState, Logger logger )
    {
        if ( interpolationState.asList() != null && interpolationState.asList().size() > 0 && logger.isDebugEnabled() )
        {
            final StringBuilder sb = new StringBuilder();
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java
        LOGGER.debug( "All known ContainerDescriptorHandler components: " + ( containerDescriptorHandlers == null
            ? "none; map is null."
            : "" + containerDescriptorHandlers.keySet() ) );

        if ( requestedContainerDescriptorHandlers == null )
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultMessageHolder.java`
#### Snippet
```java
                error.printStackTrace( pw );

                buffer.append( sw.toString() );
            }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultMessageHolder.java`
#### Snippet
```java
            {
                buffer.append( '[' ).append( counter++ ).append( "] " );
                buffer.append( content.toString() );

                if ( it.hasNext() )
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultAssemblyReader.java`
#### Snippet
```java
        }

        LOGGER.debug( message + "\n\n" + sWriter.toString() + "\n\n" );
    }

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends LocatorStrategy`
in `src/main/java/org/apache/maven/plugins/assembly/io/Locator.java`
#### Snippet
```java
     * @param strategies the strategies to be set.
     */
    void setStrategies( List<LocatorStrategy> strategies )
    {
        this.strategies.clear();
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `src/main/java/org/apache/maven/plugins/assembly/utils/ProjectUtils.java`
#### Snippet
```java

    public static Set<MavenProject> getProjectModules( final MavenProject project,
                                                       final List<MavenProject> reactorProjects,
                                                       final boolean includeSubModules, final Logger logger )
        throws IOException
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/maven/plugins/assembly/filter/AbstractLineAggregatingHandler.java`
#### Snippet
```java
    }

    void readLines( final FileInfo fileInfo, final List<String> lines )
        throws IOException
    {
```

### BoundedWildcard
Can generalize to `? extends ArtifactFilter`
in `src/main/java/org/apache/maven/plugins/assembly/utils/FilterUtils.java`
#### Snippet
```java
    }

    public static void reportFilteringStatistics( final Collection<ArtifactFilter> filters, final Logger logger )
    {
        for ( final ArtifactFilter f : filters )
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `src/main/java/org/apache/maven/plugins/assembly/utils/FilterUtils.java`
#### Snippet
```java
    }

    public static Set<MavenProject> filterProjects( final Set<MavenProject> projects, final List<String> includes,
                                                    final List<String> excludes, final boolean actTransitively,
                                                    final Logger logger )
```

### BoundedWildcard
Can generalize to `? extends InputStream`
in `src/main/java/org/apache/maven/plugins/assembly/archive/phase/FileItemAssemblyPhase.java`
#### Snippet
```java
    }
    
    private ContentSupplier getContentSupplier( final Collection<InputStream> contentStreams ) 
    {
        return new ContentSupplier()
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/assembly/artifact/ResolutionManagementInfo.java`
#### Snippet
```java
    }

    void addArtifacts( final Set<Artifact> a )
    {
        for ( Artifact artifact : a )
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `src/main/java/org/apache/maven/plugins/assembly/archive/phase/ModuleSetAssemblyPhase.java`
#### Snippet
```java
    }

    private List<MavenProject> validateModuleVersions( Set<MavenProject> moduleProjects )
    {
        List<MavenProject> result = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `src/main/java/org/apache/maven/plugins/assembly/functions/MavenProjects.java`
#### Snippet
```java
public class MavenProjects
{
    public static void without( Iterable<MavenProject> source, String packagingType, MavenProjectConsumer consumer )
    {
        for ( MavenProject project : source )
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `src/main/java/org/apache/maven/plugins/assembly/functions/MavenProjects.java`
#### Snippet
```java
    }

    public static void select( Iterable<MavenProject> source, String packagingType, MavenProjectConsumer include,
                               MavenProjectConsumer excluded )
    {
```

### BoundedWildcard
Can generalize to `? super MavenProject`
in `src/main/java/org/apache/maven/plugins/assembly/functions/MavenProjects.java`
#### Snippet
```java
    }

    public static MavenProjectConsumer addTo( final Set<MavenProject> set )
    {
        return new MavenProjectConsumer()
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `src/main/java/org/apache/maven/plugins/assembly/functions/MavenProjects.java`
#### Snippet
```java
    }

    public static void select( Iterable<MavenProject> source, String packagingType, MavenProjectConsumer consumer )
    {
        for ( MavenProject project : source )
```

### BoundedWildcard
Can generalize to `? extends ArtifactResult`
in `src/main/java/org/apache/maven/plugins/assembly/repository/DefaultRepositoryAssembler.java`
#### Snippet
```java
    }

    private void assembleRepositoryArtifacts( ProjectBuildingRequest buildingRequest, Iterable<ArtifactResult> result,
                                              ArtifactFilter filter,
                                              Map<String, GroupVersionAlignment> groupVersionAlignments )
```

### BoundedWildcard
Can generalize to `? extends GroupVersionAlignment`
in `src/main/java/org/apache/maven/plugins/assembly/repository/DefaultRepositoryAssembler.java`
#### Snippet
```java
    }

    private void setAlignment( Artifact artifact, Map<String, GroupVersionAlignment> groupVersionAlignments )
    {
        GroupVersionAlignment alignment = groupVersionAlignments.get( artifact.getGroupId() );
```

### BoundedWildcard
Can generalize to `? extends GroupVersionAlignment`
in `src/main/java/org/apache/maven/plugins/assembly/repository/DefaultRepositoryAssembler.java`
#### Snippet
```java

    // CHECKSTYLE_OFF: LineLength
    protected Map<String, GroupVersionAlignment> createGroupVersionAlignments( List<GroupVersionAlignment> versionAlignments )
    // CHECKSTYLE_ON: LineLength
    {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/maven/plugins/assembly/archive/archiver/PrefixedFileSet.java`
#### Snippet
```java
    implements FileSet
{
    private final static FileMapper[] EMPTY_FILE_MAPPERS_ARRAY = new FileMapper[0];

    private final String rootPrefix;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/maven/plugins/assembly/archive/archiver/PrefixedArchivedFileSet.java`
#### Snippet
```java
    implements ArchivedFileSet
{
    private final static FileMapper[] EMPTY_FILE_MAPPERS_ARRAY = new FileMapper[0];

    private final String rootPrefix;
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/maven/plugins/assembly/archive/archiver/AssemblyProxyArchiver.java`
#### Snippet
```java
        assemblyWorkPath = assemblyWorkDir.getAbsolutePath().replace( '\\', '/' );

        if ( !"".equals( rootPrefix ) && !rootPrefix.endsWith( "/" ) )
        {
            this.rootPrefix += "/";
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `envInterpolator` accessed in synchronized context
in `src/main/java/org/apache/maven/plugins/assembly/mojos/AbstractAssemblyMojo.java`
#### Snippet
```java
    public synchronized FixedStringSearchInterpolator getEnvInterpolator()
    {
        if ( envInterpolator == null )
        {
            this.envInterpolator = createEnvInterpolator();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.envInterpolator` accessed in synchronized context
in `src/main/java/org/apache/maven/plugins/assembly/mojos/AbstractAssemblyMojo.java`
#### Snippet
```java
        if ( envInterpolator == null )
        {
            this.envInterpolator = createEnvInterpolator();
        }
        return envInterpolator;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `envInterpolator` accessed in synchronized context
in `src/main/java/org/apache/maven/plugins/assembly/mojos/AbstractAssemblyMojo.java`
#### Snippet
```java
            this.envInterpolator = createEnvInterpolator();
        }
        return envInterpolator;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `commandLinePropertiesInterpolator` accessed in synchronized context
in `src/main/java/org/apache/maven/plugins/assembly/mojos/AbstractAssemblyMojo.java`
#### Snippet
```java
    public synchronized FixedStringSearchInterpolator getCommandLinePropsInterpolator()
    {
        if ( commandLinePropertiesInterpolator == null )
        {
            this.commandLinePropertiesInterpolator = createCommandLinePropertiesInterpolator();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.commandLinePropertiesInterpolator` accessed in synchronized context
in `src/main/java/org/apache/maven/plugins/assembly/mojos/AbstractAssemblyMojo.java`
#### Snippet
```java
        if ( commandLinePropertiesInterpolator == null )
        {
            this.commandLinePropertiesInterpolator = createCommandLinePropertiesInterpolator();
        }
        return commandLinePropertiesInterpolator;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `commandLinePropertiesInterpolator` accessed in synchronized context
in `src/main/java/org/apache/maven/plugins/assembly/mojos/AbstractAssemblyMojo.java`
#### Snippet
```java
            this.commandLinePropertiesInterpolator = createCommandLinePropertiesInterpolator();
        }
        return commandLinePropertiesInterpolator;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `rootInterpolator` accessed in synchronized context
in `src/main/java/org/apache/maven/plugins/assembly/mojos/AbstractAssemblyMojo.java`
#### Snippet
```java
    public synchronized FixedStringSearchInterpolator getRepositoryInterpolator()
    {
        if ( rootInterpolator == null )
        {
            this.rootInterpolator = createRepositoryInterpolator();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.rootInterpolator` accessed in synchronized context
in `src/main/java/org/apache/maven/plugins/assembly/mojos/AbstractAssemblyMojo.java`
#### Snippet
```java
        if ( rootInterpolator == null )
        {
            this.rootInterpolator = createRepositoryInterpolator();
        }
        return rootInterpolator;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `rootInterpolator` accessed in synchronized context
in `src/main/java/org/apache/maven/plugins/assembly/mojos/AbstractAssemblyMojo.java`
#### Snippet
```java
            this.rootInterpolator = createRepositoryInterpolator();
        }
        return rootInterpolator;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `mainProjectInterpolator` accessed in synchronized context
in `src/main/java/org/apache/maven/plugins/assembly/mojos/AbstractAssemblyMojo.java`
#### Snippet
```java
    public synchronized FixedStringSearchInterpolator getMainProjectInterpolator()
    {
        if ( mainProjectInterpolator == null )
        {
            this.mainProjectInterpolator = mainProjectInterpolator( getProject() );
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `this.mainProjectInterpolator` accessed in synchronized context
in `src/main/java/org/apache/maven/plugins/assembly/mojos/AbstractAssemblyMojo.java`
#### Snippet
```java
        if ( mainProjectInterpolator == null )
        {
            this.mainProjectInterpolator = mainProjectInterpolator( getProject() );
        }
        return mainProjectInterpolator;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `mainProjectInterpolator` accessed in synchronized context
in `src/main/java/org/apache/maven/plugins/assembly/mojos/AbstractAssemblyMojo.java`
#### Snippet
```java
            this.mainProjectInterpolator = mainProjectInterpolator( getProject() );
        }
        return mainProjectInterpolator;
    }

```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java

    @SuppressWarnings( "MismatchedQueryAndUpdateOfCollection" )
    private final Map<String, ContainerDescriptorHandler> containerDescriptorHandlers;

    private final PlexusContainer container;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/maven/plugins/assembly/utils/LineEndingsUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings( "resource" )
    public static InputStream lineEndingConverter( InputStream in, LineEndings lineEndings )
        throws IOException
    {
```

## RuleId[id=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `AssemblyInterpolator` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/maven/plugins/assembly/interpolation/AssemblyInterpolator.java`
#### Snippet
```java
 *
 */
public class AssemblyInterpolator
{
    private static final Set<String> INTERPOLATION_BLACKLIST;
```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/main/java/org/apache/maven/plugins/assembly/mojos/AbstractAssemblyMojo.java`
#### Snippet
```java
     */
    @Parameter( property = "assembly.useJvmChmod", defaultValue = "false" )
    private boolean useJvmChmod;

    /**
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/assembly/utils/AssemblyFormatUtils.java`
#### Snippet
```java
            {
                List<String> parts = new ArrayList<>();
                parts.addAll( Arrays.asList( value.split( sep.replace( "\\", "\\\\" ) ) ) );

                for ( ListIterator<String> it = parts.listIterator(); it.hasNext(); )
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.interpolation.fixed` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/assembly/utils/AssemblyFormatUtils.java`
#### Snippet
```java
            // 5
            return FixedStringSearchInterpolator.create(
                new org.codehaus.plexus.interpolation.fixed.PrefixedObjectValueSource(
                    InterpolationConstants.PROJECT_PREFIXES, mainProject, true ) );
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugins.assembly` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/assembly/archive/AssemblyArchiver.java`
#### Snippet
```java
     * @param fullName              The full name.
     * @param format                The format.
     * @param configSource          The {@link org.apache.maven.plugins.assembly.AssemblerConfigurationSource}
     * @param recompressZippedFiles recompress zipped files.
     * @param mergeManifestMode     How to handle already existing Manifest files (skip, merge, mergewithoutmain)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugins.assembly.format` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/assembly/archive/AssemblyArchiver.java`
#### Snippet
```java
     * @return The resulting archive file.
     * @throws ArchiveCreationException                                                 when creation fails
     * @throws org.apache.maven.plugins.assembly.format.AssemblyFormattingException     when formatting fails
     * @throws org.apache.maven.plugins.assembly.InvalidAssemblerConfigurationException when the configuration is bad
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugins.assembly` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/assembly/archive/AssemblyArchiver.java`
#### Snippet
```java
     * @throws ArchiveCreationException                                                 when creation fails
     * @throws org.apache.maven.plugins.assembly.format.AssemblyFormattingException     when formatting fails
     * @throws org.apache.maven.plugins.assembly.InvalidAssemblerConfigurationException when the configuration is bad
     */
    File createArchive( Assembly assembly, String fullName, String format, AssemblerConfigurationSource configSource,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugins.assembly.archive` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/assembly/archive/phase/AssemblyArchiverPhase.java`
#### Snippet
```java
     * @param configSource The configuration for this assembly build, normally derived from the plugin that launched
     *                     the assembly process.
     * @throws org.apache.maven.plugins.assembly.archive.ArchiveCreationException       in case of an archive
     *                                                                                  creation error.
     * @throws org.apache.maven.plugins.assembly.format.AssemblyFormattingException     in case of a assembly
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugins.assembly.format` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/assembly/archive/phase/AssemblyArchiverPhase.java`
#### Snippet
```java
     * @throws org.apache.maven.plugins.assembly.archive.ArchiveCreationException       in case of an archive
     *                                                                                  creation error.
     * @throws org.apache.maven.plugins.assembly.format.AssemblyFormattingException     in case of a assembly
     *                                                                                  formatting exception.
     * @throws org.apache.maven.plugins.assembly.InvalidAssemblerConfigurationException in case of an invalid
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugins.assembly` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/assembly/archive/phase/AssemblyArchiverPhase.java`
#### Snippet
```java
     * @throws org.apache.maven.plugins.assembly.format.AssemblyFormattingException     in case of a assembly
     *                                                                                  formatting exception.
     * @throws org.apache.maven.plugins.assembly.InvalidAssemblerConfigurationException in case of an invalid
     *                                                                                  assembler configuration.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.interpolation.fixed` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/maven/plugins/assembly/mojos/AbstractAssemblyMojo.java`
#### Snippet
```java
            // 5
            return FixedStringSearchInterpolator.create(
                    new org.codehaus.plexus.interpolation.fixed.PrefixedObjectValueSource(
                            InterpolationConstants.PROJECT_PREFIXES, mainProject, true ),

```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.interpolation.fixed` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/assembly/mojos/AbstractAssemblyMojo.java`
#### Snippet
```java

                    // 6
                    new org.codehaus.plexus.interpolation.fixed.PrefixedPropertiesValueSource(
                            InterpolationConstants.PROJECT_PROPERTIES_PREFIXES, mainProject.getProperties(), true ) );
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.archiver` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java
     * @param mergeManifestMode     how to handle already existing Manifest files
     * @return archiver Archiver generated
     * @throws org.codehaus.plexus.archiver.ArchiverException
     * @throws org.codehaus.plexus.archiver.manager.NoSuchArchiverException
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.archiver.manager` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java
     * @return archiver Archiver generated
     * @throws org.codehaus.plexus.archiver.ArchiverException
     * @throws org.codehaus.plexus.archiver.manager.NoSuchArchiverException
     */
    protected Archiver createArchiver( final String format, final boolean includeBaseDir, final String finalName,
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new MavenProjectConsumer() can be replaced with method reference
in `src/main/java/org/apache/maven/plugins/assembly/functions/MavenProjects.java`
#### Snippet
```java
    public static MavenProjectConsumer addTo( final Set<MavenProject> set )
    {
        return new MavenProjectConsumer()
        {
            @Override
            public void accept( MavenProject project )
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `src/main/java/org/apache/maven/plugins/assembly/filter/AbstractLineAggregatingHandler.java`
#### Snippet
```java

            List<String> lines = catalog.get( name );
            if ( lines == null )
            {
                lines = new ArrayList<>();
```

## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `src/it/projects/file-sets/multimodule-unix-lineEndings/verify.groovy`
#### Snippet
```java
FileReader reader = new FileReader( f );
char[] cbuf = new char[16];
int read = -1;
while( ( read = reader.read( cbuf ) ) > -1 )
{
```

### GroovyUnusedAssignment
Assignment is not used
in `src/it/projects/file-sets/multimodule-win-lineEndings/verify.groovy`
#### Snippet
```java
FileReader reader = new FileReader( f );
char[] cbuf = new char[16];
int read = -1;
while( ( read = reader.read( cbuf ) ) > -1 )
{
```

### GroovyUnusedAssignment
Assignment is not used
in `src/it/projects/dependency-sets/depSet-enum-vs-wildcard/verify.groovy`
#### Snippet
```java
        InputStream is = jf1.getInputStream( entry1 )
        byte[] buf = new byte[1024]
        int read = -1

        while( ( read = is.read( buf ) ) > -1 )
```

### GroovyUnusedAssignment
Assignment is not used
in `src/it/projects/dependency-sets/depSet-enum-vs-wildcard/verify.groovy`
#### Snippet
```java

        is = jf2.getInputStream( entry2 )
        read = -1

        while( ( read = is.read( buf ) ) > -1 )
```

### GroovyUnusedAssignment
Assignment is not used
in `src/it/projects/descriptor-refs/jar-with-dependencies/deps-unpacked-to-root-dir/verify.groovy`
#### Snippet
```java
import java.util.jar.*;

boolean result = true;

System.out.println( "Creating JarFile java.io.File." )
```

### GroovyUnusedAssignment
Assignment is not used
in `src/it/projects/descriptor-refs/jar-with-dependencies/component-descriptors-merged/verify.groovy`
#### Snippet
```java
ByteArrayOutputStream baos = new ByteArrayOutputStream()
byte[] buf = new byte[16]
int read = -1

while( ( read = instream.read( buf ) ) > -1 )
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/utils/LinuxLineFeedInputStream.java`
#### Snippet
```java
    private boolean slashNSeen = false;

    private boolean slashRSeen = false;

    private boolean eofSeen = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/utils/LinuxLineFeedInputStream.java`
#### Snippet
```java
    private boolean slashRSeen = false;

    private boolean eofSeen = false;

    LinuxLineFeedInputStream( InputStream in, boolean ensureLineFeedAtEndOfFile )
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/utils/LinuxLineFeedInputStream.java`
#### Snippet
```java
    private final boolean ensureLineFeedAtEndOfFile;

    private boolean slashNSeen = false;

    private boolean slashRSeen = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/utils/WindowsLineFeedInputStream.java`
#### Snippet
```java
    private boolean slashRSeen = false;

    private boolean slashNSeen = false;

    private boolean injectSlashN = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/utils/WindowsLineFeedInputStream.java`
#### Snippet
```java
    private boolean slashNSeen = false;

    private boolean injectSlashN = false;

    private boolean eofSeen = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/utils/WindowsLineFeedInputStream.java`
#### Snippet
```java
    private final boolean ensureLineFeedAtEndOfFile;

    private boolean slashRSeen = false;

    private boolean slashNSeen = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/utils/WindowsLineFeedInputStream.java`
#### Snippet
```java
    private boolean injectSlashN = false;

    private boolean eofSeen = false;

    WindowsLineFeedInputStream( InputStream in, boolean ensureLineFeedAtEndOfFile )
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/filter/ComponentsXmlArchiverFileFilter.java`
#### Snippet
```java
    Map<String, Xpp3Dom> components;

    private boolean excludeOverride = false;

    void addComponentsXml( final Reader componentsReader )
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/filter/AbstractLineAggregatingHandler.java`
#### Snippet
```java
    private Map<String, List<String>> catalog = new HashMap<>();

    private boolean excludeOverride = false;

    protected abstract String getOutputPathPrefix( final FileInfo fileInfo );
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/archive/task/AddArtifactTask.java`
#### Snippet
```java
    private int fileMode = -1;

    private boolean unpack = false;

    private List<String> includes;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `location`
in `src/main/java/org/apache/maven/plugins/assembly/io/PrefixedClasspathLocatorStrategy.java`
#### Snippet
```java
        if ( location.startsWith( "/" ) )
        {
            location = location.substring( 1 );
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `prefix`
in `src/main/java/org/apache/maven/plugins/assembly/io/PrefixedClasspathLocatorStrategy.java`
#### Snippet
```java
        if ( prefix.startsWith( "/" ) )
        {
            prefix = prefix.substring( 1 );
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `prefix`
in `src/main/java/org/apache/maven/plugins/assembly/io/PrefixedClasspathLocatorStrategy.java`
#### Snippet
```java
        if ( prefix.length() > 0 && !prefix.endsWith( "/" ) )
        {
            prefix += "/";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `src/main/java/org/apache/maven/plugins/assembly/utils/AssemblyFileUtils.java`
#### Snippet
```java
        }

        path = path.trim();

        String base = basedir.getAbsolutePath();
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `src/main/java/org/apache/maven/plugins/assembly/utils/AssemblyFileUtils.java`
#### Snippet
```java
        if ( path.startsWith( base ) )
        {
            path = path.substring( base.length() );
            if ( path.length() > 0 )
            {
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `src/main/java/org/apache/maven/plugins/assembly/utils/AssemblyFileUtils.java`
#### Snippet
```java
                if ( path.startsWith( "/" ) || path.startsWith( "\\" ) )
                {
                    path = path.substring( 1 );
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `src/main/java/org/apache/maven/plugins/assembly/utils/AssemblyFileUtils.java`
#### Snippet
```java
            if ( path.length() == 0 )
            {
                path = ".";
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `src/main/java/org/apache/maven/plugins/assembly/utils/AssemblyFileUtils.java`
#### Snippet
```java
        if ( !new File( path ).isAbsolute() )
        {
            path = path.replace( '\\', '/' );
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `reader`
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultAssemblyReader.java`
#### Snippet
```java

            reader.close();
            reader = null;
        }
        catch ( final IOException | XmlPullParserException e )
```

### AssignmentToMethodParameter
Assignment to method parameter `first`
in `src/main/java/org/apache/maven/plugins/assembly/archive/archiver/PrefixedFileSet.java`
#### Snippet
```java
            System.arraycopy( second, 0, temp, first.length, second.length );

            first = temp;
        }
        else if ( ( first == null ) && ( second != null ) )
```

### AssignmentToMethodParameter
Assignment to method parameter `first`
in `src/main/java/org/apache/maven/plugins/assembly/archive/archiver/PrefixedFileSet.java`
#### Snippet
```java
        else if ( ( first == null ) && ( second != null ) )
        {
            first = second;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `requestedContainerDescriptorHandlers`
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java
        if ( requestedContainerDescriptorHandlers == null )
        {
            requestedContainerDescriptorHandlers = new ArrayList<>();
        }

```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-06-10-12-21.302.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/assembly/utils/AssemblyFileUtils.java`
#### Snippet
```java
        if ( path == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultAssemblyReader.java`
#### Snippet
```java
            {
                LOGGER.debug( "Ignoring missing assembly descriptor: '" + descriptor + "' per configuration." );
                return null;
            }
            else
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultAssemblyReader.java`
#### Snippet
```java
            {
                LOGGER.debug( "Ignoring missing assembly descriptor with ID '" + ref + "' per configuration." );
                return null;
            }
            else
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultAssemblyReader.java`
#### Snippet
```java
                LOGGER.debug( "Ignoring missing assembly descriptor with ID '" + spec
                    + "' per configuration.\nLocator output was:\n\n" + locator.getMessageHolder().render() );
                return null;
            }
            else
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/assembly/filter/ComponentsXmlArchiverFileFilter.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/assembly/archive/ManifestCreationFinalizer.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/assembly/format/ReaderFormatter.java`
#### Snippet
```java
            };
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/assembly/mojos/AbstractAssemblyMojo.java`
#### Snippet
```java
    public String getArchiverConfig()
    {
        return archiverConfig == null ? null : archiverConfig.toString();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/assembly/functions/MavenProjects.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `error` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/filter/ComponentsXmlArchiverFileFilter.java`
#### Snippet
```java
                catch ( final XmlPullParserException e )
                {
                    final IOException error =
                        new IOException( "Error finalizing component-set for archive. Reason: " + e.getMessage(), e );

```

### UnnecessaryLocalVariable
Local variable `ioe` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/format/ReaderFormatter.java`
#### Snippet
```java
        catch ( MavenFilteringException e )
        {
            IOException ioe = new IOException( "Error filtering file '" + source + "': " + e.getMessage(), e );
            throw ioe;
        }
```

### UnnecessaryLocalVariable
Local variable `selectors1` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/archive/archiver/PrefixedFileSet.java`
#### Snippet
```java
    {
        FileSelector[] sel = fileSet.getFileSelectors();
        final FileSelector[] selectors1 = selectors;
        return combineSelectors( sel, selectors1 );
    }
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer buffer` may be declared as 'StringBuilder'
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultMessageHolder.java`
#### Snippet
```java
    public String render()
    {
        StringBuffer buffer = new StringBuffer();

        int counter = 1;
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/plugins/assembly/utils/TypeConversionUtils.java`
#### Snippet
```java
        if ( ( list != null ) && !list.isEmpty() )
        {
            result = list.toArray( new String[0] );
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/plugins/assembly/artifact/DefaultDependencyResolver.java`
#### Snippet
```java
            {
                updateDependencySetResolutionRequirements( dependencySet, requirements,
                                                           projects.toArray( new MavenProject[0] ) );
            }
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/plugins/assembly/archive/archiver/AssemblyProxyArchiver.java`
#### Snippet
```java
            dfs.setCaseSensitive( fs.isCaseSensitive() );
            dfs.setDirectory( fs.getDirectory() );
            dfs.setExcludes( newEx.toArray( new String[0] ) );
            dfs.setFileSelectors( fs.getFileSelectors() );
            dfs.setIncludes( newIn.toArray( new String[0] ) );
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/plugins/assembly/archive/archiver/AssemblyProxyArchiver.java`
#### Snippet
```java
            dfs.setExcludes( newEx.toArray( new String[0] ) );
            dfs.setFileSelectors( fs.getFileSelectors() );
            dfs.setIncludes( newIn.toArray( new String[0] ) );
            dfs.setIncludingEmptyDirectories( fs.isIncludingEmptyDirectories() );
            dfs.setPrefix( fs.getPrefix() );
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/plugins/assembly/archive/archiver/AssemblyProxyArchiver.java`
#### Snippet
```java
        if ( !selectors.isEmpty() )
        {
            this.selectors = selectors.toArray( new FileSelector[0] );
        }
    }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `component` initializer `null` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultAssemblyReader.java`
#### Snippet
```java
            }

            Component component = null;
            try ( Reader reader = new InputStreamReader( resolvedLocation.getInputStream() ) )
            {
```

### UnusedAssignment
Variable `dependencyArtifacts` initializer `null` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/artifact/DefaultDependencyResolver.java`
#### Snippet
```java
            }

            Set<Artifact> dependencyArtifacts = null;
            if ( set.isUseTransitiveDependencies() )
            {
```

