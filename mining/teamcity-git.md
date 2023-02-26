# teamcity-git 
 
# Bad smells
I found 811 bad smells with 166 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 153 | false |
| UnnecessaryModifier | 103 | true |
| MissortedModifiers | 70 | false |
| RedundantFieldInitialization | 49 | false |
| SystemOutErr | 40 | false |
| PublicFieldAccessedInSynchronizedContext | 26 | false |
| ConstantValue | 22 | false |
| SizeReplaceableByIsEmpty | 20 | true |
| AssignmentToMethodParameter | 19 | false |
| NestedAssignment | 17 | false |
| UnusedAssignment | 16 | false |
| UtilityClassWithoutPrivateConstructor | 16 | true |
| DynamicRegexReplaceableByCompiledPattern | 16 | false |
| BoundedWildcard | 13 | false |
| DataFlowIssue | 13 | false |
| UnnecessaryToStringCall | 12 | true |
| RedundantSuppression | 12 | false |
| IgnoreResultOfCall | 11 | false |
| UNUSED_IMPORT | 11 | false |
| UnnecessaryBoxing | 11 | false |
| ZeroLengthArrayInitialization | 10 | false |
| UnnecessaryUnboxing | 8 | false |
| CharsetObjectCanBeUsed | 8 | false |
| UnnecessaryFullyQualifiedName | 8 | false |
| NonProtectedConstructorInAbstractClass | 7 | true |
| InstanceofCatchParameter | 6 | false |
| SynchronizeOnThis | 6 | false |
| DoubleBraceInitialization | 5 | false |
| NonExceptionNameEndsWithException | 5 | false |
| Convert2MethodRef | 5 | false |
| Convert2Lambda | 5 | false |
| NonShortCircuitBoolean | 4 | false |
| OptionalAssignedToNull | 4 | false |
| CodeBlock2Expr | 4 | true |
| StringEqualsEmptyString | 4 | false |
| AssignmentToStaticFieldFromInstanceMethod | 3 | false |
| ObsoleteCollection | 3 | false |
| EmptyMethod | 3 | false |
| StringOperationCanBeSimplified | 3 | false |
| DeprecatedIsStillUsed | 3 | false |
| MissingDeprecatedAnnotation | 3 | false |
| BusyWait | 3 | false |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| EnumSwitchStatementWhichMissesCases | 2 | false |
| DuplicateBranchesInSwitch | 2 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| CastConflictsWithInstanceof | 2 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 2 | false |
| RedundantCollectionOperation | 2 | false |
| CaughtExceptionImmediatelyRethrown | 2 | false |
| CommentedOutCode | 1 | false |
| RefusedBequest | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| TrivialStringConcatenation | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| EqualsBetweenInconvertibleTypes | 1 | false |
| AccessStaticViaInstance | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| UseOfPropertiesAsHashtable | 1 | false |
| EqualsAndHashcode | 1 | false |
| RedundantImplements | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| DuplicateThrows | 1 | false |
| IndexOfReplaceableByContains | 1 | false |
| IOResource | 1 | false |
| Java8MapForEach | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| CatchMayIgnoreException | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| SuspiciousMethodCalls | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| UnnecessaryInitCause | 1 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| ExcessiveRangeCheck | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| Anonymous2MethodRef | 1 | false |
| Java8MapApi | 1 | false |
| AssignmentToLambdaParameter | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
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

## RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (authSettings.getAuthMethod()) { case PASSWORD: case ACCESS_TOKEN: if ("http".e...` statement on enum type 'jetbrains.buildServer.buildTriggers.vcs.git.AuthenticationMethod' misses cases: 'ANONYMOUS', 'PRIVATE_KEY_DEFAULT', ...
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
      return;//anonymous protocol, don't check anything
    AuthSettings authSettings = root.getAuthSettings();
    switch (authSettings.getAuthMethod()) {
      case PASSWORD: case ACCESS_TOKEN:
        if ("http".equals(root.getRepositoryFetchURL().getScheme()) ||
            "https".equals(root.getRepositoryFetchURL().getScheme())) {
          GitVersion actualVersion = config.getGitVersion();
          GitVersion requiredVersion = getMinVersionForHttpAuth();
          if (actualVersion.isLessThan(requiredVersion)) {
            throw new VcsException("Password authentication requires git " + requiredVersion +
                                   ", found git version is " + actualVersion +
                                   ". Upgrade git or use different authentication method.");
          }
        } else {
          throw new VcsException("TeamCity doesn't support authentication method '" +
                                 root.getAuthSettings().getAuthMethod().uiName() +
                                 "' with agent checkout and non-http protocols. Please use different authentication method.");
        }
        break;
      case PRIVATE_KEY_FILE:
        throw new VcsException("TeamCity doesn't support authentication method '" +
                               root.getAuthSettings().getAuthMethod().uiName() +
                               "' with agent checkout. Please use different authentication method.");
    }
  }

