# maven-dependency-plugin 
 
# Bad smells
I found 186 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 72 | false |
| BoundedWildcard | 28 | false |
| DefaultAnnotationParam | 17 | false |
| RedundantFieldInitialization | 16 | false |
| ReturnNull | 10 | false |
| IgnoreResultOfCall | 8 | false |
| MismatchedCollectionQueryUpdate | 5 | false |
| ZeroLengthArrayInitialization | 4 | false |
| DataFlowIssue | 3 | false |
| AssignmentToMethodParameter | 3 | false |
| CommentedOutCode | 2 | false |
| ObsoleteCollection | 2 | false |
| RegExpSimplifiable | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| DeprecatedIsStillUsed | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| StringEqualsEmptyString | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| NestedAssignment | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| CodeBlock2Expr | 1 | true |
| HtmlWrongAttributeValue | 1 | false |
## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `DependencyUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyUtil.java`
#### Snippet
```java
 * @author <a href="mailto:brianf@apache.org">Brian Fox</a>
 */
public final class DependencyUtil {

    /**
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolvePluginsMojo.java`
#### Snippet
```java
                        } catch (NullPointerException e) {
                            // ignore the null pointer, we'll output a null string
                            artifactFilename = null;
                        }
                    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolvePluginsMojo.java`
#### Snippet
```java
                                } catch (NullPointerException e) {
                                    // ignore the null pointer, we'll output a null string
                                    artifactFilename = null;
                                }
                            }
```

### DataFlowIssue
Argument `artifacts` might be null
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
        }

        List<Artifact> artList = new ArrayList<>(artifacts);

        StringBuilder sb = new StringBuilder();
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'containsVersion' is still used
in `src/main/java/org/apache/maven/plugins/dependency/tree/TreeMojo.java`
#### Snippet
```java
     */
    @Deprecated
    public static boolean containsVersion(VersionRange allowedRange, ArtifactVersion theVersion) {
        ArtifactVersion recommendedVersion = allowedRange.getRecommendedVersion();
        if (recommendedVersion == null) {
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (13 lines)
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolvePluginsMojo.java`
#### Snippet
```java
        // final ArtifactFilter filter = getPluginFilter();
        for (final Artifact artifact : new LinkedHashSet<>(artifacts)) {
            // if ( !filter.include( artifact ) )
            // {
            // final String logStr =
```

### CommentedOutCode
Commented out code (15 lines)
in `src/main/java/org/apache/maven/plugins/dependency/utils/translators/ClassifierTypeTranslator.java`
#### Snippet
```java
            coordinate.setExtension(extension);

            // // Create a new artifact
            // Artifact newArtifact = factory.createArtifactWithClassifier( artifact.getGroupId(), artifact
            // .getArtifactId(), artifact.getVersion(), useType, useClassifier );
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `src/main/java/org/apache/maven/plugins/dependency/tree/BuildingDependencyNodeVisitor.java`
#### Snippet
```java
        this.visitor = visitor;

        parentNodes = new Stack<DependencyNode>();
    }

