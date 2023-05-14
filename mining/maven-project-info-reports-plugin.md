# maven-project-info-reports-plugin 
 
# Bad smells
I found 198 bad smells with 13 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 81 | false |
| JavadocDeclaration | 60 | false |
| FieldMayBeFinal | 17 | false |
| UNCHECKED_WARNING | 8 | false |
| ProtectedMemberInFinalClass | 6 | true |
| ToArrayCallWithZeroLengthArrayArgument | 5 | true |
| DuplicatedCode | 4 | false |
| JavadocLinkAsPlainText | 3 | false |
| RegExpRedundantEscape | 2 | false |
| TrivialIf | 2 | false |
| DataFlowIssue | 1 | false |
| EmptyStatementBody | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| IOStreamConstructor | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| InnerClassMayBeStatic | 1 | true |
| UnusedAssignment | 1 | false |
| ConstantValue | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[requiredArray.size()\]'
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
                    properties);

            return requiredArray.toArray(new String[requiredArray.size()]);
        }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[var.size()\]'
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
                    // Comma separated roles
                    List<String> var = member.getRoles();
                    tableCell(StringUtils.join(var.toArray(new String[var.size()]), ", "));
                } else {
                    tableCell(null);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[textRow.size()\]'
in `src/main/java/org/apache/maven/report/projectinfo/MailingListsReport.java`
#### Snippet
```java
                            ProjectInfoReportUtils.getArchiveServer(otherArchive), otherArchive));

                    tableRow(textRow.toArray(new String[textRow.size()]));

                    // Other lines...
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[textRow.size()\]'
in `src/main/java/org/apache/maven/report/projectinfo/MailingListsReport.java`
#### Snippet
```java
                                ProjectInfoReportUtils.getArchiveServer(otherArchive), otherArchive));

                        tableRow(textRow.toArray(new String[textRow.size()]));
                    }
                } else {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[textRow.size()\]'
in `src/main/java/org/apache/maven/report/projectinfo/MailingListsReport.java`
#### Snippet
```java
                    }

                    tableRow(textRow.toArray(new String[textRow.size()]));
                }
            }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/org/apache/maven/report/projectinfo/PluginsReport.java`
#### Snippet
```java
            this.log = log;

            this.plugins = new ArrayList<>(plugins);

            this.reports = new ArrayList<>(reports);
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/org/apache/maven/report/projectinfo/PluginsReport.java`
#### Snippet
```java
            this.log = log;

            this.plugins = new ArrayList<>(plugins);

            this.reports = new ArrayList<>(reports);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/org/apache/maven/report/projectinfo/PluginsReport.java`
#### Snippet
```java
            this.plugins = new ArrayList<>(plugins);

            this.reports = new ArrayList<>(reports);

            this.project = project;
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/org/apache/maven/report/projectinfo/PluginsReport.java`
#### Snippet
```java
            this.plugins = new ArrayList<>(plugins);

            this.reports = new ArrayList<>(reports);

            this.project = project;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/ManagementDependencies.java`
#### Snippet
```java
     */
    public List<Dependency> getManagementDependencies() {
        return new ArrayList<>(dependencies);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/ManagementDependencies.java`
#### Snippet
```java
     */
    public List<Dependency> getManagementDependencies() {
        return new ArrayList<>(dependencies);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/Dependencies.java`
#### Snippet
```java
        }

        projectTransitiveDependencies = new ArrayList<>(getAllDependencies());
        projectTransitiveDependencies.removeAll(getProjectDependencies());

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/Dependencies.java`
#### Snippet
```java
        }

        projectTransitiveDependencies = new ArrayList<>(getAllDependencies());
        projectTransitiveDependencies.removeAll(getProjectDependencies());

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `Sink`
in `src/main/java/org/apache/maven/report/projectinfo/PluginManagementReport.java`
#### Snippet
```java
        /**
         * @param log {@link #log}
         * @param sink {@link Sink}
         * @param locale {@link Locale}
         * @param i18n {@link I18N}
```

### JavadocReference
Cannot resolve symbol `I18N`
in `src/main/java/org/apache/maven/report/projectinfo/PluginManagementReport.java`
#### Snippet
```java
         * @param sink {@link Sink}
         * @param locale {@link Locale}
         * @param i18n {@link I18N}
         * @param plugins {@link Plugin}
         * @param project {@link MavenProject}
```

### JavadocReference
Cannot resolve symbol `Plugin`
in `src/main/java/org/apache/maven/report/projectinfo/PluginManagementReport.java`
#### Snippet
```java
         * @param locale {@link Locale}
         * @param i18n {@link I18N}
         * @param plugins {@link Plugin}
         * @param project {@link MavenProject}
         * @param projectBuilder {@link ProjectBuilder}
```

### JavadocReference
Cannot resolve symbol `MavenProject`
in `src/main/java/org/apache/maven/report/projectinfo/PluginManagementReport.java`
#### Snippet
```java
         * @param i18n {@link I18N}
         * @param plugins {@link Plugin}
         * @param project {@link MavenProject}
         * @param projectBuilder {@link ProjectBuilder}
         * @param repositorySystem {@link RepositorySystem}
```

### JavadocReference
Cannot resolve symbol `Sink`
in `src/main/java/org/apache/maven/report/projectinfo/PluginsReport.java`
#### Snippet
```java
        /**
         * @param log {@link #log}
         * @param sink {@link Sink}
         * @param locale {@link Locale}
         * @param i18n {@link I18N}
```

### JavadocReference
Cannot resolve symbol `ProjectBuilder`
in `src/main/java/org/apache/maven/report/projectinfo/PluginManagementReport.java`
#### Snippet
```java
         * @param plugins {@link Plugin}
         * @param project {@link MavenProject}
         * @param projectBuilder {@link ProjectBuilder}
         * @param repositorySystem {@link RepositorySystem}
         * @param buildingRequest {@link ProjectBuildingRequest}
```

### JavadocReference
Cannot resolve symbol `I18N`
in `src/main/java/org/apache/maven/report/projectinfo/PluginsReport.java`
#### Snippet
```java
         * @param sink {@link Sink}
         * @param locale {@link Locale}
         * @param i18n {@link I18N}
         * @param plugins {@link Artifact}
         * @param reports {@link Artifact}
```

### JavadocReference
Cannot resolve symbol `RepositorySystem`
in `src/main/java/org/apache/maven/report/projectinfo/PluginManagementReport.java`
#### Snippet
```java
         * @param project {@link MavenProject}
         * @param projectBuilder {@link ProjectBuilder}
         * @param repositorySystem {@link RepositorySystem}
         * @param buildingRequest {@link ProjectBuildingRequest}
         * @param excludes the list of plugins to be excluded from the report
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/PluginsReport.java`
#### Snippet
```java
         * @param locale {@link Locale}
         * @param i18n {@link I18N}
         * @param plugins {@link Artifact}
         * @param reports {@link Artifact}
         * @param project {@link MavenProject}
```

### JavadocReference
Cannot resolve symbol `ProjectBuildingRequest`
in `src/main/java/org/apache/maven/report/projectinfo/PluginManagementReport.java`
#### Snippet
```java
         * @param projectBuilder {@link ProjectBuilder}
         * @param repositorySystem {@link RepositorySystem}
         * @param buildingRequest {@link ProjectBuildingRequest}
         * @param excludes the list of plugins to be excluded from the report
         */
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/PluginsReport.java`
#### Snippet
```java
         * @param i18n {@link I18N}
         * @param plugins {@link Artifact}
         * @param reports {@link Artifact}
         * @param project {@link MavenProject}
         * @param projectBuilder {@link ProjectBuilder}
```

### JavadocReference
Cannot resolve symbol `MavenProject`
in `src/main/java/org/apache/maven/report/projectinfo/PluginsReport.java`
#### Snippet
```java
         * @param plugins {@link Artifact}
         * @param reports {@link Artifact}
         * @param project {@link MavenProject}
         * @param projectBuilder {@link ProjectBuilder}
         * @param repositorySystem {@link RepositorySystem}
```

### JavadocReference
Cannot resolve symbol `ProjectBuilder`
in `src/main/java/org/apache/maven/report/projectinfo/PluginsReport.java`
#### Snippet
```java
         * @param reports {@link Artifact}
         * @param project {@link MavenProject}
         * @param projectBuilder {@link ProjectBuilder}
         * @param repositorySystem {@link RepositorySystem}
         * @param buildingRequest {@link ProjectBuildingRequest}
```

### JavadocReference
Cannot resolve symbol `RepositorySystem`
in `src/main/java/org/apache/maven/report/projectinfo/PluginsReport.java`
#### Snippet
```java
         * @param project {@link MavenProject}
         * @param projectBuilder {@link ProjectBuilder}
         * @param repositorySystem {@link RepositorySystem}
         * @param buildingRequest {@link ProjectBuildingRequest}
         *
```

### JavadocReference
Cannot resolve symbol `ProjectBuildingRequest`
in `src/main/java/org/apache/maven/report/projectinfo/PluginsReport.java`
#### Snippet
```java
         * @param projectBuilder {@link ProjectBuilder}
         * @param repositorySystem {@link RepositorySystem}
         * @param buildingRequest {@link ProjectBuildingRequest}
         *
         */
```

### JavadocReference
Cannot resolve symbol `Sink`
in `src/main/java/org/apache/maven/report/projectinfo/AbstractProjectInfoRenderer.java`
#### Snippet
```java

    /**
     * @param sink {@link Sink}
     * @param i18n {@link I18N}
     * @param locale {@link Locale}
```

### JavadocReference
Cannot resolve symbol `I18N`
in `src/main/java/org/apache/maven/report/projectinfo/AbstractProjectInfoRenderer.java`
#### Snippet
```java
    /**
     * @param sink {@link Sink}
     * @param i18n {@link I18N}
     * @param locale {@link Locale}
     */
```

### JavadocReference
Cannot resolve symbol `I18N`
in `src/main/java/org/apache/maven/report/projectinfo/AbstractProjectInfoRenderer.java`
#### Snippet
```java
public abstract class AbstractProjectInfoRenderer extends AbstractMavenReportRenderer {
    /**
     * {@link I18N}.
     */
    protected I18N i18n;
```

### JavadocReference
Cannot resolve symbol `MavenReportException`
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * @param buildingRequest
     * @return root node of dependency tree
     * @throws MavenReportException
     */
    private DependencyNode getNode(ProjectBuildingRequest buildingRequest) throws MavenReportException {
```

### JavadocReference
Cannot resolve symbol `MavenReportException`
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * @return DependencyAnalyzeResult contains conflicting dependencies map, snapshot dependencies map and all
     * dependencies map.
     * @throws MavenReportException
     */
    private DependencyAnalyzeResult analyzeDependencyTree() throws MavenReportException {
```

### JavadocReference
Cannot resolve symbol `Sink`
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java

    /**
     * @param sink {@link Sink}
     * @return {@link DependencyNodeVisitor}
     */
```

### JavadocReference
Cannot resolve symbol `DependencyNodeVisitor`
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
    /**
     * @param sink {@link Sink}
     * @return {@link DependencyNodeVisitor}
     */
    public DependencyNodeVisitor getSerializingDependencyNodeVisitor(Sink sink) {
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/ManagementDependencies.java`
#### Snippet
```java
    /**
     * @return the dependencies by scope
     * @see Artifact#SCOPE_COMPILE
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
```

### JavadocReference
Cannot resolve symbol `SCOPE_COMPILE`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/ManagementDependencies.java`
#### Snippet
```java
    /**
     * @return the dependencies by scope
     * @see Artifact#SCOPE_COMPILE
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/ManagementDependencies.java`
#### Snippet
```java
     * @return the dependencies by scope
     * @see Artifact#SCOPE_COMPILE
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
```

### JavadocReference
Cannot resolve symbol `SCOPE_PROVIDED`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/ManagementDependencies.java`
#### Snippet
```java
     * @return the dependencies by scope
     * @see Artifact#SCOPE_COMPILE
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/ManagementDependencies.java`
#### Snippet
```java
     * @see Artifact#SCOPE_COMPILE
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
     * @see Artifact#SCOPE_TEST
```

### JavadocReference
Cannot resolve symbol `SCOPE_RUNTIME`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/ManagementDependencies.java`
#### Snippet
```java
     * @see Artifact#SCOPE_COMPILE
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
     * @see Artifact#SCOPE_TEST
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/ManagementDependencies.java`
#### Snippet
```java
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
     * @see Artifact#SCOPE_TEST
     */
```

### JavadocReference
Cannot resolve symbol `SCOPE_SYSTEM`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/ManagementDependencies.java`
#### Snippet
```java
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
     * @see Artifact#SCOPE_TEST
     */
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/ManagementDependencies.java`
#### Snippet
```java
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
     * @see Artifact#SCOPE_TEST
     */
    public Map<String, List<Dependency>> getManagementDependenciesByScope() {
```

### JavadocReference
Cannot resolve symbol `SCOPE_TEST`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/ManagementDependencies.java`
#### Snippet
```java
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
     * @see Artifact#SCOPE_TEST
     */
    public Map<String, List<Dependency>> getManagementDependenciesByScope() {
```

### JavadocReference
Cannot resolve symbol `createLinkPatternedText(String,String)`
in `src/main/java/org/apache/maven/report/projectinfo/MailingListsReport.java`
#### Snippet
```java
         * @param defaultHref the String to use in case href is null.
         * @return a link pattern.
         * @see #createLinkPatternedText(String,String)
         */
        private String createURILinkPatternedText(String text, String href, String defaultHref) {
```

### JavadocReference
Cannot resolve symbol `Sink`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependencyManagementRenderer.java`
#### Snippet
```java
     * Default constructor
     *
     * @param sink {@link Sink}
     * @param locale {@link Locale}
     * @param i18n {@link I18N}
```

### JavadocReference
Cannot resolve symbol `I18N`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependencyManagementRenderer.java`
#### Snippet
```java
     * @param sink {@link Sink}
     * @param locale {@link Locale}
     * @param i18n {@link I18N}
     * @param log {@link Log}
     * @param dependencies {@link ManagementDependencies}
```

### JavadocReference
Cannot resolve symbol `Log`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependencyManagementRenderer.java`
#### Snippet
```java
     * @param locale {@link Locale}
     * @param i18n {@link I18N}
     * @param log {@link Log}
     * @param dependencies {@link ManagementDependencies}
     * @param artifactMetadataSource {@link ArtifactMetadataSource}
```

### JavadocReference
Cannot resolve symbol `ArtifactMetadataSource`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependencyManagementRenderer.java`
#### Snippet
```java
     * @param log {@link Log}
     * @param dependencies {@link ManagementDependencies}
     * @param artifactMetadataSource {@link ArtifactMetadataSource}
     * @param repositorySystem {@link RepositorySystem}
     * @param projectBuilder {@link ProjectBuilder}
```

### JavadocReference
Cannot resolve symbol `RepositorySystem`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependencyManagementRenderer.java`
#### Snippet
```java
     * @param dependencies {@link ManagementDependencies}
     * @param artifactMetadataSource {@link ArtifactMetadataSource}
     * @param repositorySystem {@link RepositorySystem}
     * @param projectBuilder {@link ProjectBuilder}
     * @param buildingRequest {@link ProjectBuildingRequest}
```

### JavadocReference
Cannot resolve symbol `ProjectBuilder`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependencyManagementRenderer.java`
#### Snippet
```java
     * @param artifactMetadataSource {@link ArtifactMetadataSource}
     * @param repositorySystem {@link RepositorySystem}
     * @param projectBuilder {@link ProjectBuilder}
     * @param buildingRequest {@link ProjectBuildingRequest}
     * @param repoUtils {@link RepositoryUtils}
```

### JavadocReference
Cannot resolve symbol `ProjectBuildingRequest`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependencyManagementRenderer.java`
#### Snippet
```java
     * @param repositorySystem {@link RepositorySystem}
     * @param projectBuilder {@link ProjectBuilder}
     * @param buildingRequest {@link ProjectBuildingRequest}
     * @param repoUtils {@link RepositoryUtils}
     * @param licenseMappings {@link LicenseMapping}
```

### JavadocReference
Cannot resolve symbol `ProjectBuildingException`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/RepositoryUtils.java`
#### Snippet
```java
     * @param artifact an artifact
     * @return the Maven project for the given artifact
     * @throws ProjectBuildingException if any
     */
    public MavenProject getMavenProjectFromRepository(Artifact artifact) throws ProjectBuildingException {
```

### JavadocReference
Cannot resolve symbol `ArtifactResolverException`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/RepositoryUtils.java`
#### Snippet
```java
    /**
     * @param artifact not null
     * @throws ArtifactResolverException if any
     */
    public void resolve(Artifact artifact) throws ArtifactResolverException {
```

### JavadocReference
Cannot resolve symbol `Log`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/RepositoryUtils.java`
#### Snippet
```java

    /**
     * @param log {@link Log}
     * @param projectBuilder {@link ProjectBuilder}
     * @param repositorySystem {@link RepositorySystem}
```

### JavadocReference
Cannot resolve symbol `ProjectBuilder`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/RepositoryUtils.java`
#### Snippet
```java
    /**
     * @param log {@link Log}
     * @param projectBuilder {@link ProjectBuilder}
     * @param repositorySystem {@link RepositorySystem}
     * @param resolver {@link ArtifactResolver}
```

### JavadocReference
Cannot resolve symbol `RepositorySystem`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/RepositoryUtils.java`
#### Snippet
```java
     * @param log {@link Log}
     * @param projectBuilder {@link ProjectBuilder}
     * @param repositorySystem {@link RepositorySystem}
     * @param resolver {@link ArtifactResolver}
     * @param remoteRepositories {@link ArtifactRepository}
```

### JavadocReference
Cannot resolve symbol `ArtifactResolver`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/RepositoryUtils.java`
#### Snippet
```java
     * @param projectBuilder {@link ProjectBuilder}
     * @param repositorySystem {@link RepositorySystem}
     * @param resolver {@link ArtifactResolver}
     * @param remoteRepositories {@link ArtifactRepository}
     * @param pluginRepositories {@link ArtifactRepository}
```

### JavadocReference
Cannot resolve symbol `ArtifactRepository`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/RepositoryUtils.java`
#### Snippet
```java
     * @param repositorySystem {@link RepositorySystem}
     * @param resolver {@link ArtifactResolver}
     * @param remoteRepositories {@link ArtifactRepository}
     * @param pluginRepositories {@link ArtifactRepository}
     * @param buildingRequest {@link ProjectBuildingRequest}
```

### JavadocReference
Cannot resolve symbol `ArtifactRepository`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/RepositoryUtils.java`
#### Snippet
```java
     * @param resolver {@link ArtifactResolver}
     * @param remoteRepositories {@link ArtifactRepository}
     * @param pluginRepositories {@link ArtifactRepository}
     * @param buildingRequest {@link ProjectBuildingRequest}
     * @param repositoryMetadataManager {@link RepositoryMetadataManager}
```

### JavadocReference
Cannot resolve symbol `ProjectBuildingRequest`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/RepositoryUtils.java`
#### Snippet
```java
     * @param remoteRepositories {@link ArtifactRepository}
     * @param pluginRepositories {@link ArtifactRepository}
     * @param buildingRequest {@link ProjectBuildingRequest}
     * @param repositoryMetadataManager {@link RepositoryMetadataManager}
     */
```

### JavadocReference
Cannot resolve symbol `RepositoryMetadataManager`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/RepositoryUtils.java`
#### Snippet
```java
     * @param pluginRepositories {@link ArtifactRepository}
     * @param buildingRequest {@link ProjectBuildingRequest}
     * @param repositoryMetadataManager {@link RepositoryMetadataManager}
     */
    public RepositoryUtils(
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/Dependencies.java`
#### Snippet
```java
     * @param isTransitively <code>true</code> to return transitive dependencies, <code>false</code> otherwise.
     * @return a map with supported scopes as key and a list of <code>Artifact</code> as values.
     * @see Artifact#SCOPE_COMPILE
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
```

### JavadocReference
Cannot resolve symbol `SCOPE_COMPILE`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/Dependencies.java`
#### Snippet
```java
     * @param isTransitively <code>true</code> to return transitive dependencies, <code>false</code> otherwise.
     * @return a map with supported scopes as key and a list of <code>Artifact</code> as values.
     * @see Artifact#SCOPE_COMPILE
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/Dependencies.java`
#### Snippet
```java
     * @return a map with supported scopes as key and a list of <code>Artifact</code> as values.
     * @see Artifact#SCOPE_COMPILE
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
```

### JavadocReference
Cannot resolve symbol `SCOPE_PROVIDED`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/Dependencies.java`
#### Snippet
```java
     * @return a map with supported scopes as key and a list of <code>Artifact</code> as values.
     * @see Artifact#SCOPE_COMPILE
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/Dependencies.java`
#### Snippet
```java
     * @see Artifact#SCOPE_COMPILE
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
     * @see Artifact#SCOPE_TEST
```

### JavadocReference
Cannot resolve symbol `SCOPE_RUNTIME`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/Dependencies.java`
#### Snippet
```java
     * @see Artifact#SCOPE_COMPILE
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
     * @see Artifact#SCOPE_TEST
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/Dependencies.java`
#### Snippet
```java
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
     * @see Artifact#SCOPE_TEST
     */
```

### JavadocReference
Cannot resolve symbol `SCOPE_SYSTEM`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/Dependencies.java`
#### Snippet
```java
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
     * @see Artifact#SCOPE_TEST
     */
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/Dependencies.java`
#### Snippet
```java
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
     * @see Artifact#SCOPE_TEST
     */
    public Map<String, List<Artifact>> getDependenciesByScope(boolean isTransitively) {
```

### JavadocReference
Cannot resolve symbol `SCOPE_TEST`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/Dependencies.java`
#### Snippet
```java
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
     * @see Artifact#SCOPE_TEST
     */
    public Map<String, List<Artifact>> getDependenciesByScope(boolean isTransitively) {
```

### JavadocReference
Cannot resolve symbol `AbstractMavenReportRenderer`
in `src/main/java/org/apache/maven/report/projectinfo/ProjectInfoReportUtils.java`
#### Snippet
```java
     * @param link could be null
     * @return the artifactId cell with or without a link pattern
     * @see AbstractMavenReportRenderer#linkPatternedText(String)
     */
    public static String getArtifactIdCell(String artifactId, String link) {
```

### JavadocReference
Cannot resolve symbol `linkPatternedText(String)`
in `src/main/java/org/apache/maven/report/projectinfo/ProjectInfoReportUtils.java`
#### Snippet
```java
     * @param link could be null
     * @return the artifactId cell with or without a link pattern
     * @see AbstractMavenReportRenderer#linkPatternedText(String)
     */
    public static String getArtifactIdCell(String artifactId, String link) {
```

### JavadocReference
Cannot resolve symbol `Settings`
in `src/main/java/org/apache/maven/report/projectinfo/ProjectInfoReportUtils.java`
#### Snippet
```java
     * @return the UTF-8 decoded input stream as string
     * @throws IOException if any
     * @see #getContent(URL, Settings, String)
     */
    public static String getContent(URL url, Settings settings) throws IOException {
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @param dependenciesByScope map with supported scopes as key and a list of <code>Artifact</code> as values.
     * @param isTransitive <code>true</code> if it is transitive dependencies rendering.
     * @see Artifact#SCOPE_COMPILE
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
```

### JavadocReference
Cannot resolve symbol `SCOPE_COMPILE`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @param dependenciesByScope map with supported scopes as key and a list of <code>Artifact</code> as values.
     * @param isTransitive <code>true</code> if it is transitive dependencies rendering.
     * @see Artifact#SCOPE_COMPILE
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @param isTransitive <code>true</code> if it is transitive dependencies rendering.
     * @see Artifact#SCOPE_COMPILE
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
```

### JavadocReference
Cannot resolve symbol `SCOPE_PROVIDED`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @param isTransitive <code>true</code> if it is transitive dependencies rendering.
     * @see Artifact#SCOPE_COMPILE
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @see Artifact#SCOPE_COMPILE
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
     * @see Artifact#SCOPE_TEST
```

### JavadocReference
Cannot resolve symbol `SCOPE_RUNTIME`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @see Artifact#SCOPE_COMPILE
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
     * @see Artifact#SCOPE_TEST
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
     * @see Artifact#SCOPE_TEST
     */
```

### JavadocReference
Cannot resolve symbol `SCOPE_SYSTEM`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @see Artifact#SCOPE_PROVIDED
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
     * @see Artifact#SCOPE_TEST
     */
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
     * @see Artifact#SCOPE_TEST
     */
    private void renderDependenciesForAllScopes(Map<String, List<Artifact>> dependenciesByScope, boolean isTransitive) {
```

### JavadocReference
Cannot resolve symbol `SCOPE_TEST`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @see Artifact#SCOPE_RUNTIME
     * @see Artifact#SCOPE_SYSTEM
     * @see Artifact#SCOPE_TEST
     */
    private void renderDependenciesForAllScopes(Map<String, List<Artifact>> dependenciesByScope, boolean isTransitive) {
```

### JavadocReference
Cannot resolve symbol `Sink`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * Default constructor.
     *
     * @param sink {@link Sink}
     * @param locale {@link Locale}
     * @param i18n {@link I18N}
```

### JavadocReference
Cannot resolve symbol `I18N`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @param sink {@link Sink}
     * @param locale {@link Locale}
     * @param i18n {@link I18N}
     * @param log {@link Log}
     * @param dependencies {@link Dependencies}
```

### JavadocReference
Cannot resolve symbol `Log`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @param locale {@link Locale}
     * @param i18n {@link I18N}
     * @param log {@link Log}
     * @param dependencies {@link Dependencies}
     * @param dependencyTreeNode {@link DependencyNode}
```

### JavadocReference
Cannot resolve symbol `DependencyNode`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @param log {@link Log}
     * @param dependencies {@link Dependencies}
     * @param dependencyTreeNode {@link DependencyNode}
     * @param config {@link DependenciesReportConfiguration}
     * @param repoUtils {@link RepositoryUtils}
```

### JavadocReference
Cannot resolve symbol `RepositorySystem`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @param config {@link DependenciesReportConfiguration}
     * @param repoUtils {@link RepositoryUtils}
     * @param repositorySystem {@link RepositorySystem}
     * @param projectBuilder {@link ProjectBuilder}
     * @param buildingRequest {@link ProjectBuildingRequest}
```

### JavadocReference
Cannot resolve symbol `ProjectBuilder`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @param repoUtils {@link RepositoryUtils}
     * @param repositorySystem {@link RepositorySystem}
     * @param projectBuilder {@link ProjectBuilder}
     * @param buildingRequest {@link ProjectBuildingRequest}
     * @param licenseMappings {@link LicenseMapping}
```

### JavadocReference
Cannot resolve symbol `ProjectBuildingRequest`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @param repositorySystem {@link RepositorySystem}
     * @param projectBuilder {@link ProjectBuilder}
     * @param buildingRequest {@link ProjectBuildingRequest}
     * @param licenseMappings {@link LicenseMapping}
     */
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @param withOptional <code>true</code> to include the optional column, <code>false</code> otherwise.
     * @return the dependency table header with/without classifier/optional column
     * @see #renderArtifactRow(Artifact, boolean, boolean)
     */
    private String[] getDependencyTableHeader(boolean withClassifier, boolean withOptional) {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `classLoader` might be null
in `src/main/java/org/apache/maven/report/projectinfo/AbstractProjectInfoReport.java`
#### Snippet
```java
            }

            this.bundle = ResourceBundle.getBundle(this.bundleName, locale, classLoader);
            if (!this.bundle.getLocale().getLanguage().equals(locale.getLanguage())) {
                this.bundle = ResourceBundle.getBundle(this.bundleName, Locale.getDefault(), classLoader);
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/apache/maven/report/projectinfo/LicensesReport.java`
#### Snippet
```java
                    indx = mAnchor.end(3);

                    if (mAnchor.group(2).startsWith("#")) {
                        // relative link - don't want to alter this one!
                    }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param system` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/IssueManagementReport.java`
#### Snippet
```java
         * Checks if a issue management system is Jira, bugzilla...
         *
         * @param system
         * @param actual
         * @return true if the issue management system is Jira, bugzilla, false otherwise.
```

### JavadocDeclaration
`@param actual` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/IssueManagementReport.java`
#### Snippet
```java
         *
         * @param system
         * @param actual
         * @return true if the issue management system is Jira, bugzilla, false otherwise.
         */
```

### JavadocDeclaration
`@param conflictingDependencyMap` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * Produce DependencyAnalyzeResult base on conflicting dependencies map, all dependencies map.
     *
     * @param conflictingDependencyMap
     * @param allDependencies
     * @return DependencyAnalyzeResult contains conflicting dependencies map, snapshot dependencies map and all
```

### JavadocDeclaration
`@param allDependencies` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     *
     * @param conflictingDependencyMap
     * @param allDependencies
     * @return DependencyAnalyzeResult contains conflicting dependencies map, snapshot dependencies map and all
     * dependencies map.
```

### JavadocDeclaration
`@param locale` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * Generate the legend table
     *
     * @param locale
     * @param sink
     */
```

### JavadocDeclaration
`@param sink` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     *
     * @param locale
     * @param sink
     */
    private void generateLegend(Locale locale, Sink sink) {
```

### JavadocDeclaration
`@param allDependencies` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * Get all dependencies (both directive & transitive dependencies) by specified dependency node.
     *
     * @param allDependencies
     * @param reactorProject
     * @param node
```

### JavadocDeclaration
`@param reactorProject` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     *
     * @param allDependencies
     * @param reactorProject
     * @param node
     */
```

### JavadocDeclaration
`@param node` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * @param allDependencies
     * @param reactorProject
     * @param node
     */
    private void getAllDependencyMap(
```

### JavadocDeclaration
`@param dependencyMap` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * Get snapshots dependencies from all dependency map.
     *
     * @param dependencyMap
     * @return snapshots dependencies
     */
```

### JavadocDeclaration
`@param sink` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * Generate version details for a given dependency
     *
     * @param sink
     * @param artifactMap
     * @param version
```

### JavadocDeclaration
`@param artifactMap` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     *
     * @param sink
     * @param artifactMap
     * @param version
     */
```

### JavadocDeclaration
`@param version` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * @param sink
     * @param artifactMap
     * @param version
     */
    private void generateVersionDetails(
```

### JavadocDeclaration
`@param locale` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * Generate the convergence table for all dependencies
     *
     * @param locale
     * @param sink
     * @param result
```

### JavadocDeclaration
`@param sink` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     *
     * @param locale
     * @param sink
     * @param result
     */
```

### JavadocDeclaration
`@param result` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * @param locale
     * @param sink
     * @param result
     */
    private void generateConvergence(Locale locale, Sink sink, DependencyAnalyzeResult result) {
```

### JavadocDeclaration
`@param buildingRequest` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * Get root node of dependency tree for a given project
     *
     * @param buildingRequest
     * @return root node of dependency tree
     * @throws MavenReportException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * @param buildingRequest
     * @return root node of dependency tree
     * @throws MavenReportException
     */
    private DependencyNode getNode(ProjectBuildingRequest buildingRequest) throws MavenReportException {
```

### JavadocDeclaration
`@param sink` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * Generate the detail table for a given dependency
     *
     * @param sink
     * @param depList
     */
```

### JavadocDeclaration
`@param depList` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     *
     * @param sink
     * @param depList
     */
    private void generateDependencyDetails(Locale locale, Sink sink, List<ReverseDependencyLink> depList) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * @return DependencyAnalyzeResult contains conflicting dependencies map, snapshot dependencies map and all
     * dependencies map.
     * @throws MavenReportException
     */
    private DependencyAnalyzeResult analyzeDependencyTree() throws MavenReportException {
```

### JavadocDeclaration
`@param locale` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * Generate the statistic table
     *
     * @param locale
     * @param sink
     * @param result
```

### JavadocDeclaration
`@param sink` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     *
     * @param locale
     * @param sink
     * @param result
     */
```

### JavadocDeclaration
`@param result` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * @param locale
     * @param sink
     * @param result
     */
    private void generateStats(Locale locale, Sink sink, DependencyAnalyzeResult result) {
```

### JavadocDeclaration
`@param reverseDependencies` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * To check whether dependency list contains a given artifact.
     *
     * @param reverseDependencies
     * @param art
     * @return contains:true; Not contains:false;
```

### JavadocDeclaration
`@param art` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     *
     * @param reverseDependencies
     * @param art
     * @return contains:true; Not contains:false;
     */
```

### JavadocDeclaration
`@param artifact` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * Convert Artifact to Dependency
     *
     * @param artifact
     * @return Dependency object
     */
```

### JavadocDeclaration
`@param conflictingDependencyMap` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * Get conflicting dependency map base on specified dependency node.
     *
     * @param conflictingDependencyMap
     * @param reactorProject
     * @param node
```

### JavadocDeclaration
`@param reactorProject` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     *
     * @param conflictingDependencyMap
     * @param reactorProject
     * @param node
     */
```

### JavadocDeclaration
`@param node` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * @param conflictingDependencyMap
     * @param reactorProject
     * @param node
     */
    private void getConflictingDependencyMap(
```

### JavadocDeclaration
Tag `return` is not allowed here
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     *
     * @param rootNode the dependency tree root node to serialize
     * @return the serialized dependency tree
     */
    private void serializeDependencyTree(DependencyNode rootNode, String key, Sink sink) {
```

### JavadocDeclaration
`@param node` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * Get all descendants nodes for a given dependency node.
     *
     * @param node
     * @return set of descendants artifacts.
     */
```

### JavadocDeclaration
`@param requiredHeaders` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java

        /**
         * @param requiredHeaders
         * @return
         */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
        /**
         * @param requiredHeaders
         * @return
         */
        private String[] getRequiredContrHeaderArray(Map<String, Boolean> requiredHeaders) {
```

### JavadocDeclaration
`@param url` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
         * Create a table cell with a link to the given url. The url is not validated.
         *
         * @param url
         */
        private void tableCellForUrl(String url) {
```

### JavadocDeclaration
`@param requiredHeaders` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java

        /**
         * @param requiredHeaders
         * @param requiredArray
         * @param name
```

### JavadocDeclaration
`@param requiredArray` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
        /**
         * @param requiredHeaders
         * @param requiredArray
         * @param name
         * @param email
```

### JavadocDeclaration
`@param name` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
         * @param requiredHeaders
         * @param requiredArray
         * @param name
         * @param email
         * @param url
```

### JavadocDeclaration
`@param email` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
         * @param requiredArray
         * @param name
         * @param email
         * @param url
         * @param organization
```

### JavadocDeclaration
`@param url` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
         * @param name
         * @param email
         * @param url
         * @param organization
         * @param organizationUrl
```

### JavadocDeclaration
`@param organization` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
         * @param email
         * @param url
         * @param organization
         * @param organizationUrl
         * @param roles
```

### JavadocDeclaration
`@param organizationUrl` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
         * @param url
         * @param organization
         * @param organizationUrl
         * @param roles
         * @param timeZone
```

### JavadocDeclaration
`@param roles` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
         * @param organization
         * @param organizationUrl
         * @param roles
         * @param timeZone
         * @param properties
```

### JavadocDeclaration
`@param timeZone` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
         * @param organizationUrl
         * @param roles
         * @param timeZone
         * @param properties
         */
```

### JavadocDeclaration
`@param properties` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
         * @param roles
         * @param timeZone
         * @param properties
         */
        private static void setRequiredArray(
```

### JavadocDeclaration
`@param requiredHeaders` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java

        /**
         * @param requiredHeaders
         * @return
         */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
        /**
         * @param requiredHeaders
         * @return
         */
        private String[] getRequiredDevHeaderArray(Map<String, Boolean> requiredHeaders) {
```

### JavadocDeclaration
`@param nodes` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/DependencyVersionMap.java`
#### Snippet
```java
     * Check whether given dependency nodes contains conflicts
     *
     * @param nodes
     * @return contains:true; not contains:false;
     */
```

### JavadocDeclaration
`@param starteamRepo` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
         * </p>
         *
         * @param starteamRepo
         */
        private void developerAccessStarteam(StarteamScmProviderRepository starteamRepo) {
```

### JavadocDeclaration
`@param perforceRepo` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
         * </p>
         *
         * @param perforceRepo
         * @see <a
         *      href="http://www.perforce.com/perforce/doc.051/manuals/cmdref/index.html">http://www.perforce.com/
```

### JavadocDeclaration
`@param hgRepo` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
         * </p>
         *
         * @param hgRepo
         */
        private void developerAccessMercurial(HgScmProviderRepository hgRepo) {
```

### JavadocDeclaration
`@param cvsRepo` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
         * </p>
         *
         * @param cvsRepo
         * @see <a
         *      href="https://www.cvshome.org/docs/manual/cvs-1.12.12/cvs_16.html#SEC115">https://www.cvshome.org/docs/manual/cvs-1.12.12/cvs_16.html#SEC115</a>
```

### JavadocDeclaration
`@param gitRepo` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
         * </p>
         *
         * @param gitRepo
         */
        private void developerAccessGit(GitScmProviderRepository gitRepo) {
```

### JavadocDeclaration
`@param svnRepo` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
         * </p>
         *
         * @param svnRepo
         * @see <a href="http://svnbook.red-bean.com/">http://svnbook.red-bean.com/</a>
         */
```

### JavadocDeclaration
`@param cvsRepo` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
         * </p>
         *
         * @param cvsRepo
         * @see <a
         *      href="https://www.cvshome.org/docs/manual/cvs-1.12.12/cvs_16.html#SEC115">https://www.cvshome.org/docs/manual/cvs-1.12.12/cvs_16.html#SEC115</a>
```

### JavadocDeclaration
`@param hgRepo` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
         * </p>
         *
         * @param hgRepo
         */
        private void anonymousAccessMercurial(HgScmProviderRepository hgRepo) {
```

### JavadocDeclaration
`@param svnRepo` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
         * </p>
         *
         * @param svnRepo
         * @see <a href="http://svnbook.red-bean.com/">http://svnbook.red-bean.com/</a>
         */
```

### JavadocDeclaration
`@param gitRepo` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
         * </p>
         *
         * @param gitRepo
         */
        private void anonymousAccessGit(GitScmProviderRepository gitRepo) {
```

### JavadocDeclaration
`@param i18n` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
         * Default constructor
         *
         * @param i18n
         * @param locale
         */
```

### JavadocDeclaration
`@param locale` tag description is missing
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
         *
         * @param i18n
         * @param locale
         */
        FileDecimalFormat(I18N i18n, Locale locale) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `model` may be 'final'
in `src/main/java/org/apache/maven/report/projectinfo/CiManagementReport.java`
#### Snippet
```java
                "travis"));

        private Model model;

        CiManagementRenderer(Sink sink, Model model, I18N i18n, Locale locale) {
```

### FieldMayBeFinal
Field `pluginManagementExcludes` may be 'final'
in `src/main/java/org/apache/maven/report/projectinfo/PluginManagementReport.java`
#### Snippet
```java
     */
    @Parameter
    private List<String> pluginManagementExcludes = null;

    // ----------------------------------------------------------------------
```

### FieldMayBeFinal
Field `model` may be 'final'
in `src/main/java/org/apache/maven/report/projectinfo/IssueManagementReport.java`
#### Snippet
```java
     */
    private static class IssueManagementRenderer extends AbstractProjectInfoRenderer {
        private Model model;

        IssueManagementRenderer(Sink sink, Model model, I18N i18n, Locale locale) {
```

### FieldMayBeFinal
Field `filter` may be 'final'
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
    private DependencyCollectorBuilder dependencyCollectorBuilder;

    private ArtifactFilter filter = null;

    private Map<MavenProject, DependencyNode> projectMap = new HashMap<>();
```

### FieldMayBeFinal
Field `projectMap` may be 'final'
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
    private ArtifactFilter filter = null;

    private Map<MavenProject, DependencyNode> projectMap = new HashMap<>();

    // ----------------------------------------------------------------------
```

### FieldMayBeFinal
Field `dependency` may be 'final'
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     */
    private static class ReverseDependencyLink {
        private Dependency dependency;

        protected MavenProject project;
```

### FieldMayBeFinal
Field `dependencyDetailsEnabled` may be 'final'
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/DependenciesReportConfiguration.java`
#### Snippet
```java
 */
public class DependenciesReportConfiguration {
    private boolean dependencyDetailsEnabled;

    /**
```

### FieldMayBeFinal
Field `idsToNode` may be 'final'
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/DependencyVersionMap.java`
#### Snippet
```java
    private boolean uniqueVersions;

    private Map<String, List<DependencyNode>> idsToNode;

    // ----------------------------------------------------------------------
```

### FieldMayBeFinal
Field `scmTag` may be 'final'
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
        private String webAccessUrl;

        private String scmTag;

        ScmRenderer(
```

### FieldMayBeFinal
Field `scmManager` may be 'final'
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
        private Model model;

        private ScmManager scmManager;

        /**
```

### FieldMayBeFinal
Field `model` may be 'final'
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
        private Log log;

        private Model model;

        private ScmManager scmManager;
```

### FieldMayBeFinal
Field `checkoutDirectoryName` may be 'final'
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
        private String devConnection;

        private String checkoutDirectoryName;

        private String webAccessUrl;
```

### FieldMayBeFinal
Field `devConnection` may be 'final'
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
        private String anonymousConnection;

        private String devConnection;

        private String checkoutDirectoryName;
```

### FieldMayBeFinal
Field `log` may be 'final'
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
        private static final String LS = System.lineSeparator();

        private Log log;

        private Model model;
```

### FieldMayBeFinal
Field `webAccessUrl` may be 'final'
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
        private String checkoutDirectoryName;

        private String webAccessUrl;

        private String scmTag;
```

### FieldMayBeFinal
Field `anonymousConnection` may be 'final'
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
         * To support more SCM
         */
        private String anonymousConnection;

        private String devConnection;
```

### FieldMayBeFinal
Field `licenseMap` may be 'final'
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * Will be filled with license name / set of projects.
     */
    private Map<String, Object> licenseMap = new HashMap<String, Object>() {
        private static final long serialVersionUID = 1L;

```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `licenseMappings` are queried, but never updated
in `src/main/java/org/apache/maven/report/projectinfo/AbstractProjectInfoReport.java`
#### Snippet
```java
     */
    @Parameter
    private List<LicenseMapping> licenseMappings;

    // ----------------------------------------------------------------------
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `src/it/MPIR-251/verify.groovy`
#### Snippet
```java
 */
File log = new File( basedir, 'build.log' )
assert !( log.text =~ /\[WARNING\] Artifact .+ has no file and won't be listed in dependency files details\./ )

```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `src/it/MPIR-362/verify.groovy`
#### Snippet
```java
 */
File log = new File( basedir, 'build.log' )
assert !( log.text =~ /\[WARNING\] Unable to create Maven project for com\.sun:javaws:pom:.* from repository\./ )

```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
        sink.nonBreakingSpace();
        sink.bold();
        sink.text(String.valueOf(convergence) + " %");
        sink.bold_();
        sink.tableCell_();
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/report/projectinfo/PluginManagementReport.java`
#### Snippet
```java
                    try {
                        MavenProject pluginProject = projectBuilder
                                .build(pluginArtifact, buildRequest)
                                .getProject();

                        tableRow(getPluginRow(
                                pluginProject.getGroupId(), pluginProject.getArtifactId(),
                                pluginProject.getVersion(), pluginProject.getUrl()));
                    } catch (ProjectBuildingException e) {
                        log.info("Could not build project for " + plugin.getArtifactId(), e);
                        tableRow(getPluginRow(plugin.getGroupId(), plugin.getArtifactId(), plugin.getVersion(), null));
                    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
            if (requiredHeaders.get(NAME) == Boolean.TRUE) {
                requiredArray.add(name);
            }
            if (requiredHeaders.get(EMAIL) == Boolean.TRUE) {
                requiredArray.add(email);
            }
            if (requiredHeaders.get(URL) == Boolean.TRUE) {
                requiredArray.add(url);
            }
            if (requiredHeaders.get(ORGANIZATION) == Boolean.TRUE) {
                requiredArray.add(organization);
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/Dependencies.java`
#### Snippet
```java
                List<Artifact> multiValue = transitiveDependenciesByScope.get(artifact.getScope());
                if (multiValue == null) {
                    multiValue = new ArrayList<>();
                }

                if (!multiValue.contains(artifact)) {
                    multiValue.add(artifact);
                }
                transitiveDependenciesByScope.put(artifact.getScope(), multiValue);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
                startTable();

                sink.tableRow();
                sink.tableHeaderCell();
                sink.text(artifactName);
                sink.tableHeaderCell_();
                sink.tableRow_();

                sink.tableRow();
                sink.tableCell();

                sink.paragraph();
                sink.bold();
                sink.text(getI18nString("column.description") + ": ");
                sink.bold_();
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/org/apache/maven/report/projectinfo/DependenciesReport.java`
#### Snippet
```java
                    }

                    out = new FileOutputStream(outputFile);
                    IOUtil.copy(in, out);
                    out.close();
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/maven/report/projectinfo/DependencyInformationReport.java`
#### Snippet
```java
     */
    @Override
    protected void executeReport(Locale locale) throws MavenReportException {
        new DependencyInformationRenderer(getSink(), getI18N(locale), locale, groupId, artifactId, version, packaging)
                .render();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/maven/report/projectinfo/DependencyInformationReport.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "${project.version}", required = true)
    protected String version;

    /**
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/maven/report/projectinfo/DependencyInformationReport.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "${project.artifactId}", required = true)
    protected String artifactId;

    /**
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/maven/report/projectinfo/DependencyInformationReport.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "${project.packaging}", required = true)
    protected String packaging;

    // ----------------------------------------------------------------------
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/maven/report/projectinfo/DependencyInformationReport.java`
#### Snippet
```java
         */
        @Override
        protected void renderBody() {
            startSection(getTitle());

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/maven/report/projectinfo/DependencyInformationReport.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "${project.groupId}", required = true)
    protected String groupId;

    /**
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
                            .substring(1));
                }
                return protocol + "://www.gravatar.com/avatar/" + sb.toString() + "?d=mm&" + AVATAR_SIZE;
            } catch (NoSuchAlgorithmException e) {
                return null;
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `TreeTokens` may be 'static'
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/SinkSerializingDependencyNodeVisitor.java`
#### Snippet
```java
     * Provides tokens to use when serializing the dependency tree.
     */
    private class TreeTokens {
        private final Sink sink;

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `minimumJavaVersion` initializer `compilerVersionConfigured` is redundant
in `src/main/java/org/apache/maven/report/projectinfo/SummaryReport.java`
#### Snippet
```java
            }

            String minimumJavaVersion = compilerVersionConfigured;
            if (targetConfigured != null) {
                minimumJavaVersion = targetConfigured;
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/maven/report/projectinfo/ProjectInfoReportUtils.java`
#### Snippet
```java
    /**
     * Convenience method to return the name of a web-based mailing list archive server.
     * For instance, if the archive URI is <code>http://www.mail-archive.com/dev@maven.apache.org</code>, this
     * method returns <code>www.mail-archive.com</code>
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
         * SCM. For example, generate the following command line:
         * <p>
         * svn checkout https://svn.apache.org/repos/asf/maven/components/trunk maven
         * </p>
         * <p>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
         * SCM. For example, generate the following command line:
         * <p>
         * svn checkout http://svn.apache.org/repos/asf/maven/components/trunk maven
         * </p>
         *
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `cell.length() > 0` is always `true` when reached
in `src/main/java/org/apache/maven/report/projectinfo/SummaryReport.java`
#### Snippet
```java
                if (cell == null || cell.isEmpty()) {
                    sink.text("-");
                } else if (ctr == content.length - 1 && cell.length() > 0) {
                    sink.link(cell);
                    sink.text(cell);
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/report/projectinfo/DependenciesReport.java`
#### Snippet
```java

                    if (!outputFile.getParentFile().exists()) {
                        outputFile.getParentFile().mkdirs();
                    }

```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/maven/report/projectinfo/SummaryReport.java`
#### Snippet
```java
            Xpp3Dom pluginConfig =
                    project.getGoalConfiguration("org.apache.maven.plugins", "maven-compiler-plugin", null, null);
            if (pluginConfig != null) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
            }

            if (scmRepository != null && scmProvider.equalsIgnoreCase(scmRepository.getProvider())) {
                return true;
            }
```

