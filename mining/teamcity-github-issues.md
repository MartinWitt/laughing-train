# teamcity-github-issues 
 
# Bad smells
I found 15 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 4 | true |
| BoundedWildcard | 4 | false |
| StaticCallOnSubclass | 2 | false |
| RedundantFieldInitialization | 1 | false |
| RegExpSimplifiable | 1 | false |
| DoubleBraceInitialization | 1 | false |
| RegExpUnnecessaryNonCapturingGroup | 1 | false |
| RedundantSuppression | 1 | false |
## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `TeamCity.GitHubIssues-server/src/main/java/jetbrains/buildServer/issueTracker/github/auth/GitHubAuthenticator.java`
#### Snippet
```java
public class GitHubAuthenticator implements IssueFetcherAuthenticator {

  private Credentials myCredentials = null;

  public GitHubAuthenticator(@NotNull final Map<String, String> properties, SProject project, OAuthTokensStorage tokenStorage) {
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[s]` can be simplified to 's'
in `TeamCity.GitHubIssues-server/src/main/java/jetbrains/buildServer/issueTracker/github/health/IssueTrackerSuggestion.java`
#### Snippet
```java

  /* Matches github http and https urls of format https://github.com/owner/repo.git */
  private static final Pattern httpsPattern = Pattern.compile("http[s]?://github\\.com/(.*)/(.*)$");

  @NotNull
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `join()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `TeamCity.GitHubIssues-server/src/main/java/jetbrains/buildServer/issueTracker/github/health/PasswordAuthReport.java`
#### Snippet
```java

    private static String identity(String... parts) {
        return PasswordAuthReport.GITHUB_PASS_AUTH_CATEGORY.getId() + "_" + StringUtil.join(parts, "").hashCode();
    }
}
```

### StaticCallOnSubclass
Static method `isEmptyOrSpaces()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `TeamCity.GitHubIssues-server/src/main/java/jetbrains/buildServer/issueTracker/github/GitHubIssueProvider.java`
#### Snippet
```java
  private void patchPropertiesWithToken() {
    final String token = myProperties.get(PARAM_ACCESS_TOKEN);
    if (!StringUtil.isEmptyOrSpaces(token)) {
      if (token.startsWith(TOKEN_PREFIX_OAUTH)) {
        // oauth token
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `TeamCity.GitHubIssues-server/src/main/java/jetbrains/buildServer/issueTracker/github/GitHubIssueFetcher.java`
#### Snippet
```java
      if (myCredentials == null) {
        if (LOG.isDebugEnabled()) {
          LOG.debug("Connecting to " + myURL.toString() + "anonymously");
        }
      } else if (myCredentials instanceof TokenCredentials) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `TeamCity.GitHubIssues-server/src/main/java/jetbrains/buildServer/issueTracker/github/GitHubIssueFetcher.java`
#### Snippet
```java
        final String token = ((TokenCredentials) myCredentials).getToken();
        if (LOG.isDebugEnabled()) {
          LOG.debug("Connecting to " + myURL.toString() + "using token starting with [" + token.substring(0, Math.min(2, token.length())) + "]");
        }
        client.setOAuth2Token(token);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `TeamCity.GitHubIssues-server/src/main/java/jetbrains/buildServer/issueTracker/github/GitHubIssueFetcher.java`
#### Snippet
```java
        UsernamePasswordCredentials cr = (UsernamePasswordCredentials) myCredentials;
        if (LOG.isDebugEnabled()) {
          LOG.debug("Connecting to " + myURL.toString() + "using username + [" + cr.getUserName() + "] and password");
        }
        client.setCredentials(cr.getUserName(), cr.getPassword());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `TeamCity.GitHubIssues-server/src/main/java/jetbrains/buildServer/issueTracker/github/GitHubIssueFetcher.java`
#### Snippet
```java
      final Matcher m = GitHubConstants.OWNER_AND_REPO_PATTERN.matcher(url.getPath());
      if (!m.matches()) {
        throw new IllegalArgumentException("URL + [" + url.toString() + "] does not contain owner and repository info");
      }
      return getFromCacheOrFetch(issueURL, new MyFetchFunction(url, m.group(1), m.group(2), issueId, credentials,
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `TeamCity.GitHubIssues-server/src/main/java/jetbrains/buildServer/issueTracker/github/GitHubIssueProviderType.java`
#### Snippet
```java
  @Override
  public Map<String, String> getDefaultProperties() {
    return new HashMap<String, String>() {{
      put(PARAM_AUTH_TYPE, AUTH_ANONYMOUS);
      put(PARAM_PATTERN, DEFAULT_ISSUE_PATTERN);
```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\\.git)`
in `TeamCity.GitHubIssues-server/src/main/java/jetbrains/buildServer/issueTracker/github/health/IssueTrackerSuggestion.java`
#### Snippet
```java

  /* Matches github ssh urls of format git@github.com:owner/repo.git */
  private static final Pattern sshPattern = Pattern.compile("git@github\\.com:(.+)/(.+)(?:\\.git)");

  /* Matches github http and https urls of format https://github.com/owner/repo.git */
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends SBuildType`
in `TeamCity.GitHubIssues-server/src/main/java/jetbrains/buildServer/issueTracker/github/health/IssueTrackerSuggestion.java`
#### Snippet
```java
  }

  private Set<String> getPathsFromVcsRoots(@NotNull final List<SBuildType> buildTypes) {
    return extractFetchUrls(buildTypes.stream().map(BuildTypeSettings::getVcsRoots));
  }
```

### BoundedWildcard
Can generalize to `? extends List`
in `TeamCity.GitHubIssues-server/src/main/java/jetbrains/buildServer/issueTracker/github/health/IssueTrackerSuggestion.java`
#### Snippet
```java
  }

  private Set<String> extractFetchUrls(@NotNull final Stream<List<? extends VcsRoot>> stream) {
    return stream.flatMap(List::stream)
                 .filter(it -> GIT_VCS_NAME.equals(it.getVcsName()))
```

### BoundedWildcard
Can generalize to `? extends SBuildType`
in `TeamCity.GitHubIssues-server/src/main/java/jetbrains/buildServer/issueTracker/github/health/IssueTrackerSuggestion.java`
#### Snippet
```java
  }

  private Set<String> getPathsFromInstances(@NotNull final List<SBuildType> buildTypes) {
    return extractFetchUrls(buildTypes.stream().map(SBuildType::getVcsRootInstances));
  }
```

### BoundedWildcard
Can generalize to `? super InvalidProperty`
in `TeamCity.GitHubIssues-server/src/main/java/jetbrains/buildServer/issueTracker/github/GitHubIssueProvider.java`
#### Snippet
```java


    private boolean checkNotEmptyParam(@NotNull final Collection<InvalidProperty> invalid,
                                       @NotNull final Map<String, String> map,
                                       @NotNull final String propertyName,
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `TeamCity.GitHubIssues-server/src/main/java/jetbrains/buildServer/issueTracker/github/GitHubIssueProvider.java`
#### Snippet
```java
        try {
          String patternString = map.get(PARAM_PATTERN);
          //noinspection ResultOfMethodCallIgnored
          Pattern.compile(patternString);
        } catch (PatternSyntaxException e) {
```

