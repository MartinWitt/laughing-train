# phabricator-jenkins-plugin 
 
# Bad smells
I found 92 bad smells with 10 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 29 | false |
| FieldMayBeStatic | 4 | false |
| DataFlowIssue | 4 | false |
| SizeReplaceableByIsEmpty | 4 | true |
| NullableProblems | 4 | false |
| UnnecessaryBoxing | 4 | false |
| UnnecessaryFullyQualifiedName | 4 | false |
| RedundantFieldInitialization | 4 | false |
| StringConcatenationInsideStringBufferAppend | 4 | false |
| BoundedWildcard | 3 | false |
| ThrowablePrintStackTrace | 3 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| StringEqualsEmptyString | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| ConstantValue | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| IOResource | 1 | false |
| PointlessArithmeticExpression | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| MismatchedJavadocCode | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| IgnoreResultOfCall | 1 | false |
| AccessStaticViaInstance | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| JavaLangImport | 1 | false |
| NestedAssignment | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| EmptyMethod | 1 | false |
| RedundantStringFormatCall | 1 | false |
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

## RuleId[id=IOResource]
### IOResource
'BufferedReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/com/uber/jenkins/phabricator/BuildResultProcessor.java`
#### Snippet
```java
            if (input != null && input.length() > 0) {
                lintResults = new LintResults();
                BufferedReader reader = new BufferedReader(new StringReader(input));
                String lint = "";
                String line;
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

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `border` may be 'static'
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorPostbuildAction.java`
#### Snippet
```java
    private final String color = "#1FBAD6";
    private final String background = "transparent";
    private final String border = "0";
    private final String borderColor = "transparent";
    private final String link;
```

### FieldMayBeStatic
Field `color` may be 'static'
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorPostbuildAction.java`
#### Snippet
```java
    private final String iconPath;
    private final String text;
    private final String color = "#1FBAD6";
    private final String background = "transparent";
    private final String border = "0";
```

### FieldMayBeStatic
Field `borderColor` may be 'static'
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorPostbuildAction.java`
#### Snippet
```java
    private final String background = "transparent";
    private final String border = "0";
    private final String borderColor = "transparent";
    private final String link;

```

### FieldMayBeStatic
Field `background` may be 'static'
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorPostbuildAction.java`
#### Snippet
```java
    private final String text;
    private final String color = "#1FBAD6";
    private final String background = "transparent";
    private final String border = "0";
    private final String borderColor = "transparent";
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `CommonUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/jenkins/phabricator/utils/CommonUtils.java`
#### Snippet
```java
package com.uber.jenkins.phabricator.utils;

public class CommonUtils {

    public static boolean isBlank(String str) {
```

### UtilityClassWithoutPrivateConstructor
Class `ConduitCredentialsDescriptor` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/jenkins/phabricator/ConduitCredentialsDescriptor.java`
#### Snippet
```java
import jenkins.model.Jenkins;

public class ConduitCredentialsDescriptor {

