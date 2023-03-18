# teamcity-aws-codepipeline-plugin 
 
# Bad smells
I found 11 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| StaticCallOnSubclass | 6 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| SizeReplaceableByIsEmpty | 1 | true |
| DataFlowIssue | 1 | false |
| BoundedWildcard | 1 | false |
## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ParametersValidator` has only 'static' members, and lacks a 'private' constructor
in `aws-codepipeline-server/src/main/java/jetbrains/buildServer/buildTriggers/codepipeline/ParametersValidator.java`
#### Snippet
```java
 * @author vbedrosova
 */
public class ParametersValidator {
  @NotNull
  public static Map<String, String> validateSettings(@NotNull Map<String, String> params, boolean acceptReferences) {
```

### UtilityClassWithoutPrivateConstructor
Class `CodePipelineUtil` has only 'static' members, and lacks a 'private' constructor
in `aws-codepipeline-common/src/main/java/jetbrains/buildServer/codepipeline/CodePipelineUtil.java`
#### Snippet
```java
 * @author vbedrosova
 */
public final class CodePipelineUtil {
  @NotNull
  public static String printStrings(@NotNull Collection<String> strings) {
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`jobs.size() > 0` can be replaced with '!jobs.isEmpty()'
in `aws-codepipeline-server/src/main/java/jetbrains/buildServer/buildTriggers/codepipeline/CodePipelineAsyncPolledBuildTrigger.java`
#### Snippet
```java
        final List<Job> jobs = codePipelineClient.pollForJobs(request).getJobs();

        if (jobs.size() > 0) {
          if (jobs.size() > 1) {
            LOG.warn(msgForBt("Received " + jobs.size() + ", but only one was expected. Will process only the first job", context.getBuildType()));
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `aws-codepipeline-server/src/main/java/jetbrains/buildServer/buildTriggers/codepipeline/CodePipelineAsyncPolledBuildTrigger.java`
#### Snippet
```java
    final AWSException awse = new AWSException(e);
    final String details = awse.getDetails();
    if (StringUtil.isNotEmpty(details)) LOG.error(details);
    LOG.error(awse.getMessage(), awse);

```

### StaticCallOnSubclass
Static method `isNotEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `aws-codepipeline-agent/src/main/java/jetbrains/buildServer/codepipeline/CodePipelineBuildListener.java`
#### Snippet
```java

    final String details = e.getDetails();
    if (StringUtil.isNotEmpty(details)) {
      LOG.error(details);
      build.getBuildLogger().error(details);
```

### StaticCallOnSubclass
Static method `toSystemIndependentName()` declared in class 'com.intellij.openapi.util.io.FileUtil' but referenced via subclass 'jetbrains.buildServer.util.FileUtil'
in `aws-codepipeline-agent/src/main/java/jetbrains/buildServer/codepipeline/CodePipelineBuildListener.java`
#### Snippet
```java
  private String removePaths(@Nullable String message, @NotNull AgentRunningBuild build) {
    if (message == null) return null;
    final String checkoutDir = FileUtil.toSystemIndependentName(build.getCheckoutDirectory().getAbsolutePath());
    return FileUtil.toSystemIndependentName(message).replace(checkoutDir + "/", StringUtil.EMPTY).replace(checkoutDir, StringUtil.EMPTY);
  }
```

### StaticCallOnSubclass
Static method `toSystemIndependentName()` declared in class 'com.intellij.openapi.util.io.FileUtil' but referenced via subclass 'jetbrains.buildServer.util.FileUtil'
in `aws-codepipeline-agent/src/main/java/jetbrains/buildServer/codepipeline/CodePipelineBuildListener.java`
#### Snippet
```java
    if (message == null) return null;
    final String checkoutDir = FileUtil.toSystemIndependentName(build.getCheckoutDirectory().getAbsolutePath());
    return FileUtil.toSystemIndependentName(message).replace(checkoutDir + "/", StringUtil.EMPTY).replace(checkoutDir, StringUtil.EMPTY);
  }

```

### StaticCallOnSubclass
Static method `createParentDirs()` declared in class 'com.intellij.openapi.util.io.FileUtil' but referenced via subclass 'jetbrains.buildServer.util.FileUtil'
in `aws-codepipeline-agent/src/main/java/jetbrains/buildServer/codepipeline/CodePipelineBuildListener.java`
#### Snippet
```java
  private void makeArtifactCopy(@NotNull File inputFolder, @NotNull File artifactFile, @NotNull String path, @NotNull AgentRunningBuild build) {
    final File dest = new File(inputFolder, path);
    FileUtil.createParentDirs(dest);
    try {
      FileUtil.copy(artifactFile, dest);
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `aws-codepipeline-server/src/main/java/jetbrains/buildServer/buildTriggers/codepipeline/ParametersValidator.java`
#### Snippet
```java
    final Map<String, String> invalids = new HashMap<String, String>(AWSCommonParams.validate(params, acceptReferences));

    if (StringUtil.isEmptyOrSpaces(CodePipelineUtil.getActionToken(params))) {
      invalids.put(CodePipelineConstants.ACTION_TOKEN_PARAM, CodePipelineConstants.ACTION_TOKEN_LABEL + " parameter must not be empty");
    }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `AWSCommonParams.getRegionName(params)` might be null
in `aws-codepipeline-agent/src/main/java/jetbrains/buildServer/codepipeline/CodePipelineBuildListener.java`
#### Snippet
```java
  @NotNull
  private AmazonS3 getArtifactS3Client(@NotNull AWSSessionCredentials artifactCredentials, @NotNull Map<String, String> params) {
    return AWSClients.fromBasicSessionCredentials(artifactCredentials.getAccessKeyId(), artifactCredentials.getSecretAccessKey(), artifactCredentials.getSessionToken(), AWSCommonParams.getRegionName(params)).createS3Client();
  }

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super AgentLifeCycleListener`
in `aws-codepipeline-agent/src/main/java/jetbrains/buildServer/codepipeline/CodePipelineBuildListener.java`
#### Snippet
```java
  private String myJobID;

  public CodePipelineBuildListener(@NotNull final EventDispatcher<AgentLifeCycleListener> agentDispatcher) {
    agentDispatcher.addListener(this);
  }
```

