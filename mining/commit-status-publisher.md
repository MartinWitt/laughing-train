# commit-status-publisher 
 
# Bad smells
I found 350 bad smells with 61 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 146 | false |
| RegExpRedundantEscape | 27 | false |
| MissortedModifiers | 25 | false |
| UnnecessaryModifier | 19 | true |
| CodeBlock2Expr | 18 | true |
| DoubleBraceInitialization | 16 | false |
| SetReplaceableByEnumSet | 15 | false |
| RedundantImplements | 13 | false |
| SizeReplaceableByIsEmpty | 11 | true |
| Convert2MethodRef | 8 | false |
| NestedAssignment | 5 | false |
| UnnecessaryToStringCall | 4 | true |
| BoundedWildcard | 4 | false |
| NonProtectedConstructorInAbstractClass | 4 | true |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| ConditionCoveredByFurtherCondition | 3 | false |
| DynamicRegexReplaceableByCompiledPattern | 3 | false |
| ConstantValue | 3 | false |
| InnerClassMayBeStatic | 2 | true |
| RedundantMethodOverride | 2 | false |
| RedundantFieldInitialization | 2 | false |
| AssignmentToMethodParameter | 2 | false |
| UnusedAssignment | 2 | false |
| FieldMayBeStatic | 1 | false |
| UnnecessarySemicolon | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| TrivialStringConcatenation | 1 | false |
| UnnecessaryBoxing | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| Convert2Lambda | 1 | false |
| InstanceofCatchParameter | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
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
Modifier `static` is redundant for inner enums
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java
  }

  static enum StatusState {
    @SerializedName("pending")
    Pending("pending"),
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
Modifier `public` is redundant for interface members
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherSettings.java`
#### Snippet
```java
  boolean isPublishingForVcsRoot(VcsRoot vcsRoot);

  public boolean isEventSupported(Event event, final SBuildType buildType, final Map<String, String> params);

  boolean isTestConnectionSupported();
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `myAddComment` may be 'static'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/ChangeStatusUpdater.java`
#### Snippet
```java

  private class GitHubStatusClient extends GitHubCommonStatusClient {
    private final boolean myAddComment = false;

    GitHubStatusClient(Map<String, String> params, GitHubPublisher publisher) {
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `SpaceUtils` has only 'static' members, and lacks a 'private' constructor
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpaceUtils.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class SpaceUtils {
  private static final GitRepositoryParser VCS_URL_PARSER = new GitRepositoryParser();

```

### UtilityClassWithoutPrivateConstructor
Class `SpaceApiUrls` has only 'static' members, and lacks a 'private' constructor
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpaceApiUrls.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class SpaceApiUrls {
  static private final String HTTP_API_PART = "api/http";
  static private final String COMMIT_STATUS_PART = "commit-statuses";
```

### UtilityClassWithoutPrivateConstructor
Class `LoggerUtil` has only 'static' members, and lacks a 'private' constructor
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/LoggerUtil.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class LoggerUtil {

  public static final String LOG_CATEGORY = "jetbrains.buildServer.COMMIT_STATUS";
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/GitHubApiAuthenticationType.java`
#### Snippet
```java

  STORED_TOKEN("storedToken");
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

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/swarm/ReviewLoadResponse.java`
#### Snippet
```java
  public List<Long> getOpenReviewIds() {
    return myReviews.stream()
                    .filter((r) -> r.isOpen())
                    .map((r) -> r.getId())
                    .collect(Collectors.toList());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/swarm/ReviewLoadResponse.java`
#### Snippet
```java
    return myReviews.stream()
                    .filter((r) -> r.isOpen())
                    .map((r) -> r.getId())
                    .collect(Collectors.toList());
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudBuildStatus.java`
#### Snippet
```java
  SUCCESSFUL, FAILED, INPROGRESS, STOPPED;

  private static final Map<String, BitbucketCloudBuildStatus> INDEX = Arrays.stream(values()).collect(Collectors.toMap(val -> val.name(), Function.identity()));

  @Nullable
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/swarm/web/SwarmBuildDataBean.java`
#### Snippet
```java

    public List<Long> getReviewIds() {
      return myReviews.stream().map((r) -> r.getId()).sorted().collect(Collectors.toList());
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java
          exceptionRef.set(new IOException(getErrorMessage(response, null)));
        },
        e -> exceptionRef.set(e));
    });

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java
                   },
                   e -> {
                     exceptionRef.set(e);
                   }
      );
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java
          exceptionRef.set(new IOException(getErrorMessage(response, additionalComment)));
        },
        e -> exceptionRef.set(e));
    });

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java
                     exceptionRef.set(new IOException(getErrorMessage(response, null)));
                   },
                   e -> exceptionRef.set(e));
    });

```

## RuleId[id=RegExpRedundantEscape]
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
Redundant character escape `\\|` in RegExp
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/upsource/UpsourcePublisher.java`
#### Snippet
```java
  private final VcsModificationHistory myVcsHistory;
  private final Gson myGson = new Gson();
  private static final Pattern TEAMCITY_SVN_REVISION_PATTERN = Pattern.compile("([^\\|]+\\|)?([0-9]+)(_.+)?");


```

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
  private static final String STATUS_FOR_REMOVED_BUILD = "teamcity.commitStatusPublisher.removedBuild.stash.status";
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
  private static final String STATUS_FOR_REMOVED_BUILD = "teamcity.commitStatusPublisher.removedBuild.stash.status";
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
  private static final String STATUS_FOR_REMOVED_BUILD = "teamcity.commitStatusPublisher.removedBuild.stash.status";
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
  private static final String STATUS_FOR_REMOVED_BUILD = "teamcity.commitStatusPublisher.removedBuild.stash.status";
  public static final String PROP_PUBLISH_QUEUED_BUILD_STATUS = "teamcity.stashCommitStatusPublisher.publishQueuedBuildStatus";
  private static final Pattern PULL_REQUEST_BRANCH_PATTERN = Pattern.compile("^refs\\/pull\\-requests\\/(\\d+)\\/from");
  private static final String SERVER_VERSION_BUILD_SERVER_HWM = "7.4";
  private static final String SERVER_VERSION_EXTENDED_SERVER_LWM = "7.14.0";
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`apiUrl.length() == 0` can be replaced with 'apiUrl.isEmpty()'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabSettings.java`
#### Snippet
```java
  public void testConnection(@NotNull BuildTypeIdentity buildTypeOrTemplate, @NotNull VcsRoot root, @NotNull Map<String, String> params) throws PublisherException {
    String apiUrl = params.get(Constants.GITLAB_API_URL);
    if (null == apiUrl || apiUrl.length() == 0)
      throw new PublisherException("Missing GitLab API URL parameter");
    String pathPrefix = getPathPrefix(apiUrl);
```

### SizeReplaceableByIsEmpty
`token.length() == 0` can be replaced with 'token.isEmpty()'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabSettings.java`
#### Snippet
```java
      throw new PublisherException("Cannot parse repository URL from VCS root " + root.getName());
    String token = params.get(Constants.GITLAB_TOKEN);
    if (null == token || token.length() == 0)
      throw new PublisherException("Missing GitLab API access token");
      try {
```

### SizeReplaceableByIsEmpty
`err.length() > 0` can be replaced with '!err.isEmpty()'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritClientImpl.java`
#### Snippet
```java
      LOG.info("Command '" + command + "' finished, exitCode: " + channel.getExitStatus());
      LOG.debug("Command '" + command + "' has returned stdout: '" + out + "', stderr: '" + err + "'");
      if (err.length() > 0)
        throw new IOException(err);
    } finally {
```

### SizeReplaceableByIsEmpty
`myTestRunIds.size() > 0` can be replaced with '!myTestRunIds.isEmpty()'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/swarm/SwarmClient.java`
#### Snippet
```java
          }
        }
        if (myTestRunIds.size() > 0) {
          info(String.format("Found Perforce Swarm testruns %s for %s", myTestRunIds, myDebugInfo));
        }
```

### SizeReplaceableByIsEmpty
`myReviews.size() > 0` can be replaced with '!myReviews.isEmpty()'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/swarm/SwarmClient.java`
#### Snippet
```java
          }
        }
        if (myReviews.size() > 0) {
          info(String.format("Found Perforce Swarm reviews %s for %s", myReviews, myDebugInfo));
        }
```

### SizeReplaceableByIsEmpty
`apiUrl.length() == 0` can be replaced with 'apiUrl.isEmpty()'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabPublisher.java`
#### Snippet
```java
    VcsRootInstance root = revision.getRoot();
    String apiUrl = getApiUrl();
    if (null == apiUrl || apiUrl.length() == 0)
      throw new PublisherException("Missing GitLab API URL parameter");
    String pathPrefix = GitlabSettings.getPathPrefix(apiUrl);
```

### SizeReplaceableByIsEmpty
`apiUrl.length() == 0` can be replaced with 'apiUrl.isEmpty()'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabPublisher.java`
#### Snippet
```java
    VcsRootInstance root = revision.getRoot();
    String apiUrl = getApiUrl();
    if (null == apiUrl || apiUrl.length() == 0)
      throw new PublisherException("Missing GitLab API URL parameter");
    String pathPrefix = GitlabSettings.getPathPrefix(apiUrl);
```

### SizeReplaceableByIsEmpty
`apiUrl.length() == 0` can be replaced with 'apiUrl.isEmpty()'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/upsource/UpsourceSettings.java`
#### Snippet
```java
  public void testConnection(@NotNull BuildTypeIdentity buildTypeOrTemplate, @NotNull VcsRoot root, @NotNull Map<String, String> params) throws PublisherException {
    String apiUrl = HttpHelper.stripTrailingSlash(params.get(Constants.UPSOURCE_SERVER_URL));
    if (null == apiUrl || apiUrl.length() == 0)
      throw new PublisherException("Missing Upsource Server URL parameter");
    String username = params.get(Constants.UPSOURCE_USERNAME);
```

