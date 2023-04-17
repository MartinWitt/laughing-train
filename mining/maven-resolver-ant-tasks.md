# maven-resolver-ant-tasks 
 
# Bad smells
I found 80 bad smells with 27 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 18 | false |
| AssignmentToMethodParameter | 11 | false |
| NonStrictComparisonCanBeEquality | 10 | true |
| SizeReplaceableByIsEmpty | 7 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 4 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| UnnecessaryFullyQualifiedName | 3 | false |
| BoundedWildcard | 3 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| UnnecessarySemicolon | 2 | false |
| UseOfPropertiesAsHashtable | 2 | false |
| AssignmentToForLoopParameter | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| InnerClassMayBeStatic | 2 | true |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| UnnecessaryStringEscape | 1 | true |
| RegExpRedundantEscape | 1 | false |
| RedundantFieldInitialization | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| SynchronizeOnThis | 1 | false |
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
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/Layout.java`
#### Snippet
```java
            else if ( CLS.equals( token ) )
            {
                if ( artifact.getClassifier().length() <= 0 )
                {
                    if ( i > 0 )
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

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `AetherUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/resolver/internal/ant/AetherUtils.java`
#### Snippet
```java
import org.apache.tools.ant.Project;

class AetherUtils
{

```

### UtilityClassWithoutPrivateConstructor
Class `SettingsUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/resolver/internal/ant/SettingsUtils.java`
#### Snippet
```java
 * Utility methods to read settings from Mavens settings.xml.
 */
class SettingsUtils
{

```

### UtilityClassWithoutPrivateConstructor
Class `ConverterUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/resolver/internal/ant/ConverterUtils.java`
#### Snippet
```java
 * Utility methods to convert between Aether and Ant objects.
 */
class ConverterUtils
{

```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/resolver/internal/ant/types/Authentication.java`
#### Snippet
```java
        checkAttributesAllowed();
        this.servers.clear();
        String[] split = servers.split( "[;:]" );
        for ( String server : split )
        {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/Resolve.java`
#### Snippet
```java
            Collection<String> excluded = new HashSet<String>();

            String[] split = scopes.split( "[, ]" );
            for ( String scope : split )
            {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.repository` is unnecessary and can be removed
in `src/main/java/org/apache/maven/resolver/internal/ant/AntModelResolver.java`
#### Snippet
```java
    private final String context;

    private List<org.eclipse.aether.repository.RemoteRepository> repositories;

    private final RepositorySystem repoSys;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.artifact` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/maven/resolver/internal/ant/ConverterUtils.java`
#### Snippet
```java
{

    private static org.eclipse.aether.artifact.Artifact toArtifact( Dependency dependency, ArtifactTypeRegistry types )
    {
        ArtifactType type = types.get( dependency.getType() );
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.graph` is unnecessary and can be removed
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/Resolve.java`
#### Snippet
```java
        private DependencyFilter filter;

        public boolean accept( org.eclipse.aether.graph.DependencyNode node, List<DependencyNode> parents )
        {
            return filter == null || filter.accept( node, parents );
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

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `remoteRepositories` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/maven/resolver/internal/ant/types/Pom.java`
#### Snippet
```java
    private String packaging = "jar";

    private RemoteRepositories remoteRepositories;

    private String coords;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `file` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/maven/resolver/internal/ant/types/Pom.java`
#### Snippet
```java
    private String id;

    private File file;

    private String groupId;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `settings` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepoSys.java`
#### Snippet
```java
    private File globalSettings;

    private Settings settings;

    private final List<Mirror> mirrors = new CopyOnWriteArrayList<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `userSettings` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepoSys.java`
#### Snippet
```java
    private RemoteRepositoryManager remoteRepoMan;

    private File userSettings;

    private File globalSettings;
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

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/maven/resolver/internal/ant/ConverterUtils.java`
#### Snippet
```java
            if ( entry.getKey() instanceof String && entry.getValue() instanceof String )
            {
                props.put( entry.getKey(), entry.getValue() );
            }
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepoSys.java`
#### Snippet
```java
            }
            key = "env." + key;
            props.put( key, entry.getValue() );
        }
        return props;
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/resolver/internal/ant/types/RemoteRepository.java`
#### Snippet
```java
    private boolean releases = true;

    private boolean snapshots = false;

    private String checksums;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `prefix`
in `src/main/java/org/apache/maven/resolver/internal/ant/types/ModelValueExtractor.java`
#### Snippet
```java
        if ( prefix == null || prefix.length() <= 0 )
        {
            prefix = "pom.";
        }
        else if ( !prefix.endsWith( "." ) )
```

### AssignmentToMethodParameter
Assignment to method parameter `prefix`
in `src/main/java/org/apache/maven/resolver/internal/ant/types/ModelValueExtractor.java`
#### Snippet
```java
        else if ( !prefix.endsWith( "." ) )
        {
            prefix += '.';
        }
        this.prefix = prefix;
```

### AssignmentToMethodParameter
Assignment to method parameter `artifact`
in `src/main/java/org/apache/maven/resolver/internal/ant/ProjectWorkspaceReader.java`
#### Snippet
```java
    public File findArtifact( Artifact artifact )
    {
        artifact = artifacts.get( coords( artifact ) );
        return ( artifact != null ) ? artifact.getFile() : null;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `props`
in `src/main/java/org/apache/maven/resolver/internal/ant/ConverterUtils.java`
#### Snippet
```java
        if ( props == null )
        {
            props = new Properties();
        }
        for ( Map.Entry<?, ?> entry : map.entrySet() )
```

### AssignmentToMethodParameter
Assignment to method parameter `enabled`
in `src/main/java/org/apache/maven/resolver/internal/ant/ConverterUtils.java`
#### Snippet
```java
        if ( policy != null )
        {
            enabled = policy.isEnabled();
            if ( policy.getChecksums() != null )
            {
```

### AssignmentToMethodParameter
Assignment to method parameter `checksums`
in `src/main/java/org/apache/maven/resolver/internal/ant/ConverterUtils.java`
#### Snippet
```java
            if ( policy.getChecksums() != null )
            {
                checksums = policy.getChecksums();
            }
            if ( policy.getUpdates() != null )
```

### AssignmentToMethodParameter
Assignment to method parameter `updates`
in `src/main/java/org/apache/maven/resolver/internal/ant/ConverterUtils.java`
#### Snippet
```java
            if ( policy.getUpdates() != null )
            {
                updates = policy.getUpdates();
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `remoteRepositories`
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepoSys.java`
#### Snippet
```java
        RepositorySystemSession session = getSession( task, localRepository );

        remoteRepositories =
            remoteRepositories == null ? getMergedRepositories() : remoteRepositories;

```

### AssignmentToMethodParameter
Assignment to method parameter `remoteRepositories`
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepoSys.java`
#### Snippet
```java
        RepositorySystemSession session = getSession( task, null );

        remoteRepositories =
            remoteRepositories == null ? getMergedRepositories() : remoteRepositories;

```

### AssignmentToMethodParameter
Assignment to method parameter `localRepo`
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepoSys.java`
#### Snippet
```java
        if ( localRepo == null )
        {
            localRepo = localRepository;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `props`
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepoSys.java`
#### Snippet
```java
        if ( props == null )
        {
            props = new Properties();
        }
        boolean envCaseInsensitive = OS_WINDOWS;
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-17-09-22-04.703.html`
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
in `src/main/java/org/apache/maven/resolver/internal/ant/types/PomPropertyHelper.java`
#### Snippet
```java
        else if ( extractor.isApplicable( name ) )
        {
            return null;
        }
        return super.getPropertyHook( ns, name, user );
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/resolver/internal/ant/AetherUtils.java`
#### Snippet
```java
            return (RemoteRepositories) obj;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/resolver/internal/ant/AetherUtils.java`
#### Snippet
```java
        }
    
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/resolver/internal/ant/types/PomPropertyEvaluator.java`
#### Snippet
```java
            return NullReturn.NULL;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/resolver/internal/ant/types/ModelValueExtractor.java`
#### Snippet
```java
            {
                project.log( "Could not retrieve '" + expression + "' from POM: " + e.getMessage(), e, Project.MSG_WARN );
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/resolver/internal/ant/types/ModelValueExtractor.java`
#### Snippet
```java
        else
        {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/resolver/internal/ant/SettingsUtils.java`
#### Snippet
```java
        if ( policy == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/resolver/internal/ant/SettingsUtils.java`
#### Snippet
```java
        if ( repo == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/resolver/internal/ant/SettingsUtils.java`
#### Snippet
```java
        if ( activation == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/resolver/internal/ant/SettingsUtils.java`
#### Snippet
```java
        if ( activation == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/resolver/internal/ant/SettingsUtils.java`
#### Snippet
```java
        if ( profiles == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/resolver/internal/ant/SettingsUtils.java`
#### Snippet
```java
        if ( activation == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/resolver/internal/ant/SettingsUtils.java`
#### Snippet
```java
        if ( profile == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/resolver/internal/ant/SettingsUtils.java`
#### Snippet
```java
        if ( activation == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/resolver/internal/ant/ProjectWorkspaceReader.java`
#### Snippet
```java
    {
        artifact = artifacts.get( coords( artifact ) );
        return ( artifact != null ) ? artifact.getFile() : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/resolver/internal/ant/ConverterUtils.java`
#### Snippet
```java
        if ( proxy == null )
        {
            return null;
        }
        return new org.eclipse.aether.repository.Proxy( proxy.getType(), proxy.getHost(), proxy.getPort(),
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/resolver/internal/ant/ConverterUtils.java`
#### Snippet
```java
        if ( auth == null )
        {
            return null;
        }
        AuthenticationBuilder authBuilder = new AuthenticationBuilder();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/Resolve.java`
#### Snippet
```java
        public String getClassifier()
        {
            return null;
        }

```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`lt.length() > 0` can be replaced with '!lt.isEmpty()'
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/Layout.java`
#### Snippet
```java
                    {
                        String lt = tokens[i - 1];
                        if ( lt.length() > 0 && "-_".indexOf( lt.charAt( lt.length() - 1 ) ) >= 0 )
                        {
                            buffer.setLength( buffer.length() - 1 );
```

### SizeReplaceableByIsEmpty
`classifier.length() > 0` can be replaced with '!classifier.isEmpty()'
in `src/main/java/org/apache/maven/resolver/internal/ant/types/Dependency.java`
#### Snippet
```java
        key.append( ':' );
        key.append( ( type != null ) ? type : "jar" );
        if ( classifier != null && classifier.length() > 0 )
        {
            key.append( ':' );
```

### SizeReplaceableByIsEmpty
`server.length() > 0` can be replaced with '!server.isEmpty()'
in `src/main/java/org/apache/maven/resolver/internal/ant/types/Authentication.java`
#### Snippet
```java
        {
            server = server.trim();
            if ( server.length() > 0 )
            {
                this.servers.add( server );
```

### SizeReplaceableByIsEmpty
`prefix.length() > 0` can be replaced with '!prefix.isEmpty()'
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/Resolve.java`
#### Snippet
```java
        {
            StringBuilder buffer = new StringBuilder( 256 );
            if ( prefix != null && prefix.length() > 0 )
            {
                buffer.append( prefix );
```

### SizeReplaceableByIsEmpty
`artifact.getClassifier().length() > 0` can be replaced with '!artifact.getClassifier().isEmpty()'
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/Resolve.java`
#### Snippet
```java
            buffer.append( ':' );
            buffer.append( artifact.getExtension() );
            if ( artifact.getClassifier().length() > 0 )
            {
                buffer.append( ':' );
```

### SizeReplaceableByIsEmpty
`scope.length() > 0` can be replaced with '!scope.isEmpty()'
in `src/main/java/org/apache/maven/resolver/internal/ant/tasks/Resolve.java`
#### Snippet
```java
                    dst = included;
                }
                if ( scope.length() > 0 )
                {
                    dst.add( scope );
```

### SizeReplaceableByIsEmpty
`dep.getSystemPath().length() > 0` can be replaced with '!dep.getSystemPath().isEmpty()'
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepoSys.java`
#### Snippet
```java
                    continue;
                }
                if ( dep.getSystemPath() != null && dep.getSystemPath().length() > 0 )
                {
                    dependency.setSystemPath( task.getProject().resolveFile( dep.getSystemPath() ) );
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepoSys.java`
#### Snippet
```java
    private String getUserAgent()
    {
        StringBuilder buffer = new StringBuilder( 128 );

        buffer.append( "Apache-Ant/" ).append( project.getProperty( "ant.version" ) );
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

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/maven/resolver/internal/ant/types/Pom.java`
#### Snippet
```java
            return getRef().getModel( task );
        }
        synchronized ( this )
        {
            if ( model == null )
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `line`
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepoSys.java`
#### Snippet
```java
                    if ( comment >= 0 )
                    {
                        line = line.substring( 0, comment );
                    }
                    line = line.trim();
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `line`
in `src/main/java/org/apache/maven/resolver/internal/ant/AntRepoSys.java`
#### Snippet
```java
                        line = line.substring( 0, comment );
                    }
                    line = line.trim();
                    if ( line.length() <= 0 )
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Profile`
in `src/main/java/org/apache/maven/resolver/internal/ant/SettingsUtils.java`
#### Snippet
```java
{

    public static List<org.apache.maven.model.Profile> convert( List<Profile> profiles )
    {
        if ( profiles == null )
```

### BoundedWildcard
Can generalize to `? extends Exclusion`
in `src/main/java/org/apache/maven/resolver/internal/ant/ConverterUtils.java`
#### Snippet
```java
    }

    private static Collection<org.eclipse.aether.graph.Exclusion> toExclusions( Collection<Exclusion> exclusions1,
                                                                                 Collection<Exclusion> exclusions2 )
    {
```

### BoundedWildcard
Can generalize to `? extends Exclusion`
in `src/main/java/org/apache/maven/resolver/internal/ant/ConverterUtils.java`
#### Snippet
```java

    private static Collection<org.eclipse.aether.graph.Exclusion> toExclusions( Collection<Exclusion> exclusions1,
                                                                                 Collection<Exclusion> exclusions2 )
    {
        Collection<org.eclipse.aether.graph.Exclusion> results =
```