```

### EnumSwitchStatementWhichMissesCases
`switch (authMethod) { case PASSWORD: res.append(root.getProperty(Constants.PASSWORD));...` statement on enum type 'jetbrains.buildServer.buildTriggers.vcs.git.AuthenticationMethod' misses cases: 'ANONYMOUS', and 'PRIVATE_KEY_DEFAULT'
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/CachingNativeGitTestConnectionRunner.java`
#### Snippet
```java
    final AuthenticationMethod authMethod = Enum.valueOf(AuthenticationMethod.class, root.getProperty(Constants.AUTH_METHOD, AuthenticationMethod.ANONYMOUS.name()));
    res.append(authMethod.name());
    switch (authMethod) {
      case PASSWORD:
        res.append(root.getProperty(Constants.PASSWORD));
        break;
      case ACCESS_TOKEN: {
        res.append(root.getProperty(Constants.TOKEN_ID));
        break;
      }
      case TEAMCITY_SSH_KEY:
        // TODO: uploaded keys with the same name may belong to different projects
        res.append(root.getProperty(VcsRootSshKeyManager.VCS_ROOT_TEAMCITY_SSH_KEY_NAME));
        break;
      case PRIVATE_KEY_FILE:
        res.append(root.getProperty(Constants.PRIVATE_KEY_PATH));
        break;
    }
    return res.toString().hashCode();
  }
```

## RuleId[ruleID=UnnecessaryModifier]
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
Modifier `public` is redundant for interface members
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/ServerPluginConfig.java`
#### Snippet
```java
  String getPatchBuilderClassName();

  public boolean passEnvToChildProcess();

  int getFixedSubmoduleCommitSearchDepth();
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

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentPluginConfig.java`
#### Snippet
```java

  @NotNull
  public GitExec getGitExec();

  int getCheckoutIdleTimeoutSeconds();
```

## RuleId[ruleID=CommentedOutCode]
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

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Logger.enabled` from instance context
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
    if (myDebug) {
      final SimpleDateFormat format = new SimpleDateFormat("[HH:mm:ss]");
      Logger.enabled = true;
      Logger.logger = new DebugLogger() {
        public void log(final int i, final String className, final String msg) {
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Logger.logger` from instance context
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
      final SimpleDateFormat format = new SimpleDateFormat("[HH:mm:ss]");
      Logger.enabled = true;
      Logger.logger = new DebugLogger() {
        public void log(final int i, final String className, final String msg) {
          long now = System.currentTimeMillis();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `Connection.identification` from instance context
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
      if (teamCityVersion != null && teamCityVersion.length() > 0) {
        //trilead prepends SSH-2.0- itself
        Connection.identification = teamCityVersion.replace(' ', '-') + "-" + Connection.identification;
      }
      configureKnownHosts(c);
```

## RuleId[ruleID=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Vector` used
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/SshHandler.java`
#### Snippet
```java
  }

  public Vector<String> replyToChallenge(String username,
                                         String name,
                                         String instruction,
```

### ObsoleteCollection
Obsolete collection type `Vector` used
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/SshHandler.java`
#### Snippet
```java
                                         String instruction,
                                         int numPrompts,
                                         Vector<String> prompt,
                                         Vector<Boolean> echo,
                                         String lastError) {
```

### ObsoleteCollection
Obsolete collection type `Vector` used
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/SshHandler.java`
#### Snippet
```java
                                         int numPrompts,
                                         Vector<String> prompt,
                                         Vector<Boolean> echo,
                                         String lastError) {
    return null;
```

## RuleId[ruleID=RefusedBequest]
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

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `groupedByCommonPrefix.keySet()` may be replaced with 'entrySet()' iteration
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/VcsChangeTreeWalk.java`
#### Snippet
```java

      StringBuilder value = new StringBuilder();
      for (String path: groupedByCommonPrefix.keySet()) {
        if (path.length() > 0) {
          value.append(path).append('\n');
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
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

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`s.size() == 0` can be replaced with 's.isEmpty()'
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHXmlRcpClient.java`
#### Snippet
```java
  @Nullable
  private static <T> Vector<T> adjustNull(final Vector<T> s) {
    return s.size() == 0 ? null : s;
  }
}
```

### SizeReplaceableByIsEmpty
`pattern.length() == 0` can be replaced with 'pattern.isEmpty()'
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
    public HostEntry(final String patterns) {
      for (String pattern : patterns.split("[\t ,]+")) {
        if (pattern.length() == 0) {
          continue;
        }
```

### SizeReplaceableByIsEmpty
`line.length() == 0` can be replaced with 'line.isEmpty()'
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
      while ((line = in.readLine()) != null) {
        line = line.trim();
        if (line.length() == 0 || line.startsWith("#")) {
          continue;
        }
```

### SizeReplaceableByIsEmpty
`a.length() == 0` can be replaced with 'a.isEmpty()'
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
    LinkedList<String> values = new LinkedList<String>();
    for (String a : arg.split("[ \t,]+")) {
      if (a.length() == 0) {
        continue;
      }
```

### SizeReplaceableByIsEmpty
`line.length() == 0` can be replaced with 'line.isEmpty()'
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
          return true;
        }
        if (line.length() == 0) {
          // empty line means end of the mime headers
          break;
```

### SizeReplaceableByIsEmpty
`macType.trim().length() > 0` can be replaced with '!macType.trim().isEmpty()'
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
    myPassphrase = System.getenv(GitSSHHandler.TEAMCITY_PASSPHRASE);
    String macType = System.getenv(GitSSHHandler.TEAMCITY_SSH_MAC_TYPE);
    if (macType != null && macType.trim().length() > 0) {
      MACs.setMacType(macType.trim());
    }
```

### SizeReplaceableByIsEmpty
`teamCityVersion.length() > 0` can be replaced with '!teamCityVersion.isEmpty()'
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
    try {
      String teamCityVersion = System.getenv(GitSSHHandler.TEAMCITY_VERSION);
      if (teamCityVersion != null && teamCityVersion.length() > 0) {
        //trilead prepends SSH-2.0- itself
        Connection.identification = teamCityVersion.replace(' ', '-') + "-" + Connection.identification;
```

### SizeReplaceableByIsEmpty
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentVcsSupport.java`
#### Snippet
```java
    }

    File targetDir = path.length() == 0 ? checkoutDir : new File(checkoutDir, path.replace('/', File.separatorChar));
    if (!targetDir.exists()) {
      //noinspection ResultOfMethodCallIgnored
```

### SizeReplaceableByIsEmpty
`s.length() > 0` can be replaced with '!s.isEmpty()'
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java

  public static boolean isNotEmpty(@Nullable String s) {
    return s != null && s.length() > 0;
  }

```

### SizeReplaceableByIsEmpty
`dirName.length() > 0` can be replaced with '!dirName.isEmpty()'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/MirrorManagerImpl.java`
#### Snippet
```java
        for (String line : readLines(myInvalidDirsFile)) {
          String dirName = line.trim();
          if (dirName.length() > 0)
            myInvalidDirNames.add(dirName);
        }
```

### SizeReplaceableByIsEmpty
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/GitUtils.java`
#### Snippet
```java
   */
  public static String normalizePath(String path) {
    if (path.length() == 0 || path.equals("/")) {
      return path;
    }
```

### SizeReplaceableByIsEmpty
`f.length() == 0` can be replaced with 'f.isEmpty()'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/GitUtils.java`
#### Snippet
```java
    for (int i = 0; i < pc.length; i++) {
      String f = pc[i];
      if (f.length() == 0 || ".".equals(f)) {
        // do nothing
      } else if ("..".equals(f)) {
```

### SizeReplaceableByIsEmpty
`line.length() > 0` can be replaced with '!line.isEmpty()'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/CommandUtil.java`
#### Snippet
```java
      }
      final String line = str.substring(start, lfIndex);
      if (line.length() > 0) {
        res.add(line);
      }
```

### SizeReplaceableByIsEmpty
`line.length() == 0` can be replaced with 'line.isEmpty()'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/credentials/CredentialsHelper.java`
#### Snippet
```java
      String line = null;
      while ((line = reader.readLine()) != null) {
        if (line.length() == 0) {
          break;
        } else {
```

### SizeReplaceableByIsEmpty
`missingTips.size() > 0` can be replaced with '!missingTips.isEmpty()'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/CommitLoaderImpl.java`
#### Snippet
```java
          refsToFetch.stream().filter(RefCommit::isRefTip).map(e -> e.getRef() + ": " + e.getCommit()).collect(Collectors.toSet());

        if (missingTips.size() > 0) {
          final VcsException error = new VcsException("Revisions missing in the local repository: " + StringUtil.join(missingTips, ", "));
          error.setRecoverable(context.getPluginConfig().treatMissingBranchTipAsRecoverableError());
```

### SizeReplaceableByIsEmpty
`additionalMsgs.length() > 0` can be replaced with '!additionalMsgs.isEmpty()'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
    }
    String additionalMsgs = result.getMessages();
    if (additionalMsgs.length() > 0) {
      System.out.println("Remote process messages: " + additionalMsgs);
    }
```

### SizeReplaceableByIsEmpty
`path.length() > 0` can be replaced with '!path.isEmpty()'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/VcsChangeTreeWalk.java`
#### Snippet
```java
      StringBuilder value = new StringBuilder();
      for (String path: groupedByCommonPrefix.keySet()) {
        if (path.length() > 0) {
          value.append(path).append('\n');
        }
```

### SizeReplaceableByIsEmpty
`path.length() > 0` can be replaced with '!path.isEmpty()'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/VcsChangeTreeWalk.java`
#### Snippet
```java
        }
        for (String fileName: groupedByCommonPrefix.get(path)) {
          if (path.length() > 0) {
            value.append("./");
          }
```

### SizeReplaceableByIsEmpty
`newPath.length() == 0` can be replaced with 'newPath.isEmpty()'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmoduleUrlResolver.java`
#### Snippet
```java

    String newPath = mainRepoUri.getPath();
    if (newPath.length() == 0) {
      newPath = submoduleUrl;
    } else {
```

### SizeReplaceableByIsEmpty
`myPathFromRoot.length() == 0` can be replaced with 'myPathFromRoot.isEmpty()'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmoduleResolverImpl.java`
#### Snippet
```java
   */
  private String fullPath(String path) {
    return myPathFromRoot.length() == 0 ? path : myPathFromRoot + "/" + path;
  }
}
```

## RuleId[ruleID=StringBufferReplaceableByString]
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

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `allValuesSupplied &= supplyUsername(uri, (CredentialItem.Username)i)`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/AuthCredentialsProvider.java`
#### Snippet
```java
    for (CredentialItem i : items) {
      if (i instanceof CredentialItem.Username) {
        allValuesSupplied &= supplyUsername(uri, (CredentialItem.Username)i);
      } else if (i instanceof CredentialItem.Password) {
        allValuesSupplied &= supplyPassword((CredentialItem.Password)i);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `allValuesSupplied &= supplyPassword((CredentialItem.Password)i)`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/AuthCredentialsProvider.java`
#### Snippet
```java
        allValuesSupplied &= supplyUsername(uri, (CredentialItem.Username)i);
      } else if (i instanceof CredentialItem.Password) {
        allValuesSupplied &= supplyPassword((CredentialItem.Password)i);
      } else if (i instanceof CredentialItem.StringType && "Passphrase for ".equals(i.getPromptText())) {
        //we provider a passphrase to the jsch, if we are asked about it
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `cExec & !pExec`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/VcsChangeTreeWalk.java`
#### Snippet
```java
    boolean pExec = isExecutable(getFileMode(1));
    String mode;
    if (cExec & !pExec) {
      mode = "a+x";
    } else if (!cExec & pExec) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `!cExec & pExec`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/VcsChangeTreeWalk.java`
#### Snippet
```java
    if (cExec & !pExec) {
      mode = "a+x";
    } else if (!cExec & pExec) {
      mode = "a-x";
    } else {
```

## RuleId[ruleID=TrivialStringConcatenation]
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

## RuleId[ruleID=ManualMinMaxCalculation]
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

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `Retry` has no concrete subclass
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Retry.java`
#### Snippet
```java
 * Retries the provided operation with exponential back off
 */
public abstract class Retry {

  private static final long INITIAL_DELAY_MS = TimeUnit.SECONDS.toMillis(5);
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentMirrorCleaner.java`
#### Snippet
```java
  }

  private void addRepositoryWithSubmodules(@NotNull Set<String> result, @NotNull String repository) {
    result.add(repository);
    for (String s : mySubmoduleManager.getSubmodules(repository)) {
```

### BoundedWildcard
Can generalize to `? extends Ref`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/Refs.java`
#### Snippet
```java
  }

  public Refs(@NotNull Map<String, Ref> refMap) {
    myRefs.putAll(refMap);
  }
```

### BoundedWildcard
Can generalize to `? extends Ref`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/Refs.java`
#### Snippet
```java
  private final Map<String, Ref> myRefs = new HashMap<String, Ref>();

  public Refs(@NotNull final List<Ref> refs) {
    for (Ref r : refs)
      myRefs.put(r.getName(), r);
```

### BoundedWildcard
Can generalize to `? super ObjectId`
in `git-server/src/org/eclipse/jgit/internal/storage/file/MemoryMappedPackIndex.java`
#### Snippet
```java
    }

    private int binarySearch(int firstByte, Function<ObjectId, Integer> compare) {
      int low = firstByte == 0 ? 0 : fanoutTable[firstByte - 1];
      int high = fanoutTable[firstByte];
```

### BoundedWildcard
Can generalize to `? extends RefSpec`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/OperationContext.java`
#### Snippet
```java

  @NotNull
  private String makeKey(@NotNull URIish uri, @NotNull Collection<RefSpec> refSpecs) {
    StringBuilder key = new StringBuilder();
    key.append(uri.toASCIIString());
```

### BoundedWildcard
Can generalize to `? extends RefCommit`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/CommitLoaderImpl.java`
#### Snippet
```java
  }

  private boolean shouldFetchRemoteRefs(@NotNull OperationContext context, @NotNull Collection<RefCommit> revisions, @NotNull Set<String> filteredRemoteRefs) {
    final float factor = context.getPluginConfig().fetchRemoteBranchesFactor();
    if (factor == 0) return false;
```

### BoundedWildcard
Can generalize to `? super String`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
  }

  private void addHttpsProxyPort(List<String> proxySettings) {
    int httpsProxyPort = getFirstNotNullIntegerProperty("teamcity.https.proxyPort", "https.proxyPort");
    if (httpsProxyPort != -1)
```

### BoundedWildcard
Can generalize to `? super String`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
  }

  private void addHttpProxyPort(List<String> proxySettings) {
    int httpProxyPort = getFirstNotNullIntegerProperty("teamcity.http.proxyPort", "http.proxyPort");
    if (httpProxyPort != -1)
```

### BoundedWildcard
Can generalize to `? extends Ref`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitMapFullPath.java`
#### Snippet
```java
  }

  private Set<String> getNewCommits(@NotNull Repository db, @NotNull Map<String, Ref> oldRefs, @NotNull Map<String, Ref> newRefs) throws IOException {
    Set<ObjectId> updatedHeads = new HashSet<ObjectId>();
    Set<ObjectId> uninteresting = new HashSet<ObjectId>();
```

### BoundedWildcard
Can generalize to `? extends RevCommit`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/CheckoutRulesRevWalk.java`
#### Snippet
```java

  @NotNull
  private Set<String> collectUninterestingCommits(@NotNull final Set<RevCommit> uninterestingParents) throws IOException {
    Set<String> result = new HashSet<>();

```

### BoundedWildcard
Can generalize to `? extends RefSpec`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/FetchCommandImpl.java`
#### Snippet
```java
  }

  private String getDebugInfo(Repository db, URIish uri, Collection<RefSpec> refSpecs) {
    StringBuilder sb = new StringBuilder();
    for (RefSpec spec : refSpecs) {
```

### BoundedWildcard
Can generalize to `? extends GitServerExtension`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitVcsSupport.java`
#### Snippet
```java
  }

  public void addExtensions(@NotNull Collection<GitServerExtension> extensions) {
    myExtensions.addAll(extensions);
  }
```

### BoundedWildcard
Can generalize to `? extends MemoryDumpLine`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/process/GitProcessStuckMonitor.java`
#### Snippet
```java
  }

  private boolean procIsStuck(@NotNull List<MemoryDumpLine> memoryDumpLines) {
    if (memoryDumpLines.size() < 1) {
      return false;
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentMirrorCleaner.java`
#### Snippet
```java
public class AgentMirrorCleaner implements DirectoryCleanersProvider {

  private final static Logger LOG = Logger.getInstance(AgentMirrorCleaner.class.getName());
  private final MirrorManager myMirrorManager;
  private final SubmoduleManager mySubmoduleManager;
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/PluginConfigImpl.java`
#### Snippet
```java

  public static final String IGNORE_CHECKOUT_RULES_POSIFIX_CHECK_PARAMETER = "teamcity.internal.git.agent.ignoreCheckoutRulesPostfixCheck";
  private final static Logger LOG = Logger.getInstance(PluginConfigImpl.class);

  private static final Pattern NEW_LINE = Pattern.compile("(\r\n|\r|\n)");
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
   * User home directory
   */
  @NonNls public final static String USER_HOME;

  static {
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
   * Allowed authentication methods
   */
  @NonNls private final static HashSet<String> ALLOWED_METHODS = new HashSet<String>();

  static {
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterWithAlternates.java`
#### Snippet
```java
public class UpdaterWithAlternates extends UpdaterWithMirror {

  private final static Logger LOG = Logger.getLogger(UpdaterWithMirror.class);

  @NotNull private final File myGitDir;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentCommitLoaderFactory.java`
#### Snippet
```java
  }

  private static abstract class AbstractAgentCommitLoader implements AgentCommitLoader {

    @NotNull private final GitVcsRoot myRoot;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterWithMirror.java`
#### Snippet
```java
  }

  private boolean cleanDir(final @NotNull File repositoryDir) {
    return myFS.delete(repositoryDir) && myFS.mkdirs(repositoryDir);
  }
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterWithMirror.java`
#### Snippet
```java
public class UpdaterWithMirror extends UpdaterImpl {

  private final static Logger LOG = Logger.getInstance(UpdaterWithMirror.class.getName());

  public UpdaterWithMirror(@NotNull FS fs,
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
  private final static String JSCH_SSH_LIB = "jsch";
  private final static String TRILEAD_SSH_LIB = "trilead";
  private final static String DEFAULT_SSH_LIB = JSCH_SSH_LIB;

  private final BuildAgent myAgent;
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java

  private final static String JSCH_SSH_LIB = "jsch";
  private final static String TRILEAD_SSH_LIB = "trilead";
  private final static String DEFAULT_SSH_LIB = JSCH_SSH_LIB;

```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
  private final static Logger LOG = Logger.getLogger(GitAgentSSHService.class);

  private final static String JSCH_SSH_LIB = "jsch";
  private final static String TRILEAD_SSH_LIB = "trilead";
  private final static String DEFAULT_SSH_LIB = JSCH_SSH_LIB;
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
public class GitAgentSSHService extends GitSSHService {

  private final static Logger LOG = Logger.getLogger(GitAgentSSHService.class);

  private final static String JSCH_SSH_LIB = "jsch";
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentStartupGitDetector.java`
#### Snippet
```java
public class AgentStartupGitDetector implements AgentParametersSupplier {

  private final static Logger LOG = Logger.getLogger(AgentStartupGitDetector.class);

  static final String WIN_EXECUTABLE_NAME = "git.exe";
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/CheckoutDirectoryCleaner.java`
#### Snippet
```java
  public static final int DEFAULT_COMMAND_TIMEOUT_SEC = 1200;
  public static final int COMMAND_OUTPUT_THRESHOLD = 8 * 1024 * 1024;
  private final static Logger LOG = Logger.getInstance(CheckoutDirectoryCleaner.class.getName());
  @NotNull private final DirectoryMap myDirectoryMap;
  @NotNull private final GitDetector myGitDetector;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/CheckoutDirectoryCleaner.java`
#### Snippet
```java

  @Nullable
  private String getGitPath(final @NotNull AgentRunningBuild build) {
    try {
      return myGitDetector.getGitPathAndVersion(build).getPath();
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/SubmoduleManagerImpl.java`
#### Snippet
```java
public class SubmoduleManagerImpl implements SubmoduleManager {

  private final static Logger LOG = Logger.getInstance(SubmoduleManagerImpl.class.getName());

  @NotNull private final MirrorManager myMirrorManager;
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/ssl/SSLInvestigator.java`
#### Snippet
```java
public class SSLInvestigator {

  private final static Logger LOG = Logger.getLogger(SSLInvestigator.class);

  private final URIish myFetchURL;
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentVcsSupport.java`
#### Snippet
```java
  private final ConcurrentMap<VcsRoot, VcsException> myConfigErrorsCache = new ConcurrentHashMap<VcsRoot, VcsException>();//cached error thrown during config creation per root

  final static String switchCheckoutModeMessage = "Fix the checkout rules to use them with agent-side checkout or enable \"Auto\" VCS checkout mode.";

  final static String agentCheckoutRulesErrorMessage = "The checkout rule '%s' is unsupported for agent-side checkout mode. " +
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentVcsSupport.java`
#### Snippet
```java
  final static String switchCheckoutModeMessage = "Fix the checkout rules to use them with agent-side checkout or enable \"Auto\" VCS checkout mode.";

  final static String agentCheckoutRulesErrorMessage = "The checkout rule '%s' is unsupported for agent-side checkout mode. " +
                                                       "The rules 'a=>[prefix/]a/postfix' are unsupported. Only the rules 'a=>[prefix/]a' are supported for agent-side checkout, the [prefix/] must be the same for all rules. " + switchCheckoutModeMessage;

```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
public class JSchClient {

  private final static int BUF_SIZE = 32 * 1024;

  private final String myHost;
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/ShowRefCommandImpl.java`
#### Snippet
```java

  private final static String INVALID_REF_PREFIX = "error: ";
  private final static String INVALID_REF_SUFFIX = " does not point to a valid object!";
  private String myPattern;
  private boolean myShowTags;
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/ShowRefCommandImpl.java`
#### Snippet
```java
public class ShowRefCommandImpl extends BaseCommandImpl implements ShowRefCommand {

  private final static String INVALID_REF_PREFIX = "error: ";
  private final static String INVALID_REF_SUFFIX = " does not point to a valid object!";
  private String myPattern;
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/ssl/SslOperations.java`
#### Snippet
```java

public class SslOperations {
  public final static String CERT_DIR = "ssl";
  public final static String CERT_FILE = "git_custom_certificates.crt";

```

### MissortedModifiers
Missorted modifiers `final static`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/ssl/SslOperations.java`
#### Snippet
```java
public class SslOperations {
  public final static String CERT_DIR = "ssl";
  public final static String CERT_FILE = "git_custom_certificates.crt";

  private final static Logger LOG = Logger.getLogger(SslOperations.class);
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/ssl/SslOperations.java`
#### Snippet
```java
  public final static String CERT_FILE = "git_custom_certificates.crt";

  private final static Logger LOG = Logger.getLogger(SslOperations.class);

  @NotNull
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
   * Git version supporting an empty credential helper - the only way to disable system/global/local cred helper
   */
  public final static GitVersion EMPTY_CRED_HELPER = new GitVersion(2, 9, 0);
  /** Git version supporting [credential] section in config (the first version including a6fc9fd3f4b42cd97b5262026e18bd451c28ee3c) */
  public final static GitVersion CREDENTIALS_SECTION_VERSION = new GitVersion(1, 7, 10);
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
  private final static GitVersion GIT_WITH_FORCE_SUBMODULE_UPDATE = new GitVersion(1, 7, 6);
  public final static GitVersion GIT_WITH_SPARSE_CHECKOUT = new GitVersion(1, 7, 4);
  public final static GitVersion BROKEN_SPARSE_CHECKOUT = new GitVersion(2, 7, 0);
  public final static GitVersion MIN_GIT_SSH_COMMAND = new GitVersion(2, 3, 0);//GIT_SSH_COMMAND was introduced in git 2.3.0
  public final static GitVersion GIT_UPDATE_REFS_STDIN = new GitVersion(1, 8, 5); // update-refs with '--stdin' support
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
  private final static Logger LOG = Logger.getLogger(UpdaterImpl.class);
  /** Git version which supports --progress option in the fetch command */
  private final static GitVersion GIT_WITH_PROGRESS_VERSION = new GitVersion(1, 7, 1, 0);
  //--force option in git submodule update introduced in 1.7.6
  private final static GitVersion GIT_WITH_FORCE_SUBMODULE_UPDATE = new GitVersion(1, 7, 6);
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
  public final static GitVersion EMPTY_CRED_HELPER = new GitVersion(2, 9, 0);
  /** Git version supporting [credential] section in config (the first version including a6fc9fd3f4b42cd97b5262026e18bd451c28ee3c) */
  public final static GitVersion CREDENTIALS_SECTION_VERSION = new GitVersion(1, 7, 10);
  public final static GitVersion REV_PARSE_LEARNED_SHALLOW_CLONE = new GitVersion(2, 15, 0);

```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
  /** Git version supporting [credential] section in config (the first version including a6fc9fd3f4b42cd97b5262026e18bd451c28ee3c) */
  public final static GitVersion CREDENTIALS_SECTION_VERSION = new GitVersion(1, 7, 10);
  public final static GitVersion REV_PARSE_LEARNED_SHALLOW_CLONE = new GitVersion(2, 15, 0);

  protected final FS myFS;
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
  private final static GitVersion GIT_WITH_PROGRESS_VERSION = new GitVersion(1, 7, 1, 0);
  //--force option in git submodule update introduced in 1.7.6
  private final static GitVersion GIT_WITH_FORCE_SUBMODULE_UPDATE = new GitVersion(1, 7, 6);
  public final static GitVersion GIT_WITH_SPARSE_CHECKOUT = new GitVersion(1, 7, 4);
  public final static GitVersion BROKEN_SPARSE_CHECKOUT = new GitVersion(2, 7, 0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
  public final static GitVersion BROKEN_SPARSE_CHECKOUT = new GitVersion(2, 7, 0);
  public final static GitVersion MIN_GIT_SSH_COMMAND = new GitVersion(2, 3, 0);//GIT_SSH_COMMAND was introduced in git 2.3.0
  public final static GitVersion GIT_UPDATE_REFS_STDIN = new GitVersion(1, 8, 5); // update-refs with '--stdin' support
  public final static GitVersion GIT_CLEAN_LEARNED_EXCLUDE = new GitVersion(1, 7, 3); // clean first learned -e <pattern> and --exclude=<pattern> in 1.7.3
  // in 2.30 git init started reporing hint about defaut initial branch renaming to stderr, see https://github.com/git/git/commit/675704c74dd4476f455bfa91e72eb9e163317c10
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
  public final static GitVersion GIT_WITH_SPARSE_CHECKOUT = new GitVersion(1, 7, 4);
  public final static GitVersion BROKEN_SPARSE_CHECKOUT = new GitVersion(2, 7, 0);
  public final static GitVersion MIN_GIT_SSH_COMMAND = new GitVersion(2, 3, 0);//GIT_SSH_COMMAND was introduced in git 2.3.0
  public final static GitVersion GIT_UPDATE_REFS_STDIN = new GitVersion(1, 8, 5); // update-refs with '--stdin' support
  public final static GitVersion GIT_CLEAN_LEARNED_EXCLUDE = new GitVersion(1, 7, 3); // clean first learned -e <pattern> and --exclude=<pattern> in 1.7.3
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
  //--force option in git submodule update introduced in 1.7.6
  private final static GitVersion GIT_WITH_FORCE_SUBMODULE_UPDATE = new GitVersion(1, 7, 6);
  public final static GitVersion GIT_WITH_SPARSE_CHECKOUT = new GitVersion(1, 7, 4);
  public final static GitVersion BROKEN_SPARSE_CHECKOUT = new GitVersion(2, 7, 0);
  public final static GitVersion MIN_GIT_SSH_COMMAND = new GitVersion(2, 3, 0);//GIT_SSH_COMMAND was introduced in git 2.3.0
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
  public final static GitVersion GIT_CLEAN_LEARNED_EXCLUDE = new GitVersion(1, 7, 3); // clean first learned -e <pattern> and --exclude=<pattern> in 1.7.3
  // in 2.30 git init started reporing hint about defaut initial branch renaming to stderr, see https://github.com/git/git/commit/675704c74dd4476f455bfa91e72eb9e163317c10
  public final static GitVersion GIT_INIT_STDERR_DEFAULT_BRANCH_HINT = new GitVersion(2, 30, 0);
  /**
   * Git version supporting an empty credential helper - the only way to disable system/global/local cred helper
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
  public final static GitVersion MIN_GIT_SSH_COMMAND = new GitVersion(2, 3, 0);//GIT_SSH_COMMAND was introduced in git 2.3.0
  public final static GitVersion GIT_UPDATE_REFS_STDIN = new GitVersion(1, 8, 5); // update-refs with '--stdin' support
  public final static GitVersion GIT_CLEAN_LEARNED_EXCLUDE = new GitVersion(1, 7, 3); // clean first learned -e <pattern> and --exclude=<pattern> in 1.7.3
  // in 2.30 git init started reporing hint about defaut initial branch renaming to stderr, see https://github.com/git/git/commit/675704c74dd4476f455bfa91e72eb9e163317c10
  public final static GitVersion GIT_INIT_STDERR_DEFAULT_BRANCH_HINT = new GitVersion(2, 30, 0);
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
public class UpdaterImpl implements Updater {

  private final static Logger LOG = Logger.getLogger(UpdaterImpl.class);
  /** Git version which supports --progress option in the fetch command */
  private final static GitVersion GIT_WITH_PROGRESS_VERSION = new GitVersion(1, 7, 1, 0);
```

### MissortedModifiers
Missorted modifiers `final protected`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/BaseAuthCommandImpl.java`
#### Snippet
```java
  class GitCommandRetryable implements Retry.Retryable<ExecResult> {
    @NotNull protected byte[] myInput;
    @NotNull final protected GitCommandLine myCmd;
    GitCommandRetryable(@NotNull GitCommandLine cmd, @NotNull byte[] input) {
      myInput = Arrays.copyOf(input, input.length);
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/RemoteRepositoryUrlInvestigatorImpl.java`
#### Snippet
```java
public class RemoteRepositoryUrlInvestigatorImpl implements RemoteRepositoryUrlInvestigator {

  private final static Logger LOG = Logger.getInstance(RemoteRepositoryUrlInvestigatorImpl.class.getName());

  @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-server/src/org/eclipse/jgit/internal/storage/file/MemoryMappedPackIndex.java`
#### Snippet
```java
public class MemoryMappedPackIndex extends PackIndex.PackIndexFactory {

  private final static Logger LOG = Logger.getInstance(MemoryMappedPackIndex.class.getName());

  private static final long IS_O64 = 1L << 31;
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/credentials/CredentialsHelper.java`
#### Snippet
```java


    private final static class Cred {
      private final String myUsername;
      private final String myPassword;
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/TestConnectionCommand.java`
#### Snippet
```java
public class TestConnectionCommand {

  private final static Logger LOG = Logger.getInstance(TestConnectionCommand.class.getName());

  private final GitVcsSupport myGit;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/RepositoryManagerImpl.java`
#### Snippet
```java

  @NotNull
  private String getCanonicalName(final @NotNull File dir) {
    String name = dir.getName();
    if (".".equals(name) || "..".equals(name)) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
  private static final String FETCH_DURATION_METRIC_REPOS = "teamcity.git.fetch.durationMetricRepos";

  private final static Logger LOG = Logger.getInstance(PluginConfigImpl.class.getName());
  private final static int GB = 1024 * 1024 * 1024;//bytes

```

### MissortedModifiers
Missorted modifiers `final static`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java

  private final static Logger LOG = Logger.getInstance(PluginConfigImpl.class.getName());
  private final static int GB = 1024 * 1024 * 1024;//bytes

  public static final float FETCH_PROCESS_MAX_MEMORY_MULT_FACTOR_DEFAULT = 1.4f;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/CheckoutRulesRevWalk.java`
#### Snippet
```java
  }

  private boolean isAcceptedByCheckoutRules(final @NotNull CheckoutRules rules, @NotNull final VcsChangeTreeWalk tw) throws IOException {
    while (tw.next()) {
      final String path = tw.getPathString();
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/ProcessXmxProvider.java`
#### Snippet
```java
public class ProcessXmxProvider {

  private final static Logger LOG = Logger.getInstance(ProcessXmxProvider.class.getName());

  @NotNull private final XmxStorage myStorage;
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitResetCacheHandler.java`
#### Snippet
```java
public class GitResetCacheHandler implements ResetCacheHandler {

  private final static Logger LOG = Logger.getInstance(GitResetCacheHandler.class.getName());
  private final static String GIT_CACHE_NAME = "git";

```

### MissortedModifiers
Missorted modifiers `final static`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitResetCacheHandler.java`
#### Snippet
```java

  private final static Logger LOG = Logger.getInstance(GitResetCacheHandler.class.getName());
  private final static String GIT_CACHE_NAME = "git";

  private final RepositoryManager myRepositoryManager;
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/ResetRevisionsCacheHandler.java`
#### Snippet
```java

  private final static Logger LOG = Logger.getInstance(ResetRevisionsCacheHandler.class.getName());
  private final static String CACHE_NAME = "git revisions cache";
  private final RevisionsCache myCache;

```

### MissortedModifiers
Missorted modifiers `final static`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/ResetRevisionsCacheHandler.java`
#### Snippet
```java
public class ResetRevisionsCacheHandler implements ResetCacheHandler {

  private final static Logger LOG = Logger.getInstance(ResetRevisionsCacheHandler.class.getName());
  private final static String CACHE_NAME = "git revisions cache";
  private final RevisionsCache myCache;
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitLabelingSupport.java`
#### Snippet
```java


  private final static class PackHeuristicsFailed extends RuntimeException {
    public PackHeuristicsFailed(final String message) {
      super(message);
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitLabelingSupport.java`
#### Snippet
```java
public class GitLabelingSupport implements TagCommand {

  private final static Logger LOG = Logger.getInstance(GitLabelingSupport.class.getName());

  private final GitVcsSupport myVcs;
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/AutoCloseRepositoryCache.java`
#### Snippet
```java
  }

  private final static class CachedRepository {
    private final Repository myRepository;
    private final AtomicInteger myOpenCounter = new AtomicInteger(1);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java

  @NotNull
  private static FetchResult fetchWithRetry(final @NotNull ServerPluginConfig config,
                                            final @NotNull Repository r,
                                            final @NotNull URIish url,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
  @NotNull
  private static FetchResult fetchWithRetry(final @NotNull ServerPluginConfig config,
                                            final @NotNull Repository r,
                                            final @NotNull URIish url,
                                            final @NotNull AuthSettings authSettings,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
  private static FetchResult fetchWithRetry(final @NotNull ServerPluginConfig config,
                                            final @NotNull Repository r,
                                            final @NotNull URIish url,
                                            final @NotNull AuthSettings authSettings,
                                            final @NotNull TransportFactory transportFactory,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
                                            final @NotNull Repository r,
                                            final @NotNull URIish url,
                                            final @NotNull AuthSettings authSettings,
                                            final @NotNull TransportFactory transportFactory,
                                            final @NotNull ProgressMonitor progress,
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
                                            final @NotNull URIish url,
                                            final @NotNull AuthSettings authSettings,
                                            final @NotNull TransportFactory transportFactory,
                                            final @NotNull ProgressMonitor progress,
                                            final @NotNull Collection<RefSpec> refSpecs) throws TransportException, NotSupportedException, VcsException {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
                                            final @NotNull AuthSettings authSettings,
                                            final @NotNull TransportFactory transportFactory,
                                            final @NotNull ProgressMonitor progress,
                                            final @NotNull Collection<RefSpec> refSpecs) throws TransportException, NotSupportedException, VcsException {
    try {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
                                            final @NotNull TransportFactory transportFactory,
                                            final @NotNull ProgressMonitor progress,
                                            final @NotNull Collection<RefSpec> refSpecs) throws TransportException, NotSupportedException, VcsException {
    try {
      return Retry.retry(new Retry.Retryable<FetchResult>() {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitCollectChangesPolicy.java`
#### Snippet
```java

  @NotNull
  private List<RevCommit> getCommits(final @NotNull Repository r, final @NotNull RevWalk walk, @NotNull final Collection<String> revisions)
    throws IOException {
    List<RevCommit> result = new ArrayList<>();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitCollectChangesPolicy.java`
#### Snippet
```java

  @NotNull
  private List<RevCommit> getCommits(final @NotNull Repository r, final @NotNull RevWalk walk, @NotNull final Collection<String> revisions)
    throws IOException {
    List<RevCommit> result = new ArrayList<>();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitVcsSupport.java`
#### Snippet
```java
  }

  public Collection<VcsClientMapping> getClientMapping(final @NotNull VcsRoot root, final @NotNull IncludeRule rule) throws VcsException {

    // Using more verbose code as constructor of GitVcsRoot in CPU-hungry, see TW-67881
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitVcsSupport.java`
#### Snippet
```java
  }

  public Collection<VcsClientMapping> getClientMapping(final @NotNull VcsRoot root, final @NotNull IncludeRule rule) throws VcsException {

    // Using more verbose code as constructor of GitVcsRoot in CPU-hungry, see TW-67881
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/TransportFactoryImpl.java`
#### Snippet
```java
public class TransportFactoryImpl implements TransportFactory, SshSessionMetaFactory {

  private final static Logger LOG = Logger.getInstance(TransportFactoryImpl.class.getName());

  private final ServerPluginConfig myConfig;
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchBuilderDispatcher.java`
#### Snippet
```java
public final class GitPatchBuilderDispatcher {

  private final static Logger LOG = Logger.getInstance(GitPatchBuilderDispatcher.class.getName());

  private final ServerPluginConfig myConfig;
```

### MissortedModifiers
Missorted modifiers `final static`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchBuilder.java`
#### Snippet
```java
public class GitPatchBuilder {

  private final static Logger LOG = Logger.getInstance(GitPatchBuilder.class.getName());

  private final OperationContext myContext;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/LoadContentAction.java`
#### Snippet
```java
  }

  private static abstract class LazyInputStream extends InputStream implements PatchBuilderContentInputStream {
    private volatile InputStream myLazyStream;

```

### MissortedModifiers
Missorted modifiers `final static`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchProcess.java`
#### Snippet
```java


  private final static class PrintFile extends PatchFileAction {
    @Override
    void call(@NotNull final String action, @NotNull final String file) {
```

## RuleId[ruleID=EqualsBetweenInconvertibleTypes]
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

## RuleId[ruleID=IgnoreResultOfCall]
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

## RuleId[ruleID=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHXmlRcpClient.java`
#### Snippet
```java
    parameters.add(isNew);
    try {
      return ((Boolean)myClient.execute(methodName("verifyServerHostKey"), parameters)).booleanValue();
    }
    catch (XmlRpcException e) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
     */
    public boolean supportsPasswordAuthentication() {
      return notNull(myPasswordAuthentication).booleanValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
    @SuppressWarnings({"NullableProblems"})
    public int getNumberOfPasswordPrompts() {
      return notNull(myNumberOfPasswordPrompts).intValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
     */
    public boolean supportsPubkeyAuthentication() {
      return notNull(myPubkeyAuthentication).booleanValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
    @SuppressWarnings({"NullableProblems"})
    public boolean isBatchMode() {
      return notNull(myBatchMode).booleanValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
    @SuppressWarnings({"NullableProblems"})
    public int getPort() {
      return notNull(myPort).intValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
          exitStatus = 1;
        }
        System.exit(exitStatus.intValue() == 0 ? myExitCode : exitStatus.intValue());
      }
      finally {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
          exitStatus = 1;
        }
        System.exit(exitStatus.intValue() == 0 ? myExitCode : exitStatus.intValue());
      }
      finally {
```

## RuleId[ruleID=AccessStaticViaInstance]
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

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Entry` is the same as one of its superclass' names
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/commitInfo/CachedDotGitModulesResolver.java`
#### Snippet
```java
  private final ObjectIdOwnerMap<Entry> myCache = new ObjectIdOwnerMap<Entry>();

  private static class Entry extends ObjectIdOwnerMap.Entry {
    private final SubmodulesConfig myConfig;

```

## RuleId[ruleID=OptionalAssignedToNull]
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
Null is used for 'Optional' type in declaration
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/GitRepoOperationsImpl.java`
#### Snippet
```java
  private class LazyGitExec {
    private final ReentrantLock myLock = new ReentrantLock();
    private volatile Optional<GitExec> myRef = null;

    @Nullable
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

## RuleId[ruleID=IfStatementWithIdenticalBranches]
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

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterWithAlternates.java`
#### Snippet
```java
  @Override
  protected void ensureCommitLoaded(boolean fetchRequired) throws VcsException {
    super.fetchFromOriginalRepository(fetchRequired);
  }

```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.buildTriggers.vcs.git.command.GetConfigCommand;`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentGitFacade.java`
#### Snippet
```java
import jetbrains.buildServer.buildTriggers.vcs.git.agent.command.*;
import jetbrains.buildServer.buildTriggers.vcs.git.command.GitFacade;
import jetbrains.buildServer.buildTriggers.vcs.git.command.GetConfigCommand;
import jetbrains.buildServer.buildTriggers.vcs.git.command.SetConfigCommand;
import jetbrains.buildServer.buildTriggers.vcs.git.command.ListConfigCommand;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.buildTriggers.vcs.git.command.SetConfigCommand;`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentGitFacade.java`
#### Snippet
```java
import jetbrains.buildServer.buildTriggers.vcs.git.command.GitFacade;
import jetbrains.buildServer.buildTriggers.vcs.git.command.GetConfigCommand;
import jetbrains.buildServer.buildTriggers.vcs.git.command.SetConfigCommand;
import jetbrains.buildServer.buildTriggers.vcs.git.command.ListConfigCommand;
import jetbrains.buildServer.buildTriggers.vcs.git.command.credentials.ScriptGen;
```

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
Unused import `import static jetbrains.buildServer.buildTriggers.vcs.git.AuthenticationMethod.PASSWORD;`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/AuthSettingsImpl.java`
#### Snippet
```java

import static jetbrains.buildServer.buildTriggers.vcs.git.AuthenticationMethod.ACCESS_TOKEN;
import static jetbrains.buildServer.buildTriggers.vcs.git.AuthenticationMethod.PASSWORD;

public class AuthSettingsImpl implements AuthSettings {
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

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`fetchUrl = fetchUrl + ".git"` could be simplified to 'fetchUrl += ".git"'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitUrlSupport.java`
#### Snippet
```java
      if (gitlabRepo != null) {
        // for GitLab we need to add .git suffix to the fetch URL, otherwise, for some reason JGit can't work with this repository (although regular git command works)
        fetchUrl = fetchUrl + ".git";
        uri = parseURIish(fetchUrl);
      }
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
      Host host = null;
      String line;
      while ((line = in.readLine()) != null) {
        line = line.trim();
        if (line.length() == 0 || line.startsWith("#")) {
```

### NestedAssignment
Result of assignment expression used
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
          try {
            try {
              while ((rc = in.read(buffer)) != -1) {
                out.write(buffer, 0, rc);
              }
```

### NestedAssignment
Result of assignment expression used
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
    try {
      String line;
      while ((line = in.readLine()) != null) {
        //noinspection HardCodedStringLiteral
        if (line.startsWith("Proc-Type: ") && line.indexOf("ENCRYPTED") != -1) {
```

### NestedAssignment
Result of assignment expression used
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
      int count;
      try {
        while ((count = myInput.read(buffer)) != -1) {
          System.out.write(buffer, 0, count);
          myTimestamp.set(System.nanoTime());
```

### NestedAssignment
Result of assignment expression used
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/credentials/CredentialsHelper.java`
#### Snippet
```java
      final BufferedReader reader = new BufferedReader(new InputStreamReader(in));
      String line = null;
      while ((line = reader.readLine()) != null) {
        if (line.length() == 0) {
          break;
```

### NestedAssignment
Result of assignment expression used
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitMergeSupport.java`
#### Snippet
```java
        walk.markStart(dst);
        walk.markUninteresting(base);
        while ((c = walk.next()) != null) {
          tree2commit.put(c.getTree().getId(), c);
        }
```

### NestedAssignment
Result of assignment expression used
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitMergeSupport.java`
#### Snippet
```java
      Map<RevCommit, RevCommit> orig2rebased = new HashMap<RevCommit, RevCommit>();
      List<RevCommit> toRebase = new ArrayList<RevCommit>();
      while ((c = walk.next()) != null) {
        ObjectId treeId = c.getTree().getId();
        RevCommit existing = tree2commit.get(treeId);
```

### NestedAssignment
Result of assignment expression used
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitMapFullPath.java`
#### Snippet
```java
      Set<String> newCommits = new HashSet<String>();
      RevCommit newCommit;
      while ((newCommit = revWalk.next()) != null) {
        newCommits.add(newCommit.name());
      }
```

### NestedAssignment
Result of assignment expression used
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/CheckoutRulesRevWalk.java`
#### Snippet
```java

      RevCommit next;
      while ((next = walk.next()) != null) {
        result.add(next.name());
      }
```

### NestedAssignment
Result of assignment expression used
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/ProcessXmxProvider.java`
#### Snippet
```java
    if (xmx == null) return null;
    myStorage.write(xmx);
    return myPrev = xmx;
  }

```

### NestedAssignment
Result of assignment expression used
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/ProcessXmxProvider.java`
#### Snippet
```java
  private int removeFromStorageAndReturn(int xmx) {
    myStorage.write(null);
    return myPrev = xmx;
  }

```

### NestedAssignment
Result of assignment expression used
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/ModificationDataRevWalk.java`
#### Snippet
```java
        revWalk.next();
        int depth = 0;
        while (result == null && depth < mySearchDepth && (prevRev = revWalk.next()) != null) {
          depth++;
          try (TreeWalk prevTreeWalk = new TreeWalk(getRepository())) {
```

### NestedAssignment
Result of assignment expression used
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitLabelingSupport.java`
#### Snippet
```java

      try {
        while ((c = walk.next()) != null) {
          if (c.equals(commit))
            return true;
```

### NestedAssignment
Result of assignment expression used
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
    Reader processInput = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
    int count = 0;
    while ((count = processInput.read(chars)) != -1) {
      final String str = new String(chars, 0, count);
      sb.append(str);
```

### NestedAssignment
Result of assignment expression used
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/LoadContentAction.java`
#### Snippet
```java
      int size = 0;
      byte[] buf = new byte[8096];
      while ((count = objectStream.read(buf)) != -1) {
        size += count;
      }
```

### NestedAssignment
Result of assignment expression used
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/github/GitHubRawFileContentProvider.java`
#### Snippet
```java
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    int read = 0;
    while ((read = is.read(buffer, 0, buffer.length)) != -1) {
      out.write(buffer, 0, read);
    }
```

### NestedAssignment
Result of assignment expression used
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/commitInfo/GitCommitsInfoBuilder.java`
#### Snippet
```java
      initWalk(walk, currentStateWithTags);
      RevCommit c;
      while ((c = walk.next()) != null) {
        final CommitDataBean commit = createCommit(c);

```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/TestConnectionCommand.java`
#### Snippet
```java
    return JSchLoggers.evaluateWithLoggingLevel(Level.DEBUG, () -> {

      return IOGuard.allowNetworkAndCommandLine(() -> {
        GitVcsRoot root = context.getGitRoot();
        File repositoryTempDir = null;
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
    Map<String, String> fetcherProps = new HashMap<String, String>();
    for (String propName : myFetcherPropertyNames) {
      TeamCityProperties.getPropertiesWithPrefix(propName).forEach((k, v) -> {
        fetcherProps.put(k, v);
      });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/NativeGitCommands.java`
#### Snippet
```java
    try {
      currentTags = executeCommand(ctx, "ls-remote", debugInfo, () -> {
        return gitFacade.lsRemote()
                        .setTags()
                        .setBranches(tag)
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/NativeGitCommands.java`
#### Snippet
```java
  protected <R> R executeCommand(@NotNull Context ctx, @NotNull String action, @NotNull String debugInfo, @NotNull FuncThrow<R, VcsException> cmd, @NotNull GitFacade gitFacade) throws VcsException{
    return executeWithSslHandling(() ->  {
      return NamedThreadFactory.executeWithNewThreadNameFuncThrow(
        String.format("Running native git %s process for : %s", action, debugInfo),
        () -> {
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `myImplementation` is accessed in both synchronized and unsynchronized contexts
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitFileContentDispatcher.java`
#### Snippet
```java
  private final ServerPluginConfig myConfig;

  private VcsFileContentProvider myImplementation;

  public GitFileContentDispatcher(@NotNull GitVcsSupport vcs,
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myImplementation` is accessed in both synchronized and unsynchronized contexts
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/ListFilesDispatcher.java`
#### Snippet
```java
  private final CommitLoader myCommitLoader;
  private final ServerPluginConfig myConfig;
  private ListDirectChildrenPolicy myImplementation;

  public ListFilesDispatcher(@NotNull GitVcsSupport vcs,
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.putAll()` on properties object
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/SshHandler.java`
#### Snippet
```java
      File intPropsFile = FileUtil.createTempFile(ctx.getTempDir(), "int_props", "", true);
      Properties props = new Properties();
      props.putAll(TeamCityProperties.getPropertiesWithPrefix("teamcity."));
      try (FileWriter fw = new FileWriter(intPropsFile)) {
        props.store(fw, "Internal properties");
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitCommitSupport.java`
#### Snippet
```java
    }

    public void createDirectory(@NotNull final String path) {
    }

```

### EmptyMethod
The method is empty
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchBuilderDispatcher.java`
#### Snippet
```java

  private static final class NoOpLineListener implements LineAwareByteArrayOutputStream.LineListener {
    public void newLineDetected(@NotNull final String line) {
    }
  }
```

### EmptyMethod
The method is empty
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchBuilderDispatcher.java`
#### Snippet
```java
    }
    @Override
    public void exit(@NotNull final String message) throws IOException {
    }
  }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `git-agent/src/org/jetbrains/git4idea/util/FastByteArrayBuilder.java`
#### Snippet
```java

  private int alreadyBufferedSize = 0;
  private int index = 0;

  private int nextBlockSize = 512;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `git-agent/src/org/jetbrains/git4idea/util/FastByteArrayBuilder.java`
#### Snippet
```java
  private final LinkedList<byte[]> buffers = new LinkedList<byte[]>();

  private int alreadyBufferedSize = 0;
  private int index = 0;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHService.java`
#### Snippet
```java
   * If true, the component has been initialized
   */
  private boolean myInitialized = false;
  /**
   * Path to the generated script
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
     * Prompt count
     */
    int myPromptCount = 0;
    /**
     * true if keyboard interactive method was cancelled.
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
   * the exit code
   */
  private int myExitCode = 0;
  /**
   * The last error
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/ssl/SSLInvestigator.java`
#### Snippet
```java

  private volatile Boolean myNeedCustomCertificate = null;
  private volatile String myCAInfoPath = null;

  public SSLInvestigator(@NotNull final URIish fetchURL, @NotNull final String tempDirectory, @NotNull final BuildAgentConfiguration agentConfiguration) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/ssl/SSLInvestigator.java`
#### Snippet
```java
  private final SslOperations mySslOperations = new SslOperations();

  private volatile Boolean myNeedCustomCertificate = null;
  private volatile String myCAInfoPath = null;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/RevParseCommandImpl.java`
#### Snippet
```java
public class RevParseCommandImpl extends BaseCommandImpl implements RevParseCommand {
    private String ref;
    private boolean myShallowRepository = false;
    private String myVerifyParam;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/CloneCommandImpl.java`
#### Snippet
```java
public class CloneCommandImpl extends BaseCommandImpl implements CloneCommand {

  private boolean myMirror = false;
  private String myRepo;
  private String myFolder;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/ResetCommandImpl.java`
#### Snippet
```java

public class ResetCommandImpl extends BaseAuthCommandImpl<ResetCommand> implements ResetCommand {
  private boolean myHard = false;
  private String myRevision;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/InitCommandImpl.java`
#### Snippet
```java
  public static final String INITIAL_BRANCH = "main";

  private boolean myBare = false;

  public InitCommandImpl(@NotNull GitCommandLine cmd) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/MergeCommandImpl.java`
#### Snippet
```java
public class MergeCommandImpl extends BaseCommandImpl implements MergeCommand {
  private final List<String> myMergeBranches = new ArrayList<>();
  private boolean myAbort = false;
  private boolean myQuiet = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/MergeCommandImpl.java`
#### Snippet
```java
  private final List<String> myMergeBranches = new ArrayList<>();
  private boolean myAbort = false;
  private boolean myQuiet = false;

  public MergeCommandImpl(@NotNull GitCommandLine myCmd) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/CreateBranchCommandImpl.java`
#### Snippet
```java
  private String myName;
  private String myStartPoint;
  private boolean myTrack = false;

  public CreateBranchCommandImpl(@NotNull GitCommandLine cmd) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitCommandSettings.java`
#### Snippet
```java
  private Integer myTimeout = CommandUtil.DEFAULT_COMMAND_TIMEOUT_SEC;
  private AuthSettings myAuthSettings;
  private boolean myUseNativeSsh = false;
  private Map<String, String> myTraceEnv = Collections.emptyMap();
  private byte[] myInput = new byte[0];
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/SetConfigCommandImpl.java`
#### Snippet
```java
  private String myPropertyName;
  private String myValue;
  private boolean myUnSet = false;

  public SetConfigCommandImpl(@NotNull GitCommandLine cmd) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/LsRemoteCommandImpl.java`
#### Snippet
```java

  private boolean myPeelRefs = false;
  private boolean myTags = false;

  private final List<String> myLsRemoteBranches = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/LsRemoteCommandImpl.java`
#### Snippet
```java
public class LsRemoteCommandImpl extends BaseAuthCommandImpl<LsRemoteCommand> implements LsRemoteCommand {

  private boolean myPeelRefs = false;
  private boolean myTags = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitCommandLine.java`
#### Snippet
```java
  @Nullable protected VcsRootSshKeyManager mySshKeyManager;
  private File myWorkingDirectory;
  private boolean myHasProgress = false;
  private boolean myRepeatOnEmptyOutput = false;
  @Nullable private Integer myMaxOutputSize = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitCommandLine.java`
#### Snippet
```java
  private File myWorkingDirectory;
  private boolean myHasProgress = false;
  private boolean myRepeatOnEmptyOutput = false;
  @Nullable private Integer myMaxOutputSize = null;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitCommandLine.java`
#### Snippet
```java
  @Nullable private Integer myMaxOutputSize = null;

  private boolean myAbnormalExitExpected = false;
  private boolean myStdErrExpected = true;
  private String myStdErrLogLevel = "warn";
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitCommandLine.java`
#### Snippet
```java
  private boolean myHasProgress = false;
  private boolean myRepeatOnEmptyOutput = false;
  @Nullable private Integer myMaxOutputSize = null;

  private boolean myAbnormalExitExpected = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-server/src/org/eclipse/jgit/internal/storage/file/MemoryMappedPackIndex.java`
#### Snippet
```java
    private int o64Offset;

    private volatile boolean isClosed = false;

    PackIndexV2MM(final MappedByteBuffer buffer, final long size) throws IOException {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `git-server/src/org/eclipse/jgit/internal/storage/file/MemoryMappedPackIndex.java`
#### Snippet
```java
      class V2MutableEntry extends MutableEntry {

        private long position = 0;

        @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/LimitingRevWalk.java`
#### Snippet
```java
  private final GitVcsRoot myGitRoot;
  private final Repository myRepository;
  private int myNextCallCount = 0;
  private RevCommit myCurrentCommit;
  private int myNumberOfCommitsToVisit = -1;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/credentials/CredentialsHelper.java`
#### Snippet
```java

  private static class Credentials {
    private boolean myMatchAllUrls = false;//when set to true credentials are provided for every URL
    //url -> credentials
    private final Map<String, Cred> myCredentials = new HashMap<String, Cred>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java
  HttpUriRequest req;

  CloseableHttpResponse resp = null;

  String method = "GET"; //$NON-NLS-1$
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java
  private Proxy proxy;

  private Integer timeout = null;

  private Integer readTimeout;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java
  private TemporaryBufferEntity entity;

  private boolean isUsingProxy = false;

  private Proxy proxy;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/CheckoutRulesRevWalk.java`
#### Snippet
```java
  private final Set<String> myStopRevisions = new HashSet<>();
  private final Set<String> myVisitedRevisions = new HashSet<>();
  private String myClosestPartiallyAffectedMergeCommit = null;

  CheckoutRulesRevWalk(@NotNull final ServerPluginConfig config,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/ProcessXmxProvider.java`
#### Snippet
```java

  @Nullable private Integer myPrev = null;
  private boolean myIsLimitReached = false;

  public ProcessXmxProvider(@NotNull final XmxStorage storage,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/ProcessXmxProvider.java`
#### Snippet
```java
  private final float myMultFactor;

  @Nullable private Integer myPrev = null;
  private boolean myIsLimitReached = false;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitVcsSupport.java`
#### Snippet
```java
  private final GitRepoOperations myGitRepoOperations;
  private ExtensionHolder myExtensionHolder;
  private volatile String myDisplayName = null;
  private final ServerPluginConfig myConfig;
  private final TransportFactory myTransportFactory;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java

  private static class GcListener implements NotificationListener {
    private static Method ourGarbageCollectionNotificationInfo_from = null;
    private static Method ourGarbageCollectionNotificationInfo_getGcInfo = null;
    private static Method ourGcInfo_getMemoryUsageAfterGc = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
  private static class GcListener implements NotificationListener {
    private static Method ourGarbageCollectionNotificationInfo_from = null;
    private static Method ourGarbageCollectionNotificationInfo_getGcInfo = null;
    private static Method ourGcInfo_getMemoryUsageAfterGc = null;
    private static Method ourGcInfo_getMemoryUsageBeforeGc = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
    private static Method ourGarbageCollectionNotificationInfo_getGcInfo = null;
    private static Method ourGcInfo_getMemoryUsageAfterGc = null;
    private static Method ourGcInfo_getMemoryUsageBeforeGc = null;
    private static Method ourGcInfo_getGcDuration = null;
    private static boolean isGcEventListenerInitialized = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
    private static Method ourGcInfo_getMemoryUsageAfterGc = null;
    private static Method ourGcInfo_getMemoryUsageBeforeGc = null;
    private static Method ourGcInfo_getGcDuration = null;
    private static boolean isGcEventListenerInitialized = false;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
    private static Method ourGarbageCollectionNotificationInfo_from = null;
    private static Method ourGarbageCollectionNotificationInfo_getGcInfo = null;
    private static Method ourGcInfo_getMemoryUsageAfterGc = null;
    private static Method ourGcInfo_getMemoryUsageBeforeGc = null;
    private static Method ourGcInfo_getGcDuration = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
    private static Method ourGcInfo_getMemoryUsageBeforeGc = null;
    private static Method ourGcInfo_getGcDuration = null;
    private static boolean isGcEventListenerInitialized = false;

    static {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/process/GitProcessExecutor.java`
#### Snippet
```java

  @NotNull private final ExecResult myEmptyResult;
  private volatile boolean myInterrupted = false;

  public GitProcessExecutor(@NotNull final GeneralCommandLine commandLine) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/process/GitProcessStuckMonitor.java`
#### Snippet
```java
  private volatile boolean myFinished = false;

  private volatile boolean myInterrupted = false;

  private long lastDumpActivity = 0;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/process/GitProcessStuckMonitor.java`
#### Snippet
```java
  private final int myCriticalMemoryCleanedPercent;

  private volatile boolean myFinished = false;

  private volatile boolean myInterrupted = false;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/process/GitProcessStuckMonitor.java`
#### Snippet
```java
  private volatile boolean myInterrupted = false;

  private long lastDumpActivity = 0;

  public GitProcessStuckMonitor(@NotNull final File procGcDump, @NotNull final Long xmx, @NotNull final String commandLineLog) throws VcsException {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/GitRepoOperationsImpl.java`
#### Snippet
```java
  private class LazyGitExec {
    private final ReentrantLock myLock = new ReentrantLock();
    private volatile Optional<GitExec> myRef = null;

    @Nullable
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/IndirectSubmoduleAwareTreeIterator.java`
#### Snippet
```java
   * The current position
   */
  private int myPosition = 0;
  /**
   * The offset mapping
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmodulesConfig.java`
#### Snippet
```java
   * If true the configuration is loaded
   */
  private boolean myIsLoaded = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/GitMainConfigProcessor.java`
#### Snippet
```java

  private final MainConfigManager myMainConfigManager;
  private boolean myNativeGitOperationsEnabled = false;

  public GitMainConfigProcessor(MainConfigManager mainConfigManager) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/CachingNativeGitTestConnectionRunner.java`
#### Snippet
```java
  private final GitVcsSupport myVcsSupport;
  private final Map<Integer, String> myCachedResults = new HashMap<>();
  private int myCacheHits = 0;
  private int myProcessed = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/CachingNativeGitTestConnectionRunner.java`
#### Snippet
```java
  private final Map<Integer, String> myCachedResults = new HashMap<>();
  private int myCacheHits = 0;
  private int myProcessed = 0;

  public CachingNativeGitTestConnectionRunner(GitVcsSupport vcsSupport) {
```

## RuleId[ruleID=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/RepositoryRevisionCache.java`
#### Snippet
```java
 * ThreadSafe.
 */
public final class RepositoryRevisionCache {
  private final ServerPluginConfig myConfig;
  private final File myRepositoryDir;
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `SshSessionMetaFactory`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/TransportFactoryImpl.java`
#### Snippet
```java
* @author dmitry.neverov
*/
public class TransportFactoryImpl implements TransportFactory, SshSessionMetaFactory {

  private final static Logger LOG = Logger.getInstance(TransportFactoryImpl.class.getName());
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-02-26-15-32-54.826.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `PackHeuristicsFailed` does not end with 'Exception'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitLabelingSupport.java`
#### Snippet
```java


  private final static class PackHeuristicsFailed extends RuntimeException {
    public PackHeuristicsFailed(final String message) {
      super(message);
```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
    catch (Throwable t) {
      System.err.println(t.getMessage());
      if (t instanceof NullPointerException || debug)
        t.printStackTrace();
      System.exit(1);
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
      }
      System.err.println(t.getMessage());
      if (t instanceof NullPointerException || debug)
        t.printStackTrace();
      System.exit(1);
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `git-server/src/org/eclipse/jgit/treewalk/SubmoduleAwareTreeIterator.java`
#### Snippet
```java
        p.reset(or, mySubmoduleCommit.getTree().getId());
      } catch (Exception e) {
        if (e instanceof IOException)
          throw (IOException) e;
        IOException ioe = new IOException("Submodule error");
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `git-server/src/org/eclipse/jgit/treewalk/SubmoduleAwareTreeIterator.java`
#### Snippet
```java
          mode = wrappedMode;
        } else {
          if (e instanceof CorruptObjectException) {
            throw (CorruptObjectException) e;
          } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `ex`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
      return r;
    } catch (Exception ex) {
      if (ex instanceof NullPointerException)
        LOG.warn("The repository at directory '" + dir + "' cannot be opened or created", ex);
      throw new VcsException("The repository at directory '" + dir + "' cannot be opened or created, reason: " + ex.toString(), ex);
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchProcess.java`
#### Snippet
```java
        String msg = t.getMessage();
        boolean printStackTrace = false;
        if (t instanceof SubmoduleFetchException) {
          Throwable cause = t.getCause();
          printStackTrace = cause != null && isImportant(cause);
```

## RuleId[ruleID=DuplicateThrows]
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

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/ssl/SSLInvestigator.java`
#### Snippet
```java
    String caInfoPath = myCAInfoPath;
    if (caInfoPath == null) {
      synchronized (this) {
        caInfoPath = myCAInfoPath;
        if (caInfoPath != null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/ssl/SSLInvestigator.java`
#### Snippet
```java
    Boolean need = myNeedCustomCertificate;
    if (need == null) {
      synchronized (this) {
        need = myNeedCustomCertificate;
        if (need != null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitFileContentDispatcher.java`
#### Snippet
```java
  @NotNull
  public byte[] getContent(@NotNull String filePath, @NotNull VcsRoot root, @NotNull String version) throws VcsException {
    synchronized (this) {
      if (myImplementation == null)
        myImplementation = getContentProvider(root);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/ResetRevisionsCacheHandler.java`
#### Snippet
```java
  @Override
  public void resetCache(@NotNull String name) {
    synchronized (this) {
      LOG.info("Reset git revisions cache");
      myCache.reset();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/ListFilesDispatcher.java`
#### Snippet
```java
  @NotNull
  public Collection<VcsFileData> listFiles(@NotNull VcsRoot root, @NotNull String directoryPath) throws VcsException {
    synchronized (this) {
      if (myImplementation == null)
        myImplementation = getPolicy(root);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/LoadContentAction.java`
#### Snippet
```java
    private InputStream getHost() throws IOException {
      if (myLazyStream != null) return myLazyStream;
      synchronized (this) {
        if (myLazyStream != null) return myLazyStream;
        myLazyStream = openStream();
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `git-agent/src/org/jetbrains/git4idea/util/FastByteArrayBuilder.java`
#### Snippet
```java
    int totalSize = size();
    if (totalSize == 0) {
      return new byte[0];
    } else {
      resize(totalSize);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterWithMirror.java`
#### Snippet
```java
          return asRef(s.getBranch(), s.getRevision());
        }
      }).toArray(new Ref[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterWithMirror.java`
#### Snippet
```java
          return s.getName();
        }
      }).toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentStartupGitDetector.java`
#### Snippet
```java
      cmd.addParameter("-V");

      final ExecResult result = SimpleCommandLineProcessRunner.runCommand(cmd, new byte[0]);
      if (result.getExitCode() == 0) {
        final String line = result.getStderr();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentStartupGitDetector.java`
#### Snippet
```java
      cmd.addParameter("env");
      cmd.setWorkingDirectory(FileUtil.createTempDirectory("gitLfs", "")); // workaround for https://youtrack.jetbrains.com/issue/TW-63074
      ExecResult result = SimpleCommandLineProcessRunner.runCommand(cmd, new byte[0]);
      if (result.getExitCode() != 0)
        return;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/MirrorManagerImpl.java`
#### Snippet
```java
      }
    });
    return dirs != null ? dirs : new File[0];
  }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitCommandSettings.java`
#### Snippet
```java
  private boolean myUseNativeSsh = false;
  private Map<String, String> myTraceEnv = Collections.emptyMap();
  private byte[] myInput = new byte[0];

  public static GitCommandSettings with() {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/CommandUtil.java`
#### Snippet
```java

  public static ExecResult runCommand(@NotNull GitCommandLine cli, int timeoutSeconds) throws VcsException {
    return runCommand(cli, timeoutSeconds, new byte[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/BaseAuthCommandImpl.java`
#### Snippet
```java
  @NotNull
  protected ExecResult runCmd(@NotNull GitCommandLine cmd) throws VcsException {
    return runCmd(cmd, new byte[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitMergeSupport.java`
#### Snippet
```java
    DirCacheBuilder dcb = dc.builder();

    dcb.addTree(new byte[]{}, 0, db.getObjectDatabase().newReader(), merger.getResultTreeId());
    inserter.flush();
    dcb.finish();
```

## RuleId[ruleID=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/GitExternalChangeViewerExtension.java`
#### Snippet
```java
    if (vcsHostingRepo != null) {
      final VcsHostingRepo finalVcsHostingRepo = vcsHostingRepo;
      return new HashMap<String, String>() {{
        put(PropertyType.CHANGE_SET_TYPE, finalVcsHostingRepo.repositoryUrl() + "/commits/${changeSetId}");
        put(PropertyType.LINK_TEXT, "Open in Bitbucket Server");
```

### DoubleBraceInitialization
Double brace initialization
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/GitExternalChangeViewerExtension.java`
#### Snippet
```java
    if (vcsHostingRepo != null) {
      final VcsHostingRepo finalVcsHostingRepo = vcsHostingRepo;
      return new HashMap<String, String>() {{
        put(PropertyType.CHANGE_SET_TYPE, finalVcsHostingRepo.repositoryUrl() + "/commit/${changeSetId}");
        put(PropertyType.LINK_TEXT, "Open in GitHub");
```

### DoubleBraceInitialization
Double brace initialization
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/GitExternalChangeViewerExtension.java`
#### Snippet
```java
    if (vcsHostingRepo != null) {
      final VcsHostingRepo finalVcsHostingRepo = vcsHostingRepo;
      return new HashMap<String, String>() {{
        put(PropertyType.CHANGE_SET_TYPE, finalVcsHostingRepo.repositoryUrl() + "/commit/${changeSetId}");
        put(PropertyType.LINK_TEXT, "Open in Gitlab.com");
```

### DoubleBraceInitialization
Double brace initialization
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/GitExternalChangeViewerExtension.java`
#### Snippet
```java
    if (vcsHostingRepo != null) {
      final VcsHostingRepo finalVcsHostingRepo = vcsHostingRepo;
      return new HashMap<String, String>() {{
        put(PropertyType.CHANGE_SET_TYPE, finalVcsHostingRepo.repositoryUrl() + "/commits/${changeSetId}");
        put(PropertyType.LINK_TEXT, "Open in Bitbucket Cloud");
```

### DoubleBraceInitialization
Double brace initialization
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/GitExternalChangeViewerExtension.java`
#### Snippet
```java
    if (vcsHostingRepo != null) {
      final VcsHostingRepo finalVcsHostingRepo = vcsHostingRepo;
      return new HashMap<String, String>() {{
        put(PropertyType.CHANGE_SET_TYPE, finalVcsHostingRepo.repositoryUrl() + "/commit/${changeSetId}");
        put(PropertyType.LINK_TEXT, "Open in Azure DevOps Services");
```

## RuleId[ruleID=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'CommonURIishImpl' type conflicts with preceding 'instanceof CommonURIish' check
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/CommonURIishImpl.java`
#### Snippet
```java
    if (!(obj instanceof CommonURIish))
      return false;
    final CommonURIishImpl other = (CommonURIishImpl) obj;

    return myURIish.equals(other.get());
```

### CastConflictsWithInstanceof
Cast to 'CommonURIishImpl' type conflicts with preceding 'instanceof CommonURIish' check
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/CommonURIishImpl.java`
#### Snippet
```java
    if (!(obj instanceof CommonURIish))
      return false;
    final CommonURIishImpl other = (CommonURIishImpl) obj;

    return myURIish.equals(other.get());
```

## RuleId[ruleID=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `GitOutdatedIndexException` ends with 'Exception'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/errors/GitOutdatedIndexException.java`
#### Snippet
```java
import jetbrains.buildServer.vcs.VcsException;

public class GitOutdatedIndexException extends VcsException {

  public GitOutdatedIndexException(final Throwable cause) {
```

### NonExceptionNameEndsWithException
Non-exception class name `CheckoutCanceledException` ends with 'Exception'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/errors/CheckoutCanceledException.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class CheckoutCanceledException extends VcsException {

  public CheckoutCanceledException(@NotNull String reason) {
```

### NonExceptionNameEndsWithException
Non-exception class name `GitIndexCorruptedException` ends with 'Exception'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/errors/GitIndexCorruptedException.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class GitIndexCorruptedException extends VcsException {

  private final File myGitIndex;
```

### NonExceptionNameEndsWithException
Non-exception class name `VcsAuthenticationException` ends with 'Exception'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/VcsAuthenticationException.java`
#### Snippet
```java
 * @author dmitry.neverov
 */
public class VcsAuthenticationException extends VcsException {

  public VcsAuthenticationException(String message) {
```

### NonExceptionNameEndsWithException
Non-exception class name `SubmoduleException` ends with 'Exception'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmoduleException.java`
#### Snippet
```java
import java.util.Set;

public interface SubmoduleException {

  @NotNull
```

## RuleId[ruleID=UnusedAssignment]
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
Variable `db` initializer `null` is redundant
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmoduleResolverImpl.java`
#### Snippet
```java

  public SubmoduleResolverImpl getSubResolver(RevCommit commit, String path) {
    Repository db = null;
    try {
      db = resolveRepository(getSubmoduleUrl(path));
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

## RuleId[ruleID=ConstantValue]
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
Condition `e instanceof VcsException` is always `false`
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

## RuleId[ruleID=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`line.indexOf("ENCRYPTED") != -1` can be replaced with 'line.contains("ENCRYPTED")'
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
      while ((line = in.readLine()) != null) {
        //noinspection HardCodedStringLiteral
        if (line.startsWith("Proc-Type: ") && line.indexOf("ENCRYPTED") != -1) {
          return true;
        }
```

## RuleId[ruleID=IOResource]
### IOResource
'PrintWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/credentials/CredentialsHelper.java`
#### Snippet
```java

    private void printResult(@NotNull OutputStream out) throws IOException {
      PrintWriter writer = new PrintWriter(out);
      if (myProtocol != null)
        writer.print("protocol=" + myProtocol + "\n");
```

## RuleId[ruleID=Java8MapForEach]
### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitCommandLine.java`
#### Snippet
```java
    }

    settings.getTraceEnv().entrySet().forEach(e -> addEnvParam(e.getKey(), e.getValue()));

    final AuthSettings authSettings = settings.getAuthSettings();
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `AgentCommitLoaderFactory` has only 'static' members, and lacks a 'private' constructor
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentCommitLoaderFactory.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class AgentCommitLoaderFactory {

  public static final String REQUEST_UNADVERTISED_OBJECT_NOT_ALLOWED = "server does not allow request for unadvertised object";
```

### UtilityClassWithoutPrivateConstructor
Class `GitUtilsAgent` has only 'static' members, and lacks a 'private' constructor
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitUtilsAgent.java`
#### Snippet
```java
 * @since 2019.1
 */
public class GitUtilsAgent {

  public static String getShortBranchName(@NotNull String fullRefName) {
```

### UtilityClassWithoutPrivateConstructor
Class `CleanCommandUtil` has only 'static' members, and lacks a 'private' constructor
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/CleanCommandUtil.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class CleanCommandUtil {

  @NotNull
```

### UtilityClassWithoutPrivateConstructor
Class `SshPubkeyAcceptedAlgorithms` has only 'static' members, and lacks a 'private' constructor
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/jsch/SshPubkeyAcceptedAlgorithms.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class SshPubkeyAcceptedAlgorithms {
  public static final String DOMAINS_WITH_ENFORCED_SHA_1_SIGNATURE = "teamcity.git.ssh.domainsWithEnforcedSha1Signature";

```

### UtilityClassWithoutPrivateConstructor
Class `GitUtils` has only 'static' members, and lacks a 'private' constructor
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/GitUtils.java`
#### Snippet
```java
 * Commands that allows working with git repositories
 */
public class GitUtils {
  private static final String SSH_V2 = "SSH-2.0";

```

### UtilityClassWithoutPrivateConstructor
Class `SslOperations` has only 'static' members, and lacks a 'private' constructor
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/ssl/SslOperations.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class SslOperations {
  public final static String CERT_DIR = "ssl";
  public final static String CERT_FILE = "git_custom_certificates.crt";
```

### UtilityClassWithoutPrivateConstructor
Class `CommandUtil` has only 'static' members, and lacks a 'private' constructor
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/CommandUtil.java`
#### Snippet
```java
import static jetbrains.buildServer.util.FileUtil.normalizeSeparator;

public class CommandUtil {
  private static final Logger LOG = Logger.getInstance(CommandUtil.class);
  
```

### UtilityClassWithoutPrivateConstructor
Class `Errors` has only 'static' members, and lacks a 'private' constructor
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/errors/Errors.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class Errors {

  private static final Pattern OUTDATED_INDEX_PATTERN = Pattern.compile(".*Entry '.+' not uptodate\\. Cannot merge\\..*", Pattern.DOTALL);
```

### UtilityClassWithoutPrivateConstructor
Class `GitGcProcess` has only 'static' members, and lacks a 'private' constructor
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitGcProcess.java`
#### Snippet
```java
import java.io.PrintWriter;

public class GitGcProcess {

  public static void main(String... args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `PersonIdentFactory` has only 'static' members, and lacks a 'private' constructor
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PersonIdentFactory.java`
#### Snippet
```java
 * @since 2019.1
 */
public class PersonIdentFactory {

  @NotNull
```

### UtilityClassWithoutPrivateConstructor
Class `LogUtil` has only 'static' members, and lacks a 'private' constructor
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/LogUtil.java`
#### Snippet
```java
 * @author Eugene Petrenko (eugene.petrenko@jetbrains.com)
 */
public class LogUtil {
  private static final String NULL_OBJECT = "<null>";

```

### UtilityClassWithoutPrivateConstructor
Class `GitServerUtil` has only 'static' members, and lacks a 'private' constructor
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
 * Utilities for server part of the plugin
 */
public class GitServerUtil {

  public static final long KB = 1024;
```

### UtilityClassWithoutPrivateConstructor
Class `Fetcher` has only 'static' members, and lacks a 'private' constructor
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
 * @author dmitry.neverov
 */
public class Fetcher {

  public static void main(String[] args) throws IOException, VcsException, URISyntaxException {
```

### UtilityClassWithoutPrivateConstructor
Class `SubmoduleExceptionUtil` has only 'static' members, and lacks a 'private' constructor
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmoduleExceptionUtil.java`
#### Snippet
```java
import java.util.Set;

class SubmoduleExceptionUtil {

  static void addAffectedBranches(@NotNull StringBuilder result, @NotNull Set<String> branches) {
```

### UtilityClassWithoutPrivateConstructor
Class `GitPatchProcess` has only 'static' members, and lacks a 'private' constructor
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchProcess.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class GitPatchProcess {

  public static void main(String... args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `SubmoduleAwareTreeIteratorFactory` has only 'static' members, and lacks a 'private' constructor
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmoduleAwareTreeIteratorFactory.java`
#### Snippet
```java
 * @author dmitry.neverov
 */
public class SubmoduleAwareTreeIteratorFactory {

  /**
```

## RuleId[ruleID=DataFlowIssue]
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
Condition `e instanceof ProcessTimeoutException` is redundant and can be replaced with a null check
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/CommandUtil.java`
#### Snippet
```java
    boolean attemptsLeft = attempt < maxAttempts;

    if (e instanceof ProcessTimeoutException || e instanceof GitExecTimeout) return attemptsLeft;

    if (!(e instanceof VcsException)) return false;
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

## RuleId[ruleID=StringOperationCanBeSimplified]
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

## RuleId[ruleID=DeprecatedIsStillUsed]
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

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/GitVcsRoot.java`
#### Snippet
```java

  private AuthSettings createAuthSettings(@NotNull URIishHelper urIishHelper) {
    return new AuthSettingsImpl(this, urIishHelper, myTokenRefreshEnabled ? tokenId -> getOrRefreshToken(tokenId) : null);
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/TransportFactoryImpl.java`
#### Snippet
```java
    HttpConnectionFactory f;
    if ("httpClient".equals(factoryName)) {
      f = new SNIHttpClientConnectionFactory(() -> myGitTrustStoreProvider.getTrustStore());
    } else if ("httpClientNoSNI".equals(factoryName)) {
      f = new SSLHttpClientConnectionFactory(() -> myGitTrustStoreProvider.getTrustStore());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/TransportFactoryImpl.java`
#### Snippet
```java
      f = new SNIHttpClientConnectionFactory(() -> myGitTrustStoreProvider.getTrustStore());
    } else if ("httpClientNoSNI".equals(factoryName)) {
      f = new SSLHttpClientConnectionFactory(() -> myGitTrustStoreProvider.getTrustStore());
    } else {
      f = new TeamCityJDKHttpConnectionFactory(myConfig, () -> myGitTrustStoreProvider.getTrustStore());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/TransportFactoryImpl.java`
#### Snippet
```java
      f = new SSLHttpClientConnectionFactory(() -> myGitTrustStoreProvider.getTrustStore());
    } else {
      f = new TeamCityJDKHttpConnectionFactory(myConfig, () -> myGitTrustStoreProvider.getTrustStore());
    }
    HttpTransport.setConnectionFactory(f);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/NativeGitCommands.java`
#### Snippet
```java
                          .setBranches(settings.getRefSpecs()
                                               .stream()
                                               .map(r -> r.toString())
                                               .map(s -> s.substring(s.lastIndexOf(":")+1))
                                               .filter(s -> !s.contains("*"))
```

## RuleId[ruleID=UnnecessaryCallToStringValueOf]
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

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'myConfig' in a Serializable class
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/commitInfo/CachedDotGitModulesResolver.java`
#### Snippet
```java

  private static class Entry extends ObjectIdOwnerMap.Entry {
    private final SubmodulesConfig myConfig;

    private Entry(@NotNull final AnyObjectId id,
```

## RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `mark()` overrides synchronized method
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java
      }

      public void mark(final int readlimit) {
        delegate.mark(readlimit);
      }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java
      }

      public void reset() throws IOException {
        delegate.reset();
      }
```

## RuleId[ruleID=RedundantCollectionOperation]
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

## RuleId[ruleID=CatchMayIgnoreException]
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

## RuleId[ruleID=ProtectedMemberInFinalClass]
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

## RuleId[ruleID=UnnecessaryToStringCall]
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
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/FetchCommandImpl.java`
#### Snippet
```java
      sb.append(spec).append(" ");
    }
    return "(" + (db.getDirectory() != null? db.getDirectory().getAbsolutePath() + ", ":"") + uri.toString() + "#" + sb.toString() + ")";
  }

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
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/TransportFactoryImpl.java`
#### Snippet
```java
      File localRepository = new File(url.getPath());
      if (!localRepository.exists()) {
        String error = "Cannot access the '" + url.toString() + "' repository";
        if (SystemInfo.isWindows) {
          error += ". If TeamCity is run as a Windows service, it cannot access network mapped drives. Make sure this is not your case.";
```

## RuleId[ruleID=SuspiciousMethodCalls]
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

## RuleId[ruleID=InnerClassMayBeStatic]
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

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentVcsSupport.java`
#### Snippet
```java
      String from = rule.getFrom();
      String to = rule.getTo();
      if (from.equals("")) {
        targetDir = assignTargetDir(targetDir, to, rule, previousRule);
      }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/MirrorManagerImpl.java`
#### Snippet
```java
        int separatorIndex = line.lastIndexOf(" = ");
        if (separatorIndex == -1) {
          if (!line.equals(""))
            LOG.warn("Cannot parse mapping '" + line + "', skip it.");
        } else {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `git-server/src/org/eclipse/jgit/treewalk/SubmoduleAwareTreeIterator.java`
#### Snippet
```java
  @NotNull
  private String getPathFromRoot(String path) {
    if ("".equals(myPathFromRoot) || myPathFromRoot.endsWith("/") || path.startsWith("/")) {
      return myPathFromRoot + path;
    } else {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/github/GitHubListFilesSupport.java`
#### Snippet
```java
    if (!isUnder(parentDir, path))
      return null;
    if (parentDir.equals("") && !path.contains("/"))
      return path;
    String subPath = parentDir.endsWith("/") ? path.substring(parentDir.length()) : path.substring(parentDir.length() + 1);
```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `myScript` accessed in synchronized context
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHService.java`
#### Snippet
```java
  @NotNull
  public synchronized String getScriptPath() throws IOException {
    if (myScript == null || myScriptPath == null || !myScript.exists()) {
      ScriptGenerator generator = new ScriptGenerator(GitSSHHandler.GIT_SSH_PREFIX, SSHMain.class, getTempDir());
      generator.addClasses(XmlRpcClientLite.class, DecoderException.class);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScriptPath` accessed in synchronized context
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHService.java`
#### Snippet
```java
  @NotNull
  public synchronized String getScriptPath() throws IOException {
    if (myScript == null || myScriptPath == null || !myScript.exists()) {
      ScriptGenerator generator = new ScriptGenerator(GitSSHHandler.GIT_SSH_PREFIX, SSHMain.class, getTempDir());
      generator.addClasses(XmlRpcClientLite.class, DecoderException.class);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScript` accessed in synchronized context
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHService.java`
#### Snippet
```java
  @NotNull
  public synchronized String getScriptPath() throws IOException {
    if (myScript == null || myScriptPath == null || !myScript.exists()) {
      ScriptGenerator generator = new ScriptGenerator(GitSSHHandler.GIT_SSH_PREFIX, SSHMain.class, getTempDir());
      generator.addClasses(XmlRpcClientLite.class, DecoderException.class);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScript` accessed in synchronized context
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHService.java`
#### Snippet
```java
      generator.addPath(getSshLibraryPath());
      generator.addResource(SSHMainBundle.class, "/org/jetbrains/git4idea/ssh/SSHMainBundle.properties");
      myScript = generator.generate();
      myScriptPath = myScript.getCanonicalPath();
      if (SystemInfo.isWindows && myScriptPath.contains(" ")) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScriptPath` accessed in synchronized context
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHService.java`
#### Snippet
```java
      generator.addResource(SSHMainBundle.class, "/org/jetbrains/git4idea/ssh/SSHMainBundle.properties");
      myScript = generator.generate();
      myScriptPath = myScript.getCanonicalPath();
      if (SystemInfo.isWindows && myScriptPath.contains(" ")) {
        myScriptPath = GitUtils.getShortFileName(myScript);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScript` accessed in synchronized context
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHService.java`
#### Snippet
```java
      generator.addResource(SSHMainBundle.class, "/org/jetbrains/git4idea/ssh/SSHMainBundle.properties");
      myScript = generator.generate();
      myScriptPath = myScript.getCanonicalPath();
      if (SystemInfo.isWindows && myScriptPath.contains(" ")) {
        myScriptPath = GitUtils.getShortFileName(myScript);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScriptPath` accessed in synchronized context
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHService.java`
#### Snippet
```java
      myScript = generator.generate();
      myScriptPath = myScript.getCanonicalPath();
      if (SystemInfo.isWindows && myScriptPath.contains(" ")) {
        myScriptPath = GitUtils.getShortFileName(myScript);
      }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScriptPath` accessed in synchronized context
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHService.java`
#### Snippet
```java
      myScriptPath = myScript.getCanonicalPath();
      if (SystemInfo.isWindows && myScriptPath.contains(" ")) {
        myScriptPath = GitUtils.getShortFileName(myScript);
      }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScript` accessed in synchronized context
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHService.java`
#### Snippet
```java
      myScriptPath = myScript.getCanonicalPath();
      if (SystemInfo.isWindows && myScriptPath.contains(" ")) {
        myScriptPath = GitUtils.getShortFileName(myScript);
      }
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScriptPath` accessed in synchronized context
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHService.java`
#### Snippet
```java
      }
    }
    return myScriptPath;
  }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScript` accessed in synchronized context
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
  public synchronized String getScriptPath() throws IOException {
    String lib = getSshLib();
    if (!lib.equals(mySshLib) && (myScript != null || myScriptPath != null)) {
      //reset script when ssh lib changes
      if (myScript != null)
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScriptPath` accessed in synchronized context
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
  public synchronized String getScriptPath() throws IOException {
    String lib = getSshLib();
    if (!lib.equals(mySshLib) && (myScript != null || myScriptPath != null)) {
      //reset script when ssh lib changes
      if (myScript != null)
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScript` accessed in synchronized context
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
    if (!lib.equals(mySshLib) && (myScript != null || myScriptPath != null)) {
      //reset script when ssh lib changes
      if (myScript != null)
        FileUtil.delete(myScript);
      myScript = null;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScript` accessed in synchronized context
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
      //reset script when ssh lib changes
      if (myScript != null)
        FileUtil.delete(myScript);
      myScript = null;
      myScriptPath = null;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScript` accessed in synchronized context
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
      if (myScript != null)
        FileUtil.delete(myScript);
      myScript = null;
      myScriptPath = null;
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScriptPath` accessed in synchronized context
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
        FileUtil.delete(myScript);
      myScript = null;
      myScriptPath = null;
    }
    mySshLib = lib;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScript` accessed in synchronized context
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
    }
    if (JSCH_SSH_LIB.equals(lib)) {
      if (myScript == null || myScriptPath == null || !myScript.exists()) {
        ScriptGenerator generator = new ScriptGenerator(GitSSHHandler.GIT_SSH_PREFIX, JSchClient.class, getTempDir());
        generator.addClasses(JSch.class);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScriptPath` accessed in synchronized context
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
    }
    if (JSCH_SSH_LIB.equals(lib)) {
      if (myScript == null || myScriptPath == null || !myScript.exists()) {
        ScriptGenerator generator = new ScriptGenerator(GitSSHHandler.GIT_SSH_PREFIX, JSchClient.class, getTempDir());
        generator.addClasses(JSch.class);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScript` accessed in synchronized context
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
    }
    if (JSCH_SSH_LIB.equals(lib)) {
      if (myScript == null || myScriptPath == null || !myScript.exists()) {
        ScriptGenerator generator = new ScriptGenerator(GitSSHHandler.GIT_SSH_PREFIX, JSchClient.class, getTempDir());
        generator.addClasses(JSch.class);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScript` accessed in synchronized context
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
        generator.addClasses(Pair.class); // JSchConfigInitializer depends on it
        generator.addClasses(MapSerializerUtil.class); // SshPubkeyAcceptedAlgorithms depends on it via StringUtil
        myScript = generator.generate();
        myScriptPath = myScript.getCanonicalPath();
        if (SystemInfo.isWindows && myScriptPath.contains(" ")) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScriptPath` accessed in synchronized context
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
        generator.addClasses(MapSerializerUtil.class); // SshPubkeyAcceptedAlgorithms depends on it via StringUtil
        myScript = generator.generate();
        myScriptPath = myScript.getCanonicalPath();
        if (SystemInfo.isWindows && myScriptPath.contains(" ")) {
          myScriptPath = GitUtils.getShortFileName(myScript);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScript` accessed in synchronized context
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
        generator.addClasses(MapSerializerUtil.class); // SshPubkeyAcceptedAlgorithms depends on it via StringUtil
        myScript = generator.generate();
        myScriptPath = myScript.getCanonicalPath();
        if (SystemInfo.isWindows && myScriptPath.contains(" ")) {
          myScriptPath = GitUtils.getShortFileName(myScript);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScriptPath` accessed in synchronized context
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
        myScript = generator.generate();
        myScriptPath = myScript.getCanonicalPath();
        if (SystemInfo.isWindows && myScriptPath.contains(" ")) {
          myScriptPath = GitUtils.getShortFileName(myScript);
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScriptPath` accessed in synchronized context
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
        myScriptPath = myScript.getCanonicalPath();
        if (SystemInfo.isWindows && myScriptPath.contains(" ")) {
          myScriptPath = GitUtils.getShortFileName(myScript);
        }
      }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScript` accessed in synchronized context
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
        myScriptPath = myScript.getCanonicalPath();
        if (SystemInfo.isWindows && myScriptPath.contains(" ")) {
          myScriptPath = GitUtils.getShortFileName(myScript);
        }
      }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `myScriptPath` accessed in synchronized context
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitAgentSSHService.java`
#### Snippet
```java
        }
      }
      return myScriptPath;
    }
    throw new IllegalStateException("Unknown ssh library '" + lib + "'");
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
      BuildDirectoryCleanerCallback c = new BuildDirectoryCleanerCallback(myLogger, LOG);
      myDirectoryCleaner.cleanFolder(myTargetDirectory, c);
      //noinspection ResultOfMethodCallIgnored
      if (c.isHasErrors()) {
        throw new VcsException("Unable to clean directory " + myTargetDirectory + " for VCS root " + myRoot.getName());
```

### RedundantSuppression
Redundant suppression
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHService.java`
#### Snippet
```java
  @SuppressWarnings({"MethodMayBeStatic"})
  @Nullable
  protected File getTempDir() {
    return null;
  }
```

### RedundantSuppression
Redundant suppression
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
     */
    @SuppressWarnings({"NullableProblems"})
    public int getPort() {
      return notNull(myPort).intValue();
    }
```

### RedundantSuppression
Redundant suppression
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
     */
    @SuppressWarnings({"NullableProblems"})
    public boolean isBatchMode() {
      return notNull(myBatchMode).booleanValue();
    }
```

### RedundantSuppression
Redundant suppression
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
     */
    @SuppressWarnings({"NullableProblems"})
    public int getNumberOfPasswordPrompts() {
      return notNull(myNumberOfPasswordPrompts).intValue();
    }
```

### RedundantSuppression
Redundant suppression
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
     */
    @SuppressWarnings({"HardCodedStringLiteral"})
    private void setDefaults() {
      if (myUser == null) {
        myUser = System.getProperty("user.name");
```

### RedundantSuppression
Redundant suppression
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
      }
    };
    @SuppressWarnings({"HardCodedStringLiteral"}) final Thread t = new Thread(action, "Forwarding " + name);
    t.setDaemon(true);
    t.start();
```

### RedundantSuppression
Redundant suppression
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/CommandLineUtil.java`
#### Snippet
```java
  @Nullable
  public static VcsException getCommandLineError(@NotNull String cmdName, @NotNull String details, @NotNull ExecResult res, boolean includeStdOut, boolean includeStdErr) {
    //noinspection ThrowableResultOfMethodCallIgnored
    Throwable exception = res.getException();
    int exitCode = res.getExitCode();
```

### RedundantSuppression
Redundant suppression
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/Retry.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private static long backOff(long previousDelay) {
    return previousDelay * BACKOFF_FACTOR + (long)(new Random().nextGaussian() * previousDelay * BACKOFF_JITTER);
  }
```

### RedundantSuppression
Redundant suppression
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/CommandUtil.java`
#### Snippet
```java

  @SuppressWarnings({"ThrowableResultOfMethodCallIgnored"})
  private static void checkCommandFailed(@NotNull GitCommandLine cmd, @NotNull String cmdName, @NotNull ExecResult res) throws VcsException {
    if (cmd.isAbnormalExitExpected() && res.getExitCode() != 0 && res.getException() == null) {
      logMessage(cmdName + " exit code is " + res.getExitCode() + ": it is expected behaviour.", "debug");
```

### RedundantSuppression
Redundant suppression
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/CommandUtil.java`
#### Snippet
```java

  @SuppressWarnings({"ThrowableResultOfMethodCallIgnored"})
  private static void commandFailed(final String cmdName, final ExecResult res) throws VcsException {
    Throwable exception = res.getException();
    String stderr = res.getStderr().trim();
```

### RedundantSuppression
Redundant suppression
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/GitRepoOperationsImpl.java`
#### Snippet
```java
      final GitExec gitExec = gitExecInternal();
      if (isNativeGitOperationsSupported(gitExec)) {
        //noinspection ConstantConditions
        return Optional.of(new NativeGitCommands(myConfig, () -> gitExec, mySshKeyManager, myTransportFactory.getCertificatesDir()));
      }
```

## RuleId[ruleID=UnnecessaryInitCause]
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

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/PluginConfigImpl.java`
#### Snippet
```java
  public String getGitOutputCharsetName() {
    String useDefault = myBuild.getSharedConfigParameters().get(USE_DEFAULT_CHARSET);
    if (Boolean.valueOf(useDefault))
      return null;
    String charsetName = myBuild.getSharedConfigParameters().get(GIT_OUTPUT_CHARSET);
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/MirrorManagerImpl.java`
#### Snippet
```java
          return dir.lastModified();
        else
          return Long.valueOf(lines.get(0));
      } catch (IOException e) {
        return dir.lastModified();
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/GitVcsRoot.java`
#### Snippet
```java
    myUsernameForTags = getProperty(Constants.USERNAME_FOR_TAGS);
    myBranchSpec = getProperty(Constants.BRANCH_SPEC);
    myAutoCrlf = Boolean.valueOf(getProperty(Constants.SERVER_SIDE_AUTO_CRLF, "false"));
    myIncludeContentHashes = Boolean.valueOf(getProperty(Constants.INCLUDE_CONTENT_HASHES, "false"));
    myReportTags = Boolean.valueOf(getProperty(Constants.REPORT_TAG_REVISIONS, "false"));
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/GitVcsRoot.java`
#### Snippet
```java
    myBranchSpec = getProperty(Constants.BRANCH_SPEC);
    myAutoCrlf = Boolean.valueOf(getProperty(Constants.SERVER_SIDE_AUTO_CRLF, "false"));
    myIncludeContentHashes = Boolean.valueOf(getProperty(Constants.INCLUDE_CONTENT_HASHES, "false"));
    myReportTags = Boolean.valueOf(getProperty(Constants.REPORT_TAG_REVISIONS, "false"));
    myIgnoreMissingDefaultBranch = Boolean.valueOf(getProperty(Constants.IGNORE_MISSING_DEFAULT_BRANCH, "false"));
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/GitVcsRoot.java`
#### Snippet
```java
    myAutoCrlf = Boolean.valueOf(getProperty(Constants.SERVER_SIDE_AUTO_CRLF, "false"));
    myIncludeContentHashes = Boolean.valueOf(getProperty(Constants.INCLUDE_CONTENT_HASHES, "false"));
    myReportTags = Boolean.valueOf(getProperty(Constants.REPORT_TAG_REVISIONS, "false"));
    myIgnoreMissingDefaultBranch = Boolean.valueOf(getProperty(Constants.IGNORE_MISSING_DEFAULT_BRANCH, "false"));
    myIncludeCommitInfoSubmodules = Boolean.valueOf(getProperty(Constants.INCLUDE_COMMIT_INFO_SUBMODULES, "false"));
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/GitVcsRoot.java`
#### Snippet
```java
    myIncludeContentHashes = Boolean.valueOf(getProperty(Constants.INCLUDE_CONTENT_HASHES, "false"));
    myReportTags = Boolean.valueOf(getProperty(Constants.REPORT_TAG_REVISIONS, "false"));
    myIgnoreMissingDefaultBranch = Boolean.valueOf(getProperty(Constants.IGNORE_MISSING_DEFAULT_BRANCH, "false"));
    myIncludeCommitInfoSubmodules = Boolean.valueOf(getProperty(Constants.INCLUDE_COMMIT_INFO_SUBMODULES, "false"));
    myCheckoutPolicy = readCheckoutPolicy();
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/GitVcsRoot.java`
#### Snippet
```java
    myReportTags = Boolean.valueOf(getProperty(Constants.REPORT_TAG_REVISIONS, "false"));
    myIgnoreMissingDefaultBranch = Boolean.valueOf(getProperty(Constants.IGNORE_MISSING_DEFAULT_BRANCH, "false"));
    myIncludeCommitInfoSubmodules = Boolean.valueOf(getProperty(Constants.INCLUDE_COMMIT_INFO_SUBMODULES, "false"));
    myCheckoutPolicy = readCheckoutPolicy();
  }
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/credentials/CredentialsHelper.java`
#### Snippet
```java
      String matchAllUrls = env.get(credEnv(CRED_MATCH_ALL_URLS));
      if (matchAllUrls != null)
        result.setMatchAllUrls(Boolean.valueOf(matchAllUrls));
      return result;
    }
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitMergeSupport.java`
#### Snippet
```java
    if (value == null)
      return false;
    return Boolean.valueOf(value);
  }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitMergeSupport.java`
#### Snippet
```java
    if (value == null)
      return false;
    return Boolean.valueOf(value);
  }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchProcess.java`
#### Snippet
```java

    private boolean readVerboseTreeLog(@NotNull Map<String, String> props) {
      return Boolean.valueOf(props.remove("patcher.verboseTreeWalkLog"));
    }

```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
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

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
      channel.setCommand(myCommand);
      channel.setInputStream(System.in);
      channel.setErrStream(System.err);

      final String sendEnv = System.getenv(GitSSHHandler.TEAMCITY_SSH_REQUEST_TOKEN);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
      synchronized (myLogEntries) {
        for (LogEntry entry : myLogEntries) {
          System.err.print(dateFormat.format(new Date(entry.myTimestamp)));
          System.err.print(" ");
          System.err.print(getLevel(entry.myLogLevel));
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
        for (LogEntry entry : myLogEntries) {
          System.err.print(dateFormat.format(new Date(entry.myTimestamp)));
          System.err.print(" ");
          System.err.print(getLevel(entry.myLogLevel));
          System.err.print(" ");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
          System.err.print(dateFormat.format(new Date(entry.myTimestamp)));
          System.err.print(" ");
          System.err.print(getLevel(entry.myLogLevel));
          System.err.print(" ");
          System.err.println(entry.myMessage);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
          System.err.print(" ");
          System.err.print(getLevel(entry.myLogLevel));
          System.err.print(" ");
          System.err.println(entry.myMessage);
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
          System.err.print(getLevel(entry.myLogLevel));
          System.err.print(" ");
          System.err.println(entry.myMessage);
        }
      }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
    @Override
    public void log(final int level, final String message) {
      System.err.print(getTimestamp());
      System.err.print(" ");
      System.err.print(getLevel(level));
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
    public void log(final int level, final String message) {
      System.err.print(getTimestamp());
      System.err.print(" ");
      System.err.print(getLevel(level));
      System.err.print(" ");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
      System.err.print(getTimestamp());
      System.err.print(" ");
      System.err.print(getLevel(level));
      System.err.print(" ");
      System.err.println(message);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
      System.err.print(" ");
      System.err.print(getLevel(level));
      System.err.print(" ");
      System.err.println(message);
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
      System.err.print(getLevel(level));
      System.err.print(" ");
      System.err.println(message);
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
        ((InMemoryLogger)logger).printLog();
      }
      System.err.println(t.getMessage());
      if (t instanceof NullPointerException || debug)
        t.printStackTrace();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
      try {
        while ((count = myInput.read(buffer)) != -1) {
          System.out.write(buffer, 0, count);
          myTimestamp.set(System.nanoTime());
          if (System.out.checkError()) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
          System.out.write(buffer, 0, count);
          myTimestamp.set(System.nanoTime());
          if (System.out.checkError()) {
            myLogger.log(Logger.ERROR, "Error while writing to stdout");
            throw new IOException("Error while writing to stdout");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/credentials/CredentialsHelper.java`
#### Snippet
```java

  public static void main(String... args) throws Exception {
    new CredentialsHelper(System.in, System.out, System.getenv(), args).run();
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/FetchProgressMonitor.java`
#### Snippet
```java
        display(totalWork);
      myPrintStream.println();
      System.out.println();
    }
    output = false;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/FetchProgressMonitor.java`
#### Snippet
```java
      display(cmp);
      myPrintStream.flush();
      System.out.flush();
    } else {
      if ((cmp * 100 / totalWork) != (lastWorked * 100) / totalWork) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/FetchProgressMonitor.java`
#### Snippet
```java
        display(cmp);
        myPrintStream.flush();
        System.out.flush();
      }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/FetchProgressMonitor.java`
#### Snippet
```java
    }

    System.out.println(m);
  }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/JSchLoggers.java`
#### Snippet
```java
            case FATAL:
            case ERROR:
              System.err.println(message);
              break;
            case WARN:
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/JSchLoggers.java`
#### Snippet
```java
            case DEBUG:
            default:
              System.out.println(message);
              break;
          }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitGcProcess.java`
#### Snippet
```java
    try {
      String gitDir = args[0];
      System.out.println("run gc in " + gitDir);
      Repository r = new RepositoryBuilder().setBare().setGitDir(new File(gitDir)).build();
      Git git = new Git(r);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitGcProcess.java`
#### Snippet
```java
      Git git = new Git(r);
      GarbageCollectCommand gc = git.gc();
      gc.setProgressMonitor(new TextProgressMonitor(new PrintWriter(System.out)));
      gc.call();
    } catch (Throwable t) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitGcProcess.java`
#### Snippet
```java
    } catch (Throwable t) {
      if (isImportant(t)) {
        t.printStackTrace(System.err);
      } else {
        System.err.println(t.getMessage());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitGcProcess.java`
#### Snippet
```java
        t.printStackTrace(System.err);
      } else {
        System.err.println(t.getMessage());
      }
      System.exit(1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
        isGcEventListenerInitialized = true;
      } catch (ClassNotFoundException ignore) {
        System.err.println("Cannot initialize GC listener: class not found");
      } catch (Throwable t) {
        System.err.println("Cannot initialize GC listener \n" + t);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
        System.err.println("Cannot initialize GC listener: class not found");
      } catch (Throwable t) {
        System.err.println("Cannot initialize GC listener \n" + t);
      }
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
        }
      } catch (Throwable t) {
        System.err.println("Exception while persisting gc notification " + notification + " to " + myGcDumpFile.getAbsolutePath() + "\n" + t);
      }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
        .append(", new object id: ").append(update.getNewObjectId().name())
        .append(", result: ").append(update.getResult());
      System.out.println(msg);
    }
    String additionalMsgs = result.getMessages();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
    String additionalMsgs = result.getMessages();
    if (additionalMsgs.length() > 0) {
      System.out.println("Remote process messages: " + additionalMsgs);
    }
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
      GitServerUtil.pruneRemovedBranches(config, transportFactory, db, uri, authSettings);
    } catch (Exception e) {
      System.err.println("Error while pruning removed branches in " + db + ": " + e.getMessage());
      if (debug) {
        e.printStackTrace(System.err);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
      System.err.println("Error while pruning removed branches in " + db + ": " + e.getMessage());
      if (debug) {
        e.printStackTrace(System.err);
      }
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
        FileUtil.writeFile(myFile, threadDump + "\ngit progress:\n" + gitProgress + "\nmemory usage (MB):\n" + memoryUsage, "UTF-8");
      } catch (IOException e) {
        System.err.println("Exception while persisting thread dump to " + myFile.getAbsolutePath() + "\n" + e);
      }
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
    } catch (Throwable t) {
      if (debug || isImportant(t)) {
        t.printStackTrace(System.err);
      } else {
        System.err.println(t.getMessage());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Fetcher.java`
#### Snippet
```java
        t.printStackTrace(System.err);
      } else {
        System.err.println(t.getMessage());
      }
    } finally {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchProcess.java`
#### Snippet
```java
    @Override
    void call(@NotNull final String action, @NotNull final String file) {
      System.out.println(action + " " + file);
    }
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchProcess.java`
#### Snippet
```java
    } catch (Throwable t) {
      if (settings.isDebugEnabled() || isImportant(t)) {
        System.err.println(t.getMessage());
        t.printStackTrace(System.err);
      } else {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchProcess.java`
#### Snippet
```java
      if (settings.isDebugEnabled() || isImportant(t)) {
        System.err.println(t.getMessage());
        t.printStackTrace(System.err);
      } else {
        String msg = t.getMessage();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchProcess.java`
#### Snippet
```java
          printStackTrace = cause != null && isImportant(cause);
        }
        System.err.println(msg);
        if (printStackTrace)
          t.printStackTrace(System.err);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchProcess.java`
#### Snippet
```java
        System.err.println(msg);
        if (printStackTrace)
          t.printStackTrace(System.err);
      }
      System.exit(1);
```

## RuleId[ruleID=CharsetObjectCanBeUsed]
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
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/ContextImpl.java`
#### Snippet
```java
      return Charset.forName(charsetName);
    } catch (UnsupportedCharsetException e) {
      return Charset.forName("UTF-8");
    }
  }
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

## RuleId[ruleID=ExcessiveRangeCheck]
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

## RuleId[ruleID=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/PluginConfigImpl.java`
#### Snippet
```java
  public static final String USE_SHALLOW_CLONE = "teamcity.git.shallowClone";
  /** @deprecated preserved for backward compatibility, see TW-71077 */
  public static final String USE_SHALLOW_CLONE_FROM_MIRROR_TO_CHECKOUT_DIR = "teamcity.git.use.shallow.clone";
  public static final String USE_SHALLOW_CLONE_INTERNAL = "teamcity.internal.git.agent.shallowClone";
  public static final String TEAMCITY_DONT_DELETE_TEMP_FILES = "teamcity.dont.delete.temp.files";
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentPluginConfig.java`
#### Snippet
```java

  /** @deprecated we preserve it for backward compatibility with "teamcity.git.use.shallow.clone" param in case of non-default configuration */
  boolean isUseShallowCloneFromMirrorToCheckoutDir();

  boolean isDeleteTempFiles();
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentCommitLoader.java`
#### Snippet
```java
   * @deprecated this method is only used backward compatibility and will be deleted
   */
  boolean loadShallowBranch(@NotNull String sha, @NotNull String branch) throws VcsException;
}

```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
     */
    public HostEntry(final String patterns) {
      for (String pattern : patterns.split("[\t ,]+")) {
        if (pattern.length() == 0) {
          continue;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
          continue;
        }
        final String[] parts = line.split("[ \t]*[= \t]", 2);
        final String keyword = parts[0];
        final String argument = unquoteIfNeeded(parts[1]);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
  private static LinkedList<String> parseList(final String arg) {
    LinkedList<String> values = new LinkedList<String>();
    for (String a : arg.split("[ \t,]+")) {
      if (a.length() == 0) {
        continue;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterWithMirror.java`
#### Snippet
```java

        final String branch = gitModules.getString("submodule", submoduleName, "branch");
        aggregatedSubmodule.addSubmodule(new Submodule(submoduleName, submodulePath.replaceAll("/", Matcher.quoteReplacement(File.separator)), submoduleRevision,
                                                       ".".equals(branch) ? myFullBranchName : branch));
        aggregatedSubmodules.put(url, aggregatedSubmodule);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
      }
      String path = credHelper.getCanonicalPath();
      path = path.replaceAll("\\\\", "/");
      command.addConfig("credential.helper", path);
      if (myPluginConfig.isCleanCredHelperScript()) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
    for (String submoduleName : submodules) {
      String submodulePath = config.getString("submodule", submoduleName, "path");
      paths.add(submodulePath.replaceAll("/", Matcher.quoteReplacement(File.separator)));
    }
    return paths;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
      path = targetDir.getAbsolutePath();
    }
    return ".".equals(path) ? "" : path.replace("\\", "/");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitCommandLine.java`
#### Snippet
```java

  private void writeSshPrivateKeyToFile(@NotNull byte[] privateKey, @NotNull File file) throws IOException {
    FileUtil.writeFileAndReportErrors(file, new String(privateKey).trim().replace("\r\n", "\n") + "\n");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/credentials/ScriptGen.java`
#### Snippet
```java
        javaPath = "\"" + javaHome + File.separatorChar + "bin" + File.separatorChar + "java\"";
      }
      script = script.replace("{JAVA}", javaPath);
      script = script.replace("{CREDENTIALS_SCRIPT}", result.getCanonicalPath());
      script = script.replace("{CREDENTIALS_CLASSPATH}", ClasspathUtil.composeClasspath(new Class[]{CredentialsHelper.class}, null, null));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/credentials/ScriptGen.java`
#### Snippet
```java
      }
      script = script.replace("{JAVA}", javaPath);
      script = script.replace("{CREDENTIALS_SCRIPT}", result.getCanonicalPath());
      script = script.replace("{CREDENTIALS_CLASSPATH}", ClasspathUtil.composeClasspath(new Class[]{CredentialsHelper.class}, null, null));
      script = script.replace("{CREDENTIALS_CLASS}", CredentialsHelper.class.getName());
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/credentials/ScriptGen.java`
#### Snippet
```java
      script = script.replace("{CREDENTIALS_SCRIPT}", result.getCanonicalPath());
      script = script.replace("{CREDENTIALS_CLASSPATH}", ClasspathUtil.composeClasspath(new Class[]{CredentialsHelper.class}, null, null));
      script = script.replace("{CREDENTIALS_CLASS}", CredentialsHelper.class.getName());
      String[] lines = script.split("(\r\n|\r|\n)");
      for (String line : lines) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/credentials/ScriptGen.java`
#### Snippet
```java
      script = script.replace("{CREDENTIALS_CLASSPATH}", ClasspathUtil.composeClasspath(new Class[]{CredentialsHelper.class}, null, null));
      script = script.replace("{CREDENTIALS_CLASS}", CredentialsHelper.class.getName());
      String[] lines = script.split("(\r\n|\r|\n)");
      for (String line : lines) {
        out.println(line);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
  public List<String> getFetchDurationMetricRepos() {
    final String prop = TeamCityProperties.getPropertyOrNull(FETCH_DURATION_METRIC_REPOS);
    return prop == null ? Collections.emptyList() : Arrays.asList(prop.replace("\r\n", ";").replace("\n", ";").split(";"));

  }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
  public List<String> getFetchDurationMetricRepos() {
    final String prop = TeamCityProperties.getPropertyOrNull(FETCH_DURATION_METRIC_REPOS);
    return prop == null ? Collections.emptyList() : Arrays.asList(prop.replace("\r\n", ";").replace("\n", ";").split(";"));

  }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/SpaceExternalChangeViewerExtension.java`
#### Snippet
```java
        final String orgName = strings[0];
        final String project = strings[1];
        final String repository = strings[2].replaceFirst("\\.git$", "");
        final String repositoryUrl = String.format("https://%s.jetbrains.space/p/%s/repositories/%s", orgName, project, repository);

```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `git-server-tc/src/jetbrains/buildServer/buildTriggers/vcs/git/SpaceExternalChangeViewerExtension.java`
#### Snippet
```java
          if (strings.length == 2) {
            final String project = strings[0];
            final String repository = strings[1].replaceFirst("\\.git$", "");
            final String repositoryUrl = String.format("https://%s/p/%s/repositories/%s", spaceAddress, project, repository);

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.buildTriggers.vcs.git.command` is unnecessary and can be removed
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/FetchCommand.java`
#### Snippet
```java

  @NotNull
  FetchCommand setRefSpecsRefresher(jetbrains.buildServer.buildTriggers.vcs.git.command.LsRemoteCommand lsRemote);

  void call() throws VcsException;
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.buildTriggers.vcs.git` is unnecessary and can be removed
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/GitUtils.java`
#### Snippet
```java
   */
  public static String getGitRootBranchParamName(@NotNull VcsRoot root) {
    return jetbrains.buildServer.buildTriggers.vcs.git.Constants.GIT_ROOT_BUILD_BRANCH_PREFIX + VcsUtil.getSimplifiedName(root);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.buildTriggers.vcs.git.command` is unnecessary and can be removed
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/FetchCommandImpl.java`
#### Snippet
```java
  private String myRemoteUrl;

  private jetbrains.buildServer.buildTriggers.vcs.git.command.LsRemoteCommand myLsRemote;

  public FetchCommandImpl(@NotNull GitCommandLine cmd) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j.impl` is unnecessary, and can be replaced with an import
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
      ServiceMessage.class,
      org.slf4j.Logger.class,
      org.slf4j.impl.StaticLoggerBinder.class,
      EWAHCompressedBitmap.class,
      JschConfigSessionFactory.class,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j.impl` is unnecessary, and can be replaced with an import
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
    classes.add(LowLevelPatchBuilder.class);
    classes.add(org.slf4j.Logger.class);
    classes.add(org.slf4j.impl.StaticLoggerBinder.class);
    classes.add(EWAHCompressedBitmap.class);
    classes.add(LfsBlobLoader.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmoduleResolver.java`
#### Snippet
```java
   * @return the resolved repository
   * @throws jetbrains.buildServer.buildTriggers.vcs.git.VcsAuthenticationException in case of authentication problems
   * @throws java.net.URISyntaxException if there are errors in submodule repository URI
   */
  Repository resolveRepository(@NotNull String submoduleUrl) throws VcsException, URISyntaxException;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmoduleAwareTreeIteratorFactory.java`
#### Snippet
```java
   * @param pathFromRoot  the path from the root of main repository to the entry of this repository
   * @return an iterator for tree that considers submodules
   * @throws java.io.IOException in the case if IO error occurs
   */
  public static SubmoduleAwareTreeIterator create(Repository db,
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.buildTriggers.vcs.git.command` is unnecessary and can be removed
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/NativeGitCommands.java`
#### Snippet
```java

    executeCommand(ctx, "prune", LogUtil.describe(db, fetchURI), () -> {
      jetbrains.buildServer.buildTriggers.vcs.git.command.RemoteCommand prune =
        gitFacade.remote()
               .setCommand("prune").setRemote("origin")
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
      System.err.println(t.getMessage());
      if (t instanceof NullPointerException || debug)
        t.printStackTrace();
      System.exit(1);
    }
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractAgentCommitLoader()` of an abstract class should not be declared 'public'
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentCommitLoaderFactory.java`
#### Snippet
```java
    @NotNull private final BuildProgressLogger myLogger;

    public AbstractAgentCommitLoader(@NotNull GitVcsRoot root,
                                     @NotNull File targetDirectory,
                                     @NotNull GitFactory gitFactory,
```

### NonProtectedConstructorInAbstractClass
Constructor `ScriptGen()` of an abstract class should not be declared 'public'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/credentials/ScriptGen.java`
#### Snippet
```java
  protected final File myTempDir;

  public ScriptGen(@NotNull File tempDir) {
    myTempDir = tempDir;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseAuthCommandImpl()` of an abstract class should not be declared 'public'
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/BaseAuthCommandImpl.java`
#### Snippet
```java
  private Map<String, String> myTraceEnv = Collections.emptyMap();

  public BaseAuthCommandImpl(@NotNull GitCommandLine cmd) {
    super(cmd);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `SubmoduleAwareTreeIterator()` of an abstract class should not be declared 'public'
in `git-server/src/org/eclipse/jgit/treewalk/SubmoduleAwareTreeIterator.java`
#### Snippet
```java
   * @throws CorruptObjectException in case of submodule processing problem
   */
  public SubmoduleAwareTreeIterator(SubmoduleAwareTreeIterator parent,
                                    AbstractTreeIterator wrappedIterator,
                                    SubmoduleResolver submoduleResolver,
```

### NonProtectedConstructorInAbstractClass
Constructor `SubmoduleAwareTreeIterator()` of an abstract class should not be declared 'public'
in `git-server/src/org/eclipse/jgit/treewalk/SubmoduleAwareTreeIterator.java`
#### Snippet
```java
   * @throws CorruptObjectException in case of submodule processing problem
   */
  public SubmoduleAwareTreeIterator(AbstractTreeIterator wrappedIterator,
                                    SubmoduleResolver submoduleResolver,
                                    String repositoryUrl,
```

### NonProtectedConstructorInAbstractClass
Constructor `GitAbstractVcsFileContentProvider()` of an abstract class should not be declared 'public'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitAbstractVcsFileContentProvider.java`
#### Snippet
```java
  protected final GitVcsSupport myVcs;

  public GitAbstractVcsFileContentProvider(@NotNull GitVcsSupport vcs) {
    myVcs = vcs;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `GitProcessStuckMonitor()` of an abstract class should not be declared 'public'
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/process/GitProcessStuckMonitor.java`
#### Snippet
```java
  private long lastDumpActivity = 0;

  public GitProcessStuckMonitor(@NotNull final File procGcDump, @NotNull final Long xmx, @NotNull final String commandLineLog) throws VcsException {
    myXmx = xmx;
    try {
```

## RuleId[ruleID=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Comparator() can be replaced with method reference
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/GitUtils.java`
#### Snippet
```java
   * The version comparator
   */
  public static final Comparator<String> VERSION_COMPARATOR = new Comparator<String>() {
    public int compare(String o1, String o2) {
      return o1.compareTo(o2);
```

## RuleId[ruleID=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/commitInfo/GitCommitsInfoBuilder.java`
#### Snippet
```java
      final String commit = e.getValue();
      Set<String> refs = index.get(commit);
      if (refs == null) {
        refs = new HashSet<String>(1);
        index.put(commit, refs);
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHMain.java`
#### Snippet
```java
   */
  private void forward(@NonNls final String name, final OutputStream out, final InputStream in, final boolean releaseSemaphore) {
    final Runnable action = new Runnable() {
      public void run() {
        byte[] buffer = new byte[BUFFER_SIZE];
```

### Convert2Lambda
Anonymous new FileFilter() can be replaced with lambda
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/MirrorManagerImpl.java`
#### Snippet
```java
  @NotNull
  private File[] findRepositoryDirs() {
    final File[] dirs = myBaseMirrorsDir.listFiles(new FileFilter() {
      public boolean accept(File f) {
        return f.isDirectory() && new File(f, "config").exists();
```

### Convert2Lambda
Anonymous new FileFilter() can be replaced with lambda
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/GitUtils.java`
#### Snippet
```java
      return;
    }
    final Collection<File> locks = FileUtil.findFiles(new FileFilter() {
      public boolean accept(File f) {
        return f.isFile() && f.getName().endsWith(".lock");
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/GitUtils.java`
#### Snippet
```java
   * The version comparator
   */
  public static final Comparator<String> VERSION_COMPARATOR = new Comparator<String>() {
    public int compare(String o1, String o2) {
      return o1.compareTo(o2);
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
      command.addConfig("credential.helper", path);
      if (myPluginConfig.isCleanCredHelperScript()) {
        command.addPostAction(new Runnable() {
          @Override
          public void run() {
```

## RuleId[ruleID=CaughtExceptionImmediatelyRethrown]
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

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `length`
in `git-agent/src/org/jetbrains/git4idea/util/FastByteArrayBuilder.java`
#### Snippet
```java
      pos += copyLength;
      index += copyLength;
      length -= copyLength;
    } while (length > 0);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `git-agent/src/org/jetbrains/git4idea/util/FastByteArrayBuilder.java`
#### Snippet
```java

  private static int nextPowerOf2(int val) {
    --val;
    val |= val >> 1;
    val |= val >> 2;
```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `git-agent/src/org/jetbrains/git4idea/util/FastByteArrayBuilder.java`
#### Snippet
```java
  private static int nextPowerOf2(int val) {
    --val;
    val |= val >> 1;
    val |= val >> 2;
    val |= val >> 4;
```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `git-agent/src/org/jetbrains/git4idea/util/FastByteArrayBuilder.java`
#### Snippet
```java
    --val;
    val |= val >> 1;
    val |= val >> 2;
    val |= val >> 4;
    val |= val >> 8;
```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `git-agent/src/org/jetbrains/git4idea/util/FastByteArrayBuilder.java`
#### Snippet
```java
    val |= val >> 1;
    val |= val >> 2;
    val |= val >> 4;
    val |= val >> 8;
    val |= val >> 16;
```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `git-agent/src/org/jetbrains/git4idea/util/FastByteArrayBuilder.java`
#### Snippet
```java
    val |= val >> 2;
    val |= val >> 4;
    val |= val >> 8;
    val |= val >> 16;
    ++val;
```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `git-agent/src/org/jetbrains/git4idea/util/FastByteArrayBuilder.java`
#### Snippet
```java
    val |= val >> 4;
    val |= val >> 8;
    val |= val >> 16;
    ++val;
    return val;
```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `git-agent/src/org/jetbrains/git4idea/util/FastByteArrayBuilder.java`
#### Snippet
```java
    val |= val >> 8;
    val |= val >> 16;
    ++val;
    return val;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `part`
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
  private static String unquoteIfNeeded(String part) {
    if (part.length() > 1 && part.charAt(0) == '"' && part.charAt(part.length() - 1) == '"') {
      part = part.substring(1, part.length() - 1);
    }
    return part.trim();
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/EscapeEchoArgumentUnix.java`
#### Snippet
```java
  public String escape(@Nullable String s) {
    if (s == null)
      s = "";
    StringBuilder sb = new StringBuilder();
    sb.append("'");
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/EscapeEchoArgumentWin.java`
#### Snippet
```java
  public String escape(@Nullable String s) {
    if (s == null)
      s = "";
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `git-server/src/org/eclipse/jgit/treewalk/SubmoduleAwareTreeIterator.java`
#### Snippet
```java
      if (ap.matches == bp.matches)
        return a.getNameOffset();
      a = ap;
      b = bp;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `git-server/src/org/eclipse/jgit/treewalk/SubmoduleAwareTreeIterator.java`
#### Snippet
```java
        return a.getNameOffset();
      a = ap;
      b = bp;
    }
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `aPos`
in `git-server/src/org/eclipse/jgit/treewalk/SubmoduleAwareTreeIterator.java`
#### Snippet
```java
    final int aEnd = pathLen;

    for (; aPos < aEnd && bPos < bEnd; aPos++, bPos++) {
      final int cmp = (a[aPos] & 0xff) - (b[bPos] & 0xff);
      if (cmp != 0)
```

### AssignmentToMethodParameter
Assignment to method parameter `bPos`
in `git-server/src/org/eclipse/jgit/treewalk/SubmoduleAwareTreeIterator.java`
#### Snippet
```java
    final int aEnd = pathLen;

    for (; aPos < aEnd && bPos < bEnd; aPos++, bPos++) {
      final int cmp = (a[aPos] & 0xff) - (b[bPos] & 0xff);
      if (cmp != 0)
```

### AssignmentToMethodParameter
Assignment to method parameter `memory`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
    if (memory == null)
      return null;
    memory = memory.trim();
    if (memory.isEmpty())
      return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `ref`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/GitRepoOperationsImpl.java`
#### Snippet
```java
                                @NotNull String commit, @NotNull String lastCommit) throws VcsException {

    ref = GitUtils.expandRef(ref);
    try (Transport tn = myTransportFactory.createTransport(db, gitRoot.getRepositoryPushURL().get(), gitRoot.getAuthSettings(), myConfig.getPushTimeoutSeconds())) {
      final ObjectId commitId = ObjectId.fromString(commit);
```

### AssignmentToMethodParameter
Assignment to method parameter `delta`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/IndirectSubmoduleAwareTreeIterator.java`
#### Snippet
```java
    }
    if (myPosition - delta < 0) {
      delta = myPosition;
    }
    if (delta == 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `delta`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/IndirectSubmoduleAwareTreeIterator.java`
#### Snippet
```java
    }
    if (myPosition + delta > myMapping.length) {
      delta = myMapping.length - myPosition;
    }
    if (delta == 0) {
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/RemoteRepositoryUrlInvestigatorImpl.java`
#### Snippet
```java
    } catch (Exception e) {
      LOG.warn("Error while trying to get remote repository url at " + repositoryDir.getAbsolutePath(), e);
      return null;
    } finally {
      if (r != null) {
```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentGitVcsRoot.java`
#### Snippet
```java
  @Nullable
  protected ExpiringAccessToken getOrRefreshToken(@NotNull String tokenId) {
    return myTokenStorage == null ? null : myTokenStorage.getOrRefreshToken(tokenId);
  }
}
```

### ReturnNull
Return of `null`
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHXmlRcpClient.java`
#### Snippet
```java
                                         final String lastError) {
    if (myClient == null) {
      return null;
    }
    Vector parameters = new Vector();
```

### ReturnNull
Return of `null`
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHXmlRcpClient.java`
#### Snippet
```java
                              final String lastError) {
    if (myClient == null) {
      return null;
    }
    Vector parameters = new Vector();
```

### ReturnNull
Return of `null`
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHXmlRcpClient.java`
#### Snippet
```java
  @Nullable
  private static <T> Vector<T> adjustNull(final Vector<T> s) {
    return s.size() == 0 ? null : s;
  }
}
```

### ReturnNull
Return of `null`
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHXmlRcpClient.java`
#### Snippet
```java
  @Nullable
  private static String adjustNull(final String s) {
    return s.charAt(0) == '-' ? null : s.substring(1);
  }

```

### ReturnNull
Return of `null`
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHXmlRcpClient.java`
#### Snippet
```java
  public String askPassword(final int handlerNo, final String username, final boolean resetPassword, final String lastError) {
    if (myClient == null) {
      return null;
    }
    Vector parameters = new Vector();
```

### ReturnNull
Return of `null`
in `git-agent/src/org/jetbrains/git4idea/ssh/GitSSHService.java`
#### Snippet
```java
  @Nullable
  protected File getTempDir() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/BuildContext.java`
#### Snippet
```java
  public String getInterruptionReason() {
    final BuildInterruptReason reason = myBuild.getInterruptReason();
    return reason == null ? null : reason.getUserDescription();
  }

```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/BuildContext.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/BuildContext.java`
#### Snippet
```java
    if (!StringUtil.isEmpty(value))
      return value;
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/PluginConfigImpl.java`
#### Snippet
```java
    String useDefault = myBuild.getSharedConfigParameters().get(USE_DEFAULT_CHARSET);
    if (Boolean.valueOf(useDefault))
      return null;
    String charsetName = myBuild.getSharedConfigParameters().get(GIT_OUTPUT_CHARSET);
    return StringUtil.isNotEmpty(charsetName) ? charsetName : "UTF-8";
```

### ReturnNull
Return of `null`
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
    public File getIdentityFile() {
      if (myIdentityFile == null) {
        return null;
      }
      return parseFileName(this, myIdentityFile);
```

### ReturnNull
Return of `null`
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
    }
    catch (UnknownHostException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `git-agent/src/org/jetbrains/git4idea/ssh/SSHConfig.java`
#### Snippet
```java
    }
    catch (NumberFormatException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/SshKeyManagerProviderImpl.java`
#### Snippet
```java
    Collection<VcsRootSshKeyManager> managers = myExtensions.getExtensions(VcsRootSshKeyManager.class);
    if (managers.isEmpty())
      return null;
    return managers.iterator().next();
  }
```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/AgentCommitLoaderFactory.java`
#### Snippet
```java
    protected Ref getRef(@NotNull String ref) {
      Map<String, Ref> refs = myGitFactory.create(myTargetDirectory).showRef().setPattern(ref).call().getValidRefs();
      return refs.isEmpty() ? null : refs.get(ref);
    }

```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterWithMirror.java`
#### Snippet
```java
    LsTreeResult lsTreeResult = git.lsTree().setRevision(revision).setPath(path).call();
    if (lsTreeResult == null) {
      return null;
    }
    return lsTreeResult.getObject();
```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitDetectorImpl.java`
#### Snippet
```java
  private String getCygwinBinPath(@NotNull String gitPath) {
    if (!SystemInfo.isWindows)
      return null;
    try {
      File git = new File(gitPath);
```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitDetectorImpl.java`
#### Snippet
```java
        if (cygpath.canExecute())
          return git.getParentFile().getCanonicalPath();
        return null;
      } else {
        String path = System.getenv("PATH");
```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitDetectorImpl.java`
#### Snippet
```java
        if (path == null) {
          Loggers.VCS.info("Cannot detect cygwin path, PATH environment variable is empty");
          return null;
        }
        String[] paths = path.split(Pattern.quote(File.pathSeparator));
```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitDetectorImpl.java`
#### Snippet
```java
            return p;
        }
        return null;
      }
    } catch (Exception e) {
```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitDetectorImpl.java`
#### Snippet
```java
    } catch (Exception e) {
      Loggers.VCS.info("Error while detecting cygwin path", e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitDetectorImpl.java`
#### Snippet
```java

  private String getPathFromRoot(@Nullable VcsRoot root, @Nullable BuildAgentConfiguration config) throws VcsException {
    if (root == null) return  null;

    assert config != null;
```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/GitDetectorImpl.java`
#### Snippet
```java

    final String path = root.getProperty(Constants.AGENT_GIT_PATH);
    return path == null ? null : myResolver.resolveGitPath(config, path);
  }

```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/CheckoutDirectoryCleaner.java`
#### Snippet
```java
      LOG.warn("Failed to detect git, no cleaners will be registered", e);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/URIishHelperImpl.java`
#### Snippet
```java
      //ignore
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/ssl/SSLInvestigator.java`
#### Snippet
```java
      final X509TrustManager manager = trustManager(agentConfiguration);
      if (manager == null) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/ssl/SSLInvestigator.java`
#### Snippet
```java
      final KeyStore trustStore = trustStore(agentConfiguration);
      if (trustStore == null) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/ssl/SSLInvestigator.java`
#### Snippet
```java
      LOG.error("Can not write file with certificates", e);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
    public Config getConfig(final String host) {
      Config config = myDelegate.getConfig(host);
      return config != null ? new TeamCityConfig(config, myUser) : null;
    }
  }
```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
    String timeout = System.getenv(GitSSHHandler.TEAMCITY_SSH_IDLE_TIMEOUT_SECONDS);
    if (timeout == null)
      return null;
    try {
      return Integer.parseInt(timeout);
```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/JSchClient.java`
#### Snippet
```java
    } catch (NumberFormatException e) {
      myLogger.log(Logger.WARN, "Failed to parse idle timeout: '" + timeout + "'");
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/LsTreeCommandImpl.java`
#### Snippet
```java
    ExecResult r = CommandUtil.runCommand(cmd);
    String stdout = r.getStdout().trim();
    return StringUtil.isEmpty(stdout) ? null : parseLsTreeOutput(stdout);
  }

```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/LogCommandImpl.java`
#### Snippet
```java
      return CommandUtil.runCommand(cmd.stdErrExpected(false)).getStdout().trim();
    } catch (VcsException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/CommandLineUtil.java`
#### Snippet
```java
      return exception == null ? new VcsException(message) : new VcsException(message, exception);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/SshHandler.java`
#### Snippet
```java
                                         Vector<Boolean> echo,
                                         String lastError) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/SshHandler.java`
#### Snippet
```java
  public String askPassphrase(String username, String keyPath, boolean resetPassword, String lastError) {
    if (resetPassword) {
      return null;
    }
    return myAuthSettings.getPassphrase();
```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/SshHandler.java`
#### Snippet
```java
  public String askPassword(String username, boolean resetPassword, String lastError) {
    // The password is injected into URL
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/command/impl/SshHandler.java`
#### Snippet
```java
      return "TeamCity Agent " + version.getDisplayVersion();
    } catch (Exception e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/MirrorManagerImpl.java`
#### Snippet
```java
        return e.getKey();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/GitVcsRoot.java`
#### Snippet
```java
  private File getPath() {
    if (!TeamCityProperties.getBoolean(Constants.CUSTOM_CLONE_PATH_ENABLED))
      return null;
    String path = getProperty(Constants.PATH);
    return path == null ? null : new File(path);
```

### ReturnNull
Return of `null`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/GitVcsRoot.java`
#### Snippet
```java
      return null;
    String path = getProperty(Constants.PATH);
    return path == null ? null : new File(path);
  }

```

### ReturnNull
Return of `null`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/GitVcsRoot.java`
#### Snippet
```java
  @Nullable
  protected ExpiringAccessToken getOrRefreshToken(@NotNull String tokenId) {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
  private String getUpperLimitRevision() {
    String rootExtId = getVcsRootExtId();
    return rootExtId != null ? myBuild.getSharedConfigParameters().get("teamcity.upperLimitRevision." + rootExtId) : null;
  }

```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
          LOG.debug("Build has more than one VCS root with same revision " + myRevision + ": " + vcsRootExtId + " and " +
                    extId + ", cannot deduce VCS root extId");
          return null;
        } else {
          vcsRootExtId = extId;
```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
  protected Config readGitModules(@NotNull File repoDir) throws VcsException {
    final File dotGitModules = new File(repoDir, ".gitmodules");
    if (!dotGitModules.exists()) return null;

    try {
```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
  protected Ref getRef(@NotNull File repositoryDir, @NotNull String ref) {
    Map<String, Ref> refs = myGitFactory.create(repositoryDir).showRef().setPattern(ref).call().getValidRefs();
    return refs.isEmpty() ? null : refs.get(ref);
  }

```

### ReturnNull
Return of `null`
in `git-agent/src/jetbrains/buildServer/buildTriggers/vcs/git/agent/UpdaterImpl.java`
#### Snippet
```java
      LOG.debug("Cannot get lfs auth config", e);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/StubContext.java`
#### Snippet
```java
  @Override
  public String getSshCommandOptions() {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/StubContext.java`
#### Snippet
```java
  @Override
  public String getInterruptionReason() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/StubContext.java`
#### Snippet
```java
  @Override
  public String getSshRequestToken() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/StubContext.java`
#### Snippet
```java
  @Override
  public Charset getCharset() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/StubContext.java`
#### Snippet
```java
  @Override
  public String getPreferredSshAuthMethods() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/StubContext.java`
#### Snippet
```java
  @Override
  public String getSshMacType() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/impl/RefImpl.java`
#### Snippet
```java

  public ObjectId getPeeledObjectId() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitCommandLine.java`
#### Snippet
```java
        case PRIVATE_KEY_DEFAULT:
          // we do not decrypt default ssh keys
          return null;
        default:
          return null;
```

### ReturnNull
Return of `null`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/GitCommandLine.java`
#### Snippet
```java
          return null;
        default:
          return null;
      }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/EmptyVcsRootSshKeyManager.java`
#### Snippet
```java
  @Nullable
  public TeamCitySshKey getKey(@NotNull VcsRoot root) {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/RemoteRepositoryUrlInvestigatorImpl.java`
#### Snippet
```java
    } catch (Exception e) {
      LOG.warn("Error while trying to get remote repository url at " + repositoryDir.getAbsolutePath(), e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SNIHttpClientConnectionFactory.java`
#### Snippet
```java
  @Deprecated
  public SNIHttpClientConnectionFactory() {
    this(() -> null);
  }

```

### ReturnNull
Return of `null`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/command/credentials/CredentialsHelper.java`
#### Snippet
```java
        }
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/AuthSettingsImpl.java`
#### Snippet
```java
  private String readUsername(Map<String, String> properties) {
    if (myAuthMethod == AuthenticationMethod.ANONYMOUS) {
      return null;
    }
    String explicitUsername = properties.get(Constants.USERNAME);
```

### ReturnNull
Return of `null`
in `git-common/src/jetbrains/buildServer/buildTriggers/vcs/git/AuthSettingsImpl.java`
#### Snippet
```java
    myToken = myTokenRetriever.apply(myTokenId);
    if (myToken == null)
      return null;

    return myToken.getAccessToken();
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SGitVcsRoot.java`
#### Snippet
```java
    VcsRoot vcsRoot = getOriginalRoot();
    if (myTokenRefresher == null)
      return null;

    SVcsRoot parentRoot = vcsRoot instanceof SVcsRoot ? (SVcsRoot)vcsRoot
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java
        return contentType.getValue();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java
  public String getHeaderField(@NonNull String name) {
    Header header = resp.getFirstHeader(name);
    return (header == null) ? null : header.getValue();
  }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/SSLHttpClientConnection.java`
#### Snippet
```java

  @NotNull
  private Supplier<KeyStore> myTrustStoreGetter = () -> null;

  private SSLSchemePatcher mySSLSchemePatcher;
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/CommitLoaderImpl.java`
#### Snippet
```java
      return getCommit(r, ObjectId.fromString(sha));
    } catch (Exception e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
    String cron = TeamCityProperties.getProperty("teamcity.git.cleanupCron", "0 0 2 * * ? *");
    if (isEmpty(cron))
      return null;
    try {
      return new CronExpression(cron);
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
    } catch (ParseException e) {
      LOG.warn("Wrong cron expression " + cron, e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
  public String getGitOutputCharsetName() {
    final boolean useDefault = TeamCityProperties.getBoolean(USE_DEFAULT_CHARSET);
    if (useDefault) return null;

    final String charsetName = TeamCityProperties.getProperty(GIT_OUTPUT_CHARSET);
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
    String sshProxyType = TeamCityProperties.getProperty(TEAMCITY_GIT_SSH_PROXY_TYPE);
    if (isEmpty(sshProxyType))
      return null;
    String sshProxyHost = TeamCityProperties.getProperty(TEAMCITY_GIT_SSH_PROXY_HOST);
    if (isEmpty(sshProxyHost))
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
    String sshProxyHost = TeamCityProperties.getProperty(TEAMCITY_GIT_SSH_PROXY_HOST);
    if (isEmpty(sshProxyHost))
      return null;
    int sshProxyPort = TeamCityProperties.getInteger(TEAMCITY_GIT_SSH_PROXY_PORT, -1);
    if ("http".equals(sshProxyType)) {
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/PluginConfigImpl.java`
#### Snippet
```java
      return sshProxyPort != -1 ? new ProxySOCKS5(sshProxyHost, sshProxyPort) : new ProxySOCKS5(sshProxyHost);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/CheckoutRulesRevWalk.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/ProcessXmxProvider.java`
#### Snippet
```java
  @Nullable
  private Integer saveAndReturn(@Nullable Integer xmx) {
    if (xmx == null) return null;
    myStorage.write(xmx);
    return myPrev = xmx;
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/ProcessXmxProvider.java`
#### Snippet
```java
  private static Integer getInMB(@Nullable String val) {
    final Long bytes = GitServerUtil.convertMemorySizeToBytes(val);
    return bytes == null ? null : (int)(bytes / MB);
  }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/ProcessXmxProvider.java`
#### Snippet
```java
  @Nullable
  private Integer logIncreasedXmx(@Nullable Integer xmx) {
    if (xmx == null) return null;
    if (myPrev != null && xmx > myPrev) {
      info("There is not enough memory (attempted -Xmx" + myPrev + "M), will use increased -Xmx=" + xmx + "M");
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/ProcessXmxProvider.java`
#### Snippet
```java

    } else if (isExplicitXmxProvided() || isXmxIncreaseDisabled() || myIsLimitReached) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitTrustStoreProviderStatic.java`
#### Snippet
```java
  @Override
  public File getTrustedCertificatesDir() {
    return myTrustedCertificatesDir == null ? null : new File(myTrustedCertificatesDir);
  }
}
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitTrustStoreProviderStatic.java`
#### Snippet
```java
  public KeyStore getTrustStore() {
    if (myTrustedCertificatesDir == null) {
      return null;
    } else {
      return TrustStoreIO.readTrustStoreFromDirectory(myTrustedCertificatesDir);
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/ModificationDataRevWalk.java`
#### Snippet
```java
      throws IOException {
      if (mySearchDepth == 0)
        return null;

      try (RevWalk revWalk = new RevWalk(getRepository())) {
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitLabelingSupport.java`
#### Snippet
```java
    ObjectId tagId = tagRef.getObjectId();
    if (tagId == null)
      return null;
    RevWalk walk = new RevWalk(r);
    try {
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitLabelingSupport.java`
#### Snippet
```java
      return walk.parseTag(tagId);
    } catch (Exception e) {
      return null;
    } finally {
      walk.close();
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitLabelingSupport.java`
#### Snippet
```java
      return r.resolve(tagRef.getName());
    } catch (IOException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/VcsPropertiesProcessor.java`
#### Snippet
```java
  public InvalidProperty validateBranchSpec(@Nullable String branchSpec) {
    if (isEmpty(branchSpec))
      return null;

    assert branchSpec != null;
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/VcsPropertiesProcessor.java`
#### Snippet
```java
      i++;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/AutoCloseRepositoryCache.java`
#### Snippet
```java
      return result;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitAbstractVcsFileContentProvider.java`
#### Snippet
```java
    String version = m.getVersion();
    if (!isValid(version))
      return null;
    OperationContext context = myVcs.createContext(root, "compute parent revision of " + version);
    try {
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitAbstractVcsFileContentProvider.java`
#### Snippet
```java
      RevCommit c = myVcs.getCommitLoader().loadCommit(context, gitRoot, version);
      if (c.getParents().length == 0)
        return null;
      return c.getParent(0).name();
    } catch (Exception e) {
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/WellKnownHostingsUtil.java`
#### Snippet
```java
  public static VcsHostingRepo getGitHubRepo(@NotNull URIish uri) {
    if (!"github.com".equals(uri.getHost()))
      return null;

    return ownerProjectStyleRepo("https://github.com/", uri);
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/WellKnownHostingsUtil.java`
#### Snippet
```java
    String host = uri.getHost();
    if (host == null)
      return null;

    final int idx = host.indexOf(".visualstudio.com");
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/WellKnownHostingsUtil.java`
#### Snippet
```java
    final int idx = host.indexOf(".visualstudio.com");
    if (idx <= 0)
      return null;

    String owner = host.substring(0, idx);
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/WellKnownHostingsUtil.java`
#### Snippet
```java
    String path = uri.getPath();
    if (path == null)
      return null;

    int gitPrefixIdx = path.indexOf("_git/");
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/WellKnownHostingsUtil.java`
#### Snippet
```java

    int gitPrefixIdx = path.indexOf("_git/");
    if (gitPrefixIdx == -1) return null;

    String repoName = path.substring(gitPrefixIdx + "_git/".length());
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/WellKnownHostingsUtil.java`
#### Snippet
```java
    String path = uri.getPath();
    if (path == null)
      return null;
    if (path.startsWith("/"))
      path = path.substring(1);
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/WellKnownHostingsUtil.java`
#### Snippet
```java
    int idx = path.indexOf("/");
    if (idx <= 0)
      return null;
    String owner = path.substring(0, idx);
    String repo = path.substring(idx + 1);
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/WellKnownHostingsUtil.java`
#### Snippet
```java
  public static VcsHostingRepo getGitlabRepo(@NotNull URIish uri) {
    if (!"gitlab.com".equals(uri.getHost()))
      return null;

    return ownerProjectStyleRepo("https://gitlab.com/", uri);
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/WellKnownHostingsUtil.java`
#### Snippet
```java
    String host = uri.getHost();
    if (host == null)
      return null;

    String path = uri.getPath();
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/WellKnownHostingsUtil.java`
#### Snippet
```java
      String ownerAndRepo = path.substring(5); // length of /scm/ or /git/
      int slashIdx = ownerAndRepo.indexOf('/');
      if (slashIdx == -1) return null;
      String owner = ownerAndRepo.substring(0, slashIdx);
      String repo = ownerAndRepo.substring(slashIdx+1, ownerAndRepo.length() - ".git".length());
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/WellKnownHostingsUtil.java`
#### Snippet
```java
      String owner = ownerAndRepo.substring(0, slashIdx);
      String repo = ownerAndRepo.substring(slashIdx+1, ownerAndRepo.length() - ".git".length());
      if (repo.contains("/")) return null;

      boolean personalRepo = '~' == owner.charAt(0);
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/WellKnownHostingsUtil.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/WellKnownHostingsUtil.java`
#### Snippet
```java
  public static VcsHostingRepo getBitbucketRepo(@NotNull URIish uri) {
    if (!"bitbucket.org".equals(uri.getHost()))
      return null;

    return ownerProjectStyleRepo("https://bitbucket.org/", uri);
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/URIishHelperImpl.java`
#### Snippet
```java
      //ignore
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/FetchCommandImpl.java`
#### Snippet
```java
  private File getTeamCityPrivateKey(@NotNull AuthSettings authSettings) throws VcsException {
    if (authSettings.getAuthMethod() != AuthenticationMethod.TEAMCITY_SSH_KEY)
      return null;

    String keyId = authSettings.getTeamCitySshKeyId();
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/FetchCommandImpl.java`
#### Snippet
```java
    String keyId = authSettings.getTeamCitySshKeyId();
    if (keyId == null)
      return null;

    VcsRoot root = authSettings.getRoot();
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/FetchCommandImpl.java`
#### Snippet
```java
    VcsRoot root = authSettings.getRoot();
    if (root == null)
      return null;

    TeamCitySshKey privateKey = mySshKeyManager.getKey(root);
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/FetchCommandImpl.java`
#### Snippet
```java
    TeamCitySshKey privateKey = mySshKeyManager.getKey(root);
    if (privateKey == null)
      return null;

    try {
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
  public static Long convertMemorySizeToBytes(@Nullable String memory) {
    if (memory == null)
      return null;
    memory = memory.trim();
    if (memory.isEmpty())
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
    memory = memory.trim();
    if (memory.isEmpty())
      return null;
    int unit = memory.charAt(memory.length() - 1);
    long amount;
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
      amount = Long.parseLong(memory.substring(0, memory.length() - 1));
    } catch (NumberFormatException e) {
      return null;
    }
    switch (unit) {
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
        return amount * GB;
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
      return msg.substring("Remote does not have".length(), msg.indexOf("available for fetch.")).trim();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
      Class.forName("com.sun.management.OperatingSystemMXBean");
    } catch (ClassNotFoundException e) {
      return null;
    }
    OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitServerUtil.java`
#### Snippet
```java
      return ((com.sun.management.OperatingSystemMXBean) osBean).getFreePhysicalMemorySize();
    }
    return null;

  }
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitVcsSupport.java`
#### Snippet
```java
  public String getDefaultBranchName(@NotNull VcsRoot vcsRoot) {
    final String prop = vcsRoot.getProperty(Constants.BRANCH_NAME);
    return prop == null ? null : GitUtils.expandRef(prop);
  }
}
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitVcsSupport.java`
#### Snippet
```java
  @Override
  public UrlSupport getUrlSupport() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/VcsChangeTreeWalk.java`
#### Snippet
```java
    VcsChange.Type type = getChangeType(gitChangeType, path);
    if (type == VcsChange.Type.NOT_CHANGED) {
      return null;
    } else {
      String description = gitChangeType == ChangeType.FILE_MODE_CHANGED ? "File mode changed" : null;
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/Cleanup.java`
#### Snippet
```java
        }
        public Integer getMaxAcceptedOutputSize() {
          return null;
        }
        @Override
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitUrlSupport.java`
#### Snippet
```java
    String scmName = getMavenScmName(url);
    if (scmName != null && !"git".equals(scmName) && !"ssh".equals(scmName)) //some other scm provider
      return null;

    String fetchUrl = getFetchUrl(url);
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitUrlSupport.java`
#### Snippet
```java
      // probably not git
      Loggers.VCS.infoAndDebugDetails("Failed to recognize " + url.getUrl() + " as a git repository", e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitUrlSupport.java`
#### Snippet
```java
  @Nullable
  private synchronized ServerSshKeyManager getSshKeyManager() {
    if (myExtensionsProvider == null) return null;
    Collection<ServerSshKeyManager> managers = myExtensionsProvider.getExtensions(ServerSshKeyManager.class);
    if (managers.isEmpty())
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitUrlSupport.java`
#### Snippet
```java
    Collection<ServerSshKeyManager> managers = myExtensionsProvider.getExtensions(ServerSshKeyManager.class);
    if (managers.isEmpty())
      return null;
    return managers.iterator().next();
  }
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/GitUrlSupport.java`
#### Snippet
```java
    MavenVcsUrl mavenUrl = url.asMavenVcsUrl();
    if (mavenUrl == null)
      return null;
    return mavenUrl.getProviderSchema();
  }
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/TransportFactoryImpl.java`
#### Snippet
```java
      return "TeamCity Server " + version.getDisplayVersion();
    } catch (Exception e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchBuilderDispatcher.java`
#### Snippet
```java
  private String getUploadedKey() {
    if (myGitRoot.getAuthSettings().getAuthMethod() != AuthenticationMethod.TEAMCITY_SSH_KEY)
      return null;
    TeamCitySshKey key = mySshKeyManager.getKey(myGitRoot.getOriginalRoot());
    if (key == null)
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchBuilderDispatcher.java`
#### Snippet
```java
    TeamCitySshKey key = mySshKeyManager.getKey(myGitRoot.getOriginalRoot());
    if (key == null)
      return null;
    return new String(key.getPrivateKey());
  }
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/ContextImpl.java`
#### Snippet
```java
  @Override
  public String getSshMacType() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/ContextImpl.java`
#### Snippet
```java
  @Override
  public String getInterruptionReason() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/ContextImpl.java`
#### Snippet
```java
  @Override
  public String getSshRequestToken() {
    if (myRoot == null) return null;
    if (TeamCityProperties.getBoolean("teamcity.git.sendSshSendEnvRequestToken")) {
      final String token = myRoot.getProperty("sshSendEnvRequestToken");
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/ContextImpl.java`
#### Snippet
```java
    if (TeamCityProperties.getBoolean("teamcity.git.sendSshSendEnvRequestToken")) {
      final String token = myRoot.getProperty("sshSendEnvRequestToken");
      if (token == null) return null;
      return token.contains("%") ? null : token;
    }
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/ContextImpl.java`
#### Snippet
```java
      final String token = myRoot.getProperty("sshSendEnvRequestToken");
      if (token == null) return null;
      return token.contains("%") ? null : token;
    }
    return null;
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/ContextImpl.java`
#### Snippet
```java
      return token.contains("%") ? null : token;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/ContextImpl.java`
#### Snippet
```java
  public Charset getCharset() {
    final String charsetName = myConfig.getGitOutputCharsetName();
    if (charsetName == null) return null;
    try {
      return Charset.forName(charsetName);
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/github/GitHubListFilesSupport.java`
#### Snippet
```java
  private String getDirectChildName(@NotNull String parentDir, @NotNull String path) {
    if (!isUnder(parentDir, path))
      return null;
    if (parentDir.equals("") && !path.contains("/"))
      return path;
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/github/GitHubListFilesSupport.java`
#### Snippet
```java
    String subPath = parentDir.endsWith("/") ? path.substring(parentDir.length()) : path.substring(parentDir.length() + 1);
    if (subPath.contains("/"))
      return null;
    return subPath;
  }
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/commitInfo/DotGitModulesResolverImpl.java`
#### Snippet
```java
    } catch (ConfigInvalidException e) {
      LOG.info("Invalid submodule config: " + e.getMessage(), e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/process/RepositoryXmxStorage.java`
#### Snippet
```java
  @Override
  public Integer read() {
    if (!myStorage.isFile()) return null;

    final Properties properties;
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/process/RepositoryXmxStorage.java`
#### Snippet
```java
    } catch (IOException e) {
      LOG.warn("Failed to read " + myProcessName + " -Xmx value from " + myStorage.getAbsolutePath(), e);
      return null;
    }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/process/RepositoryXmxStorage.java`
#### Snippet
```java

    final String value = properties.getProperty(getPropertyKey());
    if (value == null) return null;
    if (value.endsWith(SUFFIX)) {
      try {
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/process/RepositoryXmxStorage.java`
#### Snippet
```java
    }
    LOG.warn("Failed to parse " + myProcessName + " -Xmx value \"" + value + "\" from " + myStorage.getAbsolutePath());
    return null;
  }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/commitInfo/CommitTreeProcessor.java`
#### Snippet
```java
    } catch (IOException e) {
      LOG.info("Failed to process commit " + commit + ". " + e.getMessage(), e);
      return null;
    }

```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/commitInfo/CommitTreeProcessor.java`
#### Snippet
```java
    final SubmodulesConfig config = tree.getConfig();
    final Map<String, AnyObjectId> subStates = tree.getSubmoduleToPath();
    if (config == null || subStates.isEmpty()) return null;

    return new SubInfo() {
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchProcess.java`
#### Snippet
```java
    public TeamCitySshKey getKey(@NotNull VcsRoot root) {
      if (myKeyBytes == null)
        return null;
      return new TeamCitySshKey(""/*doesn't matter*/, myKeyBytes, false/*doesn't matter*/);
    }
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchProcess.java`
#### Snippet
```java
      String result = props.remove(Constants.PATCHER_UPLOADED_KEY);
      if (result == null)
        return null;
      try {
        return result.getBytes("UTF-8");
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/patch/GitPatchProcess.java`
#### Snippet
```java
        return result.getBytes("UTF-8");
      } catch (UnsupportedEncodingException e) {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmoduleResolverImpl.java`
#### Snippet
```java
    if (myConfig != null) {
      Submodule submodule = myConfig.findSubmodule(submodulePath);
      return submodule != null ? submodule.getUrl() : null;
    } else {
      return null;
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmoduleResolverImpl.java`
#### Snippet
```java
      return submodule != null ? submodule.getUrl() : null;
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmoduleAwareTreeIteratorFactory.java`
#### Snippet
```java
    assert w.first();
    if (w.eof()) {
      return null;
    }
    final int INITIAL_NAME_SIZE = 32;
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/submodules/SubmoduleAwareTreeIteratorFactory.java`
#### Snippet
```java
    w.back(actual);
    assert w.first();
    return reordered ? rc.toArray() : null;
  }
}
```

### ReturnNull
Return of `null`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/command/NativeGitCommands.java`
#### Snippet
```java
      }
    }
    return null; //never executes
  }

```

## RuleId[ruleID=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `v`
in `git-server/src/jetbrains/buildServer/buildTriggers/vcs/git/VcsChangeTreeWalk.java`
#### Snippet
```java
        groupedByCommonPrefix.compute(prefix, (k, v) -> {
          if (v == null) {
            v = new ArrayList<>();
          }
          v.add(finalFileName);
```

## RuleId[ruleID=BusyWait]
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

