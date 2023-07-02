# phabricator-jenkins-plugin 
 
# Bad smells
I found 83 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| Deprecation | 24 | false |
| JavadocDeclaration | 11 | false |
| NullableProblems | 10 | false |
| FieldCanBeLocal | 5 | false |
| DataFlowIssue | 4 | false |
| JavadocLinkAsPlainText | 4 | false |
| StringConcatenationInsideStringBufferAppend | 4 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| ConstantValue | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| UNCHECKED_WARNING | 1 | false |
| PointlessArithmeticExpression | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| MismatchedJavadocCode | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| IgnoreResultOfCall | 1 | false |
| TrivialIf | 1 | false |
| AccessStaticViaInstance | 1 | false |
| AutoCloseableResource | 1 | false |
| FieldMayBeFinal | 1 | false |
| RedundantStringFormatCall | 1 | false |
| PointlessNullCheck | 1 | false |
| StringConcatenationInLoops | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[arcPatchParams.size()\]'
in `src/main/java/com/uber/jenkins/phabricator/tasks/ApplyPatchTask.java`
#### Snippet
```java
                conduitUrl,
                conduitToken,
                arcPatchParams.toArray(new String[arcPatchParams.size()]));

        exitCode = arc.callConduit(starter.launch(), logStream);
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/com/uber/jenkins/phabricator/conduit/ConduitAPIClient.java`
#### Snippet
```java

        InputStream responseBody = response.getEntity().getContent();
        Integer responseCode = response.getStatusLine().getStatusCode();
        if (responseCode != HttpStatus.SC_OK) {
            throw new ConduitAPIException(IOUtils.toString(responseBody, Charset.defaultCharset()), responseCode);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/com/uber/jenkins/phabricator/CommentBuilder.java`
#### Snippet
```java
        }

        Float lineCoveragePercent = currentCoverage.getLineCoveragePercent();

        logger.info(UBERALLS_TAG, "line coverage: " + lineCoveragePercent);
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'hudson.util.RunList' to 'hudson.util.RunList'. Reason: 'build.getProject()' has raw type, so result of getBuilds is erased
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorBuildWrapper.java`
#### Snippet
```java

            // Get the running builds that were scheduled before the current one
            RunList<AbstractBuild> runningBuilds = (RunList<AbstractBuild>) build.getProject().getBuilds();
            for (AbstractBuild runningBuild : runningBuilds) {
                Executor executor = runningBuild.getExecutor();
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`covered * 1.0f / total * 1.0f` can be replaced with 'covered \* 1.0f / total'
in `src/main/java/com/uber/jenkins/phabricator/coverage/XmlCoverageProvider.java`
#### Snippet
```java
                return 100.0f;
            } else {
                return (covered * 1.0f / total * 1.0f) * 100.0f;
            }
        }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/com/uber/jenkins/phabricator/tasks/ApplyPatchTask.java`
#### Snippet
```java
                cleanWorkingDir = Arrays.asList(hgPath, "--config", "extensions.purge=", "purge", "--files", "--dirs");
                // Submodules updated by resetToBaseCommit command
                updateSubmodules = Collections.emptyList();
                break;
            case "svn":
```

### DataFlowIssue
Method invocation `getPluginManager` may produce `NullPointerException`
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorPlugin.java`
#### Snippet
```java

        // Try plugin images dir, fallback to Hudson images dir
        PluginWrapper wrapper = Jenkins.getInstance().getPluginManager().getPlugin(PhabricatorPlugin.class);

        boolean pluginIconExists =
```

