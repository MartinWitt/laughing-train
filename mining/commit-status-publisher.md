# commit-status-publisher 
 
# Bad smells
I found 121 bad smells with 25 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringBeanConstructorArgInspection | 29 | false |
| RegExpRedundantEscape | 27 | false |
| UnnecessaryModifier | 19 | true |
| JavadocReference | 4 | false |
| UnnecessaryToStringCall | 4 | true |
| JavadocDeclaration | 4 | false |
| ConditionCoveredByFurtherCondition | 3 | false |
| ConstantValue | 3 | false |
| SwitchStatementWithTooFewBranches | 2 | false |
| DuplicatedCode | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| FieldCanBeLocal | 2 | false |
| RedundantMethodOverride | 2 | false |
| ArraysAsListWithZeroOrOneArgument | 2 | false |
| UnusedAssignment | 2 | false |
| UNCHECKED_WARNING | 1 | false |
| UnnecessarySemicolon | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| SpringXmlModelInspection | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| TrivialStringConcatenation | 1 | false |
| DanglingJavadoc | 1 | false |
| UNUSED_IMPORT | 1 | false |
| FieldMayBeFinal | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| UnnecessaryUnicodeEscape | 1 | false |
| SpringXmlAutowireExplicitlyInspection | 1 | false |
| SuspiciousIndentAfterControlStatement | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/GitHubApi.java`
#### Snippet
```java
   * @throws IOException
   */
  public void postComment(@NotNull final String ownerName,
                          @NotNull final String repoName,
                          @NotNull final String hash,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DefaultStatusMessages.java`
#### Snippet
```java
  public final String BUILD_FINISHED = "TeamCity build finished";
  public final String BUILD_FAILED = "TeamCity build failed";
  public final String BUILD_MARKED_SUCCESSFULL = "TeamCity build marked as successful";
}

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DefaultStatusMessages.java`
#### Snippet
```java
  public final String BUILD_FINISHED = "TeamCity build finished";
  public final String BUILD_FAILED = "TeamCity build failed";
  public final String BUILD_MARKED_SUCCESSFULL = "TeamCity build marked as successful";
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DefaultStatusMessages.java`
#### Snippet
```java
public interface DefaultStatusMessages {
  public final String BUILD_QUEUED = "TeamCity build queued";
  public final String BUILD_REMOVED_FROM_QUEUE = "TeamCity build removed from queue";
  public final String BUILD_STARTED = "TeamCity build started";
  public final String BUILD_FINISHED = "TeamCity build finished";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DefaultStatusMessages.java`
#### Snippet
```java
public interface DefaultStatusMessages {
  public final String BUILD_QUEUED = "TeamCity build queued";
  public final String BUILD_REMOVED_FROM_QUEUE = "TeamCity build removed from queue";
  public final String BUILD_STARTED = "TeamCity build started";
  public final String BUILD_FINISHED = "TeamCity build finished";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DefaultStatusMessages.java`
#### Snippet
```java
  public final String BUILD_STARTED = "TeamCity build started";
  public final String BUILD_FINISHED = "TeamCity build finished";
  public final String BUILD_FAILED = "TeamCity build failed";
  public final String BUILD_MARKED_SUCCESSFULL = "TeamCity build marked as successful";
}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DefaultStatusMessages.java`
#### Snippet
```java
  public final String BUILD_STARTED = "TeamCity build started";
  public final String BUILD_FINISHED = "TeamCity build finished";
  public final String BUILD_FAILED = "TeamCity build failed";
  public final String BUILD_MARKED_SUCCESSFULL = "TeamCity build marked as successful";
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DefaultStatusMessages.java`
#### Snippet
```java
  public final String BUILD_QUEUED = "TeamCity build queued";
  public final String BUILD_REMOVED_FROM_QUEUE = "TeamCity build removed from queue";
  public final String BUILD_STARTED = "TeamCity build started";
  public final String BUILD_FINISHED = "TeamCity build finished";
  public final String BUILD_FAILED = "TeamCity build failed";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DefaultStatusMessages.java`
#### Snippet
```java
  public final String BUILD_QUEUED = "TeamCity build queued";
  public final String BUILD_REMOVED_FROM_QUEUE = "TeamCity build removed from queue";
  public final String BUILD_STARTED = "TeamCity build started";
  public final String BUILD_FINISHED = "TeamCity build finished";
  public final String BUILD_FAILED = "TeamCity build failed";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DefaultStatusMessages.java`
#### Snippet
```java

public interface DefaultStatusMessages {
  public final String BUILD_QUEUED = "TeamCity build queued";
  public final String BUILD_REMOVED_FROM_QUEUE = "TeamCity build removed from queue";
  public final String BUILD_STARTED = "TeamCity build started";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DefaultStatusMessages.java`
#### Snippet
```java

public interface DefaultStatusMessages {
  public final String BUILD_QUEUED = "TeamCity build queued";
  public final String BUILD_REMOVED_FROM_QUEUE = "TeamCity build removed from queue";
  public final String BUILD_STARTED = "TeamCity build started";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DefaultStatusMessages.java`
#### Snippet
```java
  public final String BUILD_REMOVED_FROM_QUEUE = "TeamCity build removed from queue";
  public final String BUILD_STARTED = "TeamCity build started";
  public final String BUILD_FINISHED = "TeamCity build finished";
  public final String BUILD_FAILED = "TeamCity build failed";
  public final String BUILD_MARKED_SUCCESSFULL = "TeamCity build marked as successful";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DefaultStatusMessages.java`
#### Snippet
```java
  public final String BUILD_REMOVED_FROM_QUEUE = "TeamCity build removed from queue";
  public final String BUILD_STARTED = "TeamCity build started";
  public final String BUILD_FINISHED = "TeamCity build finished";
  public final String BUILD_FAILED = "TeamCity build failed";
  public final String BUILD_MARKED_SUCCESSFULL = "TeamCity build marked as successful";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/GitHubApiFactory.java`
#### Snippet
```java
 */
public interface GitHubApiFactory {
  public static final String DEFAULT_URL = "https://api.github.com";

  @NotNull
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/GitHubApiFactory.java`
#### Snippet
```java
 */
public interface GitHubApiFactory {
  public static final String DEFAULT_URL = "https://api.github.com";

  @NotNull
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/GitHubApiFactory.java`
#### Snippet
```java
 */
public interface GitHubApiFactory {
  public static final String DEFAULT_URL = "https://api.github.com";

  @NotNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherSettings.java`
#### Snippet
```java
  boolean isPublishingForVcsRoot(VcsRoot vcsRoot);

  public boolean isEventSupported(Event event, final SBuildType buildType, final Map<String, String> params);

  boolean isTestConnectionSupported();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherSettings.java`
#### Snippet
```java

  @Nullable
  default public String getServerVersion(@NotNull String url) {
    return null;
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java
  }

