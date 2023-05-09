# maven-release 
 
# Bad smells
I found 251 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 69 | false |
| RegExpUnnecessaryNonCapturingGroup | 56 | false |
| CdiInjectionPointsInspection | 31 | false |
| FieldMayBeFinal | 16 | false |
| DuplicatedCode | 13 | false |
| JavadocLinkAsPlainText | 8 | false |
| FieldCanBeLocal | 8 | false |
| UNCHECKED_WARNING | 7 | false |
| RegExpRedundantEscape | 7 | false |
| IgnoreResultOfCall | 5 | false |
| UnnecessaryStringEscape | 3 | true |
| DeprecatedIsStillUsed | 3 | false |
| JavadocDeclaration | 3 | false |
| ConstantValue | 3 | false |
| EmptyStatementBody | 2 | false |
| RegExpDuplicateAlternationBranch | 2 | false |
| NullableProblems | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| DataFlowIssue | 1 | false |
| CloneableImplementsClone | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| IOStreamConstructor | 1 | false |
| Deprecation | 1 | false |
| TrivialIf | 1 | false |
| DuplicateThrows | 1 | false |
| BusyWait | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashMap' to 'java.util.Map'
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/GenerateReleasePomsPhase.java`
#### Snippet
```java
        for (Resource currentResource : currentBuild.getResources()) {
            Map<String, String> superResourceDirectories =
                    new LinkedHashMap<>(interpolatedSuperBuild.getResources().size());
            for (int i = 0; i < interpolatedSuperBuild.getResources().size(); i++) {
                superResourceDirectories.put(
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashMap' to 'java.util.Map'
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/GenerateReleasePomsPhase.java`
#### Snippet
```java

        for (Resource currentResource : currentBuild.getTestResources()) {
            Map<String, String> superResourceDirectories = new LinkedHashMap<>(
                    interpolatedSuperBuild.getTestResources().size());
            for (int i = 0; i < interpolatedSuperBuild.getTestResources().size(); i++) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/GenerateReleasePomsPhase.java`
#### Snippet
```java
        if (artifacts != null) {
            // make dependency order deterministic for tests (related to MNG-1412)
            List<Artifact> orderedArtifacts = new ArrayList<>(artifacts);
            Collections.sort(orderedArtifacts);

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/GenerateReleasePomsPhase.java`
#### Snippet
```java
        if (artifacts != null) {
            // make dependency order deterministic for tests (related to MNG-1412)
            List<Artifact> orderedArtifacts = new ArrayList<>(artifacts);
            Collections.sort(orderedArtifacts);

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Iterator' to 'java.util.Iterator\>'. Reason: 'entries' has raw type, so result of iterator is erased
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/config/ReleaseUtils.java`
#### Snippet
```java
    private static void loadResolvedDependencies(Properties prop, ReleaseDescriptorBuilder builder) {
        Set entries = prop.entrySet();
        Iterator<Entry<String, String>> iterator = entries.iterator();
        String propertyName;
        Entry<String, String> currentEntry;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/CheckDependencySnapshotsPhase.java`
#### Snippet
```java

    private void printSnapshotDependencies(Set<Artifact> snapshotsSet, StringBuilder message) {
        List<Artifact> snapshotsList = new ArrayList<>(snapshotsSet);

        Collections.sort(snapshotsList);
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/CheckDependencySnapshotsPhase.java`
#### Snippet
```java

    private void printSnapshotDependencies(Set<Artifact> snapshotsSet, StringBuilder message) {
        List<Artifact> snapshotsList = new ArrayList<>(snapshotsSet);

        Collections.sort(snapshotsList);
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `org.apache.maven.artifact.repository.metadata.Metadata`
in `maven-release-api/src/main/java/org/apache/maven/shared/release/policy/version/VersionPolicyRequest.java`
#### Snippet
```java
     * <p>Getter for the field <code>metaData</code>.</p>
     *
     * @return a {@link org.apache.maven.artifact.repository.metadata.Metadata} object
     */
    public Metadata getMetaData() {
```

### JavadocReference
Cannot resolve symbol `ScmProvider`
in `maven-release-api/src/main/java/org/apache/maven/shared/release/policy/version/VersionPolicyRequest.java`
#### Snippet
```java
     * <p>Getter for the field <code>scmProvider</code>.</p>
     *
     * @return a {@link ScmProvider} object
     */
    public ScmProvider getScmProvider() {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.artifact.repository.metadata.Metadata`
in `maven-release-api/src/main/java/org/apache/maven/shared/release/policy/version/VersionPolicyRequest.java`
#### Snippet
```java
     * <p>Setter for the field <code>metaData</code>.</p>
     *
     * @param metaData a {@link org.apache.maven.artifact.repository.metadata.Metadata} object
     * @return a {@link org.apache.maven.shared.release.policy.version.VersionPolicyRequest} object
     */
```

### JavadocReference
Cannot resolve symbol `ScmProvider`
in `maven-release-api/src/main/java/org/apache/maven/shared/release/policy/version/VersionPolicyRequest.java`
#### Snippet
```java
     * <p>Setter for the field <code>scmProvider</code>.</p>
     *
     * @param scmProvider The {@link ScmProvider} where the history can be retrieved.
     * @return a {@link org.apache.maven.shared.release.policy.version.VersionPolicyRequest} object
     */
```

### JavadocReference
Cannot resolve symbol `ScmRepository`
in `maven-release-api/src/main/java/org/apache/maven/shared/release/policy/version/VersionPolicyRequest.java`
#### Snippet
```java
     * <p>Setter for the field <code>scmRepository</code>.</p>
     *
     * @param scmRepository The {@link ScmRepository} where the history can be retrieved.
     * @return a {@link org.apache.maven.shared.release.policy.version.VersionPolicyRequest} object
     */
```

### JavadocReference
Cannot resolve symbol `ScmRepository`
in `maven-release-api/src/main/java/org/apache/maven/shared/release/policy/version/VersionPolicyRequest.java`
#### Snippet
```java
     * <p>Getter for the field <code>scmRepository</code>.</p>
     *
     * @return a {@link ScmRepository} object
     */
    public ScmRepository getScmRepository() {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.aether.version.Version`
in `maven-release-api/src/main/java/org/apache/maven/shared/release/versions/AetherVersion.java`
#### Snippet
```java
     * <p>compareTo.</p>
     *
     * @param other a {@link org.eclipse.aether.version.Version} object
     * @return a int
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.settings.Settings`
in `maven-release-api/src/main/java/org/apache/maven/shared/release/env/ReleaseEnvironment.java`
#### Snippet
```java
     * <p>getSettings.</p>
     *
     * @return a {@link org.apache.maven.settings.Settings} object
     */
    Settings getSettings();
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.scm.provider.ScmProvider`
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/AbstractScmReleaseMojo.java`
#### Snippet
```java
     * Add a new or overwrite the default implementation per provider.
     * The key is the scm prefix and the value is the role hint of the
     * {@link org.apache.maven.scm.provider.ScmProvider}.
     *
     * @since 2.0-beta-6
```

### JavadocReference
Cannot resolve symbol `ScmManager`
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/AbstractScmReleaseMojo.java`
#### Snippet
```java
     *
     * @since 2.0-beta-6
     * @see ScmManager#setScmProviderImplementation(String, String)
     */
    @Parameter
```

### JavadocReference
Cannot resolve symbol `setScmProviderImplementation(String, String)`
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/AbstractScmReleaseMojo.java`
#### Snippet
```java
     *
     * @since 2.0-beta-6
     * @see ScmManager#setScmProviderImplementation(String, String)
     */
    @Parameter
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.project.MavenProject`
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/AbstractScmReleaseMojo.java`
#### Snippet
```java
     * <p>buildScm.</p>
     *
     * @param project a {@link org.apache.maven.project.MavenProject} object
     * @return a {@link org.apache.maven.model.Scm} object
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.model.Scm`
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/AbstractScmReleaseMojo.java`
#### Snippet
```java
     *
     * @param project a {@link org.apache.maven.project.MavenProject} object
     * @return a {@link org.apache.maven.model.Scm} object
     */
    protected Scm buildScm(MavenProject project) {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.aether.version.Version`
in `maven-release-api/src/main/java/org/apache/maven/shared/release/versions/Version.java`
#### Snippet
```java
     *
     * @throws org.apache.maven.shared.release.versions.VersionComparisonConflictException
     *              if {@link org.eclipse.aether.version.Version} and
     *             {@link org.apache.maven.artifact.versioning.ArtifactVersion ArtifactVersion} give different results
     * @param other a {@link org.apache.maven.shared.release.versions.Version} object
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.artifact.versioning.ArtifactVersion`
in `maven-release-api/src/main/java/org/apache/maven/shared/release/versions/Version.java`
#### Snippet
```java
     * @throws org.apache.maven.shared.release.versions.VersionComparisonConflictException
     *              if {@link org.eclipse.aether.version.Version} and
     *             {@link org.apache.maven.artifact.versioning.ArtifactVersion ArtifactVersion} give different results
     * @param other a {@link org.apache.maven.shared.release.versions.Version} object
     * @return a int
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.logging.Log`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/DefaultReleaseManagerListener.java`
#### Snippet
```java
     * <p>Constructor for DefaultReleaseManagerListener.</p>
     *
     * @param log a {@link org.apache.maven.plugin.logging.Log} object
     */
    public DefaultReleaseManagerListener(Log log) {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.logging.Log`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/DefaultReleaseManagerListener.java`
#### Snippet
```java
     * <p>Constructor for DefaultReleaseManagerListener.</p>
     *
     * @param log a {@link org.apache.maven.plugin.logging.Log} object
     * @param dryRun a boolean
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.scm.provider.ScmProvider`
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/PerformReleaseMojo.java`
#### Snippet
```java
     * Add a new or overwrite the default implementation per provider.
     * The key is the scm prefix and the value is the role hint of the
     * {@link org.apache.maven.scm.provider.ScmProvider}.
     *
     * @since 2.5.3
```

### JavadocReference
Cannot resolve symbol `ScmManager`
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/PerformReleaseMojo.java`
#### Snippet
```java
     *
     * @since 2.5.3
     * @see ScmManager#setScmProviderImplementation(String, String)
     */
    @Parameter
```

### JavadocReference
Cannot resolve symbol `setScmProviderImplementation(String, String)`
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/PerformReleaseMojo.java`
#### Snippet
```java
     *
     * @since 2.5.3
     * @see ScmManager#setScmProviderImplementation(String, String)
     */
    @Parameter
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.settings.Settings`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/env/DefaultReleaseEnvironment.java`
#### Snippet
```java
     * <p>Setter for the field <code>settings</code>.</p>
     *
     * @param settings a {@link org.apache.maven.settings.Settings} object
     * @return a {@link org.apache.maven.shared.release.env.DefaultReleaseEnvironment} object
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.scm.ScmResult`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/scm/ReleaseScmCommandException.java`
#### Snippet
```java
     *
     * @param message a {@link java.lang.String} object
     * @param result a {@link org.apache.maven.scm.ScmResult} object
     */
    public ReleaseScmCommandException(String message, ScmResult result) {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.scm.repository.ScmRepositoryException`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/scm/ScmRepositoryConfigurator.java`
#### Snippet
```java
     * @param settings          the settings.xml configuraiton
     * @return the repository created
     * @throws org.apache.maven.scm.repository.ScmRepositoryException     if it is not possible to create a suitable
     *         SCM repository
     * @throws org.apache.maven.scm.manager.NoSuchScmProviderException if the requested SCM provider is not available
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.scm.manager.NoSuchScmProviderException`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/scm/ScmRepositoryConfigurator.java`
#### Snippet
```java
     * @throws org.apache.maven.scm.repository.ScmRepositoryException     if it is not possible to create a suitable
     *         SCM repository
     * @throws org.apache.maven.scm.manager.NoSuchScmProviderException if the requested SCM provider is not available
     */
    ScmRepository getConfiguredRepository(ReleaseDescriptor releaseDescriptor, Settings settings)
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.scm.manager.NoSuchScmProviderException`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/scm/ScmRepositoryConfigurator.java`
#### Snippet
```java
     * @param repository the SCM repository
     * @return the SCM provider
     * @throws org.apache.maven.scm.manager.NoSuchScmProviderException if the requested SCM provider is not available
     */
    ScmProvider getRepositoryProvider(ScmRepository repository) throws NoSuchScmProviderException;
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.scm.repository.ScmRepositoryException`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/scm/ScmRepositoryConfigurator.java`
#### Snippet
```java
     * @param settings          the settings.xml configuraiton
     * @return the repository created
     * @throws org.apache.maven.scm.repository.ScmRepositoryException     if it is not possible to create a suitable
     *         SCM repository
     * @throws org.apache.maven.scm.manager.NoSuchScmProviderException if the requested SCM provider is not available
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.scm.manager.NoSuchScmProviderException`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/scm/ScmRepositoryConfigurator.java`
#### Snippet
```java
     * @throws org.apache.maven.scm.repository.ScmRepositoryException     if it is not possible to create a suitable
     *         SCM repository
     * @throws org.apache.maven.scm.manager.NoSuchScmProviderException if the requested SCM provider is not available
     */
    ScmRepository getConfiguredRepository(String url, ReleaseDescriptor releaseDescriptor, Settings settings)
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.MojoExecutionException`
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/PrepareReleaseMojo.java`
#### Snippet
```java
     *
     * @param generateReleasePoms a boolean
     * @throws org.apache.maven.plugin.MojoExecutionException if any.
     * @throws org.apache.maven.plugin.MojoFailureException if any.
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.MojoFailureException`
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/PrepareReleaseMojo.java`
#### Snippet
```java
     * @param generateReleasePoms a boolean
     * @throws org.apache.maven.plugin.MojoExecutionException if any.
     * @throws org.apache.maven.plugin.MojoFailureException if any.
     */
    protected void prepareRelease(boolean generateReleasePoms) throws MojoExecutionException, MojoFailureException {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.settings.Settings`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/exec/AbstractMavenExecutor.java`
#### Snippet
```java
     * <p>encryptSettings.</p>
     *
     * @param settings a {@link org.apache.maven.settings.Settings} object
     * @return a {@link org.apache.maven.settings.Settings} object
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.settings.Settings`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/exec/AbstractMavenExecutor.java`
#### Snippet
```java
     *
     * @param settings a {@link org.apache.maven.settings.Settings} object
     * @return a {@link org.apache.maven.settings.Settings} object
     */
    protected Settings encryptSettings(Settings settings) {
```

### JavadocReference
Cannot resolve symbol `Logger`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/exec/AbstractMavenExecutor.java`
#### Snippet
```java
     * <p>Getter for the field <code>logger</code>.</p>
     *
     * @return a {@link Logger} object
     */
    protected final Logger getLogger() {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.settings.io.xpp3.SettingsXpp3Writer`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/exec/AbstractMavenExecutor.java`
#### Snippet
```java
     * <p>getSettingsWriter.</p>
     *
     * @return a {@link org.apache.maven.settings.io.xpp3.SettingsXpp3Writer} object
     */
    protected SettingsXpp3Writer getSettingsWriter() {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.shared.invoker.InvokerLogger`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/exec/InvokerMavenExecutor.java`
#### Snippet
```java
     * <p>getInvokerLogger.</p>
     *
     * @return a {@link org.apache.maven.shared.invoker.InvokerLogger} object
     */
    protected InvokerLogger getInvokerLogger() {
```

### JavadocReference
Cannot resolve symbol `DefaultSecDispatcher`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/util/MavenCrypto.java`
#### Snippet
```java

/**
 * A shared utility to access {@link DefaultSecDispatcher} service.
 *
 * @since TBD
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.util.cli.Commandline`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/exec/ForkedMavenExecutor.java`
#### Snippet
```java
     * <p>executeCommandLine.</p>
     *
     * @param cl        a {@link org.codehaus.plexus.util.cli.Commandline} object
     * @param systemIn  a {@link java.io.InputStream} object
     * @param systemOut a {@link java.io.OutputStream} object
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.util.cli.CommandLineException`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/exec/ForkedMavenExecutor.java`
#### Snippet
```java
     * @param systemErr a {@link java.io.OutputStream} object
     * @return a int
     * @throws org.codehaus.plexus.util.cli.CommandLineException if any.
     */
    public static int executeCommandLine(
```

### JavadocReference
Cannot resolve symbol `ScmProvider`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractInputVariablesPhase.java`
#### Snippet
```java
     * @param releaseDescriptor  a {@link ReleaseDescriptor} object
     * @param releaseEnvironment a {@link ReleaseEnvironment} object
     * @return a {@link ScmProvider} object
     * @throws ReleaseScmRepositoryException if any.
     * @throws ReleaseExecutionException     if any.
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.project.MavenProject`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractBackupPomsPhase.java`
#### Snippet
```java
     * <p>deletePomBackup.</p>
     *
     * @param project a {@link org.apache.maven.project.MavenProject} object
     */
    protected void deletePomBackup(MavenProject project) {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.project.MavenProject`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractBackupPomsPhase.java`
#### Snippet
```java
     * <p>getPomBackup.</p>
     *
     * @param project a {@link org.apache.maven.project.MavenProject} object
     * @return a {@link java.io.File} object
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.project.MavenProject`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractScmCommitPhase.java`
#### Snippet
```java
     *
     * @param releaseDescriptor a {@link org.apache.maven.shared.release.config.ReleaseDescriptor} object
     * @param project           a {@link org.apache.maven.project.MavenProject} object
     * @return a {@link java.util.List} object
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.project.MavenProject`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/ModelETLRequest.java`
#### Snippet
```java
     * <p>Getter for the field <code>project</code>.</p>
     *
     * @return a {@link org.apache.maven.project.MavenProject} object
     */
    public MavenProject getProject() {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.project.MavenProject`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/ModelETLRequest.java`
#### Snippet
```java
     * <p>Setter for the field <code>project</code>.</p>
     *
     * @param project a {@link org.apache.maven.project.MavenProject} object
     */
    public void setProject(MavenProject project) {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.model.Model`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/ModelETL.java`
#### Snippet
```java
     * <p>getModel.</p>
     *
     * @return a {@link org.apache.maven.model.Model} object
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `org.jdom2.Element`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomExtension.java`
#### Snippet
```java
     * <p>Constructor for JDomExtension.</p>
     *
     * @param extension a {@link org.jdom2.Element} object
     */
    public JDomExtension(Element extension) {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.model.Scm`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/config/ReleaseDescriptorBuilder.java`
#### Snippet
```java
     *
     * @param key   a {@link java.lang.String} object
     * @param value a {@link org.apache.maven.model.Scm} object
     * @return a {@link org.apache.maven.shared.release.config.ReleaseDescriptorBuilder} object
     */
```

### JavadocReference
Cannot resolve symbol `org.jdom2.Element`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomMavenCoordinate.java`
#### Snippet
```java
     * <p>Constructor for JDomMavenCoordinate.</p>
     *
     * @param elm a {@link org.jdom2.Element} object
     */
    public JDomMavenCoordinate(Element elm) {
```

### JavadocReference
Cannot resolve symbol `org.jdom2.Element`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomDependency.java`
#### Snippet
```java
     * <p>Constructor for JDomDependency.</p>
     *
     * @param dependency a {@link org.jdom2.Element} object
     */
    public JDomDependency(Element dependency) {
```

### JavadocReference
Cannot resolve symbol `org.jdom2.Element`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomPluginManagement.java`
#### Snippet
```java
     * <p>Constructor for JDomPluginManagement.</p>
     *
     * @param pluginManagement a {@link org.jdom2.Element} object
     */
    public JDomPluginManagement(Element pluginManagement) {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.model.Build`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelBase.java`
#### Snippet
```java
     * <p>getBuild.</p>
     *
     * @return a {@link org.apache.maven.model.Build} object
     */
    public Build getBuild() {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.model.DependencyManagement`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelBase.java`
#### Snippet
```java
     * <p>getDependencyManagement.</p>
     *
     * @return a {@link org.apache.maven.model.DependencyManagement} object
     */
    public DependencyManagement getDependencyManagement() {
```

### JavadocReference
Cannot resolve symbol `org.jdom2.Element`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelBase.java`
#### Snippet
```java
     * <p>Constructor for JDomModelBase.</p>
     *
     * @param modelBase a {@link org.jdom2.Element} object
     */
    public JDomModelBase(Element modelBase) {
```

### JavadocReference
Cannot resolve symbol `org.jdom2.Element`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomDependencyManagement.java`
#### Snippet
```java
     * <p>Constructor for JDomDependencyManagement.</p>
     *
     * @param dependencyManagement a {@link org.jdom2.Element} object
     */
    public JDomDependencyManagement(Element dependencyManagement) {
```

### JavadocReference
Cannot resolve symbol `org.jdom2.Element`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomReporting.java`
#### Snippet
```java
     * <p>Constructor for JDomReporting.</p>
     *
     * @param reporting a {@link org.jdom2.Element} object
     */
    public JDomReporting(Element reporting) {
```

### JavadocReference
Cannot resolve symbol `org.jdom2.Element`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomReportPlugin.java`
#### Snippet
```java
     * <p>Constructor for JDomReportPlugin.</p>
     *
     * @param reportPlugin a {@link org.jdom2.Element} object
     */
    public JDomReportPlugin(Element reportPlugin) {
```

### JavadocReference
Cannot resolve symbol `org.jdom2.Element`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomParent.java`
#### Snippet
```java
     * <p>Constructor for JDomParent.</p>
     *
     * @param parent a {@link org.jdom2.Element} object
     */
    public JDomParent(Element parent) {
```

### JavadocReference
Cannot resolve symbol `org.jdom2.Element`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomProfile.java`
#### Snippet
```java
     * <p>Constructor for JDomProfile.</p>
     *
     * @param profile a {@link org.jdom2.Element} object
     */
    public JDomProfile(Element profile) {
```

### JavadocReference
Cannot resolve symbol `org.jdom2.Element`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomUtils.java`
#### Snippet
```java
     * @param name a {@link java.lang.String} object
     * @param value a {@link java.lang.String} object
     * @param root a {@link org.jdom2.Element} object
     * @param namespace a {@link org.jdom2.Namespace} object
     * @return a {@link org.jdom2.Element} object
```

### JavadocReference
Cannot resolve symbol `org.jdom2.Namespace`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomUtils.java`
#### Snippet
```java
     * @param value a {@link java.lang.String} object
     * @param root a {@link org.jdom2.Element} object
     * @param namespace a {@link org.jdom2.Namespace} object
     * @return a {@link org.jdom2.Element} object
     */
```

### JavadocReference
Cannot resolve symbol `org.jdom2.Element`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomUtils.java`
#### Snippet
```java
     * @param root a {@link org.jdom2.Element} object
     * @param namespace a {@link org.jdom2.Namespace} object
     * @return a {@link org.jdom2.Element} object
     */
    public static Element rewriteElement(String name, String value, Element root, Namespace namespace) {
```

### JavadocReference
Cannot resolve symbol `org.jdom2.Element`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomBuild.java`
#### Snippet
```java
     * <p>Constructor for JDomBuild.</p>
     *
     * @param build a {@link org.jdom2.Element} object
     */
    public JDomBuild(Element build) {
```

### JavadocReference
Cannot resolve symbol `org.jdom2.Element`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomPlugin.java`
#### Snippet
```java
     * <p>Constructor for JDomPlugin.</p>
     *
     * @param plugin a {@link org.jdom2.Element} object
     */
    public JDomPlugin(Element plugin) {
```

### JavadocReference
Cannot resolve symbol `org.jdom2.Element`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomProperties.java`
#### Snippet
```java
     * <p>Constructor for JDomProperties.</p>
     *
     * @param properties a {@link org.jdom2.Element} object
     */
    public JDomProperties(Element properties) {
```

### JavadocReference
Cannot resolve symbol `org.jdom2.Document`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModel.java`
#### Snippet
```java
     * <p>Constructor for JDomModel.</p>
     *
     * @param document a {@link org.jdom2.Document} object
     */
    public JDomModel(Document document) {
```

### JavadocReference
Cannot resolve symbol `org.jdom2.Element`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModel.java`
#### Snippet
```java
     * <p>Constructor for JDomModel.</p>
     *
     * @param project a {@link org.jdom2.Element} object
     */
    public JDomModel(Element project) {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.project.MavenProject`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
     * <p>Setter for the field <code>project</code>.</p>
     *
     * @param project a {@link org.apache.maven.project.MavenProject} object
     */
    public void setProject(MavenProject project) {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.project.MavenProject`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractRewritePomsPhase.java`
#### Snippet
```java
     * <p>transformScm.</p>
     *
     * @param project           a {@link org.apache.maven.project.MavenProject} object
     * @param modelTarget       a {@link org.apache.maven.model.Model} object
     * @param releaseDescriptor a {@link org.apache.maven.shared.release.config.ReleaseDescriptor} object
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.model.Model`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractRewritePomsPhase.java`
#### Snippet
```java
     *
     * @param project           a {@link org.apache.maven.project.MavenProject} object
     * @param modelTarget       a {@link org.apache.maven.model.Model} object
     * @param releaseDescriptor a {@link org.apache.maven.shared.release.config.ReleaseDescriptor} object
     * @param projectId         a {@link java.lang.String} object
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.scm.repository.ScmRepository`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractRewritePomsPhase.java`
#### Snippet
```java
     * @param releaseDescriptor a {@link org.apache.maven.shared.release.config.ReleaseDescriptor} object
     * @param projectId         a {@link java.lang.String} object
     * @param scmRepository     a {@link org.apache.maven.scm.repository.ScmRepository} object
     * @param result            a {@link org.apache.maven.shared.release.ReleaseResult} object
     * @throws org.apache.maven.shared.release.ReleaseExecutionException if any.
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `phases` might be null
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/DefaultReleaseManager.java`
#### Snippet
```java
        }

        return Collections.unmodifiableList(phases); // TODO: NPE here in phases=null above!
    }

```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`else` statement has empty body
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractRewritePomsPhase.java`
#### Snippet
```java
                        }
                    }
                } else {
                    // different/previous version not related to current release
                }
```

### EmptyStatementBody
`else` statement has empty body
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractRewritePomsPhase.java`
#### Snippet
```java

                coordinate.setVersion(resolvedSnapshotVersion);
            } else {
                // artifact not related to current release
            }
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                // CHECKSTYLE_OFF: LocalFinalVariableName
                final String SPACE = "\\s++";
                final String XML = "<\\?(?:(?:[^\"'>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+>";
                final String INTSUB = "\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]";
                final String DOCTYPE =
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String SPACE = "\\s++";
                final String XML = "<\\?(?:(?:[^\"'>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+>";
                final String INTSUB = "\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]";
                final String DOCTYPE =
                        "<!DOCTYPE(?:(?:[^\"'\\[>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+')|(?:" + INTSUB + "))*+>";
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String INTSUB = "\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]";
                final String DOCTYPE =
                        "<!DOCTYPE(?:(?:[^\"'\\[>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+')|(?:" + INTSUB + "))*+>";
                final String PI = XML;
                final String COMMENT = "<!--(?:[^-]|(?:-[^-]))*+-->";
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'useReleaseProfile' is still used
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/PerformReleaseMojo.java`
#### Snippet
```java
    @Parameter(defaultValue = "false", property = "useReleaseProfile")
    @Deprecated
    private boolean useReleaseProfile;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'generateReleasePoms' is still used
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/PrepareReleaseMojo.java`
#### Snippet
```java
    @Deprecated
    @Parameter(defaultValue = "false", property = "generateReleasePoms")
    private boolean generateReleasePoms;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getModel' is still used
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/ModelETL.java`
#### Snippet
```java
     */
    @Deprecated
    Model getModel();
}

```

## RuleId[id=CloneableImplementsClone]
### CloneableImplementsClone
`Version` is 'Cloneable' but does not define 'clone()' method
in `maven-release-api/src/main/java/org/apache/maven/shared/release/versions/Version.java`
#### Snippet
```java
 * <p>Version class.</p>
 */
public class Version implements Comparable<Version>, Cloneable {
    private final AetherVersion aetherVersion;

```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String SPACE = "\\s++";
                final String XML = "<\\?(?:(?:[^\"'>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+>";
                final String INTSUB = "\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]";
                final String DOCTYPE =
                        "<!DOCTYPE(?:(?:[^\"'\\[>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+')|(?:" + INTSUB + "))*+>";
```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String INTSUB = "\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]";
                final String DOCTYPE =
                        "<!DOCTYPE(?:(?:[^\"'\\[>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+')|(?:" + INTSUB + "))*+>";
                final String PI = XML;
                final String COMMENT = "<!--(?:[^-]|(?:-[^-]))*+-->";
```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractRewritePomsPhase.java`
#### Snippet
```java
                    logInfo(result, "  Updating " + artifactId + " to " + mappedVersion);
                    coordinate.setVersion(mappedVersion);
                } else if (rawVersion.matches("\\$\\{.+\\}")) {
                    String expression = rawVersion.substring(2, rawVersion.length() - 1);

```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractRewritePomsPhase.java`
#### Snippet
```java
                                // https://issues.apache.org/jira/browse/MNG-7404
                                // https://issues.apache.org/jira/browse/MNG-7244
                                if (mappedVersion.matches("\\$\\{project.+\\}")
                                        || mappedVersion.matches("\\$\\{pom.+\\}")
                                        || "${version}".equals(mappedVersion)) {
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractRewritePomsPhase.java`
#### Snippet
```java
                                // https://issues.apache.org/jira/browse/MNG-7244
                                if (mappedVersion.matches("\\$\\{project.+\\}")
                                        || mappedVersion.matches("\\$\\{pom.+\\}")
                                        || "${version}".equals(mappedVersion)) {
                                    logInfo(
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `maven-release-policies/maven-release-oddeven-policy/src/main/java/org/apache/maven/shared/release/policy/oddeven/OddEvenVersionPolicy.java`
#### Snippet
```java
            int skip = getVersionIncrements(development, mostSignificantSegment % 2 == 0);

            digits.set(digits.size() - 1, String.valueOf(String.valueOf(mostSignificantSegment + skip)));

            newVersion = defaultVersionInfo.setDigits(digits);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `maven-release-api/src/main/java/org/apache/maven/shared/release/versions/Version.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();

        if (info.digits != null) {
            sb.append(joinDigitString(info.digits));
        }

        if (StringUtils.isNotEmpty(info.annotation)) {
            sb.append(StringUtils.defaultString(info.annotationSeparator));
            sb.append(info.annotation);
        }

        if (StringUtils.isNotEmpty(info.annotationRevision)) {
            if (StringUtils.isEmpty(info.annotation)) {
                sb.append(StringUtils.defaultString(info.annotationSeparator));
            } else {
                sb.append(StringUtils.defaultString(info.annotationRevSeparator));
            }
            sb.append(info.annotationRevision);
        }

        if (StringUtils.isNotEmpty(buildSpecifier)) {
            sb.append(StringUtils.defaultString(buildSeparator));
            sb.append(buildSpecifier);
        }

        return sb.toString();
```

### DuplicatedCode
Duplicated code
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/DefaultReleaseManager.java`
#### Snippet
```java
            ReleasePhase phase = releasePhases.get(name);

            if (phase == null) {
                throw new ReleaseExecutionException("Unable to find phase '" + name + "' to execute");
            }

            phaseStart(prepareRequest.getReleaseManagerListener(), name);

            ReleaseResult phaseResult = null;
            try {
                if (BooleanUtils.isTrue(prepareRequest.getDryRun())) {
                    phaseResult = phase.simulate(
                            config, prepareRequest.getReleaseEnvironment(), prepareRequest.getReactorProjects());
                } else {
                    phaseResult = phase.execute(
                            config, prepareRequest.getReleaseEnvironment(), prepareRequest.getReactorProjects());
                }
            } finally {
                if (result != null && phaseResult != null) {
                    result.appendOutput(phaseResult.getOutput());
                }
            }
```

### DuplicatedCode
Duplicated code
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/DefaultReleaseManager.java`
#### Snippet
```java
        for (String name : rollbackPhases) {
            ReleasePhase phase = releasePhases.get(name);

            if (phase == null) {
                throw new ReleaseExecutionException("Unable to find phase '" + name + "' to execute");
            }

            phaseStart(rollbackRequest.getReleaseManagerListener(), name);
            phase.execute(
                    releaseDescriptor, rollbackRequest.getReleaseEnvironment(), rollbackRequest.getReactorProjects());
            phaseEnd(rollbackRequest.getReleaseManagerListener());
        }

        // call release:clean so that resume will not be possible anymore after a rollback
        clean(rollbackRequest);
        goalEnd(rollbackRequest.getReleaseManagerListener());
```

### DuplicatedCode
Duplicated code
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/DefaultReleaseManager.java`
#### Snippet
```java
        final ReleaseDescriptorBuilder builder = branchRequest.getReleaseDescriptorBuilder();

        ReleaseUtils.copyPropertiesToReleaseDescriptor(
                branchRequest.getUserProperties(), new ReleaseDescriptorBuilder() {
                    public ReleaseDescriptorBuilder addDevelopmentVersion(String key, String value) {
                        builder.addDevelopmentVersion(key, value);
                        return this;
                    }

                    public ReleaseDescriptorBuilder addReleaseVersion(String key, String value) {
                        builder.addReleaseVersion(key, value);
                        return this;
                    }
                });

        ReleaseDescriptor releaseDescriptor = loadReleaseDescriptor(builder, branchRequest.getReleaseManagerListener());
```

### DuplicatedCode
Duplicated code
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractMapVersionsPhase.java`
#### Snippet
```java
            String projectId = ArtifactUtils.versionlessKey(project.getGroupId(), project.getArtifactId());

            String nextVersion = resolveNextVersion(project, projectId, releaseDescriptor, releaseEnvironment);

            if (!convertToSnapshot) {
                releaseDescriptor.addReleaseVersion(projectId, nextVersion);
            } else if (releaseDescriptor.isBranchCreation() && convertToBranch) {
                releaseDescriptor.addReleaseVersion(projectId, nextVersion);
            } else {
                releaseDescriptor.addDevelopmentVersion(projectId, nextVersion);
            }
```

### DuplicatedCode
Duplicated code
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractRewritePomsPhase.java`
#### Snippet
```java
            try {
                scmRepository = scmRepositoryConfigurator.getConfiguredRepository(
                        releaseDescriptor, releaseEnvironment.getSettings());

                provider = scmRepositoryConfigurator.getRepositoryProvider(scmRepository);
            } catch (ScmRepositoryException e) {
                throw new ReleaseScmRepositoryException(e.getMessage(), e.getValidationMessages());
            } catch (NoSuchScmProviderException e) {
                throw new ReleaseExecutionException("Unable to configure SCM repository: " + e.getMessage(), e);
            }
```

### DuplicatedCode
Duplicated code
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractRewritePomsPhase.java`
#### Snippet
```java
            rewriteArtifactVersions(
                    toMavenCoordinates(buildTarget.getPlugins()),
                    model,
                    properties,
                    result,
                    releaseDescriptor,
                    simulate);

            for (Plugin plugin : buildTarget.getPlugins()) {
                rewriteArtifactVersions(
                        toMavenCoordinates(plugin.getDependencies()),
                        model,
                        properties,
                        result,
                        releaseDescriptor,
                        simulate);
            }

            if (buildTarget.getPluginManagement() != null) {
                rewriteArtifactVersions(
                        toMavenCoordinates(buildTarget.getPluginManagement().getPlugins()),
                        model,
                        properties,
                        result,
                        releaseDescriptor,
                        simulate);

                for (Plugin plugin : buildTarget.getPluginManagement().getPlugins()) {
                    rewriteArtifactVersions(
                            toMavenCoordinates(plugin.getDependencies()),
                            model,
                            properties,
                            result,
                            releaseDescriptor,
                            simulate);
                }
            }
```

### DuplicatedCode
Duplicated code
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/RemoveScmTagPhase.java`
#### Snippet
```java
        ReleaseDescriptor basedirAlignedReleaseDescriptor =
                ReleaseUtil.createBasedirAlignedReleaseDescriptor(releaseDescriptor, reactorProjects);

        ScmRepository repository;
        ScmProvider provider;
        try {
            repository = scmRepositoryConfigurator.getConfiguredRepository(
                    basedirAlignedReleaseDescriptor.getScmSourceUrl(),
                    releaseDescriptor,
                    releaseEnvironment.getSettings());

            repository.getProviderRepository().setPushChanges(releaseDescriptor.isPushChanges());

            repository.getProviderRepository().setWorkItem(releaseDescriptor.getWorkItem());

            provider = scmRepositoryConfigurator.getRepositoryProvider(repository);
        } catch (ScmRepositoryException e) {
            throw new ReleaseScmRepositoryException(e.getMessage(), e.getValidationMessages());
        } catch (NoSuchScmProviderException e) {
            throw new ReleaseExecutionException("Unable to configure SCM repository: " + e.getMessage(), e);
        }
```

### DuplicatedCode
Duplicated code
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/RewritePomsForBranchPhase.java`
#### Snippet
```java
                String rootUrl = ReleaseUtil.realignScmUrl(count, scm.getConnection());

                String subDirectoryBranch = scm.getConnection().substring(rootUrl.length());
                if (!subDirectoryBranch.startsWith("/")) {
                    subDirectoryBranch = "/" + subDirectoryBranch;
                }

                String scmConnectionBranch = branchBase;
                if (scmConnectionBranch != null) {
                    String trunkUrl = scm.getDeveloperConnection();
                    if (trunkUrl == null) {
                        trunkUrl = scm.getConnection();
                    }
                    scmConnectionBranch = translateUrlPath(trunkUrl, branchBase, scm.getConnection());
                }
```

### DuplicatedCode
Duplicated code
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/RewritePomsForBranchPhase.java`
#### Snippet
```java
                String rootUrl = ReleaseUtil.realignScmUrl(count, scm.getUrl());

                String subDirectoryBranch = scm.getUrl().substring(rootUrl.length());
                if (!subDirectoryBranch.startsWith("/")) {
                    subDirectoryBranch = "/" + subDirectoryBranch;
                }

                String tagScmUrl = branchBase;
                if (tagScmUrl != null) {
                    String trunkUrl = scm.getDeveloperConnection();
                    if (trunkUrl == null) {
                        trunkUrl = scm.getConnection();
                    }
                    tagScmUrl = translateUrlPath(trunkUrl, branchBase, scm.getUrl());
                }
```

### DuplicatedCode
Duplicated code
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/scm/JazzScmTranslator.java`
#### Snippet
```java
        int i = url.lastIndexOf(':');
        url = url.substring(0, i + 1);
        if (branchName != null && branchName.endsWith("/")) {
            // Remove the trailing "/", if present.
            branchName = branchName.substring(0, branchName.length() - 1);
        }
        url = url + branchName;
        return url;
```

### DuplicatedCode
Duplicated code
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomBuild.java`
#### Snippet
```java
        Element pluginsElm = build.getChild("plugins", build.getNamespace());
        if (pluginsElm == null) {
            return Collections.emptyList();
        } else {
            List<Element> pluginElms = pluginsElm.getChildren("plugin", build.getNamespace());

            List<Plugin> plugins = new ArrayList<>(pluginElms.size());

            for (Element pluginElm : pluginElms) {
                plugins.add(new JDomPlugin(pluginElm));
            }

            return plugins;
        }
```

### DuplicatedCode
Duplicated code
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomDependencyManagement.java`
#### Snippet
```java
        Element dependenciesElm = dependencyManagement.getChild("dependencies", dependencyManagement.getNamespace());
        if (dependenciesElm == null) {
            return Collections.emptyList();
        } else {
            List<Element> dependencyElms =
                    dependenciesElm.getChildren("dependency", dependencyManagement.getNamespace());

            List<Dependency> dependencies = new ArrayList<>(dependencyElms.size());

            for (Element dependencyElm : dependencyElms) {
                dependencies.add(new JDomDependency(dependencyElm));
            }

            return dependencies;
        }
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/config/PropertiesReleaseDescriptorStore.java`
#### Snippet
```java
        }

        try (OutputStream outStream = new FileOutputStream(file)) {
            properties.store(outStream, "release configuration");
        } catch (IOException e) {
```

## RuleId[id=Deprecation]
### Deprecation
'getModel()' is deprecated
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractRewritePomsPhase.java`
#### Snippet
```java
        }

        transformDocument(project, etl.getModel(), releaseDescriptor, scmRepository, result, simulate);

        File outputFile;
```

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/scm/DefaultScmRepositoryConfigurator.java`
#### Snippet
```java

    @Inject
    public DefaultScmRepositoryConfigurator(ScmManager scmManager, MavenCrypto mavenCrypto) {
        this.scmManager = new AtomicReference<>(requireNonNull(scmManager));
        this.mavenCrypto = requireNonNull(mavenCrypto);
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/util/MavenCrypto.java`
#### Snippet
```java

    @Inject
    public MavenCrypto(DefaultSecDispatcher secDispatcher, PlexusCipher plexusCipher) {
        this.secDispatcher = secDispatcher;
        this.plexusCipher = plexusCipher;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/util/MavenCrypto.java`
#### Snippet
```java

    @Inject
    public MavenCrypto(DefaultSecDispatcher secDispatcher, PlexusCipher plexusCipher) {
        this.secDispatcher = secDispatcher;
        this.plexusCipher = plexusCipher;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/MapBranchVersionsPhase.java`
#### Snippet
```java
    public MapBranchVersionsPhase(
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            Prompter prompter,
            Map<String, VersionPolicy> versionPolicies) {
        super(scmRepositoryConfigurator, prompter, versionPolicies, true, true);
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/MapBranchVersionsPhase.java`
#### Snippet
```java
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            Prompter prompter,
            Map<String, VersionPolicy> versionPolicies) {
        super(scmRepositoryConfigurator, prompter, versionPolicies, true, true);
    }
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/RewritePomVersionsPhase.java`
#### Snippet
```java
    public RewritePomVersionsPhase(
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            Map<String, ModelETLFactory> modelETLFactories,
            Map<String, ScmTranslator> scmTranslators) {
        super(scmRepositoryConfigurator, modelETLFactories, scmTranslators);
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/RewritePomVersionsPhase.java`
#### Snippet
```java
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            Map<String, ModelETLFactory> modelETLFactories,
            Map<String, ScmTranslator> scmTranslators) {
        super(scmRepositoryConfigurator, modelETLFactories, scmTranslators);
    }
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/RewritePomsForDevelopmentPhase.java`
#### Snippet
```java
    public RewritePomsForDevelopmentPhase(
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            Map<String, ModelETLFactory> modelETLFactories,
            Map<String, ScmTranslator> scmTranslators) {
        super(scmRepositoryConfigurator, modelETLFactories, scmTranslators);
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/RewritePomsForDevelopmentPhase.java`
#### Snippet
```java
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            Map<String, ModelETLFactory> modelETLFactories,
            Map<String, ScmTranslator> scmTranslators) {
        super(scmRepositoryConfigurator, modelETLFactories, scmTranslators);
    }
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/MapDevelopmentVersionsPhase.java`
#### Snippet
```java
    public MapDevelopmentVersionsPhase(
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            Prompter prompter,
            Map<String, VersionPolicy> versionPolicies) {
        super(scmRepositoryConfigurator, prompter, versionPolicies, true, false);
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/MapDevelopmentVersionsPhase.java`
#### Snippet
```java
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            Prompter prompter,
            Map<String, VersionPolicy> versionPolicies) {
        super(scmRepositoryConfigurator, prompter, versionPolicies, true, false);
    }
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/DefaultReleaseManager.java`
#### Snippet
```java
    @Inject
    public DefaultReleaseManager(
            Map<String, Strategy> strategies,
            Map<String, ReleasePhase> releasePhases,
            @Named("properties") ReleaseDescriptorStore configStore) {
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/DefaultReleaseManager.java`
#### Snippet
```java
    public DefaultReleaseManager(
            Map<String, Strategy> strategies,
            Map<String, ReleasePhase> releasePhases,
            @Named("properties") ReleaseDescriptorStore configStore) {
        this.strategies = requireNonNull(strategies);
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/RewritePomsForReleasePhase.java`
#### Snippet
```java
    public RewritePomsForReleasePhase(
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            Map<String, ModelETLFactory> modelETLFactories,
            Map<String, ScmTranslator> scmTranslators) {
        super(scmRepositoryConfigurator, modelETLFactories, scmTranslators);
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/RewritePomsForReleasePhase.java`
#### Snippet
```java
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            Map<String, ModelETLFactory> modelETLFactories,
            Map<String, ScmTranslator> scmTranslators) {
        super(scmRepositoryConfigurator, modelETLFactories, scmTranslators);
    }
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/RunCompleteGoalsPhase.java`
#### Snippet
```java
public class RunCompleteGoalsPhase extends AbstractRunGoalsPhase {
    @Inject
    public RunCompleteGoalsPhase(Map<String, MavenExecutor> mavenExecutors) {
        super(mavenExecutors);
    }
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/InputVariablesPhase.java`
#### Snippet
```java
    @Inject
    public InputVariablesPhase(
            Prompter prompter,
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            Map<String, NamingPolicy> namingPolicies) {
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/InputVariablesPhase.java`
#### Snippet
```java
            Prompter prompter,
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            Map<String, NamingPolicy> namingPolicies) {
        super(prompter, scmRepositoryConfigurator, namingPolicies, false, "default");
    }
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/ScmCheckModificationsPhase.java`
#### Snippet
```java
    @Inject
    public ScmCheckModificationsPhase(
            ScmRepositoryConfigurator scmRepositoryConfigurator, Map<String, ScmTranslator> scmTranslators) {
        this.scmRepositoryConfigurator = requireNonNull(scmRepositoryConfigurator);
        this.scmTranslators = requireNonNull(scmTranslators);
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/MapReleaseVersionsPhase.java`
#### Snippet
```java
    public MapReleaseVersionsPhase(
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            Prompter prompter,
            Map<String, VersionPolicy> versionPolicies) {
        super(scmRepositoryConfigurator, prompter, versionPolicies, false, false);
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/MapReleaseVersionsPhase.java`
#### Snippet
```java
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            Prompter prompter,
            Map<String, VersionPolicy> versionPolicies) {
        super(scmRepositoryConfigurator, prompter, versionPolicies, false, false);
    }
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/RunPrepareGoalsPhase.java`
#### Snippet
```java
public class RunPrepareGoalsPhase extends AbstractRunGoalsPhase {
    @Inject
    public RunPrepareGoalsPhase(Map<String, MavenExecutor> mavenExecutors) {
        super(mavenExecutors);
    }
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/GenerateReleasePomsPhase.java`
#### Snippet
```java
    public GenerateReleasePomsPhase(
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            SuperPomProvider superPomProvider,
            ModelInterpolator modelInterpolator,
            Map<String, ScmTranslator> scmTranslators) {
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/GenerateReleasePomsPhase.java`
#### Snippet
```java
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            SuperPomProvider superPomProvider,
            ModelInterpolator modelInterpolator,
            Map<String, ScmTranslator> scmTranslators) {
        super(scmRepositoryConfigurator);
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/GenerateReleasePomsPhase.java`
#### Snippet
```java
            SuperPomProvider superPomProvider,
            ModelInterpolator modelInterpolator,
            Map<String, ScmTranslator> scmTranslators) {
        super(scmRepositoryConfigurator);
        this.superPomProvider = requireNonNull(superPomProvider);
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/BranchInputVariablesPhase.java`
#### Snippet
```java
    @Inject
    public BranchInputVariablesPhase(
            Prompter prompter,
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            Map<String, NamingPolicy> namingPolicies) {
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/BranchInputVariablesPhase.java`
#### Snippet
```java
            Prompter prompter,
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            Map<String, NamingPolicy> namingPolicies) {
        super(prompter, scmRepositoryConfigurator, namingPolicies, true, null);
    }
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/RewritePomsForBranchPhase.java`
#### Snippet
```java
    public RewritePomsForBranchPhase(
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            Map<String, ModelETLFactory> modelETLFactories,
            Map<String, ScmTranslator> scmTranslators) {
        super(scmRepositoryConfigurator, modelETLFactories, scmTranslators);
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/RewritePomsForBranchPhase.java`
#### Snippet
```java
            ScmRepositoryConfigurator scmRepositoryConfigurator,
            Map<String, ModelETLFactory> modelETLFactories,
            Map<String, ScmTranslator> scmTranslators) {
        super(scmRepositoryConfigurator, modelETLFactories, scmTranslators);
    }
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/RunPerformGoalsPhase.java`
#### Snippet
```java
public class RunPerformGoalsPhase extends AbstractRunGoalsPhase {
    @Inject
    public RunPerformGoalsPhase(Map<String, MavenExecutor> mavenExecutors) {
        super(mavenExecutors);
    }
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/CheckDependencySnapshotsPhase.java`
#### Snippet
```java

    @Inject
    public CheckDependencySnapshotsPhase(Prompter prompter) {
        this.prompter = new AtomicReference<>(requireNonNull(prompter));
    }
```

## RuleId[id=RegExpDuplicateAlternationBranch]
### RegExpDuplicateAlternationBranch
Duplicate branch in alternation
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpDuplicateAlternationBranch
Duplicate branch in alternation
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/exec/TeeOutputStream.java`
#### Snippet
```java

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        for (int x = 0; x < len; x++) {
            int c = b[off + x];
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/versions/DefaultVersionInfo.java`
#### Snippet
```java
     */
    @Override
    public int compareTo(VersionInfo obj) {
        DefaultVersionInfo that = (DefaultVersionInfo) obj;

```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `maven-release-api/src/main/java/org/apache/maven/shared/release/config/ReleaseDescriptor.java`
#### Snippet
```java
    /**
     * Get this is a MavenSCM of where you're going to get the sources to make the release with. Example:
     * scm:svn:https://svn.apache.org/repos/asf/maven/plugins/trunk/maven-release-plugin.
     *
     * @return String
```

### JavadocLinkAsPlainText
Link specified as plain text
in `maven-release-api/src/main/java/org/apache/maven/shared/release/config/ReleaseDescriptor.java`
#### Snippet
```java
    /**
     * Get nOTE : currently only implemented with svn scm. Enable a workaround to prevent issue due to svn client &gt;
     * 1.5.0 (https://issues.apache.org/jira/browse/SCM-406).
     *
     * @return boolean
```

### JavadocLinkAsPlainText
Link specified as plain text
in `maven-release-api/src/main/java/org/apache/maven/shared/release/config/ReleaseDescriptor.java`
#### Snippet
```java

    /**
     * Get where you are going to put your tagged sources Example https://svn.apache.org/repos/asf/maven/plugins/tags.
     *
     * @return String
```

### JavadocLinkAsPlainText
Link specified as plain text
in `maven-release-api/src/main/java/org/apache/maven/shared/release/config/ReleaseDescriptor.java`
#### Snippet
```java
    /**
     * Get where you are going to put your branched sources Example
     * https://svn.apache.org/repos/asf/maven/plugins/branches.
     *
     * @return String
```

### JavadocLinkAsPlainText
Link specified as plain text
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/AbstractScmReleaseMojo.java`
#### Snippet
```java
    /**
     * The tag base directory in SVN, you must define it if you don't use the standard svn layout (trunk/tags/branches).
     * For example, <code>http://svn.apache.org/repos/asf/maven/plugins/tags</code>. The URL is an SVN URL and does not
     * include the SCM provider and protocol.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/BranchReleaseMojo.java`
#### Snippet
```java
    /**
     * currently only implemented with svn scm. Enable a workaround to prevent issue
     * due to svn client > 1.5.0 (https://issues.apache.org/jira/browse/SCM-406)
     *
     * @since 2.0
```

### JavadocLinkAsPlainText
Link specified as plain text
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/BranchReleaseMojo.java`
#### Snippet
```java
    /**
     * The branch base directory in SVN, you must define it if you don't use the standard svn layout
     * (trunk/tags/branches). For example, <code>http://svn.apache.org/repos/asf/maven/plugins/branches</code>. The URL
     * is an SVN URL and does not include the SCM provider and protocol.
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/PrepareReleaseMojo.java`
#### Snippet
```java
     * <ul>
     * <li>Enables a workaround to prevent issue due to svn client > 1.5.0 (fixed in 1.6.5)
     * (https://issues.apache.org/jira/browse/SCM-406)</li>
     * <li>You may not want to use this in conjunction with <code>suppressCommitBeforeTag</code>, such that no poms with
     * released versions are committed to the working copy ever.</li>
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/RollbackReleaseMojo.java`
#### Snippet
```java
            defaultValue = "@{prefix} rollback the release of @{releaseLabel}",
            property = "scmRollbackCommitComment")
    private String scmRollbackCommitComment = "@{prefix} rollback the release of @{releaseLabel}";

    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/AbstractScmReleaseMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "true", property = "scmShallowClone")
    private boolean scmShallowClone = true;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/AbstractScmReleaseMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "true", property = "pushChanges")
    private boolean pushChanges = true;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/BranchReleaseMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "@{prefix} prepare branch @{releaseLabel}", property = "scmBranchCommitComment")
    private String scmBranchCommitComment = "@{prefix} prepare branch @{releaseLabel}";

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/PerformReleaseMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "true", property = "scmShallowClone")
    private boolean scmShallowClone = true;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/PrepareReleaseMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "signTag")
    private boolean signTag = false;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/PrepareReleaseMojo.java`
#### Snippet
```java
            defaultValue = "@{prefix} prepare for next development iteration",
            property = "scmDevelopmentCommitComment")
    private String scmDevelopmentCommitComment = "@{prefix} prepare for next development iteration";

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/PrepareReleaseMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "@{prefix} prepare release @{releaseLabel}", property = "scmReleaseCommitComment")
    private String scmReleaseCommitComment = "@{prefix} prepare release @{releaseLabel}";

    /**
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/util/PomFinder.java`
#### Snippet
```java
                return false;
            }
            if (parentGroupId != null ? !parentGroupId.equals(pomInfo.parentGroupId) : pomInfo.parentGroupId != null) {
                return false;
            }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/RemoveReleasePomsPhase.java`
#### Snippet
```java
        } else {
            for (File releasePom : releasePoms) {
                releasePom.delete();
            }
        }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/CheckoutProjectFromScm.java`
#### Snippet
```java
        }

        checkoutDirectory.mkdirs();

        CommandParameters commandParameters = new CommandParameters();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractBackupPomsPhase.java`
#### Snippet
```java

        if (pomBackup != null && pomBackup.exists()) {
            pomBackup.delete();
        }
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/config/PropertiesReleaseDescriptorStore.java`
#### Snippet
```java
        File file = getDefaultReleasePropertiesFile(config);
        if (file.exists()) {
            file.delete();
        }
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractRewritePomsPhase.java`
#### Snippet
```java
                    File file = new File(pomFile.getParentFile(), pomFile.getName() + "." + getPomSuffix());
                    if (file.exists()) {
                        file.delete();
                    }
                }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param strDigits` tag description is missing
in `maven-release-api/src/main/java/org/apache/maven/shared/release/versions/Version.java`
#### Snippet
```java
     * Splits the string on "." and returns a list containing each digit.
     *
     * @param strDigits
     */
    private List<String> parseDigits(String strDigits) {
```

### JavadocDeclaration
Wrong tag `todo`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/ScmCheckModificationsPhase.java`
#### Snippet
```java
     * The filepatterns to exclude from the status check.
     *
     * @todo proper construction of filenames, especially release properties
     */
    private final Set<String> exclusionPatterns = new HashSet<>(Arrays.asList(
```

### JavadocDeclaration
`@param strDigits` tag description is missing
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/versions/DefaultVersionInfo.java`
#### Snippet
```java
     * containing each digit.
     *
     * @param strDigits
     */
    private List<String> parseDigits(String strDigits) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `aetherComparisonResult` may be 'final'
in `maven-release-api/src/main/java/org/apache/maven/shared/release/versions/VersionComparisonConflictException.java`
#### Snippet
```java
    private final String rhsVersion;

    private int aetherComparisonResult;

    private int mavenComparisonResult;
```

### FieldMayBeFinal
Field `mavenComparisonResult` may be 'final'
in `maven-release-api/src/main/java/org/apache/maven/shared/release/versions/VersionComparisonConflictException.java`
#### Snippet
```java
    private int aetherComparisonResult;

    private int mavenComparisonResult;

    /**
```

### FieldMayBeFinal
Field `scmRollbackCommitComment` may be 'final'
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/RollbackReleaseMojo.java`
#### Snippet
```java
            defaultValue = "@{prefix} rollback the release of @{releaseLabel}",
            property = "scmRollbackCommitComment")
    private String scmRollbackCommitComment = "@{prefix} rollback the release of @{releaseLabel}";

    @Override
```

### FieldMayBeFinal
Field `stdOut` may be 'final'
in `maven-release-api/src/main/java/org/apache/maven/shared/release/ReleaseResult.java`
#### Snippet
```java
    public static final int ERROR = 1;

    private StringBuilder stdOut = new StringBuilder();

    private int resultCode = UNDEFINED;
```

### FieldMayBeFinal
Field `scmShallowClone` may be 'final'
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/AbstractScmReleaseMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "true", property = "scmShallowClone")
    private boolean scmShallowClone = true;

    /**
```

### FieldMayBeFinal
Field `pushChanges` may be 'final'
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/AbstractScmReleaseMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "true", property = "pushChanges")
    private boolean pushChanges = true;

    /**
```

### FieldMayBeFinal
Field `buildSeparator` may be 'final'
in `maven-release-api/src/main/java/org/apache/maven/shared/release/versions/Version.java`
#### Snippet
```java
    private String annotationRevSeparator;

    private String buildSeparator;

    private static final int DIGITS_INDEX = 1;
```

### FieldMayBeFinal
Field `scmBranchCommitComment` may be 'final'
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/BranchReleaseMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "@{prefix} prepare branch @{releaseLabel}", property = "scmBranchCommitComment")
    private String scmBranchCommitComment = "@{prefix} prepare branch @{releaseLabel}";

    /**
```

### FieldMayBeFinal
Field `scmShallowClone` may be 'final'
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/PerformReleaseMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "true", property = "scmShallowClone")
    private boolean scmShallowClone = true;

    /**
```

### FieldMayBeFinal
Field `signTag` may be 'final'
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/PrepareReleaseMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "signTag")
    private boolean signTag = false;

    /**
```

### FieldMayBeFinal
Field `scmDevelopmentCommitComment` may be 'final'
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/PrepareReleaseMojo.java`
#### Snippet
```java
            defaultValue = "@{prefix} prepare for next development iteration",
            property = "scmDevelopmentCommitComment")
    private String scmDevelopmentCommitComment = "@{prefix} prepare for next development iteration";

    /**
```

### FieldMayBeFinal
Field `scmReleaseCommitComment` may be 'final'
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/PrepareReleaseMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "@{prefix} prepare release @{releaseLabel}", property = "scmReleaseCommitComment")
    private String scmReleaseCommitComment = "@{prefix} prepare release @{releaseLabel}";

    /**
```

### FieldMayBeFinal
Field `scm` may be 'final'
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomScm.java`
#### Snippet
```java
 */
public class JDomScm extends Scm {
    private Element scm;

    JDomScm(Element scm) {
```

### FieldMayBeFinal
Field `parent` may be 'final'
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomParent.java`
#### Snippet
```java
 */
public class JDomParent extends Parent {
    private Element parent;

    /**
```

### FieldMayBeFinal
Field `plugin` may be 'final'
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomPlugin.java`
#### Snippet
```java
 */
public class JDomPlugin extends Plugin implements MavenCoordinate {
    private Element plugin;
    private final MavenCoordinate coordinate;

```

### FieldMayBeFinal
Field `scmTranslators` may be 'final'
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractRewritePomsPhase.java`
#### Snippet
```java
     * SCM URL translators mapped by provider name.
     */
    private Map<String, ScmTranslator> scmTranslators;

    /**
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `providerImplementations` are queried, but never updated
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/AbstractScmReleaseMojo.java`
#### Snippet
```java
     */
    @Parameter
    private Map<String, String> providerImplementations;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `providerImplementations` are queried, but never updated
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/PerformReleaseMojo.java`
#### Snippet
```java
     */
    @Parameter
    private Map<String, String> providerImplementations;

    /**
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `project` is redundant
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/phase/AbstractMapVersionsPhase.java`
#### Snippet
```java
        if (releaseDescriptor.isAutoVersionSubmodules() && ArtifactUtils.isSnapshot(rootProject.getVersion())) {
            // get the root project
            MavenProject project = rootProject;

            String projectId = ArtifactUtils.versionlessKey(project.getGroupId(), project.getArtifactId());
```

### UnnecessaryLocalVariable
Local variable `PI` is redundant
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String DOCTYPE =
                        "<!DOCTYPE(?:(?:[^\"'\\[>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+')|(?:" + INTSUB + "))*+>";
                final String PI = XML;
                final String COMMENT = "<!--(?:[^-]|(?:-[^-]))*+-->";

```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomProperties.java`
#### Snippet
```java

    @Override
    public synchronized void loadFromXML(InputStream in) throws IOException, InvalidPropertiesFormatException {
        throw new UnsupportedOperationException();
    }
```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[^\"'>]++)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                // CHECKSTYLE_OFF: LocalFinalVariableName
                final String SPACE = "\\s++";
                final String XML = "<\\?(?:(?:[^\"'>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+>";
                final String INTSUB = "\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]";
                final String DOCTYPE =
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\"[^\"]*+\")`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                // CHECKSTYLE_OFF: LocalFinalVariableName
                final String SPACE = "\\s++";
                final String XML = "<\\?(?:(?:[^\"'>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+>";
                final String INTSUB = "\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]";
                final String DOCTYPE =
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:'[^\']*+')`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                // CHECKSTYLE_OFF: LocalFinalVariableName
                final String SPACE = "\\s++";
                final String XML = "<\\?(?:(?:[^\"'>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+>";
                final String INTSUB = "\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]";
                final String DOCTYPE =
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[^\"'\\]]++)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String SPACE = "\\s++";
                final String XML = "<\\?(?:(?:[^\"'>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+>";
                final String INTSUB = "\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]";
                final String DOCTYPE =
                        "<!DOCTYPE(?:(?:[^\"'\\[>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+')|(?:" + INTSUB + "))*+>";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\"[^\"]*+\")`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String SPACE = "\\s++";
                final String XML = "<\\?(?:(?:[^\"'>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+>";
                final String INTSUB = "\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]";
                final String DOCTYPE =
                        "<!DOCTYPE(?:(?:[^\"'\\[>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+')|(?:" + INTSUB + "))*+>";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:'[^\']*+')`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String SPACE = "\\s++";
                final String XML = "<\\?(?:(?:[^\"'>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+>";
                final String INTSUB = "\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]";
                final String DOCTYPE =
                        "<!DOCTYPE(?:(?:[^\"'\\[>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+')|(?:" + INTSUB + "))*+>";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[^\"'\\[>]++)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String INTSUB = "\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]";
                final String DOCTYPE =
                        "<!DOCTYPE(?:(?:[^\"'\\[>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+')|(?:" + INTSUB + "))*+>";
                final String PI = XML;
                final String COMMENT = "<!--(?:[^-]|(?:-[^-]))*+-->";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\"[^\"]*+\")`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String INTSUB = "\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]";
                final String DOCTYPE =
                        "<!DOCTYPE(?:(?:[^\"'\\[>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+')|(?:" + INTSUB + "))*+>";
                final String PI = XML;
                final String COMMENT = "<!--(?:[^-]|(?:-[^-]))*+-->";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:'[^\']*+')`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String INTSUB = "\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]";
                final String DOCTYPE =
                        "<!DOCTYPE(?:(?:[^\"'\\[>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+')|(?:" + INTSUB + "))*+>";
                final String PI = XML;
                final String COMMENT = "<!--(?:[^-]|(?:-[^-]))*+-->";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\[(?:(?:[^"'\]]++)|(?:"[^"]*+")|(?:'[^']*+'))*+\])`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String INTSUB = "\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]";
                final String DOCTYPE =
                        "<!DOCTYPE(?:(?:[^\"'\\[>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+')|(?:" + INTSUB + "))*+>";
                final String PI = XML;
                final String COMMENT = "<!--(?:[^-]|(?:-[^-]))*+-->";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[^"'\]]++)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String INTSUB = "\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]";
                final String DOCTYPE =
                        "<!DOCTYPE(?:(?:[^\"'\\[>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+')|(?:" + INTSUB + "))*+>";
                final String PI = XML;
                final String COMMENT = "<!--(?:[^-]|(?:-[^-]))*+-->";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:"[^"]*+")`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String INTSUB = "\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]";
                final String DOCTYPE =
                        "<!DOCTYPE(?:(?:[^\"'\\[>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+')|(?:" + INTSUB + "))*+>";
                final String PI = XML;
                final String COMMENT = "<!--(?:[^-]|(?:-[^-]))*+-->";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:'[^']*+')`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String INTSUB = "\\[(?:(?:[^\"'\\]]++)|(?:\"[^\"]*+\")|(?:'[^\']*+'))*+\\]";
                final String DOCTYPE =
                        "<!DOCTYPE(?:(?:[^\"'\\[>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+')|(?:" + INTSUB + "))*+>";
                final String PI = XML;
                final String COMMENT = "<!--(?:[^-]|(?:-[^-]))*+-->";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:-[^-])`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "<!DOCTYPE(?:(?:[^\"'\\[>]++)|(?:\"[^\"]*+\")|(?:'[^\']*+')|(?:" + INTSUB + "))*+>";
                final String PI = XML;
                final String COMMENT = "<!--(?:[^-]|(?:-[^-]))*+-->";

                final String INTRO =
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\s++)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:<\?(?:(?:[^"'>]++)|(?:"[^"]*+")|(?:'[^']*+'))*+>)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[^"'>]++)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:"[^"]*+")`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:'[^']*+')`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:``]++)|(?:"[^"]*+")|(?:'[^']*+')|(?:\[(?:(?:[^"'\]]++)|(?:"[^"]*+")|(?:'[^']*+'))*+\]))*+>)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[^"'\[>]++)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:"[^"]*+")`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:'[^']*+')`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\[(?:(?:[^"'\]]++)|(?:"[^"]*+")|(?:'[^']*+'))*+\])`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[^"'\]]++)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:``)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:-[^-])`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:<\?(?:(?:[^"'>]++)|(?:"[^"]*+")|(?:'[^']*+'))*+>)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[^"'>]++)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:"[^"]*+")`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:'[^']*+')`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java

                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\s++)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:``)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:-[^-])`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:<\?(?:(?:[^"'>]++)|(?:"[^"]*+")|(?:'[^']*+'))*+>)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[^"'>]++)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:"[^"]*+")`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:'[^']*+')`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                final String INTRO =
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\s++)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:<\?(?:(?:[^"'>]++)|(?:"[^"]*+")|(?:'[^']*+'))*+>)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[^"'>]++)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:"[^"]*+")`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:'[^']*+')`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:``]++)|(?:"[^"]*+")|(?:'[^']*+')|(?:\[(?:(?:[^"'\]]++)|(?:"[^"]*+")|(?:'[^']*+'))*+\]))*+>)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[^"'\[>]++)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\[(?:(?:[^"'\]]++)|(?:"[^"]*+")|(?:'[^']*+'))*+\])`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[^"'\]]++)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:``)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:-[^-])`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\s++)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:``)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:-[^-])`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:<\?(?:(?:[^"'>]++)|(?:"[^"]*+")|(?:'[^']*+'))*+>)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[^"'>]++)`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:"[^"]*+")`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:'[^']*+')`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/transform/jdom2/JDomModelETL.java`
#### Snippet
```java
                        "(?:(?:" + SPACE + ")|(?:" + XML + ")|(?:" + DOCTYPE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String OUTRO = "(?:(?:" + SPACE + ")|(?:" + COMMENT + ")|(?:" + PI + "))*";
                final String POM = "(?s)(" + INTRO + ")(.*?)(" + OUTRO + ")";
                // CHECKSTYLE_ON: LocalFinalVariableName

```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/exec/RawStreamPumper.java`
#### Snippet
```java
                        }
                    } else {
                        Thread.sleep(1);
                    }
                }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `defaultVersionInfo` initializer `null` is redundant
