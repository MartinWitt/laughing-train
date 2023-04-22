# maven-project-info-reports-plugin 
 
# Bad smells
I found 112 bad smells with 14 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 25 | false |
| ReturnNull | 20 | false |
| AssignmentToMethodParameter | 13 | false |
| RedundantFieldInitialization | 10 | false |
| IOResource | 6 | false |
| ToArrayCallWithZeroLengthArrayArgument | 5 | true |
| UnnecessarySuperQualifier | 5 | false |
| ProtectedMemberInFinalClass | 4 | true |
| RegExpRedundantEscape | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| Convert2Lambda | 2 | false |
| CallToStringConcatCanBeReplacedByOperator | 2 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| DataFlowIssue | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| UnnecessaryToStringCall | 1 | true |
| InnerClassMayBeStatic | 1 | true |
| StringEqualsEmptyString | 1 | false |
| RedundantSuppression | 1 | false |
| IgnoreResultOfCall | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| MismatchedCollectionQueryUpdate | 1 | false |
| Java8MapApi | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
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

## RuleId[id=IOResource]
### IOResource
'Formatter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/maven/report/projectinfo/DependencyInformationReport.java`
#### Snippet
```java
            startSection(getTitle());

            Formatter mavenDependency = new Formatter()
                    .format("<dependency>%n")
                    .format("  <groupId>%s</groupId>%n", groupId)
```

### IOResource
'Formatter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/maven/report/projectinfo/DependencyInformationReport.java`
#### Snippet
```java
            renderDependencyInfo(
                    "Apache Ivy",
                    new Formatter()
                            .format("<dependency org=\"%s\" name=\"%s\" rev=\"%s\">%n", groupId, artifactId, version)
                            .format("  <artifact name=\"%s\" type=\"%s\" />%n", artifactId, packaging)
```

### IOResource
'Formatter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/maven/report/projectinfo/DependencyInformationReport.java`
#### Snippet
```java
            renderDependencyInfo(
                    "Groovy Grape",
                    new Formatter()
                            .format("@Grapes(%n")
                            .format("@Grab(group='%s', module='%s', version='%s')%n", groupId, artifactId, version)
```

### IOResource
'Formatter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/maven/report/projectinfo/DependencyInformationReport.java`
#### Snippet
```java

            renderDependencyInfo(
                    "Gradle/Grails", new Formatter().format("compile '%s:%s:%s'", groupId, artifactId, version));

            renderDependencyInfo(
```

### IOResource
'Formatter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/maven/report/projectinfo/DependencyInformationReport.java`
#### Snippet
```java
            renderDependencyInfo(
                    "Scala SBT",
                    new Formatter()
                            .format("libraryDependencies += \"%s\" %% \"%s\" %% \"%s\"", groupId, artifactId, version));

```

### IOResource
'PrintWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
    private void renderSectionDependencyTree() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        pw.println("");
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ProjectInfoReportUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/report/projectinfo/ProjectInfoReportUtils.java`
#### Snippet
```java
 * @since 2.1
 */
public class ProjectInfoReportUtils {
    private static final UrlValidator URL_VALIDATOR = new UrlValidator(
            new String[] {"http", "https"}, new RegexValidator("^([" + "\\p{Alnum}\\-\\." + "]*)(:\\d*)?(.*)?"), 0);
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

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `src/it/MPIR-362/verify.groovy`
#### Snippet
```java
 */
File log = new File( basedir, 'build.log' )
assert !( log.text =~ /\[WARNING\] Unable to create Maven project for com\.sun:javaws:pom:.* from repository\./ )

```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `src/it/MPIR-251/verify.groovy`
#### Snippet
```java
 */
File log = new File( basedir, 'build.log' )
assert !( log.text =~ /\[WARNING\] Artifact .+ has no file and won't be listed in dependency files details\./ )

```

## RuleId[id=ProtectedMemberInFinalClass]
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
    @Parameter(defaultValue = "${project.groupId}", required = true)
    protected String groupId;

