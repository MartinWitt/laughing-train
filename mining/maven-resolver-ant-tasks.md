# maven-resolver-ant-tasks 
 
# Bad smells
I found 41 bad smells with 16 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 17 | false |
| NonStrictComparisonCanBeEquality | 9 | true |
| UnnecessarySemicolon | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| InnerClassMayBeStatic | 2 | true |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| UnnecessaryStringEscape | 1 | true |
| RegExpRedundantEscape | 1 | false |
| IOStreamConstructor | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| RedundantTypeArguments | 1 | false |
| ConstantValue | 1 | false |
| EqualsBetweenInconvertibleTypes | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[tokens.size()\]'
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/Layout.java`
#### Snippet
```java
            tokens.add( m.group() );
        }
        this.tokens = tokens.toArray( new String[tokens.size()] );
    }

```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/resolver/internal/ant/types/Artifact.java`
#### Snippet
```java
                throw new BuildException( "The artifact file " + file + " does not exist" );
            }
            if ( type == null || type.length() <= 0 )
            {
                throw new BuildException( "You must specify the 'type' for the artifact" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/resolver/internal/ant/types/Dependency.java`
#### Snippet
```java
        else
        {
            if ( groupId == null || groupId.length() <= 0 )
            {
                throw new BuildException( "You must specify the 'groupId' for a dependency" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/resolver/internal/ant/types/Dependency.java`
#### Snippet
```java
                throw new BuildException( "You must specify the 'groupId' for a dependency" );
            }
            if ( artifactId == null || artifactId.length() <= 0 )
            {
                throw new BuildException( "You must specify the 'artifactId' for a dependency" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/resolver/internal/ant/types/Dependency.java`
#### Snippet
```java
                throw new BuildException( "You must specify the 'artifactId' for a dependency" );
            }
            if ( version == null || version.length() <= 0 )
            {
                throw new BuildException( "You must specify the 'version' for a dependency" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/resolver/internal/ant/types/Dependency.java`
#### Snippet
```java
        version = m.group( 3 );
        type = m.group( 6 );
        if ( type == null || type.length() <= 0 )
        {
            type = "jar";
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/resolver/internal/ant/types/RemoteRepository.java`
#### Snippet
```java
        else
        {
            if ( url == null || url.length() <= 0 )
            {
                throw new BuildException( "You must specify the 'url' for a remote repository" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/resolver/internal/ant/types/RemoteRepository.java`