### SizeReplaceableByIsEmpty
`iterations.value.size() == 0` can be replaced with 'iterations.value.isEmpty()'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java

              IterationsList iterations = processGetResponse(response, IterationsList.class);
              if (iterations == null || iterations.value == null || iterations.value.size() == 0) {
                LOG.debug("No iterations are available in repository " + info);
                return;
```

### SizeReplaceableByIsEmpty
`commits.value.size() == 0` can be replaced with 'commits.value.isEmpty()'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java

          CommitsList commits = processGetResponse(response, CommitsList.class);
          if (commits == null || commits.value == null || commits.value.size() == 0) {
            throw new HttpPublisherException("No commits are available in repository %s" + info);
          }
```

### SizeReplaceableByIsEmpty
`apiUrl.length() == 0` can be replaced with 'apiUrl.isEmpty()'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashSettings.java`
#### Snippet
```java
      throw new PublisherException("Cannot parse repository URL from VCS root " + root.getName());
    String apiUrl = params.get(Constants.STASH_BASE_URL);
    if (null == apiUrl || apiUrl.length() == 0)
      throw new PublisherException("Missing Bitbucket Server API URL parameter");
    String url = apiUrl + "/rest/api/1.0/projects/" + repository.owner() + "/repos/" + repository.repositoryName();
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
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherProblems.java`
#### Snippet
```java
        errorDescription += " " + exMsg;
      } else {
        errorDescription += " " + t.toString();
      }
      logger.warnAndDebugDetails(logEntry, t);
```

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

## RuleId[id=InnerClassMayBeStatic]
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

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsPublisherSettings.java`
#### Snippet
```java
  }};

  private static final Set<Event> mySupportedEventsWithQueued = new HashSet<Event>() {{
    add(Event.QUEUED);
    add(Event.REMOVED_FROM_QUEUE);
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsPublisherSettings.java`
#### Snippet
```java
  private final OAuthTokensStorage myOAuthTokensStorage;
  private final SecurityContext mySecurityContext;
  private static final Set<Event> mySupportedEvents = new HashSet<Event>() {{
    add(Event.STARTED);
    add(Event.FINISHED);
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabSettings.java`
#### Snippet
```java
  private static final Pattern URL_WITH_API_SUFFIX = Pattern.compile("(.*)/api/v.");

  private static final Set<Event> mySupportedEvents = new HashSet<Event>() {{
    add(Event.STARTED);
    add(Event.FINISHED);
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabSettings.java`
#### Snippet
```java
  }};

  private static final Set<Event> mySupportedEventsWithQueued = new HashSet<Event>() {{
    add(Event.QUEUED);
    add(Event.REMOVED_FROM_QUEUE);
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubSettings.java`
#### Snippet
```java
  private final SecurityContext mySecurityContext;
  private final CommitStatusesCache<CommitStatus> myStatusesCache;
  private static final Set<Event> mySupportedEvents = new HashSet<Event>() {{
    add(Event.STARTED);
    add(Event.FINISHED);
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubSettings.java`
#### Snippet
```java
  }};

  private static final Set<Event> mySupportedEventsWithQueued = new HashSet<Event>() {{
    add(Event.QUEUED);
    add(Event.REMOVED_FROM_QUEUE);
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/upsource/UpsourceSettings.java`
#### Snippet
```java

  private final VcsModificationHistory myVcsHistory;
  private static final Set<Event> mySupportedEvents = new HashSet<Event>() {{
    add(Event.STARTED);
    add(Event.FINISHED);
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashSettings.java`
#### Snippet
```java
  static final GitRepositoryParser VCS_URL_PARSER = new GitRepositoryParser();

  private static final Set<Event> mySupportedEvents = new HashSet<Event>() {{
    add(Event.STARTED);
    add(Event.FINISHED);
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashSettings.java`
#### Snippet
```java
  }};

  private static final Set<Event> mySupportedEventsWithQueued = new HashSet<Event>() {{
    add(Event.QUEUED);
    add(Event.REMOVED_FROM_QUEUE);
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpaceSettings.java`
#### Snippet
```java
  }};

  private static final Set<Event> mySupportedEventsWithQueued = new HashSet<Event>() {{
    add(Event.QUEUED);
    add(Event.REMOVED_FROM_QUEUE);
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpaceSettings.java`
#### Snippet
```java
  @NotNull private final SecurityContext mySecurityContext;

  private static final Set<Event> mySupportedEvents = new HashSet<Event>() {{
    add(Event.STARTED);
    add(Event.FINISHED);
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/swarm/commitPublisher/SwarmPublisherSettings.java`
#### Snippet
```java
  public static final String PARAM_CREATE_SWARM_TEST = "createSwarmTest";

  private static final Set<CommitStatusPublisher.Event> ourSupportedEvents = new HashSet<CommitStatusPublisher.Event>() {{
    add(CommitStatusPublisher.Event.QUEUED);
    add(CommitStatusPublisher.Event.REMOVED_FROM_QUEUE);
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritSettings.java`
#### Snippet
```java
  }};
  private GerritClient myGerritClient;
  private static final Set<Event> mySupportedEvents = new HashSet<Event>() {{
    add(Event.FINISHED);
  }};
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudSettings.java`
#### Snippet
```java
  }};

  private static final Set<Event> mySupportedEventsWithQueued = new HashSet<Event>() {{
    add(Event.QUEUED);
    add(Event.REMOVED_FROM_QUEUE);
```

### SetReplaceableByEnumSet
`HashSet` can be replaced with 'EnumSet'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudSettings.java`
#### Snippet
```java

  private String myDefaultApiUrl = DEFAULT_API_URL;
  private static final Set<Event> mySupportedEvents = new HashSet<Event>() {{
    add(Event.STARTED);
    add(Event.FINISHED);
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpaceToken.java`
#### Snippet
```java
  }

  public void toHeader(Map<String, String> headers) {
    headers.put("Authorization", String.format("%s %s", myTokenType, myAccessToken));
  }
```

### BoundedWildcard
Can generalize to `? super String`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpaceToken.java`
#### Snippet
```java
  }

  public void toHeader(Map<String, String> headers) {
    headers.put("Authorization", String.format("%s %s", myTokenType, myAccessToken));
  }
```

### BoundedWildcard
Can generalize to `? extends SingleReview`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/swarm/web/SwarmBuildDataBean.java`
#### Snippet
```java
    }

    public void addAll(@NotNull List<SingleReview> reviews) {
      myReviews.addAll(reviews);
    }
```

### BoundedWildcard
Can generalize to `? super Event`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java

  @Used("tests")
  void setEventProcessedCallback(@Nullable Consumer<Event> callback) {
    myEventProcessedCallback = callback;
  }
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `static private`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpaceApiUrls.java`
#### Snippet
```java

public class SpaceApiUrls {
  static private final String HTTP_API_PART = "api/http";
  static private final String COMMIT_STATUS_PART = "commit-statuses";
  static private final String CHECK_SERVICE_PART = "check-service";
```

### MissortedModifiers
Missorted modifiers `static private`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpaceApiUrls.java`
#### Snippet
```java
public class SpaceApiUrls {
  static private final String HTTP_API_PART = "api/http";
  static private final String COMMIT_STATUS_PART = "commit-statuses";
  static private final String CHECK_SERVICE_PART = "check-service";

```

### MissortedModifiers
Missorted modifiers `static private`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpaceApiUrls.java`
#### Snippet
```java
  static private final String HTTP_API_PART = "api/http";
  static private final String COMMIT_STATUS_PART = "commit-statuses";
  static private final String CHECK_SERVICE_PART = "check-service";

  private static String projectKey(@NotNull String projectKey) {
```

### MissortedModifiers
Missorted modifiers `final private`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/BasePublisherSettings.java`
#### Snippet
```java
  private static class TimestampedServerVersion {
    final static long EXPIRATION_TIME_MS = TimeUnit.DAYS.toMillis(1);
    final private String myServerVersion;
    final private long myTimestamp;

```

### MissortedModifiers
Missorted modifiers `final static`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/BasePublisherSettings.java`
#### Snippet
```java

  private static class TimestampedServerVersion {
    final static long EXPIRATION_TIME_MS = TimeUnit.DAYS.toMillis(1);
    final private String myServerVersion;
    final private long myTimestamp;
```

### MissortedModifiers
Missorted modifiers `final private`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/BasePublisherSettings.java`
#### Snippet
```java
    final static long EXPIRATION_TIME_MS = TimeUnit.DAYS.toMillis(1);
    final private String myServerVersion;
    final private long myTimestamp;

