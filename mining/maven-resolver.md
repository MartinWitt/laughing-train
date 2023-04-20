# maven-resolver 
 
# Bad smells
I found 485 bad smells with 88 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 82 | false |
| SystemOutErr | 59 | false |
| SizeReplaceableByIsEmpty | 57 | true |
| BoundedWildcard | 38 | false |
| AssignmentToMethodParameter | 29 | false |
| UnnecessaryFullyQualifiedName | 26 | false |
| CatchMayIgnoreException | 25 | false |
| UtilityClassWithoutPrivateConstructor | 21 | true |
| DynamicRegexReplaceableByCompiledPattern | 15 | false |
| IgnoreResultOfCall | 14 | false |
| ZeroLengthArrayInitialization | 14 | false |
| DeprecatedIsStillUsed | 13 | false |
| RegExpUnnecessaryNonCapturingGroup | 11 | false |
| RegExpRedundantEscape | 10 | false |
| UnusedAssignment | 9 | false |
| NestedAssignment | 8 | false |
| DataFlowIssue | 7 | false |
| RedundantFieldInitialization | 6 | false |
| NonProtectedConstructorInAbstractClass | 5 | true |
| ConstantValue | 5 | false |
| UseOfPropertiesAsHashtable | 4 | false |
| ProtectedMemberInFinalClass | 2 | true |
| AbstractClassNeverImplemented | 2 | false |
| RedundantSuppression | 2 | false |
| NonStrictComparisonCanBeEquality | 2 | true |
| ConditionCoveredByFurtherCondition | 2 | false |
| EmptyMethod | 2 | false |
| IOResource | 1 | false |
| FieldMayBeStatic | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| RegExpRepeatedSpace | 1 | false |
| ExplicitArrayFilling | 1 | false |
| StringEqualsEmptyString | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| ArrayEquality | 1 | false |
| AssignmentToLambdaParameter | 1 | false |
| SynchronizeOnThis | 1 | false |
## RuleId[id=IOResource]
### IOResource
'PrintStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/resolver/Resolver.java`
#### Snippet
```java
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream(1024);
            PrintStream ps = new PrintStream(os, true, StandardCharsets.UTF_8.name());
            node.accept(new DependencyGraphDumper(ps::println));
            sb.append(os);
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `classifier` may be 'static'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeBuilder.java`
#### Snippet
```java
    private String ext = "jar";

    private final String classifier = "";

    private String scope = "compile";
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `UriUtils` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/UriUtils.java`
#### Snippet
```java
 * Helps to deal with URIs.
 */
final class UriUtils {

    public static URI resolve(URI base, URI ref) {
```

### UtilityClassWithoutPrivateConstructor
Class `InstallArtifacts` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/InstallArtifacts.java`
#### Snippet
```java
 * Installs a JAR and its POM to the local repository.
 */
public class InstallArtifacts {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `GetDirectDependencies` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDirectDependencies.java`
#### Snippet
```java
 * Determines the direct dependencies of an artifact as declared in its artifact descriptor (POM).
 */
public class GetDirectDependencies {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `GetDependencyHierarchy` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDependencyHierarchy.java`
#### Snippet
```java
 * Visualizes the transitive dependencies of an artifact similar to m2e's dependency hierarchy view.
 */
public class GetDependencyHierarchy {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ResolveArtifact` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ResolveArtifact.java`
#### Snippet
```java
 * Resolves a single artifact.
 */
public class ResolveArtifact {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `FindNewestVersion` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/FindNewestVersion.java`
#### Snippet
```java
 * Determines the newest version of an artifact.
 */
public class FindNewestVersion {
    /**
     * Main.
```

### UtilityClassWithoutPrivateConstructor
Class `FindAvailableVersions` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/FindAvailableVersions.java`
#### Snippet
```java
 * Determines all available versions of an artifact.
 */
public class FindAvailableVersions {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `AllResolverDemos` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/AllResolverDemos.java`
#### Snippet
```java
 * Runs all demos at once.
 */
public class AllResolverDemos {
    /**
     * Main
```

### UtilityClassWithoutPrivateConstructor
Class `DependencyHierarchyWithRanges` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/DependencyHierarchyWithRanges.java`
#### Snippet
```java
 * @see <a href="https://issues.apache.org/jira/browse/MRESOLVER-345">MRESOLVER-345</a>
 */
public class DependencyHierarchyWithRanges {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `GetDependencyTree` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDependencyTree.java`
#### Snippet
```java
 * Collects the transitive dependencies of an artifact.
 */
public class GetDependencyTree {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ResolveTransitiveDependencies` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ResolveTransitiveDependencies.java`
#### Snippet
```java
 * Resolves the transitive (compile) dependencies of an artifact.
 */
public class ResolveTransitiveDependencies {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `DeployArtifacts` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/DeployArtifacts.java`
#### Snippet
```java
 * Deploys a JAR and its POM to a remote repository.
 */
public class DeployArtifacts {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ReverseDependencyTree` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ReverseDependencyTree.java`
#### Snippet
```java
 * Example of building reverse dependency tree using custom {@link ReverseTreeRepositoryListener}.
 */
public class ReverseDependencyTree {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Booter` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/Booter.java`
#### Snippet
```java
 * A helper to boot the repository system and a repository system session.
 */
public class Booter {
    public static final String SERVICE_LOCATOR = "serviceLocator";

```

### UtilityClassWithoutPrivateConstructor
Class `ManualRepositorySystemFactory` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/manual/ManualRepositorySystemFactory.java`
#### Snippet
```java
 * infrastructure to wire up the system's components.
 */
public class ManualRepositorySystemFactory {
    private static final Logger LOGGER = LoggerFactory.getLogger(ManualRepositorySystemFactory.class);

```

### UtilityClassWithoutPrivateConstructor
Class `GuiceRepositorySystemFactory` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/guice/GuiceRepositorySystemFactory.java`
#### Snippet
```java
 * A factory for repository system instances that employs JSR-330 via Guice to wire up the system's components.
 */
public class GuiceRepositorySystemFactory {

    public static RepositorySystem newRepositorySystem() {
```

### UtilityClassWithoutPrivateConstructor
Class `TestNioLock` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/demo/TestNioLock.java`
#### Snippet
```java
 * </ul>
 */
public class TestNioLock {
    private static final int EC_WON = 10;

```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/Utils.java`
#### Snippet
```java
 * Internal utility methods.
 */
final class Utils {

    public static PrioritizedComponents<MetadataGeneratorFactory> sortMetadataGeneratorFactories(
```

### UtilityClassWithoutPrivateConstructor
Class `NameMappers` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/synccontext/named/NameMappers.java`
#### Snippet
```java
 * @since 1.9.4
 */
public final class NameMappers {
    public static final String STATIC_NAME = "static";

```

### UtilityClassWithoutPrivateConstructor
Class `DependencyManagerUtils` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DependencyManagerUtils.java`
#### Snippet
```java
 * A utility class assisting in analyzing the effects of dependency management.
 */
public final class DependencyManagerUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ExecutorUtils` has only 'static' members, and lacks a 'private' constructor
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/concurrency/ExecutorUtils.java`
#### Snippet
```java
 * @since 1.9.5
 */
public final class ExecutorUtils {
    /**
     * Shared instance of "direct executor".
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getMessage` may produce `NullPointerException`
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/ConsoleRepositoryListener.java`
#### Snippet
```java
        requireNonNull(event, "event cannot be null");
        out.println("Invalid artifact descriptor for " + event.getArtifact() + ": "
                + event.getException().getMessage());
    }

```

### DataFlowIssue
Method invocation `hasNext` may produce `NullPointerException`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java

            while (line.contains("%s")) {
                if (!substitutionIterator.hasNext()) {
                    throw new IllegalStateException("not enough substitutions to fill placeholders");
                }
```

### DataFlowIssue
Method invocation `getChildren` may produce `NullPointerException`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
                    throw new IllegalStateException("undefined reference " + reference);
                }
                node.getChildren().add(child);
            } else {

```

### DataFlowIssue
Method invocation `getScope` may produce `NullPointerException`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/visitor/DependencyGraphDumper.java`
#### Snippet
```java

        premanaged = DependencyManagerUtils.getPremanagedScope(node);
        if (premanaged != null && !premanaged.equals(d.getScope())) {
            buffer.append(" (scope managed from ").append(premanaged).append(")");
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictMarker.java`
#### Snippet
```java
                        }
                    } else if (g == null) {
                        fixMappings = true;
                    } else {
                        Set<Object> newKeys = merge(g.keys, group.keys);
```

### DataFlowIssue
Variable is already assigned to this value
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictMarker.java`
#### Snippet
```java
                        } else if (newKeys != group.keys) {
                            group = new ConflictGroup(newKeys, counter[0]++);
                            fixMappings = true;
                        }
                    }
```

### DataFlowIssue
Dereference of `nearest` may produce `NullPointerException`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictIdSorter.java`
#### Snippet
```java
            }

            nearest.inDegree = 0;
            roots.add(nearest);

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary empty string argument
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/synccontext/named/HashingNameMapper.java`
#### Snippet
```java
            return hashedName;
        }
        StringBuilder prefix = new StringBuilder("");
        int i = 0;
        while (i < hashedName.length() && i / 2 < depth) {
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'HttpTransporterFactory' is still used
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/HttpTransporterFactory.java`
#### Snippet
```java
     */
    @Deprecated
    public HttpTransporterFactory() {
        this(getManuallyCreatedExtractors());
    }
```

### DeprecatedIsStillUsed
Deprecated member 'DefaultServiceLocator' is still used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/impl/DefaultServiceLocator.java`
#### Snippet
```java
 */
@Deprecated
public final class DefaultServiceLocator implements ServiceLocator {

    private class Entry<T> {
```

### DeprecatedIsStillUsed
Deprecated member 'Slf4jLoggerFactory' is still used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/slf4j/Slf4jLoggerFactory.java`
#### Snippet
```java
@Named("slf4j")
@Deprecated
public class Slf4jLoggerFactory implements LoggerFactory, Service {

