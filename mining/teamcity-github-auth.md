# teamcity-github-auth 
 
# Bad smells
I found 5 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringBeanConstructorArgInspection | 4 | false |
| SpringXmlAutowireExplicitlyInspection | 1 | false |
## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'LoginViaGitHubOAuthPageExtension'#treeend

*** ** * ** ***

|--------------------------------------------|---|------------------------------|
| **LoginViaGitHubOAuthPageExtension(...):** |   | **Bean:**                    |
| PagePlaces pagePlaces                      |   | **???**                      |
| PluginDescriptor pluginDescriptor          |   | **???**                      |
| GitHubOAuth gitHubOAuth                    |   | Autowired: null(GitHubOAuth) |
in `src/main/resources/META-INF/build-server-plugin-github-auth.xml`
#### Snippet
```java
       default-autowire="constructor">

    <bean class="org.jetbrains.teamcity.githubauth.LoginViaGitHubOAuthPageExtension"/>
    <bean class="org.jetbrains.teamcity.githubauth.GitHubOAuth"/>
    <bean class="org.jetbrains.teamcity.githubauth.GitHubOAuthLoginController"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitHubOAuthLoginController'#treeend

*** ** * ** ***

|-------------------------------------------|---|------------------------------|
| **GitHubOAuthLoginController(...):**      |   | **Bean:**                    |
| WebControllerManager webControllerManager |   | **???**                      |
| AuthorizationInterceptor authInterceptor  |   | **???**                      |
| GitHubOAuth gitHubOAuth                   |   | Autowired: null(GitHubOAuth) |
in `src/main/resources/META-INF/build-server-plugin-github-auth.xml`
#### Snippet
```java
    <bean class="org.jetbrains.teamcity.githubauth.LoginViaGitHubOAuthPageExtension"/>
    <bean class="org.jetbrains.teamcity.githubauth.GitHubOAuth"/>
    <bean class="org.jetbrains.teamcity.githubauth.GitHubOAuthLoginController"/>
    <bean class="org.jetbrains.teamcity.githubauth.GitHubOAuthClient"/>
    <bean class="org.jetbrains.teamcity.githubauth.GitHubAuthSettingsController"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GitHubAuthSettingsController'#treeend

*** ** * ** ***

|-------------------------------------------|---|------------------------------|
| **GitHubAuthSettingsController(...):**    |   | **Bean:**                    |
| PluginDescriptor pluginDescriptor         |   | **???**                      |
| WebControllerManager webControllerManager |   | **???**                      |
| GitHubOAuth gitHubOAuth                   |   | Autowired: null(GitHubOAuth) |
in `src/main/resources/META-INF/build-server-plugin-github-auth.xml`
#### Snippet
```java
    <bean class="org.jetbrains.teamcity.githubauth.GitHubOAuthLoginController"/>
    <bean class="org.jetbrains.teamcity.githubauth.GitHubOAuthClient"/>
    <bean class="org.jetbrains.teamcity.githubauth.GitHubAuthSettingsController"/>
    <bean class="org.jetbrains.teamcity.githubauth.TeamCityCoreFacade"/>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'TeamCityCoreFacade'#treeend

*** ** * ** ***

|-------------------------------------------------|---|-----------|
| **TeamCityCoreFacade(...):**                    |   | **Bean:** |
| UserModel myUserModel                           |   | **???**   |
| LoginConfiguration loginConfiguration           |   | **???**   |
| ServerSettings serverSettings                   |   | **???**   |
| ProjectManager projectManager                   |   | **???**   |
| OAuthConnectionsManager oAuthConnectionsManager |   | **???**   |
| OAuthTokensStorage oAuthTokensStorage           |   | **???**   |
in `src/main/resources/META-INF/build-server-plugin-github-auth.xml`
#### Snippet
```java
    <bean class="org.jetbrains.teamcity.githubauth.GitHubOAuthClient"/>
    <bean class="org.jetbrains.teamcity.githubauth.GitHubAuthSettingsController"/>
    <bean class="org.jetbrains.teamcity.githubauth.TeamCityCoreFacade"/>

    <bean id="gitHubRestTemplate" class="org.springframework.web.client.RestTemplate">
```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `src/main/resources/META-INF/build-server-plugin-github-auth.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd"
       default-autowire="constructor">

    <bean class="org.jetbrains.teamcity.githubauth.LoginViaGitHubOAuthPageExtension"/>
```

