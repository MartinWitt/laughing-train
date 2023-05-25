# teamcity-git 
 
# Bad smells
I found 410 bad smells with 119 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 103 | true |
| SpringBeanConstructorArgInspection | 38 | false |
| FieldMayBeFinal | 28 | false |
| ConstantValue | 24 | false |
| UnusedAssignment | 15 | false |
| Deprecation | 14 | false |
| JavadocReference | 13 | false |
| DataFlowIssue | 13 | false |
| UnnecessaryToStringCall | 12 | true |
| IgnoreResultOfCall | 11 | false |
| UNCHECKED_WARNING | 11 | false |
| UNUSED_IMPORT | 8 | false |
| DuplicatedCode | 8 | false |
| CharsetObjectCanBeUsed | 8 | false |
| JavadocDeclaration | 8 | false |
| AutoCloseableResource | 7 | false |
| ArraysAsListWithZeroOrOneArgument | 7 | false |
| RedundantTypeArguments | 6 | false |
| NullableProblems | 6 | false |
| OptionalAssignedToNull | 4 | false |
| IOStreamConstructor | 4 | false |
| JavadocLinkAsPlainText | 3 | false |
| PointlessNullCheck | 3 | false |
| StringOperationCanBeSimplified | 3 | false |
| DeprecatedIsStillUsed | 3 | false |
| SpringXmlModelInspection | 3 | false |
| SpringXmlAutowireExplicitlyInspection | 3 | false |
| BusyWait | 3 | false |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| DuplicateBranchesInSwitch | 2 | false |
| FieldCanBeLocal | 2 | false |
| IfStatementWithIdenticalBranches | 2 | false |
| StringConcatenationInLoops | 2 | false |
| RedundantCollectionOperation | 2 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 2 | false |
| RedundantCast | 2 | false |
| CaughtExceptionImmediatelyRethrown | 2 | false |
| EmptyStatementBody | 1 | false |
| CommentedOutCode | 1 | false |
| RefusedBequest | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| TrivialStringConcatenation | 1 | false |
| EqualsBetweenInconvertibleTypes | 1 | false |
| BlockingMethodInNonBlockingContext | 1 | false |
| AccessStaticViaInstance | 1 | false |
| DuplicateThrows | 1 | false |
| InfiniteRecursion | 1 | false |
| NonAtomicOperationOnVolatileField | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| CatchMayIgnoreException | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| SuspiciousMethodCalls | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| UnnecessaryInitCause | 1 | false |
| TrivialIf | 1 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| ExcessiveRangeCheck | 1 | false |
| InstantiationOfUtilityClass | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Class\[classes.size()\]'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
  public String getFetchClasspath() {
    Set<Class> classes = fetchProcessClasses();
    return ClasspathUtil.composeClasspath(classes.toArray(new Class[classes.size()]), null, null);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Class\[classes.size()\]'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
    classes.add(LfsBlobLoader.class);
    classes.add(Counter.class);
    return ClasspathUtil.composeClasspath(classes.toArray(new Class[classes.size()]), null, null);
  }

```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitPathResolver.java`
#### Snippet
```java
public interface GitPathResolver {

  public String resolveGitPath(final BuildAgentConfiguration agentConfiguration, String pathToResolve) throws VcsException;

}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfig.java`
#### Snippet
```java
public interface PluginConfig extends MirrorConfig {

  static int DEFAULT_IDLE_TIMEOUT = 1800;

  @NotNull
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String FETCHER_INTERNAL_PROPERTIES_FILE = "fetcherInternalPropertiesFile";

  public static final String GIT_TRUST_STORE_PROVIDER = "gitTrustStoreProvider";

  /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String FETCHER_INTERNAL_PROPERTIES_FILE = "fetcherInternalPropertiesFile";

  public static final String GIT_TRUST_STORE_PROVIDER = "gitTrustStoreProvider";

  /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String FETCHER_INTERNAL_PROPERTIES_FILE = "fetcherInternalPropertiesFile";

  public static final String GIT_TRUST_STORE_PROVIDER = "gitTrustStoreProvider";

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String BRANCH_NAME = "branch";

  public static final String BRANCH_SPEC = "teamcity:branchSpec";

  /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String BRANCH_NAME = "branch";

  public static final String BRANCH_SPEC = "teamcity:branchSpec";

  /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String BRANCH_NAME = "branch";

  public static final String BRANCH_SPEC = "teamcity:branchSpec";

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The branch name property
   */
  public static final String SUBMODULES_CHECKOUT = "submoduleCheckout";
  /**
   * The user name property
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The branch name property
   */
  public static final String SUBMODULES_CHECKOUT = "submoduleCheckout";
  /**
   * The user name property
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The branch name property
   */
  public static final String SUBMODULES_CHECKOUT = "submoduleCheckout";
  /**
   * The user name property
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String GC_DUMP_FILE = "GC_DUMP_FILE";

  public static final String USERNAME_FOR_TAGS = "userForTags";

  public static final String SERVER_SIDE_AUTO_CRLF = "serverSideAutoCrlf";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String GC_DUMP_FILE = "GC_DUMP_FILE";

  public static final String USERNAME_FOR_TAGS = "userForTags";

  public static final String SERVER_SIDE_AUTO_CRLF = "serverSideAutoCrlf";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String GC_DUMP_FILE = "GC_DUMP_FILE";

  public static final String USERNAME_FOR_TAGS = "userForTags";

  public static final String SERVER_SIDE_AUTO_CRLF = "serverSideAutoCrlf";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String AGENT_GIT_PATH = "agentGitPath";
  public static final String TEAMCITY_AGENT_GIT_PATH = "TEAMCITY_GIT_PATH";
  public static final String TEAMCITY_AGENT_GIT_VERSION = "TEAMCITY_GIT_VERSION";
  /**
   * Path to bare repository dir, used in communication with Fetcher
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String AGENT_GIT_PATH = "agentGitPath";
  public static final String TEAMCITY_AGENT_GIT_PATH = "TEAMCITY_GIT_PATH";
  public static final String TEAMCITY_AGENT_GIT_VERSION = "TEAMCITY_GIT_VERSION";
  /**
   * Path to bare repository dir, used in communication with Fetcher
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String AGENT_GIT_PATH = "agentGitPath";
  public static final String TEAMCITY_AGENT_GIT_PATH = "TEAMCITY_GIT_PATH";
  public static final String TEAMCITY_AGENT_GIT_VERSION = "TEAMCITY_GIT_VERSION";
  /**
   * Path to bare repository dir, used in communication with Fetcher
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java

  public static final String AGENT_GIT_PATH = "agentGitPath";
  public static final String TEAMCITY_AGENT_GIT_PATH = "TEAMCITY_GIT_PATH";
  public static final String TEAMCITY_AGENT_GIT_VERSION = "TEAMCITY_GIT_VERSION";
  /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java

  public static final String AGENT_GIT_PATH = "agentGitPath";
  public static final String TEAMCITY_AGENT_GIT_PATH = "TEAMCITY_GIT_PATH";
  public static final String TEAMCITY_AGENT_GIT_VERSION = "TEAMCITY_GIT_VERSION";
  /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java

  public static final String AGENT_GIT_PATH = "agentGitPath";
  public static final String TEAMCITY_AGENT_GIT_PATH = "TEAMCITY_GIT_PATH";
  public static final String TEAMCITY_AGENT_GIT_VERSION = "TEAMCITY_GIT_VERSION";
  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The fetch URL property
   */
  public static final String FETCH_URL = "url";
  /**
   * The push URL property
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The fetch URL property
   */
  public static final String FETCH_URL = "url";
  /**
   * The push URL property
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The fetch URL property
   */
  public static final String FETCH_URL = "url";
  /**
   * The push URL property
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The vcs name
   */
  public static final String VCS_NAME = "jetbrains.git";
  /**
   * The user name property
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The vcs name
   */
  public static final String VCS_NAME = "jetbrains.git";
  /**
   * The user name property
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The vcs name
   */
  public static final String VCS_NAME = "jetbrains.git";
  /**
   * The user name property
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The property that specifies what part of working tree should be cleaned
   */
  public static final String AGENT_CLEAN_FILES_POLICY = "agentCleanFilesPolicy";

  public static final String AGENT_GIT_PATH = "agentGitPath";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The property that specifies what part of working tree should be cleaned
   */
  public static final String AGENT_CLEAN_FILES_POLICY = "agentCleanFilesPolicy";

  public static final String AGENT_GIT_PATH = "agentGitPath";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The property that specifies what part of working tree should be cleaned
   */
  public static final String AGENT_CLEAN_FILES_POLICY = "agentCleanFilesPolicy";

  public static final String AGENT_GIT_PATH = "agentGitPath";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   */
  public static final String REFSPEC = "REFSPEC";
  public static final String VCS_DEBUG_ENABLED = "VCS_DEBUG_ENABLED";
  public static final String THREAD_DUMP_FILE = "THREAD_DUMP_FILE";
  public static final String GC_DUMP_FILE = "GC_DUMP_FILE";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   */
  public static final String REFSPEC = "REFSPEC";
  public static final String VCS_DEBUG_ENABLED = "VCS_DEBUG_ENABLED";
  public static final String THREAD_DUMP_FILE = "THREAD_DUMP_FILE";
  public static final String GC_DUMP_FILE = "GC_DUMP_FILE";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   */
  public static final String REFSPEC = "REFSPEC";
  public static final String VCS_DEBUG_ENABLED = "VCS_DEBUG_ENABLED";
  public static final String THREAD_DUMP_FILE = "THREAD_DUMP_FILE";
  public static final String GC_DUMP_FILE = "GC_DUMP_FILE";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String AGENT_CLEAN_FILES_POLICY = "agentCleanFilesPolicy";

  public static final String AGENT_GIT_PATH = "agentGitPath";
  public static final String TEAMCITY_AGENT_GIT_PATH = "TEAMCITY_GIT_PATH";
  public static final String TEAMCITY_AGENT_GIT_VERSION = "TEAMCITY_GIT_VERSION";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String AGENT_CLEAN_FILES_POLICY = "agentCleanFilesPolicy";

  public static final String AGENT_GIT_PATH = "agentGitPath";
  public static final String TEAMCITY_AGENT_GIT_PATH = "TEAMCITY_GIT_PATH";
  public static final String TEAMCITY_AGENT_GIT_VERSION = "TEAMCITY_GIT_VERSION";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String AGENT_CLEAN_FILES_POLICY = "agentCleanFilesPolicy";

  public static final String AGENT_GIT_PATH = "agentGitPath";
  public static final String TEAMCITY_AGENT_GIT_PATH = "TEAMCITY_GIT_PATH";
  public static final String TEAMCITY_AGENT_GIT_VERSION = "TEAMCITY_GIT_VERSION";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The property that specifies when working tree should be cleaned on agent
   */
  public static final String AGENT_CLEAN_POLICY = "agentCleanPolicy";
  /**
   * The property that specifies what part of working tree should be cleaned
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The property that specifies when working tree should be cleaned on agent
   */
  public static final String AGENT_CLEAN_POLICY = "agentCleanPolicy";
  /**
   * The property that specifies what part of working tree should be cleaned
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The property that specifies when working tree should be cleaned on agent
   */
  public static final String AGENT_CLEAN_POLICY = "agentCleanPolicy";
  /**
   * The property that specifies what part of working tree should be cleaned
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String SERVER_SIDE_AUTO_CRLF = "serverSideAutoCrlf";

  public static final String REPORT_TAG_REVISIONS = "reportTagRevisions";

  //path to internal properties to use in Fetcher
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String SERVER_SIDE_AUTO_CRLF = "serverSideAutoCrlf";

  public static final String REPORT_TAG_REVISIONS = "reportTagRevisions";

  //path to internal properties to use in Fetcher
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String SERVER_SIDE_AUTO_CRLF = "serverSideAutoCrlf";

  public static final String REPORT_TAG_REVISIONS = "reportTagRevisions";

  //path to internal properties to use in Fetcher
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The user name property
   */
  public static final String PRIVATE_KEY_PATH = "privateKeyPath";

  /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The user name property
   */
  public static final String PRIVATE_KEY_PATH = "privateKeyPath";

  /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The user name property
   */
  public static final String PRIVATE_KEY_PATH = "privateKeyPath";

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The password property name
   */
  public static final String PASSPHRASE = VcsRoot.SECURE_PROPERTY_PREFIX + "passphrase";
  /**
   * The vcs name
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The password property name
   */
  public static final String PASSPHRASE = VcsRoot.SECURE_PROPERTY_PREFIX + "passphrase";
  /**
   * The vcs name
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The password property name
   */
  public static final String PASSPHRASE = VcsRoot.SECURE_PROPERTY_PREFIX + "passphrase";
  /**
   * The vcs name
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String USERNAME_FOR_TAGS = "userForTags";

  public static final String SERVER_SIDE_AUTO_CRLF = "serverSideAutoCrlf";

  public static final String REPORT_TAG_REVISIONS = "reportTagRevisions";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String USERNAME_FOR_TAGS = "userForTags";

  public static final String SERVER_SIDE_AUTO_CRLF = "serverSideAutoCrlf";

  public static final String REPORT_TAG_REVISIONS = "reportTagRevisions";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String USERNAME_FOR_TAGS = "userForTags";

  public static final String SERVER_SIDE_AUTO_CRLF = "serverSideAutoCrlf";

  public static final String REPORT_TAG_REVISIONS = "reportTagRevisions";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The branch name property
   */
  public static final String BRANCH_NAME = "branch";

  public static final String BRANCH_SPEC = "teamcity:branchSpec";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The branch name property
   */
  public static final String BRANCH_NAME = "branch";

  public static final String BRANCH_SPEC = "teamcity:branchSpec";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The branch name property
   */
  public static final String BRANCH_NAME = "branch";

  public static final String BRANCH_SPEC = "teamcity:branchSpec";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String REFSPEC = "REFSPEC";
  public static final String VCS_DEBUG_ENABLED = "VCS_DEBUG_ENABLED";
  public static final String THREAD_DUMP_FILE = "THREAD_DUMP_FILE";
  public static final String GC_DUMP_FILE = "GC_DUMP_FILE";

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String REFSPEC = "REFSPEC";
  public static final String VCS_DEBUG_ENABLED = "VCS_DEBUG_ENABLED";
  public static final String THREAD_DUMP_FILE = "THREAD_DUMP_FILE";
  public static final String GC_DUMP_FILE = "GC_DUMP_FILE";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String REFSPEC = "REFSPEC";
  public static final String VCS_DEBUG_ENABLED = "VCS_DEBUG_ENABLED";
  public static final String THREAD_DUMP_FILE = "THREAD_DUMP_FILE";
  public static final String GC_DUMP_FILE = "GC_DUMP_FILE";

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * Path to bare repository dir, used in communication with Fetcher
   */
  public static final String REPOSITORY_DIR_PROPERTY_NAME = "REPOSITORY_DIR";
  /**
   * Refspec to fetch, used in communication with Fetcher
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * Path to bare repository dir, used in communication with Fetcher
   */
  public static final String REPOSITORY_DIR_PROPERTY_NAME = "REPOSITORY_DIR";
  /**
   * Refspec to fetch, used in communication with Fetcher
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * Path to bare repository dir, used in communication with Fetcher
   */
  public static final String REPOSITORY_DIR_PROPERTY_NAME = "REPOSITORY_DIR";
  /**
   * Refspec to fetch, used in communication with Fetcher
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The ignore known hosts property
   */
  public static final String IGNORE_KNOWN_HOSTS = "ignoreKnownHosts";
  /**
   * The property that specifies when working tree should be cleaned on agent
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The ignore known hosts property
   */
  public static final String IGNORE_KNOWN_HOSTS = "ignoreKnownHosts";
  /**
   * The property that specifies when working tree should be cleaned on agent
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The ignore known hosts property
   */
  public static final String IGNORE_KNOWN_HOSTS = "ignoreKnownHosts";
  /**
   * The property that specifies when working tree should be cleaned on agent
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The user name property
   */
  public static final String USERNAME_STYLE = "usernameStyle";
  /**
   * The ignore known hosts property
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The user name property
   */
  public static final String USERNAME_STYLE = "usernameStyle";
  /**
   * The ignore known hosts property
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The user name property
   */
  public static final String USERNAME_STYLE = "usernameStyle";
  /**
   * The ignore known hosts property
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The user name property
   */
  public static final String AUTH_METHOD = "authMethod";
  /**
   * The user name property
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The user name property
   */
  public static final String AUTH_METHOD = "authMethod";
  /**
   * The user name property
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The user name property
   */
  public static final String AUTH_METHOD = "authMethod";
  /**
   * The user name property
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * (Refreshable) token id
   */
  public static final String TOKEN_ID = "tokenId";

  /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * (Refreshable) token id
   */
  public static final String TOKEN_ID = "tokenId";

  /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * (Refreshable) token id
   */
  public static final String TOKEN_ID = "tokenId";

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The push URL property
   */
  public static final String PUSH_URL = "push_url";
  /**
   * The path property
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The push URL property
   */
  public static final String PUSH_URL = "push_url";
  /**
   * The path property
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The push URL property
   */
  public static final String PUSH_URL = "push_url";
  /**
   * The path property
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The path property
   */
  public static final String PATH = "path";
  /**
   * The branch name property
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The path property
   */
  public static final String PATH = "path";
  /**
   * The branch name property
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The path property
   */
  public static final String PATH = "path";
  /**
   * The branch name property
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * Refspec to fetch, used in communication with Fetcher
   */
  public static final String REFSPEC = "REFSPEC";
  public static final String VCS_DEBUG_ENABLED = "VCS_DEBUG_ENABLED";
  public static final String THREAD_DUMP_FILE = "THREAD_DUMP_FILE";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * Refspec to fetch, used in communication with Fetcher
   */
  public static final String REFSPEC = "REFSPEC";
  public static final String VCS_DEBUG_ENABLED = "VCS_DEBUG_ENABLED";
  public static final String THREAD_DUMP_FILE = "THREAD_DUMP_FILE";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * Refspec to fetch, used in communication with Fetcher
   */
  public static final String REFSPEC = "REFSPEC";
  public static final String VCS_DEBUG_ENABLED = "VCS_DEBUG_ENABLED";
  public static final String THREAD_DUMP_FILE = "THREAD_DUMP_FILE";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The user name property
   */
  public static final String USERNAME = "username";
  /**
   * The user name property
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The user name property
   */
  public static final String USERNAME = "username";
  /**
   * The user name property
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The user name property
   */
  public static final String USERNAME = "username";
  /**
   * The user name property
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * A prefix for build parameter with vcs branch name of git root
   */
  public static final String GIT_ROOT_BUILD_BRANCH_PREFIX = "teamcity.git.build.vcs.branch.";

  String RECORD_SEPARATOR = new String(new char[]{30});
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * A prefix for build parameter with vcs branch name of git root
   */
  public static final String GIT_ROOT_BUILD_BRANCH_PREFIX = "teamcity.git.build.vcs.branch.";

  String RECORD_SEPARATOR = new String(new char[]{30});
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * A prefix for build parameter with vcs branch name of git root
   */
  public static final String GIT_ROOT_BUILD_BRANCH_PREFIX = "teamcity.git.build.vcs.branch.";

  String RECORD_SEPARATOR = new String(new char[]{30});
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The password property name
   */
  public static final String PASSWORD = VcsRoot.SECURE_PROPERTY_PREFIX + "password";
  /**
   * The password property name
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The password property name
   */
  public static final String PASSWORD = VcsRoot.SECURE_PROPERTY_PREFIX + "password";
  /**
   * The password property name
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
   * The password property name
   */
  public static final String PASSWORD = VcsRoot.SECURE_PROPERTY_PREFIX + "password";
  /**
   * The password property name
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String VCS_DEBUG_ENABLED = "VCS_DEBUG_ENABLED";
  public static final String THREAD_DUMP_FILE = "THREAD_DUMP_FILE";
  public static final String GC_DUMP_FILE = "GC_DUMP_FILE";

  public static final String USERNAME_FOR_TAGS = "userForTags";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String VCS_DEBUG_ENABLED = "VCS_DEBUG_ENABLED";
  public static final String THREAD_DUMP_FILE = "THREAD_DUMP_FILE";
  public static final String GC_DUMP_FILE = "GC_DUMP_FILE";

  public static final String USERNAME_FOR_TAGS = "userForTags";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java
  public static final String VCS_DEBUG_ENABLED = "VCS_DEBUG_ENABLED";
  public static final String THREAD_DUMP_FILE = "THREAD_DUMP_FILE";
  public static final String GC_DUMP_FILE = "GC_DUMP_FILE";

  public static final String USERNAME_FOR_TAGS = "userForTags";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java

  //path to internal properties to use in Fetcher
  public static final String FETCHER_INTERNAL_PROPERTIES_FILE = "fetcherInternalPropertiesFile";

  public static final String GIT_TRUST_STORE_PROVIDER = "gitTrustStoreProvider";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java

  //path to internal properties to use in Fetcher
  public static final String FETCHER_INTERNAL_PROPERTIES_FILE = "fetcherInternalPropertiesFile";

  public static final String GIT_TRUST_STORE_PROVIDER = "gitTrustStoreProvider";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Constants.java`