```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `src/main/java/org/apache/maven/plugins/dependency/tree/BuildingDependencyNodeVisitor.java`
#### Snippet
```java
     * The resultant tree parent nodes for the currently visited node.
     */
    private final Stack<DependencyNode> parentNodes;

    /**
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\s]` can be simplified to '\\s'
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyUtil.java`
#### Snippet
```java
        if (!StringUtils.isEmpty(str)) {
            // remove initial and ending spaces, plus all spaces next to commas
            ret = str.trim().replaceAll("[\\s]*,[\\s]*", ",");
        }

```

### RegExpSimplifiable
`[\\s]` can be simplified to '\\s'
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyUtil.java`
#### Snippet
```java
        if (!StringUtils.isEmpty(str)) {
            // remove initial and ending spaces, plus all spaces next to commas
            ret = str.trim().replaceAll("[\\s]*,[\\s]*", ",");
        }

```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`manualIncludes.size() > 0` can be replaced with '!manualIncludes.isEmpty()'
in `src/main/java/org/apache/maven/plugins/dependency/PurgeLocalRepositoryMojo.java`
#### Snippet
```java
        }
        // If it's a manual purge, the only step is to delete from the local repo
        if (manualIncludes != null && manualIncludes.size() > 0) {
            manualPurge(manualIncludes);
            return;
```

### SizeReplaceableByIsEmpty
`missingArtifacts.size() > 0` can be replaced with '!missingArtifacts.isEmpty()'
in `src/main/java/org/apache/maven/plugins/dependency/PurgeLocalRepositoryMojo.java`
#### Snippet
```java
        }

        if (missingArtifacts.size() > 0) {
            StringBuilder message = new StringBuilder("required artifacts missing:");
            message.append(System.lineSeparator());
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ModuleDescriptor` may be 'static'
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolveDependenciesMojo.java`
#### Snippet
```java
    }

    private class ModuleDescriptor {
        String name;

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AnalyzeReportView.java`
#### Snippet
```java
     * @param iter {@link Artifact}
     */
    public void generateDependenciesTable(Sink sink, Iterator<Artifact> iter) {
        sink.table();
        sink.tableRows(null, false);
```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AnalyzeDuplicateMojo.java`
#### Snippet
```java
    }

    private Set<String> findDuplicateDependencies(List<Dependency> modelDependencies) {
        List<String> modelDependencies2 = new ArrayList<>();
        for (Dependency dep : modelDependencies) {
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
    }

    private void writeDependencyXML(Set<Artifact> artifacts) {
        if (!artifacts.isEmpty()) {
            getLog().info("Add the following to your pom to correct the missing dependencies: ");
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
    }

    private void logArtifacts(Set<Artifact> artifacts, boolean warn) {
        if (artifacts.isEmpty()) {
            getLog().info("   None");
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
    }

    private void filterArtifactsByScope(Set<Artifact> artifacts, String scope) {
        artifacts.removeIf(artifact -> artifact.getScope().equals(scope));
    }
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
    }

    private void writeScriptableOutput(Set<Artifact> artifacts) {
        if (!artifacts.isEmpty()) {
            getLog().info("Missing dependencies: ");
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/utils/translators/ClassifierTypeTranslator.java`
#### Snippet
```java
     */
    @Override
    public Set<ArtifactCoordinate> translate(Set<Artifact> artifacts, Log log) {
        Set<ArtifactCoordinate> results;

```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
     * @param resolvedDependencies The resolvedDependencies to set.
     */
    public void setResolvedDependencies(Set<Artifact> resolvedDependencies) {
        if (resolvedDependencies != null) {
            this.resolvedDependencies = new LinkedHashSet<>(resolvedDependencies);
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
     * @param skipped set of {@link Artifact}
     */
    public DependencyStatusSets(Set<Artifact> resolved, Set<Artifact> unResolved, Set<Artifact> skipped) {
        if (resolved != null) {
            this.resolvedDependencies = new LinkedHashSet<>(resolved);
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
     * @param skipped set of {@link Artifact}
     */
    public DependencyStatusSets(Set<Artifact> resolved, Set<Artifact> unResolved, Set<Artifact> skipped) {
        if (resolved != null) {
            this.resolvedDependencies = new LinkedHashSet<>(resolved);
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
     * @param skipped set of {@link Artifact}
     */
    public DependencyStatusSets(Set<Artifact> resolved, Set<Artifact> unResolved, Set<Artifact> skipped) {
        if (resolved != null) {
            this.resolvedDependencies = new LinkedHashSet<>(resolved);
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
     * @param unResolvedDependencies The unResolvedDependencies to set.
     */
    public void setUnResolvedDependencies(Set<Artifact> unResolvedDependencies) {
        if (unResolvedDependencies != null) {
            this.unResolvedDependencies = new LinkedHashSet<>(unResolvedDependencies);
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
     * @param skippedDependencies The skippedDependencies to set.
     */
    public void setSkippedDependencies(Set<Artifact> skippedDependencies) {
        if (skippedDependencies != null) {
            this.skippedDependencies = new LinkedHashSet<>(skippedDependencies);
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/CopyDependenciesMojo.java`
#### Snippet
```java
     * @throws MojoExecutionException in case of errors.
     */
    public void copyPoms(File destDir, Set<Artifact> artifacts, boolean removeVersion, boolean removeClassifier)
            throws MojoExecutionException {

```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/AbstractFromConfigurationMojo.java`
#### Snippet
```java
     * @return the found dependency
     */
    private boolean findDependencyVersion(ArtifactItem artifact, List<Dependency> dependencies, boolean looseMatch) {
        for (Dependency dependency : dependencies) {
            if (Objects.equals(dependency.getArtifactId(), artifact.getArtifactId())
```

### BoundedWildcard
Can generalize to `? extends ArtifactCoordinate`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @throws MojoExecutionException in case of error.
     */
    protected Set<Artifact> resolve(Set<ArtifactCoordinate> coordinates, boolean stopOnFailure)
            throws MojoExecutionException {
        ProjectBuildingRequest buildingRequest = newResolveArtifactProjectBuildingRequest();
```

### BoundedWildcard
Can generalize to `? super Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
    }

    private void addParentArtifacts(MavenProject project, Set<Artifact> artifacts) throws MojoExecutionException {
        while (project.hasParent()) {
            project = project.getParent();
```

### BoundedWildcard
Can generalize to `? extends DependableCoordinate`
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/GoOfflineMojo.java`
#### Snippet
```java
    private Set<Artifact> resolveDependableCoordinate(
            final ProjectBuildingRequest buildingRequest,
            final Collection<DependableCoordinate> dependableCoordinates,
            final String type)
            throws DependencyResolverException {
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/PurgeLocalRepositoryMojo.java`
#### Snippet
```java
    }

    private void purgeArtifacts(MavenProject theProject, Set<Artifact> artifacts) {
        MessageBuilder messageBuilder = MessageUtils.buffer();

```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `src/main/java/org/apache/maven/plugins/dependency/PurgeLocalRepositoryMojo.java`
#### Snippet
```java

    private Set<Artifact> getFilteredResolvedArtifacts(
            MavenProject theProject, List<Dependency> dependencies, TransformableFilter filter) {
        try {
            Iterable<ArtifactResult> results = dependencyResolver.resolveDependencies(
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/PurgeLocalRepositoryMojo.java`
#### Snippet
```java
    }

    private void reResolveArtifacts(MavenProject theProject, Set<Artifact> artifacts)
            throws ArtifactResolutionException {
        // Always need to re-resolve the poms in case they were purged along with the artifact
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/PurgeLocalRepositoryMojo.java`
#### Snippet
```java
     */
    private TransformableFilter createPurgeArtifactsFilter(
            MavenProject theProject, List<Dependency> dependencies, Set<Artifact> purgedArtifacts) {
        List<TransformableFilter> subFilters = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `src/main/java/org/apache/maven/plugins/dependency/PurgeLocalRepositoryMojo.java`
#### Snippet
```java
         * @param directDependencies Set of dependencies objects which represent the direct dependencies of the project
         */
        DirectDependencyFilter(Artifact projectArtifact, List<Dependency> directDependencies) {
            this.projectArtifact = projectArtifact;
            this.directDependencies = directDependencies;
```

### BoundedWildcard
Can generalize to `? extends Exclusion`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AnalyzeDepMgt.java`
#### Snippet
```java
     * @return a map of the exclusions using the Dependency ManagementKey as the keyset.
     */
    public Map<String, Exclusion> addExclusions(List<Exclusion> exclusionList) {
        if (exclusionList != null) {
            return exclusionList.stream().collect(Collectors.toMap(this::getExclusionKey, exclusion -> exclusion));
```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AnalyzeDepMgt.java`
#### Snippet
```java
     */
    public Map<Artifact, Dependency> getMismatch(
            Map<String, Dependency> depMgtMap, Set<Artifact> allDependencyArtifacts) {
        Map<Artifact, Dependency> mismatchMap = new HashMap<>();

```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AnalyzeDepMgt.java`
#### Snippet
```java
     */
    public Map<Artifact, Dependency> getMismatch(
            Map<String, Dependency> depMgtMap, Set<Artifact> allDependencyArtifacts) {
        Map<Artifact, Dependency> mismatchMap = new HashMap<>();

```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AnalyzeDepMgt.java`
#### Snippet
```java
     * @return list of artifacts that should have been excluded.
     */
    public List<Artifact> getExclusionErrors(Map<String, Exclusion> exclusions, Set<Artifact> allDependencyArtifacts) {
        return allDependencyArtifacts.stream()
                .filter(artifact -> exclusions.containsKey(getExclusionKey(artifact)))
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolveDependenciesMojo.java`
#### Snippet
```java

    private StringBuilder buildArtifactListOutput(
            Set<Artifact> artifacts, boolean outputAbsoluteArtifactFilename, boolean theOutputScope, boolean theSort) {
        StringBuilder sb = new StringBuilder();
        List<String> artifactStringList = new ArrayList<>();
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java

    private String filterEmptyString(String in) {
        if ("".equals(in)) {
            return null;
        }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyUtil.java`
#### Snippet
```java
    public static synchronized void write(String string, File file, boolean append, String encoding)
            throws IOException {
        file.getParentFile().mkdirs();

        try (Writer writer = new OutputStreamWriter(new FileOutputStream(file, append), encoding)) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/SourcesFileMarkerHandler.java`
#### Snippet
```java
        // create marker file
        try {
            marker.getParentFile().mkdirs();
        } catch (NullPointerException e) {
            // parent is null, ignore it.
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/SourcesFileMarkerHandler.java`
#### Snippet
```java

        try {
            marker.createNewFile();
            // clear the other file if it exists.
            if (clearMarker.exists()) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/dependency/AbstractDependencyMojo.java`
#### Snippet
```java
            logUnpack(file, location, includes, excludes);

            location.mkdirs();
            if (!location.exists()) {
                throw new MojoExecutionException(
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/AbstractFromConfigurationMojo.java`
#### Snippet
```java
                artifactItem.setOutputDirectory(this.outputDirectory);
            }
            artifactItem.getOutputDirectory().mkdirs();

            // make sure we have a version.
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/DefaultFileMarkerHandler.java`
#### Snippet
```java
        // create marker file
        try {
            marker.getParentFile().mkdirs();
        } catch (NullPointerException e) {
            // parent is null, ignore it.
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/DefaultFileMarkerHandler.java`
#### Snippet
```java
        }
        try {
            marker.createNewFile();
        } catch (IOException e) {
            throw new MojoExecutionException("Unable to create Marker: " + marker.getAbsolutePath(), e);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
    private void storeClasspathFile(String cpString, File out) throws MojoExecutionException {
        // make sure the parent path exists.
        out.getParentFile().mkdirs();

        String encoding = Objects.toString(outputEncoding, "UTF-8");
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/dependency/DisplayAncestorsMojo.java`
#### Snippet
```java
 * @since 2.9
 */
@Mojo(name = "display-ancestors", threadSafe = true, requiresProject = true, defaultPhase = LifecyclePhase.VALIDATE)
public class DisplayAncestorsMojo extends AbstractMojo {

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AnalyzeDuplicateMojo.java`
#### Snippet
```java
 * @author <a href="mailto:vincent.siveton@gmail.com">Vincent Siveton</a>
 */
@Mojo(name = "analyze-duplicate", aggregator = false, threadSafe = true)
public class AnalyzeDuplicateMojo extends AbstractMojo {
    public static final String MESSAGE_DUPLICATE_DEP_IN_DEPENDENCIES =
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
     * @since 2.0
     */
    @Parameter(property = "mdep.fileSeparator", defaultValue = "")
    private String fileSeparator;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
     * @since 2.0
     */
    @Parameter(property = "mdep.localRepoProperty", defaultValue = "")
    private String localRepoProperty;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
     * @since 2.0
     */
    @Parameter(property = "mdep.pathSeparator", defaultValue = "")
    private String pathSeparator;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @since 2.0
     */
    @Parameter(property = "excludeGroupIds", defaultValue = "")
    protected String excludeGroupIds;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @since 2.0
     */
    @Parameter(property = "excludeScope", defaultValue = "")
    protected String excludeScope;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @since 2.0
     */
    @Parameter(property = "excludeClassifiers", defaultValue = "")
    protected String excludeClassifiers;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @since 2.0
     */
    @Parameter(property = "type", defaultValue = "")
    protected String type;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @since 2.0
     */
    @Parameter(property = "includeClassifiers", defaultValue = "")
    protected String includeClassifiers;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @since 2.0
     */
    @Parameter(property = "includeTypes", defaultValue = "")
    protected String includeTypes;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @since 2.0
     */
    @Parameter(property = "includeScope", defaultValue = "")
    protected String includeScope;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @since 2.0
     */
    @Parameter(property = "includeGroupIds", defaultValue = "")
    protected String includeGroupIds;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @since 2.0
     */
    @Parameter(property = "excludeArtifactIds", defaultValue = "")
    protected String excludeArtifactIds;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @since 2.0
     */
    @Parameter(property = "includeArtifactIds", defaultValue = "")
    protected String includeArtifactIds;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @since 2.0
     */
    @Parameter(property = "classifier", defaultValue = "")
    protected String classifier;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @since 2.0
     */
    @Parameter(property = "excludeTypes", defaultValue = "")
    protected String excludeTypes;

```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/org/apache/maven/plugins/dependency/tree/TreeMojo.java`
#### Snippet
```java
            buildingRequest.setProject(project);

            if (verbose) {
                rootNode = dependencyCollectorBuilder.collectDependencyGraph(buildingRequest, artifactFilter);
                dependencyTreeString = serializeDependencyTree(rootNode);
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/UnpackMojo.java`
#### Snippet
```java
    protected List<ArtifactItem> getProcessedArtifactItems(boolean removeVersion) throws MojoExecutionException {
        List<ArtifactItem> items =
                super.getProcessedArtifactItems(new ProcessArtifactItemsRequest(removeVersion, false, false, false));
        for (ArtifactItem artifactItem : items) {
            if (StringUtils.isEmpty(artifactItem.getIncludes())) {
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyUtil.java`
#### Snippet
```java
        if (!StringUtils.isEmpty(str)) {
            // remove initial and ending spaces, plus all spaces next to commas
            ret = str.trim().replaceAll("[\\s]*,[\\s]*", ",");
        }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#isWarnEnabled()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#fatalError(java.lang.String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#fatalError(java.lang.String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.CharSequence)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.CharSequence)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>false</code>
     * @see org.apache.maven.plugin.logging.Log#isErrorEnabled()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.CharSequence)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.CharSequence)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>0</code>
     * @see org.codehaus.plexus.logging.Logger#getThreshold()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>false</code>
     * @see org.apache.maven.plugin.logging.Log#isDebugEnabled()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#info(java.lang.String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#info(java.lang.String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#info(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#info(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#info(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.CharSequence)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.CharSequence)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>null</code>
     * @see org.codehaus.plexus.logging.Logger#getChildLogger(java.lang.String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>null</code>
     * @see org.codehaus.plexus.logging.Logger#getChildLogger(java.lang.String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#error(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#error(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#error(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#debug(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#debug(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#debug(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>null</code>
     * @see org.codehaus.plexus.logging.Logger#getName()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>false</code>
     * @see org.codehaus.plexus.logging.Logger#isFatalErrorEnabled()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#warn(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#warn(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#warn(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.CharSequence)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.CharSequence)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>false</code>
     * @see org.apache.maven.plugin.logging.Log#isInfoEnabled()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#fatalError(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#fatalError(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#fatalError(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#warn(java.lang.String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#warn(java.lang.String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#error(java.lang.String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#error(java.lang.String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#debug(java.lang.String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#debug(java.lang.String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin.logging` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/SourcesFileMarkerHandler.java`
#### Snippet
```java
     *         <code>false</code> otherwise
     * @throws MojoExecutionException If a security manager exists and its <code>{@link
     *          java.lang.SecurityManager#checkRead(java.lang.String)}</code> method denies read access to the file or
     *             directory
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/SourcesFileMarkerHandler.java`
#### Snippet
```java
     *         <code>false</code> otherwise
     * @throws MojoExecutionException If a security manager exists and its <code>{@link
     *          java.lang.SecurityManager#checkRead(java.lang.String)}</code> method denies read access to the file or
     *             directory
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/SourcesFileMarkerHandler.java`
#### Snippet
```java
     *         otherwise
     * @throws SecurityException If a security manager exists and its <code>{@link
     *          java.lang.SecurityManager#checkDelete}</code> method denies delete access to the file
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/DefaultFileMarkerHandler.java`
#### Snippet
```java
     *         <code>false</code> otherwise
     * @throws SecurityException If a security manager exists and its <code>{@link
     *          java.lang.SecurityManager#checkRead(java.lang.String)}</code> method denies read access to the file or
     *             directory
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/DefaultFileMarkerHandler.java`
#### Snippet
```java
     *         <code>false</code> otherwise
     * @throws SecurityException If a security manager exists and its <code>{@link
     *          java.lang.SecurityManager#checkRead(java.lang.String)}</code> method denies read access to the file or
     *             directory
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/DefaultFileMarkerHandler.java`
#### Snippet
```java
     *         otherwise
     * @throws SecurityException If a security manager exists and its <code>{@link
     *          java.lang.SecurityManager#checkDelete}</code> method denies delete access to the file
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugins.dependency` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
 *
 * @author <a href="mailto:brianf@apache.org">Brian Fox</a>
 * @see org.apache.maven.plugins.dependency.AbstractDependencyMojo
 */
public abstract class AbstractDependencyFilterMojo extends AbstractDependencyMojo {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolveDependenciesMojo.java`
#### Snippet
```java
            Class<?> moduleFinderClass = Class.forName("java.lang.module.ModuleFinder");

            java.nio.file.Path path = artifactFile.toPath();

            Method ofMethod = moduleFinderClass.getMethod("of", java.nio.file.Path[].class);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolveDependenciesMojo.java`
#### Snippet
```java
            java.nio.file.Path path = artifactFile.toPath();

            Method ofMethod = moduleFinderClass.getMethod("of", java.nio.file.Path[].class);
            Object moduleFinderInstance = ofMethod.invoke(null, new Object[] {new java.nio.file.Path[] {path}});

```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolveDependenciesMojo.java`
#### Snippet
```java

            Method ofMethod = moduleFinderClass.getMethod("of", java.nio.file.Path[].class);
            Object moduleFinderInstance = ofMethod.invoke(null, new Object[] {new java.nio.file.Path[] {path}});

            Method findAllMethod = moduleFinderClass.getMethod("findAll");
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolveDependenciesMojo.java`
#### Snippet
```java
            // do nothing
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyUtil.java`
#### Snippet
```java
        String line;

        while ((line = reader.readLine()) != null) {
            log.info(line);
        }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractSerializingVisitor()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/maven/plugins/dependency/tree/AbstractSerializingVisitor.java`
#### Snippet
```java
     * @param writer the writer to serialize to.
     */
    public AbstractSerializingVisitor(Writer writer) {
        if (writer instanceof PrintWriter) {
            this.writer = (PrintWriter) writer;
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/org/apache/maven/plugins/dependency/ListRepositoriesMojo.java`
#### Snippet
```java

        Map<RemoteRepository, RemoteRepository> mirrorMap = new HashMap<>();
        remoteProjectRepositories.forEach(repo -> {
            repo.getMirroredRepositories().forEach(mrepo -> mirrorMap.put(mrepo, repo));
        });
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `pomRemoteRepositories` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/dependency/ListClassesMojo.java`
#### Snippet
```java

    @Parameter(defaultValue = "${project.remoteArtifactRepositories}", readonly = true, required = true)
    private List<ArtifactRepository> pomRemoteRepositories;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `repositoryLayouts` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/dependency/ListClassesMojo.java`
#### Snippet
```java
     */
    @Component(role = ArtifactRepositoryLayout.class)
    private Map<String, ArtifactRepositoryLayout> repositoryLayouts;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `pomRemoteRepositories` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/dependency/GetMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "${project.remoteArtifactRepositories}", readonly = true, required = true)
    private List<ArtifactRepository> pomRemoteRepositories;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `repositoryLayouts` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/dependency/GetMojo.java`
#### Snippet
```java
     */
    @Component(role = ArtifactRepositoryLayout.class)
    private Map<String, ArtifactRepositoryLayout> repositoryLayouts;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `reactorProjects` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/dependency/PurgeLocalRepositoryMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "${reactorProjects}", readonly = true, required = true)
    private List<MavenProject> reactorProjects;

    /**
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/dependency/ListClassesMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "transitive", defaultValue = "false")
    private boolean transitive = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
    Set<Artifact> resolvedDependencies = null;

    Set<Artifact> unResolvedDependencies = null;

    Set<Artifact> skippedDependencies = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
    Set<Artifact> unResolvedDependencies = null;

    Set<Artifact> skippedDependencies = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
 */
public class DependencyStatusSets {
    Set<Artifact> resolvedDependencies = null;

    Set<Artifact> unResolvedDependencies = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractFromDependenciesMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "mdep.stripClassifier", defaultValue = "false")
    protected boolean stripClassifier = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractFromDependenciesMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "mdep.stripType", defaultValue = "false")
    protected boolean stripType = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractFromDependenciesMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "mdep.stripVersion", defaultValue = "false")
    protected boolean stripVersion = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java
     * @parameter
     */
    private String version = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "mdep.stripClassifier", defaultValue = "false")
    private boolean stripClassifier = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "mdep.stripVersion", defaultValue = "false")
    private boolean stripVersion = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "mdep.prependGroupId", defaultValue = "false")
    protected boolean prependGroupId = false;

    @Component
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/CopyMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "mdep.stripVersion", defaultValue = "false")
    private boolean stripVersion = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/CopyMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "mdep.prependGroupId", defaultValue = "false")
    private boolean prependGroupId = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/CopyMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "mdep.stripClassifier", defaultValue = "false")
    private boolean stripClassifier = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/CopyMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "mdep.useBaseVersion", defaultValue = "false")
    private boolean useBaseVersion = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AnalyzeDepMgt.java`
#### Snippet
```java
     */
    @Parameter(property = "mdep.analyze.failBuild", defaultValue = "false")
    private boolean failBuild = false;

    /**
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `repo`
in `src/main/java/org/apache/maven/plugins/dependency/ListClassesMojo.java`
#### Snippet
```java
                layout = getLayout(matcher.group(2).trim());
            }
            repo = matcher.group(3).trim();
        }
        return new MavenArtifactRepository(id, repo, layout, policy, policy);
```

### AssignmentToMethodParameter
Assignment to method parameter `artifacts`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java

            // the unskipped artifacts are in the resolved set.
            artifacts = status.getResolvedDependencies();

            // resolve the rest of the artifacts
```

### AssignmentToMethodParameter
Assignment to method parameter `project`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
    private void addParentArtifacts(MavenProject project, Set<Artifact> artifacts) throws MojoExecutionException {
        while (project.hasParent()) {
            project = project.getParent();

            if (artifacts.contains(project.getArtifact())) {
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-18-01-26-48.801.html`
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
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    @Override
    public Logger getChildLogger(String name) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    @Override
    public String getName() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolvePluginsMojo.java`
#### Snippet
```java
    @Override
    protected ArtifactsFilter getMarkedArtifactFilter() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java
    private String filterEmptyString(String in) {
        if ("".equals(in)) {
            return null;
        }
        return in;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
    @Override
    protected ArtifactsFilter getMarkedArtifactFilter() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java

        if (!outputFile.isFile()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/GoOfflineMojo.java`
#### Snippet
```java
    @Override
    protected ArtifactsFilter getMarkedArtifactFilter() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/GoOfflineMojo.java`
#### Snippet
```java
            return new ExcludeReactorProjectsDependencyFilter(this.reactorProjects, getLog());
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/dependency/PurgeLocalRepositoryMojo.java`
#### Snippet
```java
    private String gavToPath(String gav) {
        if (StringUtils.isEmpty(gav)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/dependency/tree/TreeMojo.java`
#### Snippet
```java
        }

        return filters.isEmpty() ? null : new AndDependencyNodeFilter(filters);
    }

```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
     */
    @Parameter
    private String[] ignoredUnusedDeclaredDependencies = new String[0];

    /**
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
     */
    @Parameter
    private String[] ignoredDependencies = new String[0];

    /**
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
     */
    @Parameter
    private String[] ignoredUsedUndeclaredDependencies = new String[0];

    /**
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
     */
    @Parameter
    private String[] ignoredNonTestScopedDependencies = new String[0];

    /**
```