    TimestampedServerVersion(@NotNull String version) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/BasePublisherSettings.java`
#### Snippet
```java
  @NotNull
  @Override
  public Map<OAuthConnectionDescriptor, Boolean> getOAuthConnections(final @NotNull SProject project, final @NotNull SUser user) {
    return Collections.emptyMap();
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/BasePublisherSettings.java`
#### Snippet
```java
  @NotNull
  @Override
  public Map<OAuthConnectionDescriptor, Boolean> getOAuthConnections(final @NotNull SProject project, final @NotNull SUser user) {
    return Collections.emptyMap();
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsPublisherSettings.java`
#### Snippet
```java
  @NotNull
  @Override
  public Map<OAuthConnectionDescriptor, Boolean> getOAuthConnections(final @NotNull SProject project, final @NotNull SUser user) {
    final List<OAuthConnectionDescriptor> tfsConnections = myOauthConnectionsManager.getAvailableConnectionsOfType(project, TfsAuthProvider.TYPE);
    final Map<OAuthConnectionDescriptor, Boolean> connections = new LinkedHashMap<OAuthConnectionDescriptor, Boolean>();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsPublisherSettings.java`
#### Snippet
```java
  @NotNull
  @Override
  public Map<OAuthConnectionDescriptor, Boolean> getOAuthConnections(final @NotNull SProject project, final @NotNull SUser user) {
    final List<OAuthConnectionDescriptor> tfsConnections = myOauthConnectionsManager.getAvailableConnectionsOfType(project, TfsAuthProvider.TYPE);
    final Map<OAuthConnectionDescriptor, Boolean> connections = new LinkedHashMap<OAuthConnectionDescriptor, Boolean>();
```

### MissortedModifiers
Missorted modifiers `final static`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisher.java`
#### Snippet
```java
    FAILURE_DETECTED("buildFailureDetected"), MARKED_AS_SUCCESSFUL("buildMarkedAsSuccessful");

    private final static String PUBLISHING_TASK_PREFIX = "publishBuildStatus";

    private final String myName;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DummyPublisherSettings.java`
#### Snippet
```java
  @NotNull
  @Override
  public Map<OAuthConnectionDescriptor, Boolean> getOAuthConnections(final @NotNull SProject project, final @NotNull SUser user) {
    return Collections.emptyMap();
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DummyPublisherSettings.java`
#### Snippet
```java
  @NotNull
  @Override
  public Map<OAuthConnectionDescriptor, Boolean> getOAuthConnections(final @NotNull SProject project, final @NotNull SUser user) {
    return Collections.emptyMap();
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubSettings.java`
#### Snippet
```java
  @NotNull
  @Override
  public Map<OAuthConnectionDescriptor, Boolean> getOAuthConnections(final @NotNull SProject project, final @NotNull SUser user) {
    List<OAuthConnectionDescriptor> validConnections = new ArrayList<OAuthConnectionDescriptor>();
    validConnections.addAll(myOauthConnectionsManager.getAvailableConnectionsOfType(project, GITHUB_OAUTH_PROVIDER_TYPE));
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubSettings.java`
#### Snippet
```java
  @NotNull
  @Override
  public Map<OAuthConnectionDescriptor, Boolean> getOAuthConnections(final @NotNull SProject project, final @NotNull SUser user) {
    List<OAuthConnectionDescriptor> validConnections = new ArrayList<OAuthConnectionDescriptor>();
    validConnections.addAll(myOauthConnectionsManager.getAvailableConnectionsOfType(project, GITHUB_OAUTH_PROVIDER_TYPE));
```

### MissortedModifiers
Missorted modifiers `final static`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/Constants.java`
#### Snippet
```java
public class Constants {

  public final static String COMMIT_STATUS_PUBLISHER_PROBLEM_TYPE = "COMMIT_STATUS_PUBLISHER_PROBLEM";

  public static final String VCS_ROOT_ID_PARAM = "vcsRootId";
```

### MissortedModifiers
Missorted modifiers `default public`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherSettings.java`
#### Snippet
```java

  @Nullable
  default public String getServerVersion(@NotNull String url) {
    return null;
  }
```

### MissortedModifiers
Missorted modifiers `final static`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
  final static String LOCKS_STRIPES = "teamcity.commitStatusPublisher.locks.stripes";

  private final static int LOCKS_STRIPES_DEFAULT = 1000;
  private final static int MAX_LAST_EVENTS_TO_REMEMBER = 1000;

```

### MissortedModifiers
Missorted modifiers `final static`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
  final static String CSP_FOR_BUILD_TYPE_CONFIGURATION_FLAG_TTL_PROPERTY_NAME = "teamcity.commitStatusPublisher.enabledForBuildCache.ttl";
  final static String QUEUE_PAUSER_SYSTEM_PROPERTY = "teamcity.plugin.queuePauser.queue.enabled";
  final static String CHECK_STATUS_BEFORE_PUBLISHING = "teamcity.commitStatusPubliser.checkStatus.enabled";
  final static String PUBLISH_REPLACING_STATUS_ON_REMOVE = "teamcity.commitStatusPublisher.replaceStatusOnRemove";
  final static String LOCKS_STRIPES = "teamcity.commitStatusPublisher.locks.stripes";
```

### MissortedModifiers
Missorted modifiers `final static`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java

  final static String PUBLISHING_ENABLED_PROPERTY_NAME = "teamcity.commitStatusPublisher.enabled";
  final static String CSP_FOR_BUILD_TYPE_CONFIGURATION_FLAG_TTL_PROPERTY_NAME = "teamcity.commitStatusPublisher.enabledForBuildCache.ttl";
  final static String QUEUE_PAUSER_SYSTEM_PROPERTY = "teamcity.plugin.queuePauser.queue.enabled";
  final static String CHECK_STATUS_BEFORE_PUBLISHING = "teamcity.commitStatusPubliser.checkStatus.enabled";
```

### MissortedModifiers
Missorted modifiers `final static`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java

  private final static int LOCKS_STRIPES_DEFAULT = 1000;
  private final static int MAX_LAST_EVENTS_TO_REMEMBER = 1000;

  private final PublisherManager myPublisherManager;
```

### MissortedModifiers
Missorted modifiers `final static`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
  final static String QUEUE_PAUSER_SYSTEM_PROPERTY = "teamcity.plugin.queuePauser.queue.enabled";
  final static String CHECK_STATUS_BEFORE_PUBLISHING = "teamcity.commitStatusPubliser.checkStatus.enabled";
  final static String PUBLISH_REPLACING_STATUS_ON_REMOVE = "teamcity.commitStatusPublisher.replaceStatusOnRemove";
  final static String LOCKS_STRIPES = "teamcity.commitStatusPublisher.locks.stripes";

```

### MissortedModifiers
Missorted modifiers `final static`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
public class CommitStatusPublisherListener extends BuildServerAdapter implements ChangesCollectionCondition {

  final static String PUBLISHING_ENABLED_PROPERTY_NAME = "teamcity.commitStatusPublisher.enabled";
  final static String CSP_FOR_BUILD_TYPE_CONFIGURATION_FLAG_TTL_PROPERTY_NAME = "teamcity.commitStatusPublisher.enabledForBuildCache.ttl";
  final static String QUEUE_PAUSER_SYSTEM_PROPERTY = "teamcity.plugin.queuePauser.queue.enabled";
```

### MissortedModifiers
Missorted modifiers `final static`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
  final static String PUBLISHING_ENABLED_PROPERTY_NAME = "teamcity.commitStatusPublisher.enabled";
  final static String CSP_FOR_BUILD_TYPE_CONFIGURATION_FLAG_TTL_PROPERTY_NAME = "teamcity.commitStatusPublisher.enabledForBuildCache.ttl";
  final static String QUEUE_PAUSER_SYSTEM_PROPERTY = "teamcity.plugin.queuePauser.queue.enabled";
  final static String CHECK_STATUS_BEFORE_PUBLISHING = "teamcity.commitStatusPubliser.checkStatus.enabled";
  final static String PUBLISH_REPLACING_STATUS_ON_REMOVE = "teamcity.commitStatusPublisher.replaceStatusOnRemove";
```

### MissortedModifiers
Missorted modifiers `final static`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
  final static String CHECK_STATUS_BEFORE_PUBLISHING = "teamcity.commitStatusPubliser.checkStatus.enabled";
  final static String PUBLISH_REPLACING_STATUS_ON_REMOVE = "teamcity.commitStatusPublisher.replaceStatusOnRemove";
  final static String LOCKS_STRIPES = "teamcity.commitStatusPublisher.locks.stripes";

  private final static int LOCKS_STRIPES_DEFAULT = 1000;
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritClientImpl.java`
#### Snippet
```java
    if (idx != -1) {
      String host = server.substring(0, idx);
      int port = Integer.valueOf(server.substring(idx + 1));
      return jsch.getSession(username, host, port);
    } else {
```

## RuleId[id=RedundantMethodOverride]
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

## RuleId[id=ConditionCoveredByFurtherCondition]
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
Condition 'event != null' covered by subsequent condition 'event == Event.STARTED'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java

      Event event = myLastEvents.get(promotion.getId());
      if (event != null && event == Event.STARTED) {
        eventProcessed(event);
        return;
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabSettings.java`
#### Snippet
```java
  @NotNull
  public static String getProjectsUrl(@NotNull String apiUrl, @NotNull String owner, @NotNull String repo) {
    return apiUrl + "/projects/" + owner.replace(".", "%2E").replace("/", "%2F") + "%2F" + repo.replace(".", "%2E");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabSettings.java`
#### Snippet
```java
  @NotNull
  public static String getProjectsUrl(@NotNull String apiUrl, @NotNull String owner, @NotNull String repo) {
    return apiUrl + "/projects/" + owner.replace(".", "%2E").replace("/", "%2F") + "%2F" + repo.replace(".", "%2E");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabSettings.java`
#### Snippet
```java
  @NotNull
  public static String getProjectsUrl(@NotNull String apiUrl, @NotNull String owner, @NotNull String repo) {
    return apiUrl + "/projects/" + owner.replace(".", "%2E").replace("/", "%2F") + "%2F" + repo.replace(".", "%2E");
  }

```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritClientImpl.java`
#### Snippet
```java
    String line;
    StringBuilder out = new StringBuilder();
    while ((line = reader.readLine()) != null) {
      out.append(line).append("\n");
    }
```

### NestedAssignment
Result of assignment expression used
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java

    final Exception ex;
    if ((ex = exceptionRef.get()) != null) {
      if (ex instanceof IOException) {
        throw (IOException) ex;
```

### NestedAssignment
Result of assignment expression used
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java

    final Exception ex;
    if ((ex = exceptionRef.get()) != null) {
      if (ex instanceof IOException) {
        throw (IOException)ex;
```

### NestedAssignment
Result of assignment expression used
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java

    final Exception ex;
    if ((ex = exceptionRef.get()) != null) {
      if (ex instanceof IOException) {
        throw (IOException) ex;
```

### NestedAssignment
Result of assignment expression used
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java

    final Exception ex;
    if ((ex = exceptionRef.get()) != null) {
      if (ex instanceof IOException) {
        throw (IOException) ex;
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`p = p + "/"` could be simplified to 'p += "/"'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/GitRepositoryParser.java`
#### Snippet
```java
    String p = prefix.startsWith("/") ? prefix : "/" + prefix;
    if (!p.endsWith("/"))
      p = p + "/";
    if (s.startsWith(p))
      return s.substring(p.length());
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/swarm/web/SwarmBuildPageExtension.java`
#### Snippet
```java

    return IOGuard.allowNetworkCall(() -> {
      return createSwarmDataBean(build, buildType, mySwarmClients.getSwarmClientRevisions(build), true);
    });
  }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/upsource/UpsourceSettings.java`
#### Snippet
```java
      data.put(UpsourceSettings.PROJECT_FIELD, projectId);
      // Newer versions of Upsource support special test connection call, that works correctly for their CI-specific authentication
      IOGuard.allowNetworkCall(() -> {
        HttpHelper.post(urlPost, credentials, myGson.toJson(data), ContentType.APPLICATION_JSON, null,
                        BaseCommitStatusPublisher.DEFAULT_CONNECTION_TIMEOUT, trustStore(),
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/upsource/UpsourceSettings.java`
#### Snippet
```java
      try {
        // If the newer method fails, we assume it may be an older version of Upsource, and test connection in a regular way
        IOGuard.allowNetworkCall(() -> {
          HttpHelper.get(urlGet, credentials, null,
                         BaseCommitStatusPublisher.DEFAULT_CONNECTION_TIMEOUT, trustStore(),
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java
      final String url = MessageFormat.format(COMMIT_STATUS_URL_FORMAT,
        info.getServer(), info.getProject(), info.getRepository(), commitId);
      IOGuard.allowNetworkCall(() -> {
        HttpHelper.post(url, getCredentials(params), StringUtil.EMPTY, ContentType.DEFAULT_TEXT,
                        Collections.singletonMap("Accept", "application/json"), BaseCommitStatusPublisher.DEFAULT_CONNECTION_TIMEOUT,
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java

    try {
      IOGuard.allowNetworkCall(() -> {
        HttpHelper.get(url, getCredentials(params),
                       Collections.singletonMap("Accept", "application/json"), BaseCommitStatusPublisher.DEFAULT_CONNECTION_TIMEOUT,
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java

    try {
      IOGuard.allowNetworkCall(() -> {
        HttpHelper.get(url, getCredentials(params),
                       Collections.singletonMap("Accept", "application/json"), BaseCommitStatusPublisher.DEFAULT_CONNECTION_TIMEOUT,
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashSettings.java`
#### Snippet
```java
    };
    try {
      IOGuard.allowNetworkCall(() -> {
        HttpHelper.get(url, credentials, headers,
                       BaseCommitStatusPublisher.DEFAULT_CONNECTION_TIMEOUT, trustStore(), processor);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/swarm/commitPublisher/SwarmPublisherSettings.java`
#### Snippet
```java
                             @NotNull Map<String, String> params) throws PublisherException {

    IOGuard.allowNetworkCall(() -> {
      myClientManager.getSwarmClient(params).testConnection();
    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java

    final AtomicReference<Exception> exceptionRef = new AtomicReference<>();
    IOGuard.allowNetworkCall(() -> {
      myClient.post(
        url, authenticationCredentials(), defaultHeaders(),
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java
    final AtomicReference<Exception> exceptionRef = new AtomicReference<>();
    final AtomicReference<T> resultRef = new AtomicReference<>();
    IOGuard.allowNetworkCall(() -> {
      myClient.get(uri, authenticationCredentials(), defaultHeaders(),
                   success -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java
                     exceptionRef.set(new IOException(getErrorMessage(error, additionalComment)));
                   },
                   e -> {
                     exceptionRef.set(e);
                   }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java

    final AtomicReference<Exception> exceptionRef = new AtomicReference<>();
    IOGuard.allowNetworkCall(() -> {
      myClient.post(
        url, authenticationCredentials(), defaultHeaders(),
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java
    final AtomicReference<CombinedCommitStatus> status = new AtomicReference<>();
    final AtomicReference<Exception> exceptionRef = new AtomicReference<>();
    IOGuard.allowNetworkCall(() -> {
      myClient.get(statusUrl, authenticationCredentials(), defaultHeaders(),
                   success -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudSettings.java`
#### Snippet
```java

    try {
      IOGuard.allowNetworkCall(() -> {
        HttpHelper.get(url,
                       credentials,
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
      }

      runAsync(() -> runForEveryPublisher(eventType, build), () -> { eventProcessed(eventType); });
    }

```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
    if (((BuildPromotionEx)promotion).isChangeCollectingNeeded(false)) return;

    runAsync(() -> {
      proccessRemovedFromQueueBuild(build, user, comment);
    }, null);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
      return;
    }
    runAsync(() -> {
      buildTypes.forEach(this::clearObsoleteProblems);
    }, null);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
      AdditionalTaskInfo additionalTaskInfo = new AdditionalTaskInfo(comment, commentAuthor);

      runAsync(() -> runForEveryPublisher(eventType, promotion, additionalTaskInfo), () -> { eventProcessed(eventType); });
    }

```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `HttpBasedCommitStatusPublisher()` of an abstract class should not be declared 'public'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/HttpBasedCommitStatusPublisher.java`
#### Snippet
```java
  protected final WebLinks myLinks;

  public HttpBasedCommitStatusPublisher(@NotNull CommitStatusPublisherSettings settings,
                                        @NotNull SBuildType buildType, @NotNull String buildFeatureId,
                                        @NotNull Map<String, String> params,
```

### NonProtectedConstructorInAbstractClass
Constructor `BasePublisherSettings()` of an abstract class should not be declared 'public'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/BasePublisherSettings.java`
#### Snippet
```java
  protected final Gson myGson = new Gson();

  public BasePublisherSettings(@NotNull PluginDescriptor descriptor,
                               @NotNull WebLinks links,
                               @NotNull CommitStatusPublisherProblems problems,
```

### NonProtectedConstructorInAbstractClass
Constructor `GitHubApiImpl()` of an abstract class should not be declared 'public'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java
  private final Gson myGson;

  public GitHubApiImpl(@NotNull final HttpClientWrapper client,
                       @NotNull final GitHubApiPaths urls
  ) {
```

### NonProtectedConstructorInAbstractClass
Constructor `AuthTypeAwareSettings()` of an abstract class should not be declared 'public'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/AuthTypeAwareSettings.java`
#### Snippet
```java
  protected final OAuthConnectionsManager myOAuthConnectionsManager;

  public AuthTypeAwareSettings(@NotNull PluginDescriptor descriptor,
                               @NotNull WebLinks links,
                               @NotNull CommitStatusPublisherProblems problems,
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

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/PublisherManager.java`
#### Snippet
```java
        settings.add(s);
    }
    Collections.sort(settings, new Comparator<CommitStatusPublisherSettings>() {
      public int compare(CommitStatusPublisherSettings o1, CommitStatusPublisherSettings o2) {
        return o1.getName().compareTo(o2.getName());
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
  private final CommitStatusesCache<JsonStashBuildStatus> myStatusesCache;

  private BitbucketEndpoint myBitbucketEndpoint = null;

  StashPublisher(@NotNull CommitStatusPublisherSettings settings,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
  private final ConcurrentMap<String, ValueWithTTL<Boolean>> myBuildTypeCommitStatusPublisherConfiguredCache = new ConcurrentHashMap<>();

  private Consumer<Event> myEventProcessedCallback = null;

  public CommitStatusPublisherListener(@NotNull EventDispatcher<BuildServerListener> events,
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `requestEntity`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/LoggerUtil.java`
#### Snippet
```java

    if (requestEntity == null) {
      requestEntity = "<none>";
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `requestEntity`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java
    }
    if (requestEntity == null) {
      requestEntity = "<none>";
    }

```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `CommitStatusPublisherSettings`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsPublisherSettings.java`
#### Snippet
```java
 * Settings for TFS Git commit status publisher.
 */
public class TfsPublisherSettings extends BasePublisherSettings implements CommitStatusPublisherSettings {

  private final OAuthConnectionsManager myOauthConnectionsManager;
```

### RedundantImplements
Redundant interface declaration `CommitStatusPublisherSettings`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabSettings.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class GitlabSettings extends BasePublisherSettings implements CommitStatusPublisherSettings {

  private static final Pattern URL_WITH_API_SUFFIX = Pattern.compile("(.*)/api/v.");
```

### RedundantImplements
Redundant interface declaration `GerritClient`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritClientImpl.java`
#### Snippet
```java
import static jetbrains.buildServer.commitPublisher.LoggerUtil.LOG;

public class GerritClientImpl extends GerritClientBase implements GerritClient {

  private final ExtensionHolder myExtensionHolder;
```

### RedundantImplements
Redundant interface declaration `CommitStatusPublisherSettings`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubSettings.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class GitHubSettings extends BasePublisherSettings implements CommitStatusPublisherSettings {

  private final ChangeStatusUpdater myUpdater;
```

### RedundantImplements
Redundant interface declaration `CommitStatusPublisherSettings`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/upsource/UpsourceSettings.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class UpsourceSettings extends BasePublisherSettings implements CommitStatusPublisherSettings {

  static final String ENDPOINT_BUILD_STATUS = "~buildStatus";
```

### RedundantImplements
Redundant interface declaration `CommitStatusPublisherSettings`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashSettings.java`
#### Snippet
```java
import static jetbrains.buildServer.commitPublisher.stash.StashPublisher.PROP_PUBLISH_QUEUED_BUILD_STATUS;

public class StashSettings extends AuthTypeAwareSettings implements CommitStatusPublisherSettings {

  static final String DEFAULT_AUTH_TYPE = Constants.PASSWORD;
```

### RedundantImplements
Redundant interface declaration `CommitStatusPublisherSettings`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpaceSettings.java`
#### Snippet
```java
import static jetbrains.buildServer.commitPublisher.BaseCommitStatusPublisher.DEFAULT_CONNECTION_TIMEOUT;

public class SpaceSettings extends BasePublisherSettings implements CommitStatusPublisherSettings {

  static final String CHANGES_FIELD = "changes";
```

### RedundantImplements
Redundant interface declaration `BitbucketEndpoint`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
  }

  private class CoreApiEndpoint extends BaseBitbucketEndpoint implements BitbucketEndpoint {

    @Override
```

### RedundantImplements
Redundant interface declaration `StatusData`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
  }

  private class SBuildData extends BaseBuildData implements StatusData {

    private final SBuild myBuild;
```

### RedundantImplements
Redundant interface declaration `StatusData`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
  }

  private class SBuildPromotionData extends BaseBuildData implements StatusData {

    private final BuildPromotion myBuildPromotion;
```

### RedundantImplements
Redundant interface declaration `BitbucketEndpoint`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
  }

  private class BuildApiEndpoint extends BaseBitbucketEndpoint implements BitbucketEndpoint {

    @Override
```

### RedundantImplements
Redundant interface declaration `CommitStatusPublisherSettings`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritSettings.java`
#### Snippet
```java
import static jetbrains.buildServer.ssh.ServerSshKeyManager.TEAMCITY_SSH_KEY_PROP;

public class GerritSettings extends BasePublisherSettings implements CommitStatusPublisherSettings {

  private final ExtensionHolder myExtensionHolder;
```

### RedundantImplements
Redundant interface declaration `CommitStatusPublisherSettings`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudSettings.java`
#### Snippet
```java
import org.springframework.http.MediaType;

public class BitbucketCloudSettings extends AuthTypeAwareSettings implements CommitStatusPublisherSettings {

  static final String DEFAULT_API_URL = "https://api.bitbucket.org/";
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
        if (shouldFailBuild(publisher.getBuildType())) {
          String problemId = "commitStatusPublisher." + publisher.getId() + "." + revision.getRoot().getId();
          String problemDescription = t instanceof PublisherException ? t.getMessage() : t.toString();
          BuildProblemData buildProblem = BuildProblemData.createBuildProblem(problemId, "commitStatusPublisherProblem", problemDescription);
          ((BuildPromotionEx)promotion).addBuildProblem(buildProblem);
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/GitRepositoryParser.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/PublisherManager.java`
#### Snippet
```java
    String publisherId = params.get(Constants.PUBLISHER_ID_PARAM);
    if (publisherId == null)
      return null;
    CommitStatusPublisherSettings settings = findSettings(publisherId);
    if (settings == null)
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/PublisherManager.java`
#### Snippet
```java
    CommitStatusPublisherSettings settings = findSettings(publisherId);
    if (settings == null)
      return null;
    return settings.createPublisher(buildType, buildFeatureId, params);
  }
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/PublisherSettingsController.java`
#### Snippet
```java
    String publisherId = request.getParameter(Constants.PUBLISHER_ID_PARAM);
    if (publisherId == null)
      return null;

    String projectId = request.getParameter("projectId");
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/PublisherSettingsController.java`
#### Snippet
```java
    CommitStatusPublisherSettings settings = myPublisherManager.findSettings(publisherId);
    if (settings == null)
      return null;

    String settingsUrl = settings.getEditSettingsUrl();
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/PublisherSettingsController.java`
#### Snippet
```java
    if (Constants.TEST_CONNECTION_YES.equals(request.getParameter(Constants.TEST_CONNECTION_PARAM))) {
      processTestConnectionRequest(request, response, settings, params);
      return null;
    }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/PublisherSettingsController.java`
#### Snippet
```java
      request.getRequestDispatcher(settingsUrl).include(request, response);

    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/BasePublisherSettings.java`
#### Snippet
```java
  @Nullable
  public Map<String, String> getDefaultParameters() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/BasePublisherSettings.java`
#### Snippet
```java
  @Override
  public Map<String, String> transformParameters(@NotNull Map<String, String> params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/BasePublisherSettings.java`
#### Snippet
```java
  @Nullable
  protected String retrieveServerVersion(@NotNull String url) throws PublisherException {
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/BasePublisherSettings.java`
#### Snippet
```java
        return version.get();
      }
      return null;
    }
    if (v != null) {
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/BasePublisherSettings.java`
#### Snippet
```java
      return v;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabSettings.java`
#### Snippet
```java
  @Nullable
  public static String getPathPrefix(final String apiUrl) {
    if (!URL_WITH_API_SUFFIX.matcher(apiUrl).matches()) return null;
    try {
      URI uri = new URI(apiUrl);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabSettings.java`
#### Snippet
```java
      return path.substring(0, path.length() - "/api/v4".length());
    } catch (URISyntaxException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudRepositoryParser.java`
#### Snippet
```java
      if (!m.matches()) {
        LOG.warn("Cannot parse mercurial repository url " + uri);
        return null;
      }
      String owner = m.group(1).toLowerCase();
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudRepositoryParser.java`
#### Snippet
```java
    } catch (MalformedURLException e) {
      LOG.warn("Cannot parse mercurial repository url " + uri, e);
      return null;
    }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudRepositoryParser.java`
#### Snippet
```java
    if (path == null) {
      LOG.warn("Cannot parse mercurial repository url " + uri + ", path is empty");
      return null;
    }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudRepositoryParser.java`
#### Snippet
```java
    if (idx <= 0) {
      LOG.warn("Cannot parse mercurial repository url " + uri);
      return null;
    }
    String owner = path.substring(0, idx);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudRepositoryParser.java`
#### Snippet
```java
    if ("jetbrains.git".equals(root.getVcsName())) {
      String url = root.getProperty("url");
      return url == null ? null : VCS_URL_PARSER.parseRepositoryUrl(url);
    }
    if ("mercurial".equals(root.getVcsName())) {
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudRepositoryParser.java`
#### Snippet
```java
    if ("mercurial".equals(root.getVcsName())) {
      String url = root.getProperty("repositoryPath");
      return url == null ? null : parseMercurialRepository(url);
    }
    return null;
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudRepositoryParser.java`
#### Snippet
```java
      return url == null ? null : parseMercurialRepository(url);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/BaseCommitStatusPublisher.java`
#### Snippet
```java
  @Override
  public RevisionStatus getRevisionStatusForRemovedBuild(@NotNull SQueuedBuild removedBuild, @NotNull BuildRevision revision) throws PublisherException {
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/BaseCommitStatusPublisher.java`
#### Snippet
```java
  @Override
  public RevisionStatus getRevisionStatus(@NotNull BuildPromotion buildPromotion, @NotNull BuildRevision revision) throws PublisherException {
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/BaseCommitStatusPublisher.java`
#### Snippet
```java
      return getLinks().getQueuedBuildUrl(queuedBuild);
    }
    return buildPromotion.getBuildType() != null ? getLinks().getConfigurationHomePageUrl(buildPromotion.getBuildType()) : null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
  public static TfsRepositoryInfo parse(@Nullable final String repositoryUrl, @Nullable final String serverUrl) {
    if (StringUtil.isEmptyOrSpaces(repositoryUrl)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/swarm/web/SwarmBuildPageExtension.java`
#### Snippet
```java
    SBuildType buildType = build.getBuildType();
    if (buildType == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
    final Matcher urlMatcher = TFS_URL_PATTERN.matcher(repositoryUrl.trim());
    if (!urlMatcher.find()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
        final Matcher pathMatcher = TFS_DEVOPS_PATH_PATTERN.matcher(urlPath);
        if (!pathMatcher.find()) {
          return null;
        }
        return new TfsRepositoryInfo(
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
        // VSTS URL
        if (StringUtil.isEmpty(username)) {
          return null;
        }
        server = String.format("https://%s.visualstudio.com", username);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
        final Matcher pathMatcher = TFS_DEVOPS_PATH_PATTERN.matcher(urlPath);
        if (!pathMatcher.find()) {
          return null;
        }
        return new TfsRepositoryInfo(
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
        final Matcher serverUrlMatcher = TFS_URL_PATTERN.matcher(serverUrl.trim());
        if (!serverUrlMatcher.find()) {
          return null;
        }
        server = serverUrlMatcher.group(1) + "://" + serverUrlMatcher.group(3);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
        server = serverUrlMatcher.group(1) + "://" + serverUrlMatcher.group(3);
      } else {
        return null;
      }
    } else {
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsRepositoryInfo.java`
#### Snippet
```java
    final Matcher pathMatcher = TFS_GIT_PROJECT_PATH_PATTERN.matcher(urlPath);
    if (!pathMatcher.find()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusesCache.java`
#### Snippet
```java
  public T getStatusFromCache(@NotNull BuildRevision revision, @Nullable String prefix,
                              @NotNull Supplier<Collection<T>> batchStatusLoader, @NotNull Function<T, String> prefixProvider) {
    if (!TeamCityProperties.getBooleanOrTrue(CACHE_FEATURE_TOGGLE_PARAMETER)) return null;

    ValueWithTTL<T> value = getStatusFromCache(revision, prefix);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusesCache.java`
#### Snippet
```java
      // probadly impossible case
      putStatusToCache(revision, prefix, null);
      return null;
    } finally {
      lock.unlock();
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DummyPublisherSettings.java`
#### Snippet
```java
  @Override
  public Map<String, String> transformParameters(@NotNull Map<String, String> params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DummyPublisherSettings.java`
#### Snippet
```java
  @Nullable
  public Map<String, String> getDefaultParameters() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DummyPublisherSettings.java`
#### Snippet
```java
  @Override
  public KeyStore trustStore() {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DummyPublisherSettings.java`
#### Snippet
```java
  @Nullable
  public String getEditSettingsUrl() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DummyPublisherSettings.java`
#### Snippet
```java
  @Nullable
  public CommitStatusPublisher createPublisher(@NotNull SBuildType buildType, @NotNull String buildFeatureId, @NotNull Map<String, String> params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/DummyPublisherSettings.java`
#### Snippet
```java
  @Nullable
  public PropertiesProcessor getParametersProcessor(@NotNull BuildTypeIdentity buildTypeOrTemplate) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudPublisher.java`
#### Snippet
```java
  RevisionStatus getRevisionStatusForRemovedBuild(@NotNull SQueuedBuild removedBuild, BitbucketCloudCommitBuildStatus buildStatus) {
    if (buildStatus == null) {
      return null;
    }
    Event event = getTriggeredEvent(buildStatus);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudPublisher.java`
#### Snippet
```java
  RevisionStatus getRevisionStatus(@NotNull BuildPromotion buildPromotion, @Nullable BitbucketCloudCommitBuildStatus commitStatus) {
    if (commitStatus == null) {
      return null;
    }
    Event event = getTriggeredEvent(commitStatus);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudPublisher.java`
#### Snippet
```java
      String str = response.getContent();
      if (str == null) {
        return null;
      }
      LOG.debug("Bitbucket Cloud response: " + str);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudPublisher.java`
#### Snippet
```java
      JsonElement json = new JsonParser().parse(str);
      if (!json.isJsonObject())
        return null;
      JsonObject jsonObj = json.getAsJsonObject();
      JsonElement error = jsonObj.get("error");
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudPublisher.java`
#### Snippet
```java
      JsonElement error = jsonObj.get("error");
      if (error == null || !error.isJsonObject())
        return null;

      final JsonObject errorObj = error.getAsJsonObject();
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudPublisher.java`
#### Snippet
```java
      JsonElement msg = errorObj.get("message");
      if (msg == null)
        return null;
      StringBuilder result = new StringBuilder(msg.getAsString());
      JsonElement fields = errorObj.get("fields");
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudPublisher.java`
#### Snippet
```java
      return result.toString();
    } catch (JsonSyntaxException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudPublisher.java`
#### Snippet
```java
    if (buildStatus.state == null) {
      LOG.warn("No Bitbucket Cloud build status is provided. Related event can not be calculated");
      return null;
    }
    BitbucketCloudBuildStatus status = BitbucketCloudBuildStatus.getByName(buildStatus.state);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudPublisher.java`
#### Snippet
```java
    if (status == null) {
      LOG.warn(String.format("Unknown Bitbucket Cloud build status: \"%s\". Related event can not be calculated", buildStatus.state));
      return null;
    }
    switch (status) {
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudPublisher.java`
#### Snippet
```java
    switch (status) {
      case INPROGRESS:
        if (buildStatus.description == null) return null;
        return buildStatus.description.contains(DefaultStatusMessages.BUILD_QUEUED) ? Event.QUEUED :
               buildStatus.description.contains(DefaultStatusMessages.BUILD_REMOVED_FROM_QUEUE) ? Event.REMOVED_FROM_QUEUE :
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudPublisher.java`
#### Snippet
```java
        return buildStatus.description.contains(DefaultStatusMessages.BUILD_QUEUED) ? Event.QUEUED :
               buildStatus.description.contains(DefaultStatusMessages.BUILD_REMOVED_FROM_QUEUE) ? Event.REMOVED_FROM_QUEUE :
               buildStatus.description.contains(DefaultStatusMessages.BUILD_STARTED) ? Event.STARTED : null;
      case STOPPED:
      case FAILED:
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudPublisher.java`
#### Snippet
```java
      case FAILED:
      case SUCCESSFUL:
        return null;  // these statuses do not affect on further behaviour
      default:
        LOG.warn("No event is assosiated with BitBucket Cloud build status \"" + buildStatus.state + "\". Related event can not be defined");
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudPublisher.java`
#### Snippet
```java
        LOG.warn("No event is assosiated with BitBucket Cloud build status \"" + buildStatus.state + "\". Related event can not be defined");
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubSettings.java`
#### Snippet
```java
      return result;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/swarm/SwarmClientManager.java`
#### Snippet
```java
  public final SwarmClient getSwarmClient(@NotNull SBuildType buildType, @NotNull VcsRootInstance root) {
    if (!PERFORCE_VCS_NAME.equals(root.getVcsName())) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/swarm/SwarmClientManager.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/swarm/SwarmClient.java`
#### Snippet
```java
  @Nullable
  private HttpCredentials getCredentials() {
    return  (myUsername != null && myTicket != null) ? new UsernamePasswordCredentials(myUsername, myTicket) : null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabPublisher.java`
#### Snippet
```java
  RevisionStatus getRevisionStatusForRemovedBuild(@NotNull SQueuedBuild removedBuild, @Nullable GitLabReceiveCommitStatus commitStatus) {
    if(commitStatus == null) {
      return null;
    }
    Event event = getTriggeredEvent(commitStatus);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabPublisher.java`
#### Snippet
```java
    if (commitStatus.status == null) {
      LOG.warn("No GitLab build status is provided. Related event can not be calculated");
      return null;
    }
    GitlabBuildStatus status = GitlabBuildStatus.getByName(commitStatus.status);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabPublisher.java`
#### Snippet
```java
    if (status == null) {
      LOG.warn("Unknown GitLab build status \"" + commitStatus.status + "\". Related event can not be calculated");
      return null;
    }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabPublisher.java`
#### Snippet
```java
    switch (status) {
      case CANCELED:
        return (commitStatus.description != null && commitStatus.description.contains(DefaultStatusMessages.BUILD_REMOVED_FROM_QUEUE)) ? Event.REMOVED_FROM_QUEUE : null;
      case PENDING:
        return Event.QUEUED;
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabPublisher.java`
#### Snippet
```java
        return Event.QUEUED;
      case RUNNING:
        return (commitStatus.description != null && commitStatus.description.contains(DefaultStatusMessages.BUILD_STARTED))? Event.STARTED : null;
      case SUCCESS:
      case FAILED:
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabPublisher.java`
#### Snippet
```java
      case SUCCESS:
      case FAILED:
        return null;
      default:
        LOG.warn("No event is assosiated with GitLab build status \"" + status + "\". Related event can not be defined");
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabPublisher.java`
#### Snippet
```java
        LOG.warn("No event is assosiated with GitLab build status \"" + status + "\". Related event can not be defined");
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabPublisher.java`
#### Snippet
```java
    if ("jetbrains.git".equals(root.getVcsName())) {
      String url = root.getProperty("url");
      return url == null ? null : VCS_URL_PARSER.parseRepositoryUrl(url, pathPrefix);
    } else {
      return null;
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabPublisher.java`
#### Snippet
```java
      return url == null ? null : VCS_URL_PARSER.parseRepositoryUrl(url, pathPrefix);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabPublisher.java`
#### Snippet
```java
  RevisionStatus getRevisionStatus(@NotNull BuildPromotion buildPromotion, @Nullable GitLabReceiveCommitStatus commitStatus) {
    if(commitStatus == null) {
      return null;
    }
    Event event = getTriggeredEvent(commitStatus);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/upsource/UpsourcePublisher.java`
#### Snippet
```java
    final String username = myParams.get(Constants.UPSOURCE_USERNAME);
    final String password = myParams.get(Constants.UPSOURCE_PASSWORD);
    return (username != null && password != null) ? new UsernamePasswordCredentials(username, password) : null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/data/CommitStatus.java`
#### Snippet
```java
  @Nullable
  private static String truncateStringValueWithDotsAtEnd(@Nullable final String str, final int maxLength) {
    if (str == null) return null;
    if (str.length() > maxLength) {
      return str.substring(0, maxLength - 2) + "\u2026";
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/ChangeStatusUpdater.java`
#### Snippet
```java
                                                buildContext, publisher.getServerUrl(), e, LOG);
        }
        return null;
      }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/ChangeStatusUpdater.java`
#### Snippet
```java
      final String hash = resolveCommitHash(version, repo, null, myContext);
      if (isHashInvalid(hash, version, revision.getRoot(), myContext)) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/ChangeStatusUpdater.java`
#### Snippet
```java
      if (combinedCommitStatus.statuses == null || combinedCommitStatus.statuses.isEmpty()) {
        LOG.debug(String.format("No statuses received from GitHub for repository \"%s/%s\" hash %s", repo.owner(), repo.repositoryName(), hash));
        return null;
      }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/ChangeStatusUpdater.java`
#### Snippet
```java
      final String hash = resolveCommitHash(version, repo, null, myContext);
      if (isHashInvalid(hash, version, revision.getRoot(), myContext)) {
        return null;
      }
      final int perPage = 30;
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/ChangeStatusUpdater.java`
#### Snippet
```java
        totalStatuses = combinedCommitStatus.total_count != null ? combinedCommitStatus.total_count : 0;
      } while (totalStatuses > page * perPage);
      return null;
    }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpacePublisher.java`
#### Snippet
```java
      myProblems.reportProblem("Commit Status Publisher has failed to obtain a token from JetBrains Space for VCS root " + vcsRootName,
                               this, description, null, e, LOG);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpacePublisher.java`
#### Snippet
```java
    if (commitStatus.executionStatus == null) {
      LOG.warn("No Space build status is provided. Related event can not be calculated");
      return null;
    }
    SpaceBuildStatus status = SpaceBuildStatus.getByName(commitStatus.executionStatus);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpacePublisher.java`
#### Snippet
```java
    if (status == null) {
      LOG.warn(String.format("Unknown Space build status: \"%s\". Related event can not be calculated", commitStatus.executionStatus));
      return null;
    }
    switch (status) {
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpacePublisher.java`
#### Snippet
```java
        return commitStatus.description.contains(DefaultStatusMessages.BUILD_QUEUED) ? Event.QUEUED : Event.REMOVED_FROM_QUEUE;
      case RUNNING:
        if (commitStatus.description == null) return null;
        return commitStatus.description.contains(DefaultStatusMessages.BUILD_STARTED) ? Event.STARTED : null;
      case SUCCEEDED:
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpacePublisher.java`
#### Snippet
```java
      case RUNNING:
        if (commitStatus.description == null) return null;
        return commitStatus.description.contains(DefaultStatusMessages.BUILD_STARTED) ? Event.STARTED : null;
      case SUCCEEDED:
      case FAILED:
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpacePublisher.java`
#### Snippet
```java
      case FAILING:
      case TERMINATED:
        return null;  // these statuses do not affect on further behaviour
      default:
        LOG.warn("No event is assosiated with Space build status \"" + commitStatus.executionStatus + "\". Related event can not be defined");
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpacePublisher.java`
#### Snippet
```java
        LOG.warn("No event is assosiated with Space build status \"" + commitStatus.executionStatus + "\". Related event can not be defined");
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpacePublisher.java`
#### Snippet
```java
  RevisionStatus getRevisionStatus(@NotNull BuildPromotion buildPromotion, @Nullable SpaceBuildStatusInfo commitStatus) {
    if (commitStatus == null) {
      return null;
    }
    Event event = getTriggeredEvent(commitStatus);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpacePublisher.java`
#### Snippet
```java
  RevisionStatus getRevisionStatusForRemovedBuild(@NotNull SQueuedBuild removedBuild, @Nullable SpaceBuildStatusInfo buildStatus) {
    if (buildStatus == null) {
      return null;
    }
    Event event = getTriggeredEvent(buildStatus);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java
    if (!TfsConstants.GIT_VCS_ROOT.equals(root.getVcsName())) {
      LOG.warn("No revisions were found to update TFS Git commit status. Please check you have Git VCS roots in the build configuration");
      return null;
    }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java
      throw new PublisherException(message, e);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java

  RevisionStatus getRevisionStatusForRemovedBuild(@NotNull SQueuedBuild removedBuild, @Nullable CommitStatus commitStatus) {
    if (commitStatus == null) return null;
    Event event = getTriggeredEvent(commitStatus);
    boolean isSameBuildType = StringUtil.areEqual(getBuildName(removedBuild.getBuildPromotion()), commitStatus.context.name);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java
  private static HttpCredentials getCredentials(Map<String, String> params) {
    final String accessToken = params.get(TfsConstants.ACCESS_TOKEN);
    return accessToken != null ? new UsernamePasswordCredentials(StringUtil.EMPTY, accessToken) : null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java
    if (commitStatus.state == null) {
      LOG.warn("No Azure build status is provided. Related event can not be defined");
      return null;
    }
    StatusState status = StatusState.getByName(commitStatus.state);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java
    if (status == null) {
      LOG.warn(String.format("Undefined Azure build status: \"%s\". Related event can not be defined", commitStatus.state));
      return null;
    }
    switch (status) {
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java
    switch (status) {
      case Pending:
        if (commitStatus.description == null) return null;
        return commitStatus.description.contains(DefaultStatusMessages.BUILD_QUEUED) ? Event.QUEUED :
               commitStatus.description.contains(DefaultStatusMessages.BUILD_REMOVED_FROM_QUEUE) ? Event.REMOVED_FROM_QUEUE :
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java
        return commitStatus.description.contains(DefaultStatusMessages.BUILD_QUEUED) ? Event.QUEUED :
               commitStatus.description.contains(DefaultStatusMessages.BUILD_REMOVED_FROM_QUEUE) ? Event.REMOVED_FROM_QUEUE :
               commitStatus.description.contains(DefaultStatusMessages.BUILD_STARTED) ? Event.STARTED : null;
      case Error:
      case Succeeded:
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java
      case Succeeded:
      case Failed:
        return null;  // these statuses do not affect on further behaviour
      default:
        LOG.warn("No event is assosiated with Azure build status \"" + commitStatus.state + "\". Related event can not be defined");
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java
        LOG.warn("No event is assosiated with Azure build status \"" + commitStatus.state + "\". Related event can not be defined");
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsStatusPublisher.java`
#### Snippet
```java
  @Nullable
  RevisionStatus getRevisionStatus(@NotNull BuildPromotion buildPromotion, @Nullable CommitStatus commitStatus) {
    if (commitStatus == null) return null;
    Event event = getTriggeredEvent(commitStatus);
    boolean isSameBuildType = StringUtil.areEqual(getBuildName(buildPromotion), commitStatus.context.name);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/swarm/web/SwarmChangeLinkExtension.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpaceSettings.java`
#### Snippet
```java
    String connectionId = params.get(Constants.SPACE_CONNECTION_ID);
    if (connectionId == null)
      return null;
    OAuthConnectionDescriptor connectionDescriptor = myOAuthConnectionManager.findConnectionById(buildType.getProject(), connectionId);
    if (connectionDescriptor == null) {
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpaceSettings.java`
#### Snippet
```java
      return healthItemData;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubPublisher.java`
#### Snippet
```java
      params = getParams(buildPromotion);
    } catch (GitHubContextResolveException e) {
      return null;
    }
    ChangeStatusUpdater.Handler handler = myUpdater.getHandler(revision.getRoot(), params, this);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubPublisher.java`
#### Snippet
```java
    if (!revision.getRoot().getVcsName().equals("jetbrains.git")) {
      LOG.warn("No revisions were found to request GitHub status. Please check you have Git VCS roots in the build configuration");
      return null;
    }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubPublisher.java`
#### Snippet
```java
    final String context = params.get(Constants.GITHUB_CONTEXT);
    if (context == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubPublisher.java`
#### Snippet
```java
    if (commitStatus.state == null) {
      LOG.warn("No GitHub build status is provided. Related event can not be calculated");
      return null;
    }
    GitHubChangeState gitHubChangeState = GitHubChangeState.getByState(commitStatus.state);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubPublisher.java`
#### Snippet
```java
    if (gitHubChangeState == null) {
      LOG.warn("Unknown GitHub build status \"" + commitStatus.state + "\". Related event can not be calculated");
      return null;
    }
    switch (gitHubChangeState) {
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubPublisher.java`
#### Snippet
```java
        if (description == null) {
          LOG.info("Can not define exact event for \"Pending\" GitHub build status, because there is no description for status");
          return null;
        }
        if (description.contains(DefaultStatusMessages.BUILD_STARTED)) {
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubPublisher.java`
#### Snippet
```java
      case Error:
      case Failure:
        return null;  // these statuses do not affect on further behaviour
      default:
        LOG.warn("No event is assosiated with GitHub build status \"" + gitHubChangeState + "\". Related event can not be defined");
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubPublisher.java`
#### Snippet
```java
        LOG.warn("No event is assosiated with GitHub build status \"" + gitHubChangeState + "\". Related event can not be defined");
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubPublisher.java`
#### Snippet
```java
    if (build != null) {
      String value = build.getParametersProvider().get(Constants.GITHUB_CUSTOM_CONTEXT_BUILD_PARAM);
      if (value == null) return null;

      if (isRemovedFromQueue(build) && ReferencesResolverUtil.mayContainReference(value)) {
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubPublisher.java`
#### Snippet
```java

    String value = myBuildType.getParameters().get(Constants.GITHUB_CUSTOM_CONTEXT_BUILD_PARAM);
    if (value == null) return null;

    if(ReferencesResolverUtil.mayContainReference(value)) {
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubPublisher.java`
#### Snippet
```java
  RevisionStatus getRevisionStatus(@NotNull BuildPromotion buildPromotion, @Nullable CommitStatus commitStatus) {
    if (commitStatus == null) {
      return null;
    }
    Event triggeredEvent = getTriggeredEvent(commitStatus);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubPublisher.java`
#### Snippet
```java
  RevisionStatus getRevisionStatusForRemovedBuild(@NotNull SQueuedBuild removedBuild, @Nullable CommitStatus commitStatus) {
    if (commitStatus == null) {
      return null;
    }
    Event triggeredEvent = getTriggeredEvent(commitStatus);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
      String str = response.getContent();
      if (str == null) {
        return null;
      }
      LOG.debug("Stash response: " + str);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
      JsonElement json = new JsonParser().parse(str);
      if (!json.isJsonObject())
        return null;
      JsonObject jsonObj = json.getAsJsonObject();
      JsonElement errors = jsonObj.get("errors");
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
      JsonElement errors = jsonObj.get("errors");
      if (errors == null || !errors.isJsonArray())
        return null;
      JsonArray errorsArray = errors.getAsJsonArray();
      if (errorsArray.size() == 0)
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
      JsonArray errorsArray = errors.getAsJsonArray();
      if (errorsArray.size() == 0)
        return null;
      JsonElement error = errorsArray.get(0);
      if (error == null || !error.isJsonObject())
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
      JsonElement error = errorsArray.get(0);
      if (error == null || !error.isJsonObject())
        return null;
      JsonElement msg = error.getAsJsonObject().get("message");
      return msg != null ? msg.getAsString() : null;
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
        return null;
      JsonElement msg = error.getAsJsonObject().get("message");
      return msg != null ? msg.getAsString() : null;
    } catch (JsonSyntaxException e) {
      return null;
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
      return msg != null ? msg.getAsString() : null;
    } catch (JsonSyntaxException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
        myProblems.reportProblem("Commit Status Publisher has failed to prepare a request", StashPublisher.this, buildDescription, null, ex, LOG);
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
      } catch (PublisherException ex) {
        myProblems.reportProblem("Commit Status Publisher has failed to prepare a request", StashPublisher.this, buildDescription, null, ex, LOG);
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
    @Override
    public BuildStatistics getBuildStatistics() {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
    @Override
    protected String getPullRequestEndpointUrl(BuildRevision revision) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
  RevisionStatus getRevisionStatus(@NotNull BuildPromotion buildPromotion, @Nullable JsonStashBuildStatus buildStatus) {
    if (buildStatus == null) {
      return null;
    }
    Event event = getTriggeredEvent(buildStatus);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
  RevisionStatus getRevisionStatusForRemovedBuild(@NotNull SQueuedBuild removedBuild, @Nullable JsonStashBuildStatus buildStatus) {
    if (buildStatus == null) {
      return null;
    }
    Event event = getTriggeredEvent(buildStatus);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
    private JsonStashBuildStatus convertToActualStatus(@Nullable DeprecatedJsonStashBuildStatuses.Status status) {
      if (status == null) {
        return null;
      }
      return new JsonStashBuildStatus(status);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
      do {
        statuses = doLoadStatuses(baseEndpointUrl, processor, start, size, buildDescription, data);
        if (statuses == null || statuses.values == null || statuses.values.isEmpty()) return null;
        Optional<DeprecatedJsonStashBuildStatuses.Status> desiredStatusOp = statuses.values.stream()
                                                                                           .filter(status -> data.getKey().equals(status.key))
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
      } while (!statuses.isLastPage);

      return null;
    }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
        if (url == null) {
          LOG.debug("No endpoint URL is provided to get pull requests for revision " + revision.getRevision());
          return null;
        }
        LoggerUtil.logRequest(getId(), HttpMethod.GET, url, null);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
    if (buildStatus.state == null) {
      LOG.warn("No Bitbucket build status is provided. Related event can not be defined");
      return null;
    }
    StashBuildStatus status = StashBuildStatus.getByName(buildStatus.state);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
    if (status == null) {
      LOG.warn(String.format("Unknown Bitbucket build status: \"%s\". Related event can not be defined", buildStatus.state));
      return null;
    }
    switch (status) {
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
    switch (status) {
      case INPROGRESS:
        if (buildStatus.description == null) return null;
        return buildStatus.description.contains(DefaultStatusMessages.BUILD_QUEUED) ? Event.QUEUED :
               buildStatus.description.contains(DefaultStatusMessages.BUILD_REMOVED_FROM_QUEUE) ? Event.REMOVED_FROM_QUEUE :
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
        return buildStatus.description.contains(DefaultStatusMessages.BUILD_QUEUED) ? Event.QUEUED :
               buildStatus.description.contains(DefaultStatusMessages.BUILD_REMOVED_FROM_QUEUE) ? Event.REMOVED_FROM_QUEUE :
               buildStatus.description.contains(DefaultStatusMessages.BUILD_STARTED) ? Event.STARTED : null;

      case FAILED:
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
      case FAILED:
      case SUCCESSFUL:
        return null;  // these statuses do not affect on further behaviour
      default:
        LOG.warn("No event is assosiated with Bitbucket build status \"" + buildStatus.state + "\". Related event can not be defined");
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashPublisher.java`
#### Snippet
```java
        LOG.warn("No event is assosiated with Bitbucket build status \"" + buildStatus.state + "\". Related event can not be defined");
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherSettings.java`
#### Snippet
```java
  @Nullable
  default HttpCredentials getCredentials(@Nullable VcsRoot root, @NotNull Map<String, String> params) throws PublisherException {
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherSettings.java`
#### Snippet
```java
  @Nullable
  default Map<String, Object> checkHealth(@NotNull SBuildType buildType, @NotNull Map<String, String> params) {
   return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherSettings.java`
#### Snippet
```java
  @Nullable
  default public String getServerVersion(@NotNull String url) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritSettings.java`
#### Snippet
```java
  @Override
  public Map<String, String> transformParameters(@NotNull Map<String, String> params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java

    final String pullRequestId = getPullRequestId(repoName, branchName);
    if (pullRequestId == null) return null;

    //  /repos/:owner/:repo/pulls/:number
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java
      return head.sha;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java
    if (!matcher.matches()) {
      LOG.debug("Branch " + branchName + " for repo " + repoName + " does not look like pull request");
      return null;
    }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/api/impl/GitHubApiImpl.java`
#### Snippet
```java
    if (pullRequestId == null) {
      LOG.debug("Branch " + branchName + " for repo " + repoName + " does not contain pull request id");
      return null;
    }
    return pullRequestId;
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/AuthTypeAwareSettings.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
    private SBuild getBuild(final PerformingTask task) {
      Long buildId = task.getLongArg1();
      if (buildId == null) return null;

      return myBuildsManager.findBuildInstanceById(buildId);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
      Long promotionId = task.getLongArg1();
      if (promotionId == null)
        return null;

      return myBuildPromotionManager.findPromotionById(promotionId);
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
    } catch (BuildTypeNotFoundException e) {
      LOG.debug("Event: " + event.getName() + ", cannot find buildType for build " + LogUtil.describe(build));
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/CommitStatusPublisherListener.java`
#### Snippet
```java
    protected User getUser(PerformingTask task) {
      Long userId = task.getLongArg2();
      return userId == null ? null : myUserModel.findUserById(userId);
    }

```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer msgBuf` may be declared as 'StringBuilder'
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/PublisherSettingsController.java`
#### Snippet
```java

  private void reportTestConnectionFailure(@NotNull PublisherException ex, @NotNull ActionErrors errors) {
    StringBuffer msgBuf = new StringBuffer(ex.getMessage());
    Throwable cause = ex.getCause();
    if (null != cause) {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabPublisher.java`
#### Snippet
```java
    GitLabReceiveCommitStatus[] commitStatuses = get(url, null, Collections.singletonMap("PRIVATE-TOKEN", getPrivateToken()), processor);
    if (commitStatuses == null || commitStatuses.length == 0) {
      return new GitLabReceiveCommitStatus[0];
    }
    return commitStatuses;
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsPublisherSettings.java`
#### Snippet
```java
  }};

  private static final Set<Event> mySupportedEventsWithQueued = new HashSet<Event>() {{
    add(Event.QUEUED);
    add(Event.REMOVED_FROM_QUEUE);
```

### DoubleBraceInitialization
Double brace initialization
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/tfs/TfsPublisherSettings.java`
#### Snippet
```java
  private final OAuthTokensStorage myOAuthTokensStorage;
  private final SecurityContext mySecurityContext;
  private static final Set<Event> mySupportedEvents = new HashSet<Event>() {{
    add(Event.STARTED);
    add(Event.FINISHED);
```

### DoubleBraceInitialization
Double brace initialization
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabSettings.java`
#### Snippet
```java
  private static final Pattern URL_WITH_API_SUFFIX = Pattern.compile("(.*)/api/v.");

  private static final Set<Event> mySupportedEvents = new HashSet<Event>() {{
    add(Event.STARTED);
    add(Event.FINISHED);
```

### DoubleBraceInitialization
Double brace initialization
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gitlab/GitlabSettings.java`
#### Snippet
```java
  }};

  private static final Set<Event> mySupportedEventsWithQueued = new HashSet<Event>() {{
    add(Event.QUEUED);
    add(Event.REMOVED_FROM_QUEUE);
```

### DoubleBraceInitialization
Double brace initialization
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubSettings.java`
#### Snippet
```java
  private final SecurityContext mySecurityContext;
  private final CommitStatusesCache<CommitStatus> myStatusesCache;
  private static final Set<Event> mySupportedEvents = new HashSet<Event>() {{
    add(Event.STARTED);
    add(Event.FINISHED);
```

### DoubleBraceInitialization
Double brace initialization
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/github/GitHubSettings.java`
#### Snippet
```java
  }};

  private static final Set<Event> mySupportedEventsWithQueued = new HashSet<Event>() {{
    add(Event.QUEUED);
    add(Event.REMOVED_FROM_QUEUE);
```

### DoubleBraceInitialization
Double brace initialization
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/upsource/UpsourceSettings.java`
#### Snippet
```java

  private final VcsModificationHistory myVcsHistory;
  private static final Set<Event> mySupportedEvents = new HashSet<Event>() {{
    add(Event.STARTED);
    add(Event.FINISHED);
```

### DoubleBraceInitialization
Double brace initialization
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashSettings.java`
#### Snippet
```java
  static final GitRepositoryParser VCS_URL_PARSER = new GitRepositoryParser();

  private static final Set<Event> mySupportedEvents = new HashSet<Event>() {{
    add(Event.STARTED);
    add(Event.FINISHED);
```

### DoubleBraceInitialization
Double brace initialization
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/stash/StashSettings.java`
#### Snippet
```java
  }};

  private static final Set<Event> mySupportedEventsWithQueued = new HashSet<Event>() {{
    add(Event.QUEUED);
    add(Event.REMOVED_FROM_QUEUE);
```

### DoubleBraceInitialization
Double brace initialization
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpaceSettings.java`
#### Snippet
```java
  }};

  private static final Set<Event> mySupportedEventsWithQueued = new HashSet<Event>() {{
    add(Event.QUEUED);
    add(Event.REMOVED_FROM_QUEUE);
```

### DoubleBraceInitialization
Double brace initialization
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/space/SpaceSettings.java`
#### Snippet
```java
  @NotNull private final SecurityContext mySecurityContext;

  private static final Set<Event> mySupportedEvents = new HashSet<Event>() {{
    add(Event.STARTED);
    add(Event.FINISHED);
```

### DoubleBraceInitialization
Double brace initialization
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/swarm/commitPublisher/SwarmPublisherSettings.java`
#### Snippet
```java
  public static final String PARAM_CREATE_SWARM_TEST = "createSwarmTest";

  private static final Set<CommitStatusPublisher.Event> ourSupportedEvents = new HashSet<CommitStatusPublisher.Event>() {{
    add(CommitStatusPublisher.Event.QUEUED);
    add(CommitStatusPublisher.Event.REMOVED_FROM_QUEUE);
```

### DoubleBraceInitialization
Double brace initialization
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritSettings.java`
#### Snippet
```java
  }};
  private GerritClient myGerritClient;
  private static final Set<Event> mySupportedEvents = new HashSet<Event>() {{
    add(Event.FINISHED);
  }};
```

### DoubleBraceInitialization
Double brace initialization
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/gerrit/GerritSettings.java`
#### Snippet
```java

  private final ExtensionHolder myExtensionHolder;
  private final Map<String, String> myMandatoryProperties = new HashMap<String, String>() {{
          put(Constants.GERRIT_SERVER, "Server URL");
          put(Constants.GERRIT_PROJECT, "Gerrit project");
```

### DoubleBraceInitialization
Double brace initialization
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudSettings.java`
#### Snippet
```java
  }};

  private static final Set<Event> mySupportedEventsWithQueued = new HashSet<Event>() {{
    add(Event.QUEUED);
    add(Event.REMOVED_FROM_QUEUE);
```

### DoubleBraceInitialization
Double brace initialization
in `commit-status-publisher-server/src/main/java/jetbrains/buildServer/commitPublisher/bitbucketCloud/BitbucketCloudSettings.java`
#### Snippet
```java

  private String myDefaultApiUrl = DEFAULT_API_URL;
  private static final Set<Event> mySupportedEvents = new HashSet<Event>() {{
    add(Event.STARTED);
    add(Event.FINISHED);
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

