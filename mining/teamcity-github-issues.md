# teamcity-github-issues 
 
# Bad smells
I found 14 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringBeanConstructorArgInspection | 5 | false |
| UnnecessaryToStringCall | 4 | true |
| SpringXmlAutowireExplicitlyInspection | 2 | false |
| RegExpSimplifiable | 1 | false |
| Deprecation | 1 | false |
| RegExpUnnecessaryNonCapturingGroup | 1 | false |
## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitHubIssueProviderType'#treeend

*** ** * ** ***

|-----------------------------------|---|-----------|
| **GitHubIssueProviderType(...):** |   | **Bean:** |
| PluginDescriptor pluginDescriptor |   | **???**   |
in `TeamCity.GitHubIssues-server/src/main/resources/META-INF/build-server-plugin-TeamCity.GitHubIssues.xml`
#### Snippet
```java
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <bean class="jetbrains.buildServer.issueTracker.github.GitHubIssueProviderType"/>
  <bean class="jetbrains.buildServer.issueTracker.github.GitHubIssueFetcher"/>
  <bean class="jetbrains.buildServer.issueTracker.github.GitHubIssueProviderFactory"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitHubIssueFetcher'#treeend

*** ** * ** ***

|---------------------------------------------|---|-----------|
| **GitHubIssueFetcher(...):**                |   | **Bean:** |
| EhCacheUtil cacheUtil                       |   | **???**   |
| SSLTrustStoreProvider sslTrustStoreProvider |   | **???**   |
in `TeamCity.GitHubIssues-server/src/main/resources/META-INF/build-server-plugin-TeamCity.GitHubIssues.xml`
#### Snippet
```java
       default-autowire="constructor">
  <bean class="jetbrains.buildServer.issueTracker.github.GitHubIssueProviderType"/>
  <bean class="jetbrains.buildServer.issueTracker.github.GitHubIssueFetcher"/>
  <bean class="jetbrains.buildServer.issueTracker.github.GitHubIssueProviderFactory"/>
  <bean class="jetbrains.buildServer.issueTracker.github.health.IssueTrackerSuggestion"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitHubIssueProviderFactory'#treeend

*** ** * ** ***

|--------------------------------------|---|------------------------------------------|
| **GitHubIssueProviderFactory(...):** |   | **Bean:**                                |
| IssueProviderType type               |   | Autowired: null(GitHubIssueProviderType) |
| IssueFetcher fetcher                 |   | Autowired: null(GitHubIssueFetcher)      |
| OAuthTokensStorage storage           |   | **???**                                  |
| UserModel userModel                  |   | **???**                                  |
in `TeamCity.GitHubIssues-server/src/main/resources/META-INF/build-server-plugin-TeamCity.GitHubIssues.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.issueTracker.github.GitHubIssueProviderType"/>
  <bean class="jetbrains.buildServer.issueTracker.github.GitHubIssueFetcher"/>
  <bean class="jetbrains.buildServer.issueTracker.github.GitHubIssueProviderFactory"/>
  <bean class="jetbrains.buildServer.issueTracker.github.health.IssueTrackerSuggestion"/>
  <bean class="jetbrains.buildServer.issueTracker.github.health.PasswordAuthReport"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'IssueTrackerSuggestion'#treeend

*** ** * ** ***

|---------------------------------------------|---|-------------------------------------|
| **IssueTrackerSuggestion(...):**            |   | **Bean:**                           |
| PluginDescriptor descriptor                 |   | **???**                             |
| PagePlaces pagePlaces                       |   | **???**                             |
| IssueProvidersManager issueProvidersManager |   | **???**                             |
| HealthReportHelper helper                   |   | Autowired: null(HealthReportHelper) |
in `TeamCity.GitHubIssues-server/src/main/resources/META-INF/build-server-plugin-TeamCity.GitHubIssues.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.issueTracker.github.GitHubIssueFetcher"/>
  <bean class="jetbrains.buildServer.issueTracker.github.GitHubIssueProviderFactory"/>
  <bean class="jetbrains.buildServer.issueTracker.github.health.IssueTrackerSuggestion"/>
  <bean class="jetbrains.buildServer.issueTracker.github.health.PasswordAuthReport"/>
  <bean class="jetbrains.buildServer.issueTracker.github.health.HealthReportHelper"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'PasswordAuthReport'#treeend

*** ** * ** ***

|---------------------------------------------|---|-----------|
| **PasswordAuthReport(...):**                |   | **Bean:** |
| IssueProvidersManager issueProvidersManager |   | **???**   |
| PluginDescriptor pluginDescriptor           |   | **???**   |
| PagePlaces pagePlaces                       |   | **???**   |
in `TeamCity.GitHubIssues-server/src/main/resources/META-INF/build-server-plugin-TeamCity.GitHubIssues.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.issueTracker.github.GitHubIssueProviderFactory"/>
  <bean class="jetbrains.buildServer.issueTracker.github.health.IssueTrackerSuggestion"/>
  <bean class="jetbrains.buildServer.issueTracker.github.health.PasswordAuthReport"/>
  <bean class="jetbrains.buildServer.issueTracker.github.health.HealthReportHelper"/>
</beans>
```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `TeamCity.GitHubIssues-server/fake-teamcity-server-plugin-context.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <!-- this is a fake spring context xml to make IntelliJ IDEA know all implicit beans that are available for plugin -->
  <bean class="jetbrains.buildServer.web.openapi.PluginDescriptor"/>
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `TeamCity.GitHubIssues-server/src/main/resources/META-INF/build-server-plugin-TeamCity.GitHubIssues.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <bean class="jetbrains.buildServer.issueTracker.github.GitHubIssueProviderType"/>
  <bean class="jetbrains.buildServer.issueTracker.github.GitHubIssueFetcher"/>
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

## RuleId[id=Deprecation]
### Deprecation
'AbstractIssueFetcher(jetbrains.buildServer.util.cache.EhCacheUtil)' is deprecated
in `TeamCity.GitHubIssues-server/src/main/java/jetbrains/buildServer/issueTracker/github/GitHubIssueFetcher.java`
#### Snippet
```java
  public GitHubIssueFetcher(@NotNull EhCacheUtil cacheUtil,
                            @NotNull final SSLTrustStoreProvider sslTrustStoreProvider) {
    super(cacheUtil);
    mySslTrustStoreProvider = sslTrustStoreProvider;
  }
```

## RuleId[id=UnnecessaryToStringCall]
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