    /**
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`cell.length() > 0` can be replaced with '!cell.isEmpty()'
in `src/main/java/org/apache/maven/report/projectinfo/SummaryReport.java`
#### Snippet
```java
                if (StringUtils.isEmpty(cell)) {
                    sink.text("-");
                } else if (ctr == content.length - 1 && cell.length() > 0) {
                    sink.link(cell);
                    sink.text(cell);
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends DependencyNode`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/DependencyVersionMap.java`
#### Snippet
```java
     * @return contains:true; not contains:false;
     */
    private boolean containsConflicts(List<DependencyNode> nodes) {
        String version = null;
        for (DependencyNode node : nodes) {
```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/ManagementDependencies.java`
#### Snippet
```java
     * @param projectDependencies the list of dependencies.
     */
    public ManagementDependencies(List<Dependency> projectDependencies) {
        this.dependencies = projectDependencies;
    }
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/RepositoryUtils.java`
#### Snippet
```java
            RepositorySystem repositorySystem,
            ArtifactResolver resolver,
            List<ArtifactRepository> remoteRepositories,
            List<ArtifactRepository> pluginRepositories,
            ProjectBuildingRequest buildingRequest,
```

### BoundedWildcard
Can generalize to `? extends ArtifactRepository`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/RepositoryUtils.java`
#### Snippet
```java
            ArtifactResolver resolver,
            List<ArtifactRepository> remoteRepositories,
            List<ArtifactRepository> pluginRepositories,
            ProjectBuildingRequest buildingRequest,
            RepositoryMetadataManager repositoryMetadataManager) {
```

### BoundedWildcard
Can generalize to `? extends ReportPlugin`
in `src/main/java/org/apache/maven/report/projectinfo/PluginsReport.java`
#### Snippet
```java
            }

            public static List<GAV> reportPluginsToGAV(List<ReportPlugin> reportPlugins, MavenProject project) {
                List<GAV> result = new ArrayList<>(reportPlugins.size());
                for (ReportPlugin reportPlugin : reportPlugins) {
```

### BoundedWildcard
Can generalize to `? extends Plugin`
in `src/main/java/org/apache/maven/report/projectinfo/PluginsReport.java`
#### Snippet
```java
            }

            public static List<GAV> pluginsToGAV(List<Plugin> plugins) {
                List<GAV> result = new ArrayList<>(plugins.size());
                for (Plugin plugin : plugins) {
```

### BoundedWildcard
Can generalize to `? extends Plugin`
in `src/main/java/org/apache/maven/report/projectinfo/PluginsReport.java`
#### Snippet
```java
         * @return the first similar plugin
         */
        private static Plugin find(ReportPlugin reportPlugin, List<Plugin> plugins) {
            if (plugins == null) {
                return null;
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `src/main/java/org/apache/maven/report/projectinfo/ModulesReport.java`
#### Snippet
```java

        private MavenProject getModuleFromReactor(
                MavenProject project, List<MavenProject> reactorProjects, String module) {
            // Mainly case of unit test
            if (reactorProjects == null) {
```

### BoundedWildcard
Can generalize to `? extends Plugin`
in `src/main/java/org/apache/maven/report/projectinfo/PluginManagementReport.java`
#### Snippet
```java
                Locale locale,
                I18N i18n,
                List<Plugin> plugins,
                MavenProject project,
                ProjectBuilder projectBuilder,
```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependencyManagementRenderer.java`
#### Snippet
```java
    }

    private void renderDependenciesForScope(String scope, List<Dependency> artifacts) {
        if (artifacts != null) {
            // can't use straight artifact comparison because we want optional last
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependencyManagementRenderer.java`
#### Snippet
```java
    }

    private void renderDependenciesForAllScopes(Map<String, List<Dependency>> dependenciesByScope) {
        renderDependenciesForScope(Artifact.SCOPE_COMPILE, dependenciesByScope.get(Artifact.SCOPE_COMPILE));
        renderDependenciesForScope(Artifact.SCOPE_RUNTIME, dependenciesByScope.get(Artifact.SCOPE_RUNTIME));
```

### BoundedWildcard
Can generalize to `? extends ReverseDependencyLink`
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * @return A Map of sorted unique artifacts
     */
    private Map<String, List<ReverseDependencyLink>> getSortedUniqueArtifactMap(List<ReverseDependencyLink> depList) {
        Map<String, List<ReverseDependencyLink>> uniqueArtifactMap = new TreeMap<>();

```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
        Map<String, List<ReverseDependencyLink>> conflicting;

        public void setAll(Map<String, List<ReverseDependencyLink>> all) {
            this.all = all;
        }
```

### BoundedWildcard
Can generalize to `? extends ReverseDependencyLink`
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
    }

    private List<DependencyNode> getProjectNodes(List<ReverseDependencyLink> depList) {
        List<DependencyNode> projectNodes = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends ReverseDependencyLink`
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     * @return contains:true; Not contains:false;
     */
    private boolean containsDependency(List<ReverseDependencyLink> reverseDependencies, Artifact art) {

        for (ReverseDependencyLink revDependency : reverseDependencies) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     */
    private void getAllDependencyMap(
            Map<String, List<ReverseDependencyLink>> allDependencies,
            MavenProject reactorProject,
            DependencyNode node) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     */
    private void getConflictingDependencyMap(
            Map<String, List<ReverseDependencyLink>> conflictingDependencyMap,
            MavenProject reactorProject,
            DependencyNode node) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
     */
    private void generateVersionDetails(
            Sink sink, Map<String, List<ReverseDependencyLink>> artifactMap, String version) {
        sink.numberedList(0); // Use lower alpha numbering
        List<ReverseDependencyLink> depList = artifactMap.get(version);
```

### BoundedWildcard
Can generalize to `? extends ReverseDependencyLink`
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
    }

    private void showVersionDetails(DependencyNode projectNode, List<ReverseDependencyLink> depList, Sink sink) {
        if (depList == null || depList.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
        private static void setRequiredArray(
                Map<String, Boolean> requiredHeaders,
                List<String> requiredArray,
                String name,
                String email,
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @return <code>true</code> if one artifact in the list has a classifier, <code>false</code> otherwise.
     */
    private boolean hasClassifier(List<Artifact> artifacts) {
        for (Artifact artifact : artifacts) {
            if (StringUtils.isNotEmpty(artifact.getClassifier())) {
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     ** @param artifacts not null
     */
    private void resolveAtrifacts(List<Artifact> artifacts) {
        for (Artifact artifact : artifacts) {
            // TODO site:run Why do we need to resolve this...
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @return <code>true</code> if one artifact in the list is optional, <code>false</code> otherwise.
     */
    private boolean hasOptional(List<Artifact> artifacts) {
        for (Artifact artifact : artifacts) {
            if (artifact.isOptional()) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @see Artifact#SCOPE_TEST
     */
    private void renderDependenciesForAllScopes(Map<String, List<Artifact>> dependenciesByScope, boolean isTransitive) {
        renderDependenciesForScope(
                Artifact.SCOPE_COMPILE, dependenciesByScope.get(Artifact.SCOPE_COMPILE), isTransitive);
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
     * @return <code>true</code> if one artifact in the list is sealed, <code>false</code> otherwise.
     */
    private boolean hasSealed(List<Artifact> artifacts) {
        for (Artifact artifact : artifacts) {
            if (artifact.getFile() != null
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/maven/report/projectinfo/IssueManagementReport.java`
#### Snippet
```java
                linkPatternedText(getI18nString("scarab.intro"));
                sink.paragraph_();
            } else if (system == null || "".equals(system.trim())) {
                paragraph(getI18nString("general.intro"));
            } else {
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependencyManagementRenderer.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private String[] getDependencyRow(Dependency dependency, boolean hasClassifier) {
        Artifact artifact = repositorySystem.createArtifact(
                dependency.getGroupId(),
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

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.US_ASCII can be used instead
in `src/main/java/org/apache/maven/report/projectinfo/DependenciesReport.java`
#### Snippet
```java

            if (resourceList != null) {
                reader = new LineNumberReader(new InputStreamReader(resourceList, ReaderFactory.US_ASCII));

                for (String line = reader.readLine(); line != null; line = reader.readLine()) {
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
        section = section + 1;

        super.sink.anchor(HtmlTools.encodeId(anchor));
        super.sink.anchor_();

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java

        super.sink.anchor(HtmlTools.encodeId(anchor));
        super.sink.anchor_();

        switch (section) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
        public StringBuffer format(long fs, StringBuffer result, FieldPosition fieldPosition) {
            if (fs > 1000 * 1000 * 1000) {
                result = super.format((float) fs / (1000 * 1000 * 1000), result, fieldPosition);
                result.append(" ").append(getString("report.dependencies.file.details.column.size.gb"));
                return result;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java

            if (fs > 1000 * 1000) {
                result = super.format((float) fs / (1000 * 1000), result, fieldPosition);
                result.append(" ").append(getString("report.dependencies.file.details.column.size.mb"));
                return result;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
            }

            result = super.format((float) fs / (1000), result, fieldPosition);
            result.append(" ").append(getString("report.dependencies.file.details.column.size.kb"));
            return result;
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/report/projectinfo/IssueManagementReport.java`
#### Snippet
```java
                paragraph(getI18nString("general.intro"));
            } else {
                paragraph(getI18nString("custom.intro").replaceFirst("%issueManagementSystem%", system));
            }

```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`section = section + 1` could be simplified to 'section += 1'
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
    // TODO Remove me when MSHARED-390 has been resolved
    protected void startSection(String anchor, String name) {
        section = section + 1;

        super.sink.anchor(HtmlTools.encodeId(anchor));
```

### ReplaceAssignmentWithOperatorAssignment
`section = section - 1` could be simplified to 'section -= 1'
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
        }

        section = section - 1;

        if (section < 0) {
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractProjectInfoRenderer()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/maven/report/projectinfo/AbstractProjectInfoRenderer.java`
#### Snippet
```java
     * @param locale {@link Locale}
     */
    public AbstractProjectInfoRenderer(Sink sink, I18N i18n, Locale locale) {
        super(sink);

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

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/DependencyVersionMap.java`
#### Snippet
```java
        String key = constructKey(node);
        List<DependencyNode> nodes = idsToNode.get(key);
        if (nodes == null) {
            nodes = new ArrayList<>();
            idsToNode.put(key, nodes);
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependencyManagementRenderer.java`
#### Snippet
```java

    private Comparator<Dependency> getDependencyComparator() {
        return new Comparator<Dependency>() {
            public int compare(Dependency a1, Dependency a2) {
                int result = a1.getGroupId().compareTo(a2.getGroupId());
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java

    private Comparator<Artifact> getArtifactComparator() {
        return new Comparator<Artifact>() {
            public int compare(Artifact a1, Artifact a2) {
                // put optional last
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/maven/report/projectinfo/IndexReport.java`
#### Snippet
```java
        private final String description;

        private boolean modules = false;

        ProjectIndexRenderer(
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/maven/report/projectinfo/PluginManagementReport.java`
#### Snippet
```java
     */
    @Parameter
    private List<String> pluginManagementExcludes = null;

    // ----------------------------------------------------------------------
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
    private DependencyCollectorBuilder dependencyCollectorBuilder;

    private ArtifactFilter filter = null;

    private Map<MavenProject, DependencyNode> projectMap = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
        final DecimalFormat decimalFormat;

        long total = 0;

        long totalCompileScope = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
        long totalRuntimeScope = 0;

        long totalProvidedScope = 0;

        long totalSystemScope = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
        long total = 0;

        long totalCompileScope = 0;

        long totalTestScope = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
        long totalTestScope = 0;

        long totalRuntimeScope = 0;

        long totalProvidedScope = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
        long totalCompileScope = 0;

        long totalTestScope = 0;

        long totalRuntimeScope = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
        long totalProvidedScope = 0;

        long totalSystemScope = 0;

        TotalCell(DecimalFormat decimalFormat) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java

    /** Counter for unique IDs that is consistent across generations. */
    private int idCounter = 0;

    /**
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `url`
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
            int index = url.indexOf(".git/");
            if (index > 0) {
                url = url.substring(0, index + 4);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `encoding`
in `src/main/java/org/apache/maven/report/projectinfo/ProjectInfoReportUtils.java`
#### Snippet
```java

        if (StringUtils.isEmpty(encoding)) {
            encoding = DEFAULT_ENCODING;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/SinkSerializingDependencyNodeVisitor.java`
#### Snippet
```java

        while (distance-- > 0) {
            node = node.getParent();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `artifactId`
in `src/main/java/org/apache/maven/report/projectinfo/PluginsReport.java`
#### Snippet
```java

        private String[] getPluginRow(String groupId, String artifactId, String version, String link) {
            artifactId = ProjectInfoReportUtils.getArtifactIdCell(artifactId, link);
            return new String[] {groupId, artifactId, version};
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `artifactId`
in `src/main/java/org/apache/maven/report/projectinfo/PluginManagementReport.java`
#### Snippet
```java

        private String[] getPluginRow(String groupId, String artifactId, String version, String link) {
            artifactId = ProjectInfoReportUtils.getArtifactIdCell(artifactId, link);
            return new String[] {groupId, artifactId, version};
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `locale`
in `src/main/java/org/apache/maven/report/projectinfo/AbstractProjectInfoReport.java`
#### Snippet
```java
        public String format(String bundleName, Locale locale, String key, Object[] args) {
            if (locale == null) {
                locale = getLocale(null);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `src/main/java/org/apache/maven/report/projectinfo/AbstractProjectInfoReport.java`
#### Snippet
```java
            String value = getString(bundleName, locale, key);
            if (args == null) {
                args = NO_ARGS;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `locale`
in `src/main/java/org/apache/maven/report/projectinfo/AbstractProjectInfoReport.java`
#### Snippet
```java

            if (locale == null) {
                locale = getLocale(null);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `email`
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
                return null;
            }
            email = StringUtils.trim(email);
            email = email.toLowerCase();
            MessageDigest md;
```

### AssignmentToMethodParameter
Assignment to method parameter `email`
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
            }
            email = StringUtils.trim(email);
            email = email.toLowerCase();
            MessageDigest md;
            try {
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
        public StringBuffer format(long fs, StringBuffer result, FieldPosition fieldPosition) {
            if (fs > 1000 * 1000 * 1000) {
                result = super.format((float) fs / (1000 * 1000 * 1000), result, fieldPosition);
                result.append(" ").append(getString("report.dependencies.file.details.column.size.gb"));
                return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java

            if (fs > 1000 * 1000) {
                result = super.format((float) fs / (1000 * 1000), result, fieldPosition);
                result.append(" ").append(getString("report.dependencies.file.details.column.size.mb"));
                return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
            }

            result = super.format((float) fs / (1000), result, fieldPosition);
            result.append(" ").append(getString("report.dependencies.file.details.column.size.kb"));
            return result;
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/maven/report/projectinfo/ModulesReport.java`
#### Snippet
```java

            if (selectedHref.endsWith("/")) {
                selectedHref = selectedHref.concat("index.html");
            } else {
                selectedHref = selectedHref.concat("/index.html");
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/maven/report/projectinfo/ModulesReport.java`
#### Snippet
```java
                selectedHref = selectedHref.concat("index.html");
            } else {
                selectedHref = selectedHref.concat("/index.html");
            }

```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/RepositoryUtils.java`
#### Snippet
```java
    public String getDependencyUrlFromRepository(Artifact artifact, ArtifactRepository repo) {
        if (repo.isBlacklisted()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/report/projectinfo/DependenciesReport.java`
#### Snippet
```java
        } catch (DependencyGraphBuilderException e) {
            getLog().error("Unable to build dependency tree.", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/report/projectinfo/ScmReport.java`
#### Snippet
```java
        public ScmRepository getScmRepository(String scmUrl) {
            if (StringUtils.isEmpty(scmUrl)) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/report/projectinfo/ProjectInfoReportUtils.java`
#### Snippet
```java
            ProjectBuildingRequest buildingRequest) {
        if (Artifact.SCOPE_SYSTEM.equals(artifact.getScope())) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/report/projectinfo/ProjectInfoReportUtils.java`
#### Snippet
```java
            }

            return null;
        } catch (ProjectBuildingException e) {
            return null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/report/projectinfo/ProjectInfoReportUtils.java`
#### Snippet
```java
            return null;
        } catch (ProjectBuildingException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/report/projectinfo/ProjectInfoReportUtils.java`
#### Snippet
```java
                    /** {@inheritDoc} */
                    public X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }
                }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/report/projectinfo/PluginsReport.java`
#### Snippet
```java
        private static Plugin find(ReportPlugin reportPlugin, List<Plugin> plugins) {
            if (plugins == null) {
                return null;
            }
            for (Plugin plugin : plugins) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/report/projectinfo/PluginsReport.java`
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
in `src/main/java/org/apache/maven/report/projectinfo/ModulesReport.java`
#### Snippet
```java
            // Mainly case of unit test
            if (reactorProjects == null) {
                return null;
            }
            try {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/report/projectinfo/ModulesReport.java`
#### Snippet
```java
            }
            // module not found in reactor
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/report/projectinfo/ModulesReport.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/report/projectinfo/ModulesReport.java`
#### Snippet
```java
        private static String urlEncode(final String url) {
            if (url == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/report/projectinfo/AbstractProjectInfoReport.java`
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
in `src/main/java/org/apache/maven/report/projectinfo/AbstractProjectInfoReport.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/report/projectinfo/AbstractProjectInfoReport.java`
#### Snippet
```java
    protected Plugin getPlugin(String pluginId) {
        if ((getProject().getBuild() == null) || (getProject().getBuild().getPluginsAsMap() == null)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/report/projectinfo/DependencyConvergenceReport.java`
#### Snippet
```java
        }

        return filters.isEmpty() ? null : new AndDependencyNodeFilter(filters);
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
        private String getGravatarUrl(String email) {
            if (email == null) {
                return null;
            }
            email = StringUtils.trim(email);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
                return protocol + "://www.gravatar.com/avatar/" + sb.toString() + "?d=mm&" + AVATAR_SIZE;
            } catch (NoSuchAlgorithmException e) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/report/projectinfo/dependencies/renderer/DependenciesRenderer.java`
#### Snippet
```java
                    return Artifact.SCOPE_SYSTEM;
                default:
                    return null;
            }
        }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/report/projectinfo/TeamReport.java`
#### Snippet
```java
                    properties);

            return requiredArray.toArray(new String[0]);
        }

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

