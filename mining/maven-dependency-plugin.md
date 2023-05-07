# maven-dependency-plugin 
 
# Bad smells
I found 274 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 166 | false |
| UNCHECKED_WARNING | 32 | false |
| JavadocDeclaration | 18 | false |
| FieldMayBeFinal | 13 | false |
| IgnoreResultOfCall | 8 | false |
| MismatchedCollectionQueryUpdate | 6 | false |
| DuplicatedCode | 5 | false |
| FieldCanBeLocal | 5 | false |
| DataFlowIssue | 3 | false |
| JavadocLinkAsPlainText | 3 | false |
| CommentedOutCode | 2 | false |
| RegExpSimplifiable | 2 | false |
| IOStreamConstructor | 2 | false |
| CdiInjectionPointsInspection | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| IfStatementWithIdenticalBranches | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| DanglingJavadoc | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AnalyzeDuplicateMojo.java`
#### Snippet
```java

        // @formatter:off
        return new LinkedHashSet<>(
                CollectionUtils.disjunction(modelDependencies2, new LinkedHashSet<>(modelDependencies2)));
        // @formatter:on
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AnalyzeDepMgt.java`
#### Snippet
```java

            // get dependencies for the project (including transitive)
            Set<Artifact> allDependencyArtifacts = new LinkedHashSet<>(project.getArtifacts());

            // don't warn if a dependency that is directly listed overrides
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
    public void setUnResolvedDependencies(Set<Artifact> unResolvedDependencies) {
        if (unResolvedDependencies != null) {
            this.unResolvedDependencies = new LinkedHashSet<>(unResolvedDependencies);
        } else {
            this.unResolvedDependencies = null;
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
    public void setUnResolvedDependencies(Set<Artifact> unResolvedDependencies) {
        if (unResolvedDependencies != null) {
            this.unResolvedDependencies = new LinkedHashSet<>(unResolvedDependencies);
        } else {
            this.unResolvedDependencies = null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
    public void setResolvedDependencies(Set<Artifact> resolvedDependencies) {
        if (resolvedDependencies != null) {
            this.resolvedDependencies = new LinkedHashSet<>(resolvedDependencies);
        } else {
            this.resolvedDependencies = null;
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
    public void setResolvedDependencies(Set<Artifact> resolvedDependencies) {
        if (resolvedDependencies != null) {
            this.resolvedDependencies = new LinkedHashSet<>(resolvedDependencies);
        } else {
            this.resolvedDependencies = null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
    public DependencyStatusSets(Set<Artifact> resolved, Set<Artifact> unResolved, Set<Artifact> skipped) {
        if (resolved != null) {
            this.resolvedDependencies = new LinkedHashSet<>(resolved);
        }
        if (unResolved != null) {
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
    public DependencyStatusSets(Set<Artifact> resolved, Set<Artifact> unResolved, Set<Artifact> skipped) {
        if (resolved != null) {
            this.resolvedDependencies = new LinkedHashSet<>(resolved);
        }
        if (unResolved != null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
        }
        if (unResolved != null) {
            this.unResolvedDependencies = new LinkedHashSet<>(unResolved);
        }
        if (skipped != null) {
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
        }
        if (unResolved != null) {
            this.unResolvedDependencies = new LinkedHashSet<>(unResolved);
        }
        if (skipped != null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
        }
        if (skipped != null) {
            this.skippedDependencies = new LinkedHashSet<>(skipped);
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
        }
        if (skipped != null) {
            this.skippedDependencies = new LinkedHashSet<>(skipped);
        }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
    public void setSkippedDependencies(Set<Artifact> skippedDependencies) {
        if (skippedDependencies != null) {
            this.skippedDependencies = new LinkedHashSet<>(skippedDependencies);
        } else {
            this.skippedDependencies = null;
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
    public void setSkippedDependencies(Set<Artifact> skippedDependencies) {
        if (skippedDependencies != null) {
            this.skippedDependencies = new LinkedHashSet<>(skippedDependencies);
        } else {
            this.skippedDependencies = null;
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolvePluginsMojo.java`
#### Snippet
```java

        // final ArtifactFilter filter = getPluginFilter();
        for (final Artifact artifact : new LinkedHashSet<>(artifacts)) {
            // if ( !filter.include( artifact ) )
            // {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java

            // resolve the rest of the artifacts
            resolvedArtifacts = resolve(new LinkedHashSet<>(coordinates), stopOnFailure);

            // calculate the artifacts not resolved.
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java

            // resolve the rest of the artifacts
            resolvedArtifacts = resolve(new LinkedHashSet<>(coordinates), stopOnFailure);

            // calculate the artifacts not resolved.
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java

            // resolve the rest of the artifacts
            resolvedArtifacts = resolve(new LinkedHashSet<>(coordinates), stopOnFailure);

            // calculate the artifacts not resolved.
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
        if (includeParents) {
            // add dependencies parents
            for (Artifact dep : new ArrayList<>(artifacts)) {
                addParentArtifacts(buildProjectFromArtifact(dep), artifacts);
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java

        // calculate the skipped artifacts
        Set<Artifact> skippedArtifacts = new LinkedHashSet<>(artifacts);
        skippedArtifacts.removeAll(unMarkedArtifacts);

```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java

        // calculate the skipped artifacts
        Set<Artifact> skippedArtifacts = new LinkedHashSet<>(artifacts);
        skippedArtifacts.removeAll(unMarkedArtifacts);

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
        }

        Set<Artifact> usedDeclared = new LinkedHashSet<>(analysis.getUsedDeclaredArtifacts());
        Map<Artifact, Set<String>> usedUndeclaredWithClasses =
                new LinkedHashMap<>(analysis.getUsedUndeclaredArtifactsWithClasses());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashMap' to 'java.util.Map\>'
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
        Set<Artifact> usedDeclared = new LinkedHashSet<>(analysis.getUsedDeclaredArtifacts());
        Map<Artifact, Set<String>> usedUndeclaredWithClasses =
                new LinkedHashMap<>(analysis.getUsedUndeclaredArtifactsWithClasses());
        Set<Artifact> unusedDeclared = new LinkedHashSet<>(analysis.getUnusedDeclaredArtifacts());
        Set<Artifact> nonTestScope = new LinkedHashSet<>(analysis.getTestArtifactsWithNonTestScope());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
        Map<Artifact, Set<String>> usedUndeclaredWithClasses =
                new LinkedHashMap<>(analysis.getUsedUndeclaredArtifactsWithClasses());
        Set<Artifact> unusedDeclared = new LinkedHashSet<>(analysis.getUnusedDeclaredArtifacts());
        Set<Artifact> nonTestScope = new LinkedHashSet<>(analysis.getTestArtifactsWithNonTestScope());

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
                new LinkedHashMap<>(analysis.getUsedUndeclaredArtifactsWithClasses());
        Set<Artifact> unusedDeclared = new LinkedHashSet<>(analysis.getUnusedDeclaredArtifacts());
        Set<Artifact> nonTestScope = new LinkedHashSet<>(analysis.getTestArtifactsWithNonTestScope());

        Set<Artifact> ignoredUsedUndeclared = new LinkedHashSet<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
        }

        List<Artifact> artList = new ArrayList<>(artifacts);

        StringBuilder sb = new StringBuilder();
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
        }

        List<Artifact> artList = new ArrayList<>(artifacts);

        StringBuilder sb = new StringBuilder();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolveDependenciesMojo.java`
#### Snippet
```java
            sb.append("The following files were skipped:");
            sb.append(System.lineSeparator());
            Set<Artifact> skippedDependencies = new LinkedHashSet<>(results.getSkippedDependencies());
            sb.append(buildArtifactListOutput(
                    skippedDependencies, outputAbsoluteArtifactFilename, theOutputScope, theSort));
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolveDependenciesMojo.java`
#### Snippet
```java
            sb.append("The following files were skipped:");
            sb.append(System.lineSeparator());
            Set<Artifact> skippedDependencies = new LinkedHashSet<>(results.getSkippedDependencies());
            sb.append(buildArtifactListOutput(
                    skippedDependencies, outputAbsoluteArtifactFilename, theOutputScope, theSort));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolveDependenciesMojo.java`
#### Snippet
```java
            sb.append("The following files have NOT been resolved:");
            sb.append(System.lineSeparator());
            Set<Artifact> unResolvedDependencies = new LinkedHashSet<>(results.getUnResolvedDependencies());
            sb.append(buildArtifactListOutput(
                    unResolvedDependencies, outputAbsoluteArtifactFilename, theOutputScope, theSort));
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolveDependenciesMojo.java`
#### Snippet
```java
            sb.append("The following files have NOT been resolved:");
            sb.append(System.lineSeparator());
            Set<Artifact> unResolvedDependencies = new LinkedHashSet<>(results.getUnResolvedDependencies());
            sb.append(buildArtifactListOutput(
                    unResolvedDependencies, outputAbsoluteArtifactFilename, theOutputScope, theSort));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolveDependenciesMojo.java`
#### Snippet
```java

            Method findAllMethod = moduleFinderClass.getMethod("findAll");
            Set<Object> moduleReferences = (Set<Object>) findAllMethod.invoke(moduleFinderInstance);

            // moduleReferences can be empty when referring to target/classes without module-info.class
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

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/utils/translators/ArtifactTranslator.java`
#### Snippet
```java
public interface ArtifactTranslator {
    /**
     * @param artifacts set of {@link Artifact}s.
     * @param log {@link Log}
     * @return {@link ArtifactCoordinate}
```

### JavadocReference
Cannot resolve symbol `Log`
in `src/main/java/org/apache/maven/plugins/dependency/utils/translators/ArtifactTranslator.java`
#### Snippet
```java
    /**
     * @param artifacts set of {@link Artifact}s.
     * @param log {@link Log}
     * @return {@link ArtifactCoordinate}
     */
```

### JavadocReference
Cannot resolve symbol `ArtifactCoordinate`
in `src/main/java/org/apache/maven/plugins/dependency/utils/translators/ArtifactTranslator.java`
#### Snippet
```java
     * @param artifacts set of {@link Artifact}s.
     * @param log {@link Log}
     * @return {@link ArtifactCoordinate}
     */
    Set<ArtifactCoordinate> translate(Set<Artifact> artifacts, Log log);
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/MarkerHandler.java`
#### Snippet
```java

    /**
     * @param artifact {@link Artifact}
     */
    void setArtifact(Artifact artifact);
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/MarkerHandler.java`
#### Snippet
```java
    /**
     * @return true/false.
     * @throws MojoExecutionException in case of an error.
     */
    boolean clearMarker() throws MojoExecutionException;
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/MarkerHandler.java`
#### Snippet
```java

    /**
     * @throws MojoExecutionException in case of an error.
     */
    void setMarker() throws MojoExecutionException;
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/MarkerHandler.java`
#### Snippet
```java
    /**
     * @return true/false.
     * @throws MojoExecutionException in case of an error.
     */
    boolean isMarkerSet() throws MojoExecutionException;
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/MarkerHandler.java`
#### Snippet
```java

    /**
     * @param artifact {@link Artifact}
     * @return true/false.
     * @throws MojoExecutionException in case of an error.
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/MarkerHandler.java`
#### Snippet
```java
     * @param artifact {@link Artifact}
     * @return true/false.
     * @throws MojoExecutionException in case of an error.
     */
    boolean isMarkerOlder(Artifact artifact) throws MojoExecutionException;
```

### JavadocReference
Cannot resolve symbol `ArtifactHandlerManager`
in `src/main/java/org/apache/maven/plugins/dependency/utils/translators/ClassifierTypeTranslator.java`
#### Snippet
```java

    /**
     * @param artifactHanderManager {@link ArtifactHandlerManager}.
     * @param theClassifier The classifier to use.
     * @param theType The type.
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolveDependencySourcesMojo.java`
#### Snippet
```java
     * Main entry into mojo. Gets the list of dependencies and iterates through resolving the source jars.
     *
     * @throws MojoExecutionException with a message if an error occurs.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/SourcesFileMarkerHandler.java`
#### Snippet
```java
     * @return <code>true</code> if and only if the file or directory denoted by this abstract pathname exists;
     *         <code>false</code> otherwise
     * @throws MojoExecutionException If a security manager exists and its <code>{@link
     *          java.lang.SecurityManager#checkRead(java.lang.String)}</code> method denies read access to the file or
     *             directory
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/SourcesFileMarkerHandler.java`
#### Snippet
```java

    /**
     * @param artifact {@link Artifact}
     * @param markerFilesDirectory marker files directory.
     * @param isResolved true/false.
```

### JavadocReference
Cannot resolve symbol `ArtifactFilter`
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ExcludeReactorProjectsArtifactFilter.java`
#### Snippet
```java

/**
 * {@link ArtifactFilter} implementation that excludes artifacts found in the Reactor.
 *
 * @author Maarten Mulders
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AnalyzeDepMgt.java`
#### Snippet
```java

    /**
     * @param artifact {@link Artifact}
     * @return The resulting GA.
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AnalyzeDepMgt.java`
#### Snippet
```java
     * @param dependencyArtifact the artifact that was resolved.
     * @param dependencyFromDepMgt the dependency listed in the DependencyManagement section.
     * @throws MojoExecutionException in case of errors.
     */
    public void logMismatch(Artifact dependencyArtifact, Dependency dependencyFromDepMgt)
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AnalyzeDepMgt.java`
#### Snippet
```java
     *
     * @return true if errors are found.
     * @throws MojoExecutionException
     */
    private boolean checkDependencyManagement() throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.logging.Logger`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#debug(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `debug(java.lang.String, java.lang.Throwable)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#debug(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.logging.Log`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `warn(java.lang.Throwable)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.logging.Logger`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>null</code>
     * @see org.codehaus.plexus.logging.Logger#getName()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getName()`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>null</code>
     * @see org.codehaus.plexus.logging.Logger#getName()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.logging.Logger`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#info(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `info(java.lang.String)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#info(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.logging.Logger`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#fatalError(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `fatalError(java.lang.String)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#fatalError(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.logging.Log`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.CharSequence)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `info(java.lang.CharSequence)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.CharSequence)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.logging.Logger`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>false</code>
     * @see org.codehaus.plexus.logging.Logger#isFatalErrorEnabled()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `isFatalErrorEnabled()`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>false</code>
     * @see org.codehaus.plexus.logging.Logger#isFatalErrorEnabled()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.logging.Logger`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>0</code>
     * @see org.codehaus.plexus.logging.Logger#getThreshold()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getThreshold()`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>0</code>
     * @see org.codehaus.plexus.logging.Logger#getThreshold()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.logging.Log`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `info(java.lang.Throwable)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.logging.Logger`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#warn(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `warn(java.lang.String)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#warn(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.logging.Log`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `debug(java.lang.CharSequence, java.lang.Throwable)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.logging.Logger`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#error(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `error(java.lang.String, java.lang.Throwable)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#error(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.logging.Log`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `info(java.lang.CharSequence, java.lang.Throwable)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#info(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.logging.Logger`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#debug(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `debug(java.lang.String)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#debug(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.logging.Log`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>false</code>
     * @see org.apache.maven.plugin.logging.Log#isInfoEnabled()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `isInfoEnabled()`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>false</code>
     * @see org.apache.maven.plugin.logging.Log#isInfoEnabled()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.logging.Log`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `debug(java.lang.Throwable)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.logging.Log`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.CharSequence)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `debug(java.lang.CharSequence)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#debug(java.lang.CharSequence)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.logging.Log`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.CharSequence)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `error(java.lang.CharSequence)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.CharSequence)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.logging.Log`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.CharSequence)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `warn(java.lang.CharSequence)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.CharSequence)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.logging.Log`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `error(java.lang.Throwable)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.logging.Logger`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#info(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `info(java.lang.String, java.lang.Throwable)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#info(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.logging.Logger`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#error(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `error(java.lang.String)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#error(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.logging.Log`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>false</code>
     * @see org.apache.maven.plugin.logging.Log#isDebugEnabled()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `isDebugEnabled()`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>false</code>
     * @see org.apache.maven.plugin.logging.Log#isDebugEnabled()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.logging.Log`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `warn(java.lang.CharSequence, java.lang.Throwable)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#warn(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.logging.Log`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>false</code>
     * @see org.apache.maven.plugin.logging.Log#isErrorEnabled()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `isErrorEnabled()`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>false</code>
     * @see org.apache.maven.plugin.logging.Log#isErrorEnabled()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.logging.Log`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `error(java.lang.CharSequence, java.lang.Throwable)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#error(java.lang.CharSequence, java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.logging.Log`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#isWarnEnabled()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `isWarnEnabled()`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.apache.maven.plugin.logging.Log#isWarnEnabled()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.logging.Logger`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>null</code>
     * @see org.codehaus.plexus.logging.Logger#getChildLogger(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getChildLogger(java.lang.String)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
    /**
     * @return <code>null</code>
     * @see org.codehaus.plexus.logging.Logger#getChildLogger(java.lang.String)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.logging.Logger`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#warn(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `warn(java.lang.String, java.lang.Throwable)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#warn(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.logging.Logger`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#fatalError(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `fatalError(java.lang.String, java.lang.Throwable)`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencySilentLog.java`
#### Snippet
```java
     * By default, do nothing.
     *
     * @see org.codehaus.plexus.logging.Logger#fatalError(java.lang.String, java.lang.Throwable)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `TransformableFilter`
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ExcludeReactorProjectsDependencyFilter.java`
#### Snippet
```java

/**
 * {@link TransformableFilter} implementation that excludes artifacts found in the Reactor.
 *
 * @author Maarten Mulders
```

### JavadocReference
Cannot resolve symbol `FileMapper`
in `src/main/java/org/apache/maven/plugins/dependency/utils/UnpackUtil.java`
#### Snippet
```java
     * @param encoding          the encoding.
     * @param ignorePermissions ignore permissions
     * @param fileMappers       {@link FileMapper}s to be used for rewriting each target path, or {@code null} if no
     *                          rewriting
     *                          shall happen.
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/utils/UnpackUtil.java`
#### Snippet
```java
     *                          shall happen.
     * @param logger            a Mojo logger
     * @throws MojoExecutionException in case of an error.
     */
    public void unpack(
```

### JavadocReference
Cannot resolve symbol `ArchiverManager`
in `src/main/java/org/apache/maven/plugins/dependency/utils/UnpackUtil.java`
#### Snippet
```java
     * Default constructor.
     *
     * @param archiverManager an archiver {@link ArchiverManager} to use
     * @param buildContext    a build context
     */
```

### JavadocReference
Cannot resolve symbol `ArtifactFilterException`
in `src/main/java/org/apache/maven/plugins/dependency/utils/filters/ArtifactItemFilter.java`
#### Snippet
```java
     * @param item {@link ArtifactItem}
     * @return true/false.
     * @throws ArtifactFilterException in case of an error.
     */
    boolean isArtifactIncluded(ArtifactItem item) throws ArtifactFilterException;
```

### JavadocReference
Cannot resolve symbol `ArtifactFilterException`
in `src/main/java/org/apache/maven/plugins/dependency/utils/filters/DestFileFilter.java`
#### Snippet
```java
     * @param file {@link File}
     * @return the last modification time in milliseconds.
     * @throws ArtifactFilterException in case of a IO Exception.
     */
    private long getLastModified(File file) throws ArtifactFilterException {
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyUtil.java`
#### Snippet
```java
     * @param removeVersion Specifies if the version should be removed from the file name.
     * @return Formatted file name in the format artifactId-[version]-[classifier].[type]
     * @see #getFormattedFileName(Artifact, boolean, boolean)
     */
    public static String getFormattedFileName(Artifact artifact, boolean removeVersion) {
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/CopyDependenciesMojo.java`
#### Snippet
```java

    /**
     * @param artifact {@link Artifact}
     * @return {@link Artifact}
     */
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/CopyDependenciesMojo.java`
#### Snippet
```java
    /**
     * @param artifact {@link Artifact}
     * @return {@link Artifact}
     */
    protected Artifact getResolvedPomArtifact(Artifact artifact) {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/CopyDependenciesMojo.java`
#### Snippet
```java
     * @param theUseBaseVersion specifies if the baseVersion of the artifact should be used instead of the version.
     * @param removeClassifier specifies if the classifier should be removed from the file name when copying.
     * @throws MojoExecutionException with a message if an error occurs.
     * @see #copyFile(File, File)
     * @see DependencyUtil#getFormattedOutputDirectory(boolean, boolean, boolean, boolean, boolean, boolean, File, Artifact)
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/CopyDependenciesMojo.java`
#### Snippet
```java
     * @throws MojoExecutionException with a message if an error occurs.
     * @see #copyFile(File, File)
     * @see DependencyUtil#getFormattedOutputDirectory(boolean, boolean, boolean, boolean, boolean, boolean, File, Artifact)
     */
    protected void copyArtifact(
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/CopyDependenciesMojo.java`
#### Snippet
```java
     * @param prependGroupId specifies if the groupId should be prepend to the file while copying.
     * @param theUseBaseVersion specifies if the baseVersion of the artifact should be used instead of the version.
     * @throws MojoExecutionException with a message if an error occurs.
     * @see #copyArtifact(Artifact, boolean, boolean, boolean, boolean)
     */
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/CopyDependenciesMojo.java`
#### Snippet
```java
     * @param theUseBaseVersion specifies if the baseVersion of the artifact should be used instead of the version.
     * @throws MojoExecutionException with a message if an error occurs.
     * @see #copyArtifact(Artifact, boolean, boolean, boolean, boolean)
     */
    protected void copyArtifact(
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/CopyDependenciesMojo.java`
#### Snippet
```java
     *
     * @param destDir The destination directory {@link File}.
     * @param artifacts The artifacts {@link Artifact}.
     * @param removeVersion remove version or not.
     * @throws MojoExecutionException in case of errors.
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/CopyDependenciesMojo.java`
#### Snippet
```java
     * @param artifacts The artifacts {@link Artifact}.
     * @param removeVersion remove version or not.
     * @throws MojoExecutionException in case of errors.
     */
    public void copyPoms(File destDir, Set<Artifact> artifacts, boolean removeVersion) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/CopyDependenciesMojo.java`
#### Snippet
```java
     * Main entry into mojo. Gets the list of dependencies and iterates through calling copyArtifact.
     *
     * @throws MojoExecutionException with a message if an error occurs.
     * @see #getDependencySets(boolean, boolean)
     * @see #copyArtifact(Artifact, boolean, boolean, boolean, boolean)
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/CopyDependenciesMojo.java`
#### Snippet
```java
     * @throws MojoExecutionException with a message if an error occurs.
     * @see #getDependencySets(boolean, boolean)
     * @see #copyArtifact(Artifact, boolean, boolean, boolean, boolean)
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/CopyDependenciesMojo.java`
#### Snippet
```java
     *
     * @param destDir The destination directory {@link File}.
     * @param artifacts The artifacts {@link Artifact}.
     * @param removeVersion remove version or not.
     * @param removeClassifier remove the classifier or not.
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/CopyDependenciesMojo.java`
#### Snippet
```java
     * @param removeVersion remove version or not.
     * @param removeClassifier remove the classifier or not.
     * @throws MojoExecutionException in case of errors.
     */
    public void copyPoms(File destDir, Set<Artifact> artifacts, boolean removeVersion, boolean removeClassifier)
```

### JavadocReference
Cannot resolve symbol `DependencyResolverException`
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/GoOfflineMojo.java`
#### Snippet
```java
     *
     * @return set of resolved dependency artifacts.
     * @throws DependencyResolverException in case of an error while resolving the artifacts.
     */
    protected Set<Artifact> resolveDependencyArtifacts() throws DependencyResolverException {
```

### JavadocReference
Cannot resolve symbol `DependencyResolverException`
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/GoOfflineMojo.java`
#### Snippet
```java
     *
     * @return set of resolved plugin artifacts.
     * @throws DependencyResolverException in case of an error while resolving the artifacts.
     */
    protected Set<Artifact> resolvePluginArtifacts() throws DependencyResolverException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/GoOfflineMojo.java`
#### Snippet
```java
     * through displaying the resolved versions.
     *
     * @throws MojoExecutionException with a message if an error occurs.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/PropertiesMojo.java`
#### Snippet
```java
     * Main entry into mojo. Gets the list of dependencies and iterates through setting a property for each artifact.
     *
     * @throws MojoExecutionException with a message if an error occurs.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `FileMapper`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java

    /**
     * @return {@link FileMapper}s to be used for rewriting each target path, or {@code null} if no rewriting shall
     *         happen.
     *
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java

    /**
     * @param artifact {@link Artifact}
     */
    public ArtifactItem(Artifact artifact) {
```

### JavadocReference
Cannot resolve symbol `FileMapper`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java

    /**
     * {@link FileMapper}s to be used for rewriting each target path, or {@code null} if no rewriting shall happen.
     *
     * @since 3.1.2
```

### JavadocReference
Cannot resolve symbol `FileMapper`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java

    /**
     * @param fileMappers {@link FileMapper}s to be used for rewriting each target path, or {@code null} if no
     * rewriting shall happen.
     *
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/CopyMojo.java`
#### Snippet
```java
     *
     * @param artifactItem containing the information about the Artifact to copy.
     * @throws MojoExecutionException with a message if an error occurs.
     * @see #copyFile(File, File)
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/CopyMojo.java`
#### Snippet
```java
     * copyArtifact.
     *
     * @throws MojoExecutionException with a message if an error occurs.
     * @see ArtifactItem
     * @see #getArtifactItems
```

### JavadocReference
Symbol `artifactItems` is inaccessible from here
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/CopyMojo.java`
#### Snippet
```java
    /**
     * The artifact to copy from command line. A string of the form groupId:artifactId:version[:packaging[:classifier]].
     * Use {@link #artifactItems} within the POM configuration.
     */
    @SuppressWarnings("unused") // marker-field, setArtifact(String) does the magic
```

### JavadocReference
Cannot resolve symbol `FileMapper`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/UnpackMojo.java`
#### Snippet
```java

    /**
     * {@link FileMapper} to be used for rewriting each target path, or {@code null} if no rewriting shall happen.
     *
     * @since 3.1.2
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/UnpackMojo.java`
#### Snippet
```java
     * unpackArtifact.
     *
     * @throws MojoExecutionException with a message if an error occurs.
     * @see ArtifactItem
     * @see #getArtifactItems
```

### JavadocReference
Cannot resolve symbol `FileMapper`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/UnpackMojo.java`
#### Snippet
```java

    /**
     * @param fileMappers {@link FileMapper}s to be used for rewriting each target path, or {@code null} if no
     * rewriting shall happen.
     *
```

### JavadocReference
Cannot resolve symbol `FileMapper`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/UnpackMojo.java`
#### Snippet
```java

    /**
     * @return {@link FileMapper}s to be used for rewriting each target path, or {@code null} if no rewriting shall
     *         happen.
     *
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/UnpackMojo.java`
#### Snippet
```java
     *
     * @param artifactItem containing the information about the Artifact to unpack.
     * @throws MojoExecutionException with a message if an error occurs.
     * @see #getArtifact
     */
```

### JavadocReference
Symbol `artifactItems` is inaccessible from here
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/UnpackMojo.java`
#### Snippet
```java
    /**
     * The artifact to unpack from command line. A string of the form
     * <code>groupId:artifactId:version[:packaging[:classifier]]</code>. Use {@link #artifactItems} within the POM
     * configuration.
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/UnpackMojo.java`
#### Snippet
```java
     * @param removeVersion removeVersion.
     * @return list of {@link ArtifactItem}
     * @throws MojoExecutionException in case of an error.
     */
    protected List<ArtifactItem> getProcessedArtifactItems(boolean removeVersion) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolvePluginsMojo.java`
#### Snippet
```java
     * Main entry into mojo. Gets the list of dependencies and iterates through displaying the resolved version.
     *
     * @throws MojoExecutionException with a message if an error occurs.
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `ArtifactFilterException`
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolvePluginsMojo.java`
#### Snippet
```java
     *
     * @return set of resolved plugin artifacts
     * @throws ArtifactFilterException in case of an error
     * @throws ArtifactResolverException in case of an error
     */
```

### JavadocReference
Cannot resolve symbol `ArtifactResolverException`
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolvePluginsMojo.java`
#### Snippet
```java
     * @return set of resolved plugin artifacts
     * @throws ArtifactFilterException in case of an error
     * @throws ArtifactResolverException in case of an error
     */
    protected Set<Artifact> resolvePluginArtifacts() throws ArtifactFilterException, ArtifactResolverException {
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java

    /**
     * @param resolved set of {@link Artifact}
     * @param unResolved set of {@link Artifact}
     * @param skipped set of {@link Artifact}
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
    /**
     * @param resolved set of {@link Artifact}
     * @param unResolved set of {@link Artifact}
     * @param skipped set of {@link Artifact}
     */
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/utils/DependencyStatusSets.java`
#### Snippet
```java
     * @param resolved set of {@link Artifact}
     * @param unResolved set of {@link Artifact}
     * @param skipped set of {@link Artifact}
     */
    public DependencyStatusSets(Set<Artifact> resolved, Set<Artifact> unResolved, Set<Artifact> skipped) {
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * Transform artifacts
     *
     * @param artifacts set of artifacts {@link Artifact}.
     * @param stopOnFailure true/false.
     * @return DependencyStatusSets - Bean of TreeSets that contains information on the projects dependencies
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @param stopOnFailure true/false.
     * @return DependencyStatusSets - Bean of TreeSets that contains information on the projects dependencies
     * @throws MojoExecutionException in case of an error.
     */
    protected DependencyStatusSets getClassifierTranslatedDependencies(Set<Artifact> artifacts, boolean stopOnFailure)
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @param stopOnFailure true to fail if resolution does not work or false not to fail.
     * @return A set of artifacts
     * @throws MojoExecutionException in case of errors.
     */
    protected Set<Artifact> getResolvedDependencies(boolean stopOnFailure) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `ArtifactsFilter`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java

    /**
     * Return an {@link ArtifactsFilter} indicating which artifacts must be filtered out.
     *
     * @return an {@link ArtifactsFilter} indicating which artifacts must be filtered out.
```

### JavadocReference
Cannot resolve symbol `ArtifactsFilter`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * Return an {@link ArtifactsFilter} indicating which artifacts must be filtered out.
     *
     * @return an {@link ArtifactsFilter} indicating which artifacts must be filtered out.
     */
    protected abstract ArtifactsFilter getMarkedArtifactFilter();
```

### JavadocReference
Cannot resolve symbol `ArtifactCoordinate`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java

    /**
     * @param coordinates The set of artifact coordinates{@link ArtifactCoordinate}.
     * @param stopOnFailure <code>true</code> if we should fail with exception if an artifact couldn't be resolved
     *            <code>false</code> otherwise.
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @param stopOnFailure <code>true</code> if we should fail with exception if an artifact couldn't be resolved
     *            <code>false</code> otherwise.
     * @return the resolved artifacts. {@link Artifact}.
     * @throws MojoExecutionException in case of error.
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     *            <code>false</code> otherwise.
     * @return the resolved artifacts. {@link Artifact}.
     * @throws MojoExecutionException in case of error.
     */
    protected Set<Artifact> resolve(Set<ArtifactCoordinate> coordinates, boolean stopOnFailure)
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @param stopOnFailure true/false.
     * @return {@link DependencyStatusSets}
     * @throws MojoExecutionException in case of an error.
     */
    protected DependencyStatusSets getDependencySets(boolean stopOnFailure) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @param includeParents <code>true</code> if parents should be included or not <code>false</code>.
     * @return DependencyStatusSets - Bean of TreeSets that contains information on the projects dependencies
     * @throws MojoExecutionException in case of errors.
     */
    protected DependencyStatusSets getDependencySets(boolean stopOnFailure, boolean includeParents)
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * Filter the marked dependencies
     *
     * @param artifacts The artifacts set {@link Artifact}.
     * @return status set {@link DependencyStatusSets}.
     * @throws MojoExecutionException in case of an error.
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
     * @param artifacts The artifacts set {@link Artifact}.
     * @return status set {@link DependencyStatusSets}.
     * @throws MojoExecutionException in case of an error.
     */
    protected DependencyStatusSets filterMarkedDependencies(Set<Artifact> artifacts) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/DefaultFileMarkerHandler.java`
#### Snippet
```java

    /**
     * @param theArtifact {@link Artifact}
     * @param theMarkerFilesDirectory The marker directory.
     */
```

### JavadocReference
Cannot resolve symbol `ProjectDependencyAnalyzer`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java

    /**
     * @return {@link ProjectDependencyAnalyzer}
     * @throws MojoExecutionException in case of an error.
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
    /**
     * @return {@link ProjectDependencyAnalyzer}
     * @throws MojoExecutionException in case of an error.
     */
    protected ProjectDependencyAnalyzer createProjectDependencyAnalyzer() throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `ProjectDependencyAnalyzer`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java

    /**
     * The plexus context to look-up the right {@link ProjectDependencyAnalyzer} implementation depending on the mojo
     * configuration.
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
    /**
     * @param cpString The classpath.
     * @throws MojoExecutionException in case of an error.
     */
    protected void attachFile(String cpString) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
     * Appends the artifact path into the specified StringBuilder.
     *
     * @param art {@link Artifact}
     * @param sb {@link StringBuilder}
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
     * Main entry into mojo. Gets the list of dependencies and iterates to create a classpath.
     *
     * @throws MojoExecutionException with a message if an error occurs.
     * @see #getResolvedDependencies(boolean)
     */
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/dependency/PurgeLocalRepositoryMojo.java`
#### Snippet
```java
     * @param theProject Maven project.
     * @param purgedArtifacts The artifacts that were already purged.
     * @throws MojoFailureException in case of errors during the purge.
     */
    private void purgeLocalRepository(MavenProject theProject, Set<Artifact> purgedArtifacts)
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/PurgeLocalRepositoryMojo.java`
#### Snippet
```java
     *
     * @param theIncludes The includes.
     * @throws MojoExecutionException in case of an error.
     */
    private void manualPurge(List<String> theIncludes) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolveDependenciesMojo.java`
#### Snippet
```java
     * Main entry into mojo. Gets the list of dependencies and iterates through displaying the resolved version.
     *
     * @throws MojoExecutionException with a message if an error occurs
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `FilterArtifacts`
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/AbstractResolveMojo.java`
#### Snippet
```java

    /**
     * @return {@link FilterArtifacts}
     */
    protected FilterArtifacts getArtifactsFilter() {
```

### JavadocReference
Cannot resolve symbol `DependencyResolverException`
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/AbstractResolveMojo.java`
#### Snippet
```java
     * @param artifact the artifact used to retrieve dependencies
     * @return resolved set of dependencies
     * @throws DependencyResolverException in case of error while resolving artifacts.
     */
    protected Set<Artifact> resolveArtifactDependencies(final DependableCoordinate artifact)
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/AbstractDependencyMojo.java`
#### Snippet
```java
     * @param artifact represents the file to copy.
     * @param destFile file name of destination file.
     * @throws MojoExecutionException with a message if an error occurs.
     */
    protected void copyFile(File artifact, File destFile) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/AbstractDependencyMojo.java`
#### Snippet
```java

    /**
     * @throws MojoExecutionException {@link MojoExecutionException}
     * @throws MojoFailureException {@link MojoFailureException}
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/AbstractDependencyMojo.java`
#### Snippet
```java

    /**
     * @throws MojoExecutionException {@link MojoExecutionException}
     * @throws MojoFailureException {@link MojoFailureException}
     */
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/dependency/AbstractDependencyMojo.java`
#### Snippet
```java
    /**
     * @throws MojoExecutionException {@link MojoExecutionException}
     * @throws MojoFailureException {@link MojoFailureException}
     */
    protected abstract void doExecute() throws MojoExecutionException, MojoFailureException;
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/dependency/AbstractDependencyMojo.java`
#### Snippet
```java
    /**
     * @throws MojoExecutionException {@link MojoExecutionException}
     * @throws MojoFailureException {@link MojoFailureException}
     */
    protected abstract void doExecute() throws MojoExecutionException, MojoFailureException;
```

### JavadocReference
Cannot resolve symbol `FileMapper`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/UnpackDependenciesMojo.java`
#### Snippet
```java

    /**
     * @param fileMappers {@link FileMapper}s to be used for rewriting each target path, or {@code null} if no
     *                   rewriting shall happen.
     *
```

### JavadocReference
Cannot resolve symbol `FileMapper`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/UnpackDependenciesMojo.java`
#### Snippet
```java

    /**
     * @return {@link FileMapper}s to be used for rewriting each target path, or {@code null} if no rewriting shall
     *         happen.
     *
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/UnpackDependenciesMojo.java`
#### Snippet
```java
     * DependencyUtil.unpackFile().
     *
     * @throws MojoExecutionException with a message if an error occurs.
     * @see #getDependencySets(boolean)
     */
```

### JavadocReference
Cannot resolve symbol `FileMapper`
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/UnpackDependenciesMojo.java`
#### Snippet
```java

    /**
     * {@link FileMapper}s to be used for rewriting each target path, or {@code null} if no rewriting shall happen.
     *
     * @since 3.1.2
```

### JavadocReference
Cannot resolve symbol `Sink`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AnalyzeReportView.java`
#### Snippet
```java
     * Generate a table for the given dependencies iterator.
     *
     * @param sink {@link Sink}
     * @param iter {@link Artifact}
     */
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AnalyzeReportView.java`
#### Snippet
```java
     *
     * @param sink {@link Sink}
     * @param iter {@link Artifact}
     */
    public void generateDependenciesTable(Sink sink, Iterator<Artifact> iter) {
```

### JavadocReference
Cannot resolve symbol `ProjectDependencyAnalysis`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AnalyzeReportView.java`
#### Snippet
```java
     * Generates the HTML report.
     *
     * @param analysis {@link ProjectDependencyAnalysis}
     * @param sink {@link Sink}
     * @param bundle {@link ResourceBundle}
```

### JavadocReference
Cannot resolve symbol `Sink`
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AnalyzeReportView.java`
#### Snippet
```java
     *
     * @param analysis {@link ProjectDependencyAnalysis}
     * @param sink {@link Sink}
     * @param bundle {@link ResourceBundle}
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/AbstractFromConfigurationMojo.java`
#### Snippet
```java
     * @param processArtifactItemsRequest preprocessing instructions
     * @return An ArrayList of preprocessed ArtifactItems
     * @throws MojoExecutionException with a message if an error occurs.
     * @see ArtifactItem
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/AbstractFromConfigurationMojo.java`
#### Snippet
```java
     *
     * @param artifact representing configured file.
     * @throws MojoExecutionException
     */
    private void fillMissingArtifactVersion(ArtifactItem artifact) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/AbstractFromConfigurationMojo.java`
#### Snippet
```java
     * artifactItems is filled by either field injection or by setArtifact().
     *
     * @throws MojoFailureException in case of an error.
     */
    protected void verifyRequirements() throws MojoFailureException {
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/AbstractFromConfigurationMojo.java`
#### Snippet
```java
    /**
     * @param artifact The artifact.
     * @throws MojoFailureException in case of an error.
     */
    public void setArtifact(String artifact) throws MojoFailureException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/AbstractFromConfigurationMojo.java`
#### Snippet
```java
     * @param artifactItem containing information about artifact from plugin configuration.
     * @return Artifact object representing the specified file.
     * @throws MojoExecutionException with a message if the version can't be found in DependencyManagement.
     */
    protected Artifact getArtifact(ArtifactItem artifactItem) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `DependencyNodeVisitor`
in `src/main/java/org/apache/maven/plugins/dependency/tree/TreeMojo.java`
#### Snippet
```java
    /**
     * @param writer {@link Writer}
     * @return {@link DependencyNodeVisitor}
     */
    public DependencyNodeVisitor getSerializingDependencyNodeVisitor(Writer writer) {
```

### JavadocReference
Cannot resolve symbol `StrictPatternExcludesArtifactFilter`
in `src/main/java/org/apache/maven/plugins/dependency/tree/TreeMojo.java`
#### Snippet
```java
     * </p>
     *
     * @see StrictPatternExcludesArtifactFilter
     * @since 2.0-alpha-6
     */
```

### JavadocReference
Cannot resolve symbol `StrictPatternIncludesArtifactFilter`
in `src/main/java/org/apache/maven/plugins/dependency/tree/TreeMojo.java`
#### Snippet
```java
     * </p>
     *
     * @see StrictPatternIncludesArtifactFilter
     * @since 2.0-alpha-6
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/dependency/ListRepositoriesMojo.java`
#### Snippet
```java
     * Displays a list of the repositories used by this build.
     *
     * @throws MojoExecutionException with a message if an error occurs.
     */
    @Override
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AnalyzeDepMgt.java`
#### Snippet
```java
     *
     * @return true if errors are found.
     * @throws MojoExecutionException
     */
    private boolean checkDependencyManagement() throws MojoExecutionException {
```

### JavadocDeclaration
`@param artifact` tag description is missing
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/CopyDependenciesMojo.java`
#### Snippet
```java
     * install the artifact and the corresponding pom if copyPoms=true
     *
     * @param artifact
     * @param buildingRequest
     */
```

### JavadocDeclaration
`@param buildingRequest` tag description is missing
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/CopyDependenciesMojo.java`
#### Snippet
```java
     *
     * @param artifact
     * @param buildingRequest
     */
    private void installArtifact(Artifact artifact, ProjectBuildingRequest buildingRequest) {
```

### JavadocDeclaration
Wrong tag `parameter`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java
     * Classifier for Artifact (tests,sources,etc)
     *
     * @parameter
     */
    private String classifier;
```

### JavadocDeclaration
Wrong tag `parameter`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java
     * Provides ability to change destination file name
     *
     * @parameter
     */
    private String destFileName;
```

### JavadocDeclaration
Wrong tag `parameter`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java
     * Type of Artifact (War,Jar,etc)
     *
     * @parameter
     * @required
     */
```

### JavadocDeclaration
Wrong tag `required`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java
     *
     * @parameter
     * @required
     */
    private String type = "jar";
```

### JavadocDeclaration
Wrong tag `parameter`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java
     * Group Id of Artifact
     *
     * @parameter
     * @required
     */
```

### JavadocDeclaration
Wrong tag `required`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java
     *
     * @parameter
     * @required
     */
    private String groupId;
```

### JavadocDeclaration
Wrong tag `parameter`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java
     * Name of Artifact
     *
     * @parameter
     * @required
     */
```

### JavadocDeclaration
Wrong tag `required`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java
     *
     * @parameter
     * @required
     */
    private String artifactId;
```

### JavadocDeclaration
Wrong tag `parameter`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java
     * @since 3.1.2
     *
     * @parameter
     */
    private FileMapper[] fileMappers;
```

### JavadocDeclaration
Wrong tag `parameter`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java
     * Encoding of artifact. Overrides default encoding.
     *
     * @parameter
     */
    private String encoding;
```

### JavadocDeclaration
Wrong tag `parameter`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java
     * Location to use for this Artifact. Overrides default location.
     *
     * @parameter
     */
    private File outputDirectory;
```

### JavadocDeclaration
Wrong tag `parameter`
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/ArtifactItem.java`
#### Snippet
```java
     * Version of Artifact
     *
     * @parameter
     */
    private String version = null;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/plugins/dependency/AbstractDependencyMojo.java`
#### Snippet
```java

    /**
     * @throws MojoExecutionException {@link MojoExecutionException}
     * @throws MojoFailureException {@link MojoFailureException}
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/plugins/dependency/AbstractDependencyMojo.java`
#### Snippet
```java
    /**
     * @throws MojoExecutionException {@link MojoExecutionException}
     * @throws MojoFailureException {@link MojoFailureException}
     */
    protected abstract void doExecute() throws MojoExecutionException, MojoFailureException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/AbstractFromConfigurationMojo.java`
#### Snippet
```java
     *
     * @param artifact representing configured file.
     * @throws MojoExecutionException
     */
    private void fillMissingArtifactVersion(ArtifactItem artifact) throws MojoExecutionException {
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `prependGroupId` may be 'final'
in `src/main/java/org/apache/maven/plugins/dependency/fromConfiguration/CopyMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "mdep.prependGroupId", defaultValue = "false")
    private boolean prependGroupId = false;

    /**
```

### FieldMayBeFinal
Field `transitive` may be 'final'
in `src/main/java/org/apache/maven/plugins/dependency/GetMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "transitive", defaultValue = "true")
    private boolean transitive = true;

    /**
```

### FieldMayBeFinal
Field `coordinate` may be 'final'
in `src/main/java/org/apache/maven/plugins/dependency/GetMojo.java`
#### Snippet
```java
    private RepositorySystem repositorySystem;

    private DefaultDependableCoordinate coordinate = new DefaultDependableCoordinate();

    /**
```

### FieldMayBeFinal
Field `ignoredUnusedDeclaredDependencies` may be 'final'
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
     */
    @Parameter
    private String[] ignoredUnusedDeclaredDependencies = new String[0];

    /**
```

### FieldMayBeFinal
Field `ignoredNonTestScopedDependencies` may be 'final'
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
     */
    @Parameter
    private String[] ignoredNonTestScopedDependencies = new String[0];

    /**
```

### FieldMayBeFinal
Field `ignoredUsedUndeclaredDependencies` may be 'final'
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
     */
    @Parameter
    private String[] ignoredUsedUndeclaredDependencies = new String[0];

    /**
```

### FieldMayBeFinal
Field `ignoredPackagings` may be 'final'
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
    // When is set defaultValue always win, and there is no possibility to override by plugin configuration.
    @Parameter
    private List<String> ignoredPackagings = Arrays.asList("pom", "ear");

    // Mojo methods -----------------------------------------------------------
```

### FieldMayBeFinal
Field `ignoredDependencies` may be 'final'
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
     */
    @Parameter
    private String[] ignoredDependencies = new String[0];

    /**
```

### FieldMayBeFinal
Field `useBaseVersion` may be 'final'
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "mdep.useBaseVersion", defaultValue = "true")
    private boolean useBaseVersion = true;

    /**
```

### FieldMayBeFinal
Field `stripClassifier` may be 'final'
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "mdep.stripClassifier", defaultValue = "false")
    private boolean stripClassifier = false;

    /**
```

### FieldMayBeFinal
Field `transitive` may be 'final'
in `src/main/java/org/apache/maven/plugins/dependency/ListClassesMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "transitive", defaultValue = "false")
    private boolean transitive = false;

    /**
```

### FieldMayBeFinal
Field `coordinate` may be 'final'
in `src/main/java/org/apache/maven/plugins/dependency/ListClassesMojo.java`
#### Snippet
```java
    private RepositorySystem repositorySystem;

    private DefaultDependableCoordinate coordinate = new DefaultDependableCoordinate();

    /**
```

### FieldMayBeFinal
Field `packaging` may be 'final'
in `src/main/java/org/apache/maven/plugins/dependency/ListClassesMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "packaging", defaultValue = "jar")
    private String packaging = "jar";

    /**
```

## RuleId[id=CommentedOutCode]
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

## RuleId[id=MismatchedCollectionQueryUpdate]
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
Contents of collection `usedDeclared` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java
        }

        Set<Artifact> usedDeclared = new LinkedHashSet<>(analysis.getUsedDeclaredArtifacts());
        Map<Artifact, Set<String>> usedUndeclaredWithClasses =
                new LinkedHashMap<>(analysis.getUsedUndeclaredArtifactsWithClasses());
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/plugins/dependency/GetMojo.java`
#### Snippet
```java
            if (tokens.length < 3 || tokens.length > 5) {
                throw new MojoFailureException("Invalid artifact, you must specify "
                        + "groupId:artifactId:version[:packaging[:classifier]] " + artifact);
            }
            coordinate.setGroupId(tokens[0]);
            coordinate.setArtifactId(tokens[1]);
            coordinate.setVersion(tokens[2]);
            if (tokens.length >= 4) {
                coordinate.setType(tokens[3]);
            }
            if (tokens.length == 5) {
                coordinate.setClassifier(tokens[4]);
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/plugins/dependency/GetMojo.java`
#### Snippet
```java
            ProjectBuildingRequest buildingRequest =
                    new DefaultProjectBuildingRequest(session.getProjectBuildingRequest());

            Settings settings = session.getSettings();
            repositorySystem.injectMirror(repoList, settings.getMirrors());
            repositorySystem.injectProxy(repoList, settings.getProxies());
            repositorySystem.injectAuthentication(repoList, settings.getServers());

            buildingRequest.setRemoteRepositories(repoList);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/plugins/dependency/GetMojo.java`
#### Snippet
```java
        ArtifactHandler artifactHandler = artifactHandlerManager.getArtifactHandler(dependableCoordinate.getType());
        DefaultArtifactCoordinate artifactCoordinate = new DefaultArtifactCoordinate();
        artifactCoordinate.setGroupId(dependableCoordinate.getGroupId());
        artifactCoordinate.setArtifactId(dependableCoordinate.getArtifactId());
        artifactCoordinate.setVersion(dependableCoordinate.getVersion());
        artifactCoordinate.setClassifier(dependableCoordinate.getClassifier());
        artifactCoordinate.setExtension(artifactHandler.getExtension());
        return artifactCoordinate;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/AbstractDependencyFilterMojo.java`
#### Snippet
```java
        filter.addFilter(new ScopeFilter(
                DependencyUtil.cleanToBeTokenizedString(this.includeScope),
                DependencyUtil.cleanToBeTokenizedString(this.excludeScope)));

        filter.addFilter(new TypeFilter(
                DependencyUtil.cleanToBeTokenizedString(this.includeTypes),
                DependencyUtil.cleanToBeTokenizedString(this.excludeTypes)));

        filter.addFilter(new ClassifierFilter(
                DependencyUtil.cleanToBeTokenizedString(this.includeClassifiers),
                DependencyUtil.cleanToBeTokenizedString(this.excludeClassifiers)));

        filter.addFilter(new GroupIdFilter(
                DependencyUtil.cleanToBeTokenizedString(this.includeGroupIds),
                DependencyUtil.cleanToBeTokenizedString(this.excludeGroupIds)));

        filter.addFilter(new ArtifactIdFilter(
                DependencyUtil.cleanToBeTokenizedString(this.includeArtifactIds),
                DependencyUtil.cleanToBeTokenizedString(this.excludeArtifactIds)));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/GoOfflineMojo.java`
#### Snippet
```java
        final DefaultDependableCoordinate result = new DefaultDependableCoordinate();
        result.setGroupId(artifact.getGroupId());
        result.setArtifactId(artifact.getArtifactId());
        result.setVersion(artifact.getVersion());
        result.setType(artifact.getType());
        result.setClassifier(artifact.getClassifier());

        return result;
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

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
        String encoding = Objects.toString(outputEncoding, "UTF-8");

        try (BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(outputFile), encoding))) {
            for (String line = r.readLine(); line != null; line = r.readLine()) {
                sb.append(line);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
        String encoding = Objects.toString(outputEncoding, "UTF-8");

        try (Writer w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(out), encoding))) {
            w.write(cpString);
            getLog().info("Wrote classpath file '" + out + "'.");
```

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `src/main/java/org/apache/maven/plugins/dependency/utils/UnpackUtil.java`
#### Snippet
```java
     */
    @Inject
    public UnpackUtil(ArchiverManager archiverManager, BuildContext buildContext) {
        this.archiverManager = archiverManager;
        this.buildContext = buildContext;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `src/main/java/org/apache/maven/plugins/dependency/utils/UnpackUtil.java`
#### Snippet
```java
     */
    @Inject
    public UnpackUtil(ArchiverManager archiverManager, BuildContext buildContext) {
        this.archiverManager = archiverManager;
        this.buildContext = buildContext;
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `DirectDependencyFilter` may be 'static'
in `src/main/java/org/apache/maven/plugins/dependency/PurgeLocalRepositoryMojo.java`
#### Snippet
```java
     * Includes only direct project dependencies.
     */
    private class DirectDependencyFilter extends AbstractFilter {
        private final Artifact projectArtifact;

```

### InnerClassMayBeStatic
Inner class `ModuleDescriptor` may be 'static'
in `src/main/java/org/apache/maven/plugins/dependency/resolvers/ResolveDependenciesMojo.java`
#### Snippet
```java
    }

    private class ModuleDescriptor {
        String name;

```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/org/apache/maven/plugins/dependency/analyze/AbstractAnalyzeMojo.java`
#### Snippet
```java

    private List<Artifact> filterDependencies(Set<Artifact> artifacts, String[] excludes) {
        ArtifactFilter filter = new StrictPatternExcludesArtifactFilter(Arrays.asList(excludes));
        List<Artifact> result = new ArrayList<>();

```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/maven/plugins/dependency/utils/markers/UnpackFileMarkerHandler.java`
#### Snippet
```java
    @Override
    protected File getMarkerFile() {
        /**
         * Build a hash of all include/exclude strings, to determine if an artifactItem has been unpacked using the
         * include/exclude parameters, this will allow an artifact to be included multiple times with different
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `pomArtifact` initializer `null` is redundant
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/CopyDependenciesMojo.java`
#### Snippet
```java
        coordinate.setExtension("pom");

        Artifact pomArtifact = null;
        // Resolve the pom artifact using repos
        try {
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/maven/plugins/dependency/utils/filters/DestFileFilter.java`
#### Snippet
```java
     * Using simply {@code File.getLastModified} will return sometimes a wrong value see JDK bug for details.
     *
     * https://bugs.openjdk.java.net/browse/JDK-8177809
     *
     * @param file {@link File}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/maven/plugins/dependency/GetMojo.java`
#### Snippet
```java
    /**
     * Repositories in the format id::[layout]::url or just url, separated by comma. ie.
     * central::default::https://repo.maven.apache.org/maven2,myrepo::::https://repo.acme.com,https://repo.acme2.com
     */
    @Parameter(property = "remoteRepositories")
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/maven/plugins/dependency/ListClassesMojo.java`
#### Snippet
```java
    /**
     * Repositories in the format id::[layout]::url or just URLs, separated by comma. That is,
     * central::default::https://repo.maven.apache.org/maven2,myrepo::::https://repo.acme.com,https://repo.acme2.com
     */
    @Parameter(property = "remoteRepositories")
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/maven/plugins/dependency/GetMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "transitive", defaultValue = "true")
    private boolean transitive = true;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "mdep.useBaseVersion", defaultValue = "true")
    private boolean useBaseVersion = true;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/maven/plugins/dependency/fromDependencies/BuildClasspathMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "mdep.stripClassifier", defaultValue = "false")
    private boolean stripClassifier = false;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/maven/plugins/dependency/ListClassesMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "transitive", defaultValue = "false")
    private boolean transitive = false;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/maven/plugins/dependency/ListClassesMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "packaging", defaultValue = "jar")
    private String packaging = "jar";

    /**
```

## RuleId[id=IgnoreResultOfCall]
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
in `src/main/java/org/apache/maven/plugins/dependency/utils/UnpackUtil.java`
#### Snippet
```java
            logUnpack(logger, file, location, includes, excludes);

            location.mkdirs();
            if (!location.exists()) {
                throw new MojoExecutionException(
```

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