#### Snippet
```java

  //path to internal properties to use in Fetcher
  public static final String FETCHER_INTERNAL_PROPERTIES_FILE = "fetcherInternalPropertiesFile";

  public static final String GIT_TRUST_STORE_PROVIDER = "gitTrustStoreProvider";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentPluginConfig.java`
#### Snippet
```java

  @NotNull
  public GitExec getGitExec();

  int getCheckoutIdleTimeoutSeconds();
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitHubPasswordAuthRootRegistryFactory.java`
#### Snippet
```java

public interface GitHubPasswordAuthRootRegistryFactory {
  static final String REPORT_TYPE = "gitHubPasswordAuthHealthReport";

  static boolean isEnabled() {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitHubPasswordAuthRootRegistryFactory.java`
#### Snippet
```java

public interface GitHubPasswordAuthRootRegistryFactory {
  static final String REPORT_TYPE = "gitHubPasswordAuthHealthReport";

  static boolean isEnabled() {
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/FetchSettings.java`
#### Snippet
```java
  }

  public static enum FetchMode {
    FETCH_REF_SPECS,
    FETCH_ALL_REFS,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/ServerPluginConfig.java`
#### Snippet
```java
  String getPatchBuilderClassName();

  public boolean passEnvToChildProcess();

  int getFixedSubmoduleCommitSearchDepth();
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/RevisionCacheType.java`
#### Snippet
```java
  private final String myFileName;

  private RevisionCacheType(@NotNull String fileName) {
    myFileName = fileName;
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitProgress.java`
#### Snippet
```java
  void reportProgress(float progressPercents, @NotNull String stage);

  static GitProgress NO_OP = new GitProgress() {
    public void reportProgress(@NotNull final String progress) {
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitNativeOperationsStatus.java`
#### Snippet
```java
  boolean isNativeGitOperationsEnabled();

  public boolean setNativeGitOperationsEnabled(boolean nativeGitOperatoinsEnabled);
}
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/GitUtils.java`
#### Snippet
```java
    for (int i = 0; i < pc.length; i++) {
      String f = pc[i];
      if (f.length() == 0 || ".".equals(f)) {
        // do nothing
      } else if ("..".equals(f)) {
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (5 lines)
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/RepositoryManagerImpl.java`
#### Snippet
```java
  private URIish getCanonicalURI(@NotNull final URIish uri) {
    return uri;
//    return new URIish()
//      .setScheme(uri.getScheme())
//      .setHost(uri.getHost())
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentGitFacadeImpl.java`
#### Snippet
```java

  @NotNull
  public CloneCommand clone() {
    return new CloneCommandImpl(createCommandLine());
  }
```

## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'TransportFactoryImpl'#treeend

*** ** * ** ***

|------------------------------------|---|-------------------------------------|
| **TransportFactoryImpl(...):**     |   | **Bean:**                           |
| ServerPluginConfig config          |   | Autowired: config(PluginConfigImpl) |
| VcsRootSshKeyManager sshKeyManager |   | **???**                             |

*** ** * ** ***

|---------------------------------------------|---|--------------------------------------------|
| **TransportFactoryImpl(...):**              |   | **Bean:**                                  |
| ServerPluginConfig config                   |   | Autowired: config(PluginConfigImpl)        |
| VcsRootSshKeyManager sshKeyManager          |   | **???**                                    |
| GitTrustStoreProvider gitTrustStoreProvider |   | Autowired: null(GitTrustStoreProviderImpl) |
in `git-server/src/META-INF/build-server-plugin-git.xml`
#### Snippet
```java
       default-autowire="constructor">
  <bean id="config" class="jetbrains.buildServer.buildTriggers.vcs.git.PluginConfigImpl"/>
  <bean id="transport" class="jetbrains.buildServer.buildTriggers.vcs.git.TransportFactoryImpl"/>
  <bean id="fetchCommand" class="jetbrains.buildServer.buildTriggers.vcs.git.FetchCommandImpl"/>
  <bean id="repoOperations" class="jetbrains.buildServer.buildTriggers.vcs.git.command.impl.GitRepoOperationsImpl"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'FetchCommandImpl'#treeend

*** ** * ** ***

|-------------------------------------|---|-------------------------------------------------|
| **FetchCommandImpl(...):**          |   | **Bean:**                                       |
| ServerPluginConfig config           |   | Autowired: config(PluginConfigImpl)             |
| TransportFactory transportFactory   |   | Autowired: transport(TransportFactoryImpl)      |
| FetcherProperties fetcherProperties |   | Autowired: fetcherProperties(FetcherProperties) |
| VcsRootSshKeyManager sshKeyManager  |   | **???**                                         |

*** ** * ** ***

|---------------------------------------------|---|-------------------------------------------------|
| **FetchCommandImpl(...):**                  |   | **Bean:**                                       |
| ServerPluginConfig config                   |   | Autowired: config(PluginConfigImpl)             |
| TransportFactory transportFactory           |   | Autowired: transport(TransportFactoryImpl)      |
| FetcherProperties fetcherProperties         |   | Autowired: fetcherProperties(FetcherProperties) |
| VcsRootSshKeyManager sshKeyManager          |   | **???**                                         |
| GitTrustStoreProvider gitTrustStoreProvider |   | Autowired: null(GitTrustStoreProviderImpl)      |
in `git-server/src/META-INF/build-server-plugin-git.xml`
#### Snippet
```java
  <bean id="config" class="jetbrains.buildServer.buildTriggers.vcs.git.PluginConfigImpl"/>
  <bean id="transport" class="jetbrains.buildServer.buildTriggers.vcs.git.TransportFactoryImpl"/>
  <bean id="fetchCommand" class="jetbrains.buildServer.buildTriggers.vcs.git.FetchCommandImpl"/>
  <bean id="repoOperations" class="jetbrains.buildServer.buildTriggers.vcs.git.command.impl.GitRepoOperationsImpl"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitRepositoryInitializingExtension"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitRepoOperationsImpl'#treeend

*** ** * ** ***

|------------------------------------|---|--------------------------------------------|
| **GitRepoOperationsImpl(...):**    |   | **Bean:**                                  |
| ServerPluginConfig config          |   | Autowired: config(PluginConfigImpl)        |
| TransportFactory transportFactory  |   | Autowired: transport(TransportFactoryImpl) |
| VcsRootSshKeyManager sshKeyManager |   | **???**                                    |
| FetchCommand jGitFetchCommand      |   | Autowired: fetchCommand(FetchCommandImpl)  |

*** ** * ** ***

|--------------------------------------------------|---|--------------------------------------------------|
| **GitRepoOperationsImpl(...):**                  |   | **Bean:**                                        |
| ServerPluginConfig config                        |   | Autowired: config(PluginConfigImpl)              |
| GitNativeOperationsStatus nativeOperationsStatus |   | Autowired: repoOperations(GitRepoOperationsImpl) |
| TransportFactory transportFactory                |   | Autowired: transport(TransportFactoryImpl)       |
| VcsRootSshKeyManager sshKeyManager               |   | **???**                                          |
| FetchCommand jGitFetchCommand                    |   | Autowired: fetchCommand(FetchCommandImpl)        |
| ServerMetrics serverMetrics                      |   | **???**                                          |

*** ** * ** ***

|--------------------------------------------------------|---|--------------------------------------------------|
| **GitRepoOperationsImpl(...):**                        |   | **Bean:**                                        |
| ServerPluginConfig config                              |   | Autowired: config(PluginConfigImpl)              |
| GitNativeOperationsStatus nativeOperationsStatus       |   | Autowired: repoOperations(GitRepoOperationsImpl) |
| TransportFactory transportFactory                      |   | Autowired: transport(TransportFactoryImpl)       |
| VcsRootSshKeyManager sshKeyManager                     |   | **???**                                          |
| FetchCommand jGitFetchCommand                          |   | Autowired: fetchCommand(FetchCommandImpl)        |
| Function\<String, Counter\> fetchDurationTimerProvider |   | **???**                                          |
in `git-server/src/META-INF/build-server-plugin-git.xml`
#### Snippet
```java
  <bean id="transport" class="jetbrains.buildServer.buildTriggers.vcs.git.TransportFactoryImpl"/>
  <bean id="fetchCommand" class="jetbrains.buildServer.buildTriggers.vcs.git.FetchCommandImpl"/>
  <bean id="repoOperations" class="jetbrains.buildServer.buildTriggers.vcs.git.command.impl.GitRepoOperationsImpl"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitRepositoryInitializingExtension"/>
  <bean id="jetbrainsGitServer" class="jetbrains.buildServer.buildTriggers.vcs.git.GitVcsSupport">
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitVcsSupport'#treeend

*** ** * ** ***

|-------------------------------------------------------|---|-------------------------------------------------------------|
| **GitVcsSupport(...):**                               |   | **Bean:**                                                   |
| GitRepoOperations gitRepoOperations                   |   | Autowired: repoOperations(GitRepoOperationsImpl)            |
| ServerPluginConfig config                             |   | Autowired: config(PluginConfigImpl)                         |
| ResetCacheRegister resetCacheManager                  |   | **???**                                                     |
| TransportFactory transportFactory                     |   | Autowired: transport(TransportFactoryImpl)                  |
| RepositoryManager repositoryManager                   |   | Autowired: repositoryManager(RepositoryManagerImpl)         |
| GitMapFullPath mapFullPath                            |   | Autowired: mapFullPath(GitMapFullPath)                      |
| CommitLoader commitLoader                             |   | Autowired: null(CommitLoaderImpl)                           |
| VcsRootSshKeyManager sshKeyManager                    |   | **???**                                                     |
| VcsOperationProgressProvider progressProvider         |   | **???**                                                     |
| GitResetCacheHandler resetCacheHandler                |   | Autowired: null(GitResetCacheHandler)                       |
| ResetRevisionsCacheHandler resetRevisionsCacheHandler |   | Autowired: null(ResetRevisionsCacheHandler)                 |
| TokenRefresher tokenRefresher                         |   | **???**                                                     |
| TestConnectionSupport customTestConnection            |   | \<constructor-arg index="12"\>\<null/\>\</constructor-arg\> |

*** ** * ** ***

|-------------------------------------------------------|---|-------------------------------------------------------------|
| **GitVcsSupport(...):**                               |   | **Bean:**                                                   |
| GitRepoOperations gitRepoOperations                   |   | Autowired: repoOperations(GitRepoOperationsImpl)            |
| ServerPluginConfig config                             |   | Autowired: config(PluginConfigImpl)                         |
| ResetCacheRegister resetCacheManager                  |   | **???**                                                     |
| TransportFactory transportFactory                     |   | Autowired: transport(TransportFactoryImpl)                  |
| RepositoryManager repositoryManager                   |   | Autowired: repositoryManager(RepositoryManagerImpl)         |
| GitMapFullPath mapFullPath                            |   | Autowired: mapFullPath(GitMapFullPath)                      |
| CommitLoader commitLoader                             |   | Autowired: null(CommitLoaderImpl)                           |
| VcsRootSshKeyManager sshKeyManager                    |   | **???**                                                     |
| VcsOperationProgressProvider progressProvider         |   | **???**                                                     |
| GitResetCacheHandler resetCacheHandler                |   | Autowired: null(GitResetCacheHandler)                       |
| ResetRevisionsCacheHandler resetRevisionsCacheHandler |   | Autowired: null(ResetRevisionsCacheHandler)                 |
| GitTrustStoreProvider gitTrustStoreProvider           |   | Autowired: null(GitTrustStoreProviderImpl)                  |
| TokenRefresher tokenRefresher                         |   | \<constructor-arg index="12"\>\<null/\>\</constructor-arg\> |
| TestConnectionSupport customTestConnection            |   | **???**                                                     |
in `git-server/src/META-INF/build-server-plugin-git.xml`
#### Snippet
```java
  <bean id="repoOperations" class="jetbrains.buildServer.buildTriggers.vcs.git.command.impl.GitRepoOperationsImpl"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitRepositoryInitializingExtension"/>
  <bean id="jetbrainsGitServer" class="jetbrains.buildServer.buildTriggers.vcs.git.GitVcsSupport">
    <constructor-arg index="12"><null/></constructor-arg>
  </bean>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitUrlSupport'#treeend

*** ** * ** ***

|-------------------------------|---|----------------------------------------------|
| **GitUrlSupport(...):**       |   | **Bean:**                                    |
| GitVcsSupport gitSupport      |   | Autowired: jetbrainsGitServer(GitVcsSupport) |
| TokenRefresher tokenRefresher |   | **???**                                      |
in `git-server/src/META-INF/build-server-plugin-git.xml`
#### Snippet
```java
    <constructor-arg index="12"><null/></constructor-arg>
  </bean>
  <bean id="urlSupport" class="jetbrains.buildServer.buildTriggers.vcs.git.GitUrlSupport"/>
  <bean id="remoteRepositoryUrlInvestigator" class="jetbrains.buildServer.buildTriggers.vcs.git.RemoteRepositoryUrlInvestigatorImpl"/>
  <bean id="mirrorManager" class="jetbrains.buildServer.buildTriggers.vcs.git.MirrorManagerImpl"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'CleanupRunner'#treeend

*** ** * ** ***

|---------------------------|---|-------------------------------------|
| **CleanupRunner(...):**   |   | **Bean:**                           |
| ExecutorServices executor |   | **???**                             |
| ServerPluginConfig config |   | Autowired: config(PluginConfigImpl) |
| Cleanup cleanup           |   | Autowired: cleaner(Cleanup)         |
in `git-server/src/META-INF/build-server-plugin-git.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GcErrors"/>
  <bean id="cleaner" class="jetbrains.buildServer.buildTriggers.vcs.git.Cleanup"/>
  <bean id="cleanerRunner" class="jetbrains.buildServer.buildTriggers.vcs.git.CleanupRunner"/>
  <bean id="fetcherProperties" class="jetbrains.buildServer.buildTriggers.vcs.git.FetcherProperties"/>
  <bean id="mergeSupport" class="jetbrains.buildServer.buildTriggers.vcs.git.GitMergeSupport"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitTrustStoreProviderImpl'#treeend

