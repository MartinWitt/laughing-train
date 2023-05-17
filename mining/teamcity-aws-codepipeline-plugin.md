# teamcity-aws-codepipeline-plugin 
 
# Bad smells
I found 6 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringBeanConstructorArgInspection | 3 | false |
| SpringXmlAutowireExplicitlyInspection | 2 | false |
| DataFlowIssue | 1 | false |
## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'CodePipelineAsyncPolledBuildTrigger'#treeend

*** ** * ** ***

|-----------------------------------------------|---|-----------|
| **CodePipelineAsyncPolledBuildTrigger(...):** |   | **Bean:** |
| BuildCustomizerFactory buildCustomizerFactory |   | **???**   |
in `aws-codepipeline-server/src/main/resources/META-INF/build-server-plugin-aws-codepipeline-plugin.xml`
#### Snippet
```java
       default-autowire="constructor">

    <bean id="codePipelineAsyncPolledBuildTrigger" class="jetbrains.buildServer.buildTriggers.codepipeline.CodePipelineAsyncPolledBuildTrigger"/>
    <bean id="codePipelineBuildTriggerService" class="jetbrains.buildServer.buildTriggers.codepipeline.CodePipelineBuildTriggerService"/>
</beans>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'CodePipelineBuildListener'#treeend

*** ** * ** ***

|-----------------------------------------------------------|---|-----------|
| **CodePipelineBuildListener(...):**                       |   | **Bean:** |
| EventDispatcher\<AgentLifeCycleListener\> agentDispatcher |   | **???**   |
in `aws-codepipeline-agent/src/main/resources/META-INF/build-agent-plugin-aws-codepipeline-plugin.xml`
#### Snippet
```java
       default-autowire="constructor">

    <bean class="jetbrains.buildServer.codepipeline.CodePipelineBuildListener"/>
</beans>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'CodePipelineBuildTriggerService'#treeend

*** ** * ** ***

|-----------------------------------------------|---|-------------------------------------------------------------------------------------|
| **CodePipelineBuildTriggerService(...):**     |   | **Bean:**                                                                           |
| PluginDescriptor pluginDescriptor             |   | **???**                                                                             |
| ServerSettings serverSettings                 |   | **???**                                                                             |
| CodePipelineAsyncPolledBuildTrigger trigger   |   | Autowired: codePipelineAsyncPolledBuildTrigger(CodePipelineAsyncPolledBuildTrigger) |
| AsyncPolledBuildTriggerFactory triggerFactory |   | **???**                                                                             |
in `aws-codepipeline-server/src/main/resources/META-INF/build-server-plugin-aws-codepipeline-plugin.xml`
#### Snippet
```java

    <bean id="codePipelineAsyncPolledBuildTrigger" class="jetbrains.buildServer.buildTriggers.codepipeline.CodePipelineAsyncPolledBuildTrigger"/>
    <bean id="codePipelineBuildTriggerService" class="jetbrains.buildServer.buildTriggers.codepipeline.CodePipelineBuildTriggerService"/>
</beans>

```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `aws-codepipeline-server/src/main/resources/META-INF/build-server-plugin-aws-codepipeline-plugin.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">

    <bean id="codePipelineAsyncPolledBuildTrigger" class="jetbrains.buildServer.buildTriggers.codepipeline.CodePipelineAsyncPolledBuildTrigger"/>
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `aws-codepipeline-agent/src/main/resources/META-INF/build-agent-plugin-aws-codepipeline-plugin.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd"
       default-autowire="constructor">

    <bean class="jetbrains.buildServer.codepipeline.CodePipelineBuildListener"/>
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