### DataFlowIssue
Method invocation `getPlugin` may produce `NullPointerException`
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorNotifier.java`
#### Snippet
```java
        // First check if any coverage plugins are applied. These take precedence over other providers
        // Only one coverage plugin provider is supported per build
        if (Jenkins.getInstance().getPlugin("cobertura") != null) {
            CoberturaBuildAction coberturaBuildAction = build.getAction(CoberturaBuildAction.class);
            if (coberturaBuildAction != null) { // Choose only a single coverage provider
```

### DataFlowIssue
Method invocation `child` may produce `NullPointerException`
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorBuildWrapper.java`
#### Snippet
```java
        FilePath arcWorkPath;
        if (this.workDir != null && this.workDir.length() > 0) {
            arcWorkPath = build.getWorkspace().child(workDir);
        } else {
            arcWorkPath = build.getWorkspace();
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/main/java/com/uber/jenkins/phabricator/CommentBuilder.java`
#### Snippet
```java

        comment.append(" when pulling **" + branchName + "** into ");
        comment.append(baseCommit.substring(0, 7));
        comment.append(".");

```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/com/uber/jenkins/phabricator/conduit/ConduitAPIException.java`
#### Snippet
```java

    public ConduitAPIException(String message, int code) {
        super(Integer.toString(code) + " " + message);
        this.code = code;
    }
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `src/main/java/com/uber/jenkins/phabricator/conduit/Differential.java`
#### Snippet
```java
     * Get the list of changed files in the diff.
     *
     * @return the list of changed files in the diff.
     */
    public Set<String> getChangedFiles() {
```

## RuleId[id=Deprecation]
### Deprecation
'edu.umd.cs.findbugs.annotations.NonNull' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsNameProvider.java`
#### Snippet
```java
public class ConduitCredentialsNameProvider extends CredentialsNameProvider<ConduitCredentialsImpl> {

    @NonNull
    @Override
    public String getName(@NonNull ConduitCredentialsImpl credentials) {
```

### Deprecation
'edu.umd.cs.findbugs.annotations.NonNull' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsNameProvider.java`
#### Snippet
```java
    @NonNull
    @Override
    public String getName(@NonNull ConduitCredentialsImpl credentials) {
        return credentials.getUrl();
    }
```

### Deprecation
'StringEntity(java.lang.String, java.lang.String, java.lang.String)' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/uberalls/UberallsClient.java`
#### Snippet
```java
                HttpPost request = new HttpPost(getBuilder().build().toString());
                request.addHeader("Content-Type", "application/json");
                StringEntity requestEntity = new StringEntity(
                        params.toString(),
                        ContentType.APPLICATION_JSON.toString(),
```

### Deprecation
'getInstance()' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/provider/InstanceProvider.java`
#### Snippet
```java

    public static UnitTestProvider getUnitTestProvider(Logger logger) {
        return new InstanceProvider<UnitTestProvider>(Jenkins.getInstance(),
                JUNIT_PLUGIN_NAME, logger) {
            @Override
```

### Deprecation
'edu.umd.cs.findbugs.annotations.NonNull' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
    private final String gateway;

    @NonNull
    private final String url;

```

### Deprecation
'edu.umd.cs.findbugs.annotations.NonNull' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
    }

    @NonNull
    public String getUrl() {
        return url;
```

### Deprecation
'edu.umd.cs.findbugs.annotations.Nullable' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
    private final Secret token;

    @Nullable
    private final String gateway;

```

### Deprecation
'edu.umd.cs.findbugs.annotations.Nullable' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
    }

    @Nullable
    public String getGateway() {
        return !CommonUtils.isBlank(gateway) ? gateway : getUrl();
```

### Deprecation
'edu.umd.cs.findbugs.annotations.NonNull' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
public class ConduitCredentialsImpl extends BaseStandardCredentials implements ConduitCredentials {

    @NonNull
    private final Secret token;

```

### Deprecation
'edu.umd.cs.findbugs.annotations.NonNull' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
    }

    @NonNull
    public Secret getToken() {
        return token;
```

### Deprecation
'edu.umd.cs.findbugs.annotations.CheckForNull' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
    @DataBoundConstructor
    public ConduitCredentialsImpl(
            @CheckForNull String id,
            @NonNull @CheckForNull String url,
            @Nullable String gateway,
```

### Deprecation
'edu.umd.cs.findbugs.annotations.NonNull' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
    public ConduitCredentialsImpl(
            @CheckForNull String id,
            @NonNull @CheckForNull String url,
            @Nullable String gateway,
            @CheckForNull String description,
```

### Deprecation
'edu.umd.cs.findbugs.annotations.CheckForNull' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
    public ConduitCredentialsImpl(
            @CheckForNull String id,
            @NonNull @CheckForNull String url,
            @Nullable String gateway,
            @CheckForNull String description,
```

### Deprecation
'edu.umd.cs.findbugs.annotations.Nullable' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
            @CheckForNull String id,
            @NonNull @CheckForNull String url,
            @Nullable String gateway,
            @CheckForNull String description,
            @CheckForNull String token) {
```

### Deprecation
'edu.umd.cs.findbugs.annotations.CheckForNull' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
            @NonNull @CheckForNull String url,
            @Nullable String gateway,
            @CheckForNull String description,
            @CheckForNull String token) {
        super(id, description);
```

### Deprecation
'edu.umd.cs.findbugs.annotations.CheckForNull' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
            @Nullable String gateway,
            @CheckForNull String description,
            @CheckForNull String token) {
        super(id, description);
        this.url = url;
```

### Deprecation
'Plugin()' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorPlugin.java`
#### Snippet
```java
import jenkins.model.Jenkins;

public class PhabricatorPlugin extends Plugin {

    // Diff ID (not differential ID)
```

### Deprecation
'getInstance()' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorPlugin.java`
#### Snippet
```java

        // Try plugin images dir, fallback to Hudson images dir
        PluginWrapper wrapper = Jenkins.getInstance().getPluginManager().getPlugin(PhabricatorPlugin.class);

        boolean pluginIconExists =
```

### Deprecation
'withEmptySelection()' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/ConduitCredentialsDescriptor.java`
#### Snippet
```java
        List<DomainRequirement> domainRequirements = new ArrayList<DomainRequirement>();
        return new StandardListBoxModel()
                .withEmptySelection()
                .withMatching(
                        CredentialsMatchers.anyOf(
```

### Deprecation
'withMatching(com.cloudbees.plugins.credentials.CredentialsMatcher, java.lang.Iterable)' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/ConduitCredentialsDescriptor.java`
#### Snippet
```java
        return new StandardListBoxModel()
                .withEmptySelection()
                .withMatching(
                        CredentialsMatchers.anyOf(
                                CredentialsMatchers.instanceOf(ConduitCredentials.class)),
```

### Deprecation
'SYSTEM' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/ConduitCredentialsDescriptor.java`
#### Snippet
```java
                                StandardCredentials.class,
                                context,
                                ACL.SYSTEM,
                                domainRequirements));
    }
```

### Deprecation
'getInstance()' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorNotifier.java`
#### Snippet
```java
        // First check if any coverage plugins are applied. These take precedence over other providers
        // Only one coverage plugin provider is supported per build
        if (Jenkins.getInstance().getPlugin("cobertura") != null) {
            CoberturaBuildAction coberturaBuildAction = build.getAction(CoberturaBuildAction.class);
            if (coberturaBuildAction != null) { // Choose only a single coverage provider
```

### Deprecation
'getInstance()' is deprecated
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorNotifier.java`
#### Snippet
```java
        }

        if (coverageProvider == null && Jenkins.getInstance().getPlugin("jacoco") != null) {
            JacocoBuildAction jacocoBuildAction = build.getAction(JacocoBuildAction.class);
            if (jacocoBuildAction != null) {
```

### Deprecation
Overrides deprecated method in 'jenkins.tasks.SimpleBuildStep'
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorNotifier.java`
#### Snippet
```java

    @Override
    public final void perform(
            final Run<?, ?> build, FilePath workspace, final Launcher launcher,
            final TaskListener listener) throws InterruptedException, IOException {
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/com/uber/jenkins/phabricator/coverage/CodeCoverageMetrics.java`
#### Snippet
```java

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("package coverage = ");
        sb.append(packagesCoveragePercent);
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorBuildWrapperDescriptor.java`
#### Snippet
```java
     * This human readable name is used in the configuration screen.
     */
    public String getDisplayName() {
        return "Apply Phabricator Differential";
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorNotifierDescriptor.java`
#### Snippet
```java
     * This human readable name is used in the configuration screen.
     */
    public String getDisplayName() {
        return "Post to Phabricator";
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@edu.umd.cs.findbugs.annotations.NonNull'
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
    private final String gateway;

    @NonNull
    private final String url;

```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
         */
        @Override
        public String getDisplayName() {
            return "Phabricator Conduit Key";
        }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@edu.umd.cs.findbugs.annotations.Nullable'
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
    private final Secret token;

    @Nullable
    private final String gateway;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@edu.umd.cs.findbugs.annotations.NonNull'
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
public class ConduitCredentialsImpl extends BaseStandardCredentials implements ConduitCredentials {

    @NonNull
    private final Secret token;

```

### NullableProblems
Cannot annotate with both @NonNull and @CheckForNull
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
    public ConduitCredentialsImpl(
            @CheckForNull String id,
            @NonNull @CheckForNull String url,
            @Nullable String gateway,
            @CheckForNull String description,
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorNotifier.java`
#### Snippet
```java
    @Override
    public final void perform(
            final Run<?, ?> build, FilePath workspace, final Launcher launcher,
            final TaskListener listener) throws InterruptedException, IOException {
        EnvVars environment = build.getEnvironment(listener);
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorNotifier.java`
#### Snippet
```java
    @Override
    public final void perform(
            final Run<?, ?> build, FilePath workspace, final Launcher launcher,
            final TaskListener listener) throws InterruptedException, IOException {
        EnvVars environment = build.getEnvironment(listener);
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorNotifier.java`
#### Snippet
```java
    public final void perform(
            final Run<?, ?> build, FilePath workspace, final Launcher launcher,
            final TaskListener listener) throws InterruptedException, IOException {
        EnvVars environment = build.getEnvironment(listener);
        Logger logger = new Logger(listener.getLogger());
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorPostbuildAction.java`
#### Snippet
```java

/**
 * Ripped from https://github.com/jenkinsci/groovy-postbuild-plugin/blob/master/src/main/java/org/jvnet/hudson/plugins/groovypostbuild/GroovyPostbuildAction.java
 */
public class PhabricatorPostbuildAction implements BuildBadgeAction {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/uber/jenkins/phabricator/lint/LintResult.java`
#### Snippet
```java
 * This currently mirrors the API format of Harbormaster lint messages
 *
 * Reference: https://secure.phabricator.com/conduit/method/harbormaster.sendmessage/
 *
 * name         string          Short message name, like "Syntax Error".
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/uber/jenkins/phabricator/conduit/HarbormasterClient.java`
#### Snippet
```java

    /**
     * See https://secure.phabricator.com/conduit/method/harbormaster.sendmessage/
     */
    public enum MessageType {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorPostbuildSummaryAction.java`
#### Snippet
```java

/**
 * Ripped from https://github.com/jenkinsci/groovy-postbuild-plugin/blob/master/src/main/java/org/jvnet/hudson/plugins/groovypostbuild/GroovyPostbuildSummaryAction.java
 */
@ExportedBean(defaultVisibility = 2)
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorPostbuildAction.java`
#### Snippet
```java
    private final String background = "transparent";
    private final String border = "0";
    private final String borderColor = "transparent";
    private final String link;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorPostbuildAction.java`
#### Snippet
```java
    private final String iconPath;
    private final String text;
    private final String color = "#1FBAD6";
    private final String background = "transparent";
    private final String border = "0";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorPostbuildAction.java`
#### Snippet
```java
    private final String color = "#1FBAD6";
    private final String background = "transparent";
    private final String border = "0";
    private final String borderColor = "transparent";
    private final String link;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorPostbuildAction.java`
#### Snippet
```java
    private final String text;
    private final String color = "#1FBAD6";
    private final String background = "transparent";
    private final String border = "0";
    private final String borderColor = "transparent";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/jenkins/phabricator/tasks/NonDifferentialHarbormasterTask.java`
#### Snippet
```java

    private final String phid;
    private final ConduitAPIClient conduit;
    private final hudson.model.Result buildResult;
    private final String buildUrl;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorNotifier.java`
#### Snippet
```java
    private void cleanupCoverageFilesOnJenkinsMaster(Run<?, ?> build) {
        for (File report : getCoverageReports(build)) {
            report.delete();
        }
    }
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/com/uber/jenkins/phabricator/BuildResultProcessor.java`
#### Snippet
```java
                    lintResults
            ).run();
            if (result != Task.Result.SUCCESS) {
                return false;
            }
```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'com.uber.jenkins.phabricator.tasks.Task.Result.FAILURE' accessed via instance reference
in `src/main/java/com/uber/jenkins/phabricator/tasks/SendHarbormasterResultTask.java`
#### Snippet
```java
    private void failTask() {
        info("Unable to post to Harbormaster");
        result = result.FAILURE;
    }
}
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'CloseableHttpClient' used without 'try'-with-resources statement
in `src/main/java/com/uber/jenkins/phabricator/conduit/ConduitAPIClient.java`
#### Snippet
```java
     */
    public JSONObject perform(String action, JSONObject params) throws IOException, ConduitAPIException {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpUriRequest request = createRequest(action, params);

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/jenkins/phabricator/BuildResultProcessor.java`
#### Snippet
```java
     *
     * @param uberalls the client to the Uberalls instance
     * @return
     */
    public boolean processParentCoverage(UberallsClient uberalls) {
```

### JavadocDeclaration
`@param lintResults` tag description is missing
in `src/main/java/com/uber/jenkins/phabricator/conduit/HarbormasterClient.java`
#### Snippet
```java
     * @param unitResults the results from the unit tests
     * @param coverage the results from the coverage provider
     * @param lintResults
     * @return the Conduit API response
     * @throws IOException if there is a network error talking to Conduit
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/uber/jenkins/phabricator/conduit/DifferentialClient.java`
#### Snippet
```java
     * @param revisionID The ID of the revision, e.g. for "D123" this would be "123"
     * @return A \n-separated string of the commit message
     * @throws ConduitAPIException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/uber/jenkins/phabricator/conduit/DifferentialClient.java`
#### Snippet
```java
     * @return A \n-separated string of the commit message
     * @throws ConduitAPIException
     * @throws IOException
     */
    public String getCommitMessage(String revisionID) throws ConduitAPIException, IOException {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/jenkins/phabricator/CommentBuilder.java`
#### Snippet
```java
     * Determine whether to attempt to process coverage
     *
     * @return
     */
    boolean hasCoverageAvailable() {
```

### JavadocDeclaration
`@param baseCommit` tag description is missing
in `src/main/java/com/uber/jenkins/phabricator/CommentBuilder.java`
#### Snippet
```java
     *
     * @param parentCoverage the parent coverage returned from uberalls
     * @param baseCommit
     * @param branchName the name of the current branch
     * @return boolean if we fail coverage reporting from threshold
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/jenkins/phabricator/CommentBuilder.java`
#### Snippet
```java
     * Determine if there exists a comment already
     *
     * @return
     */
    boolean hasComment() {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/jenkins/phabricator/CommentBuilder.java`
#### Snippet
```java
     * Get the final comment to post to Phabricator
     *
     * @return
     */
    String getComment() {
```

### JavadocDeclaration
`@param conduitClient` tag description is missing
in `src/main/java/com/uber/jenkins/phabricator/tasks/NonDifferentialHarbormasterTask.java`
#### Snippet
```java
     * @param logger The logger where logs go to.
     * @param phid Phabricator object ID
     * @param conduitClient
     * @param result
     * @param buildUrl
```

### JavadocDeclaration
`@param result` tag description is missing
in `src/main/java/com/uber/jenkins/phabricator/tasks/NonDifferentialHarbormasterTask.java`
#### Snippet
```java
     * @param phid Phabricator object ID
     * @param conduitClient
     * @param result
     * @param buildUrl
     * @param sendPartialResults Send a 'work' message type instead of 'pass'/'fail' if true.
```

### JavadocDeclaration
`@param buildUrl` tag description is missing
in `src/main/java/com/uber/jenkins/phabricator/tasks/NonDifferentialHarbormasterTask.java`
#### Snippet
```java
     * @param conduitClient
     * @param result
     * @param buildUrl
     * @param sendPartialResults Send a 'work' message type instead of 'pass'/'fail' if true.
     */
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `unitResults` may be 'final'
in `src/main/java/com/uber/jenkins/phabricator/tasks/SendHarbormasterResultTask.java`
#### Snippet
```java
    private final Map<String, String> coverage;
    private final LintResults lintResults;
    private UnitResults unitResults;

    public SendHarbormasterResultTask(
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `lineChild` is redundant
in `src/main/java/com/uber/jenkins/phabricator/coverage/XmlCoverageProvider.java`
#### Snippet
```java

                        if (fileChild.getNodeName().equals("line")) {
                            Node lineChild = fileChild;
                            NamedNodeMap lineAttributes = lineChild.getAttributes();
                            String typeAttributeText = lineAttributes.getNamedItem("type").getTextContent();
```

### UnnecessaryLocalVariable
Local variable `classNode` is redundant
in `src/main/java/com/uber/jenkins/phabricator/coverage/XmlCoverageProvider.java`
#### Snippet
```java

                        if (fileChild.getNodeName().equals("class")) {
                            Node classNode = fileChild;
                            NodeList classChildren = classNode.getChildNodes();
                            for (int l = 0; l < classChildren.getLength(); l++) {
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/com/uber/jenkins/phabricator/utils/Logger.java`
#### Snippet
```java
     */
    public void info(String tag, String message) {
        stream.println(String.format(LOG_FORMAT, tag, message));
    }

```

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorBuildWrapper.java`
#### Snippet
```java
                        && abortOnRevisionId.equals(getAbortOnRevisionId(runningBuild))
                        && (upstreamRun == null
                        || runningBuildUpstreamRun == null
                        || !upstreamRun.equals(runningBuildUpstreamRun))
                        && executor != null) {
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/com/uber/jenkins/phabricator/BuildResultProcessor.java`
#### Snippet
```java
                String line;
                while ((line = reader.readLine()) != null) {
                    lint += line;
                    try {
                        JSONObject json = JSONObject.fromObject(lint);
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `passCoverage` is always 'true'
in `src/main/java/com/uber/jenkins/phabricator/CommentBuilder.java`
#### Snippet
```java
        if (parentCoverage == null) {
            logger.info(UBERALLS_TAG, "unable to find coverage for parent commit");
            return passCoverage;
        }

```

### ConstantValue
Condition `environment == null` is always `false`
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorBuildWrapper.java`
#### Snippet
```java
        EnvVars environment = build.getEnvironment(listener);
        Logger logger = new Logger(listener.getLogger());
        if (environment == null) {
            return this.ignoreBuild(logger, "No environment variables found?!");
        }
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/uber/jenkins/phabricator/CommentBuilder.java`
#### Snippet
```java

        if (coverageDelta > 0) {
            comment.append("Coverage increased (+" + coverageDeltaDisplay + "%) to " + lineCoverageDisplay + "%");
        } else if (coverageDelta < 0) {
            comment.append("Coverage decreased (" + coverageDeltaDisplay + "%) to " + lineCoverageDisplay + "%");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/uber/jenkins/phabricator/CommentBuilder.java`
#### Snippet
```java
            comment.append("Coverage increased (+" + coverageDeltaDisplay + "%) to " + lineCoverageDisplay + "%");
        } else if (coverageDelta < 0) {
            comment.append("Coverage decreased (" + coverageDeltaDisplay + "%) to " + lineCoverageDisplay + "%");
        } else {
            comment.append("Coverage remained the same (" + lineCoverageDisplay + "%)");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/uber/jenkins/phabricator/CommentBuilder.java`
#### Snippet
```java
            comment.append("Coverage decreased (" + coverageDeltaDisplay + "%) to " + lineCoverageDisplay + "%");
        } else {
            comment.append("Coverage remained the same (" + lineCoverageDisplay + "%)");
        }

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/uber/jenkins/phabricator/CommentBuilder.java`
#### Snippet
```java
        }

        comment.append(" when pulling **" + branchName + "** into ");
        comment.append(baseCommit.substring(0, 7));
        comment.append(".");
```