*** ** * ** ***

|---------------------------------------------|---|-----------|
| **GitTrustStoreProviderImpl(...):**         |   | **Bean:** |
| SSLTrustStoreProvider sslTrustStoreProvider |   | **???**   |
in `git-server/src/META-INF/build-server-plugin-git.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.ResetRevisionsCacheHandler"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitResetCacheHandler"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitTrustStoreProviderImpl"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitCustomizeVcsRootExtension"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitHubPasswordAuthRootRegistryFactoryImpl"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitAgentSSHService'#treeend

*** ** * ** ***

|----------------------------------------------------|---|--------------------------------------------|
| **GitAgentSSHService(...):**                       |   | **Bean:**                                  |
| BuildAgent agent                                   |   | **???**                                    |
| BuildAgentConfiguration agentConfiguration         |   | **???**                                    |
| PluginDescriptor pluginDescriptor                  |   | **???**                                    |
| VcsRootSshKeyManagerProvider sshKeyManagerProvider |   | Autowired: null(SshKeyManagerProviderImpl) |
| CurrentBuildTracker buildTracker                   |   | **???**                                    |
in `git-agent/src/META-INF/build-agent-plugin-git.xml`
#### Snippet
```java
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <bean id="gitAgentSshService" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.GitAgentSSHService" />
  <bean id="gitAgent" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.GitAgentVcsSupport" />
  <bean id="fs" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.FSImpl" />
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitHubPasswordAuthRootRegistryFactoryImpl'#treeend

*** ** * ** ***

|---------------------------------------------------------------------------|---|-----------|
| **GitHubPasswordAuthRootRegistryFactoryImpl(...):**                       |   | **Bean:** |
| EventDispatcher\<BuildServerListener\> buildServerEventDispatcher         |   | **???**   |
| EventDispatcher\<RepositoryStateListener\> repositoryStateEventDispatcher |   | **???**   |
| ProjectManager projectManager                                             |   | **???**   |
| ServerResponsibility serverResponsibility                                 |   | **???**   |
| MultiNodesEvents multiNodesEvents                                         |   | **???**   |
| TimeService timeService                                                   |   | **???**   |
in `git-server/src/META-INF/build-server-plugin-git.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitTrustStoreProviderImpl"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitCustomizeVcsRootExtension"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitHubPasswordAuthRootRegistryFactoryImpl"/>
</beans>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitAgentVcsSupport'#treeend

*** ** * ** ***

|----------------------------------------------------------------|---|---------------------------------------------------|
| **GitAgentVcsSupport(...):**                                   |   | **Bean:**                                         |
| FS fs                                                          |   | Autowired: fs(FSImpl)                             |
| SmartDirectoryCleaner directoryCleaner                         |   | **???**                                           |
| GitAgentSSHService sshService                                  |   | Autowired: gitAgentSshService(GitAgentSSHService) |
| PluginConfigFactory configFactory                              |   | Autowired: configFactory(PluginConfigFactoryImpl) |
| MirrorManager mirrorManager                                    |   | Autowired: mirrorManager(MirrorManagerImpl)       |
| SubmoduleManager submoduleManager                              |   | Autowired: submoduleManager(SubmoduleManagerImpl) |
| GitMetaFactory gitMetaFactory                                  |   | Autowired: null(GitMetaFactoryImpl)               |
| EventDispatcher\<AgentLifeCycleListener\> agentEventDispatcher |   | **???**                                           |
| AgentTokenStorage tokenStorage                                 |   | **???**                                           |
in `git-agent/src/META-INF/build-agent-plugin-git.xml`
#### Snippet
```java
       default-autowire="constructor">
  <bean id="gitAgentSshService" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.GitAgentSSHService" />
  <bean id="gitAgent" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.GitAgentVcsSupport" />
  <bean id="fs" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.FSImpl" />
  <bean id="gitPathResolver" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.GitPathResolverImpl"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AgentStartupGitDetector'#treeend

*** ** * ** ***

|-------------------------------------------------|---|-----------|
| **AgentStartupGitDetector(...):**               |   | **Bean:** |
| ExtensionHolder extensionHolder                 |   | **???**   |
| BuildAgentConfiguration buildAgentConfiguration |   | **???**   |
in `git-agent/src/META-INF/build-agent-plugin-git.xml`
#### Snippet
```java
  <bean id="gitPathResolver" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.GitPathResolverImpl"/>
  <bean id="gitDetector" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.GitDetectorImpl"/>
  <bean id="agentStratupGitDetector" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.AgentStartupGitDetector"/>
  <bean id="configFactory" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.PluginConfigFactoryImpl"/>
  <bean id="hashCalculator" class="jetbrains.buildServer.buildTriggers.vcs.git.HashCalculatorImpl"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'PluginConfigFactoryImpl'#treeend

*** ** * ** ***

|-------------------------------------|---|-----------------------------------------|
| **PluginConfigFactoryImpl(...):**   |   | **Bean:**                               |
| BuildAgentConfiguration agentConfig |   | **???**                                 |
| GitDetector gitDetector             |   | Autowired: gitDetector(GitDetectorImpl) |
in `git-agent/src/META-INF/build-agent-plugin-git.xml`
#### Snippet
```java
  <bean id="gitDetector" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.GitDetectorImpl"/>
  <bean id="agentStratupGitDetector" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.AgentStartupGitDetector"/>
  <bean id="configFactory" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.PluginConfigFactoryImpl"/>
  <bean id="hashCalculator" class="jetbrains.buildServer.buildTriggers.vcs.git.HashCalculatorImpl"/>
  <bean id="mirrorConfig" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.AgentMirrorConfig"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AgentMirrorConfig'#treeend

*** ** * ** ***

|-------------------------------------|---|-----------|
| **AgentMirrorConfig(...):**         |   | **Bean:** |
| BuildAgentConfiguration agentConfig |   | **???**   |
in `git-agent/src/META-INF/build-agent-plugin-git.xml`
#### Snippet
```java
  <bean id="configFactory" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.PluginConfigFactoryImpl"/>
  <bean id="hashCalculator" class="jetbrains.buildServer.buildTriggers.vcs.git.HashCalculatorImpl"/>
  <bean id="mirrorConfig" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.AgentMirrorConfig"/>
  <bean id="mirrorCleaner" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.AgentMirrorCleaner"/>
  <bean id="сheckoutDirCleaner" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.CheckoutDirectoryCleaner"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AgentMirrorCleaner'#treeend

*** ** * ** ***

|-----------------------------------|---|---------------------------------------------------|
| **AgentMirrorCleaner(...):**      |   | **Bean:**                                         |
| MirrorManager mirrorManager       |   | Autowired: mirrorManager(MirrorManagerImpl)       |
| SubmoduleManager submoduleManager |   | Autowired: submoduleManager(SubmoduleManagerImpl) |
| AgentTokenStorage tokenStorage    |   | **???**                                           |
in `git-agent/src/META-INF/build-agent-plugin-git.xml`
#### Snippet
```java
  <bean id="hashCalculator" class="jetbrains.buildServer.buildTriggers.vcs.git.HashCalculatorImpl"/>
  <bean id="mirrorConfig" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.AgentMirrorConfig"/>
  <bean id="mirrorCleaner" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.AgentMirrorCleaner"/>
  <bean id="сheckoutDirCleaner" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.CheckoutDirectoryCleaner"/>
  <bean id="remoteRepositoryUrlInvestigator" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.RemoteRepositoryUrlInvestigatorImpl"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'CheckoutDirectoryCleaner'#treeend

*** ** * ** ***

|------------------------------------|---|-----------------------------------------|
| **CheckoutDirectoryCleaner(...):** |   | **Bean:**                               |
| DirectoryMap directoryMap          |   | **???**                                 |
| GitDetector gitDetector            |   | Autowired: gitDetector(GitDetectorImpl) |
in `git-agent/src/META-INF/build-agent-plugin-git.xml`
#### Snippet
```java
  <bean id="mirrorConfig" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.AgentMirrorConfig"/>
  <bean id="mirrorCleaner" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.AgentMirrorCleaner"/>
  <bean id="сheckoutDirCleaner" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.CheckoutDirectoryCleaner"/>
  <bean id="remoteRepositoryUrlInvestigator" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.RemoteRepositoryUrlInvestigatorImpl"/>
  <bean id="mirrorManager" class="jetbrains.buildServer.buildTriggers.vcs.git.MirrorManagerImpl"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SshKeyManagerProviderImpl'#treeend

*** ** * ** ***

|-------------------------------------|---|-----------|
| **SshKeyManagerProviderImpl(...):** |   | **Bean:** |
| ExtensionsProvider extensions       |   | **???**   |
in `git-agent/src/META-INF/build-agent-plugin-git.xml`
#### Snippet
```java
  <bean id="mirrorManager" class="jetbrains.buildServer.buildTriggers.vcs.git.MirrorManagerImpl"/>
  <bean id="submoduleManager" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.SubmoduleManagerImpl"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.agent.SshKeyManagerProviderImpl"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.agent.GitMetaFactoryImpl"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.agent.GCIdleTask"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GCIdleTask'#treeend

*** ** * ** ***

|--------------------------------------------------|---|---------------------------------------------|
| **GCIdleTask(...):**                             |   | **Bean:**                                   |
| EventDispatcher\<AgentLifeCycleListener\> events |   | **???**                                     |
| AgentIdleTasks idleTasks                         |   | **???**                                     |
| BuildAgentConfiguration agentConfig              |   | **???**                                     |
| MirrorManager mirrorManager                      |   | Autowired: mirrorManager(MirrorManagerImpl) |
in `git-agent/src/META-INF/build-agent-plugin-git.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.agent.SshKeyManagerProviderImpl"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.agent.GitMetaFactoryImpl"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.agent.GCIdleTask"/>
</beans>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitExtensionRegistry'#treeend

*** ** * ** ***

|---------------------------------------------|---|-----------------------------------|
| **GitExtensionRegistry(...):**              |   | **Bean:**                         |
| GitVcsSupport git                           |   | **???**                           |
| ExtensionHolder extensionHolder             |   | **???**                           |
| Collection\<GitServerExtension\> extensions |   | Autowired: null(GitBranchSupport) |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
       default-autowire="constructor">

  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitExtensionRegistry"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitBranchSupport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitBuildParametersProvider"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitSubmodulesUsageStatistics'#treeend

*** ** * ** ***

|----------------------------------------|---|-----------|
| **GitSubmodulesUsageStatistics(...):** |   | **Bean:** |
| VcsManager vcsManager                  |   | **???**   |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitBranchSupport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitBuildParametersProvider"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitSubmodulesUsageStatistics"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitNotFoundHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitNotFoundHealthPage"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitNotFoundHealthReport'#treeend

*** ** * ** ***

|-----------------------------------|---|-----------|
| **GitNotFoundHealthReport(...):** |   | **Bean:** |
| Cleanup cleanup                   |   | **???**   |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitBuildParametersProvider"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitSubmodulesUsageStatistics"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitNotFoundHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitNotFoundHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitGcErrorsHealthReport"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitNotFoundHealthPage'#treeend

*** ** * ** ***

|-----------------------------------|---|-----------|
| **GitNotFoundHealthPage(...):**   |   | **Bean:** |
| PluginDescriptor pluginDescriptor |   | **???**   |
| PagePlaces pagePlaces             |   | **???**   |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitSubmodulesUsageStatistics"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitNotFoundHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitNotFoundHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitGcErrorsHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitGcErrorsHealthPage"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitGcErrorsHealthReport'#treeend

*** ** * ** ***

|-----------------------------------|---|-----------|
| **GitGcErrorsHealthReport(...):** |   | **Bean:** |
| GcErrors gcErrors                 |   | **???**   |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitNotFoundHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitNotFoundHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitGcErrorsHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitGcErrorsHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitAgentVersionHealthReport"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitGcErrorsHealthPage'#treeend

*** ** * ** ***

|-----------------------------------|---|-----------|
| **GitGcErrorsHealthPage(...):**   |   | **Bean:** |
| PluginDescriptor pluginDescriptor |   | **???**   |
| PagePlaces pagePlaces             |   | **???**   |
| ServerPaths serverPaths           |   | **???**   |
| MirrorManager mirrorManager       |   | **???**   |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitNotFoundHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitGcErrorsHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitGcErrorsHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitAgentVersionHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitAgentVersionHealthPage"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitAgentVersionHealthReport'#treeend

*** ** * ** ***

|---------------------------------------|---|-----------|
| **GitAgentVersionHealthReport(...):** |   | **Bean:** |
| BuildAgentManagerEx agentManager      |   | **???**   |
| AgentPoolManager agentPoolManager     |   | **???**   |
| WebLinks webLinks                     |   | **???**   |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitGcErrorsHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitGcErrorsHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitAgentVersionHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitAgentVersionHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitHubPasswordAuthHealthReport"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitAgentVersionHealthPage'#treeend

*** ** * ** ***

|-------------------------------------|---|-----------|
| **GitAgentVersionHealthPage(...):** |   | **Bean:** |
| PluginDescriptor pluginDescriptor   |   | **???**   |
| PagePlaces pagePlaces               |   | **???**   |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitGcErrorsHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitAgentVersionHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitAgentVersionHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitHubPasswordAuthHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitHubPasswordAuthHealthPage"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitHubPasswordAuthHealthReport'#treeend

*** ** * ** ***

|-------------------------------------------------------|---|-----------|
| **GitHubPasswordAuthHealthReport(...):**              |   | **Bean:** |
| GitHubPasswordAuthRootRegistryFactory registryFactory |   | **???**   |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitAgentVersionHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitAgentVersionHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitHubPasswordAuthHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitHubPasswordAuthHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitServerVersionHealthReport"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitHubPasswordAuthHealthPage'#treeend

*** ** * ** ***

|----------------------------------------|---|-----------|
| **GitHubPasswordAuthHealthPage(...):** |   | **Bean:** |
| PluginDescriptor pluginDescriptor      |   | **???**   |
| PagePlaces pagePlaces                  |   | **???**   |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitAgentVersionHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitHubPasswordAuthHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitHubPasswordAuthHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitServerVersionHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitServerVersionHealthPage"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitServerVersionHealthReport'#treeend

*** ** * ** ***

|----------------------------------------|---|-----------|
| **GitServerVersionHealthReport(...):** |   | **Bean:** |
| GitRepoOperations gitOperations        |   | **???**   |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitHubPasswordAuthHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitHubPasswordAuthHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitServerVersionHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitServerVersionHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.SwitchToNativeGitHealthReport"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitServerVersionHealthPage'#treeend

*** ** * ** ***

|--------------------------------------|---|-----------|
| **GitServerVersionHealthPage(...):** |   | **Bean:** |
| PluginDescriptor pluginDescriptor    |   | **???**   |
| PagePlaces pagePlaces                |   | **???**   |
| GitRepoOperations gitOperations      |   | **???**   |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitHubPasswordAuthHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitServerVersionHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitServerVersionHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.SwitchToNativeGitHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.SwitchToNativeGitHealthPage"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SwitchToNativeGitHealthPage'#treeend

*** ** * ** ***

|--------------------------------------------|---|--------------------------------------------------------|
| **SwitchToNativeGitHealthPage(...):**      |   | **Bean:**                                              |
| PluginDescriptor pluginDescriptor          |   | **???**                                                |
| PagePlaces pagePlaces                      |   | **???**                                                |
| GitMainConfigProcessor mainConfigProcessor |   | Autowired: mainConfigProcessor(GitMainConfigProcessor) |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.GitServerVersionHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.SwitchToNativeGitHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.SwitchToNativeGitHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitExternalChangeViewerExtension"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.SpaceExternalChangeViewerExtension"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitExternalChangeViewerExtension'#treeend

*** ** * ** ***

|--------------------------------------------|---|-----------|
| **GitExternalChangeViewerExtension(...):** |   | **Bean:** |
| ExtensionHolder extensionHolder            |   | **???**   |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.SwitchToNativeGitHealthReport"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.SwitchToNativeGitHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitExternalChangeViewerExtension"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.SpaceExternalChangeViewerExtension"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.CleanupCustomizer"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SpaceExternalChangeViewerExtension'#treeend

*** ** * ** ***

|-------------------------------------------------|---|-----------|
| **SpaceExternalChangeViewerExtension(...):**    |   | **Bean:** |
| ExtensionHolder extensionHolder                 |   | **???**   |
| OAuthConnectionsManager oAuthConnectionsManager |   | **???**   |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.health.SwitchToNativeGitHealthPage"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitExternalChangeViewerExtension"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.SpaceExternalChangeViewerExtension"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.CleanupCustomizer"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.TrustedCertificatesInitializer"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'CleanupCustomizer'#treeend

*** ** * ** ***

|-----------------------------|---|-----------|
| **CleanupCustomizer(...):** |   | **Bean:** |
| Cleanup cleanup             |   | **???**   |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitExternalChangeViewerExtension"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.SpaceExternalChangeViewerExtension"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.CleanupCustomizer"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.TrustedCertificatesInitializer"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitUrlSupportInitializer"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'TrustedCertificatesInitializer'#treeend

*** ** * ** ***

|-------------------------------------------------|---|-----------|
| **TrustedCertificatesInitializer(...):**        |   | **Bean:** |
| ServerPaths serverPaths                         |   | **???**   |
| GitTrustStoreProviderImpl gitTrustStoreProvider |   | **???**   |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.SpaceExternalChangeViewerExtension"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.CleanupCustomizer"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.TrustedCertificatesInitializer"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitUrlSupportInitializer"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitClonesUpdater">
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitUrlSupportInitializer'#treeend

*** ** * ** ***

|---------------------------------------|---|-----------|
| **GitUrlSupportInitializer(...):**    |   | **Bean:** |
| GitUrlSupport urlSupport              |   | **???**   |
| ProjectManager projectManager         |   | **???**   |
| ExtensionsProvider extensionsProvider |   | **???**   |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.CleanupCustomizer"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.TrustedCertificatesInitializer"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitUrlSupportInitializer"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitClonesUpdater">
    <constructor-arg index="0" ref="repositoryStateEventDispatcher"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitClonesUpdater'#treeend

*** ** * ** ***

|--------------------------------------------------------------|---|---------------------------------------------------------------------|
| **GitClonesUpdater(...):**                                   |   | **Bean:**                                                           |
| EventDispatcher\<RepositoryStateListener\> eventDispatcher   |   | \<constructor-arg index="0" ref="repositoryStateEventDispatcher"/\> |
| EventDispatcher\<BuildServerListener\> serverEventDispatcher |   | \<constructor-arg index="1" ref="serverDispatcher"/\>               |
| ServerResponsibility serverResponsibility                    |   | **???**                                                             |
| GitVcsSupport gitVcsSupport                                  |   | **???**                                                             |
| RepositoryManager repositoryManager                          |   | **???**                                                             |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.TrustedCertificatesInitializer"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitUrlSupportInitializer"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitClonesUpdater">
    <constructor-arg index="0" ref="repositoryStateEventDispatcher"/>
    <constructor-arg index="1" ref="serverDispatcher"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitMainConfigProcessor'#treeend

*** ** * ** ***

|-------------------------------------|---|-----------|
| **GitMainConfigProcessor(...):**    |   | **Bean:** |
| MainConfigManager mainConfigManager |   | **???**   |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
    <constructor-arg index="1" ref="serverDispatcher"/>
  </bean>
  <bean id="mainConfigProcessor" class="jetbrains.buildServer.buildTriggers.vcs.git.GitMainConfigProcessor"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitDiagnosticsTab"/>
</beans>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitDiagnosticsTab'#treeend

*** ** * ** ***

|--------------------------------------------|---|--------------------------------------------------------|
| **GitDiagnosticsTab(...):**                |   | **Bean:**                                              |
| PagePlaces pagePlaces                      |   | **???**                                                |
| WebControllerManager controllerManager     |   | **???**                                                |
| PluginDescriptor pluginDescriptor          |   | **???**                                                |
| GitVcsSupport vcsSupport                   |   | **???**                                                |
| GitRepoOperations gitOperations            |   | **???**                                                |
| GitMainConfigProcessor mainConfigProcessor |   | Autowired: mainConfigProcessor(GitMainConfigProcessor) |
| ProjectManager projectManager              |   | **???**                                                |
| ExecutorServices executorServices          |   | **???**                                                |
| TeamCityNodes nodes                        |   | **???**                                                |
| ServerPaths serverPaths                    |   | **???**                                                |
| BuildServerEx server                       |   | **???**                                                |
| AuditLogFactory auditLogFactory            |   | **???**                                                |
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  </bean>
  <bean id="mainConfigProcessor" class="jetbrains.buildServer.buildTriggers.vcs.git.GitMainConfigProcessor"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitDiagnosticsTab"/>
</beans>

```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/SubmodulesCheckoutPolicy.java`
#### Snippet
```java
      case NON_RECURSIVE_CHECKOUT:
      case NON_RECURSIVE_CHECKOUT_IGNORING_ERRORS:
        return IGNORE;
      default:
        throw new UnsupportedOperationException("Unknown submodules checkout policy: " + policy);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitCommitSupport.java`
#### Snippet
```java
          break;
        case USERID:
          commit.setAuthor(new PersonIdent(userName, userName + "@TeamCity"));
          break;
        case FULL:
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder msg` can be replaced with 'String'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
  private static void logFetchResults(@NotNull FetchResult result) {
    for (TrackingRefUpdate update : result.getTrackingRefUpdates()) {
      StringBuilder msg = new StringBuilder();
      msg.append("update ref remote name: ").append(update.getRemoteName())
        .append(", local name: ").append(update.getLocalName())
```

