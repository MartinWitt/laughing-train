# maven 
 
# Bad smells
I found 1873 bad smells with 37 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| Deprecation | 963 | false |
| FieldMayBeFinal | 168 | false |
| JavadocDeclaration | 166 | false |
| JavadocReference | 93 | false |
| DuplicatedCode | 73 | false |
| DeprecatedIsStillUsed | 72 | false |
| UNCHECKED_WARNING | 67 | false |
| ConstantValue | 51 | false |
| NonStrictComparisonCanBeEquality | 21 | true |
| UnusedAssignment | 18 | false |
| DataFlowIssue | 16 | false |
| ArraysAsListWithZeroOrOneArgument | 16 | false |
| IgnoreResultOfCall | 14 | false |
| CommentedOutCode | 12 | false |
| FieldCanBeLocal | 12 | false |
| StringBufferReplaceableByString | 10 | false |
| EmptyStatementBody | 9 | false |
| UnnecessaryToStringCall | 8 | true |
| DuplicateBranchesInSwitch | 6 | false |
| JavadocLinkAsPlainText | 5 | false |
| MismatchedCollectionQueryUpdate | 5 | false |
| IOStreamConstructor | 5 | false |
| UnnecessaryLocalVariable | 5 | true |
| CStyleArrayDeclaration | 4 | false |
| SuspiciousMethodCalls | 4 | false |
| UseBulkOperation | 4 | false |
| CloneableImplementsClone | 3 | false |
| RefusedBequest | 3 | false |
| DuplicateThrows | 3 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 3 | false |
| NonFinalFieldInEnum | 2 | false |
| InfiniteRecursion | 2 | false |
| StringConcatenationInLoops | 2 | false |
| RedundantCollectionOperation | 2 | false |
| DanglingJavadoc | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| RedundantCast | 2 | false |
| RedundantArrayCreation | 1 | true |
| FinalStaticMethod | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| RedundantTypeArguments | 1 | false |
| UNUSED_IMPORT | 1 | false |
| ReturnFromFinallyBlock | 1 | false |
| ConfusingMainMethod | 1 | false |
| UnnecessarySemicolon | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| CollectionContainsUrl | 1 | false |
| SynchronizeOnNonFinalField | 1 | false |
| EqualsHashCodeCalledOnUrl | 1 | false |
| AutoCloseableResource | 1 | false |
| UnnecessaryUnicodeEscape | 1 | false |
| UnnecessaryContinue | 1 | false |
| BusyWait | 1 | false |
| CopyConstructorMissesField | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `maven-compat/src/main/java/org/apache/maven/artifact/deployer/DefaultArtifactDeployer.java`
#### Snippet
```java
                pomArtifact = pomArtifact.setFile(((ProjectArtifactMetadata) metadata).getFile());
                request.addArtifact(pomArtifact);
            } else if (metadata instanceof SnapshotArtifactRepositoryMetadata
                    || metadata instanceof ArtifactRepositoryMetadata) {
                // eaten, handled by repo system
```

### EmptyStatementBody
`if` statement has empty body
in `maven-compat/src/main/java/org/apache/maven/artifact/installer/DefaultArtifactInstaller.java`
#### Snippet
```java
                pomArtifact = pomArtifact.setFile(((ProjectArtifactMetadata) metadata).getFile());
                request.addArtifact(pomArtifact);
            } else if (metadata instanceof SnapshotArtifactRepositoryMetadata
                    || metadata instanceof ArtifactRepositoryMetadata) {
                // eaten, handled by repo system
```

### EmptyStatementBody
`else` statement has empty body
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultGraphConflictResolver.java`
#### Snippet
```java
                        // currently processing the entry point - it should not have any entry incident edges
                        res.getEntry().getMd().setWhy("This is a graph entry point. No links.");
                    } else {
                        // System.out.println("--->"+v.getMd().toDomainString()
                        // +" has been terminated on this entry set\n-------------------\n"
```

### EmptyStatementBody
`if` statement has empty body
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
        // similar component for re-usage
        if (file != null) {
            if (file.isAbsolute()) {
                // path was already absolute, just normalize file separator and we're done
            } else if (file.getPath().startsWith(File.separator)) {
```

### EmptyStatementBody
`if` statement has empty body
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java
        // similar component for re-usage
        if (file != null) {
            if (file.isAbsolute()) {
                // path was already absolute, just normalize file separator and we're done
            } else if (file.getPath().startsWith(File.separator)) {
```

### EmptyStatementBody
`if` statement has empty body
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java
                        "Error evaluating plugin parameter expression: " + expression, e);
            }
        } else if (expression.equals("repositorySystemSession")) {
            // TODO: v4
        } else if (expression.equals("mojo") || expression.equals("mojoExecution")) {
```

### EmptyStatementBody
`if` statement has empty body
in `maven-core/src/main/java/org/apache/maven/internal/aether/DefaultRepositorySystemSessionFactory.java`
#### Snippet
```java

        Object transport = configProps.getOrDefault(MAVEN_RESOLVER_TRANSPORT_KEY, MAVEN_RESOLVER_TRANSPORT_DEFAULT);
        if (MAVEN_RESOLVER_TRANSPORT_DEFAULT.equals(transport)) {
            // The "default" mode (user did not set anything) from now on defaults to AUTO
        } else if (MAVEN_RESOLVER_TRANSPORT_NATIVE.equals(transport)) {
```

### EmptyStatementBody
`if` statement has empty body
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/builder/BuilderCommon.java`
#### Snippet
```java
            // assume these are system errors and further build is meaningless
            buildContext.getReactorBuildStatus().halt();
        } else if (MavenExecutionRequest.REACTOR_FAIL_NEVER.equals(rootSession.getReactorFailureBehavior())) {
            // continue the build
        } else if (MavenExecutionRequest.REACTOR_FAIL_AT_END.equals(rootSession.getReactorFailureBehavior())) {
```

### EmptyStatementBody
`if` statement has empty body
in `maven-core/src/main/java/org/apache/maven/configuration/BasedirBeanConfigurationPathTranslator.java`
#### Snippet
```java

        if (path != null && basedir != null) {
            if (path.isAbsolute()) {
                // path is already absolute, we're done
            } else if (path.getPath().startsWith(File.separator)) {
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of parameter `x`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/builder/multithreaded/ThreadOutputMuxer.java`
#### Snippet
```java

        @Override
        public void println(char x[]) {
            final PrintStream currentStream = getOutputStreamForCurrentThread();
            synchronized (currentStream) {
```

### CStyleArrayDeclaration
C-style array declaration of parameter `b`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/builder/multithreaded/ThreadOutputMuxer.java`
#### Snippet
```java

        @Override
        public void write(byte b[]) throws IOException {
            final PrintStream currentStream = getOutputStreamForCurrentThread();
            synchronized (currentStream) {
```

### CStyleArrayDeclaration
C-style array declaration of parameter `b`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/builder/multithreaded/ThreadOutputMuxer.java`
#### Snippet
```java

        @Override
        public void write(byte b[], int off, int len) {
            final PrintStream currentStream = getOutputStreamForCurrentThread();
            synchronized (currentStream) {
```

### CStyleArrayDeclaration
C-style array declaration of parameter `s`
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/builder/multithreaded/ThreadOutputMuxer.java`
#### Snippet
```java

        @Override
        public void print(char s[]) {
            final PrintStream currentStream = getOutputStreamForCurrentThread();
            synchronized (currentStream) {
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (8 lines)
in `maven-compat/src/main/java/org/apache/maven/project/validation/ModelValidationResult.java`
#### Snippet
```java
        StringBuilder message = new StringBuilder();

        //        if ( messages.size() == 1 )
        //        {
        //            message.append( "There was 1 validation error: " );
```

### CommentedOutCode
Commented out code (4 lines)
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/StringSearchModelInterpolator.java`
#### Snippet
```java
            }

            //            if ( fieldType.isPrimitive() )
            //            {
            //                return false;
```

### CommentedOutCode
Commented out code (2 lines)
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraphVertex.java`
#### Snippet
```java
        return hashString.toString().hashCode();

        // BASE64Encoder b64 = new BASE64Encoder();
        // return b64.encode( hashString.toString().getBytes() ).hashCode();
    }
```

### CommentedOutCode
Commented out code (20 lines)
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultClasspathTransformation.java`
#### Snippet
```java

            cpc.add(md);
            //
            //            TreeSet<MetadataGraphEdge> deps = new TreeSet<MetadataGraphEdge>(
            //                        new Comparator<MetadataGraphEdge>()
```

### CommentedOutCode
Commented out code (5 lines)
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultGraphConflictResolver.java`
#### Snippet
```java
                        res.getEntry().getMd().setWhy("This is a graph entry point. No links.");
                    } else {
                        // System.out.println("--->"+v.getMd().toDomainString()
                        // +" has been terminated on this entry set\n-------------------\n"
                        // +ins
```

### CommentedOutCode
Commented out code (4 lines)
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/ArtifactMetadata.java`
#### Snippet
```java

    public ArtifactMetadata(Artifact af) {
        /*
        if ( af != null )
        {
```

### CommentedOutCode
Commented out code (12 lines)
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/ArtifactMetadata.java`
#### Snippet
```java
    }
    // ------------------------------------------------------------------
    //    public void init( ArtifactMetadata af )
    //    {
    //        setGroupId( af.getGroupId() );
```

### CommentedOutCode
Commented out code (15 lines)
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    //    public void addProxy( String protocol, String host, int port, String username, String password,
    //                          String nonProxyHosts )
    //    {
```

### CommentedOutCode
Commented out code (2 lines)
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ResolutionListener.java`
#### Snippet
```java
    // TODO Remove ResolutionListenerDM interface

    // void manageArtifactVersion( Artifact artifact, Artifact replacement );

    // void manageArtifactScope( Artifact artifact, Artifact replacement );
```

### CommentedOutCode
Commented out code (6 lines)
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultProjectBuilder.java`
#### Snippet
```java
                                }

                                //                                @Override
                                //                                public List<ArtifactResolverResult>
                                // getArtifactResults()
```

### CommentedOutCode
Commented out code (2 lines)
in `maven-core/src/main/java/org/apache/maven/settings/DefaultMavenSettingsBuilder.java`
#### Snippet
```java
            // network paths as user.home directory. Unfortunately it did. I removed it and
            // have not detected any problems yet.
            // ---------------------------------------------------------------------------------
            // path = path.replaceAll( "//", "/" );

```

### CommentedOutCode
Commented out code (33 lines)
in `maven-core/src/main/java/org/apache/maven/toolchain/java/JavaToolchain.java`
#### Snippet
```java
 */
public interface JavaToolchain extends Toolchain {
    //    /**
    //     * Returns a list of {@link java.io.File}s which represents the bootstrap libraries for the
    //     * runtime environment. The Bootstrap libraries include libraries in JRE's
```

## RuleId[id=CloneableImplementsClone]
### CloneableImplementsClone
`BaseObject` is 'Cloneable' but does not define 'clone()' method
in `maven-model/src/main/java/org/apache/maven/model/BaseObject.java`
#### Snippet
```java
import java.io.Serializable;

public abstract class BaseObject implements Serializable, Cloneable, InputLocationTracker {
    protected transient ChildrenTracking childrenTracking;

```

### CloneableImplementsClone
`BaseObject` is 'Cloneable' but does not define 'clone()' method
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/BaseObject.java`
#### Snippet
```java
import java.io.Serializable;

public abstract class BaseObject implements Serializable, Cloneable {
    protected transient ChildrenTracking childrenTracking;

```

### CloneableImplementsClone
`BaseObject` is 'Cloneable' but does not define 'clone()' method
in `maven-settings/src/main/java/org/apache/maven/settings/BaseObject.java`
#### Snippet
```java
import java.io.Serializable;

public abstract class BaseObject implements Serializable, Cloneable {
    protected transient ChildrenTracking childrenTracking;

```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `maven-xml-impl/src/main/java/org/apache/maven/internal/xml/XmlNodeImpl.java`
#### Snippet
```java
    }

    public XmlNode clone() {
        return this;
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/MojoDescriptor.java`
#### Snippet
```java
     */
    @Override
    public MojoDescriptor clone() {
        try {
            return (MojoDescriptor) super.clone();
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/PluginDescriptor.java`
#### Snippet
```java
     */
    @Override
    public PluginDescriptor clone() {
        try {
            return (PluginDescriptor) super.clone();
```

## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `maven-core/src/main/java/org/apache/maven/execution/MavenSession.java`
#### Snippet
```java
            MavenExecutionResult result,
            MavenProject project) {
        this(container, request, result, Arrays.asList(new MavenProject[] {project}));
    }

```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/pull/BufferingParser.java`
#### Snippet
```java
            case START_DOCUMENT:
            case END_DOCUMENT:
                break;
            case START_TAG:
                event.name = pp.getName();
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `maven-core/src/main/java/org/apache/maven/repository/ArtifactTransferEvent.java`
#### Snippet
```java
                break;
            case REQUEST_GET:
                break;
            default:
                throw new IllegalArgumentException("Illegal request type: " + requestType);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `maven-core/src/main/java/org/apache/maven/repository/ArtifactTransferEvent.java`
#### Snippet
```java
                break;
            case TRANSFER_STARTED:
                break;
            case TRANSFER_COMPLETED:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `maven-core/src/main/java/org/apache/maven/repository/ArtifactTransferEvent.java`
#### Snippet
```java
                break;
            case TRANSFER_COMPLETED:
                break;
            case TRANSFER_PROGRESS:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `maven-core/src/main/java/org/apache/maven/repository/ArtifactTransferEvent.java`
#### Snippet
```java
                break;
            case TRANSFER_PROGRESS:
                break;
            case TRANSFER_ERROR:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `maven-core/src/main/java/org/apache/maven/repository/ArtifactTransferEvent.java`
#### Snippet
```java
                break;
            case TRANSFER_ERROR:
                break;
            default:
                throw new IllegalArgumentException("Illegal event type: " + eventType);
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `id` in enum 'ArtifactScopeEnum'
in `maven-compat/src/main/java/org/apache/maven/artifact/ArtifactScopeEnum.java`
#### Snippet
```java
    public static final ArtifactScopeEnum DEFAULT_SCOPE = compile;

    private int id;

    // Constructor
```

### NonFinalFieldInEnum
Non-final field `id` in enum 'MetadataResolutionRequestTypeEnum'
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionRequestTypeEnum.java`
#### Snippet
```java
    scopedGraph(7);

    private int id;

    // Constructor
```

## RuleId[id=Deprecation]
### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/Artifact.java`
#### Snippet
```java
    void setRepository(ArtifactRepository remoteRepository);

    ArtifactRepository getRepository();

    void updateVersion(String version, ArtifactRepository localRepository);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/Artifact.java`
#### Snippet
```java
    ArtifactRepository getRepository();

    void updateVersion(String version, ArtifactRepository localRepository);

    String getDownloadUrl();
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/Artifact.java`
#### Snippet
```java
    String getDependencyConflictId();

    void addMetadata(ArtifactMetadata metadata);

    Collection<ArtifactMetadata> getMetadataList();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/Artifact.java`
#### Snippet
```java
    Collection<ArtifactMetadata> getMetadataList();

    void setRepository(ArtifactRepository remoteRepository);

    ArtifactRepository getRepository();
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/Artifact.java`
#### Snippet
```java
    void addMetadata(ArtifactMetadata metadata);

    Collection<ArtifactMetadata> getMetadataList();

    void setRepository(ArtifactRepository remoteRepository);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionException.java`
#### Snippet
```java

    public ArtifactResolutionException(
            String message, Artifact artifact, List<ArtifactRepository> remoteRepositories, Throwable cause) {
        super(message, artifact, remoteRepositories, cause);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionException.java`
#### Snippet
```java
            String type,
            String classifier,
            List<ArtifactRepository> remoteRepositories,
            List<String> path,
            Throwable t) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionException.java`
#### Snippet
```java
    }

    public ArtifactResolutionException(String message, Artifact artifact, List<ArtifactRepository> remoteRepositories) {
        super(message, artifact, remoteRepositories);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/ArtifactNotFoundException.java`
#### Snippet
```java
            String type,
            String classifier,
            List<ArtifactRepository> remoteRepositories,
            String downloadUrl,
            List<String> path,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/ArtifactNotFoundException.java`
#### Snippet
```java

    protected ArtifactNotFoundException(
            String message, Artifact artifact, List<ArtifactRepository> remoteRepositories) {
        super(message, artifact, remoteRepositories);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/ArtifactNotFoundException.java`
#### Snippet
```java
            String type,
            String classifier,
            List<ArtifactRepository> remoteRepositories,
            String downloadUrl,
            List<String> path) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/ArtifactNotFoundException.java`
#### Snippet
```java

    protected ArtifactNotFoundException(
            String message, Artifact artifact, List<ArtifactRepository> remoteRepositories, Throwable cause) {
        this(
                message,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/MultipleArtifactsNotFoundException.java`
#### Snippet
```java
            List<Artifact> resolvedArtifacts,
            List<Artifact> missingArtifacts,
            List<ArtifactRepository> remoteRepositories) {
        super(constructMessage(missingArtifacts), originatingArtifact, remoteRepositories);
        this.resolvedArtifacts = resolvedArtifacts;
```

### Deprecation
Overrides deprecated method in 'java.util.Properties'
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public void save(OutputStream out, String comments) {
        Properties props = new Properties();
        props.putAll(getter.get());
```

### Deprecation
'save(java.io.OutputStream, java.lang.String)' is deprecated
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java
        Properties props = new Properties();
        props.putAll(getter.get());
        props.save(out, comments);
    }

```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/repository/layout/ArtifactRepositoryLayout2.java`
#### Snippet
```java
 * ArtifactRepositoryLayout2
 */
public interface ArtifactRepositoryLayout2 extends ArtifactRepositoryLayout {

    ArtifactRepository newMavenArtifactRepository(
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/repository/layout/ArtifactRepositoryLayout2.java`
#### Snippet
```java
public interface ArtifactRepositoryLayout2 extends ArtifactRepositoryLayout {

    ArtifactRepository newMavenArtifactRepository(
            String id, String url, ArtifactRepositoryPolicy snapshots, ArtifactRepositoryPolicy releases);
}
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/repository/layout/ArtifactRepositoryLayout2.java`
#### Snippet
```java

    ArtifactRepository newMavenArtifactRepository(
            String id, String url, ArtifactRepositoryPolicy snapshots, ArtifactRepositoryPolicy releases);
}

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/repository/layout/ArtifactRepositoryLayout2.java`
#### Snippet
```java

    ArtifactRepository newMavenArtifactRepository(
            String id, String url, ArtifactRepositoryPolicy snapshots, ArtifactRepositoryPolicy releases);
}

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/OverConstrainedVersionException.java`
#### Snippet
```java
    }

    public OverConstrainedVersionException(String msg, Artifact artifact, List<ArtifactRepository> remoteRepositories) {
        super(msg, artifact, remoteRepositories);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java`
#### Snippet
```java
    }

    public void updateVersion(String version, ArtifactRepository localRepository) {
        setResolvedVersion(version);
        setFile(new File(localRepository.getBasedir(), localRepository.pathOf(this)));
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java`
#### Snippet
```java
    }

    public void setRepository(ArtifactRepository repository) {
        this.repository = repository;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java`
#### Snippet
```java
    private volatile File file;

    private ArtifactRepository repository;

    private String downloadUrl;
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java`
#### Snippet
```java
    }

    public Collection<ArtifactMetadata> getMetadataList() {
        if (metadataMap == null) {
            return Collections.emptyList();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java`
#### Snippet
```java
    }

    public ArtifactRepository getRepository() {
        return repository;
    }
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java`
#### Snippet
```java
    }

    public void addMetadata(ArtifactMetadata metadata) {
        if (metadataMap == null) {
            metadataMap = new HashMap<>();
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java`
#### Snippet
```java
        }

        ArtifactMetadata m = metadataMap.get(metadata.getKey());
        if (m != null) {
            m.merge(metadata);
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java`
#### Snippet
```java
    private List<ArtifactVersion> availableVersions;

    private Map<Object, ArtifactMetadata> metadataMap;

    private boolean optional;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java

    protected AbstractArtifactResolutionException(
            String message, Artifact artifact, List<ArtifactRepository> remoteRepositories) {
        this(message, artifact, remoteRepositories, null);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
    }

    public List<ArtifactRepository> getRemoteRepositories() {
        return remoteRepositories;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
    private Artifact artifact;

    private List<ArtifactRepository> remoteRepositories;

    private final String originalMessage;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
            String type,
            String classifier,
            List<ArtifactRepository> remoteRepositories,
            List<String> path,
            Throwable t) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
            String version,
            String type,
            List<ArtifactRepository> remoteRepositories,
            List<String> path) {
        StringBuilder sb = new StringBuilder();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
                }

                for (Iterator<ArtifactRepository> i = remoteRepositories.iterator(); i.hasNext(); ) {
                    ArtifactRepository remoteRepository = i.next();

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java

                for (Iterator<ArtifactRepository> i = remoteRepositories.iterator(); i.hasNext(); ) {
                    ArtifactRepository remoteRepository = i.next();

                    sb.append(remoteRepository.getId());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
                    sb.append(remoteRepository.getUrl());

                    ArtifactRepositoryPolicy releases = remoteRepository.getReleases();
                    if (releases != null) {
                        sb.append(", releases=").append(releases.isEnabled());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
                    }

                    ArtifactRepositoryPolicy snapshots = remoteRepository.getSnapshots();
                    if (snapshots != null) {
                        sb.append(", snapshots=").append(snapshots.isEnabled());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
            String type,
            String classifier,
            List<ArtifactRepository> remoteRepositories,
            List<String> path) {
        this(message, groupId, artifactId, version, type, classifier, remoteRepositories, path, null);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java

    protected AbstractArtifactResolutionException(
            String message, Artifact artifact, List<ArtifactRepository> remoteRepositories, Throwable t) {
        this(
                message,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/repository/legacy/metadata/ArtifactMetadata.java`
#### Snippet
```java
     * @return the filename
     */
    String getLocalFilename(ArtifactRepository repository);

    /**
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/repository/legacy/metadata/ArtifactMetadata.java`
#### Snippet
```java
    /**
     * Merge a new metadata set into this piece of metadata.
     * TODO this should only be needed on the repository metadata {@link org.apache.maven.artifact.metadata.ArtifactMetadata}
     *
     * @param metadata the new metadata
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/repository/legacy/metadata/ArtifactMetadata.java`
#### Snippet
```java
    /**
     * Store the metadata in the local repository.
     * TODO this should only be needed on the repository metadata {@link org.apache.maven.artifact.metadata.ArtifactMetadata}
     *
     * @param localRepository  the local repository
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/repository/legacy/metadata/ArtifactMetadata.java`
#### Snippet
```java
     * @throws RepositoryMetadataStoreException in case of issue
     */
    void storeInLocalRepository(ArtifactRepository localRepository, ArtifactRepository remoteRepository)
            throws RepositoryMetadataStoreException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-artifact/src/main/java/org/apache/maven/repository/legacy/metadata/ArtifactMetadata.java`
#### Snippet
```java
     * @throws RepositoryMetadataStoreException in case of issue
     */
    void storeInLocalRepository(ArtifactRepository localRepository, ArtifactRepository remoteRepository)
            throws RepositoryMetadataStoreException;

```

### Deprecation
'org.apache.maven.project.inheritance.ModelInheritanceAssembler' is deprecated
in `maven-compat/src/main/java/org/apache/maven/project/inheritance/DefaultModelInheritanceAssembler.java`
#### Snippet
```java
 * DefaultModelInheritanceAssembler
 */
@Component(role = ModelInheritanceAssembler.class)
public class DefaultModelInheritanceAssembler implements ModelInheritanceAssembler {
    @Override
```

### Deprecation
'org.apache.maven.project.inheritance.ModelInheritanceAssembler' is deprecated
in `maven-compat/src/main/java/org/apache/maven/project/inheritance/DefaultModelInheritanceAssembler.java`
#### Snippet
```java
 */
@Component(role = ModelInheritanceAssembler.class)
public class DefaultModelInheritanceAssembler implements ModelInheritanceAssembler {
    @Override
    public void assembleModelInheritance(Model child, Model parent, String childPathAdjustment) {
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/UnknownRepositoryLayoutException.java`
#### Snippet
```java
/**
 * Exception which is meant to occur when a layout specified for a particular
 * repository doesn't have a corresponding {@link org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout}
 * component in the current container.
 *
```

### Deprecation
Overrides deprecated method in 'java.util.Properties'
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public void save(OutputStream out, String comments) {
        Properties props = new Properties();
        props.putAll(getter.get());
```

### Deprecation
'save(java.io.OutputStream, java.lang.String)' is deprecated
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java
        Properties props = new Properties();
        props.putAll(getter.get());
        props.save(out, comments);
    }

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/deployer/ArtifactDeployer.java`
#### Snippet
```java
     */
    void deploy(
            File source, Artifact artifact, ArtifactRepository deploymentRepository, ArtifactRepository localRepository)
            throws ArtifactDeploymentException;
}
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/deployer/ArtifactDeployer.java`
#### Snippet
```java
     */
    void deploy(
            File source, Artifact artifact, ArtifactRepository deploymentRepository, ArtifactRepository localRepository)
            throws ArtifactDeploymentException;
}
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/manager/DefaultWagonManager.java`
#### Snippet
```java
    }

    public void getArtifact(Artifact artifact, ArtifactRepository repository)
            throws TransferFailedException, ResourceDoesNotExistException {
        getArtifact(artifact, repository, null, false);
```

### Deprecation
'org.apache.maven.artifact.manager.WagonManager' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/manager/DefaultWagonManager.java`
#### Snippet
```java
 * Manages <a href="https://maven.apache.org/wagon">Wagon</a> related operations in Maven.
 */
@Component(role = WagonManager.class)
public class DefaultWagonManager extends org.apache.maven.repository.legacy.DefaultWagonManager
        implements WagonManager {
```

### Deprecation
'org.apache.maven.artifact.manager.WagonManager' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/manager/DefaultWagonManager.java`
#### Snippet
```java
@Component(role = WagonManager.class)
public class DefaultWagonManager extends org.apache.maven.repository.legacy.DefaultWagonManager
        implements WagonManager {

    // NOTE: This must use a different field name than in the super class or IoC has no chance to inject the loggers
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/manager/DefaultWagonManager.java`
#### Snippet
```java
    }

    public void getArtifact(Artifact artifact, List<ArtifactRepository> remoteRepositories)
            throws TransferFailedException, ResourceDoesNotExistException {
        getArtifact(artifact, remoteRepositories, null, false);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/UnresolvedArtifacts.java`
#### Snippet
```java

    public UnresolvedArtifacts(
            Artifact originatingArtifact, List<Artifact> artifacts, List<ArtifactRepository> remoteRepositories) {
        this.originatingArtifact = originatingArtifact;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/UnresolvedArtifacts.java`
#### Snippet
```java
    }

    public List<ArtifactRepository> getRemoteRepositories() {
        return remoteRepositories;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/UnresolvedArtifacts.java`
#### Snippet
```java
    private List<Artifact> artifacts;

    private List<ArtifactRepository> remoteRepositories;

    public UnresolvedArtifacts(
```

### Deprecation
Overrides deprecated method in 'org.apache.maven.project.interpolation.ModelInterpolator'
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/AbstractStringBasedModelInterpolator.java`
#### Snippet
```java
     */
    @Deprecated
    public Model interpolate(Model model, Map<String, ?> context, boolean strict) throws ModelInterpolationException {
        Properties props = new Properties();
        props.putAll(context);
```

### Deprecation
Overrides deprecated method in 'org.apache.maven.project.interpolation.ModelInterpolator'
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/AbstractStringBasedModelInterpolator.java`
#### Snippet
```java
    protected AbstractStringBasedModelInterpolator() {}

    public Model interpolate(Model model, Map<String, ?> context) throws ModelInterpolationException {
        return interpolate(model, context, true);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/deployer/DefaultArtifactDeployer.java`
#### Snippet
```java

    public void deploy(
            File source, Artifact artifact, ArtifactRepository deploymentRepository, ArtifactRepository localRepository)
            throws ArtifactDeploymentException {
        RepositorySystemSession session =
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/deployer/DefaultArtifactDeployer.java`
#### Snippet
```java

    public void deploy(
            File source, Artifact artifact, ArtifactRepository deploymentRepository, ArtifactRepository localRepository)
            throws ArtifactDeploymentException {
        RepositorySystemSession session =
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/deployer/DefaultArtifactDeployer.java`
#### Snippet
```java
        request.addMetadata(relatedMetadata.get(versionKey));

        for (ArtifactMetadata metadata : artifact.getMetadataList()) {
            if (metadata instanceof ProjectArtifactMetadata) {
                org.eclipse.aether.artifact.Artifact pomArtifact = new SubArtifact(mainArtifact, "", "pom");
```

### Deprecation
'org.apache.maven.artifact.repository.DefaultArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/deployer/DefaultArtifactDeployer.java`
#### Snippet
```java
         * using an alternative deployment location.
         */
        if (deploymentRepository instanceof DefaultArtifactRepository
                && deploymentRepository.getAuthentication() == null) {
            RemoteRepository.Builder builder = new RemoteRepository.Builder(remoteRepo);
```

### Deprecation
'org.apache.maven.artifact.resolver.ResolutionListenerForDepMgmt' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DebugResolutionListener.java`
#### Snippet
```java
 * @author <a href="mailto:brett@apache.org">Brett Porter</a>
 */
public class DebugResolutionListener implements ResolutionListener, ResolutionListenerForDepMgmt {
    private Logger logger;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/installer/ArtifactInstaller.java`
#### Snippet
```java
     * @throws ArtifactInstallationException if an error occurred installing the artifact
     */
    void install(File source, Artifact artifact, ArtifactRepository localRepository)
            throws ArtifactInstallationException;
}
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java
            throws UnknownRepositoryLayoutException;

    ArtifactRepository createDeploymentArtifactRepository(
            String id, String url, ArtifactRepositoryLayout layout, boolean uniqueVersion);

```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java

    ArtifactRepository createDeploymentArtifactRepository(
            String id, String url, ArtifactRepositoryLayout layout, boolean uniqueVersion);

    ArtifactRepository createArtifactRepository(
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java
            String id, String url, ArtifactRepositoryLayout layout, boolean uniqueVersion);

    ArtifactRepository createArtifactRepository(
            String id,
            String url,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java
            String url,
            String layoutId,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases)
            throws UnknownRepositoryLayoutException;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java
            String layoutId,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases)
            throws UnknownRepositoryLayoutException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java
            throws UnknownRepositoryLayoutException;

    ArtifactRepository createArtifactRepository(
            String id,
            String url,
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java
            String id,
            String url,
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java
            String url,
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases);

    void setGlobalUpdatePolicy(String snapshotPolicy);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/installer/DefaultArtifactInstaller.java`
#### Snippet
```java
    }

    public void install(File source, Artifact artifact, ArtifactRepository localRepository)
            throws ArtifactInstallationException {
        RepositorySystemSession session =
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/installer/DefaultArtifactInstaller.java`
#### Snippet
```java
        request.addArtifact(mainArtifact);

        for (ArtifactMetadata metadata : artifact.getMetadataList()) {
            if (metadata instanceof ProjectArtifactMetadata) {
                org.eclipse.aether.artifact.Artifact pomArtifact = new SubArtifact(mainArtifact, "", "pom");
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/layout/FlatRepositoryLayout.java`
#### Snippet
```java
    }

    public String pathOfRemoteRepositoryMetadata(ArtifactMetadata metadata) {
        return pathOfRepositoryMetadata(metadata.getRemoteFilename());
    }
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/layout/FlatRepositoryLayout.java`
#### Snippet
```java
    }

    public String pathOfLocalRepositoryMetadata(ArtifactMetadata metadata, ArtifactRepository repository) {
        return pathOfRepositoryMetadata(metadata.getLocalFilename(repository));
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/layout/FlatRepositoryLayout.java`
#### Snippet
```java
    }

    public String pathOfLocalRepositoryMetadata(ArtifactMetadata metadata, ArtifactRepository repository) {
        return pathOfRepositoryMetadata(metadata.getLocalFilename(repository));
    }
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/layout/FlatRepositoryLayout.java`
#### Snippet
```java
 * FlatRepositoryLayout
 */
@Component(role = ArtifactRepositoryLayout.class, hint = "flat")
public class FlatRepositoryLayout implements ArtifactRepositoryLayout {

```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/layout/FlatRepositoryLayout.java`
#### Snippet
```java
 */
@Component(role = ArtifactRepositoryLayout.class, hint = "flat")
public class FlatRepositoryLayout implements ArtifactRepositoryLayout {

    private static final char ARTIFACT_SEPARATOR = '-';
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
    }

    private boolean isLocalRepository(ArtifactRepository repository) {
        // unfortunately, the API doesn't allow to tell a remote repo and the local repo apart...
        return "local".equals(repository.getId());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
    }

    public ArtifactRepository createArtifactRepository(
            String id,
            String url,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
            String url,
            String layoutId,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases)
            throws UnknownRepositoryLayoutException {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
            String layoutId,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases)
            throws UnknownRepositoryLayoutException {
        return injectSession(factory.createArtifactRepository(id, url, layoutId, snapshots, releases), true);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
    }

    public ArtifactRepository createDeploymentArtifactRepository(
            String id, String url, ArtifactRepositoryLayout repositoryLayout, boolean uniqueVersion) {
        return injectSession(
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java

    public ArtifactRepository createDeploymentArtifactRepository(
            String id, String url, ArtifactRepositoryLayout repositoryLayout, boolean uniqueVersion) {
        return injectSession(
                factory.createDeploymentArtifactRepository(id, url, repositoryLayout, uniqueVersion), false);
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
    private RepositorySystem repositorySystem;

    public ArtifactRepositoryLayout getLayout(String layoutId) throws UnknownRepositoryLayoutException {
        return factory.getLayout(layoutId);
    }
```

### Deprecation
'getLayout(java.lang.String)' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java

    public ArtifactRepositoryLayout getLayout(String layoutId) throws UnknownRepositoryLayoutException {
        return factory.getLayout(layoutId);
    }

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
    }

    public ArtifactRepository createDeploymentArtifactRepository(
            String id, String url, String layoutId, boolean uniqueVersion) throws UnknownRepositoryLayoutException {
        return injectSession(factory.createDeploymentArtifactRepository(id, url, layoutId, uniqueVersion), false);
```

### Deprecation
'createDeploymentArtifactRepository(java.lang.String, java.lang.String, java.lang.String, boolean)' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
    public ArtifactRepository createDeploymentArtifactRepository(
            String id, String url, String layoutId, boolean uniqueVersion) throws UnknownRepositoryLayoutException {
        return injectSession(factory.createDeploymentArtifactRepository(id, url, layoutId, uniqueVersion), false);
    }

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
    }

    private ArtifactRepository injectSession(ArtifactRepository repository, boolean mirrors) {
        RepositorySystemSession session = legacySupport.getRepositorySession();

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
    }

    private ArtifactRepository injectSession(ArtifactRepository repository, boolean mirrors) {
        RepositorySystemSession session = legacySupport.getRepositorySession();

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java

        if (session != null && repository != null && !isLocalRepository(repository)) {
            List<ArtifactRepository> repositories = Arrays.asList(repository);

            if (mirrors) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
    }

    public ArtifactRepository createArtifactRepository(
            String id,
            String url,
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
            String id,
            String url,
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
            String url,
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases) {
        return injectSession(factory.createArtifactRepository(id, url, repositoryLayout, snapshots, releases), true);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases) {
        return injectSession(factory.createArtifactRepository(id, url, repositoryLayout, snapshots, releases), true);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/SnapshotArtifactRepositoryMetadata.java`
#### Snippet
```java
    }

    public ArtifactRepository getRepository() {
        return artifact.getRepository();
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/SnapshotArtifactRepositoryMetadata.java`
#### Snippet
```java
    }

    public void setRepository(ArtifactRepository remoteRepository) {
        artifact.setRepository(remoteRepository);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/GroupRepositoryMetadata.java`
#### Snippet
```java
    }

    public ArtifactRepository getRepository() {
        return null;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/GroupRepositoryMetadata.java`
#### Snippet
```java
    }

    public void setRepository(ArtifactRepository remoteRepository) {
        // intentionally blank
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java

    public void resolveAlways(
            Artifact artifact, List<ArtifactRepository> remoteRepositories, ArtifactRepository localRepository)
            throws ArtifactResolutionException, ArtifactNotFoundException {
        resolve(artifact, remoteRepositories, getSession(localRepository));
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java

    public void resolveAlways(
            Artifact artifact, List<ArtifactRepository> remoteRepositories, ArtifactRepository localRepository)
            throws ArtifactResolutionException, ArtifactNotFoundException {
        resolve(artifact, remoteRepositories, getSession(localRepository));
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java

    public void resolve(
            Artifact artifact, List<ArtifactRepository> remoteRepositories, ArtifactRepository localRepository)
            throws ArtifactResolutionException, ArtifactNotFoundException {
        resolve(artifact, remoteRepositories, localRepository, null);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java

    public void resolve(
            Artifact artifact, List<ArtifactRepository> remoteRepositories, ArtifactRepository localRepository)
            throws ArtifactResolutionException, ArtifactNotFoundException {
        resolve(artifact, remoteRepositories, localRepository, null);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            Artifact originatingArtifact,
            Map<String, Artifact> managedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            Map<String, Artifact> managedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
            ArtifactFilter filter)
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataSource' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
            ArtifactFilter filter)
            throws ArtifactResolutionException, ArtifactNotFoundException {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            Set<Artifact> artifacts,
            Artifact originatingArtifact,
            List<ArtifactRepository> remoteRepositories,
            ArtifactRepository localRepository,
            ArtifactMetadataSource source)
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            Artifact originatingArtifact,
            List<ArtifactRepository> remoteRepositories,
            ArtifactRepository localRepository,
            ArtifactMetadataSource source)
            throws ArtifactResolutionException, ArtifactNotFoundException {
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataSource' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            List<ArtifactRepository> remoteRepositories,
            ArtifactRepository localRepository,
            ArtifactMetadataSource source)
            throws ArtifactResolutionException, ArtifactNotFoundException {
        return resolveTransitively(artifacts, originatingArtifact, localRepository, remoteRepositories, source, null);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
    }

    private RepositorySystemSession getSession(ArtifactRepository localRepository) {
        return LegacyLocalRepositoryManager.overlay(localRepository, legacySupport.getRepositorySession(), repoSystem);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
                Artifact artifact,
                RepositorySystemSession session,
                List<ArtifactRepository> remoteRepositories,
                ArtifactResolutionResult result) {
            this.classLoader = classLoader;
```

### Deprecation
'org.apache.maven.artifact.factory.ArtifactFactory' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java

    @Requirement
    protected ArtifactFactory artifactFactory;

    @Requirement
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataSource' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java

    @Requirement
    private ArtifactMetadataSource source;

    @Requirement
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
        private final RepositorySystemSession session;

        private final List<ArtifactRepository> remoteRepositories;

        private final ArtifactResolutionResult result;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
    public void resolve(
            Artifact artifact,
            List<ArtifactRepository> remoteRepositories,
            ArtifactRepository localRepository,
            TransferListener resolutionListener)
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            Artifact artifact,
            List<ArtifactRepository> remoteRepositories,
            ArtifactRepository localRepository,
            TransferListener resolutionListener)
            throws ArtifactResolutionException, ArtifactNotFoundException {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            Set<Artifact> artifacts,
            Artifact originatingArtifact,
            List<ArtifactRepository> remoteRepositories,
            ArtifactRepository localRepository,
            ArtifactMetadataSource source,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            Artifact originatingArtifact,
            List<ArtifactRepository> remoteRepositories,
            ArtifactRepository localRepository,
            ArtifactMetadataSource source,
            List<ResolutionListener> listeners)
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataSource' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            List<ArtifactRepository> remoteRepositories,
            ArtifactRepository localRepository,
            ArtifactMetadataSource source,
            List<ResolutionListener> listeners)
            throws ArtifactResolutionException, ArtifactNotFoundException {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            Artifact originatingArtifact,
            Map<String, Artifact> managedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source)
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            Map<String, Artifact> managedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source)
            throws ArtifactResolutionException, ArtifactNotFoundException {
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataSource' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source)
            throws ArtifactResolutionException, ArtifactNotFoundException {
        return resolveTransitively(
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            Artifact originatingArtifact,
            Map<String, Artifact> managedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            Map<String, Artifact> managedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
            ArtifactFilter filter,
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataSource' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
            ArtifactFilter filter,
            List<ResolutionListener> listeners)
```

### Deprecation
'org.apache.maven.artifact.resolver.ArtifactCollector' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java

    @Requirement
    private ArtifactCollector artifactCollector;

    @Requirement
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            Artifact originatingArtifact,
            Map<String, Artifact> managedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            Map<String, Artifact> managedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
            ArtifactFilter filter,
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataSource' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
            ArtifactFilter filter,
            List<ResolutionListener> listeners,
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataSource' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
        if (source == null) {
            try {
                source = container.lookup(ArtifactMetadataSource.class);
            } catch (ComponentLookupException e) {
                // won't happen
```

### Deprecation
'org.apache.maven.artifact.metadata.ResolutionGroup' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java

            try {
                ResolutionGroup resolutionGroup = source.retrieve(metadataRequest);

                if (managedVersions == null) {
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataRetrievalException' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
                collectionRequest.setProxies(request.getProxies());
                collectionRequest.setRemoteRepositories(resolutionGroup.getResolutionRepositories());
            } catch (ArtifactMetadataRetrievalException e) {
                ArtifactResolutionException are = new ArtifactResolutionException(
                        "Unable to get dependency information for " + rootArtifact.getId() + ": " + e.getMessage(),
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            Set<Artifact> artifacts,
            Artifact originatingArtifact,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            Artifact originatingArtifact,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
            ArtifactFilter filter)
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataSource' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
            ArtifactFilter filter)
            throws ArtifactResolutionException, ArtifactNotFoundException {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DefaultArtifactResolver.java`
#### Snippet
```java

    private void resolve(
            Artifact artifact, List<ArtifactRepository> remoteRepositories, RepositorySystemSession session)
            throws ArtifactResolutionException, ArtifactNotFoundException {
        if (artifact == null) {
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/MetadataBridge.java`
#### Snippet
```java
    private boolean merged;

    public MetadataBridge(ArtifactMetadata metadata) {
        this.metadata = metadata;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/MetadataBridge.java`
#### Snippet
```java
                Files.copy(current.toPath(), result.toPath());
            }
            ArtifactRepository localRepo = new MetadataRepository(result);
            metadata.storeInLocalRepository(localRepo, localRepo);
            merged = true;
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/MetadataBridge.java`
#### Snippet
```java
public final class MetadataBridge extends AbstractMetadata implements MergeableMetadata {

    private ArtifactMetadata metadata;

    private boolean merged;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/MirrorSelector.java`
#### Snippet
```java
     * @return The mirror specification for the repository or {@code null} if no mirror matched.
     */
    Mirror getMirror(ArtifactRepository repository, List<Mirror> mirrors);
}

```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/UserLocalArtifactRepository.java`
#### Snippet
```java

    @Override
    public String pathOfLocalRepositoryMetadata(ArtifactMetadata metadata, ArtifactRepository repository) {
        return localRepository.pathOfLocalRepositoryMetadata(metadata, repository);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/UserLocalArtifactRepository.java`
#### Snippet
```java

    @Override
    public String pathOfLocalRepositoryMetadata(ArtifactMetadata metadata, ArtifactRepository repository) {
        return localRepository.pathOfLocalRepositoryMetadata(metadata, repository);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/UserLocalArtifactRepository.java`
#### Snippet
```java
    private ArtifactRepository localRepository;

    public UserLocalArtifactRepository(ArtifactRepository localRepository) {
        this.localRepository = localRepository;
        setLayout(localRepository.getLayout());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/UserLocalArtifactRepository.java`
#### Snippet
```java
 */
public class UserLocalArtifactRepository extends LocalArtifactRepository {
    private ArtifactRepository localRepository;

    public UserLocalArtifactRepository(ArtifactRepository localRepository) {
```

### Deprecation
'toURL()' is deprecated
in `maven-compat/src/main/java/org/apache/maven/usability/plugin/ExpressionDocumenter.java`
#### Snippet
```java
        URL docResource;
        try {
            docResource = new File(myClasspathEntry).toURL();
        } catch (MalformedURLException e) {
            throw new ExpressionDocumentationException(
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/UpdateCheckManager.java`
#### Snippet
```java
    String getError(Artifact artifact, ArtifactRepository repository);

    boolean isUpdateRequired(RepositoryMetadata metadata, ArtifactRepository repository, File file);

    void touch(RepositoryMetadata metadata, ArtifactRepository repository, File file);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/UpdateCheckManager.java`
#### Snippet
```java
public interface UpdateCheckManager {

    boolean isUpdateRequired(Artifact artifact, ArtifactRepository repository);

    void touch(Artifact artifact, ArtifactRepository repository, String error);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/UpdateCheckManager.java`
#### Snippet
```java
    void touch(Artifact artifact, ArtifactRepository repository, String error);

    String getError(Artifact artifact, ArtifactRepository repository);

    boolean isUpdateRequired(RepositoryMetadata metadata, ArtifactRepository repository, File file);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/UpdateCheckManager.java`
#### Snippet
```java
    boolean isUpdateRequired(RepositoryMetadata metadata, ArtifactRepository repository, File file);

    void touch(RepositoryMetadata metadata, ArtifactRepository repository, File file);
}

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/UpdateCheckManager.java`
#### Snippet
```java
    boolean isUpdateRequired(Artifact artifact, ArtifactRepository repository);

    void touch(Artifact artifact, ArtifactRepository repository, String error);

    String getError(Artifact artifact, ArtifactRepository repository);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
    public void resolve(
            RepositoryMetadata metadata,
            List<ArtifactRepository> remoteRepositories,
            ArtifactRepository localRepository)
            throws RepositoryMetadataResolutionException {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
            RepositoryMetadata metadata,
            List<ArtifactRepository> remoteRepositories,
            ArtifactRepository localRepository)
            throws RepositoryMetadataResolutionException {
        RepositoryRequest request = new DefaultRepositoryRequest();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
    private boolean loadMetadata(
            RepositoryMetadata repoMetadata,
            ArtifactRepository remoteRepository,
            ArtifactRepository localRepository,
            Map<ArtifactRepository, Metadata> previousMetadata) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
            RepositoryMetadata repoMetadata,
            ArtifactRepository remoteRepository,
            ArtifactRepository localRepository,
            Map<ArtifactRepository, Metadata> previousMetadata) {
        boolean setRepository = false;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
            ArtifactRepository remoteRepository,
            ArtifactRepository localRepository,
            Map<ArtifactRepository, Metadata> previousMetadata) {
        boolean setRepository = false;

```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java

    public void deploy(
            ArtifactMetadata metadata, ArtifactRepository localRepository, ArtifactRepository deploymentRepository)
            throws RepositoryMetadataDeploymentException {
        File file;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java

    public void deploy(
            ArtifactMetadata metadata, ArtifactRepository localRepository, ArtifactRepository deploymentRepository)
            throws RepositoryMetadataDeploymentException {
        File file;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java

    public void deploy(
            ArtifactMetadata metadata, ArtifactRepository localRepository, ArtifactRepository deploymentRepository)
            throws RepositoryMetadataDeploymentException {
        File file;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
    public void resolve(RepositoryMetadata metadata, RepositoryRequest request)
            throws RepositoryMetadataResolutionException {
        ArtifactRepository localRepo = request.getLocalRepository();
        List<ArtifactRepository> remoteRepositories = request.getRemoteRepositories();

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
            throws RepositoryMetadataResolutionException {
        ArtifactRepository localRepo = request.getLocalRepository();
        List<ArtifactRepository> remoteRepositories = request.getRemoteRepositories();

        if (!request.isOffline()) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
            }

            for (ArtifactRepository repository : remoteRepositories) {
                ArtifactRepositoryPolicy policy = metadata.getPolicy(repository);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java

            for (ArtifactRepository repository : remoteRepositories) {
                ArtifactRepositoryPolicy policy = metadata.getPolicy(repository);

                File file =
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
    private void mergeMetadata(
            RepositoryMetadata metadata,
            List<ArtifactRepository> remoteRepositories,
            ArtifactRepository localRepository)
            throws RepositoryMetadataStoreException {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
            RepositoryMetadata metadata,
            List<ArtifactRepository> remoteRepositories,
            ArtifactRepository localRepository)
            throws RepositoryMetadataStoreException {
        // TODO currently this is first wins, but really we should take the latest by comparing either the
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
        //  - we'd be much better having a pristine input, and an ongoing metadata for merging instead

        Map<ArtifactRepository, Metadata> previousMetadata = new HashMap<>();
        ArtifactRepository selected = null;
        for (ArtifactRepository repository : remoteRepositories) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java

        Map<ArtifactRepository, Metadata> previousMetadata = new HashMap<>();
        ArtifactRepository selected = null;
        for (ArtifactRepository repository : remoteRepositories) {
            ArtifactRepositoryPolicy policy = metadata.getPolicy(repository);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
        Map<ArtifactRepository, Metadata> previousMetadata = new HashMap<>();
        ArtifactRepository selected = null;
        for (ArtifactRepository repository : remoteRepositories) {
            ArtifactRepositoryPolicy policy = metadata.getPolicy(repository);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
        ArtifactRepository selected = null;
        for (ArtifactRepository repository : remoteRepositories) {
            ArtifactRepositoryPolicy policy = metadata.getPolicy(repository);

            if (policy.isEnabled() && loadMetadata(metadata, repository, localRepository, previousMetadata)) {
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
    }

    public void install(ArtifactMetadata metadata, ArtifactRepository localRepository)
            throws RepositoryMetadataInstallationException {
        try {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
    }

    public void install(ArtifactMetadata metadata, ArtifactRepository localRepository)
            throws RepositoryMetadataInstallationException {
        try {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
    }

    private Date getLocalCopyLastModified(ArtifactRepository localRepository, RepositoryMetadata metadata) {
        String metadataPath = localRepository.pathOfLocalRepositoryMetadata(metadata, localRepository);
        File metadataFile = new File(localRepository.getBasedir(), metadataPath);
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java

    private File getArtifactMetadataFromDeploymentRepository(
            ArtifactMetadata metadata, ArtifactRepository localRepo, ArtifactRepository remoteRepository)
            throws TransferFailedException {
        File file =
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java

    private File getArtifactMetadataFromDeploymentRepository(
            ArtifactMetadata metadata, ArtifactRepository localRepo, ArtifactRepository remoteRepository)
            throws TransferFailedException {
        File file =
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java

    private File getArtifactMetadataFromDeploymentRepository(
            ArtifactMetadata metadata, ArtifactRepository localRepo, ArtifactRepository remoteRepository)
            throws TransferFailedException {
        File file =
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
        try {
            wagonManager.getArtifactMetadataFromDeploymentRepository(
                    metadata, remoteRepository, file, ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN);
        } catch (ResourceDoesNotExistException e) {
            getLogger()
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java

    public void resolveAlways(
            RepositoryMetadata metadata, ArtifactRepository localRepository, ArtifactRepository remoteRepository)
            throws RepositoryMetadataResolutionException {
        File file;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java

    public void resolveAlways(
            RepositoryMetadata metadata, ArtifactRepository localRepository, ArtifactRepository remoteRepository)
            throws RepositoryMetadataResolutionException {
        File file;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
    private void updateSnapshotMetadata(
            RepositoryMetadata metadata,
            Map<ArtifactRepository, Metadata> previousMetadata,
            ArtifactRepository selected,
            ArtifactRepository localRepository)
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
            RepositoryMetadata metadata,
            Map<ArtifactRepository, Metadata> previousMetadata,
            ArtifactRepository selected,
            ArtifactRepository localRepository)
            throws RepositoryMetadataStoreException {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
            Map<ArtifactRepository, Metadata> previousMetadata,
            ArtifactRepository selected,
            ArtifactRepository localRepository)
            throws RepositoryMetadataStoreException {
        // TODO this could be a lot nicer... should really be in the snapshot transformation?
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionRequest.java`
#### Snippet
```java
    }

    public MetadataResolutionRequest setLocalRepository(ArtifactRepository localRepository) {
        this.localRepository = localRepository;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
            Metadata prevMetadata = metadata.getMetadata();

            for (ArtifactRepository repository : previousMetadata.keySet()) {
                Metadata m = previousMetadata.get(repository);
                if (repository.equals(selected)) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionRequest.java`
#### Snippet
```java
    }

    public ArtifactRepository getLocalRepository() {
        return localRepository;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionRequest.java`
#### Snippet
```java
    private ArtifactRepository localRepository;

    private List<ArtifactRepository> remoteRepositories;

    // This is like a filter but overrides all transitive versions
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionRequest.java`
#### Snippet
```java
    private Set<Artifact> artifactDependencies;

    private ArtifactRepository localRepository;

    private List<ArtifactRepository> remoteRepositories;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionRequest.java`
#### Snippet
```java
    }

    public List<ArtifactRepository> getRemoteRepositories() {
        return getRemoteRepostories();
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionRequest.java`
#### Snippet
```java

    public MetadataResolutionRequest(
            MavenArtifactMetadata md, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories) {
        this.mad = md;
        this.localRepository = localRepository;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionRequest.java`
#### Snippet
```java

    public MetadataResolutionRequest(
            MavenArtifactMetadata md, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories) {
        this.mad = md;
        this.localRepository = localRepository;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionRequest.java`
#### Snippet
```java
    }

    public MetadataResolutionRequest setRemoteRepositories(List<ArtifactRepository> remoteRepositories) {
        return setRemoteRepostories(remoteRepositories);
    }
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/WagonManager.java`
#### Snippet
```java
            throws TransferFailedException;

    void putArtifactMetadata(File source, ArtifactMetadata artifactMetadata, ArtifactRepository repository)
            throws TransferFailedException;
}
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/WagonManager.java`
#### Snippet
```java
            throws TransferFailedException;

    void putArtifactMetadata(File source, ArtifactMetadata artifactMetadata, ArtifactRepository repository)
            throws TransferFailedException;
}
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/WagonManager.java`
#### Snippet
```java
    // Retriever
    //
    void getArtifact(Artifact artifact, ArtifactRepository repository, TransferListener transferListener, boolean force)
            throws TransferFailedException, ResourceDoesNotExistException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/WagonManager.java`
#### Snippet
```java
            throws TransferFailedException;

    void putRemoteFile(ArtifactRepository repository, File source, String remotePath, TransferListener downloadMonitor)
            throws TransferFailedException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/WagonManager.java`
#### Snippet
```java

    void getRemoteFile(
            ArtifactRepository repository,
            File destination,
            String remotePath,
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/WagonManager.java`
#### Snippet
```java

    void getArtifactMetadata(
            ArtifactMetadata metadata, ArtifactRepository remoteRepository, File destination, String checksumPolicy)
            throws TransferFailedException, ResourceDoesNotExistException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/WagonManager.java`
#### Snippet
```java

    void getArtifactMetadata(
            ArtifactMetadata metadata, ArtifactRepository remoteRepository, File destination, String checksumPolicy)
            throws TransferFailedException, ResourceDoesNotExistException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/WagonManager.java`
#### Snippet
```java
    void getArtifact(
            Artifact artifact,
            List<ArtifactRepository> remoteRepositories,
            TransferListener transferListener,
            boolean force)
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/WagonManager.java`
#### Snippet
```java

    void getArtifactMetadataFromDeploymentRepository(
            ArtifactMetadata metadata, ArtifactRepository remoteRepository, File file, String checksumPolicyWarn)
            throws TransferFailedException, ResourceDoesNotExistException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/WagonManager.java`
#### Snippet
```java

    void getArtifactMetadataFromDeploymentRepository(
            ArtifactMetadata metadata, ArtifactRepository remoteRepository, File file, String checksumPolicyWarn)
            throws TransferFailedException, ResourceDoesNotExistException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/WagonManager.java`
#### Snippet
```java
    //
    void putArtifact(
            File source, Artifact artifact, ArtifactRepository deploymentRepository, TransferListener downloadMonitor)
            throws TransferFailedException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/DefaultMirrorSelector.java`
#### Snippet
```java
     * @return true if external.
     */
    static boolean isExternalRepo(ArtifactRepository originalRepository) {
        try {
            URL url = new URL(originalRepository.getUrl());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/DefaultMirrorSelector.java`
#### Snippet
```java
    private static final String EXTERNAL_HTTP_WILDCARD = "external:http:*";

    public Mirror getMirror(ArtifactRepository repository, List<Mirror> mirrors) {
        String repoId = repository.getId();

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/DefaultMirrorSelector.java`
#### Snippet
```java
     * @return true if external.
     */
    static boolean isExternalHttpRepo(ArtifactRepository originalRepository) {
        try {
            URL url = new URL(originalRepository.getUrl());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/DefaultMirrorSelector.java`
#### Snippet
```java
     * @return true if the repository is a match to this pattern.
     */
    static boolean matchPattern(ArtifactRepository originalRepository, String pattern) {
        boolean result = false;
        String originalId = originalRepository.getId();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/DefaultMirrorSelector.java`
#### Snippet
```java
    }

    static boolean matchesLayout(ArtifactRepository repository, Mirror mirror) {
        return matchesLayout(RepositoryUtils.getLayout(repository), mirror.getMirrorOfLayouts());
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionResult.java`
#### Snippet
```java
    // file system errors

    private List<ArtifactRepository> repositories;

    private Set<Artifact> requestedArtifacts;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionResult.java`
#### Snippet
```java
    // ------------------------------------------------------------------------

    public List<ArtifactRepository> getRepositories() {
        if (repositories == null) {
            return Collections.emptyList();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionResult.java`
#### Snippet
```java
    }

    public MetadataResolutionResult setRepositories(final List<ArtifactRepository> repositories) {
        this.repositories = repositories;

```

### Deprecation
Overrides deprecated method in 'org.apache.maven.artifact.repository.ArtifactRepository'
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepository.java`
#### Snippet
```java
    }

    public boolean isBlacklisted() {
        return blacklisted;
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.maven.artifact.repository.ArtifactRepository'
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepository.java`
#### Snippet
```java
    }

    public boolean isUniqueVersion() {
        return true;
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.maven.artifact.repository.ArtifactRepository'
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepository.java`
#### Snippet
```java
    }

    public void setBlacklisted(boolean blacklisted) {
        this.blacklisted = blacklisted;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/ArtifactTransformation.java`
#### Snippet
```java
     */
    void transformForResolve(
            Artifact artifact, List<ArtifactRepository> remoteRepositories, ArtifactRepository localRepository)
            throws ArtifactResolutionException, ArtifactNotFoundException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/ArtifactTransformation.java`
#### Snippet
```java
     */
    void transformForResolve(
            Artifact artifact, List<ArtifactRepository> remoteRepositories, ArtifactRepository localRepository)
            throws ArtifactResolutionException, ArtifactNotFoundException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/ArtifactTransformation.java`
#### Snippet
```java
     */
    void transformForDeployment(
            Artifact artifact, ArtifactRepository remoteRepository, ArtifactRepository localRepository)
            throws ArtifactDeploymentException;
}
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/ArtifactTransformation.java`
#### Snippet
```java
     */
    void transformForDeployment(
            Artifact artifact, ArtifactRepository remoteRepository, ArtifactRepository localRepository)
            throws ArtifactDeploymentException;
}
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/ArtifactTransformation.java`
#### Snippet
```java
     * @param localRepository the local repository it will be stored in
     */
    void transformForInstall(Artifact artifact, ArtifactRepository localRepository)
            throws ArtifactInstallationException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/LatestArtifactTransformation.java`
#### Snippet
```java

    public void transformForDeployment(
            Artifact artifact, ArtifactRepository remoteRepository, ArtifactRepository localRepository) {
        // metadata is added via addPluginArtifactMetadata
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/LatestArtifactTransformation.java`
#### Snippet
```java

    public void transformForDeployment(
            Artifact artifact, ArtifactRepository remoteRepository, ArtifactRepository localRepository) {
        // metadata is added via addPluginArtifactMetadata
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/LatestArtifactTransformation.java`
#### Snippet
```java
    }

    public void transformForInstall(Artifact artifact, ArtifactRepository localRepository) {
        // metadata is added via addPluginArtifactMetadata
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/ArtifactTransformationManager.java`
#### Snippet
```java
     * @param localRepository the local repository it will be stored in
     */
    void transformForInstall(Artifact artifact, ArtifactRepository localRepository)
            throws ArtifactInstallationException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/ArtifactTransformationManager.java`
#### Snippet
```java
     */
    void transformForDeployment(
            Artifact artifact, ArtifactRepository remoteRepository, ArtifactRepository localRepository)
            throws ArtifactDeploymentException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/ArtifactTransformationManager.java`
#### Snippet
```java
     */
    void transformForDeployment(
            Artifact artifact, ArtifactRepository remoteRepository, ArtifactRepository localRepository)
            throws ArtifactDeploymentException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/ArtifactTransformationManager.java`
#### Snippet
```java
     */
    void transformForResolve(
            Artifact artifact, List<ArtifactRepository> remoteRepositories, ArtifactRepository localRepository)
            throws ArtifactResolutionException, ArtifactNotFoundException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/ArtifactTransformationManager.java`
#### Snippet
```java
     */
    void transformForResolve(
            Artifact artifact, List<ArtifactRepository> remoteRepositories, ArtifactRepository localRepository)
            throws ArtifactResolutionException, ArtifactNotFoundException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/ReleaseArtifactTransformation.java`
#### Snippet
```java

    public void transformForDeployment(
            Artifact artifact, ArtifactRepository remoteRepository, ArtifactRepository localRepository) {
        ArtifactMetadata metadata = createMetadata(artifact);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/ReleaseArtifactTransformation.java`
#### Snippet
```java

    public void transformForDeployment(
            Artifact artifact, ArtifactRepository remoteRepository, ArtifactRepository localRepository) {
        ArtifactMetadata metadata = createMetadata(artifact);

```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/ReleaseArtifactTransformation.java`
#### Snippet
```java
    public void transformForDeployment(
            Artifact artifact, ArtifactRepository remoteRepository, ArtifactRepository localRepository) {
        ArtifactMetadata metadata = createMetadata(artifact);

        artifact.addMetadata(metadata);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/DefaultArtifactTransformationManager.java`
#### Snippet
```java
    }

    public void transformForInstall(Artifact artifact, ArtifactRepository localRepository)
            throws ArtifactInstallationException {
        for (ArtifactTransformation transform : artifactTransformations) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/DefaultArtifactTransformationManager.java`
#### Snippet
```java

    public void transformForResolve(
            Artifact artifact, List<ArtifactRepository> remoteRepositories, ArtifactRepository localRepository)
            throws ArtifactResolutionException, ArtifactNotFoundException {
        for (ArtifactTransformation transform : artifactTransformations) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/DefaultArtifactTransformationManager.java`
#### Snippet
```java

    public void transformForResolve(
            Artifact artifact, List<ArtifactRepository> remoteRepositories, ArtifactRepository localRepository)
            throws ArtifactResolutionException, ArtifactNotFoundException {
        for (ArtifactTransformation transform : artifactTransformations) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/DefaultArtifactTransformationManager.java`
#### Snippet
```java

    public void transformForDeployment(
            Artifact artifact, ArtifactRepository remoteRepository, ArtifactRepository localRepository)
            throws ArtifactDeploymentException {
        for (ArtifactTransformation transform : artifactTransformations) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/DefaultArtifactTransformationManager.java`
#### Snippet
```java

    public void transformForDeployment(
            Artifact artifact, ArtifactRepository remoteRepository, ArtifactRepository localRepository)
            throws ArtifactDeploymentException {
        for (ArtifactTransformation transform : artifactTransformations) {
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/ReleaseArtifactTransformation.java`
#### Snippet
```java
    }

    private ArtifactMetadata createMetadata(Artifact artifact) {
        Versioning versioning = new Versioning();
        // TODO Should this be changed for MNG-6754 too?
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/ReleaseArtifactTransformation.java`
#### Snippet
```java
    }

    public void transformForInstall(Artifact artifact, ArtifactRepository localRepository) {
        ArtifactMetadata metadata = createMetadata(artifact);

```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/ReleaseArtifactTransformation.java`
#### Snippet
```java

    public void transformForInstall(Artifact artifact, ArtifactRepository localRepository) {
        ArtifactMetadata metadata = createMetadata(artifact);

        artifact.addMetadata(metadata);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/AbstractVersionTransformation.java`
#### Snippet
```java

    public void transformForResolve(
            Artifact artifact, List<ArtifactRepository> remoteRepositories, ArtifactRepository localRepository)
            throws ArtifactResolutionException, ArtifactNotFoundException {
        RepositoryRequest request = new DefaultRepositoryRequest();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/AbstractVersionTransformation.java`
#### Snippet
```java

    public void transformForResolve(
            Artifact artifact, List<ArtifactRepository> remoteRepositories, ArtifactRepository localRepository)
            throws ArtifactResolutionException, ArtifactNotFoundException {
        RepositoryRequest request = new DefaultRepositoryRequest();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/AbstractVersionTransformation.java`
#### Snippet
```java

    protected String resolveVersion(
            Artifact artifact, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories)
            throws RepositoryMetadataResolutionException {
        RepositoryRequest request = new DefaultRepositoryRequest();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/AbstractVersionTransformation.java`
#### Snippet
```java

    protected String resolveVersion(
            Artifact artifact, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories)
            throws RepositoryMetadataResolutionException {
        RepositoryRequest request = new DefaultRepositoryRequest();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/SnapshotTransformation.java`
#### Snippet
```java

    public void transformForDeployment(
            Artifact artifact, ArtifactRepository remoteRepository, ArtifactRepository localRepository)
            throws ArtifactDeploymentException {
        if (artifact.isSnapshot()) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/SnapshotTransformation.java`
#### Snippet
```java

    public void transformForDeployment(
            Artifact artifact, ArtifactRepository remoteRepository, ArtifactRepository localRepository)
            throws ArtifactDeploymentException {
        if (artifact.isSnapshot()) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/SnapshotTransformation.java`
#### Snippet
```java

    private int resolveLatestSnapshotBuildNumber(
            Artifact artifact, ArtifactRepository localRepository, ArtifactRepository remoteRepository)
            throws RepositoryMetadataResolutionException {
        RepositoryMetadata metadata = new SnapshotArtifactRepositoryMetadata(artifact);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/SnapshotTransformation.java`
#### Snippet
```java

    private int resolveLatestSnapshotBuildNumber(
            Artifact artifact, ArtifactRepository localRepository, ArtifactRepository remoteRepository)
            throws RepositoryMetadataResolutionException {
        RepositoryMetadata metadata = new SnapshotArtifactRepositoryMetadata(artifact);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/transform/SnapshotTransformation.java`
#### Snippet
```java
    }

    public void transformForInstall(Artifact artifact, ArtifactRepository localRepository) {
        if (artifact.isSnapshot()) {
            Snapshot snapshot = new Snapshot();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java
    }

    public void touch(Artifact artifact, ArtifactRepository repository, String error) {
        File file = artifact.getFile();

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java
    }

    private Date readLastUpdated(RepositoryMetadata metadata, ArtifactRepository repository, File file) {
        File touchfile = getTouchfile(metadata, file);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java
    }

    String getRepositoryKey(ArtifactRepository repository) {
        StringBuilder buffer = new StringBuilder(256);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java
    }

    public boolean isUpdateRequired(RepositoryMetadata metadata, ArtifactRepository repository, File file) {
        // Here, we need to determine which policy to use. Release updateInterval will be used when
        // the metadata refers to a release artifact or meta-version, and snapshot updateInterval will be used when
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java
        // meta-versions like RELEASE and LATEST to resolve, and also to allow retrieval of the range of valid, released
        // artifacts available.
        ArtifactRepositoryPolicy policy = metadata.getPolicy(repository);

        if (!policy.isEnabled()) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java
    }

    String getMetadataKey(ArtifactRepository repository, File file) {
        return repository.getId() + '.' + file.getName() + LAST_UPDATE_TAG;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java
    }

    public void touch(RepositoryMetadata metadata, ArtifactRepository repository, File file) {
        File touchfile = getTouchfile(metadata, file);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java
    private static final String TOUCHFILE_NAME = "resolver-status.properties";

    public boolean isUpdateRequired(Artifact artifact, ArtifactRepository repository) {
        File file = artifact.getFile();

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java
        File file = artifact.getFile();

        ArtifactRepositoryPolicy policy = artifact.isSnapshot() ? repository.getSnapshots() : repository.getReleases();

        if (!policy.isEnabled()) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java
    }

    public String getError(Artifact artifact, ArtifactRepository repository) {
        File touchFile = getTouchfile(artifact);
        return getError(touchFile, getRepositoryKey(repository));
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
    }

    public ArtifactRepository createDeploymentArtifactRepository(
            String id, String url, ArtifactRepositoryLayout repositoryLayout, boolean uniqueVersion) {
        return createArtifactRepository(id, url, repositoryLayout, null, null);
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java

    public ArtifactRepository createDeploymentArtifactRepository(
            String id, String url, ArtifactRepositoryLayout repositoryLayout, boolean uniqueVersion) {
        return createArtifactRepository(id, url, repositoryLayout, null, null);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
    }

    private void checkLayout(String repositoryId, String layoutId, ArtifactRepositoryLayout layout)
            throws UnknownRepositoryLayoutException {
        if (layout == null) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
    }

    public ArtifactRepository createArtifactRepository(
            String id,
            String url,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
            String url,
            String layoutId,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases)
            throws UnknownRepositoryLayoutException {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
            String layoutId,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases)
            throws UnknownRepositoryLayoutException {
        ArtifactRepositoryLayout layout = repositoryLayouts.get(layoutId);
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
            ArtifactRepositoryPolicy releases)
            throws UnknownRepositoryLayoutException {
        ArtifactRepositoryLayout layout = repositoryLayouts.get(layoutId);

        checkLayout(id, layoutId, layout);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
    }

    public ArtifactRepository createDeploymentArtifactRepository(
            String id, String url, String layoutId, boolean uniqueVersion) throws UnknownRepositoryLayoutException {
        ArtifactRepositoryLayout layout = repositoryLayouts.get(layoutId);
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
    public ArtifactRepository createDeploymentArtifactRepository(
            String id, String url, String layoutId, boolean uniqueVersion) throws UnknownRepositoryLayoutException {
        ArtifactRepositoryLayout layout = repositoryLayouts.get(layoutId);

        checkLayout(id, layoutId, layout);
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
    private Map<String, ArtifactRepositoryLayout> repositoryLayouts;

    public ArtifactRepositoryLayout getLayout(String layoutId) throws UnknownRepositoryLayoutException {
        return repositoryLayouts.get(layoutId);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
    }

    public ArtifactRepository createArtifactRepository(
            String id,
            String url,
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
            String id,
            String url,
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
            String url,
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases) {
        if (snapshots == null) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases) {
        if (snapshots == null) {
            snapshots = new ArtifactRepositoryPolicy();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
            ArtifactRepositoryPolicy releases) {
        if (snapshots == null) {
            snapshots = new ArtifactRepositoryPolicy();
        }

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java

        if (releases == null) {
            releases = new ArtifactRepositoryPolicy();
        }

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
        }

        ArtifactRepository repository;
        if (repositoryLayout instanceof ArtifactRepositoryLayout2) {
            repository = ((ArtifactRepositoryLayout2) repositoryLayout)
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java
    private String globalChecksumPolicy;

    @Requirement(role = ArtifactRepositoryLayout.class)
    private Map<String, ArtifactRepositoryLayout> repositoryLayouts;

```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java

    @Requirement(role = ArtifactRepositoryLayout.class)
    private Map<String, ArtifactRepositoryLayout> repositoryLayouts;

    public ArtifactRepositoryLayout getLayout(String layoutId) throws UnknownRepositoryLayoutException {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionRequest.java`
#### Snippet
```java
    }

    public List<ArtifactRepository> getRemoteRepositories() {
        return remoteRepositories;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionRequest.java`
#### Snippet
```java
    // --------------------------------------------------------------------
    public MetadataResolutionRequest(
            ArtifactMetadata query, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories) {
        this.query = query;
        this.localRepository = localRepository;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionRequest.java`
#### Snippet
```java
    // --------------------------------------------------------------------
    public MetadataResolutionRequest(
            ArtifactMetadata query, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories) {
        this.query = query;
        this.localRepository = localRepository;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionRequest.java`
#### Snippet
```java
    }

    public void setLocalRepository(ArtifactRepository localRepository) {
        this.localRepository = localRepository;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionRequest.java`
#### Snippet
```java
    protected ArtifactMetadata query;
    protected ArtifactRepository localRepository;
    protected List<ArtifactRepository> remoteRepositories;

    // --------------------------------------------------------------------
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionRequest.java`
#### Snippet
```java
    }

    public void setRemoteRepositories(List<ArtifactRepository> remoteRepositories) {
        this.remoteRepositories = remoteRepositories;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionRequest.java`
#### Snippet
```java
public class MetadataResolutionRequest {
    protected ArtifactMetadata query;
    protected ArtifactRepository localRepository;
    protected List<ArtifactRepository> remoteRepositories;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionRequest.java`
#### Snippet
```java
    }

    public ArtifactRepository getLocalRepository() {
        return localRepository;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolution.java`
#### Snippet
```java
    }

    public void setMetadataRepositories(Collection<ArtifactRepository> metadataRepositories) {
        this.metadataRepositories = metadataRepositories;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolution.java`
#### Snippet
```java

    /** repositories, added by this POM  */
    private Collection<ArtifactRepository> metadataRepositories;
    // -------------------------------------------------------------------
    public MetadataResolution(ArtifactMetadata artifactMetadata) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolution.java`
#### Snippet
```java
    }
    // -------------------------------------------------------------------
    public Collection<ArtifactRepository> getMetadataRepositories() {
        return metadataRepositories;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolution.java`
#### Snippet
```java
    }
    // -------------------------------------------------------------------
    public MetadataResolution(ArtifactMetadata artifactMetadata, Collection<ArtifactRepository> metadataRepositories) {
        this(artifactMetadata);
        this.metadataRepositories = metadataRepositories;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataSource.java`
#### Snippet
```java

    MetadataResolution retrieve(
            ArtifactMetadata artifact, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories)
            throws MetadataRetrievalException;
}
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataSource.java`
#### Snippet
```java

    MetadataResolution retrieve(
            ArtifactMetadata artifact, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories)
            throws MetadataRetrievalException;
}
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
    private void handleChecksumFailure(String checksumPolicy, String message, Throwable cause)
            throws ChecksumFailedException {
        if (ArtifactRepositoryPolicy.CHECKSUM_POLICY_FAIL.equals(checksumPolicy)) {
            throw new ChecksumFailedException(message, cause);
        } else if (!ArtifactRepositoryPolicy.CHECKSUM_POLICY_IGNORE.equals(checksumPolicy)) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
        if (ArtifactRepositoryPolicy.CHECKSUM_POLICY_FAIL.equals(checksumPolicy)) {
            throw new ChecksumFailedException(message, cause);
        } else if (!ArtifactRepositoryPolicy.CHECKSUM_POLICY_IGNORE.equals(checksumPolicy)) {
            // warn if it is set to anything other than ignore
            logger.warn("*** CHECKSUM FAILED - " + message + " - IGNORING");
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
    @Override
    public void getArtifact(
            Artifact artifact, ArtifactRepository repository, TransferListener downloadMonitor, boolean force)
            throws TransferFailedException, ResourceDoesNotExistException {
        String remotePath = repository.pathOf(artifact);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
        String remotePath = repository.pathOf(artifact);

        ArtifactRepositoryPolicy policy = artifact.isSnapshot() ? repository.getSnapshots() : repository.getReleases();

        if (!policy.isEnabled()) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
    @Override
    public void putRemoteFile(
            ArtifactRepository repository, File source, String remotePath, TransferListener downloadMonitor)
            throws TransferFailedException {
        String protocol = repository.getProtocol();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
    }

    private AuthenticationInfo authenticationInfo(ArtifactRepository repository) {
        AuthenticationInfo ai = new AuthenticationInfo();
        ai.setUserName(repository.getAuthentication().getUsername());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
    @Override
    public void putArtifact(
            File source, Artifact artifact, ArtifactRepository deploymentRepository, TransferListener downloadMonitor)
            throws TransferFailedException {
        putRemoteFile(deploymentRepository, source, deploymentRepository.pathOf(artifact), downloadMonitor);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
     * @throws AuthenticationException
     */
    private void connectWagon(Wagon wagon, ArtifactRepository repository)
            throws ConnectionException, AuthenticationException {
        // MNG-5509
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
    @Override
    public void getArtifactMetadataFromDeploymentRepository(
            ArtifactMetadata metadata, ArtifactRepository repository, File destination, String checksumPolicy)
            throws TransferFailedException, ResourceDoesNotExistException {
        String remotePath = repository.pathOfRemoteRepositoryMetadata(metadata);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
    @Override
    public void getArtifactMetadataFromDeploymentRepository(
            ArtifactMetadata metadata, ArtifactRepository repository, File destination, String checksumPolicy)
            throws TransferFailedException, ResourceDoesNotExistException {
        String remotePath = repository.pathOfRemoteRepositoryMetadata(metadata);
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java

    @Override
    public void putArtifactMetadata(File source, ArtifactMetadata artifactMetadata, ArtifactRepository repository)
            throws TransferFailedException {
        logger.info("Uploading " + artifactMetadata);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java

    @Override
    public void putArtifactMetadata(File source, ArtifactMetadata artifactMetadata, ArtifactRepository repository)
            throws TransferFailedException {
        logger.info("Uploading " + artifactMetadata);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
    }

    private ProxyInfo proxyInfo(ArtifactRepository repository) {
        ProxyInfo proxyInfo = new ProxyInfo();
        proxyInfo.setHost(repository.getProxy().getHost());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
    @Override
    public void getRemoteFile(
            ArtifactRepository repository,
            File destination,
            String remotePath,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
    public void getArtifact(
            Artifact artifact,
            List<ArtifactRepository> remoteRepositories,
            TransferListener downloadMonitor,
            boolean force)
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
        TransferFailedException tfe = null;

        for (ArtifactRepository repository : remoteRepositories) {
            try {
                getArtifact(artifact, repository, downloadMonitor, force);
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
    @Override
    public void getArtifactMetadata(
            ArtifactMetadata metadata, ArtifactRepository repository, File destination, String checksumPolicy)
            throws TransferFailedException, ResourceDoesNotExistException {
        String remotePath = repository.pathOfRemoteRepositoryMetadata(metadata);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
    @Override
    public void getArtifactMetadata(
            ArtifactMetadata metadata, ArtifactRepository repository, File destination, String checksumPolicy)
            throws TransferFailedException, ResourceDoesNotExistException {
        String remotePath = repository.pathOfRemoteRepositoryMetadata(metadata);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java
            String id, String url, ArtifactRepositoryLayout layout, boolean uniqueVersion);

    ArtifactRepository createArtifactRepository(
            String id,
            String url,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java
            String url,
            String layoutId,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases)
            throws UnknownRepositoryLayoutException;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java
            String layoutId,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases)
            throws UnknownRepositoryLayoutException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java
            throws UnknownRepositoryLayoutException;

    ArtifactRepository createDeploymentArtifactRepository(
            String id, String url, ArtifactRepositoryLayout layout, boolean uniqueVersion);

```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java

    ArtifactRepository createDeploymentArtifactRepository(
            String id, String url, ArtifactRepositoryLayout layout, boolean uniqueVersion);

    ArtifactRepository createArtifactRepository(
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java
            throws UnknownRepositoryLayoutException;

    ArtifactRepository createArtifactRepository(
            String id,
            String url,
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java
            String id,
            String url,
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java
            String url,
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases);

    void setGlobalUpdatePolicy(String snapshotPolicy);
```

### Deprecation
'org.apache.maven.repository.DelegatingLocalArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
                    plexus.lookup(LocalArtifactRepository.class, LocalArtifactRepository.IDE_WORKSPACE);

            if (request.getLocalRepository() instanceof DelegatingLocalArtifactRepository) {
                DelegatingLocalArtifactRepository delegatingLocalRepository =
                        (DelegatingLocalArtifactRepository) request.getLocalRepository();
```

### Deprecation
'org.apache.maven.repository.DelegatingLocalArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java

            if (request.getLocalRepository() instanceof DelegatingLocalArtifactRepository) {
                DelegatingLocalArtifactRepository delegatingLocalRepository =
                        (DelegatingLocalArtifactRepository) request.getLocalRepository();

```

### Deprecation
'org.apache.maven.repository.DelegatingLocalArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            if (request.getLocalRepository() instanceof DelegatingLocalArtifactRepository) {
                DelegatingLocalArtifactRepository delegatingLocalRepository =
                        (DelegatingLocalArtifactRepository) request.getLocalRepository();

                LocalArtifactRepository orig = delegatingLocalRepository.getIdeWorkspace();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
                }
            } else {
                ArtifactRepository localRepository = request.getLocalRepository();
                DelegatingLocalArtifactRepository delegatingLocalRepository =
                        new DelegatingLocalArtifactRepository(localRepository);
```

### Deprecation
'org.apache.maven.repository.DelegatingLocalArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            } else {
                ArtifactRepository localRepository = request.getLocalRepository();
                DelegatingLocalArtifactRepository delegatingLocalRepository =
                        new DelegatingLocalArtifactRepository(localRepository);
                delegatingLocalRepository.setIdeWorkspace(ideWorkspace);
```

### Deprecation
'org.apache.maven.repository.DelegatingLocalArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
                ArtifactRepository localRepository = request.getLocalRepository();
                DelegatingLocalArtifactRepository delegatingLocalRepository =
                        new DelegatingLocalArtifactRepository(localRepository);
                delegatingLocalRepository.setIdeWorkspace(ideWorkspace);
                request.setLocalRepository(delegatingLocalRepository);
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        }

        public String pathOfRemoteRepositoryMetadata(ArtifactMetadata metadata) {
            return fallback.pathOfRemoteRepositoryMetadata(metadata);
        }
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    private ArtifactRepositoryFactory artifactRepositoryFactory;

    @Requirement(role = ArtifactRepositoryLayout.class)
    private Map<String, ArtifactRepositoryLayout> layouts;

```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java

    @Requirement(role = ArtifactRepositoryLayout.class)
    private Map<String, ArtifactRepositoryLayout> layouts;

    @Requirement
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    private Proxy getProxy(RepositorySystemSession session, ArtifactRepository repository) {
        if (session != null) {
            ProxySelector selector = session.getProxySelector();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    //    }

    public List<ArtifactRepository> getEffectiveRepositories(List<ArtifactRepository> repositories) {
        if (repositories == null) {
            return null;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    //    }

    public List<ArtifactRepository> getEffectiveRepositories(List<ArtifactRepository> repositories) {
        if (repositories == null) {
            return null;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        }

        Map<String, List<ArtifactRepository>> reposByKey = new LinkedHashMap<>();

        for (ArtifactRepository repository : repositories) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        Map<String, List<ArtifactRepository>> reposByKey = new LinkedHashMap<>();

        for (ArtifactRepository repository : repositories) {
            String key = repository.getId();

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            String key = repository.getId();

            List<ArtifactRepository> aliasedRepos = reposByKey.computeIfAbsent(key, k -> new ArrayList<>());

            aliasedRepos.add(repository);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        }

        List<ArtifactRepository> effectiveRepositories = new ArrayList<>();

        for (List<ArtifactRepository> aliasedRepos : reposByKey.values()) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        List<ArtifactRepository> effectiveRepositories = new ArrayList<>();

        for (List<ArtifactRepository> aliasedRepos : reposByKey.values()) {
            List<ArtifactRepository> mirroredRepos = new ArrayList<>();

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java

        for (List<ArtifactRepository> aliasedRepos : reposByKey.values()) {
            List<ArtifactRepository> mirroredRepos = new ArrayList<>();

            List<ArtifactRepositoryPolicy> releasePolicies = new ArrayList<>(aliasedRepos.size());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            List<ArtifactRepository> mirroredRepos = new ArrayList<>();

            List<ArtifactRepositoryPolicy> releasePolicies = new ArrayList<>(aliasedRepos.size());

            for (ArtifactRepository aliasedRepo : aliasedRepos) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            List<ArtifactRepositoryPolicy> releasePolicies = new ArrayList<>(aliasedRepos.size());

            for (ArtifactRepository aliasedRepo : aliasedRepos) {
                releasePolicies.add(aliasedRepo.getReleases());
                mirroredRepos.addAll(aliasedRepo.getMirroredRepositories());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            }

            ArtifactRepositoryPolicy releasePolicy = getEffectivePolicy(releasePolicies);

            List<ArtifactRepositoryPolicy> snapshotPolicies = new ArrayList<>(aliasedRepos.size());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            ArtifactRepositoryPolicy releasePolicy = getEffectivePolicy(releasePolicies);

            List<ArtifactRepositoryPolicy> snapshotPolicies = new ArrayList<>(aliasedRepos.size());

            for (ArtifactRepository aliasedRepo : aliasedRepos) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            List<ArtifactRepositoryPolicy> snapshotPolicies = new ArrayList<>(aliasedRepos.size());

            for (ArtifactRepository aliasedRepo : aliasedRepos) {
                snapshotPolicies.add(aliasedRepo.getSnapshots());
            }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            }

            ArtifactRepositoryPolicy snapshotPolicy = getEffectivePolicy(snapshotPolicies);

            ArtifactRepository aliasedRepo = aliasedRepos.get(0);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            ArtifactRepositoryPolicy snapshotPolicy = getEffectivePolicy(snapshotPolicies);

            ArtifactRepository aliasedRepo = aliasedRepos.get(0);

            ArtifactRepository effectiveRepository = createArtifactRepository(
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            ArtifactRepository aliasedRepo = aliasedRepos.get(0);

            ArtifactRepository effectiveRepository = createArtifactRepository(
                    aliasedRepo.getId(), aliasedRepo.getUrl(), aliasedRepo.getLayout(), snapshotPolicy, releasePolicy);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    public Mirror getMirror(ArtifactRepository repository, List<Mirror> mirrors) {
        return mirrorSelector.getMirror(repository, mirrors);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java

    private org.apache.maven.settings.Proxy getProxy(
            ArtifactRepository repository, List<org.apache.maven.settings.Proxy> proxies) {
        if (proxies != null && repository.getProtocol() != null) {
            for (org.apache.maven.settings.Proxy proxy : proxies) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    private ArtifactRepository createRepository(
            String url,
            String repositoryId,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            String snapshotUpdates,
            String checksumPolicy) {
        ArtifactRepositoryPolicy snapshotsPolicy =
                new ArtifactRepositoryPolicy(snapshots, snapshotUpdates, checksumPolicy);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            String checksumPolicy) {
        ArtifactRepositoryPolicy snapshotsPolicy =
                new ArtifactRepositoryPolicy(snapshots, snapshotUpdates, checksumPolicy);

        ArtifactRepositoryPolicy releasesPolicy =
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
                new ArtifactRepositoryPolicy(snapshots, snapshotUpdates, checksumPolicy);

        ArtifactRepositoryPolicy releasesPolicy =
                new ArtifactRepositoryPolicy(releases, releaseUpdates, checksumPolicy);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java

        ArtifactRepositoryPolicy releasesPolicy =
                new ArtifactRepositoryPolicy(releases, releaseUpdates, checksumPolicy);

        return createArtifactRepository(repositoryId, url, null, snapshotsPolicy, releasesPolicy);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    public void injectMirror(RepositorySystemSession session, List<ArtifactRepository> repositories) {
        if (repositories != null && session != null) {
            for (ArtifactRepository repository : repositories) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    public void injectMirror(RepositorySystemSession session, List<ArtifactRepository> repositories) {
        if (repositories != null && session != null) {
            for (ArtifactRepository repository : repositories) {
                Mirror mirror = getMirror(session, repository);
                injectMirror(repository, mirror);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java

    public void retrieve(
            ArtifactRepository repository,
            File destination,
            String remotePath,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
                    remotePath,
                    TransferListenerAdapter.newAdapter(transferListener),
                    ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN,
                    true);
        } catch (org.apache.maven.wagon.TransferFailedException e) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java

    public void publish(
            ArtifactRepository repository, File source, String remotePath, ArtifactTransferListener transferListener)
            throws ArtifactTransferFailedException {
        try {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    public ArtifactRepository createArtifactRepository(
            String repositoryId,
            String url,
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            String repositoryId,
            String url,
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            String url,
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases) {
        if (repositoryLayout == null) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases) {
        if (repositoryLayout == null) {
            repositoryLayout = layouts.get("default");
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    public ArtifactRepository createLocalRepository(String url, String repositoryId) throws IOException {
        return createRepository(
                canonicalFileUrl(url),
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
                repositoryId,
                true,
                ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS,
                true,
                ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
                ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS,
                true,
                ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS,
                ArtifactRepositoryPolicy.CHECKSUM_POLICY_IGNORE);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
                true,
                ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS,
                ArtifactRepositoryPolicy.CHECKSUM_POLICY_IGNORE);
    }

```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    private ArtifactRepositoryLayout getLayout(String id) {
        ArtifactRepositoryLayout layout = layouts.get(id);

```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java

    private ArtifactRepositoryLayout getLayout(String id) {
        ArtifactRepositoryLayout layout = layouts.get(id);

        if (layout == null) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    private void injectMirror(ArtifactRepository repository, Mirror mirror) {
        if (mirror != null) {
            ArtifactRepository original = createArtifactRepository(
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    private void injectMirror(ArtifactRepository repository, Mirror mirror) {
        if (mirror != null) {
            ArtifactRepository original = createArtifactRepository(
                    repository.getId(),
                    repository.getUrl(),
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    // Artifact Repository Creation
    //
    public ArtifactRepository buildArtifactRepository(Repository repo) throws InvalidRepositoryException {
        if (repo != null) {
            String id = repo.getId();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            }

            ArtifactRepositoryPolicy snapshots = buildArtifactRepositoryPolicy(repo.getSnapshots());

            ArtifactRepositoryPolicy releases = buildArtifactRepositoryPolicy(repo.getReleases());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            ArtifactRepositoryPolicy snapshots = buildArtifactRepositoryPolicy(repo.getSnapshots());

            ArtifactRepositoryPolicy releases = buildArtifactRepositoryPolicy(repo.getReleases());

            return createArtifactRepository(id, url, getLayout(repo.getLayout()), snapshots, releases);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    public void injectMirror(List<ArtifactRepository> repositories, List<Mirror> mirrors) {
        if (repositories != null && mirrors != null) {
            for (ArtifactRepository repository : repositories) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    public void injectMirror(List<ArtifactRepository> repositories, List<Mirror> mirrors) {
        if (repositories != null && mirrors != null) {
            for (ArtifactRepository repository : repositories) {
                Mirror mirror = getMirror(repository, mirrors);
                injectMirror(repository, mirror);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    public ArtifactRepository createDefaultLocalRepository() throws InvalidRepositoryException {
        return createLocalRepository(RepositorySystem.defaultUserLocalRepository);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    private ArtifactRepositoryPolicy getEffectivePolicy(Collection<ArtifactRepositoryPolicy> policies) {
        ArtifactRepositoryPolicy effectivePolicy = null;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    private ArtifactRepositoryPolicy getEffectivePolicy(Collection<ArtifactRepositoryPolicy> policies) {
        ArtifactRepositoryPolicy effectivePolicy = null;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java

    private ArtifactRepositoryPolicy getEffectivePolicy(Collection<ArtifactRepositoryPolicy> policies) {
        ArtifactRepositoryPolicy effectivePolicy = null;

        for (ArtifactRepositoryPolicy policy : policies) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        ArtifactRepositoryPolicy effectivePolicy = null;

        for (ArtifactRepositoryPolicy policy : policies) {
            if (effectivePolicy == null) {
                effectivePolicy = new ArtifactRepositoryPolicy(policy);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        for (ArtifactRepositoryPolicy policy : policies) {
            if (effectivePolicy == null) {
                effectivePolicy = new ArtifactRepositoryPolicy(policy);
            } else {
                effectivePolicy.merge(policy);
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        }

        public String pathOfLocalRepositoryMetadata(ArtifactMetadata metadata, ArtifactRepository repository) {
            return fallback.pathOfLocalRepositoryMetadata(metadata, repository);
        }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        }

        public String pathOfLocalRepositoryMetadata(ArtifactMetadata metadata, ArtifactRepository repository) {
            return fallback.pathOfLocalRepositoryMetadata(metadata, repository);
        }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    private Mirror getMirror(RepositorySystemSession session, ArtifactRepository repository) {
        if (session != null) {
            org.eclipse.aether.repository.MirrorSelector selector = session.getMirrorSelector();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    public void injectProxy(List<ArtifactRepository> repositories, List<org.apache.maven.settings.Proxy> proxies) {
        if (repositories != null) {
            for (ArtifactRepository repository : repositories) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    public void injectProxy(List<ArtifactRepository> repositories, List<org.apache.maven.settings.Proxy> proxies) {
        if (repositories != null) {
            for (ArtifactRepository repository : repositories) {
                org.apache.maven.settings.Proxy proxy = getProxy(repository, proxies);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    public void injectAuthentication(RepositorySystemSession session, List<ArtifactRepository> repositories) {
        if (repositories != null && session != null) {
            for (ArtifactRepository repository : repositories) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    public void injectAuthentication(RepositorySystemSession session, List<ArtifactRepository> repositories) {
        if (repositories != null && session != null) {
            for (ArtifactRepository repository : repositories) {
                repository.setAuthentication(getAuthentication(session, repository));
            }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    public ArtifactRepository createLocalRepository(File localRepository) throws InvalidRepositoryException {
        return createRepository(
                "file://" + localRepository.toURI().getRawPath(),
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
                RepositorySystem.DEFAULT_LOCAL_REPO_ID,
                true,
                ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS,
                true,
                ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
                ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS,
                true,
                ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS,
                ArtifactRepositoryPolicy.CHECKSUM_POLICY_IGNORE);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
                true,
                ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS,
                ArtifactRepositoryPolicy.CHECKSUM_POLICY_IGNORE);
    }

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    public ArtifactRepositoryPolicy buildArtifactRepositoryPolicy(RepositoryPolicy policy) {
        boolean enabled = true;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        }

        return new ArtifactRepositoryPolicy(enabled, updatePolicy, checksumPolicy);
    }

```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        private final String id;

        private final ArtifactRepositoryLayout fallback;

        UnknownRepositoryLayout(String id, ArtifactRepositoryLayout fallback) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    public void injectAuthentication(List<ArtifactRepository> repositories, List<Server> servers) {
        if (repositories != null) {
            Map<String, Server> serversById = new HashMap<>();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            }

            for (ArtifactRepository repository : repositories) {
                Server server = serversById.get(repository.getId());

```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
     * described.
     */
    static class UnknownRepositoryLayout implements ArtifactRepositoryLayout {

        private final String id;
```

### Deprecation
'org.apache.maven.artifact.factory.ArtifactFactory' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java

    @Requirement
    private ArtifactFactory artifactFactory;

    @Requirement
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    public ArtifactRepository createDefaultRemoteRepository() throws InvalidRepositoryException {
        return createRepository(
                RepositorySystem.DEFAULT_REMOTE_REPO_URL,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
                RepositorySystem.DEFAULT_REMOTE_REPO_ID,
                true,
                ArtifactRepositoryPolicy.UPDATE_POLICY_DAILY,
                false,
                ArtifactRepositoryPolicy.UPDATE_POLICY_DAILY,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
                ArtifactRepositoryPolicy.UPDATE_POLICY_DAILY,
                false,
                ArtifactRepositoryPolicy.UPDATE_POLICY_DAILY,
                ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
                false,
                ArtifactRepositoryPolicy.UPDATE_POLICY_DAILY,
                ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN);
    }

```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        private final ArtifactRepositoryLayout fallback;

        UnknownRepositoryLayout(String id, ArtifactRepositoryLayout fallback) {
            this.id = id;
            this.fallback = fallback;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    private Authentication getAuthentication(RepositorySystemSession session, ArtifactRepository repository) {
        if (session != null) {
            AuthenticationSelector selector = session.getAuthenticationSelector();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    }

    public void injectProxy(RepositorySystemSession session, List<ArtifactRepository> repositories) {
        if (repositories != null && session != null) {
            for (ArtifactRepository repository : repositories) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
    public void injectProxy(RepositorySystemSession session, List<ArtifactRepository> repositories) {
        if (repositories != null && session != null) {
            for (ArtifactRepository repository : repositories) {
                repository.setProxy(getProxy(session, repository));
            }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
            Set<Artifact> artifacts,
            Artifact originatingArtifact,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
            Artifact originatingArtifact,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
            ArtifactFilter filter,
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataSource' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
            ArtifactFilter filter,
            List<ResolutionListener> listeners) {
```

### Deprecation
'org.apache.maven.artifact.versioning.ManagedVersionMap' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java

    private void manageArtifact(
            ResolutionNode node, ManagedVersionMap managedVersions, List<ResolutionListener> listeners) {
        Artifact artifact = managedVersions.get(node.getKey());

```

### Deprecation
'org.apache.maven.artifact.versioning.ManagedVersionMap' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
     * @param managedVersions original managed versions
     */
    private ManagedVersionMap getManagedVersionsMap(
            Artifact originatingArtifact, Map<String, Artifact> managedVersions) {
        ManagedVersionMap versionMap;
```

### Deprecation
'org.apache.maven.artifact.versioning.ManagedVersionMap' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
    private ManagedVersionMap getManagedVersionsMap(
            Artifact originatingArtifact, Map<String, Artifact> managedVersions) {
        ManagedVersionMap versionMap;
        if (managedVersions instanceof ManagedVersionMap) {
            versionMap = (ManagedVersionMap) managedVersions;
```

### Deprecation
'org.apache.maven.artifact.versioning.ManagedVersionMap' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
            Artifact originatingArtifact, Map<String, Artifact> managedVersions) {
        ManagedVersionMap versionMap;
        if (managedVersions instanceof ManagedVersionMap) {
            versionMap = (ManagedVersionMap) managedVersions;
        } else {
```

### Deprecation
'org.apache.maven.artifact.versioning.ManagedVersionMap' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
        ManagedVersionMap versionMap;
        if (managedVersions instanceof ManagedVersionMap) {
            versionMap = (ManagedVersionMap) managedVersions;
        } else {
            versionMap = new ManagedVersionMap(managedVersions);
```

### Deprecation
'org.apache.maven.artifact.versioning.ManagedVersionMap' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
            versionMap = (ManagedVersionMap) managedVersions;
        } else {
            versionMap = new ManagedVersionMap(managedVersions);
        }

```

### Deprecation
'org.apache.maven.artifact.versioning.ManagedVersionMap' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
            // TODO we probably want to warn the user that he is building an artifact with
            // different values than in dependencyManagement
            if (managedVersions instanceof ManagedVersionMap) {
                /* avoid modifying the managedVersions parameter creating a new map */
                versionMap = new ManagedVersionMap(managedVersions);
```

### Deprecation
'org.apache.maven.artifact.versioning.ManagedVersionMap' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
            if (managedVersions instanceof ManagedVersionMap) {
                /* avoid modifying the managedVersions parameter creating a new map */
                versionMap = new ManagedVersionMap(managedVersions);
            }
            versionMap.remove(originatingArtifact.getDependencyConflictId());
```

### Deprecation
'org.apache.maven.artifact.resolver.ResolutionListenerForDepMgmt' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
                    break;
                case ResolutionListener.MANAGE_ARTIFACT_VERSION:
                    if (listener instanceof ResolutionListenerForDepMgmt) {
                        ResolutionListenerForDepMgmt asImpl = (ResolutionListenerForDepMgmt) listener;
                        asImpl.manageArtifactVersion(node.getArtifact(), replacement);
```

### Deprecation
'org.apache.maven.artifact.resolver.ResolutionListenerForDepMgmt' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
                case ResolutionListener.MANAGE_ARTIFACT_VERSION:
                    if (listener instanceof ResolutionListenerForDepMgmt) {
                        ResolutionListenerForDepMgmt asImpl = (ResolutionListenerForDepMgmt) listener;
                        asImpl.manageArtifactVersion(node.getArtifact(), replacement);
                    } else {
```

### Deprecation
'org.apache.maven.artifact.resolver.ResolutionListenerForDepMgmt' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
                case ResolutionListener.MANAGE_ARTIFACT_VERSION:
                    if (listener instanceof ResolutionListenerForDepMgmt) {
                        ResolutionListenerForDepMgmt asImpl = (ResolutionListenerForDepMgmt) listener;
                        asImpl.manageArtifactVersion(node.getArtifact(), replacement);
                    } else {
```

### Deprecation
'manageArtifact(org.apache.maven.artifact.Artifact, org.apache.maven.artifact.Artifact)' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
                        asImpl.manageArtifactVersion(node.getArtifact(), replacement);
                    } else {
                        listener.manageArtifact(node.getArtifact(), replacement);
                    }
                    break;
```

### Deprecation
'org.apache.maven.artifact.resolver.ResolutionListenerForDepMgmt' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
                    break;
                case ResolutionListener.MANAGE_ARTIFACT_SCOPE:
                    if (listener instanceof ResolutionListenerForDepMgmt) {
                        ResolutionListenerForDepMgmt asImpl = (ResolutionListenerForDepMgmt) listener;
                        asImpl.manageArtifactScope(node.getArtifact(), replacement);
```

### Deprecation
'org.apache.maven.artifact.resolver.ResolutionListenerForDepMgmt' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
                case ResolutionListener.MANAGE_ARTIFACT_SCOPE:
                    if (listener instanceof ResolutionListenerForDepMgmt) {
                        ResolutionListenerForDepMgmt asImpl = (ResolutionListenerForDepMgmt) listener;
                        asImpl.manageArtifactScope(node.getArtifact(), replacement);
                    } else {
```

### Deprecation
'org.apache.maven.artifact.resolver.ResolutionListenerForDepMgmt' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
                case ResolutionListener.MANAGE_ARTIFACT_SCOPE:
                    if (listener instanceof ResolutionListenerForDepMgmt) {
                        ResolutionListenerForDepMgmt asImpl = (ResolutionListenerForDepMgmt) listener;
                        asImpl.manageArtifactScope(node.getArtifact(), replacement);
                    } else {
```

### Deprecation
'manageArtifact(org.apache.maven.artifact.Artifact, org.apache.maven.artifact.Artifact)' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
                        asImpl.manageArtifactScope(node.getArtifact(), replacement);
                    } else {
                        listener.manageArtifact(node.getArtifact(), replacement);
                    }
                    break;
```

### Deprecation
'org.apache.maven.artifact.resolver.ResolutionListenerForDepMgmt' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
                    break;
                case ResolutionListener.MANAGE_ARTIFACT_SYSTEM_PATH:
                    if (listener instanceof ResolutionListenerForDepMgmt) {
                        ResolutionListenerForDepMgmt asImpl = (ResolutionListenerForDepMgmt) listener;
                        asImpl.manageArtifactSystemPath(node.getArtifact(), replacement);
```

### Deprecation
'org.apache.maven.artifact.resolver.ResolutionListenerForDepMgmt' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
                case ResolutionListener.MANAGE_ARTIFACT_SYSTEM_PATH:
                    if (listener instanceof ResolutionListenerForDepMgmt) {
                        ResolutionListenerForDepMgmt asImpl = (ResolutionListenerForDepMgmt) listener;
                        asImpl.manageArtifactSystemPath(node.getArtifact(), replacement);
                    } else {
```

### Deprecation
'org.apache.maven.artifact.resolver.ResolutionListenerForDepMgmt' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
                case ResolutionListener.MANAGE_ARTIFACT_SYSTEM_PATH:
                    if (listener instanceof ResolutionListenerForDepMgmt) {
                        ResolutionListenerForDepMgmt asImpl = (ResolutionListenerForDepMgmt) listener;
                        asImpl.manageArtifactSystemPath(node.getArtifact(), replacement);
                    } else {
```

### Deprecation
'manageArtifact(org.apache.maven.artifact.Artifact, org.apache.maven.artifact.Artifact)' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
                        asImpl.manageArtifactSystemPath(node.getArtifact(), replacement);
                    } else {
                        listener.manageArtifact(node.getArtifact(), replacement);
                    }
                    break;
```

### Deprecation
'org.apache.maven.artifact.versioning.ManagedVersionMap' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
            ResolutionNode node,
            Map<Object, List<ResolutionNode>> resolvedArtifacts,
            ManagedVersionMap managedVersions,
            ArtifactResolutionRequest request,
            ArtifactMetadataSource source,
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataSource' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
            ManagedVersionMap managedVersions,
            ArtifactResolutionRequest request,
            ArtifactMetadataSource source,
            ArtifactFilter filter,
            List<ResolutionListener> listeners,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
                        Artifact artifact = child.getArtifact();
                        artifact.setDependencyTrail(node.getDependencyTrail());
                        List<ArtifactRepository> childRemoteRepositories = child.getRemoteRepositories();

                        MetadataResolutionRequest metadataRequest = new DefaultMetadataResolutionRequest(request);
```

### Deprecation
'org.apache.maven.artifact.metadata.ResolutionGroup' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java

                        try {
                            ResolutionGroup rGroup;

                            Object childKey;
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataSource' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
            Map<String, Artifact> managedVersions,
            ArtifactResolutionRequest repositoryRequest,
            ArtifactMetadataSource source,
            ArtifactFilter filter,
            List<ResolutionListener> listeners,
```

### Deprecation
'org.apache.maven.artifact.versioning.ManagedVersionMap' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
        }

        ManagedVersionMap versionMap = getManagedVersionsMap(originatingArtifact, managedVersions);

        try {
```

### Deprecation
'org.apache.maven.repository.legacy.resolver.LegacyArtifactCollector' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
 * @author Jason van Zyl
 */
@Component(role = LegacyArtifactCollector.class)
public class DefaultLegacyArtifactCollector implements LegacyArtifactCollector {

```

### Deprecation
'org.apache.maven.repository.legacy.resolver.LegacyArtifactCollector' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
 */
@Component(role = LegacyArtifactCollector.class)
public class DefaultLegacyArtifactCollector implements LegacyArtifactCollector {

    @Requirement(hint = "nearest")
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
            Artifact originatingArtifact,
            Map<String, Artifact> managedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
            Map<String, Artifact> managedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
            ArtifactFilter filter,
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataSource' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
            ArtifactFilter filter,
            List<ResolutionListener> listeners,
```

### Deprecation
Overrides deprecated method in 'org.apache.maven.repository.legacy.resolver.LegacyArtifactCollector'
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java

    @SuppressWarnings("checkstyle:parameternumber")
    public ArtifactResolutionResult collect(
            Set<Artifact> artifacts,
            Artifact originatingArtifact,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
            Artifact originatingArtifact,
            Map<String, Artifact> managedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
            Map<String, Artifact> managedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
            ArtifactFilter filter,
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataSource' is deprecated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ArtifactMetadataSource source,
            ArtifactFilter filter,
            List<ResolutionListener> listeners) {
```

### Deprecation
Overrides deprecated method in 'java.util.Properties'
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java

    @Override
    public void save(OutputStream out, String comments) {
        Properties props = new Properties();
        props.putAll(getter.get());
```

### Deprecation
'save(java.io.OutputStream, java.lang.String)' is deprecated
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java
        Properties props = new Properties();
        props.putAll(getter.get());
        props.save(out, comments);
    }

```

### Deprecation
'getBaseDirectory()' is deprecated
in `maven-core/src/main/java/org/apache/maven/graph/ProjectSelector.java`
#### Snippet
```java

    File getBaseDirectoryFromRequest(MavenExecutionRequest request) {
        return request.getBaseDirectory() != null ? new File(request.getBaseDirectory()) : null;
    }

```

### Deprecation
'getBaseDirectory()' is deprecated
in `maven-core/src/main/java/org/apache/maven/graph/ProjectSelector.java`
#### Snippet
```java

    File getBaseDirectoryFromRequest(MavenExecutionRequest request) {
        return request.getBaseDirectory() != null ? new File(request.getBaseDirectory()) : null;
    }

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/plugin/PluginNotFoundException.java`
#### Snippet
```java
    }

    public PluginNotFoundException(Plugin plugin, List<ArtifactRepository> remoteRepositories) {
        super(
                "Plugin could not be found, please check its coordinates for typos and ensure the required"
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/RepositoryUtils.java`
#### Snippet
```java
    }

    public static RemoteRepository toRepo(ArtifactRepository repo) {
        RemoteRepository result = null;
        if (repo != null) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/RepositoryUtils.java`
#### Snippet
```java
    }

    public static String getLayout(ArtifactRepository repo) {
        try {
            return repo.getLayout().getId();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/RepositoryUtils.java`
#### Snippet
```java
    }

    public static List<RemoteRepository> toRepos(List<ArtifactRepository> repos) {
        return Optional.ofNullable(repos).orElse(Collections.emptyList()).stream()
                .map(RepositoryUtils::toRepo)
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/RepositoryUtils.java`
#### Snippet
```java
    }

    private static RepositoryPolicy toPolicy(ArtifactRepositoryPolicy policy) {
        RepositoryPolicy result = null;
        if (policy != null) {
```

### Deprecation
'DefaultProjectDependencyGraph(java.util.List, java.util.Collection)' is deprecated
in `maven-core/src/main/java/org/apache/maven/graph/DefaultGraphBuilder.java`
#### Snippet
```java
        if (session.getProjectDependencyGraph() != null || session.getProjects() != null) {
            final ProjectDependencyGraph graph =
                    new DefaultProjectDependencyGraph(session.getAllProjects(), session.getProjects());

            result = Result.success(graph);
```

### Deprecation
'getMultiModuleProjectDirectory()' is deprecated
in `maven-core/src/main/java/org/apache/maven/ReactorReader.java`
#### Snippet
```java
    private Path getProjectLocalRepo() {
        if (projectLocalRepository == null) {
            Path root = session.getRequest().getMultiModuleProjectDirectory().toPath();
            List<MavenProject> projects = session.getProjects();
            if (projects != null) {
```

### Deprecation
'getMultiModuleProjectDirectory()' is deprecated
in `maven-core/src/main/java/org/apache/maven/ReactorReader.java`
#### Snippet
```java
    private Path relativizeOutputFile(final Path outputFile) {
        Path projectBaseDirectory =
                Paths.get(session.getRequest().getMultiModuleProjectDirectory().toURI());
        return projectBaseDirectory.relativize(outputFile);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
     * @since 3.6.1
     */
    public List<ArtifactRepository> getEffectiveRepositories(List<ArtifactRepository> repositories) {
        if (repositories == null) {
            return null;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
     * @since 3.6.1
     */
    public List<ArtifactRepository> getEffectiveRepositories(List<ArtifactRepository> repositories) {
        if (repositories == null) {
            return null;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
        }

        Map<String, List<ArtifactRepository>> reposByKey = new LinkedHashMap<>();

        for (ArtifactRepository repository : repositories) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
        Map<String, List<ArtifactRepository>> reposByKey = new LinkedHashMap<>();

        for (ArtifactRepository repository : repositories) {
            String key = repository.getId();

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            String key = repository.getId();

            List<ArtifactRepository> aliasedRepos = reposByKey.computeIfAbsent(key, k -> new ArrayList<>());

            aliasedRepos.add(repository);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
        }

        List<ArtifactRepository> effectiveRepositories = new ArrayList<>();

        for (List<ArtifactRepository> aliasedRepos : reposByKey.values()) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
        List<ArtifactRepository> effectiveRepositories = new ArrayList<>();

        for (List<ArtifactRepository> aliasedRepos : reposByKey.values()) {
            List<ArtifactRepository> mirroredRepos = new ArrayList<>();

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java

        for (List<ArtifactRepository> aliasedRepos : reposByKey.values()) {
            List<ArtifactRepository> mirroredRepos = new ArrayList<>();

            List<ArtifactRepositoryPolicy> releasePolicies = new ArrayList<>(aliasedRepos.size());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            List<ArtifactRepository> mirroredRepos = new ArrayList<>();

            List<ArtifactRepositoryPolicy> releasePolicies = new ArrayList<>(aliasedRepos.size());

            for (ArtifactRepository aliasedRepo : aliasedRepos) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            List<ArtifactRepositoryPolicy> releasePolicies = new ArrayList<>(aliasedRepos.size());

            for (ArtifactRepository aliasedRepo : aliasedRepos) {
                releasePolicies.add(aliasedRepo.getReleases());
                mirroredRepos.addAll(aliasedRepo.getMirroredRepositories());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            }

            ArtifactRepositoryPolicy releasePolicy = getEffectivePolicy(releasePolicies);

            List<ArtifactRepositoryPolicy> snapshotPolicies = new ArrayList<>(aliasedRepos.size());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            ArtifactRepositoryPolicy releasePolicy = getEffectivePolicy(releasePolicies);

            List<ArtifactRepositoryPolicy> snapshotPolicies = new ArrayList<>(aliasedRepos.size());

            for (ArtifactRepository aliasedRepo : aliasedRepos) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            List<ArtifactRepositoryPolicy> snapshotPolicies = new ArrayList<>(aliasedRepos.size());

            for (ArtifactRepository aliasedRepo : aliasedRepos) {
                snapshotPolicies.add(aliasedRepo.getSnapshots());
            }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            }

            ArtifactRepositoryPolicy snapshotPolicy = getEffectivePolicy(snapshotPolicies);

            ArtifactRepository aliasedRepo = aliasedRepos.get(0);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            ArtifactRepositoryPolicy snapshotPolicy = getEffectivePolicy(snapshotPolicies);

            ArtifactRepository aliasedRepo = aliasedRepos.get(0);

            ArtifactRepository effectiveRepository = createArtifactRepository(
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            ArtifactRepository aliasedRepo = aliasedRepos.get(0);

            ArtifactRepository effectiveRepository = createArtifactRepository(
                    aliasedRepo.getId(), aliasedRepo.getUrl(), aliasedRepo.getLayout(), snapshotPolicy, releasePolicy);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
     * @return true if external.
     */
    static boolean isExternalHttpRepo(ArtifactRepository originalRepository) {
        try {
            URL url = new URL(originalRepository.getUrl());
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    private void checkLayout(String repositoryId, String layoutId, ArtifactRepositoryLayout layout) throws Exception {
        if (layout == null) {
            throw new Exception(
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    public static ArtifactRepository buildArtifactRepository(org.apache.maven.settings.Repository repo)
            throws InvalidRepositoryException {
        return buildArtifactRepository(fromSettingsRepository(repo));
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    public static ArtifactRepositoryPolicy buildArtifactRepositoryPolicy(
            org.apache.maven.model.RepositoryPolicy policy) {
        boolean enabled = true;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
        }

        return new ArtifactRepositoryPolicy(enabled, updatePolicy, checksumPolicy);
    }

```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    @Inject
    public MavenRepositorySystem(
            ArtifactHandlerManager artifactHandlerManager, Map<String, ArtifactRepositoryLayout> layouts) {
        this.artifactHandlerManager = artifactHandlerManager;
        this.layouts = layouts;
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    private ArtifactRepositoryLayout getLayout(String id) {
        return layouts.get(id);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    public void injectAuthentication(RepositorySystemSession session, List<ArtifactRepository> repositories) {
        if (repositories != null && session != null) {
            for (ArtifactRepository repository : repositories) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    public void injectAuthentication(RepositorySystemSession session, List<ArtifactRepository> repositories) {
        if (repositories != null && session != null) {
            for (ArtifactRepository repository : repositories) {
                repository.setAuthentication(getAuthentication(session, repository));
            }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    //

    public ArtifactRepository createDefaultRemoteRepository(MavenExecutionRequest request) throws Exception {
        return createRepository(
                RepositorySystem.DEFAULT_REMOTE_REPO_URL,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
                RepositorySystem.DEFAULT_REMOTE_REPO_ID,
                true,
                ArtifactRepositoryPolicy.UPDATE_POLICY_DAILY,
                false,
                ArtifactRepositoryPolicy.UPDATE_POLICY_DAILY,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
                ArtifactRepositoryPolicy.UPDATE_POLICY_DAILY,
                false,
                ArtifactRepositoryPolicy.UPDATE_POLICY_DAILY,
                ArtifactRepositoryPolicy.DEFAULT_CHECKSUM_POLICY);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
                false,
                ArtifactRepositoryPolicy.UPDATE_POLICY_DAILY,
                ArtifactRepositoryPolicy.DEFAULT_CHECKSUM_POLICY);
    }

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
     * @return true if the repository is a match to this pattern.
     */
    static boolean matchPattern(ArtifactRepository originalRepository, String pattern) {
        boolean result = false;
        String originalId = originalRepository.getId();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    private void injectMirror(ArtifactRepository repository, Mirror mirror) {
        if (mirror != null) {
            ArtifactRepository original = createArtifactRepository(
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    private void injectMirror(ArtifactRepository repository, Mirror mirror) {
        if (mirror != null) {
            ArtifactRepository original = createArtifactRepository(
                    repository.getId(),
                    repository.getUrl(),
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    private final ArtifactHandlerManager artifactHandlerManager;

    private final Map<String, ArtifactRepositoryLayout> layouts;

    @Inject
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    public ArtifactRepository createArtifactRepository(
            String id,
            String url,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            String url,
            String layoutId,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases)
            throws Exception {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            String layoutId,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases)
            throws Exception {
        ArtifactRepositoryLayout layout = layouts.get(layoutId);
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            ArtifactRepositoryPolicy releases)
            throws Exception {
        ArtifactRepositoryLayout layout = layouts.get(layoutId);

        checkLayout(id, layoutId, layout);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    public static ArtifactRepository buildArtifactRepository(org.apache.maven.model.Repository repo)
            throws InvalidRepositoryException {
        if (repo != null) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            }

            ArtifactRepositoryPolicy snapshots = buildArtifactRepositoryPolicy(repo.getSnapshots());

            ArtifactRepositoryPolicy releases = buildArtifactRepositoryPolicy(repo.getReleases());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            ArtifactRepositoryPolicy snapshots = buildArtifactRepositoryPolicy(repo.getSnapshots());

            ArtifactRepositoryPolicy releases = buildArtifactRepositoryPolicy(repo.getReleases());

            ArtifactRepositoryLayout layout = new DefaultRepositoryLayout();
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            ArtifactRepositoryPolicy releases = buildArtifactRepositoryPolicy(repo.getReleases());

            ArtifactRepositoryLayout layout = new DefaultRepositoryLayout();

            return createArtifactRepository(id, url, layout, snapshots, releases);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    public void injectMirror(RepositorySystemSession session, List<ArtifactRepository> repositories) {
        if (repositories != null && session != null) {
            for (ArtifactRepository repository : repositories) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    public void injectMirror(RepositorySystemSession session, List<ArtifactRepository> repositories) {
        if (repositories != null && session != null) {
            for (ArtifactRepository repository : repositories) {
                Mirror mirror = getMirror(session, repository);
                injectMirror(repository, mirror);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    static boolean matchesLayout(ArtifactRepository repository, Mirror mirror) {
        return matchesLayout(RepositoryUtils.getLayout(repository), mirror.getMirrorOfLayouts());
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    public Set<String> getRepoIds(List<ArtifactRepository> repositories) {
        Set<String> repoIds = new HashSet<>();

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java

        if (repositories != null) {
            for (ArtifactRepository repository : repositories) {
                repoIds.add(repository.getId());
            }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    public ArtifactRepository createRepository(
            String url,
            String repositoryId,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            String checksumPolicy)
            throws Exception {
        ArtifactRepositoryPolicy snapshotsPolicy =
                new ArtifactRepositoryPolicy(snapshots, snapshotUpdates, checksumPolicy);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            throws Exception {
        ArtifactRepositoryPolicy snapshotsPolicy =
                new ArtifactRepositoryPolicy(snapshots, snapshotUpdates, checksumPolicy);

        ArtifactRepositoryPolicy releasesPolicy =
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
                new ArtifactRepositoryPolicy(snapshots, snapshotUpdates, checksumPolicy);

        ArtifactRepositoryPolicy releasesPolicy =
                new ArtifactRepositoryPolicy(releases, releaseUpdates, checksumPolicy);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java

        ArtifactRepositoryPolicy releasesPolicy =
                new ArtifactRepositoryPolicy(releases, releaseUpdates, checksumPolicy);

        return createArtifactRepository(repositoryId, url, "default", snapshotsPolicy, releasesPolicy);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    public static ArtifactRepository createArtifactRepository(
            String id,
            String url,
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            String id,
            String url,
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            String url,
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases) {
        if (snapshots == null) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases) {
        if (snapshots == null) {
            snapshots = new ArtifactRepositoryPolicy();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
            ArtifactRepositoryPolicy releases) {
        if (snapshots == null) {
            snapshots = new ArtifactRepositoryPolicy();
        }

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java

        if (releases == null) {
            releases = new ArtifactRepositoryPolicy();
        }

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
        }

        ArtifactRepository repository;
        if (repositoryLayout instanceof ArtifactRepositoryLayout2) {
            repository = ((ArtifactRepositoryLayout2) repositoryLayout)
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    private Mirror getMirror(RepositorySystemSession session, ArtifactRepository repository) {
        if (session != null) {
            org.eclipse.aether.repository.MirrorSelector selector = session.getMirrorSelector();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    private ArtifactRepositoryPolicy getEffectivePolicy(Collection<ArtifactRepositoryPolicy> policies) {
        ArtifactRepositoryPolicy effectivePolicy = null;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    private ArtifactRepositoryPolicy getEffectivePolicy(Collection<ArtifactRepositoryPolicy> policies) {
        ArtifactRepositoryPolicy effectivePolicy = null;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java

    private ArtifactRepositoryPolicy getEffectivePolicy(Collection<ArtifactRepositoryPolicy> policies) {
        ArtifactRepositoryPolicy effectivePolicy = null;

        for (ArtifactRepositoryPolicy policy : policies) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
        ArtifactRepositoryPolicy effectivePolicy = null;

        for (ArtifactRepositoryPolicy policy : policies) {
            if (effectivePolicy == null) {
                effectivePolicy = new ArtifactRepositoryPolicy(policy);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
        for (ArtifactRepositoryPolicy policy : policies) {
            if (effectivePolicy == null) {
                effectivePolicy = new ArtifactRepositoryPolicy(policy);
            } else {
                effectivePolicy.merge(policy);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    public void injectMirror(List<ArtifactRepository> repositories, List<Mirror> mirrors) {
        if (repositories != null && mirrors != null) {
            for (ArtifactRepository repository : repositories) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    public void injectMirror(List<ArtifactRepository> repositories, List<Mirror> mirrors) {
        if (repositories != null && mirrors != null) {
            for (ArtifactRepository repository : repositories) {
                Mirror mirror = getMirror(repository, mirrors);
                injectMirror(repository, mirror);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    public ArtifactRepository createLocalRepository(MavenExecutionRequest request, File localRepository)
            throws Exception {
        return createRepository(
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
                RepositorySystem.DEFAULT_LOCAL_REPO_ID,
                true,
                ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS,
                true,
                ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
                ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS,
                true,
                ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS,
                ArtifactRepositoryPolicy.CHECKSUM_POLICY_IGNORE);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
                true,
                ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS,
                ArtifactRepositoryPolicy.CHECKSUM_POLICY_IGNORE);
    }

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    private static final String EXTERNAL_HTTP_WILDCARD = "external:http:*";

    public static Mirror getMirror(ArtifactRepository repository, List<Mirror> mirrors) {
        String repoId = repository.getId();

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
     * @return true if external.
     */
    static boolean isExternalRepo(ArtifactRepository originalRepository) {
        try {
            URL url = new URL(originalRepository.getUrl());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    private Authentication getAuthentication(RepositorySystemSession session, ArtifactRepository repository) {
        if (session != null) {
            AuthenticationSelector selector = session.getAuthenticationSelector();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    public void injectProxy(RepositorySystemSession session, List<ArtifactRepository> repositories) {
        if (repositories != null && session != null) {
            for (ArtifactRepository repository : repositories) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    public void injectProxy(RepositorySystemSession session, List<ArtifactRepository> repositories) {
        if (repositories != null && session != null) {
            for (ArtifactRepository repository : repositories) {
                repository.setProxy(getProxy(session, repository));
            }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
    }

    private Proxy getProxy(RepositorySystemSession session, ArtifactRepository repository) {
        if (session != null) {
            ProxySelector selector = session.getProxySelector();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
 * <tr><td><code>session.*</code></td>         <td>(since Maven 3)</td><td></td></tr>
 * <tr><td><code>localRepository</code></td>   <td></td>
 *                                             <td>{@link MavenSession#getLocalRepository()} DEPRECATED: Avoid use of {@link org.apache.maven.artifact.repository.ArtifactRepository} type. If you need access to local repository, switch to '${repositorySystemSession}' expression and get LRM from it instead. See <a href="https://issues.apache.org/jira/browse/MNG-7706">MNG-7706</a></td></tr>
 * <tr><td><code>reactorProjects</code></td>   <td></td>               <td>{@link MavenSession#getProjects()}</td></tr>
 * <tr><td><code>repositorySystemSession</code></td><td> (since Maven 3)</td>
```

### Deprecation
'getExecutionRootDirectory()' is deprecated
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
 * <tr><td><code>settings.*</code></td>        <td></td>               <td></td></tr>
 * <tr><td><code>basedir</code></td>           <td></td>
 *                                             <td>{@link MavenSession#getExecutionRootDirectory()} or
 *                                                 <code>System.getProperty( "user.dir" )</code> if null</td></tr>
 * <tr><td><code>mojoExecution</code></td>     <td></td>               <td>the actual {@link MojoExecution}</td></tr>
```

### Deprecation
'getExecutionRootDirectory()' is deprecated
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java

        if (basedir == null) {
            basedir = session.getExecutionRootDirectory();
        }

```

### Deprecation
'org.apache.maven.plugin.logging.Log' is deprecated
in `maven-core/src/main/java/org/apache/maven/plugin/DefaultBuildPluginManager.java`
#### Snippet
```java

        @Override
        public Log getLog() {
            return null;
        }
```

### Deprecation
'org.apache.maven.plugin.logging.Log' is deprecated
in `maven-core/src/main/java/org/apache/maven/plugin/DefaultBuildPluginManager.java`
#### Snippet
```java

        @Override
        public void setLog(Log log) {}

        @Override
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DeprecatedCoreExpressionValidator.java`
#### Snippet
```java
    private boolean isDeprecated(Parameter parameter) {
        return Objects.equals(
                        org.apache.maven.artifact.repository.ArtifactRepository.class.getName(), parameter.getType())
                && DEPRECATED_CORE_PARAMETERS.containsKey(parameter.getDefaultValue());
    }
```

### Deprecation
'org.apache.maven.plugin.logging.Log' is deprecated
in `maven-core/src/main/java/org/apache/maven/plugin/internal/MojoLogWrapper.java`
#### Snippet
```java
 * @author jdcasey
 */
public class MojoLogWrapper implements Log {
    private final Logger logger;

```

### Deprecation
'getExecutionRootDirectory()' is deprecated
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java
 * <tr><td><code>settings.*</code></td>        <td></td>               <td></td></tr>
 * <tr><td><code>basedir</code></td>           <td></td>
 *                                 <td>{@link Session#getExecutionRootDirectory()} or
 *                                                 <code>System.getProperty( "user.dir" )</code> if null</td></tr>
 * <tr><td><code>mojoExecution</code></td>     <td></td>               <td>the actual {@link MojoExecution}</td></tr>
```

### Deprecation
'getExecutionRootDirectory()' is deprecated
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java

        if (basedir == null) {
            basedir = session.getExecutionRootDirectory();
        }

```

### Deprecation
'org.apache.maven.plugin.PluginManager' is deprecated
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultPluginManager.java`
#### Snippet
```java
@Named
@Singleton
public class DefaultPluginManager implements PluginManager {

    private final PlexusContainer container;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultPluginManager.java`
#### Snippet
```java

    public PluginDescriptor verifyPlugin(
            Plugin plugin, MavenProject project, Settings settings, ArtifactRepository localRepository)
            throws ArtifactResolutionException, PluginVersionResolutionException, ArtifactNotFoundException,
                    InvalidVersionSpecificationException, InvalidPluginException, PluginManagerException,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultModelBuildingListener.java`
#### Snippet
```java
    private ProjectBuildingRequest projectBuildingRequest;

    private List<ArtifactRepository> remoteRepositories;

    private List<ArtifactRepository> pluginRepositories;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultModelBuildingListener.java`
#### Snippet
```java
    private List<ArtifactRepository> remoteRepositories;

    private List<ArtifactRepository> pluginRepositories;

    public DefaultModelBuildingListener(
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingRequest.java`
#### Snippet
```java
    List<ArtifactRepository> getRemoteRepositories();

    ProjectBuildingRequest setPluginArtifactRepositories(List<ArtifactRepository> pluginArtifactRepositories);

    List<ArtifactRepository> getPluginArtifactRepositories();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingRequest.java`
#### Snippet
```java
    ProjectBuildingRequest setLocalRepository(ArtifactRepository localRepository);

    ArtifactRepository getLocalRepository();

    ProjectBuildingRequest setRemoteRepositories(List<ArtifactRepository> remoteRepositories);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingRequest.java`
#### Snippet
```java
    ProjectBuildingRequest setPluginArtifactRepositories(List<ArtifactRepository> pluginArtifactRepositories);

    List<ArtifactRepository> getPluginArtifactRepositories();

    /**
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingRequest.java`
#### Snippet
```java
    ArtifactRepository getLocalRepository();

    ProjectBuildingRequest setRemoteRepositories(List<ArtifactRepository> remoteRepositories);

    List<ArtifactRepository> getRemoteRepositories();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingRequest.java`
#### Snippet
```java
    ProjectBuildingRequest setRemoteRepositories(List<ArtifactRepository> remoteRepositories);

    List<ArtifactRepository> getRemoteRepositories();

    ProjectBuildingRequest setPluginArtifactRepositories(List<ArtifactRepository> pluginArtifactRepositories);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingRequest.java`
#### Snippet
```java
public interface ProjectBuildingRequest {

    ProjectBuildingRequest setLocalRepository(ArtifactRepository localRepository);

    ArtifactRepository getLocalRepository();
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuilder.java`
#### Snippet
```java
     * @see org.apache.maven.model.building.ModelSource2
     */
    ProjectBuildingResult build(ModelSource modelSource, ProjectBuildingRequest request)
            throws ProjectBuildingException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingHelper.java`
#### Snippet
```java
    }

    public List<ArtifactRepository> createArtifactRepositories(
            List<Repository> pomRepositories,
            List<ArtifactRepository> externalRepositories,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingHelper.java`
#### Snippet
```java
    public List<ArtifactRepository> createArtifactRepositories(
            List<Repository> pomRepositories,
            List<ArtifactRepository> externalRepositories,
            ProjectBuildingRequest request)
            throws InvalidRepositoryException {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingHelper.java`
#### Snippet
```java
            ProjectBuildingRequest request)
            throws InvalidRepositoryException {
        List<ArtifactRepository> internalRepositories = new ArrayList<>();

        for (Repository repository : pomRepositories) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingHelper.java`
#### Snippet
```java
        repositorySystem.injectAuthentication(request.getRepositorySession(), internalRepositories);

        List<ArtifactRepository> dominantRepositories;
        List<ArtifactRepository> recessiveRepositories;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingHelper.java`
#### Snippet
```java

        List<ArtifactRepository> dominantRepositories;
        List<ArtifactRepository> recessiveRepositories;

        if (ProjectBuildingRequest.RepositoryMerging.REQUEST_DOMINANT.equals(request.getRepositoryMerging())) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingHelper.java`
#### Snippet
```java
        }

        List<ArtifactRepository> artifactRepositories = new ArrayList<>();
        Collection<String> repoIds = new HashSet<>();

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingHelper.java`
#### Snippet
```java

        if (dominantRepositories != null) {
            for (ArtifactRepository repository : dominantRepositories) {
                repoIds.add(repository.getId());
                artifactRepositories.add(repository);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingHelper.java`
#### Snippet
```java

        if (recessiveRepositories != null) {
            for (ArtifactRepository repository : recessiveRepositories) {
                if (repoIds.add(repository.getId())) {
                    artifactRepositories.add(repository);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingHelper.java`
#### Snippet
```java
     * @throws InvalidRepositoryException
     */
    List<ArtifactRepository> createArtifactRepositories(
            List<Repository> pomRepositories,
            List<ArtifactRepository> externalRepositories,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingHelper.java`
#### Snippet
```java
    List<ArtifactRepository> createArtifactRepositories(
            List<Repository> pomRepositories,
            List<ArtifactRepository> externalRepositories,
            ProjectBuildingRequest request)
            throws InvalidRepositoryException;
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java

    @Override
    public ModelSource resolveModel(org.apache.maven.model.Parent parent) throws UnresolvableModelException {
        AtomicReference<org.apache.maven.api.model.Parent> resolvedParent = new AtomicReference<>();
        ModelSource result = resolveModel(parent.getDelegate(), resolvedParent);
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java
    public ModelSource resolveModel(org.apache.maven.model.Parent parent) throws UnresolvableModelException {
        AtomicReference<org.apache.maven.api.model.Parent> resolvedParent = new AtomicReference<>();
        ModelSource result = resolveModel(parent.getDelegate(), resolvedParent);
        if (resolvedParent.get() != null) {
            parent.setVersion(resolvedParent.get().getVersion());
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java
    }

    public ModelSource resolveModel(String groupId, String artifactId, String version)
            throws UnresolvableModelException {
        Artifact pomArtifact = new DefaultArtifact(groupId, artifactId, "", "pom", version);
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java

    @Override
    public ModelSource resolveModel(final Parent parent, AtomicReference<Parent> modified)
            throws UnresolvableModelException {
        try {
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java

    @Override
    public ModelSource resolveModel(org.apache.maven.model.Dependency dependency) throws UnresolvableModelException {
        AtomicReference<org.apache.maven.api.model.Dependency> resolvedDependency = new AtomicReference<>();
        ModelSource result = resolveModel(dependency.getDelegate(), resolvedDependency);
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java
    public ModelSource resolveModel(org.apache.maven.model.Dependency dependency) throws UnresolvableModelException {
        AtomicReference<org.apache.maven.api.model.Dependency> resolvedDependency = new AtomicReference<>();
        ModelSource result = resolveModel(dependency.getDelegate(), resolvedDependency);
        if (resolvedDependency.get() != null) {
            dependency.setVersion(resolvedDependency.get().getVersion());
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java

    @Override
    public ModelSource resolveModel(final Dependency dependency, AtomicReference<Dependency> modified)
            throws UnresolvableModelException {
        try {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataCache.java`
#### Snippet
```java
            Artifact artifact,
            boolean resolveManagedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ResolutionGroup result);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataCache.java`
#### Snippet
```java
            boolean resolveManagedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ResolutionGroup result);

```

### Deprecation
'org.apache.maven.artifact.metadata.ResolutionGroup' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataCache.java`
#### Snippet
```java
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ResolutionGroup result);

    void flush();
```

### Deprecation
'org.apache.maven.artifact.metadata.ResolutionGroup' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataCache.java`
#### Snippet
```java
public interface MavenMetadataCache {

    ResolutionGroup get(
            Artifact artifact,
            boolean resolveManagedVersions,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataCache.java`
#### Snippet
```java
            Artifact artifact,
            boolean resolveManagedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataCache.java`
#### Snippet
```java
            boolean resolveManagedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories);

    void put(
```

### Deprecation
'org.apache.maven.artifact.factory.ArtifactFactory' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMetadataSource.java`
#### Snippet
```java
    public DefaultMetadataSource(
            RepositoryMetadataManager repositoryMetadataManager,
            ArtifactFactory artifactFactory,
            ProjectBuilder projectBuilder,
            MavenMetadataCache cache,
```

### Deprecation
'getDependencyArtifacts()' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectDependenciesResolver.java`
#### Snippet
```java
        collect.setRepositories(project.getRemoteProjectRepositories());

        if (project.getDependencyArtifacts() == null) {
            for (Dependency dependency : project.getDependencies()) {
                if (StringUtils.isEmpty(dependency.getGroupId())
```

### Deprecation
'getDependencyArtifacts()' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectDependenciesResolver.java`
#### Snippet
```java
                dependencies.put(key, dependency);
            }
            for (Artifact artifact : project.getDependencyArtifacts()) {
                String key = artifact.getDependencyConflictId();
                Dependency dependency = dependencies.get(key);
```

### Deprecation
'org.apache.maven.plugin.DebugConfigurationListener' is deprecated
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
            configurator = container.lookup(ComponentConfigurator.class, configuratorId);

            ConfigurationListener listener = new DebugConfigurationListener(logger);

            ValidatingConfigurationListener validator =
```

### Deprecation
'setLog(org.apache.maven.plugin.logging.Log)' is deprecated
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
            if (mojo instanceof Mojo) {
                Logger mojoLogger = LoggerFactory.getLogger(mojoDescriptor.getImplementation());
                ((Mojo) mojo).setLog(new MojoLogWrapper(mojoLogger));
            }

```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/ProjectArtifactMetadata.java`
#### Snippet
```java

    public void merge(org.apache.maven.repository.legacy.metadata.ArtifactMetadata metadata) {
        this.merge((ArtifactMetadata) metadata);
    }
}
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/ProjectArtifactMetadata.java`
#### Snippet
```java
    }

    public void merge(ArtifactMetadata metadata) {
        ProjectArtifactMetadata m = (ProjectArtifactMetadata) metadata;
        if (!m.file.equals(file)) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/ProjectArtifactMetadata.java`
#### Snippet
```java
    }

    public String getLocalFilename(ArtifactRepository repository) {
        return getFilename();
    }
```

### Deprecation
'org.apache.maven.artifact.metadata.AbstractArtifactMetadata' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/ProjectArtifactMetadata.java`
#### Snippet
```java
 * @author <a href="mailto:brett@apache.org">Brett Porter</a>
 */
public class ProjectArtifactMetadata extends AbstractArtifactMetadata {
    private final File file;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/ProjectArtifactMetadata.java`
#### Snippet
```java
    }

    public void storeInLocalRepository(ArtifactRepository localRepository, ArtifactRepository remoteRepository)
            throws RepositoryMetadataStoreException {
        File destination = new File(
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/ProjectArtifactMetadata.java`
#### Snippet
```java
    }

    public void storeInLocalRepository(ArtifactRepository localRepository, ArtifactRepository remoteRepository)
            throws RepositoryMetadataStoreException {
        File destination = new File(
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingRequest.java`
#### Snippet
```java
    }

    public List<ArtifactRepository> getRemoteRepositories() {
        return remoteRepositories;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingRequest.java`
#### Snippet
```java
    }

    public ProjectBuildingRequest setLocalRepository(ArtifactRepository localRepository) {
        this.localRepository = localRepository;
        return this;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingRequest.java`
#### Snippet
```java
    private ArtifactRepository localRepository;

    private List<ArtifactRepository> remoteRepositories;

    private List<ArtifactRepository> pluginArtifactRepositories;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingRequest.java`
#### Snippet
```java
    private RepositorySystemSession repositorySession;

    private ArtifactRepository localRepository;

    private List<ArtifactRepository> remoteRepositories;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingRequest.java`
#### Snippet
```java
    }

    public ProjectBuildingRequest setRemoteRepositories(List<ArtifactRepository> remoteRepositories) {
        if (remoteRepositories != null) {
            this.remoteRepositories = new ArrayList<>(remoteRepositories);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingRequest.java`
#### Snippet
```java
    }

    public ArtifactRepository getLocalRepository() {
        return localRepository;
    }
```

### Deprecation
'isResolveVersionRanges()' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingRequest.java`
#### Snippet
```java
        setResolveDependencies(request.isResolveDependencies());
        setValidationLevel(request.getValidationLevel());
        setResolveVersionRanges(request.isResolveVersionRanges());
        setRepositoryMerging(request.getRepositoryMerging());
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingRequest.java`
#### Snippet
```java
    }

    public ProjectBuildingRequest setPluginArtifactRepositories(List<ArtifactRepository> pluginArtifactRepositories) {
        if (pluginArtifactRepositories != null) {
            this.pluginArtifactRepositories = new ArrayList<>(pluginArtifactRepositories);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingRequest.java`
#### Snippet
```java
    }

    public List<ArtifactRepository> getPluginArtifactRepositories() {
        return pluginArtifactRepositories;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingRequest.java`
#### Snippet
```java
    private List<ArtifactRepository> remoteRepositories;

    private List<ArtifactRepository> pluginArtifactRepositories;

    private MavenProject project;
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/collector/PomlessCollectionStrategy.java`
#### Snippet
```java
    public List<MavenProject> collectProjects(final MavenExecutionRequest request) throws ProjectBuildingException {
        ProjectBuildingRequest buildingRequest = request.getProjectBuildingRequest();
        ModelSource modelSource = new UrlModelSource(DefaultMaven.class.getResource("project/standalone.xml"));
        MavenProject project =
                projectBuilder.build(modelSource, buildingRequest).getProject();
```

### Deprecation
'org.apache.maven.model.building.UrlModelSource' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/collector/PomlessCollectionStrategy.java`
#### Snippet
```java
    public List<MavenProject> collectProjects(final MavenExecutionRequest request) throws ProjectBuildingException {
        ProjectBuildingRequest buildingRequest = request.getProjectBuildingRequest();
        ModelSource modelSource = new UrlModelSource(DefaultMaven.class.getResource("project/standalone.xml"));
        MavenProject project =
                projectBuilder.build(modelSource, buildingRequest).getProject();
```

### Deprecation
'getDependencyArtifacts()' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultProjectArtifactsCache.java`
#### Snippet
```java

            Set<String> deps = new LinkedHashSet<>();
            if (project.getDependencyArtifacts() != null) {
                for (Artifact dep : project.getDependencyArtifacts()) {
                    deps.add(dep.toString());
```

### Deprecation
'getDependencyArtifacts()' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultProjectArtifactsCache.java`
#### Snippet
```java
            Set<String> deps = new LinkedHashSet<>();
            if (project.getDependencyArtifacts() != null) {
                for (Artifact dep : project.getDependencyArtifacts()) {
                    deps.add(dep.toString());
                }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
    }

    private static int repositoryHashCode(ArtifactRepository repository) {
        int result = 17;
        result = 31 * result + (repository.getId() != null ? repository.getId().hashCode() : 0);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
        private final long pomHash;
        private final boolean resolveManagedVersions;
        private final List<ArtifactRepository> repositories = new ArrayList<>();
        private final int hashCode;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
                    // if the POM didn't exist, retry if any repo is configured to always update
                    boolean snapshot = pomArtifact.isSnapshot();
                    for (ArtifactRepository repository : remoteRepositories) {
                        ArtifactRepositoryPolicy policy =
                                snapshot ? repository.getSnapshots() : repository.getReleases();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
                    boolean snapshot = pomArtifact.isSnapshot();
                    for (ArtifactRepository repository : remoteRepositories) {
                        ArtifactRepositoryPolicy policy =
                                snapshot ? repository.getSnapshots() : repository.getReleases();
                        if (ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS.equals(policy.getUpdatePolicy())) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
                        ArtifactRepositoryPolicy policy =
                                snapshot ? repository.getSnapshots() : repository.getReleases();
                        if (ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS.equals(policy.getUpdatePolicy())) {
                            return true;
                        }
```

### Deprecation
'org.apache.maven.artifact.metadata.ResolutionGroup' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
    }

    public ResolutionGroup get(
            Artifact artifact,
            boolean resolveManagedVersions,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
            Artifact artifact,
            boolean resolveManagedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories) {
        CacheKey cacheKey = newCacheKey(artifact, resolveManagedVersions, localRepository, remoteRepositories);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
            boolean resolveManagedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories) {
        CacheKey cacheKey = newCacheKey(artifact, resolveManagedVersions, localRepository, remoteRepositories);

```

### Deprecation
'org.apache.maven.artifact.metadata.ResolutionGroup' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
                managedVersions = ArtifactUtils.copyArtifacts(managedVersions, new LinkedHashMap<>());
            }
            return new ResolutionGroup(
                    pomArtifact, relocatedArtifact, artifacts, managedVersions, cacheRecord.getRemoteRepositories());
        }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
                Set<Artifact> artifacts,
                Map<String, Artifact> managedVersions,
                List<ArtifactRepository> remoteRepositories) {
            this.pomArtifact = ArtifactUtils.copyArtifact(pomArtifact);
            this.relocatedArtifact = ArtifactUtils.copyArtifactSafe(relocatedArtifact);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
    }

    private static boolean repositoriesEquals(List<ArtifactRepository> r1, List<ArtifactRepository> r2) {
        if (r1.size() != r2.size()) {
            return false;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
    }

    private static boolean repositoriesEquals(List<ArtifactRepository> r1, List<ArtifactRepository> r2) {
        if (r1.size() != r2.size()) {
            return false;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
        }

        for (Iterator<ArtifactRepository> it1 = r1.iterator(), it2 = r2.iterator(); it1.hasNext(); ) {
            if (!repositoryEquals(it1.next(), it2.next())) {
                return false;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
    }

    private static boolean repositoryPolicyEquals(ArtifactRepositoryPolicy p1, ArtifactRepositoryPolicy p2) {
        if (p1 == p2) {
            return true;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
    }

    private static boolean repositoryPolicyEquals(ArtifactRepositoryPolicy p1, ArtifactRepositoryPolicy p2) {
        if (p1 == p2) {
            return true;
```

### Deprecation
'org.apache.maven.artifact.metadata.ResolutionGroup' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
    }

    protected void put(CacheKey cacheKey, ResolutionGroup result) {
        CacheRecord cacheRecord = new CacheRecord(
                result.getPomArtifact(),
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
        }

        public List<ArtifactRepository> getRemoteRepositories() {
            return remoteRepositories;
        }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
    }

    private static boolean repositoryEquals(ArtifactRepository r1, ArtifactRepository r2) {
        if (r1 == r2) {
            return true;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
    }

    private static boolean repositoryEquals(ArtifactRepository r1, ArtifactRepository r2) {
        if (r1 == r2) {
            return true;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
        private List<Artifact> artifacts;
        private Map<String, Artifact> managedVersions;
        private List<ArtifactRepository> remoteRepositories;

        private long length;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
            Artifact artifact,
            boolean resolveManagedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ResolutionGroup result) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
            boolean resolveManagedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ResolutionGroup result) {
        put(newCacheKey(artifact, resolveManagedVersions, localRepository, remoteRepositories), result);
```

### Deprecation
'org.apache.maven.artifact.metadata.ResolutionGroup' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            ResolutionGroup result) {
        put(newCacheKey(artifact, resolveManagedVersions, localRepository, remoteRepositories), result);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
            Artifact artifact,
            boolean resolveManagedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories) {
        return new CacheKey(artifact, resolveManagedVersions, localRepository, remoteRepositories);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
            boolean resolveManagedVersions,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories) {
        return new CacheKey(artifact, resolveManagedVersions, localRepository, remoteRepositories);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
    }

    private static int repositoriesHashCode(List<ArtifactRepository> repositories) {
        int result = 17;
        for (ArtifactRepository repository : repositories) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
    private static int repositoriesHashCode(List<ArtifactRepository> repositories) {
        int result = 17;
        for (ArtifactRepository repository : repositories) {
            result = 31 * result + repositoryHashCode(repository);
        }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
                Artifact artifact,
                boolean resolveManagedVersions,
                ArtifactRepository localRepository,
                List<ArtifactRepository> remoteRepositories) {
            File file = artifact.getFile();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
                boolean resolveManagedVersions,
                ArtifactRepository localRepository,
                List<ArtifactRepository> remoteRepositories) {
            File file = artifact.getFile();
            this.artifact = ArtifactUtils.copyArtifact(artifact);
```

### Deprecation
'getMultiModuleProjectDirectory()' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/collector/MultiModuleCollectionStrategy.java`
#### Snippet
```java

    private File getMultiModuleProjectPomFile(MavenExecutionRequest request) {
        if (request.getPom().getParentFile().equals(request.getMultiModuleProjectDirectory())) {
            return request.getPom();
        } else {
```

### Deprecation
'getMultiModuleProjectDirectory()' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/collector/MultiModuleCollectionStrategy.java`
#### Snippet
```java
            return request.getPom();
        } else {
            File multiModuleProjectPom = modelLocator.locatePom(request.getMultiModuleProjectDirectory());
            if (!multiModuleProjectPom.exists()) {
                LOGGER.info(
```

### Deprecation
'getMultiModuleProjectDirectory()' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/collector/MultiModuleCollectionStrategy.java`
#### Snippet
```java
                        "Maven detected that the requested POM file is part of a multi-module project, "
                                + "but could not find a pom.xml file in the multi-module root directory '{}'.",
                        request.getMultiModuleProjectDirectory());
                LOGGER.info("The reactor is limited to all projects under: "
                        + request.getPom().getParent());
```

### Deprecation
'org.apache.maven.artifact.factory.ArtifactFactory' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/factory/DefaultArtifactFactory.java`
#### Snippet
```java
@Singleton
@SuppressWarnings("checkstyle:parameternumber")
public class DefaultArtifactFactory implements ArtifactFactory {
    private final ArtifactHandlerManager artifactHandlerManager;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ResolutionNode.java`
#### Snippet
```java
    private final ResolutionNode parent;

    private final List<ArtifactRepository> remoteRepositories;

    private boolean active = true;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ResolutionNode.java`
#### Snippet
```java

    public void addDependencies(
            Set<Artifact> artifacts, List<ArtifactRepository> remoteRepositories, ArtifactFilter filter)
            throws CyclicDependencyException, OverConstrainedVersionException {
        if (artifacts != null && !artifacts.isEmpty()) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ResolutionNode.java`
#### Snippet
```java
    }

    public List<ArtifactRepository> getRemoteRepositories() {
        return remoteRepositories;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ResolutionNode.java`
#### Snippet
```java
    }

    public ResolutionNode(Artifact artifact, List<ArtifactRepository> remoteRepositories, ResolutionNode parent) {
        this.artifact = artifact;
        this.remoteRepositories = remoteRepositories;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ResolutionNode.java`
#### Snippet
```java
    private List<Artifact> trail;

    public ResolutionNode(Artifact artifact, List<ArtifactRepository> remoteRepositories) {
        this.artifact = artifact;
        this.remoteRepositories = remoteRepositories;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionRequest.java`
#### Snippet
```java
    }

    public List<ArtifactRepository> getRemoteRepositories() {
        return remoteRepositories;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionRequest.java`
#### Snippet
```java
    private ArtifactRepository localRepository;

    private List<ArtifactRepository> remoteRepositories;

    private ArtifactFilter collectionFilter;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionRequest.java`
#### Snippet
```java
    private Set<Artifact> artifactDependencies;

    private ArtifactRepository localRepository;

    private List<ArtifactRepository> remoteRepositories;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionRequest.java`
#### Snippet
```java
    }

    public ArtifactResolutionRequest setRemoteRepositories(List<ArtifactRepository> remoteRepositories) {
        this.remoteRepositories = remoteRepositories;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionRequest.java`
#### Snippet
```java
    }

    public ArtifactRepository getLocalRepository() {
        return localRepository;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.RepositoryCache' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionRequest.java`
#### Snippet
```java
    // this here, possibly indefinitely.
    //
    public ArtifactResolutionRequest setCache(RepositoryCache cache) {
        return this;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionRequest.java`
#### Snippet
```java
    }

    public ArtifactResolutionRequest setLocalRepository(ArtifactRepository localRepository) {
        this.localRepository = localRepository;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/RepositoryRequest.java`
#### Snippet
```java
     * @return This request, never {@code null}.
     */
    RepositoryRequest setLocalRepository(ArtifactRepository localRepository);

    /**
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/RepositoryRequest.java`
#### Snippet
```java
     * @return The remote repositories to use, never {@code null}.
     */
    List<ArtifactRepository> getRemoteRepositories();

    /**
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/RepositoryRequest.java`
#### Snippet
```java
     * @return The local repository to use or {@code null} if not set.
     */
    ArtifactRepository getLocalRepository();

    /**
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/RepositoryRequest.java`
#### Snippet
```java
     * @return This request, never {@code null}.
     */
    RepositoryRequest setRemoteRepositories(List<ArtifactRepository> remoteRepositories);
}

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    }

    public void setPluginArtifactRepositories(List<ArtifactRepository> pluginArtifactRepositories) {
        this.pluginArtifactRepositories = pluginArtifactRepositories;
        this.remotePluginRepositories = RepositoryUtils.toRepos(getPluginArtifactRepositories());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    }

    public ArtifactRepository getDistributionManagementArtifactRepository() {
        return getArtifact().isSnapshot() && (getSnapshotArtifactRepository() != null)
                ? getSnapshotArtifactRepository()
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    }

    public List<ArtifactRepository> getRemoteArtifactRepositories() {
        if (remoteArtifactRepositories == null) {
            remoteArtifactRepositories = new ArrayList<>();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    private List<String> scriptSourceRoots = new ArrayList<>();

    private ArtifactRepository releaseArtifactRepository;

    private ArtifactRepository snapshotArtifactRepository;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
     *         getPluginRepositories.
     */
    public List<ArtifactRepository> getPluginArtifactRepositories() {
        if (pluginArtifactRepositories == null) {
            pluginArtifactRepositories = new ArrayList<>();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    }

    public void setRemoteArtifactRepositories(List<ArtifactRepository> remoteArtifactRepositories) {
        this.remoteArtifactRepositories = remoteArtifactRepositories;
        this.remoteProjectRepositories = RepositoryUtils.toRepos(getRemoteArtifactRepositories());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    private Set<Artifact> pluginArtifacts;

    private List<ArtifactRepository> remoteArtifactRepositories;

    private List<ArtifactRepository> pluginArtifactRepositories;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    }

    protected ArtifactRepository getSnapshotArtifactRepository() {
        return snapshotArtifactRepository;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    }

    public void setSnapshotArtifactRepository(ArtifactRepository snapshotArtifactRepository) {
        this.snapshotArtifactRepository = snapshotArtifactRepository;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    }

    public void setReleaseArtifactRepository(ArtifactRepository releaseArtifactRepository) {
        this.releaseArtifactRepository = releaseArtifactRepository;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    private List<ArtifactRepository> remoteArtifactRepositories;

    private List<ArtifactRepository> pluginArtifactRepositories;

    private List<RemoteRepository> remoteProjectRepositories;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    }

    protected ArtifactRepository getReleaseArtifactRepository() {
        return releaseArtifactRepository;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    private ArtifactRepository releaseArtifactRepository;

    private ArtifactRepository snapshotArtifactRepository;

    private List<Profile> activeProfiles = new ArrayList<>();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/DefaultRepositoryRequest.java`
#### Snippet
```java
    }

    public List<ArtifactRepository> getRemoteRepositories() {
        if (remoteRepositories == null) {
            remoteRepositories = new ArrayList<>();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/DefaultRepositoryRequest.java`
#### Snippet
```java
    }

    public DefaultRepositoryRequest setLocalRepository(ArtifactRepository localRepository) {
        this.localRepository = localRepository;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/DefaultRepositoryRequest.java`
#### Snippet
```java
    }

    public ArtifactRepository getLocalRepository() {
        return localRepository;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/DefaultRepositoryRequest.java`
#### Snippet
```java
    }

    public DefaultRepositoryRequest setRemoteRepositories(List<ArtifactRepository> remoteRepositories) {
        this.remoteRepositories = remoteRepositories;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/DefaultRepositoryRequest.java`
#### Snippet
```java
    private ArtifactRepository localRepository;

    private List<ArtifactRepository> remoteRepositories;

    /**
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/DefaultRepositoryRequest.java`
#### Snippet
```java
    private boolean forceUpdate;

    private ArtifactRepository localRepository;

    private List<ArtifactRepository> remoteRepositories;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionResult.java`
#### Snippet
```java
    }

    public ArtifactResolutionResult setRepositories(final List<ArtifactRepository> repositories) {
        this.repositories = repositories;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionResult.java`
#### Snippet
```java
    // file system errors

    private List<ArtifactRepository> repositories;

    private Set<Artifact> artifacts;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionResult.java`
#### Snippet
```java
    // ------------------------------------------------------------------------

    public List<ArtifactRepository> getRepositories() {
        if (repositories == null) {
            return Collections.emptyList();
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataRetrievalException' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    @SuppressWarnings("checkstyle:methodlength")
    private ProjectRelocation retrieveRelocatedProject(Artifact artifact, MetadataResolutionRequest repositoryRequest)
            throws ArtifactMetadataRetrievalException {
        MavenProject project;

```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataRetrievalException' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
                    ModelProblem missingParentPom = hasMissingParentPom(e);
                    if (missingParentPom != null) {
                        throw new ArtifactMetadataRetrievalException(
                                "Failed to process POM for " + artifact.getId() + ": " + missingParentPom.getMessage(),
                                missingParentPom.getException(),
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataRetrievalException' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
                        message = "Missing POM for " + artifact.getId();
                    } else if (isNonTransferablePom(e)) {
                        throw new ArtifactMetadataRetrievalException(
                                "Failed to retrieve POM for " + artifact.getId() + ": "
                                        + e.getCause().getMessage(),
```

### Deprecation
'org.apache.maven.artifact.factory.ArtifactFactory' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final RepositoryMetadataManager repositoryMetadataManager;
    private final ArtifactFactory artifactFactory;
    private final ProjectBuilder projectBuilder;
    private final MavenMetadataCache cache;
```

### Deprecation
'org.apache.maven.artifact.metadata.ResolutionGroup' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java

    @Override
    public ResolutionGroup retrieve(
            Artifact artifact, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories)
            throws ArtifactMetadataRetrievalException {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    @Override
    public ResolutionGroup retrieve(
            Artifact artifact, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories)
            throws ArtifactMetadataRetrievalException {
        return retrieve(artifact, localRepository, remoteRepositories, false);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    @Override
    public ResolutionGroup retrieve(
            Artifact artifact, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories)
            throws ArtifactMetadataRetrievalException {
        return retrieve(artifact, localRepository, remoteRepositories, false);
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataRetrievalException' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    public ResolutionGroup retrieve(
            Artifact artifact, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories)
            throws ArtifactMetadataRetrievalException {
        return retrieve(artifact, localRepository, remoteRepositories, false);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    }

    private List<ArtifactRepository> getRepositoriesFromModel(RepositorySystemSession repositorySession, Model model) {
        List<ArtifactRepository> pomRepositories = new ArrayList<>();
        for (Repository modelRepository : model.getRepositories()) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java

    private List<ArtifactRepository> getRepositoriesFromModel(RepositorySystemSession repositorySession, Model model) {
        List<ArtifactRepository> pomRepositories = new ArrayList<>();
        for (Repository modelRepository : model.getRepositories()) {
            try {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    }

    private List<ArtifactRepository> aggregateRepositories(
            List<ArtifactRepository> requestRepositories, List<ArtifactRepository> pomRepositories) {
        List<ArtifactRepository> repositories = requestRepositories;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java

    private List<ArtifactRepository> aggregateRepositories(
            List<ArtifactRepository> requestRepositories, List<ArtifactRepository> pomRepositories) {
        List<ArtifactRepository> repositories = requestRepositories;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java

    private List<ArtifactRepository> aggregateRepositories(
            List<ArtifactRepository> requestRepositories, List<ArtifactRepository> pomRepositories) {
        List<ArtifactRepository> repositories = requestRepositories;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    private List<ArtifactRepository> aggregateRepositories(
            List<ArtifactRepository> requestRepositories, List<ArtifactRepository> pomRepositories) {
        List<ArtifactRepository> repositories = requestRepositories;

        if (pomRepositories != null && !pomRepositories.isEmpty()) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java

        if (pomRepositories != null && !pomRepositories.isEmpty()) {
            Map<String, ArtifactRepository> repos = new LinkedHashMap<>();

            for (ArtifactRepository repo : requestRepositories) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
            Map<String, ArtifactRepository> repos = new LinkedHashMap<>();

            for (ArtifactRepository repo : requestRepositories) {
                if (!repos.containsKey(repo.getId())) {
                    repos.put(repo.getId(), repo);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
            }

            for (ArtifactRepository repo : pomRepositories) {
                if (!repos.containsKey(repo.getId())) {
                    repos.put(repo.getId(), repo);
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataRetrievalException' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    @Override
    public List<ArtifactVersion> retrieveAvailableVersions(MetadataResolutionRequest request)
            throws ArtifactMetadataRetrievalException {
        RepositoryMetadata metadata = new ArtifactRepositoryMetadata(request.getArtifact());

```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataRetrievalException' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
            repositoryMetadataManager.resolve(metadata, request);
        } catch (RepositoryMetadataResolutionException e) {
            throw new ArtifactMetadataRetrievalException(e.getMessage(), e, request.getArtifact());
        }

```

### Deprecation
'org.apache.maven.artifact.factory.ArtifactFactory' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java

    private static Artifact createDependencyArtifact(
            ArtifactFactory factory, Dependency dependency, String inheritedScope, ArtifactFilter inheritedFilter)
            throws InvalidVersionSpecificationException {
        String effectiveScope = getEffectiveScope(dependency.getScope(), inheritedScope);
```

### Deprecation
'org.apache.maven.artifact.metadata.ResolutionGroup' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    }

    public ResolutionGroup retrieve(
            Artifact artifact,
            ArtifactRepository localRepository,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    public ResolutionGroup retrieve(
            Artifact artifact,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            boolean resolveManagedVersions)
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
            Artifact artifact,
            ArtifactRepository localRepository,
            List<ArtifactRepository> remoteRepositories,
            boolean resolveManagedVersions)
            throws ArtifactMetadataRetrievalException {
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataRetrievalException' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
            List<ArtifactRepository> remoteRepositories,
            boolean resolveManagedVersions)
            throws ArtifactMetadataRetrievalException {
        MetadataResolutionRequest request = new DefaultMetadataResolutionRequest();
        injectSession(request);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    @Override
    public List<ArtifactVersion> retrieveAvailableVersions(
            Artifact artifact, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories)
            throws ArtifactMetadataRetrievalException {
        MetadataResolutionRequest request = new DefaultMetadataResolutionRequest();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    @Override
    public List<ArtifactVersion> retrieveAvailableVersions(
            Artifact artifact, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories)
            throws ArtifactMetadataRetrievalException {
        MetadataResolutionRequest request = new DefaultMetadataResolutionRequest();
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataRetrievalException' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    public List<ArtifactVersion> retrieveAvailableVersions(
            Artifact artifact, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories)
            throws ArtifactMetadataRetrievalException {
        MetadataResolutionRequest request = new DefaultMetadataResolutionRequest();
        injectSession(request);
```

### Deprecation
'org.apache.maven.artifact.metadata.ResolutionGroup' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java

    @Override
    public ResolutionGroup retrieve(MetadataResolutionRequest request) throws ArtifactMetadataRetrievalException {
        Artifact artifact = request.getArtifact();

```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataRetrievalException' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java

    @Override
    public ResolutionGroup retrieve(MetadataResolutionRequest request) throws ArtifactMetadataRetrievalException {
        Artifact artifact = request.getArtifact();

```

### Deprecation
'org.apache.maven.artifact.metadata.ResolutionGroup' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
        //
        if (artifact.getScope() != null && artifact.getScope().equals(Artifact.SCOPE_SYSTEM)) {
            return new ResolutionGroup(null, null, null);
        }

```

### Deprecation
'org.apache.maven.artifact.metadata.ResolutionGroup' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
        }

        ResolutionGroup cached = cache.get(
                artifact,
                request.isResolveManagedVersions(),
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
        List<Dependency> managedDependencies = null;

        List<ArtifactRepository> pomRepositories = null;

        Artifact pomArtifact;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
        }

        List<ArtifactRepository> aggregatedRepositories =
                aggregateRepositories(request.getRemoteRepositories(), pomRepositories);

```

### Deprecation
'org.apache.maven.artifact.metadata.ResolutionGroup' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
                aggregateRepositories(request.getRemoteRepositories(), pomRepositories);

        ResolutionGroup result =
                new ResolutionGroup(pomArtifact, relocatedArtifact, artifacts, managedVersions, aggregatedRepositories);

```

### Deprecation
'org.apache.maven.artifact.metadata.ResolutionGroup' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java

        ResolutionGroup result =
                new ResolutionGroup(pomArtifact, relocatedArtifact, artifacts, managedVersions, aggregatedRepositories);

        cache.put(
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataRetrievalException' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java

    private Artifact createDependencyArtifact(Dependency dependency, Artifact owner, Artifact pom)
            throws ArtifactMetadataRetrievalException {
        try {
            String inheritedScope = (owner != null) ? owner.getScope() : null;
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataRetrievalException' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
            return createDependencyArtifact(artifactFactory, dependency, inheritedScope, inheritedFilter);
        } catch (InvalidVersionSpecificationException e) {
            throw new ArtifactMetadataRetrievalException(
                    "Invalid version for dependency " + dependency.getManagementKey() + ": " + e.getMessage(), e, pom);
        }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    @Override
    public List<ArtifactVersion> retrieveAvailableVersionsFromDeploymentRepository(
            Artifact artifact, ArtifactRepository localRepository, ArtifactRepository deploymentRepository)
            throws ArtifactMetadataRetrievalException {
        RepositoryMetadata metadata = new ArtifactRepositoryMetadata(artifact);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    @Override
    public List<ArtifactVersion> retrieveAvailableVersionsFromDeploymentRepository(
            Artifact artifact, ArtifactRepository localRepository, ArtifactRepository deploymentRepository)
            throws ArtifactMetadataRetrievalException {
        RepositoryMetadata metadata = new ArtifactRepositoryMetadata(artifact);
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataRetrievalException' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    public List<ArtifactVersion> retrieveAvailableVersionsFromDeploymentRepository(
            Artifact artifact, ArtifactRepository localRepository, ArtifactRepository deploymentRepository)
            throws ArtifactMetadataRetrievalException {
        RepositoryMetadata metadata = new ArtifactRepositoryMetadata(artifact);

```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataRetrievalException' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
            repositoryMetadataManager.resolveAlways(metadata, localRepository, deploymentRepository);
        } catch (RepositoryMetadataResolutionException e) {
            throw new ArtifactMetadataRetrievalException(e.getMessage(), e, artifact);
        }

```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadataSource' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
@Named("maven")
@Singleton
public class MavenMetadataSource implements ArtifactMetadataSource {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final RepositoryMetadataManager repositoryMetadataManager;
```

### Deprecation
'org.apache.maven.artifact.factory.ArtifactFactory' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    public MavenMetadataSource(
            RepositoryMetadataManager repositoryMetadataManager,
            ArtifactFactory artifactFactory,
            ProjectBuilder projectBuilder,
            MavenMetadataCache cache,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/RepositoryMetadata.java`
#### Snippet
```java
     * @param remoteRepository the repository
     */
    void setRepository(ArtifactRepository remoteRepository);

    /**
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/RepositoryMetadata.java`
#### Snippet
```java
     * @return the repository
     */
    ArtifactRepository getRepository();

    /**
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/RepositoryMetadata.java`
#### Snippet
```java
 * TODO not happy about the store method - they use "this"
 */
public interface RepositoryMetadata extends org.apache.maven.artifact.metadata.ArtifactMetadata {

    int RELEASE = 1;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/RepositoryMetadata.java`
#### Snippet
```java
     * @return The policy, never {@code null}.
     */
    ArtifactRepositoryPolicy getPolicy(ArtifactRepository repository);
}

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/RepositoryMetadata.java`
#### Snippet
```java
     * @return The policy, never {@code null}.
     */
    ArtifactRepositoryPolicy getPolicy(ArtifactRepository repository);
}

```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
    }

    private ProjectBuildingResult build(File pomFile, ModelSource modelSource, InternalConfig config)
            throws ProjectBuildingException {
        ClassLoader oldContextClassLoader = Thread.currentThread().getContextClassLoader();
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
    }

    private ModelSource createStubModelSource(Artifact artifact) {
        StringBuilder buffer = new StringBuilder(1024);

```

### Deprecation
'org.apache.maven.model.building.StringModelSource' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
        buffer.append("</project>");

        return new StringModelSource(buffer, artifact.getId());
    }

```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java

    @Override
    public ProjectBuildingResult build(ModelSource modelSource, ProjectBuildingRequest request)
            throws ProjectBuildingException {
        return build(null, modelSource, new InternalConfig(request, null, null));
```

### Deprecation
'addScriptSourceRoot(java.lang.String)' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
        {
            Build build = project.getBuild();
            project.addScriptSourceRoot(build.getScriptSourceDirectory());
            project.addCompileSourceRoot(build.getSourceDirectory());
            project.addTestCompileSourceRoot(build.getTestSourceDirectory());
```

### Deprecation
'setProjectBuildingRequest(org.apache.maven.project.ProjectBuildingRequest)' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
        //

        project.setProjectBuildingRequest(projectBuildingRequest);

        // pluginArtifacts
```

### Deprecation
'getReportPlugins()' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
        // reportArtifacts
        Set<Artifact> reportArtifacts = new HashSet<>();
        for (ReportPlugin report : project.getReportPlugins()) {
            Plugin pp = new Plugin();
            pp.setGroupId(report.getGroupId());
```

### Deprecation
'setReportArtifacts(java.util.Set)' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
            }
        }
        project.setReportArtifacts(reportArtifacts);

        // extensionArtifacts
```

### Deprecation
'setExtensionArtifacts(java.util.Set)' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
            }
        }
        project.setExtensionArtifacts(extensionArtifacts);

        // managedVersionMap
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
                DeploymentRepository r = project.getDistributionManagement().getRepository();
                if (!StringUtils.isEmpty(r.getId()) && !StringUtils.isEmpty(r.getUrl())) {
                    ArtifactRepository repo = MavenRepositorySystem.buildArtifactRepository(r);
                    repositorySystem.injectProxy(projectBuildingRequest.getRepositorySession(), Arrays.asList(repo));
                    repositorySystem.injectAuthentication(
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
                DeploymentRepository r = project.getDistributionManagement().getSnapshotRepository();
                if (!StringUtils.isEmpty(r.getId()) && !StringUtils.isEmpty(r.getUrl())) {
                    ArtifactRepository repo = MavenRepositorySystem.buildArtifactRepository(r);
                    repositorySystem.injectProxy(projectBuildingRequest.getRepositorySession(), Arrays.asList(repo));
                    repositorySystem.injectAuthentication(
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        }

        public List<ArtifactRepository> getMirroredRepositories() {
            return Collections.emptyList();
        }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        public void setSnapshotUpdatePolicy(ArtifactRepositoryPolicy policy) {}

        public ArtifactRepositoryPolicy getReleases() {
            return null;
        }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
    }

    private LegacyLocalRepositoryManager(ArtifactRepository delegate) {
        this.delegate = Objects.requireNonNull(delegate, "delegate cannot be null");

```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        this.delegate = Objects.requireNonNull(delegate, "delegate cannot be null");

        ArtifactRepositoryLayout layout = delegate.getLayout();
        repo = new LocalRepository(
                new File(delegate.getBasedir()),
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
public class LegacyLocalRepositoryManager implements LocalRepositoryManager {

    private final ArtifactRepository delegate;

    private final LocalRepository repo;
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        }

        public String pathOfRemoteRepositoryMetadata(ArtifactMetadata artifactMetadata) {
            return null;
        }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        }

        public void setSnapshotUpdatePolicy(ArtifactRepositoryPolicy policy) {}

        public ArtifactRepositoryPolicy getReleases() {
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/RepositoryMetadataManager.java`
#### Snippet
```java
     * @throws RepositoryMetadataInstallationException in case of metadata installation issue
     */
    void install(ArtifactMetadata metadata, ArtifactRepository localRepository)
            throws RepositoryMetadataInstallationException;
}
```

### Deprecation
Overrides deprecated method in 'org.apache.maven.artifact.repository.ArtifactRepository'
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        }

        public boolean isUniqueVersion() {
            return true;
        }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/RepositoryMetadataManager.java`
#### Snippet
```java
     * @throws RepositoryMetadataInstallationException in case of metadata installation issue
     */
    void install(ArtifactMetadata metadata, ArtifactRepository localRepository)
            throws RepositoryMetadataInstallationException;
}
```

### Deprecation
Overrides deprecated method in 'org.apache.maven.artifact.repository.ArtifactRepository'
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        }

        public void setBlacklisted(boolean blackListed) {}

        public org.apache.maven.artifact.Artifact find(org.apache.maven.artifact.Artifact artifact) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/RepositoryMetadataManager.java`
#### Snippet
```java
    void resolve(
            RepositoryMetadata repositoryMetadata,
            List<ArtifactRepository> repositories,
            ArtifactRepository localRepository)
            throws RepositoryMetadataResolutionException;
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        }

        public void setLayout(ArtifactRepositoryLayout layout) {}

        public String getKey() {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
    }

    static class ArtifactRepositoryAdapter implements ArtifactRepository {

        private final RemoteRepository repository;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/RepositoryMetadataManager.java`
#### Snippet
```java
            RepositoryMetadata repositoryMetadata,
            List<ArtifactRepository> repositories,
            ArtifactRepository localRepository)
            throws RepositoryMetadataResolutionException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        public void setId(String id) {}

        public ArtifactRepositoryPolicy getSnapshots() {
            return null;
        }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/RepositoryMetadataManager.java`
#### Snippet
```java

    void resolveAlways(
            RepositoryMetadata metadata, ArtifactRepository localRepository, ArtifactRepository remoteRepository)
            throws RepositoryMetadataResolutionException;

```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        }

        public String pathOfLocalRepositoryMetadata(ArtifactMetadata metadata, ArtifactRepository repository) {
            return null;
        }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/RepositoryMetadataManager.java`
#### Snippet
```java

    void resolveAlways(
            RepositoryMetadata metadata, ArtifactRepository localRepository, ArtifactRepository remoteRepository)
            throws RepositoryMetadataResolutionException;

```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/RepositoryMetadataManager.java`
#### Snippet
```java
     * @throws RepositoryMetadataDeploymentException in case of metadata deployment issue
     */
    void deploy(ArtifactMetadata metadata, ArtifactRepository localRepository, ArtifactRepository deploymentRepository)
            throws RepositoryMetadataDeploymentException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/RepositoryMetadataManager.java`
#### Snippet
```java
     * @throws RepositoryMetadataDeploymentException in case of metadata deployment issue
     */
    void deploy(ArtifactMetadata metadata, ArtifactRepository localRepository, ArtifactRepository deploymentRepository)
            throws RepositoryMetadataDeploymentException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/RepositoryMetadataManager.java`
#### Snippet
```java
     * @throws RepositoryMetadataDeploymentException in case of metadata deployment issue
     */
    void deploy(ArtifactMetadata metadata, ArtifactRepository localRepository, ArtifactRepository deploymentRepository)
            throws RepositoryMetadataDeploymentException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        }

        public String pathOfLocalRepositoryMetadata(ArtifactMetadata metadata, ArtifactRepository repository) {
            return null;
        }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        }

        public void setReleaseUpdatePolicy(ArtifactRepositoryPolicy policy) {}

        public ArtifactRepositoryLayout getLayout() {
```

### Deprecation
Overrides deprecated method in 'org.apache.maven.artifact.repository.ArtifactRepository'
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        }

        public boolean isBlacklisted() {
            return false;
        }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        }

        public String getLocalFilename(ArtifactRepository repository) {
            return insertRepositoryKey(getRemoteFilename(), repository.getKey());
        }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        }

        public void storeInLocalRepository(ArtifactRepository localRepository, ArtifactRepository remoteRepository)
                throws RepositoryMetadataStoreException {
            // not used
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        }

        public void storeInLocalRepository(ArtifactRepository localRepository, ArtifactRepository remoteRepository)
                throws RepositoryMetadataStoreException {
            // not used
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        }

        public void merge(ArtifactMetadata metadata) {
            // not used
        }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        }

        public void setMirroredRepositories(List<ArtifactRepository> mirroredRepositories) {}

        public boolean isBlocked() {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java

    public static RepositorySystemSession overlay(
            ArtifactRepository repository, RepositorySystemSession session, RepositorySystem system) {
        if (repository == null || repository.getBasedir() == null) {
            return session;
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
    }

    static class ArtifactMetadataAdapter implements ArtifactMetadata {

        private final Metadata metadata;
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java
        public void setReleaseUpdatePolicy(ArtifactRepositoryPolicy policy) {}

        public ArtifactRepositoryLayout getLayout() {
            return null;
        }
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/layout/DefaultRepositoryLayout.java`
#### Snippet
```java
    }

    public String pathOfRemoteRepositoryMetadata(ArtifactMetadata metadata) {
        return pathOfRepositoryMetadata(metadata, metadata.getRemoteFilename());
    }
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/layout/DefaultRepositoryLayout.java`
#### Snippet
```java
    }

    public String pathOfLocalRepositoryMetadata(ArtifactMetadata metadata, ArtifactRepository repository) {
        return pathOfRepositoryMetadata(metadata, metadata.getLocalFilename(repository));
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/layout/DefaultRepositoryLayout.java`
#### Snippet
```java
    }

    public String pathOfLocalRepositoryMetadata(ArtifactMetadata metadata, ArtifactRepository repository) {
        return pathOfRepositoryMetadata(metadata, metadata.getLocalFilename(repository));
    }
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/layout/DefaultRepositoryLayout.java`
#### Snippet
```java
    }

    private String pathOfRepositoryMetadata(ArtifactMetadata metadata, String filename) {
        StringBuilder path = new StringBuilder(128);

```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/layout/DefaultRepositoryLayout.java`
#### Snippet
```java
@Named("default")
@Singleton
public class DefaultRepositoryLayout implements ArtifactRepositoryLayout {
    private static final char PATH_SEPARATOR = '/';

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/ArtifactRepositoryMetadata.java`
#### Snippet
```java
    }

    public ArtifactRepository getRepository() {
        return null;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/ArtifactRepositoryMetadata.java`
#### Snippet
```java
    }

    public void setRepository(ArtifactRepository remoteRepository) {
        /*
         * NOTE: Metadata at the g:a level contains a collection of available versions. After merging, we can't tell
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/AbstractRepositoryMetadata.java`
#### Snippet
```java
    }

    public String getLocalFilename(ArtifactRepository repository) {
        return "maven-metadata-" + repository.getKey() + ".xml";
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/AbstractRepositoryMetadata.java`
#### Snippet
```java
    }

    public void storeInLocalRepository(ArtifactRepository localRepository, ArtifactRepository remoteRepository)
            throws RepositoryMetadataStoreException {
        try {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/AbstractRepositoryMetadata.java`
#### Snippet
```java
    }

    public void storeInLocalRepository(ArtifactRepository localRepository, ArtifactRepository remoteRepository)
            throws RepositoryMetadataStoreException {
        try {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/AbstractRepositoryMetadata.java`
#### Snippet
```java
    }

    public ArtifactRepositoryPolicy getPolicy(ArtifactRepository repository) {
        int nature = getNature();
        if ((nature & RepositoryMetadata.RELEASE_OR_SNAPSHOT) == RepositoryMetadata.RELEASE_OR_SNAPSHOT) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/AbstractRepositoryMetadata.java`
#### Snippet
```java
    }

    public ArtifactRepositoryPolicy getPolicy(ArtifactRepository repository) {
        int nature = getNature();
        if ((nature & RepositoryMetadata.RELEASE_OR_SNAPSHOT) == RepositoryMetadata.RELEASE_OR_SNAPSHOT) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/AbstractRepositoryMetadata.java`
#### Snippet
```java
        int nature = getNature();
        if ((nature & RepositoryMetadata.RELEASE_OR_SNAPSHOT) == RepositoryMetadata.RELEASE_OR_SNAPSHOT) {
            ArtifactRepositoryPolicy policy = new ArtifactRepositoryPolicy(repository.getReleases());
            policy.merge(repository.getSnapshots());
            return policy;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/AbstractRepositoryMetadata.java`
#### Snippet
```java
        int nature = getNature();
        if ((nature & RepositoryMetadata.RELEASE_OR_SNAPSHOT) == RepositoryMetadata.RELEASE_OR_SNAPSHOT) {
            ArtifactRepositoryPolicy policy = new ArtifactRepositoryPolicy(repository.getReleases());
            policy.merge(repository.getSnapshots());
            return policy;
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/AbstractRepositoryMetadata.java`
#### Snippet
```java
    }

    public void merge(ArtifactMetadata metadata) {
        // TODO not sure that it should assume this, maybe the calls to addMetadata should pre-merge, then artifact
        // replaces?
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/AbstractRepositoryMetadata.java`
#### Snippet
```java
    }

    protected void updateRepositoryMetadata(ArtifactRepository localRepository, ArtifactRepository remoteRepository)
            throws IOException, XmlPullParserException {
        MetadataXpp3Reader mappingReader = new MetadataXpp3Reader();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/AbstractRepositoryMetadata.java`
#### Snippet
```java
    }

    protected void updateRepositoryMetadata(ArtifactRepository localRepository, ArtifactRepository remoteRepository)
            throws IOException, XmlPullParserException {
        MetadataXpp3Reader mappingReader = new MetadataXpp3Reader();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    private Proxy proxy;

    private List<ArtifactRepository> mirroredRepositories = Collections.emptyList();

    private boolean blocked;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
        }

        ArtifactRepository other = (ArtifactRepository) obj;

        return eq(getId(), other.getId());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
        }

        ArtifactRepository other = (ArtifactRepository) obj;

        return eq(getId(), other.getId());
```

### Deprecation
Overrides deprecated method in 'org.apache.maven.artifact.repository.ArtifactRepository'
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    }

    public boolean isUniqueVersion() {
        return true;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    }

    public ArtifactRepositoryLayout getLayout() {
        return layout;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    }

    public List<ArtifactRepository> getMirroredRepositories() {
        return mirroredRepositories;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    }

    public void setSnapshotUpdatePolicy(ArtifactRepositoryPolicy snapshots) {
        this.snapshots = snapshots;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
            String id,
            String url,
            ArtifactRepositoryLayout layout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
            String url,
            ArtifactRepositoryLayout layout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases) {
        this.id = id;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
            ArtifactRepositoryLayout layout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases) {
        this.id = id;
        this.url = url;
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    }

    public String pathOfRemoteRepositoryMetadata(ArtifactMetadata artifactMetadata) {
        return layout.pathOfRemoteRepositoryMetadata(artifactMetadata);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    }

    public void setReleaseUpdatePolicy(ArtifactRepositoryPolicy releases) {
        this.releases = releases;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    }

    public void setMirroredRepositories(List<ArtifactRepository> mirroredRepositories) {
        if (mirroredRepositories != null) {
            this.mirroredRepositories = Collections.unmodifiableList(mirroredRepositories);
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    private String protocol;

    private ArtifactRepositoryLayout layout;

    private ArtifactRepositoryPolicy snapshots;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    }

    public ArtifactRepositoryPolicy getSnapshots() {
        return snapshots;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    private ArtifactRepositoryLayout layout;

    private ArtifactRepositoryPolicy snapshots;

    private ArtifactRepositoryPolicy releases;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    }

    public ArtifactRepositoryPolicy getReleases() {
        return releases;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    }

    public void setLayout(ArtifactRepositoryLayout layout) {
        this.layout = layout;
    }
```

### Deprecation
'org.apache.maven.artifact.metadata.ArtifactMetadata' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    }

    public String pathOfLocalRepositoryMetadata(ArtifactMetadata metadata, ArtifactRepository repository) {
        return layout.pathOfLocalRepositoryMetadata(metadata, repository);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    }

    public String pathOfLocalRepositoryMetadata(ArtifactMetadata metadata, ArtifactRepository repository) {
        return layout.pathOfLocalRepositoryMetadata(metadata, repository);
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.maven.artifact.repository.ArtifactRepository'
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    }

    public void setBlacklisted(boolean blackListed) {
        // no op
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
 */
// TODO completely separate local and remote artifact repositories
public class MavenArtifactRepository implements ArtifactRepository {
    private static final String LS = System.lineSeparator();

```

### Deprecation
Overrides deprecated method in 'org.apache.maven.artifact.repository.ArtifactRepository'
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    }

    public boolean isBlacklisted() {
        return false;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
    private ArtifactRepositoryPolicy snapshots;

    private ArtifactRepositoryPolicy releases;

    private Authentication authentication;
```

### Deprecation
'getMultiModuleProjectDirectory()' is deprecated
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultSession.java`
#### Snippet
```java
    @Override
    public Path getMultiModuleProjectDirectory() {
        return mavenSession.getRequest().getMultiModuleProjectDirectory().toPath();
    }

```

### Deprecation
'MavenSession(PlexusContainer, RepositorySystemSession, org.apache.maven.execution.MavenExecutionRequest, org.apache.maven.execution.MavenExecutionResult)' is deprecated
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultSession.java`
#### Snippet
```java
        RepositorySystemSession repoSession =
                new DefaultRepositorySystemSession(session).setLocalRepositoryManager(localRepositoryManager);
        MavenSession newSession = new MavenSession(
                mavenSession.getContainer(), repoSession, mavenSession.getRequest(), mavenSession.getResult());
        return new DefaultSession(
```

### Deprecation
'getContainer()' is deprecated
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultSession.java`
#### Snippet
```java
                new DefaultRepositorySystemSession(session).setLocalRepositoryManager(localRepositoryManager);
        MavenSession newSession = new MavenSession(
                mavenSession.getContainer(), repoSession, mavenSession.getRequest(), mavenSession.getResult());
        return new DefaultSession(
                newSession, repositorySystem, repositories, mavenRepositorySystem, container, runtimeInformation);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultSession.java`
#### Snippet
```java
    }

    public ArtifactRepository toArtifactRepository(RemoteRepository repository) {
        if (repository instanceof DefaultRemoteRepository) {
            org.eclipse.aether.repository.RemoteRepository rr = ((DefaultRemoteRepository) repository).getRepository();
```

### Deprecation
'org.apache.maven.settings.building.SettingsSource' is deprecated
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultSettingsBuilder.java`
#### Snippet
```java
    }

    private static class MappedSettingsSource implements SettingsSource {
        private final Source source;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultProjectBuilder.java`
#### Snippet
```java
        DefaultSession session = (DefaultSession) request.getSession();
        try {
            List<ArtifactRepository> repositories = session.toArtifactRepositories(session.getRemoteRepositories());
            ProjectBuildingRequest req = new DefaultProjectBuildingRequest()
                    .setRepositorySession(session.getSession())
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultProjectBuilder.java`
#### Snippet
```java
            } else if (request.getSource().isPresent()) {
                Source source = request.getSource().get();
                ModelSource modelSource = new ModelSource() {
                    @Override
                    public InputStream getInputStream() throws IOException {
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultProjectBuilder.java`
#### Snippet
```java
            } else if (request.getSource().isPresent()) {
                Source source = request.getSource().get();
                ModelSource modelSource = new ModelSource() {
                    @Override
                    public InputStream getInputStream() throws IOException {
```

### Deprecation
'addAttachedArtifact(org.apache.maven.artifact.Artifact)' is deprecated
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultProjectManager.java`
#### Snippet
```java
    public void attachArtifact(Project project, Artifact artifact, Path path) {
        getMavenProject(project)
                .addAttachedArtifact(RepositoryUtils.toArtifact(
                        ((DefaultProject) project).getSession().toArtifact(artifact)));
        artifactManager.setPath(artifact, path);
```

### Deprecation
'addAttachedArtifact(org.apache.maven.artifact.Artifact)' is deprecated
in `maven-core/src/main/java/org/apache/maven/internal/transformation/ConsumerPomArtifactTransformer.java`
#### Snippet
```java
                generatedFile = Files.createTempFile(buildDir, CONSUMER_POM_CLASSIFIER, "pom");
            }
            project.addAttachedArtifact(new ConsumerPomArtifact(project, generatedFile, session));
        } else if (project.getModel().isRoot()) {
            throw new IllegalStateException(
```

### Deprecation
'org.apache.maven.settings.MavenSettingsBuilder' is deprecated
in `maven-core/src/main/java/org/apache/maven/settings/DefaultMavenSettingsBuilder.java`
#### Snippet
```java
    public Settings buildSettings(File userSettingsFile) throws IOException, XmlPullParserException {
        File globalSettingsFile = getFile(
                "${maven.conf}/settings.xml", "maven.conf", MavenSettingsBuilder.ALT_GLOBAL_SETTINGS_XML_LOCATION);

        SettingsBuildingRequest request = new DefaultSettingsBuildingRequest();
```

### Deprecation
'org.apache.maven.settings.MavenSettingsBuilder' is deprecated
in `maven-core/src/main/java/org/apache/maven/settings/DefaultMavenSettingsBuilder.java`
#### Snippet
```java
    public Settings buildSettings() throws IOException, XmlPullParserException {
        File userSettingsFile = getFile(
                "${user.home}/.m2/settings.xml", "user.home", MavenSettingsBuilder.ALT_USER_SETTINGS_XML_LOCATION);

        return buildSettings(userSettingsFile);
```

### Deprecation
'org.apache.maven.settings.MavenSettingsBuilder' is deprecated
in `maven-core/src/main/java/org/apache/maven/settings/DefaultMavenSettingsBuilder.java`
#### Snippet
```java
@Named
@Singleton
public class DefaultMavenSettingsBuilder extends AbstractLogEnabled implements MavenSettingsBuilder {

    private final SettingsBuilder settingsBuilder;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/internal/impl/AbstractSession.java`
#### Snippet
```java
    }

    public abstract ArtifactRepository toArtifactRepository(RemoteRepository repository);

    public List<org.eclipse.aether.graph.Dependency> toDependencies(Collection<DependencyCoordinate> dependencies) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/internal/impl/AbstractSession.java`
#### Snippet
```java
    }

    public List<ArtifactRepository> toArtifactRepositories(List<RemoteRepository> repositories) {
        return repositories == null
                ? null
```

### Deprecation
'getBaseDirectory()' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequestPopulator.java`
#### Snippet
```java

    private void baseDirectory(MavenExecutionRequest request) {
        if (request.getBaseDirectory() == null && request.getPom() != null) {
            request.setBaseDirectory(request.getPom().getAbsoluteFile().getParentFile());
        }
```

### Deprecation
'setBaseDirectory(java.io.File)' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequestPopulator.java`
#### Snippet
```java
    private void baseDirectory(MavenExecutionRequest request) {
        if (request.getBaseDirectory() == null && request.getPom() != null) {
            request.setBaseDirectory(request.getPom().getAbsoluteFile().getParentFile());
        }
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequestPopulator.java`
#### Snippet
```java
    // ------------------------------------------------------------------------

    private ArtifactRepository createLocalRepository(MavenExecutionRequest request)
            throws MavenExecutionRequestPopulationException {
        String localRepositoryPath = null;
```

### Deprecation
'getDependencyArtifacts()' is deprecated
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/DependencyContext.java`
#### Snippet
```java

    public void synchronizeWithProjectState() {
        lastDependencyArtifacts = project.getDependencyArtifacts();
        lastDependencyArtifactCount = (lastDependencyArtifacts != null) ? lastDependencyArtifacts.size() : 0;
    }
```

### Deprecation
'getDependencyArtifacts()' is deprecated
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/DependencyContext.java`
#### Snippet
```java

    public boolean isResolutionRequiredForCurrentProject() {
        return lastDependencyArtifacts != project.getDependencyArtifacts()
                || (lastDependencyArtifacts != null && lastDependencyArtifactCount != lastDependencyArtifacts.size());
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java

    @Override
    public MavenExecutionRequest addPluginArtifactRepository(ArtifactRepository repository) {
        for (ArtifactRepository repo : getPluginArtifactRepositories()) {
            if (repo.getId() != null && repo.getId().equals(repository.getId())) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    @Override
    public MavenExecutionRequest addPluginArtifactRepository(ArtifactRepository repository) {
        for (ArtifactRepository repo : getPluginArtifactRepositories()) {
            if (repo.getId() != null && repo.getId().equals(repository.getId())) {
                return this;
```

### Deprecation
'overwriteInactiveProjects(java.util.List)' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    public MavenExecutionRequest setExcludedProjects(List<String> excludedProjects) {
        if (excludedProjects != null) {
            this.projectActivation.overwriteInactiveProjects(excludedProjects);
        }

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java

    @Override
    public ArtifactRepository getLocalRepository() {
        return localRepository;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java

    @Override
    public List<ArtifactRepository> getRemoteRepositories() {
        if (remoteRepositories == null) {
            remoteRepositories = new ArrayList<>();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java

    @Override
    public MavenExecutionRequest setRemoteRepositories(List<ArtifactRepository> remoteRepositories) {
        if (remoteRepositories != null) {
            this.remoteRepositories = new ArrayList<>(remoteRepositories);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java

    @Override
    public MavenExecutionRequest setLocalRepository(ArtifactRepository localRepository) {
        this.localRepository = localRepository;

```

### Deprecation
'getInactiveProfiles()' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    @Override
    public List<String> getInactiveProfiles() {
        return this.profileActivation.getInactiveProfiles();
    }

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java

    @Override
    public MavenExecutionRequest addRemoteRepository(ArtifactRepository repository) {
        for (ArtifactRepository repo : getRemoteRepositories()) {
            if (repo.getId() != null && repo.getId().equals(repository.getId())) {
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    @Override
    public MavenExecutionRequest addRemoteRepository(ArtifactRepository repository) {
        for (ArtifactRepository repo : getRemoteRepositories()) {
            if (repo.getId() != null && repo.getId().equals(repository.getId())) {
                return this;
```

### Deprecation
'getSelectedProjects()' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    @Override
    public List<String> getSelectedProjects() {
        return this.projectActivation.getSelectedProjects();
    }

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java

    @Override
    public List<ArtifactRepository> getPluginArtifactRepositories() {
        if (pluginArtifactRepositories == null) {
            pluginArtifactRepositories = new ArrayList<>();
```

### Deprecation
'getActiveProfiles()' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    @Override
    public List<String> getActiveProfiles() {
        return this.profileActivation.getActiveProfiles();
    }

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    private List<ArtifactRepository> remoteRepositories;

    private List<ArtifactRepository> pluginArtifactRepositories;

    private ExecutionListener executionListener;
```

### Deprecation
'overwriteActiveProfiles(java.util.List)' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    public MavenExecutionRequest setActiveProfiles(List<String> activeProfiles) {
        if (activeProfiles != null) {
            this.profileActivation.overwriteActiveProfiles(activeProfiles);
        }

```

### Deprecation
'getExcludedProjects()' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    @Override
    public List<String> getExcludedProjects() {
        return this.projectActivation.getExcludedProjects();
    }

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    private WorkspaceReader workspaceReader;

    private ArtifactRepository localRepository;

    private EventSpyDispatcher eventSpyDispatcher;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java

    @Override
    public MavenExecutionRequest setPluginArtifactRepositories(List<ArtifactRepository> pluginArtifactRepositories) {
        if (pluginArtifactRepositories != null) {
            this.pluginArtifactRepositories = new ArrayList<>(pluginArtifactRepositories);
```

### Deprecation
'overwriteInactiveProfiles(java.util.List)' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    public MavenExecutionRequest setInactiveProfiles(List<String> inactiveProfiles) {
        if (inactiveProfiles != null) {
            this.profileActivation.overwriteInactiveProfiles(inactiveProfiles);
        }

```

### Deprecation
'overwriteActiveProjects(java.util.List)' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    public MavenExecutionRequest setSelectedProjects(List<String> selectedProjects) {
        if (selectedProjects != null) {
            this.projectActivation.overwriteActiveProjects(selectedProjects);
        }

```

### Deprecation
'getBaseDirectory()' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
        copy.setUserToolchainsFile(original.getUserToolchainsFile());
        copy.setGlobalToolchainsFile(original.getGlobalToolchainsFile());
        copy.setBaseDirectory((original.getBaseDirectory() != null) ? new File(original.getBaseDirectory()) : null);
        copy.setGoals(original.getGoals());
        copy.setRecursive(original.isRecursive());
```

### Deprecation
'getBaseDirectory()' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
        copy.setUserToolchainsFile(original.getUserToolchainsFile());
        copy.setGlobalToolchainsFile(original.getGlobalToolchainsFile());
        copy.setBaseDirectory((original.getBaseDirectory() != null) ? new File(original.getBaseDirectory()) : null);
        copy.setGoals(original.getGoals());
        copy.setRecursive(original.isRecursive());
```

### Deprecation
'getActiveProfiles()' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
        copy.setUserProperties(original.getUserProperties());
        copy.setShowErrors(original.isShowErrors());
        copy.setActiveProfiles(original.getActiveProfiles());
        copy.setInactiveProfiles(original.getInactiveProfiles());
        copy.setTransferListener(original.getTransferListener());
```

### Deprecation
'getInactiveProfiles()' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
        copy.setShowErrors(original.isShowErrors());
        copy.setActiveProfiles(original.getActiveProfiles());
        copy.setInactiveProfiles(original.getInactiveProfiles());
        copy.setTransferListener(original.getTransferListener());
        copy.setLoggingLevel(original.getLoggingLevel());
```

### Deprecation
'isUseLegacyLocalRepository()' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
        copy.setNoSnapshotUpdates(original.isNoSnapshotUpdates());
        copy.setExecutionListener(original.getExecutionListener());
        copy.setUseLegacyLocalRepository(original.isUseLegacyLocalRepository());
        copy.setBuilderId(original.getBuilderId());
        return copy;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    private boolean updateSnapshots = false;

    private List<ArtifactRepository> remoteRepositories;

    private List<ArtifactRepository> pluginArtifactRepositories;
```

### Deprecation
'getExecutionRootDirectory()' is deprecated
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleStarter.java`
#### Snippet
```java
            if (buildExecutionRequiresProject(session) && projectIsNotPresent(session)) {
                throw new MissingProjectException("The goal you specified requires a project to execute"
                        + " but there is no POM in this directory (" + session.getExecutionRootDirectory() + ")."
                        + " Please verify you invoked Maven from the correct directory.");
            }
```

### Deprecation
'getDependencyArtifacts()' is deprecated
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleDependencyResolver.java`
#### Snippet
```java
            }

            if (project.getDependencyArtifacts() == null) {
                try {
                    project.setDependencyArtifacts(artifactFactory.createArtifacts(project));
```

### Deprecation
'setDependencyArtifacts(java.util.Set)' is deprecated
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleDependencyResolver.java`
#### Snippet
```java
            if (project.getDependencyArtifacts() == null) {
                try {
                    project.setDependencyArtifacts(artifactFactory.createArtifacts(project));
                } catch (InvalidDependencyVersionException e) {
                    throw new LifecycleExecutionException(e);
```

### Deprecation
'getDependencyArtifacts()' is deprecated
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleDependencyResolver.java`
#### Snippet
```java
            project.setResolvedArtifacts(resolvedArtifacts);

            for (Artifact artifact : project.getDependencyArtifacts()) {
                if (artifact.getFile() == null) {
                    Artifact resolved = map.get(artifact.getDependencyConflictId());
```

### Deprecation
'getExecutionRootDirectory()' is deprecated
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/MojoExecutor.java`
#### Snippet
```java
            Throwable cause = new MissingProjectException(
                    "Goal requires a project to execute" + " but there is no POM in this directory ("
                            + session.getExecutionRootDirectory() + ")."
                            + " Please verify you invoked Maven from the correct directory.");
            throw new LifecycleExecutionException(mojoExecution, null, cause);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java
    //
    void publish(
            ArtifactRepository repository, File source, String remotePath, ArtifactTransferListener transferListener)
            throws ArtifactTransferFailedException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java
     * @param proxies The available proxies, may be {@code null}.
     */
    void injectProxy(List<ArtifactRepository> repositories, List<org.apache.maven.settings.Proxy> proxies);

    /**
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java
    ArtifactRepository createDefaultLocalRepository() throws InvalidRepositoryException;

    ArtifactRepository createLocalRepository(File localRepository) throws InvalidRepositoryException;

    ArtifactRepository createArtifactRepository(
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java

    void retrieve(
            ArtifactRepository repository,
            File destination,
            String remotePath,
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java
    void injectMirror(RepositorySystemSession session, List<ArtifactRepository> repositories);

    void injectProxy(RepositorySystemSession session, List<ArtifactRepository> repositories);

    void injectAuthentication(RepositorySystemSession session, List<ArtifactRepository> repositories);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java
     * @param mirrors The available mirrors, may be {@code null}.
     */
    void injectMirror(List<ArtifactRepository> repositories, List<Mirror> mirrors);

    /**
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java
     * @param servers The available servers, may be {@code null}.
     */
    void injectAuthentication(List<ArtifactRepository> repositories, List<Server> servers);

    void injectMirror(RepositorySystemSession session, List<ArtifactRepository> repositories);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java
     * @return The effective repositories or {@code null} if the input was {@code null}.
     */
    List<ArtifactRepository> getEffectiveRepositories(List<ArtifactRepository> repositories);

    /**
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java
     * @return The effective repositories or {@code null} if the input was {@code null}.
     */
    List<ArtifactRepository> getEffectiveRepositories(List<ArtifactRepository> repositories);

    /**
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java
    void injectProxy(RepositorySystemSession session, List<ArtifactRepository> repositories);

    void injectAuthentication(RepositorySystemSession session, List<ArtifactRepository> repositories);

    ArtifactResolutionResult resolve(ArtifactResolutionRequest request);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java
    ArtifactRepository buildArtifactRepository(Repository repository) throws InvalidRepositoryException;

    ArtifactRepository createDefaultRemoteRepository() throws InvalidRepositoryException;

    ArtifactRepository createDefaultLocalRepository() throws InvalidRepositoryException;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java
    Artifact createDependencyArtifact(Dependency dependency);

    ArtifactRepository buildArtifactRepository(Repository repository) throws InvalidRepositoryException;

    ArtifactRepository createDefaultRemoteRepository() throws InvalidRepositoryException;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java
    ArtifactRepository createDefaultRemoteRepository() throws InvalidRepositoryException;

    ArtifactRepository createDefaultLocalRepository() throws InvalidRepositoryException;

    ArtifactRepository createLocalRepository(File localRepository) throws InvalidRepositoryException;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java
    void injectAuthentication(List<ArtifactRepository> repositories, List<Server> servers);

    void injectMirror(RepositorySystemSession session, List<ArtifactRepository> repositories);

    void injectProxy(RepositorySystemSession session, List<ArtifactRepository> repositories);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java
    ArtifactRepository createLocalRepository(File localRepository) throws InvalidRepositoryException;

    ArtifactRepository createArtifactRepository(
            String id,
            String url,
```

### Deprecation
'org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java
            String id,
            String url,
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java
            String url,
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java
            ArtifactRepositoryLayout repositoryLayout,
            ArtifactRepositoryPolicy snapshots,
            ArtifactRepositoryPolicy releases);

    /**
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java`
#### Snippet
```java
     * @return The mirror specification for the repository or {@code null} if no mirror matched.
     */
    Mirror getMirror(ArtifactRepository repository, List<Mirror> mirrors);

    /**
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/DefaultMetadataResolutionRequest.java`
#### Snippet
```java
    }

    public ArtifactRepository getLocalRepository() {
        return repositoryRequest.getLocalRepository();
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/DefaultMetadataResolutionRequest.java`
#### Snippet
```java
    }

    public DefaultMetadataResolutionRequest setLocalRepository(ArtifactRepository localRepository) {
        repositoryRequest.setLocalRepository(localRepository);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/DefaultMetadataResolutionRequest.java`
#### Snippet
```java
    }

    public DefaultMetadataResolutionRequest setRemoteRepositories(List<ArtifactRepository> remoteRepositories) {
        repositoryRequest.setRemoteRepositories(remoteRepositories);

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/DefaultMetadataResolutionRequest.java`
#### Snippet
```java
    }

    public List<ArtifactRepository> getRemoteRepositories() {
        return repositoryRequest.getRemoteRepositories();
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/ResolutionGroup.java`
#### Snippet
```java
    }

    public List<ArtifactRepository> getResolutionRepositories() {
        return resolutionRepositories;
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/ResolutionGroup.java`
#### Snippet
```java
    private final Set<Artifact> artifacts;

    private final List<ArtifactRepository> resolutionRepositories;

    private final Artifact pomArtifact;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/ResolutionGroup.java`
#### Snippet
```java

    public ResolutionGroup(
            Artifact pomArtifact, Set<Artifact> artifacts, List<ArtifactRepository> resolutionRepositories) {
        this(pomArtifact, null, artifacts, null, resolutionRepositories);
    }
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/ResolutionGroup.java`
#### Snippet
```java
            Set<Artifact> artifacts,
            Map<String, Artifact> managedVersions,
            List<ArtifactRepository> resolutionRepositories) {
        this.pomArtifact = pomArtifact;
        this.relocatedArtifact = relocatedArtifact;
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/MetadataResolutionRequest.java`
#### Snippet
```java
     * @return The remote repositories to use for the resolution, never {@code null}.
     */
    List<ArtifactRepository> getRemoteRepositories();

    /**
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/MetadataResolutionRequest.java`
#### Snippet
```java
     * @return This request, never {@code null}.
     */
    MetadataResolutionRequest setRemoteRepositories(List<ArtifactRepository> remoteRepositories);

    /**
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/MetadataResolutionRequest.java`
#### Snippet
```java
     * @return This request, never {@code null}.
     */
    MetadataResolutionRequest setLocalRepository(ArtifactRepository localRepository);

    /**
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/MetadataResolutionRequest.java`
#### Snippet
```java
     * @return The local repository to use for the resolution or {@code null} if not set.
     */
    ArtifactRepository getLocalRepository();

    /**
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/ArtifactMetadataSource.java`
#### Snippet
```java
     */
    List<ArtifactVersion> retrieveAvailableVersionsFromDeploymentRepository(
            Artifact artifact, ArtifactRepository localRepository, ArtifactRepository remoteRepository)
            throws ArtifactMetadataRetrievalException;
}
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/ArtifactMetadataSource.java`
#### Snippet
```java
     */
    List<ArtifactVersion> retrieveAvailableVersionsFromDeploymentRepository(
            Artifact artifact, ArtifactRepository localRepository, ArtifactRepository remoteRepository)
            throws ArtifactMetadataRetrievalException;
}
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/ArtifactMetadataSource.java`
#### Snippet
```java

    ResolutionGroup retrieve(
            Artifact artifact, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories)
            throws ArtifactMetadataRetrievalException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/ArtifactMetadataSource.java`
#### Snippet
```java

    ResolutionGroup retrieve(
            Artifact artifact, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories)
            throws ArtifactMetadataRetrievalException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/ArtifactMetadataSource.java`
#### Snippet
```java
     *                           <code>artifactFactory.createProjectArtifact( "org.apache.maven", "maven", "" )</code>
     * @param localRepository    local repository
     * @param remoteRepositories remote repositories, {@link List} $lt; {@link ArtifactRepository} &gt;
     * @return {@link List} $lt; {@link ArtifactVersion} &gt;
     * @throws ArtifactMetadataRetrievalException
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/ArtifactMetadataSource.java`
#### Snippet
```java
     */
    List<ArtifactVersion> retrieveAvailableVersions(
            Artifact artifact, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories)
            throws ArtifactMetadataRetrievalException;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/ArtifactMetadataSource.java`
#### Snippet
```java
     */
    List<ArtifactVersion> retrieveAvailableVersions(
            Artifact artifact, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepositories)
            throws ArtifactMetadataRetrievalException;

```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ArtifactModelSource.java`
#### Snippet
```java
 * @since 4.0.0
 */
public class ArtifactModelSource extends FileSource implements ModelSource {
    private final String groupId;

```

### Deprecation
'setRawModel(Model)' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FilterModelBuildingRequest.java`
#### Snippet
```java
    @Override
    public ModelBuildingRequest setRawModel(Model rawModel) {
        request.setRawModel(rawModel);
        return this;
    }
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FilterModelBuildingRequest.java`
#### Snippet
```java

    @Override
    public FilterModelBuildingRequest setModelSource(ModelSource modelSource) {
        request.setModelSource(modelSource);

```

### Deprecation
'getRawModel()' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FilterModelBuildingRequest.java`
#### Snippet
```java
    @Override
    public Model getRawModel() {
        return request.getRawModel();
    }

```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/FilterModelBuildingRequest.java`
#### Snippet
```java

    @Override
    public ModelSource getModelSource() {
        return request.getModelSource();
    }
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelBuildingRequest.java`
#### Snippet
```java

    /**
     * Sets the source of the POM to process. Eventually, either {@link #setModelSource(ModelSource)} or
     * {@link #setPomFile(File)} must be set.
     *
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelBuildingRequest.java`
#### Snippet
```java
     * @return This request, never {@code null}.
     */
    ModelBuildingRequest setModelSource(ModelSource modelSource);

    /**
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelBuildingRequest.java`
#### Snippet
```java
     * @return The source of the POM or {@code null} if not set.
     */
    ModelSource getModelSource();

    /**
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelBuildingRequest.java`
#### Snippet
```java
     * the model builder operate in project mode. This mode is meant for effective models that are employed during the
     * build process of a local project. Hence the effective model will support the notion of a project directory. To
     * build the model for a POM from the repository, use {@link #setModelSource(ModelSource)} in combination with a
     * {@link FileModelSource} instead.
     *
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelSource2.java`
#### Snippet
```java
 * Provides access to the contents of a POM independently of the backing store (e.g. file system, database, memory).
 * <p>
 * Unlike {@link ModelSource}, this interface supports loading of parent POM(s) from the same backing store and allows
 * construction of MavenProject instances without the need to have parent POM(s) available from local or remote
 * repositories.
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelSource2.java`
#### Snippet
```java
 * that the connection to the backing store remains active until request's {@link ModelCache} is discarded or flushed.
 */
public interface ModelSource2 extends ModelSource {
    /**
     * Returns model source identified by a path relative to this model source POM. Implementation <strong>MUST</strong>
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingRequest.java`
#### Snippet
```java
    private File pomFile;

    private ModelSource modelSource;

    private int validationLevel = VALIDATION_LEVEL_STRICT;
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingRequest.java`
#### Snippet
```java

    @Override
    public DefaultModelBuildingRequest setModelSource(ModelSource modelSource) {
        this.modelSource = modelSource;

```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingRequest.java`
#### Snippet
```java

    @Override
    public synchronized ModelSource getModelSource() {
        if (modelSource == null && pomFile != null) {
            modelSource = new FileModelSource(pomFile);
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/ModelResolver.java`
#### Snippet
```java
    ModelResolver newCopy();

    default ModelSource resolveModel(Parent parent, AtomicReference<Parent> modified)
            throws UnresolvableModelException {
        org.apache.maven.model.Parent p = new org.apache.maven.model.Parent(parent);
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/ModelResolver.java`
#### Snippet
```java
            throws UnresolvableModelException {
        org.apache.maven.model.Parent p = new org.apache.maven.model.Parent(parent);
        ModelSource result = resolveModel(p);
        if (p.getDelegate() != parent) {
            modified.set(p.getDelegate());
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/ModelResolver.java`
#### Snippet
```java
     * @see Parent#clone()
     */
    ModelSource resolveModel(org.apache.maven.model.Parent parent) throws UnresolvableModelException;

    /**
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/ModelResolver.java`
#### Snippet
```java
     * @throws UnresolvableModelException If the POM could not be resolved from any configured repository.
     */
    ModelSource resolveModel(String groupId, String artifactId, String version) throws UnresolvableModelException;

    /**
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/ModelResolver.java`
#### Snippet
```java
    }

    default ModelSource resolveModel(Dependency dependency, AtomicReference<Dependency> modified)
            throws UnresolvableModelException {
        org.apache.maven.model.Dependency d = new org.apache.maven.model.Dependency(dependency);
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/ModelResolver.java`
#### Snippet
```java
            throws UnresolvableModelException {
        org.apache.maven.model.Dependency d = new org.apache.maven.model.Dependency(dependency);
        ModelSource result = resolveModel(d);
        if (d.getDelegate() != dependency) {
            modified.set(d.getDelegate());
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/ModelResolver.java`
#### Snippet
```java
     * @see Dependency#clone()
     */
    ModelSource resolveModel(org.apache.maven.model.Dependency dependency) throws UnresolvableModelException;

    /**
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
        // no workspace resolver or workspace resolver returned null (i.e. model not in workspace)
        if (importModel == null) {
            final ModelSource importSource;
            try {
                importSource = modelResolver.resolveModel(dependency);
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
                        ModelProblemUtils.toSourceHint(childModel)));

        ModelSource modelSource;
        try {
            modelSource = modelResolver.resolveModel(parent);
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
    }

    private ModelSource getParentPomFile(Model childModel, Source source) {
        if (!(source instanceof ModelSource2)) {
            return null;
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
    private Model readFileModel(ModelBuildingRequest request, DefaultModelProblemCollector problems)
            throws ModelBuildingException {
        ModelSource modelSource = request.getModelSource();
        org.apache.maven.api.model.Model model = fromCache(request.getModelCache(), modelSource, ModelCacheTag.FILE);
        if (model == null) {
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
                        try {
                            ModelBuildingRequest gaBuildingRequest =
                                    new DefaultModelBuildingRequest(request).setModelSource((ModelSource) source);
                            Model model = readRawModel(gaBuildingRequest, problems);
                            if (source instanceof FileModelSource) {
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
            throws ModelBuildingException {
        final Parent parent = childModel.getParent();
        final ModelSource candidateSource;
        final Model candidateModel;
        final WorkspaceModelResolver resolver = request.getWorkspaceModelResolver();
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
    @SuppressWarnings("checkstyle:methodlength")
    private org.apache.maven.api.model.Model doReadFileModel(
            ModelSource modelSource, ModelBuildingRequest request, DefaultModelProblemCollector problems)
            throws ModelBuildingException {
        org.apache.maven.api.model.Model model;
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
    private Model readRawModel(ModelBuildingRequest request, DefaultModelProblemCollector problems)
            throws ModelBuildingException {
        ModelSource modelSource = request.getModelSource();

        ModelData cachedData = fromCache(request.getModelCache(), modelSource, ModelCacheTag.RAW);
```

### Deprecation
'getActiveProfiles()' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/MavenSession.java`
#### Snippet
```java
                        .map(SettingsUtilsV4::convertToSettingsProfile)
                        .collect(Collectors.toList()))
                .activeProfiles(request.getActiveProfiles())
                .pluginGroups(request.getPluginGroups())
                .build());
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/MavenSession.java`
#### Snippet
```java
    }

    public ArtifactRepository getLocalRepository() {
        return request.getLocalRepository();
    }
```

### Deprecation
'setActiveProfiles(java.util.List)' is deprecated
in `maven-embedder/src/main/java/org/apache/maven/cli/configuration/SettingsXmlConfigurationProcessor.java`
#### Snippet
```java
        }

        request.setActiveProfiles(settings.getActiveProfiles());

        for (Profile rawProfile : settings.getProfiles()) {
```

### Deprecation
'setBaseDirectory(java.io.File)' is deprecated
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
        enableOnPresentOption(commandLine, CLIManager.UPDATE_SNAPSHOTS, request::setUpdateSnapshots);
        request.setGlobalChecksumPolicy(determineGlobalCheckPolicy(commandLine));
        request.setBaseDirectory(baseDirectory);
        request.setSystemProperties(cliRequest.systemProperties);
        request.setUserProperties(cliRequest.userProperties);
```

### Deprecation
'setMultiModuleProjectDirectory(java.io.File)' is deprecated
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
        request.setSystemProperties(cliRequest.systemProperties);
        request.setUserProperties(cliRequest.userProperties);
        request.setMultiModuleProjectDirectory(cliRequest.multiModuleProjectDirectory);
        request.setRootDirectory(cliRequest.rootDirectory);
        request.setTopDirectory(cliRequest.topDirectory);
```

### Deprecation
'setBaseDirectory(java.io.File)' is deprecated
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java

        if ((request.getPom() != null) && (request.getPom().getParentFile() != null)) {
            request.setBaseDirectory(request.getPom().getParentFile());
        }

```

### Deprecation
'DEBUG' is deprecated
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
        // LOG LEVEL
        cliRequest.verbose = cliRequest.commandLine.hasOption(CLIManager.VERBOSE)
                || cliRequest.commandLine.hasOption(CLIManager.DEBUG);
        cliRequest.quiet = !cliRequest.verbose && cliRequest.commandLine.hasOption(CLIManager.QUIET);
        cliRequest.showErrors = cliRequest.verbose || cliRequest.commandLine.hasOption(CLIManager.ERRORS);
```

### Deprecation
'DEBUG' is deprecated
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
        }

        if (cliRequest.commandLine.hasOption(CLIManager.DEBUG)) {
            slf4jLogger.warn("The option '--debug' is deprecated and may be repurposed as Java debug"
                    + " in a future version. Use -X/--verbose instead.");
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
    File getLocalRepositoryPath();

    MavenExecutionRequest setLocalRepository(ArtifactRepository repository);

    ArtifactRepository getLocalRepository();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
    String CHECKSUM_POLICY_FAIL = ArtifactRepositoryPolicy.CHECKSUM_POLICY_FAIL;

    String CHECKSUM_POLICY_WARN = ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN;

    // ----------------------------------------------------------------------
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
    MavenExecutionRequest setRemoteRepositories(List<ArtifactRepository> repositories);

    List<ArtifactRepository> getRemoteRepositories();

    MavenExecutionRequest setPluginArtifactRepositories(List<ArtifactRepository> repositories);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
    MavenExecutionRequest setLocalRepository(ArtifactRepository repository);

    ArtifactRepository getLocalRepository();

    // Interactive
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
    List<ArtifactRepository> getRemoteRepositories();

    MavenExecutionRequest setPluginArtifactRepositories(List<ArtifactRepository> repositories);

    List<ArtifactRepository> getPluginArtifactRepositories();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
    MavenExecutionRequest setGlobalSettingsFile(File globalSettingsFile);

    MavenExecutionRequest addRemoteRepository(ArtifactRepository repository);

    MavenExecutionRequest addPluginArtifactRepository(ArtifactRepository repository);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
     * @return This request, never {@code null}.
     */
    MavenExecutionRequest setRemoteRepositories(List<ArtifactRepository> repositories);

    List<ArtifactRepository> getRemoteRepositories();
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
    MavenExecutionRequest setPluginArtifactRepositories(List<ArtifactRepository> repositories);

    List<ArtifactRepository> getPluginArtifactRepositories();

    MavenExecutionRequest setRepositoryCache(RepositoryCache repositoryCache);
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepository' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
    MavenExecutionRequest addRemoteRepository(ArtifactRepository repository);

    MavenExecutionRequest addPluginArtifactRepository(ArtifactRepository repository);

    /**
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
    // ----------------------------------------------------------------------

    String CHECKSUM_POLICY_FAIL = ArtifactRepositoryPolicy.CHECKSUM_POLICY_FAIL;

    String CHECKSUM_POLICY_WARN = ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN;
```

### Deprecation
'org.apache.maven.settings.building.SettingsSource' is deprecated
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuildingRequest.java`
#### Snippet
```java

    @Override
    public DefaultSettingsBuildingRequest setGlobalSettingsSource(SettingsSource globalSettingsSource) {
        this.globalSettingsSource = globalSettingsSource;

```

### Deprecation
'org.apache.maven.settings.building.SettingsSource' is deprecated
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuildingRequest.java`
#### Snippet
```java

    @Override
    public SettingsSource getGlobalSettingsSource() {
        return globalSettingsSource;
    }
```

### Deprecation
'org.apache.maven.settings.building.SettingsSource' is deprecated
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuildingRequest.java`
#### Snippet
```java
    private SettingsSource globalSettingsSource;

    private SettingsSource userSettingsSource;

    private Properties systemProperties;
```

### Deprecation
'org.apache.maven.settings.building.SettingsSource' is deprecated
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuildingRequest.java`
#### Snippet
```java

    @Override
    public SettingsSource getUserSettingsSource() {
        return userSettingsSource;
    }
```

### Deprecation
'org.apache.maven.settings.building.SettingsSource' is deprecated
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuildingRequest.java`
#### Snippet
```java

    @Override
    public DefaultSettingsBuildingRequest setUserSettingsSource(SettingsSource userSettingsSource) {
        this.userSettingsSource = userSettingsSource;

```

### Deprecation
'org.apache.maven.settings.building.SettingsSource' is deprecated
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuildingRequest.java`
#### Snippet
```java
    private File userSettingsFile;

    private SettingsSource globalSettingsSource;

    private SettingsSource userSettingsSource;
```

### Deprecation
'org.apache.maven.settings.building.SettingsSource' is deprecated
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/SettingsBuildingRequest.java`
#### Snippet
```java
     * @return This request, never {@code null}.
     */
    SettingsBuildingRequest setGlobalSettingsSource(SettingsSource globalSettingsSource);

    /**
```

### Deprecation
'org.apache.maven.settings.building.SettingsSource' is deprecated
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/SettingsBuildingRequest.java`
#### Snippet
```java
     * @return This request, never {@code null}.
     */
    SettingsBuildingRequest setUserSettingsSource(SettingsSource userSettingsSource);

    /**
```

### Deprecation
'org.apache.maven.settings.building.SettingsSource' is deprecated
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/SettingsBuildingRequest.java`
#### Snippet
```java
     * @return The global settings source or {@code null} if none.
     */
    SettingsSource getGlobalSettingsSource();

    /**
```

### Deprecation
'org.apache.maven.settings.building.SettingsSource' is deprecated
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/SettingsBuildingRequest.java`
#### Snippet
```java
     * @return The user settings source or {@code null} if none.
     */
    SettingsSource getUserSettingsSource();

    /**
```

### Deprecation
'org.apache.maven.settings.merge.MavenSettingsMerger' is deprecated
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuilder.java`
#### Snippet
```java
    private SettingsValidator settingsValidator;

    private final MavenSettingsMerger settingsMerger = new MavenSettingsMerger();

    @Inject
```

### Deprecation
'org.apache.maven.settings.merge.MavenSettingsMerger' is deprecated
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuilder.java`
#### Snippet
```java
    private SettingsValidator settingsValidator;

    private final MavenSettingsMerger settingsMerger = new MavenSettingsMerger();

    @Inject
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/ArtifactDescriptorUtils.java`
#### Snippet
```java
    public static RepositoryPolicy toRepositoryPolicy(org.apache.maven.model.RepositoryPolicy policy) {
        boolean enabled = true;
        String checksums = toRepositoryChecksumPolicy(ArtifactRepositoryPolicy.DEFAULT_CHECKSUM_POLICY);
        String updates = RepositoryPolicy.UPDATE_POLICY_DAILY;

```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/ArtifactDescriptorUtils.java`
#### Snippet
```java
    public static String toRepositoryChecksumPolicy(final String artifactRepositoryPolicy) {
        switch (artifactRepositoryPolicy) {
            case ArtifactRepositoryPolicy.CHECKSUM_POLICY_FAIL:
                return RepositoryPolicy.CHECKSUM_POLICY_FAIL;
            case ArtifactRepositoryPolicy.CHECKSUM_POLICY_IGNORE:
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/ArtifactDescriptorUtils.java`
#### Snippet
```java
            case ArtifactRepositoryPolicy.CHECKSUM_POLICY_FAIL:
                return RepositoryPolicy.CHECKSUM_POLICY_FAIL;
            case ArtifactRepositoryPolicy.CHECKSUM_POLICY_IGNORE:
                return RepositoryPolicy.CHECKSUM_POLICY_IGNORE;
            case ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN:
```

### Deprecation
'org.apache.maven.artifact.repository.ArtifactRepositoryPolicy' is deprecated
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/ArtifactDescriptorUtils.java`
#### Snippet
```java
            case ArtifactRepositoryPolicy.CHECKSUM_POLICY_IGNORE:
                return RepositoryPolicy.CHECKSUM_POLICY_IGNORE;
            case ArtifactRepositoryPolicy.CHECKSUM_POLICY_WARN:
                return RepositoryPolicy.CHECKSUM_POLICY_WARN;
            default:
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultModelResolver.java`
#### Snippet
```java

    @Override
    public ModelSource resolveModel(final Parent parent, final AtomicReference<Parent> modified)
            throws UnresolvableModelException {
        try {
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultModelResolver.java`
#### Snippet
```java

    @Override
    public ModelSource resolveModel(String groupId, String artifactId, String version)
            throws UnresolvableModelException {
        Artifact pomArtifact = new DefaultArtifact(groupId, artifactId, "", "pom", version);
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultModelResolver.java`
#### Snippet
```java

    @Override
    public ModelSource resolveModel(org.apache.maven.model.Parent parent) throws UnresolvableModelException {
        AtomicReference<org.apache.maven.api.model.Parent> resolvedParent = new AtomicReference<>();
        ModelSource result = resolveModel(parent.getDelegate(), resolvedParent);
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultModelResolver.java`
#### Snippet
```java
    public ModelSource resolveModel(org.apache.maven.model.Parent parent) throws UnresolvableModelException {
        AtomicReference<org.apache.maven.api.model.Parent> resolvedParent = new AtomicReference<>();
        ModelSource result = resolveModel(parent.getDelegate(), resolvedParent);
        if (resolvedParent.get() != null) {
            parent.setVersion(resolvedParent.get().getVersion());
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultModelResolver.java`
#### Snippet
```java

    @Override
    public ModelSource resolveModel(org.apache.maven.model.Dependency dependency) throws UnresolvableModelException {
        AtomicReference<org.apache.maven.api.model.Dependency> resolvedDependency = new AtomicReference<>();
        ModelSource result = resolveModel(dependency.getDelegate(), resolvedDependency);
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultModelResolver.java`
#### Snippet
```java
    public ModelSource resolveModel(org.apache.maven.model.Dependency dependency) throws UnresolvableModelException {
        AtomicReference<org.apache.maven.api.model.Dependency> resolvedDependency = new AtomicReference<>();
        ModelSource result = resolveModel(dependency.getDelegate(), resolvedDependency);
        if (resolvedDependency.get() != null) {
            dependency.setVersion(resolvedDependency.get().getVersion());
```

### Deprecation
'org.apache.maven.model.building.ModelSource' is deprecated
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultModelResolver.java`
#### Snippet
```java

    @Override
    public ModelSource resolveModel(final Dependency dependency, AtomicReference<Dependency> modified)
            throws UnresolvableModelException {
        try {
```

### Deprecation
'org.apache.maven.plugin.logging.Log' is deprecated
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/AbstractMojo.java`
#### Snippet
```java
public abstract class AbstractMojo implements Mojo, ContextEnabled {
    /** Instance logger */
    private Log log;

    /** Plugin container context */
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `maven-artifact/src/main/java/org/apache/maven/artifact/repository/ArtifactRepositoryPolicy.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder(64);
        buffer.append("{enabled=");
        buffer.append(enabled);
```

### StringBufferReplaceableByString
`StringBuilder path` can be replaced with 'String'
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/layout/FlatRepositoryLayout.java`
#### Snippet
```java

    private String pathOfRepositoryMetadata(String filename) {
        StringBuilder path = new StringBuilder(128);

        path.append(filename);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionRequest.java`
#### Snippet
```java

    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append("REQUEST: ")
                .append("\n")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-core/src/main/java/org/apache/maven/plugin/MojoExecution.java`
#### Snippet
```java

    public String identify() {
        StringBuilder sb = new StringBuilder(256);

        sb.append(executionId);
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `maven-core/src/main/java/org/apache/maven/project/ReactorModelPool.java`
#### Snippet
```java
        @Override
        public String toString() {
            StringBuilder buffer = new StringBuilder(128);
            buffer.append(groupId).append(':').append(artifactId);
            return buffer.toString();
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionRequest.java`
#### Snippet
```java

    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append("REQUEST: ")
                .append(LS)
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    private static String getProjectReferenceId(String groupId, String artifactId, String version) {
        StringBuilder buffer = new StringBuilder(128);
        buffer.append(groupId).append(':').append(artifactId).append(':').append(version);
        return buffer.toString();
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/AbstractRepositoryMetadata.java`
#### Snippet
```java

    public String extendedToString() {
        StringBuilder buffer = new StringBuilder(256);

        buffer.append(LS).append("Repository Metadata").append(LS).append("--------------------------");
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/AbstractArtifactMetadata.java`
#### Snippet
```java

    public String extendedToString() {
        StringBuilder buffer = new StringBuilder(256);

        buffer.append(LS).append("Artifact Metadata").append(LS).append("--------------------------");
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelProblemUtils.java`
#### Snippet
```java
     */
    static String toId(String groupId, String artifactId, String version) {
        StringBuilder buffer = new StringBuilder(128);

        buffer.append((groupId != null && groupId.length() > 0) ? groupId : "[unknown-group-id]");
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `maven-core/src/main/java/org/apache/maven/toolchain/DefaultToolchainManager.java`
#### Snippet
```java
    }

    public static final String getStorageKey(String type) {
        return "toolchain-" + type; // NOI18N
    }
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraph.java`
#### Snippet
```java
    private void init(int nVertices, int nEdges) {
        int nV = nVertices;
        if (nVertices < 1) {
            nV = 1;
        }
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
     */
    public void setResolvedArtifacts(Set<Artifact> artifacts) {
        this.resolvedArtifacts = (artifacts != null) ? artifacts : Collections.<Artifact>emptySet();
        this.artifacts = null;
        this.artifactMap = null;
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java`
#### Snippet
```java
     * <br>
     * E.g: for input
     * <code>http://www.codehaus.org</code> this method will return <code>http</code>
     *
     * @param url the url
```

### JavadocLinkAsPlainText
Link specified as plain text
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/ProjectSegment.java`
#### Snippet
```java
 * <p>
 * There are several issues/discussions regarding how "aggregator" plugins should be handled.
 * Read for instance http://docs.codehaus.org/display/MAVEN/Deterministic+Lifecycle+Planning
 * </p>
 * <p>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `maven-core/src/main/java/org/apache/maven/repository/ArtifactTransferResource.java`
#### Snippet
```java

    /**
     * The base URL of the repository, e.g. "http://repo1.maven.org/maven2/". Unless the URL is unknown, it will be
     * terminated by a trailing slash.
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `maven-core/src/main/java/org/apache/maven/classrealm/DefaultClassRealmManager.java`
#### Snippet
```java
    /**
     * During normal command line build, ClassWorld is loaded by jvm system classloader, which only includes
     * plexus-classworlds jar and possibly javaagent classes, see https://issues.apache.org/jira/browse/MNG-4747.
     * <p>
     * Using ClassWorld to determine plugin/extensions realm parent classloaders gives m2e and integration test harness
```

### JavadocLinkAsPlainText
Link specified as plain text
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/ProfileActivator.java`
#### Snippet
```java
     * Determines whether specified activation method is present in configuration or not. It should help to have AND
     * between activation conditions
     * Need for solving https://issues.apache.org/jira/browse/MNG-4565
     * @param profile The profile whose activation status should be determined, must not be {@code null}.
     * @param context The environmental context used to determine the activation status of the profile, must not be
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/WarningResolutionListener.java`
#### Snippet
```java
 */
public class WarningResolutionListener implements ResolutionListener {
    private Logger logger;

    public WarningResolutionListener(Logger logger) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultGraphConflictResolutionPolicy.java`
#### Snippet
```java
     */
    @Configuration(name = "closer-first", value = "true")
    private boolean closerFirst = true;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultGraphConflictResolutionPolicy.java`
#### Snippet
```java
     */
    @Configuration(name = "newer-first", value = "true")
    private boolean newerFirst = true;

    public MetadataGraphEdge apply(MetadataGraphEdge e1, MetadataGraphEdge e2) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingHelper.java`
#### Snippet
```java
public class DefaultProjectBuildingHelper implements ProjectBuildingHelper {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final PlexusContainer container; // TODO not used? Then remove
    private final ClassRealmManager classRealmManager;
    private final ProjectRealmCache projectRealmCache;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
    private PluginRealmCache pluginRealmCache;
    private PluginDependenciesResolver pluginDependenciesResolver;
    private RuntimeInformation runtimeInformation;
    private ExtensionRealmCache extensionRealmCache;
    private PluginVersionResolver pluginVersionResolver;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultRepositoryFactory.java`
#### Snippet
```java
public class DefaultRepositoryFactory implements RepositoryFactory {

    private final RepositorySystem repositorySystem;

    @Inject
```

### FieldCanBeLocal
Field can be converted to a local variable
in `maven-core/src/main/java/org/apache/maven/lifecycle/DefaultLifecycleExecutor.java`
#### Snippet
```java
    private final MojoExecutor mojoExecutor;
    private final LifecycleStarter lifecycleStarter;
    private final MojoDescriptorCreator mojoDescriptorCreator;

    @Inject
```

### FieldCanBeLocal
Field can be converted to a local variable
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleModuleBuilder.java`
#### Snippet
```java
    private final ProjectExecutionListener projectExecutionListener;
    private final ConsumerPomArtifactTransformer consumerPomArtifactTransformer;
    private final SessionScope sessionScope;

    @Inject
```

### FieldCanBeLocal
Field can be converted to a local variable
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleStarter.java`
#### Snippet
```java
    private final Map<String, Builder> builders;

    private final SessionScope sessionScope;

    @Inject
```

### FieldCanBeLocal
Field can be converted to a local variable
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilderFactory.java`
#### Snippet
```java
    private ModelVersionProcessor versionProcessor;

    private RootLocator rootLocator;

    public DefaultModelBuilderFactory setModelProcessor(ModelProcessor modelProcessor) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `maven-embedder/src/main/java/org/apache/maven/cli/event/ExecutionEventLogger.java`
#### Snippet
```java
    private static final int MAX_PADDED_BUILD_TIME_DURATION_LENGTH = 9;

    private final int terminalWidth;
    private final int lineLength;
    private final int maxProjectNameLength;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `maven-embedder/src/main/java/org/apache/maven/cli/configuration/SettingsXmlConfigurationProcessor.java`
#### Snippet
```java

    private final SettingsBuilder settingsBuilder;
    private final SettingsDecrypter settingsDecrypter;

    @Inject
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
                                    // ignore
                                }
                                file.delete(); // if this fails, forget about it
                            }
                        }
```

### IgnoreResultOfCall
Result of `File.setLastModified()` is ignored
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
                // touch file so that this is not checked again until interval has passed
                if (file.exists()) {
                    file.setLastModified(System.currentTimeMillis());
                }
            }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
                        // ignore
                    }
                    file.delete(); // if this fails, forget about it
                }
            }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java

        if (file.exists()) {
            touchfile.delete();
        } else {
            writeLastUpdated(touchfile, getRepositoryKey(repository), error);
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
                File checksumFile = new File(destination + checksumFileExtension);
                if (checksumFile.exists()) {
                    checksumFile.delete(); // ignore if failed as we will overwrite
                }
                FileUtils.copyFile(tempChecksumFile, checksumFile);
```

### IgnoreResultOfCall
Result of `File.setLastModified()` is ignored
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
                            if (!downloaded) {
                                // prevent additional checks of this artifact until it expires again
                                destination.setLastModified(System.currentTimeMillis());
                            }
                        } catch (UnsupportedOperationException e) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-core/src/main/java/org/apache/maven/DefaultMaven.java`
#### Snippet
```java
        logger.debug("Using local repository at " + localRepoDir);

        localRepoDir.mkdirs();

        if (!localRepoDir.isDirectory()) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/AbstractRepositoryMetadata.java`
#### Snippet
```java
                    // ignore
                }
                metadataFile.delete(); // if this fails, forget about it, we'll try to overwrite it anyway so no need
                // to delete on exit
            }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/AbstractRepositoryMetadata.java`
#### Snippet
```java

        if (changed || !metadataFile.exists()) {
            metadataFile.getParentFile().mkdirs();
            try (Writer writer = WriterFactory.newXmlWriter(metadataFile)) {
                MetadataXpp3Writer mappingWriter = new MetadataXpp3Writer();
```

### IgnoreResultOfCall
Result of `File.setLastModified()` is ignored
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/AbstractRepositoryMetadata.java`
#### Snippet
```java
            }
        } else {
            metadataFile.setLastModified(System.currentTimeMillis());
        }
    }
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/builder/multithreaded/MultiThreadedBuilder.java`
#### Snippet
```java

        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
    }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-model-builder/src/main/java/org/apache/maven/model/io/DefaultModelWriter.java`
#### Snippet
```java
        Objects.requireNonNull(model, "model cannot be null");

        output.getParentFile().mkdirs();

        write(WriterFactory.newXmlWriter(output), options, model);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-settings-builder/src/main/java/org/apache/maven/settings/io/DefaultSettingsWriter.java`
#### Snippet
```java
        Objects.requireNonNull(settings, "settings cannot be null");

        output.getParentFile().mkdirs();

        write(WriterFactory.newXmlWriter(output), options, settings);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/MavenMetadata.java`
#### Snippet
```java

    private void write(File metadataFile, Metadata metadata) throws RepositoryException {
        metadataFile.getParentFile().mkdirs();
        try (Writer writer = WriterFactory.newXmlWriter(metadataFile)) {
            new MetadataXpp3Writer().write(writer, metadata);
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import static java.util.stream.Collectors.toMap;`
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/DefaultProfileActivationContext.java`
#### Snippet
```java
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

/**
```

## RuleId[id=ReturnFromFinallyBlock]
### ReturnFromFinallyBlock
'return' inside 'finally' block
in `maven-core/src/main/java/org/apache/maven/DefaultMaven.java`
#### Snippet
```java
                afterSessionEnd(session.getProjects(), session);
            } catch (MavenExecutionException e) {
                return addExceptionToResult(result, e);
            }
        }
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `errorArtifactExceptions` are queried, but never updated
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionResult.java`
#### Snippet
```java
    private List<CyclicDependencyException> circularDependencyExceptions;

    private List<ArtifactResolutionException> errorArtifactExceptions;

    // file system errors
```

### MismatchedCollectionQueryUpdate
Contents of collection `repositoryLayouts` are queried, but never updated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java

    @Requirement(role = ArtifactRepositoryLayout.class)
    private Map<String, ArtifactRepositoryLayout> repositoryLayouts;

    public ArtifactRepositoryLayout getLayout(String layoutId) throws UnknownRepositoryLayoutException {
```

### MismatchedCollectionQueryUpdate
Contents of collection `visited` are queried, but never updated
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultClasspathTransformation.java`
#### Snippet
```java
        ClasspathContainer cpc;

        List<MetadataGraphVertex> visited;

        // -----------------------------------------------------------------------
```

### MismatchedCollectionQueryUpdate
Contents of collection `layouts` are queried, but never updated
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java

    @Requirement(role = ArtifactRepositoryLayout.class)
    private Map<String, ArtifactRepositoryLayout> layouts;

    @Requirement
```

### MismatchedCollectionQueryUpdate
Contents of collection `lifecycles` are queried, but never updated
in `maven-core/src/main/java/org/apache/maven/lifecycle/mapping/DefaultLifecycleMapping.java`
#### Snippet
```java
public class DefaultLifecycleMapping implements LifecycleMapping {

    private List<Lifecycle> lifecycles;

    private Map<String, Lifecycle> lifecycleMap;
```

## RuleId[id=ConfusingMainMethod]
### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
    }

    public static int main(String[] args, ClassWorld classWorld) {
        MavenCli cli = new MavenCli();

```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public synchronized void loadFromXML(InputStream in) throws IOException, InvalidPropertiesFormatException {
        throw new UnsupportedOperationException();
    }
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java

    @Override
    public synchronized void loadFromXML(InputStream in) throws IOException, InvalidPropertiesFormatException {
        throw new UnsupportedOperationException();
    }
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java

    @Override
    public synchronized void loadFromXML(InputStream in) throws IOException, InvalidPropertiesFormatException {
        throw new UnsupportedOperationException();
    }
```

## RuleId[id=InfiniteRecursion]
### InfiniteRecursion
Method `mergeModelBase()` recurses infinitely, and can only end by throwing an exception
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/DefaultProfileInjector.java`
#### Snippet
```java
    protected static class ProfileModelMerger extends MavenModelMerger {

        public void mergeModelBase(ModelBase.Builder builder, ModelBase target, ModelBase source) {
            mergeModelBase(builder, target, source, true, Collections.emptyMap());
        }
```

### InfiniteRecursion
Method `mergeBuildBase()` recurses infinitely, and can only end by throwing an exception
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/DefaultProfileInjector.java`
#### Snippet
```java
        }

        public void mergeBuildBase(BuildBase.Builder builder, BuildBase target, BuildBase source) {
            mergeBuildBase(builder, target, source, true, Collections.emptyMap());
        }
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `maven-core/src/main/java/org/apache/maven/internal/aether/ReverseTreeRepositoryListener.java`
#### Snippet
```java
                while (iter.hasPrevious()) {
                    DependencyNode curr = iter.previous();
                    indent += "  ";
                    trackingData.add(indent + curr + " (" + collectStepTrace.getContext() + ")");
                }
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/MojoDescriptorCreator.java`
#### Snippet
```java
            // This won't be valid, but it constructs something easy to read in the error message
            while (tok.hasMoreTokens()) {
                goal += ":" + tok.nextToken();
            }
        } else if (numTokens == 3) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `type` initializer `"jar"` is redundant
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/filter/TypeArtifactFilter.java`
#### Snippet
```java
/** Artifact Filter which filters on artifact type */
public class TypeArtifactFilter implements ArtifactFilter {
    private String type = "jar";

    public TypeArtifactFilter(String type) {
```

### UnusedAssignment
Variable `resolved` initializer `true` is redundant
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraphEdge.java`
#### Snippet
```java
    int depth = -1;
    int pomOrder = -1;
    boolean resolved = true;
    String artifactUri;

```

### UnusedAssignment
Variable `depth` initializer `-1` is redundant
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraphEdge.java`
#### Snippet
```java
    String version;
    ArtifactScopeEnum scope;
    int depth = -1;
    int pomOrder = -1;
    boolean resolved = true;
```

### UnusedAssignment
Variable `pomOrder` initializer `-1` is redundant
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraphEdge.java`
#### Snippet
```java
    ArtifactScopeEnum scope;
    int depth = -1;
    int pomOrder = -1;
    boolean resolved = true;
    String artifactUri;
```

### UnusedAssignment
The value changed at `i++` is never used
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java

                    md5ChecksumObserver = addChecksumObserver(wagon, CHECKSUM_ALGORITHMS[i++]);
                    sha1ChecksumObserver = addChecksumObserver(wagon, CHECKSUM_ALGORITHMS[i++]);

                    // reset the retry flag.
```

### UnusedAssignment
The value changed at `pos++` is never used
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/ReactorDependencyXMLFilter.java`
#### Snippet
```java
                    e.namespace = buffer.get(0).namespace;
                    e.prefix = buffer.get(0).prefix;
                    buffer.add(pos++, e);
                }
                break;
```

### UnusedAssignment
The value changed at `pos++` is never used
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/ParentXMLFilter.java`
#### Snippet
```java
                    e.namespace = buffer.get(0).namespace;
                    e.prefix = buffer.get(0).prefix;
                    buffer.add(pos++, e);
                }
                break;
```

### UnusedAssignment
Variable `isRequirementMet` initializer `false` is redundant
in `maven-core/src/main/java/org/apache/maven/plugin/internal/MavenPluginMavenPrerequisiteChecker.java`
#### Snippet
```java
        String requiredMavenVersion = pluginDescriptor.getRequiredMavenVersion();
        if (StringUtils.isNotBlank(requiredMavenVersion)) {
            boolean isRequirementMet = false;
            try {
                isRequirementMet = runtimeInformation.isMavenVersion(requiredMavenVersion);
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
                results.add(new DefaultProjectBuildingResult(project, result.getProblems(), resolutionResult));
            } catch (ModelBuildingException e) {
                DefaultProjectBuildingResult result = null;
                if (project == null || interimResult.result.getEffectiveModel() == null) {
                    result = new DefaultProjectBuildingResult(e.getModelId(), interimResult.pomFile, e.getProblems());
```

### UnusedAssignment
The value `new InputSource(request.getModelId(), request.getLocation())` assigned to `source` is never used
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultToolchainsXmlFactory.java`
#### Snippet
```java
            InputSource source = null;
            if (request.getModelId() != null || request.getLocation() != null) {
                source = new InputSource(request.getModelId(), request.getLocation());
            }
            MavenToolchainsXpp3Reader xml = new MavenToolchainsXpp3Reader();
```

### UnusedAssignment
Variable `nsee` initializer `new NoSuchElementException(c.getName())` is redundant
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultSession.java`
#### Snippet
```java
            return container.lookup(c);
        } catch (ComponentLookupException e) {
            NoSuchElementException nsee = new NoSuchElementException(c.getName());
            e.initCause(e);
            throw nsee;
```

### UnusedAssignment
The value `new InputSource(request.getModelId(), request.getLocation())` assigned to `source` is never used
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultSettingsXmlFactory.java`
#### Snippet
```java
            InputSource source = null;
            if (request.getModelId() != null || request.getLocation() != null) {
                source = new InputSource(request.getModelId(), request.getLocation());
            }
            SettingsXpp3Reader xml = new SettingsXpp3Reader();
```

### UnusedAssignment
The value `" "` assigned to `indent` is never used
in `maven-core/src/main/java/org/apache/maven/internal/aether/ReverseTreeRepositoryListener.java`
#### Snippet
```java
            if (location != null && location.getSource() != null) {
                trackingData.add(indent + location.getSource().getModelId() + " (implicit)");
                indent += "  ";
            }
        } else if (collectStepTrace != null) {
```

### UnusedAssignment
Variable `reactorContext` initializer `null` is redundant
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleStarter.java`
#### Snippet
```java
        eventCatapult.fire(ExecutionEvent.Type.SessionStarted, session, null);

        ReactorContext reactorContext = null;
        ProjectBuildList projectBuilds = null;
        MavenExecutionResult result = session.getResult();
```

### UnusedAssignment
Variable `projectBuilds` initializer `null` is redundant
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleStarter.java`
#### Snippet
```java

        ReactorContext reactorContext = null;
        ProjectBuildList projectBuilds = null;
        MavenExecutionResult result = session.getResult();

```

### UnusedAssignment
Variable `goal` initializer `null` is redundant
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/MojoDescriptorCreator.java`
#### Snippet
```java
                    MojoNotFoundException, NoPluginFoundForPrefixException, InvalidPluginDescriptorException,
                    PluginVersionResolutionException {
        String goal = null;

        Plugin plugin = null;
```

### UnusedAssignment
Variable `plugin` initializer `null` is redundant
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/MojoDescriptorCreator.java`
#### Snippet
```java
        String goal = null;

        Plugin plugin = null;

        StringTokenizer tok = new StringTokenizer(task, ":");
```

### UnusedAssignment
The value `false` assigned to `addedToBuffer` is never used
in `maven-embedder/src/main/java/org/apache/maven/cli/CleanArgument.java`
#### Snippet
```java

                currentArg = null;
                addedToBuffer = false;
                continue;
            }
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `ret` is always 'true'
in `maven-model/src/main/java/org/apache/maven/model/WrapperList.java`
#### Snippet
```java
            boolean ret = list.add(revMapper.apply(t));
            setter.accept(list);
            return ret;
        } else {
            return getter.get().add(revMapper.apply(t));
```

### ConstantValue
Value `artifactId` is always 'null'
in `maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java`
#### Snippet
```java
        if (artifactId == null) {
            throw new InvalidArtifactRTException(
                    groupId, artifactId, getVersion(), type, "The artifactId cannot be empty.");
        }

```

### ConstantValue
Value `type` is always 'null'
in `maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java`
#### Snippet
```java

        if (type == null) {
            throw new InvalidArtifactRTException(groupId, artifactId, getVersion(), type, "The type cannot be empty.");
        }

```

### ConstantValue
Condition `problems != null` is always `true`
in `maven-toolchain-builder/src/main/java/org/apache/maven/toolchain/building/ToolchainsBuildingException.java`
#### Snippet
```java

        this.problems = new ArrayList<>();
        if (problems != null) {
            this.problems.addAll(problems);
        }
```

### ConstantValue
Value `ret` is always 'true'
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperList.java`
#### Snippet
```java
            boolean ret = list.add(revMapper.apply(t));
            setter.accept(list);
            return ret;
        } else {
            return getter.get().add(revMapper.apply(t));
```

### ConstantValue
Value `lowerInclusive` is always 'true'
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java`
#### Snippet
```java
                        restrictions.add(new Restriction(lower, lowerInclusive, upper, upperInclusive));
                    } else if (lowerInclusive && upperInclusive) {
                        restrictions.add(new Restriction(lower, lowerInclusive, upper, upperInclusive));
                    }

```

### ConstantValue
Value `upperInclusive` is always 'true'
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java`
#### Snippet
```java
                        restrictions.add(new Restriction(lower, lowerInclusive, upper, upperInclusive));
                    } else if (lowerInclusive && upperInclusive) {
                        restrictions.add(new Restriction(lower, lowerInclusive, upper, upperInclusive));
                    }

```

### ConstantValue
Value `lowerBoundInclusive` is always 'true'
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java`
#### Snippet
```java
            ArtifactVersion version = new DefaultArtifactVersion(process);

            restriction = new Restriction(version, lowerBoundInclusive, version, upperBoundInclusive);
        } else {
            String lowerBound = process.substring(0, index).trim();
```

### ConstantValue
Value `upperBoundInclusive` is always 'true'
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java`
#### Snippet
```java
            ArtifactVersion version = new DefaultArtifactVersion(process);

            restriction = new Restriction(version, lowerBoundInclusive, version, upperBoundInclusive);
        } else {
            String lowerBound = process.substring(0, index).trim();
```

### ConstantValue
Value `l` is always 'null'
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java

                        // if this is shorter, then invert the compare and mul with -1
                        int result = l == null ? (r == null ? 0 : -1 * r.compareTo(l)) : l.compareTo(r);

                        if (result != 0) {
```

### ConstantValue
Condition `normalized` is always `false`
in `maven-compat/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java`
#### Snippet
```java
            }

            if (normalized) {
                return repos;
            }
```

### ConstantValue
Value `value` is always 'null'
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/StringSearchModelInterpolator.java`
#### Snippet
```java
                                            } else {
                                                // add the null back in...not sure what else to do...
                                                c.add(value);
                                            }
                                        }
```

### ConstantValue
Value `setRepository` is always 'false'
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
                    getLogger().warn(e.getMessage());
                }
                return setRepository;
            }

```

### ConstantValue
Condition `retry` is always `false` when reached
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
            // is set on the first run, it will be turned off and not re-set on the second try. This is because the
            // only way the retry flag can be set is if ( firstRun == true ).
            while (firstRun || retry) {
                ChecksumObserver md5ChecksumObserver = null;
                ChecksumObserver sha1ChecksumObserver = null;
```

### ConstantValue
Condition `tfe != null` is always `false`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
        // if it already exists locally we were just trying to force it - ignore the update
        if (!artifact.getFile().exists()) {
            if (tfe != null) {
                throw tfe;
            } else {
```

### ConstantValue
Value `orgParser` is always 'null'
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/RawToConsumerPomXMLFilterFactory.java`
#### Snippet
```java
    public final XmlPullParser get(XmlPullParser orgParser, Path projectPath) {
        // Ensure that xs:any elements aren't touched by next filters
        XmlPullParser parser = orgParser instanceof FastForwardFilter ? orgParser : new FastForwardFilter(orgParser);

        parser = buildPomXMLFilterFactory.get(parser, projectPath);
```

### ConstantValue
Value `orgParser` is always 'null'
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/BuildToRawPomXMLFilterFactory.java`
#### Snippet
```java

        // Ensure that xs:any elements aren't touched by next filters
        XmlPullParser parser = orgParser instanceof FastForwardFilter ? orgParser : new FastForwardFilter(orgParser);

        if (getDependencyKeyToVersionMapper() != null) {
```

### ConstantValue
Value `ret` is always 'true'
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperList.java`
#### Snippet
```java
            boolean ret = list.add(revMapper.apply(t));
            setter.accept(list);
            return ret;
        } else {
            return getter.get().add(revMapper.apply(t));
```

### ConstantValue
Value `transitive` is always 'true'
in `maven-core/src/main/java/org/apache/maven/graph/DefaultProjectDependencyGraph.java`
#### Snippet
```java
        for (String id : sorter.getDependents(projectId)) {
            if (projectIds.add(id) && transitive) {
                getDownstreamProjects(id, projectIds, transitive);
            }
        }
```

### ConstantValue
Value `transitive` is always 'true'
in `maven-core/src/main/java/org/apache/maven/graph/DefaultProjectDependencyGraph.java`
#### Snippet
```java
        for (String id : sorter.getDependencies(projectId)) {
            if (projectIds.add(id) && transitive) {
                getUpstreamProjects(id, projectIds, transitive);
            }
        }
```

### ConstantValue
Value `mojo` is always 'null'
in `maven-core/src/main/java/org/apache/maven/plugin/DefaultBuildPluginManager.java`
#### Snippet
```java
        } catch (PluginContainerException e) {
            mojoExecutionListener.afterExecutionFailure(
                    new MojoExecutionEvent(session, project, mojoExecution, mojo, e));
            throw new PluginExecutionException(mojoExecution, project, e);
        } catch (NoClassDefFoundError e) {
```

### ConstantValue
Value `pluginArtifact` is always 'null'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultPluginDependenciesResolver.java`
#### Snippet
```java
                            : null;
                    logger.warn("The artifact " + result.getRelocations().get(0) + " has been relocated to "
                            + pluginArtifact + (message != null ? ": " + message : ""));
                }
            }
```

### ConstantValue
Condition `message != null` is always `false`
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultPluginDependenciesResolver.java`
#### Snippet
```java
                            : null;
                    logger.warn("The artifact " + result.getRelocations().get(0) + " has been relocated to "
                            + pluginArtifact + (message != null ? ": " + message : ""));
                }
            }
```

### ConstantValue
Value `recordArtifacts` is always 'null'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
            } catch (PluginResolutionException e) {
                pluginArtifactsCache.put(cacheKey, e);
                pluginArtifactsCache.register(project, cacheKey, recordArtifacts);
                throw new PluginManagerException(plugin, e.getMessage(), e);
            }
```

### ConstantValue
Condition `loc != null` is always `true`
in `maven-core/src/main/java/org/apache/maven/project/collector/DefaultProjectsSelector.java`
#### Snippet
```java
                for (ModelProblem problem : result.getProblems()) {
                    String loc = ModelProblemUtils.formatLocation(problem, result.getProjectId());
                    LOGGER.warn("{}{}", problem.getMessage(), ((loc != null && !loc.isEmpty()) ? " @ " + loc : ""));
                }

```

### ConstantValue
Value `recursive` is always 'true'
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
                    aggregatorFiles,
                    false,
                    recursive,
                    config,
                    poolBuilder)) {
```

### ConstantValue
Condition `repositorySystem != null` is always `true`
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
        // managedVersionMap
        Map<String, Artifact> map = null;
        if (repositorySystem != null) {
            final DependencyManagement dependencyManagement = project.getDependencyManagement();
            if ((dependencyManagement != null)
```

### ConstantValue
Condition `!details.isEmpty()` is always `true`
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultNode.java`
#### Snippet
```java
            buffer.append("(");
            buffer.append(nodeString);
            if (!details.isEmpty()) {
                buffer.append(" - ");
                join(buffer, details, "; ");
```

### ConstantValue
Value `outputStream` is always 'null'
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultModelXmlFactory.java`
#### Snippet
```java
            } else {
                try (OutputStream os = Files.newOutputStream(path)) {
                    new MavenXpp3WriterEx().write(outputStream, content);
                }
            }
```

### ConstantValue
Condition `e instanceof MetadataNotFoundException` is always `true`
in `maven-core/src/main/java/org/apache/maven/internal/aether/LoggingRepositoryListener.java`
#### Snippet
```java
        Exception e = event.getException();
        if (e != null) {
            if (e instanceof MetadataNotFoundException) {
                logger.debug(e.getMessage());
            } else if (logger.isDebugEnabled()) {
```

### ConstantValue
Condition `data instanceof ArtifactDescriptorRequest` is always `false`
in `maven-core/src/main/java/org/apache/maven/internal/aether/ReverseTreeRepositoryListener.java`
#### Snippet
```java
            if (data instanceof CollectStepData) {
                collectStepTrace = (CollectStepData) data;
            } else if (data instanceof ArtifactDescriptorRequest) {
                artifactDescriptorRequest = (ArtifactDescriptorRequest) data;
            } else if (data instanceof ArtifactRequest) {
```

### ConstantValue
Condition `data instanceof ArtifactRequest` is always `false`
in `maven-core/src/main/java/org/apache/maven/internal/aether/ReverseTreeRepositoryListener.java`
#### Snippet
```java
            } else if (data instanceof ArtifactDescriptorRequest) {
                artifactDescriptorRequest = (ArtifactDescriptorRequest) data;
            } else if (data instanceof ArtifactRequest) {
                artifactRequest = (ArtifactRequest) data;
            } else if (data instanceof Plugin) {
```

### ConstantValue
Condition `data instanceof Plugin` is always `false`
in `maven-core/src/main/java/org/apache/maven/internal/aether/ReverseTreeRepositoryListener.java`
#### Snippet
```java
            } else if (data instanceof ArtifactRequest) {
                artifactRequest = (ArtifactRequest) data;
            } else if (data instanceof Plugin) {
                plugin = (Plugin) data;
            }
```

### ConstantValue
Condition `collectStepTrace == null && plugin != null` is always `false`
in `maven-core/src/main/java/org/apache/maven/internal/aether/ReverseTreeRepositoryListener.java`
#### Snippet
```java
        ArrayList<String> trackingData = new ArrayList<>();

        if (collectStepTrace == null && plugin != null) {
            ext = ".plugin";
            baseName = plugin.getGroupId() + "_" + plugin.getArtifactId() + "_" + plugin.getVersion();
```

### ConstantValue
Condition `plugin != null` is always `false` when reached
in `maven-core/src/main/java/org/apache/maven/internal/aether/ReverseTreeRepositoryListener.java`
#### Snippet
```java
        ArrayList<String> trackingData = new ArrayList<>();

        if (collectStepTrace == null && plugin != null) {
            ext = ".plugin";
            baseName = plugin.getGroupId() + "_" + plugin.getArtifactId() + "_" + plugin.getVersion();
```

### ConstantValue
Condition `artifactRequest != null` is always `false`
in `maven-core/src/main/java/org/apache/maven/internal/aether/ReverseTreeRepositoryListener.java`
#### Snippet
```java
            } else {
                List<RemoteRepository> repositories = new ArrayList<>();
                if (artifactRequest != null && artifactRequest.getRepositories() != null) {
                    repositories.addAll(artifactRequest.getRepositories());
                } else if (artifactDescriptorRequest != null && artifactDescriptorRequest.getRepositories() != null) {
```

### ConstantValue
Condition `artifactRequest != null && artifactRequest.getRepositories() != null` is always `false`
in `maven-core/src/main/java/org/apache/maven/internal/aether/ReverseTreeRepositoryListener.java`
#### Snippet
```java
            } else {
                List<RemoteRepository> repositories = new ArrayList<>();
                if (artifactRequest != null && artifactRequest.getRepositories() != null) {
                    repositories.addAll(artifactRequest.getRepositories());
                } else if (artifactDescriptorRequest != null && artifactDescriptorRequest.getRepositories() != null) {
```

### ConstantValue
Condition `artifactDescriptorRequest != null` is always `false`
in `maven-core/src/main/java/org/apache/maven/internal/aether/ReverseTreeRepositoryListener.java`
#### Snippet
```java
                if (artifactRequest != null && artifactRequest.getRepositories() != null) {
                    repositories.addAll(artifactRequest.getRepositories());
                } else if (artifactDescriptorRequest != null && artifactDescriptorRequest.getRepositories() != null) {
                    repositories.addAll(artifactDescriptorRequest.getRepositories());
                }
```

### ConstantValue
Condition `artifactDescriptorRequest != null && artifactDescriptorRequest.getRepositories() != null` is always `false`
in `maven-core/src/main/java/org/apache/maven/internal/aether/ReverseTreeRepositoryListener.java`
#### Snippet
```java
                if (artifactRequest != null && artifactRequest.getRepositories() != null) {
                    repositories.addAll(artifactRequest.getRepositories());
                } else if (artifactDescriptorRequest != null && artifactDescriptorRequest.getRepositories() != null) {
                    repositories.addAll(artifactDescriptorRequest.getRepositories());
                }
```

### ConstantValue
Condition `!repositories.isEmpty()` is always `false`
in `maven-core/src/main/java/org/apache/maven/internal/aether/ReverseTreeRepositoryListener.java`
#### Snippet
```java
                    repositories.addAll(artifactDescriptorRequest.getRepositories());
                }
                if (!repositories.isEmpty()) {
                    trackingData.add("Configured repositories:");
                    for (RemoteRepository r : repositories) {
```

### ConstantValue
Condition `reference == null` is always `false`
in `maven-core/src/main/java/org/apache/maven/exception/DefaultExceptionHandler.java`
#### Snippet
```java
                }

                if (reference == null || reference.isEmpty()) {
                    reference = getReference(cause);
                }
```

### ConstantValue
Condition `message != null` is always `true`
in `maven-core/src/main/java/org/apache/maven/exception/DefaultExceptionHandler.java`
#### Snippet
```java

        if (message2 != null && !message2.isEmpty()) {
            if (message != null && !message.isEmpty()) {
                if (message.endsWith(".") || message.endsWith("!") || message.endsWith(":")) {
                    message += " ";
```

### ConstantValue
Value `recordArtifacts` is always 'null'
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleDependencyResolver.java`
#### Snippet
```java
            } catch (LifecycleExecutionException e) {
                projectArtifactsCache.put(cacheKey, e);
                projectArtifactsCache.register(project, cacheKey, recordArtifacts);
                throw e;
            }
```

### ConstantValue
Value `muxer` is always 'null'
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/builder/multithreaded/MultiThreadedBuilder.java`
#### Snippet
```java
                        new ConcurrencyDependencyGraph(segmentProjectBuilds, session.getProjectDependencyGraph());
                multiThreadedProjectTaskSegmentBuild(
                        analyzer, reactorContext, session, service, taskSegment, projectBuildMap, muxer);
                if (reactorContext.getReactorBuildStatus().isHalted()) {
                    break;
```

### ConstantValue
Value `aggregating` is always 'true'
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/MojoExecutor.java`
#### Snippet
```java
                                scopesToResolve,
                                session,
                                aggregating,
                                Collections.emptySet());
                    }
```

### ConstantValue
Value `classLoader` is always 'null'
in `maven-core/src/main/java/org/apache/maven/classrealm/DefaultClassRealmManager.java`
#### Snippet
```java
            return ((ClassRealm) classLoader).getId();
        }
        return String.valueOf(classLoader);
    }
}
```

### ConstantValue
Condition `configuration instanceof Xpp3Dom` is always `false`
in `maven-core/src/main/java/org/apache/maven/configuration/internal/DefaultBeanConfigurator.java`
#### Snippet
```java
        if (configuration instanceof PlexusConfiguration) {
            plexusConfig = (PlexusConfiguration) configuration;
        } else if (configuration instanceof Xpp3Dom) {
            plexusConfig = new XmlPlexusConfiguration((Xpp3Dom) configuration);
        } else {
```

### ConstantValue
Condition `currentArg != null` is always `true`
in `maven-embedder/src/main/java/org/apache/maven/cli/CleanArgument.java`
#### Snippet
```java

                // if we're building an argument, keep doing so.
                if (currentArg != null) {
                    // if this is the case of "-Dfoo=bar", then we need to adjust the buffer.
                    if (addedToBuffer) {
```

### ConstantValue
Condition `addedToBuffer` is always `true`
in `maven-embedder/src/main/java/org/apache/maven/cli/CleanArgument.java`
#### Snippet
```java
                if (currentArg != null) {
                    // if this is the case of "-Dfoo=bar", then we need to adjust the buffer.
                    if (addedToBuffer) {
                        currentArg.setLength(currentArg.length() - 1);
                    }
```

### ConstantValue
Condition `referenceKey != null` is always `true`
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
        String msg = summary.getMessage();

        if (referenceKey != null && !referenceKey.isEmpty()) {
            if (msg.indexOf('\n') < 0) {
                msg += " -> " + buffer().strong(referenceKey);
```

### ConstantValue
Condition `problems != null` is always `true`
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/SettingsBuildingException.java`
#### Snippet
```java

        this.problems = new ArrayList<>();
        if (problems != null) {
            this.problems.addAll(problems);
        }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Enumeration' to 'java.util.Enumeration'
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Enumeration<Object> elements() {
        return Collections.enumeration((Collection) getter.get().values());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Enumeration<Object> elements() {
        return Collections.enumeration((Collection) getter.get().values());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Enumeration' to 'java.util.Enumeration'
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Enumeration<Object> keys() {
        return Collections.enumeration((Set) getter.get().keySet());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Collection'
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Enumeration<Object> keys() {
        return Collections.enumeration((Set) getter.get().keySet());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Set<Object> keySet() {
        return (Set) getter.get().keySet();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Collection<Object> values() {
        return (Collection) getter.get().values();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set\>'
in `maven-model/src/main/java/org/apache/maven/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Set<Map.Entry<Object, Object>> entrySet() {
        return (Set) getter.get().entrySet();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Collection<Object> values() {
        return (Collection) getter.get().values();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Set<Object> keySet() {
        return (Set) getter.get().keySet();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set\>'
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Set<Map.Entry<Object, Object>> entrySet() {
        return (Set) getter.get().entrySet();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Enumeration' to 'java.util.Enumeration'
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Enumeration<Object> keys() {
        return Collections.enumeration((Set) getter.get().keySet());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Collection'
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Enumeration<Object> keys() {
        return Collections.enumeration((Set) getter.get().keySet());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Enumeration' to 'java.util.Enumeration'
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Enumeration<Object> elements() {
        return Collections.enumeration((Collection) getter.get().values());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `maven-toolchain-model/src/main/java/org/apache/maven/toolchain/model/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Enumeration<Object> elements() {
        return Collections.enumeration((Collection) getter.get().values());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Collection<Object> values() {
        return (Collection) getter.get().values();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Enumeration' to 'java.util.Enumeration'
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Enumeration<Object> elements() {
        return Collections.enumeration((Collection) getter.get().values());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Enumeration<Object> elements() {
        return Collections.enumeration((Collection) getter.get().values());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set\>'
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Set<Map.Entry<Object, Object>> entrySet() {
        return (Set) getter.get().entrySet();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Enumeration' to 'java.util.Enumeration'
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Enumeration<Object> keys() {
        return Collections.enumeration((Set) getter.get().keySet());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Collection'
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Enumeration<Object> keys() {
        return Collections.enumeration((Set) getter.get().keySet());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `maven-settings/src/main/java/org/apache/maven/settings/WrapperProperties.java`
#### Snippet
```java
    @Override
    public Set<Object> keySet() {
        return (Set) getter.get().keySet();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-core/src/main/java/org/apache/maven/model/plugin/DefaultLifecycleBindingsInjector.java`
#### Snippet
```java
                }

                List<Plugin> result = new ArrayList<>(merged.values());

                builder.plugins(result);
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-core/src/main/java/org/apache/maven/model/plugin/DefaultLifecycleBindingsInjector.java`
#### Snippet
```java
                }

                List<Plugin> result = new ArrayList<>(merged.values());

                builder.plugins(result);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashMap' to 'java.util.Map'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultPluginDependenciesResolver.java`
#### Snippet
```java
            String requiredMavenVersion = (String) result.getProperties().get("prerequisites.maven");
            if (requiredMavenVersion != null) {
                Map<String, String> props = new LinkedHashMap<>(pluginArtifact.getProperties());
                props.put("requiredMavenVersion", requiredMavenVersion);
                pluginArtifact = pluginArtifact.setProperties(props);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingHelper.java`
#### Snippet
```java

    private List<org.eclipse.aether.artifact.Artifact> toAetherArtifacts(final List<Artifact> pluginArtifacts) {
        return new ArrayList<>(RepositoryUtils.toArtifacts(pluginArtifacts));
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingHelper.java`
#### Snippet
```java

    private List<org.eclipse.aether.artifact.Artifact> toAetherArtifacts(final List<Artifact> pluginArtifacts) {
        return new ArrayList<>(RepositoryUtils.toArtifacts(pluginArtifacts));
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java
        this.resolver = original.resolver;
        this.remoteRepositoryManager = original.remoteRepositoryManager;
        this.pomRepositories = new ArrayList<>(original.pomRepositories);
        this.externalRepositories = original.externalRepositories;
        this.repositories = new ArrayList<>(original.repositories);
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java
        this.resolver = original.resolver;
        this.remoteRepositoryManager = original.remoteRepositoryManager;
        this.pomRepositories = new ArrayList<>(original.pomRepositories);
        this.externalRepositories = original.externalRepositories;
        this.repositories = new ArrayList<>(original.repositories);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java
        this.pomRepositories = new ArrayList<>(original.pomRepositories);
        this.externalRepositories = original.externalRepositories;
        this.repositories = new ArrayList<>(original.repositories);
        this.repositoryMerging = original.repositoryMerging;
        this.repositoryIds = new HashSet<>(original.repositoryIds);
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java
        this.pomRepositories = new ArrayList<>(original.pomRepositories);
        this.externalRepositories = original.externalRepositories;
        this.repositories = new ArrayList<>(original.repositories);
        this.repositoryMerging = original.repositoryMerging;
        this.repositoryIds = new HashSet<>(original.repositoryIds);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java
        this.remoteRepositoryManager = remoteRepositoryManager;
        this.pomRepositories = new ArrayList<>();
        this.externalRepositories = Collections.unmodifiableList(new ArrayList<>(repositories));
        this.repositories = new ArrayList<>();
        this.repositories.addAll(externalRepositories);
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java
        this.remoteRepositoryManager = remoteRepositoryManager;
        this.pomRepositories = new ArrayList<>();
        this.externalRepositories = Collections.unmodifiableList(new ArrayList<>(repositories));
        this.repositories = new ArrayList<>();
        this.repositories.addAll(externalRepositories);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java

    private List<Artifact> toMavenArtifacts(DependencyNode root, PreorderNodeListGenerator nlg) {
        List<Artifact> artifacts = new ArrayList<>(nlg.getNodes().size());
        RepositoryUtils.toArtifacts(artifacts, Collections.singleton(root), Collections.emptyList(), null);
        artifacts.removeIf(artifact -> artifact.getFile() == null);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java

    private List<org.eclipse.aether.artifact.Artifact> toAetherArtifacts(final List<Artifact> pluginArtifacts) {
        return new ArrayList<>(RepositoryUtils.toArtifacts(pluginArtifacts));
    }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java

    private List<org.eclipse.aether.artifact.Artifact> toAetherArtifacts(final List<Artifact> pluginArtifacts) {
        return new ArrayList<>(RepositoryUtils.toArtifacts(pluginArtifacts));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingRequest.java`
#### Snippet
```java
    public void setProfiles(List<Profile> profiles) {
        if (profiles != null) {
            this.profiles = new ArrayList<>(profiles);
        } else {
            this.profiles.clear();
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingRequest.java`
#### Snippet
```java
    public void setProfiles(List<Profile> profiles) {
        if (profiles != null) {
            this.profiles = new ArrayList<>(profiles);
        } else {
            this.profiles.clear();
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `maven-core/src/main/java/org/apache/maven/execution/scope/internal/MojoExecutionScope.java`
#### Snippet
```java

            if (seeded != null) {
                return (T) seeded.get();
            }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `maven-core/src/main/java/org/apache/maven/execution/scope/internal/MojoExecutionScope.java`
#### Snippet
```java
            }

            T provided = (T) state.provided.get(key);
            if (provided == null && unscoped != null) {
                provided = unscoped.get();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    public MavenExecutionRequest setProfiles(List<Profile> profiles) {
        if (profiles != null) {
            this.profiles = new ArrayList<>(profiles);
        } else {
            this.profiles = null;
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    public MavenExecutionRequest setProfiles(List<Profile> profiles) {
        if (profiles != null) {
            this.profiles = new ArrayList<>(profiles);
        } else {
            this.profiles = null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    public MavenExecutionRequest setMirrors(List<Mirror> mirrors) {
        if (mirrors != null) {
            this.mirrors = new ArrayList<>(mirrors);
        } else {
            this.mirrors = null;
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    public MavenExecutionRequest setMirrors(List<Mirror> mirrors) {
        if (mirrors != null) {
            this.mirrors = new ArrayList<>(mirrors);
        } else {
            this.mirrors = null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    public MavenExecutionRequest setProxies(List<Proxy> proxies) {
        if (proxies != null) {
            this.proxies = new ArrayList<>(proxies);
        } else {
            this.proxies = null;
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    public MavenExecutionRequest setProxies(List<Proxy> proxies) {
        if (proxies != null) {
            this.proxies = new ArrayList<>(proxies);
        } else {
            this.proxies = null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    public MavenExecutionRequest setServers(List<Server> servers) {
        if (servers != null) {
            this.servers = new ArrayList<>(servers);
        } else {
            this.servers = null;
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
    public MavenExecutionRequest setServers(List<Server> servers) {
        if (servers != null) {
            this.servers = new ArrayList<>(servers);
        } else {
            this.servers = null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingResult.java`
#### Snippet
```java

        if (activeProfiles != null) {
            this.activePomProfiles.put(modelId, new ArrayList<>(activeProfiles));
        } else {
            this.activePomProfiles.remove(modelId);
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingResult.java`
#### Snippet
```java

        if (activeProfiles != null) {
            this.activePomProfiles.put(modelId, new ArrayList<>(activeProfiles));
        } else {
            this.activePomProfiles.remove(modelId);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingResult.java`
#### Snippet
```java
    public DefaultModelBuildingResult setActiveExternalProfiles(List<Profile> activeProfiles) {
        if (activeProfiles != null) {
            this.activeExternalProfiles = new ArrayList<>(activeProfiles);
        } else {
            this.activeExternalProfiles.clear();
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingResult.java`
#### Snippet
```java
    public DefaultModelBuildingResult setActiveExternalProfiles(List<Profile> activeProfiles) {
        if (activeProfiles != null) {
            this.activeExternalProfiles = new ArrayList<>(activeProfiles);
        } else {
            this.activeExternalProfiles.clear();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingRequest.java`
#### Snippet
```java
    public DefaultModelBuildingRequest setProfiles(List<Profile> profiles) {
        if (profiles != null) {
            this.profiles = new ArrayList<>(profiles);
        } else {
            this.profiles = null;
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingRequest.java`
#### Snippet
```java
    public DefaultModelBuildingRequest setProfiles(List<Profile> profiles) {
        if (profiles != null) {
            this.profiles = new ArrayList<>(profiles);
        } else {
            this.profiles = null;
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/LocalSnapshotMetadata.java`
#### Snippet
```java
            }

            metadata.getVersioning().setSnapshotVersions(new ArrayList<>(versions.values()));
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/ArtifactDescriptorReaderDelegate.java`
#### Snippet
```java
        if (downloadUrl != null && downloadUrl.length() > 0) {
            Artifact artifact = result.getArtifact();
            Map<String, String> props = new HashMap<>(artifact.getProperties());
            props.put(ArtifactProperties.DOWNLOAD_URL, downloadUrl);
            result.setArtifact(artifact.setProperties(props));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/ArtifactDescriptorReaderDelegate.java`
#### Snippet
```java
                stereotype);

        List<Exclusion> exclusions = new ArrayList<>(dependency.getExclusions().size());
        for (org.apache.maven.model.Exclusion exclusion : dependency.getExclusions()) {
            exclusions.add(convert(exclusion));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Collection'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/VersionsMetadata.java`
#### Snippet
```java

            Collection<String> versions =
                    new LinkedHashSet<>(recessive.getVersioning().getVersions());
            versions.addAll(versioning.getVersions());
            versioning.setVersions(new ArrayList<>(versions));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultVersionRangeResolver.java`
#### Snippet
```java

        List<MetadataRequest> metadataRequests =
                new ArrayList<>(request.getRepositories().size());

        metadataRequests.add(new MetadataRequest(metadata, null, request.getRequestContext()));
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/PluginsMetadata.java`
#### Snippet
```java
            recessivePlugins.forEach(p -> mergedPlugins.put(p.getPrefix(), p));
            plugins.forEach(p -> mergedPlugins.put(p.getPrefix(), p));
            metadata.setPlugins(new ArrayList<>(mergedPlugins.values()));
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/RemoteSnapshotMetadata.java`
#### Snippet
```java

        if (!legacyFormat) {
            metadata.getVersioning().setSnapshotVersions(new ArrayList<>(versions.values()));
        }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultVersionResolver.java`
#### Snippet
```java
            WorkspaceReader reader = session.getWorkspaceReader();
            workspace = (reader != null) ? reader.getRepository() : null;
            repositories = new ArrayList<>(request.getRepositories().size());
            boolean repoMan = false;
            for (RemoteRepository repository : request.getRepositories()) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultVersionResolver.java`
#### Snippet
```java
        } else {
            List<MetadataRequest> metadataReqs =
                    new ArrayList<>(request.getRepositories().size());

            metadataReqs.add(new MetadataRequest(metadata, null, request.getRequestContext()));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultModelCache.java`
#### Snippet
```java
            cache = new ConcurrentHashMap<>();
        } else {
            cache = (Map) session.getCache().get(session, KEY);
            if (cache == null) {
                cache = new ConcurrentHashMap<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultModelResolver.java`
#### Snippet
```java
        this.remoteRepositoryManager = remoteRepositoryManager;
        this.repositories = repositories;
        this.externalRepositories = Collections.unmodifiableList(new ArrayList<>(repositories));

        this.repositoryIds = new HashSet<>();
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultModelResolver.java`
#### Snippet
```java
        this.remoteRepositoryManager = remoteRepositoryManager;
        this.repositories = repositories;
        this.externalRepositories = Collections.unmodifiableList(new ArrayList<>(repositories));

        this.repositoryIds = new HashSet<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultModelResolver.java`
#### Snippet
```java
        this.versionRangeResolver = original.versionRangeResolver;
        this.remoteRepositoryManager = original.remoteRepositoryManager;
        this.repositories = new ArrayList<>(original.repositories);
        this.externalRepositories = original.externalRepositories;
        this.repositoryIds = new HashSet<>(original.repositoryIds);
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultModelResolver.java`
#### Snippet
```java
        this.versionRangeResolver = original.versionRangeResolver;
        this.remoteRepositoryManager = original.remoteRepositoryManager;
        this.repositories = new ArrayList<>(original.repositories);
        this.externalRepositories = original.externalRepositories;
        this.repositoryIds = new HashSet<>(original.repositoryIds);
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3Reader.java`
#### Snippet
```java
     * @param strict a strict object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Model
```

### JavadocReference
Cannot resolve symbol `ReaderFactory`
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3Reader.java`
#### Snippet
```java

    /**
     * @see ReaderFactory#newXmlReader
     *
     * @param reader a reader object.
```

### JavadocReference
Cannot resolve symbol `newXmlReader`
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3Reader.java`
#### Snippet
```java

    /**
     * @see ReaderFactory#newXmlReader
     *
     * @param reader a reader object.
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3Reader.java`
#### Snippet
```java
     * @param reader a reader object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Model
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3Reader.java`
#### Snippet
```java
     * @param in a in object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Model
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3Reader.java`
#### Snippet
```java
     * @param strict a strict object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Model
```

### JavadocReference
Cannot resolve symbol `ReaderFactory`
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3Reader.java`
#### Snippet
```java

    /**
     * @see ReaderFactory#newXmlReader
     *
     * @param reader a reader object.
```

### JavadocReference
Cannot resolve symbol `newXmlReader`
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3Reader.java`
#### Snippet
```java

    /**
     * @see ReaderFactory#newXmlReader
     *
     * @param reader a reader object.
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3Reader.java`
#### Snippet
```java
     * @param strict a strict object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Model
```

### JavadocReference
Cannot resolve symbol `ReaderFactory`
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3ReaderEx.java`
#### Snippet
```java

    /**
     * @see ReaderFactory#newXmlReader
     *
     * @param reader a reader object.
```

### JavadocReference
Cannot resolve symbol `newXmlReader`
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3ReaderEx.java`
#### Snippet
```java

    /**
     * @see ReaderFactory#newXmlReader
     *
     * @param reader a reader object.
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3ReaderEx.java`
#### Snippet
```java
     * @param strict a strict object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Model
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3ReaderEx.java`
#### Snippet
```java
     * @param strict a strict object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Model
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3ReaderEx.java`
#### Snippet
```java
     * @param in a in object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Model
```

### JavadocReference
Cannot resolve symbol `ReaderFactory`
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3ReaderEx.java`
#### Snippet
```java

    /**
     * @see ReaderFactory#newXmlReader
     *
     * @param reader a reader object.
```

### JavadocReference
Cannot resolve symbol `newXmlReader`
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3ReaderEx.java`
#### Snippet
```java

    /**
     * @see ReaderFactory#newXmlReader
     *
     * @param reader a reader object.
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3ReaderEx.java`
#### Snippet
```java
     * @param reader a reader object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Model
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3ReaderEx.java`
#### Snippet
```java
     * @param strict a strict object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Model
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.api.model.Model`
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/package-info.java`
#### Snippet
```java
/**
 * Maven Immutable POM (Project Object Model) classes, generated from <code>maven.mdo</code> model.
 * The root class is {@link org.apache.maven.api.model.Model}.
 */
package org.apache.maven.api.model;
```

### JavadocReference
Cannot resolve symbol `Model`
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/ModelInterpolator.java`
#### Snippet
```java

    /**
     * @deprecated Use {@link ModelInterpolator#interpolate(Model, File, ProjectBuilderConfiguration, boolean)} instead.
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `Model`
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/ModelInterpolator.java`
#### Snippet
```java

    /**
     * @deprecated Use {@link ModelInterpolator#interpolate(Model, File, ProjectBuilderConfiguration, boolean)} instead.
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `Model`
in `maven-compat/src/main/java/org/apache/maven/project/interpolation/AbstractStringBasedModelInterpolator.java`
#### Snippet
```java
     * @return The resolved instance of the inbound Model. This is a different instance!
     *
     * @deprecated Use {@link ModelInterpolator#interpolate(Model, File, ProjectBuilderConfiguration, boolean)} instead.
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-compat/src/main/java/org/apache/maven/usability/plugin/ExpressionDocumenter.java`
#### Snippet
```java
     *
     * @throws IOException
     * @throws XmlPullParserException
     */
    private static Map<String, Expression> parseExpressionDocumentation(InputStream docStream)
```

### JavadocReference
Cannot resolve symbol `ConnectionException`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
     * @param repository
     *
     * @throws ConnectionException
     * @throws AuthenticationException
     */
```

### JavadocReference
Cannot resolve symbol `AuthenticationException`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
     *
     * @throws ConnectionException
     * @throws AuthenticationException
     */
    private void connectWagon(Wagon wagon, ArtifactRepository repository)
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-xml-impl/src/main/java/org/apache/maven/internal/xml/XmlNodeBuilder.java`
#### Snippet
```java
     * @param trim do trim
     * @return DOM
     * @throws XmlPullParserException xml exception
     * @throws IOException io
     */
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-xml-impl/src/main/java/org/apache/maven/internal/xml/XmlNodeBuilder.java`
#### Snippet
```java
     * @since 3.2.0
     * @return DOM
     * @throws XmlPullParserException xml exception
     * @throws IOException io
     */
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-xml-impl/src/main/java/org/apache/maven/internal/xml/XmlNodeBuilder.java`
#### Snippet
```java
     * @since 3.2.0
     * @return DOM
     * @throws XmlPullParserException xml exception
     * @throws IOException io
     */
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-settings/src/main/java/org/apache/maven/settings/io/xpp3/SettingsXpp3Reader.java`
#### Snippet
```java
     * @param strict a strict object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Settings
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-settings/src/main/java/org/apache/maven/settings/io/xpp3/SettingsXpp3Reader.java`
#### Snippet
```java
     * @param in a in object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Settings
```

### JavadocReference
Cannot resolve symbol `ReaderFactory`
in `maven-settings/src/main/java/org/apache/maven/settings/io/xpp3/SettingsXpp3Reader.java`
#### Snippet
```java

    /**
     * @see ReaderFactory#newXmlReader
     *
     * @param reader a reader object.
```

### JavadocReference
Cannot resolve symbol `newXmlReader`
in `maven-settings/src/main/java/org/apache/maven/settings/io/xpp3/SettingsXpp3Reader.java`
#### Snippet
```java

    /**
     * @see ReaderFactory#newXmlReader
     *
     * @param reader a reader object.
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-settings/src/main/java/org/apache/maven/settings/io/xpp3/SettingsXpp3Reader.java`
#### Snippet
```java
     * @param strict a strict object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Settings
```

### JavadocReference
Cannot resolve symbol `ReaderFactory`
in `maven-settings/src/main/java/org/apache/maven/settings/io/xpp3/SettingsXpp3Reader.java`
#### Snippet
```java

    /**
     * @see ReaderFactory#newXmlReader
     *
     * @param reader a reader object.
```

### JavadocReference
Cannot resolve symbol `newXmlReader`
in `maven-settings/src/main/java/org/apache/maven/settings/io/xpp3/SettingsXpp3Reader.java`
#### Snippet
```java

    /**
     * @see ReaderFactory#newXmlReader
     *
     * @param reader a reader object.
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-settings/src/main/java/org/apache/maven/settings/io/xpp3/SettingsXpp3Reader.java`
#### Snippet
```java
     * @param reader a reader object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Model
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-settings/src/main/java/org/apache/maven/settings/io/xpp3/SettingsXpp3Reader.java`
#### Snippet
```java
     * @param strict a strict object.
     * @throws IOException IOException if any.
     * @throws XmlPullParserException XmlPullParserException if
     * any.
     * @return Settings
```

### JavadocReference
Cannot resolve symbol `CycleDetectedException`
in `maven-core/src/main/java/org/apache/maven/graph/DefaultProjectDependencyGraph.java`
#### Snippet
```java
     * @param projects    The projects to create the dependency graph with.
     * @throws DuplicateProjectException
     * @throws CycleDetectedException
     * @since 4.0.0
     */
```

### JavadocReference
Cannot resolve symbol `CycleDetectedException`
in `maven-core/src/main/java/org/apache/maven/graph/DefaultProjectDependencyGraph.java`
#### Snippet
```java
     * @param projects    The projects to create the dependency graph with.
     * @throws DuplicateProjectException
     * @throws CycleDetectedException
     * @since 3.5.0
     * @deprecated Use {@link #DefaultProjectDependencyGraph(Collection, Collection)} instead.
```

### JavadocReference
Cannot resolve symbol `CycleDetectedException`
in `maven-core/src/main/java/org/apache/maven/graph/DefaultProjectDependencyGraph.java`
#### Snippet
```java
     * @param projects The projects to create the dependency graph with
     * @throws DuplicateProjectException
     * @throws CycleDetectedException
     */
    public DefaultProjectDependencyGraph(Collection<MavenProject> projects)
```

### JavadocReference
Cannot resolve symbol `Logger`
in `maven-core/src/main/java/org/apache/maven/plugin/DebugConfigurationListener.java`
#### Snippet
```java

    /**
     * @deprecated Use {@link #DebugConfigurationListener(Logger)} instead.
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.model.Profile`
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingRequest.java`
#### Snippet
```java

    /**
     * Add a {@link org.apache.maven.model.Profile} that has come from an external source. This may be from a custom
     * configuration like the MavenCLI settings.xml file, or from a custom dialog in an IDE integration like M2Eclipse.
     *
```

### JavadocReference
Cannot resolve symbol `org.eclipse.aether.RepositoryEvent`
in `maven-core/src/main/java/org/apache/maven/eventspy/EventSpy.java`
#### Snippet
```java
     * @see org.apache.maven.project.DependencyResolutionResult
     * @see org.apache.maven.execution.ExecutionEvent
     * @see org.eclipse.aether.RepositoryEvent
     */
    void onEvent(Object event) throws Exception;
```

### JavadocReference
Cannot resolve symbol `RepositorySystem`
in `maven-core/src/main/java/org/apache/maven/internal/aether/ResolverLifecycle.java`
#### Snippet
```java

/**
 * Maven internal component that bridges container "shut down" to {@link RepositorySystem#shutdown()}.
 *
 * @since 3.9.0
```

### JavadocReference
Cannot resolve symbol `shutdown()`
in `maven-core/src/main/java/org/apache/maven/internal/aether/ResolverLifecycle.java`
#### Snippet
```java

/**
 * Maven internal component that bridges container "shut down" to {@link RepositorySystem#shutdown()}.
 *
 * @since 3.9.0
```

### JavadocReference
Cannot resolve symbol `WorkspaceReader`
in `maven-core/src/main/java/org/apache/maven/internal/aether/MavenChainedWorkspaceReader.java`
#### Snippet
```java

    /**
     * chains a collection of {@link WorkspaceReader}s
     * @param workspaceReaderCollection the collection of readers, might be empty but never <code>null</code>
     * @return if the collection contains only one item returns the single item, otherwise creates a new
```

### JavadocReference
Cannot resolve symbol `CollectStepData`
in `maven-core/src/main/java/org/apache/maven/internal/aether/ReverseTreeRepositoryListener.java`
#### Snippet
```java

/**
 * A class building reverse tree using {@link CollectStepData} trace data provided in {@link RepositoryEvent}
 * events fired during collection.
 *
```

### JavadocReference
Cannot resolve symbol `RepositoryEvent`
in `maven-core/src/main/java/org/apache/maven/internal/aether/ReverseTreeRepositoryListener.java`
#### Snippet
```java

/**
 * A class building reverse tree using {@link CollectStepData} trace data provided in {@link RepositoryEvent}
 * events fired during collection.
 *
```

### JavadocReference
Cannot resolve symbol `CollectStepData`
in `maven-core/src/main/java/org/apache/maven/internal/aether/ReverseTreeRepositoryListener.java`
#### Snippet
```java

    /**
     * Unravels trace tree (going upwards from current node), looking for {@link CollectStepData} trace data.
     * This method may return {@code null} if no collect step data found in passed trace data or it's parents.
     * <p>
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-core/src/main/java/org/apache/maven/settings/MavenSettingsBuilder.java`
#### Snippet
```java
     * @return a <code>Settings</code> object from the user settings file.
     * @throws IOException if any
     * @throws XmlPullParserException if any
     */
    Settings buildSettings(boolean useCachedSettings) throws IOException, XmlPullParserException;
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-core/src/main/java/org/apache/maven/settings/MavenSettingsBuilder.java`
#### Snippet
```java
     * @return a <code>Settings</code> object from the user settings file.
     * @throws IOException if any
     * @throws XmlPullParserException if any
     */
    Settings buildSettings(File userSettingsFile) throws IOException, XmlPullParserException;
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-core/src/main/java/org/apache/maven/settings/MavenSettingsBuilder.java`
#### Snippet
```java
     * @return a <code>Settings</code> object from the user settings file.
     * @throws IOException if any
     * @throws XmlPullParserException if any
     */
    Settings buildSettings(File userSettingsFile, boolean useCachedSettings) throws IOException, XmlPullParserException;
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `maven-core/src/main/java/org/apache/maven/settings/MavenSettingsBuilder.java`
#### Snippet
```java
     * @return a <code>Settings</code> object from the user settings file.
     * @throws IOException if any
     * @throws XmlPullParserException if any
     */
    Settings buildSettings() throws IOException, XmlPullParserException;
```

### JavadocReference
Cannot resolve symbol `Repository`
in `maven-core/src/main/java/org/apache/maven/internal/impl/AbstractSession.java`
#### Snippet
```java
     * Shortcut for <code>getService(RepositoryFactory.class).createRemote(...)</code>
     *
     * @see RepositoryFactory#createRemote(Repository)
     */
    @Nonnull
```

### JavadocReference
Cannot resolve symbol `ChainedLocalRepositoryManager`
in `maven-core/src/main/java/org/apache/maven/internal/aether/DefaultRepositorySystemSessionFactory.java`
#### Snippet
```java
    /**
     * User property for chained LRM: list of "tail" local repository paths (separated by comma), to be used with
     * {@link ChainedLocalRepositoryManager}.
     * Default value: {@code null}, no chained LRM is used.
     *
```

### JavadocReference
Cannot resolve symbol `PlexusContainer`
in `maven-core/src/main/java/org/apache/maven/lifecycle/DefaultLifecycles.java`
#### Snippet
```java

    /**
     * @deprecated Rely on {@link #DefaultLifecycles(PlexusContainer)} instead
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.model.ConfigurationContainer`
in `maven-core/src/main/java/org/apache/maven/configuration/BeanConfigurationRequest.java`
#### Snippet
```java
    /**
     * Sets the configuration to unmarshal into the bean. The configuration should be taken from
     * {@link org.apache.maven.model.ConfigurationContainer#getConfiguration()} or a similar source.
     * If {@code element} is not {@code null}, child configuration element with the specified name will
     * be unmarshalled.
```

### JavadocReference
Cannot resolve symbol `getConfiguration()`
in `maven-core/src/main/java/org/apache/maven/configuration/BeanConfigurationRequest.java`
#### Snippet
```java
    /**
     * Sets the configuration to unmarshal into the bean. The configuration should be taken from
     * {@link org.apache.maven.model.ConfigurationContainer#getConfiguration()} or a similar source.
     * If {@code element} is not {@code null}, child configuration element with the specified name will
     * be unmarshalled.
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.model.ConfigurationContainer`
in `maven-core/src/main/java/org/apache/maven/configuration/BeanConfigurationRequest.java`
#### Snippet
```java
    /**
     * Sets the configuration to unmarshal into the bean. The configuration should be taken from
     * {@link org.apache.maven.model.ConfigurationContainer#getConfiguration()} or a similar source.
     * Fully equivalent to {@code setConfiguration(configuration, null)}.
     *
```

### JavadocReference
Cannot resolve symbol `getConfiguration()`
in `maven-core/src/main/java/org/apache/maven/configuration/BeanConfigurationRequest.java`
#### Snippet
```java
    /**
     * Sets the configuration to unmarshal into the bean. The configuration should be taken from
     * {@link org.apache.maven.model.ConfigurationContainer#getConfiguration()} or a similar source.
     * Fully equivalent to {@code setConfiguration(configuration, null)}.
     *
```

### JavadocReference
Cannot resolve symbol `ObjectWithFieldsConverter`
in `maven-core/src/main/java/org/apache/maven/configuration/internal/EnhancedConfigurationConverter.java`
#### Snippet
```java

/**
 * An enhanced {@link ObjectWithFieldsConverter} leveraging the {@link TypeAwareExpressionEvaluator}
 * interface.
 */
```

### JavadocReference
Cannot resolve symbol `TypeAwareExpressionEvaluator`
in `maven-core/src/main/java/org/apache/maven/configuration/internal/EnhancedConfigurationConverter.java`
#### Snippet
```java

/**
 * An enhanced {@link ObjectWithFieldsConverter} leveraging the {@link TypeAwareExpressionEvaluator}
 * interface.
 */
```

### JavadocReference
Cannot resolve symbol `ActivationFile`
in `maven-model-builder/src/main/java/org/apache/maven/model/path/ProfileActivationFilePathInterpolator.java`
#### Snippet
```java

/**
 * Finds an absolute path for {@link ActivationFile#getExists()} or {@link ActivationFile#getMissing()}
 *
 * @author Ravil Galeyev
```

### JavadocReference
Cannot resolve symbol `getExists()`
in `maven-model-builder/src/main/java/org/apache/maven/model/path/ProfileActivationFilePathInterpolator.java`
#### Snippet
```java

/**
 * Finds an absolute path for {@link ActivationFile#getExists()} or {@link ActivationFile#getMissing()}
 *
 * @author Ravil Galeyev
```

### JavadocReference
Cannot resolve symbol `ActivationFile`
in `maven-model-builder/src/main/java/org/apache/maven/model/path/ProfileActivationFilePathInterpolator.java`
#### Snippet
```java

/**
 * Finds an absolute path for {@link ActivationFile#getExists()} or {@link ActivationFile#getMissing()}
 *
 * @author Ravil Galeyev
```

### JavadocReference
Cannot resolve symbol `getMissing()`
in `maven-model-builder/src/main/java/org/apache/maven/model/path/ProfileActivationFilePathInterpolator.java`
#### Snippet
```java

/**
 * Finds an absolute path for {@link ActivationFile#getExists()} or {@link ActivationFile#getMissing()}
 *
 * @author Ravil Galeyev
```

### JavadocReference
Cannot resolve symbol `ActivationFile`
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/FileProfileActivator.java`
#### Snippet
```java
 *
 * @author Benjamin Bentmann
 * @see ActivationFile
 * @see org.apache.maven.model.validation.DefaultModelValidator#validateRawModel
 */
```

### JavadocReference
Cannot resolve symbol `Activation`
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
 *
 * @author Benjamin Bentmann
 * @see Activation#getJdk()
 */
@Named("jdk-version")
```

### JavadocReference
Cannot resolve symbol `getJdk()`
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
 *
 * @author Benjamin Bentmann
 * @see Activation#getJdk()
 */
@Named("jdk-version")
```

### JavadocReference
Cannot resolve symbol `ActivationOS`
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/OperatingSystemProfileActivator.java`
#### Snippet
```java
 *
 * @author Benjamin Bentmann
 * @see ActivationOS
 */
@Named("os")
```

### JavadocReference
Cannot resolve symbol `ActivationProperty`
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/PropertyProfileActivator.java`
#### Snippet
```java
 *
 * @author Benjamin Bentmann
 * @see ActivationProperty
 */
@Named("property")
```

### JavadocReference
Cannot resolve symbol `XmlPullParser`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelSourceTransformer.java`
#### Snippet
```java
 * The ModelSourceTransformer is a way to transform the local pom while streaming the input.
 *
 * The {@link #transform(XmlPullParser, Path, TransformerContext)} method uses a Path on purpose, to ensure the
 * local pom is the original source.
 *
```

### JavadocReference
Cannot resolve symbol `Parent`
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/ModelResolver.java`
#### Snippet
```java
     * @since 3.2.2
     *
     * @see Parent#clone()
     */
    ModelSource resolveModel(org.apache.maven.model.Parent parent) throws UnresolvableModelException;
```

### JavadocReference
Cannot resolve symbol `clone()`
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/ModelResolver.java`
#### Snippet
```java
     * @since 3.2.2
     *
     * @see Parent#clone()
     */
    ModelSource resolveModel(org.apache.maven.model.Parent parent) throws UnresolvableModelException;
```

### JavadocReference
Cannot resolve symbol `Repository`
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/ModelResolver.java`
#### Snippet
```java
    /**
     * Clones this resolver for usage in a forked resolution process. In general, implementors need not provide a deep
     * clone. The only requirement is that invocations of {@link #addRepository(Repository)} on the clone do not affect
     * the state of the original resolver and vice versa.
     *
```

### JavadocReference
Cannot resolve symbol `Dependency`
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/ModelResolver.java`
#### Snippet
```java
     * @since 3.5.0
     *
     * @see Dependency#clone()
     */
    ModelSource resolveModel(org.apache.maven.model.Dependency dependency) throws UnresolvableModelException;
```

### JavadocReference
Cannot resolve symbol `clone()`
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/ModelResolver.java`
#### Snippet
```java
     * @since 3.5.0
     *
     * @see Dependency#clone()
     */
    ModelSource resolveModel(org.apache.maven.model.Dependency dependency) throws UnresolvableModelException;
```

### JavadocReference
Cannot resolve symbol `org.slf4j.ILoggerFactory`
in `maven-embedder/src/main/java/org/apache/maven/cli/logging/Slf4jLoggerManager.java`
#### Snippet
```java

/**
 * Use an SLF4J {@link org.slf4j.ILoggerFactory} as a backing for a Plexus
 * {@link org.codehaus.plexus.logging.LoggerManager},
 * ignoring Plexus logger API parts that are not classical and probably not really used.
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.logging.LoggerManager`
in `maven-embedder/src/main/java/org/apache/maven/cli/logging/Slf4jLoggerManager.java`
#### Snippet
```java
/**
 * Use an SLF4J {@link org.slf4j.ILoggerFactory} as a backing for a Plexus
 * {@link org.codehaus.plexus.logging.LoggerManager},
 * ignoring Plexus logger API parts that are not classical and probably not really used.
 *
```

### JavadocReference
Cannot resolve symbol `Settings`
in `maven-core/src/main/java/org/apache/maven/execution/MavenSession.java`
#### Snippet
```java

    /**
     * Adapt a {@link MavenExecutionRequest} to a {@link Settings} object for use in the Maven core.
     * We want to make sure that what is ask for in the execution request overrides what is in the settings.
     * The CLI feeds into an execution request so if a particular value is present in the execution request
```

### JavadocReference
Cannot resolve symbol `Model`
in `api/maven-api-core/src/main/java/org/apache/maven/api/Project.java`
#### Snippet
```java
     * Returns a boolean indicating if the project is a root project,
     * meaning that the {@link #getRootDirectory()} and {@link #getBasedir()}
     * points to the same directory, and that either {@link Model#isRoot()}
     * is {@code true} or that {@code basedir} contains a {@code .mvn} child
     * directory.
```

### JavadocReference
Cannot resolve symbol `isRoot()`
in `api/maven-api-core/src/main/java/org/apache/maven/api/Project.java`
#### Snippet
```java
     * Returns a boolean indicating if the project is a root project,
     * meaning that the {@link #getRootDirectory()} and {@link #getBasedir()}
     * points to the same directory, and that either {@link Model#isRoot()}
     * is {@code true} or that {@code basedir} contains a {@code .mvn} child
     * directory.
```

### JavadocReference
Cannot resolve symbol `Model`
in `api/maven-api-core/src/main/java/org/apache/maven/api/Project.java`
#### Snippet
```java
     *
     * @return {@code true} if the project is the root project
     * @see Model#isRoot()
     */
    boolean isRootProject();
```

### JavadocReference
Cannot resolve symbol `isRoot()`
in `api/maven-api-core/src/main/java/org/apache/maven/api/Project.java`
#### Snippet
```java
     *
     * @return {@code true} if the project is the root project
     * @see Model#isRoot()
     */
    boolean isRootProject();
```

### JavadocReference
Cannot resolve symbol `PlexusBeanConverter`
in `maven-embedder/src/main/java/org/eclipse/sisu/plexus/PlexusXmlBeanConverter.java`
#### Snippet
```java

/**
 * {@link PlexusBeanConverter} {@link Module} that converts Plexus XML configuration into beans.
 */
@Singleton
```

### JavadocReference
Cannot resolve symbol `createRemote(Repository)`
in `api/maven-api-core/src/main/java/org/apache/maven/api/Session.java`
#### Snippet
```java
    /**
     * Shortcut for <code>getService(RepositoryFactory.class).createRemote(...)</code>
     * @see org.apache.maven.api.services.RepositoryFactory#createRemote(Repository)
     */
    @Nonnull
```

### JavadocReference
Cannot resolve symbol `Settings`
in `api/maven-api-core/src/main/java/org/apache/maven/api/services/xml/SettingsXmlFactory.java`
#### Snippet
```java

/**
 * Reads and writes a {@link Settings} object to/from XML.
 *
 * @since 4.0.0
```

### JavadocReference
Cannot resolve symbol `PersistedToolchains`
in `api/maven-api-core/src/main/java/org/apache/maven/api/services/xml/ToolchainsXmlFactory.java`
#### Snippet
```java

/**
 * Reads and writes a {@link PersistedToolchains} object to/from XML.
 *
 * @since 4.0.0
```

### JavadocReference
Cannot resolve symbol `Model`
in `api/maven-api-core/src/main/java/org/apache/maven/api/services/xml/ModelXmlFactory.java`
#### Snippet
```java

/**
 * Reads or writes a {@link Model} using XML.
 *
 * @since 4.0.0
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.settings.v4.SettingsMerger`
in `maven-settings-builder/src/main/java/org/apache/maven/settings/merge/MavenSettingsMerger.java`
#### Snippet
```java
 * @author <a href="mailto:vincent.siveton@gmail.com">Vincent Siveton</a>
 * @author Benjamin Bentmann
 * @deprecated use {@link org.apache.maven.settings.v4.SettingsMerger}
 */
@Deprecated
```

### JavadocReference
Cannot resolve symbol `ArtifactDescriptorResult`
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/ArtifactDescriptorReaderDelegate.java`
#### Snippet
```java

/**
 * Populates Aether {@link ArtifactDescriptorResult} from Maven project {@link Model}.
 *
 * <strong>Note:</strong> This class is part of work in progress and can be changed or removed without notice.
```

### JavadocReference
Cannot resolve symbol `Model`
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/ArtifactDescriptorReaderDelegate.java`
#### Snippet
```java

/**
 * Populates Aether {@link ArtifactDescriptorResult} from Maven project {@link Model}.
 *
 * <strong>Note:</strong> This class is part of work in progress and can be changed or removed without notice.
```

### JavadocReference
Cannot resolve symbol `GenericVersionScheme`
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultVersionSchemeProvider.java`
#### Snippet
```java

/**
 * Default version scheme provider: provides singleton {@link GenericVersionScheme} instance.
 */
@Singleton
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/AbstractMavenTransferListener.java`
#### Snippet
```java
                    return MEGABYTE.bytes() * KILOBYTE.bytes();
                }
                ;

                @Override
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Casting `repository` to `ArtifactRepository` will produce `ClassCastException` for any non-null value
in `maven-compat/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java`
#### Snippet
```java
                    normalized = true;
                } else {
                    repos.add((ArtifactRepository) repository);
                }
            }
```

### DataFlowIssue
`null` is returned by the method declared as @NotNull
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/ClasspathContainer.java`
#### Snippet
```java
    // -------------------------------------------------------------------------------------------
    public Iterator<ArtifactMetadata> iterator() {
        return classpath == null ? null : classpath.iterator();
    }

```

### DataFlowIssue
Method invocation `getArtifact` may produce `NullPointerException`
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
                            // TODO add better exception
                            result.addVersionRangeViolation(new ArtifactResolutionException(
                                    "Conflict resolver returned unknown resolution node: ", resolved.getArtifact()));
                        }

```

### DataFlowIssue
Condition `cause instanceof LinkageError` is redundant and can be replaced with a null check
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java

                    throw new PluginContainerException(mojoDescriptor, pluginRealm, os.toString(), cause);
                } else if (cause instanceof LinkageError) {
                    ByteArrayOutputStream os = new ByteArrayOutputStream(1024);
                    PrintStream ps = new PrintStream(os);
```

### DataFlowIssue
Condition `exc.getCause().getCause() instanceof ArtifactResolutionException` is redundant and can be replaced with a null check
in `maven-core/src/main/java/org/apache/maven/project/collector/MultiModuleCollectionStrategy.java`
#### Snippet
```java
                    Predicate<Exception> pluginArtifactNotFoundException = exc -> exc instanceof PluginManagerException
                            && exc.getCause() instanceof PluginResolutionException
                            && exc.getCause().getCause() instanceof ArtifactResolutionException
                            && exc.getCause().getCause().getCause() instanceof ArtifactNotFoundException;

```

### DataFlowIssue
Condition `exc.getCause().getCause().getCause() instanceof ArtifactNotFoundException` is redundant and can be replaced with a null check
in `maven-core/src/main/java/org/apache/maven/project/collector/MultiModuleCollectionStrategy.java`
#### Snippet
```java
                            && exc.getCause() instanceof PluginResolutionException
                            && exc.getCause().getCause() instanceof ArtifactResolutionException
                            && exc.getCause().getCause().getCause() instanceof ArtifactNotFoundException;

                    Predicate<Plugin> isPluginPartOfRequestScope = plugin -> projectsInRequestScope.stream()
```

### DataFlowIssue
Condition `e.getCause() instanceof org.eclipse.aether.resolution.ArtifactResolutionException` is redundant and can be replaced with a null check
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
            return true;
        }
        return e.getCause() instanceof org.eclipse.aether.resolution.ArtifactResolutionException
                && !(e.getCause().getCause() instanceof ArtifactNotFoundException);
    }
```

### DataFlowIssue
Condition `e.getCause().getCause() instanceof ArtifactNotFoundException` is redundant and can be replaced with a null check
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
        }
        return e.getCause() instanceof org.eclipse.aether.resolution.ArtifactResolutionException
                && !(e.getCause().getCause() instanceof ArtifactNotFoundException);
    }

```

### DataFlowIssue
Condition `e.getCause() instanceof org.eclipse.aether.resolution.ArtifactResolutionException` is redundant and can be replaced with a null check
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
            return true;
        }
        return e.getCause() instanceof org.eclipse.aether.resolution.ArtifactResolutionException
                && e.getCause().getCause() instanceof ArtifactNotFoundException;
    }
```

### DataFlowIssue
Condition `e.getCause().getCause() instanceof ArtifactNotFoundException` is redundant and can be replaced with a null check
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
        }
        return e.getCause() instanceof org.eclipse.aether.resolution.ArtifactResolutionException
                && e.getCause().getCause() instanceof ArtifactNotFoundException;
    }

```

### DataFlowIssue
Argument `tasks` might be null
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/DefaultLifecycleTaskSegmentCalculator.java`
#### Snippet
```java
        }

        return calculateTaskSegments(session, tasks);
    }

```

### DataFlowIssue
Condition `classLoader instanceof ClassRealm` is redundant and can be replaced with a null check
in `maven-core/src/main/java/org/apache/maven/classrealm/DefaultClassRealmManager.java`
#### Snippet
```java

    private String getId(ClassLoader classLoader) {
        if (classLoader instanceof ClassRealm) {
            return ((ClassRealm) classLoader).getId();
        }
```

### DataFlowIssue
Method invocation `evaluate` will produce `NullPointerException`
in `maven-core/src/main/java/org/apache/maven/configuration/internal/EnhancedConfigurationConverter.java`
#### Snippet
```java
                    result = ((TypeAwareExpressionEvaluator) evaluator).evaluate(value, type);
                } else {
                    result = evaluator.evaluate(value);
                }
            }
```

### DataFlowIssue
Method invocation `evaluate` may produce `NullPointerException`
in `maven-core/src/main/java/org/apache/maven/configuration/internal/EnhancedConfigurationConverter.java`
#### Snippet
```java
                        result = ((TypeAwareExpressionEvaluator) evaluator).evaluate(value, type);
                    } else {
                        result = evaluator.evaluate(value);
                    }
                }
```

### DataFlowIssue
Method invocation `toExternalForm` may produce `NullPointerException`
in `maven-model-builder/src/main/java/org/apache/maven/model/superpom/DefaultSuperPomProvider.java`
#### Snippet
```java
                        + this.getClass().getPackage().getImplementationVersion() + ":super-pom";
                InputSource inputSource = new InputSource(
                        modelId, getClass().getResource(resource).toExternalForm());
                options.put(ModelProcessor.INPUT_SOURCE, new org.apache.maven.model.InputSource(inputSource));

```

### DataFlowIssue
Method invocation `getClass` will produce `NullPointerException`
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
                                + "The --fail-on-severity flag will not take effect.",
                        MavenSlf4jWrapperFactory.class.getName(),
                        slf4jLoggerFactory.getClass().getName());
            }
        }
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/ExclusionArtifactFilter.java`
#### Snippet
```java
    @Override
    public boolean include(Artifact artifact) {
        return !exclusions.stream().anyMatch(exclude(artifact));
    }
}
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/MojoDescriptorCreator.java`
#### Snippet
```java

        return pluginManager.getMojoDescriptor(
                plugin, goal.toString(), project.getRemotePluginRepositories(), session.getRepositorySession());
    }

```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'ModelInheritanceAssembler' is still used
in `maven-compat/src/main/java/org/apache/maven/project/inheritance/ModelInheritanceAssembler.java`
#### Snippet
```java
 */
@Deprecated
public interface ModelInheritanceAssembler {
    String ROLE = ModelInheritanceAssembler.class.getName();

```

### DeprecatedIsStillUsed
Deprecated member 'DefaultPathTranslator' is still used
in `maven-compat/src/main/java/org/apache/maven/project/path/DefaultPathTranslator.java`
#### Snippet
```java
@Deprecated
@Component(role = PathTranslator.class)
public class DefaultPathTranslator implements PathTranslator {
    private static final String[] BASEDIR_EXPRESSIONS = {"${basedir}", "${pom.basedir}", "${project.basedir}"};

```

### DeprecatedIsStillUsed
Deprecated member 'WagonManager' is still used
in `maven-compat/src/main/java/org/apache/maven/artifact/manager/WagonManager.java`
#### Snippet
```java
 */
@Deprecated
public interface WagonManager extends org.apache.maven.repository.legacy.WagonManager {
    /**
     * this method is only here for backward compat (project-info-reports:dependencies)
```

### DeprecatedIsStillUsed
Deprecated member 'ResolutionListenerForDepMgmt' is still used
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/ResolutionListenerForDepMgmt.java`
#### Snippet
```java
 */
@Deprecated
public interface ResolutionListenerForDepMgmt {
    void manageArtifactVersion(Artifact artifact, Artifact replacement);

```

### DeprecatedIsStillUsed
Deprecated member 'ManagedVersionMap' is still used
in `maven-compat/src/main/java/org/apache/maven/artifact/versioning/ManagedVersionMap.java`
#### Snippet
```java
 */
@Deprecated
public class ManagedVersionMap extends HashMap<String, Artifact> {
    public ManagedVersionMap(Map<String, Artifact> map) {
        super();
```

### DeprecatedIsStillUsed
Deprecated member 'ProfileManager' is still used
in `maven-compat/src/main/java/org/apache/maven/profiles/ProfileManager.java`
#### Snippet
```java
 */
@Deprecated
public interface ProfileManager {

    void addProfile(Profile profile);
```

### DeprecatedIsStillUsed
Deprecated member 'ArtifactCollector' is still used
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/ArtifactCollector.java`
#### Snippet
```java
 */
@Deprecated
public interface ArtifactCollector extends org.apache.maven.repository.legacy.resolver.LegacyArtifactCollector {

    @Deprecated
```

### DeprecatedIsStillUsed
Deprecated member 'DefaultProfileManager' is still used
in `maven-compat/src/main/java/org/apache/maven/profiles/DefaultProfileManager.java`
#### Snippet
```java
 */
@Deprecated
public class DefaultProfileManager implements ProfileManager {

    @Requirement
```

### DeprecatedIsStillUsed
Deprecated member 'setRemoteRepostories' is still used
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionRequest.java`
#### Snippet
```java
     */
    @Deprecated
    public MetadataResolutionRequest setRemoteRepostories(List<ArtifactRepository> remoteRepositories) {
        this.remoteRepositories = remoteRepositories;

```

### DeprecatedIsStillUsed
Deprecated member 'getRemoteRepostories' is still used
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataResolutionRequest.java`
#### Snippet
```java
     */
    @Deprecated
    public List<ArtifactRepository> getRemoteRepostories() {
        return remoteRepositories;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getWagon' is still used
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/WagonManager.java`
#### Snippet
```java
public interface WagonManager {
    @Deprecated
    Wagon getWagon(String protocol) throws UnsupportedProtocolException;

    @Deprecated
```

### DeprecatedIsStillUsed
Deprecated member 'DefaultArtifactRepository' is still used
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepository.java`
#### Snippet
```java
 */
@Deprecated
public class DefaultArtifactRepository extends Repository implements ArtifactRepository {
    private ArtifactRepositoryLayout layout;

```

### DeprecatedIsStillUsed
Deprecated member 'resolveTransitively' is still used
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolver.java`
#### Snippet
```java
    // USED BY INVOKER PLUGIN
    @Deprecated
    ArtifactResolutionResult resolveTransitively(
            Set<Artifact> artifacts,
            Artifact originatingArtifact,
```

### DeprecatedIsStillUsed
Deprecated member 'LegacyArtifactCollector' is still used
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/LegacyArtifactCollector.java`
#### Snippet
```java
@Deprecated
@SuppressWarnings("checkstyle:parameternumber")
public interface LegacyArtifactCollector {

    ArtifactResolutionResult collect(
```

### DeprecatedIsStillUsed
Deprecated member 'getWagon' is still used
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
    @Override
    @Deprecated
    public Wagon getWagon(String protocol) throws UnsupportedProtocolException {
        if (protocol == null) {
            throw new UnsupportedProtocolException("Unspecified protocol");
```

### DeprecatedIsStillUsed
Deprecated member 'createDeploymentArtifactRepository' is still used
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/repository/ArtifactRepositoryFactory.java`
#### Snippet
```java

    @Deprecated
    ArtifactRepository createDeploymentArtifactRepository(String id, String url, String layoutId, boolean uniqueVersion)
            throws UnknownRepositoryLayoutException;

```

### DeprecatedIsStillUsed
Deprecated member 'ArtifactFilterManagerDelegate' is still used
in `maven-core/src/main/java/org/apache/maven/ArtifactFilterManagerDelegate.java`
#### Snippet
```java
 * @deprecated use {@code META-INF/maven/extension.xml} to define artifacts exported by Maven core extensions.
 */
public interface ArtifactFilterManagerDelegate {

    void addExcludes(Set<String> excludes);
```

### DeprecatedIsStillUsed
Deprecated member 'DefaultProjectDependencyGraph' is still used
in `maven-core/src/main/java/org/apache/maven/graph/DefaultProjectDependencyGraph.java`
#### Snippet
```java
     */
    @Deprecated
    public DefaultProjectDependencyGraph(List<MavenProject> allProjects, Collection<MavenProject> projects)
            throws CycleDetectedException, DuplicateProjectException {
        this((Collection<MavenProject>) allProjects, projects);
```

### DeprecatedIsStillUsed
Deprecated member 'PluginManager' is still used
in `maven-core/src/main/java/org/apache/maven/plugin/PluginManager.java`
#### Snippet
```java
 */
@Deprecated
public interface PluginManager {
    String ROLE = PluginManager.class.getName();

```

### DeprecatedIsStillUsed
Deprecated member 'DebugConfigurationListener' is still used
in `maven-core/src/main/java/org/apache/maven/plugin/DebugConfigurationListener.java`
#### Snippet
```java
 */
@Deprecated
public class DebugConfigurationListener implements ConfigurationListener {
    private final Logger logger;

```

### DeprecatedIsStillUsed
Deprecated member 'isResolveVersionRanges' is still used
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingRequest.java`
#### Snippet
```java
     */
    @Deprecated
    boolean isResolveVersionRanges();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'AttachedArtifact' is still used
in `maven-core/src/main/java/org/apache/maven/project/artifact/AttachedArtifact.java`
#### Snippet
```java
 */
@Deprecated
public class AttachedArtifact extends DefaultArtifact {

    private final Artifact parent;
```

### DeprecatedIsStillUsed
Deprecated member 'PathTranslator' is still used
in `maven-core/src/main/java/org/apache/maven/project/path/PathTranslator.java`
#### Snippet
```java
 */
@Deprecated
public interface PathTranslator {
    String ROLE = PathTranslator.class.getName();

```

### DeprecatedIsStillUsed
Deprecated member 'setResolveVersionRanges' is still used
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuildingRequest.java`
#### Snippet
```java
     */
    @Deprecated
    public ProjectBuildingRequest setResolveVersionRanges(boolean value) {
        this.resolveVersionRanges = value;
        return this;
```

### DeprecatedIsStillUsed
Deprecated member 'AbstractArtifactMetadata' is still used
in `maven-core/src/main/java/org/apache/maven/artifact/metadata/AbstractArtifactMetadata.java`
#### Snippet
```java
 */
@Deprecated
public abstract class AbstractArtifactMetadata
        extends org.apache.maven.repository.legacy.metadata.AbstractArtifactMetadata
        implements org.apache.maven.artifact.metadata.ArtifactMetadata {
```

### DeprecatedIsStillUsed
Deprecated member 'manageArtifact' is still used
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/ResolutionListener.java`
#### Snippet
```java

    @Deprecated
    void manageArtifact(Artifact artifact, Artifact replacement);

    // TODO Use the following two instead of manageArtifact
```

### DeprecatedIsStillUsed
Deprecated member 'getModulePathAdjustment' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated // This appears only to be used in test code
    public String getModulePathAdjustment(MavenProject moduleProject) throws IOException {
        // FIXME: This is hacky. What if module directory doesn't match artifactid, and parent
        // is coming from the repository??
```

### DeprecatedIsStillUsed
Deprecated member 'setReportArtifacts' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public void setReportArtifacts(Set<Artifact> reportArtifacts) {
        this.reportArtifacts = reportArtifacts;

```

### DeprecatedIsStillUsed
Deprecated member 'setDependencyArtifacts' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public void setDependencyArtifacts(Set<Artifact> dependencyArtifacts) {
        this.dependencyArtifacts = dependencyArtifacts;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setExtensionArtifacts' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public void setExtensionArtifacts(Set<Artifact> extensionArtifacts) {
        this.extensionArtifacts = extensionArtifacts;

```

### DeprecatedIsStillUsed
Deprecated member 'getExtensionArtifacts' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public Set<Artifact> getExtensionArtifacts() {
        return extensionArtifacts;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getDependencyArtifacts' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
     */
    @Deprecated
    public Set<Artifact> getDependencyArtifacts() {
        return dependencyArtifacts;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getReportArtifacts' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public Set<Artifact> getReportArtifacts() {
        return reportArtifacts;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getScriptSourceRoots' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public List<String> getScriptSourceRoots() {
        return scriptSourceRoots;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getCompileArtifacts' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public List<Artifact> getCompileArtifacts() {
        List<Artifact> list = new ArrayList<>(getArtifacts().size());

```

### DeprecatedIsStillUsed
Deprecated member 'setProjectBuildingRequest' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    // used by maven-dependency-tree
    @Deprecated
    public void setProjectBuildingRequest(ProjectBuildingRequest projectBuildingRequest) {
        this.projectBuilderConfiguration = projectBuildingRequest;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getReportPlugins' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public List<ReportPlugin> getReportPlugins() {
        if (getModel().getReporting() == null) {
            return Collections.emptyList();
```

### DeprecatedIsStillUsed
Deprecated member 'addAttachedArtifact' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
     * @throws DuplicateArtifactAttachmentException will never happen but leave it for backward compatibility
     */
    public void addAttachedArtifact(Artifact artifact) throws DuplicateArtifactAttachmentException {
        // if already there we remove it and add again
        int index = attachedArtifacts.indexOf(artifact);
```

### DeprecatedIsStillUsed
Deprecated member 'setScriptSourceRoots' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    protected void setScriptSourceRoots(List<String> scriptSourceRoots) {
        this.scriptSourceRoots = scriptSourceRoots;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getSystemClasspathElements' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public List<String> getSystemClasspathElements() throws DependencyResolutionRequiredException {
        List<String> list = new ArrayList<>(getArtifacts().size());

```

### DeprecatedIsStillUsed
Deprecated member 'addScriptSourceRoot' is still used
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java

    @Deprecated
    public void addScriptSourceRoot(String path) {
        if (path != null) {
            path = path.trim();
```

### DeprecatedIsStillUsed
Deprecated member 'createArtifacts' is still used
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    // USED BY MAVEN ASSEMBLY PLUGIN
    @Deprecated
    public static Set<Artifact> createArtifacts(
            ArtifactFactory artifactFactory,
            List<Dependency> dependencies,
```

### DeprecatedIsStillUsed
Deprecated member 'RepositoryCache' is still used
in `maven-core/src/main/java/org/apache/maven/artifact/repository/RepositoryCache.java`
#### Snippet
```java
// this here, possibly indefinitely.
//
public interface RepositoryCache {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'MavenSettingsBuilder' is still used
in `maven-core/src/main/java/org/apache/maven/settings/MavenSettingsBuilder.java`
#### Snippet
```java
 */
@Deprecated
public interface MavenSettingsBuilder {

    String ROLE = MavenSettingsBuilder.class.getName();
```

### DeprecatedIsStillUsed
Deprecated member 'populateFromSettings' is still used
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequestPopulator.java`
#### Snippet
```java
     */
    @Deprecated
    MavenExecutionRequest populateFromSettings(MavenExecutionRequest request, Settings settings)
            throws MavenExecutionRequestPopulationException;

```

### DeprecatedIsStillUsed
Deprecated member 'overwriteActiveProjects' is still used
in `maven-core/src/main/java/org/apache/maven/execution/ProjectActivation.java`
#### Snippet
```java
     */
    @Deprecated
    public void overwriteActiveProjects(List<String> activeProjectSelectors) {
        List<ProjectActivationSettings> projects = getProjects(pa -> pa.active).collect(Collectors.toList());
        this.activations.removeAll(projects);
```

### DeprecatedIsStillUsed
Deprecated member 'getSelectedProjects' is still used
in `maven-core/src/main/java/org/apache/maven/execution/ProjectActivation.java`
#### Snippet
```java
     */
    @Deprecated
    public List<String> getSelectedProjects() {
        return Collections.unmodifiableList(new ArrayList<>(getProjectSelectors(pa -> pa.active)));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'overwriteInactiveProjects' is still used
in `maven-core/src/main/java/org/apache/maven/execution/ProjectActivation.java`
#### Snippet
```java
     */
    @Deprecated
    public void overwriteInactiveProjects(List<String> inactiveProjectSelectors) {
        List<ProjectActivationSettings> projects = getProjects(pa -> !pa.active).collect(Collectors.toList());
        this.activations.removeAll(projects);
```

### DeprecatedIsStillUsed
Deprecated member 'getExcludedProjects' is still used
in `maven-core/src/main/java/org/apache/maven/execution/ProjectActivation.java`
#### Snippet
```java
     */
    @Deprecated
    public List<String> getExcludedProjects() {
        return Collections.unmodifiableList(new ArrayList<>(getProjectSelectors(pa -> !pa.active)));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'overwriteActiveProfiles' is still used
in `maven-core/src/main/java/org/apache/maven/execution/ProfileActivation.java`
#### Snippet
```java
     */
    @Deprecated
    public void overwriteActiveProfiles(List<String> activeProfileIds) {
        getActiveProfiles().forEach(this.activations::remove);
        activeProfileIds.forEach(this::activateOptionalProfile);
```

### DeprecatedIsStillUsed
Deprecated member 'getInactiveProfiles' is still used
in `maven-core/src/main/java/org/apache/maven/execution/ProfileActivation.java`
#### Snippet
```java
     */
    @Deprecated
    public List<String> getInactiveProfiles() {
        return Collections.unmodifiableList(new ArrayList<>(getProfileIds(pa -> !pa.active)));
    }
```

### DeprecatedIsStillUsed
Deprecated member 'overwriteInactiveProfiles' is still used
in `maven-core/src/main/java/org/apache/maven/execution/ProfileActivation.java`
#### Snippet
```java
     */
    @Deprecated
    public void overwriteInactiveProfiles(List<String> inactiveProfileIds) {
        getInactiveProfiles().forEach(this.activations::remove);
        inactiveProfileIds.forEach(this::deactivateOptionalProfile);
```

### DeprecatedIsStillUsed
Deprecated member 'phases' is still used
in `maven-core/src/main/java/org/apache/maven/lifecycle/mapping/DefaultLifecycleMapping.java`
#### Snippet
```java
    /** @deprecated use lifecycles instead */
    @Deprecated
    private Map<String, LifecyclePhase> phases;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'setRawModel' is still used
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelBuildingRequest.java`
#### Snippet
```java
     */
    @Deprecated
    ModelBuildingRequest setRawModel(Model rawModel);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'StringModelSource' is still used
in `maven-model-builder/src/main/java/org/apache/maven/model/building/StringModelSource.java`
#### Snippet
```java
 */
@Deprecated
public class StringModelSource extends StringSource implements ModelSource {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'UrlModelSource' is still used
in `maven-model-builder/src/main/java/org/apache/maven/model/building/UrlModelSource.java`
#### Snippet
```java
 */
@Deprecated
public class UrlModelSource extends UrlSource implements ModelSource {
    /**
     * Creates a new model source backed by the specified URL.
```

### DeprecatedIsStillUsed
Deprecated member 'DEBUG' is still used
in `maven-embedder/src/main/java/org/apache/maven/cli/CLIManager.java`
#### Snippet
```java
     * Use {@code -X/--verbose} instead. */
    @Deprecated
    public static final String DEBUG = "debug";

    protected Options options;
```

### DeprecatedIsStillUsed
Deprecated member 'getExecutionRootDirectory' is still used
in `maven-core/src/main/java/org/apache/maven/execution/MavenSession.java`
#### Snippet
```java
     */
    @Deprecated
    public String getExecutionRootDirectory() {
        return request.getBaseDirectory();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'DelegatingLocalArtifactRepository' is still used
in `maven-core/src/main/java/org/apache/maven/repository/DelegatingLocalArtifactRepository.java`
#### Snippet
```java
 */
@Deprecated
public class DelegatingLocalArtifactRepository extends MavenArtifactRepository {
    private LocalArtifactRepository buildReactor;

```

### DeprecatedIsStillUsed
Deprecated member 'DefaultJavaToolChain' is still used
in `maven-core/src/main/java/org/apache/maven/toolchain/java/DefaultJavaToolChain.java`
#### Snippet
```java
 */
@Deprecated
public class DefaultJavaToolChain extends JavaToolchainImpl {
    public static final String KEY_JAVAHOME = JavaToolchainImpl.KEY_JAVAHOME;

```

### DeprecatedIsStillUsed
Deprecated member 'setMultiModuleProjectDirectory' is still used
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
     */
    @Deprecated
    void setMultiModuleProjectDirectory(File file);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getMultiModuleProjectDirectory' is still used
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
     */
    @Deprecated
    File getMultiModuleProjectDirectory();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'setBaseDirectory' is still used
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
     */
    @Deprecated
    MavenExecutionRequest setBaseDirectory(File basedir);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'isUseLegacyLocalRepository' is still used
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
     */
    @Deprecated
    boolean isUseLegacyLocalRepository();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getInactiveProfiles' is still used
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
     */
    @Deprecated
    List<String> getInactiveProfiles();

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'setActiveProfiles' is still used
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
     */
    @Deprecated
    MavenExecutionRequest setActiveProfiles(List<String> profiles);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'setSelectedProjects' is still used
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
     */
    @Deprecated
    MavenExecutionRequest setSelectedProjects(List<String> projects);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getBaseDirectory' is still used
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
     */
    @Deprecated
    String getBaseDirectory();

    // Timing (remove this)
```

### DeprecatedIsStillUsed
Deprecated member 'getExecutionRootDirectory' is still used
in `api/maven-api-core/src/main/java/org/apache/maven/api/Session.java`
#### Snippet
```java
    @Deprecated
    @Nonnull
    Path getExecutionRootDirectory();

    @Nonnull
```

### DeprecatedIsStillUsed
Deprecated member 'MavenSettingsMerger' is still used
in `maven-settings-builder/src/main/java/org/apache/maven/settings/merge/MavenSettingsMerger.java`
#### Snippet
```java
 */
@Deprecated
public class MavenSettingsMerger {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'SettingsSource' is still used
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/SettingsSource.java`
#### Snippet
```java
 */
@Deprecated
public interface SettingsSource extends Source {}

```

### DeprecatedIsStillUsed
Deprecated member 'setLog' is still used
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/Mojo.java`
#### Snippet
```java
     */
    @Deprecated
    void setLog(Log log);

    /**
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `maven-core/src/main/java/org/apache/maven/plugin/DebugConfigurationListener.java`
#### Snippet
```java
                    buf.append(", ");
                }
                buf.append(String.valueOf(Array.get(obj, i)));
            }
            buf.append(']');
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'contains()' check
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataGraph.java`
#### Snippet
```java

        MetadataGraphVertex vertex = new MetadataGraphVertex(node.md, versionedVertices, scopedVertices);
        if (!vertices.contains(vertex)) {
            vertices.add(vertex);
        }
```

### RedundantCollectionOperation
Unnecessary 'contains()' check
in `maven-core/src/main/java/org/apache/maven/lifecycle/MavenExecutionPlan.java`
#### Snippet
```java
        for (ExecutionPlanItem executionPlanItem : planItems) {
            final String phase = executionPlanItem.getLifecyclePhase();
            if (!result.contains(phase)) {
                result.add(phase);
            }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java
            return new AbstractImmutableSet<Entry<Object, Object>>() {
                @Override
                public Iterator<Entry<Object, Object>> iterator() {
                    return new Iterator<Entry<Object, Object>>() {
                        @Override
                        public boolean hasNext() {
                            return false;
                        }

                        @Override
                        public Entry<Object, Object> next() {
                            throw new NoSuchElementException();
                        }
                    };
                }

                @Override
                public int size() {
                    return 0;
                }
            };
```

### DuplicatedCode
Duplicated code
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java
        if (collection == null) {
            return emptyList();
        } else if (collection instanceof AbstractImmutableList) {
            return (List<E>) collection;
        } else {
            switch (collection.size()) {
                case 0:
                    return emptyList();
                case 1:
                    return singletonList(collection.iterator().next());
                case 2:
                    Iterator<E> it = collection.iterator();
                    return new List2<>(it.next(), it.next());
                default:
                    return new ListN<>(collection);
            }
        }
```

### DuplicatedCode
Duplicated code
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java
        if (map == null) {
            return emptyMap();
        } else if (map instanceof AbstractImmutableMap) {
            return map;
        } else {
            switch (map.size()) {
                case 0:
                    return emptyMap();
                case 1:
                    Map.Entry<K, V> entry = map.entrySet().iterator().next();
                    return singletonMap(entry.getKey(), entry.getValue());
                default:
                    return new MapN<>(map);
            }
        }
```

### DuplicatedCode
Duplicated code
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java
            if (fromIndex < 0) {
                throw new IndexOutOfBoundsException("fromIndex = " + fromIndex);
            }
            if (toIndex > size()) {
                throw new IndexOutOfBoundsException("toIndex = " + toIndex);
            }
            if (fromIndex > toIndex) {
                throw new IllegalArgumentException("fromIndex(" + fromIndex + ") > toIndex(" + toIndex + ")");
            }
            return new SubList(fromIndex, toIndex);
```

### DuplicatedCode
Duplicated code
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java
            return new AbstractImmutableSet<Entry<K, V>>() {
                @Override
                public Iterator<Entry<K, V>> iterator() {
                    return new Iterator<Entry<K, V>>() {
                        int index = 0;

                        @Override
                        public boolean hasNext() {
                            return index == 0;
                        }

                        @Override
                        public Entry<K, V> next() {
                            if (index++ == 0) {
                                return entry;
                            }
                            throw new NoSuchElementException();
                        }
                    };
                }

                @Override
                public int size() {
                    return 1;
                }
            };
```

### DuplicatedCode
Duplicated code
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java
            return new AbstractImmutableSet<Entry<K, V>>() {
                @Override
                public Iterator<Entry<K, V>> iterator() {
                    return new Iterator<Entry<K, V>>() {
                        int index = 0;

                        @Override
                        public boolean hasNext() {
                            return index < entries.length;
                        }

                        @SuppressWarnings("unchecked")
                        @Override
                        public Entry<K, V> next() {
                            if (index < entries.length) {
                                return (Entry<K, V>) entries[index++];
                            }
                            throw new NoSuchElementException();
                        }
                    };
                }

                @Override
                public int size() {
                    return entries.length;
                }
            };
```

### DuplicatedCode
Duplicated code
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/InputLocation.java`
#### Snippet
```java
        if (source == null) {
            return target;
        } else if (target == null) {
            return source;
        }

        Map<Object, InputLocation> locations;
        Map<Object, InputLocation> sourceLocations = source.locations;
        Map<Object, InputLocation> targetLocations = target.locations;
```

### DuplicatedCode
Duplicated code
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
            sb.append(groupId);
            sb.append(" -DartifactId=");
            sb.append(artifactId);
            sb.append(" -Dversion=");
            sb.append(version);

            // insert classifier only if it was used in the artifact
            if (classifier != null && !classifier.equals("")) {
                sb.append(" -Dclassifier=");
                sb.append(classifier);
            }
            sb.append(" -Dpackaging=");
            sb.append(type);
            sb.append(" -Dfile=/path/to/file");
```

### DuplicatedCode
Duplicated code
in `maven-builder-support/src/main/java/org/apache/maven/building/DefaultProblem.java`
#### Snippet
```java
        StringBuilder buffer = new StringBuilder(256);

        if (getSource().length() > 0) {
            if (buffer.length() > 0) {
                buffer.append(", ");
            }
            buffer.append(getSource());
        }

        if (getLineNumber() > 0) {
            if (buffer.length() > 0) {
                buffer.append(", ");
            }
            buffer.append("line ").append(getLineNumber());
        }

        if (getColumnNumber() > 0) {
            if (buffer.length() > 0) {
                buffer.append(", ");
            }
            buffer.append("column ").append(getColumnNumber());
        }

        return buffer.toString();
```

### DuplicatedCode
Duplicated code
in `maven-builder-support/src/main/java/org/apache/maven/building/DefaultProblem.java`
#### Snippet
```java
        String msg;

        if (message != null && message.length() > 0) {
            msg = message;
        } else {
            msg = exception.getMessage();

            if (msg == null) {
                msg = "";
            }
        }

        return msg;
```

### DuplicatedCode
Duplicated code
in `maven-builder-support/src/main/java/org/apache/maven/building/DefaultProblem.java`
#### Snippet
```java
        StringBuilder buffer = new StringBuilder(128);

        buffer.append('[').append(getSeverity()).append("] ");
        buffer.append(getMessage());
        String location = getLocation();
        if (!location.isEmpty()) {
            buffer.append(" @ ");
            buffer.append(location);
        }

        return buffer.toString();
```

### DuplicatedCode
Duplicated code
in `maven-compat/src/main/java/org/apache/maven/artifact/deployer/DefaultArtifactDeployer.java`
#### Snippet
```java
        for (ArtifactMetadata metadata : artifact.getMetadataList()) {
            if (metadata instanceof ProjectArtifactMetadata) {
                org.eclipse.aether.artifact.Artifact pomArtifact = new SubArtifact(mainArtifact, "", "pom");
                pomArtifact = pomArtifact.setFile(((ProjectArtifactMetadata) metadata).getFile());
                request.addArtifact(pomArtifact);
            } else if (metadata instanceof SnapshotArtifactRepositoryMetadata
                    || metadata instanceof ArtifactRepositoryMetadata) {
                // eaten, handled by repo system
            } else {
                request.addMetadata(new MetadataBridge(metadata));
            }
        }
```

### DuplicatedCode
Duplicated code
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/layout/FlatRepositoryLayout.java`
#### Snippet
```java
        path.append(artifact.getArtifactId()).append(ARTIFACT_SEPARATOR).append(artifact.getVersion());

        if (artifact.hasClassifier()) {
            path.append(ARTIFACT_SEPARATOR).append(artifact.getClassifier());
        }

        if (artifactHandler.getExtension() != null
                && artifactHandler.getExtension().length() > 0) {
            path.append(GROUP_SEPARATOR).append(artifactHandler.getExtension());
        }

        return path.toString();
```

### DuplicatedCode
Duplicated code
in `maven-compat/src/main/java/org/apache/maven/profiles/activation/OperatingSystemProfileActivator.java`
#### Snippet
```java
        boolean result = ensureAtLeastOneNonNull(os);

        if (result && os.getFamily() != null) {
            result = determineFamilyMatch(os.getFamily());
        }
        if (result && os.getName() != null) {
            result = determineNameMatch(os.getName());
        }
        if (result && os.getArch() != null) {
            result = determineArchMatch(os.getArch());
        }
        if (result && os.getVersion() != null) {
            result = determineVersionMatch(os.getVersion());
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `maven-compat/src/main/java/org/apache/maven/project/path/DefaultPathTranslator.java`
#### Snippet
```java
        File file = new File(s);
        if (file.isAbsolute()) {
            // path was already absolute, just normalize file separator and we're done
            s = file.getPath();
        } else if (file.getPath().startsWith(File.separator)) {
            // drive-relative Windows path, don't align with project directory but with drive root
            s = file.getAbsolutePath();
        } else {
            // an ordinary relative path, align with project directory
            s = new File(new File(basedir, s).toURI().normalize()).getAbsolutePath();
        }
```

### DuplicatedCode
Duplicated code
in `maven-compat/src/main/java/org/apache/maven/repository/DefaultMirrorSelector.java`
#### Snippet
```java
        String repoId = repository.getId();

        if (repoId != null && mirrors != null) {
            for (Mirror mirror : mirrors) {
                if (repoId.equals(mirror.getMirrorOf()) && matchesLayout(repository, mirror)) {
                    return mirror;
                }
            }

            for (Mirror mirror : mirrors) {
                if (matchPattern(repository, mirror.getMirrorOf()) && matchesLayout(repository, mirror)) {
                    return mirror;
                }
            }
        }

        return null;
```

### DuplicatedCode
Duplicated code
in `maven-compat/src/main/java/org/apache/maven/repository/DefaultMirrorSelector.java`
#### Snippet
```java
                if (repo.length() > 1 && repo.startsWith("!")) {
                    if (repo.substring(1).equals(originalId)) {
                        // explicitly exclude. Set result and stop processing.
                        result = false;
                        break;
                    }
                }
                // check for exact match
                else if (repo.equals(originalId)) {
                    result = true;
                    break;
                }
                // check for external:*
                else if (EXTERNAL_WILDCARD.equals(repo) && isExternalRepo(originalRepository)) {
                    result = true;
                    // don't stop processing in case a future segment explicitly excludes this repo
                }
                // check for external:http:*
                else if (EXTERNAL_HTTP_WILDCARD.equals(repo) && isExternalHttpRepo(originalRepository)) {
                    result = true;
                    // don't stop processing in case a future segment explicitly excludes this repo
                } else if (WILDCARD.equals(repo)) {
                    result = true;
                    // don't stop processing in case a future segment explicitly excludes this repo
                }
```

### DuplicatedCode
Duplicated code
in `maven-compat/src/main/java/org/apache/maven/repository/DefaultMirrorSelector.java`
#### Snippet
```java
        try {
            URL url = new URL(originalRepository.getUrl());
            return ("http".equalsIgnoreCase(url.getProtocol())
                            || "dav".equalsIgnoreCase(url.getProtocol())
                            || "dav:http".equalsIgnoreCase(url.getProtocol())
                            || "dav+http".equalsIgnoreCase(url.getProtocol()))
                    && !isLocal(url.getHost());
        } catch (MalformedURLException e) {
            // bad url just skip it here. It should have been validated already, but the wagon lookup will deal with it
            return false;
        }
```

### DuplicatedCode
Duplicated code
in `maven-compat/src/main/java/org/apache/maven/repository/DefaultMirrorSelector.java`
#### Snippet
```java
        boolean result = false;

        // simple checks first to short circuit processing below.
        if ((mirrorLayout == null || mirrorLayout.isEmpty()) || WILDCARD.equals(mirrorLayout)) {
            result = true;
        } else if (mirrorLayout.equals(repoLayout)) {
            result = true;
        } else {
            // process the list
            String[] layouts = mirrorLayout.split(",");
            for (String layout : layouts) {
                // see if this is a negative match
                if (layout.length() > 1 && layout.startsWith("!")) {
                    if (layout.substring(1).equals(repoLayout)) {
                        // explicitly exclude. Set result and stop processing.
                        result = false;
                        break;
                    }
                }
                // check for exact match
                else if (layout.equals(repoLayout)) {
                    result = true;
                    break;
                } else if (WILDCARD.equals(layout)) {
                    result = true;
                    // don't stop processing in case a future segment explicitly excludes this repo
                }
            }
        }

        return result;
```

### DuplicatedCode
Duplicated code
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
        String protocol = repository.getProtocol();

        Wagon wagon;

        try {
            wagon = getWagon(protocol);
        } catch (UnsupportedProtocolException e) {
            throw new TransferFailedException("Unsupported Protocol: '" + protocol + "': " + e.getMessage(), e);
        }

        if (downloadMonitor != null) {
            wagon.addTransferListener(downloadMonitor);
        }
```

### DuplicatedCode
Duplicated code
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        boolean enabled = true;

        String updatePolicy = null;

        String checksumPolicy = null;

        if (policy != null) {
            enabled = policy.isEnabled();

            if (policy.getUpdatePolicy() != null) {
                updatePolicy = policy.getUpdatePolicy();
            }
            if (policy.getChecksumPolicy() != null) {
                checksumPolicy = policy.getChecksumPolicy();
            }
        }

        return new ArtifactRepositoryPolicy(enabled, updatePolicy, checksumPolicy);
```

### DuplicatedCode
Duplicated code
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
if (repositories == null) {
            return null;
        }

        Map<String, List<ArtifactRepository>> reposByKey = new LinkedHashMap<>();

        for (ArtifactRepository repository : repositories) {
            String key = repository.getId();

            List<ArtifactRepository> aliasedRepos = reposByKey.computeIfAbsent(key, k -> new ArrayList<>());

            aliasedRepos.add(repository);
        }

        List<ArtifactRepository> effectiveRepositories = new ArrayList<>();

        for (List<ArtifactRepository> aliasedRepos : reposByKey.values()) {
            List<ArtifactRepository> mirroredRepos = new ArrayList<>();

            List<ArtifactRepositoryPolicy> releasePolicies = new ArrayList<>(aliasedRepos.size());

            for (ArtifactRepository aliasedRepo : aliasedRepos) {
                releasePolicies.add(aliasedRepo.getReleases());
                mirroredRepos.addAll(aliasedRepo.getMirroredRepositories());
            }

            ArtifactRepositoryPolicy releasePolicy = getEffectivePolicy(releasePolicies);

            List<ArtifactRepositoryPolicy> snapshotPolicies = new ArrayList<>(aliasedRepos.size());

            for (ArtifactRepository aliasedRepo : aliasedRepos) {
                snapshotPolicies.add(aliasedRepo.getSnapshots());
            }

            ArtifactRepositoryPolicy snapshotPolicy = getEffectivePolicy(snapshotPolicies);

            ArtifactRepository aliasedRepo = aliasedRepos.get(0);

            ArtifactRepository effectiveRepository = createArtifactRepository(
                    aliasedRepo.getId(), aliasedRepo.getUrl(), aliasedRepo.getLayout(), snapshotPolicy, releasePolicy);

            effectiveRepository.setAuthentication(aliasedRepo.getAuthentication());

            effectiveRepository.setProxy(aliasedRepo.getProxy());

            effectiveRepository.setMirroredRepositories(mirroredRepos);

            effectiveRepository.setBlocked(aliasedRepo.isBlocked());

            effectiveRepositories.add(effectiveRepository);
        }

        return effectiveRepositories;
```

### DuplicatedCode
Duplicated code
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        if (session != null) {
            org.eclipse.aether.repository.MirrorSelector selector = session.getMirrorSelector();
            if (selector != null) {
                RemoteRepository repo = selector.getMirror(RepositoryUtils.toRepo(repository));
                if (repo != null) {
                    Mirror mirror = new Mirror();
                    mirror.setId(repo.getId());
                    mirror.setUrl(repo.getUrl());
                    mirror.setLayout(repo.getContentType());
                    mirror.setBlocked(repo.isBlocked());
                    return mirror;
                }
            }
        }
        return null;
```

### DuplicatedCode
Duplicated code
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        if (mirror != null) {
            ArtifactRepository original = createArtifactRepository(
                    repository.getId(),
                    repository.getUrl(),
                    repository.getLayout(),
                    repository.getSnapshots(),
                    repository.getReleases());

            repository.setMirroredRepositories(Collections.singletonList(original));

            repository.setId(mirror.getId());
            repository.setUrl(mirror.getUrl());

            if (StringUtils.isNotEmpty(mirror.getLayout())) {
                repository.setLayout(getLayout(mirror.getLayout()));
            }

            repository.setBlocked(mirror.isBlocked());
        }
```

### DuplicatedCode
Duplicated code
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        if (session != null) {
            AuthenticationSelector selector = session.getAuthenticationSelector();
            if (selector != null) {
                RemoteRepository repo = RepositoryUtils.toRepo(repository);
                org.eclipse.aether.repository.Authentication auth = selector.getAuthentication(repo);
                if (auth != null) {
                    repo = new RemoteRepository.Builder(repo)
                            .setAuthentication(auth)
                            .build();
                    AuthenticationContext authCtx = AuthenticationContext.forRepository(session, repo);
                    Authentication result = new Authentication(
                            authCtx.get(AuthenticationContext.USERNAME), authCtx.get(AuthenticationContext.PASSWORD));
                    result.setPrivateKey(authCtx.get(AuthenticationContext.PRIVATE_KEY_PATH));
                    result.setPassphrase(authCtx.get(AuthenticationContext.PRIVATE_KEY_PASSPHRASE));
                    authCtx.close();
                    return result;
                }
            }
        }
        return null;
```

### DuplicatedCode
Duplicated code
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
        if (session != null) {
            ProxySelector selector = session.getProxySelector();
            if (selector != null) {
                RemoteRepository repo = RepositoryUtils.toRepo(repository);
                org.eclipse.aether.repository.Proxy proxy = selector.getProxy(repo);
                if (proxy != null) {
                    Proxy p = new Proxy();
                    p.setHost(proxy.getHost());
                    p.setProtocol(proxy.getType());
                    p.setPort(proxy.getPort());
                    if (proxy.getAuthentication() != null) {
                        repo = new RemoteRepository.Builder(repo)
                                .setProxy(proxy)
                                .build();
                        AuthenticationContext authCtx = AuthenticationContext.forProxy(session, repo);
                        p.setUserName(authCtx.get(AuthenticationContext.USERNAME));
                        p.setPassword(authCtx.get(AuthenticationContext.PASSWORD));
                        p.setNtlmDomain(authCtx.get(AuthenticationContext.NTLM_DOMAIN));
                        p.setNtlmHost(authCtx.get(AuthenticationContext.NTLM_WORKSTATION));
                        authCtx.close();
                    }
                    return p;
                }
            }
        }
        return null;
```

### DuplicatedCode
Duplicated code
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java`
#### Snippet
```java
            String id = repo.getId();

            if (id == null || id.isEmpty()) {
                throw new InvalidRepositoryException("Repository identifier missing", "");
            }

            String url = repo.getUrl();

            if (url == null || url.isEmpty()) {
                throw new InvalidRepositoryException("URL missing for repository " + id, id);
            }

            ArtifactRepositoryPolicy snapshots = buildArtifactRepositoryPolicy(repo.getSnapshots());

            ArtifactRepositoryPolicy releases = buildArtifactRepositoryPolicy(repo.getReleases());
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/DefaultProjectDependenciesResolver.java`
#### Snippet
```java
        Set<String> projectIds = new HashSet<>(projects.size() * 2);

        for (MavenProject p : projects) {
            String key = ArtifactUtils.key(p.getGroupId(), p.getArtifactId(), p.getVersion());
            projectIds.add(key);
        }
        return projectIds;
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/RepositoryUtils.java`
#### Snippet
```java
        ArtifactType stereotype = stereotypes.get(dependency.getType());
        if (stereotype == null) {
            stereotype = new DefaultArtifactType(dependency.getType());
        }

        boolean system =
                dependency.getSystemPath() != null && dependency.getSystemPath().length() > 0;

        Map<String, String> props = null;
        if (system) {
            props = Collections.singletonMap(ArtifactProperties.LOCAL_PATH, dependency.getSystemPath());
        }

        Artifact artifact = new DefaultArtifact(
                dependency.getGroupId(),
                dependency.getArtifactId(),
                dependency.getClassifier(),
                null,
                dependency.getVersion(),
                props,
                stereotype);
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/artifact/factory/DefaultArtifactFactory.java`
#### Snippet
```java
        String desiredScope = Artifact.SCOPE_RUNTIME;

        if (inheritedScope == null) {
            desiredScope = scope;
        } else if (Artifact.SCOPE_TEST.equals(scope) || Artifact.SCOPE_PROVIDED.equals(scope)) {
            return null;
        } else if (Artifact.SCOPE_COMPILE.equals(scope) && Artifact.SCOPE_COMPILE.equals(inheritedScope)) {
            // added to retain compile artifactScope. Remove if you want compile inherited as runtime
            desiredScope = Artifact.SCOPE_COMPILE;
        }

        if (Artifact.SCOPE_TEST.equals(inheritedScope)) {
            desiredScope = Artifact.SCOPE_TEST;
        }

        if (Artifact.SCOPE_PROVIDED.equals(inheritedScope)) {
            desiredScope = Artifact.SCOPE_PROVIDED;
        }

        if (Artifact.SCOPE_SYSTEM.equals(scope)) {
            // system scopes come through unchanged...
            desiredScope = Artifact.SCOPE_SYSTEM;
        }

        ArtifactHandler handler = artifactHandlerManager.getArtifactHandler(type);

        return new DefaultArtifact(
                groupId, artifactId, versionRange, desiredScope, type, classifier, handler, optional);
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequestPopulator.java`
#### Snippet
```java
            request.addProfile(SettingsUtils.convertFromSettingsProfile(rawProfile));

            if (settings.getActiveProfiles().contains(rawProfile.getId())) {
                List<Repository> remoteRepositories = rawProfile.getRepositories();
                for (Repository remoteRepository : remoteRepositories) {
                    try {
                        request.addRemoteRepository(MavenRepositorySystem.buildArtifactRepository(remoteRepository));
                    } catch (InvalidRepositoryException e) {
                        // do nothing for now
                    }
                }

                List<Repository> pluginRepositories = rawProfile.getPluginRepositories();
                for (Repository pluginRepo : pluginRepositories) {
                    try {
                        request.addPluginArtifactRepository(MavenRepositorySystem.buildArtifactRepository(pluginRepo));
                    } catch (InvalidRepositoryException e) {
                        // do nothing for now
                    }
                }
            }
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/internal/impl/DefaultArtifactCoordinateFactory.java`
#### Snippet
```java
        nonNull(request, "request can not be null");
        DefaultSession session =
                cast(DefaultSession.class, request.getSession(), "request.session should be a " + DefaultSession.class);
        ArtifactType type = null;
        if (request.getType() != null) {
            type = session.getSession().getArtifactTypeRegistry().get(request.getType());
        }
        String str1 = request.getClassifier();
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/lifecycle/mapping/Lifecycle.java`
#### Snippet
```java
        if (lphases == null) {
            return null;
        }

        if (lphases.isEmpty()) {
            return Collections.emptyMap();
        }

        Map<String, String> phases = new LinkedHashMap<>();
        for (Map.Entry<String, LifecyclePhase> e : lphases.entrySet()) {
            phases.put(e.getKey(), e.getValue().toString());
        }
        return phases;
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginArtifactsCache.java`
#### Snippet
```java
            workspace = RepositoryUtils.getWorkspace(session);
            this.localRepo = session.getLocalRepository();
            this.repositories = new ArrayList<>(repositories.size());
            for (RemoteRepository repository : repositories) {
                if (repository.isRepositoryManager()) {
                    this.repositories.addAll(repository.getMirroredRepositories());
                } else {
                    this.repositories.add(repository);
                }
            }
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginRealmCache.java`
#### Snippet
```java
            this.localRepo = session.getLocalRepository();
            this.repositories = new ArrayList<>(repositories.size());
            for (RemoteRepository repository : repositories) {
                if (repository.isRepositoryManager()) {
                    this.repositories.addAll(repository.getMirroredRepositories());
                } else {
                    this.repositories.add(repository);
                }
            }
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginArtifactsCache.java`
#### Snippet
```java
            this.filter = extensionFilter;

            int hash = 17;
            hash = hash * 31 + CacheUtils.pluginHashCode(plugin);
            hash = hash * 31 + Objects.hashCode(workspace);
            hash = hash * 31 + Objects.hashCode(localRepo);
            hash = hash * 31 + RepositoryUtils.repositoriesHashCode(repositories);
            hash = hash * 31 + Objects.hashCode(extensionFilter);
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
        Object value = null;

        if (expr == null) {
            return null;
        }

        String expression = stripTokens(expr);
        if (expression.equals(expr)) {
            int index = expr.indexOf("${");
            if (index >= 0) {
                int lastIndex = expr.indexOf('}', index);
                if (lastIndex >= 0) {
                    String retVal = expr.substring(0, index);

                    if ((index > 0) && (expr.charAt(index - 1) == '$')) {
                        retVal += expr.substring(index + 1, lastIndex + 1);
                    } else {
                        Object subResult = evaluate(expr.substring(index, lastIndex + 1));

                        if (subResult != null) {
                            retVal += subResult;
                        } else {
                            retVal += "$" + expr.substring(index + 1, lastIndex + 1);
                        }
                    }

                    retVal += evaluate(expr.substring(lastIndex + 1));
                    return retVal;
                }
            }

            // Was not an expression
            return expression.replace("$$", "$");
        }
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
            try {
                int pathSeparator = expression.indexOf('/');

                if (pathSeparator > 0) {
                    String pathExpression = expression.substring(1, pathSeparator);
                    value = ReflectionValueExtractor.evaluate(pathExpression, session);
                    value = value + expression.substring(pathSeparator);
                } else {
                    value = ReflectionValueExtractor.evaluate(expression.substring(1), session);
                }
            } catch (Exception e) {
                // TODO don't catch exception
                throw new ExpressionEvaluationException(
                        "Error evaluating plugin parameter expression: " + expression, e);
            }
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
            try {
                int pathSeparator = expression.indexOf('/');

                if (pathSeparator > 0) {
                    String pathExpression = expression.substring(0, pathSeparator);
                    value = ReflectionValueExtractor.evaluate(pathExpression, project);
                    value = value + expression.substring(pathSeparator);
                } else {
                    value = ReflectionValueExtractor.evaluate(expression.substring(1), project);
                }
            } catch (Exception e) {
                // TODO don't catch exception
                throw new ExpressionEvaluationException(
                        "Error evaluating plugin parameter expression: " + expression, e);
            }
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
            try {
                int pathSeparator = expression.indexOf('/');

                if (pathSeparator > 0) {
                    String pathExpression = expression.substring(1, pathSeparator);
                    value = ReflectionValueExtractor.evaluate(pathExpression, session.getSettings());
                    value = value + expression.substring(pathSeparator);
                } else {
                    value = ReflectionValueExtractor.evaluate(expression.substring(1), session.getSettings());
                }
            } catch (Exception e) {
                // TODO don't catch exception
                throw new ExpressionEvaluationException(
                        "Error evaluating plugin parameter expression: " + expression, e);
            }
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
        if (value instanceof String) {
            // TODO without #, this could just be an evaluate call...

            String val = (String) value;

            int exprStartDelimiter = val.indexOf("${");

            if (exprStartDelimiter >= 0) {
                if (exprStartDelimiter > 0) {
                    value = val.substring(0, exprStartDelimiter) + evaluate(val.substring(exprStartDelimiter));
                } else {
                    value = evaluate(val.substring(exprStartDelimiter));
                }
            }
        }

        return value;
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultPluginDependenciesResolver.java`
#### Snippet
```java
org.eclipse.aether.artifact.Artifact art = dep.getArtifact();

                buffer.append(art);
                if (StringUtils.isNotEmpty(dep.getScope())) {
                    buffer.append(':').append(dep.getScope());
                }

                if (dep.isOptional()) {
                    buffer.append(" (optional)");
                }

                // TODO We currently cannot tell which <dependencyManagement> section contained the management
                //      information. When the resolver provides this information, these log messages should be updated
                //      to contain it.
                if ((node.getManagedBits() & DependencyNode.MANAGED_SCOPE) == DependencyNode.MANAGED_SCOPE) {
                    final String premanagedScope = DependencyManagerUtils.getPremanagedScope(node);
                    buffer.append(" (scope managed from ");
                    buffer.append(Objects.toString(premanagedScope, "default"));
                    buffer.append(')');
                }

                if ((node.getManagedBits() & DependencyNode.MANAGED_VERSION) == DependencyNode.MANAGED_VERSION) {
                    final String premanagedVersion = DependencyManagerUtils.getPremanagedVersion(node);
                    buffer.append(" (version managed from ");
                    buffer.append(Objects.toString(premanagedVersion, "default"));
                    buffer.append(')');
                }

                if ((node.getManagedBits() & DependencyNode.MANAGED_OPTIONAL) == DependencyNode.MANAGED_OPTIONAL) {
                    final Boolean premanagedOptional = DependencyManagerUtils.getPremanagedOptional(node);
                    buffer.append(" (optionality managed from ");
                    buffer.append(Objects.toString(premanagedOptional, "default"));
                    buffer.append(')');
                }

                if ((node.getManagedBits() & DependencyNode.MANAGED_EXCLUSIONS) == DependencyNode.MANAGED_EXCLUSIONS) {
                    final Collection<org.eclipse.aether.graph.Exclusion> premanagedExclusions =
                            DependencyManagerUtils.getPremanagedExclusions(node);

                    buffer.append(" (exclusions managed from ");
                    buffer.append(Objects.toString(premanagedExclusions, "default"));
                    buffer.append(')');
                }

                if ((node.getManagedBits() & DependencyNode.MANAGED_PROPERTIES) == DependencyNode.MANAGED_PROPERTIES) {
                    final Map<String, String> premanagedProperties =
                            DependencyManagerUtils.getPremanagedProperties(node);

                    buffer.append(" (properties managed from ");
                    buffer.append(Objects.toString(premanagedProperties, "default"));
                    buffer.append(')');
                }
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultPluginManager.java`
#### Snippet
```java
        MavenSession session = legacySupport.getSession();

        PluginDescriptor pluginDescriptor;
        try {
            pluginDescriptor = pluginManager.getPluginDescriptor(
                    plugin, session.getCurrentProject().getRemotePluginRepositories(), session.getRepositorySession());

            pluginManager.setupPluginRealm(pluginDescriptor, session, null, null, null);
        } catch (Exception e) {
            throw new PluginManagerException(plugin, e.getMessage(), e);
        }

        ClassLoader oldClassLoader = Thread.currentThread().getContextClassLoader();
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/plugin/prefix/NoPluginFoundForPrefixException.java`
#### Snippet
```java
        StringBuilder repos = new StringBuilder("[");

        if (localRepository != null) {
            repos.append(localRepository.getId())
                    .append(" (")
                    .append(localRepository.getBasedir())
                    .append(")");
        }

        if (remoteRepositories != null && !remoteRepositories.isEmpty()) {
            for (RemoteRepository repository : remoteRepositories) {
                repos.append(", ");

                if (repository != null) {
                    repos.append(repository.getId())
                            .append(" (")
                            .append(repository.getUrl())
                            .append(")");
                }
            }
        }

        repos.append("]");

        return repos.toString();
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/plugin/prefix/internal/DefaultPluginPrefixResolver.java`
#### Snippet
```java
        if (request.getPom() != null && request.getPom().getBuild() != null) {
            Build build = request.getPom().getBuild();

            result = resolveFromProject(request, build.getPlugins());

            if (result == null && build.getPluginManagement() != null) {
                result = resolveFromProject(request, build.getPluginManagement().getPlugins());
            }
        }

        return result;
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/plugin/prefix/internal/DefaultPluginPrefixResolver.java`
#### Snippet
```java
        RepositoryListener listener = session.getRepositoryListener();
        if (listener != null) {
            RepositoryEvent.Builder event = new RepositoryEvent.Builder(session, EventType.METADATA_INVALID);
            event.setTrace(trace);
            event.setMetadata(metadata);
            event.setException(exception);
            event.setRepository(repository);
            listener.metadataInvalid(event.build());
        }
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
                Dependency dependency = new Dependency();

                dependency.setArtifactId(a.getArtifactId());
                dependency.setGroupId(a.getGroupId());
                dependency.setVersion(a.getVersion());
                dependency.setScope(a.getScope());
                dependency.setType(a.getType());
                dependency.setClassifier(a.getClassifier());

                list.add(dependency);
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java
        Artifact pomArtifact = new DefaultArtifact(groupId, artifactId, "", "pom", version);

        try {
            ArtifactRequest request = new ArtifactRequest(pomArtifact, repositories, context);
            request.setTrace(trace);
            pomArtifact = resolver.resolveArtifact(session, request).getArtifact();
        } catch (ArtifactResolutionException e) {
            throw new UnresolvableModelException(e.getMessage(), groupId, artifactId, version, e);
        }

        return new ArtifactModelSource(pomArtifact.getFile(), groupId, artifactId, version);
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java
try {
            final Artifact artifact =
                    new DefaultArtifact(parent.getGroupId(), parent.getArtifactId(), "", "pom", parent.getVersion());

            final VersionRangeRequest versionRangeRequest = new VersionRangeRequest(artifact, repositories, context);
            versionRangeRequest.setTrace(trace);

            final VersionRangeResult versionRangeResult = resolver.resolveVersionRange(session, versionRangeRequest);

            if (versionRangeResult.getHighestVersion() == null) {
                throw new UnresolvableModelException(
                        String.format(
                                "No versions matched the requested parent version range '%s'", parent.getVersion()),
                        parent.getGroupId(),
                        parent.getArtifactId(),
                        parent.getVersion());
            }

            if (versionRangeResult.getVersionConstraint() != null
                    && versionRangeResult.getVersionConstraint().getRange() != null
                    && versionRangeResult.getVersionConstraint().getRange().getUpperBound() == null) {
                // Message below is checked for in the MNG-2199 core IT.
                throw new UnresolvableModelException(
                        String.format(
                                "The requested parent version range '%s' does not specify an upper bound",
                                parent.getVersion()),
                        parent.getGroupId(),
                        parent.getArtifactId(),
                        parent.getVersion());
            }

            String newVersion = versionRangeResult.getHighestVersion().toString();
            if (!parent.getVersion().equals(newVersion)) {
                modified.set(parent.withVersion(newVersion));
            }

            return resolveModel(parent.getGroupId(), parent.getArtifactId(), newVersion);
        } catch (final VersionRangeResolutionException e) {
            throw new UnresolvableModelException(
                    e.getMessage(), parent.getGroupId(), parent.getArtifactId(), parent.getVersion(), e);
        }
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java
final Artifact artifact = new DefaultArtifact(
                    dependency.getGroupId(), dependency.getArtifactId(), "", "pom", dependency.getVersion());

            final VersionRangeRequest versionRangeRequest = new VersionRangeRequest(artifact, repositories, context);
            versionRangeRequest.setTrace(trace);

            final VersionRangeResult versionRangeResult = resolver.resolveVersionRange(session, versionRangeRequest);

            if (versionRangeResult.getHighestVersion() == null) {
                throw new UnresolvableModelException(
                        String.format(
                                "No versions matched the requested dependency version range '%s'",
                                dependency.getVersion()),
                        dependency.getGroupId(),
                        dependency.getArtifactId(),
                        dependency.getVersion());
            }

            if (versionRangeResult.getVersionConstraint() != null
                    && versionRangeResult.getVersionConstraint().getRange() != null
                    && versionRangeResult.getVersionConstraint().getRange().getUpperBound() == null) {
                // Message below is checked for in the MNG-4463 core IT.
                throw new UnresolvableModelException(
                        String.format(
                                "The requested dependency version range '%s' does not specify an upper bound",
                                dependency.getVersion()),
                        dependency.getGroupId(),
                        dependency.getArtifactId(),
                        dependency.getVersion());
            }

            String newVersion = versionRangeResult.getHighestVersion().toString();
            if (!dependency.getVersion().equals(newVersion)) {
                modified.set(dependency.withVersion(newVersion));
            }
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java
        AtomicReference<org.apache.maven.api.model.Parent> resolvedParent = new AtomicReference<>();
        ModelSource result = resolveModel(parent.getDelegate(), resolvedParent);
        if (resolvedParent.get() != null) {
            parent.setVersion(resolvedParent.get().getVersion());
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java`
#### Snippet
```java
        AtomicReference<org.apache.maven.api.model.Dependency> resolvedDependency = new AtomicReference<>();
        ModelSource result = resolveModel(dependency.getDelegate(), resolvedDependency);
        if (resolvedDependency.get() != null) {
            dependency.setVersion(resolvedDependency.get().getVersion());
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
                    String selector = token.trim();
                    boolean active = true;
                    if (selector.charAt(0) == '-' || selector.charAt(0) == '!') {
                        active = false;
                        selector = selector.substring(1);
                    } else if (token.charAt(0) == '+') {
                        selector = selector.substring(1);
                    }

                    boolean optional = selector.charAt(0) == '?';
                    selector = selector.substring(optional ? 1 : 0);
```

### DuplicatedCode
Duplicated code
in `maven-embedder/src/main/java/org/apache/maven/cli/event/ExecutionEventLogger.java`
#### Snippet
```java
                buffer.append(" [");
                String buildTimeDuration = formatDuration(buildSummary.getTime());
                int padSize = MAX_PADDED_BUILD_TIME_DURATION_LENGTH - buildTimeDuration.length();
                if (padSize > 0) {
                    buffer.append(chars(' ', padSize));
                }
                buffer.append(buildTimeDuration);
                buffer.append(']');
```

### DuplicatedCode
Duplicated code
in `maven-embedder/src/main/java/org/apache/maven/cli/logging/impl/Log4j2Configuration.java`
#### Snippet
```java
        String value;
        switch (level) {
            case DEBUG:
                value = "debug";
                break;

            case INFO:
                value = "info";
                break;

            default:
                value = "error";
                break;
        }
```

### DuplicatedCode
Duplicated code
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/AbstractMavenTransferListener.java`
#### Snippet
```java
        String action = event.getRequestType() == TransferEvent.RequestType.PUT ? "Uploading" : "Downloading";
        String direction = event.getRequestType() == TransferEvent.RequestType.PUT ? "to" : "from";

        TransferResource resource = event.getResource();
        StringBuilder message = new StringBuilder();
        message.append(action).append(' ').append(direction).append(' ').append(resource.getRepositoryId());
        message.append(": ");
        message.append(resource.getRepositoryUrl()).append(resource.getResourceName());
```

### DuplicatedCode
Duplicated code
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/AbstractMavenTransferListener.java`
#### Snippet
```java
        String action = (event.getRequestType() == TransferEvent.RequestType.PUT ? "Uploaded" : "Downloaded");
        String direction = event.getRequestType() == TransferEvent.RequestType.PUT ? "to" : "from";

        TransferResource resource = event.getResource();
        long contentLength = event.getTransferredBytes();
        FileSizeFormat format = new FileSizeFormat(Locale.ENGLISH);

        StringBuilder message = new StringBuilder();
        message.append(action).append(' ').append(direction).append(' ').append(resource.getRepositoryId());
        message.append(": ");
        message.append(resource.getRepositoryUrl()).append(resource.getResourceName());
        message.append(" (").append(format.format(contentLength));

        long duration = System.currentTimeMillis() - resource.getTransferStartTime();
        if (duration > 0L) {
            double bytesPerSecond = contentLength / (duration / 1000.0);
            message.append(" at ").append(format.format((long) bytesPerSecond)).append("/s");
        }

        message.append(')');
```

### DuplicatedCode
Duplicated code
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
                String rawChildModelVersion = childModel.getVersion();

                if (rawChildModelVersion == null) {
                    // Message below is checked for in the MNG-2199 core IT.
                    problems.add(new ModelProblemCollectorRequest(Severity.FATAL, Version.V31)
                            .setMessage("Version must be a constant")
                            .setLocation(childModel.getLocation("")));

                } else {
                    if (rawChildVersionReferencesParent(rawChildModelVersion)) {
                        // Message below is checked for in the MNG-2199 core IT.
                        problems.add(new ModelProblemCollectorRequest(Severity.FATAL, Version.V31)
                                .setMessage("Version must be a constant")
                                .setLocation(childModel.getLocation("version")));
                    }
                }
```

### DuplicatedCode
Duplicated code
in `maven-model-builder/src/main/java/org/apache/maven/model/inheritance/DefaultInheritanceAssembler.java`
#### Snippet
```java
                Map<Object, List<Plugin>> predecessors = new LinkedHashMap<>();
                List<Plugin> pending = new ArrayList<>();
                for (Plugin element : tgt) {
                    Object key = getPluginKey().apply(element);
                    Plugin existing = master.get(key);
                    if (existing != null) {
                        element = mergePlugin(element, existing, sourceDominant, context);

                        master.put(key, element);

                        if (!pending.isEmpty()) {
                            predecessors.put(key, pending);
                            pending = new ArrayList<>();
                        }
                    } else {
                        pending.add(element);
                    }
                }

                List<Plugin> result = new ArrayList<>(src.size() + tgt.size());
                for (Map.Entry<Object, Plugin> entry : master.entrySet()) {
                    List<Plugin> pre = predecessors.get(entry.getKey());
                    if (pre != null) {
                        result.addAll(pre);
                    }
                    result.add(entry.getValue());
                }
                result.addAll(pending);

                builder.plugins(result);
```

### DuplicatedCode
Duplicated code
in `maven-model-builder/src/main/java/org/apache/maven/model/inheritance/DefaultInheritanceAssembler.java`
#### Snippet
```java
                for (ReportPlugin element : tgt) {
                    Object key = getReportPluginKey().apply(element);
                    ReportPlugin existing = merged.get(key);
                    if (existing != null) {
                        element = mergeReportPlugin(element, existing, sourceDominant, context);
                    }
                    merged.put(key, element);
                }

                builder.plugins(merged.values());
```

### DuplicatedCode
Duplicated code
in `maven-model-builder/src/main/java/org/apache/maven/model/management/DefaultPluginManagementInjector.java`
#### Snippet
```java
            List<PluginExecution> src = source.getExecutions();
            if (!src.isEmpty()) {
                List<PluginExecution> tgt = target.getExecutions();

                Map<Object, PluginExecution> merged = new LinkedHashMap<>((src.size() + tgt.size()) * 2);

                for (PluginExecution element : src) {
                    Object key = getPluginExecutionKey().apply(element);
                    merged.put(key, element);
                }

                for (PluginExecution element : tgt) {
                    Object key = getPluginExecutionKey().apply(element);
                    PluginExecution existing = merged.get(key);
                    if (existing != null) {
                        element = mergePluginExecution(element, existing, sourceDominant, context);
                    }
                    merged.put(key, element);
                }

                builder.executions(merged.values());
            }
```

### DuplicatedCode
Duplicated code
in `maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java`
#### Snippet
```java
            for (PluginExecution element : tgt) {
                Object key = getPluginExecutionKey().apply(element);
                PluginExecution existing = merged.get(key);
                if (existing != null) {
                    element = mergePluginExecution(element, existing, sourceDominant, context);
                }
                merged.put(key, element);
            }

            builder.executions(merged.values());
```

### DuplicatedCode
Duplicated code
in `maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java`
#### Snippet
```java
            Map<Object, Repository> merged = new LinkedHashMap<>((src.size() + tgt.size()) * 2);

            List<Repository> dominant, recessive;
            if (sourceDominant) {
                dominant = src;
                recessive = tgt;
            } else {
                dominant = tgt;
                recessive = src;
            }

            for (Repository element : dominant) {
                Object key = getRepositoryKey().apply(element);
                merged.put(key, element);
            }

            for (Repository element : recessive) {
                Object key = getRepositoryKey().apply(element);
                if (!merged.containsKey(key)) {
                    merged.put(key, element);
                }
            }
```

### DuplicatedCode
Duplicated code
in `maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java`
#### Snippet
```java
            Set<String> excludes = new LinkedHashSet<>(tgt);
            List<String> merged = new ArrayList<>(tgt.size() + src.size());
            merged.addAll(tgt);
            for (String s : src) {
                if (!excludes.contains(s)) {
                    merged.add(s);
                }
            }
```

### DuplicatedCode
Duplicated code
in `maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java`
#### Snippet
```java
            String key = dependency.getGroupId() + ":" + dependency.getArtifactId() + ":" + dependency.getVersion()
                    + (dependency.getClassifier() != null ? ":" + dependency.getClassifier() : EMPTY);
            String mKey = m.getGroupId() + ":" + m.getArtifactId() + ":" + m.getVersion();
            if (key.equals(mKey)) {
                // This means a module which is build has a dependency which has the same
                // groupId, artifactId, version and classifier coordinates. This is in consequence
                // a self reference or in other words a circular reference which can not being resolved.
                addViolation(
                        problems,
                        Severity.FATAL,
                        Version.V31,
                        prefix + "[" + key + "]",
                        key,
                        "is referencing itself.",
                        dependency);
            }
```

### DuplicatedCode
Duplicated code
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/ParentXMLFilter.java`
#### Snippet
```java
                    int pos = buffer.get(i - 1).event == TEXT ? i - 1 : i;
                    Event e = new Event();
                    e.event = TEXT;
                    e.text = whitespaceAfterParentStart;
                    buffer.add(pos++, e);
                    e = new Event();
                    e.event = START_TAG;
                    e.namespace = buffer.get(0).namespace;
                    e.prefix = buffer.get(0).prefix;
                    e.name = "version";
                    buffer.add(pos++, e);
                    e = new Event();
                    e.event = TEXT;
```

### DuplicatedCode
Duplicated code
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/ParentXMLFilter.java`
#### Snippet
```java
                    buffer.add(pos++, e);
                    e = new Event();
                    e.event = END_TAG;
                    e.name = "version";
                    e.namespace = buffer.get(0).namespace;
                    e.prefix = buffer.get(0).prefix;
                    buffer.add(pos++, e);
```

### DuplicatedCode
Duplicated code
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/pull/BufferingParser.java`
#### Snippet
```java
            if (events != null && !events.isEmpty()) {
                current = events.removeFirst();
                return current.event;
            } else {
                current = null;
            }
            if (getEventType() == END_DOCUMENT) {
                throw new XmlPullParserException("already reached end of XML input", this, null);
            }
```

### DuplicatedCode
Duplicated code
in `maven-model/src/main/java/org/apache/maven/model/WrapperList.java`
#### Snippet
```java
        Objects.requireNonNull(t);
        if (setter != null) {
            List<U> list = new ArrayList<>(getter.get());
            boolean ret = list.add(revMapper.apply(t));
            setter.accept(list);
            return ret;
        } else {
            return getter.get().add(revMapper.apply(t));
        }
```

### DuplicatedCode
Duplicated code
in `maven-model/src/main/java/org/apache/maven/model/WrapperList.java`
#### Snippet
```java
        Objects.requireNonNull(element);
        if (setter != null) {
            List<U> list = new ArrayList<>(getter.get());
            U ret = list.set(index, revMapper.apply(element));
            setter.accept(list);
            return mapper.apply(ret);
        } else {
            return mapper.apply(getter.get().set(index, revMapper.apply(element)));
        }
```

### DuplicatedCode
Duplicated code
in `maven-model/src/main/java/org/apache/maven/model/WrapperList.java`
#### Snippet
```java
        Objects.requireNonNull(element);
        if (setter != null) {
            List<U> list = new ArrayList<>(getter.get());
            list.add(index, revMapper.apply(element));
            setter.accept(list);
        } else {
            getter.get().add(index, revMapper.apply(element));
        }
```

### DuplicatedCode
Duplicated code
in `maven-model/src/main/java/org/apache/maven/model/WrapperList.java`
#### Snippet
```java
        if (setter != null) {
            List<U> list = new ArrayList<>(getter.get());
            U ret = list.remove(index);
            setter.accept(list);
            return mapper.apply(ret);
        } else {
            return mapper.apply(getter.get().remove(index));
        }
```

### DuplicatedCode
Duplicated code
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/LocalSnapshotMetadata.java`
#### Snippet
```java
            Versioning versioning = recessive.getVersioning();
            if (versioning != null) {
                for (SnapshotVersion sv : versioning.getSnapshotVersions()) {
                    String key = getKey(sv.getClassifier(), sv.getExtension());
                    if (!versions.containsKey(key)) {
                        versions.put(key, sv);
                    }
                }
            }
```

## RuleId[id=CollectionContainsUrl]
### CollectionContainsUrl
Map `supported` may contain URL objects
in `maven-embedder/src/main/java/org/apache/maven/cli/logging/impl/UnsupportedSlf4jBindingConfiguration.java`
#### Snippet
```java
     */
    @Deprecated
    public UnsupportedSlf4jBindingConfiguration(String slf4jBinding, Map<URL, Set<Object>> supported) {}

    public UnsupportedSlf4jBindingConfiguration() {}
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `maven-core/src/main/java/org/apache/maven/project/ExtensionDescriptorBuilder.java`
#### Snippet
```java

            if (pluginXml.canRead()) {
                try (InputStream is = new BufferedInputStream(new FileInputStream(pluginXml))) {
                    extensionDescriptor = build(is);
                }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java

                if (pluginXml.isFile()) {
                    try (InputStream is = new BufferedInputStream(new FileInputStream(pluginXml))) {
                        pluginDescriptor = parsePluginDescriptor(is, plugin, pluginXml.getAbsolutePath());
                    }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `maven-builder-support/src/main/java/org/apache/maven/building/FileSource.java`
#### Snippet
```java
    @Override
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(file);
    }

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
        CoreExtensionsXpp3Reader parser = new CoreExtensionsXpp3Reader();

        try (InputStream is = new BufferedInputStream(new FileInputStream(extensionsFile))) {

            return parser.read(is).getExtensions();
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/PluginDescriptor.java`
#### Snippet
```java
            }
        } else {
            return new FileInputStream(new File(pluginFile, descriptor));
        }
    }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java
            if (prev != null) {
                int compare = prev.compareTo(c);
                System.out.println("   " + prev.toString() + ' ' + ((compare == 0) ? "==" : ((compare < 0) ? "<" : ">"))
                        + ' ' + version);
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java
                        .debug(
                                "Failed to record lastUpdated information for resolution.\nFile: "
                                        + touchfile.toString() + "; key: " + key,
                                e);
            } finally {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/AbstractMavenTransferListener.java`
#### Snippet
```java

        message.append(')');
        out.println(message.toString());
    }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/AbstractMavenTransferListener.java`
#### Snippet
```java
        message.append(resource.getRepositoryUrl()).append(resource.getResourceName());

        out.println(message.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java
        error.printStackTrace(pWriter);

        System.out.println("[" + prefix + "] " + sWriter.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java
        error.printStackTrace(pWriter);

        System.err.println("[error] " + sWriter.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

        System.out.println("[" + prefix + "] " + content.toString() + System.lineSeparator() + System.lineSeparator()
                + sWriter.toString());
    }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/SystemStreamLog.java`
#### Snippet
```java

        System.err.println(
                "[error] " + content.toString() + System.lineSeparator() + System.lineSeparator() + sWriter.toString());
    }

```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleDependencyResolver.java`
#### Snippet
```java
            Map<String, Artifact> map = new HashMap<>();
            for (Artifact artifact : resolvedArtifacts) {
                /**
                 * MNG-6300: resolvedArtifacts can be cache result; this ensures reactor files are always up-to-date
                 * During lifecycle the Artifact.getFile() can change from target/classes to the actual jar.
```

### DanglingJavadoc
Dangling Javadoc comment
in `maven-core/src/main/java/org/apache/maven/execution/MavenSession.java`
#### Snippet
```java

    @Deprecated
    /** @deprecated This appears not to be used anywhere within Maven itself. */
    public Map<String, MavenProject> getProjectMap() {
        return projectMap;
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ClasspathGraphVisitor` may be 'static'
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultClasspathTransformation.java`
#### Snippet
```java
     * and yet use class level data to lessen stack usage in recursion
     */
    private class ClasspathGraphVisitor {
        MetadataGraph graph;

```

### InnerClassMayBeStatic
Inner class `CacheRecord` may be 'static'
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
     * CacheRecord
     */
    public class CacheRecord {
        private Artifact pomArtifact;
        private Artifact relocatedArtifact;
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'HashMap.get()'
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
    private void manageArtifact(
            ResolutionNode node, ManagedVersionMap managedVersions, List<ResolutionListener> listeners) {
        Artifact artifact = managedVersions.get(node.getKey());

        // Before we update the version of the artifact, we need to know
```

### SuspiciousMethodCalls
Suspicious call to 'HashMap.containsKey()'
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
        // TODO Does this check need to happen here? Had to add the same call
        // below when we iterate on child nodes -- will that suffice?
        if (managedVersions.containsKey(key)) {
            manageArtifact(node, managedVersions, listeners);
        }
```

### SuspiciousMethodCalls
Suspicious call to 'HashMap.containsKey()'
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
                                childKey = child.getKey();

                                if (managedVersions.containsKey(childKey)) {
                                    // If this child node is a managed dependency, ensure
                                    // we are using the dependency management version
```

### SuspiciousMethodCalls
Suspicious call to 'HashMap.get()'
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
                                    // for the artifact; otherwise we may end up with unwanted
                                    // dependencies.
                                    Artifact ma = managedVersions.get(childKey);
                                    ArtifactFilter managedExclusionFilter = ma.getDependencyFilter();
                                    if (null != managedExclusionFilter) {
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `transfers`
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/ConsoleMavenTransferListener.java`
#### Snippet
```java
        buffer.append("Progress (").append(transfers.size()).append("): ");

        synchronized (transfers) {
            Iterator<Map.Entry<TransferResource, Long>> entries =
                    transfers.entrySet().iterator();
```

## RuleId[id=EqualsHashCodeCalledOnUrl]
### EqualsHashCodeCalledOnUrl
Call to `equals()` on URL object
in `maven-builder-support/src/main/java/org/apache/maven/building/UrlSource.java`
#### Snippet
```java

        UrlSource other = (UrlSource) obj;
        return this.url.equals(other.url);
    }
}
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-compat/src/main/java/org/apache/maven/project/path/DefaultPathTranslator.java`
#### Snippet
```java
        }

        if (path.length() <= 0) {
            path = ".";
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-core/src/main/java/org/apache/maven/RepositoryUtils.java`
#### Snippet
```java

    private static String nullify(String string) {
        return (string == null || string.length() <= 0) ? null : string;
    }

```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-core/src/main/java/org/apache/maven/artifact/repository/LegacyLocalRepositoryManager.java`
#### Snippet
```java

        private String nullify(String str) {
            return (str == null || str.length() <= 0) ? null : str;
        }

```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/io/DefaultModelWriter.java`
#### Snippet
```java
        String encoding = model.getModelEncoding();
        // TODO Use StringUtils here
        if (encoding == null || encoding.length() <= 0) {
            encoding = "UTF-8";
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java

    private static int getRelationOrder(String value, RangeValue rangeValue, boolean isLeft) {
        if (rangeValue.value.length() <= 0) {
            return isLeft ? 1 : -1;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
        String version = context.getSystemProperties().get("java.version");

        if (version == null || version.length() <= 0) {
            problems.add(new ModelProblemCollectorRequest(Severity.ERROR, Version.BASE)
                    .setMessage("Failed to determine Java version for profile " + profile.getId())
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
            } else if (token.endsWith(")")) {
                ranges.add(new RangeValue(token.replace(")", ""), false));
            } else if (token.length() <= 0) {
                ranges.add(new RangeValue("", false));
            }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/PropertyProfileActivator.java`
#### Snippet
```java
        }

        if (name == null || name.length() <= 0) {
            problems.add(new ModelProblemCollectorRequest(Severity.ERROR, Version.BASE)
                    .setMessage("The property name is required to activate the profile " + profile.getId())
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
        String parentPath = childModel.getParent().getRelativePath();

        if (parentPath == null || parentPath.length() <= 0) {
            return null;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
        String version = dependency.getVersion();

        if (groupId == null || groupId.length() <= 0) {
            problems.add(new ModelProblemCollectorRequest(Severity.ERROR, Version.BASE)
                    .setMessage("'dependencyManagement.dependencies.dependency.groupId' for "
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
            return null;
        }
        if (artifactId == null || artifactId.length() <= 0) {
            problems.add(new ModelProblemCollectorRequest(Severity.ERROR, Version.BASE)
                    .setMessage("'dependencyManagement.dependencies.dependency.artifactId' for "
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
            return null;
        }
        if (version == null || version.length() <= 0) {
            problems.add(new ModelProblemCollectorRequest(Severity.ERROR, Version.BASE)
                    .setMessage("'dependencyManagement.dependencies.dependency.version' for "
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
        } catch (IOException e) {
            String msg = e.getMessage();
            if (msg == null || msg.length() <= 0) {
                // NOTE: There's java.nio.charset.MalformedInputException and sun.io.MalformedInputException
                if (e.getClass().getName().endsWith("MalformedInputException")) {
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java`
#### Snippet
```java
    private boolean validateModelVersion(
            ModelProblemCollector problems, String string, InputLocationTracker tracker, String... validVersions) {
        if (string == null || string.length() <= 0) {
            return true;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java`
#### Snippet
```java
            String sourceHint,
            InputLocationTracker tracker) {
        if (string == null || string.length() <= 0) {
            return true;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java`
#### Snippet
```java
            String sourceHint,
            InputLocationTracker tracker) {
        if (string == null || string.length() <= 0) {
            return true;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java`
#### Snippet
```java
        }

        if (string.length() <= 0 || "RELEASE".equals(string) || "LATEST".equals(string)) {
            addViolation(
                    problems,
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java`
#### Snippet
```java
            String sourceHint,
            InputLocationTracker tracker) {
        if (string == null || string.length() <= 0) {
            return true;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java`
#### Snippet
```java
            InputLocationTracker tracker,
            String... validValues) {
        if (string == null || string.length() <= 0) {
            return true;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-settings-builder/src/main/java/org/apache/maven/settings/io/DefaultSettingsWriter.java`
#### Snippet
```java
        String encoding = settings.getModelEncoding();
        // TODO Use StringUtils here
        if (encoding == null || encoding.length() <= 0) {
            encoding = "UTF-8";
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/RelocatedArtifact.java`
#### Snippet
```java
    public Artifact setVersion(String version) {
        String current = getVersion();
        if (current.equals(version) || (version == null && current.length() <= 0)) {
            return this;
        }
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'RandomAccessFile' used without 'try'-with-resources statement
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultUpdateCheckManager.java`
#### Snippet
```java
                Properties props = new Properties();

                channel = new RandomAccessFile(touchfile, "rw").getChannel();
                lock = channel.lock();

```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `new DefaultMojoExecutionConfigurator()` to `MojoExecutionConfigurator` is redundant
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/DefaultLifecycleExecutionPlanCalculator.java`
#### Snippet
```java
        this.delegates = null;
        this.mojoExecutionConfigurators =
                Collections.singletonMap("default", (MojoExecutionConfigurator) new DefaultMojoExecutionConfigurator());
    }

```

### RedundantCast
Casting `modelsList` to `Iterable` is redundant
in `maven-model-builder/src/main/java/org/apache/maven/model/building/Result.java`
#### Snippet
```java
            }
        }
        return new Result<>(hasErrors, (Iterable<T>) modelsList, problemsList);
    }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param stringFormatter` tag description is missing
in `maven-model/src/main/java/org/apache/maven/model/io/xpp3/MavenXpp3WriterEx.java`
#### Snippet
```java
     * Method setStringFormatter.
     *
     * @param stringFormatter
     */
    public void setStringFormatter(InputLocation.StringFormatter stringFormatter) {
```

### JavadocDeclaration
`@param projectId` tag description is missing
in `maven-compat/src/main/java/org/apache/maven/project/InvalidProjectModelException.java`
#### Snippet
```java

    /**
     * @param projectId
     * @param pomLocation      absolute path of the pom file
     * @param message
```

### JavadocDeclaration
`@param message` tag description is missing
in `maven-compat/src/main/java/org/apache/maven/project/InvalidProjectModelException.java`
#### Snippet
```java
     * @param projectId
     * @param pomLocation      absolute path of the pom file
     * @param message
     * @param validationResult
     * @deprecated use {@link File} constructor for pomLocation
```

### JavadocDeclaration
`@param validationResult` tag description is missing
in `maven-compat/src/main/java/org/apache/maven/project/InvalidProjectModelException.java`
#### Snippet
```java
     * @param pomLocation      absolute path of the pom file
     * @param message
     * @param validationResult
     * @deprecated use {@link File} constructor for pomLocation
     */
```

### JavadocDeclaration
`@param projectId` tag description is missing
in `maven-compat/src/main/java/org/apache/maven/project/InvalidProjectModelException.java`
#### Snippet
```java

    /**
     * @param projectId
     * @param pomLocation absolute path of the pom file
     * @param message
```

### JavadocDeclaration
`@param message` tag description is missing
in `maven-compat/src/main/java/org/apache/maven/project/InvalidProjectModelException.java`
#### Snippet
```java
     * @param projectId
     * @param pomLocation absolute path of the pom file
     * @param message
     * @deprecated use {@link File} constructor for pomLocation
     */
```

### JavadocDeclaration
`@param qualifier` tag description is missing
in `maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java`
#### Snippet
```java
         * so this is still fast. If more characters are needed then it requires a lexical sort anyway.
         *
         * @param qualifier
         * @return an equivalent value that can be used with lexical comparison
         */
```

### JavadocDeclaration
`@param md` tag description is missing
in `maven-compat/src/main/java/org/apache/maven/repository/MetadataGraph.java`
#### Snippet
```java
     * find a node by the GAV (metadata)
     *
     * @param md
     */
    public MetadataGraphNode findNode(MavenArtifactMetadata md) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-compat/src/main/java/org/apache/maven/usability/plugin/ExpressionDocumenter.java`
#### Snippet
```java
     * <expressions>
     *
     * @throws IOException
     * @throws XmlPullParserException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-compat/src/main/java/org/apache/maven/usability/plugin/ExpressionDocumenter.java`
#### Snippet
```java
     *
     * @throws IOException
     * @throws XmlPullParserException
     */
    private static Map<String, Expression> parseExpressionDocumentation(InputStream docStream)
```

### JavadocDeclaration
`@param originalRepository` tag description is missing
in `maven-compat/src/main/java/org/apache/maven/repository/DefaultMirrorSelector.java`
#### Snippet
```java
     * Checks the URL to see if this repository refers to an external repository
     *
     * @param originalRepository
     * @return true if external.
     */
```

### JavadocDeclaration
`@param originalRepository` tag description is missing
in `maven-compat/src/main/java/org/apache/maven/repository/DefaultMirrorSelector.java`
#### Snippet
```java
     * Checks the URL to see if this repository refers to a non-localhost repository using HTTP.
     *
     * @param originalRepository
     * @return true if external.
     */
```

### JavadocDeclaration
`@param wagon` tag description is missing
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
     * Deal with connecting to a wagon repository taking into account authentication and proxies.
     *
     * @param wagon
     * @param repository
     *
```

### JavadocDeclaration
`@param repository` tag description is missing
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
     *
     * @param wagon
     * @param repository
     *
     * @throws ConnectionException
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
     * @param repository
     *
     * @throws ConnectionException
     * @throws AuthenticationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/DefaultWagonManager.java`
#### Snippet
```java
     *
     * @throws ConnectionException
     * @throws AuthenticationException
     */
    private void connectWagon(Wagon wagon, ArtifactRepository repository)
```

### JavadocDeclaration
`@param relativePathMapper` tag description is missing
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/ParentXMLFilter.java`
#### Snippet
```java

    /**
     * @param relativePathMapper
     */
    ParentXMLFilter(
```

### JavadocDeclaration
`@param listeners` tag description is missing
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/resolver/DefaultLegacyArtifactCollector.java`
#### Snippet
```java
     * @param farthest farthest resolution node
     * @param nearest nearest resolution node
     * @param listeners
     */
    boolean checkScopeUpdate(ResolutionNode farthest, ResolutionNode nearest, List<ResolutionListener> listeners) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-core/src/main/java/org/apache/maven/graph/DefaultProjectDependencyGraph.java`
#### Snippet
```java
     * @param allProjects All collected projects.
     * @param projects    The projects to create the dependency graph with.
     * @throws DuplicateProjectException
     * @throws CycleDetectedException
     * @since 4.0.0
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-core/src/main/java/org/apache/maven/graph/DefaultProjectDependencyGraph.java`
#### Snippet
```java
     * @param projects    The projects to create the dependency graph with.
     * @throws DuplicateProjectException
     * @throws CycleDetectedException
     * @since 4.0.0
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-core/src/main/java/org/apache/maven/graph/DefaultProjectDependencyGraph.java`
#### Snippet
```java
     * @param allProjects All collected projects.
     * @param projects    The projects to create the dependency graph with.
     * @throws DuplicateProjectException
     * @throws CycleDetectedException
     * @since 3.5.0
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-core/src/main/java/org/apache/maven/graph/DefaultProjectDependencyGraph.java`
#### Snippet
```java
     * @param projects    The projects to create the dependency graph with.
     * @throws DuplicateProjectException
     * @throws CycleDetectedException
     * @since 3.5.0
     * @deprecated Use {@link #DefaultProjectDependencyGraph(Collection, Collection)} instead.
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-core/src/main/java/org/apache/maven/graph/DefaultProjectDependencyGraph.java`
#### Snippet
```java
     *
     * @param projects The projects to create the dependency graph with
     * @throws DuplicateProjectException
     * @throws CycleDetectedException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-core/src/main/java/org/apache/maven/graph/DefaultProjectDependencyGraph.java`
#### Snippet
```java
     * @param projects The projects to create the dependency graph with
     * @throws DuplicateProjectException
     * @throws CycleDetectedException
     */
    public DefaultProjectDependencyGraph(Collection<MavenProject> projects)
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-core/src/main/java/org/apache/maven/plugin/MojoExecutionRunner.java`
#### Snippet
```java
     *
     * @param execution mojo execution
     * @throws LifecycleExecutionException
     */
    void run(MojoExecution execution) throws LifecycleExecutionException;
```

### JavadocDeclaration
`@param pluginDescriptor` tag description is missing
in `maven-core/src/main/java/org/apache/maven/plugin/MavenPluginPrerequisitesChecker.java`
#### Snippet
```java
    /**
     *
     * @param pluginDescriptor
     * @throws IllegalStateException in case the checked prerequisites are not met
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-core/src/main/java/org/apache/maven/plugin/MojosExecutionStrategy.java`
#### Snippet
```java
     * @param session           current session
     * @param mojoExecutionRunner mojo execution task which must be invoked by a strategy to actually run it
     * @throws LifecycleExecutionException
     */
    void execute(List<MojoExecution> mojos, MavenSession session, MojoExecutionRunner mojoExecutionRunner)
```

### JavadocDeclaration
`@param originalRepository` tag description is missing
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
     * Checks the URL to see if this repository refers to a non-localhost repository using HTTP.
     *
     * @param originalRepository
     * @return true if external.
     */
```

### JavadocDeclaration
`@param originalRepository` tag description is missing
in `maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java`
#### Snippet
```java
     * Checks the URL to see if this repository refers to an external repository
     *
     * @param originalRepository
     * @return true if external.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-core/src/main/java/org/apache/maven/plugin/DefaultBuildPluginManager.java`
#### Snippet
```java
     * TODO pluginDescriptor classRealm and artifacts are set as a side effect of this
     *      call, which is not nice.
     * @throws PluginResolutionException
     */
    public ClassRealm getPluginRealm(MavenSession session, PluginDescriptor pluginDescriptor)
```

### JavadocDeclaration
`@param plugin` tag description is missing
in `maven-core/src/main/java/org/apache/maven/plugin/DefaultBuildPluginManager.java`
#### Snippet
```java

    /**
     * @param plugin
     * @param repositories
     * @param session
```

### JavadocDeclaration
`@param repositories` tag description is missing
in `maven-core/src/main/java/org/apache/maven/plugin/DefaultBuildPluginManager.java`
#### Snippet
```java
    /**
     * @param plugin
     * @param repositories
     * @param session
     * @return PluginDescriptor The component descriptor for the Maven plugin.
```

### JavadocDeclaration
`@param session` tag description is missing
in `maven-core/src/main/java/org/apache/maven/plugin/DefaultBuildPluginManager.java`
#### Snippet
```java
     * @param plugin
     * @param repositories
     * @param session
     * @return PluginDescriptor The component descriptor for the Maven plugin.
     * @throws PluginNotFoundException The plugin could not be found in any repositories.
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-core/src/main/java/org/apache/maven/plugin/DefaultBuildPluginManager.java`
#### Snippet
```java
     * @throws PluginNotFoundException The plugin could not be found in any repositories.
     * @throws PluginResolutionException The plugin could be found but could not be resolved.
     * @throws InvalidPluginDescriptorException
     */
    public PluginDescriptor loadPlugin(
```

### JavadocDeclaration
`@param path` tag description is missing
in `maven-core/src/main/java/org/apache/maven/project/ReactorModelPool.java`
#### Snippet
```java
     * Find model by path, useful when location the parent by relativePath
     *
     * @param path
     * @return the matching model or {@code null}
     * @since 4.0.0
```

### JavadocDeclaration
`@param profile` tag description is missing
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingRequest.java`
#### Snippet
```java
     * configuration like the MavenCLI settings.xml file, or from a custom dialog in an IDE integration like M2Eclipse.
     *
     * @param profile
     */
    void addProfile(Profile profile);
```

### JavadocDeclaration
`@param projectId` tag description is missing
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingException.java`
#### Snippet
```java

    /**
     * @param projectId
     * @param message
     * @param pomFile   pom file location
```

### JavadocDeclaration
`@param message` tag description is missing
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingException.java`
#### Snippet
```java
    /**
     * @param projectId
     * @param message
     * @param pomFile   pom file location
     * @param cause
```

### JavadocDeclaration
`@param cause` tag description is missing
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingException.java`
#### Snippet
```java
     * @param message
     * @param pomFile   pom file location
     * @param cause
     */
    protected ProjectBuildingException(String projectId, String message, File pomFile, Throwable cause) {
```

### JavadocDeclaration
`@param projectId` tag description is missing
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingException.java`
#### Snippet
```java

    /**
     * @param projectId
     * @param message
     * @param pomFile   pom file location
```

### JavadocDeclaration
`@param message` tag description is missing
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingException.java`
#### Snippet
```java
    /**
     * @param projectId
     * @param message
     * @param pomFile   pom file location
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-core/src/main/java/org/apache/maven/project/ProjectBuildingHelper.java`
#### Snippet
```java
     *            {@code null}.
     * @return The effective artifact repositories, never {@code null}.
     * @throws InvalidRepositoryException
     */
    List<ArtifactRepository> createArtifactRepositories(
```

### JavadocDeclaration
`@param request` tag description is missing
in `maven-core/src/main/java/org/apache/maven/project/collector/ProjectCollectionStrategy.java`
#### Snippet
```java
    /**
     *
     * @param request
     * @return
     * @throws ProjectBuildingException
```

### JavadocDeclaration
`@return` tag description is missing
in `maven-core/src/main/java/org/apache/maven/project/collector/ProjectCollectionStrategy.java`
#### Snippet
```java
     *
     * @param request
     * @return
     * @throws ProjectBuildingException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-core/src/main/java/org/apache/maven/project/collector/ProjectCollectionStrategy.java`
#### Snippet
```java
     * @param request
     * @return
     * @throws ProjectBuildingException
     */
    List<MavenProject> collectProjects(MavenExecutionRequest request) throws ProjectBuildingException;
```

### JavadocDeclaration
`@param modelProfile` tag description is missing
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtils.java`
#### Snippet
```java

    /**
     * @param modelProfile
     * @return a profile
     */
```

### JavadocDeclaration
`@param dominant` tag description is missing
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtils.java`
#### Snippet
```java

    /**
     * @param dominant
     * @param recessive
     * @param recessiveSourceLevel
```

### JavadocDeclaration
`@param recessive` tag description is missing
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtils.java`
#### Snippet
```java
    /**
     * @param dominant
     * @param recessive
     * @param recessiveSourceLevel
     */
```

### JavadocDeclaration
`@param recessiveSourceLevel` tag description is missing
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtils.java`
#### Snippet
```java
     * @param dominant
     * @param recessive
     * @param recessiveSourceLevel
     */
    public static void merge(Settings dominant, Settings recessive, String recessiveSourceLevel) {
```

### JavadocDeclaration
`@param settingsProfile` tag description is missing
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtils.java`
#### Snippet
```java

    /**
     * @param settingsProfile
     * @return a profile
     */
```

### JavadocDeclaration
`@param modelPolicy` tag description is missing
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java

    /**
     * @param modelPolicy
     * @return a RepositoryPolicy
     */
```

### JavadocDeclaration
`@param modelProfile` tag description is missing
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java

    /**
     * @param modelProfile
     * @return a profile
     */
```

### JavadocDeclaration
`@param settingsProfile` tag description is missing
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java

    /**
     * @param settingsProfile
     * @return a profile
     */
```

### JavadocDeclaration
`@param settingsRepo` tag description is missing
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java

    /**
     * @param settingsRepo
     * @return a repository
     */
```

### JavadocDeclaration
`@param modelRepo` tag description is missing
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java

    /**
     * @param modelRepo
     * @return a repository
     */
```

### JavadocDeclaration
`@param settingsPolicy` tag description is missing
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java

    /**
     * @param settingsPolicy
     * @return a RepositoryPolicy
     */
```

### JavadocDeclaration
`@param dominant` tag description is missing
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java

    /**
     * @param dominant
     * @param recessive
     */
```

### JavadocDeclaration
`@param recessive` tag description is missing
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java
    /**
     * @param dominant
     * @param recessive
     */
    public static Settings merge(Settings dominant, Settings recessive) {
```

### JavadocDeclaration
`@param project` tag description is missing
in `maven-core/src/main/java/org/apache/maven/lifecycle/MojoExecutionConfigurator.java`
#### Snippet
```java
     * default configuration for the Mojo from the containing plugin's plugin.xml descriptor.
     *
     * @param project
     * @param mojoExecution
     * @param allowPluginLevelConfig
```

### JavadocDeclaration
`@param mojoExecution` tag description is missing
in `maven-core/src/main/java/org/apache/maven/lifecycle/MojoExecutionConfigurator.java`
#### Snippet
```java
     *
     * @param project
     * @param mojoExecution
     * @param allowPluginLevelConfig
     */
```

### JavadocDeclaration
`@param allowPluginLevelConfig` tag description is missing
in `maven-core/src/main/java/org/apache/maven/lifecycle/MojoExecutionConfigurator.java`
#### Snippet
```java
     * @param project
     * @param mojoExecution
     * @param allowPluginLevelConfig
     */
    void configure(MavenProject project, MojoExecution mojoExecution, boolean allowPluginLevelConfig);
```

### JavadocDeclaration
`@param phase` tag description is missing
in `maven-core/src/main/java/org/apache/maven/lifecycle/DefaultLifecycles.java`
#### Snippet
```java
     * Get lifecycle based on phase
     *
     * @param phase
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `maven-core/src/main/java/org/apache/maven/lifecycle/DefaultLifecycles.java`
#### Snippet
```java
     *
     * @param phase
     * @return
     */
    public Lifecycle get(String phase) {
```

### JavadocDeclaration
Wrong tag `issue`
in `maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java`
#### Snippet
```java
     * Suppress SNAPSHOT updates.
     *
     * @issue MNG-2681
     */
    private boolean noSnapshotUpdates = false;
```

### JavadocDeclaration
`@param lifecyclePhases` tag description is missing
in `maven-core/src/main/java/org/apache/maven/lifecycle/mapping/Lifecycle.java`
#### Snippet
```java
     * Method setLifecyclePhases
     *
     * @param lifecyclePhases
     */
    public void setLifecyclePhases(Map<String, LifecyclePhase> lifecyclePhases) {
```

### JavadocDeclaration
`@param id` tag description is missing
in `maven-core/src/main/java/org/apache/maven/lifecycle/mapping/Lifecycle.java`
#### Snippet
```java
     * Method setId
     *
     * @param id
     */
    public void setId(String id) {
```

### JavadocDeclaration
`@param p` tag description is missing
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/builder/multithreaded/ConcurrencyDependencyGraph.java`
#### Snippet
```java
     * For the given {@link MavenProject} {@code p} return {@code p}'s uncompleted dependencies.
     *
     * @param p
     * @return List of uncompleted prerequisite projects
     */
```

### JavadocDeclaration
`@param p` tag description is missing
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/builder/multithreaded/ConcurrencyDependencyGraph.java`
#### Snippet
```java
     * For the given {@link MavenProject} {@code p}, return all of {@code p}'s dependencies.
     *
     * @param p
     * @return List of prerequisite projects
     */
```

### JavadocDeclaration
`@param model` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/Result.java`
#### Snippet
```java
     * Success with warnings
     *
     * @param model
     * @param problems
     */
```

### JavadocDeclaration
`@param problems` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/Result.java`
#### Snippet
```java
     *
     * @param model
     * @param problems
     */
    public static <T> Result<T> success(T model, Iterable<? extends ModelProblem> problems) {
```

### JavadocDeclaration
`@param result` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/Result.java`
#### Snippet
```java
     * New result that includes the given
     *
     * @param result
     * @param problems
     */
```

### JavadocDeclaration
`@param problems` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/Result.java`
#### Snippet
```java
     *
     * @param result
     * @param problems
     */
    public static <T> Result<T> addProblems(Result<T> result, Iterable<? extends ModelProblem> problems) {
```

### JavadocDeclaration
`@param model` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/Result.java`
#### Snippet
```java
     * Error with partial result and problems describing the cause
     *
     * @param model
     * @param problems
     */
```

### JavadocDeclaration
`@param problems` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/Result.java`
#### Snippet
```java
     *
     * @param model
     * @param problems
     */
    public static <T> Result<T> error(T model, Iterable<? extends ModelProblem> problems) {
```

### JavadocDeclaration
`@param model` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/Result.java`
#### Snippet
```java
     * New result - determine whether error or success by checking problems for errors
     *
     * @param model
     * @param problems
     */
```

### JavadocDeclaration
`@param problems` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/Result.java`
#### Snippet
```java
     *
     * @param model
     * @param problems
     */
    public static <T> Result<T> newResult(T model, Iterable<? extends ModelProblem> problems) {
```

### JavadocDeclaration
`@param model` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/Result.java`
#### Snippet
```java
     * Success without warnings
     *
     * @param model
     */
    public static <T> Result<T> success(T model) {
```

### JavadocDeclaration
`@param result` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/Result.java`
#### Snippet
```java
     * concat(result.getProblems(),problems)).
     *
     * @param result
     * @param problem
     */
```

### JavadocDeclaration
`@param problem` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/Result.java`
#### Snippet
```java
     *
     * @param result
     * @param problem
     */
    public static <T> Result<T> addProblem(Result<T> result, ModelProblem problem) {
```

### JavadocDeclaration
`@param problems` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/Result.java`
#### Snippet
```java
     * Error with problems describing the cause
     *
     * @param problems
     */
    public static <T> Result<T> error(Iterable<? extends ModelProblem> problems) {
```

### JavadocDeclaration
`@param model` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/Result.java`
#### Snippet
```java
     * Success with warnings
     *
     * @param model
     * @param results
     */
```

### JavadocDeclaration
`@param results` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/Result.java`
#### Snippet
```java
     *
     * @param model
     * @param results
     */
    public static <T> Result<T> success(T model, Result<?>... results) {
```

### JavadocDeclaration
`@param results` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/Result.java`
#### Snippet
```java
     * Turns the given results into a single result by combining problems and models into single collection.
     *
     * @param results
     */
    public static <T> Result<Iterable<T>> newResultSet(Iterable<? extends Result<? extends T>> results) {
```

### JavadocDeclaration
`@param key` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/TransformerContext.java`
#### Snippet
```java
    /**
     * Get the value of the commandline argument {@code -Dkey=value}
     * @param key
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/TransformerContext.java`
#### Snippet
```java
     * Get the value of the commandline argument {@code -Dkey=value}
     * @param key
     * @return
     */
    String getUserProperty(String key);
```

### JavadocDeclaration
Javadoc pointing to itself
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelBuildingRequest.java`
#### Snippet
```java

    /**
     * Sets the source of the POM to process. Eventually, either {@link #setModelSource(ModelSource)} or
     * {@link #setPomFile(File)} must be set.
     *
```

### JavadocDeclaration
`@param fileModel` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelBuildingRequest.java`
#### Snippet
```java
     * Set the file model with profile activation
     *
     * @param fileModel
     * @return This request, never {@code null}.
     * @since 4.0.0
```

### JavadocDeclaration
`@param severity` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelProblemCollectorRequest.java`
#### Snippet
```java
    /**
     * Create a new request with mandatory parameters.
     * @param severity
     * @param version
     */
```

### JavadocDeclaration
`@param version` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/ModelProblemCollectorRequest.java`
#### Snippet
```java
     * Create a new request with mandatory parameters.
     * @param severity
     * @param version
     */
    public ModelProblemCollectorRequest(Severity severity, Version version) {
```

### JavadocDeclaration
`@param cause` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/UnresolvableModelException.java`
#### Snippet
```java
     * Creates a new exception with specified cause
     *
     * @param cause
     * @param groupId
     * @param artifactId
```

### JavadocDeclaration
`@param groupId` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/UnresolvableModelException.java`
#### Snippet
```java
     *
     * @param cause
     * @param groupId
     * @param artifactId
     * @param version
```

### JavadocDeclaration
`@param artifactId` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/UnresolvableModelException.java`
#### Snippet
```java
     * @param cause
     * @param groupId
     * @param artifactId
     * @param version
     */
```

### JavadocDeclaration
`@param version` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/UnresolvableModelException.java`
#### Snippet
```java
     * @param groupId
     * @param artifactId
     * @param version
     */
    public UnresolvableModelException(Throwable cause, String groupId, String artifactId, String version) {
```

### JavadocDeclaration
`@param modelProperties` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/ModelVersionProcessor.java`
#### Snippet
```java
     * This method is responsible for examining the request and possibly overwrite of the valid properties in the model
     *
     * @param modelProperties
     * @param request
     */
```

### JavadocDeclaration
`@param request` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/ModelVersionProcessor.java`
#### Snippet
```java
     *
     * @param modelProperties
     * @param request
     */
    void overwriteModelProperties(Properties modelProperties, ModelBuildingRequest request);
```

### JavadocDeclaration
`@param request` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
         * If an interface could be extracted, DefaultModelProblemCollector should be ModelProblemCollectorExt
         *
         * @param request
         * @param collector
         * @return
```

### JavadocDeclaration
`@param collector` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
         *
         * @param request
         * @param collector
         * @return
         */
```

### JavadocDeclaration
`@return` tag description is missing
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuilder.java`
#### Snippet
```java
         * @param request
         * @param collector
         * @return
         */
        @Override
```

### JavadocDeclaration
`@param content` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/Log.java`
#### Snippet
```java
     * The error's stacktrace will be output when this error level is enabled.
     *
     * @param content
     * @param error
     */
```

### JavadocDeclaration
`@param error` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/Log.java`
#### Snippet
```java
     *
     * @param content
     * @param error
     */
    void warn(CharSequence content, Throwable error);
```

### JavadocDeclaration
`@param content` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/Log.java`
#### Snippet
```java
     * The error's stacktrace will be output when this error level is enabled.
     *
     * @param content
     * @param error
     */
```

### JavadocDeclaration
`@param error` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/Log.java`
#### Snippet
```java
     *
     * @param content
     * @param error
     */
    void info(CharSequence content, Throwable error);
```

### JavadocDeclaration
`@param content` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/Log.java`
#### Snippet
```java
     * Send a message to the user in the <b>info</b> error level.
     *
     * @param content
     */
    void info(CharSequence content);
```

### JavadocDeclaration
`@param content` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/Log.java`
#### Snippet
```java
     * The error's stacktrace will be output when this error level is enabled.
     *
     * @param content
     * @param error
     */
```

### JavadocDeclaration
`@param error` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/Log.java`
#### Snippet
```java
     *
     * @param content
     * @param error
     */
    void error(CharSequence content, Throwable error);
```

### JavadocDeclaration
`@param error` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/Log.java`
#### Snippet
```java
     * The stack trace for this exception will be output when this error level is enabled.
     *
     * @param error
     */
    void warn(Throwable error);
```

### JavadocDeclaration
`@param content` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/Log.java`
#### Snippet
```java
     * Send a message to the user in the <b>warn</b> error level.
     *
     * @param content
     */
    void warn(CharSequence content);
```

### JavadocDeclaration
`@param content` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/Log.java`
#### Snippet
```java
     * Send a message to the user in the <b>error</b> error level.
     *
     * @param content
     */
    void error(CharSequence content);
```

### JavadocDeclaration
`@param content` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/Log.java`
#### Snippet
```java
     * The error's stacktrace will be output when this error level is enabled.
     *
     * @param content
     * @param error
     */
```

### JavadocDeclaration
`@param error` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/Log.java`
#### Snippet
```java
     *
     * @param content
     * @param error
     */
    void debug(CharSequence content, Throwable error);
```

### JavadocDeclaration
`@param content` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/Log.java`
#### Snippet
```java
     * Send a message to the user in the <b>debug</b> error level.
     *
     * @param content
     */
    void debug(CharSequence content);
```

### JavadocDeclaration
`@param error` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/Log.java`
#### Snippet
```java
     * The stack trace for this exception will be output when this error level is enabled.
     *
     * @param error
     */
    void error(Throwable error);
```

### JavadocDeclaration
`@param error` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/Log.java`
#### Snippet
```java
     * The stack trace for this exception will be output when this error level is enabled.
     *
     * @param error
     */
    void debug(Throwable error);
```

### JavadocDeclaration
`@param error` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/Log.java`
#### Snippet
```java
     * The stack trace for this exception will be output when this error level is enabled.
     *
     * @param error
     */
    void info(Throwable error);
```

### JavadocDeclaration
Javadoc pointing to itself
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/annotations/Execute.java`
#### Snippet
```java
     * Custom lifecycle phase to fork. Note that specifying a phase overrides specifying a goal.
     * This element should only be used for non-standard phases. For standard phases rather use {@link #phase()}.
     * Only one of {@link #customPhase()} and {@link #phase()} must be set.
     * @return the custom phase id
     */
```

### JavadocDeclaration
Javadoc pointing to itself
in `api/maven-api-core/src/main/java/org/apache/maven/api/plugin/annotations/Execute.java`
#### Snippet
```java
     * Lifecycle phase to fork. Note that specifying a phase overrides specifying a goal.
     * For custom lifecycle phase ids use {@link #customPhase()} instead.
     * Only one of {@link #customPhase()} and {@link #phase()} must be set.
     * @return the phase
     */
```

### JavadocDeclaration
`@param session` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/services/ToolchainManager.java`
#### Snippet
```java
    /**
     *
     * @param session
     * @param type
     * @return the selected {@link Toolchain}
```

### JavadocDeclaration
`@param type` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/services/ToolchainManager.java`
#### Snippet
```java
     *
     * @param session
     * @param type
     * @return the selected {@link Toolchain}
     * @throws ToolchainManagerException if an exception occurs
```

### JavadocDeclaration
`@param session` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/services/ToolchainManager.java`
#### Snippet
```java
    /**
     *
     * @param session
     * @param type
     * @return the selected {@link Toolchain}s
```

### JavadocDeclaration
`@param type` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/services/ToolchainManager.java`
#### Snippet
```java
     *
     * @param session
     * @param type
     * @return the selected {@link Toolchain}s
     * @throws ToolchainManagerException if an exception occurs
```

### JavadocDeclaration
`@param session` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/services/ToolchainManager.java`
#### Snippet
```java
    /**
     *
     * @param session
     * @param toolchain
     * @throws ToolchainManagerException if an exception occurs
```

### JavadocDeclaration
`@param toolchain` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/services/ToolchainManager.java`
#### Snippet
```java
     *
     * @param session
     * @param toolchain
     * @throws ToolchainManagerException if an exception occurs
     */
```

### JavadocDeclaration
`@param session` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/services/ToolchainManager.java`
#### Snippet
```java
    /**
     *
     * @param session
     * @param type
     * @param requirements
```

### JavadocDeclaration
`@param type` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/services/ToolchainManager.java`
#### Snippet
```java
     *
     * @param session
     * @param type
     * @param requirements
     * @return the selected {@link Toolchain}s
```

### JavadocDeclaration
`@param requirements` tag description is missing
in `api/maven-api-core/src/main/java/org/apache/maven/api/services/ToolchainManager.java`
#### Snippet
```java
     * @param session
     * @param type
     * @param requirements
     * @return the selected {@link Toolchain}s
     * @throws ToolchainManagerException if an exception occurs
```

### JavadocDeclaration
`@param degreeOfConcurrency` tag description is missing
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
     * Set's the parallel degree of concurrency used by the build.
     *
     * @param degreeOfConcurrency
     */
    void setDegreeOfConcurrency(int degreeOfConcurrency);
```

### JavadocDeclaration
`@param repositories` tag description is missing
in `maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java`
#### Snippet
```java
     * mirrors then it's easier to just replace the whole list with a new list of transformed repositories.
     *
     * @param repositories
     * @return This request, never {@code null}.
     */
```

### JavadocDeclaration
`@param dominant` tag description is missing
in `maven-settings-builder/src/main/java/org/apache/maven/settings/merge/MavenSettingsMerger.java`
#### Snippet
```java

    /**
     * @param dominant
     * @param recessive
     * @param recessiveSourceLevel
```

### JavadocDeclaration
`@param recessive` tag description is missing
in `maven-settings-builder/src/main/java/org/apache/maven/settings/merge/MavenSettingsMerger.java`
#### Snippet
```java
    /**
     * @param dominant
     * @param recessive
     * @param recessiveSourceLevel
     */
```

### JavadocDeclaration
`@param recessiveSourceLevel` tag description is missing
in `maven-settings-builder/src/main/java/org/apache/maven/settings/merge/MavenSettingsMerger.java`
#### Snippet
```java
     * @param dominant
     * @param recessive
     * @param recessiveSourceLevel
     */
    private static <T extends IdentifiableBase> void shallowMergeById(
```

### JavadocDeclaration
`@param identifiables` tag description is missing
in `maven-settings-builder/src/main/java/org/apache/maven/settings/merge/MavenSettingsMerger.java`
#### Snippet
```java

    /**
     * @param identifiables
     * @return a map
     */
```

### JavadocDeclaration
`@param dominant` tag description is missing
in `maven-settings-builder/src/main/java/org/apache/maven/settings/merge/MavenSettingsMerger.java`
#### Snippet
```java

    /**
     * @param dominant
     * @param recessive
     * @param recessiveSourceLevel
```

### JavadocDeclaration
`@param recessive` tag description is missing
in `maven-settings-builder/src/main/java/org/apache/maven/settings/merge/MavenSettingsMerger.java`
#### Snippet
```java
    /**
     * @param dominant
     * @param recessive
     * @param recessiveSourceLevel
     */
```

### JavadocDeclaration
`@param recessiveSourceLevel` tag description is missing
in `maven-settings-builder/src/main/java/org/apache/maven/settings/merge/MavenSettingsMerger.java`
#### Snippet
```java
     * @param dominant
     * @param recessive
     * @param recessiveSourceLevel
     */
    public void merge(Settings dominant, Settings recessive, String recessiveSourceLevel) {
```

### JavadocDeclaration
`@param source` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoFailureException.java`
#### Snippet
```java
     * these messages are used to improve the message written at the end of Maven build.
     *
     * @param source
     * @param shortMessage
     * @param longMessage
```

### JavadocDeclaration
`@param shortMessage` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoFailureException.java`
#### Snippet
```java
     *
     * @param source
     * @param shortMessage
     * @param longMessage
     */
```

### JavadocDeclaration
`@param longMessage` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoFailureException.java`
#### Snippet
```java
     * @param source
     * @param shortMessage
     * @param longMessage
     */
    public MojoFailureException(Object source, String shortMessage, String longMessage) {
```

### JavadocDeclaration
`@param message` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoFailureException.java`
#### Snippet
```java
     * and providing a <code>message</code>.
     *
     * @param message
     * @param cause
     * @since 2.0.9
```

### JavadocDeclaration
`@param cause` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoFailureException.java`
#### Snippet
```java
     *
     * @param message
     * @param cause
     * @since 2.0.9
     */
```

### JavadocDeclaration
`@param message` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoFailureException.java`
#### Snippet
```java
     * Construct a new <code>MojoFailureException</code> exception providing a message.
     *
     * @param message
     */
    public MojoFailureException(String message) {
```

### JavadocDeclaration
`@param message` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoExecutionException.java`
#### Snippet
```java
     * and providing a <code>message</code>.
     *
     * @param message
     * @param cause
     */
```

### JavadocDeclaration
`@param cause` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoExecutionException.java`
#### Snippet
```java
     *
     * @param message
     * @param cause
     */
    public MojoExecutionException(String message, Exception cause) {
```

### JavadocDeclaration
`@param source` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoExecutionException.java`
#### Snippet
```java
     * these messages are used to improve the message written at the end of Maven build.
     *
     * @param source
     * @param shortMessage
     * @param longMessage
```

### JavadocDeclaration
`@param shortMessage` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoExecutionException.java`
#### Snippet
```java
     *
     * @param source
     * @param shortMessage
     * @param longMessage
     */
```

### JavadocDeclaration
`@param longMessage` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoExecutionException.java`
#### Snippet
```java
     * @param source
     * @param shortMessage
     * @param longMessage
     */
    public MojoExecutionException(Object source, String shortMessage, String longMessage) {
```

### JavadocDeclaration
`@param message` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoExecutionException.java`
#### Snippet
```java
     * and providing a <code>message</code>.
     *
     * @param message
     * @param cause
     */
```

### JavadocDeclaration
`@param cause` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoExecutionException.java`
#### Snippet
```java
     *
     * @param message
     * @param cause
     */
    public MojoExecutionException(String message, Throwable cause) {
```

### JavadocDeclaration
`@param message` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoExecutionException.java`
#### Snippet
```java
     * Construct a new <code>MojoExecutionException</code> exception providing a <code>message</code>.
     *
     * @param message
     */
    public MojoExecutionException(String message) {
```

### JavadocDeclaration
`@param content` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/Log.java`
#### Snippet
```java
     * The error's stacktrace will be output when this error level is enabled.
     *
     * @param content
     * @param error
     */
```

### JavadocDeclaration
`@param error` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/Log.java`
#### Snippet
```java
     *
     * @param content
     * @param error
     */
    void error(CharSequence content, Throwable error);
```

### JavadocDeclaration
`@param content` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/Log.java`
#### Snippet
```java
     * The error's stacktrace will be output when this error level is enabled.
     *
     * @param content
     * @param error
     */
```

### JavadocDeclaration
`@param error` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/Log.java`
#### Snippet
```java
     *
     * @param content
     * @param error
     */
    void warn(CharSequence content, Throwable error);
```

### JavadocDeclaration
`@param content` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/Log.java`
#### Snippet
```java
     * Send a message to the user in the <b>debug</b> error level.
     *
     * @param content
     */
    void debug(CharSequence content);
```

### JavadocDeclaration
`@param error` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/Log.java`
#### Snippet
```java
     * The stack trace for this exception will be output when this error level is enabled.
     *
     * @param error
     */
    void warn(Throwable error);
```

### JavadocDeclaration
`@param content` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/Log.java`
#### Snippet
```java
     * The error's stacktrace will be output when this error level is enabled.
     *
     * @param content
     * @param error
     */
```

### JavadocDeclaration
`@param error` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/Log.java`
#### Snippet
```java
     *
     * @param content
     * @param error
     */
    void debug(CharSequence content, Throwable error);
```

### JavadocDeclaration
`@param content` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/Log.java`
#### Snippet
```java
     * Send a message to the user in the <b>info</b> error level.
     *
     * @param content
     */
    void info(CharSequence content);
```

### JavadocDeclaration
`@param error` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/Log.java`
#### Snippet
```java
     * The stack trace for this exception will be output when this error level is enabled.
     *
     * @param error
     */
    void debug(Throwable error);
```

### JavadocDeclaration
`@param content` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/Log.java`
#### Snippet
```java
     * The error's stacktrace will be output when this error level is enabled.
     *
     * @param content
     * @param error
     */
```

### JavadocDeclaration
`@param error` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/Log.java`
#### Snippet
```java
     *
     * @param content
     * @param error
     */
    void info(CharSequence content, Throwable error);
```

### JavadocDeclaration
`@param error` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/Log.java`
#### Snippet
```java
     * The stack trace for this exception will be output when this error level is enabled.
     *
     * @param error
     */
    void error(Throwable error);
```

### JavadocDeclaration
`@param content` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/Log.java`
#### Snippet
```java
     * Send a message to the user in the <b>error</b> error level.
     *
     * @param content
     */
    void error(CharSequence content);
```

### JavadocDeclaration
`@param content` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/Log.java`
#### Snippet
```java
     * Send a message to the user in the <b>warn</b> error level.
     *
     * @param content
     */
    void warn(CharSequence content);
```

### JavadocDeclaration
`@param error` tag description is missing
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/logging/Log.java`
#### Snippet
```java
     * The stack trace for this exception will be output when this error level is enabled.
     *
     * @param error
     */
    void info(Throwable error);
```

### JavadocDeclaration
Class org.apache.maven.plugin.descriptor.DuplicateParameterException is not a descendant of Throwable
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/MojoDescriptor.java`
#### Snippet
```java
    /**
     * @param parameter add a new parameter
     * @throws DuplicateParameterException if any
     */
    public void addParameter(Parameter parameter) throws DuplicateParameterException {
```

### JavadocDeclaration
Class org.apache.maven.plugin.descriptor.DuplicateParameterException is not a descendant of Throwable
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/descriptor/MojoDescriptor.java`
#### Snippet
```java
    /**
     * @param parameters the new list of parameters
     * @throws DuplicateParameterException if any
     */
    public void setParameters(List<Parameter> parameters) throws DuplicateParameterException {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `artifact` may be 'final'
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/CyclicDependencyException.java`
#### Snippet
```java
 */
public class CyclicDependencyException extends ArtifactResolutionException {
    private Artifact artifact;

    public CyclicDependencyException(String message, Artifact artifact) {
```

### FieldMayBeFinal
Field `groupId` may be 'final'
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
 */
public class AbstractArtifactResolutionException extends Exception {
    private String groupId;

    private String artifactId;
```

### FieldMayBeFinal
Field `remoteRepositories` may be 'final'
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
    private Artifact artifact;

    private List<ArtifactRepository> remoteRepositories;

    private final String originalMessage;
```

### FieldMayBeFinal
Field `type` may be 'final'
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
    private String version;

    private String type;

    private String classifier;
```

### FieldMayBeFinal
Field `classifier` may be 'final'
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
    private String type;

    private String classifier;

    private Artifact artifact;
```

### FieldMayBeFinal
Field `artifactId` may be 'final'
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
    private String groupId;

    private String artifactId;

    private String version;
```

### FieldMayBeFinal
Field `version` may be 'final'
in `maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java`
#### Snippet
```java
    private String artifactId;

    private String version;

    private String type;
```

### FieldMayBeFinal
Field `effectiveToolchains` may be 'final'
in `maven-toolchain-builder/src/main/java/org/apache/maven/toolchain/building/DefaultToolchainsBuildingResult.java`
#### Snippet
```java
public class DefaultToolchainsBuildingResult implements ToolchainsBuildingResult {

    private PersistedToolchains effectiveToolchains;

    private List<Problem> problems;
```

### FieldMayBeFinal
Field `problems` may be 'final'
in `maven-toolchain-builder/src/main/java/org/apache/maven/toolchain/building/DefaultToolchainsBuildingResult.java`
#### Snippet
```java
    private PersistedToolchains effectiveToolchains;

    private List<Problem> problems;

    /**
```

### FieldMayBeFinal
Field `messages` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/project/validation/ModelValidationResult.java`
#### Snippet
```java

    /** */
    private List<String> messages;

    public ModelValidationResult() {
```

### FieldMayBeFinal
Field `id` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/artifact/ArtifactScopeEnum.java`
#### Snippet
```java
    public static final ArtifactScopeEnum DEFAULT_SCOPE = compile;

    private int id;

    // Constructor
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/WarningResolutionListener.java`
#### Snippet
```java
 */
public class WarningResolutionListener implements ResolutionListener {
    private Logger logger;

    public WarningResolutionListener(Logger logger) {
```

### FieldMayBeFinal
Field `originatingArtifact` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/UnresolvedArtifacts.java`
#### Snippet
```java
 */
public class UnresolvedArtifacts {
    private Artifact originatingArtifact;

    private List<Artifact> artifacts;
```

### FieldMayBeFinal
Field `artifacts` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/UnresolvedArtifacts.java`
#### Snippet
```java
    private Artifact originatingArtifact;

    private List<Artifact> artifacts;

    private List<ArtifactRepository> remoteRepositories;
```

### FieldMayBeFinal
Field `remoteRepositories` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/UnresolvedArtifacts.java`
#### Snippet
```java
    private List<Artifact> artifacts;

    private List<ArtifactRepository> remoteRepositories;

    public UnresolvedArtifacts(
```

### FieldMayBeFinal
Field `relatedMetadata` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/artifact/deployer/DefaultArtifactDeployer.java`
#### Snippet
```java
    private LegacySupport legacySupport;

    private Map<Object, MergeableMetadata> relatedMetadata = new ConcurrentHashMap<>();

    /**
```

### FieldMayBeFinal
Field `filters` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/filter/OrArtifactFilter.java`
#### Snippet
```java
public class OrArtifactFilter implements ArtifactFilter {

    private Set<ArtifactFilter> filters;

    public OrArtifactFilter() {
```

### FieldMayBeFinal
Field `ignoredArtifacts` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DebugResolutionListener.java`
#### Snippet
```java
    private String indent = "";

    private static Set<Artifact> ignoredArtifacts = new HashSet<>();

    public DebugResolutionListener(Logger logger) {
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/artifact/resolver/DebugResolutionListener.java`
#### Snippet
```java
 */
public class DebugResolutionListener implements ResolutionListener, ResolutionListenerForDepMgmt {
    private Logger logger;

    private String indent = "";
```

### FieldMayBeFinal
Field `artifact` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/SnapshotArtifactRepositoryMetadata.java`
#### Snippet
```java
 */
public class SnapshotArtifactRepositoryMetadata extends AbstractRepositoryMetadata {
    private Artifact artifact;

    public SnapshotArtifactRepositoryMetadata(Artifact artifact) {
```

### FieldMayBeFinal
Field `metadataFile` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/MetadataBridge.java`
#### Snippet
```java
    static class MetadataRepository extends DefaultArtifactRepository {

        private File metadataFile;

        MetadataRepository(File metadataFile) {
```

### FieldMayBeFinal
Field `metadata` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/MetadataBridge.java`
#### Snippet
```java
public final class MetadataBridge extends AbstractMetadata implements MergeableMetadata {

    private ArtifactMetadata metadata;

    private boolean merged;
```

### FieldMayBeFinal
Field `profileSelector` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/profiles/DefaultProfileManager.java`
#### Snippet
```java

    @Requirement
    private ProfileSelector profileSelector;

    private List<String> activatedIds = new ArrayList<>();
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/profiles/DefaultProfileManager.java`
#### Snippet
```java

    @Requirement
    private Logger logger;

    @Requirement
```

### FieldMayBeFinal
Field `requestProperties` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/profiles/DefaultProfileManager.java`
#### Snippet
```java
    private Map<String, Profile> profilesById = new LinkedHashMap<>();

    private Properties requestProperties;

    /**
```

### FieldMayBeFinal
Field `activatedIds` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/profiles/DefaultProfileManager.java`
#### Snippet
```java
    private ProfileSelector profileSelector;

    private List<String> activatedIds = new ArrayList<>();

    private List<String> deactivatedIds = new ArrayList<>();
```

### FieldMayBeFinal
Field `profilesById` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/profiles/DefaultProfileManager.java`
#### Snippet
```java
    private List<String> defaultIds = new ArrayList<>();

    private Map<String, Profile> profilesById = new LinkedHashMap<>();

    private Properties requestProperties;
```

### FieldMayBeFinal
Field `deactivatedIds` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/profiles/DefaultProfileManager.java`
#### Snippet
```java
    private List<String> activatedIds = new ArrayList<>();

    private List<String> deactivatedIds = new ArrayList<>();

    private List<String> defaultIds = new ArrayList<>();
```

### FieldMayBeFinal
Field `defaultIds` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/profiles/DefaultProfileManager.java`
#### Snippet
```java
    private List<String> deactivatedIds = new ArrayList<>();

    private List<String> defaultIds = new ArrayList<>();

    private Map<String, Profile> profilesById = new LinkedHashMap<>();
```

### FieldMayBeFinal
Field `projectId` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/repository/VersionNotFoundException.java`
#### Snippet
```java
    private Dependency dependency;

    private String projectId;
    private File pomFile;
    private InvalidVersionSpecificationException cause;
```

### FieldMayBeFinal
Field `dependency` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/repository/VersionNotFoundException.java`
#### Snippet
```java
 */
public class VersionNotFoundException extends Exception {
    private Dependency dependency;

    private String projectId;
```

### FieldMayBeFinal
Field `pomFile` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/repository/VersionNotFoundException.java`
#### Snippet
```java

    private String projectId;
    private File pomFile;
    private InvalidVersionSpecificationException cause;

```

### FieldMayBeFinal
Field `cause` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/repository/VersionNotFoundException.java`
#### Snippet
```java
    private String projectId;
    private File pomFile;
    private InvalidVersionSpecificationException cause;

    public VersionNotFoundException(
```

### FieldMayBeFinal
Field `localRepository` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/repository/UserLocalArtifactRepository.java`
#### Snippet
```java
 */
public class UserLocalArtifactRepository extends LocalArtifactRepository {
    private ArtifactRepository localRepository;

    public UserLocalArtifactRepository(ArtifactRepository localRepository) {
```

### FieldMayBeFinal
Field `resource` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/MavenArtifact.java`
#### Snippet
```java
    private String repositoryUrl;

    private Resource resource;

    private long transferStartTime;
```

### FieldMayBeFinal
Field `transferStartTime` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/MavenArtifact.java`
#### Snippet
```java
    private Resource resource;

    private long transferStartTime;

    MavenArtifact(String repositoryUrl, Resource resource) {
```

### FieldMayBeFinal
Field `repositoryUrl` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/repository/legacy/MavenArtifact.java`
#### Snippet
```java
class MavenArtifact implements ArtifactTransferResource {

    private String repositoryUrl;

    private Resource resource;
```

### FieldMayBeFinal
Field `closerFirst` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultGraphConflictResolutionPolicy.java`
#### Snippet
```java
     */
    @Configuration(name = "closer-first", value = "true")
    private boolean closerFirst = true;

    /**
```

### FieldMayBeFinal
Field `newerFirst` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/DefaultGraphConflictResolutionPolicy.java`
#### Snippet
```java
     */
    @Configuration(name = "newer-first", value = "true")
    private boolean newerFirst = true;

    public MetadataGraphEdge apply(MetadataGraphEdge e1, MetadataGraphEdge e2) {
```

### FieldMayBeFinal
Field `artifact` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataRetrievalException.java`
#### Snippet
```java
public class MetadataRetrievalException extends Exception {

    private ArtifactMetadata artifact;

    public MetadataRetrievalException(String message) {
```

### FieldMayBeFinal
Field `id` may be 'final'
in `maven-compat/src/main/java/org/apache/maven/repository/metadata/MetadataResolutionRequestTypeEnum.java`
#### Snippet
```java
    scopedGraph(7);

    private int id;

    // Constructor
```

### FieldMayBeFinal
Field `buildPomXMLFilterFactory` may be 'final'
in `maven-model-transform/src/main/java/org/apache/maven/model/transform/RawToConsumerPomXMLFilterFactory.java`
#### Snippet
```java
 */
public class RawToConsumerPomXMLFilterFactory {
    private BuildToRawPomXMLFilterFactory buildPomXMLFilterFactory;

    public RawToConsumerPomXMLFilterFactory(BuildToRawPomXMLFilterFactory buildPomXMLFilterFactory) {
```

### FieldMayBeFinal
Field `collisions` may be 'final'
in `maven-core/src/main/java/org/apache/maven/DuplicateProjectException.java`
#### Snippet
```java
public class DuplicateProjectException extends MavenExecutionException {

    private Map<String, List<File>> collisions;

    /**
```

### FieldMayBeFinal
Field `moduleFile` may be 'final'
in `maven-core/src/main/java/org/apache/maven/MissingModuleException.java`
#### Snippet
```java
public class MissingModuleException extends MavenExecutionException {

    private File moduleFile;
    private final String moduleName;

```

### FieldMayBeFinal
Field `projectDependencyGraph` may be 'final'
in `maven-core/src/main/java/org/apache/maven/graph/FilteredProjectDependencyGraph.java`
#### Snippet
```java
class FilteredProjectDependencyGraph implements ProjectDependencyGraph {

    private ProjectDependencyGraph projectDependencyGraph;

    private Map<MavenProject, ?> whiteList;
```

### FieldMayBeFinal
Field `whiteList` may be 'final'
in `maven-core/src/main/java/org/apache/maven/graph/FilteredProjectDependencyGraph.java`
#### Snippet
```java
    private ProjectDependencyGraph projectDependencyGraph;

    private Map<MavenProject, ?> whiteList;

    private List<MavenProject> sortedProjects;
```

### FieldMayBeFinal
Field `plugin` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginNotFoundException.java`
#### Snippet
```java
 */
public class PluginNotFoundException extends AbstractArtifactResolutionException {
    private Plugin plugin;

    public PluginNotFoundException(Plugin plugin, ArtifactNotFoundException e) {
```

### FieldMayBeFinal
Field `pluginRealm` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginContainerException.java`
#### Snippet
```java
public class PluginContainerException extends PluginManagerException {

    private ClassRealm pluginRealm;

    public PluginContainerException(
```

### FieldMayBeFinal
Field `legacySupport` may be 'final'
in `maven-core/src/main/java/org/apache/maven/DefaultMaven.java`
#### Snippet
```java
    private ExecutionEventCatapult eventCatapult;

    private LegacySupport legacySupport;

    private SessionScope sessionScope;
```

### FieldMayBeFinal
Field `eventCatapult` may be 'final'
in `maven-core/src/main/java/org/apache/maven/DefaultMaven.java`
#### Snippet
```java
    protected PlexusContainer container;

    private ExecutionEventCatapult eventCatapult;

    private LegacySupport legacySupport;
```

### FieldMayBeFinal
Field `sessionScope` may be 'final'
in `maven-core/src/main/java/org/apache/maven/DefaultMaven.java`
#### Snippet
```java
    private LegacySupport legacySupport;

    private SessionScope sessionScope;

    private DefaultRepositorySystemSessionFactory repositorySessionFactory;
```

### FieldMayBeFinal
Field `lifecycleStarter` may be 'final'
in `maven-core/src/main/java/org/apache/maven/DefaultMaven.java`
#### Snippet
```java
    protected ProjectBuilder projectBuilder;

    private LifecycleStarter lifecycleStarter;

    protected PlexusContainer container;
```

### FieldMayBeFinal
Field `repositorySessionFactory` may be 'final'
in `maven-core/src/main/java/org/apache/maven/DefaultMaven.java`
#### Snippet
```java
    private SessionScope sessionScope;

    private DefaultRepositorySystemSessionFactory repositorySessionFactory;

    private final GraphBuilder graphBuilder;
```

### FieldMayBeFinal
Field `originalMessage` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginConfigurationException.java`
#### Snippet
```java
    private PluginDescriptor pluginDescriptor;

    private String originalMessage;

    public PluginConfigurationException(PluginDescriptor pluginDescriptor, String originalMessage) {
```

### FieldMayBeFinal
Field `pluginDescriptor` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginConfigurationException.java`
#### Snippet
```java
 */
public class PluginConfigurationException extends Exception {
    private PluginDescriptor pluginDescriptor;

    private String originalMessage;
```

### FieldMayBeFinal
Field `descriptors` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginDescriptorCache.java`
#### Snippet
```java
public class DefaultPluginDescriptorCache implements PluginDescriptorCache {

    private Map<Key, PluginDescriptor> descriptors = new ConcurrentHashMap<>(128);

    public void flush() {
```

### FieldMayBeFinal
Field `forkedExecutions` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/MojoExecution.java`
#### Snippet
```java
     * the forked execution are to be run and in reactor build order.
     */
    private Map<String, List<MojoExecution>> forkedExecutions = new LinkedHashMap<>();

    public MojoExecution(Plugin plugin, String goal, String executionId) {
```

### FieldMayBeFinal
Field `executionId` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/MojoExecution.java`
#### Snippet
```java
    private String goal;

    private String executionId;

    private MojoDescriptor mojoDescriptor;
```

### FieldMayBeFinal
Field `project` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
    private MojoExecution mojoExecution;

    private MavenProject project;

    private String basedir;
```

### FieldMayBeFinal
Field `basedir` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
    private MavenProject project;

    private String basedir;

    private Properties properties;
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
    private String basedir;

    private Properties properties;

    public PluginParameterExpressionEvaluator(MavenSession session) {
```

### FieldMayBeFinal
Field `mojoExecution` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
    private MavenSession session;

    private MojoExecution mojoExecution;

    private MavenProject project;
```

### FieldMayBeFinal
Field `session` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java`
#### Snippet
```java
 */
public class PluginParameterExpressionEvaluator implements TypeAwareExpressionEvaluator {
    private MavenSession session;

    private MojoExecution mojoExecution;
```

### FieldMayBeFinal
Field `mojoExecution` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java
    private Session session;

    private MojoExecution mojoExecution;

    private Project project;
```

### FieldMayBeFinal
Field `basedir` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java
    private Project project;

    private Path basedir;

    private Properties properties;
```

### FieldMayBeFinal
Field `session` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java
 */
public class PluginParameterExpressionEvaluatorV4 implements TypeAwareExpressionEvaluator {
    private Session session;

    private MojoExecution mojoExecution;
```

### FieldMayBeFinal
Field `project` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java
    private MojoExecution mojoExecution;

    private Project project;

    private Path basedir;
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorV4.java`
#### Snippet
```java
    private Path basedir;

    private Properties properties;

    public PluginParameterExpressionEvaluatorV4(Session session, Project project) {
```

### FieldMayBeFinal
Field `unresolvedDependencies` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/DefaultDependencyResolutionResult.java`
#### Snippet
```java
    private List<Dependency> resolvedDependencies = new ArrayList<>();

    private List<Dependency> unresolvedDependencies = new ArrayList<>();

    private List<Exception> collectionErrors = new ArrayList<>();
```

### FieldMayBeFinal
Field `resolutionErrors` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/DefaultDependencyResolutionResult.java`
#### Snippet
```java
    private List<Exception> collectionErrors = new ArrayList<>();

    private Map<Dependency, List<Exception>> resolutionErrors = new IdentityHashMap<>();

    public DependencyNode getDependencyGraph() {
```

### FieldMayBeFinal
Field `resolvedDependencies` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/DefaultDependencyResolutionResult.java`
#### Snippet
```java
    private List<Dependency> dependencies = new ArrayList<>();

    private List<Dependency> resolvedDependencies = new ArrayList<>();

    private List<Dependency> unresolvedDependencies = new ArrayList<>();
```

### FieldMayBeFinal
Field `dependencies` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/DefaultDependencyResolutionResult.java`
#### Snippet
```java
    private DependencyNode root;

    private List<Dependency> dependencies = new ArrayList<>();

    private List<Dependency> resolvedDependencies = new ArrayList<>();
```

### FieldMayBeFinal
Field `pool` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/ReactorModelPool.java`
#### Snippet
```java

    static class Builder {
        private ReactorModelPool pool = new ReactorModelPool();

        Builder put(Path pomFile, Model model) {
```

### FieldMayBeFinal
Field `projectBuildingHelper` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/DefaultModelBuildingListener.java`
#### Snippet
```java
    private MavenProject project;

    private ProjectBuildingHelper projectBuildingHelper;

    private ProjectBuildingRequest projectBuildingRequest;
```

### FieldMayBeFinal
Field `projectBuildingRequest` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/DefaultModelBuildingListener.java`
#### Snippet
```java
    private ProjectBuildingHelper projectBuildingHelper;

    private ProjectBuildingRequest projectBuildingRequest;

    private List<ArtifactRepository> remoteRepositories;
```

### FieldMayBeFinal
Field `project` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/DefaultModelBuildingListener.java`
#### Snippet
```java
public class DefaultModelBuildingListener extends AbstractModelBuildingListener {

    private MavenProject project;

    private ProjectBuildingHelper projectBuildingHelper;
```

### FieldMayBeFinal
Field `artifact` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/DuplicateArtifactAttachmentException.java`
#### Snippet
```java
    private static final String DEFAULT_MESSAGE = "Duplicate artifact attachment detected.";

    private Artifact artifact;

    private final MavenProject project;
```

### FieldMayBeFinal
Field `projectMap` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/ProjectSorter.java`
#### Snippet
```java
    private List<MavenProject> sortedProjects;

    private Map<String, MavenProject> projectMap;

    /**
```

### FieldMayBeFinal
Field `sortedProjects` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/ProjectSorter.java`
#### Snippet
```java
    private DAG dag;

    private List<MavenProject> sortedProjects;

    private Map<String, MavenProject> projectMap;
```

### FieldMayBeFinal
Field `dag` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/ProjectSorter.java`
#### Snippet
```java
 */
public class ProjectSorter {
    private DAG dag;

    private List<MavenProject> sortedProjects;
```

### FieldMayBeFinal
Field `dependency` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/artifact/InvalidDependencyVersionException.java`
#### Snippet
```java
 */
public class InvalidDependencyVersionException extends InvalidProjectVersionException {
    private Dependency dependency;

    public InvalidDependencyVersionException(
```

### FieldMayBeFinal
Field `pluginDependenciesResolver` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
    private PluginDescriptorCache pluginDescriptorCache;
    private PluginRealmCache pluginRealmCache;
    private PluginDependenciesResolver pluginDependenciesResolver;
    private RuntimeInformation runtimeInformation;
    private ExtensionRealmCache extensionRealmCache;
```

### FieldMayBeFinal
Field `extensionRealmCache` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
    private PluginDependenciesResolver pluginDependenciesResolver;
    private RuntimeInformation runtimeInformation;
    private ExtensionRealmCache extensionRealmCache;
    private PluginVersionResolver pluginVersionResolver;
    private PluginArtifactsCache pluginArtifactsCache;
```

### FieldMayBeFinal
Field `configurationValidators` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
    private PluginArtifactsCache pluginArtifactsCache;
    private MavenPluginValidator pluginValidator;
    private List<MavenPluginConfigurationValidator> configurationValidators;
    private PluginValidationManager pluginValidationManager;
    private List<MavenPluginPrerequisitesChecker> prerequisitesCheckers;
```

### FieldMayBeFinal
Field `classRealmManager` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java

    private PlexusContainer container;
    private ClassRealmManager classRealmManager;
    private PluginDescriptorCache pluginDescriptorCache;
    private PluginRealmCache pluginRealmCache;
```

### FieldMayBeFinal
Field `pluginArtifactsCache` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
    private ExtensionRealmCache extensionRealmCache;
    private PluginVersionResolver pluginVersionResolver;
    private PluginArtifactsCache pluginArtifactsCache;
    private MavenPluginValidator pluginValidator;
    private List<MavenPluginConfigurationValidator> configurationValidators;
```

### FieldMayBeFinal
Field `pluginValidationManager` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
    private MavenPluginValidator pluginValidator;
    private List<MavenPluginConfigurationValidator> configurationValidators;
    private PluginValidationManager pluginValidationManager;
    private List<MavenPluginPrerequisitesChecker> prerequisitesCheckers;
    private final ExtensionDescriptorBuilder extensionDescriptorBuilder = new ExtensionDescriptorBuilder();
```

### FieldMayBeFinal
Field `pluginDescriptorCache` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
    private PlexusContainer container;
    private ClassRealmManager classRealmManager;
    private PluginDescriptorCache pluginDescriptorCache;
    private PluginRealmCache pluginRealmCache;
    private PluginDependenciesResolver pluginDependenciesResolver;
```

### FieldMayBeFinal
Field `container` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private PlexusContainer container;
    private ClassRealmManager classRealmManager;
    private PluginDescriptorCache pluginDescriptorCache;
```

### FieldMayBeFinal
Field `prerequisitesCheckers` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
    private List<MavenPluginConfigurationValidator> configurationValidators;
    private PluginValidationManager pluginValidationManager;
    private List<MavenPluginPrerequisitesChecker> prerequisitesCheckers;
    private final ExtensionDescriptorBuilder extensionDescriptorBuilder = new ExtensionDescriptorBuilder();
    private final PluginDescriptorBuilder builder = new PluginDescriptorBuilder();
```

### FieldMayBeFinal
Field `pluginVersionResolver` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
    private RuntimeInformation runtimeInformation;
    private ExtensionRealmCache extensionRealmCache;
    private PluginVersionResolver pluginVersionResolver;
    private PluginArtifactsCache pluginArtifactsCache;
    private MavenPluginValidator pluginValidator;
```

### FieldMayBeFinal
Field `pluginValidator` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
    private PluginVersionResolver pluginVersionResolver;
    private PluginArtifactsCache pluginArtifactsCache;
    private MavenPluginValidator pluginValidator;
    private List<MavenPluginConfigurationValidator> configurationValidators;
    private PluginValidationManager pluginValidationManager;
```

### FieldMayBeFinal
Field `runtimeInformation` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
    private PluginRealmCache pluginRealmCache;
    private PluginDependenciesResolver pluginDependenciesResolver;
    private RuntimeInformation runtimeInformation;
    private ExtensionRealmCache extensionRealmCache;
    private PluginVersionResolver pluginVersionResolver;
```

### FieldMayBeFinal
Field `pluginRealmCache` may be 'final'
in `maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java`
#### Snippet
```java
    private ClassRealmManager classRealmManager;
    private PluginDescriptorCache pluginDescriptorCache;
    private PluginRealmCache pluginRealmCache;
    private PluginDependenciesResolver pluginDependenciesResolver;
    private RuntimeInformation runtimeInformation;
```

### FieldMayBeFinal
Field `plugin` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/artifact/PluginArtifact.java`
#### Snippet
```java
 */
public class PluginArtifact extends DefaultArtifact implements ArtifactWithDependencies {
    private Plugin plugin;

    public PluginArtifact(Plugin plugin, Artifact pluginArtifact) {
```

### FieldMayBeFinal
Field `project` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/artifact/ProjectArtifact.java`
#### Snippet
```java
 */
public class ProjectArtifact extends DefaultArtifact implements ArtifactWithDependencies {
    private MavenProject project;

    public ProjectArtifact(MavenProject project) {
```

### FieldMayBeFinal
Field `aggregating` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultProjectArtifactsCache.java`
#### Snippet
```java
        private final Set<String> resolve;

        private boolean aggregating;

        private final int hashCode;
```

### FieldMayBeFinal
Field `length` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
        private List<ArtifactRepository> remoteRepositories;

        private long length;
        private long timestamp;

```

### FieldMayBeFinal
Field `timestamp` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java

        private long length;
        private long timestamp;

        CacheRecord(
```

### FieldMayBeFinal
Field `remoteRepositories` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
        private List<Artifact> artifacts;
        private Map<String, Artifact> managedVersions;
        private List<ArtifactRepository> remoteRepositories;

        private long length;
```

### FieldMayBeFinal
Field `relocatedArtifact` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
    public class CacheRecord {
        private Artifact pomArtifact;
        private Artifact relocatedArtifact;
        private List<Artifact> artifacts;
        private Map<String, Artifact> managedVersions;
```

### FieldMayBeFinal
Field `pomArtifact` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
     */
    public class CacheRecord {
        private Artifact pomArtifact;
        private Artifact relocatedArtifact;
        private List<Artifact> artifacts;
```

### FieldMayBeFinal
Field `artifacts` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java`
#### Snippet
```java
        private Artifact pomArtifact;
        private Artifact relocatedArtifact;
        private List<Artifact> artifacts;
        private Map<String, Artifact> managedVersions;
        private List<ArtifactRepository> remoteRepositories;
```

### FieldMayBeFinal
Field `excludes` may be 'final'
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/ExclusionSetFilter.java`
#### Snippet
```java
 */
public class ExclusionSetFilter implements ArtifactFilter {
    private Set<String> excludes;

    public ExclusionSetFilter(String[] excludes) {
```

### FieldMayBeFinal
Field `scopes` may be 'final'
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/CumulativeScopeArtifactFilter.java`
#### Snippet
```java
public class CumulativeScopeArtifactFilter extends AbstractScopeArtifactFilter {

    private Set<String> scopes;

    /**
```

### FieldMayBeFinal
Field `groupIdAndArtifactIdIsWildcard` may be 'final'
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/ExclusionArtifactFilter.java`
#### Snippet
```java
    private Predicate<Exclusion> artifactIdIsWildcard = exclusion -> WILDCARD.equals(exclusion.getArtifactId());

    private Predicate<Exclusion> groupIdAndArtifactIdIsWildcard = groupIdIsWildcard.and(artifactIdIsWildcard);

    private Predicate<Exclusion> exclude(Artifact artifact) {
```

### FieldMayBeFinal
Field `artifactIdIsWildcard` may be 'final'
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/ExclusionArtifactFilter.java`
#### Snippet
```java
    private Predicate<Exclusion> groupIdIsWildcard = exclusion -> WILDCARD.equals(exclusion.getGroupId());

    private Predicate<Exclusion> artifactIdIsWildcard = exclusion -> WILDCARD.equals(exclusion.getArtifactId());

    private Predicate<Exclusion> groupIdAndArtifactIdIsWildcard = groupIdIsWildcard.and(artifactIdIsWildcard);
```

### FieldMayBeFinal
Field `groupIdIsWildcard` may be 'final'
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/ExclusionArtifactFilter.java`
#### Snippet
```java
    }

    private Predicate<Exclusion> groupIdIsWildcard = exclusion -> WILDCARD.equals(exclusion.getGroupId());

    private Predicate<Exclusion> artifactIdIsWildcard = exclusion -> WILDCARD.equals(exclusion.getArtifactId());
```

### FieldMayBeFinal
Field `filters` may be 'final'
in `maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/AndArtifactFilter.java`
#### Snippet
```java
 */
public class AndArtifactFilter implements ArtifactFilter {
    private Set<ArtifactFilter> filters;

    public AndArtifactFilter() {
```

### FieldMayBeFinal
Field `projectReferences` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    private Map<String, Artifact> managedVersionMap;

    private Map<String, MavenProject> projectReferences = new HashMap<>();

    private boolean executionRoot;
```

### FieldMayBeFinal
Field `injectedProfileIds` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    private List<Profile> activeProfiles = new ArrayList<>();

    private Map<String, List<String>> injectedProfileIds = new LinkedHashMap<>();

    private Set<Artifact> dependencyArtifacts;
```

### FieldMayBeFinal
Field `mavenRepositorySystem` may be 'final'
in `maven-core/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java`
#### Snippet
```java
    private final LegacySupport legacySupport;

    private MavenRepositorySystem mavenRepositorySystem;

    @Inject
```

### FieldMayBeFinal
Field `artifact` may be 'final'
in `maven-core/src/main/java/org/apache/maven/artifact/repository/metadata/ArtifactRepositoryMetadata.java`
#### Snippet
```java
 */
public class ArtifactRepositoryMetadata extends AbstractRepositoryMetadata {
    private Artifact artifact;

    public ArtifactRepositoryMetadata(Artifact artifact) {
```

### FieldMayBeFinal
Field `sessionFactory` may be 'final'
in `maven-core/src/main/java/org/apache/maven/internal/impl/EventSpyImpl.java`
#### Snippet
```java
public class EventSpyImpl implements EventSpy {

    private DefaultSessionFactory sessionFactory;

    @Inject
```

### FieldMayBeFinal
Field `readers` may be 'final'
in `maven-core/src/main/java/org/apache/maven/internal/aether/MavenChainedWorkspaceReader.java`
#### Snippet
```java
    private ChainedWorkspaceReader delegate;

    private WorkspaceReader[] readers;

    /**
```

### FieldMayBeFinal
Field `delegate` may be 'final'
in `maven-core/src/main/java/org/apache/maven/internal/aether/MavenChainedWorkspaceReader.java`
#### Snippet
```java
public final class MavenChainedWorkspaceReader implements MavenWorkspaceReader {

    private ChainedWorkspaceReader delegate;

    private WorkspaceReader[] readers;
```

### FieldMayBeFinal
Field `message` may be 'final'
in `maven-core/src/main/java/org/apache/maven/exception/ExceptionSummary.java`
#### Snippet
```java
    private Throwable exception;

    private String message;

    private String reference;
```

### FieldMayBeFinal
Field `children` may be 'final'
in `maven-core/src/main/java/org/apache/maven/exception/ExceptionSummary.java`
#### Snippet
```java
    private String reference;

    private List<ExceptionSummary> children;

    public ExceptionSummary(Throwable exception, String message, String reference) {
```

### FieldMayBeFinal
Field `reference` may be 'final'
in `maven-core/src/main/java/org/apache/maven/exception/ExceptionSummary.java`
#### Snippet
```java
    private String message;

    private String reference;

    private List<ExceptionSummary> children;
```

### FieldMayBeFinal
Field `exception` may be 'final'
in `maven-core/src/main/java/org/apache/maven/exception/ExceptionSummary.java`
#### Snippet
```java
public class ExceptionSummary {

    private Throwable exception;

    private String message;
```

### FieldMayBeFinal
Field `blackList` may be 'final'
in `maven-core/src/main/java/org/apache/maven/execution/ReactorManager.java`
#### Snippet
```java
    public static final String MAKE_BOTH_MODE = "make-both";

    private List<String> blackList = new ArrayList<>();

    private Map<String, BuildFailure> buildFailuresByProject = new HashMap<>();
```

### FieldMayBeFinal
Field `buildSuccessesByProject` may be 'final'
in `maven-core/src/main/java/org/apache/maven/execution/ReactorManager.java`
#### Snippet
```java
    private final ProjectSorter sorter;

    private Map<String, BuildSuccess> buildSuccessesByProject = new HashMap<>();

    public ReactorManager(List<MavenProject> projects) throws CycleDetectedException, DuplicateProjectException {
```

### FieldMayBeFinal
Field `pluginContextsByProjectAndPluginKey` may be 'final'
in `maven-core/src/main/java/org/apache/maven/execution/ReactorManager.java`
#### Snippet
```java
    private Map<String, BuildFailure> buildFailuresByProject = new HashMap<>();

    private Map<String, Map<String, Map>> pluginContextsByProjectAndPluginKey = new HashMap<>();

    private String failureBehavior = FAIL_FAST;
```

### FieldMayBeFinal
Field `buildFailuresByProject` may be 'final'
in `maven-core/src/main/java/org/apache/maven/execution/ReactorManager.java`
#### Snippet
```java
    private List<String> blackList = new ArrayList<>();

    private Map<String, BuildFailure> buildFailuresByProject = new HashMap<>();

    private Map<String, Map<String, Map>> pluginContextsByProjectAndPluginKey = new HashMap<>();
```

### FieldMayBeFinal
Field `keys` may be 'final'
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleDependencyResolver.java`
#### Snippet
```java
    private static class ReactorDependencyFilter implements DependencyFilter {

        private Set<String> keys = new HashSet<>();

        ReactorDependencyFilter(Collection<Artifact> artifacts) {
```

### FieldMayBeFinal
Field `provides` may be 'final'
in `maven-core/src/main/java/org/apache/maven/toolchain/RequirementMatcherFactory.java`
#### Snippet
```java
    private static final class ExactMatcher implements RequirementMatcher {

        private String provides;

        private ExactMatcher(String provides) {
```

### FieldMayBeFinal
Field `provides` may be 'final'
in `maven-core/src/main/java/org/apache/maven/toolchain/DefaultToolchain.java`
#### Snippet
```java
    private String type;

    private Map<String, RequirementMatcher> provides = new HashMap<>();

    public static final String KEY_TYPE = "type"; // NOI18N
```

### FieldMayBeFinal
Field `model` may be 'final'
in `maven-core/src/main/java/org/apache/maven/toolchain/DefaultToolchain.java`
#### Snippet
```java
    public static final String KEY_TYPE = "type"; // NOI18N

    private ToolchainModel model;

    /**
```

### FieldMayBeFinal
Field `artifact` may be 'final'
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/ArtifactMetadataRetrievalException.java`
#### Snippet
```java
 */
public class ArtifactMetadataRetrievalException extends Exception {
    private Artifact artifact;

    /**
```

### FieldMayBeFinal
Field `repositoryRequest` may be 'final'
in `maven-core/src/main/java/org/apache/maven/repository/legacy/metadata/DefaultMetadataResolutionRequest.java`
#### Snippet
```java
    private boolean resolveManagedVersions;

    private RepositoryRequest repositoryRequest;

    public DefaultMetadataResolutionRequest() {
```

### FieldMayBeFinal
Field `artifact` may be 'final'
in `maven-core/src/main/java/org/apache/maven/repository/ArtifactTransferEvent.java`
#### Snippet
```java
    private File localFile;

    private ArtifactTransferResource artifact;

    private long transferredBytes;
```

### FieldMayBeFinal
Field `closed` may be 'final'
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java
        private String value;

        private boolean closed;

        RangeValue(String value, boolean closed) {
```

### FieldMayBeFinal
Field `value` may be 'final'
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java`
#### Snippet
```java

    private static class RangeValue {
        private String value;

        private boolean closed;
```

### FieldMayBeFinal
Field `merger` may be 'final'
in `maven-model-builder/src/main/java/org/apache/maven/model/profile/DefaultProfileInjector.java`
#### Snippet
```java
public class DefaultProfileInjector implements ProfileInjector {

    private ProfileModelMerger merger = new ProfileModelMerger();

    @Override
```

### FieldMayBeFinal
Field `problems` may be 'final'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelProblemCollector.java`
#### Snippet
```java
    private final ModelBuildingResult result;

    private List<ModelProblem> problems;

    private String source;
```

### FieldMayBeFinal
Field `severities` may be 'final'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelProblemCollector.java`
#### Snippet
```java
    private Model rootModel;

    private Set<ModelProblem.Severity> severities = EnumSet.noneOf(ModelProblem.Severity.class);

    DefaultModelProblemCollector(ModelBuildingResult result) {
```

### FieldMayBeFinal
Field `model` may be 'final'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingEvent.java`
#### Snippet
```java
class DefaultModelBuildingEvent implements ModelBuildingEvent {

    private Model model;

    private final ModelBuildingRequest request;
```

### FieldMayBeFinal
Field `rawModels` may be 'final'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingResult.java`
#### Snippet
```java
    private List<String> modelIds;

    private Map<String, Model> rawModels;

    private Map<String, List<Profile>> activePomProfiles;
```

### FieldMayBeFinal
Field `activePomProfiles` may be 'final'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingResult.java`
#### Snippet
```java
    private Map<String, Model> rawModels;

    private Map<String, List<Profile>> activePomProfiles;

    private List<Profile> activeExternalProfiles;
```

### FieldMayBeFinal
Field `modelIds` may be 'final'
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingResult.java`
#### Snippet
```java
    private Model effectiveModel;

    private List<String> modelIds;

    private Map<String, Model> rawModels;
```

### FieldMayBeFinal
Field `merger` may be 'final'
in `maven-model-builder/src/main/java/org/apache/maven/model/management/DefaultDependencyManagementInjector.java`
#### Snippet
```java
public class DefaultDependencyManagementInjector implements DependencyManagementInjector {

    private ManagementModelMerger merger = new ManagementModelMerger();

    @Override
```

### FieldMayBeFinal
Field `repository` may be 'final'
in `maven-model-builder/src/main/java/org/apache/maven/model/resolution/InvalidRepositoryException.java`
#### Snippet
```java
     * The repository that raised this error, can be {@code null}.
     */
    private Repository repository;

    /**
```

### FieldMayBeFinal
Field `merger` may be 'final'
in `maven-model-builder/src/main/java/org/apache/maven/model/management/DefaultPluginManagementInjector.java`
#### Snippet
```java
public class DefaultPluginManagementInjector implements PluginManagementInjector {

    private ManagementModelMerger merger = new ManagementModelMerger();

    @Override
```

### FieldMayBeFinal
Field `merger` may be 'final'
in `maven-model-builder/src/main/java/org/apache/maven/model/inheritance/DefaultInheritanceAssembler.java`
#### Snippet
```java
public class DefaultInheritanceAssembler implements InheritanceAssembler {

    private InheritanceModelMerger merger = new InheritanceModelMerger();

    private static final String CHILD_DIRECTORY = "child-directory";
```

### FieldMayBeFinal
Field `normalizer` may be 'final'
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/UrlNormalizingPostProcessor.java`
#### Snippet
```java
    }

    private UrlNormalizer normalizer;

    UrlNormalizingPostProcessor(UrlNormalizer normalizer) {
```

### FieldMayBeFinal
Field `formattedTimestamp` may be 'final'
in `maven-model-builder/src/main/java/org/apache/maven/model/interpolation/MavenBuildTimestamp.java`
#### Snippet
```java
    public static final TimeZone DEFAULT_BUILD_TIME_ZONE = TimeZone.getTimeZone("Etc/UTC");

    private String formattedTimestamp;

    public MavenBuildTimestamp() {
```

### FieldMayBeFinal
Field `merger` may be 'final'
in `maven-model-builder/src/main/java/org/apache/maven/model/normalization/DefaultModelNormalizer.java`
#### Snippet
```java
public class DefaultModelNormalizer implements ModelNormalizer {

    private DuplicateMerger merger = new DuplicateMerger();

    @Override
```

### FieldMayBeFinal
Field `problems` may be 'final'
in `maven-builder-support/src/main/java/org/apache/maven/building/DefaultProblemCollector.java`
#### Snippet
```java
class DefaultProblemCollector implements ProblemCollector {

    private List<Problem> problems;

    private String source;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `maven-embedder/src/main/java/org/apache/maven/cli/logging/Slf4jLogger.java`
#### Snippet
```java
public class Slf4jLogger implements Logger {

    private org.slf4j.Logger logger;

    public Slf4jLogger(org.slf4j.Logger logger) {
```

### FieldMayBeFinal
Field `out` may be 'final'
in `maven-embedder/src/main/java/org/apache/maven/cli/logging/Slf4jStdoutLogger.java`
#### Snippet
```java
    private static final String ERROR = "[ERROR] ";

    private PrintStream out = System.out;

    //
```

### FieldMayBeFinal
Field `loggerFactory` may be 'final'
in `maven-embedder/src/main/java/org/apache/maven/cli/logging/Slf4jLoggerManager.java`
#### Snippet
```java
public class Slf4jLoggerManager implements LoggerManager {

    private ILoggerFactory loggerFactory;

    public Slf4jLoggerManager() {
```

### FieldMayBeFinal
Field `container` may be 'final'
in `maven-core/src/main/java/org/apache/maven/execution/MavenSession.java`
#### Snippet
```java
    //

    private PlexusContainer container;

    private final Settings settings;
```

### FieldMayBeFinal
Field `request` may be 'final'
in `maven-core/src/main/java/org/apache/maven/execution/MavenSession.java`
#### Snippet
```java
 */
public class MavenSession implements Cloneable {
    private MavenExecutionRequest request;

    private MavenExecutionResult result;
```

### FieldMayBeFinal
Field `transfers` may be 'final'
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/ConsoleMavenTransferListener.java`
#### Snippet
```java
public class ConsoleMavenTransferListener extends AbstractMavenTransferListener {

    private Map<TransferResource, Long> transfers = Collections.synchronizedMap(new LinkedHashMap<>());

    private boolean printResourceNames;
```

### FieldMayBeFinal
Field `printResourceNames` may be 'final'
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/ConsoleMavenTransferListener.java`
#### Snippet
```java
    private Map<TransferResource, Long> transfers = Collections.synchronizedMap(new LinkedHashMap<>());

    private boolean printResourceNames;
    private int lastLength;

```

### FieldMayBeFinal
Field `largeFormat` may be 'final'
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/AbstractMavenTransferListener.java`
#### Snippet
```java

        private DecimalFormat smallFormat;
        private DecimalFormat largeFormat;

        FileSizeFormat(Locale locale) {
```

### FieldMayBeFinal
Field `smallFormat` may be 'final'
in `maven-embedder/src/main/java/org/apache/maven/cli/transfer/AbstractMavenTransferListener.java`
#### Snippet
```java
        }

        private DecimalFormat smallFormat;
        private DecimalFormat largeFormat;

```

### FieldMayBeFinal
Field `userLocalArtifactRepository` may be 'final'
in `maven-core/src/main/java/org/apache/maven/repository/DelegatingLocalArtifactRepository.java`
#### Snippet
```java
    private LocalArtifactRepository ideWorkspace;

    private ArtifactRepository userLocalArtifactRepository;

    public DelegatingLocalArtifactRepository(ArtifactRepository artifactRepository) {
```

### FieldMayBeFinal
Field `classWorld` may be 'final'
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
    public static final String STYLE_COLOR_PROPERTY = "style.color";

    private ClassWorld classWorld;

    private LoggerManager plexusLoggerManager;
```

### FieldMayBeFinal
Field `proxies` may be 'final'
in `maven-settings-builder/src/main/java/org/apache/maven/settings/crypto/DefaultSettingsDecryptionResult.java`
#### Snippet
```java
    private List<Server> servers;

    private List<Proxy> proxies;

    private List<SettingsProblem> problems;
```

### FieldMayBeFinal
Field `servers` may be 'final'
in `maven-settings-builder/src/main/java/org/apache/maven/settings/crypto/DefaultSettingsDecryptionResult.java`
#### Snippet
```java
class DefaultSettingsDecryptionResult implements SettingsDecryptionResult {

    private List<Server> servers;

    private List<Proxy> proxies;
```

### FieldMayBeFinal
Field `problems` may be 'final'
in `maven-settings-builder/src/main/java/org/apache/maven/settings/crypto/DefaultSettingsDecryptionResult.java`
#### Snippet
```java
    private List<Proxy> proxies;

    private List<SettingsProblem> problems;

    DefaultSettingsDecryptionResult(List<Server> servers, List<Proxy> proxies, List<SettingsProblem> problems) {
```

### FieldMayBeFinal
Field `problems` may be 'final'
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsProblemCollector.java`
#### Snippet
```java
class DefaultSettingsProblemCollector implements SettingsProblemCollector {

    private List<SettingsProblem> problems;

    private String source;
```

### FieldMayBeFinal
Field `effectiveSettings` may be 'final'
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuildingResult.java`
#### Snippet
```java
class DefaultSettingsBuildingResult implements SettingsBuildingResult {

    private Settings effectiveSettings;

    private List<SettingsProblem> problems;
```

### FieldMayBeFinal
Field `problems` may be 'final'
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuildingResult.java`
#### Snippet
```java
    private Settings effectiveSettings;

    private List<SettingsProblem> problems;

    DefaultSettingsBuildingResult(Settings effectiveSettings, List<SettingsProblem> problems) {
```

### FieldMayBeFinal
Field `snapshots` may be 'final'
in `maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/LocalSnapshotMetadataGenerator.java`
#### Snippet
```java
class LocalSnapshotMetadataGenerator implements MetadataGenerator {

    private Map<Object, LocalSnapshotMetadata> snapshots;

    private final boolean legacyFormat;
```

### FieldMayBeFinal
Field `pluginDescriptor` may be 'final'
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoNotFoundException.java`
#### Snippet
```java
    private String goal;

    private PluginDescriptor pluginDescriptor;

    public MojoNotFoundException(String goal, PluginDescriptor pluginDescriptor) {
```

### FieldMayBeFinal
Field `goal` may be 'final'
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/MojoNotFoundException.java`
#### Snippet
```java
 */
public class MojoNotFoundException extends Exception {
    private String goal;

    private PluginDescriptor pluginDescriptor;
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u005B` can be replaced with '\['
in `maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java`
#### Snippet
```java
    private static final Pattern LAST_ANSI_SEQUENCE = Pattern.compile("(\u001B\\[[;\\d]*[ -/]*[@-~])[^\u001B]*$");

    private static final String ANSI_RESET = "\u001B\u005Bm";

    private void configure(CliRequest cliRequest) throws Exception {
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `maven-core/src/main/java/org/apache/maven/internal/transformation/ConsumerPomArtifactTransformer.java`
#### Snippet
```java
                    || artifact.getExtension().startsWith("pom.")) {
                // skip POM and POM subordinates
                continue;
            } else {
                // everything else: add as is
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `properties`
in `maven-core/src/main/java/org/apache/maven/properties/internal/SystemProperties.java`
#### Snippet
```java
        final Properties copyProperties = new Properties();
        // guard against modification/removal of keys in the given properties (MNG-5670, MNG-6053, MNG-6105)
        synchronized (properties) {
            copyProperties.putAll(properties);
        }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `systemProperties`
in `maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelBuildingRequest.java`
#### Snippet
```java
        if (systemProperties != null) {
            this.systemProperties = new Properties();
            synchronized (systemProperties) { // avoid concurrent modification if someone else sets/removes an unrelated
                // system property
                this.systemProperties.putAll(systemProperties);
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `systemProperties`
in `maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsBuildingRequest.java`
#### Snippet
```java
        if (systemProperties != null) {
            this.systemProperties = new Properties();
            synchronized (systemProperties) { // avoid concurrent modification if someone else sets/removes an unrelated
                // system property
                this.systemProperties.putAll(systemProperties);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `result` is redundant
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java`
#### Snippet
```java
        MetadataXpp3Reader mappingReader = new MetadataXpp3Reader();
        try (InputStream in = Files.newInputStream(mappingFile.toPath())) {
            Metadata result = mappingReader.read(in, false);
            return result;
        } catch (FileNotFoundException e) {
```

### UnnecessaryLocalVariable
Local variable `policy` is redundant
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java
     */
    private static RepositoryPolicy convertRepositoryPolicy(org.apache.maven.api.model.RepositoryPolicy modelPolicy) {
        RepositoryPolicy policy = RepositoryPolicy.newBuilder()
                .enabled(modelPolicy.isEnabled())
                .updatePolicy(modelPolicy.getUpdatePolicy())
```

### UnnecessaryLocalVariable
Local variable `repo` is redundant
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java
     */
    private static Repository convertToSettingsRepository(org.apache.maven.api.model.Repository modelRepo) {
        Repository repo = Repository.newBuilder()
                .id(modelRepo.getId())
                .layout(modelRepo.getLayout())
```

### UnnecessaryLocalVariable
Local variable `policy` is redundant
in `maven-core/src/main/java/org/apache/maven/settings/SettingsUtilsV4.java`
#### Snippet
```java
    private static org.apache.maven.api.model.RepositoryPolicy convertRepositoryPolicy(
            RepositoryPolicy settingsPolicy) {
        org.apache.maven.api.model.RepositoryPolicy policy = org.apache.maven.api.model.RepositoryPolicy.newBuilder()
                .enabled(Boolean.toString(settingsPolicy.isEnabled()))
                .updatePolicy(settingsPolicy.getUpdatePolicy())
```

### UnnecessaryLocalVariable
Local variable `projectsSkipped` is redundant
in `maven-embedder/src/main/java/org/apache/maven/cli/event/ExecutionEventLogger.java`
#### Snippet
```java

            final List<MavenProject> allProjects = event.getSession().getAllProjects();
            final int projectsSkipped = allProjects.size() - projects.size();

            currentVisitedProjectCount = projectsSkipped;
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/builder/multithreaded/ThreadOutputMuxer.java`
#### Snippet
```java
            while (!running == expect) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy 27 fields
in `maven-core/src/main/java/org/apache/maven/project/MavenProject.java`
#### Snippet
```java
    }

    public MavenProject(MavenProject project) {
        deepCopy(project);
    }
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-compat/src/main/java/org/apache/maven/project/ProjectUtils.java`
#### Snippet
```java

        if (session != null) {
            repositorySystem.injectMirror(session, Arrays.asList(repository));
            repositorySystem.injectProxy(session, Arrays.asList(repository));
            repositorySystem.injectAuthentication(session, Arrays.asList(repository));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-compat/src/main/java/org/apache/maven/project/ProjectUtils.java`
#### Snippet
```java
        if (session != null) {
            repositorySystem.injectMirror(session, Arrays.asList(repository));
            repositorySystem.injectProxy(session, Arrays.asList(repository));
            repositorySystem.injectAuthentication(session, Arrays.asList(repository));
        }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-compat/src/main/java/org/apache/maven/project/ProjectUtils.java`
#### Snippet
```java
            repositorySystem.injectMirror(session, Arrays.asList(repository));
            repositorySystem.injectProxy(session, Arrays.asList(repository));
            repositorySystem.injectAuthentication(session, Arrays.asList(repository));
        }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-compat/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java`
#### Snippet
```java
                    try {
                        ArtifactRepository repo = repositorySystem.buildArtifactRepository((Repository) repository);
                        repositorySystem.injectMirror(request.getRepositorySession(), Arrays.asList(repo));
                        repositorySystem.injectProxy(request.getRepositorySession(), Arrays.asList(repo));
                        repositorySystem.injectAuthentication(request.getRepositorySession(), Arrays.asList(repo));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-compat/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java`
#### Snippet
```java
                        ArtifactRepository repo = repositorySystem.buildArtifactRepository((Repository) repository);
                        repositorySystem.injectMirror(request.getRepositorySession(), Arrays.asList(repo));
                        repositorySystem.injectProxy(request.getRepositorySession(), Arrays.asList(repo));
                        repositorySystem.injectAuthentication(request.getRepositorySession(), Arrays.asList(repo));
                        repos.add(repo);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-compat/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java`
#### Snippet
```java
                        repositorySystem.injectMirror(request.getRepositorySession(), Arrays.asList(repo));
                        repositorySystem.injectProxy(request.getRepositorySession(), Arrays.asList(repo));
                        repositorySystem.injectAuthentication(request.getRepositorySession(), Arrays.asList(repo));
                        repos.add(repo);
                    } catch (InvalidRepositoryException e) {
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-compat/src/main/java/org/apache/maven/artifact/repository/DefaultArtifactRepositoryFactory.java`
#### Snippet
```java

        if (session != null && repository != null && !isLocalRepository(repository)) {
            List<ArtifactRepository> repositories = Arrays.asList(repository);

            if (mirrors) {
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-core/src/main/java/org/apache/maven/project/collector/PomlessCollectionStrategy.java`
#### Snippet
```java
        request.setProjectPresent(false);

        return Arrays.asList(project);
    }
}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java

            if (error != null) {
                ProjectBuildingException e = new ProjectBuildingException(Arrays.asList(result));
                e.initCause(error);
                throw e;
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
                if (!StringUtils.isEmpty(r.getId()) && !StringUtils.isEmpty(r.getUrl())) {
                    ArtifactRepository repo = MavenRepositorySystem.buildArtifactRepository(r);
                    repositorySystem.injectProxy(projectBuildingRequest.getRepositorySession(), Arrays.asList(repo));
                    repositorySystem.injectAuthentication(
                            projectBuildingRequest.getRepositorySession(), Arrays.asList(repo));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
                    repositorySystem.injectProxy(projectBuildingRequest.getRepositorySession(), Arrays.asList(repo));
                    repositorySystem.injectAuthentication(
                            projectBuildingRequest.getRepositorySession(), Arrays.asList(repo));
                    project.setReleaseArtifactRepository(repo);
                }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
                if (!StringUtils.isEmpty(r.getId()) && !StringUtils.isEmpty(r.getUrl())) {
                    ArtifactRepository repo = MavenRepositorySystem.buildArtifactRepository(r);
                    repositorySystem.injectProxy(projectBuildingRequest.getRepositorySession(), Arrays.asList(repo));
                    repositorySystem.injectAuthentication(
                            projectBuildingRequest.getRepositorySession(), Arrays.asList(repo));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java`
#### Snippet
```java
                    repositorySystem.injectProxy(projectBuildingRequest.getRepositorySession(), Arrays.asList(repo));
                    repositorySystem.injectAuthentication(
                            projectBuildingRequest.getRepositorySession(), Arrays.asList(repo));
                    project.setSnapshotArtifactRepository(repo);
                }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `maven-core/src/main/java/org/apache/maven/lifecycle/internal/DependencyContext.java`
#### Snippet
```java
public class DependencyContext {

    private static final Collection<?> UNRESOLVED = Arrays.asList();

    private final MavenProject project;
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-settings-builder/src/main/java/org/apache/maven/settings/crypto/DefaultSettingsDecryptionRequest.java`
#### Snippet
```java
     */
    public DefaultSettingsDecryptionRequest(Proxy proxy) {
        this.proxies = new ArrayList<>(Arrays.asList(proxy));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-settings-builder/src/main/java/org/apache/maven/settings/crypto/DefaultSettingsDecryptionRequest.java`
#### Snippet
```java
     */
    public DefaultSettingsDecryptionRequest(Server server) {
        this.servers = new ArrayList<>(Arrays.asList(server));
    }

```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `maven-core/src/main/java/org/apache/maven/project/ReactorModelPool.java`
#### Snippet
```java

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `api/maven-api-settings/src/main/java/org/apache/maven/api/settings/ImmutableCollections.java`
#### Snippet
```java
                // Do not use super.putAll, as it may delegate to put which throws an UnsupportedOperationException
                for (Map.Entry<Object, Object> e : props.entrySet()) {
                    super.put(e.getKey(), e.getValue());
                }
            }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `api/maven-api-toolchain/src/main/java/org/apache/maven/api/toolchain/ImmutableCollections.java`
#### Snippet
```java
                // Do not use super.putAll, as it may delegate to put which throws an UnsupportedOperationException
                for (Map.Entry<Object, Object> e : props.entrySet()) {
                    super.put(e.getKey(), e.getValue());
                }
            }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `api/maven-api-model/src/main/java/org/apache/maven/api/model/ImmutableCollections.java`
#### Snippet
```java
                // Do not use super.putAll, as it may delegate to put which throws an UnsupportedOperationException
                for (Map.Entry<Object, Object> e : props.entrySet()) {
                    super.put(e.getKey(), e.getValue());
                }
            }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `maven-plugin-api/src/main/java/org/apache/maven/plugin/lifecycle/ImmutableCollections.java`
#### Snippet
```java
                // Do not use super.putAll, as it may delegate to put which throws an UnsupportedOperationException
                for (Map.Entry<Object, Object> e : props.entrySet()) {
                    super.put(e.getKey(), e.getValue());
                }
            }
```