#### Snippet
```java
                throw new BuildException( "You must specify the 'url' for a remote repository" );
            }
            if ( id == null || id.length() <= 0 )
            {
                throw new BuildException( "You must specify the 'id' for a remote repository" );
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/resolver/internal/ant/types/ModelValueExtractor.java`
#### Snippet
```java
            throw new IllegalArgumentException( "reference to Ant project has not been specified" );
        }
        if ( prefix == null || prefix.length() <= 0 )
        {
            prefix = "pom.";
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepoSys.java`
#### Snippet
```java
                    }
                    line = line.trim();
                    if ( line.length() <= 0 )
                    {
                        continue;
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepoSys.java`
#### Snippet
```java
        try
        {
            try ( BufferedReader reader = new BufferedReader( new InputStreamReader( new FileInputStream( file ), "UTF-8" ) ) )
            {
                for ( String line = reader.readLine(); line != null; line = reader.readLine() )
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepositoryListener.java`
#### Snippet
```java
                      + event.getException().getMessage(),
                  event.getException(), Project.MSG_WARN );
    };

    @Override
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepositoryListener.java`
#### Snippet
```java
        task.log( "The POM for " + event.getArtifact() + " is missing, no dependency information available",
                  Project.MSG_WARN );
    };

}
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/RefTask.java`
#### Snippet
```java
        {
            log( "Class " + o.getClass() + " is not a subclass of " + requiredClass, Project.MSG_VERBOSE );
            String msg = ref.getRefId() + " doesn\'t denote a " + dataTypeName;
            throw new BuildException( msg );
        }
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `containers` may be 'final'
in `src/main/java/org/apache/maven/resolver/internal/ant/types/Artifacts.java`
#### Snippet
```java
{

    private List<ArtifactContainer> containers = new ArrayList<ArtifactContainer>();

    protected Artifacts getRef()
```

### FieldMayBeFinal
Field `task` may be 'final'
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/DependencyGraphLogger.java`
#### Snippet
```java
{

    private Task task;

    private String indent = "";
```

### FieldMayBeFinal
Field `project` may be 'final'
in `src/main/java/org/apache/maven/resolver/internal/ant/AntServiceLocatorErrorHandler.java`
#### Snippet
```java
{

    private Project project;

    AntServiceLocatorErrorHandler( final Project project )
```

### FieldMayBeFinal
Field `exclusions` may be 'final'
in `src/main/java/org/apache/maven/resolver/internal/ant/types/Dependencies.java`
#### Snippet
```java
    private List<DependencyContainer> containers = new ArrayList<DependencyContainer>();

    private List<Exclusion> exclusions = new ArrayList<Exclusion>();

    private boolean nestedDependencies;
```

### FieldMayBeFinal
Field `containers` may be 'final'
in `src/main/java/org/apache/maven/resolver/internal/ant/types/Dependencies.java`
#### Snippet
```java
    private Pom pom;

    private List<DependencyContainer> containers = new ArrayList<DependencyContainer>();

    private List<Exclusion> exclusions = new ArrayList<Exclusion>();
```

### FieldMayBeFinal
Field `task` may be 'final'
in `src/main/java/org/apache/maven/resolver/internal/ant/AntTransferListener.java`
#### Snippet
```java
{

    private Task task;

    AntTransferListener( final Task task )
```

### FieldMayBeFinal
Field `servers` may be 'final'
in `src/main/java/org/apache/maven/resolver/internal/ant/types/Authentication.java`
#### Snippet
```java
    private String passphrase;

    private List<String> servers = new ArrayList<String>();

    @Override
```

### FieldMayBeFinal
Field `project` may be 'final'
in `src/main/java/org/apache/maven/resolver/internal/ant/AntLogger.java`
#### Snippet
```java
{

    private Project project;

    AntLogger( final Project project )
```

### FieldMayBeFinal
Field `exclusions` may be 'final'
in `src/main/java/org/apache/maven/resolver/internal/ant/types/Dependency.java`
#### Snippet
```java
    private File systemPath;

    private List<Exclusion> exclusions = new ArrayList<Exclusion>();

    protected Dependency getRef()
```

### FieldMayBeFinal
Field `containers` may be 'final'
in `src/main/java/org/apache/maven/resolver/internal/ant/types/RemoteRepositories.java`
#### Snippet
```java
{

    private List<RemoteRepositoryContainer> containers = new ArrayList<RemoteRepositoryContainer>();

    protected RemoteRepositories getRef()
```

### FieldMayBeFinal
Field `artifacts` may be 'final'
in `src/main/java/org/apache/maven/resolver/internal/ant/ProjectWorkspaceReader.java`
#### Snippet
```java
    private static final Object LOCK = new Object();

    private Map<String, Artifact> artifacts = new ConcurrentHashMap<String, Artifact>();

    public void addPom( Pom pom )
```

### FieldMayBeFinal
Field `task` may be 'final'
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepositoryListener.java`
#### Snippet
```java
{

    private Task task;

    AntRepositoryListener( final Task task )
```

### FieldMayBeFinal
Field `tokens` may be 'final'
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/Layout.java`
#### Snippet
```java
    public static final String CLS = "{classifier}";

    private String[] tokens;

    Layout( String layout )
```

### FieldMayBeFinal
Field `classifier` may be 'final'
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/Resolve.java`
#### Snippet
```java
    {

        private String classifier;

        private List<ArtifactConsumer> consumers = new ArrayList<ArtifactConsumer>();
```

### FieldMayBeFinal
Field `consumers` may be 'final'
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/Resolve.java`
#### Snippet
```java
{

    private List<ArtifactConsumer> consumers = new ArrayList<ArtifactConsumer>();

    private boolean failOnMissingAttachments;
```

### FieldMayBeFinal
Field `consumers` may be 'final'
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/Resolve.java`
#### Snippet
```java
        private String classifier;

        private List<ArtifactConsumer> consumers = new ArrayList<ArtifactConsumer>();

        private List<ArtifactRequest> requests = new ArrayList<ArtifactRequest>();
```

### FieldMayBeFinal
Field `requests` may be 'final'
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/Resolve.java`
#### Snippet
```java
        private List<ArtifactConsumer> consumers = new ArrayList<ArtifactConsumer>();

        private List<ArtifactRequest> requests = new ArrayList<ArtifactRequest>();

        Group( String classifier )
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/Layout.java`
#### Snippet
```java
        Collection<String> valid = new HashSet<String>( Arrays.asList( GID, GID_DIRS, AID, VER, BVER, EXT, CLS ) );
        List<String> tokens = new ArrayList<String>();
        Matcher m = Pattern.compile( "(\\{[^}]*\\})|([^{]+)" ).matcher( layout );
        while ( m.find() )
        {
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepoSys.java`
#### Snippet
```java
        try
        {
            try ( BufferedReader reader = new BufferedReader( new InputStreamReader( new FileInputStream( file ), "UTF-8" ) ) )
            {
                for ( String line = reader.readLine(); line != null; line = reader.readLine() )
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `envCaseInsensitive` is redundant
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepoSys.java`
#### Snippet
```java
            props = new Properties();
        }
        boolean envCaseInsensitive = OS_WINDOWS;
        for ( Map.Entry<String, String> entry : System.getenv().entrySet() )
        {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/AbstractDistTask.java`
#### Snippet
```java
            {
                throw new BuildException( "Artifact references different pom than it would be installed with: "
                    + artifact.toString() );
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/Resolve.java`
#### Snippet
```java
        if ( dependencies == null && pom != null )
        {
            log( "Using default pom for dependency resolution (" + pom.toString() + ")", Project.MSG_INFO );
            dependencies = new Dependencies();
            dependencies.setProject( getProject() );
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepoSys.java`
#### Snippet
```java
        if ( dependencies != null )
        {
            populateCollectRequest( collectRequest, task, session, dependencies, Collections.<Exclusion>emptyList() );
        }

```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `Path` may be 'static'
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/Resolve.java`
#### Snippet
```java
    /**
     */
    public class Path
        extends ArtifactConsumer
    {
```

### InnerClassMayBeStatic
Inner class `Props` may be 'static'
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/Resolve.java`
#### Snippet
```java
    /**
     */
    public class Props
        extends ArtifactConsumer
    {
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `e instanceof MetadataNotFoundException` is always `true`
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepositoryListener.java`
#### Snippet
```java
        if ( e != null )
        {
            if ( e instanceof MetadataNotFoundException )
            {
                task.log( e.getMessage(), Project.MSG_DEBUG );
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `src/main/java/org/apache/maven/resolver/internal/ant/AntServiceLocatorErrorHandler.java`
#### Snippet
```java
    {
        String msg = "Could not initialize repository system";
        if ( !RepositorySystem.class.equals( type ) )
        {
            msg += ", service " + type.getName() + " (" + impl.getName() + ") failed to initialize";
```