## RuleId[id=Deprecation]
### Deprecation
'isUseShallowCloneFromMirrorToCheckoutDir()' is deprecated
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterWithMirror.java`
#### Snippet
```java
  @Override
  protected void ensureCommitLoaded(boolean fetchRequired) throws VcsException {
    if (myPluginConfig.isUseShallowCloneFromMirrorToCheckoutDir()) {
      getCommitLoader(myTargetDirectory).loadShallowBranch(myRevision, myFullBranchName);
    } else {
```

### Deprecation
'loadShallowBranch(java.lang.String, java.lang.String)' is deprecated
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterWithMirror.java`
#### Snippet
```java
  protected void ensureCommitLoaded(boolean fetchRequired) throws VcsException {
    if (myPluginConfig.isUseShallowCloneFromMirrorToCheckoutDir()) {
      getCommitLoader(myTargetDirectory).loadShallowBranch(myRevision, myFullBranchName);
    } else {
      super.ensureCommitLoaded(fetchRequired);
```

### Deprecation
'UTF_8' is deprecated
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/UpdateRefBatchCommandImpl.java`
#### Snippet
```java
import org.jetbrains.git4idea.util.FastByteArrayBuilder;

import static org.apache.commons.codec.Charsets.UTF_8;


```

### Deprecation
'UTF_8' is deprecated
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/UpdateRefBatchCommandImpl.java`
#### Snippet
```java

  private void cmd(String cmd) {
    myInput.append(cmd.getBytes(UTF_8));
    myInput.append((byte)0x20); // SP
  }
```

### Deprecation
'UTF_8' is deprecated
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/UpdateRefBatchCommandImpl.java`
#### Snippet
```java
  private void arg(@Nullable final String arg) {
    if (arg != null) {
      myInput.append(arg.getBytes(UTF_8));
    }
    myInput.append((byte)0x0); // NUL
```

### Deprecation
'isUseShallowCloneFromMirrorToCheckoutDir()' is deprecated
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
    final File gitDir = new File(myTargetDirectory, ".git");
    if (gitDir.exists()) {
      if ((myPluginConfig.isUseShallowClone(myRoot) || myPluginConfig.isUseShallowCloneFromMirrorToCheckoutDir()) ^ isShallowRepository(gitDir)) {
        // settings changed: recreate repo in checkout dir
        initDirectory(true);
```

### Deprecation
'org.apache.http.conn.ssl.SSLSocketFactory' is deprecated
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SNISSLSocketFactory.java`
#### Snippet
```java
import java.net.Socket;

public class SNISSLSocketFactory extends SSLSocketFactory {
  private static final Logger LOG = Logger.getInstance(SSLHttpClientConnection.class.getName());

```

### Deprecation
'org.apache.http.conn.ssl.X509HostnameVerifier' is deprecated
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SNISSLSocketFactory.java`
#### Snippet
```java
  }

  public SNISSLSocketFactory(final SSLContext sslContext, final X509HostnameVerifier hostnameVerifier) {
    super(sslContext, hostnameVerifier);
  }
```

### Deprecation
'getAllRefs()' is deprecated
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/CommitLoaderImpl.java`
#### Snippet
```java
    if (settings.getRefSpecs().isEmpty()) return;

    Map<String, Ref> oldRefs = new HashMap<>(db.getAllRefs());
    myGitRepoOperations.fetchCommand(fetchURI.toString()).fetch(db, fetchURI, settings);
    if (myPluginConfig.refreshObjectDatabaseAfterFetch()) {
```

### Deprecation
'getAllRefs()' is deprecated
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/CommitLoaderImpl.java`
#### Snippet
```java
      db.getObjectDatabase().refresh();
    }
    Map<String, Ref> newRefs = new HashMap<>(db.getAllRefs());
    myMapFullPath.invalidateRevisionsCache(db, oldRefs, newRefs);
  }
```

### Deprecation
'AutoLFInputStream(java.io.InputStream, boolean, boolean)' is deprecated
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitCommitSupport.java`
#### Snippet
```java
        FileUtil.copy(content, bytes);
        //taken from WorkingTreeIterator
        AutoLFInputStream eolStream = new AutoLFInputStream(new ByteArrayInputStream(bytes.toByteArray()), true, true);
        long length;
        try {
```

### Deprecation
'AutoLFInputStream(java.io.InputStream, boolean, boolean)' is deprecated
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitCommitSupport.java`
#### Snippet
```java
          eolStream.close();
        }
        eolStream = new AutoLFInputStream(new ByteArrayInputStream(bytes.toByteArray()), true, true);
        myObjectMap.put(path, myObjectWriter.insert(Constants.OBJ_BLOB, length, eolStream));
      } catch (IOException e) {
```

### Deprecation
'getAllRefs()' is deprecated
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
                                   @NotNull AuthSettings authSettings) throws Exception {
    final Map<String, Ref> remoteRefMap = getRemoteRefs(config, transportFactory, db, uri, authSettings);
    for (Map.Entry<String, Ref> e : db.getAllRefs().entrySet()) {
      if (remoteRefMap.containsKey(e.getKey())) continue;
      try {
```

### Deprecation
'getRefs(java.lang.String)' is deprecated
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
      return false;
    try (ObjectReader reader = db.getObjectDatabase().newReader()) {
      for (Ref ref : db.getRefDatabase().getRefs(RefDatabase.ALL).values()) {
        if (reader.has(ref.getObjectId()))
          return true;
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
    int deprecatedFetchTimeout = TeamCityProperties.getInteger("teamcity.git.fetch.timeout", DEFAULT_IDLE_TIMEOUT);
    int idleTimeout = getIdleTimeoutSeconds();
    if (deprecatedFetchTimeout > idleTimeout)
      return deprecatedFetchTimeout;
    return idleTimeout;
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/LogUtil.java`
#### Snippet
```java

  public static String describe(@NotNull Repository db, @NotNull URIish uri) {
    return db.getDirectory() != null ? db.getDirectory().getAbsolutePath() + ", " : "" + uri;
  }
}
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentMirrorCleaner.java`
#### Snippet
```java
  private Collection<File> listFiles(@NotNull File dir) {
    final File[] files = dir.listFiles();
    return files == null || files.length == 0 ? Collections.<File>emptyList() : Arrays.asList(files);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/DiffCommandImpl.java`
#### Snippet
```java
    ExecResult r = CommandUtil.runCommand(cmd);
    String stdout = r.getStdout().trim();
    return StringUtil.isEmpty(stdout) ? Collections.<String>emptyList() : Arrays.asList(StringUtil.splitByLines(stdout));
  }
}
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/MissingSubmoduleEntryException.java`
#### Snippet
```java
                                        @NotNull String mainRepositoryCommit,
                                        @NotNull String submodulePath) {
    this(mainRepositoryUrl, mainRepositoryCommit, submodulePath, Collections.<String>emptySet());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/commitInfo/CommitTreeProcessor.java`
#### Snippet
```java
  }

  public static final TreeResult EMPTY = new TreeResult(Collections.<String, AnyObjectId>emptyMap(), null);

  public static class TreeResult {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/MissingSubmoduleCommitException.java`
#### Snippet
```java
                                         @NotNull String submoduleRepositoryUrl,
                                         @NotNull String submoduleCommit) {
    this(mainRepositoryUrl, mainRepositoryCommit, submodulePath, submoduleRepositoryUrl, submoduleCommit, Collections.<String>emptySet());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/MissingSubmoduleConfigException.java`
#### Snippet
```java
                                         @NotNull String mainRepositoryCommit,
                                         @NotNull String submodulePath) {
    this(mainRepositoryUrl, mainRepositoryCommit, submodulePath, Collections.<String>emptySet());
  }

```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `git-server/src/org/eclipse/jgit/internal/storage/file/MemoryMappedPackIndex.java`
#### Snippet
```java
    @NotNull
    @Override
    public Iterator<MutableEntry> iterator() {
      assertNotClosed();

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/FetchSettings.java`
#### Snippet
```java
        myProgress.reportProgress(str.trim());
      }
      @Override public void write(@NotNull final char[] cbuf, final int off, final int len) {}
      @Override public void flush() {}
      @Override public void close() {}
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java
      }

      public int read(@NotNull final byte[] b, final int off, final int len) throws IOException {
        return delegate.read(b, off, len);
      }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java
      }

      public int read(@NotNull final byte[] b) throws IOException {
        return delegate.read(b);
      }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/LoadContentAction.java`
#### Snippet
```java

    @Override
    public int read(@NotNull final byte[] b) throws IOException {
      return getHost().read(b);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/LoadContentAction.java`
#### Snippet
```java

    @Override
    public int read(@NotNull final byte[] b, final int off, final int len) throws IOException {
      return getHost().read(b, off, len);
    }
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitVcsSupport.java`
#### Snippet
```java
  @Nullable
  protected <T extends VcsExtension> T getVcsCustomExtension(@NotNull final Class<T> extensionClass) {
    if (ChangesInfoBuilder.class.equals(extensionClass)) {
      return extensionClass.cast(getCollectChangesPolicy());
    }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/TransportFactoryImpl.java`
#### Snippet
```java

  /**
   * This is a work-around for an issue http://youtrack.jetbrains.net/issue/TW-9933.
   * Due to bug in jgit (https://bugs.eclipse.org/bugs/show_bug.cgi?id=315564),
   * in the case of not-existing local repository we get an obscure exception:
```

### JavadocLinkAsPlainText
Link specified as plain text
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/TransportFactoryImpl.java`
#### Snippet
```java
  /**
   * This is a work-around for an issue http://youtrack.jetbrains.net/issue/TW-9933.
   * Due to bug in jgit (https://bugs.eclipse.org/bugs/show_bug.cgi?id=315564),
   * in the case of not-existing local repository we get an obscure exception:
   * 'org.eclipse.jgit.errors.NotSupportedException: URI not supported: x:/git/myrepo.git',
```

### JavadocLinkAsPlainText
Link specified as plain text
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
   *
   * URIish doesn't throw an exception for such uri in its constructor (see
   * https://bugs.eclipse.org/bugs/show_bug.cgi?id=315571 for explanation why),
   * exception is thrown only on attempt to open transport.
   *
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/BaseAuthCommandImpl.java`
#### Snippet
```java
  private int myTimeout = CommandUtil.DEFAULT_COMMAND_TIMEOUT_SEC;
  private AuthSettings myAuthSettings;
  private URIish myRepoUrl;
  private final List<Runnable> myPreActions = new ArrayList<Runnable>();
  private int myRetryAttempts = 1;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `git-server/src/org/eclipse/jgit/internal/storage/file/MemoryMappedPackIndex.java`
#### Snippet
```java
  private class PackIndexV2MM extends PackIndex {
    private final MappedByteBuffer myBuffer;
    private final long mySize;
    private final int[] fanoutTable = new int[FANOUT];
    private final int objectCnt;
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/health/GitGcErrorsHealthPage.java`
#### Snippet
```java
            String url = myMirrorManager.getUrl(((File)key).getName());
            if (url != null) {
              sortedErrors.put(url, Pair.create(errorMessageSanitizer.sanitize(((File)key).getCanonicalPath()), (String) value));
            }
          } catch (IOException e) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterWithAlternates.java`
#### Snippet
```java
      throw new IllegalStateException(gitDir.getAbsolutePath() + " doesn't exist");
    File objectsInfo = new File(new File(gitDir, "objects"), "info");
    objectsInfo.mkdirs();
    File alternates = new File(objectsInfo, "alternates");
    try {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterWithAlternates.java`
#### Snippet
```java
        final AgentGitFacade gitFacade = myGitFactory.create(submoduleDir);
        if (!submoduleGitDir.exists())  {
          submoduleGitDir.mkdirs();
          gitFacade.init().call();
        }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterWithMirror.java`
#### Snippet
```java
    if (!bareRepositoryDir.exists()) {
      LOG.info("Init " + mirrorDescription);
      bareRepositoryDir.mkdirs();
      git.init().setBare(true).call();
      configureRemoteUrl(bareRepositoryDir, fetchUrl);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
    }

    myTargetDirectory.mkdirs();
    myLogger.message("The .git directory is missing in '" + myTargetDirectory + "'. Running 'git init'...");
    final AgentGitFacade gitFacade = myGitFactory.create(myTargetDirectory);
```

### IgnoreResultOfCall
Result of `File.setReadable()` is ignored
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitCommandLine.java`
#### Snippet
```java

      //set permissions to 600, without that ssh client rejects the key on *nix
      privateKey.setReadable(false, false);
      privateKey.setReadable(true, true);
      privateKey.setWritable(false, false);
```

### IgnoreResultOfCall
Result of `File.setReadable()` is ignored
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitCommandLine.java`
#### Snippet
```java
      //set permissions to 600, without that ssh client rejects the key on *nix
      privateKey.setReadable(false, false);
      privateKey.setReadable(true, true);
      privateKey.setWritable(false, false);
      privateKey.setWritable(true, true);
```

### IgnoreResultOfCall
Result of `File.setWritable()` is ignored
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitCommandLine.java`
#### Snippet
```java
      privateKey.setReadable(false, false);
      privateKey.setReadable(true, true);
      privateKey.setWritable(false, false);
      privateKey.setWritable(true, true);

```

### IgnoreResultOfCall
Result of `File.setWritable()` is ignored
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitCommandLine.java`
#### Snippet
```java
      privateKey.setReadable(true, true);
      privateKey.setWritable(false, false);
      privateKey.setWritable(true, true);

      return privateKey;
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/RepositoryManagerImpl.java`
#### Snippet
```java
          throw new IOException("Cannot create directory " + dir.getAbsolutePath());
        if (!timestamp.exists())
          timestamp.createNewFile();
        FileUtil.writeFileAndReportErrors(timestamp, String.valueOf(System.currentTimeMillis()));
        myLastAccessTime.put(dir, System.nanoTime());
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/RepositoryRevisionCache.java`
#### Snippet
```java

    File cache = getCacheFile(myRepositoryDir, myType);
    cache.getParentFile().mkdirs();
    try (PrintStream printer = new PrintStream(new BufferedOutputStream(new FileOutputStream(cache)))) {
      myCache.forEachEntry((revision, contains) -> {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Cleanup.java`
#### Snippet
```java
    File objectsDir = new File(result, "objects");
    File objectsInfo = new File(objectsDir, "info");
    objectsInfo.mkdirs();
    FileUtil.writeFileAndReportErrors(new File(objectsInfo, "alternates"), new File(gitDir, "objects").getCanonicalPath());

```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'jetbrains.buildServer.buildTriggers.vcs.git.command.ssl.SslOperations.deleteSslOption(jetbrains.buildServer.buildTriggers.vcs.git.command.GitFacade)' accessed via instance reference
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/ssl/SSLInvestigator.java`
#### Snippet
```java
  public void setCertificateOptions(@NotNull final AgentGitFacade gitFacade) {
    if (!isNeedCustomCertificates()) {
      mySslOperations.deleteSslOption(gitFacade);
      return;
    }
```

## RuleId[id=OptionalAssignedToNull]
### OptionalAssignedToNull
Optional value is compared with null
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/GitRepoOperationsImpl.java`
#### Snippet
```java
    GitExec getOrDetect() {
      Optional<GitExec> val = myRef;
      if (val != null) {
        return val.orElse(null);
      }
```

### OptionalAssignedToNull
Optional value is compared with null
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/GitRepoOperationsImpl.java`
#### Snippet
```java
      try {
        val = myRef;
        if (val != null) {
          return val.orElse(null);
        }
```

### OptionalAssignedToNull
Null is used for 'Optional' type in assignment
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/GitRepoOperationsImpl.java`
#### Snippet
```java

    void reset() {
      myRef = null;
    }
  }
```

### OptionalAssignedToNull
Null is used for 'Optional' type in declaration
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/GitRepoOperationsImpl.java`
#### Snippet
```java
  private class LazyGitExec {
    private final ReentrantLock myLock = new ReentrantLock();
    private volatile Optional<GitExec> myRef = null;

    @Nullable
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitDetectorImpl.java`
#### Snippet
```java
    try {
      File git = new File(gitPath);
      if (git.isAbsolute()) {
        File cygpath = new File(git.getParentFile(), "cygpath.exe");
        if (cygpath.canExecute())
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitMapFullPath.java`
#### Snippet
```java
      long resetCounter = repositoryCache.getResetCounter();
      Boolean hasRevision = repositoryCache.hasRevision(revision);
      if (hasRevision != null) {
        if (LOG.isDebugEnabled())
          LOG.debug("RevisionCache hit: root " + LogUtil.describe(root) + (hasRevision ? " contains " : " doesn't contain ") + "revision " + revision);
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/RevParseCommandImpl.java`
#### Snippet
```java
package jetbrains.buildServer.buildTriggers.vcs.git.agent.command.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/RevParseCommandImpl.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jetbrains.buildServer.ExecResult;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/RevParseCommandImpl.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jetbrains.buildServer.ExecResult;
import jetbrains.buildServer.buildTriggers.vcs.git.agent.command.RevParseCommand;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.buildTriggers.vcs.git.GitVcsRoot;`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/Context.java`
#### Snippet
```java
import java.util.Map;
import jetbrains.buildServer.buildTriggers.vcs.git.GitProgressLogger;
import jetbrains.buildServer.buildTriggers.vcs.git.GitVcsRoot;
import jetbrains.buildServer.buildTriggers.vcs.git.GitVersion;
import org.jetbrains.annotations.NotNull;
```

### UNUSED_IMPORT
Unused import `import org.apache.http.client.HttpClient;`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java
import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
```

### UNUSED_IMPORT
Unused import `import org.apache.http.cookie.CookieSpec;`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.*;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
```

### UNUSED_IMPORT
Unused import `import java.net.ProtocolException;`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
```

### UNUSED_IMPORT
Unused import `import static org.eclipse.jgit.util.HttpSupport.METHOD_POST;`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java

import static org.eclipse.jgit.util.HttpSupport.*;
import static org.eclipse.jgit.util.HttpSupport.METHOD_POST;

/**
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java
  }

  private void execute() throws IOException, ClientProtocolException {
    if (resp != null) {
      return;
```

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'parseBoolean()' call
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
      try {
        String s = System.getenv(GitSSHHandler.SSH_IGNORE_KNOWN_HOSTS_ENV);
        if(s != null && Boolean.parseBoolean(s)) {
          return true;
        }
```

### PointlessNullCheck
Unnecessary 'null' check before 'isImportant()' call
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/CommandUtil.java`
#### Snippet
```java
        message += ": " + exceptionMessage;
    }
    if (exception != null && isImportant(exception)) {
      Writer stackWriter = new StringWriter();
      exception.printStackTrace(new PrintWriter(stackWriter));
```

### PointlessNullCheck
Unnecessary 'null' check before 'isImportant()' call
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchProcess.java`
#### Snippet
```java
        if (t instanceof SubmoduleFetchException) {
          Throwable cause = t.getCause();
          printStackTrace = cause != null && isImportant(cause);
        }
        System.err.println(msg);
```

## RuleId[id=InfiniteRecursion]
### InfiniteRecursion
Method `getContent()` recurses infinitely, and can only end by throwing an exception
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitAbstractVcsFileContentProvider.java`
#### Snippet
```java

  @NotNull
  public byte[] getContent(@NotNull VcsModification vcsModification,
                           @NotNull VcsChangeInfo change,
                           @NotNull VcsChangeInfo.ContentType contentType,
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+` in loop
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/FetchProgressMonitor.java`
#### Snippet
```java
      String cmpstr = String.valueOf(cmp);
      while (cmpstr.length() < twstr.length())
        cmpstr = " " + cmpstr;
      final int pcnt = (cmp * 100 / totalWork);
      if (pcnt < 100)
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/FetchProgressMonitor.java`
#### Snippet
```java
      String cmpstr = String.valueOf(cmp);
      while (cmpstr.length() < twstr.length())
        cmpstr = " " + cmpstr;
      final int pcnt = (cmp * 100 / totalWork);
      if (pcnt < 100)
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `targetPath` initializer `null` is redundant
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentVcsSupport.java`
#### Snippet
```java
  private Pair<CheckoutMode, String> getTargetPathAndMode(@NotNull CheckoutRules rules) {
    if (isRequireSparseCheckout(rules)) {
      String targetPath = null;
      try {
        targetPath = processCheckoutRulesForAgentSideCheckout(rules, false);
```

### UnusedAssignment
Variable `workingDir` initializer `cmd.getWorkingDirectory()` is redundant
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/BaseAuthCommandImpl.java`
#### Snippet
```java
      }
      if (Errors.isCorruptedIndexError(e)) {
        File workingDir = cmd.getWorkingDirectory();
        File gitIndex = new File(new File(workingDir, ".git"), "index");
        throw new GitIndexCorruptedException(gitIndex, e);
```

### UnusedAssignment
Variable `gitIndex` initializer `new File(new File(workingDir, ".git"), "index")` is redundant
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/BaseAuthCommandImpl.java`
#### Snippet
```java
      if (Errors.isCorruptedIndexError(e)) {
        File workingDir = cmd.getWorkingDirectory();
        File gitIndex = new File(new File(workingDir, ".git"), "index");
        throw new GitIndexCorruptedException(gitIndex, e);
      }
```

### UnusedAssignment
Variable `line` initializer `null` is redundant
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/credentials/CredentialsHelper.java`
#### Snippet
```java
      final LinkedHashMap<String, String> attributes = new LinkedHashMap<String, String>();
      final BufferedReader reader = new BufferedReader(new InputStreamReader(in));
      String line = null;
      while ((line = reader.readLine()) != null) {
        if (line.length() == 0) {
```

### UnusedAssignment
Variable `ati` initializer `null` is redundant
in `git-server/src/org/eclipse/jgit/treewalk/SubmoduleAwareTreeIterator.java`
#### Snippet
```java
      Repository r = mySubmoduleResolver.getRepository();
      ObjectReader or = r.newObjectReader();
      AbstractTreeIterator ati = null;
      try {
        ati = myWrappedIterator.createSubtreeIterator(or);
```

### UnusedAssignment
Variable `version` initializer `null` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitAbstractVcsFileContentProvider.java`
#### Snippet
```java
                              ? change.getBeforeChangeRevisionNumber()
                              : change.getAfterChangeRevisionNumber();
    String version = null;
    if (!isValid(vcsChangeVersion)) {
      LOG.warn("Invalid version '" + vcsChangeVersion + "', try using version from VCS modification");
```

### UnusedAssignment
Variable `count` initializer `0` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
    StringBuilder sb = new StringBuilder();
    Reader processInput = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
    int count = 0;
    while ((count = processInput.read(chars)) != -1) {
      final String str = new String(chars, 0, count);
```

### UnusedAssignment
Variable `gcListener` initializer `null` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
    boolean debug = false;
    ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
    GcListener gcListener = null;
    final long start = System.currentTimeMillis();
    try {
```

### UnusedAssignment
Variable `read` initializer `0` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/github/GitHubRawFileContentProvider.java`
#### Snippet
```java
    byte[] buffer = new byte[8192];
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    int read = 0;
    while ((read = is.read(buffer, 0, buffer.length)) != -1) {
      out.write(buffer, 0, read);
```

### UnusedAssignment
Variable `message` initializer `"Could not connect to the Git repository by SSH protocol."` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitUrlSupport.java`
#### Snippet
```java
        if (isBranchRelatedError(e)) throw e;

        String message = "Could not connect to the Git repository by SSH protocol.";
        if (numSshKeysTried > 0) {
          message += " Tried " + numSshKeysTried + " SSH " + StringUtil.pluralize("key", numSshKeysTried) +
```

### UnusedAssignment
The value `" Tried " + numSshKeysTried + " SSH " + StringUtil.pluralize("key", numSshKeysTried) +
" accessible from the current project."` assigned to `message` is never used
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitUrlSupport.java`
#### Snippet
```java
        String message = "Could not connect to the Git repository by SSH protocol.";
        if (numSshKeysTried > 0) {
          message += " Tried " + numSshKeysTried + " SSH " + StringUtil.pluralize("key", numSshKeysTried) +
                     " accessible from the current project.";
        } else {
```

### UnusedAssignment
The value `" Could not find an SSH key in the current project which would work with this Git repository."` assigned to `message` is never used
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitUrlSupport.java`
#### Snippet
```java
                     " accessible from the current project.";
        } else {
          message += " Could not find an SSH key in the current project which would work with this Git repository.";
        }

```

### UnusedAssignment
Variable `cacheCertDirectory` initializer `new File(myConfig.getCachesDir(), CERT_DIR)` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/NativeGitCommands.java`
#### Snippet
```java
            myTrustedCertificatesDir != null) {

          final File cacheCertDirectory = new File(myConfig.getCachesDir(), CERT_DIR);
          final String pemContent = TrustStoreIO.pemContentFromDirectory(myTrustedCertificatesDir.getAbsolutePath());
          final String mergedCertificatePath = new File(cacheCertDirectory, CERT_FILE).getAbsolutePath();
```

### UnusedAssignment
Variable `pemContent` initializer `TrustStoreIO.pemContentFromDirectory(myTrustedCertificatesDir.getAbsolutePath())` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/NativeGitCommands.java`
#### Snippet
```java

          final File cacheCertDirectory = new File(myConfig.getCachesDir(), CERT_DIR);
          final String pemContent = TrustStoreIO.pemContentFromDirectory(myTrustedCertificatesDir.getAbsolutePath());
          final String mergedCertificatePath = new File(cacheCertDirectory, CERT_FILE).getAbsolutePath();

```

### UnusedAssignment
Variable `mergedCertificatePath` initializer `new File(cacheCertDirectory, CERT_FILE).getAbsolutePath()` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/NativeGitCommands.java`
#### Snippet
```java
          final File cacheCertDirectory = new File(myConfig.getCachesDir(), CERT_DIR);
          final String pemContent = TrustStoreIO.pemContentFromDirectory(myTrustedCertificatesDir.getAbsolutePath());
          final String mergedCertificatePath = new File(cacheCertDirectory, CERT_FILE).getAbsolutePath();

          if (shouldGenerateMergedSslCertificate(pemContent, cacheCertDirectory)) {
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `e instanceof VcsException` is always `true`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
      cmd.call();
    } catch (Exception e) {
      if (e instanceof VcsException)
        throw (VcsException) e;
      throw new VcsException(e);
```

### ConstantValue
Condition `e instanceof VcsException` is always `true`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/BaseAuthCommandImpl.java`
#### Snippet
```java
      return Retry.retry(retryable, myRetryAttempts);
    } catch (Exception e) {
      if (e instanceof VcsException) throw (VcsException)e;
      throw new VcsException(e);
    }
```

### ConstantValue
Condition `e instanceof VcsException` is always `true`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitCommandLine.java`
#### Snippet
```java
      if (privateKey != null)
        FileUtil.delete(privateKey);
      if (e instanceof VcsException)
        throw (VcsException) e;
      throw new VcsException(e);
```

### ConstantValue
Condition `e instanceof VcsException` is always `true`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitCommandLine.java`
#### Snippet
```java
      if (privateKey != null)
        FileUtil.delete(privateKey);
      if (e instanceof VcsException)
        throw (VcsException) e;
      throw new VcsException(e);
```

### ConstantValue
Value `e` is always 'null'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/CommandUtil.java`
#### Snippet
```java

  public static boolean shouldFetchFromScratch(@NotNull VcsException e) {
    if (e instanceof GitExecTimeout || CommandUtil.isCanceledError(e)) return false;
    return !isRemoteAccessError(e);
  }
```

### ConstantValue
Value `e` is always 'null'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/CommandUtil.java`
#### Snippet
```java
  public static boolean shouldFetchFromScratch(@NotNull VcsException e) {
    if (e instanceof GitExecTimeout || CommandUtil.isCanceledError(e)) return false;
    return !isRemoteAccessError(e);
  }

```

### ConstantValue
Condition `e instanceof GitExecTimeout` is always `false` when reached
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/CommandUtil.java`
#### Snippet
```java
    boolean attemptsLeft = attempt < maxAttempts;

    if (e instanceof ProcessTimeoutException || e instanceof GitExecTimeout) return attemptsLeft;

    if (!(e instanceof VcsException)) return false;
```

### ConstantValue
Value `e` is always 'null'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/CommandUtil.java`
#### Snippet
```java
    boolean attemptsLeft = attempt < maxAttempts;

    if (e instanceof ProcessTimeoutException || e instanceof GitExecTimeout) return attemptsLeft;

    if (!(e instanceof VcsException)) return false;
```

### ConstantValue
Condition `!(e instanceof VcsException)` is always `true`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/CommandUtil.java`
#### Snippet
```java
    if (e instanceof ProcessTimeoutException || e instanceof GitExecTimeout) return attemptsLeft;

    if (!(e instanceof VcsException)) return false;

    final VcsException ve = (VcsException)e;
```

### ConstantValue
Value `e` is always 'null'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/CommandUtil.java`
#### Snippet
```java
    if (e instanceof ProcessTimeoutException || e instanceof GitExecTimeout) return attemptsLeft;

    if (!(e instanceof VcsException)) return false;

    final VcsException ve = (VcsException)e;
```

### ConstantValue
Condition `ex instanceof TransportException` is always `false`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/OperationContext.java`
#### Snippet
```java

    String message;
    if (ex instanceof TransportException && ex.getCause() != null) {
      Throwable t = ex.getCause();
      if (t instanceof FileNotFoundException) {
```

### ConstantValue
Condition `ex instanceof TransportException && ex.getCause() != null` is always `false`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/OperationContext.java`
#### Snippet
```java

    String message;
    if (ex instanceof TransportException && ex.getCause() != null) {
      Throwable t = ex.getCause();
      if (t instanceof FileNotFoundException) {
```

### ConstantValue
Value `ex` is always 'null'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/OperationContext.java`
#### Snippet
```java

    String message;
    if (ex instanceof TransportException && ex.getCause() != null) {
      Throwable t = ex.getCause();
      if (t instanceof FileNotFoundException) {
```

### ConstantValue
Condition `ex instanceof NoRemoteRepositoryException` is always `false`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/OperationContext.java`
#### Snippet
```java
        message = t.toString();
      }
    } else if (ex instanceof NoRemoteRepositoryException) {
      message = "cannot locate repository at " + ex.getMessage();
    } else {
```

### ConstantValue
Value `ex` is always 'null'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/OperationContext.java`
#### Snippet
```java
        message = t.toString();
      }
    } else if (ex instanceof NoRemoteRepositoryException) {
      message = "cannot locate repository at " + ex.getMessage();
    } else {
```

### ConstantValue
Condition `newCommits.contains(commit) && Boolean.FALSE.equals(contains)` is always `false`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/RepositoryRevisionCache.java`
#### Snippet
```java
      Set<String> forUpdate = new HashSet<>();
      myCache.forEachEntry((commit, contains) -> {
        if (newCommits.contains(commit) && Boolean.FALSE.equals(contains))
          forUpdate.add(commit);
        return true;
```

### ConstantValue
Condition `Boolean.FALSE.equals(contains)` is always `false` when reached
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/RepositoryRevisionCache.java`
#### Snippet
```java
      Set<String> forUpdate = new HashSet<>();
      myCache.forEachEntry((commit, contains) -> {
        if (newCommits.contains(commit) && Boolean.FALSE.equals(contains))
          forUpdate.add(commit);
        return true;
```

### ConstantValue
Value `vcsRoot` is always 'null'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SGitVcsRoot.java`
#### Snippet
```java

    SVcsRoot parentRoot = vcsRoot instanceof SVcsRoot ? (SVcsRoot)vcsRoot
                                                      : vcsRoot instanceof VcsRootInstance ? ((VcsRootInstance)vcsRoot).getParent() : null;
    if (parentRoot == null) {
      return myTokenRefresher.getRefreshableToken(vcsRoot.getExternalId(), tokenId, myCheckProjectScope);
```

### ConstantValue
Condition `e instanceof VcsOperationRejectedException` is always `true`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitCollectChangesPolicy.java`
#### Snippet
```java
        return;
      } catch (Throwable e) {
        boolean repeatable = e instanceof VcsOperationRejectedException;
        String message = "Could not find the start revision " + revision + " in the branch " + branchName;
        if (repeatable && i < repeatAttempts) {
```

### ConstantValue
Condition `repeatable` is always `true`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitCollectChangesPolicy.java`
#### Snippet
```java
        boolean repeatable = e instanceof VcsOperationRejectedException;
        String message = "Could not find the start revision " + revision + " in the branch " + branchName;
        if (repeatable && i < repeatAttempts) {
          message += ", will repeat, attempts left: " + (repeatAttempts - i);
        }
```

### ConstantValue
Condition `!(e instanceof VcsOperationRejectedException)` is always `false`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitCollectChangesPolicy.java`
#### Snippet
```java
        }
        LOG.warnAndDebugDetails(message, e);
        if (!(e instanceof VcsOperationRejectedException)) break;
      }
    }
```

### ConstantValue
Condition `cause instanceof URISyntaxException` is always `false`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmoduleResolverImpl.java`
#### Snippet
```java
        throw (VcsException) cause;
      }
      if (cause instanceof URISyntaxException) {
        throw (URISyntaxException) cause;
      }
```

### ConstantValue
Value `cause` is always 'null'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmoduleResolverImpl.java`
#### Snippet
```java
        throw (VcsException) cause;
      }
      if (cause instanceof URISyntaxException) {
        throw (URISyntaxException) cause;
      }
```

### ConstantValue
Condition `e instanceof VcsException` is always `true`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/GitRepoOperationsImpl.java`
#### Snippet
```java
      });
    } catch (Exception e) {
      if (e instanceof VcsException) {
        throw (VcsException) e;
      }
```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `identification`
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
      if (teamCityVersion != null && teamCityVersion.length() > 0) {
        //trilead prepends SSH-2.0- itself
        Connection.identification = teamCityVersion.replace(' ', '-') + "-" + Connection.identification;
      }
      configureKnownHosts(c);
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'jetbrains.buildServer.buildTriggers.vcs.git.command.impl.BaseAuthCommandImpl' to 'T'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/BaseAuthCommandImpl.java`
#### Snippet
```java
  public T setAuthSettings(@NotNull AuthSettings authSettings) {
    myAuthSettings = authSettings;
    return (T)this;
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'jetbrains.buildServer.buildTriggers.vcs.git.command.impl.BaseAuthCommandImpl' to 'T'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/BaseAuthCommandImpl.java`
#### Snippet
```java
  public T setUseNativeSsh(boolean useNativeSsh) {
    myUseNativeSsh = useNativeSsh;
    return (T)this;
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'jetbrains.buildServer.buildTriggers.vcs.git.command.impl.BaseAuthCommandImpl' to 'T'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/BaseAuthCommandImpl.java`
#### Snippet
```java
  public T addPreAction(@NotNull Runnable action) {
    myPreActions.add(action);
    return (T)this;
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'jetbrains.buildServer.buildTriggers.vcs.git.command.impl.BaseAuthCommandImpl' to 'T'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/BaseAuthCommandImpl.java`
#### Snippet
```java
  public T setRetryAttempts(int num) {
    myRetryAttempts = num;
    return (T)this;
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'jetbrains.buildServer.buildTriggers.vcs.git.command.impl.BaseAuthCommandImpl' to 'T'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/BaseAuthCommandImpl.java`
#### Snippet
```java
  public T setRepoUrl(@NotNull URIish repoUrl) {
    myRepoUrl = repoUrl;
    return (T)this;
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'jetbrains.buildServer.buildTriggers.vcs.git.command.impl.BaseAuthCommandImpl' to 'T'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/BaseAuthCommandImpl.java`
#### Snippet
```java
  public T trace(@NotNull Map<String, String> gitTraceEnv) {
    myTraceEnv = gitTraceEnv;
    return (T)this;
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'jetbrains.buildServer.buildTriggers.vcs.git.command.impl.BaseAuthCommandImpl' to 'T'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/BaseAuthCommandImpl.java`
#### Snippet
```java
  public T setTimeout(int timeout) {
    myTimeout = timeout;
    return (T)this;
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/GitClonesUpdater.java`
#### Snippet
```java

  private void processVcsRootsScheduledForUpdate() {
    Set<VcsRoot> vcsRoots = new HashSet<>(myScheduledForUpdate.keySet());
    for (VcsRoot root: vcsRoots) {
      RepositoryStateData state = myScheduledForUpdate.remove(root);
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/GitClonesUpdater.java`
#### Snippet
```java

  private void processVcsRootsScheduledForUpdate() {
    Set<VcsRoot> vcsRoots = new HashSet<>(myScheduledForUpdate.keySet());
    for (VcsRoot root: vcsRoots) {
      RepositoryStateData state = myScheduledForUpdate.remove(root);
```

### UNCHECKED_WARNING
Unchecked call to 'TreeSet(Comparator)' as a member of raw type 'java.util.TreeSet'
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/health/GitAgentVersionHealthReport.java`
#### Snippet
```java
    final Comparator<SAgentType> byNameComparator = Comparator.comparing(agentType -> agentType.getDetails().getName());
    final Collector<SAgentType, ?, Set<SAgentType>> distinctAgentTypesCollector =
      Collectors.toCollection(() -> new TreeSet<>(byNameComparator.thenComparingInt(SAgentType::getAgentTypeId)));
    final Supplier<TreeMap<AgentPool, Set<SAgentType>>> sortedPoolsMap = () -> new TreeMap<>(AgentPoolUtil.POOL_COMPARATOR);

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.TreeMap' to 'java.util.TreeMap\>'
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/health/GitAgentVersionHealthReport.java`
#### Snippet
```java
    final Collector<SAgentType, ?, Set<SAgentType>> distinctAgentTypesCollector =
      Collectors.toCollection(() -> new TreeSet<>(byNameComparator.thenComparingInt(SAgentType::getAgentTypeId)));
    final Supplier<TreeMap<AgentPool, Set<SAgentType>>> sortedPoolsMap = () -> new TreeMap<>(AgentPoolUtil.POOL_COMPARATOR);

    return agents.stream()
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `VcsException`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/RemoteRepositoryConfigurator.java`
#### Snippet
```java
   * Configures and save the remote repository for specified VCS root
   * @param fetchUrl fetchUrl remote repository URL
   * @throws VcsException in case of any error
   */
  public void configure(@NotNull CommonURIish fetchUrl) throws VcsException {
```

### JavadocReference
Cannot resolve symbol `VcsException`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/SshHandler.java`
#### Snippet
```java
   * @param authSettings authentication settings
   * @param cmd the command line to register with
   * @throws VcsException if there is a problem with registering the handler
   */
  public SshHandler(@NotNull GitSSHService ssh,
```

### JavadocReference
Cannot resolve symbol `VcsException`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
   * Clean and init directory and configure remote origin
   *
   * @throws VcsException if there are problems with initializing the directory
   */
  private void initDirectory(boolean removeTargetDir) throws VcsException {
```

### JavadocReference
Cannot resolve symbol `VcsException`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SshSessionMetaFactory.java`
#### Snippet
```java
   * @param authSettings a vcs root settings
   * @return session factory object
   * @throws VcsException in case of problems with creating object
   */
  @NotNull
```

### JavadocReference
Cannot resolve symbol `VcsException`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/TestConnectionCommand.java`
#### Snippet
```java
   *
   * @param uri url to check
   * @throws VcsException if url use anonymous git protocol and contains username
   */
  private void validate(URIish uri) throws VcsException {
```

### JavadocReference
Cannot resolve symbol `VcsException`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/TransportFactoryImpl.java`
#### Snippet
```java
   * @param url URL of interest
   * @return session factory object
   * @throws VcsException in case of problems with creating object
   */
  @NotNull
```

### JavadocReference
Cannot resolve symbol `VcsException`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/TransportFactoryImpl.java`
#### Snippet
```java
   *
   * @param url URL to check
   * @throws VcsException if url points to not-existing local repository
   */
  private void checkUrl(final URIish url) throws VcsException {
```

### JavadocReference
Cannot resolve symbol `VcsException`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/CommitLoader.java`
#### Snippet
```java
   * First fetches only corresponding branches and, only if there are still any tip revisions missing,
   * fetches all remote refs including or excluding tags depending on VCS root settings and on fetch command implementation.
   * @throws VcsException if unable to find any of the tip revisions after fetching twice
   * @throws VcsOperationRejectedException if unable to perform the operation straight away (retry later possible)
   */
```

### JavadocReference
Cannot resolve symbol `VcsOperationRejectedException`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/CommitLoader.java`
#### Snippet
```java
   * fetches all remote refs including or excluding tags depending on VCS root settings and on fetch command implementation.
   * @throws VcsException if unable to find any of the tip revisions after fetching twice
   * @throws VcsOperationRejectedException if unable to perform the operation straight away (retry later possible)
   */
  void loadCommits(@NotNull OperationContext context,
```

### JavadocReference
Cannot resolve symbol `VcsException`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/TransportFactory.java`
#### Snippet
```java
   * @return see above
   * @throws NotSupportedException if transport is not supported
   * @throws VcsException if there is a problem with configuring the transport
   */
  Transport createTransport(@NotNull Repository r, @NotNull final URIish url, @NotNull AuthSettings authSettings)
```

### JavadocReference
Cannot resolve symbol `VcsException`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
   * Check all refs successfully updated, throws exception if they are not
   * @param result fetch result
   * @throws VcsException if any ref was not successfully updated
   */
  public static void checkFetchSuccessful(@NotNull Repository db, @NotNull FetchResult result, @NotNull Set<String> refNamesLocal) throws VcsException {
```

### JavadocReference
Cannot resolve symbol `VcsException`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
   * @param remote the remote URL
   * @return a connection to repository
   * @throws VcsException if the there is a problem with accessing VCS
   */
  public static Repository getRepository(@NotNull final File dir, @NotNull final URIish remote) throws VcsException {
```

### JavadocReference
Cannot resolve symbol `VcsException`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
   * @param vcsRootProperties properties of vcsRoot
   * @throws IOException
   * @throws VcsException
   * @throws URISyntaxException
   */
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `lastIndexOf` may produce `NullPointerException`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
      String user;
      String host = list.pollFirst();
      int atIndex = host.lastIndexOf('@');
      if (atIndex == -1) {
        user = null;
```

### DataFlowIssue
Condition `e instanceof VcsException` is redundant and can be replaced with a null check
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/FetchCommandImpl.java`
#### Snippet
```java
      }

      if (!(e instanceof VcsException) || !(CommandUtil.isNotFoundRemoteRefError((VcsException)e))) {
        return true;
      }
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/CommandUtil.java`
#### Snippet
```java
  public static boolean shouldFetchFromScratch(@NotNull VcsException e) {
    if (e instanceof GitExecTimeout || CommandUtil.isCanceledError(e)) return false;
    return !isRemoteAccessError(e);
  }

```

### DataFlowIssue
Method invocation `getCause` will produce `NullPointerException`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/CommandUtil.java`
#### Snippet
```java

  public static boolean isCanceledError(@NotNull VcsException e) {
    return e instanceof CheckoutCanceledException || e.getCause() instanceof InterruptedException;
  }

```

### DataFlowIssue
Condition `e instanceof ProcessTimeoutException` is redundant and can be replaced with a null check
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/CommandUtil.java`
#### Snippet
```java
    boolean attemptsLeft = attempt < maxAttempts;

    if (e instanceof ProcessTimeoutException || e instanceof GitExecTimeout) return attemptsLeft;

    if (!(e instanceof VcsException)) return false;
```

### DataFlowIssue
Method invocation `getId` will produce `NullPointerException`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitHubPasswordAuthRootRegistryImpl.java`
#### Snippet
```java
  @TestOnly
  public void update(@NotNull VcsRoot rootInstance) {
    final long rootId = rootInstance instanceof VcsRootInstance ? ((VcsRootInstance)rootInstance).getParentId() : rootInstance.getId();
    if (!isGitHubPasswordRoot(rootInstance)) {
      removeVcsRoot(rootId, null);
```

### DataFlowIssue
Condition `ex instanceof VcsException` is redundant and can be replaced with a null check
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/OperationContext.java`
#### Snippet
```java
      LOG.debug("The error during GIT vcs operation " + myOperation, ex);
    }
    if (ex instanceof VcsException) {
      return (VcsException)ex;
    }
```

### DataFlowIssue
Method invocation `toString` will produce `NullPointerException`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/OperationContext.java`
#### Snippet
```java
      message = "cannot locate repository at " + ex.getMessage();
    } else {
      message = ex.toString();
    }
    return new VcsException(StringUtil.capitalize(myOperation) + " failed: " + message, ex);
```

### DataFlowIssue
Method invocation `getExternalId` will produce `NullPointerException`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SGitVcsRoot.java`
#### Snippet
```java
                                                      : vcsRoot instanceof VcsRootInstance ? ((VcsRootInstance)vcsRoot).getParent() : null;
    if (parentRoot == null) {
      return myTokenRefresher.getRefreshableToken(vcsRoot.getExternalId(), tokenId, myCheckProjectScope);
    } else {
      return myTokenRefresher.getRefreshableToken(parentRoot.getProject(), tokenId, myCheckProjectScope);
```

### DataFlowIssue
Argument `curProject` might be null
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitUrlSupport.java`
#### Snippet
```java
    VcsHostingRepo ghRepo = WellKnownHostingsUtil.getGitHubRepo(uri);
    if (ghRepo != null)
      refineGithubSettings(ghRepo, props, curProject);

    int numSshKeysTried = 0;
```

### DataFlowIssue
Condition `cause instanceof VcsException` is redundant and can be replaced with a null check
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmoduleResolverImpl.java`
#### Snippet
```java
        throw (CorruptObjectException) cause;
      }
      if (cause instanceof VcsException) {
        throw (VcsException) cause;
      }
```

### DataFlowIssue
Method invocation `isRootProject` may produce `NullPointerException`
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/GitDiagnosticsTab.java`
#### Snippet
```java
            if ("ALL".equals(vcsRoots)) {
              // on page load we first try to load saved previous results for root project
              if (project.isRootProject() && "true".equals(request.getParameter("loadStored"))) {
                final File storedFile = getExitingStoredTestConnectionErrorsFile();
                if (storedFile == null) {
```

### DataFlowIssue
Method invocation `getVcsRootInstances` may produce `NullPointerException`
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/GitDiagnosticsTab.java`
#### Snippet
```java
              } else {
                try {
                  project.getVcsRootInstances().stream().filter(ri -> isGitRoot(ri) && vcsRoots.equals(ri.getParent().getExternalId())).forEach(ri -> {
                    try {
                      IOGuard.allowNetworkAndCommandLine(() -> myVcsSupport.getRemoteRefs(ri, true));
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/ShowRefCommandImpl.java`
#### Snippet
```java
        continue;//a valid line of show-ref output contains 40 symbols of hash + space + branch name
      String commit = line.substring(0, 40);
      String ref = line.substring(41, line.length());
      result.put(ref, new RefImpl(ref, commit));
    }
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/credentials/ScriptGen.java`
#### Snippet
```java
    int idx = template.lastIndexOf(".");
    if (idx != -1)
      extension = template.substring(idx, template.length());

    File result = FileUtil.createTempFile(myTempDir, "credHelper", extension, true);
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/credentials/CredentialsHelper.java`
#### Snippet
```java
          int idx = line.indexOf("=");
          if (idx > 0)
            attributes.put(line.substring(0, idx), line.substring(idx + 1, line.length()));
        }
      }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'loadShallowBranch' is still used
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentCommitLoader.java`
#### Snippet
```java
   * @deprecated this method is only used backward compatibility and will be deleted
   */
  boolean loadShallowBranch(@NotNull String sha, @NotNull String branch) throws VcsException;
}

```

### DeprecatedIsStillUsed
Deprecated member 'USE_SHALLOW_CLONE_FROM_MIRROR_TO_CHECKOUT_DIR' is still used
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/PluginConfigImpl.java`
#### Snippet
```java
  public static final String USE_SHALLOW_CLONE = "teamcity.git.shallowClone";
  /** @deprecated preserved for backward compatibility, see TW-71077 */
  public static final String USE_SHALLOW_CLONE_FROM_MIRROR_TO_CHECKOUT_DIR = "teamcity.git.use.shallow.clone";
  public static final String USE_SHALLOW_CLONE_INTERNAL = "teamcity.internal.git.agent.shallowClone";
  public static final String TEAMCITY_DONT_DELETE_TEMP_FILES = "teamcity.dont.delete.temp.files";
```

### DeprecatedIsStillUsed
Deprecated member 'isUseShallowCloneFromMirrorToCheckoutDir' is still used
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentPluginConfig.java`
#### Snippet
```java

  /** @deprecated we preserve it for backward compatibility with "teamcity.git.use.shallow.clone" param in case of non-default configuration */
  boolean isUseShallowCloneFromMirrorToCheckoutDir();

  boolean isDeleteTempFiles();
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Cleanup.java`
#### Snippet
```java
      } else {
        myGcErrors.registerError(gitDir, "Not enough disk space to run git gc");
        CLEANUP.warn("[" + gitDir.getName() + "] not enough disk space to run git gc (" + String.valueOf(freeDiskSpace) + " " + pluralize("byte", freeDiskSpace) + ")");
      }
      runGCCounter++;
```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve class 'GitCustomizeVcsRootExtension'
in `git-server/src/META-INF/build-server-plugin-git.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitResetCacheHandler"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitTrustStoreProviderImpl"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitCustomizeVcsRootExtension"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitHubPasswordAuthRootRegistryFactoryImpl"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve bean 'repositoryStateEventDispatcher'
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitUrlSupportInitializer"/>
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitClonesUpdater">
    <constructor-arg index="0" ref="repositoryStateEventDispatcher"/>
    <constructor-arg index="1" ref="serverDispatcher"/>
  </bean>
```

### SpringXmlModelInspection
Cannot resolve bean 'serverDispatcher'
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitClonesUpdater">
    <constructor-arg index="0" ref="repositoryStateEventDispatcher"/>
    <constructor-arg index="1" ref="serverDispatcher"/>
  </bean>
  <bean id="mainConfigProcessor" class="jetbrains.buildServer.buildTriggers.vcs.git.GitMainConfigProcessor"/>
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/EscapeEchoArgumentUnix.java`
#### Snippet
```java
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      switch (c) {
        case '\'':
          //we cannot escape ' inside 'string', we have to close 'string',
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsValue()'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/MirrorManagerImpl.java`
#### Snippet
```java
  private boolean isOccupiedDirName(@NotNull final String dirName) {
    synchronized (myLock) {
      return myMirrorMap.values().contains(dirName)/* || new File(myBaseMirrorsDir, dirName).exists()*/;
    }
  }
```

### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsValue()'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/MirrorManagerImpl.java`
#### Snippet
```java
          }

          if (myMirrorMap.values().contains(dirName)) {
            LOG.error("Skip mapping " + line + ": " + dirName + " is used for url other than " + url);
          } else {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentMirrorCleaner.java`
#### Snippet
```java
        if (!repositoriesUsedInBuild.contains(repository)) {
          if (isCleanupEnabled(mirror)) {
            LOG.debug("Register cleaner for mirror " + mirror.getAbsolutePath());
            registry.addCleaner(mirror, new Date(myMirrorManager.getLastUsedTime(mirror)));
          } else {
            LOG.debug("Clean-up is disabled in " + repository + " (" + mirror.getName() + ")");
          }
        }
```

### DuplicatedCode
Duplicated code
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/PluginConfigImpl.java`
#### Snippet
```java
    if (StringUtil.isEmpty(prop)) return Collections.emptyMap();
    try {
      return PropertiesUtil.toMap(PropertiesUtil.loadProperties(new ByteArrayInputStream(prop.replace(' ', '\n').getBytes(StandardCharsets.UTF_8))));
    } catch (IOException e) {
      LOG.warnAndDebugDetails("Failed to parse \"" + GIT_TRACE_ENV + "\" property value \"" + prop + "\", git trace won't be enabled", e);
      return Collections.emptyMap();
    }
```

### DuplicatedCode
Duplicated code
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/URIishHelperImpl.java`
#### Snippet
```java
    URIish result = uri.get();
    if (requiresCredentials(result)) {
      if (!StringUtil.isEmptyOrSpaces(authSettings.getUserName())) {
        result = result.setUser(authSettings.getUserName());
      }
      if (!StringUtil.isEmpty(authSettings.getPassword())) {
        result = result.setPass(authSettings.getPassword());
      }
    }
    if (fixErrors && isAnonymousProtocol(result)) {
      result = result.setUser(null);
      result = result.setPass(null);
    }
    return new CommonURIishImpl(result);
```

### DuplicatedCode
Duplicated code
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHXmlRcpClient.java`
#### Snippet
```java
    if (myClient == null) {
      return null;
    }
    Vector parameters = new Vector();
    parameters.add(handler);
    parameters.add(username);
    parameters.add(keyPath);
    parameters.add(resetPassword);
    parameters.add(lastError);
```

### DuplicatedCode
Duplicated code
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/SubmodulesCheckoutPolicy.java`
#### Snippet
```java
      switch (originalPolicy) {
        case IGNORE:
          return IGNORE;
        case CHECKOUT:
        case CHECKOUT_IGNORING_ERRORS:
          return CHECKOUT_IGNORING_ERRORS;
        case NON_RECURSIVE_CHECKOUT:
        case NON_RECURSIVE_CHECKOUT_IGNORING_ERRORS:
          return NON_RECURSIVE_CHECKOUT_IGNORING_ERRORS;
        default:
          throw new UnsupportedOperationException("Unknown submodules checkout policy: " + originalPolicy);
      }
```

### DuplicatedCode
Duplicated code
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/GitExternalChangeViewerExtension.java`
#### Snippet
```java
    if (!Constants.VCS_NAME.equals(vcsRoot.getVcsName())) return null;
    String url = vcsRoot.getProperty(Constants.FETCH_URL);
    if (url == null) return null;

    URIish urIish;
    try {
      urIish = new URIish(url);
    } catch (URISyntaxException e) {
      return null;
    }
```

### DuplicatedCode
Duplicated code
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Cleanup.java`
#### Snippet
```java
      runGCCounter++;
      final long repositoryFinishNanos = System.nanoTime();
      if ((repositoryFinishNanos - startNanos) > gcTimeQuotaNanos) {
        final int restRepositories = allDirs.size() - runGCCounter;
        if (restRepositories > 0) {
          CLEANUP.info("Git garbage collection quota exceeded, skip " + restRepositories + " repositories");
          break;
        }
      }
```

### DuplicatedCode
Duplicated code
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/FetchProgressMonitor.java`
#### Snippet
```java
      final String twstr = String.valueOf(totalWork);
      String cmpstr = String.valueOf(cmp);
      while (cmpstr.length() < twstr.length())
        cmpstr = " " + cmpstr;
      final int pcnt = (cmp * 100 / totalWork);
      if (pcnt < 100)
        m.append(' ');
      if (pcnt < 10)
        m.append(' ');
      m.append(pcnt);
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/github/GitHubRawFileContentProvider.java`
#### Snippet
```java
        try {
          is.close();
        } catch (IOException e) {
        }
      }
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/GitDiagnosticsTab.java`
#### Snippet
```java
      @Nullable
      @Override
      protected ModelAndView doHandle(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response) throws Exception {
        checkPermissions(request);
        if (isGet(request)) {
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
      return rc;
    }
    BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(configFile), "ISO-8859-1"));
    try {
      Host host = null;
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitCommandLine.java`
#### Snippet
```java
        OutputStream out = null;
        try {
          out = new BufferedOutputStream(new FileOutputStream(privateKey));
          if (keyPair.isEncrypted() && !keyPair.decrypt(passphrase)) {
            throw new VcsException("Wrong SSH key passphrase");
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/RepositoryRevisionCache.java`
#### Snippet
```java
    File cache = getCacheFile(myRepositoryDir, myType);
    cache.getParentFile().mkdirs();
    try (PrintStream printer = new PrintStream(new BufferedOutputStream(new FileOutputStream(cache)))) {
      myCache.forEachEntry((revision, contains) -> {
        if (contains != null) {
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchProcess.java`
#### Snippet
```java

    OperationContext context = new OperationContext(commitLoader, repositoryManager, settings.getRoot(), "build patch", GitProgress.NO_OP, config, null);
    OutputStream fos = new BufferedOutputStream(new FileOutputStream(settings.getPatchFile()));
    try {
      PatchBuilderImpl patchBuilder = new PatchBuilderImpl(fos);
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
  private Set<Class> fetchProcessClasses() {
    Set<Class> result = new HashSet<>();
    result.addAll(asList(
      Fetcher.class,
      VcsRoot.class,
```

### CollectionAddAllCanBeReplacedWithConstructor
'putAll()' call can be replaced with parametrized constructor call
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchBuilderDispatcher.java`
#### Snippet
```java
  private Map<String, String> getPatchProcessProperties() {
    Map<String, String> result = new HashMap<String, String>();
    result.putAll(myConfig.getFetcherProperties());
    result.put("teamcity.git.fetch.separate.process", "false");
    result.put(PluginConfigImpl.MAP_FULL_PATH_PERSISTENT_CACHES, "false");
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
      }
    }
    System.err.print(log.toString());
    throw new IOException("Authentication failed");
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
              jsch.setKnownHosts(knownHosts.getAbsolutePath());
            } catch (Exception e) {
              myLogger.log(Logger.WARN, "Failed to configure known hosts: '" + e.toString() + "'");
            }
          }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
        props.forEach((k, v) -> loadedProps.put((String)k, (String)v));
      } catch (IOException e) {
        logger.log(Logger.WARN, "Could not load internal properties from the file: " + intPropsPath + ", error: " + e.toString());
      }
      new TeamCityProperties() {{
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/CommandLineUtil.java`
#### Snippet
```java
      String stdout = res.getStdout();
      final String message = "'" + cmdName + "' command failed" + details + "." +
                             (exception != null ? "\nexception: " + exception.toString() : "") +
                             (includeStdErr && !StringUtil.isEmpty(stderr) ? "\nstderr: " + stderr.trim() : "") +
                             (includeStdOut && !StringUtil.isEmpty(stdout) ? "\nstdout: " + stdout.trim() : "") +
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
    URIish fetch = myRoot.getRepositoryFetchURL().get();
    if (GitUtilsAgent.isAnonymousGitWithUsername(fetch))
      LOG.warn("Fetch URL '" + fetch.toString() + "' for root " + myRoot.getName() + " uses an anonymous git protocol and contains a username, fetch will probably fail");
    URIish push  = myRoot.getRepositoryPushURL().get();
    if (!fetch.equals(push) && GitUtilsAgent.isAnonymousGitWithUsername(push))
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
    URIish push  = myRoot.getRepositoryPushURL().get();
    if (!fetch.equals(push) && GitUtilsAgent.isAnonymousGitWithUsername(push))
      LOG.warn("Push URL '" + push.toString() + "'for root " + myRoot.getName() + " uses an anonymous git protocol and contains a username, push will probably fail");
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/TestConnectionCommand.java`
#### Snippet
```java
  private void validate(URIish uri) throws VcsException {
    if (isAnonymousGitWithUsername(uri))
      throw new VcsException("Incorrect url " + uri.toString() + ": anonymous git url should not contain a username");
  }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SNISSLSocketFactory.java`
#### Snippet
```java
        method.invoke(socket, host.getHostName());
      } catch (Exception e) {
        LOG.info("Cannot enable SNI for host " + host.getHostName() + ", continue without SNI, error: " + e.toString());
      }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/RepositoryRevisionCache.java`
#### Snippet
```java
  @Override
  public String toString() {
    return myRepositoryDir.getAbsolutePath() + " " + myCache.toString();
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/TransportFactoryImpl.java`
#### Snippet
```java
      File localRepository = new File(url.getPath());
      if (!localRepository.exists()) {
        String error = "Cannot access the '" + url.toString() + "' repository";
        if (SystemInfo.isWindows) {
          error += ". If TeamCity is run as a Windows service, it cannot access network mapped drives. Make sure this is not your case.";
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
      if (ex instanceof NullPointerException)
        LOG.warn("The repository at directory '" + dir + "' cannot be opened or created", ex);
      throw new VcsException("The repository at directory '" + dir + "' cannot be opened or created, reason: " + ex.toString(), ex);
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/FetchCommandImpl.java`
#### Snippet
```java
      sb.append(spec).append(" ");
    }
    return "(" + (db.getDirectory() != null? db.getDirectory().getAbsolutePath() + ", ":"") + uri.toString() + "#" + sb.toString() + ")";
  }

```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Set' may not contain objects of type ''
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/RepositoryRevisionCache.java`
#### Snippet
```java
      Set<String> forUpdate = new HashSet<>();
      myCache.forEachEntry((commit, contains) -> {
        if (newCommits.contains(commit) && Boolean.FALSE.equals(contains))
          forUpdate.add(commit);
        return true;
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `PackIndexV2MM` may be 'static'
in `git-server/src/org/eclipse/jgit/internal/storage/file/MemoryMappedPackIndex.java`
#### Snippet
```java
   */

  private class PackIndexV2MM extends PackIndex {
    private final MappedByteBuffer myBuffer;
    private final long mySize;
```

## RuleId[id=UnnecessaryInitCause]
### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `git-server/src/org/eclipse/jgit/treewalk/SubmoduleAwareTreeIterator.java`
#### Snippet
```java
          throw (IOException) e;
        IOException ioe = new IOException("Submodule error");
        ioe.initCause(e);
        throw ioe;
      } finally {
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitMapFullPath.java`
#### Snippet
```java
      return false;
    }
    if (uri.getPath() == null && settingsUrl.getPath() != null || uri.getPath() != null && !uri.getPath().equals(settingsUrl.getPath())) {
      return false;
    }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'myRef'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/GitRepoOperationsImpl.java`
#### Snippet
```java
  private class LazyGitExec {
    private final ReentrantLock myLock = new ReentrantLock();
    private volatile Optional<GitExec> myRef = null;

    @Nullable
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.ISO_8859_1 can be used instead
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
      return rc;
    }
    BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(configFile), "ISO-8859-1"));
    try {
      Host host = null;
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitCommandLine.java`
#### Snippet
```java
  @NotNull
  public ByteArrayOutputStream createStderrBuffer() {
    LineAwareByteArrayOutputStream buffer = new LineAwareByteArrayOutputStream(Charset.forName("UTF-8"), new GitProgressListener(myLogger));
    buffer.setCREndsLine(true);
    return buffer;
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/FetchSettings.java`
#### Snippet
```java
    ByteArrayOutputStream stdoutBuffer;
    if (myProgress != GitProgress.NO_OP) {
      stdoutBuffer = new LineAwareByteArrayOutputStream(Charset.forName("UTF-8"), new JGitProgressParser(myProgress));
    } else {
      stdoutBuffer = new ByteArrayOutputStream();
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
    char[] chars = new char[512];
    StringBuilder sb = new StringBuilder();
    Reader processInput = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
    int count = 0;
    while ((count = processInput.read(chars)) != -1) {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchBuilderDispatcher.java`
#### Snippet
```java
      final File internalProperties = getPatchPropertiesFile();
      try {
        final ByteArrayOutputStream stdout = new LineAwareByteArrayOutputStream(Charset.forName("UTF-8"), new NoOpLineListener(), false);
        final ByteArrayOutputStream stderr = new ByteArrayOutputStream();

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/github/GitHubRawFileContentProvider.java`
#### Snippet
```java
    if (auth.getAuthMethod().isPasswordBased() && auth.getUserName() != null && auth.getPassword() != null) {
      String credentials = auth.getUserName() + ":" + auth.getPassword();
      c.setRequestProperty("Authorization", "Basic " + Base64.encodeBytes(credentials.getBytes("UTF-8")));
    }
    return c;
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchProcess.java`
#### Snippet
```java
        return null;
      try {
        return result.getBytes("UTF-8");
      } catch (UnsupportedEncodingException e) {
        return null;
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/ContextImpl.java`
#### Snippet
```java
      return Charset.forName(charsetName);
    } catch (UnsupportedCharsetException e) {
      return Charset.forName("UTF-8");
    }
  }
```

## RuleId[id=ExcessiveRangeCheck]
### ExcessiveRangeCheck
Can be replaced with 'includeRules.size() != 1'
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentVcsSupport.java`
#### Snippet
```java
      return true;
    List<IncludeRule> includeRules = rules.getRootIncludeRules();
    if (includeRules.isEmpty() || includeRules.size() > 1)
      return true;
    IncludeRule rule = includeRules.get(0);
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Repository' used without 'try'-with-resources statement
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterWithMirror.java`
#### Snippet
```java
  private boolean isValidGitRepo(@NotNull File gitDir) {
    try {
      new RepositoryBuilder().setGitDir(gitDir).setMustExist(true).build();
      return true;
    } catch (IOException e) {
```

### AutoCloseableResource
'Repository' used without 'try'-with-resources statement
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GCIdleTask.java`
#### Snippet
```java
  private boolean isGitRepo(@NotNull File gitDir) {
    try {
      new RepositoryBuilder().setGitDir(gitDir).setMustExist(true).build();
      return true;
    } catch (IOException e) {
```

### AutoCloseableResource
'Repository' used without 'try'-with-resources statement
in `git-server/src/org/eclipse/jgit/treewalk/SubmoduleAwareTreeIterator.java`
#### Snippet
```java
      ObjectReader or = null;
      try {
        Repository r = mySubmoduleResolver.resolveRepository(mySubmoduleResolver.getSubmoduleUrl(path));
        or = r.newObjectReader();
        p.reset(or, mySubmoduleCommit.getTree().getId());
```

### AutoCloseableResource
'FileChannel' used without 'try'-with-resources statement
in `git-server/src/org/eclipse/jgit/internal/storage/file/MemoryMappedPackIndex.java`
#### Snippet
```java
  public PackIndex open(final File idxFile) throws IOException {
    try {
      final FileChannel fc = FileChannel.open(idxFile.toPath(), StandardOpenOption.READ);
      final MappedByteBuffer buffer = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
      if (isV2Index(buffer)) {
```

### AutoCloseableResource
'Repository' used without 'try'-with-resources statement
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/RemoteRepositoryUrlInvestigatorImpl.java`
#### Snippet
```java
  public String getRemoteRepositoryUrl(@NotNull final File repositoryDir) {
    try {
      Repository r = new RepositoryBuilder().setBare().setGitDir(repositoryDir).build();
      StoredConfig config = r.getConfig();
      String teamcityRemote = config.getString("teamcity", null, "remote");
```

### AutoCloseableResource
'ObjectReader' used without 'try'-with-resources statement
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/BulkPatchBuilderImpl.java`
#### Snippet
```java
      try {
        final Repository myRepo = ctx.getRepository();
        final ObjectReader contentsReader = myRepo.getObjectDatabase().newReader();
        final ObjectReader treesReader = myRepo.getObjectDatabase().newReader();

```

### AutoCloseableResource
'ObjectReader' used without 'try'-with-resources statement
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/BulkPatchBuilderImpl.java`
#### Snippet
```java
        final Repository myRepo = ctx.getRepository();
        final ObjectReader contentsReader = myRepo.getObjectDatabase().newReader();
        final ObjectReader treesReader = myRepo.getObjectDatabase().newReader();

        for (BulkPatchBuilderRequest request : requests) {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `pos` to `long` is redundant
in `git-server/src/org/eclipse/jgit/internal/storage/file/MemoryMappedPackIndex.java`
#### Snippet
```java
      }

      return getOffset((long)pos);
    }

```

### RedundantCast
Casting `objectCnt` to `long` is redundant
in `git-server/src/org/eclipse/jgit/internal/storage/file/MemoryMappedPackIndex.java`
#### Snippet
```java
    @Override
    public long getObjectCount() {
      return (long)objectCnt;
    }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param resetPassword` tag description is missing
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHService.java`
#### Snippet
```java
     * @param username      a user name
     * @param keyPath       a key path
     * @param resetPassword
     * @param lastError     the last error for the handler  @return a passphrase or null if dialog was cancelled.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
   *
   * @return input as string
   * @throws IOException
   */
  public static String readInput() throws IOException {
```

### JavadocDeclaration
`@param buffer` tag description is missing
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java
   * Sets the buffer from which to take the request body
   *
   * @param buffer
   */
  public void setBuffer(TemporaryBuffer buffer) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
   * @param repositoryDir     directory where run fetch
   * @param vcsRootProperties properties of vcsRoot
   * @throws IOException
   * @throws VcsException
   * @throws URISyntaxException
```

### JavadocDeclaration
`@throws` tag description is missing
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
   * @param vcsRootProperties properties of vcsRoot
   * @throws IOException
   * @throws VcsException
   * @throws URISyntaxException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
   * @throws IOException
   * @throws VcsException
   * @throws URISyntaxException
   */
  private static void fetch(@NotNull File repositoryDir,
```

### JavadocDeclaration
Class jetbrains.buildServer.buildTriggers.vcs.git.VcsAuthenticationException is not a descendant of Throwable
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmoduleResolver.java`
#### Snippet
```java
   * @param submoduleUrl the URL to resolve
   * @return the resolved repository
   * @throws jetbrains.buildServer.buildTriggers.vcs.git.VcsAuthenticationException in case of authentication problems
   * @throws java.net.URISyntaxException if there are errors in submodule repository URI
   */
```

### JavadocDeclaration
Class jetbrains.buildServer.buildTriggers.vcs.git.VcsAuthenticationException is not a descendant of Throwable
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmoduleResolverImpl.java`
#### Snippet
```java
   * @param commit the commit identifier
   * @return the the resoled commit in other repository
   * @throws VcsAuthenticationException if there are authentication problems
   * @throws URISyntaxException if there are errors in submodule repository URI
   */
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `LOG` may be 'final'
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/RemoteRepositoryUrlInvestigatorImpl.java`
#### Snippet
```java
public class RemoteRepositoryUrlInvestigatorImpl implements RemoteRepositoryUrlInvestigator {

  private static Logger LOG = Logger.getInstance(RemoteRepositoryUrlInvestigatorImpl.class.getName());

  @Override
```

### FieldMayBeFinal
Field `myUser` may be 'final'
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java

    private String myHost;
    private String myUser;
    private Integer myPort;
    private String myCommand;
```

### FieldMayBeFinal
Field `myPort` may be 'final'
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
    private String myHost;
    private String myUser;
    private Integer myPort;
    private String myCommand;
    private Map<String, String> options;
```

### FieldMayBeFinal
Field `myHost` may be 'final'
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
  public static class SSHCommandLine {

    private String myHost;
    private String myUser;
    private Integer myPort;
```

### FieldMayBeFinal
Field `options` may be 'final'
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
    private Integer myPort;
    private String myCommand;
    private Map<String, String> options;
    private final Logger myLogger;

```

### FieldMayBeFinal
Field `myCommand` may be 'final'
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
    private String myUser;
    private Integer myPort;
    private String myCommand;
    private Map<String, String> options;
    private final Logger myLogger;
```

### FieldMayBeFinal
Field `myCopyThread` may be 'final'
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
  private class Timer extends Thread {
    private final long myThresholdNanos;
    private volatile Copy myCopyThread;
    Timer(@NotNull Copy copyThread, long timeoutSeconds) {
      myCopyThread = copyThread;
```

### FieldMayBeFinal
Field `myUpstreamBranch` may be 'final'
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/SetUpstreamCommandImpl.java`
#### Snippet
```java
public class SetUpstreamCommandImpl extends BaseCommandImpl implements SetUpstreamCommand {
  private String myLocalBranch;
  private String myUpstreamBranch;

  public SetUpstreamCommandImpl(@NotNull GitCommandLine cmd,
```

### FieldMayBeFinal
Field `myLocalBranch` may be 'final'
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/SetUpstreamCommandImpl.java`
#### Snippet
```java

public class SetUpstreamCommandImpl extends BaseCommandImpl implements SetUpstreamCommand {
  private String myLocalBranch;
  private String myUpstreamBranch;

```

### FieldMayBeFinal
Field `myInput` may be 'final'
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/UpdateRefBatchCommandImpl.java`
#### Snippet
```java

public class UpdateRefBatchCommandImpl extends BaseCommandImpl implements UpdateRefBatchCommand {
  private FastByteArrayBuilder myInput = new FastByteArrayBuilder();

  public UpdateRefBatchCommandImpl(@NotNull GitCommandLine cmd) {
```

### FieldMayBeFinal
Field `myDiff` may be 'final'
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/CleanCommandImpl.java`
#### Snippet
```java

  private static class WorkingDirStatus extends Status {
    private IndexDiff myDiff;
    private WorkingDirStatus(IndexDiff diff) {
      super(diff);
```

### FieldMayBeFinal
Field `LOG` may be 'final'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/MirrorManagerImpl.java`
#### Snippet
```java
public class MirrorManagerImpl implements MirrorManager {

  private static Logger LOG = Logger.getInstance(MirrorManagerImpl.class.getName());

  private final File myBaseMirrorsDir;
```

### FieldMayBeFinal
Field `mySubmodulesPolicy` may be 'final'
in `git-server/src/org/eclipse/jgit/treewalk/SubmoduleAwareTreeIterator.java`
#### Snippet
```java
   * Policy for submodules
   */
  private SubmodulesCheckoutPolicy mySubmodulesPolicy;
  /**
   * The resolver for submodules
```

### FieldMayBeFinal
Field `shaOffset` may be 'final'
in `git-server/src/org/eclipse/jgit/internal/storage/file/MemoryMappedPackIndex.java`
#### Snippet
```java
    private final int objectCnt;

    private int shaOffset;
    private int crcOffset;
    private int ofsOffset;
```

### FieldMayBeFinal
Field `o64Offset` may be 'final'
in `git-server/src/org/eclipse/jgit/internal/storage/file/MemoryMappedPackIndex.java`
#### Snippet
```java
    private int crcOffset;
    private int ofsOffset;
    private int o64Offset;

    private volatile boolean isClosed = false;
```

### FieldMayBeFinal
Field `crcOffset` may be 'final'
in `git-server/src/org/eclipse/jgit/internal/storage/file/MemoryMappedPackIndex.java`
#### Snippet
```java

    private int shaOffset;
    private int crcOffset;
    private int ofsOffset;
    private int o64Offset;
```

### FieldMayBeFinal
Field `ofsOffset` may be 'final'
in `git-server/src/org/eclipse/jgit/internal/storage/file/MemoryMappedPackIndex.java`
#### Snippet
```java
    private int shaOffset;
    private int crcOffset;
    private int ofsOffset;
    private int o64Offset;

```

### FieldMayBeFinal
Field `mySSLSchemePatcher` may be 'final'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java
  private Supplier<KeyStore> myTrustStoreGetter = () -> null;

  private SSLSchemePatcher mySSLSchemePatcher;

  public SSLHttpClientConnection(
```

### FieldMayBeFinal
Field `proxy` may be 'final'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java
  private boolean isUsingProxy = false;

  private Proxy proxy;

  private Integer timeout = null;
```

### FieldMayBeFinal
Field `attributes` may be 'final'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java
  SSLContext ctx;

  private Map<String, Object> attributes = new HashMap<String, Object>();

  @NotNull
```

### FieldMayBeFinal
Field `LOG` may be 'final'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/process/RepositoryXmxStorage.java`
#### Snippet
```java
  public static final String SUFFIX = "M";

  private static Logger LOG = Logger.getInstance(RepositoryXmxStorage.class.getName());

  @NotNull final File myStorage;
```

### FieldMayBeFinal
Field `myMemoryAfter` may be 'final'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/process/GitProcessStuckMonitor.java`
#### Snippet
```java
    private long myGcDuration;
    private long myMemoryBefore;
    private long myMemoryAfter;

    MemoryDumpLine(final long timestamp,
```

### FieldMayBeFinal
Field `myTimestamp` may be 'final'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/process/GitProcessStuckMonitor.java`
#### Snippet
```java

  private static class MemoryDumpLine {
    private long myTimestamp;
    private long myGcDuration;
    private long myMemoryBefore;
```

### FieldMayBeFinal
Field `LOG` may be 'final'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/process/GitProcessStuckMonitor.java`
#### Snippet
```java
public abstract class GitProcessStuckMonitor extends Thread {

  private static Logger LOG = Logger.getInstance(FetchCommandImpl.class.getName());

  @NotNull
```

### FieldMayBeFinal
Field `myGcDuration` may be 'final'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/process/GitProcessStuckMonitor.java`
#### Snippet
```java
  private static class MemoryDumpLine {
    private long myTimestamp;
    private long myGcDuration;
    private long myMemoryBefore;
    private long myMemoryAfter;
```

### FieldMayBeFinal
Field `myMemoryBefore` may be 'final'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/process/GitProcessStuckMonitor.java`
#### Snippet
```java
    private long myTimestamp;
    private long myGcDuration;
    private long myMemoryBefore;
    private long myMemoryAfter;

```

### FieldMayBeFinal
Field `LOG` may be 'final'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmodulesConfig.java`
#### Snippet
```java
   * logger instance
   */
  private static Logger LOG = Logger.getInstance(SubmodulesConfig.class.getName());
  /**
   * Repository configuration
```

### FieldMayBeFinal
Field `myHash` may be 'final'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/ByteRange.java`
#### Snippet
```java
   * The hash code
   */
  private int myHash;

  /**
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitListFilesSupport.java`
#### Snippet
```java
      }
      return files;
    } catch (VcsFileNotFoundException e) {
      throw e;
    } catch (Exception e) {
```

### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/GitRepoOperationsImpl.java`
#### Snippet
```java
        }
      }
    } catch (VcsException e) {
      throw e;
    } catch (Exception e) {
```

## RuleId[id=InstantiationOfUtilityClass]
### InstantiationOfUtilityClass
Instantiation of utility class `SslOperations`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/ssl/SSLInvestigator.java`
#### Snippet
```java
  private final SSLContextRetriever mySSLContextRetriever;

  private final SslOperations mySslOperations = new SslOperations();

  private volatile Boolean myNeedCustomCertificate = null;
```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `git-server/src/META-INF/build-server-plugin-git.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <bean id="config" class="jetbrains.buildServer.buildTriggers.vcs.git.PluginConfigImpl"/>
  <bean id="transport" class="jetbrains.buildServer.buildTriggers.vcs.git.TransportFactoryImpl"/>
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `git-agent/src/META-INF/build-agent-plugin-git.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <bean id="gitAgentSshService" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.GitAgentSSHService" />
  <bean id="gitAgent" class="jetbrains.buildServer.buildTriggers.vcs.git.agent.GitAgentVcsSupport" />
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `git-server-tc/src/META-INF/build-server-plugin-git-tc.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd"
       default-autowire="constructor">

  <bean class="jetbrains.buildServer.buildTriggers.vcs.git.GitExtensionRegistry"/>
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
        } else {
          try {
            Thread.sleep(sleepInterval);
          } catch (Exception e) {
            //ignore
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Retry.java`
#### Snippet
```java
        operation.getLogger().infoAndDebugDetails("Exception occurred, will repeat operation in " + effectiveDelay + "ms", e);
        if (effectiveDelay > 0) {
          Thread.sleep(effectiveDelay);
        }
      }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/process/GitProcessStuckMonitor.java`
#### Snippet
```java
      myProcGcDump.start();
      while (!myFinished) {
        Thread.sleep(10 * 1000);
        if (myFinished) {
          return;
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/CommitLoaderImpl.java`
#### Snippet
```java
                " of repository " + root.debugInfo() + ", fetch all branches");
      RefSpec spec = new RefSpec().setSourceDestination("refs/*", "refs/*").setForceUpdate(true);
      fetch(db, root.getRepositoryFetchURL().get(), new FetchSettings(root.getAuthSettings(), asList(spec)));
      try {
        return getCommit(db, commitId);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/CommitLoaderImpl.java`
#### Snippet
```java
    final String refName = GitUtils.expandRef(root.getRef());
    RefSpec spec = new RefSpec().setSource(refName).setDestination(refName).setForceUpdate(true);
    fetch(repository, root.getRepositoryFetchURL().get(), new FetchSettings(root.getAuthSettings(), asList(spec)));
  }
}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitCommitSupport.java`
#### Snippet
```java
        .setDestination(GitUtils.expandRef(gitRoot.getRef()))
        .setForceUpdate(true);
      myCommitLoader.fetch(myDb, gitRoot.getRepositoryFetchURL().get(), new FetchSettings(gitRoot.getAuthSettings(), asList(spec)));
      Ref defaultBranch = myDb.exactRef(GitUtils.expandRef(gitRoot.getRef()));
      return myCommitLoader.loadCommit(myContext, gitRoot, defaultBranch.getObjectId().name());
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitMergeSupport.java`
#### Snippet
```java
        } else {
          if (c.getParentCount() > 1) {
            throw new MergeFailedException(asList("Rebase of merge commits is not supported"));
          } else {
            toRebase.add(c);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitMergeSupport.java`
#### Snippet
```java
                              @NotNull MergeOptions options) throws IOException, VcsException {
    RefSpec spec = new RefSpec().setSource(GitUtils.expandRef(dstBranch)).setDestination(GitUtils.expandRef(dstBranch)).setForceUpdate(true);
    myCommitLoader.fetch(db, gitRoot.getRepositoryFetchURL().get(), new FetchSettings(gitRoot.getAuthSettings(), asList(spec)));
    RevCommit srcCommit = myCommitLoader.findCommit(db, srcRevision);
    if (srcCommit == null)
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitLabelingSupport.java`
#### Snippet
```java
      boolean writeOnlyTag = canWriteOnlyTag(repository, have);
      if (writeOnlyTag) {
        writer.preparePack(asList((RevObject)myTagObject).iterator());
      } else {
        writer.preparePack(monitor, want, have);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmoduleResolverImpl.java`
#### Snippet
```java
      LOG.debug("Fetching submodule " + submoduleUrl + " used at " + submodulePath + " for " + myContext.getGitRoot().debugInfo());
    URIish uri = resolveSubmoduleUrl(submoduleUrl);
    myContext.fetchSubmodule(r, uri, Arrays.asList(new RefSpec("+refs/*:refs/*")), myContext.getGitRoot().getAuthSettings());
  }

```