    private static List<ConduitCredentials> availableCredentials(Job owner) {
```

## RuleId[id=DataFlowIssue]
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`available.size() == 0` can be replaced with 'available.isEmpty()'
in `src/main/java/com/uber/jenkins/phabricator/ConduitCredentialsDescriptor.java`
#### Snippet
```java
    public static ConduitCredentials getCredentials(Job owner, String credentialsID) {
        List<ConduitCredentials> available = availableCredentials(owner);
        if (available.size() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`build.getActions(PhabricatorPostbuildAction.class).size() == 0` can be replaced with 'build.getActions(PhabricatorPostbuildAction.class).isEmpty()'
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorNotifier.java`
#### Snippet
```java
        final UberallsClient uberallsClient = getUberallsClient(logger, gitUrl, branch);

        final boolean needsDecoration = build.getActions(PhabricatorPostbuildAction.class).size() == 0;

        final String diffID = environment.get(PhabricatorPlugin.DIFFERENTIAL_ID_FIELD);
```

### SizeReplaceableByIsEmpty
`input.length() > 0` can be replaced with '!input.isEmpty()'
in `src/main/java/com/uber/jenkins/phabricator/BuildResultProcessor.java`
#### Snippet
```java
        try {
            String input = lintFetcher.getRemoteFile();
            if (input != null && input.length() > 0) {
                lintResults = new LintResults();
                BufferedReader reader = new BufferedReader(new StringReader(input));
```

### SizeReplaceableByIsEmpty
`this.workDir.length() > 0` can be replaced with '!this.workDir.isEmpty()'
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorBuildWrapper.java`
#### Snippet
```java

        FilePath arcWorkPath;
        if (this.workDir != null && this.workDir.length() > 0) {
            arcWorkPath = build.getWorkspace().child(workDir);
        } else {
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends File`
in `src/main/java/com/uber/jenkins/phabricator/coverage/XmlCoverageProvider.java`
#### Snippet
```java
    }

    private void parse(Set<String> includeFiles, Set<File> reports) throws SAXException, IOException {
        if (db != null) {
            for (File file : reports) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/com/uber/jenkins/phabricator/coverage/XmlCoverageProvider.java`
#### Snippet
```java
        void computeLineCoverage(
                Map<String, SortedMap<Integer, Integer>> internalCounts,
                Map<String, List<Integer>> lineCoverage) {
            for (Map.Entry<String, SortedMap<Integer, Integer>> entry : internalCounts.entrySet()) {
                List<Integer> sortedCounts = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super List`
in `src/main/java/com/uber/jenkins/phabricator/coverage/XmlCoverageProvider.java`
#### Snippet
```java
        void computeLineCoverage(
                Map<String, SortedMap<Integer, Integer>> internalCounts,
                Map<String, List<Integer>> lineCoverage) {
            for (Map.Entry<String, SortedMap<Integer, Integer>> entry : internalCounts.entrySet()) {
                List<Integer> sortedCounts = new ArrayList<>();
```

## RuleId[id=NullableProblems]
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
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@edu.umd.cs.findbugs.annotations.NonNull'
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
public class ConduitCredentialsImpl extends BaseStandardCredentials implements ConduitCredentials {

    @NonNull
    private final Secret token;

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
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@edu.umd.cs.findbugs.annotations.Nullable'
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
    private final Secret token;

    @Nullable
    private final String gateway;

```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/com/uber/jenkins/phabricator/conduit/Differential.java`
#### Snippet
```java
    public String getDiffID() {
        String rawDiffId = (String) rawJSON.get("id");
        if (rawDiffId == null || rawDiffId.equals("")) {
            return null;
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/com/uber/jenkins/phabricator/conduit/Differential.java`
#### Snippet
```java
        Object rawRevisionIdObj = rawJSON.get("revisionID");
        String rawRevisionId = rawRevisionIdObj != null && !(rawRevisionIdObj instanceof net.sf.json.JSONNull) ? (String) rawRevisionIdObj : null;
        if (rawRevisionId == null || rawRevisionId.equals("")) {
            return null;
        }
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `src/main/java/com/uber/jenkins/phabricator/coverage/XmlCoverageProvider.java`
#### Snippet
```java
                }
                NamedNodeMap attrs = node.getAttributes();
                long covered = Long.valueOf(attrs.getNamedItem("covered").getTextContent());
                long missed = Long.valueOf(attrs.getNamedItem("missed").getTextContent());
                switch (attrs.getNamedItem("type").getTextContent()) {
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `src/main/java/com/uber/jenkins/phabricator/coverage/XmlCoverageProvider.java`
#### Snippet
```java
                NamedNodeMap attrs = node.getAttributes();
                long covered = Long.valueOf(attrs.getNamedItem("covered").getTextContent());
                long missed = Long.valueOf(attrs.getNamedItem("missed").getTextContent());
                switch (attrs.getNamedItem("type").getTextContent()) {
                    case "CLASS":
```

### UnnecessaryBoxing
Redundant boxing, `Float.parseFloat()` call can be used instead
in `src/main/java/com/uber/jenkins/phabricator/coverage/XmlCoverageProvider.java`
#### Snippet
```java
        String content = attrs.getNamedItem(attr).getTextContent();
        try {
            return Math.round(Float.valueOf(content));
        } catch (NumberFormatException e) {
            throw new IllegalStateException(content + " is not a valid coverage number", e);
```

### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `src/main/java/com/uber/jenkins/phabricator/coverage/XmlCoverageProvider.java`
#### Snippet
```java
        String content = attrs.getNamedItem(attr).getTextContent();
        try {
            return Math.round(Double.valueOf(content));
        } catch (NumberFormatException e) {
            throw new IllegalStateException(content + " is not a valid coverage number", e);
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

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Descriptor` is the same as one of its superclass' names
in `src/main/java/com/uber/jenkins/phabricator/credentials/ConduitCredentialsImpl.java`
#### Snippet
```java
    @Extension
    @SuppressWarnings("unused")
    public static class Descriptor extends CredentialsDescriptor {

        /**
```

## RuleId[id=JavaLangImport]
### JavaLangImport
Unnecessary import from the 'java.lang' package
in `src/main/java/com/uber/jenkins/phabricator/conduit/ConduitAPIException.java`
#### Snippet
```java
package com.uber.jenkins.phabricator.conduit;

import java.lang.Integer;

public class ConduitAPIException extends Exception {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `net.sf.json` is unnecessary and can be removed
in `src/main/java/com/uber/jenkins/phabricator/conduit/Differential.java`
#### Snippet
```java
    public String getRevisionID(boolean formatted) {
        Object rawRevisionIdObj = rawJSON.get("revisionID");
        String rawRevisionId = rawRevisionIdObj != null && !(rawRevisionIdObj instanceof net.sf.json.JSONNull) ? (String) rawRevisionIdObj : null;
        if (rawRevisionId == null || rawRevisionId.equals("")) {
            return null;
```

### UnnecessaryFullyQualifiedName
Qualifier `hudson.model` is unnecessary and can be removed
in `src/main/java/com/uber/jenkins/phabricator/BuildResultProcessor.java`
#### Snippet
```java
        }

        if (commentWithConsoleLinkOnFailure && getBuildResult().isWorseOrEqualTo(hudson.model.Result.UNSTABLE)) {
            commenter.addBuildFailureMessage();
        } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `hudson.model` is unnecessary and can be removed
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorBuildWrapper.java`
#### Snippet
```java
    @VisibleForTesting
    static Run<?, ?> getUpstreamRun(AbstractBuild build) {
        CauseAction action = build.getAction(hudson.model.CauseAction.class);
        if (action != null) {
            Cause.UpstreamCause upstreamCause = action.findCause(hudson.model.Cause.UpstreamCause.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `hudson.model` is unnecessary and can be removed
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorBuildWrapper.java`
#### Snippet
```java
        CauseAction action = build.getAction(hudson.model.CauseAction.class);
        if (action != null) {
            Cause.UpstreamCause upstreamCause = action.findCause(hudson.model.Cause.UpstreamCause.class);
            if (upstreamCause != null) {
                return upstreamCause.getUpstreamRun();
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/com/uber/jenkins/phabricator/BuildResultProcessor.java`
#### Snippet
```java
                String lint = "";
                String line;
                while ((line = reader.readLine()) != null) {
                    lint += line;
                    try {
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorNotifier.java`
#### Snippet
```java
                }
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
                logger.warn(COVERAGE_TAG, "Unable to copy coverage to " + buildTarget);
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/uber/jenkins/phabricator/coverage/XmlCoverageProvider.java`
#### Snippet
```java
            parse(includeFiles, coverageReports);
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }
        computeMetrics();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/uber/jenkins/phabricator/coverage/XmlCoverageProvider.java`
#### Snippet
```java
            localDb = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        db = localDb;
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `Task()` of an abstract class should not be declared 'public'
in `src/main/java/com/uber/jenkins/phabricator/tasks/Task.java`
#### Snippet
```java
     * @param logger The logger where logs go to.
     */
    public Task(Logger logger) {
        this.logger = logger;
    }
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `src/main/java/com/uber/jenkins/phabricator/tasks/Task.java`
#### Snippet
```java
     * Tears down after task execution.
     */
    protected abstract void tearDown();

    /**
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/jenkins/phabricator/coverage/CoverageProvider.java`
#### Snippet
```java
    CodeCoverageMetrics metrics = null;

    private boolean hasComputedCoverage = false;

    CoverageProvider(Set<String> includeFiles) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/uber/jenkins/phabricator/coverage/CoverageProvider.java`
#### Snippet
```java
    final Set<String> includeFiles;
    final Map<String, List<Integer>> lineCoverage = new HashMap<>();
    CodeCoverageMetrics metrics = null;

    private boolean hasComputedCoverage = false;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/jenkins/phabricator/coverage/XmlCoverageProvider.java`
#### Snippet
```java
    private static class CoverageCounter {

        long covered = 0;
        long missed = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/uber/jenkins/phabricator/coverage/XmlCoverageProvider.java`
#### Snippet
```java

        long covered = 0;
        long missed = 0;

        float getPercent() {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/unit/JUnitTestProvider.java`
#### Snippet
```java
        TestResultAction jUnitAction = build.getAction(TestResultAction.class);
        if (jUnitAction == null) {
            return null;
        }
        return jUnitAction.getResult();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorPlugin.java`
#### Snippet
```java
    public static String getIconPath(String icon) {
        if (icon == null) {
            return null;
        }
        if (icon.startsWith("/")) {
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/ConduitCredentialsDescriptor.java`
#### Snippet
```java
        List<ConduitCredentials> available = availableCredentials(owner);
        if (available.size() == 0) {
            return null;
        }
        CredentialsMatcher matcher;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/conduit/Differential.java`
#### Snippet
```java
        String rawDiffId = (String) rawJSON.get("id");
        if (rawDiffId == null || rawDiffId.equals("")) {
            return null;
        }
        return rawDiffId;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/conduit/Differential.java`
#### Snippet
```java
        String rawRevisionId = rawRevisionIdObj != null && !(rawRevisionIdObj instanceof net.sf.json.JSONNull) ? (String) rawRevisionIdObj : null;
        if (rawRevisionId == null || rawRevisionId.equals("")) {
            return null;
        }
        if (formatted) {
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/coverage/JacocoPluginCoverageProvider.java`
#### Snippet
```java
    static CodeCoverageMetrics convertJacoco(CoverageReport coverageResult) {
        if (coverageResult == null) {
            return null;
        }
        float methodCoverage = coverageResult.getMethodCoverage().getPercentageFloat();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorNotifierDescriptor.java`
#### Snippet
```java
            return uberallsURL;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/provider/InstanceProvider.java`
#### Snippet
```java
        if (jenkins.getPlugin(pluginName) == null) {
            logger.info(LOGGER_TAG, String.format("'%s' plugin not installed.", pluginName));
            return null;
        }
        return makeInstance();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/tasks/PostCommentTask.java`
#### Snippet
```java

        result = Result.FAILURE;
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorNotifier.java`
#### Snippet
```java
            return credentials.getUrl();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorNotifier.java`
#### Snippet
```java
        UnitTestProvider unitProvider = InstanceProvider.getUnitTestProvider(logger);
        if (unitProvider == null) {
            return null;
        }
        unitProvider.setBuild(build);
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorNotifier.java`
#### Snippet
```java
        }
        if (!buildResult.isBetterOrEqualTo(Result.UNSTABLE)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorNotifier.java`
#### Snippet
```java
        } else {
            logger.info(UBERALLS_TAG, "No coverage results found");
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/coverage/CoberturaPluginCoverageProvider.java`
#### Snippet
```java
     static CodeCoverageMetrics convertCobertura(CoverageResult result) {
        if (result == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/uberalls/UberallsClient.java`
#### Snippet
```java
    public CodeCoverageMetrics getParentCoverage(String sha) {
        if (sha == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/uberalls/UberallsClient.java`
#### Snippet
```java
            JSON responseJSON = jsonParser.parseText(coverageJSON);
            if (responseJSON instanceof JSONNull) {
                return null;
            }
            JSONObject coverage = (JSONObject) responseJSON;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/uberalls/UberallsClient.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/uberalls/UberallsClient.java`
#### Snippet
```java
            if (statusCode != HttpStatus.SC_OK) {
                logger.info(TAG, "Call failed: " + response.getStatusLine().toString());
                return null;
            }
            return EntityUtils.toString(response.getEntity());
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/uberalls/UberallsClient.java`
#### Snippet
```java
            e.printStackTrace(logger.getStream());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/RemoteFileFetcher.java`
#### Snippet
```java
        if (CommonUtils.isBlank(fileName)) {
            logger.info(LOGGER_TAG, "no file configured");
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/RemoteFileFetcher.java`
#### Snippet
```java
        if (src.length == 0) {
            logger.info(LOGGER_TAG, "no files found by path: '" + fileName + "'");
            return null;
        }
        if (src.length > 1) {
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorBuildWrapper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorBuildWrapper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorBuildWrapper.java`
#### Snippet
```java
            e.printStackTrace(logger.getStream());
            logger.warn(CONDUIT_TAG, e.getMessage());
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorBuildWrapper.java`
#### Snippet
```java
            logger.warn(CONDUIT_TAG, "Unable to fetch differential from Conduit API");
            logger.warn(CONDUIT_TAG, e.getMessage());
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorBuildWrapper.java`
#### Snippet
```java
                }
                // Indicate failure
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorBuildWrapper.java`
#### Snippet
```java
            return credentials.getUrl();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/PhabricatorBuildWrapper.java`
#### Snippet
```java
        }
        logger.warn("credentials", "No credentials configured.");
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/jenkins/phabricator/coverage/XmlCoverageProvider.java`
#### Snippet
```java
            @Override
            public Node item(int index) {
                return null;
            }

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