in `maven-release-policies/maven-release-oddeven-policy/src/main/java/org/apache/maven/shared/release/policy/oddeven/OddEvenVersionPolicy.java`
#### Snippet
```java

    private VersionPolicyResult calculateNextVersion(VersionPolicyRequest request, boolean development) {
        Version defaultVersionInfo = null;

        try {
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `i != -1` is always `true`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/exec/RawStreamPumper.java`
#### Snippet
```java
                int i = in.read(buffer);
                while (i != -1 && !done) {
                    if (i != -1) {
                        out.write(buffer, 0, i);
                        out.flush();
```

### ConstantValue
Value `generateReleasePoms` is always 'false'
in `maven-release-plugin/src/main/java/org/apache/maven/plugins/release/PrepareReleaseMojo.java`
#### Snippet
```java
        }

        prepareRelease(generateReleasePoms);
    }

```

### ConstantValue
Condition `DEVELOPMENT_KEY.equals(versionType)` is always `true`
in `maven-release-manager/src/main/java/org/apache/maven/shared/release/config/ReleaseUtils.java`
#### Snippet
```java
                if (RELEASE_KEY.equals(versionType)) {
                    builder.addDependencyReleaseVersion(artifactVersionlessKey, currentEntry.getValue());
                } else if (DEVELOPMENT_KEY.equals(versionType)) {
                    builder.addDependencyDevelopmentVersion(artifactVersionlessKey, currentEntry.getValue());
                }
```

