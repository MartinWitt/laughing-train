# teamcity-bitbucket-issues 
 
# Bad smells
I found 7 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringBeanConstructorArgInspection | 3 | false |
| SpringXmlAutowireExplicitlyInspection | 2 | false |
| Deprecation | 2 | false |
## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'BitBucketIssueProviderType'#treeend

*** ** * ** ***

|--------------------------------------|---|-----------|
| **BitBucketIssueProviderType(...):** |   | **Bean:** |
| PluginDescriptor pluginDescriptor    |   | **???**   |
in `TeamCity.BitBucketIssues-server/src/main/resources/META-INF/build-server-plugin-TeamCity.BitBucketIssues.xml`
#### Snippet
```java
       default-autowire="constructor">

  <bean class="jetbrains.buildServer.issueTracker.bitbucket.BitBucketIssueProviderType"/>
  <bean class="jetbrains.buildServer.issueTracker.bitbucket.BitBucketIssueFetcher"/>
  <bean class="jetbrains.buildServer.issueTracker.bitbucket.BitBucketIssueProviderFactory"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'BitBucketIssueFetcher'#treeend

*** ** * ** ***

|---------------------------------------------|---|------------------------------|
| **BitBucketIssueFetcher(...):**             |   | **Bean:**                    |
| EhCacheUtil cacheUtil                       |   | **???**                      |
| IssueParser parser                          |   | Autowired: null(IssueParser) |
| SSLTrustStoreProvider sslTrustStoreProvider |   | **???**                      |
in `TeamCity.BitBucketIssues-server/src/main/resources/META-INF/build-server-plugin-TeamCity.BitBucketIssues.xml`
#### Snippet
```java

  <bean class="jetbrains.buildServer.issueTracker.bitbucket.BitBucketIssueProviderType"/>
  <bean class="jetbrains.buildServer.issueTracker.bitbucket.BitBucketIssueFetcher"/>
  <bean class="jetbrains.buildServer.issueTracker.bitbucket.BitBucketIssueProviderFactory"/>
  <bean class="jetbrains.buildServer.issueTracker.bitbucket.IssueParser"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'IssueTrackerSuggestion'#treeend

*** ** * ** ***

|---------------------------------------------|---|---------------------------------------------|
| **IssueTrackerSuggestion(...):**            |   | **Bean:**                                   |
| PluginDescriptor pluginDescriptor           |   | **???**                                     |
| PagePlaces pagePlaces                       |   | **???**                                     |
| IssueProvidersManager issueProvidersManager |   | **???**                                     |
| BitBucketIssueProviderType type             |   | Autowired: null(BitBucketIssueProviderType) |
in `TeamCity.BitBucketIssues-server/src/main/resources/META-INF/build-server-plugin-TeamCity.BitBucketIssues.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.issueTracker.bitbucket.BitBucketIssueProviderFactory"/>
  <bean class="jetbrains.buildServer.issueTracker.bitbucket.IssueParser"/>
  <bean class="jetbrains.buildServer.issueTracker.bitbucket.health.IssueTrackerSuggestion"/>

</beans>
```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `TeamCity.BitBucketIssues-server/fake-teamcity-server-plugin-context.xml`
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
in `TeamCity.BitBucketIssues-server/src/main/resources/META-INF/build-server-plugin-TeamCity.BitBucketIssues.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">

  <bean class="jetbrains.buildServer.issueTracker.bitbucket.BitBucketIssueProviderType"/>
```

## RuleId[id=Deprecation]
### Deprecation
'getHttpFile(java.lang.String, jetbrains.buildServer.http.SimpleCredentials, boolean, java.security.KeyStore)' is deprecated
in `TeamCity.BitBucketIssues-server/src/main/java/jetbrains/buildServer/issueTracker/bitbucket/BitBucketIssueFetcher.java`
#### Snippet
```java
        .retrieveCredentials(new BasicIssueFetcherAuthenticator(credentials));
      KeyStore trustStore = mySslTrustStoreProvider.getTrustStore();
      InputStream body = getHttpFile(issueURL, simpleCredentials, true, trustStore);
      return myParser.parse(IOUtils.toString(body, "UTF-8"));
    });
```

### Deprecation
'AbstractIssueFetcher(jetbrains.buildServer.util.cache.EhCacheUtil)' is deprecated
in `TeamCity.BitBucketIssues-server/src/main/java/jetbrains/buildServer/issueTracker/bitbucket/BitBucketIssueFetcher.java`
#### Snippet
```java
    @NotNull final SSLTrustStoreProvider sslTrustStoreProvider
  ) {
    super(cacheUtil);
    myParser = parser;
    mySslTrustStoreProvider = sslTrustStoreProvider;
```