    private static final boolean AVAILABLE;
```

### DeprecatedIsStillUsed
Deprecated member 'DependencyCollectorDelegate' is still used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/DependencyCollectorDelegate.java`
#### Snippet
```java
     */
    @Deprecated
    protected DependencyCollectorDelegate() {
        // enables default constructor
    }
```

### DeprecatedIsStillUsed
Deprecated member 'BfDependencyCollector' is still used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/bf/BfDependencyCollector.java`
#### Snippet
```java
     */
    @Deprecated
    public BfDependencyCollector() {
        // enables default constructor
    }
```

### DeprecatedIsStillUsed
Deprecated member 'DefaultSyncContextFactory' is still used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/synccontext/legacy/DefaultSyncContextFactory.java`
#### Snippet
```java
@Named
@Deprecated
public final class DefaultSyncContextFactory implements org.eclipse.aether.impl.SyncContextFactory, Service {
    private SyncContextFactory delegate;

```

### DeprecatedIsStillUsed
Deprecated member 'Maven2RepositoryLayoutFactory' is still used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/Maven2RepositoryLayoutFactory.java`
#### Snippet
```java
     */
    @Deprecated
    public Maven2RepositoryLayoutFactory() {
        this(new DefaultChecksumAlgorithmFactorySelector());
    }
```

### DeprecatedIsStillUsed
Deprecated member 'FileTransformerManager' is still used
in `maven-resolver-api/src/main/java/org/eclipse/aether/transform/FileTransformerManager.java`
#### Snippet
```java
 */
@Deprecated
public interface FileTransformerManager {
    /**
     * <p>
```

### DeprecatedIsStillUsed
Deprecated member 'DfDependencyCollector' is still used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/df/DfDependencyCollector.java`
#### Snippet
```java
     */
    @Deprecated
    public DfDependencyCollector() {
        // enables default constructor
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getFileTransformerManager' is still used
in `maven-resolver-api/src/main/java/org/eclipse/aether/RepositorySystemSession.java`
#### Snippet
```java
     */
    @Deprecated
    FileTransformerManager getFileTransformerManager();
}

```

### DeprecatedIsStillUsed
Deprecated member 'StringUtils' is still used
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/StringUtils.java`
#### Snippet
```java
 */
@Deprecated
public final class StringUtils {

    private StringUtils() {
```

### DeprecatedIsStillUsed
Deprecated member 'calc' is still used
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/ChecksumUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static Map<String, Object> calc(byte[] dataBytes, Collection<String> algos) throws IOException {
        return calc(new ByteArrayInputStream(dataBytes), algos);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'calc' is still used
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/ChecksumUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static Map<String, Object> calc(File dataFile, Collection<String> algos) throws IOException {
        return calc(new FileInputStream(dataFile), algos);
    }
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\(` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    private static final String COORDS_NC = NodeDefinition.COORDS.replaceAll("\\((?=\\[)", "(?:");

    private static final String RANGE_NC = "[\\(\\[][^\\(\\)\\[\\]]+[\\)\\]]";

    static final String RANGE = "(" + RANGE_NC + ")";
```

### RegExpRedundantEscape
Redundant character escape `\\(` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    private static final String COORDS_NC = NodeDefinition.COORDS.replaceAll("\\((?=\\[)", "(?:");

    private static final String RANGE_NC = "[\\(\\[][^\\(\\)\\[\\]]+[\\)\\]]";

    static final String RANGE = "(" + RANGE_NC + ")";
```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    private static final String COORDS_NC = NodeDefinition.COORDS.replaceAll("\\((?=\\[)", "(?:");

    private static final String RANGE_NC = "[\\(\\[][^\\(\\)\\[\\]]+[\\)\\]]";

    static final String RANGE = "(" + RANGE_NC + ")";
```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    private static final String COORDS_NC = NodeDefinition.COORDS.replaceAll("\\((?=\\[)", "(?:");

    private static final String RANGE_NC = "[\\(\\[][^\\(\\)\\[\\]]+[\\)\\]]";

    static final String RANGE = "(" + RANGE_NC + ")";
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";

    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";

    static final String NODE = COORDSX + "(?:\\s+" + PROPS + ")?" + "(?:\\s+" + SCOPE + ")?" + "(?:\\s+" + OPTIONAL
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";

    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";

    static final String NODE = COORDSX + "(?:\\s+" + PROPS + ")?" + "(?:\\s+" + SCOPE + ")?" + "(?:\\s+" + OPTIONAL
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";

    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";

    static final String NODE = COORDSX + "(?:\\s+" + PROPS + ")?" + "(?:\\s+" + SCOPE + ")?" + "(?:\\s+" + OPTIONAL
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";

    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";

    static final String NODE = COORDSX + "(?:\\s+" + PROPS + ")?" + "(?:\\s+" + SCOPE + ")?" + "(?:\\s+" + OPTIONAL
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    private static final String RANGE_NC = "[\\(\\[][^\\(\\)\\[\\]]+[\\)\\]]";

    static final String RANGE = "(" + RANGE_NC + ")";

    static final String SCOPE = "(?:scope\\s*=\\s*)?((?!optional)[-_a-zA-Z0-9]+)(?:<([-_a-zA-Z0-9]+))?";
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    private static final String RANGE_NC = "[\\(\\[][^\\(\\)\\[\\]]+[\\)\\]]";

    static final String RANGE = "(" + RANGE_NC + ")";

    static final String SCOPE = "(?:scope\\s*=\\s*)?((?!optional)[-_a-zA-Z0-9]+)(?:<([-_a-zA-Z0-9]+))?";
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `versions` may be replaced with 'entrySet()' iteration
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/bf/BfDependencyCollector.java`
#### Snippet
```java

        Set<Version> versions = resolutionResult.descriptors.keySet();
        for (Version version : versions) {
            Artifact originalArtifact = dependency.getArtifact().setVersion(version.toString());
            Dependency d = dependency.setArtifact(originalArtifact);
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.artifactInstalling(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.metadataDeployed(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.metadataInstalled(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.metadataInstalling(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.metadataDownloaded(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.metadataResolving(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.artifactDownloaded(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.artifactDeploying(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.artifactDescriptorInvalid(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.metadataInvalid(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.artifactDownloading(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.artifactDescriptorMissing(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.metadataResolved(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.artifactResolving(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.metadataDeploying(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.artifactResolved(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.artifactInstalled(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.artifactDeployed(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java
            try {
                listener.metadataDownloading(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedTransferListener.java`
#### Snippet
```java
            try {
                listener.transferInitiated(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedTransferListener.java`
#### Snippet
```java
            try {
                listener.transferFailed(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedTransferListener.java`
#### Snippet
```java
            try {
                listener.transferSucceeded(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedTransferListener.java`
#### Snippet
```java
            try {
                listener.transferCorrupted(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedTransferListener.java`
#### Snippet
```java
            try {
                listener.transferProgressed(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

### CatchMayIgnoreException
Unexpected VM exception like 'java.lang.NullPointerException' might be ignored in a `catch` block
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedTransferListener.java`
#### Snippet
```java
            try {
                listener.transferStarted(event);
            } catch (RuntimeException e) {
                handleError(event, listener, e);
            }
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedRepositoryListener.java`
#### Snippet
```java

    @SuppressWarnings("EmptyMethod")
    protected void handleError(RepositoryEvent event, RepositoryListener listener, RuntimeException error) {
        // default just swallows errors
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/listener/ChainedTransferListener.java`
#### Snippet
```java

    @SuppressWarnings("EmptyMethod")
    protected void handleError(TransferEvent event, TransferListener listener, RuntimeException error) {
        // default just swallows errors
    }
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`path.length() > 0` can be replaced with '!path.isEmpty()'
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/UriUtils.java`
#### Snippet
```java
    public static URI resolve(URI base, URI ref) {
        String path = ref.getRawPath();
        if (path != null && path.length() > 0) {
            path = base.getRawPath();
            if (path == null || !path.endsWith("/")) {
```

### SizeReplaceableByIsEmpty
`protocol.length() > 0` can be replaced with '!protocol.isEmpty()'
in `maven-resolver-transport-file/src/main/java/org/eclipse/aether/transport/file/PathUtils.java`
#### Snippet
```java
        String retValue = null;

        if (protocol.length() > 0) {
            retValue = url.substring(protocol.length() + 1);
        } else {
```

### SizeReplaceableByIsEmpty
`base.length() > 0` can be replaced with '!base.isEmpty()'
in `maven-resolver-transport-classpath/src/main/java/org/eclipse/aether/transport/classpath/ClasspathTransporter.java`
#### Snippet
```java
                base = ssp;
            }
            if (base.length() > 0 && !base.endsWith("/")) {
                base += '/';
            }
```

### SizeReplaceableByIsEmpty
`protocol.length() > 0` can be replaced with '!protocol.isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultOfflineController.java`
#### Snippet
```java
        if (protocols != null) {
            String protocol = repository.getProtocol();
            if (protocol.length() > 0) {
                for (String p : protocols) {
                    if (p.equalsIgnoreCase(protocol)) {
```

### SizeReplaceableByIsEmpty
`host.length() > 0` can be replaced with '!host.isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultOfflineController.java`
#### Snippet
```java
        if (hosts != null) {
            String host = repository.getHost();
            if (host.length() > 0) {
                for (String h : hosts) {
                    if (h.equalsIgnoreCase(host)) {
```

### SizeReplaceableByIsEmpty
`metadata.getGroupId().length() > 0` can be replaced with '!metadata.getGroupId().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultLocalPathComposer.java`
#### Snippet
```java
        StringBuilder path = new StringBuilder(128);

        if (metadata.getGroupId().length() > 0) {
            path.append(metadata.getGroupId().replace('.', '/')).append('/');

```

### SizeReplaceableByIsEmpty
`metadata.getArtifactId().length() > 0` can be replaced with '!metadata.getArtifactId().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultLocalPathComposer.java`
#### Snippet
```java
            path.append(metadata.getGroupId().replace('.', '/')).append('/');

            if (metadata.getArtifactId().length() > 0) {
                path.append(metadata.getArtifactId()).append('/');

```

### SizeReplaceableByIsEmpty
`metadata.getVersion().length() > 0` can be replaced with '!metadata.getVersion().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultLocalPathComposer.java`
#### Snippet
```java
                path.append(metadata.getArtifactId()).append('/');

                if (metadata.getVersion().length() > 0) {
                    path.append(metadata.getVersion()).append('/');
                }
```

### SizeReplaceableByIsEmpty
`artifact.getClassifier().length() > 0` can be replaced with '!artifact.getClassifier().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultLocalPathComposer.java`
#### Snippet
```java
        }

        if (artifact.getClassifier().length() > 0) {
            path.append('-').append(artifact.getClassifier());
        }
```

### SizeReplaceableByIsEmpty
`artifact.getExtension().length() > 0` can be replaced with '!artifact.getExtension().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultLocalPathComposer.java`
#### Snippet
```java
        }

        if (artifact.getExtension().length() > 0) {
            path.append('.').append(artifact.getExtension());
        }
```

### SizeReplaceableByIsEmpty
`url.length() > 0` can be replaced with '!url.isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultUpdateCheckManager.java`
#### Snippet
```java
    private String normalizeRepoUrl(String url) {
        String result = url;
        if (url != null && url.length() > 0 && !url.endsWith("/")) {
            result = url + '/';
        }
```

### SizeReplaceableByIsEmpty
`value.length() > 0` can be replaced with '!value.isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultUpdateCheckManager.java`
#### Snippet
```java
        String value = props.getProperty(key + UPDATED_KEY_SUFFIX, "");
        try {
            return (value.length() > 0) ? Long.parseLong(value) : 1;
        } catch (NumberFormatException e) {
            LOGGER.debug("Cannot parse last updated date {}, ignoring it", value, e);
```

### SizeReplaceableByIsEmpty
`getClassifier().length() > 0` can be replaced with '!getClassifier().isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/graph/Exclusion.java`
#### Snippet
```java
                + ':'
                + getExtension()
                + (getClassifier().length() > 0 ? ':' + getClassifier() : "");
    }

```

### SizeReplaceableByIsEmpty
`id.length() == 0` can be replaced with 'id.isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/artifact/DefaultArtifactType.java`
#### Snippet
```java
            boolean includesDependencies) {
        this.id = requireNonNull(id, "type id cannot be null");
        if (id.length() == 0) {
            throw new IllegalArgumentException("type id cannot be empty");
        }
```

### SizeReplaceableByIsEmpty
`language.length() > 0` can be replaced with '!language.isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/artifact/DefaultArtifactType.java`
#### Snippet
```java
        Map<String, String> props = new HashMap<>();
        props.put(ArtifactProperties.TYPE, id);
        props.put(ArtifactProperties.LANGUAGE, (language != null && language.length() > 0) ? language : "none");
        props.put(ArtifactProperties.INCLUDES_DEPENDENCIES, Boolean.toString(includesDependencies));
        props.put(ArtifactProperties.CONSTITUTES_BUILD_PATH, Boolean.toString(constitutesBuildPath));
```

### SizeReplaceableByIsEmpty
`id.length() == 0` can be replaced with 'id.isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/artifact/DefaultArtifactType.java`
#### Snippet
```java
    public DefaultArtifactType(String id, String extension, String classifier, Map<String, String> properties) {
        this.id = requireNonNull(id, "type id cannot be null");
        if (id.length() == 0) {
            throw new IllegalArgumentException("type id cannot be empty");
        }
```

### SizeReplaceableByIsEmpty
`getGroupId().length() > 0` can be replaced with '!getGroupId().isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/metadata/AbstractMetadata.java`
#### Snippet
```java
    public String toString() {
        StringBuilder buffer = new StringBuilder(128);
        if (getGroupId().length() > 0) {
            buffer.append(getGroupId());
        }
```

### SizeReplaceableByIsEmpty
`getArtifactId().length() > 0` can be replaced with '!getArtifactId().isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/metadata/AbstractMetadata.java`
#### Snippet
```java
            buffer.append(getGroupId());
        }
        if (getArtifactId().length() > 0) {
            buffer.append(':').append(getArtifactId());
        }
```

### SizeReplaceableByIsEmpty
`getVersion().length() > 0` can be replaced with '!getVersion().isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/metadata/AbstractMetadata.java`
#### Snippet
```java
            buffer.append(':').append(getArtifactId());
        }
        if (getVersion().length() > 0) {
            buffer.append(':').append(getVersion());
        }
```

### SizeReplaceableByIsEmpty
`getClassifier().length() > 0` can be replaced with '!getClassifier().isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/artifact/AbstractArtifact.java`
#### Snippet
```java
        buffer.append(':').append(getArtifactId());
        buffer.append(':').append(getExtension());
        if (getClassifier().length() > 0) {
            buffer.append(':').append(getClassifier());
        }
```

### SizeReplaceableByIsEmpty
`artifact.getClassifier().length() > 0` can be replaced with '!artifact.getClassifier().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/Maven2RepositoryLayoutFactory.java`
#### Snippet
```java
            path.append(artifact.getArtifactId()).append('-').append(artifact.getVersion());

            if (artifact.getClassifier().length() > 0) {
                path.append('-').append(artifact.getClassifier());
            }
```

### SizeReplaceableByIsEmpty
`artifact.getExtension().length() > 0` can be replaced with '!artifact.getExtension().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/Maven2RepositoryLayoutFactory.java`
#### Snippet
```java
            }

            if (artifact.getExtension().length() > 0) {
                path.append('.').append(artifact.getExtension());
            }
```

### SizeReplaceableByIsEmpty
`metadata.getGroupId().length() > 0` can be replaced with '!metadata.getGroupId().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/Maven2RepositoryLayoutFactory.java`
#### Snippet
```java
            StringBuilder path = new StringBuilder(128);

            if (metadata.getGroupId().length() > 0) {
                path.append(metadata.getGroupId().replace('.', '/')).append('/');

```

### SizeReplaceableByIsEmpty
`metadata.getArtifactId().length() > 0` can be replaced with '!metadata.getArtifactId().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/Maven2RepositoryLayoutFactory.java`
#### Snippet
```java
                path.append(metadata.getGroupId().replace('.', '/')).append('/');

                if (metadata.getArtifactId().length() > 0) {
                    path.append(metadata.getArtifactId()).append('/');

```

### SizeReplaceableByIsEmpty
`metadata.getVersion().length() > 0` can be replaced with '!metadata.getVersion().isEmpty()'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/Maven2RepositoryLayoutFactory.java`
#### Snippet
```java
                    path.append(metadata.getArtifactId()).append('/');

                    if (metadata.getVersion().length() > 0) {
                        path.append(metadata.getVersion()).append('/');
                    }
```

### SizeReplaceableByIsEmpty
`artifact.getClassifier().length() > 0` can be replaced with '!artifact.getClassifier().isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/collection/UnsolvableVersionConflictException.java`
#### Snippet
```java
            buffer.append(':').append(artifact.getArtifactId());
            buffer.append(':').append(artifact.getExtension());
            if (artifact.getClassifier().length() > 0) {
                buffer.append(':').append(artifact.getClassifier());
            }
```

### SizeReplaceableByIsEmpty
`key.length() == 0` can be replaced with 'key.isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/AuthenticationContext.java`
#### Snippet
```java
    public <T> T get(String key, Map<String, String> data, Class<T> type) {
        requireNonNull(key, "authentication key cannot be null");
        if (key.length() == 0) {
            throw new IllegalArgumentException("authentication key cannot be empty");
        }
```

### SizeReplaceableByIsEmpty
`key.length() == 0` can be replaced with 'key.isEmpty()'
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/AuthenticationContext.java`
#### Snippet
```java
    public void put(String key, Object value) {
        requireNonNull(key, "authentication key cannot be null");
        if (key.length() == 0) {
            throw new IllegalArgumentException("authentication key cannot be empty");
        }
```

### SizeReplaceableByIsEmpty
`process.length() > 0` can be replaced with '!process.isEmpty()'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestVersionScheme.java`
#### Snippet
```java
            process = process.substring(index + 1).trim();

            if (process.length() > 0 && process.startsWith(",")) {
                process = process.substring(1).trim();
            }
```

### SizeReplaceableByIsEmpty
`process.length() > 0` can be replaced with '!process.isEmpty()'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestVersionScheme.java`
#### Snippet
```java
        }

        if (process.length() > 0 && !ranges.isEmpty()) {
            throw new InvalidVersionSpecificationException(
                    constraint, "Invalid version range " + constraint + ", expected [ or ( but got " + process);
```

### SizeReplaceableByIsEmpty
`artifactId.length() > 0` can be replaced with '!artifactId.isEmpty()'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeBuilder.java`
#### Snippet
```java
    public DependencyNode build() {
        Dependency dependency = null;
        if (artifactId != null && artifactId.length() > 0) {
            Artifact artifact =
                    new DefaultArtifact(groupId, artifactId, classifier, ext, version, properties, (File) null);
```

### SizeReplaceableByIsEmpty
`artifactId.length() > 0` can be replaced with '!artifactId.isEmpty()'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeBuilder.java`
#### Snippet
```java
        }
        DefaultDependencyNode node = new DefaultDependencyNode(dependency);
        if (artifactId != null && artifactId.length() > 0) {
            try {
                node.setVersion(versionScheme.parseVersion(version));
```

### SizeReplaceableByIsEmpty
`parsedLowerBound.length() > 0` can be replaced with '!parsedLowerBound.isEmpty()'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestVersionRange.java`
#### Snippet
```java
            }

            lowerBound = parsedLowerBound.length() > 0 ? new TestVersion(parsedLowerBound) : null;
            upperBound = parsedUpperBound.length() > 0 ? new TestVersion(parsedUpperBound) : null;

```

### SizeReplaceableByIsEmpty
`parsedUpperBound.length() > 0` can be replaced with '!parsedUpperBound.isEmpty()'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestVersionRange.java`
#### Snippet
```java

            lowerBound = parsedLowerBound.length() > 0 ? new TestVersion(parsedLowerBound) : null;
            upperBound = parsedUpperBound.length() > 0 ? new TestVersion(parsedUpperBound) : null;

            if (upperBound != null && lowerBound != null) {
```

### SizeReplaceableByIsEmpty
`line.length() == 0` can be replaced with 'line.isEmpty()'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java

    private static boolean isEmpty(String line) {
        return line == null || line.length() == 0;
    }

```

### SizeReplaceableByIsEmpty
`line.length() == 0` can be replaced with 'line.isEmpty()'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java

    private static boolean isEmpty(String line) {
        return line == null || line.length() == 0;
    }

```

### SizeReplaceableByIsEmpty
`d.getScope().length() > 0` can be replaced with '!d.getScope().isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/visitor/DependencyGraphDumper.java`
#### Snippet
```java
        Dependency d = node.getDependency();
        buffer.append(a);
        if (d != null && d.getScope().length() > 0) {
            buffer.append(" [").append(d.getScope());
            if (d.isOptional()) {
```

### SizeReplaceableByIsEmpty
`token.length() > 0` can be replaced with '!token.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/filter/DependencyFilterUtils.java`
#### Snippet
```java
                for (String token : tokens) {
                    token = token.trim();
                    if (token.length() > 0) {
                        types.add(token);
                    }
```

### SizeReplaceableByIsEmpty
`pattern.length() == 0` can be replaced with 'pattern.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/filter/AbstractPatternDependencyFilter.java`
#### Snippet
```java

        // support full wildcard and implied wildcard
        if ("*".equals(pattern) || pattern.length() == 0) {
            matches = true;
        }
```

### SizeReplaceableByIsEmpty
`process.length() > 0` can be replaced with '!process.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/version/GenericVersionScheme.java`
#### Snippet
```java
        }

        if (process.length() > 0 && !ranges.isEmpty()) {
            throw new InvalidVersionSpecificationException(
                    constraint, "Invalid version range " + constraint + ", expected [ or ( but got " + process);
```

### SizeReplaceableByIsEmpty
`parsedLowerBound.length() > 0` can be replaced with '!parsedLowerBound.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/version/GenericVersionRange.java`
#### Snippet
```java
            }

            lowerBound = parsedLowerBound.length() > 0 ? parse(parsedLowerBound) : null;
            upperBound = parsedUpperBound.length() > 0 ? parse(parsedUpperBound) : null;

```

### SizeReplaceableByIsEmpty
`parsedUpperBound.length() > 0` can be replaced with '!parsedUpperBound.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/version/GenericVersionRange.java`
#### Snippet
```java

            lowerBound = parsedLowerBound.length() > 0 ? parse(parsedLowerBound) : null;
            upperBound = parsedUpperBound.length() > 0 ? parse(parsedUpperBound) : null;

            if (upperBound != null && lowerBound != null) {
```

### SizeReplaceableByIsEmpty
`classifier.length() > 0` can be replaced with '!classifier.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/artifact/ArtifactIdUtils.java`
#### Snippet
```java
            buffer.append(extension);
        }
        if (classifier != null && classifier.length() > 0) {
            buffer.append(SEP).append(classifier);
        }
```

### SizeReplaceableByIsEmpty
`version.length() > 0` can be replaced with '!version.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/version/GenericVersion.java`
#### Snippet
```java

        Tokenizer(String version) {
            this.version = (version.length() > 0) ? version : "0";
            this.versionLength = this.version.length();
        }
```

### SizeReplaceableByIsEmpty
`version.length() > 0` can be replaced with '!version.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DefaultDependencyManager.java`
#### Snippet
```java

            String version = artifact.getVersion();
            if (version.length() > 0 && !versions.containsKey(key)) {
                if (versions == this.managedVersions) {
                    versions = new HashMap<>(this.managedVersions);
```

### SizeReplaceableByIsEmpty
`scope.length() > 0` can be replaced with '!scope.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DefaultDependencyManager.java`
#### Snippet
```java

            String scope = managedDependency.getScope();
            if (scope.length() > 0 && !scopes.containsKey(key)) {
                if (scopes == this.managedScopes) {
                    scopes = new HashMap<>(this.managedScopes);
```

### SizeReplaceableByIsEmpty
`line.length() > 0` can be replaced with '!line.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/ChecksumUtils.java`
#### Snippet
```java
                }
                line = line.trim();
                if (line.length() > 0) {
                    checksum = line;
                    break;
```

### SizeReplaceableByIsEmpty
`version.length() > 0` can be replaced with '!version.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/TransitiveDependencyManager.java`
#### Snippet
```java

            String version = artifact.getVersion();
            if (version.length() > 0 && !versions.containsKey(key)) {
                if (versions == managedVersions) {
                    versions = new HashMap<>(managedVersions);
```

### SizeReplaceableByIsEmpty
`scope.length() > 0` can be replaced with '!scope.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/TransitiveDependencyManager.java`
#### Snippet
```java

            String scope = managedDependency.getScope();
            if (scope.length() > 0 && !scopes.containsKey(key)) {
                if (scopes == this.managedScopes) {
                    scopes = new HashMap<>(this.managedScopes);
```

### SizeReplaceableByIsEmpty
`key.length() == 0` can be replaced with 'key.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/StringAuthentication.java`
#### Snippet
```java
    StringAuthentication(String key, String value) {
        this.key = requireNonNull(key, "authentication key cannot be null");
        if (key.length() == 0) {
            throw new IllegalArgumentException("authentication key cannot be empty");
        }
```

### SizeReplaceableByIsEmpty
`key.length() == 0` can be replaced with 'key.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/ComponentAuthentication.java`
#### Snippet
```java
    ComponentAuthentication(String key, Object value) {
        this.key = requireNonNull(key, "authentication key cannot be null");
        if (key.length() == 0) {
            throw new IllegalArgumentException("authentication key cannot be empty");
        }
```

### SizeReplaceableByIsEmpty
`key.length() == 0` can be replaced with 'key.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/SecretAuthentication.java`
#### Snippet
```java
    private SecretAuthentication(char[] value, String key) {
        this.key = requireNonNull(key, "authentication key cannot be null");
        if (key.length() == 0) {
            throw new IllegalArgumentException("authentication key cannot be empty");
        }
```

### SizeReplaceableByIsEmpty
`namePrefix.length() > 0` can be replaced with '!namePrefix.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/concurrency/WorkerThreadFactory.java`
#### Snippet
```java
        this.factory = Executors.defaultThreadFactory();
        this.namePrefix =
                ((namePrefix != null && namePrefix.length() > 0) ? namePrefix : getCallerSimpleClassName() + '-')
                        + POOL_INDEX.getAndIncrement()
                        + '-';
```

### SizeReplaceableByIsEmpty
`mirror.type.length() > 0` can be replaced with '!mirror.type.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/DefaultMirrorSelector.java`
#### Snippet
```java
        builder.setBlocked(mirror.blocked);

        if (mirror.type != null && mirror.type.length() > 0) {
            builder.setContentType(mirror.type);
        }
```

### SizeReplaceableByIsEmpty
`value.length() > 0` can be replaced with '!value.isEmpty()'
in `maven-resolver-spi/src/main/java/org/eclipse/aether/spi/connector/transport/GetTask.java`
#### Snippet
```java
                checksums = new HashMap<>();
            }
            if (value != null && value.length() > 0) {
                checksums.put(algorithm, value);
            } else {
```

### SizeReplaceableByIsEmpty
`version.length() > 0` can be replaced with '!version.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/ClassicDependencyManager.java`
#### Snippet
```java

            String version = artifact.getVersion();
            if (version.length() > 0 && !managedVersions.containsKey(key)) {
                if (managedVersions == this.managedVersions) {
                    managedVersions = new HashMap<>(this.managedVersions);
```

### SizeReplaceableByIsEmpty
`scope.length() > 0` can be replaced with '!scope.isEmpty()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/ClassicDependencyManager.java`
#### Snippet
```java

            String scope = managedDependency.getScope();
            if (scope.length() > 0 && !managedScopes.containsKey(key)) {
                if (managedScopes == this.managedScopes) {
                    managedScopes = new HashMap<>(this.managedScopes);
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/RepositoryPolicy.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder(256);
        buffer.append("enabled=").append(isEnabled());
        buffer.append(", checksums=").append(getChecksumPolicy());
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `NodeEntry` may be 'static'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
    }

    class NodeEntry {
        int level;

```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AbstractForwardingRepositorySystemSession` has no concrete subclass
in `maven-resolver-api/src/main/java/org/eclipse/aether/AbstractForwardingRepositorySystemSession.java`
#### Snippet
```java
 * create a subclass and implement {@link #getSession()}, and optionally override other methods.
 */
public abstract class AbstractForwardingRepositorySystemSession implements RepositorySystemSession {

    /**
```

### AbstractClassNeverImplemented
Abstract class `DelegatingArtifact` has no concrete subclass
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/artifact/DelegatingArtifact.java`
#### Snippet
```java
 * carry additional data fields.
 */
public abstract class DelegatingArtifact extends AbstractArtifact {

    private final Artifact delegate;
```

## RuleId[id=RegExpRepeatedSpace]
### RegExpRepeatedSpace
2 consecutive spaces in RegExp
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/SummaryFileTrustedChecksumsSource.java`
#### Snippet
```java
                while ((line = reader.readLine()) != null) {
                    if (!line.startsWith("#") && !line.isEmpty()) {
                        String[] parts = line.split("  ", 2);
                        if (parts.length == 2) {
                            String newChecksum = parts[0];
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super T`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/impl/DefaultServiceLocator.java`
#### Snippet
```java
     * @return This locator for chaining, never {@code null}.
     */
    public <T> DefaultServiceLocator setServices(Class<T> type, T... services) {
        getEntry(type, true).setServices(services);
        return this;
```

### BoundedWildcard
Can generalize to `? super MetadataUpload`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultDeployer.java`
#### Snippet
```java

    private void upload(
            Collection<MetadataUpload> metadataUploads,
            RepositorySystemSession session,
            Metadata metadata,
```

### BoundedWildcard
Can generalize to `? extends Metadata`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultUpdateCheckManager.java`
#### Snippet
```java
    }

    public void checkMetadata(RepositorySystemSession session, UpdateCheck<Metadata, MetadataTransferException> check) {
        requireNonNull(session, "session cannot be null");
        requireNonNull(check, "check cannot be null");
```

### BoundedWildcard
Can generalize to `? super MetadataTransferException`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultUpdateCheckManager.java`
#### Snippet
```java
    }

    public void checkMetadata(RepositorySystemSession session, UpdateCheck<Metadata, MetadataTransferException> check) {
        requireNonNull(session, "session cannot be null");
        requireNonNull(check, "check cannot be null");
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultUpdateCheckManager.java`
#### Snippet
```java
    }

    public void checkArtifact(RepositorySystemSession session, UpdateCheck<Artifact, ArtifactTransferException> check) {
        requireNonNull(session, "session cannot be null");
        requireNonNull(check, "check cannot be null");
```

### BoundedWildcard
Can generalize to `? super ArtifactTransferException`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultUpdateCheckManager.java`
#### Snippet
```java
    }

    public void checkArtifact(RepositorySystemSession session, UpdateCheck<Artifact, ArtifactTransferException> check) {
        requireNonNull(session, "session cannot be null");
        requireNonNull(check, "check cannot be null");
```

### BoundedWildcard
Can generalize to `? extends DependencyNode`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/DefaultDependencyCycle.java`
#### Snippet
```java
     * there is no such node.
     */
    public static int find(List<DependencyNode> nodes, Artifact artifact) {

        for (int i = nodes.size() - 1; i >= 0; i--) {
```

### BoundedWildcard
Can generalize to `? extends Metadata`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultMetadataResolver.java`
#### Snippet
```java
            SyncContext shared,
            SyncContext exclusive,
            Collection<Metadata> subjects,
            RepositorySystemSession session,
            Collection<? extends MetadataRequest> requests) {
```

### BoundedWildcard
Can generalize to `? extends DependencyNode`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/bf/DependencyResolutionSkipper.java`
#### Snippet
```java
            }

            boolean isLeftmost(DependencyNode node, List<DependencyNode> parents) {
                Coordinate leftmost = leftmostCoordinates.get(node.getArtifact());
                if (leftmost != null && leftmost.depth <= parents.size()) {
```

### BoundedWildcard
Can generalize to `? extends ChecksumAlgorithmFactory`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/SparseDirectoryTrustedChecksumsSource.java`
#### Snippet
```java
                Artifact artifact,
                ArtifactRepository artifactRepository,
                List<ChecksumAlgorithmFactory> checksumAlgorithmFactories,
                Map<String, String> trustedArtifactChecksums)
                throws IOException {
```

### BoundedWildcard
Can generalize to `? extends ChecksumAlgorithmFactory`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/SparseDirectoryTrustedChecksumsSource.java`
#### Snippet
```java
            Artifact artifact,
            ArtifactRepository artifactRepository,
            List<ChecksumAlgorithmFactory> checksumAlgorithmFactories) {
        final boolean originAware = isOriginAware(session);
        final HashMap<String, String> checksums = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? super Path`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/SummaryFileTrustedChecksumsSource.java`
#### Snippet
```java

        private SummaryFileWriter(
                ConcurrentHashMap<Path, ConcurrentHashMap<String, String>> cache, Path basedir, boolean originAware) {
            this.cache = cache;
            this.basedir = basedir;
```

### BoundedWildcard
Can generalize to `? extends ChecksumAlgorithmFactory`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/SummaryFileTrustedChecksumsSource.java`
#### Snippet
```java
                Artifact artifact,
                ArtifactRepository artifactRepository,
                List<ChecksumAlgorithmFactory> checksumAlgorithmFactories,
                Map<String, String> trustedArtifactChecksums) {
            String artifactPath = localPathComposer.getPathForArtifact(artifact, false);
```

### BoundedWildcard
Can generalize to `? extends ChecksumAlgorithmFactory`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/SummaryFileTrustedChecksumsSource.java`
#### Snippet
```java
            Artifact artifact,
            ArtifactRepository artifactRepository,
            List<ChecksumAlgorithmFactory> checksumAlgorithmFactories) {
        final HashMap<String, String> result = new HashMap<>();
        final Path basedir = getBasedir(session, false);
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/DependencyCollectorDelegate.java`
#### Snippet
```java
    @SuppressWarnings("checkstyle:parameternumber")
    protected static DefaultDependencyNode createDependencyNode(
            List<Artifact> relocations,
            PremanagedDependency preManaged,
            VersionRangeResult rangeResult,
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/DependencyCollectorDelegate.java`
#### Snippet
```java
            Version version,
            Dependency d,
            Collection<Artifact> aliases,
            List<RemoteRepository> repos,
            String requestContext) {
```

### BoundedWildcard
Can generalize to `? extends DependencyNode`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/DependencyCollectorDelegate.java`
#### Snippet
```java
        }

        public void addException(Dependency dependency, Exception e, List<DependencyNode> nodes) {
            if (maxExceptions < 0 || result.getExceptions().size() < maxExceptions) {
                result.addException(e);
```

### BoundedWildcard
Can generalize to `? extends R`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/Retry.java`
#### Snippet
```java
            final int attempts,
            final long sleepMillis,
            final Callable<R> operation,
            final Predicate<Exception> retryPredicate,
            final R defaultResult)
```

### BoundedWildcard
Can generalize to `? super Exception`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/Retry.java`
#### Snippet
```java
            final long sleepMillis,
            final Callable<R> operation,
            final Predicate<Exception> retryPredicate,
            final R defaultResult)
            throws InterruptedException {
```

### BoundedWildcard
Can generalize to `? extends R`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/Retry.java`
#### Snippet
```java
            final TimeUnit unit,
            final long sleepMillis,
            final Callable<R> operation,
            final Predicate<Exception> retryPredicate,
            final R defaultResult)
```

### BoundedWildcard
Can generalize to `? super Exception`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/Retry.java`
#### Snippet
```java
            final long sleepMillis,
            final Callable<R> operation,
            final Predicate<Exception> retryPredicate,
            final R defaultResult)
            throws InterruptedException {
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultArtifactResolver.java`
#### Snippet
```java
            SyncContext shared,
            SyncContext exclusive,
            Collection<Artifact> subjects,
            RepositorySystemSession session,
            Collection<? extends ArtifactRequest> requests)
```

### BoundedWildcard
Can generalize to `? extends T`
in `maven-resolver-api/src/main/java/org/eclipse/aether/DefaultRepositorySystemSession.java`
#### Snippet
```java

    @SuppressWarnings("checkstyle:magicnumber")
    private <T> Map<String, T> copySafe(Map<?, ?> table, Class<T> valueType) {
        Map<String, T> map;
        if (table == null || table.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? super File`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileUtils.java`
#### Snippet
```java
    }

    private static void delete(File file, Collection<File> undeletables) {
        String[] children = file.list();
        if (children != null) {
```

### BoundedWildcard
Can generalize to `? super NodeEntry`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
    }

    private void addNode(DependencyNode root, int level, List<NodeEntry> entries) {

        NodeEntry entry = new NodeEntry();
```

### BoundedWildcard
Can generalize to `? extends DependencySelector`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/selector/AndDependencySelector.java`
#### Snippet
```java
    }

    private AndDependencySelector(Set<DependencySelector> selectors) {
        if (selectors != null && !selectors.isEmpty()) {
            this.selectors = selectors;
```

### BoundedWildcard
Can generalize to `? extends DependencyTraverser`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/traverser/AndDependencyTraverser.java`
#### Snippet
```java
    }

    private AndDependencyTraverser(Set<DependencyTraverser> traversers) {
        if (traversers != null && !traversers.isEmpty()) {
            this.traversers = traversers;
```

### BoundedWildcard
Can generalize to `? extends DependencyFilter`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/filter/AndDependencyFilter.java`
#### Snippet
```java
     * @param filters The filters to combine, may be {@code null} but must not contain {@code null} elements.
     */
    public AndDependencyFilter(Collection<DependencyFilter> filters) {
        if (filters != null) {
            this.filters.addAll(filters);
```

### BoundedWildcard
Can generalize to `? extends DependencyFilter`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/filter/OrDependencyFilter.java`
#### Snippet
```java
     * @param filters The filters to combine, may be {@code null}.
     */
    public OrDependencyFilter(Collection<DependencyFilter> filters) {
        if (filters != null) {
            this.filters.addAll(filters);
```

### BoundedWildcard
Can generalize to `? extends DependencyNode`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictMarker.java`
#### Snippet
```java
    }

    private Map<DependencyNode, Object> mark(Collection<DependencyNode> nodes, Map<Object, ConflictGroup> groups) {
        Map<DependencyNode, Object> conflictIds = new IdentityHashMap<>(nodes.size() + 1);

```

### BoundedWildcard
Can generalize to `? extends ConflictGroup`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictMarker.java`
#### Snippet
```java
    }

    private Map<DependencyNode, Object> mark(Collection<DependencyNode> nodes, Map<Object, ConflictGroup> groups) {
        Map<DependencyNode, Object> conflictIds = new IdentityHashMap<>(nodes.size() + 1);

```

### BoundedWildcard
Can generalize to `? super DependencyNode`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictMarker.java`
#### Snippet
```java

    private void analyze(
            DependencyNode node, Map<DependencyNode, Object> nodes, Map<Object, ConflictGroup> groups, int[] counter) {
        if (nodes.put(node, Boolean.TRUE) != null) {
            return;
```

### BoundedWildcard
Can generalize to `? super DependencyNode`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictIdSorter.java`
#### Snippet
```java
            ConflictId id,
            int depth,
            Map<DependencyNode, Object> visited,
            Map<?, ?> conflictIds) {
        if (visited.put(node, Boolean.TRUE) != null) {
```

### BoundedWildcard
Can generalize to `? super ConflictId`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictIdSorter.java`
#### Snippet
```java
    private void findCycles(
            ConflictId id,
            Map<ConflictId, Object> visited,
            Map<Object, Integer> stack,
            Collection<Collection<Object>> cycles) {
```

### BoundedWildcard
Can generalize to `? super Collection`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictIdSorter.java`
#### Snippet
```java
            Map<ConflictId, Object> visited,
            Map<Object, Integer> stack,
            Collection<Collection<Object>> cycles) {
        Integer depth = stack.put(id.key, stack.size());
        if (depth != null) {
```

### BoundedWildcard
Can generalize to `? extends WorkspaceReader`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/ChainedWorkspaceReader.java`
#### Snippet
```java
        private final List<Object> keys = new ArrayList<>();

        Key(List<WorkspaceReader> readers) {
            for (WorkspaceReader reader : readers) {
                keys.add(reader.getRepository().getKey());
```

### BoundedWildcard
Can generalize to `? extends ProvidedChecksumsSource`
in `maven-resolver-connector-basic/src/main/java/org/eclipse/aether/connector/basic/BasicRepositoryConnector.java`
#### Snippet
```java
            ChecksumPolicyProvider checksumPolicyProvider,
            FileProcessor fileProcessor,
            Map<String, ProvidedChecksumsSource> providedChecksumsSources)
            throws NoRepositoryConnectorException {
        try {
```

### BoundedWildcard
Can generalize to `? extends ChecksumAlgorithmFactory`
in `maven-resolver-spi/src/main/java/org/eclipse/aether/spi/connector/checksum/ChecksumAlgorithmHelper.java`
#### Snippet
```java
    }

    private static Map<String, String> calculate(InputStream inputStream, List<ChecksumAlgorithmFactory> factories)
            throws IOException {
        LinkedHashMap<String, ChecksumAlgorithm> algorithms = new LinkedHashMap<>();
```

## RuleId[id=ExplicitArrayFilling]
### ExplicitArrayFilling
Can be replaced with single 'Arrays.fill()' method call
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/SecretAuthentication.java`
#### Snippet
```java
    private static void clear(char[] chars) {
        if (chars != null) {
            for (int i = 0; i < chars.length; i++) {
                chars[i] = '\0';
            }
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
                    .append(":")
                    .append(artifact.getVersion());
            if (dependency.getScope() != null && (!"".equals(dependency.getScope()))) {
                defBuilder.append(":").append(dependency.getScope());
            }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultRemoteRepositoryManager.java`
#### Snippet
```java
        } else {
            String checksums = session.getChecksumPolicy();
            //noinspection StatementWithEmptyBody
            if (globalPolicy && checksums != null && !checksums.isEmpty()) {
                // use global override
```

### RedundantSuppression
Redundant suppression
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultRemoteRepositoryManager.java`
#### Snippet
```java

            String updates = session.getUpdatePolicy();
            //noinspection StatementWithEmptyBody
            if (globalPolicy && updates != null && !updates.isEmpty()) {
                // use global override
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-resolver-transport-file/src/main/java/org/eclipse/aether/transport/file/FileTransporter.java`
#### Snippet
```java
    protected void implPut(PutTask task) throws Exception {
        File file = getFile(task, false);
        file.getParentFile().mkdirs();
        try {
            utilPut(task, Files.newOutputStream(file.toPath()), true);
```

### IgnoreResultOfCall
Result of `File.setLastModified()` is ignored
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultFileProcessor.java`
#### Snippet
```java
            copy(source, target);

            target.setLastModified(source.lastModified());

            source.delete();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultFileProcessor.java`
#### Snippet
```java
            target.setLastModified(source.lastModified());

            source.delete();
        }
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultDeployer.java`
#### Snippet
```java

                if (error instanceof MetadataNotFoundException) {
                    dstFile.delete();
                }

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultUpdateCheckManager.java`
#### Snippet
```java

        if (artifactFile.exists() && !hasErrors(props)) {
            touchFile.delete();
        }
    }
```

### IgnoreResultOfCall
Result of `File.setLastModified()` is ignored
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultInstaller.java`
#### Snippet
```java
                try (InputStream is = fileTransformer.transformData(srcFile)) {
                    fileProcessor.write(dstFile, is);
                    dstFile.setLastModified(srcFile.lastModified());
                }
            } else {
```

### IgnoreResultOfCall
Result of `File.setLastModified()` is ignored
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultInstaller.java`
#### Snippet
```java
            } else {
                fileProcessor.copy(srcFile, dstFile);
                dstFile.setLastModified(srcFile.lastModified());
            }

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultMetadataResolver.java`
#### Snippet
```java
                    session.getLocalRepositoryManager().add(session, registration);
                } else if (request.isDeleteLocalCopyIfMissing() && exception instanceof MetadataNotFoundException) {
                    download.getFile().delete();
                }
            } catch (NoRepositoryConnectorException e) {
```

### IgnoreResultOfCall
Result of `File.setLastModified()` is ignored
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultArtifactResolver.java`
#### Snippet
```java
                try {
                    fileProcessor.copy(file, dst);
                    dst.setLastModified(file.lastModified());
                } catch (IOException e) {
                    throw new ArtifactTransferException(artifact, null, e);
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileProcessor.java`
#### Snippet
```java

    public void move(File source, File target) throws IOException {
        target.delete();

        if (!source.renameTo(target)) {
```

### IgnoreResultOfCall
Result of `File.setLastModified()` is ignored
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileProcessor.java`
#### Snippet
```java
            copy(source, target);

            target.setLastModified(source.lastModified());

            source.delete();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileProcessor.java`
#### Snippet
```java
            target.setLastModified(source.lastModified());

            source.delete();
        }
    }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileUtils.java`
#### Snippet
```java

    public static void writeProps(File file, Properties props) throws IOException {
        file.getParentFile().mkdirs();

        FileOutputStream fos = null;
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileUtils.java`
#### Snippet
```java
    public static void writeBytes(File file, byte[] pattern, int repeat) throws IOException {
        file.deleteOnExit();
        file.getParentFile().mkdirs();
        OutputStream out = null;
        try {
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/version/ChainedVersionFilter.java`
#### Snippet
```java
    public static VersionFilter newInstance(VersionFilter... filters) {
        if (filters.length <= 1) {
            if (filters.length <= 0) {
                return null;
            }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictResolver.java`
#### Snippet
```java
        private DependencyNode parent() {
            int size = parentNodes.size();
            return (size <= 0) ? null : parentNodes.get(size - 1);
        }

```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/InstallArtifacts.java`
#### Snippet
```java
     */
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(InstallArtifacts.class.getSimpleName());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/InstallArtifacts.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(InstallArtifacts.class.getSimpleName());

        RepositorySystem system = Booter.newRepositorySystem(Booter.selectFactory(args));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDirectDependencies.java`
#### Snippet
```java
     */
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(GetDirectDependencies.class.getSimpleName());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDirectDependencies.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(GetDirectDependencies.class.getSimpleName());

        RepositorySystem system = Booter.newRepositorySystem(Booter.selectFactory(args));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDirectDependencies.java`
#### Snippet
```java

        for (Dependency dependency : descriptorResult.getDependencies()) {
            System.out.println(dependency);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDependencyHierarchy.java`
#### Snippet
```java
     */
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(GetDependencyHierarchy.class.getSimpleName());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDependencyHierarchy.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(GetDependencyHierarchy.class.getSimpleName());

        RepositorySystem system = Booter.newRepositorySystem(Booter.selectFactory(args));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ResolveArtifact.java`
#### Snippet
```java
     */
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(ResolveArtifact.class.getSimpleName());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ResolveArtifact.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(ResolveArtifact.class.getSimpleName());

        RepositorySystem system = Booter.newRepositorySystem(Booter.selectFactory(args));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ResolveArtifact.java`
#### Snippet
```java
        artifact = artifactResult.getArtifact();

        System.out.println(artifact + " resolved to  " + artifact.getFile());

        // signature
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ResolveArtifact.java`
#### Snippet
```java
        artifact = artifactResult.getArtifact();

        System.out.println(artifact + " resolved signature to  " + artifact.getFile());
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/FindNewestVersion.java`
#### Snippet
```java
     */
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(FindNewestVersion.class.getSimpleName());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/FindNewestVersion.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(FindNewestVersion.class.getSimpleName());

        RepositorySystem system = Booter.newRepositorySystem(Booter.selectFactory(args));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/FindNewestVersion.java`
#### Snippet
```java
        Version newestVersion = rangeResult.getHighestVersion();

        System.out.println(
                "Newest version " + newestVersion + " from repository " + rangeResult.getRepository(newestVersion));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/FindAvailableVersions.java`
#### Snippet
```java
     */
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(FindAvailableVersions.class.getSimpleName());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/FindAvailableVersions.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(FindAvailableVersions.class.getSimpleName());

        RepositorySystem system = Booter.newRepositorySystem(Booter.selectFactory(args));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/FindAvailableVersions.java`
#### Snippet
```java
        List<Version> versions = rangeResult.getVersions();

        System.out.println("Available versions " + versions);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/DependencyHierarchyWithRanges.java`
#### Snippet
```java
     */
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(DependencyHierarchyWithRanges.class.getSimpleName());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/DependencyHierarchyWithRanges.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(DependencyHierarchyWithRanges.class.getSimpleName());

        RepositorySystem system = Booter.newRepositorySystem(Booter.selectFactory(args));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDependencyTree.java`
#### Snippet
```java
     */
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(GetDependencyTree.class.getSimpleName());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/GetDependencyTree.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(GetDependencyTree.class.getSimpleName());

        RepositorySystem system = Booter.newRepositorySystem(Booter.selectFactory(args));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ResolveTransitiveDependencies.java`
#### Snippet
```java
     */
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(ResolveTransitiveDependencies.class.getSimpleName());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ResolveTransitiveDependencies.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(ResolveTransitiveDependencies.class.getSimpleName());

        RepositorySystem system = Booter.newRepositorySystem(Booter.selectFactory(args));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ResolveTransitiveDependencies.java`
#### Snippet
```java

        for (ArtifactResult artifactResult : artifactResults) {
            System.out.println(artifactResult.getArtifact() + " resolved to "
                    + artifactResult.getArtifact().getFile());
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/DeployArtifacts.java`
#### Snippet
```java
     */
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(DeployArtifacts.class.getSimpleName());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/DeployArtifacts.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(DeployArtifacts.class.getSimpleName());

        RepositorySystem system = Booter.newRepositorySystem(Booter.selectFactory(args));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ReverseDependencyTree.java`
#### Snippet
```java
     */
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(ReverseDependencyTree.class.getSimpleName());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/ReverseDependencyTree.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(ReverseDependencyTree.class.getSimpleName());

        RepositorySystem system = Booter.newRepositorySystem(Booter.selectFactory(args));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/Booter.java`
#### Snippet
```java
    public static final String SISU = "sisu";

    public static final DependencyGraphDumper DUMPER_SOUT = new DependencyGraphDumper(System.out::println);

    public static String selectFactory(String[] args) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/ReverseTreeRepositoryListener.java`
#### Snippet
```java
                        .replace(":", "_"));
                Files.write(trackingFile, trackingData.getBytes(StandardCharsets.UTF_8));
                System.out.println(trackingData);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/ConsoleRepositoryListener.java`
#### Snippet
```java

    public ConsoleRepositoryListener(PrintStream out) {
        this.out = (out != null) ? out : System.out;
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/resolver/ResolverDemo.java`
#### Snippet
```java
public class ResolverDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(ResolverDemo.class.getSimpleName());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/resolver/ResolverDemo.java`
#### Snippet
```java
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        System.out.println(ResolverDemo.class.getSimpleName());

        Resolver resolver =
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/resolver/ResolverDemo.java`
#### Snippet
```java
        ResolverResult result = resolver.resolve("junit", "junit", "4.13.2");

        System.out.println("Result:");
        System.out.println("classpath=" + result.getResolvedClassPath());
        System.out.println("files=" + result.getResolvedFiles());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/resolver/ResolverDemo.java`
#### Snippet
```java

        System.out.println("Result:");
        System.out.println("classpath=" + result.getResolvedClassPath());
        System.out.println("files=" + result.getResolvedFiles());
        System.out.println("root=" + result.getRoot());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/resolver/ResolverDemo.java`
#### Snippet
```java
        System.out.println("Result:");
        System.out.println("classpath=" + result.getResolvedClassPath());
        System.out.println("files=" + result.getResolvedFiles());
        System.out.println("root=" + result.getRoot());
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/resolver/ResolverDemo.java`
#### Snippet
```java
        System.out.println("classpath=" + result.getResolvedClassPath());
        System.out.println("files=" + result.getResolvedFiles());
        System.out.println("root=" + result.getRoot());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/ConsoleTransferListener.java`
#### Snippet
```java

    public ConsoleTransferListener(PrintStream out) {
        this.out = (out != null) ? out : System.out;
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/resolver/Resolver.java`
#### Snippet
```java
        StringBuilder dump = new StringBuilder();
        displayTree(rootNode, dump);
        System.out.println("Tree:");
        System.out.println(dump);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/resolver/Resolver.java`
#### Snippet
```java
        displayTree(rootNode, dump);
        System.out.println("Tree:");
        System.out.println(dump);

        PreorderNodeListGenerator nlg = new PreorderNodeListGenerator();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/demo/TestNioLock.java`
#### Snippet
```java
    public static void main(String[] args) throws IOException, InterruptedException {
        if (args.length != 3) {
            System.out.println("demo.TestNioLock <test|perform> <file> <sleepMs>");
            System.exit(EC_ERROR);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/demo/TestNioLock.java`
#### Snippet
```java

        if (Files.isDirectory(path)) {
            System.out.println("The <file> cannot be directory.");
            System.exit(EC_ERROR);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/demo/TestNioLock.java`
#### Snippet
```java

        if ("test".equals(mode)) {
            System.out.println("Testing file locking on");
            System.out.println(
                    "  Java " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/demo/TestNioLock.java`
#### Snippet
```java
        if ("test".equals(mode)) {
            System.out.println("Testing file locking on");
            System.out.println(
                    "  Java " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
            System.out.println("  OS " + System.getProperty("os.name") + " " + System.getProperty("os.version") + " "
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/demo/TestNioLock.java`
#### Snippet
```java
            System.out.println(
                    "  Java " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
            System.out.println("  OS " + System.getProperty("os.name") + " " + System.getProperty("os.version") + " "
                    + System.getProperty("os.arch"));

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/demo/TestNioLock.java`
#### Snippet
```java

            FileStore fileStore = Files.getFileStore(path.getParent());
            System.out.println("  FS " + fileStore.name() + " " + fileStore.type());
            System.out.println();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/demo/TestNioLock.java`
#### Snippet
```java
            FileStore fileStore = Files.getFileStore(path.getParent());
            System.out.println("  FS " + fileStore.name() + " " + fileStore.type());
            System.out.println();

            AtomicInteger oneResult = new AtomicInteger(-1);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/demo/TestNioLock.java`
#### Snippet
```java
            int twoExit = twoResult.get();
            if ((oneExit == EC_WON && twoExit == EC_LOST) || (oneExit == EC_LOST && twoExit == EC_WON)) {
                System.out.println("OK");
                System.exit(0);
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/demo/TestNioLock.java`
#### Snippet
```java
                System.exit(0);
            } else {
                System.out.println("FAILED: one=" + oneExit + " two=" + twoExit);
                System.exit(EC_FAILED);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/demo/TestNioLock.java`
#### Snippet
```java
        } else if ("perform".equals(mode)) {
            String processName = ManagementFactory.getRuntimeMXBean().getName();
            System.out.println(processName + " > started");
            boolean won = false;
            long sleepMs = Long.parseLong(args[2]);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/demo/TestNioLock.java`
#### Snippet
```java
            try (FileChannel latchChannel = FileChannel.open(latchFile, StandardOpenOption.READ)) {
                try (FileLock latchLock = latchChannel.lock(0L, 1L, true)) {
                    System.out.println(processName + " > latchLock acquired");
                    try (FileChannel channel = FileChannel.open(
                            path, StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/demo/TestNioLock.java`
#### Snippet
```java
                        try (FileLock lock = channel.tryLock(0L, 1L, false)) {
                            if (lock != null && lock.isValid() && !lock.isShared()) {
                                System.out.println(processName + " > WON");
                                won = true;
                                Thread.sleep(sleepMs);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/demo/TestNioLock.java`
#### Snippet
```java
                                Thread.sleep(sleepMs);
                            } else {
                                System.out.println(processName + " > LOST");
                            }
                        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/demo/TestNioLock.java`
#### Snippet
```java
                }
            }
            System.out.println(processName + " > ended");
            if (won) {
                System.exit(EC_WON);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/demo/TestNioLock.java`
#### Snippet
```java
            }
        } else {
            System.err.println("Unknown mode: " + mode);
        }
        System.exit(EC_ERROR);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestLoggerFactory.java`
#### Snippet
```java

        TestLogger(PrintStream out) {
            this.out = (out != null) ? out : System.out;
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/version/GenericVersionScheme.java`
#### Snippet
```java
    // CHECKSTYLE_ON: LineLength
    public static void main(String... args) {
        System.out.println("Display parameters as parsed by Maven Resolver (in canonical form and as a list of tokens)"
                + " and comparison result:");
        if (args.length == 0) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/version/GenericVersionScheme.java`
#### Snippet
```java
            if (prev != null) {
                int compare = prev.compareTo(c);
                System.out.println(
                        "   " + prev + ' ' + ((compare == 0) ? "==" : ((compare < 0) ? "<" : ">")) + ' ' + version);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/version/GenericVersionScheme.java`
#### Snippet
```java
            }

            System.out.println((i++) + ". " + version + " -> " + c.asString() + "; tokens: " + c.asItems());

            prev = c;
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `SyncContextFactory` is the same as one of its superclass' names
in `maven-resolver-impl/src/main/java/org/eclipse/aether/impl/SyncContextFactory.java`
#### Snippet
```java
 */
@Deprecated
public interface SyncContextFactory extends org.eclipse.aether.spi.synccontext.SyncContextFactory {}

```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'process.length() \> 0' covered by subsequent condition 'process.startsWith(...)'
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestVersionScheme.java`
#### Snippet
```java
            process = process.substring(index + 1).trim();

            if (process.length() > 0 && process.startsWith(",")) {
                process = process.substring(1).trim();
            }
```

### ConditionCoveredByFurtherCondition
Condition 'scope != null' covered by subsequent condition 'JavaScopes.SYSTEM.equals(...)'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DefaultDependencyManager.java`
#### Snippet
```java
        }

        if ((scope != null && JavaScopes.SYSTEM.equals(scope))
                || (scope == null && JavaScopes.SYSTEM.equals(dependency.getScope()))) {
            String localPath = managedLocalPaths.get(key);
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/ConnMgrConfig.java`
#### Snippet
```java
            return null;
        }
        return value.split(",+");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/ReverseTreeRepositoryListener.java`
#### Snippet
```java
                        .getArtifact()
                        .toString()
                        .replace(":", "_"));
                Files.write(trackingFile, trackingData.getBytes(StandardCharsets.UTF_8));
                System.out.println(trackingData);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/SummaryFileTrustedChecksumsSource.java`
#### Snippet
```java
                while ((line = reader.readLine()) != null) {
                    if (!line.startsWith("#") && !line.isEmpty()) {
                        String[] parts = line.split("  ", 2);
                        if (parts.length == 2) {
                            String newChecksum = parts[0];
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/WorkspaceRepository.java`
#### Snippet
```java
    public WorkspaceRepository(String type, Object key) {
        this.type = (type != null) ? type : "";
        this.key = (key != null) ? key : UUID.randomUUID().toString().replace("-", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String COORDS = "([^: \\(]+):([^: ]+)(?::([^: ]*)(?::([^: ]+))?)?:([^: \\[\\(<]+)";

    private static final String COORDS_NC = NodeDefinition.COORDS.replaceAll("\\((?=\\[)", "(?:");

    private static final String RANGE_NC = "[\\(\\[][^\\(\\)\\[\\]]+[\\)\\]]";
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
        if (props != null) {
            properties = new LinkedHashMap<>();
            for (String prop : props.split("\\s*,\\s*")) {
                int sep = prop.indexOf(':');
                String key = prop.substring(0, sep);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
        if (relocs != null) {
            relocations = new ArrayList<>();
            Collections.addAll(relocations, relocs.split("\\s*,\\s*"));
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java
                    try {
                        String name = line.substring(1, line.length() - 1);
                        name = name.replace("-", "").toUpperCase(Locale.ENGLISH);
                        state = State.valueOf(name);
                        sections.put(state, new ArrayList<String>());
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
                    throw new IllegalStateException("not enough substitutions to fill placeholders");
                }
                line = line.replaceFirst("%s", substitutionIterator.next());
            }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
        String definition;

        String[] split = line.split("- ");
        if (split.length == 1) // root
        {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/filter/DependencyFilterUtils.java`
#### Snippet
```java
        if (classpathTypes != null) {
            for (String classpathType : classpathTypes) {
                String[] tokens = classpathType.split("[+,]");
                for (String token : tokens) {
                    token = token.trim();
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/ChecksumUtils.java`
#### Snippet
```java
        }

        if (checksum.matches(".+= [0-9A-Fa-f]+")) {
            int lastSpacePos = checksum.lastIndexOf(' ');
            checksum = checksum.substring(lastSpacePos + 1);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/DefaultProxySelector.java`
#### Snippet
```java
                for (StringTokenizer tokenizer = new StringTokenizer(nonProxyHosts, "|"); tokenizer.hasMoreTokens(); ) {
                    String pattern = tokenizer.nextToken();
                    pattern = pattern.replace(".", "\\.").replace("*", ".*");
                    patterns.add(Pattern.compile(pattern, Pattern.CASE_INSENSITIVE));
                }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/DefaultProxySelector.java`
#### Snippet
```java
                for (StringTokenizer tokenizer = new StringTokenizer(nonProxyHosts, "|"); tokenizer.hasMoreTokens(); ) {
                    String pattern = tokenizer.nextToken();
                    pattern = pattern.replace(".", "\\.").replace("*", ".*");
                    patterns.add(Pattern.compile(pattern, Pattern.CASE_INSENSITIVE));
                }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/artifact/SubArtifact.java`
#### Snippet
```java
        String result = "";
        if (pattern != null) {
            result = pattern.replace("*", replacement);

            if (replacement.isEmpty()) {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.redisson.api` is unnecessary and can be removed
in `maven-resolver-named-locks-redisson/src/main/java/org/eclipse/aether/named/redisson/RedissonReadWriteLockNamedLockFactory.java`
#### Snippet
```java

/**
 * Provider of {@link RedissonReadWriteLockNamedLockFactory} using Redisson and {@link org.redisson.api.RReadWriteLock}.
 */
@Singleton
```

### UnnecessaryFullyQualifiedName
Qualifier `org.redisson.api` is unnecessary and can be removed
in `maven-resolver-named-locks-redisson/src/main/java/org/eclipse/aether/named/redisson/RedissonSemaphoreNamedLockFactory.java`
#### Snippet
```java

/**
 * Provider of {@link RedissonSemaphoreNamedLockFactory} using Redisson and {@link org.redisson.api.RSemaphore}.
 */
@Singleton
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `maven-resolver-transport-file/src/main/java/org/eclipse/aether/transport/file/FileTransporter.java`
#### Snippet
```java

/**
 * A transporter using {@link java.io.File}.
 */
final class FileTransporter extends AbstractTransporter {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.resolver.examples.manual` is unnecessary, and can be replaced with an import
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/Booter.java`
#### Snippet
```java
        switch (factory) {
            case SERVICE_LOCATOR:
                return org.apache.maven.resolver.examples.manual.ManualRepositorySystemFactory.newRepositorySystem();
            case GUICE:
                return org.apache.maven.resolver.examples.guice.GuiceRepositorySystemFactory.newRepositorySystem();
```

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.resolver.examples.sisu` is unnecessary, and can be replaced with an import
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/Booter.java`
#### Snippet
```java
                return org.apache.maven.resolver.examples.guice.GuiceRepositorySystemFactory.newRepositorySystem();
            case SISU:
                return org.apache.maven.resolver.examples.sisu.SisuRepositorySystemFactory.newRepositorySystem();
            default:
                throw new IllegalArgumentException("Unknown factory: " + factory);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.spi.log` is unnecessary, and can be replaced with an import
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultRepositorySystem.java`
#### Snippet
```java
     */
    @Deprecated
    public DefaultRepositorySystem setLoggerFactory(org.eclipse.aether.spi.log.LoggerFactory loggerFactory) {
        // this.logger = NullLoggerFactory.getSafeLogger( loggerFactory, getClass() );
        return this;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/providers/LocalSemaphoreNamedLockFactory.java`
#### Snippet
```java

    /**
     * Adapted JVM {@link java.util.concurrent.Semaphore}.
     */
    private static final class JVMSemaphore implements AdaptedSemaphoreNamedLock.AdaptedSemaphore {
```

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.repository` is unnecessary and can be removed
in `maven-resolver-api/src/main/java/org/eclipse/aether/DefaultRepositorySystemSession.java`
#### Snippet
```java
     * @param proxySelector The proxy selector to use, may be {@code null}.
     * @return This session for chaining, never {@code null}.
     * @see org.eclipse.aether.repository.RemoteRepository#getProxy()
     */
    public DefaultRepositorySystemSession setProxySelector(ProxySelector proxySelector) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.repository` is unnecessary and can be removed
in `maven-resolver-api/src/main/java/org/eclipse/aether/DefaultRepositorySystemSession.java`
#### Snippet
```java
     * @param authenticationSelector The authentication selector to use, may be {@code null}.
     * @return This session for chaining, never {@code null}.
     * @see org.eclipse.aether.repository.RemoteRepository#getAuthentication()
     */
    public DefaultRepositorySystemSession setAuthenticationSelector(AuthenticationSelector authenticationSelector) {
```

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether.graph` is unnecessary and can be removed
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/visitor/AbstractDepthFirstNodeListGenerator.java`
#### Snippet
```java
 * Actual vertex ordering (preorder, inorder, postorder) needs to be defined by subclasses through appropriate
 * implementations for {@link #visitEnter(org.eclipse.aether.graph.DependencyNode)} and
 * {@link #visitLeave(org.eclipse.aether.graph.DependencyNode)}
 */
abstract class AbstractDepthFirstNodeListGenerator implements DependencyVisitor {
```

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.aether` is unnecessary and can be removed
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictResolver.java`
#### Snippet
```java

    /**
     * The key in the repository session's {@link org.eclipse.aether.RepositorySystemSession#getConfigProperties()
     * configuration properties} used to store a {@link Boolean} flag controlling the transformer's verbose mode.
     * Accepted values are {@link Boolean} type, {@link String} type (where "true" would be interpreted as {@code true}
```

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileUtils.java`
#### Snippet
```java
                deleteFile(TMP);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `maven-resolver-transport-file/src/main/java/org/eclipse/aether/transport/file/PathUtils.java`
#### Snippet
```java
        if (url != null) {
            int pos = -1;
            while ((pos = decoded.indexOf('%', pos + 1)) >= 0) {
                if (pos + 2 < decoded.length()) {
                    String hexStr = decoded.substring(pos + 1, pos + 3);
```

### NestedAssignment
Result of assignment expression used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/filter/PrefixesRemoteRepositoryFilterSource.java`
#### Snippet
```java
                String prefix;
                int lines = 0;
                while ((prefix = reader.readLine()) != null) {
                    if (!prefix.startsWith("#") && !prefix.trim().isEmpty()) {
                        lines++;
```

### NestedAssignment
Result of assignment expression used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/filter/GroupIdRemoteRepositoryFilterSource.java`
#### Snippet
```java
                TreeSet<String> result = new TreeSet<>();
                String groupId;
                while ((groupId = reader.readLine()) != null) {
                    if (!groupId.startsWith("#") && !groupId.trim().isEmpty()) {
                        result.add(groupId);
```

### NestedAssignment
Result of assignment expression used
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/SummaryFileTrustedChecksumsSource.java`
#### Snippet
```java
            try (BufferedReader reader = Files.newBufferedReader(summaryFile, StandardCharsets.UTF_8)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (!line.startsWith("#") && !line.isEmpty()) {
                        String[] parts = line.split("  ", 2);
```

### NestedAssignment
Result of assignment expression used
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java
        try {
            in = new BufferedReader(reader);
            while ((line = in.readLine()) != null) {

                line = cutComment(line);
```

### NestedAssignment
Result of assignment expression used
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
        boolean isRootNode = true;

        while ((line = in.readLine()) != null) {
            line = cutComment(line);

```

### NestedAssignment
Result of assignment expression used
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
        List<DependencyNode> ret = new ArrayList<>();
        DependencyNode root = null;
        while ((root = parse(reader)) != null) {
            ret.add(root);
        }
```

### NestedAssignment
Result of assignment expression used
in `maven-resolver-connector-basic/src/main/java/org/eclipse/aether/connector/basic/BasicRepositoryConnector.java`
#### Snippet
```java

                try (InputStream transformData = fileTransformer.transformData(file)) {
                    for (int read; (read = transformData.read(buffer, 0, buffer.length)) != -1; ) {
                        baos.write(buffer, 0, read);
                    }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `RedissonNamedLockFactorySupport()` of an abstract class should not be declared 'public'
in `maven-resolver-named-locks-redisson/src/main/java/org/eclipse/aether/named/redisson/RedissonNamedLockFactorySupport.java`
#### Snippet
```java
    protected final RedissonClient redissonClient;

    public RedissonNamedLockFactorySupport() {
        this.redissonClient = createRedissonClient();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `MessageDigestChecksumAlgorithmFactorySupport()` of an abstract class should not be declared 'public'
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/MessageDigestChecksumAlgorithmFactorySupport.java`
#### Snippet
```java
 */
public abstract class MessageDigestChecksumAlgorithmFactorySupport extends ChecksumAlgorithmFactorySupport {
    public MessageDigestChecksumAlgorithmFactorySupport(String name, String extension) {
        super(name, extension);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `NamedLockSupport()` of an abstract class should not be declared 'public'
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/NamedLockSupport.java`
#### Snippet
```java
    private final NamedLockFactorySupport factory;

    public NamedLockSupport(final String name, final NamedLockFactorySupport factory) {
        this.name = name;
        this.factory = factory;
```

### NonProtectedConstructorInAbstractClass
Constructor `NamedLockFactorySupport()` of an abstract class should not be declared 'public'
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/NamedLockFactorySupport.java`
#### Snippet
```java
    private final ConcurrentMap<String, NamedLockHolder> locks;

    public NamedLockFactorySupport() {
        this.locks = new ConcurrentHashMap<>();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ChecksumAlgorithmFactorySupport()` of an abstract class should not be declared 'public'
in `maven-resolver-spi/src/main/java/org/eclipse/aether/spi/connector/checksum/ChecksumAlgorithmFactorySupport.java`
#### Snippet
```java
    private final String fileExtension;

    public ChecksumAlgorithmFactorySupport(String name, String fileExtension) {
        this.name = requireNonNull(name);
        this.fileExtension = requireNonNull(fileExtension);
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/EnhancedLocalRepositoryManager.java`
#### Snippet
```java
            Properties props = readRepos(file);

            if (props.get(getKey(file, LOCAL_REPO_ID)) != null) {
                // artifact installed into the local repo is always accepted
                result.setAvailable(true);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/EnhancedLocalRepositoryManager.java`
#### Snippet
```java
                String context = result.getRequest().getContext();
                for (RemoteRepository repository : result.getRequest().getRepositories()) {
                    if (props.get(getKey(file, getRepositoryKey(repository, context))) != null) {
                        // artifact downloaded from remote repository is accepted only downloaded from request
                        // repositories
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `maven-resolver-transport-wagon/src/main/java/org/eclipse/aether/transport/wagon/WagonTransporter.java`
#### Snippet
```java

        headers = new Properties();
        headers.put(
                "User-Agent",
                ConfigUtils.getString(
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putAll()` on properties object
in `maven-resolver-transport-wagon/src/main/java/org/eclipse/aether/transport/wagon/WagonTransporter.java`
#### Snippet
```java
                ConfigurationProperties.HTTP_HEADERS);
        if (headers != null) {
            this.headers.putAll(headers);
        }
    }
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `maven-resolver-named-locks-hazelcast/src/main/java/org/eclipse/aether/named/hazelcast/HazelcastSemaphoreProvider.java`
#### Snippet
```java
     * Invoked when passed in semaphore associated with passed in name is not to be used anymore.
     */
    public abstract void releaseSemaphore(HazelcastInstance hazelcastInstance, String name, ISemaphore semaphore);
}

```

### EmptyMethod
The method is empty
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/ChecksumExtractor.java`
#### Snippet
```java
     * Prepares request, if needed.
     */
    public void prepareRequest(HttpUriRequest request) {
        // nothing
    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `maven-resolver-api/src/main/java/org/eclipse/aether/graph/Dependency.java`
#### Snippet
```java
            return new Iterator<Exclusion>() {

                private int cursor = 0;

                public boolean hasNext() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/LocalMetadataRequest.java`
#### Snippet
```java
    private String context = "";

    private RemoteRepository repository = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeBuilder.java`
#### Snippet
```java
    private String scope = "compile";

    private boolean optional = false;

    private String context;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java
        private String id = null;

        private String reference = null;

        private boolean optional = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java
        private String reference = null;

        private boolean optional = false;

        Definition(String def) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java
        private String definition;

        private String id = null;

        private String reference = null;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `base`
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/UriUtils.java`
#### Snippet
```java
            if (path == null || !path.endsWith("/")) {
                try {
                    base = new URI(base.getScheme(), base.getAuthority(), base.getPath() + '/', null, null);
                } catch (URISyntaxException e) {
                    throw new IllegalStateException(e);
```

### AssignmentToMethodParameter
Assignment to method parameter `host`
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/SharingAuthCache.java`
#### Snippet
```java
    @Override
    public AuthScheme get(HttpHost host) {
        host = toKey(host);
        AuthScheme authScheme = authSchemes.get(host);
        if (authScheme == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `spaces`
in `maven-resolver-demos/maven-resolver-demo-snippets/src/main/java/org/apache/maven/resolver/examples/util/ConsoleTransferListener.java`
#### Snippet
```java
            int n = Math.min(spaces, block.length());
            buffer.append(block, 0, n);
            spaces -= n;
        }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `priority`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/PrioritizedComponents.java`
#### Snippet
```java
        Class<?> type = getImplClass(component);
        int index = components.size();
        priority = useInsertionOrder ? -index : ConfigUtils.getFloat(configProps, priority, getConfigKeys(type));
        PrioritizedComponent<T> pc = new PrioritizedComponent<>(component, type, priority, index);

```

### AssignmentToMethodParameter
Assignment to method parameter `policy`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultUpdatePolicyAnalyzer.java`
#### Snippet
```java

        if (policy == null) {
            policy = "";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `updates`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultRemoteRepositoryManager.java`
#### Snippet
```java
        if (policy != null) {
            if (updates == null || updates.isEmpty()) {
                updates = policy.getUpdatePolicy();
            }
            if (checksums == null || checksums.isEmpty()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `checksums`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultRemoteRepositoryManager.java`
#### Snippet
```java
            }
            if (checksums == null || checksums.isEmpty()) {
                checksums = policy.getChecksumPolicy();
            }
            if (!policy.getUpdatePolicy().equals(updates)
```

### AssignmentToMethodParameter
Assignment to method parameter `policy`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultRemoteRepositoryManager.java`
#### Snippet
```java
            if (!policy.getUpdatePolicy().equals(updates)
                    || !policy.getChecksumPolicy().equals(checksums)) {
                policy = new RepositoryPolicy(policy.isEnabled(), updates, checksums);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `repositories`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultRepositorySystem.java`
#### Snippet
```java
        validateRepositories(repositories);

        repositories = remoteRepositoryManager.aggregateRepositories(
                session, new ArrayList<RemoteRepository>(), repositories, true);
        return repositories;
```

### AssignmentToMethodParameter
Assignment to method parameter `dependency`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/PremanagedDependency.java`
#### Snippet
```java
                Artifact artifact = dependency.getArtifact();
                premanagedVersion = artifact.getVersion();
                dependency = dependency.setArtifact(artifact.setVersion(depMngt.getVersion()));
                managedBits |= DependencyNode.MANAGED_VERSION;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `dependency`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/PremanagedDependency.java`
#### Snippet
```java
                Artifact artifact = dependency.getArtifact();
                premanagedProperties = artifact.getProperties();
                dependency = dependency.setArtifact(artifact.setProperties(depMngt.getProperties()));
                managedBits |= DependencyNode.MANAGED_PROPERTIES;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `dependency`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/PremanagedDependency.java`
#### Snippet
```java
            if (depMngt.getScope() != null) {
                premanagedScope = dependency.getScope();
                dependency = dependency.setScope(depMngt.getScope());
                managedBits |= DependencyNode.MANAGED_SCOPE;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `dependency`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/PremanagedDependency.java`
#### Snippet
```java
            if (depMngt.getOptional() != null) {
                premanagedOptional = dependency.isOptional();
                dependency = dependency.setOptional(depMngt.getOptional());
                managedBits |= DependencyNode.MANAGED_OPTIONAL;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `dependency`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/PremanagedDependency.java`
#### Snippet
```java
            if (depMngt.getExclusions() != null) {
                premanagedExclusions = dependency.getExclusions();
                dependency = dependency.setExclusions(depMngt.getExclusions());
                managedBits |= DependencyNode.MANAGED_EXCLUSIONS;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `session`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/DependencyCollectorDelegate.java`
#### Snippet
```java
        requireNonNull(session, "session cannot be null");
        requireNonNull(request, "request cannot be null");
        session = optimizeSession(session);

        RequestTrace trace = RequestTrace.newChild(request.getTrace(), request);
```

### AssignmentToMethodParameter
Assignment to method parameter `file`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultArtifactResolver.java`
#### Snippet
```java
            }

            file = dst;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `exclusions`
in `maven-resolver-api/src/main/java/org/eclipse/aether/graph/Dependency.java`
#### Snippet
```java
        private Exclusions(Collection<Exclusion> exclusions) {
            if (exclusions.size() > 1 && !(exclusions instanceof Set)) {
                exclusions = new LinkedHashSet<>(exclusions);
            }
            this.exclusions = exclusions.toArray(new Exclusion[0]);
```

### AssignmentToMethodParameter
Assignment to method parameter `dependency`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/df/DfDependencyCollector.java`
#### Snippet
```java
        PremanagedDependency preManaged =
                PremanagedDependency.create(depManager, dependency, disableVersionManagement, args.premanagedState);
        dependency = preManaged.getManagedDependency();

        boolean noDescriptor = isLackingDescriptor(dependency.getArtifact());
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `maven-resolver-transport-wagon/src/main/java/org/eclipse/aether/transport/wagon/WagonCancelledException.java`
#### Snippet
```java
    public static Exception unwrap(Exception e) {
        if (e instanceof WagonCancelledException) {
            e = (Exception) e.getCause();
        }
        return e;
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/AuthenticationContext.java`
#### Snippet
```java
            if (String.class.equals(type)) {
                if (value instanceof File) {
                    value = ((File) value).getPath();
                } else if (value instanceof char[]) {
                    value = new String((char[]) value);
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/AuthenticationContext.java`
#### Snippet
```java
                    value = ((File) value).getPath();
                } else if (value instanceof char[]) {
                    value = new String((char[]) value);
                }
            } else if (File.class.equals(type)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/AuthenticationContext.java`
#### Snippet
```java
            } else if (File.class.equals(type)) {
                if (value instanceof String) {
                    value = new File((String) value);
                }
            } else if (char[].class.equals(type)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/AuthenticationContext.java`
#### Snippet
```java
            } else if (char[].class.equals(type)) {
                if (value instanceof String) {
                    value = ((String) value).toCharArray();
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `line`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java

        if (idx != -1) {
            line = line.substring(0, idx);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `line`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java

        if (idx != -1) {
            line = line.substring(0, idx);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `level`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java

        entry.setDefinition(defBuilder.toString());
        entry.setLevel(level++);

        entries.add(entry);
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ChainedDependencyGraphTransformer.java`
#### Snippet
```java
        requireNonNull(context, "context cannot be null");
        for (DependencyGraphTransformer transformer : transformers) {
            node = transformer.transformGraph(node, context);
        }
        return node;
```

### AssignmentToMethodParameter
Assignment to method parameter `depth`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictIdSorter.java`
#### Snippet
```java
        }

        depth++;

        for (DependencyNode child : node.getChildren()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `depth`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictIdSorter.java`
#### Snippet
```java
            if (depth < minDepth) {
                minDepth = depth;
                depth++;
                for (ConflictId child : children) {
                    child.pullup(depth);
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-20-04-52-54.223.html`
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
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/XChecksumChecksumExtractor.java`
#### Snippet
```java
        }

        return result.isEmpty() ? null : result;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/XChecksumChecksumExtractor.java`
#### Snippet
```java
    private String extractChecksum(HttpResponse response, String name) {
        Header header = response.getFirstHeader(name);
        return header != null ? header.getValue() : null;
    }
}
```

### ReturnNull
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

### ReturnNull
Return of `null`
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/SharingHttpContext.java`
#### Snippet
```java
        if (HttpClientContext.USER_TOKEN.equals(id)) {
            state.setUserToken(null);
            return null;
        }
        return super.removeAttribute(id);
```

### ReturnNull
Return of `null`
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/LocalState.java`
#### Snippet
```java
            return pool.get();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/ConnMgrConfig.java`
#### Snippet
```java
    private static String[] split(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        return value.split(",+");
```

### ReturnNull
Return of `null`
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/DeferredCredentialsProvider.java`
#### Snippet
```java
            String username = authContext.get(AuthenticationContext.USERNAME);
            if (username == null) {
                return null;
            }
            String password = authContext.get(AuthenticationContext.PASSWORD);
```

### ReturnNull
Return of `null`
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/DeferredCredentialsProvider.java`
#### Snippet
```java
            String username = authContext.get(AuthenticationContext.USERNAME);
            if (username == null) {
                return null;
            }
            String password = authContext.get(AuthenticationContext.PASSWORD);
```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultTrackingFileManager.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/impl/DefaultServiceLocator.java`
#### Snippet
```java
        public T getInstance() {
            List<T> instances = getInstances();
            return instances.isEmpty() ? null : instances.get(0);
        }

```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/impl/DefaultServiceLocator.java`
#### Snippet
```java
    public <T> List<T> getServices(Class<T> type) {
        Entry<T> entry = getEntry(type, false);
        return (entry != null) ? entry.getInstances() : null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/impl/DefaultServiceLocator.java`
#### Snippet
```java
                serviceCreationFailed(type, impl, e);
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/impl/DefaultServiceLocator.java`
#### Snippet
```java
    public <T> T getService(Class<T> type) {
        Entry<T> entry = getEntry(type, false);
        return (entry != null) ? entry.getInstance() : null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultOfflineController.java`
#### Snippet
```java
        String value = ConfigUtils.getString(session, "", key).trim();
        if (value.isEmpty()) {
            return null;
        }
        return SEP.split(value);
```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/SafeTransferListener.java`
#### Snippet
```java
        TransferListener listener = session.getTransferListener();
        if (listener == null) {
            return null;
        }
        return new SafeTransferListener(listener);
```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/LocalPathPrefixComposerFactorySupport.java`
#### Snippet
```java
        public String getPathPrefixForRemoteArtifact(Artifact artifact, RemoteRepository repository) {
            if (!split) {
                return null;
            }
            String result = remotePrefix;
```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/LocalPathPrefixComposerFactorySupport.java`
#### Snippet
```java
        public String getPathPrefixForLocalMetadata(Metadata metadata) {
            if (!split) {
                return null;
            }
            String result = localPrefix;
```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/LocalPathPrefixComposerFactorySupport.java`
#### Snippet
```java
        public String getPathPrefixForLocalArtifact(Artifact artifact) {
            if (!split) {
                return null;
            }
            String result = localPrefix;
```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/LocalPathPrefixComposerFactorySupport.java`
#### Snippet
```java
        public String getPathPrefixForRemoteMetadata(Metadata metadata, RemoteRepository repository) {
            if (!split) {
                return null;
            }
            String result = remotePrefix;
```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/DefaultChecksumPolicyProvider.java`
#### Snippet
```java
        switch (policy) {
            case RepositoryPolicy.CHECKSUM_POLICY_IGNORE:
                return null;
            case RepositoryPolicy.CHECKSUM_POLICY_FAIL:
                return new FailChecksumPolicy(resource);
```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/filter/PrefixesRemoteRepositoryFilterSource.java`
#### Snippet
```java
            return new PrefixesFilter(session, getBasedir(session, false));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/CachingArtifactTypeRegistry.java`
#### Snippet
```java

    public static ArtifactTypeRegistry newInstance(ArtifactTypeRegistry delegate) {
        return (delegate != null) ? new CachingArtifactTypeRegistry(delegate) : null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/filter/GroupIdRemoteRepositoryFilterSource.java`
#### Snippet
```java
            return new GroupIdFilter(session);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/filter/DefaultRemoteRepositoryFilterManager.java`
#### Snippet
```java
                return new Participants(filters);
            } else {
                return null;
            }
        });
```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/DataPool.java`
#### Snippet
```java
        public V get(K key) {
            WeakReference<V> ref = map.get(key);
            return ref != null ? ref.get() : null;
        }

```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/DataPool.java`
#### Snippet
```java
            return constraint.toResult(request);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/DataPool.java`
#### Snippet
```java
            return descriptor.toResult(request);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/FileTrustedChecksumsSourceSupport.java`
#### Snippet
```java
            return doGetTrustedArtifactChecksumsWriter(session);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/FileTrustedChecksumsSourceSupport.java`
#### Snippet
```java
     */
    protected Writer doGetTrustedArtifactChecksumsWriter(RepositorySystemSession session) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/checksum/FileTrustedChecksumsSourceSupport.java`
#### Snippet
```java
                    doGetTrustedArtifactChecksums(session, artifact, artifactRepository, checksumAlgorithmFactories));
        }
        return null;
    }

```

### ReturnNull
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

### ReturnNull
Return of `null`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/FileLockNamedLock.java`
#### Snippet
```java
                        } else {
                            // someone else owns exclusive, let's wait
                            return null;
                        }
                    }
```

### ReturnNull
Return of `null`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/FileLockNamedLock.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/FileLockNamedLock.java`
#### Snippet
```java
                        } else {
                            // someone else owns shared, let's wait
                            return null;
                        }
                    } else {
```

### ReturnNull
Return of `null`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/FileLockNamedLock.java`
#### Snippet
```java
                        } else {
                            // someone else owns exclusive, let's wait
                            return null;
                        }
                    }
```

### ReturnNull
Return of `null`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/FileLockNamedLock.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/FileLockNamedLock.java`
#### Snippet
```java
        } catch (OverlappingFileLockException e) {
            logger.trace("File lock overlap on '{}'", name(), e);
            return null;
        } catch (IOException e) {
            logger.trace("Failure on acquire of file lock for '{}'", name(), e);
```

### ReturnNull
Return of `null`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/providers/FileLockNamedLockFactory.java`
#### Snippet
```java
                                }
                            } catch (AccessDeniedException e) {
                                return null;
                            }
                        },
```

### ReturnNull
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/RepositoryEvent.java`
#### Snippet
```java
     */
    public Exception getException() {
        return exceptions.isEmpty() ? null : exceptions.get(0);
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/DefaultRepositorySystemSession.java`
#### Snippet
```java
    public LocalRepository getLocalRepository() {
        LocalRepositoryManager lrm = getLocalRepositoryManager();
        return (lrm != null) ? lrm.getRepository() : null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/DefaultRepositorySystemSession.java`
#### Snippet
```java

        public ArtifactType get(String typeId) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/DefaultRepositorySystemSession.java`
#### Snippet
```java
        public RemoteRepository getMirror(RemoteRepository repository) {
            requireNonNull(repository, "repository cannot be null");
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/transfer/TransferEvent.java`
#### Snippet
```java
     */
    public ByteBuffer getDataBuffer() {
        return (dataBuffer != null) ? dataBuffer.asReadOnlyBuffer() : null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/bf/BfDependencyCollector.java`
#### Snippet
```java
                results.addException(context.dependency, e, context.parents);
                pool.putDescriptor(key, e);
                return null;
            }

```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/bf/BfDependencyCollector.java`
#### Snippet
```java

        } else if (descriptorResult == DataPool.NO_DESCRIPTOR) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/df/DfDependencyCollector.java`
#### Snippet
```java
                results.addException(d, e, args.nodes.nodes);
                pool.putDescriptor(key, e);
                return null;
            }

```

### ReturnNull
Return of `null`
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/collect/df/DfDependencyCollector.java`
#### Snippet
```java

        } else if (descriptorResult == DataPool.NO_DESCRIPTOR) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/resolution/VersionRangeResult.java`
#### Snippet
```java
    public Version getHighestVersion() {
        if (versions.isEmpty()) {
            return null;
        }
        return versions.get(versions.size() - 1);
```

### ReturnNull
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/resolution/VersionRangeResult.java`
#### Snippet
```java
    public Version getLowestVersion() {
        if (versions.isEmpty()) {
            return null;
        }
        return versions.get(0);
```

### ReturnNull
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/AuthenticationContext.java`
#### Snippet
```java
            RepositorySystemSession session, RemoteRepository repository, Proxy proxy, Authentication auth) {
        if (auth == null) {
            return null;
        }
        return new AuthenticationContext(session, repository, proxy, auth);
```

### ReturnNull
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/AuthenticationContext.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/resolution/ArtifactResolutionException.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `maven-resolver-api/src/main/java/org/eclipse/aether/resolution/ArtifactResolutionException.java`
#### Snippet
```java
     */
    public ArtifactResult getResult() {
        return (results != null && !results.isEmpty()) ? results.get(0) : null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/NoopDependencyManager.java`
#### Snippet
```java
    public DependencyManagement manageDependency(Dependency dependency) {
        requireNonNull(dependency, "dependency cannot be null");
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java
    private Artifact relocation(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String coords = list.get(0);
```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/version/ContextualSnapshotVersionFilter.java`
#### Snippet
```java
            if (artifact.isSnapshot()) {
                // root is a snapshot, allow snapshots all the way down
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DependencyManagerUtils.java`
#### Snippet
```java
    public static Boolean getPremanagedOptional(DependencyNode node) {
        if ((node.getManagedBits() & DependencyNode.MANAGED_OPTIONAL) == 0) {
            return null;
        }
        return cast(node.getData().get(NODE_DATA_PREMANAGED_OPTIONAL), Boolean.class);
```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DependencyManagerUtils.java`
#### Snippet
```java
    public static String getPremanagedVersion(DependencyNode node) {
        if ((node.getManagedBits() & DependencyNode.MANAGED_VERSION) == 0) {
            return null;
        }
        return cast(node.getData().get(NODE_DATA_PREMANAGED_VERSION), String.class);
```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DependencyManagerUtils.java`
#### Snippet
```java
    public static Map<String, String> getPremanagedProperties(DependencyNode node) {
        if ((node.getManagedBits() & DependencyNode.MANAGED_PROPERTIES) == 0) {
            return null;
        }
        return cast(node.getData().get(NODE_DATA_PREMANAGED_PROPERTIES), Map.class);
```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DependencyManagerUtils.java`
#### Snippet
```java
    public static Collection<Exclusion> getPremanagedExclusions(DependencyNode node) {
        if ((node.getManagedBits() & DependencyNode.MANAGED_EXCLUSIONS) == 0) {
            return null;
        }
        return cast(node.getData().get(NODE_DATA_PREMANAGED_EXCLUSIONS), Collection.class);
```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DependencyManagerUtils.java`
#### Snippet
```java

    private static <T> T cast(Object obj, Class<T> type) {
        return type.isInstance(obj) ? type.cast(obj) : null;
    }
}
```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/manager/DependencyManagerUtils.java`
#### Snippet
```java
    public static String getPremanagedScope(DependencyNode node) {
        if ((node.getManagedBits() & DependencyNode.MANAGED_SCOPE) == 0) {
            return null;
        }
        return cast(node.getData().get(NODE_DATA_PREMANAGED_SCOPE), String.class);
```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/visitor/Stack.java`
#### Snippet
```java
    public E peek() {
        if (size <= 0) {
            return null;
        }
        return elements[size - 1];
```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/version/ChainedVersionFilter.java`
#### Snippet
```java
        if (filters.size() <= 1) {
            if (filters.isEmpty()) {
                return null;
            }
            return filters.iterator().next();
```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/version/ChainedVersionFilter.java`
#### Snippet
```java
            int count = filters.length - removed;
            if (count <= 0) {
                return null;
            }
            if (count == 1) {
```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/version/ChainedVersionFilter.java`
#### Snippet
```java
        if (filters.length <= 1) {
            if (filters.length <= 0) {
                return null;
            }
            return filters[0];
```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/selector/AndDependencySelector.java`
#### Snippet
```java
        if (childSelectors.size() <= 1) {
            if (childSelectors.isEmpty()) {
                return null;
            }
            return childSelectors.iterator().next();
```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/traverser/AndDependencyTraverser.java`
#### Snippet
```java
        if (childTraversers.size() <= 1) {
            if (childTraversers.isEmpty()) {
                return null;
            }
            return childTraversers.iterator().next();
```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/JavaDependencyContextRefiner.java`
#### Snippet
```java
        Dependency dependency = node.getDependency();
        if (dependency == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/JavaDependencyContextRefiner.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictResolver.java`
#### Snippet
```java
        private DependencyNode parent() {
            int size = parentNodes.size();
            return (size <= 0) ? null : parentNodes.get(size - 1);
        }

```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictResolver.java`
#### Snippet
```java

        private String scope(Dependency dependency) {
            return (dependency != null) ? dependency.getScope() : null;
        }

```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/ChecksumUtils.java`
#### Snippet
```java
    public static byte[] fromHexString(String hexString) {
        if (hexString == null) {
            return null;
        }
        if (hexString.isEmpty()) {
```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/ChecksumUtils.java`
#### Snippet
```java
    public static String toHexString(byte[] bytes) {
        if (bytes == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/AuthenticationBuilder.java`
#### Snippet
```java
    public Authentication build() {
        if (authentications.isEmpty()) {
            return null;
        }
        if (authentications.size() == 1) {
```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/DefaultProxySelector.java`
#### Snippet
```java
        }

        return (proxy != null) ? proxy.proxy : null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/SecretAuthentication.java`
#### Snippet
```java

    private static char[] copy(char[] chars) {
        return (chars != null) ? chars.clone() : null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/JreProxySelector.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/DefaultMirrorSelector.java`
#### Snippet
```java

        if (mirror == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/DefaultMirrorSelector.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `maven-resolver-connector-basic/src/main/java/org/eclipse/aether/connector/basic/ChecksumCalculator.java`
#### Snippet
```java
            File targetFile, Collection<ChecksumAlgorithmFactory> checksumAlgorithmFactories) {
        if (checksumAlgorithmFactories == null || checksumAlgorithmFactories.isEmpty()) {
            return null;
        }
        return new ChecksumCalculator(targetFile, checksumAlgorithmFactories);
```

### ReturnNull
Return of `null`
in `maven-resolver-connector-basic/src/main/java/org/eclipse/aether/connector/basic/ChecksumValidator.java`
#### Snippet
```java
            return ChecksumCalculator.newInstance(targetFile, checksumAlgorithmFactories);
        }
        return null;
    }

```

## RuleId[id=ArrayEquality]
### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/selector/ExclusionDependencySelector.java`
#### Snippet
```java
            }
        }
        if (merged == this.exclusions) {
            return this;
        }
```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `v`
in `maven-resolver-named-locks/src/main/java/org/eclipse/aether/named/support/NamedLockFactorySupport.java`
#### Snippet
```java
        return locks.compute(name, (k, v) -> {
                    if (v == null) {
                        v = new NamedLockHolder(createLock(k));
                    }
                    v.incRef();
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/HttpTransporter.java`
#### Snippet
```java
            HttpEntity entity = response.getEntity();
            if (entity == null) {
                entity = new ByteArrayEntity(new byte[0]);
            }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-resolver-impl/src/main/java/org/eclipse/aether/internal/impl/PrioritizedComponents.java`
#### Snippet
```java
            keys.add(ConfigurationProperties.PREFIX_PRIORITY + sn.substring(0, sn.length() - FACTORY_SUFFIX.length()));
        }
        return keys.toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-resolver-api/src/main/java/org/eclipse/aether/graph/Dependency.java`
#### Snippet
```java
                exclusions = new LinkedHashSet<>(exclusions);
            }
            this.exclusions = exclusions.toArray(new Exclusion[0]);
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-resolver-api/src/main/java/org/eclipse/aether/repository/RemoteRepository.java`
#### Snippet
```java
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(Arrays.asList(repos.toArray(new RemoteRepository[0])));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/version/ChainedVersionFilter.java`
#### Snippet
```java
            return filters.iterator().next();
        }
        return new ChainedVersionFilter(filters.toArray(new VersionFilter[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ChainedDependencyGraphTransformer.java`
#### Snippet
```java
    public ChainedDependencyGraphTransformer(DependencyGraphTransformer... transformers) {
        if (transformers == null) {
            this.transformers = new DependencyGraphTransformer[0];
        } else {
            this.transformers = transformers;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/selector/ExclusionDependencySelector.java`
#### Snippet
```java
            TreeSet<Exclusion> sorted = new TreeSet<>(ExclusionComparator.INSTANCE);
            sorted.addAll(exclusions);
            this.exclusions = sorted.toArray(new Exclusion[0]);
        } else {
            this.exclusions = new Exclusion[0];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/selector/ExclusionDependencySelector.java`
#### Snippet
```java
            this.exclusions = sorted.toArray(new Exclusion[0]);
        } else {
            this.exclusions = new Exclusion[0];
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/selector/ExclusionDependencySelector.java`
#### Snippet
```java
     */
    public ExclusionDependencySelector() {
        this.exclusions = new Exclusion[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/ChecksumUtils.java`
#### Snippet
```java
        }
        if (hexString.isEmpty()) {
            return new byte[] {};
        }
        int len = hexString.length();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/ChainedAuthentication.java`
#### Snippet
```java
    ChainedAuthentication(Collection<? extends Authentication> authentications) {
        if (authentications != null && !authentications.isEmpty()) {
            this.authentications = authentications.toArray(new Authentication[0]);
        } else {
            this.authentications = new Authentication[0];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/ChainedAuthentication.java`
#### Snippet
```java
            this.authentications = authentications.toArray(new Authentication[0]);
        } else {
            this.authentications = new Authentication[0];
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/ChainedAuthentication.java`
#### Snippet
```java
            this.authentications = authentications.clone();
        } else {
            this.authentications = new Authentication[0];
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/repository/DefaultProxySelector.java`
#### Snippet
```java
                }
            }
            this.patterns = patterns.toArray(new Pattern[0]);
        }

```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `maven-resolver-transport-http/src/main/java/org/eclipse/aether/transport/http/GlobalState.java`
#### Snippet
```java
                cache = (GlobalState) tmp;
            } else {
                synchronized (GlobalState.class) {
                    tmp = repoCache.get(session, KEY);
                    if (tmp instanceof GlobalState) {
```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[-_a-zA-Z0-9]+)`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String KEY_VAL = "(?:[-_a-zA-Z0-9]+)\\s*:\\s*(?:[-_a-zA-Z0-9]*)";

    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";

    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[-_a-zA-Z0-9]*)`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String KEY_VAL = "(?:[-_a-zA-Z0-9]+)\\s*:\\s*(?:[-_a-zA-Z0-9]*)";

    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";

    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[-_a-zA-Z0-9]+)`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String KEY_VAL = "(?:[-_a-zA-Z0-9]+)\\s*:\\s*(?:[-_a-zA-Z0-9]*)";

    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";

    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[-_a-zA-Z0-9]*)`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String KEY_VAL = "(?:[-_a-zA-Z0-9]+)\\s*:\\s*(?:[-_a-zA-Z0-9]*)";

    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";

    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[-_a-zA-Z0-9]+)`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String RELOCATIONS = "relocations\\s*=\\s*(" + COORDS_NC + "(?:\\s*,\\s*" + COORDS_NC + ")*)";

    static final String KEY_VAL = "(?:[-_a-zA-Z0-9]+)\\s*:\\s*(?:[-_a-zA-Z0-9]*)";

    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[-_a-zA-Z0-9]*)`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String RELOCATIONS = "relocations\\s*=\\s*(" + COORDS_NC + "(?:\\s*,\\s*" + COORDS_NC + ")*)";

    static final String KEY_VAL = "(?:[-_a-zA-Z0-9]+)\\s*:\\s*(?:[-_a-zA-Z0-9]*)";

    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\^([-_a-zA-Z0-9]+))`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
            + ")?" + "(?:\\s+" + RELOCATIONS + ")?" + "(?:\\s+" + ID + ")?";

    static final String LINE = "(?:" + IDREF + ")|(?:" + NODE + ")";

    private static final Pattern PATTERN = Pattern.compile(LINE);
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:missingValue)`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
            + ")?" + "(?:\\s+" + RELOCATIONS + ")?" + "(?:\\s+" + ID + ")?";

    static final String LINE = "(?:" + IDREF + ")|(?:" + NODE + ")";

    private static final Pattern PATTERN = Pattern.compile(LINE);
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[-_a-zA-Z0-9]+)`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";

    static final String NODE = COORDSX + "(?:\\s+" + PROPS + ")?" + "(?:\\s+" + SCOPE + ")?" + "(?:\\s+" + OPTIONAL
            + ")?" + "(?:\\s+" + RELOCATIONS + ")?" + "(?:\\s+" + ID + ")?";

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[-_a-zA-Z0-9]*)`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";

    static final String NODE = COORDSX + "(?:\\s+" + PROPS + ")?" + "(?:\\s+" + SCOPE + ")?" + "(?:\\s+" + OPTIONAL
            + ")?" + "(?:\\s+" + RELOCATIONS + ")?" + "(?:\\s+" + ID + ")?";

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[\(\[][^\(\)\[\]]+[\)\]])`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/NodeDefinition.java`
#### Snippet
```java
    static final String PROPS = "props\\s*=\\s*(" + KEY_VAL + "(?:\\s*,\\s*" + KEY_VAL + ")*)";

    static final String COORDSX = "(" + COORDS_NC + ")" + RANGE + "?(?:<((?:" + RANGE_NC + ")|\\S+))?";

    static final String NODE = COORDSX + "(?:\\s+" + PROPS + ")?" + "(?:\\s+" + SCOPE + ")?" + "(?:\\s+" + OPTIONAL
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `retValue` initializer `null` is redundant
in `maven-resolver-transport-file/src/main/java/org/eclipse/aether/transport/file/PathUtils.java`
#### Snippet
```java
        String protocol = PathUtils.protocol(url);

        String retValue = null;

        if (protocol.length() > 0) {
```

### UnusedAssignment
Variable `canonDir` initializer `null` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileProcessor.java`
#### Snippet
```java
        }

        File canonDir = null;
        try {
            canonDir = directory.getCanonicalFile();
```

### UnusedAssignment
Variable `total` initializer `0` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileProcessor.java`
#### Snippet
```java

    public long copy(File source, File target, ProgressListener listener) throws IOException {
        long total = 0;

        InputStream fis = null;
```

### UnusedAssignment
Variable `canonDir` initializer `null` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestFileUtils.java`
#### Snippet
```java
        }

        File canonDir = null;
        try {
            canonDir = directory.getCanonicalFile();
```

### UnusedAssignment
Variable `line` initializer `null` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java

    private ArtifactDescription parse(Reader reader) throws IOException {
        String line = null;

        State state = State.NONE;
```

### UnusedAssignment
Variable `prefix` initializer `""` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/IniArtifactDataReader.java`
#### Snippet
```java
class IniArtifactDataReader {

    private String prefix = "";

    /**
```

### UnusedAssignment
Variable `line` initializer `null` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
        Iterator<String> substitutionIterator = (substitutions != null) ? substitutions.iterator() : null;

        String line = null;

        DependencyNode root = null;
```

### UnusedAssignment
The value `null` assigned to `reader` is never used
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java
                if (reader != null) {
                    reader.close();
                    reader = null;
                }
            } catch (final IOException e) {
```

### UnusedAssignment
Variable `root` initializer `null` is redundant
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/DependencyGraphParser.java`
#### Snippet
```java

        List<DependencyNode> ret = new ArrayList<>();
        DependencyNode root = null;
        while ((root = parse(reader)) != null) {
            ret.add(root);
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `version == null` is always `false` when reached
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestVersion.java`
#### Snippet
```java
        final int prime = 31;
        int result = 1;
        result = prime * result + ((version == null) ? 0 : version.hashCode());
        return result;
    }
```

### ConstantValue
Condition `version == null` is always `false`
in `maven-resolver-test-util/src/main/java/org/eclipse/aether/internal/test/util/TestVersion.java`
#### Snippet
```java
        }
        TestVersion other = (TestVersion) obj;
        if (version == null) {
            if (other.version != null) {
                return false;
```

### ConstantValue
Condition `results != null` is always `true`
in `maven-resolver-api/src/main/java/org/eclipse/aether/resolution/ArtifactResolutionException.java`
#### Snippet
```java
    public ArtifactResolutionException(List<ArtifactResult> results) {
        super(getMessage(results), getCause(results));
        this.results = (results != null) ? results : Collections.<ArtifactResult>emptyList();
    }

```

### ConstantValue
Condition `results != null` is always `true`
in `maven-resolver-api/src/main/java/org/eclipse/aether/resolution/ArtifactResolutionException.java`
#### Snippet
```java
    public ArtifactResolutionException(List<ArtifactResult> results, String message) {
        super(message, getCause(results));
        this.results = (results != null) ? results : Collections.<ArtifactResult>emptyList();
    }

```

### ConstantValue
Value `parent` is always 'null'
in `maven-resolver-util/src/main/java/org/eclipse/aether/util/graph/transformer/ConflictResolver.java`
#### Snippet
```java
            DependencyNode parent = parent();
            if (parent == null) {
                ConflictItem item = newConflictItem(parent, node);
                items.add(item);
            } else {
```

