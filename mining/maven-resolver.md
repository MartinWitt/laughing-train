# maven-resolver 
 
# Bad smells
I found 489 bad smells with 69 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=ReturnNull] | 81 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 58 | true |
| RuleId[ruleID=SystemOutErr] | 54 | false |
| RuleId[ruleID=BoundedWildcard] | 36 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 29 | false |
| RuleId[ruleID=CatchMayIgnoreException] | 25 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 25 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 18 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 15 | false |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 15 | false |
| RuleId[ruleID=IgnoreResultOfCall] | 14 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 13 | false |
| RuleId[ruleID=ConstantValue] | 12 | false |
| RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup] | 11 | false |
| RuleId[ruleID=RegExpRedundantEscape] | 10 | false |
| RuleId[ruleID=DataFlowIssue] | 9 | false |
| RuleId[ruleID=UnusedAssignment] | 9 | false |
| RuleId[ruleID=NestedAssignment] | 8 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 6 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 5 | true |
| RuleId[ruleID=UseOfPropertiesAsHashtable] | 4 | false |
| RuleId[ruleID=ConditionCoveredByFurtherCondition] | 3 | false |
| RuleId[ruleID=Finalize] | 2 | false |
| RuleId[ruleID=ProtectedMemberInFinalClass] | 2 | true |
| RuleId[ruleID=AbstractClassNeverImplemented] | 2 | false |
| RuleId[ruleID=RedundantSuppression] | 2 | false |
| RuleId[ruleID=NonStrictComparisonCanBeEquality] | 2 | true |
| RuleId[ruleID=EmptyMethod] | 2 | false |
| RuleId[ruleID=FieldMayBeStatic] | 1 | false |
| RuleId[ruleID=StringOperationCanBeSimplified] | 1 | false |
| RuleId[ruleID=Convert2MethodRef] | 1 | false |
| RuleId[ruleID=KeySetIterationMayUseEntrySet] | 1 | false |
| RuleId[ruleID=StringBufferReplaceableByString] | 1 | false |
| RuleId[ruleID=UnnecessaryToStringCall] | 1 | true |
| RuleId[ruleID=InnerClassMayBeStatic] | 1 | true |
| RuleId[ruleID=RegExpRepeatedSpace] | 1 | false |
| RuleId[ruleID=ExplicitArrayFilling] | 1 | false |
| RuleId[ruleID=StringEqualsEmptyString] | 1 | false |
| RuleId[ruleID=ClassNameSameAsAncestorName] | 1 | false |
| RuleId[ruleID=MissingDeprecatedAnnotation] | 1 | false |
| RuleId[ruleID=ThrowablePrintStackTrace] | 1 | false |
| RuleId[ruleID=HtmlWrongAttributeValue] | 1 | false |
| RuleId[ruleID=ArrayEquality] | 1 | false |
| RuleId[ruleID=AssignmentToLambdaParameter] | 1 | false |
| RuleId[ruleID=SynchronizeOnThis] | 1 | false |
## RuleId[ruleID=Finalize]
### RuleId[ruleID=Finalize]
'finalize()' should not be overridden
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/NamedLockFactorySupport.java`
#### Snippet
```java

    @Override
    protected void finalize() throws Throwable
    {
        try
```

### RuleId[ruleID=Finalize]
'finalize()' should not be overridden
in `maven-resolver-connector-basic/src/main/java/org/eclipse/aether/connector/basic/BasicRepositoryConnector.java`
#### Snippet
```java

    @Override
    protected void finalize()
            throws Throwable
    {
```

## RuleId[ruleID=FieldMayBeStatic]
### RuleId[ruleID=FieldMayBeStatic]
Field `classifier` may be 'static'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeBuilder.java`
#### Snippet
```java
    private String ext = "jar";

    private final String classifier = "";

    private String scope = "compile";
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `GetDirectDependencies` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDirectDependencies.java`
#### Snippet
```java
 * Determines the direct dependencies of an artifact as declared in its artifact descriptor (POM).
 */
public class GetDirectDependencies
{

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `InstallArtifacts` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/InstallArtifacts.java`
#### Snippet
```java
 * Installs a JAR and its POM to the local repository.
 */
public class InstallArtifacts
{

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `GetDependencyHierarchy` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDependencyHierarchy.java`
#### Snippet
```java
 * Visualizes the transitive dependencies of an artifact similar to m2e's dependency hierarchy view.
 */
public class GetDependencyHierarchy
{

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FindNewestVersion` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/FindNewestVersion.java`
#### Snippet
```java
 * Determines the newest version of an artifact.
 */
public class FindNewestVersion
{
    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FindAvailableVersions` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/FindAvailableVersions.java`
#### Snippet
```java
 * Determines all available versions of an artifact.
 */
public class FindAvailableVersions
{

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `AllResolverDemos` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/AllResolverDemos.java`
#### Snippet
```java
 * Runs all demos at once.
 */
public class AllResolverDemos
{
    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ResolveTransitiveDependencies` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ResolveTransitiveDependencies.java`
#### Snippet
```java
 * Resolves the transitive (compile) dependencies of an artifact.
 */
public class ResolveTransitiveDependencies
{

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `GetDependencyTree` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDependencyTree.java`
#### Snippet
```java
 * Collects the transitive dependencies of an artifact.
 */
public class GetDependencyTree
{

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ReverseDependencyTree` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ReverseDependencyTree.java`
#### Snippet
```java
 * Example of building reverse dependency tree using custom {@link ReverseTreeRepositoryListener}.
 */
public class ReverseDependencyTree
{

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ResolveArtifact` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ResolveArtifact.java`
#### Snippet
```java
 * Resolves a single artifact.
 */
public class ResolveArtifact
{

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DeployArtifacts` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/DeployArtifacts.java`
#### Snippet
```java
 * Deploys a JAR and its POM to a remote repository.
 */
public class DeployArtifacts
{

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Booter` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/Booter.java`
#### Snippet
```java
 * A helper to boot the repository system and a repository system session.
 */
public class Booter
{
    public static final String SERVICE_LOCATOR = "serviceLocator";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ManualRepositorySystemFactory` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/manual/ManualRepositorySystemFactory.java`
#### Snippet
```java
 * infrastructure to wire up the system's components.
 */
public class ManualRepositorySystemFactory
{
    private static final Logger LOGGER = LoggerFactory.getLogger( ManualRepositorySystemFactory.class );
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `TestNioLock` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/TestNioLock.java`
#### Snippet
```java
 * </ul>
 */
public class TestNioLock
{
    private static final int EC_WON = 10;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `GuiceRepositorySystemFactory` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/guice/GuiceRepositorySystemFactory.java`
#### Snippet
```java
 * A factory for repository system instances that employs JSR-330 via Guice to wire up the system's components.
 */
public class GuiceRepositorySystemFactory
{

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/Utils.java`
#### Snippet
```java
 * Internal utility methods.
 */
final class Utils
{

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DependencyManagerUtils` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DependencyManagerUtils.java`
#### Snippet
```java
 * A utility class assisting in analyzing the effects of dependency management.
 */
public final class DependencyManagerUtils
{

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `UriUtils` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/UriUtils.java`
#### Snippet
```java
 * Helps to deal with URIs.
 */
final class UriUtils
{

```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Method invocation `getMessage` may produce `NullPointerException`
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/ConsoleRepositoryListener.java`
#### Snippet
```java
        requireNonNull( event, "event cannot be null" );
        out.println( "Invalid artifact descriptor for " + event.getArtifact() + ": "
            + event.getException().getMessage() );
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getScope` may produce `NullPointerException`
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/ConsoleDependencyGraphDumper.java`
#### Snippet
```java

        premanaged = DependencyManagerUtils.getPremanagedScope( node );
        if ( premanaged != null && !premanaged.equals( d.getScope() ) )
        {
            buffer.append( " (scope managed from " ).append( premanaged ).append( ")" );
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `hasNext` may produce `NullPointerException`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
            while ( line.contains( "%s" ) )
            {
                if ( !substitutionIterator.hasNext() )
                {
                    throw new IllegalStateException( "not enough substitutions to fill placeholders" );
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getChildren` may produce `NullPointerException`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
                    throw new IllegalStateException( "undefined reference " + reference );
                }
                node.getChildren().add( child );
            }
            else
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictMarker.java`
#### Snippet
```java
                    else if ( g == null )
                    {
                        fixMappings = true;
                    }
                    else
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictMarker.java`
#### Snippet
```java
                        {
                            group = new ConflictGroup( newKeys, counter[0]++ );
                            fixMappings = true;
                        }
                    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `listIterator` may produce `NullPointerException`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictResolver.java`
#### Snippet
```java
            if ( item.parent != previousParent )
            {
                childIt = item.parent.listIterator();
                previousParent = item.parent;
                conflictVisualized = false;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `hasNext` may produce `NullPointerException`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictResolver.java`
#### Snippet
```java
                conflictVisualized = false;
            }
            while ( childIt.hasNext() )
            {
                DependencyNode child = childIt.next();
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `nearest` may produce `NullPointerException`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictIdSorter.java`
#### Snippet
```java
            }

            nearest.inDegree = 0;
            roots.add( nearest );

```

## RuleId[ruleID=StringOperationCanBeSimplified]
### RuleId[ruleID=StringOperationCanBeSimplified]
Unnecessary empty string argument
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/synccontext/named/HashingNameMapper.java`
#### Snippet
```java
            return hashedName;
        }
        StringBuilder prefix = new StringBuilder( "" );
        int i = 0;
        while ( i < hashedName.length() && i / 2 < depth )
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'getFileTransformerManager' is still used
in `maven-resolver-api/src/main/java/org/eclipse/aether/RepositorySystemSession.java`
#### Snippet
```java
     */
    @Deprecated
    FileTransformerManager getFileTransformerManager();
}

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'FileTransformerManager' is still used
in `maven-resolver-api/src/main/java/org/eclipse/aether/transform/FileTransformerManager.java`
#### Snippet
```java
 */
@Deprecated
public interface FileTransformerManager
{
    /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DefaultServiceLocator' is still used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/impl/DefaultServiceLocator.java`
#### Snippet
```java
 */
@Deprecated
public final class DefaultServiceLocator
    implements ServiceLocator
{
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'Slf4jLoggerFactory' is still used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/slf4j/Slf4jLoggerFactory.java`
#### Snippet
```java
@Named( "slf4j" )
@Deprecated
public class Slf4jLoggerFactory
    implements LoggerFactory, Service
{
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'Maven2RepositoryLayoutFactory' is still used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/Maven2RepositoryLayoutFactory.java`
#### Snippet
```java
     */
    @Deprecated
    public Maven2RepositoryLayoutFactory()
    {
        this( new DefaultChecksumAlgorithmFactorySelector() );
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DependencyCollectorDelegate' is still used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/DependencyCollectorDelegate.java`
#### Snippet
```java
     */
    @Deprecated
    protected DependencyCollectorDelegate()
    {
        // enables default constructor
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DefaultSyncContextFactory' is still used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/synccontext/legacy/DefaultSyncContextFactory.java`
#### Snippet
```java
@Named
@Deprecated
public final class DefaultSyncContextFactory
        implements org.eclipse.aether.impl.SyncContextFactory, Service
{
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'StringUtils' is still used
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/StringUtils.java`
#### Snippet
```java
 */
@Deprecated
public final class StringUtils
{

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'BfDependencyCollector' is still used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/bf/BfDependencyCollector.java`
#### Snippet
```java
     */
    @Deprecated
    public BfDependencyCollector()
    {
        // enables default constructor
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'HttpTransporterFactory' is still used
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/HttpTransporterFactory.java`
#### Snippet
```java
     */
    @Deprecated
    public HttpTransporterFactory()
    {
        this( getManuallyCreatedExtractors() );
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'calc' is still used
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/ChecksumUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static Map<String, Object> calc( byte[] dataBytes, Collection<String> algos )
                    throws IOException
    {
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'calc' is still used
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/ChecksumUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static Map<String, Object> calc( File dataFile, Collection<String> algos )
                    throws IOException
    {
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DfDependencyCollector' is still used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/df/DfDependencyCollector.java`
#### Snippet
```java
     */
    @Deprecated
    public DfDependencyCollector()
    {
        // enables default constructor
```

## RuleId[ruleID=Convert2MethodRef]
### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultMetadataResolver.java`
#### Snippet
```java
        if ( threads <= 1 )
        {
            return command -> command.run();
        }
        else
```

## RuleId[ruleID=RegExpRedundantEscape]
### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\(` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";

    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";

    static final String NODE = COORDSX + "(?:\\s+" + PROPS + ")?" + "(?:\\s+" + SCOPE + ")?" + "(?:\\s+" + OPTIONAL
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\)` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";

    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";

    static final String NODE = COORDSX + "(?:\\s+" + PROPS + ")?" + "(?:\\s+" + SCOPE + ")?" + "(?:\\s+" + OPTIONAL
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\(` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";

    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";

    static final String NODE = COORDSX + "(?:\\s+" + PROPS + ")?" + "(?:\\s+" + SCOPE + ")?" + "(?:\\s+" + OPTIONAL
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\)` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";

    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";

    static final String NODE = COORDSX + "(?:\\s+" + PROPS + ")?" + "(?:\\s+" + SCOPE + ")?" + "(?:\\s+" + OPTIONAL
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\(` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    private static final String RANGE_NC = "[\\(\\[][^\\(\\)\\[\\]]+[\\)\\]]";

    static final String RANGE = "(" + RANGE_NC + ")";

    static final String SCOPE = "(?:scope\\s*=\\s*)?((?!optional)[-_a-zA-Z0-9]+)(?:<([-_a-zA-Z0-9]+))?";
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\)` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    private static final String RANGE_NC = "[\\(\\[][^\\(\\)\\[\\]]+[\\)\\]]";

    static final String RANGE = "(" + RANGE_NC + ")";

    static final String SCOPE = "(?:scope\\s*=\\s*)?((?!optional)[-_a-zA-Z0-9]+)(?:<([-_a-zA-Z0-9]+))?";
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\(` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    private static final String COORDS_NC = NodeDefinition.COORDS.replaceAll( "\\((?=\\[)", "(?:" );

    private static final String RANGE_NC = "[\\(\\[][^\\(\\)\\[\\]]+[\\)\\]]";

    static final String RANGE = "(" + RANGE_NC + ")";
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\(` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    private static final String COORDS_NC = NodeDefinition.COORDS.replaceAll( "\\((?=\\[)", "(?:" );

    private static final String RANGE_NC = "[\\(\\[][^\\(\\)\\[\\]]+[\\)\\]]";

    static final String RANGE = "(" + RANGE_NC + ")";
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\)` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    private static final String COORDS_NC = NodeDefinition.COORDS.replaceAll( "\\((?=\\[)", "(?:" );

    private static final String RANGE_NC = "[\\(\\[][^\\(\\)\\[\\]]+[\\)\\]]";

    static final String RANGE = "(" + RANGE_NC + ")";
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\)` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    private static final String COORDS_NC = NodeDefinition.COORDS.replaceAll( "\\((?=\\[)", "(?:" );

    private static final String RANGE_NC = "[\\(\\[][^\\(\\)\\[\\]]+[\\)\\]]";

    static final String RANGE = "(" + RANGE_NC + ")";
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `versions` may be replaced with 'entrySet()' iteration
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/bf/BfDependencyCollector.java`
#### Snippet
```java

        Set<Version> versions = resolutionResult.descriptors.keySet();
        for ( Version version : versions )
        {
            Artifact originalArtifact = dependency.getArtifact().setVersion( version.toString() );
```

## RuleId[ruleID=CatchMayIgnoreException]
### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedTransferListener.java`
#### Snippet
```java
                listener.transferSucceeded( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedTransferListener.java`
#### Snippet
```java
                listener.transferCorrupted( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedTransferListener.java`
#### Snippet
```java
                listener.transferFailed( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedTransferListener.java`
#### Snippet
```java
                listener.transferProgressed( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedTransferListener.java`
#### Snippet
```java
                listener.transferInitiated( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedTransferListener.java`
#### Snippet
```java
                listener.transferStarted( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.artifactDeployed( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.metadataResolving( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.metadataResolved( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.artifactDescriptorInvalid( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.metadataDownloaded( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.artifactInstalling( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.metadataInstalling( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.metadataInvalid( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.metadataDeploying( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.metadataDownloading( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.metadataDeployed( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.artifactResolving( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.metadataInstalled( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.artifactInstalled( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.artifactDownloaded( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.artifactResolved( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.artifactDescriptorMissing( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.artifactDeploying( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

### RuleId[ruleID=CatchMayIgnoreException]
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
                listener.artifactDownloading( event );
            }
            catch ( RuntimeException e )
            {
                handleError( event, listener, e );
```

## RuleId[ruleID=ProtectedMemberInFinalClass]
### RuleId[ruleID=ProtectedMemberInFinalClass]
Class member declared `protected` in 'final' class
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedTransferListener.java`
#### Snippet
```java

    @SuppressWarnings( "EmptyMethod" )
    protected void handleError( TransferEvent event, TransferListener listener, RuntimeException error )
    {
        // default just swallows errors
```

### RuleId[ruleID=ProtectedMemberInFinalClass]
Class member declared `protected` in 'final' class
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java

    @SuppressWarnings( "EmptyMethod" )
    protected void handleError( RepositoryEvent event, RepositoryListener listener, RuntimeException error )
    {
        // default just swallows errors
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`getClassifier().length() > 0` can be replaced with '!getClassifier().isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/graph/Exclusion.java`
#### Snippet
```java
    {
        return getGroupId() + ':' + getArtifactId() + ':' + getExtension()
            + ( getClassifier().length() > 0 ? ':' + getClassifier() : "" );
    }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`id.length() == 0` can be replaced with 'id.isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/artifact/DefaultArtifactType.java`
#### Snippet
```java
    {
        this.id = requireNonNull( id, "type id cannot be null" );
        if ( id.length() == 0 )
        {
            throw new IllegalArgumentException( "type id cannot be empty" );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`language.length() > 0` can be replaced with '!language.isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/artifact/DefaultArtifactType.java`
#### Snippet
```java
        Map<String, String> props = new HashMap<>();
        props.put( ArtifactProperties.TYPE, id );
        props.put( ArtifactProperties.LANGUAGE, ( language != null && language.length() > 0 ) ? language : "none" );
        props.put( ArtifactProperties.INCLUDES_DEPENDENCIES, Boolean.toString( includesDependencies ) );
        props.put( ArtifactProperties.CONSTITUTES_BUILD_PATH, Boolean.toString( constitutesBuildPath ) );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`id.length() == 0` can be replaced with 'id.isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/artifact/DefaultArtifactType.java`
#### Snippet
```java
    {
        this.id = requireNonNull( id, "type id cannot be null" );
        if ( id.length() == 0 )
        {
            throw new IllegalArgumentException( "type id cannot be empty" );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`artifact.getClassifier().length() > 0` can be replaced with '!artifact.getClassifier().isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/collection/UnsolvableVersionConflictException.java`
#### Snippet
```java
            buffer.append( ':' ).append( artifact.getArtifactId() );
            buffer.append( ':' ).append( artifact.getExtension() );
            if ( artifact.getClassifier().length() > 0 )
            {
                buffer.append( ':' ).append( artifact.getClassifier() );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`getGroupId().length() > 0` can be replaced with '!getGroupId().isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/metadata/AbstractMetadata.java`
#### Snippet
```java
    {
        StringBuilder buffer = new StringBuilder( 128 );
        if ( getGroupId().length() > 0 )
        {
            buffer.append( getGroupId() );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`getArtifactId().length() > 0` can be replaced with '!getArtifactId().isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/metadata/AbstractMetadata.java`
#### Snippet
```java
            buffer.append( getGroupId() );
        }
        if ( getArtifactId().length() > 0 )
        {
            buffer.append( ':' ).append( getArtifactId() );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`getVersion().length() > 0` can be replaced with '!getVersion().isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/metadata/AbstractMetadata.java`
#### Snippet
```java
            buffer.append( ':' ).append( getArtifactId() );
        }
        if ( getVersion().length() > 0 )
        {
            buffer.append( ':' ).append( getVersion() );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`getClassifier().length() > 0` can be replaced with '!getClassifier().isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/artifact/AbstractArtifact.java`
#### Snippet
```java
        buffer.append( ':' ).append( getArtifactId() );
        buffer.append( ':' ).append( getExtension() );
        if ( getClassifier().length() > 0 )
        {
            buffer.append( ':' ).append( getClassifier() );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`key.length() == 0` can be replaced with 'key.isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/AuthenticationContext.java`
#### Snippet
```java
    {
        requireNonNull( key, "authentication key cannot be null" );
        if ( key.length() == 0 )
        {
            throw new IllegalArgumentException( "authentication key cannot be empty" );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`key.length() == 0` can be replaced with 'key.isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/AuthenticationContext.java`
#### Snippet
```java
    {
        requireNonNull( key, "authentication key cannot be null" );
        if ( key.length() == 0 )
        {
            throw new IllegalArgumentException( "authentication key cannot be empty" );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`d.getScope().length() > 0` can be replaced with '!d.getScope().isEmpty()'
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/ConsoleDependencyGraphDumper.java`
#### Snippet
```java
        Dependency d = node.getDependency();
        buffer.append( a );
        if ( d != null && d.getScope().length() > 0 )
        {
            buffer.append( " [" ).append( d.getScope() );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`process.length() > 0` can be replaced with '!process.isEmpty()'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestVersionScheme.java`
#### Snippet
```java
            process = process.substring( index + 1 ).trim();

            if ( process.length() > 0 && process.startsWith( "," ) )
            {
                process = process.substring( 1 ).trim();
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`process.length() > 0` can be replaced with '!process.isEmpty()'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestVersionScheme.java`
#### Snippet
```java
        }

        if ( process.length() > 0 && !ranges.isEmpty() )
        {
            throw new InvalidVersionSpecificationException( constraint, "Invalid version range " + constraint
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`parsedLowerBound.length() > 0` can be replaced with '!parsedLowerBound.isEmpty()'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestVersionRange.java`
#### Snippet
```java
            }

            lowerBound = parsedLowerBound.length() > 0 ? new TestVersion( parsedLowerBound ) : null;
            upperBound = parsedUpperBound.length() > 0 ? new TestVersion( parsedUpperBound ) : null;

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`parsedUpperBound.length() > 0` can be replaced with '!parsedUpperBound.isEmpty()'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestVersionRange.java`
#### Snippet
```java

            lowerBound = parsedLowerBound.length() > 0 ? new TestVersion( parsedLowerBound ) : null;
            upperBound = parsedUpperBound.length() > 0 ? new TestVersion( parsedUpperBound ) : null;

            if ( upperBound != null && lowerBound != null )
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`artifactId.length() > 0` can be replaced with '!artifactId.isEmpty()'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeBuilder.java`
#### Snippet
```java
    {
        Dependency dependency = null;
        if ( artifactId != null && artifactId.length() > 0 )
        {
            Artifact artifact =
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`artifactId.length() > 0` can be replaced with '!artifactId.isEmpty()'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeBuilder.java`
#### Snippet
```java
        }
        DefaultDependencyNode node = new DefaultDependencyNode( dependency );
        if ( artifactId != null && artifactId.length() > 0 )
        {
            try
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`base.length() > 0` can be replaced with '!base.isEmpty()'
in `maven-resolver-transport-classpath/src/main/java/org/eclipse/aether/transport/classpath/ClasspathTransporter.java`
#### Snippet
```java
                base = ssp;
            }
            if ( base.length() > 0 && !base.endsWith( "/" ) )
            {
                base += '/';
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`line.length() == 0` can be replaced with 'line.isEmpty()'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java
    private static boolean isEmpty( String line )
    {
        return line == null || line.length() == 0;
    }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`protocol.length() > 0` can be replaced with '!protocol.isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultOfflineController.java`
#### Snippet
```java
        {
            String protocol = repository.getProtocol();
            if ( protocol.length() > 0 )
            {
                for ( String p : protocols )
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`host.length() > 0` can be replaced with '!host.isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultOfflineController.java`
#### Snippet
```java
        {
            String host = repository.getHost();
            if ( host.length() > 0 )
            {
                for ( String h : hosts )
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`line.length() == 0` can be replaced with 'line.isEmpty()'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
    private static boolean isEmpty( String line )
    {
        return line == null || line.length() == 0;
    }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`metadata.getGroupId().length() > 0` can be replaced with '!metadata.getGroupId().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultLocalPathComposer.java`
#### Snippet
```java
        StringBuilder path = new StringBuilder( 128 );

        if ( metadata.getGroupId().length() > 0 )
        {
            path.append( metadata.getGroupId().replace( '.', '/' ) ).append( '/' );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`metadata.getArtifactId().length() > 0` can be replaced with '!metadata.getArtifactId().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultLocalPathComposer.java`
#### Snippet
```java
            path.append( metadata.getGroupId().replace( '.', '/' ) ).append( '/' );

            if ( metadata.getArtifactId().length() > 0 )
            {
                path.append( metadata.getArtifactId() ).append( '/' );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`metadata.getVersion().length() > 0` can be replaced with '!metadata.getVersion().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultLocalPathComposer.java`
#### Snippet
```java
                path.append( metadata.getArtifactId() ).append( '/' );

                if ( metadata.getVersion().length() > 0 )
                {
                    path.append( metadata.getVersion() ).append( '/' );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`artifact.getClassifier().length() > 0` can be replaced with '!artifact.getClassifier().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultLocalPathComposer.java`
#### Snippet
```java
        }

        if ( artifact.getClassifier().length() > 0 )
        {
            path.append( '-' ).append( artifact.getClassifier() );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`artifact.getExtension().length() > 0` can be replaced with '!artifact.getExtension().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultLocalPathComposer.java`
#### Snippet
```java
        }

        if ( artifact.getExtension().length() > 0 )
        {
            path.append( '.' ).append( artifact.getExtension() );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`url.length() > 0` can be replaced with '!url.isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultUpdateCheckManager.java`
#### Snippet
```java
    {
        String result = url;
        if ( url != null && url.length() > 0 && !url.endsWith( "/" ) )
        {
            result = url + '/';
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`value.length() > 0` can be replaced with '!value.isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultUpdateCheckManager.java`
#### Snippet
```java
        try
        {
            return ( value.length() > 0 ) ? Long.parseLong( value ) : 1;
        }
        catch ( NumberFormatException e )
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`artifact.getClassifier().length() > 0` can be replaced with '!artifact.getClassifier().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/Maven2RepositoryLayoutFactory.java`
#### Snippet
```java
            path.append( artifact.getArtifactId() ).append( '-' ).append( artifact.getVersion() );

            if ( artifact.getClassifier().length() > 0 )
            {
                path.append( '-' ).append( artifact.getClassifier() );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`artifact.getExtension().length() > 0` can be replaced with '!artifact.getExtension().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/Maven2RepositoryLayoutFactory.java`
#### Snippet
```java
            }

            if ( artifact.getExtension().length() > 0 )
            {
                path.append( '.' ).append( artifact.getExtension() );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`metadata.getGroupId().length() > 0` can be replaced with '!metadata.getGroupId().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/Maven2RepositoryLayoutFactory.java`
#### Snippet
```java
            StringBuilder path = new StringBuilder( 128 );

            if ( metadata.getGroupId().length() > 0 )
            {
                path.append( metadata.getGroupId().replace( '.', '/' ) ).append( '/' );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`metadata.getArtifactId().length() > 0` can be replaced with '!metadata.getArtifactId().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/Maven2RepositoryLayoutFactory.java`
#### Snippet
```java
                path.append( metadata.getGroupId().replace( '.', '/' ) ).append( '/' );

                if ( metadata.getArtifactId().length() > 0 )
                {
                    path.append( metadata.getArtifactId() ).append( '/' );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`metadata.getVersion().length() > 0` can be replaced with '!metadata.getVersion().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/Maven2RepositoryLayoutFactory.java`
#### Snippet
```java
                    path.append( metadata.getArtifactId() ).append( '/' );

                    if ( metadata.getVersion().length() > 0 )
                    {
                        path.append( metadata.getVersion() ).append( '/' );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`protocol.length() > 0` can be replaced with '!protocol.isEmpty()'
in `maven-resolver-transport-file/src/main/java/org/eclipse/aether/transport/file/PathUtils.java`
#### Snippet
```java
        String retValue = null;

        if ( protocol.length() > 0 )
        {
            retValue = url.substring( protocol.length() + 1 );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`value.length() > 0` can be replaced with '!value.isEmpty()'
in `maven-resolver-spi/src/main/java/org/eclipse/aether/spi/connector/transport/GetTask.java`
#### Snippet
```java
                checksums = new HashMap<>();
            }
            if ( value != null && value.length() > 0 )
            {
                checksums.put( algorithm, value );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`version.length() > 0` can be replaced with '!version.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/TransitiveDependencyManager.java`
#### Snippet
```java

            String version = artifact.getVersion();
            if ( version.length() > 0 && !versions.containsKey( key ) )
            {
                if ( versions == managedVersions )
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`scope.length() > 0` can be replaced with '!scope.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/TransitiveDependencyManager.java`
#### Snippet
```java

            String scope = managedDependency.getScope();
            if ( scope.length() > 0 && !scopes.containsKey( key ) )
            {
                if ( scopes == this.managedScopes )
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`version.length() > 0` can be replaced with '!version.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DefaultDependencyManager.java`
#### Snippet
```java

            String version = artifact.getVersion();
            if ( version.length() > 0 && !versions.containsKey( key ) )
            {
                if ( versions == this.managedVersions )
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`scope.length() > 0` can be replaced with '!scope.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DefaultDependencyManager.java`
#### Snippet
```java

            String scope = managedDependency.getScope();
            if ( scope.length() > 0 && !scopes.containsKey( key ) )
            {
                if ( scopes == this.managedScopes )
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`process.length() > 0` can be replaced with '!process.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/version/GenericVersionScheme.java`
#### Snippet
```java
            process = process.substring( index + 1 ).trim();

            if ( process.length() > 0 && process.startsWith( "," ) )
            {
                process = process.substring( 1 ).trim();
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`process.length() > 0` can be replaced with '!process.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/version/GenericVersionScheme.java`
#### Snippet
```java
        }

        if ( process.length() > 0 && !ranges.isEmpty() )
        {
            throw new InvalidVersionSpecificationException( constraint, "Invalid version range " + constraint
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`token.length() > 0` can be replaced with '!token.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/filter/DependencyFilterUtils.java`
#### Snippet
```java
                {
                    token = token.trim();
                    if ( token.length() > 0 )
                    {
                        types.add( token );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`parsedLowerBound.length() > 0` can be replaced with '!parsedLowerBound.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/version/GenericVersionRange.java`
#### Snippet
```java
            }

            lowerBound = parsedLowerBound.length() > 0 ? parse( parsedLowerBound ) : null;
            upperBound = parsedUpperBound.length() > 0 ? parse( parsedUpperBound ) : null;

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`parsedUpperBound.length() > 0` can be replaced with '!parsedUpperBound.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/version/GenericVersionRange.java`
#### Snippet
```java

            lowerBound = parsedLowerBound.length() > 0 ? parse( parsedLowerBound ) : null;
            upperBound = parsedUpperBound.length() > 0 ? parse( parsedUpperBound ) : null;

            if ( upperBound != null && lowerBound != null )
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`pattern.length() == 0` can be replaced with 'pattern.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/filter/AbstractPatternDependencyFilter.java`
#### Snippet
```java

        // support full wildcard and implied wildcard
        if ( "*".equals( pattern ) || pattern.length() == 0 )
        {
            matches = true;
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`classifier.length() > 0` can be replaced with '!classifier.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/artifact/ArtifactIdUtils.java`
#### Snippet
```java
            buffer.append( extension );
        }
        if ( classifier != null && classifier.length() > 0 )
        {
            buffer.append( SEP ).append( classifier );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`version.length() > 0` can be replaced with '!version.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/version/GenericVersion.java`
#### Snippet
```java
        Tokenizer( String version )
        {
            this.version = ( version.length() > 0 ) ? version : "0";
        }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`key.length() == 0` can be replaced with 'key.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/ComponentAuthentication.java`
#### Snippet
```java
    {
        this.key = requireNonNull( key, "authentication key cannot be null" );
        if ( key.length() == 0 )
        {
            throw new IllegalArgumentException( "authentication key cannot be empty" );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`key.length() == 0` can be replaced with 'key.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/StringAuthentication.java`
#### Snippet
```java
    {
        this.key = requireNonNull( key, "authentication key cannot be null" );
        if ( key.length() == 0 )
        {
            throw new IllegalArgumentException( "authentication key cannot be empty" );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`namePrefix.length() > 0` can be replaced with '!namePrefix.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/concurrency/WorkerThreadFactory.java`
#### Snippet
```java
        this.factory = Executors.defaultThreadFactory();
        this.namePrefix =
            ( ( namePrefix != null && namePrefix.length() > 0 ) ? namePrefix : getCallerSimpleClassName() + '-' )
                + POOL_INDEX.getAndIncrement() + '-';
        threadIndex = new AtomicInteger();
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`key.length() == 0` can be replaced with 'key.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/SecretAuthentication.java`
#### Snippet
```java
    {
        this.key = requireNonNull( key, "authentication key cannot be null" );
        if ( key.length() == 0 )
        {
            throw new IllegalArgumentException( "authentication key cannot be empty" );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`mirror.type.length() > 0` can be replaced with '!mirror.type.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/DefaultMirrorSelector.java`
#### Snippet
```java
        builder.setBlocked( mirror.blocked );

        if ( mirror.type != null && mirror.type.length() > 0 )
        {
            builder.setContentType( mirror.type );
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`path.length() > 0` can be replaced with '!path.isEmpty()'
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/UriUtils.java`
#### Snippet
```java
    {
        String path = ref.getRawPath();
        if ( path != null && path.length() > 0 )
        {
            path = base.getRawPath();
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`line.length() > 0` can be replaced with '!line.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/ChecksumUtils.java`
#### Snippet
```java
                }
                line = line.trim();
                if ( line.length() > 0 )
                {
                    checksum = line;
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`version.length() > 0` can be replaced with '!version.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/ClassicDependencyManager.java`
#### Snippet
```java

            String version = artifact.getVersion();
            if ( version.length() > 0 && !managedVersions.containsKey( key ) )
            {
                if ( managedVersions == this.managedVersions )
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`scope.length() > 0` can be replaced with '!scope.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/ClassicDependencyManager.java`
#### Snippet
```java

            String scope = managedDependency.getScope();
            if ( scope.length() > 0 && !managedScopes.containsKey( key ) )
            {
                if ( managedScopes == this.managedScopes )
```

## RuleId[ruleID=StringBufferReplaceableByString]
### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder buffer` can be replaced with 'String'
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/RepositoryPolicy.java`
#### Snippet
```java
    public String toString()
    {
        StringBuilder buffer = new StringBuilder( 256 );
        buffer.append( "enabled=" ).append( isEnabled() );
        buffer.append( ", checksums=" ).append( getChecksumPolicy() );
```

## RuleId[ruleID=UnnecessaryToStringCall]
### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/resolver/Resolver.java`
#### Snippet
```java
        ByteArrayOutputStream os = new ByteArrayOutputStream( 1024 );
        node.accept( new ConsoleDependencyGraphDumper( new PrintStream( os ) ) );
        sb.append( os.toString() );
    }

```

## RuleId[ruleID=InnerClassMayBeStatic]
### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `NodeEntry` may be 'static'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
    }

    class NodeEntry
    {
        int level;
```

## RuleId[ruleID=RegExpRepeatedSpace]
### RuleId[ruleID=RegExpRepeatedSpace]
2 consecutive spaces in RegExp
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/SummaryFileTrustedChecksumsSource.java`
#### Snippet
```java
                    if ( !line.startsWith( "#" ) && !line.isEmpty() )
                    {
                        String[] parts = line.split( "  ", 2 );
                        if ( parts.length == 2 )
                        {
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `maven-resolver-api/src/main/java/org/eclipse/aether/DefaultRepositorySystemSession.java`
#### Snippet
```java

    @SuppressWarnings( "checkstyle:magicnumber" )
    private <T> Map<String, T> copySafe( Map<?, ?> table, Class<T> valueType )
    {
        Map<String, T> map;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/Retry.java`
#### Snippet
```java
    public static  <R> R retry( final int attempts,
                                final long sleepMillis,
                                final Callable<R> operation,
                                final Predicate<Exception> retryPredicate,
                                final R defaultResult ) throws InterruptedException
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Exception`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/Retry.java`
#### Snippet
```java
                                final long sleepMillis,
                                final Callable<R> operation,
                                final Predicate<Exception> retryPredicate,
                                final R defaultResult ) throws InterruptedException
    {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/Retry.java`
#### Snippet
```java
                                final TimeUnit unit,
                                final long sleepMillis,
                                final Callable<R> operation,
                                final Predicate<Exception> retryPredicate,
                                final R defaultResult ) throws InterruptedException
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Exception`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/Retry.java`
#### Snippet
```java
                                final long sleepMillis,
                                final Callable<R> operation,
                                final Predicate<Exception> retryPredicate,
                                final R defaultResult ) throws InterruptedException
    {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super File`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileUtils.java`
#### Snippet
```java
    }

    private static void delete( File file, Collection<File> undeletables )
    {
        String[] children = file.list();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/impl/DefaultServiceLocator.java`
#### Snippet
```java
     * @return This locator for chaining, never {@code null}.
     */
    public <T> DefaultServiceLocator setServices( Class<T> type, T... services )
    {
        getEntry( type, true ).setServices( services );
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProvidedChecksumsSource`
in `maven-resolver-connector-basic/src/main/java/org/eclipse/aether/connector/basic/BasicRepositoryConnector.java`
#### Snippet
```java
                              ChecksumPolicyProvider checksumPolicyProvider,
                              FileProcessor fileProcessor,
                              Map<String, ProvidedChecksumsSource> providedChecksumsSources )
            throws NoRepositoryConnectorException
    {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super NodeEntry`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
    }

    private void addNode( DependencyNode root, int level, List<NodeEntry> entries )
    {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super MetadataUpload`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultDeployer.java`
#### Snippet
```java
    }

    private void upload( Collection<MetadataUpload> metadataUploads, RepositorySystemSession session,
                         Metadata metadata, RemoteRepository repository, RepositoryConnector connector,
                         EventCatapult catapult )
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DependencyNode`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/DefaultDependencyCycle.java`
#### Snippet
```java
     * there is no such node.
     */
    public static int find( List<DependencyNode> nodes, Artifact artifact )
    {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Artifact`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultUpdateCheckManager.java`
#### Snippet
```java
    }

    public void checkArtifact( RepositorySystemSession session, UpdateCheck<Artifact, ArtifactTransferException> check )
    {
        requireNonNull( session, "session cannot be null" );
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ArtifactTransferException`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultUpdateCheckManager.java`
#### Snippet
```java
    }

    public void checkArtifact( RepositorySystemSession session, UpdateCheck<Artifact, ArtifactTransferException> check )
    {
        requireNonNull( session, "session cannot be null" );
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Metadata`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultUpdateCheckManager.java`
#### Snippet
```java
    }

    public void checkMetadata( RepositorySystemSession session, UpdateCheck<Metadata, MetadataTransferException> check )
    {
        requireNonNull( session, "session cannot be null" );
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super MetadataTransferException`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultUpdateCheckManager.java`
#### Snippet
```java
    }

    public void checkMetadata( RepositorySystemSession session, UpdateCheck<Metadata, MetadataTransferException> check )
    {
        requireNonNull( session, "session cannot be null" );
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ChecksumAlgorithmFactory`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/SparseDirectoryTrustedChecksumsSource.java`
#### Snippet
```java
    protected Map<String, String> doGetTrustedArtifactChecksums(
            RepositorySystemSession session, Artifact artifact, ArtifactRepository artifactRepository,
            List<ChecksumAlgorithmFactory> checksumAlgorithmFactories )
    {
        final boolean originAware = isOriginAware( session );
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ChecksumAlgorithmFactory`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/SparseDirectoryTrustedChecksumsSource.java`
#### Snippet
```java
        public void addTrustedArtifactChecksums( Artifact artifact,
                                                 ArtifactRepository artifactRepository,
                                                 List<ChecksumAlgorithmFactory> checksumAlgorithmFactories,
                                                 Map<String, String> trustedArtifactChecksums ) throws IOException
        {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DependencyNode`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/bf/DependencyResolutionSkipper.java`
#### Snippet
```java
            }

            boolean isLeftmost( DependencyNode node, List<DependencyNode> parents )
            {
                Coordinate leftmost = leftmostCoordinates.get( node.getArtifact() );
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ChecksumAlgorithmFactory`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/SummaryFileTrustedChecksumsSource.java`
#### Snippet
```java
    protected Map<String, String> doGetTrustedArtifactChecksums(
            RepositorySystemSession session, Artifact artifact, ArtifactRepository artifactRepository,
            List<ChecksumAlgorithmFactory> checksumAlgorithmFactories )
    {
        final HashMap<String, String> result = new HashMap<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ChecksumAlgorithmFactory`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/SummaryFileTrustedChecksumsSource.java`
#### Snippet
```java
        public void addTrustedArtifactChecksums( Artifact artifact,
                                                 ArtifactRepository artifactRepository,
                                                 List<ChecksumAlgorithmFactory> checksumAlgorithmFactories,
                                                 Map<String, String> trustedArtifactChecksums )
        {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Path`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/SummaryFileTrustedChecksumsSource.java`
#### Snippet
```java
        private final boolean originAware;

        private SummaryFileWriter( ConcurrentHashMap<Path, ConcurrentHashMap<String, String>> cache,
                                   Path basedir,
                                   boolean originAware )
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Artifact`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/DependencyCollectorDelegate.java`
#### Snippet
```java

    @SuppressWarnings( "checkstyle:parameternumber" )
    protected static DefaultDependencyNode createDependencyNode( List<Artifact> relocations,
                                                                 PremanagedDependency preManaged,
                                                                 VersionRangeResult rangeResult, Version version,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Artifact`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/DependencyCollectorDelegate.java`
#### Snippet
```java
                                                                 PremanagedDependency preManaged,
                                                                 VersionRangeResult rangeResult, Version version,
                                                                 Dependency d, Collection<Artifact> aliases,
                                                                 List<RemoteRepository> repos, String requestContext )
    {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DependencyNode`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/DependencyCollectorDelegate.java`
#### Snippet
```java
        }

        public void addException( Dependency dependency, Exception e, List<DependencyNode> nodes )
        {
            if ( maxExceptions < 0 || result.getExceptions().size() < maxExceptions )
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ChecksumAlgorithmFactory`
in `maven-resolver-spi/src/main/java/org/eclipse/aether/spi/connector/checksum/ChecksumAlgorithmHelper.java`
#### Snippet
```java
    }

    private static Map<String, String> calculate( InputStream inputStream, List<ChecksumAlgorithmFactory> factories )
            throws IOException
    {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DependencySelector`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/selector/AndDependencySelector.java`
#### Snippet
```java
    }

    private AndDependencySelector( Set<DependencySelector> selectors )
    {
        if ( selectors != null && !selectors.isEmpty() )
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DependencyTraverser`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/traverser/AndDependencyTraverser.java`
#### Snippet
```java
    }

    private AndDependencyTraverser( Set<DependencyTraverser> traversers )
    {
        if ( traversers != null && !traversers.isEmpty() )
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DependencyFilter`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/filter/AndDependencyFilter.java`
#### Snippet
```java
     * @param filters The filters to combine, may be {@code null} but must not contain {@code null} elements.
     */
    public AndDependencyFilter( Collection<DependencyFilter> filters )
    {
        if ( filters != null )
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super DependencyNode`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictMarker.java`
#### Snippet
```java
    }

    private void analyze( DependencyNode node, Map<DependencyNode, Object> nodes, Map<Object, ConflictGroup> groups,
                          int[] counter )
    {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DependencyNode`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictMarker.java`
#### Snippet
```java
    }

    private Map<DependencyNode, Object> mark( Collection<DependencyNode> nodes, Map<Object, ConflictGroup> groups )
    {
        Map<DependencyNode, Object> conflictIds = new IdentityHashMap<>( nodes.size() + 1 );
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ConflictGroup`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictMarker.java`
#### Snippet
```java
    }

    private Map<DependencyNode, Object> mark( Collection<DependencyNode> nodes, Map<Object, ConflictGroup> groups )
    {
        Map<DependencyNode, Object> conflictIds = new IdentityHashMap<>( nodes.size() + 1 );
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DependencyFilter`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/filter/OrDependencyFilter.java`
#### Snippet
```java
     * @param filters The filters to combine, may be {@code null}.
     */
    public OrDependencyFilter( Collection<DependencyFilter> filters )
    {
        if ( filters != null )
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ConflictId`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictIdSorter.java`
#### Snippet
```java
    }

    private void findCycles( ConflictId id, Map<ConflictId, Object> visited, Map<Object, Integer> stack,
                             Collection<Collection<Object>> cycles )
    {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Collection`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictIdSorter.java`
#### Snippet
```java

    private void findCycles( ConflictId id, Map<ConflictId, Object> visited, Map<Object, Integer> stack,
                             Collection<Collection<Object>> cycles )
    {
        Integer depth = stack.put( id.key, stack.size() );
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super DependencyNode`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictIdSorter.java`
#### Snippet
```java

    private void buildConflitIdDAG( Map<Object, ConflictId> ids, DependencyNode node, ConflictId id, int depth,
                                    Map<DependencyNode, Object> visited, Map<?, ?> conflictIds )
    {
        if ( visited.put( node, Boolean.TRUE ) != null )
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends WorkspaceReader`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/ChainedWorkspaceReader.java`
#### Snippet
```java
        private final List<Object> keys = new ArrayList<>();

        Key( List<WorkspaceReader> readers )
        {
            for ( WorkspaceReader reader : readers )
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `AbstractForwardingRepositorySystemSession` has no concrete subclass
in `maven-resolver-api/src/main/java/org/eclipse/aether/AbstractForwardingRepositorySystemSession.java`
#### Snippet
```java
 * create a subclass and implement {@link #getSession()}, and optionally override other methods.
 */
public abstract class AbstractForwardingRepositorySystemSession
        implements RepositorySystemSession
{
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `DelegatingArtifact` has no concrete subclass
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/artifact/DelegatingArtifact.java`
#### Snippet
```java
 * carry additional data fields.
 */
public abstract class DelegatingArtifact
    extends AbstractArtifact
{
```

## RuleId[ruleID=ExplicitArrayFilling]
### RuleId[ruleID=ExplicitArrayFilling]
Can be replaced with single 'Arrays.fill()' method call
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/SecretAuthentication.java`
#### Snippet
```java
        if ( chars != null )
        {
            for ( int i = 0; i < chars.length; i++ )
            {
                chars[i] = '\0';
```

## RuleId[ruleID=StringEqualsEmptyString]
### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
            defBuilder.append( artifact.getGroupId() ).append( ":" ).append( artifact.getArtifactId() ).append( ":" )
                    .append( artifact.getExtension() ).append( ":" ).append( artifact.getVersion() );
            if ( dependency.getScope() != null && ( !"".equals( dependency.getScope() ) ) )
            {
                defBuilder.append( ":" ).append( dependency.getScope() );
```

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultRemoteRepositoryManager.java`
#### Snippet
```java
        {
            String checksums = session.getChecksumPolicy();
            //noinspection StatementWithEmptyBody
            if ( globalPolicy && !StringUtils.isEmpty( checksums ) )
            {
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultRemoteRepositoryManager.java`
#### Snippet
```java

            String updates = session.getUpdatePolicy();
            //noinspection StatementWithEmptyBody
            if ( globalPolicy && !StringUtils.isEmpty( updates ) )
            {
```

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.delete()` is ignored
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileProcessor.java`
#### Snippet
```java
        throws IOException
    {
        target.delete();

        if ( !source.renameTo( target ) )
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.setLastModified()` is ignored
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileProcessor.java`
#### Snippet
```java
            copy( source, target );

            target.setLastModified( source.lastModified() );

            source.delete();
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.delete()` is ignored
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileProcessor.java`
#### Snippet
```java
            target.setLastModified( source.lastModified() );

            source.delete();
        }
    }
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileUtils.java`
#### Snippet
```java
        throws IOException
    {
        file.getParentFile().mkdirs();

        FileOutputStream fos = null;
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileUtils.java`
#### Snippet
```java
    {
        file.deleteOnExit();
        file.getParentFile().mkdirs();
        OutputStream out = null;
        try
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.setLastModified()` is ignored
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultFileProcessor.java`
#### Snippet
```java
            copy( source, target );

            target.setLastModified( source.lastModified() );

            source.delete();
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.delete()` is ignored
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultFileProcessor.java`
#### Snippet
```java
            target.setLastModified( source.lastModified() );

            source.delete();
        }
    }
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.delete()` is ignored
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultMetadataResolver.java`
#### Snippet
```java
                else if ( request.isDeleteLocalCopyIfMissing() && exception instanceof MetadataNotFoundException )
                {
                    download.getFile().delete();
                }
            }
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.delete()` is ignored
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultDeployer.java`
#### Snippet
```java
                if ( error instanceof MetadataNotFoundException )
                {
                    dstFile.delete();
                }

```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.setLastModified()` is ignored
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultInstaller.java`
#### Snippet
```java
                {
                    fileProcessor.write( dstFile, is );
                    dstFile.setLastModified( srcFile.lastModified() );
                }
            }
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.setLastModified()` is ignored
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultInstaller.java`
#### Snippet
```java
            {
                fileProcessor.copy( srcFile, dstFile );
                dstFile.setLastModified( srcFile.lastModified() );
            }

```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.delete()` is ignored
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultUpdateCheckManager.java`
#### Snippet
```java
        if ( artifactFile.exists() && !hasErrors( props ) )
        {
            touchFile.delete();
        }
    }
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.setLastModified()` is ignored
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultArtifactResolver.java`
#### Snippet
```java
                {
                    fileProcessor.copy( file, dst );
                    dst.setLastModified( file.lastModified() );
                }
                catch ( IOException e )
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `maven-resolver-transport-file/src/main/java/org/eclipse/aether/transport/file/FileTransporter.java`
#### Snippet
```java
    {
        File file = getFile( task, false );
        file.getParentFile().mkdirs();
        try
        {
```

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
### RuleId[ruleID=NonStrictComparisonCanBeEquality]
Can be replaced with equality
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/version/ChainedVersionFilter.java`
#### Snippet
```java
        if ( filters.length <= 1 )
        {
            if ( filters.length <= 0 )
            {
                return null;
```

### RuleId[ruleID=NonStrictComparisonCanBeEquality]
Can be replaced with equality
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictResolver.java`
#### Snippet
```java
        {
            int size = parentNodes.size();
            return ( size <= 0 ) ? null : parentNodes.get( size - 1 );
        }

```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDirectDependencies.java`
#### Snippet
```java
        throws Exception
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( GetDirectDependencies.class.getSimpleName() );

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDirectDependencies.java`
#### Snippet
```java
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( GetDirectDependencies.class.getSimpleName() );

        RepositorySystem system = Booter.newRepositorySystem( Booter.selectFactory( args ) );
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDirectDependencies.java`
#### Snippet
```java
        for ( Dependency dependency : descriptorResult.getDependencies() )
        {
            System.out.println( dependency );
        }
    }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/InstallArtifacts.java`
#### Snippet
```java
        throws Exception
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( InstallArtifacts.class.getSimpleName() );

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/InstallArtifacts.java`
#### Snippet
```java
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( InstallArtifacts.class.getSimpleName() );

        RepositorySystem system = Booter.newRepositorySystem( Booter.selectFactory( args ) );
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDependencyHierarchy.java`
#### Snippet
```java
        throws Exception
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( GetDependencyHierarchy.class.getSimpleName() );

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDependencyHierarchy.java`
#### Snippet
```java
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( GetDependencyHierarchy.class.getSimpleName() );

        RepositorySystem system = Booter.newRepositorySystem( Booter.selectFactory( args ) );
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/FindNewestVersion.java`
#### Snippet
```java
        throws Exception
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( FindNewestVersion.class.getSimpleName() );

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/FindNewestVersion.java`
#### Snippet
```java
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( FindNewestVersion.class.getSimpleName() );

        RepositorySystem system = Booter.newRepositorySystem( Booter.selectFactory( args ) );
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/FindNewestVersion.java`
#### Snippet
```java
        Version newestVersion = rangeResult.getHighestVersion();

        System.out.println( "Newest version " + newestVersion + " from repository "
            + rangeResult.getRepository( newestVersion ) );
    }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/FindAvailableVersions.java`
#### Snippet
```java
        throws Exception
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( FindAvailableVersions.class.getSimpleName() );

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/FindAvailableVersions.java`
#### Snippet
```java
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( FindAvailableVersions.class.getSimpleName() );

        RepositorySystem system = Booter.newRepositorySystem( Booter.selectFactory( args ) );
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/FindAvailableVersions.java`
#### Snippet
```java
        List<Version> versions = rangeResult.getVersions();

        System.out.println( "Available versions " + versions );
    }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ResolveTransitiveDependencies.java`
#### Snippet
```java
        throws Exception
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( ResolveTransitiveDependencies.class.getSimpleName() );

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ResolveTransitiveDependencies.java`
#### Snippet
```java
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( ResolveTransitiveDependencies.class.getSimpleName() );

        RepositorySystem system = Booter.newRepositorySystem( Booter.selectFactory( args ) );
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ResolveTransitiveDependencies.java`
#### Snippet
```java
        for ( ArtifactResult artifactResult : artifactResults )
        {
            System.out.println( artifactResult.getArtifact() + " resolved to "
                + artifactResult.getArtifact().getFile() );
        }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDependencyTree.java`
#### Snippet
```java
        throws Exception
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( GetDependencyTree.class.getSimpleName() );

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDependencyTree.java`
#### Snippet
```java
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( GetDependencyTree.class.getSimpleName() );

        RepositorySystem system = Booter.newRepositorySystem( Booter.selectFactory( args ) );
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ReverseDependencyTree.java`
#### Snippet
```java
        throws Exception
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( ReverseDependencyTree.class.getSimpleName() );

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ReverseDependencyTree.java`
#### Snippet
```java
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( ReverseDependencyTree.class.getSimpleName() );

        RepositorySystem system = Booter.newRepositorySystem( Booter.selectFactory( args ) );
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ResolveArtifact.java`
#### Snippet
```java
        throws Exception
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( ResolveArtifact.class.getSimpleName() );

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ResolveArtifact.java`
#### Snippet
```java
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( ResolveArtifact.class.getSimpleName() );

        RepositorySystem system = Booter.newRepositorySystem( Booter.selectFactory( args ) );
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ResolveArtifact.java`
#### Snippet
```java
        artifact = artifactResult.getArtifact();

        System.out.println( artifact + " resolved to  " + artifact.getFile() );

        // signature
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ResolveArtifact.java`
#### Snippet
```java
        artifact = artifactResult.getArtifact();

        System.out.println( artifact + " resolved signature to  " + artifact.getFile() );
    }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/DeployArtifacts.java`
#### Snippet
```java
        throws Exception
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( DeployArtifacts.class.getSimpleName() );

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/DeployArtifacts.java`
#### Snippet
```java
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( DeployArtifacts.class.getSimpleName() );

        RepositorySystem system = Booter.newRepositorySystem( Booter.selectFactory( args ) );
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/ReverseTreeRepositoryListener.java`
#### Snippet
```java
                        .getArtifact().toString().replace( ":", "_" ) );
                Files.write( trackingFile, trackingData.getBytes( StandardCharsets.UTF_8 ) );
                System.out.println( trackingData );
            }
            catch ( IOException e )
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/ConsoleRepositoryListener.java`
#### Snippet
```java
    public ConsoleRepositoryListener( PrintStream out )
    {
        this.out = ( out != null ) ? out : System.out;
    }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/ConsoleDependencyGraphDumper.java`
#### Snippet
```java
    public ConsoleDependencyGraphDumper( PrintStream out )
    {
        this.out = ( out != null ) ? out : System.out;
    }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/resolver/ResolverDemo.java`
#### Snippet
```java
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( ResolverDemo.class.getSimpleName() );

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/resolver/ResolverDemo.java`
#### Snippet
```java
    {
        System.out.println( "------------------------------------------------------------" );
        System.out.println( ResolverDemo.class.getSimpleName() );

        Resolver resolver = new Resolver(
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/resolver/ResolverDemo.java`
#### Snippet
```java
        ResolverResult result = resolver.resolve( "junit", "junit", "4.13.2" );

        System.out.println( "Result:" );
        System.out.println( "classpath=" + result.getResolvedClassPath() );
        System.out.println( "files=" + result.getResolvedFiles() );
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/resolver/ResolverDemo.java`
#### Snippet
```java

        System.out.println( "Result:" );
        System.out.println( "classpath=" + result.getResolvedClassPath() );
        System.out.println( "files=" + result.getResolvedFiles() );
        System.out.println( "root=" + result.getRoot() );
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/resolver/ResolverDemo.java`
#### Snippet
```java
        System.out.println( "Result:" );
        System.out.println( "classpath=" + result.getResolvedClassPath() );
        System.out.println( "files=" + result.getResolvedFiles() );
        System.out.println( "root=" + result.getRoot() );
    }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/resolver/ResolverDemo.java`
#### Snippet
```java
        System.out.println( "classpath=" + result.getResolvedClassPath() );
        System.out.println( "files=" + result.getResolvedFiles() );
        System.out.println( "root=" + result.getRoot() );
    }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/ConsoleTransferListener.java`
#### Snippet
```java
    public ConsoleTransferListener( PrintStream out )
    {
        this.out = ( out != null ) ? out : System.out;
    }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/resolver/Resolver.java`
#### Snippet
```java
        StringBuilder dump = new StringBuilder();
        displayTree( rootNode, dump );
        System.out.println( "Tree:" );
        System.out.println( dump );

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/resolver/Resolver.java`
#### Snippet
```java
        displayTree( rootNode, dump );
        System.out.println( "Tree:" );
        System.out.println( dump );

        PreorderNodeListGenerator nlg = new PreorderNodeListGenerator();
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/TestNioLock.java`
#### Snippet
```java
        if ( args.length != 3 )
        {
            System.out.println( "TestNioLock <test|perform> <file> <sleepMs>" );
            System.exit( EC_ERROR );
        }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/TestNioLock.java`
#### Snippet
```java
        if ( Files.isDirectory( path ) )
        {
            System.out.println( "The <file> cannot be directory." );
            System.exit( EC_ERROR );
        }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/TestNioLock.java`
#### Snippet
```java
        if ( "test".equals( mode ) )
        {
            System.out.println( "Testing file locking on" );
            System.out.println(
                    "  Java " + System.getProperty( "java.version" ) + ", " + System.getProperty( "java.vendor" ) );
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/TestNioLock.java`
#### Snippet
```java
        {
            System.out.println( "Testing file locking on" );
            System.out.println(
                    "  Java " + System.getProperty( "java.version" ) + ", " + System.getProperty( "java.vendor" ) );
            System.out.println(
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/TestNioLock.java`
#### Snippet
```java
            System.out.println(
                    "  Java " + System.getProperty( "java.version" ) + ", " + System.getProperty( "java.vendor" ) );
            System.out.println(
                    "  OS " + System.getProperty( "os.name" ) + " " + System.getProperty( "os.version" ) + " "
                            + System.getProperty( "os.arch" ) );
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/TestNioLock.java`
#### Snippet
```java

            FileStore fileStore = Files.getFileStore( path.getParent() );
            System.out.println( "  FS " + fileStore.name() + " " + fileStore.type() );
            System.out.println();

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/TestNioLock.java`
#### Snippet
```java
            FileStore fileStore = Files.getFileStore( path.getParent() );
            System.out.println( "  FS " + fileStore.name() + " " + fileStore.type() );
            System.out.println();

            AtomicInteger oneResult = new AtomicInteger( -1 );
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/TestNioLock.java`
#### Snippet
```java
            if ( ( oneExit == EC_WON && twoExit == EC_LOST ) || ( oneExit == EC_LOST && twoExit == EC_WON ) )
            {
                System.out.println( "OK" );
                System.exit( 0 );
            }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/TestNioLock.java`
#### Snippet
```java
            else
            {
                System.out.println( "FAILED: one=" + oneExit + " two=" + twoExit );
                System.exit( EC_FAILED );
            }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/TestNioLock.java`
#### Snippet
```java
        {
            String processName = ManagementFactory.getRuntimeMXBean().getName();
            System.out.println( processName + " > started" );
            boolean won = false;
            long sleepMs = Long.parseLong( args[2] );
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/TestNioLock.java`
#### Snippet
```java
                try ( FileLock latchLock = latchChannel.lock( 0L, 1L, true ) )
                {
                    System.out.println( processName + " > latchLock acquired" );
                    try ( FileChannel channel = FileChannel.open( path, StandardOpenOption.READ,
                            StandardOpenOption.WRITE, StandardOpenOption.CREATE ) )
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/TestNioLock.java`
#### Snippet
```java
                            if ( lock != null && lock.isValid() && !lock.isShared() )
                            {
                                System.out.println( processName + " > WON" );
                                won = true;
                                Thread.sleep( sleepMs );
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/TestNioLock.java`
#### Snippet
```java
                            else
                            {
                                System.out.println( processName + " > LOST" );
                            }
                        }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/TestNioLock.java`
#### Snippet
```java
                }
            }
            System.out.println( processName + " > ended" );
            if ( won )
            {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/TestNioLock.java`
#### Snippet
```java
        else
        {
            System.err.println( "Unknown mode: " + mode );
        }
        System.exit( EC_ERROR );
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestLoggerFactory.java`
#### Snippet
```java
        TestLogger( PrintStream out )
        {
            this.out = ( out != null ) ? out : System.out;
        }

```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `SyncContextFactory` is the same as one of its superclass' names
in `maven-resolver-impl/src/main/java/org/eclipse/aether/impl/SyncContextFactory.java`
#### Snippet
```java
 */
@Deprecated
public interface SyncContextFactory extends org.eclipse.aether.spi.synccontext.SyncContextFactory
{
}
```

## RuleId[ruleID=MissingDeprecatedAnnotation]
### RuleId[ruleID=MissingDeprecatedAnnotation]
Missing '@Deprecated' annotation
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/StringUtils.java`
#### Snippet
```java
     * @deprecated use {@code org.apache.commons.lang3.StringUtils.isEmpty()} instead
     */
    public static boolean isEmpty( String string )
    {
        return string == null || string.isEmpty();
```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### RuleId[ruleID=ConditionCoveredByFurtherCondition]
Condition 'process.length() \> 0' covered by subsequent condition 'process.startsWith(...)'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestVersionScheme.java`
#### Snippet
```java
            process = process.substring( index + 1 ).trim();

            if ( process.length() > 0 && process.startsWith( "," ) )
            {
                process = process.substring( 1 ).trim();
```

### RuleId[ruleID=ConditionCoveredByFurtherCondition]
Condition 'scope != null' covered by subsequent condition 'JavaScopes.SYSTEM.equals(...)'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DefaultDependencyManager.java`
#### Snippet
```java
        }

        if ( ( scope != null && JavaScopes.SYSTEM.equals( scope ) )
                 || ( scope == null && JavaScopes.SYSTEM.equals( dependency.getScope() ) ) )
        {
```

### RuleId[ruleID=ConditionCoveredByFurtherCondition]
Condition 'process.length() \> 0' covered by subsequent condition 'process.startsWith(...)'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/version/GenericVersionScheme.java`
#### Snippet
```java
            process = process.substring( index + 1 ).trim();

            if ( process.length() > 0 && process.startsWith( "," ) )
            {
                process = process.substring( 1 ).trim();
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/WorkspaceRepository.java`
#### Snippet
```java
    {
        this.type = ( type != null ) ? type : "";
        this.key = ( key != null ) ? key : UUID.randomUUID().toString().replace( "-", "" );
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/ReverseTreeRepositoryListener.java`
#### Snippet
```java
                Files.createDirectories( trackingDir );
                Path trackingFile = trackingDir.resolve( collectStepTrace.getPath().get( 0 )
                        .getArtifact().toString().replace( ":", "_" ) );
                Files.write( trackingFile, trackingData.getBytes( StandardCharsets.UTF_8 ) );
                System.out.println( trackingData );
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
        {
            properties = new LinkedHashMap<>();
            for ( String prop : props.split( "\\s*,\\s*" ) )
            {
                int sep = prop.indexOf( ':' );
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
        {
            relocations = new ArrayList<>();
            Collections.addAll( relocations, relocs.split( "\\s*,\\s*" ) );
        }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String COORDS = "([^: \\(]+):([^: ]+)(?::([^: ]*)(?::([^: ]+))?)?:([^: \\[\\(<]+)";

    private static final String COORDS_NC = NodeDefinition.COORDS.replaceAll( "\\((?=\\[)", "(?:" );

    private static final String RANGE_NC = "[\\(\\[][^\\(\\)\\[\\]]+[\\)\\]]";
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java
                    {
                        String name = line.substring( 1, line.length() - 1 );
                        name = name.replace( "-", "" ).toUpperCase( Locale.ENGLISH );
                        state = State.valueOf( name );
                        sections.put( state, new ArrayList<String>() );
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
                    throw new IllegalStateException( "not enough substitutions to fill placeholders" );
                }
                line = line.replaceFirst( "%s", substitutionIterator.next() );
            }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
        String definition;

        String[] split = line.split( "- " );
        if ( split.length == 1 ) // root
        {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/SummaryFileTrustedChecksumsSource.java`
#### Snippet
```java
                    if ( !line.startsWith( "#" ) && !line.isEmpty() )
                    {
                        String[] parts = line.split( "  ", 2 );
                        if ( parts.length == 2 )
                        {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/filter/DependencyFilterUtils.java`
#### Snippet
```java
            for ( String classpathType : classpathTypes )
            {
                String[] tokens = classpathType.split( "[+,]" );
                for ( String token : tokens )
                {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/DefaultProxySelector.java`
#### Snippet
```java
                {
                    String pattern = tokenizer.nextToken();
                    pattern = pattern.replace( ".", "\\." ).replace( "*", ".*" );
                    patterns.add( Pattern.compile( pattern, Pattern.CASE_INSENSITIVE ) );
                }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/DefaultProxySelector.java`
#### Snippet
```java
                {
                    String pattern = tokenizer.nextToken();
                    pattern = pattern.replace( ".", "\\." ).replace( "*", ".*" );
                    patterns.add( Pattern.compile( pattern, Pattern.CASE_INSENSITIVE ) );
                }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/SslConfig.java`
#### Snippet
```java
            return null;
        }
        return value.split( ",+" );
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/ChecksumUtils.java`
#### Snippet
```java
        }

        if ( checksum.matches( ".+= [0-9A-Fa-f]+" ) )
        {
            int lastSpacePos = checksum.lastIndexOf( ' ' );
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/artifact/SubArtifact.java`
#### Snippet
```java
        if ( pattern != null )
        {
            result = pattern.replace( "*", replacement );

            if ( replacement.isEmpty() )
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.eclipse.aether` is unnecessary and can be removed
in `maven-resolver-api/src/main/java/org/eclipse/aether/RepositoryListener.java`
#### Snippet
```java
 * directly implementing this interface.
 * 
 * @see org.eclipse.aether.RepositorySystemSession#getRepositoryListener()
 * @see org.eclipse.aether.transfer.TransferListener
 * @noimplement This interface is not intended to be implemented by clients.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.eclipse.aether.repository` is unnecessary and can be removed
in `maven-resolver-api/src/main/java/org/eclipse/aether/DefaultRepositorySystemSession.java`
#### Snippet
```java
     * @param authenticationSelector The authentication selector to use, may be {@code null}.
     * @return This session for chaining, never {@code null}.
     * @see org.eclipse.aether.repository.RemoteRepository#getAuthentication()
     */
    public DefaultRepositorySystemSession setAuthenticationSelector( AuthenticationSelector authenticationSelector )
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.eclipse.aether.repository` is unnecessary and can be removed
in `maven-resolver-api/src/main/java/org/eclipse/aether/DefaultRepositorySystemSession.java`
#### Snippet
```java
     * @param proxySelector The proxy selector to use, may be {@code null}.
     * @return This session for chaining, never {@code null}.
     * @see org.eclipse.aether.repository.RemoteRepository#getProxy()
     */
    public DefaultRepositorySystemSession setProxySelector( ProxySelector proxySelector )
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `maven-resolver-api/src/main/java/org/eclipse/aether/transfer/TransferResource.java`
#### Snippet
```java
     * @param trace The trace information, may be {@code null}.
     *
     * @deprecated As of 1.1.0, replaced by {@link #TransferResource(java.lang.String, java.lang.String,
     * java.lang.String, java.io.File, org.eclipse.aether.RequestTrace)}
     */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `maven-resolver-api/src/main/java/org/eclipse/aether/transfer/TransferResource.java`
#### Snippet
```java
     * @param trace The trace information, may be {@code null}.
     *
     * @deprecated As of 1.1.0, replaced by {@link #TransferResource(java.lang.String, java.lang.String,
     * java.lang.String, java.io.File, org.eclipse.aether.RequestTrace)}
     */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `maven-resolver-api/src/main/java/org/eclipse/aether/transfer/TransferResource.java`
#### Snippet
```java
     *
     * @deprecated As of 1.1.0, replaced by {@link #TransferResource(java.lang.String, java.lang.String,
     * java.lang.String, java.io.File, org.eclipse.aether.RequestTrace)}
     */
    @Deprecated
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `maven-resolver-api/src/main/java/org/eclipse/aether/transfer/TransferResource.java`
#### Snippet
```java
     *
     * @deprecated As of 1.1.0, replaced by {@link #TransferResource(java.lang.String, java.lang.String,
     * java.lang.String, java.io.File, org.eclipse.aether.RequestTrace)}
     */
    @Deprecated
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.eclipse.aether` is unnecessary and can be removed
in `maven-resolver-api/src/main/java/org/eclipse/aether/transfer/TransferResource.java`
#### Snippet
```java
     *
     * @deprecated As of 1.1.0, replaced by {@link #TransferResource(java.lang.String, java.lang.String,
     * java.lang.String, java.io.File, org.eclipse.aether.RequestTrace)}
     */
    @Deprecated
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `maven-resolver-api/src/main/java/org/eclipse/aether/collection/VersionFilter.java`
#### Snippet
```java
     * Filters the available versions for a given dependency. Implementations will usually call
     * {@link VersionFilterContext#iterator() context.iterator()} to inspect the available versions and use
     * {@link java.util.Iterator#remove()} to delete unacceptable versions. If no versions remain after all filtering
     * has been performed, the dependency collection process will automatically fail, i.e. implementations need not
     * handle this situation on their own.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.eclipse.aether` is unnecessary and can be removed
in `maven-resolver-api/src/main/java/org/eclipse/aether/collection/VersionFilter.java`
#### Snippet
```java
 * performance. Among others, implementations should provide a semantic {@link Object#equals(Object) equals()} method.
 * 
 * @see org.eclipse.aether.RepositorySystemSession#getVersionFilter()
 * @see org.eclipse.aether.RepositorySystem#collectDependencies(org.eclipse.aether.RepositorySystemSession,
 *      CollectRequest)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.eclipse.aether` is unnecessary and can be removed
in `maven-resolver-api/src/main/java/org/eclipse/aether/collection/VersionFilter.java`
#### Snippet
```java
 * 
 * @see org.eclipse.aether.RepositorySystemSession#getVersionFilter()
 * @see org.eclipse.aether.RepositorySystem#collectDependencies(org.eclipse.aether.RepositorySystemSession,
 *      CollectRequest)
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.maven.resolver.examples.manual` is unnecessary, and can be replaced with an import
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/Booter.java`
#### Snippet
```java
        {
            case SERVICE_LOCATOR:
                return org.apache.maven.resolver.examples.manual.ManualRepositorySystemFactory.newRepositorySystem();
            case GUICE:
                return org.apache.maven.resolver.examples.guice.GuiceRepositorySystemFactory.newRepositorySystem();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.maven.resolver.examples.guice` is unnecessary, and can be replaced with an import
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/Booter.java`
#### Snippet
```java
                return org.apache.maven.resolver.examples.manual.ManualRepositorySystemFactory.newRepositorySystem();
            case GUICE:
                return org.apache.maven.resolver.examples.guice.GuiceRepositorySystemFactory.newRepositorySystem();
            case SISU:
                return org.apache.maven.resolver.examples.sisu.SisuRepositorySystemFactory.newRepositorySystem();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.maven.resolver.examples.sisu` is unnecessary, and can be replaced with an import
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/Booter.java`
#### Snippet
```java
                return org.apache.maven.resolver.examples.guice.GuiceRepositorySystemFactory.newRepositorySystem();
            case SISU:
                return org.apache.maven.resolver.examples.sisu.SisuRepositorySystemFactory.newRepositorySystem();
            default:
                throw new IllegalArgumentException( "Unknown factory: " + factory );
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/providers/LocalSemaphoreNamedLockFactory.java`
#### Snippet
```java

    /**
     * Adapted JVM {@link java.util.concurrent.Semaphore}.
     */
    private static final class JVMSemaphore
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.eclipse.aether.spi.log` is unnecessary, and can be replaced with an import
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultRepositorySystem.java`
#### Snippet
```java
     */
    @Deprecated
    public DefaultRepositorySystem setLoggerFactory( org.eclipse.aether.spi.log.LoggerFactory loggerFactory )
    {
        // this.logger = NullLoggerFactory.getSafeLogger( loggerFactory, getClass() );
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `maven-resolver-transport-file/src/main/java/org/eclipse/aether/transport/file/FileTransporter.java`
#### Snippet
```java

/**
 * A transporter using {@link java.io.File}.
 */
final class FileTransporter
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.eclipse.aether.spi.connector.layout` is unnecessary and can be removed
in `maven-resolver-spi/src/main/java/org/eclipse/aether/spi/connector/layout/RepositoryLayout.java`
#### Snippet
```java
     * The result affects only layout provided checksums. See
     * {@link org.eclipse.aether.spi.connector.checksum.ChecksumPolicy.ChecksumKind#REMOTE_EXTERNAL}.
     * On download, the {@link org.eclipse.aether.spi.connector.layout.RepositoryLayout#getChecksumAlgorithmFactories()}
     * layout required checksums are calculated, and non layout-provided checksums are still utilized.
     *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.eclipse.aether.spi.connector.checksum` is unnecessary and can be removed
in `maven-resolver-spi/src/main/java/org/eclipse/aether/spi/connector/checksum/ProvidedChecksumsSource.java`
#### Snippet
```java
/**
 * Component able to provide (expected) checksums to connector beforehand the download happens. Checksum provided by
 * this component are of kind {@link org.eclipse.aether.spi.connector.checksum.ChecksumPolicy.ChecksumKind#PROVIDED}.
 *
 * @since 1.8.0
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.redisson.api` is unnecessary and can be removed
in `maven-resolver-named-locks-redisson/src/main/java/org/eclipse/aether/named/redisson/RedissonReadWriteLockNamedLockFactory.java`
#### Snippet
```java

/**
 * Provider of {@link RedissonReadWriteLockNamedLockFactory} using Redisson and {@link org.redisson.api.RReadWriteLock}.
 */
@Singleton
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.redisson.api` is unnecessary and can be removed
in `maven-resolver-named-locks-redisson/src/main/java/org/eclipse/aether/named/redisson/RedissonSemaphoreNamedLockFactory.java`
#### Snippet
```java

/**
 * Provider of {@link RedissonSemaphoreNamedLockFactory} using Redisson and {@link org.redisson.api.RSemaphore}.
 */
@Singleton
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.eclipse.aether.graph` is unnecessary and can be removed
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/visitor/AbstractDepthFirstNodeListGenerator.java`
#### Snippet
```java
 * <p>
 * Actual vertex ordering (preorder, inorder, postorder) needs to be defined by subclasses through appropriate
 * implementations for {@link #visitEnter(org.eclipse.aether.graph.DependencyNode)} and
 * {@link #visitLeave(org.eclipse.aether.graph.DependencyNode)}
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.eclipse.aether.graph` is unnecessary and can be removed
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/visitor/AbstractDepthFirstNodeListGenerator.java`
#### Snippet
```java
 * Actual vertex ordering (preorder, inorder, postorder) needs to be defined by subclasses through appropriate
 * implementations for {@link #visitEnter(org.eclipse.aether.graph.DependencyNode)} and
 * {@link #visitLeave(org.eclipse.aether.graph.DependencyNode)}
 */
abstract class AbstractDepthFirstNodeListGenerator
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.eclipse.aether.artifact` is unnecessary and can be removed
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/traverser/FatArtifactTraverser.java`
#### Snippet
```java
/**
 * A dependency traverser that excludes the dependencies of fat artifacts from the traversal. Fat artifacts are
 * artifacts that have the property {@link org.eclipse.aether.artifact.ArtifactProperties#INCLUDES_DEPENDENCIES} set to
 * {@code true}.
 * 
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.net` is unnecessary and can be removed
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/JreProxySelector.java`
#### Snippet
```java
 * up the proxy configuration from the operating system, see <a
 * href="http://docs.oracle.com/javase/6/docs/technotes/guides/net/proxies.html">Java Networking and Proxies</a> for
 * details. The {@link java.net.Authenticator JRE's global authenticator} is used to look up credentials for a proxy
 * when needed.
 */
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java
        {
            in = new BufferedReader( reader );
            while ( ( line = in.readLine() ) != null )
            {

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `maven-resolver-connector-basic/src/main/java/org/eclipse/aether/connector/basic/BasicRepositoryConnector.java`
#### Snippet
```java
                try ( InputStream transformData = fileTransformer.transformData( file ) )
                {
                    for ( int read; ( read = transformData.read( buffer, 0, buffer.length ) ) != -1; )
                    {
                        baos.write( buffer, 0, read );
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
        boolean isRootNode = true;

        while ( ( line = in.readLine() ) != null )
        {
            line = cutComment( line );
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
        List<DependencyNode> ret = new ArrayList<>();
        DependencyNode root = null;
        while ( ( root = parse( reader ) ) != null )
        {
            ret.add( root );
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/filter/PrefixesRemoteRepositoryFilterSource.java`
#### Snippet
```java
                String prefix;
                int lines = 0;
                while ( ( prefix = reader.readLine() ) != null )
                {
                    if ( !prefix.startsWith( "#" ) && !prefix.trim().isEmpty() )
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/filter/GroupIdRemoteRepositoryFilterSource.java`
#### Snippet
```java
                TreeSet<String> result = new TreeSet<>();
                String groupId;
                while ( ( groupId = reader.readLine() ) != null )
                {
                    if ( !groupId.startsWith( "#" ) && !groupId.trim().isEmpty() )
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/SummaryFileTrustedChecksumsSource.java`
#### Snippet
```java
            {
                String line;
                while ( ( line = reader.readLine() ) != null )
                {
                    if ( !line.startsWith( "#" ) && !line.isEmpty() )
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `maven-resolver-transport-file/src/main/java/org/eclipse/aether/transport/file/PathUtils.java`
#### Snippet
```java
        {
            int pos = -1;
            while ( ( pos = decoded.indexOf( '%', pos + 1 ) ) >= 0 )
            {
                if ( pos + 2 < decoded.length() )
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileUtils.java`
#### Snippet
```java
            catch ( IOException e )
            {
                e.printStackTrace();
            }
        } ) );
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `NamedLockSupport()` of an abstract class should not be declared 'public'
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/NamedLockSupport.java`
#### Snippet
```java
    private final NamedLockFactorySupport factory;

    public NamedLockSupport( final String name, final NamedLockFactorySupport factory )
    {
        this.name = name;
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `NamedLockFactorySupport()` of an abstract class should not be declared 'public'
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/NamedLockFactorySupport.java`
#### Snippet
```java
    private final ConcurrentMap<String, NamedLockHolder> locks;

    public NamedLockFactorySupport()
    {
        this.locks = new ConcurrentHashMap<>();
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `MessageDigestChecksumAlgorithmFactorySupport()` of an abstract class should not be declared 'public'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/MessageDigestChecksumAlgorithmFactorySupport.java`
#### Snippet
```java
        extends ChecksumAlgorithmFactorySupport
{
    public MessageDigestChecksumAlgorithmFactorySupport( String name, String extension )
    {
        super( name, extension );
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `ChecksumAlgorithmFactorySupport()` of an abstract class should not be declared 'public'
in `maven-resolver-spi/src/main/java/org/eclipse/aether/spi/connector/checksum/ChecksumAlgorithmFactorySupport.java`
#### Snippet
```java
    private final String fileExtension;

    public ChecksumAlgorithmFactorySupport( String name, String fileExtension )
    {
        this.name = requireNonNull( name );
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `RedissonNamedLockFactorySupport()` of an abstract class should not be declared 'public'
in `maven-resolver-named-locks-redisson/src/main/java/org/eclipse/aether/named/redisson/RedissonNamedLockFactorySupport.java`
#### Snippet
```java
    protected final RedissonClient redissonClient;

    public RedissonNamedLockFactorySupport()
    {
        this.redissonClient = createRedissonClient();
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.get()` on properties object
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/EnhancedLocalRepositoryManager.java`
#### Snippet
```java
            Properties props = readRepos( file );

            if ( props.get( getKey( file, LOCAL_REPO_ID ) ) != null )
            {
                // artifact installed into the local repo is always accepted
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.get()` on properties object
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/EnhancedLocalRepositoryManager.java`
#### Snippet
```java
                for ( RemoteRepository repository : result.getRequest().getRepositories() )
                {
                    if ( props.get( getKey( file, getRepositoryKey( repository, context ) ) ) != null )
                    {
                        // artifact downloaded from remote repository is accepted only downloaded from request
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `maven-resolver-transport-wagon/src/main/java/org/eclipse/aether/transport/wagon/WagonTransporter.java`
#### Snippet
```java

        headers = new Properties();
        headers.put( "User-Agent", ConfigUtils.getString( session, ConfigurationProperties.DEFAULT_USER_AGENT,
                ConfigurationProperties.USER_AGENT ) );
        Map<?, ?> headers =
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.putAll()` on properties object
in `maven-resolver-transport-wagon/src/main/java/org/eclipse/aether/transport/wagon/WagonTransporter.java`
#### Snippet
```java
        if ( headers != null )
        {
            this.headers.putAll( headers );
        }
    }
```

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `maven-resolver-named-locks-hazelcast/src/main/java/org/eclipse/aether/named/hazelcast/HazelcastSemaphoreProvider.java`
#### Snippet
```java
     * Invoked when passed in semaphore associated with passed in name is not to be used anymore.
     */
    public abstract void releaseSemaphore( HazelcastInstance hazelcastInstance, String name, ISemaphore semaphore );
}

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/ChecksumExtractor.java`
#### Snippet
```java
     * Prepares request, if needed.
     */
    public void prepareRequest( HttpUriRequest request )
    {
        // nothing
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `maven-resolver-api/src/main/java/org/eclipse/aether/graph/Dependency.java`
#### Snippet
```java
            {

                private int cursor = 0;

                public boolean hasNext()
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/LocalMetadataRequest.java`
#### Snippet
```java
    private String context = "";

    private RemoteRepository repository = null;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeBuilder.java`
#### Snippet
```java
    private String scope = "compile";

    private boolean optional = false;

    private String context;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java
        private String reference = null;

        private boolean optional = false;

        Definition( String def )
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java
        private String definition;

        private String id = null;

        private String reference = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java
        private String id = null;

        private String reference = null;

        private boolean optional = false;
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `exclusions`
in `maven-resolver-api/src/main/java/org/eclipse/aether/graph/Dependency.java`
#### Snippet
```java
            if ( exclusions.size() > 1 && !( exclusions instanceof Set ) )
            {
                exclusions = new LinkedHashSet<>( exclusions );
            }
            this.exclusions = exclusions.toArray( new Exclusion[0] );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/AuthenticationContext.java`
#### Snippet
```java
                if ( value instanceof File )
                {
                    value = ( (File) value ).getPath();
                }
                else if ( value instanceof char[] )
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/AuthenticationContext.java`
#### Snippet
```java
                else if ( value instanceof char[] )
                {
                    value = new String( (char[]) value );
                }
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/AuthenticationContext.java`
#### Snippet
```java
                if ( value instanceof String )
                {
                    value = new File( (String) value );
                }
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/AuthenticationContext.java`
#### Snippet
```java
                if ( value instanceof String )
                {
                    value = ( (String) value ).toCharArray();
                }
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `spaces`
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/ConsoleTransferListener.java`
#### Snippet
```java
            int n = Math.min( spaces, block.length() );
            buffer.append( block, 0, n );
            spaces -= n;
        }
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `line`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java
        if ( idx != -1 )
        {
            line = line.substring( 0, idx );
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `level`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java

        entry.setDefinition( defBuilder.toString() );
        entry.setLevel( level++ );

        entries.add( entry );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `line`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
        if ( idx != -1 )
        {
            line = line.substring( 0, idx );
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `priority`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/PrioritizedComponents.java`
#### Snippet
```java
        Class<?> type = getImplClass( component );
        int index = components.size();
        priority = useInsertionOrder ? -index : ConfigUtils.getFloat( configProps, priority, getConfigKeys( type ) );
        PrioritizedComponent<T> pc = new PrioritizedComponent<>( component, type, priority, index );

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `policy`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultUpdatePolicyAnalyzer.java`
#### Snippet
```java
        if ( policy == null )
        {
            policy = "";
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `updates`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultRemoteRepositoryManager.java`
#### Snippet
```java
            if ( StringUtils.isEmpty( updates ) )
            {
                updates = policy.getUpdatePolicy();
            }
            if ( StringUtils.isEmpty( checksums ) )
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `checksums`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultRemoteRepositoryManager.java`
#### Snippet
```java
            if ( StringUtils.isEmpty( checksums ) )
            {
                checksums = policy.getChecksumPolicy();
            }
            if ( !policy.getUpdatePolicy().equals( updates ) || !policy.getChecksumPolicy().equals( checksums ) )
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `policy`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultRemoteRepositoryManager.java`
#### Snippet
```java
            if ( !policy.getUpdatePolicy().equals( updates ) || !policy.getChecksumPolicy().equals( checksums ) )
            {
                policy = new RepositoryPolicy( policy.isEnabled(), updates, checksums );
            }
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `repositories`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultRepositorySystem.java`
#### Snippet
```java
        validateRepositories( repositories );

        repositories =
                remoteRepositoryManager.aggregateRepositories( session, new ArrayList<RemoteRepository>(), repositories,
                        true );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `dependency`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/PremanagedDependency.java`
#### Snippet
```java
                Artifact artifact = dependency.getArtifact();
                premanagedVersion = artifact.getVersion();
                dependency = dependency.setArtifact( artifact.setVersion( depMngt.getVersion() ) );
                managedBits |= DependencyNode.MANAGED_VERSION;
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `dependency`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/PremanagedDependency.java`
#### Snippet
```java
                Artifact artifact = dependency.getArtifact();
                premanagedProperties = artifact.getProperties();
                dependency = dependency.setArtifact( artifact.setProperties( depMngt.getProperties() ) );
                managedBits |= DependencyNode.MANAGED_PROPERTIES;
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `dependency`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/PremanagedDependency.java`
#### Snippet
```java
            {
                premanagedScope = dependency.getScope();
                dependency = dependency.setScope( depMngt.getScope() );
                managedBits |= DependencyNode.MANAGED_SCOPE;
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `dependency`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/PremanagedDependency.java`
#### Snippet
```java
            {
                premanagedOptional = dependency.isOptional();
                dependency = dependency.setOptional( depMngt.getOptional() );
                managedBits |= DependencyNode.MANAGED_OPTIONAL;
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `dependency`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/PremanagedDependency.java`
#### Snippet
```java
            {
                premanagedExclusions = dependency.getExclusions();
                dependency = dependency.setExclusions( depMngt.getExclusions() );
                managedBits |= DependencyNode.MANAGED_EXCLUSIONS;
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `file`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultArtifactResolver.java`
#### Snippet
```java
            }

            file = dst;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `e`
in `maven-resolver-transport-wagon/src/main/java/org/eclipse/aether/transport/wagon/WagonCancelledException.java`
#### Snippet
```java
        if ( e instanceof WagonCancelledException )
        {
            e = (Exception) e.getCause();
        }
        return e;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `session`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/DependencyCollectorDelegate.java`
#### Snippet
```java
        requireNonNull( session, "session cannot be null" );
        requireNonNull( request, "request cannot be null" );
        session = optimizeSession( session );

        RequestTrace trace = RequestTrace.newChild( request.getTrace(), request );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `node`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ChainedDependencyGraphTransformer.java`
#### Snippet
```java
        for ( DependencyGraphTransformer transformer : transformers )
        {
            node = transformer.transformGraph( node, context );
        }
        return node;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `depth`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictIdSorter.java`
#### Snippet
```java
            {
                minDepth = depth;
                depth++;
                for ( ConflictId child : children )
                {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `depth`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictIdSorter.java`
#### Snippet
```java
        }

        depth++;

        for ( DependencyNode child : node.getChildren() )
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `base`
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/UriUtils.java`
#### Snippet
```java
                try
                {
                    base = new URI( base.getScheme(), base.getAuthority(), base.getPath() + '/', null, null );
                }
                catch ( URISyntaxException e )
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `host`
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/SharingAuthCache.java`
#### Snippet
```java
    public AuthScheme get( HttpHost host )
    {
        host = toKey( host );
        AuthScheme authScheme = authSchemes.get( host );
        if ( authScheme == null )
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `dependency`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/df/DfDependencyCollector.java`
#### Snippet
```java
        PremanagedDependency preManaged =
            PremanagedDependency.create( depManager, dependency, disableVersionManagement, args.premanagedState );
        dependency = preManaged.getManagedDependency();

        boolean noDescriptor = isLackingDescriptor( dependency.getArtifact() );
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-18-23-41-30.980.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/RepositoryEvent.java`
#### Snippet
```java
    public Exception getException()
    {
        return exceptions.isEmpty() ? null : exceptions.get( 0 );
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/DefaultRepositorySystemSession.java`
#### Snippet
```java
        public ArtifactType get( String typeId )
        {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/DefaultRepositorySystemSession.java`
#### Snippet
```java
        {
            requireNonNull( repository, "repository cannot be null" );
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/DefaultRepositorySystemSession.java`
#### Snippet
```java
    {
        LocalRepositoryManager lrm = getLocalRepositoryManager();
        return ( lrm != null ) ? lrm.getRepository() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/transfer/TransferEvent.java`
#### Snippet
```java
    public ByteBuffer getDataBuffer()
    {
        return ( dataBuffer != null ) ? dataBuffer.asReadOnlyBuffer() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/resolution/VersionRangeResult.java`
#### Snippet
```java
        if ( versions.isEmpty() )
        {
            return null;
        }
        return versions.get( versions.size() - 1 );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/resolution/VersionRangeResult.java`
#### Snippet
```java
        if ( versions.isEmpty() )
        {
            return null;
        }
        return versions.get( 0 );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/AuthenticationContext.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/AuthenticationContext.java`
#### Snippet
```java
        if ( auth == null )
        {
            return null;
        }
        return new AuthenticationContext( session, repository, proxy, auth );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/resolution/ArtifactResolutionException.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/resolution/ArtifactResolutionException.java`
#### Snippet
```java
    public ArtifactResult getResult()
    {
        return ( results != null && !results.isEmpty() ) ? results.get( 0 ) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-connector-basic/src/main/java/org/eclipse/aether/connector/basic/ChecksumCalculator.java`
#### Snippet
```java
        if ( checksumAlgorithmFactories == null || checksumAlgorithmFactories.isEmpty() )
        {
            return null;
        }
        return new ChecksumCalculator( targetFile, checksumAlgorithmFactories );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/FileLockNamedLock.java`
#### Snippet
```java
                        {
                            // someone else owns shared, let's wait
                            return null;
                        }
                    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/FileLockNamedLock.java`
#### Snippet
```java
                        {
                            // someone else owns exclusive, let's wait
                            return null;
                        }
                    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/FileLockNamedLock.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/FileLockNamedLock.java`
#### Snippet
```java
        {
            logger.trace( "File lock overlap on '{}'", name(), e );
            return null;
        }
        catch ( IOException e )
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/FileLockNamedLock.java`
#### Snippet
```java
                        {
                            // someone else owns exclusive, let's wait
                            return null;
                        }
                    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/FileLockNamedLock.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/providers/FileLockNamedLockFactory.java`
#### Snippet
```java
                    catch ( AccessDeniedException e )
                    {
                        return null;
                    }
                }, null, null );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java
        if ( list == null || list.isEmpty() )
        {
            return null;
        }
        String coords = list.get( 0 );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-connector-basic/src/main/java/org/eclipse/aether/connector/basic/ChecksumValidator.java`
#### Snippet
```java
            return ChecksumCalculator.newInstance( targetFile, checksumAlgorithmFactories );
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/impl/DefaultServiceLocator.java`
#### Snippet
```java
                serviceCreationFailed( type, impl, e );
            }
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/impl/DefaultServiceLocator.java`
#### Snippet
```java
    {
        Entry<T> entry = getEntry( type, false );
        return ( entry != null ) ? entry.getInstances() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/impl/DefaultServiceLocator.java`
#### Snippet
```java
    {
        Entry<T> entry = getEntry( type, false );
        return ( entry != null ) ? entry.getInstance() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/impl/DefaultServiceLocator.java`
#### Snippet
```java
        {
            List<T> instances = getInstances();
            return instances.isEmpty() ? null : instances.get( 0 );
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultTrackingFileManager.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultOfflineController.java`
#### Snippet
```java
        if ( value.isEmpty() )
        {
            return null;
        }
        return SEP.split( value );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/SafeTransferListener.java`
#### Snippet
```java
        if ( listener == null )
        {
            return null;
        }
        return new SafeTransferListener( listener );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/LocalPathPrefixComposerFactorySupport.java`
#### Snippet
```java
            if ( !split )
            {
                return null;
            }
            String result = remotePrefix;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/LocalPathPrefixComposerFactorySupport.java`
#### Snippet
```java
            if ( !split )
            {
                return null;
            }
            String result = localPrefix;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/LocalPathPrefixComposerFactorySupport.java`
#### Snippet
```java
            if ( !split )
            {
                return null;
            }
            String result = localPrefix;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/LocalPathPrefixComposerFactorySupport.java`
#### Snippet
```java
            if ( !split )
            {
                return null;
            }
            String result = remotePrefix;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultChecksumPolicyProvider.java`
#### Snippet
```java
        {
            case RepositoryPolicy.CHECKSUM_POLICY_IGNORE:
                return null;
            case RepositoryPolicy.CHECKSUM_POLICY_FAIL:
                return new FailChecksumPolicy( resource );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/filter/PrefixesRemoteRepositoryFilterSource.java`
#### Snippet
```java
            return new PrefixesFilter( session, getBasedir( session, false ) );
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/CachingArtifactTypeRegistry.java`
#### Snippet
```java
    public static ArtifactTypeRegistry newInstance( ArtifactTypeRegistry delegate )
    {
        return ( delegate != null ) ? new CachingArtifactTypeRegistry( delegate ) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/filter/GroupIdRemoteRepositoryFilterSource.java`
#### Snippet
```java
            return new GroupIdFilter( session );
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/filter/DefaultRemoteRepositoryFilterManager.java`
#### Snippet
```java
                    else
                    {
                        return null;
                    }
                }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/FileTrustedChecksumsSourceSupport.java`
#### Snippet
```java
            return doGetTrustedArtifactChecksumsWriter( session );
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/FileTrustedChecksumsSourceSupport.java`
#### Snippet
```java
            );
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/FileTrustedChecksumsSourceSupport.java`
#### Snippet
```java
    protected Writer doGetTrustedArtifactChecksumsWriter( RepositorySystemSession session )
    {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/DataPool.java`
#### Snippet
```java
            return constraint.toResult( request );
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/DataPool.java`
#### Snippet
```java
            return descriptor.toResult( request );
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/TrustedToProvidedChecksumsSourceAdapter.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/NoopDependencyManager.java`
#### Snippet
```java
    {
        requireNonNull( dependency, "dependency cannot be null" );
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DependencyManagerUtils.java`
#### Snippet
```java
        if ( ( node.getManagedBits() & DependencyNode.MANAGED_OPTIONAL ) == 0 )
        {
            return null;
        }
        return cast( node.getData().get( NODE_DATA_PREMANAGED_OPTIONAL ), Boolean.class );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DependencyManagerUtils.java`
#### Snippet
```java
        if ( ( node.getManagedBits() & DependencyNode.MANAGED_SCOPE ) == 0 )
        {
            return null;
        }
        return cast( node.getData().get( NODE_DATA_PREMANAGED_SCOPE ), String.class );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DependencyManagerUtils.java`
#### Snippet
```java
        if ( ( node.getManagedBits() & DependencyNode.MANAGED_VERSION ) == 0 )
        {
            return null;
        }
        return cast( node.getData().get( NODE_DATA_PREMANAGED_VERSION ), String.class );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DependencyManagerUtils.java`
#### Snippet
```java
    private static <T> T cast( Object obj, Class<T> type )
    {
        return type.isInstance( obj ) ? type.cast( obj ) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DependencyManagerUtils.java`
#### Snippet
```java
        if ( ( node.getManagedBits() & DependencyNode.MANAGED_EXCLUSIONS ) == 0 )
        {
            return null;
        }
        return cast( node.getData().get( NODE_DATA_PREMANAGED_EXCLUSIONS ), Collection.class );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DependencyManagerUtils.java`
#### Snippet
```java
        if ( ( node.getManagedBits() & DependencyNode.MANAGED_PROPERTIES ) == 0 )
        {
            return null;
        }
        return cast( node.getData().get( NODE_DATA_PREMANAGED_PROPERTIES ), Map.class );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/version/ContextualSnapshotVersionFilter.java`
#### Snippet
```java
            {
                // root is a snapshot, allow snapshots all the way down
                return null;
            }
        }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/version/ChainedVersionFilter.java`
#### Snippet
```java
            if ( filters.length <= 0 )
            {
                return null;
            }
            return filters[0];
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/version/ChainedVersionFilter.java`
#### Snippet
```java
            if ( filters.isEmpty() )
            {
                return null;
            }
            return filters.iterator().next();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/version/ChainedVersionFilter.java`
#### Snippet
```java
            if ( count <= 0 )
            {
                return null;
            }
            if ( count == 1 )
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/visitor/Stack.java`
#### Snippet
```java
        if ( size <= 0 )
        {
            return null;
        }
        return elements[size - 1];
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/bf/BfDependencyCollector.java`
#### Snippet
```java
                results.addException( context.dependency, e, context.parents );
                pool.putDescriptor( key, e );
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/bf/BfDependencyCollector.java`
#### Snippet
```java
        else if ( descriptorResult == DataPool.NO_DESCRIPTOR )
        {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/selector/AndDependencySelector.java`
#### Snippet
```java
            if ( childSelectors.isEmpty() )
            {
                return null;
            }
            return childSelectors.iterator().next();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/traverser/AndDependencyTraverser.java`
#### Snippet
```java
            if ( childTraversers.isEmpty() )
            {
                return null;
            }
            return childTraversers.iterator().next();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/JavaDependencyContextRefiner.java`
#### Snippet
```java
        if ( dependency == null )
        {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/JavaDependencyContextRefiner.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictResolver.java`
#### Snippet
```java
        {
            int size = parentNodes.size();
            return ( size <= 0 ) ? null : parentNodes.get( size - 1 );
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictResolver.java`
#### Snippet
```java
        private String scope( Dependency dependency )
        {
            return ( dependency != null ) ? dependency.getScope() : null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/DefaultProxySelector.java`
#### Snippet
```java
        }

        return ( proxy != null ) ? proxy.proxy : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/AuthenticationBuilder.java`
#### Snippet
```java
        if ( authentications.isEmpty() )
        {
            return null;
        }
        if ( authentications.size() == 1 )
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/JreProxySelector.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/SecretAuthentication.java`
#### Snippet
```java
    private static char[] copy( char[] chars )
    {
        return ( chars != null ) ? chars.clone() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/XChecksumChecksumExtractor.java`
#### Snippet
```java
    {
        Header header = response.getFirstHeader( name );
        return header != null ? header.getValue() : null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/XChecksumChecksumExtractor.java`
#### Snippet
```java
        }

        return result.isEmpty() ? null : result;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/DefaultMirrorSelector.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/DefaultMirrorSelector.java`
#### Snippet
```java
        if ( mirror == null )
        {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/SharingHttpContext.java`
#### Snippet
```java
        {
            state.setUserToken( null );
            return null;
        }
        return super.removeAttribute( id );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/LocalState.java`
#### Snippet
```java
            return pool.get();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/DeferredCredentialsProvider.java`
#### Snippet
```java
            if ( username == null )
            {
                return null;
            }
            String password = authContext.get( AuthenticationContext.PASSWORD );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/DeferredCredentialsProvider.java`
#### Snippet
```java
            if ( username == null )
            {
                return null;
            }
            String password = authContext.get( AuthenticationContext.PASSWORD );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/SslConfig.java`
#### Snippet
```java
        if ( value == null || value.isEmpty() )
        {
            return null;
        }
        return value.split( ",+" );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/Nexus2ChecksumExtractor.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/ChecksumUtils.java`
#### Snippet
```java
        if ( hexString == null )
        {
            return null;
        }
        if ( hexString.isEmpty() )
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/ChecksumUtils.java`
#### Snippet
```java
        if ( bytes == null )
        {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/df/DfDependencyCollector.java`
#### Snippet
```java
                results.addException( d, e, args.nodes.nodes );
                pool.putDescriptor( key, e );
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/df/DfDependencyCollector.java`
#### Snippet
```java
        else if ( descriptorResult == DataPool.NO_DESCRIPTOR )
        {
            return null;
        }

```

## RuleId[ruleID=ArrayEquality]
### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/selector/ExclusionDependencySelector.java`
#### Snippet
```java
            }
        }
        if ( merged == this.exclusions )
        {
            return this;
```

## RuleId[ruleID=AssignmentToLambdaParameter]
### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `v`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/NamedLockFactorySupport.java`
#### Snippet
```java
            if ( v == null )
            {
                v = new NamedLockHolder( createLock( k ) );
            }
            v.incRef();
```

## RuleId[ruleID=SynchronizeOnThis]
### RuleId[ruleID=SynchronizeOnThis]
Lock operations on a class may have unforeseen side-effects
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/GlobalState.java`
#### Snippet
```java
            else
            {
                synchronized ( GlobalState.class )
                {
                    tmp = repoCache.get( session, KEY );
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `maven-resolver-api/src/main/java/org/eclipse/aether/graph/Dependency.java`
#### Snippet
```java
                exclusions = new LinkedHashSet<>( exclusions );
            }
            this.exclusions = exclusions.toArray( new Exclusion[0] );
        }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/RemoteRepository.java`
#### Snippet
```java
            return Collections.emptyList();
        }
        return Collections.unmodifiableList( Arrays.asList( repos.toArray( new RemoteRepository[0] ) ) );
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/PrioritizedComponents.java`
#### Snippet
```java
              ConfigurationProperties.PREFIX_PRIORITY + sn.substring( 0, sn.length() - FACTORY_SUFFIX.length() ) );
        }
        return keys.toArray( new String[0] );
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/version/ChainedVersionFilter.java`
#### Snippet
```java
            return filters.iterator().next();
        }
        return new ChainedVersionFilter( filters.toArray( new VersionFilter[0] ) );
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ChainedDependencyGraphTransformer.java`
#### Snippet
```java
        if ( transformers == null )
        {
            this.transformers = new DependencyGraphTransformer[0];
        }
        else
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/selector/ExclusionDependencySelector.java`
#### Snippet
```java
            TreeSet<Exclusion> sorted = new TreeSet<>( ExclusionComparator.INSTANCE );
            sorted.addAll( exclusions );
            this.exclusions = sorted.toArray( new Exclusion[0] );
        }
        else
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/selector/ExclusionDependencySelector.java`
#### Snippet
```java
        else
        {
            this.exclusions = new Exclusion[0];
        }
    }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/selector/ExclusionDependencySelector.java`
#### Snippet
```java
    public ExclusionDependencySelector()
    {
        this.exclusions = new Exclusion[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/version/GenericVersion.java`
#### Snippet
```java
        trimPadding( items );

        return items.toArray( new Item[0] );
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/ChainedAuthentication.java`
#### Snippet
```java
        if ( authentications != null && !authentications.isEmpty() )
        {
            this.authentications = authentications.toArray( new Authentication[0] );
        }
        else
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/ChainedAuthentication.java`
#### Snippet
```java
        else
        {
            this.authentications = new Authentication[0];
        }
    }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/ChainedAuthentication.java`
#### Snippet
```java
        else
        {
            this.authentications = new Authentication[0];
        }
    }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/DefaultProxySelector.java`
#### Snippet
```java
                }
            }
            this.patterns = patterns.toArray( new Pattern[0] );
        }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/HttpTransporter.java`
#### Snippet
```java
            if ( entity == null )
            {
                entity = new ByteArrayEntity( new byte[0] );
            }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/ChecksumUtils.java`
#### Snippet
```java
        if ( hexString.isEmpty() )
        {
            return new byte[] {};
        }
        int len = hexString.length();
```

## RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:[\(\[][^\(\)\[\]]+[\)\]])`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";

    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";

    static final String NODE = COORDSX + "(?:\\s+" + PROPS + ")?" + "(?:\\s+" + SCOPE + ")?" + "(?:\\s+" + OPTIONAL
```

### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:[-_a-zA-Z0-9]+)`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";

    static final String NODE = COORDSX + "(?:\\s+" + PROPS + ")?" + "(?:\\s+" + SCOPE + ")?" + "(?:\\s+" + OPTIONAL
        + ")?" + "(?:\\s+" + RELOCATIONS + ")?" + "(?:\\s+" + ID + ")?";

```

### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:[-_a-zA-Z0-9]*)`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";

    static final String NODE = COORDSX + "(?:\\s+" + PROPS + ")?" + "(?:\\s+" + SCOPE + ")?" + "(?:\\s+" + OPTIONAL
        + ")?" + "(?:\\s+" + RELOCATIONS + ")?" + "(?:\\s+" + ID + ")?";

```

### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:[-_a-zA-Z0-9]+)`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String KEY_VAL = "(?:[-_a-zA-Z0-9]+)\\s*:\\s*(?:[-_a-zA-Z0-9]*)";

    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";

    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";
```

### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:[-_a-zA-Z0-9]*)`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String KEY_VAL = "(?:[-_a-zA-Z0-9]+)\\s*:\\s*(?:[-_a-zA-Z0-9]*)";

    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";

    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";
```

### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:[-_a-zA-Z0-9]+)`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String KEY_VAL = "(?:[-_a-zA-Z0-9]+)\\s*:\\s*(?:[-_a-zA-Z0-9]*)";

    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";

    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";
```

### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:[-_a-zA-Z0-9]*)`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String KEY_VAL = "(?:[-_a-zA-Z0-9]+)\\s*:\\s*(?:[-_a-zA-Z0-9]*)";

    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";

    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";
```

### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:[-_a-zA-Z0-9]+)`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String RELOCATIONS = "relocations\\s*=\\s*(" + COORDS_NC + "(?:\\s*,\\s*" + COORDS_NC + ")*)";

    static final String KEY_VAL = "(?:[-_a-zA-Z0-9]+)\\s*:\\s*(?:[-_a-zA-Z0-9]*)";

    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";
```

### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:[-_a-zA-Z0-9]*)`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String RELOCATIONS = "relocations\\s*=\\s*(" + COORDS_NC + "(?:\\s*,\\s*" + COORDS_NC + ")*)";

    static final String KEY_VAL = "(?:[-_a-zA-Z0-9]+)\\s*:\\s*(?:[-_a-zA-Z0-9]*)";

    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";
```

### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:\^([-_a-zA-Z0-9]+))`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
        + ")?" + "(?:\\s+" + RELOCATIONS + ")?" + "(?:\\s+" + ID + ")?";

    static final String LINE = "(?:" + IDREF + ")|(?:" + NODE + ")";

    private static final Pattern PATTERN = Pattern.compile( LINE );
```

### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:missingValue)`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
        + ")?" + "(?:\\s+" + RELOCATIONS + ")?" + "(?:\\s+" + ID + ")?";

    static final String LINE = "(?:" + IDREF + ")|(?:" + NODE + ")";

    private static final Pattern PATTERN = Pattern.compile( LINE );
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
Variable `canonDir` initializer `null` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileProcessor.java`
#### Snippet
```java
        }

        File canonDir = null;
        try
        {
```

### RuleId[ruleID=UnusedAssignment]
Variable `total` initializer `0` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileProcessor.java`
#### Snippet
```java
        throws IOException
    {
        long total = 0;

        InputStream fis = null;
```

### RuleId[ruleID=UnusedAssignment]
Variable `canonDir` initializer `null` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileUtils.java`
#### Snippet
```java
        }

        File canonDir = null;
        try
        {
```

### RuleId[ruleID=UnusedAssignment]
Variable `prefix` initializer `""` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java
{

    private String prefix = "";

    /**
```

### RuleId[ruleID=UnusedAssignment]
Variable `line` initializer `null` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java
        throws IOException
    {
        String line = null;

        State state = State.NONE;
```

### RuleId[ruleID=UnusedAssignment]
The value `null` assigned to `reader` is never used
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
                {
                    reader.close();
                    reader = null;
                }
            }
```

### RuleId[ruleID=UnusedAssignment]
Variable `line` initializer `null` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
        Iterator<String> substitutionIterator = ( substitutions != null ) ? substitutions.iterator() : null;

        String line = null;

        DependencyNode root = null;
```

### RuleId[ruleID=UnusedAssignment]
Variable `root` initializer `null` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java

        List<DependencyNode> ret = new ArrayList<>();
        DependencyNode root = null;
        while ( ( root = parse( reader ) ) != null )
        {
```

### RuleId[ruleID=UnusedAssignment]
Variable `retValue` initializer `null` is redundant
in `maven-resolver-transport-file/src/main/java/org/eclipse/aether/transport/file/PathUtils.java`
#### Snippet
```java
        String protocol = PathUtils.protocol( url );

        String retValue = null;

        if ( protocol.length() > 0 )
```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Condition `isOptional()` is always `false`
in `maven-resolver-api/src/main/java/org/eclipse/aether/graph/Dependency.java`
#### Snippet
```java
    public String toString()
    {
        return getArtifact() + " (" + getScope() + ( isOptional() ? "?" : "" ) + ")";
    }

```

### RuleId[ruleID=ConstantValue]
Condition `results != null` is always `true`
in `maven-resolver-api/src/main/java/org/eclipse/aether/resolution/ArtifactResolutionException.java`
#### Snippet
```java
    {
        super( message, getCause( results ) );
        this.results = ( results != null ) ? results : Collections.<ArtifactResult>emptyList();
    }

```

### RuleId[ruleID=ConstantValue]
Condition `results != null` is always `true`
in `maven-resolver-api/src/main/java/org/eclipse/aether/resolution/ArtifactResolutionException.java`
#### Snippet
```java
    {
        super( getMessage( results ), getCause( results ) );
        this.results = ( results != null ) ? results : Collections.<ArtifactResult>emptyList();
    }

```

### RuleId[ruleID=ConstantValue]
Condition `d.isOptional()` is always `false`
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/ConsoleDependencyGraphDumper.java`
#### Snippet
```java
        {
            buffer.append( " [" ).append( d.getScope() );
            if ( d.isOptional() )
            {
                buffer.append( ", optional" );
```

### RuleId[ruleID=ConstantValue]
Condition `version == null` is always `false` when reached
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestVersion.java`
#### Snippet
```java
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( version == null ) ? 0 : version.hashCode() );
        return result;
    }
```

### RuleId[ruleID=ConstantValue]
Condition `version == null` is always `false`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestVersion.java`
#### Snippet
```java
        }
        TestVersion other = (TestVersion) obj;
        if ( version == null )
        {
            if ( other.version != null )
```

### RuleId[ruleID=ConstantValue]
Condition `depth < 2 || !dependency.isOptional()` is always `true`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/selector/OptionalDependencySelector.java`
#### Snippet
```java
    {
        requireNonNull( dependency, "dependency cannot be null" );
        return depth < 2 || !dependency.isOptional();
    }

```

### RuleId[ruleID=ConstantValue]
Condition `!dependency.isOptional()` is always `true` when reached
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/selector/OptionalDependencySelector.java`
#### Snippet
```java
    {
        requireNonNull( dependency, "dependency cannot be null" );
        return depth < 2 || !dependency.isOptional();
    }

```

### RuleId[ruleID=ConstantValue]
Condition `( dep != null ) && dep.isOptional()` is always `false`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictResolver.java`
#### Snippet
```java
        {
            Dependency dep = node.getDependency();
            boolean optional = ( dep != null ) && dep.isOptional();
            if ( optional || ( node.getManagedBits() & DependencyNode.MANAGED_OPTIONAL ) != 0
                || ( conflictId != null && resolvedIds.containsKey( conflictId ) ) )
```

### RuleId[ruleID=ConstantValue]
Condition `dep.isOptional()` is always `false` when reached
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictResolver.java`
#### Snippet
```java
        {
            Dependency dep = node.getDependency();
            boolean optional = ( dep != null ) && dep.isOptional();
            if ( optional || ( node.getManagedBits() & DependencyNode.MANAGED_OPTIONAL ) != 0
                || ( conflictId != null && resolvedIds.containsKey( conflictId ) ) )
```

### RuleId[ruleID=ConstantValue]
Value `optional` is always 'false'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictResolver.java`
#### Snippet
```java
                || ( conflictId != null && resolvedIds.containsKey( conflictId ) ) )
            {
                return optional;
            }
            int depth = parentNodes.size();
```

### RuleId[ruleID=ConstantValue]
Value `parent` is always 'null'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictResolver.java`
#### Snippet
```java
            if ( parent == null )
            {
                ConflictItem item = newConflictItem( parent, node );
                items.add( item );
            }
```