  static enum StatusState {
    @SerializedName("pending")
    Pending("pending"),
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'getMethod(String, Class...)' as a member of raw type 'java.lang.Class'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritClientImpl.java`
#### Snippet
```java
    try {
      Class initializer = Class.forName("jetbrains.buildServer.util.jsch.JSchConfigInitializer");
      Method initMethod = initializer.getMethod("initJSchConfig", Class.class);
      initMethod.invoke(null, JSch.class);
    } catch (ClassNotFoundException e) {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `isMock`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusesCache.java`
#### Snippet
```java
   * @param prefix   business logic related key prefix for the cache
   * @param status   new value to be added to the cache
   * @param isMock   is it a mock for the missing value?
   * @return previous value in cache or null
   */
```

### JavadocReference
Cannot resolve symbol `HttpCredentials`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherSettings.java`
#### Snippet
```java

  /**
   * Attempts to construct the specific {@link HttpCredentials} with the help of the provided parameters and other available data (e.g. token storage).
   * May return null if operation is not applicable.
   *
```

### JavadocReference
Cannot resolve symbol `changesLoaded`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
  /**
   * This event is required because new one is not triggered before build start in trivial cases
   * @deprecated it's better to use only {@link changesLoaded(BuildPromotion)} instead
   * @param build build, whose changes are loaded and it's started
   */
```

### JavadocReference
Cannot resolve symbol `BuildPromotion`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
  /**
   * This event is required because new one is not triggered before build start in trivial cases
   * @deprecated it's better to use only {@link changesLoaded(BuildPromotion)} instead
   * @param build build, whose changes are loaded and it's started
   */
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/GitHubApiAuthenticationType.java`
#### Snippet
```java

  VCS_ROOT("vcsRoot");
  ;

  private final String myValue;
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of field `parents`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/data/CommitInfo.java`
#### Snippet
```java
public class CommitInfo {
  public String sha;
  public CommitInfo parents[];
}

```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve bean 'configActionsDispatcher'
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java

  <bean class="jetbrains.buildServer.commitPublisher.ServerListener">
    <constructor-arg index="0" ref="configActionsDispatcher"/>
  </bean>

```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/reports/NoFQDNServerUrlReport.java`
#### Snippet
```java
public class NoFQDNServerUrlReport extends HealthStatusReport {

  private static final Pattern URL_WITH_FQDN_PATTERN = Pattern.compile("[a-z]+://[^\\.:/]+\\.(.+)");
  private static final String REPORT_TYPE = "CommitStatusPublisherNoFQDNServerUrl";
  private static final String DISPLAY_NAME
```

### RegExpRedundantEscape
Redundant character escape `\\|` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/upsource/UpsourcePublisher.java`
#### Snippet
```java
  private final VcsModificationHistory myVcsHistory;
  private final Gson myGson = new Gson();
  private static final Pattern TEAMCITY_SVN_REVISION_PATTERN = Pattern.compile("([^\\|]+\\|)?([0-9]+)(_.+)?");


```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  // Captures the following groups: (project path) (repository name)
  // Example: (/tfs/collection) /_git/ (git_project)
  private static final Pattern TFS_GIT_PROJECT_PATH_PATTERN = Pattern.compile("(\\/.+)?\\/_(?:git|ssh)\\/([^\\/]+)");

  // Captures the following groups: (organization) (project) (repository)
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  // Captures the following groups: (project path) (repository name)
  // Example: (/tfs/collection) /_git/ (git_project)
  private static final Pattern TFS_GIT_PROJECT_PATH_PATTERN = Pattern.compile("(\\/.+)?\\/_(?:git|ssh)\\/([^\\/]+)");

  // Captures the following groups: (organization) (project) (repository)
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  // Captures the following groups: (project path) (repository name)
  // Example: (/tfs/collection) /_git/ (git_project)
  private static final Pattern TFS_GIT_PROJECT_PATH_PATTERN = Pattern.compile("(\\/.+)?\\/_(?:git|ssh)\\/([^\\/]+)");

  // Captures the following groups: (organization) (project) (repository)
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  // Captures the following groups: (project path) (repository name)
  // Example: (/tfs/collection) /_git/ (git_project)
  private static final Pattern TFS_GIT_PROJECT_PATH_PATTERN = Pattern.compile("(\\/.+)?\\/_(?:git|ssh)\\/([^\\/]+)");

  // Captures the following groups: (organization) (project) (repository)
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  // Captures the following groups: (organization) (project) (repository)
  // Example: / (organization) / (project) / (repository)
  private static final Pattern TFS_DEVOPS_PATH_PATTERN = Pattern.compile("\\/([^\\/]+)\\/([^\\/]+)\\/([^\\/]+)");

  private static final String[] TFS_HOSTED_DOMAINS = new String[]{"visualstudio.com", "dev.azure.com"};
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  // Captures the following groups: (organization) (project) (repository)
  // Example: / (organization) / (project) / (repository)
  private static final Pattern TFS_DEVOPS_PATH_PATTERN = Pattern.compile("\\/([^\\/]+)\\/([^\\/]+)\\/([^\\/]+)");

  private static final String[] TFS_HOSTED_DOMAINS = new String[]{"visualstudio.com", "dev.azure.com"};
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  // Captures the following groups: (organization) (project) (repository)
  // Example: / (organization) / (project) / (repository)
  private static final Pattern TFS_DEVOPS_PATH_PATTERN = Pattern.compile("\\/([^\\/]+)\\/([^\\/]+)\\/([^\\/]+)");

  private static final String[] TFS_HOSTED_DOMAINS = new String[]{"visualstudio.com", "dev.azure.com"};
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  // Captures the following groups: (organization) (project) (repository)
  // Example: / (organization) / (project) / (repository)
  private static final Pattern TFS_DEVOPS_PATH_PATTERN = Pattern.compile("\\/([^\\/]+)\\/([^\\/]+)\\/([^\\/]+)");

  private static final String[] TFS_HOSTED_DOMAINS = new String[]{"visualstudio.com", "dev.azure.com"};
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  // Captures the following groups: (organization) (project) (repository)
  // Example: / (organization) / (project) / (repository)
  private static final Pattern TFS_DEVOPS_PATH_PATTERN = Pattern.compile("\\/([^\\/]+)\\/([^\\/]+)\\/([^\\/]+)");

  private static final String[] TFS_HOSTED_DOMAINS = new String[]{"visualstudio.com", "dev.azure.com"};
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  // Captures the following groups: (organization) (project) (repository)
  // Example: / (organization) / (project) / (repository)
  private static final Pattern TFS_DEVOPS_PATH_PATTERN = Pattern.compile("\\/([^\\/]+)\\/([^\\/]+)\\/([^\\/]+)");

  private static final String[] TFS_HOSTED_DOMAINS = new String[]{"visualstudio.com", "dev.azure.com"};
```

### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  // Example: (ssh) :// (test) @ (vs-ssh.visualstudio.com:22) (/DefaultCollection/Project/_ssh/Repository)
  private static final Pattern TFS_URL_PATTERN = Pattern.compile(
    "(?:(https?|ssh)\\:\\/\\/)?(?:([^@]+)@)?([^\\/\\:]+(?:\\:\\d+)?)(?:\\:v?\\d+)?(\\/.+)?"
  );

```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  // Example: (ssh) :// (test) @ (vs-ssh.visualstudio.com:22) (/DefaultCollection/Project/_ssh/Repository)
  private static final Pattern TFS_URL_PATTERN = Pattern.compile(
    "(?:(https?|ssh)\\:\\/\\/)?(?:([^@]+)@)?([^\\/\\:]+(?:\\:\\d+)?)(?:\\:v?\\d+)?(\\/.+)?"
  );

```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  // Example: (ssh) :// (test) @ (vs-ssh.visualstudio.com:22) (/DefaultCollection/Project/_ssh/Repository)
  private static final Pattern TFS_URL_PATTERN = Pattern.compile(
    "(?:(https?|ssh)\\:\\/\\/)?(?:([^@]+)@)?([^\\/\\:]+(?:\\:\\d+)?)(?:\\:v?\\d+)?(\\/.+)?"
  );

```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  // Example: (ssh) :// (test) @ (vs-ssh.visualstudio.com:22) (/DefaultCollection/Project/_ssh/Repository)
  private static final Pattern TFS_URL_PATTERN = Pattern.compile(
    "(?:(https?|ssh)\\:\\/\\/)?(?:([^@]+)@)?([^\\/\\:]+(?:\\:\\d+)?)(?:\\:v?\\d+)?(\\/.+)?"
  );

```

### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  // Example: (ssh) :// (test) @ (vs-ssh.visualstudio.com:22) (/DefaultCollection/Project/_ssh/Repository)
  private static final Pattern TFS_URL_PATTERN = Pattern.compile(
    "(?:(https?|ssh)\\:\\/\\/)?(?:([^@]+)@)?([^\\/\\:]+(?:\\:\\d+)?)(?:\\:v?\\d+)?(\\/.+)?"
  );

```

### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  // Example: (ssh) :// (test) @ (vs-ssh.visualstudio.com:22) (/DefaultCollection/Project/_ssh/Repository)
  private static final Pattern TFS_URL_PATTERN = Pattern.compile(
    "(?:(https?|ssh)\\:\\/\\/)?(?:([^@]+)@)?([^\\/\\:]+(?:\\:\\d+)?)(?:\\:v?\\d+)?(\\/.+)?"
  );

```

### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  // Example: (ssh) :// (test) @ (vs-ssh.visualstudio.com:22) (/DefaultCollection/Project/_ssh/Repository)
  private static final Pattern TFS_URL_PATTERN = Pattern.compile(
    "(?:(https?|ssh)\\:\\/\\/)?(?:([^@]+)@)?([^\\/\\:]+(?:\\:\\d+)?)(?:\\:v?\\d+)?(\\/.+)?"
  );

```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  // Example: (ssh) :// (test) @ (vs-ssh.visualstudio.com:22) (/DefaultCollection/Project/_ssh/Repository)
  private static final Pattern TFS_URL_PATTERN = Pattern.compile(
    "(?:(https?|ssh)\\:\\/\\/)?(?:([^@]+)@)?([^\\/\\:]+(?:\\:\\d+)?)(?:\\:v?\\d+)?(\\/.+)?"
  );

```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritClientBase.java`
#### Snippet
```java
abstract class GerritClientBase implements GerritClient {

  private static final Pattern ESCAPE_PATTERN = Pattern.compile("[\\\\\\\"]");
  private static final String USE_VERIFIED_OPTION= "$verified-option";
  private final Gson myGson = new Gson();
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java

  // Captures pull request identifier. Example: refs/pull/1/merge
  private static final Pattern TFS_GIT_PULL_REQUEST_PATTERN = Pattern.compile("^refs\\/pull\\/(\\d+)/merge");

  private final CommitStatusesCache<CommitStatus> myStatusesCache;
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java

  // Captures pull request identifier. Example: refs/pull/1/merge
  private static final Pattern TFS_GIT_PULL_REQUEST_PATTERN = Pattern.compile("^refs\\/pull\\/(\\d+)/merge");

  private final CommitStatusesCache<CommitStatus> myStatusesCache;
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
class StashPublisher extends HttpBasedCommitStatusPublisher<StashBuildStatus> {
  public static final String PROP_PUBLISH_QUEUED_BUILD_STATUS = "teamcity.stashCommitStatusPublisher.publishQueuedBuildStatus";
  private static final Pattern PULL_REQUEST_BRANCH_PATTERN = Pattern.compile("^refs\\/pull\\-requests\\/(\\d+)\\/from");
  private static final String SERVER_VERSION_BUILD_SERVER_HWM = "7.4";
  private static final String SERVER_VERSION_EXTENDED_SERVER_LWM = "7.14.0";
```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
class StashPublisher extends HttpBasedCommitStatusPublisher<StashBuildStatus> {
  public static final String PROP_PUBLISH_QUEUED_BUILD_STATUS = "teamcity.stashCommitStatusPublisher.publishQueuedBuildStatus";
  private static final Pattern PULL_REQUEST_BRANCH_PATTERN = Pattern.compile("^refs\\/pull\\-requests\\/(\\d+)\\/from");
  private static final String SERVER_VERSION_BUILD_SERVER_HWM = "7.4";
  private static final String SERVER_VERSION_EXTENDED_SERVER_LWM = "7.14.0";
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
class StashPublisher extends HttpBasedCommitStatusPublisher<StashBuildStatus> {
  public static final String PROP_PUBLISH_QUEUED_BUILD_STATUS = "teamcity.stashCommitStatusPublisher.publishQueuedBuildStatus";
  private static final Pattern PULL_REQUEST_BRANCH_PATTERN = Pattern.compile("^refs\\/pull\\-requests\\/(\\d+)\\/from");
  private static final String SERVER_VERSION_BUILD_SERVER_HWM = "7.4";
  private static final String SERVER_VERSION_EXTENDED_SERVER_LWM = "7.14.0";
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
class StashPublisher extends HttpBasedCommitStatusPublisher<StashBuildStatus> {
  public static final String PROP_PUBLISH_QUEUED_BUILD_STATUS = "teamcity.stashCommitStatusPublisher.publishQueuedBuildStatus";
  private static final Pattern PULL_REQUEST_BRANCH_PATTERN = Pattern.compile("^refs\\/pull\\-requests\\/(\\d+)\\/from");
  private static final String SERVER_VERSION_BUILD_SERVER_HWM = "7.4";
  private static final String SERVER_VERSION_EXTENDED_SERVER_LWM = "7.14.0";
```

## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'CommitStatusPublisherProblems'#treeend

*** ** * ** ***

|------------------------------------------|---|-----------|
| **CommitStatusPublisherProblems(...):**  |   | **Bean:** |
| SystemProblemNotification systemProblems |   | **???**   |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <mvc:annotation-driven/>

  <bean id="problems" class="jetbrains.buildServer.commitPublisher.CommitStatusPublisherProblems"/>
  <bean id="voterBuildFeature" class="jetbrains.buildServer.commitPublisher.CommitStatusPublisherFeature"/>
  <bean id="voterBuildListener" class="jetbrains.buildServer.commitPublisher.CommitStatusPublisherListener"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'CommitStatusPublisherListener'#treeend

*** ** * ** ***

|-----------------------------------------------|---|----------------------------------------------------|
| **CommitStatusPublisherListener(...):**       |   | **Bean:**                                          |
| EventDispatcher\<BuildServerListener\> events |   | **???**                                            |
| PublisherManager voterManager                 |   | Autowired: null(PublisherManager)                  |
| BuildHistory buildHistory                     |   | **???**                                            |
| BuildsManager buildsManager                   |   | **???**                                            |
| BuildPromotionManager buildPromotionManager   |   | **???**                                            |
| CommitStatusPublisherProblems problems        |   | Autowired: problems(CommitStatusPublisherProblems) |
| ServerResponsibility serverResponsibility     |   | **???**                                            |
| ExecutorServices executorServices             |   | **???**                                            |
| ProjectManager projectManager                 |   | **???**                                            |
| TeamCityNodes teamCityNodes                   |   | **???**                                            |
| UserModel userModel                           |   | **???**                                            |
| MultiNodeTasks multiNodeTasks                 |   | **???**                                            |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean id="problems" class="jetbrains.buildServer.commitPublisher.CommitStatusPublisherProblems"/>
  <bean id="voterBuildFeature" class="jetbrains.buildServer.commitPublisher.CommitStatusPublisherFeature"/>
  <bean id="voterBuildListener" class="jetbrains.buildServer.commitPublisher.CommitStatusPublisherListener"/>
  <bean id="voterSettingsController" class="jetbrains.buildServer.commitPublisher.PublisherSettingsController"/>
  <bean class="jetbrains.buildServer.commitPublisher.CommitStatusPublisherFeatureController"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'PublisherSettingsController'#treeend

*** ** * ** ***

|----------------------------------------|---|-----------------------------------|
| **PublisherSettingsController(...):**  |   | **Bean:**                         |
| WebControllerManager controllerManager |   | **???**                           |
| PluginDescriptor descriptor            |   | **???**                           |
| PublisherManager publisherManager      |   | Autowired: null(PublisherManager) |
| ProjectManager projectManager          |   | **???**                           |
| SecurityContext securityContext        |   | **???**                           |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean id="voterBuildFeature" class="jetbrains.buildServer.commitPublisher.CommitStatusPublisherFeature"/>
  <bean id="voterBuildListener" class="jetbrains.buildServer.commitPublisher.CommitStatusPublisherListener"/>
  <bean id="voterSettingsController" class="jetbrains.buildServer.commitPublisher.PublisherSettingsController"/>
  <bean class="jetbrains.buildServer.commitPublisher.CommitStatusPublisherFeatureController"/>
  <bean class="jetbrains.buildServer.commitPublisher.PublisherManager"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'CommitStatusPublisherFeatureController'#treeend

*** ** * ** ***

|---------------------------------------------------------|---|-----------------------------------------------------------------|
| **CommitStatusPublisherFeatureController(...):**        |   | **Bean:**                                                       |
| ProjectManager projectManager                           |   | **???**                                                         |
| WebControllerManager controllerManager                  |   | **???**                                                         |
| PluginDescriptor descriptor                             |   | **???**                                                         |
| PublisherManager publisherManager                       |   | Autowired: null(PublisherManager)                               |
| PublisherSettingsController publisherSettingsController |   | Autowired: voterSettingsController(PublisherSettingsController) |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean id="voterBuildListener" class="jetbrains.buildServer.commitPublisher.CommitStatusPublisherListener"/>
  <bean id="voterSettingsController" class="jetbrains.buildServer.commitPublisher.PublisherSettingsController"/>
  <bean class="jetbrains.buildServer.commitPublisher.CommitStatusPublisherFeatureController"/>
  <bean class="jetbrains.buildServer.commitPublisher.PublisherManager"/>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'PublisherManager'#treeend

*** ** * ** ***

|---------------------------------|---|-----------|
| **PublisherManager(...):**      |   | **Bean:** |
| ExtensionHolder extensionHolder |   | **???**   |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean id="voterSettingsController" class="jetbrains.buildServer.commitPublisher.PublisherSettingsController"/>
  <bean class="jetbrains.buildServer.commitPublisher.CommitStatusPublisherFeatureController"/>
  <bean class="jetbrains.buildServer.commitPublisher.PublisherManager"/>

  <bean class="jetbrains.buildServer.commitPublisher.stash.StashSettings"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'StashSettings'#treeend

*** ** * ** ***

|-------------------------------------------------|---|----------------------------------------------------|
| **StashSettings(...):**                         |   | **Bean:**                                          |
| PluginDescriptor descriptor                     |   | **???**                                            |
| WebLinks links                                  |   | **???**                                            |
| CommitStatusPublisherProblems problems          |   | Autowired: problems(CommitStatusPublisherProblems) |
| SSLTrustStoreProvider trustStoreProvider        |   | **???**                                            |
| OAuthConnectionsManager oAuthConnectionsManager |   | **???**                                            |
| OAuthTokensStorage oAuthTokensStorage           |   | **???**                                            |
| UserModel userModel                             |   | **???**                                            |
| SecurityContext securityContext                 |   | **???**                                            |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.commitPublisher.PublisherManager"/>

  <bean class="jetbrains.buildServer.commitPublisher.stash.StashSettings"/>
  <bean class="jetbrains.buildServer.commitPublisher.bitbucketCloud.BitbucketCloudSettings"/>
  <bean class="jetbrains.buildServer.commitPublisher.gerrit.GerritSettings"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'BitbucketCloudSettings'#treeend

*** ** * ** ***

|-------------------------------------------------|---|----------------------------------------------------|
| **BitbucketCloudSettings(...):**                |   | **Bean:**                                          |
| PluginDescriptor descriptor                     |   | **???**                                            |
| WebLinks links                                  |   | **???**                                            |
| CommitStatusPublisherProblems problems          |   | Autowired: problems(CommitStatusPublisherProblems) |
| SSLTrustStoreProvider trustStoreProvider        |   | **???**                                            |
| OAuthConnectionsManager oAuthConnectionsManager |   | **???**                                            |
| OAuthTokensStorage oAuthTokensStorage           |   | **???**                                            |
| UserModel userModel                             |   | **???**                                            |
| SecurityContext securityContext                 |   | **???**                                            |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java

  <bean class="jetbrains.buildServer.commitPublisher.stash.StashSettings"/>
  <bean class="jetbrains.buildServer.commitPublisher.bitbucketCloud.BitbucketCloudSettings"/>
  <bean class="jetbrains.buildServer.commitPublisher.gerrit.GerritSettings"/>
  <bean class="jetbrains.buildServer.commitPublisher.gerrit.GerritClientImpl"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GerritSettings'#treeend

*** ** * ** ***

|------------------------------------------|---|----------------------------------------------------|
| **GerritSettings(...):**                 |   | **Bean:**                                          |
| PluginDescriptor descriptor              |   | **???**                                            |
| ExtensionHolder extensionHolder          |   | **???**                                            |
| GerritClient gerritClient                |   | Autowired: null(GerritClientImpl)                  |
| WebLinks links                           |   | **???**                                            |
| CommitStatusPublisherProblems problems   |   | Autowired: problems(CommitStatusPublisherProblems) |
| SSLTrustStoreProvider trustStoreProvider |   | **???**                                            |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.commitPublisher.stash.StashSettings"/>
  <bean class="jetbrains.buildServer.commitPublisher.bitbucketCloud.BitbucketCloudSettings"/>
  <bean class="jetbrains.buildServer.commitPublisher.gerrit.GerritSettings"/>
  <bean class="jetbrains.buildServer.commitPublisher.gerrit.GerritClientImpl"/>
  <bean class="jetbrains.buildServer.commitPublisher.gitlab.GitlabSettings"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GerritClientImpl'#treeend

*** ** * ** ***

|---------------------------------|---|-----------|
| **GerritClientImpl(...):**      |   | **Bean:** |
| ExtensionHolder extensionHolder |   | **???**   |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.commitPublisher.bitbucketCloud.BitbucketCloudSettings"/>
  <bean class="jetbrains.buildServer.commitPublisher.gerrit.GerritSettings"/>
  <bean class="jetbrains.buildServer.commitPublisher.gerrit.GerritClientImpl"/>
  <bean class="jetbrains.buildServer.commitPublisher.gitlab.GitlabSettings"/>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitlabSettings'#treeend

*** ** * ** ***

|-------------------------------------------------|---|----------------------------------------------------|
| **GitlabSettings(...):**                        |   | **Bean:**                                          |
| PluginDescriptor descriptor                     |   | **???**                                            |
| WebLinks links                                  |   | **???**                                            |
| CommitStatusPublisherProblems problems          |   | Autowired: problems(CommitStatusPublisherProblems) |
| SSLTrustStoreProvider trustStoreProvider        |   | **???**                                            |
| VcsModificationHistoryEx vcsModificationHistory |   | **???**                                            |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.commitPublisher.gerrit.GerritSettings"/>
  <bean class="jetbrains.buildServer.commitPublisher.gerrit.GerritClientImpl"/>
  <bean class="jetbrains.buildServer.commitPublisher.gitlab.GitlabSettings"/>

  <!-- github -->
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'ChangeStatusUpdater'#treeend

*** ** * ** ***

|-----------------------------------------------|---|---------------------------------------|
| **ChangeStatusUpdater(...):**                 |   | **Bean:**                             |
| GitHubApiFactory factory                      |   | Autowired: null(GitHubApiFactoryImpl) |
| VcsModificationHistory vcsModificationHistory |   | **???**                               |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java

  <!-- github -->
  <bean class="jetbrains.buildServer.commitPublisher.github.ChangeStatusUpdater"/>
  <bean class="jetbrains.buildServer.commitPublisher.github.api.impl.GitHubApiFactoryImpl"/>
  <bean class="jetbrains.buildServer.commitPublisher.github.api.impl.HttpClientWrapperImpl"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitHubApiFactoryImpl'#treeend

*** ** * ** ***

|--------------------------------------------|---|----------------------------------------|
| **GitHubApiFactoryImpl(...):**             |   | **Bean:**                              |
| HttpClientWrapper wrapper                  |   | Autowired: null(HttpClientWrapperImpl) |
| OAuthTokensStorage oAuthTokensStorage      |   | **???**                                |
| OAuthConnectionsManager connectionsManager |   | **???**                                |
| ProjectManager projectManager              |   | **???**                                |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <!-- github -->
  <bean class="jetbrains.buildServer.commitPublisher.github.ChangeStatusUpdater"/>
  <bean class="jetbrains.buildServer.commitPublisher.github.api.impl.GitHubApiFactoryImpl"/>
  <bean class="jetbrains.buildServer.commitPublisher.github.api.impl.HttpClientWrapperImpl"/>
  <bean class="jetbrains.buildServer.commitPublisher.github.GitHubSettings"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'HttpClientWrapperImpl'#treeend

*** ** * ** ***

|---------------------------------------------|---|-----------|
| **HttpClientWrapperImpl(...):**             |   | **Bean:** |
| RequestHandler requestHandler               |   | **???**   |
| SSLTrustStoreProvider sslTrustStoreProvider |   | **???**   |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.commitPublisher.github.ChangeStatusUpdater"/>
  <bean class="jetbrains.buildServer.commitPublisher.github.api.impl.GitHubApiFactoryImpl"/>
  <bean class="jetbrains.buildServer.commitPublisher.github.api.impl.HttpClientWrapperImpl"/>
  <bean class="jetbrains.buildServer.commitPublisher.github.GitHubSettings"/>
  <bean class="jetbrains.buildServer.commitPublisher.github.reports.SecurityParametersReport"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitHubSettings'#treeend

*** ** * ** ***

|-------------------------------------------------|---|----------------------------------------------------|
| **GitHubSettings(...):**                        |   | **Bean:**                                          |
| ChangeStatusUpdater updater                     |   | Autowired: null(ChangeStatusUpdater)               |
| PluginDescriptor descriptor                     |   | **???**                                            |
| WebLinks links                                  |   | **???**                                            |
| CommitStatusPublisherProblems problems          |   | Autowired: problems(CommitStatusPublisherProblems) |
| OAuthConnectionsManager oauthConnectionsManager |   | **???**                                            |
| OAuthTokensStorage oauthTokensStorage           |   | **???**                                            |
| SecurityContext securityContext                 |   | **???**                                            |
| SSLTrustStoreProvider trustStoreProvider        |   | **???**                                            |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.commitPublisher.github.api.impl.GitHubApiFactoryImpl"/>
  <bean class="jetbrains.buildServer.commitPublisher.github.api.impl.HttpClientWrapperImpl"/>
  <bean class="jetbrains.buildServer.commitPublisher.github.GitHubSettings"/>
  <bean class="jetbrains.buildServer.commitPublisher.github.reports.SecurityParametersReport"/>
  <bean class="jetbrains.buildServer.commitPublisher.github.reports.SecurityParametersReportPageExtension"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SecurityParametersReportPageExtension'#treeend

*** ** * ** ***

|-------------------------------------------------|---|-------------------------------------------|
| **SecurityParametersReportPageExtension(...):** |   | **Bean:**                                 |
| PagePlaces pagePlaces                           |   | **???**                                   |
| SecurityParametersReport report                 |   | Autowired: null(SecurityParametersReport) |
| PluginDescriptor pluginDescriptor               |   | **???**                                   |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.commitPublisher.github.GitHubSettings"/>
  <bean class="jetbrains.buildServer.commitPublisher.github.reports.SecurityParametersReport"/>
  <bean class="jetbrains.buildServer.commitPublisher.github.reports.SecurityParametersReportPageExtension"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.MissingVcsRootsReport"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.MissingVcsRootsReportPageExtension"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'MissingVcsRootsReport'#treeend

*** ** * ** ***

|---------------------------------|---|-----------|
| **MissingVcsRootsReport(...):** |   | **Bean:** |
| ProjectManager projectManager   |   | **???**   |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.commitPublisher.github.reports.SecurityParametersReport"/>
  <bean class="jetbrains.buildServer.commitPublisher.github.reports.SecurityParametersReportPageExtension"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.MissingVcsRootsReport"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.MissingVcsRootsReportPageExtension"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.NoFQDNServerUrlReport"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'MissingVcsRootsReportPageExtension'#treeend

*** ** * ** ***

|----------------------------------------------|---|----------------------------------------|
| **MissingVcsRootsReportPageExtension(...):** |   | **Bean:**                              |
| PagePlaces pagePlaces                        |   | **???**                                |
| MissingVcsRootsReport report                 |   | Autowired: null(MissingVcsRootsReport) |
| PluginDescriptor pluginDescriptor            |   | **???**                                |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.commitPublisher.github.reports.SecurityParametersReportPageExtension"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.MissingVcsRootsReport"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.MissingVcsRootsReportPageExtension"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.NoFQDNServerUrlReport"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.NoFQDNServerUrlReportPageExtension"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'NoFQDNServerUrlReport'#treeend

*** ** * ** ***

|-----------------------------------|---|-----------------------------------|
| **NoFQDNServerUrlReport(...):**   |   | **Bean:**                         |
| PublisherManager publisherManager |   | Autowired: null(PublisherManager) |
| WebLinks links                    |   | **???**                           |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.commitPublisher.reports.MissingVcsRootsReport"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.MissingVcsRootsReportPageExtension"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.NoFQDNServerUrlReport"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.NoFQDNServerUrlReportPageExtension"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.DeprecatedAuthReport"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'NoFQDNServerUrlReportPageExtension'#treeend

*** ** * ** ***

|----------------------------------------------|---|----------------------------------------|
| **NoFQDNServerUrlReportPageExtension(...):** |   | **Bean:**                              |
| PagePlaces pagePlaces                        |   | **???**                                |
| NoFQDNServerUrlReport report                 |   | Autowired: null(NoFQDNServerUrlReport) |
| PluginDescriptor pluginDescriptor            |   | **???**                                |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.commitPublisher.reports.MissingVcsRootsReportPageExtension"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.NoFQDNServerUrlReport"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.NoFQDNServerUrlReportPageExtension"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.DeprecatedAuthReport"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.DeprecatedAuthReportPageExtension"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'DeprecatedAuthReportPageExtension'#treeend

*** ** * ** ***

|---------------------------------------------|---|---------------------------------------|
| **DeprecatedAuthReportPageExtension(...):** |   | **Bean:**                             |
| PagePlaces pagePlaces                       |   | **???**                               |
| DeprecatedAuthReport report                 |   | Autowired: null(DeprecatedAuthReport) |
| PluginDescriptor pluginDescriptor           |   | **???**                               |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.commitPublisher.reports.NoFQDNServerUrlReportPageExtension"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.DeprecatedAuthReport"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.DeprecatedAuthReportPageExtension"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.MissingSettingsReport"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.MissingSettingsReportPageExtension"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'MissingSettingsReportPageExtension'#treeend

*** ** * ** ***

|----------------------------------------------|---|----------------------------------------|
| **MissingSettingsReportPageExtension(...):** |   | **Bean:**                              |
| PagePlaces pagePlaces                        |   | **???**                                |
| MissingSettingsReport report                 |   | Autowired: null(MissingSettingsReport) |
| PluginDescriptor pluginDescriptor            |   | **???**                                |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.commitPublisher.reports.DeprecatedAuthReportPageExtension"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.MissingSettingsReport"/>
  <bean class="jetbrains.buildServer.commitPublisher.reports.MissingSettingsReportPageExtension"/>

  <!-- upsource -->
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'UpsourceSettings'#treeend

*** ** * ** ***

|------------------------------------------|---|----------------------------------------------------|
| **UpsourceSettings(...):**               |   | **Bean:**                                          |
| VcsModificationHistory vcsHistory        |   | **???**                                            |
| PluginDescriptor descriptor              |   | **???**                                            |
| WebLinks links                           |   | **???**                                            |
| CommitStatusPublisherProblems problems   |   | Autowired: problems(CommitStatusPublisherProblems) |
| SSLTrustStoreProvider trustStoreProvider |   | **???**                                            |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java

  <!-- upsource -->
  <bean class="jetbrains.buildServer.commitPublisher.upsource.UpsourceSettings"/>

  <!-- tfs -->
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'TfsPublisherSettings'#treeend

*** ** * ** ***

|-------------------------------------------------|---|----------------------------------------------------|
| **TfsPublisherSettings(...):**                  |   | **Bean:**                                          |
| PluginDescriptor descriptor                     |   | **???**                                            |
| WebLinks links                                  |   | **???**                                            |
| CommitStatusPublisherProblems problems          |   | Autowired: problems(CommitStatusPublisherProblems) |
| OAuthConnectionsManager oauthConnectionsManager |   | **???**                                            |
| OAuthTokensStorage oauthTokensStorage           |   | **???**                                            |
| SecurityContext securityContext                 |   | **???**                                            |
| SSLTrustStoreProvider trustStoreProvider        |   | **???**                                            |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java

  <!-- tfs -->
  <bean class="jetbrains.buildServer.commitPublisher.tfs.TfsPublisherSettings"/>

  <!-- space -->
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SpaceSettings'#treeend

*** ** * ** ***

|-------------------------------------------------|---|----------------------------------------------------|
| **SpaceSettings(...):**                         |   | **Bean:**                                          |
| PluginDescriptor descriptor                     |   | **???**                                            |
| WebLinks links                                  |   | **???**                                            |
| CommitStatusPublisherProblems problems          |   | Autowired: problems(CommitStatusPublisherProblems) |
| SSLTrustStoreProvider trustStoreProvider        |   | **???**                                            |
| OAuthConnectionsManager oAuthConnectionsManager |   | **???**                                            |
| OAuthTokensStorage oauthTokensStorage           |   | **???**                                            |
| SecurityContext securityContext                 |   | **???**                                            |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java

  <!-- space -->
  <bean class="jetbrains.buildServer.commitPublisher.space.SpaceSettings"/>

  <!-- Perforce Swarm -->
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SwarmClientManager'#treeend

*** ** * ** ***

|------------------------------------------|---|-----------|
| **SwarmClientManager(...):**             |   | **Bean:** |
| RelativeWebLinks webLinks                |   | **???**   |
| SSLTrustStoreProvider trustStoreProvider |   | **???**   |
| ResetCacheRegister cacheReset            |   | **???**   |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java

  <!-- Perforce Swarm -->
  <bean class="jetbrains.buildServer.swarm.SwarmClientManager"/>
  <bean class="jetbrains.buildServer.swarm.commitPublisher.SwarmPublisherSettings"/>
  <bean class="jetbrains.buildServer.swarm.web.SwarmBuildPageExtension"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SwarmPublisherSettings'#treeend

*** ** * ** ***

|------------------------------------------|---|----------------------------------------------------|
| **SwarmPublisherSettings(...):**         |   | **Bean:**                                          |
| PluginDescriptor descriptor              |   | **???**                                            |
| WebLinks links                           |   | **???**                                            |
| CommitStatusPublisherProblems problems   |   | Autowired: problems(CommitStatusPublisherProblems) |
| SSLTrustStoreProvider trustStoreProvider |   | **???**                                            |
| SwarmClientManager clientManager         |   | Autowired: null(SwarmClientManager)                |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <!-- Perforce Swarm -->
  <bean class="jetbrains.buildServer.swarm.SwarmClientManager"/>
  <bean class="jetbrains.buildServer.swarm.commitPublisher.SwarmPublisherSettings"/>
  <bean class="jetbrains.buildServer.swarm.web.SwarmBuildPageExtension"/>
  <bean class="jetbrains.buildServer.swarm.web.SwarmChangeLinkExtension"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SwarmBuildPageExtension'#treeend

*** ** * ** ***

|-----------------------------------|---|-------------------------------------|
| **SwarmBuildPageExtension(...):** |   | **Bean:**                           |
| SBuildServer server               |   | **???**                             |
| WebControllerManager manager      |   | **???**                             |
| PluginDescriptor desc             |   | **???**                             |
| SwarmClientManager swarmClients   |   | Autowired: null(SwarmClientManager) |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.swarm.SwarmClientManager"/>
  <bean class="jetbrains.buildServer.swarm.commitPublisher.SwarmPublisherSettings"/>
  <bean class="jetbrains.buildServer.swarm.web.SwarmBuildPageExtension"/>
  <bean class="jetbrains.buildServer.swarm.web.SwarmChangeLinkExtension"/>
  <bean class="jetbrains.buildServer.swarm.web.SwarmController"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SwarmChangeLinkExtension'#treeend

*** ** * ** ***

|------------------------------------|---|-------------------------------------|
| **SwarmChangeLinkExtension(...):** |   | **Bean:**                           |
| PagePlaces pagePlaces              |   | **???**                             |
| SwarmClientManager swarmClients    |   | Autowired: null(SwarmClientManager) |
| ProjectManager projectManager      |   | **???**                             |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.swarm.commitPublisher.SwarmPublisherSettings"/>
  <bean class="jetbrains.buildServer.swarm.web.SwarmBuildPageExtension"/>
  <bean class="jetbrains.buildServer.swarm.web.SwarmChangeLinkExtension"/>
  <bean class="jetbrains.buildServer.swarm.web.SwarmController"/>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SwarmController'#treeend

*** ** * ** ***

|-------------------------------------------------|---|------------------------------------------|
| **SwarmController(...):**                       |   | **Bean:**                                |
| SwarmBuildPageExtension swarmBuildPageExtension |   | Autowired: null(SwarmBuildPageExtension) |
| BuildsManager buildManager                      |   | **???**                                  |
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.swarm.web.SwarmBuildPageExtension"/>
  <bean class="jetbrains.buildServer.swarm.web.SwarmChangeLinkExtension"/>
  <bean class="jetbrains.buildServer.swarm.web.SwarmController"/>

  <bean class="jetbrains.buildServer.commitPublisher.ServerListener">
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/RevisionStatus.java`
#### Snippet
```java
        return myIsSameBuildType && CommitStatusPublisher.Event.QUEUED == myTriggeredEvent;
      case REMOVED_FROM_QUEUE:
        return myIsSameBuildType && CommitStatusPublisher.Event.QUEUED == myTriggeredEvent;
      case STARTED:
      case FINISHED:
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpaceSettings.java`
#### Snippet
```java
      sb.append(" with no credentials type provided!");
    else {
      switch (credentialsType) {
        case Constants.SPACE_CREDENTIALS_CONNECTION:
          sb.append(" using JetBrains Space connection");
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpaceUtils.java`
#### Snippet
```java
    String credentialsType = params.get(Constants.SPACE_CREDENTIALS_TYPE);

    switch (credentialsType) {
      case Constants.SPACE_CREDENTIALS_CONNECTION:
        OAuthConnectionDescriptor oAuthConnectionDescriptor = oAuthConnectionsManager.findConnectionById(project, params.get(Constants.SPACE_CONNECTION_ID));
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
      SBuildType buildType = myBuildPromotion.getBuildType();
      if (buildType != null) {
        SBuild associatedBuild = myBuildPromotion.getAssociatedBuild();
        String suffix = associatedBuild != null ? " #" + associatedBuild.getBuildNumber() : "";
        return buildType.getFullName() + suffix;
      }
      return myBuildPromotion.getBuildTypeExternalId();
```

### DuplicatedCode
Duplicated code
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabPublisher.java`
#### Snippet
```java
    VcsRootInstance root = revision.getRoot();
    String apiUrl = getApiUrl();
    if (null == apiUrl || apiUrl.length() == 0)
      throw new PublisherException("Missing GitLab API URL parameter");
    String pathPrefix = GitlabSettings.getPathPrefix(apiUrl);
    Repository repository = parseRepository(root, pathPrefix);
    if (repository == null)
      throw new PublisherException("Cannot parse repository URL from VCS root " + root.getName());
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder command` can be replaced with 'String'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritClientBase.java`
#### Snippet
```java
    throws Exception {

    StringBuilder command = new StringBuilder();
    command.append("gerrit review --project ").append(connectionDetails.getGerritProject())
           .append(buildVoteClause(label)).append(vote)
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubSettings.java`
#### Snippet
```java

        if (!checkNotEmpty(p, c.getServerKey(), "GitHub API URL must be specified", result)) {
          final String url = "" + p.get(c.getServerKey());
          if (!ReferencesResolverUtil.mayContainReference(url) && !(url.startsWith("http://") || url.startsWith("https://"))) {
            result.add(new InvalidProperty(c.getServerKey(), "GitHub API URL should start with http:// or https://"));
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritClientImpl.java`
#### Snippet
```java
      LOG.warn("Could not find 'jetbrains.buildServer.util.jsch.JSchConfigInitializer' class in the classpath, skip JSch config initialization");
    } catch (NoSuchMethodException e) {
      LOG.warn("Could not find initJSchConfig method in 'jetbrains.buildServer.util.jsch.JSchConfigInitializer' class, skip JSch config initialization, error: " + e.toString());
    } catch (Throwable e) {
      LOG.warn("Failed to perform JSch config initialization, error: " + e.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritClientImpl.java`
#### Snippet
```java
      LOG.warn("Could not find initJSchConfig method in 'jetbrains.buildServer.util.jsch.JSchConfigInitializer' class, skip JSch config initialization, error: " + e.toString());
    } catch (Throwable e) {
      LOG.warn("Failed to perform JSch config initialization, error: " + e.toString());
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashSettings.java`
#### Snippet
```java
          if (repoInfo.errors.size() > 1)
            pluralS = "s";
          throw new HttpPublisherException(String.format("Bitbucket Server publisher error%s:%s", pluralS, sb.toString()));
        }
      }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherProblems.java`
#### Snippet
```java
        errorDescription += " " + exMsg;
      } else {
        errorDescription += " " + t.toString();
      }
      logger.warnAndDebugDetails(logEntry, t);
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `SBuildPromotionRequestData` may be 'static'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
  }

  private class SBuildPromotionRequestData implements StatusRequestData {
    private final BuildPromotion myBuildPromotion;
    private final BuildRevision myRevision;
```

### InnerClassMayBeStatic
Inner class `BaseBuildData` may be 'static'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
  }

  private abstract class BaseBuildData implements StatusData {
    private final BuildRevision myRevision;
    private final StashBuildStatus myStatus;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/data/RepoRefInfo.java`
#### Snippet
```java
 */

/**
 * This class does not represent full repository information.
 */
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/ChangeStatusUpdater.java`
#### Snippet
```java

  private class GitHubStatusClient extends GitHubCommonStatusClient {
    private final boolean myAddComment = false;

    GitHubStatusClient(Map<String, String> params, GitHubPublisher publisher, @NotNull VcsRoot root) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritSettings.java`
#### Snippet
```java
public class GerritSettings extends BasePublisherSettings implements CommitStatusPublisherSettings {

  private final ExtensionHolder myExtensionHolder;
  private final Map<String, String> myMandatoryProperties = new HashMap<String, String>() {{
          put(Constants.GERRIT_SERVER, "Server URL");
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `isEnabled()` is identical to its super method
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritSettings.java`
#### Snippet
```java
  }

  public boolean isEnabled() {
    return true;
  }
```

### RedundantMethodOverride
Method `transformParameters()` is identical to its super method
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritSettings.java`
#### Snippet
```java
  @Nullable
  @Override
  public Map<String, String> transformParameters(@NotNull Map<String, String> params) {
    return null;
  }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'null != currentUser' covered by subsequent condition 'currentUser instanceof SUser'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubSettings.java`
#### Snippet
```java
          if (null != oauthUsername && null != oauthProviderId) {
            User currentUser = mySecurityContext.getAuthorityHolder().getAssociatedUser();
            if (null != currentUser && currentUser instanceof SUser) {
              for (OAuthToken token: myOAuthTokensStorage.getUserTokens(oauthProviderId, (SUser) currentUser, buildTypeOrTemplate.getProject(), false)) {
                if (token.getOauthLogin().equals(oauthUsername)) {
```

### ConditionCoveredByFurtherCondition
Condition 'currentUser != null' covered by subsequent condition 'currentUser instanceof SUser'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsPublisherSettings.java`
#### Snippet
```java
        if (authUsername != null && authProviderId != null) {
          final User currentUser = mySecurityContext.getAuthorityHolder().getAssociatedUser();
          if (currentUser != null && currentUser instanceof SUser) {
            for (OAuthToken token : myOAuthTokensStorage.getUserTokens(authProviderId, (SUser) currentUser, buildTypeOrTemplate.getProject(), false)) {
              if (token.getOauthLogin().equals(authUsername)) {
```

### ConditionCoveredByFurtherCondition
Condition 'event != null' covered by subsequent condition 'event == Event.STARTED'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java

      Event event = myLastEvents.get(promotion.getId());
      if (event != null && event == Event.STARTED) {
        eventProcessed(event);
        return;
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.Collections;`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/AuthTypeAwareSettings.java`
#### Snippet
```java

import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/GitHubApi.java`
#### Snippet
```java
   * @param hash commit hash
   * @return colleciton of commit parents
   * @throws IOException
   */
  @NotNull
```

### JavadocDeclaration
`@param build` tag description is missing
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/swarm/SwarmClientManager.java`
#### Snippet
```java
   * There could be several such SwarmClients as there could be several Swarm features for the configuration
   *
   * @param build
   * @return see above
   */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusesCache.java`
#### Snippet
```java
   * @param status   new value to be added to the cache
   * @param isMock   is it a mock for the missing value?
   * @return previous value in cache or null
   */
  private void putStatusToCache(@NotNull BuildRevision revision, @Nullable String prefix, @Nullable T status) {
```

### JavadocDeclaration
Tag `return` is not allowed here
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusesCache.java`
#### Snippet
```java
   * @param revision key for the cache
   * @param prefix business logic related key prefix for the cache
   * @return removed from the cache value
   */
  public void removeStatusFromCache(@NotNull BuildRevision revision, @Nullable String prefix) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `myGerritClient` may be 'final'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritSettings.java`
#### Snippet
```java
          put(TEAMCITY_SSH_KEY_PROP, "SSH key");
  }};
  private GerritClient myGerritClient;
  private static final Set<Event> mySupportedEvents = new HashSet<Event>() {{
    add(Event.FINISHED);
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `value` are queried, but never updated
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java

  private static class CommitsList {
    private List<Commit> value;
  }

```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2026` can be replaced with '...'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/data/CommitStatus.java`
#### Snippet
```java
    if (str == null) return null;
    if (str.length() > maxLength) {
      return str.substring(0, maxLength - 2) + "\u2026";
    }
    return str;
```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `commit-status-publisher-server/src/main/resources/META-INF/build-server-plugin-voter.xml`
#### Snippet
```java
        http://www.springframework.org/schema/mvc
        http://www.springframework.org/schema/mvc/spring-mvc-3.0.xsd"
       default-autowire="constructor">

  <mvc:annotation-driven/>
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/swarm/SwarmClientManager.java`
#### Snippet
```java
    @Override
    public List<String> listCaches() {
      return Arrays.asList(CACHE_NAME);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
      SVcsRootEx root = (SVcsRootEx)revision.getRoot().getParent();
      if (vcsRootId.equals(root.getExternalId()) || root.isAliasExternalId(vcsRootId) || vcsRootId.equals(String.valueOf(root.getId())))
        return Arrays.asList(revision);
    }

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `out` initializer `null` is redundant
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritClientImpl.java`
#### Snippet
```java
    ChannelExec channel = null;
    Session session = null;
    String out = null;
    try {
      JSch jsch = new JSch();
```

### UnusedAssignment
Variable `error` initializer `null` is redundant
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java
    }

    Error error = null;
    try {
      error = myGson.fromJson(content, Error.class);
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `unresolvedValue` is always 'null'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/VcsRootResolvingWrapper.java`
#### Snippet
```java
    String unresolvedValue = myVcsRoot.getProperty(propertyName);
    if (unresolvedValue == null) {
      return unresolvedValue;
    }
    return myValueResolver.resolve(unresolvedValue).getResult();
```

### ConstantValue
Condition `statuses.size == null` is always `false`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudPublisher.java`
#### Snippet
```java
      if (statuses != null && statuses.values != null && !statuses.values.isEmpty()) {
        result.addAll(statuses.values);
        shouldContinue = (statuses.size == null || result.size() < statuses.size) &&
                         result.size() < statusesThreshold &&
                         statuses.values.stream().noneMatch(status -> buildTypeId.equals(status.key));
```

### ConstantValue
Value `buildTypeOrTemplate` is always 'null'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/PublisherSettingsController.java`
#### Snippet
```java
      return ((SBuildType)buildTypeOrTemplate).getVcsRootInstanceForParent(sVcsRoot);
    } else {
      return new VcsRootResolvingWrapper(getValueResolver(buildTypeOrTemplate), sVcsRoot);
    }
  }
```

## RuleId[id=SuspiciousIndentAfterControlStatement]
### SuspiciousIndentAfterControlStatement
Suspicious indentation after 'if' statement
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabSettings.java`
#### Snippet
```java
    if (null == token || token.length() == 0)
      throw new PublisherException("Missing GitLab API access token");
      try {
        IOGuard.allowNetworkCall(() -> {
          ProjectInfoResponseProcessor processorPrj = new ProjectInfoResponseProcessor();
```

