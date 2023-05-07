# teamcity-environment-fetcher 
 
# Bad smells
I found 6 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringXmlModelInspection | 5 | false |
| SpringXmlAutowireExplicitlyInspection | 1 | false |
## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `environment-fetcher-agent/resources/META-INF/build-agent-plugin-environment-fetcher.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <bean name="EnvironmentFetcherService" class="jetbrains.buildserver.environmentFetcher.agent.EnvironmentFetcherService"/>
</beans>
```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `environment-fetcher-agent/resources/META-INF/build-agent-plugin-environment-fetcher.xml`
#### Snippet
```java
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <bean name="EnvironmentFetcherService" class="jetbrains.buildserver.environmentFetcher.agent.EnvironmentFetcherService"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'buildserver'
in `environment-fetcher-agent/resources/META-INF/build-agent-plugin-environment-fetcher.xml`
#### Snippet
```java
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <bean name="EnvironmentFetcherService" class="jetbrains.buildserver.environmentFetcher.agent.EnvironmentFetcherService"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'environmentFetcher'
in `environment-fetcher-agent/resources/META-INF/build-agent-plugin-environment-fetcher.xml`
#### Snippet
```java
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <bean name="EnvironmentFetcherService" class="jetbrains.buildserver.environmentFetcher.agent.EnvironmentFetcherService"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'agent'
in `environment-fetcher-agent/resources/META-INF/build-agent-plugin-environment-fetcher.xml`
#### Snippet
```java
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <bean name="EnvironmentFetcherService" class="jetbrains.buildserver.environmentFetcher.agent.EnvironmentFetcherService"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class 'EnvironmentFetcherService'
in `environment-fetcher-agent/resources/META-INF/build-agent-plugin-environment-fetcher.xml`
#### Snippet
```java
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <bean name="EnvironmentFetcherService" class="jetbrains.buildserver.environmentFetcher.agent.EnvironmentFetcherService"/>
</beans>

```

